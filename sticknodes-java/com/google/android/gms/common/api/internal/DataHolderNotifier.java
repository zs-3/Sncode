package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public abstract class DataHolderNotifier<L> implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<L> {
    private final com.google.android.gms.common.data.DataHolder zaa;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected DataHolderNotifier(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @com.google.android.gms.common.annotation.KeepForSdk
    public final void notifyListener(L r2) {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.zaa
            r1.notifyListener(r2, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract void notifyListener(L r1, com.google.android.gms.common.data.DataHolder r2);

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @com.google.android.gms.common.annotation.KeepForSdk
    public void onNotifyListenerFailed() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.zaa
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }
}
