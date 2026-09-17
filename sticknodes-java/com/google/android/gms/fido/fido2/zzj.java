package com.google.android.gms.fido.fido2;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzj extends com.google.android.gms.internal.fido.zzd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzj(com.google.android.gms.fido.fido2.Fido2ApiClient r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzb(boolean r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setResult(r2)
            return
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzc(com.google.android.gms.common.api.Status r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zza
            com.google.android.gms.common.api.ApiException r1 = new com.google.android.gms.common.api.ApiException
            r1.<init>(r3)
            r0.trySetException(r1)
            return
    }
}
