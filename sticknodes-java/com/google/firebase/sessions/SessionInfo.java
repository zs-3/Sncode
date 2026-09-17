package com.google.firebase.sessions;

/* compiled from: SessionEvent.kt */
/* loaded from: classes2.dex */
public final class SessionInfo {
    private final com.google.firebase.sessions.DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;
    private final java.lang.String firebaseAuthenticationToken;
    private final java.lang.String firebaseInstallationId;
    private final java.lang.String firstSessionId;
    private final java.lang.String sessionId;
    private final int sessionIndex;

    public SessionInfo(java.lang.String r2, java.lang.String r3, int r4, long r5, com.google.firebase.sessions.DataCollectionStatus r7, java.lang.String r8, java.lang.String r9) {
            r1 = this;
            java.lang.String r0 = "sessionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "firstSessionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "dataCollectionStatus"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "firebaseInstallationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "firebaseAuthenticationToken"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r1.<init>()
            r1.sessionId = r2
            r1.firstSessionId = r3
            r1.sessionIndex = r4
            r1.eventTimestampUs = r5
            r1.dataCollectionStatus = r7
            r1.firebaseInstallationId = r8
            r1.firebaseAuthenticationToken = r9
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.sessions.SessionInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.sessions.SessionInfo r8 = (com.google.firebase.sessions.SessionInfo) r8
            java.lang.String r1 = r7.sessionId
            java.lang.String r3 = r8.sessionId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.firstSessionId
            java.lang.String r3 = r8.firstSessionId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r7.sessionIndex
            int r3 = r8.sessionIndex
            if (r1 == r3) goto L29
            return r2
        L29:
            long r3 = r7.eventTimestampUs
            long r5 = r8.eventTimestampUs
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L32
            return r2
        L32:
            com.google.firebase.sessions.DataCollectionStatus r1 = r7.dataCollectionStatus
            com.google.firebase.sessions.DataCollectionStatus r3 = r8.dataCollectionStatus
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L3d
            return r2
        L3d:
            java.lang.String r1 = r7.firebaseInstallationId
            java.lang.String r3 = r8.firebaseInstallationId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L48
            return r2
        L48:
            java.lang.String r1 = r7.firebaseAuthenticationToken
            java.lang.String r8 = r8.firebaseAuthenticationToken
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)
            if (r8 != 0) goto L53
            return r2
        L53:
            return r0
    }

    public final com.google.firebase.sessions.DataCollectionStatus getDataCollectionStatus() {
            r1 = this;
            com.google.firebase.sessions.DataCollectionStatus r0 = r1.dataCollectionStatus
            return r0
    }

    public final long getEventTimestampUs() {
            r2 = this;
            long r0 = r2.eventTimestampUs
            return r0
    }

    public final java.lang.String getFirebaseAuthenticationToken() {
            r1 = this;
            java.lang.String r0 = r1.firebaseAuthenticationToken
            return r0
    }

    public final java.lang.String getFirebaseInstallationId() {
            r1 = this;
            java.lang.String r0 = r1.firebaseInstallationId
            return r0
    }

    public final java.lang.String getFirstSessionId() {
            r1 = this;
            java.lang.String r0 = r1.firstSessionId
            return r0
    }

    public final java.lang.String getSessionId() {
            r1 = this;
            java.lang.String r0 = r1.sessionId
            return r0
    }

    public final int getSessionIndex() {
            r1 = this;
            int r0 = r1.sessionIndex
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.sessionId
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.firstSessionId
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.sessionIndex
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.eventTimestampUs
            int r1 = androidx.privacysandbox.ads.adservices.topics.Topic$$ExternalSyntheticBackport0.m(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.firebase.sessions.DataCollectionStatus r1 = r3.dataCollectionStatus
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.firebaseInstallationId
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.firebaseAuthenticationToken
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SessionInfo(sessionId="
            r0.append(r1)
            java.lang.String r1 = r3.sessionId
            r0.append(r1)
            java.lang.String r1 = ", firstSessionId="
            r0.append(r1)
            java.lang.String r1 = r3.firstSessionId
            r0.append(r1)
            java.lang.String r1 = ", sessionIndex="
            r0.append(r1)
            int r1 = r3.sessionIndex
            r0.append(r1)
            java.lang.String r1 = ", eventTimestampUs="
            r0.append(r1)
            long r1 = r3.eventTimestampUs
            r0.append(r1)
            java.lang.String r1 = ", dataCollectionStatus="
            r0.append(r1)
            com.google.firebase.sessions.DataCollectionStatus r1 = r3.dataCollectionStatus
            r0.append(r1)
            java.lang.String r1 = ", firebaseInstallationId="
            r0.append(r1)
            java.lang.String r1 = r3.firebaseInstallationId
            r0.append(r1)
            java.lang.String r1 = ", firebaseAuthenticationToken="
            r0.append(r1)
            java.lang.String r1 = r3.firebaseAuthenticationToken
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
