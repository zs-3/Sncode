package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbad extends com.google.android.gms.internal.p000authapi.zbr {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbad(com.google.android.gms.internal.p000authapi.zbaf r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zba = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.p000authapi.zbs
    public final void zbb(com.google.android.gms.common.api.Status r2, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult r3) throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r2.isSuccess()
            if (r0 == 0) goto Lc
            com.google.android.gms.tasks.TaskCompletionSource r2 = r1.zba
            r2.setResult(r3)
            return
        Lc:
            com.google.android.gms.tasks.TaskCompletionSource r3 = r1.zba
            com.google.android.gms.common.api.ApiException r2 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r2)
            r3.setException(r2)
            return
    }
}
