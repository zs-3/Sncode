package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzck extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveFolder> {
    zzck(com.google.android.gms.internal.drive.zzch r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveFolder> r5) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            com.google.android.gms.drive.DriveId r0 = r4.zzae()
            if (r0 != 0) goto L1a
            com.google.android.gms.common.api.ApiException r4 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 10
            java.lang.String r2 = "Drive#SCOPE_FILE must be requested"
            r0.<init>(r1, r2)
            r4.<init>(r0)
            r5.setException(r4)
            return
        L1a:
            com.google.android.gms.internal.drive.zzbs r0 = new com.google.android.gms.internal.drive.zzbs
            com.google.android.gms.drive.DriveId r4 = r4.zzae()
            r0.<init>(r4)
            r5.setResult(r0)
            return
    }
}
