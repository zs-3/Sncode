package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfmd implements java.lang.Runnable {
    public static final java.lang.Object zza = null;
    public static java.lang.Boolean zzb;
    private static final java.lang.Object zzc = null;
    private static final java.lang.Object zzd = null;
    private final android.content.Context zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzfmj zzg;
    private java.lang.String zzh;
    private int zzi;
    private final com.google.android.gms.internal.ads.zzdrr zzj;
    private final java.util.List zzk;
    private boolean zzl;
    private final com.google.android.gms.internal.ads.zzbwi zzm;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzfmd.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzfmd.zzc = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzfmd.zzd = r0
            return
    }

    public zzfmd(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, com.google.android.gms.internal.ads.zzdrr r3, com.google.android.gms.internal.ads.zzede r4, com.google.android.gms.internal.ads.zzbwi r5) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.zzfmj r4 = com.google.android.gms.internal.ads.zzfmm.zzc()
            r0.zzg = r4
            java.lang.String r4 = ""
            r0.zzh = r4
            r4 = 0
            r0.zzl = r4
            r0.zze = r1
            r0.zzf = r2
            r0.zzj = r3
            r0.zzm = r5
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzit
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
            java.util.List r1 = com.google.android.gms.ads.internal.util.zzt.zzd()
            r0.zzk = r1
            return
        L31:
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzn()
            r0.zzk = r1
            return
    }

    public static boolean zza() {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfmd.zza
            monitor-enter(r0)
            java.lang.Boolean r1 = com.google.android.gms.internal.ads.zzfmd.zzb     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L37
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbek.zzb     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L3f
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L1a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.internal.ads.zzfmd.zzb = r1     // Catch: java.lang.Throwable -> L3f
            goto L37
        L1a:
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbek.zza     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L3f
            java.lang.Double r1 = (java.lang.Double) r1     // Catch: java.lang.Throwable -> L3f
            double r1 = r1.doubleValue()     // Catch: java.lang.Throwable -> L3f
            double r3 = java.lang.Math.random()     // Catch: java.lang.Throwable -> L3f
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L30
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.internal.ads.zzfmd.zzb = r1     // Catch: java.lang.Throwable -> L3f
        L37:
            java.lang.Boolean r1 = com.google.android.gms.internal.ads.zzfmd.zzb     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return r1
        L3f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            boolean r0 = zza()
            if (r0 != 0) goto L7
            goto L6e
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfmd.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfmj r1 = r9.zzg     // Catch: java.lang.Throwable -> L79
            int r1 = r1.zza()     // Catch: java.lang.Throwable -> L79
            if (r1 != 0) goto L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            monitor-enter(r0)     // Catch: java.lang.Exception -> L5e
            com.google.android.gms.internal.ads.zzfmj r1 = r9.zzg     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.internal.ads.zzhbe r1 = r1.zzbn()     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.internal.ads.zzfmm r1 = (com.google.android.gms.internal.ads.zzfmm) r1     // Catch: java.lang.Throwable -> L5b
            byte[] r6 = r1.zzaV()     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.internal.ads.zzfmj r1 = r9.zzg     // Catch: java.lang.Throwable -> L5b
            r1.zzc()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.internal.ads.zzedb r0 = new com.google.android.gms.internal.ads.zzedb     // Catch: java.lang.Exception -> L5e
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzin     // Catch: java.lang.Exception -> L5e
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L5e
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> L5e
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L5e
            r4 = 60000(0xea60, float:8.4078E-41)
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Exception -> L5e
            r5.<init>()     // Catch: java.lang.Exception -> L5e
            java.lang.String r7 = "application/x-protobuf"
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L5e
            android.content.Context r1 = r9.zze     // Catch: java.lang.Exception -> L5e
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r9.zzf     // Catch: java.lang.Exception -> L5e
            java.lang.String r2 = r2.afmaVersion     // Catch: java.lang.Exception -> L5e
            com.google.android.gms.internal.ads.zzbwi r3 = r9.zzm     // Catch: java.lang.Exception -> L5e
            int r4 = android.os.Binder.getCallingUid()     // Catch: java.lang.Exception -> L5e
            com.google.android.gms.internal.ads.zzedd r5 = new com.google.android.gms.internal.ads.zzedd     // Catch: java.lang.Exception -> L5e
            r5.<init>(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L5e
            r5.zzb(r0)     // Catch: java.lang.Exception -> L5e
            return
        L5b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Exception -> L5e
        L5e:
            r0 = move-exception
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzdye
            if (r1 == 0) goto L6f
            r1 = r0
            com.google.android.gms.internal.ads.zzdye r1 = (com.google.android.gms.internal.ads.zzdye) r1
            int r1 = r1.zza()
            r2 = 3
            if (r1 == r2) goto L6e
            goto L6f
        L6e:
            return
        L6f:
            java.lang.String r1 = "CuiMonitor.sendCuiPing"
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            r2.zzv(r0, r1)
            return
        L79:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            throw r1
    }

    public final void zzb(com.google.android.gms.internal.ads.zzflt r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.internal.ads.zzfmc r1 = new com.google.android.gms.internal.ads.zzfmc
            r1.<init>(r2, r3)
            r0.zza(r1)
            return
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzflt r11) {
            r10 = this;
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfmd.zzd
            monitor-enter(r0)
            boolean r1 = r10.zzl     // Catch: java.lang.Throwable -> L15b
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
            goto L71
        L9:
            r1 = 1
            r10.zzl = r1     // Catch: java.lang.Throwable -> L15b
            boolean r1 = zza()     // Catch: java.lang.Throwable -> L15b
            if (r1 != 0) goto L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
            goto L71
        L14:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L20 java.lang.RuntimeException -> L22 java.lang.Throwable -> L15b
            android.content.Context r1 = r10.zze     // Catch: android.os.RemoteException -> L20 java.lang.RuntimeException -> L22 java.lang.Throwable -> L15b
            java.lang.String r1 = com.google.android.gms.ads.internal.util.zzt.zzp(r1)     // Catch: android.os.RemoteException -> L20 java.lang.RuntimeException -> L22 java.lang.Throwable -> L15b
            r10.zzh = r1     // Catch: android.os.RemoteException -> L20 java.lang.RuntimeException -> L22 java.lang.Throwable -> L15b
            goto L2c
        L20:
            r1 = move-exception
            goto L23
        L22:
            r1 = move-exception
        L23:
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L15b
            java.lang.String r3 = "CuiMonitor.gettingAppIdFromManifest"
            r2.zzw(r1, r3)     // Catch: java.lang.Throwable -> L15b
        L2c:
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()     // Catch: java.lang.Throwable -> L15b
            android.content.Context r2 = r10.zze     // Catch: java.lang.Throwable -> L15b
            int r1 = r1.getApkVersion(r2)     // Catch: java.lang.Throwable -> L15b
            r10.zzi = r1     // Catch: java.lang.Throwable -> L15b
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzio     // Catch: java.lang.Throwable -> L15b
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L15b
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L15b
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L15b
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L15b
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzlv     // Catch: java.lang.Throwable -> L15b
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L15b
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> L15b
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L15b
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L15b
            if (r2 == 0) goto L65
            java.util.concurrent.ScheduledExecutorService r3 = com.google.android.gms.internal.ads.zzcan.zzd     // Catch: java.lang.Throwable -> L15b
            long r7 = (long) r1     // Catch: java.lang.Throwable -> L15b
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L15b
            r4 = r10
            r5 = r7
            r3.scheduleWithFixedDelay(r4, r5, r7, r9)     // Catch: java.lang.Throwable -> L15b
            goto L70
        L65:
            java.util.concurrent.ScheduledExecutorService r2 = com.google.android.gms.internal.ads.zzcan.zzd     // Catch: java.lang.Throwable -> L15b
            long r5 = (long) r1     // Catch: java.lang.Throwable -> L15b
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L15b
            r1 = r2
            r2 = r10
            r3 = r5
            r1.scheduleAtFixedRate(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L15b
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
        L71:
            boolean r0 = zza()
            if (r0 != 0) goto L79
            goto L15a
        L79:
            if (r11 == 0) goto L15a
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfmd.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfmj r1 = r10.zzg     // Catch: java.lang.Throwable -> L157
            int r1 = r1.zza()     // Catch: java.lang.Throwable -> L157
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzip     // Catch: java.lang.Throwable -> L157
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L157
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L157
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L157
            if (r1 < r2) goto L98
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L157
            return
        L98:
            com.google.android.gms.internal.ads.zzfmf r1 = com.google.android.gms.internal.ads.zzfmh.zza()     // Catch: java.lang.Throwable -> L157
            int r2 = r11.zzm()     // Catch: java.lang.Throwable -> L157
            r1.zzu(r2)     // Catch: java.lang.Throwable -> L157
            boolean r2 = r11.zzl()     // Catch: java.lang.Throwable -> L157
            r1.zzq(r2)     // Catch: java.lang.Throwable -> L157
            long r2 = r11.zzb()     // Catch: java.lang.Throwable -> L157
            r1.zzg(r2)     // Catch: java.lang.Throwable -> L157
            r2 = 3
            r1.zzw(r2)     // Catch: java.lang.Throwable -> L157
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r10.zzf     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r2.afmaVersion     // Catch: java.lang.Throwable -> L157
            r1.zzn(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r10.zzh     // Catch: java.lang.Throwable -> L157
            r1.zzb(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L157
            r1.zzk(r2)     // Catch: java.lang.Throwable -> L157
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L157
            r1.zzr(r2)     // Catch: java.lang.Throwable -> L157
            int r2 = r11.zzo()     // Catch: java.lang.Throwable -> L157
            r1.zzv(r2)     // Catch: java.lang.Throwable -> L157
            int r2 = r11.zza()     // Catch: java.lang.Throwable -> L157
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L157
            int r2 = r10.zzi     // Catch: java.lang.Throwable -> L157
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L157
            r1.zze(r2)     // Catch: java.lang.Throwable -> L157
            int r2 = r11.zzn()     // Catch: java.lang.Throwable -> L157
            r1.zzt(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r11.zze()     // Catch: java.lang.Throwable -> L157
            r1.zzc(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r11.zzg()     // Catch: java.lang.Throwable -> L157
            r1.zzf(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r11.zzh()     // Catch: java.lang.Throwable -> L157
            r1.zzh(r2)     // Catch: java.lang.Throwable -> L157
            com.google.android.gms.internal.ads.zzdrr r2 = r10.zzj     // Catch: java.lang.Throwable -> L157
            java.lang.String r3 = r11.zzh()     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r2.zzb(r3)     // Catch: java.lang.Throwable -> L157
            r1.zzi(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r11.zzi()     // Catch: java.lang.Throwable -> L157
            r1.zzl(r2)     // Catch: java.lang.Throwable -> L157
            com.google.android.gms.internal.ads.zzfmg r2 = r11.zzd()     // Catch: java.lang.Throwable -> L157
            r1.zzm(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r11.zzf()     // Catch: java.lang.Throwable -> L157
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r11.zzk()     // Catch: java.lang.Throwable -> L157
            r1.zzs(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r2 = r11.zzj()     // Catch: java.lang.Throwable -> L157
            r1.zzo(r2)     // Catch: java.lang.Throwable -> L157
            long r2 = r11.zzc()     // Catch: java.lang.Throwable -> L157
            r1.zzp(r2)     // Catch: java.lang.Throwable -> L157
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzit     // Catch: java.lang.Throwable -> L157
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L157
            java.lang.Object r11 = r2.zza(r11)     // Catch: java.lang.Throwable -> L157
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L157
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L157
            if (r11 == 0) goto L149
            java.util.List r11 = r10.zzk     // Catch: java.lang.Throwable -> L157
            r1.zza(r11)     // Catch: java.lang.Throwable -> L157
        L149:
            com.google.android.gms.internal.ads.zzfmj r11 = r10.zzg     // Catch: java.lang.Throwable -> L157
            com.google.android.gms.internal.ads.zzfmk r2 = com.google.android.gms.internal.ads.zzfml.zza()     // Catch: java.lang.Throwable -> L157
            r2.zza(r1)     // Catch: java.lang.Throwable -> L157
            r11.zzb(r2)     // Catch: java.lang.Throwable -> L157
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L157
            return
        L157:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L157
            throw r11
        L15a:
            return
        L15b:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
            throw r11
    }
}
