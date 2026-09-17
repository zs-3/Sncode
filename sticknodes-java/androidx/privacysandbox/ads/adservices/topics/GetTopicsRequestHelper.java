package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: GetTopicsRequestHelper.kt */
@android.annotation.SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class GetTopicsRequestHelper {
    public static final androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper INSTANCE = null;

    static {
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper r0 = new androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper
            r0.<init>()
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper.INSTANCE = r0
            return
    }

    private GetTopicsRequestHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public final android.adservices.topics.GetTopicsRequest convertRequestWithRecordObservation$ads_adservices_release(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r3) {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.adservices.topics.GetTopicsRequest$Builder r0 = new android.adservices.topics.GetTopicsRequest$Builder
            r0.<init>()
            java.lang.String r1 = r3.getAdsSdkName()
            android.adservices.topics.GetTopicsRequest$Builder r0 = r0.setAdsSdkName(r1)
            boolean r3 = r3.shouldRecordObservation()
            android.adservices.topics.GetTopicsRequest$Builder r3 = r0.setShouldRecordObservation(r3)
            android.adservices.topics.GetTopicsRequest r3 = r3.build()
            java.lang.String r0 = "Builder()\n            .s…ion)\n            .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            return r3
    }

    public final android.adservices.topics.GetTopicsRequest convertRequestWithoutRecordObservation$ads_adservices_release(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r2) {
            r1 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.adservices.topics.GetTopicsRequest$Builder r0 = new android.adservices.topics.GetTopicsRequest$Builder
            r0.<init>()
            java.lang.String r2 = r2.getAdsSdkName()
            android.adservices.topics.GetTopicsRequest$Builder r2 = r0.setAdsSdkName(r2)
            android.adservices.topics.GetTopicsRequest r2 = r2.build()
            java.lang.String r0 = "Builder()\n            .s…ame)\n            .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }
}
