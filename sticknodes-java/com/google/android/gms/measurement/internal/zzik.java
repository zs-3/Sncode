package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzik extends java.lang.Thread {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzil zza;
    private final java.lang.Object zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private boolean zzd;

    public zzik(com.google.android.gms.measurement.internal.zzil r1, java.lang.String r2, java.util.concurrent.BlockingQueue r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r1 = 0
            r0.zzd = r1
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.zzb = r1
            r0.zzc = r3
            r0.setName(r2)
            return
    }

    private final void zzb() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r4.zza
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzil.zzd(r0)
            monitor-enter(r1)
            boolean r2 = r4.zzd     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L40
            java.util.concurrent.Semaphore r2 = com.google.android.gms.measurement.internal.zzil.zzi(r0)     // Catch: java.lang.Throwable -> L42
            r2.release()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzil.zzd(r0)     // Catch: java.lang.Throwable -> L42
            r2.notifyAll()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.measurement.internal.zzik r2 = com.google.android.gms.measurement.internal.zzil.zzb(r0)     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r4 != r2) goto L24
            com.google.android.gms.measurement.internal.zzil.zzm(r0, r3)     // Catch: java.lang.Throwable -> L42
            goto L3d
        L24:
            com.google.android.gms.measurement.internal.zzik r2 = com.google.android.gms.measurement.internal.zzil.zza(r0)     // Catch: java.lang.Throwable -> L42
            if (r4 != r2) goto L2e
            com.google.android.gms.measurement.internal.zzil.zzl(r0, r3)     // Catch: java.lang.Throwable -> L42
            goto L3d
        L2e:
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "Current scheduler thread is neither worker nor network"
            r0.zza(r2)     // Catch: java.lang.Throwable -> L42
        L3d:
            r0 = 1
            r4.zzd = r0     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r0
    }

    private final void zzc(java.lang.InterruptedException r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r3.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()
            java.lang.String r1 = r3.getName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " was interrupted"
            java.lang.String r1 = r1.concat(r2)
            r0.zzb(r1, r4)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r6 = this;
            r0 = 1
            r1 = 0
        L2:
            if (r1 != 0) goto L14
            com.google.android.gms.measurement.internal.zzil r2 = r6.zza     // Catch: java.lang.InterruptedException -> Lf
            java.util.concurrent.Semaphore r2 = com.google.android.gms.measurement.internal.zzil.zzi(r2)     // Catch: java.lang.InterruptedException -> Lf
            r2.acquire()     // Catch: java.lang.InterruptedException -> Lf
            r1 = 1
            goto L2
        Lf:
            r2 = move-exception
            r6.zzc(r2)
            goto L2
        L14:
            int r1 = android.os.Process.myTid()     // Catch: java.lang.Throwable -> L6d
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch: java.lang.Throwable -> L6d
        L1c:
            java.util.concurrent.BlockingQueue r2 = r6.zzc     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r3 = r2.poll()     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.measurement.internal.zzij r3 = (com.google.android.gms.measurement.internal.zzij) r3     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L35
            boolean r2 = r3.zza     // Catch: java.lang.Throwable -> L6d
            if (r0 == r2) goto L2d
            r2 = 10
            goto L2e
        L2d:
            r2 = r1
        L2e:
            android.os.Process.setThreadPriority(r2)     // Catch: java.lang.Throwable -> L6d
            r3.run()     // Catch: java.lang.Throwable -> L6d
            goto L1c
        L35:
            java.lang.Object r3 = r6.zzb     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.peek()     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L4d
            com.google.android.gms.measurement.internal.zzil r2 = r6.zza     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.measurement.internal.zzil.zzs(r2)     // Catch: java.lang.Throwable -> L6a
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch: java.lang.InterruptedException -> L49 java.lang.Throwable -> L6a
            goto L4d
        L49:
            r2 = move-exception
            r6.zzc(r2)     // Catch: java.lang.Throwable -> L6a
        L4d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.measurement.internal.zzil r2 = r6.zza     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzil.zzd(r2)     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.BlockingQueue r3 = r6.zzc     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L65
            r6.zzb()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
            r6.zzb()
            return
        L65:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
            goto L1c
        L67:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
            throw r0     // Catch: java.lang.Throwable -> L6d
        L6a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6d
        L6d:
            r0 = move-exception
            r6.zzb()
            throw r0
    }

    public final void zza() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            r0.notifyAll()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }
}
