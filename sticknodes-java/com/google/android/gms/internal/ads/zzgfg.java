package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgfg extends com.google.android.gms.internal.ads.zzgff {
    private final com.google.common.util.concurrent.ListenableFuture zza;

    zzgfg(com.google.common.util.concurrent.ListenableFuture r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgec, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgec, java.util.concurrent.Future
    public final boolean cancel(boolean r2) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgec, java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgec, java.util.concurrent.Future
    public final java.lang.Object get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgec, java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgec, java.util.concurrent.Future
    public final boolean isDone() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            boolean r0 = r0.isDone()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final java.lang.String toString() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }
}
