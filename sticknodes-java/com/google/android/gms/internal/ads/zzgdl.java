package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgdl {
    static long zza(double r3) {
            boolean r0 = zzb(r3)
            java.lang.String r1 = "not a normal value"
            com.google.android.gms.internal.ads.zzfxz.zzf(r0, r1)
            int r0 = java.lang.Math.getExponent(r3)
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r1 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r3 = r3 & r1
            r1 = -1023(0xfffffffffffffc01, float:NaN)
            if (r0 != r1) goto L1d
            long r3 = r3 + r3
            goto L20
        L1d:
            r0 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r3 = r3 | r0
        L20:
            return r3
    }

    static boolean zzb(double r0) {
            int r0 = java.lang.Math.getExponent(r0)
            r1 = 1023(0x3ff, float:1.434E-42)
            if (r0 > r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
