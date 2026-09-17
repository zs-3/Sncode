package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzanz implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzer zza;
    private final android.util.SparseArray zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private final com.google.android.gms.internal.ads.zzanx zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private com.google.android.gms.internal.ads.zzanw zzi;
    private com.google.android.gms.internal.ads.zzade zzj;
    private boolean zzk;

    public zzanz() {
            r3 = this;
            com.google.android.gms.internal.ads.zzer r0 = new com.google.android.gms.internal.ads.zzer
            r1 = 0
            r0.<init>(r1)
            r3.<init>()
            r3.zza = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1)
            r3.zzc = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.zzb = r0
            com.google.android.gms.internal.ads.zzanx r0 = new com.google.android.gms.internal.ads.zzanx
            r0.<init>()
            r3.zzd = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r17, com.google.android.gms.internal.ads.zzadx r18) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.gms.internal.ads.zzade r3 = r0.zzj
            com.google.android.gms.internal.ads.zzdi.zzb(r3)
            long r10 = r17.zzd()
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L23
            com.google.android.gms.internal.ads.zzanx r4 = r0.zzd
            boolean r5 = r4.zze()
            if (r5 == 0) goto L1e
            goto L23
        L1e:
            int r1 = r4.zza(r1, r2)
            return r1
        L23:
            boolean r4 = r0.zzk
            r14 = 1
            if (r4 != 0) goto L64
            r0.zzk = r14
            com.google.android.gms.internal.ads.zzanx r4 = r0.zzd
            long r5 = r4.zzb()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L54
            com.google.android.gms.internal.ads.zzanw r15 = new com.google.android.gms.internal.ads.zzanw
            com.google.android.gms.internal.ads.zzer r5 = r4.zzd()
            long r6 = r4.zzb()
            r4 = r15
            r8 = r10
            r4.<init>(r5, r6, r8)
            r0.zzi = r15
            com.google.android.gms.internal.ads.zzade r4 = r0.zzj
            com.google.android.gms.internal.ads.zzaea r5 = r15.zzb()
            r4.zzO(r5)
            goto L64
        L54:
            com.google.android.gms.internal.ads.zzade r5 = r0.zzj
            com.google.android.gms.internal.ads.zzadz r6 = new com.google.android.gms.internal.ads.zzadz
            long r7 = r4.zzb()
            r14 = 0
            r6.<init>(r7, r14)
            r5.zzO(r6)
        L64:
            com.google.android.gms.internal.ads.zzanw r5 = r0.zzi
            if (r5 == 0) goto L74
            boolean r6 = r5.zze()
            if (r6 != 0) goto L6f
            goto L74
        L6f:
            int r1 = r5.zza(r1, r2)
            return r1
        L74:
            r17.zzj()
            if (r3 == 0) goto L7f
            long r2 = r17.zze()
            long r10 = r10 - r2
            goto L80
        L7f:
            r10 = r12
        L80:
            r2 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L8d
            r5 = 4
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 < 0) goto L8c
            goto L8d
        L8c:
            return r2
        L8d:
            com.google.android.gms.internal.ads.zzek r3 = r0.zzc
            byte[] r3 = r3.zzN()
            r5 = 4
            r6 = 0
            r4 = 1
            boolean r3 = r1.zzm(r3, r6, r5, r4)
            if (r3 != 0) goto L9d
            return r2
        L9d:
            com.google.android.gms.internal.ads.zzek r3 = r0.zzc
            r3.zzL(r6)
            com.google.android.gms.internal.ads.zzek r3 = r0.zzc
            int r3 = r3.zzg()
            r5 = 441(0x1b9, float:6.18E-43)
            if (r3 != r5) goto Lad
            return r2
        Lad:
            r2 = 442(0x1ba, float:6.2E-43)
            if (r3 != r2) goto Ld1
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            byte[] r2 = r2.zzN()
            r3 = 10
            r1.zzh(r2, r6, r3)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            r3 = 9
            r2.zzL(r3)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            int r2 = r2.zzm()
            r2 = r2 & 7
            int r2 = r2 + 14
            r1.zzk(r2)
            return r6
        Ld1:
            r2 = 443(0x1bb, float:6.21E-43)
            r5 = 2
            r7 = 6
            if (r3 != r2) goto Lf0
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            byte[] r2 = r2.zzN()
            r1.zzh(r2, r6, r5)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            int r2 = r2.zzq()
            int r2 = r2 + r7
            r1.zzk(r2)
            return r6
        Lf0:
            int r2 = r3 >> 8
            r4 = 1
            if (r2 == r4) goto Lf9
            r1.zzk(r4)
            return r6
        Lf9:
            r2 = r3 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r3 = r0.zzb
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzany r3 = (com.google.android.gms.internal.ads.zzany) r3
            boolean r8 = r0.zze
            if (r8 != 0) goto L184
            if (r3 != 0) goto L164
            r8 = 189(0xbd, float:2.65E-43)
            r9 = 0
            if (r2 != r8) goto L11e
            com.google.android.gms.internal.ads.zzamr r8 = new com.google.android.gms.internal.ads.zzamr
            r8.<init>(r9, r6)
            r4 = 1
            r0.zzf = r4
            long r9 = r17.zzf()
            r0.zzh = r9
        L11c:
            r9 = r8
            goto L147
        L11e:
            r4 = 1
            r8 = r2 & 224(0xe0, float:3.14E-43)
            r10 = 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L133
            com.google.android.gms.internal.ads.zzanl r8 = new com.google.android.gms.internal.ads.zzanl
            r8.<init>(r9, r6)
            r0.zzf = r4
            long r9 = r17.zzf()
            r0.zzh = r9
            goto L11c
        L133:
            r8 = r2 & 240(0xf0, float:3.36E-43)
            r10 = 224(0xe0, float:3.14E-43)
            if (r8 != r10) goto L147
            com.google.android.gms.internal.ads.zzanb r8 = new com.google.android.gms.internal.ads.zzanb
            r8.<init>(r9)
            r0.zzg = r4
            long r9 = r17.zzf()
            r0.zzh = r9
            goto L11c
        L147:
            if (r9 == 0) goto L164
            com.google.android.gms.internal.ads.zzaon r3 = new com.google.android.gms.internal.ads.zzaon
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 256(0x100, float:3.59E-43)
            r3.<init>(r8, r2, r10)
            com.google.android.gms.internal.ads.zzade r8 = r0.zzj
            r9.zzb(r8, r3)
            com.google.android.gms.internal.ads.zzer r3 = r0.zza
            com.google.android.gms.internal.ads.zzany r8 = new com.google.android.gms.internal.ads.zzany
            r8.<init>(r9, r3)
            android.util.SparseArray r3 = r0.zzb
            r3.put(r2, r8)
            r3 = r8
        L164:
            boolean r2 = r0.zzf
            r8 = 1048576(0x100000, double:5.180654E-318)
            if (r2 == 0) goto L174
            boolean r2 = r0.zzg
            if (r2 == 0) goto L174
            long r8 = r0.zzh
            r10 = 8192(0x2000, double:4.0474E-320)
            long r8 = r8 + r10
        L174:
            long r10 = r17.zzf()
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L184
            r2 = 1
            r0.zze = r2
            com.google.android.gms.internal.ads.zzade r2 = r0.zzj
            r2.zzD()
        L184:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            byte[] r2 = r2.zzN()
            r1.zzh(r2, r6, r5)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            int r2 = r2.zzq()
            int r2 = r2 + r7
            if (r3 != 0) goto L19f
            r1.zzk(r2)
            goto L1c0
        L19f:
            com.google.android.gms.internal.ads.zzek r4 = r0.zzc
            r4.zzI(r2)
            com.google.android.gms.internal.ads.zzek r4 = r0.zzc
            byte[] r4 = r4.zzN()
            r1.zzi(r4, r6, r2)
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            r1.zzL(r7)
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            r3.zza(r1)
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            int r2 = r1.zzc()
            r1.zzK(r2)
        L1c0:
            return r6
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
    public final void zze(com.google.android.gms.internal.ads.zzade r1) {
            r0 = this;
            r0.zzj = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r5, long r7) {
            r4 = this;
            com.google.android.gms.internal.ads.zzer r5 = r4.zza
            long r0 = r5.zzf()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.zzd()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.zzi(r7)
        L24:
            com.google.android.gms.internal.ads.zzanw r5 = r4.zzi
            r6 = 0
            if (r5 == 0) goto L2c
            r5.zzd(r7)
        L2c:
            android.util.SparseArray r5 = r4.zzb
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.zzb
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzany r5 = (com.google.android.gms.internal.ads.zzany) r5
            r5.zzb()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r10) throws java.io.IOException {
            r9 = this;
            r0 = 14
            byte[] r1 = new byte[r0]
            com.google.android.gms.internal.ads.zzacq r10 = (com.google.android.gms.internal.ads.zzacq) r10
            r2 = 0
            r10.zzm(r1, r2, r0, r2)
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 1
            r4 = r1[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 2
            r6 = r1[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 3
            r8 = r1[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r4 = r4 << 16
            r0 = r0 | r4
            r4 = 8
            int r6 = r6 << r4
            r0 = r0 | r6
            r0 = r0 | r8
            r6 = 442(0x1ba, float:6.2E-43)
            if (r0 == r6) goto L2c
            return r2
        L2c:
            r0 = 4
            r6 = r1[r0]
            r6 = r6 & 196(0xc4, float:2.75E-43)
            r8 = 68
            if (r6 == r8) goto L36
            return r2
        L36:
            r6 = 6
            r6 = r1[r6]
            r6 = r6 & r0
            if (r6 == r0) goto L3d
            return r2
        L3d:
            r6 = r1[r4]
            r6 = r6 & r0
            if (r6 == r0) goto L43
            return r2
        L43:
            r0 = 9
            r0 = r1[r0]
            r0 = r0 & r3
            if (r0 == r3) goto L4b
            return r2
        L4b:
            r0 = 12
            r0 = r1[r0]
            r0 = r0 & r7
            if (r0 == r7) goto L53
            return r2
        L53:
            r0 = 13
            r0 = r1[r0]
            r0 = r0 & 7
            r10.zzl(r0, r2)
            r10.zzm(r1, r2, r7, r2)
            r10 = r1[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r0 = r1[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r4
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            r10 = r10 | r1
            if (r10 != r3) goto L73
            return r3
        L73:
            return r2
    }
}
