package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzag extends com.google.android.gms.internal.drive.zzar {
    private final /* synthetic */ com.google.android.gms.drive.query.Query zzdu;

    zzag(com.google.android.gms.internal.drive.zzaf r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.query.Query r3) {
            r0 = this;
            r0.zzdu = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.drive.zzaw r3 = (com.google.android.gms.internal.drive.zzaw) r3
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.internal.drive.zzeo r3 = (com.google.android.gms.internal.drive.zzeo) r3
            com.google.android.gms.internal.drive.zzgq r0 = new com.google.android.gms.internal.drive.zzgq
            com.google.android.gms.drive.query.Query r1 = r2.zzdu
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzas r1 = new com.google.android.gms.internal.drive.zzas
            r1.<init>(r2)
            r3.zza(r0, r1)
            return
    }
}
