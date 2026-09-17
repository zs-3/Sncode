package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zziy {
    static int zza(int r2, byte[] r3, int r4, int r5, com.google.android.gms.internal.drive.zziz r6) throws com.google.android.gms.internal.drive.zzkq {
            int r0 = r2 >>> 3
            if (r0 == 0) goto L4a
            r0 = r2 & 7
            if (r0 == 0) goto L45
            r1 = 1
            if (r0 == r1) goto L42
            r1 = 2
            if (r0 == r1) goto L3a
            r1 = 3
            if (r0 == r1) goto L1c
            r2 = 5
            if (r0 != r2) goto L17
            int r4 = r4 + 4
            return r4
        L17:
            com.google.android.gms.internal.drive.zzkq r2 = com.google.android.gms.internal.drive.zzkq.zzdk()
            throw r2
        L1c:
            r2 = r2 & (-8)
            r2 = r2 | 4
            r0 = 0
        L21:
            if (r4 >= r5) goto L30
            int r4 = zza(r3, r4, r6)
            int r0 = r6.zznk
            if (r0 == r2) goto L30
            int r4 = zza(r0, r3, r4, r5, r6)
            goto L21
        L30:
            if (r4 > r5) goto L35
            if (r0 != r2) goto L35
            return r4
        L35:
            com.google.android.gms.internal.drive.zzkq r2 = com.google.android.gms.internal.drive.zzkq.zzdm()
            throw r2
        L3a:
            int r2 = zza(r3, r4, r6)
            int r3 = r6.zznk
            int r2 = r2 + r3
            return r2
        L42:
            int r4 = r4 + 8
            return r4
        L45:
            int r2 = zzb(r3, r4, r6)
            return r2
        L4a:
            com.google.android.gms.internal.drive.zzkq r2 = com.google.android.gms.internal.drive.zzkq.zzdk()
            throw r2
    }

    static int zza(int r2, byte[] r3, int r4, int r5, com.google.android.gms.internal.drive.zzkp<?> r6, com.google.android.gms.internal.drive.zziz r7) {
            com.google.android.gms.internal.drive.zzkl r6 = (com.google.android.gms.internal.drive.zzkl) r6
            int r4 = zza(r3, r4, r7)
            int r0 = r7.zznk
            r6.zzam(r0)
        Lb:
            if (r4 >= r5) goto L1f
            int r0 = zza(r3, r4, r7)
            int r1 = r7.zznk
            if (r2 != r1) goto L1f
            int r4 = zza(r3, r0, r7)
            int r0 = r7.zznk
            r6.zzam(r0)
            goto Lb
        L1f:
            return r4
    }

    static int zza(int r9, byte[] r10, int r11, int r12, com.google.android.gms.internal.drive.zzmy r13, com.google.android.gms.internal.drive.zziz r14) throws com.google.android.gms.internal.drive.zzkq {
            int r0 = r9 >>> 3
            if (r0 == 0) goto L98
            r0 = r9 & 7
            if (r0 == 0) goto L8a
            r1 = 1
            if (r0 == r1) goto L7c
            r1 = 2
            if (r0 == r1) goto L55
            r1 = 3
            if (r0 == r1) goto L27
            r12 = 5
            if (r0 != r12) goto L22
            int r10 = zza(r10, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.zzb(r9, r10)
            int r11 = r11 + 4
            return r11
        L22:
            com.google.android.gms.internal.drive.zzkq r9 = com.google.android.gms.internal.drive.zzkq.zzdk()
            throw r9
        L27:
            com.google.android.gms.internal.drive.zzmy r6 = com.google.android.gms.internal.drive.zzmy.zzfb()
            r0 = r9 & (-8)
            r7 = r0 | 4
            r0 = 0
        L30:
            if (r11 >= r12) goto L48
            int r2 = zza(r10, r11, r14)
            int r11 = r14.zznk
            r0 = r11
            if (r11 == r7) goto L47
            r1 = r10
            r3 = r12
            r4 = r6
            r5 = r14
            int r0 = zza(r0, r1, r2, r3, r4, r5)
            r8 = r0
            r0 = r11
            r11 = r8
            goto L30
        L47:
            r11 = r2
        L48:
            if (r11 > r12) goto L50
            if (r0 != r7) goto L50
            r13.zzb(r9, r6)
            return r11
        L50:
            com.google.android.gms.internal.drive.zzkq r9 = com.google.android.gms.internal.drive.zzkq.zzdm()
            throw r9
        L55:
            int r11 = zza(r10, r11, r14)
            int r12 = r14.zznk
            if (r12 < 0) goto L77
            int r14 = r10.length
            int r14 = r14 - r11
            if (r12 > r14) goto L72
            if (r12 != 0) goto L69
            com.google.android.gms.internal.drive.zzjc r10 = com.google.android.gms.internal.drive.zzjc.zznq
            r13.zzb(r9, r10)
            goto L70
        L69:
            com.google.android.gms.internal.drive.zzjc r10 = com.google.android.gms.internal.drive.zzjc.zzb(r10, r11, r12)
            r13.zzb(r9, r10)
        L70:
            int r11 = r11 + r12
            return r11
        L72:
            com.google.android.gms.internal.drive.zzkq r9 = com.google.android.gms.internal.drive.zzkq.zzdi()
            throw r9
        L77:
            com.google.android.gms.internal.drive.zzkq r9 = com.google.android.gms.internal.drive.zzkq.zzdj()
            throw r9
        L7c:
            long r0 = zzb(r10, r11)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r13.zzb(r9, r10)
            int r11 = r11 + 8
            return r11
        L8a:
            int r10 = zzb(r10, r11, r14)
            long r11 = r14.zznl
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.zzb(r9, r11)
            return r10
        L98:
            com.google.android.gms.internal.drive.zzkq r9 = com.google.android.gms.internal.drive.zzkq.zzdk()
            throw r9
    }

    static int zza(int r1, byte[] r2, int r3, com.google.android.gms.internal.drive.zziz r4) {
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto Le
            int r2 = r3 << 7
            r1 = r1 | r2
            r4.zznk = r1
            return r0
        Le:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 7
            r1 = r1 | r3
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L1f
            int r2 = r0 << 14
            r1 = r1 | r2
            r4.zznk = r1
            return r3
        L1f:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 14
            r1 = r1 | r0
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto L30
            int r2 = r3 << 21
            r1 = r1 | r2
            r4.zznk = r1
            return r0
        L30:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 21
            r1 = r1 | r3
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L41
            int r2 = r0 << 28
            r1 = r1 | r2
            r4.zznk = r1
            return r3
        L41:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 28
            r1 = r1 | r0
        L46:
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto L4f
            r4.zznk = r1
            return r0
        L4f:
            r3 = r0
            goto L46
    }

    static int zza(com.google.android.gms.internal.drive.zzmf<?> r2, int r3, byte[] r4, int r5, int r6, com.google.android.gms.internal.drive.zzkp<?> r7, com.google.android.gms.internal.drive.zziz r8) throws java.io.IOException {
            int r5 = zza(r2, r4, r5, r6, r8)
            java.lang.Object r0 = r8.zznm
            r7.add(r0)
        L9:
            if (r5 >= r6) goto L1d
            int r0 = zza(r4, r5, r8)
            int r1 = r8.zznk
            if (r3 != r1) goto L1d
            int r5 = zza(r2, r4, r0, r6, r8)
            java.lang.Object r0 = r8.zznm
            r7.add(r0)
            goto L9
        L1d:
            return r5
    }

    static int zza(com.google.android.gms.internal.drive.zzmf r8, byte[] r9, int r10, int r11, int r12, com.google.android.gms.internal.drive.zziz r13) throws java.io.IOException {
            com.google.android.gms.internal.drive.zzlu r8 = (com.google.android.gms.internal.drive.zzlu) r8
            java.lang.Object r7 = r8.newInstance()
            r0 = r8
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            int r9 = r0.zza(r1, r2, r3, r4, r5, r6)
            r8.zzd(r7)
            r13.zznm = r7
            return r9
    }

    static int zza(com.google.android.gms.internal.drive.zzmf r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.drive.zziz r10) throws java.io.IOException {
            int r0 = r8 + 1
            r8 = r7[r8]
            if (r8 >= 0) goto Lc
            int r0 = zza(r8, r7, r0, r10)
            int r8 = r10.zznk
        Lc:
            r3 = r0
            if (r8 < 0) goto L25
            int r9 = r9 - r3
            if (r8 > r9) goto L25
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            r6.zzd(r9)
            r10.zznm = r9
            return r8
        L25:
            com.google.android.gms.internal.drive.zzkq r6 = com.google.android.gms.internal.drive.zzkq.zzdi()
            throw r6
    }

    static int zza(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    static int zza(byte[] r1, int r2, com.google.android.gms.internal.drive.zziz r3) {
            int r0 = r2 + 1
            r2 = r1[r2]
            if (r2 < 0) goto L9
            r3.zznk = r2
            return r0
        L9:
            int r1 = zza(r2, r1, r0, r3)
            return r1
    }

    static int zza(byte[] r2, int r3, com.google.android.gms.internal.drive.zzkp<?> r4, com.google.android.gms.internal.drive.zziz r5) throws java.io.IOException {
            com.google.android.gms.internal.drive.zzkl r4 = (com.google.android.gms.internal.drive.zzkl) r4
            int r3 = zza(r2, r3, r5)
            int r0 = r5.zznk
            int r0 = r0 + r3
        L9:
            if (r3 >= r0) goto L15
            int r3 = zza(r2, r3, r5)
            int r1 = r5.zznk
            r4.zzam(r1)
            goto L9
        L15:
            if (r3 != r0) goto L18
            return r3
        L18:
            com.google.android.gms.internal.drive.zzkq r2 = com.google.android.gms.internal.drive.zzkq.zzdi()
            throw r2
    }

    static int zzb(byte[] r9, int r10, com.google.android.gms.internal.drive.zziz r11) {
            int r0 = r10 + 1
            r10 = r9[r10]
            long r1 = (long) r10
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 < 0) goto Le
            r11.zznl = r1
            return r0
        Le:
            r3 = 127(0x7f, double:6.27E-322)
            long r1 = r1 & r3
            int r10 = r0 + 1
            r0 = r9[r0]
            r3 = r0 & 127(0x7f, float:1.78E-43)
            long r3 = (long) r3
            r5 = 7
            long r3 = r3 << r5
            long r1 = r1 | r3
            r3 = 7
        L1c:
            if (r0 >= 0) goto L2c
            int r0 = r10 + 1
            r10 = r9[r10]
            int r3 = r3 + r5
            r4 = r10 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r4
            long r6 = r6 << r3
            long r1 = r1 | r6
            r8 = r0
            r0 = r10
            r10 = r8
            goto L1c
        L2c:
            r11.zznl = r1
            return r10
    }

    static long zzb(byte[] r7, int r8) {
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    static double zzc(byte[] r0, int r1) {
            long r0 = zzb(r0, r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    static int zzc(byte[] r3, int r4, com.google.android.gms.internal.drive.zziz r5) throws com.google.android.gms.internal.drive.zzkq {
            int r4 = zza(r3, r4, r5)
            int r0 = r5.zznk
            if (r0 < 0) goto L1a
            if (r0 != 0) goto Lf
            java.lang.String r3 = ""
            r5.zznm = r3
            return r4
        Lf:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.android.gms.internal.drive.zzkm.UTF_8
            r1.<init>(r3, r4, r0, r2)
            r5.zznm = r1
            int r4 = r4 + r0
            return r4
        L1a:
            com.google.android.gms.internal.drive.zzkq r3 = com.google.android.gms.internal.drive.zzkq.zzdj()
            throw r3
    }

    static float zzd(byte[] r0, int r1) {
            int r0 = zza(r0, r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    static int zzd(byte[] r1, int r2, com.google.android.gms.internal.drive.zziz r3) throws com.google.android.gms.internal.drive.zzkq {
            int r2 = zza(r1, r2, r3)
            int r0 = r3.zznk
            if (r0 < 0) goto L17
            if (r0 != 0) goto Lf
            java.lang.String r1 = ""
            r3.zznm = r1
            return r2
        Lf:
            java.lang.String r1 = com.google.android.gms.internal.drive.zznf.zzg(r1, r2, r0)
            r3.zznm = r1
            int r2 = r2 + r0
            return r2
        L17:
            com.google.android.gms.internal.drive.zzkq r1 = com.google.android.gms.internal.drive.zzkq.zzdj()
            throw r1
    }

    static int zze(byte[] r2, int r3, com.google.android.gms.internal.drive.zziz r4) throws com.google.android.gms.internal.drive.zzkq {
            int r3 = zza(r2, r3, r4)
            int r0 = r4.zznk
            if (r0 < 0) goto L20
            int r1 = r2.length
            int r1 = r1 - r3
            if (r0 > r1) goto L1b
            if (r0 != 0) goto L13
            com.google.android.gms.internal.drive.zzjc r2 = com.google.android.gms.internal.drive.zzjc.zznq
            r4.zznm = r2
            return r3
        L13:
            com.google.android.gms.internal.drive.zzjc r2 = com.google.android.gms.internal.drive.zzjc.zzb(r2, r3, r0)
            r4.zznm = r2
            int r3 = r3 + r0
            return r3
        L1b:
            com.google.android.gms.internal.drive.zzkq r2 = com.google.android.gms.internal.drive.zzkq.zzdi()
            throw r2
        L20:
            com.google.android.gms.internal.drive.zzkq r2 = com.google.android.gms.internal.drive.zzkq.zzdj()
            throw r2
    }
}
