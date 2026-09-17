package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzful implements com.google.android.gms.internal.ads.zzfuj {
    private zzful() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzful(com.google.android.gms.internal.ads.zzfuk r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final java.util.concurrent.ExecutorService zza(int r3) {
            r2 = this;
            java.util.concurrent.ThreadFactory r3 = java.util.concurrent.Executors.defaultThreadFactory()
            r0 = 1
            r1 = 2
            java.util.concurrent.ExecutorService r3 = r2.zzc(r0, r3, r1)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final java.util.concurrent.ExecutorService zzb(java.util.concurrent.ThreadFactory r1, int r2) {
            r0 = this;
            r2 = 1
            java.util.concurrent.ExecutorService r1 = r0.zzc(r2, r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final java.util.concurrent.ExecutorService zzc(int r9, java.util.concurrent.ThreadFactory r10, int r11) {
            r8 = this;
            java.util.concurrent.ThreadPoolExecutor r11 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r3 = 60
            r0 = r11
            r1 = r9
            r2 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r9 = 1
            r11.allowCoreThreadTimeOut(r9)
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.unconfigurableExecutorService(r11)
            return r9
    }
}
