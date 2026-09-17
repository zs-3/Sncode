package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzaz extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzj zzek;

    zzaz(com.google.android.gms.internal.drive.zzaw r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.internal.drive.zzj r3) {
            r0 = this;
            r0.zzek = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzj r0 = r3.zzek
            com.google.android.gms.internal.drive.zzgy r1 = new com.google.android.gms.internal.drive.zzgy
            r1.<init>(r3)
            r2 = 0
            r4.zza(r0, r2, r2, r1)
            return
    }
}
