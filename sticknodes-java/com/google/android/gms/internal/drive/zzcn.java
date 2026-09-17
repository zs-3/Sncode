package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcn extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;

    zzcn(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.DriveResource r2) {
            r0 = this;
            r0.zzfq = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r4) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.drive.zzaw r3 = (com.google.android.gms.internal.drive.zzaw) r3
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.internal.drive.zzeo r3 = (com.google.android.gms.internal.drive.zzeo) r3
            com.google.android.gms.internal.drive.zzhd r0 = new com.google.android.gms.internal.drive.zzhd
            com.google.android.gms.drive.DriveResource r1 = r2.zzfq
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzhr r1 = new com.google.android.gms.internal.drive.zzhr
            r1.<init>(r4)
            r3.zza(r0, r1)
            return
    }
}
