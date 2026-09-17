package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
abstract class zzbj extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    public zzbj(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> r0 = com.google.android.gms.auth.api.AuthProxy.API
            r1.<init>(r0, r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.internal.auth.zzbv r0 = new com.google.android.gms.internal.auth.zzbv
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.auth.zzbe r2 = (com.google.android.gms.internal.auth.zzbe) r2
            android.content.Context r0 = r2.getContext()
            android.os.IInterface r2 = r2.getService()
            com.google.android.gms.internal.auth.zzbh r2 = (com.google.android.gms.internal.auth.zzbh) r2
            r1.zza(r0, r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @com.google.android.gms.common.annotation.KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.common.api.Result r1 = (com.google.android.gms.common.api.Result) r1
            super.setResult(r1)
            return
    }

    protected abstract void zza(android.content.Context r1, com.google.android.gms.internal.auth.zzbh r2) throws android.os.RemoteException;
}
