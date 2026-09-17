package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
class zzj extends com.google.android.gms.internal.auth.zzan {
    final com.google.android.gms.auth.api.accounttransfer.zzl zzb;

    public zzj(com.google.android.gms.auth.api.accounttransfer.zzl r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.auth.api.accounttransfer.zzl r0 = r2.zzb
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zzb
            int r1 = com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zza
            com.google.android.gms.auth.api.accounttransfer.AccountTransferException r1 = new com.google.android.gms.auth.api.accounttransfer.AccountTransferException
            r1.<init>(r3)
            r0.setException(r1)
            return
    }
}
