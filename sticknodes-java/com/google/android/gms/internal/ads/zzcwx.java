package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcwx implements com.google.android.gms.internal.ads.zzcya, com.google.android.gms.internal.ads.zzdff, com.google.android.gms.internal.ads.zzdcv, com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzayv {
    private final com.google.android.gms.internal.ads.zzcys zza;
    private final com.google.android.gms.internal.ads.zzfgh zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.internal.ads.zzggh zze;
    private java.util.concurrent.ScheduledFuture zzf;
    private final java.util.concurrent.atomic.AtomicBoolean zzg;
    private final java.lang.String zzh;

    zzcwx(com.google.android.gms.internal.ads.zzcys r2, com.google.android.gms.internal.ads.zzfgh r3, java.util.concurrent.ScheduledExecutorService r4, java.util.concurrent.Executor r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzggh r0 = com.google.android.gms.internal.ads.zzggh.zze()
            r1.zze = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zzg = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r5
            r1.zzh = r6
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcys zzg(com.google.android.gms.internal.ads.zzcwx r0) {
            com.google.android.gms.internal.ads.zzcys r0 = r0.zza
            return r0
    }

    private final boolean zzm() {
            r2 = this;
            java.lang.String r0 = r2.zzh
            java.lang.String r1 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzb() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzc() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r3.zzb
            int r1 = r0.zze
            r2 = 3
            if (r1 != r2) goto L8
            goto L28
        L8:
            int r0 = r0.zzY
            if (r0 == 0) goto Lf
            r1 = 1
            if (r0 != r1) goto L28
        Lf:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzld
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L29
            boolean r0 = r3.zzm()
            if (r0 != 0) goto L28
            goto L29
        L28:
            return
        L29:
            com.google.android.gms.internal.ads.zzcys r0 = r3.zza
            r0.zza()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(com.google.android.gms.internal.ads.zzayu r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzld
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L37
            boolean r0 = r2.zzm()
            if (r0 == 0) goto L37
            boolean r3 = r3.zzj
            if (r3 == 0) goto L37
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzg
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L37
            com.google.android.gms.internal.ads.zzfgh r3 = r2.zzb
            int r3 = r3.zze
            r0 = 3
            if (r3 == r0) goto L37
            java.lang.String r3 = "Full screen 1px impression occurred"
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            com.google.android.gms.internal.ads.zzcys r3 = r2.zza
            r3.zza()
        L37:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzds(com.google.android.gms.internal.ads.zzbwm r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zze() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzf() {
            r0 = this;
            return
    }

    final /* synthetic */ void zzh() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzggh r0 = r2.zze     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto Lb
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return
        Lb:
            com.google.android.gms.internal.ads.zzggh r0 = r2.zze     // Catch: java.lang.Throwable -> L14
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L14
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzi() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final synchronized void zzj() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzggh r0 = r2.zze     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto Lb
            monitor-exit(r2)
            return
        Lb:
            java.util.concurrent.ScheduledFuture r0 = r2.zzf     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L13
            r1 = 1
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L1c
        L13:
            com.google.android.gms.internal.ads.zzggh r0 = r2.zze     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return
        L1c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzk() {
            r5 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r5.zzb
            int r0 = r0.zze
            r1 = 3
            if (r0 != r1) goto L8
            goto L4b
        L8:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbz
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.ads.zzfgh r0 = r5.zzb
            int r1 = r0.zzY
            r2 = 2
            if (r1 != r2) goto L4b
            int r0 = r0.zzq
            if (r0 != 0) goto L2b
            com.google.android.gms.internal.ads.zzcys r0 = r5.zza
            r0.zza()
            return
        L2b:
            com.google.android.gms.internal.ads.zzggh r0 = r5.zze
            com.google.android.gms.internal.ads.zzcww r1 = new com.google.android.gms.internal.ads.zzcww
            r1.<init>(r5)
            java.util.concurrent.Executor r2 = r5.zzd
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r2)
            java.util.concurrent.ScheduledExecutorService r0 = r5.zzc
            com.google.android.gms.internal.ads.zzcwv r1 = new com.google.android.gms.internal.ads.zzcwv
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzfgh r2 = r5.zzb
            int r2 = r2.zzq
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)
            r5.zzf = r0
        L4b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzl() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzggh r2 = r1.zze     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r2.isDone()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto Lb
            monitor-exit(r1)
            return
        Lb:
            java.util.concurrent.ScheduledFuture r2 = r1.zzf     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L13
            r0 = 1
            r2.cancel(r0)     // Catch: java.lang.Throwable -> L1f
        L13:
            com.google.android.gms.internal.ads.zzggh r2 = r1.zze     // Catch: java.lang.Throwable -> L1f
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            r2.zzd(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            return
        L1f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
