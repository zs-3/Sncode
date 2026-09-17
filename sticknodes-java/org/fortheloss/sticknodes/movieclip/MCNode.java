package org.fortheloss.sticknodes.movieclip;

/* loaded from: classes2.dex */
public class MCNode implements org.fortheloss.sticknodes.stickfigure.INode {
    private float _angle;
    private org.fortheloss.sticknodes.movieclip.MCNode _childNodeRef;
    private int _drawOrderIndex;
    private float _localAngle;
    private org.fortheloss.sticknodes.movieclip.MCReference _mcReferenceRef;
    private org.fortheloss.sticknodes.movieclip.MCNode _parentNodeRef;
    private boolean _positionIsDirty;
    private float _x;
    private float _y;

    public MCNode(org.fortheloss.sticknodes.movieclip.MCReference r3, org.fortheloss.sticknodes.movieclip.MCNode r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._drawOrderIndex = r0
            r1 = 0
            r2._x = r1
            r2._y = r1
            r2._localAngle = r1
            r2._angle = r1
            r1 = 1
            r2._positionIsDirty = r1
            r2._mcReferenceRef = r3
            r2._parentNodeRef = r4
            if (r4 == 0) goto L1b
            r4.setChildNode(r2)
        L1b:
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r2._parentNodeRef
            if (r3 != 0) goto L22
            r2._drawOrderIndex = r0
            goto L24
        L22:
            r2._drawOrderIndex = r1
        L24:
            return
    }

    public MCNode(org.fortheloss.sticknodes.movieclip.MCReference r2, org.fortheloss.sticknodes.movieclip.MCNode r3, org.fortheloss.sticknodes.movieclip.MCNode r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._drawOrderIndex = r0
            r0 = 0
            r1._x = r0
            r1._y = r0
            r1._localAngle = r0
            r1._angle = r0
            r0 = 1
            r1._positionIsDirty = r0
            r1._mcReferenceRef = r2
            r1._parentNodeRef = r3
            if (r3 == 0) goto L1b
            r3.setChildNode(r1)
        L1b:
            int r2 = r4._drawOrderIndex
            r1._drawOrderIndex = r2
            float r2 = r4._x
            r1._x = r2
            float r2 = r4._y
            r1._y = r2
            float r2 = r4._localAngle
            r1._localAngle = r2
            float r2 = r4._angle
            r1._angle = r2
            return
    }

    private void setChildNode(org.fortheloss.sticknodes.movieclip.MCNode r1) {
            r0 = this;
            r0._childNodeRef = r1
            return
    }

    private void updatePosition() {
            r4 = this;
            r0 = 0
            r4._positionIsDirty = r0
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r4._parentNodeRef
            r1 = 0
            if (r0 == 0) goto L3d
            float r2 = r4._localAngle
            float r0 = r0.getAngle()
            float r2 = r2 + r0
            r4._angle = r2
            r0 = 1135869952(0x43b40000, float:360.0)
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 < 0) goto L1b
            float r2 = r2 - r0
            r4._angle = r2
            goto L22
        L1b:
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L22
            float r2 = r2 + r0
            r4._angle = r2
        L22:
            r0 = 1119092736(0x42b40000, float:90.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            float r0 = r4._angle
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r2 = r4._angle
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r0 = r0 * r1
            r4._x = r0
            float r2 = r2 * r1
            r4._y = r2
            goto L7f
        L3d:
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r4._mcReferenceRef
            boolean r0 = r0.isJoined()
            if (r0 == 0) goto L77
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r4._mcReferenceRef
            boolean r0 = r0.getKeepJoinDuringInterpolation()
            if (r0 == 0) goto L77
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r4._mcReferenceRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            float r0 = r0.getAngle()
            org.fortheloss.sticknodes.movieclip.MCReference r2 = r4._mcReferenceRef
            float r2 = r2.getJoinOffsetAngle()
            float r0 = r0 + r2
            r4._localAngle = r0
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r4._mcReferenceRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r0.getJoinedToNode()
            float r2 = r2.getGlobalX()
            org.fortheloss.sticknodes.movieclip.MCReference r3 = r4._mcReferenceRef
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getJoinedToNode()
            float r3 = r3.getGlobalY()
            r0.setPosition(r2, r3)
        L77:
            float r0 = r4._localAngle
            r4._angle = r0
            r4._x = r1
            r4._y = r1
        L7f:
            return
    }

    public void beginReadingPositionalData(int r1, java.io.DataInputStream r2) throws java.io.IOException {
            r0 = this;
            float r1 = r2.readFloat()
            r0._localAngle = r1
            return
    }

    public void beginWritingPositionalData(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            float r0 = r1._localAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._mcReferenceRef = r0
            r1._parentNodeRef = r0
            r1._childNodeRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public com.badlogic.gdx.math.Vector2 dragTo(float r3, float r4) {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r2._parentNodeRef
            if (r0 != 0) goto La
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._mcReferenceRef
            r0.setPosition(r3, r4)
            goto L29
        La:
            float r0 = r0.getGlobalY()
            float r4 = r4 - r0
            double r0 = (double) r4
            org.fortheloss.sticknodes.movieclip.MCNode r4 = r2._parentNodeRef
            float r4 = r4.getGlobalX()
            float r3 = r3 - r4
            double r3 = (double) r3
            double r3 = java.lang.Math.atan2(r0, r3)
            float r3 = (float) r3
            r4 = 1113927392(0x42652ee0, float:57.295776)
            float r3 = r3 * r4
            org.fortheloss.sticknodes.movieclip.MCNode r4 = r2._parentNodeRef
            float r4 = r4._angle
            float r3 = r3 - r4
            r2._localAngle = r3
        L29:
            r2.flagPositionAsDirty()
            r3 = 0
            return r3
    }

    public void drawNode(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r15, float r16, float r17, float r18, boolean r19, boolean r20, boolean r21) {
            r14 = this;
            r0 = r14
            r1 = r15
            com.badlogic.gdx.graphics.g2d.Batch r2 = r15.getBatch()
            org.fortheloss.sticknodes.movieclip.MCReference r3 = r0._mcReferenceRef
            boolean r3 = r3.isLocked()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L1b
            org.fortheloss.sticknodes.movieclip.MCReference r3 = r0._mcReferenceRef
            byte r3 = r3.isLockedToCamera()
            if (r3 == 0) goto L19
            goto L1b
        L19:
            r3 = 0
            goto L1c
        L1b:
            r3 = 1
        L1c:
            org.fortheloss.sticknodes.movieclip.MCReference r6 = r0._mcReferenceRef
            boolean r6 = r6.isJoined()
            r7 = -1
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r0._x
            float r9 = r16 + r9
            float r10 = r0._y
            float r10 = r17 + r10
            org.fortheloss.sticknodes.movieclip.MCNode r11 = r0._parentNodeRef
            r12 = 3
            r13 = 1069547520(0x3fc00000, float:1.5)
            if (r11 != 0) goto L6f
            if (r6 == 0) goto L4b
            if (r21 == 0) goto L49
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r3 = r15.getNode(r12)
            r3.drawNode(r2, r9, r10, r8)
            r3 = 31
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r1 = r15.getNode(r3)
            r1.drawNode(r2, r9, r10, r8)
            return
        L49:
            r4 = -1
            goto L7a
        L4b:
            if (r21 == 0) goto L56
            if (r3 == 0) goto L54
            r4 = 15
        L51:
            r8 = 1069547520(0x3fc00000, float:1.5)
            goto L7a
        L54:
            r4 = 7
            goto L7a
        L56:
            if (r19 == 0) goto L68
            if (r20 == 0) goto L61
            if (r3 == 0) goto L5f
            r4 = 14
            goto L51
        L5f:
            r4 = 6
            goto L7a
        L61:
            if (r3 == 0) goto L66
            r4 = 13
            goto L51
        L66:
            r4 = 5
            goto L7a
        L68:
            if (r3 == 0) goto L6d
            r4 = 12
            goto L51
        L6d:
            r4 = 4
            goto L7a
        L6f:
            if (r21 == 0) goto L73
            r4 = 3
            goto L7a
        L73:
            if (r19 == 0) goto L7a
            if (r20 == 0) goto L79
            r4 = 2
            goto L7a
        L79:
            r4 = 1
        L7a:
            if (r4 < 0) goto L83
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r1 = r15.getNode(r4)
            r1.drawNode(r2, r9, r10, r8)
        L83:
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public void flagPositionAsDirty() {
            r1 = this;
            r0 = 1
            r1._positionIsDirty = r0
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._childNodeRef
            if (r0 == 0) goto La
            r0.flagPositionAsDirty()
        La:
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getAngle() {
            r1 = this;
            r1.validatePosition()
            float r0 = r1._angle
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public int getDrawOrderIndex() {
            r1 = this;
            int r0 = r1._drawOrderIndex
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public org.fortheloss.sticknodes.animationscreen.IDrawableFigure getDrawableFigure() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._mcReferenceRef
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getGlobalX() {
            r2 = this;
            float r0 = r2.getX()
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._mcReferenceRef
            float r1 = r1.getX()
            float r0 = r0 + r1
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getGlobalY() {
            r2 = this;
            float r0 = r2.getY()
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._mcReferenceRef
            float r1 = r1.getY()
            float r0 = r0 + r1
            return r0
    }

    public org.fortheloss.sticknodes.movieclip.MCReference getMCReference() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._mcReferenceRef
            return r0
    }

    public void getProperties(org.fortheloss.sticknodes.data.useractions.MCNodeProperties r2) {
            r1 = this;
            r1.validatePosition()
            float r0 = r1._x
            r2.x = r0
            float r0 = r1._y
            r2.y = r0
            float r0 = r1._localAngle
            r2.localAngle = r0
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getX() {
            r1 = this;
            r1.validatePosition()
            float r0 = r1._x
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getY() {
            r1 = this;
            r1.validatePosition()
            float r0 = r1._y
            return r0
    }

    public void interpolateValues(float r3, org.fortheloss.sticknodes.movieclip.MCNode r4, org.fortheloss.sticknodes.movieclip.MCNode r5) {
            r2 = this;
            if (r5 == 0) goto L17
            float r4 = r4._localAngle
            float r5 = r5._localAngle
            float r5 = r5 - r4
            r0 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 % r0
            r1 = 1141309440(0x44070000, float:540.0)
            float r5 = r5 + r1
            float r5 = r5 % r0
            r0 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 - r0
            float r5 = r5 * r3
            float r4 = r4 + r5
            r2._localAngle = r4
            goto L1b
        L17:
            float r3 = r4._localAngle
            r2._localAngle = r3
        L1b:
            r2.flagPositionAsDirty()
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public boolean isMainNode() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._parentNodeRef
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void rotate(float r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L5
            r1._localAngle = r2
            goto La
        L5:
            float r3 = r1._localAngle
            float r3 = r3 + r2
            r1._localAngle = r3
        La:
            float r2 = r1._localAngle
            r3 = 0
            r0 = 1135869952(0x43b40000, float:360.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L17
            float r2 = r2 + r0
            r1._localAngle = r2
            goto La
        L17:
            float r2 = r1._localAngle
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 < 0) goto L21
            float r2 = r2 - r0
            r1._localAngle = r2
            goto L17
        L21:
            r1.flagPositionAsDirty()
            return
    }

    public void setLocalAngle(float r3) {
            r2 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            r2._localAngle = r3
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto Ld
            float r3 = r3 + r0
            r2._localAngle = r3
        Ld:
            r2.flagPositionAsDirty()
            return
    }

    public void setProperties(org.fortheloss.sticknodes.data.useractions.MCNodeProperties r2) {
            r1 = this;
            r1.flagPositionAsDirty()
            float r0 = r2.x
            r1._x = r0
            float r0 = r2.y
            r1._y = r0
            float r2 = r2.localAngle
            r1._localAngle = r2
            r1.validatePosition()
            return
    }

    public void validatePosition() {
            r1 = this;
            boolean r0 = r1._positionIsDirty
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1._positionIsDirty = r0
            r1.updatePosition()
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._childNodeRef
            if (r0 == 0) goto L12
            r0.updatePosition()
        L12:
            return
    }
}
