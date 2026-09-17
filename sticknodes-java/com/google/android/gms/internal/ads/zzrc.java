package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzrc implements com.google.android.gms.internal.ads.zzpy {
    private static final java.lang.Object zza = null;
    private static java.util.concurrent.ScheduledExecutorService zzb;
    private static int zzc;
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private long zzI;
    private float zzJ;
    private java.nio.ByteBuffer zzK;
    private int zzL;
    private java.nio.ByteBuffer zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private com.google.android.gms.internal.ads.zzi zzS;
    private com.google.android.gms.internal.ads.zzpa zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private android.os.Looper zzX;
    private long zzY;
    private long zzZ;
    private android.os.Handler zzaa;
    private final com.google.android.gms.internal.ads.zzqq zzab;
    private final com.google.android.gms.internal.ads.zzqg zzac;
    private final android.content.Context zzd;
    private final com.google.android.gms.internal.ads.zzqd zze;
    private final com.google.android.gms.internal.ads.zzrm zzf;
    private final com.google.android.gms.internal.ads.zzgax zzg;
    private final com.google.android.gms.internal.ads.zzgax zzh;
    private final com.google.android.gms.internal.ads.zzqc zzi;
    private final java.util.ArrayDeque zzj;
    private com.google.android.gms.internal.ads.zzra zzk;
    private final com.google.android.gms.internal.ads.zzqv zzl;
    private final com.google.android.gms.internal.ads.zzqv zzm;
    private com.google.android.gms.internal.ads.zzom zzn;
    private com.google.android.gms.internal.ads.zzpv zzo;
    private com.google.android.gms.internal.ads.zzqp zzp;
    private com.google.android.gms.internal.ads.zzqp zzq;
    private com.google.android.gms.internal.ads.zzcq zzr;
    private android.media.AudioTrack zzs;
    private com.google.android.gms.internal.ads.zzos zzt;
    private com.google.android.gms.internal.ads.zzoz zzu;
    private com.google.android.gms.internal.ads.zzqu zzv;
    private com.google.android.gms.internal.ads.zzh zzw;
    private com.google.android.gms.internal.ads.zzqs zzx;
    private com.google.android.gms.internal.ads.zzqs zzy;
    private com.google.android.gms.internal.ads.zzbq zzz;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzrc.zza = r0
            return
    }

    /* synthetic */ zzrc(com.google.android.gms.internal.ads.zzqo r9, com.google.android.gms.internal.ads.zzrb r10) {
            r8 = this;
            r8.<init>()
            android.content.Context r10 = com.google.android.gms.internal.ads.zzqo.zza(r9)
            r8.zzd = r10
            com.google.android.gms.internal.ads.zzh r0 = com.google.android.gms.internal.ads.zzh.zza
            r8.zzw = r0
            r1 = 0
            if (r10 == 0) goto L19
            com.google.android.gms.internal.ads.zzos r2 = com.google.android.gms.internal.ads.zzos.zza
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzos r10 = com.google.android.gms.internal.ads.zzos.zzc(r10, r0, r1)
            goto L1d
        L19:
            com.google.android.gms.internal.ads.zzos r10 = com.google.android.gms.internal.ads.zzqo.zzb(r9)
        L1d:
            r8.zzt = r10
            com.google.android.gms.internal.ads.zzqq r10 = com.google.android.gms.internal.ads.zzqo.zzd(r9)
            r8.zzab = r10
            int r10 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzqg r9 = com.google.android.gms.internal.ads.zzqo.zze(r9)
            java.util.Objects.requireNonNull(r9)
            r8.zzac = r9
            com.google.android.gms.internal.ads.zzqc r9 = new com.google.android.gms.internal.ads.zzqc
            com.google.android.gms.internal.ads.zzqx r10 = new com.google.android.gms.internal.ads.zzqx
            r10.<init>(r8, r1)
            r9.<init>(r10)
            r8.zzi = r9
            com.google.android.gms.internal.ads.zzqd r9 = new com.google.android.gms.internal.ads.zzqd
            r9.<init>()
            r8.zze = r9
            com.google.android.gms.internal.ads.zzrm r10 = new com.google.android.gms.internal.ads.zzrm
            r10.<init>()
            r8.zzf = r10
            com.google.android.gms.internal.ads.zzcx r0 = new com.google.android.gms.internal.ads.zzcx
            r0.<init>()
            com.google.android.gms.internal.ads.zzgax r9 = com.google.android.gms.internal.ads.zzgax.zzq(r0, r9, r10)
            r8.zzg = r9
            com.google.android.gms.internal.ads.zzrl r9 = new com.google.android.gms.internal.ads.zzrl
            r9.<init>()
            com.google.android.gms.internal.ads.zzgax r9 = com.google.android.gms.internal.ads.zzgax.zzo(r9)
            r8.zzh = r9
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.zzJ = r9
            r9 = 0
            r8.zzR = r9
            com.google.android.gms.internal.ads.zzi r10 = new com.google.android.gms.internal.ads.zzi
            r0 = 0
            r10.<init>(r9, r0)
            r8.zzS = r10
            com.google.android.gms.internal.ads.zzqs r10 = new com.google.android.gms.internal.ads.zzqs
            com.google.android.gms.internal.ads.zzbq r0 = com.google.android.gms.internal.ads.zzbq.zza
            r3 = 0
            r5 = 0
            r7 = 0
            r1 = r10
            r2 = r0
            r1.<init>(r2, r3, r5, r7)
            r8.zzy = r10
            r8.zzz = r0
            r8.zzA = r9
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>()
            r8.zzj = r9
            com.google.android.gms.internal.ads.zzqv r9 = new com.google.android.gms.internal.ads.zzqv
            r9.<init>()
            r8.zzl = r9
            com.google.android.gms.internal.ads.zzqv r9 = new com.google.android.gms.internal.ads.zzqv
            r9.<init>()
            r8.zzm = r9
            return
    }

    static /* bridge */ /* synthetic */ long zzB(com.google.android.gms.internal.ads.zzrc r2) {
            long r0 = r2.zzU
            return r0
    }

    static /* bridge */ /* synthetic */ long zzC(com.google.android.gms.internal.ads.zzrc r2) {
            long r0 = r2.zzL()
            return r0
    }

    static /* bridge */ /* synthetic */ long zzD(com.google.android.gms.internal.ads.zzrc r2) {
            long r0 = r2.zzM()
            return r0
    }

    static /* bridge */ /* synthetic */ android.media.AudioTrack zzE(com.google.android.gms.internal.ads.zzrc r0) {
            android.media.AudioTrack r0 = r0.zzs
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzpv zzF(com.google.android.gms.internal.ads.zzrc r0) {
            com.google.android.gms.internal.ads.zzpv r0 = r0.zzo
            return r0
    }

    public static /* synthetic */ void zzG(com.google.android.gms.internal.ads.zzrc r5) {
            long r0 = r5.zzZ
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L17
            com.google.android.gms.internal.ads.zzpv r0 = r5.zzo
            com.google.android.gms.internal.ads.zzrh r0 = (com.google.android.gms.internal.ads.zzrh) r0
            com.google.android.gms.internal.ads.zzri r0 = r0.zza
            r1 = 1
            com.google.android.gms.internal.ads.zzri.zzah(r0, r1)
            r0 = 0
            r5.zzZ = r0
        L17:
            return
    }

    static /* bridge */ /* synthetic */ void zzH(com.google.android.gms.internal.ads.zzrc r0, boolean r1) {
            r1 = 1
            r0.zzP = r1
            return
    }

    static /* synthetic */ void zzI(android.media.AudioTrack r2, com.google.android.gms.internal.ads.zzpv r3, android.os.Handler r4, com.google.android.gms.internal.ads.zzps r5) {
            r0 = 0
            r2.flush()     // Catch: java.lang.Throwable -> L36
            r2.release()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L1f
            android.os.Looper r2 = r4.getLooper()
            java.lang.Thread r2 = r2.getThread()
            boolean r2 = r2.isAlive()
            if (r2 == 0) goto L1f
            com.google.android.gms.internal.ads.zzqk r2 = new com.google.android.gms.internal.ads.zzqk
            r2.<init>(r3, r5)
            r4.post(r2)
        L1f:
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzrc.zza
            monitor-enter(r2)
            int r3 = com.google.android.gms.internal.ads.zzrc.zzc     // Catch: java.lang.Throwable -> L33
            int r3 = r3 + (-1)
            com.google.android.gms.internal.ads.zzrc.zzc = r3     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto L31
            java.util.concurrent.ScheduledExecutorService r3 = com.google.android.gms.internal.ads.zzrc.zzb     // Catch: java.lang.Throwable -> L33
            r3.shutdown()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzrc.zzb = r0     // Catch: java.lang.Throwable -> L33
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            throw r3
        L36:
            r2 = move-exception
            if (r3 == 0) goto L4f
            android.os.Looper r1 = r4.getLooper()
            java.lang.Thread r1 = r1.getThread()
            boolean r1 = r1.isAlive()
            if (r1 == 0) goto L4f
            com.google.android.gms.internal.ads.zzqk r1 = new com.google.android.gms.internal.ads.zzqk
            r1.<init>(r3, r5)
            r4.post(r1)
        L4f:
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzrc.zza
            monitor-enter(r3)
            int r4 = com.google.android.gms.internal.ads.zzrc.zzc     // Catch: java.lang.Throwable -> L63
            int r4 = r4 + (-1)
            com.google.android.gms.internal.ads.zzrc.zzc = r4     // Catch: java.lang.Throwable -> L63
            if (r4 != 0) goto L61
            java.util.concurrent.ScheduledExecutorService r4 = com.google.android.gms.internal.ads.zzrc.zzb     // Catch: java.lang.Throwable -> L63
            r4.shutdown()     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.zzrc.zzb = r0     // Catch: java.lang.Throwable -> L63
        L61:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            throw r2
        L63:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            throw r2
    }

    static /* bridge */ /* synthetic */ boolean zzK() {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzrc.zza
            monitor-enter(r0)
            int r1 = com.google.android.gms.internal.ads.zzrc.zzc     // Catch: java.lang.Throwable -> Lc
            if (r1 <= 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    private final long zzL() {
            r5 = this;
            com.google.android.gms.internal.ads.zzqp r0 = r5.zzq
            int r1 = r0.zzc
            if (r1 != 0) goto Ld
            long r1 = r5.zzB
            int r0 = r0.zzb
            long r3 = (long) r0
            long r1 = r1 / r3
            goto Lf
        Ld:
            long r1 = r5.zzC
        Lf:
            return r1
    }

    private final long zzM() {
            r7 = this;
            com.google.android.gms.internal.ads.zzqp r0 = r7.zzq
            int r1 = r0.zzc
            if (r1 != 0) goto L13
            long r1 = r7.zzD
            int r0 = r0.zzd
            long r3 = (long) r0
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            long r1 = r1 + r3
            r5 = -1
            long r1 = r1 + r5
            long r1 = r1 / r3
            goto L15
        L13:
            long r1 = r7.zzE
        L15:
            return r1
    }

    private final android.media.AudioTrack zzN(com.google.android.gms.internal.ads.zzqp r3) throws com.google.android.gms.internal.ads.zzpu {
            r2 = this;
            com.google.android.gms.internal.ads.zzh r0 = r2.zzw     // Catch: com.google.android.gms.internal.ads.zzpu -> L9
            int r1 = r2.zzR     // Catch: com.google.android.gms.internal.ads.zzpu -> L9
            android.media.AudioTrack r3 = r3.zza(r0, r1)     // Catch: com.google.android.gms.internal.ads.zzpu -> L9
            return r3
        L9:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzpv r0 = r2.zzo
            if (r0 != 0) goto Lf
            goto L12
        Lf:
            r0.zza(r3)
        L12:
            throw r3
    }

    private final void zzO(long r10) {
            r9 = this;
            boolean r0 = r9.zzaa()
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzqq r0 = r9.zzab
            com.google.android.gms.internal.ads.zzbq r1 = r9.zzz
            r0.zzc(r1)
            goto L10
        Le:
            com.google.android.gms.internal.ads.zzbq r1 = com.google.android.gms.internal.ads.zzbq.zza
        L10:
            r3 = r1
            r9.zzz = r3
            boolean r0 = r9.zzaa()
            if (r0 == 0) goto L21
            com.google.android.gms.internal.ads.zzqq r0 = r9.zzab
            boolean r1 = r9.zzA
            r0.zzd(r1)
            goto L22
        L21:
            r1 = 0
        L22:
            r9.zzA = r1
            java.util.ArrayDeque r0 = r9.zzj
            com.google.android.gms.internal.ads.zzqs r1 = new com.google.android.gms.internal.ads.zzqs
            r4 = 0
            long r4 = java.lang.Math.max(r4, r10)
            com.google.android.gms.internal.ads.zzqp r10 = r9.zzq
            long r6 = r9.zzM()
            int r10 = r10.zze
            long r6 = com.google.android.gms.internal.ads.zzeu.zzs(r6, r10)
            r8 = 0
            r2 = r1
            r2.<init>(r3, r4, r6, r8)
            r0.add(r1)
            r9.zzV()
            com.google.android.gms.internal.ads.zzpv r10 = r9.zzo
            if (r10 == 0) goto L56
            boolean r11 = r9.zzA
            com.google.android.gms.internal.ads.zzrh r10 = (com.google.android.gms.internal.ads.zzrh) r10
            com.google.android.gms.internal.ads.zzri r10 = r10.zza
            com.google.android.gms.internal.ads.zzpq r10 = com.google.android.gms.internal.ads.zzri.zzae(r10)
            r10.zzw(r11)
        L56:
            return
    }

    private final void zzP() {
            r1 = this;
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzq
            boolean r0 = r0.zzc()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 1
            r1.zzV = r0
            return
    }

    private final void zzQ() {
            r5 = this;
            com.google.android.gms.internal.ads.zzoz r0 = r5.zzu
            if (r0 != 0) goto L26
            android.content.Context r0 = r5.zzd
            if (r0 == 0) goto L26
            android.os.Looper r0 = android.os.Looper.myLooper()
            r5.zzX = r0
            android.content.Context r0 = r5.zzd
            com.google.android.gms.internal.ads.zzoz r1 = new com.google.android.gms.internal.ads.zzoz
            com.google.android.gms.internal.ads.zzqj r2 = new com.google.android.gms.internal.ads.zzqj
            r2.<init>(r5)
            com.google.android.gms.internal.ads.zzh r3 = r5.zzw
            com.google.android.gms.internal.ads.zzpa r4 = r5.zzT
            r1.<init>(r0, r2, r3, r4)
            r5.zzu = r1
            com.google.android.gms.internal.ads.zzos r0 = r1.zzc()
            r5.zzt = r0
        L26:
            return
    }

    private final void zzR() {
            r3 = this;
            boolean r0 = r3.zzO
            if (r0 != 0) goto L20
            r0 = 1
            r3.zzO = r0
            com.google.android.gms.internal.ads.zzqc r0 = r3.zzi
            long r1 = r3.zzM()
            r0.zzb(r1)
            android.media.AudioTrack r0 = r3.zzs
            boolean r0 = zzZ(r0)
            if (r0 == 0) goto L1b
            r0 = 0
            r3.zzP = r0
        L1b:
            android.media.AudioTrack r0 = r3.zzs
            r0.stop()
        L20:
            return
    }

    private final void zzS(long r3) throws com.google.android.gms.internal.ads.zzpx {
            r2 = this;
            com.google.android.gms.internal.ads.zzcq r0 = r2.zzr
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L39
        L8:
            com.google.android.gms.internal.ads.zzcq r0 = r2.zzr
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L38
        L10:
            com.google.android.gms.internal.ads.zzcq r0 = r2.zzr
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L26
            r2.zzW(r0, r3)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L10
            goto L38
        L26:
            java.nio.ByteBuffer r0 = r2.zzK
            if (r0 == 0) goto L38
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzcq r0 = r2.zzr
            java.nio.ByteBuffer r1 = r2.zzK
            r0.zze(r1)
            goto L8
        L38:
            return
        L39:
            java.nio.ByteBuffer r0 = r2.zzK
            if (r0 != 0) goto L3f
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
        L3f:
            r2.zzW(r0, r3)
            return
    }

    private final void zzT(com.google.android.gms.internal.ads.zzbq r9) {
            r8 = this;
            com.google.android.gms.internal.ads.zzqs r7 = new com.google.android.gms.internal.ads.zzqs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            r0 = r7
            r1 = r9
            r2 = r4
            r0.<init>(r1, r2, r4, r6)
            boolean r9 = r8.zzY()
            if (r9 == 0) goto L17
            r8.zzx = r7
            return
        L17:
            r8.zzy = r7
            return
    }

    private final void zzU() {
            r2 = this;
            boolean r0 = r2.zzY()
            if (r0 == 0) goto Ld
            android.media.AudioTrack r0 = r2.zzs
            float r1 = r2.zzJ
            r0.setVolume(r1)
        Ld:
            return
    }

    private final void zzV() {
            r1 = this;
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzq
            com.google.android.gms.internal.ads.zzcq r0 = r0.zzi
            r1.zzr = r0
            r0.zzc()
            return
    }

    private final void zzW(java.nio.ByteBuffer r8, long r9) throws com.google.android.gms.internal.ads.zzpx {
            r7 = this;
            boolean r9 = r8.hasRemaining()
            if (r9 != 0) goto L8
            goto Lc1
        L8:
            java.nio.ByteBuffer r9 = r7.zzM
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L17
            if (r9 != r8) goto L12
            r9 = 1
            goto L13
        L12:
            r9 = 0
        L13:
            com.google.android.gms.internal.ads.zzdi.zzd(r9)
            goto L19
        L17:
            r7.zzM = r8
        L19:
            com.google.android.gms.internal.ads.zzqv r9 = r7.zzm
            boolean r9 = r9.zzc()
            if (r9 != 0) goto Lc1
            int r9 = r8.remaining()
            android.media.AudioTrack r1 = r7.zzs
            int r1 = r1.write(r8, r9, r10)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.zzU = r2
            r2 = 0
            if (r1 >= 0) goto L77
            int r8 = com.google.android.gms.internal.ads.zzeu.zza
            r9 = 24
            if (r8 < r9) goto L3e
            r8 = -6
            if (r1 == r8) goto L42
        L3e:
            r8 = -32
            if (r1 != r8) goto L57
        L42:
            long r8 = r7.zzM()
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 <= 0) goto L4b
            goto L58
        L4b:
            android.media.AudioTrack r8 = r7.zzs
            boolean r8 = zzZ(r8)
            if (r8 == 0) goto L57
            r7.zzP()
            goto L58
        L57:
            r10 = 0
        L58:
            com.google.android.gms.internal.ads.zzpx r8 = new com.google.android.gms.internal.ads.zzpx
            com.google.android.gms.internal.ads.zzqp r9 = r7.zzq
            com.google.android.gms.internal.ads.zzaf r9 = r9.zza
            r8.<init>(r1, r9, r10)
            com.google.android.gms.internal.ads.zzpv r9 = r7.zzo
            if (r9 == 0) goto L68
            r9.zza(r8)
        L68:
            boolean r9 = r8.zzb
            if (r9 != 0) goto L72
            com.google.android.gms.internal.ads.zzqv r9 = r7.zzm
            r9.zzb(r8)
            return
        L72:
            com.google.android.gms.internal.ads.zzos r9 = com.google.android.gms.internal.ads.zzos.zza
            r7.zzt = r9
            throw r8
        L77:
            com.google.android.gms.internal.ads.zzqv r4 = r7.zzm
            r4.zza()
            android.media.AudioTrack r4 = r7.zzs
            boolean r4 = zzZ(r4)
            if (r4 == 0) goto L98
            long r4 = r7.zzE
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L8c
            r7.zzW = r0
        L8c:
            boolean r2 = r7.zzQ
            if (r2 == 0) goto L98
            com.google.android.gms.internal.ads.zzpv r2 = r7.zzo
            if (r2 == 0) goto L98
            if (r1 >= r9) goto L98
            com.google.android.gms.internal.ads.zzrh r2 = (com.google.android.gms.internal.ads.zzrh) r2
        L98:
            com.google.android.gms.internal.ads.zzqp r2 = r7.zzq
            int r2 = r2.zzc
            if (r2 != 0) goto La4
            long r3 = r7.zzD
            long r5 = (long) r1
            long r3 = r3 + r5
            r7.zzD = r3
        La4:
            if (r1 != r9) goto Lc1
            if (r2 == 0) goto Lbe
            java.nio.ByteBuffer r9 = r7.zzK
            if (r8 != r9) goto Lad
            goto Lae
        Lad:
            r10 = 0
        Lae:
            com.google.android.gms.internal.ads.zzdi.zzf(r10)
            long r8 = r7.zzE
            int r10 = r7.zzF
            long r0 = (long) r10
            int r10 = r7.zzL
            long r2 = (long) r10
            long r0 = r0 * r2
            long r8 = r8 + r0
            r7.zzE = r8
        Lbe:
            r8 = 0
            r7.zzM = r8
        Lc1:
            return
    }

    private final boolean zzX() throws com.google.android.gms.internal.ads.zzpx {
            r5 = this;
            com.google.android.gms.internal.ads.zzcq r0 = r5.zzr
            boolean r0 = r0.zzh()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L1a
            java.nio.ByteBuffer r0 = r5.zzM
            if (r0 != 0) goto L11
            return r4
        L11:
            r5.zzW(r0, r1)
            java.nio.ByteBuffer r0 = r5.zzM
            if (r0 != 0) goto L19
            return r4
        L19:
            return r3
        L1a:
            com.google.android.gms.internal.ads.zzcq r0 = r5.zzr
            r0.zzd()
            r5.zzS(r1)
            com.google.android.gms.internal.ads.zzcq r0 = r5.zzr
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L37
            java.nio.ByteBuffer r0 = r5.zzM
            if (r0 == 0) goto L36
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L35
            goto L37
        L35:
            return r4
        L36:
            r3 = 1
        L37:
            return r3
    }

    private final boolean zzY() {
            r1 = this;
            android.media.AudioTrack r0 = r1.zzs
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private static boolean zzZ(android.media.AudioTrack r2) {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 29
            if (r0 < r1) goto Le
            boolean r2 = r2.isOffloadedPlayback()
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private final boolean zzaa() {
            r2 = this;
            com.google.android.gms.internal.ads.zzqp r0 = r2.zzq
            int r1 = r0.zzc
            if (r1 != 0) goto Lc
            com.google.android.gms.internal.ads.zzaf r0 = r0.zza
            int r0 = r0.zzD
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final boolean zzA(com.google.android.gms.internal.ads.zzaf r1) {
            r0 = this;
            int r1 = r0.zza(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final void zzJ(com.google.android.gms.internal.ads.zzos r5) {
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r4.zzX
            if (r1 == r0) goto L45
            java.lang.String r5 = "null"
            if (r1 != 0) goto Le
            r1 = r5
            goto L16
        Le:
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = r1.getName()
        L16:
            if (r0 != 0) goto L19
            goto L21
        L19:
            java.lang.Thread r5 = r0.getThread()
            java.lang.String r5 = r5.getName()
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Current looper ("
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ") is not the playback looper ("
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = ")"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
        L45:
            com.google.android.gms.internal.ads.zzos r0 = r4.zzt
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5a
            r4.zzt = r5
            com.google.android.gms.internal.ads.zzpv r5 = r4.zzo
            if (r5 == 0) goto L5a
            com.google.android.gms.internal.ads.zzrh r5 = (com.google.android.gms.internal.ads.zzrh) r5
            com.google.android.gms.internal.ads.zzri r5 = r5.zza
            com.google.android.gms.internal.ads.zzri.zzai(r5)
        L5a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final int zza(com.google.android.gms.internal.ads.zzaf r5) {
            r4 = this;
            r4.zzQ()
            java.lang.String r0 = r5.zzn
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r0)
            r1 = 0
            r2 = 2
            if (r0 == 0) goto L37
            int r0 = r5.zzD
            boolean r0 = com.google.android.gms.internal.ads.zzeu.zzI(r0)
            if (r0 != 0) goto L30
            int r5 = r5.zzD
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid PCM encoding: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "DefaultAudioSink"
            com.google.android.gms.internal.ads.zzea.zzf(r0, r5)
            return r1
        L30:
            int r5 = r5.zzD
            if (r5 == r2) goto L36
            r5 = 1
            return r5
        L36:
            return r2
        L37:
            com.google.android.gms.internal.ads.zzos r0 = r4.zzt
            com.google.android.gms.internal.ads.zzh r3 = r4.zzw
            android.util.Pair r5 = r0.zzb(r5, r3)
            if (r5 == 0) goto L42
            return r2
        L42:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final long zzb(boolean r7) {
            r6 = this;
            boolean r0 = r6.zzY()
            if (r0 == 0) goto Lbd
            boolean r0 = r6.zzH
            if (r0 == 0) goto Lc
            goto Lbd
        Lc:
            com.google.android.gms.internal.ads.zzqc r0 = r6.zzi
            long r0 = r0.zza(r7)
            com.google.android.gms.internal.ads.zzqp r7 = r6.zzq
            long r2 = r6.zzM()
            int r7 = r7.zze
            long r2 = com.google.android.gms.internal.ads.zzeu.zzs(r2, r7)
            long r0 = java.lang.Math.min(r0, r2)
        L22:
            java.util.ArrayDeque r7 = r6.zzj
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L43
            java.util.ArrayDeque r7 = r6.zzj
            java.lang.Object r7 = r7.getFirst()
            com.google.android.gms.internal.ads.zzqs r7 = (com.google.android.gms.internal.ads.zzqs) r7
            long r2 = r7.zzc
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L43
            java.util.ArrayDeque r7 = r6.zzj
            java.lang.Object r7 = r7.remove()
            com.google.android.gms.internal.ads.zzqs r7 = (com.google.android.gms.internal.ads.zzqs) r7
            r6.zzy = r7
            goto L22
        L43:
            com.google.android.gms.internal.ads.zzqs r7 = r6.zzy
            long r2 = r7.zzc
            long r2 = r0 - r2
            java.util.ArrayDeque r7 = r6.zzj
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5d
            com.google.android.gms.internal.ads.zzqq r7 = r6.zzab
            long r0 = r7.zza(r2)
            com.google.android.gms.internal.ads.zzqs r7 = r6.zzy
            long r2 = r7.zzb
            long r2 = r2 + r0
            goto L75
        L5d:
            java.util.ArrayDeque r7 = r6.zzj
            java.lang.Object r7 = r7.getFirst()
            com.google.android.gms.internal.ads.zzqs r7 = (com.google.android.gms.internal.ads.zzqs) r7
            long r2 = r7.zzc
            long r2 = r2 - r0
            com.google.android.gms.internal.ads.zzqs r0 = r6.zzy
            com.google.android.gms.internal.ads.zzbq r0 = r0.zza
            float r0 = r0.zzb
            long r0 = com.google.android.gms.internal.ads.zzeu.zzp(r2, r0)
            long r2 = r7.zzb
            long r2 = r2 - r0
        L75:
            com.google.android.gms.internal.ads.zzqq r7 = r6.zzab
            long r0 = r7.zzb()
            com.google.android.gms.internal.ads.zzqp r7 = r6.zzq
            int r7 = r7.zze
            long r4 = com.google.android.gms.internal.ads.zzeu.zzs(r0, r7)
            long r2 = r2 + r4
            long r4 = r6.zzY
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto Lbc
            com.google.android.gms.internal.ads.zzqp r7 = r6.zzq
            int r7 = r7.zze
            long r4 = r0 - r4
            long r4 = com.google.android.gms.internal.ads.zzeu.zzs(r4, r7)
            r6.zzY = r0
            long r0 = r6.zzZ
            long r0 = r0 + r4
            r6.zzZ = r0
            android.os.Handler r7 = r6.zzaa
            if (r7 != 0) goto Laa
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.myLooper()
            r7.<init>(r0)
            r6.zzaa = r7
        Laa:
            android.os.Handler r7 = r6.zzaa
            r0 = 0
            r7.removeCallbacksAndMessages(r0)
            android.os.Handler r7 = r6.zzaa
            com.google.android.gms.internal.ads.zzqi r0 = new com.google.android.gms.internal.ads.zzqi
            r0.<init>(r6)
            r4 = 100
            r7.postDelayed(r0, r4)
        Lbc:
            return r2
        Lbd:
            r0 = -9223372036854775808
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final com.google.android.gms.internal.ads.zzbq zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbq r0 = r1.zzz
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final com.google.android.gms.internal.ads.zzpd zzd(com.google.android.gms.internal.ads.zzaf r3) {
            r2 = this;
            boolean r0 = r2.zzV
            if (r0 == 0) goto L7
            com.google.android.gms.internal.ads.zzpd r3 = com.google.android.gms.internal.ads.zzpd.zza
            return r3
        L7:
            com.google.android.gms.internal.ads.zzqg r0 = r2.zzac
            com.google.android.gms.internal.ads.zzh r1 = r2.zzw
            com.google.android.gms.internal.ads.zzpd r3 = r0.zza(r3, r1)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zze(com.google.android.gms.internal.ads.zzaf r19, int r20, int[] r21) throws com.google.android.gms.internal.ads.zzpt {
            r18 = this;
            r1 = r18
            r3 = r19
            r18.zzQ()
            java.lang.String r0 = r3.zzn
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            r4 = -1
            if (r0 == 0) goto L86
            int r0 = r3.zzD
            boolean r0 = com.google.android.gms.internal.ads.zzeu.zzI(r0)
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            int r0 = r3.zzD
            int r5 = r3.zzB
            int r0 = com.google.android.gms.internal.ads.zzeu.zzj(r0)
            int r0 = r0 * r5
            com.google.android.gms.internal.ads.zzgau r5 = new com.google.android.gms.internal.ads.zzgau
            r5.<init>()
            com.google.android.gms.internal.ads.zzgax r6 = r1.zzg
            r5.zzh(r6)
            com.google.android.gms.internal.ads.zzqq r6 = r1.zzab
            com.google.android.gms.internal.ads.zzct[] r6 = r6.zze()
            r5.zzg(r6)
            com.google.android.gms.internal.ads.zzcq r6 = new com.google.android.gms.internal.ads.zzcq
            com.google.android.gms.internal.ads.zzgax r5 = r5.zzi()
            r6.<init>(r5)
            com.google.android.gms.internal.ads.zzcq r5 = r1.zzr
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcq r6 = r1.zzr
        L4b:
            com.google.android.gms.internal.ads.zzrm r5 = r1.zzf
            int r7 = r3.zzE
            int r8 = r3.zzF
            r5.zzq(r7, r8)
            com.google.android.gms.internal.ads.zzqd r5 = r1.zze
            r7 = r21
            r5.zzo(r7)
            com.google.android.gms.internal.ads.zzcr r5 = new com.google.android.gms.internal.ads.zzcr
            int r7 = r3.zzC
            int r8 = r3.zzB
            int r9 = r3.zzD
            r5.<init>(r7, r8, r9)
            com.google.android.gms.internal.ads.zzcr r5 = r6.zza(r5)     // Catch: com.google.android.gms.internal.ads.zzcs -> L7e
            int r7 = r5.zzd
            int r8 = r5.zzb
            int r5 = r5.zzc
            int r9 = com.google.android.gms.internal.ads.zzeu.zzh(r5)
            int r10 = com.google.android.gms.internal.ads.zzeu.zzj(r7)
            int r10 = r10 * r5
            r11 = r6
            r6 = r10
            r5 = 0
            goto Lb4
        L7e:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.zzpt r0 = new com.google.android.gms.internal.ads.zzpt
            r0.<init>(r2, r3)
            throw r0
        L86:
            com.google.android.gms.internal.ads.zzcq r0 = new com.google.android.gms.internal.ads.zzcq
            com.google.android.gms.internal.ads.zzgax r5 = com.google.android.gms.internal.ads.zzgax.zzn()
            r0.<init>(r5)
            int r5 = r3.zzC
            com.google.android.gms.internal.ads.zzpd r6 = com.google.android.gms.internal.ads.zzpd.zza
            com.google.android.gms.internal.ads.zzos r6 = r1.zzt
            com.google.android.gms.internal.ads.zzh r7 = r1.zzw
            android.util.Pair r6 = r6.zzb(r3, r7)
            if (r6 == 0) goto L1b6
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r8 = 2
            r11 = r0
            r8 = r5
            r9 = r6
            r0 = -1
            r5 = 2
            r6 = -1
        Lb4:
            java.lang.String r10 = ") for: "
            if (r7 == 0) goto L194
            if (r9 == 0) goto L16f
            int r10 = r3.zzi
            java.lang.String r12 = r3.zzn
            java.lang.String r13 = "audio/vnd.dts.hd;profile=lbr"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto Lcb
            if (r10 != r4) goto Lcb
            r10 = 768000(0xbb800, float:1.076197E-39)
        Lcb:
            int r12 = android.media.AudioTrack.getMinBufferSize(r8, r9, r7)
            r13 = -2
            r14 = 1
            if (r12 == r13) goto Ld5
            r13 = 1
            goto Ld6
        Ld5:
            r13 = 0
        Ld6:
            com.google.android.gms.internal.ads.zzdi.zzf(r13)
            if (r6 == r4) goto Ldd
            r13 = r6
            goto Lde
        Ldd:
            r13 = 1
        Lde:
            r15 = 250000(0x3d090, float:3.50325E-40)
            if (r5 == 0) goto L125
            r16 = 1000000(0xf4240, double:4.940656E-318)
            if (r5 == r14) goto L112
            r14 = 5
            r2 = 8
            if (r7 != r14) goto Lf1
            r15 = 500000(0x7a120, float:7.00649E-40)
            goto Lf8
        Lf1:
            if (r7 != r2) goto Lf8
            r15 = 1000000(0xf4240, float:1.401298E-39)
            r7 = 8
        Lf8:
            if (r10 == r4) goto L101
            java.math.RoundingMode r14 = java.math.RoundingMode.CEILING
            int r2 = com.google.android.gms.internal.ads.zzgdn.zzb(r10, r2, r14)
            goto L105
        L101:
            int r2 = com.google.android.gms.internal.ads.zzre.zzb(r7)
        L105:
            long r14 = (long) r15
            r21 = r5
            long r4 = (long) r2
            long r14 = r14 * r4
            long r14 = r14 / r16
            int r2 = com.google.android.gms.internal.ads.zzgdu.zzb(r14)
            goto L13c
        L112:
            r21 = r5
            int r2 = com.google.android.gms.internal.ads.zzre.zzb(r7)
            long r4 = (long) r2
            r14 = 50000000(0x2faf080, double:2.47032823E-316)
            long r4 = r4 * r14
            long r4 = r4 / r16
            int r2 = com.google.android.gms.internal.ads.zzgdu.zzb(r4)
            goto L13c
        L125:
            r21 = r5
            int r2 = r12 * 4
            int r4 = com.google.android.gms.internal.ads.zzre.zza(r15, r8, r13)
            r5 = 750000(0xb71b0, float:1.050974E-39)
            int r5 = com.google.android.gms.internal.ads.zzre.zza(r5, r8, r13)
            int r2 = java.lang.Math.min(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
        L13c:
            r10 = r7
            double r4 = (double) r2
            int r2 = (int) r4
            int r2 = java.lang.Math.max(r12, r2)
            int r2 = r2 + r13
            r4 = -1
            int r2 = r2 + r4
            int r2 = r2 / r13
            int r12 = r2 * r13
            r2 = 0
            r1.zzV = r2
            com.google.android.gms.internal.ads.zzqp r15 = new com.google.android.gms.internal.ads.zzqp
            r13 = 0
            r14 = 0
            r16 = 0
            r2 = r15
            r3 = r19
            r4 = r0
            r5 = r21
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r18.zzY()
            if (r0 == 0) goto L16c
            r1.zzp = r15
            return
        L16c:
            r1.zzq = r15
            return
        L16f:
            r21 = r5
            com.google.android.gms.internal.ads.zzpt r0 = new com.google.android.gms.internal.ads.zzpt
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Invalid output channel config (mode="
            r4.append(r5)
            r8 = r21
            r4.append(r8)
            r4.append(r10)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2, r3)
            throw r0
        L194:
            r8 = r5
            com.google.android.gms.internal.ads.zzpt r0 = new com.google.android.gms.internal.ads.zzpt
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Invalid output encoding (mode="
            r4.append(r5)
            r4.append(r8)
            r4.append(r10)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2, r3)
            throw r0
        L1b6:
            com.google.android.gms.internal.ads.zzpt r0 = new com.google.android.gms.internal.ads.zzpt
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.String r4 = "Unable to configure passthrough for: "
            java.lang.String r2 = r4.concat(r2)
            r0.<init>(r2, r3)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzf() {
            r12 = this;
            boolean r0 = r12.zzY()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Lbf
            r12.zzB = r2
            r12.zzC = r2
            r12.zzD = r2
            r12.zzE = r2
            r0 = 0
            r12.zzW = r0
            r12.zzF = r0
            com.google.android.gms.internal.ads.zzqs r11 = new com.google.android.gms.internal.ads.zzqs
            com.google.android.gms.internal.ads.zzbq r5 = r12.zzz
            r6 = 0
            r8 = 0
            r10 = 0
            r4 = r11
            r4.<init>(r5, r6, r8, r10)
            r12.zzy = r11
            r12.zzI = r2
            r12.zzx = r1
            java.util.ArrayDeque r4 = r12.zzj
            r4.clear()
            r12.zzK = r1
            r12.zzL = r0
            r12.zzM = r1
            r12.zzO = r0
            r12.zzN = r0
            r12.zzP = r0
            com.google.android.gms.internal.ads.zzrm r0 = r12.zzf
            r0.zzp()
            r12.zzV()
            com.google.android.gms.internal.ads.zzqc r0 = r12.zzi
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L4f
            android.media.AudioTrack r0 = r12.zzs
            r0.pause()
        L4f:
            android.media.AudioTrack r0 = r12.zzs
            boolean r0 = zzZ(r0)
            if (r0 == 0) goto L61
            com.google.android.gms.internal.ads.zzra r0 = r12.zzk
            java.util.Objects.requireNonNull(r0)
            android.media.AudioTrack r4 = r12.zzs
            r0.zzb(r4)
        L61:
            com.google.android.gms.internal.ads.zzqp r0 = r12.zzq
            com.google.android.gms.internal.ads.zzps r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzqp r4 = r12.zzp
            if (r4 == 0) goto L6f
            r12.zzq = r4
            r12.zzp = r1
        L6f:
            com.google.android.gms.internal.ads.zzqc r4 = r12.zzi
            r4.zzc()
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            r5 = 24
            if (r4 < r5) goto L83
            com.google.android.gms.internal.ads.zzqu r4 = r12.zzv
            if (r4 == 0) goto L83
            r4.zzb()
            r12.zzv = r1
        L83:
            android.media.AudioTrack r4 = r12.zzs
            com.google.android.gms.internal.ads.zzpv r5 = r12.zzo
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r7 = android.os.Looper.myLooper()
            r6.<init>(r7)
            java.lang.Object r7 = com.google.android.gms.internal.ads.zzrc.zza
            monitor-enter(r7)
            java.util.concurrent.ScheduledExecutorService r8 = com.google.android.gms.internal.ads.zzrc.zzb     // Catch: java.lang.Throwable -> Lbc
            if (r8 != 0) goto La4
            java.lang.String r8 = "ExoPlayer:AudioTrackReleaseThread"
            com.google.android.gms.internal.ads.zzet r9 = new com.google.android.gms.internal.ads.zzet     // Catch: java.lang.Throwable -> Lbc
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lbc
            java.util.concurrent.ScheduledExecutorService r8 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r9)     // Catch: java.lang.Throwable -> Lbc
            com.google.android.gms.internal.ads.zzrc.zzb = r8     // Catch: java.lang.Throwable -> Lbc
        La4:
            int r8 = com.google.android.gms.internal.ads.zzrc.zzc     // Catch: java.lang.Throwable -> Lbc
            int r8 = r8 + 1
            com.google.android.gms.internal.ads.zzrc.zzc = r8     // Catch: java.lang.Throwable -> Lbc
            java.util.concurrent.ScheduledExecutorService r8 = com.google.android.gms.internal.ads.zzrc.zzb     // Catch: java.lang.Throwable -> Lbc
            com.google.android.gms.internal.ads.zzqh r9 = new com.google.android.gms.internal.ads.zzqh     // Catch: java.lang.Throwable -> Lbc
            r9.<init>(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> Lbc
            r4 = 20
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lbc
            r8.schedule(r9, r4, r0)     // Catch: java.lang.Throwable -> Lbc
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lbc
            r12.zzs = r1
            goto Lbf
        Lbc:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lbc
            throw r0
        Lbf:
            com.google.android.gms.internal.ads.zzqv r0 = r12.zzm
            r0.zza()
            com.google.android.gms.internal.ads.zzqv r0 = r12.zzl
            r0.zza()
            r12.zzY = r2
            r12.zzZ = r2
            android.os.Handler r0 = r12.zzaa
            if (r0 == 0) goto Ld4
            r0.removeCallbacksAndMessages(r1)
        Ld4:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzg() {
            r1 = this;
            r0 = 1
            r1.zzG = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzh() {
            r1 = this;
            r0 = 0
            r1.zzQ = r0
            boolean r0 = r1.zzY()
            if (r0 == 0) goto L1e
            com.google.android.gms.internal.ads.zzqc r0 = r1.zzi
            boolean r0 = r0.zzk()
            if (r0 != 0) goto L19
            android.media.AudioTrack r0 = r1.zzs
            boolean r0 = zzZ(r0)
            if (r0 == 0) goto L1e
        L19:
            android.media.AudioTrack r0 = r1.zzs
            r0.pause()
        L1e:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzi() {
            r1 = this;
            r0 = 1
            r1.zzQ = r0
            boolean r0 = r1.zzY()
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzqc r0 = r1.zzi
            r0.zzf()
            android.media.AudioTrack r0 = r1.zzs
            r0.play()
        L13:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzj() throws com.google.android.gms.internal.ads.zzpx {
            r1 = this;
            boolean r0 = r1.zzN
            if (r0 != 0) goto L16
            boolean r0 = r1.zzY()
            if (r0 == 0) goto L16
            boolean r0 = r1.zzX()
            if (r0 == 0) goto L16
            r1.zzR()
            r0 = 1
            r1.zzN = r0
        L16:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzk() {
            r1 = this;
            com.google.android.gms.internal.ads.zzoz r0 = r1.zzu
            if (r0 == 0) goto L7
            r0.zzi()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzl() {
            r5 = this;
            r5.zzf()
            com.google.android.gms.internal.ads.zzgax r0 = r5.zzg
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L19
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.internal.ads.zzct r4 = (com.google.android.gms.internal.ads.zzct) r4
            r4.zzf()
            int r3 = r3 + 1
            goto Lb
        L19:
            com.google.android.gms.internal.ads.zzgax r0 = r5.zzh
            int r1 = r0.size()
            r3 = 0
        L20:
            if (r3 >= r1) goto L2e
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.internal.ads.zzct r4 = (com.google.android.gms.internal.ads.zzct) r4
            r4.zzf()
            int r3 = r3 + 1
            goto L20
        L2e:
            com.google.android.gms.internal.ads.zzcq r0 = r5.zzr
            if (r0 == 0) goto L35
            r0.zzf()
        L35:
            r5.zzQ = r2
            r5.zzV = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzm(com.google.android.gms.internal.ads.zzh r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzh r0 = r1.zzw
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9
            return
        L9:
            r1.zzw = r2
            com.google.android.gms.internal.ads.zzoz r0 = r1.zzu
            if (r0 == 0) goto L12
            r0.zzg(r2)
        L12:
            r1.zzf()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzn(int r2) {
            r1 = this;
            int r0 = r1.zzR
            if (r0 == r2) goto L9
            r1.zzR = r2
            r1.zzf()
        L9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzo(com.google.android.gms.internal.ads.zzi r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzi r0 = r1.zzS
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9
            return
        L9:
            android.media.AudioTrack r0 = r1.zzs
            if (r0 == 0) goto L11
            com.google.android.gms.internal.ads.zzi r0 = r1.zzS
            int r0 = r0.zza
        L11:
            r1.zzS = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzp(com.google.android.gms.internal.ads.zzdj r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzqc r0 = r1.zzi
            r0.zze(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzq(com.google.android.gms.internal.ads.zzpv r1) {
            r0 = this;
            r0.zzo = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzr(int r1, int r2) {
            r0 = this;
            android.media.AudioTrack r1 = r0.zzs
            if (r1 == 0) goto L7
            zzZ(r1)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzs(com.google.android.gms.internal.ads.zzbq r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzbq r0 = new com.google.android.gms.internal.ads.zzbq
            float r1 = r6.zzb
            r2 = 1090519040(0x41000000, float:8.0)
            float r1 = java.lang.Math.min(r1, r2)
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = java.lang.Math.max(r3, r1)
            float r4 = r6.zzc
            float r2 = java.lang.Math.min(r4, r2)
            float r2 = java.lang.Math.max(r3, r2)
            r0.<init>(r1, r2)
            r5.zzz = r0
            r5.zzT(r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzt(com.google.android.gms.internal.ads.zzom r1) {
            r0 = this;
            r0.zzn = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzu(android.media.AudioDeviceInfo r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.internal.ads.zzpa r0 = new com.google.android.gms.internal.ads.zzpa
            r0.<init>(r2)
        L9:
            r1.zzT = r0
            com.google.android.gms.internal.ads.zzoz r0 = r1.zzu
            if (r0 == 0) goto L12
            r0.zzh(r2)
        L12:
            android.media.AudioTrack r2 = r1.zzs
            if (r2 == 0) goto L1b
            com.google.android.gms.internal.ads.zzpa r0 = r1.zzT
            com.google.android.gms.internal.ads.zzql.zza(r2, r0)
        L1b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzv(boolean r1) {
            r0 = this;
            r0.zzA = r1
            com.google.android.gms.internal.ads.zzbq r1 = r0.zzz
            r0.zzT(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzw(float r2) {
            r1 = this;
            float r0 = r1.zzJ
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.zzJ = r2
            r1.zzU()
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final boolean zzx(java.nio.ByteBuffer r28, long r29, int r31) throws com.google.android.gms.internal.ads.zzpu, com.google.android.gms.internal.ads.zzpx {
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r5 = r31
            java.nio.ByteBuffer r0 = r1.zzK
            r7 = 0
            if (r0 == 0) goto L12
            if (r2 != r0) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzp
            r8 = 0
            if (r0 == 0) goto L67
            boolean r0 = r27.zzX()
            if (r0 != 0) goto L22
            return r7
        L22:
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzp
            com.google.android.gms.internal.ads.zzqp r9 = r1.zzq
            int r10 = r9.zzc
            int r11 = r0.zzc
            if (r10 != r11) goto L57
            int r10 = r9.zzg
            int r11 = r0.zzg
            if (r10 != r11) goto L57
            int r10 = r9.zze
            int r11 = r0.zze
            if (r10 != r11) goto L57
            int r10 = r9.zzf
            int r11 = r0.zzf
            if (r10 != r11) goto L57
            int r9 = r9.zzd
            int r10 = r0.zzd
            if (r9 != r10) goto L57
            r1.zzq = r0
            r1.zzp = r8
            android.media.AudioTrack r0 = r1.zzs
            if (r0 == 0) goto L64
            boolean r0 = zzZ(r0)
            if (r0 == 0) goto L64
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzq
            boolean r0 = r0.zzk
            goto L64
        L57:
            r27.zzR()
            boolean r0 = r27.zzy()
            if (r0 == 0) goto L61
            return r7
        L61:
            r27.zzf()
        L64:
            r1.zzO(r3)
        L67:
            boolean r0 = r27.zzY()
            r9 = 31
            if (r0 == 0) goto L71
            goto L154
        L71:
            com.google.android.gms.internal.ads.zzqv r0 = r1.zzl     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            boolean r0 = r0.zzc()     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            if (r0 == 0) goto L7a
            return r7
        L7a:
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzq     // Catch: com.google.android.gms.internal.ads.zzpu -> L84
            java.util.Objects.requireNonNull(r0)
            android.media.AudioTrack r0 = r1.zzN(r0)     // Catch: com.google.android.gms.internal.ads.zzpu -> L84
            goto Lc2
        L84:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzq     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r12 = r0.zzh     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r12 <= r13) goto L3bb
            com.google.android.gms.internal.ads.zzqp r12 = new com.google.android.gms.internal.ads.zzqp     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzaf r15 = r0.zza     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r13 = r0.zzb     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r14 = r0.zzc     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r8 = r0.zzd     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r7 = r0.zze     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r6 = r0.zzf     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r10 = r0.zzg     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r22 = 1000000(0xf4240, float:1.401298E-39)
            com.google.android.gms.internal.ads.zzcq r0 = r0.zzi     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r24 = 0
            r25 = 0
            r26 = 0
            r17 = r14
            r14 = r12
            r16 = r13
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r10
            r23 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            android.media.AudioTrack r0 = r1.zzN(r12)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3b7
            r1.zzq = r12     // Catch: com.google.android.gms.internal.ads.zzpu -> L3b7
        Lc2:
            r1.zzs = r0     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            boolean r0 = zzZ(r0)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            if (r0 == 0) goto Le0
            android.media.AudioTrack r0 = r1.zzs     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzra r6 = r1.zzk     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            if (r6 != 0) goto Ld7
            com.google.android.gms.internal.ads.zzra r6 = new com.google.android.gms.internal.ads.zzra     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r6.<init>(r1)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r1.zzk = r6     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
        Ld7:
            com.google.android.gms.internal.ads.zzra r6 = r1.zzk     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r6.zza(r0)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzq     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            boolean r0 = r0.zzk     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
        Le0:
            int r0 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            if (r0 < r9) goto Led
            com.google.android.gms.internal.ads.zzom r6 = r1.zzn     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            if (r6 == 0) goto Led
            android.media.AudioTrack r7 = r1.zzs     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzqm.zza(r7, r6)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
        Led:
            android.media.AudioTrack r6 = r1.zzs     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r6 = r6.getAudioSessionId()     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r1.zzR = r6     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzqc r10 = r1.zzi     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            android.media.AudioTrack r11 = r1.zzs     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzqp r6 = r1.zzq     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r7 = r6.zzc     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r8 = 2
            if (r7 != r8) goto L102
            r12 = 1
            goto L103
        L102:
            r12 = 0
        L103:
            int r13 = r6.zzg     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r14 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r15 = r6.zzh     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r10.zzd(r11, r12, r13, r14, r15)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r27.zzU()     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzi r6 = r1.zzS     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            int r6 = r6.zza     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzpa r6 = r1.zzT     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            if (r6 == 0) goto L12b
            r7 = 23
            if (r0 < r7) goto L12b
            android.media.AudioTrack r7 = r1.zzs     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzql.zza(r7, r6)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzoz r6 = r1.zzu     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            if (r6 == 0) goto L12b
            com.google.android.gms.internal.ads.zzpa r7 = r1.zzT     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            android.media.AudioDeviceInfo r7 = r7.zza     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r6.zzh(r7)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
        L12b:
            r6 = 24
            if (r0 < r6) goto L13c
            com.google.android.gms.internal.ads.zzoz r0 = r1.zzu     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            if (r0 == 0) goto L13c
            com.google.android.gms.internal.ads.zzqu r6 = new com.google.android.gms.internal.ads.zzqu     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            android.media.AudioTrack r7 = r1.zzs     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r6.<init>(r7, r0)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r1.zzv = r6     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
        L13c:
            r6 = 1
            r1.zzH = r6     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzpv r0 = r1.zzo     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            if (r0 == 0) goto L154
            com.google.android.gms.internal.ads.zzqp r6 = r1.zzq     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzps r6 = r6.zzb()     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzrh r0 = (com.google.android.gms.internal.ads.zzrh) r0     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzri r0 = r0.zza     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            com.google.android.gms.internal.ads.zzpq r0 = com.google.android.gms.internal.ads.zzri.zzae(r0)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            r0.zzc(r6)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
        L154:
            com.google.android.gms.internal.ads.zzqv r0 = r1.zzl
            r0.zza()
            boolean r0 = r1.zzH
            r6 = 0
            if (r0 == 0) goto L174
            long r10 = java.lang.Math.max(r6, r3)
            r1.zzI = r10
            r8 = 0
            r1.zzG = r8
            r1.zzH = r8
            r1.zzO(r3)
            boolean r0 = r1.zzQ
            if (r0 == 0) goto L174
            r27.zzi()
        L174:
            com.google.android.gms.internal.ads.zzqc r0 = r1.zzi
            long r10 = r27.zzM()
            boolean r0 = r0.zzj(r10)
            if (r0 != 0) goto L182
            r8 = 0
            return r8
        L182:
            java.nio.ByteBuffer r0 = r1.zzK
            if (r0 != 0) goto L38a
            java.nio.ByteOrder r0 = r28.order()
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r8) goto L190
            r0 = 1
            goto L191
        L190:
            r0 = 0
        L191:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            boolean r0 = r28.hasRemaining()
            if (r0 != 0) goto L19c
            r8 = 1
            return r8
        L19c:
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzq
            int r8 = r0.zzc
            if (r8 == 0) goto L2f9
            int r8 = r1.zzF
            if (r8 != 0) goto L2f9
            int r0 = r0.zzg
            r8 = 20
            r10 = 1024(0x400, float:1.435E-42)
            if (r0 == r8) goto L2ee
            r8 = 30
            r11 = -2
            r12 = -1
            if (r0 == r8) goto L264
            switch(r0) {
                case 5: goto L25d;
                case 6: goto L25d;
                case 7: goto L264;
                case 8: goto L264;
                case 9: goto L248;
                case 10: goto L245;
                case 11: goto L242;
                case 12: goto L242;
                default: goto L1b7;
            }
        L1b7:
            r8 = 16
            switch(r0) {
                case 14: goto L1f2;
                case 15: goto L1ee;
                case 16: goto L245;
                case 17: goto L1d3;
                case 18: goto L25d;
                default: goto L1bc;
            }
        L1bc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected audio encoding: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L1d3:
            int r0 = com.google.android.gms.internal.ads.zzace.zza
            byte[] r0 = new byte[r8]
            int r9 = r28.position()
            r2.get(r0)
            r2.position(r9)
            com.google.android.gms.internal.ads.zzej r9 = new com.google.android.gms.internal.ads.zzej
            r9.<init>(r0, r8)
            com.google.android.gms.internal.ads.zzacd r0 = com.google.android.gms.internal.ads.zzace.zza(r9)
            int r0 = r0.zzc
            goto L261
        L1ee:
            r0 = 512(0x200, float:7.175E-43)
            goto L261
        L1f2:
            int r0 = com.google.android.gms.internal.ads.zzacb.zza
            int r0 = r28.position()
            int r9 = r28.limit()
            int r9 = r9 + (-10)
            r10 = r0
        L1ff:
            if (r10 > r9) goto L212
            int r13 = r10 + 4
            int r13 = com.google.android.gms.internal.ads.zzeu.zzi(r2, r13)
            r13 = r13 & r11
            r14 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r13 != r14) goto L20f
            int r10 = r10 - r0
            goto L213
        L20f:
            int r10 = r10 + 1
            goto L1ff
        L212:
            r10 = -1
        L213:
            if (r10 != r12) goto L217
            r0 = 0
            goto L261
        L217:
            int r0 = r28.position()
            int r0 = r0 + r10
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r9 = r28.position()
            int r9 = r9 + r10
            r10 = 187(0xbb, float:2.62E-43)
            if (r0 != r10) goto L230
            r0 = 9
            goto L232
        L230:
            r0 = 8
        L232:
            r10 = 40
            int r9 = r9 + r0
            byte r0 = r2.get(r9)
            int r0 = r0 >> 4
            r0 = r0 & 7
            int r0 = r10 << r0
            int r0 = r0 * 16
            goto L261
        L242:
            r0 = 2048(0x800, float:2.87E-42)
            goto L261
        L245:
            r0 = 1024(0x400, float:1.435E-42)
            goto L261
        L248:
            int r0 = r28.position()
            int r0 = com.google.android.gms.internal.ads.zzeu.zzi(r2, r0)
            int r0 = com.google.android.gms.internal.ads.zzadu.zzc(r0)
            if (r0 == r12) goto L257
            goto L261
        L257:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L25d:
            int r0 = com.google.android.gms.internal.ads.zzacb.zza(r28)
        L261:
            r11 = 1
            goto L2f3
        L264:
            int r0 = com.google.android.gms.internal.ads.zzada.zza
            r8 = 0
            int r0 = r2.getInt(r8)
            r13 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r0 == r13) goto L2ea
            int r0 = r2.getInt(r8)
            r13 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r0 != r13) goto L27a
            goto L245
        L27a:
            int r0 = r2.getInt(r8)
            r8 = 622876772(0x25205864, float:1.3907736E-16)
            if (r0 != r8) goto L286
            r0 = 4096(0x1000, float:5.74E-42)
            goto L261
        L286:
            int r0 = r28.position()
            byte r8 = r2.get(r0)
            if (r8 == r11) goto L2d1
            if (r8 == r12) goto L2ba
            if (r8 == r9) goto L2a8
            int r8 = r0 + 4
            int r0 = r0 + 5
            byte r8 = r2.get(r8)
            r9 = 1
            r8 = r8 & r9
            int r8 = r8 << 6
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            r9 = 2
            goto L2cd
        L2a8:
            r9 = 2
            int r8 = r0 + 5
            byte r8 = r2.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r0 = r0 + 6
            byte r0 = r2.get(r0)
            goto L2cb
        L2ba:
            r9 = 2
            int r8 = r0 + 4
            byte r8 = r2.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
        L2cb:
            r0 = r0 & 60
        L2cd:
            int r0 = r0 >> r9
            r0 = r0 | r8
            r11 = 1
            goto L2e6
        L2d1:
            r9 = 2
            int r8 = r0 + 4
            int r0 = r0 + 5
            byte r0 = r2.get(r0)
            r11 = 1
            r0 = r0 & r11
            int r0 = r0 << 6
            byte r8 = r2.get(r8)
            r8 = r8 & 252(0xfc, float:3.53E-43)
            int r8 = r8 >> r9
            r0 = r0 | r8
        L2e6:
            int r0 = r0 + r11
            int r0 = r0 * 32
            goto L2f3
        L2ea:
            r11 = 1
            r0 = 1024(0x400, float:1.435E-42)
            goto L2f3
        L2ee:
            r11 = 1
            int r0 = com.google.android.gms.internal.ads.zzadw.zzb(r28)
        L2f3:
            r1.zzF = r0
            if (r0 == 0) goto L2f8
            goto L2f9
        L2f8:
            return r11
        L2f9:
            com.google.android.gms.internal.ads.zzqs r0 = r1.zzx
            if (r0 == 0) goto L30b
            boolean r0 = r27.zzX()
            if (r0 != 0) goto L305
            r8 = 0
            return r8
        L305:
            r1.zzO(r3)
            r8 = 0
            r1.zzx = r8
        L30b:
            long r8 = r1.zzI
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzq
            long r10 = r27.zzL()
            com.google.android.gms.internal.ads.zzrm r12 = r1.zzf
            long r12 = r12.zzo()
            long r10 = r10 - r12
            com.google.android.gms.internal.ads.zzaf r0 = r0.zza
            int r0 = r0.zzC
            long r10 = com.google.android.gms.internal.ads.zzeu.zzs(r10, r0)
            long r8 = r8 + r10
            boolean r0 = r1.zzG
            if (r0 != 0) goto L343
            long r10 = r8 - r3
            long r10 = java.lang.Math.abs(r10)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L343
            com.google.android.gms.internal.ads.zzpv r0 = r1.zzo
            if (r0 == 0) goto L340
            com.google.android.gms.internal.ads.zzpw r10 = new com.google.android.gms.internal.ads.zzpw
            r10.<init>(r3, r8)
            r0.zza(r10)
        L340:
            r10 = 1
            r1.zzG = r10
        L343:
            boolean r0 = r1.zzG
            if (r0 == 0) goto L36a
            boolean r0 = r27.zzX()
            r10 = 0
            if (r0 != 0) goto L34f
            return r10
        L34f:
            long r8 = r3 - r8
            long r11 = r1.zzI
            long r11 = r11 + r8
            r1.zzI = r11
            r1.zzG = r10
            r1.zzO(r3)
            com.google.android.gms.internal.ads.zzpv r0 = r1.zzo
            if (r0 == 0) goto L36a
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L36a
            com.google.android.gms.internal.ads.zzrh r0 = (com.google.android.gms.internal.ads.zzrh) r0
            com.google.android.gms.internal.ads.zzri r0 = r0.zza
            r0.zzao()
        L36a:
            com.google.android.gms.internal.ads.zzqp r0 = r1.zzq
            int r0 = r0.zzc
            if (r0 != 0) goto L37b
            long r6 = r1.zzB
            int r0 = r28.remaining()
            long r8 = (long) r0
            long r6 = r6 + r8
            r1.zzB = r6
            goto L386
        L37b:
            long r6 = r1.zzC
            int r0 = r1.zzF
            long r8 = (long) r0
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 + r8
            r1.zzC = r6
        L386:
            r1.zzK = r2
            r1.zzL = r5
        L38a:
            r1.zzS(r3)
            java.nio.ByteBuffer r0 = r1.zzK
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L39d
            r2 = 0
            r1.zzK = r2
            r2 = 0
            r1.zzL = r2
            r3 = 1
            return r3
        L39d:
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.ads.zzqc r0 = r1.zzi
            long r4 = r27.zzM()
            boolean r0 = r0.zzi(r4)
            if (r0 == 0) goto L3b6
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            com.google.android.gms.internal.ads.zzea.zzf(r0, r2)
            r27.zzf()
            return r3
        L3b6:
            return r2
        L3b7:
            r0 = move-exception
            r11.addSuppressed(r0)     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
        L3bb:
            r27.zzP()     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
            throw r11     // Catch: com.google.android.gms.internal.ads.zzpu -> L3bf
        L3bf:
            r0 = move-exception
            boolean r2 = r0.zzb
            if (r2 != 0) goto L3cb
            com.google.android.gms.internal.ads.zzqv r2 = r1.zzl
            r2.zzb(r0)
            r2 = 0
            return r2
        L3cb:
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final boolean zzy() {
            r3 = this;
            boolean r0 = r3.zzY()
            if (r0 == 0) goto L26
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 29
            if (r0 < r1) goto L18
            android.media.AudioTrack r0 = r3.zzs
            boolean r0 = r0.isOffloadedPlayback()
            if (r0 == 0) goto L18
            boolean r0 = r3.zzP
            if (r0 != 0) goto L26
        L18:
            com.google.android.gms.internal.ads.zzqc r0 = r3.zzi
            long r1 = r3.zzM()
            boolean r0 = r0.zzg(r1)
            if (r0 == 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final boolean zzz() {
            r3 = this;
            boolean r0 = r3.zzY()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L14
            boolean r0 = r3.zzN
            if (r0 == 0) goto L15
            boolean r0 = r3.zzy()
            if (r0 != 0) goto L13
            goto L14
        L13:
            return r1
        L14:
            r1 = 1
        L15:
            return r1
    }
}
