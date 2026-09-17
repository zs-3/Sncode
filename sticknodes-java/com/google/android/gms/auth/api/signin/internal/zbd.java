package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbd implements com.google.android.gms.auth.api.signin.GoogleSignInApi {
    public zbd() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba(com.google.android.gms.common.api.GoogleApiClient r1) {
            com.google.android.gms.common.api.Api$ClientKey r0 = com.google.android.gms.auth.api.Auth.zbb
            com.google.android.gms.common.api.Api$Client r1 = r1.getClient(r0)
            com.google.android.gms.auth.api.signin.internal.zbe r1 = (com.google.android.gms.auth.api.signin.internal.zbe) r1
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r1.zba()
            return r1
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final android.content.Intent getSignInIntent(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = zba(r2)
            android.content.Intent r2 = com.google.android.gms.auth.api.signin.internal.zbm.zbc(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent r1) {
            r0 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInResult r1 = com.google.android.gms.auth.api.signin.internal.zbm.zbd(r1)
            return r1
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> revokeAccess(com.google.android.gms.common.api.GoogleApiClient r3) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            r1 = 0
            com.google.android.gms.common.api.PendingResult r3 = com.google.android.gms.auth.api.signin.internal.zbm.zbf(r3, r0, r1)
            return r3
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> signOut(com.google.android.gms.common.api.GoogleApiClient r3) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            r1 = 0
            com.google.android.gms.common.api.PendingResult r3 = com.google.android.gms.auth.api.signin.internal.zbm.zbg(r3, r0, r1)
            return r3
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> silentSignIn(com.google.android.gms.common.api.GoogleApiClient r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = zba(r4)
            r2 = 0
            com.google.android.gms.common.api.OptionalPendingResult r4 = com.google.android.gms.auth.api.signin.internal.zbm.zbe(r4, r0, r1, r2)
            return r4
    }
}
