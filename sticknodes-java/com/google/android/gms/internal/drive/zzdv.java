package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdv extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdp zzgq;

    zzdv(com.google.android.gms.internal.drive.zzdp r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.zzgq = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.drive.zzaw r3 = (com.google.android.gms.internal.drive.zzaw) r3
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.internal.drive.zzeo r3 = (com.google.android.gms.internal.drive.zzeo) r3
            com.google.android.gms.internal.drive.zzhb r0 = new com.google.android.gms.internal.drive.zzhb
            com.google.android.gms.internal.drive.zzdp r1 = r2.zzgq
            com.google.android.gms.drive.DriveId r1 = r1.zzk
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzgy r1 = new com.google.android.gms.internal.drive.zzgy
            r1.<init>(r2)
            r3.zza(r0, r1)
            return
    }
}
