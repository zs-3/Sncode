package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzapo extends java.lang.Thread {
    private static final boolean zza = false;
    private final java.util.concurrent.BlockingQueue zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private final com.google.android.gms.internal.ads.zzapm zzd;
    private volatile boolean zze;
    private final com.google.android.gms.internal.ads.zzaqp zzf;
    private final com.google.android.gms.internal.ads.zzapt zzg;

    static {
            boolean r0 = com.google.android.gms.internal.ads.zzaqo.zzb
            com.google.android.gms.internal.ads.zzapo.zza = r0
            return
    }

    public zzapo(java.util.concurrent.BlockingQueue r2, java.util.concurrent.BlockingQueue r3, com.google.android.gms.internal.ads.zzapm r4, com.google.android.gms.internal.ads.zzapt r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zze = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r4
            r1.zzg = r5
            com.google.android.gms.internal.ads.zzaqp r2 = new com.google.android.gms.internal.ads.zzaqp
            r2.<init>(r1, r3, r5)
            r1.zzf = r2
            return
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.BlockingQueue zza(com.google.android.gms.internal.ads.zzapo r0) {
            java.util.concurrent.BlockingQueue r0 = r0.zzc
            return r0
    }

    private void zzc() throws java.lang.InterruptedException {
            r11 = this;
            java.util.concurrent.BlockingQueue r0 = r11.zzb
            java.lang.Object r0 = r0.take()
            com.google.android.gms.internal.ads.zzaqc r0 = (com.google.android.gms.internal.ads.zzaqc) r0
            java.lang.String r1 = "cache-queue-take"
            r0.zzm(r1)
            r1 = 1
            r0.zzt(r1)
            r2 = 2
            r0.zzw()     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzapm r3 = r11.zzd     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = r0.zzj()     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzapl r3 = r3.zza(r4)     // Catch: java.lang.Throwable -> Lc4
            if (r3 != 0) goto L35
            java.lang.String r1 = "cache-miss"
            r0.zzm(r1)     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzaqp r1 = r11.zzf     // Catch: java.lang.Throwable -> Lc4
            boolean r1 = r1.zzc(r0)     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto Lc0
            java.util.concurrent.BlockingQueue r1 = r11.zzc     // Catch: java.lang.Throwable -> Lc4
            r1.put(r0)     // Catch: java.lang.Throwable -> Lc4
            goto Lc0
        L35:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc4
            boolean r6 = r3.zza(r4)     // Catch: java.lang.Throwable -> Lc4
            if (r6 == 0) goto L55
            java.lang.String r1 = "cache-hit-expired"
            r0.zzm(r1)     // Catch: java.lang.Throwable -> Lc4
            r0.zze(r3)     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzaqp r1 = r11.zzf     // Catch: java.lang.Throwable -> Lc4
            boolean r1 = r1.zzc(r0)     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto Lc0
            java.util.concurrent.BlockingQueue r1 = r11.zzc     // Catch: java.lang.Throwable -> Lc4
            r1.put(r0)     // Catch: java.lang.Throwable -> Lc4
            goto Lc0
        L55:
            java.lang.String r6 = "cache-hit"
            r0.zzm(r6)     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzapy r6 = new com.google.android.gms.internal.ads.zzapy     // Catch: java.lang.Throwable -> Lc4
            byte[] r7 = r3.zza     // Catch: java.lang.Throwable -> Lc4
            java.util.Map r8 = r3.zzg     // Catch: java.lang.Throwable -> Lc4
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzaqi r6 = r0.zzh(r6)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = "cache-hit-parsed"
            r0.zzm(r7)     // Catch: java.lang.Throwable -> Lc4
            boolean r7 = r6.zzc()     // Catch: java.lang.Throwable -> Lc4
            r8 = 0
            if (r7 != 0) goto L92
            java.lang.String r3 = "cache-parsing-failed"
            r0.zzm(r3)     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzapm r3 = r11.zzd     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = r0.zzj()     // Catch: java.lang.Throwable -> Lc4
            r3.zzc(r4, r1)     // Catch: java.lang.Throwable -> Lc4
            r0.zze(r8)     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzaqp r1 = r11.zzf     // Catch: java.lang.Throwable -> Lc4
            boolean r1 = r1.zzc(r0)     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto Lc0
            java.util.concurrent.BlockingQueue r1 = r11.zzc     // Catch: java.lang.Throwable -> Lc4
            r1.put(r0)     // Catch: java.lang.Throwable -> Lc4
            goto Lc0
        L92:
            long r9 = r3.zzf     // Catch: java.lang.Throwable -> Lc4
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 >= 0) goto Lbb
            java.lang.String r4 = "cache-hit-refresh-needed"
            r0.zzm(r4)     // Catch: java.lang.Throwable -> Lc4
            r0.zze(r3)     // Catch: java.lang.Throwable -> Lc4
            r6.zzd = r1     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzaqp r1 = r11.zzf     // Catch: java.lang.Throwable -> Lc4
            boolean r1 = r1.zzc(r0)     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto Lb5
            com.google.android.gms.internal.ads.zzapt r1 = r11.zzg     // Catch: java.lang.Throwable -> Lc4
            com.google.android.gms.internal.ads.zzapn r3 = new com.google.android.gms.internal.ads.zzapn     // Catch: java.lang.Throwable -> Lc4
            r3.<init>(r11, r0)     // Catch: java.lang.Throwable -> Lc4
            r1.zzb(r0, r6, r3)     // Catch: java.lang.Throwable -> Lc4
            goto Lc0
        Lb5:
            com.google.android.gms.internal.ads.zzapt r1 = r11.zzg     // Catch: java.lang.Throwable -> Lc4
            r1.zzb(r0, r6, r8)     // Catch: java.lang.Throwable -> Lc4
            goto Lc0
        Lbb:
            com.google.android.gms.internal.ads.zzapt r1 = r11.zzg     // Catch: java.lang.Throwable -> Lc4
            r1.zzb(r0, r6, r8)     // Catch: java.lang.Throwable -> Lc4
        Lc0:
            r0.zzt(r2)
            return
        Lc4:
            r1 = move-exception
            r0.zzt(r2)
            throw r1
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r3 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzapo.zza
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "start new dispatcher"
            com.google.android.gms.internal.ads.zzaqo.zzd(r2, r0)
        Lc:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.google.android.gms.internal.ads.zzapm r0 = r3.zzd
            r0.zzb()
        L16:
            r3.zzc()     // Catch: java.lang.InterruptedException -> L1a
            goto L16
        L1a:
            boolean r0 = r3.zze
            if (r0 == 0) goto L26
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        L26:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it"
            com.google.android.gms.internal.ads.zzaqo.zzb(r2, r0)
            goto L16
    }

    public final void zzb() {
            r1 = this;
            r0 = 1
            r1.zze = r0
            r1.interrupt()
            return
    }
}
