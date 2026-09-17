package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzafi implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private final com.google.android.gms.internal.ads.zzek zzd;
    private final com.google.android.gms.internal.ads.zzafj zze;
    private com.google.android.gms.internal.ads.zzade zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private com.google.android.gms.internal.ads.zzafh zzo;
    private com.google.android.gms.internal.ads.zzafm zzp;

    public zzafi() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 4
            r0.<init>(r1)
            r2.zza = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 9
            r0.<init>(r1)
            r2.zzb = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 11
            r0.<init>(r1)
            r2.zzc = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r2.zzd = r0
            com.google.android.gms.internal.ads.zzafj r0 = new com.google.android.gms.internal.ads.zzafj
            r0.<init>()
            r2.zze = r0
            r0 = 1
            r2.zzg = r0
            return
    }

    private final com.google.android.gms.internal.ads.zzek zza(com.google.android.gms.internal.ads.zzadc r5) throws java.io.IOException {
            r4 = this;
            com.google.android.gms.internal.ads.zzek r0 = r4.zzd
            int r1 = r4.zzl
            int r0 = r0.zzc()
            r2 = 0
            if (r1 <= r0) goto L1e
            com.google.android.gms.internal.ads.zzek r0 = r4.zzd
            int r1 = r0.zzc()
            int r1 = r1 + r1
            int r3 = r4.zzl
            int r1 = java.lang.Math.max(r1, r3)
            byte[] r1 = new byte[r1]
            r0.zzJ(r1, r2)
            goto L23
        L1e:
            com.google.android.gms.internal.ads.zzek r0 = r4.zzd
            r0.zzL(r2)
        L23:
            com.google.android.gms.internal.ads.zzek r0 = r4.zzd
            int r1 = r4.zzl
            r0.zzK(r1)
            com.google.android.gms.internal.ads.zzek r0 = r4.zzd
            byte[] r0 = r0.zzN()
            int r1 = r4.zzl
            r5.zzi(r0, r2, r1)
            com.google.android.gms.internal.ads.zzek r5 = r4.zzd
            return r5
    }

    private final void zzg() {
            r6 = this;
            boolean r0 = r6.zzn
            if (r0 != 0) goto L18
            com.google.android.gms.internal.ads.zzade r0 = r6.zzf
            com.google.android.gms.internal.ads.zzadz r1 = new com.google.android.gms.internal.ads.zzadz
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r1.<init>(r2, r4)
            r0.zzO(r1)
            r0 = 1
            r6.zzn = r0
        L18:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r17, com.google.android.gms.internal.ads.zzadx r18) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzade r2 = r0.zzf
            com.google.android.gms.internal.ads.zzdi.zzb(r2)
        L9:
            int r2 = r0.zzg
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L11a
            r10 = 3
            if (r2 == r6) goto L10f
            if (r2 == r10) goto Lc6
            if (r2 != r7) goto Lc0
            boolean r2 = r0.zzh
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L2c
            long r2 = r0.zzi
            long r14 = r0.zzm
            long r2 = r2 + r14
            goto L3b
        L2c:
            com.google.android.gms.internal.ads.zzafj r2 = r0.zze
            long r2 = r2.zzc()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L39
            r2 = 0
            goto L3b
        L39:
            long r2 = r0.zzm
        L3b:
            int r14 = r0.zzk
            if (r14 != r4) goto L52
            com.google.android.gms.internal.ads.zzafh r14 = r0.zzo
            if (r14 == 0) goto L53
            r16.zzg()
            com.google.android.gms.internal.ads.zzafh r4 = r0.zzo
            com.google.android.gms.internal.ads.zzek r5 = r16.zza(r17)
            boolean r2 = r4.zzf(r5, r2)
        L50:
            r3 = 1
            goto L9f
        L52:
            r4 = r14
        L53:
            if (r4 != r5) goto L67
            com.google.android.gms.internal.ads.zzafm r4 = r0.zzp
            if (r4 == 0) goto L98
            r16.zzg()
            com.google.android.gms.internal.ads.zzafm r4 = r0.zzp
            com.google.android.gms.internal.ads.zzek r5 = r16.zza(r17)
            boolean r2 = r4.zzf(r5, r2)
            goto L50
        L67:
            r5 = 18
            if (r4 != r5) goto L98
            boolean r4 = r0.zzn
            if (r4 != 0) goto L98
            com.google.android.gms.internal.ads.zzafj r4 = r0.zze
            com.google.android.gms.internal.ads.zzek r5 = r16.zza(r17)
            boolean r2 = r4.zzf(r5, r2)
            com.google.android.gms.internal.ads.zzafj r3 = r0.zze
            long r4 = r3.zzc()
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 == 0) goto L50
            com.google.android.gms.internal.ads.zzade r14 = r0.zzf
            com.google.android.gms.internal.ads.zzads r15 = new com.google.android.gms.internal.ads.zzads
            long[] r10 = r3.zzd()
            long[] r3 = r3.zze()
            r15.<init>(r10, r3, r4)
            r14.zzO(r15)
            r0.zzn = r9
            goto L50
        L98:
            int r2 = r0.zzl
            r1.zzk(r2)
            r2 = 0
            r3 = 0
        L9f:
            boolean r4 = r0.zzh
            if (r4 != 0) goto Lb9
            if (r2 == 0) goto Lb9
            r0.zzh = r9
            com.google.android.gms.internal.ads.zzafj r2 = r0.zze
            long r4 = r2.zzc()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto Lb5
            long r4 = r0.zzm
            long r10 = -r4
            goto Lb7
        Lb5:
            r10 = 0
        Lb7:
            r0.zzi = r10
        Lb9:
            r0.zzj = r7
            r0.zzg = r6
            if (r3 == 0) goto L9
            return r8
        Lc0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        Lc6:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            byte[] r2 = r2.zzN()
            r4 = 11
            boolean r2 = r1.zzn(r2, r8, r4, r9)
            if (r2 != 0) goto Ld5
            return r3
        Ld5:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            r2.zzL(r8)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            int r2 = r2.zzm()
            r0.zzk = r2
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            int r2 = r2.zzo()
            r0.zzl = r2
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            int r2 = r2.zzo()
            long r2 = (long) r2
            r0.zzm = r2
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            int r2 = r2.zzm()
            int r2 = r2 << 24
            long r3 = r0.zzm
            long r5 = (long) r2
            long r2 = r5 | r3
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.zzm = r2
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            r2.zzM(r10)
            r0.zzg = r7
            goto L9
        L10f:
            int r2 = r0.zzj
            r1.zzk(r2)
            r0.zzj = r8
            r0.zzg = r10
            goto L9
        L11a:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzb
            byte[] r2 = r2.zzN()
            boolean r2 = r1.zzn(r2, r8, r5, r9)
            if (r2 != 0) goto L127
            return r3
        L127:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzb
            r2.zzL(r8)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzb
            r2.zzM(r7)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzb
            int r2 = r2.zzm()
            r3 = r2 & 4
            r2 = r2 & r9
            if (r3 == 0) goto L14d
            com.google.android.gms.internal.ads.zzafh r3 = r0.zzo
            if (r3 != 0) goto L14d
            com.google.android.gms.internal.ads.zzafh r3 = new com.google.android.gms.internal.ads.zzafh
            com.google.android.gms.internal.ads.zzade r7 = r0.zzf
            com.google.android.gms.internal.ads.zzaeh r4 = r7.zzw(r4, r9)
            r3.<init>(r4)
            r0.zzo = r3
        L14d:
            if (r2 == 0) goto L160
            com.google.android.gms.internal.ads.zzafm r2 = r0.zzp
            if (r2 != 0) goto L160
            com.google.android.gms.internal.ads.zzafm r2 = new com.google.android.gms.internal.ads.zzafm
            com.google.android.gms.internal.ads.zzade r3 = r0.zzf
            com.google.android.gms.internal.ads.zzaeh r3 = r3.zzw(r5, r6)
            r2.<init>(r3)
            r0.zzp = r2
        L160:
            com.google.android.gms.internal.ads.zzade r2 = r0.zzf
            r2.zzD()
            com.google.android.gms.internal.ads.zzek r2 = r0.zzb
            int r2 = r2.zzg()
            int r2 = r2 + (-5)
            r0.zzj = r2
            r0.zzg = r6
            goto L9
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
            r0.zzf = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r3, long r5) {
            r2 = this;
            r5 = 0
            r0 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 != 0) goto Ld
            r3 = 1
            r2.zzg = r3
            r2.zzh = r5
            goto L10
        Ld:
            r3 = 3
            r2.zzg = r3
        L10:
            r2.zzj = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r5) throws java.io.IOException {
            r4 = this;
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            byte[] r0 = r0.zzN()
            r1 = r5
            com.google.android.gms.internal.ads.zzacq r1 = (com.google.android.gms.internal.ads.zzacq) r1
            r2 = 0
            r3 = 3
            r1.zzm(r0, r2, r3, r2)
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            r0.zzL(r2)
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            int r0 = r0.zzo()
            r3 = 4607062(0x464c56, float:6.455869E-39)
            if (r0 == r3) goto L1f
            return r2
        L1f:
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            byte[] r0 = r0.zzN()
            r3 = 2
            r1.zzm(r0, r2, r3, r2)
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            r0.zzL(r2)
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            int r0 = r0.zzq()
            r0 = r0 & 250(0xfa, float:3.5E-43)
            if (r0 == 0) goto L39
            return r2
        L39:
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            byte[] r0 = r0.zzN()
            r3 = 4
            r1.zzm(r0, r2, r3, r2)
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            r0.zzL(r2)
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            int r0 = r0.zzg()
            r5.zzj()
            com.google.android.gms.internal.ads.zzacq r5 = (com.google.android.gms.internal.ads.zzacq) r5
            r5.zzl(r0, r2)
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            byte[] r0 = r0.zzN()
            r5.zzm(r0, r2, r3, r2)
            com.google.android.gms.internal.ads.zzek r5 = r4.zza
            r5.zzL(r2)
            com.google.android.gms.internal.ads.zzek r5 = r4.zza
            int r5 = r5.zzg()
            if (r5 != 0) goto L6e
            r5 = 1
            return r5
        L6e:
            return r2
    }
}
