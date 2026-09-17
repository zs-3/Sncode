package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbca {
    com.google.android.gms.internal.ads.zzayq zza;
    boolean zzb;
    private final java.util.concurrent.ExecutorService zzc;

    public zzbca() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            r1.zzc = r0
            return
    }

    public zzbca(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            r2.zzc = r0
            com.google.android.gms.internal.ads.zzbbv r1 = new com.google.android.gms.internal.ads.zzbbv
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.ExecutorService zza(com.google.android.gms.internal.ads.zzbca r0) {
            java.util.concurrent.ExecutorService r0 = r0.zzc
            return r0
    }
}
