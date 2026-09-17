package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: TopicsManagerApi31Ext9Impl.kt */
@android.annotation.SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class TopicsManagerApi31Ext9Impl extends androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon {
    public TopicsManagerApi31Ext9Impl(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.adservices.topics.TopicsManager r2 = android.adservices.topics.TopicsManager.get(r2)
            java.lang.String r0 = "get(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
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
