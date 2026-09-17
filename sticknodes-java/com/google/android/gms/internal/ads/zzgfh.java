package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgfh extends com.google.android.gms.internal.ads.zzgao implements java.util.concurrent.Future {
    protected zzgfh() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r2) {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            boolean r0 = r0.isDone()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgao
    protected /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
            r0 = 0
            throw r0
    }

    protected abstract java.util.concurrent.Future zzb();
}
