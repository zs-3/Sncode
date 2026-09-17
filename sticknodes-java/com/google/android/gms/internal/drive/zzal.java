package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzal implements com.google.android.gms.common.api.Releasable, com.google.android.gms.drive.DriveApi.DriveContentsResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.DriveContents zzo;

    public zzal(com.google.android.gms.common.api.Status r1, com.google.android.gms.drive.DriveContents r2) {
            r0 = this;
            r0.<init>()
            r0.zzdy = r1
            r0.zzo = r2
            return
    }

    @Override // com.google.android.gms.drive.DriveApi.DriveContentsResult
    public final com.google.android.gms.drive.DriveContents getDriveContents() {
            r1 = this;
            com.google.android.gms.drive.DriveContents r0 = r1.zzo
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zzdy
            return r0
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
            r1 = this;
            com.google.android.gms.drive.DriveContents r0 = r1.zzo
            if (r0 == 0) goto L7
            r0.zzj()
        L7:
            return
    }
}
