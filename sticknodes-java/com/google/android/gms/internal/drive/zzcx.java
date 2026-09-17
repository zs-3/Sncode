package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcx extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveContents> {
    private final /* synthetic */ com.google.android.gms.drive.DriveContents zzfx;

    zzcx(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.DriveContents r2) {
            r0 = this;
            r0.zzfx = r2
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
            com.google.android.gms.drive.DriveContents r1 = r4.zzfx
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            com.google.android.gms.drive.DriveContents r2 = r4.zzfx
            com.google.android.gms.drive.Contents r2 = r2.zzi()
            int r2 = r2.getRequestId()
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r0.<init>(r1, r3, r2)
            com.google.android.gms.internal.drive.zzhi r1 = new com.google.android.gms.internal.drive.zzhi
            r1.<init>(r6)
            r5.zza(r0, r1)
            return
    }
}
