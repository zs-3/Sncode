package com.google.firebase.sessions;

/* compiled from: ApplicationInfo.kt */
/* loaded from: classes2.dex */
public final class ApplicationInfo {
    private final com.google.firebase.sessions.AndroidApplicationInfo androidAppInfo;
    private final java.lang.String appId;
    private final java.lang.String deviceModel;
    private final com.google.firebase.sessions.LogEnvironment logEnvironment;
    private final java.lang.String osVersion;
    private final java.lang.String sessionSdkVersion;

    public ApplicationInfo(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.google.firebase.sessions.LogEnvironment r6, com.google.firebase.sessions.AndroidApplicationInfo r7) {
            r1 = this;
            java.lang.String r0 = "appId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "deviceModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "sessionSdkVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "osVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "logEnvironment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "androidAppInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r1.<init>()
            r1.appId = r2
            r1.deviceModel = r3
            r1.sessionSdkVersion = r4
            r1.osVersion = r5
            r1.logEnvironment = r6
            r1.androidAppInfo = r7
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.sessions.ApplicationInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.sessions.ApplicationInfo r5 = (com.google.firebase.sessions.ApplicationInfo) r5
            java.lang.String r1 = r4.appId
            java.lang.String r3 = r5.appId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.deviceModel
            java.lang.String r3 = r5.deviceModel
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.sessionSdkVersion
            java.lang.String r3 = r5.sessionSdkVersion
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.osVersion
            java.lang.String r3 = r5.osVersion
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            com.google.firebase.sessions.LogEnvironment r1 = r4.logEnvironment
            com.google.firebase.sessions.LogEnvironment r3 = r5.logEnvironment
            if (r1 == r3) goto L3f
            return r2
        L3f:
            com.google.firebase.sessions.AndroidApplicationInfo r1 = r4.androidAppInfo
            com.google.firebase.sessions.AndroidApplicationInfo r5 = r5.androidAppInfo
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L4a
            return r2
        L4a:
            return r0
    }

    public final com.google.firebase.sessions.AndroidApplicationInfo getAndroidAppInfo() {
            r1 = this;
            com.google.firebase.sessions.AndroidApplicationInfo r0 = r1.androidAppInfo
            return r0
    }

    public final java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public final java.lang.String getDeviceModel() {
            r1 = this;
            java.lang.String r0 = r1.deviceModel
            return r0
    }

    public final com.google.firebase.sessions.LogEnvironment getLogEnvironment() {
            r1 = this;
            com.google.firebase.sessions.LogEnvironment r0 = r1.logEnvironment
            return r0
    }

    public final java.lang.String getOsVersion() {
            r1 = this;
            java.lang.String r0 = r1.osVersion
            return r0
    }

    public final java.lang.String getSessionSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.sessionSdkVersion
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.appId
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.deviceModel
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.sessionSdkVersion
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.osVersion
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.firebase.sessions.LogEnvironment r1 = r2.logEnvironment
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.firebase.sessions.AndroidApplicationInfo r1 = r2.androidAppInfo
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ApplicationInfo(appId="
            r0.append(r1)
            java.lang.String r1 = r2.appId
            r0.append(r1)
            java.lang.String r1 = ", deviceModel="
            r0.append(r1)
            java.lang.String r1 = r2.deviceModel
            r0.append(r1)
            java.lang.String r1 = ", sessionSdkVersion="
            r0.append(r1)
            java.lang.String r1 = r2.sessionSdkVersion
            r0.append(r1)
            java.lang.String r1 = ", osVersion="
            r0.append(r1)
            java.lang.String r1 = r2.osVersion
            r0.append(r1)
            java.lang.String r1 = ", logEnvironment="
            r0.append(r1)
            com.google.firebase.sessions.LogEnvironment r1 = r2.logEnvironment
            r0.append(r1)
            java.lang.String r1 = ", androidAppInfo="
            r0.append(r1)
            com.google.firebase.sessions.AndroidApplicationInfo r1 = r2.androidAppInfo
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
