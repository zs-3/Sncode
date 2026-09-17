package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class CrashlyticsController {
    static final java.io.FilenameFilter APP_EXCEPTION_MARKER_FILTER = null;
    private final com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger analyticsEventLogger;
    private final com.google.firebase.crashlytics.internal.common.AppData appData;
    final java.util.concurrent.atomic.AtomicBoolean checkForUnsentReportsCalled;
    private final android.content.Context context;
    private com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler crashHandler;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker crashMarker;
    private final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private final com.google.firebase.crashlytics.internal.common.IdManager idManager;
    private final com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager;
    private final com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent nativeComponent;
    final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> reportActionProvided;
    private final com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator reportingCoordinator;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider;
    final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> unsentReportsAvailable;
    final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> unsentReportsHandled;
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata;






    public static /* synthetic */ boolean $r8$lambda$KdOR_Yifvg9Sk8KSAhQ8lZy6az4(java.io.File r0, java.lang.String r1) {
            boolean r0 = lambda$static$0(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$lFEL1nAZKE97xoG9mOdN7z-vwoY, reason: not valid java name */
    public static /* synthetic */ void m50$r8$lambda$lFEL1nAZKE97xoG9mOdN7zvwoY(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0, java.lang.String r1) {
            r0.lambda$openSession$1(r1)
            return
    }

    static {
            com.google.firebase.crashlytics.internal.common.CrashlyticsController$$ExternalSyntheticLambda0 r0 = com.google.firebase.crashlytics.internal.common.CrashlyticsController$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.crashlytics.internal.common.CrashlyticsController.APP_EXCEPTION_MARKER_FILTER = r0
            return
    }

    CrashlyticsController(android.content.Context r3, com.google.firebase.crashlytics.internal.common.IdManager r4, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r5, com.google.firebase.crashlytics.internal.persistence.FileStore r6, com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r7, com.google.firebase.crashlytics.internal.common.AppData r8, com.google.firebase.crashlytics.internal.metadata.UserMetadata r9, com.google.firebase.crashlytics.internal.metadata.LogFileManager r10, com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r11, com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r12, com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger r13, com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r14, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r15) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.settingsProvider = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r2.unsentReportsAvailable = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r2.reportActionProvided = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r2.unsentReportsHandled = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.checkForUnsentReportsCalled = r0
            r2.context = r3
            r2.idManager = r4
            r2.dataCollectionArbiter = r5
            r2.fileStore = r6
            r2.crashMarker = r7
            r2.appData = r8
            r2.userMetadata = r9
            r2.logFileManager = r10
            r2.nativeComponent = r12
            r2.analyticsEventLogger = r13
            r2.sessionsSubscriber = r14
            r2.reportingCoordinator = r11
            r2.crashlyticsWorkers = r15
            return
    }

    static /* synthetic */ long access$000(long r0) {
            long r0 = getTimestampSeconds(r0)
            return r0
    }

    static /* synthetic */ java.lang.String access$100(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0) {
            java.lang.String r0 = r0.getCurrentSessionId()
            return r0
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger access$1000(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0) {
            com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger r0 = r0.analyticsEventLogger
            return r0
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker access$200(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0) {
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r0 = r0.crashMarker
            return r0
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator access$300(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0) {
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r0 = r0.reportingCoordinator
            return r0
    }

    static /* synthetic */ void access$400(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0, long r1) {
            r0.doWriteAppExceptionMarker(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0, java.lang.String r1, java.lang.Boolean r2) {
            r0.doOpenSession(r1, r2)
            return
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.common.DataCollectionArbiter access$600(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0) {
            com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r0 = r0.dataCollectionArbiter
            return r0
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers access$700(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0) {
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r0.crashlyticsWorkers
            return r0
    }

    static /* synthetic */ com.google.android.gms.tasks.Task access$800(com.google.firebase.crashlytics.internal.common.CrashlyticsController r0) {
            com.google.android.gms.tasks.Task r0 = r0.logAnalyticsAppExceptionEvents()
            return r0
    }

    static /* synthetic */ void access$900(java.util.List r0) {
            deleteFiles(r0)
            return
    }

    private static com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData createAppData(com.google.firebase.crashlytics.internal.common.IdManager r6, com.google.firebase.crashlytics.internal.common.AppData r7) {
            java.lang.String r0 = r6.getAppIdentifier()
            java.lang.String r1 = r7.versionCode
            java.lang.String r2 = r7.versionName
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r6 = r6.getInstallIds()
            java.lang.String r3 = r6.getCrashlyticsInstallId()
            java.lang.String r6 = r7.installerPackageName
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r6 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.determineFrom(r6)
            int r4 = r6.getId()
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r5 = r7.developmentPlatformProvider
            com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData r6 = com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData.create(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData createDeviceData(android.content.Context r16) {
            android.os.StatFs r0 = new android.os.StatFs
            java.io.File r1 = android.os.Environment.getDataDirectory()
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            int r1 = r0.getBlockCount()
            long r1 = (long) r1
            int r0 = r0.getBlockSize()
            long r3 = (long) r0
            long r10 = r1 * r3
            int r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.getCpuArchitectureInt()
            java.lang.String r6 = android.os.Build.MODEL
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r7 = r0.availableProcessors()
            long r8 = com.google.firebase.crashlytics.internal.common.CommonUtils.calculateTotalRamInBytes(r16)
            boolean r12 = com.google.firebase.crashlytics.internal.common.CommonUtils.isEmulator()
            int r13 = com.google.firebase.crashlytics.internal.common.CommonUtils.getDeviceState()
            java.lang.String r14 = android.os.Build.MANUFACTURER
            java.lang.String r15 = android.os.Build.PRODUCT
            com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData r0 = com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData.create(r5, r6, r7, r8, r10, r12, r13, r14, r15)
            return r0
    }

    private static com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData createOsData() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = android.os.Build.VERSION.CODENAME
            boolean r2 = com.google.firebase.crashlytics.internal.common.CommonUtils.isRooted()
            com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData r0 = com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData.create(r0, r1, r2)
            return r0
    }

    private static void deleteFiles(java.util.List<java.io.File> r1) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L4
        L14:
            return
    }

    private void doCloseSessions(boolean r4, com.google.firebase.crashlytics.internal.settings.SettingsProvider r5, boolean r6) {
            r3 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread()
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r1 = r3.reportingCoordinator
            java.util.SortedSet r1 = r1.listSortedOpenSessionIds()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L1e
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r5 = "No open sessions to be closed."
            r4.v(r5)
            return
        L1e:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r6 == 0) goto L34
            com.google.firebase.crashlytics.internal.settings.Settings r5 = r5.getSettingsSync()
            com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData r5 = r5.featureFlagData
            boolean r5 = r5.collectAnrs
            if (r5 == 0) goto L34
            r3.writeApplicationExitInfoEventIfRelevant(r1)
            goto L3d
        L34:
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "ANR feature disabled."
            r5.v(r2)
        L3d:
            if (r6 == 0) goto L4a
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r5 = r3.nativeComponent
            boolean r5 = r5.hasCrashDataForSession(r1)
            if (r5 == 0) goto L4a
            r3.finalizePreviousNativeSession(r1)
        L4a:
            r5 = 0
            if (r4 == 0) goto L56
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            goto L5b
        L56:
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r4 = r3.sessionsSubscriber
            r4.setSessionId(r5)
        L5b:
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r4 = r3.reportingCoordinator
            long r0 = getCurrentTimestampSeconds()
            r4.finalizeSessions(r0, r5)
            return
    }

    private void doOpenSession(java.lang.String r9, java.lang.Boolean r10) {
            r8 = this;
            long r6 = getCurrentTimestampSeconds()
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Opening a new session with ID "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = com.google.firebase.crashlytics.internal.common.CrashlyticsCore.getVersion()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Crashlytics Android SDK/%s"
            java.lang.String r2 = java.lang.String.format(r0, r2, r1)
            com.google.firebase.crashlytics.internal.common.IdManager r0 = r8.idManager
            com.google.firebase.crashlytics.internal.common.AppData r1 = r8.appData
            com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData r0 = createAppData(r0, r1)
            com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData r1 = createOsData()
            android.content.Context r3 = r8.context
            com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData r3 = createDeviceData(r3)
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r4 = r8.nativeComponent
            com.google.firebase.crashlytics.internal.model.StaticSessionData r5 = com.google.firebase.crashlytics.internal.model.StaticSessionData.create(r0, r1, r3)
            r0 = r4
            r1 = r9
            r3 = r6
            r0.prepareNativeSession(r1, r2, r3, r5)
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L59
            if (r9 == 0) goto L59
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r10 = r8.userMetadata
            r10.setNewSession(r9)
        L59:
            com.google.firebase.crashlytics.internal.metadata.LogFileManager r10 = r8.logFileManager
            r10.setCurrentSession(r9)
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r10 = r8.sessionsSubscriber
            r10.setSessionId(r9)
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r10 = r8.reportingCoordinator
            r10.onBeginSession(r9, r6)
            return
    }

    private void doWriteAppExceptionMarker(long r4) {
            r3 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r3.fileStore     // Catch: java.io.IOException -> L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L26
            r1.<init>()     // Catch: java.io.IOException -> L26
            java.lang.String r2 = ".ae"
            r1.append(r2)     // Catch: java.io.IOException -> L26
            r1.append(r4)     // Catch: java.io.IOException -> L26
            java.lang.String r4 = r1.toString()     // Catch: java.io.IOException -> L26
            java.io.File r4 = r0.getCommonFile(r4)     // Catch: java.io.IOException -> L26
            boolean r4 = r4.createNewFile()     // Catch: java.io.IOException -> L26
            if (r4 == 0) goto L1e
            goto L30
        L1e:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.io.IOException -> L26
            java.lang.String r5 = "Create new file failed."
            r4.<init>(r5)     // Catch: java.io.IOException -> L26
            throw r4     // Catch: java.io.IOException -> L26
        L26:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Could not create app exception marker file."
            r5.w(r0, r4)
        L30:
            return
    }

    private void finalizePreviousNativeSession(java.lang.String r8) {
            r7 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Finalizing native report for session "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.v(r1)
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r0 = r7.nativeComponent
            com.google.firebase.crashlytics.internal.NativeSessionFileProvider r0 = r0.getSessionFileProvider(r8)
            java.io.File r1 = r0.getMinidumpFile()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r2 = r0.getApplicationExitInto()
            boolean r3 = nativeCoreAbsent(r8, r1, r2)
            if (r3 == 0) goto L36
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "No native core present"
            r8.w(r0)
            return
        L36:
            long r3 = r1.lastModified()
            com.google.firebase.crashlytics.internal.metadata.LogFileManager r1 = new com.google.firebase.crashlytics.internal.metadata.LogFileManager
            com.google.firebase.crashlytics.internal.persistence.FileStore r5 = r7.fileStore
            r1.<init>(r5, r8)
            com.google.firebase.crashlytics.internal.persistence.FileStore r5 = r7.fileStore
            java.io.File r5 = r5.getNativeSessionDir(r8)
            boolean r6 = r5.isDirectory()
            if (r6 != 0) goto L57
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Couldn't create directory to store native session files, aborting."
            r8.w(r0)
            return
        L57:
            r7.doWriteAppExceptionMarker(r3)
            com.google.firebase.crashlytics.internal.persistence.FileStore r3 = r7.fileStore
            byte[] r4 = r1.getBytesForLog()
            java.util.List r0 = getNativeSessionFiles(r0, r8, r3, r4)
            com.google.firebase.crashlytics.internal.common.NativeSessionFileGzipper.processNativeSessions(r5, r0)
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r4 = "CrashlyticsController#finalizePreviousNativeSession"
            r3.d(r4)
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r3 = r7.reportingCoordinator
            r3.finalizeSessionWithNativeEvent(r8, r0, r2)
            r1.clearLog()
            return
    }

    private static boolean firebaseCrashExists() {
            java.lang.String r0 = "com.google.firebase.crash.FirebaseCrash"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    private java.lang.String getCurrentSessionId() {
            r2 = this;
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r0 = r2.reportingCoordinator
            java.util.SortedSet r0 = r0.listSortedOpenSessionIds()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L13
            java.lang.Object r0 = r0.first()
            java.lang.String r0 = (java.lang.String) r0
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    private static long getCurrentTimestampSeconds() {
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = getTimestampSeconds(r0)
            return r0
    }

    static java.util.List<com.google.firebase.crashlytics.internal.common.NativeSessionFile> getNativeSessionFiles(com.google.firebase.crashlytics.internal.NativeSessionFileProvider r6, java.lang.String r7, com.google.firebase.crashlytics.internal.persistence.FileStore r8, byte[] r9) {
            java.lang.String r0 = "user-data"
            java.io.File r0 = r8.getSessionFile(r7, r0)
            java.lang.String r1 = "keys"
            java.io.File r2 = r8.getSessionFile(r7, r1)
            java.lang.String r3 = "rollouts-state"
            java.io.File r7 = r8.getSessionFile(r7, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.firebase.crashlytics.internal.common.BytesBackedNativeSessionFile r3 = new com.google.firebase.crashlytics.internal.common.BytesBackedNativeSessionFile
            java.lang.String r4 = "logs_file"
            java.lang.String r5 = "logs"
            r3.<init>(r4, r5, r9)
            r8.add(r3)
            com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile r9 = new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile
            java.io.File r3 = r6.getMetadataFile()
            java.lang.String r4 = "crash_meta_file"
            java.lang.String r5 = "metadata"
            r9.<init>(r4, r5, r3)
            r8.add(r9)
            com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile r9 = new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile
            java.io.File r3 = r6.getSessionFile()
            java.lang.String r4 = "session_meta_file"
            java.lang.String r5 = "session"
            r9.<init>(r4, r5, r3)
            r8.add(r9)
            com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile r9 = new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile
            java.io.File r3 = r6.getAppFile()
            java.lang.String r4 = "app_meta_file"
            java.lang.String r5 = "app"
            r9.<init>(r4, r5, r3)
            r8.add(r9)
            com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile r9 = new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile
            java.io.File r3 = r6.getDeviceFile()
            java.lang.String r4 = "device_meta_file"
            java.lang.String r5 = "device"
            r9.<init>(r4, r5, r3)
            r8.add(r9)
            com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile r9 = new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile
            java.io.File r3 = r6.getOsFile()
            java.lang.String r4 = "os_meta_file"
            java.lang.String r5 = "os"
            r9.<init>(r4, r5, r3)
            r8.add(r9)
            com.google.firebase.crashlytics.internal.common.NativeSessionFile r6 = nativeCoreFile(r6)
            r8.add(r6)
            com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile r6 = new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile
            java.lang.String r9 = "user_meta_file"
            java.lang.String r3 = "user"
            r6.<init>(r9, r3, r0)
            r8.add(r6)
            com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile r6 = new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile
            java.lang.String r9 = "keys_file"
            r6.<init>(r9, r1, r2)
            r8.add(r6)
            com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile r6 = new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile
            java.lang.String r9 = "rollouts_file"
            java.lang.String r0 = "rollouts"
            r6.<init>(r9, r0, r7)
            r8.add(r6)
            return r8
    }

    private java.io.InputStream getResourceAsStream(java.lang.String r3) {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            if (r0 != 0) goto L15
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Couldn't get Class Loader"
            r3.w(r0)
            return r1
        L15:
            java.io.InputStream r3 = r0.getResourceAsStream(r3)
            if (r3 != 0) goto L25
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "No version control information found"
            r3.i(r0)
            return r1
        L25:
            return r3
    }

    private static long getTimestampSeconds(long r2) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            return r2
    }

    private /* synthetic */ void lambda$openSession$1(java.lang.String r2) {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.doOpenSession(r2, r0)
            return
    }

    private static /* synthetic */ boolean lambda$static$0(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = ".ae"
            boolean r0 = r1.startsWith(r0)
            return r0
    }

    private com.google.android.gms.tasks.Task<java.lang.Void> logAnalyticsAppExceptionEvent(long r3) {
            r2 = this;
            boolean r0 = firebaseCrashExists()
            if (r0 == 0) goto L15
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r4 = "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"
            r3.w(r4)
            r3 = 0
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r3)
            return r3
        L15:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Logging app exception event to Firebase Analytics"
            r0.d(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = new java.util.concurrent.ScheduledThreadPoolExecutor
            r1 = 1
            r0.<init>(r1)
            com.google.firebase.crashlytics.internal.common.CrashlyticsController$5 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsController$5
            r1.<init>(r2, r3)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.call(r0, r1)
            return r3
    }

    private com.google.android.gms.tasks.Task<java.lang.Void> logAnalyticsAppExceptionEvents() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r6.listAppExceptionMarkerFiles()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r2.getName()     // Catch: java.lang.NumberFormatException -> L2e
            r4 = 3
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.NumberFormatException -> L2e
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L2e
            com.google.android.gms.tasks.Task r3 = r6.logAnalyticsAppExceptionEvent(r3)     // Catch: java.lang.NumberFormatException -> L2e
            r0.add(r3)     // Catch: java.lang.NumberFormatException -> L2e
            goto L4a
        L2e:
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not parse app exception timestamp from file "
            r4.append(r5)
            java.lang.String r5 = r2.getName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.w(r4)
        L4a:
            r2.delete()
            goto Ld
        L4e:
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.whenAll(r0)
            return r0
    }

    private static boolean nativeCoreAbsent(java.lang.String r3, java.io.File r4, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r5) {
            if (r4 == 0) goto L8
            boolean r0 = r4.exists()
            if (r0 != 0) goto L20
        L8:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No minidump data found for session "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.w(r1)
        L20:
            if (r5 != 0) goto L3a
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No Tombstones data found for session "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.i(r3)
        L3a:
            if (r4 == 0) goto L42
            boolean r3 = r4.exists()
            if (r3 != 0) goto L46
        L42:
            if (r5 != 0) goto L46
            r3 = 1
            goto L47
        L46:
            r3 = 0
        L47:
            return r3
    }

    private static com.google.firebase.crashlytics.internal.common.NativeSessionFile nativeCoreFile(com.google.firebase.crashlytics.internal.NativeSessionFileProvider r4) {
            java.io.File r4 = r4.getMinidumpFile()
            java.lang.String r0 = "minidump"
            java.lang.String r1 = "minidump_file"
            if (r4 == 0) goto L17
            boolean r2 = r4.exists()
            if (r2 != 0) goto L11
            goto L17
        L11:
            com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile r2 = new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile
            r2.<init>(r1, r0, r4)
            goto L22
        L17:
            com.google.firebase.crashlytics.internal.common.BytesBackedNativeSessionFile r2 = new com.google.firebase.crashlytics.internal.common.BytesBackedNativeSessionFile
            r4 = 1
            byte[] r4 = new byte[r4]
            r3 = 0
            r4[r3] = r3
            r2.<init>(r1, r0, r4)
        L22:
            return r2
    }

    private static byte[] readResource(java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r4 = r0.toByteArray()
            return r4
    }

    private com.google.android.gms.tasks.Task<java.lang.Boolean> waitForReportAction() {
            r3 = this;
            com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r0 = r3.dataCollectionArbiter
            boolean r0 = r0.isAutomaticDataCollectionEnabled()
            if (r0 == 0) goto L1f
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Automatic data collection is enabled. Allowing upload."
            r0.d(r1)
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r0 = r3.unsentReportsAvailable
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.trySetResult(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)
            return r0
        L1f:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Automatic data collection is disabled."
            r0.d(r1)
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Notifying that unsent reports are available."
            r0.v(r1)
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r0 = r3.unsentReportsAvailable
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.trySetResult(r1)
            com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r0 = r3.dataCollectionArbiter
            com.google.android.gms.tasks.Task r0 = r0.waitForAutomaticDataCollectionEnabled()
            com.google.firebase.crashlytics.internal.common.CrashlyticsController$3 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsController$3
            r1.<init>(r3)
            com.google.android.gms.tasks.Task r0 = r0.onSuccessTask(r1)
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Waiting for send/deleteUnsentReports to be called."
            r1.d(r2)
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r1 = r3.reportActionProvided
            com.google.android.gms.tasks.Task r1 = r1.getTask()
            com.google.android.gms.tasks.Task r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks.race(r0, r1)
            return r0
    }

    private void writeApplicationExitInfoEventIfRelevant(java.lang.String r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L4a
            android.content.Context r0 = r4.context
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1 = 0
            r2 = 0
            java.util.List r0 = r0.getHistoricalProcessExitReasons(r1, r2, r2)
            int r1 = r0.size()
            if (r1 == 0) goto L31
            com.google.firebase.crashlytics.internal.metadata.LogFileManager r1 = new com.google.firebase.crashlytics.internal.metadata.LogFileManager
            com.google.firebase.crashlytics.internal.persistence.FileStore r2 = r4.fileStore
            r1.<init>(r2, r5)
            com.google.firebase.crashlytics.internal.persistence.FileStore r2 = r4.fileStore
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r3 = r4.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r2 = com.google.firebase.crashlytics.internal.metadata.UserMetadata.loadFromExistingSession(r5, r2, r3)
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r3 = r4.reportingCoordinator
            r3.persistRelevantAppExitInfoEvent(r5, r0, r1, r2)
            goto L62
        L31:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No ApplicationExitInfo available. Session: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.v(r5)
            goto L62
        L4a:
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ANR feature enabled, but device is API "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.v(r0)
        L62:
            return
    }

    boolean didCrashOnPreviousExecution() {
            r3 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread()
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r0 = r3.crashMarker
            boolean r0 = r0.isPresent()
            r1 = 1
            if (r0 != 0) goto L1d
            java.lang.String r0 = r3.getCurrentSessionId()
            if (r0 == 0) goto L1b
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r2 = r3.nativeComponent
            boolean r0 = r2.hasCrashDataForSession(r0)
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
        L1d:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Found previous crash marker."
            r0.v(r2)
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r0 = r3.crashMarker
            r0.remove()
            return r1
    }

    void doCloseSessions(com.google.firebase.crashlytics.internal.settings.SettingsProvider r2) {
            r1 = this;
            r0 = 0
            r1.doCloseSessions(r0, r2, r0)
            return
    }

    void enableExceptionHandling(java.lang.String r3, java.lang.Thread.UncaughtExceptionHandler r4, com.google.firebase.crashlytics.internal.settings.SettingsProvider r5) {
            r2 = this;
            r2.settingsProvider = r5
            r2.openSession(r3)
            com.google.firebase.crashlytics.internal.common.CrashlyticsController$1 r3 = new com.google.firebase.crashlytics.internal.common.CrashlyticsController$1
            r3.<init>(r2)
            com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler r0 = new com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r1 = r2.nativeComponent
            r0.<init>(r3, r5, r4, r1)
            r2.crashHandler = r0
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)
            return
    }

    boolean finalizeSessions(com.google.firebase.crashlytics.internal.settings.SettingsProvider r4) {
            r3 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread()
            boolean r0 = r3.isHandlingException()
            r1 = 0
            if (r0 == 0) goto L14
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Skipping session finalization because a crash has already occurred."
            r4.w(r0)
            return r1
        L14:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Finalizing previously open sessions."
            r0.v(r2)
            r0 = 1
            r3.doCloseSessions(r0, r4, r0)     // Catch: java.lang.Exception -> L2b
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Closed all previously open sessions."
            r4.v(r1)
            return r0
        L2b:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Unable to finalize previously open sessions."
            r0.e(r2, r4)
            return r1
    }

    java.lang.String getVersionControlInfo() throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r3.getResourceAsStream(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Read version control info"
            r1.d(r2)
            byte[] r0 = readResource(r0)
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            return r0
    }

    void handleUncaughtException(com.google.firebase.crashlytics.internal.settings.SettingsProvider r2, java.lang.Thread r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 0
            r1.handleUncaughtException(r2, r3, r4, r0)
            return
    }

    synchronized void handleUncaughtException(com.google.firebase.crashlytics.internal.settings.SettingsProvider r11, java.lang.Thread r12, java.lang.Throwable r13, boolean r14) {
            r10 = this;
            monitor-enter(r10)
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "Handling uncaught exception \""
            r1.append(r2)     // Catch: java.lang.Throwable -> L58
            r1.append(r13)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "\" from thread "
            r1.append(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = r12.getName()     // Catch: java.lang.Throwable -> L58
            r1.append(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L58
            r0.d(r1)     // Catch: java.lang.Throwable -> L58
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L58
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r10.crashlyticsWorkers     // Catch: java.lang.Throwable -> L58
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r0.common     // Catch: java.lang.Throwable -> L58
            com.google.firebase.crashlytics.internal.common.CrashlyticsController$2 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsController$2     // Catch: java.lang.Throwable -> L58
            r2 = r1
            r3 = r10
            r6 = r13
            r7 = r12
            r8 = r11
            r9 = r14
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.tasks.Task r11 = r0.submitTask(r1)     // Catch: java.lang.Throwable -> L58
            if (r14 != 0) goto L56
            com.google.firebase.crashlytics.internal.common.Utils.awaitEvenIfOnMainThread(r11)     // Catch: java.lang.Exception -> L42 java.util.concurrent.TimeoutException -> L4d java.lang.Throwable -> L58
            goto L56
        L42:
            r11 = move-exception
            com.google.firebase.crashlytics.internal.Logger r12 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L58
            java.lang.String r13 = "Error handling uncaught exception"
            r12.e(r13, r11)     // Catch: java.lang.Throwable -> L58
            goto L56
        L4d:
            com.google.firebase.crashlytics.internal.Logger r11 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L58
            java.lang.String r12 = "Cannot send reports. Timed out while fetching settings."
            r11.e(r12)     // Catch: java.lang.Throwable -> L58
        L56:
            monitor-exit(r10)
            return
        L58:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    boolean isHandlingException() {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler r0 = r1.crashHandler
            if (r0 == 0) goto Lc
            boolean r0 = r0.isHandlingException()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    java.util.List<java.io.File> listAppExceptionMarkerFiles() {
            r2 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore
            java.io.FilenameFilter r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.APP_EXCEPTION_MARKER_FILTER
            java.util.List r0 = r0.getCommonFiles(r1)
            return r0
    }

    void openSession(java.lang.String r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r2.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r0.common
            com.google.firebase.crashlytics.internal.common.CrashlyticsController$$ExternalSyntheticLambda1 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsController$$ExternalSyntheticLambda1
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
    }

    void saveVersionControlInfo() {
            r3 = this;
            java.lang.String r0 = r3.getVersionControlInfo()     // Catch: java.io.IOException -> L15
            if (r0 == 0) goto L1f
            java.lang.String r1 = "com.crashlytics.version-control-info"
            r3.setInternalKey(r1, r0)     // Catch: java.io.IOException -> L15
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.io.IOException -> L15
            java.lang.String r1 = "Saved version control info"
            r0.i(r1)     // Catch: java.io.IOException -> L15
            goto L1f
        L15:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Unable to save version control info"
            r1.w(r2, r0)
        L1f:
            return
    }

    void setCustomKey(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r0 = r1.userMetadata     // Catch: java.lang.IllegalArgumentException -> L6
            r0.setCustomKey(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L6
            goto L1c
        L6:
            r2 = move-exception
            android.content.Context r3 = r1.context
            if (r3 == 0) goto L13
            boolean r3 = com.google.firebase.crashlytics.internal.common.CommonUtils.isAppDebuggable(r3)
            if (r3 != 0) goto L12
            goto L13
        L12:
            throw r2
        L13:
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Attempting to set custom attribute with null key, ignoring."
            r2.e(r3)
        L1c:
            return
    }

    void setInternalKey(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r0 = r1.userMetadata     // Catch: java.lang.IllegalArgumentException -> L6
            r0.setInternalKey(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L6
            goto L1c
        L6:
            r2 = move-exception
            android.content.Context r3 = r1.context
            if (r3 == 0) goto L13
            boolean r3 = com.google.firebase.crashlytics.internal.common.CommonUtils.isAppDebuggable(r3)
            if (r3 != 0) goto L12
            goto L13
        L12:
            throw r2
        L13:
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Attempting to set custom attribute with null key, ignoring."
            r2.e(r3)
        L1c:
            return
    }

    void setUserId(java.lang.String r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r0 = r1.userMetadata
            r0.setUserId(r2)
            return
    }

    void submitAllReports(com.google.android.gms.tasks.Task<com.google.firebase.crashlytics.internal.settings.Settings> r4) {
            r3 = this;
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r0 = r3.reportingCoordinator
            boolean r0 = r0.hasReportsToSend()
            if (r0 != 0) goto L19
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "No crash reports are available to be sent."
            r4.v(r0)
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r4 = r3.unsentReportsAvailable
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.trySetResult(r0)
            return
        L19:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Crash reports are available to be sent."
            r0.v(r1)
            com.google.android.gms.tasks.Task r0 = r3.waitForReportAction()
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r1 = r3.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r1 = r1.common
            com.google.firebase.crashlytics.internal.common.CrashlyticsController$4 r2 = new com.google.firebase.crashlytics.internal.common.CrashlyticsController$4
            r2.<init>(r3, r4)
            r0.onSuccessTask(r1, r2)
            return
    }

    void writeNonFatalException(java.lang.Thread r10, java.lang.Throwable r11) {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = r9.isHandlingException()
            if (r2 != 0) goto L25
            long r7 = getTimestampSeconds(r0)
            java.lang.String r6 = r9.getCurrentSessionId()
            if (r6 != 0) goto L1e
            com.google.firebase.crashlytics.internal.Logger r10 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r11 = "Tried to write a non-fatal exception while no session was open."
            r10.w(r11)
            return
        L1e:
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r3 = r9.reportingCoordinator
            r4 = r11
            r5 = r10
            r3.persistNonFatalEvent(r4, r5, r6, r7)
        L25:
            return
    }

    void writeToLog(long r2, java.lang.String r4) {
            r1 = this;
            boolean r0 = r1.isHandlingException()
            if (r0 != 0) goto Lb
            com.google.firebase.crashlytics.internal.metadata.LogFileManager r0 = r1.logFileManager
            r0.writeToLog(r2, r4)
        Lb:
            return
    }
}
