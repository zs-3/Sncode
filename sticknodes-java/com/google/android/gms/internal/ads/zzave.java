package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzave implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzavf zza;

    zzave(com.google.android.gms.internal.ads.zzavf r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.internal.ads.zzavf r0 = r5.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzavf.zzd(r0)
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzavf r1 = r5.zza     // Catch: java.lang.Throwable -> L3e
            boolean r1 = com.google.android.gms.internal.ads.zzavf.zzq(r1)     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L3c
            com.google.android.gms.internal.ads.zzavf r1 = r5.zza     // Catch: java.lang.Throwable -> L3e
            r2 = 1
            com.google.android.gms.internal.ads.zzavf.zzi(r1, r2)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzavf r0 = r5.zza     // Catch: java.lang.Exception -> L1c
            com.google.android.gms.internal.ads.zzavf.zzj(r0)     // Catch: java.lang.Exception -> L1c
            goto L2a
        L1c:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzavf r1 = r5.zza
            com.google.android.gms.internal.ads.zzfqz r1 = com.google.android.gms.internal.ads.zzavf.zzc(r1)
            r2 = 2023(0x7e7, float:2.835E-42)
            r3 = -1
            r1.zzc(r2, r3, r0)
        L2a:
            com.google.android.gms.internal.ads.zzavf r0 = r5.zza
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzavf.zzd(r0)
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzavf r0 = r5.zza     // Catch: java.lang.Throwable -> L39
            r2 = 0
            com.google.android.gms.internal.ads.zzavf.zzi(r0, r2)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L39
            throw r0
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1
    }
}
