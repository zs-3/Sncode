package com.google.firebase.sessions;

/* compiled from: SessionFirelogPublisher.kt */
/* loaded from: classes2.dex */
public interface SessionFirelogPublisher {
    public static final com.google.firebase.sessions.SessionFirelogPublisher.Companion Companion = null;

    /* compiled from: SessionFirelogPublisher.kt */
    public static final class Companion {
        static final /* synthetic */ com.google.firebase.sessions.SessionFirelogPublisher.Companion $$INSTANCE = null;

        static {
                com.google.firebase.sessions.SessionFirelogPublisher$Companion r0 = new com.google.firebase.sessions.SessionFirelogPublisher$Companion
                r0.<init>()
                com.google.firebase.sessions.SessionFirelogPublisher.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.google.firebase.sessions.SessionFirelogPublisher getInstance() {
                r2 = this;
                com.google.firebase.Firebase r0 = com.google.firebase.Firebase.INSTANCE
                com.google.firebase.FirebaseApp r0 = com.google.firebase.FirebaseKt.getApp(r0)
                java.lang.Class<com.google.firebase.sessions.SessionFirelogPublisher> r1 = com.google.firebase.sessions.SessionFirelogPublisher.class
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r1 = "Firebase.app[SessionFirelogPublisher::class.java]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                com.google.firebase.sessions.SessionFirelogPublisher r0 = (com.google.firebase.sessions.SessionFirelogPublisher) r0
                return r0
        }
    }

    static {
            com.google.firebase.sessions.SessionFirelogPublisher$Companion r0 = com.google.firebase.sessions.SessionFirelogPublisher.Companion.$$INSTANCE
            com.google.firebase.sessions.SessionFirelogPublisher.Companion = r0
            return
    }

    void logSession(com.google.firebase.sessions.SessionDetails r1);
}
