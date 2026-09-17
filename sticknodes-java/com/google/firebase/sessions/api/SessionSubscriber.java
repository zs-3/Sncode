package com.google.firebase.sessions.api;

/* compiled from: SessionSubscriber.kt */
/* loaded from: classes2.dex */
public interface SessionSubscriber {

    /* compiled from: SessionSubscriber.kt */
    public enum Name extends java.lang.Enum<com.google.firebase.sessions.api.SessionSubscriber.Name> {
        private static final /* synthetic */ com.google.firebase.sessions.api.SessionSubscriber.Name[] $VALUES = null;
        public static final com.google.firebase.sessions.api.SessionSubscriber.Name CRASHLYTICS = null;
        public static final com.google.firebase.sessions.api.SessionSubscriber.Name MATT_SAYS_HI = null;
        public static final com.google.firebase.sessions.api.SessionSubscriber.Name PERFORMANCE = null;

        private static final /* synthetic */ com.google.firebase.sessions.api.SessionSubscriber.Name[] $values() {
                r0 = 3
                com.google.firebase.sessions.api.SessionSubscriber$Name[] r0 = new com.google.firebase.sessions.api.SessionSubscriber.Name[r0]
                com.google.firebase.sessions.api.SessionSubscriber$Name r1 = com.google.firebase.sessions.api.SessionSubscriber.Name.CRASHLYTICS
                r2 = 0
                r0[r2] = r1
                com.google.firebase.sessions.api.SessionSubscriber$Name r1 = com.google.firebase.sessions.api.SessionSubscriber.Name.PERFORMANCE
                r2 = 1
                r0[r2] = r1
                com.google.firebase.sessions.api.SessionSubscriber$Name r1 = com.google.firebase.sessions.api.SessionSubscriber.Name.MATT_SAYS_HI
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                com.google.firebase.sessions.api.SessionSubscriber$Name r0 = new com.google.firebase.sessions.api.SessionSubscriber$Name
                java.lang.String r1 = "CRASHLYTICS"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.firebase.sessions.api.SessionSubscriber.Name.CRASHLYTICS = r0
                com.google.firebase.sessions.api.SessionSubscriber$Name r0 = new com.google.firebase.sessions.api.SessionSubscriber$Name
                java.lang.String r1 = "PERFORMANCE"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.firebase.sessions.api.SessionSubscriber.Name.PERFORMANCE = r0
                com.google.firebase.sessions.api.SessionSubscriber$Name r0 = new com.google.firebase.sessions.api.SessionSubscriber$Name
                java.lang.String r1 = "MATT_SAYS_HI"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.firebase.sessions.api.SessionSubscriber.Name.MATT_SAYS_HI = r0
                com.google.firebase.sessions.api.SessionSubscriber$Name[] r0 = $values()
                com.google.firebase.sessions.api.SessionSubscriber.Name.$VALUES = r0
                return
        }

        Name(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.firebase.sessions.api.SessionSubscriber.Name valueOf(java.lang.String r1) {
                java.lang.Class<com.google.firebase.sessions.api.SessionSubscriber$Name> r0 = com.google.firebase.sessions.api.SessionSubscriber.Name.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.firebase.sessions.api.SessionSubscriber$Name r1 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r1
                return r1
        }

        public static com.google.firebase.sessions.api.SessionSubscriber.Name[] values() {
                com.google.firebase.sessions.api.SessionSubscriber$Name[] r0 = com.google.firebase.sessions.api.SessionSubscriber.Name.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.firebase.sessions.api.SessionSubscriber$Name[] r0 = (com.google.firebase.sessions.api.SessionSubscriber.Name[]) r0
                return r0
        }
    }

    /* compiled from: SessionSubscriber.kt */
    public static final class SessionDetails {
        private final java.lang.String sessionId;

        public SessionDetails(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "sessionId"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.sessionId = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof com.google.firebase.sessions.api.SessionSubscriber.SessionDetails
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.firebase.sessions.api.SessionSubscriber$SessionDetails r4 = (com.google.firebase.sessions.api.SessionSubscriber.SessionDetails) r4
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
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SessionDetails(sessionId="
                r0.append(r1)
                java.lang.String r1 = r2.sessionId
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    com.google.firebase.sessions.api.SessionSubscriber.Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(com.google.firebase.sessions.api.SessionSubscriber.SessionDetails r1);
}
