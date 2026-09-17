package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class DateHelper {
    public DateHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long convert(java.util.Date r4) {
            long r0 = r4.getTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 2082844800(0x7c25b080, double:1.0290620613E-314)
            long r0 = r0 + r2
            return r0
    }

    public static java.util.Date convert(long r3) {
            java.util.Date r0 = new java.util.Date
            r1 = 2082844800(0x7c25b080, double:1.0290620613E-314)
            long r3 = r3 - r1
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            r0.<init>(r3)
            return r0
    }
}
