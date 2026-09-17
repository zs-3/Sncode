package kotlinx.coroutines;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class CoroutineContextKt {



    private static final kotlin.coroutines.CoroutineContext foldCopies(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.CoroutineContext r4, boolean r5) {
            boolean r0 = hasCopyableElements(r3)
            boolean r1 = hasCopyableElements(r4)
            if (r0 != 0) goto L11
            if (r1 != 0) goto L11
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r4)
            return r3
        L11:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r0.element = r4
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1 r2 = new kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            r2.<init>(r0, r5)
            java.lang.Object r3 = r3.fold(r4, r2)
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            if (r1 == 0) goto L33
            T r5 = r0.element
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            kotlinx.coroutines.CoroutineContextKt$foldCopies$1 r1 = kotlinx.coroutines.CoroutineContextKt.AnonymousClass1.INSTANCE
            java.lang.Object r4 = r5.fold(r4, r1)
            r0.element = r4
        L33:
            T r4 = r0.element
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r4)
            return r3
    }

    public static final java.lang.String getCoroutineName(kotlin.coroutines.CoroutineContext r0) {
            r0 = 0
            return r0
    }

    private static final boolean hasCopyableElements(kotlin.coroutines.CoroutineContext r2) {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1 r1 = kotlinx.coroutines.CoroutineContextKt.C00381.INSTANCE
            java.lang.Object r2 = r2.fold(r0, r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(kotlin.coroutines.CoroutineContext r1, kotlin.coroutines.CoroutineContext r2) {
            boolean r0 = hasCopyableElements(r2)
            if (r0 != 0) goto Lb
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)
            return r1
        Lb:
            r0 = 0
            kotlin.coroutines.CoroutineContext r1 = foldCopies(r1, r2, r0)
            return r1
    }

    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.CoroutineContext r2) {
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            r0 = 1
            kotlin.coroutines.CoroutineContext r1 = foldCopies(r1, r2, r0)
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getDefault()
            if (r1 == r2) goto L1f
            kotlin.coroutines.ContinuationInterceptor$Key r2 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r1.get(r2)
            if (r2 != 0) goto L1f
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)
        L1f:
            return r1
    }

    public static final kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCompletion(kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
        L0:
            boolean r0 = r2 instanceof kotlinx.coroutines.DispatchedCoroutine
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = r2.getCallerFrame()
            if (r2 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r2 instanceof kotlinx.coroutines.UndispatchedCoroutine
            if (r0 == 0) goto L0
            kotlinx.coroutines.UndispatchedCoroutine r2 = (kotlinx.coroutines.UndispatchedCoroutine) r2
            return r2
    }

    public static final kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion(kotlin.coroutines.Continuation<?> r2, kotlin.coroutines.CoroutineContext r3, java.lang.Object r4) {
            boolean r0 = r2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r0 = r3.get(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L14
            return r1
        L14:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r2
            kotlinx.coroutines.UndispatchedCoroutine r2 = undispatchedCompletion(r2)
            if (r2 == 0) goto L1f
            r2.saveThreadContext(r3, r4)
        L1f:
            return r2
    }
}
