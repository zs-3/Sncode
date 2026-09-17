package com.google.firebase.crashlytics.internal.common;

/* compiled from: FirebaseInstallationId.kt */
/* loaded from: classes2.dex */
public final class FirebaseInstallationId {
    private final java.lang.String authToken;
    private final java.lang.String fid;

    public FirebaseInstallationId(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.fid = r1
            r0.authToken = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.common.FirebaseInstallationId
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.crashlytics.internal.common.FirebaseInstallationId r5 = (com.google.firebase.crashlytics.internal.common.FirebaseInstallationId) r5
            java.lang.String r1 = r4.fid
            java.lang.String r3 = r5.fid
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.authToken
            java.lang.String r5 = r5.authToken
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getAuthToken() {
            r1 = this;
            java.lang.String r0 = r1.authToken
            return r0
    }

    public final java.lang.String getFid() {
            r1 = this;
            java.lang.String r0 = r1.fid
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.fid
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.authToken
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FirebaseInstallationId(fid="
            r0.append(r1)
            java.lang.String r1 = r2.fid
            r0.append(r1)
            java.lang.String r1 = ", authToken="
            r0.append(r1)
            java.lang.String r1 = r2.authToken
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
