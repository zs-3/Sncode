package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application {
    private final java.lang.String developmentPlatform;
    private final java.lang.String developmentPlatformVersion;
    private final java.lang.String displayVersion;
    private final java.lang.String identifier;
    private final java.lang.String installationUuid;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization;
    private final java.lang.String version;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder {
        private java.lang.String developmentPlatform;
        private java.lang.String developmentPlatformVersion;
        private java.lang.String displayVersion;
        private java.lang.String identifier;
        private java.lang.String installationUuid;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization;
        private java.lang.String version;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application build() {
                r10 = this;
                java.lang.String r1 = r10.identifier
                if (r1 == 0) goto L1b
                java.lang.String r2 = r10.version
                if (r2 != 0) goto L9
                goto L1b
            L9:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application r9 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application
                java.lang.String r3 = r10.displayVersion
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r4 = r10.organization
                java.lang.String r5 = r10.installationUuid
                java.lang.String r6 = r10.developmentPlatform
                java.lang.String r7 = r10.developmentPlatformVersion
                r8 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
            L1b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r10.identifier
                if (r1 != 0) goto L29
                java.lang.String r1 = " identifier"
                r0.append(r1)
            L29:
                java.lang.String r1 = r10.version
                if (r1 != 0) goto L32
                java.lang.String r1 = " version"
                r0.append(r1)
            L32:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(java.lang.String r1) {
                r0 = this;
                r0.developmentPlatform = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(java.lang.String r1) {
                r0 = this;
                r0.developmentPlatformVersion = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDisplayVersion(java.lang.String r1) {
                r0 = this;
                r0.displayVersion = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setIdentifier(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null identifier"
                java.util.Objects.requireNonNull(r2, r0)
                r1.identifier = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setInstallationUuid(java.lang.String r1) {
                r0 = this;
                r0.installationUuid = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setVersion(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null version"
                java.util.Objects.requireNonNull(r2, r0)
                r1.version = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_Application(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.identifier = r1
            r0.version = r2
            r0.displayVersion = r3
            r0.organization = r4
            r0.installationUuid = r5
            r0.developmentPlatform = r6
            r0.developmentPlatformVersion = r7
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Application(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application.AnonymousClass1 r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
            r2 = 0
            if (r1 == 0) goto L8f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application) r5
            java.lang.String r1 = r4.identifier
            java.lang.String r3 = r5.getIdentifier()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8d
            java.lang.String r1 = r4.version
            java.lang.String r3 = r5.getVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8d
            java.lang.String r1 = r4.displayVersion
            if (r1 != 0) goto L2e
            java.lang.String r1 = r5.getDisplayVersion()
            if (r1 != 0) goto L8d
            goto L38
        L2e:
            java.lang.String r3 = r5.getDisplayVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8d
        L38:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r1 = r4.organization
            if (r1 != 0) goto L43
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r1 = r5.getOrganization()
            if (r1 != 0) goto L8d
            goto L4d
        L43:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r3 = r5.getOrganization()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8d
        L4d:
            java.lang.String r1 = r4.installationUuid
            if (r1 != 0) goto L58
            java.lang.String r1 = r5.getInstallationUuid()
            if (r1 != 0) goto L8d
            goto L62
        L58:
            java.lang.String r3 = r5.getInstallationUuid()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8d
        L62:
            java.lang.String r1 = r4.developmentPlatform
            if (r1 != 0) goto L6d
            java.lang.String r1 = r5.getDevelopmentPlatform()
            if (r1 != 0) goto L8d
            goto L77
        L6d:
            java.lang.String r3 = r5.getDevelopmentPlatform()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8d
        L77:
            java.lang.String r1 = r4.developmentPlatformVersion
            if (r1 != 0) goto L82
            java.lang.String r5 = r5.getDevelopmentPlatformVersion()
            if (r5 != 0) goto L8d
            goto L8e
        L82:
            java.lang.String r5 = r5.getDevelopmentPlatformVersion()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L8d
            goto L8e
        L8d:
            r0 = 0
        L8e:
            return r0
        L8f:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getDevelopmentPlatform() {
            r1 = this;
            java.lang.String r0 = r1.developmentPlatform
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getDevelopmentPlatformVersion() {
            r1 = this;
            java.lang.String r0 = r1.developmentPlatformVersion
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getDisplayVersion() {
            r1 = this;
            java.lang.String r0 = r1.displayVersion
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.identifier
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getInstallationUuid() {
            r1 = this;
            java.lang.String r0 = r1.installationUuid
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization getOrganization() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r0 = r1.organization
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.identifier
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r4.version
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.displayVersion
            r3 = 0
            if (r2 != 0) goto L1c
            r2 = 0
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r2 = r4.organization
            if (r2 != 0) goto L29
            r2 = 0
            goto L2d
        L29:
            int r2 = r2.hashCode()
        L2d:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.installationUuid
            if (r2 != 0) goto L36
            r2 = 0
            goto L3a
        L36:
            int r2 = r2.hashCode()
        L3a:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.developmentPlatform
            if (r2 != 0) goto L43
            r2 = 0
            goto L47
        L43:
            int r2 = r2.hashCode()
        L47:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r4.developmentPlatformVersion
            if (r1 != 0) goto L4f
            goto L53
        L4f:
            int r3 = r1.hashCode()
        L53:
            r0 = r0 ^ r3
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Application{identifier="
            r0.append(r1)
            java.lang.String r1 = r2.identifier
            r0.append(r1)
            java.lang.String r1 = ", version="
            r0.append(r1)
            java.lang.String r1 = r2.version
            r0.append(r1)
            java.lang.String r1 = ", displayVersion="
            r0.append(r1)
            java.lang.String r1 = r2.displayVersion
            r0.append(r1)
            java.lang.String r1 = ", organization="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r1 = r2.organization
            r0.append(r1)
            java.lang.String r1 = ", installationUuid="
            r0.append(r1)
            java.lang.String r1 = r2.installationUuid
            r0.append(r1)
            java.lang.String r1 = ", developmentPlatform="
            r0.append(r1)
            java.lang.String r1 = r2.developmentPlatform
            r0.append(r1)
            java.lang.String r1 = ", developmentPlatformVersion="
            r0.append(r1)
            java.lang.String r1 = r2.developmentPlatformVersion
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
