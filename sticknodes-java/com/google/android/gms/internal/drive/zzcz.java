package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcz extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.MetadataBuffer> {
    private final /* synthetic */ com.google.android.gms.drive.query.Query zzdu;

    zzcz(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.drive.query.Query r2) {
            r0 = this;
            r0.zzdu = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.MetadataBuffer> r4) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.drive.zzaw r3 = (com.google.android.gms.internal.drive.zzaw) r3
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.internal.drive.zzeo r3 = (com.google.android.gms.internal.drive.zzeo) r3
            com.google.android.gms.internal.drive.zzgq r0 = new com.google.android.gms.internal.drive.zzgq
            com.google.android.gms.drive.query.Query r1 = r2.zzdu
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzhn r1 = new com.google.android.gms.internal.drive.zzhn
            r1.<init>(r4)
            r3.zza(r0, r1)
            return
    }
}
