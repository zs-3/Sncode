package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public final class VertexAttribute {
    public java.lang.String alias;
    public final boolean normalized;
    public final int numComponents;
    public int offset;
    public final int type;
    public int unit;
    public final int usage;
    private final int usageIndex;

    public VertexAttribute(int r8, int r9, int r10, boolean r11, java.lang.String r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public VertexAttribute(int r1, int r2, int r3, boolean r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.usage = r1
            r0.numComponents = r2
            r0.type = r3
            r0.normalized = r4
            r0.alias = r5
            r0.unit = r6
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
            r0.usageIndex = r1
            return
    }

    public VertexAttribute(int r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public VertexAttribute(int r10, int r11, java.lang.String r12, int r13) {
            r9 = this;
            r0 = 4
            if (r10 != r0) goto L8
            r1 = 5121(0x1401, float:7.176E-42)
            r5 = 5121(0x1401, float:7.176E-42)
            goto Lc
        L8:
            r1 = 5126(0x1406, float:7.183E-42)
            r5 = 5126(0x1406, float:7.183E-42)
        Lc:
            if (r10 != r0) goto L11
            r0 = 1
            r6 = 1
            goto L13
        L11:
            r0 = 0
            r6 = 0
        L13:
            r2 = r9
            r3 = r10
            r4 = r11
            r7 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
    }

    public static com.badlogic.gdx.graphics.VertexAttribute Binormal() {
            com.badlogic.gdx.graphics.VertexAttribute r0 = new com.badlogic.gdx.graphics.VertexAttribute
            r1 = 256(0x100, float:3.59E-43)
            r2 = 3
            java.lang.String r3 = "a_binormal"
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.badlogic.gdx.graphics.VertexAttribute BoneWeight(int r4) {
            com.badlogic.gdx.graphics.VertexAttribute r0 = new com.badlogic.gdx.graphics.VertexAttribute
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "a_boneWeight"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 64
            r3 = 2
            r0.<init>(r2, r3, r1, r4)
            return r0
    }

    public static com.badlogic.gdx.graphics.VertexAttribute ColorPacked() {
            com.badlogic.gdx.graphics.VertexAttribute r6 = new com.badlogic.gdx.graphics.VertexAttribute
            r1 = 4
            r2 = 4
            r3 = 5121(0x1401, float:7.176E-42)
            r4 = 1
            java.lang.String r5 = "a_color"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static com.badlogic.gdx.graphics.VertexAttribute ColorUnpacked() {
            com.badlogic.gdx.graphics.VertexAttribute r6 = new com.badlogic.gdx.graphics.VertexAttribute
            r1 = 2
            r2 = 4
            r3 = 5126(0x1406, float:7.183E-42)
            r4 = 0
            java.lang.String r5 = "a_color"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static com.badlogic.gdx.graphics.VertexAttribute Normal() {
            com.badlogic.gdx.graphics.VertexAttribute r0 = new com.badlogic.gdx.graphics.VertexAttribute
            r1 = 8
            r2 = 3
            java.lang.String r3 = "a_normal"
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.badlogic.gdx.graphics.VertexAttribute Position() {
            com.badlogic.gdx.graphics.VertexAttribute r0 = new com.badlogic.gdx.graphics.VertexAttribute
            r1 = 1
            r2 = 3
            java.lang.String r3 = "a_position"
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.badlogic.gdx.graphics.VertexAttribute Tangent() {
            com.badlogic.gdx.graphics.VertexAttribute r0 = new com.badlogic.gdx.graphics.VertexAttribute
            r1 = 128(0x80, float:1.794E-43)
            r2 = 3
            java.lang.String r3 = "a_tangent"
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.badlogic.gdx.graphics.VertexAttribute TexCoords(int r4) {
            com.badlogic.gdx.graphics.VertexAttribute r0 = new com.badlogic.gdx.graphics.VertexAttribute
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "a_texCoord"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 16
            r3 = 2
            r0.<init>(r2, r3, r1, r4)
            return r0
    }

    public boolean equals(com.badlogic.gdx.graphics.VertexAttribute r3) {
            r2 = this;
            if (r3 == 0) goto L2c
            int r0 = r2.usage
            int r1 = r3.usage
            if (r0 != r1) goto L2c
            int r0 = r2.numComponents
            int r1 = r3.numComponents
            if (r0 != r1) goto L2c
            int r0 = r2.type
            int r1 = r3.type
            if (r0 != r1) goto L2c
            boolean r0 = r2.normalized
            boolean r1 = r3.normalized
            if (r0 != r1) goto L2c
            java.lang.String r0 = r2.alias
            java.lang.String r1 = r3.alias
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            int r0 = r2.unit
            int r3 = r3.unit
            if (r0 != r3) goto L2c
            r3 = 1
            goto L2d
        L2c:
            r3 = 0
        L2d:
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.badlogic.gdx.graphics.VertexAttribute
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.badlogic.gdx.graphics.VertexAttribute r2 = (com.badlogic.gdx.graphics.VertexAttribute) r2
            boolean r2 = r1.equals(r2)
            return r2
    }

    public int getKey() {
            r2 = this;
            int r0 = r2.usageIndex
            int r0 = r0 << 8
            int r1 = r2.unit
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r1
            return r0
    }

    public int getSizeInBytes() {
            r2 = this;
            int r0 = r2.type
            r1 = 5126(0x1406, float:7.183E-42)
            if (r0 == r1) goto L17
            r1 = 5132(0x140c, float:7.191E-42)
            if (r0 == r1) goto L17
            switch(r0) {
                case 5120: goto L14;
                case 5121: goto L14;
                case 5122: goto Lf;
                case 5123: goto Lf;
                default: goto Ld;
            }
        Ld:
            r0 = 0
            return r0
        Lf:
            int r0 = r2.numComponents
            int r0 = r0 * 2
            return r0
        L14:
            int r0 = r2.numComponents
            return r0
        L17:
            int r0 = r2.numComponents
            int r0 = r0 * 4
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.getKey()
            int r0 = r0 * 541
            int r1 = r2.numComponents
            int r0 = r0 + r1
            int r0 = r0 * 541
            java.lang.String r1 = r2.alias
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
