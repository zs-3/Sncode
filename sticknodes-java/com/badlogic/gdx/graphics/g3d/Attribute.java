package com.badlogic.gdx.graphics.g3d;

/* loaded from: classes.dex */
public abstract class Attribute implements java.lang.Comparable<com.badlogic.gdx.graphics.g3d.Attribute> {
    private static final com.badlogic.gdx.utils.Array<java.lang.String> types = null;
    public final long type;
    private final int typeBit;

    static {
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            com.badlogic.gdx.graphics.g3d.Attribute.types = r0
            return
    }

    protected Attribute(long r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            int r1 = java.lang.Long.numberOfTrailingZeros(r1)
            r0.typeBit = r1
            return
    }

    public static final java.lang.String getAttributeAlias(long r7) {
            r0 = -1
        L1:
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L17
            int r0 = r0 + 1
            r3 = 63
            if (r0 >= r3) goto L17
            long r3 = r7 >> r0
            r5 = 1
            long r3 = r3 & r5
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L17
            goto L1
        L17:
            if (r0 < 0) goto L26
            com.badlogic.gdx.utils.Array<java.lang.String> r7 = com.badlogic.gdx.graphics.g3d.Attribute.types
            int r8 = r7.size
            if (r0 >= r8) goto L26
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            goto L27
        L26:
            r7 = 0
        L27:
            return r7
    }

    public static final long getAttributeType(java.lang.String r3) {
            r0 = 0
        L1:
            com.badlogic.gdx.utils.Array<java.lang.String> r1 = com.badlogic.gdx.graphics.g3d.Attribute.types
            int r2 = r1.size
            if (r0 >= r2) goto L1b
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L18
            r1 = 1
            long r0 = r1 << r0
            return r0
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            r0 = 0
            return r0
    }

    protected static final long register(java.lang.String r5) {
            long r0 = getAttributeType(r5)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lb
            return r0
        Lb:
            com.badlogic.gdx.utils.Array<java.lang.String> r0 = com.badlogic.gdx.graphics.g3d.Attribute.types
            int r1 = r0.size
            r2 = 64
            if (r1 >= r2) goto L1f
            r0.add(r5)
            r1 = 1
            int r5 = r0.size
            int r5 = r5 + (-1)
            long r0 = r1 << r5
            return r0
        L1f:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot register "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ", maximum registered attribute count reached."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    protected boolean equals(com.badlogic.gdx.graphics.g3d.Attribute r2) {
            r1 = this;
            int r2 = r2.hashCode()
            int r0 = r1.hashCode()
            if (r2 != r0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            if (r7 != r6) goto L8
            r7 = 1
            return r7
        L8:
            boolean r1 = r7 instanceof com.badlogic.gdx.graphics.g3d.Attribute
            if (r1 != 0) goto Ld
            return r0
        Ld:
            com.badlogic.gdx.graphics.g3d.Attribute r7 = (com.badlogic.gdx.graphics.g3d.Attribute) r7
            long r1 = r6.type
            long r3 = r7.type
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L18
            return r0
        L18:
            boolean r7 = r6.equals(r7)
            return r7
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.typeBit
            int r0 = r0 * 7489
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.type
            java.lang.String r0 = getAttributeAlias(r0)
            return r0
    }
}
