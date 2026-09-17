package com.google.firebase.sessions;

/* compiled from: SessionGenerator.kt */
/* loaded from: classes2.dex */
public final class SessionGenerator {
    public static final com.google.firebase.sessions.SessionGenerator.Companion Companion = null;
    private com.google.firebase.sessions.SessionDetails currentSession;
    private final java.lang.String firstSessionId;
    private int sessionIndex;
    private final com.google.firebase.sessions.TimeProvider timeProvider;
    private final kotlin.jvm.functions.Function0<java.util.UUID> uuidGenerator;

    /* compiled from: SessionGenerator.kt */
    /* renamed from: com.google.firebase.sessions.SessionGenerator$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.util.UUID> {
        public static final com.google.firebase.sessions.SessionGenerator.AnonymousClass1 INSTANCE = null;

        static {
                com.google.firebase.sessions.SessionGenerator$1 r0 = new com.google.firebase.sessions.SessionGenerator$1
                r0.<init>()
                com.google.firebase.sessions.SessionGenerator.AnonymousClass1.INSTANCE = r0
                return
        }

        AnonymousClass1() {
                r6 = this;
                java.lang.Class<java.util.UUID> r2 = java.util.UUID.class
                r1 = 0
                java.lang.String r3 = "randomUUID"
                java.lang.String r4 = "randomUUID()Ljava/util/UUID;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.util.UUID invoke() {
                r1 = this;
                java.util.UUID r0 = r1.invoke2()
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.util.UUID invoke2() {
                r1 = this;
                java.util.UUID r0 = java.util.UUID.randomUUID()
                return r0
        }
    }

    /* compiled from: SessionGenerator.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.google.firebase.sessions.SessionGenerator getInstance() {
                r2 = this;
                com.google.firebase.Firebase r0 = com.google.firebase.Firebase.INSTANCE
                com.google.firebase.FirebaseApp r0 = com.google.firebase.FirebaseKt.getApp(r0)
                java.lang.Class<com.google.firebase.sessions.SessionGenerator> r1 = com.google.firebase.sessions.SessionGenerator.class
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r1 = "Firebase.app[SessionGenerator::class.java]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                com.google.firebase.sessions.SessionGenerator r0 = (com.google.firebase.sessions.SessionGenerator) r0
                return r0
        }
    }

    static {
            com.google.firebase.sessions.SessionGenerator$Companion r0 = new com.google.firebase.sessions.SessionGenerator$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.SessionGenerator.Companion = r0
            return
    }

    public SessionGenerator(com.google.firebase.sessions.TimeProvider r2, kotlin.jvm.functions.Function0<java.util.UUID> r3) {
            r1 = this;
            java.lang.String r0 = "timeProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "uuidGenerator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.timeProvider = r2
            r1.uuidGenerator = r3
            java.lang.String r2 = r1.generateSessionId()
            r1.firstSessionId = r2
            r2 = -1
            r1.sessionIndex = r2
            return
    }

    public /* synthetic */ SessionGenerator(com.google.firebase.sessions.TimeProvider r1, kotlin.jvm.functions.Function0 r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            com.google.firebase.sessions.SessionGenerator$1 r2 = com.google.firebase.sessions.SessionGenerator.AnonymousClass1.INSTANCE
        L6:
            r0.<init>(r1, r2)
            return
    }

    private final java.lang.String generateSessionId() {
            r7 = this;
            kotlin.jvm.functions.Function0<java.util.UUID> r0 = r7.uuidGenerator
            java.lang.Object r0 = r0.invoke()
            java.util.UUID r0 = (java.util.UUID) r0
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "uuidGenerator().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.String r2 = "-"
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final com.google.firebase.sessions.SessionDetails generateNewSession() {
            r8 = this;
            int r0 = r8.sessionIndex
            int r0 = r0 + 1
            r8.sessionIndex = r0
            com.google.firebase.sessions.SessionDetails r7 = new com.google.firebase.sessions.SessionDetails
            if (r0 != 0) goto Ld
            java.lang.String r0 = r8.firstSessionId
            goto L11
        Ld:
            java.lang.String r0 = r8.generateSessionId()
        L11:
            r2 = r0
            java.lang.String r3 = r8.firstSessionId
            int r4 = r8.sessionIndex
            com.google.firebase.sessions.TimeProvider r0 = r8.timeProvider
            long r5 = r0.currentTimeUs()
            r1 = r7
            r1.<init>(r2, r3, r4, r5)
            r8.currentSession = r7
            com.google.firebase.sessions.SessionDetails r0 = r8.getCurrentSession()
            return r0
    }

    public final com.google.firebase.sessions.SessionDetails getCurrentSession() {
            r1 = this;
            com.google.firebase.sessions.SessionDetails r0 = r1.currentSession
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "currentSession"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
    }
}
