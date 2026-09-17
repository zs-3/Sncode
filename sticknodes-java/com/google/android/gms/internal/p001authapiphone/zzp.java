package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
final class zzp extends com.google.android.gms.internal.p001authapiphone.zzd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzp(com.google.android.gms.internal.p001authapiphone.zzr r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zze
    public final void zzb(com.google.android.gms.common.api.Status r2, int r3) {
            r1 = this;
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r2, r3, r0)
            return
    }
}
