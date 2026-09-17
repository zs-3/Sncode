package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzal implements com.google.android.gms.auth.account.WorkAccountApi {
    private static final com.google.android.gms.common.api.Status zza = null;

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 13
            r0.<init>(r1)
            com.google.android.gms.internal.auth.zzal.zza = r0
            return
    }

    public zzal() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zza() {
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.internal.auth.zzal.zza
            return r0
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult> addWorkAccount(com.google.android.gms.common.api.GoogleApiClient r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.auth.zzae r0 = new com.google.android.gms.internal.auth.zzae
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r1 = com.google.android.gms.auth.account.WorkAccount.API
            r0.<init>(r2, r1, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.execute(r0)
            return r3
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> removeWorkAccount(com.google.android.gms.common.api.GoogleApiClient r3, android.accounts.Account r4) {
            r2 = this;
            com.google.android.gms.internal.auth.zzag r0 = new com.google.android.gms.internal.auth.zzag
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r1 = com.google.android.gms.auth.account.WorkAccount.API
            r0.<init>(r2, r1, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.execute(r0)
            return r3
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final void setWorkAuthenticatorEnabled(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2) {
            r0 = this;
            r0.setWorkAuthenticatorEnabledWithResult(r1, r2)
            return
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> setWorkAuthenticatorEnabledWithResult(com.google.android.gms.common.api.GoogleApiClient r3, boolean r4) {
            r2 = this;
            com.google.android.gms.internal.auth.zzac r0 = new com.google.android.gms.internal.auth.zzac
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r1 = com.google.android.gms.auth.account.WorkAccount.API
            r0.<init>(r2, r1, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.execute(r0)
            return r3
    }
}
