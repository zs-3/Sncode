package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgdy extends com.google.android.gms.internal.ads.zzgea {
    zzgdy(com.google.common.util.concurrent.ListenableFuture r1, java.lang.Class r2, com.google.android.gms.internal.ads.zzgev r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    final /* bridge */ /* synthetic */ java.lang.Object zze(java.lang.Object r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzgev r2 = (com.google.android.gms.internal.ads.zzgev) r2
            com.google.common.util.concurrent.ListenableFuture r3 = r2.zza(r3)
            java.lang.String r0 = "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"
            com.google.android.gms.internal.ads.zzfxz.zzd(r3, r0, r2)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    final /* synthetic */ void zzf(java.lang.Object r1) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.zzs(r1)
            return
    }
}
