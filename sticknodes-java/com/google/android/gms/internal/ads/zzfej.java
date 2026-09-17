package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfej implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeoq zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfma zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzflp zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdic zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfek zze;

    zzfej(com.google.android.gms.internal.ads.zzfek r1, com.google.android.gms.internal.ads.zzeoq r2, com.google.android.gms.internal.ads.zzfma r3, com.google.android.gms.internal.ads.zzflp r4, com.google.android.gms.internal.ads.zzdic r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r6) {
            r5 = this;
            java.lang.String r0 = "Interstitial ad failed to load"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
            com.google.android.gms.internal.ads.zzdic r0 = r5.zzd
            com.google.android.gms.internal.ads.zzcum r0 = r0.zza()
            com.google.android.gms.ads.internal.client.zze r0 = r0.zza(r6)
            com.google.android.gms.internal.ads.zzfek r1 = r5.zze
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfek r2 = r5.zze     // Catch: java.lang.Throwable -> L9a
            r3 = 0
            com.google.android.gms.internal.ads.zzfek.zzg(r2, r3)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzdic r2 = r5.zzd     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzcyc r2 = r2.zzb()     // Catch: java.lang.Throwable -> L9a
            r2.zzdB(r0)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhO     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L9a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L4f
            com.google.android.gms.internal.ads.zzfek r2 = r5.zze     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.Executor r2 = com.google.android.gms.internal.ads.zzfek.zzf(r2)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzfef r3 = new com.google.android.gms.internal.ads.zzfef     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L9a
            r2.execute(r3)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzfek r2 = r5.zze     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.Executor r2 = com.google.android.gms.internal.ads.zzfek.zzf(r2)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzfeg r3 = new com.google.android.gms.internal.ads.zzfeg     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L9a
            r2.execute(r3)     // Catch: java.lang.Throwable -> L9a
        L4f:
            int r2 = r0.zza     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = "InterstitialAdLoader.onFailure"
            com.google.android.gms.internal.ads.zzfhz.zzb(r2, r6, r3)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzeoq r2 = r5.zza     // Catch: java.lang.Throwable -> L9a
            r2.zza()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r2.zze()     // Catch: java.lang.Throwable -> L9a
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L9a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L9a
            r3 = 0
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzfma r2 = r5.zzb     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L80
            r2.zzc(r0)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzflp r0 = r5.zzc     // Catch: java.lang.Throwable -> L9a
            r0.zzh(r6)     // Catch: java.lang.Throwable -> L9a
            r0.zzg(r3)     // Catch: java.lang.Throwable -> L9a
            r2.zza(r0)     // Catch: java.lang.Throwable -> L9a
            r2.zzh()     // Catch: java.lang.Throwable -> L9a
            goto L98
        L80:
            com.google.android.gms.internal.ads.zzfek r2 = r5.zze     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzfmd r2 = com.google.android.gms.internal.ads.zzfek.zze(r2)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzflp r4 = r5.zzc     // Catch: java.lang.Throwable -> L9a
            r4.zza(r0)     // Catch: java.lang.Throwable -> L9a
            r4.zzh(r6)     // Catch: java.lang.Throwable -> L9a
            r4.zzg(r3)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzflt r6 = r4.zzm()     // Catch: java.lang.Throwable -> L9a
            r2.zzb(r6)     // Catch: java.lang.Throwable -> L9a
        L98:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            return
        L9a:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            throw r6
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzdgy r6 = (com.google.android.gms.internal.ads.zzdgy) r6
            com.google.android.gms.internal.ads.zzfek r0 = r5.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfek r1 = r5.zze     // Catch: java.lang.Throwable -> Lbf
            r2 = 0
            com.google.android.gms.internal.ads.zzfek.zzg(r1, r2)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhO     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r2 = r2.zza(r1)     // Catch: java.lang.Throwable -> Lbf
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lbf
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lbf
            if (r2 == 0) goto L33
            com.google.android.gms.internal.ads.zzdci r2 = r6.zzo()     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzfek r3 = r5.zze     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzeob r3 = com.google.android.gms.internal.ads.zzfek.zzc(r3)     // Catch: java.lang.Throwable -> Lbf
            r2.zza(r3)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzfek r3 = r5.zze     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzffk r3 = com.google.android.gms.internal.ads.zzfek.zzd(r3)     // Catch: java.lang.Throwable -> Lbf
            r2.zzd(r3)     // Catch: java.lang.Throwable -> Lbf
        L33:
            com.google.android.gms.internal.ads.zzeoq r2 = r5.zza     // Catch: java.lang.Throwable -> Lbf
            r2.zzb(r6)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> Lbf
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lbf
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto L64
            com.google.android.gms.internal.ads.zzfek r1 = r5.zze     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.ads.zzfek.zzf(r1)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzfeh r2 = new com.google.android.gms.internal.ads.zzfeh     // Catch: java.lang.Throwable -> Lbf
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lbf
            r1.execute(r2)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzfek r1 = r5.zze     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.ads.zzfek.zzf(r1)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzfei r2 = new com.google.android.gms.internal.ads.zzfei     // Catch: java.lang.Throwable -> Lbf
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lbf
            r1.execute(r2)     // Catch: java.lang.Throwable -> Lbf
        L64:
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lbf
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lbf
            r2 = 1
            if (r1 == 0) goto L97
            com.google.android.gms.internal.ads.zzfma r1 = r5.zzb     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto L97
            com.google.android.gms.internal.ads.zzfgt r3 = r6.zzq()     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzfgs r3 = r3.zzb     // Catch: java.lang.Throwable -> Lbf
            r1.zzg(r3)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzcxt r6 = r6.zzm()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = r6.zzg()     // Catch: java.lang.Throwable -> Lbf
            r1.zze(r6)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzflp r6 = r5.zzc     // Catch: java.lang.Throwable -> Lbf
            r6.zzg(r2)     // Catch: java.lang.Throwable -> Lbf
            r1.zza(r6)     // Catch: java.lang.Throwable -> Lbf
            r1.zzh()     // Catch: java.lang.Throwable -> Lbf
            goto Lbd
        L97:
            com.google.android.gms.internal.ads.zzfek r1 = r5.zze     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzfmd r1 = com.google.android.gms.internal.ads.zzfek.zze(r1)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzflp r3 = r5.zzc     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzfgt r4 = r6.zzq()     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzfgs r4 = r4.zzb     // Catch: java.lang.Throwable -> Lbf
            r3.zzb(r4)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzcxt r6 = r6.zzm()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = r6.zzg()     // Catch: java.lang.Throwable -> Lbf
            r3.zzd(r6)     // Catch: java.lang.Throwable -> Lbf
            r3.zzg(r2)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.zzflt r6 = r3.zzm()     // Catch: java.lang.Throwable -> Lbf
            r1.zzb(r6)     // Catch: java.lang.Throwable -> Lbf
        Lbd:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
            return
        Lbf:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
            throw r6
    }
}
