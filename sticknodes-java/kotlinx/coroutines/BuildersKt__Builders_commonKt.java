package kotlinx.coroutines;

/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
final /* synthetic */ class BuildersKt__Builders_commonKt {
    public static final <T> kotlinx.coroutines.Deferred<T> async(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4) {
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r1, r2)
            boolean r2 = r3.isLazy()
            if (r2 == 0) goto L10
            kotlinx.coroutines.LazyDeferredCoroutine r2 = new kotlinx.coroutines.LazyDeferredCoroutine
            r2.<init>(r1, r4)
            goto L16
        L10:
            kotlinx.coroutines.DeferredCoroutine r2 = new kotlinx.coroutines.DeferredCoroutine
            r0 = 1
            r2.<init>(r1, r0)
        L16:
            r2.start(r3, r2, r4)
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred async$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Lc:
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt.async(r0, r1, r2, r3)
            return r0
    }

    public static final kotlinx.coroutines.Job launch(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r1, r2)
            boolean r2 = r3.isLazy()
            if (r2 == 0) goto L10
            kotlinx.coroutines.LazyStandaloneCoroutine r2 = new kotlinx.coroutines.LazyStandaloneCoroutine
            r2.<init>(r1, r4)
            goto L16
        L10:
            kotlinx.coroutines.StandaloneCoroutine r2 = new kotlinx.coroutines.StandaloneCoroutine
            r0 = 1
            r2.<init>(r1, r0)
        L16:
            r2.start(r3, r2, r4)
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.Job launch$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Lc:
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch(r0, r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object withContext(kotlin.coroutines.CoroutineContext r8, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super T> r10) {
            kotlin.coroutines.CoroutineContext r0 = r10.getContext()
            kotlin.coroutines.CoroutineContext r8 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r0, r8)
            kotlinx.coroutines.JobKt.ensureActive(r8)
            if (r8 != r0) goto L17
            kotlinx.coroutines.internal.ScopeCoroutine r0 = new kotlinx.coroutines.internal.ScopeCoroutine
            r0.<init>(r8, r10)
            java.lang.Object r8 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r0, r0, r9)
            goto L55
        L17:
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r8.get(r1)
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L43
            kotlinx.coroutines.UndispatchedCoroutine r0 = new kotlinx.coroutines.UndispatchedCoroutine
            r0.<init>(r8, r10)
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            r1 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r8, r1)
            java.lang.Object r9 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r0, r0, r9)     // Catch: java.lang.Throwable -> L3e
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r1)
            r8 = r9
            goto L55
        L3e:
            r9 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r1)
            throw r9
        L43:
            kotlinx.coroutines.DispatchedCoroutine r0 = new kotlinx.coroutines.DispatchedCoroutine
            r0.<init>(r8, r10)
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r9
            r3 = r0
            r4 = r0
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = r0.getResult$kotlinx_coroutines_core()
        L55:
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L5e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L5e:
            return r8
    }
}
