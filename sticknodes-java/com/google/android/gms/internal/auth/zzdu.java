package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdu {
    static int zza(byte[] r2, int r3, com.google.android.gms.internal.auth.zzdt r4) throws com.google.android.gms.internal.auth.zzfb {
            int r3 = zzh(r2, r3, r4)
            int r0 = r4.zza
            if (r0 < 0) goto L20
            int r1 = r2.length
            int r1 = r1 - r3
            if (r0 > r1) goto L1b
            if (r0 != 0) goto L13
            com.google.android.gms.internal.auth.zzef r2 = com.google.android.gms.internal.auth.zzef.zzb
            r4.zzc = r2
            return r3
        L13:
            com.google.android.gms.internal.auth.zzef r2 = com.google.android.gms.internal.auth.zzef.zzk(r2, r3, r0)
            r4.zzc = r2
            int r3 = r3 + r0
            return r3
        L1b:
            com.google.android.gms.internal.auth.zzfb r2 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r2
        L20:
            com.google.android.gms.internal.auth.zzfb r2 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r2
    }

    static int zzb(byte[] r3, int r4) {
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
            return r3
    }

    static int zzc(com.google.android.gms.internal.auth.zzgi r8, byte[] r9, int r10, int r11, int r12, com.google.android.gms.internal.auth.zzdt r13) throws java.io.IOException {
            java.lang.Object r7 = r8.zzd()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            int r9 = zzl(r0, r1, r2, r3, r4, r5, r6)
            r8.zze(r7)
            r13.zzc = r7
            return r9
    }

    static int zzd(com.google.android.gms.internal.auth.zzgi r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.auth.zzdt r11) throws java.io.IOException {
            java.lang.Object r6 = r7.zzd()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            int r8 = zzm(r0, r1, r2, r3, r4, r5)
            r7.zze(r6)
            r11.zzc = r6
            return r8
    }

    static int zze(com.google.android.gms.internal.auth.zzgi r2, int r3, byte[] r4, int r5, int r6, com.google.android.gms.internal.auth.zzez r7, com.google.android.gms.internal.auth.zzdt r8) throws java.io.IOException {
            int r5 = zzd(r2, r4, r5, r6, r8)
            java.lang.Object r0 = r8.zzc
            r7.add(r0)
        L9:
            if (r5 >= r6) goto L1e
            int r0 = zzh(r4, r5, r8)
            int r1 = r8.zza
            if (r3 == r1) goto L14
            goto L1e
        L14:
            int r5 = zzd(r2, r4, r0, r6, r8)
            java.lang.Object r0 = r8.zzc
            r7.add(r0)
            goto L9
        L1e:
            return r5
    }

    static int zzf(byte[] r2, int r3, com.google.android.gms.internal.auth.zzez r4, com.google.android.gms.internal.auth.zzdt r5) throws java.io.IOException {
            com.google.android.gms.internal.auth.zzew r4 = (com.google.android.gms.internal.auth.zzew) r4
            int r3 = zzh(r2, r3, r5)
            int r0 = r5.zza
            int r0 = r0 + r3
        L9:
            if (r3 >= r0) goto L15
            int r3 = zzh(r2, r3, r5)
            int r1 = r5.zza
            r4.zze(r1)
            goto L9
        L15:
            if (r3 != r0) goto L18
            return r3
        L18:
            com.google.android.gms.internal.auth.zzfb r2 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r2
    }

    static int zzg(int r9, byte[] r10, int r11, int r12, com.google.android.gms.internal.auth.zzha r13, com.google.android.gms.internal.auth.zzdt r14) throws com.google.android.gms.internal.auth.zzfb {
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
            int r10 = zzb(r10, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.zzh(r9, r10)
            int r11 = r11 + 4
            return r11
        L22:
            com.google.android.gms.internal.auth.zzfb r9 = com.google.android.gms.internal.auth.zzfb.zza()
            throw r9
        L27:
            r0 = r9 & (-8)
            r0 = r0 | 4
            com.google.android.gms.internal.auth.zzha r7 = com.google.android.gms.internal.auth.zzha.zzd()
            r1 = 0
        L30:
            if (r11 >= r12) goto L48
            int r3 = zzh(r10, r11, r14)
            int r11 = r14.zza
            r1 = r11
            if (r11 == r0) goto L47
            r2 = r10
            r4 = r12
            r5 = r7
            r6 = r14
            int r1 = zzg(r1, r2, r3, r4, r5, r6)
            r8 = r1
            r1 = r11
            r11 = r8
            goto L30
        L47:
            r11 = r3
        L48:
            if (r11 > r12) goto L50
            if (r1 != r0) goto L50
            r13.zzh(r9, r7)
            return r11
        L50:
            com.google.android.gms.internal.auth.zzfb r9 = com.google.android.gms.internal.auth.zzfb.zzd()
            throw r9
        L55:
            int r11 = zzh(r10, r11, r14)
            int r12 = r14.zza
            if (r12 < 0) goto L77
            int r14 = r10.length
            int r14 = r14 - r11
            if (r12 > r14) goto L72
            if (r12 != 0) goto L69
            com.google.android.gms.internal.auth.zzef r10 = com.google.android.gms.internal.auth.zzef.zzb
            r13.zzh(r9, r10)
            goto L70
        L69:
            com.google.android.gms.internal.auth.zzef r10 = com.google.android.gms.internal.auth.zzef.zzk(r10, r11, r12)
            r13.zzh(r9, r10)
        L70:
            int r11 = r11 + r12
            return r11
        L72:
            com.google.android.gms.internal.auth.zzfb r9 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r9
        L77:
            com.google.android.gms.internal.auth.zzfb r9 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r9
        L7c:
            long r0 = zzn(r10, r11)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r13.zzh(r9, r10)
            int r11 = r11 + 8
            return r11
        L8a:
            int r10 = zzk(r10, r11, r14)
            long r11 = r14.zzb
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.zzh(r9, r11)
            return r10
        L98:
            com.google.android.gms.internal.auth.zzfb r9 = com.google.android.gms.internal.auth.zzfb.zza()
            throw r9
    }

    static int zzh(byte[] r1, int r2, com.google.android.gms.internal.auth.zzdt r3) {
            int r0 = r2 + 1
            r2 = r1[r2]
            if (r2 < 0) goto L9
            r3.zza = r2
            return r0
        L9:
            int r1 = zzi(r2, r1, r0, r3)
            return r1
    }

    static int zzi(int r1, byte[] r2, int r3, com.google.android.gms.internal.auth.zzdt r4) {
            r0 = r2[r3]
            int r3 = r3 + 1
            r1 = r1 & 127(0x7f, float:1.78E-43)
            if (r0 < 0) goto Le
            int r2 = r0 << 7
            r1 = r1 | r2
            r4.zza = r1
            return r3
        Le:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 7
            r1 = r1 | r0
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto L1f
            int r2 = r3 << 14
            r1 = r1 | r2
            r4.zza = r1
            return r0
        L1f:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 14
            r1 = r1 | r3
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L30
            int r2 = r0 << 21
            r1 = r1 | r2
            r4.zza = r1
            return r3
        L30:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 21
            r1 = r1 | r0
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto L41
            int r2 = r3 << 28
            r1 = r1 | r2
            r4.zza = r1
            return r0
        L41:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 28
            r1 = r1 | r3
        L46:
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 >= 0) goto L4e
            r0 = r3
            goto L46
        L4e:
            r4.zza = r1
            return r3
    }

    static int zzj(int r2, byte[] r3, int r4, int r5, com.google.android.gms.internal.auth.zzez r6, com.google.android.gms.internal.auth.zzdt r7) {
            com.google.android.gms.internal.auth.zzew r6 = (com.google.android.gms.internal.auth.zzew) r6
            int r4 = zzh(r3, r4, r7)
            int r0 = r7.zza
            r6.zze(r0)
        Lb:
            if (r4 >= r5) goto L20
            int r0 = zzh(r3, r4, r7)
            int r1 = r7.zza
            if (r2 == r1) goto L16
            goto L20
        L16:
            int r4 = zzh(r3, r0, r7)
            int r0 = r7.zza
            r6.zze(r0)
            goto Lb
        L20:
            return r4
    }

    static int zzk(byte[] r9, int r10, com.google.android.gms.internal.auth.zzdt r11) {
            r0 = r9[r10]
            long r0 = (long) r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            int r10 = r10 + 1
            if (r4 < 0) goto Le
            r11.zzb = r0
            return r10
        Le:
            int r2 = r10 + 1
            r10 = r9[r10]
            r3 = r10 & 127(0x7f, float:1.78E-43)
            r4 = 127(0x7f, double:6.27E-322)
            long r0 = r0 & r4
            long r3 = (long) r3
            r5 = 7
            long r3 = r3 << r5
            long r0 = r0 | r3
            r3 = 7
        L1c:
            if (r10 >= 0) goto L2c
            int r10 = r2 + 1
            r2 = r9[r2]
            int r3 = r3 + r5
            r4 = r2 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r4
            long r6 = r6 << r3
            long r0 = r0 | r6
            r8 = r2
            r2 = r10
            r10 = r8
            goto L1c
        L2c:
            r11.zzb = r0
            return r2
    }

    static int zzl(java.lang.Object r7, com.google.android.gms.internal.auth.zzgi r8, byte[] r9, int r10, int r11, int r12, com.google.android.gms.internal.auth.zzdt r13) throws java.io.IOException {
            r0 = r8
            com.google.android.gms.internal.auth.zzga r0 = (com.google.android.gms.internal.auth.zzga) r0
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            int r8 = r0.zzb(r1, r2, r3, r4, r5, r6)
            r13.zzc = r7
            return r8
    }

    static int zzm(java.lang.Object r6, com.google.android.gms.internal.auth.zzgi r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.auth.zzdt r11) throws java.io.IOException {
            int r0 = r9 + 1
            r9 = r8[r9]
            if (r9 >= 0) goto Lc
            int r0 = zzi(r9, r8, r0, r11)
            int r9 = r11.zza
        Lc:
            r3 = r0
            if (r9 < 0) goto L1e
            int r10 = r10 - r3
            if (r9 > r10) goto L1e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zzg(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L1e:
            com.google.android.gms.internal.auth.zzfb r6 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r6
    }

    static long zzn(byte[] r18, int r19) {
            r0 = r18[r19]
            long r0 = (long) r0
            int r2 = r19 + 1
            r2 = r18[r2]
            long r2 = (long) r2
            int r4 = r19 + 2
            r4 = r18[r4]
            long r4 = (long) r4
            int r6 = r19 + 3
            r6 = r18[r6]
            long r6 = (long) r6
            int r8 = r19 + 4
            r8 = r18[r8]
            long r8 = (long) r8
            int r10 = r19 + 5
            r10 = r18[r10]
            long r10 = (long) r10
            int r12 = r19 + 6
            r12 = r18[r12]
            long r12 = (long) r12
            int r14 = r19 + 7
            r14 = r18[r14]
            long r14 = (long) r14
            r16 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r16
            long r4 = r4 & r16
            long r6 = r6 & r16
            long r8 = r8 & r16
            long r10 = r10 & r16
            long r12 = r12 & r16
            long r14 = r14 & r16
            long r0 = r0 & r16
            r16 = 8
            long r2 = r2 << r16
            long r0 = r0 | r2
            r2 = 16
            long r2 = r4 << r2
            long r0 = r0 | r2
            r2 = 24
            long r2 = r6 << r2
            long r0 = r0 | r2
            r2 = 32
            long r2 = r8 << r2
            long r0 = r0 | r2
            r2 = 40
            long r2 = r10 << r2
            long r0 = r0 | r2
            r2 = 48
            long r2 = r12 << r2
            long r0 = r0 | r2
            r2 = 56
            long r2 = r14 << r2
            long r0 = r0 | r2
            return r0
    }
}
