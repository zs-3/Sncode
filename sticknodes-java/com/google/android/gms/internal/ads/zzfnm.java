package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfnm {
    private final long zza;
    private final long zzb;
    private long zzc;
    private long zzd;
    private final java.util.Random zze;

    public zzfnm(long r1, double r3, long r5, double r7) {
            r0 = this;
            r0.<init>()
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            r0.zze = r3
            r0.zza = r1
            r0.zzb = r5
            r1 = 0
            r0.zzc = r1
            r0.zzc()
            return
    }

    public final long zza() {
            r6 = this;
            long r0 = r6.zzd
            double r0 = (double) r0
            r2 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r2 = r2 * r0
            double r4 = r0 + r2
            long r4 = (long) r4
            double r0 = r0 - r2
            long r0 = (long) r0
            long r4 = r4 - r0
            r2 = 1
            long r4 = r4 + r2
            java.util.Random r2 = r6.zze
            double r2 = r2.nextDouble()
            double r4 = (double) r4
            double r2 = r2 * r4
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    public final void zzb() {
            r4 = this;
            long r0 = r4.zzd
            double r0 = (double) r0
            double r0 = r0 + r0
            long r0 = (long) r0
            long r2 = r4.zzb
            long r0 = java.lang.Math.min(r0, r2)
            r4.zzd = r0
            long r0 = r4.zzc
            r2 = 1
            long r0 = r0 + r2
            r4.zzc = r0
            return
    }

    public final void zzc() {
            r2 = this;
            long r0 = r2.zza
            r2.zzd = r0
            r0 = 0
            r2.zzc = r0
            return
    }

    public final boolean zzd() {
            r5 = this;
            long r0 = r5.zzc
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzt
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L21
            long r0 = r5.zzd
            long r2 = r5.zzb
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L21
            r0 = 1
            return r0
        L21:
            r0 = 0
            return r0
    }
}
