package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzaj extends com.google.android.gms.internal.drive.zzav {
    zzaj(com.google.android.gms.internal.drive.zzaf r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.drive.zzaw r2 = (com.google.android.gms.internal.drive.zzaw) r2
            android.os.IInterface r2 = r2.getService()
            com.google.android.gms.internal.drive.zzeo r2 = (com.google.android.gms.internal.drive.zzeo) r2
            com.google.android.gms.internal.drive.zzgy r0 = new com.google.android.gms.internal.drive.zzgy
            r0.<init>(r1)
            r2.zza(r0)
            return
    }
}
