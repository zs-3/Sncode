package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: GetTopicsResponse.kt */
/* loaded from: classes.dex */
public final class GetTopicsResponse {
    private final java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> encryptedTopics;
    private final java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> topics;

    public GetTopicsResponse(java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> r2) {
            r1 = this;
            java.lang.String r0 = "topics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r1.<init>(r2, r0)
            return
    }

    public GetTopicsResponse(java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> r2, java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> r3) {
            r1 = this;
            java.lang.String r0 = "topics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "encryptedTopics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.topics = r2
            r1.encryptedTopics = r3
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> r1 = r5.topics
            int r1 = r1.size()
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r6 = (androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse) r6
            java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> r3 = r6.topics
            int r3 = r3.size()
            if (r1 != r3) goto L54
            java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> r1 = r5.encryptedTopics
            int r1 = r1.size()
            java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> r3 = r6.encryptedTopics
            int r3 = r3.size()
            if (r1 == r3) goto L29
            goto L54
        L29:
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> r3 = r5.topics
            r1.<init>(r3)
            java.util.HashSet r3 = new java.util.HashSet
            java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> r4 = r6.topics
            r3.<init>(r4)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L52
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> r3 = r5.encryptedTopics
            r1.<init>(r3)
            java.util.HashSet r3 = new java.util.HashSet
            java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> r6 = r6.encryptedTopics
            r3.<init>(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r6 == 0) goto L52
            goto L53
        L52:
            r0 = 0
        L53:
            return r0
        L54:
            return r2
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> getTopics() {
            r1 = this;
            java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> r0 = r1.topics
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> r1 = r3.topics
            r2 = 0
            r0[r2] = r1
            java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> r1 = r3.encryptedTopics
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GetTopicsResponse: Topics="
            r0.append(r1)
            java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> r1 = r2.topics
            r0.append(r1)
            java.lang.String r1 = ", EncryptedTopics="
            r0.append(r1)
            java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> r1 = r2.encryptedTopics
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
