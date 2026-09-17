package com.google.firebase.installations;

/* loaded from: classes2.dex */
public class FirebaseInstallations implements com.google.firebase.installations.FirebaseInstallationsApi {
    private static final java.util.concurrent.ThreadFactory THREAD_FACTORY = null;
    private static final java.lang.Object lockGenerateFid = null;
    private final java.util.concurrent.ExecutorService backgroundExecutor;
    private java.lang.String cachedFid;
    private final com.google.firebase.installations.RandomFidGenerator fidGenerator;
    private java.util.Set<com.google.firebase.installations.internal.FidListener> fidListeners;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.components.Lazy<com.google.firebase.installations.local.IidStore> iidStore;
    private final java.util.List<com.google.firebase.installations.StateListener> listeners;
    private final java.lang.Object lock;
    private final java.util.concurrent.Executor networkExecutor;
    private final com.google.firebase.installations.local.PersistedInstallation persistedInstallation;
    private final com.google.firebase.installations.remote.FirebaseInstallationServiceClient serviceClient;
    private final com.google.firebase.installations.Utils utils;


    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode = null;

        static {
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r2 = com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch: java.lang.NoSuchFieldError -> L28
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r4 = 3
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK     // Catch: java.lang.NoSuchFieldError -> L39
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch: java.lang.NoSuchFieldError -> L43
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                return
        }
    }

    /* renamed from: $r8$lambda$6SEja5S9cK7Ud6UX5iIa7pS4u-c, reason: not valid java name */
    public static /* synthetic */ com.google.firebase.installations.local.IidStore m65$r8$lambda$6SEja5S9cK7Ud6UX5iIa7pS4uc(com.google.firebase.FirebaseApp r0) {
            com.google.firebase.installations.local.IidStore r0 = lambda$new$0(r0)
            return r0
    }

    /* renamed from: $r8$lambda$I1grW_4o_Il-PrAI7e2LxaMkrbQ, reason: not valid java name */
    public static /* synthetic */ void m66$r8$lambda$I1grW_4o_IlPrAI7e2LxaMkrbQ(com.google.firebase.installations.FirebaseInstallations r0) {
            r0.lambda$getId$1()
            return
    }

    public static /* synthetic */ void $r8$lambda$Kl2wdAe5utVajeTmV5LyfWUz3Bo(com.google.firebase.installations.FirebaseInstallations r0, boolean r1) {
            r0.lambda$doRegistrationOrRefresh$3(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$s8Wc_68NbCicBO9XFucr3kKSRlQ(com.google.firebase.installations.FirebaseInstallations r0, boolean r1) {
            r0.lambda$getToken$2(r1)
            return
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.firebase.installations.FirebaseInstallations.lockGenerateFid = r0
            com.google.firebase.installations.FirebaseInstallations$1 r0 = new com.google.firebase.installations.FirebaseInstallations$1
            r0.<init>()
            com.google.firebase.installations.FirebaseInstallations.THREAD_FACTORY = r0
            return
    }

    @android.annotation.SuppressLint({"ThreadPoolCreation"})
    FirebaseInstallations(com.google.firebase.FirebaseApp r10, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatController> r11, java.util.concurrent.ExecutorService r12, java.util.concurrent.Executor r13) {
            r9 = this;
            com.google.firebase.installations.remote.FirebaseInstallationServiceClient r4 = new com.google.firebase.installations.remote.FirebaseInstallationServiceClient
            android.content.Context r0 = r10.getApplicationContext()
            r4.<init>(r0, r11)
            com.google.firebase.installations.local.PersistedInstallation r5 = new com.google.firebase.installations.local.PersistedInstallation
            r5.<init>(r10)
            com.google.firebase.installations.Utils r6 = com.google.firebase.installations.Utils.getInstance()
            com.google.firebase.components.Lazy r7 = new com.google.firebase.components.Lazy
            com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda0 r11 = new com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda0
            r11.<init>(r10)
            r7.<init>(r11)
            com.google.firebase.installations.RandomFidGenerator r8 = new com.google.firebase.installations.RandomFidGenerator
            r8.<init>()
            r0 = r9
            r1 = r12
            r2 = r13
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @android.annotation.SuppressLint({"ThreadPoolCreation"})
    FirebaseInstallations(java.util.concurrent.ExecutorService r2, java.util.concurrent.Executor r3, com.google.firebase.FirebaseApp r4, com.google.firebase.installations.remote.FirebaseInstallationServiceClient r5, com.google.firebase.installations.local.PersistedInstallation r6, com.google.firebase.installations.Utils r7, com.google.firebase.components.Lazy<com.google.firebase.installations.local.IidStore> r8, com.google.firebase.installations.RandomFidGenerator r9) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.lock = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.fidListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.listeners = r0
            r1.firebaseApp = r4
            r1.serviceClient = r5
            r1.persistedInstallation = r6
            r1.utils = r7
            r1.iidStore = r8
            r1.fidGenerator = r9
            r1.backgroundExecutor = r2
            r1.networkExecutor = r3
            return
    }

    private com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> addGetAuthTokenListener() {
            r3 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.firebase.installations.GetAuthTokenListener r1 = new com.google.firebase.installations.GetAuthTokenListener
            com.google.firebase.installations.Utils r2 = r3.utils
            r1.<init>(r2, r0)
            r3.addStateListeners(r1)
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }

    private com.google.android.gms.tasks.Task<java.lang.String> addGetIdListener() {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.firebase.installations.GetIdListener r1 = new com.google.firebase.installations.GetIdListener
            r1.<init>(r0)
            r2.addStateListeners(r1)
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }

    private void addStateListeners(com.google.firebase.installations.StateListener r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            java.util.List<com.google.firebase.installations.StateListener> r1 = r2.listeners     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    private void doNetworkCallIfNecessary(boolean r3) {
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r2.getMultiProcessSafePrefs()
            boolean r1 = r0.isErrored()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.isUnregistered()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.Utils r3 = r2.utils     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            boolean r3 = r3.isAuthTokenExpired(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            com.google.firebase.installations.local.PersistedInstallationEntry r3 = r2.fetchAuthTokenFromServer(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            goto L26
        L22:
            com.google.firebase.installations.local.PersistedInstallationEntry r3 = r2.registerFidWithServer(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
        L26:
            r2.insertOrUpdatePrefs(r3)
            r2.updateFidListener(r0, r3)
            boolean r0 = r3.isRegistered()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.getFirebaseInstallationId()
            r2.updateCacheFid(r0)
        L39:
            boolean r0 = r3.isErrored()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
            r2.triggerOnException(r3)
            goto L5e
        L4a:
            boolean r0 = r3.isNotGenerated()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.triggerOnException(r3)
            goto L5e
        L5b:
            r2.triggerOnStateReached(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.triggerOnException(r3)
            return
    }

    private final void doRegistrationOrRefresh(boolean r3) {
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r2.getPrefsWithGeneratedIdMultiProcessSafe()
            if (r3 == 0) goto La
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.withClearedAuthToken()
        La:
            r2.triggerOnStateReached(r0)
            java.util.concurrent.Executor r0 = r2.networkExecutor
            com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda2 r1 = new com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry fetchAuthTokenFromServer(com.google.firebase.installations.local.PersistedInstallationEntry r7) throws com.google.firebase.installations.FirebaseInstallationsException {
            r6 = this;
            com.google.firebase.installations.remote.FirebaseInstallationServiceClient r0 = r6.serviceClient
            java.lang.String r1 = r6.getApiKey()
            java.lang.String r2 = r7.getFirebaseInstallationId()
            java.lang.String r3 = r6.getProjectIdentifier()
            java.lang.String r4 = r7.getRefreshToken()
            com.google.firebase.installations.remote.TokenResult r0 = r0.generateAuthToken(r1, r2, r3, r4)
            int[] r1 = com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode
            com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = r0.getResponseCode()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L45
            r0 = 2
            if (r1 == r0) goto L3e
            r0 = 3
            if (r1 != r0) goto L34
            r0 = 0
            r6.updateCacheFid(r0)
            com.google.firebase.installations.local.PersistedInstallationEntry r7 = r7.withNoGeneratedFid()
            return r7
        L34:
            com.google.firebase.installations.FirebaseInstallationsException r7 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            java.lang.String r1 = "Firebase Installations Service is unavailable. Please try again later."
            r7.<init>(r1, r0)
            throw r7
        L3e:
            java.lang.String r0 = "BAD CONFIG"
            com.google.firebase.installations.local.PersistedInstallationEntry r7 = r7.withFisError(r0)
            return r7
        L45:
            java.lang.String r1 = r0.getToken()
            long r2 = r0.getTokenExpirationTimestamp()
            com.google.firebase.installations.Utils r0 = r6.utils
            long r4 = r0.currentTimeInSecs()
            r0 = r7
            com.google.firebase.installations.local.PersistedInstallationEntry r7 = r0.withAuthToken(r1, r2, r4)
            return r7
    }

    private synchronized java.lang.String getCacheFid() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.cachedFid     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private com.google.firebase.installations.local.IidStore getIidStore() {
            r1 = this;
            com.google.firebase.components.Lazy<com.google.firebase.installations.local.IidStore> r0 = r1.iidStore
            java.lang.Object r0 = r0.get()
            com.google.firebase.installations.local.IidStore r0 = (com.google.firebase.installations.local.IidStore) r0
            return r0
    }

    public static com.google.firebase.installations.FirebaseInstallations getInstance() {
            com.google.firebase.FirebaseApp r0 = com.google.firebase.FirebaseApp.getInstance()
            com.google.firebase.installations.FirebaseInstallations r0 = getInstance(r0)
            return r0
    }

    public static com.google.firebase.installations.FirebaseInstallations getInstance(com.google.firebase.FirebaseApp r2) {
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Null is not a valid value of FirebaseApp."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.Class<com.google.firebase.installations.FirebaseInstallationsApi> r0 = com.google.firebase.installations.FirebaseInstallationsApi.class
            java.lang.Object r2 = r2.get(r0)
            com.google.firebase.installations.FirebaseInstallations r2 = (com.google.firebase.installations.FirebaseInstallations) r2
            return r2
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry getMultiProcessSafePrefs() {
            r3 = this;
            java.lang.Object r0 = com.google.firebase.installations.FirebaseInstallations.lockGenerateFid
            monitor-enter(r0)
            com.google.firebase.FirebaseApp r1 = r3.firebaseApp     // Catch: java.lang.Throwable -> L23
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "generatefid.lock"
            com.google.firebase.installations.CrossProcessLock r1 = com.google.firebase.installations.CrossProcessLock.acquire(r1, r2)     // Catch: java.lang.Throwable -> L23
            com.google.firebase.installations.local.PersistedInstallation r2 = r3.persistedInstallation     // Catch: java.lang.Throwable -> L1c
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r2.readPersistedInstallationEntryValue()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            r1.releaseAndClose()     // Catch: java.lang.Throwable -> L23
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r2
        L1c:
            r2 = move-exception
            if (r1 == 0) goto L22
            r1.releaseAndClose()     // Catch: java.lang.Throwable -> L23
        L22:
            throw r2     // Catch: java.lang.Throwable -> L23
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
            r5 = this;
            java.lang.Object r0 = com.google.firebase.installations.FirebaseInstallations.lockGenerateFid
            monitor-enter(r0)
            com.google.firebase.FirebaseApp r1 = r5.firebaseApp     // Catch: java.lang.Throwable -> L37
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "generatefid.lock"
            com.google.firebase.installations.CrossProcessLock r1 = com.google.firebase.installations.CrossProcessLock.acquire(r1, r2)     // Catch: java.lang.Throwable -> L37
            com.google.firebase.installations.local.PersistedInstallation r2 = r5.persistedInstallation     // Catch: java.lang.Throwable -> L30
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r2.readPersistedInstallationEntryValue()     // Catch: java.lang.Throwable -> L30
            boolean r3 = r2.isNotGenerated()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L29
            java.lang.String r3 = r5.readExistingIidOrCreateFid(r2)     // Catch: java.lang.Throwable -> L30
            com.google.firebase.installations.local.PersistedInstallation r4 = r5.persistedInstallation     // Catch: java.lang.Throwable -> L30
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r2.withUnregisteredFid(r3)     // Catch: java.lang.Throwable -> L30
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r4.insertOrUpdatePersistedInstallationEntry(r2)     // Catch: java.lang.Throwable -> L30
        L29:
            if (r1 == 0) goto L2e
            r1.releaseAndClose()     // Catch: java.lang.Throwable -> L37
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r2
        L30:
            r2 = move-exception
            if (r1 == 0) goto L36
            r1.releaseAndClose()     // Catch: java.lang.Throwable -> L37
        L36:
            throw r2     // Catch: java.lang.Throwable -> L37
        L37:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r1
    }

    private void insertOrUpdatePrefs(com.google.firebase.installations.local.PersistedInstallationEntry r4) {
            r3 = this;
            java.lang.Object r0 = com.google.firebase.installations.FirebaseInstallations.lockGenerateFid
            monitor-enter(r0)
            com.google.firebase.FirebaseApp r1 = r3.firebaseApp     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "generatefid.lock"
            com.google.firebase.installations.CrossProcessLock r1 = com.google.firebase.installations.CrossProcessLock.acquire(r1, r2)     // Catch: java.lang.Throwable -> L22
            com.google.firebase.installations.local.PersistedInstallation r2 = r3.persistedInstallation     // Catch: java.lang.Throwable -> L1b
            r2.insertOrUpdatePersistedInstallationEntry(r4)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            r1.releaseAndClose()     // Catch: java.lang.Throwable -> L22
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L1b:
            r4 = move-exception
            if (r1 == 0) goto L21
            r1.releaseAndClose()     // Catch: java.lang.Throwable -> L22
        L21:
            throw r4     // Catch: java.lang.Throwable -> L22
        L22:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    private /* synthetic */ void lambda$doRegistrationOrRefresh$3(boolean r1) {
            r0 = this;
            r0.doNetworkCallIfNecessary(r1)
            return
    }

    private /* synthetic */ void lambda$getId$1() {
            r1 = this;
            r0 = 0
            r1.doRegistrationOrRefresh(r0)
            return
    }

    private /* synthetic */ void lambda$getToken$2(boolean r1) {
            r0 = this;
            r0.doRegistrationOrRefresh(r1)
            return
    }

    private static /* synthetic */ com.google.firebase.installations.local.IidStore lambda$new$0(com.google.firebase.FirebaseApp r1) {
            com.google.firebase.installations.local.IidStore r0 = new com.google.firebase.installations.local.IidStore
            r0.<init>(r1)
            return r0
    }

    private void preConditionChecks() {
            r3 = this;
            java.lang.String r0 = r3.getApplicationId()
            java.lang.String r1 = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0, r1)
            java.lang.String r0 = r3.getProjectIdentifier()
            java.lang.String r2 = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0, r2)
            java.lang.String r0 = r3.getApiKey()
            java.lang.String r2 = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0, r2)
            java.lang.String r0 = r3.getApplicationId()
            boolean r0 = com.google.firebase.installations.Utils.isValidAppIdFormat(r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.String r0 = r3.getApiKey()
            boolean r0 = com.google.firebase.installations.Utils.isValidApiKeyFormat(r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r2)
            return
    }

    private java.lang.String readExistingIidOrCreateFid(com.google.firebase.installations.local.PersistedInstallationEntry r3) {
            r2 = this;
            com.google.firebase.FirebaseApp r0 = r2.firebaseApp
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            com.google.firebase.FirebaseApp r0 = r2.firebaseApp
            boolean r0 = r0.isDefaultApp()
            if (r0 == 0) goto L1c
        L16:
            boolean r3 = r3.shouldAttemptMigration()
            if (r3 != 0) goto L23
        L1c:
            com.google.firebase.installations.RandomFidGenerator r3 = r2.fidGenerator
            java.lang.String r3 = r3.createRandomFid()
            return r3
        L23:
            com.google.firebase.installations.local.IidStore r3 = r2.getIidStore()
            java.lang.String r3 = r3.readIid()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L37
            com.google.firebase.installations.RandomFidGenerator r3 = r2.fidGenerator
            java.lang.String r3 = r3.createRandomFid()
        L37:
            return r3
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry registerFidWithServer(com.google.firebase.installations.local.PersistedInstallationEntry r11) throws com.google.firebase.installations.FirebaseInstallationsException {
            r10 = this;
            java.lang.String r0 = r11.getFirebaseInstallationId()
            if (r0 == 0) goto L1b
            java.lang.String r0 = r11.getFirebaseInstallationId()
            int r0 = r0.length()
            r1 = 11
            if (r0 != r1) goto L1b
            com.google.firebase.installations.local.IidStore r0 = r10.getIidStore()
            java.lang.String r0 = r0.readToken()
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r6 = r0
            com.google.firebase.installations.remote.FirebaseInstallationServiceClient r1 = r10.serviceClient
            java.lang.String r2 = r10.getApiKey()
            java.lang.String r3 = r11.getFirebaseInstallationId()
            java.lang.String r4 = r10.getProjectIdentifier()
            java.lang.String r5 = r10.getApplicationId()
            com.google.firebase.installations.remote.InstallationResponse r0 = r1.createFirebaseInstallation(r2, r3, r4, r5, r6)
            int[] r1 = com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = r0.getResponseCode()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L56
            r0 = 2
            if (r1 != r0) goto L4c
            java.lang.String r0 = "BAD CONFIG"
            com.google.firebase.installations.local.PersistedInstallationEntry r11 = r11.withFisError(r0)
            return r11
        L4c:
            com.google.firebase.installations.FirebaseInstallationsException r11 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            java.lang.String r1 = "Firebase Installations Service is unavailable. Please try again later."
            r11.<init>(r1, r0)
            throw r11
        L56:
            java.lang.String r3 = r0.getFid()
            java.lang.String r4 = r0.getRefreshToken()
            com.google.firebase.installations.Utils r1 = r10.utils
            long r5 = r1.currentTimeInSecs()
            com.google.firebase.installations.remote.TokenResult r1 = r0.getAuthToken()
            java.lang.String r7 = r1.getToken()
            com.google.firebase.installations.remote.TokenResult r0 = r0.getAuthToken()
            long r8 = r0.getTokenExpirationTimestamp()
            r2 = r11
            com.google.firebase.installations.local.PersistedInstallationEntry r11 = r2.withRegisteredFid(r3, r4, r5, r7, r8)
            return r11
    }

    private void triggerOnException(java.lang.Exception r4) {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            java.util.List<com.google.firebase.installations.StateListener> r1 = r3.listeners     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            com.google.firebase.installations.StateListener r2 = (com.google.firebase.installations.StateListener) r2     // Catch: java.lang.Throwable -> L21
            boolean r2 = r2.onException(r4)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L9
            r1.remove()     // Catch: java.lang.Throwable -> L21
            goto L9
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    private void triggerOnStateReached(com.google.firebase.installations.local.PersistedInstallationEntry r4) {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            java.util.List<com.google.firebase.installations.StateListener> r1 = r3.listeners     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            com.google.firebase.installations.StateListener r2 = (com.google.firebase.installations.StateListener) r2     // Catch: java.lang.Throwable -> L21
            boolean r2 = r2.onStateReached(r4)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L9
            r1.remove()     // Catch: java.lang.Throwable -> L21
            goto L9
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    private synchronized void updateCacheFid(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0.cachedFid = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private synchronized void updateFidListener(com.google.firebase.installations.local.PersistedInstallationEntry r3, com.google.firebase.installations.local.PersistedInstallationEntry r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.Set<com.google.firebase.installations.internal.FidListener> r0 = r2.fidListeners     // Catch: java.lang.Throwable -> L33
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L31
            java.lang.String r3 = r3.getFirebaseInstallationId()     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r4.getFirebaseInstallationId()     // Catch: java.lang.Throwable -> L33
            boolean r3 = android.text.TextUtils.equals(r3, r0)     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto L31
            java.util.Set<com.google.firebase.installations.internal.FidListener> r3 = r2.fidListeners     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L33
        L1d:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L33
            com.google.firebase.installations.internal.FidListener r0 = (com.google.firebase.installations.internal.FidListener) r0     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r4.getFirebaseInstallationId()     // Catch: java.lang.Throwable -> L33
            r0.onFidChanged(r1)     // Catch: java.lang.Throwable -> L33
            goto L1d
        L31:
            monitor-exit(r2)
            return
        L33:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    java.lang.String getApiKey() {
            r1 = this;
            com.google.firebase.FirebaseApp r0 = r1.firebaseApp
            com.google.firebase.FirebaseOptions r0 = r0.getOptions()
            java.lang.String r0 = r0.getApiKey()
            return r0
    }

    java.lang.String getApplicationId() {
            r1 = this;
            com.google.firebase.FirebaseApp r0 = r1.firebaseApp
            com.google.firebase.FirebaseOptions r0 = r0.getOptions()
            java.lang.String r0 = r0.getApplicationId()
            return r0
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public com.google.android.gms.tasks.Task<java.lang.String> getId() {
            r3 = this;
            r3.preConditionChecks()
            java.lang.String r0 = r3.getCacheFid()
            if (r0 == 0) goto Le
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)
            return r0
        Le:
            com.google.android.gms.tasks.Task r0 = r3.addGetIdListener()
            java.util.concurrent.ExecutorService r1 = r3.backgroundExecutor
            com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda1 r2 = new com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda1
            r2.<init>(r3)
            r1.execute(r2)
            return r0
    }

    java.lang.String getProjectIdentifier() {
            r1 = this;
            com.google.firebase.FirebaseApp r0 = r1.firebaseApp
            com.google.firebase.FirebaseOptions r0 = r0.getOptions()
            java.lang.String r0 = r0.getProjectId()
            return r0
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> getToken(boolean r4) {
            r3 = this;
            r3.preConditionChecks()
            com.google.android.gms.tasks.Task r0 = r3.addGetAuthTokenListener()
            java.util.concurrent.ExecutorService r1 = r3.backgroundExecutor
            com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda3 r2 = new com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda3
            r2.<init>(r3, r4)
            r1.execute(r2)
            return r0
    }
}
