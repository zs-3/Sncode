package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbno implements com.google.android.gms.internal.ads.zzcaw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbny zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzflp zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnz zzc;

    zzbno(com.google.android.gms.internal.ads.zzbnz r1, com.google.android.gms.internal.ads.zzbny r2, com.google.android.gms.internal.ads.zzflp r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbmu r4 = (com.google.android.gms.internal.ads.zzbmu) r4
            java.lang.String r4 = "loadNewJavascriptEngine (success): Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            com.google.android.gms.internal.ads.zzbnz r4 = r3.zzc
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbnz.zzf(r4)
            monitor-enter(r4)
            java.lang.String r0 = "loadNewJavascriptEngine (success): Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbnz r0 = r3.zzc     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            com.google.android.gms.internal.ads.zzbnz.zzh(r0, r1)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbnz r0 = r3.zzc     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbny r1 = com.google.android.gms.internal.ads.zzbnz.zzc(r0)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L37
            com.google.android.gms.internal.ads.zzbny r1 = r3.zza     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbny r0 = com.google.android.gms.internal.ads.zzbnz.zzc(r0)     // Catch: java.lang.Throwable -> L6c
            if (r1 == r0) goto L37
            java.lang.String r0 = "New JS engine is loaded, marking previous one as destroyable."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbnz r0 = r3.zzc     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbny r0 = com.google.android.gms.internal.ads.zzbnz.zzc(r0)     // Catch: java.lang.Throwable -> L6c
            r0.zzb()     // Catch: java.lang.Throwable -> L6c
        L37:
            com.google.android.gms.internal.ads.zzbnz r0 = r3.zzc     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbny r1 = r3.zza     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbnz.zzg(r0, r1)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzd     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L6c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L65
            com.google.android.gms.internal.ads.zzbnz r0 = r3.zzc     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzfmd r1 = com.google.android.gms.internal.ads.zzbnz.zze(r0)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzfmd r0 = com.google.android.gms.internal.ads.zzbnz.zze(r0)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzflp r1 = r3.zzb     // Catch: java.lang.Throwable -> L6c
            r2 = 1
            r1.zzg(r2)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzflt r1 = r1.zzm()     // Catch: java.lang.Throwable -> L6c
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L6c
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "loadNewJavascriptEngine (success): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            return
        L6c:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6c
            throw r0
    }
}
