package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzawk implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;

    zzawk() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r2.zza = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.zzb = r0
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzb
            java.util.concurrent.ThreadFactory r1 = r3.zza
            java.lang.Thread r4 = r1.newThread(r4)
            int r0 = r0.getAndIncrement()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "gads-"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.setName(r0)
            return r4
    }
}
