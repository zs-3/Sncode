package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes2.dex */
public abstract class AbstractSharedFlow<S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>> {
    private int nCollectors;
    private int nextIndex;
    private S[] slots;

    public AbstractSharedFlow() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final S allocateSlot() {
            r4 = this;
            monitor-enter(r4)
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r4.slots     // Catch: java.lang.Throwable -> L4c
            r1 = 2
            if (r0 != 0) goto Ld
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = r4.createSlotArray(r1)     // Catch: java.lang.Throwable -> L4c
            r4.slots = r0     // Catch: java.lang.Throwable -> L4c
            goto L25
        Ld:
            int r2 = r4.nCollectors     // Catch: java.lang.Throwable -> L4c
            int r3 = r0.length     // Catch: java.lang.Throwable -> L4c
            if (r2 < r3) goto L25
            int r2 = r0.length     // Catch: java.lang.Throwable -> L4c
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L4c
            r1 = r0
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r1     // Catch: java.lang.Throwable -> L4c
            r4.slots = r1     // Catch: java.lang.Throwable -> L4c
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r0     // Catch: java.lang.Throwable -> L4c
        L25:
            int r1 = r4.nextIndex     // Catch: java.lang.Throwable -> L4c
        L27:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L31
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r2 = r4.createSlot()     // Catch: java.lang.Throwable -> L4c
            r0[r1] = r2     // Catch: java.lang.Throwable -> L4c
        L31:
            int r1 = r1 + 1
            int r3 = r0.length     // Catch: java.lang.Throwable -> L4c
            if (r1 < r3) goto L37
            r1 = 0
        L37:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r2.allocateLocked(r4)     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L27
            r4.nextIndex = r1     // Catch: java.lang.Throwable -> L4c
            int r0 = r4.nCollectors     // Catch: java.lang.Throwable -> L4c
            int r0 = r0 + 1
            r4.nCollectors = r0     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r4)
            return r2
        L4c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    protected abstract S createSlot();

    protected abstract S[] createSlotArray(int r1);

    protected final void freeSlot(S r5) {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.nCollectors     // Catch: java.lang.Throwable -> L2c
            int r0 = r0 + (-1)
            r4.nCollectors = r0     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            if (r0 != 0) goto Lc
            r4.nextIndex = r1     // Catch: java.lang.Throwable -> L2c
        Lc:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)     // Catch: java.lang.Throwable -> L2c
            kotlin.coroutines.Continuation[] r5 = r5.freeLocked(r4)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r4)
            int r0 = r5.length
        L17:
            if (r1 >= r0) goto L2b
            r2 = r5[r1]
            if (r2 == 0) goto L28
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = kotlin.Result.m72constructorimpl(r3)
            r2.resumeWith(r3)
        L28:
            int r1 = r1 + 1
            goto L17
        L2b:
            return
        L2c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    protected final S[] getSlots() {
            r1 = this;
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r1.slots
            return r0
    }
}
