package androidx.browser.customtabs;

/* loaded from: classes.dex */
public class CustomTabsClient {
    private final android.content.Context mApplicationContext;
    private final android.support.customtabs.ICustomTabsService mService;
    private final android.content.ComponentName mServiceComponentName;


    CustomTabsClient(android.support.customtabs.ICustomTabsService r1, android.content.ComponentName r2, android.content.Context r3) {
            r0 = this;
            r0.<init>()
            r0.mService = r1
            r0.mServiceComponentName = r2
            r0.mApplicationContext = r3
            return
    }

    public static boolean bindCustomTabsService(android.content.Context r2, java.lang.String r3, androidx.browser.customtabs.CustomTabsServiceConnection r4) {
            android.content.Context r0 = r2.getApplicationContext()
            r4.setApplicationContext(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.support.customtabs.action.CustomTabsService"
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L17
            r0.setPackage(r3)
        L17:
            r3 = 33
            boolean r2 = r2.bindService(r0, r4, r3)
            return r2
    }

    private android.support.customtabs.ICustomTabsCallback.Stub createCallbackWrapper(androidx.browser.customtabs.CustomTabsCallback r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsClient$2 r0 = new androidx.browser.customtabs.CustomTabsClient$2
            r0.<init>(r1, r2)
            return r0
    }

    private androidx.browser.customtabs.CustomTabsSession newSessionInternal(androidx.browser.customtabs.CustomTabsCallback r4, android.app.PendingIntent r5) {
            r3 = this;
            android.support.customtabs.ICustomTabsCallback$Stub r4 = r3.createCallbackWrapper(r4)
            r0 = 0
            if (r5 == 0) goto L18
            android.os.Bundle r1 = new android.os.Bundle     // Catch: android.os.RemoteException -> L2a
            r1.<init>()     // Catch: android.os.RemoteException -> L2a
            java.lang.String r2 = "android.support.customtabs.extra.SESSION_ID"
            r1.putParcelable(r2, r5)     // Catch: android.os.RemoteException -> L2a
            android.support.customtabs.ICustomTabsService r2 = r3.mService     // Catch: android.os.RemoteException -> L2a
            boolean r1 = r2.newSessionWithExtras(r4, r1)     // Catch: android.os.RemoteException -> L2a
            goto L1e
        L18:
            android.support.customtabs.ICustomTabsService r1 = r3.mService     // Catch: android.os.RemoteException -> L2a
            boolean r1 = r1.newSession(r4)     // Catch: android.os.RemoteException -> L2a
        L1e:
            if (r1 != 0) goto L21
            return r0
        L21:
            androidx.browser.customtabs.CustomTabsSession r0 = new androidx.browser.customtabs.CustomTabsSession
            android.support.customtabs.ICustomTabsService r1 = r3.mService
            android.content.ComponentName r2 = r3.mServiceComponentName
            r0.<init>(r1, r4, r2, r5)
        L2a:
            return r0
    }

    public androidx.browser.customtabs.CustomTabsSession newSession(androidx.browser.customtabs.CustomTabsCallback r2) {
            r1 = this;
            r0 = 0
            androidx.browser.customtabs.CustomTabsSession r2 = r1.newSessionInternal(r2, r0)
            return r2
    }

    public boolean warmup(long r2) {
            r1 = this;
            android.support.customtabs.ICustomTabsService r0 = r1.mService     // Catch: android.os.RemoteException -> L7
            boolean r2 = r0.warmup(r2)     // Catch: android.os.RemoteException -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }
}
