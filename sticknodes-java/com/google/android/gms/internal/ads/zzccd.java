package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzccd {
    private final long zza;
    private long zzb;
    private boolean zzc;

    zzccd() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzK
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            r3.zza = r0
            r0 = 1
            r3.zzc = r0
            return
    }

    public final void zza(android.graphics.SurfaceTexture r7, com.google.android.gms.internal.ads.zzcbo r8) {
            r6 = this;
            if (r8 != 0) goto L3
            goto L1a
        L3:
            long r0 = r7.getTimestamp()
            boolean r7 = r6.zzc
            if (r7 != 0) goto L1b
            long r2 = r6.zzb
            long r2 = r0 - r2
            long r4 = r6.zza
            long r2 = java.lang.Math.abs(r2)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            r7 = 0
            r6.zzc = r7
            r6.zzb = r0
            com.google.android.gms.internal.ads.zzfun r7 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccc r0 = new com.google.android.gms.internal.ads.zzccc
            r0.<init>(r8)
            r7.post(r0)
            return
    }

    public final void zzb() {
            r1 = this;
            r0 = 1
            r1.zzc = r0
            return
    }
}
