package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzfoa {
    protected final com.google.android.gms.ads.internal.ClientApi zza;
    protected final android.content.Context zzb;
    protected final int zzc;
    protected final com.google.android.gms.internal.ads.zzbpl zzd;
    protected final com.google.android.gms.ads.internal.client.zzfu zze;
    protected final java.util.concurrent.atomic.AtomicBoolean zzf;
    private final com.google.android.gms.ads.internal.client.zzcf zzg;
    private final java.util.concurrent.ConcurrentLinkedQueue zzh;
    private final com.google.android.gms.internal.ads.zzfnm zzi;
    private final java.util.concurrent.atomic.AtomicBoolean zzj;
    private final java.util.concurrent.ScheduledExecutorService zzk;
    private final java.util.concurrent.atomic.AtomicBoolean zzl;
    private final com.google.android.gms.common.util.Clock zzm;

    public zzfoa(com.google.android.gms.ads.internal.ClientApi r1, android.content.Context r2, int r3, com.google.android.gms.internal.ads.zzbpl r4, com.google.android.gms.ads.internal.client.zzfu r5, com.google.android.gms.ads.internal.client.zzcf r6, java.util.concurrent.ScheduledExecutorService r7, com.google.android.gms.internal.ads.zzfnm r8, com.google.android.gms.common.util.Clock r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzg = r6
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
            r1.<init>()
            r0.zzh = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 1
            r1.<init>(r2)
            r0.zzf = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r1.<init>(r3)
            r0.zzj = r1
            r0.zzk = r7
            r0.zzi = r8
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r2)
            r0.zzl = r1
            r0.zzm = r9
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfnm zzb(com.google.android.gms.internal.ads.zzfoa r0) {
            com.google.android.gms.internal.ads.zzfnm r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zze(com.google.android.gms.internal.ads.zzfoa r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.zzj
            return r0
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzfoa r0, java.lang.Object r1) {
            r0.zzm(r1)
            return
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzfoa r0, boolean r1) {
            r0.zzo(r1)
            return
    }

    private final synchronized void zzm(java.lang.Object r5) {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzfnu r0 = new com.google.android.gms.internal.ads.zzfnu     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.util.Clock r1 = r4.zzm     // Catch: java.lang.Throwable -> L29
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.ConcurrentLinkedQueue r5 = r4.zzh     // Catch: java.lang.Throwable -> L29
            r5.add(r0)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.internal.ads.zzfnx r5 = new com.google.android.gms.internal.ads.zzfnx     // Catch: java.lang.Throwable -> L29
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.internal.ads.zzfun r1 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> L29
            r1.post(r5)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.internal.ads.zzfnv r5 = new com.google.android.gms.internal.ads.zzfnv     // Catch: java.lang.Throwable -> L29
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L29
            long r0 = r0.zza()     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.ScheduledExecutorService r2 = r4.zzk     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L29
            r2.schedule(r5, r0, r3)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)
            return
        L29:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private final synchronized void zzn() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.zzh     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1f
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.ads.zzfnu r1 = (com.google.android.gms.internal.ads.zzfnu) r1     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.zzc()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L7
            r0.remove()     // Catch: java.lang.Throwable -> L1f
            goto L7
        L1d:
            monitor-exit(r2)
            return
        L1f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final synchronized void zzo(boolean r5) {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzfnm r0 = r4.zzi     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.zzd()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L24
            if (r5 == 0) goto L10
            com.google.android.gms.internal.ads.zzfnm r5 = r4.zzi     // Catch: java.lang.Throwable -> L26
            r5.zzb()     // Catch: java.lang.Throwable -> L26
        L10:
            java.util.concurrent.ScheduledExecutorService r5 = r4.zzk     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzfnv r0 = new com.google.android.gms.internal.ads.zzfnv     // Catch: java.lang.Throwable -> L26
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzfnm r1 = r4.zzi     // Catch: java.lang.Throwable -> L26
            long r1 = r1.zza()     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L26
            r5.schedule(r0, r1, r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r4)
            return
        L24:
            monitor-exit(r4)
            return
        L26:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zza();

    public final synchronized com.google.android.gms.internal.ads.zzfoa zzc() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfnv r0 = new com.google.android.gms.internal.ads.zzfnv     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.ScheduledExecutorService r1 = r2.zzk     // Catch: java.lang.Throwable -> Ld
            r1.submit(r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r2
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized java.lang.Object zzd() {
            r2 = this;
            monitor-enter(r2)
            r2.zzn()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfnm r0 = r2.zzi     // Catch: java.lang.Throwable -> L20
            r0.zzc()     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.zzh     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfnu r0 = (com.google.android.gms.internal.ads.zzfnu) r0     // Catch: java.lang.Throwable -> L20
            r1 = 1
            r2.zzh(r1)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L1a
            r0 = 0
            monitor-exit(r2)
            return r0
        L1a:
            java.lang.Object r0 = r0.zzb()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return r0
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    protected final synchronized void zzh(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L6
            r2.zzn()     // Catch: java.lang.Throwable -> L45
        L6:
            com.google.android.gms.internal.ads.zzfnw r3 = new com.google.android.gms.internal.ads.zzfnw     // Catch: java.lang.Throwable -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> L45
            r0.post(r3)     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzj     // Catch: java.lang.Throwable -> L45
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto L43
            java.util.concurrent.ConcurrentLinkedQueue r3 = r2.zzh     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.ads.internal.client.zzfu r0 = r2.zze     // Catch: java.lang.Throwable -> L45
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L45
            int r0 = r0.zzd     // Catch: java.lang.Throwable -> L45
            if (r3 < r0) goto L25
            goto L43
        L25:
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzf     // Catch: java.lang.Throwable -> L45
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L43
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzj     // Catch: java.lang.Throwable -> L45
            r0 = 1
            r3.set(r0)     // Catch: java.lang.Throwable -> L45
            com.google.common.util.concurrent.ListenableFuture r3 = r2.zza()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzfny r0 = new com.google.android.gms.internal.ads.zzfny     // Catch: java.lang.Throwable -> L45
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.ScheduledExecutorService r1 = r2.zzk     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzgfo.zzr(r3, r0, r1)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r2)
            return
        L43:
            monitor-exit(r2)
            return
        L45:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    final /* synthetic */ void zzi() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzl
            boolean r0 = r0.get()
            if (r0 == 0) goto L15
            com.google.android.gms.ads.internal.client.zzcf r0 = r2.zzg     // Catch: android.os.RemoteException -> L10
            com.google.android.gms.ads.internal.client.zzfu r1 = r2.zze     // Catch: android.os.RemoteException -> L10
            r0.zze(r1)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            java.lang.String r0 = "Failed to call onAdsAvailable"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L15:
            return
    }

    final /* synthetic */ void zzj() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzl
            boolean r0 = r0.get()
            if (r0 == 0) goto L1d
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.zzh
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            com.google.android.gms.ads.internal.client.zzcf r0 = r2.zzg     // Catch: android.os.RemoteException -> L18
            com.google.android.gms.ads.internal.client.zzfu r1 = r2.zze     // Catch: android.os.RemoteException -> L18
            r0.zzf(r1)     // Catch: android.os.RemoteException -> L18
            return
        L18:
            java.lang.String r0 = "Failed to call onAdsExhausted"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L1d:
            return
    }

    public final void zzk() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzf
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzl
            r0.set(r1)
            return
    }

    public final synchronized boolean zzl() {
            r1 = this;
            monitor-enter(r1)
            r1.zzn()     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.ConcurrentLinkedQueue r0 = r1.zzh     // Catch: java.lang.Throwable -> L11
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lf
            r0 = 1
        Ld:
            monitor-exit(r1)
            return r0
        Lf:
            r0 = 0
            goto Ld
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
