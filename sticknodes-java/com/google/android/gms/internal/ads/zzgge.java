package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgge extends com.google.android.gms.internal.ads.zzggb implements java.util.concurrent.ScheduledExecutorService {
    final java.util.concurrent.ScheduledExecutorService zza;

    zzgge(java.util.concurrent.ScheduledExecutorService r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r3, long r4, java.util.concurrent.TimeUnit r6) {
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r2.zza
            r1 = 0
            com.google.android.gms.internal.ads.zzggo r3 = com.google.android.gms.internal.ads.zzggo.zze(r3, r1)
            java.util.concurrent.ScheduledFuture r4 = r0.schedule(r3, r4, r6)
            com.google.android.gms.internal.ads.zzggc r5 = new com.google.android.gms.internal.ads.zzggc
            r5.<init>(r3, r4)
            return r5
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            com.google.android.gms.internal.ads.zzggo r0 = new com.google.android.gms.internal.ads.zzggo
            r0.<init>(r2)
            java.util.concurrent.ScheduledExecutorService r2 = r1.zza
            java.util.concurrent.ScheduledFuture r2 = r2.schedule(r0, r3, r5)
            com.google.android.gms.internal.ads.zzggc r3 = new com.google.android.gms.internal.ads.zzggc
            r3.<init>(r0, r2)
            return r3
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r8 = this;
            com.google.android.gms.internal.ads.zzggd r7 = new com.google.android.gms.internal.ads.zzggd
            r7.<init>(r9)
            java.util.concurrent.ScheduledExecutorService r0 = r8.zza
            r1 = r7
            r2 = r10
            r4 = r12
            r6 = r14
            java.util.concurrent.ScheduledFuture r9 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            com.google.android.gms.internal.ads.zzggc r10 = new com.google.android.gms.internal.ads.zzggc
            r10.<init>(r7, r9)
            return r10
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r8 = this;
            com.google.android.gms.internal.ads.zzggd r7 = new com.google.android.gms.internal.ads.zzggd
            r7.<init>(r9)
            java.util.concurrent.ScheduledExecutorService r0 = r8.zza
            r1 = r7
            r2 = r10
            r4 = r12
            r6 = r14
            java.util.concurrent.ScheduledFuture r9 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            com.google.android.gms.internal.ads.zzggc r10 = new com.google.android.gms.internal.ads.zzggc
            r10.<init>(r7, r9)
            return r10
    }
}
