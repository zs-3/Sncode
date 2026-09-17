package com.sticknodes.viewer;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class StickNode {
    public static final int LIMB_SEGMENT = 0;
    public static final int LIMB_CIRCLE = 1;
    public static final int LIMB_CURVE = 2;
    public static final int LIMB_POLY = 3;

    private Stickfigure stickfigure;
    private StickNode parentNode;
    private final ArrayList<StickNode> childrenNodes = new ArrayList<>();

    private int limbType = LIMB_SEGMENT;
    private int drawOrderIndex;
    private boolean isStatic;
    private boolean isStretchy;
    private boolean isFloaty;
    private boolean isSmartStretch;
    private boolean smartStretchDoNotApply;
    private boolean smartStretchResetImpulse;
    private boolean useSegmentColor;
    private boolean useCircleOutline;
    private boolean circleIsHollow;
    private boolean useGradient;
    private boolean gradientReversed;
    private int gradientMode;
    private boolean useSegmentScale;

    private float localX;
    private float localY;
    private float segmentScale = 1.0f;
    private float defaultLength = 20.0f;
    private float length = 20.0f;
    private int defaultThickness = 10;
    private int thickness = 10;
    private int curveRadius;
    private int defaultCurveRadius;
    private boolean segmentCurveCirculization;
    private int segmentCurvePolyfillPrecision = 1;
    private boolean halfArc;
    private int rightTriangleDirection;
    private boolean triangleUpsideDown;
    private float trapezoidThickness1 = 10.0f;
    private float trapezoidThickness2 = 10.0f;
    private float trapezoidRatio = 1.0f;
    private boolean trapezoidAsymmetric;
    private boolean isBranchLocked;
    private boolean isAngleLocked;
    private boolean isDragLocked;
    private float localAngle;
    private float defaultAngle;
    private int numPolygonVertices = 3;

    private final Color color = new Color(Color.BLACK);
    private final Color secondaryColor = new Color(Color.BLACK);

    // Calculated absolute positions
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
            this.color.set(stickfigure.getColor());
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

        // Read children count and construct child nodes
        int childCount = in.readInt();
        for (int i = 0; i < childCount; i++) {
            StickNode child = new StickNode(stickfigure, this);
            child.readData(version, build, in);
        }
    }

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
