package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhaa extends com.google.android.gms.internal.ads.zzhac {
    private final java.nio.ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzhaa(java.nio.ByteBuffer r3, boolean r4, com.google.android.gms.internal.ads.zzgzz r5) {
            r2 = this;
            r4 = 0
            r2.<init>(r4)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r2.zzl = r4
            r2.zze = r3
            long r4 = com.google.android.gms.internal.ads.zzhef.zze(r3)
            r2.zzf = r4
            int r0 = r3.limit()
            long r0 = (long) r0
            long r0 = r0 + r4
            r2.zzg = r0
            int r3 = r3.position()
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.zzh = r4
            r2.zzi = r4
            return
    }

    private final int zzC() {
            r4 = this;
            long r0 = r4.zzg
            long r2 = r4.zzh
            long r0 = r0 - r2
            int r1 = (int) r0
            return r1
    }

    private final void zzI() {
            r4 = this;
            long r0 = r4.zzg
            int r2 = r4.zzj
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.zzg = r0
            long r2 = r4.zzi
            long r2 = r0 - r2
            int r3 = (int) r2
            int r2 = r4.zzl
            if (r3 <= r2) goto L19
            int r3 = r3 - r2
            r4.zzj = r3
            long r2 = (long) r3
            long r0 = r0 - r2
            r4.zzg = r0
            return
        L19:
            r0 = 0
            r4.zzj = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzA() throws java.io.IOException {
            r5 = this;
            long r0 = r5.zzh
            long r2 = r5.zzg
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            return r0
        La:
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
            r4 = this;
            long r0 = r4.zzh
            long r2 = r4.zzi
            long r0 = r0 - r2
            int r1 = (int) r0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzd(int r2) throws com.google.android.gms.internal.ads.zzhbt {
            r1 = this;
            if (r2 < 0) goto L19
            int r0 = r1.zzc()
            int r2 = r2 + r0
            int r0 = r1.zzl
            if (r2 > r0) goto L11
            r1.zzl = r2
            r1.zzI()
            return r0
        L11:
            com.google.android.gms.internal.ads.zzhbt r2 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r2.<init>(r0)
            throw r2
        L19:
            com.google.android.gms.internal.ads.zzhbt r2 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r2.<init>(r0)
            throw r2
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
            r7 = this;
            long r0 = r7.zzh
            long r2 = r7.zzg
            long r2 = r2 - r0
            r4 = 4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L39
            long r4 = r4 + r0
            r7.zzh = r4
            byte r2 = com.google.android.gms.internal.ads.zzhef.zza(r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 1
            long r3 = r3 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhef.zza(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 2
            long r4 = r4 + r0
            byte r4 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 3
            long r0 = r0 + r5
            byte r0 = com.google.android.gms.internal.ads.zzhef.zza(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 << 8
            r1 = r1 | r2
            int r2 = r4 << 16
            r1 = r1 | r2
            int r0 = r0 << 24
            r0 = r0 | r1
            return r0
        L39:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    public final int zzi() throws java.io.IOException {
            r10 = this;
            long r0 = r10.zzh
            long r2 = r10.zzg
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L87
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhef.zza(r0)
            if (r0 < 0) goto L17
            r10.zzh = r4
            return r0
        L17:
            long r6 = r10.zzg
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L87
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2e
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L84
        L2e:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3d
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3b:
            r6 = r4
            goto L84
        L3d:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4d
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L84
        L4d:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            if (r1 < 0) goto L87
        L84:
            r10.zzh = r6
            return r0
        L87:
            long r0 = r10.zzr()
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
            r2.zzk = r0
            return r0
        La:
            int r0 = r2.zzi()
            r2.zzk = r0
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
            long r1 = r0.zzh
            long r3 = r0.zzg
            long r3 = r3 - r1
            r5 = 8
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L80
            long r5 = r5 + r1
            r0.zzh = r5
            byte r3 = com.google.android.gms.internal.ads.zzhef.zza(r1)
            long r3 = (long) r3
            r5 = 1
            long r5 = r5 + r1
            byte r5 = com.google.android.gms.internal.ads.zzhef.zza(r5)
            long r5 = (long) r5
            r7 = 2
            long r7 = r7 + r1
            byte r7 = com.google.android.gms.internal.ads.zzhef.zza(r7)
            long r7 = (long) r7
            r9 = 3
            long r9 = r9 + r1
            byte r9 = com.google.android.gms.internal.ads.zzhef.zza(r9)
            long r9 = (long) r9
            r11 = 4
            long r11 = r11 + r1
            byte r11 = com.google.android.gms.internal.ads.zzhef.zza(r11)
            long r11 = (long) r11
            r13 = 5
            long r13 = r13 + r1
            byte r13 = com.google.android.gms.internal.ads.zzhef.zza(r13)
            long r13 = (long) r13
            r15 = 6
            long r15 = r15 + r1
            byte r15 = com.google.android.gms.internal.ads.zzhef.zza(r15)
            r16 = r13
            long r13 = (long) r15
            r18 = 7
            long r1 = r1 + r18
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r1)
            long r1 = (long) r1
            r18 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r18
            long r7 = r7 & r18
            long r3 = r3 & r18
            r15 = 8
            long r5 = r5 << r15
            long r3 = r3 | r5
            long r5 = r9 & r18
            r9 = 16
            long r7 = r7 << r9
            long r3 = r3 | r7
            long r7 = r11 & r18
            r9 = 24
            long r5 = r5 << r9
            long r3 = r3 | r5
            long r5 = r16 & r18
            r9 = 32
            long r7 = r7 << r9
            long r3 = r3 | r7
            long r7 = r13 & r18
            r9 = 40
            long r5 = r5 << r9
            long r3 = r3 | r5
            long r1 = r1 & r18
            r5 = 48
            long r5 = r7 << r5
            long r3 = r3 | r5
            r5 = 56
            long r1 = r1 << r5
            long r1 = r1 | r3
            return r1
        L80:
            com.google.android.gms.internal.ads.zzhbt r1 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r2 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r1.<init>(r2)
            throw r1
    }

    public final long zzq() throws java.io.IOException {
            r11 = this;
            long r0 = r11.zzh
            long r2 = r11.zzg
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto Lcd
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhef.zza(r0)
            if (r0 < 0) goto L18
            r11.zzh = r4
            long r0 = (long) r0
            return r0
        L18:
            long r6 = r11.zzg
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto Lcd
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L31
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
        L2e:
            long r0 = (long) r0
            goto Lca
        L31:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
        L3f:
            r6 = r4
            goto Lca
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L2e
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            long r6 = (long) r1
            long r0 = (long) r0
            r8 = 28
            long r6 = r6 << r8
            long r0 = r0 ^ r6
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L69
            r2 = 266354560(0xfe03f80, double:1.315966377E-315)
        L67:
            long r0 = r0 ^ r2
            goto L3f
        L69:
            long r8 = r4 + r2
            byte r4 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            long r4 = (long) r4
            r10 = 35
            long r4 = r4 << r10
            long r0 = r0 ^ r4
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 >= 0) goto L80
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L7d:
            long r0 = r0 ^ r2
            r6 = r8
            goto Lca
        L80:
            long r4 = r8 + r2
            byte r8 = com.google.android.gms.internal.ads.zzhef.zza(r8)
            long r8 = (long) r8
            r10 = 42
            long r8 = r8 << r10
            long r0 = r0 ^ r8
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L95
            r2 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L67
        L95:
            long r8 = r4 + r2
            byte r4 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            long r4 = (long) r4
            r10 = 49
            long r4 = r4 << r10
            long r0 = r0 ^ r4
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 >= 0) goto Laa
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L7d
        Laa:
            long r4 = r8 + r2
            byte r8 = com.google.android.gms.internal.ads.zzhef.zza(r8)
            long r8 = (long) r8
            r10 = 56
            long r8 = r8 << r10
            long r0 = r0 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r0 = r0 ^ r8
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L3f
            long r2 = r2 + r4
            byte r4 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            long r4 = (long) r4
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto Lcd
            r6 = r2
        Lca:
            r11.zzh = r6
            return r0
        Lcd:
            long r0 = r11.zzr()
            return r0
    }

    final long zzr() throws java.io.IOException {
            r8 = this;
            r0 = 0
            r1 = 0
        L3:
            r3 = 64
            if (r0 >= r3) goto L2d
            long r3 = r8.zzh
            long r5 = r8.zzg
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L25
            r5 = 1
            long r5 = r5 + r3
            r8.zzh = r5
            byte r3 = com.google.android.gms.internal.ads.zzhef.zza(r3)
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r0
            long r1 = r1 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L22
            return r1
        L22:
            int r0 = r0 + 7
            goto L3
        L25:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
        L2d:
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
            r11 = this;
            int r0 = r11.zzi()
            if (r0 <= 0) goto L24
            int r1 = r11.zzC()
            if (r0 <= r1) goto Ld
            goto L24
        Ld:
            byte[] r1 = new byte[r0]
            long r2 = r11.zzh
            long r9 = (long) r0
            r5 = 0
            r4 = r1
            r7 = r9
            com.google.android.gms.internal.ads.zzhef.zzo(r2, r4, r5, r7)
            long r2 = r11.zzh
            long r2 = r2 + r9
            r11.zzh = r2
            com.google.android.gms.internal.ads.zzgzq r0 = new com.google.android.gms.internal.ads.zzgzq
            r0.<init>(r1)
            return r0
        L24:
            if (r0 != 0) goto L29
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            return r0
        L29:
            if (r0 >= 0) goto L33
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L33:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final java.lang.String zzw() throws java.io.IOException {
            r11 = this;
            int r0 = r11.zzi()
            if (r0 <= 0) goto L26
            int r1 = r11.zzC()
            if (r0 <= r1) goto Ld
            goto L26
        Ld:
            byte[] r1 = new byte[r0]
            long r2 = r11.zzh
            long r9 = (long) r0
            r5 = 0
            r4 = r1
            r7 = r9
            com.google.android.gms.internal.ads.zzhef.zzo(r2, r4, r5, r7)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzhbr.zza
            r0.<init>(r1, r2)
            long r1 = r11.zzh
            long r1 = r1 + r9
            r11.zzh = r1
            return r0
        L26:
            if (r0 != 0) goto L2b
            java.lang.String r0 = ""
            return r0
        L2b:
            if (r0 >= 0) goto L35
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L35:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final java.lang.String zzx() throws java.io.IOException {
            r6 = this;
            int r0 = r6.zzi()
            if (r0 <= 0) goto L20
            int r1 = r6.zzC()
            if (r0 <= r1) goto Ld
            goto L20
        Ld:
            long r1 = r6.zzh
            long r3 = r6.zzf
            long r1 = r1 - r3
            java.nio.ByteBuffer r3 = r6.zze
            int r2 = (int) r1
            java.lang.String r1 = com.google.android.gms.internal.ads.zzhek.zzg(r3, r2, r0)
            long r2 = r6.zzh
            long r4 = (long) r0
            long r2 = r2 + r4
            r6.zzh = r2
            return r1
        L20:
            if (r0 != 0) goto L25
            java.lang.String r0 = ""
            return r0
        L25:
            if (r0 > 0) goto L2f
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L2f:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzy(int r2) throws com.google.android.gms.internal.ads.zzhbt {
            r1 = this;
            int r0 = r1.zzk
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
            r0.zzl = r1
            r0.zzI()
            return
    }
}
