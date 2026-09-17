package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzho {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zza;
    private final java.lang.String zzb;
    private final android.os.Bundle zzc;
    private android.os.Bundle zzd;

    public zzho(com.google.android.gms.measurement.internal.zzht r1, java.lang.String r2, android.os.Bundle r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzb = r2
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.zzc = r1
            return
    }

    public final android.os.Bundle zza() {
            r15 = this;
            android.os.Bundle r0 = r15.zzd
            if (r0 == 0) goto L6
            goto L155
        L6:
            com.google.android.gms.measurement.internal.zzht r0 = r15.zza
            java.lang.String r1 = r15.zzb
            android.content.SharedPreferences r2 = r0.zzb()
            r3 = 0
            java.lang.String r1 = r2.getString(r1, r3)
            if (r1 == 0) goto L14d
            android.os.Bundle r2 = new android.os.Bundle     // Catch: org.json.JSONException -> L13c
            r2.<init>()     // Catch: org.json.JSONException -> L13c
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L13c
            r4.<init>(r1)     // Catch: org.json.JSONException -> L13c
            r1 = 0
            r5 = 0
        L21:
            int r6 = r4.length()     // Catch: org.json.JSONException -> L13c
            if (r5 >= r6) goto L139
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "n"
            java.lang.String r7 = r6.getString(r7)     // Catch: java.lang.Throwable -> L124
            java.lang.String r8 = "t"
            java.lang.String r8 = r6.getString(r8)     // Catch: java.lang.Throwable -> L124
            int r9 = r8.hashCode()     // Catch: java.lang.Throwable -> L124
            r10 = 100
            r11 = 4
            r12 = 3
            r13 = 2
            r14 = 1
            if (r9 == r10) goto L7c
            r10 = 108(0x6c, float:1.51E-43)
            if (r9 == r10) goto L72
            r10 = 115(0x73, float:1.61E-43)
            if (r9 == r10) goto L68
            r10 = 3352(0xd18, float:4.697E-42)
            if (r9 == r10) goto L5e
            r10 = 3445(0xd75, float:4.827E-42)
            if (r9 == r10) goto L54
            goto L86
        L54:
            java.lang.String r9 = "la"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L86
            r9 = 4
            goto L87
        L5e:
            java.lang.String r9 = "ia"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L86
            r9 = 3
            goto L87
        L68:
            java.lang.String r9 = "s"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L86
            r9 = 0
            goto L87
        L72:
            java.lang.String r9 = "l"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L86
            r9 = 2
            goto L87
        L7c:
            java.lang.String r9 = "d"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L86
            r9 = 1
            goto L87
        L86:
            r9 = -1
        L87:
            java.lang.String r10 = "v"
            if (r9 == 0) goto L11c
            if (r9 == r14) goto L110
            if (r9 == r13) goto L104
            if (r9 == r12) goto Ld4
            if (r9 == r11) goto La4
            com.google.android.gms.measurement.internal.zzio r6 = r0.zzu     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            java.lang.String r7 = "Unrecognized persisted bundle type. Type"
            r6.zzb(r7, r8)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            goto L135
        La4:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            com.google.android.gms.measurement.internal.zzio r8 = r0.zzu     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            com.google.android.gms.measurement.internal.zzam r8 = r8.zzf()     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            com.google.android.gms.measurement.internal.zzgg r9 = com.google.android.gms.measurement.internal.zzgi.zzaW     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            boolean r8 = r8.zzx(r3, r9)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            if (r8 == 0) goto L135
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            long[] r9 = new long[r6]     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            r10 = 0
        Lc5:
            if (r10 >= r6) goto Ld0
            long r11 = r8.optLong(r10)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            r9[r10] = r11     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            int r10 = r10 + 1
            goto Lc5
        Ld0:
            r2.putLongArray(r7, r9)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            goto L135
        Ld4:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            com.google.android.gms.measurement.internal.zzio r8 = r0.zzu     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            com.google.android.gms.measurement.internal.zzam r8 = r8.zzf()     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            com.google.android.gms.measurement.internal.zzgg r9 = com.google.android.gms.measurement.internal.zzgi.zzaW     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            boolean r8 = r8.zzx(r3, r9)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            if (r8 == 0) goto L135
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            int[] r9 = new int[r6]     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            r10 = 0
        Lf5:
            if (r10 >= r6) goto L100
            int r11 = r8.optInt(r10)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            r9[r10] = r11     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            int r10 = r10 + 1
            goto Lf5
        L100:
            r2.putIntArray(r7, r9)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            goto L135
        L104:
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            long r8 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            r2.putLong(r7, r8)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            goto L135
        L110:
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            double r8 = java.lang.Double.parseDouble(r6)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            r2.putDouble(r7, r8)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            goto L135
        L11c:
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            r2.putString(r7, r6)     // Catch: java.lang.Throwable -> L124 java.lang.Throwable -> L124
            goto L135
        L124:
            com.google.android.gms.measurement.internal.zzht r6 = r15.zza     // Catch: org.json.JSONException -> L13c
            com.google.android.gms.measurement.internal.zzio r6 = r6.zzu     // Catch: org.json.JSONException -> L13c
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()     // Catch: org.json.JSONException -> L13c
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()     // Catch: org.json.JSONException -> L13c
            java.lang.String r7 = "Error reading value from SharedPreferences. Value dropped"
            r6.zza(r7)     // Catch: org.json.JSONException -> L13c
        L135:
            int r5 = r5 + 1
            goto L21
        L139:
            r15.zzd = r2     // Catch: org.json.JSONException -> L13c
            goto L14d
        L13c:
            com.google.android.gms.measurement.internal.zzht r0 = r15.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.zza(r1)
        L14d:
            android.os.Bundle r0 = r15.zzd
            if (r0 != 0) goto L155
            android.os.Bundle r0 = r15.zzc
            r15.zzd = r0
        L155:
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r15.zzd
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.<init>(r1)
            return r0
    }

    public final void zzb(android.os.Bundle r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            if (r0 != 0) goto Ld
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2 = r0
            goto L12
        Ld:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r0)
        L12:
            com.google.android.gms.measurement.internal.zzht r3 = r1.zza
            android.content.SharedPreferences r0 = r3.zzb()
            android.content.SharedPreferences$Editor r4 = r0.edit()
            int r0 = r2.size()
            if (r0 != 0) goto L29
            java.lang.String r0 = r1.zzb
            r4.remove(r0)
            goto L12b
        L29:
            java.lang.String r5 = r1.zzb
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r7 = r0.iterator()
        L38:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L124
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r8 = r2.get(r0)
            if (r8 == 0) goto L38
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L10c
            r9.<init>()     // Catch: org.json.JSONException -> L10c
            java.lang.String r10 = "n"
            r9.put(r10, r0)     // Catch: org.json.JSONException -> L10c
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch: org.json.JSONException -> L10c
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu     // Catch: org.json.JSONException -> L10c
            com.google.android.gms.measurement.internal.zzam r10 = r0.zzf()     // Catch: org.json.JSONException -> L10c
            com.google.android.gms.measurement.internal.zzgg r11 = com.google.android.gms.measurement.internal.zzgi.zzaW     // Catch: org.json.JSONException -> L10c
            r12 = 0
            boolean r10 = r10.zzx(r12, r11)     // Catch: org.json.JSONException -> L10c
            java.lang.String r11 = "Cannot serialize bundle value to SharedPreferences. Type"
            java.lang.String r12 = "d"
            java.lang.String r13 = "l"
            java.lang.String r14 = "s"
            java.lang.String r15 = "v"
            r17 = r3
            java.lang.String r3 = "t"
            if (r10 == 0) goto Lda
            boolean r10 = r8 instanceof java.lang.String     // Catch: org.json.JSONException -> Ld8
            if (r10 == 0) goto L84
            java.lang.String r0 = r8.toString()     // Catch: org.json.JSONException -> Ld8
            r9.put(r15, r0)     // Catch: org.json.JSONException -> Ld8
            r9.put(r3, r14)     // Catch: org.json.JSONException -> Ld8
            goto Lf8
        L84:
            boolean r10 = r8 instanceof java.lang.Long     // Catch: org.json.JSONException -> Ld8
            if (r10 == 0) goto L93
            java.lang.String r0 = r8.toString()     // Catch: org.json.JSONException -> Ld8
            r9.put(r15, r0)     // Catch: org.json.JSONException -> Ld8
            r9.put(r3, r13)     // Catch: org.json.JSONException -> Ld8
            goto Lf8
        L93:
            boolean r10 = r8 instanceof int[]     // Catch: org.json.JSONException -> Ld8
            if (r10 == 0) goto La6
            int[] r8 = (int[]) r8     // Catch: org.json.JSONException -> Ld8
            java.lang.String r0 = java.util.Arrays.toString(r8)     // Catch: org.json.JSONException -> Ld8
            r9.put(r15, r0)     // Catch: org.json.JSONException -> Ld8
            java.lang.String r0 = "ia"
            r9.put(r3, r0)     // Catch: org.json.JSONException -> Ld8
            goto Lf8
        La6:
            boolean r10 = r8 instanceof long[]     // Catch: org.json.JSONException -> Ld8
            if (r10 == 0) goto Lb9
            long[] r8 = (long[]) r8     // Catch: org.json.JSONException -> Ld8
            java.lang.String r0 = java.util.Arrays.toString(r8)     // Catch: org.json.JSONException -> Ld8
            r9.put(r15, r0)     // Catch: org.json.JSONException -> Ld8
            java.lang.String r0 = "la"
            r9.put(r3, r0)     // Catch: org.json.JSONException -> Ld8
            goto Lf8
        Lb9:
            boolean r10 = r8 instanceof java.lang.Double     // Catch: org.json.JSONException -> Ld8
            if (r10 == 0) goto Lc8
            java.lang.String r0 = r8.toString()     // Catch: org.json.JSONException -> Ld8
            r9.put(r15, r0)     // Catch: org.json.JSONException -> Ld8
            r9.put(r3, r12)     // Catch: org.json.JSONException -> Ld8
            goto Lf8
        Lc8:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: org.json.JSONException -> Ld8
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: org.json.JSONException -> Ld8
            java.lang.Class r3 = r8.getClass()     // Catch: org.json.JSONException -> Ld8
            r0.zzb(r11, r3)     // Catch: org.json.JSONException -> Ld8
            goto L120
        Ld8:
            r0 = move-exception
            goto L10f
        Lda:
            java.lang.String r10 = r8.toString()     // Catch: org.json.JSONException -> Ld8
            r9.put(r15, r10)     // Catch: org.json.JSONException -> Ld8
            boolean r10 = r8 instanceof java.lang.String     // Catch: org.json.JSONException -> Ld8
            if (r10 == 0) goto Le9
            r9.put(r3, r14)     // Catch: org.json.JSONException -> Ld8
            goto Lf8
        Le9:
            boolean r10 = r8 instanceof java.lang.Long     // Catch: org.json.JSONException -> Ld8
            if (r10 == 0) goto Lf1
            r9.put(r3, r13)     // Catch: org.json.JSONException -> Ld8
            goto Lf8
        Lf1:
            boolean r10 = r8 instanceof java.lang.Double     // Catch: org.json.JSONException -> Ld8
            if (r10 == 0) goto Lfc
            r9.put(r3, r12)     // Catch: org.json.JSONException -> Ld8
        Lf8:
            r6.put(r9)     // Catch: org.json.JSONException -> Ld8
            goto L120
        Lfc:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: org.json.JSONException -> Ld8
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: org.json.JSONException -> Ld8
            java.lang.Class r3 = r8.getClass()     // Catch: org.json.JSONException -> Ld8
            r0.zzb(r11, r3)     // Catch: org.json.JSONException -> Ld8
            goto L120
        L10c:
            r0 = move-exception
            r17 = r3
        L10f:
            com.google.android.gms.measurement.internal.zzht r3 = r1.zza
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r8 = "Cannot serialize bundle value to SharedPreferences"
            r3.zzb(r8, r0)
        L120:
            r3 = r17
            goto L38
        L124:
            java.lang.String r0 = r6.toString()
            r4.putString(r5, r0)
        L12b:
            r4.apply()
            r1.zzd = r2
            return
    }
}
