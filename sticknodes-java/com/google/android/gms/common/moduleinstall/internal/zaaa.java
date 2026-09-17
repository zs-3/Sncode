package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zaaa implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    final /* synthetic */ com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate zaa;

    zaaa(com.google.android.gms.common.moduleinstall.internal.zaab r1, com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.common.moduleinstall.InstallStatusListener r2 = (com.google.android.gms.common.moduleinstall.InstallStatusListener) r2
            com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate r0 = r1.zaa
            r2.onInstallStatusUpdated(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
            r0 = this;
            return
    }
}
