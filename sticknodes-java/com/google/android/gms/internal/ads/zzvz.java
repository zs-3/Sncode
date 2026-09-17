package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzvz implements com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzade, com.google.android.gms.internal.ads.zzzg, com.google.android.gms.internal.ads.zzzl, com.google.android.gms.internal.ads.zzwl {
    private static final java.util.Map zzb = null;
    private static final com.google.android.gms.internal.ads.zzaf zzc = null;
    private com.google.android.gms.internal.ads.zzaea zzA;
    private long zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private boolean zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    private final com.google.android.gms.internal.ads.zzza zzO;
    private final android.net.Uri zzd;
    private final com.google.android.gms.internal.ads.zzgg zze;
    private final com.google.android.gms.internal.ads.zzrv zzf;
    private final com.google.android.gms.internal.ads.zzvh zzg;
    private final com.google.android.gms.internal.ads.zzrq zzh;
    private final com.google.android.gms.internal.ads.zzvv zzi;
    private final long zzj;
    private final long zzk;
    private final com.google.android.gms.internal.ads.zzzo zzl;
    private final com.google.android.gms.internal.ads.zzvo zzm;
    private final com.google.android.gms.internal.ads.zzdm zzn;
    private final java.lang.Runnable zzo;
    private final java.lang.Runnable zzp;
    private final android.os.Handler zzq;
    private com.google.android.gms.internal.ads.zzuv zzr;
    private com.google.android.gms.internal.ads.zzagf zzs;
    private com.google.android.gms.internal.ads.zzwm[] zzt;
    private com.google.android.gms.internal.ads.zzvx[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private com.google.android.gms.internal.ads.zzvy zzz;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "Icy-MetaData"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.android.gms.internal.ads.zzvz.zzb = r0
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r1 = "icy"
            r0.zzL(r1)
            java.lang.String r1 = "application/x-icy"
            r0.zzZ(r1)
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzaf()
            com.google.android.gms.internal.ads.zzvz.zzc = r0
            return
    }

    public zzvz(android.net.Uri r1, com.google.android.gms.internal.ads.zzgg r2, com.google.android.gms.internal.ads.zzvo r3, com.google.android.gms.internal.ads.zzrv r4, com.google.android.gms.internal.ads.zzrq r5, com.google.android.gms.internal.ads.zzze r6, com.google.android.gms.internal.ads.zzvh r7, com.google.android.gms.internal.ads.zzvv r8, com.google.android.gms.internal.ads.zzza r9, java.lang.String r10, int r11, long r12) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            r0.zze = r2
            r0.zzf = r4
            r0.zzh = r5
            r0.zzg = r7
            r0.zzi = r8
            r0.zzO = r9
            long r1 = (long) r11
            r0.zzj = r1
            com.google.android.gms.internal.ads.zzzo r1 = new com.google.android.gms.internal.ads.zzzo
            java.lang.String r2 = "ProgressiveMediaPeriod"
            r1.<init>(r2)
            r0.zzl = r1
            r0.zzm = r3
            r0.zzk = r12
            com.google.android.gms.internal.ads.zzdm r1 = new com.google.android.gms.internal.ads.zzdm
            com.google.android.gms.internal.ads.zzdj r2 = com.google.android.gms.internal.ads.zzdj.zza
            r1.<init>(r2)
            r0.zzn = r1
            com.google.android.gms.internal.ads.zzvq r1 = new com.google.android.gms.internal.ads.zzvq
            r1.<init>(r0)
            r0.zzo = r1
            com.google.android.gms.internal.ads.zzvr r1 = new com.google.android.gms.internal.ads.zzvr
            r1.<init>(r0)
            r0.zzp = r1
            r1 = 0
            android.os.Handler r1 = com.google.android.gms.internal.ads.zzeu.zzx(r1)
            r0.zzq = r1
            r1 = 0
            com.google.android.gms.internal.ads.zzvx[] r2 = new com.google.android.gms.internal.ads.zzvx[r1]
            r0.zzu = r2
            com.google.android.gms.internal.ads.zzwm[] r1 = new com.google.android.gms.internal.ads.zzwm[r1]
            r0.zzt = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzJ = r1
            r1 = 1
            r0.zzD = r1
            return
    }

    public static /* synthetic */ void zzA(com.google.android.gms.internal.ads.zzvz r0) {
            r0.zzU()
            return
    }

    static /* bridge */ /* synthetic */ void zzB(com.google.android.gms.internal.ads.zzvz r0, com.google.android.gms.internal.ads.zzagf r1) {
            r0.zzs = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzC(com.google.android.gms.internal.ads.zzvz r1) {
            com.google.android.gms.internal.ads.zzvp r0 = new com.google.android.gms.internal.ads.zzvp
            r0.<init>(r1)
            android.os.Handler r1 = r1.zzq
            r1.post(r0)
            return
    }

    private final int zzQ() {
            r5 = this;
            com.google.android.gms.internal.ads.zzwm[] r0 = r5.zzt
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r2 >= r1) goto L11
            r4 = r0[r2]
            int r4 = r4.zzd()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L5
        L11:
            return r3
    }

    private final long zzR(boolean r6) {
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.zzwm[] r3 = r5.zzt
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.zzvy r4 = r5.zzz
            java.util.Objects.requireNonNull(r4)
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzh()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
    }

    private final com.google.android.gms.internal.ads.zzaeh zzS(com.google.android.gms.internal.ads.zzvx r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzwm[] r0 = r5.zzt
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L18
            com.google.android.gms.internal.ads.zzvx[] r2 = r5.zzu
            r2 = r2[r1]
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L15
            com.google.android.gms.internal.ads.zzwm[] r6 = r5.zzt
            r6 = r6[r1]
            return r6
        L15:
            int r1 = r1 + 1
            goto L4
        L18:
            boolean r1 = r5.zzv
            if (r1 == 0) goto L3f
            int r6 = r6.zza
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Extractor added new track (id="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ") after finishing tracks."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ProgressiveMediaPeriod"
            com.google.android.gms.internal.ads.zzea.zzf(r0, r6)
            com.google.android.gms.internal.ads.zzacw r6 = new com.google.android.gms.internal.ads.zzacw
            r6.<init>()
            return r6
        L3f:
            com.google.android.gms.internal.ads.zzza r1 = r5.zzO
            com.google.android.gms.internal.ads.zzrv r2 = r5.zzf
            com.google.android.gms.internal.ads.zzrq r3 = r5.zzh
            com.google.android.gms.internal.ads.zzwm r4 = new com.google.android.gms.internal.ads.zzwm
            r4.<init>(r1, r2, r3)
            r4.zzu(r5)
            com.google.android.gms.internal.ads.zzvx[] r1 = r5.zzu
            int r2 = r0 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            com.google.android.gms.internal.ads.zzvx[] r1 = (com.google.android.gms.internal.ads.zzvx[]) r1
            r1[r0] = r6
            int r6 = com.google.android.gms.internal.ads.zzeu.zza
            r5.zzu = r1
            com.google.android.gms.internal.ads.zzwm[] r6 = r5.zzt
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            com.google.android.gms.internal.ads.zzwm[] r6 = (com.google.android.gms.internal.ads.zzwm[]) r6
            r6[r0] = r4
            r5.zzt = r6
            return r4
    }

    private final void zzT() {
            r1 = this;
            boolean r0 = r1.zzw
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            com.google.android.gms.internal.ads.zzvy r0 = r1.zzz
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzaea r0 = r1.zzA
            java.util.Objects.requireNonNull(r0)
            return
    }

    private final void zzU() {
            r14 = this;
            boolean r0 = r14.zzN
            if (r0 != 0) goto L112
            boolean r0 = r14.zzw
            if (r0 != 0) goto L112
            boolean r0 = r14.zzv
            if (r0 == 0) goto L112
            com.google.android.gms.internal.ads.zzaea r0 = r14.zzA
            if (r0 != 0) goto L12
            goto L112
        L12:
            com.google.android.gms.internal.ads.zzwm[] r0 = r14.zzt
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L17:
            if (r3 >= r1) goto L24
            r4 = r0[r3]
            com.google.android.gms.internal.ads.zzaf r4 = r4.zzi()
            if (r4 == 0) goto L112
            int r3 = r3 + 1
            goto L17
        L24:
            com.google.android.gms.internal.ads.zzdm r0 = r14.zzn
            r0.zzc()
            com.google.android.gms.internal.ads.zzwm[] r0 = r14.zzt
            int r0 = r0.length
            com.google.android.gms.internal.ads.zzcd[] r1 = new com.google.android.gms.internal.ads.zzcd[r0]
            boolean[] r3 = new boolean[r0]
            r4 = 0
        L31:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            if (r4 >= r0) goto Ld6
            com.google.android.gms.internal.ads.zzwm[] r8 = r14.zzt
            r8 = r8[r4]
            com.google.android.gms.internal.ads.zzaf r8 = r8.zzi()
            java.util.Objects.requireNonNull(r8)
            java.lang.String r9 = r8.zzn
            boolean r10 = com.google.android.gms.internal.ads.zzbn.zzg(r9)
            if (r10 != 0) goto L55
            boolean r11 = com.google.android.gms.internal.ads.zzbn.zzi(r9)
            if (r11 == 0) goto L53
            goto L55
        L53:
            r11 = 0
            goto L56
        L55:
            r11 = 1
        L56:
            r3[r4] = r11
            boolean r12 = r14.zzx
            r11 = r11 | r12
            r14.zzx = r11
            boolean r9 = com.google.android.gms.internal.ads.zzbn.zzh(r9)
            long r11 = r14.zzk
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 == 0) goto L6d
            if (r0 != r7) goto L6d
            if (r9 == 0) goto L6d
            r9 = 1
            goto L6e
        L6d:
            r9 = 0
        L6e:
            r14.zzy = r9
            com.google.android.gms.internal.ads.zzagf r9 = r14.zzs
            if (r9 == 0) goto Lb9
            if (r10 != 0) goto L7e
            com.google.android.gms.internal.ads.zzvx[] r11 = r14.zzu
            r11 = r11[r4]
            boolean r11 = r11.zzb
            if (r11 == 0) goto L9f
        L7e:
            com.google.android.gms.internal.ads.zzbk r11 = r8.zzk
            if (r11 != 0) goto L8c
            com.google.android.gms.internal.ads.zzbk r11 = new com.google.android.gms.internal.ads.zzbk
            com.google.android.gms.internal.ads.zzbj[] r12 = new com.google.android.gms.internal.ads.zzbj[r7]
            r12[r2] = r9
            r11.<init>(r5, r12)
            goto L94
        L8c:
            com.google.android.gms.internal.ads.zzbj[] r5 = new com.google.android.gms.internal.ads.zzbj[r7]
            r5[r2] = r9
            com.google.android.gms.internal.ads.zzbk r11 = r11.zzc(r5)
        L94:
            com.google.android.gms.internal.ads.zzad r5 = r8.zzb()
            r5.zzS(r11)
            com.google.android.gms.internal.ads.zzaf r8 = r5.zzaf()
        L9f:
            if (r10 == 0) goto Lb9
            int r5 = r8.zzg
            r6 = -1
            if (r5 != r6) goto Lb9
            int r5 = r8.zzh
            if (r5 != r6) goto Lb9
            int r5 = r9.zza
            if (r5 == r6) goto Lb9
            com.google.android.gms.internal.ads.zzad r6 = r8.zzb()
            r6.zzy(r5)
            com.google.android.gms.internal.ads.zzaf r8 = r6.zzaf()
        Lb9:
            com.google.android.gms.internal.ads.zzrv r5 = r14.zzf
            int r5 = r5.zza(r8)
            com.google.android.gms.internal.ads.zzaf r5 = r8.zzc(r5)
            com.google.android.gms.internal.ads.zzcd r6 = new com.google.android.gms.internal.ads.zzcd
            java.lang.String r8 = java.lang.Integer.toString(r4)
            com.google.android.gms.internal.ads.zzaf[] r7 = new com.google.android.gms.internal.ads.zzaf[r7]
            r7[r2] = r5
            r6.<init>(r8, r7)
            r1[r4] = r6
            int r4 = r4 + 1
            goto L31
        Ld6:
            com.google.android.gms.internal.ads.zzvy r0 = new com.google.android.gms.internal.ads.zzvy
            com.google.android.gms.internal.ads.zzwy r2 = new com.google.android.gms.internal.ads.zzwy
            r2.<init>(r1)
            r0.<init>(r2, r3)
            r14.zzz = r0
            boolean r0 = r14.zzy
            if (r0 == 0) goto Lf9
            long r0 = r14.zzB
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto Lf9
            long r0 = r14.zzk
            r14.zzB = r0
            com.google.android.gms.internal.ads.zzvt r0 = new com.google.android.gms.internal.ads.zzvt
            com.google.android.gms.internal.ads.zzaea r1 = r14.zzA
            r0.<init>(r14, r1)
            r14.zzA = r0
        Lf9:
            com.google.android.gms.internal.ads.zzvv r0 = r14.zzi
            long r1 = r14.zzB
            com.google.android.gms.internal.ads.zzaea r3 = r14.zzA
            boolean r3 = r3.zzh()
            boolean r4 = r14.zzC
            r0.zza(r1, r3, r4)
            r14.zzw = r7
            com.google.android.gms.internal.ads.zzuv r0 = r14.zzr
            java.util.Objects.requireNonNull(r0)
            r0.zzh(r14)
        L112:
            return
    }

    private final void zzV(int r15) {
            r14 = this;
            r14.zzT()
            com.google.android.gms.internal.ads.zzvy r0 = r14.zzz
            boolean[] r1 = r0.zzd
            boolean r2 = r1[r15]
            if (r2 != 0) goto L38
            com.google.android.gms.internal.ads.zzwy r0 = r0.zza
            com.google.android.gms.internal.ads.zzcd r0 = r0.zzb(r15)
            r2 = 0
            com.google.android.gms.internal.ads.zzaf r6 = r0.zzb(r2)
            com.google.android.gms.internal.ads.zzvh r0 = r14.zzg
            java.lang.String r2 = r6.zzn
            int r5 = com.google.android.gms.internal.ads.zzbn.zzb(r2)
            long r2 = r14.zzI
            com.google.android.gms.internal.ads.zzuu r13 = new com.google.android.gms.internal.ads.zzuu
            r4 = 1
            r7 = 0
            r8 = 0
            long r9 = com.google.android.gms.internal.ads.zzeu.zzu(r2)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            r0.zzc(r13)
            r0 = 1
            r1[r15] = r0
        L38:
            return
    }

    private final void zzW(int r5) {
            r4 = this;
            r4.zzT()
            com.google.android.gms.internal.ads.zzvy r0 = r4.zzz
            boolean[] r0 = r0.zzb
            boolean r1 = r4.zzK
            if (r1 == 0) goto L3e
            boolean r0 = r0[r5]
            if (r0 == 0) goto L3e
            com.google.android.gms.internal.ads.zzwm[] r0 = r4.zzt
            r5 = r0[r5]
            r0 = 0
            boolean r5 = r5.zzx(r0)
            if (r5 == 0) goto L1b
            goto L3e
        L1b:
            r1 = 0
            r4.zzJ = r1
            r4.zzK = r0
            r5 = 1
            r4.zzF = r5
            r4.zzI = r1
            r4.zzL = r0
            com.google.android.gms.internal.ads.zzwm[] r5 = r4.zzt
            int r1 = r5.length
            r2 = 0
        L2c:
            if (r2 >= r1) goto L36
            r3 = r5[r2]
            r3.zzp(r0)
            int r2 = r2 + 1
            goto L2c
        L36:
            com.google.android.gms.internal.ads.zzuv r5 = r4.zzr
            java.util.Objects.requireNonNull(r5)
            r5.zzf(r4)
        L3e:
            return
    }

    private final void zzX() {
            r18 = this;
            r7 = r18
            android.net.Uri r2 = r7.zzd
            com.google.android.gms.internal.ads.zzgg r3 = r7.zze
            com.google.android.gms.internal.ads.zzvu r8 = new com.google.android.gms.internal.ads.zzvu
            com.google.android.gms.internal.ads.zzvo r4 = r7.zzm
            com.google.android.gms.internal.ads.zzdm r6 = r7.zzn
            r0 = r8
            r1 = r18
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7.zzw
            if (r0 == 0) goto L5d
            boolean r0 = r18.zzY()
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            long r0 = r7.zzB
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L37
            long r4 = r7.zzJ
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 > 0) goto L31
            goto L37
        L31:
            r0 = 1
            r7.zzM = r0
            r7.zzJ = r2
            return
        L37:
            com.google.android.gms.internal.ads.zzaea r0 = r7.zzA
            java.util.Objects.requireNonNull(r0)
            long r4 = r7.zzJ
            com.google.android.gms.internal.ads.zzady r0 = r0.zzg(r4)
            com.google.android.gms.internal.ads.zzaeb r0 = r0.zza
            long r4 = r7.zzJ
            long r0 = r0.zzc
            com.google.android.gms.internal.ads.zzvu.zzf(r8, r0, r4)
            com.google.android.gms.internal.ads.zzwm[] r0 = r7.zzt
            int r1 = r0.length
            r4 = 0
        L4f:
            if (r4 >= r1) goto L5b
            r5 = r0[r4]
            long r9 = r7.zzJ
            r5.zzt(r9)
            int r4 = r4 + 1
            goto L4f
        L5b:
            r7.zzJ = r2
        L5d:
            int r0 = r18.zzQ()
            r7.zzL = r0
            com.google.android.gms.internal.ads.zzzo r0 = r7.zzl
            int r1 = r7.zzD
            int r1 = com.google.android.gms.internal.ads.zzze.zza(r1)
            long r13 = r0.zza(r8, r7, r1)
            com.google.android.gms.internal.ads.zzgm r12 = com.google.android.gms.internal.ads.zzvu.zzd(r8)
            com.google.android.gms.internal.ads.zzvh r0 = r7.zzg
            com.google.android.gms.internal.ads.zzup r1 = new com.google.android.gms.internal.ads.zzup
            long r10 = com.google.android.gms.internal.ads.zzvu.zzb(r8)
            r9 = r1
            r9.<init>(r10, r12, r13)
            long r2 = com.google.android.gms.internal.ads.zzvu.zzc(r8)
            long r4 = r7.zzB
            com.google.android.gms.internal.ads.zzuu r6 = new com.google.android.gms.internal.ads.zzuu
            r9 = 1
            r10 = -1
            r11 = 0
            r12 = 0
            r13 = 0
            long r14 = com.google.android.gms.internal.ads.zzeu.zzu(r2)
            long r16 = com.google.android.gms.internal.ads.zzeu.zzu(r4)
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r16)
            r0.zzg(r1, r6)
            return
    }

    private final boolean zzY() {
            r5 = this;
            long r0 = r5.zzJ
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private final boolean zzZ() {
            r1 = this;
            boolean r0 = r1.zzF
            if (r0 != 0) goto Ld
            boolean r0 = r1.zzY()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    static /* bridge */ /* synthetic */ long zzn(com.google.android.gms.internal.ads.zzvz r2) {
            long r0 = r2.zzj
            return r0
    }

    static /* bridge */ /* synthetic */ long zzq(com.google.android.gms.internal.ads.zzvz r2) {
            long r0 = r2.zzB
            return r0
    }

    static /* bridge */ /* synthetic */ long zzr(com.google.android.gms.internal.ads.zzvz r0, boolean r1) {
            r1 = 1
            long r0 = r0.zzR(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Handler zzs(com.google.android.gms.internal.ads.zzvz r0) {
            android.os.Handler r0 = r0.zzq
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaf zzt() {
            com.google.android.gms.internal.ads.zzaf r0 = com.google.android.gms.internal.ads.zzvz.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzagf zzx(com.google.android.gms.internal.ads.zzvz r0) {
            com.google.android.gms.internal.ads.zzagf r0 = r0.zzs
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Runnable zzy(com.google.android.gms.internal.ads.zzvz r0) {
            java.lang.Runnable r0 = r0.zzp
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzz() {
            java.util.Map r0 = com.google.android.gms.internal.ads.zzvz.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzD() {
            r2 = this;
            r0 = 1
            r2.zzv = r0
            android.os.Handler r0 = r2.zzq
            java.lang.Runnable r1 = r2.zzo
            r0.post(r1)
            return
    }

    final /* synthetic */ void zzE() {
            r1 = this;
            boolean r0 = r1.zzN
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.ads.zzuv r0 = r1.zzr
            java.util.Objects.requireNonNull(r0)
            r0.zzf(r1)
        Lc:
            return
    }

    final /* synthetic */ void zzF() {
            r1 = this;
            r0 = 1
            r1.zzH = r0
            return
    }

    final /* synthetic */ void zzG(com.google.android.gms.internal.ads.zzaea r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzagf r0 = r7.zzs
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto Lb
            r0 = r8
            goto L12
        Lb:
            com.google.android.gms.internal.ads.zzadz r0 = new com.google.android.gms.internal.ads.zzadz
            r3 = 0
            r0.<init>(r1, r3)
        L12:
            r7.zzA = r0
            long r3 = r8.zza()
            r7.zzB = r3
            boolean r0 = r7.zzH
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L29
            long r5 = r8.zza()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L29
            r3 = 1
        L29:
            r7.zzC = r3
            if (r4 == r3) goto L2e
            goto L2f
        L2e:
            r4 = 7
        L2f:
            r7.zzD = r4
            boolean r0 = r7.zzw
            if (r0 == 0) goto L43
            com.google.android.gms.internal.ads.zzvv r0 = r7.zzi
            long r1 = r7.zzB
            boolean r8 = r8.zzh()
            boolean r3 = r7.zzC
            r0.zza(r1, r8, r3)
            return
        L43:
            r7.zzU()
            return
    }

    final void zzH() throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzD
            int r0 = com.google.android.gms.internal.ads.zzze.zza(r0)
            com.google.android.gms.internal.ads.zzzo r1 = r2.zzl
            r1.zzi(r0)
            return
    }

    final void zzI(int r2) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzwm[] r0 = r1.zzt
            r2 = r0[r2]
            r2.zzm()
            r1.zzH()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final /* bridge */ /* synthetic */ void zzJ(com.google.android.gms.internal.ads.zzzk r17, long r18, long r20, boolean r22) {
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzvu r1 = (com.google.android.gms.internal.ads.zzvu) r1
            com.google.android.gms.internal.ads.zzhg r2 = com.google.android.gms.internal.ads.zzvu.zze(r1)
            com.google.android.gms.internal.ads.zzup r15 = new com.google.android.gms.internal.ads.zzup
            long r4 = com.google.android.gms.internal.ads.zzvu.zzb(r1)
            com.google.android.gms.internal.ads.zzgm r6 = com.google.android.gms.internal.ads.zzvu.zzd(r1)
            android.net.Uri r7 = r2.zzh()
            java.util.Map r8 = r2.zzi()
            long r13 = r2.zzg()
            r3 = r15
            r9 = r18
            r11 = r20
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.gms.internal.ads.zzvu.zzb(r1)
            long r1 = com.google.android.gms.internal.ads.zzvu.zzc(r1)
            long r3 = r0.zzB
            com.google.android.gms.internal.ads.zzuu r13 = new com.google.android.gms.internal.ads.zzuu
            long r11 = com.google.android.gms.internal.ads.zzeu.zzu(r1)
            long r1 = com.google.android.gms.internal.ads.zzeu.zzu(r3)
            r6 = 1
            r7 = -1
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r13
            r3 = r13
            r13 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r13)
            com.google.android.gms.internal.ads.zzvh r1 = r0.zzg
            r1.zzd(r15, r3)
            if (r22 != 0) goto L68
            com.google.android.gms.internal.ads.zzwm[] r1 = r0.zzt
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L52:
            if (r4 >= r2) goto L5c
            r5 = r1[r4]
            r5.zzp(r3)
            int r4 = r4 + 1
            goto L52
        L5c:
            int r1 = r0.zzG
            if (r1 <= 0) goto L68
            com.google.android.gms.internal.ads.zzuv r1 = r0.zzr
            java.util.Objects.requireNonNull(r1)
            r1.zzf(r0)
        L68:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final /* bridge */ /* synthetic */ void zzK(com.google.android.gms.internal.ads.zzzk r20, long r21, long r23) {
            r19 = this;
            r0 = r19
            r1 = r20
            com.google.android.gms.internal.ads.zzvu r1 = (com.google.android.gms.internal.ads.zzvu) r1
            long r2 = r0.zzB
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L33
            com.google.android.gms.internal.ads.zzaea r2 = r0.zzA
            if (r2 == 0) goto L33
            boolean r2 = r2.zzh()
            long r5 = r0.zzR(r4)
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L27
            r5 = 0
            goto L2a
        L27:
            r7 = 10000(0x2710, double:4.9407E-320)
            long r5 = r5 + r7
        L2a:
            r0.zzB = r5
            com.google.android.gms.internal.ads.zzvv r3 = r0.zzi
            boolean r7 = r0.zzC
            r3.zza(r5, r2, r7)
        L33:
            com.google.android.gms.internal.ads.zzhg r2 = com.google.android.gms.internal.ads.zzvu.zze(r1)
            com.google.android.gms.internal.ads.zzup r3 = new com.google.android.gms.internal.ads.zzup
            long r6 = com.google.android.gms.internal.ads.zzvu.zzb(r1)
            com.google.android.gms.internal.ads.zzgm r8 = com.google.android.gms.internal.ads.zzvu.zzd(r1)
            android.net.Uri r9 = r2.zzh()
            java.util.Map r10 = r2.zzi()
            long r15 = r2.zzg()
            r5 = r3
            r11 = r21
            r13 = r23
            r5.<init>(r6, r8, r9, r10, r11, r13, r15)
            com.google.android.gms.internal.ads.zzvu.zzb(r1)
            com.google.android.gms.internal.ads.zzvh r2 = r0.zzg
            long r5 = com.google.android.gms.internal.ads.zzvu.zzc(r1)
            long r7 = r0.zzB
            com.google.android.gms.internal.ads.zzuu r1 = new com.google.android.gms.internal.ads.zzuu
            r10 = 1
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = 0
            long r15 = com.google.android.gms.internal.ads.zzeu.zzu(r5)
            long r17 = com.google.android.gms.internal.ads.zzeu.zzu(r7)
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r17)
            r2.zze(r3, r1)
            r0.zzM = r4
            com.google.android.gms.internal.ads.zzuv r1 = r0.zzr
            java.util.Objects.requireNonNull(r1)
            r1.zzf(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final void zzL() {
            r4 = this;
            com.google.android.gms.internal.ads.zzwm[] r0 = r4.zzt
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.zzo()
            int r2 = r2 + 1
            goto L4
        Le:
            com.google.android.gms.internal.ads.zzvo r0 = r4.zzm
            r0.zze()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzM(com.google.android.gms.internal.ads.zzaf r2) {
            r1 = this;
            android.os.Handler r2 = r1.zzq
            java.lang.Runnable r0 = r1.zzo
            r2.post(r0)
            return
    }

    public final void zzN() {
            r4 = this;
            boolean r0 = r4.zzw
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzwm[] r0 = r4.zzt
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.zzn()
            int r2 = r2 + 1
            goto L8
        L12:
            com.google.android.gms.internal.ads.zzzo r0 = r4.zzl
            r0.zzj(r4)
            android.os.Handler r0 = r4.zzq
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r4.zzr = r1
            r0 = 1
            r4.zzN = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzO(com.google.android.gms.internal.ads.zzaea r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzvs r0 = new com.google.android.gms.internal.ads.zzvs
            r0.<init>(r1, r2)
            android.os.Handler r2 = r1.zzq
            r2.post(r0)
            return
    }

    final boolean zzP(int r2) {
            r1 = this;
            boolean r0 = r1.zzZ()
            if (r0 != 0) goto L14
            com.google.android.gms.internal.ads.zzwm[] r0 = r1.zzt
            r2 = r0[r2]
            boolean r0 = r1.zzM
            boolean r2 = r2.zzx(r0)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zza(long r21, com.google.android.gms.internal.ads.zzlw r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = r23
            r20.zzT()
            com.google.android.gms.internal.ads.zzaea r4 = r0.zzA
            boolean r4 = r4.zzh()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.google.android.gms.internal.ads.zzaea r4 = r0.zzA
            com.google.android.gms.internal.ads.zzady r4 = r4.zzg(r1)
            com.google.android.gms.internal.ads.zzaeb r7 = r4.zza
            com.google.android.gms.internal.ads.zzaeb r4 = r4.zzb
            long r8 = r3.zzc
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2c
            long r8 = r3.zzd
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2b
            goto L88
        L2b:
            r8 = r5
        L2c:
            long r10 = r7.zzb
            int r7 = com.google.android.gms.internal.ads.zzeu.zza
            long r12 = r1 - r8
            long r7 = r1 ^ r8
            long r14 = r1 ^ r12
            long r5 = r3.zzd
            long r16 = r1 + r5
            long r18 = r1 ^ r16
            long r5 = r5 ^ r16
            long r7 = r7 & r14
            r14 = 0
            int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r3 >= 0) goto L47
            r12 = -9223372036854775808
        L47:
            long r5 = r18 & r5
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 >= 0) goto L52
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L52:
            r3 = 1
            r5 = 0
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 > 0) goto L5e
            int r6 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r6 > 0) goto L5e
            r6 = 1
            goto L5f
        L5e:
            r6 = 0
        L5f:
            long r7 = r4.zzb
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 > 0) goto L6a
            int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r4 > 0) goto L6a
            goto L6b
        L6a:
            r3 = 0
        L6b:
            if (r6 == 0) goto L81
            if (r3 == 0) goto L81
            long r3 = r10 - r1
            long r1 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = java.lang.Math.abs(r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L80
            goto L83
        L80:
            return r7
        L81:
            if (r6 == 0) goto L85
        L83:
            r1 = r10
            goto L88
        L85:
            if (r3 == 0) goto L89
            r1 = r7
        L88:
            return r1
        L89:
            return r12
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
            r11 = this;
            r11.zzT()
            boolean r0 = r11.zzM
            r1 = -9223372036854775808
            if (r0 != 0) goto L60
            int r0 = r11.zzG
            if (r0 != 0) goto Le
            goto L60
        Le:
            boolean r0 = r11.zzY()
            if (r0 == 0) goto L17
            long r0 = r11.zzJ
            return r0
        L17:
            boolean r0 = r11.zzx
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L4f
            com.google.android.gms.internal.ads.zzwm[] r0 = r11.zzt
            int r0 = r0.length
            r7 = r4
            r6 = 0
        L26:
            if (r6 >= r0) goto L50
            com.google.android.gms.internal.ads.zzvy r9 = r11.zzz
            boolean[] r10 = r9.zzb
            boolean r10 = r10[r6]
            if (r10 == 0) goto L4c
            boolean[] r9 = r9.zzc
            boolean r9 = r9[r6]
            if (r9 == 0) goto L4c
            com.google.android.gms.internal.ads.zzwm[] r9 = r11.zzt
            r9 = r9[r6]
            boolean r9 = r9.zzw()
            if (r9 != 0) goto L4c
            com.google.android.gms.internal.ads.zzwm[] r9 = r11.zzt
            r9 = r9[r6]
            long r9 = r9.zzh()
            long r7 = java.lang.Math.min(r7, r9)
        L4c:
            int r6 = r6 + 1
            goto L26
        L4f:
            r7 = r4
        L50:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 != 0) goto L58
            long r7 = r11.zzR(r3)
        L58:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L5f
            long r0 = r11.zzI
            return r0
        L5f:
            return r7
        L60:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
            r2 = this;
            long r0 = r2.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzd() {
            r2 = this;
            boolean r0 = r2.zzF
            if (r0 == 0) goto L16
            boolean r0 = r2.zzM
            if (r0 != 0) goto L10
            int r0 = r2.zzQ()
            int r1 = r2.zzL
            if (r0 <= r1) goto L16
        L10:
            r0 = 0
            r2.zzF = r0
            long r0 = r2.zzI
            return r0
        L16:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zze(long r7) {
            r6 = this;
            r6.zzT()
            com.google.android.gms.internal.ads.zzvy r0 = r6.zzz
            boolean[] r0 = r0.zzb
            com.google.android.gms.internal.ads.zzaea r1 = r6.zzA
            boolean r1 = r1.zzh()
            r2 = 1
            if (r2 == r1) goto L12
            r7 = 0
        L12:
            r1 = 0
            r6.zzF = r1
            r6.zzI = r7
            boolean r2 = r6.zzY()
            if (r2 == 0) goto L20
            r6.zzJ = r7
            return r7
        L20:
            int r2 = r6.zzD
            r3 = 7
            if (r2 == r3) goto L5a
            boolean r2 = r6.zzM
            if (r2 != 0) goto L31
            com.google.android.gms.internal.ads.zzzo r2 = r6.zzl
            boolean r2 = r2.zzl()
            if (r2 == 0) goto L5a
        L31:
            com.google.android.gms.internal.ads.zzwm[] r2 = r6.zzt
            int r2 = r2.length
            r3 = 0
        L35:
            if (r3 >= r2) goto L8c
            com.google.android.gms.internal.ads.zzwm[] r4 = r6.zzt
            r4 = r4[r3]
            boolean r5 = r6.zzy
            if (r5 == 0) goto L48
            int r5 = r4.zza()
            boolean r4 = r4.zzy(r5)
            goto L4c
        L48:
            boolean r4 = r4.zzz(r7, r1)
        L4c:
            if (r4 != 0) goto L57
            boolean r4 = r0[r3]
            if (r4 != 0) goto L5a
            boolean r4 = r6.zzx
            if (r4 != 0) goto L57
            goto L5a
        L57:
            int r3 = r3 + 1
            goto L35
        L5a:
            r6.zzK = r1
            r6.zzJ = r7
            r6.zzM = r1
            com.google.android.gms.internal.ads.zzzo r0 = r6.zzl
            boolean r2 = r0.zzl()
            if (r2 == 0) goto L7b
            com.google.android.gms.internal.ads.zzwm[] r0 = r6.zzt
            int r2 = r0.length
        L6b:
            if (r1 >= r2) goto L75
            r3 = r0[r1]
            r3.zzk()
            int r1 = r1 + 1
            goto L6b
        L75:
            com.google.android.gms.internal.ads.zzzo r0 = r6.zzl
            r0.zzg()
            goto L8c
        L7b:
            r0.zzh()
            com.google.android.gms.internal.ads.zzwm[] r0 = r6.zzt
            int r2 = r0.length
            r3 = 0
        L82:
            if (r3 >= r2) goto L8c
            r4 = r0[r3]
            r4.zzp(r1)
            int r3 = r3 + 1
            goto L82
        L8c:
            return r7
    }

    final int zzf(int r4, com.google.android.gms.internal.ads.zzkm r5, com.google.android.gms.internal.ads.zzhq r6, int r7) {
            r3 = this;
            boolean r0 = r3.zzZ()
            r1 = -3
            if (r0 == 0) goto L8
            return r1
        L8:
            r3.zzV(r4)
            com.google.android.gms.internal.ads.zzwm[] r0 = r3.zzt
            r0 = r0[r4]
            boolean r2 = r3.zzM
            int r5 = r0.zze(r5, r6, r7, r2)
            if (r5 != r1) goto L1a
            r3.zzW(r4)
        L1a:
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzg(com.google.android.gms.internal.ads.zzyl[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzwn[] r10, boolean[] r11, long r12) {
            r7 = this;
            r7.zzT()
            com.google.android.gms.internal.ads.zzvy r0 = r7.zzz
            com.google.android.gms.internal.ads.zzwy r1 = r0.zza
            boolean[] r0 = r0.zzc
            int r2 = r7.zzG
            r3 = 0
            r4 = 0
        Ld:
            int r5 = r8.length
            if (r4 >= r5) goto L35
            r5 = r10[r4]
            if (r5 == 0) goto L32
            r6 = r8[r4]
            if (r6 == 0) goto L1c
            boolean r6 = r9[r4]
            if (r6 != 0) goto L32
        L1c:
            com.google.android.gms.internal.ads.zzvw r5 = (com.google.android.gms.internal.ads.zzvw) r5
            int r5 = com.google.android.gms.internal.ads.zzvw.zzc(r5)
            boolean r6 = r0[r5]
            com.google.android.gms.internal.ads.zzdi.zzf(r6)
            int r6 = r7.zzG
            int r6 = r6 + (-1)
            r7.zzG = r6
            r0[r5] = r3
            r5 = 0
            r10[r4] = r5
        L32:
            int r4 = r4 + 1
            goto Ld
        L35:
            boolean r9 = r7.zzE
            r4 = 1
            if (r9 == 0) goto L3e
            if (r2 != 0) goto L49
        L3c:
            r9 = 1
            goto L4a
        L3e:
            r5 = 0
            int r9 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r9 == 0) goto L49
            boolean r9 = r7.zzy
            if (r9 != 0) goto L49
            goto L3c
        L49:
            r9 = 0
        L4a:
            r2 = 0
        L4b:
            int r5 = r8.length
            if (r2 >= r5) goto La4
            r5 = r10[r2]
            if (r5 != 0) goto La1
            r5 = r8[r2]
            if (r5 == 0) goto La1
            int r6 = r5.zzc()
            if (r6 != r4) goto L5e
            r6 = 1
            goto L5f
        L5e:
            r6 = 0
        L5f:
            com.google.android.gms.internal.ads.zzdi.zzf(r6)
            int r6 = r5.zza(r3)
            if (r6 != 0) goto L6a
            r6 = 1
            goto L6b
        L6a:
            r6 = 0
        L6b:
            com.google.android.gms.internal.ads.zzdi.zzf(r6)
            com.google.android.gms.internal.ads.zzcd r5 = r5.zze()
            int r5 = r1.zza(r5)
            boolean r6 = r0[r5]
            r6 = r6 ^ r4
            com.google.android.gms.internal.ads.zzdi.zzf(r6)
            int r6 = r7.zzG
            int r6 = r6 + r4
            r7.zzG = r6
            r0[r5] = r4
            com.google.android.gms.internal.ads.zzvw r6 = new com.google.android.gms.internal.ads.zzvw
            r6.<init>(r7, r5)
            r10[r2] = r6
            r11[r2] = r4
            if (r9 != 0) goto La1
            com.google.android.gms.internal.ads.zzwm[] r9 = r7.zzt
            r9 = r9[r5]
            int r5 = r9.zzb()
            if (r5 == 0) goto La0
            boolean r9 = r9.zzz(r12, r4)
            if (r9 != 0) goto La0
            r9 = 1
            goto La1
        La0:
            r9 = 0
        La1:
            int r2 = r2 + 1
            goto L4b
        La4:
            int r8 = r7.zzG
            if (r8 != 0) goto Ld7
            r7.zzK = r3
            r7.zzF = r3
            com.google.android.gms.internal.ads.zzzo r8 = r7.zzl
            boolean r8 = r8.zzl()
            if (r8 == 0) goto Lc7
            com.google.android.gms.internal.ads.zzwm[] r8 = r7.zzt
            int r9 = r8.length
        Lb7:
            if (r3 >= r9) goto Lc1
            r10 = r8[r3]
            r10.zzk()
            int r3 = r3 + 1
            goto Lb7
        Lc1:
            com.google.android.gms.internal.ads.zzzo r8 = r7.zzl
            r8.zzg()
            goto Le9
        Lc7:
            r7.zzM = r3
            com.google.android.gms.internal.ads.zzwm[] r8 = r7.zzt
            int r9 = r8.length
            r10 = 0
        Lcd:
            if (r10 >= r9) goto Le9
            r11 = r8[r10]
            r11.zzp(r3)
            int r10 = r10 + 1
            goto Lcd
        Ld7:
            if (r9 == 0) goto Le9
            long r12 = r7.zze(r12)
        Ldd:
            int r8 = r10.length
            if (r3 >= r8) goto Le9
            r8 = r10[r3]
            if (r8 == 0) goto Le6
            r11[r3] = r4
        Le6:
            int r3 = r3 + 1
            goto Ldd
        Le9:
            r7.zzE = r4
            return r12
    }

    final int zzh(int r4, long r5) {
            r3 = this;
            boolean r0 = r3.zzZ()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r3.zzV(r4)
            com.google.android.gms.internal.ads.zzwm[] r0 = r3.zzt
            r0 = r0[r4]
            boolean r2 = r3.zzM
            int r5 = r0.zzc(r5, r2)
            r0.zzv(r5)
            if (r5 != 0) goto L1e
            r3.zzW(r4)
            return r1
        L1e:
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final com.google.android.gms.internal.ads.zzwy zzi() {
            r1 = this;
            r1.zzT()
            com.google.android.gms.internal.ads.zzvy r0 = r1.zzz
            com.google.android.gms.internal.ads.zzwy r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzj(long r6, boolean r8) {
            r5 = this;
            boolean r8 = r5.zzy
            if (r8 == 0) goto L5
            goto L25
        L5:
            r5.zzT()
            boolean r8 = r5.zzY()
            if (r8 != 0) goto L25
            com.google.android.gms.internal.ads.zzvy r8 = r5.zzz
            boolean[] r8 = r8.zzc
            com.google.android.gms.internal.ads.zzwm[] r0 = r5.zzt
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L17:
            if (r2 >= r0) goto L25
            com.google.android.gms.internal.ads.zzwm[] r3 = r5.zzt
            r3 = r3[r2]
            boolean r4 = r8[r2]
            r3.zzj(r6, r1, r4)
            int r2 = r2 + 1
            goto L17
        L25:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzk() throws java.io.IOException {
            r2 = this;
            r2.zzH()
            boolean r0 = r2.zzM
            if (r0 == 0) goto L14
            boolean r0 = r2.zzw
            if (r0 == 0) goto Lc
            goto L14
        Lc:
            r0 = 0
            java.lang.String r1 = "Loading finished before preparation is complete."
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r1, r0)
            throw r0
        L14:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzl(com.google.android.gms.internal.ads.zzuv r1, long r2) {
            r0 = this;
            r0.zzr = r1
            com.google.android.gms.internal.ads.zzdm r1 = r0.zzn
            r1.zze()
            r0.zzX()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final void zzm(long r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(com.google.android.gms.internal.ads.zzks r2) {
            r1 = this;
            boolean r2 = r1.zzM
            if (r2 != 0) goto L2a
            com.google.android.gms.internal.ads.zzzo r2 = r1.zzl
            boolean r0 = r2.zzk()
            if (r0 != 0) goto L2a
            boolean r0 = r1.zzK
            if (r0 != 0) goto L2a
            boolean r0 = r1.zzw
            if (r0 == 0) goto L18
            int r0 = r1.zzG
            if (r0 == 0) goto L2a
        L18:
            com.google.android.gms.internal.ads.zzdm r0 = r1.zzn
            boolean r0 = r0.zze()
            boolean r2 = r2.zzl()
            if (r2 != 0) goto L29
            r1.zzX()
            r2 = 1
            return r2
        L29:
            return r0
        L2a:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
            r1 = this;
            com.google.android.gms.internal.ads.zzzo r0 = r1.zzl
            boolean r0 = r0.zzl()
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzdm r0 = r1.zzn
            boolean r0 = r0.zzd()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzzi zzu(com.google.android.gms.internal.ads.zzzk r22, long r23, long r25, java.io.IOException r27, int r28) {
            r21 = this;
            r0 = r21
            r1 = r27
            r2 = r22
            com.google.android.gms.internal.ads.zzvu r2 = (com.google.android.gms.internal.ads.zzvu) r2
            com.google.android.gms.internal.ads.zzhg r3 = com.google.android.gms.internal.ads.zzvu.zze(r2)
            com.google.android.gms.internal.ads.zzup r14 = new com.google.android.gms.internal.ads.zzup
            long r5 = com.google.android.gms.internal.ads.zzvu.zzb(r2)
            com.google.android.gms.internal.ads.zzgm r7 = com.google.android.gms.internal.ads.zzvu.zzd(r2)
            android.net.Uri r8 = r3.zzh()
            java.util.Map r9 = r3.zzi()
            long r15 = r3.zzg()
            r4 = r14
            r10 = r23
            r12 = r25
            r3 = r14
            r14 = r15
            r4.<init>(r5, r7, r8, r9, r10, r12, r14)
            com.google.android.gms.internal.ads.zzvu.zzc(r2)
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzbo
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L68
            boolean r4 = r1 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L68
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzgx
            if (r4 != 0) goto L68
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzzn
            if (r4 != 0) goto L68
            r4 = r1
        L47:
            if (r4 == 0) goto L5c
            boolean r7 = r4 instanceof com.google.android.gms.internal.ads.zzgh
            if (r7 == 0) goto L57
            r7 = r4
            com.google.android.gms.internal.ads.zzgh r7 = (com.google.android.gms.internal.ads.zzgh) r7
            int r7 = r7.zza
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L57
            goto L68
        L57:
            java.lang.Throwable r4 = r4.getCause()
            goto L47
        L5c:
            int r4 = r28 + (-1)
            int r4 = r4 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r7)
            long r7 = (long) r4
            goto L69
        L68:
            r7 = r5
        L69:
            r4 = 1
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L71
            com.google.android.gms.internal.ads.zzzi r5 = com.google.android.gms.internal.ads.zzzo.zzb
            goto Lbd
        L71:
            int r9 = r21.zzQ()
            int r10 = r0.zzL
            r11 = 0
            if (r9 <= r10) goto L7c
            r10 = 1
            goto L7d
        L7c:
            r10 = 0
        L7d:
            boolean r12 = r0.zzH
            if (r12 != 0) goto Lb7
            com.google.android.gms.internal.ads.zzaea r12 = r0.zzA
            if (r12 == 0) goto L8e
            long r12 = r12.zza()
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L8e
            goto Lb7
        L8e:
            boolean r5 = r0.zzw
            if (r5 == 0) goto L9d
            boolean r6 = r21.zzZ()
            if (r6 != 0) goto L9d
            r0.zzK = r4
            com.google.android.gms.internal.ads.zzzi r5 = com.google.android.gms.internal.ads.zzzo.zza
            goto Lbd
        L9d:
            r0.zzF = r5
            r5 = 0
            r0.zzI = r5
            r0.zzL = r11
            com.google.android.gms.internal.ads.zzwm[] r9 = r0.zzt
            int r12 = r9.length
            r13 = 0
        La9:
            if (r13 >= r12) goto Lb3
            r14 = r9[r13]
            r14.zzp(r11)
            int r13 = r13 + 1
            goto La9
        Lb3:
            com.google.android.gms.internal.ads.zzvu.zzf(r2, r5, r5)
            goto Lb9
        Lb7:
            r0.zzL = r9
        Lb9:
            com.google.android.gms.internal.ads.zzzi r5 = com.google.android.gms.internal.ads.zzzo.zzb(r10, r7)
        Lbd:
            boolean r6 = r5.zzc()
            r4 = r4 ^ r6
            com.google.android.gms.internal.ads.zzvh r6 = r0.zzg
            long r7 = com.google.android.gms.internal.ads.zzvu.zzc(r2)
            long r9 = r0.zzB
            long r17 = com.google.android.gms.internal.ads.zzeu.zzu(r7)
            long r19 = com.google.android.gms.internal.ads.zzeu.zzu(r9)
            com.google.android.gms.internal.ads.zzuu r7 = new com.google.android.gms.internal.ads.zzuu
            r12 = 1
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)
            r6.zzf(r3, r7, r1, r4)
            if (r4 == 0) goto Le6
            com.google.android.gms.internal.ads.zzvu.zzb(r2)
        Le6:
            return r5
    }

    final com.google.android.gms.internal.ads.zzaeh zzv() {
            r3 = this;
            com.google.android.gms.internal.ads.zzvx r0 = new com.google.android.gms.internal.ads.zzvx
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzaeh r0 = r3.zzS(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final com.google.android.gms.internal.ads.zzaeh zzw(int r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzvx r3 = new com.google.android.gms.internal.ads.zzvx
            r0 = 0
            r3.<init>(r2, r0)
            com.google.android.gms.internal.ads.zzaeh r2 = r1.zzS(r3)
            return r2
    }
}
