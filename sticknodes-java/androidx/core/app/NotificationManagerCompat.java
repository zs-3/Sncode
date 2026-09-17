package androidx.core.app;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    private static java.util.Set<java.lang.String> sEnabledNotificationListenerPackages;
    private static final java.lang.Object sEnabledNotificationListenersLock = null;
    private static final java.lang.Object sLock = null;
    private final android.content.Context mContext;
    private final android.app.NotificationManager mNotificationManager;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenersLock = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sLock = r0
            return
    }

    private NotificationManagerCompat(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.mContext = r2
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            r1.mNotificationManager = r2
            return
    }

    public static androidx.core.app.NotificationManagerCompat from(android.content.Context r1) {
            androidx.core.app.NotificationManagerCompat r0 = new androidx.core.app.NotificationManagerCompat
            r0.<init>(r1)
            return r0
    }

    public boolean areNotificationsEnabled() {
            r11 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r11.mNotificationManager
            boolean r0 = r0.areNotificationsEnabled()
            return r0
        Ld:
            android.content.Context r0 = r11.mContext
            java.lang.String r1 = "appops"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            android.content.Context r1 = r11.mContext
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            android.content.Context r2 = r11.mContext
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r2 = r2.getPackageName()
            int r1 = r1.uid
            r3 = 1
            java.lang.Class<android.app.AppOpsManager> r4 = android.app.AppOpsManager.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L79
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "checkOpNoThrow"
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L79
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L79
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> L79
            r7[r3] = r8     // Catch: java.lang.Throwable -> L79
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r10 = 2
            r7[r10] = r8     // Catch: java.lang.Throwable -> L79
            java.lang.reflect.Method r5 = r4.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L79
            java.lang.String r7 = "OP_POST_NOTIFICATION"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L79
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L79
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L79
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L79
            r6[r9] = r4     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L79
            r6[r3] = r1     // Catch: java.lang.Throwable -> L79
            r6[r10] = r2     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r5.invoke(r0, r6)     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L79
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L78
            goto L79
        L78:
            r3 = 0
        L79:
            return r3
    }
}
