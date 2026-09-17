package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzggn extends com.google.android.gms.internal.ads.zzgfx {
    final /* synthetic */ com.google.android.gms.internal.ads.zzggo zza;
    private final java.util.concurrent.Callable zzb;

    zzggn(com.google.android.gms.internal.ads.zzggo r1, java.util.concurrent.Callable r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            java.util.Objects.requireNonNull(r2)
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final java.lang.Object zza() throws java.lang.Exception {
            r1 = this;
            java.util.concurrent.Callable r0 = r1.zzb
            java.lang.Object r0 = r0.call()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final java.lang.String zzb() {
            r1 = this;
            java.util.concurrent.Callable r0 = r1.zzb
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
    final void zze(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzggo r0 = r1.zza
            r0.zzc(r2)
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
