package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbk extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbi zzev;
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzew;
    private final /* synthetic */ com.google.android.gms.drive.zzn zzex;

    zzbk(com.google.android.gms.internal.drive.zzbi r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.MetadataChangeSet r3, com.google.android.gms.drive.zzn r4) {
            r0 = this;
            r0.zzev = r1
            r0.zzew = r3
            r0.zzex = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r8) throws android.os.RemoteException {
            r7 = this;
            com.google.android.gms.internal.drive.zzaw r8 = (com.google.android.gms.internal.drive.zzaw) r8
            com.google.android.gms.drive.MetadataChangeSet r0 = r7.zzew
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r0.zzq()
            android.content.Context r1 = r8.getContext()
            r0.zza(r1)
            android.os.IInterface r8 = r8.getService()
            com.google.android.gms.internal.drive.zzeo r8 = (com.google.android.gms.internal.drive.zzeo) r8
            com.google.android.gms.internal.drive.zzm r6 = new com.google.android.gms.internal.drive.zzm
            com.google.android.gms.internal.drive.zzbi r0 = r7.zzev
            com.google.android.gms.drive.Contents r0 = com.google.android.gms.internal.drive.zzbi.zza(r0)
            com.google.android.gms.drive.DriveId r1 = r0.getDriveId()
            com.google.android.gms.drive.MetadataChangeSet r0 = r7.zzew
            com.google.android.gms.drive.metadata.internal.MetadataBundle r2 = r0.zzq()
            com.google.android.gms.internal.drive.zzbi r0 = r7.zzev
            com.google.android.gms.drive.Contents r0 = com.google.android.gms.internal.drive.zzbi.zza(r0)
            int r3 = r0.getRequestId()
            com.google.android.gms.internal.drive.zzbi r0 = r7.zzev
            com.google.android.gms.drive.Contents r0 = com.google.android.gms.internal.drive.zzbi.zza(r0)
            boolean r4 = r0.zzb()
            com.google.android.gms.drive.zzn r5 = r7.zzex
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.drive.zzgy r0 = new com.google.android.gms.internal.drive.zzgy
            r0.<init>(r7)
            r8.zza(r6, r0)
            return
    }
}
