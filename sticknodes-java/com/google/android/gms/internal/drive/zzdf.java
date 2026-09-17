package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdf extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;
    private final /* synthetic */ java.util.List zzgb;

    zzdf(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.DriveResource r2, java.util.List r3) {
            r0 = this;
            r0.zzfq = r2
            r0.zzgb = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r5) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzgw r0 = new com.google.android.gms.internal.drive.zzgw
            com.google.android.gms.drive.DriveResource r1 = r3.zzfq
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            java.util.List r2 = r3.zzgb
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzhr r1 = new com.google.android.gms.internal.drive.zzhr
            r1.<init>(r5)
            r4.zza(r0, r1)
            return
    }
}
