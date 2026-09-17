package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
abstract class zzca extends com.google.android.gms.internal.drive.zzau<com.google.android.gms.drive.DriveFolder.DriveFolderResult> {
    zzca(com.google.android.gms.common.api.GoogleApiClient r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.internal.drive.zzbz r0 = new com.google.android.gms.internal.drive.zzbz
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }
}
