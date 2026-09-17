package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzenh extends com.google.android.gms.ads.internal.client.zzbx implements com.google.android.gms.internal.ads.zzdam {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfct zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzeob zzd;
    private com.google.android.gms.ads.internal.client.zzs zze;
    private final com.google.android.gms.internal.ads.zzfha zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzdud zzh;
    private com.google.android.gms.internal.ads.zzcqr zzi;

    public zzenh(android.content.Context r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, com.google.android.gms.internal.ads.zzfct r4, com.google.android.gms.internal.ads.zzeob r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6, com.google.android.gms.internal.ads.zzdud r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r4
            r0.zze = r2
            r0.zzc = r3
            r0.zzd = r5
            com.google.android.gms.internal.ads.zzfha r1 = r4.zzg()
            r0.zzf = r1
            r0.zzg = r6
            r0.zzh = r7
            r4.zzp(r0)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcqr zzc(com.google.android.gms.internal.ads.zzenh r0) {
            com.google.android.gms.internal.ads.zzcqr r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzenh r0, com.google.android.gms.internal.ads.zzcqr r1) {
            r0.zzi = r1
            return
    }

    private final synchronized void zzf(com.google.android.gms.ads.internal.client.zzs r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfha r0 = r1.zzf     // Catch: java.lang.Throwable -> L11
            r0.zzs(r2)     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.ads.internal.client.zzs r2 = r1.zze     // Catch: java.lang.Throwable -> L11
            boolean r2 = r2.zzn     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.ads.zzfha r0 = r1.zzf     // Catch: java.lang.Throwable -> L11
            r0.zzy(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private final synchronized boolean zzh(com.google.android.gms.ads.internal.client.zzm r5) throws android.os.RemoteException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.zzm()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto Lc
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L46
        Lc:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L46
            android.content.Context r0 = r4.zza     // Catch: java.lang.Throwable -> L46
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzH(r0)     // Catch: java.lang.Throwable -> L46
            r1 = 0
            if (r0 == 0) goto L30
            com.google.android.gms.ads.internal.client.zzc r0 = r5.zzs     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L30
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r5)     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzeob r5 = r4.zzd     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L2d
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zzd(r0, r1, r1)     // Catch: java.lang.Throwable -> L46
            r5.zzdB(r0)     // Catch: java.lang.Throwable -> L46
        L2d:
            r5 = 0
            monitor-exit(r4)
            return r5
        L30:
            android.content.Context r0 = r4.zza     // Catch: java.lang.Throwable -> L46
            boolean r2 = r5.zzf     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzfhz.zza(r0, r2)     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzfct r0 = r4.zzb     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r4.zzc     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzeng r3 = new com.google.android.gms.internal.ads.zzeng     // Catch: java.lang.Throwable -> L46
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L46
            boolean r5 = r0.zzb(r5, r2, r1, r3)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r4)
            return r5
        L46:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private final boolean zzm() {
            r6 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzf
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r6.zzg
            int r3 = r3.clientJarVersion
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzkP
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "recordManualImpression must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzi     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lf
            r0.zzh()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        Lf:
            monitor-exit(r1)
            return
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzh     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkK     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkQ     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcqr r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzcyz r0 = r0.zzn()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi r2) {
            r1 = this;
            boolean r0 = r1.zzm()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "setAdListener must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
        Lb:
            com.google.android.gms.internal.ads.zzfct r0 = r1.zzb
            r0.zzo(r2)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl r2) {
            r1 = this;
            boolean r0 = r1.zzm()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "setAdListener must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
        Lb:
            com.google.android.gms.internal.ads.zzeob r0 = r1.zzd
            r0.zzj(r2)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc r1) {
            r0 = this;
            java.lang.String r1 = "setAdMetadataListener must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzs r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "setAdSize must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzfha r0 = r2.zzf     // Catch: java.lang.Throwable -> L1e
            r0.zzs(r3)     // Catch: java.lang.Throwable -> L1e
            r2.zze = r3     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzcqr r0 = r2.zzi     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.ads.zzfct r1 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            android.view.ViewGroup r1 = r1.zzc()     // Catch: java.lang.Throwable -> L1e
            r0.zzi(r1, r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm r2) {
            r1 = this;
            boolean r0 = r1.zzm()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "setAppEventListener must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
        Lb:
            com.google.android.gms.internal.ads.zzeob r0 = r1.zzd
            r0.zzm(r2)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbar r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(com.google.android.gms.internal.ads.zzbtv r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzN(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzm()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lc
            java.lang.String r0 = "setManualImpressionsEnabled must be called from the main thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L13
        Lc:
            com.google.android.gms.internal.ads.zzfha r0 = r1.zzf     // Catch: java.lang.Throwable -> L13
            r0.zzB(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(com.google.android.gms.internal.ads.zzbdq r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "setOnCustomRenderedAdLoadedListener must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.ads.zzfct r0 = r1.zzb     // Catch: java.lang.Throwable -> Ld
            r0.zzq(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr r3) {
            r2 = this;
            boolean r0 = r2.zzm()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "setPaidEventListener must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
        Lb:
            boolean r0 = r3.zzf()     // Catch: android.os.RemoteException -> L17
            if (r0 != 0) goto L1d
            com.google.android.gms.internal.ads.zzdud r0 = r2.zzh     // Catch: android.os.RemoteException -> L17
            r0.zze()     // Catch: android.os.RemoteException -> L17
            goto L1d
        L17:
            r0 = move-exception
            java.lang.String r1 = "Error in making CSI ping for reporting paid event callback"
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r1, r0)
        L1d:
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzd
            r0.zzl(r3)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(com.google.android.gms.internal.ads.zzbty r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(com.google.android.gms.internal.ads.zzbws r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzgb r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzm()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lc
            java.lang.String r0 = "setVideoOptions must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L13
        Lc:
            com.google.android.gms.internal.ads.zzfha r0 = r1.zzf     // Catch: java.lang.Throwable -> L13
            r0.zzI(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(com.google.android.gms.dynamic.IObjectWrapper r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzi     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.zzs()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            r0 = 1
        Lc:
            monitor-exit(r1)
            return r0
        Le:
            r0 = 0
            goto Lc
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfct r0 = r1.zzb     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.zza()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdam
    public final synchronized void zza() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfct r0 = r2.zzb     // Catch: java.lang.Throwable -> L58
            boolean r0 = r0.zzt()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L51
            com.google.android.gms.internal.ads.zzfha r0 = r2.zzf     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.ads.internal.client.zzs r0 = r0.zzh()     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.ads.zzcqr r1 = r2.zzi     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L31
            com.google.android.gms.internal.ads.zzfgi r1 = r1.zzg()     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L31
            com.google.android.gms.internal.ads.zzfha r1 = r2.zzf     // Catch: java.lang.Throwable -> L58
            boolean r1 = r1.zzT()     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L31
            android.content.Context r0 = r2.zza     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.ads.zzcqr r1 = r2.zzi     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.ads.zzfgi r1 = r1.zzg()     // Catch: java.lang.Throwable -> L58
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.ads.internal.client.zzs r0 = com.google.android.gms.internal.ads.zzfhi.zza(r0, r1)     // Catch: java.lang.Throwable -> L58
        L31:
            r2.zzf(r0)     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.ads.zzfha r0 = r2.zzf     // Catch: java.lang.Throwable -> L58
            r1 = 1
            r0.zzx(r1)     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.ads.zzfha r0 = r2.zzf     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L58
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzf()     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L58
            r2.zzh(r0)     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L58
            goto L49
        L44:
            java.lang.String r0 = "Failed to refresh the banner ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L58
        L49:
            com.google.android.gms.internal.ads.zzfha r0 = r2.zzf     // Catch: java.lang.Throwable -> L58
            r1 = 0
            r0.zzx(r1)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r2)
            return
        L51:
            com.google.android.gms.internal.ads.zzfct r0 = r2.zzb     // Catch: java.lang.Throwable -> L58
            r0.zzm()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r2)
            return
        L58:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.client.zzs r0 = r1.zze     // Catch: java.lang.Throwable -> Lc
            r1.zzf(r0)     // Catch: java.lang.Throwable -> Lc
            boolean r2 = r1.zzh(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r2
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcq r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "setCorrelationIdProvider must be called on the main UI thread"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.ads.zzfha r0 = r1.zzf     // Catch: java.lang.Throwable -> Ld
            r0.zzV(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzdam
    public final synchronized void zzb() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfct r0 = r1.zzb     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.zzt()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.zzfct r0 = r1.zzb     // Catch: java.lang.Throwable -> L17
            r0.zzr()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L10:
            com.google.android.gms.internal.ads.zzfct r0 = r1.zzb     // Catch: java.lang.Throwable -> L17
            r0.zzn()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() {
            r1 = this;
            java.lang.String r0 = "getAdMetadata must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzs zzg() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "getAdSize must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzcqr r0 = r2.zzi     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1a
            android.content.Context r1 = r2.zza     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzfgi r0 = r0.zzf()     // Catch: java.lang.Throwable -> L22
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.ads.internal.client.zzs r0 = com.google.android.gms.internal.ads.zzfhi.zza(r1, r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            return r0
        L1a:
            com.google.android.gms.internal.ads.zzfha r0 = r2.zzf     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.ads.internal.client.zzs r0 = r0.zzh()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            return r0
        L22:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r1.zzd
            com.google.android.gms.ads.internal.client.zzbl r0 = r0.zzg()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
            r1 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r1.zzd
            com.google.android.gms.ads.internal.client.zzcm r0 = r0.zzi()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgy     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L14
            goto L1e
        L14:
            com.google.android.gms.internal.ads.zzcqr r0 = r2.zzi     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1e
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)
            return r0
        L1e:
            r0 = 0
            monitor-exit(r2)
            return r0
        L21:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzl() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "getVideoController must be called from the main thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzi     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zze()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r0
        L10:
            r0 = 0
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() {
            r1 = this;
            boolean r0 = r1.zzm()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "getAdFrame must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
        Lb:
            com.google.android.gms.internal.ads.zzfct r0 = r1.zzb
            android.view.ViewGroup r0 = r0.zzc()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzr() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.zzc     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzs() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcqr r0 = r2.zzi     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzcxt r1 = r0.zzm()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L15
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = r0.zzg()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return r0
        L15:
            r0 = 0
            monitor-exit(r2)
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzt() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcqr r0 = r2.zzi     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzcxt r1 = r0.zzm()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L15
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = r0.zzg()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return r0
        L15:
            r0 = 0
            monitor-exit(r2)
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zze     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkL     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L47
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkQ     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L47
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L47
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L47
        L3c:
            com.google.android.gms.internal.ads.zzcqr r0 = r3.zzi     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L45
            r0.zzb()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm r1, com.google.android.gms.ads.internal.client.zzbo r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzg     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkM     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkQ     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcqr r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzcyz r0 = r0.zzn()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
