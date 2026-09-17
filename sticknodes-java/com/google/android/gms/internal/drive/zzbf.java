package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbf extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, android.content.IntentSender> {
    private final /* synthetic */ com.google.android.gms.drive.OpenFileActivityOptions zzeq;

    zzbf(com.google.android.gms.internal.drive.zzbb r1, com.google.android.gms.drive.OpenFileActivityOptions r2) {
            r0 = this;
            r0.zzeq = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r6, com.google.android.gms.tasks.TaskCompletionSource<android.content.IntentSender> r7) throws android.os.RemoteException {
            r5 = this;
            com.google.android.gms.internal.drive.zzaw r6 = (com.google.android.gms.internal.drive.zzaw) r6
            android.os.IInterface r6 = r6.getService()
            com.google.android.gms.internal.drive.zzeo r6 = (com.google.android.gms.internal.drive.zzeo) r6
            com.google.android.gms.internal.drive.zzgm r0 = new com.google.android.gms.internal.drive.zzgm
            com.google.android.gms.drive.OpenFileActivityOptions r1 = r5.zzeq
            java.lang.String r2 = r1.zzba
            java.lang.String[] r3 = r1.zzbb
            com.google.android.gms.drive.DriveId r4 = r1.zzbd
            com.google.android.gms.drive.query.internal.FilterHolder r1 = r1.zzbe
            r0.<init>(r2, r3, r4, r1)
            android.content.IntentSender r6 = r6.zza(r0)
            r7.setResult(r6)
            return
    }
}
