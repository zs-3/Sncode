package kotlinx.coroutines;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class UndispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private volatile boolean threadLocalIsSet;
    private final java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> threadStateToRecover;

    public UndispatchedCoroutine(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.Continuation<? super T> r4) {
            r2 = this;
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.threadStateToRecover = r0
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r4 = r4.get(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r3, r4)
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r4)
            r2.saveThreadContext(r3, r4)
        L31:
            return
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r5.threadLocalIsSet
            if (r0 == 0) goto L20
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r5.threadStateToRecover
            java.lang.Object r0 = r0.get()
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L1b
            java.lang.Object r1 = r0.component1()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            java.lang.Object r0 = r0.component2()
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r0)
        L1b:
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r5.threadStateToRecover
            r0.remove()
        L20:
            kotlin.coroutines.Continuation<T> r0 = r5.uCont
            java.lang.Object r6 = kotlinx.coroutines.CompletionStateKt.recoverResult(r6, r0)
            kotlin.coroutines.Continuation<T> r0 = r5.uCont
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            r2 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r1, r2)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r3 == r4) goto L39
            kotlinx.coroutines.UndispatchedCoroutine r2 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r0, r1, r3)
        L39:
            kotlin.coroutines.Continuation<T> r0 = r5.uCont     // Catch: java.lang.Throwable -> L4c
            r0.resumeWith(r6)     // Catch: java.lang.Throwable -> L4c
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L48
            boolean r6 = r2.clearThreadContext()
            if (r6 == 0) goto L4b
        L48:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r3)
        L4b:
            return
        L4c:
            r6 = move-exception
            if (r2 == 0) goto L55
            boolean r0 = r2.clearThreadContext()
            if (r0 == 0) goto L58
        L55:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r3)
        L58:
            throw r6
    }

    public final boolean clearThreadContext() {
            r3 = this;
            boolean r0 = r3.threadLocalIsSet
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r3.threadStateToRecover
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r2 = r3.threadStateToRecover
            r2.remove()
            r0 = r0 ^ r1
            return r0
    }

    public final void saveThreadContext(kotlin.coroutines.CoroutineContext r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            r1.threadLocalIsSet = r0
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r1.threadStateToRecover
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r0.set(r2)
            return
    }
}
