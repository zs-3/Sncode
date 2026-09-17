package kotlinx.coroutines;

/* compiled from: EventLoop.kt */
/* loaded from: classes2.dex */
public abstract class EventLoopImplPlatform extends kotlinx.coroutines.EventLoop {
    public EventLoopImplPlatform() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract java.lang.Thread getThread();

    protected void reschedule(long r2, kotlinx.coroutines.EventLoopImplBase.DelayedTask r4) {
            r1 = this;
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.schedule(r2, r4)
            return
    }

    protected final void unpark() {
            r2 = this;
            java.lang.Thread r0 = r2.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r1 == r0) goto L10
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L10:
            return
    }
}
