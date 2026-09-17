package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbd extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.auth.api.zbd zba;

    public zbd(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.auth.api.zbd r11, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r12, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r13) {
            r7 = this;
            r3 = 68
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.auth.api.zbc r8 = new com.google.android.gms.auth.api.zbc
            if (r11 != 0) goto L11
            com.google.android.gms.auth.api.zbd r11 = com.google.android.gms.auth.api.zbd.zba
        L11:
            r8.<init>(r11)
            java.lang.String r9 = com.google.android.gms.internal.p000authapi.zbas.zba()
            r8.zba(r9)
            com.google.android.gms.auth.api.zbd r9 = new com.google.android.gms.auth.api.zbd
            r9.<init>(r8)
            r7.zba = r9
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.p000authapi.zbe
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.auth-api.zbe r3 = (com.google.android.gms.internal.p000authapi.zbe) r3
            goto L18
        L12:
            com.google.android.gms.internal.auth-api.zbe r0 = new com.google.android.gms.internal.auth-api.zbe
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
            r1 = this;
            com.google.android.gms.auth.api.zbd r0 = r1.zba
            android.os.Bundle r0 = r0.zba()
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 12800000(0xc35000, float:1.793662E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.credentials.service.START"
            return r0
    }
}
