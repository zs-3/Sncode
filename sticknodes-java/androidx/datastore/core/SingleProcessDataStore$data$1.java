package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SingleProcessDataStore.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SingleProcessDataStore$data$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.core.State<T>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        final /* synthetic */ androidx.datastore.core.State<T> $currentDownStreamFlowState;
        /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass1(androidx.datastore.core.State<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore$data$1.AnonymousClass1> r2) {
                r0 = this;
                r0.$currentDownStreamFlowState = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                androidx.datastore.core.SingleProcessDataStore$data$1$1 r0 = new androidx.datastore.core.SingleProcessDataStore$data$1$1
                androidx.datastore.core.State<T> r1 = r2.$currentDownStreamFlowState
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        public final java.lang.Object invoke(androidx.datastore.core.State<T> r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                androidx.datastore.core.SingleProcessDataStore$data$1$1 r1 = (androidx.datastore.core.SingleProcessDataStore$data$1.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r3.label
                if (r0 != 0) goto L22
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.L$0
                androidx.datastore.core.State r4 = (androidx.datastore.core.State) r4
                androidx.datastore.core.State<T> r0 = r3.$currentDownStreamFlowState
                boolean r1 = r0 instanceof androidx.datastore.core.Data
                r2 = 0
                if (r1 != 0) goto L1d
                boolean r1 = r0 instanceof androidx.datastore.core.Final
                if (r1 == 0) goto L1a
                goto L1d
            L1a:
                if (r4 != r0) goto L1d
                r2 = 1
            L1d:
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r4
            L22:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
        }
    }

    SingleProcessDataStore$data$1(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore$data$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.datastore.core.SingleProcessDataStore$data$1 r0 = new androidx.datastore.core.SingleProcessDataStore$data$1
            androidx.datastore.core.SingleProcessDataStore<T> r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            androidx.datastore.core.SingleProcessDataStore$data$1 r1 = (androidx.datastore.core.SingleProcessDataStore$data$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5a
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            androidx.datastore.core.SingleProcessDataStore<T> r1 = r6.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = androidx.datastore.core.SingleProcessDataStore.access$getDownstreamFlow$p(r1)
            java.lang.Object r1 = r1.getValue()
            androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
            boolean r3 = r1 instanceof androidx.datastore.core.Data
            if (r3 != 0) goto L3c
            androidx.datastore.core.SingleProcessDataStore<T> r3 = r6.this$0
            androidx.datastore.core.SimpleActor r3 = androidx.datastore.core.SingleProcessDataStore.access$getActor$p(r3)
            androidx.datastore.core.SingleProcessDataStore$Message$Read r4 = new androidx.datastore.core.SingleProcessDataStore$Message$Read
            r4.<init>(r1)
            r3.offer(r4)
        L3c:
            androidx.datastore.core.SingleProcessDataStore<T> r3 = r6.this$0
            kotlinx.coroutines.flow.MutableStateFlow r3 = androidx.datastore.core.SingleProcessDataStore.access$getDownstreamFlow$p(r3)
            androidx.datastore.core.SingleProcessDataStore$data$1$1 r4 = new androidx.datastore.core.SingleProcessDataStore$data$1$1
            r5 = 0
            r4.<init>(r1, r5)
            kotlinx.coroutines.flow.Flow r1 = kotlinx.coroutines.flow.FlowKt.dropWhile(r3, r4)
            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1 r3 = new androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1
            r3.<init>(r1)
            r6.label = r2
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.emitAll(r7, r3, r6)
            if (r7 != r0) goto L5a
            return r0
        L5a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
