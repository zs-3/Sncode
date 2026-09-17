package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzda extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.DriveContents zzfx;

    zzda(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.DriveContents r2) {
            r0 = this;
            r0.zzfx = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r5) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzo r0 = new com.google.android.gms.internal.drive.zzo
            com.google.android.gms.drive.DriveContents r1 = r3.zzfx
            com.google.android.gms.drive.Contents r1 = r1.zzi()
            int r1 = r1.getRequestId()
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzhr r1 = new com.google.android.gms.internal.drive.zzhr
            r1.<init>(r5)
            r4.zza(r0, r1)
            return
    }
}
