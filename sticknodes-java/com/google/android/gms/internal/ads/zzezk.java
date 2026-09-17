package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzezk implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzcad zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final java.util.concurrent.Executor zzc;

    public zzezk(com.google.android.gms.internal.ads.zzbzu r1, int r2, android.content.Context r3, com.google.android.gms.internal.ads.zzcad r4, java.util.concurrent.ScheduledExecutorService r5, java.util.concurrent.Executor r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r4
            r0.zzb = r5
            r0.zzc = r6
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 44
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzezh r0 = new com.google.android.gms.internal.ads.zzezh
            r0.<init>(r5)
            java.util.concurrent.Executor r1 = r5.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzk(r0, r1)
            com.google.android.gms.internal.ads.zzgff r0 = com.google.android.gms.internal.ads.zzgff.zzu(r0)
            com.google.android.gms.internal.ads.zzezi r1 = new com.google.android.gms.internal.ads.zzezi
            r1.<init>()
            java.util.concurrent.Executor r2 = r5.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzaZ
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r4 = r5.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r3, r4)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzezj r1 = new com.google.android.gms.internal.ads.zzezj
            r1.<init>(r5)
            java.util.concurrent.Executor r2 = com.google.android.gms.internal.ads.zzggf.zzb()
            java.lang.Class<java.lang.Exception> r3 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zze(r0, r3, r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzezl zzc(java.lang.Exception r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcad r0 = r2.zza
            java.lang.String r1 = "AttestationTokenSignal"
            r0.zzw(r3, r1)
            r3 = 0
            return r3
    }
}
