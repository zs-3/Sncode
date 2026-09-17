package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbj extends com.google.android.gms.auth.api.signin.internal.zba {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zbk zba;

    zbj(com.google.android.gms.auth.api.signin.internal.zbk r1) {
            r0 = this;
            r0.zba = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbb(com.google.android.gms.common.api.Status r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.auth.api.signin.internal.zbk r0 = r1.zba
            r0.setResult(r2)
            return
    }
}
