package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbm {
    private static final com.google.android.gms.common.logging.Logger zba = null;

    static {
            com.google.android.gms.common.logging.Logger r0 = new com.google.android.gms.common.logging.Logger
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "GoogleSignInCommon"
            r0.<init>(r2, r1)
            com.google.android.gms.auth.api.signin.internal.zbm.zba = r0
            return
    }

    public static android.content.Intent zba(android.content.Context r3, com.google.android.gms.auth.api.signin.GoogleSignInOptions r4) {
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.api.signin.internal.zbm.zba
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "getFallbackSignInIntent()"
            r0.d(r2, r1)
            android.content.Intent r3 = zbc(r3, r4)
            java.lang.String r4 = "com.google.android.gms.auth.APPAUTH_SIGN_IN"
            r3.setAction(r4)
            return r3
    }

    public static android.content.Intent zbb(android.content.Context r3, com.google.android.gms.auth.api.signin.GoogleSignInOptions r4) {
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.api.signin.internal.zbm.zba
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "getNoImplementationSignInIntent()"
            r0.d(r2, r1)
            android.content.Intent r3 = zbc(r3, r4)
            java.lang.String r4 = "com.google.android.gms.auth.NO_IMPL"
            r3.setAction(r4)
            return r3
    }

    public static android.content.Intent zbc(android.content.Context r3, com.google.android.gms.auth.api.signin.GoogleSignInOptions r4) {
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.api.signin.internal.zbm.zba
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "getSignInIntent()"
            r0.d(r2, r1)
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r0 = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration
            java.lang.String r1 = r3.getPackageName()
            r0.<init>(r1, r4)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.auth.GOOGLE_SIGN_IN"
            r4.<init>(r1)
            java.lang.String r1 = r3.getPackageName()
            r4.setPackage(r1)
            java.lang.Class<com.google.android.gms.auth.api.signin.internal.SignInHubActivity> r1 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.class
            r4.setClass(r3, r1)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r1 = "config"
            r3.putParcelable(r1, r0)
            r4.putExtra(r1, r3)
            return r4
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInResult zbd(android.content.Intent r3) {
            r0 = 0
            if (r3 != 0) goto Lb
            com.google.android.gms.auth.api.signin.GoogleSignInResult r3 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
            r3.<init>(r0, r1)
            return r3
        Lb:
            java.lang.String r1 = "googleSignInStatus"
            android.os.Parcelable r1 = r3.getParcelableExtra(r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            java.lang.String r2 = "googleSignInAccount"
            android.os.Parcelable r3 = r3.getParcelableExtra(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r3
            if (r3 != 0) goto L27
            com.google.android.gms.auth.api.signin.GoogleSignInResult r3 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            if (r1 != 0) goto L23
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
        L23:
            r3.<init>(r0, r1)
            return r3
        L27:
            com.google.android.gms.auth.api.signin.GoogleSignInResult r0 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r0.<init>(r3, r1)
            return r0
    }

    public static com.google.android.gms.common.api.OptionalPendingResult zbe(com.google.android.gms.common.api.GoogleApiClient r6, android.content.Context r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8, boolean r9) {
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.api.signin.internal.zbm.zba
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.d(r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "getEligibleSavedSignInResult()"
            r0.d(r3, r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.auth.api.signin.internal.zbn r2 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.zbb()
            r3 = 0
            if (r2 != 0) goto L22
        L1f:
            r4 = r3
            goto L89
        L22:
            android.accounts.Account r4 = r2.getAccount()
            android.accounts.Account r5 = r8.getAccount()
            if (r4 != 0) goto L2f
            if (r5 != 0) goto L1f
            goto L36
        L2f:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L36
            goto L1f
        L36:
            boolean r4 = r8.isServerAuthCodeRequested()
            if (r4 == 0) goto L3d
            goto L1f
        L3d:
            boolean r4 = r8.isIdTokenRequested()
            if (r4 == 0) goto L59
            boolean r4 = r2.isIdTokenRequested()
            if (r4 != 0) goto L4a
            goto L1f
        L4a:
            java.lang.String r4 = r8.getServerClientId()
            java.lang.String r5 = r2.getServerClientId()
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r5)
            if (r4 != 0) goto L59
            goto L1f
        L59:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r2 = r2.getScopes()
            r4.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r5 = r8.getScopes()
            r2.<init>(r5)
            boolean r2 = r4.containsAll(r2)
            if (r2 != 0) goto L72
            goto L1f
        L72:
            com.google.android.gms.auth.api.signin.internal.zbn r2 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r2.zba()
            if (r2 == 0) goto L1f
            boolean r4 = r2.isExpired()
            if (r4 != 0) goto L1f
            com.google.android.gms.auth.api.signin.GoogleSignInResult r4 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r4.<init>(r2, r5)
        L89:
            if (r4 == 0) goto L97
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Eligible saved sign in result found"
            r0.d(r8, r7)
            com.google.android.gms.common.api.OptionalPendingResult r6 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r4, r6)
            return r6
        L97:
            if (r9 == 0) goto La9
            com.google.android.gms.auth.api.signin.GoogleSignInResult r7 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r9 = 4
            r8.<init>(r9)
            r7.<init>(r3, r8)
            com.google.android.gms.common.api.OptionalPendingResult r6 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r7, r6)
            return r6
        La9:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r1 = "trySilentSignIn()"
            r0.d(r1, r9)
            com.google.android.gms.auth.api.signin.internal.zbg r9 = new com.google.android.gms.auth.api.signin.internal.zbg
            r9.<init>(r6, r7, r8)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r6 = r6.enqueue(r9)
            com.google.android.gms.common.api.internal.OptionalPendingResultImpl r7 = new com.google.android.gms.common.api.internal.OptionalPendingResultImpl
            r7.<init>(r6)
            return r7
    }

    public static com.google.android.gms.common.api.PendingResult zbf(com.google.android.gms.common.api.GoogleApiClient r3, android.content.Context r4, boolean r5) {
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.api.signin.internal.zbm.zba
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Revoking access"
            r0.d(r2, r1)
            com.google.android.gms.auth.api.signin.internal.Storage r0 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(r4)
            java.lang.String r0 = r0.getSavedRefreshToken()
            zbh(r4)
            if (r5 == 0) goto L1c
            com.google.android.gms.common.api.PendingResult r3 = com.google.android.gms.auth.api.signin.internal.zbb.zba(r0)
            return r3
        L1c:
            com.google.android.gms.auth.api.signin.internal.zbk r4 = new com.google.android.gms.auth.api.signin.internal.zbk
            r4.<init>(r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.execute(r4)
            return r3
    }

    public static com.google.android.gms.common.api.PendingResult zbg(com.google.android.gms.common.api.GoogleApiClient r3, android.content.Context r4, boolean r5) {
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.api.signin.internal.zbm.zba
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Signing out"
            r0.d(r2, r1)
            zbh(r4)
            if (r5 == 0) goto L16
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            com.google.android.gms.common.api.PendingResult r3 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r4, r3)
            return r3
        L16:
            com.google.android.gms.auth.api.signin.internal.zbi r4 = new com.google.android.gms.auth.api.signin.internal.zbi
            r4.<init>(r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.execute(r4)
            return r3
    }

    private static void zbh(android.content.Context r1) {
            com.google.android.gms.auth.api.signin.internal.zbn r1 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r1)
            r1.zbd()
            java.util.Set r1 = com.google.android.gms.common.api.GoogleApiClient.getAllClients()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            r0.maybeSignOut()
            goto Lf
        L1f:
            com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut()
            return
    }
}
