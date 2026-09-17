package com.google.android.gms.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class CreateFileActivityBuilder {
    public static final java.lang.String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private final com.google.android.gms.internal.drive.zzt zzn;
    private com.google.android.gms.drive.DriveContents zzo;
    private boolean zzp;

    public CreateFileActivityBuilder() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.drive.zzt r0 = new com.google.android.gms.internal.drive.zzt
            r1 = 0
            r0.<init>(r1)
            r2.zzn = r0
            return
    }

    public android.content.IntentSender build(com.google.android.gms.common.api.GoogleApiClient r3) {
            r2 = this;
            boolean r0 = r3.isConnected()
            java.lang.String r1 = "Client must be connected"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            r2.zzg()
            com.google.android.gms.internal.drive.zzt r0 = r2.zzn
            android.content.IntentSender r3 = r0.build(r3)
            return r3
    }

    final int getRequestId() {
            r1 = this;
            com.google.android.gms.internal.drive.zzt r0 = r1.zzn
            int r0 = r0.getRequestId()
            return r0
    }

    public com.google.android.gms.drive.CreateFileActivityBuilder setActivityStartFolder(com.google.android.gms.drive.DriveId r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzt r0 = r1.zzn
            r0.zza(r2)
            return r1
    }

    public com.google.android.gms.drive.CreateFileActivityBuilder setActivityTitle(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzt r0 = r1.zzn
            r0.zzc(r2)
            return r1
    }

    public com.google.android.gms.drive.CreateFileActivityBuilder setInitialDriveContents(com.google.android.gms.drive.DriveContents r4) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L39
            boolean r1 = r4 instanceof com.google.android.gms.internal.drive.zzbi
            if (r1 == 0) goto L31
            com.google.android.gms.drive.DriveId r1 = r4.getDriveId()
            if (r1 != 0) goto L29
            boolean r1 = r4.zzk()
            if (r1 != 0) goto L21
            com.google.android.gms.internal.drive.zzt r1 = r3.zzn
            com.google.android.gms.drive.Contents r2 = r4.zzi()
            int r2 = r2.zzj
            r1.zzd(r2)
            r3.zzo = r4
            goto L3e
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "DriveContents are already closed."
            r4.<init>(r0)
            throw r4
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation."
            r4.<init>(r0)
            throw r4
        L31:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only DriveContents obtained from the Drive API are accepted."
            r4.<init>(r0)
            throw r4
        L39:
            com.google.android.gms.internal.drive.zzt r4 = r3.zzn
            r4.zzd(r0)
        L3e:
            r3.zzp = r0
            return r3
    }

    public com.google.android.gms.drive.CreateFileActivityBuilder setInitialMetadata(com.google.android.gms.drive.MetadataChangeSet r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzt r0 = r1.zzn
            r0.zza(r2)
            return r1
    }

    final com.google.android.gms.drive.MetadataChangeSet zzc() {
            r1 = this;
            com.google.android.gms.internal.drive.zzt r0 = r1.zzn
            com.google.android.gms.drive.MetadataChangeSet r0 = r0.zzc()
            return r0
    }

    final com.google.android.gms.drive.DriveId zzd() {
            r1 = this;
            com.google.android.gms.internal.drive.zzt r0 = r1.zzn
            com.google.android.gms.drive.DriveId r0 = r0.zzd()
            return r0
    }

    final java.lang.String zze() {
            r1 = this;
            com.google.android.gms.internal.drive.zzt r0 = r1.zzn
            java.lang.String r0 = r0.zze()
            return r0
    }

    final int zzf() {
            r1 = this;
            r0 = 0
            return r0
    }

    final void zzg() {
            r2 = this;
            boolean r0 = r2.zzp
            java.lang.String r1 = "Must call setInitialDriveContents."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.drive.DriveContents r0 = r2.zzo
            if (r0 == 0) goto Le
            r0.zzj()
        Le:
            com.google.android.gms.internal.drive.zzt r0 = r2.zzn
            r0.zzg()
            return
    }
}
