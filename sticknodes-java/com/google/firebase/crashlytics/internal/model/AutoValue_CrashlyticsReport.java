package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo appExitInfo;
    private final java.lang.String appQualitySessionId;
    private final java.lang.String buildVersion;
    private final java.lang.String displayVersion;
    private final java.lang.String firebaseAuthenticationToken;
    private final java.lang.String firebaseInstallationId;
    private final java.lang.String gmpAppId;
    private final java.lang.String installationUuid;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload ndkPayload;
    private final int platform;
    private final java.lang.String sdkVersion;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder {
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo appExitInfo;
        private java.lang.String appQualitySessionId;
        private java.lang.String buildVersion;
        private java.lang.String displayVersion;
        private java.lang.String firebaseAuthenticationToken;
        private java.lang.String firebaseInstallationId;
        private java.lang.String gmpAppId;
        private java.lang.String installationUuid;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload ndkPayload;
        private int platform;
        private java.lang.String sdkVersion;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session;
        private byte set$0;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.getSdkVersion()
                r1.sdkVersion = r0
                java.lang.String r0 = r2.getGmpAppId()
                r1.gmpAppId = r0
                int r0 = r2.getPlatform()
                r1.platform = r0
                java.lang.String r0 = r2.getInstallationUuid()
                r1.installationUuid = r0
                java.lang.String r0 = r2.getFirebaseInstallationId()
                r1.firebaseInstallationId = r0
                java.lang.String r0 = r2.getFirebaseAuthenticationToken()
                r1.firebaseAuthenticationToken = r0
                java.lang.String r0 = r2.getAppQualitySessionId()
                r1.appQualitySessionId = r0
                java.lang.String r0 = r2.getBuildVersion()
                r1.buildVersion = r0
                java.lang.String r0 = r2.getDisplayVersion()
                r1.displayVersion = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r2.getSession()
                r1.session = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r0 = r2.getNdkPayload()
                r1.ndkPayload = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r2 = r2.getAppExitInfo()
                r1.appExitInfo = r2
                r2 = 1
                r1.set$0 = r2
                return
        }

        /* synthetic */ Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport build() {
                r17 = this;
                r0 = r17
                byte r1 = r0.set$0
                r2 = 1
                if (r1 != r2) goto L3d
                java.lang.String r1 = r0.sdkVersion
                if (r1 == 0) goto L3d
                java.lang.String r1 = r0.gmpAppId
                if (r1 == 0) goto L3d
                java.lang.String r1 = r0.installationUuid
                if (r1 == 0) goto L3d
                java.lang.String r1 = r0.buildVersion
                if (r1 == 0) goto L3d
                java.lang.String r1 = r0.displayVersion
                if (r1 != 0) goto L1c
                goto L3d
            L1c:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport r1 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport
                java.lang.String r4 = r0.sdkVersion
                java.lang.String r5 = r0.gmpAppId
                int r6 = r0.platform
                java.lang.String r7 = r0.installationUuid
                java.lang.String r8 = r0.firebaseInstallationId
                java.lang.String r9 = r0.firebaseAuthenticationToken
                java.lang.String r10 = r0.appQualitySessionId
                java.lang.String r11 = r0.buildVersion
                java.lang.String r12 = r0.displayVersion
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r13 = r0.session
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r14 = r0.ndkPayload
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r15 = r0.appExitInfo
                r16 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r1
            L3d:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r0.sdkVersion
                if (r3 != 0) goto L4b
                java.lang.String r3 = " sdkVersion"
                r1.append(r3)
            L4b:
                java.lang.String r3 = r0.gmpAppId
                if (r3 != 0) goto L54
                java.lang.String r3 = " gmpAppId"
                r1.append(r3)
            L54:
                byte r3 = r0.set$0
                r2 = r2 & r3
                if (r2 != 0) goto L5e
                java.lang.String r2 = " platform"
                r1.append(r2)
            L5e:
                java.lang.String r2 = r0.installationUuid
                if (r2 != 0) goto L67
                java.lang.String r2 = " installationUuid"
                r1.append(r2)
            L67:
                java.lang.String r2 = r0.buildVersion
                if (r2 != 0) goto L70
                java.lang.String r2 = " buildVersion"
                r1.append(r2)
            L70:
                java.lang.String r2 = r0.displayVersion
                if (r2 != 0) goto L79
                java.lang.String r2 = " displayVersion"
                r1.append(r2)
            L79:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Missing required properties:"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setAppExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r1) {
                r0 = this;
                r0.appExitInfo = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setAppQualitySessionId(java.lang.String r1) {
                r0 = this;
                r0.appQualitySessionId = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setBuildVersion(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null buildVersion"
                java.util.Objects.requireNonNull(r2, r0)
                r1.buildVersion = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setDisplayVersion(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null displayVersion"
                java.util.Objects.requireNonNull(r2, r0)
                r1.displayVersion = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setFirebaseAuthenticationToken(java.lang.String r1) {
                r0 = this;
                r0.firebaseAuthenticationToken = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setFirebaseInstallationId(java.lang.String r1) {
                r0 = this;
                r0.firebaseInstallationId = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setGmpAppId(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null gmpAppId"
                java.util.Objects.requireNonNull(r2, r0)
                r1.gmpAppId = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setInstallationUuid(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null installationUuid"
                java.util.Objects.requireNonNull(r2, r0)
                r1.installationUuid = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setNdkPayload(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload r1) {
                r0 = this;
                r0.ndkPayload = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setPlatform(int r1) {
                r0 = this;
                r0.platform = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSdkVersion(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null sdkVersion"
                java.util.Objects.requireNonNull(r2, r0)
                r1.sdkVersion = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSession(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session r1) {
                r0 = this;
                r0.session = r1
                return r0
        }
    }

    private AutoValue_CrashlyticsReport(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session r10, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload r11, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r12) {
            r0 = this;
            r0.<init>()
            r0.sdkVersion = r1
            r0.gmpAppId = r2
            r0.platform = r3
            r0.installationUuid = r4
            r0.firebaseInstallationId = r5
            r0.firebaseAuthenticationToken = r6
            r0.appQualitySessionId = r7
            r0.buildVersion = r8
            r0.displayVersion = r9
            r0.session = r10
            r0.ndkPayload = r11
            r0.appExitInfo = r12
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session r10, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload r11, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r12, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.AnonymousClass1 r13) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport
            r2 = 0
            if (r1 == 0) goto Ld0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport) r5
            java.lang.String r1 = r4.sdkVersion
            java.lang.String r3 = r5.getSdkVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
            java.lang.String r1 = r4.gmpAppId
            java.lang.String r3 = r5.getGmpAppId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
            int r1 = r4.platform
            int r3 = r5.getPlatform()
            if (r1 != r3) goto Lce
            java.lang.String r1 = r4.installationUuid
            java.lang.String r3 = r5.getInstallationUuid()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
            java.lang.String r1 = r4.firebaseInstallationId
            if (r1 != 0) goto L42
            java.lang.String r1 = r5.getFirebaseInstallationId()
            if (r1 != 0) goto Lce
            goto L4c
        L42:
            java.lang.String r3 = r5.getFirebaseInstallationId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
        L4c:
            java.lang.String r1 = r4.firebaseAuthenticationToken
            if (r1 != 0) goto L57
            java.lang.String r1 = r5.getFirebaseAuthenticationToken()
            if (r1 != 0) goto Lce
            goto L61
        L57:
            java.lang.String r3 = r5.getFirebaseAuthenticationToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
        L61:
            java.lang.String r1 = r4.appQualitySessionId
            if (r1 != 0) goto L6c
            java.lang.String r1 = r5.getAppQualitySessionId()
            if (r1 != 0) goto Lce
            goto L76
        L6c:
            java.lang.String r3 = r5.getAppQualitySessionId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
        L76:
            java.lang.String r1 = r4.buildVersion
            java.lang.String r3 = r5.getBuildVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
            java.lang.String r1 = r4.displayVersion
            java.lang.String r3 = r5.getDisplayVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r4.session
            if (r1 != 0) goto L99
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r5.getSession()
            if (r1 != 0) goto Lce
            goto La3
        L99:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r3 = r5.getSession()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
        La3:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r1 = r4.ndkPayload
            if (r1 != 0) goto Lae
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r1 = r5.getNdkPayload()
            if (r1 != 0) goto Lce
            goto Lb8
        Lae:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r3 = r5.getNdkPayload()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
        Lb8:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r1 = r4.appExitInfo
            if (r1 != 0) goto Lc3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r5 = r5.getAppExitInfo()
            if (r5 != 0) goto Lce
            goto Lcf
        Lc3:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r5 = r5.getAppExitInfo()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto Lce
            goto Lcf
        Lce:
            r0 = 0
        Lcf:
            return r0
        Ld0:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r0 = r1.appExitInfo
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getAppQualitySessionId() {
            r1 = this;
            java.lang.String r0 = r1.appQualitySessionId
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getBuildVersion() {
            r1 = this;
            java.lang.String r0 = r1.buildVersion
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getDisplayVersion() {
            r1 = this;
            java.lang.String r0 = r1.displayVersion
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getFirebaseAuthenticationToken() {
            r1 = this;
            java.lang.String r0 = r1.firebaseAuthenticationToken
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getFirebaseInstallationId() {
            r1 = this;
            java.lang.String r0 = r1.firebaseInstallationId
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getGmpAppId() {
            r1 = this;
            java.lang.String r0 = r1.gmpAppId
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getInstallationUuid() {
            r1 = this;
            java.lang.String r0 = r1.installationUuid
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload getNdkPayload() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r0 = r1.ndkPayload
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int getPlatform() {
            r1 = this;
            int r0 = r1.platform
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.sdkVersion
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session getSession() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r1.session
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.sdkVersion
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r4.gmpAppId
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r4.platform
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.installationUuid
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.firebaseInstallationId
            r3 = 0
            if (r2 != 0) goto L2a
            r2 = 0
            goto L2e
        L2a:
            int r2 = r2.hashCode()
        L2e:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.firebaseAuthenticationToken
            if (r2 != 0) goto L37
            r2 = 0
            goto L3b
        L37:
            int r2 = r2.hashCode()
        L3b:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.appQualitySessionId
            if (r2 != 0) goto L44
            r2 = 0
            goto L48
        L44:
            int r2 = r2.hashCode()
        L48:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.buildVersion
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.displayVersion
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r2 = r4.session
            if (r2 != 0) goto L63
            r2 = 0
            goto L67
        L63:
            int r2 = r2.hashCode()
        L67:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r2 = r4.ndkPayload
            if (r2 != 0) goto L70
            r2 = 0
            goto L74
        L70:
            int r2 = r2.hashCode()
        L74:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r1 = r4.appExitInfo
            if (r1 != 0) goto L7c
            goto L80
        L7c:
            int r3 = r1.hashCode()
        L80:
            r0 = r0 ^ r3
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    protected com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder toBuilder() {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CrashlyticsReport{sdkVersion="
            r0.append(r1)
            java.lang.String r1 = r2.sdkVersion
            r0.append(r1)
            java.lang.String r1 = ", gmpAppId="
            r0.append(r1)
            java.lang.String r1 = r2.gmpAppId
            r0.append(r1)
            java.lang.String r1 = ", platform="
            r0.append(r1)
            int r1 = r2.platform
            r0.append(r1)
            java.lang.String r1 = ", installationUuid="
            r0.append(r1)
            java.lang.String r1 = r2.installationUuid
            r0.append(r1)
            java.lang.String r1 = ", firebaseInstallationId="
            r0.append(r1)
            java.lang.String r1 = r2.firebaseInstallationId
            r0.append(r1)
            java.lang.String r1 = ", firebaseAuthenticationToken="
            r0.append(r1)
            java.lang.String r1 = r2.firebaseAuthenticationToken
            r0.append(r1)
            java.lang.String r1 = ", appQualitySessionId="
            r0.append(r1)
            java.lang.String r1 = r2.appQualitySessionId
            r0.append(r1)
            java.lang.String r1 = ", buildVersion="
            r0.append(r1)
            java.lang.String r1 = r2.buildVersion
            r0.append(r1)
            java.lang.String r1 = ", displayVersion="
            r0.append(r1)
            java.lang.String r1 = r2.displayVersion
            r0.append(r1)
            java.lang.String r1 = ", session="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r2.session
            r0.append(r1)
            java.lang.String r1 = ", ndkPayload="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r1 = r2.ndkPayload
            r0.append(r1)
            java.lang.String r1 = ", appExitInfo="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r1 = r2.appExitInfo
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
