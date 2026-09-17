package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class CastUtils {
    public CastUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int l2i(long r3) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L10
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L10
            int r4 = (int) r3
            return r4
        L10:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "A cast to int has gone wrong. Please contact the mp4parser discussion group ("
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
