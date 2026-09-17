package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeox implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeoq zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfma zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzflp zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdiy zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzeoy zze;

    zzeox(com.google.android.gms.internal.ads.zzeoy r1, com.google.android.gms.internal.ads.zzeoq r2, com.google.android.gms.internal.ads.zzfma r3, com.google.android.gms.internal.ads.zzflp r4, com.google.android.gms.internal.ads.zzdiy r5) {
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
    public final void zza(java.lang.Throwable r5) {
            r4 = this;
            java.lang.String r0 = "Native ad failed to load"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)
            com.google.android.gms.internal.ads.zzdiy r0 = r4.zzd
            com.google.android.gms.internal.ads.zzcum r0 = r0.zza()
            com.google.android.gms.ads.internal.client.zze r0 = r0.zza(r5)
            com.google.android.gms.internal.ads.zzdiy r1 = r4.zzd
            com.google.android.gms.internal.ads.zzcyc r1 = r1.zzb()
            r1.zzdB(r0)
            com.google.android.gms.internal.ads.zzeoy r1 = r4.zze
            com.google.android.gms.internal.ads.zzcho r1 = com.google.android.gms.internal.ads.zzeoy.zzc(r1)
            java.util.concurrent.Executor r1 = r1.zzC()
            com.google.android.gms.internal.ads.zzeow r2 = new com.google.android.gms.internal.ads.zzeow
            r2.<init>(r4, r0)
            r1.execute(r2)
            int r1 = r0.zza
            java.lang.String r2 = "NativeAdLoader.onFailure"
            com.google.android.gms.internal.ads.zzfhz.zzb(r1, r5, r2)
            com.google.android.gms.internal.ads.zzeoq r1 = r4.zza
            r1.zza()
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbek.zzc
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L5b
            com.google.android.gms.internal.ads.zzfma r1 = r4.zzb
            if (r1 == 0) goto L5b
            r1.zzc(r0)
            com.google.android.gms.internal.ads.zzflp r0 = r4.zzc
            r0.zzh(r5)
            r0.zzg(r2)
            r1.zza(r0)
            r1.zzh()
            return
        L5b:
            com.google.android.gms.internal.ads.zzeoy r1 = r4.zze
            com.google.android.gms.internal.ads.zzflp r3 = r4.zzc
            com.google.android.gms.internal.ads.zzfmd r1 = com.google.android.gms.internal.ads.zzeoy.zze(r1)
            r3.zza(r0)
            r3.zzh(r5)
            r3.zzg(r2)
            com.google.android.gms.internal.ads.zzflt r5 = r3.zzm()
            r1.zzb(r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzeoy r0 = r5.zze
            com.google.android.gms.internal.ads.zzcte r6 = (com.google.android.gms.internal.ads.zzcte) r6
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzdci r1 = r6.zzo()     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzeoy r2 = r5.zze     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzeoo r2 = com.google.android.gms.internal.ads.zzeoy.zzd(r2)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzeob r2 = r2.zzd()     // Catch: java.lang.Throwable -> L88
            r1.zza(r2)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzeoq r1 = r5.zza     // Catch: java.lang.Throwable -> L88
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzeoy r1 = r5.zze     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzcho r1 = com.google.android.gms.internal.ads.zzeoy.zzc(r1)     // Catch: java.lang.Throwable -> L88
            java.util.concurrent.Executor r1 = r1.zzC()     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzeov r2 = new com.google.android.gms.internal.ads.zzeov     // Catch: java.lang.Throwable -> L88
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L88
            r1.execute(r2)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L88
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L88
            r2 = 1
            if (r1 == 0) goto L60
            com.google.android.gms.internal.ads.zzfma r1 = r5.zzb     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L60
            com.google.android.gms.internal.ads.zzfgt r3 = r6.zzq()     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzfgs r3 = r3.zzb     // Catch: java.lang.Throwable -> L88
            r1.zzg(r3)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzcxt r6 = r6.zzm()     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = r6.zzg()     // Catch: java.lang.Throwable -> L88
            r1.zze(r6)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzflp r6 = r5.zzc     // Catch: java.lang.Throwable -> L88
            r6.zzg(r2)     // Catch: java.lang.Throwable -> L88
            r1.zza(r6)     // Catch: java.lang.Throwable -> L88
            r1.zzh()     // Catch: java.lang.Throwable -> L88
            goto L86
        L60:
            com.google.android.gms.internal.ads.zzeoy r1 = r5.zze     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzfmd r1 = com.google.android.gms.internal.ads.zzeoy.zze(r1)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzflp r3 = r5.zzc     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzfgt r4 = r6.zzq()     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzfgs r4 = r4.zzb     // Catch: java.lang.Throwable -> L88
            r3.zzb(r4)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzcxt r6 = r6.zzm()     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = r6.zzg()     // Catch: java.lang.Throwable -> L88
            r3.zzd(r6)     // Catch: java.lang.Throwable -> L88
            r3.zzg(r2)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzflt r6 = r3.zzm()     // Catch: java.lang.Throwable -> L88
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L88
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            return
        L88:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            throw r6
    }
}
