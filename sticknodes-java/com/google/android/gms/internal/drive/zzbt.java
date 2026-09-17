package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbt extends com.google.android.gms.internal.drive.zzby {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzfd;
    private final /* synthetic */ int zzfe;
    private final /* synthetic */ int zzff;
    private final /* synthetic */ com.google.android.gms.drive.ExecutionOptions zzfg;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbs zzfh;

    zzbt(com.google.android.gms.internal.drive.zzbs r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.MetadataChangeSet r3, int r4, int r5, com.google.android.gms.drive.ExecutionOptions r6) {
            r0 = this;
            r0.zzfh = r1
            r0.zzfd = r3
            r0.zzfe = r4
            r0.zzff = r5
            r0.zzfg = r6
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r9) throws android.os.RemoteException {
            r8 = this;
            com.google.android.gms.internal.drive.zzaw r9 = (com.google.android.gms.internal.drive.zzaw) r9
            com.google.android.gms.drive.MetadataChangeSet r0 = r8.zzfd
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r0.zzq()
            android.content.Context r1 = r9.getContext()
            r0.zza(r1)
            com.google.android.gms.internal.drive.zzw r0 = new com.google.android.gms.internal.drive.zzw
            com.google.android.gms.internal.drive.zzbs r1 = r8.zzfh
            com.google.android.gms.drive.DriveId r3 = r1.getDriveId()
            com.google.android.gms.drive.MetadataChangeSet r1 = r8.zzfd
            com.google.android.gms.drive.metadata.internal.MetadataBundle r4 = r1.zzq()
            int r5 = r8.zzfe
            int r6 = r8.zzff
            com.google.android.gms.drive.ExecutionOptions r7 = r8.zzfg
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            android.os.IInterface r9 = r9.getService()
            com.google.android.gms.internal.drive.zzeo r9 = (com.google.android.gms.internal.drive.zzeo) r9
            com.google.android.gms.internal.drive.zzbv r1 = new com.google.android.gms.internal.drive.zzbv
            r1.<init>(r8)
            r9.zza(r0, r1)
            return
    }
}
