package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
abstract class zzar extends com.google.android.gms.internal.drive.zzau<com.google.android.gms.drive.DriveApi.MetadataBufferResult> {
    zzar(com.google.android.gms.common.api.GoogleApiClient r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r4) {
            r3 = this;
            com.google.android.gms.internal.drive.zzaq r0 = new com.google.android.gms.internal.drive.zzaq
            r1 = 0
            r2 = 0
            r0.<init>(r4, r1, r2)
            return r0
    }
}
