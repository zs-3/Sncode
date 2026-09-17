package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdk extends com.google.android.gms.internal.drive.zzl {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzch zzfw;
    private final com.google.android.gms.drive.events.ListenerToken zzgj;
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.events.OpenFileCallback> zzgk;

    zzdk(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.events.ListenerToken r2, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.events.OpenFileCallback> r3) {
            r0 = this;
            r0.zzfw = r1
            r0.<init>()
            r0.zzgj = r2
            r0.zzgk = r3
            return
    }

    private final void zza(com.google.android.gms.internal.drive.zzdg<com.google.android.gms.drive.events.OpenFileCallback> r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.events.OpenFileCallback> r0 = r2.zzgk
            com.google.android.gms.internal.drive.zzdo r1 = new com.google.android.gms.internal.drive.zzdo
            r1.<init>(r2, r3)
            r0.notifyListener(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.drive.zzdl r0 = new com.google.android.gms.internal.drive.zzdl
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    final /* synthetic */ void zza(com.google.android.gms.common.api.Status r1, com.google.android.gms.drive.events.OpenFileCallback r2) {
            r0 = this;
            com.google.android.gms.common.api.ApiException r1 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r1)
            r2.onError(r1)
            com.google.android.gms.internal.drive.zzch r1 = r0.zzfw
            com.google.android.gms.drive.events.ListenerToken r2 = r0.zzgj
            r1.cancelOpenFileCallback(r2)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfh r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.drive.zzdn r0 = new com.google.android.gms.internal.drive.zzdn
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    final /* synthetic */ void zza(com.google.android.gms.internal.drive.zzfh r2, com.google.android.gms.drive.events.OpenFileCallback r3) {
            r1 = this;
            com.google.android.gms.internal.drive.zzbi r0 = new com.google.android.gms.internal.drive.zzbi
            com.google.android.gms.drive.Contents r2 = r2.zzes
            r0.<init>(r2)
            r3.onContents(r0)
            com.google.android.gms.internal.drive.zzch r2 = r1.zzfw
            com.google.android.gms.drive.events.ListenerToken r3 = r1.zzgj
            r2.cancelOpenFileCallback(r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfl r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.drive.zzdm r0 = new com.google.android.gms.internal.drive.zzdm
            r0.<init>(r2)
            r1.zza(r0)
            return
    }
}
