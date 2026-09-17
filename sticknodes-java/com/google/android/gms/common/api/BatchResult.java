package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class BatchResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zaa;
    private final com.google.android.gms.common.api.PendingResult[] zab;

    BatchResult(com.google.android.gms.common.api.Status r1, com.google.android.gms.common.api.PendingResult[] r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zaa
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <R extends com.google.android.gms.common.api.Result> R take(com.google.android.gms.common.api.BatchResultToken<R> r4) {
            r3 = this;
            com.google.android.gms.common.api.PendingResult[] r0 = r3.zab
            int r1 = r4.mId
            int r0 = r0.length
            if (r1 >= r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "The result token does not belong to this batch"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            com.google.android.gms.common.api.PendingResult[] r0 = r3.zab
            int r4 = r4.mId
            r4 = r0[r4]
            r0 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.gms.common.api.Result r4 = r4.await(r0, r2)
            return r4
    }
}
