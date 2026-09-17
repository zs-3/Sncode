package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class GoogleAuthUtil extends com.google.android.gms.auth.zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final java.lang.String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final java.lang.String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final java.lang.String WORK_ACCOUNT_TYPE = "com.google.work";

    private GoogleAuthUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearToken(android.content.Context r0, java.lang.String r1) throws com.google.android.gms.auth.GooglePlayServicesAvailabilityException, com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            com.google.android.gms.auth.zzl.clearToken(r0, r1)
            return
    }

    public static java.util.List<com.google.android.gms.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context r0, int r1, java.lang.String r2) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            java.util.List r0 = com.google.android.gms.auth.zzl.getAccountChangeEvents(r0, r1, r2)
            return r0
    }

    public static java.lang.String getAccountId(android.content.Context r0, java.lang.String r1) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            java.lang.String r0 = com.google.android.gms.auth.zzl.getAccountId(r0, r1)
            return r0
    }

    public static java.lang.String getToken(android.content.Context r0, android.accounts.Account r1, java.lang.String r2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
            java.lang.String r0 = com.google.android.gms.auth.zzl.getToken(r0, r1, r2)
            return r0
    }

    public static java.lang.String getToken(android.content.Context r0, android.accounts.Account r1, java.lang.String r2, android.os.Bundle r3) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
            java.lang.String r0 = com.google.android.gms.auth.zzl.getToken(r0, r1, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context r0, java.lang.String r1, java.lang.String r2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
            java.lang.String r0 = com.google.android.gms.auth.zzl.getToken(r0, r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context r0, java.lang.String r1, java.lang.String r2, android.os.Bundle r3) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
            java.lang.String r0 = com.google.android.gms.auth.zzl.getToken(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String getTokenWithNotification(android.content.Context r6, android.accounts.Account r7, java.lang.String r8, android.os.Bundle r9) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
            if (r9 != 0) goto L7
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L7:
            r3 = r9
            r9 = 1
            java.lang.String r0 = "handle_notification"
            r3.putBoolean(r0, r9)
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            com.google.android.gms.auth.TokenData r6 = zzg(r0, r1, r2, r3, r4)
            java.lang.String r6 = r6.zza()
            return r6
    }

    public static java.lang.String getTokenWithNotification(android.content.Context r6, android.accounts.Account r7, java.lang.String r8, android.os.Bundle r9, android.content.Intent r10) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
            com.google.android.gms.auth.zzl.zzf(r10)
            if (r9 != 0) goto La
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        La:
            r3 = r9
            java.lang.String r9 = "callback_intent"
            r3.putParcelable(r9, r10)
            r9 = 1
            java.lang.String r10 = "handle_notification"
            r3.putBoolean(r10, r9)
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            com.google.android.gms.auth.TokenData r6 = zzg(r0, r1, r2, r3, r4)
            java.lang.String r6 = r6.zza()
            return r6
    }

    public static java.lang.String getTokenWithNotification(android.content.Context r6, android.accounts.Account r7, java.lang.String r8, android.os.Bundle r9, java.lang.String r10, android.os.Bundle r11) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
            java.lang.String r0 = "Authority cannot be empty or null."
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10, r0)
            if (r9 != 0) goto Lc
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        Lc:
            r3 = r9
            if (r11 != 0) goto L14
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
        L14:
            android.content.ContentResolver.validateSyncExtrasBundle(r11)
            java.lang.String r9 = "authority"
            r3.putString(r9, r10)
            java.lang.String r9 = "sync_extras"
            r3.putBundle(r9, r11)
            r9 = 1
            java.lang.String r10 = "handle_notification"
            r3.putBoolean(r10, r9)
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            com.google.android.gms.auth.TokenData r6 = zzg(r0, r1, r2, r3, r4)
            java.lang.String r6 = r6.zza()
            return r6
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r1 = "com.google"
            r0.<init>(r3, r1)
            java.lang.String r2 = getTokenWithNotification(r2, r0, r4, r5)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5, android.content.Intent r6) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r1 = "com.google"
            r0.<init>(r3, r1)
            java.lang.String r2 = getTokenWithNotification(r2, r0, r4, r5, r6)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context r6, java.lang.String r7, java.lang.String r8, android.os.Bundle r9, java.lang.String r10, android.os.Bundle r11) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
            android.accounts.Account r1 = new android.accounts.Account
            java.lang.String r0 = "com.google"
            r1.<init>(r7, r0)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.String r6 = getTokenWithNotification(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @java.lang.Deprecated
    public static void invalidateToken(android.content.Context r0, java.lang.String r1) {
            com.google.android.gms.auth.zzl.invalidateToken(r0, r1)
            return
    }

    @android.annotation.TargetApi(23)
    public static android.os.Bundle removeAccount(android.content.Context r0, android.accounts.Account r1) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            android.os.Bundle r0 = com.google.android.gms.auth.zzl.removeAccount(r0, r1)
            return r0
    }

    @android.annotation.TargetApi(26)
    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context r0) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
            java.lang.Boolean r0 = com.google.android.gms.auth.zzl.requestGoogleAccountsAccess(r0)
            return r0
    }

    private static com.google.android.gms.auth.TokenData zzg(android.content.Context r8, android.accounts.Account r9, java.lang.String r10, android.os.Bundle r11, long r12) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
            java.lang.String r12 = "User intervention required. Notification has been pushed."
            java.lang.String r13 = "Error when getting token"
            java.lang.String r0 = "GoogleAuthUtil"
            r5 = 0
            r7 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            com.google.android.gms.auth.TokenData r9 = com.google.android.gms.auth.zzl.zza(r1, r2, r3, r4, r5, r7)     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L15 com.google.android.gms.auth.GooglePlayServicesAvailabilityException -> L22
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(r8)     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L15 com.google.android.gms.auth.GooglePlayServicesAvailabilityException -> L22
            return r9
        L15:
            r9 = move-exception
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(r8)
            android.util.Log.w(r0, r13, r9)
            com.google.android.gms.auth.UserRecoverableNotifiedException r8 = new com.google.android.gms.auth.UserRecoverableNotifiedException
            r8.<init>(r12, r9)
            throw r8
        L22:
            r9 = move-exception
            int r10 = r9.getConnectionStatusCode()
            com.google.android.gms.common.GooglePlayServicesUtil.showErrorNotification(r10, r8)
            android.util.Log.w(r0, r13, r9)
            com.google.android.gms.auth.UserRecoverableNotifiedException r8 = new com.google.android.gms.auth.UserRecoverableNotifiedException
            r8.<init>(r12, r9)
            throw r8
    }
}
