package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeyn implements com.google.android.gms.internal.ads.zzexh {
    private final java.util.concurrent.Executor zza;
    private final java.lang.String zzb;

    public zzeyn(com.google.android.gms.internal.ads.zzbzu r1, java.util.concurrent.Executor r2, java.lang.String r3, android.content.pm.PackageInfo r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 41
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r4 = this;
            java.lang.String r0 = r4.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzeyl r1 = new com.google.android.gms.internal.ads.zzeyl
            r1.<init>()
            java.util.concurrent.Executor r2 = r4.zza
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            com.google.android.gms.internal.ads.zzeym r1 = new com.google.android.gms.internal.ads.zzeym
            r1.<init>(r4)
            java.util.concurrent.Executor r2 = r4.zza
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r3, r1, r2)
            return r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Throwable r2) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzeyo r2 = new com.google.android.gms.internal.ads.zzeyo
            java.lang.String r0 = r1.zzb
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            return r2
    }
}
