package com.google.android.gms.drive;

/* loaded from: classes.dex */
public interface DriveResource {

    @java.lang.Deprecated
    public interface MetadataResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.Metadata getMetadata();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addChangeListener(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.events.ChangeListener r2);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addChangeSubscription(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> delete(com.google.android.gms.common.api.GoogleApiClient r1);

    com.google.android.gms.drive.DriveId getDriveId();

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveResource.MetadataResult> getMetadata(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> listParents(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeChangeListener(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.events.ChangeListener r2);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeChangeSubscription(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setParents(com.google.android.gms.common.api.GoogleApiClient r1, java.util.Set<com.google.android.gms.drive.DriveId> r2);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> trash(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> untrash(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveResource.MetadataResult> updateMetadata(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.MetadataChangeSet r2);
}
