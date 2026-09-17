package com.google.firebase.sessions;

/* loaded from: classes2.dex */
public final class AutoSessionEventEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final com.google.firebase.encoders.config.Configurator CONFIG = null;

    private static final class AndroidApplicationInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.AndroidApplicationInfo> {
        private static final com.google.firebase.encoders.FieldDescriptor APPBUILDVERSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor APPPROCESSDETAILS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor CURRENTPROCESSDETAILS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DEVICEMANUFACTURER_DESCRIPTOR = null;
        static final com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor PACKAGENAME_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor VERSIONNAME_DESCRIPTOR = null;

        static {
                com.google.firebase.sessions.AutoSessionEventEncoder$AndroidApplicationInfoEncoder r0 = new com.google.firebase.sessions.AutoSessionEventEncoder$AndroidApplicationInfoEncoder
                r0.<init>()
                com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "packageName"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.PACKAGENAME_DESCRIPTOR = r0
                java.lang.String r0 = "versionName"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.VERSIONNAME_DESCRIPTOR = r0
                java.lang.String r0 = "appBuildVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.APPBUILDVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "deviceManufacturer"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.DEVICEMANUFACTURER_DESCRIPTOR = r0
                java.lang.String r0 = "currentProcessDetails"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.CURRENTPROCESSDETAILS_DESCRIPTOR = r0
                java.lang.String r0 = "appProcessDetails"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.APPPROCESSDETAILS_DESCRIPTOR = r0
                return
        }

        private AndroidApplicationInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.sessions.AndroidApplicationInfo r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.PACKAGENAME_DESCRIPTOR
                java.lang.String r1 = r3.getPackageName()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.VERSIONNAME_DESCRIPTOR
                java.lang.String r1 = r3.getVersionName()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.APPBUILDVERSION_DESCRIPTOR
                java.lang.String r1 = r3.getAppBuildVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.DEVICEMANUFACTURER_DESCRIPTOR
                java.lang.String r1 = r3.getDeviceManufacturer()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.CURRENTPROCESSDETAILS_DESCRIPTOR
                com.google.firebase.sessions.ProcessDetails r1 = r3.getCurrentProcessDetails()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.APPPROCESSDETAILS_DESCRIPTOR
                java.util.List r3 = r3.getAppProcessDetails()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.sessions.AndroidApplicationInfo r1 = (com.google.firebase.sessions.AndroidApplicationInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class ApplicationInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.ApplicationInfo> {
        private static final com.google.firebase.encoders.FieldDescriptor ANDROIDAPPINFO_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor APPID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DEVICEMODEL_DESCRIPTOR = null;
        static final com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGENVIRONMENT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor OSVERSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONSDKVERSION_DESCRIPTOR = null;

        static {
                com.google.firebase.sessions.AutoSessionEventEncoder$ApplicationInfoEncoder r0 = new com.google.firebase.sessions.AutoSessionEventEncoder$ApplicationInfoEncoder
                r0.<init>()
                com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "appId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.APPID_DESCRIPTOR = r0
                java.lang.String r0 = "deviceModel"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.DEVICEMODEL_DESCRIPTOR = r0
                java.lang.String r0 = "sessionSdkVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.SESSIONSDKVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "osVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.OSVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "logEnvironment"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.LOGENVIRONMENT_DESCRIPTOR = r0
                java.lang.String r0 = "androidAppInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.ANDROIDAPPINFO_DESCRIPTOR = r0
                return
        }

        private ApplicationInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.sessions.ApplicationInfo r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.APPID_DESCRIPTOR
                java.lang.String r1 = r3.getAppId()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.DEVICEMODEL_DESCRIPTOR
                java.lang.String r1 = r3.getDeviceModel()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.SESSIONSDKVERSION_DESCRIPTOR
                java.lang.String r1 = r3.getSessionSdkVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.OSVERSION_DESCRIPTOR
                java.lang.String r1 = r3.getOsVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.LOGENVIRONMENT_DESCRIPTOR
                com.google.firebase.sessions.LogEnvironment r1 = r3.getLogEnvironment()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.ANDROIDAPPINFO_DESCRIPTOR
                com.google.firebase.sessions.AndroidApplicationInfo r3 = r3.getAndroidAppInfo()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.sessions.ApplicationInfo r1 = (com.google.firebase.sessions.ApplicationInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class DataCollectionStatusEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.DataCollectionStatus> {
        private static final com.google.firebase.encoders.FieldDescriptor CRASHLYTICS_DESCRIPTOR = null;
        static final com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor PERFORMANCE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONSAMPLINGRATE_DESCRIPTOR = null;

        static {
                com.google.firebase.sessions.AutoSessionEventEncoder$DataCollectionStatusEncoder r0 = new com.google.firebase.sessions.AutoSessionEventEncoder$DataCollectionStatusEncoder
                r0.<init>()
                com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder.INSTANCE = r0
                java.lang.String r0 = "performance"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder.PERFORMANCE_DESCRIPTOR = r0
                java.lang.String r0 = "crashlytics"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder.CRASHLYTICS_DESCRIPTOR = r0
                java.lang.String r0 = "sessionSamplingRate"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder.SESSIONSAMPLINGRATE_DESCRIPTOR = r0
                return
        }

        private DataCollectionStatusEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.sessions.DataCollectionStatus r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder.PERFORMANCE_DESCRIPTOR
                com.google.firebase.sessions.DataCollectionState r1 = r4.getPerformance()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder.CRASHLYTICS_DESCRIPTOR
                com.google.firebase.sessions.DataCollectionState r1 = r4.getCrashlytics()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder.SESSIONSAMPLINGRATE_DESCRIPTOR
                double r1 = r4.getSessionSamplingRate()
                r5.add(r0, r1)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.sessions.DataCollectionStatus r1 = (com.google.firebase.sessions.DataCollectionStatus) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class ProcessDetailsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.ProcessDetails> {
        private static final com.google.firebase.encoders.FieldDescriptor DEFAULTPROCESS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = null;
        static final com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor PID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PROCESSNAME_DESCRIPTOR = null;

        static {
                com.google.firebase.sessions.AutoSessionEventEncoder$ProcessDetailsEncoder r0 = new com.google.firebase.sessions.AutoSessionEventEncoder$ProcessDetailsEncoder
                r0.<init>()
                com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.INSTANCE = r0
                java.lang.String r0 = "processName"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.PROCESSNAME_DESCRIPTOR = r0
                java.lang.String r0 = "pid"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.PID_DESCRIPTOR = r0
                java.lang.String r0 = "importance"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.IMPORTANCE_DESCRIPTOR = r0
                java.lang.String r0 = "defaultProcess"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.DEFAULTPROCESS_DESCRIPTOR = r0
                return
        }

        private ProcessDetailsEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.sessions.ProcessDetails r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.PROCESSNAME_DESCRIPTOR
                java.lang.String r1 = r3.getProcessName()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.PID_DESCRIPTOR
                int r1 = r3.getPid()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.IMPORTANCE_DESCRIPTOR
                int r1 = r3.getImportance()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.DEFAULTPROCESS_DESCRIPTOR
                boolean r3 = r3.isDefaultProcess()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.sessions.ProcessDetails r1 = (com.google.firebase.sessions.ProcessDetails) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class SessionEventEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.SessionEvent> {
        private static final com.google.firebase.encoders.FieldDescriptor APPLICATIONINFO_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EVENTTYPE_DESCRIPTOR = null;
        static final com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONDATA_DESCRIPTOR = null;

        static {
                com.google.firebase.sessions.AutoSessionEventEncoder$SessionEventEncoder r0 = new com.google.firebase.sessions.AutoSessionEventEncoder$SessionEventEncoder
                r0.<init>()
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder.INSTANCE = r0
                java.lang.String r0 = "eventType"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder.EVENTTYPE_DESCRIPTOR = r0
                java.lang.String r0 = "sessionData"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder.SESSIONDATA_DESCRIPTOR = r0
                java.lang.String r0 = "applicationInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder.APPLICATIONINFO_DESCRIPTOR = r0
                return
        }

        private SessionEventEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.sessions.SessionEvent r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder.EVENTTYPE_DESCRIPTOR
                com.google.firebase.sessions.EventType r1 = r3.getEventType()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder.SESSIONDATA_DESCRIPTOR
                com.google.firebase.sessions.SessionInfo r1 = r3.getSessionData()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder.APPLICATIONINFO_DESCRIPTOR
                com.google.firebase.sessions.ApplicationInfo r3 = r3.getApplicationInfo()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.sessions.SessionEvent r1 = (com.google.firebase.sessions.SessionEvent) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class SessionInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.SessionInfo> {
        private static final com.google.firebase.encoders.FieldDescriptor DATACOLLECTIONSTATUS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EVENTTIMESTAMPUS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor FIREBASEINSTALLATIONID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor FIRSTSESSIONID_DESCRIPTOR = null;
        static final com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONINDEX_DESCRIPTOR = null;

        static {
                com.google.firebase.sessions.AutoSessionEventEncoder$SessionInfoEncoder r0 = new com.google.firebase.sessions.AutoSessionEventEncoder$SessionInfoEncoder
                r0.<init>()
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "sessionId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.SESSIONID_DESCRIPTOR = r0
                java.lang.String r0 = "firstSessionId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.FIRSTSESSIONID_DESCRIPTOR = r0
                java.lang.String r0 = "sessionIndex"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.SESSIONINDEX_DESCRIPTOR = r0
                java.lang.String r0 = "eventTimestampUs"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.EVENTTIMESTAMPUS_DESCRIPTOR = r0
                java.lang.String r0 = "dataCollectionStatus"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.DATACOLLECTIONSTATUS_DESCRIPTOR = r0
                java.lang.String r0 = "firebaseInstallationId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.FIREBASEINSTALLATIONID_DESCRIPTOR = r0
                java.lang.String r0 = "firebaseAuthenticationToken"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = r0
                return
        }

        private SessionInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.sessions.SessionInfo r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.SESSIONID_DESCRIPTOR
                java.lang.String r1 = r4.getSessionId()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.FIRSTSESSIONID_DESCRIPTOR
                java.lang.String r1 = r4.getFirstSessionId()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.SESSIONINDEX_DESCRIPTOR
                int r1 = r4.getSessionIndex()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.EVENTTIMESTAMPUS_DESCRIPTOR
                long r1 = r4.getEventTimestampUs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.DATACOLLECTIONSTATUS_DESCRIPTOR
                com.google.firebase.sessions.DataCollectionStatus r1 = r4.getDataCollectionStatus()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.FIREBASEINSTALLATIONID_DESCRIPTOR
                java.lang.String r1 = r4.getFirebaseInstallationId()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR
                java.lang.String r4 = r4.getFirebaseAuthenticationToken()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.sessions.SessionInfo r1 = (com.google.firebase.sessions.SessionInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    static {
            com.google.firebase.sessions.AutoSessionEventEncoder r0 = new com.google.firebase.sessions.AutoSessionEventEncoder
            r0.<init>()
            com.google.firebase.sessions.AutoSessionEventEncoder.CONFIG = r0
            return
    }

    private AutoSessionEventEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> r3) {
            r2 = this;
            java.lang.Class<com.google.firebase.sessions.SessionEvent> r0 = com.google.firebase.sessions.SessionEvent.class
            com.google.firebase.sessions.AutoSessionEventEncoder$SessionEventEncoder r1 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.sessions.SessionInfo> r0 = com.google.firebase.sessions.SessionInfo.class
            com.google.firebase.sessions.AutoSessionEventEncoder$SessionInfoEncoder r1 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.sessions.DataCollectionStatus> r0 = com.google.firebase.sessions.DataCollectionStatus.class
            com.google.firebase.sessions.AutoSessionEventEncoder$DataCollectionStatusEncoder r1 = com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.sessions.ApplicationInfo> r0 = com.google.firebase.sessions.ApplicationInfo.class
            com.google.firebase.sessions.AutoSessionEventEncoder$ApplicationInfoEncoder r1 = com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.sessions.AndroidApplicationInfo> r0 = com.google.firebase.sessions.AndroidApplicationInfo.class
            com.google.firebase.sessions.AutoSessionEventEncoder$AndroidApplicationInfoEncoder r1 = com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.sessions.ProcessDetails> r0 = com.google.firebase.sessions.ProcessDetails.class
            com.google.firebase.sessions.AutoSessionEventEncoder$ProcessDetailsEncoder r1 = com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            return
    }
}
