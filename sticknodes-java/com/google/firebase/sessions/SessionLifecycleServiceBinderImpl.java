package com.google.firebase.sessions;

/* compiled from: SessionLifecycleServiceBinder.kt */
/* loaded from: classes2.dex */
public final class SessionLifecycleServiceBinderImpl implements com.google.firebase.sessions.SessionLifecycleServiceBinder {
    private static final com.google.firebase.sessions.SessionLifecycleServiceBinderImpl.Companion Companion = null;
    private final com.google.firebase.FirebaseApp firebaseApp;

    /* compiled from: SessionLifecycleServiceBinder.kt */
    private static final class Companion {
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
            com.google.firebase.sessions.SessionLifecycleServiceBinderImpl$Companion r0 = new com.google.firebase.sessions.SessionLifecycleServiceBinderImpl$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.SessionLifecycleServiceBinderImpl.Companion = r0
            return
    }

    public SessionLifecycleServiceBinderImpl(com.google.firebase.FirebaseApp r2) {
            r1 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.firebaseApp = r2
            return
    }

    private final java.lang.Object unbindServiceSafely(android.content.Context r2, android.content.ServiceConnection r3) {
            r1 = this;
            r2.unbindService(r3)     // Catch: java.lang.IllegalArgumentException -> L6
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.IllegalArgumentException -> L6
            goto L13
        L6:
            r2 = move-exception
            java.lang.String r3 = "LifecycleServiceBinder"
            java.lang.String r0 = "Session lifecycle service binding failed."
            int r2 = android.util.Log.w(r3, r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L13:
            return r2
    }

    @Override // com.google.firebase.sessions.SessionLifecycleServiceBinder
    public void bindToService(android.os.Messenger r5, android.content.ServiceConnection r6) {
            r4 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "serviceConnection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.google.firebase.FirebaseApp r0 = r4.firebaseApp
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "firebaseApp.applicationContext.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.google.firebase.sessions.SessionLifecycleService> r2 = com.google.firebase.sessions.SessionLifecycleService.class
            r1.<init>(r0, r2)
            java.lang.String r2 = "LifecycleServiceBinder"
            java.lang.String r3 = "Binding service to application."
            android.util.Log.d(r2, r3)
            int r3 = android.os.Process.myPid()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.setAction(r3)
            java.lang.String r3 = "ClientCallbackMessenger"
            r1.putExtra(r3, r5)
            java.lang.String r5 = r0.getPackageName()
            r1.setPackage(r5)
            r5 = 65
            boolean r5 = r0.bindService(r1, r6, r5)     // Catch: java.lang.SecurityException -> L45
            goto L4c
        L45:
            r5 = move-exception
            java.lang.String r1 = "Failed to bind session lifecycle service to application."
            android.util.Log.w(r2, r1, r5)
            r5 = 0
        L4c:
            if (r5 != 0) goto L56
            r4.unbindServiceSafely(r0, r6)
            java.lang.String r5 = "Session lifecycle service binding failed."
            android.util.Log.i(r2, r5)
        L56:
            return
    }
}
