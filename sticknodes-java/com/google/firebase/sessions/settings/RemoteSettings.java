package com.google.firebase.sessions.settings;

/* compiled from: RemoteSettings.kt */
/* loaded from: classes2.dex */
public final class RemoteSettings implements com.google.firebase.sessions.settings.SettingsProvider {
    private static final com.google.firebase.sessions.settings.RemoteSettings.Companion Companion = null;
    private final com.google.firebase.sessions.ApplicationInfo appInfo;
    private final kotlin.coroutines.CoroutineContext backgroundDispatcher;
    private final com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher configsFetcher;
    private final kotlinx.coroutines.sync.Mutex fetchInProgress;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi;
    private final kotlin.Lazy settingsCache$delegate;

    /* compiled from: RemoteSettings.kt */
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
    /* renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.google.firebase.sessions.settings.RemoteSettings this$0;

        AnonymousClass1(com.google.firebase.sessions.settings.RemoteSettings r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.RemoteSettings.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                com.google.firebase.sessions.settings.RemoteSettings r2 = r1.this$0
                java.lang.Object r2 = r2.updateSettings(r1)
                return r2
        }
    }

    static {
            com.google.firebase.sessions.settings.RemoteSettings$Companion r0 = new com.google.firebase.sessions.settings.RemoteSettings$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.settings.RemoteSettings.Companion = r0
            return
    }

    public RemoteSettings(kotlin.coroutines.CoroutineContext r2, com.google.firebase.installations.FirebaseInstallationsApi r3, com.google.firebase.sessions.ApplicationInfo r4, com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher r5, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r6) {
            r1 = this;
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "appInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "configsFetcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "dataStore"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.backgroundDispatcher = r2
            r1.firebaseInstallationsApi = r3
            r1.appInfo = r4
            r1.configsFetcher = r5
            com.google.firebase.sessions.settings.RemoteSettings$settingsCache$2 r2 = new com.google.firebase.sessions.settings.RemoteSettings$settingsCache$2
            r2.<init>(r6)
            kotlin.Lazy r2 = kotlin.LazyKt.lazy(r2)
            r1.settingsCache$delegate = r2
            r2 = 0
            r3 = 1
            r4 = 0
            kotlinx.coroutines.sync.Mutex r2 = kotlinx.coroutines.sync.MutexKt.Mutex$default(r2, r3, r4)
            r1.fetchInProgress = r2
            return
    }

    public static final /* synthetic */ com.google.firebase.sessions.settings.SettingsCache access$getSettingsCache(com.google.firebase.sessions.settings.RemoteSettings r0) {
            com.google.firebase.sessions.settings.SettingsCache r0 = r0.getSettingsCache()
            return r0
    }

    private final com.google.firebase.sessions.settings.SettingsCache getSettingsCache() {
            r1 = this;
            kotlin.Lazy r0 = r1.settingsCache$delegate
            java.lang.Object r0 = r0.getValue()
            com.google.firebase.sessions.settings.SettingsCache r0 = (com.google.firebase.sessions.settings.SettingsCache) r0
            return r0
    }

    private final java.lang.String removeForwardSlashesIn(java.lang.String r3) {
            r2 = this;
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "/"
            r0.<init>(r1)
            java.lang.String r1 = ""
            java.lang.String r3 = r0.replace(r3, r1)
            return r3
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Double getSamplingRate() {
            r1 = this;
            com.google.firebase.sessions.settings.SettingsCache r0 = r1.getSettingsCache()
            java.lang.Double r0 = r0.sessionSamplingRate()
            return r0
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Boolean getSessionEnabled() {
            r1 = this;
            com.google.firebase.sessions.settings.SettingsCache r0 = r1.getSettingsCache()
            java.lang.Boolean r0 = r0.sessionsEnabled()
            return r0
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* renamed from: getSessionRestartTimeout-FghU774 */
    public kotlin.time.Duration mo69getSessionRestartTimeoutFghU774() {
            r2 = this;
            com.google.firebase.sessions.settings.SettingsCache r0 = r2.getSettingsCache()
            java.lang.Integer r0 = r0.sessionRestartTimeout()
            if (r0 == 0) goto L1b
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion
            int r0 = r0.intValue()
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.DurationKt.toDuration(r0, r1)
            kotlin.time.Duration r0 = kotlin.time.Duration.m77boximpl(r0)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof com.google.firebase.sessions.settings.RemoteSettings.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r0
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 r2 = (com.google.firebase.sessions.settings.RemoteSettings.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 r2 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            java.lang.String r5 = "SessionConfigFetcher"
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L62
            if (r4 == r8) goto L56
            if (r4 == r7) goto L46
            if (r4 != r6) goto L3e
            java.lang.Object r2 = r2.L$0
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3b
            goto L155
        L3b:
            r0 = move-exception
            goto L15b
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L46:
            java.lang.Object r4 = r2.L$1
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            java.lang.Object r10 = r2.L$0
            com.google.firebase.sessions.settings.RemoteSettings r10 = (com.google.firebase.sessions.settings.RemoteSettings) r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L52
            goto Lb1
        L52:
            r0 = move-exception
            r2 = r4
            goto L15b
        L56:
            java.lang.Object r4 = r2.L$1
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            java.lang.Object r10 = r2.L$0
            com.google.firebase.sessions.settings.RemoteSettings r10 = (com.google.firebase.sessions.settings.RemoteSettings) r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8b
        L62:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.sync.Mutex r0 = r1.fetchInProgress
            boolean r0 = r0.isLocked()
            if (r0 != 0) goto L7a
            com.google.firebase.sessions.settings.SettingsCache r0 = r16.getSettingsCache()
            boolean r0 = r0.hasCacheExpired$com_google_firebase_firebase_sessions()
            if (r0 != 0) goto L7a
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L7a:
            kotlinx.coroutines.sync.Mutex r0 = r1.fetchInProgress
            r2.L$0 = r1
            r2.L$1 = r0
            r2.label = r8
            java.lang.Object r4 = r0.lock(r9, r2)
            if (r4 != r3) goto L89
            return r3
        L89:
            r4 = r0
            r10 = r1
        L8b:
            com.google.firebase.sessions.settings.SettingsCache r0 = r10.getSettingsCache()     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.hasCacheExpired$com_google_firebase_firebase_sessions()     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto La0
            java.lang.String r0 = "Remote settings cache not expired. Using cached values."
            android.util.Log.d(r5, r0)     // Catch: java.lang.Throwable -> L52
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L52
            r4.unlock(r9)
            return r0
        La0:
            com.google.firebase.sessions.InstallationId$Companion r0 = com.google.firebase.sessions.InstallationId.Companion     // Catch: java.lang.Throwable -> L52
            com.google.firebase.installations.FirebaseInstallationsApi r11 = r10.firebaseInstallationsApi     // Catch: java.lang.Throwable -> L52
            r2.L$0 = r10     // Catch: java.lang.Throwable -> L52
            r2.L$1 = r4     // Catch: java.lang.Throwable -> L52
            r2.label = r7     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r0.create(r11, r2)     // Catch: java.lang.Throwable -> L52
            if (r0 != r3) goto Lb1
            return r3
        Lb1:
            com.google.firebase.sessions.InstallationId r0 = (com.google.firebase.sessions.InstallationId) r0     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.getFid()     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = ""
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r11)     // Catch: java.lang.Throwable -> L52
            if (r11 == 0) goto Lca
            java.lang.String r0 = "Error getting Firebase Installation ID. Skipping this Session Event."
            android.util.Log.w(r5, r0)     // Catch: java.lang.Throwable -> L52
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L52
            r4.unlock(r9)
            return r0
        Lca:
            r11 = 5
            kotlin.Pair[] r11 = new kotlin.Pair[r11]     // Catch: java.lang.Throwable -> L52
            java.lang.String r12 = "X-Crashlytics-Installation-ID"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r12, r0)     // Catch: java.lang.Throwable -> L52
            r12 = 0
            r11[r12] = r0     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "X-Crashlytics-Device-Model"
            kotlin.jvm.internal.StringCompanionObject r13 = kotlin.jvm.internal.StringCompanionObject.INSTANCE     // Catch: java.lang.Throwable -> L52
            java.lang.String r13 = "%s/%s"
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L52
            java.lang.String r15 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L52
            r14[r12] = r15     // Catch: java.lang.Throwable -> L52
            java.lang.String r12 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L52
            r14[r8] = r12     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r14, r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r12 = java.lang.String.format(r13, r12)     // Catch: java.lang.Throwable -> L52
            java.lang.String r13 = "format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)     // Catch: java.lang.Throwable -> L52
            java.lang.String r12 = r10.removeForwardSlashesIn(r12)     // Catch: java.lang.Throwable -> L52
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r12)     // Catch: java.lang.Throwable -> L52
            r11[r8] = r0     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "X-Crashlytics-OS-Build-Version"
            java.lang.String r8 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.Throwable -> L52
            java.lang.String r12 = "INCREMENTAL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r12)     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r10.removeForwardSlashesIn(r8)     // Catch: java.lang.Throwable -> L52
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r8)     // Catch: java.lang.Throwable -> L52
            r11[r7] = r0     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "X-Crashlytics-OS-Display-Version"
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = "RELEASE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = r10.removeForwardSlashesIn(r7)     // Catch: java.lang.Throwable -> L52
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r7)     // Catch: java.lang.Throwable -> L52
            r11[r6] = r0     // Catch: java.lang.Throwable -> L52
            r0 = 4
            java.lang.String r7 = "X-Crashlytics-API-Client-Version"
            com.google.firebase.sessions.ApplicationInfo r8 = r10.appInfo     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r8.getSessionSdkVersion()     // Catch: java.lang.Throwable -> L52
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)     // Catch: java.lang.Throwable -> L52
            r11[r0] = r7     // Catch: java.lang.Throwable -> L52
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = "Fetching settings from server."
            android.util.Log.d(r5, r7)     // Catch: java.lang.Throwable -> L52
            com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher r5 = r10.configsFetcher     // Catch: java.lang.Throwable -> L52
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 r7 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1     // Catch: java.lang.Throwable -> L52
            r7.<init>(r10, r9)     // Catch: java.lang.Throwable -> L52
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2 r8 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2     // Catch: java.lang.Throwable -> L52
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L52
            r2.L$0 = r4     // Catch: java.lang.Throwable -> L52
            r2.L$1 = r9     // Catch: java.lang.Throwable -> L52
            r2.label = r6     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r5.doConfigFetch(r0, r7, r8, r2)     // Catch: java.lang.Throwable -> L52
            if (r0 != r3) goto L154
            return r3
        L154:
            r2 = r4
        L155:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3b
            r2.unlock(r9)
            return r0
        L15b:
            r2.unlock(r9)
            throw r0
    }
}
