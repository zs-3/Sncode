package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzajg implements com.google.android.gms.internal.ads.zzadb {
    private static final byte[] zza = null;
    private static final com.google.android.gms.internal.ads.zzaf zzb = null;
    private long zzA;
    private com.google.android.gms.internal.ads.zzajf zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private com.google.android.gms.internal.ads.zzade zzH;
    private com.google.android.gms.internal.ads.zzaeh[] zzI;
    private com.google.android.gms.internal.ads.zzaeh[] zzJ;
    private boolean zzK;
    private final com.google.android.gms.internal.ads.zzakt zzc;
    private final int zzd;
    private final java.util.List zze;
    private final android.util.SparseArray zzf;
    private final com.google.android.gms.internal.ads.zzek zzg;
    private final com.google.android.gms.internal.ads.zzek zzh;
    private final com.google.android.gms.internal.ads.zzek zzi;
    private final byte[] zzj;
    private final com.google.android.gms.internal.ads.zzek zzk;
    private final com.google.android.gms.internal.ads.zzafz zzl;
    private final com.google.android.gms.internal.ads.zzek zzm;
    private final java.util.ArrayDeque zzn;
    private final java.util.ArrayDeque zzo;
    private final com.google.android.gms.internal.ads.zzfw zzp;
    private com.google.android.gms.internal.ads.zzgax zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private com.google.android.gms.internal.ads.zzek zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12} // fill-array
            com.google.android.gms.internal.ads.zzajg.zza = r0
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r1 = "application/x-emsg"
            r0.zzZ(r1)
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzaf()
            com.google.android.gms.internal.ads.zzajg.zzb = r0
            return
    }

    @java.lang.Deprecated
    public zzajg() {
            r7 = this;
            com.google.android.gms.internal.ads.zzakt r1 = com.google.android.gms.internal.ads.zzakt.zza
            com.google.android.gms.internal.ads.zzgax r5 = com.google.android.gms.internal.ads.zzgax.zzn()
            r2 = 32
            r3 = 0
            r4 = 0
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public zzajg(com.google.android.gms.internal.ads.zzakt r1, int r2, com.google.android.gms.internal.ads.zzer r3, com.google.android.gms.internal.ads.zzajr r4, java.util.List r5, com.google.android.gms.internal.ads.zzaeh r6) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r0.zze = r1
            com.google.android.gms.internal.ads.zzafz r1 = new com.google.android.gms.internal.ads.zzafz
            r1.<init>()
            r0.zzl = r1
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r2 = 16
            r1.<init>(r2)
            r0.zzm = r1
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            byte[] r3 = com.google.android.gms.internal.ads.zzfs.zza
            r1.<init>(r3)
            r0.zzg = r1
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r3 = 5
            r1.<init>(r3)
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r1.<init>()
            r0.zzi = r1
            byte[] r1 = new byte[r2]
            r0.zzj = r1
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r2.<init>(r1)
            r0.zzk = r2
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.zzn = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.zzo = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzn()
            r0.zzq = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzz = r1
            r0.zzy = r1
            r0.zzA = r1
            com.google.android.gms.internal.ads.zzade r1 = com.google.android.gms.internal.ads.zzade.zza
            r0.zzH = r1
            r1 = 0
            com.google.android.gms.internal.ads.zzaeh[] r2 = new com.google.android.gms.internal.ads.zzaeh[r1]
            r0.zzI = r2
            com.google.android.gms.internal.ads.zzaeh[] r1 = new com.google.android.gms.internal.ads.zzaeh[r1]
            r0.zzJ = r1
            com.google.android.gms.internal.ads.zzfw r1 = new com.google.android.gms.internal.ads.zzfw
            com.google.android.gms.internal.ads.zzajd r2 = new com.google.android.gms.internal.ads.zzajd
            r2.<init>(r0)
            r1.<init>(r2)
            r0.zzp = r1
            return
    }

    private static int zzg(int r2) throws com.google.android.gms.internal.ads.zzbo {
            if (r2 < 0) goto L3
            return r2
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected negative value: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 0
            com.google.android.gms.internal.ads.zzbo r2 = com.google.android.gms.internal.ads.zzbo.zza(r2, r0)
            throw r2
    }

    private static com.google.android.gms.internal.ads.zzy zzh(java.util.List r18) {
            int r0 = r18.size()
            r1 = 0
            r3 = 0
            r4 = 0
        L7:
            if (r3 >= r0) goto L137
            r5 = r18
            java.lang.Object r6 = r5.get(r3)
            com.google.android.gms.internal.ads.zzain r6 = (com.google.android.gms.internal.ads.zzain) r6
            int r7 = r6.zzd
            r8 = 1886614376(0x70737368, float:3.013775E29)
            if (r7 != r8) goto L130
            if (r4 != 0) goto L1f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1f:
            com.google.android.gms.internal.ads.zzek r6 = r6.zza
            byte[] r6 = r6.zzN()
            com.google.android.gms.internal.ads.zzek r7 = new com.google.android.gms.internal.ads.zzek
            r7.<init>(r6)
            int r9 = r7.zze()
            r10 = 32
            if (r9 >= r10) goto L39
        L32:
            r16 = r3
            r17 = r4
        L36:
            r2 = 0
            goto L110
        L39:
            r7.zzL(r1)
            int r9 = r7.zzb()
            int r10 = r7.zzg()
            java.lang.String r11 = "PsshAtomUtil"
            if (r10 == r9) goto L65
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Advertised atom size ("
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = ") does not match buffer size: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r7)
            goto L32
        L65:
            int r9 = r7.zzg()
            if (r9 == r8) goto L80
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Atom type is not pssh: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r7)
            goto L32
        L80:
            int r8 = r7.zzg()
            int r8 = com.google.android.gms.internal.ads.zzaio.zze(r8)
            r9 = 1
            if (r8 <= r9) goto La0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Unsupported pssh version: "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r7)
            goto L32
        La0:
            java.util.UUID r10 = new java.util.UUID
            long r12 = r7.zzt()
            long r14 = r7.zzt()
            r10.<init>(r12, r14)
            if (r8 != r9) goto Ld9
            int r9 = r7.zzp()
            java.util.UUID[] r12 = new java.util.UUID[r9]
            r13 = 0
        Lb6:
            if (r13 >= r9) goto Ld4
            java.util.UUID r14 = new java.util.UUID
            r16 = r3
            long r2 = r7.zzt()
            r17 = r4
            long r4 = r7.zzt()
            r14.<init>(r2, r4)
            r12[r13] = r14
            int r13 = r13 + 1
            r5 = r18
            r3 = r16
            r4 = r17
            goto Lb6
        Ld4:
            r16 = r3
            r17 = r4
            goto Lde
        Ld9:
            r16 = r3
            r17 = r4
            r12 = 0
        Lde:
            int r2 = r7.zzp()
            int r3 = r7.zzb()
            if (r2 == r3) goto L106
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Atom data size ("
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ") does not match the bytes left: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r2)
            goto L36
        L106:
            byte[] r3 = new byte[r2]
            r7.zzH(r3, r1, r2)
            com.google.android.gms.internal.ads.zzajn r2 = new com.google.android.gms.internal.ads.zzajn
            r2.<init>(r10, r8, r3, r12)
        L110:
            if (r2 != 0) goto L114
            r2 = 0
            goto L116
        L114:
            java.util.UUID r2 = r2.zza
        L116:
            if (r2 != 0) goto L122
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzea.zzf(r2, r3)
            r4 = r17
            goto L132
        L122:
            com.google.android.gms.internal.ads.zzx r3 = new com.google.android.gms.internal.ads.zzx
            java.lang.String r4 = "video/mp4"
            r5 = 0
            r3.<init>(r2, r5, r4, r6)
            r4 = r17
            r4.add(r3)
            goto L133
        L130:
            r16 = r3
        L132:
            r5 = 0
        L133:
            int r3 = r16 + 1
            goto L7
        L137:
            r5 = 0
            if (r4 != 0) goto L13b
            return r5
        L13b:
            com.google.android.gms.internal.ads.zzy r0 = new com.google.android.gms.internal.ads.zzy
            r0.<init>(r4)
            return r0
    }

    private final void zzj() {
            r1 = this;
            r0 = 0
            r1.zzr = r0
            r1.zzu = r0
            return
    }

    private static void zzk(com.google.android.gms.internal.ads.zzek r3, int r4, com.google.android.gms.internal.ads.zzajt r5) throws com.google.android.gms.internal.ads.zzbo {
            int r4 = r4 + 8
            r3.zzL(r4)
            int r4 = r3.zzg()
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            r0 = r4 & 1
            if (r0 != 0) goto L6b
            r4 = r4 & 2
            r0 = 0
            if (r4 == 0) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            int r1 = r3.zzp()
            if (r1 != 0) goto L27
            boolean[] r3 = r5.zzl
            int r4 = r5.zze
            java.util.Arrays.fill(r3, r0, r4, r0)
            return
        L27:
            int r2 = r5.zze
            if (r1 != r2) goto L4c
            boolean[] r2 = r5.zzl
            java.util.Arrays.fill(r2, r0, r1, r4)
            int r4 = r3.zzb()
            r5.zza(r4)
            com.google.android.gms.internal.ads.zzek r4 = r5.zzn
            byte[] r1 = r4.zzN()
            int r4 = r4.zze()
            r3.zzH(r1, r0, r4)
            com.google.android.gms.internal.ads.zzek r3 = r5.zzn
            r3.zzL(r0)
            r5.zzo = r0
            return
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Senc sample count "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " is different from fragment sample count"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r4 = 0
            com.google.android.gms.internal.ads.zzbo r3 = com.google.android.gms.internal.ads.zzbo.zza(r3, r4)
            throw r3
        L6b:
            java.lang.String r3 = "Overriding TrackEncryptionBox parameters is unsupported."
            com.google.android.gms.internal.ads.zzbo r3 = com.google.android.gms.internal.ads.zzbo.zzc(r3)
            throw r3
    }

    private final void zzl(long r51) throws com.google.android.gms.internal.ads.zzbo {
            r50 = this;
            r0 = r50
        L2:
            java.util.ArrayDeque r1 = r0.zzn
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L72b
            java.util.ArrayDeque r1 = r0.zzn
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzaim r1 = (com.google.android.gms.internal.ads.zzaim) r1
            long r1 = r1.zza
            int r3 = (r1 > r51 ? 1 : (r1 == r51 ? 0 : -1))
            if (r3 != 0) goto L72b
            java.util.ArrayDeque r1 = r0.zzn
            java.lang.Object r1 = r1.pop()
            r2 = r1
            com.google.android.gms.internal.ads.zzaim r2 = (com.google.android.gms.internal.ads.zzaim) r2
            int r1 = r2.zzd
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            r8 = 8
            if (r1 != r3) goto L146
            java.util.List r1 = r2.zzb
            com.google.android.gms.internal.ads.zzy r1 = zzh(r1)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.android.gms.internal.ads.zzaim r3 = r2.zza(r3)
            java.util.Objects.requireNonNull(r3)
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.util.List r9 = r3.zzb
            int r9 = r9.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
        L4d:
            if (r13 >= r9) goto Lb8
            java.util.List r14 = r3.zzb
            java.lang.Object r14 = r14.get(r13)
            com.google.android.gms.internal.ads.zzain r14 = (com.google.android.gms.internal.ads.zzain) r14
            int r15 = r14.zzd
            r11 = 1953654136(0x74726578, float:7.6818474E31)
            if (r15 != r11) goto L96
            com.google.android.gms.internal.ads.zzek r11 = r14.zza
            r11.zzL(r6)
            int r14 = r11.zzg()
            int r15 = r11.zzg()
            int r15 = r15 + (-1)
            int r6 = r11.zzg()
            int r10 = r11.zzg()
            int r11 = r11.zzg()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.google.android.gms.internal.ads.zzajb r7 = new com.google.android.gms.internal.ads.zzajb
            r7.<init>(r15, r6, r10, r11)
            android.util.Pair r6 = android.util.Pair.create(r14, r7)
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.second
            com.google.android.gms.internal.ads.zzajb r6 = (com.google.android.gms.internal.ads.zzajb) r6
            r12.put(r7, r6)
            goto Lb3
        L96:
            r6 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r15 != r6) goto Lb3
            com.google.android.gms.internal.ads.zzek r4 = r14.zza
            r4.zzL(r8)
            int r5 = r4.zzg()
            int r5 = com.google.android.gms.internal.ads.zzaio.zze(r5)
            if (r5 != 0) goto Laf
            long r4 = r4.zzu()
            goto Lb3
        Laf:
            long r4 = r4.zzw()
        Lb3:
            int r13 = r13 + 1
            r6 = 12
            goto L4d
        Lb8:
            com.google.android.gms.internal.ads.zzadp r3 = new com.google.android.gms.internal.ads.zzadp
            r3.<init>()
            int r6 = r0.zzd
            r7 = 16
            r6 = r6 & r7
            if (r6 == 0) goto Lc6
            r7 = 1
            goto Lc7
        Lc6:
            r7 = 0
        Lc7:
            r8 = 0
            com.google.android.gms.internal.ads.zzajc r9 = new com.google.android.gms.internal.ads.zzajc
            r9.<init>(r0)
            r6 = r1
            java.util.List r1 = com.google.android.gms.internal.ads.zzaiz.zzd(r2, r3, r4, r6, r7, r8, r9)
            int r2 = r1.size()
            android.util.SparseArray r3 = r0.zzf
            int r3 = r3.size()
            if (r3 != 0) goto L117
            r11 = 0
        Ldf:
            if (r11 >= r2) goto L110
            java.lang.Object r3 = r1.get(r11)
            com.google.android.gms.internal.ads.zzaju r3 = (com.google.android.gms.internal.ads.zzaju) r3
            com.google.android.gms.internal.ads.zzajr r4 = r3.zza
            com.google.android.gms.internal.ads.zzajf r5 = new com.google.android.gms.internal.ads.zzajf
            com.google.android.gms.internal.ads.zzade r6 = r0.zzH
            int r7 = r4.zzb
            com.google.android.gms.internal.ads.zzaeh r6 = r6.zzw(r11, r7)
            int r7 = r4.zza
            com.google.android.gms.internal.ads.zzajb r7 = zzm(r12, r7)
            r5.<init>(r6, r3, r7)
            android.util.SparseArray r3 = r0.zzf
            int r6 = r4.zza
            r3.put(r6, r5)
            long r5 = r0.zzz
            long r3 = r4.zze
            long r3 = java.lang.Math.max(r5, r3)
            r0.zzz = r3
            int r11 = r11 + 1
            goto Ldf
        L110:
            com.google.android.gms.internal.ads.zzade r1 = r0.zzH
            r1.zzD()
            goto L2
        L117:
            android.util.SparseArray r3 = r0.zzf
            int r3 = r3.size()
            if (r3 != r2) goto L121
            r10 = 1
            goto L122
        L121:
            r10 = 0
        L122:
            com.google.android.gms.internal.ads.zzdi.zzf(r10)
            r11 = 0
        L126:
            if (r11 >= r2) goto L2
            java.lang.Object r3 = r1.get(r11)
            com.google.android.gms.internal.ads.zzaju r3 = (com.google.android.gms.internal.ads.zzaju) r3
            com.google.android.gms.internal.ads.zzajr r4 = r3.zza
            android.util.SparseArray r5 = r0.zzf
            int r6 = r4.zza
            java.lang.Object r5 = r5.get(r6)
            com.google.android.gms.internal.ads.zzajf r5 = (com.google.android.gms.internal.ads.zzajf) r5
            int r4 = r4.zza
            com.google.android.gms.internal.ads.zzajb r4 = zzm(r12, r4)
            r5.zzh(r3, r4)
            int r11 = r11 + 1
            goto L126
        L146:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 != r3) goto L713
            android.util.SparseArray r1 = r0.zzf
            int r3 = r0.zzd
            byte[] r6 = r0.zzj
            java.util.List r7 = r2.zzc
            int r7 = r7.size()
            r9 = 0
        L158:
            if (r9 >= r7) goto L67e
            java.util.List r11 = r2.zzc
            java.lang.Object r11 = r11.get(r9)
            com.google.android.gms.internal.ads.zzaim r11 = (com.google.android.gms.internal.ads.zzaim) r11
            int r12 = r11.zzd
            r13 = 1953653094(0x74726166, float:7.6813435E31)
            if (r12 != r13) goto L65a
            r12 = 1952868452(0x74666864, float:7.301914E31)
            com.google.android.gms.internal.ads.zzain r12 = r11.zzb(r12)
            java.util.Objects.requireNonNull(r12)
            com.google.android.gms.internal.ads.zzek r12 = r12.zza
            r12.zzL(r8)
            int r13 = r12.zzg()
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r14
            int r15 = r12.zzg()
            java.lang.Object r15 = r1.get(r15)
            com.google.android.gms.internal.ads.zzajf r15 = (com.google.android.gms.internal.ads.zzajf) r15
            if (r15 != 0) goto L18e
            r15 = 0
            goto L1d7
        L18e:
            r17 = r13 & 1
            if (r17 == 0) goto L19c
            long r4 = r12.zzw()
            com.google.android.gms.internal.ads.zzajt r10 = r15.zzb
            r10.zzb = r4
            r10.zzc = r4
        L19c:
            com.google.android.gms.internal.ads.zzajb r4 = r15.zze
            r5 = r13 & 2
            if (r5 == 0) goto L1a9
            int r5 = r12.zzg()
            int r5 = r5 + (-1)
            goto L1ab
        L1a9:
            int r5 = r4.zza
        L1ab:
            r10 = r13 & 8
            if (r10 == 0) goto L1b4
            int r10 = r12.zzg()
            goto L1b6
        L1b4:
            int r10 = r4.zzb
        L1b6:
            r18 = r13 & 16
            if (r18 == 0) goto L1c1
            int r18 = r12.zzg()
            r14 = r18
            goto L1c3
        L1c1:
            int r14 = r4.zzc
        L1c3:
            r13 = r13 & 32
            if (r13 == 0) goto L1cc
            int r4 = r12.zzg()
            goto L1ce
        L1cc:
            int r4 = r4.zzd
        L1ce:
            com.google.android.gms.internal.ads.zzajt r12 = r15.zzb
            com.google.android.gms.internal.ads.zzajb r13 = new com.google.android.gms.internal.ads.zzajb
            r13.<init>(r5, r10, r14, r4)
            r12.zza = r13
        L1d7:
            if (r15 != 0) goto L1db
            goto L65a
        L1db:
            com.google.android.gms.internal.ads.zzajt r4 = r15.zzb
            long r12 = r4.zzp
            boolean r5 = r4.zzq
            r15.zzi()
            r10 = 1
            com.google.android.gms.internal.ads.zzajf.zzg(r15, r10)
            r14 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.android.gms.internal.ads.zzain r14 = r11.zzb(r14)
            if (r14 == 0) goto L212
            r16 = r3 & 2
            if (r16 != 0) goto L212
            com.google.android.gms.internal.ads.zzek r5 = r14.zza
            r5.zzL(r8)
            int r12 = r5.zzg()
            int r12 = com.google.android.gms.internal.ads.zzaio.zze(r12)
            if (r12 != r10) goto L209
            long r12 = r5.zzw()
            goto L20d
        L209:
            long r12 = r5.zzu()
        L20d:
            r4.zzp = r12
            r4.zzq = r10
            goto L216
        L212:
            r4.zzp = r12
            r4.zzq = r5
        L216:
            java.util.List r5 = r11.zzb
            int r10 = r5.size()
            r12 = 0
            r13 = 0
            r14 = 0
        L21f:
            r8 = 1953658222(0x7472756e, float:7.683823E31)
            if (r12 >= r10) goto L24b
            java.lang.Object r19 = r5.get(r12)
            r20 = r1
            r1 = r19
            com.google.android.gms.internal.ads.zzain r1 = (com.google.android.gms.internal.ads.zzain) r1
            r19 = r7
            int r7 = r1.zzd
            if (r7 != r8) goto L244
            com.google.android.gms.internal.ads.zzek r1 = r1.zza
            r7 = 12
            r1.zzL(r7)
            int r1 = r1.zzp()
            if (r1 <= 0) goto L244
            int r14 = r14 + r1
            int r13 = r13 + 1
        L244:
            int r12 = r12 + 1
            r7 = r19
            r1 = r20
            goto L21f
        L24b:
            r20 = r1
            r19 = r7
            r1 = 0
            r15.zzh = r1
            r15.zzg = r1
            r15.zzf = r1
            com.google.android.gms.internal.ads.zzajt r1 = r15.zzb
            r1.zzd = r13
            r1.zze = r14
            int[] r7 = r1.zzg
            int r7 = r7.length
            if (r7 >= r13) goto L269
            long[] r7 = new long[r13]
            r1.zzf = r7
            int[] r7 = new int[r13]
            r1.zzg = r7
        L269:
            int[] r7 = r1.zzh
            int r7 = r7.length
            if (r7 >= r14) goto L282
            int r14 = r14 * 125
            int r14 = r14 / 100
            int[] r7 = new int[r14]
            r1.zzh = r7
            long[] r7 = new long[r14]
            r1.zzi = r7
            boolean[] r7 = new boolean[r14]
            r1.zzj = r7
            boolean[] r7 = new boolean[r14]
            r1.zzl = r7
        L282:
            r1 = 0
            r7 = 0
            r12 = 0
        L285:
            r21 = 0
            if (r1 >= r10) goto L433
            java.lang.Object r14 = r5.get(r1)
            com.google.android.gms.internal.ads.zzain r14 = (com.google.android.gms.internal.ads.zzain) r14
            int r13 = r14.zzd
            if (r13 != r8) goto L403
            int r13 = r7 + 1
            com.google.android.gms.internal.ads.zzek r14 = r14.zza
            r8 = 8
            r14.zzL(r8)
            int r8 = r14.zzg()
            r18 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r18
            r24 = r5
            com.google.android.gms.internal.ads.zzaju r5 = r15.zzd
            com.google.android.gms.internal.ads.zzajr r5 = r5.zza
            r25 = r10
            com.google.android.gms.internal.ads.zzajt r10 = r15.zzb
            r26 = r13
            com.google.android.gms.internal.ads.zzajb r13 = r10.zza
            int r27 = com.google.android.gms.internal.ads.zzeu.zza
            int[] r0 = r10.zzg
            int r27 = r14.zzp()
            r0[r7] = r27
            long[] r0 = r10.zzf
            r28 = r1
            r27 = r2
            long r1 = r10.zzb
            r0[r7] = r1
            r29 = r8 & 1
            if (r29 == 0) goto L2da
            r29 = r9
            int r9 = r14.zzg()
            r30 = r11
            r31 = r12
            long r11 = (long) r9
            long r1 = r1 + r11
            r0[r7] = r1
            goto L2e0
        L2da:
            r29 = r9
            r30 = r11
            r31 = r12
        L2e0:
            r0 = r8 & 4
            if (r0 == 0) goto L2e6
            r0 = 1
            goto L2e7
        L2e6:
            r0 = 0
        L2e7:
            int r1 = r13.zzd
            if (r0 == 0) goto L2ef
            int r1 = r14.zzg()
        L2ef:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r9 = r8 & 512(0x200, float:7.175E-43)
            r11 = r8 & 1024(0x400, float:1.435E-42)
            r8 = r8 & 2048(0x800, float:2.87E-42)
            long[] r12 = r5.zzh
            if (r12 == 0) goto L338
            r32 = r1
            int r1 = r12.length
            r33 = r6
            r6 = 1
            if (r1 != r6) goto L334
            long[] r1 = r5.zzi
            if (r1 != 0) goto L308
            goto L334
        L308:
            r6 = 0
            r34 = r12[r6]
            int r12 = (r34 > r21 ? 1 : (r34 == r21 ? 0 : -1))
            if (r12 != 0) goto L313
            r6 = r0
            r34 = r11
            goto L32e
        L313:
            r36 = r1[r6]
            long r38 = r34 + r36
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r6 = r0
            long r0 = r5.zzd
            java.math.RoundingMode r44 = java.math.RoundingMode.FLOOR
            r42 = r0
            long r0 = com.google.android.gms.internal.ads.zzeu.zzt(r38, r40, r42, r44)
            r34 = r11
            long r11 = r5.zze
            int r35 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r35 >= 0) goto L32e
            goto L33f
        L32e:
            long[] r0 = r5.zzi
            r1 = 0
            r21 = r0[r1]
            goto L33f
        L334:
            r6 = r0
            r34 = r11
            goto L33f
        L338:
            r32 = r1
            r33 = r6
            r34 = r11
            r6 = r0
        L33f:
            int[] r0 = r10.zzh
            long[] r1 = r10.zzi
            boolean[] r11 = r10.zzj
            int r12 = r5.zzb
            r35 = r4
            r4 = 2
            if (r12 != r4) goto L352
            r4 = r3 & 1
            if (r4 == 0) goto L352
            r4 = 1
            goto L353
        L352:
            r4 = 0
        L353:
            int[] r12 = r10.zzg
            r7 = r12[r7]
            int r12 = r31 + r7
            r43 = r3
            r23 = r4
            long r3 = r5.zzc
            r5 = r0
            r44 = r1
            long r0 = r10.zzp
            r7 = r31
        L366:
            if (r7 >= r12) goto L3fc
            if (r2 == 0) goto L373
            int r31 = r14.zzg()
            r45 = r2
            r2 = r31
            goto L377
        L373:
            r45 = r2
            int r2 = r13.zzb
        L377:
            zzg(r2)
            if (r9 == 0) goto L383
            int r31 = r14.zzg()
            r46 = r9
            goto L389
        L383:
            r46 = r9
            int r9 = r13.zzc
            r31 = r9
        L389:
            zzg(r31)
            if (r34 == 0) goto L393
            int r9 = r14.zzg()
            goto L39e
        L393:
            if (r7 != 0) goto L39c
            if (r6 == 0) goto L39b
            r9 = r32
            r7 = 0
            goto L39e
        L39b:
            r7 = 0
        L39c:
            int r9 = r13.zzd
        L39e:
            if (r8 == 0) goto L3ad
            int r36 = r14.zzg()
            r47 = r6
            r49 = r12
            r48 = r13
            r6 = r36
            goto L3b4
        L3ad:
            r47 = r6
            r49 = r12
            r48 = r13
            r6 = 0
        L3b4:
            long r12 = (long) r6
            long r12 = r12 + r0
            long r36 = r12 - r21
            r38 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r42 = java.math.RoundingMode.FLOOR
            r40 = r3
            long r12 = com.google.android.gms.internal.ads.zzeu.zzt(r36, r38, r40, r42)
            r44[r7] = r12
            boolean r6 = r10.zzq
            if (r6 != 0) goto L3d3
            com.google.android.gms.internal.ads.zzaju r6 = r15.zzd
            r36 = r3
            long r3 = r6.zzh
            long r12 = r12 + r3
            r44[r7] = r12
            goto L3d5
        L3d3:
            r36 = r3
        L3d5:
            r5[r7] = r31
            r3 = 16
            int r4 = r9 >> 16
            r3 = 1
            r4 = r4 & r3
            if (r4 != 0) goto L3e8
            if (r23 == 0) goto L3e6
            if (r7 != 0) goto L3e8
            r4 = 1
            r7 = 0
            goto L3e9
        L3e6:
            r4 = 1
            goto L3e9
        L3e8:
            r4 = 0
        L3e9:
            r11[r7] = r4
            long r12 = (long) r2
            long r0 = r0 + r12
            int r7 = r7 + r3
            r3 = r36
            r2 = r45
            r9 = r46
            r6 = r47
            r13 = r48
            r12 = r49
            goto L366
        L3fc:
            r49 = r12
            r10.zzp = r0
            r7 = r26
            goto L41a
        L403:
            r28 = r1
            r27 = r2
            r43 = r3
            r35 = r4
            r24 = r5
            r33 = r6
            r29 = r9
            r25 = r10
            r30 = r11
            r31 = r12
            r18 = 16777215(0xffffff, float:2.3509886E-38)
        L41a:
            int r1 = r28 + 1
            r0 = r50
            r5 = r24
            r10 = r25
            r2 = r27
            r9 = r29
            r11 = r30
            r6 = r33
            r4 = r35
            r3 = r43
            r8 = 1953658222(0x7472756e, float:7.683823E31)
            goto L285
        L433:
            r27 = r2
            r43 = r3
            r35 = r4
            r33 = r6
            r29 = r9
            r30 = r11
            com.google.android.gms.internal.ads.zzaju r0 = r15.zzd
            com.google.android.gms.internal.ads.zzajr r0 = r0.zza
            r1 = r35
            com.google.android.gms.internal.ads.zzajb r2 = r1.zza
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.zza
            com.google.android.gms.internal.ads.zzajs r0 = r0.zza(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            r11 = r30
            com.google.android.gms.internal.ads.zzain r2 = r11.zzb(r2)
            if (r2 == 0) goto L4d0
            java.util.Objects.requireNonNull(r0)
            int r3 = r0.zzd
            com.google.android.gms.internal.ads.zzek r2 = r2.zza
            r4 = 8
            r2.zzL(r4)
            int r5 = r2.zzg()
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L472
            r2.zzM(r4)
        L472:
            int r4 = r2.zzm()
            int r5 = r2.zzp()
            int r6 = r1.zze
            if (r5 > r6) goto L4b1
            if (r4 != 0) goto L497
            boolean[] r4 = r1.zzl
            r6 = 0
            r7 = 0
        L484:
            if (r6 >= r5) goto L495
            int r8 = r2.zzm()
            int r7 = r7 + r8
            if (r8 <= r3) goto L48f
            r8 = 1
            goto L490
        L48f:
            r8 = 0
        L490:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L484
        L495:
            r4 = 0
            goto L4a4
        L497:
            if (r4 <= r3) goto L49b
            r2 = 1
            goto L49c
        L49b:
            r2 = 0
        L49c:
            int r7 = r4 * r5
            boolean[] r3 = r1.zzl
            r4 = 0
            java.util.Arrays.fill(r3, r4, r5, r2)
        L4a4:
            boolean[] r2 = r1.zzl
            int r3 = r1.zze
            java.util.Arrays.fill(r2, r5, r3, r4)
            if (r7 <= 0) goto L4d0
            r1.zza(r7)
            goto L4d0
        L4b1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Saiz sample count "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " is greater than fragment sample count"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)
            throw r0
        L4d0:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.android.gms.internal.ads.zzain r2 = r11.zzb(r2)
            if (r2 == 0) goto L51e
            com.google.android.gms.internal.ads.zzek r2 = r2.zza
            r3 = 8
            r2.zzL(r3)
            int r4 = r2.zzg()
            r5 = r4 & 1
            r6 = 1
            if (r5 != r6) goto L4ec
            r2.zzM(r3)
        L4ec:
            int r3 = r2.zzp()
            if (r3 != r6) goto L507
            int r3 = com.google.android.gms.internal.ads.zzaio.zze(r4)
            long r4 = r1.zzc
            if (r3 != 0) goto L4ff
            long r2 = r2.zzu()
            goto L503
        L4ff:
            long r2 = r2.zzw()
        L503:
            long r4 = r4 + r2
            r1.zzc = r4
            goto L51e
        L507:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r2)
            throw r0
        L51e:
            r2 = 0
            r3 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.android.gms.internal.ads.zzain r3 = r11.zzb(r3)
            if (r3 == 0) goto L52e
            com.google.android.gms.internal.ads.zzek r3 = r3.zza
            r4 = 0
            zzk(r3, r4, r1)
        L52e:
            if (r0 == 0) goto L534
            java.lang.String r0 = r0.zzb
            r5 = r0
            goto L535
        L534:
            r5 = r2
        L535:
            r0 = r2
            r3 = r0
            r4 = 0
        L538:
            java.util.List r6 = r11.zzb
            int r6 = r6.size()
            if (r4 >= r6) goto L575
            java.util.List r6 = r11.zzb
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.internal.ads.zzain r6 = (com.google.android.gms.internal.ads.zzain) r6
            com.google.android.gms.internal.ads.zzek r7 = r6.zza
            int r6 = r6.zzd
            r8 = 1935828848(0x73626770, float:1.7937577E31)
            r9 = 1936025959(0x73656967, float:1.817587E31)
            if (r6 != r8) goto L561
            r12 = 12
            r7.zzL(r12)
            int r6 = r7.zzg()
            if (r6 != r9) goto L572
            r0 = r7
            goto L572
        L561:
            r12 = 12
            r8 = 1936158820(0x73677064, float:1.8336489E31)
            if (r6 != r8) goto L572
            r7.zzL(r12)
            int r6 = r7.zzg()
            if (r6 != r9) goto L572
            r3 = r7
        L572:
            int r4 = r4 + 1
            goto L538
        L575:
            r12 = 12
            if (r0 == 0) goto L612
            if (r3 != 0) goto L57d
            goto L612
        L57d:
            r4 = 8
            r0.zzL(r4)
            int r6 = r0.zzg()
            int r6 = com.google.android.gms.internal.ads.zzaio.zze(r6)
            r7 = 4
            r0.zzM(r7)
            r8 = 1
            if (r6 != r8) goto L594
            r0.zzM(r7)
        L594:
            int r0 = r0.zzg()
            if (r0 != r8) goto L60b
            r3.zzL(r4)
            int r0 = r3.zzg()
            int r0 = com.google.android.gms.internal.ads.zzaio.zze(r0)
            r3.zzM(r7)
            if (r0 != r8) goto L5ba
            long r8 = r3.zzu()
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 == 0) goto L5b3
            goto L5c0
        L5b3:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        L5ba:
            r4 = 2
            if (r0 < r4) goto L5c0
            r3.zzM(r7)
        L5c0:
            long r8 = r3.zzu()
            r13 = 1
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L604
            r0 = 1
            r3.zzM(r0)
            int r4 = r3.zzm()
            r6 = r4 & 240(0xf0, float:3.36E-43)
            int r8 = r6 >> 4
            r9 = r4 & 15
            int r4 = r3.zzm()
            if (r4 != r0) goto L613
            int r6 = r3.zzm()
            r4 = 16
            byte[] r7 = new byte[r4]
            r10 = 0
            r3.zzH(r7, r10, r4)
            if (r6 != 0) goto L5f7
            int r2 = r3.zzm()
            byte[] r4 = new byte[r2]
            r3.zzH(r4, r10, r2)
            r10 = r4
            goto L5f8
        L5f7:
            r10 = r2
        L5f8:
            r1.zzk = r0
            com.google.android.gms.internal.ads.zzajs r2 = new com.google.android.gms.internal.ads.zzajs
            r4 = 1
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.zzm = r2
            goto L613
        L604:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        L60b:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        L612:
            r0 = 1
        L613:
            java.util.List r2 = r11.zzb
            int r2 = r2.size()
            r3 = 0
        L61a:
            if (r3 >= r2) goto L652
            java.util.List r4 = r11.zzb
            java.lang.Object r4 = r4.get(r3)
            com.google.android.gms.internal.ads.zzain r4 = (com.google.android.gms.internal.ads.zzain) r4
            int r5 = r4.zzd
            r6 = 1970628964(0x75756964, float:3.1109627E32)
            if (r5 != r6) goto L646
            com.google.android.gms.internal.ads.zzek r4 = r4.zza
            r5 = 8
            r4.zzL(r5)
            r7 = r33
            r6 = 0
            r8 = 16
            r4.zzH(r7, r6, r8)
            byte[] r9 = com.google.android.gms.internal.ads.zzajg.zza
            boolean r9 = java.util.Arrays.equals(r7, r9)
            if (r9 == 0) goto L64d
            zzk(r4, r8, r1)
            goto L64d
        L646:
            r7 = r33
            r5 = 8
            r6 = 0
            r8 = 16
        L64d:
            int r3 = r3 + 1
            r33 = r7
            goto L61a
        L652:
            r7 = r33
            r5 = 8
            r6 = 0
            r8 = 16
            goto L66d
        L65a:
            r20 = r1
            r27 = r2
            r43 = r3
            r19 = r7
            r29 = r9
            r0 = 1
            r5 = 8
            r8 = 16
            r12 = 12
            r7 = r6
            r6 = 0
        L66d:
            int r9 = r29 + 1
            r0 = r50
            r6 = r7
            r7 = r19
            r1 = r20
            r2 = r27
            r3 = r43
            r8 = 8
            goto L158
        L67e:
            r1 = r2
            r2 = 0
            r6 = 0
            java.util.List r0 = r1.zzb
            com.google.android.gms.internal.ads.zzy r0 = zzh(r0)
            r3 = r50
            if (r0 == 0) goto L6cf
            android.util.SparseArray r1 = r3.zzf
            int r1 = r1.size()
            r4 = 0
        L692:
            if (r4 >= r1) goto L6cf
            android.util.SparseArray r5 = r3.zzf
            java.lang.Object r5 = r5.valueAt(r4)
            com.google.android.gms.internal.ads.zzajf r5 = (com.google.android.gms.internal.ads.zzajf) r5
            com.google.android.gms.internal.ads.zzaju r7 = r5.zzd
            com.google.android.gms.internal.ads.zzajr r7 = r7.zza
            com.google.android.gms.internal.ads.zzajt r8 = r5.zzb
            com.google.android.gms.internal.ads.zzajb r8 = r8.zza
            int r9 = com.google.android.gms.internal.ads.zzeu.zza
            int r8 = r8.zza
            com.google.android.gms.internal.ads.zzajs r7 = r7.zza(r8)
            if (r7 == 0) goto L6b1
            java.lang.String r7 = r7.zzb
            goto L6b2
        L6b1:
            r7 = r2
        L6b2:
            com.google.android.gms.internal.ads.zzy r7 = r0.zzb(r7)
            com.google.android.gms.internal.ads.zzaju r8 = r5.zzd
            com.google.android.gms.internal.ads.zzajr r8 = r8.zza
            com.google.android.gms.internal.ads.zzaf r8 = r8.zzf
            com.google.android.gms.internal.ads.zzad r8 = r8.zzb()
            r8.zzF(r7)
            com.google.android.gms.internal.ads.zzaf r7 = r8.zzaf()
            com.google.android.gms.internal.ads.zzaeh r5 = r5.zza
            r5.zzl(r7)
            int r4 = r4 + 1
            goto L692
        L6cf:
            long r0 = r3.zzy
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L728
            android.util.SparseArray r0 = r3.zzf
            int r0 = r0.size()
            r11 = 0
        L6e1:
            if (r11 >= r0) goto L70b
            android.util.SparseArray r1 = r3.zzf
            java.lang.Object r1 = r1.valueAt(r11)
            com.google.android.gms.internal.ads.zzajf r1 = (com.google.android.gms.internal.ads.zzajf) r1
            long r4 = r3.zzy
            int r2 = r1.zzf
        L6ef:
            com.google.android.gms.internal.ads.zzajt r6 = r1.zzb
            int r7 = r6.zze
            if (r2 >= r7) goto L708
            long[] r7 = r6.zzi
            r8 = r7[r2]
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 > 0) goto L708
            boolean[] r6 = r6.zzj
            boolean r6 = r6[r2]
            if (r6 == 0) goto L705
            r1.zzi = r2
        L705:
            int r2 = r2 + 1
            goto L6ef
        L708:
            int r11 = r11 + 1
            goto L6e1
        L70b:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzy = r1
            goto L728
        L713:
            r3 = r0
            r1 = r2
            java.util.ArrayDeque r0 = r3.zzn
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L728
            java.util.ArrayDeque r0 = r3.zzn
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzaim r0 = (com.google.android.gms.internal.ads.zzaim) r0
            r0.zzc(r1)
        L728:
            r0 = r3
            goto L2
        L72b:
            r3 = r0
            r50.zzj()
            return
    }

    private static final com.google.android.gms.internal.ads.zzajb zzm(android.util.SparseArray r2, int r3) {
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto Lf
            r3 = 0
            java.lang.Object r2 = r2.valueAt(r3)
            com.google.android.gms.internal.ads.zzajb r2 = (com.google.android.gms.internal.ads.zzajb) r2
            return r2
        Lf:
            java.lang.Object r2 = r2.get(r3)
            com.google.android.gms.internal.ads.zzajb r2 = (com.google.android.gms.internal.ads.zzajb) r2
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    final /* synthetic */ void zza(long r2, com.google.android.gms.internal.ads.zzek r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaeh[] r0 = r1.zzJ
            com.google.android.gms.internal.ads.zzacn.zza(r2, r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r38, com.google.android.gms.internal.ads.zzadx r39) throws java.io.IOException {
            r37 = this;
            r0 = r37
            r1 = r38
        L4:
            int r2 = r0.zzr
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r6 = 2
            r7 = 8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L56d
            java.lang.String r11 = "FragmentedMp4Extractor"
            if (r2 == r9) goto L32c
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 3
            if (r2 == r6) goto L2ce
            com.google.android.gms.internal.ads.zzajf r2 = r0.zzB
            if (r2 != 0) goto L95
            android.util.SparseArray r2 = r0.zzf
            int r14 = r2.size()
            r15 = r3
            r3 = r8
            r4 = 0
        L2d:
            if (r4 >= r14) goto L63
            java.lang.Object r17 = r2.valueAt(r4)
            r5 = r17
            com.google.android.gms.internal.ads.zzajf r5 = (com.google.android.gms.internal.ads.zzajf) r5
            boolean r17 = com.google.android.gms.internal.ads.zzajf.zzj(r5)
            if (r17 != 0) goto L45
            int r6 = r5.zzf
            com.google.android.gms.internal.ads.zzaju r12 = r5.zzd
            int r12 = r12.zzb
            if (r6 == r12) goto L5f
        L45:
            boolean r6 = com.google.android.gms.internal.ads.zzajf.zzj(r5)
            if (r6 == 0) goto L54
            int r6 = r5.zzh
            com.google.android.gms.internal.ads.zzajt r12 = r5.zzb
            int r12 = r12.zzd
            if (r6 != r12) goto L54
            goto L5f
        L54:
            long r19 = r5.zzd()
            int r6 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r6 >= 0) goto L5f
            r3 = r5
            r15 = r19
        L5f:
            int r4 = r4 + 1
            r6 = 2
            goto L2d
        L63:
            if (r3 != 0) goto L7d
            long r2 = r0.zzw
            long r4 = r38.zzf()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L76
            r1.zzk(r3)
            r37.zzj()
            goto L4
        L76:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r8)
            throw r1
        L7d:
            long r4 = r3.zzd()
            long r14 = r38.zzf()
            long r4 = r4 - r14
            int r2 = (int) r4
            if (r2 >= 0) goto L8f
            java.lang.String r2 = "Ignoring negative offset to sample data."
            com.google.android.gms.internal.ads.zzea.zzf(r11, r2)
            r2 = 0
        L8f:
            r1.zzk(r2)
            r0.zzB = r3
            r2 = r3
        L95:
            int r3 = r0.zzr
            r4 = 6
            if (r3 != r13) goto L129
            int r3 = r2.zzb()
            r0.zzC = r3
            r0.zzF = r9
            int r5 = r2.zzf
            int r6 = r2.zzi
            if (r5 >= r6) goto Ldb
            r1.zzk(r3)
            com.google.android.gms.internal.ads.zzajs r1 = r2.zzf()
            if (r1 != 0) goto Lb2
            goto Ld0
        Lb2:
            com.google.android.gms.internal.ads.zzajt r3 = r2.zzb
            com.google.android.gms.internal.ads.zzek r3 = r3.zzn
            int r1 = r1.zzd
            if (r1 == 0) goto Lbd
            r3.zzM(r1)
        Lbd:
            com.google.android.gms.internal.ads.zzajt r1 = r2.zzb
            int r5 = r2.zzf
            boolean r1 = r1.zzb(r5)
            if (r1 == 0) goto Ld0
            int r1 = r3.zzq()
            int r1 = r1 * 6
            r3.zzM(r1)
        Ld0:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto Ld8
            r0.zzB = r8
        Ld8:
            r1 = 3
            goto L2ca
        Ldb:
            com.google.android.gms.internal.ads.zzaju r5 = r2.zzd
            com.google.android.gms.internal.ads.zzajr r5 = r5.zza
            int r5 = r5.zzg
            if (r5 != r9) goto Lea
            int r3 = r3 + (-8)
            r0.zzC = r3
            r1.zzk(r7)
        Lea:
            com.google.android.gms.internal.ads.zzaju r3 = r2.zzd
            com.google.android.gms.internal.ads.zzajr r3 = r3.zza
            com.google.android.gms.internal.ads.zzaf r3 = r3.zzf
            java.lang.String r3 = r3.zzn
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L117
            int r3 = r0.zzC
            r5 = 7
            int r3 = r2.zzc(r3, r5)
            r0.zzD = r3
            int r3 = r0.zzC
            com.google.android.gms.internal.ads.zzek r6 = r0.zzk
            com.google.android.gms.internal.ads.zzace.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzaeh r3 = r2.zza
            com.google.android.gms.internal.ads.zzek r6 = r0.zzk
            r3.zzq(r6, r5)
            int r3 = r0.zzD
            int r3 = r3 + r5
            r0.zzD = r3
            goto L11f
        L117:
            int r3 = r0.zzC
            int r3 = r2.zzc(r3, r10)
            r0.zzD = r3
        L11f:
            int r5 = r0.zzC
            int r5 = r5 + r3
            r0.zzC = r5
            r3 = 4
            r0.zzr = r3
            r0.zzE = r10
        L129:
            com.google.android.gms.internal.ads.zzaju r3 = r2.zzd
            com.google.android.gms.internal.ads.zzajr r3 = r3.zza
            com.google.android.gms.internal.ads.zzaeh r5 = r2.zza
            long r6 = r2.zze()
            int r11 = r3.zzj
            if (r11 != 0) goto L148
        L137:
            int r3 = r0.zzD
            int r4 = r0.zzC
            if (r3 >= r4) goto L269
            int r4 = r4 - r3
            int r3 = r5.zzf(r1, r4, r10)
            int r4 = r0.zzD
            int r4 = r4 + r3
            r0.zzD = r4
            goto L137
        L148:
            com.google.android.gms.internal.ads.zzek r12 = r0.zzh
            byte[] r12 = r12.zzN()
            r12[r10] = r10
            r12[r9] = r10
            r14 = 2
            r12[r14] = r10
            int r14 = r11 + 1
            r15 = 4
            int r11 = 4 - r11
        L15a:
            int r15 = r0.zzD
            int r13 = r0.zzC
            if (r15 >= r13) goto L269
            int r13 = r0.zzE
            java.lang.String r15 = "video/hevc"
            if (r13 != 0) goto L1e9
            r1.zzi(r12, r11, r14)
            com.google.android.gms.internal.ads.zzek r13 = r0.zzh
            r13.zzL(r10)
            com.google.android.gms.internal.ads.zzek r13 = r0.zzh
            int r13 = r13.zzg()
            if (r13 <= 0) goto L1e1
            int r13 = r13 + (-1)
            r0.zzE = r13
            com.google.android.gms.internal.ads.zzek r13 = r0.zzg
            r13.zzL(r10)
            com.google.android.gms.internal.ads.zzek r13 = r0.zzg
            r10 = 4
            r5.zzq(r13, r10)
            com.google.android.gms.internal.ads.zzek r13 = r0.zzh
            r5.zzq(r13, r9)
            com.google.android.gms.internal.ads.zzaeh[] r13 = r0.zzJ
            int r13 = r13.length
            java.lang.String r8 = "video/avc"
            if (r13 <= 0) goto L1b4
            com.google.android.gms.internal.ads.zzaf r13 = r3.zzf
            java.lang.String r13 = r13.zzn
            r17 = r12[r10]
            byte[] r10 = com.google.android.gms.internal.ads.zzfs.zza
            boolean r10 = r8.equals(r13)
            if (r10 == 0) goto L1a6
            r10 = r17 & 31
            if (r10 == r4) goto L1a4
            goto L1a6
        L1a4:
            r10 = 1
            goto L1b5
        L1a6:
            boolean r10 = r15.equals(r13)
            if (r10 == 0) goto L1b4
            r10 = r17 & 126(0x7e, float:1.77E-43)
            int r10 = r10 >> r9
            r13 = 39
            if (r10 != r13) goto L1b4
            goto L1a4
        L1b4:
            r10 = 0
        L1b5:
            r0.zzG = r10
            int r10 = r0.zzD
            int r10 = r10 + 5
            r0.zzD = r10
            int r10 = r0.zzC
            int r10 = r10 + r11
            r0.zzC = r10
            boolean r10 = r0.zzF
            if (r10 != 0) goto L264
            com.google.android.gms.internal.ads.zzaju r10 = r2.zzd
            com.google.android.gms.internal.ads.zzajr r10 = r10.zza
            com.google.android.gms.internal.ads.zzaf r10 = r10.zzf
            java.lang.String r10 = r10.zzn
            boolean r8 = java.util.Objects.equals(r10, r8)
            if (r8 == 0) goto L264
            r8 = 4
            r10 = r12[r8]
            boolean r8 = com.google.android.gms.internal.ads.zzfs.zzi(r10)
            if (r8 == 0) goto L264
            r0.zzF = r9
            goto L264
        L1e1:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L1e9:
            boolean r8 = r0.zzG
            if (r8 == 0) goto L254
            com.google.android.gms.internal.ads.zzek r8 = r0.zzi
            r8.zzI(r13)
            com.google.android.gms.internal.ads.zzek r8 = r0.zzi
            byte[] r8 = r8.zzN()
            int r10 = r0.zzE
            r13 = 0
            r1.zzi(r8, r13, r10)
            com.google.android.gms.internal.ads.zzek r8 = r0.zzi
            int r10 = r0.zzE
            r5.zzq(r8, r10)
            int r8 = r0.zzE
            com.google.android.gms.internal.ads.zzek r10 = r0.zzi
            byte[] r13 = r10.zzN()
            int r10 = r10.zze()
            int r10 = com.google.android.gms.internal.ads.zzfs.zzb(r13, r10)
            com.google.android.gms.internal.ads.zzek r13 = r0.zzi
            com.google.android.gms.internal.ads.zzaf r4 = r3.zzf
            java.lang.String r4 = r4.zzn
            boolean r4 = r15.equals(r4)
            r13.zzL(r4)
            com.google.android.gms.internal.ads.zzek r4 = r0.zzi
            r4.zzK(r10)
            com.google.android.gms.internal.ads.zzaf r4 = r3.zzf
            int r4 = r4.zzp
            r10 = -1
            if (r4 == r10) goto L23f
            com.google.android.gms.internal.ads.zzfw r10 = r0.zzp
            int r10 = r10.zza()
            if (r4 == r10) goto L23f
            com.google.android.gms.internal.ads.zzfw r4 = r0.zzp
            com.google.android.gms.internal.ads.zzaf r10 = r3.zzf
            int r10 = r10.zzp
            r4.zzd(r10)
        L23f:
            com.google.android.gms.internal.ads.zzfw r4 = r0.zzp
            com.google.android.gms.internal.ads.zzek r10 = r0.zzi
            r4.zzb(r6, r10)
            int r4 = r2.zza()
            r4 = r4 & 5
            if (r4 == 0) goto L259
            com.google.android.gms.internal.ads.zzfw r4 = r0.zzp
            r4.zzc()
            goto L259
        L254:
            r4 = 0
            int r8 = r5.zzf(r1, r13, r4)
        L259:
            int r4 = r0.zzD
            int r4 = r4 + r8
            r0.zzD = r4
            int r4 = r0.zzE
            int r4 = r4 - r8
            r0.zzE = r4
            r4 = 6
        L264:
            r8 = 0
            r10 = 0
            r13 = 3
            goto L15a
        L269:
            int r22 = r2.zza()
            com.google.android.gms.internal.ads.zzajs r1 = r2.zzf()
            if (r1 == 0) goto L278
            com.google.android.gms.internal.ads.zzaeg r1 = r1.zzc
            r25 = r1
            goto L27a
        L278:
            r25 = 0
        L27a:
            int r1 = r0.zzC
            r24 = 0
            r19 = r5
            r20 = r6
            r23 = r1
            r19.zzs(r20, r22, r23, r24, r25)
        L287:
            java.util.ArrayDeque r1 = r0.zzo
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2bf
            java.util.ArrayDeque r1 = r0.zzo
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.zzaje r1 = (com.google.android.gms.internal.ads.zzaje) r1
            int r3 = r0.zzx
            int r4 = r1.zzc
            int r3 = r3 - r4
            r0.zzx = r3
            long r3 = r1.zza
            boolean r5 = r1.zzb
            if (r5 == 0) goto L2a5
            long r3 = r3 + r6
        L2a5:
            com.google.android.gms.internal.ads.zzaeh[] r5 = r0.zzI
            int r15 = r5.length
            r14 = 0
        L2a9:
            if (r14 >= r15) goto L287
            r8 = r5[r14]
            r11 = 1
            int r12 = r1.zzc
            int r13 = r0.zzx
            r17 = 0
            r9 = r3
            r18 = r14
            r14 = r17
            r8.zzs(r9, r11, r12, r13, r14)
            int r14 = r18 + 1
            goto L2a9
        L2bf:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto Ld8
            r1 = 0
            r0.zzB = r1
            goto Ld8
        L2ca:
            r0.zzr = r1
            r1 = 0
            return r1
        L2ce:
            android.util.SparseArray r2 = r0.zzf
            int r2 = r2.size()
            r5 = 0
            r6 = 0
        L2d6:
            if (r5 >= r2) goto L2f9
            android.util.SparseArray r7 = r0.zzf
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.zzajf r7 = (com.google.android.gms.internal.ads.zzajf) r7
            com.google.android.gms.internal.ads.zzajt r7 = r7.zzb
            boolean r8 = r7.zzo
            if (r8 == 0) goto L2f6
            long r7 = r7.zzc
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 >= 0) goto L2f6
            android.util.SparseArray r3 = r0.zzf
            java.lang.Object r3 = r3.valueAt(r5)
            com.google.android.gms.internal.ads.zzajf r3 = (com.google.android.gms.internal.ads.zzajf) r3
            r6 = r3
            r3 = r7
        L2f6:
            int r5 = r5 + 1
            goto L2d6
        L2f9:
            if (r6 != 0) goto L300
            r2 = 3
            r0.zzr = r2
            goto L4
        L300:
            long r7 = r38.zzf()
            long r3 = r3 - r7
            int r2 = (int) r3
            if (r2 < 0) goto L324
            r1.zzk(r2)
            com.google.android.gms.internal.ads.zzajt r2 = r6.zzb
            com.google.android.gms.internal.ads.zzek r3 = r2.zzn
            byte[] r4 = r3.zzN()
            int r3 = r3.zze()
            r5 = 0
            r1.zzi(r4, r5, r3)
            com.google.android.gms.internal.ads.zzek r3 = r2.zzn
            r3.zzL(r5)
            r2.zzo = r5
            goto L4
        L324:
            java.lang.String r1 = "Offset to encryption data was negative."
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L32c:
            long r5 = r0.zzt
            int r2 = (int) r5
            int r5 = r0.zzu
            int r2 = r2 - r5
            com.google.android.gms.internal.ads.zzek r5 = r0.zzv
            if (r5 == 0) goto L561
            byte[] r6 = r5.zzN()
            r1.zzi(r6, r7, r2)
            com.google.android.gms.internal.ads.zzain r2 = new com.google.android.gms.internal.ads.zzain
            int r6 = r0.zzs
            r2.<init>(r6, r5)
            long r5 = r38.zzf()
            java.util.ArrayDeque r8 = r0.zzn
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L35d
            java.util.ArrayDeque r3 = r0.zzn
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzaim r3 = (com.google.android.gms.internal.ads.zzaim) r3
            r3.zzd(r2)
            goto L564
        L35d:
            int r8 = r2.zzd
            if (r8 != r4) goto L431
            com.google.android.gms.internal.ads.zzek r2 = r2.zza
            r2.zzL(r7)
            int r3 = r2.zzg()
            int r3 = com.google.android.gms.internal.ads.zzaio.zze(r3)
            r4 = 4
            r2.zzM(r4)
            long r7 = r2.zzu()
            if (r3 != 0) goto L381
            long r3 = r2.zzu()
            long r10 = r2.zzu()
            goto L389
        L381:
            long r3 = r2.zzw()
            long r10 = r2.zzw()
        L389:
            long r5 = r5 + r10
            r12 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r16 = java.math.RoundingMode.FLOOR
            r10 = r3
            r14 = r7
            long r19 = com.google.android.gms.internal.ads.zzeu.zzt(r10, r12, r14, r16)
            r10 = 2
            r2.zzM(r10)
            int r14 = r2.zzq()
            int[] r15 = new int[r14]
            long[] r12 = new long[r14]
            long[] r13 = new long[r14]
            long[] r10 = new long[r14]
            r16 = r19
            r11 = 0
        L3a8:
            if (r11 >= r14) goto L408
            int r21 = r2.zzg()
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r21 & r22
            if (r22 != 0) goto L400
            long r22 = r2.zzu()
            r24 = 2147483647(0x7fffffff, float:NaN)
            r21 = r21 & r24
            r15[r11] = r21
            r12[r11] = r5
            r10[r11] = r16
            long r3 = r3 + r22
            r16 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r21 = java.math.RoundingMode.FLOOR
            r9 = r10
            r26 = r11
            r10 = r3
            r23 = r3
            r3 = r12
            r4 = r13
            r12 = r16
            r17 = r14
            r28 = r15
            r14 = r7
            r16 = r21
            long r10 = com.google.android.gms.internal.ads.zzeu.zzt(r10, r12, r14, r16)
            r12 = r9[r26]
            long r12 = r10 - r12
            r4[r26] = r12
            r12 = 4
            r2.zzM(r12)
            r13 = r28
            r14 = r13[r26]
            long r14 = (long) r14
            long r5 = r5 + r14
            int r14 = r26 + 1
            r12 = r3
            r15 = r13
            r13 = r4
            r3 = r23
            r35 = r10
            r10 = r9
            r11 = r14
            r14 = r17
            r9 = 1
            r16 = r35
            goto L3a8
        L400:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L408:
            r9 = r10
            r3 = r12
            r4 = r13
            r13 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.zzaco r5 = new com.google.android.gms.internal.ads.zzaco
            r5.<init>(r13, r3, r4, r9)
            android.util.Pair r2 = android.util.Pair.create(r2, r5)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.zzA = r3
            com.google.android.gms.internal.ads.zzade r3 = r0.zzH
            java.lang.Object r2 = r2.second
            com.google.android.gms.internal.ads.zzaea r2 = (com.google.android.gms.internal.ads.zzaea) r2
            r3.zzO(r2)
            r2 = 1
            r0.zzK = r2
            goto L564
        L431:
            if (r8 != r3) goto L564
            com.google.android.gms.internal.ads.zzek r2 = r2.zza
            com.google.android.gms.internal.ads.zzaeh[] r3 = r0.zzI
            int r3 = r3.length
            if (r3 == 0) goto L564
            r2.zzL(r7)
            int r3 = r2.zzg()
            int r3 = com.google.android.gms.internal.ads.zzaio.zze(r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L4a2
            r6 = 1
            if (r3 == r6) goto L465
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Skipping unsupported emsg version: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r2)
            goto L564
        L465:
            long r6 = r2.zzu()
            long r12 = r2.zzw()
            r14 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r18 = java.math.RoundingMode.FLOOR
            r16 = r6
            long r8 = com.google.android.gms.internal.ads.zzeu.zzt(r12, r14, r16, r18)
            long r12 = r2.zzu()
            r14 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r18 = java.math.RoundingMode.FLOOR
            long r6 = com.google.android.gms.internal.ads.zzeu.zzt(r12, r14, r16, r18)
            long r10 = r2.zzu()
            r3 = 0
            java.lang.String r12 = r2.zzy(r3)
            java.util.Objects.requireNonNull(r12)
            java.lang.String r13 = r2.zzy(r3)
            java.util.Objects.requireNonNull(r13)
            r30 = r6
            r32 = r10
            r28 = r12
            r29 = r13
            r13 = r8
            r8 = r4
            goto L4e8
        L4a2:
            r3 = 0
            java.lang.String r12 = r2.zzy(r3)
            java.util.Objects.requireNonNull(r12)
            java.lang.String r13 = r2.zzy(r3)
            java.util.Objects.requireNonNull(r13)
            long r6 = r2.zzu()
            long r14 = r2.zzu()
            r16 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r20 = java.math.RoundingMode.FLOOR
            r18 = r6
            long r8 = com.google.android.gms.internal.ads.zzeu.zzt(r14, r16, r18, r20)
            long r10 = r0.zzA
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 == 0) goto L4cc
            long r10 = r10 + r8
            goto L4cd
        L4cc:
            r10 = r4
        L4cd:
            long r14 = r2.zzu()
            r16 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r20 = java.math.RoundingMode.FLOOR
            r18 = r6
            long r6 = com.google.android.gms.internal.ads.zzeu.zzt(r14, r16, r18, r20)
            long r14 = r2.zzu()
            r30 = r6
            r28 = r12
            r29 = r13
            r32 = r14
            r13 = r10
        L4e8:
            int r3 = r2.zzb()
            byte[] r3 = new byte[r3]
            int r6 = r2.zzb()
            r7 = 0
            r2.zzH(r3, r7, r6)
            com.google.android.gms.internal.ads.zzafy r2 = new com.google.android.gms.internal.ads.zzafy
            r27 = r2
            r34 = r3
            r27.<init>(r28, r29, r30, r32, r34)
            com.google.android.gms.internal.ads.zzafz r3 = r0.zzl
            com.google.android.gms.internal.ads.zzek r6 = new com.google.android.gms.internal.ads.zzek
            byte[] r2 = r3.zza(r2)
            r6.<init>(r2)
            int r2 = r6.zzb()
            com.google.android.gms.internal.ads.zzaeh[] r3 = r0.zzI
            int r7 = r3.length
            r10 = 0
        L512:
            if (r10 >= r7) goto L520
            r11 = r3[r10]
            r12 = 0
            r6.zzL(r12)
            r11.zzq(r6, r2)
            int r10 = r10 + 1
            goto L512
        L520:
            int r3 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r3 != 0) goto L535
            java.util.ArrayDeque r3 = r0.zzo
            com.google.android.gms.internal.ads.zzaje r4 = new com.google.android.gms.internal.ads.zzaje
            r5 = 1
            r4.<init>(r8, r5, r2)
            r3.addLast(r4)
            int r3 = r0.zzx
            int r3 = r3 + r2
            r0.zzx = r3
            goto L564
        L535:
            java.util.ArrayDeque r3 = r0.zzo
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L54e
            java.util.ArrayDeque r3 = r0.zzo
            com.google.android.gms.internal.ads.zzaje r4 = new com.google.android.gms.internal.ads.zzaje
            r5 = 0
            r4.<init>(r13, r5, r2)
            r3.addLast(r4)
            int r3 = r0.zzx
            int r3 = r3 + r2
            r0.zzx = r3
            goto L564
        L54e:
            com.google.android.gms.internal.ads.zzaeh[] r3 = r0.zzI
            int r4 = r3.length
            r5 = 0
        L552:
            if (r5 >= r4) goto L564
            r6 = r3[r5]
            r9 = 1
            r11 = 0
            r12 = 0
            r7 = r13
            r10 = r2
            r6.zzs(r7, r9, r10, r11, r12)
            int r5 = r5 + 1
            goto L552
        L561:
            r1.zzk(r2)
        L564:
            long r2 = r38.zzf()
            r0.zzl(r2)
            goto L4
        L56d:
            int r2 = r0.zzu
            if (r2 != 0) goto L59d
            com.google.android.gms.internal.ads.zzek r2 = r0.zzm
            byte[] r2 = r2.zzN()
            r5 = 1
            r6 = 0
            boolean r2 = r1.zzn(r2, r6, r7, r5)
            if (r2 != 0) goto L586
            com.google.android.gms.internal.ads.zzfw r1 = r0.zzp
            r1.zzc()
            r1 = -1
            return r1
        L586:
            r0.zzu = r7
            com.google.android.gms.internal.ads.zzek r2 = r0.zzm
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzm
            long r5 = r2.zzu()
            r0.zzt = r5
            com.google.android.gms.internal.ads.zzek r2 = r0.zzm
            int r2 = r2.zzg()
            r0.zzs = r2
        L59d:
            long r5 = r0.zzt
            r8 = 1
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L5bc
            com.google.android.gms.internal.ads.zzek r2 = r0.zzm
            byte[] r2 = r2.zzN()
            r1.zzi(r2, r7, r7)
            int r2 = r0.zzu
            int r2 = r2 + r7
            r0.zzu = r2
            com.google.android.gms.internal.ads.zzek r2 = r0.zzm
            long r5 = r2.zzw()
            r0.zzt = r5
            goto L5ef
        L5bc:
            r8 = 0
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L5ef
            long r5 = r38.zzd()
            r8 = -1
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L5e0
            java.util.ArrayDeque r2 = r0.zzn
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5df
            java.util.ArrayDeque r2 = r0.zzn
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzaim r2 = (com.google.android.gms.internal.ads.zzaim) r2
            long r5 = r2.zza
            goto L5e0
        L5df:
            r5 = r8
        L5e0:
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 == 0) goto L5ef
            long r8 = r38.zzf()
            long r5 = r5 - r8
            int r2 = r0.zzu
            long r8 = (long) r2
            long r5 = r5 + r8
            r0.zzt = r5
        L5ef:
            long r5 = r0.zzt
            int r2 = r0.zzu
            long r8 = (long) r2
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 < 0) goto L772
            long r5 = r38.zzf()
            long r5 = r5 - r8
            int r2 = r0.zzs
            r8 = 1835295092(0x6d646174, float:4.4175247E27)
            r9 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r9) goto L609
            if (r2 != r8) goto L61c
        L609:
            boolean r2 = r0.zzK
            if (r2 != 0) goto L61c
            com.google.android.gms.internal.ads.zzade r2 = r0.zzH
            com.google.android.gms.internal.ads.zzadz r10 = new com.google.android.gms.internal.ads.zzadz
            long r11 = r0.zzz
            r10.<init>(r11, r5)
            r2.zzO(r10)
            r2 = 1
            r0.zzK = r2
        L61c:
            int r2 = r0.zzs
            if (r2 != r9) goto L63a
            android.util.SparseArray r2 = r0.zzf
            int r2 = r2.size()
            r13 = 0
        L627:
            if (r13 >= r2) goto L63a
            android.util.SparseArray r10 = r0.zzf
            java.lang.Object r10 = r10.valueAt(r13)
            com.google.android.gms.internal.ads.zzajf r10 = (com.google.android.gms.internal.ads.zzajf) r10
            com.google.android.gms.internal.ads.zzajt r10 = r10.zzb
            r10.zzc = r5
            r10.zzb = r5
            int r13 = r13 + 1
            goto L627
        L63a:
            int r2 = r0.zzs
            if (r2 != r8) goto L64b
            r8 = 0
            r0.zzB = r8
            long r2 = r0.zzt
            long r5 = r5 + r2
            r0.zzw = r5
            r2 = 2
            r0.zzr = r2
            goto L4
        L64b:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L74b
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L74b
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L74b
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L74b
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L74b
            if (r2 == r9) goto L74b
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L74b
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L74b
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L677
            goto L74b
        L677:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L716
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L716
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L716
            if (r2 == r4) goto L716
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L716
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L716
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L716
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L716
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L716
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L716
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L716
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L716
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L716
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L716
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L716
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L716
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L716
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L716
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L716
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L716
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L716
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L716
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L716
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L716
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L716
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L716
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L716
            if (r2 != r3) goto L701
            goto L716
        L701:
            long r2 = r0.zzt
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L70f
            r2 = 0
            r0.zzv = r2
            r2 = 1
            r0.zzr = r2
            goto L4
        L70f:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zzc(r1)
            throw r1
        L716:
            int r2 = r0.zzu
            if (r2 != r7) goto L744
            long r2 = r0.zzt
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L73d
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            long r3 = r0.zzt
            int r4 = (int) r3
            r2.<init>(r4)
            com.google.android.gms.internal.ads.zzek r3 = r0.zzm
            byte[] r3 = r3.zzN()
            byte[] r4 = r2.zzN()
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r7)
            r0.zzv = r2
            r2 = 1
            r0.zzr = r2
            goto L4
        L73d:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zzc(r1)
            throw r1
        L744:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zzc(r1)
            throw r1
        L74b:
            long r3 = r38.zzf()
            long r5 = r0.zzt
            long r3 = r3 + r5
            java.util.ArrayDeque r5 = r0.zzn
            com.google.android.gms.internal.ads.zzaim r6 = new com.google.android.gms.internal.ads.zzaim
            r7 = -8
            long r3 = r3 + r7
            r6.<init>(r2, r3)
            r5.push(r6)
            long r5 = r0.zzt
            int r2 = r0.zzu
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L76d
            r0.zzl(r3)
            goto L4
        L76d:
            r37.zzj()
            goto L4
        L772:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zzc(r1)
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
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzq
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(com.google.android.gms.internal.ads.zzade r7) {
            r6 = this;
            int r0 = r6.zzd
            r0 = r0 & 32
            if (r0 != 0) goto Le
            com.google.android.gms.internal.ads.zzakt r0 = r6.zzc
            com.google.android.gms.internal.ads.zzakw r1 = new com.google.android.gms.internal.ads.zzakw
            r1.<init>(r7, r0)
            r7 = r1
        Le:
            r6.zzH = r7
            r6.zzj()
            r7 = 2
            com.google.android.gms.internal.ads.zzaeh[] r7 = new com.google.android.gms.internal.ads.zzaeh[r7]
            r6.zzI = r7
            int r0 = r6.zzd
            r0 = r0 & 4
            r1 = 100
            r2 = 0
            if (r0 == 0) goto L2e
            com.google.android.gms.internal.ads.zzade r0 = r6.zzH
            r3 = 5
            com.google.android.gms.internal.ads.zzaeh r0 = r0.zzw(r1, r3)
            r7[r2] = r0
            r1 = 101(0x65, float:1.42E-43)
            r7 = 1
            goto L2f
        L2e:
            r7 = 0
        L2f:
            com.google.android.gms.internal.ads.zzaeh[] r0 = r6.zzI
            java.lang.Object[] r7 = com.google.android.gms.internal.ads.zzeu.zzN(r0, r7)
            com.google.android.gms.internal.ads.zzaeh[] r7 = (com.google.android.gms.internal.ads.zzaeh[]) r7
            r6.zzI = r7
            int r0 = r7.length
            r3 = 0
        L3b:
            if (r3 >= r0) goto L47
            r4 = r7[r3]
            com.google.android.gms.internal.ads.zzaf r5 = com.google.android.gms.internal.ads.zzajg.zzb
            r4.zzl(r5)
            int r3 = r3 + 1
            goto L3b
        L47:
            java.util.List r7 = r6.zze
            int r7 = r7.size()
            com.google.android.gms.internal.ads.zzaeh[] r7 = new com.google.android.gms.internal.ads.zzaeh[r7]
            r6.zzJ = r7
        L51:
            com.google.android.gms.internal.ads.zzaeh[] r7 = r6.zzJ
            int r7 = r7.length
            if (r2 >= r7) goto L72
            com.google.android.gms.internal.ads.zzade r7 = r6.zzH
            int r0 = r1 + 1
            r3 = 3
            com.google.android.gms.internal.ads.zzaeh r7 = r7.zzw(r1, r3)
            java.util.List r1 = r6.zze
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzaf r1 = (com.google.android.gms.internal.ads.zzaf) r1
            r7.zzl(r1)
            com.google.android.gms.internal.ads.zzaeh[] r1 = r6.zzJ
            r1[r2] = r7
            int r2 = r2 + 1
            r1 = r0
            goto L51
        L72:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r3, long r5) {
            r2 = this;
            android.util.SparseArray r3 = r2.zzf
            int r3 = r3.size()
            r4 = 0
            r0 = 0
        L8:
            if (r0 >= r3) goto L18
            android.util.SparseArray r1 = r2.zzf
            java.lang.Object r1 = r1.valueAt(r0)
            com.google.android.gms.internal.ads.zzajf r1 = (com.google.android.gms.internal.ads.zzajf) r1
            r1.zzi()
            int r0 = r0 + 1
            goto L8
        L18:
            java.util.ArrayDeque r3 = r2.zzo
            r3.clear()
            r2.zzx = r4
            com.google.android.gms.internal.ads.zzfw r3 = r2.zzp
            r3.zzc()
            r2.zzy = r5
            java.util.ArrayDeque r3 = r2.zzn
            r3.clear()
            r2.zzj()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r2) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzaee r2 = com.google.android.gms.internal.ads.zzajq.zza(r2)
            if (r2 == 0) goto Lb
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzo(r2)
            goto Lf
        Lb:
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
        Lf:
            r1.zzq = r0
            if (r2 != 0) goto L15
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }
}
