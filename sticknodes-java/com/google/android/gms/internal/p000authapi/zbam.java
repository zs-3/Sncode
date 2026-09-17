package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbam extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbam(com.google.android.gms.internal.p000authapi.zbap r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zba = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zba
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r2, r0)
            return
    }
}
