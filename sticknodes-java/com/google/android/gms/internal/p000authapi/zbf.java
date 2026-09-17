package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbf extends com.google.android.gms.common.internal.GmsClient {
    private final android.os.Bundle zba;

    public zbf(android.content.Context r8, android.os.Looper r9, com.google.android.gms.auth.api.identity.zbc r10, com.google.android.gms.common.internal.ClientSettings r11, com.google.android.gms.common.api.internal.ConnectionCallbacks r12, com.google.android.gms.common.api.internal.OnConnectionFailedListener r13) {
            r7 = this;
            r3 = 219(0xdb, float:3.07E-43)
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.os.Bundle r8 = r10.zba()
            r7.zba = r8
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.IAuthorizationService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.p000authapi.zbj
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.auth-api.zbj r3 = (com.google.android.gms.internal.p000authapi.zbj) r3
            goto L18
        L12:
            com.google.android.gms.internal.auth-api.zbj r0 = new com.google.android.gms.internal.auth-api.zbj
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.internal.p000authapi.zbar.zbj
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
            r1 = this;
            android.os.Bundle r0 = r1.zba
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 17895000(0x1110e58, float:2.6642585E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.IAuthorizationService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.service.authorization.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean getUseDynamicLookup() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
            r1 = this;
            r0 = 1
            return r0
    }
}
