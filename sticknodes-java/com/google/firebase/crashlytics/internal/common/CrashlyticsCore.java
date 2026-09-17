package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class CrashlyticsCore {
    private final com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger analyticsEventLogger;
    private final com.google.firebase.FirebaseApp app;
    public final com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource breadcrumbSource;
    private final android.content.Context context;
    private com.google.firebase.crashlytics.internal.common.CrashlyticsController controller;
    private com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker crashMarker;
    private final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private final com.google.firebase.crashlytics.internal.common.IdManager idManager;
    private com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker initializationMarker;
    private final com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent nativeComponent;
    private final com.google.firebase.crashlytics.internal.common.OnDemandCounter onDemandCounter;
    private final com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy remoteConfigDeferredProxy;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final long startTime;

    /* renamed from: $r8$lambda$0-QR_7rgfXPA4bGhvVa-p_IbHTQ, reason: not valid java name */
    public static /* synthetic */ void m51$r8$lambda$0QR_7rgfXPA4bGhvVap_IbHTQ(com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0, long r1, java.lang.String r3) {
            r0.lambda$log$2(r1, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$CWTLkTSo0n6e8KTo9YfN8OF4wiY(com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0, java.lang.Throwable r1) {
            r0.lambda$logException$1(r1)
            return
    }

    public static /* synthetic */ java.lang.Boolean $r8$lambda$RfuETz6RKPUdW27qhAzUxdGv4AY(com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0) {
            java.lang.Boolean r0 = r0.lambda$checkForPreviousCrash$10()
            return r0
    }

    public static /* synthetic */ void $r8$lambda$hVHeQt1Y0PK8Yl8LIBUJsLKRrpg(com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0, java.lang.String r1, java.lang.String r2) {
            r0.lambda$setCustomKey$5(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$heq4ZFJKanuD6g9F7rTT59lnJLs(com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0, com.google.firebase.crashlytics.internal.settings.SettingsProvider r1) {
            r0.lambda$finishInitSynchronously$9(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$mMGeJTJLoUj26j0ObXZQXhaBi50(com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0, java.lang.String r1) {
            r0.lambda$setUserId$4(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$tcvkLnGFQws0QRKIH7XcpA8lGJo(com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0, com.google.firebase.crashlytics.internal.settings.SettingsProvider r1) {
            r0.lambda$doBackgroundInitializationAsync$0(r1)
            return
    }

    /* renamed from: $r8$lambda$vuufQWme6uCxauzG-WP5wboCVVw, reason: not valid java name */
    public static /* synthetic */ void m52$r8$lambda$vuufQWme6uCxauzGWP5wboCVVw(com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0, long r1, java.lang.String r3) {
            r0.lambda$log$3(r1, r3)
            return
    }

    public CrashlyticsCore(com.google.firebase.FirebaseApp r1, com.google.firebase.crashlytics.internal.common.IdManager r2, com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r3, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r4, com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource r5, com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger r6, com.google.firebase.crashlytics.internal.persistence.FileStore r7, com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r8, com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy r9, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r10) {
            r0 = this;
            r0.<init>()
            r0.app = r1
            r0.dataCollectionArbiter = r4
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            r0.idManager = r2
            r0.nativeComponent = r3
            r0.breadcrumbSource = r5
            r0.analyticsEventLogger = r6
            r0.fileStore = r7
            r0.sessionsSubscriber = r8
            r0.remoteConfigDeferredProxy = r9
            r0.crashlyticsWorkers = r10
            long r1 = java.lang.System.currentTimeMillis()
            r0.startTime = r1
            com.google.firebase.crashlytics.internal.common.OnDemandCounter r1 = new com.google.firebase.crashlytics.internal.common.OnDemandCounter
            r1.<init>()
            r0.onDemandCounter = r1
            return
    }

    private void checkForPreviousCrash() {
            r4 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r4.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r0.common
            java.util.concurrent.ExecutorService r0 = r0.getExecutor()
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda8 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda8
            r1.<init>(r4)
            java.util.concurrent.Future r0 = r0.submit(r1)
            r1 = 3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L24
            java.lang.Object r0 = r0.get(r1, r3)     // Catch: java.lang.Exception -> L24
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L24
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = r1.equals(r0)
            r4.didCrashOnPreviousExecution = r0
            return
        L24:
            r0 = 0
            r4.didCrashOnPreviousExecution = r0
            return
    }

    private void doBackgroundInitialization(com.google.firebase.crashlytics.internal.settings.SettingsProvider r4) {
            r3 = this;
            java.lang.String r0 = "Collection of crash reports disabled in Crashlytics settings."
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread()
            r3.markInitializationStarted()
            com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource r1 = r3.breadcrumbSource     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda0 r2 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r1.registerBreadcrumbHandler(r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r1 = r3.controller     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r1.saveVersionControlInfo()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            com.google.firebase.crashlytics.internal.settings.Settings r1 = r4.getSettingsSync()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData r1 = r1.featureFlagData     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            boolean r1 = r1.collectReports     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r1 == 0) goto L3c
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r0 = r3.controller     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            boolean r0 = r0.finalizeSessions(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r0 != 0) goto L32
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r1 = "Previous sessions could not be finalized."
            r0.w(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
        L32:
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r0 = r3.controller     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            com.google.android.gms.tasks.Task r4 = r4.getSettingsAsync()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r0.submitAllReports(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            goto L55
        L3c:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r4.d(r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            throw r4     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
        L49:
            r4 = move-exception
            goto L59
        L4b:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "Crashlytics encountered a problem during asynchronous initialization."
            r0.e(r1, r4)     // Catch: java.lang.Throwable -> L49
        L55:
            r3.markInitializationComplete()
            return
        L59:
            r3.markInitializationComplete()
            throw r4
    }

    private void finishInitSynchronously(com.google.firebase.crashlytics.internal.settings.SettingsProvider r4) {
            r3 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r3.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r0.common
            java.util.concurrent.ExecutorService r0 = r0.getExecutor()
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda3 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda3
            r1.<init>(r3, r4)
            java.util.concurrent.Future r4 = r0.submit(r1)
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."
            r0.d(r1)
            r0 = 3
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L22 java.util.concurrent.ExecutionException -> L2d java.lang.InterruptedException -> L38
            r4.get(r0, r2)     // Catch: java.util.concurrent.TimeoutException -> L22 java.util.concurrent.ExecutionException -> L2d java.lang.InterruptedException -> L38
            goto L49
        L22:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Crashlytics timed out during initialization."
            r0.e(r1, r4)
            goto L49
        L2d:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Crashlytics encountered a problem during initialization."
            r0.e(r1, r4)
            goto L49
        L38:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Crashlytics was interrupted during initialization."
            r0.e(r1, r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L49:
            return
    }

    public static java.lang.String getVersion() {
            java.lang.String r0 = "19.2.0"
            return r0
    }

    static boolean isBuildIdValid(java.lang.String r2, boolean r3) {
            r0 = 1
            if (r3 != 0) goto Ld
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Configured not to require a build ID."
            r2.v(r3)
            return r0
        Ld:
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L14
            return r0
        L14:
            java.lang.String r2 = "FirebaseCrashlytics"
            java.lang.String r3 = "."
            android.util.Log.e(r2, r3)
            java.lang.String r0 = ".     |  | "
            android.util.Log.e(r2, r0)
            java.lang.String r0 = ".     |  |"
            android.util.Log.e(r2, r0)
            android.util.Log.e(r2, r0)
            java.lang.String r1 = ".   \\ |  | /"
            android.util.Log.e(r2, r1)
            java.lang.String r1 = ".    \\    /"
            android.util.Log.e(r2, r1)
            java.lang.String r1 = ".     \\  /"
            android.util.Log.e(r2, r1)
            java.lang.String r1 = ".      \\/"
            android.util.Log.e(r2, r1)
            android.util.Log.e(r2, r3)
            java.lang.String r1 = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"
            android.util.Log.e(r2, r1)
            android.util.Log.e(r2, r3)
            java.lang.String r1 = ".      /\\"
            android.util.Log.e(r2, r1)
            java.lang.String r1 = ".     /  \\"
            android.util.Log.e(r2, r1)
            java.lang.String r1 = ".    /    \\"
            android.util.Log.e(r2, r1)
            java.lang.String r1 = ".   / |  | \\"
            android.util.Log.e(r2, r1)
            android.util.Log.e(r2, r0)
            android.util.Log.e(r2, r0)
            android.util.Log.e(r2, r0)
            android.util.Log.e(r2, r3)
            r2 = 0
            return r2
    }

    private /* synthetic */ java.lang.Boolean lambda$checkForPreviousCrash$10() throws java.lang.Exception {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r0 = r1.controller
            boolean r0 = r0.didCrashOnPreviousExecution()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private /* synthetic */ void lambda$doBackgroundInitializationAsync$0(com.google.firebase.crashlytics.internal.settings.SettingsProvider r1) {
            r0 = this;
            r0.doBackgroundInitialization(r1)
            return
    }

    private /* synthetic */ void lambda$finishInitSynchronously$9(com.google.firebase.crashlytics.internal.settings.SettingsProvider r1) {
            r0 = this;
            r0.doBackgroundInitialization(r1)
            return
    }

    private /* synthetic */ void lambda$log$2(long r2, java.lang.String r4) {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r0 = r1.controller
            r0.writeToLog(r2, r4)
            return
    }

    private /* synthetic */ void lambda$log$3(long r3, java.lang.String r5) {
            r2 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r2.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r0.diskWrite
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda1 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda1
            r1.<init>(r2, r3, r5)
            r0.submit(r1)
            return
    }

    private /* synthetic */ void lambda$logException$1(java.lang.Throwable r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r0 = r2.controller
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.writeNonFatalException(r1, r3)
            return
    }

    private /* synthetic */ void lambda$setCustomKey$5(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r0 = r1.controller
            r0.setCustomKey(r2, r3)
            return
    }

    private /* synthetic */ void lambda$setUserId$4(java.lang.String r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r0 = r1.controller
            r0.setUserId(r2)
            return
    }

    boolean didPreviousInitializationFail() {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r0 = r1.initializationMarker
            boolean r0 = r0.isPresent()
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> doBackgroundInitializationAsync(com.google.firebase.crashlytics.internal.settings.SettingsProvider r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r2.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r0.common
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda4 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda4
            r1.<init>(r2, r3)
            com.google.android.gms.tasks.Task r3 = r0.submit(r1)
            return r3
    }

    public void log(java.lang.String r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.startTime
            long r0 = r0 - r2
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r2 = r4.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r2 = r2.common
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda2 r3 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda2
            r3.<init>(r4, r0, r5)
            r2.submit(r3)
            return
    }

    public void logException(java.lang.Throwable r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r2.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r0.common
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda7 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda7
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
    }

    void markInitializationComplete() {
            r3 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread()
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r0 = r3.initializationMarker     // Catch: java.lang.Exception -> L15
            boolean r0 = r0.remove()     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L1f
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = "Initialization marker file was not properly removed."
            r0.w(r1)     // Catch: java.lang.Exception -> L15
            goto L1f
        L15:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Problem encountered deleting Crashlytics initialization marker."
            r1.e(r2, r0)
        L1f:
            return
    }

    void markInitializationStarted() {
            r2 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread()
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r0 = r2.initializationMarker
            r0.create()
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Initialization marker file was created."
            r0.v(r1)
            return
    }

    public boolean onPreExecute(com.google.firebase.crashlytics.internal.common.AppData r30, com.google.firebase.crashlytics.internal.settings.SettingsProvider r31) {
            r29 = this;
            r1 = r29
            r0 = r31
            android.content.Context r2 = r1.context
            java.lang.String r3 = "com.crashlytics.RequireBuildId"
            r13 = 1
            boolean r2 = com.google.firebase.crashlytics.internal.common.CommonUtils.getBooleanResourceValue(r2, r3, r13)
            r15 = r30
            java.lang.String r3 = r15.buildId
            boolean r2 = isBuildIdValid(r3, r2)
            if (r2 == 0) goto Lee
            com.google.firebase.crashlytics.internal.common.CLSUUID r2 = new com.google.firebase.crashlytics.internal.common.CLSUUID
            r2.<init>()
            java.lang.String r14 = r2.getSessionId()
            r28 = 0
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r2 = new com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "crash_marker"
            com.google.firebase.crashlytics.internal.persistence.FileStore r4 = r1.fileStore     // Catch: java.lang.Exception -> Le0
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> Le0
            r1.crashMarker = r2     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r2 = new com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "initialization_marker"
            com.google.firebase.crashlytics.internal.persistence.FileStore r4 = r1.fileStore     // Catch: java.lang.Exception -> Le0
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> Le0
            r1.initializationMarker = r2     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r12 = new com.google.firebase.crashlytics.internal.metadata.UserMetadata     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.persistence.FileStore r2 = r1.fileStore     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r3 = r1.crashlyticsWorkers     // Catch: java.lang.Exception -> Le0
            r12.<init>(r14, r2, r3)     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.metadata.LogFileManager r11 = new com.google.firebase.crashlytics.internal.metadata.LogFileManager     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.persistence.FileStore r2 = r1.fileStore     // Catch: java.lang.Exception -> Le0
            r11.<init>(r2)     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy r8 = new com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy     // Catch: java.lang.Exception -> Le0
            r2 = 1024(0x400, float:1.435E-42)
            com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy[] r3 = new com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy[r13]     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy r4 = new com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy     // Catch: java.lang.Exception -> Le0
            r5 = 10
            r4.<init>(r5)     // Catch: java.lang.Exception -> Le0
            r3[r28] = r4     // Catch: java.lang.Exception -> Le0
            r8.<init>(r2, r3)     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy r2 = r1.remoteConfigDeferredProxy     // Catch: java.lang.Exception -> Le0
            r2.setupListener(r12)     // Catch: java.lang.Exception -> Le0
            android.content.Context r2 = r1.context     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.IdManager r3 = r1.idManager     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.persistence.FileStore r4 = r1.fileStore     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.OnDemandCounter r10 = r1.onDemandCounter     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r9 = r1.sessionsSubscriber     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r7 = r1.crashlyticsWorkers     // Catch: java.lang.Exception -> Le0
            r5 = r30
            r6 = r11
            r16 = r7
            r7 = r12
            r17 = r9
            r9 = r31
            r22 = r11
            r11 = r17
            r21 = r12
            r12 = r16
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r23 = com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator.create(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r2 = new com.google.firebase.crashlytics.internal.common.CrashlyticsController     // Catch: java.lang.Exception -> Le0
            android.content.Context r3 = r1.context     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.IdManager r4 = r1.idManager     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r5 = r1.dataCollectionArbiter     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.persistence.FileStore r6 = r1.fileStore     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r7 = r1.crashMarker     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r8 = r1.nativeComponent     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger r9 = r1.analyticsEventLogger     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r10 = r1.sessionsSubscriber     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r11 = r1.crashlyticsWorkers     // Catch: java.lang.Exception -> Le0
            r12 = r14
            r14 = r2
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r30
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Exception -> Le0
            r1.controller = r2     // Catch: java.lang.Exception -> Le0
            boolean r2 = r29.didPreviousInitializationFail()     // Catch: java.lang.Exception -> Le0
            r29.checkForPreviousCrash()     // Catch: java.lang.Exception -> Le0
            com.google.firebase.crashlytics.internal.common.CrashlyticsController r3 = r1.controller     // Catch: java.lang.Exception -> Le0
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Exception -> Le0
            r3.enableExceptionHandling(r12, r4, r0)     // Catch: java.lang.Exception -> Le0
            if (r2 == 0) goto Ld6
            android.content.Context r2 = r1.context     // Catch: java.lang.Exception -> Le0
            boolean r2 = com.google.firebase.crashlytics.internal.common.CommonUtils.canTryConnection(r2)     // Catch: java.lang.Exception -> Le0
            if (r2 == 0) goto Ld6
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r2.d(r3)     // Catch: java.lang.Exception -> Le0
            r1.finishInitSynchronously(r0)     // Catch: java.lang.Exception -> Le0
            return r28
        Ld6:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Successfully configured exception handler."
            r0.d(r2)
            return r13
        Le0:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Crashlytics was not started due to an exception during initialization"
            r2.e(r3, r0)
            r0 = 0
            r1.controller = r0
            return r28
        Lee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"
            r0.<init>(r2)
            throw r0
    }

    public void setCustomKey(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r2.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r0.common
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda6 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda6
            r1.<init>(r2, r3, r4)
            r0.submit(r1)
            return
    }

    public void setUserId(java.lang.String r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r2.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r0.common
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda5 r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda5
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
    }
}
