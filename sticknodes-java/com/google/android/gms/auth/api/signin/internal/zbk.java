package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbk extends com.google.android.gms.auth.api.signin.internal.zbl {
    zbk(com.google.android.gms.common.api.GoogleApiClient r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.auth.api.signin.internal.zbe r3 = (com.google.android.gms.auth.api.signin.internal.zbe) r3
            android.os.IInterface r0 = r3.getService()
            com.google.android.gms.auth.api.signin.internal.zbs r0 = (com.google.android.gms.auth.api.signin.internal.zbs) r0
            com.google.android.gms.auth.api.signin.internal.zbj r1 = new com.google.android.gms.auth.api.signin.internal.zbj
            r1.<init>(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r3 = r3.zba()
            r0.zbc(r1, r3)
            return
    }
}
