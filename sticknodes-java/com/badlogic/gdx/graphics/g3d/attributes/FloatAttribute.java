package com.badlogic.gdx.graphics.g3d.attributes;

/* loaded from: classes.dex */
public class FloatAttribute extends com.badlogic.gdx.graphics.g3d.Attribute {
    public static final long AlphaTest = 0;
    public static final long Shininess = 0;
    public float value;

    static {
            java.lang.String r0 = "shininess"
            long r0 = com.badlogic.gdx.graphics.g3d.Attribute.register(r0)
            com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute.Shininess = r0
            java.lang.String r0 = "alphaTest"
            long r0 = com.badlogic.gdx.graphics.g3d.Attribute.register(r0)
            com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute.AlphaTest = r0
            return
    }

    public FloatAttribute(long r1, float r3) {
            r0 = this;
            r0.<init>(r1)
            r0.value = r3
            return
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
            com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute r6 = (com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute) r6
            float r6 = r6.value
            float r0 = r5.value
            boolean r0 = com.badlogic.gdx.math.MathUtils.isEqual(r0, r6)
            if (r0 == 0) goto L19
            r6 = 0
            goto L22
        L19:
            float r0 = r5.value
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L21
            r6 = -1
            goto L22
        L21:
            r6 = 1
        L22:
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
            int r0 = r0 * 977
            float r1 = r2.value
            int r1 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r1)
            int r0 = r0 + r1
            return r0
    }
}
