package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeng implements com.google.android.gms.internal.ads.zzeoq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzenh zza;

    zzeng(com.google.android.gms.internal.ads.zzenh r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzenh r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzenh r1 = r3.zza     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            com.google.android.gms.internal.ads.zzenh.zze(r1, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzenh r0 = r3.zza
            com.google.android.gms.internal.ads.zzcqr r4 = (com.google.android.gms.internal.ads.zzcqr) r4
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzenh r1 = r3.zza     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzcqr r2 = com.google.android.gms.internal.ads.zzenh.zzc(r1)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L14
            com.google.android.gms.internal.ads.zzcqr r1 = com.google.android.gms.internal.ads.zzenh.zzc(r1)     // Catch: java.lang.Throwable -> L24
            r1.zzb()     // Catch: java.lang.Throwable -> L24
        L14:
            com.google.android.gms.internal.ads.zzenh r1 = r3.zza     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzenh.zze(r1, r4)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzenh r4 = r3.zza     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzcqr r4 = com.google.android.gms.internal.ads.zzenh.zzc(r4)     // Catch: java.lang.Throwable -> L24
            r4.zzk()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }
}
