package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdd extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.Metadata> {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzfd;
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;

    zzdd(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.MetadataChangeSet r2, com.google.android.gms.drive.DriveResource r3) {
            r0 = this;
            r0.zzfd = r2
            r0.zzfq = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.Metadata> r5) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            com.google.android.gms.drive.MetadataChangeSet r0 = r3.zzfd
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r0.zzq()
            android.content.Context r1 = r4.getContext()
            r0.zza(r1)
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzhf r0 = new com.google.android.gms.internal.drive.zzhf
            com.google.android.gms.drive.DriveResource r1 = r3.zzfq
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            com.google.android.gms.drive.MetadataChangeSet r2 = r3.zzfd
            com.google.android.gms.drive.metadata.internal.MetadataBundle r2 = r2.zzq()
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzhp r1 = new com.google.android.gms.internal.drive.zzhp
            r1.<init>(r5)
            r4.zza(r0, r1)
            return
    }
}
