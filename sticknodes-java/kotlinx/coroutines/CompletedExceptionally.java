package kotlinx.coroutines;

/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public class CompletedExceptionally {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _handled$FU = null;
    private volatile int _handled;
    public final java.lang.Throwable cause;

    static {
            java.lang.Class<kotlinx.coroutines.CompletedExceptionally> r0 = kotlinx.coroutines.CompletedExceptionally.class
            java.lang.String r1 = "_handled"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.CompletedExceptionally._handled$FU = r0
            return
    }

    public CompletedExceptionally(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.cause = r1
            r0._handled = r2
            return
    }

    public /* synthetic */ CompletedExceptionally(java.lang.Throwable r1, boolean r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public final boolean getHandled() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CompletedExceptionally._handled$FU
            int r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean makeHandled() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CompletedExceptionally._handled$FU
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.Throwable r1 = r2.cause
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
