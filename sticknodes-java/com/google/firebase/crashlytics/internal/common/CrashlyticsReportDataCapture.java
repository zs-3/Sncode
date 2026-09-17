package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class CrashlyticsReportDataCapture {
    private static final java.util.Map<java.lang.String, java.lang.Integer> ARCHITECTURES_BY_NAME = null;
    static final java.lang.String GENERATOR = null;
    private final com.google.firebase.crashlytics.internal.common.AppData appData;
    private final android.content.Context context;
    private final com.google.firebase.crashlytics.internal.common.IdManager idManager;
    private final com.google.firebase.crashlytics.internal.ProcessDetailsProvider processDetailsProvider;
    private final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider;
    private final com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy stackTraceTrimmingStrategy;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture.ARCHITECTURES_BY_NAME = r0
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "armeabi"
            r0.put(r2, r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "armeabi-v7a"
            r0.put(r2, r1)
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "arm64-v8a"
            r0.put(r2, r1)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "x86"
            r0.put(r3, r2)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "x86_64"
            r0.put(r4, r3)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "19.2.0"
            r2[r1] = r3
            java.lang.String r1 = "Crashlytics Android SDK/%s"
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture.GENERATOR = r0
            return
    }

    public CrashlyticsReportDataCapture(android.content.Context r2, com.google.firebase.crashlytics.internal.common.IdManager r3, com.google.firebase.crashlytics.internal.common.AppData r4, com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy r5, com.google.firebase.crashlytics.internal.settings.SettingsProvider r6) {
            r1 = this;
            r1.<init>()
            com.google.firebase.crashlytics.internal.ProcessDetailsProvider r0 = com.google.firebase.crashlytics.internal.ProcessDetailsProvider.INSTANCE
            r1.processDetailsProvider = r0
            r1.context = r2
            r1.idManager = r3
            r1.appData = r4
            r1.stackTraceTrimmingStrategy = r5
            r1.settingsProvider = r6
            return
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo addBuildIdInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r6) {
            r5 = this;
            com.google.firebase.crashlytics.internal.settings.SettingsProvider r0 = r5.settingsProvider
            com.google.firebase.crashlytics.internal.settings.Settings r0 = r0.getSettingsSync()
            com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData r0 = r0.featureFlagData
            boolean r0 = r0.collectBuildIds
            if (r0 == 0) goto L58
            com.google.firebase.crashlytics.internal.common.AppData r0 = r5.appData
            java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> r0 = r0.buildIdInfoList
            int r0 = r0.size()
            if (r0 <= 0) goto L58
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.firebase.crashlytics.internal.common.AppData r1 = r5.appData
            java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> r1 = r1.buildIdInfoList
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()
            com.google.firebase.crashlytics.internal.common.BuildIdInfo r2 = (com.google.firebase.crashlytics.internal.common.BuildIdInfo) r2
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder r3 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder()
            java.lang.String r4 = r2.getLibraryName()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder r3 = r3.setLibraryName(r4)
            java.lang.String r4 = r2.getArch()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder r3 = r3.setArch(r4)
            java.lang.String r2 = r2.getBuildId()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder r2 = r3.setBuildId(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch r2 = r2.build()
            r0.add(r2)
            goto L23
        L53:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            goto L59
        L58:
            r0 = 0
        L59:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.builder()
            int r2 = r6.getImportance()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setImportance(r2)
            java.lang.String r2 = r6.getProcessName()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setProcessName(r2)
            int r2 = r6.getReasonCode()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setReasonCode(r2)
            long r2 = r6.getTimestamp()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setTimestamp(r2)
            int r2 = r6.getPid()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setPid(r2)
            long r2 = r6.getPss()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setPss(r2)
            long r2 = r6.getRss()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setRss(r2)
            java.lang.String r6 = r6.getTraceFile()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r6 = r1.setTraceFile(r6)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r6 = r6.setBuildIdMappingForArch(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r6 = r6.build()
            return r6
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder buildReportData() {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.builder()
            java.lang.String r1 = "19.2.0"
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setSdkVersion(r1)
            com.google.firebase.crashlytics.internal.common.AppData r1 = r2.appData
            java.lang.String r1 = r1.googleAppId
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setGmpAppId(r1)
            com.google.firebase.crashlytics.internal.common.IdManager r1 = r2.idManager
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r1 = r1.getInstallIds()
            java.lang.String r1 = r1.getCrashlyticsInstallId()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setInstallationUuid(r1)
            com.google.firebase.crashlytics.internal.common.IdManager r1 = r2.idManager
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r1 = r1.getInstallIds()
            java.lang.String r1 = r1.getFirebaseInstallationId()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setFirebaseInstallationId(r1)
            com.google.firebase.crashlytics.internal.common.IdManager r1 = r2.idManager
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r1 = r1.getInstallIds()
            java.lang.String r1 = r1.getFirebaseAuthenticationToken()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setFirebaseAuthenticationToken(r1)
            com.google.firebase.crashlytics.internal.common.AppData r1 = r2.appData
            java.lang.String r1 = r1.versionCode
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setBuildVersion(r1)
            com.google.firebase.crashlytics.internal.common.AppData r1 = r2.appData
            java.lang.String r1 = r1.versionName
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setDisplayVersion(r1)
            r1 = 4
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setPlatform(r1)
            return r0
    }

    private static long ensureNonNegative(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            goto L8
        L7:
            r3 = r0
        L8:
            return r3
    }

    private static int getDeviceArchitecture() {
            java.lang.String r0 = android.os.Build.CPU_ABI
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 7
            if (r1 == 0) goto La
            return r2
        La:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture.ARCHITECTURES_BY_NAME
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L1b
            return r2
        L1b:
            int r0 = r0.intValue()
            return r0
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage populateBinaryImageData() {
            r3 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder()
            r1 = 0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder r0 = r0.setBaseAddress(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder r0 = r0.setSize(r1)
            com.google.firebase.crashlytics.internal.common.AppData r1 = r3.appData
            java.lang.String r1 = r1.packageName
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder r0 = r0.setName(r1)
            com.google.firebase.crashlytics.internal.common.AppData r1 = r3.appData
            java.lang.String r1 = r1.buildId
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder r0 = r0.setUuid(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage r0 = r0.build()
            return r0
    }

    private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> populateBinaryImagesList() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage r0 = r1.populateBinaryImageData()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application populateEventApplicationData(int r3, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r4) {
            r2 = this;
            int r0 = r4.getImportance()
            r1 = 100
            if (r0 == r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.builder()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r0 = r1.setBackground(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = r2.processDetailsFromApplicationExitInfo(r4)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r0 = r0.setCurrentProcessDetails(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r3 = r0.setUiOrientation(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r4 = r2.populateExecutionData(r4)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r3 = r3.setExecution(r4)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r3 = r3.build()
            return r3
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application populateEventApplicationData(int r7, com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r8, java.lang.Thread r9, int r10, int r11, boolean r12) {
            r6 = this;
            com.google.firebase.crashlytics.internal.ProcessDetailsProvider r0 = r6.processDetailsProvider
            android.content.Context r1 = r6.context
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r0 = r0.getCurrentProcessDetails(r1)
            int r1 = r0.getImportance()
            if (r1 <= 0) goto L1e
            int r1 = r0.getImportance()
            r2 = 100
            if (r1 == r2) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L1f
        L1e:
            r1 = 0
        L1f:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r2 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r1 = r2.setBackground(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r0 = r1.setCurrentProcessDetails(r0)
            com.google.firebase.crashlytics.internal.ProcessDetailsProvider r1 = r6.processDetailsProvider
            android.content.Context r2 = r6.context
            java.util.List r1 = r1.getAppProcessDetails(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r0 = r0.setAppProcessDetails(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r7 = r0.setUiOrientation(r7)
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r8 = r0.populateExecutionData(r1, r2, r3, r4, r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r7 = r7.setExecution(r8)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r7 = r7.build()
            return r7
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device populateEventDeviceData(int r9) {
            r8 = this;
            android.content.Context r0 = r8.context
            com.google.firebase.crashlytics.internal.common.BatteryState r0 = com.google.firebase.crashlytics.internal.common.BatteryState.get(r0)
            java.lang.Float r1 = r0.getBatteryLevel()
            if (r1 == 0) goto L15
            double r1 = r1.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            goto L16
        L15:
            r1 = 0
        L16:
            int r0 = r0.getBatteryVelocity()
            android.content.Context r2 = r8.context
            boolean r2 = com.google.firebase.crashlytics.internal.common.CommonUtils.getProximitySensorEnabled(r2)
            android.content.Context r3 = r8.context
            long r3 = com.google.firebase.crashlytics.internal.common.CommonUtils.calculateTotalRamInBytes(r3)
            android.content.Context r5 = r8.context
            long r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.calculateFreeRamInBytes(r5)
            long r3 = r3 - r5
            long r3 = ensureNonNegative(r3)
            java.io.File r5 = android.os.Environment.getDataDirectory()
            java.lang.String r5 = r5.getPath()
            long r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.calculateUsedDiskSpaceInBytes(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder r7 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder r1 = r7.setBatteryLevel(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder r0 = r1.setBatteryVelocity(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder r0 = r0.setProximityOn(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder r9 = r0.setOrientation(r9)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder r9 = r9.setRamUsed(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder r9 = r9.setDiskUsed(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r9 = r9.build()
            return r9
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception populateExceptionData(com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r2 = r1.populateExceptionData(r2, r3, r4, r0)
            return r2
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception populateExceptionData(com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r6, int r7, int r8, int r9) {
            r5 = this;
            java.lang.String r0 = r6.className
            java.lang.String r1 = r6.localizedMessage
            java.lang.StackTraceElement[] r2 = r6.stacktrace
            r3 = 0
            if (r2 == 0) goto La
            goto Lc
        La:
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r3]
        Lc:
            com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r6 = r6.cause
            if (r9 < r8) goto L18
            r4 = r6
        L11:
            if (r4 == 0) goto L18
            com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r4 = r4.cause
            int r3 = r3 + 1
            goto L11
        L18:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder r4 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder r0 = r4.setType(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder r0 = r0.setReason(r1)
            java.util.List r1 = r5.populateFramesList(r2, r7)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder r0 = r0.setFrames(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder r0 = r0.setOverflowCount(r3)
            if (r6 == 0) goto L3d
            if (r3 != 0) goto L3d
            int r9 = r9 + 1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r6 = r5.populateExceptionData(r6, r7, r8, r9)
            r0.setCausedBy(r6)
        L3d:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r6 = r0.build()
            return r6
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution populateExecutionData(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r2 = r0.setAppExitInfo(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r0 = r1.populateSignalData()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r2 = r2.setSignal(r0)
            java.util.List r0 = r1.populateBinaryImagesList()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r2 = r2.setBinaries(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r2 = r2.build()
            return r2
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution populateExecutionData(com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r2, java.lang.Thread r3, int r4, int r5, boolean r6) {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.builder()
            java.util.List r3 = r1.populateThreadsList(r2, r3, r4, r6)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r3 = r0.setThreads(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r2 = r1.populateExceptionData(r2, r4, r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r2 = r3.setException(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r3 = r1.populateSignalData()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r2 = r2.setSignal(r3)
            java.util.List r3 = r1.populateBinaryImagesList()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r2 = r2.setBinaries(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r2 = r2.build()
            return r2
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame populateFrameData(java.lang.StackTraceElement r8, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder r9) {
            r7 = this;
            boolean r0 = r8.isNativeMethod()
            r1 = 0
            if (r0 == 0) goto L12
            int r0 = r8.getLineNumber()
            long r3 = (long) r0
            long r3 = java.lang.Math.max(r3, r1)
            goto L13
        L12:
            r3 = r1
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r8.getClassName()
            r0.append(r5)
            java.lang.String r5 = "."
            r0.append(r5)
            java.lang.String r5 = r8.getMethodName()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r8.getFileName()
            boolean r6 = r8.isNativeMethod()
            if (r6 != 0) goto L44
            int r6 = r8.getLineNumber()
            if (r6 <= 0) goto L44
            int r8 = r8.getLineNumber()
            long r1 = (long) r8
        L44:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r8 = r9.setPc(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r8 = r8.setSymbol(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r8 = r8.setFile(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r8 = r8.setOffset(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame r8 = r8.build()
            return r8
    }

    private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> populateFramesList(java.lang.StackTraceElement[] r6, int r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1d
            r3 = r6[r2]
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r4 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r4 = r4.setImportance(r7)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame r3 = r5.populateFrameData(r3, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L1d:
            java.util.List r6 = java.util.Collections.unmodifiableList(r0)
            return r6
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application populateSessionApplicationData() {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.builder()
            com.google.firebase.crashlytics.internal.common.IdManager r1 = r2.idManager
            java.lang.String r1 = r1.getAppIdentifier()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder r0 = r0.setIdentifier(r1)
            com.google.firebase.crashlytics.internal.common.AppData r1 = r2.appData
            java.lang.String r1 = r1.versionCode
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder r0 = r0.setVersion(r1)
            com.google.firebase.crashlytics.internal.common.AppData r1 = r2.appData
            java.lang.String r1 = r1.versionName
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder r0 = r0.setDisplayVersion(r1)
            com.google.firebase.crashlytics.internal.common.IdManager r1 = r2.idManager
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r1 = r1.getInstallIds()
            java.lang.String r1 = r1.getCrashlyticsInstallId()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder r0 = r0.setInstallationUuid(r1)
            com.google.firebase.crashlytics.internal.common.AppData r1 = r2.appData
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r1 = r1.developmentPlatformProvider
            java.lang.String r1 = r1.getDevelopmentPlatform()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder r0 = r0.setDevelopmentPlatform(r1)
            com.google.firebase.crashlytics.internal.common.AppData r1 = r2.appData
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r1 = r1.developmentPlatformProvider
            java.lang.String r1 = r1.getDevelopmentPlatformVersion()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder r0 = r0.setDevelopmentPlatformVersion(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r0 = r0.build()
            return r0
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session populateSessionData(java.lang.String r2, long r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r3 = r0.setStartedAt(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r2 = r3.setIdentifier(r2)
            java.lang.String r3 = com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture.GENERATOR
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r2 = r2.setGenerator(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r3 = r1.populateSessionApplicationData()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r2 = r2.setApp(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r3 = r1.populateSessionOperatingSystemData()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r2 = r2.setOs(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r3 = r1.populateSessionDeviceData()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r2 = r2.setDevice(r3)
            r3 = 3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r2 = r2.setGeneratorType(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r2 = r2.build()
            return r2
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device populateSessionDeviceData() {
            r11 = this;
            android.os.StatFs r0 = new android.os.StatFs
            java.io.File r1 = android.os.Environment.getDataDirectory()
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            int r1 = getDeviceArchitecture()
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            int r2 = r2.availableProcessors()
            android.content.Context r3 = r11.context
            long r3 = com.google.firebase.crashlytics.internal.common.CommonUtils.calculateTotalRamInBytes(r3)
            int r5 = r0.getBlockCount()
            long r5 = (long) r5
            int r0 = r0.getBlockSize()
            long r7 = (long) r0
            long r5 = r5 * r7
            boolean r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.isEmulator()
            int r7 = com.google.firebase.crashlytics.internal.common.CommonUtils.getDeviceState()
            java.lang.String r8 = android.os.Build.MANUFACTURER
            java.lang.String r9 = android.os.Build.PRODUCT
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r10 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r1 = r10.setArch(r1)
            java.lang.String r10 = android.os.Build.MODEL
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r1 = r1.setModel(r10)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r1 = r1.setCores(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r1 = r1.setRam(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r1 = r1.setDiskSpace(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r0 = r1.setSimulator(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r0 = r0.setState(r7)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r0 = r0.setManufacturer(r8)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r0 = r0.setModelClass(r9)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r0 = r0.build()
            return r0
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem populateSessionOperatingSystemData() {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.builder()
            r1 = 3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder r0 = r0.setPlatform(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder r0 = r0.setVersion(r1)
            java.lang.String r1 = android.os.Build.VERSION.CODENAME
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder r0 = r0.setBuildVersion(r1)
            boolean r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.isRooted()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder r0 = r0.setJailbroken(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r0 = r0.build()
            return r0
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal populateSignalData() {
            r3 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.builder()
            java.lang.String r1 = "0"
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r0 = r0.setName(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r0 = r0.setCode(r1)
            r1 = 0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r0 = r0.setAddress(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r0 = r0.build()
            return r0
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread populateThreadData(java.lang.Thread r2, java.lang.StackTraceElement[] r3) {
            r1 = this;
            r0 = 0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread r2 = r1.populateThreadData(r2, r3, r0)
            return r2
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread populateThreadData(java.lang.Thread r2, java.lang.StackTraceElement[] r3, int r4) {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.builder()
            java.lang.String r2 = r2.getName()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder r2 = r0.setName(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder r2 = r2.setImportance(r4)
            java.util.List r3 = r1.populateFramesList(r3, r4)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder r2 = r2.setFrames(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread r2 = r2.build()
            return r2
    }

    private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread> populateThreadsList(com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r3, java.lang.Thread r4, int r5, boolean r6) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StackTraceElement[] r3 = r3.stacktrace
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread r3 = r2.populateThreadData(r4, r3, r5)
            r0.add(r3)
            if (r6 == 0) goto L48
            java.util.Map r3 = java.lang.Thread.getAllStackTraces()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.Thread r6 = (java.lang.Thread) r6
            boolean r1 = r6.equals(r4)
            if (r1 != 0) goto L1c
            com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy r1 = r2.stackTraceTrimmingStrategy
            java.lang.Object r5 = r5.getValue()
            java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5
            java.lang.StackTraceElement[] r5 = r1.getTrimmedStackTrace(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread r5 = r2.populateThreadData(r6, r5)
            r0.add(r5)
            goto L1c
        L48:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetailsFromApplicationExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r4) {
            r3 = this;
            com.google.firebase.crashlytics.internal.ProcessDetailsProvider r0 = r3.processDetailsProvider
            java.lang.String r1 = r4.getProcessName()
            int r2 = r4.getPid()
            int r4 = r4.getImportance()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r4 = r0.buildProcessDetails(r1, r2, r4)
            return r4
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event captureAnrEventData(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r5) {
            r4 = this;
            android.content.Context r0 = r4.context
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.builder()
            java.lang.String r2 = "anr"
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r1 = r1.setType(r2)
            long r2 = r5.getTimestamp()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r1 = r1.setTimestamp(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r5 = r4.addBuildIdInfo(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r5 = r4.populateEventApplicationData(r0, r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r5 = r1.setApp(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r0 = r4.populateEventDeviceData(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r5 = r5.setDevice(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r5 = r5.build()
            return r5
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event captureEventData(java.lang.Throwable r11, java.lang.Thread r12, java.lang.String r13, long r14, int r16, int r17, boolean r18) {
            r10 = this;
            r7 = r10
            android.content.Context r0 = r7.context
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r8 = r0.orientation
            com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy r0 = r7.stackTraceTrimmingStrategy
            r1 = r11
            com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r2 = com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData.makeTrimmedThrowableData(r11, r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.builder()
            r1 = r13
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r0 = r0.setType(r13)
            r3 = r14
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r9 = r0.setTimestamp(r14)
            r0 = r10
            r1 = r8
            r3 = r12
            r4 = r16
            r5 = r17
            r6 = r18
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r0 = r0.populateEventApplicationData(r1, r2, r3, r4, r5, r6)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r0 = r9.setApp(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r1 = r10.populateEventDeviceData(r8)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r0 = r0.setDevice(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r0 = r0.build()
            return r0
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport captureReportData(java.lang.String r2, long r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r1.buildReportData()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r2 = r1.populateSessionData(r2, r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r2 = r0.setSession(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2 = r2.build()
            return r2
    }
}
