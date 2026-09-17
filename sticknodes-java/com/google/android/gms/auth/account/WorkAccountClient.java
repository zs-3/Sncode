package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public class WorkAccountClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private final com.google.android.gms.auth.account.WorkAccountApi zza;

    WorkAccountClient(android.app.Activity r4) {
            r3 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r0 = com.google.android.gms.auth.account.WorkAccount.API
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            com.google.android.gms.internal.auth.zzal r4 = new com.google.android.gms.internal.auth.zzal
            r4.<init>()
            r3.zza = r4
            return
    }

    WorkAccountClient(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r0 = com.google.android.gms.auth.account.WorkAccount.API
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            com.google.android.gms.internal.auth.zzal r4 = new com.google.android.gms.internal.auth.zzal
            r4.<init>()
            r3.zza = r4
            return
    }

    public com.google.android.gms.tasks.Task<android.accounts.Account> addWorkAccount(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.auth.account.WorkAccountApi r0 = r2.zza
            com.google.android.gms.common.api.GoogleApiClient r1 = r2.asGoogleApiClient()
            com.google.android.gms.common.api.PendingResult r3 = r0.addWorkAccount(r1, r3)
            com.google.android.gms.auth.account.zzg r0 = new com.google.android.gms.auth.account.zzg
            r0.<init>(r2)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.common.internal.PendingResultUtil.toTask(r3, r0)
            return r3
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeWorkAccount(android.accounts.Account r3) {
            r2 = this;
            com.google.android.gms.auth.account.WorkAccountApi r0 = r2.zza
            com.google.android.gms.common.api.GoogleApiClient r1 = r2.asGoogleApiClient()
            com.google.android.gms.common.api.PendingResult r3 = r0.removeWorkAccount(r1, r3)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setWorkAuthenticatorEnabled(boolean r3) {
            r2 = this;
            com.google.android.gms.auth.account.WorkAccountApi r0 = r2.zza
            com.google.android.gms.common.api.GoogleApiClient r1 = r2.asGoogleApiClient()
            com.google.android.gms.common.api.PendingResult r3 = r0.setWorkAuthenticatorEnabledWithResult(r1, r3)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(r3)
            return r3
    }
}
