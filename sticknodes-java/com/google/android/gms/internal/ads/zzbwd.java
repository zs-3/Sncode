package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbwd {
    private int zzA;
    private final java.lang.String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private java.lang.String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private java.lang.String zzo;
    private java.lang.String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final java.lang.String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final java.lang.String zzw;
    private final java.lang.String zzx;
    private float zzy;
    private int zzz;

    public zzbwd(android.content.Context r7) {
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.zzbcv.zza(r7)
            r6.zzc(r7)
            r6.zze(r7)
            r6.zzd(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = zzb(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            r6.zzq = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = zzb(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = 0
        L30:
            r6.zzr = r3
            java.lang.String r2 = r1.getCountry()
            r6.zzs = r2
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            boolean r2 = com.google.android.gms.ads.internal.util.client.zzf.zzs()
            r6.zzt = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.isLatchsky(r7)
            r6.zzu = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.isSidewinder(r7)
            r6.zzv = r2
            java.lang.String r1 = r1.getLanguage()
            r6.zzw = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = zzb(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L63
        L61:
            r0 = r2
            goto L8a
        L63:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L68
            goto L61
        L68:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 == 0) goto L61
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
        L8a:
            r6.zzx = r0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r7)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch: java.lang.Exception -> Lb1
            if (r0 == 0) goto Lb2
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb1
            r4.<init>()     // Catch: java.lang.Exception -> Lb1
            r4.append(r3)     // Catch: java.lang.Exception -> Lb1
            r4.append(r1)     // Catch: java.lang.Exception -> Lb1
            r4.append(r0)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb1
            goto Lb2
        Lb1:
        Lb2:
            r6.zzB = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lbb
            goto Lcd
        Lbb:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto Lcd
            float r0 = r7.density
            r6.zzy = r0
            int r0 = r7.widthPixels
            r6.zzz = r0
            int r7 = r7.heightPixels
            r6.zzA = r7
        Lcd:
            return
    }

    public zzbwd(android.content.Context r2, com.google.android.gms.internal.ads.zzbwe r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzbcv.zza(r2)
            r1.zzc(r2)
            r1.zze(r2)
            r1.zzd(r2)
            java.lang.String r0 = android.os.Build.FINGERPRINT
            r1.zzo = r0
            java.lang.String r0 = android.os.Build.DEVICE
            r1.zzp = r0
            boolean r2 = com.google.android.gms.internal.ads.zzbds.zzg(r2)
            r1.zzC = r2
            boolean r2 = r3.zza
            r1.zzq = r2
            boolean r2 = r3.zzb
            r1.zzr = r2
            java.lang.String r2 = r3.zzc
            r1.zzs = r2
            boolean r2 = r3.zzd
            r1.zzt = r2
            boolean r2 = r3.zze
            r1.zzu = r2
            boolean r2 = r3.zzf
            r1.zzv = r2
            java.lang.String r2 = r3.zzg
            r1.zzw = r2
            java.lang.String r2 = r3.zzh
            r1.zzx = r2
            java.lang.String r2 = r3.zzi
            r1.zzB = r2
            float r2 = r3.zzl
            r1.zzy = r2
            int r2 = r3.zzm
            r1.zzz = r2
            int r2 = r3.zzn
            r1.zzA = r2
            return
    }

    private static android.content.pm.ResolveInfo zzb(android.content.pm.PackageManager r2, java.lang.String r3) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L12
            r3 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r2 = r2.resolveActivity(r0, r3)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "DeviceInfo.getResolveInfo"
            r3.zzw(r2, r0)
            r2 = 0
            return r2
    }

    private final void zzc(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "audio"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            r0 = 2
            if (r4 == 0) goto L3b
            int r1 = r4.getMode()     // Catch: java.lang.Throwable -> L31
            r3.zza = r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r4.isMusicActive()     // Catch: java.lang.Throwable -> L31
            r3.zzb = r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r4.isSpeakerphoneOn()     // Catch: java.lang.Throwable -> L31
            r3.zzc = r1     // Catch: java.lang.Throwable -> L31
            r1 = 3
            int r1 = r4.getStreamVolume(r1)     // Catch: java.lang.Throwable -> L31
            r3.zzd = r1     // Catch: java.lang.Throwable -> L31
            int r1 = r4.getRingerMode()     // Catch: java.lang.Throwable -> L31
            r3.zze = r1     // Catch: java.lang.Throwable -> L31
            int r4 = r4.getStreamVolume(r0)     // Catch: java.lang.Throwable -> L31
            r3.zzf = r4     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "DeviceInfo.gatherAudioInfo"
            r1.zzw(r4, r2)
        L3b:
            r4 = -2
            r3.zza = r4
            r4 = 0
            r3.zzb = r4
            r3.zzc = r4
            r3.zzd = r4
            r3.zze = r0
            r3.zzf = r4
            return
    }

    @android.annotation.SuppressLint({"UnprotectedReceiver"})
    private final void zzd(android.content.Context r6) {
            r5 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkE
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L26
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r1 < r3) goto L26
            r1 = 4
            android.content.Intent r6 = r6.registerReceiver(r2, r0, r1)
            goto L2a
        L26:
            android.content.Intent r6 = r6.registerReceiver(r2, r0)
        L2a:
            r0 = 0
            if (r6 == 0) goto L51
            java.lang.String r1 = "status"
            r2 = -1
            int r1 = r6.getIntExtra(r1, r2)
            java.lang.String r3 = "level"
            int r3 = r6.getIntExtra(r3, r2)
            java.lang.String r4 = "scale"
            int r6 = r6.getIntExtra(r4, r2)
            float r2 = (float) r3
            float r6 = (float) r6
            float r2 = r2 / r6
            double r2 = (double) r2
            r5.zzm = r2
            r6 = 2
            r2 = 1
            if (r1 == r6) goto L4d
            r6 = 5
            if (r1 != r6) goto L4e
        L4d:
            r0 = 1
        L4e:
            r5.zzn = r0
            return
        L51:
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r5.zzm = r1
            r5.zzn = r0
            return
    }

    private final void zze(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.zzg = r2
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzii
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r4.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = 0
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.zzi = r2
            int r0 = r0.getPhoneType()
            r5.zzj = r0
            r0 = -2
            r5.zzh = r0
            r5.zzk = r3
            r0 = -1
            r5.zzl = r0
            com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzt.zzA(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.zzh = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.zzl = r6
            goto L69
        L67:
            r5.zzh = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.zzk = r6
        L6f:
            return
    }

    public final com.google.android.gms.internal.ads.zzbwe zza() {
            r35 = this;
            r0 = r35
            com.google.android.gms.internal.ads.zzbwe r32 = new com.google.android.gms.internal.ads.zzbwe
            r1 = r32
            int r2 = r0.zza
            boolean r3 = r0.zzq
            boolean r4 = r0.zzr
            java.lang.String r5 = r0.zzg
            java.lang.String r6 = r0.zzs
            boolean r7 = r0.zzt
            boolean r8 = r0.zzu
            boolean r9 = r0.zzv
            boolean r10 = r0.zzb
            boolean r11 = r0.zzc
            java.lang.String r12 = r0.zzw
            java.lang.String r13 = r0.zzx
            java.lang.String r14 = r0.zzB
            int r15 = r0.zzd
            r33 = r1
            int r1 = r0.zzh
            r16 = r1
            int r1 = r0.zzi
            r17 = r1
            int r1 = r0.zzj
            r18 = r1
            int r1 = r0.zze
            r19 = r1
            int r1 = r0.zzf
            r20 = r1
            float r1 = r0.zzy
            r21 = r1
            int r1 = r0.zzz
            r22 = r1
            int r1 = r0.zzA
            r23 = r1
            r34 = r2
            double r1 = r0.zzm
            r24 = r1
            boolean r1 = r0.zzn
            r26 = r1
            boolean r1 = r0.zzk
            r27 = r1
            int r1 = r0.zzl
            r28 = r1
            java.lang.String r1 = r0.zzo
            r29 = r1
            boolean r1 = r0.zzC
            r30 = r1
            java.lang.String r1 = r0.zzp
            r31 = r1
            r1 = r33
            r2 = r34
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31)
            return r32
    }
}
