package org.fortheloss.sticknodes.stickfigure;

/* loaded from: classes2.dex */
public class StickNodeStatic extends org.fortheloss.sticknodes.stickfigure.StickNode {
    protected org.fortheloss.sticknodes.stickfigure.StickNodeDynamic mLibraryNodeRef;

    public StickNodeStatic(org.fortheloss.sticknodes.stickfigure.Stickfigure r7, org.fortheloss.sticknodes.stickfigure.StickNode r8, org.fortheloss.sticknodes.stickfigure.StickNode r9, boolean r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.initClone(r9)
            r6.updateColorReferences()
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected void actuallyDispose() {
            r1 = this;
            r0 = 0
            r1.mLibraryNodeRef = r0
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
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValAngleLockIsMainNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValAngleLockIsMainNode()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected byte getValAngleLockRelativeMultiplier() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            byte r0 = r0.getValAngleLockRelativeMultiplier()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValAngleLockRelativeStart() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            float r0 = r0.getValAngleLockRelativeStart()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValAngleLockStickfigureStart() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            float r0 = r0.getValAngleLockStickfigureStart()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValCircleIsHollow() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValCircleIsHollow()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color getValColorCircleOutline() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r0 = r0.getValColorCircleOutline()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color getValColorGradient() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r0 = r0.getValColorGradient()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color getValColorPolyfill() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r0 = r0.getValColorPolyfill()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color getValColorSegment() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r0 = r0.getValColorSegment()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValDefaultLength() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            float r0 = r0.getValDefaultLength()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int getValDefaultThickness() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            int r0 = r0.getValDefaultThickness()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int getValDrawOrderIndex() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            int r0 = r0.getValDrawOrderIndex()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short getValGradientMode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            short r0 = r0.getValGradientMode()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValHalfArc() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValHalfArc()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsAngleLocked() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValIsAngleLocked()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsFloaty() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValIsFloaty()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsSmartStretch() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValIsSmartStretch()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsStatic() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValIsStatic()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsStretchy() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValIsStretchy()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValLength() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            float r0 = r0.getValLength()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int getValLimbType() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            int r0 = r0.getValLimbType()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short getValNumPolygonVertices() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            short r0 = r0.getValNumPolygonVertices()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValSegmentCurveCirculization() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValSegmentCurveCirculization()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short getValSegmentCurvePolyfillPrecision() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            short r0 = r0.getValSegmentCurvePolyfillPrecision()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValSegmentScale() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            float r0 = r0.getValSegmentScale()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValSmartStretchDoNotApply() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValSmartStretchDoNotApply()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValSmartStretchMultiplier() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            float r0 = r0.getValSmartStretchMultiplier()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValSmartStretchResetImpulse() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValSmartStretchResetImpulse()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int getValThickness() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            int r0 = r0.getValThickness()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValTrapezoidIsRounded1() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValTrapezoidIsRounded1()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValTrapezoidIsRounded2() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValTrapezoidIsRounded2()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValTrapezoidRatio() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            float r0 = r0.getValTrapezoidRatio()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValTrapezoidThickness1() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            float r0 = r0.getValTrapezoidThickness1()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValTrapezoidThickness2() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            float r0 = r0.getValTrapezoidThickness2()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValTriangleUpsideDown() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValTriangleUpsideDown()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUseCircleOutline() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValUseCircleOutline()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUseGradient() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValUseGradient()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUsePolyfillColor() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValUsePolyfillColor()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUseSegmentColor() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValUseSegmentColor()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValUseSegmentScale() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r0 = r1.mLibraryNodeRef
            boolean r0 = r0.getValUseSegmentScale()
            return r0
    }

    protected void initClone(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.IDynamicNode r1 = r1.getLibraryNodeReference()
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = (org.fortheloss.sticknodes.stickfigure.StickNodeDynamic) r1
            r0.mLibraryNodeRef = r1
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValAngleLockIsMainNode(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValAngleLockIsMainNode()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValAngleLockRelativeMultiplier(byte r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            byte r1 = r1.getValAngleLockRelativeMultiplier()
            float r1 = (float) r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValAngleLockRelativeStart(float r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            float r1 = r1.getValAngleLockRelativeStart()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValAngleLockStickfigureStart(float r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            float r1 = r1.getValAngleLockStickfigureStart()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValCircleIsHollow(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValCircleIsHollow()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorCircleOutline(float r1, float r2, float r3, float r4) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r1 = r1.getValColorCircleOutline()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorCircleOutline(com.badlogic.gdx.graphics.Color r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r1 = r1.getValColorCircleOutline()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorGradient(float r1, float r2, float r3, float r4) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r1 = r1.getValColorGradient()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorGradient(com.badlogic.gdx.graphics.Color r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r1 = r1.getValColorGradient()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorPolyfill(float r1, float r2, float r3, float r4) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r1 = r1.getValColorPolyfill()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorPolyfill(com.badlogic.gdx.graphics.Color r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r1 = r1.getValColorPolyfill()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorSegment(float r1, float r2, float r3, float r4) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r1 = r1.getValColorSegment()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected com.badlogic.gdx.graphics.Color setValColorSegment(com.badlogic.gdx.graphics.Color r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            com.badlogic.gdx.graphics.Color r1 = r1.getValColorSegment()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValDefaultLength(float r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            float r1 = r1.getValDefaultLength()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int setValDefaultThickness(int r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            int r1 = r1.getValDefaultThickness()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int setValDrawOrderIndex(int r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            int r1 = r1.getValDrawOrderIndex()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short setValGradientMode(short r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            short r1 = r1.getValGradientMode()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValHalfArc(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValHalfArc()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsAngleLocked(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValIsAngleLocked()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsFloaty(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValIsFloaty()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsSmartStretch(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValIsSmartStretch()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsStatic(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValIsStatic()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsStretchy(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValIsStretchy()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValLength(float r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            float r1 = r1.getValLength()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int setValLimbType(int r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            int r1 = r1.getValLimbType()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short setValNumPolygonVertices(short r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            short r1 = r1.getValNumPolygonVertices()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValSegmentCurveCirculization(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValSegmentCurveCirculization()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected short setValSegmentCurvePolyfillPrecision(short r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            short r1 = r1.getValSegmentCurvePolyfillPrecision()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValSegmentScale(float r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            float r1 = r1.getValSegmentScale()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValSmartStretchDoNotApply(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValSmartStretchDoNotApply()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValSmartStretchMultiplier(float r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            float r1 = r1.getValSmartStretchMultiplier()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValSmartStretchResetImpulse(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValSmartStretchResetImpulse()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected int setValThickness(int r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            int r1 = r1.getValThickness()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValTrapezoidIsRounded1(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValTrapezoidIsRounded1()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValTrapezoidIsRounded2(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValTrapezoidIsRounded2()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValTrapezoidRatio(float r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            float r1 = r1.getValTrapezoidRatio()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValTrapezoidThickness1(float r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            float r1 = r1.getValTrapezoidThickness1()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValTrapezoidThickness2(float r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            float r1 = r1.getValTrapezoidThickness2()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValTriangleUpsideDown(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValTriangleUpsideDown()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUseCircleOutline(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValUseCircleOutline()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUseGradient(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValUseGradient()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUsePolyfillColor(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValUsePolyfillColor()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUseSegmentColor(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValUseSegmentColor()
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValUseSegmentScale(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = r0.mLibraryNodeRef
            boolean r1 = r1.getValUseSegmentScale()
            return r1
    }
}
