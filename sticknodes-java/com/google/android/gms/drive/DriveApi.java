package com.google.android.gms.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public interface DriveApi {

    @java.lang.Deprecated
    public interface DriveContentsResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.DriveContents getDriveContents();
    }

    @java.lang.Deprecated
    public interface DriveIdResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.DriveId getDriveId();
    }

    @java.lang.Deprecated
    public interface MetadataBufferResult extends com.google.android.gms.common.api.Releasable, com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.MetadataBuffer getMetadataBuffer();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveIdResult> fetchDriveId(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2);

    @java.lang.Deprecated
    com.google.android.gms.drive.DriveFolder getAppFolder(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.drive.DriveFolder getRootFolder(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.drive.CreateFileActivityBuilder newCreateFileActivityBuilder();

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> newDriveContents(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.drive.OpenFileActivityBuilder newOpenFileActivityBuilder();

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> query(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.query.Query r2);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestSync(com.google.android.gms.common.api.GoogleApiClient r1);
}
