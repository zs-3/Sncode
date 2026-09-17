package com.badlogic.gdx.graphics.g3d.attributes;

/* loaded from: classes.dex */
public class ColorAttribute extends com.badlogic.gdx.graphics.g3d.Attribute {
    public static final long Ambient = 0;
    public static final long AmbientLight = 0;
    public static final long Diffuse = 0;
    public static final long Emissive = 0;
    public static final long Fog = 0;
    protected static long Mask;
    public static final long Reflection = 0;
    public static final long Specular = 0;
    public final com.badlogic.gdx.graphics.Color color;

    static {
            java.lang.String r0 = "diffuseColor"
            long r0 = com.badlogic.gdx.graphics.g3d.Attribute.register(r0)
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Diffuse = r0
            java.lang.String r2 = "specularColor"
            long r2 = com.badlogic.gdx.graphics.g3d.Attribute.register(r2)
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Specular = r2
            java.lang.String r4 = "ambientColor"
            long r4 = com.badlogic.gdx.graphics.g3d.Attribute.register(r4)
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Ambient = r4
            java.lang.String r6 = "emissiveColor"
            long r6 = com.badlogic.gdx.graphics.g3d.Attribute.register(r6)
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Emissive = r6
            java.lang.String r8 = "reflectionColor"
            long r8 = com.badlogic.gdx.graphics.g3d.Attribute.register(r8)
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Reflection = r8
            java.lang.String r10 = "ambientLightColor"
            long r10 = com.badlogic.gdx.graphics.g3d.Attribute.register(r10)
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.AmbientLight = r10
            java.lang.String r12 = "fogColor"
            long r12 = com.badlogic.gdx.graphics.g3d.Attribute.register(r12)
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Fog = r12
            long r0 = r0 | r4
            long r0 = r0 | r2
            long r0 = r0 | r6
            long r0 = r0 | r8
            long r0 = r0 | r10
            long r0 = r0 | r12
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Mask = r0
            return
    }

    public ColorAttribute(long r2) {
            r1 = this;
            r1.<init>(r2)
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r1.color = r0
            boolean r2 = is(r2)
            if (r2 == 0) goto L11
            return
        L11:
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r3 = "Invalid type specified"
            r2.<init>(r3)
            throw r2
    }

    public ColorAttribute(long r1, com.badlogic.gdx.graphics.Color r3) {
            r0 = this;
            r0.<init>(r1)
            if (r3 == 0) goto La
            com.badlogic.gdx.graphics.Color r1 = r0.color
            r1.set(r3)
        La:
            return
    }

    public static final boolean is(long r3) {
            long r0 = com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Mask
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
    public int compareTo2(com.badlogic.gdx.graphics.g3d.Attribute r6) {
            r5 = this;
            long r0 = r5.type
            long r2 = r6.type
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            long r0 = r0 - r2
            int r6 = (int) r0
            return r6
        Lb:
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute r6 = (com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute) r6
            com.badlogic.gdx.graphics.Color r6 = r6.color
            int r6 = r6.toIntBits()
            com.badlogic.gdx.graphics.Color r0 = r5.color
            int r0 = r0.toIntBits()
            int r6 = r6 - r0
            return r6
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
            int r0 = r0 * 953
            com.badlogic.gdx.graphics.Color r1 = r2.color
            int r1 = r1.toIntBits()
            int r0 = r0 + r1
            return r0
    }
}
