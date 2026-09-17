package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzept implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.common.util.concurrent.ListenableFuture zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;

    public zzept(com.google.common.util.concurrent.ListenableFuture r1, java.util.concurrent.Executor r2, java.util.concurrent.ScheduledExecutorService r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 6
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzepp r0 = new com.google.android.gms.internal.ads.zzepp
            r0.<init>()
            com.google.common.util.concurrent.ListenableFuture r1 = r5.zza
            java.util.concurrent.Executor r2 = r5.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r0, r2)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzmb
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 <= 0) goto L36
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzc
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r4, r3)
        L36:
            com.google.android.gms.internal.ads.zzepq r1 = new com.google.android.gms.internal.ads.zzepq
            r1.<init>()
            java.util.concurrent.Executor r2 = r5.zzb
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r3, r1, r2)
            return r0
    }
}
