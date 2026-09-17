package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public class zzdp implements com.google.android.gms.drive.DriveResource {
    protected final com.google.android.gms.drive.DriveId zzk;

    public zzdp(com.google.android.gms.drive.DriveId r1) {
            r0 = this;
            r0.<init>()
            r0.zzk = r1
            return
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addChangeListener(com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.drive.events.ChangeListener r4) {
            r2 = this;
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.internal.drive.zzaw> r0 = com.google.android.gms.drive.Drive.CLIENT_KEY
            com.google.android.gms.common.api.Api$Client r0 = r3.getClient(r0)
            com.google.android.gms.internal.drive.zzaw r0 = (com.google.android.gms.internal.drive.zzaw) r0
            com.google.android.gms.drive.DriveId r1 = r2.zzk
            com.google.android.gms.common.api.PendingResult r3 = r0.zza(r3, r1, r4)
            return r3
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addChangeSubscription(com.google.android.gms.common.api.GoogleApiClient r5) {
            r4 = this;
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.internal.drive.zzaw> r0 = com.google.android.gms.drive.Drive.CLIENT_KEY
            com.google.android.gms.common.api.Api$Client r0 = r5.getClient(r0)
            com.google.android.gms.internal.drive.zzaw r0 = (com.google.android.gms.internal.drive.zzaw) r0
            com.google.android.gms.drive.DriveId r1 = r4.zzk
            com.google.android.gms.internal.drive.zzj r2 = new com.google.android.gms.internal.drive.zzj
            r3 = 1
            r2.<init>(r3, r1)
            int r1 = r2.zzda
            com.google.android.gms.drive.DriveId r3 = r2.zzk
            boolean r1 = com.google.android.gms.drive.events.zzj.zza(r1, r3)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            boolean r1 = r0.isConnected()
            java.lang.String r3 = "Client must be connected"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)
            boolean r1 = r0.zzec
            if (r1 == 0) goto L32
            com.google.android.gms.internal.drive.zzaz r1 = new com.google.android.gms.internal.drive.zzaz
            r1.<init>(r0, r5, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r5 = r5.execute(r1)
            return r5
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions"
            r5.<init>(r0)
            throw r5
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> delete(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzdu r0 = new com.google.android.gms.internal.drive.zzdu
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.drive.DriveId getDriveId() {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveResource.MetadataResult> getMetadata(com.google.android.gms.common.api.GoogleApiClient r3) {
            r2 = this;
            com.google.android.gms.internal.drive.zzdq r0 = new com.google.android.gms.internal.drive.zzdq
            r1 = 0
            r0.<init>(r2, r3, r1)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.enqueue(r0)
            return r3
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> listParents(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzdr r0 = new com.google.android.gms.internal.drive.zzdr
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeChangeListener(com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.drive.events.ChangeListener r4) {
            r2 = this;
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.internal.drive.zzaw> r0 = com.google.android.gms.drive.Drive.CLIENT_KEY
            com.google.android.gms.common.api.Api$Client r0 = r3.getClient(r0)
            com.google.android.gms.internal.drive.zzaw r0 = (com.google.android.gms.internal.drive.zzaw) r0
            com.google.android.gms.drive.DriveId r1 = r2.zzk
            com.google.android.gms.common.api.PendingResult r3 = r0.zzb(r3, r1, r4)
            return r3
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeChangeSubscription(com.google.android.gms.common.api.GoogleApiClient r6) {
            r5 = this;
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.internal.drive.zzaw> r0 = com.google.android.gms.drive.Drive.CLIENT_KEY
            com.google.android.gms.common.api.Api$Client r0 = r6.getClient(r0)
            com.google.android.gms.internal.drive.zzaw r0 = (com.google.android.gms.internal.drive.zzaw) r0
            com.google.android.gms.drive.DriveId r1 = r5.zzk
            r2 = 1
            boolean r3 = com.google.android.gms.drive.events.zzj.zza(r2, r1)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3)
            boolean r3 = r0.isConnected()
            java.lang.String r4 = "Client must be connected"
            com.google.android.gms.common.internal.Preconditions.checkState(r3, r4)
            com.google.android.gms.internal.drive.zzba r3 = new com.google.android.gms.internal.drive.zzba
            r3.<init>(r0, r6, r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r6 = r6.execute(r3)
            return r6
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setParents(com.google.android.gms.common.api.GoogleApiClient r2, java.util.Set<com.google.android.gms.drive.DriveId> r3) {
            r1 = this;
            if (r3 == 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            com.google.android.gms.internal.drive.zzds r3 = new com.google.android.gms.internal.drive.zzds
            r3.<init>(r1, r2, r0)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r3)
            return r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ParentIds must be provided."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> trash(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzdv r0 = new com.google.android.gms.internal.drive.zzdv
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> untrash(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzdw r0 = new com.google.android.gms.internal.drive.zzdw
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveResource.MetadataResult> updateMetadata(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.MetadataChangeSet r3) {
            r1 = this;
            if (r3 == 0) goto Lc
            com.google.android.gms.internal.drive.zzdt r0 = new com.google.android.gms.internal.drive.zzdt
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ChangeSet must be provided."
            r2.<init>(r3)
            throw r2
    }
}
