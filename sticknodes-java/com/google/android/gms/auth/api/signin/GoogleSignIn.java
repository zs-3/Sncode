package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class GoogleSignIn {
    private GoogleSignIn() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccountForExtension(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension r2) {
            java.lang.String r0 = "please provide a valid Context object"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "please provide valid GoogleSignInOptionsExtension"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = getLastSignedInAccount(r1)
            if (r1 != 0) goto L14
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault()
        L14:
            java.util.List r2 = r2.getImpliedScopes()
            com.google.android.gms.common.api.Scope[] r2 = zbb(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.requestExtraScopes(r2)
            return r1
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccountForScopes(android.content.Context r2, com.google.android.gms.common.api.Scope r3, com.google.android.gms.common.api.Scope... r4) {
            java.lang.String r0 = "please provide a valid Context object"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "please provide at least one valid scope"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = getLastSignedInAccount(r2)
            if (r2 != 0) goto L14
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault()
        L14:
            r0 = 1
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            r1 = 0
            r0[r1] = r3
            r2.requestExtraScopes(r0)
            r2.requestExtraScopes(r4)
            return r2
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInClient getClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInOptions r2) {
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = new com.google.android.gms.auth.api.signin.GoogleSignInClient
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r2
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInClient getClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInOptions r2) {
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = new com.google.android.gms.auth.api.signin.GoogleSignInClient
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r2
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getLastSignedInAccount(android.content.Context r0) {
            com.google.android.gms.auth.api.signin.internal.zbn r0 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r0.zba()
            return r0
    }

    public static com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> getSignedInAccountFromIntent(android.content.Intent r2) {
            com.google.android.gms.auth.api.signin.GoogleSignInResult r2 = com.google.android.gms.auth.api.signin.internal.zbm.zbd(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r2.getSignInAccount()
            com.google.android.gms.common.api.Status r1 = r2.getStatus()
            boolean r1 = r1.isSuccess()
            if (r1 == 0) goto L1a
            if (r0 != 0) goto L15
            goto L1a
        L15:
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forResult(r0)
            return r2
        L1a:
            com.google.android.gms.common.api.Status r2 = r2.getStatus()
            com.google.android.gms.common.api.ApiException r2 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r2)
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forException(r2)
            return r2
    }

    public static boolean hasPermissions(com.google.android.gms.auth.api.signin.GoogleSignInAccount r1, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension r2) {
            java.lang.String r0 = "Please provide a non-null GoogleSignInOptionsExtension"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.util.List r2 = r2.getImpliedScopes()
            com.google.android.gms.common.api.Scope[] r2 = zbb(r2)
            boolean r1 = hasPermissions(r1, r2)
            return r1
    }

    public static boolean hasPermissions(com.google.android.gms.auth.api.signin.GoogleSignInAccount r1, com.google.android.gms.common.api.Scope... r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Collections.addAll(r0, r2)
            java.util.Set r1 = r1.getGrantedScopes()
            boolean r1 = r1.containsAll(r0)
            return r1
    }

    public static void requestPermissions(android.app.Activity r1, int r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension r4) {
            java.lang.String r0 = "Please provide a non-null Activity"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Please provide a non-null GoogleSignInOptionsExtension"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            java.util.List r4 = r4.getImpliedScopes()
            com.google.android.gms.common.api.Scope[] r4 = zbb(r4)
            requestPermissions(r1, r2, r3, r4)
            return
    }

    public static void requestPermissions(android.app.Activity r1, int r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3, com.google.android.gms.common.api.Scope... r4) {
            java.lang.String r0 = "Please provide a non-null Activity"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Please provide at least one scope"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            android.content.Intent r3 = zba(r1, r3, r4)
            r1.startActivityForResult(r3, r2)
            return
    }

    public static void requestPermissions(androidx.fragment.app.Fragment r1, int r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension r4) {
            java.lang.String r0 = "Please provide a non-null Fragment"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Please provide a non-null GoogleSignInOptionsExtension"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            java.util.List r4 = r4.getImpliedScopes()
            com.google.android.gms.common.api.Scope[] r4 = zbb(r4)
            requestPermissions(r1, r2, r3, r4)
            return
    }

    public static void requestPermissions(androidx.fragment.app.Fragment r1, int r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3, com.google.android.gms.common.api.Scope... r4) {
            java.lang.String r0 = "Please provide a non-null Fragment"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Please provide at least one scope"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            android.content.Intent r3 = zba(r0, r3, r4)
            r1.startActivityForResult(r3, r2)
            return
    }

    private static android.content.Intent zba(android.app.Activity r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3, com.google.android.gms.common.api.Scope... r4) {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r0 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
            r0.<init>()
            int r1 = r4.length
            if (r1 <= 0) goto Le
            r1 = 0
            r1 = r4[r1]
            r0.requestScopes(r1, r4)
        Le:
            if (r3 == 0) goto L27
            java.lang.String r4 = r3.getEmail()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L27
            java.lang.String r3 = r3.getEmail()
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0.setAccountName(r3)
        L27:
            com.google.android.gms.auth.api.signin.GoogleSignInClient r3 = new com.google.android.gms.auth.api.signin.GoogleSignInClient
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = r0.build()
            r3.<init>(r2, r4)
            android.content.Intent r2 = r3.getSignInIntent()
            return r2
    }

    private static com.google.android.gms.common.api.Scope[] zbb(java.util.List r1) {
            if (r1 != 0) goto L6
            r1 = 0
            com.google.android.gms.common.api.Scope[] r1 = new com.google.android.gms.common.api.Scope[r1]
            return r1
        L6:
            int r0 = r1.size()
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            com.google.android.gms.common.api.Scope[] r1 = (com.google.android.gms.common.api.Scope[]) r1
            return r1
    }
}
