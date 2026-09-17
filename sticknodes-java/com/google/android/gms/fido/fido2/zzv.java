package com.google.android.gms.fido.fido2;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzv extends com.google.android.gms.internal.fido.zzf {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzv(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void zzb(java.util.List r2) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            r0.setResult(r2)
            return
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void zzc(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zza
            com.google.android.gms.common.api.ApiException r1 = new com.google.android.gms.common.api.ApiException
            r1.<init>(r3)
            r0.trySetException(r1)
            return
    }
}
