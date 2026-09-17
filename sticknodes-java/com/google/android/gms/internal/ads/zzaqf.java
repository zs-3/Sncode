package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaqf {
    private final java.util.concurrent.atomic.AtomicInteger zza;
    private final java.util.Set zzb;
    private final java.util.concurrent.PriorityBlockingQueue zzc;
    private final java.util.concurrent.PriorityBlockingQueue zzd;
    private final com.google.android.gms.internal.ads.zzapm zze;
    private final com.google.android.gms.internal.ads.zzapv zzf;
    private final com.google.android.gms.internal.ads.zzapw[] zzg;
    private com.google.android.gms.internal.ads.zzapo zzh;
    private final java.util.List zzi;
    private final java.util.List zzj;
    private final com.google.android.gms.internal.ads.zzapt zzk;

    public zzaqf(com.google.android.gms.internal.ads.zzapm r3, com.google.android.gms.internal.ads.zzapv r4, int r5) {
            r2 = this;
            com.google.android.gms.internal.ads.zzapt r5 = new com.google.android.gms.internal.ads.zzapt
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r5.<init>(r0)
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.zzb = r0
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            r2.zzc = r0
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            r2.zzd = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzi = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzj = r0
            r2.zze = r3
            r2.zzf = r4
            r3 = 4
            com.google.android.gms.internal.ads.zzapw[] r3 = new com.google.android.gms.internal.ads.zzapw[r3]
            r2.zzg = r3
            r2.zzk = r5
            return
    }

    public final com.google.android.gms.internal.ads.zzaqc zza(com.google.android.gms.internal.ads.zzaqc r3) {
            r2 = this;
            r3.zzf(r2)
            java.util.Set r0 = r2.zzb
            monitor-enter(r0)
            java.util.Set r1 = r2.zzb     // Catch: java.lang.Throwable -> L24
            r1.add(r3)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            java.util.concurrent.atomic.AtomicInteger r0 = r2.zza
            int r0 = r0.incrementAndGet()
            r3.zzg(r0)
            java.lang.String r0 = "add-to-queue"
            r3.zzm(r0)
            r0 = 0
            r2.zzc(r3, r0)
            java.util.concurrent.PriorityBlockingQueue r0 = r2.zzc
            r0.add(r3)
            return r3
        L24:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r3
    }

    final void zzb(com.google.android.gms.internal.ads.zzaqc r4) {
            r3 = this;
            java.util.Set r0 = r3.zzb
            monitor-enter(r0)
            java.util.Set r1 = r3.zzb     // Catch: java.lang.Throwable -> L2b
            r1.remove(r4)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            java.util.List r1 = r3.zzi
            monitor-enter(r1)
            java.util.List r0 = r3.zzi     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L28
        L12:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.internal.ads.zzaqe r2 = (com.google.android.gms.internal.ads.zzaqe) r2     // Catch: java.lang.Throwable -> L28
            r2.zza()     // Catch: java.lang.Throwable -> L28
            goto L12
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            r0 = 5
            r3.zzc(r4, r0)
            return
        L28:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            throw r4
        L2b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }

    final void zzc(com.google.android.gms.internal.ads.zzaqc r2, int r3) {
            r1 = this;
            java.util.List r2 = r1.zzj
            monitor-enter(r2)
            java.util.List r3 = r1.zzj     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.internal.ads.zzaqd r0 = (com.google.android.gms.internal.ads.zzaqd) r0     // Catch: java.lang.Throwable -> L1b
            r0.zza()     // Catch: java.lang.Throwable -> L1b
            goto L9
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public final void zzd() {
            r7 = this;
            com.google.android.gms.internal.ads.zzapo r0 = r7.zzh
            if (r0 == 0) goto L7
            r0.zzb()
        L7:
            com.google.android.gms.internal.ads.zzapw[] r0 = r7.zzg
            r1 = 0
            r2 = 0
        Lb:
            r3 = 4
            if (r2 >= r3) goto L18
            r3 = r0[r2]
            if (r3 == 0) goto L15
            r3.zza()
        L15:
            int r2 = r2 + 1
            goto Lb
        L18:
            java.util.concurrent.PriorityBlockingQueue r0 = r7.zzc
            java.util.concurrent.PriorityBlockingQueue r2 = r7.zzd
            com.google.android.gms.internal.ads.zzapm r4 = r7.zze
            com.google.android.gms.internal.ads.zzapt r5 = r7.zzk
            com.google.android.gms.internal.ads.zzapo r6 = new com.google.android.gms.internal.ads.zzapo
            r6.<init>(r0, r2, r4, r5)
            r7.zzh = r6
            r6.start()
        L2a:
            if (r1 >= r3) goto L43
            java.util.concurrent.PriorityBlockingQueue r0 = r7.zzd
            com.google.android.gms.internal.ads.zzapv r2 = r7.zzf
            com.google.android.gms.internal.ads.zzapm r4 = r7.zze
            com.google.android.gms.internal.ads.zzapt r5 = r7.zzk
            com.google.android.gms.internal.ads.zzapw r6 = new com.google.android.gms.internal.ads.zzapw
            r6.<init>(r0, r2, r4, r5)
            com.google.android.gms.internal.ads.zzapw[] r0 = r7.zzg
            r0[r1] = r6
            r6.start()
            int r1 = r1 + 1
            goto L2a
        L43:
            return
    }
}
