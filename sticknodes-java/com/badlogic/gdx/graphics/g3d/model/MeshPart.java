package com.badlogic.gdx.graphics.g3d.model;

/* loaded from: classes.dex */
public class MeshPart {
    private static final com.badlogic.gdx.math.collision.BoundingBox bounds = null;
    public final com.badlogic.gdx.math.Vector3 center;
    public final com.badlogic.gdx.math.Vector3 halfExtents;
    public java.lang.String id;
    public com.badlogic.gdx.graphics.Mesh mesh;
    public int offset;
    public int primitiveType;
    public float radius;
    public int size;

    static {
            com.badlogic.gdx.math.collision.BoundingBox r0 = new com.badlogic.gdx.math.collision.BoundingBox
            r0.<init>()
            com.badlogic.gdx.graphics.g3d.model.MeshPart.bounds = r0
            return
    }

    public MeshPart() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.center = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.halfExtents = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.radius = r0
            return
    }

    public boolean equals(com.badlogic.gdx.graphics.g3d.model.MeshPart r3) {
            r2 = this;
            if (r3 == r2) goto L1f
            if (r3 == 0) goto L1d
            com.badlogic.gdx.graphics.Mesh r0 = r3.mesh
            com.badlogic.gdx.graphics.Mesh r1 = r2.mesh
            if (r0 != r1) goto L1d
            int r0 = r3.primitiveType
            int r1 = r2.primitiveType
            if (r0 != r1) goto L1d
            int r0 = r3.offset
            int r1 = r2.offset
            if (r0 != r1) goto L1d
            int r3 = r3.size
            int r0 = r2.size
            if (r3 != r0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = 1
        L20:
            return r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            if (r3 != r2) goto L8
            r3 = 1
            return r3
        L8:
            boolean r1 = r3 instanceof com.badlogic.gdx.graphics.g3d.model.MeshPart
            if (r1 != 0) goto Ld
            return r0
        Ld:
            com.badlogic.gdx.graphics.g3d.model.MeshPart r3 = (com.badlogic.gdx.graphics.g3d.model.MeshPart) r3
            boolean r3 = r2.equals(r3)
            return r3
    }

    public void update() {
            r4 = this;
            com.badlogic.gdx.graphics.Mesh r0 = r4.mesh
            com.badlogic.gdx.math.collision.BoundingBox r1 = com.badlogic.gdx.graphics.g3d.model.MeshPart.bounds
            int r2 = r4.offset
            int r3 = r4.size
            r0.calculateBoundingBox(r1, r2, r3)
            com.badlogic.gdx.math.Vector3 r0 = r4.center
            r1.getCenter(r0)
            com.badlogic.gdx.math.Vector3 r0 = r4.halfExtents
            com.badlogic.gdx.math.Vector3 r0 = r1.getDimensions(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.scl(r1)
            com.badlogic.gdx.math.Vector3 r0 = r4.halfExtents
            float r0 = r0.len()
            r4.radius = r0
            return
    }
}
