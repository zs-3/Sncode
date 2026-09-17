package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem {
    private final java.lang.String buildVersion;
    private final boolean jailbroken;
    private final int platform;
    private final java.lang.String version;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder {
        private java.lang.String buildVersion;
        private boolean jailbroken;
        private int platform;
        private byte set$0;
        private java.lang.String version;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem build() {
                r8 = this;
                byte r0 = r8.set$0
                r1 = 3
                if (r0 != r1) goto L1a
                java.lang.String r4 = r8.version
                if (r4 == 0) goto L1a
                java.lang.String r5 = r8.buildVersion
                if (r5 != 0) goto Le
                goto L1a
            Le:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem
                int r3 = r8.platform
                boolean r6 = r8.jailbroken
                r7 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                return r0
            L1a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                byte r1 = r8.set$0
                r1 = r1 & 1
                if (r1 != 0) goto L2a
                java.lang.String r1 = " platform"
                r0.append(r1)
            L2a:
                java.lang.String r1 = r8.version
                if (r1 != 0) goto L33
                java.lang.String r1 = " version"
                r0.append(r1)
            L33:
                java.lang.String r1 = r8.buildVersion
                if (r1 != 0) goto L3c
                java.lang.String r1 = " buildVersion"
                r0.append(r1)
            L3c:
                byte r1 = r8.set$0
                r1 = r1 & 2
                if (r1 != 0) goto L47
                java.lang.String r1 = " jailbroken"
                r0.append(r1)
            L47:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null buildVersion"
                java.util.Objects.requireNonNull(r2, r0)
                r1.buildVersion = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean r1) {
                r0 = this;
                r0.jailbroken = r1
                byte r1 = r0.set$0
                r1 = r1 | 2
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int r1) {
                r0 = this;
                r0.platform = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setVersion(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null version"
                java.util.Objects.requireNonNull(r2, r0)
                r1.version = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_OperatingSystem(int r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.platform = r1
            r0.version = r2
            r0.buildVersion = r3
            r0.jailbroken = r4
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_OperatingSystem(int r1, java.lang.String r2, java.lang.String r3, boolean r4, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
            r2 = 0
            if (r1 == 0) goto L36
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem) r5
            int r1 = r4.platform
            int r3 = r5.getPlatform()
            if (r1 != r3) goto L34
            java.lang.String r1 = r4.version
            java.lang.String r3 = r5.getVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            java.lang.String r1 = r4.buildVersion
            java.lang.String r3 = r5.getBuildVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            boolean r1 = r4.jailbroken
            boolean r5 = r5.isJailbroken()
            if (r1 != r5) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
        L36:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public java.lang.String getBuildVersion() {
            r1 = this;
            java.lang.String r0 = r1.buildVersion
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public int getPlatform() {
            r1 = this;
            int r0 = r1.platform
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.platform
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.version
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.buildVersion
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r1 = r3.jailbroken
            if (r1 == 0) goto L21
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L23
        L21:
            r1 = 1237(0x4d5, float:1.733E-42)
        L23:
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public boolean isJailbroken() {
            r1 = this;
            boolean r0 = r1.jailbroken
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OperatingSystem{platform="
            r0.append(r1)
            int r1 = r2.platform
            r0.append(r1)
            java.lang.String r1 = ", version="
            r0.append(r1)
            java.lang.String r1 = r2.version
            r0.append(r1)
            java.lang.String r1 = ", buildVersion="
            r0.append(r1)
            java.lang.String r1 = r2.buildVersion
            r0.append(r1)
            java.lang.String r1 = ", jailbroken="
            r0.append(r1)
            boolean r1 = r2.jailbroken
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
