package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class Auth {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> GOOGLE_SIGN_IN_API = null;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInApi GoogleSignInApi = null;

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> PROXY_API = null;

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi = null;
    public static final com.google.android.gms.common.api.Api.ClientKey zba = null;
    public static final com.google.android.gms.common.api.Api.ClientKey zbb = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbc = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbd = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.auth.api.Auth.zba = r0
            com.google.android.gms.common.api.Api$ClientKey r1 = new com.google.android.gms.common.api.Api$ClientKey
            r1.<init>()
            com.google.android.gms.auth.api.Auth.zbb = r1
            com.google.android.gms.auth.api.zba r2 = new com.google.android.gms.auth.api.zba
            r2.<init>()
            com.google.android.gms.auth.api.Auth.zbc = r2
            com.google.android.gms.auth.api.zbb r3 = new com.google.android.gms.auth.api.zbb
            r3.<init>()
            com.google.android.gms.auth.api.Auth.zbd = r3
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> r4 = com.google.android.gms.auth.api.AuthProxy.API
            com.google.android.gms.auth.api.Auth.PROXY_API = r4
            com.google.android.gms.common.api.Api r4 = new com.google.android.gms.common.api.Api
            java.lang.String r5 = "Auth.CREDENTIALS_API"
            r4.<init>(r5, r2, r0)
            com.google.android.gms.common.api.Api r0 = new com.google.android.gms.common.api.Api
            java.lang.String r2 = "Auth.GOOGLE_SIGN_IN_API"
            r0.<init>(r2, r3, r1)
            com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API = r0
            com.google.android.gms.auth.api.proxy.ProxyApi r0 = com.google.android.gms.auth.api.AuthProxy.ProxyApi
            com.google.android.gms.auth.api.Auth.ProxyApi = r0
            com.google.android.gms.auth.api.signin.internal.zbd r0 = new com.google.android.gms.auth.api.signin.internal.zbd
            r0.<init>()
            com.google.android.gms.auth.api.Auth.GoogleSignInApi = r0
            return
    }

    private Auth() {
            r0 = this;
            r0.<init>()
            return
    }
}
