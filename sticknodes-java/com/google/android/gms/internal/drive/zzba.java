package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzba extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.drive.DriveId zzen;
    private final /* synthetic */ int zzeo;

    zzba(com.google.android.gms.internal.drive.zzaw r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.DriveId r3, int r4) {
            r0 = this;
            r0.zzen = r3
            r1 = 1
            r0.zzeo = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzgs r0 = new com.google.android.gms.internal.drive.zzgs
            com.google.android.gms.drive.DriveId r1 = r3.zzen
            int r2 = r3.zzeo
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzgy r1 = new com.google.android.gms.internal.drive.zzgy
            r1.<init>(r3)
            r2 = 0
            r4.zza(r0, r2, r2, r1)
            return
    }
}
