package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class WakeLocks {
    private static final java.lang.String TAG = null;
    private static final java.util.WeakHashMap<android.os.PowerManager.WakeLock, java.lang.String> sWakeLocks = null;

    static {
            java.lang.String r0 = "WakeLocks"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.WakeLocks.TAG = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.work.impl.utils.WakeLocks.sWakeLocks = r0
            return
    }

    public static void checkWakeLocks() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.WeakHashMap<android.os.PowerManager$WakeLock, java.lang.String> r1 = androidx.work.impl.utils.WakeLocks.sWakeLocks
            monitor-enter(r1)
            r0.putAll(r1)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            android.os.PowerManager$WakeLock r2 = (android.os.PowerManager.WakeLock) r2
            if (r2 == 0) goto L14
            boolean r3 = r2.isHeld()
            if (r3 == 0) goto L14
            java.lang.String r3 = "WakeLock held for %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object r2 = r0.get(r2)
            r5 = 0
            r4[r5] = r2
            java.lang.String r2 = java.lang.String.format(r3, r4)
            androidx.work.Logger r3 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.utils.WakeLocks.TAG
            java.lang.Throwable[] r5 = new java.lang.Throwable[r5]
            r3.warning(r4, r2, r5)
            goto L14
        L44:
            return
        L45:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r0
    }

    public static android.os.PowerManager.WakeLock newWakeLock(android.content.Context r2, java.lang.String r3) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "power"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WorkManager: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 1
            android.os.PowerManager$WakeLock r2 = r2.newWakeLock(r0, r3)
            java.util.WeakHashMap<android.os.PowerManager$WakeLock, java.lang.String> r0 = androidx.work.impl.utils.WakeLocks.sWakeLocks
            monitor-enter(r0)
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return r2
        L2a:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2
    }
}
