package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzcp {
    private static volatile com.google.android.gms.internal.auth.zzdh zza;

    static {
            return
    }

    private zzcp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.auth.zzdh zza(android.content.Context r14) {
            java.lang.Class<com.google.android.gms.internal.auth.zzcp> r0 = com.google.android.gms.internal.auth.zzcp.class
            monitor-enter(r0)
            com.google.android.gms.internal.auth.zzdh r1 = com.google.android.gms.internal.auth.zzcp.zza     // Catch: java.lang.Throwable -> L178
            if (r1 != 0) goto L176
            java.lang.String r1 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> L178
            java.lang.String r2 = android.os.Build.TAGS     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "eng"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L178
            if (r3 != 0) goto L1b
            java.lang.String r3 = "userdebug"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L178
            if (r1 == 0) goto L2c
        L1b:
            java.lang.String r1 = "dev-keys"
            boolean r1 = r2.contains(r1)     // Catch: java.lang.Throwable -> L178
            if (r1 != 0) goto L33
            java.lang.String r1 = "test-keys"
            boolean r1 = r2.contains(r1)     // Catch: java.lang.Throwable -> L178
            if (r1 == 0) goto L2c
            goto L33
        L2c:
            com.google.android.gms.internal.auth.zzdh r14 = com.google.android.gms.internal.auth.zzdh.zzc()     // Catch: java.lang.Throwable -> L178
        L30:
            r1 = r14
            goto L16e
        L33:
            boolean r1 = com.google.android.gms.internal.auth.zzcc.zzb()     // Catch: java.lang.Throwable -> L178
            if (r1 == 0) goto L43
            boolean r1 = r14.isDeviceProtectedStorage()     // Catch: java.lang.Throwable -> L178
            if (r1 != 0) goto L43
            android.content.Context r14 = r14.createDeviceProtectedStorageContext()     // Catch: java.lang.Throwable -> L178
        L43:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L178
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L171
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch: java.lang.RuntimeException -> L68 java.lang.Throwable -> L171
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r4 = r14.getDir(r4, r2)     // Catch: java.lang.RuntimeException -> L68 java.lang.Throwable -> L171
            java.lang.String r5 = "overrides.txt"
            r3.<init>(r4, r5)     // Catch: java.lang.RuntimeException -> L68 java.lang.Throwable -> L171
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L171
            if (r4 == 0) goto L63
            com.google.android.gms.internal.auth.zzdh r3 = com.google.android.gms.internal.auth.zzdh.zzd(r3)     // Catch: java.lang.Throwable -> L171
            goto L74
        L63:
            com.google.android.gms.internal.auth.zzdh r3 = com.google.android.gms.internal.auth.zzdh.zzc()     // Catch: java.lang.Throwable -> L171
            goto L74
        L68:
            r3 = move-exception
            java.lang.String r4 = "HermeticFileOverrides"
            java.lang.String r5 = "no data dir"
            android.util.Log.e(r4, r5, r3)     // Catch: java.lang.Throwable -> L171
            com.google.android.gms.internal.auth.zzdh r3 = com.google.android.gms.internal.auth.zzdh.zzc()     // Catch: java.lang.Throwable -> L171
        L74:
            boolean r4 = r3.zzb()     // Catch: java.lang.Throwable -> L171
            if (r4 == 0) goto L165
            java.lang.Object r3 = r3.zza()     // Catch: java.lang.Throwable -> L171
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.io.IOException -> L15e java.lang.Throwable -> L171
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L15e java.lang.Throwable -> L171
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.IOException -> L15e java.lang.Throwable -> L171
            r7 = r3
            java.io.File r7 = (java.io.File) r7     // Catch: java.io.IOException -> L15e java.lang.Throwable -> L171
            r6.<init>(r7)     // Catch: java.io.IOException -> L15e java.lang.Throwable -> L171
            r5.<init>(r6)     // Catch: java.io.IOException -> L15e java.lang.Throwable -> L171
            r4.<init>(r5)     // Catch: java.io.IOException -> L15e java.lang.Throwable -> L171
            r5 = 1
            androidx.collection.SimpleArrayMap r6 = new androidx.collection.SimpleArrayMap     // Catch: java.lang.Throwable -> L142
            r6.<init>()     // Catch: java.lang.Throwable -> L142
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Throwable -> L142
            r7.<init>()     // Catch: java.lang.Throwable -> L142
        L9b:
            java.lang.String r8 = r4.readLine()     // Catch: java.lang.Throwable -> L142
            if (r8 == 0) goto L10f
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch: java.lang.Throwable -> L142
            int r11 = r9.length     // Catch: java.lang.Throwable -> L142
            if (r11 == r10) goto Lc2
            java.lang.String r9 = "HermeticFileOverrides"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L142
            r10.<init>()     // Catch: java.lang.Throwable -> L142
            java.lang.String r11 = "Invalid: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L142
            r10.append(r8)     // Catch: java.lang.Throwable -> L142
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L142
            android.util.Log.e(r9, r8)     // Catch: java.lang.Throwable -> L142
            goto L9b
        Lc2:
            r8 = r9[r2]     // Catch: java.lang.Throwable -> L142
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L142
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L142
            r8 = r9[r5]     // Catch: java.lang.Throwable -> L142
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L142
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L142
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch: java.lang.Throwable -> L142
            r11 = 2
            r12 = r9[r11]     // Catch: java.lang.Throwable -> L142
            java.lang.Object r12 = r7.get(r12)     // Catch: java.lang.Throwable -> L142
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L142
            if (r12 != 0) goto Lf7
            r9 = r9[r11]     // Catch: java.lang.Throwable -> L142
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L142
            r11.<init>(r9)     // Catch: java.lang.Throwable -> L142
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch: java.lang.Throwable -> L142
            int r9 = r12.length()     // Catch: java.lang.Throwable -> L142
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto Lf4
            if (r12 != r11) goto Lf7
        Lf4:
            r7.put(r11, r12)     // Catch: java.lang.Throwable -> L142
        Lf7:
            boolean r9 = r6.containsKey(r10)     // Catch: java.lang.Throwable -> L142
            if (r9 != 0) goto L105
            androidx.collection.SimpleArrayMap r9 = new androidx.collection.SimpleArrayMap     // Catch: java.lang.Throwable -> L142
            r9.<init>()     // Catch: java.lang.Throwable -> L142
            r6.put(r10, r9)     // Catch: java.lang.Throwable -> L142
        L105:
            java.lang.Object r9 = r6.get(r10)     // Catch: java.lang.Throwable -> L142
            androidx.collection.SimpleArrayMap r9 = (androidx.collection.SimpleArrayMap) r9     // Catch: java.lang.Throwable -> L142
            r9.put(r8, r12)     // Catch: java.lang.Throwable -> L142
            goto L9b
        L10f:
            java.lang.String r7 = "HermeticFileOverrides"
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L142
            java.lang.String r14 = r14.getPackageName()     // Catch: java.lang.Throwable -> L142
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L142
            r8.<init>()     // Catch: java.lang.Throwable -> L142
            java.lang.String r9 = "Parsed "
            r8.append(r9)     // Catch: java.lang.Throwable -> L142
            r8.append(r3)     // Catch: java.lang.Throwable -> L142
            java.lang.String r3 = " for Android package "
            r8.append(r3)     // Catch: java.lang.Throwable -> L142
            r8.append(r14)     // Catch: java.lang.Throwable -> L142
            java.lang.String r14 = r8.toString()     // Catch: java.lang.Throwable -> L142
            android.util.Log.w(r7, r14)     // Catch: java.lang.Throwable -> L142
            com.google.android.gms.internal.auth.zzci r14 = new com.google.android.gms.internal.auth.zzci     // Catch: java.lang.Throwable -> L142
            r14.<init>(r6)     // Catch: java.lang.Throwable -> L142
            r4.close()     // Catch: java.io.IOException -> L15e java.lang.Throwable -> L171
            com.google.android.gms.internal.auth.zzdh r14 = com.google.android.gms.internal.auth.zzdh.zzd(r14)     // Catch: java.lang.Throwable -> L171
            goto L169
        L142:
            r14 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L147
            goto L15d
        L147:
            r3 = move-exception
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L15d java.lang.Throwable -> L171
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r2] = r8     // Catch: java.lang.Exception -> L15d java.lang.Throwable -> L171
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r7)     // Catch: java.lang.Exception -> L15d java.lang.Throwable -> L171
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L15d java.lang.Throwable -> L171
            r5[r2] = r3     // Catch: java.lang.Exception -> L15d java.lang.Throwable -> L171
            r4.invoke(r14, r5)     // Catch: java.lang.Exception -> L15d java.lang.Throwable -> L171
        L15d:
            throw r14     // Catch: java.io.IOException -> L15e java.lang.Throwable -> L171
        L15e:
            r14 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L171
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L171
            throw r2     // Catch: java.lang.Throwable -> L171
        L165:
            com.google.android.gms.internal.auth.zzdh r14 = com.google.android.gms.internal.auth.zzdh.zzc()     // Catch: java.lang.Throwable -> L171
        L169:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L178
            goto L30
        L16e:
            com.google.android.gms.internal.auth.zzcp.zza = r1     // Catch: java.lang.Throwable -> L178
            goto L176
        L171:
            r14 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L178
            throw r14     // Catch: java.lang.Throwable -> L178
        L176:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L178
            return r1
        L178:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L178
            throw r14
    }
}
