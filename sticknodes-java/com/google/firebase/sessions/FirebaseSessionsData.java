package com.google.firebase.sessions;

/* compiled from: SessionDatastore.kt */
/* loaded from: classes2.dex */
public final class FirebaseSessionsData {
    private final java.lang.String sessionId;

    public FirebaseSessionsData(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.sessionId = r1
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.firebase.sessions.FirebaseSessionsData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.sessions.FirebaseSessionsData r4 = (com.google.firebase.sessions.FirebaseSessionsData) r4
            java.lang.String r1 = r3.sessionId
            java.lang.String r4 = r4.sessionId
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.lang.String getSessionId() {
            r1 = this;
            java.lang.String r0 = r1.sessionId
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.sessionId
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FirebaseSessionsData(sessionId="
            r0.append(r1)
            java.lang.String r1 = r2.sessionId
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
