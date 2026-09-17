package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: GetTopicsRequest.kt */
/* loaded from: classes.dex */
public final class GetTopicsRequest {
    private final java.lang.String adsSdkName;
    private final boolean shouldRecordObservation;

    /* compiled from: GetTopicsRequest.kt */
    public static final class Builder {
        private java.lang.String adsSdkName;
        private boolean shouldRecordObservation;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.adsSdkName = r0
                r0 = 1
                r1.shouldRecordObservation = r0
                return
        }

        public final androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest build() {
                r3 = this;
                androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r0 = new androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest
                java.lang.String r1 = r3.adsSdkName
                boolean r2 = r3.shouldRecordObservation
                r0.<init>(r1, r2)
                return r0
        }

        public final androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest.Builder setAdsSdkName(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "adsSdkName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.length()
                if (r0 <= 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L13
                r1.adsSdkName = r2
                return r1
            L13:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "adsSdkName must be set"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        public final androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest.Builder setShouldRecordObservation(boolean r1) {
                r0 = this;
                r0.shouldRecordObservation = r1
                return r0
        }
    }

    public GetTopicsRequest() {
            r3 = this;
            r0 = 0
            r1 = 0
            r2 = 3
            r3.<init>(r0, r1, r2, r0)
            return
    }

    public GetTopicsRequest(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "adsSdkName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.adsSdkName = r2
            r1.shouldRecordObservation = r3
            return
    }

    public /* synthetic */ GetTopicsRequest(java.lang.String r1, boolean r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r2 = 0
        Lb:
            r0.<init>(r1, r2)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String r1 = r4.adsSdkName
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r5 = (androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest) r5
            java.lang.String r3 = r5.adsSdkName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L1d
            boolean r1 = r4.shouldRecordObservation
            boolean r5 = r5.shouldRecordObservation
            if (r1 != r5) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public final java.lang.String getAdsSdkName() {
            r1 = this;
            java.lang.String r0 = r1.adsSdkName
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.adsSdkName
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.shouldRecordObservation
            int r1 = androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest$$ExternalSyntheticBackport0.m(r1)
            int r0 = r0 + r1
            return r0
    }

    public final boolean shouldRecordObservation() {
            r1 = this;
            boolean r0 = r1.shouldRecordObservation
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GetTopicsRequest: adsSdkName="
            r0.append(r1)
            java.lang.String r1 = r2.adsSdkName
            r0.append(r1)
            java.lang.String r1 = ", shouldRecordObservation="
            r0.append(r1)
            boolean r1 = r2.shouldRecordObservation
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
