package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.ShowFirstParty
/* loaded from: classes.dex */
public class zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final java.lang.String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final java.lang.String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final java.lang.String WORK_ACCOUNT_TYPE = "com.google.work";

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final java.lang.String[] zza = null;

    @com.google.android.gms.common.internal.ShowFirstParty
    @android.annotation.SuppressLint({"InlinedApi"})
    public static final java.lang.String zzb = null;
    private static final android.content.ComponentName zzc = null;
    private static final com.google.android.gms.common.logging.Logger zzd = null;

    static {
            java.lang.String r0 = "com.google"
            java.lang.String r1 = "com.google.work"
            java.lang.String r2 = "cn.google"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            com.google.android.gms.auth.zzl.zza = r0
            java.lang.String r0 = "androidPackageName"
            com.google.android.gms.auth.zzl.zzb = r0
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r2 = "com.google.android.gms.auth.GetToken"
            r0.<init>(r1, r2)
            com.google.android.gms.auth.zzl.zzc = r0
            java.lang.String r0 = "GoogleAuthUtil"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.zzd.zza(r0)
            com.google.android.gms.auth.zzl.zzd = r0
            return
    }

    zzl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearToken(android.content.Context r2, java.lang.String r3) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            r0 = 0
            zze(r2, r3, r0)
            return
    }

    public static java.util.List<com.google.android.gms.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context r7, int r8, java.lang.String r9) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            java.lang.String r0 = "accountName must be provided"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9, r0)
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            r0 = 8400000(0x802c80, float:1.1770907E-38)
            zzk(r7, r0)
            com.google.android.gms.auth.AccountChangeEventsRequest r0 = new com.google.android.gms.auth.AccountChangeEventsRequest
            r0.<init>()
            r0.setAccountName(r9)
            r0.setEventIndex(r8)
            com.google.android.gms.internal.auth.zzdc.zzd(r7)
            boolean r8 = com.google.android.gms.internal.auth.zzhw.zzd()
            if (r8 == 0) goto L46
            boolean r8 = zzp(r7)
            if (r8 == 0) goto L46
            com.google.android.gms.internal.auth.zzg r8 = com.google.android.gms.internal.auth.zzh.zza(r7)
            com.google.android.gms.tasks.Task r8 = r8.zzb(r0)
            java.lang.String r9 = "account change events retrieval"
            java.lang.Object r8 = zzi(r8, r9)     // Catch: com.google.android.gms.common.api.ApiException -> L42
            com.google.android.gms.auth.AccountChangeEventsResponse r8 = (com.google.android.gms.auth.AccountChangeEventsResponse) r8     // Catch: com.google.android.gms.common.api.ApiException -> L42
            zzj(r8)     // Catch: com.google.android.gms.common.api.ApiException -> L42
            java.util.List r7 = r8.getEvents()     // Catch: com.google.android.gms.common.api.ApiException -> L42
            return r7
        L42:
            r8 = move-exception
            zzl(r8, r9)
        L46:
            com.google.android.gms.auth.zzi r3 = new com.google.android.gms.auth.zzi
            r3.<init>(r0)
            android.content.ComponentName r2 = com.google.android.gms.auth.zzl.zzc
            r4 = 0
            r6 = 0
            r1 = r7
            java.lang.Object r7 = zzh(r1, r2, r3, r4, r6)
            java.util.List r7 = (java.util.List) r7
            return r7
    }

    public static java.lang.String getAccountId(android.content.Context r2, java.lang.String r3) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            java.lang.String r0 = "accountName must be provided"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3, r0)
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            r0 = 8400000(0x802c80, float:1.1770907E-38)
            zzk(r2, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "^^_account_id_^^"
            java.lang.String r2 = getToken(r2, r3, r1, r0)
            return r2
    }

    public static java.lang.String getToken(android.content.Context r1, android.accounts.Account r2, java.lang.String r3) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = getToken(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String getToken(android.content.Context r7, android.accounts.Account r8, java.lang.String r9, android.os.Bundle r10) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
            zzo(r8)
            r4 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            com.google.android.gms.auth.TokenData r7 = zza(r0, r1, r2, r3, r4, r6)
            java.lang.String r7 = r7.zza()
            return r7
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r1 = "com.google"
            r0.<init>(r3, r1)
            java.lang.String r2 = getToken(r2, r0, r4)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r1 = "com.google"
            r0.<init>(r3, r1)
            java.lang.String r2 = getToken(r2, r0, r4, r5)
            return r2
    }

    @java.lang.Deprecated
    public static void invalidateToken(android.content.Context r1, java.lang.String r2) {
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r1)
            java.lang.String r0 = "com.google"
            r1.invalidateAuthToken(r0, r2)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @android.annotation.TargetApi(23)
    public static android.os.Bundle removeAccount(android.content.Context r8, android.accounts.Account r9) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            zzo(r9)
            r0 = 8400000(0x802c80, float:1.1770907E-38)
            zzk(r8, r0)
            com.google.android.gms.internal.auth.zzdc.zzd(r8)
            boolean r0 = com.google.android.gms.internal.auth.zzhw.zze()
            if (r0 == 0) goto L33
            boolean r0 = zzp(r8)
            if (r0 == 0) goto L33
            com.google.android.gms.internal.auth.zzg r0 = com.google.android.gms.internal.auth.zzh.zza(r8)
            com.google.android.gms.tasks.Task r0 = r0.zzd(r9)
            java.lang.String r1 = "account removal"
            java.lang.Object r0 = zzi(r0, r1)     // Catch: com.google.android.gms.common.api.ApiException -> L2f
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: com.google.android.gms.common.api.ApiException -> L2f
            zzj(r0)     // Catch: com.google.android.gms.common.api.ApiException -> L2f
            return r0
        L2f:
            r0 = move-exception
            zzl(r0, r1)
        L33:
            com.google.android.gms.auth.zzf r4 = new com.google.android.gms.auth.zzf
            r4.<init>(r9)
            android.content.ComponentName r3 = com.google.android.gms.auth.zzl.zzc
            r5 = 0
            r7 = 0
            r2 = r8
            java.lang.Object r8 = zzh(r2, r3, r4, r5, r7)
            android.os.Bundle r8 = (android.os.Bundle) r8
            return r8
    }

    @android.annotation.TargetApi(26)
    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context r9) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            r0 = 11400000(0xadf340, float:1.5974802E-38)
            zzk(r9, r0)
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()
            java.lang.String r0 = r0.packageName
            com.google.android.gms.internal.auth.zzdc.zzd(r9)
            boolean r1 = com.google.android.gms.internal.auth.zzhw.zze()
            if (r1 == 0) goto L64
            boolean r1 = zzp(r9)
            if (r1 == 0) goto L64
            com.google.android.gms.internal.auth.zzg r1 = com.google.android.gms.internal.auth.zzh.zza(r9)
            com.google.android.gms.tasks.Task r1 = r1.zze(r0)
            java.lang.String r2 = "google accounts access request"
            java.lang.Object r1 = zzi(r1, r2)     // Catch: com.google.android.gms.common.api.ApiException -> L60
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: com.google.android.gms.common.api.ApiException -> L60
            java.lang.String r3 = "Error"
            java.lang.String r3 = r1.getString(r3)     // Catch: com.google.android.gms.common.api.ApiException -> L60
            java.lang.String r4 = "userRecoveryIntent"
            android.os.Parcelable r4 = r1.getParcelable(r4)     // Catch: com.google.android.gms.common.api.ApiException -> L60
            android.content.Intent r4 = (android.content.Intent) r4     // Catch: com.google.android.gms.common.api.ApiException -> L60
            java.lang.String r5 = "userRecoveryPendingIntent"
            android.os.Parcelable r1 = r1.getParcelable(r5)     // Catch: com.google.android.gms.common.api.ApiException -> L60
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1     // Catch: com.google.android.gms.common.api.ApiException -> L60
            com.google.android.gms.internal.auth.zzby r5 = com.google.android.gms.internal.auth.zzby.zza(r3)     // Catch: com.google.android.gms.common.api.ApiException -> L60
            com.google.android.gms.internal.auth.zzby r6 = com.google.android.gms.internal.auth.zzby.zzc     // Catch: com.google.android.gms.common.api.ApiException -> L60
            boolean r5 = r6.equals(r5)     // Catch: com.google.android.gms.common.api.ApiException -> L60
            if (r5 == 0) goto L53
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: com.google.android.gms.common.api.ApiException -> L60
            return r9
        L53:
            java.lang.String r5 = "requestGoogleAccountsAccess"
            zzn(r9, r5, r3, r4, r1)     // Catch: com.google.android.gms.common.api.ApiException -> L60
            com.google.android.gms.auth.GoogleAuthException r1 = new com.google.android.gms.auth.GoogleAuthException     // Catch: com.google.android.gms.common.api.ApiException -> L60
            java.lang.String r3 = "Invalid state. Shouldn't happen"
            r1.<init>(r3)     // Catch: com.google.android.gms.common.api.ApiException -> L60
            throw r1     // Catch: com.google.android.gms.common.api.ApiException -> L60
        L60:
            r1 = move-exception
            zzl(r1, r2)
        L64:
            com.google.android.gms.auth.zzj r5 = new com.google.android.gms.auth.zzj
            r5.<init>(r0, r9)
            android.content.ComponentName r4 = com.google.android.gms.auth.zzl.zzc
            r6 = 0
            r8 = 0
            r3 = r9
            java.lang.Object r9 = zzh(r3, r4, r5, r6, r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            return r9
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    public static com.google.android.gms.auth.TokenData zza(android.content.Context r6, android.accounts.Account r7, java.lang.String r8, android.os.Bundle r9, long r10, java.util.concurrent.Executor r12) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
            java.lang.String r10 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r10)
            java.lang.String r10 = "Scope cannot be empty or null."
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8, r10)
            zzo(r7)
            r10 = 8400000(0x802c80, float:1.1770907E-38)
            zzk(r6, r10)
            if (r9 != 0) goto L1b
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            goto L21
        L1b:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r9)
            r9 = r10
        L21:
            zzm(r6, r9)
            com.google.android.gms.internal.auth.zzdc.zzd(r6)
            boolean r10 = com.google.android.gms.internal.auth.zzhw.zze()
            if (r10 == 0) goto L51
            boolean r10 = zzp(r6)
            if (r10 == 0) goto L51
            com.google.android.gms.internal.auth.zzg r10 = com.google.android.gms.internal.auth.zzh.zza(r6)
            com.google.android.gms.tasks.Task r10 = r10.zzc(r7, r8, r9)
            java.lang.String r11 = "token retrieval"
            java.lang.Object r10 = zzi(r10, r11)     // Catch: com.google.android.gms.common.api.ApiException -> L4d
            android.os.Bundle r10 = (android.os.Bundle) r10     // Catch: com.google.android.gms.common.api.ApiException -> L4d
            zzj(r10)     // Catch: com.google.android.gms.common.api.ApiException -> L4d
            java.lang.String r12 = "getTokenWithDetails"
            com.google.android.gms.auth.TokenData r6 = zzg(r6, r12, r10)     // Catch: com.google.android.gms.common.api.ApiException -> L4d
            return r6
        L4d:
            r10 = move-exception
            zzl(r10, r11)
        L51:
            com.google.android.gms.auth.zzg r2 = new com.google.android.gms.auth.zzg
            r2.<init>(r7, r8, r9, r6)
            android.content.ComponentName r1 = com.google.android.gms.auth.zzl.zzc
            r3 = 0
            r5 = 0
            r0 = r6
            java.lang.Object r6 = zzh(r0, r1, r2, r3, r5)
            com.google.android.gms.auth.TokenData r6 = (com.google.android.gms.auth.TokenData) r6
            return r6
    }

    static /* synthetic */ com.google.android.gms.auth.TokenData zzb(android.accounts.Account r0, java.lang.String r1, android.os.Bundle r2, android.content.Context r3, android.os.IBinder r4) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
            com.google.android.gms.internal.auth.zzf r4 = com.google.android.gms.internal.auth.zze.zzb(r4)
            android.os.Bundle r0 = r4.zze(r0, r1, r2)
            if (r0 == 0) goto L11
            java.lang.String r1 = "getTokenWithDetails"
            com.google.android.gms.auth.TokenData r0 = zzg(r3, r1, r0)
            return r0
        L11:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Service call returned null"
            r0.<init>(r1)
            throw r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzc(java.lang.Object r0) {
            zzj(r0)
            return r0
    }

    static /* bridge */ /* synthetic */ void zzd(android.content.Context r0, java.lang.String r1, java.lang.String r2, android.content.Intent r3, android.app.PendingIntent r4) {
            java.lang.String r1 = "requestGoogleAccountsAccess"
            zzn(r0, r1, r2, r3, r4)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    public static void zze(android.content.Context r7, java.lang.String r8, long r9) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            java.lang.String r9 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r9)
            r9 = 8400000(0x802c80, float:1.1770907E-38)
            zzk(r7, r9)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            zzm(r7, r9)
            com.google.android.gms.internal.auth.zzdc.zzd(r7)
            boolean r10 = com.google.android.gms.internal.auth.zzhw.zze()
            if (r10 == 0) goto L3c
            boolean r10 = zzp(r7)
            if (r10 == 0) goto L3c
            com.google.android.gms.internal.auth.zzg r10 = com.google.android.gms.internal.auth.zzh.zza(r7)
            com.google.android.gms.internal.auth.zzbw r0 = new com.google.android.gms.internal.auth.zzbw
            r0.<init>()
            r0.zza(r8)
            com.google.android.gms.tasks.Task r10 = r10.zza(r0)
            java.lang.String r0 = "clear token"
            zzi(r10, r0)     // Catch: com.google.android.gms.common.api.ApiException -> L38
            return
        L38:
            r10 = move-exception
            zzl(r10, r0)
        L3c:
            com.google.android.gms.auth.zzh r3 = new com.google.android.gms.auth.zzh
            r3.<init>(r8, r9)
            android.content.ComponentName r2 = com.google.android.gms.auth.zzl.zzc
            r4 = 0
            r6 = 0
            r1 = r7
            zzh(r1, r2, r3, r4, r6)
            return
    }

    static void zzf(android.content.Intent r1) {
            if (r1 == 0) goto L13
            r0 = 1
            java.lang.String r1 = r1.toUri(r0)
            android.content.Intent.parseUri(r1, r0)     // Catch: java.net.URISyntaxException -> Lb
            return
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Parameter callback contains invalid data. It must be serializable using toUri() and parseUri()."
            r1.<init>(r0)
            throw r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Callback cannot be null."
            r1.<init>(r0)
            throw r1
    }

    private static com.google.android.gms.auth.TokenData zzg(android.content.Context r2, java.lang.String r3, android.os.Bundle r4) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            android.os.Parcelable$Creator<com.google.android.gms.auth.TokenData> r3 = com.google.android.gms.auth.TokenData.CREATOR
            java.lang.Class<com.google.android.gms.auth.TokenData> r3 = com.google.android.gms.auth.TokenData.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            if (r3 == 0) goto Ld
            r4.setClassLoader(r3)
        Ld:
            java.lang.String r0 = "tokenDetails"
            android.os.Bundle r0 = r4.getBundle(r0)
            if (r0 != 0) goto L17
            r3 = 0
            goto L24
        L17:
            if (r3 == 0) goto L1c
            r0.setClassLoader(r3)
        L1c:
            java.lang.String r3 = "TokenData"
            android.os.Parcelable r3 = r0.getParcelable(r3)
            com.google.android.gms.auth.TokenData r3 = (com.google.android.gms.auth.TokenData) r3
        L24:
            if (r3 == 0) goto L27
            return r3
        L27:
            java.lang.String r3 = "Error"
            java.lang.String r3 = r4.getString(r3)
            java.lang.String r0 = "userRecoveryIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.String r1 = "userRecoveryPendingIntent"
            android.os.Parcelable r4 = r4.getParcelable(r1)
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            java.lang.String r1 = "getTokenWithDetails"
            zzn(r2, r1, r3, r0, r4)
            com.google.android.gms.auth.GoogleAuthException r2 = new com.google.android.gms.auth.GoogleAuthException
            java.lang.String r3 = "Invalid state. Shouldn't happen"
            r2.<init>(r3)
            throw r2
    }

    private static java.lang.Object zzh(android.content.Context r1, android.content.ComponentName r2, com.google.android.gms.auth.zzk r3, long r4, java.util.concurrent.Executor r6) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
            java.lang.String r4 = "Error on service connection."
            java.lang.String r5 = "GoogleAuthUtil"
            com.google.android.gms.common.BlockingServiceConnection r6 = new com.google.android.gms.common.BlockingServiceConnection
            r6.<init>()
            com.google.android.gms.common.internal.GmsClientSupervisor r1 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r1)
            r0 = 0
            boolean r0 = r1.bindService(r2, r6, r5, r0)     // Catch: java.lang.SecurityException -> L3c
            if (r0 == 0) goto L34
            android.os.IBinder r0 = r6.getService()     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22 android.os.RemoteException -> L24 java.util.concurrent.TimeoutException -> L26
            java.lang.Object r3 = r3.zza(r0)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22 android.os.RemoteException -> L24 java.util.concurrent.TimeoutException -> L26
            r1.unbindService(r2, r6, r5)
            return r3
        L20:
            r3 = move-exception
            goto L30
        L22:
            r3 = move-exception
            goto L27
        L24:
            r3 = move-exception
            goto L27
        L26:
            r3 = move-exception
        L27:
            android.util.Log.i(r5, r4, r3)     // Catch: java.lang.Throwable -> L20
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L20
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L20
        L30:
            r1.unbindService(r2, r6, r5)
            throw r3
        L34:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Could not bind to service."
            r1.<init>(r2)
            throw r1
        L3c:
            r1 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r1.getMessage()
            r2[r3] = r4
            java.lang.String r3 = "SecurityException while bind to auth service: %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            android.util.Log.w(r5, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "SecurityException while binding to Auth service."
            r2.<init>(r3, r1)
            throw r2
    }

    private static java.lang.Object zzi(com.google.android.gms.tasks.Task r4, java.lang.String r5) throws java.io.IOException, com.google.android.gms.common.api.ApiException {
            r0 = 1
            r1 = 0
            java.lang.Object r4 = com.google.android.gms.tasks.Tasks.await(r4)     // Catch: java.util.concurrent.CancellationException -> L7 java.lang.InterruptedException -> L1f java.util.concurrent.ExecutionException -> L37
            return r4
        L7:
            r4 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            java.lang.String r5 = "Canceled while waiting for the task of %s to finish."
            java.lang.String r5 = java.lang.String.format(r5, r0)
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.zzl.zzd
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.w(r5, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r5, r4)
            throw r0
        L1f:
            r4 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            java.lang.String r5 = "Interrupted while waiting for the task of %s to finish."
            java.lang.String r5 = java.lang.String.format(r5, r0)
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.zzl.zzd
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.w(r5, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r5, r4)
            throw r0
        L37:
            r4 = move-exception
            java.lang.Throwable r2 = r4.getCause()
            boolean r3 = r2 instanceof com.google.android.gms.common.api.ApiException
            if (r3 == 0) goto L43
            com.google.android.gms.common.api.ApiException r2 = (com.google.android.gms.common.api.ApiException) r2
            throw r2
        L43:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            java.lang.String r5 = "Unable to get a result for %s due to ExecutionException."
            java.lang.String r5 = java.lang.String.format(r5, r0)
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.zzl.zzd
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.w(r5, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r5, r4)
            throw r0
    }

    private static java.lang.Object zzj(java.lang.Object r2) throws java.io.IOException {
            if (r2 == 0) goto L3
            return r2
        L3:
            com.google.android.gms.common.logging.Logger r2 = com.google.android.gms.auth.zzl.zzd
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Service call returned null."
            r2.w(r1, r0)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "Service unavailable."
            r2.<init>(r0)
            throw r2
    }

    private static void zzk(android.content.Context r2, int r3) throws com.google.android.gms.auth.GoogleAuthException {
            android.content.Context r2 = r2.getApplicationContext()     // Catch: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException -> L8 com.google.android.gms.common.GooglePlayServicesNotAvailableException -> La com.google.android.gms.common.GooglePlayServicesRepairableException -> L15
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(r2, r3)     // Catch: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException -> L8 com.google.android.gms.common.GooglePlayServicesNotAvailableException -> La com.google.android.gms.common.GooglePlayServicesRepairableException -> L15
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            r2 = move-exception
        Lb:
            com.google.android.gms.auth.GoogleAuthException r3 = new com.google.android.gms.auth.GoogleAuthException
            java.lang.String r0 = r2.getMessage()
            r3.<init>(r0, r2)
            throw r3
        L15:
            r2 = move-exception
            com.google.android.gms.auth.GooglePlayServicesAvailabilityException r3 = new com.google.android.gms.auth.GooglePlayServicesAvailabilityException
            int r0 = r2.getConnectionStatusCode()
            java.lang.String r1 = r2.getMessage()
            android.content.Intent r2 = r2.getIntent()
            r3.<init>(r0, r1, r2)
            throw r3
    }

    private static void zzl(com.google.android.gms.common.api.ApiException r3, java.lang.String r4) {
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.zzl.zzd
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s"
            r0.w(r3, r1)
            return
    }

    private static void zzm(android.content.Context r2, android.os.Bundle r3) {
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.packageName
            java.lang.String r0 = "clientPackageName"
            r3.putString(r0, r2)
            java.lang.String r0 = com.google.android.gms.auth.zzl.zzb
            java.lang.String r1 = r3.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1a
            r3.putString(r0, r2)
        L1a:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r2 = "service_connection_start_time_millis"
            r3.putLong(r2, r0)
            return
    }

    private static void zzn(android.content.Context r7, java.lang.String r8, java.lang.String r9, android.content.Intent r10, android.app.PendingIntent r11) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            com.google.android.gms.internal.auth.zzby r0 = com.google.android.gms.internal.auth.zzby.zza(r9)
            com.google.android.gms.common.logging.Logger r1 = com.google.android.gms.auth.zzl.zzd
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r5 = 1
            r3[r5] = r8
            java.lang.String r6 = "[GoogleAuthUtil] error status:%s with method:%s"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r1.w(r3, r6)
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzi
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzs
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzw
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzx
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzn
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzz
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzN
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzF
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzG
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzH
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzI
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzJ
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzK
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzM
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzE
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld0
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzL
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L9b
            goto Ld0
        L9b:
            com.google.android.gms.internal.auth.zzby r7 = com.google.android.gms.internal.auth.zzby.zze
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Lca
            com.google.android.gms.internal.auth.zzby r7 = com.google.android.gms.internal.auth.zzby.zzf
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Lca
            com.google.android.gms.internal.auth.zzby r7 = com.google.android.gms.internal.auth.zzby.zzg
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Lca
            com.google.android.gms.internal.auth.zzby r7 = com.google.android.gms.internal.auth.zzby.zzaf
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Lca
            com.google.android.gms.internal.auth.zzby r7 = com.google.android.gms.internal.auth.zzby.zzah
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lc4
            goto Lca
        Lc4:
            com.google.android.gms.auth.GoogleAuthException r7 = new com.google.android.gms.auth.GoogleAuthException
            r7.<init>(r9)
            throw r7
        Lca:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r9)
            throw r7
        Ld0:
            com.google.android.gms.internal.auth.zzdc.zzd(r7)
            boolean r0 = com.google.android.gms.internal.auth.zzht.zzc()
            if (r0 == 0) goto L123
            if (r11 == 0) goto Le3
            if (r10 != 0) goto Lde
            goto Le3
        Lde:
            com.google.android.gms.auth.UserRecoverableAuthException r7 = com.google.android.gms.auth.UserRecoverableAuthException.zza(r9, r10, r11)
            throw r7
        Le3:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            int r7 = r0.getApkVersion(r7)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r7 < r0) goto L10a
            if (r11 != 0) goto L10a
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r7[r4] = r11
            r7[r5] = r8
            r7[r2] = r11
            java.lang.String r11 = "Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation."
            java.lang.String r7 = java.lang.String.format(r11, r7)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r1.e(r7, r11)
        L10a:
            if (r10 != 0) goto L11d
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r4] = r9
            r7[r5] = r8
            java.lang.String r8 = "no recovery Intent found with status=%s for method=%s. This shouldn't happen"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r1.e(r7, r8)
        L11d:
            com.google.android.gms.auth.UserRecoverableAuthException r7 = new com.google.android.gms.auth.UserRecoverableAuthException
            r7.<init>(r9, r10)
            throw r7
        L123:
            com.google.android.gms.auth.UserRecoverableAuthException r7 = new com.google.android.gms.auth.UserRecoverableAuthException
            r7.<init>(r9, r10)
            throw r7
    }

    private static void zzo(android.accounts.Account r4) {
            if (r4 == 0) goto L2e
            java.lang.String r0 = r4.name
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            java.lang.String[] r0 = com.google.android.gms.auth.zzl.zza
            r1 = 0
        Ld:
            r2 = 3
            if (r1 >= r2) goto L1e
            r2 = r0[r1]
            java.lang.String r3 = r4.type
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1b
            return
        L1b:
            int r1 = r1 + 1
            goto Ld
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Account type not supported"
            r4.<init>(r0)
            throw r4
        L26:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Account name cannot be empty!"
            r4.<init>(r0)
            throw r4
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Account cannot be null"
            r4.<init>(r0)
            throw r4
    }

    private static boolean zzp(android.content.Context r3) {
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r1 = 17895000(0x1110e58, float:2.6642585E-38)
            int r0 = r0.isGooglePlayServicesAvailable(r3, r1)
            r1 = 0
            if (r0 == 0) goto Lf
            return r1
        Lf:
            com.google.android.gms.internal.auth.zzhs r0 = com.google.android.gms.internal.auth.zzhw.zzb()
            java.util.List r0 = r0.zzq()
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            java.lang.String r3 = r3.packageName
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L21
            goto L35
        L34:
            r1 = 1
        L35:
            return r1
    }
}
