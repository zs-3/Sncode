package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbnl implements com.google.android.gms.internal.ads.zzbjw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbmu zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzby zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnz zzc;

    zzbnl(com.google.android.gms.internal.ads.zzbnz r1, com.google.android.gms.internal.ads.zzavn r2, com.google.android.gms.internal.ads.zzbmu r3, com.google.android.gms.ads.internal.util.zzby r4) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzboa r3 = (com.google.android.gms.internal.ads.zzboa) r3
            java.lang.String r3 = "loadJavascriptEngine > /requestReload handler: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            com.google.android.gms.internal.ads.zzbnz r3 = r2.zzc
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbnz.zzf(r3)
            monitor-enter(r3)
            java.lang.String r4 = "loadJavascriptEngine > /requestReload handler: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "JS Engine is requesting an update"
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r4)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbnz r4 = r2.zzc     // Catch: java.lang.Throwable -> L47
            int r4 = com.google.android.gms.internal.ads.zzbnz.zza(r4)     // Catch: java.lang.Throwable -> L47
            if (r4 != 0) goto L31
            java.lang.String r4 = "Starting reload."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r4)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbnz r4 = r2.zzc     // Catch: java.lang.Throwable -> L47
            r0 = 2
            com.google.android.gms.internal.ads.zzbnz.zzh(r4, r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbnz r4 = r2.zzc     // Catch: java.lang.Throwable -> L47
            r0 = 0
            r4.zzd(r0)     // Catch: java.lang.Throwable -> L47
        L31:
            com.google.android.gms.internal.ads.zzbmu r4 = r2.zza     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "/requestReload"
            com.google.android.gms.ads.internal.util.zzby r1 = r2.zzb     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r1.zza()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbjw r1 = (com.google.android.gms.internal.ads.zzbjw) r1     // Catch: java.lang.Throwable -> L47
            r4.zzr(r0, r1)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "loadJavascriptEngine > /requestReload handler: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            return
        L47:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            throw r4
    }
}
