package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgeh extends java.util.concurrent.AbstractExecutorService implements com.google.android.gms.internal.ads.zzgfz {
    public zzgeh() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzggo r1 = com.google.android.gms.internal.ads.zzggo.zze(r1, r2)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzggo r0 = new com.google.android.gms.internal.ads.zzggo
            r0.<init>(r2)
            return r0
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final com.google.common.util.concurrent.ListenableFuture zzb(java.util.concurrent.Callable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }
}
