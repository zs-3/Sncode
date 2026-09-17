package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
abstract class zzea extends com.google.android.gms.internal.drive.zzau<com.google.android.gms.drive.DriveResource.MetadataResult> {
    private zzea(com.google.android.gms.internal.drive.zzdp r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    /* synthetic */ zzea(com.google.android.gms.internal.drive.zzdp r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.internal.drive.zzdq r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.internal.drive.zzdz r0 = new com.google.android.gms.internal.drive.zzdz
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }
}
