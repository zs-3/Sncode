package kotlinx.coroutines.internal;

/* compiled from: ThreadContext.kt */
/* loaded from: classes2.dex */
final class ThreadState {
    public final kotlin.coroutines.CoroutineContext context;
    private final kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] elements;
    private int i;
    private final java.lang.Object[] values;

    public ThreadState(kotlin.coroutines.CoroutineContext r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.values = r1
            kotlinx.coroutines.ThreadContextElement[] r1 = new kotlinx.coroutines.ThreadContextElement[r2]
            r0.elements = r1
            return
    }

    public final void append(kotlinx.coroutines.ThreadContextElement<?> r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Object[] r0 = r2.values
            int r1 = r2.i
            r0[r1] = r4
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r4 = r2.elements
            int r0 = r1 + 1
            r2.i = r0
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            r4[r1] = r3
            return
    }

    public final void restore(kotlin.coroutines.CoroutineContext r5) {
            r4 = this;
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r0 = r4.elements
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1c
        L7:
            int r1 = r0 + (-1)
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r2 = r4.elements
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object[] r3 = r4.values
            r0 = r3[r0]
            r2.restoreThreadContext(r5, r0)
            if (r1 >= 0) goto L1a
            goto L1c
        L1a:
            r0 = r1
            goto L7
        L1c:
            return
    }
}
