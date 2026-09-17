package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfge extends com.google.android.gms.internal.ads.zzbwo {
    private final com.google.android.gms.internal.ads.zzffu zza;
    private final com.google.android.gms.internal.ads.zzffk zzb;
    private final com.google.android.gms.internal.ads.zzfgu zzc;
    private com.google.android.gms.internal.ads.zzdqi zzd;
    private boolean zze;

    public zzfge(com.google.android.gms.internal.ads.zzffu r2, com.google.android.gms.internal.ads.zzffk r3, com.google.android.gms.internal.ads.zzfgu r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zze = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdqi zzv(com.google.android.gms.internal.ads.zzfge r0) {
            com.google.android.gms.internal.ads.zzdqi r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgu zzw(com.google.android.gms.internal.ads.zzfge r0) {
            com.google.android.gms.internal.ads.zzfgu r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ void zzx(com.google.android.gms.internal.ads.zzfge r0, com.google.android.gms.internal.ads.zzdqi r1) {
            r0.zzd = r1
            return
    }

    private final synchronized boolean zzy() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzd     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.zze()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
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

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final android.os.Bundle zzb() {
            r1 = this;
            java.lang.String r0 = "getAdMetadata can only be called from the UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzd
            if (r0 == 0) goto Le
            android.os.Bundle r0 = r0.zza()
            goto L13
        Le:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L13:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzc() throws android.os.RemoteException {
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
            com.google.android.gms.internal.ads.zzdqi r0 = r2.zzd     // Catch: java.lang.Throwable -> L21
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

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized java.lang.String zzd() throws android.os.RemoteException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdqi r0 = r2.zzd     // Catch: java.lang.Throwable -> L18
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

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zze() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            r1.zzf(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzf(com.google.android.gms.dynamic.IObjectWrapper r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzffk r0 = r2.zzb     // Catch: java.lang.Throwable -> L27
            r1 = 0
            r0.zzg(r1)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzdqi r0 = r2.zzd     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L25
            if (r3 != 0) goto L13
            goto L1a
        L13:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: java.lang.Throwable -> L27
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L27
        L1a:
            com.google.android.gms.internal.ads.zzdqi r3 = r2.zzd     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzcyz r3 = r3.zzn()     // Catch: java.lang.Throwable -> L27
            r3.zza(r1)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)
            return
        L25:
            monitor-exit(r2)
            return
        L27:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbwt r5) throws android.os.RemoteException {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfj     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L2a
            if (r0 != 0) goto L19
            goto L2a
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L62
            if (r0 == 0) goto L2a
            goto L42
        L20:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L62
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L62
        L2a:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L44
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfl     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L44
        L42:
            monitor-exit(r4)
            return
        L44:
            com.google.android.gms.internal.ads.zzffm r0 = new com.google.android.gms.internal.ads.zzffm     // Catch: java.lang.Throwable -> L62
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r4.zzd = r1     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzffu r1 = r4.zza     // Catch: java.lang.Throwable -> L62
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzffu r1 = r4.zza     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzfgc r3 = new com.google.android.gms.internal.ads.zzfgc     // Catch: java.lang.Throwable -> L62
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L62
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r4)
            return
        L62:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzh() {
            r1 = this;
            r0 = 0
            r1.zzi(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzi(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzd     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1f
            if (r2 != 0) goto Le
            r2 = 0
            goto L14
        Le:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L21
        L14:
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzd     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.ads.zzcyz r0 = r0.zzn()     // Catch: java.lang.Throwable -> L21
            r0.zzb(r2)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)
            return
        L1f:
            monitor-exit(r1)
            return
        L21:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj() {
            r1 = this;
            r0 = 0
            r1.zzk(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzk(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzd     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1f
            if (r2 != 0) goto Le
            r2 = 0
            goto L14
        Le:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L21
        L14:
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzd     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.ads.zzcyz r0 = r0.zzn()     // Catch: java.lang.Throwable -> L21
            r0.zzc(r2)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)
            return
        L1f:
            monitor-exit(r1)
            return
        L21:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(com.google.android.gms.ads.internal.client.zzcc r3) {
            r2 = this;
            java.lang.String r0 = "setAdMetadataListener can only be called from the UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            if (r3 != 0) goto Le
            com.google.android.gms.internal.ads.zzffk r3 = r2.zzb
            r0 = 0
            r3.zzg(r0)
            return
        Le:
            com.google.android.gms.internal.ads.zzffk r0 = r2.zzb
            com.google.android.gms.internal.ads.zzfgd r1 = new com.google.android.gms.internal.ads.zzfgd
            r1.<init>(r2, r3)
            r0.zzg(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzm(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "#008 Must be called on the main UI thread.: setCustomData"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> Lc
            com.google.android.gms.internal.ads.zzfgu r0 = r1.zzc     // Catch: java.lang.Throwable -> Lc
            r0.zzb = r2     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzn(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "setImmersiveMode must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> La
            r1.zze = r2     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzo(com.google.android.gms.internal.ads.zzbws r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "setRewardedVideoAdListener can only be called from the UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzffk r0 = r1.zzb
            r0.zzm(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzp(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "setUserId must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> Lc
            com.google.android.gms.internal.ads.zzfgu r0 = r1.zzc     // Catch: java.lang.Throwable -> Lc
            r0.zza = r2     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzq() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.zzr(r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzr(com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzdqi r0 = r2.zzd     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L22
            r0 = 0
            if (r3 != 0) goto Le
            goto L19
        Le:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: java.lang.Throwable -> L24
            boolean r1 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L19
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L24
        L19:
            com.google.android.gms.internal.ads.zzdqi r3 = r2.zzd     // Catch: java.lang.Throwable -> L24
            boolean r1 = r2.zze     // Catch: java.lang.Throwable -> L24
            r3.zzh(r1, r0)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return
        L22:
            monitor-exit(r2)
            return
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzs() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "isLoaded must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            boolean r0 = r1.zzy()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzt() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzd
            if (r0 == 0) goto Lc
            boolean r0 = r0.zzg()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzu(com.google.android.gms.internal.ads.zzbwn r2) {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread.: setRewardedAdSkuListener"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzffk r0 = r1.zzb
            r0.zzn(r2)
            return
    }
}
