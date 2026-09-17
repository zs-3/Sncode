package androidx.privacysandbox.ads.adservices.measurement;

/* compiled from: MeasurementManagerImplCommon.kt */
@android.annotation.SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes.dex */
public class MeasurementManagerImplCommon extends androidx.privacysandbox.ads.adservices.measurement.MeasurementManager {
    private final android.adservices.measurement.MeasurementManager mMeasurementManager;

    /* compiled from: MeasurementManagerImplCommon.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest $request;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon this$0;

        AnonymousClass4(androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r1, androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r2, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon.AnonymousClass4> r3) {
                r0 = this;
                r0.$request = r1
                r0.this$0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4 r0 = new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4
                androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r1 = r3.$request
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r2 = r3.this$0
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4 r1 = (androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon.AnonymousClass4) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r9.label
                if (r0 != 0) goto L3a
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r0 = r9.$request
                java.util.List r0 = r0.getRegistrationUris()
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r6 = r9.this$0
                androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r7 = r9.$request
                java.util.Iterator r8 = r0.iterator()
            L1c:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L37
                java.lang.Object r0 = r8.next()
                android.net.Uri r0 = (android.net.Uri) r0
                r1 = 0
                r2 = 0
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1 r3 = new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1
                r4 = 0
                r3.<init>(r6, r0, r7, r4)
                r4 = 3
                r5 = 0
                r0 = r10
                kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                goto L1c
            L37:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L3a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
        }
    }

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager r2) {
            r1 = this;
            java.lang.String r0 = "mMeasurementManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.mMeasurementManager = r2
            return
    }

    static /* synthetic */ java.lang.Object deleteRegistrations$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r1, androidx.privacysandbox.ads.adservices.measurement.DeletionRequest r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            r0 = 1
            r2.<init>(r3, r0)
            r2.initCancellability()
            r1.getMMeasurementManager()
            r1 = 0
            throw r1
    }

    static /* synthetic */ java.lang.Object getMeasurementApiStatus$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r3, kotlin.coroutines.Continuation<? super java.lang.Integer> r4) {
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            android.adservices.measurement.MeasurementManager r3 = r3.getMMeasurementManager()
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0 r1 = androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0.INSTANCE
            android.os.OutcomeReceiver r2 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r0)
            r3.getMeasurementApiStatus(r1, r2)
            java.lang.Object r3 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r0) goto L27
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L27:
            return r3
    }

    static /* synthetic */ java.lang.Object registerSource$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r3, android.net.Uri r4, android.view.InputEvent r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            android.adservices.measurement.MeasurementManager r3 = r3.getMMeasurementManager()
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0 r1 = androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0.INSTANCE
            android.os.OutcomeReceiver r2 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r0)
            r3.registerSource(r4, r5, r1, r2)
            java.lang.Object r3 = r0.getResult()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L27
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L27:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L2e
            return r3
        L2e:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    static /* synthetic */ java.lang.Object registerSource$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r2, androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4 r0 = new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4
            r1 = 0
            r0.<init>(r3, r2, r1)
            java.lang.Object r2 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L11
            return r2
        L11:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    static /* synthetic */ java.lang.Object registerTrigger$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r3, android.net.Uri r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            android.adservices.measurement.MeasurementManager r3 = r3.getMMeasurementManager()
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0 r1 = androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0.INSTANCE
            android.os.OutcomeReceiver r2 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r0)
            r3.registerTrigger(r4, r1, r2)
            java.lang.Object r3 = r0.getResult()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L27
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L27:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L2e
            return r3
        L2e:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    static /* synthetic */ java.lang.Object registerWebSource$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r1, androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            r0 = 1
            r2.<init>(r3, r0)
            r2.initCancellability()
            r1.getMMeasurementManager()
            r1 = 0
            throw r1
    }

    static /* synthetic */ java.lang.Object registerWebTrigger$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r1, androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            r0 = 1
            r2.<init>(r3, r0)
            r2.initCancellability()
            r1.getMMeasurementManager()
            r1 = 0
            throw r1
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object deleteRegistrations(androidx.privacysandbox.ads.adservices.measurement.DeletionRequest r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = deleteRegistrations$suspendImpl(r0, r1, r2)
            return r1
    }

    protected final android.adservices.measurement.MeasurementManager getMMeasurementManager() {
            r1 = this;
            android.adservices.measurement.MeasurementManager r0 = r1.mMeasurementManager
            return r0
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object getMeasurementApiStatus(kotlin.coroutines.Continuation<? super java.lang.Integer> r1) {
            r0 = this;
            java.lang.Object r1 = getMeasurementApiStatus$suspendImpl(r0, r1)
            return r1
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object registerSource(android.net.Uri r1, android.view.InputEvent r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            java.lang.Object r1 = registerSource$suspendImpl(r0, r1, r2, r3)
            return r1
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object registerSource(androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = registerSource$suspendImpl(r0, r1, r2)
            return r1
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object registerTrigger(android.net.Uri r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = registerTrigger$suspendImpl(r0, r1, r2)
            return r1
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object registerWebSource(androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = registerWebSource$suspendImpl(r0, r1, r2)
            return r1
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object registerWebTrigger(androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = registerWebTrigger$suspendImpl(r0, r1, r2)
            return r1
    }
}
