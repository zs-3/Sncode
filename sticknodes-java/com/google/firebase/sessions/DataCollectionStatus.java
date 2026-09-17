package com.google.firebase.sessions;

/* compiled from: SessionEvent.kt */
/* loaded from: classes2.dex */
public final class DataCollectionStatus {
    private final com.google.firebase.sessions.DataCollectionState crashlytics;
    private final com.google.firebase.sessions.DataCollectionState performance;
    private final double sessionSamplingRate;

    public DataCollectionStatus() {
            r7 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r5, r6)
            return
    }

    public DataCollectionStatus(com.google.firebase.sessions.DataCollectionState r2, com.google.firebase.sessions.DataCollectionState r3, double r4) {
            r1 = this;
            java.lang.String r0 = "performance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "crashlytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.performance = r2
            r1.crashlytics = r3
            r1.sessionSamplingRate = r4
            return
    }

    public /* synthetic */ DataCollectionStatus(com.google.firebase.sessions.DataCollectionState r1, com.google.firebase.sessions.DataCollectionState r2, double r3, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L6
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_SDK_NOT_INSTALLED
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            com.google.firebase.sessions.DataCollectionState r2 = com.google.firebase.sessions.DataCollectionState.COLLECTION_SDK_NOT_INSTALLED
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L12:
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.sessions.DataCollectionStatus
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.sessions.DataCollectionStatus r8 = (com.google.firebase.sessions.DataCollectionStatus) r8
            com.google.firebase.sessions.DataCollectionState r1 = r7.performance
            com.google.firebase.sessions.DataCollectionState r3 = r8.performance
            if (r1 == r3) goto L13
            return r2
        L13:
            com.google.firebase.sessions.DataCollectionState r1 = r7.crashlytics
            com.google.firebase.sessions.DataCollectionState r3 = r8.crashlytics
            if (r1 == r3) goto L1a
            return r2
        L1a:
            double r3 = r7.sessionSamplingRate
            double r5 = r8.sessionSamplingRate
            int r8 = java.lang.Double.compare(r3, r5)
            if (r8 == 0) goto L25
            return r2
        L25:
            return r0
    }

    public final com.google.firebase.sessions.DataCollectionState getCrashlytics() {
            r1 = this;
            com.google.firebase.sessions.DataCollectionState r0 = r1.crashlytics
            return r0
    }

    public final com.google.firebase.sessions.DataCollectionState getPerformance() {
            r1 = this;
            com.google.firebase.sessions.DataCollectionState r0 = r1.performance
            return r0
    }

    public final double getSessionSamplingRate() {
            r2 = this;
            double r0 = r2.sessionSamplingRate
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.google.firebase.sessions.DataCollectionState r0 = r3.performance
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.google.firebase.sessions.DataCollectionState r1 = r3.crashlytics
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r3.sessionSamplingRate
            int r1 = com.google.firebase.sessions.DataCollectionStatus$$ExternalSyntheticBackport0.m(r1)
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DataCollectionStatus(performance="
            r0.append(r1)
            com.google.firebase.sessions.DataCollectionState r1 = r3.performance
            r0.append(r1)
            java.lang.String r1 = ", crashlytics="
            r0.append(r1)
            com.google.firebase.sessions.DataCollectionState r1 = r3.crashlytics
            r0.append(r1)
            java.lang.String r1 = ", sessionSamplingRate="
            r0.append(r1)
            double r1 = r3.sessionSamplingRate
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
