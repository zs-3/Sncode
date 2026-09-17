package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcw extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveContents> {
    private final /* synthetic */ int zzdv;

    zzcw(com.google.android.gms.internal.drive.zzch r1, int r2) {
            r0 = this;
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.zzdv = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveContents> r4) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.drive.zzaw r3 = (com.google.android.gms.internal.drive.zzaw) r3
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.internal.drive.zzeo r3 = (com.google.android.gms.internal.drive.zzeo) r3
            com.google.android.gms.internal.drive.zzr r0 = new com.google.android.gms.internal.drive.zzr
            int r1 = r2.zzdv
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzhi r1 = new com.google.android.gms.internal.drive.zzhi
            r1.<init>(r4)
            r3.zza(r0, r1)
            return
    }
}
