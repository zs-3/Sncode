package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcam extends com.google.android.gms.internal.ads.zzgeh {
    private final java.util.concurrent.Executor zza;

    /* synthetic */ zzcam(java.util.concurrent.Executor r1, com.google.android.gms.internal.ads.zzcal r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.zza
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
