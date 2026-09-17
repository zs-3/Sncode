package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
final class zzo extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzo(com.google.android.gms.internal.p001authapiphone.zzr r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            int r0 = r3.getStatusCode()
            r1 = 6
            if (r0 != r1) goto L11
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zza
            com.google.android.gms.common.api.ApiException r3 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r3)
            r0.trySetException(r3)
            return
        L11:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zza
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r3, r0)
            return
    }
}
