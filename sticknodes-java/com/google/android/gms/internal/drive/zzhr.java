package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzhr extends com.google.android.gms.internal.drive.zzhh<java.lang.Void> {
    public zzhr(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void onSuccess() throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            com.google.android.gms.tasks.TaskCompletionSource r1 = r2.zzay()
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(r0, r1)
            return
    }
}
