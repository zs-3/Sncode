package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbf extends com.google.android.gms.auth.api.signin.internal.zba {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zbg zba;

    zbf(com.google.android.gms.auth.api.signin.internal.zbg r1) {
            r0 = this;
            r0.zba = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbd(com.google.android.gms.auth.api.signin.GoogleSignInAccount r3, com.google.android.gms.common.api.Status r4) throws android.os.RemoteException {
            r2 = this;
            if (r3 == 0) goto Lf
            com.google.android.gms.auth.api.signin.internal.zbg r0 = r2.zba
            android.content.Context r1 = r0.zba
            com.google.android.gms.auth.api.signin.internal.zbn r1 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r0.zbb
            r1.zbe(r0, r3)
        Lf:
            com.google.android.gms.auth.api.signin.internal.zbg r0 = r2.zba
            com.google.android.gms.auth.api.signin.GoogleSignInResult r1 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            r1.<init>(r3, r4)
            r0.setResult(r1)
            return
    }
}
