package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeol implements com.google.android.gms.internal.ads.zzeoq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeom zza;

    zzeol(com.google.android.gms.internal.ads.zzeom r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeom r0 = r2.zza
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcte r4 = (com.google.android.gms.internal.ads.zzcte) r4
            com.google.android.gms.internal.ads.zzeom r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzeom r1 = r3.zza     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzcxt r2 = r4.zzm()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzeom.zzc(r1, r2)     // Catch: java.lang.Throwable -> L13
            r4.zzk()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r4
    }
}
