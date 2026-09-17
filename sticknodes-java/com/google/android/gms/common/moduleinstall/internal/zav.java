package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zav extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;

    zav(com.google.android.gms.common.moduleinstall.internal.zay r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.google.android.gms.tasks.TaskCompletionSource r1 = r2.zaa
            com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(r3, r0, r1)
            return
    }
}
