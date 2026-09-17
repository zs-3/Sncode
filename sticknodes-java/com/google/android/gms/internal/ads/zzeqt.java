package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeqt implements com.google.android.gms.internal.ads.zzexh {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzcad zzb;

    zzeqt(java.util.concurrent.Executor r1, com.google.android.gms.internal.ads.zzcad r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 10
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
        L18:
            com.google.android.gms.internal.ads.zzcad r0 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzk()
            com.google.android.gms.internal.ads.zzeqs r1 = new com.google.android.gms.internal.ads.zzeqs
            r1.<init>()
            java.util.concurrent.Executor r2 = r3.zza
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            return r0
    }
}
