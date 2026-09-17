package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzbt implements com.google.android.gms.auth.api.proxy.ProxyApi {
    public zzbt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult> getSpatulaHeader(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.internal.auth.zzbs r0 = new com.google.android.gms.internal.auth.zzbs
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult> performProxyRequest(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.auth.api.proxy.ProxyRequest r3) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.auth.zzbq r0 = new com.google.android.gms.internal.auth.zzbq
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }
}
