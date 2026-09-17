package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: TopicsManagerApi33Ext11Impl.kt */
@android.annotation.SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class TopicsManagerApi33Ext11Impl extends androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon {
    public TopicsManagerApi33Ext11Impl(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class<android.adservices.topics.TopicsManager> r0 = android.adservices.topics.TopicsManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "context.getSystemService…opicsManager::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            android.adservices.topics.TopicsManager r2 = (android.adservices.topics.TopicsManager) r2
            r1.<init>(r2)
            return
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r2) {
            r1 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper r0 = androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper.INSTANCE
            android.adservices.topics.GetTopicsRequest r2 = r0.convertRequestWithRecordObservation$ads_adservices_release(r2)
            return r2
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse r2) {
            r1 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper r0 = androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper.INSTANCE
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r2 = r0.convertResponseWithEncryptedTopics$ads_adservices_release(r2)
            return r2
    }
}
