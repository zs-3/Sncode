package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
abstract class zzcg extends com.google.android.gms.internal.drive.zzau<com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzcb zzfk;

    public zzcg(com.google.android.gms.internal.drive.zzcb r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.zzfk = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r4) {
            r3 = this;
            com.google.android.gms.internal.drive.zzcf r0 = new com.google.android.gms.internal.drive.zzcf
            com.google.android.gms.internal.drive.zzcb r1 = r3.zzfk
            r2 = 0
            r0.<init>(r1, r4, r2, r2)
            return r0
    }
}
