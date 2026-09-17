package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfib {
    private final java.util.Deque zza;
    private final java.util.concurrent.Callable zzb;
    private final com.google.android.gms.internal.ads.zzgfz zzc;

    public zzfib(java.util.concurrent.Callable r2, com.google.android.gms.internal.ads.zzgfz r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zza() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.zzc(r0)     // Catch: java.lang.Throwable -> Lf
            java.util.Deque r0 = r1.zza     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> Lf
            com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzb(com.google.common.util.concurrent.ListenableFuture r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Deque r0 = r1.zza     // Catch: java.lang.Throwable -> L8
            r0.addFirst(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzc(int r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.Deque r0 = r4.zza     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1d
            int r5 = r5 - r0
            r0 = 0
        L9:
            if (r0 >= r5) goto L1b
            java.util.Deque r1 = r4.zza     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.ads.zzgfz r2 = r4.zzc     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.Callable r3 = r4.zzb     // Catch: java.lang.Throwable -> L1d
            com.google.common.util.concurrent.ListenableFuture r2 = r2.zzb(r3)     // Catch: java.lang.Throwable -> L1d
            r1.add(r2)     // Catch: java.lang.Throwable -> L1d
            int r0 = r0 + 1
            goto L9
        L1b:
            monitor-exit(r4)
            return
        L1d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
