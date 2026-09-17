package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class InstallerPackageNameProvider {
    private java.lang.String installerPackageName;

    InstallerPackageNameProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String loadInstallerPackageName(android.content.Context r1) {
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r1 = r0.getInstallerPackageName(r1)
            if (r1 != 0) goto L10
            java.lang.String r1 = ""
        L10:
            return r1
    }

    synchronized java.lang.String getInstallerPackageName(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.installerPackageName     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto Lb
            java.lang.String r2 = loadInstallerPackageName(r2)     // Catch: java.lang.Throwable -> L1b
            r1.installerPackageName = r2     // Catch: java.lang.Throwable -> L1b
        Lb:
            java.lang.String r2 = ""
            java.lang.String r0 = r1.installerPackageName     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L17
            r2 = 0
            goto L19
        L17:
            java.lang.String r2 = r1.installerPackageName     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r1)
            return r2
        L1b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
