package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {
    private final java.lang.String arch;
    private final java.lang.String buildId;
    private final java.lang.String libraryName;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {
        private java.lang.String arch;
        private java.lang.String buildId;
        private java.lang.String libraryName;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
                r5 = this;
                java.lang.String r0 = r5.arch
                if (r0 == 0) goto L14
                java.lang.String r1 = r5.libraryName
                if (r1 == 0) goto L14
                java.lang.String r2 = r5.buildId
                if (r2 != 0) goto Ld
                goto L14
            Ld:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch r3 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch
                r4 = 0
                r3.<init>(r0, r1, r2, r4)
                return r3
            L14:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.arch
                if (r1 != 0) goto L22
                java.lang.String r1 = " arch"
                r0.append(r1)
            L22:
                java.lang.String r1 = r5.libraryName
                if (r1 != 0) goto L2b
                java.lang.String r1 = " libraryName"
                r0.append(r1)
            L2b:
                java.lang.String r1 = r5.buildId
                if (r1 != 0) goto L34
                java.lang.String r1 = " buildId"
                r0.append(r1)
            L34:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null arch"
                java.util.Objects.requireNonNull(r2, r0)
                r1.arch = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null buildId"
                java.util.Objects.requireNonNull(r2, r0)
                r1.buildId = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null libraryName"
                java.util.Objects.requireNonNull(r2, r0)
                r1.libraryName = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.arch = r1
            r0.libraryName = r2
            r0.buildId = r3
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
            r2 = 0
            if (r1 == 0) goto L32
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) r5
            java.lang.String r1 = r4.arch
            java.lang.String r3 = r5.getArch()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            java.lang.String r1 = r4.libraryName
            java.lang.String r3 = r5.getLibraryName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            java.lang.String r1 = r4.buildId
            java.lang.String r5 = r5.getBuildId()
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

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public java.lang.String getArch() {
            r1 = this;
            java.lang.String r0 = r1.arch
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public java.lang.String getBuildId() {
            r1 = this;
            java.lang.String r0 = r1.buildId
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public java.lang.String getLibraryName() {
            r1 = this;
            java.lang.String r0 = r1.libraryName
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.arch
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.libraryName
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r3.buildId
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BuildIdMappingForArch{arch="
            r0.append(r1)
            java.lang.String r1 = r2.arch
            r0.append(r1)
            java.lang.String r1 = ", libraryName="
            r0.append(r1)
            java.lang.String r1 = r2.libraryName
            r0.append(r1)
            java.lang.String r1 = ", buildId="
            r0.append(r1)
            java.lang.String r1 = r2.buildId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
