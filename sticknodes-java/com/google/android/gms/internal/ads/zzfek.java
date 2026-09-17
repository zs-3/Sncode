package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfek implements com.google.android.gms.internal.ads.zzeor {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcho zzc;
    private final com.google.android.gms.internal.ads.zzeob zzd;
    private final com.google.android.gms.internal.ads.zzffk zze;
    private com.google.android.gms.internal.ads.zzbdq zzf;
    private final com.google.android.gms.internal.ads.zzfmd zzg;
    private final com.google.android.gms.internal.ads.zzfha zzh;
    private com.google.common.util.concurrent.ListenableFuture zzi;

    public zzfek(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.internal.ads.zzcho r3, com.google.android.gms.internal.ads.zzeob r4, com.google.android.gms.internal.ads.zzffk r5, com.google.android.gms.internal.ads.zzfha r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zzh = r6
            r0.zze = r5
            com.google.android.gms.internal.ads.zzfmd r1 = r3.zzz()
            r0.zzg = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzeob zzc(com.google.android.gms.internal.ads.zzfek r0) {
            com.google.android.gms.internal.ads.zzeob r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzffk zzd(com.google.android.gms.internal.ads.zzfek r0) {
            com.google.android.gms.internal.ads.zzffk r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfmd zze(com.google.android.gms.internal.ads.zzfek r0) {
            com.google.android.gms.internal.ads.zzfmd r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzf(com.google.android.gms.internal.ads.zzfek r0) {
            java.util.concurrent.Executor r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzfek r0, com.google.common.util.concurrent.ListenableFuture r1) {
            r1 = 0
            r0.zzi = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zza() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzi
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
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm r10, java.lang.String r11, com.google.android.gms.internal.ads.zzeop r12, com.google.android.gms.internal.ads.zzeoq r13) {
            r9 = this;
            r0 = 0
            if (r11 != 0) goto L13
            java.lang.String r10 = "Ad unit ID should not be null for interstitial ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r10)
            java.util.concurrent.Executor r10 = r9.zzb
            com.google.android.gms.internal.ads.zzfee r11 = new com.google.android.gms.internal.ads.zzfee
            r11.<init>(r9)
            r10.execute(r11)
            return r0
        L13:
            boolean r1 = r9.zza()
            if (r1 == 0) goto L1a
            return r0
        L1a:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzix
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 == 0) goto L3a
            boolean r1 = r10.zzf
            if (r1 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcho r1 = r9.zzc
            com.google.android.gms.internal.ads.zzdxb r1 = r1.zzl()
            r1.zzo(r2)
        L3a:
            com.google.android.gms.internal.ads.zzfed r12 = (com.google.android.gms.internal.ads.zzfed) r12
            com.google.android.gms.ads.internal.client.zzs r12 = r12.zza
            r1 = 2
            android.util.Pair[] r1 = new android.util.Pair[r1]
            android.util.Pair r3 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdtm r4 = com.google.android.gms.internal.ads.zzdtm.zza
            java.lang.String r4 = r4.zza()
            long r5 = r10.zzz
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.<init>(r4, r5)
            r1[r0] = r3
            android.util.Pair r0 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zzb
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.<init>(r3, r4)
            r1[r2] = r0
            android.os.Bundle r0 = com.google.android.gms.internal.ads.zzdto.zza(r1)
            com.google.android.gms.internal.ads.zzfha r1 = r9.zzh
            r1.zzt(r11)
            r1.zzs(r12)
            r1.zzH(r10)
            r1.zzA(r0)
            android.content.Context r11 = r9.zza
            com.google.android.gms.internal.ads.zzfhc r12 = r1.zzJ()
            int r0 = com.google.android.gms.internal.ads.zzflz.zzf(r12)
            r1 = 4
            com.google.android.gms.internal.ads.zzflp r7 = com.google.android.gms.internal.ads.zzflo.zzb(r11, r0, r1, r10)
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzhO
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r11 = r0.zza(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Le5
            com.google.android.gms.internal.ads.zzcho r11 = r9.zzc
            com.google.android.gms.internal.ads.zzdib r11 = r11.zzg()
            com.google.android.gms.internal.ads.zzcxi r0 = new com.google.android.gms.internal.ads.zzcxi
            r0.<init>()
            android.content.Context r3 = r9.zza
            r0.zze(r3)
            r0.zzi(r12)
            com.google.android.gms.internal.ads.zzcxk r12 = r0.zzj()
            r11.zze(r12)
            com.google.android.gms.internal.ads.zzdds r12 = new com.google.android.gms.internal.ads.zzdds
            r12.<init>()
            com.google.android.gms.internal.ads.zzeob r0 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r12.zzj(r0, r3)
            com.google.android.gms.internal.ads.zzeob r0 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r12.zzk(r0, r3)
            com.google.android.gms.internal.ads.zzddu r12 = r12.zzn()
            r11.zzd(r12)
            com.google.android.gms.internal.ads.zzemk r12 = new com.google.android.gms.internal.ads.zzemk
            com.google.android.gms.internal.ads.zzbdq r0 = r9.zzf
            r12.<init>(r0)
            r11.zzc(r12)
            com.google.android.gms.internal.ads.zzdic r11 = r11.zzf()
        Le2:
            r8 = r11
            goto L171
        Le5:
            com.google.android.gms.internal.ads.zzdds r11 = new com.google.android.gms.internal.ads.zzdds
            r11.<init>()
            com.google.android.gms.internal.ads.zzffk r0 = r9.zze
            if (r0 == 0) goto L101
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zze(r0, r3)
            com.google.android.gms.internal.ads.zzffk r0 = r9.zze
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzffk r0 = r9.zze
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zzb(r0, r3)
        L101:
            com.google.android.gms.internal.ads.zzcho r0 = r9.zzc
            com.google.android.gms.internal.ads.zzdib r0 = r0.zzg()
            com.google.android.gms.internal.ads.zzcxi r3 = new com.google.android.gms.internal.ads.zzcxi
            r3.<init>()
            android.content.Context r4 = r9.zza
            r3.zze(r4)
            r3.zzi(r12)
            com.google.android.gms.internal.ads.zzcxk r12 = r3.zzj()
            r0.zze(r12)
            com.google.android.gms.internal.ads.zzeob r12 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zzj(r12, r3)
            com.google.android.gms.internal.ads.zzeob r12 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zze(r12, r3)
            com.google.android.gms.internal.ads.zzeob r12 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zzf(r12, r3)
            com.google.android.gms.internal.ads.zzeob r12 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zzb(r12, r3)
            com.google.android.gms.internal.ads.zzeob r12 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zza(r12, r3)
            com.google.android.gms.internal.ads.zzeob r12 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zzl(r12, r3)
            com.google.android.gms.internal.ads.zzeob r12 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zzk(r12, r3)
            com.google.android.gms.internal.ads.zzeob r12 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zzi(r12, r3)
            com.google.android.gms.internal.ads.zzeob r12 = r9.zzd
            java.util.concurrent.Executor r3 = r9.zzb
            r11.zzc(r12, r3)
            com.google.android.gms.internal.ads.zzddu r11 = r11.zzn()
            r0.zzd(r11)
            com.google.android.gms.internal.ads.zzemk r11 = new com.google.android.gms.internal.ads.zzemk
            com.google.android.gms.internal.ads.zzbdq r12 = r9.zzf
            r11.<init>(r12)
            r0.zzc(r11)
            com.google.android.gms.internal.ads.zzdic r11 = r0.zzf()
            goto Le2
        L171:
            com.google.android.gms.internal.ads.zzbeb r11 = com.google.android.gms.internal.ads.zzbek.zzc
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L192
            com.google.android.gms.internal.ads.zzfma r11 = r8.zzf()
            r11.zzi(r1)
            java.lang.String r12 = r10.zzp
            r11.zzb(r12)
            android.os.Bundle r10 = r10.zzm
            r11.zzf(r10)
            r6 = r11
            goto L194
        L192:
            r10 = 0
            r6 = r10
        L194:
            com.google.android.gms.internal.ads.zzcum r10 = r8.zza()
            com.google.common.util.concurrent.ListenableFuture r11 = r10.zzj()
            com.google.common.util.concurrent.ListenableFuture r10 = r10.zzi(r11)
            r9.zzi = r10
            com.google.android.gms.internal.ads.zzfej r11 = new com.google.android.gms.internal.ads.zzfej
            r3 = r11
            r4 = r9
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r12 = r9.zzb
            com.google.android.gms.internal.ads.zzgfo.zzr(r10, r11, r12)
            return r2
    }

    final /* synthetic */ void zzh() {
            r3 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r3.zzd
            r1 = 6
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfie.zzd(r1, r2, r2)
            r0.zzdB(r1)
            return
    }

    public final void zzi(com.google.android.gms.internal.ads.zzbdq r1) {
            r0 = this;
            r0.zzf = r1
            return
    }
}
