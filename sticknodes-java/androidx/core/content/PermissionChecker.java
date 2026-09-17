package androidx.core.content;

/* loaded from: classes.dex */
public final class PermissionChecker {
    public static int checkPermission(android.content.Context r2, java.lang.String r3, int r4, int r5, java.lang.String r6) {
            int r4 = r2.checkPermission(r3, r4, r5)
            r0 = -1
            if (r4 != r0) goto L8
            return r0
        L8:
            java.lang.String r3 = androidx.core.app.AppOpsManagerCompat.permissionToOp(r3)
            r4 = 0
            if (r3 != 0) goto L10
            return r4
        L10:
            if (r6 != 0) goto L24
            android.content.pm.PackageManager r6 = r2.getPackageManager()
            java.lang.String[] r6 = r6.getPackagesForUid(r5)
            if (r6 == 0) goto L23
            int r1 = r6.length
            if (r1 > 0) goto L20
            goto L23
        L20:
            r6 = r6[r4]
            goto L24
        L23:
            return r0
        L24:
            int r0 = android.os.Process.myUid()
            java.lang.String r1 = r2.getPackageName()
            if (r0 != r5) goto L36
            boolean r0 = androidx.core.util.ObjectsCompat.equals(r1, r6)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            if (r0 == 0) goto L3e
            int r2 = androidx.core.app.AppOpsManagerCompat.checkOrNoteProxyOp(r2, r5, r3, r6)
            goto L42
        L3e:
            int r2 = androidx.core.app.AppOpsManagerCompat.noteProxyOpNoThrow(r2, r3, r6)
        L42:
            if (r2 != 0) goto L45
            goto L46
        L45:
            r4 = -2
        L46:
            return r4
    }

    public static int checkSelfPermission(android.content.Context r3, java.lang.String r4) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r3.getPackageName()
            int r3 = checkPermission(r3, r4, r0, r1, r2)
            return r3
    }
}
