package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbyl implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private final android.content.Context zza;
    private final android.content.SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private java.lang.String zzd;
    private int zze;

    zzbyl(android.content.Context r2, com.google.android.gms.ads.internal.util.zzg r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "-1"
            r1.zzd = r0
            r0 = -1
            r1.zze = r0
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            r1.zzb = r0
            r1.zzc = r3
            r1.zza = r2
            return
    }

    private final void zzb() {
            r2 = this;
            com.google.android.gms.ads.internal.util.zzg r0 = r2.zzc
            r1 = 1
            r0.zzI(r1)
            android.content.Context r0 = r2.zza
            com.google.android.gms.ads.internal.util.zzad.zzc(r0)
            return
    }

    private final void zzc(java.lang.String r5, int r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaD
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 49
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2d
            if (r6 == 0) goto L39
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L39
            char r6 = r5.charAt(r2)
            if (r6 == r1) goto L3a
            java.lang.String r6 = "-1"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3a
            goto L39
        L2d:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L39
            char r5 = r5.charAt(r2)
            if (r5 == r1) goto L3a
        L39:
            r2 = 1
        L3a:
            com.google.android.gms.ads.internal.util.zzg r5 = r4.zzc
            r5.zzI(r2)
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzfX
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5c
            if (r2 == 0) goto L5c
            android.content.Context r5 = r4.zza
            if (r5 == 0) goto L5c
            java.lang.String r6 = "OfflineUpload.db"
            r5.deleteDatabase(r6)
        L5c:
            return
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzaF     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lb9
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = "-1"
            r3 = -1
            java.lang.String r4 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L55
            boolean r0 = java.util.Objects.equals(r10, r4)     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L34
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> Lb9
            int r10 = r10.zzb()     // Catch: java.lang.Throwable -> Lb9
            if (r9 == r10) goto L2e
            r8.zzb()     // Catch: java.lang.Throwable -> Lb9
        L2e:
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> Lb9
            r10.zzF(r9)     // Catch: java.lang.Throwable -> Lb9
            return
        L34:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = java.util.Objects.equals(r10, r0)     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lb8
            java.lang.String r9 = r9.getString(r10, r2)     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r10 = r10.zzp()     // Catch: java.lang.Throwable -> Lb9
            boolean r10 = java.util.Objects.equals(r9, r10)     // Catch: java.lang.Throwable -> Lb9
            if (r10 != 0) goto L4f
            r8.zzb()     // Catch: java.lang.Throwable -> Lb9
        L4f:
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> Lb9
            r10.zzO(r9)     // Catch: java.lang.Throwable -> Lb9
            return
        L55:
            java.lang.String r1 = r9.getString(r0, r2)     // Catch: java.lang.Throwable -> Lb9
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> Lb9
            int r5 = r10.hashCode()     // Catch: java.lang.Throwable -> Lb9
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L79
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L71
            goto L81
        L71:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L81
            r10 = 1
            goto L82
        L79:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L81
            r10 = 0
            goto L82
        L81:
            r10 = -1
        L82:
            if (r10 == 0) goto La5
            if (r10 == r7) goto L87
            goto Lb8
        L87:
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzaD     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r10 = r0.zza(r10)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb9
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb9
            if (r10 == 0) goto Lb8
            if (r9 == r3) goto Lb8
            int r10 = r8.zze     // Catch: java.lang.Throwable -> Lb9
            if (r10 == r9) goto Lb8
            r8.zze = r9     // Catch: java.lang.Throwable -> Lb9
            r8.zzc(r1, r9)     // Catch: java.lang.Throwable -> Lb9
            return
        La5:
            boolean r10 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lb9
            if (r10 != 0) goto Lb8
            java.lang.String r10 = r8.zzd     // Catch: java.lang.Throwable -> Lb9
            boolean r10 = r10.equals(r1)     // Catch: java.lang.Throwable -> Lb9
            if (r10 != 0) goto Lb8
            r8.zzd = r1     // Catch: java.lang.Throwable -> Lb9
            r8.zzc(r1, r9)     // Catch: java.lang.Throwable -> Lb9
        Lb8:
            return
        Lb9:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzcad r10 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            r10.zzw(r9, r0)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            com.google.android.gms.ads.internal.util.zze.zzb(r10, r9)
            return
    }

    final void zza() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.zzb
            r0.registerOnSharedPreferenceChangeListener(r2)
            android.content.SharedPreferences r0 = r2.zzb
            java.lang.String r1 = "gad_has_consent_for_cookies"
            r2.onSharedPreferenceChanged(r0, r1)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaF
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L26
            android.content.SharedPreferences r0 = r2.zzb
            java.lang.String r1 = "IABTCF_TCString"
            r2.onSharedPreferenceChanged(r0, r1)
            return
        L26:
            android.content.SharedPreferences r0 = r2.zzb
            java.lang.String r1 = "IABTCF_PurposeConsents"
            r2.onSharedPreferenceChanged(r0, r1)
            return
    }
}
