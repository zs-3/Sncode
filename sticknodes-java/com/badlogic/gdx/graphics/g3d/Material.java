package com.badlogic.gdx.graphics.g3d;

/* loaded from: classes.dex */
public class Material extends com.badlogic.gdx.graphics.g3d.Attributes {
    private static int counter;
    public java.lang.String id;

    static {
            return
    }

    public Material() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mtl"
            r0.append(r1)
            int r1 = com.badlogic.gdx.graphics.g3d.Material.counter
            int r1 = r1 + 1
            com.badlogic.gdx.graphics.g3d.Material.counter = r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            return
    }

    public Material(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            return
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attributes, java.util.Comparator
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.badlogic.gdx.graphics.g3d.Material
            if (r0 == 0) goto L1b
            if (r3 == r2) goto L19
            r0 = r3
            com.badlogic.gdx.graphics.g3d.Material r0 = (com.badlogic.gdx.graphics.g3d.Material) r0
            java.lang.String r0 = r0.id
            java.lang.String r1 = r2.id
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            boolean r3 = super.equals(r3)
            if (r3 == 0) goto L1b
        L19:
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            return r3
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attributes
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            java.lang.String r1 = r2.id
            int r1 = r1.hashCode()
            int r1 = r1 * 3
            int r0 = r0 + r1
            return r0
    }
}
