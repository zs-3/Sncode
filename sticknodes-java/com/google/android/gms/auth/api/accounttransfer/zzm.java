package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzm extends com.google.android.gms.internal.auth.zzan {
    final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzn zza;

    zzm(com.google.android.gms.auth.api.accounttransfer.zzn r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.auth.api.accounttransfer.zzn r0 = r2.zza
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zzb
            com.google.android.gms.auth.api.accounttransfer.AccountTransferException r1 = new com.google.android.gms.auth.api.accounttransfer.AccountTransferException
            r1.<init>(r3)
            r0.setException(r1)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zze() {
            r2 = this;
            com.google.android.gms.auth.api.accounttransfer.zzn r0 = r2.zza
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zzb
            r1 = 0
            r0.setResult(r1)
            return
    }
}
