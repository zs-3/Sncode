package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzhi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhk zza;
    private final java.net.URL zzb;
    private final byte[] zzc;
    private final com.google.android.gms.measurement.internal.zzhg zzd;
    private final java.lang.String zze;
    private final java.util.Map zzf;

    public zzhi(com.google.android.gms.measurement.internal.zzhk r1, java.lang.String r2, java.net.URL r3, byte[] r4, java.util.Map r5, com.google.android.gms.measurement.internal.zzhg r6) {
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

    @Override // java.lang.Runnable
    public final void run() {
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.zzhk r1 = r13.zza
            r1.zzaY()
            r2 = 0
            r3 = 0
            java.net.URL r4 = r13.zzb     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            int r5 = com.google.android.gms.internal.measurement.zzcm.zzb     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            if (r5 == 0) goto L106
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            r4.setDefaultUseCaches(r2)     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            com.google.android.gms.measurement.internal.zzio r5 = r1.zzu     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            r5.zzf()     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            r6 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r6)     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            r5.zzf()     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            r6 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r6)     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            r4.setInstanceFollowRedirects(r2)     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            r6 = 1
            r4.setDoInput(r6)     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            java.util.Map r7 = r13.zzf     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            if (r7 == 0) goto L5d
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
        L41:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            if (r8 == 0) goto L5d
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.lang.Object r9 = r8.getKey()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            r4.addRequestProperty(r9, r8)     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            goto L41
        L5d:
            byte[] r7 = r13.zzc     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            if (r7 == 0) goto La3
            com.google.android.gms.measurement.internal.zzpv r1 = r1.zzg     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            com.google.android.gms.measurement.internal.zzqa r1 = r1.zzA()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            byte[] r1 = r1.zzB(r7)     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzj()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.lang.String r7 = "Uploading data. size"
            int r8 = r1.length     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            r5.zzb(r7, r9)     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            r4.setDoOutput(r6)     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            r4.setFixedLengthStreamingMode(r8)     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            r4.connect()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.io.OutputStream r5 = r4.getOutputStream()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            r5.write(r1)     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9d
            r5.close()     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9d
            goto La3
        L98:
            r1 = move-exception
            r8 = r3
            r3 = r5
            goto L111
        L9d:
            r1 = move-exception
            r8 = r1
            r10 = r3
            r3 = r5
            goto L150
        La3:
            int r8 = r4.getResponseCode()     // Catch: java.lang.Throwable -> Lff java.io.IOException -> L102
            java.util.Map r11 = r4.getHeaderFields()     // Catch: java.lang.Throwable -> Lf6 java.io.IOException -> Lfa
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Le6
            r1.<init>()     // Catch: java.lang.Throwable -> Le6
            java.io.InputStream r5 = r4.getInputStream()     // Catch: java.lang.Throwable -> Le6
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Le4
        Lb8:
            int r7 = r5.read(r6)     // Catch: java.lang.Throwable -> Le4
            if (r7 <= 0) goto Lc2
            r1.write(r6, r2, r7)     // Catch: java.lang.Throwable -> Le4
            goto Lb8
        Lc2:
            byte[] r10 = r1.toByteArray()     // Catch: java.lang.Throwable -> Le4
            r5.close()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf2
            r4.disconnect()
            com.google.android.gms.measurement.internal.zzhk r0 = r13.zza
            java.lang.String r6 = r13.zze
            com.google.android.gms.measurement.internal.zzhg r7 = r13.zzd
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzhh r1 = new com.google.android.gms.measurement.internal.zzhh
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        Le0:
            r0.zzq(r1)
            return
        Le4:
            r1 = move-exception
            goto Le8
        Le6:
            r1 = move-exception
            r5 = r3
        Le8:
            if (r5 == 0) goto Led
            r5.close()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf2
        Led:
            throw r1     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf2
        Lee:
            r1 = move-exception
            r5 = r8
            r8 = r11
            goto L112
        Lf2:
            r1 = move-exception
            r7 = r8
            r10 = r11
            goto Lfd
        Lf6:
            r1 = move-exception
            r5 = r8
            r8 = r3
            goto L112
        Lfa:
            r1 = move-exception
            r10 = r3
            r7 = r8
        Lfd:
            r8 = r1
            goto L151
        Lff:
            r1 = move-exception
            r8 = r3
            goto L111
        L102:
            r1 = move-exception
            r8 = r1
            r10 = r3
            goto L150
        L106:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
            throw r1     // Catch: java.lang.Throwable -> L10e java.io.IOException -> L14c
        L10e:
            r1 = move-exception
            r4 = r3
            r8 = r4
        L111:
            r5 = 0
        L112:
            if (r3 == 0) goto L12e
            r3.close()     // Catch: java.io.IOException -> L118
            goto L12e
        L118:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzhk r3 = r13.zza
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r6 = r13.zze
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)
            r3.zzc(r0, r6, r2)
        L12e:
            if (r4 == 0) goto L133
            r4.disconnect()
        L133:
            com.google.android.gms.measurement.internal.zzhk r0 = r13.zza
            java.lang.String r3 = r13.zze
            com.google.android.gms.measurement.internal.zzhg r4 = r13.zzd
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzhh r10 = new com.google.android.gms.measurement.internal.zzhh
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.zzq(r10)
            throw r1
        L14c:
            r1 = move-exception
            r8 = r1
            r4 = r3
            r10 = r4
        L150:
            r7 = 0
        L151:
            if (r3 == 0) goto L16d
            r3.close()     // Catch: java.io.IOException -> L157
            goto L16d
        L157:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzhk r2 = r13.zza
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = r13.zze
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)
            r2.zzc(r0, r3, r1)
        L16d:
            if (r4 == 0) goto L172
            r4.disconnect()
        L172:
            com.google.android.gms.measurement.internal.zzhk r0 = r13.zza
            java.lang.String r5 = r13.zze
            com.google.android.gms.measurement.internal.zzhg r6 = r13.zzd
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzhh r1 = new com.google.android.gms.measurement.internal.zzhh
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto Le0
    }
}
