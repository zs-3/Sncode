package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbm extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbi zzev;

    zzbm(com.google.android.gms.internal.drive.zzbi r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.zzev = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzo r0 = new com.google.android.gms.internal.drive.zzo
            com.google.android.gms.internal.drive.zzbi r1 = r3.zzev
            com.google.android.gms.drive.Contents r1 = com.google.android.gms.internal.drive.zzbi.zza(r1)
            int r1 = r1.getRequestId()
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzgy r1 = new com.google.android.gms.internal.drive.zzgy
            r1.<init>(r3)
            r4.zza(r0, r1)
            return
    }
}
