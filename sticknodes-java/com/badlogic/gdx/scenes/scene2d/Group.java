package com.badlogic.gdx.scenes.scene2d;

/* loaded from: classes.dex */
public class Group extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.scenes.scene2d.utils.Cullable {
    private static final com.badlogic.gdx.math.Vector2 tmp = null;
    final com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> children;
    private final com.badlogic.gdx.math.Matrix4 computedTransform;
    private com.badlogic.gdx.math.Rectangle cullingArea;
    private final com.badlogic.gdx.math.Matrix4 oldTransform;
    boolean transform;
    private final com.badlogic.gdx.math.Affine2 worldTransform;

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.Group.tmp = r0
            return
    }

    public Group() {
            r4 = this;
            r4.<init>()
            com.badlogic.gdx.utils.SnapshotArray r0 = new com.badlogic.gdx.utils.SnapshotArray
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.Actor> r1 = com.badlogic.gdx.scenes.scene2d.Actor.class
            r2 = 1
            r3 = 4
            r0.<init>(r2, r3, r1)
            r4.children = r0
            com.badlogic.gdx.math.Affine2 r0 = new com.badlogic.gdx.math.Affine2
            r0.<init>()
            r4.worldTransform = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r4.computedTransform = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r4.oldTransform = r0
            r4.transform = r2
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r5) {
            r4 = this;
            super.act(r5)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r4.children
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.scenes.scene2d.Actor[] r0 = (com.badlogic.gdx.scenes.scene2d.Actor[]) r0
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r1 = r4.children
            int r1 = r1.size
            r2 = 0
        L10:
            if (r2 >= r1) goto L1a
            r3 = r0[r2]
            r3.act(r5)
            int r2 = r2 + 1
            goto L10
        L1a:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r5 = r4.children
            r5.end()
            return
    }

    public void addActor(com.badlogic.gdx.scenes.scene2d.Actor r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r3.parent
            if (r0 == 0) goto Lb
            if (r0 != r2) goto L7
            return
        L7:
            r1 = 0
            r0.removeActor(r3, r1)
        Lb:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r2.children
            r0.add(r3)
            r3.setParent(r2)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            r3.setStage(r0)
            r2.childrenChanged()
            return
    }

    public void addActorAt(int r3, com.badlogic.gdx.scenes.scene2d.Actor r4) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r4.parent
            if (r0 == 0) goto Lb
            if (r0 != r2) goto L7
            return
        L7:
            r1 = 0
            r0.removeActor(r4, r1)
        Lb:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r2.children
            int r1 = r0.size
            if (r3 < r1) goto L15
            r0.add(r4)
            goto L18
        L15:
            r0.insert(r3, r4)
        L18:
            r4.setParent(r2)
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r2.getStage()
            r4.setStage(r3)
            r2.childrenChanged()
            return
    }

    protected void applyTransform(com.badlogic.gdx.graphics.g2d.Batch r3, com.badlogic.gdx.math.Matrix4 r4) {
            r2 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r2.oldTransform
            com.badlogic.gdx.math.Matrix4 r1 = r3.getTransformMatrix()
            r0.set(r1)
            r3.setTransformMatrix(r4)
            return
    }

    protected void applyTransform(com.badlogic.gdx.graphics.glutils.ShapeRenderer r3, com.badlogic.gdx.math.Matrix4 r4) {
            r2 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r2.oldTransform
            com.badlogic.gdx.math.Matrix4 r1 = r3.getTransformMatrix()
            r0.set(r1)
            r3.setTransformMatrix(r4)
            r3.flush()
            return
    }

    protected void childrenChanged() {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void clear() {
            r1 = this;
            super.clear()
            r0 = 1
            r1.clearChildren(r0)
            return
    }

    public void clearChildren() {
            r1 = this;
            r0 = 1
            r1.clearChildren(r0)
            return
    }

    public void clearChildren(boolean r6) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r5.children
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.scenes.scene2d.Actor[] r0 = (com.badlogic.gdx.scenes.scene2d.Actor[]) r0
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r1 = r5.children
            int r1 = r1.size
            r2 = 0
        Ld:
            if (r2 >= r1) goto L26
            r3 = r0[r2]
            if (r6 == 0) goto L1c
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r5.getStage()
            if (r4 == 0) goto L1c
            r4.unfocus(r3)
        L1c:
            r4 = 0
            r3.setStage(r4)
            r3.setParent(r4)
            int r2 = r2 + 1
            goto Ld
        L26:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r6 = r5.children
            r6.end()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r6 = r5.children
            r6.clear()
            r5.childrenChanged()
            return
    }

    protected com.badlogic.gdx.math.Matrix4 computeTransform() {
            r9 = this;
            com.badlogic.gdx.math.Affine2 r6 = r9.worldTransform
            float r7 = r9.originX
            float r8 = r9.originY
            float r0 = r9.x
            float r1 = r0 + r7
            float r0 = r9.y
            float r2 = r0 + r8
            float r3 = r9.rotation
            float r4 = r9.scaleX
            float r5 = r9.scaleY
            r0 = r6
            r0.setToTrnRotScl(r1, r2, r3, r4, r5)
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 != 0) goto L21
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto L26
        L21:
            float r0 = -r7
            float r1 = -r8
            r6.translate(r0, r1)
        L26:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r9.parent
        L28:
            if (r0 == 0) goto L32
            boolean r1 = r0.transform
            if (r1 == 0) goto L2f
            goto L32
        L2f:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.parent
            goto L28
        L32:
            if (r0 == 0) goto L39
            com.badlogic.gdx.math.Affine2 r0 = r0.worldTransform
            r6.preMul(r0)
        L39:
            com.badlogic.gdx.math.Matrix4 r0 = r9.computedTransform
            r0.set(r6)
            com.badlogic.gdx.math.Matrix4 r0 = r9.computedTransform
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Group debugAll() {
            r1 = this;
            r0 = 1
            r1.setDebug(r0, r0)
            return r1
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r2, float r3) {
            r1 = this;
            boolean r0 = r1.transform
            if (r0 == 0) goto Lb
            com.badlogic.gdx.math.Matrix4 r0 = r1.computeTransform()
            r1.applyTransform(r2, r0)
        Lb:
            r1.drawChildren(r2, r3)
            boolean r3 = r1.transform
            if (r3 == 0) goto L15
            r1.resetTransform(r2)
        L15:
            return
    }

    protected void drawChildren(com.badlogic.gdx.graphics.g2d.Batch r18, float r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.badlogic.gdx.graphics.Color r2 = r0.color
            float r2 = r2.a
            float r2 = r2 * r19
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r3 = r0.children
            java.lang.Object[] r4 = r3.begin()
            com.badlogic.gdx.scenes.scene2d.Actor[] r4 = (com.badlogic.gdx.scenes.scene2d.Actor[]) r4
            com.badlogic.gdx.math.Rectangle r5 = r0.cullingArea
            r6 = 0
            r7 = 0
            if (r5 == 0) goto La0
            float r8 = r5.x
            float r9 = r5.width
            float r9 = r9 + r8
            float r10 = r5.y
            float r5 = r5.height
            float r5 = r5 + r10
            boolean r11 = r0.transform
            if (r11 == 0) goto L53
            int r7 = r3.size
        L28:
            if (r6 >= r7) goto Le6
            r11 = r4[r6]
            boolean r12 = r11.isVisible()
            if (r12 != 0) goto L33
            goto L50
        L33:
            float r12 = r11.x
            float r13 = r11.y
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 > 0) goto L50
            int r14 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r14 > 0) goto L50
            float r14 = r11.width
            float r12 = r12 + r14
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 < 0) goto L50
            float r12 = r11.height
            float r13 = r13 + r12
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 < 0) goto L50
            r11.draw(r1, r2)
        L50:
            int r6 = r6 + 1
            goto L28
        L53:
            float r11 = r0.x
            float r12 = r0.y
            r0.x = r7
            r0.y = r7
            int r7 = r3.size
        L5d:
            if (r6 >= r7) goto L9b
            r13 = r4[r6]
            boolean r14 = r13.isVisible()
            if (r14 != 0) goto L68
            goto L94
        L68:
            float r14 = r13.x
            float r15 = r13.y
            int r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r16 > 0) goto L94
            int r16 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r16 > 0) goto L94
            r19 = r5
            float r5 = r13.width
            float r5 = r5 + r14
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L96
            float r5 = r13.height
            float r5 = r5 + r15
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 < 0) goto L96
            float r5 = r14 + r11
            r13.x = r5
            float r5 = r15 + r12
            r13.y = r5
            r13.draw(r1, r2)
            r13.x = r14
            r13.y = r15
            goto L96
        L94:
            r19 = r5
        L96:
            int r6 = r6 + 1
            r5 = r19
            goto L5d
        L9b:
            r0.x = r11
            r0.y = r12
            goto Le6
        La0:
            boolean r5 = r0.transform
            if (r5 == 0) goto Lb7
            int r5 = r3.size
        La6:
            if (r6 >= r5) goto Le6
            r7 = r4[r6]
            boolean r8 = r7.isVisible()
            if (r8 != 0) goto Lb1
            goto Lb4
        Lb1:
            r7.draw(r1, r2)
        Lb4:
            int r6 = r6 + 1
            goto La6
        Lb7:
            float r5 = r0.x
            float r8 = r0.y
            r0.x = r7
            r0.y = r7
            int r7 = r3.size
        Lc1:
            if (r6 >= r7) goto Le2
            r9 = r4[r6]
            boolean r10 = r9.isVisible()
            if (r10 != 0) goto Lcc
            goto Ldf
        Lcc:
            float r10 = r9.x
            float r11 = r9.y
            float r12 = r10 + r5
            r9.x = r12
            float r12 = r11 + r8
            r9.y = r12
            r9.draw(r1, r2)
            r9.x = r10
            r9.y = r11
        Ldf:
            int r6 = r6 + 1
            goto Lc1
        Le2:
            r0.x = r5
            r0.y = r8
        Le6:
            r3.end()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void drawDebug(com.badlogic.gdx.graphics.glutils.ShapeRenderer r2) {
            r1 = this;
            r1.drawDebugBounds(r2)
            boolean r0 = r1.transform
            if (r0 == 0) goto Le
            com.badlogic.gdx.math.Matrix4 r0 = r1.computeTransform()
            r1.applyTransform(r2, r0)
        Le:
            r1.drawDebugChildren(r2)
            boolean r0 = r1.transform
            if (r0 == 0) goto L18
            r1.resetTransform(r2)
        L18:
            return
    }

    protected void drawDebugChildren(com.badlogic.gdx.graphics.glutils.ShapeRenderer r11) {
            r10 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.children
            java.lang.Object[] r1 = r0.begin()
            com.badlogic.gdx.scenes.scene2d.Actor[] r1 = (com.badlogic.gdx.scenes.scene2d.Actor[]) r1
            boolean r2 = r10.transform
            r3 = 0
            if (r2 == 0) goto L2f
            int r2 = r0.size
        Lf:
            if (r3 >= r2) goto L2b
            r4 = r1[r3]
            boolean r5 = r4.isVisible()
            if (r5 != 0) goto L1a
            goto L28
        L1a:
            boolean r5 = r4.getDebug()
            if (r5 != 0) goto L25
            boolean r5 = r4 instanceof com.badlogic.gdx.scenes.scene2d.Group
            if (r5 != 0) goto L25
            goto L28
        L25:
            r4.drawDebug(r11)
        L28:
            int r3 = r3 + 1
            goto Lf
        L2b:
            r11.flush()
            goto L6a
        L2f:
            float r2 = r10.x
            float r4 = r10.y
            r5 = 0
            r10.x = r5
            r10.y = r5
            int r5 = r0.size
        L3a:
            if (r3 >= r5) goto L66
            r6 = r1[r3]
            boolean r7 = r6.isVisible()
            if (r7 != 0) goto L45
            goto L63
        L45:
            boolean r7 = r6.getDebug()
            if (r7 != 0) goto L50
            boolean r7 = r6 instanceof com.badlogic.gdx.scenes.scene2d.Group
            if (r7 != 0) goto L50
            goto L63
        L50:
            float r7 = r6.x
            float r8 = r6.y
            float r9 = r7 + r2
            r6.x = r9
            float r9 = r8 + r4
            r6.y = r9
            r6.drawDebug(r11)
            r6.x = r7
            r6.y = r8
        L63:
            int r3 = r3 + 1
            goto L3a
        L66:
            r10.x = r2
            r10.y = r4
        L6a:
            r0.end()
            return
    }

    public com.badlogic.gdx.scenes.scene2d.Actor getChild(int r2) {
            r1 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r1.children
            java.lang.Object r2 = r0.get(r2)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = (com.badlogic.gdx.scenes.scene2d.Actor) r2
            return r2
    }

    public com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> getChildren() {
            r1 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r1.children
            return r0
    }

    public boolean hasChildren() {
            r1 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r1.children
            int r0 = r0.size
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public com.badlogic.gdx.scenes.scene2d.Actor hit(float r7, float r8, boolean r9) {
            r6 = this;
            r0 = 0
            if (r9 == 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = r6.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            if (r1 != r2) goto Lc
            return r0
        Lc:
            boolean r1 = r6.isVisible()
            if (r1 != 0) goto L13
            return r0
        L13:
            com.badlogic.gdx.math.Vector2 r0 = com.badlogic.gdx.scenes.scene2d.Group.tmp
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r1 = r6.children
            T[] r2 = r1.items
            com.badlogic.gdx.scenes.scene2d.Actor[] r2 = (com.badlogic.gdx.scenes.scene2d.Actor[]) r2
            int r1 = r1.size
            int r1 = r1 + (-1)
        L1f:
            if (r1 < 0) goto L38
            r3 = r2[r1]
            com.badlogic.gdx.math.Vector2 r4 = r0.set(r7, r8)
            r3.parentToLocalCoordinates(r4)
            float r4 = r0.x
            float r5 = r0.y
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.hit(r4, r5, r9)
            if (r3 == 0) goto L35
            return r3
        L35:
            int r1 = r1 + (-1)
            goto L1f
        L38:
            com.badlogic.gdx.scenes.scene2d.Actor r7 = super.hit(r7, r8, r9)
            return r7
    }

    public boolean isTransform() {
            r1 = this;
            boolean r0 = r1.transform
            return r0
    }

    public boolean removeActor(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.removeActor(r2, r0)
            return r2
    }

    public boolean removeActor(com.badlogic.gdx.scenes.scene2d.Actor r3, boolean r4) {
            r2 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r2.children
            r1 = 1
            int r3 = r0.indexOf(r3, r1)
            r0 = -1
            if (r3 != r0) goto Lc
            r3 = 0
            return r3
        Lc:
            r2.removeActorAt(r3, r4)
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.Actor removeActorAt(int r2, boolean r3) {
            r1 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r1.children
            java.lang.Object r2 = r0.removeIndex(r2)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = (com.badlogic.gdx.scenes.scene2d.Actor) r2
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1.getStage()
            if (r0 == 0) goto L16
            if (r3 == 0) goto L13
            r0.unfocus(r2)
        L13:
            r0.actorRemoved(r2)
        L16:
            r3 = 0
            r2.setParent(r3)
            r2.setStage(r3)
            r1.childrenChanged()
            return r2
    }

    protected void resetTransform(com.badlogic.gdx.graphics.g2d.Batch r2) {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.oldTransform
            r2.setTransformMatrix(r0)
            return
    }

    protected void resetTransform(com.badlogic.gdx.graphics.glutils.ShapeRenderer r2) {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.oldTransform
            r2.setTransformMatrix(r0)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Cullable
    public void setCullingArea(com.badlogic.gdx.math.Rectangle r1) {
            r0 = this;
            r0.cullingArea = r1
            return
    }

    public void setDebug(boolean r4, boolean r5) {
            r3 = this;
            r3.setDebug(r4)
            if (r5 == 0) goto L25
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r3.children
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.scenes.scene2d.Actor r1 = (com.badlogic.gdx.scenes.scene2d.Actor) r1
            boolean r2 = r1 instanceof com.badlogic.gdx.scenes.scene2d.Group
            if (r2 == 0) goto L21
            com.badlogic.gdx.scenes.scene2d.Group r1 = (com.badlogic.gdx.scenes.scene2d.Group) r1
            r1.setDebug(r4, r5)
            goto Lb
        L21:
            r1.setDebug(r4)
            goto Lb
        L25:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    protected void setStage(com.badlogic.gdx.scenes.scene2d.Stage r5) {
            r4 = this;
            super.setStage(r5)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r4.children
            T[] r1 = r0.items
            com.badlogic.gdx.scenes.scene2d.Actor[] r1 = (com.badlogic.gdx.scenes.scene2d.Actor[]) r1
            int r0 = r0.size
            r2 = 0
        Lc:
            if (r2 >= r0) goto L16
            r3 = r1[r2]
            r3.setStage(r5)
            int r2 = r2 + 1
            goto Lc
        L16:
            return
    }

    public void setTransform(boolean r1) {
            r0 = this;
            r0.transform = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            r1 = 1
            r3.toString(r0, r1)
            int r2 = r0.length()
            int r2 = r2 - r1
            r0.setLength(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    void toString(java.lang.StringBuilder r8, int r9) {
            r7 = this;
            java.lang.String r0 = super.toString()
            r8.append(r0)
            r0 = 10
            r8.append(r0)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r1 = r7.children
            java.lang.Object[] r1 = r1.begin()
            com.badlogic.gdx.scenes.scene2d.Actor[] r1 = (com.badlogic.gdx.scenes.scene2d.Actor[]) r1
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r2 = r7.children
            int r2 = r2.size
            r3 = 0
            r4 = 0
        L1a:
            if (r4 >= r2) goto L3e
            r5 = 0
        L1d:
            if (r5 >= r9) goto L27
            java.lang.String r6 = "|  "
            r8.append(r6)
            int r5 = r5 + 1
            goto L1d
        L27:
            r5 = r1[r4]
            boolean r6 = r5 instanceof com.badlogic.gdx.scenes.scene2d.Group
            if (r6 == 0) goto L35
            com.badlogic.gdx.scenes.scene2d.Group r5 = (com.badlogic.gdx.scenes.scene2d.Group) r5
            int r6 = r9 + 1
            r5.toString(r8, r6)
            goto L3b
        L35:
            r8.append(r5)
            r8.append(r0)
        L3b:
            int r4 = r4 + 1
            goto L1a
        L3e:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r8 = r7.children
            r8.end()
            return
    }
}
