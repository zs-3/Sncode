package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
final class AutoValue_InstallIdProvider_InstallIds extends com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds {
    private final java.lang.String crashlyticsInstallId;
    private final java.lang.String firebaseAuthenticationToken;
    private final java.lang.String firebaseInstallationId;

    AutoValue_InstallIdProvider_InstallIds(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null crashlyticsInstallId"
            java.util.Objects.requireNonNull(r2, r0)
            r1.crashlyticsInstallId = r2
            r1.firebaseInstallationId = r3
            r1.firebaseAuthenticationToken = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
            r2 = 0
            if (r1 == 0) goto L44
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r5 = (com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds) r5
            java.lang.String r1 = r4.crashlyticsInstallId
            java.lang.String r3 = r5.getCrashlyticsInstallId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L42
            java.lang.String r1 = r4.firebaseInstallationId
            if (r1 != 0) goto L22
            java.lang.String r1 = r5.getFirebaseInstallationId()
            if (r1 != 0) goto L42
            goto L2c
        L22:
            java.lang.String r3 = r5.getFirebaseInstallationId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L42
        L2c:
            java.lang.String r1 = r4.firebaseAuthenticationToken
            if (r1 != 0) goto L37
            java.lang.String r5 = r5.getFirebaseAuthenticationToken()
            if (r5 != 0) goto L42
            goto L43
        L37:
            java.lang.String r5 = r5.getFirebaseAuthenticationToken()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L42
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
        L44:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public java.lang.String getCrashlyticsInstallId() {
            r1 = this;
            java.lang.String r0 = r1.crashlyticsInstallId
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public java.lang.String getFirebaseAuthenticationToken() {
            r1 = this;
            java.lang.String r0 = r1.firebaseAuthenticationToken
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public java.lang.String getFirebaseInstallationId() {
            r1 = this;
            java.lang.String r0 = r1.firebaseInstallationId
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.crashlyticsInstallId
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r4.firebaseInstallationId
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r4.firebaseAuthenticationToken
            if (r1 != 0) goto L1f
            goto L23
        L1f:
            int r3 = r1.hashCode()
        L23:
            r0 = r0 ^ r3
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InstallIds{crashlyticsInstallId="
            r0.append(r1)
            java.lang.String r1 = r2.crashlyticsInstallId
            r0.append(r1)
            java.lang.String r1 = ", firebaseInstallationId="
            r0.append(r1)
            java.lang.String r1 = r2.firebaseInstallationId
            r0.append(r1)
            java.lang.String r1 = ", firebaseAuthenticationToken="
            r0.append(r1)
            java.lang.String r1 = r2.firebaseAuthenticationToken
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
