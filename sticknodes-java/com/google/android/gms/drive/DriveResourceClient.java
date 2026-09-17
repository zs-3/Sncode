package com.google.android.gms.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class DriveResourceClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.drive.Drive.zza> {
    public DriveResourceClient(android.app.Activity r3, com.google.android.gms.drive.Drive.zza r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.drive.Drive$zza> r0 = com.google.android.gms.drive.Drive.zzw
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    public DriveResourceClient(android.content.Context r3, com.google.android.gms.drive.Drive.zza r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.drive.Drive$zza> r0 = com.google.android.gms.drive.Drive.zzw
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.events.ListenerToken> addChangeListener(com.google.android.gms.drive.DriveResource r1, com.google.android.gms.drive.events.OnChangeListener r2);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> addChangeSubscription(com.google.android.gms.drive.DriveResource r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> cancelOpenFileCallback(com.google.android.gms.drive.events.ListenerToken r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> commitContents(com.google.android.gms.drive.DriveContents r1, com.google.android.gms.drive.MetadataChangeSet r2);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> commitContents(com.google.android.gms.drive.DriveContents r1, com.google.android.gms.drive.MetadataChangeSet r2, com.google.android.gms.drive.ExecutionOptions r3);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> createContents();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFile> createFile(com.google.android.gms.drive.DriveFolder r1, com.google.android.gms.drive.MetadataChangeSet r2, com.google.android.gms.drive.DriveContents r3);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFile> createFile(com.google.android.gms.drive.DriveFolder r1, com.google.android.gms.drive.MetadataChangeSet r2, com.google.android.gms.drive.DriveContents r3, com.google.android.gms.drive.ExecutionOptions r4);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> createFolder(com.google.android.gms.drive.DriveFolder r1, com.google.android.gms.drive.MetadataChangeSet r2);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> delete(com.google.android.gms.drive.DriveResource r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> discardContents(com.google.android.gms.drive.DriveContents r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> getAppFolder();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.Metadata> getMetadata(com.google.android.gms.drive.DriveResource r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> getRootFolder();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> listChildren(com.google.android.gms.drive.DriveFolder r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> listParents(com.google.android.gms.drive.DriveResource r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> openFile(com.google.android.gms.drive.DriveFile r1, int r2);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.events.ListenerToken> openFile(com.google.android.gms.drive.DriveFile r1, int r2, com.google.android.gms.drive.events.OpenFileCallback r3);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> query(com.google.android.gms.drive.query.Query r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> queryChildren(com.google.android.gms.drive.DriveFolder r1, com.google.android.gms.drive.query.Query r2);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> removeChangeListener(com.google.android.gms.drive.events.ListenerToken r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> removeChangeSubscription(com.google.android.gms.drive.DriveResource r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> reopenContentsForWrite(com.google.android.gms.drive.DriveContents r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> setParents(com.google.android.gms.drive.DriveResource r1, java.util.Set<com.google.android.gms.drive.DriveId> r2);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> trash(com.google.android.gms.drive.DriveResource r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> untrash(com.google.android.gms.drive.DriveResource r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.Metadata> updateMetadata(com.google.android.gms.drive.DriveResource r1, com.google.android.gms.drive.MetadataChangeSet r2);
}
