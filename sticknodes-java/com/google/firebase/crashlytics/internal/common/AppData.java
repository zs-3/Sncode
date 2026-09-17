package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class AppData {
    public final java.lang.String buildId;
    public final java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> buildIdInfoList;
    public final com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider;
    public final java.lang.String googleAppId;
    public final java.lang.String installerPackageName;
    public final java.lang.String packageName;
    public final java.lang.String versionCode;
    public final java.lang.String versionName;

    public AppData(java.lang.String r1, java.lang.String r2, java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r8) {
            r0 = this;
            r0.<init>()
            r0.googleAppId = r1
            r0.buildId = r2
            r0.buildIdInfoList = r3
            r0.installerPackageName = r4
            r0.packageName = r5
            r0.versionCode = r6
            r0.versionName = r7
            r0.developmentPlatformProvider = r8
            return
    }

    public static com.google.firebase.crashlytics.internal.common.AppData create(android.content.Context r9, com.google.firebase.crashlytics.internal.common.IdManager r10, java.lang.String r11, java.lang.String r12, java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> r13, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r14) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r5 = r9.getPackageName()
            java.lang.String r4 = r10.getInstallerPackageName()
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            r10 = 0
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r5, r10)
            java.lang.String r6 = getAppBuildVersion(r9)
            java.lang.String r9 = r9.versionName
            if (r9 != 0) goto L1b
            java.lang.String r9 = "0.0"
        L1b:
            r7 = r9
            com.google.firebase.crashlytics.internal.common.AppData r9 = new com.google.firebase.crashlytics.internal.common.AppData
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r8 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    private static java.lang.String getAppBuildVersion(android.content.pm.PackageInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            long r0 = r2.getLongVersionCode()
            java.lang.String r2 = java.lang.Long.toString(r0)
            return r2
        Lf:
            int r2 = r2.versionCode
            java.lang.String r2 = java.lang.Integer.toString(r2)
            return r2
    }
}
