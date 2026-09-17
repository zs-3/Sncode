package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzebj {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzebe zzb;
    private final com.google.android.gms.internal.ads.zzflg zzc;

    zzebj(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzebe r2, com.google.android.gms.internal.ads.zzflg r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbwa r4) {
            r3 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzebg r1 = new com.google.android.gms.internal.ads.zzebg
            r1.<init>(r4)
            com.google.android.gms.internal.ads.zzgfz r2 = r3.zza
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            com.google.android.gms.internal.ads.zzflg r1 = r3.zzc
            com.google.android.gms.internal.ads.zzfla r2 = com.google.android.gms.internal.ads.zzfla.zze
            com.google.android.gms.internal.ads.zzfkx r0 = r1.zzb(r2, r0)
            com.google.android.gms.internal.ads.zzebe r1 = r3.zzb
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzebh r2 = new com.google.android.gms.internal.ads.zzebh
            r2.<init>(r1)
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzf(r2)
            com.google.android.gms.internal.ads.zzfkl r0 = r0.zza()
            com.google.android.gms.internal.ads.zzebi r1 = new com.google.android.gms.internal.ads.zzebi
            r1.<init>(r3, r4)
            com.google.android.gms.internal.ads.zzgfz r4 = r3.zza
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r4)
            return r4
    }
}
