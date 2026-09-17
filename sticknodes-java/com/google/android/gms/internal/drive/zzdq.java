package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdq extends com.google.android.gms.internal.drive.zzea {
    private final /* synthetic */ boolean zzga;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdp zzgq;

    zzdq(com.google.android.gms.internal.drive.zzdp r1, com.google.android.gms.common.api.GoogleApiClient r2, boolean r3) {
            r0 = this;
            r0.zzgq = r1
            r3 = 0
            r0.zzga = r3
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzek r0 = new com.google.android.gms.internal.drive.zzek
            com.google.android.gms.internal.drive.zzdp r1 = r3.zzgq
            com.google.android.gms.drive.DriveId r1 = r1.zzk
            boolean r2 = r3.zzga
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzdy r1 = new com.google.android.gms.internal.drive.zzdy
            r1.<init>(r3)
            r4.zza(r0, r1)
            return
    }
}
