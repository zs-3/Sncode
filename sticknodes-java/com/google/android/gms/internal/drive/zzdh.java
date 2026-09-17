package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdh extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveFile> {
    private final com.google.android.gms.drive.DriveFolder zzfj;
    private final com.google.android.gms.drive.MetadataChangeSet zzgc;
    private com.google.android.gms.drive.ExecutionOptions zzgd;
    private java.lang.String zzge;
    private com.google.android.gms.drive.metadata.internal.zzk zzgf;
    private final com.google.android.gms.drive.DriveContents zzo;

    zzdh(com.google.android.gms.drive.DriveFolder r1, com.google.android.gms.drive.MetadataChangeSet r2, com.google.android.gms.drive.DriveContents r3, com.google.android.gms.drive.ExecutionOptions r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.zzfj = r1
            r0.zzgc = r2
            r0.zzo = r3
            r0.zzgd = r4
            r5 = 0
            r0.zzge = r5
            java.lang.String r5 = "DriveFolder must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r5)
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            java.lang.String r5 = "Folder's DriveId must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r5)
            java.lang.String r1 = "MetadataChangeSet must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
            java.lang.String r1 = "ExecutionOptions must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r1)
            java.lang.String r1 = r2.getMimeType()
            com.google.android.gms.drive.metadata.internal.zzk r1 = com.google.android.gms.drive.metadata.internal.zzk.zzg(r1)
            r0.zzgf = r1
            if (r1 == 0) goto L41
            boolean r1 = r1.isFolder()
            if (r1 != 0) goto L39
            goto L41
        L39:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "May not create folders using this method. Use DriveFolderManagerClient#createFolder() instead of mime type application/vnd.google-apps.folder"
            r1.<init>(r2)
            throw r1
        L41:
            if (r3 == 0) goto L6c
            boolean r1 = r3 instanceof com.google.android.gms.internal.drive.zzbi
            if (r1 == 0) goto L64
            com.google.android.gms.drive.DriveId r1 = r3.getDriveId()
            if (r1 != 0) goto L5c
            boolean r1 = r3.zzk()
            if (r1 != 0) goto L54
            goto L6c
        L54:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DriveContents are already closed."
            r1.<init>(r2)
            throw r1
        L5c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation."
            r1.<init>(r2)
            throw r1
        L64:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Only DriveContents obtained from the Drive API are accepted."
            r1.<init>(r2)
            throw r1
        L6c:
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r10, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveFile> r11) throws android.os.RemoteException {
            r9 = this;
            com.google.android.gms.internal.drive.zzaw r10 = (com.google.android.gms.internal.drive.zzaw) r10
            com.google.android.gms.drive.ExecutionOptions r0 = r9.zzgd
            r0.zza(r10)
            com.google.android.gms.drive.MetadataChangeSet r0 = r9.zzgc
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r0.zzq()
            android.content.Context r2 = r10.getContext()
            r1.zza(r2)
            com.google.android.gms.drive.DriveContents r1 = r9.zzo
            com.google.android.gms.drive.metadata.internal.zzk r2 = r9.zzgf
            int r6 = com.google.android.gms.internal.drive.zzbs.zza(r1, r2)
            com.google.android.gms.drive.metadata.internal.zzk r1 = r9.zzgf
            if (r1 == 0) goto L29
            boolean r1 = r1.zzbh()
            if (r1 == 0) goto L29
            r1 = 1
            r7 = 1
            goto L2b
        L29:
            r1 = 0
            r7 = 0
        L2b:
            com.google.android.gms.internal.drive.zzw r1 = new com.google.android.gms.internal.drive.zzw
            com.google.android.gms.drive.DriveFolder r2 = r9.zzfj
            com.google.android.gms.drive.DriveId r4 = r2.getDriveId()
            com.google.android.gms.drive.metadata.internal.MetadataBundle r5 = r0.zzq()
            com.google.android.gms.drive.ExecutionOptions r8 = r9.zzgd
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            android.os.IInterface r10 = r10.getService()
            com.google.android.gms.internal.drive.zzeo r10 = (com.google.android.gms.internal.drive.zzeo) r10
            com.google.android.gms.internal.drive.zzhj r0 = new com.google.android.gms.internal.drive.zzhj
            r0.<init>(r11)
            r10.zza(r1, r0)
            return
    }
}
