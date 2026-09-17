package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfcz implements com.google.android.gms.internal.ads.zzfdy {
    private com.google.android.gms.internal.ads.zzcxh zza;
    private final java.util.concurrent.Executor zzb;

    public zzfcz() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzggf.zzb()
            r1.zzb = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzcxh zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcxh r0 = r1.zza
            return r0
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfdz r2, com.google.android.gms.internal.ads.zzfdx r3, com.google.android.gms.internal.ads.zzcxh r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfdw r2 = r2.zzb
            com.google.android.gms.internal.ads.zzcxg r2 = r3.zza(r2)
            com.google.android.gms.internal.ads.zzfec r3 = new com.google.android.gms.internal.ads.zzfec
            r4 = 1
            r3.<init>(r4)
            r2.zzb(r3)
            java.lang.Object r2 = r2.zzh()
            com.google.android.gms.internal.ads.zzcxh r2 = (com.google.android.gms.internal.ads.zzcxh) r2
            r1.zza = r2
            com.google.android.gms.internal.ads.zzcum r2 = r2.zzb()
            com.google.android.gms.internal.ads.zzfiz r3 = new com.google.android.gms.internal.ads.zzfiz
            r3.<init>()
            com.google.common.util.concurrent.ListenableFuture r4 = r2.zzj()
            com.google.android.gms.internal.ads.zzgff r4 = com.google.android.gms.internal.ads.zzgff.zzu(r4)
            com.google.android.gms.internal.ads.zzfcx r0 = new com.google.android.gms.internal.ads.zzfcx
            r0.<init>(r1, r3, r2)
            java.util.concurrent.Executor r2 = r1.zzb
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzn(r4, r0, r2)
            com.google.android.gms.internal.ads.zzgff r2 = (com.google.android.gms.internal.ads.zzgff) r2
            com.google.android.gms.internal.ads.zzfcy r4 = new com.google.android.gms.internal.ads.zzfcy
            r4.<init>(r3)
            java.util.concurrent.Executor r3 = r1.zzb
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzm(r2, r4, r3)
            com.google.android.gms.internal.ads.zzgff r2 = (com.google.android.gms.internal.ads.zzgff) r2
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfdz r1, com.google.android.gms.internal.ads.zzfdx r2, java.lang.Object r3) {
            r0 = this;
            r3 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* synthetic */ java.lang.Object zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcxh r0 = r1.zza
            return r0
    }
}
