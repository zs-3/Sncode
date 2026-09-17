package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface WorkAccountApi {

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    @java.lang.Deprecated
    public interface AddAccountResult extends com.google.android.gms.common.api.Result {
        android.accounts.Account getAccount();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult> addWorkAccount(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> removeWorkAccount(com.google.android.gms.common.api.GoogleApiClient r1, android.accounts.Account r2);

    @java.lang.Deprecated
    void setWorkAuthenticatorEnabled(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> setWorkAuthenticatorEnabledWithResult(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2);
}
