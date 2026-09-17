package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfaa implements com.google.android.gms.internal.ads.zzexh {
    final com.google.android.gms.internal.ads.zzgfz zza;
    final java.util.List zzb;

    public zzfaa(com.google.android.gms.internal.ads.zzbce r1, com.google.android.gms.internal.ads.zzgfz r2, java.util.List r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 48
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzezz r0 = new com.google.android.gms.internal.ads.zzezz
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }
}
