package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzak extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveContentsResult> zzdx;

    zzak(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveContentsResult> r1) {
            r0 = this;
            r0.<init>()
            r0.zzdx = r1
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveApi$DriveContentsResult> r0 = r3.zzdx
            com.google.android.gms.internal.drive.zzal r1 = new com.google.android.gms.internal.drive.zzal
            r2 = 0
            r1.<init>(r4, r2)
            r0.setResult(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfh r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveApi$DriveContentsResult> r0 = r4.zzdx
            com.google.android.gms.internal.drive.zzal r1 = new com.google.android.gms.internal.drive.zzal
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            com.google.android.gms.internal.drive.zzbi r3 = new com.google.android.gms.internal.drive.zzbi
            com.google.android.gms.drive.Contents r5 = r5.zzes
            r3.<init>(r5)
            r1.<init>(r2, r3)
            r0.setResult(r1)
            return
    }
}
