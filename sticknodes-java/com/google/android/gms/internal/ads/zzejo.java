package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzejo {
    private final java.util.concurrent.Executor zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.android.gms.internal.ads.zzcth zzc;
    private final com.google.android.gms.internal.ads.zzeke zzd;
    private final com.google.android.gms.internal.ads.zzfnc zze;
    private final com.google.android.gms.internal.ads.zzggh zzf;
    private final java.util.concurrent.atomic.AtomicBoolean zzg;
    private com.google.android.gms.internal.ads.zzejp zzh;
    private com.google.android.gms.internal.ads.zzfgt zzi;

    zzejo(java.util.concurrent.Executor r2, java.util.concurrent.ScheduledExecutorService r3, com.google.android.gms.internal.ads.zzcth r4, com.google.android.gms.internal.ads.zzeke r5, com.google.android.gms.internal.ads.zzfnc r6) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzggh r0 = com.google.android.gms.internal.ads.zzggh.zze()
            r1.zzf = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zzg = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r5
            r1.zze = r6
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzejp zza(com.google.android.gms.internal.ads.zzejo r0) {
            com.google.android.gms.internal.ads.zzejp r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzejo r0, com.google.android.gms.internal.ads.zzfgh r1) {
            r0.zze(r1)
            return
    }

    private final synchronized com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzfgh r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.List r0 = r5.zza     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzcth r2 = r4.zzc     // Catch: java.lang.Throwable -> L44
            int r3 = r5.zzb     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzegk r1 = r2.zza(r3, r1)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L7
            com.google.android.gms.internal.ads.zzfgt r2 = r4.zzi     // Catch: java.lang.Throwable -> L44
            boolean r2 = r1.zzb(r2, r5)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L7
            com.google.android.gms.internal.ads.zzfgt r0 = r4.zzi     // Catch: java.lang.Throwable -> L44
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza(r0, r5)     // Catch: java.lang.Throwable -> L44
            int r5 = r5.zzR     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.ScheduledExecutorService r1 = r4.zzb     // Catch: java.lang.Throwable -> L44
            long r2 = (long) r5     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L44
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r2, r5, r1)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r4)
            return r5
        L38:
            com.google.android.gms.internal.ads.zzdye r5 = new com.google.android.gms.internal.ads.zzdye     // Catch: java.lang.Throwable -> L44
            r0 = 3
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L44
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzg(r5)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r4)
            return r5
        L44:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private final void zze(com.google.android.gms.internal.ads.zzfgh r5) {
            r4 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r4.zzd(r5)
            com.google.android.gms.internal.ads.zzfnc r1 = r4.zze
            com.google.android.gms.internal.ads.zzeke r2 = r4.zzd
            com.google.android.gms.internal.ads.zzfgt r3 = r4.zzi
            r2.zzf(r3, r5, r0, r1)
            com.google.android.gms.internal.ads.zzejn r1 = new com.google.android.gms.internal.ads.zzejn
            r1.<init>(r4, r5)
            java.util.concurrent.Executor r5 = r4.zza
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r5)
            return
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfgt r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzg     // Catch: java.lang.Throwable -> L50
            r1 = 1
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4c
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb     // Catch: java.lang.Throwable -> L50
            java.util.List r0 = r0.zza     // Catch: java.lang.Throwable -> L50
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzggh r0 = r3.zzf     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzeki r1 = new com.google.android.gms.internal.ads.zzeki     // Catch: java.lang.Throwable -> L50
            r2 = 3
            java.lang.String r4 = com.google.android.gms.internal.ads.zzekl.zzc(r4)     // Catch: java.lang.Throwable -> L50
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L50
            r0.zzd(r1)     // Catch: java.lang.Throwable -> L50
            goto L4c
        L24:
            r3.zzi = r4     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzeke r0 = r3.zzd     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzggh r1 = r3.zzf     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzejp r2 = new com.google.android.gms.internal.ads.zzejp     // Catch: java.lang.Throwable -> L50
            r2.<init>(r4, r0, r1)     // Catch: java.lang.Throwable -> L50
            r3.zzh = r2     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzeke r0 = r3.zzd     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzfgs r4 = r4.zzb     // Catch: java.lang.Throwable -> L50
            java.util.List r4 = r4.zza     // Catch: java.lang.Throwable -> L50
            r0.zzk(r4)     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzejp r4 = r3.zzh     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzfgh r4 = r4.zza()     // Catch: java.lang.Throwable -> L50
        L40:
            if (r4 == 0) goto L4c
            r3.zze(r4)     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzejp r4 = r3.zzh     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzfgh r4 = r4.zza()     // Catch: java.lang.Throwable -> L50
            goto L40
        L4c:
            com.google.android.gms.internal.ads.zzggh r4 = r3.zzf     // Catch: java.lang.Throwable -> L50
            monitor-exit(r3)
            return r4
        L50:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
