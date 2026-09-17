package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfkl implements com.google.common.util.concurrent.ListenableFuture {
    private final java.lang.Object zza;
    private final java.lang.String zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;

    public zzfkl(java.lang.Object r1, java.lang.String r2, com.google.common.util.concurrent.ListenableFuture r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzc
            r0.addListener(r2, r3)
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r2) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzc
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzc
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzc
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzc
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzc
            boolean r0 = r0.isDone()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.zzb
            r1.append(r2)
            java.lang.String r2 = "@"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public final java.lang.Object zza() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
