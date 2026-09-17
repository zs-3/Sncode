package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcc extends com.google.android.gms.internal.drive.zzcg {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzcb zzfk;

    zzcc(com.google.android.gms.internal.drive.zzcb r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.zzfk = r1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzce r0 = new com.google.android.gms.internal.drive.zzce
            com.google.android.gms.internal.drive.zzcb r1 = r3.zzfk
            r2 = 0
            r0.<init>(r1, r3, r2)
            r4.zzb(r0)
            return
    }
}
