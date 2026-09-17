package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzao implements com.google.android.gms.drive.DriveApi.DriveIdResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.DriveId zzk;

    public zzao(com.google.android.gms.common.api.Status r1, com.google.android.gms.drive.DriveId r2) {
            r0 = this;
            r0.<init>()
            r0.zzdy = r1
            r0.zzk = r2
            return
    }

    @Override // com.google.android.gms.drive.DriveApi.DriveIdResult
    public final com.google.android.gms.drive.DriveId getDriveId() {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zzdy
            return r0
    }
}
