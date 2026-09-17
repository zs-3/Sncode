package com.google.firebase.sessions;

/* compiled from: SessionDatastore.kt */
/* loaded from: classes2.dex */
public final class SessionDatastoreImpl implements com.google.firebase.sessions.SessionDatastore {
    private static final com.google.firebase.sessions.SessionDatastoreImpl.Companion Companion = null;
    private static final kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> dataStore$delegate = null;
    private final kotlin.coroutines.CoroutineContext backgroundDispatcher;
    private final android.content.Context context;
    private final java.util.concurrent.atomic.AtomicReference<com.google.firebase.sessions.FirebaseSessionsData> currentSessionFromDatastore;
    private final kotlinx.coroutines.flow.Flow<com.google.firebase.sessions.FirebaseSessionsData> firebaseSessionDataFlow;

    /* compiled from: SessionDatastore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;
        final /* synthetic */ com.google.firebase.sessions.SessionDatastoreImpl this$0;


        AnonymousClass1(com.google.firebase.sessions.SessionDatastoreImpl r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionDatastoreImpl.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                com.google.firebase.sessions.SessionDatastoreImpl$1 r2 = new com.google.firebase.sessions.SessionDatastoreImpl$1
                com.google.firebase.sessions.SessionDatastoreImpl r0 = r1.this$0
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
                com.google.firebase.sessions.SessionDatastoreImpl$1 r1 = (com.google.firebase.sessions.SessionDatastoreImpl.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r5)
                goto L30
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                com.google.firebase.sessions.SessionDatastoreImpl r5 = r4.this$0
                kotlinx.coroutines.flow.Flow r5 = com.google.firebase.sessions.SessionDatastoreImpl.access$getFirebaseSessionDataFlow$p(r5)
                com.google.firebase.sessions.SessionDatastoreImpl$1$1 r1 = new com.google.firebase.sessions.SessionDatastoreImpl$1$1
                com.google.firebase.sessions.SessionDatastoreImpl r3 = r4.this$0
                r1.<init>(r3)
                r4.label = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L30
                return r0
            L30:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
        }
    }

    /* compiled from: SessionDatastore.kt */
    private static final class Companion {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = null;

        static {
                r0 = 1
                kotlin.reflect.KProperty[] r0 = new kotlin.reflect.KProperty[r0]
                kotlin.jvm.internal.PropertyReference2Impl r1 = new kotlin.jvm.internal.PropertyReference2Impl
                java.lang.Class<com.google.firebase.sessions.SessionDatastoreImpl$Companion> r2 = com.google.firebase.sessions.SessionDatastoreImpl.Companion.class
                java.lang.String r3 = "dataStore"
                java.lang.String r4 = "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"
                r5 = 0
                r1.<init>(r2, r3, r4, r5)
                kotlin.reflect.KProperty2 r1 = kotlin.jvm.internal.Reflection.property2(r1)
                r0[r5] = r1
                com.google.firebase.sessions.SessionDatastoreImpl.Companion.$$delegatedProperties = r0
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

        public static final /* synthetic */ androidx.datastore.core.DataStore access$getDataStore(com.google.firebase.sessions.SessionDatastoreImpl.Companion r0, android.content.Context r1) {
                androidx.datastore.core.DataStore r0 = r0.getDataStore(r1)
                return r0
        }

        private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(android.content.Context r4) {
                r3 = this;
                kotlin.properties.ReadOnlyProperty r0 = com.google.firebase.sessions.SessionDatastoreImpl.access$getDataStore$delegate$cp()
                kotlin.reflect.KProperty<java.lang.Object>[] r1 = com.google.firebase.sessions.SessionDatastoreImpl.Companion.$$delegatedProperties
                r2 = 0
                r1 = r1[r2]
                java.lang.Object r4 = r0.getValue(r4, r1)
                androidx.datastore.core.DataStore r4 = (androidx.datastore.core.DataStore) r4
                return r4
        }
    }

    /* compiled from: SessionDatastore.kt */
    private static final class FirebaseSessionDataKeys {
        public static final com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys INSTANCE = null;
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> SESSION_ID = null;

        static {
                com.google.firebase.sessions.SessionDatastoreImpl$FirebaseSessionDataKeys r0 = new com.google.firebase.sessions.SessionDatastoreImpl$FirebaseSessionDataKeys
                r0.<init>()
                com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys.INSTANCE = r0
                java.lang.String r0 = "session_id"
                androidx.datastore.preferences.core.Preferences$Key r0 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r0)
                com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys.SESSION_ID = r0
                return
        }

        private FirebaseSessionDataKeys() {
                r0 = this;
                r0.<init>()
                return
        }

        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getSESSION_ID() {
                r1 = this;
                androidx.datastore.preferences.core.Preferences$Key<java.lang.String> r0 = com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys.SESSION_ID
                return r0
        }
    }

    /* compiled from: SessionDatastore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {89}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1, reason: invalid class name and case insensitive filesystem */
    static final class C00351 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $sessionId;
        int label;
        final /* synthetic */ com.google.firebase.sessions.SessionDatastoreImpl this$0;

        /* compiled from: SessionDatastore.kt */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00151 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ java.lang.String $sessionId;
            /* synthetic */ java.lang.Object L$0;
            int label;

            C00151(java.lang.String r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionDatastoreImpl.C00351.C00151> r2) {
                    r0 = this;
                    r0.$sessionId = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                    r2 = this;
                    com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1 r0 = new com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1
                    java.lang.String r1 = r2.$sessionId
                    r0.<init>(r1, r4)
                    r0.L$0 = r3
                    return r0
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(androidx.datastore.preferences.core.MutablePreferences r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                    r0 = this;
                    kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                    com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1 r1 = (com.google.firebase.sessions.SessionDatastoreImpl.C00351.C00151) r1
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
                    if (r0 != 0) goto L1c
                    kotlin.ResultKt.throwOnFailure(r3)
                    java.lang.Object r3 = r2.L$0
                    androidx.datastore.preferences.core.MutablePreferences r3 = (androidx.datastore.preferences.core.MutablePreferences) r3
                    com.google.firebase.sessions.SessionDatastoreImpl$FirebaseSessionDataKeys r0 = com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys.INSTANCE
                    androidx.datastore.preferences.core.Preferences$Key r0 = r0.getSESSION_ID()
                    java.lang.String r1 = r2.$sessionId
                    r3.set(r0, r1)
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                L1c:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r3.<init>(r0)
                    throw r3
            }
        }

        C00351(com.google.firebase.sessions.SessionDatastoreImpl r1, java.lang.String r2, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionDatastoreImpl.C00351> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$sessionId = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1 r3 = new com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1
                com.google.firebase.sessions.SessionDatastoreImpl r0 = r2.this$0
                java.lang.String r1 = r2.$sessionId
                r3.<init>(r0, r1, r4)
                return r3
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
                com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1 r1 = (com.google.firebase.sessions.SessionDatastoreImpl.C00351) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.io.IOException -> Lf
                goto L51
            Lf:
                r6 = move-exception
                goto L3b
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                kotlin.ResultKt.throwOnFailure(r6)
                com.google.firebase.sessions.SessionDatastoreImpl$Companion r6 = com.google.firebase.sessions.SessionDatastoreImpl.access$getCompanion$p()     // Catch: java.io.IOException -> Lf
                com.google.firebase.sessions.SessionDatastoreImpl r1 = r5.this$0     // Catch: java.io.IOException -> Lf
                android.content.Context r1 = com.google.firebase.sessions.SessionDatastoreImpl.access$getContext$p(r1)     // Catch: java.io.IOException -> Lf
                androidx.datastore.core.DataStore r6 = com.google.firebase.sessions.SessionDatastoreImpl.Companion.access$getDataStore(r6, r1)     // Catch: java.io.IOException -> Lf
                com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1 r1 = new com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1     // Catch: java.io.IOException -> Lf
                java.lang.String r3 = r5.$sessionId     // Catch: java.io.IOException -> Lf
                r4 = 0
                r1.<init>(r3, r4)     // Catch: java.io.IOException -> Lf
                r5.label = r2     // Catch: java.io.IOException -> Lf
                java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r6, r1, r5)     // Catch: java.io.IOException -> Lf
                if (r6 != r0) goto L51
                return r0
            L3b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to update session Id: "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                java.lang.String r0 = "FirebaseSessionsRepo"
                android.util.Log.w(r0, r6)
            L51:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }

    static {
            com.google.firebase.sessions.SessionDatastoreImpl$Companion r0 = new com.google.firebase.sessions.SessionDatastoreImpl$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.SessionDatastoreImpl.Companion = r0
            com.google.firebase.sessions.SessionDataStoreConfigs r0 = com.google.firebase.sessions.SessionDataStoreConfigs.INSTANCE
            java.lang.String r1 = r0.getSESSIONS_CONFIG_NAME()
            androidx.datastore.core.handlers.ReplaceFileCorruptionHandler r2 = new androidx.datastore.core.handlers.ReplaceFileCorruptionHandler
            com.google.firebase.sessions.SessionDatastoreImpl$Companion$dataStore$2 r0 = com.google.firebase.sessions.SessionDatastoreImpl$Companion$dataStore$2.INSTANCE
            r2.<init>(r0)
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            kotlin.properties.ReadOnlyProperty r0 = androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default(r1, r2, r3, r4, r5, r6)
            com.google.firebase.sessions.SessionDatastoreImpl.dataStore$delegate = r0
            return
    }

    public SessionDatastoreImpl(android.content.Context r9, kotlin.coroutines.CoroutineContext r10) {
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r8.<init>()
            r8.context = r9
            r8.backgroundDispatcher = r10
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r8.currentSessionFromDatastore = r0
            com.google.firebase.sessions.SessionDatastoreImpl$Companion r0 = com.google.firebase.sessions.SessionDatastoreImpl.Companion
            androidx.datastore.core.DataStore r9 = com.google.firebase.sessions.SessionDatastoreImpl.Companion.access$getDataStore(r0, r9)
            kotlinx.coroutines.flow.Flow r9 = r9.getData()
            com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1 r0 = new com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.flow.Flow r9 = kotlinx.coroutines.flow.FlowKt.m123catch(r9, r0)
            com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1 r0 = new com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1
            r0.<init>(r9, r8)
            r8.firebaseSessionDataFlow = r0
            kotlinx.coroutines.CoroutineScope r2 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r10)
            com.google.firebase.sessions.SessionDatastoreImpl$1 r5 = new com.google.firebase.sessions.SessionDatastoreImpl$1
            r5.<init>(r8, r1)
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            return
    }

    public static final /* synthetic */ com.google.firebase.sessions.SessionDatastoreImpl.Companion access$getCompanion$p() {
            com.google.firebase.sessions.SessionDatastoreImpl$Companion r0 = com.google.firebase.sessions.SessionDatastoreImpl.Companion
            return r0
    }

    public static final /* synthetic */ android.content.Context access$getContext$p(com.google.firebase.sessions.SessionDatastoreImpl r0) {
            android.content.Context r0 = r0.context
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReference access$getCurrentSessionFromDatastore$p(com.google.firebase.sessions.SessionDatastoreImpl r0) {
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.sessions.FirebaseSessionsData> r0 = r0.currentSessionFromDatastore
            return r0
    }

    public static final /* synthetic */ kotlin.properties.ReadOnlyProperty access$getDataStore$delegate$cp() {
            kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> r0 = com.google.firebase.sessions.SessionDatastoreImpl.dataStore$delegate
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.Flow access$getFirebaseSessionDataFlow$p(com.google.firebase.sessions.SessionDatastoreImpl r0) {
            kotlinx.coroutines.flow.Flow<com.google.firebase.sessions.FirebaseSessionsData> r0 = r0.firebaseSessionDataFlow
            return r0
    }

    public static final /* synthetic */ com.google.firebase.sessions.FirebaseSessionsData access$mapSessionsData(com.google.firebase.sessions.SessionDatastoreImpl r0, androidx.datastore.preferences.core.Preferences r1) {
            com.google.firebase.sessions.FirebaseSessionsData r0 = r0.mapSessionsData(r1)
            return r0
    }

    private final com.google.firebase.sessions.FirebaseSessionsData mapSessionsData(androidx.datastore.preferences.core.Preferences r3) {
            r2 = this;
            com.google.firebase.sessions.FirebaseSessionsData r0 = new com.google.firebase.sessions.FirebaseSessionsData
            com.google.firebase.sessions.SessionDatastoreImpl$FirebaseSessionDataKeys r1 = com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys.INSTANCE
            androidx.datastore.preferences.core.Preferences$Key r1 = r1.getSESSION_ID()
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.<init>(r3)
            return r0
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public java.lang.String getCurrentSessionId() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.sessions.FirebaseSessionsData> r0 = r1.currentSessionFromDatastore
            java.lang.Object r0 = r0.get()
            com.google.firebase.sessions.FirebaseSessionsData r0 = (com.google.firebase.sessions.FirebaseSessionsData) r0
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.getSessionId()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public void updateSessionId(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "sessionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.coroutines.CoroutineContext r0 = r7.backgroundDispatcher
            kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
            com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1 r4 = new com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            return
    }
}
