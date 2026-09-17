package com.google.firebase.sessions.settings;

/* compiled from: SessionsSettings.kt */
/* loaded from: classes2.dex */
public final class SessionsSettings {
    public static final com.google.firebase.sessions.settings.SessionsSettings.Companion Companion = null;
    private static final kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> dataStore$delegate = null;
    private final com.google.firebase.sessions.settings.SettingsProvider localOverrideSettings;
    private final com.google.firebase.sessions.settings.SettingsProvider remoteSettings;

    /* compiled from: SessionsSettings.kt */
    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = null;

        static {
                r0 = 1
                kotlin.reflect.KProperty[] r0 = new kotlin.reflect.KProperty[r0]
                kotlin.jvm.internal.PropertyReference2Impl r1 = new kotlin.jvm.internal.PropertyReference2Impl
                java.lang.Class<com.google.firebase.sessions.settings.SessionsSettings$Companion> r2 = com.google.firebase.sessions.settings.SessionsSettings.Companion.class
                java.lang.String r3 = "dataStore"
                java.lang.String r4 = "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"
                r5 = 0
                r1.<init>(r2, r3, r4, r5)
                kotlin.reflect.KProperty2 r1 = kotlin.jvm.internal.Reflection.property2(r1)
                r0[r5] = r1
                com.google.firebase.sessions.settings.SessionsSettings.Companion.$$delegatedProperties = r0
                return
        }

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

        public static final /* synthetic */ androidx.datastore.core.DataStore access$getDataStore(com.google.firebase.sessions.settings.SessionsSettings.Companion r0, android.content.Context r1) {
                androidx.datastore.core.DataStore r0 = r0.getDataStore(r1)
                return r0
        }

        private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(android.content.Context r4) {
                r3 = this;
                kotlin.properties.ReadOnlyProperty r0 = com.google.firebase.sessions.settings.SessionsSettings.access$getDataStore$delegate$cp()
                kotlin.reflect.KProperty<java.lang.Object>[] r1 = com.google.firebase.sessions.settings.SessionsSettings.Companion.$$delegatedProperties
                r2 = 0
                r1 = r1[r2]
                java.lang.Object r4 = r0.getValue(r4, r1)
                androidx.datastore.core.DataStore r4 = (androidx.datastore.core.DataStore) r4
                return r4
        }

        public final com.google.firebase.sessions.settings.SessionsSettings getInstance() {
                r2 = this;
                com.google.firebase.Firebase r0 = com.google.firebase.Firebase.INSTANCE
                com.google.firebase.FirebaseApp r0 = com.google.firebase.FirebaseKt.getApp(r0)
                java.lang.Class<com.google.firebase.sessions.settings.SessionsSettings> r1 = com.google.firebase.sessions.settings.SessionsSettings.class
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r1 = "Firebase.app[SessionsSettings::class.java]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                com.google.firebase.sessions.settings.SessionsSettings r0 = (com.google.firebase.sessions.settings.SessionsSettings) r0
                return r0
        }
    }

    /* compiled from: SessionsSettings.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {138, 139}, m = "updateSettings")
    /* renamed from: com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.google.firebase.sessions.settings.SessionsSettings this$0;

        AnonymousClass1(com.google.firebase.sessions.settings.SessionsSettings r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1> r2) {
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
                com.google.firebase.sessions.settings.SessionsSettings r2 = r1.this$0
                java.lang.Object r2 = r2.updateSettings(r1)
                return r2
        }
    }

    static {
            com.google.firebase.sessions.settings.SessionsSettings$Companion r0 = new com.google.firebase.sessions.settings.SessionsSettings$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.settings.SessionsSettings.Companion = r0
            com.google.firebase.sessions.SessionDataStoreConfigs r0 = com.google.firebase.sessions.SessionDataStoreConfigs.INSTANCE
            java.lang.String r1 = r0.getSETTINGS_CONFIG_NAME()
            androidx.datastore.core.handlers.ReplaceFileCorruptionHandler r2 = new androidx.datastore.core.handlers.ReplaceFileCorruptionHandler
            com.google.firebase.sessions.settings.SessionsSettings$Companion$dataStore$2 r0 = com.google.firebase.sessions.settings.SessionsSettings$Companion$dataStore$2.INSTANCE
            r2.<init>(r0)
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            kotlin.properties.ReadOnlyProperty r0 = androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default(r1, r2, r3, r4, r5, r6)
            com.google.firebase.sessions.settings.SessionsSettings.dataStore$delegate = r0
            return
    }

    private SessionsSettings(android.content.Context r10, kotlin.coroutines.CoroutineContext r11, kotlin.coroutines.CoroutineContext r12, com.google.firebase.installations.FirebaseInstallationsApi r13, com.google.firebase.sessions.ApplicationInfo r14) {
            r9 = this;
            com.google.firebase.sessions.settings.LocalOverrideSettings r0 = new com.google.firebase.sessions.settings.LocalOverrideSettings
            r0.<init>(r10)
            com.google.firebase.sessions.settings.RemoteSettings r7 = new com.google.firebase.sessions.settings.RemoteSettings
            com.google.firebase.sessions.settings.RemoteSettingsFetcher r8 = new com.google.firebase.sessions.settings.RemoteSettingsFetcher
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r2 = r14
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.firebase.sessions.settings.SessionsSettings$Companion r11 = com.google.firebase.sessions.settings.SessionsSettings.Companion
            androidx.datastore.core.DataStore r6 = com.google.firebase.sessions.settings.SessionsSettings.Companion.access$getDataStore(r11, r10)
            r1 = r7
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r9.<init>(r0, r7)
            return
    }

    public SessionsSettings(com.google.firebase.FirebaseApp r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.CoroutineContext r10, com.google.firebase.installations.FirebaseInstallationsApi r11) {
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            android.content.Context r2 = r8.getApplicationContext()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            com.google.firebase.sessions.SessionEvents r0 = com.google.firebase.sessions.SessionEvents.INSTANCE
            com.google.firebase.sessions.ApplicationInfo r6 = r0.getApplicationInfo(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public SessionsSettings(com.google.firebase.sessions.settings.SettingsProvider r2, com.google.firebase.sessions.settings.SettingsProvider r3) {
            r1 = this;
            java.lang.String r0 = "localOverrideSettings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "remoteSettings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.localOverrideSettings = r2
            r1.remoteSettings = r3
            return
    }

    public static final /* synthetic */ kotlin.properties.ReadOnlyProperty access$getDataStore$delegate$cp() {
            kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> r0 = com.google.firebase.sessions.settings.SessionsSettings.dataStore$delegate
            return r0
    }

    private final boolean isValidSamplingRate(double r5) {
            r4 = this;
            r0 = 0
            r1 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto Le
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto Le
            r0 = 1
        Le:
            return r0
    }

    /* renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m70isValidSessionRestartTimeoutLRDsOJo(long r2) {
            r1 = this;
            boolean r0 = kotlin.time.Duration.m99isPositiveimpl(r2)
            if (r0 == 0) goto Le
            boolean r2 = kotlin.time.Duration.m94isFiniteimpl(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public final double getSamplingRate() {
            r3 = this;
            com.google.firebase.sessions.settings.SettingsProvider r0 = r3.localOverrideSettings
            java.lang.Double r0 = r0.getSamplingRate()
            if (r0 == 0) goto L13
            double r0 = r0.doubleValue()
            boolean r2 = r3.isValidSamplingRate(r0)
            if (r2 == 0) goto L13
            return r0
        L13:
            com.google.firebase.sessions.settings.SettingsProvider r0 = r3.remoteSettings
            java.lang.Double r0 = r0.getSamplingRate()
            if (r0 == 0) goto L26
            double r0 = r0.doubleValue()
            boolean r2 = r3.isValidSamplingRate(r0)
            if (r2 == 0) goto L26
            return r0
        L26:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r0
    }

    /* renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m71getSessionRestartTimeoutUwyO8pc() {
            r3 = this;
            com.google.firebase.sessions.settings.SettingsProvider r0 = r3.localOverrideSettings
            kotlin.time.Duration r0 = r0.mo69getSessionRestartTimeoutFghU774()
            if (r0 == 0) goto L13
            long r0 = r0.m104unboximpl()
            boolean r2 = r3.m70isValidSessionRestartTimeoutLRDsOJo(r0)
            if (r2 == 0) goto L13
            return r0
        L13:
            com.google.firebase.sessions.settings.SettingsProvider r0 = r3.remoteSettings
            kotlin.time.Duration r0 = r0.mo69getSessionRestartTimeoutFghU774()
            if (r0 == 0) goto L26
            long r0 = r0.m104unboximpl()
            boolean r2 = r3.m70isValidSessionRestartTimeoutLRDsOJo(r0)
            if (r2 == 0) goto L26
            return r0
        L26:
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            r0 = 30
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES
            long r0 = kotlin.time.DurationKt.toDuration(r0, r1)
            return r0
    }

    public final boolean getSessionsEnabled() {
            r1 = this;
            com.google.firebase.sessions.settings.SettingsProvider r0 = r1.localOverrideSettings
            java.lang.Boolean r0 = r0.getSessionEnabled()
            if (r0 == 0) goto Ld
            boolean r0 = r0.booleanValue()
            return r0
        Ld:
            com.google.firebase.sessions.settings.SettingsProvider r0 = r1.remoteSettings
            java.lang.Boolean r0 = r0.getSessionEnabled()
            if (r0 == 0) goto L1a
            boolean r0 = r0.booleanValue()
            return r0
        L1a:
            r0 = 1
            return r0
    }

    public final java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            com.google.firebase.sessions.settings.SessionsSettings r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4d
        L3c:
            kotlin.ResultKt.throwOnFailure(r6)
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.localOverrideSettings
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r2.remoteSettings
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
