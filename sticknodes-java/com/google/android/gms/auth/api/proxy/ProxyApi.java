package com.google.android.gms.auth.api.proxy;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public interface ProxyApi {

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface ProxyResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.common.annotation.KeepForSdk
        com.google.android.gms.auth.api.proxy.ProxyResponse getResponse();
    }

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface SpatulaHeaderResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.common.internal.ShowFirstParty
        @com.google.android.gms.common.annotation.KeepForSdk
        java.lang.String getSpatulaHeader();
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult> getSpatulaHeader(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult> performProxyRequest(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.auth.api.proxy.ProxyRequest r2);
}
