package org.fortheloss.sticknodes.stickfigure;

/* loaded from: classes2.dex */
public abstract class Connector extends org.fortheloss.sticknodes.stickfigure.StickNode {
    private org.fortheloss.sticknodes.stickfigure.StickNode mEndNodeRef;
    private float mNodeLocalX;
    private float mNodeLocalY;
    private float mNodePercent;
    private boolean mNodeReversed;
    private float mNodeValue;
    public float mSmartStretchAncestralValue;

    public Connector(org.fortheloss.sticknodes.stickfigure.Stickfigure r1, org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mNodeReversed = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mNodePercent = r1
            r1 = 1112014848(0x42480000, float:50.0)
            r0.mNodeValue = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mSmartStretchAncestralValue = r1
            return
    }

    public Connector(org.fortheloss.sticknodes.stickfigure.Stickfigure r2, org.fortheloss.sticknodes.stickfigure.StickNode r3, org.fortheloss.sticknodes.stickfigure.StickNode r4, int r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r5)
            r1.mEndNodeRef = r4
            r4.attachConnector(r1)
            r2 = 0
            r1.mNodeReversed = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.mNodePercent = r2
            r2 = 1112014848(0x42480000, float:50.0)
            r1.mNodeValue = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.mSmartStretchAncestralValue = r2
            return
    }

    public Connector(org.fortheloss.sticknodes.stickfigure.Stickfigure r1, org.fortheloss.sticknodes.stickfigure.StickNode r2, org.fortheloss.sticknodes.stickfigure.StickNode r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r3
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            boolean r2 = r3.mGradientReversed
            r0.mGradientReversed = r2
            float r2 = r1.mNodePercent
            r0.mNodePercent = r2
            float r2 = r1.mNodeValue
            r0.mNodeValue = r2
            boolean r2 = r1.mNodeReversed
            r0.mNodeReversed = r2
            float r1 = r1.mSmartStretchAncestralValue
            r0.mSmartStretchAncestralValue = r1
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected void actuallyDispose() {
            r1 = this;
            r0 = 0
            r1.mEndNodeRef = r0
            super.actuallyDispose()
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void applySmartStretchToChildren() {
            r4 = this;
            float r0 = r4.getNodeValue()
            float r1 = r4.getValLength()
            r2 = 1008981770(0x3c23d70a, float:0.01)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r2, r1)
            float r1 = r4.getValNodePercentDefault()
            float r3 = r4.getValDefaultLength()
            float r1 = r1 * r3
            float r1 = java.lang.Math.max(r2, r1)
            float r0 = r0 / r1
            float r0 = java.lang.Math.max(r2, r0)
            float r1 = r4.mSmartStretchAncestralValue
            float r0 = r0 * r1
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L2c
            goto L2d
        L2c:
            r2 = r0
        L2d:
            super.actuallyApplySmartStretchToChildren(r2)
            return
    }

    public void changeEndNode(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            r0.detach()
            r0.mEndNodeRef = r1
            r1.attachConnector(r0)
            r0.flagPositionAsDirty()
            return
    }

    public void detach() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.mEndNodeRef
            if (r0 == 0) goto L7
            r0.detachConnector(r1)
        L7:
            r0 = 0
            r1.mEndNodeRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode, org.fortheloss.sticknodes.stickfigure.INode
    public com.badlogic.gdx.math.Vector2 dragTo(float r8, float r9) {
            r7 = this;
            float r0 = r7.getValLength()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r7.getStickfigure()
            float r1 = r1.getScale()
            float r0 = r0 * r1
            r1 = 0
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L15
            return r1
        L15:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r7.getParentNode()
            float r3 = r3.getGlobalX()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r7.getParentNode()
            float r4 = r4.getGlobalY()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r7.mEndNodeRef
            float r5 = r5.getGlobalX()
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r7.mEndNodeRef
            float r6 = r6.getGlobalY()
            float r8 = r8 - r3
            float r9 = r9 - r4
            float r5 = r5 - r3
            float r6 = r6 - r4
            float r8 = r8 * r5
            float r9 = r9 * r6
            float r8 = r8 + r9
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 != 0) goto L3f
            return r1
        L3f:
            float r9 = r5 * r5
            float r1 = r6 * r6
            float r9 = r9 + r1
            float r8 = r8 / r9
            r9 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 >= 0) goto L5d
            boolean r8 = r7.mNodeReversed
            if (r8 == 0) goto L58
            r7.mNodePercent = r9
            float r8 = r7.getLength()
            r7.mNodeValue = r8
            goto Lae
        L58:
            r7.mNodePercent = r2
            r7.mNodeValue = r2
            goto Lae
        L5d:
            int r1 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r1 <= 0) goto L73
            boolean r8 = r7.mNodeReversed
            if (r8 == 0) goto L6a
            r7.mNodePercent = r2
            r7.mNodeValue = r2
            goto Lae
        L6a:
            r7.mNodePercent = r9
            float r8 = r7.getLength()
            r7.mNodeValue = r8
            goto Lae
        L73:
            float r5 = r5 * r8
            float r5 = r5 + r3
            float r8 = r8 * r6
            float r8 = r8 + r4
            float r5 = r5 - r3
            float r8 = r8 - r4
            float r5 = r5 * r5
            float r8 = r8 * r8
            float r5 = r5 + r8
            double r1 = (double) r5
            double r1 = java.lang.Math.sqrt(r1)
            float r8 = (float) r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 / r1
            boolean r1 = r7.mNodeReversed
            if (r1 == 0) goto L9f
            float r1 = r8 / r0
            float r9 = r9 - r1
            r7.mNodePercent = r9
            float r0 = r0 - r8
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r7.getStickfigure()
            float r8 = r8.getScale()
            float r0 = r0 / r8
            r7.mNodeValue = r0
            goto Lae
        L9f:
            float r9 = r8 / r0
            r7.mNodePercent = r9
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r7.getStickfigure()
            float r9 = r9.getScale()
            float r8 = r8 / r9
            r7.mNodeValue = r8
        Lae:
            r7.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r7.getStickfigure()
            com.badlogic.gdx.math.Vector2 r8 = r8.repositionBasedOnLockedStickNode(r7)
            return r8
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public com.badlogic.gdx.math.Vector2 dragTo(float r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            com.badlogic.gdx.math.Vector2 r1 = r0.dragTo(r1, r2)
            return r1
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getEndNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.mEndNodeRef
            return r0
    }

    public float getLocalNodeXUnsafe() {
            r1 = this;
            float r0 = r1.mNodeLocalX
            return r0
    }

    public float getLocalNodeYUnsafe() {
            r1 = this;
            float r0 = r1.mNodeLocalY
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> getNeighborNodes(boolean r2) {
            r1 = this;
            java.util.ArrayList r2 = super.getNeighborNodes(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.mEndNodeRef
            r2.add(r0)
            return r2
    }

    public int getNodeMethod() {
            r1 = this;
            int r0 = r1.getValNodeMethod()
            return r0
    }

    public float getNodePercent() {
            r1 = this;
            r1.validatePosition()
            float r0 = r1.mNodePercent
            return r0
    }

    public boolean getNodeReversed() {
            r1 = this;
            boolean r0 = r1.mNodeReversed
            return r0
    }

    public float getNodeValue() {
            r1 = this;
            r1.validatePosition()
            float r0 = r1.mNodeValue
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void getProperties(org.fortheloss.sticknodes.data.useractions.StickNodeProperties r2) {
            r1 = this;
            super.getProperties(r2)
            boolean r0 = r2 instanceof org.fortheloss.sticknodes.data.useractions.ConnectorProperties
            if (r0 == 0) goto L2d
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r2 = (org.fortheloss.sticknodes.data.useractions.ConnectorProperties) r2
            float r0 = r1.mNodeLocalX
            r2.mNodeLocalX = r0
            float r0 = r1.mNodeLocalY
            r2.mNodeLocalY = r0
            int r0 = r1.getValNodeMethod()
            r2.mNodeMethod = r0
            float r0 = r1.mNodePercent
            r2.mNodePercent = r0
            float r0 = r1.getValNodePercentDefault()
            r2.mNodePercentDefault = r0
            float r0 = r1.mNodeValue
            r2.mNodeValue = r0
            boolean r0 = r1.mNodeReversed
            r2.mNodeReversed = r0
            float r0 = r1.mSmartStretchAncestralValue
            r2.mSmartStretchAncestralValue = r0
        L2d:
            return
    }

    protected abstract int getValNodeMethod();

    protected abstract float getValNodePercentDefault();

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValSegmentScale() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode, org.fortheloss.sticknodes.stickfigure.INode
    public float getX() {
            r2 = this;
            r2.validatePosition()
            float r0 = r2._x
            float r1 = r2.mNodeLocalX
            float r0 = r0 - r1
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode, org.fortheloss.sticknodes.stickfigure.INode
    public float getY() {
            r2 = this;
            r2.validatePosition()
            float r0 = r2._y
            float r1 = r2.mNodeLocalY
            float r0 = r0 - r1
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void highlightChildrenAndParentNodes(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r18, float r19, float r20, float r21, boolean r22) {
            r17 = this;
            r7 = r17
            super.highlightChildrenAndParentNodes(r18, r19, r20, r21, r22)
            if (r22 != 0) goto Lf
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r7.mEndNodeRef
            boolean r0 = r0.isStatic()
            if (r0 != 0) goto L32
        Lf:
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r7.mEndNodeRef
            r14 = 1
            r15 = 1
            r16 = 1
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r8.drawNode(r9, r10, r11, r12, r13, r14, r15, r16)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r7.mEndNodeRef
            r6 = 1
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r0.drawHighlightLineToNode(r1, r2, r3, r4, r5, r6)
        L32:
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void interpolate(org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r4 = this;
            r0 = r5
            org.fortheloss.sticknodes.stickfigure.Connector r0 = (org.fortheloss.sticknodes.stickfigure.Connector) r0
            float r1 = r4.mNodeLocalX
            float r2 = r4.mNodeLocalY
            float r3 = r0.mNodeLocalX
            r4.mNodeLocalX = r3
            float r3 = r0.mNodeLocalY
            r4.mNodeLocalY = r3
            float r3 = r0.mNodePercent
            r4.mNodePercent = r3
            float r3 = r0.mNodeValue
            r4.mNodeValue = r3
            float r0 = r0.mSmartStretchAncestralValue
            r4.mSmartStretchAncestralValue = r0
            super.interpolate(r5)
            float r5 = r4.mNodeLocalX
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2a
            float r5 = r4.mNodeLocalY
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L2d
        L2a:
            r4.flagPositionAsDirty()
        L2d:
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void interpolate(org.fortheloss.sticknodes.stickfigure.StickNode r7, org.fortheloss.sticknodes.stickfigure.StickNode r8, float r9, boolean r10) {
            r6 = this;
            r0 = r7
            org.fortheloss.sticknodes.stickfigure.Connector r0 = (org.fortheloss.sticknodes.stickfigure.Connector) r0
            r1 = r8
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            float r2 = r6.mNodeLocalX
            float r3 = r6.mNodeLocalY
            float r4 = r0.mNodeLocalX
            float r5 = r1.mNodeLocalX
            float r5 = r5 - r4
            float r5 = r5 * r9
            float r4 = r4 + r5
            r6.mNodeLocalX = r4
            float r4 = r0.mNodeLocalY
            float r5 = r1.mNodeLocalY
            float r5 = r5 - r4
            float r5 = r5 * r9
            float r4 = r4 + r5
            r6.mNodeLocalY = r4
            float r4 = r0.mNodePercent
            float r5 = r1.mNodePercent
            float r5 = r5 - r4
            float r5 = r5 * r9
            float r4 = r4 + r5
            r6.mNodePercent = r4
            float r4 = r0.mNodeValue
            float r5 = r1.mNodeValue
            float r5 = r5 - r4
            float r5 = r5 * r9
            float r4 = r4 + r5
            r6.mNodeValue = r4
            float r0 = r0.mSmartStretchAncestralValue
            float r1 = r1.mSmartStretchAncestralValue
            float r1 = r1 - r0
            float r1 = r1 * r9
            float r0 = r0 + r1
            r6.mSmartStretchAncestralValue = r0
            super.interpolate(r7, r8, r9, r10)
            float r7 = r6.mNodeLocalX
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L4b
            float r7 = r6.mNodeLocalY
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 == 0) goto L4e
        L4b:
            r6.flagPositionAsDirty()
        L4e:
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected void readData(int r4, int r5, java.io.DataInputStream r6) throws java.io.IOException {
            r3 = this;
            float r0 = r6.readFloat()
            r3.mNodeLocalX = r0
            float r0 = r6.readFloat()
            r3.mNodeLocalY = r0
            float r0 = r6.readFloat()
            r3.mNodePercent = r0
            r1 = 44
            if (r5 < r1) goto L1a
            float r0 = r6.readFloat()
        L1a:
            r3.setValNodePercentDefault(r0)
            float r0 = r6.readFloat()
            r3.mNodeValue = r0
            int r0 = r6.readInt()
            r3.setValNodeMethod(r0)
            int r0 = r6.read()
            r1 = 1
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            r3.mNodeReversed = r0
            r0 = 65
            if (r5 < r0) goto L3f
            float r2 = r6.readFloat()
            goto L41
        L3f:
            r2 = 1065353216(0x3f800000, float:1.0)
        L41:
            r3.mSmartStretchAncestralValue = r2
            super.readData(r4, r5, r6)
            if (r5 >= r0) goto L4b
            r3.setValSmartStretchDoNotApply(r1)
        L4b:
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected void readDataOld(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            super.readDataOld(r1, r2)
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected void readPositionalData(int r1, int r2, java.io.DataInputStream r3) throws java.io.IOException {
            r0 = this;
            super.readPositionalData(r1, r2, r3)
            r1 = 43
            if (r2 < r1) goto L29
            float r1 = r3.readFloat()
            r0.mNodeLocalX = r1
            float r1 = r3.readFloat()
            r0.mNodeLocalY = r1
            float r1 = r3.readFloat()
            r0.mNodeValue = r1
            float r1 = r3.readFloat()
            r0.mNodePercent = r1
            r1 = 65
            if (r2 < r1) goto L29
            float r1 = r3.readFloat()
            r0.mSmartStretchAncestralValue = r1
        L29:
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected void readPositionalDataOld(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            super.readPositionalDataOld(r1, r2)
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setCurrentValuesAsDefault() {
            r1 = this;
            super.setCurrentValuesAsDefault()
            float r0 = r1.mNodePercent
            r1.setValNodePercentDefault(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mSmartStretchAncestralValue = r0
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setDoNotApplySmartStretch(boolean r1) {
            r0 = this;
            r0.setValSmartStretchDoNotApply(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setFloaty(boolean r1) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setIsAngleLocked(boolean r1) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setIsDragLocked(boolean r1) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setLength(float r1) {
            r0 = this;
            return
    }

    public void setNodeMethod(int r2) {
            r1 = this;
            int r0 = r1.getValNodeMethod()
            if (r0 != r2) goto L7
            return
        L7:
            r1.setValNodeMethod(r2)
            r1.flagPositionAsDirty()
            return
    }

    public void setNodePercent(float r3) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r0, r1)
            r2.mNodePercent = r3
            float r3 = r2.getValLength()
            float r1 = r2.mNodePercent
            float r3 = r3 * r1
            r1 = 1232348144(0x497423f0, float:999999.0)
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r0, r1)
            r2.mNodeValue = r3
            r2.flagPositionAsDirty()
            return
    }

    public void setNodeReversed(boolean r1) {
            r0 = this;
            r0.mNodeReversed = r1
            r0.flagPositionAsDirty()
            return
    }

    public void setNodeValue(float r3) {
            r2 = this;
            r0 = 0
            r1 = 1232348144(0x497423f0, float:999999.0)
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r0, r1)
            r2.mNodeValue = r3
            float r3 = r2.getValLength()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L13
            goto L20
        L13:
            float r3 = r2.mNodeValue
            float r1 = r2.getValLength()
            float r3 = r3 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r3, r0, r1)
        L20:
            r2.mNodePercent = r0
            r2.flagPositionAsDirty()
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setProperties(org.fortheloss.sticknodes.data.useractions.StickNodeProperties r3) {
            r2 = this;
            boolean r0 = r3 instanceof org.fortheloss.sticknodes.data.useractions.ConnectorProperties
            if (r0 == 0) goto L29
            r0 = r3
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r0 = (org.fortheloss.sticknodes.data.useractions.ConnectorProperties) r0
            float r1 = r0.mNodeLocalX
            r2.mNodeLocalX = r1
            float r1 = r0.mNodeLocalY
            r2.mNodeLocalY = r1
            int r1 = r0.mNodeMethod
            r2.setValNodeMethod(r1)
            float r1 = r0.mNodePercent
            r2.mNodePercent = r1
            float r1 = r0.mNodePercentDefault
            r2.setValNodePercentDefault(r1)
            float r1 = r0.mNodeValue
            r2.mNodeValue = r1
            boolean r1 = r0.mNodeReversed
            r2.mNodeReversed = r1
            float r0 = r0.mSmartStretchAncestralValue
            r2.mSmartStretchAncestralValue = r0
        L29:
            super.setProperties(r3)
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setScale(float r1) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setSmartStretch(boolean r1) {
            r0 = this;
            r0.setValIsSmartStretch(r1)
            r0.flagPositionAsDirty()
            return
    }

    public void setSmartStretchAncestralValue(float r1) {
            r0 = this;
            r0.mSmartStretchAncestralValue = r1
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void setStretchy(boolean r1) {
            r0 = this;
            return
    }

    protected abstract int setValNodeMethod(int r1);

    protected abstract float setValNodePercentDefault(float r1);

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValSegmentScale(float r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected void updatePosition() {
            r9 = this;
            boolean r0 = r9._flipFlag
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L55
            float r0 = r9._defaultLocalAngle
            float r0 = -r0
            r3 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 % r3
            r9._defaultLocalAngle = r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L15
            float r0 = r0 + r3
            r9._defaultLocalAngle = r0
        L15:
            float r0 = r9._defaultAngle
            float r0 = -r0
            float r0 = r0 % r3
            r9._defaultAngle = r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L22
            float r0 = r0 + r3
            r9._defaultAngle = r0
        L22:
            short r0 = r9._rightTriangleDirection
            int r0 = r0 * (-1)
            short r0 = (short) r0
            r9._rightTriangleDirection = r0
            int r0 = r9._curveRadius
            int r0 = r0 * (-1)
            r9._curveRadius = r0
            int r0 = r9._defaultCurveRadius
            int r0 = r0 * (-1)
            r9._defaultCurveRadius = r0
            int r0 = r9.getLimbType()
            boolean r3 = r9.getValUseGradient()
            if (r3 == 0) goto L52
            short r3 = r9.getGradientMode()
            if (r3 != 0) goto L52
            if (r0 == r1) goto L4c
            if (r0 == 0) goto L4c
            r3 = 6
            if (r0 != r3) goto L52
        L4c:
            boolean r0 = r9.mGradientReversed
            r0 = r0 ^ r1
            r9.setReverseGradient(r0)
        L52:
            r0 = 0
            r9._flipFlag = r0
        L55:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r9.getParentNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r9.getStickfigure()
            float r3 = r3.getScale()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r9.mEndNodeRef
            float r4 = r4.getGlobalX()
            float r5 = r0.getGlobalX()
            float r4 = r4 - r5
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r9.mEndNodeRef
            float r5 = r5.getGlobalY()
            float r6 = r0.getGlobalY()
            float r5 = r5 - r6
            float r6 = java.lang.Math.abs(r4)
            r7 = 1008981770(0x3c23d70a, float:0.01)
            r8 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L104
            float r6 = java.lang.Math.abs(r5)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L104
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r9.mEndNodeRef
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r0.getParentNode()
            if (r4 != r5) goto L97
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L99
        L97:
            r4 = 1065353216(0x3f800000, float:1.0)
        L99:
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r9.mEndNodeRef
            boolean r5 = r5.isMainNode()
            if (r5 == 0) goto Ld0
            float r5 = r0.getGlobalX()
            float r4 = r4 * r7
            float r6 = r0.getAngle()
            float r6 = com.badlogic.gdx.math.MathUtils.cosDeg(r6)
            float r6 = r6 * r4
            float r5 = r5 + r6
            float r6 = r0.getGlobalY()
            float r7 = r0.getAngle()
            float r7 = com.badlogic.gdx.math.MathUtils.sinDeg(r7)
            float r4 = r4 * r7
            float r6 = r6 + r4
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r9.mEndNodeRef
            float r4 = r4.getGlobalX()
            float r4 = r5 - r4
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r9.mEndNodeRef
            float r5 = r5.getGlobalY()
            goto L102
        Ld0:
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r9.mEndNodeRef
            float r5 = r5.getGlobalX()
            float r4 = r4 * r7
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r9.mEndNodeRef
            float r6 = r6.getAngle()
            float r6 = com.badlogic.gdx.math.MathUtils.cosDeg(r6)
            float r6 = r6 * r4
            float r5 = r5 + r6
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r9.mEndNodeRef
            float r6 = r6.getGlobalY()
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r9.mEndNodeRef
            float r7 = r7.getAngle()
            float r7 = com.badlogic.gdx.math.MathUtils.sinDeg(r7)
            float r4 = r4 * r7
            float r6 = r6 + r4
            float r4 = r0.getGlobalX()
            float r4 = r5 - r4
            float r5 = r0.getGlobalY()
        L102:
            float r5 = r6 - r5
        L104:
            float r6 = com.badlogic.gdx.math.MathUtils.atan2(r5, r4)
            r7 = 1113927392(0x42652ee0, float:57.295776)
            float r6 = r6 * r7
            float r0 = r0.getAngle()
            float r6 = r6 - r0
            r9._localAngle = r6
            float r4 = r4 * r4
            float r5 = r5 * r5
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r0 = (float) r4
            float r0 = r0 / r3
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r0 / r4
            r9.setValLength(r4)
            super.updatePosition()
            int r4 = r9.getValNodeMethod()
            if (r4 != r1) goto L160
            boolean r1 = r9.mNodeReversed
            if (r1 == 0) goto L13b
            float r1 = r9.getNodePercent()
            float r1 = r8 - r1
            goto L13f
        L13b:
            float r1 = r9.getNodePercent()
        L13f:
            boolean r4 = r9.mNodeReversed
            if (r4 == 0) goto L145
            float r1 = r8 - r1
        L145:
            float r1 = r1 * r0
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 / r4
            r9.mNodeValue = r1
            float r1 = r9.getNodeValue()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r4
            boolean r4 = r9.mNodeReversed
            if (r4 == 0) goto L159
            goto L15b
        L159:
            float r1 = r0 - r1
        L15b:
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r1, r2, r0)
            goto L187
        L160:
            float r1 = r9.getNodeValue()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r4
            boolean r4 = r9.mNodeReversed
            if (r4 == 0) goto L16d
            goto L16f
        L16d:
            float r1 = r0 - r1
        L16f:
            float r1 = com.badlogic.gdx.math.MathUtils.clamp(r1, r2, r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L178
            goto L17c
        L178:
            float r0 = r1 / r0
            float r2 = r8 - r0
        L17c:
            r9.mNodePercent = r2
            boolean r0 = r9.mNodeReversed
            if (r0 == 0) goto L184
            float r2 = r8 - r2
        L184:
            r9.mNodePercent = r2
            r0 = r1
        L187:
            float r1 = r9._cosAngle
            float r1 = r1 * r0
            float r1 = r1 * r3
            r9.mNodeLocalX = r1
            float r1 = r9._sinAngle
            float r1 = r1 * r0
            float r1 = r1 * r3
            r9.mNodeLocalY = r1
            boolean r0 = r9.getValIsSmartStretch()
            if (r0 == 0) goto L1aa
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r9.getStickfigure()
            boolean r0 = r0.smartStretchIsEnabled()
            if (r0 == 0) goto L1aa
            r9.applySmartStretchToChildren()
        L1aa:
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    public void useSegmentScale(boolean r1) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected void writeData(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            float r0 = r1.mNodeLocalX
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.mNodeLocalY
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.mNodePercent
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.getValNodePercentDefault()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.mNodeValue
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            int r0 = r1.getValNodeMethod()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            boolean r0 = r1.mNodeReversed
            r2.write(r0)
            float r0 = r1.mSmartStretchAncestralValue
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            super.writeData(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNode
    protected void writePositionalData(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            super.writePositionalData(r2)
            float r0 = r1.mNodeLocalX
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.mNodeLocalY
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.mNodeValue
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.mNodePercent
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.mSmartStretchAncestralValue
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            return
    }
}
