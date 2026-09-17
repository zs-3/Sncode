package androidx.privacysandbox.ads.adservices.measurement;

/* compiled from: MeasurementManagerImplCommon.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", l = {131}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MeasurementManagerImplCommon$registerSource$4$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest $request;
    final /* synthetic */ android.net.Uri $uri;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon this$0;

    MeasurementManagerImplCommon$registerSource$4$1$1(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r1, android.net.Uri r2, androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r3, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1> r4) {
            r0 = this;
            r0.this$0 = r1
            r0.$uri = r2
            r0.$request = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1 r4 = new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r0 = r3.this$0
            android.net.Uri r1 = r3.$uri
            androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r2 = r3.$request
            r4.<init>(r0, r1, r2, r5)
            return r4
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
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1 r1 = (androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1) r1
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
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r6.L$2
            androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r0 = (androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest) r0
            java.lang.Object r0 = r6.L$1
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r6.L$0
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r0 = (androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L61
        L1b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L23:
            kotlin.ResultKt.throwOnFailure(r7)
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon r7 = r6.this$0
            android.net.Uri r1 = r6.$uri
            androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r3 = r6.$request
            r6.L$0 = r7
            r6.L$1 = r1
            r6.L$2 = r3
            r6.label = r2
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
            r4.<init>(r5, r2)
            r4.initCancellability()
            android.adservices.measurement.MeasurementManager r7 = r7.getMMeasurementManager()
            android.view.InputEvent r2 = r3.getInputEvent()
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0 r3 = androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0.INSTANCE
            android.os.OutcomeReceiver r5 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r4)
            r7.registerSource(r1, r2, r3, r5)
            java.lang.Object r7 = r4.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r1) goto L5e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L5e:
            if (r7 != r0) goto L61
            return r0
        L61:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
