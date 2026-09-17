package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbv extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveFolder.DriveFileResult> zzdx;

    public zzbv(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveFolder.DriveFileResult> r1) {
            r0 = this;
            r0.<init>()
            r0.zzdx = r1
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveFolder$DriveFileResult> r0 = r3.zzdx
            com.google.android.gms.internal.drive.zzbx r1 = new com.google.android.gms.internal.drive.zzbx
            r2 = 0
            r1.<init>(r4, r2)
            r0.setResult(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfn r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DriveFolder$DriveFileResult> r0 = r4.zzdx
            com.google.android.gms.internal.drive.zzbx r1 = new com.google.android.gms.internal.drive.zzbx
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            com.google.android.gms.internal.drive.zzbn r3 = new com.google.android.gms.internal.drive.zzbn
            com.google.android.gms.drive.DriveId r5 = r5.zzdd
            r3.<init>(r5)
            r1.<init>(r2, r3)
            r0.setResult(r1)
            return
    }
}
