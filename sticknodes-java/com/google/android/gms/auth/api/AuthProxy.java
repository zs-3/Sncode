package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class AuthProxy {

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> API = null;

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi = null;
    public static final com.google.android.gms.common.api.Api.ClientKey zza = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.auth.api.AuthProxy.zza = r0
            com.google.android.gms.auth.api.zza r1 = new com.google.android.gms.auth.api.zza
            r1.<init>()
            com.google.android.gms.auth.api.AuthProxy.zzb = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "Auth.PROXY_API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.auth.api.AuthProxy.API = r2
            com.google.android.gms.internal.auth.zzbt r0 = new com.google.android.gms.internal.auth.zzbt
            r0.<init>()
            com.google.android.gms.auth.api.AuthProxy.ProxyApi = r0
            return
    }

    public AuthProxy() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.auth.api.proxy.ProxyClient getClient(android.app.Activity r1, com.google.android.gms.auth.api.AuthProxyOptions r2) {
            com.google.android.gms.internal.auth.zzbo r0 = new com.google.android.gms.internal.auth.zzbo
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.auth.api.proxy.ProxyClient getClient(android.content.Context r1, com.google.android.gms.auth.api.AuthProxyOptions r2) {
            com.google.android.gms.internal.auth.zzbo r0 = new com.google.android.gms.internal.auth.zzbo
            r0.<init>(r1, r2)
            return r0
    }
}
