package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_StaticSessionData_AppData extends com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData {
    private final java.lang.String appIdentifier;
    private final int deliveryMechanism;
    private final com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider;
    private final java.lang.String installUuid;
    private final java.lang.String versionCode;
    private final java.lang.String versionName;

    AutoValue_StaticSessionData_AppData(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r7) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null appIdentifier"
            java.util.Objects.requireNonNull(r2, r0)
            r1.appIdentifier = r2
            java.lang.String r2 = "Null versionCode"
            java.util.Objects.requireNonNull(r3, r2)
            r1.versionCode = r3
            java.lang.String r2 = "Null versionName"
            java.util.Objects.requireNonNull(r4, r2)
            r1.versionName = r4
            java.lang.String r2 = "Null installUuid"
            java.util.Objects.requireNonNull(r5, r2)
            r1.installUuid = r5
            r1.deliveryMechanism = r6
            java.lang.String r2 = "Null developmentPlatformProvider"
            java.util.Objects.requireNonNull(r7, r2)
            r1.developmentPlatformProvider = r7
            return
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public java.lang.String appIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.appIdentifier
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
            r1 = this;
            int r0 = r1.deliveryMechanism
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider() {
            r1 = this;
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r0 = r1.developmentPlatformProvider
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
            r2 = 0
            if (r1 == 0) goto L52
            com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData r5 = (com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData) r5
            java.lang.String r1 = r4.appIdentifier
            java.lang.String r3 = r5.appIdentifier()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            java.lang.String r1 = r4.versionCode
            java.lang.String r3 = r5.versionCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            java.lang.String r1 = r4.versionName
            java.lang.String r3 = r5.versionName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            java.lang.String r1 = r4.installUuid
            java.lang.String r3 = r5.installUuid()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            int r1 = r4.deliveryMechanism
            int r3 = r5.deliveryMechanism()
            if (r1 != r3) goto L50
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r1 = r4.developmentPlatformProvider
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r5 = r5.developmentPlatformProvider()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L50
            goto L51
        L50:
            r0 = 0
        L51:
            return r0
        L52:
            return r2
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.appIdentifier
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.versionCode
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.versionName
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.installUuid
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.deliveryMechanism
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r1 = r3.developmentPlatformProvider
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public java.lang.String installUuid() {
            r1 = this;
            java.lang.String r0 = r1.installUuid
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AppData{appIdentifier="
            r0.append(r1)
            java.lang.String r1 = r2.appIdentifier
            r0.append(r1)
            java.lang.String r1 = ", versionCode="
            r0.append(r1)
            java.lang.String r1 = r2.versionCode
            r0.append(r1)
            java.lang.String r1 = ", versionName="
            r0.append(r1)
            java.lang.String r1 = r2.versionName
            r0.append(r1)
            java.lang.String r1 = ", installUuid="
            r0.append(r1)
            java.lang.String r1 = r2.installUuid
            r0.append(r1)
            java.lang.String r1 = ", deliveryMechanism="
            r0.append(r1)
            int r1 = r2.deliveryMechanism
            r0.append(r1)
            java.lang.String r1 = ", developmentPlatformProvider="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r1 = r2.developmentPlatformProvider
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public java.lang.String versionCode() {
            r1 = this;
            java.lang.String r0 = r1.versionCode
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public java.lang.String versionName() {
            r1 = this;
            java.lang.String r0 = r1.versionName
            return r0
    }
}
