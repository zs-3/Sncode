package kotlinx.coroutines.flow.internal;

/* compiled from: SafeCollector.kt */
/* loaded from: classes2.dex */
public final class SafeCollector<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl implements kotlinx.coroutines.flow.FlowCollector<T> {
    public final kotlin.coroutines.CoroutineContext collectContext;
    public final int collectContextSize;
    public final kotlinx.coroutines.flow.FlowCollector<T> collector;
    private kotlin.coroutines.Continuation<? super kotlin.Unit> completion;
    private kotlin.coroutines.CoroutineContext lastEmissionContext;

    public SafeCollector(kotlinx.coroutines.flow.FlowCollector<? super T> r3, kotlin.coroutines.CoroutineContext r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.NoOpContinuation r0 = kotlinx.coroutines.flow.internal.NoOpContinuation.INSTANCE
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r2.<init>(r0, r1)
            r2.collector = r3
            r2.collectContext = r4
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1 r0 = kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1.INSTANCE
            java.lang.Object r3 = r4.fold(r3, r0)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.collectContextSize = r3
            return
    }

    private final void checkContext(kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.CoroutineContext r3, T r4) {
            r1 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.flow.internal.DownstreamExceptionContext
            if (r0 == 0) goto L9
            kotlinx.coroutines.flow.internal.DownstreamExceptionContext r3 = (kotlinx.coroutines.flow.internal.DownstreamExceptionContext) r3
            r1.exceptionTransparencyViolated(r3, r4)
        L9:
            kotlinx.coroutines.flow.internal.SafeCollector_commonKt.checkContext(r1, r2)
            return
    }

    private final java.lang.Object emit(kotlin.coroutines.Continuation<? super kotlin.Unit> r3, T r4) {
            r2 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r0)
            kotlin.coroutines.CoroutineContext r1 = r2.lastEmissionContext
            if (r1 == r0) goto L10
            r2.checkContext(r0, r1, r4)
            r2.lastEmissionContext = r0
        L10:
            r2.completion = r3
            kotlin.jvm.functions.Function3 r3 = kotlinx.coroutines.flow.internal.SafeCollectorKt.access$getEmitFun$p()
            kotlinx.coroutines.flow.FlowCollector<T> r0 = r2.collector
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r1)
            java.lang.Object r3 = r3.invoke(r0, r4, r2)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r4 != 0) goto L33
            r4 = 0
            r2.completion = r4
        L33:
            return r3
    }

    private final void exceptionTransparencyViolated(kotlinx.coroutines.flow.internal.DownstreamExceptionContext r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            r1.append(r2)
            java.lang.Throwable r4 = r4.e
            r1.append(r4)
            java.lang.String r4 = ", but then emission attempt of value '"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = kotlin.text.StringsKt.trimIndent(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r2 = r1.emit(r3, r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto Ld
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        Ld:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L14
            return r2
        L14:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L17:
            r2 = move-exception
            kotlinx.coroutines.flow.internal.DownstreamExceptionContext r0 = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            r0.<init>(r2, r3)
            r1.lastEmissionContext = r0
            throw r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r2.completion
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.lastEmissionContext
            if (r0 != 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            java.lang.Throwable r0 = kotlin.Result.m73exceptionOrNullimpl(r4)
            if (r0 == 0) goto L11
            kotlinx.coroutines.flow.internal.DownstreamExceptionContext r1 = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext
            kotlin.coroutines.CoroutineContext r2 = r3.getContext()
            r1.<init>(r0, r2)
            r3.lastEmissionContext = r1
        L11:
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r3.completion
            if (r0 == 0) goto L18
            r0.resumeWith(r4)
        L18:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r4
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
            r0 = this;
            super.releaseIntercepted()
            return
    }
}
