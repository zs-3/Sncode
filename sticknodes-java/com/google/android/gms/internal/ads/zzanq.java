package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzanq {
    public static com.google.android.gms.internal.ads.zzanp zza(com.google.android.gms.internal.ads.zzej r20) throws com.google.android.gms.internal.ads.zzbo {
            r0 = r20
            r1 = 8
            int r3 = r0.zzd(r1)
            r2 = 5
            int r4 = r0.zzd(r2)
            r5 = 31
            if (r4 != r5) goto L19
            r4 = 24
            int r4 = r0.zzd(r4)
            goto L8b
        L19:
            switch(r4) {
                case 0: goto L88;
                case 1: goto L84;
                case 2: goto L80;
                case 3: goto L7c;
                case 4: goto L78;
                case 5: goto L75;
                case 6: goto L72;
                case 7: goto L6f;
                case 8: goto L6c;
                case 9: goto L69;
                case 10: goto L66;
                case 11: goto L63;
                case 12: goto L60;
                case 13: goto L1c;
                case 14: goto L1c;
                case 15: goto L5c;
                case 16: goto L58;
                case 17: goto L54;
                case 18: goto L50;
                case 19: goto L4c;
                case 20: goto L49;
                case 21: goto L46;
                case 22: goto L43;
                case 23: goto L40;
                case 24: goto L3d;
                case 25: goto L3a;
                case 26: goto L36;
                case 27: goto L32;
                default: goto L1c;
            }
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported sampling rate index "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        L32:
            r4 = 9600(0x2580, float:1.3452E-41)
            goto L8b
        L36:
            r4 = 12800(0x3200, float:1.7937E-41)
            goto L8b
        L3a:
            r4 = 14400(0x3840, float:2.0179E-41)
            goto L8b
        L3d:
            r4 = 17075(0x42b3, float:2.3927E-41)
            goto L8b
        L40:
            r4 = 19200(0x4b00, float:2.6905E-41)
            goto L8b
        L43:
            r4 = 20000(0x4e20, float:2.8026E-41)
            goto L8b
        L46:
            r4 = 25600(0x6400, float:3.5873E-41)
            goto L8b
        L49:
            r4 = 28800(0x7080, float:4.0357E-41)
            goto L8b
        L4c:
            r4 = 34150(0x8566, float:4.7854E-41)
            goto L8b
        L50:
            r4 = 38400(0x9600, float:5.381E-41)
            goto L8b
        L54:
            r4 = 40000(0x9c40, float:5.6052E-41)
            goto L8b
        L58:
            r4 = 51200(0xc800, float:7.1746E-41)
            goto L8b
        L5c:
            r4 = 57600(0xe100, float:8.0715E-41)
            goto L8b
        L60:
            r4 = 7350(0x1cb6, float:1.03E-41)
            goto L8b
        L63:
            r4 = 8000(0x1f40, float:1.121E-41)
            goto L8b
        L66:
            r4 = 11025(0x2b11, float:1.545E-41)
            goto L8b
        L69:
            r4 = 12000(0x2ee0, float:1.6816E-41)
            goto L8b
        L6c:
            r4 = 16000(0x3e80, float:2.2421E-41)
            goto L8b
        L6f:
            r4 = 22050(0x5622, float:3.0899E-41)
            goto L8b
        L72:
            r4 = 24000(0x5dc0, float:3.3631E-41)
            goto L8b
        L75:
            r4 = 32000(0x7d00, float:4.4842E-41)
            goto L8b
        L78:
            r4 = 44100(0xac44, float:6.1797E-41)
            goto L8b
        L7c:
            r4 = 48000(0xbb80, float:6.7262E-41)
            goto L8b
        L80:
            r4 = 64000(0xfa00, float:8.9683E-41)
            goto L8b
        L84:
            r4 = 88200(0x15888, float:1.23595E-40)
            goto L8b
        L88:
            r4 = 96000(0x17700, float:1.34525E-40)
        L8b:
            r5 = 3
            int r6 = r0.zzd(r5)
            java.lang.String r7 = "Unsupported coreSbrFrameLengthIndex "
            r8 = 4
            r9 = 2
            r10 = 1
            if (r6 == 0) goto Lbc
            if (r6 == r10) goto Lb9
            if (r6 == r9) goto Lb6
            if (r6 == r5) goto Lb6
            if (r6 != r8) goto La2
            r11 = 4096(0x1000, float:5.74E-42)
            goto Lbe
        La2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        Lb6:
            r11 = 2048(0x800, float:2.87E-42)
            goto Lbe
        Lb9:
            r11 = 1024(0x400, float:1.435E-42)
            goto Lbe
        Lbc:
            r11 = 768(0x300, float:1.076E-42)
        Lbe:
            if (r6 == 0) goto Le2
            if (r6 == r10) goto Le2
            if (r6 == r9) goto Le0
            if (r6 == r5) goto Lde
            if (r6 != r8) goto Lca
            r6 = 1
            goto Le3
        Lca:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        Lde:
            r6 = 3
            goto Le3
        Le0:
            r6 = 2
            goto Le3
        Le2:
            r6 = 0
        Le3:
            r0.zzn(r9)
            zze(r20)
            int r7 = r0.zzd(r2)
            r13 = 0
            r14 = 0
        Lef:
            int r15 = r7 + 1
            r12 = 16
            if (r13 >= r15) goto L10f
            int r15 = r0.zzd(r5)
            int r12 = zzc(r0, r2, r1, r12)
            int r12 = r12 + r10
            int r14 = r14 + r12
            if (r15 == 0) goto L103
            if (r15 != r9) goto L10c
        L103:
            boolean r12 = r20.zzp()
            if (r12 == 0) goto L10c
            zze(r20)
        L10c:
            int r13 = r13 + 1
            goto Lef
        L10f:
            int r7 = zzc(r0, r8, r1, r12)
            int r7 = r7 + r10
            r20.zzm()
            r13 = 0
        L118:
            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r13 >= r7) goto L1c7
            int r15 = r0.zzd(r9)
            if (r15 == 0) goto L1b5
            if (r15 == r10) goto L145
            if (r15 == r5) goto L129
        L126:
            r12 = r3
            goto L1be
        L129:
            zzc(r0, r8, r1, r12)
            int r15 = zzc(r0, r8, r1, r12)
            boolean r17 = r20.zzp()
            r10 = 0
            if (r17 == 0) goto L13a
            zzc(r0, r1, r12, r10)
        L13a:
            r20.zzm()
            if (r15 <= 0) goto L126
            int r15 = r15 * 8
            r0.zzn(r15)
            goto L126
        L145:
            r10 = 0
            boolean r15 = zzf(r20)
            if (r15 == 0) goto L14f
            r20.zzm()
        L14f:
            if (r6 <= 0) goto L15b
            zzd(r20)
            int r15 = r0.zzd(r9)
            r16 = r6
            goto L15e
        L15b:
            r15 = 0
            r16 = 0
        L15e:
            if (r15 <= 0) goto L180
            r10 = 6
            r0.zzn(r10)
            int r12 = r0.zzd(r9)
            r0.zzn(r8)
            boolean r19 = r20.zzp()
            if (r19 == 0) goto L174
            r0.zzn(r2)
        L174:
            if (r15 == r9) goto L178
            if (r15 != r5) goto L17b
        L178:
            r0.zzn(r10)
        L17b:
            if (r12 != r9) goto L180
            r20.zzm()
        L180:
            int r10 = r14 + (-1)
            r12 = r3
            double r2 = (double) r10
            double r2 = java.lang.Math.log(r2)
            double r17 = java.lang.Math.log(r17)
            double r2 = r2 / r17
            double r2 = java.lang.Math.floor(r2)
            int r2 = (int) r2
            r3 = 1
            int r2 = r2 + r3
            int r3 = r0.zzd(r9)
            if (r3 <= 0) goto L1a4
            boolean r10 = r20.zzp()
            if (r10 == 0) goto L1a4
            r0.zzn(r2)
        L1a4:
            boolean r10 = r20.zzp()
            if (r10 == 0) goto L1ad
            r0.zzn(r2)
        L1ad:
            if (r16 != 0) goto L1be
            if (r3 != 0) goto L1be
            r20.zzm()
            goto L1be
        L1b5:
            r12 = r3
            zzf(r20)
            if (r6 <= 0) goto L1be
            zzd(r20)
        L1be:
            int r13 = r13 + 1
            r3 = r12
            r2 = 5
            r10 = 1
            r12 = 16
            goto L118
        L1c7:
            r12 = r3
            boolean r2 = r20.zzp()
            r3 = 0
            if (r2 == 0) goto L206
            int r2 = zzc(r0, r9, r8, r1)
            r5 = 1
            int r2 = r2 + r5
            r6 = 0
        L1d6:
            if (r6 >= r2) goto L206
            r7 = 16
            int r9 = zzc(r0, r8, r1, r7)
            int r10 = zzc(r0, r8, r1, r7)
            r13 = 7
            if (r9 != r13) goto L1fe
            int r3 = r0.zzd(r8)
            int r3 = r3 + r5
            r0.zzn(r8)
            byte[] r9 = new byte[r3]
            r10 = 0
        L1f0:
            if (r10 >= r3) goto L1fc
            int r13 = r0.zzd(r1)
            byte r13 = (byte) r13
            r9[r10] = r13
            int r10 = r10 + 1
            goto L1f0
        L1fc:
            r3 = r9
            goto L203
        L1fe:
            int r10 = r10 * 8
            r0.zzn(r10)
        L203:
            int r6 = r6 + 1
            goto L1d6
        L206:
            r6 = r3
            switch(r4) {
                case 14700: goto L226;
                case 16000: goto L226;
                case 22050: goto L228;
                case 24000: goto L228;
                case 29400: goto L223;
                case 32000: goto L223;
                case 44100: goto L220;
                case 48000: goto L220;
                case 58800: goto L223;
                case 64000: goto L223;
                case 88200: goto L220;
                case 96000: goto L220;
                default: goto L20a;
            }
        L20a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported sampling rate "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        L220:
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L228
        L223:
            r17 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            goto L228
        L226:
            r17 = 4613937818241073152(0x4008000000000000, double:3.0)
        L228:
            double r0 = (double) r4
            double r2 = (double) r11
            com.google.android.gms.internal.ads.zzanp r8 = new com.google.android.gms.internal.ads.zzanp
            double r2 = r2 * r17
            double r0 = r0 * r17
            int r4 = (int) r0
            int r5 = (int) r2
            r7 = 0
            r2 = r8
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
    }

    public static boolean zzb(com.google.android.gms.internal.ads.zzej r17, com.google.android.gms.internal.ads.zzann r18) throws com.google.android.gms.internal.ads.zzbo {
            r0 = r17
            r1 = r18
            r17.zzb()
            r2 = 3
            r3 = 8
            int r2 = zzc(r0, r2, r3, r3)
            r1.zza = r2
            r4 = -1
            if (r2 == r4) goto Lc5
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L25
            r6 = 1
            goto L26
        L25:
            r6 = 0
        L26:
            com.google.android.gms.internal.ads.zzdi.zzd(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.zzgdp.zza(r10, r12)
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.zzgdp.zza(r14, r4)
            int r4 = r17.zza()
            r14 = -1
            if (r4 >= r2) goto L43
        L41:
            r4 = r14
            goto L6a
        L43:
            long r4 = r0.zze(r2)
            int r16 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r16 != 0) goto L6a
            int r4 = r17.zza()
            if (r4 >= r3) goto L52
            goto L41
        L52:
            long r3 = r0.zze(r3)
            long r10 = r10 + r3
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 != 0) goto L69
            int r3 = r17.zza()
            if (r3 >= r7) goto L62
            goto L41
        L62:
            long r3 = r0.zze(r7)
            long r4 = r10 + r3
            goto L6a
        L69:
            r4 = r10
        L6a:
            r1.zzb = r4
            int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r3 != 0) goto L72
            r3 = 0
            return r3
        L72:
            r10 = 16
            int r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r3 > 0) goto Laf
            r10 = 0
            int r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r3 != 0) goto L9f
            int r3 = r1.zza
            r4 = 0
            if (r3 == r9) goto L98
            if (r3 == r2) goto L91
            r2 = 17
            if (r3 == r2) goto L8a
            goto L9f
        L8a:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r4)
            throw r0
        L91:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r4)
            throw r0
        L98:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r4)
            throw r0
        L9f:
            r2 = 11
            r3 = 24
            int r0 = zzc(r0, r2, r3, r3)
            r1.zzc = r0
            r1 = -1
            if (r0 == r1) goto Lad
            return r9
        Lad:
            r0 = 0
            return r0
        Laf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        Lc5:
            r0 = 0
            return r0
    }

    private static int zzc(com.google.android.gms.internal.ads.zzej r5, int r6, int r7, int r8) {
            int r0 = java.lang.Math.max(r6, r7)
            int r0 = java.lang.Math.max(r0, r8)
            r1 = 1
            r2 = 31
            if (r0 > r2) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            int r0 = r1 << r6
            int r2 = r1 << r7
            r3 = -1
            int r0 = r0 + r3
            int r2 = r2 + r3
            int r4 = com.google.android.gms.internal.ads.zzgdn.zza(r0, r2)
            int r1 = r1 << r8
            com.google.android.gms.internal.ads.zzgdn.zza(r4, r1)
            int r1 = r5.zza()
            if (r1 >= r6) goto L29
            return r3
        L29:
            int r6 = r5.zzd(r6)
            if (r6 != r0) goto L49
            int r0 = r5.zza()
            if (r0 >= r7) goto L36
            return r3
        L36:
            int r7 = r5.zzd(r7)
            int r6 = r6 + r7
            if (r7 != r2) goto L49
            int r7 = r5.zza()
            if (r7 >= r8) goto L44
            return r3
        L44:
            int r5 = r5.zzd(r8)
            int r6 = r6 + r5
        L49:
            return r6
    }

    private static void zzd(com.google.android.gms.internal.ads.zzej r2) {
            r0 = 3
            r2.zzn(r0)
            r0 = 8
            r2.zzn(r0)
            boolean r0 = r2.zzp()
            boolean r1 = r2.zzp()
            if (r0 == 0) goto L17
            r0 = 5
            r2.zzn(r0)
        L17:
            if (r1 == 0) goto L1d
            r0 = 6
            r2.zzn(r0)
        L1d:
            return
    }

    private static void zze(com.google.android.gms.internal.ads.zzej r12) {
            r0 = 2
            int r1 = r12.zzd(r0)
            r2 = 6
            if (r1 != 0) goto Lc
            r12.zzn(r2)
            return
        Lc:
            r3 = 16
            r4 = 5
            r5 = 8
            int r3 = zzc(r12, r4, r5, r3)
            r6 = 1
            int r3 = r3 + r6
            r7 = 7
            if (r1 != r6) goto L20
            int r3 = r3 * 7
            r12.zzn(r3)
            return
        L20:
            if (r1 != r0) goto L75
            boolean r1 = r12.zzp()
            if (r6 == r1) goto L2a
            r8 = 5
            goto L2b
        L2a:
            r8 = 1
        L2b:
            if (r6 == r1) goto L2e
            goto L2f
        L2e:
            r4 = 7
        L2f:
            if (r6 == r1) goto L32
            goto L34
        L32:
            r2 = 8
        L34:
            r1 = 0
            r5 = 0
        L36:
            if (r5 >= r3) goto L75
            boolean r9 = r12.zzp()
            r10 = 180(0xb4, float:2.52E-43)
            if (r9 == 0) goto L45
            r12.zzn(r7)
            r9 = 0
            goto L67
        L45:
            int r9 = r12.zzd(r0)
            r11 = 3
            if (r9 != r11) goto L57
            int r9 = r12.zzd(r4)
            int r9 = r9 * r8
            if (r9 == 0) goto L57
            r12.zzm()
        L57:
            int r9 = r12.zzd(r2)
            int r9 = r9 * r8
            if (r9 == 0) goto L64
            if (r9 == r10) goto L64
            r12.zzm()
        L64:
            r12.zzm()
        L67:
            if (r9 == 0) goto L73
            if (r9 == r10) goto L73
            boolean r9 = r12.zzp()
            if (r9 == 0) goto L73
            int r5 = r5 + 1
        L73:
            int r5 = r5 + r6
            goto L36
        L75:
            return
    }

    private static boolean zzf(com.google.android.gms.internal.ads.zzej r2) {
            r0 = 3
            r2.zzn(r0)
            boolean r0 = r2.zzp()
            if (r0 == 0) goto Lf
            r1 = 13
            r2.zzn(r1)
        Lf:
            return r0
    }
}
