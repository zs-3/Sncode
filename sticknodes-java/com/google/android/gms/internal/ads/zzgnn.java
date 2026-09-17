package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgnn {
    public static byte[] zza(byte[] r72, byte[] r73) {
            r0 = r72
            r1 = r73
            r2 = 0
            long r3 = zzb(r0, r2, r2)
            r5 = 3
            r6 = 2
            long r7 = zzb(r0, r5, r6)
            r9 = 67108611(0x3ffff03, double:3.3156059E-316)
            long r7 = r7 & r9
            r9 = 6
            r10 = 4
            long r11 = zzb(r0, r9, r10)
            r13 = 67092735(0x3ffc0ff, double:3.31482154E-316)
            long r11 = r11 & r13
            r13 = 9
            long r14 = zzb(r0, r13, r9)
            r16 = 66076671(0x3f03fff, double:3.2646213E-316)
            long r14 = r14 & r16
            r13 = 12
            r9 = 8
            long r18 = zzb(r0, r13, r9)
            r20 = 1048575(0xfffff, double:5.18065E-318)
            long r18 = r18 & r20
            r9 = 17
            byte[] r13 = new byte[r9]
            r22 = 0
            r24 = r22
            r26 = r24
            r28 = r26
            r30 = r28
            r10 = 0
        L44:
            int r5 = r1.length
            r6 = 16
            r32 = 5
            r34 = 67108863(0x3ffffff, double:3.31561837E-316)
            r36 = 26
            if (r10 >= r5) goto L12a
            int r5 = r5 - r10
            int r5 = java.lang.Math.min(r6, r5)
            java.lang.System.arraycopy(r1, r10, r13, r2, r5)
            r37 = 1
            r13[r5] = r37
            if (r5 == r6) goto L63
            int r5 = r5 + 1
            java.util.Arrays.fill(r13, r5, r9, r2)
        L63:
            long r37 = r18 * r32
            long r39 = r14 * r32
            long r41 = r11 * r32
            long r43 = r7 * r32
            long r45 = zzb(r13, r2, r2)
            long r30 = r30 + r45
            r5 = 2
            r9 = 3
            long r45 = zzb(r13, r9, r5)
            long r24 = r24 + r45
            r5 = 4
            r9 = 6
            long r46 = zzb(r13, r9, r5)
            long r22 = r22 + r46
            r5 = 9
            long r46 = zzb(r13, r5, r9)
            long r26 = r26 + r46
            r5 = 12
            r9 = 8
            long r46 = zzb(r13, r5, r9)
            r5 = r13[r6]
            r6 = 24
            int r5 = r5 << r6
            long r5 = (long) r5
            long r5 = r46 | r5
            long r28 = r28 + r5
            long r5 = r30 * r3
            long r46 = r30 * r7
            long r48 = r24 * r3
            long r50 = r30 * r11
            long r52 = r24 * r7
            long r54 = r22 * r3
            long r56 = r30 * r14
            long r58 = r24 * r11
            long r60 = r22 * r7
            long r62 = r26 * r3
            long r30 = r30 * r18
            long r64 = r24 * r14
            long r66 = r22 * r11
            long r68 = r26 * r7
            long r70 = r28 * r3
            long r24 = r24 * r37
            long r5 = r5 + r24
            long r24 = r22 * r39
            long r5 = r5 + r24
            long r24 = r26 * r41
            long r5 = r5 + r24
            long r43 = r43 * r28
            long r5 = r5 + r43
            long r24 = r5 >> r36
            long r5 = r5 & r34
            long r46 = r46 + r48
            long r22 = r22 * r37
            long r46 = r46 + r22
            long r22 = r26 * r39
            long r46 = r46 + r22
            long r41 = r41 * r28
            long r46 = r46 + r41
            long r46 = r46 + r24
            long r22 = r46 >> r36
            long r24 = r46 & r34
            long r50 = r50 + r52
            long r50 = r50 + r54
            long r26 = r26 * r37
            long r50 = r50 + r26
            long r39 = r39 * r28
            long r50 = r50 + r39
            long r50 = r50 + r22
            long r22 = r50 >> r36
            long r26 = r50 & r34
            long r56 = r56 + r58
            long r56 = r56 + r60
            long r56 = r56 + r62
            long r28 = r28 * r37
            long r56 = r56 + r28
            long r56 = r56 + r22
            long r22 = r56 >> r36
            long r28 = r56 & r34
            long r30 = r30 + r64
            long r30 = r30 + r66
            long r30 = r30 + r68
            long r30 = r30 + r70
            long r30 = r30 + r22
            long r22 = r30 >> r36
            long r30 = r30 & r34
            long r22 = r22 * r32
            long r5 = r5 + r22
            long r22 = r5 >> r36
            long r5 = r5 & r34
            long r24 = r24 + r22
            int r10 = r10 + 16
            r22 = r26
            r26 = r28
            r28 = r30
            r9 = 17
            r30 = r5
            r6 = 2
            goto L44
        L12a:
            long r3 = r24 >> r36
            long r7 = r24 & r34
            long r22 = r22 + r3
            long r3 = r22 >> r36
            long r9 = r22 & r34
            long r26 = r26 + r3
            long r3 = r26 >> r36
            long r11 = r26 & r34
            long r28 = r28 + r3
            long r3 = r28 >> r36
            long r13 = r28 & r34
            long r3 = r3 * r32
            long r30 = r30 + r3
            long r3 = r30 >> r36
            long r15 = r30 & r34
            long r32 = r15 + r32
            long r18 = r32 >> r36
            long r22 = r32 & r34
            long r7 = r7 + r3
            long r18 = r7 + r18
            long r3 = r18 >> r36
            long r18 = r18 & r34
            long r3 = r3 + r9
            long r24 = r3 >> r36
            long r3 = r3 & r34
            long r24 = r11 + r24
            long r26 = r24 >> r36
            long r24 = r24 & r34
            long r26 = r13 + r26
            r28 = -67108864(0xfffffffffc000000, double:NaN)
            long r26 = r26 + r28
            r1 = 63
            r28 = r3
            long r2 = r26 >> r1
            long r7 = r7 & r2
            long r5 = ~r2
            long r18 = r18 & r5
            long r7 = r7 | r18
            long r18 = r7 << r36
            r4 = 6
            long r7 = r7 >> r4
            long r9 = r9 & r2
            long r28 = r28 & r5
            long r9 = r9 | r28
            r4 = 12
            long r28 = r9 >> r4
            long r11 = r11 & r2
            long r24 = r24 & r5
            long r11 = r11 | r24
            long r13 = r13 & r2
            long r24 = r26 & r5
            long r13 = r13 | r24
            r4 = 18
            long r24 = r11 >> r4
            r4 = 8
            long r13 = r13 << r4
            long r2 = r2 & r15
            long r4 = r22 & r5
            long r2 = r2 | r4
            long r2 = r2 | r18
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r1 = 16
            long r15 = zzc(r0, r1)
            long r2 = r2 + r15
            r6 = 20
            long r9 = r9 << r6
            long r7 = r7 | r9
            long r7 = r7 & r4
            long r9 = zzc(r0, r6)
            long r7 = r7 + r9
            r6 = 14
            long r9 = r11 << r6
            long r9 = r28 | r9
            long r9 = r9 & r4
            r6 = 24
            long r11 = zzc(r0, r6)
            long r9 = r9 + r11
            long r11 = r24 | r13
            long r11 = r11 & r4
            r6 = 28
            long r13 = zzc(r0, r6)
            long r11 = r11 + r13
            r0 = 16
            byte[] r0 = new byte[r0]
            long r13 = r2 & r4
            r1 = 0
            zzd(r0, r13, r1)
            r1 = 32
            long r2 = r2 >> r1
            long r7 = r7 + r2
            long r2 = r7 & r4
            r6 = 4
            zzd(r0, r2, r6)
            long r2 = r7 >> r1
            long r9 = r9 + r2
            long r2 = r9 & r4
            r6 = 8
            zzd(r0, r2, r6)
            long r1 = r9 >> r1
            long r11 = r11 + r1
            long r1 = r11 & r4
            r3 = 12
            zzd(r0, r1, r3)
            return r0
    }

    private static long zzb(byte[] r2, int r3, int r4) {
            long r2 = zzc(r2, r3)
            long r2 = r2 >> r4
            r0 = 67108863(0x3ffffff, double:3.31561837E-316)
            long r2 = r2 & r0
            return r2
    }

    private static long zzc(byte[] r3, int r4) {
            r0 = r3[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 2
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 3
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r1 << 8
            r4 = r4 | r0
            int r0 = r2 << 16
            r4 = r4 | r0
            int r3 = r3 << 24
            r3 = r3 | r4
            long r3 = (long) r3
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            return r3
    }

    private static void zzd(byte[] r4, long r5, int r7) {
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto L13
            int r1 = r7 + r0
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r5
            int r3 = (int) r2
            byte r2 = (byte) r3
            r4[r1] = r2
            r1 = 8
            long r5 = r5 >> r1
            int r0 = r0 + 1
            goto L1
        L13:
            return
    }
}
