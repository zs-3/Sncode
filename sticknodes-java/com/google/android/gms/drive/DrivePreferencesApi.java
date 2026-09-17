package com.google.android.gms.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public interface DrivePreferencesApi {

    @java.lang.Deprecated
    public interface FileUploadPreferencesResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.FileUploadPreferences getFileUploadPreferences();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult> getFileUploadPreferences(com.google.android.gms.common.api.GoogleApiClient r1);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setFileUploadPreferences(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.drive.FileUploadPreferences r2);
}
