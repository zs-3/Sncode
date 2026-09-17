package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeph implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzfhc zzb;

    zzeph(com.google.android.gms.common.util.Clock r1, com.google.android.gms.internal.ads.zzfhc r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzepi r0 = new com.google.android.gms.internal.ads.zzepi
            com.google.android.gms.common.util.Clock r1 = r5.zza
            com.google.android.gms.internal.ads.zzfhc r2 = r5.zzb
            long r3 = r1.currentTimeMillis()
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }
}
