package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzad {
    public static android.os.Bundle zza(android.content.Context r1, java.lang.String r2, android.content.SharedPreferences.OnSharedPreferenceChangeListener r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            android.os.Bundle r1 = android.os.Bundle.EMPTY
            return r1
        L9:
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            r0.registerOnSharedPreferenceChangeListener(r3)
            android.os.Bundle r1 = zzb(r1, r2)
            return r1
    }

    public static android.os.Bundle zzb(android.content.Context r10, java.lang.String r11) {
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto L9
        L7:
            r0 = r1
            goto L16
        L9:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lf
            r0.<init>(r11)     // Catch: org.json.JSONException -> Lf
            goto L16
        Lf:
            r11 = move-exception
            java.lang.String r0 = "JSON parsing error"
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r0, r11)
            goto L7
        L16:
            if (r0 != 0) goto L1b
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            return r10
        L1b:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            r2 = 0
            r3 = 0
        L22:
            int r4 = r0.length()
            if (r3 >= r4) goto Lf1
            org.json.JSONObject r4 = r0.optJSONObject(r3)
            java.lang.String r5 = "bk"
            java.lang.String r5 = r4.optString(r5)
            java.lang.String r6 = "sk"
            java.lang.String r6 = r4.optString(r6)
            java.lang.String r7 = "type"
            r8 = -1
            int r4 = r4.optInt(r7, r8)
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L4d
            if (r4 == r8) goto L4b
            if (r4 == r7) goto L49
            r4 = 0
            goto L4e
        L49:
            r4 = 3
            goto L4e
        L4b:
            r4 = 2
            goto L4e
        L4d:
            r4 = 1
        L4e:
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 != 0) goto Led
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 != 0) goto Led
            if (r4 != 0) goto L5e
            goto Led
        L5e:
            r9 = 47
            com.google.android.gms.internal.ads.zzfxn r9 = com.google.android.gms.internal.ads.zzfxn.zzc(r9)
            com.google.android.gms.internal.ads.zzfym r9 = com.google.android.gms.internal.ads.zzfym.zzb(r9)
            java.util.List r6 = r9.zze(r6)
            int r9 = r6.size()
            if (r9 > r7) goto La3
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L79
            goto La3
        L79:
            int r7 = r6.size()
            if (r7 != r8) goto L8a
            android.content.SharedPreferences r7 = android.preference.PreferenceManager.getDefaultSharedPreferences(r10)
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            goto L9a
        L8a:
            java.lang.Object r7 = r6.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences r7 = r10.getSharedPreferences(r7, r2)
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
        L9a:
            java.util.Map r7 = r7.getAll()
            java.lang.Object r6 = r7.get(r6)
            goto La4
        La3:
            r6 = r1
        La4:
            if (r6 == 0) goto Led
            int r4 = r4 + (-1)
            if (r4 == 0) goto Le4
            if (r4 == r8) goto Lba
            boolean r4 = r6 instanceof java.lang.Boolean
            if (r4 == 0) goto Led
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            r11.putBoolean(r5, r4)
            goto Led
        Lba:
            boolean r4 = r6 instanceof java.lang.Integer
            if (r4 == 0) goto Lc8
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r4 = r6.intValue()
            r11.putInt(r5, r4)
            goto Led
        Lc8:
            boolean r4 = r6 instanceof java.lang.Long
            if (r4 == 0) goto Ld6
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r11.putLong(r5, r6)
            goto Led
        Ld6:
            boolean r4 = r6 instanceof java.lang.Float
            if (r4 == 0) goto Led
            java.lang.Float r6 = (java.lang.Float) r6
            float r4 = r6.floatValue()
            r11.putFloat(r5, r4)
            goto Led
        Le4:
            boolean r4 = r6 instanceof java.lang.String
            if (r4 == 0) goto Led
            java.lang.String r6 = (java.lang.String) r6
            r11.putString(r5, r6)
        Led:
            int r3 = r3 + 1
            goto L22
        Lf1:
            return r11
    }

    public static void zzc(android.content.Context r2) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L19
            if (r2 == 0) goto L19
            java.lang.String r0 = "OfflineUpload.db"
            r2.deleteDatabase(r0)
        L19:
            com.google.android.gms.internal.ads.zzfuu r0 = com.google.android.gms.internal.ads.zzfuu.zzj(r2)     // Catch: java.io.IOException -> L55
            com.google.android.gms.internal.ads.zzfuv r2 = com.google.android.gms.internal.ads.zzfuv.zzi(r2)     // Catch: java.io.IOException -> L55
            r0.zzk()     // Catch: java.io.IOException -> L55
            r0.zzl()     // Catch: java.io.IOException -> L55
            r2.zzj()     // Catch: java.io.IOException -> L55
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzda     // Catch: java.io.IOException -> L55
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L55
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.io.IOException -> L55
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.io.IOException -> L55
            boolean r0 = r0.booleanValue()     // Catch: java.io.IOException -> L55
            if (r0 == 0) goto L3f
            r2.zzk()     // Catch: java.io.IOException -> L55
        L3f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdb     // Catch: java.io.IOException -> L55
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L55
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.io.IOException -> L55
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.io.IOException -> L55
            boolean r0 = r0.booleanValue()     // Catch: java.io.IOException -> L55
            if (r0 == 0) goto L54
            r2.zzl()     // Catch: java.io.IOException -> L55
        L54:
            return
        L55:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "clearStorageOnIdlessMode"
            r0.zzw(r2, r1)
            return
    }
}
