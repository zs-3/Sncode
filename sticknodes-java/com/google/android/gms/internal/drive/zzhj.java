package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzhj extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.DriveFile> {
    public zzhj(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveFile> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfn r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zzay()
            com.google.android.gms.drive.DriveId r2 = r2.getDriveId()
            com.google.android.gms.drive.DriveFile r2 = r2.asDriveFile()
            r0.setResult(r2)
            return
    }
}
