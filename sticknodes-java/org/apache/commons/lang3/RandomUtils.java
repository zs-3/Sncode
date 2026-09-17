package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class RandomUtils {
    private static final java.util.Random RANDOM = null;

    static {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            org.apache.commons.lang3.RandomUtils.RANDOM = r0
            return
    }

    public RandomUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean nextBoolean() {
            java.util.Random r0 = org.apache.commons.lang3.RandomUtils.RANDOM
            boolean r0 = r0.nextBoolean()
            return r0
    }

    public static byte[] nextBytes(int r3) {
            r0 = 0
            if (r3 < 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Count cannot be negative."
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            byte[] r3 = new byte[r3]
            java.util.Random r0 = org.apache.commons.lang3.RandomUtils.RANDOM
            r0.nextBytes(r3)
            return r3
    }

    public static double nextDouble() {
            r0 = 0
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            double r0 = nextDouble(r0, r2)
            return r0
    }

    public static double nextDouble(double r5, double r7) {
            r0 = 1
            r1 = 0
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Start value must be smaller or equal to end value."
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 < 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Both range values must be non-negative."
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L24
            return r5
        L24:
            double r7 = r7 - r5
            java.util.Random r0 = org.apache.commons.lang3.RandomUtils.RANDOM
            double r0 = r0.nextDouble()
            double r7 = r7 * r0
            double r5 = r5 + r7
            return r5
    }

    public static float nextFloat() {
            r0 = 0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r0 = nextFloat(r0, r1)
            return r0
    }

    public static float nextFloat(float r5, float r6) {
            r0 = 1
            r1 = 0
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 < 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Start value must be smaller or equal to end value."
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Both range values must be non-negative."
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 != 0) goto L23
            return r5
        L23:
            float r6 = r6 - r5
            java.util.Random r0 = org.apache.commons.lang3.RandomUtils.RANDOM
            float r0 = r0.nextFloat()
            float r6 = r6 * r0
            float r5 = r5 + r6
            return r5
    }

    public static int nextInt() {
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = nextInt(r0, r1)
            return r0
    }

    public static int nextInt(int r5, int r6) {
            r0 = 1
            r1 = 0
            if (r6 < r5) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Start value must be smaller or equal to end value."
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            if (r5 < 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Both range values must be non-negative."
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            if (r5 != r6) goto L1c
            return r5
        L1c:
            java.util.Random r0 = org.apache.commons.lang3.RandomUtils.RANDOM
            int r6 = r6 - r5
            int r6 = r0.nextInt(r6)
            int r5 = r5 + r6
            return r5
    }

    public static long nextLong() {
            r0 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = nextLong(r0, r2)
            return r0
    }

    public static long nextLong(long r5, long r7) {
            r0 = 1
            r1 = 0
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Start value must be smaller or equal to end value."
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 < 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Both range values must be non-negative."
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L24
            return r5
        L24:
            double r5 = (double) r5
            double r7 = (double) r7
            double r5 = nextDouble(r5, r7)
            long r5 = (long) r5
            return r5
    }
}
