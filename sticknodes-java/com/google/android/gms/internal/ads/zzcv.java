package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcv {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzcv(int r1, int r2, float r3, float r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            float r3 = (float) r1
            float r4 = (float) r5
            float r3 = r3 / r4
            r0.zze = r3
            int r3 = r1 / 400
            r0.zzf = r3
            int r1 = r1 / 65
            r0.zzg = r1
            int r1 = r1 + r1
            r0.zzh = r1
            short[] r3 = new short[r1]
            r0.zzi = r3
            int r1 = r1 * r2
            short[] r2 = new short[r1]
            r0.zzj = r2
            short[] r2 = new short[r1]
            r0.zzl = r2
            short[] r1 = new short[r1]
            r0.zzn = r1
            return
    }

    private final int zzg(short[] r10, int r11, int r12, int r13) {
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
        L6:
            if (r12 > r13) goto L38
            r5 = 0
            r6 = 0
        La:
            if (r5 >= r12) goto L21
            int r7 = r9.zzb
            int r7 = r7 * r11
            int r8 = r7 + r5
            short r8 = r10[r8]
            int r7 = r7 + r12
            int r7 = r7 + r5
            short r7 = r10[r7]
            int r8 = r8 - r7
            int r7 = java.lang.Math.abs(r8)
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto La
        L21:
            int r5 = r6 * r3
            int r7 = r0 * r12
            if (r5 >= r7) goto L28
            r0 = r6
        L28:
            if (r5 >= r7) goto L2b
            r3 = r12
        L2b:
            int r5 = r6 * r2
            int r7 = r4 * r12
            if (r5 <= r7) goto L32
            r4 = r6
        L32:
            if (r5 <= r7) goto L35
            r2 = r12
        L35:
            int r12 = r12 + 1
            goto L6
        L38:
            int r0 = r0 / r3
            r9.zzu = r0
            int r4 = r4 / r2
            r9.zzv = r4
            return r3
    }

    private final void zzh(short[] r5, int r6, int r7) {
            r4 = this;
            short[] r0 = r4.zzl
            int r1 = r4.zzm
            short[] r0 = r4.zzl(r0, r1, r7)
            r4.zzl = r0
            int r1 = r4.zzm
            int r2 = r4.zzb
            int r1 = r1 * r2
            int r3 = r7 * r2
            int r6 = r6 * r2
            java.lang.System.arraycopy(r5, r6, r0, r1, r3)
            int r5 = r4.zzm
            int r5 = r5 + r7
            r4.zzm = r5
            return
    }

    private final void zzi(short[] r7, int r8, int r9) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.zzh
            int r2 = r2 / r9
            if (r1 >= r2) goto L24
            r2 = 0
            r3 = 0
        L9:
            int r4 = r6.zzb
            int r5 = r4 * r9
            if (r2 >= r5) goto L1b
            int r4 = r4 * r8
            int r5 = r5 * r1
            int r4 = r4 + r5
            int r4 = r4 + r2
            short r4 = r7[r4]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L9
        L1b:
            int r3 = r3 / r5
            short[] r2 = r6.zzi
            short r3 = (short) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2
        L24:
            return
    }

    private static void zzj(int r8, int r9, short[] r10, int r11, short[] r12, int r13, short[] r14, int r15) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r9) goto L28
            int r2 = r11 * r9
            int r3 = r15 * r9
            int r4 = r13 * r9
            int r4 = r4 + r1
            int r3 = r3 + r1
            int r2 = r2 + r1
            r5 = 0
        Le:
            if (r5 >= r8) goto L25
            short r6 = r12[r4]
            int r7 = r8 - r5
            int r6 = r6 * r7
            short r7 = r14[r3]
            int r7 = r7 * r5
            int r6 = r6 + r7
            int r6 = r6 / r8
            short r6 = (short) r6
            r10[r2] = r6
            int r2 = r2 + r9
            int r4 = r4 + r9
            int r3 = r3 + r9
            int r5 = r5 + 1
            goto Le
        L25:
            int r1 = r1 + 1
            goto L2
        L28:
            return
    }

    private final void zzk() {
            r20 = this;
            r0 = r20
            float r1 = r0.zzc
            float r2 = r0.zzd
            float r1 = r1 / r2
            double r2 = (double) r1
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = 1
            r7 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            int r7 = r0.zzm
            if (r9 > 0) goto L2c
            r8 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 >= 0) goto L21
            goto L2c
        L21:
            short[] r1 = r0.zzj
            int r2 = r0.zzk
            r0.zzh(r1, r5, r2)
            r0.zzk = r5
            goto L16e
        L2c:
            int r8 = r0.zzk
            int r9 = r0.zzh
            if (r8 >= r9) goto L34
            goto L16e
        L34:
            r9 = 0
        L35:
            int r10 = r0.zzr
            if (r10 <= 0) goto L4c
            int r11 = r0.zzh
            int r10 = java.lang.Math.min(r11, r10)
            short[] r11 = r0.zzj
            r0.zzh(r11, r9, r10)
            int r11 = r0.zzr
            int r11 = r11 - r10
            r0.zzr = r11
            int r9 = r9 + r10
            goto L159
        L4c:
            short[] r10 = r0.zzj
            int r11 = r0.zza
            r12 = 4000(0xfa0, float:5.605E-42)
            if (r11 <= r12) goto L57
            int r11 = r11 / 4000
            goto L58
        L57:
            r11 = 1
        L58:
            int r12 = r0.zzb
            if (r12 != r6) goto L67
            if (r11 != r6) goto L67
            int r11 = r0.zzf
            int r12 = r0.zzg
            int r10 = r0.zzg(r10, r9, r11, r12)
            goto L9d
        L67:
            r0.zzi(r10, r9, r11)
            short[] r12 = r0.zzi
            int r13 = r0.zzf
            int r14 = r0.zzg
            int r14 = r14 / r11
            int r13 = r13 / r11
            int r12 = r0.zzg(r12, r5, r13, r14)
            if (r11 == r6) goto L9c
            int r12 = r12 * r11
            int r11 = r11 * 4
            int r13 = r0.zzf
            int r14 = r12 - r11
            if (r14 < r13) goto L83
            r13 = r14
        L83:
            int r12 = r12 + r11
            int r11 = r0.zzg
            if (r12 <= r11) goto L89
            r12 = r11
        L89:
            int r11 = r0.zzb
            if (r11 != r6) goto L92
            int r10 = r0.zzg(r10, r9, r13, r12)
            goto L9d
        L92:
            r0.zzi(r10, r9, r6)
            short[] r10 = r0.zzi
            int r10 = r0.zzg(r10, r5, r13, r12)
            goto L9d
        L9c:
            r10 = r12
        L9d:
            int r11 = r0.zzu
            int r12 = r0.zzv
            if (r11 == 0) goto Lb8
            int r13 = r0.zzs
            if (r13 != 0) goto La8
            goto Lb8
        La8:
            int r14 = r11 * 3
            if (r12 <= r14) goto Lad
            goto Lb8
        Lad:
            int r12 = r11 + r11
            int r14 = r0.zzt
            int r14 = r14 * 3
            if (r12 > r14) goto Lb6
            goto Lb8
        Lb6:
            r15 = r13
            goto Lb9
        Lb8:
            r15 = r10
        Lb9:
            int r17 = r9 + r15
            r0.zzt = r11
            r0.zzs = r10
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            float r10 = (float) r15
            if (r13 <= 0) goto L104
            short[] r14 = r0.zzj
            float r12 = r12 + r1
            r11 = 1073741824(0x40000000, float:2.0)
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto Ld5
            float r10 = r10 / r12
            int r10 = (int) r10
            r13 = r10
            goto Ldd
        Ld5:
            float r11 = r11 - r1
            float r10 = r10 * r11
            float r10 = r10 / r12
            int r10 = (int) r10
            r0.zzr = r10
            r13 = r15
        Ldd:
            short[] r10 = r0.zzl
            int r11 = r0.zzm
            short[] r12 = r0.zzl(r10, r11, r13)
            r0.zzl = r12
            int r11 = r0.zzb
            int r10 = r0.zzm
            r16 = r10
            r10 = r13
            r18 = r13
            r13 = r16
            r16 = r14
            r19 = r15
            r15 = r9
            zzj(r10, r11, r12, r13, r14, r15, r16, r17)
            int r10 = r0.zzm
            int r10 = r10 + r18
            r0.zzm = r10
            int r15 = r19 + r18
            int r9 = r9 + r15
            goto L159
        L104:
            r19 = r15
            short[] r15 = r0.zzj
            float r11 = r4 - r1
            r13 = 1056964608(0x3f000000, float:0.5)
            int r13 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r13 >= 0) goto L117
            float r10 = r10 * r1
            float r10 = r10 / r11
            int r10 = (int) r10
            r18 = r10
            goto L122
        L117:
            float r13 = r1 + r1
            float r13 = r13 + r12
            float r10 = r10 * r13
            float r10 = r10 / r11
            int r10 = (int) r10
            r0.zzr = r10
            r18 = r19
        L122:
            short[] r10 = r0.zzl
            int r11 = r0.zzm
            int r14 = r19 + r18
            short[] r10 = r0.zzl(r10, r11, r14)
            r0.zzl = r10
            int r11 = r0.zzb
            int r12 = r9 * r11
            int r13 = r0.zzm
            int r13 = r13 * r11
            int r11 = r11 * r19
            java.lang.System.arraycopy(r15, r12, r10, r13, r11)
            int r11 = r0.zzb
            short[] r12 = r0.zzl
            int r10 = r0.zzm
            int r13 = r10 + r19
            r10 = r18
            r19 = r14
            r14 = r15
            r16 = r15
            r15 = r17
            r17 = r9
            zzj(r10, r11, r12, r13, r14, r15, r16, r17)
            int r10 = r0.zzm
            int r10 = r10 + r19
            r0.zzm = r10
            int r9 = r9 + r18
        L159:
            int r10 = r0.zzh
            int r10 = r10 + r9
            if (r10 <= r8) goto L35
            int r1 = r0.zzk
            int r1 = r1 - r9
            short[] r2 = r0.zzj
            int r3 = r0.zzb
            int r9 = r9 * r3
            int r3 = r3 * r1
            java.lang.System.arraycopy(r2, r9, r2, r5, r3)
            r0.zzk = r1
        L16e:
            float r1 = r0.zzd
            float r2 = r0.zze
            float r2 = r2 * r1
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L234
            int r1 = r0.zzm
            if (r1 != r7) goto L17e
            goto L234
        L17e:
            int r1 = r0.zza
            float r3 = (float) r1
            float r3 = r3 / r2
            int r2 = (int) r3
        L183:
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 > r3) goto L22e
            if (r1 <= r3) goto L18b
            goto L22e
        L18b:
            int r3 = r0.zzm
            int r3 = r3 - r7
            short[] r4 = r0.zzn
            int r8 = r0.zzo
            short[] r4 = r0.zzl(r4, r8, r3)
            r0.zzn = r4
            short[] r8 = r0.zzl
            int r9 = r0.zzb
            int r10 = r7 * r9
            int r11 = r0.zzo
            int r11 = r11 * r9
            int r9 = r9 * r3
            java.lang.System.arraycopy(r8, r10, r4, r11, r9)
            r0.zzm = r7
            int r4 = r0.zzo
            int r4 = r4 + r3
            r0.zzo = r4
            r3 = 0
        L1af:
            int r4 = r0.zzo
            int r7 = r4 + (-1)
            if (r3 >= r7) goto L21a
        L1b5:
            int r4 = r0.zzp
            int r4 = r4 + r6
            int r7 = r4 * r2
            int r8 = r0.zzq
            int r9 = r8 * r1
            if (r7 <= r9) goto L207
            short[] r4 = r0.zzl
            int r7 = r0.zzm
            short[] r4 = r0.zzl(r4, r7, r6)
            r0.zzl = r4
            r4 = 0
        L1cb:
            int r7 = r0.zzb
            if (r4 >= r7) goto L1fc
            short[] r8 = r0.zzl
            int r9 = r0.zzm
            int r9 = r9 * r7
            short[] r10 = r0.zzn
            int r11 = r3 * r7
            int r11 = r11 + r4
            short r12 = r10[r11]
            int r11 = r11 + r7
            short r7 = r10[r11]
            int r10 = r0.zzq
            int r10 = r10 * r1
            int r11 = r0.zzp
            int r13 = r11 * r2
            int r11 = r11 + r6
            int r11 = r11 * r2
            int r10 = r11 - r10
            int r12 = r12 * r10
            int r11 = r11 - r13
            int r10 = r11 - r10
            int r10 = r10 * r7
            int r12 = r12 + r10
            int r12 = r12 / r11
            short r7 = (short) r12
            int r9 = r9 + r4
            r8[r9] = r7
            int r4 = r4 + 1
            goto L1cb
        L1fc:
            int r4 = r0.zzq
            int r4 = r4 + r6
            r0.zzq = r4
            int r4 = r0.zzm
            int r4 = r4 + r6
            r0.zzm = r4
            goto L1b5
        L207:
            r0.zzp = r4
            if (r4 != r1) goto L217
            r0.zzp = r5
            if (r8 != r2) goto L211
            r4 = 1
            goto L212
        L211:
            r4 = 0
        L212:
            com.google.android.gms.internal.ads.zzdi.zzf(r4)
            r0.zzq = r5
        L217:
            int r3 = r3 + 1
            goto L1af
        L21a:
            if (r7 == 0) goto L234
            short[] r1 = r0.zzn
            int r2 = r0.zzb
            int r4 = r4 - r7
            int r3 = r7 * r2
            int r4 = r4 * r2
            java.lang.System.arraycopy(r1, r3, r1, r5, r4)
            int r1 = r0.zzo
            int r1 = r1 - r7
            r0.zzo = r1
            return
        L22e:
            int r2 = r2 / 2
            int r1 = r1 / 2
            goto L183
        L234:
            return
    }

    private final short[] zzl(short[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r3.length
            int r1 = r2.zzb
            int r0 = r0 / r1
            int r4 = r4 + r5
            if (r4 > r0) goto L8
            return r3
        L8:
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + r5
            int r0 = r0 * r1
            short[] r3 = java.util.Arrays.copyOf(r3, r0)
            return r3
    }

    public final int zza() {
            r2 = this;
            int r0 = r2.zzm
            int r1 = r2.zzb
            int r0 = r0 * r1
            int r0 = r0 + r0
            return r0
    }

    public final int zzb() {
            r2 = this;
            int r0 = r2.zzk
            int r1 = r2.zzb
            int r0 = r0 * r1
            int r0 = r0 + r0
            return r0
    }

    public final void zzc() {
            r1 = this;
            r0 = 0
            r1.zzk = r0
            r1.zzm = r0
            r1.zzo = r0
            r1.zzp = r0
            r1.zzq = r0
            r1.zzr = r0
            r1.zzs = r0
            r1.zzt = r0
            r1.zzu = r0
            r1.zzv = r0
            return
    }

    public final void zzd(java.nio.ShortBuffer r5) {
            r4 = this;
            int r0 = r5.remaining()
            int r1 = r4.zzb
            int r0 = r0 / r1
            int r1 = r4.zzm
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r4.zzb
            int r1 = r1 * r0
            short[] r2 = r4.zzl
            r3 = 0
            r5.put(r2, r3, r1)
            int r5 = r4.zzm
            int r5 = r5 - r0
            r4.zzm = r5
            int r1 = r4.zzb
            int r0 = r0 * r1
            short[] r2 = r4.zzl
            int r5 = r5 * r1
            java.lang.System.arraycopy(r2, r0, r2, r3, r5)
            return
    }

    public final void zze() {
            r7 = this;
            int r0 = r7.zzk
            float r1 = (float) r0
            int r2 = r7.zzm
            int r3 = r7.zzo
            float r3 = (float) r3
            float r4 = r7.zzc
            float r5 = r7.zze
            float r6 = r7.zzd
            float r4 = r4 / r6
            float r1 = r1 / r4
            float r1 = r1 + r3
            float r5 = r5 * r6
            float r1 = r1 / r5
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r3
            int r1 = (int) r1
            int r2 = r2 + r1
            int r1 = r7.zzh
            int r1 = r1 + r1
            int r1 = r1 + r0
            short[] r3 = r7.zzj
            short[] r1 = r7.zzl(r3, r0, r1)
            r7.zzj = r1
            r1 = 0
            r3 = 0
        L27:
            int r4 = r7.zzh
            int r5 = r7.zzb
            int r4 = r4 + r4
            int r6 = r4 * r5
            if (r3 >= r6) goto L3a
            short[] r4 = r7.zzj
            int r5 = r5 * r0
            int r5 = r5 + r3
            r4[r5] = r1
            int r3 = r3 + 1
            goto L27
        L3a:
            int r0 = r7.zzk
            int r0 = r0 + r4
            r7.zzk = r0
            r7.zzk()
            int r0 = r7.zzm
            if (r0 <= r2) goto L48
            r7.zzm = r2
        L48:
            r7.zzk = r1
            r7.zzr = r1
            r7.zzo = r1
            return
    }

    public final void zzf(java.nio.ShortBuffer r6) {
            r5 = this;
            int r0 = r6.remaining()
            int r1 = r5.zzb
            int r0 = r0 / r1
            int r1 = r1 * r0
            short[] r2 = r5.zzj
            int r3 = r5.zzk
            short[] r2 = r5.zzl(r2, r3, r0)
            r5.zzj = r2
            int r3 = r5.zzk
            int r4 = r5.zzb
            int r3 = r3 * r4
            int r1 = r1 + r1
            int r1 = r1 / 2
            r6.get(r2, r3, r1)
            int r6 = r5.zzk
            int r6 = r6 + r0
            r5.zzk = r6
            r5.zzk()
            return
    }
}
