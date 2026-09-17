package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
abstract class zzl extends com.google.android.gms.common.api.internal.TaskApiCall {
    protected com.google.android.gms.tasks.TaskCompletionSource zzb;

    /* synthetic */ zzl(int r2, com.google.android.gms.auth.api.accounttransfer.zzk r3) {
            r1 = this;
            r3 = 0
            r0 = 0
            r1.<init>(r3, r0, r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r1, com.google.android.gms.tasks.TaskCompletionSource r2) throws android.os.RemoteException {
            r0 = this;
            com.google.android.gms.internal.auth.zzap r1 = (com.google.android.gms.internal.auth.zzap) r1
            r0.zzb = r2
            android.os.IInterface r1 = r1.getService()
            com.google.android.gms.internal.auth.zzau r1 = (com.google.android.gms.internal.auth.zzau) r1
            r0.zza(r1)
            return
    }

    protected abstract void zza(com.google.android.gms.internal.auth.zzau r1) throws android.os.RemoteException;
}
