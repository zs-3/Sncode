package kotlinx.coroutines;

/* compiled from: Builders.kt */
/* loaded from: classes2.dex */
final class BlockingCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> {
    private final java.lang.Thread blockedThread;
    private final kotlinx.coroutines.EventLoop eventLoop;

    public BlockingCoroutine(kotlin.coroutines.CoroutineContext r2, java.lang.Thread r3, kotlinx.coroutines.EventLoop r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.blockedThread = r3
            r1.eventLoop = r4
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void afterCompletion(java.lang.Object r2) {
            r1 = this;
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r1.blockedThread
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 != 0) goto L14
            java.lang.Thread r2 = r1.blockedThread
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L14:
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean isScopedCoroutine() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final T joinBlocking() {
            r6 = this;
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            kotlinx.coroutines.EventLoop r0 = r6.eventLoop     // Catch: java.lang.Throwable -> L60
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto Ld
            kotlinx.coroutines.EventLoop.incrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L60
        Ld:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L4f
            kotlinx.coroutines.EventLoop r0 = r6.eventLoop     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L1c
            long r4 = r0.processNextEvent()     // Catch: java.lang.Throwable -> L2e
            goto L21
        L1c:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L21:
            boolean r0 = r6.isCompleted()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L30
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r4)     // Catch: java.lang.Throwable -> L2e
            goto Ld
        L2e:
            r0 = move-exception
            goto L58
        L30:
            kotlinx.coroutines.EventLoop r0 = r6.eventLoop     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L37
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L60
        L37:
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L49
            r3 = r0
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
        L49:
            if (r3 != 0) goto L4c
            return r0
        L4c:
            java.lang.Throwable r0 = r3.cause
            throw r0
        L4f:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            r6.cancelCoroutine(r0)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L58:
            kotlinx.coroutines.EventLoop r4 = r6.eventLoop     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L5f
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r4, r2, r1, r3)     // Catch: java.lang.Throwable -> L60
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            throw r0
    }
}
