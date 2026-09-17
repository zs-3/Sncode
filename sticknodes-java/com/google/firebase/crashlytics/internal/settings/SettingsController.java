package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
public class SettingsController implements com.google.firebase.crashlytics.internal.settings.SettingsProvider {
    private final com.google.firebase.crashlytics.internal.settings.CachedSettingsIo cachedSettingsIo;
    private final android.content.Context context;
    private final com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;
    private final java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.settings.Settings> settings;
    private final com.google.firebase.crashlytics.internal.settings.SettingsJsonParser settingsJsonParser;
    private final com.google.firebase.crashlytics.internal.settings.SettingsRequest settingsRequest;
    private final com.google.firebase.crashlytics.internal.settings.SettingsSpiCall settingsSpiCall;
    private final java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.settings.Settings>> settingsTask;

    /* renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$1, reason: invalid class name */
    class AnonymousClass1 implements com.google.android.gms.tasks.SuccessContinuation<java.lang.Void, java.lang.Void> {
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.SettingsController this$0;
        final /* synthetic */ com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers val$crashlyticsWorkers;

        public static /* synthetic */ org.json.JSONObject $r8$lambda$q_OV8xc234heO27WN_HgTqAe9Ak(com.google.firebase.crashlytics.internal.settings.SettingsController.AnonymousClass1 r0) {
                org.json.JSONObject r0 = r0.lambda$then$0()
                return r0
        }

        AnonymousClass1(com.google.firebase.crashlytics.internal.settings.SettingsController r1, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$crashlyticsWorkers = r2
                r0.<init>()
                return
        }

        private /* synthetic */ org.json.JSONObject lambda$then$0() throws java.lang.Exception {
                r3 = this;
                com.google.firebase.crashlytics.internal.settings.SettingsController r0 = r3.this$0
                com.google.firebase.crashlytics.internal.settings.SettingsSpiCall r0 = com.google.firebase.crashlytics.internal.settings.SettingsController.access$700(r0)
                com.google.firebase.crashlytics.internal.settings.SettingsController r1 = r3.this$0
                com.google.firebase.crashlytics.internal.settings.SettingsRequest r1 = com.google.firebase.crashlytics.internal.settings.SettingsController.access$300(r1)
                r2 = 1
                org.json.JSONObject r0 = r0.invoke(r1, r2)
                return r0
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public /* bridge */ /* synthetic */ com.google.android.gms.tasks.Task<java.lang.Void> then(java.lang.Void r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                com.google.android.gms.tasks.Task r1 = r0.then2(r1)
                return r1
        }

        /* renamed from: then, reason: avoid collision after fix types in other method */
        public com.google.android.gms.tasks.Task<java.lang.Void> then2(java.lang.Void r5) throws java.lang.Exception {
                r4 = this;
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r5 = r4.val$crashlyticsWorkers
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r5 = r5.network
                java.util.concurrent.ExecutorService r5 = r5.getExecutor()
                com.google.firebase.crashlytics.internal.settings.SettingsController$1$$ExternalSyntheticLambda0 r0 = new com.google.firebase.crashlytics.internal.settings.SettingsController$1$$ExternalSyntheticLambda0
                r0.<init>(r4)
                java.util.concurrent.Future r5 = r5.submit(r0)
                java.lang.Object r5 = r5.get()
                org.json.JSONObject r5 = (org.json.JSONObject) r5
                if (r5 == 0) goto L58
                com.google.firebase.crashlytics.internal.settings.SettingsController r0 = r4.this$0
                com.google.firebase.crashlytics.internal.settings.SettingsJsonParser r0 = com.google.firebase.crashlytics.internal.settings.SettingsController.access$000(r0)
                com.google.firebase.crashlytics.internal.settings.Settings r0 = r0.parseSettingsJson(r5)
                com.google.firebase.crashlytics.internal.settings.SettingsController r1 = r4.this$0
                com.google.firebase.crashlytics.internal.settings.CachedSettingsIo r1 = com.google.firebase.crashlytics.internal.settings.SettingsController.access$100(r1)
                long r2 = r0.expiresAtMillis
                r1.writeCachedSettings(r2, r5)
                com.google.firebase.crashlytics.internal.settings.SettingsController r1 = r4.this$0
                java.lang.String r2 = "Loaded settings: "
                com.google.firebase.crashlytics.internal.settings.SettingsController.access$200(r1, r5, r2)
                com.google.firebase.crashlytics.internal.settings.SettingsController r5 = r4.this$0
                com.google.firebase.crashlytics.internal.settings.SettingsRequest r1 = com.google.firebase.crashlytics.internal.settings.SettingsController.access$300(r5)
                java.lang.String r1 = r1.instanceId
                com.google.firebase.crashlytics.internal.settings.SettingsController.access$400(r5, r1)
                com.google.firebase.crashlytics.internal.settings.SettingsController r5 = r4.this$0
                java.util.concurrent.atomic.AtomicReference r5 = com.google.firebase.crashlytics.internal.settings.SettingsController.access$500(r5)
                r5.set(r0)
                com.google.firebase.crashlytics.internal.settings.SettingsController r5 = r4.this$0
                java.util.concurrent.atomic.AtomicReference r5 = com.google.firebase.crashlytics.internal.settings.SettingsController.access$600(r5)
                java.lang.Object r5 = r5.get()
                com.google.android.gms.tasks.TaskCompletionSource r5 = (com.google.android.gms.tasks.TaskCompletionSource) r5
                r5.trySetResult(r0)
            L58:
                r5 = 0
                com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
                return r5
        }
    }

    SettingsController(android.content.Context r4, com.google.firebase.crashlytics.internal.settings.SettingsRequest r5, com.google.firebase.crashlytics.internal.common.CurrentTimeProvider r6, com.google.firebase.crashlytics.internal.settings.SettingsJsonParser r7, com.google.firebase.crashlytics.internal.settings.CachedSettingsIo r8, com.google.firebase.crashlytics.internal.settings.SettingsSpiCall r9, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r10) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.settings = r0
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            r1.<init>(r2)
            r3.settingsTask = r1
            r3.context = r4
            r3.settingsRequest = r5
            r3.currentTimeProvider = r6
            r3.settingsJsonParser = r7
            r3.cachedSettingsIo = r8
            r3.settingsSpiCall = r9
            r3.dataCollectionArbiter = r10
            com.google.firebase.crashlytics.internal.settings.Settings r4 = com.google.firebase.crashlytics.internal.settings.DefaultSettingsJsonTransform.defaultSettings(r6)
            r0.set(r4)
            return
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.settings.SettingsJsonParser access$000(com.google.firebase.crashlytics.internal.settings.SettingsController r0) {
            com.google.firebase.crashlytics.internal.settings.SettingsJsonParser r0 = r0.settingsJsonParser
            return r0
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.settings.CachedSettingsIo access$100(com.google.firebase.crashlytics.internal.settings.SettingsController r0) {
            com.google.firebase.crashlytics.internal.settings.CachedSettingsIo r0 = r0.cachedSettingsIo
            return r0
    }

    static /* synthetic */ void access$200(com.google.firebase.crashlytics.internal.settings.SettingsController r0, org.json.JSONObject r1, java.lang.String r2) {
            r0.logSettings(r1, r2)
            return
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.settings.SettingsRequest access$300(com.google.firebase.crashlytics.internal.settings.SettingsController r0) {
            com.google.firebase.crashlytics.internal.settings.SettingsRequest r0 = r0.settingsRequest
            return r0
    }

    static /* synthetic */ boolean access$400(com.google.firebase.crashlytics.internal.settings.SettingsController r0, java.lang.String r1) {
            boolean r0 = r0.setStoredBuildInstanceIdentifier(r1)
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicReference access$500(com.google.firebase.crashlytics.internal.settings.SettingsController r0) {
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.settings.Settings> r0 = r0.settings
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicReference access$600(com.google.firebase.crashlytics.internal.settings.SettingsController r0) {
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.settings.Settings>> r0 = r0.settingsTask
            return r0
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.settings.SettingsSpiCall access$700(com.google.firebase.crashlytics.internal.settings.SettingsController r0) {
            com.google.firebase.crashlytics.internal.settings.SettingsSpiCall r0 = r0.settingsSpiCall
            return r0
    }

    public static com.google.firebase.crashlytics.internal.settings.SettingsController create(android.content.Context r15, java.lang.String r16, com.google.firebase.crashlytics.internal.common.IdManager r17, com.google.firebase.crashlytics.internal.network.HttpRequestFactory r18, java.lang.String r19, java.lang.String r20, com.google.firebase.crashlytics.internal.persistence.FileStore r21, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r22) {
            java.lang.String r0 = r17.getInstallerPackageName()
            com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider r10 = new com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider
            r10.<init>()
            com.google.firebase.crashlytics.internal.settings.SettingsJsonParser r11 = new com.google.firebase.crashlytics.internal.settings.SettingsJsonParser
            r11.<init>(r10)
            com.google.firebase.crashlytics.internal.settings.CachedSettingsIo r12 = new com.google.firebase.crashlytics.internal.settings.CachedSettingsIo
            r1 = r21
            r12.<init>(r1)
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r16
            java.lang.String r5 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r1 = java.lang.String.format(r1, r5, r3)
            com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall r13 = new com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall
            r3 = r18
            r13.<init>(r1, r3)
            java.lang.String r3 = r17.getModelName()
            java.lang.String r5 = r17.getOsBuildVersionString()
            java.lang.String r6 = r17.getOsDisplayVersionString()
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r7 = com.google.firebase.crashlytics.internal.common.CommonUtils.getMappingFileId(r15)
            r1[r4] = r7
            r1[r2] = r16
            r2 = 2
            r1[r2] = r20
            r2 = 3
            r1[r2] = r19
            java.lang.String r7 = com.google.firebase.crashlytics.internal.common.CommonUtils.createInstanceIdFrom(r1)
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r0 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.determineFrom(r0)
            int r9 = r0.getId()
            com.google.firebase.crashlytics.internal.settings.SettingsRequest r14 = new com.google.firebase.crashlytics.internal.settings.SettingsRequest
            r0 = r14
            r1 = r16
            r2 = r3
            r3 = r5
            r4 = r6
            r5 = r17
            r6 = r7
            r7 = r20
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.google.firebase.crashlytics.internal.settings.SettingsController r0 = new com.google.firebase.crashlytics.internal.settings.SettingsController
            r1 = r0
            r2 = r15
            r3 = r14
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private com.google.firebase.crashlytics.internal.settings.Settings getCachedSettingsData(com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r6) {
            r5 = this;
            r0 = 0
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r1 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.SKIP_CACHE_LOOKUP     // Catch: java.lang.Exception -> L5f
            boolean r1 = r1.equals(r6)     // Catch: java.lang.Exception -> L5f
            if (r1 != 0) goto L69
            com.google.firebase.crashlytics.internal.settings.CachedSettingsIo r1 = r5.cachedSettingsIo     // Catch: java.lang.Exception -> L5f
            org.json.JSONObject r1 = r1.readCachedSettings()     // Catch: java.lang.Exception -> L5f
            if (r1 == 0) goto L55
            com.google.firebase.crashlytics.internal.settings.SettingsJsonParser r2 = r5.settingsJsonParser     // Catch: java.lang.Exception -> L5f
            com.google.firebase.crashlytics.internal.settings.Settings r2 = r2.parseSettingsJson(r1)     // Catch: java.lang.Exception -> L5f
            if (r2 == 0) goto L4b
            java.lang.String r3 = "Loaded cached settings: "
            r5.logSettings(r1, r3)     // Catch: java.lang.Exception -> L5f
            com.google.firebase.crashlytics.internal.common.CurrentTimeProvider r1 = r5.currentTimeProvider     // Catch: java.lang.Exception -> L5f
            long r3 = r1.getCurrentTimeMillis()     // Catch: java.lang.Exception -> L5f
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r1 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION     // Catch: java.lang.Exception -> L5f
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Exception -> L5f
            if (r6 != 0) goto L3d
            boolean r6 = r2.isExpired(r3)     // Catch: java.lang.Exception -> L5f
            if (r6 != 0) goto L33
            goto L3d
        L33:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Exception -> L5f
            java.lang.String r1 = "Cached settings have expired."
            r6.v(r1)     // Catch: java.lang.Exception -> L5f
            goto L69
        L3d:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = "Returning cached settings."
            r6.v(r0)     // Catch: java.lang.Exception -> L48
            r0 = r2
            goto L69
        L48:
            r6 = move-exception
            r0 = r2
            goto L60
        L4b:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Exception -> L5f
            java.lang.String r1 = "Failed to parse cached settings data."
            r6.e(r1, r0)     // Catch: java.lang.Exception -> L5f
            goto L69
        L55:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Exception -> L5f
            java.lang.String r1 = "No cached settings data found."
            r6.d(r1)     // Catch: java.lang.Exception -> L5f
            goto L69
        L5f:
            r6 = move-exception
        L60:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Failed to get cached settings"
            r1.e(r2, r6)
        L69:
            return r0
    }

    private java.lang.String getStoredBuildInstanceIdentifier() {
            r3 = this;
            android.content.Context r0 = r3.context
            android.content.SharedPreferences r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.getSharedPrefs(r0)
            java.lang.String r1 = "existing_instance_identifier"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    private void logSettings(org.json.JSONObject r3, java.lang.String r4) {
            r2 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.d(r3)
            return
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    private boolean setStoredBuildInstanceIdentifier(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            android.content.SharedPreferences r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.getSharedPrefs(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "existing_instance_identifier"
            r0.putString(r1, r3)
            r0.apply()
            r3 = 1
            return r3
    }

    boolean buildInstanceIdentifierChanged() {
            r2 = this;
            java.lang.String r0 = r2.getStoredBuildInstanceIdentifier()
            com.google.firebase.crashlytics.internal.settings.SettingsRequest r1 = r2.settingsRequest
            java.lang.String r1 = r1.instanceId
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public com.google.android.gms.tasks.Task<com.google.firebase.crashlytics.internal.settings.Settings> getSettingsAsync() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.settings.Settings>> r0 = r1.settingsTask
            java.lang.Object r0 = r0.get()
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public com.google.firebase.crashlytics.internal.settings.Settings getSettingsSync() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.settings.Settings> r0 = r1.settings
            java.lang.Object r0 = r0.get()
            com.google.firebase.crashlytics.internal.settings.Settings r0 = (com.google.firebase.crashlytics.internal.settings.Settings) r0
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> loadSettingsData(com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r0 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.USE_CACHE
            com.google.android.gms.tasks.Task r2 = r1.loadSettingsData(r0, r2)
            return r2
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> loadSettingsData(com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r3, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r4) {
            r2 = this;
            boolean r0 = r2.buildInstanceIdentifierChanged()
            if (r0 != 0) goto L22
            com.google.firebase.crashlytics.internal.settings.Settings r3 = r2.getCachedSettingsData(r3)
            if (r3 == 0) goto L22
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.settings.Settings> r4 = r2.settings
            r4.set(r3)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.settings.Settings>> r4 = r2.settingsTask
            java.lang.Object r4 = r4.get()
            com.google.android.gms.tasks.TaskCompletionSource r4 = (com.google.android.gms.tasks.TaskCompletionSource) r4
            r4.trySetResult(r3)
            r3 = 0
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r3)
            return r3
        L22:
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r3 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION
            com.google.firebase.crashlytics.internal.settings.Settings r3 = r2.getCachedSettingsData(r3)
            if (r3 == 0) goto L3a
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.settings.Settings> r0 = r2.settings
            r0.set(r3)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.settings.Settings>> r0 = r2.settingsTask
            java.lang.Object r0 = r0.get()
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            r0.trySetResult(r3)
        L3a:
            com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r3 = r2.dataCollectionArbiter
            com.google.android.gms.tasks.Task r3 = r3.waitForDataCollectionPermission()
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = r4.common
            com.google.firebase.crashlytics.internal.settings.SettingsController$1 r1 = new com.google.firebase.crashlytics.internal.settings.SettingsController$1
            r1.<init>(r2, r4)
            com.google.android.gms.tasks.Task r3 = r3.onSuccessTask(r0, r1)
            return r3
    }
}
