package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: Topic.kt */
/* loaded from: classes.dex */
public final class Topic {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public Topic(long r1, long r3, int r5) {
            r0 = this;
            r0.<init>()
            r0.taxonomyVersion = r1
            r0.modelVersion = r3
            r0.topicId = r5
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.privacysandbox.ads.adservices.topics.Topic
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            long r3 = r7.taxonomyVersion
            androidx.privacysandbox.ads.adservices.topics.Topic r8 = (androidx.privacysandbox.ads.adservices.topics.Topic) r8
            long r5 = r8.taxonomyVersion
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L23
            long r3 = r7.modelVersion
            long r5 = r8.modelVersion
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L23
            int r1 = r7.topicId
            int r8 = r8.topicId
            if (r1 != r8) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    public final long getModelVersion() {
            r2 = this;
            long r0 = r2.modelVersion
            return r0
    }

    public final long getTaxonomyVersion() {
            r2 = this;
            long r0 = r2.taxonomyVersion
            return r0
    }

    public final int getTopicId() {
            r1 = this;
            int r0 = r1.topicId
            return r0
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.taxonomyVersion
            int r0 = androidx.privacysandbox.ads.adservices.topics.Topic$$ExternalSyntheticBackport0.m(r0)
            int r0 = r0 * 31
            long r1 = r3.modelVersion
            int r1 = androidx.privacysandbox.ads.adservices.topics.Topic$$ExternalSyntheticBackport0.m(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.topicId
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TaxonomyVersion="
            r0.append(r1)
            long r1 = r3.taxonomyVersion
            r0.append(r1)
            java.lang.String r1 = ", ModelVersion="
            r0.append(r1)
            long r1 = r3.modelVersion
            r0.append(r1)
            java.lang.String r1 = ", TopicCode="
            r0.append(r1)
            int r1 = r3.topicId
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Topic { "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
