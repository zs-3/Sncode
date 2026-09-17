package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcpm implements com.google.android.gms.internal.ads.zzayv, com.google.android.gms.internal.ads.zzcyv, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzcyu {
    private final com.google.android.gms.internal.ads.zzcph zza;
    private final com.google.android.gms.internal.ads.zzcpi zzb;
    private final java.util.Set zzc;
    private final com.google.android.gms.internal.ads.zzboz zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.common.util.Clock zzf;
    private final java.util.concurrent.atomic.AtomicBoolean zzg;
    private final com.google.android.gms.internal.ads.zzcpl zzh;
    private boolean zzi;
    private java.lang.ref.WeakReference zzj;

    public zzcpm(com.google.android.gms.internal.ads.zzbow r3, com.google.android.gms.internal.ads.zzcpi r4, java.util.concurrent.Executor r5, com.google.android.gms.internal.ads.zzcph r6, com.google.android.gms.common.util.Clock r7) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.zzc = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zzg = r0
            com.google.android.gms.internal.ads.zzcpl r0 = new com.google.android.gms.internal.ads.zzcpl
            r0.<init>()
            r2.zzh = r0
            r2.zzi = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r2.zzj = r0
            r2.zza = r6
            com.google.android.gms.internal.ads.zzboh r6 = com.google.android.gms.internal.ads.zzbok.zza
            java.lang.String r0 = "google.afma.activeView.handleUpdate"
            com.google.android.gms.internal.ads.zzboz r3 = r3.zza(r0, r6, r6)
            r2.zzd = r3
            r2.zzb = r4
            r2.zze = r5
            r2.zzf = r7
            return
    }

    private final void zzk() {
            r3 = this;
            java.util.Set r0 = r3.zzc
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzcfo r1 = (com.google.android.gms.internal.ads.zzcfo) r1
            com.google.android.gms.internal.ads.zzcph r2 = r3.zza
            r2.zzf(r1)
            goto L6
        L18:
            com.google.android.gms.internal.ads.zzcph r0 = r3.zza
            r0.zze()
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdH() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcpl r0 = r2.zzh     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r0.zzb = r1     // Catch: java.lang.Throwable -> Lb
            r2.zzg()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final synchronized void zzdj(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcpl r2 = r1.zzh     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = "u"
            r2.zze = r0     // Catch: java.lang.Throwable -> L12
            r1.zzg()     // Catch: java.lang.Throwable -> L12
            r1.zzk()     // Catch: java.lang.Throwable -> L12
            r2 = 1
            r1.zzi = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdk() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcpl r0 = r2.zzh     // Catch: java.lang.Throwable -> Lb
            r1 = 1
            r0.zzb = r1     // Catch: java.lang.Throwable -> Lb
            r2.zzg()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final synchronized void zzdl(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcpl r2 = r1.zzh     // Catch: java.lang.Throwable -> Lb
            r0 = 1
            r2.zzb = r0     // Catch: java.lang.Throwable -> Lb
            r1.zzg()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final synchronized void zzdm(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcpl r2 = r1.zzh     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r2.zzb = r0     // Catch: java.lang.Throwable -> Lb
            r1.zzg()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final synchronized void zzdp(com.google.android.gms.internal.ads.zzayu r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcpl r0 = r2.zzh     // Catch: java.lang.Throwable -> Le
            boolean r1 = r3.zzj     // Catch: java.lang.Throwable -> Le
            r0.zza = r1     // Catch: java.lang.Throwable -> Le
            r0.zzf = r3     // Catch: java.lang.Throwable -> Le
            r2.zzg()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int r1) {
            r0 = this;
            return
    }

    public final synchronized void zzg() {
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference r0 = r5.zzj     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L5b
            boolean r0 = r5.zzi     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L59
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzg     // Catch: java.lang.Throwable -> L60
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L59
            com.google.android.gms.internal.ads.zzcpl r0 = r5.zzh     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            com.google.android.gms.common.util.Clock r1 = r5.zzf     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            long r1 = r1.elapsedRealtime()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            r0.zzd = r1     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzcpi r0 = r5.zzb     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzcpl r1 = r5.zzh     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            org.json.JSONObject r0 = r0.zza(r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            java.util.Set r1 = r5.zzc     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
        L2d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzcfo r2 = (com.google.android.gms.internal.ads.zzcfo) r2     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            java.util.concurrent.Executor r3 = r5.zze     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzcpk r4 = new com.google.android.gms.internal.ads.zzcpk     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            r4.<init>(r2, r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            r3.execute(r4)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            goto L2d
        L44:
            com.google.android.gms.internal.ads.zzboz r1 = r5.zzd     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            com.google.android.gms.internal.ads.zzcaq.zzb(r0, r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L60
            monitor-exit(r5)
            return
        L51:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r5)
            return
        L59:
            monitor-exit(r5)
            return
        L5b:
            r5.zzj()     // Catch: java.lang.Throwable -> L60
            monitor-exit(r5)
            return
        L60:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final synchronized void zzh(com.google.android.gms.internal.ads.zzcfo r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set r0 = r1.zzc     // Catch: java.lang.Throwable -> Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.ads.zzcph r0 = r1.zza     // Catch: java.lang.Throwable -> Ld
            r0.zzd(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final void zzi(java.lang.Object r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zzj = r0
            return
    }

    public final synchronized void zzj() {
            r1 = this;
            monitor-enter(r1)
            r1.zzk()     // Catch: java.lang.Throwable -> L9
            r0 = 1
            r1.zzi = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zzr() {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzg     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzcph r0 = r3.zza     // Catch: java.lang.Throwable -> L17
            r0.zzc(r3)     // Catch: java.lang.Throwable -> L17
            r3.zzg()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)
            return
        L15:
            monitor-exit(r3)
            return
        L17:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
