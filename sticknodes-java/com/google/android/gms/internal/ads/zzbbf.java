package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbbf extends com.google.android.gms.ads.internal.zzc {
    zzbbf(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r10, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r11) {
            r7 = this;
            android.content.Context r1 = com.google.android.gms.internal.ads.zzbwk.zza(r8)
            r3 = 123(0x7b, float:1.72E-43)
            r6 = 0
            r0 = r7
            r2 = r9
            r4 = r10
            r5 = r11
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
            java.lang.String r0 = "com.google.android.gms.ads.internal.cache.ICacheService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbbi
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.ads.zzbbi r3 = (com.google.android.gms.internal.ads.zzbbi) r3
            goto L18
        L12:
            com.google.android.gms.internal.ads.zzbbi r0 = new com.google.android.gms.internal.ads.zzbbi
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.ads.zzg.zzb
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.cache.ICacheService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.service.CACHE"
            return r0
    }

    public final boolean zzp() {
            r3 = this;
            com.google.android.gms.common.Feature[] r0 = r3.getAvailableFeatures()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L20
            com.google.android.gms.common.Feature r1 = com.google.android.gms.ads.zzg.zza
            boolean r0 = com.google.android.gms.common.util.ArrayUtils.contains(r0, r1)
            if (r0 == 0) goto L20
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbbi zzq() throws android.os.DeadObjectException {
            r1 = this;
            android.os.IInterface r0 = super.getService()
            com.google.android.gms.internal.ads.zzbbi r0 = (com.google.android.gms.internal.ads.zzbbi) r0
            return r0
    }
}
