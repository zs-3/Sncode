package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfjs {
    private final com.google.android.gms.internal.ads.zzfjl zza;
    private final com.google.common.util.concurrent.ListenableFuture zzb;
    private boolean zzc;
    private boolean zzd;

    public zzfjs(com.google.android.gms.internal.ads.zzfiq r3, com.google.android.gms.internal.ads.zzfjk r4, com.google.android.gms.internal.ads.zzfjl r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzc = r0
            r2.zzd = r0
            r2.zza = r5
            com.google.common.util.concurrent.ListenableFuture r0 = r4.zza(r5)
            com.google.android.gms.internal.ads.zzfjq r1 = new com.google.android.gms.internal.ads.zzfjq
            r1.<init>(r2, r4, r3, r5)
            java.util.concurrent.Executor r3 = r5.zzb()
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r3)
            com.google.android.gms.internal.ads.zzfjr r0 = new com.google.android.gms.internal.ads.zzfjr
            r0.<init>(r2, r4)
            java.util.concurrent.Executor r4 = r5.zzb()
            java.lang.Class<java.lang.Exception> r5 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzf(r3, r5, r0, r4)
            r2.zzb = r3
            return
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfjl r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzd     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L2f
            boolean r0 = r1.zzc     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto La
            goto L2f
        La:
            com.google.android.gms.internal.ads.zzfjl r0 = r1.zza     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzfja r0 = r0.zza()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.zzfja r0 = r2.zza()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.zzfjl r0 = r1.zza     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzfja r0 = r0.zza()     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzfja r2 = r2.zza()     // Catch: java.lang.Throwable -> L32
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2f
            r2 = 1
            r1.zzc = r2     // Catch: java.lang.Throwable -> L32
            com.google.common.util.concurrent.ListenableFuture r2 = r1.zzb     // Catch: java.lang.Throwable -> L32
            monitor-exit(r1)
            return r2
        L2f:
            r2 = 0
            monitor-exit(r1)
            return r2
        L32:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfjk r2, com.google.android.gms.internal.ads.zzfiq r3, com.google.android.gms.internal.ads.zzfjl r4, com.google.android.gms.internal.ads.zzfiz r5) throws java.lang.Exception {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.zzd = r0     // Catch: java.lang.Throwable -> L24
            r2.zzb(r5)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r1.zzc     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L19
            com.google.android.gms.internal.ads.zzfja r2 = r4.zza()     // Catch: java.lang.Throwable -> L24
            r3.zzd(r2, r5)     // Catch: java.lang.Throwable -> L24
            r2 = 0
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r2
        L19:
            com.google.android.gms.internal.ads.zzfjj r2 = new com.google.android.gms.internal.ads.zzfjj     // Catch: java.lang.Throwable -> L24
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L24
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r2
        L24:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r2
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfjk r1, java.lang.Exception r2) throws java.lang.Exception {
            r0 = this;
            monitor-enter(r0)
            r1 = 1
            r0.zzd = r1     // Catch: java.lang.Throwable -> L5
            throw r2     // Catch: java.lang.Throwable -> L5
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzgfk r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzfjp r0 = new com.google.android.gms.internal.ads.zzfjp     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.ads.zzfjl r1 = r3.zza     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.Executor r1 = r1.zzb()     // Catch: java.lang.Throwable -> L1d
            com.google.common.util.concurrent.ListenableFuture r2 = r3.zzb     // Catch: java.lang.Throwable -> L1d
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r2, r0, r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.ads.zzfjl r1 = r3.zza     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.Executor r1 = r1.zzb()     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r4, r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L1d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
