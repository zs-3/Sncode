package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzgl extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveContentsResult> zzdx;
    private final com.google.android.gms.drive.DriveFile.DownloadProgressListener zziq;

    zzgl(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveContentsResult> r1, com.google.android.gms.drive.DriveFile.DownloadProgressListener r2) {
            r0 = this;
            r0.<init>()
            r0.zzdx = r1
            r0.zziq = r2
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
            boolean r0 = r5.zzhv
            if (r0 == 0) goto Lb
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = -1
            r0.<init>(r1)
            goto Ld
        Lb:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
        Ld:
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveApi$DriveContentsResult> r1 = r4.zzdx
            com.google.android.gms.internal.drive.zzal r2 = new com.google.android.gms.internal.drive.zzal
            com.google.android.gms.internal.drive.zzbi r3 = new com.google.android.gms.internal.drive.zzbi
            com.google.android.gms.drive.Contents r5 = r5.zzes
            r3.<init>(r5)
            r2.<init>(r0, r3)
            r1.setResult(r2)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfl r6) throws android.os.RemoteException {
            r5 = this;
            com.google.android.gms.drive.DriveFile$DownloadProgressListener r0 = r5.zziq
            if (r0 == 0) goto Lb
            long r1 = r6.zzhy
            long r3 = r6.zzhz
            r0.onProgress(r1, r3)
        Lb:
            return
    }
}
