package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class PolygonRegion {
    final com.badlogic.gdx.graphics.g2d.TextureRegion region;
    final float[] textureCoords;
    final short[] triangles;
    final float[] vertices;

    public PolygonRegion(com.badlogic.gdx.graphics.g2d.TextureRegion r12, float[] r13, short[] r14) {
            r11 = this;
            r11.<init>()
            r11.region = r12
            r11.vertices = r13
            r11.triangles = r14
            int r14 = r13.length
            float[] r14 = new float[r14]
            r11.textureCoords = r14
            float r0 = r12.u
            float r1 = r12.v
            float r2 = r12.u2
            float r2 = r2 - r0
            float r3 = r12.v2
            float r3 = r3 - r1
            int r4 = r12.regionWidth
            int r12 = r12.regionHeight
            int r5 = r13.length
            r6 = 0
        L1e:
            if (r6 >= r5) goto L3a
            r7 = r13[r6]
            float r8 = (float) r4
            float r7 = r7 / r8
            float r7 = r7 * r2
            float r7 = r7 + r0
            r14[r6] = r7
            int r7 = r6 + 1
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = r13[r7]
            float r10 = (float) r12
            float r9 = r9 / r10
            float r8 = r8 - r9
            float r8 = r8 * r3
            float r8 = r8 + r1
            r14[r7] = r8
            int r6 = r6 + 2
            goto L1e
        L3a:
            return
    }
}
