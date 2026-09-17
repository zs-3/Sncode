package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzerc implements com.google.android.gms.internal.ads.zzexh {
    private static final java.lang.Object zzb = null;
    final android.content.Context zza;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final long zze;
    private final com.google.android.gms.internal.ads.zzcuy zzf;
    private final com.google.android.gms.internal.ads.zzfik zzg;
    private final com.google.android.gms.internal.ads.zzfhc zzh;
    private final com.google.android.gms.ads.internal.util.zzg zzi;
    private final com.google.android.gms.internal.ads.zzdty zzj;
    private final com.google.android.gms.internal.ads.zzcvl zzk;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzerc.zzb = r0
            return
    }

    public zzerc(android.content.Context r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.internal.ads.zzcuy r4, com.google.android.gms.internal.ads.zzfik r5, com.google.android.gms.internal.ads.zzfhc r6, com.google.android.gms.internal.ads.zzdty r7, com.google.android.gms.internal.ads.zzcvl r8, long r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zzf = r4
            r0.zzg = r5
            r0.zzh = r6
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r1 = r1.zzi()
            r0.zzi = r1
            r0.zzj = r7
            r0.zzk = r8
            r0.zze = r9
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r6 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.internal.ads.zzdty r1 = r6.zzj
            java.util.Map r1 = r1.zzb()
            java.lang.String r2 = r6.zzc
            java.lang.String r3 = "seq_num"
            r1.put(r3, r2)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L52
            com.google.android.gms.internal.ads.zzdty r1 = r6.zzj
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.currentTimeMillis()
            long r4 = r6.zze
            long r2 = r2 - r4
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "tsacc"
            r1.zzc(r3, r2)
            com.google.android.gms.internal.ads.zzdty r1 = r6.zzj
            com.google.android.gms.ads.internal.zzu.zzp()
            r2 = 1
            android.content.Context r3 = r6.zza
            boolean r3 = com.google.android.gms.ads.internal.util.zzt.zzG(r3)
            if (r2 == r3) goto L4b
            java.lang.String r2 = "1"
            goto L4d
        L4b:
            java.lang.String r2 = "0"
        L4d:
            java.lang.String r3 = "foreground"
            r1.zzc(r3, r2)
        L52:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzft
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L76
            com.google.android.gms.internal.ads.zzcuy r1 = r6.zzf
            com.google.android.gms.internal.ads.zzfhc r2 = r6.zzh
            com.google.android.gms.ads.internal.client.zzm r2 = r2.zzd
            r1.zzk(r2)
            com.google.android.gms.internal.ads.zzfik r1 = r6.zzg
            android.os.Bundle r1 = r1.zzb()
            r0.putAll(r1)
        L76:
            com.google.android.gms.internal.ads.zzerb r1 = new com.google.android.gms.internal.ads.zzerb
            r1.<init>(r6, r0)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            return r0
    }

    final /* synthetic */ void zzc(android.os.Bundle r4, android.os.Bundle r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzft
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
            java.lang.String r0 = "quality_signals"
            r5.putBundle(r0, r4)
            goto L5a
        L18:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzfs
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L46
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzerc.zzb
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzcuy r0 = r3.zzf     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.zzfhc r1 = r3.zzh     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.ads.internal.client.zzm r1 = r1.zzd     // Catch: java.lang.Throwable -> L43
            r0.zzk(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "quality_signals"
            com.google.android.gms.internal.ads.zzfik r1 = r3.zzg     // Catch: java.lang.Throwable -> L43
            android.os.Bundle r1 = r1.zzb()     // Catch: java.lang.Throwable -> L43
            r5.putBundle(r0, r1)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
            goto L5a
        L43:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
            throw r5
        L46:
            com.google.android.gms.internal.ads.zzcuy r4 = r3.zzf
            com.google.android.gms.internal.ads.zzfhc r0 = r3.zzh
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            r4.zzk(r0)
            com.google.android.gms.internal.ads.zzfik r4 = r3.zzg
            java.lang.String r0 = "quality_signals"
            android.os.Bundle r4 = r4.zzb()
            r5.putBundle(r0, r4)
        L5a:
            java.lang.String r4 = r3.zzc
            java.lang.String r0 = "seq_num"
            r5.putString(r0, r4)
            com.google.android.gms.ads.internal.util.zzg r4 = r3.zzi
            boolean r4 = r4.zzS()
            if (r4 != 0) goto L70
            java.lang.String r4 = r3.zzd
            java.lang.String r0 = "session_id"
            r5.putString(r0, r4)
        L70:
            com.google.android.gms.ads.internal.util.zzg r4 = r3.zzi
            boolean r4 = r4.zzS()
            r4 = r4 ^ 1
            java.lang.String r0 = "client_purpose_one"
            r5.putBoolean(r0, r4)
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzfu
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Laa
            java.lang.String r4 = "_app_id"
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L9e java.lang.RuntimeException -> La0
            android.content.Context r0 = r3.zza     // Catch: android.os.RemoteException -> L9e java.lang.RuntimeException -> La0
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzt.zzp(r0)     // Catch: android.os.RemoteException -> L9e java.lang.RuntimeException -> La0
            r5.putString(r4, r0)     // Catch: android.os.RemoteException -> L9e java.lang.RuntimeException -> La0
            goto Laa
        L9e:
            r4 = move-exception
            goto La1
        La0:
            r4 = move-exception
        La1:
            java.lang.String r0 = "AppStatsSignal_AppId"
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            r1.zzw(r4, r0)
        Laa:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzfv
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lea
            com.google.android.gms.internal.ads.zzfhc r4 = r3.zzh
            java.lang.String r4 = r4.zzf
            if (r4 == 0) goto Lea
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            com.google.android.gms.internal.ads.zzcvl r0 = r3.zzk
            com.google.android.gms.internal.ads.zzfhc r1 = r3.zzh
            java.lang.String r2 = "dload"
            java.lang.String r1 = r1.zzf
            long r0 = r0.zzb(r1)
            r4.putLong(r2, r0)
            com.google.android.gms.internal.ads.zzcvl r0 = r3.zzk
            com.google.android.gms.internal.ads.zzfhc r1 = r3.zzh
            java.lang.String r2 = "pcc"
            java.lang.String r1 = r1.zzf
            int r0 = r0.zza(r1)
            r4.putInt(r2, r0)
            java.lang.String r0 = "ad_unit_quality_signals"
            r5.putBundle(r0, r4)
        Lea:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzjn
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L113
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()
            int r4 = r4.zza()
            if (r4 <= 0) goto L113
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()
            int r4 = r4.zza()
            java.lang.String r0 = "nrwv"
            r5.putInt(r0, r4)
        L113:
            return
    }
}
