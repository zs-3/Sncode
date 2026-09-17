package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickNodeProperties implements com.badlogic.gdx.utils.Disposable {
    public float angle;
    public boolean circleIsHollow;
    public com.badlogic.gdx.graphics.Color circleOutlineColor;
    public com.badlogic.gdx.graphics.Color color;
    public float defaultAngle;
    public float defaultLength;
    public float defaultLocalAngle;
    public int defaultThickness;
    public boolean doNotApplySmartStretch;
    public com.badlogic.gdx.graphics.Color gradientColor;
    public short gradientMode;
    public boolean halfArc;
    public boolean isSmartStretch;
    public boolean isStatic;
    public boolean isStretchy;
    public float length;
    public int limbType;
    public float localAngle;
    public float localX;
    public float localY;
    public boolean mAngleLockIsMainNode;
    public float mAngleLockOffset;
    public byte mAngleLockRelativeMultiplier;
    public float mAngleLockRelativeStart;
    public float mAngleLockStickfigureStart;
    public float mDragLockAngle;
    public boolean mIsAngleLocked;
    public boolean mIsDragLocked;
    public boolean mIsFloaty;
    public float mSmartStretchMultiplier;
    public boolean mSmartStretchResetImpulse;
    public short numPolygonVertices;
    public com.badlogic.gdx.graphics.Color polyfillColor;
    public boolean reverseGradient;
    public short rightTriangleDirection;
    public float scale;
    public boolean segmentCurveCirculization;
    public short segmentCurvePrecision;
    public int segmentCurveRadius;
    public int thickness;
    public boolean trapezoidIsRounded1;
    public boolean trapezoidIsRounded2;
    public float trapezoidRatio;
    public float trapezoidThickness1;
    public float trapezoidThickness2;
    public boolean triangleUpsideDown;
    public boolean useCircleOutline;
    public boolean useGradient;
    public boolean usePolyfillColor;
    public boolean useSegmentColor;
    public boolean useSegmentScale;
    public float x;
    public float y;

    public StickNodeProperties(org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.x = r0
            r4.y = r0
            r4.localX = r0
            r4.localY = r0
            r4.defaultLength = r0
            r4.length = r0
            r1 = 0
            r4.defaultThickness = r1
            r4.thickness = r1
            r4.segmentCurveRadius = r1
            r4.segmentCurveCirculization = r1
            r2 = 1
            r4.segmentCurvePrecision = r2
            r4.halfArc = r1
            r4.rightTriangleDirection = r1
            r4.triangleUpsideDown = r1
            r4.trapezoidThickness1 = r0
            r4.trapezoidThickness2 = r0
            r4.trapezoidIsRounded1 = r1
            r4.trapezoidIsRounded2 = r1
            r3 = 1056964608(0x3f000000, float:0.5)
            r4.trapezoidRatio = r3
            r4.numPolygonVertices = r1
            r4.defaultLocalAngle = r0
            r4.localAngle = r0
            r4.defaultAngle = r0
            r4.angle = r0
            r4.useSegmentColor = r1
            r4.useCircleOutline = r1
            r4.circleIsHollow = r1
            r4.useGradient = r1
            r4.reverseGradient = r1
            r4.gradientMode = r2
            r4.useSegmentScale = r1
            r4.scale = r0
            r4.isStretchy = r1
            r4.mIsFloaty = r1
            r4.isSmartStretch = r1
            r4.doNotApplySmartStretch = r1
            r4.mSmartStretchResetImpulse = r1
            r4.isStatic = r1
            r4.limbType = r1
            r4.usePolyfillColor = r2
            r4.mIsAngleLocked = r1
            r4.mAngleLockIsMainNode = r1
            r4.mAngleLockOffset = r0
            r4.mAngleLockRelativeStart = r0
            r4.mAngleLockStickfigureStart = r0
            r4.mAngleLockRelativeMultiplier = r1
            r4.mIsDragLocked = r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.mSmartStretchMultiplier = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r4.color = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r4.gradientColor = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r4.polyfillColor = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r4.circleOutlineColor = r0
            r4.getProperties(r5)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.color = r0
            r1.gradientColor = r0
            r1.polyfillColor = r0
            r1.circleOutlineColor = r0
            return
    }

    public void getProperties(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            r1.getProperties(r0)
            return
    }
}
