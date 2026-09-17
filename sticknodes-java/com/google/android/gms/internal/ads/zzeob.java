package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeob implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.internal.ads.zzday, com.google.android.gms.internal.ads.zzczo, com.google.android.gms.internal.ads.zzcyd, com.google.android.gms.internal.ads.zzcyu, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzcya, com.google.android.gms.internal.ads.zzdal, com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzdga {
    final com.google.android.gms.internal.ads.zzdud zza;
    final java.util.concurrent.BlockingQueue zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd;
    private final java.util.concurrent.atomic.AtomicReference zze;
    private final java.util.concurrent.atomic.AtomicReference zzf;
    private final java.util.concurrent.atomic.AtomicReference zzg;
    private final java.util.concurrent.atomic.AtomicBoolean zzh;
    private final java.util.concurrent.atomic.AtomicBoolean zzi;
    private final java.util.concurrent.atomic.AtomicBoolean zzj;

    public zzeob(com.google.android.gms.internal.ads.zzdud r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.zzc = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.zzd = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.zze = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.zzf = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.zzg = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r3.zzh = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r3.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r3.zzj = r0
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziu
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.<init>(r1)
            r3.zzb = r0
            r3.zza = r4
            return
    }

    private final void zzo() {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zzi
            boolean r0 = r0.get()
            if (r0 == 0) goto L39
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zzj
            boolean r0 = r0.get()
            if (r0 != 0) goto L11
            goto L39
        L11:
            java.util.concurrent.BlockingQueue r0 = r4.zzb
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.util.concurrent.atomic.AtomicReference r2 = r4.zzd
            com.google.android.gms.internal.ads.zzenm r3 = new com.google.android.gms.internal.ads.zzenm
            r3.<init>(r1)
            com.google.android.gms.internal.ads.zzfdm.zza(r2, r3)
            goto L17
        L2e:
            java.util.concurrent.BlockingQueue r0 = r4.zzb
            r0.clear()
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zzh
            r1 = 0
            r0.set(r1)
        L39:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkr
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1c
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzc
            com.google.android.gms.internal.ads.zzenz r1 = new com.google.android.gms.internal.ads.zzenz
            r1.<init>()
            com.google.android.gms.internal.ads.zzfdm.zza(r0, r1)
        L1c:
            return
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzh     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L3b
            java.util.concurrent.BlockingQueue r0 = r3.zzb     // Catch: java.lang.Throwable -> L47
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.Throwable -> L47
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.offer(r1)     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L39
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzdud r0 = r3.zza     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L39
            com.google.android.gms.internal.ads.zzduc r0 = r0.zza()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "action"
            java.lang.String r2 = "dae_action"
            r0.zzb(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "dae_name"
            r0.zzb(r1, r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "dae_data"
            r0.zzb(r4, r5)     // Catch: java.lang.Throwable -> L47
            r0.zzf()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L39:
            monitor-exit(r3)
            return
        L3b:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzent r1 = new com.google.android.gms.internal.ads.zzent     // Catch: java.lang.Throwable -> L47
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzfdm.zza(r0, r1)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L47:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzenj r0 = new com.google.android.gms.internal.ads.zzenj
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzc
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            com.google.android.gms.internal.ads.zzenk r0 = new com.google.android.gms.internal.ads.zzenk
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzg
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzenu r0 = new com.google.android.gms.internal.ads.zzenu
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzc
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzenw r0 = new com.google.android.gms.internal.ads.zzenw
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzc
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            com.google.android.gms.internal.ads.zzenx r0 = new com.google.android.gms.internal.ads.zzenx
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzg
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            com.google.android.gms.internal.ads.zzeny r0 = new com.google.android.gms.internal.ads.zzeny
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzg
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzdB(com.google.android.gms.ads.internal.client.zze r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzenn r0 = new com.google.android.gms.internal.ads.zzenn
            r0.<init>(r3)
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzc
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            com.google.android.gms.internal.ads.zzeno r0 = new com.google.android.gms.internal.ads.zzeno
            r0.<init>(r3)
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzc
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            com.google.android.gms.internal.ads.zzenp r0 = new com.google.android.gms.internal.ads.zzenp
            r0.<init>(r3)
            java.util.concurrent.atomic.AtomicReference r3 = r2.zzf
            com.google.android.gms.internal.ads.zzfdm.zza(r3, r0)
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzh
            r0 = 0
            r3.set(r0)
            java.util.concurrent.BlockingQueue r3 = r2.zzb
            r3.clear()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdG() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkr
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1c
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzc
            com.google.android.gms.internal.ads.zzenz r1 = new com.google.android.gms.internal.ads.zzenz
            r1.<init>()
            com.google.android.gms.internal.ads.zzfdm.zza(r0, r1)
        L1c:
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzg
            com.google.android.gms.internal.ads.zzenl r1 = new com.google.android.gms.internal.ads.zzenl
            r1.<init>()
            com.google.android.gms.internal.ads.zzfdm.zza(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzenv r0 = new com.google.android.gms.internal.ads.zzenv
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzc
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(com.google.android.gms.internal.ads.zzbwa r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(com.google.android.gms.internal.ads.zzfgt r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.zzh
            r0 = 1
            r2.set(r0)
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.zzj
            r0 = 0
            r2.set(r0)
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

    public final synchronized com.google.android.gms.ads.internal.client.zzbl zzg() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzc     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb
            com.google.android.gms.ads.internal.client.zzbl r0 = (com.google.android.gms.ads.internal.client.zzbl) r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdal
    public final void zzh(com.google.android.gms.ads.internal.client.zzu r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeoa r0 = new com.google.android.gms.internal.ads.zzeoa
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r1.zze
            com.google.android.gms.internal.ads.zzfdm.zza(r2, r0)
            return
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcm zzi() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzd     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb
            com.google.android.gms.ads.internal.client.zzcm r0 = (com.google.android.gms.ads.internal.client.zzcm) r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbl r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzc
            r0.set(r2)
            return
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbo r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzf
            r0.set(r2)
            return
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdr r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zze
            r0.set(r2)
            return
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcm r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzd
            r0.set(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.zzi
            r0 = 1
            r2.set(r0)
            r1.zzo()
            return
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzct r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzg
            r0.set(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzq(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzens r0 = new com.google.android.gms.internal.ads.zzens
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r1.zzg
            com.google.android.gms.internal.ads.zzfdm.zza(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeni r0 = new com.google.android.gms.internal.ads.zzeni
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzc
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final synchronized void zzs() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzenq r0 = new com.google.android.gms.internal.ads.zzenq     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzc     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzenr r0 = new com.google.android.gms.internal.ads.zzenr     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzf     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfdm.zza(r1, r0)     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzj     // Catch: java.lang.Throwable -> L20
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Throwable -> L20
            r2.zzo()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
