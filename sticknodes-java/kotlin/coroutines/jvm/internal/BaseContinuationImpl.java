package kotlin.coroutines.jvm.internal;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class BaseContinuationImpl implements kotlin.coroutines.Continuation<java.lang.Object>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, java.io.Serializable {
    private final kotlin.coroutines.Continuation<java.lang.Object> completion;

    public BaseContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.completion = r1
            return
    }

    public kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r1, kotlin.coroutines.Continuation<?> r2) {
            r0 = this;
            java.lang.String r1 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "create(Any?;Continuation) has not been overridden"
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r2.completion
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final kotlin.coroutines.Continuation<java.lang.Object> getCompletion() {
            r1 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r1.completion
            return r0
    }

    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            java.lang.StackTraceElement r0 = kotlin.coroutines.jvm.internal.DebugMetadataKt.getStackTraceElement(r1)
            return r0
    }

    protected abstract java.lang.Object invokeSuspend(java.lang.Object r1);

    protected void releaseIntercepted() {
            r0 = this;
            return
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object r4) {
            r3 = this;
            r0 = r3
        L1:
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineResumed(r0)
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r0 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r0
            kotlin.coroutines.Continuation<java.lang.Object> r1 = r0.completion
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Object r4 = r0.invokeSuspend(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L1d
            if (r4 != r2) goto L16
            return
        L16:
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = kotlin.Result.m72constructorimpl(r4)     // Catch: java.lang.Throwable -> L1d
            goto L28
        L1d:
            r4 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m72constructorimpl(r4)
        L28:
            r0.releaseIntercepted()
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 == 0) goto L31
            r0 = r1
            goto L1
        L31:
            r1.resumeWith(r4)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation at "
            r0.append(r1)
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 == 0) goto L11
            goto L19
        L11:
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
        L19:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
