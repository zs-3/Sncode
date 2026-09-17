package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzezw implements com.google.android.gms.internal.ads.zzexh {
    public zzezw(com.google.android.gms.internal.ads.zzbzr r1, com.google.android.gms.internal.ads.zzgfz r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 47
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r4 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzfE
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1b
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
        L1b:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            r2 = 2
            com.google.common.util.concurrent.ListenableFuture[] r2 = new com.google.common.util.concurrent.ListenableFuture[r2]
            r3 = 0
            r2[r3] = r1
            r3 = 1
            r2[r3] = r0
            com.google.android.gms.internal.ads.zzgfn r2 = com.google.android.gms.internal.ads.zzgfo.zzc(r2)
            com.google.android.gms.internal.ads.zzezv r3 = new com.google.android.gms.internal.ads.zzezv
            r3.<init>(r1, r0)
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zza(r3, r0)
            return r0
    }
}
