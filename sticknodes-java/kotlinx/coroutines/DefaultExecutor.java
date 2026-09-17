package kotlinx.coroutines;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes2.dex */
public final class DefaultExecutor extends kotlinx.coroutines.EventLoopImplBase implements java.lang.Runnable {
    public static final kotlinx.coroutines.DefaultExecutor INSTANCE = null;
    private static final long KEEP_ALIVE_NANOS = 0;
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    static {
            kotlinx.coroutines.DefaultExecutor r0 = new kotlinx.coroutines.DefaultExecutor
            r0.<init>()
            kotlinx.coroutines.DefaultExecutor.INSTANCE = r0
            r1 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.EventLoop.incrementUseCount$default(r0, r1, r2, r3)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r1 = java.lang.Long.getLong(r3, r1)     // Catch: java.lang.SecurityException -> L18
            goto L1c
        L18:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L1c:
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            kotlinx.coroutines.DefaultExecutor.KEEP_ALIVE_NANOS = r0
            return
    }

    private DefaultExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    private final synchronized void acknowledgeShutdownIfNeeded() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isShutdownRequested()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 3
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L19
            r1.resetAll()     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)     // Catch: java.lang.Throwable -> L19
            r1.notifyAll()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)
            return
        L19:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private final synchronized java.lang.Thread createThreadSync() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L15
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L17
            kotlinx.coroutines.DefaultExecutor._thread = r0     // Catch: java.lang.Throwable -> L17
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L17
            r0.start()     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r2)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final boolean isShutDown() {
            r2 = this;
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private final boolean isShutdownRequested() {
            r2 = this;
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus
            r1 = 2
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    private final synchronized boolean notifyStartup() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isShutdownRequested()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto La
            r0 = 0
            monitor-exit(r2)
            return r0
        La:
            r0 = 1
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r1)     // Catch: java.lang.Throwable -> L17
            r2.notifyAll()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final void shutdownError() {
            r2 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public void enqueue(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.isShutDown()
            if (r0 == 0) goto L9
            r1.shutdownError()
        L9:
            super.enqueue(r2)
            return
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected java.lang.Thread getThread() {
            r1 = this;
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread
            if (r0 != 0) goto L8
            java.lang.Thread r0 = r1.createThreadSync()
        L8:
            return r0
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected void reschedule(long r1, kotlinx.coroutines.EventLoopImplBase.DelayedTask r3) {
            r0 = this;
            r0.shutdownError()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            r0.setEventLoop$kotlinx_coroutines_core(r12)
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            r0 = 0
            boolean r1 = r12.notifyStartup()     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L21
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L20
            r12.getThread()
        L20:
            return
        L21:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L27:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L83
            long r5 = r12.processNextEvent()     // Catch: java.lang.Throwable -> L83
            r7 = 0
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 != 0) goto L5f
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> L83
            long r9 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L83
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 != 0) goto L42
            long r3 = kotlinx.coroutines.DefaultExecutor.KEEP_ALIVE_NANOS     // Catch: java.lang.Throwable -> L83
            long r3 = r3 + r9
        L42:
            long r9 = r3 - r9
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L5a
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L59
            r12.getThread()
        L59:
            return
        L5a:
            long r5 = kotlin.ranges.RangesKt.coerceAtMost(r5, r9)     // Catch: java.lang.Throwable -> L83
            goto L60
        L5f:
            r3 = r1
        L60:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L27
            boolean r7 = r12.isShutdownRequested()     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L7c
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L7b
            r12.getThread()
        L7b:
            return
        L7c:
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> L83
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch: java.lang.Throwable -> L83
            goto L27
        L83:
            r1 = move-exception
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L95
            r12.getThread()
        L95:
            throw r1
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public void shutdown() {
            r1 = this;
            r0 = 4
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0
            super.shutdown()
            return
    }
}
