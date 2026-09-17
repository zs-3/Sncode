package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzbu implements com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult {
    private final com.google.android.gms.common.api.Status zza;
    private com.google.android.gms.auth.api.proxy.ProxyResponse zzb;

    public zzbu(com.google.android.gms.auth.api.proxy.ProxyResponse r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r0.zza = r1
            return
    }

    public zzbu(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
    public final com.google.android.gms.auth.api.proxy.ProxyResponse getResponse() {
            r1 = this;
            com.google.android.gms.auth.api.proxy.ProxyResponse r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zza
            return r0
    }
}
