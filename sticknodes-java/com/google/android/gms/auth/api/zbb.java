package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbb extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zbb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, java.lang.Object r11, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r12, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r13) {
            r7 = this;
            r4 = r11
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4
            com.google.android.gms.auth.api.signin.internal.zbe r11 = new com.google.android.gms.auth.api.signin.internal.zbe
            r0 = r11
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final /* bridge */ /* synthetic */ java.util.List getImpliedScopes(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r1
            if (r1 != 0) goto L9
            java.util.List r1 = java.util.Collections.emptyList()
            goto Ld
        L9:
            java.util.ArrayList r1 = r1.getScopes()
        Ld:
            return r1
    }
}
