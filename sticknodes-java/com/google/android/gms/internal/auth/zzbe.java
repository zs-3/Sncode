package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzbe extends com.google.android.gms.common.internal.GmsClient {
    private final android.os.Bundle zze;

    public zzbe(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.auth.api.AuthProxyOptions r11, com.google.android.gms.common.api.internal.ConnectionCallbacks r12, com.google.android.gms.common.api.internal.OnConnectionFailedListener r13) {
            r7 = this;
            r3 = 16
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L13
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            goto L17
        L13:
            android.os.Bundle r8 = r11.zza()
        L17:
            r7.zze = r8
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.auth.api.internal.IAuthService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzbh
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.auth.zzbh r3 = (com.google.android.gms.internal.auth.zzbh) r3
            goto L18
        L12:
            com.google.android.gms.internal.auth.zzbh r0 = new com.google.android.gms.internal.auth.zzbh
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
            r1 = this;
            android.os.Bundle r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.internal.IAuthService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.service.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
            r2 = this;
            com.google.android.gms.common.internal.ClientSettings r0 = r2.getClientSettings()
            java.lang.String r1 = r0.getAccountName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> r1 = com.google.android.gms.auth.api.AuthProxy.API
            java.util.Set r0 = r0.getApplicableScopes(r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
            r1 = this;
            r0 = 1
            return r0
    }
}
