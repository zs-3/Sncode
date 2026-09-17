package com.sticknodes.viewer;

import com.badlogic.gdx.graphics.Color;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Stickfigure {
    private float scale = 1.0f;
    private final Color color = new Color(Color.BLACK);
    private StickNode mainNode;
    private final ArrayList<StickNode> drawOrderedNodeRefs = new ArrayList<>();

    public Stickfigure() {
        this.mainNode = new StickNode(this, null);
    }

    public float getScale() { return scale; }
    public Color getColor() { return color; }
    public StickNode getMainNode() { return mainNode; }
    public ArrayList<StickNode> getDrawOrderedNodeRefs() { return drawOrderedNodeRefs; }

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

            // Populate draw order list
            drawOrderedNodeRefs.clear();
            collectDrawOrder(mainNode);

            if (version >= 230) {
                int polyfillCount = in.readInt();
                for (int i = 0; i < polyfillCount; i++) {
                    int nodeIdx = in.readInt();
                }
            }

            if (build >= 38) {
                int connectorCount = in.readInt();
                for (int i = 0; i < connectorCount; i++) {
                    int startIdx = in.readInt();
                    int endIdx = in.readInt();
                }
            }

            updateTransforms(0, 0);
        } else {
            throw new IllegalStateException("Stickfigure version is out of bounds: " + version);
        }
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
