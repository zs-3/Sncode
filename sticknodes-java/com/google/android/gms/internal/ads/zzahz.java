package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzahz {
    public int zzA;
    public int zzB;
    public int zzC;
    public float zzD;
    public float zzE;
    public float zzF;
    public float zzG;
    public float zzH;
    public float zzI;
    public float zzJ;
    public float zzK;
    public float zzL;
    public float zzM;
    public byte[] zzN;
    public int zzO;
    public int zzP;
    public int zzQ;
    public long zzR;
    public long zzS;
    public com.google.android.gms.internal.ads.zzaei zzT;
    public boolean zzU;
    public boolean zzV;
    public com.google.android.gms.internal.ads.zzaeh zzW;
    public int zzX;
    private int zzY;
    private java.lang.String zzZ;
    public java.lang.String zza;
    public java.lang.String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public com.google.android.gms.internal.ads.zzaeg zzi;
    public byte[] zzj;
    public com.google.android.gms.internal.ads.zzy zzk;
    public int zzl;
    public int zzm;
    public int zzn;
    public int zzo;
    public int zzp;
    public int zzq;
    public int zzr;
    public float zzs;
    public float zzt;
    public float zzu;
    public byte[] zzv;
    public int zzw;
    public boolean zzx;
    public int zzy;
    public int zzz;

    protected zzahz() {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.zzl = r0
            r4.zzm = r0
            r4.zzn = r0
            r4.zzo = r0
            r4.zzp = r0
            r1 = 0
            r4.zzq = r1
            r4.zzr = r0
            r2 = 0
            r4.zzs = r2
            r4.zzt = r2
            r4.zzu = r2
            r2 = 0
            r4.zzv = r2
            r4.zzw = r0
            r4.zzx = r1
            r4.zzy = r0
            r4.zzz = r0
            r4.zzA = r0
            r1 = 1000(0x3e8, float:1.401E-42)
            r4.zzB = r1
            r1 = 200(0xc8, float:2.8E-43)
            r4.zzC = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.zzD = r1
            r4.zzE = r1
            r4.zzF = r1
            r4.zzG = r1
            r4.zzH = r1
            r4.zzI = r1
            r4.zzJ = r1
            r4.zzK = r1
            r4.zzL = r1
            r4.zzM = r1
            r1 = 1
            r4.zzO = r1
            r4.zzP = r0
            r0 = 8000(0x1f40, float:1.121E-41)
            r4.zzQ = r0
            r2 = 0
            r4.zzR = r2
            r4.zzS = r2
            r4.zzV = r1
            java.lang.String r0 = "eng"
            r4.zzZ = r0
            return
    }

    static /* bridge */ /* synthetic */ int zza(com.google.android.gms.internal.ads.zzahz r0) {
            int r0 = r0.zzY
            return r0
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzahz r0, int r1) {
            r0.zzY = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzahz r0, java.lang.String r1) {
            r0.zzZ = r1
            return
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzahz r0) {
            com.google.android.gms.internal.ads.zzaeh r0 = r0.zzW
            java.util.Objects.requireNonNull(r0)
            return
    }

    private static android.util.Pair zzf(com.google.android.gms.internal.ads.zzek r6) throws com.google.android.gms.internal.ads.zzbo {
            r0 = 16
            r1 = 0
            r6.zzM(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            long r2 = r6.zzs()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            r4 = 1482049860(0x58564944, double:7.322299212E-315)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L19
            android.util.Pair r6 = new android.util.Pair     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            java.lang.String r0 = "video/divx"
            r6.<init>(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            return r6
        L19:
            r4 = 859189832(0x33363248, double:4.244961792E-315)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L28
            android.util.Pair r6 = new android.util.Pair     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            java.lang.String r0 = "video/3gpp"
            r6.<init>(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            return r6
        L28:
            r4 = 826496599(0x31435657, double:4.08343576E-315)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L70
            int r0 = r6.zzd()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            int r0 = r0 + 20
            byte[] r6 = r6.zzN()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
        L39:
            int r2 = r6.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            int r3 = r2 + (-4)
            if (r0 >= r3) goto L69
            r3 = r6[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            int r4 = r0 + 1
            if (r3 != 0) goto L67
            r3 = r6[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            if (r3 != 0) goto L67
            int r3 = r0 + 2
            r3 = r6[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            r5 = 1
            if (r3 != r5) goto L67
            int r3 = r0 + 3
            r3 = r6[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            r5 = 15
            if (r3 != r5) goto L67
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r0, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            java.lang.String r2 = "video/wvc1"
            java.util.List r6 = java.util.Collections.singletonList(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            r0.<init>(r2, r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            return r0
        L67:
            r0 = r4
            goto L39
        L69:
            java.lang.String r6 = "Failed to find FourCC VC1 initialization data"
            com.google.android.gms.internal.ads.zzbo r6 = com.google.android.gms.internal.ads.zzbo.zza(r6, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
            throw r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7f
        L70:
            java.lang.String r6 = "MatroskaExtractor"
            java.lang.String r0 = "Unknown FourCC. Setting mimeType to video/x-unknown"
            com.google.android.gms.internal.ads.zzea.zzf(r6, r0)
            android.util.Pair r6 = new android.util.Pair
            java.lang.String r0 = "video/x-unknown"
            r6.<init>(r0, r1)
            return r6
        L7f:
            java.lang.String r6 = "Error parsing FourCC private data"
            com.google.android.gms.internal.ads.zzbo r6 = com.google.android.gms.internal.ads.zzbo.zza(r6, r1)
            throw r6
    }

    private static java.util.List zzg(byte[] r10) throws com.google.android.gms.internal.ads.zzbo {
            java.lang.String r0 = "Error parsing vorbis codec private"
            r1 = 0
            r2 = 0
            r3 = r10[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            r4 = 2
            if (r3 != r4) goto L5c
            r3 = 1
            r5 = 1
            r6 = 0
        Lc:
            r7 = r10[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            int r5 = r5 + 1
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            if (r7 != r8) goto L18
            int r6 = r6 + 255
            goto Lc
        L18:
            int r6 = r6 + r7
            r7 = 0
        L1a:
            r9 = r10[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            int r5 = r5 + 1
            r9 = r9 & r8
            if (r9 != r8) goto L24
            int r7 = r7 + 255
            goto L1a
        L24:
            int r7 = r7 + r9
            r8 = r10[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            if (r8 != r3) goto L57
            byte[] r3 = new byte[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            java.lang.System.arraycopy(r10, r5, r3, r2, r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            int r5 = r5 + r6
            r6 = r10[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            r8 = 3
            if (r6 != r8) goto L52
            int r5 = r5 + r7
            r6 = r10[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            r7 = 5
            if (r6 != r7) goto L4d
            int r6 = r10.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            int r6 = r6 - r5
            byte[] r7 = new byte[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            java.lang.System.arraycopy(r10, r5, r7, r2, r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            r10.<init>(r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            r10.add(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            r10.add(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            return r10
        L4d:
            com.google.android.gms.internal.ads.zzbo r10 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            throw r10     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        L52:
            com.google.android.gms.internal.ads.zzbo r10 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            throw r10     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        L57:
            com.google.android.gms.internal.ads.zzbo r10 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            throw r10     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        L5c:
            com.google.android.gms.internal.ads.zzbo r10 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
            throw r10     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61
        L61:
            com.google.android.gms.internal.ads.zzbo r10 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)
            throw r10
    }

    private static boolean zzh(com.google.android.gms.internal.ads.zzek r8) throws com.google.android.gms.internal.ads.zzbo {
            int r0 = r8.zzk()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r2 = 65534(0xfffe, float:9.1833E-41)
            r3 = 0
            if (r0 != r2) goto L34
            r0 = 24
            r8.zzL(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            long r4 = r8.zzt()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzaia.zzg()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            long r6 = r0.getMostSignificantBits()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L34
            long r4 = r8.zzt()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            java.util.UUID r8 = com.google.android.gms.internal.ads.zzaia.zzg()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            long r6 = r8.getLeastSignificantBits()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L34
            return r1
        L34:
            return r3
        L35:
            r8 = 0
            java.lang.String r0 = "Error parsing MS/ACM codec private"
            com.google.android.gms.internal.ads.zzbo r8 = com.google.android.gms.internal.ads.zzbo.zza(r0, r8)
            throw r8
    }

    private final byte[] zzi(java.lang.String r2) throws com.google.android.gms.internal.ads.zzbo {
            r1 = this;
            byte[] r0 = r1.zzj
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Missing CodecPrivate for codec "
            java.lang.String r2 = r0.concat(r2)
            r0 = 0
            com.google.android.gms.internal.ads.zzbo r2 = com.google.android.gms.internal.ads.zzbo.zza(r2, r0)
            throw r2
    }

    public final void zze(com.google.android.gms.internal.ads.zzade r21, int r22) throws com.google.android.gms.internal.ads.zzbo {
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.zzb
            int r2 = r1.hashCode()
            r3 = 24
            r5 = 16
            r6 = 1
            r8 = 32
            r9 = 8
            r10 = 4
            r11 = 0
            r12 = 3
            switch(r2) {
                case -2095576542: goto L18a;
                case -2095575984: goto L180;
                case -1985379776: goto L175;
                case -1784763192: goto L16a;
                case -1730367663: goto L15f;
                case -1482641358: goto L154;
                case -1482641357: goto L149;
                case -1373388978: goto L13e;
                case -933872740: goto L133;
                case -538363189: goto L128;
                case -538363109: goto L11d;
                case -425012669: goto L111;
                case -356037306: goto L105;
                case 62923557: goto Lf9;
                case 62923603: goto Led;
                case 62927045: goto Le1;
                case 82318131: goto Ld6;
                case 82338133: goto Lcb;
                case 82338134: goto Lc0;
                case 99146302: goto Lb4;
                case 444813526: goto La8;
                case 542569478: goto L9c;
                case 635596514: goto L90;
                case 725948237: goto L84;
                case 725957860: goto L78;
                case 738597099: goto L6c;
                case 855502857: goto L60;
                case 1045209816: goto L54;
                case 1422270023: goto L48;
                case 1809237540: goto L3d;
                case 1950749482: goto L31;
                case 1950789798: goto L25;
                case 1951062397: goto L19;
                default: goto L17;
            }
        L17:
            goto L194
        L19:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 12
            goto L195
        L25:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 22
            goto L195
        L31:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 17
            goto L195
        L3d:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 3
            goto L195
        L48:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 27
            goto L195
        L54:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 29
            goto L195
        L60:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 8
            goto L195
        L6c:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 28
            goto L195
        L78:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 24
            goto L195
        L84:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 25
            goto L195
        L90:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 26
            goto L195
        L9c:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 20
            goto L195
        La8:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 10
            goto L195
        Lb4:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 31
            goto L195
        Lc0:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 1
            goto L195
        Lcb:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 0
            goto L195
        Ld6:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 2
            goto L195
        Le1:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 19
            goto L195
        Led:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 16
            goto L195
        Lf9:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 13
            goto L195
        L105:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 21
            goto L195
        L111:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 30
            goto L195
        L11d:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 7
            goto L195
        L128:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 5
            goto L195
        L133:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 32
            goto L195
        L13e:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 9
            goto L195
        L149:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 15
            goto L195
        L154:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 14
            goto L195
        L15f:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 11
            goto L195
        L16a:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 18
            goto L195
        L175:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 23
            goto L195
        L180:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 4
            goto L195
        L18a:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L194
            r2 = 6
            goto L195
        L194:
            r2 = -1
        L195:
            java.lang.String r14 = ". Setting mimeType to audio/x-unknown"
            java.lang.String r15 = "text/x-ssa"
            java.lang.String r7 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r4 = "MatroskaExtractor"
            r13 = 0
            switch(r2) {
                case 0: goto L3b1;
                case 1: goto L3ae;
                case 2: goto L3ab;
                case 3: goto L3a8;
                case 4: goto L39b;
                case 5: goto L39b;
                case 6: goto L39b;
                case 7: goto L37a;
                case 8: goto L360;
                case 9: goto L345;
                case 10: goto L341;
                case 11: goto L330;
                case 12: goto L2ed;
                case 13: goto L2d1;
                case 14: goto L2c9;
                case 15: goto L2c6;
                case 16: goto L2c2;
                case 17: goto L2be;
                case 18: goto L2b3;
                case 19: goto L2af;
                case 20: goto L2af;
                case 21: goto L2ab;
                case 22: goto L29f;
                case 23: goto L261;
                case 24: goto L23a;
                case 25: goto L209;
                case 26: goto L1ea;
                case 27: goto L1e6;
                case 28: goto L1d3;
                case 29: goto L1cf;
                case 30: goto L1c3;
                case 31: goto L1bf;
                case 32: goto L1ae;
                default: goto L1a7;
            }
        L1a7:
            java.lang.String r1 = "Unrecognized codec identifier."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r13)
            throw r1
        L1ae:
            byte[] r2 = new byte[r10]
            byte[] r1 = r0.zzi(r1)
            java.lang.System.arraycopy(r1, r11, r2, r11, r10)
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzo(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L35e
        L1bf:
            java.lang.String r17 = "application/pgs"
            goto L3b3
        L1c3:
            byte[] r1 = r0.zzi(r1)
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzo(r1)
            java.lang.String r17 = "application/vobsub"
            goto L35e
        L1cf:
            java.lang.String r17 = "text/vtt"
            goto L3b3
        L1d3:
            byte[] r1 = com.google.android.gms.internal.ads.zzaia.zzo()
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzp(r1, r2)
            r2 = r13
            r17 = r15
            goto L3b5
        L1e6:
            r17 = r7
            goto L3b3
        L1ea:
            int r1 = r0.zzP
            if (r1 != r8) goto L1f0
            goto L25c
        L1f0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported floating point PCM bit depth: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r1)
            goto L299
        L209:
            int r1 = r0.zzP
            if (r1 != r9) goto L213
            r1 = r13
            r2 = r1
            r3 = -1
            r10 = 3
            goto L3b7
        L213:
            if (r1 != r5) goto L218
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L25c
        L218:
            if (r1 != r3) goto L21d
            r10 = 1342177280(0x50000000, float:8.5899346E9)
            goto L25c
        L21d:
            if (r1 != r8) goto L222
            r10 = 1610612736(0x60000000, float:3.6893488E19)
            goto L25c
        L222:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported big endian PCM bit depth: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r1)
            goto L299
        L23a:
            int r1 = r0.zzP
            int r10 = com.google.android.gms.internal.ads.zzeu.zzm(r1)
            if (r10 != 0) goto L25c
            int r1 = r0.zzP
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported little endian PCM bit depth: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r1)
            goto L299
        L25c:
            r1 = r13
            r2 = r1
            r3 = -1
            goto L3b7
        L261:
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>(r2)
            boolean r1 = zzh(r1)
            if (r1 == 0) goto L294
            int r1 = r0.zzP
            int r10 = com.google.android.gms.internal.ads.zzeu.zzm(r1)
            if (r10 != 0) goto L25c
            int r1 = r0.zzP
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported PCM bit depth: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r1)
            goto L299
        L294:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            com.google.android.gms.internal.ads.zzea.zzf(r4, r1)
        L299:
            r1 = r13
            r2 = r1
            r17 = r18
            goto L3b5
        L29f:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L35e
        L2ab:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L3b3
        L2af:
            java.lang.String r17 = "audio/vnd.dts"
            goto L3b3
        L2b3:
            com.google.android.gms.internal.ads.zzaei r1 = new com.google.android.gms.internal.ads.zzaei
            r1.<init>()
            r0.zzT = r1
            java.lang.String r17 = "audio/true-hd"
            goto L3b3
        L2be:
            java.lang.String r17 = "audio/eac3"
            goto L3b3
        L2c2:
            java.lang.String r17 = "audio/ac3"
            goto L3b3
        L2c6:
            java.lang.String r17 = "audio/mpeg"
            goto L2cb
        L2c9:
            java.lang.String r17 = "audio/mpeg-L2"
        L2cb:
            r1 = r13
            r2 = r1
            r3 = 4096(0x1000, float:5.74E-42)
            goto L3b6
        L2d1:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.zzj
            com.google.android.gms.internal.ads.zzabx r2 = com.google.android.gms.internal.ads.zzaby.zza(r2)
            int r3 = r2.zza
            r0.zzQ = r3
            int r3 = r2.zzb
            r0.zzO = r3
            java.lang.String r2 = r2.zzc
            java.lang.String r17 = "audio/mp4a-latm"
            goto L3b5
        L2ed:
            r16 = 5760(0x1680, float:8.071E-42)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r12)
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r4 = r0.zzR
            java.nio.ByteBuffer r2 = r2.putLong(r4)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.zzS
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.lang.String r17 = "audio/opus"
            r2 = r13
            r3 = 5760(0x1680, float:8.071E-42)
            goto L3b6
        L330:
            r16 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = zzg(r1)
            java.lang.String r17 = "audio/vorbis"
            r2 = r13
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L3b6
        L341:
            java.lang.String r17 = "video/x-unknown"
            goto L3b3
        L345:
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>(r2)
            android.util.Pair r1 = zzf(r1)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L35e:
            r2 = r13
            goto L3b5
        L360:
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzadq r1 = com.google.android.gms.internal.ads.zzadq.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzX = r3
            java.lang.String r1 = r1.zzk
            java.lang.String r17 = "video/hevc"
            goto L393
        L37a:
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzacf r1 = com.google.android.gms.internal.ads.zzacf.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzX = r3
            java.lang.String r1 = r1.zzl
            java.lang.String r17 = "video/avc"
        L393:
            r3 = -1
            r10 = -1
            r19 = r2
            r2 = r1
            r1 = r19
            goto L3b7
        L39b:
            byte[] r1 = r0.zzj
            if (r1 != 0) goto L3a1
            r1 = r13
            goto L3a5
        L3a1:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L3a5:
            java.lang.String r17 = "video/mp4v-es"
            goto L35e
        L3a8:
            java.lang.String r17 = "video/mpeg2"
            goto L3b3
        L3ab:
            java.lang.String r17 = "video/av01"
            goto L3b3
        L3ae:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L3b3
        L3b1:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L3b3:
            r1 = r13
            r2 = r1
        L3b5:
            r3 = -1
        L3b6:
            r10 = -1
        L3b7:
            byte[] r4 = r0.zzN
            if (r4 == 0) goto L3cc
            com.google.android.gms.internal.ads.zzek r4 = new com.google.android.gms.internal.ads.zzek
            byte[] r5 = r0.zzN
            r4.<init>(r5)
            com.google.android.gms.internal.ads.zzacx r4 = com.google.android.gms.internal.ads.zzacx.zza(r4)
            if (r4 == 0) goto L3cc
            java.lang.String r2 = r4.zza
            java.lang.String r17 = "video/dolby-vision"
        L3cc:
            r4 = r17
            boolean r5 = r0.zzV
            boolean r8 = r0.zzU
            if (r6 == r8) goto L3d6
            r8 = 0
            goto L3d7
        L3d6:
            r8 = 2
        L3d7:
            r5 = r5 | r8
            com.google.android.gms.internal.ads.zzad r8 = new com.google.android.gms.internal.ads.zzad
            r8.<init>()
            boolean r9 = com.google.android.gms.internal.ads.zzbn.zzg(r4)
            if (r9 == 0) goto L3f2
            int r7 = r0.zzO
            r8.zzz(r7)
            int r7 = r0.zzQ
            r8.zzaa(r7)
            r8.zzT(r10)
            goto L5d6
        L3f2:
            boolean r6 = com.google.android.gms.internal.ads.zzbn.zzi(r4)
            if (r6 == 0) goto L5a1
            int r6 = r0.zzq
            if (r6 != 0) goto L40e
            int r6 = r0.zzo
            r7 = -1
            if (r6 != r7) goto L403
            int r6 = r0.zzl
        L403:
            r0.zzo = r6
            int r6 = r0.zzp
            if (r6 != r7) goto L40b
            int r6 = r0.zzm
        L40b:
            r0.zzp = r6
            goto L40f
        L40e:
            r7 = -1
        L40f:
            int r6 = r0.zzo
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == r7) goto L425
            int r10 = r0.zzp
            if (r10 == r7) goto L425
            int r12 = r0.zzm
            int r12 = r12 * r6
            int r6 = r0.zzl
            int r6 = r6 * r10
            float r10 = (float) r12
            float r6 = (float) r6
            float r10 = r10 / r6
            goto L427
        L425:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L427:
            boolean r6 = r0.zzx
            if (r6 == 0) goto L510
            float r6 = r0.zzD
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L4eb
            float r6 = r0.zzE
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L4eb
            float r6 = r0.zzF
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L4eb
            float r6 = r0.zzG
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L4eb
            float r6 = r0.zzH
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L4eb
            float r6 = r0.zzI
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L4eb
            float r6 = r0.zzJ
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L4eb
            float r6 = r0.zzK
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L4eb
            float r6 = r0.zzL
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L4eb
            float r6 = r0.zzM
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L469
            goto L4eb
        L469:
            r6 = 25
            byte[] r13 = new byte[r6]
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r13)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r6 = r6.order(r9)
            r6.put(r11)
            float r9 = r0.zzD
            r12 = 1195593728(0x47435000, float:50000.0)
            float r9 = r9 * r12
            r14 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzE
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzF
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzG
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzH
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzI
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzJ
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzK
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzL
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzM
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            int r9 = r0.zzB
            short r9 = (short) r9
            r6.putShort(r9)
            int r9 = r0.zzC
            short r9 = (short) r9
            r6.putShort(r9)
        L4eb:
            com.google.android.gms.internal.ads.zzm r6 = new com.google.android.gms.internal.ads.zzm
            r6.<init>()
            int r9 = r0.zzy
            r6.zzc(r9)
            int r9 = r0.zzA
            r6.zzb(r9)
            int r9 = r0.zzz
            r6.zzd(r9)
            r6.zze(r13)
            int r9 = r0.zzn
            r6.zzf(r9)
            int r9 = r0.zzn
            r6.zza(r9)
            com.google.android.gms.internal.ads.zzo r13 = r6.zzg()
        L510:
            java.lang.String r6 = r0.zza
            if (r6 == 0) goto L531
            java.util.Map r6 = com.google.android.gms.internal.ads.zzaia.zza()
            java.lang.String r9 = r0.zza
            boolean r6 = r6.containsKey(r9)
            if (r6 == 0) goto L531
            java.util.Map r6 = com.google.android.gms.internal.ads.zzaia.zza()
            java.lang.String r7 = r0.zza
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6
        L531:
            int r6 = r0.zzr
            if (r6 != 0) goto L581
            float r6 = r0.zzs
            r9 = 0
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L581
            float r6 = r0.zzt
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L581
            float r6 = r0.zzu
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L54f
            goto L582
        L54f:
            float r6 = r0.zzu
            r9 = 1119092736(0x42b40000, float:90.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L55c
            r11 = 90
            goto L582
        L55c:
            float r6 = r0.zzu
            r9 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 == 0) goto L57e
            float r6 = r0.zzu
            r9 = 1127481344(0x43340000, float:180.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L571
            goto L57e
        L571:
            float r6 = r0.zzu
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L581
            r11 = 270(0x10e, float:3.78E-43)
            goto L582
        L57e:
            r11 = 180(0xb4, float:2.52E-43)
            goto L582
        L581:
            r11 = r7
        L582:
            int r6 = r0.zzl
            r8.zzae(r6)
            int r6 = r0.zzm
            r8.zzJ(r6)
            r8.zzV(r10)
            r8.zzY(r11)
            byte[] r6 = r0.zzv
            r8.zzW(r6)
            int r6 = r0.zzw
            r8.zzac(r6)
            r8.zzB(r13)
            r6 = 2
            goto L5d6
        L5a1:
            boolean r6 = r7.equals(r4)
            if (r6 != 0) goto L5d5
            boolean r6 = r15.equals(r4)
            if (r6 != 0) goto L5d5
            java.lang.String r6 = "text/vtt"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L5d5
            java.lang.String r6 = "application/vobsub"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L5d5
            java.lang.String r6 = "application/pgs"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L5d5
            java.lang.String r6 = "application/dvbsubs"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L5ce
            goto L5d5
        L5ce:
            java.lang.String r1 = "Unexpected MIME type."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r13)
            throw r1
        L5d5:
            r6 = 3
        L5d6:
            java.lang.String r7 = r0.zza
            if (r7 == 0) goto L5eb
            java.util.Map r7 = com.google.android.gms.internal.ads.zzaia.zza()
            java.lang.String r9 = r0.zza
            boolean r7 = r7.containsKey(r9)
            if (r7 != 0) goto L5eb
            java.lang.String r7 = r0.zza
            r8.zzN(r7)
        L5eb:
            r7 = r22
            r8.zzK(r7)
            r8.zzZ(r4)
            r8.zzQ(r3)
            java.lang.String r3 = r0.zzZ
            r8.zzP(r3)
            r8.zzab(r5)
            r8.zzM(r1)
            r8.zzA(r2)
            com.google.android.gms.internal.ads.zzy r1 = r0.zzk
            r8.zzF(r1)
            com.google.android.gms.internal.ads.zzaf r1 = r8.zzaf()
            int r2 = r0.zzc
            r3 = r21
            com.google.android.gms.internal.ads.zzaeh r2 = r3.zzw(r2, r6)
            r0.zzW = r2
            r2.zzl(r1)
            return
    }
}
