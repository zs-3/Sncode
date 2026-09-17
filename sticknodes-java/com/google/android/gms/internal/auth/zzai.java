package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzai implements com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult {
    private static final android.accounts.Account zza = null;
    private final com.google.android.gms.common.api.Status zzb;
    private final android.accounts.Account zzc;

    static {
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r1 = "DUMMY_NAME"
            java.lang.String r2 = "com.google"
            r0.<init>(r1, r2)
            com.google.android.gms.internal.auth.zzai.zza = r0
            return
    }

    public zzai(com.google.android.gms.common.api.Status r1, android.accounts.Account r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            if (r2 != 0) goto L9
            android.accounts.Account r2 = com.google.android.gms.internal.auth.zzai.zza
        L9:
            r0.zzc = r2
            return
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    public final android.accounts.Account getAccount() {
            r1 = this;
            android.accounts.Account r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zzb
            return r0
    }
}
