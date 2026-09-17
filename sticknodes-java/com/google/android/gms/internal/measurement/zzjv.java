package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzjv {
    private static volatile com.google.common.base.Optional zza;

    static {
            return
    }

    private zzjv() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.base.Optional zza(android.content.Context r13) {
            com.google.common.base.Optional r0 = com.google.android.gms.internal.measurement.zzjv.zza
            if (r0 != 0) goto L168
            java.lang.Class<com.google.android.gms.internal.measurement.zzjv> r1 = com.google.android.gms.internal.measurement.zzjv.class
            monitor-enter(r1)
            com.google.common.base.Optional r0 = com.google.android.gms.internal.measurement.zzjv.zza     // Catch: java.lang.Throwable -> L165
            if (r0 != 0) goto L163
            java.lang.String r0 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> L165
            java.lang.String r2 = android.os.Build.TAGS     // Catch: java.lang.Throwable -> L165
            int r3 = com.google.android.gms.internal.measurement.zzjx.zza     // Catch: java.lang.Throwable -> L165
            java.lang.String r3 = "eng"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> L165
            if (r3 != 0) goto L21
            java.lang.String r3 = "userdebug"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L165
            if (r0 == 0) goto L32
        L21:
            java.lang.String r0 = "dev-keys"
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L165
            if (r0 != 0) goto L38
            java.lang.String r0 = "test-keys"
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L165
            if (r0 == 0) goto L32
            goto L38
        L32:
            com.google.common.base.Optional r13 = com.google.common.base.Optional.absent()     // Catch: java.lang.Throwable -> L165
            goto L15a
        L38:
            boolean r0 = com.google.android.gms.internal.measurement.zzji.zzc()     // Catch: java.lang.Throwable -> L165
            if (r0 == 0) goto L48
            boolean r0 = r13.isDeviceProtectedStorage()     // Catch: java.lang.Throwable -> L165
            if (r0 != 0) goto L48
            android.content.Context r13 = r13.createDeviceProtectedStorageContext()     // Catch: java.lang.Throwable -> L165
        L48:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L165
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L15e
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch: java.lang.RuntimeException -> L6d java.lang.Throwable -> L15e
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r4 = r13.getDir(r4, r2)     // Catch: java.lang.RuntimeException -> L6d java.lang.Throwable -> L15e
            java.lang.String r5 = "overrides.txt"
            r3.<init>(r4, r5)     // Catch: java.lang.RuntimeException -> L6d java.lang.Throwable -> L15e
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L15e
            if (r4 == 0) goto L68
            com.google.common.base.Optional r3 = com.google.common.base.Optional.of(r3)     // Catch: java.lang.Throwable -> L15e
            goto L79
        L68:
            com.google.common.base.Optional r3 = com.google.common.base.Optional.absent()     // Catch: java.lang.Throwable -> L15e
            goto L79
        L6d:
            r3 = move-exception
            java.lang.String r4 = "HermeticFileOverrides"
            java.lang.String r5 = "no data dir"
            android.util.Log.e(r4, r5, r3)     // Catch: java.lang.Throwable -> L15e
            com.google.common.base.Optional r3 = com.google.common.base.Optional.absent()     // Catch: java.lang.Throwable -> L15e
        L79:
            boolean r4 = r3.isPresent()     // Catch: java.lang.Throwable -> L15e
            if (r4 == 0) goto L153
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L15e
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L15e
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.io.IOException -> L14c java.lang.Throwable -> L15e
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L14c java.lang.Throwable -> L15e
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.IOException -> L14c java.lang.Throwable -> L15e
            r6.<init>(r3)     // Catch: java.io.IOException -> L14c java.lang.Throwable -> L15e
            r5.<init>(r6)     // Catch: java.io.IOException -> L14c java.lang.Throwable -> L15e
            r4.<init>(r5)     // Catch: java.io.IOException -> L14c java.lang.Throwable -> L15e
            androidx.collection.SimpleArrayMap r5 = new androidx.collection.SimpleArrayMap     // Catch: java.lang.Throwable -> L142
            r5.<init>()     // Catch: java.lang.Throwable -> L142
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L142
            r6.<init>()     // Catch: java.lang.Throwable -> L142
        L9e:
            java.lang.String r7 = r4.readLine()     // Catch: java.lang.Throwable -> L142
            if (r7 == 0) goto L10f
            java.lang.String r8 = " "
            r9 = 3
            java.lang.String[] r8 = r7.split(r8, r9)     // Catch: java.lang.Throwable -> L142
            int r10 = r8.length     // Catch: java.lang.Throwable -> L142
            if (r10 == r9) goto Lc5
            java.lang.String r8 = "HermeticFileOverrides"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L142
            r9.<init>()     // Catch: java.lang.Throwable -> L142
            java.lang.String r10 = "Invalid: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L142
            r9.append(r7)     // Catch: java.lang.Throwable -> L142
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L142
            android.util.Log.e(r8, r7)     // Catch: java.lang.Throwable -> L142
            goto L9e
        Lc5:
            r7 = r8[r2]     // Catch: java.lang.Throwable -> L142
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L142
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L142
            r7 = 1
            r7 = r8[r7]     // Catch: java.lang.Throwable -> L142
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L142
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L142
            java.lang.String r7 = android.net.Uri.decode(r10)     // Catch: java.lang.Throwable -> L142
            r10 = 2
            r11 = r8[r10]     // Catch: java.lang.Throwable -> L142
            java.lang.Object r11 = r6.get(r11)     // Catch: java.lang.Throwable -> L142
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L142
            if (r11 != 0) goto Lfb
            r8 = r8[r10]     // Catch: java.lang.Throwable -> L142
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L142
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L142
            java.lang.String r11 = android.net.Uri.decode(r10)     // Catch: java.lang.Throwable -> L142
            int r8 = r11.length()     // Catch: java.lang.Throwable -> L142
            r12 = 1024(0x400, float:1.435E-42)
            if (r8 < r12) goto Lf8
            if (r11 != r10) goto Lfb
        Lf8:
            r6.put(r10, r11)     // Catch: java.lang.Throwable -> L142
        Lfb:
            java.lang.Object r8 = r5.get(r9)     // Catch: java.lang.Throwable -> L142
            androidx.collection.SimpleArrayMap r8 = (androidx.collection.SimpleArrayMap) r8     // Catch: java.lang.Throwable -> L142
            if (r8 != 0) goto L10b
            androidx.collection.SimpleArrayMap r8 = new androidx.collection.SimpleArrayMap     // Catch: java.lang.Throwable -> L142
            r8.<init>()     // Catch: java.lang.Throwable -> L142
            r5.put(r9, r8)     // Catch: java.lang.Throwable -> L142
        L10b:
            r8.put(r7, r11)     // Catch: java.lang.Throwable -> L142
            goto L9e
        L10f:
            java.lang.String r2 = "HermeticFileOverrides"
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L142
            java.lang.String r13 = r13.getPackageName()     // Catch: java.lang.Throwable -> L142
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L142
            r6.<init>()     // Catch: java.lang.Throwable -> L142
            java.lang.String r7 = "Parsed "
            r6.append(r7)     // Catch: java.lang.Throwable -> L142
            r6.append(r3)     // Catch: java.lang.Throwable -> L142
            java.lang.String r3 = " for Android package "
            r6.append(r3)     // Catch: java.lang.Throwable -> L142
            r6.append(r13)     // Catch: java.lang.Throwable -> L142
            java.lang.String r13 = r6.toString()     // Catch: java.lang.Throwable -> L142
            android.util.Log.w(r2, r13)     // Catch: java.lang.Throwable -> L142
            com.google.android.gms.internal.measurement.zzjo r13 = new com.google.android.gms.internal.measurement.zzjo     // Catch: java.lang.Throwable -> L142
            r13.<init>(r5)     // Catch: java.lang.Throwable -> L142
            r4.close()     // Catch: java.io.IOException -> L14c java.lang.Throwable -> L15e
            com.google.common.base.Optional r13 = com.google.common.base.Optional.of(r13)     // Catch: java.lang.Throwable -> L15e
            goto L157
        L142:
            r13 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L147
            goto L14b
        L147:
            r2 = move-exception
            r13.addSuppressed(r2)     // Catch: java.io.IOException -> L14c java.lang.Throwable -> L15e
        L14b:
            throw r13     // Catch: java.io.IOException -> L14c java.lang.Throwable -> L15e
        L14c:
            r13 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L15e
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L15e
            throw r2     // Catch: java.lang.Throwable -> L15e
        L153:
            com.google.common.base.Optional r13 = com.google.common.base.Optional.absent()     // Catch: java.lang.Throwable -> L15e
        L157:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L165
        L15a:
            com.google.android.gms.internal.measurement.zzjv.zza = r13     // Catch: java.lang.Throwable -> L165
            r0 = r13
            goto L163
        L15e:
            r13 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L165
            throw r13     // Catch: java.lang.Throwable -> L165
        L163:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L165
            goto L168
        L165:
            r13 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L165
            throw r13
        L168:
            return r0
    }
}
