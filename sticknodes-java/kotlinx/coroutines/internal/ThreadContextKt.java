package kotlinx.coroutines.internal;

/* compiled from: ThreadContext.kt */
/* loaded from: classes2.dex */
public final class ThreadContextKt {
    public static final kotlinx.coroutines.internal.Symbol NO_THREAD_ELEMENTS = null;
    private static final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext.Element, java.lang.Object> countAll = null;
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.ThreadContextElement<?>> findOne = null;
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState> updateState = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_THREAD_ELEMENTS"
            r0.<init>(r1)
            kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS = r0
            kotlinx.coroutines.internal.ThreadContextKt$countAll$1 r0 = kotlinx.coroutines.internal.ThreadContextKt$countAll$1.INSTANCE
            kotlinx.coroutines.internal.ThreadContextKt.countAll = r0
            kotlinx.coroutines.internal.ThreadContextKt$findOne$1 r0 = kotlinx.coroutines.internal.ThreadContextKt$findOne$1.INSTANCE
            kotlinx.coroutines.internal.ThreadContextKt.findOne = r0
            kotlinx.coroutines.internal.ThreadContextKt$updateState$1 r0 = kotlinx.coroutines.internal.ThreadContextKt$updateState$1.INSTANCE
            kotlinx.coroutines.internal.ThreadContextKt.updateState = r0
            return
    }

    public static final void restoreThreadContext(kotlin.coroutines.CoroutineContext r2, java.lang.Object r3) {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r3 != r0) goto L5
            return
        L5:
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.ThreadState
            if (r0 == 0) goto Lf
            kotlinx.coroutines.internal.ThreadState r3 = (kotlinx.coroutines.internal.ThreadState) r3
            r3.restore(r2)
            goto L20
        Lf:
            r0 = 0
            kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext$Element, kotlinx.coroutines.ThreadContextElement<?>> r1 = kotlinx.coroutines.internal.ThreadContextKt.findOne
            java.lang.Object r0 = r2.fold(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlinx.coroutines.ThreadContextElement r0 = (kotlinx.coroutines.ThreadContextElement) r0
            r0.restoreThreadContext(r2, r3)
        L20:
            return
    }

    public static final java.lang.Object threadContextElements(kotlin.coroutines.CoroutineContext r2) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext$Element, java.lang.Object> r1 = kotlinx.coroutines.internal.ThreadContextKt.countAll
            java.lang.Object r2 = r2.fold(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            return r2
    }

    public static final java.lang.Object updateThreadContext(kotlin.coroutines.CoroutineContext r1, java.lang.Object r2) {
            if (r2 != 0) goto L6
            java.lang.Object r2 = threadContextElements(r1)
        L6:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r2 != r0) goto L10
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            goto L31
        L10:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L26
            kotlinx.coroutines.internal.ThreadState r0 = new kotlinx.coroutines.internal.ThreadState
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext$Element, kotlinx.coroutines.internal.ThreadState> r2 = kotlinx.coroutines.internal.ThreadContextKt.updateState
            java.lang.Object r1 = r1.fold(r0, r2)
            goto L31
        L26:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            kotlinx.coroutines.ThreadContextElement r2 = (kotlinx.coroutines.ThreadContextElement) r2
            java.lang.Object r1 = r2.updateThreadContext(r1)
        L31:
            return r1
    }
}
