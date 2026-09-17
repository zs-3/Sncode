package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcew extends com.google.android.gms.internal.ads.zzcca implements com.google.android.gms.internal.ads.zzhh, com.google.android.gms.internal.ads.zzmd {
    public static final /* synthetic */ int zza = 0;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzceh zzc;
    private final com.google.android.gms.internal.ads.zzyj zzd;
    private final com.google.android.gms.internal.ads.zzcci zze;
    private final java.lang.ref.WeakReference zzf;
    private final com.google.android.gms.internal.ads.zzwc zzg;
    private com.google.android.gms.internal.ads.zziu zzh;
    private java.nio.ByteBuffer zzi;
    private boolean zzj;
    private com.google.android.gms.internal.ads.zzcbz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final java.lang.String zzo;
    private final int zzp;
    private final java.lang.Object zzq;
    private java.lang.Integer zzr;
    private final java.util.ArrayList zzs;
    private volatile com.google.android.gms.internal.ads.zzcej zzt;
    private final java.util.Set zzu;

    public zzcew(android.content.Context r4, com.google.android.gms.internal.ads.zzcci r5, com.google.android.gms.internal.ads.zzccj r6, java.lang.Integer r7) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzq = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.zzu = r0
            r3.zzb = r4
            r3.zze = r5
            r3.zzr = r7
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r6)
            r3.zzf = r7
            com.google.android.gms.internal.ads.zzceh r7 = new com.google.android.gms.internal.ads.zzceh
            r7.<init>()
            r3.zzc = r7
            com.google.android.gms.internal.ads.zzyj r0 = new com.google.android.gms.internal.ads.zzyj
            r0.<init>(r4)
            r3.zzd = r0
            boolean r1 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r1 == 0) goto L3f
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "SimpleExoPlayerAdapter initialize "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zza(r1)
        L3f:
            java.util.concurrent.atomic.AtomicInteger r1 = com.google.android.gms.internal.ads.zzcca.zzD()
            r1.incrementAndGet()
            com.google.android.gms.internal.ads.zzlx r1 = new com.google.android.gms.internal.ads.zzlx
            com.google.android.gms.internal.ads.zzcet r2 = new com.google.android.gms.internal.ads.zzcet
            r2.<init>(r3)
            r1.<init>(r4, r2)
            r1.zzb(r0)
            r1.zza(r7)
            com.google.android.gms.internal.ads.zzly r7 = r1.zzc()
            r3.zzh = r7
            r7.zzy(r3)
            r7 = 0
            r3.zzl = r7
            r0 = 0
            r3.zzn = r0
            r3.zzm = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.zzs = r0
            r0 = 0
            r3.zzt = r0
            if (r6 == 0) goto L78
            java.lang.String r0 = r6.zzr()
        L78:
            com.google.android.gms.internal.ads.zzfxx r0 = com.google.android.gms.internal.ads.zzfxx.zzd(r0)
            java.lang.String r1 = ""
            java.lang.Object r0 = r0.zzb(r1)
            java.lang.String r0 = (java.lang.String) r0
            r3.zzo = r0
            if (r6 == 0) goto L8d
            int r0 = r6.zzf()
            goto L8e
        L8d:
            r0 = 0
        L8e:
            r3.zzp = r0
            com.google.android.gms.internal.ads.zzwc r0 = new com.google.android.gms.internal.ads.zzwc
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = r6.zzn()
            java.lang.String r6 = r6.afmaVersion
            java.lang.String r4 = r1.zzc(r4, r6)
            boolean r6 = r3.zzj
            if (r6 == 0) goto Lc0
            java.nio.ByteBuffer r6 = r3.zzi
            int r6 = r6.limit()
            if (r6 <= 0) goto Lc0
            java.nio.ByteBuffer r4 = r3.zzi
            int r4 = r4.limit()
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r5 = r3.zzi
            r5.get(r4)
            com.google.android.gms.internal.ads.zzcel r5 = new com.google.android.gms.internal.ads.zzcel
            r5.<init>(r4)
            goto L12c
        Lc0:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzcb
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r1.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1 = 1
            if (r6 == 0) goto Le5
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r2.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto Le9
        Le5:
            boolean r6 = r5.zzi
            if (r6 != 0) goto Lea
        Le9:
            r7 = 1
        Lea:
            boolean r6 = r5.zzl
            if (r6 == 0) goto Lf4
            com.google.android.gms.internal.ads.zzcen r6 = new com.google.android.gms.internal.ads.zzcen
            r6.<init>(r3, r4, r7)
            goto L103
        Lf4:
            int r6 = r5.zzh
            if (r6 <= 0) goto Lfe
            com.google.android.gms.internal.ads.zzceo r6 = new com.google.android.gms.internal.ads.zzceo
            r6.<init>(r3, r4, r7)
            goto L103
        Lfe:
            com.google.android.gms.internal.ads.zzcep r6 = new com.google.android.gms.internal.ads.zzcep
            r6.<init>(r3, r4, r7)
        L103:
            boolean r4 = r5.zzi
            if (r4 == 0) goto L10e
            com.google.android.gms.internal.ads.zzceq r4 = new com.google.android.gms.internal.ads.zzceq
            r4.<init>(r3, r6)
            r5 = r4
            goto L10f
        L10e:
            r5 = r6
        L10f:
            java.nio.ByteBuffer r4 = r3.zzi
            if (r4 == 0) goto L12c
            int r4 = r4.limit()
            if (r4 <= 0) goto L12c
            java.nio.ByteBuffer r4 = r3.zzi
            int r4 = r4.limit()
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r6 = r3.zzi
            r6.get(r4)
            com.google.android.gms.internal.ads.zzcer r6 = new com.google.android.gms.internal.ads.zzcer
            r6.<init>(r5, r4)
            r5 = r6
        L12c:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzl
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r6.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L144
            com.google.android.gms.internal.ads.zzcev r4 = new com.google.android.gms.internal.ads.zzcev
            r4.<init>()
            goto L149
        L144:
            com.google.android.gms.internal.ads.zzcem r4 = new com.google.android.gms.internal.ads.zzcem
            r4.<init>()
        L149:
            com.google.android.gms.internal.ads.zzwb r6 = new com.google.android.gms.internal.ads.zzwb
            r6.<init>(r4)
            r0.<init>(r5, r6)
            r3.zzg = r0
            return
    }

    private final boolean zzad() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcej r0 = r1.zzt
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzcej r0 = r1.zzt
            boolean r0 = r0.zzq()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final void finalize() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.ads.zzcca.zzD()
            r0.decrementAndGet()
            boolean r0 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "SimpleExoPlayerAdapter finalize "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
        L1a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzA() {
            r2 = this;
            boolean r0 = r2.zzad()
            if (r0 != 0) goto La
            int r0 = r2.zzl
            long r0 = (long) r0
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzB() {
            r10 = this;
            boolean r0 = r10.zzad()
            if (r0 != 0) goto L7b
            java.lang.Object r0 = r10.zzq
            monitor-enter(r0)
        L9:
            java.util.ArrayList r1 = r10.zzs     // Catch: java.lang.Throwable -> L78
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L74
            long r1 = r10.zzn     // Catch: java.lang.Throwable -> L78
            java.util.ArrayList r3 = r10.zzs     // Catch: java.lang.Throwable -> L78
            r4 = 0
            java.lang.Object r3 = r3.remove(r4)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzhc r3 = (com.google.android.gms.internal.ads.zzhc) r3     // Catch: java.lang.Throwable -> L78
            java.util.Map r3 = r3.zze()     // Catch: java.lang.Throwable -> L78
            r5 = 0
            if (r3 == 0) goto L70
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L78
        L2c:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r7 == 0) goto L70
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L78
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L78
            if (r7 == 0) goto L2c
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            if (r8 == 0) goto L2c
            java.lang.String r8 = "content-length"
            java.lang.Object r9 = r7.getKey()     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            boolean r8 = com.google.android.gms.internal.ads.zzfxi.zzc(r8, r9)     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            if (r8 == 0) goto L2c
            java.lang.Object r8 = r7.getValue()     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            if (r8 == 0) goto L2c
            java.lang.Object r8 = r7.getValue()     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            java.lang.Object r8 = r8.get(r4)     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            if (r8 == 0) goto L2c
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
            long r5 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L2c java.lang.Throwable -> L78
        L70:
            long r1 = r1 + r5
            r10.zzn = r1     // Catch: java.lang.Throwable -> L78
            goto L9
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            long r0 = r10.zzn
            return r0
        L78:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            throw r1
        L7b:
            com.google.android.gms.internal.ads.zzcej r0 = r10.zzt
            long r0 = r0.zzl()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final java.lang.Integer zzC() {
            r1 = this;
            java.lang.Integer r0 = r1.zzr
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzF(android.net.Uri[] r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r2.zzG(r3, r4, r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzG(android.net.Uri[] r2, java.lang.String r3, java.nio.ByteBuffer r4, boolean r5) {
            r1 = this;
            com.google.android.gms.internal.ads.zziu r3 = r1.zzh
            if (r3 == 0) goto L40
            r1.zzi = r4
            r1.zzj = r5
            int r3 = r2.length
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L14
            r2 = r2[r5]
            com.google.android.gms.internal.ads.zzva r2 = r1.zzaa(r2)
            goto L2f
        L14:
            com.google.android.gms.internal.ads.zzva[] r3 = new com.google.android.gms.internal.ads.zzva[r3]
            r4 = 0
        L17:
            int r0 = r2.length
            if (r4 >= r0) goto L25
            r0 = r2[r4]
            com.google.android.gms.internal.ads.zzva r0 = r1.zzaa(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L17
        L25:
            com.google.android.gms.internal.ads.zzvn r2 = new com.google.android.gms.internal.ads.zzvn
            com.google.android.gms.internal.ads.zzuj r4 = new com.google.android.gms.internal.ads.zzuj
            r4.<init>()
            r2.<init>(r5, r5, r4, r3)
        L2f:
            com.google.android.gms.internal.ads.zziu r3 = r1.zzh
            r3.zzB(r2)
            com.google.android.gms.internal.ads.zziu r2 = r1.zzh
            r2.zzp()
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.zzcca.zzE()
            r2.incrementAndGet()
        L40:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzH() {
            r1 = this;
            com.google.android.gms.internal.ads.zziu r0 = r1.zzh
            if (r0 == 0) goto L16
            r0.zzA(r1)
            com.google.android.gms.internal.ads.zziu r0 = r1.zzh
            r0.zzz()
            r0 = 0
            r1.zzh = r0
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.ads.zzcca.zzE()
            r0.decrementAndGet()
        L16:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzI(long r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zziu r0 = r7.zzh
            r1 = r0
            com.google.android.gms.internal.ads.zzj r1 = (com.google.android.gms.internal.ads.zzj) r1
            int r2 = r1.zzd()
            r5 = 5
            r6 = 0
            r3 = r8
            r1.zza(r2, r3, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzJ(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzceh r0 = r1.zzc
            r0.zzk(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzK(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzceh r0 = r1.zzc
            r0.zzl(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzL(com.google.android.gms.internal.ads.zzcbz r1) {
            r0 = this;
            r0.zzk = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzM(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzceh r0 = r1.zzc
            r0.zzm(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzN(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzceh r0 = r1.zzc
            r0.zzn(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzO(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zziu r0 = r1.zzh
            r0.zzq(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzP(java.lang.Integer r1) {
            r0 = this;
            r0.zzr = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzQ(boolean r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zziu r0 = r4.zzh
            if (r0 == 0) goto L22
            r0 = 0
        L5:
            com.google.android.gms.internal.ads.zziu r1 = r4.zzh
            r1.zzx()
            r1 = 2
            if (r0 >= r1) goto L22
            com.google.android.gms.internal.ads.zzyj r1 = r4.zzd
            com.google.android.gms.internal.ads.zzxy r2 = r1.zzf()
            com.google.android.gms.internal.ads.zzxw r2 = r2.zzc()
            r3 = r5 ^ 1
            r2.zzp(r0, r3)
            r1.zzl(r2)
            int r0 = r0 + 1
            goto L5
        L22:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzR(int r3) {
            r2 = this;
            java.util.Set r0 = r2.zzu
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.zzceg r1 = (com.google.android.gms.internal.ads.zzceg) r1
            if (r1 == 0) goto L6
            r1.zzm(r3)
            goto L6
        L1e:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzS(android.view.Surface r1, boolean r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zziu r2 = r0.zzh
            if (r2 == 0) goto L7
            r2.zzr(r1)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzT(float r1, boolean r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zziu r2 = r0.zzh
            if (r2 == 0) goto L7
            r2.zzs(r1)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzU() {
            r1 = this;
            com.google.android.gms.internal.ads.zziu r0 = r1.zzh
            r0.zzt()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final boolean zzV() {
            r1 = this;
            com.google.android.gms.internal.ads.zziu r0 = r1.zzh
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgg zzW(java.lang.String r11, boolean r12) {
            r10 = this;
            r0 = 1
            if (r0 == r12) goto L6
            r12 = 0
            r2 = r12
            goto L7
        L6:
            r2 = r10
        L7:
            com.google.android.gms.internal.ads.zzcci r12 = r10.zze
            com.google.android.gms.internal.ads.zzcez r9 = new com.google.android.gms.internal.ads.zzcez
            int r3 = r12.zzd
            int r4 = r12.zze
            long r5 = r12.zzm
            long r7 = r12.zzn
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return r9
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgg zzX(java.lang.String r8, boolean r9) {
            r7 = this;
            r0 = 1
            if (r0 == r9) goto L6
            r9 = 0
            r2 = r9
            goto L7
        L6:
            r2 = r7
        L7:
            com.google.android.gms.internal.ads.zzcci r9 = r7.zze
            com.google.android.gms.internal.ads.zzceg r6 = new com.google.android.gms.internal.ads.zzceg
            int r3 = r9.zzd
            int r4 = r9.zze
            int r5 = r9.zzh
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r6)
            java.util.Set r9 = r7.zzu
            r9.add(r8)
            return r6
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgg zzY(java.lang.String r2, boolean r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgp r0 = new com.google.android.gms.internal.ads.zzgp
            r0.<init>()
            r0.zzf(r2)
            r2 = 1
            if (r2 == r3) goto Ld
            r3 = 0
            goto Le
        Ld:
            r3 = r1
        Le:
            r0.zze(r3)
            com.google.android.gms.internal.ads.zzcci r3 = r1.zze
            int r3 = r3.zzd
            r0.zzc(r3)
            com.google.android.gms.internal.ads.zzcci r3 = r1.zze
            int r3 = r3.zze
            r0.zzd(r3)
            r0.zzb(r2)
            com.google.android.gms.internal.ads.zzgu r2 = r0.zzg()
            return r2
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgg zzZ(com.google.android.gms.internal.ads.zzgf r9) {
            r8 = this;
            com.google.android.gms.internal.ads.zzcej r7 = new com.google.android.gms.internal.ads.zzcej
            com.google.android.gms.internal.ads.zzgg r2 = r9.zza()
            com.google.android.gms.internal.ads.zzceu r6 = new com.google.android.gms.internal.ads.zzceu
            r6.<init>(r8)
            java.lang.String r3 = r8.zzo
            int r4 = r8.zzp
            android.content.Context r1 = r8.zzb
            r0 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zza(com.google.android.gms.internal.ads.zzgg r1, com.google.android.gms.internal.ads.zzgm r2, boolean r3, int r4) {
            r0 = this;
            int r1 = r0.zzl
            int r1 = r1 + r4
            r0.zzl = r1
            return
    }

    final com.google.android.gms.internal.ads.zzva zzaa(android.net.Uri r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzam r0 = new com.google.android.gms.internal.ads.zzam
            r0.<init>()
            r0.zzb(r3)
            com.google.android.gms.internal.ads.zzbc r3 = r0.zzc()
            com.google.android.gms.internal.ads.zzwc r0 = r2.zzg
            com.google.android.gms.internal.ads.zzcci r1 = r2.zze
            int r1 = r1.zzf
            r0.zza(r1)
            com.google.android.gms.internal.ads.zzwe r3 = r0.zzb(r3)
            return r3
    }

    final /* synthetic */ void zzab(boolean r2, long r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbz r0 = r1.zzk
            if (r0 == 0) goto L7
            r0.zzi(r2, r3)
        L7:
            return
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzlr[] zzac(android.os.Handler r22, com.google.android.gms.internal.ads.zzabq r23, com.google.android.gms.internal.ads.zzpr r24, com.google.android.gms.internal.ads.zzxb r25, com.google.android.gms.internal.ads.zztw r26) {
            r21 = this;
            r0 = r21
            com.google.android.gms.internal.ads.zzri r9 = new com.google.android.gms.internal.ads.zzri
            com.google.android.gms.internal.ads.zztg r13 = com.google.android.gms.internal.ads.zztg.zza
            com.google.android.gms.internal.ads.zzqo r1 = new com.google.android.gms.internal.ads.zzqo
            android.content.Context r2 = r0.zzb
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzrc r8 = r1.zzc()
            com.google.android.gms.internal.ads.zzsl r3 = new com.google.android.gms.internal.ads.zzsl
            r3.<init>(r2)
            r5 = 0
            r1 = r9
            r4 = r13
            r6 = r22
            r7 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.ads.zzaas r1 = new com.google.android.gms.internal.ads.zzaas
            android.content.Context r11 = r0.zzb
            com.google.android.gms.internal.ads.zzsl r12 = new com.google.android.gms.internal.ads.zzsl
            r12.<init>(r11)
            r14 = 0
            r16 = 0
            r19 = -1
            r20 = 1106247680(0x41f00000, float:30.0)
            r10 = r1
            r17 = r22
            r18 = r23
            r10.<init>(r11, r12, r13, r14, r16, r17, r18, r19, r20)
            r2 = 2
            com.google.android.gms.internal.ads.zzlr[] r2 = new com.google.android.gms.internal.ads.zzlr[r2]
            r3 = 0
            r2[r3] = r9
            r3 = 1
            r2[r3] = r1
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzb(com.google.android.gms.internal.ads.zzgg r1, com.google.android.gms.internal.ads.zzgm r2, boolean r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzc(com.google.android.gms.internal.ads.zzgg r1, com.google.android.gms.internal.ads.zzgm r2, boolean r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzd(com.google.android.gms.internal.ads.zzgg r2, com.google.android.gms.internal.ads.zzgm r3, boolean r4) {
            r1 = this;
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzhc
            if (r3 == 0) goto L13
            java.lang.Object r3 = r1.zzq
            monitor-enter(r3)
            java.util.ArrayList r4 = r1.zzs     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzhc r2 = (com.google.android.gms.internal.ads.zzhc) r2     // Catch: java.lang.Throwable -> L10
            r4.add(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r2
        L13:
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzcej
            if (r3 == 0) goto L6c
            com.google.android.gms.internal.ads.zzcej r2 = (com.google.android.gms.internal.ads.zzcej) r2
            r1.zzt = r2
            java.lang.ref.WeakReference r2 = r1.zzf
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.zzccj r2 = (com.google.android.gms.internal.ads.zzccj) r2
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6c
            if (r2 == 0) goto L6c
            com.google.android.gms.internal.ads.zzcej r3 = r1.zzt
            boolean r3 = r3.zzn()
            if (r3 == 0) goto L6c
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.google.android.gms.internal.ads.zzcej r4 = r1.zzt
            boolean r4 = r4.zzp()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "gcacheHit"
            r3.put(r0, r4)
            com.google.android.gms.internal.ads.zzcej r4 = r1.zzt
            boolean r4 = r4.zzo()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "gcacheDownloaded"
            r3.put(r0, r4)
            com.google.android.gms.internal.ads.zzfun r4 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzces r0 = new com.google.android.gms.internal.ads.zzces
            r0.<init>(r2, r3)
            r4.post(r0)
        L6c:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zze(com.google.android.gms.internal.ads.zzmb r3, com.google.android.gms.internal.ads.zzaf r4, com.google.android.gms.internal.ads.zzib r5) {
            r2 = this;
            java.lang.ref.WeakReference r3 = r2.zzf
            java.lang.Object r3 = r3.get()
            com.google.android.gms.internal.ads.zzccj r3 = (com.google.android.gms.internal.ads.zzccj) r3
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r0.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L41
            if (r3 == 0) goto L41
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r0 = r4.zzm
            if (r0 == 0) goto L2a
            java.lang.String r1 = "audioMime"
            r5.put(r1, r0)
        L2a:
            java.lang.String r0 = r4.zzn
            if (r0 == 0) goto L33
            java.lang.String r1 = "audioSampleMime"
            r5.put(r1, r0)
        L33:
            java.lang.String r4 = r4.zzj
            if (r4 == 0) goto L3c
            java.lang.String r0 = "audioCodec"
            r5.put(r0, r4)
        L3c:
            java.lang.String r4 = "onMetadataEvent"
            r3.zzd(r4, r5)
        L41:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzmb r1, int r2, long r3, long r5) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzmb r1, com.google.android.gms.internal.ads.zzuu r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzh(com.google.android.gms.internal.ads.zzmb r1, int r2, long r3) {
            r0 = this;
            int r1 = r0.zzm
            int r1 = r1 + r2
            r0.zzm = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzbw r1, com.google.android.gms.internal.ads.zzmc r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzj(com.google.android.gms.internal.ads.zzmb r1, com.google.android.gms.internal.ads.zzup r2, com.google.android.gms.internal.ads.zzuu r3, java.io.IOException r4, boolean r5) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcbz r1 = r0.zzk
            if (r1 == 0) goto L15
            com.google.android.gms.internal.ads.zzcci r2 = r0.zze
            boolean r2 = r2.zzj
            if (r2 == 0) goto L10
            java.lang.String r2 = "onLoadException"
            r1.zzl(r2, r4)
            return
        L10:
            java.lang.String r2 = "onLoadError"
            r1.zzk(r2, r4)
        L15:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzk(com.google.android.gms.internal.ads.zzmb r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcbz r1 = r0.zzk
            if (r1 == 0) goto L7
            r1.zzm(r2)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzl(com.google.android.gms.internal.ads.zzmb r2, com.google.android.gms.internal.ads.zzbp r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbz r2 = r1.zzk
            if (r2 == 0) goto L9
            java.lang.String r0 = "onPlayerError"
            r2.zzk(r0, r3)
        L9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzmb r1, com.google.android.gms.internal.ads.zzbv r2, com.google.android.gms.internal.ads.zzbv r3, int r4) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzn(com.google.android.gms.internal.ads.zzmb r1, java.lang.Object r2, long r3) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcbz r1 = r0.zzk
            if (r1 == 0) goto L7
            r1.zzv()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzmb r1, com.google.android.gms.internal.ads.zzia r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzp(com.google.android.gms.internal.ads.zzmb r4, com.google.android.gms.internal.ads.zzaf r5, com.google.android.gms.internal.ads.zzib r6) {
            r3 = this;
            java.lang.ref.WeakReference r4 = r3.zzf
            java.lang.Object r4 = r4.get()
            com.google.android.gms.internal.ads.zzccj r4 = (com.google.android.gms.internal.ads.zzccj) r4
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L74
            if (r4 == 0) goto L74
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            float r0 = r5.zzv
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "frameRate"
            r6.put(r1, r0)
            int r0 = r5.zzi
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "bitRate"
            r6.put(r1, r0)
            int r0 = r5.zzt
            int r1 = r5.zzu
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "resolution"
            r6.put(r1, r0)
            java.lang.String r0 = r5.zzm
            if (r0 == 0) goto L5d
            java.lang.String r1 = "videoMime"
            r6.put(r1, r0)
        L5d:
            java.lang.String r0 = r5.zzn
            if (r0 == 0) goto L66
            java.lang.String r1 = "videoSampleMime"
            r6.put(r1, r0)
        L66:
            java.lang.String r5 = r5.zzj
            if (r5 == 0) goto L6f
            java.lang.String r0 = "videoCodec"
            r6.put(r0, r5)
        L6f:
            java.lang.String r5 = "onMetadataEvent"
            r4.zzd(r5, r6)
        L74:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzq(com.google.android.gms.internal.ads.zzmb r2, com.google.android.gms.internal.ads.zzcp r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbz r2 = r1.zzk
            if (r2 == 0) goto Lb
            int r0 = r3.zzb
            int r3 = r3.zzc
            r2.zzD(r0, r3)
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzr() {
            r1 = this;
            int r0 = r1.zzm
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzt() {
            r1 = this;
            com.google.android.gms.internal.ads.zziu r0 = r1.zzh
            int r0 = r0.zzf()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzv() {
            r2 = this;
            com.google.android.gms.internal.ads.zziu r0 = r2.zzh
            long r0 = r0.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzw() {
            r2 = this;
            int r0 = r2.zzl
            long r0 = (long) r0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzx() {
            r4 = this;
            boolean r0 = r4.zzad()
            if (r0 != 0) goto L7
            goto L1d
        L7:
            com.google.android.gms.internal.ads.zzcej r0 = r4.zzt
            boolean r0 = r0.zzp()
            if (r0 == 0) goto L1d
            int r0 = r4.zzl
            long r0 = (long) r0
            com.google.android.gms.internal.ads.zzcej r2 = r4.zzt
            long r2 = r2.zzk()
            long r0 = java.lang.Math.min(r0, r2)
            return r0
        L1d:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzy() {
            r2 = this;
            com.google.android.gms.internal.ads.zziu r0 = r2.zzh
            long r0 = r0.zzk()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzz() {
            r2 = this;
            com.google.android.gms.internal.ads.zziu r0 = r2.zzh
            long r0 = r0.zzl()
            return r0
    }
}
