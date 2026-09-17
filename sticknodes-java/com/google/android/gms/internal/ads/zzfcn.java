package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfcn extends com.google.android.gms.ads.internal.client.zzbx implements com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzbai {
    protected com.google.android.gms.internal.ads.zzcql zza;
    private final com.google.android.gms.internal.ads.zzcho zzb;
    private final android.content.Context zzc;
    private java.util.concurrent.atomic.AtomicBoolean zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzfch zzf;
    private final com.google.android.gms.internal.ads.zzfcf zzg;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzh;
    private final com.google.android.gms.internal.ads.zzdud zzi;
    private long zzj;
    private com.google.android.gms.internal.ads.zzcpy zzk;

    public zzfcn(com.google.android.gms.internal.ads.zzcho r3, android.content.Context r4, java.lang.String r5, com.google.android.gms.internal.ads.zzfch r6, com.google.android.gms.internal.ads.zzfcf r7, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r8, com.google.android.gms.internal.ads.zzdud r9) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzd = r0
            r0 = -1
            r2.zzj = r0
            r2.zzb = r3
            r2.zzc = r4
            r2.zze = r5
            r2.zzf = r6
            r2.zzg = r7
            r2.zzh = r8
            r2.zzi = r9
            r7.zzm(r2)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdud zzh(com.google.android.gms.internal.ads.zzfcn r0) {
            com.google.android.gms.internal.ads.zzdud r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfcf zzm(com.google.android.gms.internal.ads.zzfcn r0) {
            com.google.android.gms.internal.ads.zzfcf r0 = r0.zzg
            return r0
    }

    private final synchronized void zzq(int r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzd     // Catch: java.lang.Throwable -> L40
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3e
            com.google.android.gms.internal.ads.zzfcf r0 = r5.zzg     // Catch: java.lang.Throwable -> L40
            r0.zzj()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzcpy r0 = r5.zzk     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L1b
            com.google.android.gms.internal.ads.zzazp r1 = com.google.android.gms.ads.internal.zzu.zzb()     // Catch: java.lang.Throwable -> L40
            r1.zze(r0)     // Catch: java.lang.Throwable -> L40
        L1b:
            com.google.android.gms.internal.ads.zzcql r0 = r5.zza     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L39
            long r0 = r5.zzj     // Catch: java.lang.Throwable -> L40
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            goto L34
        L28:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L40
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L40
            long r2 = r5.zzj     // Catch: java.lang.Throwable -> L40
            long r2 = r0 - r2
        L34:
            com.google.android.gms.internal.ads.zzcql r0 = r5.zza     // Catch: java.lang.Throwable -> L40
            r0.zze(r2, r6)     // Catch: java.lang.Throwable -> L40
        L39:
            r5.zzx()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r5)
            return
        L3e:
            monitor-exit(r5)
            return
        L40:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzs r1) {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = "setAdSize must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbar r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r1.zzg
            r0.zzo(r2)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfch r0 = r1.zzf
            r0.zzl(r2)
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
    public final synchronized void zzN(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(com.google.android.gms.internal.ads.zzbdq r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr r1) {
            r0 = this;
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
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzgb r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(com.google.android.gms.dynamic.IObjectWrapper r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfch r0 = r1.zzf     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.zza()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zza() {
            r1 = this;
            r0 = 3
            r1.zzq(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm r6) throws android.os.RemoteException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.zzb()     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            if (r0 == 0) goto L9
            goto L49
        L9:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzd     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.zzh     // Catch: java.lang.Throwable -> L8e
            int r2 = r2.clientJarVersion     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzkP     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8e
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8e
            if (r2 < r3) goto L44
            if (r0 != 0) goto L49
        L44:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L8e
        L49:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L8e
            android.content.Context r0 = r5.zzc     // Catch: java.lang.Throwable -> L8e
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzH(r0)     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L6b
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L59
            goto L6b
        L59:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r6)     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzfcf r6 = r5.zzg     // Catch: java.lang.Throwable -> L8e
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L8e
            r6.zzdB(r0)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r5)
            return r1
        L6b:
            boolean r0 = r5.zzZ()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L73
            monitor-exit(r5)
            return r1
        L73:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L8e
            r0.<init>()     // Catch: java.lang.Throwable -> L8e
            r5.zzd = r0     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzfcl r0 = new com.google.android.gms.internal.ads.zzfcl     // Catch: java.lang.Throwable -> L8e
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzfch r1 = r5.zzf     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r5.zze     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzfcm r3 = new com.google.android.gms.internal.ads.zzfcm     // Catch: java.lang.Throwable -> L8e
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L8e
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r5)
            return r6
        L8e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcq r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzcql r0 = r4.zza     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L6
            goto L33
        L6:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L35
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L35
            r4.zzj = r0     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzcql r0 = r4.zza     // Catch: java.lang.Throwable -> L35
            int r0 = r0.zza()     // Catch: java.lang.Throwable -> L35
            if (r0 <= 0) goto L33
            com.google.android.gms.internal.ads.zzcho r1 = r4.zzb     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzcpy r2 = new com.google.android.gms.internal.ads.zzcpy     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ScheduledExecutorService r1 = r1.zzD()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L35
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L35
            r4.zzk = r2     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzfck r1 = new com.google.android.gms.internal.ads.zzfck     // Catch: java.lang.Throwable -> L35
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L35
            r2.zzd(r0, r1)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)
            return
        L33:
            monitor-exit(r4)
            return
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdt() {
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzcql r0 = r5.zza     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L16
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L18
            long r1 = r1.elapsedRealtime()     // Catch: java.lang.Throwable -> L18
            long r3 = r5.zzj     // Catch: java.lang.Throwable -> L18
            long r1 = r1 - r3
            r3 = 1
            r0.zze(r1, r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r5)
            return
        L16:
            monitor-exit(r5)
            return
        L18:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int r3) {
            r2 = this;
            if (r3 == 0) goto L1f
            int r3 = r3 + (-1)
            r0 = 2
            if (r3 == 0) goto L1b
            r1 = 1
            if (r3 == r1) goto L16
            if (r3 == r0) goto L11
            r3 = 6
            r2.zzq(r3)
            return
        L11:
            r3 = 3
            r2.zzq(r3)
            return
        L16:
            r3 = 4
            r2.zzq(r3)
            return
        L1b:
            r2.zzq(r0)
            return
        L1f:
            r3 = 0
            throw r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzs zzg() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzl() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() {
            r1 = this;
            r0 = 0
            return r0
    }

    final /* synthetic */ void zzo() {
            r1 = this;
            r0 = 5
            r1.zzq(r0)
            return
    }

    public final void zzp() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcho r0 = r2.zzb
            java.util.concurrent.Executor r0 = r0.zzC()
            com.google.android.gms.internal.ads.zzfcj r1 = new com.google.android.gms.internal.ads.zzfcj
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzr() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.zze     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzs() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzt() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.ads.zzcql r0 = r1.zza     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lf
            r0.zzb()     // Catch: java.lang.Throwable -> L11
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
    public final void zzy(com.google.android.gms.ads.internal.client.zzm r1, com.google.android.gms.ads.internal.client.zzbo r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
