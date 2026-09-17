package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: TopicsManagerImplCommon.kt */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class TopicsManagerImplCommon extends androidx.privacysandbox.ads.adservices.topics.TopicsManager {
    private final android.adservices.topics.TopicsManager mTopicsManager;

    /* compiled from: TopicsManagerImplCommon.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {40}, m = "getTopics$suspendImpl")
    /* renamed from: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon this$0;

        AnonymousClass1(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r1, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.getTopics$suspendImpl(r2, r0, r1)
                return r2
        }
    }

    public TopicsManagerImplCommon(android.adservices.topics.TopicsManager r2) {
            r1 = this;
            java.lang.String r0 = "mTopicsManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.mTopicsManager = r2
            return
    }

    public static final /* synthetic */ android.adservices.topics.TopicsManager access$getMTopicsManager$p(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r0) {
            android.adservices.topics.TopicsManager r0 = r0.mTopicsManager
            return r0
    }

    static /* synthetic */ java.lang.Object getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r5, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> r6) {
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.convertRequest$ads_adservices_release(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r4.getTopicsAsyncInternal(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r6 = (android.adservices.topics.GetTopicsResponse) r6
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r4 = r4.convertResponse$ads_adservices_release(r6)
            return r4
    }

    private final java.lang.Object getTopicsAsyncInternal(android.adservices.topics.GetTopicsRequest r5, kotlin.coroutines.Continuation<? super android.adservices.topics.GetTopicsResponse> r6) {
            r4 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            android.adservices.topics.TopicsManager r1 = access$getMTopicsManager$p(r4)
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0 r2 = androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0.INSTANCE
            android.os.OutcomeReceiver r3 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r0)
            r1.getTopics(r5, r2, r3)
            java.lang.Object r5 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r0) goto L27
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L27:
            return r5
    }

    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r2) {
            r1 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper r0 = androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper.INSTANCE
            android.adservices.topics.GetTopicsRequest r2 = r0.convertRequestWithoutRecordObservation$ads_adservices_release(r2)
            return r2
    }

    public androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse r2) {
            r1 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper r0 = androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper.INSTANCE
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r2 = r0.convertResponse$ads_adservices_release(r2)
            return r2
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    public java.lang.Object getTopics(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r1, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> r2) {
            r0 = this;
            java.lang.Object r1 = getTopics$suspendImpl(r0, r1, r2)
            return r1
    }
}
