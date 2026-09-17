package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbh extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    zzbh(com.google.android.gms.internal.drive.zzbb r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r2, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.drive.zzaw r2 = (com.google.android.gms.internal.drive.zzaw) r2
            android.os.IInterface r2 = r2.getService()
            com.google.android.gms.internal.drive.zzeo r2 = (com.google.android.gms.internal.drive.zzeo) r2
            com.google.android.gms.internal.drive.zzhr r0 = new com.google.android.gms.internal.drive.zzhr
            r0.<init>(r3)
            r2.zza(r0)
            return
    }
}
