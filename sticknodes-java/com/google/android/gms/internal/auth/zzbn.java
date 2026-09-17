package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzbn extends com.google.android.gms.internal.auth.zzbd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzbn(com.google.android.gms.internal.auth.zzbo r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(java.lang.String r3) throws android.os.RemoteException {
            r2 = this;
            if (r3 == 0) goto L5
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            goto Lc
        L5:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 3006(0xbbe, float:4.212E-42)
            r0.<init>(r1)
        Lc:
            com.google.android.gms.tasks.TaskCompletionSource r1 = r2.zza
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r0, r3, r1)
            return
    }
}
