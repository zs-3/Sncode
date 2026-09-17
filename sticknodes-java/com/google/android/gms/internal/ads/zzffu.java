package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzffu implements com.google.android.gms.internal.ads.zzeor {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcho zzc;
    private final com.google.android.gms.internal.ads.zzffk zzd;
    private final com.google.android.gms.internal.ads.zzfdy zze;
    private final com.google.android.gms.internal.ads.zzfgu zzf;
    private final com.google.android.gms.internal.ads.zzfmd zzg;
    private final com.google.android.gms.internal.ads.zzfha zzh;
    private com.google.common.util.concurrent.ListenableFuture zzi;

    public zzffu(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.internal.ads.zzcho r3, com.google.android.gms.internal.ads.zzfdy r4, com.google.android.gms.internal.ads.zzffk r5, com.google.android.gms.internal.ads.zzfha r6, com.google.android.gms.internal.ads.zzfgu r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zze = r4
            r0.zzd = r5
            r0.zzh = r6
            r0.zzf = r7
            com.google.android.gms.internal.ads.zzfmd r1 = r3.zzz()
            r0.zzg = r1
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzdqm zzc(com.google.android.gms.internal.ads.zzffu r0, com.google.android.gms.internal.ads.zzfdw r1) {
            com.google.android.gms.internal.ads.zzdqm r0 = r0.zzk(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdqm zzd(com.google.android.gms.internal.ads.zzffu r0, com.google.android.gms.internal.ads.zzfdw r1) {
            com.google.android.gms.internal.ads.zzdqm r0 = r0.zzk(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfdy zze(com.google.android.gms.internal.ads.zzffu r0) {
            com.google.android.gms.internal.ads.zzfdy r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzffk zzf(com.google.android.gms.internal.ads.zzffu r0) {
            com.google.android.gms.internal.ads.zzffk r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfmd zzg(com.google.android.gms.internal.ads.zzffu r0) {
            com.google.android.gms.internal.ads.zzfmd r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzh(com.google.android.gms.internal.ads.zzffu r0) {
            java.util.concurrent.Executor r0 = r0.zzb
            return r0
    }

    private final com.google.android.gms.internal.ads.zzdqm zzk(com.google.android.gms.internal.ads.zzfdw r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfft r4 = (com.google.android.gms.internal.ads.zzfft) r4
            com.google.android.gms.internal.ads.zzcho r0 = r3.zzc
            com.google.android.gms.internal.ads.zzdqm r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzcxi r1 = new com.google.android.gms.internal.ads.zzcxi
            r1.<init>()
            android.content.Context r2 = r3.zza
            r1.zze(r2)
            com.google.android.gms.internal.ads.zzfhc r4 = r4.zza
            r1.zzi(r4)
            com.google.android.gms.internal.ads.zzfgu r4 = r3.zzf
            r1.zzh(r4)
            com.google.android.gms.internal.ads.zzcxk r4 = r1.zzj()
            r0.zzd(r4)
            com.google.android.gms.internal.ads.zzdds r4 = new com.google.android.gms.internal.ads.zzdds
            r4.<init>()
            com.google.android.gms.internal.ads.zzddu r4 = r4.zzn()
            r0.zzc(r4)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zza() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm r11, java.lang.String r12, com.google.android.gms.internal.ads.zzeop r13, com.google.android.gms.internal.ads.zzeoq r14) throws android.os.RemoteException {
            r10 = this;
            com.google.android.gms.internal.ads.zzbwt r0 = new com.google.android.gms.internal.ads.zzbwt
            r0.<init>(r11, r12)
            com.google.android.gms.internal.ads.zzffm r13 = (com.google.android.gms.internal.ads.zzffm) r13
            java.lang.String r11 = r0.zzb
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L1f
            java.lang.String r11 = "Ad unit ID should not be null for rewarded video ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r11)
            java.util.concurrent.Executor r11 = r10.zzb
            com.google.android.gms.internal.ads.zzffn r12 = new com.google.android.gms.internal.ads.zzffn
            r12.<init>(r10)
            r11.execute(r12)
        L1c:
            r12 = 0
            goto L10b
        L1f:
            com.google.common.util.concurrent.ListenableFuture r11 = r10.zzi
            if (r11 == 0) goto L2a
            boolean r11 = r11.isDone()
            if (r11 != 0) goto L2a
            goto L1c
        L2a:
            com.google.android.gms.internal.ads.zzbeb r11 = com.google.android.gms.internal.ads.zzbek.zzc
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r1 = 5
            r2 = 0
            if (r11 == 0) goto L5f
            com.google.android.gms.internal.ads.zzfdy r11 = r10.zze
            java.lang.Object r3 = r11.zzd()
            if (r3 == 0) goto L5f
            java.lang.Object r11 = r11.zzd()
            com.google.android.gms.internal.ads.zzdqn r11 = (com.google.android.gms.internal.ads.zzdqn) r11
            com.google.android.gms.internal.ads.zzfma r11 = r11.zzh()
            r11.zzi(r1)
            com.google.android.gms.ads.internal.client.zzm r3 = r0.zza
            java.lang.String r3 = r3.zzp
            r11.zzb(r3)
            com.google.android.gms.ads.internal.client.zzm r3 = r0.zza
            android.os.Bundle r3 = r3.zzm
            r11.zzf(r3)
            r7 = r11
            goto L60
        L5f:
            r7 = r2
        L60:
            android.content.Context r11 = r10.zza
            com.google.android.gms.ads.internal.client.zzm r3 = r0.zza
            boolean r3 = r3.zzf
            com.google.android.gms.internal.ads.zzfhz.zza(r11, r3)
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzix
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r11 = r3.zza(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L8a
            com.google.android.gms.ads.internal.client.zzm r11 = r0.zza
            boolean r11 = r11.zzf
            if (r11 == 0) goto L8a
            com.google.android.gms.internal.ads.zzcho r11 = r10.zzc
            com.google.android.gms.internal.ads.zzdxb r11 = r11.zzl()
            r11.zzo(r12)
        L8a:
            r11 = 2
            android.util.Pair[] r11 = new android.util.Pair[r11]
            android.util.Pair r3 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdtm r4 = com.google.android.gms.internal.ads.zzdtm.zza
            java.lang.String r4 = r4.zza()
            com.google.android.gms.ads.internal.client.zzm r5 = r0.zza
            long r5 = r5.zzz
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.<init>(r4, r5)
            r11[r13] = r3
            android.util.Pair r13 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zzb
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r13.<init>(r3, r4)
            r11[r12] = r13
            android.os.Bundle r11 = com.google.android.gms.internal.ads.zzdto.zza(r11)
            com.google.android.gms.internal.ads.zzfha r13 = r10.zzh
            java.lang.String r3 = r0.zzb
            r13.zzt(r3)
            com.google.android.gms.ads.internal.client.zzs r3 = com.google.android.gms.ads.internal.client.zzs.zzd()
            r13.zzs(r3)
            com.google.android.gms.ads.internal.client.zzm r3 = r0.zza
            r13.zzH(r3)
            r13.zzA(r11)
            android.content.Context r11 = r10.zza
            com.google.android.gms.internal.ads.zzfhc r13 = r13.zzJ()
            int r3 = com.google.android.gms.internal.ads.zzflz.zzf(r13)
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zza
            com.google.android.gms.internal.ads.zzflp r8 = com.google.android.gms.internal.ads.zzflo.zzb(r11, r3, r1, r0)
            com.google.android.gms.internal.ads.zzfft r9 = new com.google.android.gms.internal.ads.zzfft
            r9.<init>(r2)
            r9.zza = r13
            com.google.android.gms.internal.ads.zzfdy r11 = r10.zze
            com.google.android.gms.internal.ads.zzfdz r13 = new com.google.android.gms.internal.ads.zzfdz
            r13.<init>(r9, r2)
            com.google.android.gms.internal.ads.zzffo r0 = new com.google.android.gms.internal.ads.zzffo
            r0.<init>(r10)
            com.google.common.util.concurrent.ListenableFuture r11 = r11.zzc(r13, r0, r2)
            r10.zzi = r11
            com.google.android.gms.internal.ads.zzffr r13 = new com.google.android.gms.internal.ads.zzffr
            r4 = r13
            r5 = r10
            r6 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            java.util.concurrent.Executor r14 = r10.zzb
            com.google.android.gms.internal.ads.zzgfo.zzr(r11, r13, r14)
        L10b:
            return r12
    }

    final /* synthetic */ void zzi() {
            r3 = this;
            com.google.android.gms.internal.ads.zzffk r0 = r3.zzd
            r1 = 6
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfie.zzd(r1, r2, r2)
            r0.zzdB(r1)
            return
    }

    final void zzj(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfha r0 = r1.zzh
            com.google.android.gms.internal.ads.zzfgn r0 = r0.zzp()
            r0.zza(r2)
            return
    }
}
