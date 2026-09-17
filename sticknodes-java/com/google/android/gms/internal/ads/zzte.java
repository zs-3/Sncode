package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzte extends com.google.android.gms.internal.ads.zzhz {
    private static final byte[] zzb = null;
    private int zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private int zzI;
    private int zzJ;
    private java.nio.ByteBuffer zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private long zzX;
    private long zzY;
    private boolean zzZ;
    protected com.google.android.gms.internal.ads.zzia zza;
    private boolean zzaa;
    private boolean zzab;
    private com.google.android.gms.internal.ads.zztd zzac;
    private long zzad;
    private boolean zzae;
    private com.google.android.gms.internal.ads.zzrw zzaf;
    private com.google.android.gms.internal.ads.zzrw zzag;
    private final com.google.android.gms.internal.ads.zzsr zzc;
    private final com.google.android.gms.internal.ads.zztg zzd;
    private final float zze;
    private final com.google.android.gms.internal.ads.zzhq zzf;
    private final com.google.android.gms.internal.ads.zzhq zzg;
    private final com.google.android.gms.internal.ads.zzhq zzh;
    private final com.google.android.gms.internal.ads.zzsk zzi;
    private final android.media.MediaCodec.BufferInfo zzj;
    private final java.util.ArrayDeque zzk;
    private final com.google.android.gms.internal.ads.zzrj zzl;
    private com.google.android.gms.internal.ads.zzaf zzm;
    private com.google.android.gms.internal.ads.zzaf zzn;
    private com.google.android.gms.internal.ads.zzlq zzo;
    private android.media.MediaCrypto zzp;
    private float zzq;
    private float zzr;
    private com.google.android.gms.internal.ads.zzst zzs;
    private com.google.android.gms.internal.ads.zzaf zzt;
    private android.media.MediaFormat zzu;
    private boolean zzv;
    private float zzw;
    private java.util.ArrayDeque zzx;
    private com.google.android.gms.internal.ads.zzta zzy;
    private com.google.android.gms.internal.ads.zzsw zzz;

    static {
            r0 = 38
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120} // fill-array
            com.google.android.gms.internal.ads.zzte.zzb = r0
            return
    }

    public zzte(int r1, com.google.android.gms.internal.ads.zzsr r2, com.google.android.gms.internal.ads.zztg r3, boolean r4, float r5) {
            r0 = this;
            r0.<init>(r1)
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r5
            com.google.android.gms.internal.ads.zzhq r1 = new com.google.android.gms.internal.ads.zzhq
            r2 = 0
            r1.<init>(r2, r2)
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzhq r1 = new com.google.android.gms.internal.ads.zzhq
            r1.<init>(r2, r2)
            r0.zzg = r1
            com.google.android.gms.internal.ads.zzhq r1 = new com.google.android.gms.internal.ads.zzhq
            r3 = 2
            r1.<init>(r3, r2)
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzsk r1 = new com.google.android.gms.internal.ads.zzsk
            r1.<init>()
            r0.zzi = r1
            android.media.MediaCodec$BufferInfo r3 = new android.media.MediaCodec$BufferInfo
            r3.<init>()
            r0.zzj = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.zzq = r3
            r0.zzr = r3
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r0.zzk = r3
            com.google.android.gms.internal.ads.zztd r3 = com.google.android.gms.internal.ads.zztd.zza
            r0.zzac = r3
            r1.zzj(r2)
            java.nio.ByteBuffer r1 = r1.zzc
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r1.order(r3)
            com.google.android.gms.internal.ads.zzrj r1 = new com.google.android.gms.internal.ads.zzrj
            r1.<init>()
            r0.zzl = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.zzw = r1
            r0.zzA = r2
            r0.zzR = r2
            r1 = -1
            r0.zzI = r1
            r0.zzJ = r1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzH = r3
            r0.zzX = r3
            r0.zzY = r3
            r0.zzad = r3
            r0.zzS = r2
            r0.zzT = r2
            com.google.android.gms.internal.ads.zzia r1 = new com.google.android.gms.internal.ads.zzia
            r1.<init>()
            r0.zza = r1
            return
    }

    protected static boolean zzaP(com.google.android.gms.internal.ads.zzaf r0) {
            int r0 = r0.zzI
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    private final void zzaQ() {
            r1 = this;
            r0 = -1
            r1.zzJ = r0
            r0 = 0
            r1.zzK = r0
            return
    }

    private final void zzaR(com.google.android.gms.internal.ads.zztd r5) {
            r4 = this;
            r4.zzac = r5
            long r0 = r5.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L10
            r5 = 1
            r4.zzae = r5
        L10:
            return
    }

    private final void zzaS() throws com.google.android.gms.internal.ads.zzij {
            r1 = this;
            com.google.android.gms.internal.ads.zzrw r0 = r1.zzag
            java.util.Objects.requireNonNull(r0)
            r1.zzaf = r0
            r0 = 0
            r1.zzS = r0
            r1.zzT = r0
            return
    }

    @android.annotation.TargetApi(23)
    private final boolean zzaT() throws com.google.android.gms.internal.ads.zzij {
            r2 = this;
            boolean r0 = r2.zzU
            r1 = 1
            if (r0 == 0) goto L14
            r2.zzS = r1
            boolean r0 = r2.zzC
            if (r0 == 0) goto L10
            r0 = 3
            r2.zzT = r0
            r0 = 0
            return r0
        L10:
            r0 = 2
            r2.zzT = r0
            goto L17
        L14:
            r2.zzaS()
        L17:
            return r1
    }

    private final boolean zzaU() throws com.google.android.gms.internal.ads.zzij {
            r10 = this;
            com.google.android.gms.internal.ads.zzst r0 = r10.zzs
            r7 = 0
            if (r0 == 0) goto L1ef
            int r1 = r10.zzS
            r8 = 2
            if (r1 == r8) goto L1ef
            boolean r1 = r10.zzZ
            if (r1 == 0) goto L10
            goto L1ef
        L10:
            int r1 = r10.zzI
            if (r1 >= 0) goto L2a
            int r1 = r0.zza()
            r10.zzI = r1
            if (r1 >= 0) goto L1d
            return r7
        L1d:
            com.google.android.gms.internal.ads.zzhq r2 = r10.zzg
            java.nio.ByteBuffer r1 = r0.zzf(r1)
            r2.zzc = r1
            com.google.android.gms.internal.ads.zzhq r1 = r10.zzg
            r1.zzb()
        L2a:
            int r1 = r10.zzS
            r9 = 1
            if (r1 != r9) goto L45
            boolean r1 = r10.zzG
            if (r1 != 0) goto L42
            r10.zzV = r9
            int r1 = r10.zzI
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 4
            r0.zzk(r1, r2, r3, r4, r6)
            r10.zzao()
        L42:
            r10.zzS = r8
            return r7
        L45:
            boolean r1 = r10.zzE
            if (r1 == 0) goto L68
            r10.zzE = r7
            com.google.android.gms.internal.ads.zzhq r1 = r10.zzg
            java.nio.ByteBuffer r1 = r1.zzc
            java.util.Objects.requireNonNull(r1)
            byte[] r2 = com.google.android.gms.internal.ads.zzte.zzb
            r1.put(r2)
            int r1 = r10.zzI
            r2 = 0
            r3 = 38
            r4 = 0
            r6 = 0
            r0.zzk(r1, r2, r3, r4, r6)
            r10.zzao()
            r10.zzU = r9
            return r9
        L68:
            int r1 = r10.zzR
            if (r1 != r9) goto L93
            r1 = 0
        L6d:
            com.google.android.gms.internal.ads.zzaf r2 = r10.zzt
            java.util.Objects.requireNonNull(r2)
            java.util.List r2 = r2.zzq
            int r2 = r2.size()
            if (r1 >= r2) goto L91
            com.google.android.gms.internal.ads.zzaf r2 = r10.zzt
            java.util.List r2 = r2.zzq
            java.lang.Object r2 = r2.get(r1)
            byte[] r2 = (byte[]) r2
            com.google.android.gms.internal.ads.zzhq r3 = r10.zzg
            java.nio.ByteBuffer r3 = r3.zzc
            java.util.Objects.requireNonNull(r3)
            r3.put(r2)
            int r1 = r1 + 1
            goto L6d
        L91:
            r10.zzR = r8
        L93:
            com.google.android.gms.internal.ads.zzhq r1 = r10.zzg
            java.nio.ByteBuffer r1 = r1.zzc
            java.util.Objects.requireNonNull(r1)
            int r1 = r1.position()
            com.google.android.gms.internal.ads.zzkm r2 = r10.zzk()
            com.google.android.gms.internal.ads.zzhq r3 = r10.zzg     // Catch: com.google.android.gms.internal.ads.zzhp -> L1e4
            int r3 = r10.zzcW(r2, r3, r7)     // Catch: com.google.android.gms.internal.ads.zzhp -> L1e4
            r4 = -3
            if (r3 != r4) goto Lb6
            boolean r0 = r10.zzQ()
            if (r0 == 0) goto Lb5
            long r0 = r10.zzX
            r10.zzY = r0
        Lb5:
            return r7
        Lb6:
            r4 = -5
            if (r3 != r4) goto Lc8
            int r0 = r10.zzR
            if (r0 != r8) goto Lc4
            com.google.android.gms.internal.ads.zzhq r0 = r10.zzg
            r0.zzb()
            r10.zzR = r9
        Lc4:
            r10.zzac(r2)
            return r9
        Lc8:
            com.google.android.gms.internal.ads.zzhq r2 = r10.zzg
            boolean r3 = r2.zzf()
            if (r3 == 0) goto L10b
            long r3 = r10.zzX
            r10.zzY = r3
            int r1 = r10.zzR
            if (r1 != r8) goto Ldd
            r2.zzb()
            r10.zzR = r9
        Ldd:
            r10.zzZ = r9
            boolean r1 = r10.zzU
            if (r1 != 0) goto Le7
            r10.zzai()
            return r7
        Le7:
            boolean r1 = r10.zzG     // Catch: android.media.MediaCodec.CryptoException -> Lfb
            if (r1 != 0) goto Lfa
            r10.zzV = r9     // Catch: android.media.MediaCodec.CryptoException -> Lfb
            int r1 = r10.zzI     // Catch: android.media.MediaCodec.CryptoException -> Lfb
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 4
            r0.zzk(r1, r2, r3, r4, r6)     // Catch: android.media.MediaCodec.CryptoException -> Lfb
            r10.zzao()     // Catch: android.media.MediaCodec.CryptoException -> Lfb
        Lfa:
            return r7
        Lfb:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzaf r1 = r10.zzm
            int r2 = r0.getErrorCode()
            int r2 = com.google.android.gms.internal.ads.zzeu.zzk(r2)
            com.google.android.gms.internal.ads.zzij r0 = r10.zzcY(r0, r1, r7, r2)
            throw r0
        L10b:
            boolean r3 = r10.zzU
            if (r3 != 0) goto L11f
            boolean r3 = r2.zzg()
            if (r3 != 0) goto L11f
            r2.zzb()
            int r0 = r10.zzR
            if (r0 != r8) goto L11e
            r10.zzR = r9
        L11e:
            return r9
        L11f:
            boolean r2 = r10.zzaO(r2)
            if (r2 == 0) goto L132
            com.google.android.gms.internal.ads.zzhq r0 = r10.zzg
            r0.zzb()
            com.google.android.gms.internal.ads.zzia r0 = r10.zza
            int r1 = r0.zzd
            int r1 = r1 + r9
            r0.zzd = r1
            return r9
        L132:
            com.google.android.gms.internal.ads.zzhq r2 = r10.zzg
            boolean r3 = r2.zzl()
            if (r3 == 0) goto L13f
            com.google.android.gms.internal.ads.zzhn r2 = r2.zzb
            r2.zzb(r1)
        L13f:
            com.google.android.gms.internal.ads.zzhq r1 = r10.zzg
            long r4 = r1.zze
            boolean r1 = r10.zzab
            if (r1 == 0) goto L170
            java.util.ArrayDeque r1 = r10.zzk
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L162
            java.util.ArrayDeque r1 = r10.zzk
            java.lang.Object r1 = r1.peekLast()
            com.google.android.gms.internal.ads.zztd r1 = (com.google.android.gms.internal.ads.zztd) r1
            com.google.android.gms.internal.ads.zzeq r1 = r1.zze
            com.google.android.gms.internal.ads.zzaf r2 = r10.zzm
            java.util.Objects.requireNonNull(r2)
            r1.zzd(r4, r2)
            goto L16e
        L162:
            com.google.android.gms.internal.ads.zztd r1 = r10.zzac
            com.google.android.gms.internal.ads.zzeq r1 = r1.zze
            com.google.android.gms.internal.ads.zzaf r2 = r10.zzm
            java.util.Objects.requireNonNull(r2)
            r1.zzd(r4, r2)
        L16e:
            r10.zzab = r7
        L170:
            long r1 = r10.zzX
            long r1 = java.lang.Math.max(r1, r4)
            r10.zzX = r1
            boolean r6 = r10.zzQ()
            if (r6 != 0) goto L186
            com.google.android.gms.internal.ads.zzhq r6 = r10.zzg
            boolean r6 = r6.zzh()
            if (r6 == 0) goto L188
        L186:
            r10.zzY = r1
        L188:
            com.google.android.gms.internal.ads.zzhq r1 = r10.zzg
            r1.zzk()
            com.google.android.gms.internal.ads.zzhq r1 = r10.zzg
            boolean r2 = r1.zze()
            if (r2 == 0) goto L198
            r10.zzaj(r1)
        L198:
            com.google.android.gms.internal.ads.zzhq r1 = r10.zzg
            r10.zzaE(r1)
            com.google.android.gms.internal.ads.zzhq r1 = r10.zzg
            r10.zzau(r1)
            if (r3 == 0) goto L1b0
            int r1 = r10.zzI     // Catch: android.media.MediaCodec.CryptoException -> L1d4
            r2 = 0
            com.google.android.gms.internal.ads.zzhq r3 = r10.zzg     // Catch: android.media.MediaCodec.CryptoException -> L1d4
            com.google.android.gms.internal.ads.zzhn r3 = r3.zzb     // Catch: android.media.MediaCodec.CryptoException -> L1d4
            r6 = 0
            r0.zzl(r1, r2, r3, r4, r6)     // Catch: android.media.MediaCodec.CryptoException -> L1d4
            goto L1c5
        L1b0:
            int r1 = r10.zzI     // Catch: android.media.MediaCodec.CryptoException -> L1d4
            com.google.android.gms.internal.ads.zzhq r2 = r10.zzg     // Catch: android.media.MediaCodec.CryptoException -> L1d4
            java.nio.ByteBuffer r2 = r2.zzc     // Catch: android.media.MediaCodec.CryptoException -> L1d4
            java.util.Objects.requireNonNull(r2)
            r3 = 0
            int r6 = r2.limit()     // Catch: android.media.MediaCodec.CryptoException -> L1d4
            r8 = 0
            r2 = r3
            r3 = r6
            r6 = r8
            r0.zzk(r1, r2, r3, r4, r6)     // Catch: android.media.MediaCodec.CryptoException -> L1d4
        L1c5:
            r10.zzao()
            r10.zzU = r9
            r10.zzR = r7
            com.google.android.gms.internal.ads.zzia r0 = r10.zza
            int r1 = r0.zzc
            int r1 = r1 + r9
            r0.zzc = r1
            return r9
        L1d4:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzaf r1 = r10.zzm
            int r2 = r0.getErrorCode()
            int r2 = com.google.android.gms.internal.ads.zzeu.zzk(r2)
            com.google.android.gms.internal.ads.zzij r0 = r10.zzcY(r0, r1, r7, r2)
            throw r0
        L1e4:
            r0 = move-exception
            r10.zzak(r0)
            r10.zzaX(r7)
            r10.zzah()
            return r9
        L1ef:
            return r7
    }

    private final boolean zzaV() {
            r1 = this;
            int r0 = r1.zzJ
            if (r0 < 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private final boolean zzaW(long r5, long r7) {
            r4 = this;
            r0 = 0
            r1 = 1
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L1d
            com.google.android.gms.internal.ads.zzaf r2 = r4.zzn
            if (r2 == 0) goto L1c
            java.lang.String r2 = r2.zzn
            java.lang.String r3 = "audio/opus"
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L1c
            boolean r5 = com.google.android.gms.internal.ads.zzadw.zzf(r5, r7)
            if (r5 == 0) goto L1b
            goto L1d
        L1b:
            return r1
        L1c:
            r0 = 1
        L1d:
            return r0
    }

    private final boolean zzaX(int r4) throws com.google.android.gms.internal.ads.zzij {
            r3 = this;
            com.google.android.gms.internal.ads.zzhq r0 = r3.zzf
            com.google.android.gms.internal.ads.zzkm r1 = r3.zzk()
            r0.zzb()
            com.google.android.gms.internal.ads.zzhq r0 = r3.zzf
            r4 = r4 | 4
            int r4 = r3.zzcW(r1, r0, r4)
            r0 = 1
            r2 = -5
            if (r4 != r2) goto L19
            r3.zzac(r1)
            return r0
        L19:
            r1 = -4
            if (r4 != r1) goto L29
            com.google.android.gms.internal.ads.zzhq r4 = r3.zzf
            boolean r4 = r4.zzf()
            if (r4 == 0) goto L29
            r3.zzZ = r0
            r3.zzai()
        L29:
            r4 = 0
            return r4
    }

    private final boolean zzaY(com.google.android.gms.internal.ads.zzaf r5) throws com.google.android.gms.internal.ads.zzij {
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 1
            r2 = 23
            if (r0 >= r2) goto L8
            goto L53
        L8:
            com.google.android.gms.internal.ads.zzst r0 = r4.zzs
            if (r0 == 0) goto L53
            int r0 = r4.zzT
            r2 = 3
            if (r0 == r2) goto L53
            int r0 = r4.zzcV()
            if (r0 == 0) goto L53
            float r0 = r4.zzr
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.ads.zzaf[] r2 = r4.zzT()
            float r5 = r4.zzZ(r0, r5, r2)
            float r0 = r4.zzw
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L53
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 != 0) goto L35
            r4.zzae()
            r5 = 0
            return r5
        L35:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            float r0 = r4.zze
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L53
        L3f:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "operating-rate"
            r0.putFloat(r2, r5)
            com.google.android.gms.internal.ads.zzst r2 = r4.zzs
            java.util.Objects.requireNonNull(r2)
            r2.zzq(r0)
            r4.zzw = r5
        L53:
            return r1
    }

    private final void zzad() {
            r2 = this;
            r0 = 0
            r2.zzP = r0
            com.google.android.gms.internal.ads.zzsk r1 = r2.zzi
            r1.zzb()
            com.google.android.gms.internal.ads.zzhq r1 = r2.zzh
            r1.zzb()
            r2.zzO = r0
            r2.zzN = r0
            com.google.android.gms.internal.ads.zzrj r0 = r2.zzl
            r0.zzb()
            return
    }

    private final void zzae() throws com.google.android.gms.internal.ads.zzij {
            r1 = this;
            boolean r0 = r1.zzU
            if (r0 == 0) goto Lb
            r0 = 1
            r1.zzS = r0
            r0 = 3
            r1.zzT = r0
            return
        Lb:
            r1.zzaG()
            r1.zzaC()
            return
    }

    private final void zzah() {
            r1 = this;
            com.google.android.gms.internal.ads.zzst r0 = r1.zzs     // Catch: java.lang.Throwable -> Lc
            com.google.android.gms.internal.ads.zzdi.zzb(r0)     // Catch: java.lang.Throwable -> Lc
            r0.zzj()     // Catch: java.lang.Throwable -> Lc
            r1.zzaH()
            return
        Lc:
            r0 = move-exception
            r1.zzaH()
            throw r0
    }

    @android.annotation.TargetApi(23)
    private final void zzai() throws com.google.android.gms.internal.ads.zzij {
            r3 = this;
            int r0 = r3.zzT
            r1 = 1
            if (r0 == r1) goto L1f
            r2 = 2
            if (r0 == r2) goto L18
            r2 = 3
            if (r0 == r2) goto L11
            r3.zzaa = r1
            r3.zzaq()
            return
        L11:
            r3.zzaG()
            r3.zzaC()
            return
        L18:
            r3.zzah()
            r3.zzaS()
            return
        L1f:
            r3.zzah()
            return
    }

    private final void zzao() {
            r2 = this;
            r0 = -1
            r2.zzI = r0
            com.google.android.gms.internal.ads.zzhq r0 = r2.zzg
            r1 = 0
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzlq zzax(com.google.android.gms.internal.ads.zzte r0) {
            com.google.android.gms.internal.ads.zzlq r0 = r0.zzo
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected void zzC() {
            r2 = this;
            r0 = 0
            r2.zzad()     // Catch: java.lang.Throwable -> La
            r2.zzaG()     // Catch: java.lang.Throwable -> La
            r2.zzag = r0
            return
        La:
            r1 = move-exception
            r2.zzag = r0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected void zzF(com.google.android.gms.internal.ads.zzaf[] r16, long r17, long r19, com.google.android.gms.internal.ads.zzuy r21) throws com.google.android.gms.internal.ads.zzij {
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.ads.zztd r1 = r0.zzac
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            com.google.android.gms.internal.ads.zztd r1 = new com.google.android.gms.internal.ads.zztd
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.zzaR(r1)
            return
        L21:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            long r1 = r0.zzX
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            long r5 = r0.zzad
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L57
        L39:
            com.google.android.gms.internal.ads.zztd r1 = new com.google.android.gms.internal.ads.zztd
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.zzaR(r1)
            com.google.android.gms.internal.ads.zztd r1 = r0.zzac
            long r1 = r1.zzd
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L56
            r15.zzap()
        L56:
            return
        L57:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zztd r9 = new com.google.android.gms.internal.ads.zztd
            long r3 = r0.zzX
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlr
    public void zzM(float r1, float r2) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            r0.zzq = r1
            r0.zzr = r2
            com.google.android.gms.internal.ads.zzaf r1 = r0.zzt
            r0.zzaY(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public void zzV(long r22, long r24) throws com.google.android.gms.internal.ads.zzij {
            r21 = this;
            r15 = r21
            r14 = 1
            r13 = 0
            boolean r0 = r15.zzaa     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto Lc
            r21.zzaq()     // Catch: java.lang.IllegalStateException -> L3d5
            return
        Lc:
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzm     // Catch: java.lang.IllegalStateException -> L3d5
            r11 = 2
            if (r0 != 0) goto L19
            boolean r0 = r15.zzaX(r11)     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L18
            goto L19
        L18:
            return
        L19:
            r21.zzaC()     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r0 = r15.zzN     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L1ec
            java.lang.String r0 = "bypassRender"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.IllegalStateException -> L3d5
        L25:
            boolean r0 = r15.zzaa     // Catch: java.lang.IllegalStateException -> L3d5
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdi.zzf(r0)     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzsk r0 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r1 = r0.zzq()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L89
            java.nio.ByteBuffer r7 = r0.zzc     // Catch: java.lang.IllegalStateException -> L3d5
            int r8 = r15.zzJ     // Catch: java.lang.IllegalStateException -> L3d5
            int r10 = r0.zzm()     // Catch: java.lang.IllegalStateException -> L3d5
            long r11 = r0.zze     // Catch: java.lang.IllegalStateException -> L3d5
            long r1 = r21.zzf()     // Catch: java.lang.IllegalStateException -> L3d5
            long r3 = r0.zzn()     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r0 = r15.zzaW(r1, r3)     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzsk r1 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r16 = r1.zzf()     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzaf r9 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            java.util.Objects.requireNonNull(r9)
            r6 = 0
            r17 = 0
            r1 = r21
            r2 = r22
            r4 = r24
            r18 = r9
            r9 = r17
            r13 = r0
            r14 = r16
            r15 = r18
            boolean r0 = r1.zzar(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch: java.lang.IllegalStateException -> L83
            if (r0 == 0) goto L7d
            r15 = r21
            com.google.android.gms.internal.ads.zzsk r0 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            long r0 = r0.zzn()     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzaD(r0)     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzsk r0 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            r0.zzb()     // Catch: java.lang.IllegalStateException -> L3d5
            goto L89
        L7d:
            r15 = r21
            r13 = 0
            r14 = 1
            goto L1e3
        L83:
            r0 = move-exception
            r2 = 1
            r17 = 0
            goto L354
        L89:
            boolean r0 = r15.zzZ     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L93
            r14 = 1
            r15.zzaa = r14     // Catch: java.lang.IllegalStateException -> L3d5
            r13 = 0
            goto L1e3
        L93:
            r14 = 1
            boolean r0 = r15.zzO     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto La7
            com.google.android.gms.internal.ads.zzsk r0 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzhq r1 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r0 = r0.zzp(r1)     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzdi.zzf(r0)     // Catch: java.lang.IllegalStateException -> L3d5
            r13 = 0
            r15.zzO = r13     // Catch: java.lang.IllegalStateException -> L3d5
            goto La8
        La7:
            r13 = 0
        La8:
            boolean r0 = r15.zzP     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto Lc0
            com.google.android.gms.internal.ads.zzsk r0 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r0 = r0.zzq()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 != 0) goto L25
            r21.zzad()     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzP = r13     // Catch: java.lang.IllegalStateException -> L3d5
            r21.zzaC()     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r0 = r15.zzN     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L1e3
        Lc0:
            boolean r0 = r15.zzZ     // Catch: java.lang.IllegalStateException -> L3d5
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdi.zzf(r0)     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzkm r0 = r21.zzk()     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzhq r1 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            r1.zzb()     // Catch: java.lang.IllegalStateException -> L3d5
        Lcf:
            com.google.android.gms.internal.ads.zzhq r1 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            r1.zzb()     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzhq r1 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            int r1 = r15.zzcW(r0, r1, r13)     // Catch: java.lang.IllegalStateException -> L3d5
            r2 = -5
            if (r1 == r2) goto L1c3
            r2 = -4
            if (r1 == r2) goto Lec
            boolean r0 = r21.zzQ()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L1c6
            long r0 = r15.zzX     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzY = r0     // Catch: java.lang.IllegalStateException -> L3d5
            goto L1c6
        Lec:
            com.google.android.gms.internal.ads.zzhq r1 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r2 = r1.zzf()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r2 == 0) goto Lfc
            r15.zzZ = r14     // Catch: java.lang.IllegalStateException -> L3d5
            long r0 = r15.zzX     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzY = r0     // Catch: java.lang.IllegalStateException -> L3d5
            goto L1c6
        Lfc:
            long r2 = r15.zzX     // Catch: java.lang.IllegalStateException -> L3d5
            long r4 = r1.zze     // Catch: java.lang.IllegalStateException -> L3d5
            long r1 = java.lang.Math.max(r2, r4)     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzX = r1     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r3 = r21.zzQ()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r3 != 0) goto L114
            com.google.android.gms.internal.ads.zzhq r3 = r15.zzg     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r3 = r3.zzh()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r3 == 0) goto L116
        L114:
            r15.zzY = r1     // Catch: java.lang.IllegalStateException -> L3d5
        L116:
            boolean r1 = r15.zzab     // Catch: java.lang.IllegalStateException -> L3d5
            java.lang.String r2 = "audio/opus"
            if (r1 == 0) goto L15d
            com.google.android.gms.internal.ads.zzaf r1 = r15.zzm     // Catch: java.lang.IllegalStateException -> L3d5
            java.util.Objects.requireNonNull(r1)
            r15.zzn = r1     // Catch: java.lang.IllegalStateException -> L3d5
            java.lang.String r1 = r1.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r1 = java.util.Objects.equals(r1, r2)     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L155
            com.google.android.gms.internal.ads.zzaf r1 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            java.util.List r1 = r1.zzq     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r1 = r1.isEmpty()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 != 0) goto L155
            com.google.android.gms.internal.ads.zzaf r1 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            java.util.List r1 = r1.zzq     // Catch: java.lang.IllegalStateException -> L3d5
            java.lang.Object r1 = r1.get(r13)     // Catch: java.lang.IllegalStateException -> L3d5
            byte[] r1 = (byte[]) r1     // Catch: java.lang.IllegalStateException -> L3d5
            int r1 = com.google.android.gms.internal.ads.zzadw.zza(r1)     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzaf r3 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzad r3 = r3.zzb()     // Catch: java.lang.IllegalStateException -> L3d5
            r3.zzG(r1)     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzaf()     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzn = r1     // Catch: java.lang.IllegalStateException -> L3d5
        L155:
            com.google.android.gms.internal.ads.zzaf r1 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            r3 = 0
            r15.zzan(r1, r3)     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzab = r13     // Catch: java.lang.IllegalStateException -> L3d5
        L15d:
            com.google.android.gms.internal.ads.zzhq r1 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            r1.zzk()     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzaf r1 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L197
            java.lang.String r1 = r1.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r1 = java.util.Objects.equals(r1, r2)     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L197
            com.google.android.gms.internal.ads.zzhq r1 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r2 = r1.zze()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r2 == 0) goto L17d
            com.google.android.gms.internal.ads.zzaf r2 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            r1.zza = r2     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzaj(r1)     // Catch: java.lang.IllegalStateException -> L3d5
        L17d:
            long r1 = r21.zzf()     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzhq r3 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            long r4 = r3.zze     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r1 = com.google.android.gms.internal.ads.zzadw.zzf(r1, r4)     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L197
            com.google.android.gms.internal.ads.zzrj r1 = r15.zzl     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzaf r2 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            java.util.Objects.requireNonNull(r2)
            java.util.List r2 = r2.zzq     // Catch: java.lang.IllegalStateException -> L3d5
            r1.zza(r3, r2)     // Catch: java.lang.IllegalStateException -> L3d5
        L197:
            com.google.android.gms.internal.ads.zzsk r1 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r2 = r1.zzq()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r2 != 0) goto L1a0
            goto L1b6
        L1a0:
            long r2 = r21.zzf()     // Catch: java.lang.IllegalStateException -> L3d5
            long r4 = r1.zzn()     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r1 = r15.zzaW(r2, r4)     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzhq r4 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            long r4 = r4.zze     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r2 = r15.zzaW(r2, r4)     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 != r2) goto L1c0
        L1b6:
            com.google.android.gms.internal.ads.zzsk r1 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzhq r2 = r15.zzh     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r1 = r1.zzp(r2)     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 != 0) goto Lcf
        L1c0:
            r15.zzO = r14     // Catch: java.lang.IllegalStateException -> L3d5
            goto L1c6
        L1c3:
            r15.zzac(r0)     // Catch: java.lang.IllegalStateException -> L3d5
        L1c6:
            com.google.android.gms.internal.ads.zzsk r0 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r1 = r0.zzq()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L1d1
            r0.zzk()     // Catch: java.lang.IllegalStateException -> L3d5
        L1d1:
            com.google.android.gms.internal.ads.zzsk r0 = r15.zzi     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r0 = r0.zzq()     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 != 0) goto L25
            boolean r0 = r15.zzZ     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 != 0) goto L25
            boolean r0 = r15.zzP     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L1e3
            goto L25
        L1e3:
            android.os.Trace.endSection()     // Catch: java.lang.IllegalStateException -> L3d5
            r1 = r15
            r2 = 1
            r17 = 0
            goto L3ca
        L1ec:
            com.google.android.gms.internal.ads.zzst r0 = r15.zzs     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L3b8
            com.google.android.gms.internal.ads.zzdj r0 = r21.zzi()     // Catch: java.lang.IllegalStateException -> L3b3
            r0.zzb()     // Catch: java.lang.IllegalStateException -> L3b3
            java.lang.String r0 = "drainAndFeed"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.IllegalStateException -> L3b3
        L1fc:
            com.google.android.gms.internal.ads.zzst r6 = r15.zzs     // Catch: java.lang.IllegalStateException -> L3b3
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r21.zzaV()     // Catch: java.lang.IllegalStateException -> L3b3
            if (r0 != 0) goto L307
            boolean r0 = r15.zzD     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L221
            boolean r0 = r15.zzV     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L221
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch: java.lang.IllegalStateException -> L216
            int r0 = r6.zzb(r0)     // Catch: java.lang.IllegalStateException -> L216
            goto L227
        L216:
            r21.zzai()     // Catch: java.lang.IllegalStateException -> L3d5
            boolean r0 = r15.zzaa     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L259
            r21.zzaG()     // Catch: java.lang.IllegalStateException -> L3d5
            goto L259
        L221:
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch: java.lang.IllegalStateException -> L3d5
            int r0 = r6.zzb(r0)     // Catch: java.lang.IllegalStateException -> L3d5
        L227:
            if (r0 >= 0) goto L26a
            r1 = -2
            if (r0 != r1) goto L255
            r15.zzW = r14     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzst r0 = r15.zzs     // Catch: java.lang.IllegalStateException -> L3d5
            java.util.Objects.requireNonNull(r0)
            android.media.MediaFormat r0 = r0.zzc()     // Catch: java.lang.IllegalStateException -> L3d5
            int r1 = r15.zzA     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L250
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch: java.lang.IllegalStateException -> L3d5
            r2 = 32
            if (r1 != r2) goto L250
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 != r2) goto L250
            r15.zzF = r14     // Catch: java.lang.IllegalStateException -> L3d5
            goto L1fc
        L250:
            r15.zzu = r0     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzv = r14     // Catch: java.lang.IllegalStateException -> L3d5
            goto L1fc
        L255:
            boolean r0 = r15.zzG     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 != 0) goto L25e
        L259:
            r1 = r15
            r17 = 0
            goto L3a1
        L25e:
            boolean r0 = r15.zzZ     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 != 0) goto L266
            int r0 = r15.zzS     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 != r11) goto L259
        L266:
            r21.zzai()     // Catch: java.lang.IllegalStateException -> L3d5
            goto L259
        L26a:
            boolean r1 = r15.zzF     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L274
            r15.zzF = r13     // Catch: java.lang.IllegalStateException -> L3d5
            r6.zzo(r0, r13)     // Catch: java.lang.IllegalStateException -> L3d5
            goto L1fc
        L274:
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch: java.lang.IllegalStateException -> L3d5
            int r2 = r1.size     // Catch: java.lang.IllegalStateException -> L3d5
            if (r2 != 0) goto L284
            int r1 = r1.flags     // Catch: java.lang.IllegalStateException -> L3d5
            r1 = r1 & 4
            if (r1 == 0) goto L284
            r21.zzai()     // Catch: java.lang.IllegalStateException -> L3d5
            goto L259
        L284:
            r15.zzJ = r0     // Catch: java.lang.IllegalStateException -> L3d5
            java.nio.ByteBuffer r0 = r6.zzg(r0)     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzK = r0     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L2a1
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch: java.lang.IllegalStateException -> L3d5
            int r1 = r1.offset     // Catch: java.lang.IllegalStateException -> L3d5
            r0.position(r1)     // Catch: java.lang.IllegalStateException -> L3d5
            java.nio.ByteBuffer r0 = r15.zzK     // Catch: java.lang.IllegalStateException -> L3d5
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch: java.lang.IllegalStateException -> L3d5
            int r2 = r1.offset     // Catch: java.lang.IllegalStateException -> L3d5
            int r1 = r1.size     // Catch: java.lang.IllegalStateException -> L3d5
            int r2 = r2 + r1
            r0.limit(r2)     // Catch: java.lang.IllegalStateException -> L3d5
        L2a1:
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch: java.lang.IllegalStateException -> L3d5
            long r0 = r0.presentationTimeUs     // Catch: java.lang.IllegalStateException -> L3d5
            long r2 = r21.zzf()     // Catch: java.lang.IllegalStateException -> L3d5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2af
            r0 = 1
            goto L2b0
        L2af:
            r0 = 0
        L2b0:
            r15.zzL = r0     // Catch: java.lang.IllegalStateException -> L3d5
            long r0 = r15.zzY     // Catch: java.lang.IllegalStateException -> L3d5
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2c7
            android.media.MediaCodec$BufferInfo r2 = r15.zzj     // Catch: java.lang.IllegalStateException -> L3d5
            long r2 = r2.presentationTimeUs     // Catch: java.lang.IllegalStateException -> L3d5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L2c7
            r0 = 1
            goto L2c8
        L2c7:
            r0 = 0
        L2c8:
            r15.zzM = r0     // Catch: java.lang.IllegalStateException -> L3d5
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch: java.lang.IllegalStateException -> L3d5
            long r0 = r0.presentationTimeUs     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zztd r2 = r15.zzac     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzeq r2 = r2.zze     // Catch: java.lang.IllegalStateException -> L3d5
            java.lang.Object r0 = r2.zzc(r0)     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzaf r0 = (com.google.android.gms.internal.ads.zzaf) r0     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 != 0) goto L2ec
            boolean r1 = r15.zzae     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L2ec
            android.media.MediaFormat r1 = r15.zzu     // Catch: java.lang.IllegalStateException -> L3d5
            if (r1 == 0) goto L2ec
            com.google.android.gms.internal.ads.zztd r0 = r15.zzac     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzeq r0 = r0.zze     // Catch: java.lang.IllegalStateException -> L3d5
            java.lang.Object r0 = r0.zzb()     // Catch: java.lang.IllegalStateException -> L3d5
            com.google.android.gms.internal.ads.zzaf r0 = (com.google.android.gms.internal.ads.zzaf) r0     // Catch: java.lang.IllegalStateException -> L3d5
        L2ec:
            if (r0 == 0) goto L2f1
            r15.zzn = r0     // Catch: java.lang.IllegalStateException -> L3d5
            goto L2f9
        L2f1:
            boolean r0 = r15.zzv     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L307
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            if (r0 == 0) goto L307
        L2f9:
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3d5
            java.util.Objects.requireNonNull(r0)
            android.media.MediaFormat r1 = r15.zzu     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzan(r0, r1)     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzv = r13     // Catch: java.lang.IllegalStateException -> L3d5
            r15.zzae = r13     // Catch: java.lang.IllegalStateException -> L3d5
        L307:
            boolean r0 = r15.zzD     // Catch: java.lang.IllegalStateException -> L3b3
            if (r0 == 0) goto L35c
            boolean r0 = r15.zzV     // Catch: java.lang.IllegalStateException -> L358
            if (r0 == 0) goto L35c
            java.nio.ByteBuffer r7 = r15.zzK     // Catch: java.lang.IllegalStateException -> L342
            int r8 = r15.zzJ     // Catch: java.lang.IllegalStateException -> L342
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch: java.lang.IllegalStateException -> L342
            int r9 = r0.flags     // Catch: java.lang.IllegalStateException -> L342
            long r4 = r0.presentationTimeUs     // Catch: java.lang.IllegalStateException -> L342
            boolean r0 = r15.zzL     // Catch: java.lang.IllegalStateException -> L342
            boolean r12 = r15.zzM     // Catch: java.lang.IllegalStateException -> L342
            com.google.android.gms.internal.ads.zzaf r10 = r15.zzn     // Catch: java.lang.IllegalStateException -> L342
            java.util.Objects.requireNonNull(r10)
            r16 = 1
            r1 = r21
            r2 = r22
            r17 = r4
            r4 = r24
            r19 = r10
            r10 = r16
            r16 = r12
            r20 = 2
            r11 = r17
            r17 = 0
            r13 = r0
            r14 = r16
            r15 = r19
            boolean r0 = r1.zzar(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch: java.lang.IllegalStateException -> L344
            goto L37f
        L342:
            r17 = 0
        L344:
            r21.zzai()     // Catch: java.lang.IllegalStateException -> L352
            r15 = r21
            boolean r0 = r15.zzaa     // Catch: java.lang.IllegalStateException -> L3b0
            if (r0 == 0) goto L350
            r21.zzaG()     // Catch: java.lang.IllegalStateException -> L3b0
        L350:
            r1 = r15
            goto L3a1
        L352:
            r0 = move-exception
            r2 = 1
        L354:
            r1 = r21
            goto L3da
        L358:
            r0 = move-exception
            r17 = 0
            goto L3b1
        L35c:
            r17 = 0
            r20 = 2
            java.nio.ByteBuffer r7 = r15.zzK     // Catch: java.lang.IllegalStateException -> L3b0
            int r8 = r15.zzJ     // Catch: java.lang.IllegalStateException -> L3b0
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch: java.lang.IllegalStateException -> L3b0
            int r9 = r0.flags     // Catch: java.lang.IllegalStateException -> L3b0
            long r11 = r0.presentationTimeUs     // Catch: java.lang.IllegalStateException -> L3b0
            boolean r13 = r15.zzL     // Catch: java.lang.IllegalStateException -> L3b0
            boolean r14 = r15.zzM     // Catch: java.lang.IllegalStateException -> L3b0
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzn     // Catch: java.lang.IllegalStateException -> L3b0
            java.util.Objects.requireNonNull(r0)
            r10 = 1
            r1 = r21
            r2 = r22
            r4 = r24
            r15 = r0
            boolean r0 = r1.zzar(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch: java.lang.IllegalStateException -> L3ac
        L37f:
            if (r0 == 0) goto L39f
            r1 = r21
            android.media.MediaCodec$BufferInfo r0 = r1.zzj     // Catch: java.lang.IllegalStateException -> L3d2
            long r2 = r0.presentationTimeUs     // Catch: java.lang.IllegalStateException -> L3d2
            r1.zzaD(r2)     // Catch: java.lang.IllegalStateException -> L3d2
            android.media.MediaCodec$BufferInfo r0 = r1.zzj     // Catch: java.lang.IllegalStateException -> L3d2
            int r0 = r0.flags     // Catch: java.lang.IllegalStateException -> L3d2
            r0 = r0 & 4
            r21.zzaQ()     // Catch: java.lang.IllegalStateException -> L3d2
            if (r0 == 0) goto L399
            r21.zzai()     // Catch: java.lang.IllegalStateException -> L3d2
            goto L3a1
        L399:
            r15 = r1
            r11 = 2
            r13 = 0
            r14 = 1
            goto L1fc
        L39f:
            r1 = r21
        L3a1:
            boolean r0 = r21.zzaU()     // Catch: java.lang.IllegalStateException -> L3d2
            if (r0 != 0) goto L3a1
            android.os.Trace.endSection()     // Catch: java.lang.IllegalStateException -> L3d2
            r2 = 1
            goto L3ca
        L3ac:
            r0 = move-exception
            r1 = r21
            goto L3d3
        L3b0:
            r0 = move-exception
        L3b1:
            r1 = r15
            goto L3d3
        L3b3:
            r0 = move-exception
            r1 = r15
            r17 = 0
            goto L3d3
        L3b8:
            r1 = r15
            r17 = 0
            com.google.android.gms.internal.ads.zzia r0 = r1.zza     // Catch: java.lang.IllegalStateException -> L3d2
            int r2 = r0.zzd     // Catch: java.lang.IllegalStateException -> L3d2
            int r3 = r21.zzd(r22)     // Catch: java.lang.IllegalStateException -> L3d2
            int r2 = r2 + r3
            r0.zzd = r2     // Catch: java.lang.IllegalStateException -> L3d2
            r2 = 1
            r1.zzaX(r2)     // Catch: java.lang.IllegalStateException -> L3d0
        L3ca:
            com.google.android.gms.internal.ads.zzia r0 = r1.zza     // Catch: java.lang.IllegalStateException -> L3d0
            r0.zza()     // Catch: java.lang.IllegalStateException -> L3d0
            return
        L3d0:
            r0 = move-exception
            goto L3da
        L3d2:
            r0 = move-exception
        L3d3:
            r2 = 1
            goto L3da
        L3d5:
            r0 = move-exception
            r1 = r15
            r2 = 1
            r17 = 0
        L3da:
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L3df
            goto L3f4
        L3df:
            java.lang.StackTraceElement[] r4 = r0.getStackTrace()
            int r5 = r4.length
            if (r5 <= 0) goto L422
            r4 = r4[r17]
            java.lang.String r4 = r4.getClassName()
            java.lang.String r5 = "android.media.MediaCodec"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L422
        L3f4:
            r1.zzak(r0)
            if (r3 == 0) goto L404
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L404
            r14 = 1
            goto L405
        L404:
            r14 = 0
        L405:
            if (r14 == 0) goto L40a
            r21.zzaG()
        L40a:
            com.google.android.gms.internal.ads.zzsw r2 = r1.zzz
            com.google.android.gms.internal.ads.zzsv r0 = r1.zzaA(r0, r2)
            int r2 = r0.zzb
            r3 = 1101(0x44d, float:1.543E-42)
            if (r2 != r3) goto L419
            r2 = 4006(0xfa6, float:5.614E-42)
            goto L41b
        L419:
            r2 = 4003(0xfa3, float:5.61E-42)
        L41b:
            com.google.android.gms.internal.ads.zzaf r3 = r1.zzm
            com.google.android.gms.internal.ads.zzij r0 = r1.zzcY(r0, r3, r14, r2)
            throw r0
        L422:
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public boolean zzW() {
            r1 = this;
            boolean r0 = r1.zzaa
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public boolean zzX() {
            r7 = this;
            com.google.android.gms.internal.ads.zzaf r0 = r7.zzm
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            boolean r0 = r7.zzS()
            if (r0 != 0) goto L2e
            boolean r0 = r7.zzaV()
            if (r0 != 0) goto L2e
            long r3 = r7.zzH
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L2d
            com.google.android.gms.internal.ads.zzdj r0 = r7.zzi()
            long r3 = r0.zzb()
            long r5 = r7.zzH
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            r1 = 0
        L2e:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final int zzY(com.google.android.gms.internal.ads.zzaf r4) throws com.google.android.gms.internal.ads.zzij {
            r3 = this;
            com.google.android.gms.internal.ads.zztg r0 = r3.zzd     // Catch: com.google.android.gms.internal.ads.zztm -> L7
            int r4 = r3.zzaa(r0, r4)     // Catch: com.google.android.gms.internal.ads.zztm -> L7
            return r4
        L7:
            r0 = move-exception
            r1 = 0
            r2 = 4002(0xfa2, float:5.608E-42)
            com.google.android.gms.internal.ads.zzij r4 = r3.zzcY(r0, r4, r1, r2)
            throw r4
    }

    protected float zzZ(float r1, com.google.android.gms.internal.ads.zzaf r2, com.google.android.gms.internal.ads.zzaf[] r3) {
            r0 = this;
            r1 = 0
            throw r1
    }

    protected com.google.android.gms.internal.ads.zzsv zzaA(java.lang.Throwable r2, com.google.android.gms.internal.ads.zzsw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzsv r0 = new com.google.android.gms.internal.ads.zzsv
            r0.<init>(r2, r3)
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzsw zzaB() {
            r1 = this;
            com.google.android.gms.internal.ads.zzsw r0 = r1.zzz
            return r0
    }

    protected final void zzaC() throws com.google.android.gms.internal.ads.zzij {
            r23 = this;
            r8 = r23
            java.lang.String r9 = "MediaCodecRenderer"
            com.google.android.gms.internal.ads.zzst r0 = r8.zzs
            if (r0 != 0) goto L561
            boolean r0 = r8.zzN
            if (r0 != 0) goto L561
            com.google.android.gms.internal.ads.zzaf r10 = r8.zzm
            if (r10 != 0) goto L12
            goto L561
        L12:
            boolean r0 = r8.zzaM(r10)
            r11 = 1
            if (r0 == 0) goto L46
            r23.zzad()
            java.lang.String r0 = r10.zzn
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3c
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3c
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3c
            com.google.android.gms.internal.ads.zzsk r0 = r8.zzi
            r0.zzo(r11)
            goto L43
        L3c:
            com.google.android.gms.internal.ads.zzsk r0 = r8.zzi
            r1 = 32
            r0.zzo(r1)
        L43:
            r8.zzN = r11
            return
        L46:
            com.google.android.gms.internal.ads.zzrw r0 = r8.zzag
            r8.zzaf = r0
            if (r0 == 0) goto L56
            com.google.android.gms.internal.ads.zzdi.zzf(r11)
            com.google.android.gms.internal.ads.zzrw r0 = r8.zzaf
            boolean r1 = com.google.android.gms.internal.ads.zzrx.zza
            r0.zza()
        L56:
            r12 = 0
            com.google.android.gms.internal.ads.zzrw r0 = r8.zzaf     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            if (r0 == 0) goto L60
            java.lang.String r0 = r10.zzn     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            com.google.android.gms.internal.ads.zzdi.zzb(r0)     // Catch: com.google.android.gms.internal.ads.zzta -> L554
        L60:
            com.google.android.gms.internal.ads.zzaf r13 = r8.zzm     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            java.util.Objects.requireNonNull(r13)
            java.util.ArrayDeque r0 = r8.zzx     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            r14 = 0
            if (r0 != 0) goto L98
            com.google.android.gms.internal.ads.zztg r0 = r8.zzd     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            java.util.List r0 = r8.zzag(r0, r13, r12)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            r0.isEmpty()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            r1.<init>()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            r8.zzx = r1     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            boolean r1 = r0.isEmpty()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            if (r1 != 0) goto L8b
            java.util.ArrayDeque r1 = r8.zzx     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            java.lang.Object r0 = r0.get(r12)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            com.google.android.gms.internal.ads.zzsw r0 = (com.google.android.gms.internal.ads.zzsw) r0     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            r1.add(r0)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
        L8b:
            r8.zzy = r14     // Catch: com.google.android.gms.internal.ads.zztm -> L8e com.google.android.gms.internal.ads.zzta -> L554
            goto L98
        L8e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzta r1 = new com.google.android.gms.internal.ads.zzta     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>(r13, r0, r12, r2)     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            throw r1     // Catch: com.google.android.gms.internal.ads.zzta -> L554
        L98:
            java.util.ArrayDeque r0 = r8.zzx     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            boolean r0 = r0.isEmpty()     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            if (r0 != 0) goto L544
            java.util.ArrayDeque r15 = r8.zzx     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            java.util.Objects.requireNonNull(r15)
        La5:
            com.google.android.gms.internal.ads.zzst r0 = r8.zzs     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            if (r0 != 0) goto L53e
            java.lang.Object r0 = r15.peekFirst()     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            r6 = r0
            com.google.android.gms.internal.ads.zzsw r6 = (com.google.android.gms.internal.ads.zzsw) r6     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r8.zzaN(r6)     // Catch: com.google.android.gms.internal.ads.zzta -> L554
            if (r0 == 0) goto L561
            com.google.android.gms.internal.ads.zzaf r0 = r8.zzm     // Catch: java.lang.Exception -> L4fc
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = r6.zza     // Catch: java.lang.Exception -> L4fc
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Exception -> L4fc
            r3 = 23
            if (r1 >= r3) goto Lc9
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto Ld3
        Lc9:
            float r5 = r8.zzr     // Catch: java.lang.Exception -> L4fc
            com.google.android.gms.internal.ads.zzaf[] r7 = r23.zzT()     // Catch: java.lang.Exception -> L4fc
            float r5 = r8.zzZ(r5, r0, r7)     // Catch: java.lang.Exception -> L4fc
        Ld3:
            float r7 = r8.zze     // Catch: java.lang.Exception -> L4fc
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto Ldb
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        Ldb:
            r8.zzaF(r0)     // Catch: java.lang.Exception -> L4fc
            com.google.android.gms.internal.ads.zzdj r7 = r23.zzi()     // Catch: java.lang.Exception -> L4fc
            long r16 = r7.zzb()     // Catch: java.lang.Exception -> L4fc
            com.google.android.gms.internal.ads.zzsq r7 = r8.zzaf(r6, r0, r14, r5)     // Catch: java.lang.Exception -> L4fc
            r3 = 31
            if (r1 < r3) goto Lf5
            com.google.android.gms.internal.ads.zzom r1 = r23.zzo()     // Catch: java.lang.Exception -> L4fc
            com.google.android.gms.internal.ads.zzsz.zza(r7, r1)     // Catch: java.lang.Exception -> L4fc
        Lf5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4ed
            r1.<init>()     // Catch: java.lang.Throwable -> L4ed
            java.lang.String r3 = "createCodec:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L4ed
            r1.append(r2)     // Catch: java.lang.Throwable -> L4ed
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4ed
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L4ed
            com.google.android.gms.internal.ads.zzsr r1 = r8.zzc     // Catch: java.lang.Throwable -> L4ed
            com.google.android.gms.internal.ads.zzst r1 = r1.zzd(r7)     // Catch: java.lang.Throwable -> L4ed
            r8.zzs = r1     // Catch: java.lang.Throwable -> L4ed
            com.google.android.gms.internal.ads.zztc r3 = new com.google.android.gms.internal.ads.zztc     // Catch: java.lang.Throwable -> L4ed
            r3.<init>(r8, r14)     // Catch: java.lang.Throwable -> L4ed
            r1.zzs(r3)     // Catch: java.lang.Throwable -> L4ed
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> L4fc
            com.google.android.gms.internal.ads.zzdj r1 = r23.zzi()     // Catch: java.lang.Exception -> L4fc
            long r18 = r1.zzb()     // Catch: java.lang.Exception -> L4fc
            boolean r1 = r6.zze(r0)     // Catch: java.lang.Exception -> L4fc
            r3 = 2
            if (r1 != 0) goto L3ac
            java.lang.String r1 = "Format exceeds selected codec's capabilities [%s, %s]"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L3a3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a3
            r3.<init>()     // Catch: java.lang.Exception -> L3a3
            java.lang.String r11 = "id="
            r3.append(r11)     // Catch: java.lang.Exception -> L3a3
            java.lang.String r11 = r0.zza     // Catch: java.lang.Exception -> L3a3
            r3.append(r11)     // Catch: java.lang.Exception -> L3a3
            java.lang.String r11 = ", mimeType="
            r3.append(r11)     // Catch: java.lang.Exception -> L3a3
            java.lang.String r11 = r0.zzn     // Catch: java.lang.Exception -> L3a3
            r3.append(r11)     // Catch: java.lang.Exception -> L3a3
            java.lang.String r11 = r0.zzm     // Catch: java.lang.Exception -> L3a3
            if (r11 == 0) goto L156
            java.lang.String r11 = ", container="
            r3.append(r11)     // Catch: java.lang.Exception -> L4fc
            java.lang.String r11 = r0.zzm     // Catch: java.lang.Exception -> L4fc
            r3.append(r11)     // Catch: java.lang.Exception -> L4fc
        L156:
            int r11 = r0.zzi     // Catch: java.lang.Exception -> L3a3
            r12 = -1
            if (r11 == r12) goto L165
            java.lang.String r11 = ", bitrate="
            r3.append(r11)     // Catch: java.lang.Exception -> L4fc
            int r11 = r0.zzi     // Catch: java.lang.Exception -> L4fc
            r3.append(r11)     // Catch: java.lang.Exception -> L4fc
        L165:
            java.lang.String r11 = r0.zzj     // Catch: java.lang.Exception -> L3a3
            if (r11 == 0) goto L173
            java.lang.String r11 = ", codecs="
            r3.append(r11)     // Catch: java.lang.Exception -> L4fc
            java.lang.String r11 = r0.zzj     // Catch: java.lang.Exception -> L4fc
            r3.append(r11)     // Catch: java.lang.Exception -> L4fc
        L173:
            com.google.android.gms.internal.ads.zzy r11 = r0.zzr     // Catch: java.lang.Exception -> L3a3
            java.lang.String r4 = ","
            if (r11 == 0) goto L21a
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet     // Catch: java.lang.Exception -> L3a3
            r11.<init>()     // Catch: java.lang.Exception -> L3a3
            r20 = r10
            r12 = 0
        L181:
            com.google.android.gms.internal.ads.zzy r10 = r0.zzr     // Catch: java.lang.Exception -> L217
            r21 = r13
            int r13 = r10.zzb     // Catch: java.lang.Exception -> L214
            if (r12 >= r13) goto L204
            com.google.android.gms.internal.ads.zzx r10 = r10.zza(r12)     // Catch: java.lang.Exception -> L214
            java.util.UUID r10 = r10.zza     // Catch: java.lang.Exception -> L214
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzk.zzb     // Catch: java.lang.Exception -> L214
            boolean r13 = r10.equals(r13)     // Catch: java.lang.Exception -> L214
            if (r13 == 0) goto L1a5
            java.lang.String r10 = "cenc"
            r11.add(r10)     // Catch: java.lang.Exception -> L19f
        L19c:
            r22 = r15
            goto L1fc
        L19f:
            r0 = move-exception
            r13 = r6
            r22 = r15
            goto L4eb
        L1a5:
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzk.zzc     // Catch: java.lang.Exception -> L214
            boolean r13 = r10.equals(r13)     // Catch: java.lang.Exception -> L214
            if (r13 == 0) goto L1b3
            java.lang.String r10 = "clearkey"
            r11.add(r10)     // Catch: java.lang.Exception -> L19f
            goto L19c
        L1b3:
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzk.zze     // Catch: java.lang.Exception -> L214
            boolean r13 = r10.equals(r13)     // Catch: java.lang.Exception -> L214
            if (r13 == 0) goto L1c1
            java.lang.String r10 = "playready"
            r11.add(r10)     // Catch: java.lang.Exception -> L19f
            goto L19c
        L1c1:
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzk.zzd     // Catch: java.lang.Exception -> L214
            boolean r13 = r10.equals(r13)     // Catch: java.lang.Exception -> L214
            if (r13 == 0) goto L1cf
            java.lang.String r10 = "widevine"
            r11.add(r10)     // Catch: java.lang.Exception -> L19f
            goto L19c
        L1cf:
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzk.zza     // Catch: java.lang.Exception -> L214
            boolean r13 = r10.equals(r13)     // Catch: java.lang.Exception -> L214
            if (r13 == 0) goto L1dd
            java.lang.String r10 = "universal"
            r11.add(r10)     // Catch: java.lang.Exception -> L19f
            goto L19c
        L1dd:
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L214
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L214
            r13.<init>()     // Catch: java.lang.Exception -> L214
            r22 = r15
            java.lang.String r15 = "unknown ("
            r13.append(r15)     // Catch: java.lang.Exception -> L4e9
            r13.append(r10)     // Catch: java.lang.Exception -> L4e9
            java.lang.String r10 = ")"
            r13.append(r10)     // Catch: java.lang.Exception -> L4e9
            java.lang.String r10 = r13.toString()     // Catch: java.lang.Exception -> L4e9
            r11.add(r10)     // Catch: java.lang.Exception -> L4e9
        L1fc:
            int r12 = r12 + 1
            r13 = r21
            r15 = r22
            goto L181
        L204:
            r22 = r15
            java.lang.String r10 = ", drm=["
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            com.google.android.gms.internal.ads.zzfxr.zzb(r3, r11, r4)     // Catch: java.lang.Exception -> L4e9
            r10 = 93
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            goto L220
        L214:
            r0 = move-exception
            goto L3a8
        L217:
            r0 = move-exception
            goto L3a6
        L21a:
            r20 = r10
            r21 = r13
            r22 = r15
        L220:
            int r10 = r0.zzt     // Catch: java.lang.Exception -> L4e9
            r11 = -1
            if (r10 == r11) goto L23d
            int r10 = r0.zzu     // Catch: java.lang.Exception -> L4e9
            if (r10 == r11) goto L23d
            java.lang.String r10 = ", res="
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            int r10 = r0.zzt     // Catch: java.lang.Exception -> L4e9
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            java.lang.String r10 = "x"
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            int r10 = r0.zzu     // Catch: java.lang.Exception -> L4e9
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
        L23d:
            com.google.android.gms.internal.ads.zzo r10 = r0.zzA     // Catch: java.lang.Exception -> L4e9
            if (r10 == 0) goto L25b
            boolean r11 = r10.zze()     // Catch: java.lang.Exception -> L4e9
            if (r11 != 0) goto L24d
            boolean r10 = r10.zzf()     // Catch: java.lang.Exception -> L4e9
            if (r10 == 0) goto L25b
        L24d:
            java.lang.String r10 = ", color="
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            com.google.android.gms.internal.ads.zzo r10 = r0.zzA     // Catch: java.lang.Exception -> L4e9
            java.lang.String r10 = r10.zzd()     // Catch: java.lang.Exception -> L4e9
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
        L25b:
            float r10 = r0.zzv     // Catch: java.lang.Exception -> L4e9
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L26d
            java.lang.String r10 = ", fps="
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            float r10 = r0.zzv     // Catch: java.lang.Exception -> L4e9
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
        L26d:
            int r10 = r0.zzB     // Catch: java.lang.Exception -> L4e9
            r11 = -1
            if (r10 == r11) goto L27c
            java.lang.String r10 = ", channels="
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            int r10 = r0.zzB     // Catch: java.lang.Exception -> L4e9
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
        L27c:
            int r10 = r0.zzC     // Catch: java.lang.Exception -> L4e9
            r11 = -1
            if (r10 == r11) goto L28b
            java.lang.String r10 = ", sample_rate="
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            int r10 = r0.zzC     // Catch: java.lang.Exception -> L4e9
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
        L28b:
            java.lang.String r10 = r0.zzd     // Catch: java.lang.Exception -> L4e9
            if (r10 == 0) goto L299
            java.lang.String r10 = ", language="
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            java.lang.String r10 = r0.zzd     // Catch: java.lang.Exception -> L4e9
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
        L299:
            java.util.List r10 = r0.zzc     // Catch: java.lang.Exception -> L4e9
            boolean r10 = r10.isEmpty()     // Catch: java.lang.Exception -> L4e9
            java.lang.String r11 = "]"
            if (r10 != 0) goto L2b0
            java.lang.String r10 = ", labels=["
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            java.util.List r10 = r0.zzc     // Catch: java.lang.Exception -> L4e9
            com.google.android.gms.internal.ads.zzfxr.zzb(r3, r10, r4)     // Catch: java.lang.Exception -> L4e9
            r3.append(r11)     // Catch: java.lang.Exception -> L4e9
        L2b0:
            int r10 = r0.zze     // Catch: java.lang.Exception -> L4e9
            if (r10 == 0) goto L2d8
            java.lang.String r10 = ", selectionFlags=["
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            int r10 = r0.zze     // Catch: java.lang.Exception -> L4e9
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4e9
            r12.<init>()     // Catch: java.lang.Exception -> L4e9
            r13 = r10 & 1
            if (r13 == 0) goto L2c9
            java.lang.String r13 = "default"
            r12.add(r13)     // Catch: java.lang.Exception -> L4e9
        L2c9:
            r10 = r10 & 2
            if (r10 == 0) goto L2d2
            java.lang.String r10 = "forced"
            r12.add(r10)     // Catch: java.lang.Exception -> L4e9
        L2d2:
            com.google.android.gms.internal.ads.zzfxr.zzb(r3, r12, r4)     // Catch: java.lang.Exception -> L4e9
            r3.append(r11)     // Catch: java.lang.Exception -> L4e9
        L2d8:
            int r10 = r0.zzf     // Catch: java.lang.Exception -> L4e9
            r12 = 32768(0x8000, float:4.5918E-41)
            if (r10 == 0) goto L380
            java.lang.String r10 = ", roleFlags=["
            r3.append(r10)     // Catch: java.lang.Exception -> L4e9
            int r10 = r0.zzf     // Catch: java.lang.Exception -> L4e9
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4e9
            r13.<init>()     // Catch: java.lang.Exception -> L4e9
            r15 = r10 & 1
            if (r15 == 0) goto L2f4
            java.lang.String r15 = "main"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L2f4:
            r15 = r10 & 2
            if (r15 == 0) goto L2fd
            java.lang.String r15 = "alt"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L2fd:
            r15 = r10 & 4
            if (r15 == 0) goto L306
            java.lang.String r15 = "supplementary"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L306:
            r15 = r10 & 8
            if (r15 == 0) goto L30f
            java.lang.String r15 = "commentary"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L30f:
            r15 = r10 & 16
            if (r15 == 0) goto L318
            java.lang.String r15 = "dub"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L318:
            r15 = r10 & 32
            if (r15 == 0) goto L321
            java.lang.String r15 = "emergency"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L321:
            r15 = r10 & 64
            if (r15 == 0) goto L32a
            java.lang.String r15 = "caption"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L32a:
            r15 = r10 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L333
            java.lang.String r15 = "subtitle"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L333:
            r15 = r10 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L33c
            java.lang.String r15 = "sign"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L33c:
            r15 = r10 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L345
            java.lang.String r15 = "describes-video"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L345:
            r15 = r10 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L34e
            java.lang.String r15 = "describes-music"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L34e:
            r15 = r10 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L357
            java.lang.String r15 = "enhanced-intelligibility"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L357:
            r15 = r10 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L360
            java.lang.String r15 = "transcribes-dialog"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L360:
            r15 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L369
            java.lang.String r15 = "easy-read"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L369:
            r15 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L372
            java.lang.String r15 = "trick-play"
            r13.add(r15)     // Catch: java.lang.Exception -> L4e9
        L372:
            r10 = r10 & r12
            if (r10 == 0) goto L37a
            java.lang.String r10 = "auxiliary"
            r13.add(r10)     // Catch: java.lang.Exception -> L4e9
        L37a:
            com.google.android.gms.internal.ads.zzfxr.zzb(r3, r13, r4)     // Catch: java.lang.Exception -> L4e9
            r3.append(r11)     // Catch: java.lang.Exception -> L4e9
        L380:
            int r4 = r0.zzf     // Catch: java.lang.Exception -> L4e9
            r4 = r4 & r12
            if (r4 == 0) goto L38f
            java.lang.String r4 = ", auxiliaryTrackType="
            r3.append(r4)     // Catch: java.lang.Exception -> L4e9
            java.lang.String r4 = "undefined"
            r3.append(r4)     // Catch: java.lang.Exception -> L4e9
        L38f:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L4e9
            r4 = 0
            r14[r4] = r3     // Catch: java.lang.Exception -> L4e9
            r3 = 1
            r14[r3] = r2     // Catch: java.lang.Exception -> L4e9
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Exception -> L4e9
            java.lang.String r1 = java.lang.String.format(r3, r1, r14)     // Catch: java.lang.Exception -> L4e9
            com.google.android.gms.internal.ads.zzea.zzf(r9, r1)     // Catch: java.lang.Exception -> L4e9
            goto L3b2
        L3a3:
            r0 = move-exception
            r20 = r10
        L3a6:
            r21 = r13
        L3a8:
            r22 = r15
            goto L4ea
        L3ac:
            r20 = r10
            r21 = r13
            r22 = r15
        L3b2:
            r8.zzz = r6     // Catch: java.lang.Exception -> L4e9
            r8.zzw = r5     // Catch: java.lang.Exception -> L4e9
            r8.zzt = r0     // Catch: java.lang.Exception -> L4e9
            int r0 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Exception -> L4e9
            r1 = 25
            if (r0 > r1) goto L3ea
            java.lang.String r3 = "OMX.Exynos.avc.dec.secure"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Exception -> L4e9
            if (r3 == 0) goto L3ea
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeu.zzd     // Catch: java.lang.Exception -> L4e9
            java.lang.String r4 = "SM-T585"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L4e9
            if (r4 != 0) goto L3e8
            java.lang.String r4 = "SM-A510"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L4e9
            if (r4 != 0) goto L3e8
            java.lang.String r4 = "SM-A520"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L4e9
            if (r4 != 0) goto L3e8
            java.lang.String r4 = "SM-J700"
            boolean r3 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L4e9
            if (r3 == 0) goto L3ea
        L3e8:
            r3 = 2
            goto L423
        L3ea:
            r3 = 24
            if (r0 >= r3) goto L422
            java.lang.String r3 = "OMX.Nvidia.h264.decode"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Exception -> L4e9
            if (r3 != 0) goto L3fe
            java.lang.String r3 = "OMX.Nvidia.h264.decode.secure"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Exception -> L4e9
            if (r3 == 0) goto L422
        L3fe:
            java.lang.String r3 = "flounder"
            java.lang.String r4 = com.google.android.gms.internal.ads.zzeu.zzb     // Catch: java.lang.Exception -> L4e9
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r3 != 0) goto L420
            java.lang.String r3 = "flounder_lte"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r3 != 0) goto L420
            java.lang.String r3 = "grouper"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r3 != 0) goto L420
            java.lang.String r3 = "tilapia"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r3 == 0) goto L422
        L420:
            r3 = 1
            goto L423
        L422:
            r3 = 0
        L423:
            r8.zzA = r3     // Catch: java.lang.Exception -> L4e9
            r3 = 29
            if (r0 != r3) goto L433
            java.lang.String r4 = "c2.android.aac.decoder"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Exception -> L4e9
            if (r4 == 0) goto L433
            r4 = 1
            goto L434
        L433:
            r4 = 0
        L434:
            r8.zzB = r4     // Catch: java.lang.Exception -> L4e9
            r4 = 23
            if (r0 > r4) goto L444
            java.lang.String r4 = "OMX.google.vorbis.decoder"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Exception -> L4e9
            if (r4 == 0) goto L444
            r4 = 1
            goto L445
        L444:
            r4 = 0
        L445:
            r8.zzC = r4     // Catch: java.lang.Exception -> L4e9
            r4 = 21
            if (r0 != r4) goto L455
            java.lang.String r4 = "OMX.google.aac.decoder"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Exception -> L4e9
            if (r4 == 0) goto L455
            r4 = 1
            goto L456
        L455:
            r4 = 0
        L456:
            r8.zzD = r4     // Catch: java.lang.Exception -> L4e9
            java.lang.String r4 = r6.zza     // Catch: java.lang.Exception -> L4e9
            if (r0 > r1) goto L467
            java.lang.String r1 = "OMX.rk.video_decoder.avc"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r1 != 0) goto L465
            goto L467
        L465:
            r0 = 1
            goto L4b3
        L467:
            if (r0 > r3) goto L499
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r0 != 0) goto L465
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r0 != 0) goto L465
            java.lang.String r0 = "OMX.bcm.vdec.avc.tunnel"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r0 != 0) goto L465
            java.lang.String r0 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r0 != 0) goto L465
            java.lang.String r0 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r0 != 0) goto L465
            java.lang.String r0 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Exception -> L4e9
            if (r0 != 0) goto L465
        L499:
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeu.zzc     // Catch: java.lang.Exception -> L4e9
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L4e9
            if (r0 == 0) goto L4b2
            java.lang.String r0 = "AFTS"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeu.zzd     // Catch: java.lang.Exception -> L4e9
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L4e9
            if (r0 == 0) goto L4b2
            boolean r0 = r6.zzf     // Catch: java.lang.Exception -> L4e9
            if (r0 == 0) goto L4b2
            goto L465
        L4b2:
            r0 = 0
        L4b3:
            r8.zzG = r0     // Catch: java.lang.Exception -> L4e9
            com.google.android.gms.internal.ads.zzst r0 = r8.zzs     // Catch: java.lang.Exception -> L4e9
            java.util.Objects.requireNonNull(r0)
            int r0 = r23.zzcV()     // Catch: java.lang.Exception -> L4e9
            r1 = 2
            if (r0 != r1) goto L4ce
            com.google.android.gms.internal.ads.zzdj r0 = r23.zzi()     // Catch: java.lang.Exception -> L4e9
            long r0 = r0.zzb()     // Catch: java.lang.Exception -> L4e9
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r3
            r8.zzH = r0     // Catch: java.lang.Exception -> L4e9
        L4ce:
            com.google.android.gms.internal.ads.zzia r0 = r8.zza     // Catch: java.lang.Exception -> L4e9
            int r1 = r0.zza     // Catch: java.lang.Exception -> L4e9
            r10 = 1
            int r1 = r1 + r10
            r0.zza = r1     // Catch: java.lang.Exception -> L4e7
            long r11 = r18 - r16
            r1 = r23
            r3 = r7
            r4 = r18
            r13 = r6
            r6 = r11
            r1.zzal(r2, r3, r4, r6)     // Catch: java.lang.Exception -> L4fa
            r10 = r20
            r13 = r21
            goto L534
        L4e7:
            r0 = move-exception
            goto L504
        L4e9:
            r0 = move-exception
        L4ea:
            r13 = r6
        L4eb:
            r10 = 1
            goto L505
        L4ed:
            r0 = move-exception
            r20 = r10
            r21 = r13
            r22 = r15
            r10 = 1
            r13 = r6
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> L4fa
            throw r0     // Catch: java.lang.Exception -> L4fa
        L4fa:
            r0 = move-exception
            goto L505
        L4fc:
            r0 = move-exception
            r20 = r10
            r21 = r13
            r22 = r15
            r10 = 1
        L504:
            r13 = r6
        L505:
            java.lang.String r1 = r13.zza     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            java.lang.String r2 = "Failed to initialize decoder: "
            java.lang.String r1 = r2.concat(r1)     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            com.google.android.gms.internal.ads.zzea.zzg(r9, r1, r0)     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            r22.removeFirst()     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            com.google.android.gms.internal.ads.zzta r1 = new com.google.android.gms.internal.ads.zzta     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            r2 = r21
            r3 = 0
            r1.<init>(r2, r0, r3, r13)     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            r8.zzak(r1)     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            com.google.android.gms.internal.ads.zzta r0 = r8.zzy     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            if (r0 != 0) goto L525
            r8.zzy = r1     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            goto L52b
        L525:
            com.google.android.gms.internal.ads.zzta r0 = com.google.android.gms.internal.ads.zzta.zza(r0, r1)     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            r8.zzy = r0     // Catch: com.google.android.gms.internal.ads.zzta -> L552
        L52b:
            boolean r0 = r22.isEmpty()     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            if (r0 != 0) goto L53b
            r13 = r2
            r10 = r20
        L534:
            r15 = r22
            r11 = 1
            r12 = 0
            r14 = 0
            goto La5
        L53b:
            com.google.android.gms.internal.ads.zzta r0 = r8.zzy     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            throw r0     // Catch: com.google.android.gms.internal.ads.zzta -> L552
        L53e:
            r20 = r10
            r1 = r14
            r8.zzx = r1     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            return
        L544:
            r20 = r10
            r2 = r13
            com.google.android.gms.internal.ads.zzta r0 = new com.google.android.gms.internal.ads.zzta     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            r1 = -49999(0xffffffffffff3cb1, float:NaN)
            r3 = 0
            r4 = 0
            r0.<init>(r2, r3, r4, r1)     // Catch: com.google.android.gms.internal.ads.zzta -> L552
            throw r0     // Catch: com.google.android.gms.internal.ads.zzta -> L552
        L552:
            r0 = move-exception
            goto L557
        L554:
            r0 = move-exception
            r20 = r10
        L557:
            r1 = 4001(0xfa1, float:5.607E-42)
            r2 = r20
            r3 = 0
            com.google.android.gms.internal.ads.zzij r0 = r8.zzcY(r0, r2, r3, r1)
            throw r0
        L561:
            return
    }

    protected void zzaD(long r4) {
            r3 = this;
            r3.zzad = r4
        L2:
            java.util.ArrayDeque r0 = r3.zzk
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.ArrayDeque r0 = r3.zzk
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zztd r0 = (com.google.android.gms.internal.ads.zztd) r0
            long r0 = r0.zzb
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L2a
            java.util.ArrayDeque r0 = r3.zzk
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.zztd r0 = (com.google.android.gms.internal.ads.zztd) r0
            java.util.Objects.requireNonNull(r0)
            r3.zzaR(r0)
            r3.zzap()
            goto L2
        L2a:
            return
    }

    protected void zzaE(com.google.android.gms.internal.ads.zzhq r1) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            return
    }

    protected void zzaF(com.google.android.gms.internal.ads.zzaf r1) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            return
    }

    protected final void zzaG() {
            r3 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzst r1 = r3.zzs     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1a
            r1.zzm()     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzia r1 = r3.zza     // Catch: java.lang.Throwable -> L24
            int r2 = r1.zzb     // Catch: java.lang.Throwable -> L24
            int r2 = r2 + 1
            r1.zzb = r2     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzsw r1 = r3.zzz     // Catch: java.lang.Throwable -> L24
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r1.zza     // Catch: java.lang.Throwable -> L24
            r3.zzam(r1)     // Catch: java.lang.Throwable -> L24
        L1a:
            r3.zzs = r0
            r3.zzp = r0
            r3.zzaf = r0
            r3.zzaI()
            return
        L24:
            r1 = move-exception
            r3.zzs = r0
            r3.zzp = r0
            r3.zzaf = r0
            r3.zzaI()
            throw r1
    }

    protected void zzaH() {
            r3 = this;
            r3.zzao()
            r3.zzaQ()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzH = r0
            r2 = 0
            r3.zzV = r2
            r3.zzU = r2
            r3.zzE = r2
            r3.zzF = r2
            r3.zzL = r2
            r3.zzM = r2
            r3.zzX = r0
            r3.zzY = r0
            r3.zzad = r0
            r3.zzS = r2
            r3.zzT = r2
            boolean r0 = r3.zzQ
            r3.zzR = r0
            return
    }

    protected final void zzaI() {
            r2 = this;
            r2.zzaH()
            r0 = 0
            r2.zzx = r0
            r2.zzz = r0
            r2.zzt = r0
            r2.zzu = r0
            r0 = 0
            r2.zzv = r0
            r2.zzW = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.zzw = r1
            r2.zzA = r0
            r2.zzB = r0
            r2.zzC = r0
            r2.zzD = r0
            r2.zzG = r0
            r2.zzQ = r0
            r2.zzR = r0
            return
    }

    protected final boolean zzaJ() throws com.google.android.gms.internal.ads.zzij {
            r1 = this;
            boolean r0 = r1.zzaK()
            if (r0 == 0) goto L9
            r1.zzaC()
        L9:
            return r0
    }

    protected final boolean zzaK() {
            r5 = this;
            com.google.android.gms.internal.ads.zzst r0 = r5.zzs
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r5.zzT
            r2 = 3
            r3 = 1
            if (r0 == r2) goto L41
            boolean r2 = r5.zzB
            if (r2 == 0) goto L14
            boolean r2 = r5.zzW
            if (r2 == 0) goto L41
        L14:
            boolean r2 = r5.zzC
            if (r2 == 0) goto L1c
            boolean r2 = r5.zzV
            if (r2 != 0) goto L41
        L1c:
            r2 = 2
            if (r0 != r2) goto L3d
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r2 = 23
            if (r0 < r2) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            com.google.android.gms.internal.ads.zzdi.zzf(r4)
            if (r0 < r2) goto L3d
            r5.zzaS()     // Catch: com.google.android.gms.internal.ads.zzij -> L31
            goto L3d
        L31:
            r0 = move-exception
            java.lang.String r1 = "MediaCodecRenderer"
            java.lang.String r2 = "Failed to update the DRM session, releasing the codec instead."
            com.google.android.gms.internal.ads.zzea.zzg(r1, r2, r0)
            r5.zzaG()
            return r3
        L3d:
            r5.zzah()
            return r1
        L41:
            r5.zzaG()
            return r3
    }

    protected final boolean zzaL() {
            r1 = this;
            boolean r0 = r1.zzN
            return r0
    }

    protected final boolean zzaM(com.google.android.gms.internal.ads.zzaf r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzrw r0 = r1.zzag
            if (r0 != 0) goto Lc
            boolean r2 = r1.zzas(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    protected boolean zzaN(com.google.android.gms.internal.ads.zzsw r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    protected boolean zzaO(com.google.android.gms.internal.ads.zzhq r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected abstract int zzaa(com.google.android.gms.internal.ads.zztg r1, com.google.android.gms.internal.ads.zzaf r2) throws com.google.android.gms.internal.ads.zztm;

    protected com.google.android.gms.internal.ads.zzib zzab(com.google.android.gms.internal.ads.zzsw r1, com.google.android.gms.internal.ads.zzaf r2, com.google.android.gms.internal.ads.zzaf r3) {
            r0 = this;
            r1 = 0
            throw r1
    }

    protected com.google.android.gms.internal.ads.zzib zzac(com.google.android.gms.internal.ads.zzkm r12) throws com.google.android.gms.internal.ads.zzij {
            r11 = this;
            r0 = 1
            r11.zzab = r0
            com.google.android.gms.internal.ads.zzaf r1 = r12.zza
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = r1.zzn
            r3 = 0
            if (r2 == 0) goto Lff
            java.lang.String r4 = "video/av01"
            boolean r2 = r2.equals(r4)
            r4 = 0
            if (r2 == 0) goto L29
            java.util.List r2 = r1.zzq
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L29
            com.google.android.gms.internal.ads.zzad r1 = r1.zzb()
            r1.zzM(r4)
            com.google.android.gms.internal.ads.zzaf r1 = r1.zzaf()
        L29:
            r8 = r1
            com.google.android.gms.internal.ads.zzrw r12 = r12.zzb
            r11.zzag = r12
            r11.zzm = r8
            boolean r1 = r11.zzN
            if (r1 == 0) goto L37
            r11.zzP = r0
            return r4
        L37:
            com.google.android.gms.internal.ads.zzst r1 = r11.zzs
            if (r1 != 0) goto L41
            r11.zzx = r4
            r11.zzaC()
            return r4
        L41:
            com.google.android.gms.internal.ads.zzsw r2 = r11.zzz
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzaf r7 = r11.zzt
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.zzrw r4 = r11.zzaf
            if (r4 != r12) goto Lf0
            if (r12 == r4) goto L53
            r12 = 1
            goto L54
        L53:
            r12 = 0
        L54:
            if (r12 == 0) goto L5f
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            r5 = 23
            if (r4 < r5) goto L5d
            goto L5f
        L5d:
            r4 = 0
            goto L60
        L5f:
            r4 = 1
        L60:
            com.google.android.gms.internal.ads.zzdi.zzf(r4)
            com.google.android.gms.internal.ads.zzib r4 = r11.zzab(r2, r7, r8)
            int r5 = r4.zzd
            r6 = 3
            r9 = 16
            r10 = 2
            if (r5 == 0) goto Ld5
            if (r5 == r0) goto Lb1
            if (r5 == r10) goto L85
            boolean r0 = r11.zzaY(r8)
            if (r0 != 0) goto L7a
            goto Lb7
        L7a:
            r11.zzt = r8
            if (r12 == 0) goto Ld8
            boolean r12 = r11.zzaT()
            if (r12 != 0) goto Ld8
            goto Ld9
        L85:
            boolean r5 = r11.zzaY(r8)
            if (r5 != 0) goto L8c
            goto Lb7
        L8c:
            r11.zzQ = r0
            r11.zzR = r0
            int r5 = r11.zzA
            if (r5 == r10) goto La4
            if (r5 != r0) goto La3
            int r5 = r8.zzt
            int r9 = r7.zzt
            if (r5 != r9) goto La3
            int r5 = r8.zzu
            int r9 = r7.zzu
            if (r5 != r9) goto La3
            goto La4
        La3:
            r0 = 0
        La4:
            r11.zzE = r0
            r11.zzt = r8
            if (r12 == 0) goto Ld8
            boolean r12 = r11.zzaT()
            if (r12 != 0) goto Ld8
            goto Ld9
        Lb1:
            boolean r5 = r11.zzaY(r8)
            if (r5 != 0) goto Lba
        Lb7:
            r10 = 16
            goto Ld9
        Lba:
            r11.zzt = r8
            if (r12 == 0) goto Lc5
            boolean r12 = r11.zzaT()
            if (r12 != 0) goto Ld8
            goto Ld9
        Lc5:
            boolean r12 = r11.zzU
            if (r12 == 0) goto Ld8
            r11.zzS = r0
            boolean r12 = r11.zzC
            if (r12 == 0) goto Ld2
            r11.zzT = r6
            goto Ld9
        Ld2:
            r11.zzT = r0
            goto Ld8
        Ld5:
            r11.zzae()
        Ld8:
            r10 = 0
        Ld9:
            int r12 = r4.zzd
            if (r12 == 0) goto Lef
            com.google.android.gms.internal.ads.zzst r12 = r11.zzs
            if (r12 != r1) goto Le5
            int r12 = r11.zzT
            if (r12 != r6) goto Lef
        Le5:
            java.lang.String r6 = r2.zza
            com.google.android.gms.internal.ads.zzib r12 = new com.google.android.gms.internal.ads.zzib
            r9 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        Lef:
            return r4
        Lf0:
            r11.zzae()
            java.lang.String r6 = r2.zza
            com.google.android.gms.internal.ads.zzib r12 = new com.google.android.gms.internal.ads.zzib
            r9 = 0
            r10 = 128(0x80, float:1.794E-43)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        Lff:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample MIME type is null."
            r12.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.zzij r12 = r11.zzcY(r12, r1, r3, r0)
            throw r12
    }

    protected abstract com.google.android.gms.internal.ads.zzsq zzaf(com.google.android.gms.internal.ads.zzsw r1, com.google.android.gms.internal.ads.zzaf r2, android.media.MediaCrypto r3, float r4);

    protected abstract java.util.List zzag(com.google.android.gms.internal.ads.zztg r1, com.google.android.gms.internal.ads.zzaf r2, boolean r3) throws com.google.android.gms.internal.ads.zztm;

    protected void zzaj(com.google.android.gms.internal.ads.zzhq r1) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            r1 = 0
            throw r1
    }

    protected void zzak(java.lang.Exception r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    protected void zzal(java.lang.String r1, com.google.android.gms.internal.ads.zzsq r2, long r3, long r5) {
            r0 = this;
            r1 = 0
            throw r1
    }

    protected void zzam(java.lang.String r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    protected void zzan(com.google.android.gms.internal.ads.zzaf r1, android.media.MediaFormat r2) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            r1 = 0
            throw r1
    }

    protected void zzap() {
            r0 = this;
            return
    }

    protected void zzaq() throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            return
    }

    protected abstract boolean zzar(long r1, long r3, com.google.android.gms.internal.ads.zzst r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, com.google.android.gms.internal.ads.zzaf r14) throws com.google.android.gms.internal.ads.zzij;

    protected boolean zzas(com.google.android.gms.internal.ads.zzaf r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected final float zzat() {
            r1 = this;
            float r0 = r1.zzq
            return r0
    }

    protected int zzau(com.google.android.gms.internal.ads.zzhq r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected final long zzav() {
            r2 = this;
            com.google.android.gms.internal.ads.zztd r0 = r2.zzac
            long r0 = r0.zzd
            return r0
    }

    protected final long zzaw() {
            r2 = this;
            com.google.android.gms.internal.ads.zztd r0 = r2.zzac
            long r0 = r0.zzc
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzlq zzay() {
            r1 = this;
            com.google.android.gms.internal.ads.zzlq r0 = r1.zzo
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzst zzaz() {
            r1 = this;
            com.google.android.gms.internal.ads.zzst r0 = r1.zzs
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlu
    public final int zze() {
            r1 = this;
            r0 = 8
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlm
    public void zzu(int r2, java.lang.Object r3) throws com.google.android.gms.internal.ads.zzij {
            r1 = this;
            r0 = 11
            if (r2 != r0) goto L8
            com.google.android.gms.internal.ads.zzlq r3 = (com.google.android.gms.internal.ads.zzlq) r3
            r1.zzo = r3
        L8:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected void zzx() {
            r1 = this;
            r0 = 0
            r1.zzm = r0
            com.google.android.gms.internal.ads.zztd r0 = com.google.android.gms.internal.ads.zztd.zza
            r1.zzaR(r0)
            java.util.ArrayDeque r0 = r1.zzk
            r0.clear()
            r1.zzaK()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected void zzy(boolean r1, boolean r2) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            com.google.android.gms.internal.ads.zzia r1 = new com.google.android.gms.internal.ads.zzia
            r1.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected void zzz(long r1, boolean r3) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            r1 = 0
            r0.zzZ = r1
            r0.zzaa = r1
            boolean r2 = r0.zzN
            if (r2 == 0) goto L1b
            com.google.android.gms.internal.ads.zzsk r2 = r0.zzi
            r2.zzb()
            com.google.android.gms.internal.ads.zzhq r2 = r0.zzh
            r2.zzb()
            r0.zzO = r1
            com.google.android.gms.internal.ads.zzrj r1 = r0.zzl
            r1.zzb()
            goto L1e
        L1b:
            r0.zzaJ()
        L1e:
            com.google.android.gms.internal.ads.zztd r1 = r0.zzac
            com.google.android.gms.internal.ads.zzeq r1 = r1.zze
            int r2 = r1.zza()
            if (r2 <= 0) goto L2b
            r2 = 1
            r0.zzab = r2
        L2b:
            r1.zze()
            java.util.ArrayDeque r1 = r0.zzk
            r1.clear()
            return
    }
}
