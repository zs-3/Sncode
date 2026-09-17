package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzay extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzee zzel;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzgs zzem;

    zzay(com.google.android.gms.internal.drive.zzaw r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.internal.drive.zzgs r3, com.google.android.gms.internal.drive.zzee r4) {
            r0 = this;
            r0.zzem = r3
            r0.zzel = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.internal.drive.zzaw r5 = (com.google.android.gms.internal.drive.zzaw) r5
            android.os.IInterface r5 = r5.getService()
            com.google.android.gms.internal.drive.zzeo r5 = (com.google.android.gms.internal.drive.zzeo) r5
            com.google.android.gms.internal.drive.zzgs r0 = r4.zzem
            com.google.android.gms.internal.drive.zzee r1 = r4.zzel
            com.google.android.gms.internal.drive.zzgy r2 = new com.google.android.gms.internal.drive.zzgy
            r2.<init>(r4)
            r3 = 0
            r5.zza(r0, r1, r3, r2)
            return
    }
}
