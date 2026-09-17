package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgy extends com.google.android.gms.common.internal.BaseGmsClient {
    public zzgy(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r10, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r11) {
            r7 = this;
            r3 = 93
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.measurement.internal.zzgl
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.measurement.internal.zzgl r3 = (com.google.android.gms.measurement.internal.zzgl) r3
            goto L18
        L12:
            com.google.android.gms.measurement.internal.zzgj r0 = new com.google.android.gms.measurement.internal.zzgj
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
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
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.START"
            return r0
    }
}
