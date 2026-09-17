package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class GoogleSignInResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zba;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbb;

    public GoogleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInAccount r1, com.google.android.gms.common.api.Status r2) {
            r0 = this;
            r0.<init>()
            r0.zbb = r1
            r0.zba = r2
            return
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSignInAccount() {
            r1 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r1.zbb
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zba
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zba
            boolean r0 = r0.isSuccess()
            return r0
    }
}
