package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzga<T> implements com.google.android.gms.internal.auth.zzgi<T> {
    private static final int[] zza = null;
    private static final sun.misc.Unsafe zzb = null;
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.auth.zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final com.google.android.gms.internal.auth.zzfl zzk;
    private final com.google.android.gms.internal.auth.zzgz zzl;
    private final com.google.android.gms.internal.auth.zzem zzm;
    private final com.google.android.gms.internal.auth.zzgc zzn;
    private final com.google.android.gms.internal.auth.zzfs zzo;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            com.google.android.gms.internal.auth.zzga.zza = r0
            sun.misc.Unsafe r0 = com.google.android.gms.internal.auth.zzhj.zzg()
            com.google.android.gms.internal.auth.zzga.zzb = r0
            return
    }

    private zzga(int[] r1, java.lang.Object[] r2, int r3, int r4, com.google.android.gms.internal.auth.zzfx r5, int r6, boolean r7, int[] r8, int r9, int r10, com.google.android.gms.internal.auth.zzgc r11, com.google.android.gms.internal.auth.zzfl r12, com.google.android.gms.internal.auth.zzgz r13, com.google.android.gms.internal.auth.zzem r14, com.google.android.gms.internal.auth.zzfs r15) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zze = r3
            r0.zzf = r4
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzn = r11
            r0.zzk = r12
            r0.zzl = r13
            r0.zzm = r14
            r0.zzg = r5
            r0.zzo = r15
            return
    }

    private final void zzA(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.zzl(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            com.google.android.gms.internal.auth.zzhj.zzn(r3, r0, r4)
            return
    }

    private final void zzB(java.lang.Object r4, int r5, java.lang.Object r6) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.android.gms.internal.auth.zzga.zzb
            int r1 = r3.zzo(r5)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            r0.putObject(r4, r1, r6)
            r3.zzz(r4, r5)
            return
    }

    private final void zzC(java.lang.Object r4, int r5, int r6, java.lang.Object r7) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.android.gms.internal.auth.zzga.zzb
            int r1 = r3.zzo(r6)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            r0.putObject(r4, r1, r7)
            r3.zzA(r4, r5, r6)
            return
    }

    private final boolean zzD(java.lang.Object r1, java.lang.Object r2, int r3) {
            r0 = this;
            boolean r1 = r0.zzE(r1, r3)
            boolean r2 = r0.zzE(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private final boolean zzE(java.lang.Object r10, int r11) {
            r9 = this;
            int r0 = r9.zzl(r11)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0 & r1
            long r2 = (long) r2
            r4 = 0
            r5 = 1
            r6 = 1048575(0xfffff, double:5.18065E-318)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto Lee
            int r11 = r9.zzo(r11)
            r0 = r11 & r1
            int r11 = zzn(r11)
            long r0 = (long) r0
            r2 = 0
            switch(r11) {
                case 0: goto Le0;
                case 1: goto Ld4;
                case 2: goto Lca;
                case 3: goto Lc0;
                case 4: goto Lb8;
                case 5: goto Lae;
                case 6: goto La6;
                case 7: goto La1;
                case 8: goto L7b;
                case 9: goto L73;
                case 10: goto L65;
                case 11: goto L5d;
                case 12: goto L55;
                case 13: goto L4d;
                case 14: goto L43;
                case 15: goto L3b;
                case 16: goto L31;
                case 17: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L29:
            java.lang.Object r10 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r0)
            if (r10 == 0) goto L30
            return r5
        L30:
            return r4
        L31:
            long r10 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            int r10 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r0)
            if (r10 == 0) goto L42
            return r5
        L42:
            return r4
        L43:
            long r10 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L4c
            return r5
        L4c:
            return r4
        L4d:
            int r10 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r0)
            if (r10 == 0) goto L54
            return r5
        L54:
            return r4
        L55:
            int r10 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r0)
            if (r10 == 0) goto L5c
            return r5
        L5c:
            return r4
        L5d:
            int r10 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r0)
            if (r10 == 0) goto L64
            return r5
        L64:
            return r4
        L65:
            com.google.android.gms.internal.auth.zzef r11 = com.google.android.gms.internal.auth.zzef.zzb
            java.lang.Object r10 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r0)
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L72
            return r5
        L72:
            return r4
        L73:
            java.lang.Object r10 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r0)
            if (r10 == 0) goto L7a
            return r5
        L7a:
            return r4
        L7b:
            java.lang.Object r10 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r0)
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L8d
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L8c
            return r5
        L8c:
            return r4
        L8d:
            boolean r11 = r10 instanceof com.google.android.gms.internal.auth.zzef
            if (r11 == 0) goto L9b
            com.google.android.gms.internal.auth.zzef r11 = com.google.android.gms.internal.auth.zzef.zzb
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L9a
            return r5
        L9a:
            return r4
        L9b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        La1:
            boolean r10 = com.google.android.gms.internal.auth.zzhj.zzt(r10, r0)
            return r10
        La6:
            int r10 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r0)
            if (r10 == 0) goto Lad
            return r5
        Lad:
            return r4
        Lae:
            long r10 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb7
            return r5
        Lb7:
            return r4
        Lb8:
            int r10 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r0)
            if (r10 == 0) goto Lbf
            return r5
        Lbf:
            return r4
        Lc0:
            long r10 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc9
            return r5
        Lc9:
            return r4
        Lca:
            long r10 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld3
            return r5
        Ld3:
            return r4
        Ld4:
            float r10 = com.google.android.gms.internal.auth.zzhj.zzb(r10, r0)
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            if (r10 == 0) goto Ldf
            return r5
        Ldf:
            return r4
        Le0:
            double r10 = com.google.android.gms.internal.auth.zzhj.zza(r10, r0)
            long r10 = java.lang.Double.doubleToRawLongBits(r10)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto Led
            return r5
        Led:
            return r4
        Lee:
            int r11 = r0 >>> 20
            int r11 = r5 << r11
            int r10 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r2)
            r10 = r10 & r11
            if (r10 == 0) goto Lfa
            return r5
        Lfa:
            return r4
    }

    private final boolean zzF(java.lang.Object r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r2 = r1.zzE(r2, r3)
            return r2
        La:
            r2 = r5 & r6
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private static boolean zzG(java.lang.Object r2, int r3, com.google.android.gms.internal.auth.zzgi r4) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r0
            long r0 = (long) r3
            java.lang.Object r2 = com.google.android.gms.internal.auth.zzhj.zzf(r2, r0)
            boolean r2 = r4.zzi(r2)
            return r2
    }

    private static boolean zzH(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof com.google.android.gms.internal.auth.zzev
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            boolean r1 = r1.zzm()
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private final boolean zzI(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.zzl(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r3, r0)
            if (r3 != r4) goto L11
            r3 = 1
            return r3
        L11:
            r3 = 0
            return r3
    }

    static com.google.android.gms.internal.auth.zzha zzc(java.lang.Object r2) {
            com.google.android.gms.internal.auth.zzev r2 = (com.google.android.gms.internal.auth.zzev) r2
            com.google.android.gms.internal.auth.zzha r0 = r2.zzc
            com.google.android.gms.internal.auth.zzha r1 = com.google.android.gms.internal.auth.zzha.zza()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.auth.zzha r0 = com.google.android.gms.internal.auth.zzha.zzd()
            r2.zzc = r0
        L10:
            return r0
    }

    static com.google.android.gms.internal.auth.zzga zzj(java.lang.Class r30, com.google.android.gms.internal.auth.zzfu r31, com.google.android.gms.internal.auth.zzgc r32, com.google.android.gms.internal.auth.zzfl r33, com.google.android.gms.internal.auth.zzgz r34, com.google.android.gms.internal.auth.zzem r35, com.google.android.gms.internal.auth.zzfs r36) {
            r0 = r31
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzgh
            if (r1 == 0) goto L3e8
            com.google.android.gms.internal.auth.zzgh r0 = (com.google.android.gms.internal.auth.zzgh) r0
            java.lang.String r1 = r0.zzd()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L25
            r4 = 1
        L1b:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L26
            r4 = r7
            goto L1b
        L25:
            r7 = 1
        L26:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L45
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L32:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L42
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L32
        L42:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L45:
            if (r7 != 0) goto L56
            int[] r7 = com.google.android.gms.internal.auth.zzga.zza
            r17 = r7
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            goto L166
        L56:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L75
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L62:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L72
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L62
        L72:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L75:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L94
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L81:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L91
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L81
        L91:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L94:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto Lb3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        La0:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto Lb0
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto La0
        Lb0:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        Lb3:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto Ld2
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        Lbf:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto Lcf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto Lbf
        Lcf:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        Ld2:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto Lf1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Lde:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto Lee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Lde
        Lee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        Lf1:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        Lfd:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L10d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto Lfd
        L10d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L110:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L11c:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L12d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L11c
        L12d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L131:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L13d:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L14f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L13d
        L14f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int r16 = r4 + r4
            int r16 = r16 + r7
            int[] r7 = new int[r13]
            r17 = r7
            r13 = r9
            r18 = r14
            r7 = r4
            r14 = r10
            r4 = r15
        L166:
            sun.misc.Unsafe r9 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object[] r10 = r0.zze()
            com.google.android.gms.internal.auth.zzfx r15 = r0.zza()
            java.lang.Class r15 = r15.getClass()
            int r19 = r18 + r12
            int r12 = r11 + r11
            int r11 = r11 * 3
            int[] r11 = new int[r11]
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r22 = r18
            r23 = r19
            r20 = 0
            r21 = 0
        L186:
            if (r4 >= r2) goto L3c3
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L1ae
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L196:
            int r25 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L1a8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r25
            goto L196
        L1a8:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r25
            goto L1b0
        L1ae:
            r3 = r24
        L1b0:
            int r24 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L1d6
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = r24
            r24 = 13
        L1be:
            int r25 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L1d0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r24
            r3 = r3 | r8
            int r24 = r24 + 13
            r8 = r25
            goto L1be
        L1d0:
            int r8 = r8 << r24
            r3 = r3 | r8
            r8 = r25
            goto L1d8
        L1d6:
            r8 = r24
        L1d8:
            r6 = r3 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L1e2
            int r6 = r20 + 1
            r17[r20] = r21
            r20 = r6
        L1e2:
            r6 = r3 & 255(0xff, float:3.57E-43)
            r5 = 51
            if (r6 < r5) goto L284
            int r5 = r8 + 1
            char r8 = r1.charAt(r8)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r2) goto L213
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r28 = 13
        L1f9:
            int r29 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r2) goto L20e
            r2 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r28
            r8 = r8 | r2
            int r28 = r28 + 13
            r5 = r29
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L1f9
        L20e:
            int r2 = r5 << r28
            r8 = r8 | r2
            r5 = r29
        L213:
            int r2 = r6 + (-51)
            r28 = r5
            r5 = 9
            if (r2 == r5) goto L23a
            r5 = 17
            if (r2 != r5) goto L220
            goto L23a
        L220:
            r5 = 12
            if (r2 != r5) goto L247
            int r2 = r0.zzc()
            r5 = 1
            if (r2 == r5) goto L22f
            r2 = r3 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L247
        L22f:
            int r2 = r21 / 3
            int r2 = r2 + r2
            int r2 = r2 + r5
            int r5 = r16 + 1
            r16 = r10[r16]
            r12[r2] = r16
            goto L245
        L23a:
            int r2 = r21 / 3
            int r2 = r2 + r2
            r5 = 1
            int r2 = r2 + r5
            int r5 = r16 + 1
            r16 = r10[r16]
            r12[r2] = r16
        L245:
            r16 = r5
        L247:
            int r8 = r8 + r8
            r2 = r10[r8]
            boolean r5 = r2 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L251
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            goto L259
        L251:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = zzv(r15, r2)
            r10[r8] = r2
        L259:
            r5 = r13
            r29 = r14
            long r13 = r9.objectFieldOffset(r2)
            int r2 = (int) r13
            int r8 = r8 + 1
            r13 = r10[r8]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L26c
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L274
        L26c:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zzv(r15, r13)
            r10[r8] = r13
        L274:
            long r13 = r9.objectFieldOffset(r13)
            int r8 = (int) r13
            r27 = r5
            r24 = r8
            r25 = r28
            r8 = 0
            r28 = r1
            goto L385
        L284:
            r26 = r2
            r5 = r13
            r29 = r14
            int r2 = r16 + 1
            r13 = r10[r16]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zzv(r15, r13)
            r14 = 9
            if (r6 == r14) goto L306
            r14 = 17
            if (r6 != r14) goto L29d
            goto L306
        L29d:
            r14 = 27
            if (r6 == r14) goto L2f6
            r14 = 49
            if (r6 != r14) goto L2a6
            goto L2f6
        L2a6:
            r14 = 12
            if (r6 == r14) goto L2de
            r14 = 30
            if (r6 == r14) goto L2de
            r14 = 44
            if (r6 != r14) goto L2b3
            goto L2de
        L2b3:
            r14 = 50
            if (r6 != r14) goto L2da
            int r14 = r22 + 1
            r17[r22] = r21
            int r22 = r21 / 3
            int r27 = r2 + 1
            r2 = r10[r2]
            int r22 = r22 + r22
            r12[r22] = r2
            r2 = r3 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L2d6
            int r22 = r22 + 1
            int r2 = r27 + 1
            r27 = r10[r27]
            r12[r22] = r27
            r27 = r5
            r22 = r14
            goto L2dc
        L2d6:
            r22 = r14
            r2 = r27
        L2da:
            r27 = r5
        L2dc:
            r5 = 1
            goto L313
        L2de:
            int r14 = r0.zzc()
            r27 = r5
            r5 = 1
            if (r14 == r5) goto L2eb
            r14 = r3 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L313
        L2eb:
            int r14 = r21 / 3
            int r14 = r14 + r14
            int r14 = r14 + r5
            int r24 = r2 + 1
            r2 = r10[r2]
            r12[r14] = r2
            goto L303
        L2f6:
            r27 = r5
            r5 = 1
            int r14 = r21 / 3
            int r14 = r14 + r14
            int r14 = r14 + r5
            int r24 = r2 + 1
            r2 = r10[r2]
            r12[r14] = r2
        L303:
            r2 = r24
            goto L313
        L306:
            r27 = r5
            r5 = 1
            int r14 = r21 / 3
            int r14 = r14 + r14
            int r14 = r14 + r5
            java.lang.Class r24 = r13.getType()
            r12[r14] = r24
        L313:
            long r13 = r9.objectFieldOffset(r13)
            int r14 = (int) r13
            r13 = r3 & 4096(0x1000, float:5.74E-42)
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == 0) goto L36e
            r13 = 17
            if (r6 > r13) goto L36e
            int r13 = r8 + 1
            char r8 = r1.charAt(r8)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r5) goto L348
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L332:
            int r25 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L344
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r24
            r8 = r8 | r13
            int r24 = r24 + 13
            r13 = r25
            goto L332
        L344:
            int r13 = r13 << r24
            r8 = r8 | r13
            goto L34a
        L348:
            r25 = r13
        L34a:
            int r13 = r7 + r7
            int r24 = r8 / 32
            int r13 = r13 + r24
            r5 = r10[r13]
            r28 = r1
            boolean r1 = r5 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L35b
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L363
        L35b:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = zzv(r15, r5)
            r10[r13] = r5
        L363:
            r13 = r2
            long r1 = r9.objectFieldOffset(r5)
            int r2 = (int) r1
            int r8 = r8 % 32
            r24 = r2
            goto L374
        L36e:
            r28 = r1
            r13 = r2
            r25 = r8
            r8 = 0
        L374:
            r1 = 18
            if (r6 < r1) goto L382
            r1 = 49
            if (r6 > r1) goto L382
            int r1 = r23 + 1
            r17[r23] = r14
            r23 = r1
        L382:
            r16 = r13
            r2 = r14
        L385:
            int r1 = r21 + 1
            r11[r21] = r4
            int r4 = r1 + 1
            r5 = r3 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L392
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L393
        L392:
            r5 = 0
        L393:
            r13 = r3 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L39a
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            goto L39b
        L39a:
            r13 = 0
        L39b:
            r3 = r3 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L3a2
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3a3
        L3a2:
            r3 = 0
        L3a3:
            int r6 = r6 << 20
            r5 = r5 | r13
            r3 = r3 | r5
            r3 = r3 | r6
            r2 = r2 | r3
            r11[r1] = r2
            int r21 = r4 + 1
            int r1 = r8 << 20
            r1 = r1 | r24
            r11[r4] = r1
            r4 = r25
            r2 = r26
            r13 = r27
            r1 = r28
            r14 = r29
            r3 = 0
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L186
        L3c3:
            r27 = r13
            r29 = r14
            com.google.android.gms.internal.auth.zzga r1 = new com.google.android.gms.internal.auth.zzga
            com.google.android.gms.internal.auth.zzfx r14 = r0.zza()
            int r15 = r0.zzc()
            r16 = 0
            r9 = r1
            r10 = r11
            r11 = r12
            r12 = r27
            r13 = r29
            r20 = r32
            r21 = r33
            r22 = r34
            r23 = r35
            r24 = r36
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r1
        L3e8:
            com.google.android.gms.internal.auth.zzgw r0 = (com.google.android.gms.internal.auth.zzgw) r0
            r0 = 0
            throw r0
    }

    private static int zzk(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzhj.zzf(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private final int zzl(int r2) {
            r1 = this;
            int[] r0 = r1.zzc
            int r2 = r2 + 2
            r2 = r0[r2]
            return r2
    }

    private final int zzm(int r6, int r7) {
            r5 = this;
            int[] r0 = r5.zzc
            int r0 = r0.length
            int r0 = r0 / 3
            r1 = -1
            int r0 = r0 + r1
        L7:
            if (r7 > r0) goto L1e
            int r2 = r0 + r7
            int r2 = r2 >>> 1
            int r3 = r2 * 3
            int[] r4 = r5.zzc
            r4 = r4[r3]
            if (r6 != r4) goto L16
            return r3
        L16:
            if (r6 >= r4) goto L1b
            int r0 = r2 + (-1)
            goto L7
        L1b:
            int r7 = r2 + 1
            goto L7
        L1e:
            return r1
    }

    private static int zzn(int r0) {
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    private final int zzo(int r2) {
            r1 = this;
            int[] r0 = r1.zzc
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    private static long zzp(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzhj.zzf(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    private final com.google.android.gms.internal.auth.zzey zzq(int r2) {
            r1 = this;
            int r2 = r2 / 3
            int r2 = r2 + r2
            java.lang.Object[] r0 = r1.zzd
            int r2 = r2 + 1
            r2 = r0[r2]
            com.google.android.gms.internal.auth.zzey r2 = (com.google.android.gms.internal.auth.zzey) r2
            return r2
    }

    private final com.google.android.gms.internal.auth.zzgi zzr(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.zzd
            int r4 = r4 / 3
            int r4 = r4 + r4
            r0 = r0[r4]
            com.google.android.gms.internal.auth.zzgi r0 = (com.google.android.gms.internal.auth.zzgi) r0
            if (r0 == 0) goto Lc
            return r0
        Lc:
            com.google.android.gms.internal.auth.zzgf r0 = com.google.android.gms.internal.auth.zzgf.zza()
            java.lang.Object[] r1 = r3.zzd
            int r2 = r4 + 1
            r1 = r1[r2]
            java.lang.Class r1 = (java.lang.Class) r1
            com.google.android.gms.internal.auth.zzgi r0 = r0.zzb(r1)
            java.lang.Object[] r1 = r3.zzd
            r1[r4] = r0
            return r0
    }

    private final java.lang.Object zzs(int r2) {
            r1 = this;
            int r2 = r2 / 3
            java.lang.Object[] r0 = r1.zzd
            int r2 = r2 + r2
            r2 = r0[r2]
            return r2
    }

    private final java.lang.Object zzt(java.lang.Object r4, int r5) {
            r3 = this;
            com.google.android.gms.internal.auth.zzgi r0 = r3.zzr(r5)
            int r1 = r3.zzo(r5)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            boolean r5 = r3.zzE(r4, r5)
            if (r5 != 0) goto L17
            java.lang.Object r4 = r0.zzd()
            return r4
        L17:
            long r1 = (long) r1
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = zzH(r4)
            if (r5 == 0) goto L25
            return r4
        L25:
            java.lang.Object r5 = r0.zzd()
            if (r4 == 0) goto L2e
            r0.zzf(r5, r4)
        L2e:
            return r5
    }

    private final java.lang.Object zzu(java.lang.Object r4, int r5, int r6) {
            r3 = this;
            com.google.android.gms.internal.auth.zzgi r0 = r3.zzr(r6)
            boolean r5 = r3.zzI(r4, r5, r6)
            if (r5 != 0) goto Lf
            java.lang.Object r4 = r0.zzd()
            return r4
        Lf:
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            int r6 = r3.zzo(r6)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r1
            long r1 = (long) r6
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = zzH(r4)
            if (r5 == 0) goto L25
            return r4
        L25:
            java.lang.Object r5 = r0.zzd()
            if (r4 == 0) goto L2e
            r0.zzf(r5, r4)
        L2e:
            return r5
    }

    private static java.lang.reflect.Field zzv(java.lang.Class r5, java.lang.String r6) {
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L5
            return r5
        L5:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Field "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " for "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = " not found. Known fields are "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    private static void zzw(java.lang.Object r2) {
            boolean r0 = zzH(r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Mutating immutable message: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }

    private final void zzx(java.lang.Object r6, java.lang.Object r7, int r8) {
            r5 = this;
            boolean r0 = r5.zzE(r7, r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r5.zzo(r8)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            sun.misc.Unsafe r1 = com.google.android.gms.internal.auth.zzga.zzb
            long r2 = (long) r0
            java.lang.Object r0 = r1.getObject(r7, r2)
            if (r0 == 0) goto L53
            com.google.android.gms.internal.auth.zzgi r7 = r5.zzr(r8)
            boolean r4 = r5.zzE(r6, r8)
            if (r4 != 0) goto L3a
            boolean r4 = zzH(r0)
            if (r4 != 0) goto L2c
            r1.putObject(r6, r2, r0)
            goto L36
        L2c:
            java.lang.Object r4 = r7.zzd()
            r7.zzf(r4, r0)
            r1.putObject(r6, r2, r4)
        L36:
            r5.zzz(r6, r8)
            return
        L3a:
            java.lang.Object r8 = r1.getObject(r6, r2)
            boolean r4 = zzH(r8)
            if (r4 != 0) goto L4f
            java.lang.Object r4 = r7.zzd()
            r7.zzf(r4, r8)
            r1.putObject(r6, r2, r4)
            r8 = r4
        L4f:
            r7.zzf(r8, r0)
            return
        L53:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            int[] r0 = r5.zzc
            r8 = r0[r8]
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Source subfield "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = " is present but null: "
            r0.append(r8)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    private final void zzy(java.lang.Object r7, java.lang.Object r8, int r9) {
            r6 = this;
            int[] r0 = r6.zzc
            r0 = r0[r9]
            boolean r1 = r6.zzI(r8, r0, r9)
            if (r1 != 0) goto Lb
            return
        Lb:
            int r1 = r6.zzo(r9)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            sun.misc.Unsafe r2 = com.google.android.gms.internal.auth.zzga.zzb
            long r3 = (long) r1
            java.lang.Object r1 = r2.getObject(r8, r3)
            if (r1 == 0) goto L57
            com.google.android.gms.internal.auth.zzgi r8 = r6.zzr(r9)
            boolean r5 = r6.zzI(r7, r0, r9)
            if (r5 != 0) goto L3e
            boolean r5 = zzH(r1)
            if (r5 != 0) goto L30
            r2.putObject(r7, r3, r1)
            goto L3a
        L30:
            java.lang.Object r5 = r8.zzd()
            r8.zzf(r5, r1)
            r2.putObject(r7, r3, r5)
        L3a:
            r6.zzA(r7, r0, r9)
            return
        L3e:
            java.lang.Object r9 = r2.getObject(r7, r3)
            boolean r0 = zzH(r9)
            if (r0 != 0) goto L53
            java.lang.Object r0 = r8.zzd()
            r8.zzf(r0, r9)
            r2.putObject(r7, r3, r0)
            r9 = r0
        L53:
            r8.zzf(r9, r1)
            return
        L57:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            int[] r0 = r6.zzc
            r9 = r0[r9]
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Source subfield "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is present but null: "
            r0.append(r9)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
    }

    private final void zzz(java.lang.Object r6, int r7) {
            r5 = this;
            int r7 = r5.zzl(r7)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r0 = (long) r0
            r2 = 1048575(0xfffff, double:5.18065E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            return
        L11:
            int r7 = r7 >>> 20
            int r2 = com.google.android.gms.internal.auth.zzhj.zzc(r6, r0)
            r3 = 1
            int r7 = r3 << r7
            r7 = r7 | r2
            com.google.android.gms.internal.auth.zzhj.zzn(r6, r0, r7)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(java.lang.Object r10) {
            r9 = this;
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r1 >= r0) goto L22a
            int r3 = r9.zzo(r1)
            int[] r4 = r9.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = zzn(r3)
            long r5 = (long) r5
            r7 = 37
            r8 = 32
            switch(r3) {
                case 0: goto L215;
                case 1: goto L209;
                case 2: goto L200;
                case 3: goto L1f7;
                case 4: goto L1f0;
                case 5: goto L1e7;
                case 6: goto L1e0;
                case 7: goto L1d5;
                case 8: goto L1c8;
                case 9: goto L1ba;
                case 10: goto L1af;
                case 11: goto L1a8;
                case 12: goto L1a0;
                case 13: goto L198;
                case 14: goto L18e;
                case 15: goto L186;
                case 16: goto L17c;
                case 17: goto L171;
                case 18: goto L165;
                case 19: goto L165;
                case 20: goto L165;
                case 21: goto L165;
                case 22: goto L165;
                case 23: goto L165;
                case 24: goto L165;
                case 25: goto L165;
                case 26: goto L165;
                case 27: goto L165;
                case 28: goto L165;
                case 29: goto L165;
                case 30: goto L165;
                case 31: goto L165;
                case 32: goto L165;
                case 33: goto L165;
                case 34: goto L165;
                case 35: goto L165;
                case 36: goto L165;
                case 37: goto L165;
                case 38: goto L165;
                case 39: goto L165;
                case 40: goto L165;
                case 41: goto L165;
                case 42: goto L165;
                case 43: goto L165;
                case 44: goto L165;
                case 45: goto L165;
                case 46: goto L165;
                case 47: goto L165;
                case 48: goto L165;
                case 49: goto L165;
                case 50: goto L159;
                case 51: goto L13f;
                case 52: goto L127;
                case 53: goto L117;
                case 54: goto L107;
                case 55: goto Lf9;
                case 56: goto Le9;
                case 57: goto Ldb;
                case 58: goto Lc3;
                case 59: goto Laf;
                case 60: goto L9d;
                case 61: goto L8b;
                case 62: goto L7d;
                case 63: goto L6f;
                case 64: goto L61;
                case 65: goto L51;
                case 66: goto L43;
                case 67: goto L33;
                case 68: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L226
        L21:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L213
        L33:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L43:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L213
        L51:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L61:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L213
        L6f:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L213
        L7d:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L213
        L8b:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L213
        L9d:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L213
        Laf:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L213
        Lc3:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            int r3 = com.google.android.gms.internal.auth.zzfa.zza(r3)
            goto L213
        Ldb:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L213
        Le9:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        Lf9:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L213
        L107:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L117:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L127:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L213
        L13f:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L159:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L213
        L165:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L213
        L171:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            if (r3 == 0) goto L1c4
            int r7 = r3.hashCode()
            goto L1c4
        L17c:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L186:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L213
        L18e:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L198:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L213
        L1a0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L213
        L1a8:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L213
        L1af:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L213
        L1ba:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            if (r3 == 0) goto L1c4
            int r7 = r3.hashCode()
        L1c4:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L226
        L1c8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L213
        L1d5:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.auth.zzhj.zzt(r10, r5)
            int r3 = com.google.android.gms.internal.auth.zzfa.zza(r3)
            goto L213
        L1e0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L213
        L1e7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L1f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L213
        L1f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L200:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L221
        L209:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.auth.zzhj.zzb(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
        L213:
            int r2 = r2 + r3
            goto L226
        L215:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.auth.zzhj.zza(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
        L221:
            long r5 = r3 >>> r8
            long r3 = r3 ^ r5
            int r4 = (int) r3
            int r2 = r2 + r4
        L226:
            int r1 = r1 + 3
            goto L5
        L22a:
            int r2 = r2 * 53
            com.google.android.gms.internal.auth.zzgz r0 = r9.zzl
            java.lang.Object r10 = r0.zzb(r10)
            int r10 = r10.hashCode()
            int r2 = r2 + r10
            return r2
    }

    final int zzb(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.auth.zzdt r42) throws java.io.IOException {
            r36 = this;
            r0 = r36
            r7 = r37
            r15 = r38
            r14 = r40
            r13 = r41
            r12 = r42
            zzw(r37)
            sun.misc.Unsafe r11 = com.google.android.gms.internal.auth.zzga.zzb
            r8 = 0
            r1 = r39
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L1b:
            r16 = 0
            if (r1 >= r14) goto Lcbf
            int r4 = r1 + 1
            r1 = r15[r1]
            if (r1 >= 0) goto L2c
            int r1 = com.google.android.gms.internal.auth.zzdu.zzi(r1, r15, r4, r12)
            int r4 = r12.zza
            goto L31
        L2c:
            r34 = r4
            r4 = r1
            r1 = r34
        L31:
            int r9 = r4 >>> 3
            r10 = 3
            if (r9 <= r2) goto L46
            int r3 = r3 / r10
            int r2 = r0.zze
            if (r9 < r2) goto L44
            int r2 = r0.zzf
            if (r9 > r2) goto L44
            int r2 = r0.zzm(r9, r3)
            goto L52
        L44:
            r2 = -1
            goto L52
        L46:
            int r2 = r0.zze
            if (r9 < r2) goto L55
            int r2 = r0.zzf
            if (r9 > r2) goto L55
            int r2 = r0.zzm(r9, r8)
        L52:
            r3 = r2
            r2 = -1
            goto L57
        L55:
            r2 = -1
            r3 = -1
        L57:
            if (r3 != r2) goto L6c
            r3 = r1
            r17 = r5
            r25 = r6
            r21 = r11
            r8 = r13
            r6 = r14
            r18 = -1
            r19 = 0
            r13 = r9
            r14 = r12
            r12 = 0
            r9 = r4
            goto Lc90
        L6c:
            r2 = r4 & 7
            int[] r10 = r0.zzc
            int r19 = r3 + 1
            r8 = r10[r19]
            r19 = r4
            int r4 = zzn(r8)
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r8 & r17
            long r13 = (long) r13
            r21 = r9
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            r23 = 0
            java.lang.String r9 = ""
            r26 = r9
            r9 = 17
            if (r4 > r9) goto L3bd
            int r9 = r3 + 2
            r9 = r10[r9]
            int r10 = r9 >>> 20
            r25 = 1
            int r27 = r25 << r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r10
            r28 = r13
            if (r9 == r6) goto Lb4
            if (r6 == r10) goto La6
            long r13 = (long) r6
            r11.putInt(r7, r13, r5)
        La6:
            if (r9 != r10) goto Laa
            r5 = 0
            goto Laf
        Laa:
            long r5 = (long) r9
            int r5 = r11.getInt(r7, r5)
        Laf:
            r17 = r5
            r25 = r9
            goto Lb8
        Lb4:
            r17 = r5
            r25 = r6
        Lb8:
            switch(r4) {
                case 0: goto L37c;
                case 1: goto L363;
                case 2: goto L346;
                case 3: goto L346;
                case 4: goto L332;
                case 5: goto L311;
                case 6: goto L2fb;
                case 7: goto L2df;
                case 8: goto L1c1;
                case 9: goto L190;
                case 10: goto L17d;
                case 11: goto L332;
                case 12: goto L146;
                case 13: goto L2fb;
                case 14: goto L311;
                case 15: goto L12f;
                case 16: goto L106;
                default: goto Lbb;
            }
        Lbb:
            r10 = r1
            r14 = r3
            r9 = r19
            r1 = 3
            r8 = 0
            r13 = -1
            if (r2 != r1) goto L3a2
            java.lang.Object r1 = r0.zzt(r7, r14)
            int r2 = r21 << 3
            r2 = r2 | 4
            com.google.android.gms.internal.auth.zzgi r3 = r0.zzr(r14)
            r19 = 0
            r8 = r1
            r5 = r9
            r4 = r21
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r3
            r13 = r10
            r18 = -1
            r10 = r38
            r3 = r11
            r11 = r13
            r13 = r12
            r12 = r40
            r6 = r13
            r13 = r2
            r2 = r40
            r20 = r5
            r5 = r14
            r14 = r42
            int r8 = com.google.android.gms.internal.auth.zzdu.zzl(r8, r9, r10, r11, r12, r13, r14)
            r0.zzB(r7, r5, r1)
            r1 = r17 | r27
            r13 = r41
            r14 = r2
            r11 = r3
            r2 = r4
            r3 = r5
            r12 = r6
            r4 = r20
            r6 = r25
            r5 = r1
            r1 = r8
            r8 = 0
            goto L1b
        L106:
            if (r2 != 0) goto L125
            int r8 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r1, r12)
            long r1 = r12.zzb
            long r5 = com.google.android.gms.internal.auth.zzej.zzc(r1)
            r1 = r11
            r13 = -1
            r2 = r37
            r14 = r3
            r9 = r19
            r3 = r28
            r1.putLong(r2, r3, r5)
            r5 = r17 | r27
            r13 = r41
            r1 = r8
            goto L1b3
        L125:
            r2 = r40
            r13 = r1
            r5 = r3
            r3 = r11
            r6 = r12
            r20 = r19
            goto L3aa
        L12f:
            r14 = r3
            r9 = r19
            r13 = -1
            if (r2 != 0) goto L1bc
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r1, r12)
            int r2 = r12.zza
            int r2 = com.google.android.gms.internal.auth.zzej.zzb(r2)
            r3 = r28
            r11.putInt(r7, r3, r2)
            goto L1af
        L146:
            r14 = r3
            r9 = r19
            r3 = r28
            r13 = -1
            if (r2 != 0) goto L1bc
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r1, r12)
            int r2 = r12.zza
            com.google.android.gms.internal.auth.zzey r5 = r0.zzq(r14)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 & r8
            if (r6 == 0) goto L179
            if (r5 == 0) goto L179
            boolean r5 = r5.zza()
            if (r5 == 0) goto L166
            goto L179
        L166:
            com.google.android.gms.internal.auth.zzha r3 = zzc(r37)
            long r4 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3.zzh(r9, r2)
            r13 = r41
            r4 = r9
            r3 = r14
            r5 = r17
            goto L1b5
        L179:
            r11.putInt(r7, r3, r2)
            goto L1af
        L17d:
            r14 = r3
            r9 = r19
            r3 = r28
            r5 = 2
            r13 = -1
            if (r2 != r5) goto L1bc
            int r1 = com.google.android.gms.internal.auth.zzdu.zza(r15, r1, r12)
            java.lang.Object r2 = r12.zzc
            r11.putObject(r7, r3, r2)
            goto L1af
        L190:
            r14 = r3
            r9 = r19
            r5 = 2
            r13 = -1
            if (r2 != r5) goto L1bc
            java.lang.Object r8 = r0.zzt(r7, r14)
            com.google.android.gms.internal.auth.zzgi r2 = r0.zzr(r14)
            r5 = r1
            r1 = r8
            r3 = r38
            r4 = r5
            r5 = r40
            r6 = r42
            int r1 = com.google.android.gms.internal.auth.zzdu.zzm(r1, r2, r3, r4, r5, r6)
            r0.zzB(r7, r14, r8)
        L1af:
            r5 = r17 | r27
            r13 = r41
        L1b3:
            r4 = r9
            r3 = r14
        L1b5:
            r2 = r21
            r6 = r25
            r8 = 0
            goto L39e
        L1bc:
            r2 = r40
            r13 = r1
            goto L32e
        L1c1:
            r5 = r1
            r14 = r3
            r9 = r19
            r3 = r28
            r1 = 2
            r13 = -1
            if (r2 != r1) goto L32b
            r1 = r8 & r22
            if (r1 == 0) goto L2b9
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r5, r12)
            int r2 = r12.zza
            if (r2 < 0) goto L2b4
            if (r2 != 0) goto L1e0
            r6 = r26
            r12.zzc = r6
            r8 = 0
            goto L2d3
        L1e0:
            int r5 = com.google.android.gms.internal.auth.zzhn.zza
            int r5 = r15.length
            int r6 = r5 - r1
            r8 = r1 | r2
            int r6 = r6 - r2
            r6 = r6 | r8
            if (r6 < 0) goto L290
            int r5 = r1 + r2
            char[] r2 = new char[r2]
            r6 = 0
        L1f0:
            if (r1 >= r5) goto L204
            r8 = r15[r1]
            boolean r16 = com.google.android.gms.internal.auth.zzhk.zzd(r8)
            if (r16 == 0) goto L204
            int r1 = r1 + 1
            int r16 = r6 + 1
            char r8 = (char) r8
            r2[r6] = r8
            r6 = r16
            goto L1f0
        L204:
            if (r1 >= r5) goto L286
            int r8 = r1 + 1
            r1 = r15[r1]
            boolean r16 = com.google.android.gms.internal.auth.zzhk.zzd(r1)
            if (r16 == 0) goto L22a
            int r16 = r6 + 1
            char r1 = (char) r1
            r2[r6] = r1
            r1 = r8
        L216:
            r6 = r16
            if (r1 >= r5) goto L204
            r8 = r15[r1]
            boolean r16 = com.google.android.gms.internal.auth.zzhk.zzd(r8)
            if (r16 == 0) goto L204
            int r1 = r1 + 1
            int r16 = r6 + 1
            char r8 = (char) r8
            r2[r6] = r8
            goto L216
        L22a:
            r10 = -32
            if (r1 >= r10) goto L245
            if (r8 >= r5) goto L240
            int r10 = r8 + 1
            r8 = r15[r8]
            int r16 = r6 + 1
            com.google.android.gms.internal.auth.zzhk.zzc(r1, r8, r2, r6)
            r1 = r10
            r6 = r16
        L23c:
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L204
        L240:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L245:
            r10 = -16
            if (r1 >= r10) goto L264
            int r10 = r5 + (-1)
            if (r8 >= r10) goto L25f
            int r10 = r8 + 1
            r8 = r15[r8]
            int r16 = r10 + 1
            r10 = r15[r10]
            int r19 = r6 + 1
            com.google.android.gms.internal.auth.zzhk.zzb(r1, r8, r10, r2, r6)
            r1 = r16
            r6 = r19
            goto L23c
        L25f:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L264:
            int r10 = r5 + (-2)
            if (r8 >= r10) goto L281
            int r10 = r8 + 1
            r29 = r15[r8]
            int r8 = r10 + 1
            r30 = r15[r10]
            int r10 = r8 + 1
            r31 = r15[r8]
            r28 = r1
            r32 = r2
            r33 = r6
            com.google.android.gms.internal.auth.zzhk.zza(r28, r29, r30, r31, r32, r33)
            int r6 = r6 + 2
            r1 = r10
            goto L23c
        L281:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L286:
            java.lang.String r1 = new java.lang.String
            r8 = 0
            r1.<init>(r2, r8, r6)
            r12.zzc = r1
            r1 = r5
            goto L2d3
        L290:
            r8 = 0
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r8] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 1
            r4[r5] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r2 = 2
            r4[r2] = r1
            java.lang.String r1 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r3.<init>(r1)
            throw r3
        L2b4:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L2b9:
            r6 = r26
            r8 = 0
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r5, r12)
            int r2 = r12.zza
            if (r2 < 0) goto L2da
            if (r2 != 0) goto L2c9
            r12.zzc = r6
            goto L2d3
        L2c9:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.auth.zzfa.zzb
            r5.<init>(r15, r1, r2, r6)
            r12.zzc = r5
            int r1 = r1 + r2
        L2d3:
            java.lang.Object r2 = r12.zzc
            r11.putObject(r7, r3, r2)
            goto L394
        L2da:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L2df:
            r5 = r1
            r14 = r3
            r9 = r19
            r3 = r28
            r8 = 0
            r13 = -1
            if (r2 != 0) goto L32b
            int r1 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r5, r12)
            long r5 = r12.zzb
            int r2 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r2 == 0) goto L2f5
            r2 = 1
            goto L2f6
        L2f5:
            r2 = 0
        L2f6:
            com.google.android.gms.internal.auth.zzhj.zzk(r7, r3, r2)
            goto L394
        L2fb:
            r5 = r1
            r14 = r3
            r9 = r19
            r3 = r28
            r1 = 5
            r8 = 0
            r13 = -1
            if (r2 != r1) goto L32b
            int r1 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r5)
            r11.putInt(r7, r3, r1)
            int r1 = r5 + 4
            goto L394
        L311:
            r5 = r1
            r14 = r3
            r9 = r19
            r3 = r28
            r1 = 1
            r8 = 0
            r13 = -1
            if (r2 != r1) goto L32b
            long r19 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r5)
            r1 = r11
            r2 = r37
            r10 = r5
            r5 = r19
            r1.putLong(r2, r3, r5)
            goto L392
        L32b:
            r2 = r40
            r13 = r5
        L32e:
            r20 = r9
            goto L3a7
        L332:
            r10 = r1
            r14 = r3
            r9 = r19
            r3 = r28
            r8 = 0
            r13 = -1
            if (r2 != 0) goto L3a2
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r10, r12)
            int r2 = r12.zza
            r11.putInt(r7, r3, r2)
            goto L394
        L346:
            r10 = r1
            r14 = r3
            r9 = r19
            r3 = r28
            r8 = 0
            r13 = -1
            if (r2 != 0) goto L3a2
            int r10 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r10, r12)
            long r5 = r12.zzb
            r1 = r11
            r2 = r37
            r1.putLong(r2, r3, r5)
            r5 = r17 | r27
            r13 = r41
            r4 = r9
            r1 = r10
            goto L399
        L363:
            r10 = r1
            r14 = r3
            r9 = r19
            r3 = r28
            r1 = 5
            r8 = 0
            r13 = -1
            if (r2 != r1) goto L3a2
            int r1 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r10)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            com.google.android.gms.internal.auth.zzhj.zzm(r7, r3, r1)
            int r1 = r10 + 4
            goto L394
        L37c:
            r10 = r1
            r14 = r3
            r9 = r19
            r3 = r28
            r1 = 1
            r8 = 0
            r13 = -1
            if (r2 != r1) goto L3a2
            long r1 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r10)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            com.google.android.gms.internal.auth.zzhj.zzl(r7, r3, r1)
        L392:
            int r1 = r10 + 8
        L394:
            r5 = r17 | r27
            r13 = r41
            r4 = r9
        L399:
            r3 = r14
            r2 = r21
            r6 = r25
        L39e:
            r14 = r40
            goto L1b
        L3a2:
            r2 = r40
            r20 = r9
            r13 = r10
        L3a7:
            r3 = r11
            r6 = r12
            r5 = r14
        L3aa:
            r4 = r21
            r18 = -1
            r19 = 0
            r8 = r41
            r21 = r3
            r12 = r5
            r14 = r6
            r3 = r13
            r9 = r20
            r6 = r2
            r13 = r4
            goto Lc90
        L3bd:
            r17 = r5
            r25 = r6
            r20 = r10
            r6 = r12
            r9 = r26
            r18 = -1
            r5 = r3
            r3 = r11
            r11 = r13
            r14 = r19
            r19 = 0
            r13 = r1
            r1 = r40
            r10 = 27
            r26 = 10
            if (r4 != r10) goto L430
            r10 = 2
            if (r2 != r10) goto L422
            java.lang.Object r2 = r3.getObject(r7, r11)
            com.google.android.gms.internal.auth.zzez r2 = (com.google.android.gms.internal.auth.zzez) r2
            boolean r4 = r2.zzc()
            if (r4 != 0) goto L3fb
            int r4 = r2.size()
            if (r4 != 0) goto L3f0
            r4 = 10
            goto L3f4
        L3f0:
            int r26 = r4 + r4
            r4 = r26
        L3f4:
            com.google.android.gms.internal.auth.zzez r2 = r2.zzd(r4)
            r3.putObject(r7, r11, r2)
        L3fb:
            com.google.android.gms.internal.auth.zzgi r8 = r0.zzr(r5)
            r9 = r14
            r10 = r38
            r11 = r13
            r4 = r21
            r12 = r40
            r13 = r2
            r2 = r14
            r14 = r42
            int r8 = com.google.android.gms.internal.auth.zzdu.zze(r8, r9, r10, r11, r12, r13, r14)
            r13 = r41
            r14 = r1
            r11 = r3
            r3 = r5
            r12 = r6
            r1 = r8
            r5 = r17
            r6 = r25
            r8 = 0
            r34 = r4
            r4 = r2
            r2 = r34
            goto L1b
        L422:
            r9 = r21
            r34 = r13
            r13 = r1
            r1 = r34
            r35 = r5
            r5 = r3
            r3 = r35
            goto L9ef
        L430:
            r10 = r21
            r21 = r3
            r3 = 49
            if (r4 > r3) goto L9b5
            r3 = r9
            long r8 = (long) r8
            r27 = r5
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r20 = r5.getObject(r7, r11)
            r28 = r3
            r3 = r20
            com.google.android.gms.internal.auth.zzez r3 = (com.google.android.gms.internal.auth.zzez) r3
            boolean r20 = r3.zzc()
            if (r20 != 0) goto L467
            int r20 = r3.size()
            if (r20 != 0) goto L459
            r29 = r8
            r8 = 10
            goto L45f
        L459:
            int r26 = r20 + r20
            r29 = r8
            r8 = r26
        L45f:
            com.google.android.gms.internal.auth.zzez r3 = r3.zzd(r8)
            r5.putObject(r7, r11, r3)
            goto L469
        L467:
            r29 = r8
        L469:
            r12 = r3
            switch(r4) {
                case 18: goto L91c;
                case 19: goto L8c2;
                case 20: goto L875;
                case 21: goto L875;
                case 22: goto L848;
                case 23: goto L7fc;
                case 24: goto L7af;
                case 25: goto L74e;
                case 26: goto L687;
                case 27: goto L64f;
                case 28: goto L5e7;
                case 29: goto L848;
                case 30: goto L53c;
                case 31: goto L7af;
                case 32: goto L7fc;
                case 33: goto L4e5;
                case 34: goto L497;
                case 35: goto L91c;
                case 36: goto L8c2;
                case 37: goto L875;
                case 38: goto L875;
                case 39: goto L848;
                case 40: goto L7fc;
                case 41: goto L7af;
                case 42: goto L74e;
                case 43: goto L848;
                case 44: goto L53c;
                case 45: goto L7af;
                case 46: goto L7fc;
                case 47: goto L4e5;
                case 48: goto L497;
                default: goto L46d;
            }
        L46d:
            r11 = r6
            r9 = r10
            r8 = r12
            r7 = r13
            r10 = r21
            r12 = r27
            r13 = r1
            r1 = 3
            if (r2 != r1) goto L995
            com.google.android.gms.internal.auth.zzgi r20 = r0.zzr(r12)
            r1 = r14 & (-8)
            r21 = r1 | 4
            r1 = r20
            r2 = r38
            r3 = r7
            r4 = r40
            r5 = r21
            r6 = r42
            int r1 = com.google.android.gms.internal.auth.zzdu.zzc(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r11.zzc
            r8.add(r2)
            goto L977
        L497:
            r3 = 2
            if (r2 != r3) goto L4bc
            com.google.android.gms.internal.auth.zzfm r12 = (com.google.android.gms.internal.auth.zzfm) r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r13, r6)
            int r3 = r6.zza
            int r3 = r3 + r2
        L4a3:
            if (r2 >= r3) goto L4b3
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r2, r6)
            long r4 = r6.zzb
            long r4 = com.google.android.gms.internal.auth.zzej.zzc(r4)
            r12.zze(r4)
            goto L4a3
        L4b3:
            if (r2 != r3) goto L4b7
            goto L532
        L4b7:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L4bc:
            if (r2 != 0) goto L5dd
            com.google.android.gms.internal.auth.zzfm r12 = (com.google.android.gms.internal.auth.zzfm) r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r13, r6)
            long r3 = r6.zzb
            long r3 = com.google.android.gms.internal.auth.zzej.zzc(r3)
            r12.zze(r3)
        L4cd:
            if (r2 >= r1) goto L532
            int r3 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r6)
            int r4 = r6.zza
            if (r14 != r4) goto L532
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r3, r6)
            long r3 = r6.zzb
            long r3 = com.google.android.gms.internal.auth.zzej.zzc(r3)
            r12.zze(r3)
            goto L4cd
        L4e5:
            r3 = 2
            if (r2 != r3) goto L509
            com.google.android.gms.internal.auth.zzew r12 = (com.google.android.gms.internal.auth.zzew) r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r13, r6)
            int r3 = r6.zza
            int r3 = r3 + r2
        L4f1:
            if (r2 >= r3) goto L501
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r6)
            int r4 = r6.zza
            int r4 = com.google.android.gms.internal.auth.zzej.zzb(r4)
            r12.zze(r4)
            goto L4f1
        L501:
            if (r2 != r3) goto L504
            goto L532
        L504:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L509:
            if (r2 != 0) goto L5dd
            com.google.android.gms.internal.auth.zzew r12 = (com.google.android.gms.internal.auth.zzew) r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r13, r6)
            int r3 = r6.zza
            int r3 = com.google.android.gms.internal.auth.zzej.zzb(r3)
            r12.zze(r3)
        L51a:
            if (r2 >= r1) goto L532
            int r3 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r6)
            int r4 = r6.zza
            if (r14 != r4) goto L532
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r3, r6)
            int r3 = r6.zza
            int r3 = com.google.android.gms.internal.auth.zzej.zzb(r3)
            r12.zze(r3)
            goto L51a
        L532:
            r11 = r6
            r9 = r10
            r7 = r13
            r10 = r21
            r12 = r27
            r13 = r1
            goto L975
        L53c:
            r3 = 2
            if (r2 != r3) goto L548
            int r2 = com.google.android.gms.internal.auth.zzdu.zzf(r15, r13, r12, r6)
            r11 = r1
            r9 = r6
            r8 = r27
            goto L55d
        L548:
            if (r2 != 0) goto L5db
            r11 = r1
            r1 = r14
            r2 = r38
            r9 = r21
            r3 = r13
            r4 = r40
            r8 = r27
            r5 = r12
            r9 = r6
            r6 = r42
            int r2 = com.google.android.gms.internal.auth.zzdu.zzj(r1, r2, r3, r4, r5, r6)
        L55d:
            com.google.android.gms.internal.auth.zzey r1 = r0.zzq(r8)
            com.google.android.gms.internal.auth.zzgz r3 = r0.zzl
            int r4 = com.google.android.gms.internal.auth.zzgk.zza
            if (r1 == 0) goto L5cc
            boolean r4 = r12 instanceof java.util.RandomAccess
            if (r4 == 0) goto L5a6
            int r4 = r12.size()
            r39 = r2
            r2 = r16
            r5 = 0
            r6 = 0
        L575:
            if (r5 >= r4) goto L59c
            java.lang.Object r20 = r12.get(r5)
            java.lang.Integer r20 = (java.lang.Integer) r20
            int r0 = r20.intValue()
            boolean r20 = r1.zza()
            if (r20 == 0) goto L593
            if (r5 == r6) goto L590
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.set(r6, r0)
        L590:
            int r6 = r6 + 1
            goto L597
        L593:
            java.lang.Object r2 = com.google.android.gms.internal.auth.zzgk.zzc(r7, r10, r0, r2, r3)
        L597:
            int r5 = r5 + 1
            r0 = r36
            goto L575
        L59c:
            if (r6 == r4) goto L5ce
            java.util.List r0 = r12.subList(r6, r4)
            r0.clear()
            goto L5ce
        L5a6:
            r39 = r2
            java.util.Iterator r0 = r12.iterator()
            r2 = r16
        L5ae:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L5ce
            java.lang.Object r4 = r0.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            boolean r5 = r1.zza()
            if (r5 != 0) goto L5ae
            java.lang.Object r2 = com.google.android.gms.internal.auth.zzgk.zzc(r7, r10, r4, r2, r3)
            r0.remove()
            goto L5ae
        L5cc:
            r39 = r2
        L5ce:
            r0 = r36
            r1 = r39
            r12 = r8
            r7 = r13
        L5d4:
            r13 = r11
            r11 = r9
            r9 = r10
            r10 = r21
            goto L996
        L5db:
            r0 = r36
        L5dd:
            r11 = r6
            r9 = r10
            r7 = r13
            r10 = r21
            r12 = r27
            r13 = r1
            goto L995
        L5e7:
            r11 = r1
            r9 = r6
            r8 = r27
            r0 = 2
            if (r2 != r0) goto L64a
            int r0 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r13, r9)
            int r1 = r9.zza
            if (r1 < 0) goto L645
            int r2 = r15.length
            int r2 = r2 - r0
            if (r1 > r2) goto L640
            if (r1 != 0) goto L602
            com.google.android.gms.internal.auth.zzef r1 = com.google.android.gms.internal.auth.zzef.zzb
            r12.add(r1)
            goto L60a
        L602:
            com.google.android.gms.internal.auth.zzef r2 = com.google.android.gms.internal.auth.zzef.zzk(r15, r0, r1)
            r12.add(r2)
        L609:
            int r0 = r0 + r1
        L60a:
            if (r0 >= r11) goto L63a
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r0, r9)
            int r2 = r9.zza
            if (r14 != r2) goto L63a
            int r0 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r1, r9)
            int r1 = r9.zza
            if (r1 < 0) goto L635
            int r2 = r15.length
            int r2 = r2 - r0
            if (r1 > r2) goto L630
            if (r1 != 0) goto L628
            com.google.android.gms.internal.auth.zzef r1 = com.google.android.gms.internal.auth.zzef.zzb
            r12.add(r1)
            goto L60a
        L628:
            com.google.android.gms.internal.auth.zzef r2 = com.google.android.gms.internal.auth.zzef.zzk(r15, r0, r1)
            r12.add(r2)
            goto L609
        L630:
            com.google.android.gms.internal.auth.zzfb r0 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r0
        L635:
            com.google.android.gms.internal.auth.zzfb r0 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r0
        L63a:
            r1 = r0
            r12 = r8
            r7 = r13
            r0 = r36
            goto L5d4
        L640:
            com.google.android.gms.internal.auth.zzfb r0 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r0
        L645:
            com.google.android.gms.internal.auth.zzfb r0 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r0
        L64a:
            r0 = r36
            r12 = r8
            r7 = r13
            goto L680
        L64f:
            r11 = r1
            r9 = r6
            r8 = r27
            r0 = 2
            if (r2 != r0) goto L67c
            r0 = r36
            com.google.android.gms.internal.auth.zzgi r1 = r0.zzr(r8)
            r6 = r8
            r8 = r1
            r5 = r9
            r4 = r21
            r9 = r14
            r3 = r10
            r10 = r38
            r1 = r11
            r11 = r13
            r2 = r12
            r12 = r40
            r7 = r13
            r13 = r2
            r2 = r14
            r14 = r42
            int r8 = com.google.android.gms.internal.auth.zzdu.zze(r8, r9, r10, r11, r12, r13, r14)
            r13 = r1
            r14 = r2
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            r1 = r8
            goto L996
        L67c:
            r0 = r36
            r7 = r13
            r12 = r8
        L680:
            r13 = r11
            r11 = r9
            r9 = r10
            r10 = r21
            goto L995
        L687:
            r5 = r6
            r3 = r10
            r8 = r12
            r7 = r13
            r4 = r21
            r6 = r27
            r9 = 2
            if (r2 != r9) goto L747
            r9 = 536870912(0x20000000, double:2.652494739E-315)
            long r9 = r29 & r9
            int r2 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r2 != 0) goto L6e5
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r7, r5)
            int r9 = r5.zza
            if (r9 < 0) goto L6e0
            if (r9 != 0) goto L6ab
            r10 = r28
            r8.add(r10)
            goto L6b8
        L6ab:
            r10 = r28
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.auth.zzfa.zzb
            r11.<init>(r15, r2, r9, r12)
            r8.add(r11)
        L6b7:
            int r2 = r2 + r9
        L6b8:
            if (r2 >= r1) goto L857
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r5)
            int r11 = r5.zza
            if (r14 != r11) goto L857
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r9, r5)
            int r9 = r5.zza
            if (r9 < 0) goto L6db
            if (r9 != 0) goto L6d0
            r8.add(r10)
            goto L6b8
        L6d0:
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.auth.zzfa.zzb
            r11.<init>(r15, r2, r9, r12)
            r8.add(r11)
            goto L6b7
        L6db:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L6e0:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L6e5:
            r10 = r28
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r7, r5)
            int r9 = r5.zza
            if (r9 < 0) goto L742
            if (r9 != 0) goto L6f5
            r8.add(r10)
            goto L708
        L6f5:
            int r11 = r2 + r9
            boolean r12 = com.google.android.gms.internal.auth.zzhn.zzc(r15, r2, r11)
            if (r12 == 0) goto L73d
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = com.google.android.gms.internal.auth.zzfa.zzb
            r12.<init>(r15, r2, r9, r13)
            r8.add(r12)
        L707:
            r2 = r11
        L708:
            if (r2 >= r1) goto L857
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r5)
            int r11 = r5.zza
            if (r14 != r11) goto L857
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r9, r5)
            int r9 = r5.zza
            if (r9 < 0) goto L738
            if (r9 != 0) goto L720
            r8.add(r10)
            goto L708
        L720:
            int r11 = r2 + r9
            boolean r12 = com.google.android.gms.internal.auth.zzhn.zzc(r15, r2, r11)
            if (r12 == 0) goto L733
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = com.google.android.gms.internal.auth.zzfa.zzb
            r12.<init>(r15, r2, r9, r13)
            r8.add(r12)
            goto L707
        L733:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L738:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L73d:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L742:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L747:
            r13 = r1
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            goto L995
        L74e:
            r5 = r6
            r3 = r10
            r8 = r12
            r7 = r13
            r4 = r21
            r6 = r27
            r9 = 2
            if (r2 != r9) goto L77f
            r12 = r8
            com.google.android.gms.internal.auth.zzdv r12 = (com.google.android.gms.internal.auth.zzdv) r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r7, r5)
            int r8 = r5.zza
            int r8 = r8 + r2
        L763:
            if (r2 >= r8) goto L776
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r2, r5)
            long r9 = r5.zzb
            int r11 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r11 == 0) goto L771
            r9 = 1
            goto L772
        L771:
            r9 = 0
        L772:
            r12.zze(r9)
            goto L763
        L776:
            if (r2 != r8) goto L77a
            goto L81f
        L77a:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L77f:
            if (r2 != 0) goto L747
            r12 = r8
            com.google.android.gms.internal.auth.zzdv r12 = (com.google.android.gms.internal.auth.zzdv) r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r7, r5)
            long r8 = r5.zzb
            int r10 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r10 == 0) goto L790
            r8 = 1
            goto L791
        L790:
            r8 = 0
        L791:
            r12.zze(r8)
        L794:
            if (r2 >= r1) goto L857
            int r8 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r5)
            int r9 = r5.zza
            if (r14 != r9) goto L857
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r8, r5)
            long r8 = r5.zzb
            int r10 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r10 == 0) goto L7aa
            r8 = 1
            goto L7ab
        L7aa:
            r8 = 0
        L7ab:
            r12.zze(r8)
            goto L794
        L7af:
            r5 = r6
            r3 = r10
            r8 = r12
            r7 = r13
            r4 = r21
            r6 = r27
            r9 = 2
            if (r2 != r9) goto L7d9
            r12 = r8
            com.google.android.gms.internal.auth.zzew r12 = (com.google.android.gms.internal.auth.zzew) r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r7, r5)
            int r8 = r5.zza
            int r8 = r8 + r2
        L7c4:
            if (r2 >= r8) goto L7d0
            int r9 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r2)
            r12.zze(r9)
            int r2 = r2 + 4
            goto L7c4
        L7d0:
            if (r2 != r8) goto L7d4
            goto L857
        L7d4:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L7d9:
            r9 = 5
            if (r2 != r9) goto L747
            r12 = r8
            com.google.android.gms.internal.auth.zzew r12 = (com.google.android.gms.internal.auth.zzew) r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r7)
            r12.zze(r2)
            int r2 = r7 + 4
        L7e8:
            if (r2 >= r1) goto L857
            int r8 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r5)
            int r9 = r5.zza
            if (r14 != r9) goto L857
            int r2 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r8)
            r12.zze(r2)
            int r2 = r8 + 4
            goto L7e8
        L7fc:
            r5 = r6
            r3 = r10
            r8 = r12
            r7 = r13
            r4 = r21
            r6 = r27
            r9 = 2
            if (r2 != r9) goto L825
            r12 = r8
            com.google.android.gms.internal.auth.zzfm r12 = (com.google.android.gms.internal.auth.zzfm) r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r7, r5)
            int r8 = r5.zza
            int r8 = r8 + r2
        L811:
            if (r2 >= r8) goto L81d
            long r9 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r2)
            r12.zze(r9)
            int r2 = r2 + 8
            goto L811
        L81d:
            if (r2 != r8) goto L820
        L81f:
            goto L857
        L820:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L825:
            r9 = 1
            if (r2 != r9) goto L747
            r12 = r8
            com.google.android.gms.internal.auth.zzfm r12 = (com.google.android.gms.internal.auth.zzfm) r12
            long r8 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r7)
            r12.zze(r8)
            int r2 = r7 + 8
        L834:
            if (r2 >= r1) goto L857
            int r8 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r5)
            int r9 = r5.zza
            if (r14 != r9) goto L857
            long r9 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r8)
            r12.zze(r9)
            int r2 = r8 + 8
            goto L834
        L848:
            r5 = r6
            r3 = r10
            r8 = r12
            r7 = r13
            r4 = r21
            r6 = r27
            r9 = 2
            if (r2 != r9) goto L85f
            int r2 = com.google.android.gms.internal.auth.zzdu.zzf(r15, r7, r8, r5)
        L857:
            r13 = r1
            r1 = r2
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            goto L996
        L85f:
            if (r2 != 0) goto L747
            r13 = r1
            r1 = r14
            r2 = r38
            r9 = r3
            r3 = r7
            r10 = r4
            r4 = r40
            r11 = r5
            r5 = r8
            r12 = r6
            r6 = r42
            int r1 = com.google.android.gms.internal.auth.zzdu.zzj(r1, r2, r3, r4, r5, r6)
            goto L996
        L875:
            r11 = r6
            r9 = r10
            r8 = r12
            r7 = r13
            r10 = r21
            r12 = r27
            r13 = r1
            r1 = 2
            if (r2 != r1) goto L8a0
            r1 = r8
            com.google.android.gms.internal.auth.zzfm r1 = (com.google.android.gms.internal.auth.zzfm) r1
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r7, r11)
            int r3 = r11.zza
            int r3 = r3 + r2
        L88b:
            if (r2 >= r3) goto L897
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r2, r11)
            long r4 = r11.zzb
            r1.zze(r4)
            goto L88b
        L897:
            if (r2 != r3) goto L89b
            goto L975
        L89b:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L8a0:
            if (r2 != 0) goto L995
            r1 = r8
            com.google.android.gms.internal.auth.zzfm r1 = (com.google.android.gms.internal.auth.zzfm) r1
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r7, r11)
            long r3 = r11.zzb
            r1.zze(r3)
        L8ae:
            if (r2 >= r13) goto L975
            int r3 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r11)
            int r4 = r11.zza
            if (r14 != r4) goto L975
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r3, r11)
            long r3 = r11.zzb
            r1.zze(r3)
            goto L8ae
        L8c2:
            r11 = r6
            r9 = r10
            r8 = r12
            r7 = r13
            r10 = r21
            r12 = r27
            r13 = r1
            r1 = 2
            if (r2 != r1) goto L8f1
            r1 = r8
            com.google.android.gms.internal.auth.zzer r1 = (com.google.android.gms.internal.auth.zzer) r1
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r7, r11)
            int r3 = r11.zza
            int r3 = r3 + r2
        L8d8:
            if (r2 >= r3) goto L8e8
            int r4 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r2)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r1.zze(r4)
            int r2 = r2 + 4
            goto L8d8
        L8e8:
            if (r2 != r3) goto L8ec
            goto L975
        L8ec:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L8f1:
            r1 = 5
            if (r2 != r1) goto L995
            r1 = r8
            com.google.android.gms.internal.auth.zzer r1 = (com.google.android.gms.internal.auth.zzer) r1
            int r2 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r7)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r1.zze(r2)
            int r2 = r7 + 4
        L904:
            if (r2 >= r13) goto L975
            int r3 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r11)
            int r4 = r11.zza
            if (r14 != r4) goto L975
            int r2 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r3)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r1.zze(r2)
            int r2 = r3 + 4
            goto L904
        L91c:
            r11 = r6
            r9 = r10
            r8 = r12
            r7 = r13
            r10 = r21
            r12 = r27
            r13 = r1
            r1 = 2
            if (r2 != r1) goto L94a
            r1 = r8
            com.google.android.gms.internal.auth.zzek r1 = (com.google.android.gms.internal.auth.zzek) r1
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r7, r11)
            int r3 = r11.zza
            int r3 = r3 + r2
        L932:
            if (r2 >= r3) goto L942
            long r4 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r2)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r1.zze(r4)
            int r2 = r2 + 8
            goto L932
        L942:
            if (r2 != r3) goto L945
            goto L975
        L945:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L94a:
            r1 = 1
            if (r2 != r1) goto L995
            r1 = r8
            com.google.android.gms.internal.auth.zzek r1 = (com.google.android.gms.internal.auth.zzek) r1
            long r2 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r7)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            r1.zze(r2)
            int r2 = r7 + 8
        L95d:
            if (r2 >= r13) goto L975
            int r3 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r2, r11)
            int r4 = r11.zza
            if (r14 != r4) goto L975
            long r4 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r3)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r1.zze(r4)
            int r2 = r3 + 8
            goto L95d
        L975:
            r1 = r2
            goto L996
        L977:
            if (r1 >= r13) goto L996
            int r3 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r1, r11)
            int r2 = r11.zza
            if (r14 != r2) goto L996
            r1 = r20
            r2 = r38
            r4 = r40
            r5 = r21
            r6 = r42
            int r1 = com.google.android.gms.internal.auth.zzdu.zzc(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r11.zzc
            r8.add(r2)
            goto L977
        L995:
            r1 = r7
        L996:
            if (r1 == r7) goto L9a8
            r7 = r37
            r2 = r9
            r3 = r12
            r4 = r14
            r5 = r17
            r6 = r25
            r8 = 0
            r12 = r11
            r14 = r13
            r13 = r41
            goto Lcbc
        L9a8:
            r7 = r37
            r8 = r41
            r3 = r1
            r21 = r10
            r6 = r13
            r13 = r9
            r9 = r14
            r14 = r11
            goto Lc90
        L9b5:
            r3 = r5
            r7 = r13
            r5 = r21
            r13 = r1
            r34 = r10
            r10 = r9
            r9 = r34
            r1 = 50
            if (r4 != r1) goto L9fe
            r1 = 2
            if (r2 != r1) goto L9ec
            sun.misc.Unsafe r1 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r2 = r0.zzs(r3)
            r7 = r37
            java.lang.Object r3 = r1.getObject(r7, r11)
            r4 = r3
            com.google.android.gms.internal.auth.zzfr r4 = (com.google.android.gms.internal.auth.zzfr) r4
            boolean r4 = r4.zze()
            if (r4 != 0) goto L9e9
            com.google.android.gms.internal.auth.zzfr r4 = com.google.android.gms.internal.auth.zzfr.zza()
            com.google.android.gms.internal.auth.zzfr r4 = r4.zzb()
            com.google.android.gms.internal.auth.zzfs.zza(r4, r3)
            r1.putObject(r7, r11, r4)
        L9e9:
            com.google.android.gms.internal.auth.zzfq r2 = (com.google.android.gms.internal.auth.zzfq) r2
            throw r16
        L9ec:
            r1 = r7
            r7 = r37
        L9ef:
            r8 = r41
            r12 = r3
            r21 = r5
            r3 = r1
            r34 = r14
            r14 = r6
            r6 = r13
            r13 = r9
            r9 = r34
            goto Lc90
        L9fe:
            r1 = r7
            r7 = r37
            int r21 = r3 + 2
            r26 = r5
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            r20 = r20[r21]
            r21 = r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r20 & r5
            long r5 = (long) r13
            switch(r4) {
                case 51: goto Lc4d;
                case 52: goto Lc27;
                case 53: goto Lc02;
                case 54: goto Lc02;
                case 55: goto Lbe0;
                case 56: goto Lbbd;
                case 57: goto Lb9a;
                case 58: goto Lb6f;
                case 59: goto Lb30;
                case 60: goto Laf6;
                case 61: goto Lacb;
                case 62: goto Lbe0;
                case 63: goto La98;
                case 64: goto Lb9a;
                case 65: goto Lbbd;
                case 66: goto La7b;
                case 67: goto La4f;
                case 68: goto La21;
                default: goto La14;
            }
        La14:
            r6 = r40
            r27 = r3
            r13 = r9
            r20 = r14
            r21 = r26
            r14 = r42
            goto Lc73
        La21:
            r4 = 3
            if (r2 != r4) goto La14
            java.lang.Object r2 = r0.zzu(r7, r9, r3)
            r4 = r14 & (-8)
            r13 = r4 | 4
            com.google.android.gms.internal.auth.zzgi r4 = r0.zzr(r3)
            r8 = r2
            r5 = r9
            r9 = r4
            r10 = r38
            r11 = r1
            r12 = r40
            r4 = r40
            r6 = r14
            r14 = r42
            int r8 = com.google.android.gms.internal.auth.zzdu.zzl(r8, r9, r10, r11, r12, r13, r14)
            r0.zzC(r7, r5, r3, r2)
            r27 = r3
            r13 = r5
            r20 = r6
            r2 = r8
            r21 = r26
            r6 = r4
            goto Lc74
        La4f:
            r4 = r40
            r13 = r9
            r9 = r14
            if (r2 != 0) goto La71
            r4 = r5
            r6 = r42
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r1, r6)
            r14 = r9
            long r8 = r6.zzb
            long r8 = com.google.android.gms.internal.auth.zzej.zzc(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = r21
            r9.putObject(r7, r11, r8)
            r9.putInt(r7, r4, r13)
            goto Lae0
        La71:
            r6 = r40
            r14 = r42
            r27 = r3
            r20 = r9
            goto Lb2c
        La7b:
            r4 = r5
            r13 = r9
            r9 = r21
            r6 = r42
            if (r2 != 0) goto Laeb
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r1, r6)
            int r8 = r6.zza
            int r8 = com.google.android.gms.internal.auth.zzej.zzb(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.putObject(r7, r11, r8)
            r9.putInt(r7, r4, r13)
            goto Lae0
        La98:
            r4 = r5
            r13 = r9
            r9 = r21
            r6 = r42
            if (r2 != 0) goto Laeb
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r1, r6)
            int r8 = r6.zza
            com.google.android.gms.internal.auth.zzey r10 = r0.zzq(r3)
            if (r10 == 0) goto Lac0
            boolean r10 = r10.zza()
            if (r10 == 0) goto Lab3
            goto Lac0
        Lab3:
            com.google.android.gms.internal.auth.zzha r4 = zzc(r37)
            long r8 = (long) r8
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r4.zzh(r14, r5)
            goto Lae0
        Lac0:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.putObject(r7, r11, r8)
            r9.putInt(r7, r4, r13)
            goto Lae0
        Lacb:
            r4 = r5
            r13 = r9
            r9 = r21
            r8 = 2
            r6 = r42
            if (r2 != r8) goto Laeb
            int r2 = com.google.android.gms.internal.auth.zzdu.zza(r15, r1, r6)
            java.lang.Object r8 = r6.zzc
            r9.putObject(r7, r11, r8)
            r9.putInt(r7, r4, r13)
        Lae0:
            r27 = r3
            r20 = r14
            r21 = r26
            r14 = r6
            r6 = r40
            goto Lc74
        Laeb:
            r27 = r3
            r20 = r14
            r21 = r26
            r14 = r6
            r6 = r40
            goto Lc73
        Laf6:
            r6 = r42
            r13 = r9
            r8 = 2
            if (r2 != r8) goto Lb25
            java.lang.Object r8 = r0.zzu(r7, r13, r3)
            com.google.android.gms.internal.auth.zzgi r2 = r0.zzr(r3)
            r9 = r1
            r1 = r8
            r10 = r3
            r3 = r38
            r11 = r40
            r4 = r9
            r12 = r26
            r5 = r40
            r20 = r14
            r14 = r6
            r6 = r42
            int r1 = com.google.android.gms.internal.auth.zzdu.zzm(r1, r2, r3, r4, r5, r6)
            r0.zzC(r7, r13, r10, r8)
            r2 = r1
            r1 = r9
            r27 = r10
            r6 = r11
            r21 = r12
            goto Lc74
        Lb25:
            r20 = r14
            r14 = r6
            r6 = r40
            r27 = r3
        Lb2c:
            r21 = r26
            goto Lc73
        Lb30:
            r27 = r3
            r4 = r5
            r13 = r9
            r20 = r14
            r9 = r21
            r21 = r26
            r3 = 2
            r6 = r40
            r14 = r42
            if (r2 != r3) goto Lc73
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r1, r14)
            int r3 = r14.zza
            if (r3 != 0) goto Lb4d
            r9.putObject(r7, r11, r10)
            goto Lb6a
        Lb4d:
            r8 = r8 & r22
            if (r8 == 0) goto Lb5f
            int r8 = r2 + r3
            boolean r8 = com.google.android.gms.internal.auth.zzhn.zzc(r15, r2, r8)
            if (r8 == 0) goto Lb5a
            goto Lb5f
        Lb5a:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        Lb5f:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.auth.zzfa.zzb
            r8.<init>(r15, r2, r3, r10)
            r9.putObject(r7, r11, r8)
            int r2 = r2 + r3
        Lb6a:
            r9.putInt(r7, r4, r13)
            goto Lc74
        Lb6f:
            r27 = r3
            r4 = r5
            r13 = r9
            r20 = r14
            r9 = r21
            r21 = r26
            r6 = r40
            r14 = r42
            if (r2 != 0) goto Lc73
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r1, r14)
            r39 = r2
            long r2 = r14.zzb
            int r8 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r8 == 0) goto Lb8d
            r8 = 1
            goto Lb8e
        Lb8d:
            r8 = 0
        Lb8e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            r9.putObject(r7, r11, r2)
            r9.putInt(r7, r4, r13)
            goto Lc24
        Lb9a:
            r27 = r3
            r4 = r5
            r13 = r9
            r20 = r14
            r9 = r21
            r21 = r26
            r3 = 5
            r6 = r40
            r14 = r42
            if (r2 != r3) goto Lc73
            int r2 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.putObject(r7, r11, r2)
            int r2 = r1 + 4
            r9.putInt(r7, r4, r13)
            goto Lc74
        Lbbd:
            r27 = r3
            r4 = r5
            r13 = r9
            r20 = r14
            r9 = r21
            r21 = r26
            r3 = 1
            r6 = r40
            r14 = r42
            if (r2 != r3) goto Lc73
            long r2 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r9.putObject(r7, r11, r2)
            int r2 = r1 + 8
            r9.putInt(r7, r4, r13)
            goto Lc74
        Lbe0:
            r27 = r3
            r4 = r5
            r13 = r9
            r20 = r14
            r9 = r21
            r21 = r26
            r6 = r40
            r14 = r42
            if (r2 != 0) goto Lc73
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r15, r1, r14)
            int r3 = r14.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.putObject(r7, r11, r3)
            r9.putInt(r7, r4, r13)
            goto Lc74
        Lc02:
            r27 = r3
            r4 = r5
            r13 = r9
            r20 = r14
            r9 = r21
            r21 = r26
            r6 = r40
            r14 = r42
            if (r2 != 0) goto Lc73
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r15, r1, r14)
            r39 = r2
            long r2 = r14.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r9.putObject(r7, r11, r2)
            r9.putInt(r7, r4, r13)
        Lc24:
            r2 = r39
            goto Lc74
        Lc27:
            r27 = r3
            r4 = r5
            r13 = r9
            r20 = r14
            r9 = r21
            r21 = r26
            r3 = 5
            r6 = r40
            r14 = r42
            if (r2 != r3) goto Lc73
            int r2 = com.google.android.gms.internal.auth.zzdu.zzb(r15, r1)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r9.putObject(r7, r11, r2)
            int r2 = r1 + 4
            r9.putInt(r7, r4, r13)
            goto Lc74
        Lc4d:
            r27 = r3
            r4 = r5
            r13 = r9
            r20 = r14
            r9 = r21
            r21 = r26
            r3 = 1
            r6 = r40
            r14 = r42
            if (r2 != r3) goto Lc73
            long r2 = com.google.android.gms.internal.auth.zzdu.zzn(r15, r1)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r9.putObject(r7, r11, r2)
            int r2 = r1 + 8
            r9.putInt(r7, r4, r13)
            goto Lc74
        Lc73:
            r2 = r1
        Lc74:
            if (r2 == r1) goto Lc89
            r1 = r2
            r2 = r13
            r12 = r14
            r5 = r17
            r4 = r20
            r11 = r21
            r3 = r27
            r8 = 0
            r13 = r41
            r14 = r6
            r6 = r25
            goto L1b
        Lc89:
            r8 = r41
            r3 = r2
            r9 = r20
            r12 = r27
        Lc90:
            if (r9 != r8) goto Lc9f
            if (r8 != 0) goto Lc95
            goto Lc9f
        Lc95:
            r1 = r3
            r11 = r6
            r4 = r9
            r5 = r17
            r10 = r21
            r6 = r25
            goto Lcc6
        Lc9f:
            com.google.android.gms.internal.auth.zzha r5 = zzc(r37)
            r1 = r9
            r2 = r38
            r10 = r21
            r4 = r40
            r11 = r6
            r6 = r42
            int r1 = com.google.android.gms.internal.auth.zzdu.zzg(r1, r2, r3, r4, r5, r6)
            r4 = r9
            r3 = r12
            r2 = r13
            r12 = r14
            r5 = r17
            r6 = r25
            r13 = r8
            r14 = r11
            r8 = 0
        Lcbc:
            r11 = r10
            goto L1b
        Lcbf:
            r17 = r5
            r25 = r6
            r10 = r11
            r8 = r13
            r11 = r14
        Lcc6:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto Lccf
            long r12 = (long) r6
            r10.putInt(r7, r12, r5)
        Lccf:
            int r3 = r0.zzi
        Lcd1:
            int r5 = r0.zzj
            if (r3 >= r5) goto Lcfc
            int[] r5 = r0.zzh
            r5 = r5[r3]
            int[] r6 = r0.zzc
            r6 = r6[r5]
            int r6 = r0.zzo(r5)
            r6 = r6 & r2
            long r9 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.auth.zzhj.zzf(r7, r9)
            if (r6 != 0) goto Lcea
            goto Lcf0
        Lcea:
            com.google.android.gms.internal.auth.zzey r9 = r0.zzq(r5)
            if (r9 != 0) goto Lcf3
        Lcf0:
            int r3 = r3 + 1
            goto Lcd1
        Lcf3:
            com.google.android.gms.internal.auth.zzfr r6 = (com.google.android.gms.internal.auth.zzfr) r6
            java.lang.Object r1 = r0.zzs(r5)
            com.google.android.gms.internal.auth.zzfq r1 = (com.google.android.gms.internal.auth.zzfq) r1
            throw r16
        Lcfc:
            if (r8 != 0) goto Ld06
            if (r1 != r11) goto Ld01
            goto Ld0a
        Ld01:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzd()
            throw r1
        Ld06:
            if (r1 > r11) goto Ld0b
            if (r4 != r8) goto Ld0b
        Ld0a:
            return r1
        Ld0b:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzd()
            throw r1
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final java.lang.Object zzd() {
            r1 = this;
            com.google.android.gms.internal.auth.zzfx r0 = r1.zzg
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            com.google.android.gms.internal.auth.zzev r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(java.lang.Object r8) {
            r7 = this;
            boolean r0 = zzH(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.auth.zzev
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzl(r2)
            r0.zza = r1
            r0.zzj()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L82
            int r2 = r7.zzo(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzn(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6c
            r5 = 60
            if (r2 == r5) goto L54
            r5 = 68
            if (r2 == r5) goto L54
            switch(r2) {
                case 17: goto L6c;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L7f
        L3c:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7f
            r6 = r5
            com.google.android.gms.internal.auth.zzfr r6 = (com.google.android.gms.internal.auth.zzfr) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L7f
        L4e:
            com.google.android.gms.internal.auth.zzfl r2 = r7.zzk
            r2.zza(r8, r3)
            goto L7f
        L54:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzI(r8, r2, r1)
            if (r2 == 0) goto L7f
            com.google.android.gms.internal.auth.zzgi r2 = r7.zzr(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zze(r3)
            goto L7f
        L6c:
            boolean r2 = r7.zzE(r8, r1)
            if (r2 == 0) goto L7f
            com.google.android.gms.internal.auth.zzgi r2 = r7.zzr(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zze(r3)
        L7f:
            int r1 = r1 + 3
            goto L1d
        L82:
            com.google.android.gms.internal.auth.zzgz r0 = r7.zzl
            r0.zze(r8)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            zzw(r7)
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L7:
            int[] r1 = r6.zzc
            int r1 = r1.length
            if (r0 >= r1) goto L190
            int r1 = r6.zzo(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            int[] r3 = r6.zzc
            r3 = r3[r0]
            int r1 = zzn(r1)
            long r4 = (long) r2
            switch(r1) {
                case 0: goto L17c;
                case 1: goto L16b;
                case 2: goto L15a;
                case 3: goto L149;
                case 4: goto L138;
                case 5: goto L127;
                case 6: goto L116;
                case 7: goto L104;
                case 8: goto Lf2;
                case 9: goto Led;
                case 10: goto Ldb;
                case 11: goto Lc9;
                case 12: goto Lb7;
                case 13: goto La5;
                case 14: goto L93;
                case 15: goto L81;
                case 16: goto L6f;
                case 17: goto L6a;
                case 18: goto L63;
                case 19: goto L63;
                case 20: goto L63;
                case 21: goto L63;
                case 22: goto L63;
                case 23: goto L63;
                case 24: goto L63;
                case 25: goto L63;
                case 26: goto L63;
                case 27: goto L63;
                case 28: goto L63;
                case 29: goto L63;
                case 30: goto L63;
                case 31: goto L63;
                case 32: goto L63;
                case 33: goto L63;
                case 34: goto L63;
                case 35: goto L63;
                case 36: goto L63;
                case 37: goto L63;
                case 38: goto L63;
                case 39: goto L63;
                case 40: goto L63;
                case 41: goto L63;
                case 42: goto L63;
                case 43: goto L63;
                case 44: goto L63;
                case 45: goto L63;
                case 46: goto L63;
                case 47: goto L63;
                case 48: goto L63;
                case 49: goto L63;
                case 50: goto L50;
                case 51: goto L3e;
                case 52: goto L3e;
                case 53: goto L3e;
                case 54: goto L3e;
                case 55: goto L3e;
                case 56: goto L3e;
                case 57: goto L3e;
                case 58: goto L3e;
                case 59: goto L3e;
                case 60: goto L39;
                case 61: goto L27;
                case 62: goto L27;
                case 63: goto L27;
                case 64: goto L27;
                case 65: goto L27;
                case 66: goto L27;
                case 67: goto L27;
                case 68: goto L22;
                default: goto L20;
            }
        L20:
            goto L18c
        L22:
            r6.zzy(r7, r8, r0)
            goto L18c
        L27:
            boolean r1 = r6.zzI(r8, r3, r0)
            if (r1 == 0) goto L18c
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            r6.zzA(r7, r3, r0)
            goto L18c
        L39:
            r6.zzy(r7, r8, r0)
            goto L18c
        L3e:
            boolean r1 = r6.zzI(r8, r3, r0)
            if (r1 == 0) goto L18c
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            r6.zzA(r7, r3, r0)
            goto L18c
        L50:
            int r1 = com.google.android.gms.internal.auth.zzgk.zza
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r7, r4)
            java.lang.Object r2 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzfs.zza(r1, r2)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            goto L18c
        L63:
            com.google.android.gms.internal.auth.zzfl r1 = r6.zzk
            r1.zzb(r7, r8, r4)
            goto L18c
        L6a:
            r6.zzx(r7, r8, r0)
            goto L18c
        L6f:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L81:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L93:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        La5:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        Lb7:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        Lc9:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        Ldb:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        Led:
            r6.zzx(r7, r8, r0)
            goto L18c
        Lf2:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L104:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            boolean r1 = com.google.android.gms.internal.auth.zzhj.zzt(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzk(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L116:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L127:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L138:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L149:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L15a:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L16b:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            float r1 = com.google.android.gms.internal.auth.zzhj.zzb(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzm(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L17c:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            double r1 = com.google.android.gms.internal.auth.zzhj.zza(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzl(r7, r4, r1)
            r6.zzz(r7, r0)
        L18c:
            int r0 = r0 + 3
            goto L7
        L190:
            com.google.android.gms.internal.auth.zzgz r0 = r6.zzl
            com.google.android.gms.internal.auth.zzgk.zzd(r0, r7, r8)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(java.lang.Object r8, byte[] r9, int r10, int r11, com.google.android.gms.internal.auth.zzdt r12) throws java.io.IOException {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.zzb(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L1c7
            int r3 = r8.zzo(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            int r3 = zzn(r3)
            long r5 = (long) r5
            switch(r3) {
                case 0: goto L1a7;
                case 1: goto L18e;
                case 2: goto L17b;
                case 3: goto L168;
                case 4: goto L157;
                case 5: goto L143;
                case 6: goto L131;
                case 7: goto L11f;
                case 8: goto L109;
                case 9: goto Lf3;
                case 10: goto Ldd;
                case 11: goto Lcb;
                case 12: goto Lb9;
                case 13: goto La7;
                case 14: goto L93;
                case 15: goto L81;
                case 16: goto L6d;
                case 17: goto L57;
                case 18: goto L47;
                case 19: goto L47;
                case 20: goto L47;
                case 21: goto L47;
                case 22: goto L47;
                case 23: goto L47;
                case 24: goto L47;
                case 25: goto L47;
                case 26: goto L47;
                case 27: goto L47;
                case 28: goto L47;
                case 29: goto L47;
                case 30: goto L47;
                case 31: goto L47;
                case 32: goto L47;
                case 33: goto L47;
                case 34: goto L47;
                case 35: goto L47;
                case 36: goto L47;
                case 37: goto L47;
                case 38: goto L47;
                case 39: goto L47;
                case 40: goto L47;
                case 41: goto L47;
                case 42: goto L47;
                case 43: goto L47;
                case 44: goto L47;
                case 45: goto L47;
                case 46: goto L47;
                case 47: goto L47;
                case 48: goto L47;
                case 49: goto L47;
                case 50: goto L3a;
                case 51: goto L1a;
                case 52: goto L1a;
                case 53: goto L1a;
                case 54: goto L1a;
                case 55: goto L1a;
                case 56: goto L1a;
                case 57: goto L1a;
                case 58: goto L1a;
                case 59: goto L1a;
                case 60: goto L1a;
                case 61: goto L1a;
                case 62: goto L1a;
                case 63: goto L1a;
                case 64: goto L1a;
                case 65: goto L1a;
                case 66: goto L1a;
                case 67: goto L1a;
                case 68: goto L1a;
                default: goto L18;
            }
        L18:
            goto L1c3
        L1a:
            int r3 = r8.zzl(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r3)
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r3)
            if (r7 != r3) goto L1c2
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 != 0) goto L1c3
            goto L1c2
        L3a:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            goto L53
        L47:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
        L53:
            if (r3 != 0) goto L1c3
            goto L1c2
        L57:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 == 0) goto L1c2
            goto L1c3
        L6d:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1c2
            goto L1c3
        L81:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c2
            goto L1c3
        L93:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1c2
            goto L1c3
        La7:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c2
            goto L1c3
        Lb9:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c2
            goto L1c3
        Lcb:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c2
            goto L1c3
        Ldd:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 == 0) goto L1c2
            goto L1c3
        Lf3:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 == 0) goto L1c2
            goto L1c3
        L109:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 == 0) goto L1c2
            goto L1c3
        L11f:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            boolean r3 = com.google.android.gms.internal.auth.zzhj.zzt(r9, r5)
            boolean r4 = com.google.android.gms.internal.auth.zzhj.zzt(r10, r5)
            if (r3 != r4) goto L1c2
            goto L1c3
        L131:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c2
            goto L1c3
        L143:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1c2
            goto L1c3
        L157:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c2
            goto L1c3
        L168:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1c2
            goto L1c3
        L17b:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1c2
            goto L1c3
        L18e:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            float r3 = com.google.android.gms.internal.auth.zzhj.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = com.google.android.gms.internal.auth.zzhj.zzb(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L1c2
            goto L1c3
        L1a7:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c2
            double r3 = com.google.android.gms.internal.auth.zzhj.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = com.google.android.gms.internal.auth.zzhj.zza(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1c2
            goto L1c3
        L1c2:
            return r1
        L1c3:
            int r2 = r2 + 3
            goto L5
        L1c7:
            com.google.android.gms.internal.auth.zzgz r0 = r8.zzl
            java.lang.Object r9 = r0.zzb(r9)
            com.google.android.gms.internal.auth.zzgz r0 = r8.zzl
            java.lang.Object r10 = r0.zzb(r10)
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L1da
            return r1
        L1da:
            r9 = 1
            return r9
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(java.lang.Object r18) {
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r10 = 0
        Ld:
            int r2 = r6.zzi
            r3 = 1
            if (r10 >= r2) goto Le6
            int[] r2 = r6.zzh
            r11 = r2[r10]
            int[] r2 = r6.zzc
            r12 = r2[r11]
            int r13 = r6.zzo(r11)
            int[] r2 = r6.zzc
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L39
            if (r4 == r8) goto L35
            long r0 = (long) r4
            sun.misc.Unsafe r2 = com.google.android.gms.internal.auth.zzga.zzb
            int r1 = r2.getInt(r7, r0)
        L35:
            r16 = r1
            r15 = r4
            goto L3c
        L39:
            r15 = r0
            r16 = r1
        L3c:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r13
            if (r0 == 0) goto L52
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.zzF(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L51
            goto L52
        L51:
            return r9
        L52:
            int r0 = zzn(r13)
            r1 = 9
            if (r0 == r1) goto Lc5
            r1 = 17
            if (r0 == r1) goto Lc5
            r1 = 27
            if (r0 == r1) goto L9d
            r1 = 60
            if (r0 == r1) goto L8c
            r1 = 68
            if (r0 == r1) goto L8c
            r1 = 49
            if (r0 == r1) goto L9d
            r1 = 50
            if (r0 == r1) goto L74
            goto Ldf
        L74:
            r0 = r13 & r8
            long r0 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzhj.zzf(r7, r0)
            com.google.android.gms.internal.auth.zzfr r0 = (com.google.android.gms.internal.auth.zzfr) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L84
            goto Ldf
        L84:
            java.lang.Object r0 = r6.zzs(r11)
            com.google.android.gms.internal.auth.zzfq r0 = (com.google.android.gms.internal.auth.zzfq) r0
            r0 = 0
            throw r0
        L8c:
            boolean r0 = r6.zzI(r7, r12, r11)
            if (r0 == 0) goto Ldf
            com.google.android.gms.internal.auth.zzgi r0 = r6.zzr(r11)
            boolean r0 = zzG(r7, r13, r0)
            if (r0 != 0) goto Ldf
            return r9
        L9d:
            r0 = r13 & r8
            long r0 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzhj.zzf(r7, r0)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Ldf
            com.google.android.gms.internal.auth.zzgi r1 = r6.zzr(r11)
            r2 = 0
        Lb1:
            int r3 = r0.size()
            if (r2 >= r3) goto Ldf
            java.lang.Object r3 = r0.get(r2)
            boolean r3 = r1.zzi(r3)
            if (r3 != 0) goto Lc2
            return r9
        Lc2:
            int r2 = r2 + 1
            goto Lb1
        Lc5:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.zzF(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Ldf
            com.google.android.gms.internal.auth.zzgi r0 = r6.zzr(r11)
            boolean r0 = zzG(r7, r13, r0)
            if (r0 != 0) goto Ldf
            return r9
        Ldf:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Ld
        Le6:
            return r3
    }
}
