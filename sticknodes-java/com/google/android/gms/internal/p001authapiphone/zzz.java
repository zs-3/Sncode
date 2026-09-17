package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
final class zzz extends com.google.android.gms.internal.p001authapiphone.zzi {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzz(com.google.android.gms.internal.p001authapiphone.zzab r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzj
    public final void zzb(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r2, r0)
            return
    }
}
