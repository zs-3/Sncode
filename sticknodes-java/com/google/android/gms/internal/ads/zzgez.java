package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgez extends com.google.android.gms.internal.ads.zzgfa {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgfb zza;
    private final java.util.concurrent.Callable zzc;

    zzgez(com.google.android.gms.internal.ads.zzgfb r1, java.util.concurrent.Callable r2, java.util.concurrent.Executor r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r1, r3)
            r0.zzc = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final java.lang.Object zza() throws java.lang.Exception {
            r1 = this;
            java.util.concurrent.Callable r0 = r1.zzc
            java.lang.Object r0 = r0.call()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final java.lang.String zzb() {
            r1 = this;
            java.util.concurrent.Callable r0 = r1.zzc
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    final void zzc(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgfb r0 = r1.zza
            r0.zzc(r2)
            return
    }
}
