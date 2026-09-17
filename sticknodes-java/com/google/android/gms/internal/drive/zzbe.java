package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbe extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.TransferPreferences zzep;

    zzbe(com.google.android.gms.internal.drive.zzbb r1, com.google.android.gms.drive.TransferPreferences r2) {
            r0 = this;
            r0.zzep = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r5) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzgu r0 = new com.google.android.gms.internal.drive.zzgu
            com.google.android.gms.internal.drive.zzei r1 = new com.google.android.gms.internal.drive.zzei
            com.google.android.gms.drive.TransferPreferences r2 = r3.zzep
            r1.<init>(r2)
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzhr r1 = new com.google.android.gms.internal.drive.zzhr
            r1.<init>(r5)
            r4.zza(r0, r1)
            return
    }
}
