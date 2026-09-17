package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class StatusCallback extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {

    @com.google.android.gms.common.annotation.KeepForSdk
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder;

    @com.google.android.gms.common.annotation.KeepForSdk
    public StatusCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> r1) {
            r0 = this;
            r0.<init>()
            r0.resultHolder = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    @com.google.android.gms.common.annotation.KeepForSdk
    public void onResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.common.api.Status> r0 = r1.resultHolder
            r0.setResult(r2)
            return
    }
}
