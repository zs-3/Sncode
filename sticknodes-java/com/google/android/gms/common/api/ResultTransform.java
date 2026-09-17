package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public abstract class ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result> {
    public ResultTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.common.api.PendingResult<S> createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zacp r0 = new com.google.android.gms.common.api.internal.zacp
            r0.<init>(r2)
            return r0
    }

    public com.google.android.gms.common.api.Status onFailure(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            return r1
    }

    public abstract com.google.android.gms.common.api.PendingResult<S> onSuccess(R r1);
}
