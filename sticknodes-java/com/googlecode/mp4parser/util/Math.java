package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class Math {
    public Math() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int gcd(int r1, int r2) {
        L0:
            r0 = r2
            r2 = r1
            r1 = r0
            if (r1 > 0) goto L6
            return r2
        L6:
            int r2 = r2 % r1
            goto L0
    }

    public static long gcd(long r5, long r7) {
        L0:
            r3 = r5
            r5 = r7
            r7 = r3
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            return r7
        La:
            long r7 = r7 % r5
            goto L0
    }

    public static int lcm(int r1, int r2) {
            int r0 = gcd(r1, r2)
            int r2 = r2 / r0
            int r1 = r1 * r2
            return r1
    }

    public static long lcm(long r2, long r4) {
            long r0 = gcd(r2, r4)
            long r4 = r4 / r0
            long r2 = r2 * r4
            return r2
    }

    public static long lcm(long[] r5) {
            r0 = 0
            r0 = r5[r0]
            r2 = 1
        L4:
            int r3 = r5.length
            if (r2 < r3) goto L8
            return r0
        L8:
            r3 = r5[r2]
            long r0 = lcm(r0, r3)
            int r2 = r2 + 1
            goto L4
    }
}
