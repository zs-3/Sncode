package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
public final class AutoCrashlyticsReportEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final com.google.firebase.encoders.config.Configurator CONFIG = null;

    private static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {
        private static final com.google.firebase.encoders.FieldDescriptor ARCH_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor BUILDID_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LIBRARYNAME_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.INSTANCE = r0
                java.lang.String r0 = "arch"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.ARCH_DESCRIPTOR = r0
                java.lang.String r0 = "libraryName"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.LIBRARYNAME_DESCRIPTOR = r0
                java.lang.String r0 = "buildId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.BUILDID_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.ARCH_DESCRIPTOR
                java.lang.String r1 = r3.getArch()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.LIBRARYNAME_DESCRIPTOR
                java.lang.String r1 = r3.getLibraryName()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.BUILDID_DESCRIPTOR
                java.lang.String r3 = r3.getBuildId()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportApplicationExitInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo> {
        private static final com.google.firebase.encoders.FieldDescriptor BUILDIDMAPPINGFORARCH_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor PID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PROCESSNAME_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PSS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor REASONCODE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor RSS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor TIMESTAMP_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor TRACEFILE_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "pid"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.PID_DESCRIPTOR = r0
                java.lang.String r0 = "processName"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.PROCESSNAME_DESCRIPTOR = r0
                java.lang.String r0 = "reasonCode"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.REASONCODE_DESCRIPTOR = r0
                java.lang.String r0 = "importance"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.IMPORTANCE_DESCRIPTOR = r0
                java.lang.String r0 = "pss"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.PSS_DESCRIPTOR = r0
                java.lang.String r0 = "rss"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.RSS_DESCRIPTOR = r0
                java.lang.String r0 = "timestamp"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.TIMESTAMP_DESCRIPTOR = r0
                java.lang.String r0 = "traceFile"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.TRACEFILE_DESCRIPTOR = r0
                java.lang.String r0 = "buildIdMappingForArch"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.BUILDIDMAPPINGFORARCH_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportApplicationExitInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.PID_DESCRIPTOR
                int r1 = r4.getPid()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.PROCESSNAME_DESCRIPTOR
                java.lang.String r1 = r4.getProcessName()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.REASONCODE_DESCRIPTOR
                int r1 = r4.getReasonCode()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.IMPORTANCE_DESCRIPTOR
                int r1 = r4.getImportance()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.PSS_DESCRIPTOR
                long r1 = r4.getPss()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.RSS_DESCRIPTOR
                long r1 = r4.getRss()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.TIMESTAMP_DESCRIPTOR
                long r1 = r4.getTimestamp()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.TRACEFILE_DESCRIPTOR
                java.lang.String r1 = r4.getTraceFile()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.BUILDIDMAPPINGFORARCH_DESCRIPTOR
                java.util.List r4 = r4.getBuildIdMappingForArch()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportCustomAttributeEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor KEY_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor VALUE_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportCustomAttributeEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportCustomAttributeEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder.INSTANCE = r0
                java.lang.String r0 = "key"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder.KEY_DESCRIPTOR = r0
                java.lang.String r0 = "value"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder.VALUE_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportCustomAttributeEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder.KEY_DESCRIPTOR
                java.lang.String r1 = r3.getKey()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder.VALUE_DESCRIPTOR
                java.lang.String r3 = r3.getValue()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> {
        private static final com.google.firebase.encoders.FieldDescriptor APPEXITINFO_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor APPQUALITYSESSIONID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor BUILDVERSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DISPLAYVERSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor FIREBASEINSTALLATIONID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor GMPAPPID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor INSTALLATIONUUID_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor NDKPAYLOAD_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PLATFORM_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SDKVERSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SESSION_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.INSTANCE = r0
                java.lang.String r0 = "sdkVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.SDKVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "gmpAppId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.GMPAPPID_DESCRIPTOR = r0
                java.lang.String r0 = "platform"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.PLATFORM_DESCRIPTOR = r0
                java.lang.String r0 = "installationUuid"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.INSTALLATIONUUID_DESCRIPTOR = r0
                java.lang.String r0 = "firebaseInstallationId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.FIREBASEINSTALLATIONID_DESCRIPTOR = r0
                java.lang.String r0 = "firebaseAuthenticationToken"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = r0
                java.lang.String r0 = "appQualitySessionId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.APPQUALITYSESSIONID_DESCRIPTOR = r0
                java.lang.String r0 = "buildVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.BUILDVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "displayVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.DISPLAYVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "session"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.SESSION_DESCRIPTOR = r0
                java.lang.String r0 = "ndkPayload"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.NDKPAYLOAD_DESCRIPTOR = r0
                java.lang.String r0 = "appExitInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.APPEXITINFO_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.SDKVERSION_DESCRIPTOR
                java.lang.String r1 = r3.getSdkVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.GMPAPPID_DESCRIPTOR
                java.lang.String r1 = r3.getGmpAppId()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.PLATFORM_DESCRIPTOR
                int r1 = r3.getPlatform()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.INSTALLATIONUUID_DESCRIPTOR
                java.lang.String r1 = r3.getInstallationUuid()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.FIREBASEINSTALLATIONID_DESCRIPTOR
                java.lang.String r1 = r3.getFirebaseInstallationId()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR
                java.lang.String r1 = r3.getFirebaseAuthenticationToken()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.APPQUALITYSESSIONID_DESCRIPTOR
                java.lang.String r1 = r3.getAppQualitySessionId()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.BUILDVERSION_DESCRIPTOR
                java.lang.String r1 = r3.getBuildVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.DISPLAYVERSION_DESCRIPTOR
                java.lang.String r1 = r3.getDisplayVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.SESSION_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r3.getSession()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.NDKPAYLOAD_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r1 = r3.getNdkPayload()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.APPEXITINFO_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r3 = r3.getAppExitInfo()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportFilesPayloadEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload> {
        private static final com.google.firebase.encoders.FieldDescriptor FILES_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor ORGID_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder.INSTANCE = r0
                java.lang.String r0 = "files"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder.FILES_DESCRIPTOR = r0
                java.lang.String r0 = "orgId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder.ORGID_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportFilesPayloadEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder.FILES_DESCRIPTOR
                java.util.List r1 = r3.getFiles()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder.ORGID_DESCRIPTOR
                java.lang.String r3 = r3.getOrgId()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportFilesPayloadFileEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> {
        private static final com.google.firebase.encoders.FieldDescriptor CONTENTS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor FILENAME_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder INSTANCE = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadFileEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadFileEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder.INSTANCE = r0
                java.lang.String r0 = "filename"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder.FILENAME_DESCRIPTOR = r0
                java.lang.String r0 = "contents"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder.CONTENTS_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportFilesPayloadFileEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder.FILENAME_DESCRIPTOR
                java.lang.String r1 = r3.getFilename()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder.CONTENTS_DESCRIPTOR
                byte[] r3 = r3.getContents()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionApplicationEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application> {
        private static final com.google.firebase.encoders.FieldDescriptor DEVELOPMENTPLATFORMVERSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DEVELOPMENTPLATFORM_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DISPLAYVERSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor IDENTIFIER_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor INSTALLATIONUUID_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor ORGANIZATION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor VERSION_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionApplicationEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionApplicationEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.INSTANCE = r0
                java.lang.String r0 = "identifier"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.IDENTIFIER_DESCRIPTOR = r0
                java.lang.String r0 = "version"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.VERSION_DESCRIPTOR = r0
                java.lang.String r0 = "displayVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.DISPLAYVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "organization"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.ORGANIZATION_DESCRIPTOR = r0
                java.lang.String r0 = "installationUuid"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.INSTALLATIONUUID_DESCRIPTOR = r0
                java.lang.String r0 = "developmentPlatform"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.DEVELOPMENTPLATFORM_DESCRIPTOR = r0
                java.lang.String r0 = "developmentPlatformVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.DEVELOPMENTPLATFORMVERSION_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionApplicationEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.IDENTIFIER_DESCRIPTOR
                java.lang.String r1 = r3.getIdentifier()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.VERSION_DESCRIPTOR
                java.lang.String r1 = r3.getVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.DISPLAYVERSION_DESCRIPTOR
                java.lang.String r1 = r3.getDisplayVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.ORGANIZATION_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r1 = r3.getOrganization()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.INSTALLATIONUUID_DESCRIPTOR
                java.lang.String r1 = r3.getInstallationUuid()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.DEVELOPMENTPLATFORM_DESCRIPTOR
                java.lang.String r1 = r3.getDevelopmentPlatform()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.DEVELOPMENTPLATFORMVERSION_DESCRIPTOR
                java.lang.String r3 = r3.getDevelopmentPlatformVersion()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization> {
        private static final com.google.firebase.encoders.FieldDescriptor CLSID_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder INSTANCE = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionApplicationOrganizationEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionApplicationOrganizationEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE = r0
                java.lang.String r0 = "clsId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder.CLSID_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder.CLSID_DESCRIPTOR
                java.lang.String r2 = r2.getClsId()
                r3.add(r0, r2)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionDeviceEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device> {
        private static final com.google.firebase.encoders.FieldDescriptor ARCH_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor CORES_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DISKSPACE_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor MANUFACTURER_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor MODELCLASS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor MODEL_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor RAM_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SIMULATOR_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor STATE_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.INSTANCE = r0
                java.lang.String r0 = "arch"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.ARCH_DESCRIPTOR = r0
                java.lang.String r0 = "model"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.MODEL_DESCRIPTOR = r0
                java.lang.String r0 = "cores"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.CORES_DESCRIPTOR = r0
                java.lang.String r0 = "ram"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.RAM_DESCRIPTOR = r0
                java.lang.String r0 = "diskSpace"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.DISKSPACE_DESCRIPTOR = r0
                java.lang.String r0 = "simulator"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.SIMULATOR_DESCRIPTOR = r0
                java.lang.String r0 = "state"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.STATE_DESCRIPTOR = r0
                java.lang.String r0 = "manufacturer"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.MANUFACTURER_DESCRIPTOR = r0
                java.lang.String r0 = "modelClass"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.MODELCLASS_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionDeviceEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.ARCH_DESCRIPTOR
                int r1 = r4.getArch()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.MODEL_DESCRIPTOR
                java.lang.String r1 = r4.getModel()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.CORES_DESCRIPTOR
                int r1 = r4.getCores()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.RAM_DESCRIPTOR
                long r1 = r4.getRam()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.DISKSPACE_DESCRIPTOR
                long r1 = r4.getDiskSpace()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.SIMULATOR_DESCRIPTOR
                boolean r1 = r4.isSimulator()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.STATE_DESCRIPTOR
                int r1 = r4.getState()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.MANUFACTURER_DESCRIPTOR
                java.lang.String r1 = r4.getManufacturer()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.MODELCLASS_DESCRIPTOR
                java.lang.String r4 = r4.getModelClass()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session> {
        private static final com.google.firebase.encoders.FieldDescriptor APPQUALITYSESSIONID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor APP_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor CRASHED_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DEVICE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor ENDEDAT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EVENTS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor GENERATORTYPE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor GENERATOR_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor IDENTIFIER_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor OS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor STARTEDAT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor USER_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.INSTANCE = r0
                java.lang.String r0 = "generator"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.GENERATOR_DESCRIPTOR = r0
                java.lang.String r0 = "identifier"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.IDENTIFIER_DESCRIPTOR = r0
                java.lang.String r0 = "appQualitySessionId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.APPQUALITYSESSIONID_DESCRIPTOR = r0
                java.lang.String r0 = "startedAt"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.STARTEDAT_DESCRIPTOR = r0
                java.lang.String r0 = "endedAt"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.ENDEDAT_DESCRIPTOR = r0
                java.lang.String r0 = "crashed"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.CRASHED_DESCRIPTOR = r0
                java.lang.String r0 = "app"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.APP_DESCRIPTOR = r0
                java.lang.String r0 = "user"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.USER_DESCRIPTOR = r0
                java.lang.String r0 = "os"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.OS_DESCRIPTOR = r0
                java.lang.String r0 = "device"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.DEVICE_DESCRIPTOR = r0
                java.lang.String r0 = "events"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.EVENTS_DESCRIPTOR = r0
                java.lang.String r0 = "generatorType"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.GENERATORTYPE_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.GENERATOR_DESCRIPTOR
                java.lang.String r1 = r4.getGenerator()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.IDENTIFIER_DESCRIPTOR
                byte[] r1 = r4.getIdentifierUtf8Bytes()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.APPQUALITYSESSIONID_DESCRIPTOR
                java.lang.String r1 = r4.getAppQualitySessionId()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.STARTEDAT_DESCRIPTOR
                long r1 = r4.getStartedAt()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.ENDEDAT_DESCRIPTOR
                java.lang.Long r1 = r4.getEndedAt()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.CRASHED_DESCRIPTOR
                boolean r1 = r4.isCrashed()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.APP_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r1 = r4.getApp()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.USER_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = r4.getUser()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.OS_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = r4.getOs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.DEVICE_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = r4.getDevice()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.EVENTS_DESCRIPTOR
                java.util.List r1 = r4.getEvents()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.GENERATORTYPE_DESCRIPTOR
                int r4 = r4.getGeneratorType()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application> {
        private static final com.google.firebase.encoders.FieldDescriptor APPPROCESSDETAILS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor BACKGROUND_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor CURRENTPROCESSDETAILS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor CUSTOMATTRIBUTES_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EXECUTION_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor INTERNALKEYS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor UIORIENTATION_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.INSTANCE = r0
                java.lang.String r0 = "execution"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.EXECUTION_DESCRIPTOR = r0
                java.lang.String r0 = "customAttributes"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.CUSTOMATTRIBUTES_DESCRIPTOR = r0
                java.lang.String r0 = "internalKeys"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.INTERNALKEYS_DESCRIPTOR = r0
                java.lang.String r0 = "background"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.BACKGROUND_DESCRIPTOR = r0
                java.lang.String r0 = "currentProcessDetails"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.CURRENTPROCESSDETAILS_DESCRIPTOR = r0
                java.lang.String r0 = "appProcessDetails"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.APPPROCESSDETAILS_DESCRIPTOR = r0
                java.lang.String r0 = "uiOrientation"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.UIORIENTATION_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventApplicationEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.EXECUTION_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r1 = r3.getExecution()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.CUSTOMATTRIBUTES_DESCRIPTOR
                java.util.List r1 = r3.getCustomAttributes()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.INTERNALKEYS_DESCRIPTOR
                java.util.List r1 = r3.getInternalKeys()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.BACKGROUND_DESCRIPTOR
                java.lang.Boolean r1 = r3.getBackground()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.CURRENTPROCESSDETAILS_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = r3.getCurrentProcessDetails()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.APPPROCESSDETAILS_DESCRIPTOR
                java.util.List r1 = r3.getAppProcessDetails()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.UIORIENTATION_DESCRIPTOR
                int r3 = r3.getUiOrientation()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
        private static final com.google.firebase.encoders.FieldDescriptor BASEADDRESS_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor NAME_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SIZE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor UUID_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.INSTANCE = r0
                java.lang.String r0 = "baseAddress"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.BASEADDRESS_DESCRIPTOR = r0
                java.lang.String r0 = "size"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.SIZE_DESCRIPTOR = r0
                java.lang.String r0 = "name"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.NAME_DESCRIPTOR = r0
                java.lang.String r0 = "uuid"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.UUID_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.BASEADDRESS_DESCRIPTOR
                long r1 = r4.getBaseAddress()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.SIZE_DESCRIPTOR
                long r1 = r4.getSize()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.NAME_DESCRIPTOR
                java.lang.String r1 = r4.getName()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.UUID_DESCRIPTOR
                byte[] r4 = r4.getUuidUtf8Bytes()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution> {
        private static final com.google.firebase.encoders.FieldDescriptor APPEXITINFO_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor BINARIES_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EXCEPTION_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor SIGNAL_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor THREADS_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE = r0
                java.lang.String r0 = "threads"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.THREADS_DESCRIPTOR = r0
                java.lang.String r0 = "exception"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.EXCEPTION_DESCRIPTOR = r0
                java.lang.String r0 = "appExitInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.APPEXITINFO_DESCRIPTOR = r0
                java.lang.String r0 = "signal"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.SIGNAL_DESCRIPTOR = r0
                java.lang.String r0 = "binaries"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.BINARIES_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.THREADS_DESCRIPTOR
                java.util.List r1 = r3.getThreads()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.EXCEPTION_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = r3.getException()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.APPEXITINFO_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r1 = r3.getAppExitInfo()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.SIGNAL_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r1 = r3.getSignal()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.BINARIES_DESCRIPTOR
                java.util.List r3 = r3.getBinaries()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception> {
        private static final com.google.firebase.encoders.FieldDescriptor CAUSEDBY_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor FRAMES_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor OVERFLOWCOUNT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor REASON_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor TYPE_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.INSTANCE = r0
                java.lang.String r0 = "type"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.TYPE_DESCRIPTOR = r0
                java.lang.String r0 = "reason"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.REASON_DESCRIPTOR = r0
                java.lang.String r0 = "frames"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.FRAMES_DESCRIPTOR = r0
                java.lang.String r0 = "causedBy"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.CAUSEDBY_DESCRIPTOR = r0
                java.lang.String r0 = "overflowCount"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.OVERFLOWCOUNT_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.TYPE_DESCRIPTOR
                java.lang.String r1 = r3.getType()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.REASON_DESCRIPTOR
                java.lang.String r1 = r3.getReason()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.FRAMES_DESCRIPTOR
                java.util.List r1 = r3.getFrames()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.CAUSEDBY_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = r3.getCausedBy()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.OVERFLOWCOUNT_DESCRIPTOR
                int r3 = r3.getOverflowCount()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal> {
        private static final com.google.firebase.encoders.FieldDescriptor ADDRESS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor CODE_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor NAME_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionSignalEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionSignalEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE = r0
                java.lang.String r0 = "name"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.NAME_DESCRIPTOR = r0
                java.lang.String r0 = "code"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.CODE_DESCRIPTOR = r0
                java.lang.String r0 = "address"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.ADDRESS_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.NAME_DESCRIPTOR
                java.lang.String r1 = r4.getName()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.CODE_DESCRIPTOR
                java.lang.String r1 = r4.getCode()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.ADDRESS_DESCRIPTOR
                long r1 = r4.getAddress()
                r5.add(r0, r1)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        private static final com.google.firebase.encoders.FieldDescriptor FRAMES_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor NAME_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE = r0
                java.lang.String r0 = "name"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.NAME_DESCRIPTOR = r0
                java.lang.String r0 = "importance"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.IMPORTANCE_DESCRIPTOR = r0
                java.lang.String r0 = "frames"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.FRAMES_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.NAME_DESCRIPTOR
                java.lang.String r1 = r3.getName()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.IMPORTANCE_DESCRIPTOR
                int r1 = r3.getImportance()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.FRAMES_DESCRIPTOR
                java.util.List r3 = r3.getFrames()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        private static final com.google.firebase.encoders.FieldDescriptor FILE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor OFFSET_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PC_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SYMBOL_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.INSTANCE = r0
                java.lang.String r0 = "pc"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.PC_DESCRIPTOR = r0
                java.lang.String r0 = "symbol"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.SYMBOL_DESCRIPTOR = r0
                java.lang.String r0 = "file"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.FILE_DESCRIPTOR = r0
                java.lang.String r0 = "offset"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.OFFSET_DESCRIPTOR = r0
                java.lang.String r0 = "importance"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.IMPORTANCE_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.PC_DESCRIPTOR
                long r1 = r4.getPc()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.SYMBOL_DESCRIPTOR
                java.lang.String r1 = r4.getSymbol()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.FILE_DESCRIPTOR
                java.lang.String r1 = r4.getFile()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.OFFSET_DESCRIPTOR
                long r1 = r4.getOffset()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.IMPORTANCE_DESCRIPTOR
                int r4 = r4.getImportance()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> {
        private static final com.google.firebase.encoders.FieldDescriptor DEFAULTPROCESS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor PID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PROCESSNAME_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.INSTANCE = r0
                java.lang.String r0 = "processName"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.PROCESSNAME_DESCRIPTOR = r0
                java.lang.String r0 = "pid"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.PID_DESCRIPTOR = r0
                java.lang.String r0 = "importance"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.IMPORTANCE_DESCRIPTOR = r0
                java.lang.String r0 = "defaultProcess"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.DEFAULTPROCESS_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventApplicationProcessDetailsEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.PROCESSNAME_DESCRIPTOR
                java.lang.String r1 = r3.getProcessName()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.PID_DESCRIPTOR
                int r1 = r3.getPid()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.IMPORTANCE_DESCRIPTOR
                int r1 = r3.getImportance()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.DEFAULTPROCESS_DESCRIPTOR
                boolean r3 = r3.isDefaultProcess()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventDeviceEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device> {
        private static final com.google.firebase.encoders.FieldDescriptor BATTERYLEVEL_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor BATTERYVELOCITY_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DISKUSED_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor ORIENTATION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PROXIMITYON_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor RAMUSED_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.INSTANCE = r0
                java.lang.String r0 = "batteryLevel"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.BATTERYLEVEL_DESCRIPTOR = r0
                java.lang.String r0 = "batteryVelocity"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.BATTERYVELOCITY_DESCRIPTOR = r0
                java.lang.String r0 = "proximityOn"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.PROXIMITYON_DESCRIPTOR = r0
                java.lang.String r0 = "orientation"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.ORIENTATION_DESCRIPTOR = r0
                java.lang.String r0 = "ramUsed"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.RAMUSED_DESCRIPTOR = r0
                java.lang.String r0 = "diskUsed"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.DISKUSED_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventDeviceEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.BATTERYLEVEL_DESCRIPTOR
                java.lang.Double r1 = r4.getBatteryLevel()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.BATTERYVELOCITY_DESCRIPTOR
                int r1 = r4.getBatteryVelocity()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.PROXIMITYON_DESCRIPTOR
                boolean r1 = r4.isProximityOn()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.ORIENTATION_DESCRIPTOR
                int r1 = r4.getOrientation()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.RAMUSED_DESCRIPTOR
                long r1 = r4.getRamUsed()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.DISKUSED_DESCRIPTOR
                long r1 = r4.getDiskUsed()
                r5.add(r0, r1)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> {
        private static final com.google.firebase.encoders.FieldDescriptor APP_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DEVICE_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOG_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor ROLLOUTS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor TIMESTAMP_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor TYPE_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.INSTANCE = r0
                java.lang.String r0 = "timestamp"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.TIMESTAMP_DESCRIPTOR = r0
                java.lang.String r0 = "type"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.TYPE_DESCRIPTOR = r0
                java.lang.String r0 = "app"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.APP_DESCRIPTOR = r0
                java.lang.String r0 = "device"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.DEVICE_DESCRIPTOR = r0
                java.lang.String r0 = "log"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.LOG_DESCRIPTOR = r0
                java.lang.String r0 = "rollouts"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.ROLLOUTS_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.TIMESTAMP_DESCRIPTOR
                long r1 = r4.getTimestamp()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.TYPE_DESCRIPTOR
                java.lang.String r1 = r4.getType()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.APP_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r1 = r4.getApp()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.DEVICE_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r1 = r4.getDevice()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.LOG_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r1 = r4.getLog()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.ROLLOUTS_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r4 = r4.getRollouts()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventLogEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log> {
        private static final com.google.firebase.encoders.FieldDescriptor CONTENT_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder INSTANCE = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventLogEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventLogEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder.INSTANCE = r0
                java.lang.String r0 = "content"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder.CONTENT_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventLogEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder.CONTENT_DESCRIPTOR
                java.lang.String r2 = r2.getContent()
                r3.add(r0, r2)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor PARAMETERKEY_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PARAMETERVALUE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor ROLLOUTVARIANT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor TEMPLATEVERSION_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.INSTANCE = r0
                java.lang.String r0 = "rolloutVariant"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.ROLLOUTVARIANT_DESCRIPTOR = r0
                java.lang.String r0 = "parameterKey"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.PARAMETERKEY_DESCRIPTOR = r0
                java.lang.String r0 = "parameterValue"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.PARAMETERVALUE_DESCRIPTOR = r0
                java.lang.String r0 = "templateVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.TEMPLATEVERSION_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventRolloutAssignmentEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.ROLLOUTVARIANT_DESCRIPTOR
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r1 = r4.getRolloutVariant()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.PARAMETERKEY_DESCRIPTOR
                java.lang.String r1 = r4.getParameterKey()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.PARAMETERVALUE_DESCRIPTOR
                java.lang.String r1 = r4.getParameterValue()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.TEMPLATEVERSION_DESCRIPTOR
                long r1 = r4.getTemplateVersion()
                r5.add(r0, r1)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor ROLLOUTID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor VARIANTID_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.INSTANCE = r0
                java.lang.String r0 = "rolloutId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.ROLLOUTID_DESCRIPTOR = r0
                java.lang.String r0 = "variantId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.VARIANTID_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.ROLLOUTID_DESCRIPTOR
                java.lang.String r1 = r3.getRolloutId()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.VARIANTID_DESCRIPTOR
                java.lang.String r3 = r3.getVariantId()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState> {
        private static final com.google.firebase.encoders.FieldDescriptor ASSIGNMENTS_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutsStateEncoder INSTANCE = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutsStateEncoder.INSTANCE = r0
                java.lang.String r0 = "assignments"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutsStateEncoder.ASSIGNMENTS_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionEventRolloutsStateEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutsStateEncoder.ASSIGNMENTS_DESCRIPTOR
                java.util.List r2 = r2.getRolloutAssignments()
                r3.add(r0, r2)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionOperatingSystemEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem> {
        private static final com.google.firebase.encoders.FieldDescriptor BUILDVERSION_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor JAILBROKEN_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PLATFORM_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor VERSION_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionOperatingSystemEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionOperatingSystemEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE = r0
                java.lang.String r0 = "platform"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.PLATFORM_DESCRIPTOR = r0
                java.lang.String r0 = "version"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.VERSION_DESCRIPTOR = r0
                java.lang.String r0 = "buildVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.BUILDVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "jailbroken"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.JAILBROKEN_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionOperatingSystemEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.PLATFORM_DESCRIPTOR
                int r1 = r3.getPlatform()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.VERSION_DESCRIPTOR
                java.lang.String r1 = r3.getVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.BUILDVERSION_DESCRIPTOR
                java.lang.String r1 = r3.getBuildVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.JAILBROKEN_DESCRIPTOR
                boolean r3 = r3.isJailbroken()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class CrashlyticsReportSessionUserEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User> {
        private static final com.google.firebase.encoders.FieldDescriptor IDENTIFIER_DESCRIPTOR = null;
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder INSTANCE = null;

        static {
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionUserEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionUserEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder.INSTANCE = r0
                java.lang.String r0 = "identifier"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder.IDENTIFIER_DESCRIPTOR = r0
                return
        }

        private CrashlyticsReportSessionUserEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder.IDENTIFIER_DESCRIPTOR
                java.lang.String r2 = r2.getIdentifier()
                r3.add(r0, r2)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    static {
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder r0 = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder
            r0.<init>()
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CONFIG = r0
            return
    }

    private AutoCrashlyticsReportEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> r3) {
            r2 = this;
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionApplicationEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionApplicationOrganizationEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionUserEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionOperatingSystemEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionSignalEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportCustomAttributeEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventLogEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutsStateEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.class
            com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadFileEncoder r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File> r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File.class
            r3.registerEncoder(r0, r1)
            return
    }
}
