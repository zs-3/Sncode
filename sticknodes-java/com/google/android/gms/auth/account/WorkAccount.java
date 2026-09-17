package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public class WorkAccount {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API = null;

    @java.lang.Deprecated
    public static final com.google.android.gms.auth.account.WorkAccountApi WorkAccountApi = null;
    private static final com.google.android.gms.common.api.Api.ClientKey zza = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.auth.account.WorkAccount.zza = r0
            com.google.android.gms.auth.account.zzf r1 = new com.google.android.gms.auth.account.zzf
            r1.<init>()
            com.google.android.gms.auth.account.WorkAccount.zzb = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "WorkAccount.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.auth.account.WorkAccount.API = r2
            com.google.android.gms.internal.auth.zzal r0 = new com.google.android.gms.internal.auth.zzal
            r0.<init>()
            com.google.android.gms.auth.account.WorkAccount.WorkAccountApi = r0
            return
    }

    private WorkAccount() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.app.Activity r1) {
            com.google.android.gms.auth.account.WorkAccountClient r0 = new com.google.android.gms.auth.account.WorkAccountClient
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.content.Context r1) {
            com.google.android.gms.auth.account.WorkAccountClient r0 = new com.google.android.gms.auth.account.WorkAccountClient
            r0.<init>(r1)
            return r0
    }
}
