package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfcm implements com.google.android.gms.internal.ads.zzeoq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfcn zza;

    zzfcm(com.google.android.gms.internal.ads.zzfcn r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfcn r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfcn r1 = r3.zza     // Catch: java.lang.Throwable -> La
            r2 = 0
            r1.zza = r2     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r7) {
            r6 = this;
            com.google.android.gms.internal.ads.zzfcn r0 = r6.zza
            com.google.android.gms.internal.ads.zzcql r7 = (com.google.android.gms.internal.ads.zzcql) r7
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfcn r1 = r6.zza     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzcql r1 = r1.zza     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto Le
            r1.zzb()     // Catch: java.lang.Throwable -> L30
        Le:
            com.google.android.gms.internal.ads.zzfcn r1 = r6.zza     // Catch: java.lang.Throwable -> L30
            r1.zza = r7     // Catch: java.lang.Throwable -> L30
            r7.zzc(r1)     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzfcn r1 = r6.zza     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzfcf r2 = com.google.android.gms.internal.ads.zzfcn.zzm(r1)     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzcqm r3 = new com.google.android.gms.internal.ads.zzcqm     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzfcf r4 = com.google.android.gms.internal.ads.zzfcn.zzm(r1)     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzdud r5 = com.google.android.gms.internal.ads.zzfcn.zzh(r1)     // Catch: java.lang.Throwable -> L30
            r3.<init>(r7, r1, r4, r5)     // Catch: java.lang.Throwable -> L30
            r2.zzk(r3)     // Catch: java.lang.Throwable -> L30
            r7.zzk()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r7
    }
}
