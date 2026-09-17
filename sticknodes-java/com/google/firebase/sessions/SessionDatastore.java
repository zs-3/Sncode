package com.google.firebase.sessions;

/* compiled from: SessionDatastore.kt */
/* loaded from: classes2.dex */
public interface SessionDatastore {
    public static final com.google.firebase.sessions.SessionDatastore.Companion Companion = null;

    /* compiled from: SessionDatastore.kt */
    public static final class Companion {
        static final /* synthetic */ com.google.firebase.sessions.SessionDatastore.Companion $$INSTANCE = null;

        static {
                com.google.firebase.sessions.SessionDatastore$Companion r0 = new com.google.firebase.sessions.SessionDatastore$Companion
                r0.<init>()
                com.google.firebase.sessions.SessionDatastore.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.google.firebase.sessions.SessionDatastore getInstance() {
                r2 = this;
                com.google.firebase.Firebase r0 = com.google.firebase.Firebase.INSTANCE
                com.google.firebase.FirebaseApp r0 = com.google.firebase.FirebaseKt.getApp(r0)
                java.lang.Class<com.google.firebase.sessions.SessionDatastore> r1 = com.google.firebase.sessions.SessionDatastore.class
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r1 = "Firebase.app[SessionDatastore::class.java]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                com.google.firebase.sessions.SessionDatastore r0 = (com.google.firebase.sessions.SessionDatastore) r0
                return r0
        }
    }

    static {
            com.google.firebase.sessions.SessionDatastore$Companion r0 = com.google.firebase.sessions.SessionDatastore.Companion.$$INSTANCE
            com.google.firebase.sessions.SessionDatastore.Companion = r0
            return
    }

    java.lang.String getCurrentSessionId();

    void updateSessionId(java.lang.String r1);
}
