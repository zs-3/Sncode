package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public final class GeometryUtils {
    private static final com.badlogic.gdx.math.Vector2 tmp1 = null;
    private static final com.badlogic.gdx.math.Vector2 tmp2 = null;
    private static final com.badlogic.gdx.math.Vector2 tmp3 = null;

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.math.GeometryUtils.tmp1 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.math.GeometryUtils.tmp2 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.math.GeometryUtils.tmp3 = r0
            return
    }

    public static boolean isClockwise(float[] r7, int r8, int r9) {
            r0 = 0
            r1 = 2
            if (r9 > r1) goto L5
            return r0
        L5:
            int r9 = r9 + r8
            int r9 = r9 - r1
            r1 = r7[r9]
            int r2 = r9 + 1
            r2 = r7[r2]
            r3 = 0
            r4 = 0
        Lf:
            if (r8 > r9) goto L22
            r5 = r7[r8]
            int r6 = r8 + 1
            r6 = r7[r6]
            float r1 = r1 * r6
            float r2 = r2 * r5
            float r1 = r1 - r2
            float r4 = r4 + r1
            int r8 = r8 + 2
            r1 = r5
            r2 = r6
            goto Lf
        L22:
            int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r7 >= 0) goto L27
            r0 = 1
        L27:
            return r0
    }
}
