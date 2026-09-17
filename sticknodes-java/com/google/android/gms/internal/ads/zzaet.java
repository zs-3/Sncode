package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaet implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final com.google.android.gms.internal.ads.zzaes zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.ads.zzakt zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzade zzf;
    private com.google.android.gms.internal.ads.zzaeu zzg;
    private long zzh;
    private com.google.android.gms.internal.ads.zzaew[] zzi;
    private long zzj;
    private com.google.android.gms.internal.ads.zzaew zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @java.lang.Deprecated
    public zzaet() {
            r2 = this;
            com.google.android.gms.internal.ads.zzakt r0 = com.google.android.gms.internal.ads.zzakt.zza
            r1 = 1
            r2.<init>(r1, r0)
            return
    }

    public zzaet(int r2, com.google.android.gms.internal.ads.zzakt r3) {
            r1 = this;
            r1.<init>()
            r1.zzd = r3
            r3 = 1
            r2 = r2 ^ r3
            r0 = 0
            if (r3 == r2) goto Lb
            r3 = 0
        Lb:
            r1.zzc = r3
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r3 = 12
            r2.<init>(r3)
            r1.zza = r2
            com.google.android.gms.internal.ads.zzaes r2 = new com.google.android.gms.internal.ads.zzaes
            r3 = 0
            r2.<init>(r3)
            r1.zzb = r2
            com.google.android.gms.internal.ads.zzadv r2 = new com.google.android.gms.internal.ads.zzadv
            r2.<init>()
            r1.zzf = r2
            com.google.android.gms.internal.ads.zzaew[] r2 = new com.google.android.gms.internal.ads.zzaew[r0]
            r1.zzi = r2
            r2 = -1
            r1.zzm = r2
            r1.zzn = r2
            r2 = -1
            r1.zzl = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.zzh = r2
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaew[] zza(com.google.android.gms.internal.ads.zzaet r0) {
            com.google.android.gms.internal.ads.zzaew[] r0 = r0.zzi
            return r0
    }

    private final com.google.android.gms.internal.ads.zzaew zzg(int r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzaew[] r0 = r5.zzi
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            boolean r4 = r3.zzf(r6)
            if (r4 == 0) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L4
        L12:
            r6 = 0
            return r6
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r28, com.google.android.gms.internal.ads.zzadx r29) throws java.io.IOException {
            r27 = this;
            r0 = r27
            r1 = r28
            long r2 = r0.zzj
            r4 = -1
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L2b
            long r8 = r28.zzf()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 < 0) goto L25
            r10 = 262144(0x40000, double:1.295163E-318)
            long r10 = r10 + r8
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 <= 0) goto L1f
            goto L25
        L1f:
            long r2 = r2 - r8
            int r3 = (int) r2
            r1.zzk(r3)
            goto L2b
        L25:
            r8 = r29
            r8.zza = r2
            r2 = 1
            goto L2c
        L2b:
            r2 = 0
        L2c:
            r0.zzj = r4
            if (r2 == 0) goto L31
            return r6
        L31:
            int r2 = r0.zze
            r3 = 12
            r8 = 0
            if (r2 == 0) goto L398
            r9 = 1819436136(0x6c726468, float:1.1721368E27)
            r10 = 1414744396(0x5453494c, float:3.62987127E12)
            r11 = 2
            if (r2 == r6) goto L33b
            r12 = 3
            if (r2 == r11) goto L21c
            r9 = 6
            r11 = 1769369453(0x69766f6d, float:1.8620122E25)
            r13 = 4
            r16 = 8
            r14 = 16
            if (r2 == r12) goto L188
            r4 = 5
            r5 = 8
            if (r2 == r13) goto L15d
            if (r2 == r4) goto Ldd
            long r12 = r28.zzf()
            long r14 = r0.zzn
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L63
            r7 = -1
            goto Ldc
        L63:
            com.google.android.gms.internal.ads.zzaew r2 = r0.zzk
            if (r2 == 0) goto L71
            boolean r1 = r2.zzg(r1)
            if (r1 != 0) goto L6e
            goto Ldc
        L6e:
            r0.zzk = r8
            return r7
        L71:
            long r8 = r28.zzf()
            r12 = 1
            long r8 = r8 & r12
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L7f
            r1.zzk(r6)
        L7f:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            r1.zzh(r2, r7, r3)
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            r2.zzL(r7)
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            int r2 = r2.zzi()
            if (r2 != r10) goto Lac
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            r2.zzL(r5)
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            int r2 = r2.zzi()
            if (r2 != r11) goto La3
            goto La5
        La3:
            r3 = 8
        La5:
            r1.zzk(r3)
            r28.zzj()
            goto Ldc
        Lac:
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            int r3 = r3.zzi()
            r4 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r2 != r4) goto Lc2
            long r2 = (long) r3
            long r4 = r28.zzf()
            long r4 = r4 + r2
            long r4 = r4 + r16
            r0.zzj = r4
            goto Ldc
        Lc2:
            r1.zzk(r5)
            r28.zzj()
            com.google.android.gms.internal.ads.zzaew r2 = r0.zzg(r2)
            if (r2 != 0) goto Ld7
            long r2 = (long) r3
            long r4 = r28.zzf()
            long r4 = r4 + r2
            r0.zzj = r4
            goto Ldc
        Ld7:
            r2.zzd(r3)
            r0.zzk = r2
        Ldc:
            return r7
        Ldd:
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            int r3 = r0.zzo
            r2.<init>(r3)
            byte[] r3 = r2.zzN()
            int r4 = r0.zzo
            r1.zzi(r3, r7, r4)
            int r1 = r2.zzb()
            if (r1 >= r14) goto Lf6
            r18 = 0
            goto L112
        Lf6:
            int r1 = r2.zzd()
            r2.zzM(r5)
            int r3 = r2.zzi()
            long r3 = (long) r3
            long r10 = r0.zzm
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 <= 0) goto L10b
            r18 = 0
            goto L10f
        L10b:
            long r10 = r10 + r16
            r18 = r10
        L10f:
            r2.zzL(r1)
        L112:
            int r1 = r2.zzb()
            if (r1 < r14) goto L13a
            int r1 = r2.zzi()
            int r3 = r2.zzi()
            int r4 = r2.zzi()
            long r4 = (long) r4
            long r4 = r4 + r18
            r2.zzi()
            com.google.android.gms.internal.ads.zzaew r1 = r0.zzg(r1)
            if (r1 == 0) goto L112
            r3 = r3 & r14
            if (r3 != r14) goto L135
            r3 = 1
            goto L136
        L135:
            r3 = 0
        L136:
            r1.zzb(r4, r3)
            goto L112
        L13a:
            com.google.android.gms.internal.ads.zzaew[] r1 = r0.zzi
            int r2 = r1.length
            r3 = 0
        L13e:
            if (r3 >= r2) goto L148
            r4 = r1[r3]
            r4.zzc()
            int r3 = r3 + 1
            goto L13e
        L148:
            r0.zzp = r6
            com.google.android.gms.internal.ads.zzade r1 = r0.zzf
            com.google.android.gms.internal.ads.zzaeq r2 = new com.google.android.gms.internal.ads.zzaeq
            long r3 = r0.zzh
            r2.<init>(r0, r3)
            r1.zzO(r2)
            r0.zze = r9
            long r1 = r0.zzm
            r0.zzj = r1
            return r7
        L15d:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            r1.zzi(r2, r7, r5)
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            r2.zzL(r7)
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            int r3 = r2.zzi()
            int r2 = r2.zzi()
            r5 = 829973609(0x31786469, float:3.6145826E-9)
            if (r3 != r5) goto L17f
            r0.zze = r4
            r0.zzo = r2
            goto L187
        L17f:
            long r3 = r28.zzf()
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.zzj = r3
        L187:
            return r7
        L188:
            long r13 = r0.zzm
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 == 0) goto L19a
            long r4 = r28.zzf()
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 != 0) goto L197
            goto L19a
        L197:
            r0.zzj = r13
            return r7
        L19a:
            com.google.android.gms.internal.ads.zzek r4 = r0.zza
            byte[] r4 = r4.zzN()
            r1.zzh(r4, r7, r3)
            r28.zzj()
            com.google.android.gms.internal.ads.zzek r4 = r0.zza
            r4.zzL(r7)
            com.google.android.gms.internal.ads.zzaes r4 = r0.zzb
            com.google.android.gms.internal.ads.zzek r5 = r0.zza
            r4.zza(r5)
            com.google.android.gms.internal.ads.zzek r4 = r0.zza
            com.google.android.gms.internal.ads.zzaes r5 = r0.zzb
            int r4 = r4.zzi()
            int r5 = r5.zza
            r8 = 1179011410(0x46464952, float:12690.33)
            if (r5 != r8) goto L1c5
            r1.zzk(r3)
            return r7
        L1c5:
            if (r5 != r10) goto L20d
            if (r4 == r11) goto L1ca
            goto L20d
        L1ca:
            long r3 = r28.zzf()
            r0.zzm = r3
            com.google.android.gms.internal.ads.zzaes r5 = r0.zzb
            int r5 = r5.zzb
            long r10 = (long) r5
            long r3 = r3 + r10
            long r3 = r3 + r16
            r0.zzn = r3
            boolean r5 = r0.zzp
            if (r5 != 0) goto L201
            com.google.android.gms.internal.ads.zzaeu r5 = r0.zzg
            java.util.Objects.requireNonNull(r5)
            int r5 = r5.zzb
            r2 = 16
            r5 = r5 & r2
            if (r5 == r2) goto L1fb
            com.google.android.gms.internal.ads.zzade r2 = r0.zzf
            com.google.android.gms.internal.ads.zzadz r3 = new com.google.android.gms.internal.ads.zzadz
            long r4 = r0.zzh
            r10 = 0
            r3.<init>(r4, r10)
            r2.zzO(r3)
            r0.zzp = r6
            goto L201
        L1fb:
            r2 = 4
            r0.zze = r2
            r0.zzj = r3
            return r7
        L201:
            long r1 = r28.zzf()
            r3 = 12
            long r1 = r1 + r3
            r0.zzj = r1
            r0.zze = r9
            return r7
        L20d:
            long r1 = r28.zzf()
            com.google.android.gms.internal.ads.zzaes r3 = r0.zzb
            int r3 = r3.zzb
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r16
            r0.zzj = r1
            return r7
        L21c:
            int r2 = r0.zzl
            int r2 = r2 + (-4)
            com.google.android.gms.internal.ads.zzek r3 = new com.google.android.gms.internal.ads.zzek
            r3.<init>(r2)
            byte[] r4 = r3.zzN()
            r1.zzi(r4, r7, r2)
            com.google.android.gms.internal.ads.zzaex r1 = com.google.android.gms.internal.ads.zzaex.zzc(r9, r3)
            int r2 = r1.zza()
            if (r2 != r9) goto L320
            java.lang.Class<com.google.android.gms.internal.ads.zzaeu> r2 = com.google.android.gms.internal.ads.zzaeu.class
            com.google.android.gms.internal.ads.zzaep r2 = r1.zzb(r2)
            com.google.android.gms.internal.ads.zzaeu r2 = (com.google.android.gms.internal.ads.zzaeu) r2
            if (r2 == 0) goto L318
            r0.zzg = r2
            int r3 = r2.zzc
            int r2 = r2.zza
            long r3 = (long) r3
            long r9 = (long) r2
            long r3 = r3 * r9
            r0.zzh = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.zzgax r1 = r1.zza
            int r3 = r1.size()
            r4 = 0
            r14 = 0
        L259:
            if (r4 >= r3) goto L304
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.ads.zzaep r5 = (com.google.android.gms.internal.ads.zzaep) r5
            int r9 = r5.zza()
            r10 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r9 != r10) goto L2fc
            com.google.android.gms.internal.ads.zzaex r5 = (com.google.android.gms.internal.ads.zzaex) r5
            int r9 = r14 + 1
            java.lang.Class<com.google.android.gms.internal.ads.zzaev> r10 = com.google.android.gms.internal.ads.zzaev.class
            com.google.android.gms.internal.ads.zzaep r10 = r5.zzb(r10)
            com.google.android.gms.internal.ads.zzaev r10 = (com.google.android.gms.internal.ads.zzaev) r10
            java.lang.Class<com.google.android.gms.internal.ads.zzaey> r13 = com.google.android.gms.internal.ads.zzaey.class
            com.google.android.gms.internal.ads.zzaep r13 = r5.zzb(r13)
            com.google.android.gms.internal.ads.zzaey r13 = (com.google.android.gms.internal.ads.zzaey) r13
            java.lang.String r15 = "AviExtractor"
            if (r10 != 0) goto L289
            java.lang.String r5 = "Missing Stream Header"
            com.google.android.gms.internal.ads.zzea.zzf(r15, r5)
            goto L2f6
        L289:
            if (r13 != 0) goto L291
            java.lang.String r5 = "Missing Stream Format"
            com.google.android.gms.internal.ads.zzea.zzf(r15, r5)
            goto L2f6
        L291:
            int r15 = r10.zzd
            int r8 = r10.zzb
            int r12 = r10.zzc
            com.google.android.gms.internal.ads.zzaf r13 = r13.zza
            long r7 = (long) r8
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r22 = r7 * r16
            long r7 = (long) r12
            java.math.RoundingMode r26 = java.math.RoundingMode.FLOOR
            long r11 = (long) r15
            r20 = r11
            r24 = r7
            long r7 = com.google.android.gms.internal.ads.zzeu.zzt(r20, r22, r24, r26)
            com.google.android.gms.internal.ads.zzad r11 = r13.zzb()
            r11.zzK(r14)
            int r12 = r10.zze
            if (r12 == 0) goto L2b9
            r11.zzQ(r12)
        L2b9:
            java.lang.Class<com.google.android.gms.internal.ads.zzaez> r12 = com.google.android.gms.internal.ads.zzaez.class
            com.google.android.gms.internal.ads.zzaep r5 = r5.zzb(r12)
            com.google.android.gms.internal.ads.zzaez r5 = (com.google.android.gms.internal.ads.zzaez) r5
            if (r5 == 0) goto L2c8
            java.lang.String r5 = r5.zza
            r11.zzN(r5)
        L2c8:
            java.lang.String r5 = r13.zzn
            int r5 = com.google.android.gms.internal.ads.zzbn.zzb(r5)
            if (r5 == r6) goto L2d7
            r12 = 2
            if (r5 != r12) goto L2d5
            r15 = 2
            goto L2d8
        L2d5:
            r8 = 0
            goto L2f6
        L2d7:
            r15 = r5
        L2d8:
            com.google.android.gms.internal.ads.zzade r5 = r0.zzf
            com.google.android.gms.internal.ads.zzaeh r5 = r5.zzw(r14, r15)
            com.google.android.gms.internal.ads.zzaf r11 = r11.zzaf()
            r5.zzl(r11)
            int r10 = r10.zzd
            com.google.android.gms.internal.ads.zzaew r11 = new com.google.android.gms.internal.ads.zzaew
            r13 = r11
            r16 = r7
            r18 = r10
            r19 = r5
            r13.<init>(r14, r15, r16, r18, r19)
            r0.zzh = r7
            r8 = r11
        L2f6:
            if (r8 == 0) goto L2fb
            r2.add(r8)
        L2fb:
            r14 = r9
        L2fc:
            int r4 = r4 + 1
            r7 = 0
            r8 = 0
            r11 = 2
            r12 = 3
            goto L259
        L304:
            r4 = 0
            com.google.android.gms.internal.ads.zzaew[] r1 = new com.google.android.gms.internal.ads.zzaew[r4]
            java.lang.Object[] r1 = r2.toArray(r1)
            com.google.android.gms.internal.ads.zzaew[] r1 = (com.google.android.gms.internal.ads.zzaew[]) r1
            r0.zzi = r1
            com.google.android.gms.internal.ads.zzade r1 = r0.zzf
            r1.zzD()
            r1 = 3
            r0.zze = r1
            return r4
        L318:
            java.lang.String r1 = "AviHeader not found"
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L320:
            r2 = r8
            int r1 = r1.zza()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected header list type "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L33b:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            r4 = 0
            r1.zzi(r2, r4, r3)
            com.google.android.gms.internal.ads.zzek r1 = r0.zza
            r1.zzL(r4)
            com.google.android.gms.internal.ads.zzaes r1 = r0.zzb
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            r1.zza(r2)
            int r3 = r1.zza
            if (r3 != r10) goto L381
            int r2 = r2.zzi()
            r1.zzc = r2
            com.google.android.gms.internal.ads.zzaes r1 = r0.zzb
            int r2 = r1.zzc
            if (r2 != r9) goto L36a
            int r1 = r1.zzb
            r0.zzl = r1
            r1 = 2
            r0.zze = r1
        L368:
            r1 = 0
            return r1
        L36a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "hdrl expected, found: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L381:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "LIST expected, found: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L398:
            r2 = r8
            boolean r4 = r27.zzi(r28)
            if (r4 == 0) goto L3a5
            r1.zzk(r3)
            r0.zze = r6
            goto L368
        L3a5:
            java.lang.String r1 = "AVI Header List not found"
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ com.google.android.gms.internal.ads.zzadb zzc() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ java.util.List zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(com.google.android.gms.internal.ads.zzade r3) {
            r2 = this;
            r0 = 0
            r2.zze = r0
            boolean r0 = r2.zzc
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzakt r0 = r2.zzd
            com.google.android.gms.internal.ads.zzakw r1 = new com.google.android.gms.internal.ads.zzakw
            r1.<init>(r3, r0)
            r3 = r1
        Lf:
            r2.zzf = r3
            r0 = -1
            r2.zzj = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r4, long r6) {
            r3 = this;
            r6 = -1
            r3.zzj = r6
            r6 = 0
            r3.zzk = r6
            com.google.android.gms.internal.ads.zzaew[] r6 = r3.zzi
            int r7 = r6.length
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r7) goto L16
            r2 = r6[r1]
            r2.zze(r4)
            int r1 = r1 + 1
            goto Lc
        L16:
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L26
            com.google.android.gms.internal.ads.zzaew[] r4 = r3.zzi
            int r4 = r4.length
            if (r4 != 0) goto L22
            goto L23
        L22:
            r0 = 3
        L23:
            r3.zze = r0
            return
        L26:
            r4 = 6
            r3.zze = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r4) throws java.io.IOException {
            r3 = this;
            com.google.android.gms.internal.ads.zzek r0 = r3.zza
            byte[] r0 = r0.zzN()
            r1 = 0
            r2 = 12
            r4.zzh(r0, r1, r2)
            com.google.android.gms.internal.ads.zzek r4 = r3.zza
            r4.zzL(r1)
            com.google.android.gms.internal.ads.zzek r4 = r3.zza
            int r4 = r4.zzi()
            r0 = 1179011410(0x46464952, float:12690.33)
            if (r4 == r0) goto L1d
            return r1
        L1d:
            com.google.android.gms.internal.ads.zzek r4 = r3.zza
            r0 = 4
            r4.zzM(r0)
            com.google.android.gms.internal.ads.zzek r4 = r3.zza
            int r4 = r4.zzi()
            r0 = 541677121(0x20495641, float:1.7053901E-19)
            if (r4 != r0) goto L30
            r4 = 1
            return r4
        L30:
            return r1
    }
}
