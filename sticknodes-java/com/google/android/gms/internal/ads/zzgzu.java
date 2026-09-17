package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzgzu extends com.google.android.gms.internal.ads.zzhac {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    /* synthetic */ zzgzu(byte[] r1, int r2, int r3, boolean r4, com.google.android.gms.internal.ads.zzgzt r5) {
            r0 = this;
            r4 = 0
            r0.<init>(r4)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0.zzk = r4
            r0.zze = r1
            int r3 = r3 + r2
            r0.zzf = r3
            r0.zzh = r2
            r0.zzi = r2
            return
    }

    private final void zzC() {
            r3 = this;
            int r0 = r3.zzf
            int r1 = r3.zzg
            int r0 = r0 + r1
            r3.zzf = r0
            int r1 = r3.zzi
            int r1 = r0 - r1
            int r2 = r3.zzk
            if (r1 <= r2) goto L16
            int r1 = r1 - r2
            r3.zzg = r1
            int r0 = r0 - r1
            r3.zzf = r0
            return
        L16:
            r0 = 0
            r3.zzg = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzA() throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzh
            int r1 = r2.zzf
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzB() throws java.io.IOException {
            r5 = this;
            long r0 = r5.zzq()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final double zza() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzp()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final float zzb() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzh()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzc() {
            r2 = this;
            int r0 = r2.zzh
            int r1 = r2.zzi
            int r0 = r0 - r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzd(int r3) throws com.google.android.gms.internal.ads.zzhbt {
            r2 = this;
            if (r3 < 0) goto L24
            int r0 = r2.zzh
            int r1 = r2.zzi
            int r0 = r0 - r1
            int r3 = r3 + r0
            if (r3 < 0) goto L1c
            int r0 = r2.zzk
            if (r3 > r0) goto L14
            r2.zzk = r3
            r2.zzC()
            return r0
        L14:
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r3.<init>(r0)
            throw r3
        L1c:
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "Failed to parse the message."
            r3.<init>(r0)
            throw r3
        L24:
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zze() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzf() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzh()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzg() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            return r0
    }

    public final int zzh() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            int r1 = r1 - r0
            r2 = 4
            if (r1 < r2) goto L2e
            byte[] r1 = r5.zze
            int r2 = r0 + 4
            r5.zzh = r2
            r2 = r1[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 + 1
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 + 2
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r0 = r0 + 3
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 << 8
            r1 = r1 | r2
            int r2 = r4 << 16
            r1 = r1 | r2
            int r0 = r0 << 24
            r0 = r0 | r1
            return r0
        L2e:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    public final int zzi() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzh = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.zzh = r1
            return r0
        L6d:
            long r0 = r5.zzr()
            int r1 = (int) r0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzj() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzh()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzk() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            int r0 = com.google.android.gms.internal.ads.zzhac.zzD(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzl() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.zzA()
            if (r0 == 0) goto La
            r0 = 0
            r2.zzj = r0
            return r0
        La:
            int r0 = r2.zzi()
            r2.zzj = r0
            int r1 = r0 >>> 3
            if (r1 == 0) goto L15
            return r0
        L15:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzm() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzn() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzp()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzo() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzq()
            return r0
    }

    public final long zzp() throws java.io.IOException {
            r20 = this;
            r0 = r20
            int r1 = r0.zzh
            int r2 = r0.zzf
            int r2 = r2 - r1
            r3 = 8
            if (r2 < r3) goto L68
            byte[] r2 = r0.zze
            int r4 = r1 + 8
            r0.zzh = r4
            r4 = r2[r1]
            long r4 = (long) r4
            int r6 = r1 + 1
            r6 = r2[r6]
            long r6 = (long) r6
            r8 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r8
            long r4 = r4 & r8
            long r6 = r6 << r3
            int r3 = r1 + 2
            r3 = r2[r3]
            long r10 = (long) r3
            int r3 = r1 + 3
            r3 = r2[r3]
            long r12 = (long) r3
            int r3 = r1 + 4
            r3 = r2[r3]
            long r14 = (long) r3
            int r3 = r1 + 5
            r3 = r2[r3]
            long r8 = (long) r3
            int r3 = r1 + 6
            r3 = r2[r3]
            r18 = r8
            long r8 = (long) r3
            int r1 = r1 + 7
            r1 = r2[r1]
            long r1 = (long) r1
            r16 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r16
            long r3 = r4 | r6
            long r5 = r12 & r16
            r7 = 16
            long r10 = r10 << r7
            long r3 = r3 | r10
            long r10 = r14 & r16
            r7 = 24
            long r5 = r5 << r7
            long r3 = r3 | r5
            long r5 = r18 & r16
            r7 = 32
            long r10 = r10 << r7
            long r3 = r3 | r10
            long r7 = r8 & r16
            r9 = 40
            long r5 = r5 << r9
            long r3 = r3 | r5
            long r1 = r1 & r16
            r5 = 48
            long r5 = r7 << r5
            long r3 = r3 | r5
            r5 = 56
            long r1 = r1 << r5
            long r1 = r1 | r3
            return r1
        L68:
            com.google.android.gms.internal.ads.zzhbt r1 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r2 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r1.<init>(r2)
            throw r1
    }

    public final long zzq() throws java.io.IOException {
            r11 = this;
            int r0 = r11.zzh
            int r1 = r11.zzf
            if (r1 != r0) goto L8
            goto Lb7
        L8:
            byte[] r2 = r11.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L14
            r11.zzh = r3
            long r0 = (long) r0
            return r0
        L14:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto Lb7
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L27
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
        L24:
            long r2 = (long) r0
            goto Lb4
        L27:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L38
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
        L33:
            r9 = r0
            r1 = r3
            r2 = r9
            goto Lb4
        L38:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L46
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L24
        L46:
            int r3 = r1 + 1
            r1 = r2[r1]
            long r4 = (long) r1
            long r0 = (long) r0
            r6 = 28
            long r4 = r4 << r6
            long r0 = r0 ^ r4
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L5b
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
        L59:
            long r0 = r0 ^ r4
            goto L33
        L5b:
            int r6 = r3 + 1
            r3 = r2[r3]
            long r7 = (long) r3
            r3 = 35
            long r7 = r7 << r3
            long r0 = r0 ^ r7
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L70
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L6d:
            long r2 = r2 ^ r0
        L6e:
            r1 = r6
            goto Lb4
        L70:
            int r3 = r6 + 1
            r6 = r2[r6]
            long r6 = (long) r6
            r8 = 42
            long r6 = r6 << r8
            long r0 = r0 ^ r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L83
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L59
        L83:
            int r6 = r3 + 1
            r3 = r2[r3]
            long r7 = (long) r3
            r3 = 49
            long r7 = r7 << r3
            long r0 = r0 ^ r7
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L96
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L6d
        L96:
            int r3 = r6 + 1
            r6 = r2[r6]
            long r6 = (long) r6
            r8 = 56
            long r6 = r6 << r8
            long r0 = r0 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r0 = r0 ^ r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L33
            int r6 = r3 + 1
            r2 = r2[r3]
            long r2 = (long) r2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto Lb7
            r2 = r0
            goto L6e
        Lb4:
            r11.zzh = r1
            return r2
        Lb7:
            long r0 = r11.zzr()
            return r0
    }

    final long zzr() throws java.io.IOException {
            r6 = this;
            r0 = 0
            r1 = 0
        L3:
            r3 = 64
            if (r0 >= r3) goto L2a
            int r3 = r6.zzh
            int r4 = r6.zzf
            if (r3 == r4) goto L22
            byte[] r4 = r6.zze
            int r5 = r3 + 1
            r6.zzh = r5
            r3 = r4[r3]
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r0
            long r1 = r1 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + 7
            goto L3
        L22:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
        L2a:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzs() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzp()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzt() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzq()
            long r0 = com.google.android.gms.internal.ads.zzhac.zzF(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzu() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzq()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final com.google.android.gms.internal.ads.zzgzs zzv() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzi()
            if (r0 <= 0) goto L1a
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 <= r1) goto Le
            goto L1a
        Le:
            byte[] r1 = r3.zze
            com.google.android.gms.internal.ads.zzgzs r1 = com.google.android.gms.internal.ads.zzgzs.zzv(r1, r2, r0)
            int r2 = r3.zzh
            int r2 = r2 + r0
            r3.zzh = r2
            return r1
        L1a:
            if (r0 == 0) goto L47
            if (r0 <= 0) goto L35
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 <= r1) goto L26
            goto L35
        L26:
            int r0 = r0 + r2
            r3.zzh = r0
            byte[] r1 = r3.zze
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            com.google.android.gms.internal.ads.zzgzq r1 = new com.google.android.gms.internal.ads.zzgzq
            r1.<init>(r0)
            return r1
        L35:
            if (r0 > 0) goto L3f
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L3f:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
        L47:
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final java.lang.String zzw() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzi()
            if (r0 <= 0) goto L1d
            int r1 = r5.zzf
            int r2 = r5.zzh
            int r1 = r1 - r2
            if (r0 <= r1) goto Le
            goto L1d
        Le:
            byte[] r1 = r5.zze
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.android.gms.internal.ads.zzhbr.zza
            r3.<init>(r1, r2, r0, r4)
            int r1 = r5.zzh
            int r1 = r1 + r0
            r5.zzh = r1
            return r3
        L1d:
            if (r0 != 0) goto L22
            java.lang.String r0 = ""
            return r0
        L22:
            if (r0 >= 0) goto L2c
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L2c:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final java.lang.String zzx() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzi()
            if (r0 <= 0) goto L1a
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 <= r1) goto Le
            goto L1a
        Le:
            byte[] r1 = r3.zze
            java.lang.String r1 = com.google.android.gms.internal.ads.zzhek.zzh(r1, r2, r0)
            int r2 = r3.zzh
            int r2 = r2 + r0
            r3.zzh = r2
            return r1
        L1a:
            if (r0 != 0) goto L1f
            java.lang.String r0 = ""
            return r0
        L1f:
            if (r0 > 0) goto L29
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L29:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzy(int r2) throws com.google.android.gms.internal.ads.zzhbt {
            r1 = this;
            int r0 = r1.zzj
            if (r0 != r2) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzhbt r2 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "Protocol message end-group tag did not match expected tag."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzz(int r1) {
            r0 = this;
            r0.zzk = r1
            r0.zzC()
            return
    }
}
