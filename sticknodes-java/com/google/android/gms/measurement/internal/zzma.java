package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzma implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmb zza;
    private final java.net.URL zzb;
    private final byte[] zzc;
    private final com.google.android.gms.measurement.internal.zzly zzd;
    private final java.lang.String zze;
    private final java.util.Map zzf;

    public zzma(com.google.android.gms.measurement.internal.zzmb r1, java.lang.String r2, java.net.URL r3, byte[] r4, java.util.Map r5, com.google.android.gms.measurement.internal.zzly r6) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r6
            r0.zze = r2
            r0.zzf = r5
            return
    }

    public static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzma r6, int r7, java.lang.Exception r8, byte[] r9, java.util.Map r10) {
            com.google.android.gms.measurement.internal.zzly r0 = r6.zzd
            java.lang.String r1 = r6.zze
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            return
    }

    private final void zzb(int r9, java.lang.Exception r10, byte[] r11, java.util.Map r12) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzmb r0 = r8.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzlz r7 = new com.google.android.gms.measurement.internal.zzlz
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.zzq(r7)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.zzmb r1 = r11.zza
            r1.zzaY()
            r2 = 0
            r3 = 0
            java.net.URL r4 = r11.zzb     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            int r5 = com.google.android.gms.internal.measurement.zzcm.zzb     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            if (r5 == 0) goto L11a
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            r4.setDefaultUseCaches(r2)     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            r1.zzf()     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            r1.zzf()     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            r5 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r5)     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            r4.setInstanceFollowRedirects(r2)     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            r5 = 1
            r4.setDoInput(r5)     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            java.util.Map r6 = r11.zzf     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            if (r6 == 0) goto L5d
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
        L41:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            if (r7 == 0) goto L5d
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            r4.addRequestProperty(r8, r7)     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            goto L41
        L5d:
            byte[] r6 = r11.zzc     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            if (r6 == 0) goto Lc7
            r1.zzaV()     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> L114
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> L114
            r1.<init>()     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> L114
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> L114
            r7.<init>(r1)     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> L114
            r7.write(r6)     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> L114
            r7.close()     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> L114
            r1.close()     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> L114
            byte[] r1 = r1.toByteArray()     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> L114
            com.google.android.gms.measurement.internal.zzmb r6 = r11.zza     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            com.google.android.gms.measurement.internal.zzio r6 = r6.zzu     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.lang.String r7 = "Uploading data. size"
            int r8 = r1.length     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            r6.zzb(r7, r9)     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            r4.setDoOutput(r5)     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            r4.setFixedLengthStreamingMode(r8)     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            r4.connect()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.io.OutputStream r5 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            r5.write(r1)     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Lb0
            r5.close()     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Lb0
            goto Lc7
        Lac:
            r1 = move-exception
            r6 = r3
            goto L126
        Lb0:
            r1 = move-exception
            r6 = r3
            goto L14f
        Lb4:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzmb r5 = r11.zza     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.lang.String r6 = "Failed to gzip post request content"
            r5.zzb(r6, r1)     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            throw r1     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
        Lc7:
            int r1 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117
            java.util.Map r5 = r4.getHeaderFields()     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L10d
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lf6
            r6.<init>()     // Catch: java.lang.Throwable -> Lf6
            java.io.InputStream r7 = r4.getInputStream()     // Catch: java.lang.Throwable -> Lf6
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> Lf4
        Ldc:
            int r9 = r7.read(r8)     // Catch: java.lang.Throwable -> Lf4
            if (r9 <= 0) goto Le6
            r6.write(r8, r2, r9)     // Catch: java.lang.Throwable -> Lf4
            goto Ldc
        Le6:
            byte[] r2 = r6.toByteArray()     // Catch: java.lang.Throwable -> Lf4
            r7.close()     // Catch: java.lang.Throwable -> Lfe java.io.IOException -> L102
            r4.disconnect()
            r11.zzb(r1, r3, r2, r5)
            return
        Lf4:
            r2 = move-exception
            goto Lf8
        Lf6:
            r2 = move-exception
            r7 = r3
        Lf8:
            if (r7 == 0) goto Lfd
            r7.close()     // Catch: java.lang.Throwable -> Lfe java.io.IOException -> L102
        Lfd:
            throw r2     // Catch: java.lang.Throwable -> Lfe java.io.IOException -> L102
        Lfe:
            r2 = move-exception
            r6 = r5
            r5 = r3
            goto L109
        L102:
            r2 = move-exception
            r6 = r5
            r5 = r3
            goto L110
        L106:
            r2 = move-exception
            r5 = r3
            r6 = r5
        L109:
            r10 = r2
            r2 = r1
            r1 = r10
            goto L126
        L10d:
            r2 = move-exception
            r5 = r3
            r6 = r5
        L110:
            r10 = r2
            r2 = r1
            r1 = r10
            goto L14f
        L114:
            r1 = move-exception
            r5 = r3
            goto L125
        L117:
            r1 = move-exception
            r5 = r3
            goto L14e
        L11a:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
            throw r1     // Catch: java.lang.Throwable -> L122 java.io.IOException -> L14b
        L122:
            r1 = move-exception
            r4 = r3
            r5 = r4
        L125:
            r6 = r5
        L126:
            if (r5 == 0) goto L142
            r5.close()     // Catch: java.io.IOException -> L12c
            goto L142
        L12c:
            r5 = move-exception
            com.google.android.gms.measurement.internal.zzmb r7 = r11.zza
            com.google.android.gms.measurement.internal.zzio r7 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zze()
            java.lang.String r8 = r11.zze
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)
            r7.zzc(r0, r8, r5)
        L142:
            if (r4 == 0) goto L147
            r4.disconnect()
        L147:
            r11.zzb(r2, r3, r3, r6)
            throw r1
        L14b:
            r1 = move-exception
            r4 = r3
            r5 = r4
        L14e:
            r6 = r5
        L14f:
            if (r5 == 0) goto L16b
            r5.close()     // Catch: java.io.IOException -> L155
            goto L16b
        L155:
            r5 = move-exception
            com.google.android.gms.measurement.internal.zzmb r7 = r11.zza
            com.google.android.gms.measurement.internal.zzio r7 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zze()
            java.lang.String r8 = r11.zze
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)
            r7.zzc(r0, r8, r5)
        L16b:
            if (r4 == 0) goto L170
            r4.disconnect()
        L170:
            r11.zzb(r2, r1, r3, r6)
            return
    }
}
