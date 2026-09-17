package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdy extends com.google.android.gms.internal.ads.zzcdv {
    public static final /* synthetic */ int zzd = 0;
    private static final java.util.Set zze = null;
    private static final java.text.DecimalFormat zzf = null;
    private java.io.File zzg;
    private boolean zzh;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            com.google.android.gms.internal.ads.zzcdy.zze = r0
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "#,###"
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzcdy.zzf = r0
            return
    }

    public zzcdy(com.google.android.gms.internal.ads.zzccj r4) {
            r3 = this;
            r3.<init>(r4)
            android.content.Context r4 = r3.zza
            java.io.File r4 = r4.getCacheDir()
            if (r4 != 0) goto L11
            java.lang.String r4 = "Context.getCacheDir() returned null"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
        L11:
            java.io.File r0 = new java.io.File
            com.google.android.gms.internal.ads.zzftn r1 = com.google.android.gms.internal.ads.zzftl.zza()
            java.lang.String r2 = "admobVideoStreams"
            java.lang.String r4 = com.google.android.gms.internal.ads.zzftm.zza(r1, r4, r2)
            r0.<init>(r4)
            r3.zzg = r0
            boolean r4 = r0.isDirectory()
            r0 = 0
            if (r4 != 0) goto L48
            java.io.File r4 = r3.zzg
            boolean r4 = r4.mkdirs()
            if (r4 == 0) goto L32
            goto L48
        L32:
            java.io.File r4 = r3.zzg
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Could not create preload cache directory at "
            java.lang.String r4 = r1.concat(r4)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            r3.zzg = r0
            return
        L48:
            java.io.File r4 = r3.zzg
            r1 = 1
            r2 = 0
            boolean r4 = r4.setReadable(r1, r2)
            if (r4 == 0) goto L5c
            java.io.File r4 = r3.zzg
            boolean r4 = r4.setExecutable(r1, r2)
            if (r4 != 0) goto L5b
            goto L5c
        L5b:
            return
        L5c:
            java.io.File r4 = r3.zzg
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Could not set cache file permissions at "
            java.lang.String r4 = r1.concat(r4)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            r3.zzg = r0
            return
    }

    private final java.io.File zza(java.io.File r5) {
            r4 = this;
            java.io.File r0 = new java.io.File
            com.google.android.gms.internal.ads.zzftn r1 = com.google.android.gms.internal.ads.zzftl.zza()
            java.io.File r2 = r4.zzg
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r3 = ".done"
            java.lang.String r5 = r5.concat(r3)
            java.lang.String r5 = com.google.android.gms.internal.ads.zzftm.zza(r1, r2, r5)
            r0.<init>(r5)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzf() {
            r1 = this;
            r0 = 1
            r1.zzh = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzt(java.lang.String r30) {
            r29 = this;
            r8 = r29
            r9 = r30
            java.io.File r0 = r8.zzg
            r10 = 0
            r11 = 0
            if (r0 == 0) goto L43d
        La:
            java.io.File r0 = r8.zzg
            if (r0 != 0) goto L10
            r3 = 0
            goto L2c
        L10:
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L17:
            if (r2 >= r1) goto L2c
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".done"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L29
            int r3 = r3 + 1
        L29:
            int r2 = r2 + 1
            goto L17
        L2c:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzo
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 <= r0) goto L90
            java.io.File r0 = r8.zzg
            if (r0 != 0) goto L43
            goto L85
        L43:
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = r11
            r4 = 0
        L4f:
            if (r4 >= r1) goto L6c
            r6 = r0[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r12 = ".done"
            boolean r7 = r7.endsWith(r12)
            if (r7 != 0) goto L69
            long r12 = r6.lastModified()
            int r7 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r7 >= 0) goto L69
            r5 = r6
            r2 = r12
        L69:
            int r4 = r4 + 1
            goto L4f
        L6c:
            if (r5 == 0) goto L82
            boolean r0 = r5.delete()
            java.io.File r1 = r8.zza(r5)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L83
            boolean r1 = r1.delete()
            r0 = r0 & r1
            goto L83
        L82:
            r0 = 0
        L83:
            if (r0 != 0) goto La
        L85:
            java.lang.String r0 = "Unable to expire stream cache"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            java.lang.String r0 = "expireFailed"
            r8.zzg(r9, r11, r0, r11)
            return r10
        L90:
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zzf(r30)
            java.io.File r12 = new java.io.File
            com.google.android.gms.internal.ads.zzftn r1 = com.google.android.gms.internal.ads.zzftl.zza()
            java.io.File r2 = r8.zzg
            java.lang.String r0 = com.google.android.gms.internal.ads.zzftm.zza(r1, r2, r0)
            r12.<init>(r0)
            java.io.File r0 = r8.zza(r12)
            boolean r1 = r12.isFile()
            r13 = 1
            if (r1 == 0) goto Lcf
            boolean r1 = r0.isFile()
            if (r1 != 0) goto Lb5
            goto Lcf
        Lb5:
            long r0 = r12.length()
            int r1 = (int) r0
            java.lang.String r0 = java.lang.String.valueOf(r30)
            java.lang.String r2 = "Stream cache hit at "
            java.lang.String r0 = r2.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            java.lang.String r0 = r12.getAbsolutePath()
            r8.zzh(r9, r0, r1)
            return r13
        Lcf:
            java.io.File r1 = r8.zzg
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r30)
            java.util.Set r3 = com.google.android.gms.internal.ads.zzcdy.zze
            java.lang.String r14 = r1.concat(r2)
            monitor-enter(r3)
            boolean r1 = r3.contains(r14)     // Catch: java.lang.Throwable -> L43a
            if (r1 == 0) goto L109
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43a
            r0.<init>()     // Catch: java.lang.Throwable -> L43a
            java.lang.String r1 = "Stream cache already in progress at "
            r0.append(r1)     // Catch: java.lang.Throwable -> L43a
            r0.append(r9)     // Catch: java.lang.Throwable -> L43a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43a
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L43a
            java.lang.String r0 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L43a
            java.lang.String r1 = "inProgress"
            r8.zzg(r9, r0, r1, r11)     // Catch: java.lang.Throwable -> L43a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43a
            return r10
        L109:
            r3.add(r14)     // Catch: java.lang.Throwable -> L43a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43a
            java.lang.String r15 = "error"
            com.google.android.gms.internal.ads.zzfui r1 = com.google.android.gms.internal.ads.zzftw.zza()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            com.google.android.gms.internal.ads.zzcdx r2 = new com.google.android.gms.internal.ads.zzcdx     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r2.<init>(r9)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r4 = 265(0x109, float:3.71E-43)
            r5 = -1
            java.net.HttpURLConnection r1 = r1.zzn(r2, r4, r5)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            boolean r2 = r1 instanceof java.net.HttpURLConnection     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            if (r2 == 0) goto L16e
            int r2 = r1.getResponseCode()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r4 = 400(0x190, float:5.6E-43)
            if (r2 >= r4) goto L12c
            goto L16e
        L12c:
            java.lang.String r15 = "badUrl"
            java.lang.String r0 = java.lang.Integer.toString(r2)     // Catch: java.lang.RuntimeException -> L167 java.io.IOException -> L169
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L167 java.io.IOException -> L169
            r1.<init>()     // Catch: java.lang.RuntimeException -> L167 java.io.IOException -> L169
            java.lang.String r3 = "HTTP request failed. Code: "
            r1.append(r3)     // Catch: java.lang.RuntimeException -> L167 java.io.IOException -> L169
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L167 java.io.IOException -> L169
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L167 java.io.IOException -> L169
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
            r3.<init>()     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
            java.lang.String r4 = "HTTP status code "
            r3.append(r4)     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
            java.lang.String r2 = " at "
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
            r3.append(r9)     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
            java.lang.String r2 = r3.toString()     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
            r0.<init>(r2)     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
            throw r0     // Catch: java.lang.RuntimeException -> L162 java.io.IOException -> L164
        L162:
            r0 = move-exception
            goto L165
        L164:
            r0 = move-exception
        L165:
            r2 = r1
            goto L16b
        L167:
            r0 = move-exception
            goto L16a
        L169:
            r0 = move-exception
        L16a:
            r2 = r11
        L16b:
            r1 = r14
            goto L3c6
        L16e:
            int r7 = r1.getContentLength()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            if (r7 >= 0) goto L195
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r0.<init>()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r1 = "Stream cache aborted, missing content-length header at "
            r0.append(r1)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r0.append(r9)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r0 = r0.toString()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r0 = r12.getAbsolutePath()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r1 = "contentLengthMissing"
            r8.zzg(r9, r0, r1, r11)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r3.remove(r14)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            return r10
        L195:
            java.text.DecimalFormat r2 = com.google.android.gms.internal.ads.zzcdy.zzf     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            long r4 = (long) r7     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r2 = r2.format(r4)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzp     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.Object r4 = r5.zza(r4)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            int r6 = r4.intValue()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            if (r7 <= r6) goto L1e8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r0.<init>()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r1 = "Content length "
            r0.append(r1)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r0.append(r2)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r1 = " exceeds limit at "
            r0.append(r1)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r0.append(r9)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r0 = r0.toString()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r0.<init>()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r1 = "File too big for full file cache. Size: "
            r0.append(r1)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r0.append(r2)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r0 = r0.toString()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r1 = r12.getAbsolutePath()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r2 = "sizeExceeded"
            r8.zzg(r9, r1, r2, r0)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r3.remove(r14)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            return r10
        L1e8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r3.<init>()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r4 = "Caching "
            r3.append(r4)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r2 = " bytes from "
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r3.append(r9)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.lang.String r2 = r3.toString()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.nio.channels.ReadableByteChannel r5 = java.nio.channels.Channels.newChannel(r1)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            r4.<init>(r12)     // Catch: java.lang.RuntimeException -> L3bc java.io.IOException -> L3be
            java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            com.google.android.gms.common.util.Clock r16 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            long r17 = r16.currentTimeMillis()     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzF     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            java.lang.Object r1 = r11.zza(r1)     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            long r10 = r1.longValue()     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            com.google.android.gms.ads.internal.util.zzbx r1 = new com.google.android.gms.ads.internal.util.zzbx     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            r1.<init>(r10)     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzE     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            java.lang.Object r10 = r11.zza(r10)     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            long r10 = r10.longValue()     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            r13 = 0
        L249:
            int r19 = r5.read(r2)     // Catch: java.lang.RuntimeException -> L3ae java.io.IOException -> L3b0
            if (r19 < 0) goto L34b
            int r13 = r13 + r19
            if (r13 > r6) goto L315
            r2.flip()     // Catch: java.lang.RuntimeException -> L30b java.io.IOException -> L30d
        L256:
            int r19 = r3.write(r2)     // Catch: java.lang.RuntimeException -> L30b java.io.IOException -> L30d
            if (r19 > 0) goto L256
            r2.clear()     // Catch: java.lang.RuntimeException -> L30b java.io.IOException -> L30d
            long r19 = r16.currentTimeMillis()     // Catch: java.lang.RuntimeException -> L30b java.io.IOException -> L30d
            long r19 = r19 - r17
            r21 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r10
            int r23 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r23 > 0) goto L2e1
            r19 = r2
            boolean r2 = r8.zzh     // Catch: java.lang.RuntimeException -> L30b java.io.IOException -> L30d
            if (r2 != 0) goto L2d1
            boolean r2 = r1.zzb()     // Catch: java.lang.RuntimeException -> L30b java.io.IOException -> L30d
            if (r2 == 0) goto L2ad
            java.lang.String r20 = r12.getAbsolutePath()     // Catch: java.lang.RuntimeException -> L30b java.io.IOException -> L30d
            android.os.Handler r2 = com.google.android.gms.ads.internal.util.client.zzf.zza     // Catch: java.lang.RuntimeException -> L30b java.io.IOException -> L30d
            r21 = r15
            com.google.android.gms.internal.ads.zzcdp r15 = new com.google.android.gms.internal.ads.zzcdp     // Catch: java.lang.RuntimeException -> L2a6 java.io.IOException -> L2a8
            r22 = 0
            r23 = r1
            r1 = r15
            r24 = r14
            r14 = r2
            r2 = r29
            r25 = r3
            r3 = r30
            r26 = r4
            r4 = r20
            r20 = r5
            r5 = r13
            r27 = r6
            r6 = r7
            r28 = r7
            r7 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            r14.post(r15)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            goto L2bd
        L2a6:
            r0 = move-exception
            goto L2a9
        L2a8:
            r0 = move-exception
        L2a9:
            r26 = r4
            goto L312
        L2ad:
            r23 = r1
            r25 = r3
            r26 = r4
            r20 = r5
            r27 = r6
            r28 = r7
            r24 = r14
            r21 = r15
        L2bd:
            r2 = r19
            r5 = r20
            r15 = r21
            r1 = r23
            r14 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r7 = r28
            goto L249
        L2d1:
            r26 = r4
            r24 = r14
            r21 = r15
            java.lang.String r15 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.lang.String r1 = "abort requested"
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            throw r0     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
        L2e1:
            r26 = r4
            r24 = r14
            r21 = r15
            java.lang.String r15 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            r1.<init>()     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.lang.String r2 = "Timeout exceeded. Limit: "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.lang.String r0 = " sec"
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.lang.String r11 = r1.toString()     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.RuntimeException -> L33a java.io.IOException -> L33c
            java.lang.String r1 = "stream cache time limit exceeded"
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L33a java.io.IOException -> L33c
            throw r0     // Catch: java.lang.RuntimeException -> L33a java.io.IOException -> L33c
        L30b:
            r0 = move-exception
            goto L30e
        L30d:
            r0 = move-exception
        L30e:
            r26 = r4
            r21 = r15
        L312:
            r1 = r14
            goto L3b6
        L315:
            r26 = r4
            r24 = r14
            r21 = r15
            java.lang.String r15 = "sizeExceeded"
            java.lang.String r0 = java.lang.Integer.toString(r13)     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            r1.<init>()     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.lang.String r2 = "File too big for full file cache. Size: "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.lang.String r11 = r1.toString()     // Catch: java.lang.RuntimeException -> L344 java.io.IOException -> L346
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.RuntimeException -> L33a java.io.IOException -> L33c
            java.lang.String r1 = "stream cache file size limit exceeded"
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L33a java.io.IOException -> L33c
            throw r0     // Catch: java.lang.RuntimeException -> L33a java.io.IOException -> L33c
        L33a:
            r0 = move-exception
            goto L33d
        L33c:
            r0 = move-exception
        L33d:
            r2 = r11
            r1 = r24
            r11 = r26
            goto L3c6
        L344:
            r0 = move-exception
            goto L347
        L346:
            r0 = move-exception
        L347:
            r1 = r24
            goto L3b8
        L34b:
            r26 = r4
            r24 = r14
            r21 = r15
            r26.close()     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            r1 = 3
            boolean r1 = com.google.android.gms.ads.internal.util.client.zzm.zzm(r1)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            if (r1 == 0) goto L37e
            java.text.DecimalFormat r1 = com.google.android.gms.internal.ads.zzcdy.zzf     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            long r2 = (long) r13     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            java.lang.String r1 = r1.format(r2)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            r2.<init>()     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            java.lang.String r3 = "Preloaded "
            r2.append(r3)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            r2.append(r1)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            java.lang.String r1 = " bytes from "
            r2.append(r1)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            r2.append(r9)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            java.lang.String r1 = r2.toString()     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
        L37e:
            r1 = 1
            r2 = 0
            r12.setReadable(r1, r2)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            boolean r1 = r0.isFile()     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            if (r1 == 0) goto L391
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            r0.setLastModified(r1)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            goto L394
        L391:
            r0.createNewFile()     // Catch: java.io.IOException -> L394 java.lang.RuntimeException -> L3a8
        L394:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            r8.zzh(r9, r0, r13)     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            java.util.Set r0 = com.google.android.gms.internal.ads.zzcdy.zze     // Catch: java.lang.RuntimeException -> L3a8 java.io.IOException -> L3aa
            r1 = r24
            r0.remove(r1)     // Catch: java.lang.RuntimeException -> L3a4 java.io.IOException -> L3a6
            r0 = 1
            return r0
        L3a4:
            r0 = move-exception
            goto L3b6
        L3a6:
            r0 = move-exception
            goto L3b6
        L3a8:
            r0 = move-exception
            goto L3ab
        L3aa:
            r0 = move-exception
        L3ab:
            r1 = r24
            goto L3b6
        L3ae:
            r0 = move-exception
            goto L3b1
        L3b0:
            r0 = move-exception
        L3b1:
            r26 = r4
            r1 = r14
            r21 = r15
        L3b6:
            r15 = r21
        L3b8:
            r11 = r26
            r2 = 0
            goto L3c6
        L3bc:
            r0 = move-exception
            goto L3bf
        L3be:
            r0 = move-exception
        L3bf:
            r1 = r14
            r21 = r15
            r15 = r21
            r2 = 0
            r11 = 0
        L3c6:
            boolean r3 = r0 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L3d3
            java.lang.String r3 = "VideoStreamFullFileCache.preload"
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()
            r4.zzw(r0, r3)
        L3d3:
            r11.close()     // Catch: java.lang.Throwable -> L3d7
            goto L3d8
        L3d7:
        L3d8:
            boolean r3 = r8.zzh
            if (r3 == 0) goto L3f6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Preload aborted for URL \""
            r0.append(r3)
            r0.append(r9)
            java.lang.String r3 = "\""
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)
            goto L40f
        L3f6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Preload failed for URL \""
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = "\""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r0)
        L40f:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L42c
            boolean r0 = r12.delete()
            if (r0 != 0) goto L42c
            java.lang.String r0 = r12.getAbsolutePath()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Could not delete partial cache file at "
            java.lang.String r0 = r3.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L42c:
            java.lang.String r0 = r12.getAbsolutePath()
            r8.zzg(r9, r0, r15, r2)
            java.util.Set r0 = com.google.android.gms.internal.ads.zzcdy.zze
            r0.remove(r1)
        L438:
            r1 = 0
            return r1
        L43a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43a
            throw r0
        L43d:
            java.lang.String r0 = "noCacheDir"
            r1 = 0
            r8.zzg(r9, r1, r0, r1)
            goto L438
    }
}
