package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzhq extends com.google.android.gms.internal.drive.zzhh<java.lang.Boolean> {
    public zzhq(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void onSuccess() throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zzay()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setResult(r1)
            return
    }
}
