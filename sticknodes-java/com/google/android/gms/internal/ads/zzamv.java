package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamv implements com.google.android.gms.internal.ads.zzamz {
    private static final byte[] zza = null;
    private final boolean zzb;
    private final com.google.android.gms.internal.ads.zzej zzc;
    private final com.google.android.gms.internal.ads.zzek zzd;
    private final java.lang.String zze;
    private final int zzf;
    private java.lang.String zzg;
    private com.google.android.gms.internal.ads.zzaeh zzh;
    private com.google.android.gms.internal.ads.zzaeh zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private com.google.android.gms.internal.ads.zzaeh zzv;
    private long zzw;

    static {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [73, 68, 51} // fill-array
            com.google.android.gms.internal.ads.zzamv.zza = r0
            return
    }

    public zzamv(boolean r4, java.lang.String r5, int r6) {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzej r0 = new com.google.android.gms.internal.ads.zzej
            r1 = 7
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1)
            r3.zzc = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            byte[] r1 = com.google.android.gms.internal.ads.zzamv.zza
            r2 = 10
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.<init>(r1)
            r3.zzd = r0
            r3.zzh()
            r0 = -1
            r3.zzo = r0
            r3.zzp = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzs = r0
            r3.zzu = r0
            r3.zzb = r4
            r3.zze = r5
            r3.zzf = r6
            return
    }

    public static boolean zzf(int r1) {
            r0 = 65526(0xfff6, float:9.1821E-41)
            r1 = r1 & r0
            r0 = 65520(0xfff0, float:9.1813E-41)
            if (r1 != r0) goto Lb
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private final void zzg() {
            r1 = this;
            r0 = 0
            r1.zzn = r0
            r1.zzh()
            return
    }

    private final void zzh() {
            r1 = this;
            r0 = 0
            r1.zzj = r0
            r1.zzk = r0
            r0 = 256(0x100, float:3.59E-43)
            r1.zzl = r0
            return
    }

    private final void zzi() {
            r1 = this;
            r0 = 3
            r1.zzj = r0
            r0 = 0
            r1.zzk = r0
            return
    }

    private final void zzj(com.google.android.gms.internal.ads.zzaeh r2, long r3, int r5, int r6) {
            r1 = this;
            r0 = 4
            r1.zzj = r0
            r1.zzk = r5
            r1.zzv = r2
            r1.zzw = r3
            r1.zzt = r6
            return
    }

    private final boolean zzk(com.google.android.gms.internal.ads.zzek r3, byte[] r4, int r5) {
            r2 = this;
            int r0 = r3.zzb()
            int r1 = r2.zzk
            int r1 = r5 - r1
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r2.zzk
            r3.zzH(r4, r1, r0)
            int r3 = r2.zzk
            int r3 = r3 + r0
            r2.zzk = r3
            if (r3 != r5) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    private static final boolean zzl(byte r0, byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            r1 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 | r1
            boolean r0 = zzf(r0)
            return r0
    }

    private static final boolean zzm(com.google.android.gms.internal.ads.zzek r2, byte[] r3, int r4) {
            int r0 = r2.zzb()
            r1 = 0
            if (r0 >= r4) goto L8
            return r1
        L8:
            r2.zzH(r3, r1, r4)
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r17) throws com.google.android.gms.internal.ads.zzbo {
            r16 = this;
            r6 = r16
            r7 = r17
            com.google.android.gms.internal.ads.zzaeh r0 = r6.zzh
            java.util.Objects.requireNonNull(r0)
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
        Lb:
            int r0 = r17.zzb()
            if (r0 <= 0) goto L2ce
            int r0 = r6.zzj
            r1 = 13
            r2 = 7
            r3 = 4
            r4 = 3
            r5 = -1
            r8 = 0
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L19f
            if (r0 == r10) goto L164
            r5 = 10
            if (r0 == r9) goto L137
            if (r0 == r4) goto L67
            int r0 = r17.zzb()
            int r1 = r6.zzt
            int r2 = r6.zzk
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.gms.internal.ads.zzaeh r1 = r6.zzv
            r1.zzq(r7, r0)
            int r1 = r6.zzk
            int r1 = r1 + r0
            r6.zzk = r1
            int r0 = r6.zzt
            if (r1 != r0) goto Lb
            long r0 = r6.zzu
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L4d
            r8 = 1
        L4d:
            com.google.android.gms.internal.ads.zzdi.zzf(r8)
            com.google.android.gms.internal.ads.zzaeh r9 = r6.zzv
            long r10 = r6.zzu
            r12 = 1
            int r13 = r6.zzt
            r14 = 0
            r15 = 0
            r9.zzs(r10, r12, r13, r14, r15)
            long r0 = r6.zzu
            long r2 = r6.zzw
            long r0 = r0 + r2
            r6.zzu = r0
            r16.zzh()
            goto Lb
        L67:
            boolean r0 = r6.zzm
            r11 = 5
            if (r10 == r0) goto L6e
            r0 = 5
            goto L6f
        L6e:
            r0 = 7
        L6f:
            com.google.android.gms.internal.ads.zzej r12 = r6.zzc
            byte[] r12 = r12.zza
            boolean r0 = r6.zzk(r7, r12, r0)
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzej r0 = r6.zzc
            r0.zzl(r8)
            boolean r0 = r6.zzr
            if (r0 != 0) goto L112
            com.google.android.gms.internal.ads.zzej r0 = r6.zzc
            int r0 = r0.zzd(r9)
            int r0 = r0 + r10
            if (r0 == r9) goto La6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "Detected audio object type: "
            r5.append(r12)
            r5.append(r0)
            java.lang.String r0 = ", but assuming AAC LC."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "AdtsReader"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r0)
        La6:
            com.google.android.gms.internal.ads.zzej r0 = r6.zzc
            r0.zzn(r11)
            com.google.android.gms.internal.ads.zzej r0 = r6.zzc
            int r0 = r0.zzd(r4)
            int r5 = r6.zzp
            int r11 = com.google.android.gms.internal.ads.zzaby.zza
            int r11 = r5 >> 1
            r11 = r11 & r2
            byte[] r9 = new byte[r9]
            r11 = r11 | 16
            byte r11 = (byte) r11
            r9[r8] = r11
            int r2 = r5 << 7
            int r0 = r0 << r4
            r2 = r2 & 128(0x80, float:1.794E-43)
            r0 = r0 & 120(0x78, float:1.68E-43)
            r0 = r0 | r2
            byte r0 = (byte) r0
            r9[r10] = r0
            com.google.android.gms.internal.ads.zzabx r0 = com.google.android.gms.internal.ads.zzaby.zza(r9)
            com.google.android.gms.internal.ads.zzad r2 = new com.google.android.gms.internal.ads.zzad
            r2.<init>()
            java.lang.String r4 = r6.zzg
            r2.zzL(r4)
            java.lang.String r4 = "audio/mp4a-latm"
            r2.zzZ(r4)
            java.lang.String r4 = r0.zzc
            r2.zzA(r4)
            int r4 = r0.zzb
            r2.zzz(r4)
            int r0 = r0.zza
            r2.zzaa(r0)
            java.util.List r0 = java.util.Collections.singletonList(r9)
            r2.zzM(r0)
            java.lang.String r0 = r6.zze
            r2.zzP(r0)
            int r0 = r6.zzf
            r2.zzX(r0)
            com.google.android.gms.internal.ads.zzaf r0 = r2.zzaf()
            r4 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r2 = r0.zzC
            long r8 = (long) r2
            long r4 = r4 / r8
            r6.zzs = r4
            com.google.android.gms.internal.ads.zzaeh r2 = r6.zzh
            r2.zzl(r0)
            r6.zzr = r10
            goto L117
        L112:
            com.google.android.gms.internal.ads.zzej r0 = r6.zzc
            r0.zzn(r5)
        L117:
            com.google.android.gms.internal.ads.zzej r0 = r6.zzc
            r0.zzn(r3)
            com.google.android.gms.internal.ads.zzej r0 = r6.zzc
            int r0 = r0.zzd(r1)
            int r0 = r0 + (-7)
            boolean r1 = r6.zzm
            if (r1 == 0) goto L12a
            int r0 = r0 + (-2)
        L12a:
            r5 = r0
            com.google.android.gms.internal.ads.zzaeh r1 = r6.zzh
            long r2 = r6.zzs
            r4 = 0
            r0 = r16
            r0.zzj(r1, r2, r4, r5)
            goto Lb
        L137:
            com.google.android.gms.internal.ads.zzek r0 = r6.zzd
            byte[] r0 = r0.zzN()
            boolean r0 = r6.zzk(r7, r0, r5)
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzaeh r0 = r6.zzi
            com.google.android.gms.internal.ads.zzek r1 = r6.zzd
            r0.zzq(r1, r5)
            com.google.android.gms.internal.ads.zzek r0 = r6.zzd
            r1 = 6
            r0.zzL(r1)
            com.google.android.gms.internal.ads.zzaeh r1 = r6.zzi
            r2 = 0
            com.google.android.gms.internal.ads.zzek r0 = r6.zzd
            int r0 = r0.zzl()
            int r5 = r5 + r0
            r4 = 10
            r0 = r16
            r0.zzj(r1, r2, r4, r5)
            goto Lb
        L164:
            int r0 = r17.zzb()
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzej r0 = r6.zzc
            byte[] r1 = r0.zza
            byte[] r2 = r17.zzN()
            int r4 = r17.zzd()
            r2 = r2[r4]
            r1[r8] = r2
            r0.zzl(r9)
            com.google.android.gms.internal.ads.zzej r0 = r6.zzc
            int r0 = r0.zzd(r3)
            int r1 = r6.zzp
            if (r1 == r5) goto L18e
            if (r0 == r1) goto L18e
            r16.zzg()
            goto Lb
        L18e:
            boolean r1 = r6.zzn
            if (r1 != 0) goto L19a
            r6.zzn = r10
            int r1 = r6.zzq
            r6.zzo = r1
            r6.zzp = r0
        L19a:
            r16.zzi()
            goto Lb
        L19f:
            byte[] r0 = r17.zzN()
            int r11 = r17.zzd()
            int r12 = r17.zze()
        L1ab:
            if (r11 >= r12) goto L2c9
            int r13 = r11 + 1
            r11 = r0[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r14 = r6.zzl
            r15 = 512(0x200, float:7.175E-43)
            if (r14 != r15) goto L27e
            byte r14 = (byte) r11
            boolean r14 = zzl(r5, r14)
            if (r14 == 0) goto L27e
            boolean r14 = r6.zzn
            if (r14 != 0) goto L25d
            int r14 = r13 + (-2)
            int r15 = r14 + 1
            r7.zzL(r15)
            com.google.android.gms.internal.ads.zzej r15 = r6.zzc
            byte[] r15 = r15.zza
            boolean r15 = zzm(r7, r15, r10)
            if (r15 != 0) goto L1d7
            goto L27e
        L1d7:
            com.google.android.gms.internal.ads.zzej r15 = r6.zzc
            r15.zzl(r3)
            com.google.android.gms.internal.ads.zzej r15 = r6.zzc
            int r15 = r15.zzd(r10)
            int r8 = r6.zzo
            if (r8 == r5) goto L1e8
            if (r15 != r8) goto L27e
        L1e8:
            int r8 = r6.zzp
            if (r8 == r5) goto L20b
            com.google.android.gms.internal.ads.zzej r8 = r6.zzc
            byte[] r8 = r8.zza
            boolean r8 = zzm(r7, r8, r10)
            if (r8 != 0) goto L1f7
            goto L25d
        L1f7:
            com.google.android.gms.internal.ads.zzej r8 = r6.zzc
            r8.zzl(r9)
            com.google.android.gms.internal.ads.zzej r8 = r6.zzc
            int r8 = r8.zzd(r3)
            int r9 = r6.zzp
            if (r8 != r9) goto L27e
            int r8 = r14 + 2
            r7.zzL(r8)
        L20b:
            com.google.android.gms.internal.ads.zzej r8 = r6.zzc
            byte[] r8 = r8.zza
            boolean r8 = zzm(r7, r8, r3)
            if (r8 == 0) goto L25d
            com.google.android.gms.internal.ads.zzej r8 = r6.zzc
            r9 = 14
            r8.zzl(r9)
            com.google.android.gms.internal.ads.zzej r8 = r6.zzc
            int r8 = r8.zzd(r1)
            if (r8 < r2) goto L27e
            byte[] r9 = r17.zzN()
            int r1 = r17.zze()
            int r14 = r14 + r8
            if (r14 >= r1) goto L25d
            r8 = r9[r14]
            if (r8 != r5) goto L245
            int r14 = r14 + 1
            if (r14 == r1) goto L25d
            r1 = r9[r14]
            boolean r8 = zzl(r5, r1)
            if (r8 == 0) goto L27e
            r1 = r1 & 8
            int r1 = r1 >> r4
            if (r1 != r15) goto L27e
            goto L25d
        L245:
            r15 = 73
            if (r8 != r15) goto L27e
            int r8 = r14 + 1
            if (r8 == r1) goto L25d
            r8 = r9[r8]
            r15 = 68
            if (r8 != r15) goto L27e
            int r14 = r14 + 2
            if (r14 == r1) goto L25d
            r1 = r9[r14]
            r8 = 51
            if (r1 != r8) goto L27e
        L25d:
            r0 = r11 & 8
            int r0 = r0 >> r4
            r6.zzq = r0
            r0 = r11 & 1
            r0 = r0 ^ r10
            if (r10 == r0) goto L269
            r0 = 0
            goto L26a
        L269:
            r0 = 1
        L26a:
            r6.zzm = r0
            boolean r0 = r6.zzn
            if (r0 != 0) goto L276
            r6.zzj = r10
            r0 = 0
            r6.zzk = r0
            goto L279
        L276:
            r16.zzi()
        L279:
            r7.zzL(r13)
            goto Lb
        L27e:
            int r1 = r6.zzl
            r8 = r1 | r11
            r9 = 329(0x149, float:4.61E-43)
            if (r8 == r9) goto L2bd
            r9 = 511(0x1ff, float:7.16E-43)
            if (r8 == r9) goto L2b8
            r9 = 836(0x344, float:1.171E-42)
            if (r8 == r9) goto L2b3
            r9 = 1075(0x433, float:1.506E-42)
            if (r8 == r9) goto L2a1
            r8 = 256(0x100, float:3.59E-43)
            if (r1 == r8) goto L29e
            r6.zzl = r8
            int r11 = r13 + (-1)
            r1 = 13
            r8 = 0
            goto L2c6
        L29e:
            r1 = 2
            r8 = 0
            goto L2c3
        L2a1:
            r1 = 2
            r6.zzj = r1
            r6.zzk = r4
            r8 = 0
            r6.zzt = r8
            com.google.android.gms.internal.ads.zzek r0 = r6.zzd
            r0.zzL(r8)
            r7.zzL(r13)
            goto Lb
        L2b3:
            r1 = 2
            r8 = 0
            r9 = 1024(0x400, float:1.435E-42)
            goto L2c1
        L2b8:
            r1 = 2
            r8 = 0
            r9 = 512(0x200, float:7.175E-43)
            goto L2c1
        L2bd:
            r1 = 2
            r8 = 0
            r9 = 768(0x300, float:1.076E-42)
        L2c1:
            r6.zzl = r9
        L2c3:
            r11 = r13
            r1 = 13
        L2c6:
            r9 = 2
            goto L1ab
        L2c9:
            r7.zzL(r11)
            goto Lb
        L2ce:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r3, com.google.android.gms.internal.ads.zzaon r4) {
            r2 = this;
            r4.zzc()
            java.lang.String r0 = r4.zzb()
            r2.zzg = r0
            int r0 = r4.zza()
            r1 = 1
            com.google.android.gms.internal.ads.zzaeh r0 = r3.zzw(r0, r1)
            r2.zzh = r0
            r2.zzv = r0
            boolean r0 = r2.zzb
            if (r0 == 0) goto L41
            r4.zzc()
            int r0 = r4.zza()
            r1 = 5
            com.google.android.gms.internal.ads.zzaeh r3 = r3.zzw(r0, r1)
            r2.zzi = r3
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r4 = r4.zzb()
            r0.zzL(r4)
            java.lang.String r4 = "application/id3"
            r0.zzZ(r4)
            com.google.android.gms.internal.ads.zzaf r4 = r0.zzaf()
            r3.zzl(r4)
            return
        L41:
            com.google.android.gms.internal.ads.zzacw r3 = new com.google.android.gms.internal.ads.zzacw
            r3.<init>()
            r2.zzi = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long r1, int r3) {
            r0 = this;
            r0.zzu = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzu = r0
            r2.zzg()
            return
    }
}
