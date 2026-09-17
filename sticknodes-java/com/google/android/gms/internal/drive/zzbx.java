package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbx implements com.google.android.gms.drive.DriveFolder.DriveFileResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.DriveFile zzfi;

    public zzbx(com.google.android.gms.common.api.Status r1, com.google.android.gms.drive.DriveFile r2) {
            r0 = this;
            r0.<init>()
            r0.zzdy = r1
            r0.zzfi = r2
            return
    }

    @Override // com.google.android.gms.drive.DriveFolder.DriveFileResult
    public final com.google.android.gms.drive.DriveFile getDriveFile() {
            r1 = this;
            com.google.android.gms.drive.DriveFile r0 = r1.zzfi
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zzdy
            return r0
    }
}
