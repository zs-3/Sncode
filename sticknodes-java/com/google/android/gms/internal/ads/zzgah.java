package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgah {
    static int zza(int r1) {
            r0 = 32
            if (r1 >= r0) goto L6
            r0 = 4
            goto L7
        L6:
            r0 = 2
        L7:
            int r1 = r1 + 1
            int r0 = r0 * r1
            return r0
    }

    static int zzb(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
            int r0 = com.google.android.gms.internal.ads.zzgap.zzb(r8)
            r1 = r0 & r10
            int r2 = zzc(r11, r1)
            r3 = -1
            if (r2 == 0) goto L3e
            int r4 = ~r10
            r0 = r0 & r4
            r5 = -1
        L10:
            int r2 = r2 + r3
            r6 = r12[r2]
            r7 = r6 & r10
            r6 = r6 & r4
            if (r6 != r0) goto L39
            r6 = r13[r2]
            boolean r6 = com.google.android.gms.internal.ads.zzfxw.zza(r8, r6)
            if (r6 == 0) goto L39
            if (r14 == 0) goto L2a
            r6 = r14[r2]
            boolean r6 = com.google.android.gms.internal.ads.zzfxw.zza(r9, r6)
            if (r6 == 0) goto L39
        L2a:
            if (r5 != r3) goto L30
            zze(r11, r1, r7)
            goto L38
        L30:
            r8 = r12[r5]
            r8 = r8 & r4
            r9 = r7 & r10
            r8 = r8 | r9
            r12[r5] = r8
        L38:
            return r2
        L39:
            if (r7 == 0) goto L3e
            r5 = r2
            r2 = r7
            goto L10
        L3e:
            return r3
    }

    static int zzc(java.lang.Object r1, int r2) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto Lb
            byte[] r1 = (byte[]) r1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
        Lb:
            boolean r0 = r1 instanceof short[]
            if (r0 == 0) goto L15
            short[] r1 = (short[]) r1
            short r1 = r1[r2]
            char r1 = (char) r1
            return r1
        L15:
            int[] r1 = (int[]) r1
            r1 = r1[r2]
            return r1
    }

    static java.lang.Object zzd(int r3) {
            r0 = 2
            if (r3 < r0) goto L1e
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 > r0) goto L1e
            int r0 = java.lang.Integer.highestOneBit(r3)
            if (r0 != r3) goto L1e
            r0 = 256(0x100, float:3.59E-43)
            if (r3 > r0) goto L14
            byte[] r3 = new byte[r3]
            return r3
        L14:
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r3 > r0) goto L1b
            short[] r3 = new short[r3]
            return r3
        L1b:
            int[] r3 = new int[r3]
            return r3
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "must be power of 2 between 2^1 and 2^30: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static void zze(java.lang.Object r1, int r2, int r3) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto La
            byte[] r1 = (byte[]) r1
            byte r3 = (byte) r3
            r1[r2] = r3
            return
        La:
            boolean r0 = r1 instanceof short[]
            if (r0 == 0) goto L14
            short[] r1 = (short[]) r1
            short r3 = (short) r3
            r1[r2] = r3
            return
        L14:
            int[] r1 = (int[]) r1
            r1[r2] = r3
            return
    }
}
