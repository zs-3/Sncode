package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class PackageManagerHelper {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "PackageManagerHelper"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.PackageManagerHelper.TAG = r0
            return
    }

    public static void setComponentEnabled(android.content.Context r9, java.lang.Class<?> r10, boolean r11) {
            java.lang.String r0 = "enabled"
            java.lang.String r1 = "disabled"
            r2 = 2
            r3 = 0
            r4 = 1
            android.content.pm.PackageManager r5 = r9.getPackageManager()     // Catch: java.lang.Exception -> L3d
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch: java.lang.Exception -> L3d
            java.lang.String r7 = r10.getName()     // Catch: java.lang.Exception -> L3d
            r6.<init>(r9, r7)     // Catch: java.lang.Exception -> L3d
            if (r11 == 0) goto L18
            r9 = 1
            goto L19
        L18:
            r9 = 2
        L19:
            r5.setComponentEnabledSetting(r6, r9, r4)     // Catch: java.lang.Exception -> L3d
            androidx.work.Logger r9 = androidx.work.Logger.get()     // Catch: java.lang.Exception -> L3d
            java.lang.String r5 = androidx.work.impl.utils.PackageManagerHelper.TAG     // Catch: java.lang.Exception -> L3d
            java.lang.String r6 = "%s %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3d
            java.lang.String r8 = r10.getName()     // Catch: java.lang.Exception -> L3d
            r7[r3] = r8     // Catch: java.lang.Exception -> L3d
            if (r11 == 0) goto L30
            r8 = r0
            goto L31
        L30:
            r8 = r1
        L31:
            r7[r4] = r8     // Catch: java.lang.Exception -> L3d
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.Exception -> L3d
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]     // Catch: java.lang.Exception -> L3d
            r9.debug(r5, r6, r7)     // Catch: java.lang.Exception -> L3d
            goto L5f
        L3d:
            r9 = move-exception
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r6 = androidx.work.impl.utils.PackageManagerHelper.TAG
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r10 = r10.getName()
            r2[r3] = r10
            if (r11 == 0) goto L4f
            goto L50
        L4f:
            r0 = r1
        L50:
            r2[r4] = r0
            java.lang.String r10 = "%s could not be %s"
            java.lang.String r10 = java.lang.String.format(r10, r2)
            java.lang.Throwable[] r11 = new java.lang.Throwable[r4]
            r11[r3] = r9
            r5.debug(r6, r10, r11)
        L5f:
            return
    }
}
