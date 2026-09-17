package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbj extends com.google.android.gms.internal.drive.zzam {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbi zzev;

    zzbj(com.google.android.gms.internal.drive.zzbi r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.zzev = r1
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
            com.google.android.gms.internal.drive.zzbi r1 = r4.zzev
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            com.google.android.gms.internal.drive.zzbi r2 = r4.zzev
            com.google.android.gms.drive.Contents r2 = com.google.android.gms.internal.drive.zzbi.zza(r2)
            int r2 = r2.getRequestId()
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r0.<init>(r1, r3, r2)
            com.google.android.gms.internal.drive.zzgl r1 = new com.google.android.gms.internal.drive.zzgl
            r2 = 0
            r1.<init>(r4, r2)
            r5.zza(r0, r1)
            return
    }
}
