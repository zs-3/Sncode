package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzch extends com.google.android.gms.drive.DriveResourceClient {
    private static final java.util.concurrent.atomic.AtomicInteger zzfn = null;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            com.google.android.gms.internal.drive.zzch.zzfn = r0
            return
    }

    public zzch(android.app.Activity r1, com.google.android.gms.drive.Drive.zza r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzch(android.content.Context r1, com.google.android.gms.drive.Drive.zza r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static final /* synthetic */ com.google.android.gms.drive.events.ListenerToken zza(com.google.android.gms.common.api.internal.ListenerHolder r1, com.google.android.gms.tasks.Task r2) throws java.lang.Exception {
            boolean r0 = r2.isSuccessful()
            if (r0 == 0) goto L10
            com.google.android.gms.internal.drive.zzg r2 = new com.google.android.gms.internal.drive.zzg
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r1 = r1.getListenerKey()
            r2.<init>(r1)
            return r2
        L10:
            java.lang.Exception r1 = r2.getException()
            throw r1
    }

    static final /* synthetic */ com.google.android.gms.drive.events.ListenerToken zza(com.google.android.gms.internal.drive.zzg r1, com.google.android.gms.tasks.Task r2) throws java.lang.Exception {
            boolean r0 = r2.isSuccessful()
            if (r0 == 0) goto L7
            return r1
        L7:
            java.lang.Exception r1 = r2.getException()
            throw r1
    }

    private static void zze(int r1) {
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r1 == r0) goto L15
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L15
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 != r0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid openMode provided"
            r1.<init>(r0)
            throw r1
        L15:
            return
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.events.ListenerToken> addChangeListener(com.google.android.gms.drive.DriveResource r5, com.google.android.gms.drive.events.OnChangeListener r6) {
            r4 = this;
            com.google.android.gms.drive.DriveId r0 = r5.getDriveId()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = "listener"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            com.google.android.gms.internal.drive.zzdi r0 = new com.google.android.gms.internal.drive.zzdi
            com.google.android.gms.drive.DriveId r1 = r5.getDriveId()
            r0.<init>(r4, r6, r1)
            java.util.concurrent.atomic.AtomicInteger r6 = com.google.android.gms.internal.drive.zzch.zzfn
            int r6 = r6.incrementAndGet()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 27
            r1.<init>(r2)
            java.lang.String r2 = "OnChangeListener"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.google.android.gms.common.api.internal.ListenerHolder r6 = r4.registerListener(r0, r6)
            com.google.android.gms.internal.drive.zzcp r1 = new com.google.android.gms.internal.drive.zzcp
            r1.<init>(r4, r6, r5, r0)
            com.google.android.gms.internal.drive.zzcq r2 = new com.google.android.gms.internal.drive.zzcq
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r3 = r6.getListenerKey()
            r2.<init>(r4, r3, r5, r0)
            com.google.android.gms.tasks.Task r5 = r4.doRegisterEventListener(r1, r2)
            com.google.android.gms.internal.drive.zzci r0 = new com.google.android.gms.internal.drive.zzci
            r0.<init>(r6)
            com.google.android.gms.tasks.Task r5 = r5.continueWith(r0)
            return r5
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addChangeSubscription(com.google.android.gms.drive.DriveResource r3) {
            r2 = this;
            com.google.android.gms.drive.DriveId r0 = r3.getDriveId()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.drive.DriveId r0 = r3.getDriveId()
            r1 = 1
            boolean r0 = com.google.android.gms.drive.events.zzj.zza(r1, r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            com.google.android.gms.internal.drive.zzcr r0 = new com.google.android.gms.internal.drive.zzcr
            r0.<init>(r2, r3)
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r0)
            return r3
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> cancelOpenFileCallback(com.google.android.gms.drive.events.ListenerToken r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.drive.zzg
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.drive.zzg r2 = (com.google.android.gms.internal.drive.zzg) r2
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = r2.zzad()
            com.google.android.gms.tasks.Task r2 = r1.doUnregisterEventListener(r2)
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unrecognized ListenerToken"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> commitContents(com.google.android.gms.drive.DriveContents r2, com.google.android.gms.drive.MetadataChangeSet r3) {
            r1 = this;
            com.google.android.gms.drive.zzp r0 = new com.google.android.gms.drive.zzp
            r0.<init>()
            com.google.android.gms.drive.ExecutionOptions r0 = r0.build()
            com.google.android.gms.drive.zzn r0 = (com.google.android.gms.drive.zzn) r0
            com.google.android.gms.tasks.Task r2 = r1.commitContents(r2, r3, r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> commitContents(com.google.android.gms.drive.DriveContents r4, com.google.android.gms.drive.MetadataChangeSet r5, com.google.android.gms.drive.ExecutionOptions r6) {
            r3 = this;
            java.lang.String r0 = "Execution options cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            boolean r0 = r4.zzk()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "DriveContents is already closed"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r2)
            int r0 = r4.getMode()
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == r2) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r0 = "Cannot commit contents opened in MODE_READ_ONLY."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            com.google.android.gms.drive.DriveId r0 = r4.getDriveId()
            java.lang.String r1 = "Only DriveContents obtained through DriveFile.open can be committed."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.drive.zzn r6 = com.google.android.gms.drive.zzn.zza(r6)
            int r0 = r6.zzn()
            boolean r0 = com.google.android.gms.drive.ExecutionOptions.zza(r0)
            if (r0 == 0) goto L49
            com.google.android.gms.drive.Contents r0 = r4.zzi()
            boolean r0 = r0.zzb()
            if (r0 == 0) goto L41
            goto L49
        L41:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "DriveContents must be valid for conflict detection."
            r4.<init>(r5)
            throw r4
        L49:
            if (r5 != 0) goto L4d
            com.google.android.gms.drive.MetadataChangeSet r5 = com.google.android.gms.drive.MetadataChangeSet.zzax
        L4d:
            com.google.android.gms.internal.drive.zzcy r0 = new com.google.android.gms.internal.drive.zzcy
            r0.<init>(r3, r6, r4, r5)
            com.google.android.gms.tasks.Task r4 = r3.doWrite(r0)
            return r4
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> createContents() {
            r2 = this;
            r0 = 1
            java.lang.String r1 = "Contents can only be created in MODE_WRITE_ONLY or MODE_READ_WRITE."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            com.google.android.gms.internal.drive.zzcw r0 = new com.google.android.gms.internal.drive.zzcw
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.<init>(r2, r1)
            com.google.android.gms.tasks.Task r0 = r2.doWrite(r0)
            return r0
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFile> createFile(com.google.android.gms.drive.DriveFolder r2, com.google.android.gms.drive.MetadataChangeSet r3, com.google.android.gms.drive.DriveContents r4) {
            r1 = this;
            com.google.android.gms.drive.ExecutionOptions$Builder r0 = new com.google.android.gms.drive.ExecutionOptions$Builder
            r0.<init>()
            com.google.android.gms.drive.ExecutionOptions r0 = r0.build()
            com.google.android.gms.tasks.Task r2 = r1.createFile(r2, r3, r4, r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFile> createFile(com.google.android.gms.drive.DriveFolder r8, com.google.android.gms.drive.MetadataChangeSet r9, com.google.android.gms.drive.DriveContents r10, com.google.android.gms.drive.ExecutionOptions r11) {
            r7 = this;
            com.google.android.gms.internal.drive.zzbs.zzb(r9)
            com.google.android.gms.internal.drive.zzdh r6 = new com.google.android.gms.internal.drive.zzdh
            r5 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.tasks.Task r8 = r7.doWrite(r6)
            return r8
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> createFolder(com.google.android.gms.drive.DriveFolder r3, com.google.android.gms.drive.MetadataChangeSet r4) {
            r2 = this;
            java.lang.String r0 = "MetadataChangeSet must be provided."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = r4.getMimeType()
            if (r0 == 0) goto L20
            java.lang.String r0 = r4.getMimeType()
            java.lang.String r1 = "application/vnd.google-apps.folder"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            goto L20
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The mimetype must be of type application/vnd.google-apps.folder"
            r3.<init>(r4)
            throw r3
        L20:
            com.google.android.gms.internal.drive.zzdb r0 = new com.google.android.gms.internal.drive.zzdb
            r0.<init>(r2, r4, r3)
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r0)
            return r3
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> delete(com.google.android.gms.drive.DriveResource r2) {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r2.getDriveId()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.drive.zzcl r0 = new com.google.android.gms.internal.drive.zzcl
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r2 = r1.doWrite(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> discardContents(com.google.android.gms.drive.DriveContents r3) {
            r2 = this;
            boolean r0 = r3.zzk()
            r0 = r0 ^ 1
            java.lang.String r1 = "DriveContents is already closed"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r3.zzj()
            com.google.android.gms.internal.drive.zzda r0 = new com.google.android.gms.internal.drive.zzda
            r0.<init>(r2, r3)
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r0)
            return r3
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> getAppFolder() {
            r1 = this;
            com.google.android.gms.internal.drive.zzco r0 = new com.google.android.gms.internal.drive.zzco
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r0 = r1.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.Metadata> getMetadata(com.google.android.gms.drive.DriveResource r3) {
            r2 = this;
            java.lang.String r0 = "DriveResource must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.DriveId r0 = r3.getDriveId()
            java.lang.String r1 = "Resource's DriveId must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.internal.drive.zzdc r0 = new com.google.android.gms.internal.drive.zzdc
            r1 = 0
            r0.<init>(r2, r3, r1)
            com.google.android.gms.tasks.Task r3 = r2.doRead(r0)
            return r3
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> getRootFolder() {
            r1 = this;
            com.google.android.gms.internal.drive.zzck r0 = new com.google.android.gms.internal.drive.zzck
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r0 = r1.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> listChildren(com.google.android.gms.drive.DriveFolder r2) {
            r1 = this;
            java.lang.String r0 = "folder cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.drive.DriveId r2 = r2.getDriveId()
            r0 = 0
            com.google.android.gms.drive.query.Query r2 = com.google.android.gms.internal.drive.zzbs.zza(r0, r2)
            com.google.android.gms.tasks.Task r2 = r1.query(r2)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> listParents(com.google.android.gms.drive.DriveResource r2) {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r2.getDriveId()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.drive.zzde r0 = new com.google.android.gms.internal.drive.zzde
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r2 = r1.doRead(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> openFile(com.google.android.gms.drive.DriveFile r2, int r3) {
            r1 = this;
            zze(r3)
            com.google.android.gms.internal.drive.zzct r0 = new com.google.android.gms.internal.drive.zzct
            r0.<init>(r1, r2, r3)
            com.google.android.gms.tasks.Task r2 = r1.doRead(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.events.ListenerToken> openFile(com.google.android.gms.drive.DriveFile r10, int r11, com.google.android.gms.drive.events.OpenFileCallback r12) {
            r9 = this;
            zze(r11)
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.drive.zzch.zzfn
            int r0 = r0.incrementAndGet()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 27
            r1.<init>(r2)
            java.lang.String r2 = "OpenFileCallback"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.common.api.internal.ListenerHolder r7 = r9.registerListener(r12, r0)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r12 = r7.getListenerKey()
            com.google.android.gms.internal.drive.zzg r0 = new com.google.android.gms.internal.drive.zzg
            r0.<init>(r12)
            com.google.android.gms.internal.drive.zzcu r8 = new com.google.android.gms.internal.drive.zzcu
            r1 = r8
            r2 = r9
            r3 = r7
            r4 = r10
            r5 = r11
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.android.gms.internal.drive.zzcv r10 = new com.google.android.gms.internal.drive.zzcv
            r10.<init>(r9, r12, r0)
            com.google.android.gms.tasks.Task r10 = r9.doRegisterEventListener(r8, r10)
            com.google.android.gms.internal.drive.zzcj r11 = new com.google.android.gms.internal.drive.zzcj
            r11.<init>(r0)
            com.google.android.gms.tasks.Task r10 = r10.continueWith(r11)
            return r10
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> query(com.google.android.gms.drive.query.Query r2) {
            r1 = this;
            java.lang.String r0 = "query cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.drive.zzcz r0 = new com.google.android.gms.internal.drive.zzcz
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r2 = r1.doRead(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> queryChildren(com.google.android.gms.drive.DriveFolder r2, com.google.android.gms.drive.query.Query r3) {
            r1 = this;
            java.lang.String r0 = "folder cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "query cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.DriveId r2 = r2.getDriveId()
            com.google.android.gms.drive.query.Query r2 = com.google.android.gms.internal.drive.zzbs.zza(r3, r2)
            com.google.android.gms.tasks.Task r2 = r1.query(r2)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> removeChangeListener(com.google.android.gms.drive.events.ListenerToken r2) {
            r1 = this;
            java.lang.String r0 = "Token is required to unregister listener."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            boolean r0 = r2 instanceof com.google.android.gms.internal.drive.zzg
            if (r0 == 0) goto L14
            com.google.android.gms.internal.drive.zzg r2 = (com.google.android.gms.internal.drive.zzg) r2
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = r2.zzad()
            com.google.android.gms.tasks.Task r2 = r1.doUnregisterEventListener(r2)
            return r2
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not recover key from ListenerToken"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeChangeSubscription(com.google.android.gms.drive.DriveResource r3) {
            r2 = this;
            com.google.android.gms.drive.DriveId r0 = r3.getDriveId()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.drive.DriveId r0 = r3.getDriveId()
            r1 = 1
            boolean r0 = com.google.android.gms.drive.events.zzj.zza(r1, r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            com.google.android.gms.internal.drive.zzcs r0 = new com.google.android.gms.internal.drive.zzcs
            r0.<init>(r2, r3)
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r0)
            return r3
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> reopenContentsForWrite(com.google.android.gms.drive.DriveContents r4) {
            r3 = this;
            boolean r0 = r4.zzk()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "DriveContents is already closed"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r2)
            int r0 = r4.getMode()
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 != r2) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            java.lang.String r0 = "This method can only be called on contents that are currently opened in MODE_READ_ONLY."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            r4.zzj()
            com.google.android.gms.internal.drive.zzcx r0 = new com.google.android.gms.internal.drive.zzcx
            r0.<init>(r3, r4)
            com.google.android.gms.tasks.Task r4 = r3.doRead(r0)
            return r4
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> setParents(com.google.android.gms.drive.DriveResource r2, java.util.Set<com.google.android.gms.drive.DriveId> r3) {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r2.getDriveId()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            com.google.android.gms.internal.drive.zzdf r3 = new com.google.android.gms.internal.drive.zzdf
            r3.<init>(r1, r2, r0)
            com.google.android.gms.tasks.Task r2 = r1.doWrite(r3)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> trash(com.google.android.gms.drive.DriveResource r2) {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r2.getDriveId()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.drive.zzcm r0 = new com.google.android.gms.internal.drive.zzcm
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r2 = r1.doWrite(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> untrash(com.google.android.gms.drive.DriveResource r2) {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r2.getDriveId()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.drive.zzcn r0 = new com.google.android.gms.internal.drive.zzcn
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r2 = r1.doWrite(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.Metadata> updateMetadata(com.google.android.gms.drive.DriveResource r2, com.google.android.gms.drive.MetadataChangeSet r3) {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r2.getDriveId()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.drive.zzdd r0 = new com.google.android.gms.internal.drive.zzdd
            r0.<init>(r1, r3, r2)
            com.google.android.gms.tasks.Task r2 = r1.doWrite(r0)
            return r2
    }
}
