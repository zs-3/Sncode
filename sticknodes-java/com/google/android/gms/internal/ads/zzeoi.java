package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeoi implements com.google.android.gms.internal.ads.zzeoq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeoj zza;

    zzeoi(com.google.android.gms.internal.ads.zzeoj r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzeoj r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzeoj r1 = r3.zza     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            com.google.android.gms.internal.ads.zzeoj.zzc(r1, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeoj r0 = r2.zza
            com.google.android.gms.internal.ads.zzdgy r3 = (com.google.android.gms.internal.ads.zzdgy) r3
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzeoj r1 = r2.zza     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzeoj.zzc(r1, r3)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzeoj r3 = r2.zza     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzdgy r3 = com.google.android.gms.internal.ads.zzeoj.zzb(r3)     // Catch: java.lang.Throwable -> L15
            r3.zzk()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }
}
