package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzazm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzazn zza;

    zzazm(com.google.android.gms.internal.ads.zzazn r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.internal.ads.zzazn r0 = r5.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzazn.zzc(r0)
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzazn r1 = r5.zza     // Catch: java.lang.Throwable -> L46
            boolean r2 = com.google.android.gms.internal.ads.zzazn.zzi(r1)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L3f
            boolean r2 = com.google.android.gms.internal.ads.zzazn.zzj(r1)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L3f
            r2 = 0
            com.google.android.gms.internal.ads.zzazn.zze(r1, r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "App went background"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzazn r1 = r5.zza     // Catch: java.lang.Throwable -> L46
            java.util.List r1 = com.google.android.gms.internal.ads.zzazn.zzd(r1)     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L46
        L28:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L44
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzazo r3 = (com.google.android.gms.internal.ads.zzazo) r3     // Catch: java.lang.Throwable -> L46
            r3.zza(r2)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L46
            goto L28
        L38:
            r3 = move-exception
            java.lang.String r4 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r3)     // Catch: java.lang.Throwable -> L46
            goto L28
        L3f:
            java.lang.String r1 = "App is still foreground"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r1
    }
}
