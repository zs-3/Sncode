package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfnu {
    private final java.lang.Object zza;
    private final long zzb;
    private final com.google.android.gms.common.util.Clock zzc;
    private final long zzd;

    public zzfnu(java.lang.Object r3, com.google.android.gms.common.util.Clock r4) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            r2.zzc = r4
            long r3 = r4.currentTimeMillis()
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzu
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            r2.zzd = r3
            return
    }

    public final long zza() {
            r6 = this;
            com.google.android.gms.common.util.Clock r0 = r6.zzc
            long r0 = r0.currentTimeMillis()
            long r2 = r6.zzb
            long r0 = r0 - r2
            long r2 = r6.zzd
            r4 = 100
            long r2 = r2 + r4
            long r2 = r2 - r0
            return r2
    }

    public final java.lang.Object zzb() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            return r0
    }

    public final boolean zzc() {
            r6 = this;
            long r0 = r6.zzb
            long r2 = r6.zzd
            com.google.android.gms.common.util.Clock r4 = r6.zzc
            long r4 = r4.currentTimeMillis()
            long r0 = r0 + r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }
}
