package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzajl implements com.google.android.gms.internal.ads.zzadb, com.google.android.gms.internal.ads.zzaea {
    private int zzA;
    private com.google.android.gms.internal.ads.zzahj zzB;
    private final com.google.android.gms.internal.ads.zzakt zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private final com.google.android.gms.internal.ads.zzek zzd;
    private final com.google.android.gms.internal.ads.zzek zze;
    private final com.google.android.gms.internal.ads.zzek zzf;
    private final java.util.ArrayDeque zzg;
    private final com.google.android.gms.internal.ads.zzajp zzh;
    private final java.util.List zzi;
    private com.google.android.gms.internal.ads.zzgax zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private com.google.android.gms.internal.ads.zzek zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.internal.ads.zzade zzv;
    private com.google.android.gms.internal.ads.zzajk[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @java.lang.Deprecated
    public zzajl() {
            r2 = this;
            com.google.android.gms.internal.ads.zzakt r0 = com.google.android.gms.internal.ads.zzakt.zza
            r1 = 16
            r2.<init>(r0, r1)
            return
    }

    public zzajl(com.google.android.gms.internal.ads.zzakt r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            r1.zzb = r3
            com.google.android.gms.internal.ads.zzgax r2 = com.google.android.gms.internal.ads.zzgax.zzn()
            r1.zzj = r2
            r2 = r3 & 4
            r3 = 0
            if (r2 == 0) goto L14
            r2 = 3
            goto L15
        L14:
            r2 = 0
        L15:
            r1.zzk = r2
            com.google.android.gms.internal.ads.zzajp r2 = new com.google.android.gms.internal.ads.zzajp
            r2.<init>()
            r1.zzh = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.zzi = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r0 = 16
            r2.<init>(r0)
            r1.zzf = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.zzg = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            byte[] r0 = com.google.android.gms.internal.ads.zzfs.zza
            r2.<init>(r0)
            r1.zzc = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r0 = 5
            r2.<init>(r0)
            r1.zzd = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r2.<init>()
            r1.zze = r2
            r2 = -1
            r1.zzp = r2
            com.google.android.gms.internal.ads.zzade r2 = com.google.android.gms.internal.ads.zzade.zza
            r1.zzv = r2
            com.google.android.gms.internal.ads.zzajk[] r2 = new com.google.android.gms.internal.ads.zzajk[r3]
            r1.zzw = r2
            r2 = 1
            r1.zzt = r2
            return
    }

    private static int zzj(int r1) {
            r0 = 1751476579(0x68656963, float:4.333464E24)
            if (r1 == r0) goto Le
            r0 = 1903435808(0x71742020, float:1.2088509E30)
            if (r1 == r0) goto Lc
            r1 = 0
            return r1
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 2
            return r1
    }

    private static int zzk(com.google.android.gms.internal.ads.zzaju r2, long r3) {
            int r0 = r2.zza(r3)
            r1 = -1
            if (r0 != r1) goto Lc
            int r2 = r2.zzb(r3)
            return r2
        Lc:
            return r0
    }

    private static long zzl(com.google.android.gms.internal.ads.zzaju r0, long r1, long r3) {
            int r1 = zzk(r0, r1)
            r2 = -1
            if (r1 != r2) goto L8
            return r3
        L8:
            long[] r0 = r0.zzc
            r1 = r0[r1]
            long r0 = java.lang.Math.min(r1, r3)
            return r0
    }

    private final void zzm() {
            r1 = this;
            r0 = 0
            r1.zzk = r0
            r1.zzn = r0
            return
    }

    private final void zzn(long r28) throws com.google.android.gms.internal.ads.zzbo {
            r27 = this;
            r0 = r27
        L2:
            java.util.ArrayDeque r1 = r0.zzg
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L28e
            java.util.ArrayDeque r1 = r0.zzg
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzaim r1 = (com.google.android.gms.internal.ads.zzaim) r1
            long r3 = r1.zza
            int r1 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r1 != 0) goto L28e
            java.util.ArrayDeque r1 = r0.zzg
            java.lang.Object r1 = r1.pop()
            r3 = r1
            com.google.android.gms.internal.ads.zzaim r3 = (com.google.android.gms.internal.ads.zzaim) r3
            int r1 = r3.zzd
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r4) goto L279
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.zzA
            com.google.android.gms.internal.ads.zzadp r11 = new com.google.android.gms.internal.ads.zzadp
            r11.<init>()
            r5 = 1969517665(0x75647461, float:2.8960062E32)
            com.google.android.gms.internal.ads.zzain r5 = r3.zzb(r5)
            if (r5 == 0) goto L46
            com.google.android.gms.internal.ads.zzbk r5 = com.google.android.gms.internal.ads.zzaiz.zzb(r5)
            r11.zzb(r5)
            r13 = r5
            goto L47
        L46:
            r13 = 0
        L47:
            r5 = 1835365473(0x6d657461, float:4.4382975E27)
            com.google.android.gms.internal.ads.zzaim r5 = r3.zza(r5)
            if (r5 == 0) goto L56
            com.google.android.gms.internal.ads.zzbk r5 = com.google.android.gms.internal.ads.zzaiz.zza(r5)
            r14 = r5
            goto L57
        L56:
            r14 = 0
        L57:
            com.google.android.gms.internal.ads.zzbk r15 = new com.google.android.gms.internal.ads.zzbk
            r10 = 1
            com.google.android.gms.internal.ads.zzbj[] r5 = new com.google.android.gms.internal.ads.zzbj[r10]
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.gms.internal.ads.zzain r6 = r3.zzb(r6)
            java.util.Objects.requireNonNull(r6)
            r9 = 0
            if (r4 != r10) goto L6c
            r16 = 1
            goto L6e
        L6c:
            r16 = 0
        L6e:
            com.google.android.gms.internal.ads.zzek r4 = r6.zza
            com.google.android.gms.internal.ads.zzfe r4 = com.google.android.gms.internal.ads.zzaiz.zzc(r4)
            r5[r9] = r4
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15.<init>(r7, r5)
            int r4 = r0.zzb
            r4 = r4 & r10
            if (r10 == r4) goto L86
            r17 = 0
            goto L88
        L86:
            r17 = 1
        L88:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = 0
            com.google.android.gms.internal.ads.zzajj r19 = new com.google.android.gms.internal.ads.zzajj
            r19.<init>()
            r4 = r11
            r20 = r13
            r12 = r7
            r7 = r18
            r8 = r17
            r9 = r16
            r10 = r19
            java.util.List r3 = com.google.android.gms.internal.ads.zzaiz.zzd(r3, r4, r5, r7, r8, r9, r10)
            r7 = r12
            r5 = 0
            r6 = -1
            r9 = 0
        La8:
            int r10 = r3.size()
            r16 = 0
            if (r9 >= r10) goto L1ea
            java.lang.Object r10 = r3.get(r9)
            com.google.android.gms.internal.ads.zzaju r10 = (com.google.android.gms.internal.ads.zzaju) r10
            int r4 = r10.zzb
            if (r4 != 0) goto Lbf
            r22 = r3
            r2 = -1
            goto L1df
        Lbf:
            com.google.android.gms.internal.ads.zzajr r4 = r10.zza
            r22 = r3
            long r2 = r4.zze
            int r23 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r23 == 0) goto Lca
            goto Lcc
        Lca:
            long r2 = r10.zzh
        Lcc:
            long r7 = java.lang.Math.max(r7, r2)
            com.google.android.gms.internal.ads.zzajk r12 = new com.google.android.gms.internal.ads.zzajk
            com.google.android.gms.internal.ads.zzade r13 = r0.zzv
            int r24 = r5 + 1
            r25 = r7
            int r7 = r4.zzb
            com.google.android.gms.internal.ads.zzaeh r5 = r13.zzw(r5, r7)
            r12.<init>(r4, r10, r5)
            com.google.android.gms.internal.ads.zzaf r5 = r4.zzf
            java.lang.String r5 = r5.zzn
            java.lang.String r7 = "audio/true-hd"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto Lf2
            int r5 = r10.zze
            int r5 = r5 * 16
            goto Lf6
        Lf2:
            int r5 = r10.zze
            int r5 = r5 + 30
        Lf6:
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzf
            com.google.android.gms.internal.ads.zzad r7 = r7.zzb()
            r7.zzQ(r5)
            int r5 = r4.zzb
            r8 = 2
            if (r5 != r8) goto L12a
            int r5 = r0.zzb
            r5 = r5 & 8
            if (r5 == 0) goto L118
            com.google.android.gms.internal.ads.zzaf r5 = r4.zzf
            r8 = -1
            if (r6 != r8) goto L111
            r8 = 1
            goto L112
        L111:
            r8 = 2
        L112:
            int r5 = r5.zzf
            r5 = r5 | r8
            r7.zzX(r5)
        L118:
            int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r5 <= 0) goto L12a
            int r5 = r10.zzb
            if (r5 <= 0) goto L12a
            float r2 = (float) r2
            float r3 = (float) r5
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r2 = r2 / r5
            float r3 = r3 / r2
            r7.zzI(r3)
        L12a:
            int r2 = r4.zzb
            r3 = 1
            if (r2 != r3) goto L13f
            boolean r2 = r11.zza()
            if (r2 == 0) goto L13f
            int r2 = r11.zza
            r7.zzG(r2)
            int r2 = r11.zzb
            r7.zzH(r2)
        L13f:
            int r2 = r4.zzb
            java.util.List r5 = r0.zzi
            r8 = 3
            com.google.android.gms.internal.ads.zzbk[] r10 = new com.google.android.gms.internal.ads.zzbk[r8]
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L14f
            r5 = 0
            r13 = 0
            goto L157
        L14f:
            java.util.List r5 = r0.zzi
            com.google.android.gms.internal.ads.zzbk r13 = new com.google.android.gms.internal.ads.zzbk
            r13.<init>(r5)
            r5 = 0
        L157:
            r10[r5] = r13
            r10[r3] = r20
            r13 = 2
            r10[r13] = r15
            com.google.android.gms.internal.ads.zzbk r13 = new com.google.android.gms.internal.ads.zzbk
            com.google.android.gms.internal.ads.zzbj[] r8 = new com.google.android.gms.internal.ads.zzbj[r5]
            r21 = r6
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13.<init>(r5, r8)
            if (r14 == 0) goto L1a7
            r8 = 0
        L16f:
            int r5 = r14.zza()
            if (r8 >= r5) goto L1a7
            com.google.android.gms.internal.ads.zzbj r5 = r14.zzb(r8)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzey
            if (r6 == 0) goto L1a3
            com.google.android.gms.internal.ads.zzey r5 = (com.google.android.gms.internal.ads.zzey) r5
            java.lang.String r6 = r5.zza
            java.lang.String r3 = "com.android.capture.fps"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L198
            r3 = 2
            if (r2 != r3) goto L1a3
            r3 = 1
            com.google.android.gms.internal.ads.zzbj[] r6 = new com.google.android.gms.internal.ads.zzbj[r3]
            r17 = 0
            r6[r17] = r5
            com.google.android.gms.internal.ads.zzbk r13 = r13.zzc(r6)
            goto L1a3
        L198:
            r3 = 1
            r17 = 0
            com.google.android.gms.internal.ads.zzbj[] r6 = new com.google.android.gms.internal.ads.zzbj[r3]
            r6[r17] = r5
            com.google.android.gms.internal.ads.zzbk r13 = r13.zzc(r6)
        L1a3:
            int r8 = r8 + 1
            r3 = 1
            goto L16f
        L1a7:
            r2 = 0
            r3 = 3
        L1a9:
            if (r2 >= r3) goto L1b4
            r5 = r10[r2]
            com.google.android.gms.internal.ads.zzbk r13 = r13.zzd(r5)
            int r2 = r2 + 1
            goto L1a9
        L1b4:
            int r2 = r13.zza()
            if (r2 <= 0) goto L1bd
            r7.zzS(r13)
        L1bd:
            com.google.android.gms.internal.ads.zzaeh r2 = r12.zzc
            com.google.android.gms.internal.ads.zzaf r3 = r7.zzaf()
            r2.zzl(r3)
            int r2 = r4.zzb
            r3 = 2
            r4 = r21
            if (r2 != r3) goto L1d6
            r2 = -1
            if (r4 != r2) goto L1d7
            int r3 = r1.size()
            r6 = r3
            goto L1d8
        L1d6:
            r2 = -1
        L1d7:
            r6 = r4
        L1d8:
            r1.add(r12)
            r5 = r24
            r7 = r25
        L1df:
            int r9 = r9 + 1
            r3 = r22
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto La8
        L1ea:
            r4 = r6
            r2 = -1
            r0.zzy = r4
            r0.zzz = r7
            r3 = 0
            com.google.android.gms.internal.ads.zzajk[] r4 = new com.google.android.gms.internal.ads.zzajk[r3]
            java.lang.Object[] r1 = r1.toArray(r4)
            com.google.android.gms.internal.ads.zzajk[] r1 = (com.google.android.gms.internal.ads.zzajk[]) r1
            r0.zzw = r1
            int r3 = r1.length
            long[][] r4 = new long[r3][]
            int[] r5 = new int[r3]
            long[] r6 = new long[r3]
            boolean[] r3 = new boolean[r3]
            r9 = 0
        L205:
            int r7 = r1.length
            if (r9 >= r7) goto L220
            r7 = r1[r9]
            com.google.android.gms.internal.ads.zzaju r7 = r7.zzb
            int r7 = r7.zzb
            long[] r7 = new long[r7]
            r4[r9] = r7
            r7 = r1[r9]
            com.google.android.gms.internal.ads.zzaju r7 = r7.zzb
            long[] r7 = r7.zzf
            r8 = 0
            r10 = r7[r8]
            r6[r9] = r10
            int r9 = r9 + 1
            goto L205
        L220:
            r8 = 0
            r9 = 0
        L222:
            int r7 = r1.length
            if (r9 >= r7) goto L263
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = r10
            r7 = -1
            r10 = 0
        L22d:
            int r13 = r1.length
            if (r10 >= r13) goto L23f
            boolean r13 = r3[r10]
            if (r13 != 0) goto L23c
            r13 = r6[r10]
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 > 0) goto L23c
            r7 = r10
            r11 = r13
        L23c:
            int r10 = r10 + 1
            goto L22d
        L23f:
            r10 = r5[r7]
            r11 = r4[r7]
            r11[r10] = r16
            r12 = r1[r7]
            com.google.android.gms.internal.ads.zzaju r12 = r12.zzb
            int[] r13 = r12.zzd
            r13 = r13[r10]
            long r13 = (long) r13
            long r16 = r16 + r13
            r13 = 1
            int r10 = r10 + r13
            r5[r7] = r10
            int r11 = r11.length
            if (r10 >= r11) goto L25e
            long[] r11 = r12.zzf
            r10 = r11[r10]
            r6[r7] = r10
            goto L222
        L25e:
            r3[r7] = r13
            int r9 = r9 + 1
            goto L222
        L263:
            r0.zzx = r4
            com.google.android.gms.internal.ads.zzade r1 = r0.zzv
            r1.zzD()
            com.google.android.gms.internal.ads.zzade r1 = r0.zzv
            r1.zzO(r0)
            java.util.ArrayDeque r1 = r0.zzg
            r1.clear()
            r1 = 2
            r0.zzk = r1
            goto L2
        L279:
            java.util.ArrayDeque r1 = r0.zzg
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2
            java.util.ArrayDeque r1 = r0.zzg
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzaim r1 = (com.google.android.gms.internal.ads.zzaim) r1
            r1.zzc(r3)
            goto L2
        L28e:
            int r1 = r0.zzk
            r2 = 2
            if (r1 == r2) goto L296
            r27.zzm()
        L296:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            long r0 = r2.zzz
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r33, com.google.android.gms.internal.ads.zzadx r34) throws java.io.IOException {
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L6:
            int r3 = r0.zzk
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r7 = 0
            r9 = 2
            r10 = -1
            r11 = 8
            r12 = 1
            if (r3 == 0) goto L2a8
            r14 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r12) goto L217
            if (r3 == r9) goto L2c
            com.google.android.gms.internal.ads.zzajp r3 = r0.zzh
            java.util.List r4 = r0.zzi
            r3.zza(r1, r2, r4)
            long r1 = r2.zza
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L2b
            r32.zzm()
        L2b:
            return r12
        L2c:
            long r3 = r33.zzf()
            int r11 = r0.zzp
            if (r11 != r10) goto Lb3
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r16
            r21 = r18
            r23 = r21
            r11 = 0
            r20 = 1
            r25 = -1
            r26 = -1
            r27 = 1
        L48:
            com.google.android.gms.internal.ads.zzajk[] r5 = r0.zzw
            int r6 = r5.length
            if (r11 >= r6) goto L99
            r5 = r5[r11]
            int r6 = r5.zze
            com.google.android.gms.internal.ads.zzaju r5 = r5.zzb
            int r9 = r5.zzb
            if (r6 != r9) goto L58
            goto L95
        L58:
            long[] r5 = r5.zzc
            r28 = r5[r6]
            long[][] r5 = r0.zzx
            int r9 = com.google.android.gms.internal.ads.zzeu.zza
            r5 = r5[r11]
            r30 = r5[r6]
            long r28 = r28 - r3
            int r5 = (r28 > r7 ? 1 : (r28 == r7 ? 0 : -1))
            if (r5 < 0) goto L71
            int r5 = (r28 > r14 ? 1 : (r28 == r14 ? 0 : -1))
            if (r5 < 0) goto L6f
            goto L71
        L6f:
            r5 = 0
            goto L72
        L71:
            r5 = 1
        L72:
            if (r5 != 0) goto L78
            if (r27 != 0) goto L80
            r6 = 0
            goto L7a
        L78:
            r6 = r27
        L7a:
            if (r5 != r6) goto L89
            int r9 = (r28 > r23 ? 1 : (r28 == r23 ? 0 : -1))
            if (r9 >= 0) goto L89
        L80:
            r27 = r5
            r26 = r11
            r23 = r28
            r21 = r30
            goto L8b
        L89:
            r27 = r6
        L8b:
            int r6 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r6 >= 0) goto L95
            r20 = r5
            r25 = r11
            r18 = r30
        L95:
            int r11 = r11 + 1
            r9 = 2
            goto L48
        L99:
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto Lab
            if (r20 == 0) goto Lab
            r5 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r5
            int r5 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r5 < 0) goto Lab
            r11 = r25
            goto Lad
        Lab:
            r11 = r26
        Lad:
            r0.zzp = r11
            if (r11 != r10) goto Lb3
            goto L216
        Lb3:
            com.google.android.gms.internal.ads.zzajk[] r5 = r0.zzw
            r5 = r5[r11]
            com.google.android.gms.internal.ads.zzaeh r6 = r5.zzc
            int r9 = r5.zze
            com.google.android.gms.internal.ads.zzaju r11 = r5.zzb
            long[] r10 = r11.zzc
            r12 = r10[r9]
            int[] r10 = r11.zzd
            r10 = r10[r9]
            com.google.android.gms.internal.ads.zzaei r11 = r5.zzd
            long r3 = r12 - r3
            int r14 = r0.zzq
            long r14 = (long) r14
            long r3 = r3 + r14
            int r14 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r14 < 0) goto L213
            r7 = 262144(0x40000, double:1.295163E-318)
            int r14 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r14 < 0) goto Lda
            goto L213
        Lda:
            com.google.android.gms.internal.ads.zzajr r2 = r5.zza
            int r2 = r2.zzg
            r7 = 1
            if (r2 != r7) goto Le6
            r7 = 8
            long r3 = r3 + r7
            int r10 = r10 + (-8)
        Le6:
            int r2 = (int) r3
            r1.zzk(r2)
            com.google.android.gms.internal.ads.zzajr r2 = r5.zza
            com.google.android.gms.internal.ads.zzaf r2 = r2.zzf
            java.lang.String r2 = r2.zzn
            java.lang.String r3 = "video/avc"
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto Lfc
            r2 = 1
            r0.zzt = r2
            goto Lfd
        Lfc:
            r2 = 1
        Lfd:
            com.google.android.gms.internal.ads.zzajr r3 = r5.zza
            int r4 = r3.zzj
            if (r4 == 0) goto L17c
            com.google.android.gms.internal.ads.zzek r3 = r0.zzd
            byte[] r3 = r3.zzN()
            r7 = 0
            r3[r7] = r7
            r3[r2] = r7
            r2 = 2
            r3[r2] = r7
            int r2 = r4 + 1
            r7 = 4
            int r4 = 4 - r4
        L116:
            int r7 = r0.zzr
            if (r7 >= r10) goto L1bf
            int r7 = r0.zzs
            if (r7 != 0) goto L167
            r1.zzi(r3, r4, r2)
            int r7 = r0.zzq
            int r7 = r7 + r2
            r0.zzq = r7
            com.google.android.gms.internal.ads.zzek r7 = r0.zzd
            r8 = 0
            r7.zzL(r8)
            com.google.android.gms.internal.ads.zzek r7 = r0.zzd
            int r7 = r7.zzg()
            if (r7 <= 0) goto L15f
            int r7 = r7 + (-1)
            r0.zzs = r7
            com.google.android.gms.internal.ads.zzek r7 = r0.zzc
            r7.zzL(r8)
            com.google.android.gms.internal.ads.zzek r7 = r0.zzc
            r8 = 4
            r6.zzq(r7, r8)
            com.google.android.gms.internal.ads.zzek r7 = r0.zzd
            r12 = 1
            r6.zzq(r7, r12)
            int r7 = r0.zzr
            int r7 = r7 + 5
            r0.zzr = r7
            int r10 = r10 + r4
            boolean r7 = r0.zzt
            if (r7 != 0) goto L116
            r7 = r3[r8]
            boolean r7 = com.google.android.gms.internal.ads.zzfs.zzi(r7)
            if (r7 == 0) goto L116
            r0.zzt = r12
            goto L116
        L15f:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r2)
            throw r1
        L167:
            r8 = 0
            int r7 = r6.zzf(r1, r7, r8)
            int r8 = r0.zzq
            int r8 = r8 + r7
            r0.zzq = r8
            int r8 = r0.zzr
            int r8 = r8 + r7
            r0.zzr = r8
            int r8 = r0.zzs
            int r8 = r8 - r7
            r0.zzs = r8
            goto L116
        L17c:
            com.google.android.gms.internal.ads.zzaf r2 = r3.zzf
            java.lang.String r2 = r2.zzn
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L19f
            int r2 = r0.zzr
            if (r2 != 0) goto L19c
            com.google.android.gms.internal.ads.zzek r2 = r0.zze
            com.google.android.gms.internal.ads.zzace.zzb(r10, r2)
            com.google.android.gms.internal.ads.zzek r2 = r0.zze
            r3 = 7
            r6.zzq(r2, r3)
            int r2 = r0.zzr
            int r2 = r2 + r3
            r0.zzr = r2
        L19c:
            int r10 = r10 + 7
            goto L1a4
        L19f:
            if (r11 == 0) goto L1a4
            r11.zzd(r1)
        L1a4:
            int r2 = r0.zzr
            if (r2 >= r10) goto L1bf
            int r2 = r10 - r2
            r3 = 0
            int r2 = r6.zzf(r1, r2, r3)
            int r3 = r0.zzq
            int r3 = r3 + r2
            r0.zzq = r3
            int r3 = r0.zzr
            int r3 = r3 + r2
            r0.zzr = r3
            int r3 = r0.zzs
            int r3 = r3 - r2
            r0.zzs = r3
            goto L1a4
        L1bf:
            com.google.android.gms.internal.ads.zzaju r1 = r5.zzb
            long[] r2 = r1.zzf
            r3 = r2[r9]
            int[] r1 = r1.zzg
            r1 = r1[r9]
            boolean r2 = r0.zzt
            if (r2 != 0) goto L1d0
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r2
        L1d0:
            if (r11 == 0) goto L1f0
            r22 = 0
            r23 = 0
            r16 = r11
            r17 = r6
            r18 = r3
            r20 = r1
            r21 = r10
            r16.zzc(r17, r18, r20, r21, r22, r23)
            r1 = 1
            int r9 = r9 + r1
            com.google.android.gms.internal.ads.zzaju r1 = r5.zzb
            int r1 = r1.zzb
            if (r9 != r1) goto L1ff
            r1 = 0
            r11.zza(r6, r1)
            goto L1ff
        L1f0:
            r21 = 0
            r22 = 0
            r16 = r6
            r17 = r3
            r19 = r1
            r20 = r10
            r16.zzs(r17, r19, r20, r21, r22)
        L1ff:
            int r1 = r5.zze
            r2 = 1
            int r1 = r1 + r2
            r5.zze = r1
            r1 = -1
            r0.zzp = r1
            r1 = 0
            r0.zzq = r1
            r0.zzr = r1
            r0.zzs = r1
            r0.zzt = r2
            r10 = 0
            goto L216
        L213:
            r2.zza = r12
            r10 = 1
        L216:
            return r10
        L217:
            long r5 = r0.zzm
            int r3 = r0.zzn
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r33.zzf()
            long r7 = r7 + r5
            com.google.android.gms.internal.ads.zzek r3 = r0.zzo
            if (r3 == 0) goto L279
            byte[] r9 = r3.zzN()
            int r10 = r0.zzn
            int r6 = (int) r5
            r1.zzi(r9, r10, r6)
            int r5 = r0.zzl
            if (r5 != r4) goto L25e
            r4 = 1
            r0.zzu = r4
            r3.zzL(r11)
            int r4 = r3.zzg()
            int r4 = zzj(r4)
            if (r4 == 0) goto L245
            goto L25b
        L245:
            r4 = 4
            r3.zzM(r4)
        L249:
            int r4 = r3.zzb()
            if (r4 <= 0) goto L25a
            int r4 = r3.zzg()
            int r4 = zzj(r4)
            if (r4 == 0) goto L249
            goto L25b
        L25a:
            r4 = 0
        L25b:
            r0.zzA = r4
            goto L292
        L25e:
            java.util.ArrayDeque r4 = r0.zzg
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L292
            java.util.ArrayDeque r4 = r0.zzg
            java.lang.Object r4 = r4.peek()
            com.google.android.gms.internal.ads.zzaim r4 = (com.google.android.gms.internal.ads.zzaim) r4
            com.google.android.gms.internal.ads.zzain r5 = new com.google.android.gms.internal.ads.zzain
            int r6 = r0.zzl
            r5.<init>(r6, r3)
            r4.zzd(r5)
            goto L292
        L279:
            boolean r3 = r0.zzu
            if (r3 != 0) goto L287
            int r3 = r0.zzl
            r4 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r3 != r4) goto L287
            r3 = 1
            r0.zzA = r3
        L287:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L294
            int r3 = (int) r5
            r1.zzk(r3)
        L292:
            r13 = 0
            goto L29c
        L294:
            long r3 = r33.zzf()
            long r3 = r3 + r5
            r2.zza = r3
            r13 = 1
        L29c:
            r0.zzn(r7)
            if (r13 == 0) goto L6
            int r3 = r0.zzk
            r5 = 2
            if (r3 == r5) goto L6
            r3 = 1
            return r3
        L2a8:
            r3 = 1
            r5 = 2
            int r6 = r0.zzn
            if (r6 != 0) goto L318
            com.google.android.gms.internal.ads.zzek r6 = r0.zzf
            byte[] r6 = r6.zzN()
            r9 = 0
            boolean r6 = r1.zzn(r6, r9, r11, r3)
            if (r6 != 0) goto L300
            int r1 = r0.zzA
            if (r1 != r5) goto L2fe
            int r1 = r0.zzb
            r1 = r1 & r5
            if (r1 == 0) goto L2fe
            com.google.android.gms.internal.ads.zzade r1 = r0.zzv
            r2 = 4
            com.google.android.gms.internal.ads.zzaeh r1 = r1.zzw(r9, r2)
            com.google.android.gms.internal.ads.zzahj r2 = r0.zzB
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L2d6
            r5 = 0
            goto L2e0
        L2d6:
            com.google.android.gms.internal.ads.zzbk r5 = new com.google.android.gms.internal.ads.zzbk
            r6 = 1
            com.google.android.gms.internal.ads.zzbj[] r6 = new com.google.android.gms.internal.ads.zzbj[r6]
            r6[r9] = r2
            r5.<init>(r3, r6)
        L2e0:
            com.google.android.gms.internal.ads.zzad r2 = new com.google.android.gms.internal.ads.zzad
            r2.<init>()
            r2.zzS(r5)
            com.google.android.gms.internal.ads.zzaf r2 = r2.zzaf()
            r1.zzl(r2)
            com.google.android.gms.internal.ads.zzade r1 = r0.zzv
            r1.zzD()
            com.google.android.gms.internal.ads.zzade r1 = r0.zzv
            com.google.android.gms.internal.ads.zzadz r2 = new com.google.android.gms.internal.ads.zzadz
            r2.<init>(r3, r7)
            r1.zzO(r2)
        L2fe:
            r1 = -1
            return r1
        L300:
            r0.zzn = r11
            com.google.android.gms.internal.ads.zzek r3 = r0.zzf
            r5 = 0
            r3.zzL(r5)
            com.google.android.gms.internal.ads.zzek r3 = r0.zzf
            long r5 = r3.zzu()
            r0.zzm = r5
            com.google.android.gms.internal.ads.zzek r3 = r0.zzf
            int r3 = r3.zzg()
            r0.zzl = r3
        L318:
            long r5 = r0.zzm
            r9 = 1
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 != 0) goto L337
            com.google.android.gms.internal.ads.zzek r3 = r0.zzf
            byte[] r3 = r3.zzN()
            r1.zzi(r3, r11, r11)
            int r3 = r0.zzn
            int r3 = r3 + r11
            r0.zzn = r3
            com.google.android.gms.internal.ads.zzek r3 = r0.zzf
            long r5 = r3.zzw()
            r0.zzm = r5
            goto L362
        L337:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L362
            long r5 = r33.zzd()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L353
            java.util.ArrayDeque r3 = r0.zzg
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzaim r3 = (com.google.android.gms.internal.ads.zzaim) r3
            if (r3 == 0) goto L352
            long r5 = r3.zza
            goto L353
        L352:
            r5 = r7
        L353:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L362
            long r7 = r33.zzf()
            long r5 = r5 - r7
            int r3 = r0.zzn
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.zzm = r5
        L362:
            long r5 = r0.zzm
            int r3 = r0.zzn
            long r7 = (long) r3
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L49f
            int r5 = r0.zzl
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L44d
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L44d
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L44d
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L44d
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L44d
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L44d
            if (r5 != r7) goto L392
            goto L44d
        L392:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L419
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L419
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L419
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L419
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L419
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L419
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L419
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L419
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L419
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L419
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L419
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L419
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L419
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L419
            if (r5 == r4) goto L419
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L419
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L419
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L3ea
            goto L419
        L3ea:
            long r3 = r33.zzf()
            int r5 = r0.zzn
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r0.zzl
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L411
            long r14 = r10 + r5
            com.google.android.gms.internal.ads.zzahj r3 = new com.google.android.gms.internal.ads.zzahj
            r8 = 0
            long r12 = r0.zzm
            long r4 = r12 - r5
            r7 = r3
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r4
            r7.<init>(r8, r10, r12, r14, r16)
            r0.zzB = r3
        L411:
            r3 = 0
            r0.zzo = r3
            r3 = 1
            r0.zzk = r3
            goto L6
        L419:
            if (r3 != r11) goto L41d
            r3 = 1
            goto L41e
        L41d:
            r3 = 0
        L41e:
            com.google.android.gms.internal.ads.zzdi.zzf(r3)
            long r3 = r0.zzm
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L42c
            r3 = 1
            goto L42d
        L42c:
            r3 = 0
        L42d:
            com.google.android.gms.internal.ads.zzdi.zzf(r3)
            com.google.android.gms.internal.ads.zzek r3 = new com.google.android.gms.internal.ads.zzek
            long r4 = r0.zzm
            int r5 = (int) r4
            r3.<init>(r5)
            com.google.android.gms.internal.ads.zzek r4 = r0.zzf
            byte[] r4 = r4.zzN()
            byte[] r5 = r3.zzN()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r11)
            r0.zzo = r3
            r3 = 1
            r0.zzk = r3
            goto L6
        L44d:
            long r3 = r33.zzf()
            long r5 = r0.zzm
            long r3 = r3 + r5
            int r8 = r0.zzn
            long r8 = (long) r8
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L47f
            int r5 = r0.zzl
            if (r5 != r7) goto L47f
            com.google.android.gms.internal.ads.zzek r5 = r0.zze
            r5.zzI(r11)
            com.google.android.gms.internal.ads.zzek r5 = r0.zze
            byte[] r5 = r5.zzN()
            r6 = 0
            r1.zzh(r5, r6, r11)
            com.google.android.gms.internal.ads.zzek r5 = r0.zze
            com.google.android.gms.internal.ads.zzaiz.zze(r5)
            com.google.android.gms.internal.ads.zzek r5 = r0.zze
            int r5 = r5.zzd()
            r1.zzk(r5)
            r33.zzj()
        L47f:
            long r3 = r3 - r8
            java.util.ArrayDeque r5 = r0.zzg
            com.google.android.gms.internal.ads.zzaim r6 = new com.google.android.gms.internal.ads.zzaim
            int r7 = r0.zzl
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.zzm
            int r7 = r0.zzn
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L49a
            r0.zzn(r3)
            goto L6
        L49a:
            r32.zzm()
            goto L6
        L49f:
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
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(com.google.android.gms.internal.ads.zzade r3) {
            r2 = this;
            int r0 = r2.zzb
            r0 = r0 & 16
            if (r0 != 0) goto Le
            com.google.android.gms.internal.ads.zzakt r0 = r2.zza
            com.google.android.gms.internal.ads.zzakw r1 = new com.google.android.gms.internal.ads.zzakw
            r1.<init>(r3, r0)
            r3 = r1
        Le:
            r2.zzv = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r6, long r8) {
            r5 = this;
            java.util.ArrayDeque r0 = r5.zzg
            r0.clear()
            r0 = 0
            r5.zzn = r0
            r1 = -1
            r5.zzp = r1
            r5.zzq = r0
            r5.zzr = r0
            r5.zzs = r0
            r2 = 1
            r5.zzt = r2
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L2e
            int r6 = r5.zzk
            r7 = 3
            if (r6 == r7) goto L23
            r5.zzm()
            return
        L23:
            com.google.android.gms.internal.ads.zzajp r6 = r5.zzh
            r6.zzb()
            java.util.List r6 = r5.zzi
            r6.clear()
            return
        L2e:
            com.google.android.gms.internal.ads.zzajk[] r6 = r5.zzw
            int r7 = r6.length
        L31:
            if (r0 >= r7) goto L4d
            r2 = r6[r0]
            com.google.android.gms.internal.ads.zzaju r3 = r2.zzb
            int r4 = r3.zza(r8)
            if (r4 != r1) goto L41
            int r4 = r3.zzb(r8)
        L41:
            r2.zze = r4
            com.google.android.gms.internal.ads.zzaei r2 = r2.zzd
            if (r2 == 0) goto L4a
            r2.zzb()
        L4a:
            int r0 = r0 + 1
            goto L31
        L4d:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r13) {
            r12 = this;
            com.google.android.gms.internal.ads.zzajk[] r0 = r12.zzw
            int r1 = r0.length
            if (r1 != 0) goto Le
            com.google.android.gms.internal.ads.zzady r13 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r14 = com.google.android.gms.internal.ads.zzaeb.zza
            r13.<init>(r14, r14)
            goto L91
        Le:
            int r1 = r12.zzy
            r2 = -1
            r3 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == r2) goto L53
            r0 = r0[r1]
            com.google.android.gms.internal.ads.zzaju r0 = r0.zzb
            int r1 = zzk(r0, r13)
            if (r1 != r2) goto L2d
            com.google.android.gms.internal.ads.zzady r13 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r14 = com.google.android.gms.internal.ads.zzaeb.zza
            r13.<init>(r14, r14)
            goto L91
        L2d:
            long[] r7 = r0.zzf
            r8 = r7[r1]
            long[] r7 = r0.zzc
            r10 = r7[r1]
            int r7 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r7 >= 0) goto L50
            int r7 = r0.zzb
            int r7 = r7 + r2
            if (r1 >= r7) goto L50
            int r13 = r0.zzb(r13)
            if (r13 == r2) goto L50
            if (r13 == r1) goto L50
            long[] r14 = r0.zzf
            r1 = r14[r13]
            long[] r14 = r0.zzc
            r13 = r14[r13]
            r3 = r13
            goto L51
        L50:
            r1 = r5
        L51:
            r13 = r8
            goto L59
        L53:
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = r5
        L59:
            r0 = 0
        L5a:
            com.google.android.gms.internal.ads.zzajk[] r7 = r12.zzw
            int r8 = r7.length
            if (r0 >= r8) goto L77
            int r8 = r12.zzy
            if (r0 == r8) goto L74
            r7 = r7[r0]
            com.google.android.gms.internal.ads.zzaju r7 = r7.zzb
            long r8 = zzl(r7, r13, r10)
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L73
            long r3 = zzl(r7, r1, r3)
        L73:
            r10 = r8
        L74:
            int r0 = r0 + 1
            goto L5a
        L77:
            com.google.android.gms.internal.ads.zzaeb r0 = new com.google.android.gms.internal.ads.zzaeb
            r0.<init>(r13, r10)
            int r13 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r13 != 0) goto L86
            com.google.android.gms.internal.ads.zzady r13 = new com.google.android.gms.internal.ads.zzady
            r13.<init>(r0, r0)
            goto L91
        L86:
            com.google.android.gms.internal.ads.zzaeb r13 = new com.google.android.gms.internal.ads.zzaeb
            r13.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzady r14 = new com.google.android.gms.internal.ads.zzady
            r14.<init>(r0, r13)
            r13 = r14
        L91:
            return r13
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzb
            r0 = r0 & 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.internal.ads.zzaee r4 = com.google.android.gms.internal.ads.zzajq.zzb(r4, r0)
            if (r4 == 0) goto L16
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzo(r4)
            goto L1a
        L16:
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
        L1a:
            r3.zzj = r0
            if (r4 != 0) goto L1f
            return r1
        L1f:
            return r2
    }
}
