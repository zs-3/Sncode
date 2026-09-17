package com.google.firebase.sessions.settings;

/* compiled from: SettingsCache.kt */
/* loaded from: classes2.dex */
public final class SettingsCache {
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> CACHE_DURATION_SECONDS = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> CACHE_UPDATED_TIME = null;
    private static final com.google.firebase.sessions.settings.SettingsCache.Companion Companion = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> RESTART_TIMEOUT_SECONDS = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> SAMPLING_RATE = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> SESSIONS_ENABLED = null;
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore;
    private com.google.firebase.sessions.settings.SessionConfigs sessionConfigs;

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object L$0;
        int label;
        final /* synthetic */ com.google.firebase.sessions.settings.SettingsCache this$0;

        AnonymousClass1(com.google.firebase.sessions.settings.SettingsCache r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SettingsCache.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                com.google.firebase.sessions.settings.SettingsCache$1 r2 = new com.google.firebase.sessions.settings.SettingsCache$1
                com.google.firebase.sessions.settings.SettingsCache r0 = r1.this$0
                r2.<init>(r0, r3)
                return r2
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.google.firebase.sessions.settings.SettingsCache$1 r1 = (com.google.firebase.sessions.settings.SettingsCache.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r3.L$0
                com.google.firebase.sessions.settings.SettingsCache r0 = (com.google.firebase.sessions.settings.SettingsCache) r0
                kotlin.ResultKt.throwOnFailure(r4)
                goto L35
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                kotlin.ResultKt.throwOnFailure(r4)
                com.google.firebase.sessions.settings.SettingsCache r4 = r3.this$0
                androidx.datastore.core.DataStore r1 = com.google.firebase.sessions.settings.SettingsCache.access$getDataStore$p(r4)
                kotlinx.coroutines.flow.Flow r1 = r1.getData()
                r3.L$0 = r4
                r3.label = r2
                java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r3)
                if (r1 != r0) goto L33
                return r0
            L33:
                r0 = r4
                r4 = r1
            L35:
                androidx.datastore.preferences.core.Preferences r4 = (androidx.datastore.preferences.core.Preferences) r4
                androidx.datastore.preferences.core.Preferences r4 = r4.toPreferences()
                com.google.firebase.sessions.settings.SettingsCache.access$updateSessionConfigs(r0, r4)
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
        }
    }

    /* compiled from: SettingsCache.kt */
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

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {119}, m = "updateConfigValue")
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1, reason: invalid class name and case insensitive filesystem */
    static final class C00371<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.google.firebase.sessions.settings.SettingsCache this$0;

        C00371(com.google.firebase.sessions.settings.SettingsCache r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SettingsCache.C00371> r2) {
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
                com.google.firebase.sessions.settings.SettingsCache r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = com.google.firebase.sessions.settings.SettingsCache.access$updateConfigValue(r2, r0, r0, r1)
                return r2
        }
    }

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key<T> $key;
        final /* synthetic */ T $value;
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ com.google.firebase.sessions.settings.SettingsCache this$0;

        AnonymousClass2(T r1, androidx.datastore.preferences.core.Preferences.Key<T> r2, com.google.firebase.sessions.settings.SettingsCache r3, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SettingsCache.AnonymousClass2> r4) {
                r0 = this;
                r0.$value = r1
                r0.$key = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r0 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2
                T r1 = r4.$value
                androidx.datastore.preferences.core.Preferences$Key<T> r2 = r4.$key
                com.google.firebase.sessions.settings.SettingsCache r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(androidx.datastore.preferences.core.MutablePreferences r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r1 = (com.google.firebase.sessions.settings.SettingsCache.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(androidx.datastore.preferences.core.MutablePreferences r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                androidx.datastore.preferences.core.MutablePreferences r1 = (androidx.datastore.preferences.core.MutablePreferences) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r2.label
                if (r0 != 0) goto L25
                kotlin.ResultKt.throwOnFailure(r3)
                java.lang.Object r3 = r2.L$0
                androidx.datastore.preferences.core.MutablePreferences r3 = (androidx.datastore.preferences.core.MutablePreferences) r3
                T r0 = r2.$value
                if (r0 == 0) goto L18
                androidx.datastore.preferences.core.Preferences$Key<T> r1 = r2.$key
                r3.set(r1, r0)
                goto L1d
            L18:
                androidx.datastore.preferences.core.Preferences$Key<T> r0 = r2.$key
                r3.remove(r0)
            L1d:
                com.google.firebase.sessions.settings.SettingsCache r0 = r2.this$0
                com.google.firebase.sessions.settings.SettingsCache.access$updateSessionConfigs(r0, r3)
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L25:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
        }
    }

    static {
            com.google.firebase.sessions.settings.SettingsCache$Companion r0 = new com.google.firebase.sessions.settings.SettingsCache$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.settings.SettingsCache.Companion = r0
            java.lang.String r0 = "firebase_sessions_enabled"
            androidx.datastore.preferences.core.Preferences$Key r0 = androidx.datastore.preferences.core.PreferencesKeys.booleanKey(r0)
            com.google.firebase.sessions.settings.SettingsCache.SESSIONS_ENABLED = r0
            java.lang.String r0 = "firebase_sessions_sampling_rate"
            androidx.datastore.preferences.core.Preferences$Key r0 = androidx.datastore.preferences.core.PreferencesKeys.doubleKey(r0)
            com.google.firebase.sessions.settings.SettingsCache.SAMPLING_RATE = r0
            java.lang.String r0 = "firebase_sessions_restart_timeout"
            androidx.datastore.preferences.core.Preferences$Key r0 = androidx.datastore.preferences.core.PreferencesKeys.intKey(r0)
            com.google.firebase.sessions.settings.SettingsCache.RESTART_TIMEOUT_SECONDS = r0
            java.lang.String r0 = "firebase_sessions_cache_duration"
            androidx.datastore.preferences.core.Preferences$Key r0 = androidx.datastore.preferences.core.PreferencesKeys.intKey(r0)
            com.google.firebase.sessions.settings.SettingsCache.CACHE_DURATION_SECONDS = r0
            java.lang.String r0 = "firebase_sessions_cache_updated_time"
            androidx.datastore.preferences.core.Preferences$Key r0 = androidx.datastore.preferences.core.PreferencesKeys.longKey(r0)
            com.google.firebase.sessions.settings.SettingsCache.CACHE_UPDATED_TIME = r0
            return
    }

    public SettingsCache(androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r3) {
            r2 = this;
            java.lang.String r0 = "dataStore"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            r2.dataStore = r3
            com.google.firebase.sessions.settings.SettingsCache$1 r3 = new com.google.firebase.sessions.settings.SettingsCache$1
            r0 = 0
            r3.<init>(r2, r0)
            r1 = 1
            kotlinx.coroutines.BuildersKt.runBlocking$default(r0, r3, r1, r0)
            return
    }

    public static final /* synthetic */ androidx.datastore.core.DataStore access$getDataStore$p(com.google.firebase.sessions.settings.SettingsCache r0) {
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r0 = r0.dataStore
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$updateConfigValue(com.google.firebase.sessions.settings.SettingsCache r0, androidx.datastore.preferences.core.Preferences.Key r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.updateConfigValue(r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ void access$updateSessionConfigs(com.google.firebase.sessions.settings.SettingsCache r0, androidx.datastore.preferences.core.Preferences r1) {
            r0.updateSessionConfigs(r1)
            return
    }

    private final <T> java.lang.Object updateConfigValue(androidx.datastore.preferences.core.Preferences.Key<T> r6, T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.SettingsCache.C00371
            if (r0 == 0) goto L13
            r0 = r8
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = (com.google.firebase.sessions.settings.SettingsCache.C00371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r8 = r5.dataStore     // Catch: java.io.IOException -> L29
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.label = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    private final void updateSessionConfigs(androidx.datastore.preferences.core.Preferences r8) {
            r7 = this;
            com.google.firebase.sessions.settings.SessionConfigs r6 = new com.google.firebase.sessions.settings.SessionConfigs
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Boolean> r0 = com.google.firebase.sessions.settings.SettingsCache.SESSIONS_ENABLED
            java.lang.Object r0 = r8.get(r0)
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Double> r0 = com.google.firebase.sessions.settings.SettingsCache.SAMPLING_RATE
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            java.lang.Double r2 = (java.lang.Double) r2
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Integer> r0 = com.google.firebase.sessions.settings.SettingsCache.RESTART_TIMEOUT_SECONDS
            java.lang.Object r0 = r8.get(r0)
            r3 = r0
            java.lang.Integer r3 = (java.lang.Integer) r3
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Integer> r0 = com.google.firebase.sessions.settings.SettingsCache.CACHE_DURATION_SECONDS
            java.lang.Object r0 = r8.get(r0)
            r4 = r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Long> r0 = com.google.firebase.sessions.settings.SettingsCache.CACHE_UPDATED_TIME
            java.lang.Object r8 = r8.get(r0)
            r5 = r8
            java.lang.Long r5 = (java.lang.Long) r5
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r7.sessionConfigs = r6
            return
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
            r6 = this;
            com.google.firebase.sessions.settings.SessionConfigs r0 = r6.sessionConfigs
            r1 = 0
            java.lang.String r2 = "sessionConfigs"
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r0 = r1
        Lb:
            java.lang.Long r0 = r0.getCacheUpdatedTime()
            com.google.firebase.sessions.settings.SessionConfigs r3 = r6.sessionConfigs
            if (r3 != 0) goto L17
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            goto L18
        L17:
            r1 = r3
        L18:
            java.lang.Integer r1 = r1.getCacheDuration()
            if (r0 == 0) goto L38
            if (r1 == 0) goto L38
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.longValue()
            long r2 = r2 - r4
            r0 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r0
            long r2 = r2 / r4
            int r0 = r1.intValue()
            long r0 = (long) r0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L38
            r0 = 0
            return r0
        L38:
            r0 = 1
            return r0
    }

    public final java.lang.Integer sessionRestartTimeout() {
            r1 = this;
            com.google.firebase.sessions.settings.SessionConfigs r0 = r1.sessionConfigs
            if (r0 != 0) goto La
            java.lang.String r0 = "sessionConfigs"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        La:
            java.lang.Integer r0 = r0.getSessionRestartTimeout()
            return r0
    }

    public final java.lang.Double sessionSamplingRate() {
            r1 = this;
            com.google.firebase.sessions.settings.SessionConfigs r0 = r1.sessionConfigs
            if (r0 != 0) goto La
            java.lang.String r0 = "sessionConfigs"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        La:
            java.lang.Double r0 = r0.getSessionSamplingRate()
            return r0
    }

    public final java.lang.Boolean sessionsEnabled() {
            r1 = this;
            com.google.firebase.sessions.settings.SessionConfigs r0 = r1.sessionConfigs
            if (r0 != 0) goto La
            java.lang.String r0 = "sessionConfigs"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        La:
            java.lang.Boolean r0 = r0.getSessionEnabled()
            return r0
    }

    public final java.lang.Object updateSamplingRate(java.lang.Double r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Double> r0 = com.google.firebase.sessions.settings.SettingsCache.SAMPLING_RATE
            java.lang.Object r2 = r1.updateConfigValue(r0, r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto Ld
            return r2
        Ld:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    public final java.lang.Object updateSessionCacheDuration(java.lang.Integer r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Integer> r0 = com.google.firebase.sessions.settings.SettingsCache.CACHE_DURATION_SECONDS
            java.lang.Object r2 = r1.updateConfigValue(r0, r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto Ld
            return r2
        Ld:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    public final java.lang.Object updateSessionCacheUpdatedTime(java.lang.Long r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Long> r0 = com.google.firebase.sessions.settings.SettingsCache.CACHE_UPDATED_TIME
            java.lang.Object r2 = r1.updateConfigValue(r0, r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto Ld
            return r2
        Ld:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    public final java.lang.Object updateSessionRestartTimeout(java.lang.Integer r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Integer> r0 = com.google.firebase.sessions.settings.SettingsCache.RESTART_TIMEOUT_SECONDS
            java.lang.Object r2 = r1.updateConfigValue(r0, r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto Ld
            return r2
        Ld:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    public final java.lang.Object updateSettingsEnabled(java.lang.Boolean r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            androidx.datastore.preferences.core.Preferences$Key<java.lang.Boolean> r0 = com.google.firebase.sessions.settings.SettingsCache.SESSIONS_ENABLED
            java.lang.Object r2 = r1.updateConfigValue(r0, r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto Ld
            return r2
        Ld:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }
}
