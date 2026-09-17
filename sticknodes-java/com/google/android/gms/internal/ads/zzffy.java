package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzffy extends com.google.android.gms.internal.ads.zzbxe {
    private final com.google.android.gms.internal.ads.zzffu zza;
    private final com.google.android.gms.internal.ads.zzffk zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzfgu zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzavn zzg;
    private final com.google.android.gms.internal.ads.zzdud zzh;
    private com.google.android.gms.internal.ads.zzdqi zzi;
    private boolean zzj;

    public zzffy(java.lang.String r1, com.google.android.gms.internal.ads.zzffu r2, android.content.Context r3, com.google.android.gms.internal.ads.zzffk r4, com.google.android.gms.internal.ads.zzfgu r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6, com.google.android.gms.internal.ads.zzavn r7, com.google.android.gms.internal.ads.zzdud r8) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zza = r2
            r0.zzb = r4
            r0.zzd = r5
            r0.zze = r3
            r0.zzf = r6
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzaI
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zzj = r1
            r0.zzg = r7
            r0.zzh = r8
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdqi zzr(com.google.android.gms.internal.ads.zzffy r0) {
            com.google.android.gms.internal.ads.zzdqi r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgu zzs(com.google.android.gms.internal.ads.zzffy r0) {
            com.google.android.gms.internal.ads.zzfgu r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ void zzt(com.google.android.gms.internal.ads.zzffy r0, com.google.android.gms.internal.ads.zzdqi r1) {
            r0.zzi = r1
            return
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzm r5, com.google.android.gms.internal.ads.zzbxm r6, int r7) throws android.os.RemoteException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r5.zzb()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8
            goto L47
        L8:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzk     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            if (r0 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L2a
            r1 = 1
        L2a:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r4.zzf     // Catch: java.lang.Throwable -> L8c
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzkP     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L8c
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L8c
            if (r0 < r2) goto L42
            if (r1 != 0) goto L47
        L42:
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L8c
        L47:
            com.google.android.gms.internal.ads.zzffk r0 = r4.zzb     // Catch: java.lang.Throwable -> L8c
            r0.zzk(r6)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L8c
            android.content.Context r6 = r4.zze     // Catch: java.lang.Throwable -> L8c
            boolean r6 = com.google.android.gms.ads.internal.util.zzt.zzH(r6)     // Catch: java.lang.Throwable -> L8c
            r0 = 0
            if (r6 == 0) goto L6e
            com.google.android.gms.ads.internal.client.zzc r6 = r5.zzs     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L5d
            goto L6e
        L5d:
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r5)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzffk r5 = r4.zzb     // Catch: java.lang.Throwable -> L8c
            r6 = 4
            com.google.android.gms.ads.internal.client.zze r6 = com.google.android.gms.internal.ads.zzfie.zzd(r6, r0, r0)     // Catch: java.lang.Throwable -> L8c
            r5.zzdB(r6)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r4)
            return
        L6e:
            com.google.android.gms.internal.ads.zzdqi r6 = r4.zzi     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L74
            monitor-exit(r4)
            return
        L74:
            com.google.android.gms.internal.ads.zzffm r6 = new com.google.android.gms.internal.ads.zzffm     // Catch: java.lang.Throwable -> L8c
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzffu r0 = r4.zza     // Catch: java.lang.Throwable -> L8c
            r0.zzj(r7)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzffu r7 = r4.zza     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = r4.zzc     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzffx r1 = new com.google.android.gms.internal.ads.zzffx     // Catch: java.lang.Throwable -> L8c
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L8c
            r7.zzb(r5, r0, r6, r1)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r4)
            return
        L8c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final android.os.Bundle zzb() {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzi
            if (r0 == 0) goto Le
            android.os.Bundle r0 = r0.zza()
            goto L13
        Le:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L13:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final com.google.android.gms.ads.internal.client.zzdy zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgy
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            goto L1c
        L13:
            com.google.android.gms.internal.ads.zzdqi r0 = r2.zzi
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final com.google.android.gms.internal.ads.zzbxc zzd() {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzi
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzbxc r0 = r0.zzc()
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final synchronized java.lang.String zze() throws android.os.RemoteException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdqi r0 = r2.zzi     // Catch: java.lang.Throwable -> L18
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

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzm r2, com.google.android.gms.internal.ads.zzbxm r3) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            r0 = 2
            r1.zzu(r2, r3, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzm r2, com.google.android.gms.internal.ads.zzbxm r3) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            r0 = 3
            r1.zzu(r2, r3, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final synchronized void zzh(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "setImmersiveMode must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> La
            r1.zzj = r2     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo r3) {
            r2 = this;
            if (r3 != 0) goto L9
            com.google.android.gms.internal.ads.zzffk r3 = r2.zzb
            r0 = 0
            r3.zzg(r0)
            return
        L9:
            com.google.android.gms.internal.ads.zzffk r0 = r2.zzb
            com.google.android.gms.internal.ads.zzffw r1 = new com.google.android.gms.internal.ads.zzffw
            r1.<init>(r2, r3)
            r0.zzg(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr r3) {
            r2 = this;
            java.lang.String r0 = "setOnPaidEventListener must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            boolean r0 = r3.zzf()     // Catch: android.os.RemoteException -> L11
            if (r0 != 0) goto L17
            com.google.android.gms.internal.ads.zzdud r0 = r2.zzh     // Catch: android.os.RemoteException -> L11
            r0.zze()     // Catch: android.os.RemoteException -> L11
            goto L17
        L11:
            r0 = move-exception
            java.lang.String r1 = "Error in making CSI ping for reporting paid event callback"
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r1, r0)
        L17:
            com.google.android.gms.internal.ads.zzffk r0 = r2.zzb
            r0.zzi(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzk(com.google.android.gms.internal.ads.zzbxi r2) {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzffk r0 = r1.zzb
            r0.zzj(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final synchronized void zzl(com.google.android.gms.internal.ads.zzbxt r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.zzfgu r0 = r2.zzd     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r3.zza     // Catch: java.lang.Throwable -> L12
            r0.zza = r1     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L12
            r0.zzb = r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final synchronized void zzm(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzj     // Catch: java.lang.Throwable -> L8
            r1.zzn(r2, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final synchronized void zzn(com.google.android.gms.dynamic.IObjectWrapper r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.ads.zzdqi r0 = r2.zzi     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L1d
            java.lang.String r3 = "Rewarded can not be shown before loaded"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.ads.zzffk r3 = r2.zzb     // Catch: java.lang.Throwable -> L4e
            r4 = 9
            r0 = 0
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfie.zzd(r4, r0, r0)     // Catch: java.lang.Throwable -> L4e
            r3.zzq(r4)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)
            return
        L1d:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcJ     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L41
            com.google.android.gms.internal.ads.zzavn r0 = r2.zzg     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.ads.zzavi r0 = r0.zzc()     // Catch: java.lang.Throwable -> L4e
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()     // Catch: java.lang.Throwable -> L4e
            r0.zzn(r1)     // Catch: java.lang.Throwable -> L4e
        L41:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.ads.zzdqi r0 = r2.zzi     // Catch: java.lang.Throwable -> L4e
            r0.zzh(r4, r3)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)
            return
        L4e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final boolean zzo() {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzdqi r0 = r1.zzi
            if (r0 == 0) goto L11
            boolean r0 = r0.zzf()
            if (r0 != 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzp(com.google.android.gms.internal.ads.zzbxn r2) {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzffk r0 = r1.zzb
            r0.zzo(r2)
            return
    }
}
