package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzggm extends com.google.android.gms.internal.ads.zzgfx {
    final /* synthetic */ com.google.android.gms.internal.ads.zzggo zza;
    private final com.google.android.gms.internal.ads.zzgeu zzb;

    zzggm(com.google.android.gms.internal.ads.zzggo r1, com.google.android.gms.internal.ads.zzgeu r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final /* bridge */ /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzgeu r0 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zza()
            java.lang.String r2 = "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"
            com.google.android.gms.internal.ads.zzfxz.zzd(r1, r2, r0)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final java.lang.String zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgeu r0 = r1.zzb
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final void zzd(java.lang.Throwable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzggo r0 = r1.zza
            r0.zzd(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final /* synthetic */ void zze(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzggo r0 = r1.zza
            com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
            r0.zzs(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final boolean zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzggo r0 = r1.zza
            boolean r0 = r0.isDone()
            return r0
    }
}
