package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzbs extends com.google.android.gms.internal.drive.zzdp implements com.google.android.gms.drive.DriveFolder {
    public zzbs(com.google.android.gms.drive.DriveId r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static int zza(com.google.android.gms.drive.DriveContents r0, com.google.android.gms.drive.metadata.internal.zzk r1) {
            if (r0 != 0) goto Le
            if (r1 == 0) goto Lc
            boolean r0 = r1.zzbh()
            if (r0 == 0) goto Lc
            r0 = 0
            goto L1a
        Lc:
            r0 = 1
            goto L1a
        Le:
            com.google.android.gms.drive.Contents r1 = r0.zzi()
            int r1 = r1.getRequestId()
            r0.zzj()
            r0 = r1
        L1a:
            return r0
    }

    static com.google.android.gms.drive.query.Query zza(com.google.android.gms.drive.query.Query r2, com.google.android.gms.drive.DriveId r3) {
            com.google.android.gms.drive.query.Query$Builder r0 = new com.google.android.gms.drive.query.Query$Builder
            r0.<init>()
            com.google.android.gms.drive.metadata.SearchableCollectionMetadataField<com.google.android.gms.drive.DriveId> r1 = com.google.android.gms.drive.query.SearchableField.PARENTS
            com.google.android.gms.drive.query.Filter r3 = com.google.android.gms.drive.query.Filters.in(r1, r3)
            com.google.android.gms.drive.query.Query$Builder r3 = r0.addFilter(r3)
            if (r2 == 0) goto L2c
            com.google.android.gms.drive.query.Filter r0 = r2.getFilter()
            if (r0 == 0) goto L1e
            com.google.android.gms.drive.query.Filter r0 = r2.getFilter()
            r3.addFilter(r0)
        L1e:
            java.lang.String r0 = r2.getPageToken()
            r3.setPageToken(r0)
            com.google.android.gms.drive.query.SortOrder r2 = r2.getSortOrder()
            r3.setSortOrder(r2)
        L2c:
            com.google.android.gms.drive.query.Query r2 = r3.build()
            return r2
    }

    static void zzb(com.google.android.gms.drive.MetadataChangeSet r1) {
            if (r1 == 0) goto L27
            java.lang.String r1 = r1.getMimeType()
            com.google.android.gms.drive.metadata.internal.zzk r1 = com.google.android.gms.drive.metadata.internal.zzk.zzg(r1)
            if (r1 == 0) goto L26
            boolean r0 = r1.zzbh()
            if (r0 != 0) goto L1a
            boolean r1 = r1.isFolder()
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 == 0) goto L1e
            goto L26
        L1e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead."
            r1.<init>(r0)
            throw r1
        L26:
            return
        L27:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MetadataChangeSet must be provided."
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFileResult> createFile(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.MetadataChangeSet r3, com.google.android.gms.drive.DriveContents r4) {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.api.PendingResult r2 = r1.createFile(r2, r3, r4, r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFileResult> createFile(com.google.android.gms.common.api.GoogleApiClient r8, com.google.android.gms.drive.MetadataChangeSet r9, com.google.android.gms.drive.DriveContents r10, com.google.android.gms.drive.ExecutionOptions r11) {
            r7 = this;
            if (r11 != 0) goto Lb
            com.google.android.gms.drive.ExecutionOptions$Builder r11 = new com.google.android.gms.drive.ExecutionOptions$Builder
            r11.<init>()
            com.google.android.gms.drive.ExecutionOptions r11 = r11.build()
        Lb:
            r6 = r11
            int r11 = r6.zzn()
            if (r11 != 0) goto L95
            if (r9 == 0) goto L8d
            java.lang.String r11 = r9.getMimeType()
            com.google.android.gms.drive.metadata.internal.zzk r11 = com.google.android.gms.drive.metadata.internal.zzk.zzg(r11)
            if (r11 == 0) goto L2d
            boolean r11 = r11.isFolder()
            if (r11 != 0) goto L25
            goto L2d
        L25:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder"
            r8.<init>(r9)
            throw r8
        L2d:
            r6.zza(r8)
            if (r10 == 0) goto L5b
            boolean r11 = r10 instanceof com.google.android.gms.internal.drive.zzbi
            if (r11 == 0) goto L53
            com.google.android.gms.drive.DriveId r11 = r10.getDriveId()
            if (r11 != 0) goto L4b
            boolean r11 = r10.zzk()
            if (r11 != 0) goto L43
            goto L5b
        L43:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "DriveContents are already closed."
            r8.<init>(r9)
            throw r8
        L4b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation."
            r8.<init>(r9)
            throw r8
        L53:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Only DriveContents obtained from the Drive API are accepted."
            r8.<init>(r9)
            throw r8
        L5b:
            zzb(r9)
            java.lang.String r11 = r9.getMimeType()
            com.google.android.gms.drive.metadata.internal.zzk r11 = com.google.android.gms.drive.metadata.internal.zzk.zzg(r11)
            int r4 = zza(r10, r11)
            java.lang.String r10 = r9.getMimeType()
            com.google.android.gms.drive.metadata.internal.zzk r10 = com.google.android.gms.drive.metadata.internal.zzk.zzg(r10)
            if (r10 == 0) goto L7d
            boolean r10 = r10.zzbh()
            if (r10 == 0) goto L7d
            r10 = 1
            r5 = 1
            goto L7f
        L7d:
            r10 = 0
            r5 = 0
        L7f:
            com.google.android.gms.internal.drive.zzbt r10 = new com.google.android.gms.internal.drive.zzbt
            r0 = r10
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r8 = r8.execute(r10)
            return r8
        L8d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "MetadataChangeSet must be provided."
            r8.<init>(r9)
            throw r8
        L95:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "May not set a conflict strategy for new file creation."
            r8.<init>(r9)
            throw r8
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFolderResult> createFolder(com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.drive.MetadataChangeSet r4) {
            r2 = this;
            if (r4 == 0) goto L27
            java.lang.String r0 = r4.getMimeType()
            if (r0 == 0) goto L1d
            java.lang.String r0 = r4.getMimeType()
            java.lang.String r1 = "application/vnd.google-apps.folder"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L1d
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The mimetype must be of type application/vnd.google-apps.folder"
            r3.<init>(r4)
            throw r3
        L1d:
            com.google.android.gms.internal.drive.zzbu r0 = new com.google.android.gms.internal.drive.zzbu
            r0.<init>(r2, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.execute(r0)
            return r3
        L27:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "MetadataChangeSet must be provided."
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> listChildren(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.api.PendingResult r2 = r1.queryChildren(r2, r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> queryChildren(com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.drive.query.Query r4) {
            r2 = this;
            com.google.android.gms.internal.drive.zzaf r0 = new com.google.android.gms.internal.drive.zzaf
            r0.<init>()
            com.google.android.gms.drive.DriveId r1 = r2.getDriveId()
            com.google.android.gms.drive.query.Query r4 = zza(r4, r1)
            com.google.android.gms.common.api.PendingResult r3 = r0.query(r3, r4)
            return r3
    }
}
