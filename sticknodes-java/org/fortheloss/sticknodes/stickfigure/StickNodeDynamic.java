package org.fortheloss.sticknodes.stickfigure;

/* loaded from: classes2.dex */
public class StickNodeDynamic extends org.fortheloss.sticknodes.stickfigure.StickNode implements org.fortheloss.sticknodes.stickfigure.IDynamicNode {
    private float _defaultLength;
    private int _defaultThickness;
    private float _length;
    private int _thickness;
    private boolean mAngleLockIsMainNode;
    private byte mAngleLockRelativeMultiplier;
    private float mAngleLockRelativeStart;
    private float mAngleLockStickfigureStart;
    private boolean mCircleIsHollow;
    private com.badlogic.gdx.graphics.Color mColorCircleOutline;
    private com.badlogic.gdx.graphics.Color mColorGradient;
    private com.badlogic.gdx.graphics.Color mColorPolyfill;
    private com.badlogic.gdx.graphics.Color mColorSegment;
    private int mDrawOrderIndex;
    private short mGradientMode;
    private boolean mHalfArc;
    private boolean mIsAngleLocked;
    private boolean mIsFloaty;
    private boolean mIsSmartStretch;
    private boolean mIsStatic;
    private boolean mIsStretchy;
    private int mLimbType;
    private short mNumPolygonVertices;
    private boolean mSegmentCurveCirculization;
    private short mSegmentCurvePolyfillPrecision;
    private float mSegmentScale;
    private boolean mSmartStretchDoNotApply;
    private float mSmartStretchMultiplier;
    private boolean mSmartStretchResetImpulse;
    private boolean mTrapezoidIsRounded1;
    private boolean mTrapezoidIsRounded2;
    private float mTrapezoidRatio;
    private float mTrapezoidThickness1;
    private float mTrapezoidThickness2;
    private boolean mTriangleUpsideDown;
    private boolean mUseCircleOutline;
    private boolean mUseGradient;
    private boolean mUsePolyfillColor;
    private boolean mUseSegmentColor;
    private boolean mUseSegmentScale;

    public StickNodeDynamic(org.fortheloss.sticknodes.stickfigure.Stickfigure r2, org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 0
            r3 = 1107296256(0x42000000, float:32.0)
            r0 = 0
            r1.init(r2, r3, r0)
            r1.updateColorReferences()
            return
    }

    public StickNodeDynamic(org.fortheloss.sticknodes.stickfigure.Stickfigure r1, org.fortheloss.sticknodes.stickfigure.StickNode r2, float r3, float r4, float r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r4, r6)
            r0.init(r3, r5, r6)
            r0.updateColorReferences()
            return
    }

    public StickNodeDynamic(org.fortheloss.sticknodes.stickfigure.Stickfigure r1, org.fortheloss.sticknodes.stickfigure.StickNode r2, org.fortheloss.sticknodes.stickfigure.StickNode r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r0.initClone(r3)
            r0.updateColorReferences()
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void actuallyDispose() {
            r1 = this;
            r0 = 0
            r1.mColorSegment = r0
            r1.mColorGradient = r0
            r1.mColorPolyfill = r0
            r1.mColorCircleOutline = r0
            super.actuallyDispose()
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected /* bridge */ /* synthetic */ org.fortheloss.sticknodes.stickfigure.IDynamicNode getLibraryNodeReference() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.getLibraryNodeReference()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected org.fortheloss.sticknodes.stickfigure.StickNodeDynamic getLibraryNodeReference() {
            r0 = this;
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValAngleLockIsMainNode() {
            r1 = this;
            boolean r0 = r1.mAngleLockIsMainNode
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected byte getValAngleLockRelativeMultiplier() {
            r1 = this;
            byte r0 = r1.mAngleLockRelativeMultiplier
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValAngleLockRelativeStart() {
            r1 = this;
            float r0 = r1.mAngleLockRelativeStart
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValAngleLockStickfigureStart() {
            r1 = this;
            float r0 = r1.mAngleLockStickfigureStart
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValCircleIsHollow() {
            r1 = this;
            boolean r0 = r1.mCircleIsHollow
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color getValColorCircleOutline() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorCircleOutline
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color getValColorGradient() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorGradient
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color getValColorPolyfill() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorPolyfill
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color getValColorSegment() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorSegment
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValDefaultLength() {
            r1 = this;
            float r0 = r1._defaultLength
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int getValDefaultThickness() {
            r1 = this;
            int r0 = r1._defaultThickness
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int getValDrawOrderIndex() {
            r1 = this;
            int r0 = r1.mDrawOrderIndex
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short getValGradientMode() {
            r1 = this;
            short r0 = r1.mGradientMode
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValHalfArc() {
            r1 = this;
            boolean r0 = r1.mHalfArc
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsAngleLocked() {
            r1 = this;
            boolean r0 = r1.mIsAngleLocked
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsFloaty() {
            r1 = this;
            boolean r0 = r1.mIsFloaty
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsSmartStretch() {
            r1 = this;
            boolean r0 = r1.mIsSmartStretch
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsStatic() {
            r1 = this;
            boolean r0 = r1.mIsStatic
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsStretchy() {
            r1 = this;
            boolean r0 = r1.mIsStretchy
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValLength() {
            r1 = this;
            float r0 = r1._length
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int getValLimbType() {
            r1 = this;
            int r0 = r1.mLimbType
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short getValNumPolygonVertices() {
            r1 = this;
            short r0 = r1.mNumPolygonVertices
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValSegmentCurveCirculization() {
            r1 = this;
            boolean r0 = r1.mSegmentCurveCirculization
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short getValSegmentCurvePolyfillPrecision() {
            r1 = this;
            short r0 = r1.mSegmentCurvePolyfillPrecision
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValSegmentScale() {
            r1 = this;
            float r0 = r1.mSegmentScale
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValSmartStretchDoNotApply() {
            r1 = this;
            boolean r0 = r1.mSmartStretchDoNotApply
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValSmartStretchMultiplier() {
            r1 = this;
            float r0 = r1.mSmartStretchMultiplier
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValSmartStretchResetImpulse() {
            r1 = this;
            boolean r0 = r1.mSmartStretchResetImpulse
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int getValThickness() {
            r1 = this;
            int r0 = r1._thickness
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValTrapezoidIsRounded1() {
            r1 = this;
            boolean r0 = r1.mTrapezoidIsRounded1
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValTrapezoidIsRounded2() {
            r1 = this;
            boolean r0 = r1.mTrapezoidIsRounded2
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValTrapezoidRatio() {
            r1 = this;
            float r0 = r1.mTrapezoidRatio
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValTrapezoidThickness1() {
            r1 = this;
            float r0 = r1.mTrapezoidThickness1
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValTrapezoidThickness2() {
            r1 = this;
            float r0 = r1.mTrapezoidThickness2
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValTriangleUpsideDown() {
            r1 = this;
            boolean r0 = r1.mTriangleUpsideDown
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUseCircleOutline() {
            r1 = this;
            boolean r0 = r1.mUseCircleOutline
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUseGradient() {
            r1 = this;
            boolean r0 = r1.mUseGradient
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUsePolyfillColor() {
            r1 = this;
            boolean r0 = r1.mUsePolyfillColor
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUseSegmentColor() {
            r1 = this;
            boolean r0 = r1.mUseSegmentColor
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUseSegmentScale() {
            r1 = this;
            boolean r0 = r1.mUseSegmentScale
            return r0
    }

    public void init(float r6, float r7, int r8) {
            r5 = this;
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r5.mColorSegment = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r5.mColorPolyfill = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r5.mColorGradient = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r5.mColorCircleOutline = r0
            r5._length = r6
            r5._defaultLength = r6
            int r6 = (int) r7
            r5._thickness = r6
            r5._defaultThickness = r6
            r5.mLimbType = r8
            r6 = 0
            r5.mDrawOrderIndex = r6
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.mSegmentScale = r0
            r1 = 5
            r2 = 2
            r3 = 1
            if (r8 == r2) goto L37
            if (r8 != r1) goto L36
            goto L37
        L36:
            r2 = 1
        L37:
            r5.mGradientMode = r2
            r5.mSegmentCurvePolyfillPrecision = r3
            r5.mTrapezoidThickness1 = r7
            r2 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r2
            r5.mTrapezoidThickness2 = r7
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.mTrapezoidRatio = r7
            r5.mNumPolygonVertices = r1
            r7 = 0
            r5.mDragLockAngle = r7
            r5.mSmartStretchMultiplier = r0
            com.badlogic.gdx.graphics.Color r1 = r5.mColorSegment
            r4 = 1040187392(0x3e000000, float:0.125)
            r1.set(r4, r4, r4, r0)
            com.badlogic.gdx.graphics.Color r1 = r5.mColorGradient
            r1.set(r2, r2, r2, r0)
            com.badlogic.gdx.graphics.Color r1 = r5.mColorPolyfill
            com.badlogic.gdx.graphics.Color r4 = org.fortheloss.sticknodes.App.COLOR_POLYFILL_DEFAULT
            r1.set(r4)
            com.badlogic.gdx.graphics.Color r1 = r5.mColorCircleOutline
            r1.set(r2, r2, r2, r0)
            r5.mIsStatic = r6
            r5.mIsStretchy = r6
            r5.mIsFloaty = r6
            r5.mUseSegmentColor = r6
            r5.mUsePolyfillColor = r3
            r5.mUseSegmentScale = r6
            r5.mUseGradient = r6
            r5.mUseCircleOutline = r6
            r5.mCircleIsHollow = r6
            r5.mIsSmartStretch = r6
            r5.mSmartStretchResetImpulse = r6
            r5.mSmartStretchDoNotApply = r6
            r5.mTrapezoidIsRounded1 = r6
            r5.mTrapezoidIsRounded2 = r6
            r5.mSegmentCurveCirculization = r6
            r5.mHalfArc = r6
            r5.mTriangleUpsideDown = r6
            r5.mAngleLockRelativeStart = r7
            r5.mAngleLockStickfigureStart = r7
            r5.mAngleLockRelativeMultiplier = r3
            r5.mIsAngleLocked = r6
            r5.mAngleLockIsMainNode = r3
            r6 = 7
            if (r8 != r6) goto L9a
            short r6 = org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_NUM_POLYGON_VERTICES
            r5.setValNumPolygonVertices(r6)
        L9a:
            return
    }

    protected void initClone(org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r2 = this;
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r2.mColorSegment = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r2.mColorPolyfill = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r2.mColorGradient = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r2.mColorCircleOutline = r0
            float r0 = r3.getValLength()
            r2._length = r0
            float r0 = r3.getValDefaultLength()
            r2._defaultLength = r0
            int r0 = r3.getValThickness()
            r2._thickness = r0
            int r0 = r3.getValDefaultThickness()
            r2._defaultThickness = r0
            int r0 = r3.getValLimbType()
            r2.mLimbType = r0
            int r0 = r3.getValDrawOrderIndex()
            r2.mDrawOrderIndex = r0
            float r0 = r3.getValSegmentScale()
            r2.mSegmentScale = r0
            short r0 = r3.getValGradientMode()
            r2.mGradientMode = r0
            short r0 = r3.getValSegmentCurvePolyfillPrecision()
            r2.mSegmentCurvePolyfillPrecision = r0
            float r0 = r3.getValTrapezoidThickness1()
            r2.mTrapezoidThickness1 = r0
            float r0 = r3.getValTrapezoidThickness2()
            r2.mTrapezoidThickness2 = r0
            float r0 = r3.getValTrapezoidRatio()
            r2.mTrapezoidRatio = r0
            short r0 = r3.getValNumPolygonVertices()
            r2.mNumPolygonVertices = r0
            float r0 = r3.getValSmartStretchMultiplier()
            r2.mSmartStretchMultiplier = r0
            com.badlogic.gdx.graphics.Color r0 = r2.mColorSegment
            com.badlogic.gdx.graphics.Color r1 = r3.getValColorSegment()
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = r2.mColorGradient
            com.badlogic.gdx.graphics.Color r1 = r3.getValColorGradient()
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = r2.mColorPolyfill
            com.badlogic.gdx.graphics.Color r1 = r3.getValColorPolyfill()
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = r2.mColorCircleOutline
            com.badlogic.gdx.graphics.Color r1 = r3.getValColorCircleOutline()
            r0.set(r1)
            boolean r0 = r3.getValIsStatic()
            r2.mIsStatic = r0
            boolean r0 = r3.getValIsStretchy()
            r2.mIsStretchy = r0
            boolean r0 = r3.getValIsFloaty()
            r2.mIsFloaty = r0
            boolean r0 = r3.getValUseSegmentColor()
            r2.mUseSegmentColor = r0
            boolean r0 = r3.getValUsePolyfillColor()
            r2.mUsePolyfillColor = r0
            boolean r0 = r3.getValUseSegmentScale()
            r2.mUseSegmentScale = r0
            boolean r0 = r3.getValUseGradient()
            r2.mUseGradient = r0
            boolean r0 = r3.getValUseCircleOutline()
            r2.mUseCircleOutline = r0
            boolean r0 = r3.getValCircleIsHollow()
            r2.mCircleIsHollow = r0
            boolean r0 = r3.getValIsSmartStretch()
            r2.mIsSmartStretch = r0
            boolean r0 = r3.getValSmartStretchResetImpulse()
            r2.mSmartStretchResetImpulse = r0
            boolean r0 = r3.getValSmartStretchDoNotApply()
            r2.mSmartStretchDoNotApply = r0
            boolean r0 = r3.getValTrapezoidIsRounded1()
            r2.mTrapezoidIsRounded1 = r0
            boolean r0 = r3.getValTrapezoidIsRounded2()
            r2.mTrapezoidIsRounded2 = r0
            boolean r0 = r3.getValSegmentCurveCirculization()
            r2.mSegmentCurveCirculization = r0
            boolean r0 = r3.getValHalfArc()
            r2.mHalfArc = r0
            boolean r0 = r3.getValTriangleUpsideDown()
            r2.mTriangleUpsideDown = r0
            float r0 = r3.getValAngleLockRelativeStart()
            r2.mAngleLockRelativeStart = r0
            float r0 = r3.getValAngleLockStickfigureStart()
            r2.mAngleLockStickfigureStart = r0
            byte r0 = r3.getValAngleLockRelativeMultiplier()
            r2.mAngleLockRelativeMultiplier = r0
            boolean r0 = r3.getValIsAngleLocked()
            r2.mIsAngleLocked = r0
            boolean r3 = r3.getValAngleLockIsMainNode()
            r2.mAngleLockIsMainNode = r3
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValAngleLockIsMainNode(boolean r1) {
            r0 = this;
            r0.mAngleLockIsMainNode = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValAngleLockRelativeMultiplier(byte r1) {
            r0 = this;
            r0.mAngleLockRelativeMultiplier = r1
            float r1 = (float) r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValAngleLockRelativeStart(float r1) {
            r0 = this;
            r0.mAngleLockRelativeStart = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValAngleLockStickfigureStart(float r1) {
            r0 = this;
            r0.mAngleLockStickfigureStart = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValCircleIsHollow(boolean r1) {
            r0 = this;
            r0.mCircleIsHollow = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorCircleOutline(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorCircleOutline
            r0.set(r2, r3, r4, r5)
            com.badlogic.gdx.graphics.Color r2 = r1.mColorCircleOutline
            return r2
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorCircleOutline(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorCircleOutline
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1.mColorCircleOutline
            return r2
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorGradient(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorGradient
            r0.set(r2, r3, r4, r5)
            com.badlogic.gdx.graphics.Color r2 = r1.mColorGradient
            return r2
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorGradient(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorGradient
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1.mColorGradient
            return r2
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorPolyfill(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorPolyfill
            r0.set(r2, r3, r4, r5)
            com.badlogic.gdx.graphics.Color r2 = r1.mColorPolyfill
            return r2
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorPolyfill(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorPolyfill
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1.mColorPolyfill
            return r2
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorSegment(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorSegment
            r0.set(r2, r3, r4, r5)
            com.badlogic.gdx.graphics.Color r2 = r1.mColorSegment
            return r2
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorSegment(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mColorSegment
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1.mColorSegment
            return r2
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValDefaultLength(float r1) {
            r0 = this;
            r0._defaultLength = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int setValDefaultThickness(int r1) {
            r0 = this;
            r0._defaultThickness = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int setValDrawOrderIndex(int r1) {
            r0 = this;
            r0.mDrawOrderIndex = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short setValGradientMode(short r1) {
            r0 = this;
            r0.mGradientMode = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValHalfArc(boolean r1) {
            r0 = this;
            r0.mHalfArc = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsAngleLocked(boolean r1) {
            r0 = this;
            r0.mIsAngleLocked = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsFloaty(boolean r1) {
            r0 = this;
            r0.mIsFloaty = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsSmartStretch(boolean r1) {
            r0 = this;
            r0.mIsSmartStretch = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsStatic(boolean r1) {
            r0 = this;
            r0.mIsStatic = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsStretchy(boolean r1) {
            r0 = this;
            r0.mIsStretchy = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValLength(float r1) {
            r0 = this;
            r0._length = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int setValLimbType(int r1) {
            r0 = this;
            r0.mLimbType = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short setValNumPolygonVertices(short r1) {
            r0 = this;
            r0.mNumPolygonVertices = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValSegmentCurveCirculization(boolean r1) {
            r0 = this;
            r0.mSegmentCurveCirculization = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short setValSegmentCurvePolyfillPrecision(short r1) {
            r0 = this;
            r0.mSegmentCurvePolyfillPrecision = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValSegmentScale(float r1) {
            r0 = this;
            r0.mSegmentScale = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValSmartStretchDoNotApply(boolean r1) {
            r0 = this;
            r0.mSmartStretchDoNotApply = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValSmartStretchMultiplier(float r1) {
            r0 = this;
            r0.mSmartStretchMultiplier = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValSmartStretchResetImpulse(boolean r1) {
            r0 = this;
            r0.mSmartStretchResetImpulse = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int setValThickness(int r1) {
            r0 = this;
            r0._thickness = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValTrapezoidIsRounded1(boolean r1) {
            r0 = this;
            r0.mTrapezoidIsRounded1 = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValTrapezoidIsRounded2(boolean r1) {
            r0 = this;
            r0.mTrapezoidIsRounded2 = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValTrapezoidRatio(float r1) {
            r0 = this;
            r0.mTrapezoidRatio = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValTrapezoidThickness1(float r1) {
            r0 = this;
            r0.mTrapezoidThickness1 = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValTrapezoidThickness2(float r1) {
            r0 = this;
            r0.mTrapezoidThickness2 = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValTriangleUpsideDown(boolean r1) {
            r0 = this;
            r0.mTriangleUpsideDown = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUseCircleOutline(boolean r1) {
            r0 = this;
            r0.mUseCircleOutline = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUseGradient(boolean r1) {
            r0 = this;
            r0.mUseGradient = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUsePolyfillColor(boolean r1) {
            r0 = this;
            r0.mUsePolyfillColor = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUseSegmentColor(boolean r1) {
            r0 = this;
            r0.mUseSegmentColor = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUseSegmentScale(boolean r1) {
            r0 = this;
            r0.mUseSegmentScale = r1
            return r1
    }
}
