package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzek {
    private static final char[] zza = null;
    private static final char[] zzb = null;
    private static final com.google.android.gms.internal.ads.zzgbc zzc = null;
    private byte[] zzd;
    private int zze;
    private int zzf;

    static {
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            com.google.android.gms.internal.ads.zzek.zza = r0
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 10
            r0[r1] = r2
            com.google.android.gms.internal.ads.zzek.zzb = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_16BE
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_16LE
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzr(r0, r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzek.zzc = r0
            return
    }

    public zzek() {
            r1 = this;
            r1.<init>()
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            r1.zzd = r0
            return
    }

    public zzek(int r2) {
            r1 = this;
            r1.<init>()
            byte[] r0 = new byte[r2]
            r1.zzd = r0
            r1.zzf = r2
            return
    }

    public zzek(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            int r1 = r1.length
            r0.zzf = r1
            return
    }

    public zzek(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            r0.zzf = r2
            return
    }

    private final char zzO(java.nio.charset.Charset r7, char[] r8) {
            r6 = this;
            int r7 = r6.zzP(r7)
            r0 = 0
            if (r7 == 0) goto L1c
            int r1 = r7 >> 16
            int r2 = r8.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L1c
            char r4 = (char) r1
            char r5 = r8[r3]
            if (r5 != r4) goto L19
            int r8 = r6.zze
            char r7 = (char) r7
            int r8 = r8 + r7
            r6.zze = r8
            return r4
        L19:
            int r3 = r3 + 1
            goto Lb
        L1c:
            return r0
    }

    private final int zzP(java.nio.charset.Charset r5) {
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            r1 = 1
            r2 = 2
            if (r0 != 0) goto L12
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L26
        L12:
            int r0 = r4.zzf
            int r3 = r4.zze
            int r0 = r0 - r3
            if (r0 <= 0) goto L26
            byte[] r5 = r4.zzd
            r5 = r5[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.zzgdr.zza(r2)
            byte r5 = (byte) r5
            goto L67
        L26:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L36
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
        L36:
            int r0 = r4.zzf
            int r3 = r4.zze
            int r0 = r0 - r3
            if (r0 < r2) goto L4b
            byte[] r5 = r4.zzd
            r0 = r5[r3]
            int r3 = r3 + r1
            r5 = r5[r3]
            char r5 = com.google.android.gms.internal.ads.zzgdr.zzb(r0, r5)
        L48:
            byte r5 = (byte) r5
            r1 = 2
            goto L67
        L4b:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L70
            int r5 = r4.zzf
            int r0 = r4.zze
            int r5 = r5 - r0
            if (r5 < r2) goto L70
            byte[] r5 = r4.zzd
            int r1 = r0 + 1
            r1 = r5[r1]
            r5 = r5[r0]
            char r5 = com.google.android.gms.internal.ads.zzgdr.zzb(r1, r5)
            goto L48
        L67:
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.zzgdr.zza(r2)
            int r5 = r5 << 16
            int r5 = r5 + r1
            return r5
        L70:
            r5 = 0
            return r5
    }

    public final java.lang.String zzA(int r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            int r0 = r3.zze
            int r1 = r0 + r4
            int r1 = r1 + (-1)
            int r2 = r3.zzf
            if (r1 >= r2) goto L18
            byte[] r2 = r3.zzd
            r1 = r2[r1]
            if (r1 != 0) goto L18
            int r1 = r4 + (-1)
            goto L19
        L18:
            r1 = r4
        L19:
            byte[] r2 = r3.zzd
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zzB(r2, r0, r1)
            int r1 = r3.zze
            int r1 = r1 + r4
            r3.zze = r1
            return r0
    }

    public final java.lang.String zzB(int r4, java.nio.charset.Charset r5) {
            r3 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.zzd
            int r2 = r3.zze
            r0.<init>(r1, r2, r4, r5)
            int r2 = r2 + r4
            r3.zze = r2
            return r0
    }

    public final java.nio.charset.Charset zzC() {
            r6 = this;
            int r0 = r6.zzf
            int r1 = r6.zze
            int r0 = r0 - r1
            r2 = 3
            if (r0 < r2) goto L27
            byte[] r3 = r6.zzd
            r4 = r3[r1]
            r5 = -17
            if (r4 != r5) goto L27
            int r4 = r1 + 1
            r4 = r3[r4]
            r5 = -69
            if (r4 != r5) goto L27
            int r4 = r1 + 2
            r3 = r3[r4]
            r4 = -65
            if (r3 == r4) goto L21
            goto L27
        L21:
            int r1 = r1 + r2
            r6.zze = r1
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            return r0
        L27:
            r2 = 2
            if (r0 < r2) goto L4c
            byte[] r0 = r6.zzd
            r3 = r0[r1]
            r4 = -1
            r5 = -2
            if (r3 != r5) goto L3e
            int r3 = r1 + 1
            r0 = r0[r3]
            if (r0 != r4) goto L4c
            int r1 = r1 + r2
            r6.zze = r1
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            return r0
        L3e:
            if (r3 != r4) goto L4c
            int r3 = r1 + 1
            r0 = r0[r3]
            if (r0 != r5) goto L4c
            int r1 = r1 + r2
            r6.zze = r1
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            return r0
        L4c:
            r0 = 0
            return r0
    }

    public final short zzD() {
            r4 = this;
            byte[] r0 = r4.zzd
            int r1 = r4.zze
            int r2 = r1 + 1
            r4.zze = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.zze = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    public final short zzE() {
            r4 = this;
            byte[] r0 = r4.zzd
            int r1 = r4.zze
            int r2 = r1 + 1
            r4.zze = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.zze = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    public final void zzF(int r3) {
            r2 = this;
            byte[] r0 = r2.zzd
            int r1 = r0.length
            if (r3 <= r1) goto Lb
            byte[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.zzd = r3
        Lb:
            return
    }

    public final void zzG(com.google.android.gms.internal.ads.zzej r3, int r4) {
            r2 = this;
            byte[] r0 = r3.zza
            r1 = 0
            r2.zzH(r0, r1, r4)
            r3.zzl(r1)
            return
    }

    public final void zzH(byte[] r3, int r4, int r5) {
            r2 = this;
            byte[] r0 = r2.zzd
            int r1 = r2.zze
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.zze
            int r3 = r3 + r5
            r2.zze = r3
            return
    }

    public final void zzI(int r3) {
            r2 = this;
            byte[] r0 = r2.zzd
            int r1 = r0.length
            if (r1 >= r3) goto L7
            byte[] r0 = new byte[r3]
        L7:
            r2.zzJ(r0, r3)
            return
    }

    public final void zzJ(byte[] r1, int r2) {
            r0 = this;
            r0.zzd = r1
            r0.zzf = r2
            r1 = 0
            r0.zze = r1
            return
    }

    public final void zzK(int r3) {
            r2 = this;
            r0 = 0
            if (r3 < 0) goto L9
            byte[] r1 = r2.zzd
            int r1 = r1.length
            if (r3 > r1) goto L9
            r0 = 1
        L9:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r2.zzf = r3
            return
    }

    public final void zzL(int r3) {
            r2 = this;
            r0 = 0
            if (r3 < 0) goto L8
            int r1 = r2.zzf
            if (r3 > r1) goto L8
            r0 = 1
        L8:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r2.zze = r3
            return
    }

    public final void zzM(int r2) {
            r1 = this;
            int r0 = r1.zze
            int r0 = r0 + r2
            r1.zzL(r0)
            return
    }

    public final byte[] zzN() {
            r1 = this;
            byte[] r0 = r1.zzd
            return r0
    }

    public final char zza(java.nio.charset.Charset r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzek.zzc
            boolean r0 = r0.contains(r4)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Unsupported charset: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.internal.ads.zzdi.zze(r0, r1)
            int r4 = r3.zzP(r4)
            int r4 = r4 >> 16
            char r4 = (char) r4
            return r4
    }

    public final int zzb() {
            r2 = this;
            int r0 = r2.zzf
            int r1 = r2.zze
            int r0 = r0 - r1
            return r0
    }

    public final int zzc() {
            r1 = this;
            byte[] r0 = r1.zzd
            int r0 = r0.length
            return r0
    }

    public final int zzd() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    public final int zze() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    public final int zzf() {
            r2 = this;
            byte[] r0 = r2.zzd
            int r1 = r2.zze
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public final int zzg() {
            r6 = this;
            byte[] r0 = r6.zzd
            int r1 = r6.zze
            int r2 = r1 + 1
            r6.zze = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r6.zze = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r3 + 1
            r6.zze = r4
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r4 + 1
            r6.zze = r5
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r3 << 8
            r1 = r1 | r2
            r0 = r0 | r1
            return r0
    }

    public final int zzh() {
            r5 = this;
            byte[] r0 = r5.zzd
            int r1 = r5.zze
            int r2 = r1 + 1
            r5.zze = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r5.zze = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r3 + 1
            r5.zze = r4
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r1 = r1 >> 8
            int r2 = r2 << 8
            r1 = r1 | r2
            r0 = r0 | r1
            return r0
    }

    public final int zzi() {
            r6 = this;
            byte[] r0 = r6.zzd
            int r1 = r6.zze
            int r2 = r1 + 1
            r6.zze = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r6.zze = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r3 + 1
            r6.zze = r4
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r4 + 1
            r6.zze = r5
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r3 << 16
            r1 = r1 | r2
            int r0 = r0 << 24
            r0 = r0 | r1
            return r0
    }

    public final int zzj() {
            r4 = this;
            int r0 = r4.zzi()
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Top bit not zero: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final int zzk() {
            r4 = this;
            byte[] r0 = r4.zzd
            int r1 = r4.zze
            int r2 = r1 + 1
            r4.zze = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.zze = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            return r0
    }

    public final int zzl() {
            r3 = this;
            int r0 = r3.zzm()
            int r0 = r0 << 21
            int r1 = r3.zzm()
            int r1 = r1 << 14
            int r2 = r3.zzm()
            int r2 = r2 << 7
            r0 = r0 | r1
            r0 = r0 | r2
            int r1 = r3.zzm()
            r0 = r0 | r1
            return r0
    }

    public final int zzm() {
            r3 = this;
            byte[] r0 = r3.zzd
            int r1 = r3.zze
            int r2 = r1 + 1
            r3.zze = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public final int zzn() {
            r4 = this;
            byte[] r0 = r4.zzd
            int r1 = r4.zze
            int r2 = r1 + 1
            r4.zze = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.zze = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 2
            r4.zze = r3
            int r1 = r1 << 8
            r0 = r0 | r1
            return r0
    }

    public final int zzo() {
            r5 = this;
            byte[] r0 = r5.zzd
            int r1 = r5.zze
            int r2 = r1 + 1
            r5.zze = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r5.zze = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r3 + 1
            r5.zze = r4
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r2 = r2 << 8
            r1 = r1 | r2
            r0 = r0 | r1
            return r0
    }

    public final int zzp() {
            r4 = this;
            int r0 = r4.zzg()
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Top bit not zero: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final int zzq() {
            r4 = this;
            byte[] r0 = r4.zzd
            int r1 = r4.zze
            int r2 = r1 + 1
            r4.zze = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.zze = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            return r0
    }

    public final long zzr() {
            r20 = this;
            r0 = r20
            byte[] r1 = r0.zzd
            int r2 = r0.zze
            int r3 = r2 + 1
            r0.zze = r3
            r2 = r1[r2]
            long r4 = (long) r2
            int r2 = r3 + 1
            r0.zze = r2
            r3 = r1[r3]
            long r6 = (long) r3
            int r3 = r2 + 1
            r0.zze = r3
            r2 = r1[r2]
            long r8 = (long) r2
            int r2 = r3 + 1
            r0.zze = r2
            r3 = r1[r3]
            long r10 = (long) r3
            int r3 = r2 + 1
            r0.zze = r3
            r2 = r1[r2]
            long r12 = (long) r2
            int r2 = r3 + 1
            r0.zze = r2
            r3 = r1[r3]
            long r14 = (long) r3
            int r3 = r2 + 1
            r0.zze = r3
            r2 = r1[r2]
            r16 = r4
            long r4 = (long) r2
            int r2 = r3 + 1
            r0.zze = r2
            r1 = r1[r3]
            long r1 = (long) r1
            r18 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r18
            long r8 = r8 & r18
            long r10 = r10 & r18
            long r12 = r12 & r18
            long r14 = r14 & r18
            long r3 = r4 & r18
            long r1 = r1 & r18
            long r16 = r16 & r18
            r5 = 8
            long r5 = r6 << r5
            long r5 = r16 | r5
            r7 = 16
            long r7 = r8 << r7
            long r5 = r5 | r7
            r7 = 24
            long r7 = r10 << r7
            long r5 = r5 | r7
            r7 = 32
            long r7 = r12 << r7
            long r5 = r5 | r7
            r7 = 40
            long r7 = r14 << r7
            long r5 = r5 | r7
            r7 = 48
            long r3 = r3 << r7
            long r3 = r3 | r5
            r5 = 56
            long r1 = r1 << r5
            long r1 = r1 | r3
            return r1
    }

    public final long zzs() {
            r11 = this;
            byte[] r0 = r11.zzd
            int r1 = r11.zze
            int r2 = r1 + 1
            r11.zze = r2
            r1 = r0[r1]
            long r3 = (long) r1
            int r1 = r2 + 1
            r11.zze = r1
            r2 = r0[r2]
            long r5 = (long) r2
            int r2 = r1 + 1
            r11.zze = r2
            r1 = r0[r1]
            long r7 = (long) r1
            int r1 = r2 + 1
            r11.zze = r1
            r0 = r0[r2]
            long r0 = (long) r0
            r9 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r9
            long r7 = r7 & r9
            long r0 = r0 & r9
            long r2 = r3 & r9
            r4 = 8
            long r4 = r5 << r4
            long r2 = r2 | r4
            r4 = 16
            long r4 = r7 << r4
            long r2 = r2 | r4
            r4 = 24
            long r0 = r0 << r4
            long r0 = r0 | r2
            return r0
    }

    public final long zzt() {
            r20 = this;
            r0 = r20
            byte[] r1 = r0.zzd
            int r2 = r0.zze
            int r3 = r2 + 1
            r0.zze = r3
            r2 = r1[r2]
            long r4 = (long) r2
            int r2 = r3 + 1
            r0.zze = r2
            r3 = r1[r3]
            long r6 = (long) r3
            int r3 = r2 + 1
            r0.zze = r3
            r2 = r1[r2]
            long r8 = (long) r2
            int r2 = r3 + 1
            r0.zze = r2
            r3 = r1[r3]
            long r10 = (long) r3
            int r3 = r2 + 1
            r0.zze = r3
            r2 = r1[r2]
            long r12 = (long) r2
            int r2 = r3 + 1
            r0.zze = r2
            r3 = r1[r3]
            long r14 = (long) r3
            int r3 = r2 + 1
            r0.zze = r3
            r2 = r1[r2]
            r16 = r14
            long r14 = (long) r2
            int r2 = r3 + 1
            r0.zze = r2
            r1 = r1[r3]
            long r1 = (long) r1
            r18 = 255(0xff, double:1.26E-321)
            long r3 = r4 & r18
            long r5 = r6 & r18
            long r7 = r8 & r18
            long r9 = r10 & r18
            long r11 = r12 & r18
            long r16 = r16 & r18
            long r13 = r14 & r18
            r15 = 56
            long r3 = r3 << r15
            r15 = 48
            long r5 = r5 << r15
            long r3 = r3 | r5
            r5 = 40
            long r5 = r7 << r5
            long r3 = r3 | r5
            r5 = 32
            long r5 = r9 << r5
            long r3 = r3 | r5
            r5 = 24
            long r5 = r11 << r5
            long r3 = r3 | r5
            r5 = 16
            long r5 = r16 << r5
            long r3 = r3 | r5
            r5 = 8
            long r5 = r13 << r5
            long r3 = r3 | r5
            long r1 = r1 & r18
            long r1 = r1 | r3
            return r1
    }

    public final long zzu() {
            r11 = this;
            byte[] r0 = r11.zzd
            int r1 = r11.zze
            int r2 = r1 + 1
            r11.zze = r2
            r1 = r0[r1]
            long r3 = (long) r1
            int r1 = r2 + 1
            r11.zze = r1
            r2 = r0[r2]
            long r5 = (long) r2
            int r2 = r1 + 1
            r11.zze = r2
            r1 = r0[r1]
            long r7 = (long) r1
            int r1 = r2 + 1
            r11.zze = r1
            r0 = r0[r2]
            long r0 = (long) r0
            r9 = 255(0xff, double:1.26E-321)
            long r2 = r3 & r9
            long r4 = r5 & r9
            long r6 = r7 & r9
            r8 = 24
            long r2 = r2 << r8
            r8 = 16
            long r4 = r4 << r8
            long r2 = r2 | r4
            r4 = 8
            long r4 = r6 << r4
            long r2 = r2 | r4
            long r0 = r0 & r9
            long r0 = r0 | r2
            return r0
    }

    public final long zzv() {
            r10 = this;
            r0 = 0
            r2 = 0
            r3 = r0
        L4:
            r5 = 9
            if (r2 >= r5) goto L2d
            int r5 = r10.zze
            int r6 = r10.zzf
            if (r5 == r6) goto L25
            int r5 = r10.zzm()
            long r5 = (long) r5
            r7 = 127(0x7f, double:6.27E-322)
            long r7 = r7 & r5
            int r9 = r2 * 7
            long r7 = r7 << r9
            long r3 = r3 | r7
            r7 = 128(0x80, double:6.32E-322)
            long r5 = r5 & r7
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 != 0) goto L22
            goto L2d
        L22:
            int r2 = r2 + 1
            goto L4
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempting to read a byte over the limit."
            r0.<init>(r1)
            throw r0
        L2d:
            return r3
    }

    public final long zzw() {
            r5 = this;
            long r0 = r5.zzt()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Top bit not zero: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    public final long zzx() {
            r13 = this;
            byte[] r0 = r13.zzd
            int r1 = r13.zze
            r0 = r0[r1]
            long r0 = (long) r0
            r2 = 7
            r3 = 7
        L9:
            r4 = 6
            r5 = 0
            r6 = 1
            if (r3 < 0) goto L28
            int r7 = r6 << r3
            long r8 = (long) r7
            long r8 = r8 & r0
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L25
            if (r3 >= r4) goto L21
            int r7 = r7 + (-1)
            long r7 = (long) r7
            long r0 = r0 & r7
            int r5 = 7 - r3
            goto L28
        L21:
            if (r3 != r2) goto L28
            r5 = 1
            goto L28
        L25:
            int r3 = r3 + (-1)
            goto L9
        L28:
            if (r5 == 0) goto L5e
        L2a:
            if (r6 >= r5) goto L58
            byte[] r2 = r13.zzd
            int r3 = r13.zze
            int r3 = r3 + r6
            r2 = r2[r3]
            r3 = r2 & 192(0xc0, float:2.69E-43)
            r7 = 128(0x80, float:1.794E-43)
            if (r3 != r7) goto L41
            long r0 = r0 << r4
            r2 = r2 & 63
            long r2 = (long) r2
            long r0 = r0 | r2
            int r6 = r6 + 1
            goto L2a
        L41:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid UTF-8 sequence continuation byte: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L58:
            int r2 = r13.zze
            int r2 = r2 + r5
            r13.zze = r2
            return r0
        L5e:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid UTF-8 sequence first byte: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.String zzy(char r4) {
            r3 = this;
            int r4 = r3.zzf
            int r0 = r3.zze
            int r4 = r4 - r0
            if (r4 == 0) goto L29
        L7:
            int r4 = r3.zzf
            if (r0 >= r4) goto L14
            byte[] r4 = r3.zzd
            r4 = r4[r0]
            if (r4 == 0) goto L14
            int r0 = r0 + 1
            goto L7
        L14:
            byte[] r4 = r3.zzd
            int r1 = r3.zze
            int r2 = r0 - r1
            java.lang.String r4 = com.google.android.gms.internal.ads.zzeu.zzB(r4, r1, r2)
            r3.zze = r0
            int r1 = r3.zzf
            if (r0 >= r1) goto L28
            int r0 = r0 + 1
            r3.zze = r0
        L28:
            return r4
        L29:
            r4 = 0
            return r4
    }

    public final java.lang.String zzz(java.nio.charset.Charset r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzek.zzc
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Unsupported charset: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.internal.ads.zzdi.zze(r0, r1)
            int r0 = r4.zzf
            int r1 = r4.zze
            int r0 = r0 - r1
            if (r0 != 0) goto L1c
            r5 = 0
            return r5
        L1c:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L27
            r4.zzC()
        L27:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            r1 = 2
            r3 = 1
            if (r0 != 0) goto L61
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3a
            goto L61
        L3a:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L62
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L62
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L53
            goto L62
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            r0.<init>(r5)
            throw r0
        L61:
            r1 = 1
        L62:
            int r0 = r4.zze
        L64:
            int r2 = r4.zzf
            int r3 = r1 + (-1)
            int r3 = r2 - r3
            if (r0 >= r3) goto Lc1
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L7c
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L86
        L7c:
            byte[] r2 = r4.zzd
            r2 = r2[r0]
            boolean r2 = com.google.android.gms.internal.ads.zzeu.zzK(r2)
            if (r2 != 0) goto Lc2
        L86:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L96
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La6
        L96:
            byte[] r2 = r4.zzd
            r3 = r2[r0]
            if (r3 != 0) goto La6
            int r3 = r0 + 1
            r2 = r2[r3]
            boolean r2 = com.google.android.gms.internal.ads.zzeu.zzK(r2)
            if (r2 != 0) goto Lc2
        La6:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lbf
            int r2 = r0 + 1
            byte[] r3 = r4.zzd
            r2 = r3[r2]
            if (r2 != 0) goto Lbf
            r2 = r3[r0]
            boolean r2 = com.google.android.gms.internal.ads.zzeu.zzK(r2)
            if (r2 == 0) goto Lbf
            goto Lc2
        Lbf:
            int r0 = r0 + r1
            goto L64
        Lc1:
            r0 = r2
        Lc2:
            int r1 = r4.zze
            int r0 = r0 - r1
            java.lang.String r0 = r4.zzB(r0, r5)
            int r1 = r4.zze
            int r2 = r4.zzf
            if (r1 == r2) goto Lde
            char[] r1 = com.google.android.gms.internal.ads.zzek.zza
            char r1 = r4.zzO(r5, r1)
            r2 = 13
            if (r1 != r2) goto Lde
            char[] r1 = com.google.android.gms.internal.ads.zzek.zzb
            r4.zzO(r5, r1)
        Lde:
            return r0
    }
}
