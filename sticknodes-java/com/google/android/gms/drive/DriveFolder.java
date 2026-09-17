package com.google.android.gms.drive;

/* loaded from: classes.dex */
public interface DriveFolder extends com.google.android.gms.drive.DriveResource {
    public static final java.lang.String MIME_TYPE = "application/vnd.google-apps.folder";

    @java.lang.Deprecated
    public interface DriveFileResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.DriveFile getDriveFile();
    }

    @java.lang.Deprecated
    public interface DriveFolderResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.DriveFolder getDriveFolder();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFileResult> createFile(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.MetadataChangeSet r2, com.google.android.gms.drive.DriveContents r3);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFileResult> createFile(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.MetadataChangeSet r2, com.google.android.gms.drive.DriveContents r3, com.google.android.gms.drive.ExecutionOptions r4);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFolderResult> createFolder(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.MetadataChangeSet r2);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> listChildren(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> queryChildren(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.query.Query r2);
}
