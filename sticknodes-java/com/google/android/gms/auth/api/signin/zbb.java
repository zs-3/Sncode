package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbb implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    private zbb() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zbb(com.google.android.gms.auth.api.signin.zba r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result r1) {
            r0 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInResult r1 = (com.google.android.gms.auth.api.signin.GoogleSignInResult) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.getSignInAccount()
            return r1
    }
}
