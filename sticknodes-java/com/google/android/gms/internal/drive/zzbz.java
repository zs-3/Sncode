package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbz implements com.google.android.gms.drive.DriveFolder.DriveFolderResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.DriveFolder zzfj;

    public zzbz(com.google.android.gms.common.api.Status r1, com.google.android.gms.drive.DriveFolder r2) {
            r0 = this;
            r0.<init>()
            r0.zzdy = r1
            r0.zzfj = r2
            return
    }

    @Override // com.google.android.gms.drive.DriveFolder.DriveFolderResult
    public final com.google.android.gms.drive.DriveFolder getDriveFolder() {
            r1 = this;
            com.google.android.gms.drive.DriveFolder r0 = r1.zzfj
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zzdy
            return r0
    }
}
