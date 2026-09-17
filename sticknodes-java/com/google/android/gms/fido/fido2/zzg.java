package com.google.android.gms.fido.fido2;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzg extends com.google.android.gms.internal.fido.zzq {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzg(com.google.android.gms.fido.fido2.Fido2ApiClient r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(com.google.android.gms.common.api.Status r2, android.app.PendingIntent r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r2, r3, r0)
            return
    }
}
