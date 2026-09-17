package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbye implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza;

    zzbye(com.google.android.gms.internal.ads.zzbyf r1, com.google.common.util.concurrent.ListenableFuture r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r2) {
            r1 = this;
            java.util.List r2 = com.google.android.gms.internal.ads.zzbyf.zzc()
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            r2.remove(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r2) {
            r1 = this;
            java.lang.Void r2 = (java.lang.Void) r2
            java.util.List r2 = com.google.android.gms.internal.ads.zzbyf.zzc()
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            r2.remove(r0)
            return
    }
}
