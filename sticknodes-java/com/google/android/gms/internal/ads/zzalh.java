package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzalh implements com.google.android.gms.internal.ads.zzakv {
    private static final byte[] zza = null;
    private static final byte[] zzb = null;
    private static final byte[] zzc = null;
    private final android.graphics.Paint zzd;
    private final android.graphics.Paint zze;
    private final android.graphics.Canvas zzf;
    private final com.google.android.gms.internal.ads.zzala zzg;
    private final com.google.android.gms.internal.ads.zzakz zzh;
    private final com.google.android.gms.internal.ads.zzalg zzi;
    private android.graphics.Bitmap zzj;

    static {
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x001a: FILL_ARRAY_DATA , data: [0, 7, 8, 15} // fill-array
            com.google.android.gms.internal.ads.zzalh.zza = r1
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 119, -120, -1} // fill-array
            com.google.android.gms.internal.ads.zzalh.zzb = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1} // fill-array
            com.google.android.gms.internal.ads.zzalh.zzc = r0
            return
    }

    public zzalh(java.util.List r11) {
            r10 = this;
            r10.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 0
            java.lang.Object r11 = r11.get(r1)
            byte[] r11 = (byte[]) r11
            r0.<init>(r11)
            int r11 = r0.zzq()
            int r0 = r0.zzq()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r10.zzd = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.setStyle(r3)
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC
            r3.<init>(r4)
            r2.setXfermode(r3)
            r3 = 0
            r2.setPathEffect(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r10.zze = r2
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r2.setStyle(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OVER
            r4.<init>(r5)
            r2.setXfermode(r4)
            r2.setPathEffect(r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>()
            r10.zzf = r2
            com.google.android.gms.internal.ads.zzala r2 = new com.google.android.gms.internal.ads.zzala
            r7 = 719(0x2cf, float:1.008E-42)
            r5 = 575(0x23f, float:8.06E-43)
            r6 = 0
            r8 = 0
            r9 = 575(0x23f, float:8.06E-43)
            r3 = r2
            r4 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.zzg = r2
            com.google.android.gms.internal.ads.zzakz r2 = new com.google.android.gms.internal.ads.zzakz
            int[] r3 = zzg()
            int[] r4 = zzh()
            int[] r5 = zzi()
            r2.<init>(r1, r3, r4, r5)
            r10.zzh = r2
            com.google.android.gms.internal.ads.zzalg r1 = new com.google.android.gms.internal.ads.zzalg
            r1.<init>(r11, r0)
            r10.zzi = r1
            return
    }

    private static int zzb(int r0, int r1, int r2, int r3) {
            int r0 = r0 << 24
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r2 << 8
            r0 = r0 | r1
            r0 = r0 | r3
            return r0
    }

    private static com.google.android.gms.internal.ads.zzakz zzc(com.google.android.gms.internal.ads.zzej r23, int r24) {
            r0 = r23
            r1 = 8
            int r2 = r0.zzd(r1)
            r0.zzn(r1)
            int[] r3 = zzg()
            int[] r4 = zzh()
            int[] r5 = zzi()
            int r6 = r24 + (-2)
        L19:
            if (r6 <= 0) goto Ld0
            int r7 = r0.zzd(r1)
            int r8 = r0.zzd(r1)
            int r6 = r6 + (-2)
            r9 = r8 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L2b
            r9 = r3
            goto L32
        L2b:
            r9 = r8 & 64
            if (r9 == 0) goto L31
            r9 = r4
            goto L32
        L31:
            r9 = r5
        L32:
            r8 = r8 & 1
            if (r8 == 0) goto L49
            int r8 = r0.zzd(r1)
            int r10 = r0.zzd(r1)
            int r11 = r0.zzd(r1)
            int r12 = r0.zzd(r1)
            int r6 = r6 + (-4)
            goto L68
        L49:
            r8 = 6
            int r10 = r0.zzd(r8)
            r11 = 2
            int r10 = r10 << r11
            r12 = 4
            int r13 = r0.zzd(r12)
            int r13 = r13 << r12
            int r14 = r0.zzd(r12)
            int r12 = r14 << 4
            int r11 = r0.zzd(r11)
            int r8 = r11 << 6
            int r6 = r6 + (-2)
            r11 = r12
            r12 = r8
            r8 = r10
            r10 = r13
        L68:
            r13 = 255(0xff, float:3.57E-43)
            if (r8 != 0) goto L6e
            r12 = 255(0xff, float:3.57E-43)
        L6e:
            if (r8 != 0) goto L71
            r11 = 0
        L71:
            if (r8 != 0) goto L74
            r10 = 0
        L74:
            r12 = r12 & r13
            int r12 = 255 - r12
            int r11 = r11 + (-128)
            r16 = r2
            double r1 = (double) r8
            int r10 = r10 + (-128)
            double r14 = (double) r10
            r17 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            double r17 = r17 * r14
            r10 = r9
            double r8 = r1 + r17
            int r8 = (int) r8
            int r8 = java.lang.Math.min(r8, r13)
            byte r9 = (byte) r12
            r12 = 0
            int r8 = java.lang.Math.max(r12, r8)
            double r12 = (double) r11
            r19 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            double r19 = r19 * r12
            double r19 = r1 - r19
            r21 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r14 = r14 * r21
            double r14 = r19 - r14
            int r11 = (int) r14
            r14 = 255(0xff, float:3.57E-43)
            int r11 = java.lang.Math.min(r11, r14)
            r15 = 0
            int r11 = java.lang.Math.max(r15, r11)
            r17 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r12 = r12 * r17
            double r1 = r1 + r12
            int r1 = (int) r1
            int r1 = java.lang.Math.min(r1, r14)
            int r1 = java.lang.Math.max(r15, r1)
            int r1 = zzb(r9, r8, r11, r1)
            r10[r7] = r1
            r2 = r16
            r1 = 8
            goto L19
        Ld0:
            r16 = r2
            com.google.android.gms.internal.ads.zzakz r0 = new com.google.android.gms.internal.ads.zzakz
            r1 = r16
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    private static com.google.android.gms.internal.ads.zzalb zzd(com.google.android.gms.internal.ads.zzej r6) {
            r0 = 16
            int r1 = r6.zzd(r0)
            r2 = 4
            r6.zzn(r2)
            r2 = 2
            int r2 = r6.zzd(r2)
            boolean r3 = r6.zzp()
            r4 = 1
            r6.zzn(r4)
            byte[] r5 = com.google.android.gms.internal.ads.zzeu.zzf
            if (r2 != r4) goto L27
            r2 = 8
            int r2 = r6.zzd(r2)
            int r2 = r2 * 16
            r6.zzn(r2)
            goto L41
        L27:
            if (r2 != 0) goto L41
            int r2 = r6.zzd(r0)
            int r0 = r6.zzd(r0)
            r4 = 0
            if (r2 <= 0) goto L39
            byte[] r5 = new byte[r2]
            r6.zzi(r5, r4, r2)
        L39:
            if (r0 <= 0) goto L41
            byte[] r2 = new byte[r0]
            r6.zzi(r2, r4, r0)
            goto L42
        L41:
            r2 = r5
        L42:
            com.google.android.gms.internal.ads.zzalb r6 = new com.google.android.gms.internal.ads.zzalb
            r6.<init>(r1, r3, r5, r2)
            return r6
    }

    private static void zze(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
            r0 = r24
            r1 = r26
            r8 = r29
            com.google.android.gms.internal.ads.zzej r9 = new com.google.android.gms.internal.ads.zzej
            int r2 = r0.length
            r9.<init>(r0, r2)
            r2 = r27
            r10 = r28
            r11 = 0
            r12 = 0
            r13 = 0
        L13:
            int r3 = r9.zza()
            if (r3 == 0) goto L22f
            r14 = 8
            int r3 = r9.zzd(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L229
            r15 = 3
            r7 = 4
            r6 = 1
            r5 = 2
            r16 = 0
            switch(r3) {
                case 16: goto L150;
                case 17: goto L9b;
                case 18: goto L41;
                default: goto L2c;
            }
        L2c:
            switch(r3) {
                case 32: goto L3c;
                case 33: goto L37;
                case 34: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L13
        L30:
            r3 = 16
            byte[] r12 = zzf(r3, r14, r9)
            goto L13
        L37:
            byte[] r11 = zzf(r7, r14, r9)
            goto L13
        L3c:
            byte[] r13 = zzf(r7, r7, r9)
            goto L13
        L41:
            r15 = r2
            r2 = 0
        L43:
            int r3 = r9.zzd(r14)
            if (r3 == 0) goto L4e
            r17 = r2
            r18 = 1
            goto L74
        L4e:
            boolean r3 = r9.zzp()
            r4 = 7
            if (r3 != 0) goto L67
            int r3 = r9.zzd(r4)
            if (r3 == 0) goto L61
            r17 = r2
            r18 = r3
            r3 = 0
            goto L74
        L61:
            r3 = 0
            r17 = 1
            r18 = 0
            goto L74
        L67:
            int r3 = r9.zzd(r4)
            int r4 = r9.zzd(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L74:
            if (r18 == 0) goto L8f
            if (r8 == 0) goto L8f
            int r2 = r10 + 1
            float r4 = (float) r10
            r3 = r25[r3]
            r8.setColor(r3)
            float r3 = (float) r15
            int r5 = r15 + r18
            float r5 = (float) r5
            float r7 = (float) r2
            r2 = r30
            r0 = 1
            r6 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L90
        L8f:
            r0 = 1
        L90:
            int r15 = r15 + r18
            if (r17 != 0) goto L98
            r2 = r17
            r6 = 1
            goto L43
        L98:
            r2 = r15
            goto L13
        L9b:
            r0 = 1
            if (r1 != r15) goto La8
            if (r12 != 0) goto La5
            byte[] r3 = com.google.android.gms.internal.ads.zzalh.zzc
            r17 = r3
            goto Laa
        La5:
            r17 = r12
            goto Laa
        La8:
            r17 = 0
        Laa:
            r6 = r2
            r2 = 0
        Lac:
            int r3 = r9.zzd(r7)
            if (r3 == 0) goto Lb8
            r18 = r2
        Lb4:
            r19 = 1
            goto L117
        Lb8:
            boolean r3 = r9.zzp()
            if (r3 != 0) goto Ld2
            int r3 = r9.zzd(r15)
            if (r3 == 0) goto Lcc
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
            r3 = 0
            goto L117
        Lcc:
            r3 = 0
            r18 = 1
        Lcf:
            r19 = 0
            goto L117
        Ld2:
            boolean r3 = r9.zzp()
            if (r3 != 0) goto Le7
            int r3 = r9.zzd(r5)
            int r3 = r3 + r7
            int r4 = r9.zzd(r7)
        Le1:
            r18 = r2
            r19 = r3
            r3 = r4
            goto L117
        Le7:
            int r3 = r9.zzd(r5)
            if (r3 == 0) goto L113
            if (r3 == r0) goto L10d
            if (r3 == r5) goto L102
            if (r3 == r15) goto Lf7
            r18 = r2
            r3 = 0
            goto Lcf
        Lf7:
            int r3 = r9.zzd(r14)
            int r3 = r3 + 25
            int r4 = r9.zzd(r7)
            goto Le1
        L102:
            int r3 = r9.zzd(r7)
            int r3 = r3 + 9
            int r4 = r9.zzd(r7)
            goto Le1
        L10d:
            r18 = r2
            r3 = 0
            r19 = 2
            goto L117
        L113:
            r18 = r2
            r3 = 0
            goto Lb4
        L117:
            if (r19 == 0) goto L13b
            if (r8 == 0) goto L13b
            int r2 = r10 + 1
            float r4 = (float) r10
            if (r17 == 0) goto L122
            r3 = r17[r3]
        L122:
            float r2 = (float) r2
            r3 = r25[r3]
            r8.setColor(r3)
            float r3 = (float) r6
            int r5 = r6 + r19
            float r5 = (float) r5
            r20 = r2
            r2 = r30
            r14 = 2
            r22 = r6
            r6 = r20
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L13e
        L13b:
            r22 = r6
            r14 = 2
        L13e:
            int r6 = r22 + r19
            if (r18 == 0) goto L148
            r9.zzf()
            r2 = r6
            goto L13
        L148:
            r2 = r18
            r5 = 2
            r7 = 4
            r14 = 8
            goto Lac
        L150:
            r0 = 1
            r14 = 2
            if (r1 != r15) goto L15e
            if (r11 != 0) goto L15b
            byte[] r3 = com.google.android.gms.internal.ads.zzalh.zzb
        L158:
            r17 = r3
            goto L16a
        L15b:
            r17 = r11
            goto L16a
        L15e:
            if (r1 != r14) goto L168
            if (r13 != 0) goto L165
            byte[] r3 = com.google.android.gms.internal.ads.zzalh.zza
            goto L158
        L165:
            r17 = r13
            goto L16a
        L168:
            r17 = 0
        L16a:
            r7 = r2
            r6 = 0
        L16c:
            int r2 = r9.zzd(r14)
            if (r2 == 0) goto L17b
            r19 = r6
        L174:
            r4 = 4
            r5 = 8
            r18 = 1
            goto L1e9
        L17b:
            boolean r2 = r9.zzp()
            if (r2 == 0) goto L193
            int r2 = r9.zzd(r15)
            int r2 = r2 + r15
            int r3 = r9.zzd(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            r4 = 4
            r5 = 8
            goto L1e9
        L193:
            boolean r2 = r9.zzp()
            if (r2 == 0) goto L19d
            r19 = r6
            r2 = 0
            goto L174
        L19d:
            int r2 = r9.zzd(r14)
            if (r2 == 0) goto L1e1
            if (r2 == r0) goto L1d8
            if (r2 == r14) goto L1c5
            if (r2 == r15) goto L1b2
            r19 = r6
            r2 = 0
            r4 = 4
            r5 = 8
            r18 = 0
            goto L1e9
        L1b2:
            r5 = 8
            int r2 = r9.zzd(r5)
            int r2 = r2 + 29
            int r3 = r9.zzd(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            r4 = 4
            goto L1e9
        L1c5:
            r4 = 4
            r5 = 8
            int r2 = r9.zzd(r4)
            int r2 = r2 + 12
            int r3 = r9.zzd(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            goto L1e9
        L1d8:
            r4 = 4
            r5 = 8
            r19 = r6
            r2 = 0
            r18 = 2
            goto L1e9
        L1e1:
            r4 = 4
            r5 = 8
            r2 = 0
            r18 = 0
            r19 = 1
        L1e9:
            if (r18 == 0) goto L215
            if (r8 == 0) goto L215
            int r3 = r10 + 1
            float r6 = (float) r10
            if (r17 == 0) goto L1f4
            r2 = r17[r2]
        L1f4:
            float r3 = (float) r3
            r2 = r25[r2]
            r8.setColor(r2)
            float r2 = (float) r7
            int r0 = r7 + r18
            float r0 = (float) r0
            r21 = r2
            r2 = r30
            r22 = r3
            r3 = r21
            r21 = 4
            r4 = r6
            r23 = 8
            r5 = r0
            r6 = r22
            r0 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L21a
        L215:
            r0 = r7
            r21 = 4
            r23 = 8
        L21a:
            int r7 = r0 + r18
            if (r19 == 0) goto L224
            r9.zzf()
            r2 = r7
            goto L13
        L224:
            r6 = r19
            r0 = 1
            goto L16c
        L229:
            int r10 = r10 + 2
            r2 = r27
            goto L13
        L22f:
            return
    }

    private static byte[] zzf(int r3, int r4, com.google.android.gms.internal.ads.zzej r5) {
            byte[] r0 = new byte[r3]
            r1 = 0
        L3:
            if (r1 >= r3) goto Lf
            int r2 = r5.zzd(r4)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        Lf:
            return r0
    }

    private static int[] zzg() {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, -1, -16777216, -8421505} // fill-array
            return r0
    }

    private static int[] zzh() {
            r0 = 16
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r2
            r3 = 1
            r4 = 1
        L9:
            if (r4 >= r0) goto L4b
            r5 = r4 & 4
            r6 = r4 & 2
            r7 = r4 & 1
            r8 = 8
            r9 = 255(0xff, float:3.57E-43)
            if (r4 >= r8) goto L30
            if (r3 == r7) goto L1b
            r7 = 0
            goto L1d
        L1b:
            r7 = 255(0xff, float:3.57E-43)
        L1d:
            if (r6 == 0) goto L22
            r6 = 255(0xff, float:3.57E-43)
            goto L23
        L22:
            r6 = 0
        L23:
            if (r5 == 0) goto L28
            r5 = 255(0xff, float:3.57E-43)
            goto L29
        L28:
            r5 = 0
        L29:
            int r5 = zzb(r9, r7, r6, r5)
            r1[r4] = r5
            goto L48
        L30:
            r8 = 127(0x7f, float:1.78E-43)
            if (r3 == r7) goto L36
            r7 = 0
            goto L38
        L36:
            r7 = 127(0x7f, float:1.78E-43)
        L38:
            if (r6 == 0) goto L3d
            r6 = 127(0x7f, float:1.78E-43)
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r5 == 0) goto L41
            goto L42
        L41:
            r8 = 0
        L42:
            int r5 = zzb(r9, r7, r6, r8)
            r1[r4] = r5
        L48:
            int r4 = r4 + 1
            goto L9
        L4b:
            return r1
    }

    private static int[] zzi() {
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto L129
            r4 = 8
            r5 = 255(0xff, float:3.57E-43)
            r6 = 1
            if (r3 >= r4) goto L31
            r4 = r3 & 1
            r7 = r3 & 2
            r8 = r3 & 4
            if (r6 == r4) goto L1b
            r4 = 0
            goto L1d
        L1b:
            r4 = 255(0xff, float:3.57E-43)
        L1d:
            if (r7 == 0) goto L22
            r6 = 255(0xff, float:3.57E-43)
            goto L23
        L22:
            r6 = 0
        L23:
            if (r8 == 0) goto L26
            goto L27
        L26:
            r5 = 0
        L27:
            r7 = 63
            int r4 = zzb(r7, r4, r6, r5)
            r1[r3] = r4
            goto L125
        L31:
            r7 = r3 & 136(0x88, float:1.9E-43)
            r8 = 170(0xaa, float:2.38E-43)
            r9 = 85
            if (r7 == 0) goto Lf0
            r10 = 127(0x7f, float:1.78E-43)
            if (r7 == r4) goto Lba
            r4 = 128(0x80, float:1.794E-43)
            r8 = 43
            if (r7 == r4) goto L80
            r4 = 136(0x88, float:1.9E-43)
            if (r7 == r4) goto L49
            goto L125
        L49:
            r4 = r3 & 16
            r7 = r3 & 1
            r10 = r3 & 32
            r11 = r3 & 2
            r12 = r3 & 64
            r13 = r3 & 4
            if (r6 == r7) goto L59
            r6 = 0
            goto L5b
        L59:
            r6 = 43
        L5b:
            if (r4 == 0) goto L60
            r4 = 85
            goto L61
        L60:
            r4 = 0
        L61:
            if (r11 == 0) goto L66
            r7 = 43
            goto L67
        L66:
            r7 = 0
        L67:
            if (r10 == 0) goto L6c
            r10 = 85
            goto L6d
        L6c:
            r10 = 0
        L6d:
            if (r13 == 0) goto L70
            goto L71
        L70:
            r8 = 0
        L71:
            if (r12 == 0) goto L74
            goto L75
        L74:
            r9 = 0
        L75:
            int r6 = r6 + r4
            int r7 = r7 + r10
            int r8 = r8 + r9
            int r4 = zzb(r5, r6, r7, r8)
            r1[r3] = r4
            goto L125
        L80:
            r4 = r3 & 16
            r7 = r3 & 1
            r11 = r3 & 32
            r12 = r3 & 2
            r13 = r3 & 64
            r14 = r3 & 4
            if (r6 == r7) goto L90
            r6 = 0
            goto L92
        L90:
            r6 = 43
        L92:
            int r6 = r6 + r10
            if (r4 == 0) goto L98
            r4 = 85
            goto L99
        L98:
            r4 = 0
        L99:
            if (r12 == 0) goto L9e
            r7 = 43
            goto L9f
        L9e:
            r7 = 0
        L9f:
            int r7 = r7 + r10
            if (r11 == 0) goto La5
            r11 = 85
            goto La6
        La5:
            r11 = 0
        La6:
            if (r14 == 0) goto La9
            goto Laa
        La9:
            r8 = 0
        Laa:
            int r8 = r8 + r10
            if (r13 == 0) goto Lae
            goto Laf
        Lae:
            r9 = 0
        Laf:
            int r6 = r6 + r4
            int r7 = r7 + r11
            int r8 = r8 + r9
            int r4 = zzb(r5, r6, r7, r8)
            r1[r3] = r4
            goto L125
        Lba:
            r4 = r3 & 16
            r5 = r3 & 1
            r7 = r3 & 32
            r11 = r3 & 2
            r12 = r3 & 64
            r13 = r3 & 4
            if (r6 == r5) goto Lca
            r5 = 0
            goto Lcc
        Lca:
            r5 = 85
        Lcc:
            if (r4 == 0) goto Ld1
            r4 = 170(0xaa, float:2.38E-43)
            goto Ld2
        Ld1:
            r4 = 0
        Ld2:
            if (r11 == 0) goto Ld7
            r6 = 85
            goto Ld8
        Ld7:
            r6 = 0
        Ld8:
            if (r7 == 0) goto Ldd
            r7 = 170(0xaa, float:2.38E-43)
            goto Lde
        Ldd:
            r7 = 0
        Lde:
            if (r13 == 0) goto Le1
            goto Le2
        Le1:
            r9 = 0
        Le2:
            if (r12 == 0) goto Le5
            goto Le6
        Le5:
            r8 = 0
        Le6:
            int r9 = r9 + r8
            int r6 = r6 + r7
            int r5 = r5 + r4
            int r4 = zzb(r10, r5, r6, r9)
            r1[r3] = r4
            goto L125
        Lf0:
            r4 = r3 & 16
            r7 = r3 & 1
            r10 = r3 & 32
            r11 = r3 & 2
            r12 = r3 & 64
            r13 = r3 & 4
            if (r6 == r7) goto L100
            r6 = 0
            goto L102
        L100:
            r6 = 85
        L102:
            if (r4 == 0) goto L107
            r4 = 170(0xaa, float:2.38E-43)
            goto L108
        L107:
            r4 = 0
        L108:
            if (r11 == 0) goto L10d
            r7 = 85
            goto L10e
        L10d:
            r7 = 0
        L10e:
            if (r10 == 0) goto L113
            r10 = 170(0xaa, float:2.38E-43)
            goto L114
        L113:
            r10 = 0
        L114:
            if (r13 == 0) goto L117
            goto L118
        L117:
            r9 = 0
        L118:
            if (r12 == 0) goto L11b
            goto L11c
        L11b:
            r8 = 0
        L11c:
            int r9 = r9 + r8
            int r7 = r7 + r10
            int r6 = r6 + r4
            int r4 = zzb(r5, r6, r7, r9)
            r1[r3] = r4
        L125:
            int r3 = r3 + 1
            goto L8
        L129:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] r34, int r35, int r36, com.google.android.gms.internal.ads.zzaku r37, com.google.android.gms.internal.ads.zzdn r38) {
            r33 = this;
            r0 = r33
            r1 = r35
            int r2 = r1 + r36
            com.google.android.gms.internal.ads.zzej r3 = new com.google.android.gms.internal.ads.zzej
            r4 = r34
            r3.<init>(r4, r2)
            r3.zzl(r1)
        L10:
            int r1 = r3.zza()
            r2 = 48
            r4 = 3
            r5 = 1
            r6 = 2
            if (r1 < r2) goto L208
            r1 = 8
            int r2 = r3.zzd(r1)
            r8 = 15
            if (r2 != r8) goto L208
            com.google.android.gms.internal.ads.zzalg r2 = r0.zzi
            int r8 = r3.zzd(r1)
            r9 = 16
            int r10 = r3.zzd(r9)
            int r11 = r3.zzd(r9)
            int r12 = r3.zzb()
            int r12 = r12 + r11
            int r13 = r11 * 8
            int r14 = r3.zza()
            if (r13 <= r14) goto L51
            java.lang.String r1 = "DvbParser"
            java.lang.String r2 = "Data field length exceeds limit"
            com.google.android.gms.internal.ads.zzea.zzf(r1, r2)
            int r1 = r3.zza()
            r3.zzn(r1)
            goto L10
        L51:
            r13 = 4
            switch(r8) {
                case 16: goto L1a1;
                case 17: goto Lde;
                case 18: goto Lbc;
                case 19: goto L9a;
                case 20: goto L57;
                default: goto L55;
            }
        L55:
            goto L1fe
        L57:
            int r1 = r2.zza
            if (r10 != r1) goto L1fe
            r3.zzn(r13)
            boolean r1 = r3.zzp()
            r3.zzn(r4)
            int r14 = r3.zzd(r9)
            int r15 = r3.zzd(r9)
            if (r1 == 0) goto L88
            int r7 = r3.zzd(r9)
            int r1 = r3.zzd(r9)
            int r4 = r3.zzd(r9)
            int r5 = r3.zzd(r9)
            r17 = r1
            r18 = r4
            r19 = r5
            r16 = r7
            goto L90
        L88:
            r17 = r14
            r19 = r15
            r16 = 0
            r18 = 0
        L90:
            com.google.android.gms.internal.ads.zzala r1 = new com.google.android.gms.internal.ads.zzala
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r2.zzh = r1
            goto L1fe
        L9a:
            int r1 = r2.zza
            if (r10 != r1) goto Lab
            com.google.android.gms.internal.ads.zzalb r1 = zzd(r3)
            android.util.SparseArray r2 = r2.zze
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L1fe
        Lab:
            int r1 = r2.zzb
            if (r10 != r1) goto L1fe
            com.google.android.gms.internal.ads.zzalb r1 = zzd(r3)
            android.util.SparseArray r2 = r2.zzg
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L1fe
        Lbc:
            int r1 = r2.zza
            if (r10 != r1) goto Lcd
            com.google.android.gms.internal.ads.zzakz r1 = zzc(r3, r11)
            android.util.SparseArray r2 = r2.zzd
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L1fe
        Lcd:
            int r1 = r2.zzb
            if (r10 != r1) goto L1fe
            com.google.android.gms.internal.ads.zzakz r1 = zzc(r3, r11)
            android.util.SparseArray r2 = r2.zzf
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L1fe
        Lde:
            com.google.android.gms.internal.ads.zzalc r8 = r2.zzi
            int r14 = r2.zza
            if (r10 != r14) goto L1fe
            if (r8 == 0) goto L1fe
            int r16 = r3.zzd(r1)
            r3.zzn(r13)
            boolean r17 = r3.zzp()
            r3.zzn(r4)
            int r18 = r3.zzd(r9)
            int r19 = r3.zzd(r9)
            int r20 = r3.zzd(r4)
            int r21 = r3.zzd(r4)
            r3.zzn(r6)
            int r22 = r3.zzd(r1)
            int r23 = r3.zzd(r1)
            int r24 = r3.zzd(r13)
            int r25 = r3.zzd(r6)
            r3.zzn(r6)
            int r11 = r11 + (-10)
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
        L121:
            if (r11 <= 0) goto L166
            int r10 = r3.zzd(r9)
            int r14 = r3.zzd(r6)
            int r28 = r3.zzd(r6)
            r15 = 12
            int r29 = r3.zzd(r15)
            r3.zzn(r13)
            int r30 = r3.zzd(r15)
            int r11 = r11 + (-6)
            if (r14 == r5) goto L14b
            if (r14 != r6) goto L144
            r14 = 2
            goto L14b
        L144:
            r27 = r14
            r31 = 0
            r32 = 0
            goto L15b
        L14b:
            int r15 = r3.zzd(r1)
            int r26 = r3.zzd(r1)
            int r11 = r11 + (-2)
            r27 = r14
            r31 = r15
            r32 = r26
        L15b:
            com.google.android.gms.internal.ads.zzalf r14 = new com.google.android.gms.internal.ads.zzalf
            r26 = r14
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r4.put(r10, r14)
            goto L121
        L166:
            com.google.android.gms.internal.ads.zzale r1 = new com.google.android.gms.internal.ads.zzale
            r15 = r1
            r26 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r4 = r8.zzb
            if (r4 != 0) goto L199
            android.util.SparseArray r4 = r2.zzc
            int r5 = r1.zza
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.internal.ads.zzale r4 = (com.google.android.gms.internal.ads.zzale) r4
            if (r4 == 0) goto L199
            r7 = 0
        L17f:
            android.util.SparseArray r5 = r4.zzj
            int r6 = r5.size()
            if (r7 >= r6) goto L199
            android.util.SparseArray r6 = r1.zzj
            int r8 = r5.keyAt(r7)
            java.lang.Object r5 = r5.valueAt(r7)
            com.google.android.gms.internal.ads.zzalf r5 = (com.google.android.gms.internal.ads.zzalf) r5
            r6.put(r8, r5)
            int r7 = r7 + 1
            goto L17f
        L199:
            android.util.SparseArray r2 = r2.zzc
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L1fe
        L1a1:
            int r4 = r2.zza
            if (r10 != r4) goto L1fe
            com.google.android.gms.internal.ads.zzalc r4 = r2.zzi
            int r5 = r3.zzd(r1)
            int r7 = r3.zzd(r13)
            int r8 = r3.zzd(r6)
            r3.zzn(r6)
            int r11 = r11 + (-2)
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
        L1bd:
            if (r11 <= 0) goto L1d9
            int r10 = r3.zzd(r1)
            r3.zzn(r1)
            int r13 = r3.zzd(r9)
            int r14 = r3.zzd(r9)
            com.google.android.gms.internal.ads.zzald r15 = new com.google.android.gms.internal.ads.zzald
            r15.<init>(r13, r14)
            r6.put(r10, r15)
            int r11 = r11 + (-6)
            goto L1bd
        L1d9:
            com.google.android.gms.internal.ads.zzalc r1 = new com.google.android.gms.internal.ads.zzalc
            r1.<init>(r5, r7, r8, r6)
            int r5 = r1.zzb
            if (r5 == 0) goto L1f4
            r2.zzi = r1
            android.util.SparseArray r1 = r2.zzc
            r1.clear()
            android.util.SparseArray r1 = r2.zzd
            r1.clear()
            android.util.SparseArray r1 = r2.zze
            r1.clear()
            goto L1fe
        L1f4:
            if (r4 == 0) goto L1fe
            int r5 = r1.zza
            int r4 = r4.zza
            if (r4 == r5) goto L1fe
            r2.zzi = r1
        L1fe:
            int r1 = r3.zzb()
            int r12 = r12 - r1
            r3.zzo(r12)
            goto L10
        L208:
            com.google.android.gms.internal.ads.zzalg r1 = r0.zzi
            com.google.android.gms.internal.ads.zzalc r2 = r1.zzi
            if (r2 != 0) goto L222
            com.google.android.gms.internal.ads.zzakn r1 = new com.google.android.gms.internal.ads.zzakn
            com.google.android.gms.internal.ads.zzgax r9 = com.google.android.gms.internal.ads.zzgax.zzn()
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r10 = r12
            r8.<init>(r9, r10, r12)
        L21e:
            r2 = r38
            goto L3eb
        L222:
            com.google.android.gms.internal.ads.zzala r1 = r1.zzh
            if (r1 != 0) goto L228
            com.google.android.gms.internal.ads.zzala r1 = r0.zzg
        L228:
            android.graphics.Bitmap r3 = r0.zzj
            if (r3 == 0) goto L240
            int r8 = r1.zza
            int r8 = r8 + r5
            int r3 = r3.getWidth()
            if (r8 != r3) goto L240
            int r3 = r1.zzb
            int r3 = r3 + r5
            android.graphics.Bitmap r8 = r0.zzj
            int r8 = r8.getHeight()
            if (r3 == r8) goto L253
        L240:
            int r3 = r1.zza
            int r3 = r3 + r5
            int r8 = r1.zzb
            int r8 = r8 + r5
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r8, r9)
            r0.zzj = r3
            android.graphics.Canvas r8 = r0.zzf
            r8.setBitmap(r3)
        L253:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            android.util.SparseArray r2 = r2.zzc
            r3 = 0
        L25b:
            int r8 = r2.size()
            if (r3 >= r8) goto L3dd
            android.graphics.Canvas r8 = r0.zzf
            r8.save()
            java.lang.Object r8 = r2.valueAt(r3)
            com.google.android.gms.internal.ads.zzald r8 = (com.google.android.gms.internal.ads.zzald) r8
            int r9 = r2.keyAt(r3)
            com.google.android.gms.internal.ads.zzalg r11 = r0.zzi
            android.util.SparseArray r11 = r11.zzc
            java.lang.Object r9 = r11.get(r9)
            com.google.android.gms.internal.ads.zzale r9 = (com.google.android.gms.internal.ads.zzale) r9
            int r11 = r8.zza
            int r12 = r1.zzc
            int r11 = r11 + r12
            int r8 = r8.zzb
            int r12 = r1.zze
            int r8 = r8 + r12
            int r12 = r9.zzc
            int r12 = r12 + r11
            int r13 = r1.zzd
            int r12 = java.lang.Math.min(r12, r13)
            int r13 = r9.zzd
            int r13 = r13 + r8
            int r14 = r1.zzf
            android.graphics.Canvas r15 = r0.zzf
            int r13 = java.lang.Math.min(r13, r14)
            r15.clipRect(r11, r8, r12, r13)
            com.google.android.gms.internal.ads.zzalg r12 = r0.zzi
            int r13 = r9.zzf
            android.util.SparseArray r12 = r12.zzd
            java.lang.Object r12 = r12.get(r13)
            com.google.android.gms.internal.ads.zzakz r12 = (com.google.android.gms.internal.ads.zzakz) r12
            if (r12 != 0) goto L2b9
            com.google.android.gms.internal.ads.zzalg r12 = r0.zzi
            int r13 = r9.zzf
            android.util.SparseArray r12 = r12.zzf
            java.lang.Object r12 = r12.get(r13)
            com.google.android.gms.internal.ads.zzakz r12 = (com.google.android.gms.internal.ads.zzakz) r12
            if (r12 != 0) goto L2b9
            com.google.android.gms.internal.ads.zzakz r12 = r0.zzh
        L2b9:
            android.util.SparseArray r13 = r9.zzj
            r14 = 0
        L2bc:
            int r15 = r13.size()
            if (r14 >= r15) goto L33e
            int r15 = r13.keyAt(r14)
            java.lang.Object r16 = r13.valueAt(r14)
            r7 = r16
            com.google.android.gms.internal.ads.zzalf r7 = (com.google.android.gms.internal.ads.zzalf) r7
            com.google.android.gms.internal.ads.zzalg r5 = r0.zzi
            android.util.SparseArray r5 = r5.zze
            java.lang.Object r5 = r5.get(r15)
            com.google.android.gms.internal.ads.zzalb r5 = (com.google.android.gms.internal.ads.zzalb) r5
            if (r5 != 0) goto L2e4
            com.google.android.gms.internal.ads.zzalg r5 = r0.zzi
            android.util.SparseArray r5 = r5.zzg
            java.lang.Object r5 = r5.get(r15)
            com.google.android.gms.internal.ads.zzalb r5 = (com.google.android.gms.internal.ads.zzalb) r5
        L2e4:
            if (r5 == 0) goto L32b
            boolean r15 = r5.zzb
            if (r15 == 0) goto L2ec
            r15 = 0
            goto L2ee
        L2ec:
            android.graphics.Paint r15 = r0.zzd
        L2ee:
            int r6 = r9.zze
            int r4 = r7.zza
            int r4 = r4 + r11
            int r7 = r7.zzb
            int r7 = r7 + r8
            r23 = r2
            android.graphics.Canvas r2 = r0.zzf
            r24 = r13
            r13 = 3
            if (r6 != r13) goto L304
            int[] r13 = r12.zzd
        L301:
            r25 = r3
            goto L30d
        L304:
            r13 = 2
            if (r6 != r13) goto L30a
            int[] r13 = r12.zzc
            goto L301
        L30a:
            int[] r13 = r12.zzb
            goto L301
        L30d:
            byte[] r3 = r5.zzc
            r16 = r3
            r17 = r13
            r18 = r6
            r19 = r4
            r20 = r7
            r21 = r15
            r22 = r2
            zze(r16, r17, r18, r19, r20, r21, r22)
            byte[] r3 = r5.zzd
            r5 = 1
            int r20 = r7 + 1
            r16 = r3
            zze(r16, r17, r18, r19, r20, r21, r22)
            goto L332
        L32b:
            r23 = r2
            r25 = r3
            r24 = r13
            r5 = 1
        L332:
            int r14 = r14 + 1
            r2 = r23
            r13 = r24
            r3 = r25
            r4 = 3
            r6 = 2
            goto L2bc
        L33e:
            r23 = r2
            r25 = r3
            float r2 = (float) r8
            float r3 = (float) r11
            boolean r4 = r9.zzb
            if (r4 == 0) goto L384
            int r4 = r9.zze
            r6 = 3
            if (r4 != r6) goto L355
            int[] r4 = r12.zzd
            int r7 = r9.zzg
            r4 = r4[r7]
            r7 = 2
            goto L365
        L355:
            r7 = 2
            if (r4 != r7) goto L35f
            int[] r4 = r12.zzc
            int r12 = r9.zzh
            r4 = r4[r12]
            goto L365
        L35f:
            int[] r4 = r12.zzb
            int r12 = r9.zzi
            r4 = r4[r12]
        L365:
            android.graphics.Paint r12 = r0.zze
            r12.setColor(r4)
            android.graphics.Canvas r15 = r0.zzf
            int r4 = r9.zzc
            int r4 = r4 + r11
            int r12 = r9.zzd
            int r12 = r12 + r8
            android.graphics.Paint r13 = r0.zze
            float r4 = (float) r4
            float r12 = (float) r12
            r16 = r3
            r17 = r2
            r18 = r4
            r19 = r12
            r20 = r13
            r15.drawRect(r16, r17, r18, r19, r20)
            goto L386
        L384:
            r6 = 3
            r7 = 2
        L386:
            com.google.android.gms.internal.ads.zzcz r4 = new com.google.android.gms.internal.ads.zzcz
            r4.<init>()
            android.graphics.Bitmap r12 = r0.zzj
            int r13 = r9.zzc
            int r14 = r9.zzd
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r12, r11, r8, r13, r14)
            r4.zzc(r8)
            int r8 = r1.zza
            float r8 = (float) r8
            float r3 = r3 / r8
            r4.zzh(r3)
            r3 = 0
            r4.zzi(r3)
            int r8 = r1.zzb
            float r8 = (float) r8
            float r2 = r2 / r8
            r4.zze(r2, r3)
            r4.zzf(r3)
            int r2 = r9.zzc
            float r2 = (float) r2
            int r3 = r1.zza
            float r3 = (float) r3
            float r2 = r2 / r3
            r4.zzk(r2)
            int r2 = r9.zzd
            float r2 = (float) r2
            int r3 = r1.zzb
            float r3 = (float) r3
            float r2 = r2 / r3
            r4.zzd(r2)
            com.google.android.gms.internal.ads.zzdb r2 = r4.zzp()
            r10.add(r2)
            android.graphics.Canvas r2 = r0.zzf
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.CLEAR
            r4 = 0
            r2.drawColor(r4, r3)
            android.graphics.Canvas r2 = r0.zzf
            r2.restore()
            int r3 = r25 + 1
            r2 = r23
            r4 = 3
            r6 = 2
            goto L25b
        L3dd:
            com.google.android.gms.internal.ads.zzakn r1 = new com.google.android.gms.internal.ads.zzakn
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = r1
            r11 = r13
            r9.<init>(r10, r11, r13)
            goto L21e
        L3eb:
            r2.zza(r1)
            return
    }
}
