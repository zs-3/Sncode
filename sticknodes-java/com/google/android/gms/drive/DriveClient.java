package com.google.android.gms.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class DriveClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.drive.Drive.zza> {
    public DriveClient(android.app.Activity r3, com.google.android.gms.drive.Drive.zza r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.drive.Drive$zza> r0 = com.google.android.gms.drive.Drive.zzw
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    public DriveClient(android.content.Context r3, com.google.android.gms.drive.Drive.zza r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.drive.Drive$zza> r0 = com.google.android.gms.drive.Drive.zzw
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveId> getDriveId(java.lang.String r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.TransferPreferences> getUploadPreferences();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<android.content.IntentSender> newCreateFileActivityIntentSender(com.google.android.gms.drive.CreateFileActivityOptions r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<android.content.IntentSender> newOpenFileActivityIntentSender(com.google.android.gms.drive.OpenFileActivityOptions r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> requestSync();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> setUploadPreferences(com.google.android.gms.drive.TransferPreferences r1);
}
