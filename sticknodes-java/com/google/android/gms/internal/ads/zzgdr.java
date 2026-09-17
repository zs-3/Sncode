package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgdr {
    public static char zza(long r4) {
            int r0 = (int) r4
            char r0 = (char) r0
            long r1 = (long) r0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "Out of range: %s"
            com.google.android.gms.internal.ads.zzfxz.zzg(r1, r2, r4)
            return r0
    }

    public static char zzb(byte r0, byte r1) {
            int r0 = r0 << 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            char r0 = (char) r0
            return r0
    }
}
