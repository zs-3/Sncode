package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzfbp implements com.google.android.gms.internal.ads.zzeor {
    protected final com.google.android.gms.internal.ads.zzcho zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.ads.zzfcf zzd;
    private final com.google.android.gms.internal.ads.zzfdy zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final android.view.ViewGroup zzg;
    private final com.google.android.gms.internal.ads.zzfmd zzh;
    private final com.google.android.gms.internal.ads.zzfha zzi;
    private com.google.common.util.concurrent.ListenableFuture zzj;

    protected zzfbp(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.internal.ads.zzcho r3, com.google.android.gms.internal.ads.zzfdy r4, com.google.android.gms.internal.ads.zzfcf r5, com.google.android.gms.internal.ads.zzfha r6, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r7) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zza = r3
            r0.zze = r4
            r0.zzd = r5
            r0.zzi = r6
            r0.zzf = r7
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r1)
            r0.zzg = r2
            com.google.android.gms.internal.ads.zzfmd r1 = r3.zzz()
            r0.zzh = r1
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzcxg zzc(com.google.android.gms.internal.ads.zzfbp r0, com.google.android.gms.internal.ads.zzfdw r1) {
            com.google.android.gms.internal.ads.zzcxg r0 = r0.zzm(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcxg zzd(com.google.android.gms.internal.ads.zzfbp r0, com.google.android.gms.internal.ads.zzfdw r1) {
            com.google.android.gms.internal.ads.zzcxg r0 = r0.zzm(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfcf zzf(com.google.android.gms.internal.ads.zzfbp r0) {
            com.google.android.gms.internal.ads.zzfcf r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfdy zzg(com.google.android.gms.internal.ads.zzfbp r0) {
            com.google.android.gms.internal.ads.zzfdy r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfmd zzh(com.google.android.gms.internal.ads.zzfbp r0) {
            com.google.android.gms.internal.ads.zzfmd r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzi(com.google.android.gms.internal.ads.zzfbp r0) {
            java.util.concurrent.Executor r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzfbp r0, com.google.common.util.concurrent.ListenableFuture r1) {
            r1 = 0
            r0.zzj = r1
            return
    }

    private final synchronized com.google.android.gms.internal.ads.zzcxg zzm(com.google.android.gms.internal.ads.zzfdw r5) {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzfbo r5 = (com.google.android.gms.internal.ads.zzfbo) r5     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhN     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L4c
            android.view.ViewGroup r0 = r4.zzg     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzcqo r1 = new com.google.android.gms.internal.ads.zzcqo     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzcxi r0 = new com.google.android.gms.internal.ads.zzcxi     // Catch: java.lang.Throwable -> L9c
            r0.<init>()     // Catch: java.lang.Throwable -> L9c
            android.content.Context r2 = r4.zzb     // Catch: java.lang.Throwable -> L9c
            r0.zze(r2)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzfhc r5 = r5.zza     // Catch: java.lang.Throwable -> L9c
            r0.zzi(r5)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzcxk r5 = r0.zzj()     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzdds r0 = new com.google.android.gms.internal.ads.zzdds     // Catch: java.lang.Throwable -> L9c
            r0.<init>()     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzfcf r2 = r4.zzd     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.Executor r3 = r4.zzc     // Catch: java.lang.Throwable -> L9c
            r0.zzc(r2, r3)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzfcf r2 = r4.zzd     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.Executor r3 = r4.zzc     // Catch: java.lang.Throwable -> L9c
            r0.zzl(r2, r3)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzddu r0 = r0.zzn()     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzcxg r5 = r4.zze(r1, r5, r0)     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r4)
            return r5
        L4c:
            com.google.android.gms.internal.ads.zzfcf r0 = r4.zzd     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzfcf r0 = com.google.android.gms.internal.ads.zzfcf.zzi(r0)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzdds r1 = new com.google.android.gms.internal.ads.zzdds     // Catch: java.lang.Throwable -> L9c
            r1.<init>()     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.Executor r2 = r4.zzc     // Catch: java.lang.Throwable -> L9c
            r1.zzb(r0, r2)     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.Executor r2 = r4.zzc     // Catch: java.lang.Throwable -> L9c
            r1.zzg(r0, r2)     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.Executor r2 = r4.zzc     // Catch: java.lang.Throwable -> L9c
            r1.zzh(r0, r2)     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.Executor r2 = r4.zzc     // Catch: java.lang.Throwable -> L9c
            r1.zzi(r0, r2)     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.Executor r2 = r4.zzc     // Catch: java.lang.Throwable -> L9c
            r1.zzc(r0, r2)     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.Executor r2 = r4.zzc     // Catch: java.lang.Throwable -> L9c
            r1.zzl(r0, r2)     // Catch: java.lang.Throwable -> L9c
            r1.zzm(r0)     // Catch: java.lang.Throwable -> L9c
            android.view.ViewGroup r0 = r4.zzg     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzcqo r2 = new com.google.android.gms.internal.ads.zzcqo     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzcxi r0 = new com.google.android.gms.internal.ads.zzcxi     // Catch: java.lang.Throwable -> L9c
            r0.<init>()     // Catch: java.lang.Throwable -> L9c
            android.content.Context r3 = r4.zzb     // Catch: java.lang.Throwable -> L9c
            r0.zze(r3)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzfhc r5 = r5.zza     // Catch: java.lang.Throwable -> L9c
            r0.zzi(r5)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzcxk r5 = r0.zzj()     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzddu r0 = r1.zzn()     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.zzcxg r5 = r4.zze(r2, r5, r0)     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r4)
            return r5
        L9c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zza() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzj
            if (r0 == 0) goto Lc
            boolean r0 = r0.isDone()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzm r10, java.lang.String r11, com.google.android.gms.internal.ads.zzeop r12, com.google.android.gms.internal.ads.zzeoq r13) throws android.os.RemoteException {
            r9 = this;
            monitor-enter(r9)
            boolean r12 = r10.zzb()     // Catch: java.lang.Throwable -> L136
            r0 = 1
            r1 = 0
            if (r12 == 0) goto La
            goto L4a
        La:
            com.google.android.gms.internal.ads.zzbeb r12 = com.google.android.gms.internal.ads.zzbep.zzd     // Catch: java.lang.Throwable -> L136
            java.lang.Object r12 = r12.zze()     // Catch: java.lang.Throwable -> L136
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L136
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L136
            if (r12 == 0) goto L2c
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzkO     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L136
            java.lang.Object r12 = r2.zza(r12)     // Catch: java.lang.Throwable -> L136
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L136
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L136
            if (r12 == 0) goto L2c
            r12 = 1
            goto L2d
        L2c:
            r12 = 0
        L2d:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r9.zzf     // Catch: java.lang.Throwable -> L136
            int r2 = r2.clientJarVersion     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzkP     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L136
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L136
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L136
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L136
            if (r2 < r3) goto L45
            if (r12 != 0) goto L4a
        L45:
            java.lang.String r12 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r12)     // Catch: java.lang.Throwable -> L136
        L4a:
            if (r11 != 0) goto L5d
            java.lang.String r10 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r10)     // Catch: java.lang.Throwable -> L136
            java.util.concurrent.Executor r10 = r9.zzc     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfbj r11 = new com.google.android.gms.internal.ads.zzfbj     // Catch: java.lang.Throwable -> L136
            r11.<init>(r9)     // Catch: java.lang.Throwable -> L136
            r10.execute(r11)     // Catch: java.lang.Throwable -> L136
            monitor-exit(r9)
            return r1
        L5d:
            com.google.common.util.concurrent.ListenableFuture r12 = r9.zzj     // Catch: java.lang.Throwable -> L136
            if (r12 == 0) goto L63
            monitor-exit(r9)
            return r1
        L63:
            com.google.android.gms.internal.ads.zzbeb r12 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L136
            java.lang.Object r12 = r12.zze()     // Catch: java.lang.Throwable -> L136
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L136
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L136
            r2 = 7
            r3 = 0
            if (r12 == 0) goto L94
            com.google.android.gms.internal.ads.zzfdy r12 = r9.zze     // Catch: java.lang.Throwable -> L136
            java.lang.Object r4 = r12.zzd()     // Catch: java.lang.Throwable -> L136
            if (r4 == 0) goto L94
            java.lang.Object r12 = r12.zzd()     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzcqb r12 = (com.google.android.gms.internal.ads.zzcqb) r12     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfma r12 = r12.zzh()     // Catch: java.lang.Throwable -> L136
            r12.zzi(r2)     // Catch: java.lang.Throwable -> L136
            java.lang.String r4 = r10.zzp     // Catch: java.lang.Throwable -> L136
            r12.zzb(r4)     // Catch: java.lang.Throwable -> L136
            android.os.Bundle r4 = r10.zzm     // Catch: java.lang.Throwable -> L136
            r12.zzf(r4)     // Catch: java.lang.Throwable -> L136
            r4 = r12
            goto L95
        L94:
            r4 = r3
        L95:
            android.content.Context r12 = r9.zzb     // Catch: java.lang.Throwable -> L136
            boolean r5 = r10.zzf     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfhz.zza(r12, r5)     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzix     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L136
            java.lang.Object r12 = r5.zza(r12)     // Catch: java.lang.Throwable -> L136
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L136
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L136
            if (r12 == 0) goto Lbb
            boolean r12 = r10.zzf     // Catch: java.lang.Throwable -> L136
            if (r12 == 0) goto Lbb
            com.google.android.gms.internal.ads.zzcho r12 = r9.zza     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzdxb r12 = r12.zzl()     // Catch: java.lang.Throwable -> L136
            r12.zzo(r0)     // Catch: java.lang.Throwable -> L136
        Lbb:
            r12 = 2
            android.util.Pair[] r12 = new android.util.Pair[r12]     // Catch: java.lang.Throwable -> L136
            android.util.Pair r5 = new android.util.Pair     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzdtm r6 = com.google.android.gms.internal.ads.zzdtm.zza     // Catch: java.lang.Throwable -> L136
            java.lang.String r6 = r6.zza()     // Catch: java.lang.Throwable -> L136
            long r7 = r10.zzz     // Catch: java.lang.Throwable -> L136
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L136
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L136
            r12[r1] = r5     // Catch: java.lang.Throwable -> L136
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzdtm r5 = com.google.android.gms.internal.ads.zzdtm.zzb     // Catch: java.lang.Throwable -> L136
            java.lang.String r5 = r5.zza()     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L136
            long r6 = r6.currentTimeMillis()     // Catch: java.lang.Throwable -> L136
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L136
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L136
            r12[r0] = r1     // Catch: java.lang.Throwable -> L136
            android.os.Bundle r12 = com.google.android.gms.internal.ads.zzdto.zza(r12)     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfha r1 = r9.zzi     // Catch: java.lang.Throwable -> L136
            r1.zzt(r11)     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.ads.internal.client.zzs r11 = com.google.android.gms.ads.internal.client.zzs.zzb()     // Catch: java.lang.Throwable -> L136
            r1.zzs(r11)     // Catch: java.lang.Throwable -> L136
            r1.zzH(r10)     // Catch: java.lang.Throwable -> L136
            r1.zzA(r12)     // Catch: java.lang.Throwable -> L136
            android.content.Context r11 = r9.zzb     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfhc r12 = r1.zzJ()     // Catch: java.lang.Throwable -> L136
            int r1 = com.google.android.gms.internal.ads.zzflz.zzf(r12)     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzflp r5 = com.google.android.gms.internal.ads.zzflo.zzb(r11, r1, r2, r10)     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfbo r6 = new com.google.android.gms.internal.ads.zzfbo     // Catch: java.lang.Throwable -> L136
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L136
            r6.zza = r12     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfdy r10 = r9.zze     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfdz r11 = new com.google.android.gms.internal.ads.zzfdz     // Catch: java.lang.Throwable -> L136
            r11.<init>(r6, r3)     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfbk r12 = new com.google.android.gms.internal.ads.zzfbk     // Catch: java.lang.Throwable -> L136
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L136
            com.google.common.util.concurrent.ListenableFuture r10 = r10.zzc(r11, r12, r3)     // Catch: java.lang.Throwable -> L136
            r9.zzj = r10     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzfbm r11 = new com.google.android.gms.internal.ads.zzfbm     // Catch: java.lang.Throwable -> L136
            r1 = r11
            r2 = r9
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L136
            java.util.concurrent.Executor r12 = r9.zzc     // Catch: java.lang.Throwable -> L136
            com.google.android.gms.internal.ads.zzgfo.zzr(r10, r11, r12)     // Catch: java.lang.Throwable -> L136
            monitor-exit(r9)
            return r0
        L136:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    protected abstract com.google.android.gms.internal.ads.zzcxg zze(com.google.android.gms.internal.ads.zzcqo r1, com.google.android.gms.internal.ads.zzcxk r2, com.google.android.gms.internal.ads.zzddu r3);

    final /* synthetic */ void zzk() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r3.zzd
            r1 = 6
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfie.zzd(r1, r2, r2)
            r0.zzdB(r1)
            return
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzy r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfha r0 = r1.zzi
            r0.zzu(r2)
            return
    }
}
