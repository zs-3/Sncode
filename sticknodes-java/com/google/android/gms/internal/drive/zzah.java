package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzah extends com.google.android.gms.internal.drive.zzam {
    private final /* synthetic */ int zzdv;

    zzah(com.google.android.gms.internal.drive.zzaf r1, com.google.android.gms.common.api.GoogleApiClient r2, int r3) {
            r0 = this;
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.zzdv = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.drive.zzaw r3 = (com.google.android.gms.internal.drive.zzaw) r3
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.internal.drive.zzeo r3 = (com.google.android.gms.internal.drive.zzeo) r3
            com.google.android.gms.internal.drive.zzr r0 = new com.google.android.gms.internal.drive.zzr
            int r1 = r2.zzdv
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzak r1 = new com.google.android.gms.internal.drive.zzak
            r1.<init>(r2)
            r3.zza(r0, r1)
            return
    }
}
