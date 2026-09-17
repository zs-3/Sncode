package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzakl extends com.google.android.gms.internal.ads.zzakj {
    private com.google.android.gms.internal.ads.zzakk zza;
    private int zzb;
    private boolean zzc;
    private com.google.android.gms.internal.ads.zzaem zzd;
    private com.google.android.gms.internal.ads.zzaek zze;

    zzakl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final long zza(com.google.android.gms.internal.ads.zzek r13) {
            r12 = this;
            byte[] r0 = r13.zzN()
            r1 = 0
            r0 = r0[r1]
            r2 = 1
            r0 = r0 & r2
            if (r0 != r2) goto Le
            r0 = -1
            return r0
        Le:
            byte[] r0 = r13.zzN()
            r0 = r0[r1]
            com.google.android.gms.internal.ads.zzakk r3 = r12.zza
            com.google.android.gms.internal.ads.zzdi.zzb(r3)
            int r4 = r3.zze
            int r0 = r0 >> r2
            com.google.android.gms.internal.ads.zzael[] r5 = r3.zzd
            r6 = 255(0xff, float:3.57E-43)
            r7 = 8
            int r4 = 8 - r4
            int r4 = r6 >>> r4
            r0 = r0 & r4
            r0 = r5[r0]
            boolean r0 = r0.zza
            if (r0 != 0) goto L32
            com.google.android.gms.internal.ads.zzaem r0 = r3.zza
            int r0 = r0.zze
            goto L36
        L32:
            com.google.android.gms.internal.ads.zzaem r0 = r3.zza
            int r0 = r0.zzf
        L36:
            boolean r3 = r12.zzc
            if (r3 == 0) goto L3f
            int r1 = r12.zzb
            int r1 = r1 + r0
            int r1 = r1 / 4
        L3f:
            int r3 = r13.zzc()
            int r4 = r13.zze()
            int r4 = r4 + 4
            if (r3 >= r4) goto L5e
            byte[] r3 = r13.zzN()
            int r4 = r13.zze()
            int r4 = r4 + 4
            byte[] r3 = java.util.Arrays.copyOf(r3, r4)
            int r4 = r3.length
            r13.zzJ(r3, r4)
            goto L67
        L5e:
            int r3 = r13.zze()
            int r3 = r3 + 4
            r13.zzK(r3)
        L67:
            long r3 = (long) r1
            byte[] r1 = r13.zzN()
            int r5 = r13.zze()
            int r5 = r5 + (-4)
            r8 = 255(0xff, double:1.26E-321)
            long r10 = r3 & r8
            int r6 = (int) r10
            byte r6 = (byte) r6
            r1[r5] = r6
            int r5 = r13.zze()
            int r5 = r5 + (-3)
            long r6 = r3 >>> r7
            long r6 = r6 & r8
            int r7 = (int) r6
            byte r6 = (byte) r7
            r1[r5] = r6
            int r5 = r13.zze()
            int r5 = r5 + (-2)
            r6 = 16
            long r6 = r3 >>> r6
            long r6 = r6 & r8
            int r7 = (int) r6
            byte r6 = (byte) r7
            r1[r5] = r6
            int r13 = r13.zze()
            int r13 = r13 + (-1)
            r5 = 24
            long r5 = r3 >>> r5
            long r5 = r5 & r8
            int r6 = (int) r5
            byte r5 = (byte) r6
            r1[r13] = r5
            r12.zzc = r2
            r12.zzb = r0
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final void zzb(boolean r1) {
            r0 = this;
            super.zzb(r1)
            if (r1 == 0) goto Lc
            r1 = 0
            r0.zza = r1
            r0.zzd = r1
            r0.zze = r1
        Lc:
            r1 = 0
            r0.zzb = r1
            r0.zzc = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final boolean zzc(com.google.android.gms.internal.ads.zzek r26, long r27, com.google.android.gms.internal.ads.zzakg r29) throws java.io.IOException {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r29
            com.google.android.gms.internal.ads.zzakk r3 = r0.zza
            r4 = 0
            if (r3 == 0) goto L11
            com.google.android.gms.internal.ads.zzaf r1 = r2.zza
            java.util.Objects.requireNonNull(r1)
            return r4
        L11:
            com.google.android.gms.internal.ads.zzaem r6 = r0.zzd
            r5 = 4
            r11 = 1
            if (r6 != 0) goto L84
            com.google.android.gms.internal.ads.zzaen.zzd(r11, r1, r4)
            int r13 = r26.zzj()
            int r14 = r26.zzm()
            int r15 = r26.zzj()
            int r6 = r26.zzi()
            if (r6 > 0) goto L2f
            r16 = -1
            goto L31
        L2f:
            r16 = r6
        L31:
            int r6 = r26.zzi()
            if (r6 > 0) goto L3a
            r17 = -1
            goto L3c
        L3a:
            r17 = r6
        L3c:
            int r6 = r26.zzi()
            if (r6 > 0) goto L45
            r18 = -1
            goto L47
        L45:
            r18 = r6
        L47:
            int r3 = r26.zzm()
            r6 = r3 & 15
            double r8 = (double) r6
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = java.lang.Math.pow(r11, r8)
            int r6 = (int) r8
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> r5
            double r8 = (double) r3
            double r8 = java.lang.Math.pow(r11, r8)
            int r3 = (int) r8
            int r5 = r26.zzm()
            r8 = 1
            r5 = r5 & r8
            if (r8 == r5) goto L69
            r21 = 0
            goto L6b
        L69:
            r21 = 1
        L6b:
            byte[] r4 = r26.zzN()
            int r1 = r26.zze()
            byte[] r22 = java.util.Arrays.copyOf(r4, r1)
            com.google.android.gms.internal.ads.zzaem r1 = new com.google.android.gms.internal.ads.zzaem
            r12 = r1
            r19 = r6
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.zzd = r1
            goto L8f
        L84:
            com.google.android.gms.internal.ads.zzaek r8 = r0.zze
            if (r8 != 0) goto L92
            r9 = 1
            com.google.android.gms.internal.ads.zzaek r1 = com.google.android.gms.internal.ads.zzaen.zzc(r1, r9, r9)
            r0.zze = r1
        L8f:
            r7 = 0
            goto L3c5
        L92:
            int r9 = r26.zze()
            byte[] r9 = new byte[r9]
            byte[] r10 = r26.zzN()
            int r11 = r26.zze()
            java.lang.System.arraycopy(r10, r4, r9, r4, r11)
            int r10 = r6.zza
            r11 = 5
            com.google.android.gms.internal.ads.zzaen.zzd(r11, r1, r4)
            int r12 = r26.zzm()
            r13 = 1
            int r12 = r12 + r13
            com.google.android.gms.internal.ads.zzaej r13 = new com.google.android.gms.internal.ads.zzaej
            byte[] r14 = r26.zzN()
            r13.<init>(r14)
            int r1 = r26.zzd()
            r14 = 8
            int r1 = r1 * 8
            r13.zzc(r1)
            r1 = 0
        Lc4:
            r15 = 24
            r4 = 2
            r3 = 16
            if (r1 >= r12) goto L193
            int r14 = r13.zzb(r15)
            r7 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r7) goto L178
            int r3 = r13.zzb(r3)
            int r7 = r13.zzb(r15)
            boolean r14 = r13.zzd()
            if (r14 != 0) goto Lfb
            boolean r14 = r13.zzd()
            r15 = 0
        Le7:
            if (r15 >= r7) goto L10d
            if (r14 == 0) goto Lf5
            boolean r18 = r13.zzd()
            if (r18 == 0) goto Lf8
            r13.zzc(r11)
            goto Lf8
        Lf5:
            r13.zzc(r11)
        Lf8:
            int r15 = r15 + 1
            goto Le7
        Lfb:
            r13.zzc(r11)
            r14 = 0
        Lff:
            if (r14 >= r7) goto L10d
            int r15 = r7 - r14
            int r15 = com.google.android.gms.internal.ads.zzaen.zza(r15)
            int r15 = r13.zzb(r15)
            int r14 = r14 + r15
            goto Lff
        L10d:
            int r14 = r13.zzb(r5)
            if (r14 > r4) goto L161
            r15 = 1
            if (r14 == r15) goto L11c
            if (r14 != r4) goto L119
            goto L11d
        L119:
            r18 = r6
            goto L157
        L11c:
            r4 = r14
        L11d:
            r14 = 32
            r13.zzc(r14)
            r13.zzc(r14)
            int r14 = r13.zzb(r5)
            int r14 = r14 + r15
            r13.zzc(r15)
            if (r4 != r15) goto L14a
            if (r3 == 0) goto L145
            r18 = r6
            long r5 = (long) r7
            long r3 = (long) r3
            double r3 = (double) r3
            double r5 = (double) r5
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r20 / r3
            double r3 = java.lang.Math.pow(r5, r3)
            double r3 = java.lang.Math.floor(r3)
            long r3 = (long) r3
            goto L150
        L145:
            r18 = r6
            r3 = 0
            goto L150
        L14a:
            r18 = r6
            long r3 = (long) r3
            long r5 = (long) r7
            long r3 = r3 * r5
        L150:
            long r5 = (long) r14
            long r3 = r3 * r5
            int r4 = (int) r3
            r13.zzc(r4)
        L157:
            int r1 = r1 + 1
            r6 = r18
            r4 = 0
            r5 = 4
            r14 = 8
            goto Lc4
        L161:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L178:
            r2 = 0
            int r1 = r13.zza()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L193:
            r18 = r6
            r1 = 6
            int r5 = r13.zzb(r1)
            r6 = 1
            int r5 = r5 + r6
            r6 = 0
        L19d:
            if (r6 >= r5) goto L1b0
            int r7 = r13.zzb(r3)
            if (r7 != 0) goto L1a8
            int r6 = r6 + 1
            goto L19d
        L1a8:
            java.lang.String r1 = "placeholder of time domain transforms not zeroed out"
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L1b0:
            int r5 = r13.zzb(r1)
            r6 = 1
            int r5 = r5 + r6
            r7 = 0
        L1b7:
            r12 = 3
            if (r7 >= r5) goto L280
            int r14 = r13.zzb(r3)
            if (r14 == 0) goto L24a
            if (r14 != r6) goto L233
            int r6 = r13.zzb(r11)
            int[] r14 = new int[r6]
            r11 = 0
            r15 = -1
        L1ca:
            if (r11 >= r6) goto L1dc
            r1 = 4
            int r3 = r13.zzb(r1)
            r14[r11] = r3
            if (r3 <= r15) goto L1d6
            r15 = r3
        L1d6:
            int r11 = r11 + 1
            r1 = 6
            r3 = 16
            goto L1ca
        L1dc:
            int r15 = r15 + 1
            int[] r1 = new int[r15]
            r3 = 0
        L1e1:
            if (r3 >= r15) goto L213
            int r11 = r13.zzb(r12)
            r23 = 1
            int r11 = r11 + 1
            r1[r3] = r11
            int r11 = r13.zzb(r4)
            if (r11 <= 0) goto L1f9
            r12 = 8
            r13.zzc(r12)
            goto L1fb
        L1f9:
            r12 = 8
        L1fb:
            r24 = r5
            r4 = 0
        L1fe:
            int r5 = r23 << r11
            if (r4 >= r5) goto L20c
            r13.zzc(r12)
            int r4 = r4 + 1
            r12 = 8
            r23 = 1
            goto L1fe
        L20c:
            int r3 = r3 + 1
            r5 = r24
            r4 = 2
            r12 = 3
            goto L1e1
        L213:
            r24 = r5
            r3 = 2
            r13.zzc(r3)
            r3 = 4
            int r4 = r13.zzb(r3)
            r3 = 0
            r5 = 0
            r11 = 0
        L221:
            if (r3 >= r6) goto L272
            r12 = r14[r3]
            r12 = r1[r12]
            int r5 = r5 + r12
        L228:
            if (r11 >= r5) goto L230
            r13.zzc(r4)
            int r11 = r11 + 1
            goto L228
        L230:
            int r3 = r3 + 1
            goto L221
        L233:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "floor type greater than 1 not decodable: "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L24a:
            r24 = r5
            r1 = 8
            r13.zzc(r1)
            r3 = 16
            r13.zzc(r3)
            r13.zzc(r3)
            r3 = 6
            r13.zzc(r3)
            r13.zzc(r1)
            r3 = 4
            int r4 = r13.zzb(r3)
            r3 = 1
            int r4 = r4 + r3
            r3 = 0
        L268:
            if (r3 >= r4) goto L272
            r13.zzc(r1)
            int r3 = r3 + 1
            r1 = 8
            goto L268
        L272:
            int r7 = r7 + 1
            r5 = r24
            r1 = 6
            r3 = 16
            r4 = 2
            r6 = 1
            r11 = 5
            r15 = 24
            goto L1b7
        L280:
            int r3 = r13.zzb(r1)
            r4 = 1
            int r3 = r3 + r4
            r5 = 0
        L287:
            if (r5 >= r3) goto L2f5
            r6 = 16
            int r7 = r13.zzb(r6)
            r6 = 2
            if (r7 > r6) goto L2ed
            r6 = 24
            r13.zzc(r6)
            r13.zzc(r6)
            r13.zzc(r6)
            int r7 = r13.zzb(r1)
            int r7 = r7 + r4
            r1 = 8
            r13.zzc(r1)
            int[] r4 = new int[r7]
            r11 = 0
        L2aa:
            if (r11 >= r7) goto L2c9
            r12 = 3
            int r14 = r13.zzb(r12)
            boolean r15 = r13.zzd()
            if (r15 == 0) goto L2bd
            r15 = 5
            int r20 = r13.zzb(r15)
            goto L2c0
        L2bd:
            r15 = 5
            r20 = 0
        L2c0:
            int r20 = r20 * 8
            int r20 = r20 + r14
            r4[r11] = r20
            int r11 = r11 + 1
            goto L2aa
        L2c9:
            r12 = 3
            r15 = 5
            r11 = 0
        L2cc:
            if (r11 >= r7) goto L2e8
            r14 = 0
        L2cf:
            if (r14 >= r1) goto L2e3
            r20 = r4[r11]
            r21 = 1
            int r23 = r21 << r14
            r20 = r20 & r23
            if (r20 == 0) goto L2de
            r13.zzc(r1)
        L2de:
            int r14 = r14 + 1
            r1 = 8
            goto L2cf
        L2e3:
            int r11 = r11 + 1
            r1 = 8
            goto L2cc
        L2e8:
            int r5 = r5 + 1
            r1 = 6
            r4 = 1
            goto L287
        L2ed:
            java.lang.String r1 = "residueType greater than 2 is not decodable"
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L2f5:
            int r3 = r13.zzb(r1)
            r1 = 1
            int r3 = r3 + r1
            r1 = 0
        L2fc:
            if (r1 >= r3) goto L383
            r4 = 16
            int r5 = r13.zzb(r4)
            if (r5 == 0) goto L31f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "mapping type other than 0 not supported: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "VorbisUtil"
            com.google.android.gms.internal.ads.zzea.zzc(r5, r4)
            r4 = 2
            r7 = 4
            goto L378
        L31f:
            boolean r4 = r13.zzd()
            if (r4 == 0) goto L32d
            r4 = 4
            int r5 = r13.zzb(r4)
            r4 = 1
            int r5 = r5 + r4
            goto L32f
        L32d:
            r4 = 1
            r5 = 1
        L32f:
            boolean r6 = r13.zzd()
            if (r6 == 0) goto L352
            r6 = 8
            int r7 = r13.zzb(r6)
            int r7 = r7 + r4
            r4 = 0
        L33d:
            if (r4 >= r7) goto L352
            int r6 = r10 + (-1)
            int r11 = com.google.android.gms.internal.ads.zzaen.zza(r6)
            r13.zzc(r11)
            int r6 = com.google.android.gms.internal.ads.zzaen.zza(r6)
            r13.zzc(r6)
            int r4 = r4 + 1
            goto L33d
        L352:
            r4 = 2
            int r6 = r13.zzb(r4)
            if (r6 != 0) goto L37b
            r6 = 1
            if (r5 <= r6) goto L366
            r6 = 0
        L35d:
            if (r6 >= r10) goto L366
            r7 = 4
            r13.zzc(r7)
            int r6 = r6 + 1
            goto L35d
        L366:
            r7 = 4
            r6 = 0
        L368:
            if (r6 >= r5) goto L378
            r11 = 8
            r13.zzc(r11)
            r13.zzc(r11)
            r13.zzc(r11)
            int r6 = r6 + 1
            goto L368
        L378:
            int r1 = r1 + 1
            goto L2fc
        L37b:
            java.lang.String r1 = "to reserved bits must be zero after mapping coupling steps"
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L383:
            r1 = 6
            int r1 = r13.zzb(r1)
            r3 = 1
            int r1 = r1 + r3
            com.google.android.gms.internal.ads.zzael[] r3 = new com.google.android.gms.internal.ads.zzael[r1]
            r4 = 0
        L38d:
            if (r4 >= r1) goto L3ad
            boolean r5 = r13.zzd()
            r6 = 16
            int r7 = r13.zzb(r6)
            int r10 = r13.zzb(r6)
            r11 = 8
            int r12 = r13.zzb(r11)
            com.google.android.gms.internal.ads.zzael r14 = new com.google.android.gms.internal.ads.zzael
            r14.<init>(r5, r7, r10, r12)
            r3[r4] = r14
            int r4 = r4 + 1
            goto L38d
        L3ad:
            boolean r4 = r13.zzd()
            if (r4 == 0) goto L414
            r4 = -1
            int r1 = r1 + r4
            com.google.android.gms.internal.ads.zzakk r4 = new com.google.android.gms.internal.ads.zzakk
            int r10 = com.google.android.gms.internal.ads.zzaen.zza(r1)
            r5 = r4
            r6 = r18
            r7 = r8
            r8 = r9
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = r4
        L3c5:
            r0.zza = r7
            if (r7 != 0) goto L3cb
            r1 = 1
            return r1
        L3cb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.gms.internal.ads.zzaem r3 = r7.zza
            byte[] r4 = r3.zzg
            r1.add(r4)
            byte[] r4 = r7.zzc
            r1.add(r4)
            com.google.android.gms.internal.ads.zzaek r4 = r7.zzb
            java.lang.String[] r4 = r4.zza
            com.google.android.gms.internal.ads.zzgax r4 = com.google.android.gms.internal.ads.zzgax.zzm(r4)
            com.google.android.gms.internal.ads.zzbk r4 = com.google.android.gms.internal.ads.zzaen.zzb(r4)
            com.google.android.gms.internal.ads.zzad r5 = new com.google.android.gms.internal.ads.zzad
            r5.<init>()
            java.lang.String r6 = "audio/vorbis"
            r5.zzZ(r6)
            int r6 = r3.zzd
            r5.zzy(r6)
            int r6 = r3.zzc
            r5.zzU(r6)
            int r6 = r3.zza
            r5.zzz(r6)
            int r3 = r3.zzb
            r5.zzaa(r3)
            r5.zzM(r1)
            r5.zzS(r4)
            com.google.android.gms.internal.ads.zzaf r1 = r5.zzaf()
            r2.zza = r1
            r1 = 1
            return r1
        L414:
            java.lang.String r1 = "framing bit after modes not set as expected"
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final void zzi(long r5) {
            r4 = this;
            super.zzi(r5)
            r0 = 0
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            r4.zzc = r5
            com.google.android.gms.internal.ads.zzaem r5 = r4.zzd
            if (r5 == 0) goto L15
            int r0 = r5.zze
        L15:
            r4.zzb = r0
            return
    }
}
