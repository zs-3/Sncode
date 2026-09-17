package com.google.firebase.sessions;

/* compiled from: SessionsActivityLifecycleCallbacks.kt */
/* loaded from: classes2.dex */
public final class SessionsActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
    public static final com.google.firebase.sessions.SessionsActivityLifecycleCallbacks INSTANCE = null;
    private static boolean hasPendingForeground;
    private static com.google.firebase.sessions.SessionLifecycleClient lifecycleClient;

    static {
            com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r0 = new com.google.firebase.sessions.SessionsActivityLifecycleCallbacks
            r0.<init>()
            com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE = r0
            return
    }

    private SessionsActivityLifecycleCallbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            java.lang.String r2 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.google.firebase.sessions.SessionLifecycleClient r2 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.lifecycleClient
            if (r2 == 0) goto Lc
            r2.backgrounded()
        Lc:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.google.firebase.sessions.SessionLifecycleClient r2 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.lifecycleClient
            if (r2 == 0) goto Lf
            r2.foregrounded()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 != 0) goto L15
            r2 = 1
            com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.hasPendingForeground = r2
        L15:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "outState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return
    }

    public final void setLifecycleClient(com.google.firebase.sessions.SessionLifecycleClient r2) {
            r1 = this;
            com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.lifecycleClient = r2
            if (r2 == 0) goto Le
            boolean r0 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.hasPendingForeground
            if (r0 == 0) goto Le
            r0 = 0
            com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.hasPendingForeground = r0
            r2.foregrounded()
        Le:
            return
    }
}
