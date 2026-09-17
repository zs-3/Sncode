package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzggb extends com.google.android.gms.internal.ads.zzgeh {
    private final java.util.concurrent.ExecutorService zza;

    zzggb(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zza
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zza
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zza
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zza
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zza
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zza
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.util.concurrent.ExecutorService r0 = r3.zza
            java.lang.String r1 = super.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "["
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
