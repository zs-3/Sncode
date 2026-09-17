package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zas extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;

    zas(com.google.android.gms.common.moduleinstall.internal.zay r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zab(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zaa
            r1 = 0
            com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(r3, r1, r0)
            return
    }
}
