package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgdx {
    public static byte zza(long r5) {
            r0 = 8
            long r0 = r5 >> r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.String r1 = "out of range: %s"
            com.google.android.gms.internal.ads.zzfxz.zzg(r0, r1, r5)
            int r6 = (int) r5
            byte r5 = (byte) r6
            return r5
    }
}
