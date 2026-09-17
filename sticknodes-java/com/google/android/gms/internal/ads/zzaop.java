package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaop {
    public static int zza(byte[] r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto Lb
            r0 = r2[r3]
            r1 = 71
            if (r0 == r1) goto Lb
            int r3 = r3 + 1
            goto L0
        Lb:
            return r3
    }

    public static long zzb(com.google.android.gms.internal.ads.zzek r11, int r12, int r13) {
            r11.zzL(r12)
            int r12 = r11.zzb()
            r0 = 5
            if (r12 >= r0) goto Lb
            goto L69
        Lb:
            int r12 = r11.zzg()
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r12
            if (r0 != 0) goto L69
            int r0 = r12 >> 8
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            if (r0 != r13) goto L69
            r12 = r12 & 32
            if (r12 == 0) goto L69
            int r12 = r11.zzm()
            r13 = 7
            if (r12 < r13) goto L69
            int r12 = r11.zzb()
            if (r12 < r13) goto L69
            int r12 = r11.zzm()
            r0 = 16
            r12 = r12 & r0
            if (r12 != r0) goto L69
            r12 = 6
            byte[] r0 = new byte[r12]
            r1 = 0
            r11.zzH(r0, r1, r12)
            r11 = r0[r1]
            long r11 = (long) r11
            r1 = 1
            r1 = r0[r1]
            long r1 = (long) r1
            r3 = 2
            r3 = r0[r3]
            long r3 = (long) r3
            r5 = 3
            r5 = r0[r5]
            long r5 = (long) r5
            r7 = 4
            r0 = r0[r7]
            long r7 = (long) r0
            r9 = 255(0xff, double:1.26E-321)
            long r7 = r7 & r9
            long r7 = r7 >> r13
            long r11 = r11 & r9
            long r0 = r1 & r9
            long r2 = r3 & r9
            long r4 = r5 & r9
            r13 = 25
            long r11 = r11 << r13
            r13 = 17
            long r0 = r0 << r13
            long r11 = r11 | r0
            r13 = 9
            long r0 = r2 << r13
            long r11 = r11 | r0
            long r4 = r4 + r4
            long r11 = r11 | r4
            long r11 = r11 | r7
            return r11
        L69:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r11
    }
}
