package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbo extends com.google.android.gms.internal.drive.zzam {
    private final /* synthetic */ int zzdv;
    private final /* synthetic */ com.google.android.gms.drive.DriveFile.DownloadProgressListener zzey;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbn zzez;

    zzbo(com.google.android.gms.internal.drive.zzbn r1, com.google.android.gms.common.api.GoogleApiClient r2, int r3, com.google.android.gms.drive.DriveFile.DownloadProgressListener r4) {
            r0 = this;
            r0.zzez = r1
            r0.zzdv = r3
            r0.zzey = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.internal.drive.zzaw r5 = (com.google.android.gms.internal.drive.zzaw) r5
            android.os.IInterface r5 = r5.getService()
            com.google.android.gms.internal.drive.zzeo r5 = (com.google.android.gms.internal.drive.zzeo) r5
            com.google.android.gms.internal.drive.zzgj r0 = new com.google.android.gms.internal.drive.zzgj
            com.google.android.gms.internal.drive.zzbn r1 = r4.zzez
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            int r2 = r4.zzdv
            r3 = 0
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.drive.zzgl r1 = new com.google.android.gms.internal.drive.zzgl
            com.google.android.gms.drive.DriveFile$DownloadProgressListener r2 = r4.zzey
            r1.<init>(r4, r2)
            com.google.android.gms.internal.drive.zzec r5 = r5.zza(r0, r1)
            android.os.IBinder r5 = r5.zzgs
            com.google.android.gms.common.internal.ICancelToken r5 = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(r5)
            r4.setCancelToken(r5)
            return
    }
}
