package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzil extends com.google.android.gms.measurement.internal.zzjr {
    private static final java.util.concurrent.atomic.AtomicLong zza = null;
    private com.google.android.gms.measurement.internal.zzik zzb;
    private com.google.android.gms.measurement.internal.zzik zzc;
    private final java.util.concurrent.PriorityBlockingQueue zzd;
    private final java.util.concurrent.BlockingQueue zze;
    private final java.lang.Thread.UncaughtExceptionHandler zzf;
    private final java.lang.Thread.UncaughtExceptionHandler zzg;
    private final java.lang.Object zzh;
    private final java.util.concurrent.Semaphore zzi;
    private volatile boolean zzj;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = -9223372036854775808
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzil.zza = r0
            return
    }

    zzil(com.google.android.gms.measurement.internal.zzio r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.zzh = r2
            java.util.concurrent.Semaphore r2 = new java.util.concurrent.Semaphore
            r0 = 2
            r2.<init>(r0)
            r1.zzi = r2
            java.util.concurrent.PriorityBlockingQueue r2 = new java.util.concurrent.PriorityBlockingQueue
            r2.<init>()
            r1.zzd = r2
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r2.<init>()
            r1.zze = r2
            com.google.android.gms.measurement.internal.zzii r2 = new com.google.android.gms.measurement.internal.zzii
            java.lang.String r0 = "Thread death: Uncaught exception on worker thread"
            r2.<init>(r1, r0)
            r1.zzf = r2
            com.google.android.gms.measurement.internal.zzii r2 = new com.google.android.gms.measurement.internal.zzii
            java.lang.String r0 = "Thread death: Uncaught exception on network thread"
            r2.<init>(r1, r0)
            r1.zzg = r2
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzik zza(com.google.android.gms.measurement.internal.zzil r0) {
            com.google.android.gms.measurement.internal.zzik r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzik zzb(com.google.android.gms.measurement.internal.zzil r0) {
            com.google.android.gms.measurement.internal.zzik r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzd(com.google.android.gms.measurement.internal.zzil r0) {
            java.lang.Object r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Semaphore zzi(com.google.android.gms.measurement.internal.zzil r0) {
            java.util.concurrent.Semaphore r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicLong zzj() {
            java.util.concurrent.atomic.AtomicLong r0 = com.google.android.gms.measurement.internal.zzil.zza
            return r0
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.measurement.internal.zzil r0, com.google.android.gms.measurement.internal.zzik r1) {
            r1 = 0
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzm(com.google.android.gms.measurement.internal.zzil r0, com.google.android.gms.measurement.internal.zzik r1) {
            r1 = 0
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean zzs(com.google.android.gms.measurement.internal.zzil r0) {
            boolean r0 = r0.zzj
            r0 = 0
            return r0
    }

    private final void zzz(com.google.android.gms.measurement.internal.zzij r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzh
            monitor-enter(r0)
            java.util.concurrent.PriorityBlockingQueue r1 = r3.zzd     // Catch: java.lang.Throwable -> L25
            r1.add(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzik r4 = r3.zzb     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L20
            com.google.android.gms.measurement.internal.zzik r4 = new com.google.android.gms.measurement.internal.zzik     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "Measurement Worker"
            r4.<init>(r3, r2, r1)     // Catch: java.lang.Throwable -> L25
            r3.zzb = r4     // Catch: java.lang.Throwable -> L25
            java.lang.Thread$UncaughtExceptionHandler r1 = r3.zzf     // Catch: java.lang.Throwable -> L25
            r4.setUncaughtExceptionHandler(r1)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzik r4 = r3.zzb     // Catch: java.lang.Throwable -> L25
            r4.start()     // Catch: java.lang.Throwable -> L25
            goto L23
        L20:
            r4.zza()     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void zzaY() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            com.google.android.gms.measurement.internal.zzik r1 = r2.zzc
            if (r0 != r1) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Call expected from network thread"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    final java.lang.Object zze(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()     // Catch: java.lang.Throwable -> L49
            r0.zzq(r6)     // Catch: java.lang.Throwable -> L49
            r2.wait(r3)     // Catch: java.lang.InterruptedException -> L28 java.lang.Throwable -> L49
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L27
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.zza(r4)
        L27:
            return r2
        L28:
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch: java.lang.Throwable -> L49
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            r3.zza(r4)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L49
            r2 = 0
            return r2
        L49:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L49
            throw r3
    }

    public final java.util.concurrent.Future zzf(java.util.concurrent.Callable r4) throws java.lang.IllegalStateException {
            r3 = this;
            r3.zzv()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.measurement.internal.zzij r0 = new com.google.android.gms.measurement.internal.zzij
            r1 = 0
            java.lang.String r2 = "Task exception on worker thread"
            r0.<init>(r3, r4, r1, r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            com.google.android.gms.measurement.internal.zzik r1 = r3.zzb
            if (r4 != r1) goto L31
            java.util.concurrent.PriorityBlockingQueue r4 = r3.zzd
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L2d
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.String r1 = "Callable skipped the worker queue."
            r4.zza(r1)
        L2d:
            r0.run()
            goto L34
        L31:
            r3.zzz(r0)
        L34:
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void zzg() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            com.google.android.gms.measurement.internal.zzik r1 = r2.zzb
            if (r0 != r1) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Call expected from worker thread"
            r0.<init>(r1)
            throw r0
    }

    public final java.util.concurrent.Future zzh(java.util.concurrent.Callable r4) throws java.lang.IllegalStateException {
            r3 = this;
            r3.zzv()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.measurement.internal.zzij r0 = new com.google.android.gms.measurement.internal.zzij
            r1 = 1
            java.lang.String r2 = "Task exception on worker thread"
            r0.<init>(r3, r4, r1, r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            com.google.android.gms.measurement.internal.zzik r1 = r3.zzb
            if (r4 != r1) goto L1a
            r0.run()
            goto L1d
        L1a:
            r3.zzz(r0)
        L1d:
            return r0
    }

    public final void zzn() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            com.google.android.gms.measurement.internal.zzik r1 = r2.zzb
            if (r0 == r1) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Call not expected from worker thread"
            r0.<init>(r1)
            throw r0
    }

    public final void zzp(java.lang.Runnable r4) throws java.lang.IllegalStateException {
            r3 = this;
            r3.zzv()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r0 = "Task exception on network thread"
            com.google.android.gms.measurement.internal.zzij r1 = new com.google.android.gms.measurement.internal.zzij
            r2 = 0
            r1.<init>(r3, r4, r2, r0)
            java.lang.Object r4 = r3.zzh
            monitor-enter(r4)
            java.util.concurrent.BlockingQueue r0 = r3.zze     // Catch: java.lang.Throwable -> L33
            r0.add(r1)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.measurement.internal.zzik r1 = r3.zzc     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L2e
            com.google.android.gms.measurement.internal.zzik r1 = new com.google.android.gms.measurement.internal.zzik     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "Measurement Network"
            r1.<init>(r3, r2, r0)     // Catch: java.lang.Throwable -> L33
            r3.zzc = r1     // Catch: java.lang.Throwable -> L33
            java.lang.Thread$UncaughtExceptionHandler r0 = r3.zzg     // Catch: java.lang.Throwable -> L33
            r1.setUncaughtExceptionHandler(r0)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.measurement.internal.zzik r0 = r3.zzc     // Catch: java.lang.Throwable -> L33
            r0.start()     // Catch: java.lang.Throwable -> L33
            goto L31
        L2e:
            r1.zza()     // Catch: java.lang.Throwable -> L33
        L31:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    public final void zzq(java.lang.Runnable r4) throws java.lang.IllegalStateException {
            r3 = this;
            r3.zzv()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.measurement.internal.zzij r0 = new com.google.android.gms.measurement.internal.zzij
            r1 = 0
            java.lang.String r2 = "Task exception on worker thread"
            r0.<init>(r3, r4, r1, r2)
            r3.zzz(r0)
            return
    }

    public final void zzr(java.lang.Runnable r4) throws java.lang.IllegalStateException {
            r3 = this;
            r3.zzv()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.measurement.internal.zzij r0 = new com.google.android.gms.measurement.internal.zzij
            r1 = 1
            java.lang.String r2 = "Task exception on worker thread"
            r0.<init>(r3, r4, r1, r2)
            r3.zzz(r0)
            return
    }

    public final boolean zzt() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            com.google.android.gms.measurement.internal.zzik r1 = r2.zzc
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean zzu() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            com.google.android.gms.measurement.internal.zzik r1 = r2.zzb
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
