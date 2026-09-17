package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzflr implements com.google.android.gms.internal.ads.zzflp {
    private final android.content.Context zza;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private int zze;
    private java.lang.String zzf;
    private java.lang.String zzg;
    private java.lang.String zzh;
    private java.lang.String zzi;
    private com.google.android.gms.internal.ads.zzfmg zzj;
    private java.lang.String zzk;
    private java.lang.String zzl;
    private java.lang.String zzm;
    private boolean zzn;
    private boolean zzo;
    private final int zzp;
    private int zzq;
    private int zzr;

    zzflr(android.content.Context r4, int r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.zzb = r0
            r0 = -1
            r3.zzc = r0
            r0 = 0
            r3.zzd = r0
            r1 = 2
            r3.zzq = r1
            r3.zzr = r1
            r3.zze = r0
            java.lang.String r1 = ""
            r3.zzf = r1
            r3.zzg = r1
            r3.zzh = r1
            r3.zzi = r1
            com.google.android.gms.internal.ads.zzfmg r2 = com.google.android.gms.internal.ads.zzfmg.zzb
            r3.zzj = r2
            r3.zzk = r1
            r3.zzl = r1
            r3.zzm = r1
            r3.zzn = r0
            r3.zzo = r0
            r3.zza = r4
            r3.zzp = r5
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfmg zzB(com.google.android.gms.internal.ads.zzflr r0) {
            com.google.android.gms.internal.ads.zzfmg r0 = r0.zzj
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzC(com.google.android.gms.internal.ads.zzflr r0) {
            java.lang.String r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzD(com.google.android.gms.internal.ads.zzflr r0) {
            java.lang.String r0 = r0.zzm
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzE(com.google.android.gms.internal.ads.zzflr r0) {
            java.lang.String r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzF(com.google.android.gms.internal.ads.zzflr r0) {
            java.lang.String r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzG(com.google.android.gms.internal.ads.zzflr r0) {
            java.lang.String r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzH(com.google.android.gms.internal.ads.zzflr r0) {
            java.lang.String r0 = r0.zzl
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzI(com.google.android.gms.internal.ads.zzflr r0) {
            java.lang.String r0 = r0.zzk
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzJ(com.google.android.gms.internal.ads.zzflr r0) {
            boolean r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ int zzL(com.google.android.gms.internal.ads.zzflr r0) {
            int r0 = r0.zzp
            return r0
    }

    static /* bridge */ /* synthetic */ int zzM(com.google.android.gms.internal.ads.zzflr r0) {
            int r0 = r0.zzq
            return r0
    }

    static /* bridge */ /* synthetic */ int zzN(com.google.android.gms.internal.ads.zzflr r0) {
            int r0 = r0.zzr
            return r0
    }

    static /* bridge */ /* synthetic */ int zzo(com.google.android.gms.internal.ads.zzflr r0) {
            int r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ long zzp(com.google.android.gms.internal.ads.zzflr r2) {
            long r0 = r2.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ long zzq(com.google.android.gms.internal.ads.zzflr r2) {
            long r0 = r2.zzc
            return r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzA() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> Ld
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> Ld
            r2.zzc = r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r2
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzK(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzq = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zza(com.google.android.gms.ads.internal.client.zze r1) {
            r0 = this;
            r0.zzr(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zzb(com.google.android.gms.internal.ads.zzfgs r1) {
            r0 = this;
            r0.zzs(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zzc(java.lang.String r1) {
            r0 = this;
            r0.zzt(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zzd(java.lang.String r1) {
            r0 = this;
            r0.zzu(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zze(java.lang.String r1) {
            r0 = this;
            r0.zzv(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zzf(com.google.android.gms.internal.ads.zzfmg r1) {
            r0 = this;
            r0.zzw(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zzg(boolean r1) {
            r0 = this;
            r0.zzx(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zzh(java.lang.Throwable r1) {
            r0 = this;
            r0.zzy(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zzi() {
            r0 = this;
            r0.zzz()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zzj() {
            r0 = this;
            r0.zzA()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final synchronized boolean zzk() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzo     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final boolean zzl() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final synchronized com.google.android.gms.internal.ads.zzflt zzm() {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.zzn     // Catch: java.lang.Throwable -> L24
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r6)
            return r1
        L8:
            r0 = 1
            r6.zzn = r0     // Catch: java.lang.Throwable -> L24
            boolean r0 = r6.zzo     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L12
            r6.zzz()     // Catch: java.lang.Throwable -> L24
        L12:
            long r2 = r6.zzc     // Catch: java.lang.Throwable -> L24
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r6.zzA()     // Catch: java.lang.Throwable -> L24
        L1d:
            com.google.android.gms.internal.ads.zzflt r0 = new com.google.android.gms.internal.ads.zzflt     // Catch: java.lang.Throwable -> L24
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r6)
            return r0
        L24:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzflp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzflp zzn(int r1) {
            r0 = this;
            r0.zzK(r1)
            return r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzr(com.google.android.gms.ads.internal.client.zze r3) {
            r2 = this;
            monitor-enter(r2)
            android.os.IBinder r3 = r3.zze     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L6
            goto L20
        L6:
            com.google.android.gms.internal.ads.zzcxt r3 = (com.google.android.gms.internal.ads.zzcxt) r3     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r3.zzk()     // Catch: java.lang.Throwable -> L22
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L14
            r2.zzf = r0     // Catch: java.lang.Throwable -> L22
        L14:
            java.lang.String r3 = r3.zzi()     // Catch: java.lang.Throwable -> L22
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L20
            r2.zzg = r3     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r2)
            return r2
        L22:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzs(com.google.android.gms.internal.ads.zzfgs r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfgk r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzfgk r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzfgh r0 = (com.google.android.gms.internal.ads.zzfgh) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzab     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzab     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzt(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzis     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L15
            r2.zzm = r3     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r2)
            return r2
        L17:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzu(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzh = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzv(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzi = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzw(com.google.android.gms.internal.ads.zzfmg r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzj = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzx(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzd = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzy(java.lang.Throwable r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzis     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L39
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L37
            java.lang.String r0 = com.google.android.gms.internal.ads.zzbup.zzf(r3)     // Catch: java.lang.Throwable -> L39
            r2.zzl = r0     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = com.google.android.gms.internal.ads.zzbup.zze(r3)     // Catch: java.lang.Throwable -> L39
            r0 = 10
            com.google.android.gms.internal.ads.zzfxn r0 = com.google.android.gms.internal.ads.zzfxn.zzc(r0)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzfym r0 = com.google.android.gms.internal.ads.zzfym.zzb(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.Iterable r3 = r0.zzc(r3)     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L39
            r2.zzk = r3     // Catch: java.lang.Throwable -> L39
        L37:
            monitor-exit(r2)
            return r2
        L39:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized com.google.android.gms.internal.ads.zzflr zzz() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.util.zzab r0 = com.google.android.gms.ads.internal.zzu.zzq()     // Catch: java.lang.Throwable -> L36
            android.content.Context r1 = r2.zza     // Catch: java.lang.Throwable -> L36
            int r0 = r0.zzm(r1)     // Catch: java.lang.Throwable -> L36
            r2.zze = r0     // Catch: java.lang.Throwable -> L36
            android.content.Context r0 = r2.zza     // Catch: java.lang.Throwable -> L36
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L36
            r1 = 2
            if (r0 != 0) goto L17
            goto L25
        L17:
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L1e
            goto L25
        L1e:
            int r0 = r0.orientation     // Catch: java.lang.Throwable -> L36
            if (r0 != r1) goto L24
            r1 = 4
            goto L25
        L24:
            r1 = 3
        L25:
            r2.zzr = r1     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L36
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L36
            r2.zzb = r0     // Catch: java.lang.Throwable -> L36
            r0 = 1
            r2.zzo = r0     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)
            return r2
        L36:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
