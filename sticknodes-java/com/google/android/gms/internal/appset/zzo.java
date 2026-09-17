package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
final class zzo extends com.google.android.gms.internal.appset.zze {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzo(com.google.android.gms.internal.appset.zzp r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(com.google.android.gms.common.api.Status r3, com.google.android.gms.appset.zzc r4) {
            r2 = this;
            if (r4 == 0) goto L10
            com.google.android.gms.appset.AppSetIdInfo r0 = new com.google.android.gms.appset.AppSetIdInfo
            java.lang.String r1 = r4.zzb()
            int r4 = r4.zza()
            r0.<init>(r1, r4)
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.gms.tasks.TaskCompletionSource r4 = r2.zza
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r3, r0, r4)
            return
    }
}
