package androidx.browser.customtabs;

/* loaded from: classes.dex */
public final class CustomTabsSession {
    private final android.support.customtabs.ICustomTabsCallback mCallback;
    private final android.content.ComponentName mComponentName;
    private final android.app.PendingIntent mId;
    private final java.lang.Object mLock;
    private final android.support.customtabs.ICustomTabsService mService;

    CustomTabsSession(android.support.customtabs.ICustomTabsService r2, android.support.customtabs.ICustomTabsCallback r3, android.content.ComponentName r4, android.app.PendingIntent r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r1.mService = r2
            r1.mCallback = r3
            r1.mComponentName = r4
            r1.mId = r5
            return
    }

    private void addIdToBundle(android.os.Bundle r3) {
            r2 = this;
            android.app.PendingIntent r0 = r2.mId
            if (r0 == 0) goto L9
            java.lang.String r1 = "android.support.customtabs.extra.SESSION_ID"
            r3.putParcelable(r1, r0)
        L9:
            return
    }

    private android.os.Bundle createBundleWithId(android.os.Bundle r2) {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r2 == 0) goto La
            r0.putAll(r2)
        La:
            r1.addIdToBundle(r0)
            return r0
    }

    android.os.IBinder getBinder() {
            r1 = this;
            android.support.customtabs.ICustomTabsCallback r0 = r1.mCallback
            android.os.IBinder r0 = r0.asBinder()
            return r0
    }

    android.content.ComponentName getComponentName() {
            r1 = this;
            android.content.ComponentName r0 = r1.mComponentName
            return r0
    }

    android.app.PendingIntent getId() {
            r1 = this;
            android.app.PendingIntent r0 = r1.mId
            return r0
    }

    public int postMessage(java.lang.String r4, android.os.Bundle r5) {
            r3 = this;
            android.os.Bundle r5 = r3.createBundleWithId(r5)
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.support.customtabs.ICustomTabsService r1 = r3.mService     // Catch: java.lang.Throwable -> L11 android.os.RemoteException -> L13
            android.support.customtabs.ICustomTabsCallback r2 = r3.mCallback     // Catch: java.lang.Throwable -> L11 android.os.RemoteException -> L13
            int r4 = r1.postMessage(r2, r4, r5)     // Catch: java.lang.Throwable -> L11 android.os.RemoteException -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r4
        L11:
            r4 = move-exception
            goto L16
        L13:
            r4 = -2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r4
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public boolean requestPostMessageChannel(android.net.Uri r4) {
            r3 = this;
            android.app.PendingIntent r0 = r3.mId     // Catch: android.os.RemoteException -> L1b
            if (r0 == 0) goto L12
            android.support.customtabs.ICustomTabsService r0 = r3.mService     // Catch: android.os.RemoteException -> L1b
            android.support.customtabs.ICustomTabsCallback r1 = r3.mCallback     // Catch: android.os.RemoteException -> L1b
            r2 = 0
            android.os.Bundle r2 = r3.createBundleWithId(r2)     // Catch: android.os.RemoteException -> L1b
            boolean r4 = r0.requestPostMessageChannelWithExtras(r1, r4, r2)     // Catch: android.os.RemoteException -> L1b
            return r4
        L12:
            android.support.customtabs.ICustomTabsService r0 = r3.mService     // Catch: android.os.RemoteException -> L1b
            android.support.customtabs.ICustomTabsCallback r1 = r3.mCallback     // Catch: android.os.RemoteException -> L1b
            boolean r4 = r0.requestPostMessageChannel(r1, r4)     // Catch: android.os.RemoteException -> L1b
            return r4
        L1b:
            r4 = 0
            return r4
    }
}
