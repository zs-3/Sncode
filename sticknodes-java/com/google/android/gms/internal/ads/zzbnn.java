package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbnn implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbny zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbmu zzb;
    final /* synthetic */ java.util.ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnz zze;

    zzbnn(com.google.android.gms.internal.ads.zzbnz r1, com.google.android.gms.internal.ads.zzbny r2, com.google.android.gms.internal.ads.zzbmu r3, java.util.ArrayList r4, long r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            java.lang.String r0 = "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzbnz r0 = r9.zze
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbnz.zzf(r0)
            monitor-enter(r0)
            java.lang.String r1 = "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.internal.ads.zzbny r1 = r9.zza     // Catch: java.lang.Throwable -> Le8
            int r1 = r1.zze()     // Catch: java.lang.Throwable -> Le8
            r2 = -1
            if (r1 == r2) goto Le1
            com.google.android.gms.internal.ads.zzbny r1 = r9.zza     // Catch: java.lang.Throwable -> Le8
            int r1 = r1.zze()     // Catch: java.lang.Throwable -> Le8
            r2 = 1
            if (r1 != r2) goto L25
            goto Le1
        L25:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzho     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Le8
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> Le8
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Le8
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Le8
            if (r1 == 0) goto L46
            com.google.android.gms.internal.ads.zzbny r1 = r9.zza     // Catch: java.lang.Throwable -> Le8
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> Le8
            java.lang.String r3 = "Unable to fully load JS engine."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r3 = "SdkJavascriptFactory.loadJavascriptEngine.Runnable"
            r1.zzh(r2, r3)     // Catch: java.lang.Throwable -> Le8
            goto L4b
        L46:
            com.google.android.gms.internal.ads.zzbny r1 = r9.zza     // Catch: java.lang.Throwable -> Le8
            r1.zzg()     // Catch: java.lang.Throwable -> Le8
        L4b:
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.internal.ads.zzbmu r2 = r9.zzb     // Catch: java.lang.Throwable -> Le8
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.internal.ads.zzbnm r3 = new com.google.android.gms.internal.ads.zzbnm     // Catch: java.lang.Throwable -> Le8
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Le8
            r1.execute(r3)     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzc     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Le8
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.internal.ads.zzbny r2 = r9.zza     // Catch: java.lang.Throwable -> Le8
            int r2 = r2.zze()     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.internal.ads.zzbnz r3 = r9.zze     // Catch: java.lang.Throwable -> Le8
            int r3 = com.google.android.gms.internal.ads.zzbnz.zza(r3)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList r4 = r9.zzc     // Catch: java.lang.Throwable -> Le8
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> Le8
            if (r4 == 0) goto L7f
            java.lang.String r4 = ". Still waiting for the engine to be loaded"
            goto L9b
        L7f:
            java.util.ArrayList r4 = r9.zzc     // Catch: java.lang.Throwable -> Le8
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Le8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le8
            r5.<init>()     // Catch: java.lang.Throwable -> Le8
            java.lang.String r6 = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is "
            r5.append(r6)     // Catch: java.lang.Throwable -> Le8
            r5.append(r4)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> Le8
        L9b:
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> Le8
            long r5 = r5.currentTimeMillis()     // Catch: java.lang.Throwable -> Le8
            long r7 = r9.zzd     // Catch: java.lang.Throwable -> Le8
            long r5 = r5 - r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le8
            r7.<init>()     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = "Could not finish the full JS engine loading in "
            r7.append(r8)     // Catch: java.lang.Throwable -> Le8
            r7.append(r1)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r1 = " ms. JS engine session reference status(fullLoadTimeout) is "
            r7.append(r1)     // Catch: java.lang.Throwable -> Le8
            r7.append(r2)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r1 = ". Update status(fullLoadTimeout) is "
            r7.append(r1)     // Catch: java.lang.Throwable -> Le8
            r7.append(r3)     // Catch: java.lang.Throwable -> Le8
            r7.append(r4)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r1 = " ms. Total latency(fullLoadTimeout) is "
            r7.append(r1)     // Catch: java.lang.Throwable -> Le8
            r7.append(r5)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r1 = " ms at timeout. Rejecting."
            r7.append(r1)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> Le8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r0 = "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        Le1:
            java.lang.String r1 = "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> Le8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le8
            return
        Le8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le8
            throw r1
    }
}
