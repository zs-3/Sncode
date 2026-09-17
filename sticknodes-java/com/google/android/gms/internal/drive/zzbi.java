package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzbi implements com.google.android.gms.drive.DriveContents {
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = null;
    private boolean closed;
    private final com.google.android.gms.drive.Contents zzes;
    private boolean zzet;
    private boolean zzeu;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "DriveContentsImpl"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzbi.zzbz = r0
            return
    }

    public zzbi(com.google.android.gms.drive.Contents r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.closed = r0
            r1.zzet = r0
            r1.zzeu = r0
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.drive.Contents r2 = (com.google.android.gms.drive.Contents) r2
            r1.zzes = r2
            return
    }

    private final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.drive.MetadataChangeSet r4, com.google.android.gms.drive.zzn r5) {
            r2 = this;
            if (r5 != 0) goto Ld
            com.google.android.gms.drive.zzp r5 = new com.google.android.gms.drive.zzp
            r5.<init>()
            com.google.android.gms.drive.ExecutionOptions r5 = r5.build()
            com.google.android.gms.drive.zzn r5 = (com.google.android.gms.drive.zzn) r5
        Ld:
            com.google.android.gms.drive.Contents r0 = r2.zzes
            int r0 = r0.getMode()
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == r1) goto L61
            int r0 = r5.zzn()
            boolean r0 = com.google.android.gms.drive.ExecutionOptions.zza(r0)
            if (r0 == 0) goto L32
            com.google.android.gms.drive.Contents r0 = r2.zzes
            boolean r0 = r0.zzb()
            if (r0 == 0) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "DriveContents must be valid for conflict detection."
            r3.<init>(r4)
            throw r3
        L32:
            r5.zza(r3)
            boolean r0 = r2.closed
            if (r0 != 0) goto L59
            com.google.android.gms.drive.DriveId r0 = r2.getDriveId()
            if (r0 == 0) goto L51
            if (r4 == 0) goto L42
            goto L44
        L42:
            com.google.android.gms.drive.MetadataChangeSet r4 = com.google.android.gms.drive.MetadataChangeSet.zzax
        L44:
            r2.zzj()
            com.google.android.gms.internal.drive.zzbk r0 = new com.google.android.gms.internal.drive.zzbk
            r0.<init>(r2, r3, r4, r5)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.execute(r0)
            return r3
        L51:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Only DriveContents obtained through DriveFile.open can be committed."
            r3.<init>(r4)
            throw r3
        L59:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "DriveContents already closed."
            r3.<init>(r4)
            throw r3
        L61:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot commit contents opened with MODE_READ_ONLY"
            r3.<init>(r4)
            throw r3
    }

    static /* synthetic */ com.google.android.gms.drive.Contents zza(com.google.android.gms.internal.drive.zzbi r0) {
            com.google.android.gms.drive.Contents r0 = r0.zzes
            return r0
    }

    static /* synthetic */ com.google.android.gms.common.internal.GmsLogger zzx() {
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.internal.drive.zzbi.zzbz
            return r0
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> commit(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.MetadataChangeSet r3) {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.api.PendingResult r2 = r1.zza(r2, r3, r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> commit(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.MetadataChangeSet r2, com.google.android.gms.drive.ExecutionOptions r3) {
            r0 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L8
        L4:
            com.google.android.gms.drive.zzn r3 = com.google.android.gms.drive.zzn.zza(r3)
        L8:
            com.google.android.gms.common.api.PendingResult r1 = r0.zza(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final void discard(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto L1b
            r1.zzj()
            com.google.android.gms.internal.drive.zzbm r0 = new com.google.android.gms.internal.drive.zzbm
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            com.google.android.gms.internal.drive.zzbm r2 = (com.google.android.gms.internal.drive.zzbm) r2
            com.google.android.gms.internal.drive.zzbl r0 = new com.google.android.gms.internal.drive.zzbl
            r0.<init>(r1)
            r2.setResultCallback(r0)
            return
        L1b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "DriveContents already closed."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.drive.DriveId getDriveId() {
            r1 = this;
            com.google.android.gms.drive.Contents r0 = r1.zzes
            com.google.android.gms.drive.DriveId r0 = r0.getDriveId()
            return r0
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final java.io.InputStream getInputStream() {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L2c
            com.google.android.gms.drive.Contents r0 = r2.zzes
            int r0 = r0.getMode()
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 != r1) goto L24
            boolean r0 = r2.zzet
            if (r0 != 0) goto L1c
            r0 = 1
            r2.zzet = r0
            com.google.android.gms.drive.Contents r0 = r2.zzes
            java.io.InputStream r0 = r0.getInputStream()
            return r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getInputStream() can only be called once per Contents instance."
            r0.<init>(r1)
            throw r0
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getInputStream() can only be used with contents opened with MODE_READ_ONLY."
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Contents have been closed, cannot access the input stream."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final int getMode() {
            r1 = this;
            com.google.android.gms.drive.Contents r0 = r1.zzes
            int r0 = r0.getMode()
            return r0
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final java.io.OutputStream getOutputStream() {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L2c
            com.google.android.gms.drive.Contents r0 = r2.zzes
            int r0 = r0.getMode()
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 != r1) goto L24
            boolean r0 = r2.zzeu
            if (r0 != 0) goto L1c
            r0 = 1
            r2.zzeu = r0
            com.google.android.gms.drive.Contents r0 = r2.zzes
            java.io.OutputStream r0 = r0.getOutputStream()
            return r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getOutputStream() can only be called once per Contents instance."
            r0.<init>(r1)
            throw r0
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY."
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Contents have been closed, cannot access the output stream."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final android.os.ParcelFileDescriptor getParcelFileDescriptor() {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto Lb
            com.google.android.gms.drive.Contents r0 = r2.zzes
            android.os.ParcelFileDescriptor r0 = r0.getParcelFileDescriptor()
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Contents have been closed, cannot access the output stream."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> reopenForWrite(com.google.android.gms.common.api.GoogleApiClient r3) {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L23
            com.google.android.gms.drive.Contents r0 = r2.zzes
            int r0 = r0.getMode()
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 != r1) goto L1b
            r2.zzj()
            com.google.android.gms.internal.drive.zzbj r0 = new com.google.android.gms.internal.drive.zzbj
            r0.<init>(r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.enqueue(r0)
            return r3
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY."
            r3.<init>(r0)
            throw r3
        L23:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "DriveContents already closed."
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.drive.Contents zzi() {
            r1 = this;
            com.google.android.gms.drive.Contents r0 = r1.zzes
            return r0
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final void zzj() {
            r1 = this;
            com.google.android.gms.drive.Contents r0 = r1.zzes
            android.os.ParcelFileDescriptor r0 = r0.getParcelFileDescriptor()
            com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
            r0 = 1
            r1.closed = r0
            return
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final boolean zzk() {
            r1 = this;
            boolean r0 = r1.closed
            return r0
    }
}
