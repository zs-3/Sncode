package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public abstract class EventLoop extends kotlinx.coroutines.CoroutineDispatcher {
    private boolean shared;
    private kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> unconfinedQueue;
    private long useCount;

    public EventLoop() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void decrementUseCount$default(kotlinx.coroutines.EventLoop r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.decrementUseCount(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    private final long delta(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L8
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            goto La
        L8:
            r0 = 1
        La:
            return r0
    }

    public static /* synthetic */ void incrementUseCount$default(kotlinx.coroutines.EventLoop r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.incrementUseCount(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: incrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    public final void decrementUseCount(boolean r5) {
            r4 = this;
            long r0 = r4.useCount
            long r2 = r4.delta(r5)
            long r0 = r0 - r2
            r4.useCount = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L10
            return
        L10:
            boolean r5 = r4.shared
            if (r5 == 0) goto L17
            r4.shutdown()
        L17:
            return
    }

    public final void dispatchUnconfined(kotlinx.coroutines.DispatchedTask<?> r2) {
            r1 = this;
            kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> r0 = r1.unconfinedQueue
            if (r0 != 0) goto Lb
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1.unconfinedQueue = r0
        Lb:
            r0.addLast(r2)
            return
    }

    protected long getNextTime() {
            r3 = this;
            kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> r0 = r3.unconfinedQueue
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r1 = 0
        L13:
            return r1
    }

    public final void incrementUseCount(boolean r5) {
            r4 = this;
            long r0 = r4.useCount
            long r2 = r4.delta(r5)
            long r0 = r0 + r2
            r4.useCount = r0
            if (r5 != 0) goto Le
            r5 = 1
            r4.shared = r5
        Le:
            return
    }

    public final boolean isUnconfinedLoopActive() {
            r6 = this;
            long r0 = r6.useCount
            r2 = 1
            long r3 = r6.delta(r2)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public final boolean isUnconfinedQueueEmpty() {
            r1 = this;
            kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> r0 = r1.unconfinedQueue
            if (r0 == 0) goto L9
            boolean r0 = r0.isEmpty()
            goto La
        L9:
            r0 = 1
        La:
            return r0
    }

    public long processNextEvent() {
            r2 = this;
            boolean r0 = r2.processUnconfinedEvent()
            if (r0 != 0) goto Lc
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean processUnconfinedEvent() {
            r2 = this;
            kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> r0 = r2.unconfinedQueue
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.removeFirstOrNull()
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0.run()
            r0 = 1
            return r0
    }

    public boolean shouldBeProcessedFromContext() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void shutdown() {
            r0 = this;
            return
    }
}
