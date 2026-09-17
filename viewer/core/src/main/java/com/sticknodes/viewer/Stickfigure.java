package com.sticknodes.viewer;

import com.badlogic.gdx.graphics.Color;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Stickfigure {
    private float scale = 1.0f;
    private final Color color = new Color(Color.BLACK);
    private StickNode mainNode;
    private final ArrayList<StickNode> drawOrderedNodeRefs = new ArrayList<>();

    public final List<Object> POLYFILLS = new ArrayList<>();
    public final List<Object> CONNECTORS = new ArrayList<>();
    public final List<Object> JOINS = new ArrayList<>();

    public Stickfigure() {
        this.mainNode = new StickNode(this, null);
    }

    public float getScale() { return scale; }
    public Color getColor() { return color; }
    public StickNode getMainNode() { return mainNode; }
    public ArrayList<StickNode> getDrawOrderedNodeRefs() { return drawOrderedNodeRefs; }

    public static Stickfigure from_bytes(byte[] bytes) throws IOException {
        DataInputStream in = new DataInputStream(new java.io.ByteArrayInputStream(bytes));
        Stickfigure fig = new Stickfigure();
        fig.readData(in);
        return fig;
    }

    public byte[] to_bytes() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(baos);
        out.writeInt(425);
        out.writeFloat(scale);
        out.writeInt(Color.rgba8888(color));
        if (mainNode != null) {
            mainNode.writeData(out);
        }
        return baos.toByteArray();
    }

    public void readData(DataInputStream in) throws IOException {
        int version = in.readInt();
        int build = 1;
        if (version < 403) {
            build = in.readInt();
        }
        System.out.println("Opening stickfigure made with version " + version + ", build " + build);

        if (version >= 0 && version <= 425) {
            this.scale = in.readFloat();
            int c = in.readInt();
            float r = (c & 0xFF) / 255.0f;
            float g = ((c >> 8) & 0xFF) / 255.0f;
            float b = ((c >> 16) & 0xFF) / 255.0f;
            this.color.set(r, g, b, 1.0f);

            this.mainNode = new StickNode(this, null);
            this.mainNode.readData(version, build, in);

            drawOrderedNodeRefs.clear();
            collectDrawOrder(mainNode);

            if (version >= 230) {
                int polyfillCount = in.readInt();
                for (int i = 0; i < polyfillCount; i++) {
                    int nodeIdx = in.readInt();
                    POLYFILLS.add(nodeIdx);
                }
            }

            if (build >= 38) {
                int connectorCount = in.readInt();
                for (int i = 0; i < connectorCount; i++) {
                    int startIdx = in.readInt();
                    int endIdx = in.readInt();
                    CONNECTORS.add(new int[]{startIdx, endIdx});
                }
            }

            updateTransforms(0, 0);
        } else {
            throw new IllegalStateException("Stickfigure version is out of bounds: " + version);
        }
    }

    public void drawLimbs(SNShapeRenderer renderer, Object batch, Object filterBundle, float x, float y, float scale, boolean isSelected, StickNode selectedNode, boolean isCulled, boolean isAA) {
        if (mainNode == null) return;

        if (isAA) {
            renderNodeAARecursive(renderer, mainNode, x, y, scale);
        } else if (isCulled) {
            renderNodeCulledRecursive(renderer, mainNode, x, y, scale);
        } else {
            renderNodeRecursive(renderer, mainNode, x, y, scale);
        }
    }

    private void renderNodeRecursive(SNShapeRenderer renderer, StickNode node, float x, float y, float scale) {
        node.drawLimb(renderer, x, y, scale, false);
        for (StickNode child : node.getChildrenNodes()) {
            renderNodeRecursive(renderer, child, x, y, scale);
        }
    }

    private void renderNodeCulledRecursive(SNShapeRenderer renderer, StickNode node, float x, float y, float scale) {
        node.drawLimbCulled(renderer, x, y, scale);
        for (StickNode child : node.getChildrenNodes()) {
            renderNodeCulledRecursive(renderer, child, x, y, scale);
        }
    }

    private void renderNodeAARecursive(SNShapeRenderer renderer, StickNode node, float x, float y, float scale) {
        node.drawLimbAA(renderer, x, y, scale);
        for (StickNode child : node.getChildrenNodes()) {
            renderNodeAARecursive(renderer, child, x, y, scale);
        }
    }

    public void renderStickfigure(SNShapeRenderer renderer, float x, float y, float scale) {
        drawLimbs(renderer, null, null, x, y, scale, false, null, false, false);
    }

    public void applyFilters() {}

    public void addRootNode() {
        this.mainNode = new StickNode(this, null);
    }

    public StickNode addNode(StickNode parent) {
        return new StickNode(this, parent);
    }

    public void addPolyfill(Object poly) { POLYFILLS.add(poly); }
    public void addConnector(Object conn) { CONNECTORS.add(conn); }

    public ArrayList<StickNode> getChildren(StickNode parent) {
        return parent != null ? parent.getChildrenNodes() : new ArrayList<>();
    }

    public StickNode getParent(StickNode node) {
        return node != null ? node.getParentNode() : null;
    }

    public ArrayList<StickNode> getSiblings(StickNode node) {
        if (node == null || node.getParentNode() == null) return new ArrayList<>();
        ArrayList<StickNode> siblings = new ArrayList<>(node.getParentNode().getChildrenNodes());
        siblings.remove(node);
        return siblings;
    }

    public ArrayList<StickNode> get_all_nodes() {
        return drawOrderedNodeRefs;
    }

    public List<Integer> all_draw_indices() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < drawOrderedNodeRefs.size(); i++) list.add(i);
        return list;
    }

    public List<Integer> missing_draw_indices() {
        return new ArrayList<>();
    }

    private void collectDrawOrder(StickNode node) {
        drawOrderedNodeRefs.add(node);
        for (StickNode child : node.getChildrenNodes()) {
            collectDrawOrder(child);
        }
    }

    public void updateTransforms(float rootX, float rootY) {
        if (mainNode != null) {
            mainNode.updateTransforms(rootX, rootY, 0);
        }
    }
}
