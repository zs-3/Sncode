package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzg implements com.google.android.gms.drive.events.ListenerToken {
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zzcy;
    private com.google.android.gms.common.internal.ICancelToken zzcz;

    public zzg(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzcz = r0
            r1.zzcy = r2
            return
    }

    public final boolean cancel() {
            r1 = this;
            com.google.android.gms.common.internal.ICancelToken r0 = r1.zzcz
            if (r0 == 0) goto L9
            r0.cancel()     // Catch: android.os.RemoteException -> L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void setCancelToken(com.google.android.gms.common.internal.ICancelToken r1) {
            r0 = this;
            r0.zzcz = r1
            return
    }

    public final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zzad() {
            r1 = this;
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r1.zzcy
            return r0
    }
}
