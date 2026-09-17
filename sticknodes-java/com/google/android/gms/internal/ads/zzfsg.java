package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfsg extends com.google.android.gms.ads.internal.zzc {
    private final int zze;

    public zzfsg(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r10, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r11, int r12) {
            r7 = this;
            r3 = 116(0x74, float:1.63E-43)
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zze = r12
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.gass.internal.IGassService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzfsl
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.ads.zzfsl r3 = (com.google.android.gms.internal.ads.zzfsl) r3
            goto L18
        L12:
            com.google.android.gms.internal.ads.zzfsl r0 = new com.google.android.gms.internal.ads.zzfsl
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.gass.internal.IGassService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.gass.START"
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfsl zzp() throws android.os.DeadObjectException {
            r1 = this;
            android.os.IInterface r0 = super.getService()
            com.google.android.gms.internal.ads.zzfsl r0 = (com.google.android.gms.internal.ads.zzfsl) r0
            return r0
    }
}
