package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload {
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> files;
    private final java.lang.String orgId;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder {
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> files;
        private java.lang.String orgId;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload build() {
                r4 = this;
                java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File> r0 = r4.files
                if (r0 == 0) goto Ld
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload r1 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload
                java.lang.String r2 = r4.orgId
                r3 = 0
                r1.<init>(r0, r2, r3)
                return r1
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Missing required properties:"
                r1.append(r2)
                java.lang.String r2 = " files"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setFiles(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> r2) {
                r1 = this;
                java.lang.String r0 = "Null files"
                java.util.Objects.requireNonNull(r2, r0)
                r1.files = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setOrgId(java.lang.String r1) {
                r0 = this;
                r0.orgId = r1
                return r0
        }
    }

    private AutoValue_CrashlyticsReport_FilesPayload(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.files = r1
            r0.orgId = r2
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload(java.util.List r1, java.lang.String r2, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
            r2 = 0
            if (r1 == 0) goto L2f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload) r5
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File> r1 = r4.files
            java.util.List r3 = r5.getFiles()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2d
            java.lang.String r1 = r4.orgId
            if (r1 != 0) goto L22
            java.lang.String r5 = r5.getOrgId()
            if (r5 != 0) goto L2d
            goto L2e
        L22:
            java.lang.String r5 = r5.getOrgId()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        L2f:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> getFiles() {
            r1 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File> r0 = r1.files
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public java.lang.String getOrgId() {
            r1 = this;
            java.lang.String r0 = r1.orgId
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File> r0 = r2.files
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.orgId
            if (r1 != 0) goto L12
            r1 = 0
            goto L16
        L12:
            int r1 = r1.hashCode()
        L16:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FilesPayload{files="
            r0.append(r1)
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File> r1 = r2.files
            r0.append(r1)
            java.lang.String r1 = ", orgId="
            r0.append(r1)
            java.lang.String r1 = r2.orgId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
