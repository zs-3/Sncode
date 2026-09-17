package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzde extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.MetadataBuffer> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;

    zzde(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.DriveResource r2) {
            r0 = this;
            r0.zzfq = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.MetadataBuffer> r4) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.drive.zzaw r3 = (com.google.android.gms.internal.drive.zzaw) r3
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.internal.drive.zzeo r3 = (com.google.android.gms.internal.drive.zzeo) r3
            com.google.android.gms.internal.drive.zzex r0 = new com.google.android.gms.internal.drive.zzex
            com.google.android.gms.drive.DriveResource r1 = r2.zzfq
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzho r1 = new com.google.android.gms.internal.drive.zzho
            r1.<init>(r4)
            r3.zza(r0, r1)
            return
    }
}
