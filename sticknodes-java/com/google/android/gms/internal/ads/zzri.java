package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzri extends com.google.android.gms.internal.ads.zzte implements com.google.android.gms.internal.ads.zzkt {
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzpq zzc;
    private final com.google.android.gms.internal.ads.zzpy zzd;
    private final com.google.android.gms.internal.ads.zzsp zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private com.google.android.gms.internal.ads.zzaf zzi;
    private com.google.android.gms.internal.ads.zzaf zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    public zzri(android.content.Context r8, com.google.android.gms.internal.ads.zzsr r9, com.google.android.gms.internal.ads.zztg r10, boolean r11, android.os.Handler r12, com.google.android.gms.internal.ads.zzpr r13, com.google.android.gms.internal.ads.zzpy r14) {
            r7 = this;
            int r11 = com.google.android.gms.internal.ads.zzeu.zza
            r0 = 0
            r1 = 35
            if (r11 < r1) goto Lf
            com.google.android.gms.internal.ads.zzsp r11 = new com.google.android.gms.internal.ads.zzsp
            com.google.android.gms.internal.ads.zzso r1 = com.google.android.gms.internal.ads.zzso.zza
            r11.<init>(r1)
            goto L10
        Lf:
            r11 = r0
        L10:
            r2 = 1
            r5 = 0
            r6 = 1194083328(0x472c4400, float:44100.0)
            r1 = r7
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            android.content.Context r8 = r8.getApplicationContext()
            r7.zzb = r8
            r7.zzd = r14
            r7.zze = r11
            r8 = -1000(0xfffffffffffffc18, float:NaN)
            r7.zzo = r8
            com.google.android.gms.internal.ads.zzpq r8 = new com.google.android.gms.internal.ads.zzpq
            r8.<init>(r12, r13)
            r7.zzc = r8
            com.google.android.gms.internal.ads.zzrh r8 = new com.google.android.gms.internal.ads.zzrh
            r8.<init>(r7, r0)
            r14.zzq(r8)
            return
    }

    private final int zzaQ(com.google.android.gms.internal.ads.zzsw r2, com.google.android.gms.internal.ads.zzaf r3) {
            r1 = this;
            java.lang.String r2 = r2.zza
            java.lang.String r0 = "OMX.google.raw.decoder"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1e
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            r0 = 24
            if (r2 >= r0) goto L1e
            r0 = 23
            if (r2 != r0) goto L1c
            android.content.Context r2 = r1.zzb
            boolean r2 = com.google.android.gms.internal.ads.zzeu.zzL(r2)
            if (r2 != 0) goto L1e
        L1c:
            r2 = -1
            return r2
        L1e:
            int r2 = r3.zzo
            return r2
    }

    private static java.util.List zzaR(com.google.android.gms.internal.ads.zztg r0, com.google.android.gms.internal.ads.zzaf r1, boolean r2, com.google.android.gms.internal.ads.zzpy r3) throws com.google.android.gms.internal.ads.zztm {
            java.lang.String r2 = r1.zzn
            if (r2 != 0) goto L9
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r0
        L9:
            boolean r2 = r3.zzA(r1)
            if (r2 == 0) goto L1a
            com.google.android.gms.internal.ads.zzsw r2 = com.google.android.gms.internal.ads.zzts.zzc()
            if (r2 == 0) goto L1a
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzo(r2)
            return r0
        L1a:
            r2 = 0
            java.util.List r0 = com.google.android.gms.internal.ads.zzts.zzg(r0, r1, r2, r2)
            return r0
    }

    private final void zzaS() {
            r5 = this;
            com.google.android.gms.internal.ads.zzpy r0 = r5.zzd
            boolean r1 = r5.zzW()
            long r0 = r0.zzb(r1)
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L20
            boolean r2 = r5.zzl
            if (r2 == 0) goto L15
            goto L1b
        L15:
            long r2 = r5.zzk
            long r0 = java.lang.Math.max(r2, r0)
        L1b:
            r5.zzk = r0
            r0 = 0
            r5.zzl = r0
        L20:
            return
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzlq zzad(com.google.android.gms.internal.ads.zzri r0) {
            com.google.android.gms.internal.ads.zzlq r0 = r0.zzay()
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzpq zzae(com.google.android.gms.internal.ads.zzri r0) {
            com.google.android.gms.internal.ads.zzpq r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ void zzah(com.google.android.gms.internal.ads.zzri r0, boolean r1) {
            r1 = 1
            r0.zzn = r1
            return
    }

    static /* synthetic */ void zzai(com.google.android.gms.internal.ads.zzri r0) {
            r0.zzB()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected final void zzA() {
            r2 = this;
            com.google.android.gms.internal.ads.zzpy r0 = r2.zzd
            r0.zzk()
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 35
            if (r0 < r1) goto L12
            com.google.android.gms.internal.ads.zzsp r0 = r2.zze
            if (r0 == 0) goto L12
            r0.zzb()
        L12:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    protected final void zzC() {
            r3 = this;
            r0 = 0
            r3.zzn = r0
            super.zzC()     // Catch: java.lang.Throwable -> L12
            boolean r1 = r3.zzm
            if (r1 == 0) goto L11
            r3.zzm = r0
            com.google.android.gms.internal.ads.zzpy r0 = r3.zzd
            r0.zzl()
        L11:
            return
        L12:
            r1 = move-exception
            boolean r2 = r3.zzm
            if (r2 != 0) goto L18
            goto L1f
        L18:
            r3.zzm = r0
            com.google.android.gms.internal.ads.zzpy r0 = r3.zzd
            r0.zzl()
        L1f:
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected final void zzD() {
            r1 = this;
            com.google.android.gms.internal.ads.zzpy r0 = r1.zzd
            r0.zzi()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected final void zzE() {
            r1 = this;
            r1.zzaS()
            com.google.android.gms.internal.ads.zzpy r0 = r1.zzd
            r0.zzh()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlu
    public final java.lang.String zzU() {
            r1 = this;
            java.lang.String r0 = "MediaCodecAudioRenderer"
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    public final boolean zzW() {
            r1 = this;
            boolean r0 = super.zzW()
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.zzpy r0 = r1.zzd
            boolean r0 = r0.zzz()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    public final boolean zzX() {
            r1 = this;
            com.google.android.gms.internal.ads.zzpy r0 = r1.zzd
            boolean r0 = r0.zzy()
            if (r0 != 0) goto L11
            boolean r0 = super.zzX()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final float zzZ(float r4, com.google.android.gms.internal.ads.zzaf r5, com.google.android.gms.internal.ads.zzaf[] r6) {
            r3 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r6.length
            if (r0 >= r2) goto L13
            r2 = r6[r0]
            int r2 = r2.zzC
            if (r2 == r5) goto L10
            int r1 = java.lang.Math.max(r1, r2)
        L10:
            int r0 = r0 + 1
            goto L3
        L13:
            if (r1 != r5) goto L18
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r4
        L18:
            float r5 = (float) r1
            float r5 = r5 * r4
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final long zza() {
            r2 = this;
            int r0 = r2.zzcV()
            r1 = 2
            if (r0 != r1) goto La
            r2.zzaS()
        La:
            long r0 = r2.zzk
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final int zzaa(com.google.android.gms.internal.ads.zztg r10, com.google.android.gms.internal.ads.zzaf r11) throws com.google.android.gms.internal.ads.zztm {
            r9 = this;
            java.lang.String r0 = r11.zzn
            boolean r0 = com.google.android.gms.internal.ads.zzbn.zzg(r0)
            r1 = 128(0x80, float:1.794E-43)
            if (r0 != 0) goto Lb
            return r1
        Lb:
            int r0 = r11.zzI
            boolean r2 = com.google.android.gms.internal.ads.zzte.zzaP(r11)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.ads.zzsw r0 = com.google.android.gms.internal.ads.zzts.zzc()
            if (r0 == 0) goto L44
        L1d:
            com.google.android.gms.internal.ads.zzpy r0 = r9.zzd
            com.google.android.gms.internal.ads.zzpd r0 = r0.zzd(r11)
            boolean r5 = r0.zzb
            if (r5 != 0) goto L29
            r5 = 0
            goto L38
        L29:
            boolean r5 = r0.zzc
            if (r4 == r5) goto L30
            r5 = 512(0x200, float:7.175E-43)
            goto L32
        L30:
            r5 = 1536(0x600, float:2.152E-42)
        L32:
            boolean r0 = r0.zzd
            if (r0 == 0) goto L38
            r5 = r5 | 2048(0x800, float:2.87E-42)
        L38:
            com.google.android.gms.internal.ads.zzpy r0 = r9.zzd
            boolean r0 = r0.zzA(r11)
            if (r0 != 0) goto L41
            goto L45
        L41:
            r10 = r5 | 172(0xac, float:2.41E-43)
            return r10
        L44:
            r5 = 0
        L45:
            java.lang.String r0 = r11.zzn
            java.lang.String r6 = "audio/raw"
            boolean r0 = r6.equals(r0)
            r6 = 2
            if (r0 == 0) goto L59
            com.google.android.gms.internal.ads.zzpy r0 = r9.zzd
            boolean r0 = r0.zzA(r11)
            if (r0 != 0) goto L59
            goto L7a
        L59:
            com.google.android.gms.internal.ads.zzpy r0 = r9.zzd
            int r7 = r11.zzB
            int r8 = r11.zzC
            com.google.android.gms.internal.ads.zzaf r7 = com.google.android.gms.internal.ads.zzeu.zzz(r6, r7, r8)
            boolean r0 = r0.zzA(r7)
            if (r0 != 0) goto L6a
            goto L7a
        L6a:
            com.google.android.gms.internal.ads.zzpy r0 = r9.zzd
            java.util.List r10 = zzaR(r10, r11, r3, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L77
            goto L7a
        L77:
            if (r2 != 0) goto L7d
            r4 = 2
        L7a:
            r10 = r4 | 128(0x80, float:1.794E-43)
            return r10
        L7d:
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.ads.zzsw r0 = (com.google.android.gms.internal.ads.zzsw) r0
            boolean r2 = r0.zze(r11)
            if (r2 != 0) goto La3
            r6 = 1
        L8a:
            int r7 = r10.size()
            if (r6 >= r7) goto La3
            java.lang.Object r7 = r10.get(r6)
            com.google.android.gms.internal.ads.zzsw r7 = (com.google.android.gms.internal.ads.zzsw) r7
            boolean r8 = r7.zze(r11)
            if (r8 == 0) goto La0
            r0 = r7
            r10 = 0
            r2 = 1
            goto La4
        La0:
            int r6 = r6 + 1
            goto L8a
        La3:
            r10 = 1
        La4:
            if (r4 == r2) goto La8
            r6 = 3
            goto La9
        La8:
            r6 = 4
        La9:
            r7 = 8
            if (r2 == 0) goto Lb5
            boolean r11 = r0.zzf(r11)
            if (r11 == 0) goto Lb5
            r7 = 16
        Lb5:
            boolean r11 = r0.zzg
            if (r4 == r11) goto Lbb
            r11 = 0
            goto Lbd
        Lbb:
            r11 = 64
        Lbd:
            if (r4 == r10) goto Lc0
            r1 = 0
        Lc0:
            r10 = r6 | r7
            r10 = r10 | 32
            r10 = r10 | r11
            r10 = r10 | r1
            r10 = r10 | r5
            return r10
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final com.google.android.gms.internal.ads.zzib zzab(com.google.android.gms.internal.ads.zzsw r9, com.google.android.gms.internal.ads.zzaf r10, com.google.android.gms.internal.ads.zzaf r11) {
            r8 = this;
            com.google.android.gms.internal.ads.zzib r0 = r9.zzb(r10, r11)
            int r1 = r0.zze
            boolean r2 = r8.zzaM(r11)
            if (r2 == 0) goto L10
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L10:
            int r2 = r8.zzaQ(r9, r11)
            int r3 = r8.zzf
            if (r2 <= r3) goto L1a
            r1 = r1 | 64
        L1a:
            java.lang.String r3 = r9.zza
            com.google.android.gms.internal.ads.zzib r9 = new com.google.android.gms.internal.ads.zzib
            r2 = 0
            if (r1 == 0) goto L24
            r7 = r1
            r6 = 0
            goto L28
        L24:
            int r0 = r0.zzd
            r6 = r0
            r7 = 0
        L28:
            r2 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final com.google.android.gms.internal.ads.zzib zzac(com.google.android.gms.internal.ads.zzkm r3) throws com.google.android.gms.internal.ads.zzij {
            r2 = this;
            com.google.android.gms.internal.ads.zzaf r0 = r3.zza
            java.util.Objects.requireNonNull(r0)
            r2.zzi = r0
            com.google.android.gms.internal.ads.zzib r3 = super.zzac(r3)
            com.google.android.gms.internal.ads.zzpq r1 = r2.zzc
            r1.zzi(r0, r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final com.google.android.gms.internal.ads.zzsq zzaf(com.google.android.gms.internal.ads.zzsw r8, com.google.android.gms.internal.ads.zzaf r9, android.media.MediaCrypto r10, float r11) {
            r7 = this;
            com.google.android.gms.internal.ads.zzaf[] r10 = r7.zzT()
            int r0 = r10.length
            int r1 = r7.zzaQ(r8, r9)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto Le
            goto L26
        Le:
            r4 = 0
        Lf:
            if (r4 >= r0) goto L26
            r5 = r10[r4]
            com.google.android.gms.internal.ads.zzib r6 = r8.zzb(r9, r5)
            int r6 = r6.zzd
            if (r6 == 0) goto L23
            int r5 = r7.zzaQ(r8, r5)
            int r1 = java.lang.Math.max(r1, r5)
        L23:
            int r4 = r4 + 1
            goto Lf
        L26:
            r7.zzf = r1
            java.lang.String r10 = r8.zza
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 24
            if (r0 >= r1) goto L5e
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L5e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzeu.zzc
            java.lang.String r4 = "samsung"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L5e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzeu.zzb
            java.lang.String r4 = "zeroflte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L5c
            java.lang.String r4 = "herolte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L5c
            java.lang.String r4 = "heroqlte"
            boolean r10 = r10.startsWith(r4)
            if (r10 == 0) goto L5e
        L5c:
            r10 = 1
            goto L5f
        L5e:
            r10 = 0
        L5f:
            r7.zzg = r10
            java.lang.String r10 = r8.zza
            java.lang.String r4 = "OMX.google.opus.decoder"
            boolean r4 = r10.equals(r4)
            if (r4 != 0) goto L86
            java.lang.String r4 = "c2.android.opus.decoder"
            boolean r4 = r10.equals(r4)
            if (r4 != 0) goto L86
            java.lang.String r4 = "OMX.google.vorbis.decoder"
            boolean r4 = r10.equals(r4)
            if (r4 != 0) goto L86
            java.lang.String r4 = "c2.android.vorbis.decoder"
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L84
            goto L86
        L84:
            r10 = 0
            goto L87
        L86:
            r10 = 1
        L87:
            r7.zzh = r10
            java.lang.String r10 = r8.zzc
            int r4 = r7.zzf
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r6 = "mime"
            r5.setString(r6, r10)
            int r10 = r9.zzB
            java.lang.String r6 = "channel-count"
            r5.setInteger(r6, r10)
            int r10 = r9.zzC
            java.lang.String r6 = "sample-rate"
            r5.setInteger(r6, r10)
            java.util.List r10 = r9.zzq
            com.google.android.gms.internal.ads.zzed.zzb(r5, r10)
            java.lang.String r10 = "max-input-size"
            com.google.android.gms.internal.ads.zzed.zza(r5, r10, r4)
            r10 = 23
            if (r0 < r10) goto Ld7
            java.lang.String r4 = "priority"
            r5.setInteger(r4, r2)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto Ld7
            if (r0 != r10) goto Ld2
            java.lang.String r10 = com.google.android.gms.internal.ads.zzeu.zzd
            java.lang.String r4 = "ZTE B2017G"
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto Ld7
            java.lang.String r4 = "AXON 7 mini"
            boolean r10 = r4.equals(r10)
            if (r10 != 0) goto Ld7
        Ld2:
            java.lang.String r10 = "operating-rate"
            r5.setFloat(r10, r11)
        Ld7:
            r10 = 28
            if (r0 > r10) goto Lea
            java.lang.String r10 = r9.zzn
            java.lang.String r11 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto Lea
            java.lang.String r10 = "ac4-is-sync"
            r5.setInteger(r10, r3)
        Lea:
            if (r0 < r1) goto L103
            com.google.android.gms.internal.ads.zzpy r10 = r7.zzd
            int r11 = r9.zzB
            int r1 = r9.zzC
            r3 = 4
            com.google.android.gms.internal.ads.zzaf r11 = com.google.android.gms.internal.ads.zzeu.zzz(r3, r11, r1)
            int r10 = r10.zza(r11)
            r11 = 2
            if (r10 != r11) goto L103
            java.lang.String r10 = "pcm-encoding"
            r5.setInteger(r10, r3)
        L103:
            r10 = 32
            if (r0 < r10) goto L10e
            r10 = 99
            java.lang.String r11 = "max-output-channel-count"
            r5.setInteger(r11, r10)
        L10e:
            r10 = 35
            if (r0 < r10) goto L11e
            int r10 = r7.zzo
            int r10 = -r10
            int r10 = java.lang.Math.max(r2, r10)
            java.lang.String r11 = "importance"
            r5.setInteger(r11, r10)
        L11e:
            java.lang.String r10 = r8.zzb
            java.lang.String r11 = "audio/raw"
            boolean r10 = r11.equals(r10)
            r0 = 0
            if (r10 == 0) goto L133
            java.lang.String r10 = r9.zzn
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L133
            r10 = r9
            goto L134
        L133:
            r10 = r0
        L134:
            r7.zzj = r10
            com.google.android.gms.internal.ads.zzsp r10 = r7.zze
            com.google.android.gms.internal.ads.zzsq r8 = com.google.android.gms.internal.ads.zzsq.zza(r8, r5, r9, r0, r10)
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final java.util.List zzag(com.google.android.gms.internal.ads.zztg r2, com.google.android.gms.internal.ads.zzaf r3, boolean r4) throws com.google.android.gms.internal.ads.zztm {
            r1 = this;
            com.google.android.gms.internal.ads.zzpy r4 = r1.zzd
            r0 = 0
            java.util.List r2 = zzaR(r2, r3, r0, r4)
            java.util.List r2 = com.google.android.gms.internal.ads.zzts.zzh(r2, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzaj(com.google.android.gms.internal.ads.zzhq r6) {
            r5 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 29
            if (r0 < r1) goto L47
            com.google.android.gms.internal.ads.zzaf r0 = r6.zza
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.zzn
            java.lang.String r1 = "audio/opus"
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L47
            boolean r0 = r5.zzaL()
            if (r0 == 0) goto L47
            java.nio.ByteBuffer r0 = r6.zzf
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzaf r6 = r6.zza
            java.util.Objects.requireNonNull(r6)
            int r6 = r6.zzE
            int r1 = r0.remaining()
            r2 = 8
            if (r1 != r2) goto L47
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            long r0 = r0.getLong()
            r2 = 48000(0xbb80, double:2.3715E-319)
            long r0 = r0 * r2
            com.google.android.gms.internal.ads.zzpy r2 = r5.zzd
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 / r3
            int r1 = (int) r0
            r2.zzr(r6, r1)
        L47:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzak(java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "MediaCodecAudioRenderer"
            java.lang.String r1 = "Audio codec error"
            com.google.android.gms.internal.ads.zzea.zzd(r0, r1, r3)
            com.google.android.gms.internal.ads.zzpq r0 = r2.zzc
            r0.zza(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzal(java.lang.String r7, com.google.android.gms.internal.ads.zzsq r8, long r9, long r11) {
            r6 = this;
            com.google.android.gms.internal.ads.zzpq r0 = r6.zzc
            r1 = r7
            r2 = r9
            r4 = r11
            r0.zze(r1, r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzam(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzpq r0 = r1.zzc
            r0.zzf(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzan(com.google.android.gms.internal.ads.zzaf r6, android.media.MediaFormat r7) throws com.google.android.gms.internal.ads.zzij {
            r5 = this;
            com.google.android.gms.internal.ads.zzaf r0 = r5.zzj
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L9
            r6 = r0
            goto Le2
        L9:
            com.google.android.gms.internal.ads.zzst r0 = r5.zzaz()
            if (r0 != 0) goto L11
            goto Le2
        L11:
            java.util.Objects.requireNonNull(r7)
            java.lang.String r0 = r6.zzn
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L21
            int r0 = r6.zzD
            goto L46
        L21:
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r4 = 24
            if (r0 < r4) goto L34
            java.lang.String r0 = "pcm-encoding"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L34
            int r0 = r7.getInteger(r0)
            goto L46
        L34:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L45
            int r0 = r7.getInteger(r0)
            int r0 = com.google.android.gms.internal.ads.zzeu.zzm(r0)
            goto L46
        L45:
            r0 = 2
        L46:
            com.google.android.gms.internal.ads.zzad r4 = new com.google.android.gms.internal.ads.zzad
            r4.<init>()
            r4.zzZ(r3)
            r4.zzT(r0)
            int r0 = r6.zzE
            r4.zzG(r0)
            int r0 = r6.zzF
            r4.zzH(r0)
            com.google.android.gms.internal.ads.zzbk r0 = r6.zzk
            r4.zzS(r0)
            java.lang.String r0 = r6.zza
            r4.zzL(r0)
            java.lang.String r0 = r6.zzb
            r4.zzN(r0)
            java.util.List r0 = r6.zzc
            r4.zzO(r0)
            java.lang.String r0 = r6.zzd
            r4.zzP(r0)
            int r0 = r6.zze
            r4.zzab(r0)
            int r0 = r6.zzf
            r4.zzX(r0)
            java.lang.String r0 = "channel-count"
            int r0 = r7.getInteger(r0)
            r4.zzz(r0)
            java.lang.String r0 = "sample-rate"
            int r7 = r7.getInteger(r0)
            r4.zzaa(r7)
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzaf()
            boolean r0 = r5.zzg
            r3 = 6
            if (r0 == 0) goto Lad
            int r0 = r7.zzB
            if (r0 != r3) goto Lad
            int r0 = r6.zzB
            if (r0 >= r3) goto Lad
            int[] r2 = new int[r0]
            r0 = 0
        La4:
            int r3 = r6.zzB
            if (r0 >= r3) goto Le1
            r2[r0] = r0
            int r0 = r0 + 1
            goto La4
        Lad:
            boolean r6 = r5.zzh
            if (r6 == 0) goto Le1
            int r6 = r7.zzB
            r0 = 3
            if (r6 == r0) goto Ldb
            r0 = 5
            if (r6 == r0) goto Ld5
            if (r6 == r3) goto Lcf
            r0 = 7
            if (r6 == r0) goto Lc9
            r0 = 8
            if (r6 == r0) goto Lc3
            goto Le1
        Lc3:
            int[] r6 = new int[r0]
            r6 = {x010a: FILL_ARRAY_DATA , data: [0, 2, 1, 7, 5, 6, 3, 4} // fill-array
            goto Le0
        Lc9:
            int[] r6 = new int[r0]
            r6 = {x011e: FILL_ARRAY_DATA , data: [0, 2, 1, 6, 5, 3, 4} // fill-array
            goto Le0
        Lcf:
            int[] r6 = new int[r3]
            r6 = {x0130: FILL_ARRAY_DATA , data: [0, 2, 1, 5, 3, 4} // fill-array
            goto Le0
        Ld5:
            int[] r6 = new int[r0]
            r6 = {x0140: FILL_ARRAY_DATA , data: [0, 2, 1, 3, 4} // fill-array
            goto Le0
        Ldb:
            int[] r6 = new int[r0]
            r6 = {x014e: FILL_ARRAY_DATA , data: [0, 2, 1} // fill-array
        Le0:
            r2 = r6
        Le1:
            r6 = r7
        Le2:
            int r7 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: com.google.android.gms.internal.ads.zzpt -> Lff
            r0 = 29
            if (r7 < r0) goto Lf9
            boolean r3 = r5.zzaL()     // Catch: com.google.android.gms.internal.ads.zzpt -> Lff
            if (r3 == 0) goto Lf1
            r5.zzn()     // Catch: com.google.android.gms.internal.ads.zzpt -> Lff
        Lf1:
            if (r7 < r0) goto Lf5
            r7 = 1
            goto Lf6
        Lf5:
            r7 = 0
        Lf6:
            com.google.android.gms.internal.ads.zzdi.zzf(r7)     // Catch: com.google.android.gms.internal.ads.zzpt -> Lff
        Lf9:
            com.google.android.gms.internal.ads.zzpy r7 = r5.zzd     // Catch: com.google.android.gms.internal.ads.zzpt -> Lff
            r7.zze(r6, r1, r2)     // Catch: com.google.android.gms.internal.ads.zzpt -> Lff
            return
        Lff:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzaf r7 = r6.zza
            r0 = 5001(0x1389, float:7.008E-42)
            com.google.android.gms.internal.ads.zzij r6 = r5.zzcY(r6, r7, r1, r0)
            throw r6
    }

    protected final void zzao() {
            r1 = this;
            r0 = 1
            r1.zzl = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzap() {
            r1 = this;
            com.google.android.gms.internal.ads.zzpy r0 = r1.zzd
            r0.zzg()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzaq() throws com.google.android.gms.internal.ads.zzij {
            r4 = this;
            com.google.android.gms.internal.ads.zzpy r0 = r4.zzd     // Catch: com.google.android.gms.internal.ads.zzpx -> L6
            r0.zzj()     // Catch: com.google.android.gms.internal.ads.zzpx -> L6
            return
        L6:
            r0 = move-exception
            r1 = 1
            boolean r2 = r4.zzaL()
            if (r1 == r2) goto L11
            r1 = 5002(0x138a, float:7.009E-42)
            goto L13
        L11:
            r1 = 5003(0x138b, float:7.01E-42)
        L13:
            com.google.android.gms.internal.ads.zzaf r2 = r0.zzc
            boolean r3 = r0.zzb
            com.google.android.gms.internal.ads.zzij r0 = r4.zzcY(r0, r2, r3, r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final boolean zzar(long r1, long r3, com.google.android.gms.internal.ads.zzst r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, com.google.android.gms.internal.ads.zzaf r14) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            java.util.Objects.requireNonNull(r6)
            com.google.android.gms.internal.ads.zzaf r1 = r0.zzj
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r8 & 2
            if (r1 == 0) goto L14
            java.util.Objects.requireNonNull(r5)
            r5.zzo(r7, r3)
            return r2
        L14:
            if (r12 == 0) goto L28
            if (r5 == 0) goto L1b
            r5.zzo(r7, r3)
        L1b:
            com.google.android.gms.internal.ads.zzia r1 = r0.zza
            int r3 = r1.zzf
            int r3 = r3 + r9
            r1.zzf = r3
            com.google.android.gms.internal.ads.zzpy r1 = r0.zzd
            r1.zzg()
            return r2
        L28:
            com.google.android.gms.internal.ads.zzpy r1 = r0.zzd     // Catch: com.google.android.gms.internal.ads.zzpx -> L3e com.google.android.gms.internal.ads.zzpu -> L52
            boolean r1 = r1.zzx(r6, r10, r9)     // Catch: com.google.android.gms.internal.ads.zzpx -> L3e com.google.android.gms.internal.ads.zzpu -> L52
            if (r1 == 0) goto L3d
            if (r5 == 0) goto L35
            r5.zzo(r7, r3)
        L35:
            com.google.android.gms.internal.ads.zzia r1 = r0.zza
            int r3 = r1.zze
            int r3 = r3 + r9
            r1.zze = r3
            return r2
        L3d:
            return r3
        L3e:
            r1 = move-exception
            boolean r2 = r0.zzaL()
            if (r2 != 0) goto L46
            goto L49
        L46:
            r0.zzn()
        L49:
            boolean r2 = r1.zzb
            r3 = 5002(0x138a, float:7.009E-42)
            com.google.android.gms.internal.ads.zzij r1 = r0.zzcY(r1, r14, r2, r3)
            throw r1
        L52:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzaf r2 = r0.zzi
            boolean r3 = r0.zzaL()
            if (r3 == 0) goto L5e
            r0.zzn()
        L5e:
            boolean r3 = r1.zzb
            r4 = 5001(0x1389, float:7.008E-42)
            com.google.android.gms.internal.ads.zzij r1 = r0.zzcY(r1, r2, r3, r4)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final boolean zzas(com.google.android.gms.internal.ads.zzaf r2) {
            r1 = this;
            r1.zzn()
            com.google.android.gms.internal.ads.zzpy r0 = r1.zzd
            boolean r2 = r0.zzA(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final com.google.android.gms.internal.ads.zzbq zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzpy r0 = r1.zzd
            com.google.android.gms.internal.ads.zzbq r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final void zzg(com.google.android.gms.internal.ads.zzbq r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzpy r0 = r1.zzd
            r0.zzs(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final boolean zzj() {
            r2 = this;
            boolean r0 = r2.zzn
            r1 = 0
            r2.zzn = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlr
    public final com.google.android.gms.internal.ads.zzkt zzl() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlm
    public final void zzu(int r3, java.lang.Object r4) throws com.google.android.gms.internal.ads.zzij {
            r2 = this;
            r0 = 2
            if (r3 == r0) goto L95
            r0 = 3
            if (r3 == r0) goto L8a
            r0 = 6
            if (r3 == r0) goto L7f
            r0 = 12
            if (r3 == r0) goto L73
            r0 = 16
            r1 = 35
            if (r3 == r0) goto L48
            r0 = 9
            if (r3 == r0) goto L39
            r0 = 10
            if (r3 == r0) goto L1f
            super.zzu(r3, r4)
            return
        L1f:
            java.util.Objects.requireNonNull(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            com.google.android.gms.internal.ads.zzpy r4 = r2.zzd
            r4.zzn(r3)
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            if (r4 < r1) goto L7e
            com.google.android.gms.internal.ads.zzsp r4 = r2.zze
            if (r4 == 0) goto L7e
            r4.zzd(r3)
            return
        L39:
            com.google.android.gms.internal.ads.zzpy r3 = r2.zzd
            java.util.Objects.requireNonNull(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r3.zzv(r4)
            return
        L48:
            java.util.Objects.requireNonNull(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            r2.zzo = r3
            com.google.android.gms.internal.ads.zzst r3 = r2.zzaz()
            if (r3 == 0) goto L7e
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            if (r4 < r1) goto L7e
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            int r0 = r2.zzo
            int r0 = -r0
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.String r1 = "importance"
            r4.putInt(r1, r0)
            r3.zzq(r4)
            return
        L73:
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            r0 = 23
            if (r3 < r0) goto L7e
            com.google.android.gms.internal.ads.zzpy r3 = r2.zzd
            com.google.android.gms.internal.ads.zzrf.zza(r3, r4)
        L7e:
            return
        L7f:
            com.google.android.gms.internal.ads.zzi r4 = (com.google.android.gms.internal.ads.zzi) r4
            com.google.android.gms.internal.ads.zzpy r3 = r2.zzd
            java.util.Objects.requireNonNull(r4)
            r3.zzo(r4)
            return
        L8a:
            com.google.android.gms.internal.ads.zzh r4 = (com.google.android.gms.internal.ads.zzh) r4
            com.google.android.gms.internal.ads.zzpy r3 = r2.zzd
            java.util.Objects.requireNonNull(r4)
            r3.zzm(r4)
            return
        L95:
            com.google.android.gms.internal.ads.zzpy r3 = r2.zzd
            java.util.Objects.requireNonNull(r4)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r3.zzw(r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    protected final void zzx() {
            r3 = this;
            r0 = 1
            r3.zzm = r0
            r0 = 0
            r3.zzi = r0
            com.google.android.gms.internal.ads.zzpy r0 = r3.zzd     // Catch: java.lang.Throwable -> L18
            r0.zzf()     // Catch: java.lang.Throwable -> L18
            super.zzx()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.zzpq r0 = r3.zzc
            com.google.android.gms.internal.ads.zzia r1 = r3.zza
            r0.zzg(r1)
            return
        L16:
            r0 = move-exception
            goto L24
        L18:
            r0 = move-exception
            super.zzx()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.zzpq r1 = r3.zzc
            com.google.android.gms.internal.ads.zzia r2 = r3.zza
            r1.zzg(r2)
            throw r0
        L24:
            com.google.android.gms.internal.ads.zzpq r1 = r3.zzc
            com.google.android.gms.internal.ads.zzia r2 = r3.zza
            r1.zzg(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    protected final void zzy(boolean r1, boolean r2) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            super.zzy(r1, r2)
            com.google.android.gms.internal.ads.zzpq r1 = r0.zzc
            com.google.android.gms.internal.ads.zzia r2 = r0.zza
            r1.zzh(r2)
            r0.zzn()
            com.google.android.gms.internal.ads.zzpy r1 = r0.zzd
            com.google.android.gms.internal.ads.zzom r2 = r0.zzo()
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzpy r1 = r0.zzd
            com.google.android.gms.internal.ads.zzdj r2 = r0.zzi()
            r1.zzp(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    protected final void zzz(long r1, boolean r3) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            super.zzz(r1, r3)
            com.google.android.gms.internal.ads.zzpy r3 = r0.zzd
            r3.zzf()
            r0.zzk = r1
            r1 = 0
            r0.zzn = r1
            r1 = 1
            r0.zzl = r1
            return
    }
}
