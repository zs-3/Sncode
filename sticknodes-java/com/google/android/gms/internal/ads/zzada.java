package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzada {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = null;
    private static final int[] zzc = null;
    private static final int[] zzd = null;
    private static final int[] zze = null;
    private static final int[] zzf = null;
    private static final int[] zzg = null;
    private static final int[] zzh = null;
    private static final int[] zzi = null;
    private static final int[] zzj = null;

    static {
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x0046: FILL_ARRAY_DATA , data: [1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8} // fill-array
            com.google.android.gms.internal.ads.zzada.zzb = r1
            int[] r1 = new int[r0]
            r1 = {x006a: FILL_ARRAY_DATA , data: [-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1} // fill-array
            com.google.android.gms.internal.ads.zzada.zzc = r1
            r1 = 29
            int[] r1 = new int[r1]
            r1 = {x008e: FILL_ARRAY_DATA , data: [64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680} // fill-array
            com.google.android.gms.internal.ads.zzada.zzd = r1
            int[] r0 = new int[r0]
            r0 = {x00cc: FILL_ARRAY_DATA , data: [8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000} // fill-array
            com.google.android.gms.internal.ads.zzada.zze = r0
            r0 = 4
            int[] r1 = new int[r0]
            r1 = {x00f0: FILL_ARRAY_DATA , data: [5, 8, 10, 12} // fill-array
            com.google.android.gms.internal.ads.zzada.zzf = r1
            int[] r1 = new int[r0]
            r1 = {x00fc: FILL_ARRAY_DATA , data: [6, 9, 12, 15} // fill-array
            com.google.android.gms.internal.ads.zzada.zzg = r1
            int[] r1 = new int[r0]
            r1 = {x0108: FILL_ARRAY_DATA , data: [2, 4, 6, 8} // fill-array
            com.google.android.gms.internal.ads.zzada.zzh = r1
            int[] r1 = new int[r0]
            r1 = {x0114: FILL_ARRAY_DATA , data: [9, 11, 13, 16} // fill-array
            com.google.android.gms.internal.ads.zzada.zzi = r1
            int[] r0 = new int[r0]
            r0 = {x0120: FILL_ARRAY_DATA , data: [5, 8, 10, 12} // fill-array
            com.google.android.gms.internal.ads.zzada.zzj = r0
            return
    }

    public static int zza(byte[] r2) {
            com.google.android.gms.internal.ads.zzej r2 = zzg(r2)
            r0 = 42
            r2.zzn(r0)
            boolean r0 = r2.zzp()
            r1 = 1
            if (r1 == r0) goto L13
            r0 = 8
            goto L15
        L13:
            r0 = 12
        L15:
            int r2 = r2.zzd(r0)
            int r2 = r2 + r1
            return r2
    }

    public static int zzb(byte[] r2) {
            com.google.android.gms.internal.ads.zzej r2 = zzg(r2)
            r0 = 32
            r2.zzn(r0)
            int[] r0 = com.google.android.gms.internal.ads.zzada.zzj
            r1 = 1
            int r2 = zzf(r2, r0, r1)
            int r2 = r2 + r1
            return r2
    }

    public static com.google.android.gms.internal.ads.zzaf zzc(byte[] r4, java.lang.String r5, java.lang.String r6, int r7, com.google.android.gms.internal.ads.zzy r8) {
            com.google.android.gms.internal.ads.zzej r4 = zzg(r4)
            r8 = 60
            r4.zzn(r8)
            r8 = 6
            int r8 = r4.zzd(r8)
            int[] r0 = com.google.android.gms.internal.ads.zzada.zzb
            r8 = r0[r8]
            r0 = 4
            int r0 = r4.zzd(r0)
            int[] r1 = com.google.android.gms.internal.ads.zzada.zzc
            r0 = r1[r0]
            r1 = 5
            int r1 = r4.zzd(r1)
            r2 = 2
            r3 = 29
            if (r1 < r3) goto L27
            r1 = -1
            goto L2e
        L27:
            int[] r3 = com.google.android.gms.internal.ads.zzada.zzd
            r1 = r3[r1]
            int r1 = r1 * 1000
            int r1 = r1 / r2
        L2e:
            r3 = 10
            r4.zzn(r3)
            int r4 = r4.zzd(r2)
            if (r4 <= 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = 0
        L3c:
            int r8 = r8 + r4
            com.google.android.gms.internal.ads.zzad r4 = new com.google.android.gms.internal.ads.zzad
            r4.<init>()
            r4.zzL(r5)
            java.lang.String r5 = "audio/vnd.dts"
            r4.zzZ(r5)
            r4.zzy(r1)
            r4.zzz(r8)
            r4.zzaa(r0)
            r5 = 0
            r4.zzF(r5)
            r4.zzP(r6)
            r4.zzX(r7)
            com.google.android.gms.internal.ads.zzaf r4 = r4.zzaf()
            return r4
    }

    public static com.google.android.gms.internal.ads.zzacz zzd(byte[] r17) throws com.google.android.gms.internal.ads.zzbo {
            com.google.android.gms.internal.ads.zzej r0 = zzg(r17)
            r1 = 40
            r0.zzn(r1)
            r1 = 2
            int r2 = r0.zzd(r1)
            boolean r3 = r0.zzp()
            r4 = 1
            if (r4 == r3) goto L18
            r5 = 16
            goto L1a
        L18:
            r5 = 20
        L1a:
            r6 = 12
            r7 = 8
            if (r4 == r3) goto L23
            r3 = 8
            goto L25
        L23:
            r3 = 12
        L25:
            r0.zzn(r3)
            int r3 = r0.zzd(r5)
            int r12 = r3 + 1
            boolean r3 = r0.zzp()
            r8 = -1
            r9 = 0
            if (r3 == 0) goto L93
            int r10 = r0.zzd(r1)
            r11 = 3
            int r13 = r0.zzd(r11)
            int r13 = r13 + r4
            boolean r14 = r0.zzp()
            if (r14 == 0) goto L4b
            r14 = 36
            r0.zzn(r14)
        L4b:
            int r14 = r0.zzd(r11)
            int r14 = r14 + r4
            int r11 = r0.zzd(r11)
            int r11 = r11 + r4
            if (r14 != r4) goto L8c
            if (r11 != r4) goto L8c
            int r2 = r2 + r4
            int r11 = r0.zzd(r2)
            r14 = 0
        L5f:
            if (r14 >= r2) goto L6c
            int r15 = r11 >> r14
            r15 = r15 & r4
            if (r15 != r4) goto L69
            r0.zzn(r7)
        L69:
            int r14 = r14 + 1
            goto L5f
        L6c:
            int r13 = r13 * 512
            boolean r2 = r0.zzp()
            if (r2 == 0) goto L8a
            r0.zzn(r1)
            int r2 = r0.zzd(r1)
            int r2 = r2 + r4
            int r2 = r2 << r1
            int r11 = r0.zzd(r1)
            int r11 = r11 + r4
        L82:
            if (r9 >= r11) goto L8a
            r0.zzn(r2)
            int r9 = r9 + 1
            goto L82
        L8a:
            r9 = r13
            goto L94
        L8c:
            java.lang.String r0 = "Multiple audio presentations or assets not supported"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        L93:
            r10 = -1
        L94:
            r0.zzn(r5)
            r0.zzn(r6)
            if (r3 == 0) goto Ld4
            boolean r2 = r0.zzp()
            r5 = 4
            if (r2 == 0) goto La6
            r0.zzn(r5)
        La6:
            boolean r2 = r0.zzp()
            if (r2 == 0) goto Lb1
            r2 = 24
            r0.zzn(r2)
        Lb1:
            boolean r2 = r0.zzp()
            if (r2 == 0) goto Lc1
            r2 = 10
            int r2 = r0.zzd(r2)
            int r2 = r2 + r4
            r0.zzo(r2)
        Lc1:
            r2 = 5
            r0.zzn(r2)
            int[] r2 = com.google.android.gms.internal.ads.zzada.zze
            int r5 = r0.zzd(r5)
            r2 = r2[r5]
            int r0 = r0.zzd(r7)
            int r0 = r0 + r4
            r11 = r2
            goto Ldb
        Ld4:
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r0 = -1
            r11 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        Ldb:
            if (r3 == 0) goto L110
            if (r10 == 0) goto L102
            if (r10 == r4) goto Lfe
            if (r10 != r1) goto Le7
            r1 = 48000(0xbb80, float:6.7262E-41)
            goto L104
        Le7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported reference clock code in DTS HD header: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)
            throw r0
        Lfe:
            r1 = 44100(0xac44, float:6.1797E-41)
            goto L104
        L102:
            r1 = 32000(0x7d00, float:4.4842E-41)
        L104:
            long r2 = (long) r9
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = (long) r1
            java.math.RoundingMode r8 = java.math.RoundingMode.FLOOR
            long r1 = com.google.android.gms.internal.ads.zzeu.zzt(r2, r4, r6, r8)
            goto L115
        L110:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L115:
            r13 = r1
            com.google.android.gms.internal.ads.zzacz r1 = new com.google.android.gms.internal.ads.zzacz
            r15 = 0
            r16 = 0
            java.lang.String r9 = "audio/vnd.dts.hd;profile=lbr"
            r8 = r1
            r10 = r0
            r8.<init>(r9, r10, r11, r12, r13, r15, r16)
            return r1
    }

    public static com.google.android.gms.internal.ads.zzacz zze(byte[] r17, java.util.concurrent.atomic.AtomicInteger r18) throws com.google.android.gms.internal.ads.zzbo {
            r0 = r17
            com.google.android.gms.internal.ads.zzej r1 = zzg(r17)
            r2 = 32
            int r2 = r1.zzd(r2)
            int[] r3 = com.google.android.gms.internal.ads.zzada.zzf
            r4 = 1
            int r3 = zzf(r1, r3, r4)
            int r3 = r3 + r4
            r5 = 0
            r6 = 1078008818(0x40411bf2, float:3.0173306)
            if (r2 != r6) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto Lc7
            boolean r6 = r1.zzp()
            if (r6 == 0) goto Lc0
            int r6 = r3 + (-2)
            r7 = r0[r6]
            int r7 = r7 << 8
            int r8 = r3 + (-1)
            r8 = r0[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 65535(0xffff, float:9.1834E-41)
            int r0 = com.google.android.gms.internal.ads.zzeu.zzd(r0, r5, r6, r9)
            char r6 = (char) r7
            r6 = r6 | r8
            r7 = 0
            if (r6 != r0) goto Lb9
            r0 = 2
            int r6 = r1.zzd(r0)
            if (r6 == 0) goto L64
            if (r6 == r4) goto L61
            if (r6 != r0) goto L4b
            r6 = 384(0x180, float:5.38E-43)
            goto L66
        L4b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported base duration index in DTS UHD header: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r7)
            throw r0
        L61:
            r6 = 480(0x1e0, float:6.73E-43)
            goto L66
        L64:
            r6 = 512(0x200, float:7.175E-43)
        L66:
            r8 = 3
            int r8 = r1.zzd(r8)
            int r8 = r8 + r4
            int r9 = r1.zzd(r0)
            if (r9 == 0) goto L94
            if (r9 == r4) goto L90
            if (r9 != r0) goto L7a
            r7 = 48000(0xbb80, float:6.7262E-41)
            goto L96
        L7a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported clock rate index in DTS UHD header: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r7)
            throw r0
        L90:
            r7 = 44100(0xac44, float:6.1797E-41)
            goto L96
        L94:
            r7 = 32000(0x7d00, float:4.4842E-41)
        L96:
            boolean r9 = r1.zzp()
            if (r9 == 0) goto La1
            r9 = 36
            r1.zzn(r9)
        La1:
            int r6 = r6 * r8
            int r0 = r1.zzd(r0)
            int r0 = r4 << r0
            int r0 = r0 * r7
            long r12 = (long) r7
            long r8 = (long) r6
            r10 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r14 = java.math.RoundingMode.FLOOR
            long r6 = com.google.android.gms.internal.ads.zzeu.zzt(r8, r10, r12, r14)
            r11 = r0
            r13 = r6
            goto Ld3
        Lb9:
            java.lang.String r0 = "CRC check failed"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r7)
            throw r0
        Lc0:
            java.lang.String r0 = "Only supports full channel mask-based audio presentation"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        Lc7:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r13 = r6
            r11 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        Ld3:
            r0 = 0
            r6 = 0
        Ld5:
            if (r0 >= r2) goto Le0
            int[] r0 = com.google.android.gms.internal.ads.zzada.zzg
            int r0 = zzf(r1, r0, r4)
            int r6 = r6 + r0
            r0 = 1
            goto Ld5
        Le0:
            r0 = 0
        Le1:
            if (r0 > 0) goto L105
            if (r2 == 0) goto Lf1
            int[] r7 = com.google.android.gms.internal.ads.zzada.zzh
            int r7 = zzf(r1, r7, r4)
            r8 = r18
            r8.set(r7)
            goto Lf3
        Lf1:
            r8 = r18
        Lf3:
            int r7 = r18.get()
            if (r7 == 0) goto L100
            int[] r7 = com.google.android.gms.internal.ads.zzada.zzi
            int r7 = zzf(r1, r7, r4)
            goto L101
        L100:
            r7 = 0
        L101:
            int r6 = r6 + r7
            int r0 = r0 + 1
            goto Le1
        L105:
            int r12 = r3 + r6
            com.google.android.gms.internal.ads.zzacz r0 = new com.google.android.gms.internal.ads.zzacz
            r10 = 2
            r15 = 0
            r16 = 0
            java.lang.String r9 = "audio/vnd.dts.uhd;profile=p2"
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r15, r16)
            return r0
    }

    private static int zzf(com.google.android.gms.internal.ads.zzej r4, int[] r5, boolean r6) {
            r6 = 0
            r0 = 0
            r1 = 0
        L3:
            r2 = 3
            if (r0 >= r2) goto L11
            boolean r2 = r4.zzp()
            if (r2 == 0) goto L11
            int r1 = r1 + 1
            int r0 = r0 + 1
            goto L3
        L11:
            r0 = 0
        L12:
            if (r6 >= r1) goto L1d
            r2 = r5[r6]
            r3 = 1
            int r2 = r3 << r2
            int r0 = r0 + r2
            int r6 = r6 + 1
            goto L12
        L1d:
            r5 = r5[r1]
            int r4 = r4.zzd(r5)
            int r0 = r0 + r4
            return r0
    }

    private static com.google.android.gms.internal.ads.zzej zzg(byte[] r6) {
            r0 = 0
            r1 = r6[r0]
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 == r2) goto L6b
            r2 = 100
            if (r1 == r2) goto L6b
            r2 = 64
            if (r1 == r2) goto L6b
            r2 = 113(0x71, float:1.58E-43)
            if (r1 != r2) goto L14
            goto L6b
        L14:
            int r1 = r6.length
            byte[] r6 = java.util.Arrays.copyOf(r6, r1)
            r1 = r6[r0]
            r2 = -2
            r3 = -1
            if (r1 == r2) goto L2d
            if (r1 == r3) goto L2d
            r2 = 37
            if (r1 == r2) goto L2d
            r2 = -14
            if (r1 == r2) goto L2d
            r2 = -24
            if (r1 != r2) goto L3f
        L2d:
            r1 = 0
        L2e:
            int r2 = r6.length
            int r2 = r2 + r3
            if (r1 >= r2) goto L3f
            r2 = r6[r1]
            int r4 = r1 + 1
            r5 = r6[r4]
            r6[r1] = r5
            r6[r4] = r2
            int r1 = r1 + 2
            goto L2e
        L3f:
            com.google.android.gms.internal.ads.zzej r1 = new com.google.android.gms.internal.ads.zzej
            int r2 = r6.length
            r1.<init>(r6, r2)
            r0 = r6[r0]
            r3 = 31
            if (r0 != r3) goto L66
            com.google.android.gms.internal.ads.zzej r0 = new com.google.android.gms.internal.ads.zzej
            r0.<init>(r6, r2)
        L50:
            int r2 = r0.zza()
            r3 = 16
            if (r2 < r3) goto L66
            r2 = 2
            r0.zzn(r2)
            r2 = 14
            int r3 = r0.zzd(r2)
            r1.zzg(r3, r2)
            goto L50
        L66:
            int r0 = r6.length
            r1.zzk(r6, r0)
            return r1
        L6b:
            com.google.android.gms.internal.ads.zzej r0 = new com.google.android.gms.internal.ads.zzej
            int r1 = r6.length
            r0.<init>(r6, r1)
            return r0
    }
}
