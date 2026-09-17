package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfs {
    public static final byte[] zza = null;
    public static final float[] zzb = null;
    private static final java.lang.Object zzc = null;
    private static int[] zzd;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 0, 0, 1} // fill-array
            com.google.android.gms.internal.ads.zzfs.zza = r0
            r0 = 17
            float[] r0 = new float[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1066115817, 1063828015, 1069166220, 1067132618, 1074504425, 1072216623, 1077554828, 1075521226, 1070691421, 1068403619, 1073233424, 1070521954, 1068149419, 1069547520, 1073741824} // fill-array
            com.google.android.gms.internal.ads.zzfs.zzb = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzfs.zzc = r0
            r0 = 10
            int[] r0 = new int[r0]
            com.google.android.gms.internal.ads.zzfs.zzd = r0
            return
    }

    public static int zza(byte[] r8, int r9, int r10, boolean[] r11) {
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            com.google.android.gms.internal.ads.zzdi.zzf(r3)
            if (r0 != 0) goto Lf
            return r10
        Lf:
            boolean r3 = r11[r1]
            if (r3 == 0) goto L19
            zzh(r11)
            int r9 = r9 + (-3)
            return r9
        L19:
            if (r0 <= r2) goto L2a
            boolean r3 = r11[r2]
            if (r3 == 0) goto L2a
            r3 = r8[r9]
            if (r3 == r2) goto L24
            goto L2a
        L24:
            zzh(r11)
            int r9 = r9 + (-2)
            return r9
        L2a:
            r3 = 2
            if (r0 <= r3) goto L42
            boolean r4 = r11[r3]
            if (r4 == 0) goto L42
            r4 = r8[r9]
            if (r4 != 0) goto L42
            int r4 = r9 + 1
            r4 = r8[r4]
            if (r4 == r2) goto L3c
            goto L42
        L3c:
            zzh(r11)
            int r9 = r9 + (-1)
            return r9
        L42:
            int r4 = r10 + (-1)
            int r9 = r9 + r3
        L45:
            if (r9 >= r4) goto L64
            r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 != 0) goto L61
            int r6 = r9 + (-2)
            r7 = r8[r6]
            if (r7 != 0) goto L60
            int r9 = r9 + (-1)
            r9 = r8[r9]
            if (r9 != 0) goto L60
            if (r5 == r2) goto L5c
            goto L60
        L5c:
            zzh(r11)
            return r6
        L60:
            r9 = r6
        L61:
            int r9 = r9 + 3
            goto L45
        L64:
            if (r0 <= r3) goto L79
            int r9 = r10 + (-3)
            r9 = r8[r9]
            if (r9 != 0) goto L77
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L77
            r9 = r8[r4]
            if (r9 != r2) goto L77
            goto L92
        L77:
            r9 = 0
            goto L93
        L79:
            if (r0 != r3) goto L8a
            boolean r9 = r11[r3]
            if (r9 == 0) goto L77
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L77
            r9 = r8[r4]
            if (r9 != r2) goto L77
            goto L92
        L8a:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L77
            r9 = r8[r4]
            if (r9 != r2) goto L77
        L92:
            r9 = 1
        L93:
            r11[r1] = r9
            if (r0 <= r2) goto La2
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto Lac
            r9 = r8[r4]
            if (r9 != 0) goto Lac
            goto Laa
        La2:
            boolean r9 = r11[r3]
            if (r9 == 0) goto Lac
            r9 = r8[r4]
            if (r9 != 0) goto Lac
        Laa:
            r9 = 1
            goto Lad
        Lac:
            r9 = 0
        Lad:
            r11[r2] = r9
            r8 = r8[r4]
            if (r8 != 0) goto Lb4
            r1 = 1
        Lb4:
            r11[r3] = r1
            return r10
    }

    public static int zzb(byte[] r8, int r9) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfs.zzc
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            r3 = 0
        L6:
            if (r2 < r9) goto L2c
            int r9 = r9 - r3
            r2 = 0
            r4 = 0
            r5 = 0
        Lc:
            if (r2 >= r3) goto L25
            int[] r6 = com.google.android.gms.internal.ads.zzfs.zzd     // Catch: java.lang.Throwable -> L44
            r6 = r6[r2]     // Catch: java.lang.Throwable -> L44
            int r6 = r6 - r4
            java.lang.System.arraycopy(r8, r4, r8, r5, r6)     // Catch: java.lang.Throwable -> L44
            int r5 = r5 + r6
            int r7 = r5 + 1
            r8[r5] = r1     // Catch: java.lang.Throwable -> L44
            int r5 = r7 + 1
            r8[r7] = r1     // Catch: java.lang.Throwable -> L44
            int r6 = r6 + 3
            int r4 = r4 + r6
            int r2 = r2 + 1
            goto Lc
        L25:
            int r1 = r9 - r5
            java.lang.System.arraycopy(r8, r4, r8, r5, r1)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r9
        L2c:
            int r4 = r9 + (-2)
            if (r2 >= r4) goto L46
            r4 = r8[r2]     // Catch: java.lang.Throwable -> L44
            int r5 = r2 + 1
            if (r4 != 0) goto L42
            r4 = r8[r5]     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L42
            int r4 = r2 + 2
            r4 = r8[r4]     // Catch: java.lang.Throwable -> L44
            r6 = 3
            if (r4 != r6) goto L42
            goto L47
        L42:
            r2 = r5
            goto L2c
        L44:
            r8 = move-exception
            goto L5f
        L46:
            r2 = r9
        L47:
            if (r2 >= r9) goto L6
            int[] r4 = com.google.android.gms.internal.ads.zzfs.zzd     // Catch: java.lang.Throwable -> L44
            int r5 = r4.length     // Catch: java.lang.Throwable -> L44
            if (r5 > r3) goto L55
            int r5 = r5 + r5
            int[] r4 = java.util.Arrays.copyOf(r4, r5)     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzfs.zzd = r4     // Catch: java.lang.Throwable -> L44
        L55:
            int[] r4 = com.google.android.gms.internal.ads.zzfs.zzd     // Catch: java.lang.Throwable -> L44
            int r5 = r3 + 1
            r4[r3] = r2     // Catch: java.lang.Throwable -> L44
            int r2 = r2 + 3
            r3 = r5
            goto L6
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r8
    }

    public static com.google.android.gms.internal.ads.zzfm zzc(byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzfp r35) {
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            com.google.android.gms.internal.ads.zzft r4 = new com.google.android.gms.internal.ads.zzft
            r4.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzfg r6 = zzl(r4)
            com.google.android.gms.internal.ads.zzft r4 = new com.google.android.gms.internal.ads.zzft
            r5 = 2
            int r1 = r1 + r5
            r4.<init>(r0, r1, r2)
            r0 = 4
            r4.zzf(r0)
            r1 = 3
            int r2 = r4.zza(r1)
            int r7 = r6.zzb
            r8 = 7
            r9 = 1
            if (r7 == 0) goto L2c
            if (r2 != r8) goto L2c
            r2 = 7
            r7 = 1
            goto L2d
        L2c:
            r7 = 0
        L2d:
            r8 = -1
            if (r3 == 0) goto L50
            com.google.android.gms.internal.ads.zzgax r11 = r3.zza
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L50
            int r11 = r6.zzb
            com.google.android.gms.internal.ads.zzgax r12 = r3.zza
            int r12 = r12.size()
            int r12 = r12 + r8
            com.google.android.gms.internal.ads.zzgax r13 = r3.zza
            int r11 = java.lang.Math.min(r11, r12)
            java.lang.Object r11 = r13.get(r11)
            com.google.android.gms.internal.ads.zzff r11 = (com.google.android.gms.internal.ads.zzff) r11
            int r11 = r11.zza
            goto L51
        L50:
            r11 = 0
        L51:
            r12 = 0
            if (r7 != 0) goto L5c
            r4.zze()
            com.google.android.gms.internal.ads.zzfh r12 = zzm(r4, r9, r2, r12)
            goto L76
        L5c:
            if (r3 == 0) goto L76
            com.google.android.gms.internal.ads.zzfi r13 = r3.zzb
            int[] r14 = r13.zzb
            r14 = r14[r11]
            com.google.android.gms.internal.ads.zzgax r13 = r13.zza
            int r13 = r13.size()
            if (r13 <= r14) goto L76
            com.google.android.gms.internal.ads.zzfi r12 = r3.zzb
            com.google.android.gms.internal.ads.zzgax r12 = r12.zza
            java.lang.Object r12 = r12.get(r14)
            com.google.android.gms.internal.ads.zzfh r12 = (com.google.android.gms.internal.ads.zzfh) r12
        L76:
            int r13 = r4.zzc()
            r14 = 8
            if (r7 == 0) goto Lbe
            boolean r15 = r4.zzh()
            if (r15 == 0) goto L89
            int r15 = r4.zza(r14)
            goto L8a
        L89:
            r15 = -1
        L8a:
            if (r3 == 0) goto Lb8
            com.google.android.gms.internal.ads.zzfk r10 = r3.zzc
            if (r10 == 0) goto Lb8
            if (r15 != r8) goto L96
            int[] r15 = r10.zzb
            r15 = r15[r11]
        L96:
            if (r15 == r8) goto Lb8
            com.google.android.gms.internal.ads.zzgax r10 = r10.zza
            int r10 = r10.size()
            if (r10 <= r15) goto Lb8
            com.google.android.gms.internal.ads.zzfk r10 = r3.zzc
            com.google.android.gms.internal.ads.zzgax r10 = r10.zza
            java.lang.Object r10 = r10.get(r15)
            com.google.android.gms.internal.ads.zzfj r10 = (com.google.android.gms.internal.ads.zzfj) r10
            int r15 = r10.zza
            int r8 = r10.zzd
            int r14 = r10.zze
            int r5 = r10.zzb
            int r10 = r10.zzc
            r9 = r5
            r0 = r8
            r8 = r15
            goto Lfd
        Lb8:
            r0 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r14 = 0
            goto Lfd
        Lbe:
            int r5 = r4.zzc()
            if (r5 != r1) goto Lc9
            r4.zze()
            r8 = 3
            goto Lca
        Lc9:
            r8 = r5
        Lca:
            int r10 = r4.zzc()
            int r14 = r4.zzc()
            boolean r15 = r4.zzh()
            if (r15 == 0) goto Lf1
            int r15 = r4.zzc()
            int r1 = r4.zzc()
            int r0 = r4.zzc()
            int r9 = r4.zzc()
            int r10 = zzk(r10, r8, r15, r1)
            int r0 = zzj(r14, r8, r0, r9)
            r14 = r0
        Lf1:
            int r0 = r4.zzc()
            int r1 = r4.zzc()
            r9 = r0
            r8 = r5
            r0 = r10
            r10 = r1
        Lfd:
            int r1 = r4.zzc()
            if (r7 != 0) goto L125
            boolean r5 = r4.zzh()
            r15 = 1
            if (r15 == r5) goto L10c
            r5 = r2
            goto L10d
        L10c:
            r5 = 0
        L10d:
            r15 = -1
        L10e:
            if (r5 > r2) goto L126
            r4.zzc()
            r20 = r2
            int r2 = r4.zzc()
            int r15 = java.lang.Math.max(r2, r15)
            r4.zzc()
            int r5 = r5 + 1
            r2 = r20
            goto L10e
        L125:
            r15 = -1
        L126:
            r4.zzc()
            r4.zzc()
            r4.zzc()
            r4.zzc()
            r4.zzc()
            r4.zzc()
            boolean r2 = r4.zzh()
            if (r2 == 0) goto L1a1
            r2 = 6
            if (r7 == 0) goto L14b
            boolean r5 = r4.zzh()
            if (r5 == 0) goto L14b
            r4.zzf(r2)
            goto L1a1
        L14b:
            boolean r5 = r4.zzh()
            if (r5 == 0) goto L1a1
            r5 = 0
        L152:
            r7 = 4
            if (r5 >= r7) goto L1a1
            r7 = 0
        L156:
            if (r7 >= r2) goto L197
            boolean r20 = r4.zzh()
            if (r20 != 0) goto L169
            r4.zzc()
            r23 = r0
            r22 = r15
            r0 = 3
            r18 = 4
            goto L18b
        L169:
            r2 = 64
            int r21 = r5 + r5
            r18 = 4
            int r21 = r21 + 4
            r23 = r0
            r22 = r15
            r15 = 1
            int r0 = r15 << r21
            int r0 = java.lang.Math.min(r2, r0)
            if (r5 <= r15) goto L181
            r4.zzb()
        L181:
            r2 = 0
        L182:
            if (r2 >= r0) goto L18a
            r4.zzb()
            int r2 = r2 + 1
            goto L182
        L18a:
            r0 = 3
        L18b:
            if (r5 != r0) goto L18f
            r0 = 3
            goto L190
        L18f:
            r0 = 1
        L190:
            int r7 = r7 + r0
            r15 = r22
            r0 = r23
            r2 = 6
            goto L156
        L197:
            r23 = r0
            r22 = r15
            r18 = 4
            int r5 = r5 + 1
            r2 = 6
            goto L152
        L1a1:
            r23 = r0
            r22 = r15
            r0 = 2
            r4.zzf(r0)
            boolean r0 = r4.zzh()
            if (r0 == 0) goto L1bd
            r0 = 8
            r4.zzf(r0)
            r4.zzc()
            r4.zzc()
            r4.zze()
        L1bd:
            int r0 = r4.zzc()
            r2 = 0
            int[] r5 = new int[r2]
            int[] r7 = new int[r2]
            r18 = r13
            r2 = -1
            r13 = -1
            r15 = 0
        L1cb:
            if (r15 >= r0) goto L300
            if (r15 == 0) goto L2a1
            boolean r20 = r4.zzh()
            if (r20 == 0) goto L2a1
            r20 = r0
            int r0 = r2 + r13
            boolean r21 = r4.zzh()
            int r24 = r4.zzc()
            r19 = 1
            int r24 = r24 + 1
            int r21 = r21 + r21
            int r21 = 1 - r21
            r25 = r10
            int r10 = r0 + 1
            r26 = r9
            boolean[] r9 = new boolean[r10]
            r27 = r8
            r8 = 0
        L1f4:
            if (r8 > r0) goto L20a
            boolean r28 = r4.zzh()
            if (r28 != 0) goto L203
            boolean r28 = r4.zzh()
            r9[r8] = r28
            goto L205
        L203:
            r9[r8] = r19
        L205:
            int r8 = r8 + 1
            r19 = 1
            goto L1f4
        L20a:
            int r8 = r13 + (-1)
            r28 = r8
            int[] r8 = new int[r10]
            int[] r10 = new int[r10]
            r29 = 0
        L214:
            int r30 = r21 * r24
            if (r28 < 0) goto L22d
            r31 = r7[r28]
            int r31 = r31 + r30
            if (r31 >= 0) goto L22a
            int r30 = r2 + r28
            boolean r30 = r9[r30]
            if (r30 == 0) goto L22a
            int r30 = r29 + 1
            r8[r29] = r31
            r29 = r30
        L22a:
            int r28 = r28 + (-1)
            goto L214
        L22d:
            if (r30 >= 0) goto L239
            boolean r21 = r9[r0]
            if (r21 == 0) goto L239
            int r21 = r29 + 1
            r8[r29] = r30
            r29 = r21
        L239:
            r24 = r6
            r21 = r12
            r12 = r29
            r6 = 0
        L240:
            if (r6 >= r2) goto L255
            r28 = r5[r6]
            int r28 = r28 + r30
            if (r28 >= 0) goto L252
            boolean r29 = r9[r6]
            if (r29 == 0) goto L252
            int r29 = r12 + 1
            r8[r12] = r28
            r12 = r29
        L252:
            int r6 = r6 + 1
            goto L240
        L255:
            int[] r6 = java.util.Arrays.copyOf(r8, r12)
            int r8 = r2 + (-1)
            r28 = 0
        L25d:
            if (r8 < 0) goto L272
            r29 = r5[r8]
            int r29 = r29 + r30
            if (r29 <= 0) goto L26f
            boolean r31 = r9[r8]
            if (r31 == 0) goto L26f
            int r31 = r28 + 1
            r10[r28] = r29
            r28 = r31
        L26f:
            int r8 = r8 + (-1)
            goto L25d
        L272:
            if (r30 <= 0) goto L27e
            boolean r0 = r9[r0]
            if (r0 == 0) goto L27e
            int r0 = r28 + 1
            r10[r28] = r30
            r28 = r0
        L27e:
            r0 = r28
            r5 = 0
        L281:
            if (r5 >= r13) goto L298
            r8 = r7[r5]
            int r8 = r8 + r30
            if (r8 <= 0) goto L295
            int r28 = r2 + r5
            boolean r28 = r9[r28]
            if (r28 == 0) goto L295
            int r28 = r0 + 1
            r10[r0] = r8
            r0 = r28
        L295:
            int r5 = r5 + 1
            goto L281
        L298:
            int[] r2 = java.util.Arrays.copyOf(r10, r0)
            r13 = r0
            r7 = r2
            r5 = r6
            r2 = r12
            goto L2f0
        L2a1:
            r20 = r0
            r24 = r6
            r27 = r8
            r26 = r9
            r25 = r10
            r21 = r12
            int r0 = r4.zzc()
            int r2 = r4.zzc()
            int[] r5 = new int[r0]
            r6 = 0
        L2b8:
            if (r6 >= r0) goto L2d1
            if (r6 <= 0) goto L2c1
            int r7 = r6 + (-1)
            r7 = r5[r7]
            goto L2c2
        L2c1:
            r7 = 0
        L2c2:
            int r8 = r4.zzc()
            r9 = 1
            int r8 = r8 + r9
            int r7 = r7 - r8
            r5[r6] = r7
            r4.zze()
            int r6 = r6 + 1
            goto L2b8
        L2d1:
            int[] r6 = new int[r2]
            r7 = 0
        L2d4:
            if (r7 >= r2) goto L2ed
            if (r7 <= 0) goto L2dd
            int r8 = r7 + (-1)
            r8 = r6[r8]
            goto L2de
        L2dd:
            r8 = 0
        L2de:
            int r9 = r4.zzc()
            r10 = 1
            int r9 = r9 + r10
            int r8 = r8 + r9
            r6[r7] = r8
            r4.zze()
            int r7 = r7 + 1
            goto L2d4
        L2ed:
            r13 = r2
            r7 = r6
            r2 = r0
        L2f0:
            int r15 = r15 + 1
            r0 = r20
            r12 = r21
            r6 = r24
            r10 = r25
            r9 = r26
            r8 = r27
            goto L1cb
        L300:
            r24 = r6
            r27 = r8
            r26 = r9
            r25 = r10
            r21 = r12
            boolean r0 = r4.zzh()
            if (r0 == 0) goto L31f
            int r0 = r4.zzc()
            r10 = 0
        L315:
            if (r10 >= r0) goto L31f
            int r2 = r1 + 5
            r4.zzf(r2)
            int r10 = r10 + 1
            goto L315
        L31f:
            r0 = 2
            r4.zzf(r0)
            boolean r1 = r4.zzh()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L3eb
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L36c
            r1 = 8
            int r5 = r4.zza(r1)
            r1 = 255(0xff, float:3.57E-43)
            if (r5 != r1) goto L34d
            r1 = 16
            int r5 = r4.zza(r1)
            int r1 = r4.zza(r1)
            if (r5 == 0) goto L36c
            if (r1 == 0) goto L36c
            float r2 = (float) r5
            float r1 = (float) r1
            float r2 = r2 / r1
            goto L36c
        L34d:
            r1 = 17
            if (r5 >= r1) goto L356
            float[] r1 = com.google.android.gms.internal.ads.zzfs.zzb
            r2 = r1[r5]
            goto L36c
        L356:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "Unexpected aspect_ratio_idc value: "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r1)
        L36c:
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L375
            r4.zze()
        L375:
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L3a7
            r1 = 3
            r4.zzf(r1)
            boolean r1 = r4.zzh()
            r3 = 1
            if (r3 == r1) goto L388
            r5 = 2
            goto L389
        L388:
            r5 = 1
        L389:
            boolean r0 = r4.zzh()
            if (r0 == 0) goto L3a5
            r0 = 8
            int r1 = r4.zza(r0)
            int r3 = r4.zza(r0)
            r4.zzf(r0)
            int r8 = com.google.android.gms.internal.ads.zzo.zza(r1)
            int r0 = com.google.android.gms.internal.ads.zzo.zzb(r3)
            goto L3ce
        L3a5:
            r0 = -1
            goto L3cd
        L3a7:
            if (r3 == 0) goto L3cb
            com.google.android.gms.internal.ads.zzfo r0 = r3.zzd
            if (r0 == 0) goto L3cb
            int[] r1 = r0.zzb
            r1 = r1[r11]
            com.google.android.gms.internal.ads.zzgax r0 = r0.zza
            int r0 = r0.size()
            if (r0 <= r1) goto L3cb
            com.google.android.gms.internal.ads.zzfo r0 = r3.zzd
            com.google.android.gms.internal.ads.zzgax r0 = r0.zza
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzfn r0 = (com.google.android.gms.internal.ads.zzfn) r0
            int r8 = r0.zza
            int r1 = r0.zzb
            int r0 = r0.zzc
            r5 = r1
            goto L3ce
        L3cb:
            r0 = -1
            r5 = -1
        L3cd:
            r8 = -1
        L3ce:
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L3da
            r4.zzc()
            r4.zzc()
        L3da:
            r4.zze()
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L3e4
            int r14 = r14 + r14
        L3e4:
            r17 = r5
            r16 = r8
            r13 = r14
            r14 = r2
            goto L3f3
        L3eb:
            r13 = r14
            r0 = -1
            r14 = 1065353216(0x3f800000, float:1.0)
            r16 = -1
            r17 = -1
        L3f3:
            com.google.android.gms.internal.ads.zzfm r1 = new com.google.android.gms.internal.ads.zzfm
            r5 = r1
            r6 = r24
            r7 = r21
            r8 = r27
            r9 = r26
            r10 = r25
            r11 = r18
            r12 = r23
            r15 = r22
            r18 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
    }

    public static com.google.android.gms.internal.ads.zzfp zzd(byte[] r37, int r38, int r39) {
            java.lang.Class<int> r0 = int.class
            java.lang.Class<boolean> r1 = boolean.class
            com.google.android.gms.internal.ads.zzft r2 = new com.google.android.gms.internal.ads.zzft
            r3 = r37
            r4 = r38
            r5 = r39
            r2.<init>(r3, r4, r5)
            com.google.android.gms.internal.ads.zzfg r4 = zzl(r2)
            r3 = 4
            r2.zzf(r3)
            boolean r5 = r2.zzh()
            boolean r6 = r2.zzh()
            r7 = 6
            int r8 = r2.zza(r7)
            r9 = 1
            int r8 = r8 + r9
            r10 = 3
            int r11 = r2.zza(r10)
            r12 = 17
            r2.zzf(r12)
            r12 = 0
            com.google.android.gms.internal.ads.zzfh r13 = zzm(r2, r9, r11, r12)
            boolean r14 = r2.zzh()
            r15 = 0
            if (r9 == r14) goto L3e
            r14 = r11
            goto L3f
        L3e:
            r14 = 0
        L3f:
            if (r14 > r11) goto L4d
            r2.zzc()
            r2.zzc()
            r2.zzc()
            int r14 = r14 + 1
            goto L3f
        L4d:
            int r14 = r2.zza(r7)
            int r16 = r2.zzc()
            int r12 = r16 + 1
            com.google.android.gms.internal.ads.zzgax r7 = com.google.android.gms.internal.ads.zzgax.zzo(r13)
            com.google.android.gms.internal.ads.zzfi r10 = new com.google.android.gms.internal.ads.zzfi
            int[] r3 = new int[r9]
            r10.<init>(r7, r3)
            r3 = 2
            if (r8 < r3) goto L69
            if (r12 < r3) goto L69
            r7 = 1
            goto L6a
        L69:
            r7 = 0
        L6a:
            if (r5 == 0) goto L70
            if (r6 == 0) goto L70
            r5 = 1
            goto L71
        L70:
            r5 = 0
        L71:
            int r6 = r14 + 1
            if (r7 == 0) goto L831
            if (r5 == 0) goto L831
            if (r6 >= r8) goto L7b
            goto L831
        L7b:
            int[] r5 = new int[r3]
            r5[r9] = r6
            r5[r15] = r12
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r5)
            int[][] r5 = (int[][]) r5
            int[] r7 = new int[r12]
            int[] r3 = new int[r12]
            r17 = r5[r15]
            r17[r15] = r15
            r7[r15] = r9
            r3[r15] = r15
        L93:
            if (r9 >= r12) goto Lb2
            r18 = 0
        L97:
            if (r15 > r14) goto Lae
            boolean r19 = r2.zzh()
            if (r19 == 0) goto La9
            r19 = r5[r9]
            int r20 = r18 + 1
            r19[r18] = r15
            r3[r9] = r15
            r18 = r20
        La9:
            r7[r9] = r18
            int r15 = r15 + 1
            goto L97
        Lae:
            int r9 = r9 + 1
            r15 = 0
            goto L93
        Lb2:
            boolean r9 = r2.zzh()
            if (r9 == 0) goto L179
            r9 = 64
            r2.zzf(r9)
            boolean r9 = r2.zzh()
            if (r9 == 0) goto Lc6
            r2.zzc()
        Lc6:
            int r9 = r2.zzc()
            r15 = 0
        Lcb:
            if (r15 >= r9) goto L179
            r2.zzc()
            if (r15 == 0) goto Ldc
            boolean r19 = r2.zzh()
            if (r19 == 0) goto Ld9
            goto Ldc
        Ld9:
            r19 = 0
            goto Lde
        Ldc:
            r19 = 1
        Lde:
            if (r19 == 0) goto L10e
            boolean r19 = r2.zzh()
            boolean r20 = r2.zzh()
            if (r19 != 0) goto Lf0
            if (r20 == 0) goto Led
            goto Lf0
        Led:
            r22 = r9
            goto L114
        Lf0:
            boolean r21 = r2.zzh()
            r22 = r9
            if (r21 == 0) goto Lfd
            r9 = 19
            r2.zzf(r9)
        Lfd:
            r9 = 8
            r2.zzf(r9)
            if (r21 == 0) goto L108
            r9 = 4
            r2.zzf(r9)
        L108:
            r9 = 15
            r2.zzf(r9)
            goto L116
        L10e:
            r22 = r9
            r19 = 0
            r20 = 0
        L114:
            r21 = 0
        L116:
            r9 = 0
        L117:
            if (r9 > r11) goto L16d
            boolean r23 = r2.zzh()
            if (r23 != 0) goto L132
            boolean r23 = r2.zzh()
            if (r23 == 0) goto L126
            goto L132
        L126:
            boolean r23 = r2.zzh()
            if (r23 == 0) goto L135
            r24 = r3
            r23 = r5
            r3 = 0
            goto L13f
        L132:
            r2.zzc()
        L135:
            int r23 = r2.zzc()
            r24 = r3
            r3 = r23
            r23 = r5
        L13f:
            int r5 = r19 + r20
            r25 = r7
            r7 = 0
        L144:
            if (r7 >= r5) goto L164
            r26 = r5
            r5 = 0
        L149:
            if (r5 > r3) goto L15f
            r2.zzc()
            r2.zzc()
            if (r21 == 0) goto L159
            r2.zzc()
            r2.zzc()
        L159:
            r2.zze()
            int r5 = r5 + 1
            goto L149
        L15f:
            int r7 = r7 + 1
            r5 = r26
            goto L144
        L164:
            int r9 = r9 + 1
            r5 = r23
            r3 = r24
            r7 = r25
            goto L117
        L16d:
            r24 = r3
            r23 = r5
            r25 = r7
            int r15 = r15 + 1
            r9 = r22
            goto Lcb
        L179:
            r24 = r3
            r23 = r5
            r25 = r7
            boolean r3 = r2.zzh()
            if (r3 != 0) goto L191
            com.google.android.gms.internal.ads.zzfp r0 = new com.google.android.gms.internal.ads.zzfp
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r6 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            goto L842
        L191:
            r2.zzd()
            r3 = 0
            com.google.android.gms.internal.ads.zzfh r5 = zzm(r2, r3, r11, r13)
            boolean r3 = r2.zzh()
            r7 = 16
            boolean[] r9 = new boolean[r7]
            r19 = r5
            r5 = 0
            r15 = 0
        L1a5:
            if (r15 >= r7) goto L1b4
            boolean r20 = r2.zzh()
            r9[r15] = r20
            if (r20 == 0) goto L1b1
            int r5 = r5 + 1
        L1b1:
            int r15 = r15 + 1
            goto L1a5
        L1b4:
            if (r5 == 0) goto L81f
            r15 = 1
            boolean r20 = r9[r15]
            if (r20 != 0) goto L1bd
            goto L81f
        L1bd:
            int r15 = r5 + 1
            int[] r7 = new int[r5]
            r22 = r11
            r21 = r13
            r13 = 0
        L1c6:
            int r11 = r5 - r3
            if (r13 >= r11) goto L1d4
            r11 = 3
            int r26 = r2.zza(r11)
            r7[r13] = r26
            int r13 = r13 + 1
            goto L1c6
        L1d4:
            int[] r11 = new int[r15]
            if (r3 == 0) goto L1f3
            r13 = 1
        L1d9:
            if (r13 >= r5) goto L1f0
            r15 = 0
        L1dc:
            if (r15 >= r13) goto L1ed
            r26 = r11[r13]
            r27 = r7[r15]
            r17 = 1
            int r27 = r27 + 1
            int r26 = r26 + r27
            r11[r13] = r26
            int r15 = r15 + 1
            goto L1dc
        L1ed:
            int r13 = r13 + 1
            goto L1d9
        L1f0:
            r13 = 6
            r11[r5] = r13
        L1f3:
            r13 = 2
            int[] r15 = new int[r13]
            r13 = 1
            r15[r13] = r5
            r13 = 0
            r15[r13] = r8
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r15)
            int[][] r0 = (int[][]) r0
            int[] r15 = new int[r8]
            r15[r13] = r13
            boolean r13 = r2.zzh()
            r27 = r1
            r26 = r12
            r12 = 1
        L20f:
            if (r12 >= r8) goto L260
            if (r13 == 0) goto L21b
            r1 = 6
            int r29 = r2.zza(r1)
            r15[r12] = r29
            goto L21e
        L21b:
            r1 = 6
            r15[r12] = r12
        L21e:
            if (r3 != 0) goto L23b
            r1 = 0
        L221:
            if (r1 >= r5) goto L238
            r28 = r0[r12]
            r29 = r7[r1]
            r30 = r3
            r17 = 1
            int r3 = r29 + 1
            int r3 = r2.zza(r3)
            r28[r1] = r3
            int r1 = r1 + 1
            r3 = r30
            goto L221
        L238:
            r30 = r3
            goto L25b
        L23b:
            r30 = r3
            r1 = 0
        L23e:
            if (r1 >= r5) goto L25b
            r3 = r0[r12]
            r29 = r15[r12]
            int r31 = r1 + 1
            r32 = r11[r31]
            r17 = 1
            int r32 = r17 << r32
            r28 = -1
            int r32 = r32 + (-1)
            r29 = r29 & r32
            r32 = r11[r1]
            int r29 = r29 >> r32
            r3[r1] = r29
            r1 = r31
            goto L23e
        L25b:
            int r12 = r12 + 1
            r3 = r30
            goto L20f
        L260:
            int[] r1 = new int[r6]
            r3 = 1
            r5 = 0
        L264:
            if (r5 >= r8) goto L2a5
            r7 = r15[r5]
            r11 = -1
            r1[r7] = r11
            r7 = 0
            r11 = 0
        L26d:
            r12 = 16
            if (r7 >= r12) goto L28d
            boolean r12 = r9[r7]
            if (r12 == 0) goto L28a
            r12 = 1
            if (r7 != r12) goto L283
            r7 = r15[r5]
            r13 = r0[r5]
            r13 = r13[r11]
            r1[r7] = r13
            r17 = 1
            goto L285
        L283:
            r17 = r7
        L285:
            int r11 = r11 + 1
            r7 = r17
            goto L28b
        L28a:
            r12 = 1
        L28b:
            int r7 = r7 + r12
            goto L26d
        L28d:
            if (r5 <= 0) goto L2a2
            r7 = 0
        L290:
            if (r7 >= r5) goto L2a0
            r11 = r15[r5]
            r11 = r1[r11]
            r12 = r15[r7]
            r12 = r1[r12]
            if (r11 != r12) goto L29d
            goto L2a2
        L29d:
            int r7 = r7 + 1
            goto L290
        L2a0:
            int r3 = r3 + 1
        L2a2:
            int r5 = r5 + 1
            goto L264
        L2a5:
            r5 = 4
            int r0 = r2.zza(r5)
            r5 = 2
            if (r3 < r5) goto L80d
            if (r0 != 0) goto L2b1
            goto L80d
        L2b1:
            int[] r5 = new int[r3]
            r7 = 0
        L2b4:
            if (r7 >= r3) goto L2bf
            int r9 = r2.zza(r0)
            r5[r7] = r9
            int r7 = r7 + 1
            goto L2b4
        L2bf:
            int[] r0 = new int[r6]
            r7 = 0
        L2c2:
            if (r7 >= r8) goto L2cf
            r9 = r15[r7]
            int r9 = java.lang.Math.min(r9, r14)
            r0[r9] = r7
            int r7 = r7 + 1
            goto L2c2
        L2cf:
            com.google.android.gms.internal.ads.zzgau r7 = new com.google.android.gms.internal.ads.zzgau
            r7.<init>()
            r9 = 0
        L2d5:
            if (r9 > r14) goto L2f3
            r11 = r1[r9]
            r12 = -1
            int r13 = r3 + (-1)
            int r11 = java.lang.Math.min(r11, r13)
            if (r11 < 0) goto L2e5
            r11 = r5[r11]
            goto L2e6
        L2e5:
            r11 = -1
        L2e6:
            com.google.android.gms.internal.ads.zzff r12 = new com.google.android.gms.internal.ads.zzff
            r13 = r0[r9]
            r12.<init>(r13, r11)
            r7.zzf(r12)
            int r9 = r9 + 1
            goto L2d5
        L2f3:
            com.google.android.gms.internal.ads.zzgax r5 = r7.zzi()
            r0 = 0
            java.lang.Object r1 = r5.get(r0)
            com.google.android.gms.internal.ads.zzff r1 = (com.google.android.gms.internal.ads.zzff) r1
            int r0 = r1.zzb
            r1 = -1
            if (r0 != r1) goto L30f
            com.google.android.gms.internal.ads.zzfp r0 = new com.google.android.gms.internal.ads.zzfp
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r6 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            goto L842
        L30f:
            r0 = 1
        L310:
            if (r0 > r14) goto L321
            java.lang.Object r1 = r5.get(r0)
            com.google.android.gms.internal.ads.zzff r1 = (com.google.android.gms.internal.ads.zzff) r1
            int r1 = r1.zzb
            r3 = -1
            if (r1 == r3) goto L31e
            goto L323
        L31e:
            int r0 = r0 + 1
            goto L310
        L321:
            r3 = -1
            r0 = -1
        L323:
            if (r0 != r3) goto L331
            com.google.android.gms.internal.ads.zzfp r0 = new com.google.android.gms.internal.ads.zzfp
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r6 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            goto L842
        L331:
            r1 = 2
            int[] r3 = new int[r1]
            r7 = 1
            r3[r7] = r8
            r9 = 0
            r3[r9] = r8
            r11 = r27
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r11, r3)
            boolean[][] r3 = (boolean[][]) r3
            int[] r12 = new int[r1]
            r12[r7] = r8
            r12[r9] = r8
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r11, r12)
            boolean[][] r1 = (boolean[][]) r1
            r7 = 1
        L34f:
            if (r7 >= r8) goto L366
            r9 = 0
        L352:
            if (r9 >= r7) goto L363
            r12 = r3[r7]
            r13 = r1[r7]
            boolean r14 = r2.zzh()
            r13[r9] = r14
            r12[r9] = r14
            int r9 = r9 + 1
            goto L352
        L363:
            int r7 = r7 + 1
            goto L34f
        L366:
            r7 = 1
        L367:
            if (r7 >= r8) goto L38b
            int r9 = r8 + (-1)
            r12 = 0
        L36c:
            if (r12 >= r9) goto L388
            r13 = 0
        L36f:
            if (r13 >= r7) goto L385
            r14 = r1[r7]
            boolean r27 = r14[r13]
            if (r27 == 0) goto L382
            r27 = r1[r13]
            boolean r27 = r27[r12]
            if (r27 == 0) goto L382
            r17 = 1
            r14[r12] = r17
            goto L385
        L382:
            int r13 = r13 + 1
            goto L36f
        L385:
            int r12 = r12 + 1
            goto L36c
        L388:
            int r7 = r7 + 1
            goto L367
        L38b:
            int[] r7 = new int[r6]
            r9 = 0
        L38e:
            if (r9 >= r8) goto L3a3
            r12 = 0
            r13 = 0
        L392:
            if (r12 >= r9) goto L39c
            r14 = r3[r9]
            boolean r14 = r14[r12]
            int r13 = r13 + r14
            int r12 = r12 + 1
            goto L392
        L39c:
            r12 = r15[r9]
            r7[r12] = r13
            int r9 = r9 + 1
            goto L38e
        L3a3:
            r9 = 0
            r12 = 0
        L3a5:
            if (r9 >= r8) goto L3b2
            r13 = r15[r9]
            r13 = r7[r13]
            if (r13 != 0) goto L3af
            int r12 = r12 + 1
        L3af:
            int r9 = r9 + 1
            goto L3a5
        L3b2:
            r9 = 1
            if (r12 <= r9) goto L3c1
            com.google.android.gms.internal.ads.zzfp r0 = new com.google.android.gms.internal.ads.zzfp
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r6 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            goto L842
        L3c1:
            int[] r9 = new int[r8]
            r12 = r26
            int[] r13 = new int[r12]
            boolean r14 = r2.zzh()
            if (r14 == 0) goto L3e3
            r14 = 0
        L3ce:
            if (r14 >= r8) goto L3de
            r26 = r15
            r15 = 3
            int r27 = r2.zza(r15)
            r9[r14] = r27
            int r14 = r14 + 1
            r15 = r26
            goto L3ce
        L3de:
            r26 = r15
            r14 = r22
            goto L3eb
        L3e3:
            r26 = r15
            r14 = r22
            r15 = 0
            java.util.Arrays.fill(r9, r15, r8, r14)
        L3eb:
            r15 = 0
        L3ec:
            if (r15 >= r12) goto L41c
            r27 = r0
            r38 = r1
            r22 = r7
            r1 = 0
            r7 = 0
        L3f6:
            r0 = r25[r15]
            if (r7 >= r0) goto L40f
            r0 = r23[r15]
            r0 = r0[r7]
            java.lang.Object r0 = r5.get(r0)
            com.google.android.gms.internal.ads.zzff r0 = (com.google.android.gms.internal.ads.zzff) r0
            int r0 = r0.zza
            r0 = r9[r0]
            int r1 = java.lang.Math.max(r1, r0)
            int r7 = r7 + 1
            goto L3f6
        L40f:
            int r1 = r1 + 1
            r13[r15] = r1
            int r15 = r15 + 1
            r1 = r38
            r7 = r22
            r0 = r27
            goto L3ec
        L41c:
            r27 = r0
            r38 = r1
            r22 = r7
            boolean r0 = r2.zzh()
            if (r0 == 0) goto L441
            r0 = 0
        L429:
            int r1 = r8 + (-1)
            if (r0 >= r1) goto L441
            int r1 = r0 + 1
            r7 = r1
        L430:
            if (r7 >= r8) goto L43f
            r9 = r3[r7]
            boolean r9 = r9[r0]
            if (r9 == 0) goto L43c
            r9 = 3
            r2.zzf(r9)
        L43c:
            int r7 = r7 + 1
            goto L430
        L43f:
            r0 = r1
            goto L429
        L441:
            r2.zze()
            int r0 = r2.zzc()
            r1 = 1
            int r0 = r0 + r1
            com.google.android.gms.internal.ads.zzgau r7 = new com.google.android.gms.internal.ads.zzgau
            r7.<init>()
            r9 = r21
            r7.zzf(r9)
            if (r0 <= r1) goto L46c
            r1 = r19
            r7.zzf(r1)
            r9 = 2
        L45c:
            if (r9 >= r0) goto L46c
            boolean r15 = r2.zzh()
            com.google.android.gms.internal.ads.zzfh r1 = zzm(r2, r15, r14, r1)
            r7.zzf(r1)
            int r9 = r9 + 1
            goto L45c
        L46c:
            com.google.android.gms.internal.ads.zzgax r1 = r7.zzi()
            int r7 = r2.zzc()
            int r7 = r7 + r12
            if (r7 <= r12) goto L483
            com.google.android.gms.internal.ads.zzfp r0 = new com.google.android.gms.internal.ads.zzfp
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r6 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            goto L842
        L483:
            r9 = 2
            int r14 = r2.zza(r9)
            int[] r15 = new int[r9]
            r9 = 1
            r15[r9] = r6
            r9 = 0
            r15[r9] = r7
            java.lang.Object r15 = java.lang.reflect.Array.newInstance(r11, r15)
            boolean[][] r15 = (boolean[][]) r15
            int[] r9 = new int[r7]
            r19 = r1
            int[] r1 = new int[r7]
            r21 = r3
            r3 = 0
        L49f:
            if (r3 >= r12) goto L4f7
            r29 = r12
            r12 = 0
            r9[r3] = r12
            r12 = r24[r3]
            r1[r3] = r12
            if (r14 != 0) goto L4c2
            r12 = r15[r3]
            r30 = r13
            r13 = r25[r3]
            r31 = r8
            r32 = r10
            r8 = 0
            r10 = 1
            java.util.Arrays.fill(r12, r8, r13, r10)
            r8 = r25[r3]
            r9[r3] = r8
            r8 = 1
        L4c0:
            r10 = 0
            goto L4ec
        L4c2:
            r31 = r8
            r32 = r10
            r30 = r13
            r10 = 1
            if (r14 != r10) goto L4e4
            r8 = 0
        L4cc:
            r10 = r25[r3]
            if (r8 >= r10) goto L4e0
            r10 = r15[r3]
            r13 = r23[r3]
            r13 = r13[r8]
            if (r13 != r12) goto L4da
            r13 = 1
            goto L4db
        L4da:
            r13 = 0
        L4db:
            r10[r8] = r13
            int r8 = r8 + 1
            goto L4cc
        L4e0:
            r8 = 1
            r9[r3] = r8
            goto L4c0
        L4e4:
            r8 = 1
            r10 = 0
            r12 = r15[r10]
            r12[r10] = r8
            r9[r10] = r8
        L4ec:
            int r3 = r3 + 1
            r12 = r29
            r13 = r30
            r8 = r31
            r10 = r32
            goto L49f
        L4f7:
            r31 = r8
            r32 = r10
            r29 = r12
            r30 = r13
            r8 = 1
            r10 = 0
            int[] r3 = new int[r6]
            r12 = 2
            int[] r13 = new int[r12]
            r13[r8] = r6
            r13[r10] = r7
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r11, r13)
            boolean[][] r6 = (boolean[][]) r6
            r8 = 0
            r10 = 1
        L512:
            if (r10 >= r7) goto L5fe
            if (r14 != r12) goto L53a
            r11 = 0
        L517:
            r12 = r25[r10]
            if (r11 >= r12) goto L53a
            r12 = r15[r10]
            boolean r13 = r2.zzh()
            r12[r11] = r13
            r12 = r9[r10]
            r13 = r15[r10]
            boolean r24 = r13[r11]
            int r12 = r12 + r24
            r9[r10] = r12
            boolean r12 = r13[r11]
            if (r12 == 0) goto L537
            r12 = r23[r10]
            r12 = r12[r11]
            r1[r10] = r12
        L537:
            int r11 = r11 + 1
            goto L517
        L53a:
            if (r8 != 0) goto L568
            r8 = r23[r10]
            r11 = 0
            r8 = r8[r11]
            if (r8 != 0) goto L564
            r8 = r15[r10]
            boolean r8 = r8[r11]
            if (r8 == 0) goto L564
            r8 = 0
            r12 = 1
        L54b:
            r13 = r25[r10]
            if (r12 >= r13) goto L568
            r13 = r23[r10]
            r13 = r13[r12]
            r11 = r27
            if (r13 != r11) goto L55e
            r13 = r15[r10]
            boolean r13 = r13[r11]
            if (r13 == 0) goto L55e
            r8 = r10
        L55e:
            int r12 = r12 + 1
            r27 = r11
            r11 = 0
            goto L54b
        L564:
            r11 = r27
            r8 = 0
            goto L56a
        L568:
            r11 = r27
        L56a:
            r12 = 0
        L56b:
            r13 = r25[r10]
            if (r12 >= r13) goto L5df
            r13 = 1
            if (r0 <= r13) goto L5d0
            r13 = r6[r10]
            r24 = r15[r10]
            boolean r24 = r24[r12]
            r13[r12] = r24
            r24 = r14
            double r13 = (double) r0
            r27 = r0
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = com.google.android.gms.internal.ads.zzgdk.zza(r13, r0)
            r13 = r6[r10]
            boolean r13 = r13[r12]
            if (r13 != 0) goto L5b9
            r13 = r23[r10]
            r13 = r13[r12]
            java.lang.Object r13 = r5.get(r13)
            com.google.android.gms.internal.ads.zzff r13 = (com.google.android.gms.internal.ads.zzff) r13
            int r13 = r13.zza
            r14 = 0
        L598:
            if (r14 >= r12) goto L5b9
            r33 = r23[r10]
            r34 = r11
            r11 = r33[r14]
            java.lang.Object r11 = r5.get(r11)
            com.google.android.gms.internal.ads.zzff r11 = (com.google.android.gms.internal.ads.zzff) r11
            int r11 = r11.zza
            r33 = r38[r13]
            boolean r11 = r33[r11]
            if (r11 == 0) goto L5b4
            r11 = r6[r10]
            r13 = 1
            r11[r12] = r13
            goto L5bb
        L5b4:
            int r14 = r14 + 1
            r11 = r34
            goto L598
        L5b9:
            r34 = r11
        L5bb:
            r11 = r6[r10]
            boolean r11 = r11[r12]
            if (r11 == 0) goto L5d6
            if (r8 <= 0) goto L5cc
            if (r10 != r8) goto L5cc
            int r0 = r2.zza(r0)
            r3[r12] = r0
            goto L5d6
        L5cc:
            r2.zzf(r0)
            goto L5d6
        L5d0:
            r27 = r0
            r34 = r11
            r24 = r14
        L5d6:
            int r12 = r12 + 1
            r14 = r24
            r0 = r27
            r11 = r34
            goto L56b
        L5df:
            r27 = r0
            r34 = r11
            r24 = r14
            r0 = r9[r10]
            r11 = 1
            if (r0 != r11) goto L5f3
            r0 = r1[r10]
            r0 = r22[r0]
            if (r0 <= 0) goto L5f3
            r2.zze()
        L5f3:
            int r10 = r10 + 1
            r14 = r24
            r0 = r27
            r27 = r34
            r12 = 2
            goto L512
        L5fe:
            if (r8 != 0) goto L60d
            com.google.android.gms.internal.ads.zzfp r0 = new com.google.android.gms.internal.ads.zzfp
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r6 = r32
            r3.<init>(r4, r5, r6, r7, r8)
            goto L842
        L60d:
            int r0 = r2.zzc()
            r1 = 1
            int r0 = r0 + r1
            com.google.android.gms.internal.ads.zzgau r1 = com.google.android.gms.internal.ads.zzgax.zzi(r0)
            r8 = r31
            int[] r9 = new int[r8]
            r10 = 0
        L61c:
            if (r10 >= r0) goto L68a
            r11 = 16
            int r12 = r2.zza(r11)
            int r13 = r2.zza(r11)
            boolean r14 = r2.zzh()
            if (r14 == 0) goto L647
            r14 = 2
            int r15 = r2.zza(r14)
            r14 = 3
            if (r15 != r14) goto L639
            r2.zze()
        L639:
            r14 = 4
            int r20 = r2.zza(r14)
            int r23 = r2.zza(r14)
            r33 = r20
            r34 = r23
            goto L64c
        L647:
            r15 = 0
            r33 = 0
            r34 = 0
        L64c:
            boolean r14 = r2.zzh()
            if (r14 == 0) goto L66f
            int r14 = r2.zzc()
            int r11 = r2.zzc()
            r38 = r5
            int r5 = r2.zzc()
            r23 = r4
            int r4 = r2.zzc()
            int r12 = zzk(r12, r15, r14, r11)
            int r13 = zzj(r13, r15, r5, r4)
            goto L673
        L66f:
            r23 = r4
            r38 = r5
        L673:
            r35 = r12
            r36 = r13
            com.google.android.gms.internal.ads.zzfj r4 = new com.google.android.gms.internal.ads.zzfj
            r31 = r4
            r32 = r15
            r31.<init>(r32, r33, r34, r35, r36)
            r1.zzf(r4)
            int r10 = r10 + 1
            r5 = r38
            r4 = r23
            goto L61c
        L68a:
            r23 = r4
            r38 = r5
            r4 = 1
            if (r0 <= r4) goto L6aa
            boolean r4 = r2.zzh()
            if (r4 == 0) goto L6aa
            double r4 = (double) r0
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = com.google.android.gms.internal.ads.zzgdk.zza(r4, r0)
            r4 = 1
        L69f:
            if (r4 >= r8) goto L6b9
            int r5 = r2.zza(r0)
            r9[r4] = r5
            int r4 = r4 + 1
            goto L69f
        L6aa:
            r4 = 1
        L6ab:
            if (r4 >= r8) goto L6b9
            r5 = -1
            int r10 = r0 + (-1)
            int r10 = java.lang.Math.min(r4, r10)
            r9[r4] = r10
            int r4 = r4 + 1
            goto L6ab
        L6b9:
            com.google.android.gms.internal.ads.zzfk r0 = new com.google.android.gms.internal.ads.zzfk
            com.google.android.gms.internal.ads.zzgax r1 = r1.zzi()
            r0.<init>(r1, r9)
            r1 = 2
            r2.zzf(r1)
            r1 = 1
        L6c7:
            if (r1 >= r8) goto L6d5
            r4 = r26[r1]
            r4 = r22[r4]
            if (r4 != 0) goto L6d2
            r2.zze()
        L6d2:
            int r1 = r1 + 1
            goto L6c7
        L6d5:
            r1 = 1
        L6d6:
            if (r1 >= r7) goto L70e
            boolean r4 = r2.zzh()
            r5 = 0
        L6dd:
            r9 = r30[r1]
            if (r5 >= r9) goto L70b
            if (r5 <= 0) goto L6ea
            if (r4 == 0) goto L6ea
            boolean r9 = r2.zzh()
            goto L6ef
        L6ea:
            if (r5 != 0) goto L6ee
            r9 = 1
            goto L6ef
        L6ee:
            r9 = 0
        L6ef:
            if (r9 == 0) goto L708
            r9 = 0
        L6f2:
            r10 = r25[r1]
            if (r9 >= r10) goto L702
            r10 = r6[r1]
            boolean r10 = r10[r9]
            if (r10 == 0) goto L6ff
            r2.zzc()
        L6ff:
            int r9 = r9 + 1
            goto L6f2
        L702:
            r2.zzc()
            r2.zzc()
        L708:
            int r5 = r5 + 1
            goto L6dd
        L70b:
            int r1 = r1 + 1
            goto L6d6
        L70e:
            int r1 = r2.zzc()
            r15 = 2
            int r1 = r1 + r15
            boolean r4 = r2.zzh()
            if (r4 == 0) goto L71e
            r2.zzf(r1)
            goto L733
        L71e:
            r4 = 1
        L71f:
            if (r4 >= r8) goto L733
            r5 = 0
        L722:
            if (r5 >= r4) goto L730
            r6 = r21[r4]
            boolean r6 = r6[r5]
            if (r6 == 0) goto L72d
            r2.zzf(r1)
        L72d:
            int r5 = r5 + 1
            goto L722
        L730:
            int r4 = r4 + 1
            goto L71f
        L733:
            int r1 = r2.zzc()
            r4 = 1
        L738:
            if (r4 > r1) goto L742
            r5 = 8
            r2.zzf(r5)
            int r4 = r4 + 1
            goto L738
        L742:
            boolean r1 = r2.zzh()
            if (r1 == 0) goto L7f8
            r2.zzd()
            boolean r1 = r2.zzh()
            if (r1 != 0) goto L757
            boolean r1 = r2.zzh()
            if (r1 == 0) goto L75a
        L757:
            r2.zze()
        L75a:
            boolean r1 = r2.zzh()
            boolean r4 = r2.zzh()
            if (r1 != 0) goto L766
            if (r4 == 0) goto L794
        L766:
            r6 = r29
            r5 = 0
        L769:
            if (r5 >= r6) goto L794
            r7 = 0
        L76c:
            r9 = r30[r5]
            if (r7 >= r9) goto L791
            if (r1 == 0) goto L777
            boolean r9 = r2.zzh()
            goto L778
        L777:
            r9 = 0
        L778:
            if (r4 == 0) goto L77f
            boolean r10 = r2.zzh()
            goto L780
        L77f:
            r10 = 0
        L780:
            if (r9 == 0) goto L787
            r9 = 32
            r2.zzf(r9)
        L787:
            if (r10 == 0) goto L78e
            r9 = 18
            r2.zzf(r9)
        L78e:
            int r7 = r7 + 1
            goto L76c
        L791:
            int r5 = r5 + 1
            goto L769
        L794:
            boolean r1 = r2.zzh()
            if (r1 == 0) goto L7a2
            r4 = 4
            int r5 = r2.zza(r4)
            r4 = 1
            int r5 = r5 + r4
            goto L7a4
        L7a2:
            r4 = 1
            r5 = r8
        L7a4:
            com.google.android.gms.internal.ads.zzgau r6 = com.google.android.gms.internal.ads.zzgax.zzi(r5)
            int[] r7 = new int[r8]
            r9 = 0
        L7ab:
            if (r9 >= r5) goto L7db
            r10 = 3
            r2.zzf(r10)
            boolean r11 = r2.zzh()
            if (r4 == r11) goto L7b9
            r4 = 2
            goto L7ba
        L7b9:
            r4 = 1
        L7ba:
            r11 = 8
            int r12 = r2.zza(r11)
            int r12 = com.google.android.gms.internal.ads.zzo.zza(r12)
            int r13 = r2.zza(r11)
            int r13 = com.google.android.gms.internal.ads.zzo.zzb(r13)
            r2.zzf(r11)
            com.google.android.gms.internal.ads.zzfn r14 = new com.google.android.gms.internal.ads.zzfn
            r14.<init>(r12, r4, r13)
            r6.zzf(r14)
            int r9 = r9 + 1
            r4 = 1
            goto L7ab
        L7db:
            if (r1 == 0) goto L7ed
            r1 = 1
            if (r5 <= r1) goto L7ed
            r15 = 0
        L7e1:
            if (r15 >= r8) goto L7ed
            r1 = 4
            int r4 = r2.zza(r1)
            r7[r15] = r4
            int r15 = r15 + 1
            goto L7e1
        L7ed:
            com.google.android.gms.internal.ads.zzfo r1 = new com.google.android.gms.internal.ads.zzfo
            com.google.android.gms.internal.ads.zzgax r2 = r6.zzi()
            r1.<init>(r2, r7)
            r8 = r1
            goto L7f9
        L7f8:
            r8 = 0
        L7f9:
            com.google.android.gms.internal.ads.zzfp r1 = new com.google.android.gms.internal.ads.zzfp
            com.google.android.gms.internal.ads.zzfi r6 = new com.google.android.gms.internal.ads.zzfi
            r2 = r19
            r6.<init>(r2, r3)
            r3 = r1
            r4 = r23
            r5 = r38
            r7 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = r1
            goto L842
        L80d:
            r23 = r4
            r32 = r10
            com.google.android.gms.internal.ads.zzfp r0 = new com.google.android.gms.internal.ads.zzfp
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r4 = r23
            r6 = r32
            r3.<init>(r4, r5, r6, r7, r8)
            goto L842
        L81f:
            r23 = r4
            r32 = r10
            com.google.android.gms.internal.ads.zzfp r0 = new com.google.android.gms.internal.ads.zzfp
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r4 = r23
            r6 = r32
            r3.<init>(r4, r5, r6, r7, r8)
            goto L842
        L831:
            r23 = r4
            r32 = r10
            com.google.android.gms.internal.ads.zzfp r0 = new com.google.android.gms.internal.ads.zzfp
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r4 = r23
            r6 = r32
            r3.<init>(r4, r5, r6, r7, r8)
        L842:
            return r0
    }

    public static com.google.android.gms.internal.ads.zzfq zze(byte[] r1, int r2, int r3) {
            com.google.android.gms.internal.ads.zzft r2 = new com.google.android.gms.internal.ads.zzft
            r0 = 4
            r2.<init>(r1, r0, r3)
            int r1 = r2.zzc()
            int r3 = r2.zzc()
            r2.zze()
            boolean r2 = r2.zzh()
            com.google.android.gms.internal.ads.zzfq r0 = new com.google.android.gms.internal.ads.zzfq
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzfr zzf(byte[] r32, int r33, int r34) {
            com.google.android.gms.internal.ads.zzft r0 = new com.google.android.gms.internal.ads.zzft
            r1 = r32
            r2 = r33
            r3 = r34
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r2 = r0.zza(r1)
            int r5 = r0.zza(r1)
            int r6 = r0.zza(r1)
            int r7 = r0.zzc()
            r3 = 138(0x8a, float:1.93E-43)
            r4 = 86
            r8 = 44
            r9 = 122(0x7a, float:1.71E-43)
            r10 = 110(0x6e, float:1.54E-43)
            r11 = 100
            r12 = 244(0xf4, float:3.42E-43)
            r13 = 3
            r15 = 1
            if (r2 == r11) goto L51
            if (r2 == r10) goto L51
            if (r2 == r9) goto L51
            if (r2 == r12) goto L51
            if (r2 == r8) goto L51
            r1 = 83
            if (r2 == r1) goto L51
            if (r2 == r4) goto L51
            r1 = 118(0x76, float:1.65E-43)
            if (r2 == r1) goto L51
            r1 = 128(0x80, float:1.794E-43)
            if (r2 == r1) goto L51
            if (r2 != r3) goto L4a
            r2 = 138(0x8a, float:1.93E-43)
            goto L51
        L4a:
            r1 = 1
            r12 = 0
            r16 = 0
            r17 = 0
            goto Lb3
        L51:
            int r1 = r0.zzc()
            if (r1 != r13) goto L5d
            boolean r3 = r0.zzh()
            r12 = 3
            goto L5f
        L5d:
            r12 = r1
            r3 = 0
        L5f:
            int r16 = r0.zzc()
            int r17 = r0.zzc()
            r0.zze()
            boolean r18 = r0.zzh()
            if (r18 == 0) goto Laf
            if (r12 == r13) goto L75
            r12 = 8
            goto L77
        L75:
            r12 = 12
        L77:
            r9 = 0
        L78:
            if (r9 >= r12) goto Laf
            boolean r19 = r0.zzh()
            if (r19 == 0) goto La6
            r10 = 6
            if (r9 >= r10) goto L86
            r10 = 16
            goto L88
        L86:
            r10 = 64
        L88:
            r11 = 0
            r20 = 8
            r21 = 8
        L8d:
            if (r11 >= r10) goto La6
            if (r20 == 0) goto L9d
            int r20 = r0.zzb()
            int r4 = r21 + r20
            int r4 = r4 + 256
            int r4 = r4 % 256
            r20 = r4
        L9d:
            if (r20 == 0) goto La1
            r21 = r20
        La1:
            int r11 = r11 + 1
            r4 = 86
            goto L8d
        La6:
            int r9 = r9 + 1
            r4 = 86
            r10 = 110(0x6e, float:1.54E-43)
            r11 = 100
            goto L78
        Laf:
            r12 = r16
            r16 = r3
        Lb3:
            int r3 = r0.zzc()
            int r20 = r3 + 4
            int r3 = r0.zzc()
            if (r3 != 0) goto Lcc
            int r4 = r0.zzc()
            int r4 = r4 + 4
            r24 = r3
            r25 = r4
        Lc9:
            r26 = 0
            goto Lf5
        Lcc:
            if (r3 != r15) goto Lf0
            boolean r3 = r0.zzh()
            r0.zzb()
            r0.zzb()
            int r4 = r0.zzc()
            long r9 = (long) r4
            r4 = 0
        Lde:
            long r13 = (long) r4
            int r24 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r24 >= 0) goto Le9
            r0.zzc()
            int r4 = r4 + 1
            goto Lde
        Le9:
            r26 = r3
            r24 = 1
            r25 = 0
            goto Lf5
        Lf0:
            r24 = r3
            r25 = 0
            goto Lc9
        Lf5:
            int r9 = r0.zzc()
            r0.zze()
            int r3 = r0.zzc()
            int r3 = r3 + r15
            int r4 = r0.zzc()
            int r4 = r4 + r15
            boolean r27 = r0.zzh()
            int r10 = 2 - r27
            if (r27 != 0) goto L111
            r0.zze()
        L111:
            int r4 = r4 * r10
            r0.zze()
            r13 = 16
            int r3 = r3 * 16
            int r4 = r4 * 16
            boolean r13 = r0.zzh()
            r14 = 2
            if (r13 == 0) goto L152
            int r13 = r0.zzc()
            int r28 = r0.zzc()
            int r29 = r0.zzc()
            int r30 = r0.zzc()
            if (r1 != 0) goto L138
            r31 = 1
            goto L147
        L138:
            r11 = 3
            if (r1 != r11) goto L13e
            r31 = 1
            goto L140
        L13e:
            r31 = 2
        L140:
            if (r1 != r15) goto L144
            r1 = 2
            goto L145
        L144:
            r1 = 1
        L145:
            int r10 = r10 * r1
        L147:
            int r13 = r13 + r28
            int r13 = r13 * r31
            int r3 = r3 - r13
            int r29 = r29 + r30
            int r29 = r29 * r10
            int r4 = r4 - r29
        L152:
            r1 = r3
            r10 = r4
            if (r2 == r8) goto L16c
            r3 = 86
            if (r2 == r3) goto L16c
            r3 = 100
            if (r2 == r3) goto L16c
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L16c
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 == r3) goto L16c
            r3 = 244(0xf4, float:3.42E-43)
            if (r2 != r3) goto L173
            r2 = 244(0xf4, float:3.42E-43)
        L16c:
            r3 = r5 & 16
            if (r3 == 0) goto L173
            r4 = r2
            r2 = 0
            goto L176
        L173:
            r4 = r2
            r2 = 16
        L176:
            boolean r3 = r0.zzh()
            r13 = -1
            if (r3 == 0) goto L253
            boolean r3 = r0.zzh()
            if (r3 == 0) goto L1be
            r3 = 8
            int r8 = r0.zza(r3)
            r3 = 255(0xff, float:3.57E-43)
            if (r8 != r3) goto L19f
            r3 = 16
            int r8 = r0.zza(r3)
            int r3 = r0.zza(r3)
            if (r8 == 0) goto L1be
            if (r3 == 0) goto L1be
            float r8 = (float) r8
            float r3 = (float) r3
            float r8 = r8 / r3
            goto L1c0
        L19f:
            r3 = 17
            if (r8 >= r3) goto L1a8
            float[] r3 = com.google.android.gms.internal.ads.zzfs.zzb
            r8 = r3[r8]
            goto L1c0
        L1a8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "Unexpected aspect_ratio_idc value: "
            r3.append(r11)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r8 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzea.zzf(r8, r3)
        L1be:
            r8 = 1065353216(0x3f800000, float:1.0)
        L1c0:
            boolean r3 = r0.zzh()
            if (r3 == 0) goto L1c9
            r0.zze()
        L1c9:
            boolean r3 = r0.zzh()
            if (r3 == 0) goto L1f9
            r3 = 3
            r0.zzf(r3)
            boolean r3 = r0.zzh()
            if (r15 == r3) goto L1da
            r15 = 2
        L1da:
            boolean r3 = r0.zzh()
            if (r3 == 0) goto L1f8
            r3 = 8
            int r11 = r0.zza(r3)
            int r13 = r0.zza(r3)
            r0.zzf(r3)
            int r3 = com.google.android.gms.internal.ads.zzo.zza(r11)
            int r13 = com.google.android.gms.internal.ads.zzo.zzb(r13)
            r11 = r13
            r13 = r15
            goto L1fb
        L1f8:
            r13 = r15
        L1f9:
            r3 = -1
            r11 = -1
        L1fb:
            boolean r14 = r0.zzh()
            if (r14 == 0) goto L207
            r0.zzc()
            r0.zzc()
        L207:
            boolean r14 = r0.zzh()
            if (r14 == 0) goto L212
            r14 = 65
            r0.zzf(r14)
        L212:
            boolean r14 = r0.zzh()
            if (r14 == 0) goto L21b
            zzn(r0)
        L21b:
            boolean r15 = r0.zzh()
            if (r15 == 0) goto L224
            zzn(r0)
        L224:
            if (r14 != 0) goto L228
            if (r15 == 0) goto L22b
        L228:
            r0.zze()
        L22b:
            r0.zze()
            boolean r14 = r0.zzh()
            if (r14 == 0) goto L24a
            r0.zze()
            r0.zzc()
            r0.zzc()
            r0.zzc()
            r0.zzc()
            int r2 = r0.zzc()
            r0.zzc()
        L24a:
            r23 = r2
            r0 = r3
            r22 = r11
            r21 = r13
            r11 = r8
            goto L25c
        L253:
            r23 = r2
            r0 = -1
            r11 = 1065353216(0x3f800000, float:1.0)
            r21 = -1
            r22 = -1
        L25c:
            com.google.android.gms.internal.ads.zzfr r2 = new com.google.android.gms.internal.ads.zzfr
            r3 = r2
            r8 = r9
            r9 = r1
            r13 = r17
            r14 = r16
            r15 = r27
            r16 = r20
            r17 = r24
            r18 = r25
            r19 = r26
            r20 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r2
    }

    public static java.lang.String zzg(java.util.List r12) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r12.size()
            r3 = 0
            if (r1 >= r2) goto L8d
            java.lang.Object r2 = r12.get(r1)
            byte[] r2 = (byte[]) r2
            int r4 = r2.length
            r5 = 3
            if (r4 <= r5) goto L89
            boolean[] r6 = new boolean[r5]
            com.google.android.gms.internal.ads.zzgau r7 = new com.google.android.gms.internal.ads.zzgau
            r7.<init>()
            r8 = 0
        L1b:
            int r9 = r2.length
            if (r8 >= r9) goto L2e
            int r8 = zza(r2, r8, r9, r6)
            if (r8 == r9) goto L2b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.zzf(r9)
        L2b:
            int r8 = r8 + 3
            goto L1b
        L2e:
            com.google.android.gms.internal.ads.zzgax r6 = r7.zzi()
            r7 = 0
        L33:
            int r8 = r6.size()
            if (r7 >= r8) goto L89
            java.lang.Object r8 = r6.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = r8 + r5
            if (r8 >= r4) goto L86
            com.google.android.gms.internal.ads.zzft r8 = new com.google.android.gms.internal.ads.zzft
            java.lang.Object r9 = r6.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = r9 + r5
            r8.<init>(r2, r9, r4)
            com.google.android.gms.internal.ads.zzfg r9 = zzl(r8)
            int r10 = r9.zza
            r11 = 33
            if (r10 != r11) goto L86
            int r9 = r9.zzb
            if (r9 == 0) goto L65
            goto L86
        L65:
            r12 = 4
            r8.zzf(r12)
            int r12 = r8.zza(r5)
            r8.zze()
            r0 = 1
            com.google.android.gms.internal.ads.zzfh r12 = zzm(r8, r0, r12, r3)
            int r0 = r12.zza
            boolean r1 = r12.zzb
            int r2 = r12.zzc
            int r3 = r12.zzd
            int[] r4 = r12.zze
            int r5 = r12.zzf
            java.lang.String r12 = com.google.android.gms.internal.ads.zzdk.zzb(r0, r1, r2, r3, r4, r5)
            return r12
        L86:
            int r7 = r7 + 1
            goto L33
        L89:
            int r1 = r1 + 1
            goto L2
        L8d:
            return r3
    }

    public static void zzh(boolean[] r2) {
            r0 = 0
            r2[r0] = r0
            r1 = 1
            r2[r1] = r0
            r1 = 2
            r2[r1] = r0
            return
    }

    public static boolean zzi(byte r3) {
            r0 = r3 & 96
            int r0 = r0 >> 5
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r3 = r3 & 31
            r0 = 0
            if (r3 != r1) goto Le
            return r0
        Le:
            r2 = 9
            if (r3 != r2) goto L13
            return r0
        L13:
            r2 = 14
            if (r3 != r2) goto L18
            return r0
        L18:
            return r1
    }

    private static int zzj(int r1, int r2, int r3, int r4) {
            r0 = 1
            if (r2 != r0) goto L4
            r0 = 2
        L4:
            int r3 = r3 + r4
            int r0 = r0 * r3
            int r1 = r1 - r0
            return r1
    }

    private static int zzk(int r2, int r3, int r4, int r5) {
            r0 = 1
            r1 = 2
            if (r3 == r0) goto L6
            if (r3 != r1) goto L7
        L6:
            r0 = 2
        L7:
            int r4 = r4 + r5
            int r0 = r0 * r4
            int r2 = r2 - r0
            return r2
    }

    private static com.google.android.gms.internal.ads.zzfg zzl(com.google.android.gms.internal.ads.zzft r3) {
            r3.zze()
            r0 = 6
            int r1 = r3.zza(r0)
            int r0 = r3.zza(r0)
            r2 = 3
            int r3 = r3.zza(r2)
            int r3 = r3 + (-1)
            com.google.android.gms.internal.ads.zzfg r2 = new com.google.android.gms.internal.ads.zzfg
            r2.<init>(r1, r0, r3)
            return r2
    }

    private static com.google.android.gms.internal.ads.zzfh zzm(com.google.android.gms.internal.ads.zzft r18, boolean r19, int r20, com.google.android.gms.internal.ads.zzfh r21) {
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L3c
            r2 = 2
            int r2 = r0.zza(r2)
            boolean r7 = r18.zzh()
            r8 = 5
            int r8 = r0.zza(r8)
            r9 = 0
            r10 = 0
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r18.zzh()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = 0
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.zza(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
            goto L49
        L3c:
            if (r2 == 0) goto L4f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
        L49:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L4f:
            r16 = r4
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L55:
            int r17 = r0.zza(r5)
            r2 = 0
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.zzf(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzf(r5)
        L79:
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r0
    }

    private static void zzn(com.google.android.gms.internal.ads.zzft r2) {
            int r0 = r2.zzc()
            int r0 = r0 + 1
            r1 = 8
            r2.zzf(r1)
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1a
            r2.zzc()
            r2.zzc()
            r2.zze()
            int r1 = r1 + 1
            goto Lc
        L1a:
            r0 = 20
            r2.zzf(r0)
            return
    }
}
