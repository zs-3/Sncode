package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaia implements com.google.android.gms.internal.ads.zzadb {
    private static final byte[] zza = null;
    private static final byte[] zzb = null;
    private static final byte[] zzc = null;
    private static final byte[] zzd = null;
    private static final java.util.UUID zze = null;
    private static final java.util.Map zzf = null;
    private long zzA;
    private com.google.android.gms.internal.ads.zzahz zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private com.google.android.gms.internal.ads.zzeb zzJ;
    private com.google.android.gms.internal.ads.zzeb zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private com.google.android.gms.internal.ads.zzade zzai;
    private final com.google.android.gms.internal.ads.zzahv zzaj;
    private final com.google.android.gms.internal.ads.zzaic zzg;
    private final android.util.SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final com.google.android.gms.internal.ads.zzakt zzk;
    private final com.google.android.gms.internal.ads.zzek zzl;
    private final com.google.android.gms.internal.ads.zzek zzm;
    private final com.google.android.gms.internal.ads.zzek zzn;
    private final com.google.android.gms.internal.ads.zzek zzo;
    private final com.google.android.gms.internal.ads.zzek zzp;
    private final com.google.android.gms.internal.ads.zzek zzq;
    private final com.google.android.gms.internal.ads.zzek zzr;
    private final com.google.android.gms.internal.ads.zzek zzs;
    private final com.google.android.gms.internal.ads.zzek zzt;
    private final com.google.android.gms.internal.ads.zzek zzu;
    private java.nio.ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
            r0 = 32
            byte[] r1 = new byte[r0]
            r1 = {x006e: FILL_ARRAY_DATA , data: [49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10} // fill-array
            com.google.android.gms.internal.ads.zzaia.zza = r1
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r2 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"
            byte[] r1 = r2.getBytes(r1)
            com.google.android.gms.internal.ads.zzaia.zzb = r1
            byte[] r0 = new byte[r0]
            r0 = {x0082: FILL_ARRAY_DATA , data: [68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44} // fill-array
            com.google.android.gms.internal.ads.zzaia.zzc = r0
            r0 = 38
            byte[] r0 = new byte[r0]
            r0 = {x0096: FILL_ARRAY_DATA , data: [87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10} // fill-array
            com.google.android.gms.internal.ads.zzaia.zzd = r0
            java.util.UUID r0 = new java.util.UUID
            r1 = 72057594037932032(0x100000000001000, double:7.291122019563029E-304)
            r3 = -9223371306706625679(0x800000aa00389b71, double:-3.607411173533E-312)
            r0.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzaia.zze = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "htc_video_rotA-000"
            r0.put(r2, r1)
            r1 = 90
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "htc_video_rotA-090"
            r0.put(r2, r1)
            r1 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "htc_video_rotA-180"
            r0.put(r2, r1)
            r1 = 270(0x10e, float:3.78E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "htc_video_rotA-270"
            r0.put(r2, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.android.gms.internal.ads.zzaia.zzf = r0
            return
    }

    @java.lang.Deprecated
    public zzaia() {
            r3 = this;
            com.google.android.gms.internal.ads.zzahv r0 = new com.google.android.gms.internal.ads.zzahv
            r0.<init>()
            com.google.android.gms.internal.ads.zzakt r1 = com.google.android.gms.internal.ads.zzakt.zza
            r2 = 2
            r3.<init>(r0, r2, r1)
            return
    }

    zzaia(com.google.android.gms.internal.ads.zzahv r5, int r6, com.google.android.gms.internal.ads.zzakt r7) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.zzx = r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.zzy = r2
            r4.zzz = r2
            r4.zzA = r2
            r4.zzG = r0
            r4.zzH = r0
            r4.zzI = r2
            r4.zzaj = r5
            com.google.android.gms.internal.ads.zzahy r0 = new com.google.android.gms.internal.ads.zzahy
            r1 = 0
            r0.<init>(r4, r1)
            r5.zza(r0)
            r4.zzk = r7
            r5 = r6 & 1
            r7 = 1
            r5 = r5 ^ r7
            r0 = 0
            if (r7 == r5) goto L2e
            r5 = 0
            goto L2f
        L2e:
            r5 = 1
        L2f:
            r4.zzi = r5
            r5 = r6 & 2
            if (r5 != 0) goto L36
            r0 = 1
        L36:
            r4.zzj = r0
            com.google.android.gms.internal.ads.zzaic r5 = new com.google.android.gms.internal.ads.zzaic
            r5.<init>()
            r4.zzg = r5
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r4.zzh = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            r6 = 4
            r5.<init>(r6)
            r4.zzn = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r6)
            r1 = -1
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            r5.<init>(r0)
            r4.zzo = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            r5.<init>(r6)
            r4.zzp = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            byte[] r0 = com.google.android.gms.internal.ads.zzfs.zza
            r5.<init>(r0)
            r4.zzl = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            r5.<init>(r6)
            r4.zzm = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            r5.<init>()
            r4.zzq = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            r5.<init>()
            r4.zzr = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            r6 = 8
            r5.<init>(r6)
            r4.zzs = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            r5.<init>()
            r4.zzt = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            r5.<init>()
            r4.zzu = r5
            int[] r5 = new int[r7]
            r4.zzS = r5
            return
    }

    public zzaia(com.google.android.gms.internal.ads.zzakt r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzahv r3 = new com.google.android.gms.internal.ads.zzahv
            r3.<init>()
            r0 = 0
            r1.<init>(r3, r0, r2)
            return
    }

    static /* bridge */ /* synthetic */ java.util.Map zza() {
            java.util.Map r0 = com.google.android.gms.internal.ads.zzaia.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.UUID zzg() {
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzaia.zze
            return r0
    }

    static /* bridge */ /* synthetic */ byte[] zzo() {
            byte[] r0 = com.google.android.gms.internal.ads.zzaia.zzb
            return r0
    }

    private final int zzp(com.google.android.gms.internal.ads.zzadc r11, com.google.android.gms.internal.ads.zzahz r12, int r13, boolean r14) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = r12.zzb
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            byte[] r12 = com.google.android.gms.internal.ads.zzaia.zza
            r10.zzx(r11, r12, r13)
            int r11 = r10.zzaa
            r10.zzw()
            return r11
        L15:
            java.lang.String r0 = r12.zzb
            java.lang.String r1 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2a
            byte[] r12 = com.google.android.gms.internal.ads.zzaia.zzc
            r10.zzx(r11, r12, r13)
            int r11 = r10.zzaa
            r10.zzw()
            return r11
        L2a:
            java.lang.String r0 = r12.zzb
            java.lang.String r1 = "S_TEXT/WEBVTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3f
            byte[] r12 = com.google.android.gms.internal.ads.zzaia.zzd
            r10.zzx(r11, r12, r13)
            int r11 = r10.zzaa
            r10.zzw()
            return r11
        L3f:
            com.google.android.gms.internal.ads.zzaeh r0 = r12.zzW
            boolean r1 = r10.zzac
            r2 = 2
            r3 = 4
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L1fc
            boolean r1 = r12.zzg
            if (r1 == 0) goto L187
            int r1 = r10.zzV
            r6 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r6
            r10.zzV = r1
            boolean r1 = r10.zzad
            r6 = 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L89
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            byte[] r1 = r1.zzN()
            r11.zzi(r1, r5, r4)
            int r1 = r10.zzZ
            int r1 = r1 + r4
            r10.zzZ = r1
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            byte[] r1 = r1.zzN()
            r1 = r1[r5]
            r1 = r1 & r6
            if (r1 == r6) goto L81
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            byte[] r1 = r1.zzN()
            r1 = r1[r5]
            r10.zzag = r1
            r10.zzad = r4
            goto L89
        L81:
            r11 = 0
            java.lang.String r12 = "Extension bit is set in signal byte"
            com.google.android.gms.internal.ads.zzbo r11 = com.google.android.gms.internal.ads.zzbo.zza(r12, r11)
            throw r11
        L89:
            byte r1 = r10.zzag
            r7 = r1 & 1
            if (r7 != r4) goto L191
            r1 = r1 & r2
            int r7 = r10.zzV
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = r7 | r8
            r10.zzV = r7
            boolean r7 = r10.zzah
            if (r7 != 0) goto Ld9
            com.google.android.gms.internal.ads.zzek r7 = r10.zzs
            byte[] r7 = r7.zzN()
            r8 = 8
            r11.zzi(r7, r5, r8)
            int r7 = r10.zzZ
            int r7 = r7 + r8
            r10.zzZ = r7
            r10.zzah = r4
            com.google.android.gms.internal.ads.zzek r7 = r10.zzn
            if (r1 != r2) goto Lb2
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            r6 = r6 | r8
            byte[] r7 = r7.zzN()
            byte r6 = (byte) r6
            r7[r5] = r6
            com.google.android.gms.internal.ads.zzek r6 = r10.zzn
            r6.zzL(r5)
            com.google.android.gms.internal.ads.zzek r6 = r10.zzn
            r0.zzr(r6, r4, r4)
            int r6 = r10.zzaa
            int r6 = r6 + r4
            r10.zzaa = r6
            com.google.android.gms.internal.ads.zzek r6 = r10.zzs
            r6.zzL(r5)
            com.google.android.gms.internal.ads.zzek r6 = r10.zzs
            r0.zzr(r6, r8, r4)
            int r6 = r10.zzaa
            int r6 = r6 + r8
            r10.zzaa = r6
        Ld9:
            if (r1 != r2) goto L191
            boolean r1 = r10.zzae
            if (r1 != 0) goto Lfc
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            byte[] r1 = r1.zzN()
            r11.zzi(r1, r5, r4)
            int r1 = r10.zzZ
            int r1 = r1 + r4
            r10.zzZ = r1
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            r1.zzL(r5)
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            int r1 = r1.zzm()
            r10.zzaf = r1
            r10.zzae = r4
        Lfc:
            int r1 = r10.zzaf
            int r1 = r1 * 4
            com.google.android.gms.internal.ads.zzek r6 = r10.zzn
            r6.zzI(r1)
            com.google.android.gms.internal.ads.zzek r6 = r10.zzn
            byte[] r6 = r6.zzN()
            r11.zzi(r6, r5, r1)
            int r6 = r10.zzZ
            int r6 = r6 + r1
            r10.zzZ = r6
            int r1 = r10.zzaf
            int r1 = r1 >> r4
            int r1 = r1 + r4
            int r6 = r1 * 6
            int r6 = r6 + r2
            java.nio.ByteBuffer r7 = r10.zzv
            if (r7 == 0) goto L124
            int r7 = r7.capacity()
            if (r7 >= r6) goto L12a
        L124:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r6)
            r10.zzv = r7
        L12a:
            short r1 = (short) r1
            java.nio.ByteBuffer r7 = r10.zzv
            r7.position(r5)
            java.nio.ByteBuffer r7 = r10.zzv
            r7.putShort(r1)
            r1 = 0
            r7 = 0
        L137:
            int r8 = r10.zzaf
            if (r1 >= r8) goto L157
            com.google.android.gms.internal.ads.zzek r8 = r10.zzn
            int r8 = r8.zzp()
            int r7 = r8 - r7
            int r9 = r1 % 2
            if (r9 != 0) goto L14e
            java.nio.ByteBuffer r9 = r10.zzv
            short r7 = (short) r7
            r9.putShort(r7)
            goto L153
        L14e:
            java.nio.ByteBuffer r9 = r10.zzv
            r9.putInt(r7)
        L153:
            int r1 = r1 + 1
            r7 = r8
            goto L137
        L157:
            int r1 = r10.zzZ
            int r1 = r13 - r1
            int r1 = r1 - r7
            r7 = r8 & 1
            if (r7 != r4) goto L166
            java.nio.ByteBuffer r7 = r10.zzv
            r7.putInt(r1)
            goto L171
        L166:
            java.nio.ByteBuffer r7 = r10.zzv
            short r1 = (short) r1
            r7.putShort(r1)
            java.nio.ByteBuffer r1 = r10.zzv
            r1.putInt(r5)
        L171:
            com.google.android.gms.internal.ads.zzek r1 = r10.zzt
            java.nio.ByteBuffer r7 = r10.zzv
            byte[] r7 = r7.array()
            r1.zzJ(r7, r6)
            com.google.android.gms.internal.ads.zzek r1 = r10.zzt
            r0.zzr(r1, r6, r4)
            int r1 = r10.zzaa
            int r1 = r1 + r6
            r10.zzaa = r1
            goto L191
        L187:
            byte[] r1 = r12.zzh
            if (r1 == 0) goto L191
            com.google.android.gms.internal.ads.zzek r6 = r10.zzq
            int r7 = r1.length
            r6.zzJ(r1, r7)
        L191:
            java.lang.String r1 = r12.zzb
            java.lang.String r6 = "A_OPUS"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L19e
            if (r14 == 0) goto L1fa
            goto L1a2
        L19e:
            int r14 = r12.zzf
            if (r14 <= 0) goto L1fa
        L1a2:
            int r14 = r10.zzV
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r14 = r14 | r1
            r10.zzV = r14
            com.google.android.gms.internal.ads.zzek r14 = r10.zzu
            r14.zzI(r5)
            com.google.android.gms.internal.ads.zzek r14 = r10.zzq
            int r14 = r14.zze()
            int r14 = r14 + r13
            int r1 = r10.zzZ
            int r14 = r14 - r1
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            r1.zzI(r3)
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            int r6 = r14 >> 24
            byte[] r1 = r1.zzN()
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r5] = r6
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            byte[] r1 = r1.zzN()
            int r6 = r14 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            int r6 = r14 >> 8
            byte[] r1 = r1.zzN()
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            com.google.android.gms.internal.ads.zzek r1 = r10.zzn
            byte[] r1 = r1.zzN()
            r6 = 3
            r14 = r14 & 255(0xff, float:3.57E-43)
            byte r14 = (byte) r14
            r1[r6] = r14
            com.google.android.gms.internal.ads.zzek r14 = r10.zzn
            r0.zzr(r14, r3, r2)
            int r14 = r10.zzaa
            int r14 = r14 + r3
            r10.zzaa = r14
        L1fa:
            r10.zzac = r4
        L1fc:
            com.google.android.gms.internal.ads.zzek r14 = r10.zzq
            int r14 = r14.zze()
            int r13 = r13 + r14
            java.lang.String r14 = r12.zzb
            java.lang.String r1 = "V_MPEG4/ISO/AVC"
            boolean r14 = r1.equals(r14)
            if (r14 != 0) goto L244
            java.lang.String r14 = r12.zzb
            java.lang.String r1 = "V_MPEGH/ISO/HEVC"
            boolean r14 = r1.equals(r14)
            if (r14 == 0) goto L218
            goto L244
        L218:
            com.google.android.gms.internal.ads.zzaei r14 = r12.zzT
            if (r14 != 0) goto L21d
            goto L22f
        L21d:
            com.google.android.gms.internal.ads.zzek r14 = r10.zzq
            int r14 = r14.zze()
            if (r14 != 0) goto L226
            goto L227
        L226:
            r4 = 0
        L227:
            com.google.android.gms.internal.ads.zzdi.zzf(r4)
            com.google.android.gms.internal.ads.zzaei r14 = r12.zzT
            r14.zzd(r11)
        L22f:
            int r14 = r10.zzZ
            if (r14 >= r13) goto L2aa
            int r14 = r13 - r14
            int r14 = r10.zzq(r11, r0, r14)
            int r1 = r10.zzZ
            int r1 = r1 + r14
            r10.zzZ = r1
            int r1 = r10.zzaa
            int r1 = r1 + r14
            r10.zzaa = r1
            goto L22f
        L244:
            com.google.android.gms.internal.ads.zzek r14 = r10.zzm
            byte[] r14 = r14.zzN()
            r14[r5] = r5
            r14[r4] = r5
            r14[r2] = r5
            int r1 = r12.zzX
            int r2 = 4 - r1
        L254:
            int r4 = r10.zzZ
            if (r4 >= r13) goto L2aa
            int r4 = r10.zzab
            if (r4 != 0) goto L296
            com.google.android.gms.internal.ads.zzek r4 = r10.zzq
            int r4 = r4.zzb()
            int r4 = java.lang.Math.min(r1, r4)
            int r6 = r2 + r4
            int r7 = r1 - r4
            r11.zzi(r14, r6, r7)
            if (r4 <= 0) goto L274
            com.google.android.gms.internal.ads.zzek r6 = r10.zzq
            r6.zzH(r14, r2, r4)
        L274:
            int r4 = r10.zzZ
            int r4 = r4 + r1
            r10.zzZ = r4
            com.google.android.gms.internal.ads.zzek r4 = r10.zzm
            r4.zzL(r5)
            com.google.android.gms.internal.ads.zzek r4 = r10.zzm
            int r4 = r4.zzp()
            r10.zzab = r4
            com.google.android.gms.internal.ads.zzek r4 = r10.zzl
            r4.zzL(r5)
            com.google.android.gms.internal.ads.zzek r4 = r10.zzl
            r0.zzq(r4, r3)
            int r4 = r10.zzaa
            int r4 = r4 + r3
            r10.zzaa = r4
            goto L254
        L296:
            int r4 = r10.zzq(r11, r0, r4)
            int r6 = r10.zzZ
            int r6 = r6 + r4
            r10.zzZ = r6
            int r6 = r10.zzaa
            int r6 = r6 + r4
            r10.zzaa = r6
            int r6 = r10.zzab
            int r6 = r6 - r4
            r10.zzab = r6
            goto L254
        L2aa:
            java.lang.String r11 = r12.zzb
            java.lang.String r12 = "A_VORBIS"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L2c3
            com.google.android.gms.internal.ads.zzek r11 = r10.zzo
            r11.zzL(r5)
            com.google.android.gms.internal.ads.zzek r11 = r10.zzo
            r0.zzq(r11, r3)
            int r11 = r10.zzaa
            int r11 = r11 + r3
            r10.zzaa = r11
        L2c3:
            int r11 = r10.zzaa
            r10.zzw()
            return r11
    }

    private final int zzq(com.google.android.gms.internal.ads.zzadc r2, com.google.android.gms.internal.ads.zzaeh r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzek r0 = r1.zzq
            int r0 = r0.zzb()
            if (r0 <= 0) goto L12
            int r2 = java.lang.Math.min(r4, r0)
            com.google.android.gms.internal.ads.zzek r4 = r1.zzq
            r3.zzq(r4, r2)
            goto L17
        L12:
            r0 = 0
            int r2 = r3.zzf(r2, r4, r0)
        L17:
            return r2
    }

    private final long zzr(long r8) throws com.google.android.gms.internal.ads.zzbo {
            r7 = this;
            long r2 = r7.zzy
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L15
            r4 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r6 = java.math.RoundingMode.FLOOR
            r0 = r8
            long r8 = com.google.android.gms.internal.ads.zzeu.zzt(r0, r2, r4, r6)
            return r8
        L15:
            r8 = 0
            java.lang.String r9 = "Can't scale timecode prior to timecodeScale being set."
            com.google.android.gms.internal.ads.zzbo r8 = com.google.android.gms.internal.ads.zzbo.zza(r9, r8)
            throw r8
    }

    private final void zzs(int r3) throws com.google.android.gms.internal.ads.zzbo {
            r2 = this;
            com.google.android.gms.internal.ads.zzeb r0 = r2.zzJ
            if (r0 == 0) goto L9
            com.google.android.gms.internal.ads.zzeb r0 = r2.zzK
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Element "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " must be in a Cues"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            com.google.android.gms.internal.ads.zzbo r3 = com.google.android.gms.internal.ads.zzbo.zza(r3, r0)
            throw r3
    }

    private final void zzt(int r3) throws com.google.android.gms.internal.ads.zzbo {
            r2 = this;
            com.google.android.gms.internal.ads.zzahz r0 = r2.zzB
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Element "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " must be in a TrackEntry"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            com.google.android.gms.internal.ads.zzbo r3 = com.google.android.gms.internal.ads.zzbo.zza(r3, r0)
            throw r3
    }

    private final void zzu(com.google.android.gms.internal.ads.zzahz r18, long r19, int r21, int r22, int r23) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.ads.zzaei r2 = r1.zzT
            r9 = 1
            if (r2 == 0) goto L1c
            com.google.android.gms.internal.ads.zzaeh r3 = r1.zzW
            com.google.android.gms.internal.ads.zzaeg r8 = r1.zzi
            r1 = r2
            r2 = r3
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.zzc(r2, r3, r5, r6, r7, r8)
            goto L121
        L1c:
            java.lang.String r2 = r1.zzb
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            java.lang.String r4 = "S_TEXT/WEBVTT"
            java.lang.String r5 = "S_TEXT/ASS"
            r6 = 0
            r7 = 2
            if (r2 != 0) goto L3c
            java.lang.String r2 = r1.zzb
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3c
            java.lang.String r2 = r1.zzb
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L58
        L3c:
            int r2 = r0.zzR
            java.lang.String r8 = "MatroskaExtractor"
            if (r2 <= r9) goto L48
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            com.google.android.gms.internal.ads.zzea.zzf(r8, r2)
            goto L58
        L48:
            long r10 = r0.zzP
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L5c
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            com.google.android.gms.internal.ads.zzea.zzf(r8, r2)
        L58:
            r2 = r22
            goto Lf3
        L5c:
            java.lang.String r2 = r1.zzb
            com.google.android.gms.internal.ads.zzek r8 = r0.zzr
            byte[] r8 = r8.zzN()
            int r12 = r2.hashCode()
            r13 = 738597099(0x2c0618eb, float:1.9056378E-12)
            if (r12 == r13) goto L88
            r5 = 1045209816(0x3e4ca2d8, float:0.19983995)
            if (r12 == r5) goto L80
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r12 == r4) goto L78
            goto L90
        L78:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L90
            r2 = 0
            goto L91
        L80:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L90
            r2 = 2
            goto L91
        L88:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L90
            r2 = 1
            goto L91
        L90:
            r2 = -1
        L91:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto Lb3
            if (r2 == r9) goto La8
            if (r2 != r7) goto La2
            r2 = 25
            java.lang.String r5 = "%02d:%02d:%02d.%03d"
            byte[] r3 = zzy(r10, r5, r3)
            goto Lbb
        La2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        La8:
            r2 = 21
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r5 = "%01d:%02d:%02d:%02d"
            byte[] r3 = zzy(r10, r5, r3)
            goto Lbb
        Lb3:
            r2 = 19
            java.lang.String r5 = "%02d:%02d:%02d,%03d"
            byte[] r3 = zzy(r10, r5, r3)
        Lbb:
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r6, r8, r2, r4)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzr
            int r2 = r2.zzd()
        Lc5:
            com.google.android.gms.internal.ads.zzek r3 = r0.zzr
            int r3 = r3.zze()
            if (r2 >= r3) goto Le0
            com.google.android.gms.internal.ads.zzek r3 = r0.zzr
            byte[] r3 = r3.zzN()
            r3 = r3[r2]
            if (r3 != 0) goto Ldd
            com.google.android.gms.internal.ads.zzek r3 = r0.zzr
            r3.zzK(r2)
            goto Le0
        Ldd:
            int r2 = r2 + 1
            goto Lc5
        Le0:
            com.google.android.gms.internal.ads.zzaeh r2 = r1.zzW
            com.google.android.gms.internal.ads.zzek r3 = r0.zzr
            int r4 = r3.zze()
            r2.zzq(r3, r4)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzr
            int r2 = r2.zze()
            int r2 = r22 + r2
        Lf3:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto L111
            int r3 = r0.zzR
            if (r3 <= r9) goto L103
            com.google.android.gms.internal.ads.zzek r3 = r0.zzu
            r3.zzI(r6)
            goto L111
        L103:
            com.google.android.gms.internal.ads.zzek r3 = r0.zzu
            int r3 = r3.zze()
            com.google.android.gms.internal.ads.zzaeh r4 = r1.zzW
            com.google.android.gms.internal.ads.zzek r5 = r0.zzu
            r4.zzr(r5, r3, r7)
            int r2 = r2 + r3
        L111:
            r14 = r2
            com.google.android.gms.internal.ads.zzaeh r10 = r1.zzW
            com.google.android.gms.internal.ads.zzaeg r1 = r1.zzi
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.zzs(r11, r13, r14, r15, r16)
        L121:
            r0.zzM = r9
            return
    }

    private final void zzv(com.google.android.gms.internal.ads.zzadc r4, int r5) throws java.io.IOException {
            r3 = this;
            com.google.android.gms.internal.ads.zzek r0 = r3.zzn
            int r0 = r0.zze()
            if (r0 < r5) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzek r0 = r3.zzn
            int r0 = r0.zzc()
            if (r0 >= r5) goto L1f
            com.google.android.gms.internal.ads.zzek r0 = r3.zzn
            int r1 = r0.zzc()
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r0.zzF(r1)
        L1f:
            com.google.android.gms.internal.ads.zzek r0 = r3.zzn
            byte[] r1 = r0.zzN()
            int r2 = r0.zze()
            int r0 = r0.zze()
            int r0 = r5 - r0
            r4.zzi(r1, r2, r0)
            com.google.android.gms.internal.ads.zzek r4 = r3.zzn
            r4.zzK(r5)
            return
    }

    private final void zzw() {
            r2 = this;
            r0 = 0
            r2.zzZ = r0
            r2.zzaa = r0
            r2.zzab = r0
            r2.zzac = r0
            r2.zzad = r0
            r2.zzae = r0
            r2.zzaf = r0
            r2.zzag = r0
            r2.zzah = r0
            com.google.android.gms.internal.ads.zzek r1 = r2.zzq
            r1.zzI(r0)
            return
    }

    private final void zzx(com.google.android.gms.internal.ads.zzadc r6, byte[] r7, int r8) throws java.io.IOException {
            r5 = this;
            int r0 = r7.length
            int r1 = r0 + r8
            com.google.android.gms.internal.ads.zzek r2 = r5.zzr
            int r2 = r2.zzc()
            r3 = 0
            if (r2 >= r1) goto L19
            com.google.android.gms.internal.ads.zzek r2 = r5.zzr
            int r4 = r1 + r8
            byte[] r7 = java.util.Arrays.copyOf(r7, r4)
            int r4 = r7.length
            r2.zzJ(r7, r4)
            goto L22
        L19:
            com.google.android.gms.internal.ads.zzek r2 = r5.zzr
            byte[] r2 = r2.zzN()
            java.lang.System.arraycopy(r7, r3, r2, r3, r0)
        L22:
            com.google.android.gms.internal.ads.zzek r7 = r5.zzr
            byte[] r7 = r7.zzN()
            r6.zzi(r7, r0, r8)
            com.google.android.gms.internal.ads.zzek r6 = r5.zzr
            r6.zzL(r3)
            com.google.android.gms.internal.ads.zzek r6 = r5.zzr
            r6.zzK(r1)
            return
    }

    private static byte[] zzy(long r10, java.lang.String r12, long r13) {
            r0 = 1
            r1 = 0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            com.google.android.gms.internal.ads.zzdi.zzd(r2)
            r2 = 3600000000(0xd693a400, double:1.778636325E-314)
            long r4 = r10 / r2
            java.util.Locale r6 = java.util.Locale.US
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 3
            r9 = 2
            int r5 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r7[r1] = r4
            long r4 = (long) r5
            long r4 = r4 * r2
            long r10 = r10 - r4
            r1 = 60000000(0x3938700, double:2.96439388E-316)
            long r3 = r10 / r1
            int r4 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r7[r0] = r3
            long r3 = (long) r4
            long r3 = r3 * r1
            long r10 = r10 - r3
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r10 / r0
            int r3 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r7[r9] = r2
            long r2 = (long) r3
            long r2 = r2 * r0
            long r10 = r10 - r2
            long r10 = r10 / r13
            int r11 = (int) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r7[r8] = r10
            java.lang.String r10 = java.lang.String.format(r6, r12, r7)
            int r11 = com.google.android.gms.internal.ads.zzeu.zza
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r10.getBytes(r11)
            return r10
    }

    private static int[] zzz(int[] r1, int r2) {
            if (r1 != 0) goto L5
            int[] r1 = new int[r2]
            return r1
        L5:
            int r0 = r1.length
            if (r0 < r2) goto L9
            return r1
        L9:
            int r0 = r0 + r0
            int r1 = java.lang.Math.max(r0, r2)
            int[] r1 = new int[r1]
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r7, com.google.android.gms.internal.ads.zzadx r8) throws java.io.IOException {
            r6 = this;
            r0 = 0
            r6.zzM = r0
        L3:
            boolean r1 = r6.zzM
            if (r1 != 0) goto L55
            com.google.android.gms.internal.ads.zzahv r1 = r6.zzaj
            boolean r1 = r1.zzc(r7)
            if (r1 == 0) goto L32
            long r1 = r7.zzf()
            boolean r3 = r6.zzF
            if (r3 == 0) goto L20
            r6.zzH = r1
            long r1 = r6.zzG
            r8.zza = r1
            r6.zzF = r0
            goto L30
        L20:
            boolean r1 = r6.zzC
            if (r1 == 0) goto L3
            long r1 = r6.zzH
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L3
            r8.zza = r1
            r6.zzH = r3
        L30:
            r7 = 1
            return r7
        L32:
            android.util.SparseArray r7 = r6.zzh
            int r7 = r7.size()
            if (r0 >= r7) goto L53
            android.util.SparseArray r7 = r6.zzh
            java.lang.Object r7 = r7.valueAt(r0)
            com.google.android.gms.internal.ads.zzahz r7 = (com.google.android.gms.internal.ads.zzahz) r7
            com.google.android.gms.internal.ads.zzahz.zzd(r7)
            com.google.android.gms.internal.ads.zzaei r8 = r7.zzT
            if (r8 == 0) goto L50
            com.google.android.gms.internal.ads.zzaeh r1 = r7.zzW
            com.google.android.gms.internal.ads.zzaeg r7 = r7.zzi
            r8.zza(r1, r7)
        L50:
            int r0 = r0 + 1
            goto L32
        L53:
            r7 = -1
            return r7
        L55:
            return r0
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
            r2.zzai = r3
            boolean r0 = r2.zzj
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzakt r0 = r2.zzk
            com.google.android.gms.internal.ads.zzakw r1 = new com.google.android.gms.internal.ads.zzakw
            r1.<init>(r3, r0)
            r3 = r1
        Le:
            r2.zzai = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r1, long r3) {
            r0 = this;
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzI = r1
            r1 = 0
            r0.zzN = r1
            com.google.android.gms.internal.ads.zzahv r2 = r0.zzaj
            r2.zzb()
            com.google.android.gms.internal.ads.zzaic r2 = r0.zzg
            r2.zze()
            r0.zzw()
        L17:
            android.util.SparseArray r2 = r0.zzh
            int r2 = r2.size()
            if (r1 >= r2) goto L31
            android.util.SparseArray r2 = r0.zzh
            java.lang.Object r2 = r2.valueAt(r1)
            com.google.android.gms.internal.ads.zzahz r2 = (com.google.android.gms.internal.ads.zzahz) r2
            com.google.android.gms.internal.ads.zzaei r2 = r2.zzT
            if (r2 == 0) goto L2e
            r2.zzb()
        L2e:
            int r1 = r1 + 1
            goto L17
        L31:
            return
    }

    protected final void zzh(int r20, int r21, com.google.android.gms.internal.ads.zzadc r22) throws java.io.IOException {
            r19 = this;
            r7 = r19
            r0 = r20
            r1 = r21
            r8 = r22
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            r4 = 4
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto Lf8
            if (r0 == r5) goto Lf8
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto Lc7
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto La3
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L96
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L84
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L61
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L54
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L3e
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzahz r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzv = r2
            r8.zzi(r2, r10, r1)
            return
        L3e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r3)
            throw r0
        L54:
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzahz r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzj = r2
            r8.zzi(r2, r10, r1)
            return
        L61:
            com.google.android.gms.internal.ads.zzek r0 = r7.zzp
            byte[] r0 = r0.zzN()
            java.util.Arrays.fill(r0, r10)
            com.google.android.gms.internal.ads.zzek r0 = r7.zzp
            int r2 = 4 - r1
            byte[] r0 = r0.zzN()
            r8.zzi(r0, r2, r1)
            com.google.android.gms.internal.ads.zzek r0 = r7.zzp
            r0.zzL(r10)
            com.google.android.gms.internal.ads.zzek r0 = r7.zzp
            long r0 = r0.zzu()
            int r1 = (int) r0
            r7.zzD = r1
            return
        L84:
            byte[] r2 = new byte[r1]
            r8.zzi(r2, r10, r1)
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzahz r0 = r7.zzB
            com.google.android.gms.internal.ads.zzaeg r1 = new com.google.android.gms.internal.ads.zzaeg
            r1.<init>(r9, r2, r10, r10)
            r0.zzi = r1
            return
        L96:
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzahz r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzh = r2
            r8.zzi(r2, r10, r1)
            return
        La3:
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzahz r0 = r7.zzB
            int r2 = com.google.android.gms.internal.ads.zzahz.zza(r0)
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto Lbf
            int r2 = com.google.android.gms.internal.ads.zzahz.zza(r0)
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto Lbb
            goto Lbf
        Lbb:
            r8.zzk(r1)
            return
        Lbf:
            byte[] r2 = new byte[r1]
            r0.zzN = r2
            r8.zzi(r2, r10, r1)
            return
        Lc7:
            int r0 = r7.zzN
            if (r0 == r6) goto Lcd
            goto L30a
        Lcd:
            android.util.SparseArray r0 = r7.zzh
            int r2 = r7.zzT
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.zzahz r0 = (com.google.android.gms.internal.ads.zzahz) r0
            int r2 = r7.zzW
            if (r2 != r4) goto Lf4
            java.lang.String r0 = r0.zzb
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf4
            com.google.android.gms.internal.ads.zzek r0 = r7.zzu
            r0.zzI(r1)
            com.google.android.gms.internal.ads.zzek r0 = r7.zzu
            byte[] r0 = r0.zzN()
            r8.zzi(r0, r10, r1)
            return
        Lf4:
            r8.zzk(r1)
            return
        Lf8:
            int r2 = r7.zzN
            r11 = 8
            if (r2 != 0) goto L11d
            com.google.android.gms.internal.ads.zzaic r2 = r7.zzg
            long r12 = r2.zzd(r8, r10, r9, r11)
            int r2 = (int) r12
            r7.zzT = r2
            com.google.android.gms.internal.ads.zzaic r2 = r7.zzg
            int r2 = r2.zza()
            r7.zzU = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zzP = r12
            r7.zzN = r9
            com.google.android.gms.internal.ads.zzek r2 = r7.zzn
            r2.zzI(r10)
        L11d:
            android.util.SparseArray r2 = r7.zzh
            int r12 = r7.zzT
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.gms.internal.ads.zzahz r12 = (com.google.android.gms.internal.ads.zzahz) r12
            if (r12 != 0) goto L134
            int r0 = r7.zzU
            int r0 = r1 - r0
            r8.zzk(r0)
            r7.zzN = r10
            return
        L134:
            com.google.android.gms.internal.ads.zzahz.zzd(r12)
            int r2 = r7.zzN
            if (r2 != r9) goto L2c0
            r2 = 3
            r7.zzv(r8, r2)
            com.google.android.gms.internal.ads.zzek r13 = r7.zzn
            byte[] r13 = r13.zzN()
            r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r9
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L161
            r7.zzR = r9
            int[] r2 = r7.zzS
            int[] r2 = zzz(r2, r9)
            r7.zzS = r2
            int r3 = r7.zzU
            int r1 = r1 - r3
            int r1 = r1 + (-3)
            r2[r10] = r1
            goto L272
        L161:
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzek r15 = r7.zzn
            byte[] r15 = r15.zzN()
            r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r9
            r7.zzR = r15
            int[] r4 = r7.zzS
            int[] r4 = zzz(r4, r15)
            r7.zzS = r4
            if (r13 != r6) goto L187
            int r2 = r7.zzU
            int r1 = r1 - r2
            int r1 = r1 + (-4)
            int r2 = r7.zzR
            int r1 = r1 / r2
            java.util.Arrays.fill(r4, r10, r2, r1)
            goto L272
        L187:
            if (r13 != r9) goto L1bf
            r2 = 0
            r3 = 0
            r4 = 4
        L18c:
            int r13 = r7.zzR
            int r13 = r13 + (-1)
            if (r2 >= r13) goto L1b4
            int[] r13 = r7.zzS
            r13[r2] = r10
        L196:
            int r4 = r4 + r9
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzek r13 = r7.zzn
            int r15 = r4 + (-1)
            byte[] r13 = r13.zzN()
            r13 = r13[r15]
            r13 = r13 & r14
            int[] r15 = r7.zzS
            r16 = r15[r2]
            int r16 = r16 + r13
            r15[r2] = r16
            if (r13 == r14) goto L196
            int r3 = r3 + r16
            int r2 = r2 + 1
            goto L18c
        L1b4:
            int[] r2 = r7.zzS
            int r15 = r7.zzU
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r3
            r2[r13] = r1
            goto L272
        L1bf:
            if (r13 != r2) goto L2b9
            r2 = 0
            r4 = 4
            r13 = 0
        L1c4:
            int r15 = r7.zzR
            int r15 = r15 + (-1)
            if (r2 >= r15) goto L269
            int[] r15 = r7.zzS
            r15[r2] = r10
            int r4 = r4 + 1
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzek r15 = r7.zzn
            int r16 = r4 + (-1)
            byte[] r15 = r15.zzN()
            r15 = r15[r16]
            if (r15 == 0) goto L262
            r15 = 0
        L1e0:
            if (r15 >= r11) goto L233
            int r17 = 7 - r15
            int r5 = r9 << r17
            com.google.android.gms.internal.ads.zzek r6 = r7.zzn
            byte[] r6 = r6.zzN()
            r6 = r6[r16]
            r6 = r6 & r5
            if (r6 == 0) goto L229
            int r4 = r4 + r15
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzek r6 = r7.zzn
            int r18 = r16 + 1
            byte[] r6 = r6.zzN()
            r6 = r6[r16]
            r6 = r6 & r14
            int r5 = ~r5
            r5 = r5 & r6
            long r5 = (long) r5
            r9 = r18
        L205:
            if (r9 >= r4) goto L21b
            long r5 = r5 << r11
            com.google.android.gms.internal.ads.zzek r11 = r7.zzn
            int r16 = r9 + 1
            byte[] r11 = r11.zzN()
            r9 = r11[r9]
            r9 = r9 & r14
            long r10 = (long) r9
            long r5 = r5 | r10
            r9 = r16
            r10 = 0
            r11 = 8
            goto L205
        L21b:
            if (r2 <= 0) goto L235
            r9 = 1
            int r15 = r15 * 7
            int r15 = r15 + 6
            long r9 = r9 << r15
            r15 = -1
            long r9 = r9 + r15
            long r5 = r5 - r9
            goto L235
        L229:
            int r15 = r15 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            goto L1e0
        L233:
            r5 = 0
        L235:
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 < 0) goto L25b
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 > 0) goto L25b
            int[] r9 = r7.zzS
            int r6 = (int) r5
            if (r2 == 0) goto L24d
            int r5 = r2 + (-1)
            r5 = r9[r5]
            int r6 = r6 + r5
        L24d:
            r9[r2] = r6
            int r13 = r13 + r6
            int r2 = r2 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            goto L1c4
        L25b:
            java.lang.String r0 = "EBML lacing sample size out of range."
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r3)
            throw r0
        L262:
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r3)
            throw r0
        L269:
            int[] r2 = r7.zzS
            int r3 = r7.zzU
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r13
            r2[r15] = r1
        L272:
            com.google.android.gms.internal.ads.zzek r1 = r7.zzn
            byte[] r1 = r1.zzN()
            r2 = 0
            r1 = r1[r2]
            r2 = 8
            int r1 = r1 << r2
            com.google.android.gms.internal.ads.zzek r2 = r7.zzn
            byte[] r2 = r2.zzN()
            r3 = 1
            r2 = r2[r3]
            r2 = r2 & r14
            long r3 = r7.zzI
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.zzr(r1)
            long r3 = r3 + r1
            r7.zzO = r3
            int r1 = r12.zzd
            r2 = 2
            if (r1 == r2) goto L2b0
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L2ae
            com.google.android.gms.internal.ads.zzek r0 = r7.zzn
            byte[] r0 = r0.zzN()
            r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L2ac
            r0 = 163(0xa3, float:2.28E-43)
            goto L2b0
        L2ac:
            r0 = 163(0xa3, float:2.28E-43)
        L2ae:
            r1 = 0
            goto L2b1
        L2b0:
            r1 = 1
        L2b1:
            r7.zzV = r1
            r7.zzN = r2
            r1 = 0
            r7.zzQ = r1
            goto L2c0
        L2b9:
            java.lang.String r0 = "Unexpected lacing value: 2"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r3)
            throw r0
        L2c0:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L2f3
        L2c4:
            int r0 = r7.zzQ
            int r1 = r7.zzR
            if (r0 >= r1) goto L2ef
            int[] r1 = r7.zzS
            r0 = r1[r0]
            r1 = 0
            int r5 = r7.zzp(r8, r12, r0, r1)
            long r0 = r7.zzO
            int r2 = r7.zzQ
            int r3 = r12.zze
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.zzV
            r6 = 0
            r0 = r19
            r1 = r12
            r0.zzu(r1, r2, r4, r5, r6)
            int r0 = r7.zzQ
            r1 = 1
            int r0 = r0 + r1
            r7.zzQ = r0
            goto L2c4
        L2ef:
            r0 = 0
            r7.zzN = r0
            return
        L2f3:
            r1 = 1
        L2f4:
            int r0 = r7.zzQ
            int r2 = r7.zzR
            if (r0 >= r2) goto L30a
            int[] r2 = r7.zzS
            r3 = r2[r0]
            int r3 = r7.zzp(r8, r12, r3, r1)
            r2[r0] = r3
            int r0 = r7.zzQ
            int r0 = r0 + r1
            r7.zzQ = r0
            goto L2f4
        L30a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r2) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzaib r0 = new com.google.android.gms.internal.ads.zzaib
            r0.<init>()
            boolean r2 = r0.zza(r2)
            return r2
    }

    protected final void zzj(int r22) throws com.google.android.gms.internal.ads.zzbo {
            r21 = this;
            r7 = r21
            r0 = r22
            com.google.android.gms.internal.ads.zzade r1 = r7.zzai
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 8
            java.lang.String r3 = "A_OPUS"
            r4 = 2
            r5 = 0
            if (r0 == r1) goto L335
            r1 = 174(0xae, float:2.44E-43)
            r10 = -1
            if (r0 == r1) goto L18b
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r2 = -1
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L173
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L140
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L129
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L111
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto Lfb
            if (r0 == r4) goto L3d
            goto L3b1
        L3d:
            boolean r0 = r7.zzC
            if (r0 != 0) goto Lf5
            com.google.android.gms.internal.ads.zzade r0 = r7.zzai
            com.google.android.gms.internal.ads.zzeb r1 = r7.zzJ
            com.google.android.gms.internal.ads.zzeb r4 = r7.zzK
            long r14 = r7.zzx
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto Le8
            long r2 = r7.zzA
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 == 0) goto Le8
            if (r1 == 0) goto Le8
            int r2 = r1.zza()
            if (r2 == 0) goto Le8
            if (r4 == 0) goto Le8
            int r2 = r4.zza()
            int r3 = r1.zza()
            if (r2 == r3) goto L69
            goto Le8
        L69:
            int r2 = r1.zza()
            int[] r3 = new int[r2]
            long[] r12 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r15 = 0
        L76:
            if (r15 >= r2) goto L8b
            long r16 = r1.zzb(r15)
            r14[r15] = r16
            long r8 = r7.zzx
            long r18 = r4.zzb(r15)
            long r8 = r8 + r18
            r12[r15] = r8
            int r15 = r15 + 1
            goto L76
        L8b:
            r9 = 0
        L8c:
            int r1 = r2 + (-1)
            if (r9 >= r1) goto La6
            int r1 = r9 + 1
            r17 = r12[r1]
            r19 = r12[r9]
            long r10 = r17 - r19
            int r4 = (int) r10
            r3[r9] = r4
            r10 = r14[r1]
            r17 = r14[r9]
            long r10 = r10 - r17
            r13[r9] = r10
            r9 = r1
            r10 = -1
            goto L8c
        La6:
            long r8 = r7.zzx
            long r10 = r7.zzw
            long r8 = r8 + r10
            r10 = r12[r1]
            long r8 = r8 - r10
            int r2 = (int) r8
            r3[r1] = r2
            long r8 = r7.zzA
            r10 = r14[r1]
            long r8 = r8 - r10
            r13[r1] = r8
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto Le2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Discarding last cue point with unexpected duration: "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MatroskaExtractor"
            com.google.android.gms.internal.ads.zzea.zzf(r4, r2)
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
            long[] r12 = java.util.Arrays.copyOf(r12, r1)
            long[] r13 = java.util.Arrays.copyOf(r13, r1)
            long[] r14 = java.util.Arrays.copyOf(r14, r1)
        Le2:
            com.google.android.gms.internal.ads.zzaco r1 = new com.google.android.gms.internal.ads.zzaco
            r1.<init>(r3, r12, r13, r14)
            goto Lef
        Le8:
            com.google.android.gms.internal.ads.zzadz r1 = new com.google.android.gms.internal.ads.zzadz
            long r2 = r7.zzA
            r1.<init>(r2, r5)
        Lef:
            r0.zzO(r1)
            r0 = 1
            r7.zzC = r0
        Lf5:
            r0 = 0
            r7.zzJ = r0
            r7.zzK = r0
            return
        Lfb:
            r0 = 0
            android.util.SparseArray r1 = r7.zzh
            int r1 = r1.size()
            if (r1 == 0) goto L10a
            com.google.android.gms.internal.ads.zzade r0 = r7.zzai
            r0.zzD()
            return
        L10a:
            java.lang.String r1 = "No valid tracks were found"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r1, r0)
            throw r0
        L111:
            long r0 = r7.zzy
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L11c
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.zzy = r0
        L11c:
            long r0 = r7.zzz
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L3b1
            long r0 = r7.zzr(r0)
            r7.zzA = r0
            return
        L129:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzahz r0 = r7.zzB
            boolean r1 = r0.zzg
            if (r1 == 0) goto L3b1
            byte[] r0 = r0.zzh
            if (r0 != 0) goto L138
            goto L3b1
        L138:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)
            throw r0
        L140:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzahz r0 = r7.zzB
            boolean r1 = r0.zzg
            if (r1 == 0) goto L3b1
            com.google.android.gms.internal.ads.zzaeg r1 = r0.zzi
            if (r1 == 0) goto L16b
            com.google.android.gms.internal.ads.zzy r1 = new com.google.android.gms.internal.ads.zzy
            r2 = 1
            com.google.android.gms.internal.ads.zzx[] r2 = new com.google.android.gms.internal.ads.zzx[r2]
            com.google.android.gms.internal.ads.zzx r3 = new com.google.android.gms.internal.ads.zzx
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzk.zza
            com.google.android.gms.internal.ads.zzahz r5 = r7.zzB
            com.google.android.gms.internal.ads.zzaeg r5 = r5.zzi
            byte[] r5 = r5.zzb
            java.lang.String r6 = "video/webm"
            r8 = 0
            r3.<init>(r4, r8, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r8, r2)
            r0.zzk = r1
            return
        L16b:
            r8 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r8)
            throw r0
        L173:
            int r0 = r7.zzD
            r1 = -1
            if (r0 == r1) goto L183
            long r5 = r7.zzE
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L183
            if (r0 != r4) goto L3b1
            r7.zzG = r5
            return
        L183:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)
            throw r0
        L18b:
            r1 = -1
            com.google.android.gms.internal.ads.zzahz r0 = r7.zzB
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            java.lang.String r5 = r0.zzb
            if (r5 == 0) goto L32d
            int r6 = r5.hashCode()
            switch(r6) {
                case -2095576542: goto L30b;
                case -2095575984: goto L301;
                case -1985379776: goto L2f6;
                case -1784763192: goto L2eb;
                case -1730367663: goto L2e0;
                case -1482641358: goto L2d5;
                case -1482641357: goto L2ca;
                case -1373388978: goto L2bf;
                case -933872740: goto L2b4;
                case -538363189: goto L2a9;
                case -538363109: goto L29e;
                case -425012669: goto L292;
                case -356037306: goto L286;
                case 62923557: goto L27a;
                case 62923603: goto L26e;
                case 62927045: goto L262;
                case 82318131: goto L257;
                case 82338133: goto L24c;
                case 82338134: goto L241;
                case 99146302: goto L235;
                case 444813526: goto L229;
                case 542569478: goto L21d;
                case 635596514: goto L211;
                case 725948237: goto L205;
                case 725957860: goto L1f9;
                case 738597099: goto L1ed;
                case 855502857: goto L1e3;
                case 1045209816: goto L1d7;
                case 1422270023: goto L1cb;
                case 1809237540: goto L1c0;
                case 1950749482: goto L1b4;
                case 1950789798: goto L1a8;
                case 1951062397: goto L19e;
                default: goto L19c;
            }
        L19c:
            goto L315
        L19e:
            boolean r2 = r5.equals(r3)
            if (r2 == 0) goto L315
            r2 = 11
            goto L316
        L1a8:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 22
            goto L316
        L1b4:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 17
            goto L316
        L1c0:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 3
            goto L316
        L1cb:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 27
            goto L316
        L1d7:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 29
            goto L316
        L1e3:
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L315
            goto L316
        L1ed:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 28
            goto L316
        L1f9:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 24
            goto L316
        L205:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 25
            goto L316
        L211:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 26
            goto L316
        L21d:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 20
            goto L316
        L229:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 10
            goto L316
        L235:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 31
            goto L316
        L241:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 1
            goto L316
        L24c:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 0
            goto L316
        L257:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 2
            goto L316
        L262:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 19
            goto L316
        L26e:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 16
            goto L316
        L27a:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 13
            goto L316
        L286:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 21
            goto L316
        L292:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 30
            goto L316
        L29e:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 7
            goto L316
        L2a9:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 5
            goto L316
        L2b4:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 32
            goto L316
        L2bf:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 9
            goto L316
        L2ca:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 15
            goto L316
        L2d5:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 14
            goto L316
        L2e0:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 12
            goto L316
        L2eb:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 18
            goto L316
        L2f6:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 23
            goto L316
        L301:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 4
            goto L316
        L30b:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L315
            r2 = 6
            goto L316
        L315:
            r2 = -1
        L316:
            switch(r2) {
                case 0: goto L31b;
                case 1: goto L31b;
                case 2: goto L31b;
                case 3: goto L31b;
                case 4: goto L31b;
                case 5: goto L31b;
                case 6: goto L31b;
                case 7: goto L31b;
                case 8: goto L31b;
                case 9: goto L31b;
                case 10: goto L31b;
                case 11: goto L31b;
                case 12: goto L31b;
                case 13: goto L31b;
                case 14: goto L31b;
                case 15: goto L31b;
                case 16: goto L31b;
                case 17: goto L31b;
                case 18: goto L31b;
                case 19: goto L31b;
                case 20: goto L31b;
                case 21: goto L31b;
                case 22: goto L31b;
                case 23: goto L31b;
                case 24: goto L31b;
                case 25: goto L31b;
                case 26: goto L31b;
                case 27: goto L31b;
                case 28: goto L31b;
                case 29: goto L31b;
                case 30: goto L31b;
                case 31: goto L31b;
                case 32: goto L31b;
                default: goto L319;
            }
        L319:
            r0 = 0
            goto L32a
        L31b:
            com.google.android.gms.internal.ads.zzade r1 = r7.zzai
            int r2 = r0.zzc
            r0.zze(r1, r2)
            android.util.SparseArray r1 = r7.zzh
            int r2 = r0.zzc
            r1.put(r2, r0)
            goto L319
        L32a:
            r7.zzB = r0
            return
        L32d:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r1, r0)
            throw r0
        L335:
            int r0 = r7.zzN
            if (r0 != r4) goto L3b1
            android.util.SparseArray r0 = r7.zzh
            int r1 = r7.zzT
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            com.google.android.gms.internal.ads.zzahz r8 = (com.google.android.gms.internal.ads.zzahz) r8
            com.google.android.gms.internal.ads.zzahz.zzd(r8)
            long r0 = r7.zzY
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L36f
            java.lang.String r0 = r8.zzb
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L36f
            com.google.android.gms.internal.ads.zzek r0 = r7.zzu
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            long r2 = r7.zzY
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            int r2 = r1.length
            r0.zzJ(r1, r2)
        L36f:
            r0 = 0
            r4 = 0
        L371:
            int r1 = r7.zzR
            if (r4 >= r1) goto L37d
            int[] r1 = r7.zzS
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L371
        L37d:
            r4 = 0
        L37e:
            int r1 = r7.zzR
            if (r4 >= r1) goto L3ae
            long r1 = r7.zzO
            int r3 = r8.zze
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r2 = r1 + r5
            int r1 = r7.zzV
            if (r4 != 0) goto L39a
            boolean r4 = r7.zzX
            if (r4 != 0) goto L397
            r1 = r1 | 1
        L397:
            r4 = r1
            r9 = 0
            goto L39c
        L39a:
            r9 = r4
            r4 = r1
        L39c:
            int[] r1 = r7.zzS
            r5 = r1[r9]
            int r10 = r0 - r5
            r0 = r21
            r1 = r8
            r6 = r10
            r0.zzu(r1, r2, r4, r5, r6)
            r0 = 1
            int r4 = r9 + 1
            r0 = r10
            goto L37e
        L3ae:
            r1 = 0
            r7.zzN = r1
        L3b1:
            return
    }

    protected final void zzk(int r2, double r3) throws com.google.android.gms.internal.ads.zzbo {
            r1 = this;
            r0 = 181(0xb5, float:2.54E-43)
            if (r2 == r0) goto L88
            r0 = 17545(0x4489, float:2.4586E-41)
            if (r2 == r0) goto L84
            switch(r2) {
                case 21969: goto L7b;
                case 21970: goto L72;
                case 21971: goto L69;
                case 21972: goto L60;
                case 21973: goto L57;
                case 21974: goto L4e;
                case 21975: goto L45;
                case 21976: goto L3c;
                case 21977: goto L33;
                case 21978: goto L2a;
                default: goto Lb;
            }
        Lb:
            switch(r2) {
                case 30323: goto L21;
                case 30324: goto L18;
                case 30325: goto Lf;
                default: goto Le;
            }
        Le:
            return
        Lf:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzu = r3
            return
        L18:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzt = r3
            return
        L21:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzs = r3
            return
        L2a:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzM = r3
            return
        L33:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzL = r3
            return
        L3c:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzK = r3
            return
        L45:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzJ = r3
            return
        L4e:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzI = r3
            return
        L57:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzH = r3
            return
        L60:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzG = r3
            return
        L69:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzF = r3
            return
        L72:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzE = r3
            return
        L7b:
            float r3 = (float) r3
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzD = r3
            return
        L84:
            long r2 = (long) r3
            r1.zzz = r2
            return
        L88:
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            int r3 = (int) r3
            r2.zzQ = r3
            return
    }

    protected final void zzl(int r9, long r10) throws com.google.android.gms.internal.ads.zzbo {
            r8 = this;
            r0 = 20529(0x5031, float:2.8767E-41)
            r1 = 0
            java.lang.String r2 = " not supported"
            if (r9 == r0) goto L24a
            r0 = 20530(0x5032, float:2.8769E-41)
            r3 = 1
            if (r9 == r0) goto L22c
            r0 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r9) {
                case 131: goto L223;
                case 136: goto L216;
                case 155: goto L20f;
                case 159: goto L206;
                case 176: goto L1fd;
                case 179: goto L1f0;
                case 186: goto L1e7;
                case 215: goto L1de;
                case 231: goto L1d7;
                case 238: goto L1d3;
                case 241: goto L1c4;
                case 251: goto L1c1;
                case 16871: goto L1b7;
                case 16980: goto L196;
                case 17029: goto L171;
                case 17143: goto L152;
                case 18401: goto L131;
                case 18408: goto L112;
                case 21420: goto L10c;
                case 21432: goto Le8;
                case 21680: goto Ldf;
                case 21682: goto Ld6;
                case 21690: goto Lcd;
                case 21930: goto Lc0;
                case 21938: goto Lb5;
                case 21998: goto Lac;
                case 22186: goto La4;
                case 22203: goto L9c;
                case 25188: goto L93;
                case 30114: goto L90;
                case 30321: goto L6e;
                case 2352003: goto L65;
                case 2807729: goto L62;
                default: goto L14;
            }
        L14:
            r0 = -1
            switch(r9) {
                case 21945: goto L4e;
                case 21946: goto L3f;
                case 21947: goto L2c;
                case 21948: goto L23;
                case 21949: goto L1a;
                default: goto L18;
            }
        L18:
            goto L250
        L1a:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzC = r11
            return
        L23:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzB = r11
            return
        L2c:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzx = r7
            int r9 = com.google.android.gms.internal.ads.zzo.zza(r11)
            if (r9 == r0) goto L250
            com.google.android.gms.internal.ads.zzahz r10 = r8.zzB
            r10.zzy = r9
            return
        L3f:
            int r11 = (int) r10
            r8.zzt(r9)
            int r9 = com.google.android.gms.internal.ads.zzo.zzb(r11)
            if (r9 == r0) goto L250
            com.google.android.gms.internal.ads.zzahz r10 = r8.zzB
            r10.zzz = r9
            return
        L4e:
            int r11 = (int) r10
            r8.zzt(r9)
            if (r11 == r7) goto L5d
            if (r11 == r6) goto L58
            goto L250
        L58:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzA = r7
            return
        L5d:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzA = r6
            return
        L62:
            r8.zzy = r10
            return
        L65:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zze = r11
            return
        L6e:
            int r11 = (int) r10
            r8.zzt(r9)
            if (r11 == 0) goto L8b
            if (r11 == r7) goto L86
            if (r11 == r6) goto L81
            if (r11 == r5) goto L7c
            goto L250
        L7c:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzr = r5
            return
        L81:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzr = r6
            return
        L86:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzr = r7
            return
        L8b:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzr = r0
            return
        L90:
            r8.zzY = r10
            return
        L93:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzP = r11
            return
        L9c:
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzS = r10
            return
        La4:
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzR = r10
            return
        Lac:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzf = r11
            return
        Lb5:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzx = r7
            r9.zzn = r11
            return
        Lc0:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto Lc5
            r0 = 1
        Lc5:
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzU = r0
            return
        Lcd:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzp = r11
            return
        Ld6:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzq = r11
            return
        Ldf:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzo = r11
            return
        Le8:
            int r11 = (int) r10
            r8.zzt(r9)
            if (r11 == 0) goto L107
            if (r11 == r7) goto L102
            if (r11 == r5) goto Lfd
            r9 = 15
            if (r11 == r9) goto Lf8
            goto L250
        Lf8:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzw = r5
            return
        Lfd:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzw = r7
            return
        L102:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzw = r6
            return
        L107:
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzw = r0
            return
        L10c:
            long r0 = r8.zzx
            long r10 = r10 + r0
            r8.zzE = r10
            return
        L112:
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L118
            goto L250
        L118:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "AESSettingsCipherMode "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.gms.internal.ads.zzbo r9 = com.google.android.gms.internal.ads.zzbo.zza(r9, r1)
            throw r9
        L131:
            r3 = 5
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L139
            goto L250
        L139:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ContentEncAlgo "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.gms.internal.ads.zzbo r9 = com.google.android.gms.internal.ads.zzbo.zza(r9, r1)
            throw r9
        L152:
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L158
            goto L250
        L158:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "EBMLReadVersion "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.gms.internal.ads.zzbo r9 = com.google.android.gms.internal.ads.zzbo.zza(r9, r1)
            throw r9
        L171:
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 < 0) goto L17d
            r3 = 2
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 > 0) goto L17d
            goto L250
        L17d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "DocTypeReadVersion "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.gms.internal.ads.zzbo r9 = com.google.android.gms.internal.ads.zzbo.zza(r9, r1)
            throw r9
        L196:
            r3 = 3
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L19e
            goto L250
        L19e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ContentCompAlgo "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.gms.internal.ads.zzbo r9 = com.google.android.gms.internal.ads.zzbo.zza(r9, r1)
            throw r9
        L1b7:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            com.google.android.gms.internal.ads.zzahz.zzb(r9, r11)
            return
        L1c1:
            r8.zzX = r7
            return
        L1c4:
            boolean r0 = r8.zzL
            if (r0 != 0) goto L250
            r8.zzs(r9)
            com.google.android.gms.internal.ads.zzeb r9 = r8.zzK
            r9.zzc(r10)
            r8.zzL = r7
            return
        L1d3:
            int r9 = (int) r10
            r8.zzW = r9
            return
        L1d7:
            long r9 = r8.zzr(r10)
            r8.zzI = r9
            return
        L1de:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzc = r11
            return
        L1e7:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzm = r11
            return
        L1f0:
            r8.zzs(r9)
            com.google.android.gms.internal.ads.zzeb r9 = r8.zzJ
            long r10 = r8.zzr(r10)
            r9.zzc(r10)
            return
        L1fd:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzl = r11
            return
        L206:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzO = r11
            return
        L20f:
            long r9 = r8.zzr(r10)
            r8.zzP = r9
            return
        L216:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L21b
            r0 = 1
        L21b:
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzV = r0
            return
        L223:
            int r11 = (int) r10
            r8.zzt(r9)
            com.google.android.gms.internal.ads.zzahz r9 = r8.zzB
            r9.zzd = r11
            return
        L22c:
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L231
            goto L250
        L231:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ContentEncodingScope "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.gms.internal.ads.zzbo r9 = com.google.android.gms.internal.ads.zzbo.zza(r9, r1)
            throw r9
        L24a:
            r3 = 0
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L251
        L250:
            return
        L251:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ContentEncodingOrder "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.gms.internal.ads.zzbo r9 = com.google.android.gms.internal.ads.zzbo.zza(r9, r1)
            throw r9
    }

    protected final void zzm(int r7, long r8, long r10) throws com.google.android.gms.internal.ads.zzbo {
            r6 = this;
            com.google.android.gms.internal.ads.zzade r0 = r6.zzai
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            r0 = 160(0xa0, float:2.24E-43)
            r1 = 0
            r3 = 0
            if (r7 == r0) goto L9d
            r0 = 174(0xae, float:2.44E-43)
            if (r7 == r0) goto L95
            r0 = 187(0xbb, float:2.62E-43)
            if (r7 == r0) goto L92
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r3 = -1
            if (r7 == r0) goto L8c
            r0 = 20533(0x5035, float:2.8773E-41)
            r5 = 1
            if (r7 == r0) goto L84
            r0 = 21968(0x55d0, float:3.0784E-41)
            if (r7 == r0) goto L7c
            r0 = 408125543(0x18538067, float:2.7335937E-24)
            if (r7 == r0) goto L64
            r8 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r7 == r8) goto L53
            r8 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r7 == r8) goto L33
            goto L52
        L33:
            boolean r7 = r6.zzC
            if (r7 != 0) goto L52
            boolean r7 = r6.zzi
            if (r7 == 0) goto L44
            long r7 = r6.zzG
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L44
            r6.zzF = r5
            return
        L44:
            com.google.android.gms.internal.ads.zzade r7 = r6.zzai
            com.google.android.gms.internal.ads.zzadz r8 = new com.google.android.gms.internal.ads.zzadz
            long r9 = r6.zzA
            r8.<init>(r9, r1)
            r7.zzO(r8)
            r6.zzC = r5
        L52:
            return
        L53:
            com.google.android.gms.internal.ads.zzeb r7 = new com.google.android.gms.internal.ads.zzeb
            r8 = 32
            r7.<init>(r8)
            r6.zzJ = r7
            com.google.android.gms.internal.ads.zzeb r7 = new com.google.android.gms.internal.ads.zzeb
            r7.<init>(r8)
            r6.zzK = r7
            return
        L64:
            long r0 = r6.zzx
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 == 0) goto L77
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 != 0) goto L6f
            goto L77
        L6f:
            r7 = 0
            java.lang.String r8 = "Multiple Segment elements not supported"
            com.google.android.gms.internal.ads.zzbo r7 = com.google.android.gms.internal.ads.zzbo.zza(r8, r7)
            throw r7
        L77:
            r6.zzx = r8
            r6.zzw = r10
            return
        L7c:
            r6.zzt(r7)
            com.google.android.gms.internal.ads.zzahz r7 = r6.zzB
            r7.zzx = r5
            return
        L84:
            r6.zzt(r7)
            com.google.android.gms.internal.ads.zzahz r7 = r6.zzB
            r7.zzg = r5
            return
        L8c:
            r7 = -1
            r6.zzD = r7
            r6.zzE = r3
            return
        L92:
            r6.zzL = r3
            return
        L95:
            com.google.android.gms.internal.ads.zzahz r7 = new com.google.android.gms.internal.ads.zzahz
            r7.<init>()
            r6.zzB = r7
            return
        L9d:
            r6.zzX = r3
            r6.zzY = r1
            return
    }

    protected final void zzn(int r2, java.lang.String r3) throws com.google.android.gms.internal.ads.zzbo {
            r1 = this;
            r0 = 134(0x86, float:1.88E-43)
            if (r2 == r0) goto L51
            r0 = 17026(0x4282, float:2.3859E-41)
            if (r2 == r0) goto L23
            r0 = 21358(0x536e, float:2.9929E-41)
            if (r2 == r0) goto L1b
            r0 = 2274716(0x22b59c, float:3.187556E-39)
            if (r2 == r0) goto L12
            goto L50
        L12:
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            com.google.android.gms.internal.ads.zzahz.zzc(r2, r3)
            return
        L1b:
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zza = r3
            return
        L23:
            java.lang.String r2 = "webm"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L50
            java.lang.String r2 = "matroska"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L34
            goto L50
        L34:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "DocType "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = " not supported"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            com.google.android.gms.internal.ads.zzbo r2 = com.google.android.gms.internal.ads.zzbo.zza(r2, r3)
            throw r2
        L50:
            return
        L51:
            r1.zzt(r2)
            com.google.android.gms.internal.ads.zzahz r2 = r1.zzB
            r2.zzb = r3
            return
    }
}
