package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfba implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzcad zza;
    private final boolean zzb;
    private final boolean zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzgfz zze;

    zzfba(com.google.android.gms.internal.ads.zzcad r1, boolean r2, boolean r3, com.google.android.gms.internal.ads.zzbzs r4, com.google.android.gms.internal.ads.zzgfz r5, java.lang.String r6, java.util.concurrent.ScheduledExecutorService r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zze = r5
            r0.zzd = r7
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 50
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgQ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r5.zzc
            if (r0 != 0) goto L18
            goto L1d
        L18:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            return r0
        L1d:
            boolean r0 = r5.zzb
            if (r0 != 0) goto L26
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            return r0
        L26:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            com.google.android.gms.internal.ads.zzfay r1 = new com.google.android.gms.internal.ads.zzfay
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zze
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbff.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r4, r3)
            com.google.android.gms.internal.ads.zzfaz r1 = new com.google.android.gms.internal.ads.zzfaz
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zze
            java.lang.Class<java.lang.Exception> r3 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zze(r0, r3, r1, r2)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfbb zzc(java.lang.Exception r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcad r0 = r2.zza
            java.lang.String r1 = "TrustlessTokenSignal"
            r0.zzw(r3, r1)
            r3 = 0
            return r3
    }
}
