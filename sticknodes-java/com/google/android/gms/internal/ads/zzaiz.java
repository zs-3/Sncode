package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaiz {
    private static final byte[] zza = null;

    static {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = "OpusHead"
            byte[] r0 = r1.getBytes(r0)
            com.google.android.gms.internal.ads.zzaiz.zza = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzbk zza(com.google.android.gms.internal.ads.zzaim r12) {
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.zzain r0 = r12.zzb(r0)
            r1 = 1801812339(0x6b657973, float:2.7741754E26)
            com.google.android.gms.internal.ads.zzain r1 = r12.zzb(r1)
            r2 = 1768715124(0x696c7374, float:1.7865732E25)
            com.google.android.gms.internal.ads.zzain r12 = r12.zzb(r2)
            r2 = 0
            if (r0 == 0) goto Ld0
            if (r1 == 0) goto Ld0
            if (r12 == 0) goto Ld0
            com.google.android.gms.internal.ads.zzek r0 = r0.zza
            int r0 = zzg(r0)
            r3 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r0 == r3) goto L29
            goto Ld0
        L29:
            com.google.android.gms.internal.ads.zzek r0 = r1.zza
            r1 = 12
            r0.zzL(r1)
            int r1 = r0.zzg()
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
            r5 = 0
        L38:
            if (r5 >= r1) goto L4f
            int r6 = r0.zzg()
            r7 = 4
            r0.zzM(r7)
            int r6 = r6 + (-8)
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r6 = r0.zzB(r6, r7)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L38
        L4f:
            com.google.android.gms.internal.ads.zzek r12 = r12.zza
            r0 = 8
            r12.zzL(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L5b:
            int r6 = r12.zzb()
            if (r6 <= r0) goto Lc4
            int r6 = r12.zzd()
            int r7 = r12.zzg()
            int r6 = r6 + r7
            int r7 = r12.zzg()
            int r7 = r7 + (-1)
            if (r7 < 0) goto Laa
            if (r7 >= r1) goto Laa
            r7 = r3[r7]
        L76:
            int r8 = r12.zzd()
            if (r8 >= r6) goto La3
            int r9 = r12.zzg()
            int r10 = r12.zzg()
            r11 = 1684108385(0x64617461, float:1.6635614E22)
            if (r10 != r11) goto L9e
            int r8 = r12.zzg()
            int r10 = r12.zzg()
            int r9 = r9 + (-16)
            byte[] r11 = new byte[r9]
            r12.zzH(r11, r4, r9)
            com.google.android.gms.internal.ads.zzey r9 = new com.google.android.gms.internal.ads.zzey
            r9.<init>(r7, r11, r10, r8)
            goto La4
        L9e:
            int r8 = r8 + r9
            r12.zzL(r8)
            goto L76
        La3:
            r9 = r2
        La4:
            if (r9 == 0) goto Lc0
            r5.add(r9)
            goto Lc0
        Laa:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skipped metadata with unknown key index: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "AtomParsers"
            com.google.android.gms.internal.ads.zzea.zzf(r8, r7)
        Lc0:
            r12.zzL(r6)
            goto L5b
        Lc4:
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto Ld0
            com.google.android.gms.internal.ads.zzbk r12 = new com.google.android.gms.internal.ads.zzbk
            r12.<init>(r5)
            return r12
        Ld0:
            return r2
    }

    public static com.google.android.gms.internal.ads.zzbk zzb(com.google.android.gms.internal.ads.zzain r14) {
            com.google.android.gms.internal.ads.zzek r14 = r14.zza
            r0 = 8
            r14.zzL(r0)
            com.google.android.gms.internal.ads.zzbk r1 = new com.google.android.gms.internal.ads.zzbk
            r2 = 0
            com.google.android.gms.internal.ads.zzbj[] r3 = new com.google.android.gms.internal.ads.zzbj[r2]
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r3)
        L14:
            int r3 = r14.zzb()
            if (r3 < r0) goto L130
            int r3 = r14.zzd()
            int r6 = r14.zzg()
            int r6 = r6 + r3
            int r7 = r14.zzg()
            r8 = 1835365473(0x6d657461, float:4.4382975E27)
            r9 = 0
            if (r7 != r8) goto L80
            r14.zzL(r3)
            r14.zzM(r0)
            zze(r14)
        L36:
            int r3 = r14.zzd()
            if (r3 >= r6) goto L7a
            int r3 = r14.zzd()
            int r7 = r14.zzg()
            int r7 = r7 + r3
            int r8 = r14.zzg()
            r10 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r10) goto L76
            r14.zzL(r3)
            r14.zzM(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L59:
            int r8 = r14.zzd()
            if (r8 >= r7) goto L69
            com.google.android.gms.internal.ads.zzbj r8 = com.google.android.gms.internal.ads.zzaji.zza(r14)
            if (r8 == 0) goto L59
            r3.add(r8)
            goto L59
        L69:
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L70
            goto L7a
        L70:
            com.google.android.gms.internal.ads.zzbk r9 = new com.google.android.gms.internal.ads.zzbk
            r9.<init>(r3)
            goto L7a
        L76:
            r14.zzL(r7)
            goto L36
        L7a:
            com.google.android.gms.internal.ads.zzbk r1 = r1.zzd(r9)
            goto L12b
        L80:
            r8 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r7 != r8) goto L11e
            r14.zzL(r3)
            r3 = 12
            r14.zzM(r3)
        L8d:
            int r7 = r14.zzd()
            if (r7 >= r6) goto L119
            int r7 = r14.zzd()
            int r8 = r14.zzg()
            int r10 = r14.zzg()
            r11 = 1935766900(0x73617574, float:1.7862687E31)
            if (r10 != r11) goto L113
            r7 = 16
            if (r8 >= r7) goto Laa
            goto L119
        Laa:
            r7 = 4
            r14.zzM(r7)
            r7 = -1
            r8 = 0
            r10 = 0
        Lb1:
            r11 = 2
            r12 = 1
            if (r8 >= r11) goto Lc7
            int r11 = r14.zzm()
            int r13 = r14.zzm()
            if (r11 != 0) goto Lc1
            r7 = r13
            goto Lc4
        Lc1:
            if (r11 != r12) goto Lc4
            r10 = r13
        Lc4:
            int r8 = r8 + 1
            goto Lb1
        Lc7:
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r7 != r3) goto Lcf
            r3 = 240(0xf0, float:3.36E-43)
            goto L100
        Lcf:
            r11 = 13
            if (r7 != r11) goto Ld6
            r3 = 120(0x78, float:1.68E-43)
            goto L100
        Ld6:
            r11 = 21
            if (r7 == r11) goto Lde
        Lda:
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            goto L100
        Lde:
            int r7 = r14.zzb()
            if (r7 < r0) goto Lda
            int r7 = r14.zzd()
            int r7 = r7 + r0
            if (r7 <= r6) goto Lec
            goto Lda
        Lec:
            int r7 = r14.zzg()
            int r11 = r14.zzg()
            if (r7 < r3) goto Lda
            r3 = 1936877170(0x73726672, float:1.9204921E31)
            if (r11 == r3) goto Lfc
            goto Lda
        Lfc:
            int r3 = r14.zzn()
        L100:
            if (r3 != r8) goto L103
            goto L119
        L103:
            com.google.android.gms.internal.ads.zzbk r9 = new com.google.android.gms.internal.ads.zzbk
            com.google.android.gms.internal.ads.zzbj[] r7 = new com.google.android.gms.internal.ads.zzbj[r12]
            com.google.android.gms.internal.ads.zzahq r8 = new com.google.android.gms.internal.ads.zzahq
            float r3 = (float) r3
            r8.<init>(r3, r10)
            r7[r2] = r8
            r9.<init>(r4, r7)
            goto L119
        L113:
            int r7 = r7 + r8
            r14.zzL(r7)
            goto L8d
        L119:
            com.google.android.gms.internal.ads.zzbk r1 = r1.zzd(r9)
            goto L12b
        L11e:
            r3 = -1451722374(0xffffffffa978797a, float:-5.5172426E-14)
            if (r7 != r3) goto L12b
            com.google.android.gms.internal.ads.zzbk r3 = zzi(r14)
            com.google.android.gms.internal.ads.zzbk r1 = r1.zzd(r3)
        L12b:
            r14.zzL(r6)
            goto L14
        L130:
            return r1
    }

    public static com.google.android.gms.internal.ads.zzfe zzc(com.google.android.gms.internal.ads.zzek r11) {
            r0 = 8
            r11.zzL(r0)
            int r0 = r11.zzg()
            int r0 = com.google.android.gms.internal.ads.zzaio.zze(r0)
            if (r0 != 0) goto L18
            long r0 = r11.zzu()
            long r2 = r11.zzu()
            goto L20
        L18:
            long r0 = r11.zzt()
            long r2 = r11.zzt()
        L20:
            r5 = r0
            r7 = r2
            long r9 = r11.zzu()
            com.google.android.gms.internal.ads.zzfe r11 = new com.google.android.gms.internal.ads.zzfe
            r4 = r11
            r4.<init>(r5, r7, r9)
            return r11
    }

    public static java.util.List zzd(com.google.android.gms.internal.ads.zzaim r58, com.google.android.gms.internal.ads.zzadp r59, long r60, com.google.android.gms.internal.ads.zzy r62, boolean r63, boolean r64, com.google.android.gms.internal.ads.zzfxq r65) throws com.google.android.gms.internal.ads.zzbo {
            r0 = r58
            r11 = r62
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r14 = 0
        La:
            java.util.List r1 = r0.zzc
            int r1 = r1.size()
            if (r14 >= r1) goto Ld75
            java.util.List r1 = r0.zzc
            java.lang.Object r1 = r1.get(r14)
            r15 = r1
            com.google.android.gms.internal.ads.zzaim r15 = (com.google.android.gms.internal.ads.zzaim) r15
            int r1 = r15.zzd
            r2 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 == r2) goto L2b
            r3 = r59
            r0 = r65
            r2 = r12
            r31 = r14
            goto Ld64
        L2b:
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.gms.internal.ads.zzain r1 = r0.zzb(r1)
            java.util.Objects.requireNonNull(r1)
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzaim r2 = r15.zza(r2)
            java.util.Objects.requireNonNull(r2)
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.zzain r3 = r2.zzb(r3)
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzek r3 = r3.zza
            int r3 = zzg(r3)
            r4 = 1936684398(0x736f756e, float:1.8971874E31)
            r8 = -1
            if (r3 != r4) goto L57
            r5 = 1
            goto L7d
        L57:
            r4 = 1986618469(0x76696465, float:1.1834389E33)
            if (r3 != r4) goto L5e
            r5 = 2
            goto L7d
        L5e:
            r4 = 1952807028(0x74657874, float:7.272211E31)
            if (r3 == r4) goto L7c
            r4 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r3 == r4) goto L7c
            r4 = 1937072756(0x73756274, float:1.944137E31)
            if (r3 == r4) goto L7c
            r4 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r3 != r4) goto L73
            goto L7c
        L73:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 != r4) goto L7a
            r5 = 5
            goto L7d
        L7a:
            r5 = -1
            goto L7d
        L7c:
            r5 = 3
        L7d:
            if (r5 != r8) goto L89
            r0 = r65
            r32 = r12
            r31 = r14
            r1 = r15
        L86:
            r4 = 0
            goto Ld2e
        L89:
            r3 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.android.gms.internal.ads.zzain r3 = r15.zzb(r3)
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzek r3 = r3.zza
            r6 = 8
            r3.zzL(r6)
            int r17 = r3.zzg()
            int r17 = com.google.android.gms.internal.ads.zzaio.zze(r17)
            r13 = 16
            if (r17 != 0) goto La9
            r4 = 8
            goto Lab
        La9:
            r4 = 16
        Lab:
            r3.zzM(r4)
            int r4 = r3.zzg()
            r6 = 4
            r3.zzM(r6)
            int r20 = r3.zzd()
            r7 = 0
        Lbb:
            if (r17 != 0) goto Lbf
            r9 = 4
            goto Lc1
        Lbf:
            r9 = 8
        Lc1:
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 >= r9) goto Lea
            byte[] r9 = r3.zzN()
            int r25 = r20 + r7
            r9 = r9[r25]
            if (r9 == r8) goto Le7
            if (r17 != 0) goto Ld9
            long r25 = r3.zzu()
            goto Ldd
        Ld9:
            long r25 = r3.zzw()
        Ldd:
            r27 = 0
            int r7 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r7 != 0) goto Le4
            goto Led
        Le4:
            r8 = r25
            goto Lef
        Le7:
            int r7 = r7 + 1
            goto Lbb
        Lea:
            r3.zzM(r9)
        Led:
            r8 = r23
        Lef:
            r3.zzM(r13)
            int r7 = r3.zzg()
            int r10 = r3.zzg()
            r3.zzM(r6)
            int r6 = r3.zzg()
            int r3 = r3.zzg()
            r13 = 65536(0x10000, float:9.18355E-41)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            if (r7 != 0) goto L11b
            if (r10 != r13) goto L11a
            if (r6 != r0) goto L116
            if (r3 != 0) goto L114
            r0 = 90
            goto L13b
        L114:
            r6 = -65536(0xffffffffffff0000, float:NaN)
        L116:
            r7 = 0
            r10 = 65536(0x10000, float:9.18355E-41)
            goto L11b
        L11a:
            r7 = 0
        L11b:
            if (r7 != 0) goto L12e
            if (r10 != r0) goto L12b
            if (r6 != r13) goto L126
            if (r3 != 0) goto L127
            r0 = 270(0x10e, float:3.78E-43)
            goto L13b
        L126:
            r13 = r6
        L127:
            r7 = 0
            r10 = -65536(0xffffffffffff0000, float:NaN)
            goto L12f
        L12b:
            r13 = r6
            r7 = 0
            goto L12f
        L12e:
            r13 = r6
        L12f:
            if (r7 != r0) goto L13a
            if (r10 != 0) goto L13a
            if (r13 != 0) goto L13a
            if (r3 != r0) goto L13a
            r0 = 180(0xb4, float:2.52E-43)
            goto L13b
        L13a:
            r0 = 0
        L13b:
            com.google.android.gms.internal.ads.zzaix r13 = new com.google.android.gms.internal.ads.zzaix
            r13.<init>(r4, r8, r0)
            int r0 = (r60 > r23 ? 1 : (r60 == r23 ? 0 : -1))
            if (r0 != 0) goto L14b
            long r3 = com.google.android.gms.internal.ads.zzaix.zzc(r13)
            r31 = r3
            goto L14d
        L14b:
            r31 = r60
        L14d:
            com.google.android.gms.internal.ads.zzek r0 = r1.zza
            com.google.android.gms.internal.ads.zzfe r0 = zzc(r0)
            long r9 = r0.zzc
            int r0 = (r31 > r23 ? 1 : (r31 == r23 ? 0 : -1))
            if (r0 != 0) goto L15a
            goto L167
        L15a:
            r33 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r37 = java.math.RoundingMode.FLOOR
            r35 = r9
            long r0 = com.google.android.gms.internal.ads.zzeu.zzt(r31, r33, r35, r37)
            r23 = r0
        L167:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzaim r0 = r2.zza(r0)
            java.util.Objects.requireNonNull(r0)
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzaim r0 = r0.zza(r1)
            java.util.Objects.requireNonNull(r0)
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.android.gms.internal.ads.zzain r1 = r2.zzb(r1)
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzek r1 = r1.zza
            r6 = 8
            r1.zzL(r6)
            int r2 = r1.zzg()
            int r2 = com.google.android.gms.internal.ads.zzaio.zze(r2)
            if (r2 != 0) goto L199
            r3 = 8
            goto L19b
        L199:
            r3 = 16
        L19b:
            r1.zzM(r3)
            if (r2 != 0) goto L1a2
            r2 = 4
            goto L1a4
        L1a2:
            r2 = 8
        L1a4:
            long r3 = r1.zzu()
            r1.zzM(r2)
            int r1 = r1.zzq()
            int r2 = r1 >> 10
            int r7 = r1 >> 5
            r1 = r1 & 31
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r2 = r2 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            r8.append(r2)
            r2 = r7 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            r8.append(r2)
            int r1 = r1 + 96
            char r1 = (char) r1
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            android.util.Pair r8 = android.util.Pair.create(r2, r1)
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.android.gms.internal.ads.zzain r0 = r0.zzb(r1)
            if (r0 == 0) goto Ld6d
            int r7 = com.google.android.gms.internal.ads.zzaix.zza(r13)
            int r4 = com.google.android.gms.internal.ads.zzaix.zzb(r13)
            java.lang.Object r1 = r8.second
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.ads.zzek r0 = r0.zza
            r2 = 12
            r0.zzL(r2)
            int r1 = r0.zzg()
            r31 = r14
            com.google.android.gms.internal.ads.zzaiu r14 = new com.google.android.gms.internal.ads.zzaiu
            r14.<init>(r1)
            r32 = r12
            r12 = 0
        L207:
            if (r12 >= r1) goto Lc77
            r19 = r13
            int r13 = r0.zzd()
            r33 = r15
            int r15 = r0.zzg()
            if (r15 <= 0) goto L219
            r2 = 1
            goto L21a
        L219:
            r2 = 0
        L21a:
            java.lang.String r6 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzadf.zzb(r2, r6)
            int r2 = r0.zzg()
            r29 = r1
            r1 = 1635148593(0x61766331, float:2.840654E20)
            r30 = r4
            r4 = 1701733238(0x656e6376, float:7.035987E22)
            if (r2 == r1) goto L416
            r1 = 1635148595(0x61766333, float:2.8406544E20)
            if (r2 == r1) goto L416
            if (r2 == r4) goto L416
            r1 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r2 == r1) goto L416
            r1 = 1836070006(0x6d703476, float:4.646239E27)
            if (r2 == r1) goto L416
            r1 = 1752589105(0x68766331, float:4.6541277E24)
            if (r2 == r1) goto L416
            r1 = 1751479857(0x68657631, float:4.3344087E24)
            if (r2 == r1) goto L416
            r1 = 1932670515(0x73323633, float:1.4119387E31)
            if (r2 == r1) goto L416
            r1 = 1211250227(0x48323633, float:182488.8)
            if (r2 == r1) goto L416
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r2 == r1) goto L416
            r1 = 1987063865(0x76703039, float:1.2178997E33)
            if (r2 == r1) goto L416
            r1 = 1635135537(0x61763031, float:2.8383572E20)
            if (r2 == r1) goto L416
            r1 = 1685479798(0x64766176, float:1.8179687E22)
            if (r2 == r1) goto L416
            r1 = 1685479729(0x64766131, float:1.817961E22)
            if (r2 == r1) goto L416
            r1 = 1685481573(0x64766865, float:1.8181686E22)
            if (r2 == r1) goto L416
            r1 = 1685481521(0x64766831, float:1.8181627E22)
            if (r2 != r1) goto L279
            goto L416
        L279:
            r1 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r2 == r1) goto L3e5
            r1 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r2 == r1) goto L3e5
            r1 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r2 == r1) goto L3e5
            r1 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r2 == r1) goto L3e5
            r1 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r2 == r1) goto L3e5
            r1 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r2 == r1) goto L3e5
            r1 = 1685353315(0x64747363, float:1.803728E22)
            if (r2 == r1) goto L3e5
            r1 = 1685353317(0x64747365, float:1.8037282E22)
            if (r2 == r1) goto L3e5
            r1 = 1685353320(0x64747368, float:1.8037286E22)
            if (r2 == r1) goto L3e5
            r1 = 1685353324(0x6474736c, float:1.803729E22)
            if (r2 == r1) goto L3e5
            r1 = 1685353336(0x64747378, float:1.8037304E22)
            if (r2 == r1) goto L3e5
            r1 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r2 == r1) goto L3e5
            r1 = 1935767394(0x73617762, float:1.7863284E31)
            if (r2 == r1) goto L3e5
            r1 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r2 == r1) goto L3e5
            r1 = 1936684916(0x736f7774, float:1.89725E31)
            if (r2 == r1) goto L3e5
            r1 = 1953984371(0x74776f73, float:7.841539E31)
            if (r2 == r1) goto L3e5
            r1 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r2 == r1) goto L3e5
            r1 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r2 == r1) goto L3e5
            r1 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r2 == r1) goto L3e5
            r1 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r2 == r1) goto L3e5
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r2 == r1) goto L3e5
            r1 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r2 == r1) goto L3e5
            r1 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r2 == r1) goto L3e5
            r1 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r2 == r1) goto L3e5
            r1 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r2 == r1) goto L3e5
            r1 = 1767992678(0x69616d66, float:1.7032808E25)
            if (r2 != r1) goto L2fd
            goto L3e5
        L2fd:
            r1 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r2 == r1) goto L367
            r1 = 1954034535(0x74783367, float:7.865797E31)
            if (r2 == r1) goto L367
            r1 = 2004251764(0x77767474, float:4.998699E33)
            if (r2 == r1) goto L367
            r1 = 1937010800(0x73747070, float:1.9366469E31)
            if (r2 == r1) goto L367
            r1 = 1664495672(0x63363038, float:3.360782E21)
            if (r2 != r1) goto L317
            goto L367
        L317:
            r1 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r2 != r1) goto L33d
            int r1 = r13 + 16
            r0.zzL(r1)
            r1 = 0
            r0.zzy(r1)
            java.lang.String r2 = r0.zzy(r1)
            if (r2 == 0) goto L355
            com.google.android.gms.internal.ads.zzad r1 = new com.google.android.gms.internal.ads.zzad
            r1.<init>()
            r1.zzK(r7)
            r1.zzZ(r2)
            com.google.android.gms.internal.ads.zzaf r1 = r1.zzaf()
            r14.zzb = r1
            goto L355
        L33d:
            r1 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r2 != r1) goto L355
            com.google.android.gms.internal.ads.zzad r1 = new com.google.android.gms.internal.ads.zzad
            r1.<init>()
            r1.zzK(r7)
            java.lang.String r2 = "application/x-camera-motion"
            r1.zzZ(r2)
            com.google.android.gms.internal.ads.zzaf r1 = r1.zzaf()
            r14.zzb = r1
        L355:
            r27 = r3
            r18 = r5
            r6 = r7
            r42 = r8
            r21 = r9
            r17 = r12
            r38 = r13
            r4 = r14
            r45 = r15
            goto L3e2
        L367:
            int r1 = r13 + 16
            r0.zzL(r1)
            r1 = 1414810956(0x54544d4c, float:3.64731957E12)
            r34 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != r1) goto L37d
            java.lang.String r1 = "application/ttml+xml"
        L378:
            r38 = r34
            r2 = 0
            r6 = 1
            goto L3b3
        L37d:
            r1 = 1954034535(0x74783367, float:7.865797E31)
            if (r2 != r1) goto L399
            int r1 = r15 + (-16)
            byte[] r2 = new byte[r1]
            r4 = 0
            r0.zzH(r2, r4, r1)
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzo(r2)
            java.lang.String r2 = "application/x-quicktime-tx3g"
            r38 = r34
            r6 = 1
            r57 = r2
            r2 = r1
            r1 = r57
            goto L3b3
        L399:
            r1 = 2004251764(0x77767474, float:4.998699E33)
            if (r2 != r1) goto L3a1
            java.lang.String r1 = "application/x-mp4-vtt"
            goto L378
        L3a1:
            r1 = 1937010800(0x73747070, float:1.9366469E31)
            if (r2 != r1) goto L3ab
            r34 = 0
            java.lang.String r1 = "application/ttml+xml"
            goto L378
        L3ab:
            r6 = 1
            r14.zzd = r6
            java.lang.String r1 = "application/x-mp4-cea-608"
            r38 = r34
            r2 = 0
        L3b3:
            com.google.android.gms.internal.ads.zzad r4 = new com.google.android.gms.internal.ads.zzad
            r4.<init>()
            r4.zzK(r7)
            r4.zzZ(r1)
            r4.zzP(r3)
            r16 = r7
            r6 = r38
            r4.zzad(r6)
            r4.zzM(r2)
            com.google.android.gms.internal.ads.zzaf r1 = r4.zzaf()
            r14.zzb = r1
            r27 = r3
            r18 = r5
            r42 = r8
            r21 = r9
            r17 = r12
            r38 = r13
            r4 = r14
            r45 = r15
            r6 = r16
        L3e2:
            r7 = r30
            goto L412
        L3e5:
            r16 = r7
            r1 = r0
            r7 = 12
            r27 = r3
            r3 = r13
            r40 = r30
            r6 = 0
            r4 = r15
            r18 = r5
            r5 = r16
            r6 = r27
            r41 = r16
            r7 = r64
            r42 = r8
            r8 = r62
            r21 = r9
            r10 = 3
            r9 = r14
            r10 = r12
            zzm(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r17 = r12
            r38 = r13
            r4 = r14
            r45 = r15
            r7 = r40
            r6 = r41
        L412:
            r2 = -1
            r3 = 3
            goto Lc57
        L416:
            r27 = r3
            r18 = r5
            r41 = r7
            r42 = r8
            r21 = r9
            r40 = r30
            int r1 = r13 + 16
            r0.zzL(r1)
            r1 = 16
            r0.zzM(r1)
            int r3 = r0.zzq()
            int r5 = r0.zzq()
            r7 = 50
            r0.zzM(r7)
            int r7 = r0.zzd()
            if (r2 != r4) goto L46d
            android.util.Pair r2 = zzh(r0, r13, r15)
            if (r2 == 0) goto L465
            java.lang.Object r4 = r2.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r11 != 0) goto L451
            r8 = 0
            goto L45b
        L451:
            java.lang.Object r8 = r2.second
            com.google.android.gms.internal.ads.zzajs r8 = (com.google.android.gms.internal.ads.zzajs) r8
            java.lang.String r8 = r8.zzb
            com.google.android.gms.internal.ads.zzy r8 = r11.zzb(r8)
        L45b:
            com.google.android.gms.internal.ads.zzajs[] r9 = r14.zza
            java.lang.Object r2 = r2.second
            com.google.android.gms.internal.ads.zzajs r2 = (com.google.android.gms.internal.ads.zzajs) r2
            r9[r12] = r2
            r2 = r4
            goto L469
        L465:
            r8 = r11
            r2 = 1701733238(0x656e6376, float:7.035987E22)
        L469:
            r0.zzL(r7)
            goto L46e
        L46d:
            r8 = r11
        L46e:
            r4 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r2 != r4) goto L476
            java.lang.String r4 = "video/mpeg"
            goto L482
        L476:
            r4 = 1211250227(0x48323633, float:182488.8)
            if (r2 != r4) goto L481
            r2 = 1211250227(0x48323633, float:182488.8)
            java.lang.String r4 = "video/3gpp"
            goto L482
        L481:
            r4 = 0
        L482:
            r9 = 1065353216(0x3f800000, float:1.0)
            r37 = r2
            r34 = r3
            r30 = r5
            r1 = r7
            r20 = r8
            r17 = r12
            r3 = -1
            r5 = -1
            r8 = 8
            r9 = 0
            r10 = -1
            r11 = 0
            r12 = 8
            r16 = 0
            r25 = 0
            r28 = 0
            r35 = 0
            r36 = 0
            r43 = -1
            r44 = 1065353216(0x3f800000, float:1.0)
            r7 = r4
            r4 = -1
        L4a8:
            int r2 = r1 - r13
            if (r2 >= r15) goto Lbb4
            r0.zzL(r1)
            int r2 = r0.zzd()
            int r38 = r0.zzg()
            if (r38 != 0) goto L4c7
            int r38 = r0.zzd()
            r39 = r1
            int r1 = r38 - r13
            if (r1 != r15) goto L4c5
            goto Lbb4
        L4c5:
            r1 = 0
            goto L4cb
        L4c7:
            r39 = r1
            r1 = r38
        L4cb:
            if (r1 <= 0) goto L4d1
            r38 = r13
            r13 = 1
            goto L4d4
        L4d1:
            r38 = r13
            r13 = 0
        L4d4:
            com.google.android.gms.internal.ads.zzadf.zzb(r13, r6)
            int r13 = r0.zzg()
            r45 = r15
            r15 = 1635148611(0x61766343, float:2.8406573E20)
            if (r13 != r15) goto L52a
            int r2 = r2 + 8
            if (r7 != 0) goto L4e8
            r3 = 1
            goto L4e9
        L4e8:
            r3 = 0
        L4e9:
            r15 = 0
            com.google.android.gms.internal.ads.zzadf.zzb(r3, r15)
            r0.zzL(r2)
            com.google.android.gms.internal.ads.zzacf r2 = com.google.android.gms.internal.ads.zzacf.zza(r0)
            java.util.List r3 = r2.zza
            int r5 = r2.zzb
            r14.zzc = r5
            if (r25 != 0) goto L502
            float r5 = r2.zzk
            r44 = r5
            r5 = 0
            goto L503
        L502:
            r5 = 1
        L503:
            java.lang.String r7 = r2.zzl
            int r8 = r2.zzj
            int r9 = r2.zzg
            int r10 = r2.zzh
            int r12 = r2.zzi
            int r13 = r2.zze
            int r2 = r2.zzf
            java.lang.String r25 = "video/avc"
            r49 = r6
            r35 = r7
            r43 = r8
            r50 = r10
            r10 = r12
            r12 = r13
            r46 = r14
            r7 = r25
            r8 = r2
            r25 = r5
            r5 = r9
            r2 = -1
            r9 = r3
        L527:
            r3 = 3
            goto Lba6
        L52a:
            r15 = 1752589123(0x68766343, float:4.6541328E24)
            if (r13 != r15) goto L582
            int r2 = r2 + 8
            if (r7 != 0) goto L535
            r3 = 1
            goto L536
        L535:
            r3 = 0
        L536:
            r5 = 0
            com.google.android.gms.internal.ads.zzadf.zzb(r3, r5)
            r0.zzL(r2)
            com.google.android.gms.internal.ads.zzadq r2 = com.google.android.gms.internal.ads.zzadq.zza(r0)
            java.util.List r3 = r2.zza
            int r5 = r2.zzb
            r14.zzc = r5
            if (r25 != 0) goto L54f
            float r5 = r2.zzi
            r44 = r5
            r5 = 0
            goto L550
        L54f:
            r5 = 1
        L550:
            int r7 = r2.zzj
            java.lang.String r8 = r2.zzk
            int r9 = r2.zzh
            r15 = -1
            if (r9 == r15) goto L55b
            r10 = r9
            goto L55c
        L55b:
            r10 = r4
        L55c:
            int r4 = r2.zze
            int r9 = r2.zzf
            int r11 = r2.zzg
            int r12 = r2.zzc
            int r13 = r2.zzd
            com.google.android.gms.internal.ads.zzfp r2 = r2.zzl
            java.lang.String r25 = "video/hevc"
            r49 = r6
            r43 = r7
            r35 = r8
            r50 = r9
            r8 = r13
            r46 = r14
            r7 = r25
            r9 = r3
            r25 = r5
            r3 = 3
            r5 = r4
            r4 = r10
            r10 = r11
            r11 = r2
            r2 = -1
            goto Lba6
        L582:
            r15 = 1818785347(0x6c687643, float:1.12411706E27)
            if (r13 != r15) goto L62e
            int r2 = r2 + 8
            java.lang.String r13 = "video/hevc"
            boolean r7 = r13.equals(r7)
            java.lang.String r13 = "lhvC must follow hvcC atom"
            com.google.android.gms.internal.ads.zzadf.zzb(r7, r13)
            if (r11 == 0) goto L5a3
            com.google.android.gms.internal.ads.zzgax r7 = r11.zza
            int r7 = r7.size()
            r15 = 2
            if (r7 < r15) goto L5a1
            r7 = 1
            goto L5a6
        L5a1:
            r7 = 0
            goto L5a6
        L5a3:
            r15 = 2
            r7 = 0
            r11 = 0
        L5a6:
            java.lang.String r13 = "must have at least two layers"
            com.google.android.gms.internal.ads.zzadf.zzb(r7, r13)
            r0.zzL(r2)
            java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.ads.zzadq r2 = com.google.android.gms.internal.ads.zzadq.zzb(r0, r11)
            int r7 = r14.zzc
            int r13 = r2.zzb
            if (r7 != r13) goto L5bd
            r7 = 1
            goto L5be
        L5bd:
            r7 = 0
        L5be:
            java.lang.String r13 = "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"
            com.google.android.gms.internal.ads.zzadf.zzb(r7, r13)
            int r7 = r2.zze
            r13 = -1
            if (r7 == r13) goto L5d2
            if (r5 != r7) goto L5cc
            r7 = 1
            goto L5cd
        L5cc:
            r7 = 0
        L5cd:
            java.lang.String r15 = "colorSpace must be the same for both views"
            com.google.android.gms.internal.ads.zzadf.zzb(r7, r15)
        L5d2:
            int r7 = r2.zzf
            if (r7 == r13) goto L5e0
            if (r3 != r7) goto L5da
            r7 = 1
            goto L5db
        L5da:
            r7 = 0
        L5db:
            java.lang.String r15 = "colorRange must be the same for both views"
            com.google.android.gms.internal.ads.zzadf.zzb(r7, r15)
        L5e0:
            int r7 = r2.zzg
            if (r7 == r13) goto L5ee
            if (r10 != r7) goto L5e8
            r7 = 1
            goto L5e9
        L5e8:
            r7 = 0
        L5e9:
            java.lang.String r13 = "colorTransfer must be the same for both views"
            com.google.android.gms.internal.ads.zzadf.zzb(r7, r13)
        L5ee:
            int r7 = r2.zzc
            if (r12 != r7) goto L5f4
            r7 = 1
            goto L5f5
        L5f4:
            r7 = 0
        L5f5:
            java.lang.String r13 = "bitdepthLuma must be the same for both views"
            com.google.android.gms.internal.ads.zzadf.zzb(r7, r13)
            int r7 = r2.zzd
            if (r8 != r7) goto L600
            r7 = 1
            goto L601
        L600:
            r7 = 0
        L601:
            java.lang.String r13 = "bitdepthChroma must be the same for both views"
            com.google.android.gms.internal.ads.zzadf.zzb(r7, r13)
            if (r9 == 0) goto L61a
            com.google.android.gms.internal.ads.zzgau r7 = new com.google.android.gms.internal.ads.zzgau
            r7.<init>()
            r7.zzh(r9)
            java.util.List r9 = r2.zza
            r7.zzh(r9)
            com.google.android.gms.internal.ads.zzgax r9 = r7.zzi()
            goto L620
        L61a:
            java.lang.String r7 = "initializationData must be already set from hvcC atom"
            r13 = 0
            com.google.android.gms.internal.ads.zzadf.zzb(r13, r7)
        L620:
            java.lang.String r2 = r2.zzk
            java.lang.String r7 = "video/mv-hevc"
            r35 = r2
            r50 = r3
            r49 = r6
            r46 = r14
            goto L9b9
        L62e:
            r15 = 1986361461(0x76657875, float:1.16355385E33)
            if (r13 != r15) goto L753
            int r13 = r2 + 8
            r0.zzL(r13)
            int r13 = r0.zzd()
            r15 = r13
            r46 = r14
            r13 = 0
        L640:
            int r14 = r15 - r2
            if (r14 >= r1) goto L6ec
            r0.zzL(r15)
            int r14 = r0.zzg()
            if (r14 <= 0) goto L651
            r47 = r8
            r8 = 1
            goto L654
        L651:
            r47 = r8
            r8 = 0
        L654:
            com.google.android.gms.internal.ads.zzadf.zzb(r8, r6)
            int r8 = r0.zzg()
            r48 = r12
            r12 = 1702454643(0x65796573, float:7.360879E22)
            if (r8 != r12) goto L6d8
            int r8 = r15 + 8
            r0.zzL(r8)
            int r8 = r0.zzd()
        L66b:
            int r12 = r8 - r15
            if (r12 >= r14) goto L6cf
            r0.zzL(r8)
            int r12 = r0.zzg()
            if (r12 <= 0) goto L67a
            r13 = 1
            goto L67b
        L67a:
            r13 = 0
        L67b:
            com.google.android.gms.internal.ads.zzadf.zzb(r13, r6)
            int r13 = r0.zzg()
            r49 = r6
            r6 = 1937011305(0x73747269, float:1.936708E31)
            if (r13 != r6) goto L6c4
            r6 = 4
            r0.zzM(r6)
            int r8 = r0.zzm()
            r8 = r8 & 15
            r12 = r8 & 1
            r13 = r8 & 2
            r6 = 2
            if (r13 != r6) goto L69c
            r6 = 1
            goto L69d
        L69c:
            r6 = 0
        L69d:
            r13 = r8 & 8
            r50 = r3
            r3 = 8
            if (r13 != r3) goto L6a7
            r13 = 1
            goto L6a8
        L6a7:
            r13 = 0
        L6a8:
            r8 = r8 & 4
            r3 = 4
            if (r8 != r3) goto L6af
            r3 = 1
            goto L6b0
        L6af:
            r3 = 0
        L6b0:
            r8 = 1
            if (r8 == r12) goto L6b5
            r12 = 0
            goto L6b6
        L6b5:
            r12 = 1
        L6b6:
            com.google.android.gms.internal.ads.zzair r8 = new com.google.android.gms.internal.ads.zzair
            r51 = r9
            com.google.android.gms.internal.ads.zzait r9 = new com.google.android.gms.internal.ads.zzait
            r9.<init>(r12, r6, r13, r3)
            r8.<init>(r9)
            r13 = r8
            goto L6de
        L6c4:
            r50 = r3
            r51 = r9
            r3 = 1
            int r8 = r8 + r12
            r6 = r49
            r3 = r50
            goto L66b
        L6cf:
            r50 = r3
            r49 = r6
            r51 = r9
            r3 = 1
            r13 = 0
            goto L6df
        L6d8:
            r50 = r3
            r49 = r6
            r51 = r9
        L6de:
            r3 = 1
        L6df:
            int r15 = r15 + r14
            r8 = r47
            r12 = r48
            r6 = r49
            r3 = r50
            r9 = r51
            goto L640
        L6ec:
            r50 = r3
            r49 = r6
            r47 = r8
            r51 = r9
            r48 = r12
            r3 = 1
            if (r13 != 0) goto L6fb
            r2 = 0
            goto L700
        L6fb:
            com.google.android.gms.internal.ads.zzaiy r2 = new com.google.android.gms.internal.ads.zzaiy
            r2.<init>(r13)
        L700:
            if (r2 == 0) goto L74d
            if (r11 == 0) goto L72b
            com.google.android.gms.internal.ads.zzgax r6 = r11.zza
            int r6 = r6.size()
            r8 = 2
            if (r6 < r8) goto L729
            boolean r6 = r2.zzb()
            java.lang.String r8 = "both eye views must be marked as available"
            com.google.android.gms.internal.ads.zzadf.zzb(r6, r8)
            com.google.android.gms.internal.ads.zzair r2 = com.google.android.gms.internal.ads.zzaiy.zza(r2)
            com.google.android.gms.internal.ads.zzait r2 = com.google.android.gms.internal.ads.zzair.zza(r2)
            boolean r2 = com.google.android.gms.internal.ads.zzait.zza(r2)
            r2 = r2 ^ r3
            java.lang.String r6 = "for MV-HEVC, eye_views_reversed must be set to false"
            com.google.android.gms.internal.ads.zzadf.zzb(r2, r6)
            goto L74d
        L729:
            r6 = -1
            goto L72d
        L72b:
            r6 = -1
            r11 = 0
        L72d:
            if (r4 != r6) goto L9b3
            com.google.android.gms.internal.ads.zzair r2 = com.google.android.gms.internal.ads.zzaiy.zza(r2)
            com.google.android.gms.internal.ads.zzait r2 = com.google.android.gms.internal.ads.zzair.zza(r2)
            boolean r2 = com.google.android.gms.internal.ads.zzait.zza(r2)
            r8 = r47
            r12 = r48
            r9 = r51
            if (r3 == r2) goto L748
            r2 = -1
            r3 = 3
            r4 = 4
            goto Lba6
        L748:
            r2 = -1
            r3 = 3
            r4 = 5
            goto Lba6
        L74d:
            r56 = r11
            r2 = -1
            r3 = 3
            goto Lb9e
        L753:
            r50 = r3
            r49 = r6
            r47 = r8
            r51 = r9
            r48 = r12
            r46 = r14
            r3 = 1
            r6 = 1685480259(0x64766343, float:1.8180206E22)
            if (r13 == r6) goto Lb8e
            r6 = 1685485123(0x64767643, float:1.8185683E22)
            if (r13 != r6) goto L76c
            goto Lb8e
        L76c:
            r6 = 1987076931(0x76706343, float:1.21891066E33)
            if (r13 != r6) goto L7bb
            if (r7 != 0) goto L776
            r5 = 0
            r6 = 1
            goto L778
        L776:
            r5 = 0
            r6 = 0
        L778:
            com.google.android.gms.internal.ads.zzadf.zzb(r6, r5)
            int r2 = r2 + 12
            r0.zzL(r2)
            r2 = 2
            r0.zzM(r2)
            int r2 = r0.zzm()
            int r5 = r2 >> 4
            r2 = r2 & r3
            int r6 = r0.zzm()
            int r7 = r0.zzm()
            int r6 = com.google.android.gms.internal.ads.zzo.zza(r6)
            if (r3 == r2) goto L79b
            r2 = 2
            goto L79c
        L79b:
            r2 = 1
        L79c:
            int r7 = com.google.android.gms.internal.ads.zzo.zzb(r7)
            r8 = 1987063864(0x76703038, float:1.21789965E33)
            r9 = r37
            if (r9 != r8) goto L7aa
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            goto L7ac
        L7aa:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
        L7ac:
            r50 = r2
            r12 = r5
            r10 = r7
            r7 = r8
            r37 = r9
            r9 = r51
            r2 = -1
            r3 = 3
            r8 = r12
            r5 = r6
            goto Lba6
        L7bb:
            r9 = r37
            r6 = 1635135811(0x61763143, float:2.8384055E20)
            java.lang.String r8 = "AtomParsers"
            if (r13 != r6) goto L98c
            int r2 = r2 + 8
            int r5 = r1 + (-8)
            byte[] r6 = new byte[r5]
            r12 = 0
            r0.zzH(r6, r12, r5)
            com.google.android.gms.internal.ads.zzgax r5 = com.google.android.gms.internal.ads.zzgax.zzo(r6)
            r0.zzL(r2)
            com.google.android.gms.internal.ads.zzm r2 = new com.google.android.gms.internal.ads.zzm
            r2.<init>()
            com.google.android.gms.internal.ads.zzej r6 = new com.google.android.gms.internal.ads.zzej
            byte[] r7 = r0.zzN()
            int r10 = r7.length
            r6.<init>(r7, r10)
            int r7 = r0.zzd()
            r10 = 8
            int r7 = r7 * 8
            r6.zzl(r7)
            r6.zzo(r3)
            r14 = 3
            int r7 = r6.zzd(r14)
            r10 = 6
            r6.zzn(r10)
            boolean r10 = r6.zzp()
            boolean r13 = r6.zzp()
            r15 = 10
            r12 = 2
            if (r7 != r12) goto L818
            if (r10 == 0) goto L816
            if (r3 == r13) goto L80d
            goto L80f
        L80d:
            r15 = 12
        L80f:
            r2.zzf(r15)
            r2.zza(r15)
            goto L824
        L816:
            r7 = 2
            r10 = 0
        L818:
            if (r7 > r12) goto L824
            if (r3 == r10) goto L81e
            r15 = 8
        L81e:
            r2.zzf(r15)
            r2.zza(r15)
        L824:
            r7 = 13
            r6.zzn(r7)
            r6.zzm()
            r10 = 4
            int r12 = r6.zzd(r10)
            if (r12 == r3) goto L84e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Unsupported obu_type: "
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.google.android.gms.internal.ads.zzea.zze(r8, r6)
            com.google.android.gms.internal.ads.zzo r2 = r2.zzg()
        L84b:
            r12 = 4
            goto L972
        L84e:
            boolean r10 = r6.zzp()
            if (r10 == 0) goto L85e
            java.lang.String r6 = "Unsupported obu_extension_flag"
            com.google.android.gms.internal.ads.zzea.zze(r8, r6)
            com.google.android.gms.internal.ads.zzo r2 = r2.zzg()
            goto L84b
        L85e:
            boolean r10 = r6.zzp()
            r6.zzm()
            if (r10 == 0) goto L87b
            r10 = 8
            int r12 = r6.zzd(r10)
            r10 = 127(0x7f, float:1.78E-43)
            if (r12 <= r10) goto L87b
            java.lang.String r6 = "Excessive obu_size"
            com.google.android.gms.internal.ads.zzea.zze(r8, r6)
            com.google.android.gms.internal.ads.zzo r2 = r2.zzg()
            goto L84b
        L87b:
            int r10 = r6.zzd(r14)
            r6.zzm()
            boolean r12 = r6.zzp()
            if (r12 == 0) goto L892
            java.lang.String r6 = "Unsupported reduced_still_picture_header"
            com.google.android.gms.internal.ads.zzea.zze(r8, r6)
            com.google.android.gms.internal.ads.zzo r2 = r2.zzg()
            goto L84b
        L892:
            boolean r12 = r6.zzp()
            if (r12 == 0) goto L8a2
            java.lang.String r6 = "Unsupported timing_info_present_flag"
            com.google.android.gms.internal.ads.zzea.zze(r8, r6)
            com.google.android.gms.internal.ads.zzo r2 = r2.zzg()
            goto L84b
        L8a2:
            boolean r12 = r6.zzp()
            if (r12 == 0) goto L8b2
            java.lang.String r6 = "Unsupported initial_display_delay_present_flag"
            com.google.android.gms.internal.ads.zzea.zze(r8, r6)
            com.google.android.gms.internal.ads.zzo r2 = r2.zzg()
            goto L84b
        L8b2:
            r12 = 5
            int r8 = r6.zzd(r12)
            r13 = 0
        L8b8:
            if (r13 > r8) goto L8cd
            r15 = 12
            r6.zzn(r15)
            int r15 = r6.zzd(r12)
            r12 = 7
            if (r15 <= r12) goto L8c9
            r6.zzm()
        L8c9:
            int r13 = r13 + 1
            r12 = 5
            goto L8b8
        L8cd:
            r12 = 4
            int r8 = r6.zzd(r12)
            int r13 = r6.zzd(r12)
            int r8 = r8 + r3
            r6.zzn(r8)
            int r13 = r13 + r3
            r6.zzn(r13)
            boolean r8 = r6.zzp()
            if (r8 == 0) goto L8e8
            r8 = 7
            r6.zzn(r8)
        L8e8:
            r8 = 7
            r6.zzn(r8)
            boolean r8 = r6.zzp()
            if (r8 == 0) goto L8f6
            r13 = 2
            r6.zzn(r13)
        L8f6:
            boolean r13 = r6.zzp()
            if (r13 == 0) goto L8fd
            goto L903
        L8fd:
            int r13 = r6.zzd(r3)
            if (r13 <= 0) goto L90c
        L903:
            boolean r13 = r6.zzp()
            if (r13 != 0) goto L90c
            r6.zzn(r3)
        L90c:
            if (r8 == 0) goto L911
            r6.zzn(r14)
        L911:
            r6.zzn(r14)
            boolean r8 = r6.zzp()
            r13 = 2
            if (r10 != r13) goto L921
            if (r8 == 0) goto L925
            r6.zzm()
            goto L925
        L921:
            if (r10 != r3) goto L925
        L923:
            r8 = 0
            goto L92c
        L925:
            boolean r8 = r6.zzp()
            if (r8 == 0) goto L923
            r8 = 1
        L92c:
            boolean r10 = r6.zzp()
            if (r10 == 0) goto L96e
            r10 = 8
            int r13 = r6.zzd(r10)
            int r15 = r6.zzd(r10)
            int r37 = r6.zzd(r10)
            if (r8 != 0) goto L950
            if (r13 != r3) goto L950
            if (r15 != r7) goto L94d
            if (r37 != 0) goto L94e
            r6 = 1
            r7 = 1
            r8 = 13
            goto L958
        L94d:
            r7 = r15
        L94e:
            r13 = 1
            goto L951
        L950:
            r7 = r15
        L951:
            int r6 = r6.zzd(r3)
            r8 = r7
            r7 = r6
            r6 = r13
        L958:
            int r6 = com.google.android.gms.internal.ads.zzo.zza(r6)
            r2.zzc(r6)
            if (r7 != r3) goto L963
            r7 = 1
            goto L964
        L963:
            r7 = 2
        L964:
            r2.zzb(r7)
            int r6 = com.google.android.gms.internal.ads.zzo.zzb(r8)
            r2.zzd(r6)
        L96e:
            com.google.android.gms.internal.ads.zzo r2 = r2.zzg()
        L972:
            int r6 = r2.zzf
            int r7 = r2.zzg
            int r8 = r2.zzb
            int r10 = r2.zzc
            int r2 = r2.zzd
            java.lang.String r13 = "video/av01"
            r12 = r6
            r37 = r9
            r50 = r10
            r3 = 3
            r10 = r2
            r9 = r5
            r5 = r8
            r2 = -1
            r8 = r7
            r7 = r13
            goto Lba6
        L98c:
            r12 = 4
            r14 = 3
            r6 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r13 != r6) goto L9bc
            if (r36 != 0) goto L99a
            java.nio.ByteBuffer r2 = zzl()
            goto L99c
        L99a:
            r2 = r36
        L99c:
            r6 = 21
            r2.position(r6)
            short r6 = r0.zzE()
            r2.putShort(r6)
            short r6 = r0.zzE()
            r2.putShort(r6)
            r36 = r2
            r37 = r9
        L9b3:
            r8 = r47
            r12 = r48
            r9 = r51
        L9b9:
            r2 = -1
            goto L527
        L9bc:
            r6 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r13 != r6) goto La2f
            if (r36 != 0) goto L9c8
            java.nio.ByteBuffer r2 = zzl()
            goto L9ca
        L9c8:
            r2 = r36
        L9ca:
            short r6 = r0.zzE()
            short r8 = r0.zzE()
            short r13 = r0.zzE()
            short r15 = r0.zzE()
            short r12 = r0.zzE()
            short r14 = r0.zzE()
            short r3 = r0.zzE()
            r37 = r9
            short r9 = r0.zzE()
            long r52 = r0.zzu()
            long r54 = r0.zzu()
            r56 = r11
            r11 = 1
            r2.position(r11)
            r2.putShort(r12)
            r2.putShort(r14)
            r2.putShort(r6)
            r2.putShort(r8)
            r2.putShort(r13)
            r2.putShort(r15)
            r2.putShort(r3)
            r2.putShort(r9)
            r8 = 10000(0x2710, double:4.9407E-320)
            long r8 = r52 / r8
            int r3 = (int) r8
            short r3 = (short) r3
            r2.putShort(r3)
            r8 = 10000(0x2710, double:4.9407E-320)
            long r8 = r54 / r8
            int r3 = (int) r8
            short r3 = (short) r3
            r2.putShort(r3)
            r36 = r2
        La26:
            r8 = r47
            r12 = r48
            r9 = r51
        La2c:
            r11 = r56
            goto L9b9
        La2f:
            r37 = r9
            r56 = r11
            r3 = 1681012275(0x64323633, float:1.3149704E22)
            if (r13 != r3) goto La46
            if (r7 != 0) goto La3d
            r3 = 0
            r6 = 1
            goto La3f
        La3d:
            r3 = 0
            r6 = 0
        La3f:
            com.google.android.gms.internal.ads.zzadf.zzb(r6, r3)
            java.lang.String r2 = "video/3gpp"
            r7 = r2
            goto La26
        La46:
            r3 = 0
            r6 = 1702061171(0x65736473, float:7.183675E22)
            if (r13 != r6) goto La73
            if (r7 != 0) goto La50
            r6 = 1
            goto La51
        La50:
            r6 = 0
        La51:
            com.google.android.gms.internal.ads.zzadf.zzb(r6, r3)
            com.google.android.gms.internal.ads.zzaiq r2 = zzj(r0, r2)
            java.lang.String r3 = com.google.android.gms.internal.ads.zzaiq.zzc(r2)
            byte[] r6 = com.google.android.gms.internal.ads.zzaiq.zzd(r2)
            if (r6 == 0) goto La6f
            com.google.android.gms.internal.ads.zzgax r6 = com.google.android.gms.internal.ads.zzgax.zzo(r6)
            r16 = r2
            r7 = r3
            r9 = r6
            r8 = r47
            r12 = r48
            goto La2c
        La6f:
            r16 = r2
            r7 = r3
            goto La26
        La73:
            r3 = 1885434736(0x70617370, float:2.7909473E29)
            if (r13 != r3) goto La98
            int r2 = r2 + 8
            r0.zzL(r2)
            int r2 = r0.zzp()
            int r3 = r0.zzp()
            float r2 = (float) r2
            float r3 = (float) r3
            float r2 = r2 / r3
            r44 = r2
            r8 = r47
            r12 = r48
            r9 = r51
            r11 = r56
            r2 = -1
            r3 = 3
            r25 = 1
            goto Lba6
        La98:
            r3 = 1937126244(0x73763364, float:1.9506033E31)
            if (r13 != r3) goto Lad0
            int r3 = r2 + 8
        La9f:
            int r6 = r3 - r2
            if (r6 >= r1) goto Lac2
            r0.zzL(r3)
            int r6 = r0.zzg()
            int r6 = r6 + r3
            int r8 = r0.zzg()
            r9 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r8 != r9) goto Lac0
            byte[] r2 = r0.zzN()
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r3, r6)
            r28 = r2
            goto La26
        Lac0:
            r3 = r6
            goto La9f
        Lac2:
            r8 = r47
            r12 = r48
            r9 = r51
            r11 = r56
            r2 = -1
            r3 = 3
            r28 = 0
            goto Lba6
        Lad0:
            r2 = 1936995172(0x73743364, float:1.9347576E31)
            if (r13 != r2) goto Lb1f
            int r2 = r0.zzm()
            r3 = 3
            r0.zzM(r3)
            if (r2 != 0) goto Lb8c
            int r2 = r0.zzm()
            if (r2 == 0) goto Lb13
            r6 = 1
            if (r2 == r6) goto Lb07
            r6 = 2
            if (r2 == r6) goto Lafb
            if (r2 == r3) goto Laef
            goto Lb8c
        Laef:
            r8 = r47
            r12 = r48
            r9 = r51
            r11 = r56
            r2 = -1
            r4 = 3
            goto Lba6
        Lafb:
            r8 = r47
            r12 = r48
            r9 = r51
            r11 = r56
            r2 = -1
            r4 = 2
            goto Lba6
        Lb07:
            r8 = r47
            r12 = r48
            r9 = r51
            r11 = r56
            r2 = -1
            r4 = 1
            goto Lba6
        Lb13:
            r8 = r47
            r12 = r48
            r9 = r51
            r11 = r56
            r2 = -1
            r4 = 0
            goto Lba6
        Lb1f:
            r3 = 3
            r2 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r13 != r2) goto Lb8c
            r2 = -1
            if (r5 != r2) goto Lb9e
            if (r10 != r2) goto Lb82
            int r5 = r0.zzg()
            r6 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r5 == r6) goto Lb51
            r6 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r5 != r6) goto Lb39
            goto Lb51
        Lb39:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzaio.zzf(r5)
            java.lang.String r6 = "Unsupported color type: "
            java.lang.String r5 = r6.concat(r5)
            com.google.android.gms.internal.ads.zzea.zzf(r8, r5)
            r8 = r47
            r12 = r48
            r9 = r51
            r11 = r56
            r5 = -1
            r10 = -1
            goto Lba6
        Lb51:
            int r5 = r0.zzq()
            int r6 = r0.zzq()
            r8 = 2
            r0.zzM(r8)
            r8 = 19
            if (r1 != r8) goto Lb6f
            int r1 = r0.zzm()
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto Lb6d
            r1 = 19
            r8 = 1
            goto Lb70
        Lb6d:
            r1 = 19
        Lb6f:
            r8 = 0
        Lb70:
            int r5 = com.google.android.gms.internal.ads.zzo.zza(r5)
            r9 = 1
            if (r9 == r8) goto Lb79
            r8 = 2
            goto Lb7a
        Lb79:
            r8 = 1
        Lb7a:
            int r6 = com.google.android.gms.internal.ads.zzo.zzb(r6)
            r10 = r6
            r50 = r8
            goto Lb9e
        Lb82:
            r8 = r47
            r12 = r48
            r9 = r51
            r11 = r56
            r5 = -1
            goto Lba6
        Lb8c:
            r2 = -1
            goto Lb9e
        Lb8e:
            r56 = r11
            r2 = -1
            r3 = 3
            com.google.android.gms.internal.ads.zzacx r6 = com.google.android.gms.internal.ads.zzacx.zza(r0)
            if (r6 == 0) goto Lb9e
            java.lang.String r6 = r6.zza
            java.lang.String r7 = "video/dolby-vision"
            r35 = r6
        Lb9e:
            r8 = r47
            r12 = r48
            r9 = r51
            r11 = r56
        Lba6:
            int r1 = r39 + r1
            r13 = r38
            r15 = r45
            r14 = r46
            r6 = r49
            r3 = r50
            goto L4a8
        Lbb4:
            r50 = r3
            r47 = r8
            r51 = r9
            r48 = r12
            r38 = r13
            r46 = r14
            r45 = r15
            r2 = -1
            r3 = 3
            if (r7 != 0) goto Lbce
            r7 = r40
            r6 = r41
            r4 = r46
            goto Lc57
        Lbce:
            com.google.android.gms.internal.ads.zzad r1 = new com.google.android.gms.internal.ads.zzad
            r1.<init>()
            r6 = r41
            r1.zzK(r6)
            r1.zzZ(r7)
            r7 = r35
            r1.zzA(r7)
            r7 = r34
            r1.zzae(r7)
            r7 = r30
            r1.zzJ(r7)
            r9 = r44
            r1.zzV(r9)
            r7 = r40
            r1.zzY(r7)
            r8 = r28
            r1.zzW(r8)
            r1.zzac(r4)
            r9 = r51
            r1.zzM(r9)
            r4 = r43
            r1.zzR(r4)
            r8 = r20
            r1.zzF(r8)
            com.google.android.gms.internal.ads.zzm r4 = new com.google.android.gms.internal.ads.zzm
            r4.<init>()
            r4.zzc(r5)
            r5 = r50
            r4.zzb(r5)
            r4.zzd(r10)
            if (r36 == 0) goto Lc22
            byte[] r5 = r36.array()
            goto Lc23
        Lc22:
            r5 = 0
        Lc23:
            r4.zze(r5)
            r12 = r48
            r4.zzf(r12)
            r8 = r47
            r4.zza(r8)
            com.google.android.gms.internal.ads.zzo r4 = r4.zzg()
            r1.zzB(r4)
            if (r16 == 0) goto Lc4f
            long r4 = com.google.android.gms.internal.ads.zzaiq.zza(r16)
            int r4 = com.google.android.gms.internal.ads.zzgdu.zze(r4)
            r1.zzy(r4)
            long r4 = com.google.android.gms.internal.ads.zzaiq.zzb(r16)
            int r4 = com.google.android.gms.internal.ads.zzgdu.zze(r4)
            r1.zzU(r4)
        Lc4f:
            com.google.android.gms.internal.ads.zzaf r1 = r1.zzaf()
            r4 = r46
            r4.zzb = r1
        Lc57:
            int r13 = r38 + r45
            r0.zzL(r13)
            int r12 = r17 + 1
            r11 = r62
            r14 = r4
            r4 = r7
            r5 = r18
            r13 = r19
            r9 = r21
            r3 = r27
            r1 = r29
            r15 = r33
            r8 = r42
            r2 = 12
            r7 = r6
            r6 = 8
            goto L207
        Lc77:
            r18 = r5
            r42 = r8
            r21 = r9
            r19 = r13
            r4 = r14
            r33 = r15
            if (r63 != 0) goto Lcf8
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r1 = r33
            com.google.android.gms.internal.ads.zzaim r0 = r1.zza(r0)
            if (r0 == 0) goto Lcfa
            r2 = 1701606260(0x656c7374, float:6.9788014E22)
            com.google.android.gms.internal.ads.zzain r0 = r0.zzb(r2)
            if (r0 != 0) goto Lc9a
            r0 = 0
            goto Lce9
        Lc9a:
            com.google.android.gms.internal.ads.zzek r0 = r0.zza
            r2 = 8
            r0.zzL(r2)
            int r2 = r0.zzg()
            int r2 = com.google.android.gms.internal.ads.zzaio.zze(r2)
            int r3 = r0.zzp()
            long[] r5 = new long[r3]
            long[] r6 = new long[r3]
            r7 = 0
        Lcb2:
            if (r7 >= r3) goto Lce5
            r8 = 1
            if (r2 != r8) goto Lcbc
            long r9 = r0.zzw()
            goto Lcc0
        Lcbc:
            long r9 = r0.zzu()
        Lcc0:
            r5[r7] = r9
            if (r2 != r8) goto Lcc9
            long r9 = r0.zzt()
            goto Lcce
        Lcc9:
            int r9 = r0.zzg()
            long r9 = (long) r9
        Lcce:
            r6[r7] = r9
            short r9 = r0.zzE()
            if (r9 != r8) goto Lcdd
            r9 = 2
            r0.zzM(r9)
            int r7 = r7 + 1
            goto Lcb2
        Lcdd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        Lce5:
            android.util.Pair r0 = android.util.Pair.create(r5, r6)
        Lce9:
            if (r0 == 0) goto Lcfa
            java.lang.Object r2 = r0.first
            long[] r2 = (long[]) r2
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r30 = r0
            r29 = r2
            goto Lcfe
        Lcf8:
            r1 = r33
        Lcfa:
            r29 = 0
            r30 = 0
        Lcfe:
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzb
            if (r0 != 0) goto Ld06
            r0 = r65
            goto L86
        Ld06:
            com.google.android.gms.internal.ads.zzajr r0 = new com.google.android.gms.internal.ads.zzajr
            int r17 = com.google.android.gms.internal.ads.zzaix.zza(r19)
            r2 = r42
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r19 = r2.longValue()
            com.google.android.gms.internal.ads.zzaf r2 = r4.zzb
            int r3 = r4.zzd
            com.google.android.gms.internal.ads.zzajs[] r5 = r4.zza
            int r4 = r4.zzc
            r16 = r0
            r25 = r2
            r26 = r3
            r27 = r5
            r28 = r4
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r4 = r0
            r0 = r65
        Ld2e:
            java.lang.Object r2 = r0.apply(r4)
            com.google.android.gms.internal.ads.zzajr r2 = (com.google.android.gms.internal.ads.zzajr) r2
            if (r2 == 0) goto Ld60
            r3 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzaim r1 = r1.zza(r3)
            java.util.Objects.requireNonNull(r1)
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzaim r1 = r1.zza(r3)
            java.util.Objects.requireNonNull(r1)
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzaim r1 = r1.zza(r3)
            java.util.Objects.requireNonNull(r1)
            r3 = r59
            com.google.android.gms.internal.ads.zzaju r1 = zzk(r2, r1, r3)
            r2 = r32
            r2.add(r1)
            goto Ld64
        Ld60:
            r3 = r59
            r2 = r32
        Ld64:
            int r14 = r31 + 1
            r0 = r58
            r11 = r62
            r12 = r2
            goto La
        Ld6d:
            java.lang.String r0 = "Malformed sample table (stbl) missing sample description (stsd)"
            r1 = 0
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)
            throw r0
        Ld75:
            r2 = r12
            return r2
    }

    public static void zze(com.google.android.gms.internal.ads.zzek r3) {
            int r0 = r3.zzd()
            r1 = 4
            r3.zzM(r1)
            int r1 = r3.zzg()
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r2) goto L13
            int r0 = r0 + 4
        L13:
            r3.zzL(r0)
            return
    }

    private static int zzf(com.google.android.gms.internal.ads.zzek r3) {
            int r0 = r3.zzm()
            r1 = r0 & 127(0x7f, float:1.78E-43)
        L6:
            r2 = 128(0x80, float:1.794E-43)
            r0 = r0 & r2
            if (r0 != r2) goto L15
            int r0 = r3.zzm()
            int r1 = r1 << 7
            r2 = r0 & 127(0x7f, float:1.78E-43)
            r1 = r1 | r2
            goto L6
        L15:
            return r1
    }

    private static int zzg(com.google.android.gms.internal.ads.zzek r1) {
            r0 = 16
            r1.zzL(r0)
            int r1 = r1.zzg()
            return r1
    }

    private static android.util.Pair zzh(com.google.android.gms.internal.ads.zzek r17, int r18, int r19) throws com.google.android.gms.internal.ads.zzbo {
            r0 = r17
            int r1 = r17.zzd()
        L6:
            int r2 = r1 - r18
            r4 = r19
            if (r2 >= r4) goto L11b
            r0.zzL(r1)
            int r2 = r17.zzg()
            r5 = 1
            r6 = 0
            if (r2 <= 0) goto L19
            r7 = 1
            goto L1a
        L19:
            r7 = 0
        L1a:
            java.lang.String r8 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzadf.zzb(r7, r8)
            int r7 = r17.zzg()
            r8 = 1936289382(0x73696e66, float:1.8494329E31)
            if (r7 != r8) goto L118
            int r7 = r1 + 8
            r8 = -1
            r9 = -1
            r10 = 0
            r11 = 0
            r15 = 0
        L2f:
            int r12 = r7 - r1
            r13 = 4
            if (r12 >= r2) goto L65
            r0.zzL(r7)
            int r12 = r17.zzg()
            int r14 = r17.zzg()
            r3 = 1718775137(0x66726d61, float:2.862076E23)
            if (r14 != r3) goto L4d
            int r3 = r17.zzg()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            goto L63
        L4d:
            r3 = 1935894637(0x7363686d, float:1.8017111E31)
            if (r14 != r3) goto L5c
            r0.zzM(r13)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r11 = r0.zzB(r13, r3)
            goto L63
        L5c:
            r3 = 1935894633(0x73636869, float:1.8017106E31)
            if (r14 != r3) goto L63
            r9 = r7
            r10 = r12
        L63:
            int r7 = r7 + r12
            goto L2f
        L65:
            java.lang.String r3 = "cenc"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L89
            java.lang.String r3 = "cbc1"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L89
            java.lang.String r3 = "cens"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L89
            java.lang.String r3 = "cbcs"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L86
            goto L89
        L86:
            r3 = 0
            goto L114
        L89:
            if (r15 == 0) goto L8d
            r3 = 1
            goto L8e
        L8d:
            r3 = 0
        L8e:
            java.lang.String r7 = "frma atom is mandatory"
            com.google.android.gms.internal.ads.zzadf.zzb(r3, r7)
            if (r9 == r8) goto L97
            r3 = 1
            goto L98
        L97:
            r3 = 0
        L98:
            java.lang.String r7 = "schi atom is mandatory"
            com.google.android.gms.internal.ads.zzadf.zzb(r3, r7)
            int r3 = r9 + 8
        L9f:
            int r7 = r3 - r9
            if (r7 >= r10) goto L103
            r0.zzL(r3)
            int r7 = r17.zzg()
            int r8 = r17.zzg()
            r12 = 1952804451(0x74656e63, float:7.270965E31)
            if (r8 != r12) goto L100
            int r3 = r17.zzg()
            int r3 = com.google.android.gms.internal.ads.zzaio.zze(r3)
            r0.zzM(r5)
            if (r3 != 0) goto Lc6
            r0.zzM(r5)
            r3 = 0
            r14 = 0
            goto Ld0
        Lc6:
            int r3 = r17.zzm()
            r7 = r3 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r13
            r3 = r3 & 15
            r14 = r7
        Ld0:
            int r7 = r17.zzm()
            if (r7 != r5) goto Ld8
            r10 = 1
            goto Ld9
        Ld8:
            r10 = 0
        Ld9:
            int r12 = r17.zzm()
            r7 = 16
            byte[] r13 = new byte[r7]
            r0.zzH(r13, r6, r7)
            if (r10 == 0) goto Lf4
            if (r12 != 0) goto Lf4
            int r7 = r17.zzm()
            byte[] r8 = new byte[r7]
            r0.zzH(r8, r6, r7)
            r16 = r8
            goto Lf6
        Lf4:
            r16 = 0
        Lf6:
            com.google.android.gms.internal.ads.zzajs r7 = new com.google.android.gms.internal.ads.zzajs
            r9 = r7
            r8 = r15
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r3 = r7
            goto L105
        L100:
            r8 = r15
            int r3 = r3 + r7
            goto L9f
        L103:
            r8 = r15
            r3 = 0
        L105:
            if (r3 == 0) goto L108
            goto L109
        L108:
            r5 = 0
        L109:
            java.lang.String r6 = "tenc atom is mandatory"
            com.google.android.gms.internal.ads.zzadf.zzb(r5, r6)
            int r5 = com.google.android.gms.internal.ads.zzeu.zza
            android.util.Pair r3 = android.util.Pair.create(r8, r3)
        L114:
            if (r3 != 0) goto L117
            goto L118
        L117:
            return r3
        L118:
            int r1 = r1 + r2
            goto L6
        L11b:
            r1 = 0
            return r1
    }

    private static com.google.android.gms.internal.ads.zzbk zzi(com.google.android.gms.internal.ads.zzek r5) {
            short r0 = r5.zzE()
            r1 = 2
            r5.zzM(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r5 = r5.zzB(r0, r1)
            r0 = 43
            int r0 = r5.lastIndexOf(r0)
            r1 = 45
            int r1 = r5.lastIndexOf(r1)
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 0
            java.lang.String r2 = r5.substring(r1, r0)     // Catch: java.lang.Throwable -> L4a
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.Throwable -> L4a
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L4a
            int r3 = r3 + (-1)
            java.lang.String r5 = r5.substring(r0, r3)     // Catch: java.lang.Throwable -> L4a
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzbk r0 = new com.google.android.gms.internal.ads.zzbk     // Catch: java.lang.Throwable -> L4a
            r3 = 1
            com.google.android.gms.internal.ads.zzbj[] r3 = new com.google.android.gms.internal.ads.zzbj[r3]     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzfb r4 = new com.google.android.gms.internal.ads.zzfb     // Catch: java.lang.Throwable -> L4a
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L4a
            r3[r1] = r4     // Catch: java.lang.Throwable -> L4a
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4a
            return r0
        L4a:
            r5 = 0
            return r5
    }

    private static com.google.android.gms.internal.ads.zzaiq zzj(com.google.android.gms.internal.ads.zzek r10, int r11) {
            int r11 = r11 + 12
            r10.zzL(r11)
            r11 = 1
            r10.zzM(r11)
            zzf(r10)
            r0 = 2
            r10.zzM(r0)
            int r1 = r10.zzm()
            r2 = r1 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L1b
            r10.zzM(r0)
        L1b:
            r2 = r1 & 64
            if (r2 == 0) goto L26
            int r2 = r10.zzm()
            r10.zzM(r2)
        L26:
            r1 = r1 & 32
            if (r1 == 0) goto L2d
            r10.zzM(r0)
        L2d:
            r10.zzM(r11)
            zzf(r10)
            int r0 = r10.zzm()
            java.lang.String r2 = com.google.android.gms.internal.ads.zzbn.zzd(r0)
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L88
            java.lang.String r0 = "audio/vnd.dts"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L88
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L54
            goto L88
        L54:
            r0 = 4
            r10.zzM(r0)
            long r0 = r10.zzu()
            long r3 = r10.zzu()
            r10.zzM(r11)
            int r11 = zzf(r10)
            byte[] r5 = new byte[r11]
            r6 = 0
            r10.zzH(r5, r6, r11)
            r10 = -1
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L77
            r8 = r10
            goto L78
        L77:
            r8 = r3
        L78:
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L7e
            r6 = r0
            goto L7f
        L7e:
            r6 = r10
        L7f:
            com.google.android.gms.internal.ads.zzaiq r10 = new com.google.android.gms.internal.ads.zzaiq
            r1 = r10
            r3 = r5
            r4 = r8
            r1.<init>(r2, r3, r4, r6)
            return r10
        L88:
            com.google.android.gms.internal.ads.zzaiq r10 = new com.google.android.gms.internal.ads.zzaiq
            r3 = 0
            r6 = -1
            r1 = r10
            r4 = r6
            r1.<init>(r2, r3, r4, r6)
            return r10
    }

    private static com.google.android.gms.internal.ads.zzaju zzk(com.google.android.gms.internal.ads.zzajr r40, com.google.android.gms.internal.ads.zzaim r41, com.google.android.gms.internal.ads.zzadp r42) throws com.google.android.gms.internal.ads.zzbo {
            r1 = r40
            r0 = r41
            r2 = r42
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.gms.internal.ads.zzain r3 = r0.zzb(r3)
            r4 = 0
            if (r3 == 0) goto L18
            com.google.android.gms.internal.ads.zzaf r5 = r1.zzf
            com.google.android.gms.internal.ads.zzaiv r6 = new com.google.android.gms.internal.ads.zzaiv
            r6.<init>(r3, r5)
            goto L26
        L18:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.gms.internal.ads.zzain r3 = r0.zzb(r3)
            if (r3 == 0) goto L5dd
            com.google.android.gms.internal.ads.zzaiw r6 = new com.google.android.gms.internal.ads.zzaiw
            r6.<init>(r3)
        L26:
            int r3 = r6.zzb()
            r5 = 0
            if (r3 != 0) goto L44
            com.google.android.gms.internal.ads.zzaju r9 = new com.google.android.gms.internal.ads.zzaju
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = 0
            r0 = r9
            r1 = r40
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L44:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.gms.internal.ads.zzain r7 = r0.zzb(r7)
            if (r7 != 0) goto L59
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.gms.internal.ads.zzain r7 = r0.zzb(r7)
            java.util.Objects.requireNonNull(r7)
            r9 = 1
            goto L5a
        L59:
            r9 = 0
        L5a:
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.gms.internal.ads.zzain r10 = r0.zzb(r10)
            java.util.Objects.requireNonNull(r10)
            com.google.android.gms.internal.ads.zzek r10 = r10.zza
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.gms.internal.ads.zzain r11 = r0.zzb(r11)
            java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.ads.zzek r11 = r11.zza
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.gms.internal.ads.zzain r12 = r0.zzb(r12)
            if (r12 == 0) goto L7e
            com.google.android.gms.internal.ads.zzek r12 = r12.zza
            goto L7f
        L7e:
            r12 = r4
        L7f:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.gms.internal.ads.zzain r0 = r0.zzb(r13)
            if (r0 == 0) goto L8b
            com.google.android.gms.internal.ads.zzek r0 = r0.zza
            goto L8c
        L8b:
            r0 = r4
        L8c:
            com.google.android.gms.internal.ads.zzek r7 = r7.zza
            com.google.android.gms.internal.ads.zzaip r13 = new com.google.android.gms.internal.ads.zzaip
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.zzL(r7)
            int r9 = r11.zzp()
            r10 = -1
            int r9 = r9 + r10
            int r14 = r11.zzp()
            int r15 = r11.zzp()
            if (r0 == 0) goto Lb0
            r0.zzL(r7)
            int r16 = r0.zzp()
            goto Lb2
        Lb0:
            r16 = 0
        Lb2:
            if (r12 == 0) goto Lc6
            r12.zzL(r7)
            int r7 = r12.zzp()
            if (r7 <= 0) goto Lc3
            int r4 = r12.zzp()
            int r4 = r4 + r10
            goto Lc8
        Lc3:
            r12 = r4
            r4 = -1
            goto Lc8
        Lc6:
            r4 = -1
            r7 = 0
        Lc8:
            int r5 = r6.zza()
            com.google.android.gms.internal.ads.zzaf r8 = r1.zzf
            java.lang.String r8 = r8.zzn
            if (r5 == r10) goto L176
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto Lea
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto Lea
            java.lang.String r1 = "audio/g711-alaw"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L176
        Lea:
            if (r9 != 0) goto L176
            if (r16 != 0) goto L175
            if (r7 != 0) goto L175
            int r0 = r13.zza
            long[] r1 = new long[r0]
            int[] r2 = new int[r0]
        Lf6:
            boolean r4 = r13.zza()
            if (r4 == 0) goto L107
            int r4 = r13.zzb
            long r6 = r13.zzd
            r1[r4] = r6
            int r6 = r13.zzc
            r2[r4] = r6
            goto Lf6
        L107:
            long r6 = (long) r15
            r4 = 8192(0x2000, float:1.14794E-41)
            int r4 = r4 / r5
            r8 = 0
            r9 = 0
        L10d:
            if (r8 >= r0) goto L11a
            r11 = r2[r8]
            int r12 = com.google.android.gms.internal.ads.zzeu.zza
            int r11 = r11 + r4
            int r11 = r11 + r10
            int r11 = r11 / r4
            int r9 = r9 + r11
            int r8 = r8 + 1
            goto L10d
        L11a:
            long[] r8 = new long[r9]
            int[] r10 = new int[r9]
            long[] r11 = new long[r9]
            int[] r9 = new int[r9]
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L126:
            if (r12 >= r0) goto L167
            r16 = r2[r12]
            r21 = r1[r12]
            r39 = r16
            r16 = r0
            r0 = r39
        L132:
            if (r0 <= 0) goto L15e
            int r23 = java.lang.Math.min(r4, r0)
            r8[r15] = r21
            r41 = r1
            int r1 = r5 * r23
            r10[r15] = r1
            int r14 = java.lang.Math.max(r14, r1)
            r24 = r2
            long r1 = (long) r13
            long r1 = r1 * r6
            r11[r15] = r1
            r1 = 1
            r9[r15] = r1
            r1 = r10[r15]
            long r1 = (long) r1
            long r21 = r21 + r1
            int r13 = r13 + r23
            int r0 = r0 - r23
            int r15 = r15 + 1
            r1 = r41
            r2 = r24
            goto L132
        L15e:
            r41 = r1
            r24 = r2
            int r12 = r12 + 1
            r0 = r16
            goto L126
        L167:
            long r0 = (long) r13
            long r6 = r6 * r0
            r0 = r3
            r15 = r6
            r2 = r8
            r6 = r9
            r3 = r10
            r5 = r11
            r4 = r14
            r7 = r40
            goto L337
        L175:
            r9 = 0
        L176:
            long[] r1 = new long[r3]
            int[] r2 = new int[r3]
            long[] r5 = new long[r3]
            int[] r8 = new int[r3]
            r22 = r9
            r9 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L18d:
            java.lang.String r10 = "AtomParsers"
            if (r9 >= r3) goto L262
            r24 = 1
        L193:
            if (r21 != 0) goto L1b8
            boolean r24 = r13.zza()
            if (r24 == 0) goto L1b0
            r31 = r14
            r32 = r15
            long r14 = r13.zzd
            r33 = r3
            int r3 = r13.zzc
            r21 = r3
            r27 = r14
            r14 = r31
            r15 = r32
            r3 = r33
            goto L193
        L1b0:
            r33 = r3
            r31 = r14
            r32 = r15
            r3 = 0
            goto L1c0
        L1b8:
            r33 = r3
            r31 = r14
            r32 = r15
            r3 = r21
        L1c0:
            if (r24 != 0) goto L1de
            java.lang.String r3 = "Unexpected end of chunk data"
            com.google.android.gms.internal.ads.zzea.zzf(r10, r3)
            long[] r1 = java.util.Arrays.copyOf(r1, r9)
            int[] r2 = java.util.Arrays.copyOf(r2, r9)
            long[] r5 = java.util.Arrays.copyOf(r5, r9)
            int[] r8 = java.util.Arrays.copyOf(r8, r9)
            r3 = r9
            r4 = r25
            r15 = r26
            goto L26f
        L1de:
            if (r0 != 0) goto L1e3
        L1e0:
            r10 = r25
            goto L1fa
        L1e3:
            if (r23 != 0) goto L1f6
            if (r16 <= 0) goto L1f2
            int r16 = r16 + (-1)
            int r23 = r0.zzp()
            int r25 = r0.zzg()
            goto L1e3
        L1f2:
            r10 = -1
            r23 = 0
            goto L1f7
        L1f6:
            r10 = -1
        L1f7:
            int r23 = r23 + (-1)
            goto L1e0
        L1fa:
            r1[r9] = r27
            int r14 = r6.zzc()
            r2[r9] = r14
            r15 = r26
            if (r14 <= r15) goto L209
            r26 = r14
            goto L20b
        L209:
            r26 = r15
        L20b:
            long r14 = (long) r10
            long r14 = r29 + r14
            r5[r9] = r14
            if (r12 != 0) goto L214
            r14 = 1
            goto L215
        L214:
            r14 = 0
        L215:
            r8[r9] = r14
            if (r9 != r4) goto L229
            r14 = 1
            r8[r9] = r14
            int r7 = r7 + (-1)
            if (r7 <= 0) goto L229
            java.util.Objects.requireNonNull(r12)
            int r4 = r12.zzp()
            r14 = -1
            int r4 = r4 + r14
        L229:
            r21 = r4
            r14 = r5
            r15 = r32
            long r4 = (long) r15
            long r29 = r29 + r4
            int r4 = r31 + (-1)
            if (r4 != 0) goto L244
            if (r22 <= 0) goto L243
            int r4 = r11.zzp()
            int r5 = r11.zzg()
            int r22 = r22 + (-1)
            r15 = r5
            goto L244
        L243:
            r4 = 0
        L244:
            r5 = r2[r9]
            r24 = r1
            r32 = r2
            long r1 = (long) r5
            long r27 = r27 + r1
            r1 = -1
            int r2 = r3 + (-1)
            int r9 = r9 + 1
            r25 = r10
            r5 = r14
            r1 = r24
            r3 = r33
            r14 = r4
            r4 = r21
            r21 = r2
            r2 = r32
            goto L18d
        L262:
            r24 = r1
            r32 = r2
            r33 = r3
            r31 = r14
            r15 = r26
            r14 = r5
            r4 = r25
        L26f:
            long r11 = (long) r4
            long r11 = r29 + r11
            if (r0 == 0) goto L284
        L274:
            if (r16 <= 0) goto L284
            int r4 = r0.zzp()
            if (r4 == 0) goto L27e
            r0 = 0
            goto L285
        L27e:
            r0.zzg()
            int r16 = r16 + (-1)
            goto L274
        L284:
            r0 = 1
        L285:
            if (r7 != 0) goto L2d3
            if (r31 != 0) goto L2c4
            if (r21 != 0) goto L2b7
            if (r22 != 0) goto L2af
            if (r23 != 0) goto L2a6
            if (r0 != 0) goto L29c
            r0 = 0
            r4 = 0
            r6 = 0
            r9 = 0
            r13 = 0
            r14 = 0
            r7 = r40
            r41 = r1
            goto L2e1
        L29c:
            r7 = r40
            r41 = r1
            r16 = r2
            r21 = r3
            goto L32e
        L2a6:
            r4 = 0
            r9 = 0
            r13 = 0
            r7 = r40
            r6 = r0
            r41 = r1
            goto L2c1
        L2af:
            r4 = 0
            r9 = 0
            r7 = r40
            r6 = r0
            r41 = r1
            goto L2bf
        L2b7:
            r4 = 0
            r7 = r40
            r6 = r0
            r41 = r1
            r9 = r21
        L2bf:
            r13 = r22
        L2c1:
            r14 = r23
            goto L2d1
        L2c4:
            r7 = r40
            r6 = r0
            r41 = r1
            r9 = r21
            r13 = r22
            r14 = r23
            r4 = r31
        L2d1:
            r0 = 0
            goto L2e1
        L2d3:
            r6 = r0
            r41 = r1
            r0 = r7
            r9 = r21
            r13 = r22
            r14 = r23
            r4 = r31
            r7 = r40
        L2e1:
            int r1 = r7.zza
            r16 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r21 = r3
            java.lang.String r3 = "Inconsistent stbl box for track "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ": remainingSynchronizationSamples "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r0 = ", remainingSamplesAtTimestampOffset "
            r2.append(r0)
            r2.append(r14)
            r0 = 1
            if (r0 == r6) goto L322
            java.lang.String r0 = ", ctts invalid"
            goto L324
        L322:
            java.lang.String r0 = ""
        L324:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r10, r0)
        L32e:
            r2 = r41
            r6 = r8
            r4 = r15
            r3 = r16
            r0 = r21
            r15 = r11
        L337:
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r7.zzc
            java.math.RoundingMode r14 = java.math.RoundingMode.FLOOR
            r8 = r15
            long r8 = com.google.android.gms.internal.ads.zzeu.zzt(r8, r10, r12, r14)
            long[] r1 = r7.zzh
            if (r1 != 0) goto L356
            long r0 = r7.zzc
            com.google.android.gms.internal.ads.zzeu.zzE(r5, r10, r0)
            com.google.android.gms.internal.ads.zzaju r10 = new com.google.android.gms.internal.ads.zzaju
            r0 = r10
            r1 = r40
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L356:
            int r8 = r1.length
            r9 = 1
            if (r8 != r9) goto L413
            int r8 = r7.zzb
            if (r8 != r9) goto L413
            int r8 = r5.length
            r9 = 2
            if (r8 < r9) goto L413
            long[] r9 = r7.zzi
            java.util.Objects.requireNonNull(r9)
            r12 = 0
            r13 = r9[r12]
            r21 = r1[r12]
            long r10 = r7.zzc
            r9 = r0
            long r0 = r7.zzd
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r23 = r10
            r25 = r0
            long r0 = com.google.android.gms.internal.ads.zzeu.zzt(r21, r23, r25, r27)
            long r0 = r0 + r13
            int r10 = r8 + (-1)
            r11 = 4
            int r11 = java.lang.Math.min(r11, r10)
            r12 = 0
            int r11 = java.lang.Math.max(r12, r11)
            int r8 = r8 + (-4)
            int r8 = java.lang.Math.min(r8, r10)
            int r8 = java.lang.Math.max(r12, r8)
            r21 = r5[r12]
            int r10 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r10 > 0) goto L411
            r10 = r5[r11]
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 >= 0) goto L411
            r10 = r5[r8]
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 >= 0) goto L411
            int r8 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r8 > 0) goto L411
            long r30 = r13 - r21
            com.google.android.gms.internal.ads.zzaf r8 = r7.zzf
            int r8 = r8.zzC
            long r10 = (long) r8
            long r12 = r7.zzc
            java.math.RoundingMode r36 = java.math.RoundingMode.FLOOR
            r32 = r10
            r34 = r12
            long r10 = com.google.android.gms.internal.ads.zzeu.zzt(r30, r32, r34, r36)
            com.google.android.gms.internal.ads.zzaf r8 = r7.zzf
            int r8 = r8.zzC
            long r12 = (long) r8
            r14 = r9
            long r8 = r7.zzc
            long r21 = r15 - r0
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r23 = r12
            r25 = r8
            long r0 = com.google.android.gms.internal.ads.zzeu.zzt(r21, r23, r25, r27)
            r8 = 0
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 != 0) goto L3db
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 == 0) goto L414
            r10 = 0
        L3db:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 > 0) goto L414
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 <= 0) goto L3e7
            goto L414
        L3e7:
            int r8 = (int) r10
            r9 = r42
            r9.zza = r8
            int r1 = (int) r0
            r9.zzb = r1
            long r0 = r7.zzc
            r8 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.zzeu.zzE(r5, r8, r0)
            long[] r0 = r7.zzh
            r1 = 0
            r8 = r0[r1]
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r7.zzd
            java.math.RoundingMode r14 = java.math.RoundingMode.FLOOR
            long r8 = com.google.android.gms.internal.ads.zzeu.zzt(r8, r10, r12, r14)
            com.google.android.gms.internal.ads.zzaju r10 = new com.google.android.gms.internal.ads.zzaju
            r0 = r10
            r1 = r40
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L411:
            r14 = r9
            goto L414
        L413:
            r14 = r0
        L414:
            long[] r0 = r7.zzh
            int r1 = r0.length
            r8 = 1
            if (r1 != r8) goto L45e
            r8 = 0
            r9 = r0[r8]
            r0 = 0
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 != 0) goto L45d
            long[] r0 = r7.zzi
            java.util.Objects.requireNonNull(r0)
            r9 = r0[r8]
            r0 = 0
        L42b:
            int r1 = r5.length
            if (r0 >= r1) goto L444
            r11 = r5[r0]
            long r17 = r11 - r9
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r7.zzc
            java.math.RoundingMode r23 = java.math.RoundingMode.FLOOR
            r21 = r11
            long r11 = com.google.android.gms.internal.ads.zzeu.zzt(r17, r19, r21, r23)
            r5[r0] = r11
            int r0 = r0 + 1
            goto L42b
        L444:
            long r17 = r15 - r9
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r7.zzc
            java.math.RoundingMode r23 = java.math.RoundingMode.FLOOR
            r21 = r0
            long r8 = com.google.android.gms.internal.ads.zzeu.zzt(r17, r19, r21, r23)
            com.google.android.gms.internal.ads.zzaju r10 = new com.google.android.gms.internal.ads.zzaju
            r0 = r10
            r1 = r40
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L45d:
            r1 = 1
        L45e:
            int r0 = r7.zzb
            r8 = 1
            if (r0 != r8) goto L465
            r0 = 1
            goto L466
        L465:
            r0 = 0
        L466:
            long[] r8 = r7.zzi
            int[] r9 = new int[r1]
            int[] r1 = new int[r1]
            java.util.Objects.requireNonNull(r8)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L473:
            long[] r15 = r7.zzh
            r41 = r4
            int r4 = r15.length
            if (r12 >= r4) goto L4dd
            r16 = r3
            r3 = r8[r12]
            r21 = -1
            int r23 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r23 == 0) goto L4c7
            r24 = r15[r12]
            r21 = r14
            long r14 = r7.zzc
            r42 = r10
            r22 = r11
            long r10 = r7.zzd
            java.math.RoundingMode r30 = java.math.RoundingMode.FLOOR
            r26 = r14
            r28 = r10
            long r10 = com.google.android.gms.internal.ads.zzeu.zzt(r24, r26, r28, r30)
            r14 = 1
            int r15 = com.google.android.gms.internal.ads.zzeu.zzc(r5, r3, r14, r14)
            r9[r12] = r15
            long r3 = r3 + r10
            r10 = 0
            int r3 = com.google.android.gms.internal.ads.zzeu.zza(r5, r3, r0, r10)
            r1[r12] = r3
        L4a9:
            r3 = r9[r12]
            r4 = r1[r12]
            if (r3 >= r4) goto L4ba
            r11 = r6[r3]
            r11 = r11 & r14
            if (r11 != 0) goto L4ba
            int r3 = r3 + 1
            r9[r12] = r3
            r14 = 1
            goto L4a9
        L4ba:
            int r11 = r4 - r3
            int r11 = r42 + r11
            if (r13 == r3) goto L4c2
            r3 = 1
            goto L4c3
        L4c2:
            r3 = 0
        L4c3:
            r3 = r22 | r3
            r13 = r4
            goto L4d2
        L4c7:
            r42 = r10
            r22 = r11
            r21 = r14
            r10 = 0
            r11 = r42
            r3 = r22
        L4d2:
            int r12 = r12 + 1
            r4 = r41
            r10 = r11
            r14 = r21
            r11 = r3
            r3 = r16
            goto L473
        L4dd:
            r16 = r3
            r22 = r11
            r3 = r14
            r11 = r10
            r10 = 0
            if (r11 == r3) goto L4e8
            r0 = 1
            goto L4e9
        L4e8:
            r0 = 0
        L4e9:
            r0 = r22 | r0
            if (r0 == 0) goto L4f0
            long[] r3 = new long[r11]
            goto L4f1
        L4f0:
            r3 = r2
        L4f1:
            if (r0 == 0) goto L4f6
            int[] r4 = new int[r11]
            goto L4f8
        L4f6:
            r4 = r16
        L4f8:
            r8 = 1
            if (r8 != r0) goto L4fd
            r8 = 0
            goto L4ff
        L4fd:
            r8 = r41
        L4ff:
            if (r0 == 0) goto L504
            int[] r12 = new int[r11]
            goto L505
        L504:
            r12 = r6
        L505:
            long[] r11 = new long[r11]
            r41 = r8
            r13 = 0
            r15 = 0
        L50c:
            long[] r8 = r7.zzh
            int r8 = r8.length
            if (r10 >= r8) goto L5b7
            long[] r8 = r7.zzi
            r28 = r8[r10]
            r8 = r9[r10]
            r17 = r9
            r9 = r1[r10]
            r30 = r1
            if (r0 == 0) goto L52f
            int r1 = r9 - r8
            java.lang.System.arraycopy(r2, r8, r3, r15, r1)
            r31 = r2
            r2 = r16
            java.lang.System.arraycopy(r2, r8, r4, r15, r1)
            java.lang.System.arraycopy(r6, r8, r12, r15, r1)
            goto L533
        L52f:
            r31 = r2
            r2 = r16
        L533:
            r1 = r41
        L535:
            if (r8 >= r9) goto L590
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r42 = r9
            r16 = r10
            long r9 = r7.zzd
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r21 = r13
            r25 = r9
            long r9 = com.google.android.gms.internal.ads.zzeu.zzt(r21, r23, r25, r27)
            r21 = r5[r8]
            long r32 = r21 - r28
            r34 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r5
            r22 = r6
            long r5 = r7.zzc
            java.math.RoundingMode r38 = java.math.RoundingMode.FLOOR
            r36 = r5
            long r5 = com.google.android.gms.internal.ads.zzeu.zzt(r32, r34, r36, r38)
            r32 = r12
            int r12 = r7.zzb
            r33 = r3
            r3 = 1
            if (r12 == r3) goto L570
            r12 = r4
            r3 = 0
            long r5 = java.lang.Math.max(r3, r5)
            goto L573
        L570:
            r12 = r4
            r3 = 0
        L573:
            long r9 = r9 + r5
            r11[r15] = r9
            if (r0 == 0) goto L57e
            r5 = r12[r15]
            if (r5 <= r1) goto L57e
            r1 = r2[r8]
        L57e:
            int r15 = r15 + 1
            int r8 = r8 + 1
            r9 = r42
            r4 = r12
            r10 = r16
            r5 = r21
            r6 = r22
            r12 = r32
            r3 = r33
            goto L535
        L590:
            r33 = r3
            r21 = r5
            r22 = r6
            r16 = r10
            r32 = r12
            r12 = r4
            r3 = 0
            long[] r5 = r7.zzh
            r8 = r5[r16]
            long r13 = r13 + r8
            int r10 = r16 + 1
            r41 = r1
            r16 = r2
            r4 = r12
            r9 = r17
            r5 = r21
            r1 = r30
            r2 = r31
            r12 = r32
            r3 = r33
            goto L50c
        L5b7:
            r33 = r3
            r32 = r12
            r12 = r4
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r7.zzd
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r21 = r13
            r25 = r0
            long r8 = com.google.android.gms.internal.ads.zzeu.zzt(r21, r23, r25, r27)
            com.google.android.gms.internal.ads.zzaju r10 = new com.google.android.gms.internal.ads.zzaju
            r0 = r10
            r1 = r40
            r2 = r33
            r3 = r12
            r4 = r41
            r5 = r11
            r6 = r32
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L5dd:
            java.lang.String r0 = "Track has no sample table size information"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r4)
            throw r0
    }

    private static java.nio.ByteBuffer zzl() {
            r0 = 25
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    private static void zzm(com.google.android.gms.internal.ads.zzek r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, com.google.android.gms.internal.ads.zzy r33, com.google.android.gms.internal.ads.zzaiu r34, int r35) throws com.google.android.gms.internal.ads.zzbo {
            r0 = r26
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r33
            r6 = r34
            int r7 = r1 + 16
            r0.zzL(r7)
            r7 = 6
            r8 = 8
            if (r32 == 0) goto L20
            int r10 = r26.zzq()
            r0.zzM(r7)
            goto L24
        L20:
            r0.zzM(r8)
            r10 = 0
        L24:
            r13 = 32
            r14 = 4
            r15 = 16
            r12 = 2
            r9 = 1
            if (r10 == 0) goto L84
            if (r10 != r9) goto L30
            goto L84
        L30:
            if (r10 != r12) goto L555
            r0.zzM(r15)
            long r19 = r26.zzt()
            double r19 = java.lang.Double.longBitsToDouble(r19)
            long r9 = java.lang.Math.round(r19)
            int r7 = (int) r9
            int r9 = r26.zzp()
            r0.zzM(r14)
            int r10 = r26.zzp()
            int r19 = r26.zzp()
            r20 = r19 & 1
            r19 = r19 & 2
            if (r20 != 0) goto L7a
            if (r10 != r8) goto L5b
            r10 = 3
            goto L7f
        L5b:
            if (r10 != r15) goto L64
            if (r19 == 0) goto L62
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L7f
        L62:
            r10 = 2
            goto L7f
        L64:
            r15 = 24
            if (r10 != r15) goto L70
            if (r19 == 0) goto L6d
            r10 = 1342177280(0x50000000, float:8.5899346E9)
            goto L7f
        L6d:
            r10 = 21
            goto L7f
        L70:
            if (r10 != r13) goto L7e
            if (r19 == 0) goto L77
            r10 = 1610612736(0x60000000, float:3.6893488E19)
            goto L7f
        L77:
            r10 = 22
            goto L7f
        L7a:
            if (r10 != r13) goto L7e
            r10 = 4
            goto L7f
        L7e:
            r10 = -1
        L7f:
            r0.zzM(r8)
            r8 = 0
            goto La3
        L84:
            int r9 = r26.zzq()
            r0.zzM(r7)
            int r7 = r26.zzn()
            int r8 = r26.zzd()
            int r8 = r8 + (-4)
            r0.zzL(r8)
            int r8 = r26.zzg()
            r14 = 1
            if (r10 != r14) goto La2
            r0.zzM(r15)
        La2:
            r10 = -1
        La3:
            int r14 = r26.zzd()
            r15 = 1701733217(0x656e6361, float:7.0359778E22)
            r13 = r27
            if (r13 != r15) goto Lda
            android.util.Pair r13 = zzh(r0, r1, r2)
            if (r13 == 0) goto Ld4
            java.lang.Object r15 = r13.first
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r5 != 0) goto Lc0
            r12 = 0
            goto Lcb
        Lc0:
            java.lang.Object r12 = r13.second
            com.google.android.gms.internal.ads.zzajs r12 = (com.google.android.gms.internal.ads.zzajs) r12
            java.lang.String r12 = r12.zzb
            com.google.android.gms.internal.ads.zzy r5 = r5.zzb(r12)
            r12 = r5
        Lcb:
            com.google.android.gms.internal.ads.zzajs[] r5 = r6.zza
            java.lang.Object r13 = r13.second
            com.google.android.gms.internal.ads.zzajs r13 = (com.google.android.gms.internal.ads.zzajs) r13
            r5[r35] = r13
            goto Ld5
        Ld4:
            r12 = r5
        Ld5:
            r0.zzL(r14)
            r13 = r15
            goto Ldb
        Lda:
            r12 = r5
        Ldb:
            r5 = 1633889587(0x61632d33, float:2.6191674E20)
            java.lang.String r15 = "audio/mhm1"
            java.lang.String r11 = "audio/ac4"
            java.lang.String r22 = "audio/raw"
            if (r13 != r5) goto Lea
            java.lang.String r5 = "audio/ac3"
            goto L1af
        Lea:
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r13 != r5) goto Lf3
            java.lang.String r5 = "audio/eac3"
            goto L1af
        Lf3:
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r13 != r5) goto Lfb
            r5 = r11
            goto L1af
        Lfb:
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r13 != r5) goto L104
            java.lang.String r5 = "audio/vnd.dts"
            goto L1af
        L104:
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r13 == r5) goto L1ad
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r13 != r5) goto L110
            goto L1ad
        L110:
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r13 != r5) goto L119
            java.lang.String r5 = "audio/vnd.dts.hd;profile=lbr"
            goto L1af
        L119:
            r5 = 1685353336(0x64747378, float:1.8037304E22)
            if (r13 != r5) goto L122
            java.lang.String r5 = "audio/vnd.dts.uhd;profile=p2"
            goto L1af
        L122:
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r13 != r5) goto L12b
            java.lang.String r5 = "audio/3gpp"
            goto L1af
        L12b:
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r13 != r5) goto L134
            java.lang.String r5 = "audio/amr-wb"
            goto L1af
        L134:
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r13 != r5) goto L13e
        L139:
            r5 = r22
            r10 = 2
            goto L1af
        L13e:
            r5 = 1953984371(0x74776f73, float:7.841539E31)
            if (r13 != r5) goto L149
            r5 = r22
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L1af
        L149:
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r13 != r5) goto L156
            r5 = -1
            if (r10 != r5) goto L152
            goto L139
        L152:
            r5 = r22
            goto L1af
        L156:
            r5 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r13 == r5) goto L1aa
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r13 != r5) goto L161
            goto L1aa
        L161:
            r5 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r13 != r5) goto L169
            java.lang.String r5 = "audio/mha1"
            goto L1af
        L169:
            r5 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r13 != r5) goto L170
            r5 = r15
            goto L1af
        L170:
            r5 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r13 != r5) goto L178
            java.lang.String r5 = "audio/alac"
            goto L1af
        L178:
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r13 != r5) goto L180
            java.lang.String r5 = "audio/g711-alaw"
            goto L1af
        L180:
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r13 != r5) goto L188
            java.lang.String r5 = "audio/g711-mlaw"
            goto L1af
        L188:
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r13 != r5) goto L190
            java.lang.String r5 = "audio/opus"
            goto L1af
        L190:
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r13 != r5) goto L198
            java.lang.String r5 = "audio/flac"
            goto L1af
        L198:
            r5 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r13 != r5) goto L1a0
            java.lang.String r5 = "audio/true-hd"
            goto L1af
        L1a0:
            r5 = 1767992678(0x69616d66, float:1.7032808E25)
            if (r13 != r5) goto L1a8
            java.lang.String r5 = "audio/iamf"
            goto L1af
        L1a8:
            r5 = 0
            goto L1af
        L1aa:
            java.lang.String r5 = "audio/mpeg"
            goto L1af
        L1ad:
            java.lang.String r5 = "audio/vnd.dts.hd"
        L1af:
            r16 = r10
            r33 = 0
            r10 = 0
            r22 = 0
        L1b6:
            int r13 = r14 - r1
            if (r13 >= r2) goto L50c
            r0.zzL(r14)
            int r13 = r26.zzg()
            if (r13 <= 0) goto L1c5
            r1 = 1
            goto L1c6
        L1c5:
            r1 = 0
        L1c6:
            java.lang.String r2 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzadf.zzb(r1, r2)
            int r1 = r26.zzg()
            r35 = r7
            r7 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r1 != r7) goto L22b
            int r1 = r14 + 8
            r0.zzL(r1)
            r1 = 1
            r0.zzM(r1)
            int r2 = r26.zzm()
            r0.zzM(r1)
            boolean r7 = java.util.Objects.equals(r5, r15)
            if (r7 == 0) goto L1fe
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            r7[r1] = r2
            java.lang.String r2 = "mhm1.%02X"
            java.lang.String r2 = java.lang.String.format(r2, r7)
            r23 = r15
            goto L210
        L1fe:
            r23 = r15
            r1 = 0
            r7 = 1
            java.lang.Object[] r15 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15[r1] = r2
            java.lang.String r2 = "mha1.%02X"
            java.lang.String r2 = java.lang.String.format(r2, r15)
        L210:
            int r7 = r26.zzq()
            byte[] r15 = new byte[r7]
            r0.zzH(r15, r1, r7)
            if (r10 != 0) goto L220
            com.google.android.gms.internal.ads.zzgax r10 = com.google.android.gms.internal.ads.zzgax.zzo(r15)
            goto L256
        L220:
            java.lang.Object r7 = r10.get(r1)
            byte[] r7 = (byte[]) r7
            com.google.android.gms.internal.ads.zzgax r10 = com.google.android.gms.internal.ads.zzgax.zzp(r15, r7)
            goto L256
        L22b:
            r23 = r15
            r7 = 1835557200(0x6d686150, float:4.4948854E27)
            if (r1 != r7) goto L26c
            int r1 = r14 + 8
            r0.zzL(r1)
            int r1 = r26.zzm()
            if (r1 <= 0) goto L261
            byte[] r2 = new byte[r1]
            r7 = 0
            r0.zzH(r2, r7, r1)
            if (r10 != 0) goto L24a
            com.google.android.gms.internal.ads.zzgax r10 = com.google.android.gms.internal.ads.zzgax.zzo(r2)
            goto L254
        L24a:
            java.lang.Object r1 = r10.get(r7)
            byte[] r1 = (byte[]) r1
            com.google.android.gms.internal.ads.zzgax r10 = com.google.android.gms.internal.ads.zzgax.zzp(r1, r2)
        L254:
            r2 = r33
        L256:
            r7 = r35
            r24 = r8
            r8 = 0
        L25b:
            r17 = 3
            r20 = 2
            goto L4fd
        L261:
            r2 = r35
            r24 = r8
            r8 = 0
            r17 = 3
            r20 = 2
            goto L4fa
        L26c:
            r7 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 == r7) goto L452
            if (r32 == 0) goto L2b6
            r15 = 2002876005(0x77617665, float:4.5729223E33)
            if (r1 != r15) goto L2b6
            int r1 = r26.zzd()
            if (r1 < r14) goto L281
            r7 = 0
            r15 = 1
            goto L283
        L281:
            r7 = 0
            r15 = 0
        L283:
            com.google.android.gms.internal.ads.zzadf.zzb(r15, r7)
        L286:
            int r7 = r1 - r14
            if (r7 >= r13) goto L2ab
            r0.zzL(r1)
            int r7 = r26.zzg()
            if (r7 <= 0) goto L295
            r15 = 1
            goto L296
        L295:
            r15 = 0
        L296:
            com.google.android.gms.internal.ads.zzadf.zzb(r15, r2)
            int r15 = r26.zzg()
            r25 = r2
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r15 == r2) goto L2a8
            int r1 = r1 + r7
            r2 = r25
            goto L286
        L2a8:
            r2 = r35
            goto L2ae
        L2ab:
            r2 = r35
            r1 = -1
        L2ae:
            r7 = -1
            r15 = 4
            r17 = 3
            r20 = 2
            goto L45b
        L2b6:
            r2 = 1684103987(0x64616333, float:1.6630662E22)
            if (r1 != r2) goto L2cb
            int r1 = r14 + 8
            r0.zzL(r1)
            java.lang.String r1 = java.lang.Integer.toString(r30)
            com.google.android.gms.internal.ads.zzaf r1 = com.google.android.gms.internal.ads.zzacb.zzc(r0, r1, r4, r12)
            r6.zzb = r1
            goto L261
        L2cb:
            r2 = 1684366131(0x64656333, float:1.692581E22)
            if (r1 != r2) goto L2e0
            int r1 = r14 + 8
            r0.zzL(r1)
            java.lang.String r1 = java.lang.Integer.toString(r30)
            com.google.android.gms.internal.ads.zzaf r1 = com.google.android.gms.internal.ads.zzacb.zzd(r0, r1, r4, r12)
            r6.zzb = r1
            goto L261
        L2e0:
            r2 = 1684103988(0x64616334, float:1.6630663E22)
            if (r1 != r2) goto L326
            int r1 = r14 + 8
            r0.zzL(r1)
            java.lang.String r1 = java.lang.Integer.toString(r30)
            int r2 = com.google.android.gms.internal.ads.zzace.zza
            r2 = 1
            r0.zzM(r2)
            int r7 = r26.zzm()
            r15 = 32
            r7 = r7 & r15
            com.google.android.gms.internal.ads.zzad r15 = new com.google.android.gms.internal.ads.zzad
            r15.<init>()
            r15.zzL(r1)
            r15.zzZ(r11)
            r1 = 2
            r15.zzz(r1)
            int r1 = r7 >> 5
            if (r2 == r1) goto L312
            r1 = 44100(0xac44, float:6.1797E-41)
            goto L315
        L312:
            r1 = 48000(0xbb80, float:6.7262E-41)
        L315:
            r15.zzaa(r1)
            r15.zzF(r12)
            r15.zzP(r4)
            com.google.android.gms.internal.ads.zzaf r1 = r15.zzaf()
            r6.zzb = r1
            goto L261
        L326:
            r2 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r1 != r2) goto L34d
            if (r8 <= 0) goto L336
            r2 = r33
            r7 = r8
            r24 = r7
            r8 = 0
            r9 = 2
            goto L25b
        L336:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r2)
            throw r0
        L34d:
            r2 = 0
            r7 = 1684305011(0x64647473, float:1.6856995E22)
            if (r1 == r7) goto L429
            r7 = 1969517683(0x75647473, float:2.8960097E32)
            if (r1 != r7) goto L35a
            goto L429
        L35a:
            r7 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r1 != r7) goto L378
            int r1 = r14 + 8
            int r7 = r13 + (-8)
            byte[] r10 = com.google.android.gms.internal.ads.zzaiz.zza
            int r15 = r10.length
            int r15 = r15 + r7
            byte[] r15 = java.util.Arrays.copyOf(r10, r15)
            r0.zzL(r1)
            int r1 = r10.length
            r0.zzH(r15, r1, r7)
            java.util.List r10 = com.google.android.gms.internal.ads.zzadw.zze(r15)
            goto L254
        L378:
            r7 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r1 != r7) goto L3b1
            int r1 = r14 + 12
            int r7 = r13 + (-12)
            int r10 = r7 + 4
            byte[] r10 = new byte[r10]
            r15 = 102(0x66, float:1.43E-43)
            r18 = 0
            r10[r18] = r15
            r15 = 76
            r21 = 1
            r10[r21] = r15
            r15 = 97
            r20 = 2
            r10[r20] = r15
            r15 = 67
            r17 = 3
            r10[r17] = r15
            r0.zzL(r1)
            r15 = 4
            r0.zzH(r10, r15, r7)
            com.google.android.gms.internal.ads.zzgax r10 = com.google.android.gms.internal.ads.zzgax.zzo(r10)
        L3a8:
            r2 = r33
            r7 = r35
            r24 = r8
            r8 = 0
            goto L4fd
        L3b1:
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            r15 = 4
            r17 = 3
            r20 = 2
            if (r1 != r7) goto L408
            int r1 = r14 + 12
            int r9 = r13 + (-12)
            byte[] r10 = new byte[r9]
            r0.zzL(r1)
            r1 = 0
            r0.zzH(r10, r1, r9)
            int r1 = com.google.android.gms.internal.ads.zzdk.zza
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r1.<init>(r10)
            r9 = 9
            r1.zzL(r9)
            int r9 = r1.zzm()
            r2 = 20
            r1.zzL(r2)
            int r1 = r1.zzp()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.util.Pair r1 = android.util.Pair.create(r1, r2)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.android.gms.internal.ads.zzgax r10 = com.google.android.gms.internal.ads.zzgax.zzo(r10)
            r9 = r1
            r7 = r2
            r24 = r8
            r8 = 0
            goto L4fb
        L408:
            r2 = 1767990114(0x69616362, float:1.7029852E25)
            if (r1 != r2) goto L425
            int r1 = r14 + 9
            r0.zzL(r1)
            long r1 = r26.zzv()
            int r1 = com.google.android.gms.internal.ads.zzgdu.zzb(r1)
            byte[] r2 = new byte[r1]
            r10 = 0
            r0.zzH(r2, r10, r1)
            com.google.android.gms.internal.ads.zzgax r10 = com.google.android.gms.internal.ads.zzgax.zzo(r2)
            goto L3a8
        L425:
            r2 = r35
            goto L4f7
        L429:
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            r15 = 4
            r17 = 3
            r20 = 2
            com.google.android.gms.internal.ads.zzad r1 = new com.google.android.gms.internal.ads.zzad
            r1.<init>()
            r1.zzK(r3)
            r1.zzZ(r5)
            r1.zzz(r9)
            r2 = r35
            r1.zzaa(r2)
            r1.zzF(r12)
            r1.zzP(r4)
            com.google.android.gms.internal.ads.zzaf r1 = r1.zzaf()
            r6.zzb = r1
            goto L4f7
        L452:
            r2 = r35
            r15 = 4
            r17 = 3
            r20 = 2
            r1 = r14
            r7 = -1
        L45b:
            if (r1 == r7) goto L4f7
            com.google.android.gms.internal.ads.zzaiq r22 = zzj(r0, r1)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaiq.zzc(r22)
            byte[] r5 = com.google.android.gms.internal.ads.zzaiq.zzd(r22)
            if (r5 == 0) goto L4f2
            java.lang.String r10 = "audio/vorbis"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L4d2
            com.google.android.gms.internal.ads.zzek r10 = new com.google.android.gms.internal.ads.zzek
            r10.<init>(r5)
            r7 = 1
            r10.zzM(r7)
            r15 = 0
        L47d:
            int r21 = r10.zzb()
            r7 = 255(0xff, float:3.57E-43)
            if (r21 <= 0) goto L495
            int r0 = r10.zzf()
            if (r0 != r7) goto L495
            r0 = 1
            r10.zzM(r0)
            int r15 = r15 + 255
            r0 = r26
            r7 = 1
            goto L47d
        L495:
            int r0 = r10.zzm()
            int r15 = r15 + r0
            r0 = 0
        L49b:
            int r24 = r10.zzb()
            if (r24 <= 0) goto L4b2
            r24 = r8
            int r8 = r10.zzf()
            if (r8 != r7) goto L4b4
            r8 = 1
            r10.zzM(r8)
            int r0 = r0 + 255
            r8 = r24
            goto L49b
        L4b2:
            r24 = r8
        L4b4:
            r8 = 1
            int r7 = r10.zzm()
            int r0 = r0 + r7
            byte[] r7 = new byte[r15]
            int r10 = r10.zzd()
            r8 = 0
            java.lang.System.arraycopy(r5, r10, r7, r8, r15)
            int r10 = r10 + r15
            int r15 = r5.length
            int r10 = r10 + r0
            int r15 = r15 - r10
            byte[] r0 = new byte[r15]
            java.lang.System.arraycopy(r5, r10, r0, r8, r15)
            com.google.android.gms.internal.ads.zzgax r10 = com.google.android.gms.internal.ads.zzgax.zzp(r7, r0)
            goto L4f5
        L4d2:
            r24 = r8
            r8 = 0
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e8
            com.google.android.gms.internal.ads.zzabx r0 = com.google.android.gms.internal.ads.zzaby.zza(r5)
            int r7 = r0.zza
            int r9 = r0.zzb
            java.lang.String r0 = r0.zzc
            goto L4eb
        L4e8:
            r0 = r33
            r7 = r2
        L4eb:
            com.google.android.gms.internal.ads.zzgax r10 = com.google.android.gms.internal.ads.zzgax.zzo(r5)
            r2 = r0
            r5 = r1
            goto L4fd
        L4f2:
            r24 = r8
            r8 = 0
        L4f5:
            r5 = r1
            goto L4fa
        L4f7:
            r24 = r8
            r8 = 0
        L4fa:
            r7 = r2
        L4fb:
            r2 = r33
        L4fd:
            int r14 = r14 + r13
            r0 = r26
            r1 = r28
            r33 = r2
            r15 = r23
            r8 = r24
            r2 = r29
            goto L1b6
        L50c:
            r2 = r7
            com.google.android.gms.internal.ads.zzaf r0 = r6.zzb
            if (r0 != 0) goto L555
            if (r5 == 0) goto L555
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            r0.zzK(r3)
            r0.zzZ(r5)
            r1 = r33
            r0.zzA(r1)
            r0.zzz(r9)
            r0.zzaa(r2)
            r1 = r16
            r0.zzT(r1)
            r0.zzM(r10)
            r0.zzF(r12)
            r0.zzP(r4)
            if (r22 == 0) goto L54f
            long r1 = com.google.android.gms.internal.ads.zzaiq.zza(r22)
            int r1 = com.google.android.gms.internal.ads.zzgdu.zze(r1)
            r0.zzy(r1)
            long r1 = com.google.android.gms.internal.ads.zzaiq.zzb(r22)
            int r1 = com.google.android.gms.internal.ads.zzgdu.zze(r1)
            r0.zzU(r1)
        L54f:
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzaf()
            r6.zzb = r0
        L555:
            return
    }
}
