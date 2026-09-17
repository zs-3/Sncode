package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcu extends com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.events.OpenFileCallback> {
    private final /* synthetic */ com.google.android.gms.drive.DriveFile zzfs;
    private final /* synthetic */ int zzft;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzg zzfu;
    private final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzfv;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzch zzfw;

    zzcu(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.common.api.internal.ListenerHolder r2, com.google.android.gms.drive.DriveFile r3, int r4, com.google.android.gms.internal.drive.zzg r5, com.google.android.gms.common.api.internal.ListenerHolder r6) {
            r0 = this;
            r0.zzfw = r1
            r0.zzfs = r3
            r0.zzft = r4
            r0.zzfu = r5
            r0.zzfv = r6
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final /* synthetic */ void registerListener(com.google.android.gms.common.api.Api.AnyClient r6, com.google.android.gms.tasks.TaskCompletionSource r7) throws android.os.RemoteException {
            r5 = this;
            com.google.android.gms.internal.drive.zzaw r6 = (com.google.android.gms.internal.drive.zzaw) r6
            com.google.android.gms.internal.drive.zzgj r0 = new com.google.android.gms.internal.drive.zzgj
            com.google.android.gms.drive.DriveFile r1 = r5.zzfs
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            int r2 = r5.zzft
            r3 = 0
            r0.<init>(r1, r2, r3)
            android.os.IInterface r6 = r6.getService()
            com.google.android.gms.internal.drive.zzeo r6 = (com.google.android.gms.internal.drive.zzeo) r6
            com.google.android.gms.internal.drive.zzdk r1 = new com.google.android.gms.internal.drive.zzdk
            com.google.android.gms.internal.drive.zzch r2 = r5.zzfw
            com.google.android.gms.internal.drive.zzg r3 = r5.zzfu
            com.google.android.gms.common.api.internal.ListenerHolder r4 = r5.zzfv
            r1.<init>(r2, r3, r4)
            com.google.android.gms.internal.drive.zzec r6 = r6.zza(r0, r1)
            com.google.android.gms.internal.drive.zzg r0 = r5.zzfu
            android.os.IBinder r6 = r6.zzgs
            com.google.android.gms.common.internal.ICancelToken r6 = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(r6)
            r0.setCancelToken(r6)
            r6 = 0
            r7.setResult(r6)
            return
    }
}
