package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaqy implements com.google.android.gms.internal.ads.zzapm {
    private final java.util.Map zza;
    private long zzb;
    private final com.google.android.gms.internal.ads.zzaqx zzc;
    private final int zzd;

    public zzaqy(com.google.android.gms.internal.ads.zzaqx r4, int r5) {
            r3 = this;
            r3.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r0 = 16
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r5.<init>(r0, r1, r2)
            r3.zza = r5
            r0 = 0
            r3.zzb = r0
            r3.zzc = r4
            r4 = 5242880(0x500000, float:7.34684E-39)
            r3.zzd = r4
            return
    }

    public zzaqy(java.io.File r4, int r5) {
            r3 = this;
            r3.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r0 = 16
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r5.<init>(r0, r1, r2)
            r3.zza = r5
            r0 = 0
            r3.zzb = r0
            com.google.android.gms.internal.ads.zzaqu r5 = new com.google.android.gms.internal.ads.zzaqu
            r5.<init>(r3, r4)
            r3.zzc = r5
            r4 = 20971520(0x1400000, float:3.526483E-38)
            r3.zzd = r4
            return
    }

    static int zze(java.io.InputStream r2) throws java.io.IOException {
            int r0 = zzn(r2)
            int r1 = zzn(r2)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = zzn(r2)
            int r1 = r1 << 16
            int r2 = zzn(r2)
            int r2 = r2 << 24
            r0 = r0 | r1
            r2 = r2 | r0
            return r2
    }

    static long zzf(java.io.InputStream r18) throws java.io.IOException {
            int r0 = zzn(r18)
            long r0 = (long) r0
            int r2 = zzn(r18)
            long r2 = (long) r2
            int r4 = zzn(r18)
            long r4 = (long) r4
            int r6 = zzn(r18)
            long r6 = (long) r6
            int r8 = zzn(r18)
            long r8 = (long) r8
            int r10 = zzn(r18)
            long r10 = (long) r10
            int r12 = zzn(r18)
            long r12 = (long) r12
            int r14 = zzn(r18)
            long r14 = (long) r14
            r16 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r16
            long r4 = r4 & r16
            long r6 = r6 & r16
            long r8 = r8 & r16
            long r10 = r10 & r16
            long r12 = r12 & r16
            long r14 = r14 & r16
            long r0 = r0 & r16
            r16 = 8
            long r2 = r2 << r16
            long r0 = r0 | r2
            r2 = 16
            long r2 = r4 << r2
            long r0 = r0 | r2
            r2 = 24
            long r2 = r6 << r2
            long r0 = r0 | r2
            r2 = 32
            long r2 = r8 << r2
            long r0 = r0 | r2
            r2 = 40
            long r2 = r10 << r2
            long r0 = r0 | r2
            r2 = 48
            long r2 = r12 << r2
            long r0 = r0 | r2
            r2 = 56
            long r2 = r14 << r2
            long r0 = r0 | r2
            return r0
    }

    static java.lang.String zzh(com.google.android.gms.internal.ads.zzaqw r2) throws java.io.IOException {
            long r0 = zzf(r2)
            byte[] r2 = zzm(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            r0.<init>(r2, r1)
            return r0
    }

    static void zzj(java.io.OutputStream r1, int r2) throws java.io.IOException {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r2)
            return
    }

    static void zzk(java.io.OutputStream r2, long r3) throws java.io.IOException {
            int r0 = (int) r3
            byte r0 = (byte) r0
            r2.write(r0)
            r0 = 8
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 16
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 24
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 32
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 40
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 48
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 56
            long r3 = r3 >>> r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r2.write(r3)
            return
    }

    static void zzl(java.io.OutputStream r3, java.lang.String r4) throws java.io.IOException {
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r4.getBytes(r0)
            int r0 = r4.length
            long r1 = (long) r0
            zzk(r3, r1)
            r1 = 0
            r3.write(r4, r1, r0)
            return
    }

    static byte[] zzm(com.google.android.gms.internal.ads.zzaqw r6, long r7) throws java.io.IOException {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            long r0 = r6.zza()
            if (r2 < 0) goto L1f
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L1f
            int r2 = (int) r7
            long r3 = (long) r2
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L1f
            byte[] r7 = new byte[r2]
            java.io.DataInputStream r8 = new java.io.DataInputStream
            r8.<init>(r6)
            r8.readFully(r7)
            return r7
        L1f:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "streamToBytes length="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = ", maxLength="
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
    }

    private static int zzn(java.io.InputStream r1) throws java.io.IOException {
            int r1 = r1.read()
            r0 = -1
            if (r1 == r0) goto L8
            return r1
        L8:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    private final void zzo(java.lang.String r8, com.google.android.gms.internal.ads.zzaqv r9) {
            r7 = this;
            java.util.Map r0 = r7.zza
            boolean r0 = r0.containsKey(r8)
            if (r0 != 0) goto L10
            long r0 = r7.zzb
            long r2 = r9.zza
            long r0 = r0 + r2
            r7.zzb = r0
            goto L22
        L10:
            java.util.Map r0 = r7.zza
            java.lang.Object r0 = r0.get(r8)
            com.google.android.gms.internal.ads.zzaqv r0 = (com.google.android.gms.internal.ads.zzaqv) r0
            long r1 = r7.zzb
            long r3 = r9.zza
            long r5 = r0.zza
            long r3 = r3 - r5
            long r1 = r1 + r3
            r7.zzb = r1
        L22:
            java.util.Map r0 = r7.zza
            r0.put(r8, r9)
            return
    }

    private final void zzp(java.lang.String r5) {
            r4 = this;
            java.util.Map r0 = r4.zza
            java.lang.Object r5 = r0.remove(r5)
            com.google.android.gms.internal.ads.zzaqv r5 = (com.google.android.gms.internal.ads.zzaqv) r5
            if (r5 == 0) goto L11
            long r0 = r4.zzb
            long r2 = r5.zza
            long r0 = r0 - r2
            r4.zzb = r0
        L11:
            return
    }

    private static final java.lang.String zzq(java.lang.String r2) {
            int r0 = r2.length()
            int r0 = r0 / 2
            r1 = 0
            java.lang.String r1 = r2.substring(r1, r0)
            int r1 = r1.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r2.substring(r0)
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final synchronized com.google.android.gms.internal.ads.zzapl zza(java.lang.String r13) {
            r12 = this;
            monitor-enter(r12)
            java.util.Map r0 = r12.zza     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r0 = r0.get(r13)     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.ads.zzaqv r0 = (com.google.android.gms.internal.ads.zzaqv) r0     // Catch: java.lang.Throwable -> Lc5
            r1 = 0
            if (r0 != 0) goto Le
            monitor-exit(r12)
            return r1
        Le:
            java.io.File r2 = r12.zzg(r13)     // Catch: java.lang.Throwable -> Lc5
            r3 = 1
            r4 = 0
            r5 = 2
            com.google.android.gms.internal.ads.zzaqw r6 = new com.google.android.gms.internal.ads.zzaqw     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            r8.<init>(r2)     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            r7.<init>(r8)     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            long r8 = r2.length()     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            r6.<init>(r7, r8)     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            com.google.android.gms.internal.ads.zzaqv r7 = com.google.android.gms.internal.ads.zzaqv.zza(r6)     // Catch: java.lang.Throwable -> La7
            java.lang.String r8 = r7.zzb     // Catch: java.lang.Throwable -> La7
            boolean r8 = android.text.TextUtils.equals(r13, r8)     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto L50
            java.lang.String r0 = "%s: key=%s, found=%s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> La7
            r8[r4] = r9     // Catch: java.lang.Throwable -> La7
            r8[r3] = r13     // Catch: java.lang.Throwable -> La7
            java.lang.String r7 = r7.zzb     // Catch: java.lang.Throwable -> La7
            r8[r5] = r7     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzaqo.zza(r0, r8)     // Catch: java.lang.Throwable -> La7
            r12.zzp(r13)     // Catch: java.lang.Throwable -> La7
            r6.close()     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            monitor-exit(r12)
            return r1
        L50:
            long r7 = r6.zza()     // Catch: java.lang.Throwable -> La7
            byte[] r7 = zzm(r6, r7)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzapl r8 = new com.google.android.gms.internal.ads.zzapl     // Catch: java.lang.Throwable -> La7
            r8.<init>()     // Catch: java.lang.Throwable -> La7
            r8.zza = r7     // Catch: java.lang.Throwable -> La7
            java.lang.String r7 = r0.zzc     // Catch: java.lang.Throwable -> La7
            r8.zzb = r7     // Catch: java.lang.Throwable -> La7
            long r9 = r0.zzd     // Catch: java.lang.Throwable -> La7
            r8.zzc = r9     // Catch: java.lang.Throwable -> La7
            long r9 = r0.zze     // Catch: java.lang.Throwable -> La7
            r8.zzd = r9     // Catch: java.lang.Throwable -> La7
            long r9 = r0.zzf     // Catch: java.lang.Throwable -> La7
            r8.zze = r9     // Catch: java.lang.Throwable -> La7
            long r9 = r0.zzg     // Catch: java.lang.Throwable -> La7
            r8.zzf = r9     // Catch: java.lang.Throwable -> La7
            java.util.List r7 = r0.zzh     // Catch: java.lang.Throwable -> La7
            java.util.TreeMap r9 = new java.util.TreeMap     // Catch: java.lang.Throwable -> La7
            java.util.Comparator r10 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch: java.lang.Throwable -> La7
            r9.<init>(r10)     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La7
        L80:
            boolean r10 = r7.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r10 == 0) goto L98
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzapu r10 = (com.google.android.gms.internal.ads.zzapu) r10     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = r10.zza()     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = r10.zzb()     // Catch: java.lang.Throwable -> La7
            r9.put(r11, r10)     // Catch: java.lang.Throwable -> La7
            goto L80
        L98:
            r8.zzg = r9     // Catch: java.lang.Throwable -> La7
            java.util.List r0 = r0.zzh     // Catch: java.lang.Throwable -> La7
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> La7
            r8.zzh = r0     // Catch: java.lang.Throwable -> La7
            r6.close()     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            monitor-exit(r12)
            return r8
        La7:
            r0 = move-exception
            r6.close()     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
            throw r0     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lc5
        Lac:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc5
            r5[r4] = r2     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc5
            r5[r3] = r0     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = "%s: %s"
            com.google.android.gms.internal.ads.zzaqo.zza(r0, r5)     // Catch: java.lang.Throwable -> Lc5
            r12.zzi(r13)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r12)
            return r1
        Lc5:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final synchronized void zzb() {
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.zzaqx r0 = r8.zzc     // Catch: java.lang.Throwable -> L5e
            java.io.File r0 = r0.zza()     // Catch: java.lang.Throwable -> L5e
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            if (r1 != 0) goto L24
            boolean r1 = r0.mkdirs()     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L5c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L5e
            r1[r2] = r0     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "Unable to create cache dir %s"
            com.google.android.gms.internal.ads.zzaqo.zzb(r0, r1)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r8)
            return
        L24:
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L5c
        L2a:
            int r1 = r0.length     // Catch: java.lang.Throwable -> L5e
            if (r2 >= r1) goto L5c
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L5e
            long r3 = r1.length()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzaqw r5 = new com.google.android.gms.internal.ads.zzaqw     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
            r7.<init>(r1)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
            r6.<init>(r7)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
            r5.<init>(r6, r3)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzaqv r6 = com.google.android.gms.internal.ads.zzaqv.zza(r5)     // Catch: java.lang.Throwable -> L51
            r6.zza = r3     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r6.zzb     // Catch: java.lang.Throwable -> L51
            r8.zzo(r3, r6)     // Catch: java.lang.Throwable -> L51
            r5.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
            goto L59
        L51:
            r3 = move-exception
            r5.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
            throw r3     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L5e
        L56:
            r1.delete()     // Catch: java.lang.Throwable -> L5e
        L59:
            int r2 = r2 + 1
            goto L2a
        L5c:
            monitor-exit(r8)
            return
        L5e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final synchronized void zzc(java.lang.String r3, boolean r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzapl r4 = r2.zza(r3)     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L12
            r0 = 0
            r4.zzf = r0     // Catch: java.lang.Throwable -> L14
            r4.zze = r0     // Catch: java.lang.Throwable -> L14
            r2.zzd(r3, r4)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L12:
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final synchronized void zzd(java.lang.String r16, com.google.android.gms.internal.ads.zzapl r17) {
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.zzb     // Catch: java.lang.Throwable -> L1a1
            byte[] r5 = r2.zza     // Catch: java.lang.Throwable -> L1a1
            int r5 = r5.length     // Catch: java.lang.Throwable -> L1a1
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L1a1
            long r3 = r3 + r6
            int r6 = r1.zzd     // Catch: java.lang.Throwable -> L1a1
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L1a1
            r9 = 1063675494(0x3f666666, float:0.9)
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 <= 0) goto L1f
            float r3 = (float) r5     // Catch: java.lang.Throwable -> L1a1
            float r4 = (float) r6     // Catch: java.lang.Throwable -> L1a1
            float r4 = r4 * r9
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L19f
        L1f:
            java.io.File r3 = r15.zzg(r16)     // Catch: java.lang.Throwable -> L1a1
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r7.<init>(r3)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r6.<init>(r7)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            com.google.android.gms.internal.ads.zzaqv r7 = new com.google.android.gms.internal.ads.zzaqv     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r7.<init>(r0, r2)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r8 = 538247942(0x20150306, float:1.2621791E-19)
            zzj(r6, r8)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            java.lang.String r8 = r7.zzb     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            zzl(r6, r8)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            java.lang.String r8 = r7.zzc     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            if (r8 != 0) goto L45
            java.lang.String r8 = ""
        L45:
            zzl(r6, r8)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            long r10 = r7.zzd     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            zzk(r6, r10)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            long r10 = r7.zze     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            zzk(r6, r10)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            long r10 = r7.zzf     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            zzk(r6, r10)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            long r10 = r7.zzg     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            zzk(r6, r10)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            java.util.List r8 = r7.zzh     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            if (r8 == 0) goto L86
            int r10 = r8.size()     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            zzj(r6, r10)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            java.util.Iterator r8 = r8.iterator()     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
        L6b:
            boolean r10 = r8.hasNext()     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            if (r10 == 0) goto L89
            java.lang.Object r10 = r8.next()     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            com.google.android.gms.internal.ads.zzapu r10 = (com.google.android.gms.internal.ads.zzapu) r10     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            java.lang.String r11 = r10.zza()     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            zzl(r6, r11)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            java.lang.String r10 = r10.zzb()     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            zzl(r6, r10)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            goto L6b
        L86:
            zzj(r6, r5)     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
        L89:
            r6.flush()     // Catch: java.io.IOException -> L147 java.lang.Throwable -> L1a1
            byte[] r2 = r2.zza     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r6.write(r2)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r6.close()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            long r10 = r3.length()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r7.zza = r10     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r15.zzo(r0, r7)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            long r6 = r1.zzb     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            int r0 = r1.zzd     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            long r10 = (long) r0     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto La8
            goto L19f
        La8:
            boolean r0 = com.google.android.gms.internal.ads.zzaqo.zzb     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            if (r0 == 0) goto Lb3
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            com.google.android.gms.internal.ads.zzaqo.zzd(r0, r2)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
        Lb3:
            long r6 = r1.zzb     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.util.Map r0 = r1.zza     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.util.Set r0 = r0.entrySet()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r2 = 0
        Lc4:
            boolean r8 = r0.hasNext()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r12 = 2
            if (r8 == 0) goto L11b
            java.lang.Object r8 = r0.next()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.lang.Object r8 = r8.getValue()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            com.google.android.gms.internal.ads.zzaqv r8 = (com.google.android.gms.internal.ads.zzaqv) r8     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.lang.String r13 = r8.zzb     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.io.File r13 = r15.zzg(r13)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            boolean r13 = r13.delete()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            if (r13 == 0) goto Led
            long r13 = r1.zzb     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r16 = r10
            long r9 = r8.zza     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            long r13 = r13 - r9
            r1.zzb = r13     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            goto L100
        Led:
            r16 = r10
            java.lang.String r9 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.lang.String r8 = r8.zzb     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r10[r5] = r8     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.lang.String r8 = zzq(r8)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r10[r4] = r8     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            com.google.android.gms.internal.ads.zzaqo.zza(r9, r10)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
        L100:
            r0.remove()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            int r2 = r2 + 1
            long r8 = r1.zzb     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            float r8 = (float) r8     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            int r9 = r1.zzd     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            float r9 = (float) r9     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r10 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r10
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L115
            goto L11d
        L115:
            r10 = r16
            r9 = 1063675494(0x3f666666, float:0.9)
            goto Lc4
        L11b:
            r16 = r10
        L11d:
            boolean r0 = com.google.android.gms.internal.ads.zzaqo.zzb     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            if (r0 == 0) goto L19f
            java.lang.String r0 = "pruned %d files, %d bytes, %d ms"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r8[r5] = r2     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            long r9 = r1.zzb     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            long r9 = r9 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r8[r4] = r2     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r9 = r16
            long r6 = r6 - r9
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r8[r12] = r2     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            com.google.android.gms.internal.ads.zzaqo.zzd(r0, r8)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            monitor-exit(r15)
            return
        L147:
            r0 = move-exception
            java.lang.String r2 = "%s"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r7[r5] = r0     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            com.google.android.gms.internal.ads.zzaqo.zza(r2, r7)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r6.close()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.lang.String r6 = r3.getAbsolutePath()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r2[r5] = r6     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            com.google.android.gms.internal.ads.zzaqo.zza(r0, r2)     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            r0.<init>()     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
            throw r0     // Catch: java.io.IOException -> L16b java.lang.Throwable -> L1a1
        L16b:
            boolean r0 = r3.delete()     // Catch: java.lang.Throwable -> L1a1
            if (r0 != 0) goto L17e
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r2 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a1
            r0[r5] = r2     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r2 = "Could not clean up file %s"
            com.google.android.gms.internal.ads.zzaqo.zza(r2, r0)     // Catch: java.lang.Throwable -> L1a1
        L17e:
            com.google.android.gms.internal.ads.zzaqx r0 = r1.zzc     // Catch: java.lang.Throwable -> L1a1
            java.io.File r0 = r0.zza()     // Catch: java.lang.Throwable -> L1a1
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L1a1
            if (r0 != 0) goto L19f
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r2 = "Re-initializing cache after external clearing."
            com.google.android.gms.internal.ads.zzaqo.zza(r2, r0)     // Catch: java.lang.Throwable -> L1a1
            java.util.Map r0 = r1.zza     // Catch: java.lang.Throwable -> L1a1
            r0.clear()     // Catch: java.lang.Throwable -> L1a1
            r2 = 0
            r1.zzb = r2     // Catch: java.lang.Throwable -> L1a1
            r15.zzb()     // Catch: java.lang.Throwable -> L1a1
            monitor-exit(r15)
            return
        L19f:
            monitor-exit(r15)
            return
        L1a1:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
    }

    public final java.io.File zzg(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzaqx r0 = r2.zzc
            java.io.File r1 = new java.io.File
            java.io.File r0 = r0.zza()
            java.lang.String r3 = zzq(r3)
            r1.<init>(r0, r3)
            return r1
    }

    public final synchronized void zzi(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.io.File r0 = r2.zzg(r3)     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.delete()     // Catch: java.lang.Throwable -> L24
            r2.zzp(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L22
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L24
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Throwable -> L24
            r1 = 1
            java.lang.String r3 = zzq(r3)     // Catch: java.lang.Throwable -> L24
            r0[r1] = r3     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "Could not delete cache entry for key=%s, filename=%s"
            com.google.android.gms.internal.ads.zzaqo.zza(r3, r0)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return
        L22:
            monitor-exit(r2)
            return
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
