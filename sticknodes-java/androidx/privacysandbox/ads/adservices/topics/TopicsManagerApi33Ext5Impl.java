package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: TopicsManagerApi33Ext5Impl.kt */
@android.annotation.SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class TopicsManagerApi33Ext5Impl extends androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon {
    public TopicsManagerApi33Ext5Impl(android.content.Context r2) {
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
}
