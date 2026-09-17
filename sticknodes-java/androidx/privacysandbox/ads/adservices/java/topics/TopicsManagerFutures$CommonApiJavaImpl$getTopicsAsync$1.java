package androidx.privacysandbox.ads.adservices.java.topics;

/* compiled from: TopicsManagerFutures.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse>, java.lang.Object> {
    final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest $request;
    int label;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.CommonApiJavaImpl this$0;

    TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.CommonApiJavaImpl r1, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r2, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1> r3) {
            r0 = this;
            r0.this$0 = r1
            r0.$request = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1 r3 = new androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl r0 = r2.this$0
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r1 = r2.$request
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> r2) {
            r0 = this;
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1 r1 = (androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r4)
            goto L2b
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.ResultKt.throwOnFailure(r4)
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl r4 = r3.this$0
            androidx.privacysandbox.ads.adservices.topics.TopicsManager r4 = androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.CommonApiJavaImpl.access$getMTopicsManager$p(r4)
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r1 = r3.$request
            r3.label = r2
            java.lang.Object r4 = r4.getTopics(r1, r3)
            if (r4 != r0) goto L2b
            return r0
        L2b:
            return r4
    }
}
