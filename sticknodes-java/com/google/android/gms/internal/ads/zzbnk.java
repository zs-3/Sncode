package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbnk implements com.google.android.gms.internal.ads.zzbjw {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbny zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbmu zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnz zzd;

    zzbnk(com.google.android.gms.internal.ads.zzbnz r1, long r2, com.google.android.gms.internal.ads.zzbny r4, com.google.android.gms.internal.ads.zzbmu r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzboa r3 = (com.google.android.gms.internal.ads.zzboa) r3
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r3.currentTimeMillis()
            long r0 = r2.zza
            long r3 = r3 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onGmsg /jsLoaded. JsLoaded latency is "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " ms."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            java.lang.String r3 = "loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            com.google.android.gms.internal.ads.zzbnz r3 = r2.zzd
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbnz.zzf(r3)
            monitor-enter(r3)
            java.lang.String r4 = "loadJavascriptEngine > /jsLoaded handler: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.zzbny r4 = r2.zzb     // Catch: java.lang.Throwable -> L81
            int r4 = r4.zze()     // Catch: java.lang.Throwable -> L81
            r0 = -1
            if (r4 == r0) goto L7a
            com.google.android.gms.internal.ads.zzbny r4 = r2.zzb     // Catch: java.lang.Throwable -> L81
            int r4 = r4.zze()     // Catch: java.lang.Throwable -> L81
            r0 = 1
            if (r4 != r0) goto L4a
            goto L7a
        L4a:
            com.google.android.gms.internal.ads.zzbnz r4 = r2.zzd     // Catch: java.lang.Throwable -> L81
            r0 = 0
            com.google.android.gms.internal.ads.zzbnz.zzh(r4, r0)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.zzbmu r4 = r2.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "/log"
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzg     // Catch: java.lang.Throwable -> L81
            r4.zzq(r0, r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "/result"
            com.google.android.gms.internal.ads.zzbkm r1 = com.google.android.gms.internal.ads.zzbjv.zzo     // Catch: java.lang.Throwable -> L81
            r4.zzq(r0, r1)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.zzbny r4 = r2.zzb     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.zzbmu r0 = r2.zzc     // Catch: java.lang.Throwable -> L81
            r4.zzi(r0)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.zzbnz r4 = r2.zzd     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.zzbny r0 = r2.zzb     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.zzbnz.zzg(r4, r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "Successfully loaded JS Engine."
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "loadJavascriptEngine > /jsLoaded handler: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            return
        L7a:
            java.lang.String r4 = "loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled"
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            return
        L81:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            throw r4
    }
}
