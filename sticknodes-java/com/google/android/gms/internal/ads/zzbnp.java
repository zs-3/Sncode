package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbnp implements com.google.android.gms.internal.ads.zzcau {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbny zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzflp zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnz zzc;

    zzbnp(com.google.android.gms.internal.ads.zzbnz r1, com.google.android.gms.internal.ads.zzbny r2, com.google.android.gms.internal.ads.zzflp r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zza() {
            r4 = this;
            java.lang.String r0 = "loadNewJavascriptEngine (failure): Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzbnz r0 = r4.zzc
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbnz.zzf(r0)
            monitor-enter(r0)
            java.lang.String r1 = "loadNewJavascriptEngine (failure): Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzbnz r1 = r4.zzc     // Catch: java.lang.Throwable -> L54
            r2 = 1
            com.google.android.gms.internal.ads.zzbnz.zzh(r1, r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "Failed loading new engine. Marking new engine destroyable."
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzbny r1 = r4.zza     // Catch: java.lang.Throwable -> L54
            r1.zzb()     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbek.zzd     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L54
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L4d
            com.google.android.gms.internal.ads.zzbnz r1 = r4.zzc     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzfmd r2 = com.google.android.gms.internal.ads.zzbnz.zze(r1)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L4d
            com.google.android.gms.internal.ads.zzfmd r1 = com.google.android.gms.internal.ads.zzbnz.zze(r1)     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzflp r2 = r4.zzb     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "Failed loading new engine"
            r2.zzc(r3)     // Catch: java.lang.Throwable -> L54
            r3 = 0
            r2.zzg(r3)     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzflt r2 = r2.zzm()     // Catch: java.lang.Throwable -> L54
            r1.zzb(r2)     // Catch: java.lang.Throwable -> L54
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "loadNewJavascriptEngine (failure): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        L54:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r1
    }
}
