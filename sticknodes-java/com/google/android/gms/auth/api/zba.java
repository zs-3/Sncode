package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zba extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zba() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, java.lang.Object r11, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r12, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r13) {
            r7 = this;
            r4 = r11
            com.google.android.gms.auth.api.zbd r4 = (com.google.android.gms.auth.api.zbd) r4
            com.google.android.gms.internal.auth-api.zbd r11 = new com.google.android.gms.internal.auth-api.zbd
            r0 = r11
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
    }
}
