package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbg extends com.google.android.gms.auth.api.signin.internal.zbl {
    final /* synthetic */ android.content.Context zba;
    final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb;

    zbg(com.google.android.gms.common.api.GoogleApiClient r1, android.content.Context r2, com.google.android.gms.auth.api.signin.GoogleSignInOptions r3) {
            r0 = this;
            r0.zba = r2
            r0.zbb = r3
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInResult r0 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            r1 = 0
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.auth.api.signin.internal.zbe r3 = (com.google.android.gms.auth.api.signin.internal.zbe) r3
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.auth.api.signin.internal.zbs r3 = (com.google.android.gms.auth.api.signin.internal.zbs) r3
            com.google.android.gms.auth.api.signin.internal.zbf r0 = new com.google.android.gms.auth.api.signin.internal.zbf
            r0.<init>(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r2.zbb
            r3.zbe(r0, r1)
            return
    }
}
