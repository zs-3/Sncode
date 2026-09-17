package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzgzy extends com.google.android.gms.internal.ads.zzhac {
    private final java.io.InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzgzy(java.io.InputStream r1, int r2, com.google.android.gms.internal.ads.zzgzx r3) {
            r0 = this;
            r2 = 0
            r0.<init>(r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzl = r2
            byte[] r2 = com.google.android.gms.internal.ads.zzhbr.zzb
            r0.zze = r1
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
            r0.zzf = r1
            r1 = 0
            r0.zzg = r1
            r0.zzi = r1
            r0.zzk = r1
            return
    }

    private final java.util.List zzI(int r7) throws java.io.IOException {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r7 <= 0) goto L31
            r1 = 4096(0x1000, float:5.74E-42)
            int r1 = java.lang.Math.min(r7, r1)
            byte[] r2 = new byte[r1]
            r3 = 0
        L10:
            if (r3 >= r1) goto L2c
            java.io.InputStream r4 = r6.zze
            int r5 = r1 - r3
            int r4 = r4.read(r2, r3, r5)
            r5 = -1
            if (r4 == r5) goto L24
            int r5 = r6.zzk
            int r5 = r5 + r4
            r6.zzk = r5
            int r3 = r3 + r4
            goto L10
        L24:
            com.google.android.gms.internal.ads.zzhbt r7 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r7.<init>(r0)
            throw r7
        L2c:
            int r7 = r7 - r1
            r0.add(r2)
            goto L5
        L31:
            return r0
    }

    private final void zzJ() {
            r3 = this;
            int r0 = r3.zzg
            int r1 = r3.zzh
            int r0 = r0 + r1
            r3.zzg = r0
            int r1 = r3.zzk
            int r1 = r1 + r0
            int r2 = r3.zzl
            if (r1 <= r2) goto L15
            int r1 = r1 - r2
            r3.zzh = r1
            int r0 = r0 - r1
            r3.zzg = r0
            return
        L15:
            r0 = 0
            r3.zzh = r0
            return
    }

    private final void zzK(int r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.zzL(r3)
            if (r0 != 0) goto L21
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2.zzk
            int r0 = r0 - r1
            int r1 = r2.zzi
            int r0 = r0 - r1
            if (r3 <= r0) goto L19
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."
            r3.<init>(r0)
            throw r3
        L19:
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r3.<init>(r0)
            throw r3
        L21:
            return
    }

    private final boolean zzL(int r8) throws java.io.IOException {
            r7 = this;
            int r0 = r7.zzi
            int r1 = r0 + r8
            int r2 = r7.zzg
            if (r1 <= r2) goto L8f
            int r1 = r7.zzk
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r3 - r1
            int r4 = r4 - r0
            r5 = 0
            if (r8 <= r4) goto L14
            return r5
        L14:
            int r4 = r1 + r0
            int r6 = r7.zzl
            int r4 = r4 + r8
            if (r4 <= r6) goto L1c
            return r5
        L1c:
            if (r0 <= 0) goto L32
            if (r2 <= r0) goto L26
            byte[] r1 = r7.zzf
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r5, r2)
        L26:
            int r1 = r7.zzk
            int r1 = r1 + r0
            r7.zzk = r1
            int r2 = r7.zzg
            int r2 = r2 - r0
            r7.zzg = r2
            r7.zzi = r5
        L32:
            java.io.InputStream r0 = r7.zze
            byte[] r4 = r7.zzf
            int r3 = r3 - r1
            int r1 = 4096 - r2
            int r3 = r3 - r2
            int r1 = java.lang.Math.min(r1, r3)
            int r0 = r0.read(r4, r2, r1)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L8a
            if (r0 == 0) goto L61
            r1 = -1
            if (r0 < r1) goto L61
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 > r1) goto L61
            if (r0 <= 0) goto L60
            int r1 = r7.zzg
            int r1 = r1 + r0
            r7.zzg = r1
            r7.zzJ()
            int r0 = r7.zzg
            if (r0 < r8) goto L5b
            r8 = 1
            return r8
        L5b:
            boolean r8 = r7.zzL(r8)
            return r8
        L60:
            return r5
        L61:
            java.io.InputStream r8 = r7.zze
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r8 = "#read(byte[]) returned invalid result: "
            r2.append(r8)
            r2.append(r0)
            java.lang.String r8 = "\nThe InputStream implementation is buggy."
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8)
            throw r1
        L8a:
            r8 = move-exception
            r8.zza()
            throw r8
        L8f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refillBuffer() called when "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = " bytes were already available in buffer"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    private final byte[] zzM(int r5, boolean r6) throws java.io.IOException {
            r4 = this;
            byte[] r6 = r4.zzN(r5)
            if (r6 == 0) goto L7
            return r6
        L7:
            int r6 = r4.zzi
            int r0 = r4.zzg
            int r1 = r0 - r6
            int r2 = r4.zzk
            int r2 = r2 + r0
            r4.zzk = r2
            r0 = 0
            r4.zzi = r0
            r4.zzg = r0
            int r2 = r5 - r1
            java.util.List r2 = r4.zzI(r2)
            byte[] r5 = new byte[r5]
            byte[] r3 = r4.zzf
            java.lang.System.arraycopy(r3, r6, r5, r0, r1)
            java.util.Iterator r6 = r2.iterator()
        L28:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r6.next()
            byte[] r2 = (byte[]) r2
            int r3 = r2.length
            java.lang.System.arraycopy(r2, r0, r5, r1, r3)
            int r1 = r1 + r3
            goto L28
        L3a:
            return r5
    }

    private final byte[] zzN(int r7) throws java.io.IOException {
            r6 = this;
            if (r7 != 0) goto L5
            byte[] r7 = com.google.android.gms.internal.ads.zzhbr.zzb
            return r7
        L5:
            int r0 = r6.zzk
            int r1 = r6.zzi
            int r2 = r0 + r1
            int r2 = r2 + r7
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            int r3 = r3 + r2
            if (r3 > 0) goto L71
            int r3 = r6.zzl
            java.lang.String r4 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            if (r2 > r3) goto L66
            int r0 = r6.zzg
            int r0 = r0 - r1
            int r1 = r7 - r0
            r2 = 4096(0x1000, float:5.74E-42)
            if (r1 < r2) goto L31
            java.io.InputStream r2 = r6.zze
            int r2 = r2.available()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L2c
            if (r1 > r2) goto L2a
            goto L31
        L2a:
            r7 = 0
            return r7
        L2c:
            r7 = move-exception
            r7.zza()
            throw r7
        L31:
            byte[] r1 = new byte[r7]
            byte[] r2 = r6.zzf
            int r3 = r6.zzi
            r5 = 0
            java.lang.System.arraycopy(r2, r3, r1, r5, r0)
            int r2 = r6.zzk
            int r3 = r6.zzg
            int r2 = r2 + r3
            r6.zzk = r2
            r6.zzi = r5
            r6.zzg = r5
        L46:
            if (r0 >= r7) goto L65
            java.io.InputStream r2 = r6.zze
            int r3 = r7 - r0
            int r2 = r2.read(r1, r0, r3)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L60
            r3 = -1
            if (r2 == r3) goto L5a
            int r3 = r6.zzk
            int r3 = r3 + r2
            r6.zzk = r3
            int r0 = r0 + r2
            goto L46
        L5a:
            com.google.android.gms.internal.ads.zzhbt r7 = new com.google.android.gms.internal.ads.zzhbt
            r7.<init>(r4)
            throw r7
        L60:
            r7 = move-exception
            r7.zza()
            throw r7
        L65:
            return r1
        L66:
            int r3 = r3 - r0
            int r3 = r3 - r1
            r6.zzC(r3)
            com.google.android.gms.internal.ads.zzhbt r7 = new com.google.android.gms.internal.ads.zzhbt
            r7.<init>(r4)
            throw r7
        L71:
            com.google.android.gms.internal.ads.zzhbt r7 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."
            r7.<init>(r0)
            throw r7
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzA() throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzi
            int r1 = r2.zzg
            if (r0 != r1) goto Le
            r0 = 1
            boolean r1 = r2.zzL(r0)
            if (r1 != 0) goto Le
            return r0
        Le:
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

    public final void zzC(int r9) throws java.io.IOException {
            r8 = this;
            int r0 = r8.zzg
            int r1 = r8.zzi
            int r0 = r0 - r1
            if (r9 > r0) goto Le
            if (r9 >= 0) goto La
            goto Le
        La:
            int r1 = r1 + r9
            r8.zzi = r1
            return
        Le:
            if (r9 < 0) goto La7
            int r2 = r8.zzk
            int r3 = r2 + r1
            int r4 = r8.zzl
            int r5 = r3 + r9
            if (r5 > r4) goto L9a
            r8.zzk = r3
            r1 = 0
            r8.zzg = r1
            r8.zzi = r1
        L21:
            if (r0 >= r9) goto L74
            java.io.InputStream r1 = r8.zze     // Catch: java.lang.Throwable -> L6a
            int r2 = r9 - r0
            long r2 = (long) r2
            long r4 = r1.skip(r2)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65 java.lang.Throwable -> L6a
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L3c
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L3c
            if (r1 != 0) goto L39
            goto L74
        L39:
            int r1 = (int) r4
            int r0 = r0 + r1
            goto L21
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            java.io.InputStream r1 = r8.zze     // Catch: java.lang.Throwable -> L6a
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r2.<init>()     // Catch: java.lang.Throwable -> L6a
            r2.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "#skip returned invalid result: "
            r2.append(r1)     // Catch: java.lang.Throwable -> L6a
            r2.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "\nThe InputStream implementation is buggy."
            r2.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L6a
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L6a
            throw r9     // Catch: java.lang.Throwable -> L6a
        L65:
            r9 = move-exception
            r9.zza()     // Catch: java.lang.Throwable -> L6a
            throw r9     // Catch: java.lang.Throwable -> L6a
        L6a:
            r9 = move-exception
            int r1 = r8.zzk
            int r1 = r1 + r0
            r8.zzk = r1
            r8.zzJ()
            throw r9
        L74:
            int r1 = r8.zzk
            int r1 = r1 + r0
            r8.zzk = r1
            r8.zzJ()
            if (r0 >= r9) goto L99
            int r0 = r8.zzg
            int r1 = r8.zzi
            int r1 = r0 - r1
            r8.zzi = r0
            r0 = 1
            r8.zzK(r0)
        L8a:
            int r2 = r9 - r1
            int r3 = r8.zzg
            if (r2 <= r3) goto L97
            int r1 = r1 + r3
            r8.zzi = r3
            r8.zzK(r0)
            goto L8a
        L97:
            r8.zzi = r2
        L99:
            return
        L9a:
            int r4 = r4 - r2
            int r4 = r4 - r1
            r8.zzC(r4)
            com.google.android.gms.internal.ads.zzhbt r9 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r9.<init>(r0)
            throw r9
        La7:
            com.google.android.gms.internal.ads.zzhbt r9 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r9.<init>(r0)
            throw r9
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
            int r0 = r2.zzk
            int r1 = r2.zzi
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzd(int r3) throws com.google.android.gms.internal.ads.zzhbt {
            r2 = this;
            if (r3 < 0) goto L24
            int r0 = r2.zzk
            int r1 = r2.zzi
            int r0 = r0 + r1
            int r3 = r3 + r0
            if (r3 < 0) goto L1c
            int r0 = r2.zzl
            if (r3 > r0) goto L14
            r2.zzl = r3
            r2.zzJ()
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
            int r0 = r5.zzi
            int r1 = r5.zzg
            int r1 = r1 - r0
            r2 = 4
            if (r1 >= r2) goto Ld
            r5.zzK(r2)
            int r0 = r5.zzi
        Ld:
            byte[] r1 = r5.zzf
            int r2 = r0 + 4
            r5.zzi = r2
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
    }

    public final int zzi() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzi = r3
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
            r5.zzi = r1
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
            int r1 = r0.zzi
            int r2 = r0.zzg
            int r2 = r2 - r1
            r3 = 8
            if (r2 >= r3) goto L10
            r0.zzK(r3)
            int r1 = r0.zzi
        L10:
            byte[] r2 = r0.zzf
            int r4 = r1 + 8
            r0.zzi = r4
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
    }

    public final long zzq() throws java.io.IOException {
            r11 = this;
            int r0 = r11.zzi
            int r1 = r11.zzg
            if (r1 != r0) goto L8
            goto Lb7
        L8:
            byte[] r2 = r11.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L14
            r11.zzi = r3
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
            r11.zzi = r1
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
            if (r0 >= r3) goto L28
            int r3 = r6.zzi
            int r4 = r6.zzg
            if (r3 != r4) goto L11
            r3 = 1
            r6.zzK(r3)
        L11:
            byte[] r3 = r6.zzf
            int r4 = r6.zzi
            int r5 = r4 + 1
            r6.zzi = r5
            r3 = r3[r4]
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r0
            long r1 = r1 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L25
            return r1
        L25:
            int r0 = r0 + 7
            goto L3
        L28:
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
            r6 = this;
            int r0 = r6.zzi()
            int r1 = r6.zzg
            int r2 = r6.zzi
            int r1 = r1 - r2
            if (r0 > r1) goto L1a
            if (r0 > 0) goto Le
            goto L1a
        Le:
            byte[] r1 = r6.zzf
            com.google.android.gms.internal.ads.zzgzs r1 = com.google.android.gms.internal.ads.zzgzs.zzv(r1, r2, r0)
            int r2 = r6.zzi
            int r2 = r2 + r0
            r6.zzi = r2
            return r1
        L1a:
            if (r0 != 0) goto L1f
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            return r0
        L1f:
            if (r0 < 0) goto L67
            byte[] r1 = r6.zzN(r0)
            r2 = 0
            if (r1 == 0) goto L2e
            int r0 = r1.length
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzv(r1, r2, r0)
            goto L66
        L2e:
            int r1 = r6.zzi
            int r3 = r6.zzg
            int r4 = r3 - r1
            int r5 = r6.zzk
            int r5 = r5 + r3
            r6.zzk = r5
            r6.zzi = r2
            r6.zzg = r2
            int r3 = r0 - r4
            java.util.List r3 = r6.zzI(r3)
            byte[] r0 = new byte[r0]
            byte[] r5 = r6.zzf
            java.lang.System.arraycopy(r5, r1, r0, r2, r4)
            java.util.Iterator r1 = r3.iterator()
        L4e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r1.next()
            byte[] r3 = (byte[]) r3
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r0, r4, r5)
            int r4 = r4 + r5
            goto L4e
        L60:
            com.google.android.gms.internal.ads.zzgzq r1 = new com.google.android.gms.internal.ads.zzgzq
            r1.<init>(r0)
            r0 = r1
        L66:
            return r0
        L67:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final java.lang.String zzw() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzi()
            if (r0 <= 0) goto L1d
            int r1 = r5.zzg
            int r2 = r5.zzi
            int r1 = r1 - r2
            if (r0 <= r1) goto Le
            goto L1d
        Le:
            byte[] r1 = r5.zzf
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.android.gms.internal.ads.zzhbr.zza
            r3.<init>(r1, r2, r0, r4)
            int r1 = r5.zzi
            int r1 = r1 + r0
            r5.zzi = r1
            return r3
        L1d:
            if (r0 != 0) goto L22
            java.lang.String r0 = ""
            return r0
        L22:
            if (r0 < 0) goto L49
            int r1 = r5.zzg
            if (r0 > r1) goto L3c
            r5.zzK(r0)
            byte[] r1 = r5.zzf
            java.lang.String r2 = new java.lang.String
            int r3 = r5.zzi
            java.nio.charset.Charset r4 = com.google.android.gms.internal.ads.zzhbr.zza
            r2.<init>(r1, r3, r0, r4)
            int r1 = r5.zzi
            int r1 = r1 + r0
            r5.zzi = r1
            return r2
        L3c:
            java.lang.String r1 = new java.lang.String
            r2 = 0
            byte[] r0 = r5.zzM(r0, r2)
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzhbr.zza
            r1.<init>(r0, r2)
            return r1
        L49:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final java.lang.String zzx() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzi()
            int r1 = r5.zzi
            int r2 = r5.zzg
            int r3 = r2 - r1
            r4 = 0
            if (r0 > r3) goto L16
            if (r0 <= 0) goto L16
            byte[] r2 = r5.zzf
            int r3 = r1 + r0
            r5.zzi = r3
            goto L2c
        L16:
            if (r0 != 0) goto L1b
            java.lang.String r0 = ""
            return r0
        L1b:
            if (r0 < 0) goto L31
            if (r0 > r2) goto L27
            r5.zzK(r0)
            byte[] r2 = r5.zzf
            r5.zzi = r0
            goto L2b
        L27:
            byte[] r2 = r5.zzM(r0, r4)
        L2b:
            r1 = 0
        L2c:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzhek.zzh(r2, r1, r0)
            return r0
        L31:
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
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
            r0.zzl = r1
            r0.zzJ()
            return
    }
}
