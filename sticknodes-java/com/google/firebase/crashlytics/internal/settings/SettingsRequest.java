package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
class SettingsRequest {
    public final java.lang.String buildVersion;
    public final java.lang.String deviceModel;
    public final java.lang.String displayVersion;
    public final java.lang.String googleAppId;
    public final com.google.firebase.crashlytics.internal.common.InstallIdProvider installIdProvider;
    public final java.lang.String instanceId;
    public final java.lang.String osBuildVersion;
    public final java.lang.String osDisplayVersion;
    public final int source;

    public SettingsRequest(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, com.google.firebase.crashlytics.internal.common.InstallIdProvider r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9) {
            r0 = this;
            r0.<init>()
            r0.googleAppId = r1
            r0.deviceModel = r2
            r0.osBuildVersion = r3
            r0.osDisplayVersion = r4
            r0.installIdProvider = r5
            r0.instanceId = r6
            r0.displayVersion = r7
            r0.buildVersion = r8
            r0.source = r9
            return
    }
}
