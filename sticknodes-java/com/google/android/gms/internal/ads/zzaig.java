package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaig implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final com.google.android.gms.internal.ads.zzadt zzb;
    private final com.google.android.gms.internal.ads.zzadp zzc;
    private final com.google.android.gms.internal.ads.zzadr zzd;
    private final com.google.android.gms.internal.ads.zzaeh zze;
    private com.google.android.gms.internal.ads.zzade zzf;
    private com.google.android.gms.internal.ads.zzaeh zzg;
    private com.google.android.gms.internal.ads.zzaeh zzh;
    private int zzi;
    private com.google.android.gms.internal.ads.zzbk zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private com.google.android.gms.internal.ads.zzaii zzo;
    private boolean zzp;

    public zzaig() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzaig(int r3) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzek r3 = new com.google.android.gms.internal.ads.zzek
            r0 = 10
            r3.<init>(r0)
            r2.zza = r3
            com.google.android.gms.internal.ads.zzadt r3 = new com.google.android.gms.internal.ads.zzadt
            r3.<init>()
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzadp r3 = new com.google.android.gms.internal.ads.zzadp
            r3.<init>()
            r2.zzc = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzk = r0
            com.google.android.gms.internal.ads.zzadr r3 = new com.google.android.gms.internal.ads.zzadr
            r3.<init>()
            r2.zzd = r3
            com.google.android.gms.internal.ads.zzacw r3 = new com.google.android.gms.internal.ads.zzacw
            r3.<init>()
            r2.zze = r3
            r2.zzh = r3
            return
    }

    private final int zzg(com.google.android.gms.internal.ads.zzadc r35) throws java.io.IOException {
            r34 = this;
            r0 = r34
            r1 = r35
            int r2 = r0.zzi
            r3 = -1
            r4 = 0
            if (r2 != 0) goto Lf
            r0.zzl(r1, r4)     // Catch: java.io.EOFException -> Le
            goto Lf
        Le:
            return r3
        Lf:
            com.google.android.gms.internal.ads.zzaii r2 = r0.zzo
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L256
            com.google.android.gms.internal.ads.zzadt r2 = r0.zzb
            com.google.android.gms.internal.ads.zzek r14 = new com.google.android.gms.internal.ads.zzek
            int r2 = r2.zzc
            r14.<init>(r2)
            byte[] r2 = r14.zzN()
            com.google.android.gms.internal.ads.zzadt r9 = r0.zzb
            int r9 = r9.zzc
            r1.zzh(r2, r4, r9)
            com.google.android.gms.internal.ads.zzadt r2 = r0.zzb
            int r9 = r2.zza
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L3f
            int r2 = r2.zze
            if (r2 == r8) goto L46
            r11 = 36
            goto L46
        L3f:
            int r2 = r2.zze
            if (r2 == r8) goto L44
            goto L46
        L44:
            r11 = 13
        L46:
            int r2 = r14.zze()
            int r9 = r11 + 4
            r12 = 1231971951(0x496e666f, float:976486.94)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r15 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r2 < r9) goto L66
            r14.zzL(r11)
            int r2 = r14.zzg()
            if (r2 == r15) goto L7c
            if (r2 != r12) goto L66
            r2 = 1231971951(0x496e666f, float:976486.94)
            goto L7c
        L66:
            int r2 = r14.zze()
            r9 = 40
            if (r2 < r9) goto L7b
            r14.zzL(r10)
            int r2 = r14.zzg()
            if (r2 != r13) goto L7b
            r2 = 1447187017(0x56425249, float:5.3414667E13)
            goto L7c
        L7b:
            r2 = 0
        L7c:
            if (r2 == r12) goto L9f
            if (r2 == r13) goto L88
            if (r2 == r15) goto L9f
            r35.zzj()
        L85:
            r2 = 0
            goto L161
        L88:
            long r9 = r35.zzd()
            long r11 = r35.zzf()
            com.google.android.gms.internal.ads.zzadt r13 = r0.zzb
            com.google.android.gms.internal.ads.zzaij r2 = com.google.android.gms.internal.ads.zzaij.zzb(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.zzadt r9 = r0.zzb
            int r9 = r9.zzc
            r1.zzk(r9)
            goto L161
        L9f:
            com.google.android.gms.internal.ads.zzadt r9 = r0.zzb
            com.google.android.gms.internal.ads.zzaik r9 = com.google.android.gms.internal.ads.zzaik.zzb(r9, r14)
            com.google.android.gms.internal.ads.zzadp r10 = r0.zzc
            boolean r11 = r10.zza()
            if (r11 != 0) goto Lb9
            int r11 = r9.zzd
            if (r11 == r3) goto Lb9
            int r12 = r9.zze
            if (r12 == r3) goto Lb9
            r10.zza = r11
            r10.zzb = r12
        Lb9:
            long r10 = r35.zzf()
            long r12 = r35.zzd()
            r16 = -1
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 == 0) goto Lfd
            long r12 = r9.zzc
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 == 0) goto Lfd
            long r18 = r35.zzd()
            long r12 = r12 + r10
            int r14 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r14 == 0) goto Lfd
            long r7 = r35.zzd()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r3 = "Data size mismatch between stream ("
            r14.append(r3)
            r14.append(r7)
            java.lang.String r3 = ") and Xing frame ("
            r14.append(r3)
            r14.append(r12)
            java.lang.String r3 = "), using Xing value."
            r14.append(r3)
            java.lang.String r3 = r14.toString()
            java.lang.String r7 = "Mp3Extractor"
            com.google.android.gms.internal.ads.zzea.zze(r7, r3)
        Lfd:
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzb
            int r3 = r3.zzc
            r1.zzk(r3)
            if (r2 != r15) goto L10b
            com.google.android.gms.internal.ads.zzail r2 = com.google.android.gms.internal.ads.zzail.zzb(r9, r10)
            goto L161
        L10b:
            long r2 = r35.zzd()
            long r24 = r9.zza()
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 != 0) goto L119
            goto L85
        L119:
            long r7 = r9.zzc
            int r12 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r12 == 0) goto L12a
            long r2 = r10 + r7
            com.google.android.gms.internal.ads.zzadt r12 = r9.zza
            int r12 = r12.zzc
        L125:
            long r12 = (long) r12
            long r7 = r7 - r12
            r27 = r2
            goto L135
        L12a:
            int r7 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r7 == 0) goto L85
            long r7 = r2 - r10
            com.google.android.gms.internal.ads.zzadt r12 = r9.zza
            int r12 = r12.zzc
            goto L125
        L135:
            r22 = 8000000(0x7a1200, double:3.952525E-317)
            java.math.RoundingMode r26 = java.math.RoundingMode.HALF_UP
            r20 = r7
            long r2 = com.google.android.gms.internal.ads.zzeu.zzt(r20, r22, r24, r26)
            int r31 = com.google.android.gms.internal.ads.zzgdu.zzb(r2)
            long r2 = r9.zzb
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_UP
            long r2 = com.google.android.gms.internal.ads.zzgdp.zzb(r7, r2, r12)
            int r32 = com.google.android.gms.internal.ads.zzgdu.zzb(r2)
            com.google.android.gms.internal.ads.zzadt r2 = r9.zza
            com.google.android.gms.internal.ads.zzaid r3 = new com.google.android.gms.internal.ads.zzaid
            int r2 = r2.zzc
            long r7 = (long) r2
            long r29 = r10 + r7
            r33 = 0
            r26 = r3
            r26.<init>(r27, r29, r31, r32, r33)
            r2 = r3
        L161:
            com.google.android.gms.internal.ads.zzbk r3 = r0.zzj
            long r7 = r35.zzf()
            if (r3 == 0) goto L1b2
            int r9 = r3.zza()
            r10 = 0
        L16e:
            if (r10 >= r9) goto L1b2
            com.google.android.gms.internal.ads.zzbj r11 = r3.zzb(r10)
            boolean r12 = r11 instanceof com.google.android.gms.internal.ads.zzaha
            if (r12 == 0) goto L1af
            com.google.android.gms.internal.ads.zzaha r11 = (com.google.android.gms.internal.ads.zzaha) r11
            int r9 = r3.zza()
            r10 = 0
        L17f:
            if (r10 >= r9) goto L1a9
            com.google.android.gms.internal.ads.zzbj r12 = r3.zzb(r10)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.zzahe
            if (r13 == 0) goto L1a6
            com.google.android.gms.internal.ads.zzahe r12 = (com.google.android.gms.internal.ads.zzahe) r12
            java.lang.String r13 = r12.zzf
            java.lang.String r14 = "TLEN"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L1a6
            com.google.android.gms.internal.ads.zzgax r3 = r12.zzb
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            long r9 = java.lang.Long.parseLong(r3)
            long r9 = com.google.android.gms.internal.ads.zzeu.zzr(r9)
            goto L1aa
        L1a6:
            int r10 = r10 + 1
            goto L17f
        L1a9:
            r9 = r5
        L1aa:
            com.google.android.gms.internal.ads.zzaif r3 = com.google.android.gms.internal.ads.zzaif.zzb(r7, r11, r9)
            goto L1b3
        L1af:
            int r10 = r10 + 1
            goto L16e
        L1b2:
            r3 = 0
        L1b3:
            boolean r7 = r0.zzp
            if (r7 == 0) goto L1bd
            com.google.android.gms.internal.ads.zzaih r2 = new com.google.android.gms.internal.ads.zzaih
            r2.<init>()
            goto L1f9
        L1bd:
            if (r3 == 0) goto L1c1
            r2 = r3
            goto L1c4
        L1c1:
            if (r2 != 0) goto L1c4
            r2 = 0
        L1c4:
            if (r2 == 0) goto L1ca
            r2.zzh()
            goto L1f9
        L1ca:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            r3 = 4
            r1.zzh(r2, r4, r3)
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            r2.zzL(r4)
            com.google.android.gms.internal.ads.zzadt r2 = r0.zzb
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            int r3 = r3.zzg()
            r2.zza(r3)
            com.google.android.gms.internal.ads.zzaid r2 = new com.google.android.gms.internal.ads.zzaid
            long r8 = r35.zzd()
            long r10 = r35.zzf()
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzb
            int r12 = r3.zzf
            int r13 = r3.zzc
            r14 = 0
            r7 = r2
            r7.<init>(r8, r10, r12, r13, r14)
        L1f9:
            r0.zzo = r2
            com.google.android.gms.internal.ads.zzade r3 = r0.zzf
            r3.zzO(r2)
            com.google.android.gms.internal.ads.zzad r2 = new com.google.android.gms.internal.ads.zzad
            r2.<init>()
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzb
            java.lang.String r3 = r3.zzb
            r2.zzZ(r3)
            r3 = 4096(0x1000, float:5.74E-42)
            r2.zzQ(r3)
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzb
            int r3 = r3.zze
            r2.zzz(r3)
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzb
            int r3 = r3.zzd
            r2.zzaa(r3)
            com.google.android.gms.internal.ads.zzadp r3 = r0.zzc
            int r3 = r3.zza
            r2.zzG(r3)
            com.google.android.gms.internal.ads.zzadp r3 = r0.zzc
            int r3 = r3.zzb
            r2.zzH(r3)
            com.google.android.gms.internal.ads.zzbk r3 = r0.zzj
            r2.zzS(r3)
            com.google.android.gms.internal.ads.zzaii r3 = r0.zzo
            int r3 = r3.zzc()
            r7 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r3 == r7) goto L246
            com.google.android.gms.internal.ads.zzaii r3 = r0.zzo
            int r3 = r3.zzc()
            r2.zzy(r3)
        L246:
            com.google.android.gms.internal.ads.zzaeh r3 = r0.zzh
            com.google.android.gms.internal.ads.zzaf r2 = r2.zzaf()
            r3.zzl(r2)
            long r2 = r35.zzf()
            r0.zzm = r2
            goto L26b
        L256:
            long r2 = r0.zzm
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 == 0) goto L26b
            long r7 = r35.zzf()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 >= 0) goto L26b
            long r2 = r2 - r7
            int r3 = (int) r2
            r1.zzk(r3)
        L26b:
            int r2 = r0.zzn
            if (r2 != 0) goto L2ce
            r35.zzj()
            boolean r2 = r34.zzk(r35)
            if (r2 == 0) goto L279
            goto L2d8
        L279:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            r2.zzL(r4)
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            int r2 = r2.zzg()
            int r3 = r0.zzi
            long r7 = (long) r3
            boolean r3 = zzj(r2, r7)
            if (r3 == 0) goto L2c7
            int r3 = com.google.android.gms.internal.ads.zzadu.zzb(r2)
            r7 = -1
            if (r3 != r7) goto L295
            goto L2c7
        L295:
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzb
            r3.zza(r2)
            long r2 = r0.zzk
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L2ac
            com.google.android.gms.internal.ads.zzaii r2 = r0.zzo
            long r5 = r35.zzf()
            long r2 = r2.zze(r5)
            r0.zzk = r2
        L2ac:
            com.google.android.gms.internal.ads.zzadt r2 = r0.zzb
            int r3 = r2.zzc
            r0.zzn = r3
            com.google.android.gms.internal.ads.zzaii r5 = r0.zzo
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzaie
            if (r6 != 0) goto L2ba
            r2 = r3
            goto L2ce
        L2ba:
            com.google.android.gms.internal.ads.zzaie r5 = (com.google.android.gms.internal.ads.zzaie) r5
            long r3 = r0.zzl
            int r1 = r2.zzg
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.zzh(r3)
            r1 = 0
            throw r1
        L2c7:
            r3 = 1
            r1.zzk(r3)
            r0.zzi = r4
            goto L2e1
        L2ce:
            r3 = 1
            com.google.android.gms.internal.ads.zzaeh r5 = r0.zzh
            int r1 = r5.zzf(r1, r2, r3)
            r2 = -1
            if (r1 != r2) goto L2da
        L2d8:
            r3 = -1
            goto L2e2
        L2da:
            int r2 = r0.zzn
            int r2 = r2 - r1
            r0.zzn = r2
            if (r2 <= 0) goto L2e3
        L2e1:
            r3 = 0
        L2e2:
            return r3
        L2e3:
            com.google.android.gms.internal.ads.zzaeh r5 = r0.zzh
            long r1 = r0.zzl
            long r6 = r0.zzh(r1)
            r8 = 1
            com.google.android.gms.internal.ads.zzadt r1 = r0.zzb
            int r9 = r1.zzc
            r10 = 0
            r11 = 0
            r5.zzs(r6, r8, r9, r10, r11)
            long r1 = r0.zzl
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzb
            int r3 = r3.zzg
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.zzl = r1
            r0.zzn = r4
            return r4
    }

    private final long zzh(long r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzadt r0 = r7.zzb
            long r1 = r7.zzk
            int r0 = r0.zzd
            long r3 = (long) r0
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r5
            long r8 = r8 / r3
            long r1 = r1 + r8
            return r1
    }

    private static boolean zzj(int r4, long r5) {
            r0 = -128000(0xfffffffffffe0c00, float:NaN)
            r4 = r4 & r0
            long r0 = (long) r4
            r2 = -128000(0xfffffffffffe0c00, double:NaN)
            long r4 = r5 & r2
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            r4 = 1
            return r4
        L10:
            r4 = 0
            return r4
    }

    private final boolean zzk(com.google.android.gms.internal.ads.zzadc r9) throws java.io.IOException {
            r8 = this;
            com.google.android.gms.internal.ads.zzaii r0 = r8.zzo
            r1 = 1
            if (r0 == 0) goto L1c
            long r2 = r0.zzd()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1c
            long r4 = r9.zze()
            r6 = -4
            long r2 = r2 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L1b
            goto L1c
        L1b:
            return r1
        L1c:
            com.google.android.gms.internal.ads.zzek r0 = r8.zza     // Catch: java.io.EOFException -> L2c
            byte[] r0 = r0.zzN()     // Catch: java.io.EOFException -> L2c
            r2 = 4
            r3 = 0
            boolean r9 = r9.zzm(r0, r3, r2, r1)     // Catch: java.io.EOFException -> L2c
            if (r9 != 0) goto L2b
            return r1
        L2b:
            return r3
        L2c:
            return r1
    }

    private final boolean zzl(com.google.android.gms.internal.ads.zzadc r11, boolean r12) throws java.io.IOException {
            r10 = this;
            r11.zzj()
            long r0 = r11.zzf()
            r2 = 0
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L2a
            com.google.android.gms.internal.ads.zzadr r0 = r10.zzd
            com.google.android.gms.internal.ads.zzbk r0 = r0.zza(r11, r2)
            r10.zzj = r0
            if (r0 == 0) goto L1e
            com.google.android.gms.internal.ads.zzadp r1 = r10.zzc
            r1.zzb(r0)
        L1e:
            long r0 = r11.zze()
            int r1 = (int) r0
            if (r12 != 0) goto L28
            r11.zzk(r1)
        L28:
            r0 = 0
            goto L2c
        L2a:
            r0 = 0
            r1 = 0
        L2c:
            r4 = 0
            r5 = 0
        L2e:
            boolean r6 = r10.zzk(r11)
            r7 = 1
            if (r6 == 0) goto L3e
            if (r4 <= 0) goto L38
            goto L8f
        L38:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
        L3e:
            com.google.android.gms.internal.ads.zzek r6 = r10.zza
            r6.zzL(r3)
            com.google.android.gms.internal.ads.zzek r6 = r10.zza
            int r6 = r6.zzg()
            if (r0 == 0) goto L52
            long r8 = (long) r0
            boolean r8 = zzj(r6, r8)
            if (r8 == 0) goto L59
        L52:
            int r8 = com.google.android.gms.internal.ads.zzadu.zzb(r6)
            r9 = -1
            if (r8 != r9) goto L81
        L59:
            if (r7 == r12) goto L5e
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L61
        L5e:
            r0 = 32768(0x8000, float:4.5918E-41)
        L61:
            int r4 = r5 + 1
            if (r5 != r0) goto L6f
            if (r12 == 0) goto L68
            return r3
        L68:
            java.lang.String r11 = "Searched too many bytes."
            com.google.android.gms.internal.ads.zzbo r11 = com.google.android.gms.internal.ads.zzbo.zza(r11, r2)
            throw r11
        L6f:
            if (r12 == 0) goto L7a
            r11.zzj()
            int r0 = r1 + r4
            r11.zzg(r0)
            goto L7d
        L7a:
            r11.zzk(r7)
        L7d:
            r5 = r4
            r0 = 0
            r4 = 0
            goto L2e
        L81:
            int r4 = r4 + 1
            if (r4 != r7) goto L8c
            com.google.android.gms.internal.ads.zzadt r0 = r10.zzb
            r0.zza(r6)
            r0 = r6
            goto L9c
        L8c:
            r6 = 4
            if (r4 != r6) goto L9c
        L8f:
            if (r12 == 0) goto L96
            int r1 = r1 + r5
            r11.zzk(r1)
            goto L99
        L96:
            r11.zzj()
        L99:
            r10.zzi = r0
            return r7
        L9c:
            int r8 = r8 + (-4)
            r11.zzg(r8)
            goto L2e
    }

    public final void zza() {
            r1 = this;
            r0 = 1
            r1.zzp = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r5, com.google.android.gms.internal.ads.zzadx r6) throws java.io.IOException {
            r4 = this;
            com.google.android.gms.internal.ads.zzaeh r6 = r4.zzg
            com.google.android.gms.internal.ads.zzdi.zzb(r6)
            int r6 = com.google.android.gms.internal.ads.zzeu.zza
            int r5 = r4.zzg(r5)
            r6 = -1
            if (r5 != r6) goto L2b
            com.google.android.gms.internal.ads.zzaii r6 = r4.zzo
            boolean r6 = r6 instanceof com.google.android.gms.internal.ads.zzaie
            if (r6 == 0) goto L2b
            long r0 = r4.zzl
            long r0 = r4.zzh(r0)
            com.google.android.gms.internal.ads.zzaii r6 = r4.zzo
            long r2 = r6.zza()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L25
            goto L2b
        L25:
            com.google.android.gms.internal.ads.zzaii r5 = r4.zzo
            com.google.android.gms.internal.ads.zzaie r5 = (com.google.android.gms.internal.ads.zzaie) r5
            r5 = 0
            throw r5
        L2b:
            return r5
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
            r2.zzf = r3
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.ads.zzaeh r3 = r3.zzw(r0, r1)
            r2.zzg = r3
            r2.zzh = r3
            com.google.android.gms.internal.ads.zzade r3 = r2.zzf
            r3.zzD()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.zzi = r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzk = r2
            r2 = 0
            r0.zzl = r2
            r0.zzn = r1
            com.google.android.gms.internal.ads.zzaii r1 = r0.zzo
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzaie
            if (r2 != 0) goto L17
            return
        L17:
            com.google.android.gms.internal.ads.zzaie r1 = (com.google.android.gms.internal.ads.zzaie) r1
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            boolean r2 = r1.zzl(r2, r0)
            return r2
    }
}
