package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadq {
    public final java.util.List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final int zzj;
    public final java.lang.String zzk;
    public final com.google.android.gms.internal.ads.zzfp zzl;

    private zzadq(java.util.List r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, float r11, int r12, java.lang.String r13, com.google.android.gms.internal.ads.zzfp r14) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r7
            r0.zzf = r8
            r0.zzg = r9
            r0.zzh = r10
            r0.zzi = r11
            r0.zzj = r12
            r0.zzk = r13
            r0.zzl = r14
            return
    }

    public static com.google.android.gms.internal.ads.zzadq zza(com.google.android.gms.internal.ads.zzek r2) throws com.google.android.gms.internal.ads.zzbo {
            r0 = 0
            r1 = 0
            com.google.android.gms.internal.ads.zzadq r2 = zzc(r2, r0, r1)
            return r2
    }

    public static com.google.android.gms.internal.ads.zzadq zzb(com.google.android.gms.internal.ads.zzek r1, com.google.android.gms.internal.ads.zzfp r2) throws com.google.android.gms.internal.ads.zzbo {
            r0 = 1
            com.google.android.gms.internal.ads.zzadq r1 = zzc(r1, r0, r2)
            return r1
    }

    private static com.google.android.gms.internal.ads.zzadq zzc(com.google.android.gms.internal.ads.zzek r46, boolean r47, com.google.android.gms.internal.ads.zzfp r48) throws com.google.android.gms.internal.ads.zzbo {
            r0 = r46
            r1 = r47
            r2 = 4
            r3 = 1
            if (r1 == 0) goto Lc
            r0.zzM(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            goto L11
        Lc:
            r4 = 21
            r0.zzM(r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
        L11:
            int r4 = r46.zzm()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r4 = r4 & 3
            int r5 = r46.zzm()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r6 = r46.zzd()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r7 = 0
            r8 = 0
            r9 = 0
        L22:
            if (r8 >= r5) goto L3e
            r0.zzM(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r10 = r46.zzq()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r11 = 0
        L2c:
            if (r11 >= r10) goto L3b
            int r12 = r46.zzq()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r13 = r12 + 4
            int r9 = r9 + r13
            r0.zzM(r12)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r11 = r11 + 1
            goto L2c
        L3b:
            int r8 = r8 + 1
            goto L22
        L3e:
            r0.zzL(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            byte[] r6 = new byte[r9]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r8 = 1065353216(0x3f800000, float:1.0)
            r26 = r48
            r8 = 0
            r12 = 0
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r19 = -1
            r20 = -1
            r21 = -1
            r22 = -1
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = -1
            r25 = 0
        L5e:
            if (r8 >= r5) goto L276
            int r13 = r46.zzm()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r14 = 63
            r13 = r13 & r14
            int r10 = r46.zzq()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r3 = r26
            r14 = 0
        L6e:
            if (r14 >= r10) goto L26a
            int r11 = r46.zzq()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r27 = r5
            byte[] r5 = com.google.android.gms.internal.ads.zzfs.zza     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            java.lang.System.arraycopy(r5, r7, r6, r12, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r12 = r12 + 4
            byte[] r5 = r46.zzN()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r2 = r46.zzd()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            java.lang.System.arraycopy(r5, r2, r6, r12, r11)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r2 = 32
            if (r13 != r2) goto L9b
            if (r14 != 0) goto L9c
            int r2 = r12 + r11
            com.google.android.gms.internal.ads.zzfp r3 = com.google.android.gms.internal.ads.zzfs.zzd(r6, r12, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r34 = r10
            r35 = r13
            r14 = 0
            goto L25b
        L9b:
            r2 = r13
        L9c:
            r5 = 33
            if (r2 != r5) goto L11e
            if (r14 != 0) goto L118
            int r2 = r12 + r11
            com.google.android.gms.internal.ads.zzfm r2 = com.google.android.gms.internal.ads.zzfs.zzc(r6, r12, r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r5 = r2.zzd     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r15 = r2.zze     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r7 = r2.zzb     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r16 = 8
            int r7 = r7 + 8
            r17 = r5
            int r5 = r2.zzc     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r5 = r5 + 8
            r16 = r5
            int r5 = r2.zzh     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r18 = r5
            int r5 = r2.zzi     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r19 = r5
            int r5 = r2.zzj     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r20 = r5
            float r5 = r2.zzf     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r21 = r5
            int r5 = r2.zzg     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            com.google.android.gms.internal.ads.zzfh r2 = r2.zza     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            if (r2 == 0) goto Lf9
            r23 = r5
            int r5 = r2.zza     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r24 = r7
            boolean r7 = r2.zzb     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r34 = r10
            int r10 = r2.zzc     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r35 = r13
            int r13 = r2.zzd     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r26 = r15
            int[] r15 = r2.zze     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r2 = r2.zzf     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r28 = r5
            r29 = r7
            r30 = r10
            r31 = r13
            r32 = r15
            r33 = r2
            java.lang.String r2 = com.google.android.gms.internal.ads.zzdk.zzb(r28, r29, r30, r31, r32, r33)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r25 = r2
            goto L103
        Lf9:
            r23 = r5
            r24 = r7
            r34 = r10
            r35 = r13
            r26 = r15
        L103:
            r15 = r17
            r17 = r24
            r7 = 0
            r24 = r23
            r23 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r16
            r16 = r26
            goto L25b
        L118:
            r34 = r10
            r35 = r13
            goto L252
        L11e:
            r34 = r10
            r35 = r13
            r5 = 39
            if (r2 != r5) goto L252
            if (r14 != 0) goto L252
            int r2 = r12 + r11
            int r5 = r12 + 2
            r7 = -1
            int r2 = r2 + r7
        L12e:
            r10 = r6[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            if (r10 != 0) goto L137
            if (r2 <= r5) goto L22b
            int r2 = r2 + (-1)
            goto L12e
        L137:
            if (r10 == 0) goto L22b
            if (r2 > r5) goto L13d
            goto L22b
        L13d:
            com.google.android.gms.internal.ads.zzft r10 = new com.google.android.gms.internal.ads.zzft     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r2 = r2 + 1
            r10.<init>(r6, r5, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
        L144:
            r2 = 16
            boolean r2 = r10.zzg(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            if (r2 == 0) goto L22b
            r2 = 8
            int r5 = r10.zza(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r13 = 0
        L153:
            r7 = 255(0xff, float:3.57E-43)
            if (r5 != r7) goto L15e
            int r13 = r13 + 255
            int r5 = r10.zza(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            goto L153
        L15e:
            int r13 = r13 + r5
            int r5 = r10.zza(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r2 = 0
        L164:
            if (r5 != r7) goto L171
            int r2 = r2 + 255
            r5 = 8
            int r26 = r10.zza(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r5 = r26
            goto L164
        L171:
            r7 = 8
            int r2 = r2 + r5
            if (r2 == 0) goto L22b
            boolean r2 = r10.zzg(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            if (r2 != 0) goto L17e
            goto L22b
        L17e:
            r2 = 176(0xb0, float:2.47E-43)
            if (r13 != r2) goto L228
            int r37 = r10.zzc()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            boolean r2 = r10.zzh()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            if (r2 == 0) goto L193
            int r5 = r10.zzc()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r38 = r5
            goto L195
        L193:
            r38 = 0
        L195:
            int r5 = r10.zzc()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r7 = 0
            r40 = -1
            r41 = -1
            r42 = -1
            r43 = -1
            r44 = -1
            r45 = -1
        L1a6:
            if (r7 > r5) goto L21a
            int r40 = r10.zzc()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r41 = r10.zzc()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r13 = 6
            r26 = r14
            int r14 = r10.zza(r13)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r13 = 63
            if (r14 != r13) goto L1bd
            goto L22d
        L1bd:
            if (r14 != 0) goto L1c9
            int r13 = r37 + (-30)
            r29 = r15
            r15 = 0
            int r13 = java.lang.Math.max(r15, r13)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            goto L1d4
        L1c9:
            r29 = r15
            r15 = 0
            int r13 = r14 + r37
            int r13 = r13 + (-31)
            int r13 = java.lang.Math.max(r15, r13)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
        L1d4:
            int r43 = r10.zza(r13)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            if (r2 == 0) goto L202
            r13 = 6
            int r13 = r10.zza(r13)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r15 = 63
            if (r13 != r15) goto L1e4
            goto L22f
        L1e4:
            if (r13 != 0) goto L1f0
            int r15 = r38 + (-30)
            r28 = r2
            r2 = 0
            int r15 = java.lang.Math.max(r2, r15)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            goto L1fb
        L1f0:
            r28 = r2
            r2 = 0
            int r15 = r13 + r38
            int r15 = r15 + (-31)
            int r15 = java.lang.Math.max(r2, r15)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
        L1fb:
            int r45 = r10.zza(r15)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r44 = r13
            goto L204
        L202:
            r28 = r2
        L204:
            boolean r2 = r10.zzh()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            if (r2 == 0) goto L20f
            r2 = 10
            r10.zzf(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
        L20f:
            int r7 = r7 + 1
            r42 = r14
            r14 = r26
            r2 = r28
            r15 = r29
            goto L1a6
        L21a:
            r26 = r14
            r29 = r15
            com.google.android.gms.internal.ads.zzfl r2 = new com.google.android.gms.internal.ads.zzfl     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r39 = r5 + 1
            r36 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            goto L230
        L228:
            r7 = -1
            goto L144
        L22b:
            r26 = r14
        L22d:
            r29 = r15
        L22f:
            r2 = 0
        L230:
            if (r2 == 0) goto L256
            if (r3 == 0) goto L256
            int r2 = r2.zza     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            com.google.android.gms.internal.ads.zzgax r5 = r3.zza     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r7 = 0
            java.lang.Object r5 = r5.get(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            com.google.android.gms.internal.ads.zzff r5 = (com.google.android.gms.internal.ads.zzff) r5     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            int r5 = r5.zzb     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            if (r2 != r5) goto L24a
            r14 = r26
            r15 = r29
            r22 = 4
            goto L25b
        L24a:
            r2 = 5
            r14 = r26
            r15 = r29
            r22 = 5
            goto L25b
        L252:
            r26 = r14
            r29 = r15
        L256:
            r7 = 0
            r14 = r26
            r15 = r29
        L25b:
            int r12 = r12 + r11
            r0.zzM(r11)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r2 = 1
            int r14 = r14 + r2
            r5 = r27
            r10 = r34
            r13 = r35
            r2 = 4
            goto L6e
        L26a:
            r27 = r5
            r29 = r15
            int r8 = r8 + 1
            r26 = r3
            r2 = 4
            r3 = 1
            goto L5e
        L276:
            if (r9 != 0) goto L27d
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            goto L281
        L27d:
            java.util.List r0 = java.util.Collections.singletonList(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
        L281:
            r13 = r0
            com.google.android.gms.internal.ads.zzadq r0 = new com.google.android.gms.internal.ads.zzadq     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            r2 = 1
            int r14 = r4 + 1
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28c
            return r0
        L28c:
            r0 = move-exception
            r2 = 1
            if (r2 == r1) goto L293
            java.lang.String r1 = "HEVC config"
            goto L295
        L293:
            java.lang.String r1 = "L-HEVC config"
        L295:
            java.lang.String r2 = "Error parsing"
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r1, r0)
            throw r0
    }
}
