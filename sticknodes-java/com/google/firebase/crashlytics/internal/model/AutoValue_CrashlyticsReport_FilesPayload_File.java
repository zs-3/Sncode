package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File {
    private final byte[] contents;
    private final java.lang.String filename;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder {
        private byte[] contents;
        private java.lang.String filename;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File build() {
                r4 = this;
                java.lang.String r0 = r4.filename
                if (r0 == 0) goto L10
                byte[] r1 = r4.contents
                if (r1 != 0) goto L9
                goto L10
            L9:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File r2 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File
                r3 = 0
                r2.<init>(r0, r1, r3)
                return r2
            L10:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r4.filename
                if (r1 != 0) goto L1e
                java.lang.String r1 = " filename"
                r0.append(r1)
            L1e:
                byte[] r1 = r4.contents
                if (r1 != 0) goto L27
                java.lang.String r1 = " contents"
                r0.append(r1)
            L27:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] r2) {
                r1 = this;
                java.lang.String r0 = "Null contents"
                java.util.Objects.requireNonNull(r2, r0)
                r1.contents = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setFilename(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null filename"
                java.util.Objects.requireNonNull(r2, r0)
                r1.filename = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_FilesPayload_File(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.filename = r1
            r0.contents = r2
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload_File(java.lang.String r1, byte[] r2, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File.AnonymousClass1 r3) {
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
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
            r2 = 0
            if (r1 == 0) goto L2f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File) r5
            java.lang.String r1 = r4.filename
            java.lang.String r3 = r5.getFilename()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2d
            byte[] r1 = r4.contents
            boolean r3 = r5 instanceof com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File
            if (r3 == 0) goto L22
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File r5 = (com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File) r5
            byte[] r5 = r5.contents
            goto L26
        L22:
            byte[] r5 = r5.getContents()
        L26:
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        L2f:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public byte[] getContents() {
            r1 = this;
            byte[] r0 = r1.contents
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public java.lang.String getFilename() {
            r1 = this;
            java.lang.String r0 = r1.filename
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.filename
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r1 = r2.contents
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "File{filename="
            r0.append(r1)
            java.lang.String r1 = r2.filename
            r0.append(r1)
            java.lang.String r1 = ", contents="
            r0.append(r1)
            byte[] r1 = r2.contents
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
