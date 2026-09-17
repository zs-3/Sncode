package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfcs implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfma zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzflp zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcrv zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfct zzd;

    zzfcs(com.google.android.gms.internal.ads.zzfct r1, com.google.android.gms.internal.ads.zzfma r2, com.google.android.gms.internal.ads.zzflp r3, com.google.android.gms.internal.ads.zzcrv r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r6) {
            r5 = this;
            java.lang.String r0 = "Banner ad failed to load"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
            com.google.android.gms.internal.ads.zzcrv r0 = r5.zzc
            com.google.android.gms.internal.ads.zzcum r0 = r0.zzd()
            com.google.android.gms.ads.internal.client.zze r0 = r0.zza(r6)
            com.google.android.gms.internal.ads.zzfct r1 = r5.zzd
            com.google.android.gms.internal.ads.zzfct.zzi(r1, r0)
            com.google.android.gms.internal.ads.zzfct r0 = r5.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcrv r1 = r5.zzc     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzcyc r1 = r1.zzf()     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzfct r2 = r5.zzd     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.ads.internal.client.zze r2 = com.google.android.gms.internal.ads.zzfct.zzd(r2)     // Catch: java.lang.Throwable -> L98
            r1.zzdB(r2)     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzfct r1 = r5.zzd     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfct.zzd(r1)     // Catch: java.lang.Throwable -> L98
            int r1 = r1.zza     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "BannerAdLoader.onFailure"
            com.google.android.gms.internal.ads.zzfhz.zzb(r1, r6, r2)     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzfct r1 = r5.zzd     // Catch: java.lang.Throwable -> L98
            boolean r2 = com.google.android.gms.internal.ads.zzfct.zzs(r1)     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L4f
            com.google.android.gms.internal.ads.zzfct.zzj(r1)     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzfct r1 = r5.zzd     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzdat r2 = com.google.android.gms.internal.ads.zzfct.zze(r1)     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzdcz r1 = com.google.android.gms.internal.ads.zzfct.zzf(r1)     // Catch: java.lang.Throwable -> L98
            int r1 = r1.zzc()     // Catch: java.lang.Throwable -> L98
            r2.zzd(r1)     // Catch: java.lang.Throwable -> L98
        L4f:
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L98
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L98
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L98
            r2 = 0
            if (r1 == 0) goto L7a
            com.google.android.gms.internal.ads.zzfma r1 = r5.zza     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L7a
            com.google.android.gms.internal.ads.zzfct r3 = r5.zzd     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.ads.internal.client.zze r3 = com.google.android.gms.internal.ads.zzfct.zzd(r3)     // Catch: java.lang.Throwable -> L98
            r1.zzc(r3)     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzflp r3 = r5.zzb     // Catch: java.lang.Throwable -> L98
            r3.zzh(r6)     // Catch: java.lang.Throwable -> L98
            r3.zzg(r2)     // Catch: java.lang.Throwable -> L98
            r1.zza(r3)     // Catch: java.lang.Throwable -> L98
            r1.zzh()     // Catch: java.lang.Throwable -> L98
            goto L96
        L7a:
            com.google.android.gms.internal.ads.zzfct r1 = r5.zzd     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzfmd r3 = com.google.android.gms.internal.ads.zzfct.zzh(r1)     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzflp r4 = r5.zzb     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfct.zzd(r1)     // Catch: java.lang.Throwable -> L98
            r4.zza(r1)     // Catch: java.lang.Throwable -> L98
            r4.zzh(r6)     // Catch: java.lang.Throwable -> L98
            r4.zzg(r2)     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzflt r6 = r4.zzm()     // Catch: java.lang.Throwable -> L98
            r3.zzb(r6)     // Catch: java.lang.Throwable -> L98
        L96:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            return
        L98:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            throw r6
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzfct r0 = r5.zzd
            com.google.android.gms.internal.ads.zzcqr r6 = (com.google.android.gms.internal.ads.zzcqr) r6
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfct r1 = r5.zzd     // Catch: java.lang.Throwable -> L6b
            boolean r2 = com.google.android.gms.internal.ads.zzfct.zzs(r1)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L10
            r1.zzr()     // Catch: java.lang.Throwable -> L6b
        L10:
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            r2 = 1
            if (r1 == 0) goto L43
            com.google.android.gms.internal.ads.zzfma r1 = r5.zza     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L43
            com.google.android.gms.internal.ads.zzfgt r3 = r6.zzq()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzfgs r3 = r3.zzb     // Catch: java.lang.Throwable -> L6b
            r1.zzg(r3)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzcxt r6 = r6.zzm()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = r6.zzg()     // Catch: java.lang.Throwable -> L6b
            r1.zze(r6)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzflp r6 = r5.zzb     // Catch: java.lang.Throwable -> L6b
            r6.zzg(r2)     // Catch: java.lang.Throwable -> L6b
            r1.zza(r6)     // Catch: java.lang.Throwable -> L6b
            r1.zzh()     // Catch: java.lang.Throwable -> L6b
            goto L69
        L43:
            com.google.android.gms.internal.ads.zzfct r1 = r5.zzd     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzfmd r1 = com.google.android.gms.internal.ads.zzfct.zzh(r1)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzflp r3 = r5.zzb     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzfgt r4 = r6.zzq()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzfgs r4 = r4.zzb     // Catch: java.lang.Throwable -> L6b
            r3.zzb(r4)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzcxt r6 = r6.zzm()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = r6.zzg()     // Catch: java.lang.Throwable -> L6b
            r3.zzd(r6)     // Catch: java.lang.Throwable -> L6b
            r3.zzg(r2)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzflt r6 = r3.zzm()     // Catch: java.lang.Throwable -> L6b
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L6b
        L69:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L6b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r6
    }
}
