package com.google.firebase.sessions;

/* compiled from: SessionLifecycleClient.kt */
/* loaded from: classes2.dex */
public final class SessionLifecycleClient {
    public static final com.google.firebase.sessions.SessionLifecycleClient.Companion Companion = null;
    private final kotlin.coroutines.CoroutineContext backgroundDispatcher;
    private final java.util.concurrent.LinkedBlockingDeque<android.os.Message> queuedMessages;
    private android.os.Messenger service;
    private boolean serviceBound;
    private final com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1 serviceConnection;

    /* compiled from: SessionLifecycleClient.kt */
    public static final class ClientUpdateHandler extends android.os.Handler {
        private final kotlin.coroutines.CoroutineContext backgroundDispatcher;

        public ClientUpdateHandler(kotlin.coroutines.CoroutineContext r2) {
                r1 = this;
                java.lang.String r0 = "backgroundDispatcher"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                r1.backgroundDispatcher = r2
                return
        }

        private final void handleSessionUpdate(java.lang.String r8) {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Session update received: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SessionLifecycleClient"
                android.util.Log.d(r1, r0)
                kotlin.coroutines.CoroutineContext r0 = r7.backgroundDispatcher
                kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
                com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1 r4 = new com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1
                r0 = 0
                r4.<init>(r8, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                java.lang.String r0 = "msg"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                int r0 = r3.what
                r1 = 3
                if (r0 != r1) goto L1e
                android.os.Bundle r3 = r3.getData()
                if (r3 == 0) goto L18
                java.lang.String r0 = "SessionUpdateExtra"
                java.lang.String r3 = r3.getString(r0)
                if (r3 != 0) goto L1a
            L18:
                java.lang.String r3 = ""
            L1a:
                r2.handleSessionUpdate(r3)
                goto L37
            L1e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received unexpected event from the SessionLifecycleService: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SessionLifecycleClient"
                android.util.Log.w(r1, r0)
                super.handleMessage(r3)
            L37:
                return
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
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

    /* compiled from: SessionLifecycleClient.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.List<android.os.Message> $messages;
        int label;
        final /* synthetic */ com.google.firebase.sessions.SessionLifecycleClient this$0;

        AnonymousClass1(com.google.firebase.sessions.SessionLifecycleClient r1, java.util.List<android.os.Message> r2, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionLifecycleClient.AnonymousClass1> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$messages = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1 r3 = new com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1
                com.google.firebase.sessions.SessionLifecycleClient r0 = r2.this$0
                java.util.List<android.os.Message> r1 = r2.$messages
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
                com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1 r1 = (com.google.firebase.sessions.SessionLifecycleClient.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r6 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r5.label = r2
                java.lang.Object r6 = r6.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                java.util.Map r6 = (java.util.Map) r6
                boolean r0 = r6.isEmpty()
                java.lang.String r1 = "SessionLifecycleClient"
                if (r0 == 0) goto L35
                java.lang.String r6 = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent."
                android.util.Log.d(r1, r6)
                goto La3
            L35:
                java.util.Collection r6 = r6.values()
                boolean r0 = r6 instanceof java.util.Collection
                r3 = 0
                if (r0 == 0) goto L46
                boolean r0 = r6.isEmpty()
                if (r0 == 0) goto L46
            L44:
                r6 = 1
                goto L5d
            L46:
                java.util.Iterator r6 = r6.iterator()
            L4a:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L44
                java.lang.Object r0 = r6.next()
                com.google.firebase.sessions.api.SessionSubscriber r0 = (com.google.firebase.sessions.api.SessionSubscriber) r0
                boolean r0 = r0.isDataCollectionEnabled()
                if (r0 == 0) goto L4a
                r6 = 0
            L5d:
                if (r6 == 0) goto L65
                java.lang.String r6 = "Data Collection is disabled for all subscribers. Skipping this Event"
                android.util.Log.d(r1, r6)
                goto La3
            L65:
                r6 = 2
                android.os.Message[] r0 = new android.os.Message[r6]
                com.google.firebase.sessions.SessionLifecycleClient r1 = r5.this$0
                java.util.List<android.os.Message> r4 = r5.$messages
                android.os.Message r6 = com.google.firebase.sessions.SessionLifecycleClient.access$getLatestByCode(r1, r4, r6)
                r0[r3] = r6
                com.google.firebase.sessions.SessionLifecycleClient r6 = r5.this$0
                java.util.List<android.os.Message> r1 = r5.$messages
                android.os.Message r6 = com.google.firebase.sessions.SessionLifecycleClient.access$getLatestByCode(r6, r1, r2)
                r0[r2] = r6
                java.util.List r6 = kotlin.collections.CollectionsKt.mutableListOf(r0)
                java.util.List r6 = kotlin.collections.CollectionsKt.filterNotNull(r6)
                com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1 r0 = new com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
                r0.<init>()
                java.util.List r6 = kotlin.collections.CollectionsKt.sortedWith(r6, r0)
                com.google.firebase.sessions.SessionLifecycleClient r0 = r5.this$0
                java.util.Iterator r6 = r6.iterator()
            L93:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto La3
                java.lang.Object r1 = r6.next()
                android.os.Message r1 = (android.os.Message) r1
                com.google.firebase.sessions.SessionLifecycleClient.access$sendMessageToServer(r0, r1)
                goto L93
            La3:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }

    static {
            com.google.firebase.sessions.SessionLifecycleClient$Companion r0 = new com.google.firebase.sessions.SessionLifecycleClient$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.SessionLifecycleClient.Companion = r0
            return
    }

    public SessionLifecycleClient(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.backgroundDispatcher = r2
            java.util.concurrent.LinkedBlockingDeque r2 = new java.util.concurrent.LinkedBlockingDeque
            r0 = 20
            r2.<init>(r0)
            r1.queuedMessages = r2
            com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1 r2 = new com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            r2.<init>(r1)
            r1.serviceConnection = r2
            return
    }

    public static final /* synthetic */ java.util.List access$drainQueue(com.google.firebase.sessions.SessionLifecycleClient r0) {
            java.util.List r0 = r0.drainQueue()
            return r0
    }

    public static final /* synthetic */ android.os.Message access$getLatestByCode(com.google.firebase.sessions.SessionLifecycleClient r0, java.util.List r1, int r2) {
            android.os.Message r0 = r0.getLatestByCode(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.LinkedBlockingDeque access$getQueuedMessages$p(com.google.firebase.sessions.SessionLifecycleClient r0) {
            java.util.concurrent.LinkedBlockingDeque<android.os.Message> r0 = r0.queuedMessages
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.Job access$sendLifecycleEvents(com.google.firebase.sessions.SessionLifecycleClient r0, java.util.List r1) {
            kotlinx.coroutines.Job r0 = r0.sendLifecycleEvents(r1)
            return r0
    }

    public static final /* synthetic */ void access$sendMessageToServer(com.google.firebase.sessions.SessionLifecycleClient r0, android.os.Message r1) {
            r0.sendMessageToServer(r1)
            return
    }

    public static final /* synthetic */ void access$setService$p(com.google.firebase.sessions.SessionLifecycleClient r0, android.os.Messenger r1) {
            r0.service = r1
            return
    }

    public static final /* synthetic */ void access$setServiceBound$p(com.google.firebase.sessions.SessionLifecycleClient r0, boolean r1) {
            r0.serviceBound = r1
            return
    }

    private final java.util.List<android.os.Message> drainQueue() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.LinkedBlockingDeque<android.os.Message> r1 = r2.queuedMessages
            r1.drainTo(r0)
            return r0
    }

    private final android.os.Message getLatestByCode(java.util.List<android.os.Message> r7, int r8) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r7.next()
            r2 = r1
            android.os.Message r2 = (android.os.Message) r2
            int r2 = r2.what
            if (r2 != r8) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L9
            r0.add(r1)
            goto L9
        L23:
            java.util.Iterator r7 = r0.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L2f
            r7 = 0
            goto L5a
        L2f:
            java.lang.Object r8 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L3b
        L39:
            r7 = r8
            goto L5a
        L3b:
            r0 = r8
            android.os.Message r0 = (android.os.Message) r0
            long r0 = r0.getWhen()
        L42:
            java.lang.Object r2 = r7.next()
            r3 = r2
            android.os.Message r3 = (android.os.Message) r3
            long r3 = r3.getWhen()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L53
            r8 = r2
            r0 = r3
        L53:
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L42
            goto L39
        L5a:
            android.os.Message r7 = (android.os.Message) r7
            return r7
    }

    private final void queueMessage(android.os.Message r4) {
            r3 = this;
            java.util.concurrent.LinkedBlockingDeque<android.os.Message> r0 = r3.queuedMessages
            boolean r0 = r0.offer(r4)
            java.lang.String r1 = "SessionLifecycleClient"
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Queued message "
            r0.append(r2)
            int r4 = r4.what
            r0.append(r4)
            java.lang.String r4 = ". Queue size "
            r0.append(r4)
            java.util.concurrent.LinkedBlockingDeque<android.os.Message> r4 = r3.queuedMessages
            int r4 = r4.size()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.util.Log.d(r1, r4)
            goto L4a
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to enqueue message "
            r0.append(r2)
            int r4 = r4.what
            r0.append(r4)
            java.lang.String r4 = ". Dropping."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.util.Log.d(r1, r4)
        L4a:
            return
    }

    private final void sendLifecycleEvent(int r4) {
            r3 = this;
            java.util.List r0 = r3.drainQueue()
            r1 = 0
            r2 = 0
            android.os.Message r4 = android.os.Message.obtain(r1, r4, r2, r2)
            java.lang.String r1 = "obtain(null, messageCode, 0, 0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r0.add(r4)
            r3.sendLifecycleEvents(r0)
            return
    }

    private final kotlinx.coroutines.Job sendLifecycleEvents(java.util.List<android.os.Message> r8) {
            r7 = this;
            kotlin.coroutines.CoroutineContext r0 = r7.backgroundDispatcher
            kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
            com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1 r4 = new com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            kotlinx.coroutines.Job r8 = kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    private final void sendMessageToServer(android.os.Message r5) {
            r4 = this;
            java.lang.String r0 = "SessionLifecycleClient"
            android.os.Messenger r1 = r4.service
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L29
            r1.<init>()     // Catch: android.os.RemoteException -> L29
            java.lang.String r2 = "Sending lifecycle "
            r1.append(r2)     // Catch: android.os.RemoteException -> L29
            int r2 = r5.what     // Catch: android.os.RemoteException -> L29
            r1.append(r2)     // Catch: android.os.RemoteException -> L29
            java.lang.String r2 = " to service"
            r1.append(r2)     // Catch: android.os.RemoteException -> L29
            java.lang.String r1 = r1.toString()     // Catch: android.os.RemoteException -> L29
            android.util.Log.d(r0, r1)     // Catch: android.os.RemoteException -> L29
            android.os.Messenger r1 = r4.service     // Catch: android.os.RemoteException -> L29
            if (r1 == 0) goto L47
            r1.send(r5)     // Catch: android.os.RemoteException -> L29
            goto L47
        L29:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to deliver message: "
            r2.append(r3)
            int r3 = r5.what
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2, r1)
            r4.queueMessage(r5)
            goto L47
        L44:
            r4.queueMessage(r5)
        L47:
            return
    }

    public final void backgrounded() {
            r1 = this;
            r0 = 2
            r1.sendLifecycleEvent(r0)
            return
    }

    public final void bindToService(com.google.firebase.sessions.SessionLifecycleServiceBinder r4) {
            r3 = this;
            java.lang.String r0 = "sessionLifecycleServiceBinder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.os.Messenger r0 = new android.os.Messenger
            com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler r1 = new com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler
            kotlin.coroutines.CoroutineContext r2 = r3.backgroundDispatcher
            r1.<init>(r2)
            r0.<init>(r1)
            com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1 r1 = r3.serviceConnection
            r4.bindToService(r0, r1)
            return
    }

    public final void foregrounded() {
            r1 = this;
            r0 = 1
            r1.sendLifecycleEvent(r0)
            return
    }
}
