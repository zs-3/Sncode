package kotlinx.coroutines.selects;

/* compiled from: Select.kt */
/* loaded from: classes2.dex */
public class SelectImplementation<R> extends kotlinx.coroutines.CancelHandler implements kotlinx.coroutines.selects.SelectInstance, kotlinx.coroutines.Waiter {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater state$FU = null;
    private java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> clauses;
    private final kotlin.coroutines.CoroutineContext context;
    private java.lang.Object disposableHandleOrSegment;
    private int indexInSegment;
    private java.lang.Object internalResult;
    private volatile java.lang.Object state;

    /* compiled from: Select.kt */
    public final class ClauseData {
        public final java.lang.Object clauseObject;
        public java.lang.Object disposableHandleOrSegment;
        public int indexInSegment;
        public final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> onCancellationConstructor;
        private final java.lang.Object param;
        final /* synthetic */ kotlinx.coroutines.selects.SelectImplementation<R> this$0;

        public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> createOnCancellationAction(kotlinx.coroutines.selects.SelectInstance<?> r3, java.lang.Object r4) {
                r2 = this;
                kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> r0 = r2.onCancellationConstructor
                if (r0 == 0) goto Ld
                java.lang.Object r1 = r2.param
                java.lang.Object r3 = r0.invoke(r3, r1, r4)
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                goto Le
            Ld:
                r3 = 0
            Le:
                return r3
        }

        public final void dispose() {
                r4 = this;
                java.lang.Object r0 = r4.disposableHandleOrSegment
                kotlinx.coroutines.selects.SelectImplementation<R> r1 = r4.this$0
                boolean r2 = r0 instanceof kotlinx.coroutines.internal.Segment
                r3 = 0
                if (r2 == 0) goto L15
                kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
                int r2 = r4.indexInSegment
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                r0.onCancellation(r2, r3, r1)
                goto L21
            L15:
                boolean r1 = r0 instanceof kotlinx.coroutines.DisposableHandle
                if (r1 == 0) goto L1c
                r3 = r0
                kotlinx.coroutines.DisposableHandle r3 = (kotlinx.coroutines.DisposableHandle) r3
            L1c:
                if (r3 == 0) goto L21
                r3.dispose()
            L21:
                return
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.selects.SelectImplementation> r0 = kotlinx.coroutines.selects.SelectImplementation.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.selects.SelectImplementation.state$FU = r0
            return
    }

    private final kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData findClause(java.lang.Object r5) {
            r4 = this;
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r4.clauses
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r0.next()
            r3 = r2
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r3 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r3
            java.lang.Object r3 = r3.clauseObject
            if (r3 != r5) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r3 == 0) goto La
            r1 = r2
        L21:
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r1 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r1
            if (r1 == 0) goto L26
            return r1
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Clause with object "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " is not found"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    private final int trySelectInternal(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectImplementation.state$FU
            java.lang.Object r1 = r0.get(r5)
            boolean r2 = r1 instanceof kotlinx.coroutines.CancellableContinuation
            r3 = 2
            if (r2 == 0) goto L2c
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r2 = r5.findClause(r6)
            if (r2 != 0) goto L12
            goto L0
        L12:
            kotlin.jvm.functions.Function1 r4 = r2.createOnCancellationAction(r5, r7)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r5, r1, r2)
            if (r0 == 0) goto L0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            r5.internalResult = r7
            boolean r6 = kotlinx.coroutines.selects.SelectKt.access$tryResume(r1, r4)
            if (r6 == 0) goto L28
            r6 = 0
            return r6
        L28:
            r6 = 0
            r5.internalResult = r6
            return r3
        L2c:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_COMPLETED$p()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r4 = 1
            if (r2 == 0) goto L39
            r2 = 1
            goto L3b
        L39:
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData
        L3b:
            if (r2 == 0) goto L3f
            r6 = 3
            return r6
        L3f:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_CANCELLED$p()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L4a
            return r3
        L4a:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L5f
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r6)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r5, r1, r2)
            if (r0 == 0) goto L0
            return r4
        L5f:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L71
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r5, r1, r2)
            if (r0 == 0) goto L0
            return r4
        L71:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unexpected state: "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.invoke2(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.selects.SelectImplementation.state$FU
        L2:
            java.lang.Object r0 = r3.get(r2)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_COMPLETED$p()
            if (r0 != r1) goto Ld
            return
        Ld:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_CANCELLED$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r2, r0, r1)
            if (r0 == 0) goto L2
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r3 = r2.clauses
            if (r3 != 0) goto L1c
            return
        L1c:
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r0 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r0
            r0.dispose()
            goto L20
        L30:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.selects.SelectKt.access$getNO_RESULT$p()
            r2.internalResult = r3
            r3 = 0
            r2.clauses = r3
            return
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r1, int r2) {
            r0 = this;
            r0.disposableHandleOrSegment = r1
            r0.indexInSegment = r2
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(java.lang.Object r1) {
            r0 = this;
            r0.internalResult = r1
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.trySelectInternal(r1, r2)
            if (r1 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public final kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailed(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.trySelectInternal(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = kotlinx.coroutines.selects.SelectKt.access$TrySelectDetailedResult(r1)
            return r1
    }
}
