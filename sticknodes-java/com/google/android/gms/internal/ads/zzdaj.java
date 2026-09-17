package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdaj extends com.google.android.gms.internal.ads.zzddr implements com.google.android.gms.internal.ads.zzcyu, com.google.android.gms.internal.ads.zzczz {
    private final com.google.android.gms.internal.ads.zzfgh zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;

    public zzdaj(java.util.Set r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            r0.zzc = r1
            r0.zzb = r2
            return
    }

    private final void zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhv
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2f
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzc
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.zzfgh r0 = r3.zzb
            com.google.android.gms.ads.internal.client.zzu r0 = r0.zzae
            if (r0 == 0) goto L2f
            int r0 = r0.zza
            r1 = 3
            if (r0 != r1) goto L2f
            com.google.android.gms.internal.ads.zzdai r0 = new com.google.android.gms.internal.ads.zzdai
            r0.<init>(r3)
            r3.zzq(r0)
        L2f:
            return
    }

    final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzdal r2) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r1.zzb
            com.google.android.gms.ads.internal.client.zzu r0 = r0.zzae
            r2.zzh(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r2.zzb
            int r0 = r0.zzb
            r1 = 1
            if (r0 != r1) goto La
            r2.zzb()
        La:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r2.zzb
            int r0 = r0.zzb
            r1 = 2
            if (r0 == r1) goto L15
            r1 = 5
            if (r0 == r1) goto L15
            r1 = 4
            if (r0 == r1) goto L15
            r1 = 6
            if (r0 == r1) goto L15
            r1 = 7
            if (r0 != r1) goto L14
            goto L15
        L14:
            return
        L15:
            r2.zzb()
            return
    }
}
