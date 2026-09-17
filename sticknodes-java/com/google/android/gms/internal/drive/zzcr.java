package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcr extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;

    zzcr(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.DriveResource r2) {
            r0 = this;
            r0.zzfq = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r5) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            boolean r0 = r4.zzec
            if (r0 == 0) goto L22
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzj r0 = new com.google.android.gms.internal.drive.zzj
            r1 = 1
            com.google.android.gms.drive.DriveResource r2 = r3.zzfq
            com.google.android.gms.drive.DriveId r2 = r2.getDriveId()
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzhr r1 = new com.google.android.gms.internal.drive.zzhr
            r1.<init>(r5)
            r5 = 0
            r4.zza(r0, r5, r5, r1)
            return
        L22:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions"
            r4.<init>(r5)
            throw r4
    }
}
