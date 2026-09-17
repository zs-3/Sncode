package com.badlogic.gdx.graphics.g3d.model;

/* loaded from: classes.dex */
public class Node {
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> children;
    public final com.badlogic.gdx.math.Matrix4 globalTransform;
    public java.lang.String id;
    public boolean inheritTransform;
    public boolean isAnimated;
    public final com.badlogic.gdx.math.Matrix4 localTransform;
    protected com.badlogic.gdx.graphics.g3d.model.Node parent;
    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodePart> parts;
    public final com.badlogic.gdx.math.Quaternion rotation;
    public final com.badlogic.gdx.math.Vector3 scale;
    public final com.badlogic.gdx.math.Vector3 translation;

    public Node() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.inheritTransform = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r3.translation = r0
            com.badlogic.gdx.math.Quaternion r0 = new com.badlogic.gdx.math.Quaternion
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r2)
            r3.rotation = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>(r2, r2, r2)
            r3.scale = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r3.localTransform = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r3.globalTransform = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 2
            r0.<init>(r1)
            r3.parts = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>(r1)
            r3.children = r0
            return
    }

    public static com.badlogic.gdx.graphics.g3d.model.Node getNode(com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r5, java.lang.String r6, boolean r7, boolean r8) {
            int r0 = r5.size
            r1 = 0
            if (r8 == 0) goto L1a
            r2 = 0
        L6:
            if (r2 >= r0) goto L2f
            java.lang.Object r3 = r5.get(r2)
            com.badlogic.gdx.graphics.g3d.model.Node r3 = (com.badlogic.gdx.graphics.g3d.model.Node) r3
            java.lang.String r4 = r3.id
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L17
            return r3
        L17:
            int r2 = r2 + 1
            goto L6
        L1a:
            r2 = 0
        L1b:
            if (r2 >= r0) goto L2f
            java.lang.Object r3 = r5.get(r2)
            com.badlogic.gdx.graphics.g3d.model.Node r3 = (com.badlogic.gdx.graphics.g3d.model.Node) r3
            java.lang.String r4 = r3.id
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L2c
            return r3
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            if (r7 == 0) goto L46
        L31:
            if (r1 >= r0) goto L46
            java.lang.Object r7 = r5.get(r1)
            com.badlogic.gdx.graphics.g3d.model.Node r7 = (com.badlogic.gdx.graphics.g3d.model.Node) r7
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r7 = r7.children
            r2 = 1
            com.badlogic.gdx.graphics.g3d.model.Node r7 = getNode(r7, r6, r2, r8)
            if (r7 == 0) goto L43
            return r7
        L43:
            int r1 = r1 + 1
            goto L31
        L46:
            r5 = 0
            return r5
    }

    public <T extends com.badlogic.gdx.graphics.g3d.model.Node> int addChild(T r2) {
            r1 = this;
            r0 = -1
            int r2 = r1.insertChild(r0, r2)
            return r2
    }

    public void calculateBoneTransforms(boolean r7) {
            r6 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodePart> r0 = r6.parts
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.g3d.model.NodePart r1 = (com.badlogic.gdx.graphics.g3d.model.NodePart) r1
            com.badlogic.gdx.utils.ArrayMap<com.badlogic.gdx.graphics.g3d.model.Node, com.badlogic.gdx.math.Matrix4> r2 = r1.invBoneBindTransforms
            if (r2 == 0) goto L6
            com.badlogic.gdx.math.Matrix4[] r3 = r1.bones
            if (r3 == 0) goto L6
            int r2 = r2.size
            int r3 = r3.length
            if (r2 == r3) goto L20
            goto L6
        L20:
            r3 = 0
        L21:
            if (r3 >= r2) goto L6
            com.badlogic.gdx.math.Matrix4[] r4 = r1.bones
            r4 = r4[r3]
            com.badlogic.gdx.utils.ArrayMap<com.badlogic.gdx.graphics.g3d.model.Node, com.badlogic.gdx.math.Matrix4> r5 = r1.invBoneBindTransforms
            K[] r5 = r5.keys
            com.badlogic.gdx.graphics.g3d.model.Node[] r5 = (com.badlogic.gdx.graphics.g3d.model.Node[]) r5
            r5 = r5[r3]
            com.badlogic.gdx.math.Matrix4 r5 = r5.globalTransform
            com.badlogic.gdx.math.Matrix4 r4 = r4.set(r5)
            com.badlogic.gdx.utils.ArrayMap<com.badlogic.gdx.graphics.g3d.model.Node, com.badlogic.gdx.math.Matrix4> r5 = r1.invBoneBindTransforms
            V[] r5 = r5.values
            com.badlogic.gdx.math.Matrix4[] r5 = (com.badlogic.gdx.math.Matrix4[]) r5
            r5 = r5[r3]
            r4.mul(r5)
            int r3 = r3 + 1
            goto L21
        L43:
            if (r7 == 0) goto L5c
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r7 = r6.children
            com.badlogic.gdx.utils.Array$ArrayIterator r7 = r7.iterator()
        L4b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r7.next()
            com.badlogic.gdx.graphics.g3d.model.Node r0 = (com.badlogic.gdx.graphics.g3d.model.Node) r0
            r1 = 1
            r0.calculateBoneTransforms(r1)
            goto L4b
        L5c:
            return
    }

    public com.badlogic.gdx.math.Matrix4 calculateLocalTransform() {
            r4 = this;
            boolean r0 = r4.isAnimated
            if (r0 != 0) goto Lf
            com.badlogic.gdx.math.Matrix4 r0 = r4.localTransform
            com.badlogic.gdx.math.Vector3 r1 = r4.translation
            com.badlogic.gdx.math.Quaternion r2 = r4.rotation
            com.badlogic.gdx.math.Vector3 r3 = r4.scale
            r0.set(r1, r2, r3)
        Lf:
            com.badlogic.gdx.math.Matrix4 r0 = r4.localTransform
            return r0
    }

    public void calculateTransforms(boolean r3) {
            r2 = this;
            r2.calculateLocalTransform()
            r2.calculateWorldTransform()
            if (r3 == 0) goto L1f
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r3 = r2.children
            com.badlogic.gdx.utils.Array$ArrayIterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.next()
            com.badlogic.gdx.graphics.g3d.model.Node r0 = (com.badlogic.gdx.graphics.g3d.model.Node) r0
            r1 = 1
            r0.calculateTransforms(r1)
            goto Le
        L1f:
            return
    }

    public com.badlogic.gdx.math.Matrix4 calculateWorldTransform() {
            r2 = this;
            boolean r0 = r2.inheritTransform
            if (r0 == 0) goto L16
            com.badlogic.gdx.graphics.g3d.model.Node r0 = r2.parent
            if (r0 == 0) goto L16
            com.badlogic.gdx.math.Matrix4 r1 = r2.globalTransform
            com.badlogic.gdx.math.Matrix4 r0 = r0.globalTransform
            com.badlogic.gdx.math.Matrix4 r0 = r1.set(r0)
            com.badlogic.gdx.math.Matrix4 r1 = r2.localTransform
            r0.mul(r1)
            goto L1d
        L16:
            com.badlogic.gdx.math.Matrix4 r0 = r2.globalTransform
            com.badlogic.gdx.math.Matrix4 r1 = r2.localTransform
            r0.set(r1)
        L1d:
            com.badlogic.gdx.math.Matrix4 r0 = r2.globalTransform
            return r0
    }

    public com.badlogic.gdx.graphics.g3d.model.Node getParent() {
            r1 = this;
            com.badlogic.gdx.graphics.g3d.model.Node r0 = r1.parent
            return r0
    }

    public <T extends com.badlogic.gdx.graphics.g3d.model.Node> int insertChild(int r3, T r4) {
            r2 = this;
            r0 = r2
        L1:
            if (r0 == 0) goto L12
            if (r0 == r4) goto La
            com.badlogic.gdx.graphics.g3d.model.Node r0 = r0.getParent()
            goto L1
        La:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r4 = "Cannot add a parent as a child"
            r3.<init>(r4)
            throw r3
        L12:
            com.badlogic.gdx.graphics.g3d.model.Node r0 = r4.getParent()
            if (r0 == 0) goto L27
            boolean r0 = r0.removeChild(r4)
            if (r0 == 0) goto L1f
            goto L27
        L1f:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r4 = "Could not remove child from its current parent"
            r3.<init>(r4)
            throw r3
        L27:
            if (r3 < 0) goto L34
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r0 = r2.children
            int r1 = r0.size
            if (r3 < r1) goto L30
            goto L34
        L30:
            r0.insert(r3, r4)
            goto L3c
        L34:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r3 = r2.children
            int r0 = r3.size
            r3.add(r4)
            r3 = r0
        L3c:
            r4.parent = r2
            return r3
    }

    public <T extends com.badlogic.gdx.graphics.g3d.model.Node> boolean removeChild(T r3) {
            r2 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r0 = r2.children
            r1 = 1
            boolean r0 = r0.removeValue(r3, r1)
            if (r0 != 0) goto Lb
            r3 = 0
            return r3
        Lb:
            r0 = 0
            r3.parent = r0
            return r1
    }
}
