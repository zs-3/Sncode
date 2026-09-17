package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public abstract class ResultCallbacks<R extends com.google.android.gms.common.api.Result> implements com.google.android.gms.common.api.ResultCallback<R> {
    public ResultCallbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onFailure(com.google.android.gms.common.api.Status r1);

    @Override // com.google.android.gms.common.api.ResultCallback
    @com.google.android.gms.common.annotation.KeepForSdk
    public final void onResult(R r3) {
            r2 = this;
            com.google.android.gms.common.api.Status r0 = r3.getStatus()
            boolean r1 = r0.isSuccess()
            if (r1 == 0) goto Le
            r2.onSuccess(r3)
            return
        Le:
            r2.onFailure(r0)
            boolean r0 = r3 instanceof com.google.android.gms.common.api.Releasable
            if (r0 == 0) goto L2c
            r0 = r3
            com.google.android.gms.common.api.Releasable r0 = (com.google.android.gms.common.api.Releasable) r0     // Catch: java.lang.RuntimeException -> L1c
            r0.release()     // Catch: java.lang.RuntimeException -> L1c
            return
        L1c:
            r0 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Unable to release "
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = "ResultCallbacks"
            android.util.Log.w(r1, r3, r0)
        L2c:
            return
    }

    public abstract void onSuccess(R r1);
}
