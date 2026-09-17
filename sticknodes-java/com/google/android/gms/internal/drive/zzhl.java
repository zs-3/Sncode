package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzhl extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.DriveId> {
    public zzhl(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveId> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfn r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zzay()
            com.google.android.gms.drive.DriveId r2 = r2.getDriveId()
            r0.setResult(r2)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfy r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zzay()
            com.google.android.gms.internal.drive.zzaa r1 = new com.google.android.gms.internal.drive.zzaa
            com.google.android.gms.drive.metadata.internal.MetadataBundle r3 = r3.zzaw()
            r1.<init>(r3)
            com.google.android.gms.drive.DriveId r3 = r1.getDriveId()
            r0.setResult(r3)
            return
    }
}
