package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbva extends com.google.android.gms.common.internal.BaseGmsClient {
    public zzbva(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r11, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r12) {
            r8 = this;
            android.content.Context r0 = r9.getApplicationContext()
            if (r0 == 0) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = r9
        L9:
            r4 = 8
            r7 = 0
            r1 = r8
            r3 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdsService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbvn
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.ads.zzbvn r3 = (com.google.android.gms.internal.ads.zzbvn) r3
            goto L18
        L12:
            com.google.android.gms.internal.ads.zzbvl r0 = new com.google.android.gms.internal.ads.zzbvl
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdsService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.service.ADS"
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbvn zzp() throws android.os.DeadObjectException {
            r1 = this;
            android.os.IInterface r0 = super.getService()
            com.google.android.gms.internal.ads.zzbvn r0 = (com.google.android.gms.internal.ads.zzbvn) r0
            return r0
    }
}
