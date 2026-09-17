package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzacb {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = null;
    private static final int[] zzc = null;
    private static final int[] zzd = null;
    private static final int[] zze = null;
    private static final int[] zzf = null;
    private static final int[] zzg = null;

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [1, 2, 3, 6} // fill-array
            com.google.android.gms.internal.ads.zzacb.zzb = r0
            r0 = 3
            int[] r1 = new int[r0]
            r1 = {x003e: FILL_ARRAY_DATA , data: [48000, 44100, 32000} // fill-array
            com.google.android.gms.internal.ads.zzacb.zzc = r1
            int[] r0 = new int[r0]
            r0 = {x0048: FILL_ARRAY_DATA , data: [24000, 22050, 16000} // fill-array
            com.google.android.gms.internal.ads.zzacb.zzd = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x0052: FILL_ARRAY_DATA , data: [2, 1, 2, 3, 3, 4, 4, 5} // fill-array
            com.google.android.gms.internal.ads.zzacb.zze = r0
            r0 = 19
            int[] r1 = new int[r0]
            r1 = {x0066: FILL_ARRAY_DATA , data: [32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640} // fill-array
            com.google.android.gms.internal.ads.zzacb.zzf = r1
            int[] r0 = new int[r0]
            r0 = {x0090: FILL_ARRAY_DATA , data: [69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393} // fill-array
            com.google.android.gms.internal.ads.zzacb.zzg = r0
            return
    }

    public static int zza(java.nio.ByteBuffer r3) {
            int r0 = r3.position()
            int r0 = r0 + 5
            byte r0 = r3.get(r0)
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 3
            int r0 = r0 >> r1
            r2 = 10
            if (r0 <= r2) goto L38
            int r0 = r3.position()
            int r0 = r0 + 4
            byte r0 = r3.get(r0)
            r0 = r0 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> 6
            if (r0 != r1) goto L23
            goto L31
        L23:
            int r0 = r3.position()
            int r0 = r0 + 4
            byte r3 = r3.get(r0)
            r3 = r3 & 48
            int r1 = r3 >> 4
        L31:
            int[] r3 = com.google.android.gms.internal.ads.zzacb.zzb
            r3 = r3[r1]
            int r3 = r3 * 256
            return r3
        L38:
            r3 = 1536(0x600, float:2.152E-42)
            return r3
    }

    public static int zzb(byte[] r4) {
            int r0 = r4.length
            r1 = 6
            if (r0 >= r1) goto L6
            r4 = -1
            return r4
        L6:
            r0 = 5
            r0 = r4[r0]
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r2 = 3
            int r0 = r0 >> r2
            r3 = 10
            if (r0 <= r3) goto L21
            r0 = 2
            r0 = r4[r0]
            r0 = r0 & 7
            r4 = r4[r2]
            int r0 = r0 << 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            int r4 = r4 + 1
            int r4 = r4 + r4
            return r4
        L21:
            r0 = 4
            r4 = r4[r0]
            r0 = r4 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> r1
            r4 = r4 & 63
            int r4 = zzf(r0, r4)
            return r4
    }

    public static com.google.android.gms.internal.ads.zzaf zzc(com.google.android.gms.internal.ads.zzek r5, java.lang.String r6, java.lang.String r7, com.google.android.gms.internal.ads.zzy r8) {
            com.google.android.gms.internal.ads.zzej r0 = new com.google.android.gms.internal.ads.zzej
            r0.<init>()
            r0.zzj(r5)
            r1 = 2
            int r1 = r0.zzd(r1)
            int[] r2 = com.google.android.gms.internal.ads.zzacb.zzc
            r1 = r2[r1]
            r2 = 8
            r0.zzn(r2)
            int[] r2 = com.google.android.gms.internal.ads.zzacb.zze
            r3 = 3
            int r3 = r0.zzd(r3)
            r2 = r2[r3]
            r3 = 1
            int r3 = r0.zzd(r3)
            if (r3 == 0) goto L28
            int r2 = r2 + 1
        L28:
            r3 = 5
            int r3 = r0.zzd(r3)
            int[] r4 = com.google.android.gms.internal.ads.zzacb.zzf
            r3 = r4[r3]
            int r3 = r3 * 1000
            r0.zzf()
            int r0 = r0.zzb()
            r5.zzL(r0)
            com.google.android.gms.internal.ads.zzad r5 = new com.google.android.gms.internal.ads.zzad
            r5.<init>()
            r5.zzL(r6)
            java.lang.String r6 = "audio/ac3"
            r5.zzZ(r6)
            r5.zzz(r2)
            r5.zzaa(r1)
            r5.zzF(r8)
            r5.zzP(r7)
            r5.zzy(r3)
            r5.zzU(r3)
            com.google.android.gms.internal.ads.zzaf r5 = r5.zzaf()
            return r5
    }

    public static com.google.android.gms.internal.ads.zzaf zzd(com.google.android.gms.internal.ads.zzek r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.zzy r10) {
            com.google.android.gms.internal.ads.zzej r0 = new com.google.android.gms.internal.ads.zzej
            r0.<init>()
            r0.zzj(r7)
            r1 = 13
            int r1 = r0.zzd(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.zzn(r2)
            r3 = 2
            int r3 = r0.zzd(r3)
            int[] r4 = com.google.android.gms.internal.ads.zzacb.zzc
            r3 = r4[r3]
            r4 = 10
            r0.zzn(r4)
            int[] r4 = com.google.android.gms.internal.ads.zzacb.zze
            int r5 = r0.zzd(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.zzd(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.zzn(r2)
            r2 = 4
            int r2 = r0.zzd(r2)
            r0.zzn(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.zzn(r2)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.zzn(r5)
        L4f:
            int r2 = r0.zza()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.zzn(r6)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.zzf()
            int r0 = r0.zzb()
            r7.zzL(r0)
            com.google.android.gms.internal.ads.zzad r7 = new com.google.android.gms.internal.ads.zzad
            r7.<init>()
            r7.zzL(r8)
            r7.zzZ(r2)
            r7.zzz(r4)
            r7.zzaa(r3)
            r7.zzF(r10)
            r7.zzP(r9)
            r7.zzU(r1)
            com.google.android.gms.internal.ads.zzaf r7 = r7.zzaf()
            return r7
    }

    public static com.google.android.gms.internal.ads.zzaca zze(com.google.android.gms.internal.ads.zzej r30) {
            r0 = r30
            int r1 = r30.zzc()
            r2 = 40
            r0.zzn(r2)
            r2 = 5
            int r3 = r0.zzd(r2)
            r0.zzl(r1)
            r1 = 10
            r4 = -1
            r5 = 8
            r6 = 6
            r7 = 3
            r8 = 1
            r9 = 2
            if (r3 <= r1) goto L228
            r3 = 16
            r0.zzn(r3)
            int r10 = r0.zzd(r9)
            if (r10 == 0) goto L32
            if (r10 == r8) goto L30
            if (r10 == r9) goto L2e
            goto L33
        L2e:
            r4 = 2
            goto L33
        L30:
            r4 = 1
            goto L33
        L32:
            r4 = 0
        L33:
            r0.zzn(r7)
            r10 = 11
            int r10 = r0.zzd(r10)
            int r10 = r10 + r8
            int r12 = r0.zzd(r9)
            if (r12 != r7) goto L4e
            int[] r13 = com.google.android.gms.internal.ads.zzacb.zzd
            int r14 = r0.zzd(r9)
            r13 = r13[r14]
            r14 = 3
            r15 = 6
            goto L60
        L4e:
            int r13 = r0.zzd(r9)
            int[] r14 = com.google.android.gms.internal.ads.zzacb.zzb
            r14 = r14[r13]
            int[] r15 = com.google.android.gms.internal.ads.zzacb.zzc
            r15 = r15[r12]
            r29 = r14
            r14 = r13
            r13 = r15
            r15 = r29
        L60:
            int r10 = r10 + r10
            int r16 = r15 * 32
            int r17 = r10 * r13
            int r17 = r17 / r16
            int r16 = r0.zzd(r7)
            boolean r18 = r30.zzp()
            int[] r19 = com.google.android.gms.internal.ads.zzacb.zze
            r19 = r19[r16]
            int r19 = r19 + r18
            r0.zzn(r1)
            boolean r1 = r30.zzp()
            if (r1 == 0) goto L81
            r0.zzn(r5)
        L81:
            if (r16 != 0) goto L93
            r0.zzn(r2)
            boolean r1 = r30.zzp()
            if (r1 == 0) goto L8f
            r0.zzn(r5)
        L8f:
            r1 = 0
            r16 = 0
            goto L95
        L93:
            r1 = r16
        L95:
            if (r4 != r8) goto La2
            boolean r20 = r30.zzp()
            if (r20 == 0) goto La0
            r0.zzn(r3)
        La0:
            r3 = 1
            goto La3
        La2:
            r3 = r4
        La3:
            boolean r20 = r30.zzp()
            r11 = 4
            if (r20 == 0) goto L1be
            if (r1 <= r9) goto Laf
            r0.zzn(r9)
        Laf:
            r20 = r1 & 1
            if (r20 == 0) goto Lb8
            if (r1 <= r9) goto Lb8
            r0.zzn(r6)
        Lb8:
            r20 = r1 & 4
            if (r20 == 0) goto Lbf
            r0.zzn(r6)
        Lbf:
            if (r18 == 0) goto Lca
            boolean r18 = r30.zzp()
            if (r18 == 0) goto Lca
            r0.zzn(r2)
        Lca:
            if (r3 != 0) goto L1be
            boolean r3 = r30.zzp()
            if (r3 == 0) goto Ld5
            r0.zzn(r6)
        Ld5:
            if (r1 != 0) goto Le0
            boolean r3 = r30.zzp()
            if (r3 == 0) goto Le0
            r0.zzn(r6)
        Le0:
            boolean r3 = r30.zzp()
            if (r3 == 0) goto Le9
            r0.zzn(r6)
        Le9:
            int r3 = r0.zzd(r9)
            if (r3 != r8) goto Lf4
            r0.zzn(r2)
            goto L188
        Lf4:
            if (r3 != r9) goto Lfd
            r3 = 12
            r0.zzn(r3)
            goto L188
        Lfd:
            if (r3 != r7) goto L188
            int r3 = r0.zzd(r2)
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L163
            r0.zzn(r2)
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L115
            r0.zzn(r11)
        L115:
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L11e
            r0.zzn(r11)
        L11e:
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L127
            r0.zzn(r11)
        L127:
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L130
            r0.zzn(r11)
        L130:
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L139
            r0.zzn(r11)
        L139:
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L142
            r0.zzn(r11)
        L142:
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L14b
            r0.zzn(r11)
        L14b:
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L163
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L15a
            r0.zzn(r11)
        L15a:
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L163
            r0.zzn(r11)
        L163:
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L17f
            r0.zzn(r2)
            boolean r18 = r30.zzp()
            if (r18 == 0) goto L17f
            r8 = 7
            r0.zzn(r8)
            boolean r8 = r30.zzp()
            if (r8 == 0) goto L17f
            r0.zzn(r5)
        L17f:
            int r3 = r3 + r9
            int r3 = r3 * 8
            r0.zzn(r3)
            r30.zzf()
        L188:
            if (r1 >= r9) goto L1a0
            boolean r3 = r30.zzp()
            r8 = 14
            if (r3 == 0) goto L195
            r0.zzn(r8)
        L195:
            if (r16 != 0) goto L1a0
            boolean r3 = r30.zzp()
            if (r3 == 0) goto L1a0
            r0.zzn(r8)
        L1a0:
            boolean r3 = r30.zzp()
            if (r3 == 0) goto L1bd
            if (r14 != 0) goto L1ae
            r0.zzn(r2)
            r3 = 0
            r14 = 0
            goto L1be
        L1ae:
            r3 = 0
        L1af:
            if (r3 >= r15) goto L1bd
            boolean r8 = r30.zzp()
            if (r8 == 0) goto L1ba
            r0.zzn(r2)
        L1ba:
            int r3 = r3 + 1
            goto L1af
        L1bd:
            r3 = 0
        L1be:
            boolean r8 = r30.zzp()
            if (r8 == 0) goto L1eb
            r0.zzn(r2)
            if (r1 != r9) goto L1cd
            r0.zzn(r11)
            r1 = 2
        L1cd:
            if (r1 < r6) goto L1d2
            r0.zzn(r9)
        L1d2:
            boolean r2 = r30.zzp()
            if (r2 == 0) goto L1db
            r0.zzn(r5)
        L1db:
            if (r1 != 0) goto L1e6
            boolean r1 = r30.zzp()
            if (r1 == 0) goto L1e6
            r0.zzn(r5)
        L1e6:
            if (r12 >= r7) goto L1eb
            r30.zzm()
        L1eb:
            if (r3 != 0) goto L1f2
            if (r14 == r7) goto L1f2
            r30.zzm()
        L1f2:
            if (r3 != r9) goto L1ff
            if (r14 == r7) goto L1fc
            boolean r1 = r30.zzp()
            if (r1 == 0) goto L1ff
        L1fc:
            r0.zzn(r6)
        L1ff:
            boolean r1 = r30.zzp()
            if (r1 == 0) goto L215
            int r1 = r0.zzd(r6)
            r2 = 1
            if (r1 != r2) goto L215
            int r0 = r0.zzd(r5)
            if (r0 != r2) goto L215
            java.lang.String r0 = "audio/eac3-joc"
            goto L217
        L215:
            java.lang.String r0 = "audio/eac3"
        L217:
            int r15 = r15 * 256
            r21 = r0
            r22 = r4
            r25 = r10
            r24 = r13
            r26 = r15
            r27 = r17
            r23 = r19
            goto L287
        L228:
            r1 = 32
            r0.zzn(r1)
            int r1 = r0.zzd(r9)
            if (r1 != r7) goto L235
            r2 = 0
            goto L237
        L235:
            java.lang.String r2 = "audio/ac3"
        L237:
            int r3 = r0.zzd(r6)
            int r6 = r3 / 2
            int[] r8 = com.google.android.gms.internal.ads.zzacb.zzf
            r6 = r8[r6]
            int r6 = r6 * 1000
            int r10 = zzf(r1, r3)
            r0.zzn(r5)
            int r3 = r0.zzd(r7)
            r5 = r3 & 1
            if (r5 == 0) goto L258
            r5 = 1
            if (r3 == r5) goto L258
            r0.zzn(r9)
        L258:
            r5 = r3 & 4
            if (r5 == 0) goto L25f
            r0.zzn(r9)
        L25f:
            if (r3 != r9) goto L264
            r0.zzn(r9)
        L264:
            if (r1 >= r7) goto L26c
            int[] r5 = com.google.android.gms.internal.ads.zzacb.zzc
            r1 = r5[r1]
            r13 = r1
            goto L26d
        L26c:
            r13 = -1
        L26d:
            boolean r0 = r30.zzp()
            int[] r1 = com.google.android.gms.internal.ads.zzacb.zze
            r1 = r1[r3]
            int r19 = r1 + r0
            r15 = 1536(0x600, float:2.152E-42)
            r21 = r2
            r27 = r6
            r25 = r10
            r24 = r13
            r23 = r19
            r22 = -1
            r26 = 1536(0x600, float:2.152E-42)
        L287:
            com.google.android.gms.internal.ads.zzaca r0 = new com.google.android.gms.internal.ads.zzaca
            r28 = 0
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
    }

    private static int zzf(int r2, int r3) {
            if (r2 < 0) goto L2e
            r0 = 3
            if (r2 >= r0) goto L2e
            if (r3 < 0) goto L2e
            int r0 = r3 >> 1
            r1 = 19
            if (r0 < r1) goto Le
            goto L2e
        Le:
            int[] r1 = com.google.android.gms.internal.ads.zzacb.zzc
            r2 = r1[r2]
            r1 = 44100(0xac44, float:6.1797E-41)
            if (r2 != r1) goto L20
            int[] r2 = com.google.android.gms.internal.ads.zzacb.zzg
            r2 = r2[r0]
            r3 = r3 & 1
            int r2 = r2 + r3
            int r2 = r2 + r2
            return r2
        L20:
            int[] r3 = com.google.android.gms.internal.ads.zzacb.zzf
            r3 = r3[r0]
            r0 = 32000(0x7d00, float:4.4842E-41)
            if (r2 != r0) goto L2b
            int r3 = r3 * 6
            return r3
        L2b:
            int r3 = r3 * 4
            return r3
        L2e:
            r2 = -1
            return r2
    }
}
