package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcy extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzew;
    private final /* synthetic */ com.google.android.gms.drive.DriveContents zzfx;
    private final /* synthetic */ com.google.android.gms.drive.zzn zzfy;

    zzcy(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.zzn r2, com.google.android.gms.drive.DriveContents r3, com.google.android.gms.drive.MetadataChangeSet r4) {
            r0 = this;
            r0.zzfy = r2
            r0.zzfx = r3
            r0.zzew = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r8, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r9) throws android.os.RemoteException {
            r7 = this;
            com.google.android.gms.internal.drive.zzaw r8 = (com.google.android.gms.internal.drive.zzaw) r8
            com.google.android.gms.drive.zzn r0 = r7.zzfy     // Catch: java.lang.IllegalStateException -> L8
            r0.zza(r8)     // Catch: java.lang.IllegalStateException -> L8
            goto Lc
        L8:
            r0 = move-exception
            r9.setException(r0)
        Lc:
            com.google.android.gms.drive.DriveContents r0 = r7.zzfx
            r0.zzj()
            com.google.android.gms.drive.MetadataChangeSet r0 = r7.zzew
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r0.zzq()
            android.content.Context r1 = r8.getContext()
            r0.zza(r1)
            android.os.IInterface r8 = r8.getService()
            com.google.android.gms.internal.drive.zzeo r8 = (com.google.android.gms.internal.drive.zzeo) r8
            com.google.android.gms.internal.drive.zzm r6 = new com.google.android.gms.internal.drive.zzm
            com.google.android.gms.drive.DriveContents r0 = r7.zzfx
            com.google.android.gms.drive.DriveId r1 = r0.getDriveId()
            com.google.android.gms.drive.MetadataChangeSet r0 = r7.zzew
            com.google.android.gms.drive.metadata.internal.MetadataBundle r2 = r0.zzq()
            com.google.android.gms.drive.DriveContents r0 = r7.zzfx
            com.google.android.gms.drive.Contents r0 = r0.zzi()
            int r3 = r0.getRequestId()
            com.google.android.gms.drive.DriveContents r0 = r7.zzfx
            com.google.android.gms.drive.Contents r0 = r0.zzi()
            boolean r4 = r0.zzb()
            com.google.android.gms.drive.zzn r5 = r7.zzfy
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.drive.zzhr r0 = new com.google.android.gms.internal.drive.zzhr
            r0.<init>(r9)
            r8.zza(r6, r0)
            return
    }
}
