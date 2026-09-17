package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
abstract class zbl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    public zbl(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r0 = com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API
            r1.<init>(r0, r2)
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
