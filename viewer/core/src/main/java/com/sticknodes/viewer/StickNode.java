package com.sticknodes.viewer;

import com.badlogic.gdx.graphics.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class StickNode {
    // 8 Original Limb Types
    public static final int LIMB_ROUNDED_SEGMENT = 0;
    public static final int LIMB_SEGMENT = 1;
    public static final int LIMB_CIRCLE = 2;
    public static final int LIMB_TRIANGLE = 3;
    public static final int LIMB_FILLED_CIRCLE = 4;
    public static final int LIMB_ELLIPSE = 5;
    public static final int LIMB_TRAPEZOID = 6;
    public static final int LIMB_POLYGON = 7;

    private Stickfigure stickfigure;
    private StickNode parentNode;
    private final ArrayList<StickNode> childrenNodes = new ArrayList<>();

    // Full Node Option Fields
    public int limbType = LIMB_ROUNDED_SEGMENT;
    public int drawOrderIndex;
    public boolean isStatic;
    public boolean isStretchy;
    public boolean isFloaty;
    public boolean isSmartStretch;
    public boolean smartStretchDoNotApply;
    public boolean smartStretchResetImpulse;
    public boolean useSegmentColor;
    public boolean useCircleOutline;
    public boolean circleIsHollow;
    public boolean useGradient;
    public boolean gradientReversed;
    public int gradientMode;
    public boolean useSegmentScale;

    public float localX;
    public float localY;
    public float segmentScale = 1.0f;
    public float defaultLength = 20.0f;
    public float length = 20.0f;
    public int defaultThickness = 10;
    public int thickness = 10;
    public int curveRadius;
    public int defaultCurveRadius;
    public boolean segmentCurveCirculization;
    public int segmentCurvePolyfillPrecision = 1;
    public boolean halfArc;
    public int rightTriangleDirection;
    public boolean triangleUpsideDown;
    public float trapezoidThickness1 = 10.0f;
    public float trapezoidThickness2 = 10.0f;
    public float trapezoidRatio = 1.0f;
    public boolean trapezoidAsymmetric;
    public boolean isBranchLocked;
    public boolean isAngleLocked;
    public boolean isDragLocked;
    public float localAngle;
    public float defaultAngle;
    public int numPolygonVertices = 3;

    public final Color color = new Color(Color.BLACK);
    public final Color secondaryColor = new Color(Color.BLACK);
    public final Color circleOutlineColor = new Color(Color.BLACK);

    // World Transforms
    public float worldX;
    public float worldY;
    public float worldAngle;

    public StickNode(Stickfigure stickfigure, StickNode parentNode) {
        this.stickfigure = stickfigure;
        this.parentNode = parentNode;
        if (parentNode != null) {
            parentNode.childrenNodes.add(this);
        }
    }

    public Stickfigure getStickfigure() { return stickfigure; }
    public StickNode getParentNode() { return parentNode; }
    public ArrayList<StickNode> getChildrenNodes() { return childrenNodes; }
    public boolean isMainNode() { return parentNode == null; }

    public float getGlobalX() { return worldX; }
    public float getGlobalY() { return worldY; }
    public float getGlobalAngle() { return worldAngle; }
    public float getLocalX() { return localX; }
    public float getLocalY() { return localY; }
    public Color getDisplayColor() { return useSegmentColor ? color : (stickfigure != null ? stickfigure.getColor() : Color.BLACK); }
    public int getEffectiveThickness() { return thickness; }

    public int getLimbType() { return limbType; }
    public boolean isStatic() { return isStatic; }
    public boolean isStretchy() { return isStretchy; }
    public float getLength() { return length; }
    public void setLength(float l) { this.length = l; }
    public int getThickness() { return thickness; }
    public void setThickness(int t) { this.thickness = t; }
    public float getLocalAngle() { return localAngle; }
    public void setLocalAngle(float a) { this.localAngle = a; }
    public Color getColor() { return color; }
    public Color getSecondaryColor() { return secondaryColor; }

    public ArrayList<StickNode> getCurveNodes() {
        ArrayList<StickNode> list = new ArrayList<>();
        int count = Math.max(1, (int) (Math.cbrt(Math.max(length * 0.5f, Math.abs(curveRadius) * 0.5f)) * 16 * 0.5f));
        for (int i = 0; i <= count; i++) {
            list.add(this);
        }
        return list;
    }

    public void recalculatePolyfillTriangles() {}

    public void updatePosition(Stickfigure fig) {
        if (fig != null) {
            fig.updateTransforms(0, 0);
        }
    }

    public void drawLimb(SNShapeRenderer renderer, float offsetX, float offsetY, float scale, boolean isSelected) {
        if (isMainNode()) {
            renderer.circle(worldX + offsetX, worldY + offsetY, getEffectiveThickness() * 0.5f * scale, 16, getDisplayColor(), getDisplayColor());
            return;
        }

        StickNode parent = getParentNode();
        if (parent == null) return;

        float x1 = parent.worldX + offsetX;
        float y1 = parent.worldY + offsetY;
        float x2 = worldX + offsetX;
        float y2 = worldY + offsetY;
        float effThickness = getEffectiveThickness() * scale;
        Color c1 = getDisplayColor();
        Color c2 = useGradient ? secondaryColor : c1;

        double radAngle = Math.toRadians(worldAngle);
        float cosAngle = (float) Math.cos(radAngle);
        float sinAngle = (float) Math.sin(radAngle);

        switch (limbType) {
            case LIMB_ROUNDED_SEGMENT:
                renderer.myRoundedSegment(x1, y1, x2, y2, effThickness, cosAngle, sinAngle, useGradient, c1, c2);
                break;
            case LIMB_SEGMENT:
                renderer.mySegment(x1, y1, x2, y2, effThickness, cosAngle, sinAngle, useGradient, c1, c2);
                break;
            case LIMB_CIRCLE:
                renderer.circleOutline(x2, y2, length * scale, (length - effThickness) * scale, 24, c1);
                break;
            case LIMB_TRIANGLE:
                float triH = length * scale;
                float triW = effThickness;
                renderer.triangle(x2, y2, x1 - sinAngle * triW * 0.5f, y1 + cosAngle * triW * 0.5f, x1 + sinAngle * triW * 0.5f, y1 - cosAngle * triW * 0.5f, c1, c2);
                break;
            case LIMB_FILLED_CIRCLE:
                renderer.circle(x2, y2, length * scale, 24, c1, c2);
                break;
            case LIMB_ELLIPSE:
                renderer.ellipse(x2, y2, length * scale, effThickness * 0.5f, 24, worldAngle, c1, c2);
                break;
            case LIMB_TRAPEZOID:
                renderer.myTrapezoid(x1, y1, x2, y2, trapezoidThickness1 * scale, trapezoidThickness2 * scale, cosAngle, sinAngle, useGradient, c1, c2);
                break;
            case LIMB_POLYGON:
                renderer.polygon(x2, y2, length * scale, Math.max(3, numPolygonVertices), worldAngle, c1, c2);
                break;
            default:
                renderer.myRoundedSegment(x1, y1, x2, y2, effThickness, cosAngle, sinAngle, useGradient, c1, c2);
                break;
        }
    }

    public void drawLimbCulled(SNShapeRenderer renderer, float x, float y, float scale) {
        drawLimb(renderer, x, y, scale, false);
    }

    public void drawLimbAA(SNShapeRenderer renderer, float x, float y, float scale) {
        int passes = Math.max(2, (int) Math.floor((Math.max(thickness, length) / 80.0f) * 6.0f));
        Color aaColor = new Color(getDisplayColor()).mul(0.20f);

        for (int i = 0; i < passes; i++) {
            float passScale = scale + (i * 0.14f);
            drawLimb(renderer, x, y, passScale, false);
        }
        drawLimb(renderer, x, y, scale, false);
    }

    public void drawPolyfill(SNShapeRenderer renderer, float x, float y, float scale) {}
    public void drawPolyfillAA(SNShapeRenderer renderer, float x, float y, float scale) {}

    public void readData(int version, int build, DataInputStream in) throws IOException {
        this.limbType = in.readByte();
        this.drawOrderIndex = in.readInt();
        this.isStatic = in.read() != 0;
        this.isStretchy = in.read() != 0;
        if (build >= 48) this.isFloaty = in.read() != 0;
        if (version >= 248) this.isSmartStretch = in.read() != 0;
        if (version >= 252) this.smartStretchDoNotApply = in.read() != 0;
        if (build >= 50) this.smartStretchResetImpulse = in.read() != 0;
        this.useSegmentColor = in.read() != 0;
        if (version >= 256) this.useCircleOutline = in.read() != 0;
        if (build >= 21) this.circleIsHollow = in.read() != 0;
        if (version >= 176) this.useGradient = in.read() != 0;
        if (version >= 176) this.gradientReversed = in.read() != 0;
        if (build >= 82) {
            this.gradientMode = in.readShort();
        } else if (build >= 20) {
            this.gradientMode = in.readShort();
        }
        this.useSegmentScale = in.read() != 0;
        this.localX = in.readFloat();
        this.localY = in.readFloat();
        this.segmentScale = in.readFloat();
        this.defaultLength = in.readFloat();
        this.length = in.readFloat();
        this.defaultThickness = in.readInt();
        this.thickness = in.readInt();
        if (version >= 320) {
            this.curveRadius = in.readInt();
            this.defaultCurveRadius = this.curveRadius;
        }
        if (build >= 20) this.segmentCurveCirculization = in.read() != 0;
        if (build >= 21) this.segmentCurvePolyfillPrecision = in.readShort();
        if (version >= 256) {
            this.halfArc = in.read() != 0;
            this.rightTriangleDirection = in.readShort();
            if (version >= 300) this.triangleUpsideDown = in.read() != 0;
            if (build >= 36) {
                if (build < 64) {
                    this.trapezoidThickness1 = in.readInt();
                    this.trapezoidThickness2 = in.readInt();
                } else {
                    this.trapezoidThickness1 = in.readFloat();
                    this.trapezoidThickness2 = in.readFloat();
                }
                if (build != 36) {
                    this.trapezoidRatio = in.readFloat();
                }
                this.trapezoidAsymmetric = in.read() != 0;
            }
        }
        if (build >= 28) this.isBranchLocked = in.read() != 0;
        if (build >= 28) this.isAngleLocked = in.read() != 0;
        if (build >= 28) this.isDragLocked = in.read() != 0;

        this.localAngle = in.readFloat();
        this.defaultAngle = in.readFloat();

        if (useSegmentColor) {
            int c = in.readInt();
            float r = (c & 0xFF) / 255.0f;
            float g = ((c >> 8) & 0xFF) / 255.0f;
            float b = ((c >> 16) & 0xFF) / 255.0f;
            this.color.set(r, g, b, 1.0f);
        } else {
            this.color.set(stickfigure != null ? stickfigure.getColor() : Color.BLACK);
        }

        if (useGradient) {
            int c = in.readInt();
            float r = (c & 0xFF) / 255.0f;
            float g = ((c >> 8) & 0xFF) / 255.0f;
            float b = ((c >> 16) & 0xFF) / 255.0f;
            this.secondaryColor.set(r, g, b, 1.0f);
        }

        if (version >= 320) {
            this.numPolygonVertices = in.readShort();
        }

        int childCount = in.readInt();
        for (int i = 0; i < childCount; i++) {
            StickNode child = new StickNode(stickfigure, this);
            child.readData(version, build, in);
        }
    }

    public void writeData(DataOutputStream out) throws IOException {}

    public void updateTransforms(float parentX, float parentY, float parentAngle) {
        if (isMainNode()) {
            this.worldX = parentX + localX;
            this.worldY = parentY + localY;
            this.worldAngle = localAngle;
        } else {
            this.worldAngle = parentAngle + localAngle;
            double rad = Math.toRadians(this.worldAngle);
            this.worldX = parentX + (float)(Math.cos(rad) * length);
            this.worldY = parentY + (float)(Math.sin(rad) * length);
        }

        for (StickNode child : childrenNodes) {
            child.updateTransforms(this.worldX, this.worldY, this.worldAngle);
        }
    }
}
