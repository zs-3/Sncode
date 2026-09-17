package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbae extends com.google.android.gms.internal.p000authapi.zbt {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbae(com.google.android.gms.internal.p000authapi.zbaf r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zba = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.p000authapi.zbu
    public final void zbb(com.google.android.gms.common.api.Status r2, com.google.android.gms.auth.api.identity.SavePasswordResult r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zba
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r2, r3, r0)
            return
    }
}
