package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzhz implements com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlu {
    private final java.lang.Object zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzkm zzc;
    private com.google.android.gms.internal.ads.zzlv zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzom zzf;
    private com.google.android.gms.internal.ads.zzdj zzg;
    private int zzh;
    private com.google.android.gms.internal.ads.zzwn zzi;
    private com.google.android.gms.internal.ads.zzaf[] zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private com.google.android.gms.internal.ads.zzcc zzp;
    private com.google.android.gms.internal.ads.zzlt zzq;

    public zzhz(int r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zza = r0
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzkm r3 = new com.google.android.gms.internal.ads.zzkm
            r3.<init>()
            r2.zzc = r3
            r0 = -9223372036854775808
            r2.zzm = r0
            com.google.android.gms.internal.ads.zzcc r3 = com.google.android.gms.internal.ads.zzcc.zza
            r2.zzp = r3
            return
    }

    private final void zzZ(long r2, boolean r4) throws com.google.android.gms.internal.ads.zzij {
            r1 = this;
            r0 = 0
            r1.zzn = r0
            r1.zzl = r2
            r1.zzm = r2
            r1.zzz(r2, r4)
            return
    }

    protected void zzA() {
            r0 = this;
            return
    }

    protected final void zzB() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzlt r1 = r2.zzq     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lb
            r1.zza(r2)
        Lb:
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    protected void zzC() {
            r0 = this;
            return
    }

    protected void zzD() throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            return
    }

    protected void zzE() {
            r0 = this;
            return
    }

    protected void zzF(com.google.android.gms.internal.ads.zzaf[] r1, long r2, long r4, com.google.android.gms.internal.ads.zzuy r6) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzG() {
            r1 = this;
            int r0 = r1.zzh
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r1.zzA()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzH(com.google.android.gms.internal.ads.zzaf[] r8, com.google.android.gms.internal.ads.zzwn r9, long r10, long r12, com.google.android.gms.internal.ads.zzuy r14) throws com.google.android.gms.internal.ads.zzij {
            r7 = this;
            boolean r0 = r7.zzn
            r0 = r0 ^ 1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r7.zzi = r9
            long r0 = r7.zzm
            r2 = -9223372036854775808
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L13
            r7.zzm = r10
        L13:
            r7.zzj = r8
            r7.zzk = r12
            r0 = r7
            r1 = r8
            r2 = r10
            r4 = r12
            r6 = r14
            r0.zzF(r1, r2, r4, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzI() {
            r2 = this;
            int r0 = r2.zzh
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            com.google.android.gms.internal.ads.zzkm r0 = r2.zzc
            r1 = 0
            r0.zzb = r1
            r0.zza = r1
            r2.zzC()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzJ(long r2) throws com.google.android.gms.internal.ads.zzij {
            r1 = this;
            r0 = 0
            r1.zzZ(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzK() {
            r1 = this;
            r0 = 1
            r1.zzn = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzL(com.google.android.gms.internal.ads.zzlt r2) {
            r1 = this;
            java.lang.Object r0 = r1.zza
            monitor-enter(r0)
            r1.zzq = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public /* synthetic */ void zzM(float r1, float r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzN(com.google.android.gms.internal.ads.zzcc r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcc r0 = r1.zzp
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto La
            r1.zzp = r2
        La:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzO() throws com.google.android.gms.internal.ads.zzij {
            r2 = this;
            int r0 = r2.zzh
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzf(r1)
            r0 = 2
            r2.zzh = r0
            r2.zzD()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzP() {
            r3 = this;
            int r0 = r3.zzh
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r3.zzh = r1
            r3.zzE()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final boolean zzQ() {
            r5 = this;
            long r0 = r5.zzm
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final boolean zzR() {
            r1 = this;
            boolean r0 = r1.zzn
            return r0
    }

    protected final boolean zzS() {
            r1 = this;
            boolean r0 = r1.zzQ()
            if (r0 == 0) goto L9
            boolean r0 = r1.zzn
            goto L12
        L9:
            com.google.android.gms.internal.ads.zzwn r0 = r1.zzi
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.zze()
        L12:
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzaf[] zzT() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaf[] r0 = r1.zzj
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlu
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final int zzcV() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }

    protected final int zzcW(com.google.android.gms.internal.ads.zzkm r7, com.google.android.gms.internal.ads.zzhq r8, int r9) {
            r6 = this;
            com.google.android.gms.internal.ads.zzwn r0 = r6.zzi
            java.util.Objects.requireNonNull(r0)
            int r9 = r0.zza(r7, r8, r9)
            r0 = -4
            if (r9 != r0) goto L2d
            boolean r7 = r8.zzf()
            if (r7 == 0) goto L1d
            r7 = -9223372036854775808
            r6.zzm = r7
            boolean r7 = r6.zzn
            if (r7 == 0) goto L1b
            return r0
        L1b:
            r7 = -3
            return r7
        L1d:
            long r0 = r8.zze
            long r2 = r6.zzk
            long r0 = r0 + r2
            r8.zze = r0
            long r7 = r6.zzm
            long r7 = java.lang.Math.max(r7, r0)
            r6.zzm = r7
            goto L51
        L2d:
            r8 = -5
            if (r9 != r8) goto L51
            com.google.android.gms.internal.ads.zzaf r0 = r7.zza
            java.util.Objects.requireNonNull(r0)
            long r1 = r0.zzs
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L51
            com.google.android.gms.internal.ads.zzad r9 = r0.zzb()
            long r3 = r6.zzk
            long r1 = r1 + r3
            r9.zzad(r1)
            com.google.android.gms.internal.ads.zzaf r9 = r9.zzaf()
            r7.zza = r9
            return r8
        L51:
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final long zzcX() {
            r2 = this;
            long r0 = r2.zzm
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzij zzcY(java.lang.Throwable r10, com.google.android.gms.internal.ads.zzaf r11, boolean r12, int r13) {
            r9 = this;
            r0 = 4
            if (r11 == 0) goto L1b
            boolean r1 = r9.zzo
            if (r1 != 0) goto L1b
            r1 = 1
            r9.zzo = r1
            r1 = 0
            int r0 = r9.zzY(r11)     // Catch: java.lang.Throwable -> L15 com.google.android.gms.internal.ads.zzij -> L19
            r0 = r0 & 7
            r9.zzo = r1
            r6 = r0
            goto L1c
        L15:
            r10 = move-exception
            r9.zzo = r1
            throw r10
        L19:
            r9.zzo = r1
        L1b:
            r6 = 4
        L1c:
            java.lang.String r3 = r9.zzU()
            int r4 = r9.zze
            r2 = r10
            r5 = r11
            r7 = r12
            r8 = r13
            com.google.android.gms.internal.ads.zzij r10 = com.google.android.gms.internal.ads.zzij.zzb(r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    protected final int zzd(long r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzwn r0 = r3.zzi
            java.util.Objects.requireNonNull(r0)
            long r1 = r3.zzk
            long r4 = r4 - r1
            int r4 = r0.zzb(r4)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public int zze() throws com.google.android.gms.internal.ads.zzij {
            r1 = this;
            r0 = 0
            return r0
    }

    protected final long zzf() {
            r2 = this;
            long r0 = r2.zzl
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzcc zzh() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcc r0 = r1.zzp
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzdj zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdj r0 = r1.zzg
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzkm zzk() {
            r2 = this;
            com.google.android.gms.internal.ads.zzkm r0 = r2.zzc
            r1 = 0
            r0.zzb = r1
            r0.zza = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public com.google.android.gms.internal.ads.zzkt zzl() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final com.google.android.gms.internal.ads.zzlu zzm() {
            r0 = this;
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzlv zzn() {
            r1 = this;
            com.google.android.gms.internal.ads.zzlv r0 = r1.zzd
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzom zzo() {
            r1 = this;
            com.google.android.gms.internal.ads.zzom r0 = r1.zzf
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final com.google.android.gms.internal.ads.zzwn zzp() {
            r1 = this;
            com.google.android.gms.internal.ads.zzwn r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzq() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            r1 = 0
            r2.zzq = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzr() {
            r3 = this;
            int r0 = r3.zzh
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            com.google.android.gms.internal.ads.zzdi.zzf(r1)
            com.google.android.gms.internal.ads.zzkm r0 = r3.zzc
            r1 = 0
            r0.zzb = r1
            r0.zza = r1
            r3.zzh = r2
            r3.zzi = r1
            r3.zzj = r1
            r3.zzn = r2
            r3.zzx()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzs(com.google.android.gms.internal.ads.zzlv r11, com.google.android.gms.internal.ads.zzaf[] r12, com.google.android.gms.internal.ads.zzwn r13, long r14, boolean r16, boolean r17, long r18, long r20, com.google.android.gms.internal.ads.zzuy r22) throws com.google.android.gms.internal.ads.zzij {
            r10 = this;
            r8 = r10
            r9 = r16
            int r0 = r8.zzh
            r1 = 1
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r0 = r11
            r8.zzd = r0
            r8.zzh = r1
            r0 = r17
            r10.zzy(r9, r0)
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r18
            r5 = r20
            r7 = r22
            r0.zzH(r1, r2, r3, r5, r7)
            r0 = r18
            r10.zzZ(r0, r9)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public /* synthetic */ void zzt() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public void zzu(int r1, java.lang.Object r2) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzv(int r1, com.google.android.gms.internal.ads.zzom r2, com.google.android.gms.internal.ads.zzdj r3) {
            r0 = this;
            r0.zze = r1
            r0.zzf = r2
            r0.zzg = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzw() throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzwn r0 = r1.zzi
            java.util.Objects.requireNonNull(r0)
            r0.zzd()
            return
    }

    protected void zzx() {
            r1 = this;
            r0 = 0
            throw r0
    }

    protected void zzy(boolean r1, boolean r2) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            return
    }

    protected void zzz(long r1, boolean r3) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            r1 = 0
            throw r1
    }
}
