package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzajq {
    private static final int[] zza = null;

    static {
            r0 = 29
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686} // fill-array
            com.google.android.gms.internal.ads.zzajq.zza = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzaee zza(com.google.android.gms.internal.ads.zzadc r2) throws java.io.IOException {
            r0 = 1
            r1 = 0
            com.google.android.gms.internal.ads.zzaee r2 = zzc(r2, r0, r1)
            return r2
    }

    public static com.google.android.gms.internal.ads.zzaee zzb(com.google.android.gms.internal.ads.zzadc r1, boolean r2) throws java.io.IOException {
            r0 = 0
            com.google.android.gms.internal.ads.zzaee r1 = zzc(r1, r0, r2)
            return r1
    }

    private static com.google.android.gms.internal.ads.zzaee zzc(com.google.android.gms.internal.ads.zzadc r22, boolean r23, boolean r24) throws java.io.IOException {
            r0 = r22
            r1 = r24
            long r2 = r22.zzd()
            r4 = -1
            r6 = 4096(0x1000, double:2.0237E-320)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L16
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 <= 0) goto L15
            goto L16
        L15:
            r6 = r2
        L16:
            com.google.android.gms.internal.ads.zzek r9 = new com.google.android.gms.internal.ads.zzek
            r10 = 64
            r9.<init>(r10)
            int r7 = (int) r6
            r6 = 0
            r10 = 0
            r11 = 0
        L21:
            r13 = 1
            if (r10 >= r7) goto L117
            r14 = 8
            r9.zzI(r14)
            byte[] r15 = r9.zzN()
            boolean r15 = r0.zzm(r15, r6, r14, r13)
            if (r15 != 0) goto L35
            goto L119
        L35:
            long r15 = r9.zzu()
            int r12 = r9.zzg()
            r17 = 1
            r6 = 16
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 != 0) goto L55
            byte[] r15 = r9.zzN()
            r0.zzh(r15, r14, r14)
            r9.zzK(r6)
            long r15 = r9.zzt()
            r4 = r15
            goto L70
        L55:
            r17 = 0
            int r6 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r6 != 0) goto L6d
            long r17 = r22.zzd()
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 == 0) goto L6d
            long r15 = r22.zze()
            long r17 = r17 - r15
            r15 = 8
            long r15 = r17 + r15
        L6d:
            r4 = r15
            r6 = 8
        L70:
            long r14 = (long) r6
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 >= 0) goto L7b
            com.google.android.gms.internal.ads.zzaja r0 = new com.google.android.gms.internal.ads.zzaja
            r0.<init>(r12, r4, r6)
            return r0
        L7b:
            int r10 = r10 + r6
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r12 != r6) goto L8f
            int r5 = (int) r4
            int r7 = r7 + r5
            if (r8 == 0) goto L8b
            long r4 = (long) r7
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L8b
            int r7 = (int) r2
        L8b:
            r4 = -1
            r6 = 0
            goto L21
        L8f:
            r6 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r12 == r6) goto L115
            r6 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r12 != r6) goto L9b
            goto L115
        L9b:
            r6 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r12 != r6) goto La2
            r6 = 0
            goto La3
        La2:
            r6 = 1
        La3:
            r6 = r6 ^ r13
            r11 = r11 | r6
            r20 = r14
            long r13 = (long) r10
            long r13 = r13 + r4
            r15 = r2
            long r2 = (long) r7
            long r13 = r13 - r20
            int r18 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r18 < 0) goto Lb3
            goto L118
        Lb3:
            long r4 = r4 - r20
            int r2 = (int) r4
            int r10 = r10 + r2
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r12 != r3) goto L10c
            r4 = 8
            if (r2 >= r4) goto Lc7
            long r0 = (long) r2
            com.google.android.gms.internal.ads.zzaja r2 = new com.google.android.gms.internal.ads.zzaja
            r2.<init>(r3, r0, r4)
            return r2
        Lc7:
            r9.zzI(r2)
            byte[] r3 = r9.zzN()
            r4 = 0
            r0.zzh(r3, r4, r2)
            int r2 = r9.zzg()
            boolean r3 = zzd(r2, r1)
            r3 = r3 | r11
            r5 = 4
            r9.zzM(r5)
            int r11 = r9.zzb()
            int r11 = r11 / r5
            if (r3 != 0) goto L100
            if (r11 <= 0) goto L100
            int[] r12 = new int[r11]
            r5 = 0
        Leb:
            if (r5 >= r11) goto Lfe
            int r13 = r9.zzg()
            r12[r5] = r13
            boolean r13 = zzd(r13, r1)
            if (r13 == 0) goto Lfb
            r13 = 1
            goto L102
        Lfb:
            int r5 = r5 + 1
            goto Leb
        Lfe:
            r13 = r3
            goto L102
        L100:
            r13 = r3
            r12 = 0
        L102:
            if (r13 == 0) goto L106
            r11 = r13
            goto L112
        L106:
            com.google.android.gms.internal.ads.zzajv r0 = new com.google.android.gms.internal.ads.zzajv
            r0.<init>(r2, r12)
            return r0
        L10c:
            r4 = 0
            if (r2 == 0) goto L112
            r0.zzg(r2)
        L112:
            r2 = r15
            goto L8b
        L115:
            r6 = 1
            goto L119
        L117:
            r4 = 0
        L118:
            r6 = 0
        L119:
            if (r11 != 0) goto L11e
            com.google.android.gms.internal.ads.zzajm r0 = com.google.android.gms.internal.ads.zzajm.zza
            return r0
        L11e:
            r0 = r23
            if (r0 == r6) goto L12a
            if (r6 == 0) goto L127
            com.google.android.gms.internal.ads.zzajh r0 = com.google.android.gms.internal.ads.zzajh.zza
            goto L129
        L127:
            com.google.android.gms.internal.ads.zzajh r0 = com.google.android.gms.internal.ads.zzajh.zzb
        L129:
            return r0
        L12a:
            r0 = 0
            return r0
    }

    private static boolean zzd(int r4, boolean r5) {
            int r0 = r4 >>> 8
            r1 = 1
            r2 = 3368816(0x336770, float:4.720717E-39)
            if (r0 != r2) goto L9
            return r1
        L9:
            r0 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 != r0) goto L15
            if (r5 != 0) goto L14
            r4 = 1751476579(0x68656963, float:4.333464E24)
            goto L15
        L14:
            return r1
        L15:
            int[] r5 = com.google.android.gms.internal.ads.zzajq.zza
            r0 = 0
            r2 = 0
        L19:
            r3 = 29
            if (r2 >= r3) goto L25
            r3 = r5[r2]
            if (r3 != r4) goto L22
            return r1
        L22:
            int r2 = r2 + 1
            goto L19
        L25:
            return r0
    }
}
