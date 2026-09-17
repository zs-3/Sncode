package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbct implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    volatile boolean zza;
    private final java.lang.Object zzb;
    private final android.os.ConditionVariable zzc;
    private volatile boolean zzd;
    private android.content.SharedPreferences zze;
    private android.os.Bundle zzf;
    private android.content.Context zzg;
    private org.json.JSONObject zzh;
    private boolean zzi;
    private boolean zzj;

    public zzbct() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzb = r0
            android.os.ConditionVariable r0 = new android.os.ConditionVariable
            r0.<init>()
            r2.zzc = r0
            r0 = 0
            r2.zzd = r0
            r2.zza = r0
            r1 = 0
            r2.zze = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2.zzf = r1
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2.zzh = r1
            r2.zzi = r0
            r2.zzj = r0
            return
    }

    private final void zzg(android.content.SharedPreferences r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.google.android.gms.internal.ads.zzbcq r0 = new com.google.android.gms.internal.ads.zzbcq     // Catch: org.json.JSONException -> L15
            r0.<init>(r2)     // Catch: org.json.JSONException -> L15
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzbcx.zza(r0)     // Catch: org.json.JSONException -> L15
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L15
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L15
            r0.<init>(r2)     // Catch: org.json.JSONException -> L15
            r1.zzh = r0     // Catch: org.json.JSONException -> L15
        L15:
            return
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "flag_configuration"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lb
            r1.zzg(r2)
        Lb:
            return
    }

    public final java.lang.Object zza(com.google.android.gms.internal.ads.zzbcm r4) {
            r3 = this;
            android.os.ConditionVariable r0 = r3.zzc
            r1 = 5000(0x1388, double:2.4703E-320)
            boolean r0 = r0.block(r1)
            if (r0 != 0) goto L1e
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            boolean r1 = r3.zza     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Flags.initialize() was not called!"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r4     // Catch: java.lang.Throwable -> L1b
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L1e:
            boolean r0 = r3.zzd
            if (r0 == 0) goto L2a
            android.content.SharedPreferences r0 = r3.zze
            if (r0 == 0) goto L2a
            boolean r0 = r3.zzj
            if (r0 == 0) goto L3b
        L2a:
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            boolean r1 = r3.zzd     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L74
            android.content.SharedPreferences r1 = r3.zze     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L74
            boolean r1 = r3.zzj     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L3a
            goto L74
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
        L3b:
            int r0 = r4.zze()
            r1 = 2
            if (r0 != r1) goto L50
            android.os.Bundle r0 = r3.zzf
            if (r0 != 0) goto L4b
            java.lang.Object r4 = r4.zzk()
            return r4
        L4b:
            java.lang.Object r4 = r4.zzb(r0)
            return r4
        L50:
            int r0 = r4.zze()
            r1 = 1
            if (r0 != r1) goto L6a
            org.json.JSONObject r0 = r3.zzh
            java.lang.String r1 = r4.zzl()
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L6a
            org.json.JSONObject r0 = r3.zzh
            java.lang.Object r4 = r4.zza(r0)
            return r4
        L6a:
            com.google.android.gms.internal.ads.zzbcr r0 = new com.google.android.gms.internal.ads.zzbcr
            r0.<init>(r3, r4)
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbcx.zza(r0)
            return r4
        L74:
            java.lang.Object r4 = r4.zzk()     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
            return r4
        L7a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
            throw r4
    }

    public final java.lang.Object zzb(com.google.android.gms.internal.ads.zzbcm r2) {
            r1 = this;
            boolean r0 = r1.zzd
            if (r0 != 0) goto Ld
            boolean r0 = r1.zza
            if (r0 != 0) goto Ld
            java.lang.Object r2 = r2.zzk()
            return r2
        Ld:
            java.lang.Object r2 = r1.zza(r2)
            return r2
    }

    final /* synthetic */ java.lang.Object zzc(com.google.android.gms.internal.ads.zzbcm r2) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.zze
            java.lang.Object r2 = r2.zzc(r0)
            return r2
    }

    public final void zzd(android.content.Context r11) {
            r10 = this;
            boolean r0 = r10.zzd
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = r10.zzb
            monitor-enter(r0)
            boolean r1 = r10.zzd     // Catch: java.lang.Throwable -> L15b
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
            return
        Le:
            boolean r1 = r10.zza     // Catch: java.lang.Throwable -> L15b
            r2 = 1
            if (r1 != 0) goto L15
            r10.zza = r2     // Catch: java.lang.Throwable -> L15b
        L15:
            java.lang.String r1 = r11.getPackageName()     // Catch: java.lang.Throwable -> L15b
            java.lang.String r3 = "com.google.android.gms"
            boolean r1 = android.text.TextUtils.equals(r1, r3)     // Catch: java.lang.Throwable -> L15b
            r10.zzi = r1     // Catch: java.lang.Throwable -> L15b
            android.content.Context r1 = r11.getApplicationContext()     // Catch: java.lang.Throwable -> L15b
            if (r1 == 0) goto L2b
            android.content.Context r11 = r11.getApplicationContext()     // Catch: java.lang.Throwable -> L15b
        L2b:
            r10.zzg = r11     // Catch: java.lang.Throwable -> L15b
            com.google.android.gms.common.wrappers.PackageManagerWrapper r11 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r11)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L15b
            android.content.Context r1 = r10.zzg     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L15b
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L15b
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r1, r3)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L15b
            android.os.Bundle r11 = r11.metaData     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L15b
            r10.zzf = r11     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L15b
        L41:
            r11 = 0
            android.content.Context r1 = r10.zzg     // Catch: java.lang.Throwable -> L152
            android.content.Context r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r1)     // Catch: java.lang.Throwable -> L152
            if (r3 != 0) goto L52
            if (r1 == 0) goto L52
            android.content.Context r3 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L152
            if (r3 == 0) goto L53
        L52:
            r1 = r3
        L53:
            if (r1 == 0) goto L5d
            com.google.android.gms.ads.internal.client.zzbe.zzb()     // Catch: java.lang.Throwable -> L152
            android.content.SharedPreferences r3 = com.google.android.gms.internal.ads.zzbco.zza(r1)     // Catch: java.lang.Throwable -> L152
            goto L5e
        L5d:
            r3 = 0
        L5e:
            if (r3 == 0) goto L68
            com.google.android.gms.internal.ads.zzbcs r4 = new com.google.android.gms.internal.ads.zzbcs     // Catch: java.lang.Throwable -> L152
            r4.<init>(r10, r3)     // Catch: java.lang.Throwable -> L152
            com.google.android.gms.internal.ads.zzbfi.zzc(r4)     // Catch: java.lang.Throwable -> L152
        L68:
            boolean r3 = r10.zzi     // Catch: java.lang.Throwable -> L152
            r4 = 0
            if (r3 != 0) goto La0
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbej.zzd     // Catch: java.lang.Throwable -> L152
            java.lang.Object r6 = r3.zze()     // Catch: java.lang.Throwable -> L152
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L152
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L152
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto La0
            android.content.Context r6 = r10.zzg     // Catch: java.lang.Throwable -> L152
            int r6 = com.google.android.gms.internal.ads.zzbcf.zza(r6)     // Catch: java.lang.Throwable -> L152
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L152
            java.lang.Object r3 = r3.zze()     // Catch: java.lang.Throwable -> L152
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L152
            long r8 = r3.longValue()     // Catch: java.lang.Throwable -> L152
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto La0
            r10.zzj = r2     // Catch: java.lang.Throwable -> L152
            r10.zzd = r2     // Catch: java.lang.Throwable -> L152
            r10.zza = r11     // Catch: java.lang.Throwable -> L15b
            android.os.ConditionVariable r11 = r10.zzc     // Catch: java.lang.Throwable -> L15b
            r11.open()     // Catch: java.lang.Throwable -> L15b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
            return
        La0:
            boolean r3 = r10.zzi     // Catch: java.lang.Throwable -> L152
            if (r3 != 0) goto Ld6
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbej.zzf     // Catch: java.lang.Throwable -> L152
            java.lang.Object r6 = r3.zze()     // Catch: java.lang.Throwable -> L152
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L152
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L152
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto Ld6
            android.content.Context r4 = r10.zzg     // Catch: java.lang.Throwable -> L152
            int r4 = com.google.android.gms.internal.ads.zzbcf.zzb(r4)     // Catch: java.lang.Throwable -> L152
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L152
            java.lang.Object r3 = r3.zze()     // Catch: java.lang.Throwable -> L152
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L152
            long r6 = r3.longValue()     // Catch: java.lang.Throwable -> L152
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 < 0) goto Ld6
            r10.zzj = r2     // Catch: java.lang.Throwable -> L152
            r10.zzd = r2     // Catch: java.lang.Throwable -> L152
            r10.zza = r11     // Catch: java.lang.Throwable -> L15b
            android.os.ConditionVariable r11 = r10.zzc     // Catch: java.lang.Throwable -> L15b
            r11.open()     // Catch: java.lang.Throwable -> L15b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
            return
        Ld6:
            android.content.Context r3 = r10.zzg     // Catch: java.lang.Throwable -> L152
            com.google.android.gms.internal.ads.zzbeb r4 = com.google.android.gms.internal.ads.zzber.zzh     // Catch: java.lang.Throwable -> L152
            java.lang.Object r4 = r4.zze()     // Catch: java.lang.Throwable -> L152
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L152
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L152
            if (r4 == 0) goto Le7
            goto L115
        Le7:
            com.google.android.gms.internal.ads.zzbeb r4 = com.google.android.gms.internal.ads.zzber.zzi     // Catch: java.lang.Throwable -> L152
            java.lang.Object r4 = r4.zze()     // Catch: java.lang.Throwable -> L152
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L152
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L152
            if (r4 == 0) goto L119
            java.lang.String r4 = "admob"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r11)     // Catch: java.lang.Throwable -> L152
            if (r3 == 0) goto L119
            com.google.android.gms.internal.ads.zzbcp r4 = new com.google.android.gms.internal.ads.zzbcp     // Catch: java.lang.Throwable -> L152
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L152
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbcx.zza(r4)     // Catch: java.lang.Throwable -> L152
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L152
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L118 java.lang.Throwable -> L152
            r4.<init>(r3)     // Catch: org.json.JSONException -> L118 java.lang.Throwable -> L152
            java.lang.String r3 = "local_flags_enabled"
            boolean r3 = r4.optBoolean(r3)     // Catch: org.json.JSONException -> L118 java.lang.Throwable -> L152
            if (r3 == 0) goto L119
        L115:
            android.content.Context r1 = r10.zzg     // Catch: java.lang.Throwable -> L152
            goto L119
        L118:
        L119:
            if (r1 != 0) goto L124
            r10.zza = r11     // Catch: java.lang.Throwable -> L15b
            android.os.ConditionVariable r11 = r10.zzc     // Catch: java.lang.Throwable -> L15b
            r11.open()     // Catch: java.lang.Throwable -> L15b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
            return
        L124:
            com.google.android.gms.ads.internal.client.zzbe.zzb()     // Catch: java.lang.Throwable -> L152
            android.content.SharedPreferences r1 = com.google.android.gms.internal.ads.zzbco.zza(r1)     // Catch: java.lang.Throwable -> L152
            r10.zze = r1     // Catch: java.lang.Throwable -> L152
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzber.zza     // Catch: java.lang.Throwable -> L152
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L152
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L152
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L152
            if (r1 != 0) goto L142
            android.content.SharedPreferences r1 = r10.zze     // Catch: java.lang.Throwable -> L152
            if (r1 == 0) goto L142
            r1.registerOnSharedPreferenceChangeListener(r10)     // Catch: java.lang.Throwable -> L152
        L142:
            android.content.SharedPreferences r1 = r10.zze     // Catch: java.lang.Throwable -> L152
            r10.zzg(r1)     // Catch: java.lang.Throwable -> L152
            r10.zzd = r2     // Catch: java.lang.Throwable -> L152
            r10.zza = r11     // Catch: java.lang.Throwable -> L15b
            android.os.ConditionVariable r11 = r10.zzc     // Catch: java.lang.Throwable -> L15b
            r11.open()     // Catch: java.lang.Throwable -> L15b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
            return
        L152:
            r1 = move-exception
            r10.zza = r11     // Catch: java.lang.Throwable -> L15b
            android.os.ConditionVariable r11 = r10.zzc     // Catch: java.lang.Throwable -> L15b
            r11.open()     // Catch: java.lang.Throwable -> L15b
            throw r1     // Catch: java.lang.Throwable -> L15b
        L15b:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15b
            throw r11
    }

    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }

    final boolean zzf() {
            r1 = this;
            boolean r0 = r1.zzi
            return r0
    }
}
