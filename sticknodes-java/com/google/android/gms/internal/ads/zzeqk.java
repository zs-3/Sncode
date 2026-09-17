package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeqk implements com.google.android.gms.internal.ads.zzexh {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;

    zzeqk(com.google.android.gms.internal.ads.zzgfz r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 61
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmv
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.ads.zzeql r0 = new com.google.android.gms.internal.ads.zzeql
            r0.<init>(r2, r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
        L1e:
            android.content.Context r0 = r3.zza
            android.content.ContentResolver r0 = r0.getContentResolver()
            if (r0 != 0) goto L30
            com.google.android.gms.internal.ads.zzeql r0 = new com.google.android.gms.internal.ads.zzeql
            r0.<init>(r2, r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
        L30:
            com.google.android.gms.internal.ads.zzgfz r1 = r3.zzb
            com.google.android.gms.internal.ads.zzeqj r2 = new com.google.android.gms.internal.ads.zzeqj
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r2)
            return r0
    }
}
