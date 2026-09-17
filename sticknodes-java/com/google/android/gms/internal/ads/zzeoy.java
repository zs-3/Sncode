package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeoy implements com.google.android.gms.internal.ads.zzeor {
    private final com.google.android.gms.internal.ads.zzfha zza;
    private final com.google.android.gms.internal.ads.zzcho zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzeoo zzd;
    private final com.google.android.gms.internal.ads.zzfmd zze;
    private com.google.android.gms.internal.ads.zzctt zzf;

    public zzeoy(com.google.android.gms.internal.ads.zzcho r1, android.content.Context r2, com.google.android.gms.internal.ads.zzeoo r3, com.google.android.gms.internal.ads.zzfha r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zza = r4
            com.google.android.gms.internal.ads.zzfmd r1 = r1.zzz()
            r0.zze = r1
            com.google.android.gms.internal.ads.zzeob r1 = r3.zzd()
            r4.zzv(r1)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcho zzc(com.google.android.gms.internal.ads.zzeoy r0) {
            com.google.android.gms.internal.ads.zzcho r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzeoo zzd(com.google.android.gms.internal.ads.zzeoy r0) {
            com.google.android.gms.internal.ads.zzeoo r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfmd zze(com.google.android.gms.internal.ads.zzeoy r0) {
            com.google.android.gms.internal.ads.zzfmd r0 = r0.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzctt r0 = r1.zzf
            if (r0 == 0) goto Lc
            boolean r0 = r0.zzf()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm r10, java.lang.String r11, com.google.android.gms.internal.ads.zzeop r12, com.google.android.gms.internal.ads.zzeoq r13) throws android.os.RemoteException {
            r9 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r9.zzc
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzH(r0)
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.ads.internal.client.zzc r0 = r10.zzs
            if (r0 == 0) goto L11
            goto L25
        L11:
            java.lang.String r10 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r10)
            com.google.android.gms.internal.ads.zzcho r10 = r9.zzb
            java.util.concurrent.Executor r10 = r10.zzC()
            com.google.android.gms.internal.ads.zzeot r11 = new com.google.android.gms.internal.ads.zzeot
            r11.<init>(r9)
            r10.execute(r11)
            return r1
        L25:
            if (r11 != 0) goto L3b
            java.lang.String r10 = "Ad unit ID should not be null for NativeAdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r10)
            com.google.android.gms.internal.ads.zzcho r10 = r9.zzb
            java.util.concurrent.Executor r10 = r10.zzC()
            com.google.android.gms.internal.ads.zzeou r11 = new com.google.android.gms.internal.ads.zzeou
            r11.<init>(r9)
            r10.execute(r11)
            return r1
        L3b:
            android.content.Context r11 = r9.zzc
            boolean r0 = r10.zzf
            com.google.android.gms.internal.ads.zzfhz.zza(r11, r0)
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzix
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r11 = r0.zza(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r0 = 1
            if (r11 == 0) goto L62
            boolean r11 = r10.zzf
            if (r11 == 0) goto L62
            com.google.android.gms.internal.ads.zzcho r11 = r9.zzb
            com.google.android.gms.internal.ads.zzdxb r11 = r11.zzl()
            r11.zzo(r0)
        L62:
            com.google.android.gms.internal.ads.zzeos r12 = (com.google.android.gms.internal.ads.zzeos) r12
            int r11 = r12.zza
            com.google.android.gms.common.util.Clock r12 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r12.currentTimeMillis()
            r12 = 2
            android.util.Pair[] r12 = new android.util.Pair[r12]
            android.util.Pair r4 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdtm r5 = com.google.android.gms.internal.ads.zzdtm.zza
            java.lang.String r5 = r5.zza()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.<init>(r5, r2)
            r12[r1] = r4
            android.util.Pair r1 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zzb
            java.lang.String r3 = r3.zza()
            r1.<init>(r3, r2)
            r12[r0] = r1
            android.os.Bundle r12 = com.google.android.gms.internal.ads.zzdto.zza(r12)
            com.google.android.gms.internal.ads.zzfha r1 = r9.zza
            r1.zzH(r10)
            r1.zzA(r12)
            r1.zzC(r11)
            android.content.Context r11 = r9.zzc
            com.google.android.gms.internal.ads.zzfhc r12 = r1.zzJ()
            int r1 = com.google.android.gms.internal.ads.zzflz.zzf(r12)
            r2 = 8
            com.google.android.gms.internal.ads.zzflp r7 = com.google.android.gms.internal.ads.zzflo.zzb(r11, r1, r2, r10)
            com.google.android.gms.ads.internal.client.zzcm r11 = r12.zzn
            if (r11 == 0) goto Lbb
            com.google.android.gms.internal.ads.zzeoo r1 = r9.zzd
            com.google.android.gms.internal.ads.zzeob r1 = r1.zzd()
            r1.zzm(r11)
        Lbb:
            com.google.android.gms.internal.ads.zzcho r11 = r9.zzb
            com.google.android.gms.internal.ads.zzdix r11 = r11.zzh()
            com.google.android.gms.internal.ads.zzcxi r1 = new com.google.android.gms.internal.ads.zzcxi
            r1.<init>()
            android.content.Context r3 = r9.zzc
            r1.zze(r3)
            r1.zzi(r12)
            com.google.android.gms.internal.ads.zzcxk r12 = r1.zzj()
            r11.zzf(r12)
            com.google.android.gms.internal.ads.zzdds r12 = new com.google.android.gms.internal.ads.zzdds
            r12.<init>()
            com.google.android.gms.internal.ads.zzeoo r1 = r9.zzd
            com.google.android.gms.internal.ads.zzcho r3 = r9.zzb
            com.google.android.gms.internal.ads.zzeob r1 = r1.zzd()
            java.util.concurrent.Executor r3 = r3.zzC()
            r12.zzk(r1, r3)
            com.google.android.gms.internal.ads.zzddu r12 = r12.zzn()
            r11.zze(r12)
            com.google.android.gms.internal.ads.zzeoo r12 = r9.zzd
            com.google.android.gms.internal.ads.zzdit r12 = r12.zzc()
            r11.zzd(r12)
            com.google.android.gms.internal.ads.zzcqo r12 = new com.google.android.gms.internal.ads.zzcqo
            r1 = 0
            r12.<init>(r1)
            r11.zzc(r12)
            com.google.android.gms.internal.ads.zzdiy r8 = r11.zzg()
            com.google.android.gms.internal.ads.zzbeb r11 = com.google.android.gms.internal.ads.zzbek.zzc
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L127
            com.google.android.gms.internal.ads.zzfma r11 = r8.zzf()
            r11.zzi(r2)
            java.lang.String r12 = r10.zzp
            r11.zzb(r12)
            android.os.Bundle r10 = r10.zzm
            r11.zzf(r10)
            r6 = r11
            goto L128
        L127:
            r6 = r1
        L128:
            com.google.android.gms.internal.ads.zzcho r10 = r9.zzb
            com.google.android.gms.internal.ads.zzfib r10 = r10.zzy()
            r10.zzc(r0)
            com.google.android.gms.internal.ads.zzcho r10 = r9.zzb
            com.google.android.gms.internal.ads.zzctt r11 = new com.google.android.gms.internal.ads.zzctt
            com.google.android.gms.internal.ads.zzgfz r12 = com.google.android.gms.internal.ads.zzfkb.zzc()
            java.util.concurrent.ScheduledExecutorService r10 = r10.zzD()
            com.google.android.gms.internal.ads.zzcum r1 = r8.zza()
            com.google.common.util.concurrent.ListenableFuture r2 = r1.zzj()
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zzi(r2)
            r11.<init>(r12, r10, r1)
            r9.zzf = r11
            com.google.android.gms.internal.ads.zzeox r10 = new com.google.android.gms.internal.ads.zzeox
            r3 = r10
            r4 = r9
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r11.zze(r10)
            return r0
    }

    final /* synthetic */ void zzf() {
            r3 = this;
            com.google.android.gms.internal.ads.zzeoo r0 = r3.zzd
            com.google.android.gms.internal.ads.zzcyd r0 = r0.zza()
            r1 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfie.zzd(r1, r2, r2)
            r0.zzdB(r1)
            return
    }

    final /* synthetic */ void zzg() {
            r3 = this;
            com.google.android.gms.internal.ads.zzeoo r0 = r3.zzd
            com.google.android.gms.internal.ads.zzcyd r0 = r0.zza()
            r1 = 6
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfie.zzd(r1, r2, r2)
            r0.zzdB(r1)
            return
    }
}
