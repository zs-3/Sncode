package kotlinx.coroutines;

/* compiled from: EventLoop.kt */
/* loaded from: classes2.dex */
public final class EventLoopKt {
    public static final kotlinx.coroutines.EventLoop createEventLoop() {
            kotlinx.coroutines.BlockingEventLoop r0 = new kotlinx.coroutines.BlockingEventLoop
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.<init>(r1)
            return r0
    }
}
