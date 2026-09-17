package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class ProcessUtils {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "ProcessUtils"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.ProcessUtils.TAG = r0
            return
    }

    private ProcessUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static java.lang.String getProcessName(android.content.Context r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r6 = android.app.Application.getProcessName()
            return r6
        Lb:
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String r3 = "android.app.ActivityThread"
            java.lang.Class<androidx.work.impl.utils.ProcessUtils> r4 = androidx.work.impl.utils.ProcessUtils.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L32
            java.lang.Class r3 = java.lang.Class.forName(r3, r2, r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "currentProcessName"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L32
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r3.invoke(r0, r4)     // Catch: java.lang.Throwable -> L32
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L42
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L32
            return r3
        L32:
            r3 = move-exception
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = androidx.work.impl.utils.ProcessUtils.TAG
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r1[r2] = r3
            java.lang.String r2 = "Unable to check ActivityThread for processName"
            r4.debug(r5, r2, r1)
        L42:
            int r1 = android.os.Process.myPid()
            java.lang.String r2 = "activity"
            java.lang.Object r6 = r6.getSystemService(r2)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L73
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto L73
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L73
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r3 = r2.pid
            if (r3 != r1) goto L60
            java.lang.String r6 = r2.processName
            return r6
        L73:
            return r0
    }

    public static boolean isDefaultProcess(android.content.Context r2, androidx.work.Configuration r3) {
            java.lang.String r0 = getProcessName(r2)
            java.lang.String r1 = r3.getDefaultProcessName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L17
            java.lang.String r2 = r3.getDefaultProcessName()
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            return r2
        L17:
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.processName
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            return r2
    }
}
