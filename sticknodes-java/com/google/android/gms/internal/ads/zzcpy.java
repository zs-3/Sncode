package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcpy implements com.google.android.gms.internal.ads.zzazo {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final com.google.android.gms.common.util.Clock zzb;
    private java.util.concurrent.ScheduledFuture zzc;
    private long zzd;
    private long zze;
    private java.lang.Runnable zzf;
    private boolean zzg;

    public zzcpy(java.util.concurrent.ScheduledExecutorService r3, com.google.android.gms.common.util.Clock r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.zzd = r0
            r2.zze = r0
            r0 = 0
            r2.zzf = r0
            r0 = 0
            r2.zzg = r0
            r2.zza = r3
            r2.zzb = r4
            com.google.android.gms.internal.ads.zzazp r3 = com.google.android.gms.ads.internal.zzu.zzb()
            r3.zzc(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzazo
    public final void zza(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.zzc()
            return
        L6:
            r0.zzb()
            return
    }

    final synchronized void zzb() {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.zzg     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L29
            java.util.concurrent.ScheduledFuture r0 = r6.zzc     // Catch: java.lang.Throwable -> L2b
            r1 = 1
            if (r0 == 0) goto L21
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L21
            java.util.concurrent.ScheduledFuture r0 = r6.zzc     // Catch: java.lang.Throwable -> L2b
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L2b
            long r2 = r6.zzd     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.util.Clock r0 = r6.zzb     // Catch: java.lang.Throwable -> L2b
            long r4 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L2b
            long r2 = r2 - r4
            r6.zze = r2     // Catch: java.lang.Throwable -> L2b
            goto L25
        L21:
            r2 = -1
            r6.zze = r2     // Catch: java.lang.Throwable -> L2b
        L25:
            r6.zzg = r1     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return
        L29:
            monitor-exit(r6)
            return
        L2b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    final synchronized void zzc() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzg     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2a
            long r0 = r5.zze     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L25
            java.util.concurrent.ScheduledFuture r0 = r5.zzc     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L25
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L25
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza     // Catch: java.lang.Throwable -> L2c
            java.lang.Runnable r1 = r5.zzf     // Catch: java.lang.Throwable -> L2c
            long r2 = r5.zze     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)     // Catch: java.lang.Throwable -> L2c
            r5.zzc = r0     // Catch: java.lang.Throwable -> L2c
        L25:
            r0 = 0
            r5.zzg = r0     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)
            return
        L2a:
            monitor-exit(r5)
            return
        L2c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final synchronized void zzd(int r5, java.lang.Runnable r6) {
            r4 = this;
            monitor-enter(r4)
            r4.zzf = r6     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.common.util.Clock r0 = r4.zzb     // Catch: java.lang.Throwable -> L19
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L19
            long r2 = (long) r5     // Catch: java.lang.Throwable -> L19
            long r0 = r0 + r2
            r4.zzd = r0     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.ScheduledExecutorService r0 = r4.zza     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.ScheduledFuture r5 = r0.schedule(r6, r2, r5)     // Catch: java.lang.Throwable -> L19
            r4.zzc = r5     // Catch: java.lang.Throwable -> L19
            monitor-exit(r4)
            return
        L19:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
