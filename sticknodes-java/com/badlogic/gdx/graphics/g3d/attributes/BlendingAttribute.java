package com.badlogic.gdx.graphics.g3d.attributes;

/* loaded from: classes.dex */
public class BlendingAttribute extends com.badlogic.gdx.graphics.g3d.Attribute {
    public static final long Type = 0;
    public boolean blended;
    public int destFunction;
    public float opacity;
    public int sourceFunction;

    static {
            java.lang.String r0 = "blended"
            long r0 = com.badlogic.gdx.graphics.g3d.Attribute.register(r0)
            com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute.Type = r0
            return
    }

    public BlendingAttribute() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public BlendingAttribute(int r2, int r3, float r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public BlendingAttribute(com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute r4) {
            r3 = this;
            if (r4 == 0) goto L9
            boolean r0 = r4.blended
            if (r0 == 0) goto L7
            goto L9
        L7:
            r0 = 0
            goto La
        L9:
            r0 = 1
        La:
            if (r4 != 0) goto Lf
            r1 = 770(0x302, float:1.079E-42)
            goto L11
        Lf:
            int r1 = r4.sourceFunction
        L11:
            if (r4 != 0) goto L16
            r2 = 771(0x303, float:1.08E-42)
            goto L18
        L16:
            int r2 = r4.destFunction
        L18:
            if (r4 != 0) goto L1d
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L1f
        L1d:
            float r4 = r4.opacity
        L1f:
            r3.<init>(r0, r1, r2, r4)
            return
    }

    public BlendingAttribute(boolean r3, int r4, int r5, float r6) {
            r2 = this;
            long r0 = com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute.Type
            r2.<init>(r0)
            r2.blended = r3
            r2.sourceFunction = r4
            r2.destFunction = r5
            r2.opacity = r6
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
            com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute r6 = (com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute) r6
            boolean r0 = r5.blended
            boolean r1 = r6.blended
            r2 = 1
            r3 = -1
            if (r0 == r1) goto L1a
            if (r0 == 0) goto L18
            goto L19
        L18:
            r2 = -1
        L19:
            return r2
        L1a:
            int r0 = r5.sourceFunction
            int r1 = r6.sourceFunction
            if (r0 == r1) goto L22
            int r0 = r0 - r1
            return r0
        L22:
            int r0 = r5.destFunction
            int r1 = r6.destFunction
            if (r0 == r1) goto L2a
            int r0 = r0 - r1
            return r0
        L2a:
            float r0 = r5.opacity
            float r1 = r6.opacity
            boolean r0 = com.badlogic.gdx.math.MathUtils.isEqual(r0, r1)
            if (r0 == 0) goto L36
            r2 = 0
            goto L40
        L36:
            float r0 = r5.opacity
            float r6 = r6.opacity
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L3f
            goto L40
        L3f:
            r2 = -1
        L40:
            return r2
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
            int r0 = r0 * 947
            boolean r1 = r2.blended
            int r0 = r0 + r1
            int r0 = r0 * 947
            int r1 = r2.sourceFunction
            int r0 = r0 + r1
            int r0 = r0 * 947
            int r1 = r2.destFunction
            int r0 = r0 + r1
            int r0 = r0 * 947
            float r1 = r2.opacity
            int r1 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r1)
            int r0 = r0 + r1
            return r0
    }
}
