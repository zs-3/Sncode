package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public final class NumberUtils {
    public static int floatToIntBits(float r0) {
            int r0 = java.lang.Float.floatToIntBits(r0)
            return r0
    }

    public static int floatToIntColor(float r2) {
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            int r0 = r2 >>> 24
            float r0 = (float) r0
            r1 = 1065386242(0x3f808102, float:1.003937)
            float r0 = r0 * r1
            int r0 = (int) r0
            int r0 = r0 << 24
            r2 = r2 | r0
            return r2
    }

    public static int floatToRawIntBits(float r0) {
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            return r0
    }

    public static float intToFloatColor(int r1) {
            r0 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r1 = r1 & r0
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }
}
