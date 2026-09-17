package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_StaticSessionData_OsData extends com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData {
    private final boolean isRooted;
    private final java.lang.String osCodeName;
    private final java.lang.String osRelease;

    AutoValue_StaticSessionData_OsData(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null osRelease"
            java.util.Objects.requireNonNull(r2, r0)
            r1.osRelease = r2
            java.lang.String r2 = "Null osCodeName"
            java.util.Objects.requireNonNull(r3, r2)
            r1.osCodeName = r3
            r1.isRooted = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
            r2 = 0
            if (r1 == 0) goto L2e
            com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData r5 = (com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData) r5
            java.lang.String r1 = r4.osRelease
            java.lang.String r3 = r5.osRelease()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            java.lang.String r1 = r4.osCodeName
            java.lang.String r3 = r5.osCodeName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            boolean r1 = r4.isRooted
            boolean r5 = r5.isRooted()
            if (r1 != r5) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            return r2
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.osRelease
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.osCodeName
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r1 = r3.isRooted
            if (r1 == 0) goto L1c
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L1e
        L1c:
            r1 = 1237(0x4d5, float:1.733E-42)
        L1e:
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
            r1 = this;
            boolean r0 = r1.isRooted
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public java.lang.String osCodeName() {
            r1 = this;
            java.lang.String r0 = r1.osCodeName
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public java.lang.String osRelease() {
            r1 = this;
            java.lang.String r0 = r1.osRelease
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OsData{osRelease="
            r0.append(r1)
            java.lang.String r1 = r2.osRelease
            r0.append(r1)
            java.lang.String r1 = ", osCodeName="
            r0.append(r1)
            java.lang.String r1 = r2.osCodeName
            r0.append(r1)
            java.lang.String r1 = ", isRooted="
            r0.append(r1)
            boolean r1 = r2.isRooted
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
