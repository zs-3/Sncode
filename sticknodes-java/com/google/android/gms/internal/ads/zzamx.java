package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamx implements com.google.android.gms.internal.ads.zzamz {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private java.lang.String zze;
    private com.google.android.gms.internal.ads.zzaeh zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private com.google.android.gms.internal.ads.zzaf zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private long zzp;

    public zzamx(java.lang.String r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            byte[] r5 = new byte[r5]
            r0.<init>(r5)
            r2.zza = r0
            r5 = 0
            r2.zzg = r5
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzp = r0
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>()
            r2.zzb = r5
            r5 = -1
            r2.zzn = r5
            r2.zzo = r5
            r2.zzc = r3
            r2.zzd = r4
            return
    }

    private final void zzf(com.google.android.gms.internal.ads.zzacz r5) {
            r4 = this;
            int r0 = r5.zzb
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r0 == r1) goto L5a
            int r1 = r5.zzc
            r2 = -1
            if (r1 != r2) goto Ld
            goto L5a
        Ld:
            com.google.android.gms.internal.ads.zzaf r2 = r4.zzk
            if (r2 == 0) goto L23
            int r3 = r2.zzB
            if (r1 != r3) goto L23
            int r1 = r2.zzC
            if (r0 != r1) goto L23
            java.lang.String r0 = r5.zza
            java.lang.String r1 = r2.zzn
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 != 0) goto L5a
        L23:
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzk
            if (r0 != 0) goto L2d
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            goto L31
        L2d:
            com.google.android.gms.internal.ads.zzad r0 = r0.zzb()
        L31:
            java.lang.String r1 = r4.zze
            r0.zzL(r1)
            java.lang.String r1 = r5.zza
            r0.zzZ(r1)
            int r1 = r5.zzc
            r0.zzz(r1)
            int r5 = r5.zzb
            r0.zzaa(r5)
            java.lang.String r5 = r4.zzc
            r0.zzP(r5)
            int r5 = r4.zzd
            r0.zzX(r5)
            com.google.android.gms.internal.ads.zzaf r5 = r0.zzaf()
            r4.zzk = r5
            com.google.android.gms.internal.ads.zzaeh r0 = r4.zzf
            r0.zzl(r5)
        L5a:
            return
    }

    private final boolean zzg(com.google.android.gms.internal.ads.zzek r3, byte[] r4, int r5) {
            r2 = this;
            int r0 = r3.zzb()
            int r1 = r2.zzh
            int r1 = r5 - r1
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r2.zzh
            r3.zzH(r4, r1, r0)
            int r3 = r2.zzh
            int r3 = r3 + r0
            r2.zzh = r3
            if (r3 != r5) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r17) throws com.google.android.gms.internal.ads.zzbo {
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zzf
            com.google.android.gms.internal.ads.zzdi.zzb(r2)
        L9:
            int r2 = r17.zzb()
            if (r2 <= 0) goto L29d
            int r2 = r0.zzg
            r3 = 8
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L20b
            r9 = 5
            r10 = 7
            r11 = 6
            if (r2 == r8) goto L136
            if (r2 == r5) goto L11a
            r12 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == r4) goto Ldf
            if (r2 == r7) goto Lb2
            if (r2 == r9) goto L71
            int r2 = r17.zzb()
            int r3 = r0.zzl
            int r4 = r0.zzh
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            com.google.android.gms.internal.ads.zzaeh r3 = r0.zzf
            r3.zzq(r1, r2)
            int r3 = r0.zzh
            int r3 = r3 + r2
            r0.zzh = r3
            int r2 = r0.zzl
            if (r3 != r2) goto L9
            long r2 = r0.zzp
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 == 0) goto L51
            r2 = 1
            goto L52
        L51:
            r2 = 0
        L52:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            com.google.android.gms.internal.ads.zzaeh r9 = r0.zzf
            long r10 = r0.zzp
            int r2 = r0.zzm
            if (r2 != r7) goto L5f
            r12 = 0
            goto L60
        L5f:
            r12 = 1
        L60:
            int r13 = r0.zzl
            r14 = 0
            r15 = 0
            r9.zzs(r10, r12, r13, r14, r15)
            long r2 = r0.zzp
            long r4 = r0.zzj
            long r2 = r2 + r4
            r0.zzp = r2
            r0.zzg = r6
            goto L9
        L71:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            int r3 = r0.zzo
            boolean r2 = r0.zzg(r1, r2, r3)
            if (r2 == 0) goto L9
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            java.util.concurrent.atomic.AtomicInteger r3 = r0.zzb
            byte[] r2 = r2.zzN()
            com.google.android.gms.internal.ads.zzacz r2 = com.google.android.gms.internal.ads.zzada.zze(r2, r3)
            int r3 = r0.zzm
            if (r3 != r4) goto L92
            r0.zzf(r2)
        L92:
            int r3 = r2.zzd
            r0.zzl = r3
            long r2 = r2.zze
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 != 0) goto L9d
            goto L9e
        L9d:
            r12 = r2
        L9e:
            r0.zzj = r12
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zzf
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            int r4 = r0.zzo
            r2.zzq(r3, r4)
            r0.zzg = r11
            goto L9
        Lb2:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            boolean r2 = r0.zzg(r1, r2, r11)
            if (r2 == 0) goto L9
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            int r2 = com.google.android.gms.internal.ads.zzada.zzb(r2)
            r0.zzo = r2
            int r3 = r0.zzh
            if (r3 <= r2) goto Ldb
            int r2 = r3 - r2
            int r3 = r3 - r2
            r0.zzh = r3
            int r3 = r17.zzd()
            int r3 = r3 - r2
            r1.zzL(r3)
        Ldb:
            r0.zzg = r9
            goto L9
        Ldf:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            int r3 = r0.zzn
            boolean r2 = r0.zzg(r1, r2, r3)
            if (r2 == 0) goto L9
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            com.google.android.gms.internal.ads.zzacz r2 = com.google.android.gms.internal.ads.zzada.zzd(r2)
            r0.zzf(r2)
            int r3 = r2.zzd
            r0.zzl = r3
            long r2 = r2.zze
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 != 0) goto L105
            goto L106
        L105:
            r12 = r2
        L106:
            r0.zzj = r12
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zzf
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            int r4 = r0.zzn
            r2.zzq(r3, r4)
            r0.zzg = r11
            goto L9
        L11a:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            boolean r2 = r0.zzg(r1, r2, r10)
            if (r2 == 0) goto L9
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            int r2 = com.google.android.gms.internal.ads.zzada.zza(r2)
            r0.zzn = r2
            r0.zzg = r4
            goto L9
        L136:
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            r12 = 18
            boolean r2 = r0.zzg(r1, r2, r12)
            if (r2 == 0) goto L9
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            com.google.android.gms.internal.ads.zzaf r13 = r0.zzk
            if (r13 != 0) goto L160
            java.lang.String r13 = r0.zze
            java.lang.String r14 = r0.zzc
            int r15 = r0.zzd
            r12 = 0
            com.google.android.gms.internal.ads.zzaf r12 = com.google.android.gms.internal.ads.zzada.zzc(r2, r13, r14, r15, r12)
            r0.zzk = r12
            com.google.android.gms.internal.ads.zzaeh r13 = r0.zzf
            r13.zzl(r12)
        L160:
            int r12 = com.google.android.gms.internal.ads.zzada.zza
            r12 = r2[r6]
            r13 = 31
            r14 = -1
            r15 = -2
            if (r12 == r15) goto L1a3
            if (r12 == r14) goto L18d
            if (r12 == r13) goto L17b
            r3 = r2[r9]
            r3 = r3 & r4
            int r3 = r3 << 12
            r4 = r2[r11]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r6 = r2[r10]
            goto L1af
        L17b:
            r6 = r2[r11]
            r4 = r4 & r6
            int r4 = r4 << 12
            r6 = r2[r10]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << r7
            r3 = r2[r3]
            r3 = r3 & 60
            int r3 = r3 >> r5
            r4 = r4 | r6
            r3 = r3 | r4
            goto L1a0
        L18d:
            r3 = r2[r10]
            r3 = r3 & r4
            int r3 = r3 << 12
            r4 = r2[r11]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r6 = 9
            r6 = r2[r6]
            r6 = r6 & 60
            int r6 = r6 >> r5
            r3 = r3 | r4
            r3 = r3 | r6
        L1a0:
            int r3 = r3 + r8
            r4 = 1
            goto L1b6
        L1a3:
            r3 = r2[r7]
            r3 = r3 & r4
            int r3 = r3 << 12
            r4 = r2[r10]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r6 = r2[r11]
        L1af:
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r7
            r3 = r3 | r4
            r3 = r3 | r6
            int r3 = r3 + r8
            r4 = 0
        L1b6:
            if (r4 == 0) goto L1bc
            int r3 = r3 * 16
            int r3 = r3 / 14
        L1bc:
            r0.zzl = r3
            if (r12 == r15) goto L1db
            if (r12 == r14) goto L1d2
            if (r12 == r13) goto L1cb
            r3 = r2[r7]
            r3 = r3 & r8
            int r3 = r3 << r11
            r2 = r2[r9]
            goto L1e1
        L1cb:
            r3 = r2[r9]
            r3 = r3 & r10
            int r3 = r3 << r7
            r2 = r2[r11]
            goto L1d8
        L1d2:
            r3 = r2[r7]
            r3 = r3 & r10
            int r3 = r3 << r7
            r2 = r2[r10]
        L1d8:
            r2 = r2 & 60
            goto L1e3
        L1db:
            r3 = r2[r9]
            r3 = r3 & r8
            int r3 = r3 << r11
            r2 = r2[r7]
        L1e1:
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L1e3:
            int r2 = r2 >> r5
            r2 = r2 | r3
            int r2 = r2 + r8
            com.google.android.gms.internal.ads.zzaf r3 = r0.zzk
            int r3 = r3.zzC
            int r2 = r2 * 32
            long r4 = (long) r2
            long r2 = com.google.android.gms.internal.ads.zzeu.zzs(r4, r3)
            int r2 = com.google.android.gms.internal.ads.zzgdu.zzb(r2)
            long r2 = (long) r2
            r0.zzj = r2
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            r3 = 0
            r2.zzL(r3)
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zzf
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            r4 = 18
            r2.zzq(r3, r4)
            r0.zzg = r11
            goto L9
        L20b:
            int r2 = r17.zzb()
            if (r2 <= 0) goto L9
            int r2 = r0.zzi
            int r2 = r2 << r3
            r0.zzi = r2
            int r6 = r17.zzm()
            r2 = r2 | r6
            r0.zzi = r2
            int r6 = com.google.android.gms.internal.ads.zzada.zza
            r6 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r6) goto L25d
            r6 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r6) goto L25d
            r6 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r6) goto L25d
            r6 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r6) goto L234
            goto L25d
        L234:
            r6 = 1683496997(0x64582025, float:1.5947252E22)
            if (r2 == r6) goto L25b
            r6 = 622876772(0x25205864, float:1.3907736E-16)
            if (r2 != r6) goto L23f
            goto L25b
        L23f:
            r6 = 1078008818(0x40411bf2, float:3.0173306)
            if (r2 == r6) goto L259
            r6 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r2 != r6) goto L24a
            goto L259
        L24a:
            r6 = 1908687592(0x71c442e8, float:1.9436783E30)
            if (r2 == r6) goto L257
            r6 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r2 != r6) goto L255
            goto L257
        L255:
            r2 = 0
            goto L25e
        L257:
            r2 = 4
            goto L25e
        L259:
            r2 = 3
            goto L25e
        L25b:
            r2 = 2
            goto L25e
        L25d:
            r2 = 1
        L25e:
            r0.zzm = r2
            if (r2 == 0) goto L20b
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            byte[] r3 = r3.zzN()
            int r6 = r0.zzi
            int r9 = r6 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r10 = 0
            r3[r10] = r9
            int r9 = r6 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r3[r8] = r9
            int r9 = r6 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r3[r5] = r9
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r4] = r6
            r0.zzh = r7
            r6 = 0
            r0.zzi = r6
            if (r2 == r4) goto L299
            if (r2 != r7) goto L28f
            goto L299
        L28f:
            if (r2 != r8) goto L295
            r0.zzg = r8
            goto L9
        L295:
            r0.zzg = r5
            goto L9
        L299:
            r0.zzg = r7
            goto L9
        L29d:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r2, com.google.android.gms.internal.ads.zzaon r3) {
            r1 = this;
            r3.zzc()
            java.lang.String r0 = r3.zzb()
            r1.zze = r0
            int r3 = r3.zza()
            r0 = 1
            com.google.android.gms.internal.ads.zzaeh r2 = r2.zzw(r3, r0)
            r1.zzf = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long r1, int r3) {
            r0 = this;
            r0.zzp = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
            r3 = this;
            r0 = 0
            r3.zzg = r0
            r3.zzh = r0
            r3.zzi = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzp = r1
            java.util.concurrent.atomic.AtomicInteger r1 = r3.zzb
            r1.set(r0)
            return
    }
}
