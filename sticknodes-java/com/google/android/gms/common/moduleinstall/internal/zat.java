package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zat extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;

    zat(com.google.android.gms.common.moduleinstall.internal.zay r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(com.google.android.gms.common.api.Status r2, com.google.android.gms.common.moduleinstall.ModuleInstallResponse r3) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zaa
            com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(r2, r3, r0)
            return
    }
}
