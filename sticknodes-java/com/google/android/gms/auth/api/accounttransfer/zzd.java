package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzd extends com.google.android.gms.auth.api.accounttransfer.zzj {
    final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zze zza;

    zzd(com.google.android.gms.auth.api.accounttransfer.zze r1, com.google.android.gms.auth.api.accounttransfer.zzl r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzb(byte[] r2) {
            r1 = this;
            com.google.android.gms.auth.api.accounttransfer.zze r0 = r1.zza
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zzb
            r0.setResult(r2)
            return
    }
}
