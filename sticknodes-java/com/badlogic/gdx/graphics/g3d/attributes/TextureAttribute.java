package com.badlogic.gdx.graphics.g3d.attributes;

/* loaded from: classes.dex */
public class TextureAttribute extends com.badlogic.gdx.graphics.g3d.Attribute {
    public static final long Ambient = 0;
    public static final long Bump = 0;
    public static final long Diffuse = 0;
    public static final long Emissive = 0;
    protected static long Mask;
    public static final long Normal = 0;
    public static final long Reflection = 0;
    public static final long Specular = 0;
    public float offsetU;
    public float offsetV;
    public float scaleU;
    public float scaleV;
    public final com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<com.badlogic.gdx.graphics.Texture> textureDescription;
    public int uvIndex;

    static {
            java.lang.String r0 = "diffuseTexture"
            long r0 = com.badlogic.gdx.graphics.g3d.Attribute.register(r0)
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Diffuse = r0
            java.lang.String r2 = "specularTexture"
            long r2 = com.badlogic.gdx.graphics.g3d.Attribute.register(r2)
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Specular = r2
            java.lang.String r4 = "bumpTexture"
            long r4 = com.badlogic.gdx.graphics.g3d.Attribute.register(r4)
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Bump = r4
            java.lang.String r6 = "normalTexture"
            long r6 = com.badlogic.gdx.graphics.g3d.Attribute.register(r6)
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Normal = r6
            java.lang.String r8 = "ambientTexture"
            long r8 = com.badlogic.gdx.graphics.g3d.Attribute.register(r8)
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Ambient = r8
            java.lang.String r10 = "emissiveTexture"
            long r10 = com.badlogic.gdx.graphics.g3d.Attribute.register(r10)
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Emissive = r10
            java.lang.String r12 = "reflectionTexture"
            long r12 = com.badlogic.gdx.graphics.g3d.Attribute.register(r12)
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Reflection = r12
            long r0 = r0 | r2
            long r0 = r0 | r4
            long r0 = r0 | r6
            long r0 = r0 | r8
            long r0 = r0 | r10
            long r0 = r0 | r12
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Mask = r0
            return
    }

    public TextureAttribute(long r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.offsetU = r0
            r1.offsetV = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.scaleU = r0
            r1.scaleV = r0
            r0 = 0
            r1.uvIndex = r0
            boolean r2 = is(r2)
            if (r2 == 0) goto L1f
            com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor r2 = new com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor
            r2.<init>()
            r1.textureDescription = r2
            return
        L1f:
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r3 = "Invalid type specified"
            r2.<init>(r3)
            throw r2
    }

    public <T extends com.badlogic.gdx.graphics.Texture> TextureAttribute(long r1, com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<T> r3) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<com.badlogic.gdx.graphics.Texture> r1 = r0.textureDescription
            r1.set(r3)
            return
    }

    public <T extends com.badlogic.gdx.graphics.Texture> TextureAttribute(long r10, com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<T> r12, float r13, float r14, float r15, float r16) {
            r9 = this;
            r8 = 0
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            return
    }

    public <T extends com.badlogic.gdx.graphics.Texture> TextureAttribute(long r1, com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<T> r3, float r4, float r5, float r6, float r7, int r8) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.offsetU = r4
            r0.offsetV = r5
            r0.scaleU = r6
            r0.scaleV = r7
            r0.uvIndex = r8
            return
    }

    public static final boolean is(long r3) {
            long r0 = com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Mask
            long r3 = r3 & r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            return r3
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.badlogic.gdx.graphics.g3d.Attribute r8) {
            r7 = this;
            long r0 = r7.type
            long r2 = r8.type
            r4 = -1
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L11
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto Lf
            goto L10
        Lf:
            r4 = 1
        L10:
            return r4
        L11:
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute r8 = (com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute) r8
            com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<com.badlogic.gdx.graphics.Texture> r0 = r7.textureDescription
            com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<com.badlogic.gdx.graphics.Texture> r1 = r8.textureDescription
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L1e
            return r0
        L1e:
            int r0 = r7.uvIndex
            int r1 = r8.uvIndex
            if (r0 == r1) goto L26
            int r0 = r0 - r1
            return r0
        L26:
            float r0 = r7.scaleU
            float r1 = r8.scaleU
            boolean r0 = com.badlogic.gdx.math.MathUtils.isEqual(r0, r1)
            if (r0 != 0) goto L3a
            float r0 = r7.scaleU
            float r8 = r8.scaleU
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 <= 0) goto L39
            r4 = 1
        L39:
            return r4
        L3a:
            float r0 = r7.scaleV
            float r1 = r8.scaleV
            boolean r0 = com.badlogic.gdx.math.MathUtils.isEqual(r0, r1)
            if (r0 != 0) goto L4e
            float r0 = r7.scaleV
            float r8 = r8.scaleV
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 <= 0) goto L4d
            r4 = 1
        L4d:
            return r4
        L4e:
            float r0 = r7.offsetU
            float r1 = r8.offsetU
            boolean r0 = com.badlogic.gdx.math.MathUtils.isEqual(r0, r1)
            if (r0 != 0) goto L62
            float r0 = r7.offsetU
            float r8 = r8.offsetU
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 <= 0) goto L61
            r4 = 1
        L61:
            return r4
        L62:
            float r0 = r7.offsetV
            float r1 = r8.offsetV
            boolean r0 = com.badlogic.gdx.math.MathUtils.isEqual(r0, r1)
            if (r0 != 0) goto L76
            float r0 = r7.offsetV
            float r8 = r8.offsetV
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 <= 0) goto L75
            r4 = 1
        L75:
            return r4
        L76:
            r8 = 0
            return r8
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.badlogic.gdx.graphics.g3d.Attribute r1) {
            r0 = this;
            com.badlogic.gdx.graphics.g3d.Attribute r1 = (com.badlogic.gdx.graphics.g3d.Attribute) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attribute
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 991
            com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<com.badlogic.gdx.graphics.Texture> r1 = r2.textureDescription
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 991
            float r1 = r2.offsetU
            int r1 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r1)
            int r0 = r0 + r1
            int r0 = r0 * 991
            float r1 = r2.offsetV
            int r1 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r1)
            int r0 = r0 + r1
            int r0 = r0 * 991
            float r1 = r2.scaleU
            int r1 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r1)
            int r0 = r0 + r1
            int r0 = r0 * 991
            float r1 = r2.scaleV
            int r1 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r1)
            int r0 = r0 + r1
            int r0 = r0 * 991
            int r1 = r2.uvIndex
            int r0 = r0 + r1
            return r0
    }
}
