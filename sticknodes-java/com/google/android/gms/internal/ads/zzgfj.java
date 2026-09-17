package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgfj extends com.google.android.gms.internal.ads.zzgfh implements com.google.common.util.concurrent.ListenableFuture {
    protected zzgfj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzc()
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    protected /* bridge */ /* synthetic */ java.util.concurrent.Future zzb() {
            r1 = this;
            r0 = 0
            throw r0
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zzc();
}
