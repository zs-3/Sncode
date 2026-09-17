package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_StaticSessionData extends com.google.firebase.crashlytics.internal.model.StaticSessionData {
    private final com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData;
    private final com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData deviceData;
    private final com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData;

    AutoValue_StaticSessionData(com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData r2, com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData r3, com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null appData"
            java.util.Objects.requireNonNull(r2, r0)
            r1.appData = r2
            java.lang.String r2 = "Null osData"
            java.util.Objects.requireNonNull(r3, r2)
            r1.osData = r3
            java.lang.String r2 = "Null deviceData"
            java.util.Objects.requireNonNull(r4, r2)
            r1.deviceData = r4
            return
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData r0 = r1.appData
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData deviceData() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData r0 = r1.deviceData
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.StaticSessionData
            r2 = 0
            if (r1 == 0) goto L32
            com.google.firebase.crashlytics.internal.model.StaticSessionData r5 = (com.google.firebase.crashlytics.internal.model.StaticSessionData) r5
            com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData r1 = r4.appData
            com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData r3 = r5.appData()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData r1 = r4.osData
            com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData r3 = r5.osData()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData r1 = r4.deviceData
            com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData r5 = r5.deviceData()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
        L32:
            return r2
    }

    public int hashCode() {
            r3 = this;
            com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData r0 = r3.appData
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData r2 = r3.osData
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData r1 = r3.deviceData
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData r0 = r1.osData
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "StaticSessionData{appData="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData r1 = r2.appData
            r0.append(r1)
            java.lang.String r1 = ", osData="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData r1 = r2.osData
            r0.append(r1)
            java.lang.String r1 = ", deviceData="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData r1 = r2.deviceData
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
