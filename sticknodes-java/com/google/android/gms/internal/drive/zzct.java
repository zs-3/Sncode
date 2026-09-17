package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzct extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveContents> {
    private final /* synthetic */ com.google.android.gms.drive.DriveFile zzfs;
    private final /* synthetic */ int zzft;

    zzct(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.DriveFile r2, int r3) {
            r0 = this;
            r0.zzfs = r2
            r0.zzft = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r5, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveContents> r6) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.internal.drive.zzaw r5 = (com.google.android.gms.internal.drive.zzaw) r5
            android.os.IInterface r5 = r5.getService()
            com.google.android.gms.internal.drive.zzeo r5 = (com.google.android.gms.internal.drive.zzeo) r5
            com.google.android.gms.internal.drive.zzgj r0 = new com.google.android.gms.internal.drive.zzgj
            com.google.android.gms.drive.DriveFile r1 = r4.zzfs
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            int r2 = r4.zzft
            r3 = 0
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.drive.zzhi r1 = new com.google.android.gms.internal.drive.zzhi
            r1.<init>(r6)
            r5.zza(r0, r1)
            return
    }
}
