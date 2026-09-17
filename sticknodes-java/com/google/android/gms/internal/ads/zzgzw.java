package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzgzw extends com.google.android.gms.internal.ads.zzhac {
    private final java.lang.Iterable zze;
    private final java.util.Iterator zzf;
    private java.nio.ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* synthetic */ zzgzw(java.lang.Iterable r1, int r2, boolean r3, com.google.android.gms.internal.ads.zzgzv r4) {
            r0 = this;
            r3 = 0
            r0.<init>(r3)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.zzj = r3
            r0.zzh = r2
            r0.zze = r1
            java.util.Iterator r1 = r1.iterator()
            r0.zzf = r1
            r1 = 0
            r0.zzl = r1
            if (r2 != 0) goto L25
            java.nio.ByteBuffer r1 = com.google.android.gms.internal.ads.zzhbr.zzc
            r0.zzg = r1
            r1 = 0
            r0.zzm = r1
            r0.zzn = r1
            r0.zzo = r1
            return
        L25:
            r0.zzM()
            return
    }

    private final int zzI() {
            r4 = this;
            int r0 = r4.zzh
            int r1 = r4.zzl
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r4.zzm
            long r0 = r0 - r2
            long r2 = r4.zzn
            long r0 = r0 + r2
            int r1 = (int) r0
            return r1
    }

    private final void zzJ() throws com.google.android.gms.internal.ads.zzhbt {
            r2 = this;
            java.util.Iterator r0 = r2.zzf
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lc
            r2.zzM()
            return
        Lc:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    private final void zzK(byte[] r11, int r12, int r13) throws java.io.IOException {
            r10 = this;
            int r12 = r10.zzI()
            if (r13 > r12) goto L33
            r12 = r13
        L7:
            if (r12 <= 0) goto L35
            long r0 = r10.zzo
            long r2 = r10.zzm
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L17
            r10.zzJ()
        L17:
            long r0 = r10.zzo
            long r2 = r10.zzm
            long r0 = r0 - r2
            int r1 = (int) r0
            int r0 = java.lang.Math.min(r12, r1)
            long r1 = r10.zzm
            int r3 = r13 - r12
            long r8 = (long) r0
            long r4 = (long) r3
            r3 = r11
            r6 = r8
            com.google.android.gms.internal.ads.zzhef.zzo(r1, r3, r4, r6)
            int r12 = r12 - r0
            long r0 = r10.zzm
            long r0 = r0 + r8
            r10.zzm = r0
            goto L7
        L33:
            if (r13 > 0) goto L36
        L35:
            return
        L36:
            com.google.android.gms.internal.ads.zzhbt r11 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r12 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r11.<init>(r12)
            throw r11
    }

    private final void zzL() {
            r2 = this;
            int r0 = r2.zzh
            int r1 = r2.zzi
            int r0 = r0 + r1
            r2.zzh = r0
            int r1 = r2.zzj
            if (r0 <= r1) goto L13
            int r1 = r0 - r1
            r2.zzi = r1
            int r0 = r0 - r1
            r2.zzh = r0
            return
        L13:
            r0 = 0
            r2.zzi = r0
            return
    }

    private final void zzM() {
            r6 = this;
            java.util.Iterator r0 = r6.zzf
            java.lang.Object r0 = r0.next()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r6.zzg = r0
            int r1 = r6.zzl
            long r2 = r6.zzm
            long r4 = r6.zzn
            long r2 = r2 - r4
            int r3 = (int) r2
            int r1 = r1 + r3
            r6.zzl = r1
            int r0 = r0.position()
            long r0 = (long) r0
            r6.zzm = r0
            r6.zzn = r0
            java.nio.ByteBuffer r0 = r6.zzg
            int r0 = r0.limit()
            long r0 = (long) r0
            r6.zzo = r0
            java.nio.ByteBuffer r0 = r6.zzg
            long r0 = com.google.android.gms.internal.ads.zzhef.zze(r0)
            long r2 = r6.zzm
            long r2 = r2 + r0
            r6.zzm = r2
            long r2 = r6.zzn
            long r2 = r2 + r0
            r6.zzn = r2
            long r2 = r6.zzo
            long r2 = r2 + r0
            r6.zzo = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzA() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzl
            long r0 = (long) r0
            long r2 = r5.zzm
            long r0 = r0 + r2
            long r2 = r5.zzn
            long r0 = r0 - r2
            int r2 = r5.zzh
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzB() throws java.io.IOException {
            r5 = this;
            long r0 = r5.zzr()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    final long zzC() throws java.io.IOException {
            r6 = this;
            r0 = 0
            r1 = 0
        L3:
            r3 = 64
            if (r0 >= r3) goto L18
            byte r3 = r6.zzh()
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r0
            long r1 = r1 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L15
            return r1
        L15:
            int r0 = r0 + 7
            goto L3
        L18:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final double zza() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzq()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final float zzb() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzc() {
            r4 = this;
            int r0 = r4.zzl
            long r0 = (long) r0
            long r2 = r4.zzm
            long r0 = r0 + r2
            long r2 = r4.zzn
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
            int r0 = r1.zzj
            if (r2 > r0) goto L11
            r1.zzj = r2
            r1.zzL()
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
            int r0 = r1.zzp()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzf() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzg() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzp()
            return r0
    }

    public final byte zzh() throws java.io.IOException {
            r5 = this;
            long r0 = r5.zzo
            long r2 = r5.zzm
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r5.zzJ()
        Le:
            long r0 = r5.zzm
            r2 = 1
            long r2 = r2 + r0
            r5.zzm = r2
            byte r0 = com.google.android.gms.internal.ads.zzhef.zza(r0)
            return r0
    }

    public final int zzi() throws java.io.IOException {
            r7 = this;
            long r0 = r7.zzo
            long r2 = r7.zzm
            long r0 = r0 - r2
            r4 = 4
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L39
            long r4 = r4 + r2
            r7.zzm = r4
            byte r0 = com.google.android.gms.internal.ads.zzhef.zza(r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 1
            long r4 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r4 = 2
            long r4 = r4 + r2
            byte r4 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r5 = 3
            long r2 = r2 + r5
            byte r2 = com.google.android.gms.internal.ads.zzhef.zza(r2)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r0 = r0 | r1
            r0 = r0 | r4
            r0 = r0 | r2
            return r0
        L39:
            byte r0 = r7.zzh()
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = r7.zzh()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            byte r2 = r7.zzh()
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            byte r3 = r7.zzh()
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            r0 = r0 | r1
            r0 = r0 | r2
            r0 = r0 | r3
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzj() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzk() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzp()
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
            int r0 = r2.zzp()
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
            int r0 = r1.zzp()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzn() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzq()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzo() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzr()
            return r0
    }

    public final int zzp() throws java.io.IOException {
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhef.zza(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzC()
            int r1 = (int) r0
            return r1
    }

    public final long zzq() throws java.io.IOException {
            r24 = this;
            r0 = r24
            long r1 = r0.zzo
            long r3 = r0.zzm
            long r1 = r1 - r3
            r9 = 24
            r10 = 16
            r11 = 8
            r12 = 8
            r14 = 255(0xff, double:1.26E-321)
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 < 0) goto L81
            long r12 = r12 + r3
            r0.zzm = r12
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r3)
            long r1 = (long) r1
            long r1 = r1 & r14
            r12 = 1
            long r12 = r12 + r3
            byte r12 = com.google.android.gms.internal.ads.zzhef.zza(r12)
            long r12 = (long) r12
            long r12 = r12 & r14
            long r11 = r12 << r11
            r16 = 2
            long r16 = r3 + r16
            byte r13 = com.google.android.gms.internal.ads.zzhef.zza(r16)
            long r5 = (long) r13
            long r5 = r5 & r14
            long r5 = r5 << r10
            r18 = 3
            long r18 = r3 + r18
            byte r10 = com.google.android.gms.internal.ads.zzhef.zza(r18)
            long r7 = (long) r10
            long r7 = r7 & r14
            long r7 = r7 << r9
            r9 = 4
            long r9 = r9 + r3
            byte r9 = com.google.android.gms.internal.ads.zzhef.zza(r9)
            long r9 = (long) r9
            long r9 = r9 & r14
            r18 = 32
            long r9 = r9 << r18
            r18 = 5
            long r18 = r3 + r18
            byte r13 = com.google.android.gms.internal.ads.zzhef.zza(r18)
            r18 = r9
            long r9 = (long) r13
            long r9 = r9 & r14
            r13 = 40
            long r9 = r9 << r13
            r20 = 6
            long r20 = r3 + r20
            byte r13 = com.google.android.gms.internal.ads.zzhef.zza(r20)
            r20 = r9
            long r9 = (long) r13
            long r9 = r9 & r14
            r13 = 48
            long r9 = r9 << r13
            r22 = 7
            long r3 = r3 + r22
            byte r3 = com.google.android.gms.internal.ads.zzhef.zza(r3)
            long r3 = (long) r3
            long r3 = r3 & r14
            r13 = 56
            long r3 = r3 << r13
            long r1 = r1 | r11
            long r1 = r1 | r5
            long r1 = r1 | r7
            long r1 = r1 | r18
            long r1 = r1 | r20
            long r1 = r1 | r9
            long r1 = r1 | r3
            return r1
        L81:
            byte r1 = r24.zzh()
            long r1 = (long) r1
            long r1 = r1 & r14
            byte r3 = r24.zzh()
            long r3 = (long) r3
            long r3 = r3 & r14
            long r3 = r3 << r11
            byte r5 = r24.zzh()
            long r5 = (long) r5
            long r5 = r5 & r14
            long r5 = r5 << r10
            byte r7 = r24.zzh()
            long r7 = (long) r7
            long r7 = r7 & r14
            long r7 = r7 << r9
            byte r9 = r24.zzh()
            long r9 = (long) r9
            long r9 = r9 & r14
            r11 = 32
            long r9 = r9 << r11
            byte r11 = r24.zzh()
            long r11 = (long) r11
            long r11 = r11 & r14
            r13 = 40
            long r11 = r11 << r13
            byte r13 = r24.zzh()
            r18 = r11
            long r11 = (long) r13
            long r11 = r11 & r14
            r13 = 48
            long r11 = r11 << r13
            byte r13 = r24.zzh()
            r20 = r11
            long r11 = (long) r13
            long r11 = r11 & r14
            r13 = 56
            long r11 = r11 << r13
            long r1 = r1 | r3
            long r1 = r1 | r5
            long r1 = r1 | r7
            long r1 = r1 | r9
            long r1 = r1 | r18
            long r1 = r1 | r20
            long r1 = r1 | r11
            return r1
    }

    public final long zzr() throws java.io.IOException {
            r11 = this;
            long r0 = r11.zzm
            long r2 = r11.zzo
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto Ld2
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhef.zza(r0)
            if (r0 < 0) goto L1b
            long r4 = r11.zzm
            long r4 = r4 + r2
            r11.zzm = r4
            long r0 = (long) r0
            return r0
        L1b:
            long r6 = r11.zzo
            long r8 = r11.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto Ld2
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L36
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
        L33:
            long r0 = (long) r0
            goto Lcf
        L36:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L47
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
        L44:
            r6 = r4
            goto Lcf
        L47:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L57
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L33
        L57:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhef.zza(r6)
            long r6 = (long) r1
            long r0 = (long) r0
            r8 = 28
            long r6 = r6 << r8
            long r0 = r0 ^ r6
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L6e
            r2 = 266354560(0xfe03f80, double:1.315966377E-315)
        L6c:
            long r0 = r0 ^ r2
            goto L44
        L6e:
            long r8 = r4 + r2
            byte r4 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            long r4 = (long) r4
            r10 = 35
            long r4 = r4 << r10
            long r0 = r0 ^ r4
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 >= 0) goto L85
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L82:
            long r0 = r0 ^ r2
            r6 = r8
            goto Lcf
        L85:
            long r4 = r8 + r2
            byte r8 = com.google.android.gms.internal.ads.zzhef.zza(r8)
            long r8 = (long) r8
            r10 = 42
            long r8 = r8 << r10
            long r0 = r0 ^ r8
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L9a
            r2 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L6c
        L9a:
            long r8 = r4 + r2
            byte r4 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            long r4 = (long) r4
            r10 = 49
            long r4 = r4 << r10
            long r0 = r0 ^ r4
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 >= 0) goto Laf
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L82
        Laf:
            long r4 = r8 + r2
            byte r8 = com.google.android.gms.internal.ads.zzhef.zza(r8)
            long r8 = (long) r8
            r10 = 56
            long r8 = r8 << r10
            long r0 = r0 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r0 = r0 ^ r8
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L44
            long r2 = r2 + r4
            byte r4 = com.google.android.gms.internal.ads.zzhef.zza(r4)
            long r4 = (long) r4
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto Ld2
            r6 = r2
        Lcf:
            r11.zzm = r6
            return r0
        Ld2:
            long r0 = r11.zzC()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzs() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzq()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzt() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzr()
            long r0 = com.google.android.gms.internal.ads.zzhac.zzF(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzu() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzr()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final com.google.android.gms.internal.ads.zzgzs zzv() throws java.io.IOException {
            r12 = this;
            int r0 = r12.zzp()
            if (r0 <= 0) goto L25
            long r1 = r12.zzo
            long r3 = r12.zzm
            long r1 = r1 - r3
            long r10 = (long) r0
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 <= 0) goto L11
            goto L25
        L11:
            byte[] r0 = new byte[r0]
            r6 = 0
            r5 = r0
            r8 = r10
            com.google.android.gms.internal.ads.zzhef.zzo(r3, r5, r6, r8)
            long r1 = r12.zzm
            long r1 = r1 + r10
            r12.zzm = r1
            com.google.android.gms.internal.ads.zzgzq r1 = new com.google.android.gms.internal.ads.zzgzq
            r1.<init>(r0)
            return r1
        L25:
            if (r0 <= 0) goto L3a
            int r1 = r12.zzI()
            if (r0 <= r1) goto L2e
            goto L3a
        L2e:
            byte[] r1 = new byte[r0]
            r2 = 0
            r12.zzK(r1, r2, r0)
            com.google.android.gms.internal.ads.zzgzq r0 = new com.google.android.gms.internal.ads.zzgzq
            r0.<init>(r1)
            return r0
        L3a:
            if (r0 != 0) goto L3f
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            return r0
        L3f:
            if (r0 >= 0) goto L49
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L49:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final java.lang.String zzw() throws java.io.IOException {
            r12 = this;
            int r0 = r12.zzp()
            if (r0 <= 0) goto L27
            long r1 = r12.zzo
            long r3 = r12.zzm
            long r1 = r1 - r3
            long r10 = (long) r0
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 <= 0) goto L11
            goto L27
        L11:
            byte[] r0 = new byte[r0]
            r6 = 0
            r5 = r0
            r8 = r10
            com.google.android.gms.internal.ads.zzhef.zzo(r3, r5, r6, r8)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzhbr.zza
            r1.<init>(r0, r2)
            long r2 = r12.zzm
            long r2 = r2 + r10
            r12.zzm = r2
            return r1
        L27:
            if (r0 <= 0) goto L3e
            int r1 = r12.zzI()
            if (r0 <= r1) goto L30
            goto L3e
        L30:
            byte[] r1 = new byte[r0]
            r2 = 0
            r12.zzK(r1, r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzhbr.zza
            r0.<init>(r1, r2)
            return r0
        L3e:
            if (r0 != 0) goto L43
            java.lang.String r0 = ""
            return r0
        L43:
            if (r0 >= 0) goto L4d
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L4d:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final java.lang.String zzx() throws java.io.IOException {
            r8 = this;
            int r0 = r8.zzp()
            if (r0 <= 0) goto L21
            long r1 = r8.zzo
            long r3 = r8.zzm
            long r1 = r1 - r3
            long r5 = (long) r0
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L11
            goto L21
        L11:
            long r1 = r8.zzn
            long r3 = r3 - r1
            java.nio.ByteBuffer r1 = r8.zzg
            int r2 = (int) r3
            java.lang.String r0 = com.google.android.gms.internal.ads.zzhek.zzg(r1, r2, r0)
            long r1 = r8.zzm
            long r1 = r1 + r5
            r8.zzm = r1
            return r0
        L21:
            if (r0 < 0) goto L35
            int r1 = r8.zzI()
            if (r0 <= r1) goto L2a
            goto L35
        L2a:
            byte[] r1 = new byte[r0]
            r2 = 0
            r8.zzK(r1, r2, r0)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzhek.zzh(r1, r2, r0)
            return r0
        L35:
            if (r0 != 0) goto L3a
            java.lang.String r0 = ""
            return r0
        L3a:
            if (r0 > 0) goto L44
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L44:
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
            r0.zzj = r1
            r0.zzL()
            return
    }
}
