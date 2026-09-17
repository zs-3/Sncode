package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzg implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    zzg(com.google.android.gms.auth.account.WorkAccountClient r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result r1) {
            r0 = this;
            com.google.android.gms.auth.account.WorkAccountApi$AddAccountResult r1 = (com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult) r1
            android.accounts.Account r1 = r1.getAccount()
            return r1
    }
}
