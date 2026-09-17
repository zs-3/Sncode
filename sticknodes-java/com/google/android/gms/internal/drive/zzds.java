package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzds extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ java.util.List zzgb;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdp zzgq;

    zzds(com.google.android.gms.internal.drive.zzdp r1, com.google.android.gms.common.api.GoogleApiClient r2, java.util.List r3) {
            r0 = this;
            r0.zzgq = r1
            r0.zzgb = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzgw r0 = new com.google.android.gms.internal.drive.zzgw
            com.google.android.gms.internal.drive.zzdp r1 = r3.zzgq
            com.google.android.gms.drive.DriveId r1 = r1.zzk
            java.util.List r2 = r3.zzgb
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzgy r1 = new com.google.android.gms.internal.drive.zzgy
            r1.<init>(r3)
            r4.zza(r0, r1)
            return
    }
}
