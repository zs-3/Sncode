package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public final class MathUtils {
    public static java.util.Random random;

    private static class Sin {
        static final float[] table = null;

        static {
                r0 = 16384(0x4000, float:2.2959E-41)
                float[] r1 = new float[r0]
                com.badlogic.gdx.math.MathUtils.Sin.table = r1
                r1 = 0
                r2 = 0
            L8:
                if (r2 >= r0) goto L23
                float[] r3 = com.badlogic.gdx.math.MathUtils.Sin.table
                float r4 = (float) r2
                r5 = 1056964608(0x3f000000, float:0.5)
                float r4 = r4 + r5
                r5 = 1182793728(0x46800000, float:16384.0)
                float r4 = r4 / r5
                r5 = 1086918619(0x40c90fdb, float:6.2831855)
                float r4 = r4 * r5
                double r4 = (double) r4
                double r4 = java.lang.Math.sin(r4)
                float r4 = (float) r4
                r3[r2] = r4
                int r2 = r2 + 1
                goto L8
            L23:
                float[] r0 = com.badlogic.gdx.math.MathUtils.Sin.table
                r2 = 0
                r0[r1] = r2
                r1 = 4096(0x1000, float:5.74E-42)
                r3 = 1065353216(0x3f800000, float:1.0)
                r0[r1] = r3
                r1 = 8192(0x2000, float:1.14794E-41)
                r0[r1] = r2
                r1 = 12288(0x3000, float:1.7219E-41)
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r0[r1] = r2
                return
        }
    }

    static {
            com.badlogic.gdx.math.RandomXS128 r0 = new com.badlogic.gdx.math.RandomXS128
            r0.<init>()
            com.badlogic.gdx.math.MathUtils.random = r0
            return
    }

    public static float acos(float r10) {
            float r0 = r10 * r10
            float r1 = r10 * r0
            r2 = 1016688176(0x3c996e30, float:0.0187293)
            r3 = 1033377319(0x3d981627, float:0.074261)
            r4 = 1046033540(0x3e593484, float:0.2121144)
            r5 = 1070140836(0x3fc90da4, float:1.5707288)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 < 0) goto L2a
            float r6 = r6 - r10
            double r6 = (double) r6
            double r6 = java.lang.Math.sqrt(r6)
            float r6 = (float) r6
            float r10 = r10 * r4
            float r5 = r5 - r10
            float r0 = r0 * r3
            float r5 = r5 + r0
            float r1 = r1 * r2
            float r5 = r5 - r1
            float r6 = r6 * r5
            return r6
        L2a:
            r7 = 1078530011(0x40490fdb, float:3.1415927)
            float r6 = r6 + r10
            double r8 = (double) r6
            double r8 = java.lang.Math.sqrt(r8)
            float r6 = (float) r8
            float r10 = r10 * r4
            float r10 = r10 + r5
            float r0 = r0 * r3
            float r10 = r10 + r0
            float r1 = r1 * r2
            float r10 = r10 + r1
            float r6 = r6 * r10
            float r7 = r7 - r6
            return r7
    }

    public static float atan(float r14) {
            float r0 = java.lang.Math.abs(r14)
            double r0 = (double) r0
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            double r0 = java.lang.Math.min(r0, r2)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r0 - r2
            double r0 = r0 + r2
            double r4 = r4 / r0
            double r0 = r4 * r4
            double r2 = r4 * r0
            double r6 = r2 * r0
            double r8 = r6 * r0
            double r10 = r8 * r0
            double r0 = r0 * r10
            float r14 = java.lang.Math.signum(r14)
            r12 = 4607182213976306355(0x3fefffd04f8e32b3, double:0.99997726)
            double r4 = r4 * r12
            r12 = 4599663631660092645(0x3fd549b3f3620ce5, double:0.33262347)
            double r2 = r2 * r12
            double r4 = r4 - r2
            r2 = 4596141158325223396(0x3fc8c6083786ffe4, double:0.19354346)
            double r6 = r6 * r2
            double r4 = r4 + r6
            r2 = 4593054293142295766(0x3fbdce8b68d454d6, double:0.11643287)
            double r8 = r8 * r2
            double r4 = r4 - r8
            r2 = 4587748964150412656(0x3faaf5603eda0570, double:0.05265332)
            double r10 = r10 * r2
            double r4 = r4 + r10
            r2 = 4577910433550952327(0x3f880148d55be787, double:0.0117212)
            double r0 = r0 * r2
            double r4 = r4 - r0
            r0 = 4605249457297304856(0x3fe921fb54442d18, double:0.7853981633974483)
            double r4 = r4 + r0
            float r0 = (float) r4
            float r14 = r14 * r0
            return r14
    }

    public static float atan2(float r3, float r4) {
            float r0 = r3 / r4
            r1 = 0
            int r2 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto Le
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L18
        Le:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L18
        L11:
            float r2 = r0 - r0
            int r2 = (r2 > r2 ? 1 : (r2 == r2 ? 0 : -1))
            if (r2 == 0) goto L18
            r4 = 0
        L18:
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto L22
            double r3 = (double) r0
            float r3 = atanUnchecked(r3)
            return r3
        L22:
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L3b
            r4 = 1078530011(0x40490fdb, float:3.1415927)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto L34
            double r0 = (double) r0
            float r3 = atanUnchecked(r0)
            float r3 = r3 + r4
            return r3
        L34:
            double r0 = (double) r0
            float r3 = atanUnchecked(r0)
            float r3 = r3 - r4
            return r3
        L3b:
            r0 = 1070141403(0x3fc90fdb, float:1.5707964)
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 <= 0) goto L44
            float r4 = r4 + r0
            return r4
        L44:
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L4a
            float r4 = r4 - r0
            return r4
        L4a:
            float r4 = r4 + r3
            return r4
    }

    public static float atanUnchecked(double r14) {
            double r0 = java.lang.Math.abs(r14)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r0 - r2
            double r0 = r0 + r2
            double r4 = r4 / r0
            double r0 = r4 * r4
            double r2 = r4 * r0
            double r6 = r2 * r0
            double r8 = r6 * r0
            double r10 = r8 * r0
            double r0 = r0 * r10
            double r14 = java.lang.Math.signum(r14)
            r12 = 4607182213976306355(0x3fefffd04f8e32b3, double:0.99997726)
            double r4 = r4 * r12
            r12 = 4599663631660092645(0x3fd549b3f3620ce5, double:0.33262347)
            double r2 = r2 * r12
            double r4 = r4 - r2
            r2 = 4596141158325223396(0x3fc8c6083786ffe4, double:0.19354346)
            double r6 = r6 * r2
            double r4 = r4 + r6
            r2 = 4593054293142295766(0x3fbdce8b68d454d6, double:0.11643287)
            double r8 = r8 * r2
            double r4 = r4 - r8
            r2 = 4587748964150412656(0x3faaf5603eda0570, double:0.05265332)
            double r10 = r10 * r2
            double r4 = r4 + r10
            r2 = 4577910433550952327(0x3f880148d55be787, double:0.0117212)
            double r0 = r0 * r2
            double r4 = r4 - r0
            r0 = 4605249457297304856(0x3fe921fb54442d18, double:0.7853981633974483)
            double r4 = r4 + r0
            double r14 = r14 * r4
            float r14 = (float) r14
            return r14
    }

    public static int ceil(float r4) {
            double r0 = (double) r4
            r2 = 4670232813583204352(0x40d0000000000000, double:16384.0)
            double r2 = r2 - r0
            int r4 = (int) r2
            int r4 = 16384 - r4
            return r4
    }

    public static double clamp(double r1, double r3, double r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto La
            return r5
        La:
            return r1
    }

    public static float clamp(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r2
        L5:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto La
            return r3
        La:
            return r1
    }

    public static int clamp(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    public static float cos(float r2) {
            float[] r0 = com.badlogic.gdx.math.MathUtils.Sin.table
            r1 = 1070141403(0x3fc90fdb, float:1.5707964)
            float r2 = r2 + r1
            r1 = 1159920003(0x4522f983, float:2607.5945)
            float r2 = r2 * r1
            int r2 = (int) r2
            r2 = r2 & 16383(0x3fff, float:2.2957E-41)
            r2 = r0[r2]
            return r2
    }

    public static float cosDeg(float r2) {
            float[] r0 = com.badlogic.gdx.math.MathUtils.Sin.table
            r1 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 + r1
            r1 = 1110838113(0x42360b61, float:45.511112)
            float r2 = r2 * r1
            int r2 = (int) r2
            r2 = r2 & 16383(0x3fff, float:2.2957E-41)
            r2 = r0[r2]
            return r2
    }

    public static boolean isEqual(float r0, float r1) {
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = 897988541(0x358637bd, float:1.0E-6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isEqual(float r0, float r1, float r2) {
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static boolean isPowerOfTwo(int r1) {
            if (r1 == 0) goto L9
            int r0 = r1 + (-1)
            r1 = r1 & r0
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static float lerp(float r0, float r1, float r2) {
            float r1 = r1 - r0
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    public static float lerpAngleDeg(float r2, float r3, float r4) {
            float r3 = r3 - r2
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            float r3 = r3 + r0
            r1 = 1127481344(0x43340000, float:180.0)
            float r3 = r3 + r1
            float r3 = r3 % r0
            float r3 = r3 - r1
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r2 = r2 % r0
            float r2 = r2 + r0
            float r2 = r2 % r0
            return r2
    }

    public static int nextPowerOfTwo(int r2) {
            r0 = 1
            if (r2 != 0) goto L4
            return r0
        L4:
            int r2 = r2 + (-1)
            int r1 = r2 >> 1
            r2 = r2 | r1
            int r1 = r2 >> 2
            r2 = r2 | r1
            int r1 = r2 >> 4
            r2 = r2 | r1
            int r1 = r2 >> 8
            r2 = r2 | r1
            int r1 = r2 >> 16
            r2 = r2 | r1
            int r2 = r2 + r0
            return r2
    }

    public static int random(int r1) {
            java.util.Random r0 = com.badlogic.gdx.math.MathUtils.random
            int r1 = r1 + 1
            int r1 = r0.nextInt(r1)
            return r1
    }

    public static int roundPositive(float r1) {
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
    }

    public static float sin(float r2) {
            float[] r0 = com.badlogic.gdx.math.MathUtils.Sin.table
            r1 = 1159920003(0x4522f983, float:2607.5945)
            float r2 = r2 * r1
            int r2 = (int) r2
            r2 = r2 & 16383(0x3fff, float:2.2957E-41)
            r2 = r0[r2]
            return r2
    }

    public static float sinDeg(float r2) {
            float[] r0 = com.badlogic.gdx.math.MathUtils.Sin.table
            r1 = 1110838113(0x42360b61, float:45.511112)
            float r2 = r2 * r1
            int r2 = (int) r2
            r2 = r2 & 16383(0x3fff, float:2.2957E-41)
            r2 = r0[r2]
            return r2
    }
}
