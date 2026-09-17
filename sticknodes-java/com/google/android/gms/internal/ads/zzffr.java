package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzffr implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeoq zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfma zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzflp zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfft zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzffu zze;

    zzffr(com.google.android.gms.internal.ads.zzffu r1, com.google.android.gms.internal.ads.zzeoq r2, com.google.android.gms.internal.ads.zzfma r3, com.google.android.gms.internal.ads.zzflp r4, com.google.android.gms.internal.ads.zzfft r5) {
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
            java.lang.String r0 = "Rewarded ad failed to load"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
            com.google.android.gms.internal.ads.zzffu r0 = r5.zze
            com.google.android.gms.internal.ads.zzfdy r0 = com.google.android.gms.internal.ads.zzffu.zze(r0)
            java.lang.Object r0 = r0.zzd()
            com.google.android.gms.internal.ads.zzdqn r0 = (com.google.android.gms.internal.ads.zzdqn) r0
            if (r0 != 0) goto L19
            r1 = 0
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfie.zzb(r6, r1)
            goto L21
        L19:
            com.google.android.gms.internal.ads.zzcum r1 = r0.zzb()
            com.google.android.gms.ads.internal.client.zze r1 = r1.zza(r6)
        L21:
            com.google.android.gms.internal.ads.zzffu r2 = r5.zze
            monitor-enter(r2)
            if (r0 == 0) goto L3c
            com.google.android.gms.internal.ads.zzcyc r0 = r0.zza()     // Catch: java.lang.Throwable -> La7
            r0.zzdB(r1)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzffu r0 = r5.zze     // Catch: java.lang.Throwable -> La7
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzffu.zzh(r0)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzffp r3 = new com.google.android.gms.internal.ads.zzffp     // Catch: java.lang.Throwable -> La7
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> La7
            r0.execute(r3)     // Catch: java.lang.Throwable -> La7
            goto L5c
        L3c:
            com.google.android.gms.internal.ads.zzffu r0 = r5.zze     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzffk r0 = com.google.android.gms.internal.ads.zzffu.zzf(r0)     // Catch: java.lang.Throwable -> La7
            r0.zzdB(r1)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzffu r0 = r5.zze     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzfft r3 = r5.zzd     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzdqm r0 = com.google.android.gms.internal.ads.zzffu.zzd(r0, r3)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzdqn r0 = r0.zze()     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzcum r0 = r0.zzb()     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzddi r0 = r0.zzc()     // Catch: java.lang.Throwable -> La7
            r0.zzh()     // Catch: java.lang.Throwable -> La7
        L5c:
            int r0 = r1.zza     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "RewardedAdLoader.onFailure"
            com.google.android.gms.internal.ads.zzfhz.zzb(r0, r6, r3)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzeoq r0 = r5.zza     // Catch: java.lang.Throwable -> La7
            r0.zza()     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> La7
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> La7
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La7
            r3 = 0
            if (r0 == 0) goto L8d
            com.google.android.gms.internal.ads.zzfma r0 = r5.zzb     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L8d
            r0.zzc(r1)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzflp r1 = r5.zzc     // Catch: java.lang.Throwable -> La7
            r1.zzh(r6)     // Catch: java.lang.Throwable -> La7
            r1.zzg(r3)     // Catch: java.lang.Throwable -> La7
            r0.zza(r1)     // Catch: java.lang.Throwable -> La7
            r0.zzh()     // Catch: java.lang.Throwable -> La7
            goto La5
        L8d:
            com.google.android.gms.internal.ads.zzffu r0 = r5.zze     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzfmd r0 = com.google.android.gms.internal.ads.zzffu.zzg(r0)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzflp r4 = r5.zzc     // Catch: java.lang.Throwable -> La7
            r4.zza(r1)     // Catch: java.lang.Throwable -> La7
            r4.zzh(r6)     // Catch: java.lang.Throwable -> La7
            r4.zzg(r3)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzflt r6 = r4.zzm()     // Catch: java.lang.Throwable -> La7
            r0.zzb(r6)     // Catch: java.lang.Throwable -> La7
        La5:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            return
        La7:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            throw r6
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzffu r0 = r5.zze
            com.google.android.gms.internal.ads.zzdqi r6 = (com.google.android.gms.internal.ads.zzdqi) r6
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzdci r1 = r6.zzo()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzffu r2 = r5.zze     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzffk r2 = com.google.android.gms.internal.ads.zzffu.zzf(r2)     // Catch: java.lang.Throwable -> L90
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzeoq r1 = r5.zza     // Catch: java.lang.Throwable -> L90
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzffu r1 = r5.zze     // Catch: java.lang.Throwable -> L90
            java.util.concurrent.Executor r2 = com.google.android.gms.internal.ads.zzffu.zzh(r1)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzffk r1 = com.google.android.gms.internal.ads.zzffu.zzf(r1)     // Catch: java.lang.Throwable -> L90
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzffq r3 = new com.google.android.gms.internal.ads.zzffq     // Catch: java.lang.Throwable -> L90
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L90
            r2.execute(r3)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzffu r1 = r5.zze     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzffk r1 = com.google.android.gms.internal.ads.zzffu.zzf(r1)     // Catch: java.lang.Throwable -> L90
            r1.onAdMetadataChanged()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L90
            r2 = 1
            if (r1 == 0) goto L68
            com.google.android.gms.internal.ads.zzfma r1 = r5.zzb     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L68
            com.google.android.gms.internal.ads.zzfgt r3 = r6.zzq()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzfgs r3 = r3.zzb     // Catch: java.lang.Throwable -> L90
            r1.zzg(r3)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzcxt r6 = r6.zzm()     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r6.zzg()     // Catch: java.lang.Throwable -> L90
            r1.zze(r6)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzflp r6 = r5.zzc     // Catch: java.lang.Throwable -> L90
            r6.zzg(r2)     // Catch: java.lang.Throwable -> L90
            r1.zza(r6)     // Catch: java.lang.Throwable -> L90
            r1.zzh()     // Catch: java.lang.Throwable -> L90
            goto L8e
        L68:
            com.google.android.gms.internal.ads.zzffu r1 = r5.zze     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzfmd r1 = com.google.android.gms.internal.ads.zzffu.zzg(r1)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzflp r3 = r5.zzc     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzfgt r4 = r6.zzq()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzfgs r4 = r4.zzb     // Catch: java.lang.Throwable -> L90
            r3.zzb(r4)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzcxt r6 = r6.zzm()     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r6.zzg()     // Catch: java.lang.Throwable -> L90
            r3.zzd(r6)     // Catch: java.lang.Throwable -> L90
            r3.zzg(r2)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzflt r6 = r3.zzm()     // Catch: java.lang.Throwable -> L90
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L90
        L8e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            return
        L90:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            throw r6
    }
}
