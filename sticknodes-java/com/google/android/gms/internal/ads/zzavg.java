package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzavg implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzavh zza;

    zzavg(com.google.android.gms.internal.ads.zzavh r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.android.gms.internal.ads.zzavh r0 = r6.zza
            java.lang.Boolean r0 = r0.zzb
            if (r0 == 0) goto L7
            return
        L7:
            android.os.ConditionVariable r0 = com.google.android.gms.internal.ads.zzavh.zza()
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzavh r1 = r6.zza     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r1 = r1.zzb     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L14:
            r1 = 0
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbcv.zzcB     // Catch: java.lang.IllegalStateException -> L22 java.lang.Throwable -> L48
            java.lang.Object r2 = r2.zze()     // Catch: java.lang.IllegalStateException -> L22 java.lang.Throwable -> L48
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.IllegalStateException -> L22 java.lang.Throwable -> L48
            boolean r2 = r2.booleanValue()     // Catch: java.lang.IllegalStateException -> L22 java.lang.Throwable -> L48
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 == 0) goto L36
            com.google.android.gms.internal.ads.zzavh r3 = r6.zza     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzawo r3 = com.google.android.gms.internal.ads.zzavh.zzb(r3)     // Catch: java.lang.Throwable -> L37
            android.content.Context r3 = r3.zza     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "ADSHIELD"
            r5 = 0
            com.google.android.gms.internal.ads.zzftb r3 = com.google.android.gms.internal.ads.zzftb.zzb(r3, r4, r5)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzavh.zza = r3     // Catch: java.lang.Throwable -> L37
        L36:
            r1 = r2
        L37:
            com.google.android.gms.internal.ads.zzavh r2 = r6.zza     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L48
            r2.zzb = r1     // Catch: java.lang.Throwable -> L48
            android.os.ConditionVariable r1 = com.google.android.gms.internal.ads.zzavh.zza()     // Catch: java.lang.Throwable -> L48
            r1.open()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r1
    }
}
