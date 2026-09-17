package com.google.firebase.sessions;

/* compiled from: SessionLifecycleService.kt */
/* loaded from: classes2.dex */
public final class SessionLifecycleService extends android.app.Service {
    public static final com.google.firebase.sessions.SessionLifecycleService.Companion Companion = null;
    private final android.os.HandlerThread handlerThread;
    private com.google.firebase.sessions.SessionLifecycleService.MessageHandler messageHandler;
    private android.os.Messenger messenger;

    /* compiled from: SessionLifecycleService.kt */
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

    /* compiled from: SessionLifecycleService.kt */
    public static final class MessageHandler extends android.os.Handler {
        private final java.util.ArrayList<android.os.Messenger> boundClients;
        private boolean hasForegrounded;
        private long lastMsgTimeMs;

        public MessageHandler(android.os.Looper r2) {
                r1 = this;
                java.lang.String r0 = "looper"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.boundClients = r2
                return
        }

        private final void broadcastSession() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Broadcasting new session: "
                r0.append(r1)
                com.google.firebase.sessions.SessionGenerator$Companion r1 = com.google.firebase.sessions.SessionGenerator.Companion
                com.google.firebase.sessions.SessionGenerator r2 = r1.getInstance()
                com.google.firebase.sessions.SessionDetails r2 = r2.getCurrentSession()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "SessionLifecycleService"
                android.util.Log.d(r2, r0)
                com.google.firebase.sessions.SessionFirelogPublisher$Companion r0 = com.google.firebase.sessions.SessionFirelogPublisher.Companion
                com.google.firebase.sessions.SessionFirelogPublisher r0 = r0.getInstance()
                com.google.firebase.sessions.SessionGenerator r1 = r1.getInstance()
                com.google.firebase.sessions.SessionDetails r1 = r1.getCurrentSession()
                r0.logSession(r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.ArrayList<android.os.Messenger> r1 = r3.boundClients
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L3c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L51
                java.lang.Object r1 = r0.next()
                android.os.Messenger r1 = (android.os.Messenger) r1
                java.lang.String r2 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r3.maybeSendSessionToClient(r1)
                goto L3c
            L51:
                return
        }

        private final void handleBackgrounding(android.os.Message r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Activity backgrounding at "
                r0.append(r1)
                long r1 = r4.getWhen()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SessionLifecycleService"
                android.util.Log.d(r1, r0)
                long r0 = r4.getWhen()
                r3.lastMsgTimeMs = r0
                return
        }

        private final void handleClientBound(android.os.Message r4) {
                r3 = this;
                java.util.ArrayList<android.os.Messenger> r0 = r3.boundClients
                android.os.Messenger r1 = r4.replyTo
                r0.add(r1)
                android.os.Messenger r0 = r4.replyTo
                java.lang.String r1 = "msg.replyTo"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r3.maybeSendSessionToClient(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Client "
                r0.append(r1)
                android.os.Messenger r1 = r4.replyTo
                r0.append(r1)
                java.lang.String r1 = " bound at "
                r0.append(r1)
                long r1 = r4.getWhen()
                r0.append(r1)
                java.lang.String r4 = ". Clients: "
                r0.append(r4)
                java.util.ArrayList<android.os.Messenger> r4 = r3.boundClients
                int r4 = r4.size()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "SessionLifecycleService"
                android.util.Log.d(r0, r4)
                return
        }

        private final void handleForegrounding(android.os.Message r5) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Activity foregrounding at "
                r0.append(r1)
                long r1 = r5.getWhen()
                r0.append(r1)
                r1 = 46
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SessionLifecycleService"
                android.util.Log.d(r1, r0)
                boolean r0 = r4.hasForegrounded
                if (r0 != 0) goto L2f
                java.lang.String r0 = "Cold start detected."
                android.util.Log.d(r1, r0)
                r0 = 1
                r4.hasForegrounded = r0
                r4.newSession()
                goto L41
            L2f:
                long r2 = r5.getWhen()
                boolean r0 = r4.isSessionRestart(r2)
                if (r0 == 0) goto L41
                java.lang.String r0 = "Session too long in background. Creating new session."
                android.util.Log.d(r1, r0)
                r4.newSession()
            L41:
                long r0 = r5.getWhen()
                r4.lastMsgTimeMs = r0
                return
        }

        private final boolean isSessionRestart(long r4) {
                r3 = this;
                long r0 = r3.lastMsgTimeMs
                long r4 = r4 - r0
                com.google.firebase.sessions.settings.SessionsSettings$Companion r0 = com.google.firebase.sessions.settings.SessionsSettings.Companion
                com.google.firebase.sessions.settings.SessionsSettings r0 = r0.getInstance()
                long r0 = r0.m71getSessionRestartTimeoutUwyO8pc()
                long r0 = kotlin.time.Duration.m85getInWholeMillisecondsimpl(r0)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L17
                r4 = 1
                goto L18
            L17:
                r4 = 0
            L18:
                return r4
        }

        private final void maybeSendSessionToClient(android.os.Messenger r4) {
                r3 = this;
                boolean r0 = r3.hasForegrounded
                if (r0 == 0) goto L16
                com.google.firebase.sessions.SessionGenerator$Companion r0 = com.google.firebase.sessions.SessionGenerator.Companion
                com.google.firebase.sessions.SessionGenerator r0 = r0.getInstance()
                com.google.firebase.sessions.SessionDetails r0 = r0.getCurrentSession()
                java.lang.String r0 = r0.getSessionId()
                r3.sendSessionToClient(r4, r0)
                goto L3b
            L16:
                com.google.firebase.sessions.SessionDatastore$Companion r0 = com.google.firebase.sessions.SessionDatastore.Companion
                com.google.firebase.sessions.SessionDatastore r0 = r0.getInstance()
                java.lang.String r0 = r0.getCurrentSessionId()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "App has not yet foregrounded. Using previously stored session: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SessionLifecycleService"
                android.util.Log.d(r2, r1)
                if (r0 == 0) goto L3b
                r3.sendSessionToClient(r4, r0)
            L3b:
                return
        }

        private final void newSession() {
                r3 = this;
                com.google.firebase.sessions.SessionGenerator$Companion r0 = com.google.firebase.sessions.SessionGenerator.Companion
                com.google.firebase.sessions.SessionGenerator r1 = r0.getInstance()
                r1.generateNewSession()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Generated new session "
                r1.append(r2)
                com.google.firebase.sessions.SessionGenerator r2 = r0.getInstance()
                com.google.firebase.sessions.SessionDetails r2 = r2.getCurrentSession()
                java.lang.String r2 = r2.getSessionId()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SessionLifecycleService"
                android.util.Log.d(r2, r1)
                r3.broadcastSession()
                com.google.firebase.sessions.SessionDatastore$Companion r1 = com.google.firebase.sessions.SessionDatastore.Companion
                com.google.firebase.sessions.SessionDatastore r1 = r1.getInstance()
                com.google.firebase.sessions.SessionGenerator r0 = r0.getInstance()
                com.google.firebase.sessions.SessionDetails r0 = r0.getCurrentSession()
                java.lang.String r0 = r0.getSessionId()
                r1.updateSessionId(r0)
                return
        }

        private final void sendSessionToClient(android.os.Messenger r5, java.lang.String r6) {
                r4 = this;
                java.lang.String r0 = "SessionLifecycleService"
                android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Exception -> L1a android.os.DeadObjectException -> L35
                r1.<init>()     // Catch: java.lang.Exception -> L1a android.os.DeadObjectException -> L35
                java.lang.String r2 = "SessionUpdateExtra"
                r1.putString(r2, r6)     // Catch: java.lang.Exception -> L1a android.os.DeadObjectException -> L35
                r6 = 0
                r2 = 3
                r3 = 0
                android.os.Message r6 = android.os.Message.obtain(r6, r2, r3, r3)     // Catch: java.lang.Exception -> L1a android.os.DeadObjectException -> L35
                r6.setData(r1)     // Catch: java.lang.Exception -> L1a android.os.DeadObjectException -> L35
                r5.send(r6)     // Catch: java.lang.Exception -> L1a android.os.DeadObjectException -> L35
                goto L4e
            L1a:
                r6 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unable to push new session to "
                r1.append(r2)
                r1.append(r5)
                r5 = 46
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                android.util.Log.w(r0, r5, r6)
                goto L4e
            L35:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = "Removing dead client from list: "
                r6.append(r1)
                r6.append(r5)
                java.lang.String r6 = r6.toString()
                android.util.Log.d(r0, r6)
                java.util.ArrayList<android.os.Messenger> r6 = r4.boundClients
                r6.remove(r5)
            L4e:
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r7) {
                r6 = this;
                java.lang.String r0 = "msg"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                long r0 = r6.lastMsgTimeMs
                long r2 = r7.getWhen()
                java.lang.String r4 = "SessionLifecycleService"
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L39
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Ignoring old message from "
                r0.append(r1)
                long r1 = r7.getWhen()
                r0.append(r1)
                java.lang.String r7 = " which is older than "
                r0.append(r7)
                long r1 = r6.lastMsgTimeMs
                r0.append(r1)
                r7 = 46
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                android.util.Log.d(r4, r7)
                return
            L39:
                int r0 = r7.what
                r1 = 1
                if (r0 == r1) goto L64
                r1 = 2
                if (r0 == r1) goto L60
                r1 = 4
                if (r0 == r1) goto L5c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received unexpected event from the SessionLifecycleClient: "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                android.util.Log.w(r4, r0)
                super.handleMessage(r7)
                goto L67
            L5c:
                r6.handleClientBound(r7)
                goto L67
            L60:
                r6.handleBackgrounding(r7)
                goto L67
            L64:
                r6.handleForegrounding(r7)
            L67:
                return
        }
    }

    static {
            com.google.firebase.sessions.SessionLifecycleService$Companion r0 = new com.google.firebase.sessions.SessionLifecycleService$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.SessionLifecycleService.Companion = r0
            return
    }

    public SessionLifecycleService() {
            r2 = this;
            r2.<init>()
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "FirebaseSessions_HandlerThread"
            r0.<init>(r1)
            r2.handlerThread = r0
            return
    }

    private final android.os.Messenger getClientCallback(android.content.Intent r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "ClientCallbackMessenger"
            r2 = 33
            if (r0 < r2) goto L11
            java.lang.Class<android.os.Messenger> r0 = android.os.Messenger.class
            java.lang.Object r4 = r4.getParcelableExtra(r1, r0)
            android.os.Messenger r4 = (android.os.Messenger) r4
            goto L17
        L11:
            android.os.Parcelable r4 = r4.getParcelableExtra(r1)
            android.os.Messenger r4 = (android.os.Messenger) r4
        L17:
            return r4
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r5) {
            r4 = this;
            java.lang.String r0 = "SessionLifecycleService"
            r1 = 0
            if (r5 != 0) goto Lb
            java.lang.String r5 = "Service bound with null intent. Ignoring."
            android.util.Log.d(r0, r5)
            goto L40
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Service bound to new client on process "
            r2.append(r3)
            java.lang.String r3 = r5.getAction()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
            android.os.Messenger r5 = r4.getClientCallback(r5)
            if (r5 == 0) goto L38
            r0 = 4
            r2 = 0
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r2, r2)
            r0.replyTo = r5
            com.google.firebase.sessions.SessionLifecycleService$MessageHandler r5 = r4.messageHandler
            if (r5 == 0) goto L38
            r5.sendMessage(r0)
        L38:
            android.os.Messenger r5 = r4.messenger
            if (r5 == 0) goto L40
            android.os.IBinder r1 = r5.getBinder()
        L40:
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r3 = this;
            super.onCreate()
            android.os.HandlerThread r0 = r3.handlerThread
            r0.start()
            com.google.firebase.sessions.SessionLifecycleService$MessageHandler r0 = new com.google.firebase.sessions.SessionLifecycleService$MessageHandler
            android.os.HandlerThread r1 = r3.handlerThread
            android.os.Looper r1 = r1.getLooper()
            java.lang.String r2 = "handlerThread.looper"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1)
            r3.messageHandler = r0
            android.os.Messenger r0 = new android.os.Messenger
            com.google.firebase.sessions.SessionLifecycleService$MessageHandler r1 = r3.messageHandler
            r0.<init>(r1)
            r3.messenger = r0
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            android.os.HandlerThread r0 = r1.handlerThread
            r0.quit()
            return
    }
}
