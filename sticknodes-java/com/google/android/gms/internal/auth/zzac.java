package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzac extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    final /* synthetic */ boolean zza;

    zzac(com.google.android.gms.internal.auth.zzal r1, com.google.android.gms.common.api.Api r2, com.google.android.gms.common.api.GoogleApiClient r3, boolean r4) {
            r0 = this;
            r0.zza = r4
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.internal.auth.zzaj r0 = new com.google.android.gms.internal.auth.zzaj
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.auth.zzam r2 = (com.google.android.gms.internal.auth.zzam) r2
            android.os.IInterface r2 = r2.getService()
            com.google.android.gms.auth.account.zze r2 = (com.google.android.gms.auth.account.zze) r2
            boolean r0 = r1.zza
            r2.zzf(r0)
            com.google.android.gms.internal.auth.zzaj r2 = new com.google.android.gms.internal.auth.zzaj
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r2.<init>(r0)
            r1.setResult(r2)
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
}
