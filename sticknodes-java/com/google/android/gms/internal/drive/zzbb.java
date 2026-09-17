package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzbb extends com.google.android.gms.drive.DriveClient {
    public zzbb(android.app.Activity r1, com.google.android.gms.drive.Drive.zza r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzbb(android.content.Context r1, com.google.android.gms.drive.Drive.zza r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveId> getDriveId(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "resourceId must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.drive.zzbc r0 = new com.google.android.gms.internal.drive.zzbc
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r2 = r1.doRead(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.TransferPreferences> getUploadPreferences() {
            r1 = this;
            com.google.android.gms.internal.drive.zzbd r0 = new com.google.android.gms.internal.drive.zzbd
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r0 = r1.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<android.content.IntentSender> newCreateFileActivityIntentSender(com.google.android.gms.drive.CreateFileActivityOptions r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzbg r0 = new com.google.android.gms.internal.drive.zzbg
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r2 = r1.doRead(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<android.content.IntentSender> newOpenFileActivityIntentSender(com.google.android.gms.drive.OpenFileActivityOptions r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzbf r0 = new com.google.android.gms.internal.drive.zzbf
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r2 = r1.doRead(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestSync() {
            r1 = this;
            com.google.android.gms.internal.drive.zzbh r0 = new com.google.android.gms.internal.drive.zzbh
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r0 = r1.doWrite(r0)
            return r0
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> setUploadPreferences(com.google.android.gms.drive.TransferPreferences r2) {
            r1 = this;
            java.lang.String r0 = "transferPreferences cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.drive.zzbe r0 = new com.google.android.gms.internal.drive.zzbe
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r2 = r1.doWrite(r0)
            return r2
    }
}
