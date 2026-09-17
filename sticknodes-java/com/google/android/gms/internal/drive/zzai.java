package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzai extends com.google.android.gms.internal.drive.zzap {
    private final /* synthetic */ java.lang.String zzdw;

    zzai(com.google.android.gms.internal.drive.zzaf r1, com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3) {
            r0 = this;
            r0.zzdw = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzek r0 = new com.google.android.gms.internal.drive.zzek
            java.lang.String r1 = r3.zzdw
            com.google.android.gms.drive.DriveId r1 = com.google.android.gms.drive.DriveId.zza(r1)
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzan r1 = new com.google.android.gms.internal.drive.zzan
            r1.<init>(r3)
            r4.zza(r0, r1)
            return
    }
}
