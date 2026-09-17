package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzapw extends java.lang.Thread {
    private final java.util.concurrent.BlockingQueue zza;
    private final com.google.android.gms.internal.ads.zzapv zzb;
    private final com.google.android.gms.internal.ads.zzapm zzc;
    private volatile boolean zzd;
    private final com.google.android.gms.internal.ads.zzapt zze;

    public zzapw(java.util.concurrent.BlockingQueue r2, com.google.android.gms.internal.ads.zzapv r3, com.google.android.gms.internal.ads.zzapm r4, com.google.android.gms.internal.ads.zzapt r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzd = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zze = r5
            return
    }

    private void zzb() throws java.lang.InterruptedException {
            r7 = this;
            java.util.concurrent.BlockingQueue r0 = r7.zza
            java.lang.Object r0 = r0.take()
            com.google.android.gms.internal.ads.zzaqc r0 = (com.google.android.gms.internal.ads.zzaqc) r0
            android.os.SystemClock.elapsedRealtime()
            r1 = 3
            r0.zzt(r1)
            r1 = 4
            java.lang.String r2 = "network-queue-take"
            r0.zzm(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            r0.zzw()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            int r2 = r0.zzc()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            com.google.android.gms.internal.ads.zzapv r2 = r7.zzb     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            com.google.android.gms.internal.ads.zzapy r2 = r2.zza(r0)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            java.lang.String r3 = "network-http-complete"
            r0.zzm(r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            boolean r3 = r2.zze     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            if (r3 == 0) goto L3d
            boolean r3 = r0.zzv()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            if (r3 == 0) goto L3d
            java.lang.String r2 = "not-modified"
            r0.zzp(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            r0.zzr()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            goto L96
        L3d:
            com.google.android.gms.internal.ads.zzaqi r2 = r0.zzh(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            java.lang.String r3 = "network-parse-complete"
            r0.zzm(r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            com.google.android.gms.internal.ads.zzapl r3 = r2.zzb     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            if (r3 == 0) goto L5a
            com.google.android.gms.internal.ads.zzapm r3 = r7.zzc     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            java.lang.String r4 = r0.zzj()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            com.google.android.gms.internal.ads.zzapl r5 = r2.zzb     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            r3.zzd(r4, r5)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            java.lang.String r3 = "network-cache-written"
            r0.zzm(r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
        L5a:
            r0.zzq()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            com.google.android.gms.internal.ads.zzapt r3 = r7.zze     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            r4 = 0
            r3.zzb(r0, r2, r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            r0.zzs(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 com.google.android.gms.internal.ads.zzaql -> L8a
            goto L96
        L67:
            r2 = move-exception
            goto L9a
        L69:
            r2 = move-exception
            java.lang.String r3 = "Unhandled exception %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L67
            r5 = 0
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L67
            r4[r5] = r6     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.zzaqo.zzc(r2, r3, r4)     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.zzaql r3 = new com.google.android.gms.internal.ads.zzaql     // Catch: java.lang.Throwable -> L67
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L67
            android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.zzapt r2 = r7.zze     // Catch: java.lang.Throwable -> L67
            r2.zza(r0, r3)     // Catch: java.lang.Throwable -> L67
            r0.zzr()     // Catch: java.lang.Throwable -> L67
            goto L96
        L8a:
            r2 = move-exception
            android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.zzapt r3 = r7.zze     // Catch: java.lang.Throwable -> L67
            r3.zza(r0, r2)     // Catch: java.lang.Throwable -> L67
            r0.zzr()     // Catch: java.lang.Throwable -> L67
        L96:
            r0.zzt(r1)
            return
        L9a:
            r0.zzt(r1)
            throw r2
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r2 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L5:
            r2.zzb()     // Catch: java.lang.InterruptedException -> L9
            goto L5
        L9:
            boolean r0 = r2.zzd
            if (r0 == 0) goto L15
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        L15:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it"
            com.google.android.gms.internal.ads.zzaqo.zzb(r1, r0)
            goto L5
    }

    public final void zza() {
            r1 = this;
            r0 = 1
            r1.zzd = r0
            r1.interrupt()
            return
    }
}
