package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public class zzhh<T> extends com.google.android.gms.internal.drive.zzl {
    private com.google.android.gms.tasks.TaskCompletionSource<T> zziv;

    zzhh(com.google.android.gms.tasks.TaskCompletionSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.zziv = r1
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource<T> r0 = r2.zziv
            com.google.android.gms.common.api.ApiException r1 = new com.google.android.gms.common.api.ApiException
            r1.<init>(r3)
            r0.setException(r1)
            return
    }

    public final com.google.android.gms.tasks.TaskCompletionSource<T> zzay() {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource<T> r0 = r1.zziv
            return r0
    }
}
