package com.google.android.gms.fido.fido2;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzs extends com.google.android.gms.internal.fido.zzl {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzs(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.fido.zzm
    public final void zzb(com.google.android.gms.common.api.Status r2, android.app.PendingIntent r3) {
            r1 = this;
            com.google.android.gms.internal.fido.zzi r0 = new com.google.android.gms.internal.fido.zzi
            r0.<init>(r3)
            com.google.android.gms.tasks.TaskCompletionSource r3 = r1.zza
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r2, r0, r3)
            return
    }
}
