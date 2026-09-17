package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: GetTopicsResponseHelper.kt */
@android.annotation.SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class GetTopicsResponseHelper {
    public static final androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper INSTANCE = null;

    static {
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper r0 = new androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper
            r0.<init>()
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper.INSTANCE = r0
            return
    }

    private GetTopicsResponseHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public final androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse r10) {
            r9 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r10 = r10.getTopics()
            java.util.Iterator r10 = r10.iterator()
        L12:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r10.next()
            android.adservices.topics.Topic r1 = (android.adservices.topics.Topic) r1
            androidx.privacysandbox.ads.adservices.topics.Topic r8 = new androidx.privacysandbox.ads.adservices.topics.Topic
            long r3 = r1.getTaxonomyVersion()
            long r5 = r1.getModelVersion()
            int r7 = r1.getTopicId()
            r2 = r8
            r2.<init>(r3, r5, r7)
            r0.add(r8)
            goto L12
        L34:
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r10 = new androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse
            r10.<init>(r0)
            return r10
    }

    public final androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse convertResponseWithEncryptedTopics$ads_adservices_release(android.adservices.topics.GetTopicsResponse r11) {
            r10 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r11.getTopics()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            android.adservices.topics.Topic r2 = (android.adservices.topics.Topic) r2
            androidx.privacysandbox.ads.adservices.topics.Topic r9 = new androidx.privacysandbox.ads.adservices.topics.Topic
            long r4 = r2.getTaxonomyVersion()
            long r6 = r2.getModelVersion()
            int r8 = r2.getTopicId()
            r3 = r9
            r3.<init>(r4, r6, r8)
            r0.add(r9)
            goto L12
        L34:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r11 = r11.getEncryptedTopics()
            java.util.Iterator r11 = r11.iterator()
        L41:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r11.next()
            android.adservices.topics.EncryptedTopic r2 = (android.adservices.topics.EncryptedTopic) r2
            androidx.privacysandbox.ads.adservices.topics.EncryptedTopic r3 = new androidx.privacysandbox.ads.adservices.topics.EncryptedTopic
            byte[] r4 = r2.getEncryptedTopic()
            java.lang.String r5 = "encryptedTopic.encryptedTopic"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = r2.getKeyIdentifier()
            java.lang.String r6 = "encryptedTopic.keyIdentifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            byte[] r2 = r2.getEncapsulatedKey()
            java.lang.String r6 = "encryptedTopic.encapsulatedKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            r3.<init>(r4, r5, r2)
            r1.add(r3)
            goto L41
        L71:
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r11 = new androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse
            r11.<init>(r0, r1)
            return r11
    }
}
