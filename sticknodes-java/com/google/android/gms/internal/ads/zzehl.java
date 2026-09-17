package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzehl implements com.google.android.gms.internal.ads.zzegk {
    private final com.google.android.gms.internal.ads.zzcrv zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdre zzc;
    private final com.google.android.gms.internal.ads.zzfhc zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.internal.ads.zzfxq zzf;
    private final com.google.android.gms.internal.ads.zzdty zzg;

    public zzehl(com.google.android.gms.internal.ads.zzcrv r1, android.content.Context r2, java.util.concurrent.Executor r3, com.google.android.gms.internal.ads.zzdre r4, com.google.android.gms.internal.ads.zzfhc r5, com.google.android.gms.internal.ads.zzfxq r6, com.google.android.gms.internal.ads.zzdty r7) {
            r0 = this;
            r0.<init>()
            r0.zzb = r2
            r0.zza = r1
            r0.zze = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r3, com.google.android.gms.internal.ads.zzfgh r4) {
            r2 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzehk r1 = new com.google.android.gms.internal.ads.zzehk
            r1.<init>(r2, r3, r4)
            java.util.concurrent.Executor r3 = r2.zze
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzfgm r1 = r2.zzs
            if (r1 == 0) goto La
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfgt r8, com.google.android.gms.internal.ads.zzfgh r9, java.lang.Object r10) throws java.lang.Exception {
            r7 = this;
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzch
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r0.zza(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L29
            com.google.android.gms.internal.ads.zzdty r0 = r7.zzg
            android.os.Bundle r0 = r0.zza()
            com.google.android.gms.internal.ads.zzdtm r1 = com.google.android.gms.internal.ads.zzdtm.zzs
            java.lang.String r1 = r1.zza()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.currentTimeMillis()
            r0.putLong(r1, r2)
        L29:
            android.content.Context r0 = r7.zzb
            java.util.List r1 = r9.zzu
            com.google.android.gms.ads.internal.client.zzs r0 = com.google.android.gms.internal.ads.zzfhi.zza(r0, r1)
            com.google.android.gms.internal.ads.zzdre r1 = r7.zzc
            com.google.android.gms.internal.ads.zzfgs r2 = r8.zzb
            com.google.android.gms.internal.ads.zzfgk r2 = r2.zzb
            com.google.android.gms.internal.ads.zzcfo r1 = r1.zza(r0, r9, r2)
            boolean r2 = r9.zzW
            r1.zzac(r2)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhw
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L61
            boolean r2 = r9.zzag
            if (r2 == 0) goto L61
            android.content.Context r2 = r7.zzb
            android.view.View r3 = r1.zzF()
            com.google.android.gms.internal.ads.zzcsq r2 = com.google.android.gms.internal.ads.zzcsq.zza(r2, r3, r9)
            goto L75
        L61:
            android.content.Context r2 = r7.zzb
            android.view.View r3 = r1.zzF()
            com.google.android.gms.internal.ads.zzfxq r4 = r7.zzf
            com.google.android.gms.internal.ads.zzdrh r5 = new com.google.android.gms.internal.ads.zzdrh
            java.lang.Object r4 = r4.apply(r9)
            com.google.android.gms.ads.internal.util.zzau r4 = (com.google.android.gms.ads.internal.util.zzau) r4
            r5.<init>(r2, r3, r4)
            r2 = r5
        L75:
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r3.zza(r10)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L9c
            com.google.android.gms.internal.ads.zzdty r3 = r7.zzg
            android.os.Bundle r3 = r3.zza()
            com.google.android.gms.internal.ads.zzdtm r4 = com.google.android.gms.internal.ads.zzdtm.zzt
            java.lang.String r4 = r4.zza()
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzu.zzB()
            long r5 = r5.currentTimeMillis()
            r3.putLong(r4, r5)
        L9c:
            com.google.android.gms.internal.ads.zzcrv r3 = r7.zza
            com.google.android.gms.internal.ads.zzctu r4 = new com.google.android.gms.internal.ads.zzctu
            r5 = 0
            r4.<init>(r8, r9, r5)
            com.google.android.gms.internal.ads.zzcqy r8 = new com.google.android.gms.internal.ads.zzcqy
            com.google.android.gms.internal.ads.zzehf r6 = new com.google.android.gms.internal.ads.zzehf
            r6.<init>(r1)
            com.google.android.gms.internal.ads.zzfgi r0 = com.google.android.gms.internal.ads.zzfhi.zzb(r0)
            r8.<init>(r2, r1, r6, r0)
            com.google.android.gms.internal.ads.zzcqs r8 = r3.zza(r4, r8)
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r10 = r0.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Ldd
            com.google.android.gms.internal.ads.zzdty r10 = r7.zzg
            android.os.Bundle r10 = r10.zza()
            com.google.android.gms.internal.ads.zzdtm r0 = com.google.android.gms.internal.ads.zzdtm.zzu
            java.lang.String r0 = r0.zza()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.currentTimeMillis()
            r10.putLong(r0, r2)
        Ldd:
            com.google.android.gms.internal.ads.zzdrd r10 = r8.zzh()
            com.google.android.gms.internal.ads.zzdty r0 = r7.zzg
            android.os.Bundle r0 = r0.zza()
            r2 = 0
            r10.zzi(r1, r2, r5, r0)
            com.google.android.gms.internal.ads.zzcys r10 = r8.zzc()
            com.google.android.gms.internal.ads.zzehg r0 = new com.google.android.gms.internal.ads.zzehg
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zzf
            r10.zzo(r0, r3)
            com.google.android.gms.internal.ads.zzfgm r10 = r9.zzs
            java.lang.String r10 = r10.zza
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeX
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r4.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L126
            com.google.android.gms.internal.ads.zzegd r0 = r8.zzi()
            r4 = 1
            boolean r0 = r0.zze(r4)
            if (r0 == 0) goto L126
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.String r4 = com.google.android.gms.internal.ads.zzcgz.zza(r9)
            r0[r2] = r4
            java.lang.String r10 = com.google.android.gms.internal.ads.zzcgz.zzb(r10, r0)
        L126:
            r8.zzh()
            com.google.android.gms.internal.ads.zzfgm r0 = r9.zzs
            java.lang.String r0 = r0.zzb
            com.google.android.gms.internal.ads.zzdty r2 = r7.zzg
            android.os.Bundle r2 = r2.zza()
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzdrd.zzj(r1, r0, r10, r2)
            boolean r9 = r9.zzM
            if (r9 == 0) goto L145
            com.google.android.gms.internal.ads.zzehh r9 = new com.google.android.gms.internal.ads.zzehh
            r9.<init>(r1)
            java.util.concurrent.Executor r0 = r7.zze
            r10.addListener(r9, r0)
        L145:
            com.google.android.gms.internal.ads.zzehi r9 = new com.google.android.gms.internal.ads.zzehi
            r9.<init>(r7, r1)
            java.util.concurrent.Executor r0 = r7.zze
            r10.addListener(r9, r0)
            com.google.android.gms.internal.ads.zzehj r9 = new com.google.android.gms.internal.ads.zzehj
            r9.<init>(r8)
            com.google.common.util.concurrent.ListenableFuture r8 = com.google.android.gms.internal.ads.zzgfo.zzm(r10, r9, r3)
            return r8
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzcfo r3) {
            r2 = this;
            r3.zzab()
            com.google.android.gms.internal.ads.zzfhc r0 = r2.zzd
            com.google.android.gms.internal.ads.zzcgq r1 = r3.zzq()
            com.google.android.gms.ads.internal.client.zzgb r0 = r0.zza
            if (r0 == 0) goto L12
            if (r1 == 0) goto L12
            r1.zzs(r0)
        L12:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbm
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L31
            r3.onPause()
            r0 = 1
            r3.zzav(r0)
        L31:
            return
    }
}
