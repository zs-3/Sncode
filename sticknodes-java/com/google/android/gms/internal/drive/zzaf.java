package com.google.android.gms.internal.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzaf implements com.google.android.gms.drive.DriveApi {
    public zzaf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveIdResult> fetchDriveId(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.drive.zzai r0 = new com.google.android.gms.internal.drive.zzai
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.drive.DriveFolder getAppFolder(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.internal.drive.zzaw> r0 = com.google.android.gms.drive.Drive.CLIENT_KEY
            com.google.android.gms.common.api.Api$Client r2 = r2.getClient(r0)
            com.google.android.gms.internal.drive.zzaw r2 = (com.google.android.gms.internal.drive.zzaw) r2
            boolean r0 = r2.zzag()
            if (r0 == 0) goto L1c
            com.google.android.gms.drive.DriveId r2 = r2.zzaf()
            if (r2 == 0) goto L1a
            com.google.android.gms.internal.drive.zzbs r0 = new com.google.android.gms.internal.drive.zzbs
            r0.<init>(r2)
            return r0
        L1a:
            r2 = 0
            return r2
        L1c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Client is not yet connected"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.drive.DriveFolder getRootFolder(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.internal.drive.zzaw> r0 = com.google.android.gms.drive.Drive.CLIENT_KEY
            com.google.android.gms.common.api.Api$Client r2 = r2.getClient(r0)
            com.google.android.gms.internal.drive.zzaw r2 = (com.google.android.gms.internal.drive.zzaw) r2
            boolean r0 = r2.zzag()
            if (r0 == 0) goto L1c
            com.google.android.gms.drive.DriveId r2 = r2.zzae()
            if (r2 == 0) goto L1a
            com.google.android.gms.internal.drive.zzbs r0 = new com.google.android.gms.internal.drive.zzbs
            r0.<init>(r2)
            return r0
        L1a:
            r2 = 0
            return r2
        L1c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Client is not yet connected"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.drive.CreateFileActivityBuilder newCreateFileActivityBuilder() {
            r1 = this;
            com.google.android.gms.drive.CreateFileActivityBuilder r0 = new com.google.android.gms.drive.CreateFileActivityBuilder
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> newDriveContents(com.google.android.gms.common.api.GoogleApiClient r3) {
            r2 = this;
            com.google.android.gms.internal.drive.zzah r0 = new com.google.android.gms.internal.drive.zzah
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.<init>(r2, r3, r1)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.enqueue(r0)
            return r3
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.drive.OpenFileActivityBuilder newOpenFileActivityBuilder() {
            r1 = this;
            com.google.android.gms.drive.OpenFileActivityBuilder r0 = new com.google.android.gms.drive.OpenFileActivityBuilder
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> query(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.query.Query r3) {
            r1 = this;
            if (r3 == 0) goto Lc
            com.google.android.gms.internal.drive.zzag r0 = new com.google.android.gms.internal.drive.zzag
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Query must be provided."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestSync(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzaj r0 = new com.google.android.gms.internal.drive.zzaj
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }
}
