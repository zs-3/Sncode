package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzap extends com.google.android.gms.common.internal.GmsClient {
    private final android.os.Bundle zze;

    public zzap(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.auth.api.accounttransfer.zzr r11, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r12, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r13) {
            r7 = this;
            r3 = 128(0x80, float:1.794E-43)
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
            java.lang.String r0 = "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzau
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.auth.zzau r3 = (com.google.android.gms.internal.auth.zzau) r3
            goto L18
        L12:
            com.google.android.gms.internal.auth.zzau r0 = new com.google.android.gms.internal.auth.zzau
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
            java.lang.String r0 = "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.accounttransfer.service.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
            r1 = this;
            r0 = 1
            return r0
    }
}
