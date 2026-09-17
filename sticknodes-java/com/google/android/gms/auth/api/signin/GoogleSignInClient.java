package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class GoogleSignInClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.signin.GoogleSignInOptions> {
    static int zba;
    private static final com.google.android.gms.auth.api.signin.zbb zbb = null;

    static {
            com.google.android.gms.auth.api.signin.zbb r0 = new com.google.android.gms.auth.api.signin.zbb
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInClient.zbb = r0
            r0 = 1
            com.google.android.gms.auth.api.signin.GoogleSignInClient.zba = r0
            return
    }

    GoogleSignInClient(android.app.Activity r3, com.google.android.gms.auth.api.signin.GoogleSignInOptions r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r0 = com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API
            com.google.android.gms.common.api.internal.ApiExceptionMapper r1 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r1.<init>()
            r2.<init>(r3, r0, r4, r1)
            return
    }

    GoogleSignInClient(android.content.Context r4, com.google.android.gms.auth.api.signin.GoogleSignInOptions r5) {
            r3 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r0 = com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r1 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r1.<init>()
            com.google.android.gms.common.api.internal.ApiExceptionMapper r2 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r2.<init>()
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r1 = r1.setMapper(r2)
            com.google.android.gms.common.api.GoogleApi$Settings r1 = r1.build()
            r3.<init>(r4, r0, r5, r1)
            return
    }

    private final synchronized int zba() {
            r6 = this;
            monitor-enter(r6)
            int r0 = com.google.android.gms.auth.api.signin.GoogleSignInClient.zba     // Catch: java.lang.Throwable -> L36
            r1 = 1
            r2 = 3
            r3 = 2
            r4 = 4
            if (r0 != r1) goto L34
            android.content.Context r0 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L36
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r5 = r1.isGooglePlayServicesAvailable(r0, r5)     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto L1e
            com.google.android.gms.auth.api.signin.GoogleSignInClient.zba = r4     // Catch: java.lang.Throwable -> L36
            r0 = 4
            goto L34
        L1e:
            r4 = 0
            android.content.Intent r1 = r1.getErrorResolutionIntent(r0, r5, r4)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L31
            java.lang.String r1 = "com.google.android.gms.auth.api.fallback"
            int r0 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r0, r1)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L31
            com.google.android.gms.auth.api.signin.GoogleSignInClient.zba = r2     // Catch: java.lang.Throwable -> L36
            r0 = 3
            goto L34
        L31:
            com.google.android.gms.auth.api.signin.GoogleSignInClient.zba = r3     // Catch: java.lang.Throwable -> L36
            r0 = 2
        L34:
            monitor-exit(r6)
            return r0
        L36:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    public android.content.Intent getSignInIntent() {
            r3 = this;
            android.content.Context r0 = r3.getApplicationContext()
            int r1 = r3.zba()
            int r2 = r1 + (-1)
            if (r1 == 0) goto L33
            r1 = 2
            if (r2 == r1) goto L28
            r1 = 3
            if (r2 == r1) goto L1d
            com.google.android.gms.common.api.Api$ApiOptions r1 = r3.getApiOptions()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r1
            android.content.Intent r0 = com.google.android.gms.auth.api.signin.internal.zbm.zbb(r0, r1)
            return r0
        L1d:
            com.google.android.gms.common.api.Api$ApiOptions r1 = r3.getApiOptions()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r1
            android.content.Intent r0 = com.google.android.gms.auth.api.signin.internal.zbm.zbc(r0, r1)
            return r0
        L28:
            com.google.android.gms.common.api.Api$ApiOptions r1 = r3.getApiOptions()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r1
            android.content.Intent r0 = com.google.android.gms.auth.api.signin.internal.zbm.zba(r0, r1)
            return r0
        L33:
            r0 = 0
            throw r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> revokeAccess() {
            r4 = this;
            com.google.android.gms.common.api.GoogleApiClient r0 = r4.asGoogleApiClient()
            android.content.Context r1 = r4.getApplicationContext()
            int r2 = r4.zba()
            r3 = 3
            if (r2 != r3) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            com.google.android.gms.common.api.PendingResult r0 = com.google.android.gms.auth.api.signin.internal.zbm.zbf(r0, r1, r2)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(r0)
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> signOut() {
            r4 = this;
            com.google.android.gms.common.api.GoogleApiClient r0 = r4.asGoogleApiClient()
            android.content.Context r1 = r4.getApplicationContext()
            int r2 = r4.zba()
            r3 = 3
            if (r2 != r3) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            com.google.android.gms.common.api.PendingResult r0 = com.google.android.gms.auth.api.signin.internal.zbm.zbg(r0, r1, r2)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(r0)
            return r0
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> silentSignIn() {
            r5 = this;
            com.google.android.gms.common.api.GoogleApiClient r0 = r5.asGoogleApiClient()
            android.content.Context r1 = r5.getApplicationContext()
            com.google.android.gms.common.api.Api$ApiOptions r2 = r5.getApiOptions()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r2
            int r3 = r5.zba()
            r4 = 3
            if (r3 != r4) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            com.google.android.gms.common.api.OptionalPendingResult r0 = com.google.android.gms.auth.api.signin.internal.zbm.zbe(r0, r1, r2, r3)
            com.google.android.gms.auth.api.signin.zbb r1 = com.google.android.gms.auth.api.signin.GoogleSignInClient.zbb
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.common.internal.PendingResultUtil.toTask(r0, r1)
            return r0
    }
}
