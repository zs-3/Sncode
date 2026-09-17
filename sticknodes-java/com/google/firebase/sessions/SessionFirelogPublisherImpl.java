package com.google.firebase.sessions;

/* compiled from: SessionFirelogPublisher.kt */
/* loaded from: classes2.dex */
public final class SessionFirelogPublisherImpl implements com.google.firebase.sessions.SessionFirelogPublisher {
    public static final com.google.firebase.sessions.SessionFirelogPublisherImpl.Companion Companion = null;
    private static final double randomValueForSampling = 0.0d;
    private final kotlin.coroutines.CoroutineContext backgroundDispatcher;
    private final com.google.firebase.sessions.EventGDTLoggerInterface eventGDTLogger;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private final com.google.firebase.sessions.settings.SessionsSettings sessionSettings;

    /* compiled from: SessionFirelogPublisher.kt */
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
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {63, 64, 70}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.google.firebase.sessions.SessionDetails $sessionDetails;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        final /* synthetic */ com.google.firebase.sessions.SessionFirelogPublisherImpl this$0;

        AnonymousClass1(com.google.firebase.sessions.SessionFirelogPublisherImpl r1, com.google.firebase.sessions.SessionDetails r2, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionFirelogPublisherImpl.AnonymousClass1> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$sessionDetails = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1 r3 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1
                com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = r2.this$0
                com.google.firebase.sessions.SessionDetails r1 = r2.$sessionDetails
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1 r1 = (com.google.firebase.sessions.SessionFirelogPublisherImpl.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r10.L$5
                com.google.firebase.sessions.settings.SessionsSettings r0 = (com.google.firebase.sessions.settings.SessionsSettings) r0
                java.lang.Object r1 = r10.L$4
                com.google.firebase.sessions.SessionDetails r1 = (com.google.firebase.sessions.SessionDetails) r1
                java.lang.Object r2 = r10.L$3
                com.google.firebase.FirebaseApp r2 = (com.google.firebase.FirebaseApp) r2
                java.lang.Object r3 = r10.L$2
                com.google.firebase.sessions.SessionEvents r3 = (com.google.firebase.sessions.SessionEvents) r3
                java.lang.Object r4 = r10.L$1
                com.google.firebase.sessions.SessionFirelogPublisherImpl r4 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r4
                java.lang.Object r5 = r10.L$0
                com.google.firebase.sessions.InstallationId r5 = (com.google.firebase.sessions.InstallationId) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L9d
            L35:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L3d:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L6c
            L41:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L53
            L45:
                kotlin.ResultKt.throwOnFailure(r11)
                com.google.firebase.sessions.SessionFirelogPublisherImpl r11 = r10.this$0
                r10.label = r4
                java.lang.Object r11 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$shouldLogSession(r11, r10)
                if (r11 != r0) goto L53
                return r0
            L53:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb0
                com.google.firebase.sessions.InstallationId$Companion r11 = com.google.firebase.sessions.InstallationId.Companion
                com.google.firebase.sessions.SessionFirelogPublisherImpl r1 = r10.this$0
                com.google.firebase.installations.FirebaseInstallationsApi r1 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$getFirebaseInstallations$p(r1)
                r10.label = r3
                java.lang.Object r11 = r11.create(r1, r10)
                if (r11 != r0) goto L6c
                return r0
            L6c:
                r5 = r11
                com.google.firebase.sessions.InstallationId r5 = (com.google.firebase.sessions.InstallationId) r5
                com.google.firebase.sessions.SessionFirelogPublisherImpl r4 = r10.this$0
                com.google.firebase.sessions.SessionEvents r3 = com.google.firebase.sessions.SessionEvents.INSTANCE
                com.google.firebase.FirebaseApp r11 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$getFirebaseApp$p(r4)
                com.google.firebase.sessions.SessionDetails r1 = r10.$sessionDetails
                com.google.firebase.sessions.SessionFirelogPublisherImpl r6 = r10.this$0
                com.google.firebase.sessions.settings.SessionsSettings r6 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$getSessionSettings$p(r6)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r7 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r10.L$0 = r5
                r10.L$1 = r4
                r10.L$2 = r3
                r10.L$3 = r11
                r10.L$4 = r1
                r10.L$5 = r6
                r10.label = r2
                java.lang.Object r2 = r7.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r10)
                if (r2 != r0) goto L96
                return r0
            L96:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L9d:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.getFid()
                java.lang.String r6 = r5.getAuthToken()
                r5 = r11
                com.google.firebase.sessions.SessionEvent r11 = r0.buildSession(r1, r2, r3, r4, r5, r6)
                com.google.firebase.sessions.SessionFirelogPublisherImpl.access$attemptLoggingSessionEvent(r7, r11)
            Lb0:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {94}, m = "shouldLogSession")
    /* renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C00361 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.google.firebase.sessions.SessionFirelogPublisherImpl this$0;

        C00361(com.google.firebase.sessions.SessionFirelogPublisherImpl r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionFirelogPublisherImpl.C00361> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                com.google.firebase.sessions.SessionFirelogPublisherImpl r2 = r1.this$0
                java.lang.Object r2 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$shouldLogSession(r2, r1)
                return r2
        }
    }

    static {
            com.google.firebase.sessions.SessionFirelogPublisherImpl$Companion r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.SessionFirelogPublisherImpl.Companion = r0
            double r0 = java.lang.Math.random()
            com.google.firebase.sessions.SessionFirelogPublisherImpl.randomValueForSampling = r0
            return
    }

    public SessionFirelogPublisherImpl(com.google.firebase.FirebaseApp r2, com.google.firebase.installations.FirebaseInstallationsApi r3, com.google.firebase.sessions.settings.SessionsSettings r4, com.google.firebase.sessions.EventGDTLoggerInterface r5, kotlin.coroutines.CoroutineContext r6) {
            r1 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "firebaseInstallations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "sessionSettings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "eventGDTLogger"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.firebaseApp = r2
            r1.firebaseInstallations = r3
            r1.sessionSettings = r4
            r1.eventGDTLogger = r5
            r1.backgroundDispatcher = r6
            return
    }

    public static final /* synthetic */ void access$attemptLoggingSessionEvent(com.google.firebase.sessions.SessionFirelogPublisherImpl r0, com.google.firebase.sessions.SessionEvent r1) {
            r0.attemptLoggingSessionEvent(r1)
            return
    }

    public static final /* synthetic */ com.google.firebase.FirebaseApp access$getFirebaseApp$p(com.google.firebase.sessions.SessionFirelogPublisherImpl r0) {
            com.google.firebase.FirebaseApp r0 = r0.firebaseApp
            return r0
    }

    public static final /* synthetic */ com.google.firebase.installations.FirebaseInstallationsApi access$getFirebaseInstallations$p(com.google.firebase.sessions.SessionFirelogPublisherImpl r0) {
            com.google.firebase.installations.FirebaseInstallationsApi r0 = r0.firebaseInstallations
            return r0
    }

    public static final /* synthetic */ com.google.firebase.sessions.settings.SessionsSettings access$getSessionSettings$p(com.google.firebase.sessions.SessionFirelogPublisherImpl r0) {
            com.google.firebase.sessions.settings.SessionsSettings r0 = r0.sessionSettings
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$shouldLogSession(com.google.firebase.sessions.SessionFirelogPublisherImpl r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.shouldLogSession(r1)
            return r0
    }

    private final void attemptLoggingSessionEvent(com.google.firebase.sessions.SessionEvent r4) {
            r3 = this;
            java.lang.String r0 = "SessionFirelogPublisher"
            com.google.firebase.sessions.EventGDTLoggerInterface r1 = r3.eventGDTLogger     // Catch: java.lang.RuntimeException -> L24
            r1.log(r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L24
            r1.<init>()     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r2 = "Successfully logged Session Start event: "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L24
            com.google.firebase.sessions.SessionInfo r4 = r4.getSessionData()     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r4 = r4.getSessionId()     // Catch: java.lang.RuntimeException -> L24
            r1.append(r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r4 = r1.toString()     // Catch: java.lang.RuntimeException -> L24
            android.util.Log.d(r0, r4)     // Catch: java.lang.RuntimeException -> L24
            goto L2a
        L24:
            r4 = move-exception
            java.lang.String r1 = "Error logging Session Start event to DataTransport: "
            android.util.Log.e(r0, r1, r4)
        L2a:
            return
    }

    private final boolean shouldCollectEvents() {
            r5 = this;
            double r0 = com.google.firebase.sessions.SessionFirelogPublisherImpl.randomValueForSampling
            com.google.firebase.sessions.settings.SessionsSettings r2 = r5.sessionSettings
            double r2 = r2.getSamplingRate()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private final java.lang.Object shouldLogSession(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl.C00361
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl.C00361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.L$0
            com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            com.google.firebase.sessions.settings.SessionsSettings r6 = r5.sessionSettings
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            com.google.firebase.sessions.settings.SessionsSettings r6 = r0.sessionSettings
            boolean r6 = r6.getSessionsEnabled()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r6
        L60:
            boolean r6 = r0.shouldCollectEvents()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r6
        L70:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r6
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void logSession(com.google.firebase.sessions.SessionDetails r8) {
            r7 = this;
            java.lang.String r0 = "sessionDetails"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.coroutines.CoroutineContext r0 = r7.backgroundDispatcher
            kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
            com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1 r4 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            return
    }
}
