package kotlinx.coroutines;

/* compiled from: EventLoop.kt */
/* loaded from: classes2.dex */
public final class BlockingEventLoop extends kotlinx.coroutines.EventLoopImplBase {
    private final java.lang.Thread thread;

    public BlockingEventLoop(java.lang.Thread r1) {
            r0 = this;
            r0.<init>()
            r0.thread = r1
            return
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected java.lang.Thread getThread() {
            r1 = this;
            java.lang.Thread r0 = r1.thread
            return r0
    }
}
