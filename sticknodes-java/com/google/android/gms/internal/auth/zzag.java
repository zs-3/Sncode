package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzag extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    final /* synthetic */ android.accounts.Account zza;

    zzag(com.google.android.gms.internal.auth.zzal r1, com.google.android.gms.common.api.Api r2, com.google.android.gms.common.api.GoogleApiClient r3, android.accounts.Account r4) {
            r0 = this;
            r0.zza = r4
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.internal.auth.zzak r0 = new com.google.android.gms.internal.auth.zzak
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.auth.zzam r3 = (com.google.android.gms.internal.auth.zzam) r3
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.auth.account.zze r3 = (com.google.android.gms.auth.account.zze) r3
            com.google.android.gms.internal.auth.zzaf r0 = new com.google.android.gms.internal.auth.zzaf
            r0.<init>(r2)
            android.accounts.Account r1 = r2.zza
            r3.zze(r0, r1)
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
