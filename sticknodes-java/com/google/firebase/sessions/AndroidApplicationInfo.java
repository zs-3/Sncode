package com.google.firebase.sessions;

/* compiled from: ApplicationInfo.kt */
/* loaded from: classes2.dex */
public final class AndroidApplicationInfo {
    private final java.lang.String appBuildVersion;
    private final java.util.List<com.google.firebase.sessions.ProcessDetails> appProcessDetails;
    private final com.google.firebase.sessions.ProcessDetails currentProcessDetails;
    private final java.lang.String deviceManufacturer;
    private final java.lang.String packageName;
    private final java.lang.String versionName;

    public AndroidApplicationInfo(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.google.firebase.sessions.ProcessDetails r6, java.util.List<com.google.firebase.sessions.ProcessDetails> r7) {
            r1 = this;
            java.lang.String r0 = "packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "versionName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "appBuildVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "deviceManufacturer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "currentProcessDetails"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "appProcessDetails"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r1.<init>()
            r1.packageName = r2
            r1.versionName = r3
            r1.appBuildVersion = r4
            r1.deviceManufacturer = r5
            r1.currentProcessDetails = r6
            r1.appProcessDetails = r7
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.sessions.AndroidApplicationInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.sessions.AndroidApplicationInfo r5 = (com.google.firebase.sessions.AndroidApplicationInfo) r5
            java.lang.String r1 = r4.packageName
            java.lang.String r3 = r5.packageName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.versionName
            java.lang.String r3 = r5.versionName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.appBuildVersion
            java.lang.String r3 = r5.appBuildVersion
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.deviceManufacturer
            java.lang.String r3 = r5.deviceManufacturer
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            com.google.firebase.sessions.ProcessDetails r1 = r4.currentProcessDetails
            com.google.firebase.sessions.ProcessDetails r3 = r5.currentProcessDetails
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.util.List<com.google.firebase.sessions.ProcessDetails> r1 = r4.appProcessDetails
            java.util.List<com.google.firebase.sessions.ProcessDetails> r5 = r5.appProcessDetails
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L4e
            return r2
        L4e:
            return r0
    }

    public final java.lang.String getAppBuildVersion() {
            r1 = this;
            java.lang.String r0 = r1.appBuildVersion
            return r0
    }

    public final java.util.List<com.google.firebase.sessions.ProcessDetails> getAppProcessDetails() {
            r1 = this;
            java.util.List<com.google.firebase.sessions.ProcessDetails> r0 = r1.appProcessDetails
            return r0
    }

    public final com.google.firebase.sessions.ProcessDetails getCurrentProcessDetails() {
            r1 = this;
            com.google.firebase.sessions.ProcessDetails r0 = r1.currentProcessDetails
            return r0
    }

    public final java.lang.String getDeviceManufacturer() {
            r1 = this;
            java.lang.String r0 = r1.deviceManufacturer
            return r0
    }

    public final java.lang.String getPackageName() {
            r1 = this;
            java.lang.String r0 = r1.packageName
            return r0
    }

    public final java.lang.String getVersionName() {
            r1 = this;
            java.lang.String r0 = r1.versionName
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.packageName
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.versionName
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.appBuildVersion
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.deviceManufacturer
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.firebase.sessions.ProcessDetails r1 = r2.currentProcessDetails
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<com.google.firebase.sessions.ProcessDetails> r1 = r2.appProcessDetails
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AndroidApplicationInfo(packageName="
            r0.append(r1)
            java.lang.String r1 = r2.packageName
            r0.append(r1)
            java.lang.String r1 = ", versionName="
            r0.append(r1)
            java.lang.String r1 = r2.versionName
            r0.append(r1)
            java.lang.String r1 = ", appBuildVersion="
            r0.append(r1)
            java.lang.String r1 = r2.appBuildVersion
            r0.append(r1)
            java.lang.String r1 = ", deviceManufacturer="
            r0.append(r1)
            java.lang.String r1 = r2.deviceManufacturer
            r0.append(r1)
            java.lang.String r1 = ", currentProcessDetails="
            r0.append(r1)
            com.google.firebase.sessions.ProcessDetails r1 = r2.currentProcessDetails
            r0.append(r1)
            java.lang.String r1 = ", appProcessDetails="
            r0.append(r1)
            java.util.List<com.google.firebase.sessions.ProcessDetails> r1 = r2.appProcessDetails
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
