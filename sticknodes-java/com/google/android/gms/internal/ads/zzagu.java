package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzagu {
    public static final com.google.android.gms.internal.ads.zzags zza = null;

    static {
            com.google.android.gms.internal.ads.zzags r0 = new com.google.android.gms.internal.ads.zzags
            r0.<init>()
            com.google.android.gms.internal.ads.zzagu.zza = r0
            return
    }

    public static final com.google.android.gms.internal.ads.zzbk zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzags r13, com.google.android.gms.internal.ads.zzafw r14) {
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>(r11, r12)
            int r11 = r0.zzb()
            r12 = 2
            r1 = 10
            r2 = 4
            r3 = 0
            r4 = 1
            java.lang.String r5 = "Id3Decoder"
            r6 = 0
            if (r11 >= r1) goto L21
            java.lang.String r11 = "Data too short to be an ID3 tag"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r11)
        L1e:
            r9 = r6
            goto Lad
        L21:
            int r11 = r0.zzo()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r11 == r7) goto L46
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r3] = r11
            java.lang.String r11 = "%06X"
            java.lang.String r11 = java.lang.String.format(r11, r7)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.String r11 = r7.concat(r11)
            com.google.android.gms.internal.ads.zzea.zzf(r5, r11)
            goto L1e
        L46:
            int r11 = r0.zzm()
            r0.zzM(r4)
            int r7 = r0.zzm()
            int r8 = r0.zzl()
            if (r11 != r12) goto L61
            r9 = r7 & 64
            if (r9 == 0) goto L88
            java.lang.String r11 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r11)
            goto L1e
        L61:
            r9 = 3
            if (r11 != r9) goto L72
            r9 = r7 & 64
            if (r9 == 0) goto L88
            int r9 = r0.zzg()
            r0.zzM(r9)
            int r9 = r9 + r2
            int r8 = r8 - r9
            goto L88
        L72:
            if (r11 != r2) goto L97
            r9 = r7 & 64
            if (r9 == 0) goto L82
            int r9 = r0.zzl()
            int r10 = r9 + (-4)
            r0.zzM(r10)
            int r8 = r8 - r9
        L82:
            r9 = r7 & 16
            if (r9 == 0) goto L88
            int r8 = r8 + (-10)
        L88:
            if (r11 >= r2) goto L90
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L90
            r7 = 1
            goto L91
        L90:
            r7 = 0
        L91:
            com.google.android.gms.internal.ads.zzagt r9 = new com.google.android.gms.internal.ads.zzagt
            r9.<init>(r11, r7, r8)
            goto Lad
        L97:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Skipped ID3 tag with unsupported majorVersion="
            r7.append(r8)
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r5, r11)
            goto L1e
        Lad:
            if (r9 != 0) goto Lb0
            return r6
        Lb0:
            int r11 = r0.zzd()
            int r7 = com.google.android.gms.internal.ads.zzagt.zzb(r9)
            if (r7 != r12) goto Lbb
            r1 = 6
        Lbb:
            int r12 = com.google.android.gms.internal.ads.zzagt.zza(r9)
            boolean r7 = com.google.android.gms.internal.ads.zzagt.zzc(r9)
            if (r7 == 0) goto Lcd
            int r12 = com.google.android.gms.internal.ads.zzagt.zza(r9)
            int r12 = zze(r0, r12)
        Lcd:
            int r11 = r11 + r12
            r0.zzK(r11)
            int r11 = com.google.android.gms.internal.ads.zzagt.zzb(r9)
            boolean r11 = zzj(r0, r11, r1, r3)
            if (r11 != 0) goto L102
            int r11 = com.google.android.gms.internal.ads.zzagt.zzb(r9)
            if (r11 != r2) goto Le9
            boolean r11 = zzj(r0, r2, r1, r4)
            if (r11 == 0) goto Le9
            r3 = 1
            goto L102
        Le9:
            int r11 = com.google.android.gms.internal.ads.zzagt.zzb(r9)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Failed to validate ID3 tag with majorVersion="
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r5, r11)
            return r6
        L102:
            int r11 = r0.zzb()
            if (r11 < r1) goto L116
            int r11 = com.google.android.gms.internal.ads.zzagt.zzb(r9)
            com.google.android.gms.internal.ads.zzagv r11 = zzl(r11, r0, r3, r1, r13)
            if (r11 == 0) goto L102
            r14.add(r11)
            goto L102
        L116:
            com.google.android.gms.internal.ads.zzbk r11 = new com.google.android.gms.internal.ads.zzbk
            r11.<init>(r14)
            return r11
    }

    private static int zzb(int r1) {
            if (r1 == 0) goto L8
            r0 = 3
            if (r1 != r0) goto L6
            goto L8
        L6:
            r1 = 2
            return r1
        L8:
            r1 = 1
            return r1
    }

    private static int zzc(byte[] r2, int r3, int r4) {
            int r0 = zzd(r2, r3)
            if (r4 == 0) goto L22
            r1 = 3
            if (r4 == r1) goto L22
        L9:
            int r4 = r2.length
            int r1 = r4 + (-1)
            if (r0 >= r1) goto L21
            int r4 = r0 + 1
            int r1 = r0 - r3
            int r1 = r1 % 2
            if (r1 != 0) goto L1c
            r1 = r2[r4]
            if (r1 == 0) goto L1b
            goto L1c
        L1b:
            return r0
        L1c:
            int r0 = zzd(r2, r4)
            goto L9
        L21:
            return r4
        L22:
            return r0
    }

    private static int zzd(byte[] r1, int r2) {
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            return r0
    }

    private static int zze(com.google.android.gms.internal.ads.zzek r5, int r6) {
            byte[] r0 = r5.zzN()
            int r5 = r5.zzd()
            r1 = r5
        L9:
            int r2 = r1 + 1
            int r3 = r5 + r6
            if (r2 >= r3) goto L29
            r3 = r0[r1]
            r4 = 255(0xff, float:3.57E-43)
            r3 = r3 & r4
            if (r3 != r4) goto L27
            r3 = r0[r2]
            if (r3 != 0) goto L27
            int r3 = r1 - r5
            int r1 = r1 + 2
            int r3 = r6 - r3
            int r3 = r3 + (-2)
            java.lang.System.arraycopy(r0, r1, r0, r2, r3)
            int r6 = r6 + (-1)
        L27:
            r1 = r2
            goto L9
        L29:
            return r6
    }

    private static com.google.android.gms.internal.ads.zzgax zzf(byte[] r6, int r7, int r8) {
            int r0 = r6.length
            java.lang.String r1 = ""
            if (r8 < r0) goto La
            com.google.android.gms.internal.ads.zzgax r6 = com.google.android.gms.internal.ads.zzgax.zzo(r1)
            return r6
        La:
            com.google.android.gms.internal.ads.zzgau r0 = new com.google.android.gms.internal.ads.zzgau
            r0.<init>()
            int r2 = zzc(r6, r8, r7)
        L13:
            if (r8 >= r2) goto L2d
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = zzi(r7)
            int r5 = r2 - r8
            r3.<init>(r6, r8, r5, r4)
            r0.zzf(r3)
            int r8 = zzb(r7)
            int r8 = r8 + r2
            int r2 = zzc(r6, r8, r7)
            goto L13
        L2d:
            com.google.android.gms.internal.ads.zzgax r6 = r0.zzi()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L3b
            com.google.android.gms.internal.ads.zzgax r6 = com.google.android.gms.internal.ads.zzgax.zzo(r1)
        L3b:
            return r6
    }

    private static java.lang.String zzg(byte[] r1, int r2, int r3, java.nio.charset.Charset r4) {
            if (r3 <= r2) goto Ld
            int r0 = r1.length
            if (r3 <= r0) goto L6
            goto Ld
        L6:
            int r3 = r3 - r2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3, r4)
            return r0
        Ld:
            java.lang.String r1 = ""
            return r1
    }

    private static java.lang.String zzh(int r5, int r6, int r7, int r8, int r9) {
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 != r3) goto L23
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r9[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r9[r3] = r6
            java.lang.String r6 = "%c%c%c"
            java.lang.String r5 = java.lang.String.format(r5, r6, r9)
            goto L46
        L23:
            java.util.Locale r5 = java.util.Locale.US
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r4[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r4[r3] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r4[r0] = r6
            java.lang.String r6 = "%c%c%c%c"
            java.lang.String r5 = java.lang.String.format(r5, r6, r4)
        L46:
            return r5
    }

    private static java.nio.charset.Charset zzi(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.zzfxo.zzb
            return r1
        Lc:
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.zzfxo.zzc
            return r1
        Lf:
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.zzfxo.zzd
            return r1
        L12:
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.zzfxo.zze
            return r1
    }

    private static boolean zzj(com.google.android.gms.internal.ads.zzek r21, int r22, int r23, boolean r24) {
            r1 = r21
            r0 = r22
            int r2 = r21.zzd()
        L8:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> La5
            r4 = 1
            r5 = 0
            r6 = r23
            if (r3 < r6) goto La1
            r3 = 3
            if (r0 < r3) goto L22
            int r7 = r21.zzg()     // Catch: java.lang.Throwable -> La5
            long r8 = r21.zzu()     // Catch: java.lang.Throwable -> La5
            int r10 = r21.zzq()     // Catch: java.lang.Throwable -> La5
            goto L2c
        L22:
            int r7 = r21.zzo()     // Catch: java.lang.Throwable -> La5
            int r8 = r21.zzo()     // Catch: java.lang.Throwable -> La5
            long r8 = (long) r8     // Catch: java.lang.Throwable -> La5
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            goto La1
        L38:
            r7 = 4
            if (r0 != r7) goto L67
            if (r24 != 0) goto L67
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L47
        L45:
            r4 = 0
            goto La1
        L47:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L67:
            if (r0 != r7) goto L77
            r3 = r10 & 64
            if (r3 == 0) goto L6e
            goto L6f
        L6e:
            r4 = 0
        L6f:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L87
        L77:
            if (r0 != r3) goto L85
            r3 = r10 & 32
            if (r3 == 0) goto L7f
            r3 = 1
            goto L80
        L7f:
            r3 = 0
        L80:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L86
            goto L87
        L85:
            r3 = 0
        L86:
            r4 = 0
        L87:
            if (r4 == 0) goto L8b
            int r3 = r3 + 4
        L8b:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La5
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L91
            goto L45
        L91:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> La5
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La5
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L9b
            goto L45
        L9b:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> La5
            r1.zzM(r3)     // Catch: java.lang.Throwable -> La5
            goto L8
        La1:
            r1.zzL(r2)
            return r4
        La5:
            r0 = move-exception
            r1.zzL(r2)
            throw r0
    }

    private static byte[] zzk(byte[] r0, int r1, int r2) {
            if (r2 > r1) goto L5
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            return r0
        L5:
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
            return r0
    }

    private static com.google.android.gms.internal.ads.zzagv zzl(int r35, com.google.android.gms.internal.ads.zzek r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzags r39) {
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            int r5 = r36.zzm()
            int r6 = r36.zzm()
            int r7 = r36.zzm()
            r8 = 3
            if (r1 < r8) goto L1c
            int r10 = r36.zzm()
            goto L1d
        L1c:
            r10 = 0
        L1d:
            r11 = 4
            if (r1 != r11) goto L3c
            int r12 = r36.zzp()
            if (r3 != 0) goto L47
            r13 = r12 & 255(0xff, float:3.57E-43)
            int r14 = r12 >> 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r12 >> 16
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r12 = r12 >> 24
            int r14 = r14 << 7
            r13 = r13 | r14
            int r14 = r15 << 14
            r13 = r13 | r14
            int r12 = r12 << 21
            r12 = r12 | r13
            goto L47
        L3c:
            if (r1 != r8) goto L43
            int r12 = r36.zzp()
            goto L47
        L43:
            int r12 = r36.zzo()
        L47:
            if (r1 < r8) goto L4e
            int r13 = r36.zzq()
            goto L4f
        L4e:
            r13 = 0
        L4f:
            r14 = 0
            if (r5 != 0) goto L65
            if (r6 != 0) goto L65
            if (r7 != 0) goto L65
            if (r10 != 0) goto L65
            if (r12 != 0) goto L65
            if (r13 == 0) goto L5d
            goto L65
        L5d:
            int r1 = r36.zze()
            r2.zzL(r1)
            return r14
        L65:
            int r15 = r36.zzd()
            int r15 = r15 + r12
            int r9 = r36.zze()
            java.lang.String r11 = "Id3Decoder"
            if (r15 <= r9) goto L7f
            java.lang.String r1 = "Frame size exceeds remaining tag data"
            com.google.android.gms.internal.ads.zzea.zzf(r11, r1)
            int r1 = r36.zze()
            r2.zzL(r1)
            return r14
        L7f:
            if (r39 != 0) goto L5e2
            r9 = 1
            if (r1 != r8) goto La2
            r17 = r13 & 64
            r8 = r13 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L8c
            r8 = 1
            goto L8d
        L8c:
            r8 = 0
        L8d:
            if (r17 == 0) goto L92
            r17 = 1
            goto L94
        L92:
            r17 = 0
        L94:
            r13 = r13 & 32
            if (r13 == 0) goto L9a
            r13 = 1
            goto L9b
        L9a:
            r13 = 0
        L9b:
            r19 = r17
            r20 = 0
            r17 = r8
            goto Ld6
        La2:
            r8 = 4
            if (r1 != r8) goto Lce
            r8 = r13 & 64
            if (r8 == 0) goto Lab
            r8 = 1
            goto Lac
        Lab:
            r8 = 0
        Lac:
            r17 = r13 & 8
            if (r17 == 0) goto Lb3
            r17 = 1
            goto Lb5
        Lb3:
            r17 = 0
        Lb5:
            r19 = r13 & 4
            if (r19 == 0) goto Lbc
            r19 = 1
            goto Lbe
        Lbc:
            r19 = 0
        Lbe:
            r20 = r13 & 2
            if (r20 == 0) goto Lc5
            r20 = 1
            goto Lc7
        Lc5:
            r20 = 0
        Lc7:
            r13 = r13 & r9
            r34 = r13
            r13 = r8
            r8 = r34
            goto Ld6
        Lce:
            r8 = 0
            r13 = 0
            r17 = 0
            r19 = 0
            r20 = 0
        Ld6:
            if (r17 != 0) goto L5d6
            if (r19 == 0) goto Ldc
            goto L5d6
        Ldc:
            if (r13 == 0) goto Le3
            r2.zzM(r9)
            int r12 = r12 + (-1)
        Le3:
            if (r8 == 0) goto Leb
            r8 = 4
            r2.zzM(r8)
            int r12 = r12 + (-4)
        Leb:
            if (r20 == 0) goto Lf1
            int r12 = zze(r2, r12)
        Lf1:
            r8 = 84
            r13 = 88
            r9 = 2
            if (r5 != r8) goto L137
            if (r6 != r13) goto L137
            if (r7 != r13) goto L137
            if (r1 == r9) goto L100
            if (r10 != r13) goto L137
        L100:
            if (r12 > 0) goto L10c
            r9 = r2
            r23 = r5
            r3 = r6
            r4 = r7
            r22 = r11
            r2 = r14
            goto L595
        L10c:
            int r3 = r36.zzm()     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r4 = r12 + (-1)
            byte[] r8 = new byte[r4]     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r9 = 0
            r2.zzH(r8, r9, r4)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r4 = zzc(r8, r9, r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.nio.charset.Charset r14 = zzi(r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r13.<init>(r8, r9, r4, r14)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r9 = zzb(r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r4 = r4 + r9
            com.google.android.gms.internal.ads.zzgax r3 = zzf(r8, r3, r4)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            com.google.android.gms.internal.ads.zzahe r4 = new com.google.android.gms.internal.ads.zzahe     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.lang.String r8 = "TXXX"
            r4.<init>(r8, r13, r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            goto L1db
        L137:
            if (r5 != r8) goto L17b
            java.lang.String r3 = zzh(r1, r8, r6, r7, r10)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            if (r12 > 0) goto L149
        L13f:
            r9 = r2
            r23 = r5
            r3 = r6
            r4 = r7
            r22 = r11
        L146:
            r2 = 0
            goto L595
        L149:
            int r4 = r36.zzm()     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r8 = r12 + (-1)
            byte[] r9 = new byte[r8]     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r13 = 0
            r2.zzH(r9, r13, r8)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            com.google.android.gms.internal.ads.zzgax r4 = zzf(r9, r4, r13)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            com.google.android.gms.internal.ads.zzahe r8 = new com.google.android.gms.internal.ads.zzahe     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r9 = 0
            r8.<init>(r3, r9, r4)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r9 = r2
            r23 = r5
            r3 = r6
            r4 = r7
            r2 = r8
        L165:
            r22 = r11
            goto L595
        L169:
            r0 = move-exception
            r1 = r0
            r9 = r2
            goto L5a0
        L16e:
            r0 = move-exception
            goto L171
        L170:
            r0 = move-exception
        L171:
            r9 = r2
            r23 = r5
            r3 = r6
            r4 = r7
            r22 = r11
        L178:
            r2 = r0
            goto L5ab
        L17b:
            r14 = 87
            if (r5 != r14) goto L1bd
            if (r6 != r13) goto L1ba
            if (r7 != r13) goto L1ba
            if (r1 == r9) goto L187
            if (r10 != r13) goto L1ba
        L187:
            if (r12 > 0) goto L18a
            goto L13f
        L18a:
            int r3 = r36.zzm()     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r4 = r12 + (-1)
            byte[] r8 = new byte[r4]     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r9 = 0
            r2.zzH(r8, r9, r4)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r4 = zzc(r8, r9, r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.nio.charset.Charset r14 = zzi(r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r13.<init>(r8, r9, r4, r14)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r3 = zzb(r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r4 = r4 + r3
            int r3 = zzd(r8, r4)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzfxo.zzb     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.lang.String r3 = zzg(r8, r4, r3, r9)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            com.google.android.gms.internal.ads.zzahg r4 = new com.google.android.gms.internal.ads.zzahg     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.lang.String r8 = "WXXX"
            r4.<init>(r8, r13, r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            goto L1db
        L1ba:
            r13 = 87
            goto L1be
        L1bd:
            r13 = r5
        L1be:
            if (r13 != r14) goto L1e2
            java.lang.String r3 = zzh(r1, r14, r6, r7, r10)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            byte[] r4 = new byte[r12]     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r8 = 0
            r2.zzH(r4, r8, r12)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r9 = zzd(r4, r8)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.nio.charset.Charset r14 = com.google.android.gms.internal.ads.zzfxo.zzb     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r13.<init>(r4, r8, r9, r14)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            com.google.android.gms.internal.ads.zzahg r4 = new com.google.android.gms.internal.ads.zzahg     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r8 = 0
            r4.<init>(r3, r8, r13)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
        L1db:
            r9 = r2
            r2 = r4
            r23 = r5
            r3 = r6
            r4 = r7
            goto L165
        L1e2:
            r14 = 73
            r8 = 80
            if (r13 != r8) goto L211
            r13 = 82
            if (r6 != r13) goto L20f
            if (r7 != r14) goto L20f
            r13 = 86
            if (r10 != r13) goto L20f
            byte[] r3 = new byte[r12]     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r4 = 0
            r2.zzH(r3, r4, r12)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            int r8 = zzd(r3, r4)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            java.nio.charset.Charset r13 = com.google.android.gms.internal.ads.zzfxo.zzb     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r9.<init>(r3, r4, r8, r13)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r4 = 1
            int r8 = r8 + r4
            byte[] r3 = zzk(r3, r8, r12)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            com.google.android.gms.internal.ads.zzahc r4 = new com.google.android.gms.internal.ads.zzahc     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            r4.<init>(r9, r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L16e java.lang.OutOfMemoryError -> L170
            goto L1db
        L20f:
            r13 = 80
        L211:
            r14 = 79
            r8 = 71
            if (r13 != r8) goto L28b
            r13 = 69
            if (r6 != r13) goto L284
            if (r7 != r14) goto L284
            r13 = 66
            if (r10 == r13) goto L223
            if (r1 != r9) goto L284
        L223:
            int r3 = r36.zzm()     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L278 java.lang.OutOfMemoryError -> L27a
            java.nio.charset.Charset r4 = zzi(r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L278 java.lang.OutOfMemoryError -> L27a
            int r8 = r12 + (-1)
            byte[] r9 = new byte[r8]     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L278 java.lang.OutOfMemoryError -> L27a
            r13 = 0
            r2.zzH(r9, r13, r8)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L278 java.lang.OutOfMemoryError -> L27a
            int r14 = zzd(r9, r13)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L278 java.lang.OutOfMemoryError -> L27a
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L278 java.lang.OutOfMemoryError -> L27a
            r22 = r11
            java.nio.charset.Charset r11 = com.google.android.gms.internal.ads.zzfxo.zzb     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L272 java.lang.OutOfMemoryError -> L274
            r23 = r5
            r5 = 0
            r13.<init>(r9, r5, r14, r11)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            java.lang.String r5 = com.google.android.gms.internal.ads.zzbn.zze(r13)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            r11 = 1
            int r14 = r14 + r11
            int r11 = zzc(r9, r14, r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            java.lang.String r13 = zzg(r9, r14, r11, r4)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            int r14 = zzb(r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            int r11 = r11 + r14
            int r14 = zzc(r9, r11, r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            java.lang.String r4 = zzg(r9, r11, r14, r4)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            int r3 = zzb(r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            int r14 = r14 + r3
            byte[] r3 = zzk(r9, r14, r8)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            com.google.android.gms.internal.ads.zzagr r8 = new com.google.android.gms.internal.ads.zzagr     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            r8.<init>(r5, r13, r4, r3)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            r9 = r2
            r3 = r6
            r4 = r7
            r2 = r8
            goto L595
        L272:
            r0 = move-exception
            goto L275
        L274:
            r0 = move-exception
        L275:
            r23 = r5
            goto L27f
        L278:
            r0 = move-exception
            goto L27b
        L27a:
            r0 = move-exception
        L27b:
            r23 = r5
            r22 = r11
        L27f:
            r9 = r2
            r3 = r6
            r4 = r7
            goto L178
        L284:
            r23 = r5
            r22 = r11
            r13 = 71
            goto L28f
        L28b:
            r23 = r5
            r22 = r11
        L28f:
            r5 = 65
            r8 = 67
            if (r1 != r9) goto L2a0
            r11 = 80
            if (r13 != r11) goto L33a
            r14 = 73
            if (r6 != r14) goto L33a
            if (r7 != r8) goto L33a
            goto L2ac
        L2a0:
            r11 = 80
            r14 = 73
            if (r13 != r5) goto L33a
            if (r6 != r11) goto L33a
            if (r7 != r14) goto L33a
            if (r10 != r8) goto L33a
        L2ac:
            int r3 = r36.zzm()     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            java.nio.charset.Charset r4 = zzi(r3)     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            int r5 = r12 + (-1)
            byte[] r8 = new byte[r5]     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            r11 = 0
            r2.zzH(r8, r11, r5)     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            if (r1 != r9) goto L2e4
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            java.nio.charset.Charset r14 = com.google.android.gms.internal.ads.zzfxo.zzb     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            r9 = 3
            r13.<init>(r8, r11, r9, r14)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            java.lang.String r9 = com.google.android.gms.internal.ads.zzfxi.zza(r13)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            java.lang.String r11 = "image/"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            java.lang.String r9 = r11.concat(r9)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            java.lang.String r11 = "image/jpg"
            boolean r11 = r11.equals(r9)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
            if (r11 == 0) goto L2de
            java.lang.String r9 = "image/jpeg"
        L2de:
            r11 = 2
            goto L303
        L2e0:
            r0 = move-exception
            goto L27f
        L2e2:
            r0 = move-exception
            goto L27f
        L2e4:
            r9 = 0
            int r11 = zzd(r8, r9)     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            java.nio.charset.Charset r14 = com.google.android.gms.internal.ads.zzfxo.zzb     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            r13.<init>(r8, r9, r11, r14)     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            java.lang.String r9 = com.google.android.gms.internal.ads.zzfxi.zza(r13)     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            r13 = 47
            int r13 = r9.indexOf(r13)     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            r14 = -1
            if (r13 != r14) goto L303
            java.lang.String r13 = "image/"
            java.lang.String r9 = r13.concat(r9)     // Catch: java.lang.Throwable -> L169 java.lang.Exception -> L2e0 java.lang.OutOfMemoryError -> L2e2
        L303:
            int r13 = r11 + 1
            r13 = r8[r13]     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            r13 = r13 & 255(0xff, float:3.57E-43)
            r14 = 2
            int r11 = r11 + r14
            int r14 = zzc(r8, r11, r3)     // Catch: java.lang.Throwable -> L32a java.lang.Exception -> L330 java.lang.OutOfMemoryError -> L332
            r24 = r15
            java.lang.String r15 = new java.lang.String     // Catch: java.lang.Throwable -> L393 java.lang.Exception -> L398 java.lang.OutOfMemoryError -> L39a
            int r2 = r14 - r11
            r15.<init>(r8, r11, r2, r4)     // Catch: java.lang.Throwable -> L393 java.lang.Exception -> L398 java.lang.OutOfMemoryError -> L39a
            int r2 = zzb(r3)     // Catch: java.lang.Throwable -> L393 java.lang.Exception -> L398 java.lang.OutOfMemoryError -> L39a
            int r14 = r14 + r2
            byte[] r2 = zzk(r8, r14, r5)     // Catch: java.lang.Throwable -> L393 java.lang.Exception -> L398 java.lang.OutOfMemoryError -> L39a
            com.google.android.gms.internal.ads.zzagh r3 = new com.google.android.gms.internal.ads.zzagh     // Catch: java.lang.Throwable -> L393 java.lang.Exception -> L398 java.lang.OutOfMemoryError -> L39a
            r3.<init>(r9, r15, r13, r2)     // Catch: java.lang.Throwable -> L393 java.lang.Exception -> L398 java.lang.OutOfMemoryError -> L39a
            r9 = r36
            goto L38e
        L32a:
            r0 = move-exception
            r9 = r36
        L32d:
            r1 = r0
            goto L5a0
        L330:
            r0 = move-exception
            goto L333
        L332:
            r0 = move-exception
        L333:
            r9 = r36
            r2 = r0
            r3 = r6
            r4 = r7
            goto L5ab
        L33a:
            r24 = r15
            r2 = 77
            if (r13 != r8) goto L39f
            r9 = 79
            if (r6 != r9) goto L39f
            if (r7 != r2) goto L39f
            if (r10 == r2) goto L34b
            r9 = 2
            if (r1 != r9) goto L39f
        L34b:
            r2 = 4
            if (r12 >= r2) goto L356
            r9 = r36
            r3 = r6
            r4 = r7
            r15 = r24
            goto L146
        L356:
            int r2 = r36.zzm()     // Catch: java.lang.Throwable -> L393 java.lang.Exception -> L398 java.lang.OutOfMemoryError -> L39a
            java.nio.charset.Charset r3 = zzi(r2)     // Catch: java.lang.Throwable -> L393 java.lang.Exception -> L398 java.lang.OutOfMemoryError -> L39a
            r4 = 3
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> L393 java.lang.Exception -> L398 java.lang.OutOfMemoryError -> L39a
            r9 = r36
            r8 = 0
            r9.zzH(r5, r8, r4)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r11.<init>(r5, r8, r4)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r4 = r12 + (-4)
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r9.zzH(r5, r8, r4)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r4 = zzc(r5, r8, r2)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r13.<init>(r5, r8, r4, r3)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r8 = zzb(r2)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r4 = r4 + r8
            int r2 = zzc(r5, r4, r2)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            java.lang.String r2 = zzg(r5, r4, r2, r3)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            com.google.android.gms.internal.ads.zzagp r3 = new com.google.android.gms.internal.ads.zzagp     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r3.<init>(r11, r13, r2)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
        L38e:
            r2 = r3
        L38f:
            r3 = r6
            r4 = r7
            goto L593
        L393:
            r0 = move-exception
            r9 = r36
            goto L423
        L398:
            r0 = move-exception
            goto L39b
        L39a:
            r0 = move-exception
        L39b:
            r9 = r36
            goto L42b
        L39f:
            r9 = r36
            if (r13 != r8) goto L432
            r11 = 72
            if (r6 != r11) goto L432
            if (r7 != r5) goto L432
            r5 = 80
            if (r10 != r5) goto L432
            int r2 = r36.zzd()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            byte[] r5 = r36.zzN()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r5 = zzd(r5, r2)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            byte[] r11 = r36.zzN()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r13 = r5 - r2
            java.nio.charset.Charset r14 = com.google.android.gms.internal.ads.zzfxo.zzb     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r8.<init>(r11, r2, r13, r14)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r11 = 1
            int r5 = r5 + r11
            r9.zzL(r5)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r27 = r36.zzg()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r28 = r36.zzg()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            long r13 = r36.zzu()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r5 != 0) goto L3e2
            r13 = -1
        L3e2:
            r29 = r13
            long r13 = r36.zzu()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r5 != 0) goto L3f3
            r13 = -1
        L3f3:
            r31 = r13
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r5.<init>()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r2 = r2 + r12
        L3fb:
            int r11 = r36.zzd()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            if (r11 >= r2) goto L40c
            r11 = 0
            com.google.android.gms.internal.ads.zzagv r13 = zzl(r1, r9, r3, r4, r11)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            if (r13 == 0) goto L3fb
            r5.add(r13)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            goto L3fb
        L40c:
            r2 = 0
            com.google.android.gms.internal.ads.zzagv[] r2 = new com.google.android.gms.internal.ads.zzagv[r2]     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            java.lang.Object[] r2 = r5.toArray(r2)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r33 = r2
            com.google.android.gms.internal.ads.zzagv[] r33 = (com.google.android.gms.internal.ads.zzagv[]) r33     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            com.google.android.gms.internal.ads.zzagl r2 = new com.google.android.gms.internal.ads.zzagl     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r25 = r2
            r26 = r8
            r25.<init>(r26, r27, r28, r29, r31, r33)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            goto L38f
        L422:
            r0 = move-exception
        L423:
            r1 = r0
            r15 = r24
            goto L5a0
        L428:
            r0 = move-exception
            goto L42b
        L42a:
            r0 = move-exception
        L42b:
            r2 = r0
            r3 = r6
            r4 = r7
        L42e:
            r15 = r24
            goto L5ab
        L432:
            if (r13 != r8) goto L513
            r5 = 84
            if (r6 != r5) goto L513
            r5 = 79
            if (r7 != r5) goto L513
            if (r10 != r8) goto L513
            int r2 = r36.zzd()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            byte[] r5 = r36.zzN()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r5 = zzd(r5, r2)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            byte[] r11 = r36.zzN()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r13 = r5 - r2
            java.nio.charset.Charset r14 = com.google.android.gms.internal.ads.zzfxo.zzb     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r8.<init>(r11, r2, r13, r14)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r11 = 1
            int r5 = r5 + r11
            r9.zzL(r5)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r5 = r36.zzm()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r11 = r5 & 2
            if (r11 == 0) goto L468
            r11 = 1
            r27 = 1
            goto L46b
        L468:
            r11 = 1
            r27 = 0
        L46b:
            r5 = r5 & r11
            int r11 = r36.zzm()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r14 = 0
        L473:
            if (r14 >= r11) goto L4c1
            int r15 = r36.zzd()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r16 = r11
            byte[] r11 = r36.zzN()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            int r11 = zzd(r11, r15)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L428 java.lang.OutOfMemoryError -> L42a
            r18 = r10
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L4b7 java.lang.OutOfMemoryError -> L4b9
            r20 = r7
            byte[] r7 = r36.zzN()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L4ac java.lang.OutOfMemoryError -> L4ae
            r21 = r6
            int r6 = r11 - r15
            r19 = r8
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.zzfxo.zzb     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            r10.<init>(r7, r15, r6, r8)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            r13[r14] = r10     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            int r11 = r11 + 1
            r9.zzL(r11)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            int r14 = r14 + 1
            r11 = r16
            r10 = r18
            r8 = r19
            r7 = r20
            r6 = r21
            goto L473
        L4ac:
            r0 = move-exception
            goto L4af
        L4ae:
            r0 = move-exception
        L4af:
            r2 = r0
            r3 = r6
            r10 = r18
            r4 = r20
            goto L42e
        L4b7:
            r0 = move-exception
            goto L4ba
        L4b9:
            r0 = move-exception
        L4ba:
            r2 = r0
            r3 = r6
            r4 = r7
            r10 = r18
            goto L42e
        L4c1:
            r21 = r6
            r20 = r7
            r19 = r8
            r18 = r10
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            r6.<init>()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            int r2 = r2 + r12
        L4cf:
            int r7 = r36.zzd()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            if (r7 >= r2) goto L4e0
            r7 = 0
            com.google.android.gms.internal.ads.zzagv r8 = zzl(r1, r9, r3, r4, r7)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            if (r8 == 0) goto L4cf
            r6.add(r8)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            goto L4cf
        L4e0:
            r2 = 0
            com.google.android.gms.internal.ads.zzagv[] r3 = new com.google.android.gms.internal.ads.zzagv[r2]     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            java.lang.Object[] r2 = r6.toArray(r3)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            r30 = r2
            com.google.android.gms.internal.ads.zzagv[] r30 = (com.google.android.gms.internal.ads.zzagv[]) r30     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            com.google.android.gms.internal.ads.zzagn r4 = new com.google.android.gms.internal.ads.zzagn     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            r2 = 1
            if (r2 == r5) goto L4f3
            r28 = 0
            goto L4f5
        L4f3:
            r28 = 1
        L4f5:
            r25 = r4
            r26 = r19
            r29 = r13
            r25.<init>(r26, r27, r28, r29, r30)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L507 java.lang.OutOfMemoryError -> L509
            r2 = r4
            r10 = r18
            r4 = r20
            r3 = r21
            goto L593
        L507:
            r0 = move-exception
            goto L50a
        L509:
            r0 = move-exception
        L50a:
            r2 = r0
            r10 = r18
            r4 = r20
            r3 = r21
            goto L42e
        L513:
            r21 = r6
            r20 = r7
            r18 = r10
            if (r13 != r2) goto L57d
            r2 = 76
            r3 = r21
            if (r3 != r2) goto L578
            r2 = 76
            r4 = r20
            r10 = r18
            if (r4 != r2) goto L583
            r2 = 84
            if (r10 != r2) goto L583
            int r26 = r36.zzq()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            int r27 = r36.zzo()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            int r28 = r36.zzo()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            int r2 = r36.zzm()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            int r5 = r36.zzm()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            com.google.android.gms.internal.ads.zzej r6 = new com.google.android.gms.internal.ads.zzej     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            r6.<init>()     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            r6.zzj(r9)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            int r7 = r12 + (-10)
            int r7 = r7 * 8
            int r8 = r2 + r5
            int r7 = r7 / r8
            int[] r8 = new int[r7]     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            int[] r11 = new int[r7]     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            r13 = 0
        L555:
            if (r13 >= r7) goto L566
            int r14 = r6.zzd(r2)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            int r15 = r6.zzd(r5)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            r8[r13] = r14     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            r11[r13] = r15     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            int r13 = r13 + 1
            goto L555
        L566:
            com.google.android.gms.internal.ads.zzaha r2 = new com.google.android.gms.internal.ads.zzaha     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            r25 = r2
            r29 = r8
            r30 = r11
            r25.<init>(r26, r27, r28, r29, r30)     // Catch: java.lang.Throwable -> L422 java.lang.Exception -> L572 java.lang.OutOfMemoryError -> L574
            goto L593
        L572:
            r0 = move-exception
            goto L575
        L574:
            r0 = move-exception
        L575:
            r2 = r0
            goto L42e
        L578:
            r10 = r18
            r4 = r20
            goto L583
        L57d:
            r10 = r18
            r4 = r20
            r3 = r21
        L583:
            java.lang.String r2 = zzh(r1, r13, r3, r4, r10)     // Catch: java.lang.Throwable -> L59b java.lang.Exception -> L5a4 java.lang.OutOfMemoryError -> L5a6
            byte[] r5 = new byte[r12]     // Catch: java.lang.Throwable -> L59b java.lang.Exception -> L5a4 java.lang.OutOfMemoryError -> L5a6
            r6 = 0
            r9.zzH(r5, r6, r12)     // Catch: java.lang.Throwable -> L59b java.lang.Exception -> L5a4 java.lang.OutOfMemoryError -> L5a6
            com.google.android.gms.internal.ads.zzagj r6 = new com.google.android.gms.internal.ads.zzagj     // Catch: java.lang.Throwable -> L59b java.lang.Exception -> L5a4 java.lang.OutOfMemoryError -> L5a6
            r6.<init>(r2, r5)     // Catch: java.lang.Throwable -> L59b java.lang.Exception -> L5a4 java.lang.OutOfMemoryError -> L5a6
            r2 = r6
        L593:
            r15 = r24
        L595:
            r9.zzL(r15)
            r14 = r2
            r2 = 0
            goto L5af
        L59b:
            r0 = move-exception
            r15 = r24
            goto L32d
        L5a0:
            r9.zzL(r15)
            throw r1
        L5a4:
            r0 = move-exception
            goto L5a7
        L5a6:
            r0 = move-exception
        L5a7:
            r15 = r24
            goto L178
        L5ab:
            r9.zzL(r15)
            r14 = 0
        L5af:
            if (r14 != 0) goto L5d5
            r5 = r23
            java.lang.String r1 = zzh(r1, r5, r3, r4, r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to decode frame: id="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", frameSize="
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = r3.toString()
            r3 = r22
            com.google.android.gms.internal.ads.zzea.zzg(r3, r1, r2)
        L5d5:
            return r14
        L5d6:
            r9 = r2
            r3 = r11
            java.lang.String r1 = "Skipping unsupported compressed or encrypted frame"
            com.google.android.gms.internal.ads.zzea.zzf(r3, r1)
            r9.zzL(r15)
            r1 = 0
            return r1
        L5e2:
            r9 = r2
            r1 = r14
            r9.zzL(r15)
            return r1
    }
}
