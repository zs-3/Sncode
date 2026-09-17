package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public abstract class zzav extends com.google.android.gms.internal.drive.zzau<com.google.android.gms.common.api.Status> {
    public zzav(com.google.android.gms.common.api.GoogleApiClient r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            return r1
    }
}
