package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzsw {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final android.media.MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    zzsw(java.lang.String r1, java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zzg = r5
            r0.zze = r8
            r0.zzf = r10
            r0.zzh = r11
            boolean r1 = com.google.android.gms.internal.ads.zzbn.zzi(r2)
            r0.zzi = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzsw zzc(java.lang.String r13, java.lang.String r14, java.lang.String r15, android.media.MediaCodecInfo.CodecCapabilities r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21) {
            r1 = r13
            r4 = r16
            com.google.android.gms.internal.ads.zzsw r12 = new com.google.android.gms.internal.ads.zzsw
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3c
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L3c
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            r5 = 22
            if (r3 > r5) goto L3a
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeu.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L29
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3a
        L29:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L3c
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L3a
            goto L3c
        L3a:
            r8 = 1
            goto L3d
        L3c:
            r8 = 0
        L3d:
            if (r4 == 0) goto L49
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L49
            r9 = 1
            goto L4a
        L49:
            r9 = 0
        L4a:
            if (r21 != 0) goto L59
            if (r4 == 0) goto L57
            java.lang.String r3 = "secure-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L57
            goto L59
        L57:
            r10 = 0
            goto L5a
        L59:
            r10 = 1
        L5a:
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            r5 = 35
            if (r3 < r5) goto L6c
            if (r4 == 0) goto L6c
            java.lang.String r3 = "detached-surface"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L6c
            r11 = 1
            goto L6d
        L6c:
            r11 = 0
        L6d:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
    }

    private static android.graphics.Point zzi(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5) {
            int r0 = r3.getWidthAlignment()
            int r3 = r3.getHeightAlignment()
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            int r4 = r4 + r0
            int r4 = r4 + (-1)
            int r4 = r4 / r0
            int r4 = r4 * r0
            int r5 = r5 + r3
            int r5 = r5 + (-1)
            int r5 = r5 / r3
            int r5 = r5 * r3
            r1.<init>(r4, r5)
            return r1
    }

    private final void zzj(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zze
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NoSupport ["
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "] ["
            r1.append(r4)
            java.lang.String r2 = r3.zza
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.String r2 = r3.zzb
            r1.append(r2)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.zzea.zzb(r0, r4)
            return
    }

    private static boolean zzk(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
            android.graphics.Point r4 = zzi(r3, r4, r5)
            int r5 = r4.x
            int r4 = r4.y
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L1e
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            goto L1e
        L15:
            double r6 = java.lang.Math.floor(r6)
            boolean r3 = r3.areSizeAndRateSupported(r5, r4, r6)
            return r3
        L1e:
            boolean r3 = r3.isSizeSupported(r5, r4)
            return r3
    }

    private final boolean zzl(com.google.android.gms.internal.ads.zzaf r12, boolean r13) {
            r11 = this;
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzts.zza(r12)
            java.lang.String r1 = r12.zzn
            java.lang.String r2 = "video/hevc"
            if (r1 == 0) goto L1e
            java.lang.String r3 = "video/mv-hevc"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1e
            java.lang.String r1 = r11.zzc
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1e
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzts.zzb(r12)
        L1e:
            r1 = 1
            if (r0 != 0) goto L23
            goto L11c
        L23:
            java.lang.Object r3 = r0.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r4 = r12.zzn
            java.lang.String r5 = "video/dolby-vision"
            boolean r4 = r5.equals(r4)
            r5 = 8
            r6 = 2
            r7 = 0
            if (r4 == 0) goto L59
            java.lang.String r4 = r11.zzb
            java.lang.String r8 = "video/avc"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L4f
            r0 = 0
            r3 = 8
            goto L59
        L4f:
            java.lang.String r4 = r11.zzb
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L59
            r0 = 0
            r3 = 2
        L59:
            boolean r4 = r11.zzi
            r8 = 42
            if (r4 != 0) goto L63
            if (r3 != r8) goto L11c
            r3 = 42
        L63:
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r11.zzh()
            int r8 = com.google.android.gms.internal.ads.zzeu.zza
            r9 = 23
            if (r8 > r9) goto Lef
            java.lang.String r8 = r11.zzb
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto Lef
            int r8 = r4.length
            if (r8 != 0) goto Lef
            android.media.MediaCodecInfo$CodecCapabilities r4 = r11.zzd
            if (r4 == 0) goto L93
            android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()
            if (r4 == 0) goto L93
            android.util.Range r4 = r4.getBitrateRange()
            java.lang.Comparable r4 = r4.getUpper()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L94
        L93:
            r4 = 0
        L94:
            r8 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r4 < r8) goto L9c
            r5 = 1024(0x400, float:1.435E-42)
            goto Le1
        L9c:
            r8 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r4 < r8) goto La4
            r5 = 512(0x200, float:7.175E-43)
            goto Le1
        La4:
            r8 = 60000000(0x3938700, float:8.670878E-37)
            if (r4 < r8) goto Lac
            r5 = 256(0x100, float:3.59E-43)
            goto Le1
        Lac:
            r8 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r4 < r8) goto Lb4
            r5 = 128(0x80, float:1.794E-43)
            goto Le1
        Lb4:
            r8 = 18000000(0x112a880, float:2.6936858E-38)
            if (r4 < r8) goto Lbc
            r5 = 64
            goto Le1
        Lbc:
            r8 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r4 < r8) goto Lc4
            r5 = 32
            goto Le1
        Lc4:
            r8 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r4 < r8) goto Lcc
            r5 = 16
            goto Le1
        Lcc:
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            if (r4 < r8) goto Ld2
            goto Le1
        Ld2:
            r5 = 1800000(0x1b7740, float:2.522337E-39)
            if (r4 < r5) goto Ld9
            r5 = 4
            goto Le1
        Ld9:
            r5 = 800000(0xc3500, float:1.121039E-39)
            if (r4 < r5) goto Le0
            r5 = 2
            goto Le1
        Le0:
            r5 = 1
        Le1:
            android.media.MediaCodecInfo$CodecProfileLevel r4 = new android.media.MediaCodecInfo$CodecProfileLevel
            r4.<init>()
            r4.profile = r1
            r4.level = r5
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = new android.media.MediaCodecInfo.CodecProfileLevel[r1]
            r5[r7] = r4
            r4 = r5
        Lef:
            int r5 = r4.length
            r8 = 0
        Lf1:
            if (r8 >= r5) goto L120
            r9 = r4[r8]
            int r10 = r9.profile
            if (r10 != r3) goto L11d
            int r9 = r9.level
            if (r9 >= r0) goto Lff
            if (r13 != 0) goto L11d
        Lff:
            java.lang.String r9 = r11.zzb
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L11c
            if (r3 != r6) goto L11c
            java.lang.String r9 = com.google.android.gms.internal.ads.zzeu.zzb
            java.lang.String r10 = "sailfish"
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L11d
            java.lang.String r10 = "marlin"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L11c
            goto L11d
        L11c:
            return r1
        L11d:
            int r8 = r8 + 1
            goto Lf1
        L120:
            java.lang.String r12 = r12.zzj
            java.lang.String r13 = r11.zzc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "codec.profileLevel, "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = ", "
            r0.append(r12)
            r0.append(r13)
            java.lang.String r12 = r0.toString()
            r11.zzj(r12)
            return r7
    }

    private final boolean zzm(com.google.android.gms.internal.ads.zzaf r3) {
            r2 = this;
            java.lang.String r0 = r2.zzb
            java.lang.String r1 = r3.zzn
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L19
            java.lang.String r0 = r2.zzb
            java.lang.String r3 = com.google.android.gms.internal.ads.zzts.zzd(r3)
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L17
            goto L19
        L17:
            r3 = 0
            return r3
        L19:
            r3 = 1
            return r3
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final android.graphics.Point zza(int r2, int r3) {
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.zzd
            if (r0 != 0) goto L5
            goto L10
        L5:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 == 0) goto L10
            android.graphics.Point r2 = zzi(r0, r2, r3)
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final com.google.android.gms.internal.ads.zzib zzb(com.google.android.gms.internal.ads.zzaf r14, com.google.android.gms.internal.ads.zzaf r15) {
            r13 = this;
            java.lang.String r0 = r14.zzn
            java.lang.String r1 = r15.zzn
            boolean r0 = java.util.Objects.equals(r0, r1)
            r1 = 1
            if (r1 == r0) goto Le
            r0 = 8
            goto Lf
        Le:
            r0 = 0
        Lf:
            boolean r2 = r13.zzi
            if (r2 == 0) goto L81
            int r2 = r14.zzw
            int r3 = r15.zzw
            if (r2 == r3) goto L1b
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L1b:
            boolean r2 = r13.zze
            if (r2 != 0) goto L2d
            int r2 = r14.zzt
            int r3 = r15.zzt
            if (r2 != r3) goto L2b
            int r2 = r14.zzu
            int r3 = r15.zzu
            if (r2 == r3) goto L2d
        L2b:
            r0 = r0 | 512(0x200, float:7.175E-43)
        L2d:
            com.google.android.gms.internal.ads.zzo r2 = r14.zzA
            boolean r2 = com.google.android.gms.internal.ads.zzo.zzg(r2)
            if (r2 == 0) goto L3d
            com.google.android.gms.internal.ads.zzo r2 = r15.zzA
            boolean r2 = com.google.android.gms.internal.ads.zzo.zzg(r2)
            if (r2 != 0) goto L49
        L3d:
            com.google.android.gms.internal.ads.zzo r2 = r14.zzA
            com.google.android.gms.internal.ads.zzo r3 = r15.zzA
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto L49
            r0 = r0 | 2048(0x800, float:2.87E-42)
        L49:
            java.lang.String r2 = r13.zza
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeu.zzd
            java.lang.String r4 = "SM-T230"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L65
            java.lang.String r3 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L65
            boolean r2 = r14.zzd(r15)
            if (r2 != 0) goto L65
            r0 = r0 | 2
        L65:
            if (r0 != 0) goto L7e
            java.lang.String r3 = r13.zza
            com.google.android.gms.internal.ads.zzib r0 = new com.google.android.gms.internal.ads.zzib
            boolean r2 = r14.zzd(r15)
            if (r1 == r2) goto L74
            r1 = 2
            r6 = 2
            goto L76
        L74:
            r1 = 3
            r6 = 3
        L76:
            r7 = 0
            r2 = r0
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L7e:
            r12 = r0
            goto Lf8
        L81:
            int r1 = r14.zzB
            int r2 = r15.zzB
            if (r1 == r2) goto L89
            r0 = r0 | 4096(0x1000, float:5.74E-42)
        L89:
            int r1 = r14.zzC
            int r2 = r15.zzC
            if (r1 == r2) goto L91
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
        L91:
            int r1 = r14.zzD
            int r2 = r15.zzD
            if (r1 == r2) goto L99
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
        L99:
            if (r0 != 0) goto Ld5
            java.lang.String r1 = r13.zzb
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Ld5
            android.util.Pair r1 = com.google.android.gms.internal.ads.zzts.zza(r14)
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzts.zza(r15)
            if (r1 == 0) goto Ld5
            if (r2 == 0) goto Ld5
            java.lang.Object r1 = r1.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = r2.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 42
            if (r1 != r3) goto Ld5
            if (r2 == r3) goto Lc8
            goto Ld5
        Lc8:
            java.lang.String r5 = r13.zza
            com.google.android.gms.internal.ads.zzib r0 = new com.google.android.gms.internal.ads.zzib
            r8 = 3
            r9 = 0
            r4 = r0
            r6 = r14
            r7 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        Ld5:
            boolean r1 = r14.zzd(r15)
            if (r1 != 0) goto Ldd
            r0 = r0 | 32
        Ldd:
            java.lang.String r1 = r13.zzb
            java.lang.String r2 = "audio/opus"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Le9
            r0 = r0 | 2
        Le9:
            if (r0 != 0) goto L7e
            java.lang.String r2 = r13.zza
            com.google.android.gms.internal.ads.zzib r0 = new com.google.android.gms.internal.ads.zzib
            r5 = 1
            r6 = 0
            r1 = r0
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        Lf8:
            java.lang.String r8 = r13.zza
            com.google.android.gms.internal.ads.zzib r0 = new com.google.android.gms.internal.ads.zzib
            r11 = 0
            r7 = r0
            r9 = r14
            r10 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            return r0
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzaf r3) {
            r2 = this;
            boolean r0 = r2.zzm(r3)
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r3 = r2.zzl(r3, r1)
            if (r3 == 0) goto Lf
            r3 = 1
            return r3
        Lf:
            return r1
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzaf r8) throws com.google.android.gms.internal.ads.zztm {
            r7 = this;
            boolean r0 = r7.zzm(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            boolean r2 = r7.zzl(r8, r0)
            if (r2 != 0) goto L10
            return r1
        L10:
            boolean r2 = r7.zzi
            if (r2 == 0) goto L26
            int r1 = r8.zzt
            if (r1 <= 0) goto L25
            int r2 = r8.zzu
            if (r2 > 0) goto L1d
            goto L25
        L1d:
            float r8 = r8.zzv
            double r3 = (double) r8
            boolean r8 = r7.zzg(r1, r2, r3)
            return r8
        L25:
            return r0
        L26:
            int r2 = r8.zzC
            r3 = -1
            if (r2 == r3) goto L5f
            android.media.MediaCodecInfo$CodecCapabilities r4 = r7.zzd
            if (r4 != 0) goto L36
            java.lang.String r8 = "sampleRate.caps"
            r7.zzj(r8)
            goto L144
        L36:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L43
            java.lang.String r8 = "sampleRate.aCaps"
            r7.zzj(r8)
            goto L144
        L43:
            boolean r4 = r4.isSampleRateSupported(r2)
            if (r4 != 0) goto L5f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "sampleRate.support, "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.zzj(r8)
            goto L144
        L5f:
            int r8 = r8.zzB
            if (r8 == r3) goto L143
            android.media.MediaCodecInfo$CodecCapabilities r2 = r7.zzd
            if (r2 != 0) goto L6e
            java.lang.String r8 = "channelCount.caps"
            r7.zzj(r8)
            goto L144
        L6e:
            android.media.MediaCodecInfo$AudioCapabilities r2 = r2.getAudioCapabilities()
            if (r2 != 0) goto L7b
            java.lang.String r8 = "channelCount.aCaps"
            r7.zzj(r8)
            goto L144
        L7b:
            java.lang.String r3 = r7.zza
            java.lang.String r4 = r7.zzb
            int r2 = r2.getMaxInputChannelCount()
            if (r2 > r0) goto L12b
            int r5 = com.google.android.gms.internal.ads.zzeu.zza
            r6 = 26
            if (r5 < r6) goto L8f
            if (r2 <= 0) goto L8f
            goto L12b
        L8f:
            java.lang.String r5 = "audio/mpeg"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/3gpp"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/amr-wb"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/vorbis"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/opus"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/flac"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/g711-alaw"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/g711-mlaw"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L12b
            java.lang.String r5 = "audio/gsm"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Le8
            goto L12b
        Le8:
            java.lang.String r5 = "audio/ac3"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Lf2
            r4 = 6
            goto Lff
        Lf2:
            java.lang.String r5 = "audio/eac3"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lfd
            r4 = 16
            goto Lff
        Lfd:
            r4 = 30
        Lff:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "AssumedMaxChannelAdjustment: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ", ["
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = " to "
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = "]"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.zzea.zzf(r3, r2)
            r2 = r4
        L12b:
            if (r2 >= r8) goto L142
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "channelCount.support, "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.zzj(r8)
            goto L144
        L142:
            return r0
        L143:
            r1 = 1
        L144:
            return r1
    }

    public final boolean zzf(com.google.android.gms.internal.ads.zzaf r2) {
            r1 = this;
            boolean r0 = r1.zzi
            if (r0 == 0) goto L7
            boolean r2 = r1.zze
            return r2
        L7:
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzts.zza(r2)
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r2.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0 = 42
            if (r2 != r0) goto L1b
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final boolean zzg(int r8, int r9, double r10) {
            r7 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.zzd
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r8 = "sizeAndRate.caps"
            r7.zzj(r8)
            return r1
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L17
            java.lang.String r8 = "sizeAndRate.vCaps"
            r7.zzj(r8)
            return r1
        L17:
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            r3 = 29
            r4 = 1
            java.lang.String r5 = "@"
            java.lang.String r6 = "x"
            if (r2 < r3) goto L4f
            int r2 = com.google.android.gms.internal.ads.zzsy.zza(r0, r8, r9, r10)
            r3 = 2
            if (r2 != r3) goto L2b
            goto Le8
        L2b:
            if (r2 == r4) goto L2e
            goto L4f
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.cover, "
            r0.append(r2)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7.zzj(r8)
            return r1
        L4f:
            boolean r2 = zzk(r0, r8, r9, r10)
            if (r2 != 0) goto Le8
            if (r8 >= r9) goto Lc7
            java.lang.String r2 = r7.zza
            java.lang.String r3 = "OMX.MTK.VIDEO.DECODER.HEVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L6b
            java.lang.String r2 = com.google.android.gms.internal.ads.zzeu.zzb
            java.lang.String r3 = "mcv5a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto Lc7
        L6b:
            boolean r0 = zzk(r0, r9, r8, r10)
            if (r0 != 0) goto L72
            goto Lc7
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sizeAndRate.rotated, "
            r0.append(r1)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = r7.zza
            java.lang.String r10 = r7.zzb
            java.lang.String r11 = com.google.android.gms.internal.ads.zzeu.zze
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AssumedSupport ["
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "] ["
            r0.append(r8)
            r0.append(r9)
            java.lang.String r9 = ", "
            r0.append(r9)
            r0.append(r10)
            r0.append(r8)
            r0.append(r11)
            java.lang.String r8 = "]"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.zzea.zzb(r9, r8)
            goto Le8
        Lc7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.support, "
            r0.append(r2)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7.zzj(r8)
            return r1
        Le8:
            return r4
    }

    public final android.media.MediaCodecInfo.CodecProfileLevel[] zzh() {
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.zzd
            if (r0 == 0) goto L8
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto Lb
        L8:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        Lb:
            return r0
    }
}
