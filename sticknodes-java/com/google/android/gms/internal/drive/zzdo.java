package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdo implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.drive.events.OpenFileCallback> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdg zzgp;

    zzdo(com.google.android.gms.internal.drive.zzdk r1, com.google.android.gms.internal.drive.zzdg r2) {
            r0 = this;
            r0.zzgp = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.drive.events.OpenFileCallback r2) {
            r1 = this;
            com.google.android.gms.drive.events.OpenFileCallback r2 = (com.google.android.gms.drive.events.OpenFileCallback) r2
            com.google.android.gms.internal.drive.zzdg r0 = r1.zzgp
            r0.accept(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
            r0 = this;
            return
    }
}
