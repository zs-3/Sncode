package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdti implements com.google.android.gms.internal.ads.zzdcv, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzcyu, com.google.android.gms.internal.ads.zzcye {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfhu zzb;
    private final com.google.android.gms.internal.ads.zzdud zzc;
    private final com.google.android.gms.internal.ads.zzfgt zzd;
    private final com.google.android.gms.internal.ads.zzfgh zze;
    private final com.google.android.gms.internal.ads.zzeey zzf;
    private final java.lang.String zzg;
    private java.lang.Boolean zzh;
    private final boolean zzi;

    public zzdti(android.content.Context r1, com.google.android.gms.internal.ads.zzfhu r2, com.google.android.gms.internal.ads.zzdud r3, com.google.android.gms.internal.ads.zzfgt r4, com.google.android.gms.internal.ads.zzfgh r5, com.google.android.gms.internal.ads.zzeey r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgC
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zzi = r1
            r0.zzg = r7
            return
    }

    private final com.google.android.gms.internal.ads.zzduc zzd(java.lang.String r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzfgt r0 = r5.zzd
            com.google.android.gms.internal.ads.zzfgs r0 = r0.zzb
            com.google.android.gms.internal.ads.zzdud r1 = r5.zzc
            com.google.android.gms.internal.ads.zzduc r1 = r1.zza()
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            r1.zzd(r0)
            com.google.android.gms.internal.ads.zzfgh r0 = r5.zze
            r1.zzc(r0)
            java.lang.String r0 = "action"
            r1.zzb(r0, r6)
            java.lang.String r6 = r5.zzg
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toUpperCase(r0)
            java.lang.String r0 = "ad_format"
            r1.zzb(r0, r6)
            com.google.android.gms.internal.ads.zzfgh r6 = r5.zze
            java.util.List r6 = r6.zzt
            boolean r6 = r6.isEmpty()
            r0 = 0
            if (r6 != 0) goto L40
            com.google.android.gms.internal.ads.zzfgh r6 = r5.zze
            java.util.List r6 = r6.zzt
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r2 = "ancn"
            r1.zzb(r2, r6)
        L40:
            com.google.android.gms.internal.ads.zzfgh r6 = r5.zze
            boolean r6 = r6.zzai
            r2 = 1
            if (r6 == 0) goto L75
            android.content.Context r6 = r5.zza
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            boolean r6 = r3.zzA(r6)
            if (r2 == r6) goto L56
            java.lang.String r6 = "offline"
            goto L58
        L56:
            java.lang.String r6 = "online"
        L58:
            java.lang.String r3 = "device_connectivity"
            r1.zzb(r3, r6)
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r6.currentTimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "event_timestamp"
            r1.zzb(r3, r6)
            java.lang.String r6 = "offline_ad"
            java.lang.String r3 = "1"
            r1.zzb(r6, r3)
        L75:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzgK
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r3.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lbb
            com.google.android.gms.internal.ads.zzfgt r6 = r5.zzd
            com.google.android.gms.internal.ads.zzfgq r6 = r6.zza
            com.google.android.gms.internal.ads.zzfhc r6 = r6.zza
            int r6 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(r6)
            if (r6 == r2) goto L94
            r0 = 1
        L94:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "scar"
            r1.zzb(r2, r6)
            if (r0 == 0) goto Lbb
            com.google.android.gms.internal.ads.zzfgt r6 = r5.zzd
            com.google.android.gms.internal.ads.zzfgq r6 = r6.zza
            com.google.android.gms.internal.ads.zzfhc r6 = r6.zza
            com.google.android.gms.ads.internal.client.zzm r6 = r6.zzd
            java.lang.String r0 = r6.zzp
            java.lang.String r2 = "ragent"
            r1.zzb(r2, r0)
            java.lang.String r6 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(r6)
            java.lang.String r6 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(r6)
            java.lang.String r0 = "rtype"
            r1.zzb(r0, r6)
        Lbb:
            return r1
    }

    private final void zze(com.google.android.gms.internal.ads.zzduc r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r7.zze
            boolean r0 = r0.zzai
            if (r0 == 0) goto L27
            java.lang.String r5 = r8.zze()
            com.google.android.gms.internal.ads.zzefa r8 = new com.google.android.gms.internal.ads.zzefa
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r0.currentTimeMillis()
            com.google.android.gms.internal.ads.zzfgt r0 = r7.zzd
            com.google.android.gms.internal.ads.zzfgs r0 = r0.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            java.lang.String r4 = r0.zzb
            r6 = 2
            r1 = r8
            r1.<init>(r2, r4, r5, r6)
            com.google.android.gms.internal.ads.zzeey r0 = r7.zzf
            r0.zzd(r8)
            return
        L27:
            r8.zzf()
            return
    }

    private final boolean zzf() {
            r4 = this;
            java.lang.Boolean r0 = r4.zzh
            if (r0 != 0) goto L40
            monitor-enter(r4)
            java.lang.Boolean r0 = r4.zzh     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L3b
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbw     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r4.zza     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = com.google.android.gms.ads.internal.util.zzt.zzp(r1)     // Catch: android.os.RemoteException -> L1f java.lang.Throwable -> L3d
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = 0
            if (r0 == 0) goto L35
            if (r1 != 0) goto L26
            goto L35
        L26:
            boolean r2 = java.util.regex.Pattern.matches(r0, r1)     // Catch: java.lang.RuntimeException -> L2b java.lang.Throwable -> L3d
            goto L35
        L2b:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "CsiActionsListener.isPatternMatched"
            r1.zzw(r0, r3)     // Catch: java.lang.Throwable -> L3d
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L3d
            r4.zzh = r0     // Catch: java.lang.Throwable -> L3d
        L3b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            throw r0
        L40:
            java.lang.Boolean r0 = r4.zzh
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r1.zze
            boolean r0 = r0.zzai
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "click"
            com.google.android.gms.internal.ads.zzduc r0 = r1.zzd(r0)
            r1.zze(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zza(com.google.android.gms.ads.internal.client.zze r6) {
            r5 = this;
            boolean r0 = r5.zzi
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            com.google.android.gms.internal.ads.zzduc r0 = r5.zzd(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "adapter"
            r0.zzb(r1, r2)
            int r1 = r6.zza
            java.lang.String r2 = r6.zzb
            java.lang.String r3 = r6.zzc
            java.lang.String r4 = "com.google.android.gms.ads"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            com.google.android.gms.ads.internal.client.zze r3 = r6.zzd
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.zzc
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L32
            com.google.android.gms.ads.internal.client.zze r6 = r6.zzd
            int r1 = r6.zza
            java.lang.String r2 = r6.zzb
        L32:
            if (r1 < 0) goto L3d
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "arec"
            r0.zzb(r1, r6)
        L3d:
            com.google.android.gms.internal.ads.zzfhu r6 = r5.zzb
            java.lang.String r6 = r6.zza(r2)
            if (r6 == 0) goto L4a
            java.lang.String r1 = "areec"
            r0.zzb(r1, r6)
        L4a:
            r0.zzf()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzb() {
            r3 = this;
            boolean r0 = r3.zzi
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            com.google.android.gms.internal.ads.zzduc r0 = r3.zzd(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "blocked"
            r0.zzb(r1, r2)
            r0.zzf()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzc(com.google.android.gms.internal.ads.zzdij r4) {
            r3 = this;
            boolean r0 = r3.zzi
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            com.google.android.gms.internal.ads.zzduc r0 = r3.zzd(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "exception"
            r0.zzb(r1, r2)
            java.lang.String r1 = r4.getMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L25
            java.lang.String r4 = r4.getMessage()
            java.lang.String r1 = "msg"
            r0.zzb(r1, r4)
        L25:
            r0.zzf()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzi() {
            r1 = this;
            boolean r0 = r1.zzf()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "adapter_shown"
            com.google.android.gms.internal.ads.zzduc r0 = r1.zzd(r0)
            r0.zzf()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzj() {
            r1 = this;
            boolean r0 = r1.zzf()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "adapter_impression"
            com.google.android.gms.internal.ads.zzduc r0 = r1.zzd(r0)
            r0.zzf()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
            r1 = this;
            boolean r0 = r1.zzf()
            if (r0 != 0) goto Ld
            com.google.android.gms.internal.ads.zzfgh r0 = r1.zze
            boolean r0 = r0.zzai
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.String r0 = "impression"
            com.google.android.gms.internal.ads.zzduc r0 = r1.zzd(r0)
            r1.zze(r0)
            return
    }
}
