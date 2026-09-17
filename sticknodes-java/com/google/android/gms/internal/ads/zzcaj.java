package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcaj implements java.util.concurrent.ThreadFactory {
    final /* synthetic */ java.lang.String zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;

    zzcaj(java.lang.String r2) {
            r1 = this;
            r1.zza = r2
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 1
            r2.<init>(r0)
            r1.zzb = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zzb
            java.lang.Thread r1 = new java.lang.Thread
            int r0 = r0.getAndIncrement()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdWorker("
            r2.append(r3)
            java.lang.String r3 = r4.zza
            r2.append(r3)
            java.lang.String r3 = ") #"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r5, r0)
            return r1
    }
}
