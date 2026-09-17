package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class IdManager implements com.google.firebase.crashlytics.internal.common.InstallIdProvider {
    private static final java.lang.String FORWARD_SLASH_REGEX = null;
    private static final java.util.regex.Pattern ID_PATTERN = null;
    private final android.content.Context appContext;
    private final java.lang.String appIdentifier;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds installIds;
    private final com.google.firebase.crashlytics.internal.common.InstallerPackageNameProvider installerPackageNameProvider;

    static {
            java.lang.String r0 = "[^\\p{Alnum}]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.firebase.crashlytics.internal.common.IdManager.ID_PATTERN = r0
            java.lang.String r0 = "/"
            java.lang.String r0 = java.util.regex.Pattern.quote(r0)
            com.google.firebase.crashlytics.internal.common.IdManager.FORWARD_SLASH_REGEX = r0
            return
    }

    public IdManager(android.content.Context r1, java.lang.String r2, com.google.firebase.installations.FirebaseInstallationsApi r3, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L1f
            if (r2 == 0) goto L17
            r0.appContext = r1
            r0.appIdentifier = r2
            r0.firebaseInstallations = r3
            r0.dataCollectionArbiter = r4
            com.google.firebase.crashlytics.internal.common.InstallerPackageNameProvider r1 = new com.google.firebase.crashlytics.internal.common.InstallerPackageNameProvider
            r1.<init>()
            r0.installerPackageNameProvider = r1
            return
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "appIdentifier must not be null"
            r1.<init>(r2)
            throw r1
        L1f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "appContext must not be null"
            r1.<init>(r2)
            throw r1
    }

    private synchronized java.lang.String createAndCacheCrashlyticsInstallId(java.lang.String r5, android.content.SharedPreferences r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = formatId(r0)     // Catch: java.lang.Throwable -> L42
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "Created new Crashlytics installation ID: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L42
            r2.append(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = " for FID: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L42
            r2.append(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L42
            r1.v(r2)     // Catch: java.lang.Throwable -> L42
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "crashlytics.installation.id"
            android.content.SharedPreferences$Editor r6 = r6.putString(r1, r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "firebase.installation.id"
            android.content.SharedPreferences$Editor r5 = r6.putString(r1, r5)     // Catch: java.lang.Throwable -> L42
            r5.apply()     // Catch: java.lang.Throwable -> L42
            monitor-exit(r4)
            return r0
        L42:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    static java.lang.String createSyntheticFid() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SYN_"
            r0.append(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String formatId(java.lang.String r1) {
            java.util.regex.Pattern r0 = com.google.firebase.crashlytics.internal.common.IdManager.ID_PATTERN
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            return r1
    }

    static boolean isSyntheticFid(java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "SYN_"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private java.lang.String readCachedCrashlyticsInstallId(android.content.SharedPreferences r3) {
            r2 = this;
            java.lang.String r0 = "crashlytics.installation.id"
            r1 = 0
            java.lang.String r3 = r3.getString(r0, r1)
            return r3
    }

    private java.lang.String removeForwardSlashesIn(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = com.google.firebase.crashlytics.internal.common.IdManager.FORWARD_SLASH_REGEX
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
            return r3
    }

    private boolean shouldRefresh() {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r0 = r1.installIds
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.getFirebaseInstallationId()
            if (r0 != 0) goto L13
            com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r0 = r1.dataCollectionArbiter
            boolean r0 = r0.isAutomaticDataCollectionEnabled()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    public com.google.firebase.crashlytics.internal.common.FirebaseInstallationId fetchTrueFid(boolean r6) {
            r5 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkNotMainThread()
            r0 = 10000(0x2710, double:4.9407E-320)
            r2 = 0
            if (r6 == 0) goto L26
            com.google.firebase.installations.FirebaseInstallationsApi r6 = r5.firebaseInstallations     // Catch: java.lang.Exception -> L1c
            r3 = 0
            com.google.android.gms.tasks.Task r6 = r6.getToken(r3)     // Catch: java.lang.Exception -> L1c
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L1c
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6, r0, r3)     // Catch: java.lang.Exception -> L1c
            com.google.firebase.installations.InstallationTokenResult r6 = (com.google.firebase.installations.InstallationTokenResult) r6     // Catch: java.lang.Exception -> L1c
            java.lang.String r6 = r6.getToken()     // Catch: java.lang.Exception -> L1c
            goto L27
        L1c:
            r6 = move-exception
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r4 = "Error getting Firebase authentication token."
            r3.w(r4, r6)
        L26:
            r6 = r2
        L27:
            com.google.firebase.installations.FirebaseInstallationsApi r3 = r5.firebaseInstallations     // Catch: java.lang.Exception -> L37
            com.google.android.gms.tasks.Task r3 = r3.getId()     // Catch: java.lang.Exception -> L37
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L37
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r3, r0, r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L37
            r2 = r0
            goto L41
        L37:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Error getting Firebase installation id."
            r1.w(r3, r0)
        L41:
            com.google.firebase.crashlytics.internal.common.FirebaseInstallationId r0 = new com.google.firebase.crashlytics.internal.common.FirebaseInstallationId
            r0.<init>(r2, r6)
            return r0
    }

    public java.lang.String getAppIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.appIdentifier
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    public synchronized com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds getInstallIds() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.shouldRefresh()     // Catch: java.lang.Throwable -> Ld6
            if (r0 != 0) goto Lb
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r0 = r7.installIds     // Catch: java.lang.Throwable -> Ld6
            monitor-exit(r7)
            return r0
        Lb:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = "Determining Crashlytics installation ID..."
            r0.v(r1)     // Catch: java.lang.Throwable -> Ld6
            android.content.Context r0 = r7.appContext     // Catch: java.lang.Throwable -> Ld6
            android.content.SharedPreferences r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.getSharedPrefs(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = "firebase.installation.id"
            r2 = 0
            java.lang.String r1 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> Ld6
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r4.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = "Cached Firebase Installation ID: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Ld6
            r4.append(r1)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Ld6
            r3.v(r4)     // Catch: java.lang.Throwable -> Ld6
            com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r3 = r7.dataCollectionArbiter     // Catch: java.lang.Throwable -> Ld6
            boolean r3 = r3.isAutomaticDataCollectionEnabled()     // Catch: java.lang.Throwable -> Ld6
            if (r3 == 0) goto L99
            r3 = 0
            com.google.firebase.crashlytics.internal.common.FirebaseInstallationId r3 = r7.fetchTrueFid(r3)     // Catch: java.lang.Throwable -> Ld6
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r5.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r6 = "Fetched Firebase Installation ID: "
            r5.append(r6)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r6 = r3.getFid()     // Catch: java.lang.Throwable -> Ld6
            r5.append(r6)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Ld6
            r4.v(r5)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = r3.getFid()     // Catch: java.lang.Throwable -> Ld6
            if (r4 != 0) goto L75
            com.google.firebase.crashlytics.internal.common.FirebaseInstallationId r3 = new com.google.firebase.crashlytics.internal.common.FirebaseInstallationId     // Catch: java.lang.Throwable -> Ld6
            if (r1 != 0) goto L71
            java.lang.String r4 = createSyntheticFid()     // Catch: java.lang.Throwable -> Ld6
            goto L72
        L71:
            r4 = r1
        L72:
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> Ld6
        L75:
            java.lang.String r2 = r3.getFid()     // Catch: java.lang.Throwable -> Ld6
            boolean r1 = java.util.Objects.equals(r2, r1)     // Catch: java.lang.Throwable -> Ld6
            if (r1 == 0) goto L8a
            java.lang.String r0 = r7.readCachedCrashlyticsInstallId(r0)     // Catch: java.lang.Throwable -> Ld6
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r0 = com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds.create(r0, r3)     // Catch: java.lang.Throwable -> Ld6
            r7.installIds = r0     // Catch: java.lang.Throwable -> Ld6
            goto Lb8
        L8a:
            java.lang.String r1 = r3.getFid()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = r7.createAndCacheCrashlyticsInstallId(r1, r0)     // Catch: java.lang.Throwable -> Ld6
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r0 = com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds.create(r0, r3)     // Catch: java.lang.Throwable -> Ld6
            r7.installIds = r0     // Catch: java.lang.Throwable -> Ld6
            goto Lb8
        L99:
            boolean r1 = isSyntheticFid(r1)     // Catch: java.lang.Throwable -> Ld6
            if (r1 == 0) goto Laa
            java.lang.String r0 = r7.readCachedCrashlyticsInstallId(r0)     // Catch: java.lang.Throwable -> Ld6
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r0 = com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds.createWithoutFid(r0)     // Catch: java.lang.Throwable -> Ld6
            r7.installIds = r0     // Catch: java.lang.Throwable -> Ld6
            goto Lb8
        Laa:
            java.lang.String r1 = createSyntheticFid()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = r7.createAndCacheCrashlyticsInstallId(r1, r0)     // Catch: java.lang.Throwable -> Ld6
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r0 = com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds.createWithoutFid(r0)     // Catch: java.lang.Throwable -> Ld6
            r7.installIds = r0     // Catch: java.lang.Throwable -> Ld6
        Lb8:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r1.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = "Install IDs: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld6
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r2 = r7.installIds     // Catch: java.lang.Throwable -> Ld6
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld6
            r0.v(r1)     // Catch: java.lang.Throwable -> Ld6
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r0 = r7.installIds     // Catch: java.lang.Throwable -> Ld6
            monitor-exit(r7)
            return r0
        Ld6:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    public java.lang.String getInstallerPackageName() {
            r2 = this;
            com.google.firebase.crashlytics.internal.common.InstallerPackageNameProvider r0 = r2.installerPackageNameProvider
            android.content.Context r1 = r2.appContext
            java.lang.String r0 = r0.getInstallerPackageName(r1)
            return r0
    }

    public java.lang.String getModelName() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r2 = r4.removeForwardSlashesIn(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r2 = r4.removeForwardSlashesIn(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "%s/%s"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    public java.lang.String getOsBuildVersionString() {
            r1 = this;
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r0 = r1.removeForwardSlashesIn(r0)
            return r0
    }

    public java.lang.String getOsDisplayVersionString() {
            r1 = this;
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = r1.removeForwardSlashesIn(r0)
            return r0
    }
}
