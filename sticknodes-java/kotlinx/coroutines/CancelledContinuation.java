package kotlinx.coroutines;

/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public final class CancelledContinuation extends kotlinx.coroutines.CompletedExceptionally {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _resumed$FU = null;
    private volatile int _resumed;

    static {
            java.lang.Class<kotlinx.coroutines.CancelledContinuation> r0 = kotlinx.coroutines.CancelledContinuation.class
            java.lang.String r1 = "_resumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.CancelledContinuation._resumed$FU = r0
            return
    }

    public CancelledContinuation(kotlin.coroutines.Continuation<?> r3, java.lang.Throwable r4, boolean r5) {
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
    }

    public final boolean makeResumed() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancelledContinuation._resumed$FU
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            return r0
    }
}
