package com.google.firebase;

/* loaded from: classes2.dex */
public final class FirebaseOptions {
    private final java.lang.String apiKey;
    private final java.lang.String applicationId;
    private final java.lang.String databaseUrl;
    private final java.lang.String gaTrackingId;
    private final java.lang.String gcmSenderId;
    private final java.lang.String projectId;
    private final java.lang.String storageBucket;

    private FirebaseOptions(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r2 = this;
            r2.<init>()
            boolean r0 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r3)
            r0 = r0 ^ 1
            java.lang.String r1 = "ApplicationId must be set."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            r2.applicationId = r3
            r2.apiKey = r4
            r2.databaseUrl = r5
            r2.gaTrackingId = r6
            r2.gcmSenderId = r7
            r2.storageBucket = r8
            r2.projectId = r9
            return
    }

    public static com.google.firebase.FirebaseOptions fromResource(android.content.Context r9) {
            com.google.android.gms.common.internal.StringResourceValueReader r0 = new com.google.android.gms.common.internal.StringResourceValueReader
            r0.<init>(r9)
            java.lang.String r9 = "google_app_id"
            java.lang.String r2 = r0.getString(r9)
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 == 0) goto L13
            r9 = 0
            return r9
        L13:
            com.google.firebase.FirebaseOptions r9 = new com.google.firebase.FirebaseOptions
            java.lang.String r1 = "google_api_key"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "firebase_database_url"
            java.lang.String r4 = r0.getString(r1)
            java.lang.String r1 = "ga_trackingId"
            java.lang.String r5 = r0.getString(r1)
            java.lang.String r1 = "gcm_defaultSenderId"
            java.lang.String r6 = r0.getString(r1)
            java.lang.String r1 = "google_storage_bucket"
            java.lang.String r7 = r0.getString(r1)
            java.lang.String r1 = "project_id"
            java.lang.String r8 = r0.getString(r1)
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.firebase.FirebaseOptions
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.firebase.FirebaseOptions r4 = (com.google.firebase.FirebaseOptions) r4
            java.lang.String r0 = r3.applicationId
            java.lang.String r2 = r4.applicationId
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.apiKey
            java.lang.String r2 = r4.apiKey
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.databaseUrl
            java.lang.String r2 = r4.databaseUrl
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.gaTrackingId
            java.lang.String r2 = r4.gaTrackingId
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.gcmSenderId
            java.lang.String r2 = r4.gcmSenderId
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.storageBucket
            java.lang.String r2 = r4.storageBucket
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.projectId
            java.lang.String r4 = r4.projectId
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L4f
            r1 = 1
        L4f:
            return r1
    }

    public java.lang.String getApiKey() {
            r1 = this;
            java.lang.String r0 = r1.apiKey
            return r0
    }

    public java.lang.String getApplicationId() {
            r1 = this;
            java.lang.String r0 = r1.applicationId
            return r0
    }

    public java.lang.String getGcmSenderId() {
            r1 = this;
            java.lang.String r0 = r1.gcmSenderId
            return r0
    }

    public java.lang.String getProjectId() {
            r1 = this;
            java.lang.String r0 = r1.projectId
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.applicationId
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.apiKey
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.databaseUrl
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.gaTrackingId
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.gcmSenderId
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.storageBucket
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = r3.projectId
            r2 = 6
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.applicationId
            java.lang.String r2 = "applicationId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.apiKey
            java.lang.String r2 = "apiKey"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.databaseUrl
            java.lang.String r2 = "databaseUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.gcmSenderId
            java.lang.String r2 = "gcmSenderId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.storageBucket
            java.lang.String r2 = "storageBucket"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.projectId
            java.lang.String r2 = "projectId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
