package com.google.firebase.sessions;

/* compiled from: SessionEvent.kt */
/* loaded from: classes2.dex */
public final class SessionEvent {
    private final com.google.firebase.sessions.ApplicationInfo applicationInfo;
    private final com.google.firebase.sessions.EventType eventType;
    private final com.google.firebase.sessions.SessionInfo sessionData;

    public SessionEvent(com.google.firebase.sessions.EventType r2, com.google.firebase.sessions.SessionInfo r3, com.google.firebase.sessions.ApplicationInfo r4) {
            r1 = this;
            java.lang.String r0 = "eventType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "sessionData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "applicationInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.eventType = r2
            r1.sessionData = r3
            r1.applicationInfo = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.sessions.SessionEvent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.sessions.SessionEvent r5 = (com.google.firebase.sessions.SessionEvent) r5
            com.google.firebase.sessions.EventType r1 = r4.eventType
            com.google.firebase.sessions.EventType r3 = r5.eventType
            if (r1 == r3) goto L13
            return r2
        L13:
            com.google.firebase.sessions.SessionInfo r1 = r4.sessionData
            com.google.firebase.sessions.SessionInfo r3 = r5.sessionData
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            com.google.firebase.sessions.ApplicationInfo r1 = r4.applicationInfo
            com.google.firebase.sessions.ApplicationInfo r5 = r5.applicationInfo
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final com.google.firebase.sessions.ApplicationInfo getApplicationInfo() {
            r1 = this;
            com.google.firebase.sessions.ApplicationInfo r0 = r1.applicationInfo
            return r0
    }

    public final com.google.firebase.sessions.EventType getEventType() {
            r1 = this;
            com.google.firebase.sessions.EventType r0 = r1.eventType
            return r0
    }

    public final com.google.firebase.sessions.SessionInfo getSessionData() {
            r1 = this;
            com.google.firebase.sessions.SessionInfo r0 = r1.sessionData
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.firebase.sessions.EventType r0 = r2.eventType
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.google.firebase.sessions.SessionInfo r1 = r2.sessionData
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.firebase.sessions.ApplicationInfo r1 = r2.applicationInfo
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SessionEvent(eventType="
            r0.append(r1)
            com.google.firebase.sessions.EventType r1 = r2.eventType
            r0.append(r1)
            java.lang.String r1 = ", sessionData="
            r0.append(r1)
            com.google.firebase.sessions.SessionInfo r1 = r2.sessionData
            r0.append(r1)
            java.lang.String r1 = ", applicationInfo="
            r0.append(r1)
            com.google.firebase.sessions.ApplicationInfo r1 = r2.applicationInfo
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
