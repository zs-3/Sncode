package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzi extends com.google.android.gms.common.internal.GmsClient {
    zzi(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.api.internal.ConnectionCallbacks r11, com.google.android.gms.common.api.internal.OnConnectionFailedListener r12) {
            r7 = this;
            r3 = 224(0xe0, float:3.14E-43)
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IGoogleAuthService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzp
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.auth.zzp r3 = (com.google.android.gms.internal.auth.zzp) r3
            goto L18
        L12:
            com.google.android.gms.internal.auth.zzp r0 = new com.google.android.gms.internal.auth.zzp
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "GoogleAuthServiceClientImpl disconnected with reason: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "GoogleAuthSvcClientImpl"
            android.util.Log.w(r1, r0)
            super.disconnect(r3)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
            r3 = this;
            r0 = 3
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            com.google.android.gms.common.Feature r1 = com.google.android.gms.auth.zze.zzl
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.common.Feature r1 = com.google.android.gms.auth.zze.zzk
            r2 = 1
            r0[r2] = r1
            com.google.android.gms.common.Feature r1 = com.google.android.gms.auth.zze.zza
            r2 = 2
            r0[r2] = r1
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
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IGoogleAuthService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.account.authapi.START"
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
