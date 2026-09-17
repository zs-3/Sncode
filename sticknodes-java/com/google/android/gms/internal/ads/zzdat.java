package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdat extends com.google.android.gms.internal.ads.zzddr {
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.android.gms.common.util.Clock zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private java.util.concurrent.ScheduledFuture zzi;
    private java.util.concurrent.ScheduledFuture zzj;

    public zzdat(java.util.concurrent.ScheduledExecutorService r3, com.google.android.gms.common.util.Clock r4) {
            r2 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            r2.<init>(r0)
            r0 = -1
            r2.zzd = r0
            r2.zze = r0
            r2.zzf = r0
            r2.zzg = r0
            r0 = 0
            r2.zzh = r0
            r2.zzb = r3
            r2.zzc = r4
            return
    }

    private final synchronized void zzf(long r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.ScheduledFuture r0 = r3.zzi     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L11
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L11
            java.util.concurrent.ScheduledFuture r0 = r3.zzi     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L2c
        L11:
            com.google.android.gms.common.util.Clock r0 = r3.zzc     // Catch: java.lang.Throwable -> L2c
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L2c
            long r0 = r0 + r4
            r3.zzd = r0     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.ScheduledExecutorService r0 = r3.zzb     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzdaq r1 = new com.google.android.gms.internal.ads.zzdaq     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.ScheduledFuture r4 = r0.schedule(r1, r4, r2)     // Catch: java.lang.Throwable -> L2c
            r3.zzi = r4     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    private final synchronized void zzg(long r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.ScheduledFuture r0 = r3.zzj     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L11
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L11
            java.util.concurrent.ScheduledFuture r0 = r3.zzj     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L2c
        L11:
            com.google.android.gms.common.util.Clock r0 = r3.zzc     // Catch: java.lang.Throwable -> L2c
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L2c
            long r0 = r0 + r4
            r3.zze = r0     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.ScheduledExecutorService r0 = r3.zzb     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzdas r1 = new com.google.android.gms.internal.ads.zzdas     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.ScheduledFuture r4 = r0.schedule(r1, r4, r2)     // Catch: java.lang.Throwable -> L2c
            r3.zzj = r4     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zza() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.zzh = r0     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r2.zzf(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void zzb() {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzh     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L47
            java.util.concurrent.ScheduledFuture r0 = r8.zzi     // Catch: java.lang.Throwable -> L49
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L23
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L23
            java.util.concurrent.ScheduledFuture r0 = r8.zzi     // Catch: java.lang.Throwable -> L49
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L49
            long r4 = r8.zzd     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.common.util.Clock r0 = r8.zzc     // Catch: java.lang.Throwable -> L49
            long r6 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L49
            long r4 = r4 - r6
            r8.zzf = r4     // Catch: java.lang.Throwable -> L49
            goto L25
        L23:
            r8.zzf = r2     // Catch: java.lang.Throwable -> L49
        L25:
            java.util.concurrent.ScheduledFuture r0 = r8.zzj     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L40
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L40
            java.util.concurrent.ScheduledFuture r0 = r8.zzj     // Catch: java.lang.Throwable -> L49
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L49
            long r0 = r8.zze     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.common.util.Clock r2 = r8.zzc     // Catch: java.lang.Throwable -> L49
            long r2 = r2.elapsedRealtime()     // Catch: java.lang.Throwable -> L49
            long r0 = r0 - r2
            r8.zzg = r0     // Catch: java.lang.Throwable -> L49
            goto L42
        L40:
            r8.zzg = r2     // Catch: java.lang.Throwable -> L49
        L42:
            r0 = 1
            r8.zzh = r0     // Catch: java.lang.Throwable -> L49
            monitor-exit(r8)
            return
        L47:
            monitor-exit(r8)
            return
        L49:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
    }

    public final synchronized void zzc() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzh     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L32
            long r0 = r5.zzf     // Catch: java.lang.Throwable -> L34
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1a
            java.util.concurrent.ScheduledFuture r0 = r5.zzi     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L1a
            long r0 = r5.zzf     // Catch: java.lang.Throwable -> L34
            r5.zzf(r0)     // Catch: java.lang.Throwable -> L34
        L1a:
            long r0 = r5.zzg     // Catch: java.lang.Throwable -> L34
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2d
            java.util.concurrent.ScheduledFuture r0 = r5.zzj     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L2d
            long r0 = r5.zzg     // Catch: java.lang.Throwable -> L34
            r5.zzg(r0)     // Catch: java.lang.Throwable -> L34
        L2d:
            r0 = 0
            r5.zzh = r0     // Catch: java.lang.Throwable -> L34
            monitor-exit(r5)
            return
        L32:
            monitor-exit(r5)
            return
        L34:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final synchronized void zzd(int r7) {
            r6 = this;
            monitor-enter(r6)
            if (r7 > 0) goto L4
            goto L33
        L4:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L3a
            long r1 = (long) r7     // Catch: java.lang.Throwable -> L3a
            long r0 = r0.toMillis(r1)     // Catch: java.lang.Throwable -> L3a
            boolean r7 = r6.zzh     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L21
            long r2 = r6.zzf     // Catch: java.lang.Throwable -> L3a
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L1c
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r6.zzf = r0     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r6)
            return
        L21:
            com.google.android.gms.common.util.Clock r7 = r6.zzc     // Catch: java.lang.Throwable -> L3a
            long r2 = r7.elapsedRealtime()     // Catch: java.lang.Throwable -> L3a
            long r4 = r6.zzd     // Catch: java.lang.Throwable -> L3a
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L35
            long r4 = r4 - r2
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L33
            goto L35
        L33:
            monitor-exit(r6)
            return
        L35:
            r6.zzf(r0)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r6)
            return
        L3a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final synchronized void zze(int r7) {
            r6 = this;
            monitor-enter(r6)
            if (r7 > 0) goto L4
            goto L33
        L4:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L3a
            long r1 = (long) r7     // Catch: java.lang.Throwable -> L3a
            long r0 = r0.toMillis(r1)     // Catch: java.lang.Throwable -> L3a
            boolean r7 = r6.zzh     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L21
            long r2 = r6.zzg     // Catch: java.lang.Throwable -> L3a
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L1c
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r6.zzg = r0     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r6)
            return
        L21:
            com.google.android.gms.common.util.Clock r7 = r6.zzc     // Catch: java.lang.Throwable -> L3a
            long r2 = r7.elapsedRealtime()     // Catch: java.lang.Throwable -> L3a
            long r4 = r6.zze     // Catch: java.lang.Throwable -> L3a
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L35
            long r4 = r4 - r2
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L33
            goto L35
        L33:
            monitor-exit(r6)
            return
        L35:
            r6.zzg(r0)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r6)
            return
        L3a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }
}
