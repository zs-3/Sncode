package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class OptionalPendingResultImpl<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.OptionalPendingResult<R> {
    private final com.google.android.gms.common.api.internal.BasePendingResult zaa;

    public OptionalPendingResultImpl(com.google.android.gms.common.api.PendingResult r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.api.internal.BasePendingResult r1 = (com.google.android.gms.common.api.internal.BasePendingResult) r1
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            r0.addStatusListener(r2)
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await() {
            r1 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            com.google.android.gms.common.api.Result r0 = r0.await()
            return r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            com.google.android.gms.common.api.Result r2 = r0.await(r2, r4)
            return r2
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
            r1 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            r0.cancel()
            return
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    public final R get() {
            r4 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r4.zaa
            boolean r0 = r0.isReady()
            if (r0 == 0) goto L13
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r4.zaa
            r1 = 0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.gms.common.api.Result r0 = r0.await(r1, r3)
            return r0
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Result is not available. Check that isDone() returns true before calling get()."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
            r1 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            boolean r0 = r0.isCanceled()
            return r0
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    public final boolean isDone() {
            r1 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            boolean r0 = r0.isReady()
            return r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            r0.setResultCallback(r2)
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            r0.setResultCallback(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            com.google.android.gms.common.api.TransformedResult r2 = r0.then(r2)
            return r2
    }
}
