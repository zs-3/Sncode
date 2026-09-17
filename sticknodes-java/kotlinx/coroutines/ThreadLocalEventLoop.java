package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public final class ThreadLocalEventLoop {
    public static final kotlinx.coroutines.ThreadLocalEventLoop INSTANCE = null;
    private static final java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> ref = null;

    static {
            kotlinx.coroutines.ThreadLocalEventLoop r0 = new kotlinx.coroutines.ThreadLocalEventLoop
            r0.<init>()
            kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "ThreadLocalEventLoop"
            r0.<init>(r1)
            java.lang.ThreadLocal r0 = kotlinx.coroutines.internal.ThreadLocalKt.commonThreadLocal(r0)
            kotlinx.coroutines.ThreadLocalEventLoop.ref = r0
            return
    }

    private ThreadLocalEventLoop() {
            r0 = this;
            r0.<init>()
            return
    }

    public final kotlinx.coroutines.EventLoop currentOrNull$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> r0 = kotlinx.coroutines.ThreadLocalEventLoop.ref
            java.lang.Object r0 = r0.get()
            kotlinx.coroutines.EventLoop r0 = (kotlinx.coroutines.EventLoop) r0
            return r0
    }

    public final kotlinx.coroutines.EventLoop getEventLoop$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> r0 = kotlinx.coroutines.ThreadLocalEventLoop.ref
            java.lang.Object r1 = r0.get()
            kotlinx.coroutines.EventLoop r1 = (kotlinx.coroutines.EventLoop) r1
            if (r1 != 0) goto L11
            kotlinx.coroutines.EventLoop r1 = kotlinx.coroutines.EventLoopKt.createEventLoop()
            r0.set(r1)
        L11:
            return r1
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> r0 = kotlinx.coroutines.ThreadLocalEventLoop.ref
            r1 = 0
            r0.set(r1)
            return
    }

    public final void setEventLoop$kotlinx_coroutines_core(kotlinx.coroutines.EventLoop r2) {
            r1 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> r0 = kotlinx.coroutines.ThreadLocalEventLoop.ref
            r0.set(r2)
            return
    }
}
