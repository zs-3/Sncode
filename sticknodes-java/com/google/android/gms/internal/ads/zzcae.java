package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcae {
    long zza;
    long zzb;
    int zzc;
    int zzd;
    long zze;
    final java.lang.String zzf;
    int zzg;
    int zzh;
    int zzi;
    private final java.lang.Object zzj;
    private final com.google.android.gms.ads.internal.util.zzg zzk;

    public zzcae(java.lang.String r3, com.google.android.gms.ads.internal.util.zzg r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.zza = r0
            r2.zzb = r0
            r0 = -1
            r2.zzc = r0
            r2.zzd = r0
            r0 = 0
            r2.zze = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzj = r0
            r0 = 0
            r2.zzg = r0
            r2.zzh = r0
            r2.zzi = r0
            r2.zzf = r3
            r2.zzk = r4
            return
    }

    private final void zzi() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbey.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.zzj
            monitor-enter(r0)
            int r1 = r2.zzc     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + (-1)
            r2.zzc = r1     // Catch: java.lang.Throwable -> L1f
            int r1 = r2.zzd     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + (-1)
            r2.zzd = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
        L22:
            return
    }

    public final int zza() {
            r2 = this;
            java.lang.Object r0 = r2.zzj
            monitor-enter(r0)
            int r1 = r2.zzi     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final android.os.Bundle zzb(android.content.Context r8, java.lang.String r9) {
            r7 = this;
            java.lang.Object r0 = r7.zzj
            monitor-enter(r0)
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> La1
            r1.<init>()     // Catch: java.lang.Throwable -> La1
            com.google.android.gms.ads.internal.util.zzg r2 = r7.zzk     // Catch: java.lang.Throwable -> La1
            boolean r2 = r2.zzS()     // Catch: java.lang.Throwable -> La1
            if (r2 != 0) goto L17
            java.lang.String r2 = "session_id"
            java.lang.String r3 = r7.zzf     // Catch: java.lang.Throwable -> La1
            r1.putString(r2, r3)     // Catch: java.lang.Throwable -> La1
        L17:
            java.lang.String r2 = "basets"
            long r3 = r7.zzb     // Catch: java.lang.Throwable -> La1
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "currts"
            long r3 = r7.zza     // Catch: java.lang.Throwable -> La1
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "seq_num"
            r1.putString(r2, r9)     // Catch: java.lang.Throwable -> La1
            java.lang.String r9 = "preqs"
            int r2 = r7.zzc     // Catch: java.lang.Throwable -> La1
            r1.putInt(r9, r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r9 = "preqs_in_session"
            int r2 = r7.zzd     // Catch: java.lang.Throwable -> La1
            r1.putInt(r9, r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r9 = "time_in_session"
            long r2 = r7.zze     // Catch: java.lang.Throwable -> La1
            r1.putLong(r9, r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r9 = "pclick"
            int r2 = r7.zzg     // Catch: java.lang.Throwable -> La1
            r1.putInt(r9, r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r9 = "pimp"
            int r2 = r7.zzh     // Catch: java.lang.Throwable -> La1
            r1.putInt(r9, r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r9 = "support_transparent_background"
            android.content.Context r8 = com.google.android.gms.internal.ads.zzbwk.zza(r8)     // Catch: java.lang.Throwable -> La1
            android.content.res.Resources r2 = r8.getResources()     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = "Theme.Translucent"
            java.lang.String r4 = "style"
            java.lang.String r5 = "android"
            int r2 = r2.getIdentifier(r3, r4, r5)     // Catch: java.lang.Throwable -> La1
            r3 = 0
            if (r2 != 0) goto L6a
            java.lang.String r8 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r8)     // Catch: java.lang.Throwable -> La1
            goto L93
        L6a:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r8.getPackageName()     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = "com.google.android.gms.ads.AdActivity"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> La1
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89 java.lang.Throwable -> La1
            android.content.pm.ActivityInfo r8 = r8.getActivityInfo(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89 java.lang.Throwable -> La1
            int r8 = r8.theme     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89 java.lang.Throwable -> La1
            if (r2 != r8) goto L83
            r3 = 1
            goto L93
        L83:
            java.lang.String r8 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89 java.lang.Throwable -> La1
            goto L93
        L89:
            java.lang.String r8 = "Fail to fetch AdActivity theme"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r8)     // Catch: java.lang.Throwable -> La1
            java.lang.String r8 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r8)     // Catch: java.lang.Throwable -> La1
        L93:
            r1.putBoolean(r9, r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r8 = "consent_form_action_identifier"
            int r9 = r7.zza()     // Catch: java.lang.Throwable -> La1
            r1.putInt(r8, r9)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            return r1
        La1:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            throw r8
    }

    public final void zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zzj
            monitor-enter(r0)
            int r1 = r2.zzg     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + 1
            r2.zzg = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final void zzd() {
            r2 = this;
            java.lang.Object r0 = r2.zzj
            monitor-enter(r0)
            int r1 = r2.zzh     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + 1
            r2.zzh = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final void zze() {
            r0 = this;
            r0.zzi()
            return
    }

    public final void zzf() {
            r0 = this;
            r0.zzi()
            return
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzm r11, long r12) {
            r10 = this;
            java.lang.Object r0 = r10.zzj
            monitor-enter(r0)
            com.google.android.gms.ads.internal.util.zzg r1 = r10.zzk     // Catch: java.lang.Throwable -> L85
            long r1 = r1.zzd()     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L85
            long r3 = r3.currentTimeMillis()     // Catch: java.lang.Throwable -> L85
            long r5 = r10.zzb     // Catch: java.lang.Throwable -> L85
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L40
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzaX     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r5 = r6.zza(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L85
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L85
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L33
            r1 = -1
            r10.zzd = r1     // Catch: java.lang.Throwable -> L85
            goto L3b
        L33:
            com.google.android.gms.ads.internal.util.zzg r1 = r10.zzk     // Catch: java.lang.Throwable -> L85
            int r1 = r1.zzc()     // Catch: java.lang.Throwable -> L85
            r10.zzd = r1     // Catch: java.lang.Throwable -> L85
        L3b:
            r10.zzb = r12     // Catch: java.lang.Throwable -> L85
            r10.zza = r12     // Catch: java.lang.Throwable -> L85
            goto L42
        L40:
            r10.zza = r12     // Catch: java.lang.Throwable -> L85
        L42:
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzdA     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r12 = r13.zza(r12)     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L85
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L85
            r13 = 1
            if (r12 != 0) goto L64
            android.os.Bundle r11 = r11.zzc     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L64
            java.lang.String r12 = "gw"
            r1 = 2
            int r11 = r11.getInt(r12, r1)     // Catch: java.lang.Throwable -> L85
            if (r11 != r13) goto L64
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            return
        L64:
            int r11 = r10.zzc     // Catch: java.lang.Throwable -> L85
            int r11 = r11 + r13
            r10.zzc = r11     // Catch: java.lang.Throwable -> L85
            int r11 = r10.zzd     // Catch: java.lang.Throwable -> L85
            int r11 = r11 + r13
            r10.zzd = r11     // Catch: java.lang.Throwable -> L85
            if (r11 != 0) goto L7a
            r11 = 0
            r10.zze = r11     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.internal.util.zzg r11 = r10.zzk     // Catch: java.lang.Throwable -> L85
            r11.zzE(r3)     // Catch: java.lang.Throwable -> L85
            goto L83
        L7a:
            com.google.android.gms.ads.internal.util.zzg r11 = r10.zzk     // Catch: java.lang.Throwable -> L85
            long r11 = r11.zze()     // Catch: java.lang.Throwable -> L85
            long r3 = r3 - r11
            r10.zze = r3     // Catch: java.lang.Throwable -> L85
        L83:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            return
        L85:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            throw r11
    }

    public final void zzh() {
            r2 = this;
            java.lang.Object r0 = r2.zzj
            monitor-enter(r0)
            int r1 = r2.zzi     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + 1
            r2.zzi = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
