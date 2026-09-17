package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzevp implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzexh zza;
    private final long zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;

    public zzevp(com.google.android.gms.internal.ads.zzexh r1, long r2, java.util.concurrent.ScheduledExecutorService r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzexh r0 = r1.zza
            int r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r7 = this;
            com.google.android.gms.internal.ads.zzexh r0 = r7.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcn
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1c
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
        L1c:
            long r2 = r7.zzb
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2a
            java.util.concurrent.ScheduledExecutorService r4 = r7.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r2, r1, r4)
        L2a:
            com.google.android.gms.internal.ads.zzevo r1 = new com.google.android.gms.internal.ads.zzevo
            r1.<init>(r7)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r3, r1, r2)
            return r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Throwable r5) throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcm
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L30
            com.google.android.gms.internal.ads.zzexh r0 = r4.zza
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            int r0 = r0.zza()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "OptionalSignalTimeout:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.zzw(r5, r0)
        L30:
            r5 = 0
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r5)
            return r5
    }
}
