package com.google.firebase.sessions;

/* compiled from: FirebaseSessions.kt */
/* loaded from: classes2.dex */
public final class FirebaseSessions {
    public static final com.google.firebase.sessions.FirebaseSessions.Companion Companion = null;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.sessions.settings.SessionsSettings settings;

    /* compiled from: FirebaseSessions.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {45, 49}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.FirebaseSessions$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.coroutines.CoroutineContext $backgroundDispatcher;
        final /* synthetic */ com.google.firebase.sessions.SessionLifecycleServiceBinder $lifecycleServiceBinder;
        int label;
        final /* synthetic */ com.google.firebase.sessions.FirebaseSessions this$0;

        AnonymousClass1(com.google.firebase.sessions.FirebaseSessions r1, kotlin.coroutines.CoroutineContext r2, com.google.firebase.sessions.SessionLifecycleServiceBinder r3, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.FirebaseSessions.AnonymousClass1> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.$backgroundDispatcher = r2
                r0.$lifecycleServiceBinder = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                com.google.firebase.sessions.FirebaseSessions$1 r4 = new com.google.firebase.sessions.FirebaseSessions$1
                com.google.firebase.sessions.FirebaseSessions r0 = r3.this$0
                kotlin.coroutines.CoroutineContext r1 = r3.$backgroundDispatcher
                com.google.firebase.sessions.SessionLifecycleServiceBinder r2 = r3.$lifecycleServiceBinder
                r4.<init>(r0, r1, r2, r5)
                return r4
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
                com.google.firebase.sessions.FirebaseSessions$1 r1 = (com.google.firebase.sessions.FirebaseSessions.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.ResultKt.throwOnFailure(r6)
                goto L6d
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L2e
            L20:
                kotlin.ResultKt.throwOnFailure(r6)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r6 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r5.label = r4
                java.lang.Object r6 = r6.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L3f
                boolean r1 = r6.isEmpty()
                if (r1 == 0) goto L3f
                goto L56
            L3f:
                java.util.Iterator r6 = r6.iterator()
            L43:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r6.next()
                com.google.firebase.sessions.api.SessionSubscriber r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
                boolean r1 = r1.isDataCollectionEnabled()
                if (r1 == 0) goto L43
                r4 = 0
            L56:
                if (r4 == 0) goto L5e
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto L9b
            L5e:
                com.google.firebase.sessions.FirebaseSessions r6 = r5.this$0
                com.google.firebase.sessions.settings.SessionsSettings r6 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r6)
                r5.label = r3
                java.lang.Object r6 = r6.updateSettings(r5)
                if (r6 != r0) goto L6d
                return r0
            L6d:
                com.google.firebase.sessions.FirebaseSessions r6 = r5.this$0
                com.google.firebase.sessions.settings.SessionsSettings r6 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r6)
                boolean r6 = r6.getSessionsEnabled()
                if (r6 != 0) goto L7f
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto L9b
            L7f:
                com.google.firebase.sessions.SessionLifecycleClient r6 = new com.google.firebase.sessions.SessionLifecycleClient
                kotlin.coroutines.CoroutineContext r0 = r5.$backgroundDispatcher
                r6.<init>(r0)
                com.google.firebase.sessions.SessionLifecycleServiceBinder r0 = r5.$lifecycleServiceBinder
                r6.bindToService(r0)
                com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r0 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE
                r0.setLifecycleClient(r6)
                com.google.firebase.sessions.FirebaseSessions r6 = r5.this$0
                com.google.firebase.FirebaseApp r6 = com.google.firebase.sessions.FirebaseSessions.access$getFirebaseApp$p(r6)
                com.google.firebase.sessions.FirebaseSessions$1$$ExternalSyntheticLambda0 r0 = com.google.firebase.sessions.FirebaseSessions$1$$ExternalSyntheticLambda0.INSTANCE
                r6.addLifecycleEventListener(r0)
            L9b:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }

    /* compiled from: FirebaseSessions.kt */
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

    static {
            com.google.firebase.sessions.FirebaseSessions$Companion r0 = new com.google.firebase.sessions.FirebaseSessions$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.FirebaseSessions.Companion = r0
            return
    }

    public FirebaseSessions(com.google.firebase.FirebaseApp r7, com.google.firebase.sessions.settings.SessionsSettings r8, kotlin.coroutines.CoroutineContext r9, com.google.firebase.sessions.SessionLifecycleServiceBinder r10) {
            r6 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "settings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "lifecycleServiceBinder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r6.<init>()
            r6.firebaseApp = r7
            r6.settings = r8
            java.lang.String r8 = "FirebaseSessions"
            java.lang.String r0 = "Initializing Firebase Sessions SDK."
            android.util.Log.d(r8, r0)
            android.content.Context r7 = r7.getApplicationContext()
            android.content.Context r7 = r7.getApplicationContext()
            boolean r0 = r7 instanceof android.app.Application
            if (r0 == 0) goto L47
            android.app.Application r7 = (android.app.Application) r7
            com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r8 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE
            r7.registerActivityLifecycleCallbacks(r8)
            kotlinx.coroutines.CoroutineScope r0 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r9)
            r1 = 0
            r2 = 0
            com.google.firebase.sessions.FirebaseSessions$1 r3 = new com.google.firebase.sessions.FirebaseSessions$1
            r7 = 0
            r3.<init>(r6, r9, r10, r7)
            r4 = 3
            r5 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            goto L64
        L47:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Failed to register lifecycle callbacks, unexpected context "
            r9.append(r10)
            java.lang.Class r7 = r7.getClass()
            r9.append(r7)
            r7 = 46
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            android.util.Log.e(r8, r7)
        L64:
            return
    }

    public static final /* synthetic */ com.google.firebase.FirebaseApp access$getFirebaseApp$p(com.google.firebase.sessions.FirebaseSessions r0) {
            com.google.firebase.FirebaseApp r0 = r0.firebaseApp
            return r0
    }

    public static final /* synthetic */ com.google.firebase.sessions.settings.SessionsSettings access$getSettings$p(com.google.firebase.sessions.FirebaseSessions r0) {
            com.google.firebase.sessions.settings.SessionsSettings r0 = r0.settings
            return r0
    }
}
