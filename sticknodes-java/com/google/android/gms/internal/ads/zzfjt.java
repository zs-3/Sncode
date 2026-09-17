package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfjt implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger zza;

    zzfjt() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zza
            java.lang.Thread r1 = new java.lang.Thread
            int r0 = r0.getAndIncrement()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdWorker(NG) #"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r5, r0)
            return r1
    }
}
