package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbl implements com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status> {
    zzbl(com.google.android.gms.internal.drive.zzbi r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* synthetic */ void onResult(com.google.android.gms.common.api.Result r4) {
            r3 = this;
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            boolean r0 = r4.isSuccess()
            if (r0 != 0) goto L19
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.internal.drive.zzbi.zzx()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "DriveContentsImpl"
            java.lang.String r2 = "Error discarding contents, status: %s"
            r0.efmt(r4, r2, r1)
        L19:
            return
    }
}
