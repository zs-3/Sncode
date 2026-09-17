package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbu extends com.google.android.gms.internal.drive.zzca {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzfd;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbs zzfh;

    zzbu(com.google.android.gms.internal.drive.zzbs r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.MetadataChangeSet r3) {
            r0 = this;
            r0.zzfh = r1
            r0.zzfd = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            com.google.android.gms.drive.MetadataChangeSet r0 = r3.zzfd
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r0.zzq()
            android.content.Context r1 = r4.getContext()
            r0.zza(r1)
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzy r0 = new com.google.android.gms.internal.drive.zzy
            com.google.android.gms.internal.drive.zzbs r1 = r3.zzfh
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            com.google.android.gms.drive.MetadataChangeSet r2 = r3.zzfd
            com.google.android.gms.drive.metadata.internal.MetadataBundle r2 = r2.zzq()
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzbw r1 = new com.google.android.gms.internal.drive.zzbw
            r1.<init>(r3)
            r4.zza(r0, r1)
            return
    }
}
