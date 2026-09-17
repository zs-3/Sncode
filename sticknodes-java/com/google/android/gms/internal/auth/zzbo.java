package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzbo extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.proxy.ProxyClient {
    public zzbo(android.app.Activity r3, com.google.android.gms.auth.api.AuthProxyOptions r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> r0 = com.google.android.gms.auth.api.AuthProxy.API
            if (r4 != 0) goto L6
            com.google.android.gms.auth.api.AuthProxyOptions r4 = com.google.android.gms.auth.api.AuthProxyOptions.zza
        L6:
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    public zzbo(android.content.Context r3, com.google.android.gms.auth.api.AuthProxyOptions r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> r0 = com.google.android.gms.auth.api.AuthProxy.API
            if (r4 != 0) goto L6
            com.google.android.gms.auth.api.AuthProxyOptions r4 = com.google.android.gms.auth.api.AuthProxyOptions.zza
        L6:
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getSpatulaHeader() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.auth.zzbk r1 = new com.google.android.gms.internal.auth.zzbk
            r1.<init>(r2)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 1520(0x5f0, float:2.13E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.proxy.ProxyResponse> performProxyRequest(com.google.android.gms.auth.api.proxy.ProxyRequest r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.auth.zzbl r1 = new com.google.android.gms.internal.auth.zzbl
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 1518(0x5ee, float:2.127E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }
}
