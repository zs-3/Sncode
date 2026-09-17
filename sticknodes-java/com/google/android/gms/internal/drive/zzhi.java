package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzhi extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.DriveContents> {
    public zzhi(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveContents> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfh r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zzay()
            com.google.android.gms.internal.drive.zzbi r1 = new com.google.android.gms.internal.drive.zzbi
            com.google.android.gms.drive.Contents r3 = r3.zzar()
            r1.<init>(r3)
            r0.setResult(r1)
            return
    }
}
