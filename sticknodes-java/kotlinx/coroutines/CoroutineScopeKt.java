package kotlinx.coroutines;

/* compiled from: CoroutineScope.kt */
/* loaded from: classes2.dex */
public final class CoroutineScopeKt {
    public static final kotlinx.coroutines.CoroutineScope CoroutineScope(kotlin.coroutines.CoroutineContext r3) {
            kotlinx.coroutines.internal.ContextScope r0 = new kotlinx.coroutines.internal.ContextScope
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r3.get(r1)
            if (r1 == 0) goto Lb
            goto L15
        Lb:
            r1 = 1
            r2 = 0
            kotlinx.coroutines.CompletableJob r1 = kotlinx.coroutines.JobKt.Job$default(r2, r1, r2)
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r1)
        L15:
            r0.<init>(r3)
            return r0
    }

    public static final <R> java.lang.Object coroutineScope(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super R> r3) {
            kotlinx.coroutines.internal.ScopeCoroutine r0 = new kotlinx.coroutines.internal.ScopeCoroutine
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            r0.<init>(r1, r3)
            java.lang.Object r2 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r0, r0, r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L16
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        L16:
            return r2
    }

    public static final void ensureActive(kotlinx.coroutines.CoroutineScope r0) {
            kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
            kotlinx.coroutines.JobKt.ensureActive(r0)
            return
    }
}
