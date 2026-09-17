package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzap extends com.google.android.gms.internal.ads.zzbzk {
    protected static final java.util.List zza = null;
    protected static final java.util.List zzb = null;
    protected static final java.util.List zzc = null;
    protected static final java.util.List zzd = null;
    public static final /* synthetic */ int zze = 0;
    private final java.lang.String zzA;
    private final java.util.List zzB;
    private final java.util.List zzC;
    private final java.util.List zzD;
    private final java.util.List zzE;
    private final java.util.concurrent.atomic.AtomicBoolean zzF;
    private final java.util.concurrent.atomic.AtomicBoolean zzG;
    private final java.util.concurrent.atomic.AtomicInteger zzH;
    private final com.google.android.gms.internal.ads.zzbdw zzI;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzJ;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzK;
    private final com.google.android.gms.internal.ads.zzcho zzf;
    private android.content.Context zzg;
    private final com.google.android.gms.internal.ads.zzavn zzh;
    private final com.google.android.gms.internal.ads.zzfhg zzi;
    private final com.google.android.gms.internal.ads.zzfib zzj;
    private final com.google.android.gms.internal.ads.zzgfz zzk;
    private final java.util.concurrent.ScheduledExecutorService zzl;
    private com.google.android.gms.internal.ads.zzbuk zzm;
    private android.graphics.Point zzn;
    private android.graphics.Point zzo;
    private final com.google.android.gms.internal.ads.zzdui zzp;
    private final com.google.android.gms.internal.ads.zzfng zzq;
    private final boolean zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final java.lang.String zzv;
    private final java.lang.String zzw;
    private final java.util.concurrent.atomic.AtomicInteger zzx;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzy;
    private java.lang.String zzz;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "/aclk"
            java.lang.String r2 = "/pcs/click"
            java.lang.String r3 = "/dbm/clk"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.gms.ads.nonagon.signalgeneration.zzap.zza = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "xGN4Vue"
            java.lang.String r2 = "xGN4Vue"
            java.lang.String[] r3 = new java.lang.String[]{r1, r2}
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.<init>(r3)
            com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzb = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r3 = "/pagead/adview"
            java.lang.String r4 = "/pcs/view"
            java.lang.String r5 = "/pagead/conversion"
            java.lang.String r6 = "/dbm/ad"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6}
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.<init>(r3)
            com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzc = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r3 = ".googlesyndication.com"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzd = r0
            return
    }

    public zzap(com.google.android.gms.internal.ads.zzcho r3, android.content.Context r4, com.google.android.gms.internal.ads.zzavn r5, com.google.android.gms.internal.ads.zzfib r6, com.google.android.gms.internal.ads.zzgfz r7, java.util.concurrent.ScheduledExecutorService r8, com.google.android.gms.internal.ads.zzdui r9, com.google.android.gms.internal.ads.zzfng r10, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r11, com.google.android.gms.internal.ads.zzbdw r12, com.google.android.gms.internal.ads.zzfhg r13, com.google.android.gms.ads.nonagon.signalgeneration.zzj r14, com.google.android.gms.ads.nonagon.signalgeneration.zza r15) {
            r2 = this;
            r2.<init>()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r2.zzn = r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r2.zzo = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.zzx = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.zzF = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.zzG = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.zzH = r0
            r2.zzf = r3
            r2.zzg = r4
            r2.zzh = r5
            r2.zzi = r13
            r2.zzj = r6
            r2.zzk = r7
            r2.zzl = r8
            r2.zzp = r9
            r2.zzq = r10
            r2.zzy = r11
            r2.zzI = r12
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgT
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.zzr = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgS
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.zzs = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgV
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.zzt = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgX
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.zzu = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgW
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.zzv = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgY
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.zzw = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgZ
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.zzA = r3
            r2.zzJ = r14
            r2.zzK = r15
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzha
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L115
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhb
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r3 = zzaa(r3)
            r2.zzB = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhc
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r3 = zzaa(r3)
            r2.zzC = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhd
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r3 = zzaa(r3)
            r2.zzD = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhe
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r3 = zzaa(r3)
        L112:
            r2.zzE = r3
            return
        L115:
            java.util.List r3 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zza
            r2.zzB = r3
            java.util.List r3 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzb
            r2.zzC = r3
            java.util.List r3 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzc
            r2.zzD = r3
            java.util.List r3 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzd
            goto L112
    }

    static /* bridge */ /* synthetic */ java.lang.String zzA(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            java.lang.String r0 = r0.zzv
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzD(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.zzG
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicInteger zzE(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zzH
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicInteger zzF(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zzx
            return r0
    }

    static /* bridge */ /* synthetic */ void zzG(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0, java.lang.String r1) {
            r0.zzz = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzH(com.google.android.gms.ads.nonagon.signalgeneration.zzap r1, java.util.List r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r2.next()
            android.net.Uri r0 = (android.net.Uri) r0
            boolean r0 = r1.zzO(r0)
            if (r0 == 0) goto L4
            java.util.concurrent.atomic.AtomicInteger r1 = r1.zzx
            r1.getAndIncrement()
        L1b:
            return
    }

    static /* bridge */ /* synthetic */ void zzI(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            r0.zzT()
            return
    }

    static /* bridge */ /* synthetic */ boolean zzK(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            boolean r0 = r0.zzu
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzL(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            boolean r0 = r0.zzt
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzM(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            boolean r0 = r0.zzs
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzN(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            boolean r0 = r0.zzr
            return r0
    }

    static final /* synthetic */ android.net.Uri zzQ(android.net.Uri r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            java.lang.String r0 = "nas"
            android.net.Uri r1 = zzZ(r1, r0, r2)
        Lc:
            return r1
    }

    private final com.google.android.gms.ads.nonagon.signalgeneration.zzx zzR(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zzs r11, com.google.android.gms.ads.internal.client.zzm r12, android.os.Bundle r13) {
            r7 = this;
            com.google.android.gms.internal.ads.zzfha r0 = new com.google.android.gms.internal.ads.zzfha
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r10)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L19
            com.google.android.gms.internal.ads.zzfgn r2 = r0.zzp()
            r2.zza(r5)
            goto L26
        L19:
            boolean r2 = r3.equals(r10)
            if (r2 == 0) goto L26
            com.google.android.gms.internal.ads.zzfgn r2 = r0.zzp()
            r2.zza(r4)
        L26:
            com.google.android.gms.internal.ads.zzcho r2 = r7.zzf
            com.google.android.gms.ads.nonagon.signalgeneration.zzw r2 = r2.zzp()
            com.google.android.gms.internal.ads.zzcxi r6 = new com.google.android.gms.internal.ads.zzcxi
            r6.<init>()
            r6.zze(r8)
            if (r9 != 0) goto L38
            java.lang.String r9 = "adUnitId"
        L38:
            r0.zzt(r9)
            if (r12 != 0) goto L46
            com.google.android.gms.ads.internal.client.zzn r9 = new com.google.android.gms.ads.internal.client.zzn
            r9.<init>()
            com.google.android.gms.ads.internal.client.zzm r12 = r9.zza()
        L46:
            r0.zzH(r12)
            r9 = 1
            if (r11 != 0) goto Laa
            int r11 = r10.hashCode()
            r12 = 4
            switch(r11) {
                case -1999289321: goto L79;
                case -428325382: goto L6f;
                case 543046670: goto L67;
                case 1854800829: goto L5f;
                case 1951953708: goto L55;
                default: goto L54;
            }
        L54:
            goto L83
        L55:
            java.lang.String r11 = "BANNER"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = 0
            goto L84
        L5f:
            boolean r11 = r10.equals(r3)
            if (r11 == 0) goto L83
            r11 = 2
            goto L84
        L67:
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L83
            r11 = 1
            goto L84
        L6f:
            java.lang.String r11 = "APP_OPEN_AD"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = 4
            goto L84
        L79:
            java.lang.String r11 = "NATIVE"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = 3
            goto L84
        L83:
            r11 = -1
        L84:
            if (r11 == 0) goto La3
            if (r11 == r9) goto L9e
            if (r11 == r5) goto L9e
            if (r11 == r4) goto L99
            if (r11 == r12) goto L94
            com.google.android.gms.ads.internal.client.zzs r11 = new com.google.android.gms.ads.internal.client.zzs
            r11.<init>()
            goto Laa
        L94:
            com.google.android.gms.ads.internal.client.zzs r11 = com.google.android.gms.ads.internal.client.zzs.zzb()
            goto Laa
        L99:
            com.google.android.gms.ads.internal.client.zzs r11 = com.google.android.gms.ads.internal.client.zzs.zzc()
            goto Laa
        L9e:
            com.google.android.gms.ads.internal.client.zzs r11 = com.google.android.gms.ads.internal.client.zzs.zzd()
            goto Laa
        La3:
            com.google.android.gms.ads.internal.client.zzs r11 = new com.google.android.gms.ads.internal.client.zzs
            com.google.android.gms.ads.AdSize r12 = com.google.android.gms.ads.AdSize.BANNER
            r11.<init>(r8, r12)
        Laa:
            r0.zzs(r11)
            r0.zzz(r9)
            r0.zzA(r13)
            com.google.android.gms.internal.ads.zzfhc r8 = r0.zzJ()
            r6.zzi(r8)
            com.google.android.gms.internal.ads.zzcxk r8 = r6.zzj()
            r2.zza(r8)
            com.google.android.gms.ads.nonagon.signalgeneration.zzas r8 = new com.google.android.gms.ads.nonagon.signalgeneration.zzas
            r8.<init>()
            r8.zza(r10)
            com.google.android.gms.ads.nonagon.signalgeneration.zzau r9 = new com.google.android.gms.ads.nonagon.signalgeneration.zzau
            r10 = 0
            r9.<init>(r8, r10)
            r2.zzb(r9)
            com.google.android.gms.internal.ads.zzdds r8 = new com.google.android.gms.internal.ads.zzdds
            r8.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzx r8 = r2.zzc()
            return r8
    }

    private final com.google.common.util.concurrent.ListenableFuture zzS(java.lang.String r5) {
            r4 = this;
            r0 = 1
            com.google.android.gms.internal.ads.zzdpt[] r0 = new com.google.android.gms.internal.ads.zzdpt[r0]
            com.google.android.gms.internal.ads.zzfib r1 = r4.zzj
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zza()
            com.google.android.gms.ads.nonagon.signalgeneration.zzaa r2 = new com.google.android.gms.ads.nonagon.signalgeneration.zzaa
            r2.<init>(r4, r0, r5)
            com.google.android.gms.internal.ads.zzgfz r5 = r4.zzk
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r2, r5)
            com.google.android.gms.ads.nonagon.signalgeneration.zzab r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzab
            r1.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzgfz r0 = r4.zzk
            r5.addListener(r1, r0)
            com.google.android.gms.internal.ads.zzgff r5 = com.google.android.gms.internal.ads.zzgff.zzu(r5)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhl
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r3 = r4.zzl
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzo(r5, r0, r2, r3)
            com.google.android.gms.internal.ads.zzgff r5 = (com.google.android.gms.internal.ads.zzgff) r5
            com.google.android.gms.ads.nonagon.signalgeneration.zzah r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzah
            r0.<init>()
            com.google.android.gms.internal.ads.zzgfz r1 = r4.zzk
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzm(r5, r0, r1)
            com.google.android.gms.internal.ads.zzgff r5 = (com.google.android.gms.internal.ads.zzgff) r5
            com.google.android.gms.ads.nonagon.signalgeneration.zzai r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzai
            r0.<init>()
            com.google.android.gms.internal.ads.zzgfz r1 = r4.zzk
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zze(r5, r2, r0, r1)
            com.google.android.gms.internal.ads.zzgff r5 = (com.google.android.gms.internal.ads.zzgff) r5
            return r5
    }

    private final void zzT() {
            r8 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbew.zzb
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r0 = r8.zzJ
            r0.zzb()
            return
        L14:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkJ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            com.google.android.gms.ads.nonagon.signalgeneration.zzy r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzy
            r0.<init>(r8)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzk(r0, r1)
            goto L4b
        L32:
            android.content.Context r2 = r8.zzg
            r3 = 0
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.BANNER
            java.lang.String r4 = r0.name()
            r5 = 0
            r6 = 0
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r1 = r8
            com.google.android.gms.ads.nonagon.signalgeneration.zzx r0 = r1.zzR(r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb()
        L4b:
            com.google.android.gms.ads.nonagon.signalgeneration.zzao r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzao
            r1.<init>(r8)
            com.google.android.gms.internal.ads.zzcho r2 = r8.zzf
            java.util.concurrent.Executor r2 = r2.zzC()
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r2)
            return
    }

    private final void zzU() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzje
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjh
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L42
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjl
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3f
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzF
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L42
        L3f:
            r2.zzT()
        L42:
            return
    }

    private final void zzV(java.util.List r5, com.google.android.gms.dynamic.IObjectWrapper r6, com.google.android.gms.internal.ads.zzbub r7, boolean r8) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhk
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L22
            java.lang.String r5 = "The updating URL feature is not enabled."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            r7.zze(r5)     // Catch: android.os.RemoteException -> L1b
            return
        L1b:
            r5 = move-exception
            java.lang.String r6 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r6, r5)
            return
        L22:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L27:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            android.net.Uri r2 = (android.net.Uri) r2
            boolean r2 = r4.zzO(r2)
            if (r2 == 0) goto L27
            int r1 = r1 + 1
            goto L27
        L3c:
            r0 = 1
            if (r1 <= r0) goto L4c
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Multiple google urls found: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L4c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r5.next()
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r2 = r4.zzO(r1)
            if (r2 != 0) goto L79
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Not a Google URL: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            goto L9b
        L79:
            com.google.android.gms.internal.ads.zzgfz r2 = r4.zzk
            com.google.android.gms.ads.nonagon.signalgeneration.zzac r3 = new com.google.android.gms.ads.nonagon.signalgeneration.zzac
            r3.<init>(r4, r1, r6)
            com.google.common.util.concurrent.ListenableFuture r1 = r2.zzb(r3)
            boolean r2 = r4.zzY()
            if (r2 == 0) goto L96
            com.google.android.gms.ads.nonagon.signalgeneration.zzad r2 = new com.google.android.gms.ads.nonagon.signalgeneration.zzad
            r2.<init>(r4)
            com.google.android.gms.internal.ads.zzgfz r3 = r4.zzk
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r2, r3)
            goto L9b
        L96:
            java.lang.String r2 = "Asset view map is empty."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r2)
        L9b:
            r0.add(r1)
            goto L55
        L9f:
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzd(r0)
            com.google.android.gms.ads.nonagon.signalgeneration.zzan r6 = new com.google.android.gms.ads.nonagon.signalgeneration.zzan
            r6.<init>(r4, r7, r8)
            com.google.android.gms.internal.ads.zzcho r7 = r4.zzf
            java.util.concurrent.Executor r7 = r7.zzC()
            com.google.android.gms.internal.ads.zzgfo.zzr(r5, r6, r7)
            return
    }

    private final void zzW(java.util.List r3, com.google.android.gms.dynamic.IObjectWrapper r4, com.google.android.gms.internal.ads.zzbub r5, boolean r6) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhk
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1f
            java.lang.String r3 = "The updating URL feature is not enabled."
            r5.zze(r3)     // Catch: android.os.RemoteException -> L18
            return
        L18:
            r3 = move-exception
            java.lang.String r4 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r3)
            return
        L1f:
            com.google.android.gms.internal.ads.zzgfz r0 = r2.zzk
            com.google.android.gms.ads.nonagon.signalgeneration.zzaj r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            r1.<init>(r2, r3, r4)
            com.google.common.util.concurrent.ListenableFuture r3 = r0.zzb(r1)
            boolean r4 = r2.zzY()
            if (r4 == 0) goto L3c
            com.google.android.gms.ads.nonagon.signalgeneration.zzak r4 = new com.google.android.gms.ads.nonagon.signalgeneration.zzak
            r4.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r0 = r2.zzk
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r3, r4, r0)
            goto L41
        L3c:
            java.lang.String r4 = "Asset view map is empty."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r4)
        L41:
            com.google.android.gms.ads.nonagon.signalgeneration.zzam r4 = new com.google.android.gms.ads.nonagon.signalgeneration.zzam
            r4.<init>(r2, r5, r6)
            com.google.android.gms.internal.ads.zzcho r5 = r2.zzf
            java.util.concurrent.Executor r5 = r5.zzC()
            com.google.android.gms.internal.ads.zzgfo.zzr(r3, r4, r5)
            return
    }

    private static boolean zzX(android.net.Uri r4, java.util.List r5, java.util.List r6) {
            java.lang.String r0 = r4.getHost()
            java.lang.String r4 = r4.getPath()
            r1 = 0
            if (r0 == 0) goto L3c
            if (r4 != 0) goto Le
            goto L3c
        Le:
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L12
            java.util.Iterator r2 = r6.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L12
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L28
            r4 = 1
            return r4
        L3c:
            return r1
    }

    private final boolean zzY() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbuk r0 = r1.zzm
            if (r0 == 0) goto L10
            java.util.Map r0 = r0.zzb
            if (r0 == 0) goto L10
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private static final android.net.Uri zzZ(android.net.Uri r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "&adurl="
            int r1 = r0.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L13
            java.lang.String r1 = "?adurl="
            int r1 = r0.indexOf(r1)
        L13:
            if (r1 == r2) goto L41
            int r1 = r1 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r2 = 0
            java.lang.String r2 = r0.substring(r2, r1)
            r3.<init>(r2)
            r3.append(r4)
            java.lang.String r4 = "="
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = "&"
            r3.append(r4)
            java.lang.String r4 = r0.substring(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            return r3
        L41:
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r5)
            android.net.Uri r3 = r3.build()
            return r3
    }

    private static final java.util.List zzaa(java.lang.String r5) {
            java.lang.String r0 = ","
            java.lang.String[] r5 = android.text.TextUtils.split(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1d
            r3 = r5[r2]
            boolean r4 = com.google.android.gms.internal.ads.zzfyo.zzd(r3)
            if (r4 != 0) goto L1a
            r0.add(r3)
        L1a:
            int r2 = r2 + 1
            goto Ld
        L1d:
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context zzc(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            android.content.Context r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ android.net.Uri zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0, android.net.Uri r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "1"
            android.net.Uri r0 = zzZ(r1, r2, r0)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzo(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r0.zzy
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdui zzp(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            com.google.android.gms.internal.ads.zzdui r0 = r0.zzp
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfma zzr(com.google.common.util.concurrent.ListenableFuture r3, com.google.android.gms.internal.ads.zzbzp r4) {
            boolean r0 = com.google.android.gms.internal.ads.zzfmd.zza()
            r1 = 0
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L16
            goto L4d
        L16:
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgfo.zzp(r3)     // Catch: java.util.concurrent.ExecutionException -> L43
            com.google.android.gms.ads.nonagon.signalgeneration.zzx r3 = (com.google.android.gms.ads.nonagon.signalgeneration.zzx) r3     // Catch: java.util.concurrent.ExecutionException -> L43
            com.google.android.gms.internal.ads.zzfma r3 = r3.zza()     // Catch: java.util.concurrent.ExecutionException -> L43
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.util.concurrent.ExecutionException -> L43
            java.lang.String r2 = r4.zzb     // Catch: java.util.concurrent.ExecutionException -> L43
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.util.concurrent.ExecutionException -> L43
            r0.<init>(r2)     // Catch: java.util.concurrent.ExecutionException -> L43
            r3.zzd(r0)     // Catch: java.util.concurrent.ExecutionException -> L43
            com.google.android.gms.ads.internal.client.zzm r0 = r4.zzd     // Catch: java.util.concurrent.ExecutionException -> L43
            if (r0 != 0) goto L35
            java.lang.String r0 = ""
            goto L37
        L35:
            java.lang.String r0 = r0.zzp     // Catch: java.util.concurrent.ExecutionException -> L43
        L37:
            r3.zzb(r0)     // Catch: java.util.concurrent.ExecutionException -> L43
            com.google.android.gms.ads.internal.client.zzm r4 = r4.zzd     // Catch: java.util.concurrent.ExecutionException -> L43
            android.os.Bundle r4 = r4.zzm     // Catch: java.util.concurrent.ExecutionException -> L43
            r3.zzf(r4)     // Catch: java.util.concurrent.ExecutionException -> L43
            r1 = r3
            goto L4d
        L43:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "SignalGeneratorImpl.getConfiguredCriticalUserJourney"
            r4.zzw(r3, r0)
        L4d:
            return r1
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfng zzs(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            com.google.android.gms.internal.ads.zzfng r0 = r0.zzq
            return r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzt(com.google.android.gms.ads.nonagon.signalgeneration.zzap r2, android.net.Uri r3) {
            java.lang.String r0 = "google.afma.nativeAds.getPublisherCustomRenderedClickSignals"
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzS(r0)
            com.google.android.gms.ads.nonagon.signalgeneration.zzae r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzae
            r1.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzgfz r2 = r2.zzk
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            return r2
    }

    static /* bridge */ /* synthetic */ java.lang.String zzx(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            java.lang.String r0 = r0.zzA
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzy(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            java.lang.String r0 = r0.zzw
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzz(com.google.android.gms.ads.nonagon.signalgeneration.zzap r0) {
            java.lang.String r0 = r0.zzz
            return r0
    }

    final /* synthetic */ java.util.ArrayList zzB(java.util.List r4, java.lang.String r5) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r4.next()
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r2 = r3.zzP(r1)
            if (r2 == 0) goto L2c
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L22
            goto L2c
        L22:
            java.lang.String r2 = "nas"
            android.net.Uri r1 = zzZ(r1, r2, r5)
            r0.add(r1)
            goto L9
        L2c:
            r0.add(r1)
            goto L9
        L30:
            return r0
    }

    final /* synthetic */ java.util.ArrayList zzC(java.util.List r5, com.google.android.gms.dynamic.IObjectWrapper r6) throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzavn r0 = r4.zzh
            com.google.android.gms.internal.ads.zzavi r0 = r0.zzc()
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.ads.zzavn r0 = r4.zzh
            com.google.android.gms.internal.ads.zzavi r0 = r0.zzc()
            android.content.Context r1 = r4.zzg
            java.lang.Object r6 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r6)
            android.view.View r6 = (android.view.View) r6
            r2 = 0
            java.lang.String r6 = r0.zzh(r1, r6, r2)
            goto L1e
        L1c:
            java.lang.String r6 = ""
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L69
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r2 = r4.zzP(r1)
            if (r2 != 0) goto L50
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Not a Google URL: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            r0.add(r1)
            goto L2d
        L50:
            java.lang.String r2 = "ms"
            android.net.Uri r1 = zzZ(r1, r2, r6)
            r0.add(r1)
            goto L2d
        L5a:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L61
            return r0
        L61:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "Empty impression URLs result."
            r5.<init>(r6)
            throw r5
        L69:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "Failed to get view signals."
            r5.<init>(r6)
            throw r5
    }

    final /* synthetic */ void zzJ(com.google.android.gms.internal.ads.zzdpt[] r2) {
            r1 = this;
            r0 = 0
            r2 = r2[r0]
            if (r2 == 0) goto Le
            com.google.android.gms.internal.ads.zzfib r0 = r1.zzj
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            r0.zzb(r2)
        Le:
            return
    }

    final boolean zzO(android.net.Uri r3) {
            r2 = this;
            java.util.List r0 = r2.zzB
            java.util.List r1 = r2.zzC
            boolean r3 = zzX(r3, r0, r1)
            return r3
    }

    final boolean zzP(android.net.Uri r3) {
            r2 = this;
            java.util.List r0 = r2.zzD
            java.util.List r1 = r2.zzE
            boolean r3 = zzX(r3, r0, r1)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final com.google.android.gms.dynamic.IObjectWrapper zze(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.dynamic.IObjectWrapper r4, java.lang.String r5, com.google.android.gms.dynamic.IObjectWrapper r6) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjr
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L18
            r3 = 0
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)
            return r3
        L18:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)
            androidx.browser.customtabs.CustomTabsClient r4 = (androidx.browser.customtabs.CustomTabsClient) r4
            java.lang.Object r6 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r6)
            androidx.browser.customtabs.CustomTabsCallback r6 = (androidx.browser.customtabs.CustomTabsCallback) r6
            com.google.android.gms.internal.ads.zzbdw r0 = r2.zzI
            r0.zzg(r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbew.zzb
            java.lang.Object r3 = r3.zze()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L42
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r3 = r2.zzJ
            r3.zzb()
        L42:
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbew.zza
            java.lang.Object r3 = r3.zze()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L55
            com.google.android.gms.ads.nonagon.signalgeneration.zza r3 = r2.zzK
            r3.zzb()
        L55:
            com.google.android.gms.internal.ads.zzbdw r3 = r2.zzI
            androidx.browser.customtabs.CustomTabsSession r3 = r3.zzb()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper r10, com.google.android.gms.internal.ads.zzbzp r11, com.google.android.gms.internal.ads.zzbzi r12) {
            r9 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.zzdtm r0 = com.google.android.gms.internal.ads.zzdtm.zza
            java.lang.String r0 = r0.zza()
            com.google.android.gms.ads.internal.client.zzm r1 = r11.zzd
            long r1 = r1.zzz
            r6.putLong(r0, r1)
            com.google.android.gms.internal.ads.zzdtm r0 = com.google.android.gms.internal.ads.zzdtm.zzb
            java.lang.String r0 = r0.zza()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.currentTimeMillis()
            r6.putLong(r0, r1)
        L35:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.content.Context r0 = (android.content.Context) r0
            r9.zzg = r0
            r1 = 22
            com.google.android.gms.internal.ads.zzflp r7 = com.google.android.gms.internal.ads.zzflo.zza(r0, r1)
            r7.zzi()
            java.lang.String r0 = r11.zzb
            java.lang.String r1 = "UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhj
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L7b
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r0.zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
        L7b:
            com.google.android.gms.ads.internal.client.zzm r1 = r11.zzd
            java.lang.String r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L9e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown format is no longer supported."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzg(r2)
            r2 = r0
            r6 = r1
            goto Lde
        L9e:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkJ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc5
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzaf r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzaf
            r1.<init>(r9, r11, r6)
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb(r1)
            com.google.android.gms.ads.nonagon.signalgeneration.zzag r2 = new com.google.android.gms.ads.nonagon.signalgeneration.zzag
            r2.<init>()
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r2, r0)
            goto Ldc
        Lc5:
            android.content.Context r1 = r9.zzg
            java.lang.String r2 = r11.zza
            java.lang.String r3 = r11.zzb
            com.google.android.gms.ads.internal.client.zzs r4 = r11.zzc
            com.google.android.gms.ads.internal.client.zzm r5 = r11.zzd
            r0 = r9
            com.google.android.gms.ads.nonagon.signalgeneration.zzx r0 = r0.zzR(r1, r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb()
        Ldc:
            r6 = r0
            r2 = r1
        Lde:
            com.google.android.gms.ads.nonagon.signalgeneration.zzal r8 = new com.google.android.gms.ads.nonagon.signalgeneration.zzal
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.ads.zzcho r0 = r9.zzf
            java.util.concurrent.Executor r0 = r0.zzC()
            com.google.android.gms.internal.ads.zzgfo.zzr(r6, r8, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(com.google.android.gms.internal.ads.zzbuk r2) {
            r1 = this;
            r1.zzm = r2
            com.google.android.gms.internal.ads.zzfib r2 = r1.zzj
            r0 = 1
            r2.zzc(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzh(java.util.List r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.internal.ads.zzbub r4) {
            r1 = this;
            r0 = 1
            r1.zzV(r2, r3, r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzi(java.util.List r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.internal.ads.zzbub r4) {
            r1 = this;
            r0 = 1
            r1.zzW(r2, r3, r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    @android.annotation.SuppressLint({"AddJavascriptInterface"})
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r13) {
            r12 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjd
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
            goto Lb7
        L14:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhi
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L29
            r12.zzU()
        L29:
            java.lang.Object r13 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r13)
            android.webkit.WebView r13 = (android.webkit.WebView) r13
            if (r13 != 0) goto L37
            java.lang.String r13 = "The webView cannot be null."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r13)
            return
        L37:
            com.google.android.gms.ads.nonagon.signalgeneration.zza r1 = r12.zzK
            com.google.android.gms.ads.nonagon.signalgeneration.zze r10 = new com.google.android.gms.ads.nonagon.signalgeneration.zze
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zze
            r10.<init>(r13, r1, r2)
            com.google.android.gms.internal.ads.zzavn r3 = r12.zzh
            com.google.android.gms.internal.ads.zzdui r4 = r12.zzp
            com.google.android.gms.internal.ads.zzfng r5 = r12.zzq
            com.google.android.gms.internal.ads.zzfhg r6 = r12.zzi
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r7 = r12.zzJ
            com.google.android.gms.ads.nonagon.signalgeneration.zza r8 = r12.zzK
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r11 = new com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface
            r1 = r11
            r2 = r13
            r9 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r1 = "gmaSdk"
            r13.addJavascriptInterface(r11, r1)
            com.google.android.gms.internal.ads.zzbcm r13 = com.google.android.gms.internal.ads.zzbcv.zzjn
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L72
            com.google.android.gms.internal.ads.zzcad r13 = com.google.android.gms.ads.internal.zzu.zzo()
            r13.zzs()
        L72:
            com.google.android.gms.internal.ads.zzbeb r13 = com.google.android.gms.internal.ads.zzbew.zza
            java.lang.Object r13 = r13.zze()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto La4
            com.google.android.gms.ads.nonagon.signalgeneration.zza r13 = r12.zzK
            r13.zzb()
            com.google.android.gms.internal.ads.zzbcm r13 = com.google.android.gms.internal.ads.zzbcv.zzjo
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.util.concurrent.ScheduledExecutorService r1 = com.google.android.gms.internal.ads.zzcan.zzd
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r2 = new com.google.android.gms.ads.nonagon.signalgeneration.zzd
            r2.<init>(r10)
            r3 = 0
            long r5 = (long) r13
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.scheduleWithFixedDelay(r2, r3, r5, r7)
        La4:
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r13 = r13.zza(r0)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lb7
            r12.zzU()
        Lb7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhk
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)
            android.view.MotionEvent r3 = (android.view.MotionEvent) r3
            com.google.android.gms.internal.ads.zzbuk r0 = r2.zzm
            if (r0 != 0) goto L1f
            r0 = 0
            goto L21
        L1f:
            android.view.View r0 = r0.zza
        L21:
            android.graphics.Point r0 = com.google.android.gms.ads.internal.util.zzbv.zza(r3, r0)
            r2.zzn = r0
            int r0 = r3.getAction()
            if (r0 != 0) goto L31
            android.graphics.Point r0 = r2.zzn
            r2.zzo = r0
        L31:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r3)
            android.graphics.Point r0 = r2.zzn
            int r1 = r0.x
            float r1 = (float) r1
            int r0 = r0.y
            float r0 = (float) r0
            r3.setLocation(r1, r0)
            com.google.android.gms.internal.ads.zzavn r0 = r2.zzh
            r0.zzd(r3)
            r3.recycle()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzl(java.util.List r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.internal.ads.zzbub r4) {
            r1 = this;
            r0 = 0
            r1.zzV(r2, r3, r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzm(java.util.List r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.internal.ads.zzbub r4) {
            r1 = this;
            r0 = 0
            r1.zzW(r2, r3, r4, r0)
            return
    }

    final /* synthetic */ android.net.Uri zzn(android.net.Uri r4, com.google.android.gms.dynamic.IObjectWrapper r5) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlC     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            java.lang.Object r0 = r1.zza(r0)     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            boolean r0 = r0.booleanValue()     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzfhg r0 = r3.zzi     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            if (r0 == 0) goto L24
            android.content.Context r2 = r3.zzg     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            android.view.View r5 = (android.view.View) r5     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            android.net.Uri r4 = r0.zza(r4, r2, r5, r1)     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            goto L39
        L24:
            com.google.android.gms.internal.ads.zzavn r0 = r3.zzh     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            android.content.Context r2 = r3.zzg     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            android.view.View r5 = (android.view.View) r5     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            android.net.Uri r4 = r0.zza(r4, r2, r5, r1)     // Catch: com.google.android.gms.internal.ads.zzavo -> L33
            goto L39
        L33:
            r5 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r5)
        L39:
            java.lang.String r5 = "ms"
            java.lang.String r5 = r4.getQueryParameter(r5)
            if (r5 == 0) goto L42
            return r4
        L42:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r5 = "Failed to append spam signals to click url."
            r4.<init>(r5)
            throw r4
    }

    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzx zzq(com.google.android.gms.internal.ads.zzbzp r8, android.os.Bundle r9) throws java.lang.Exception {
            r7 = this;
            android.content.Context r1 = r7.zzg
            java.lang.String r2 = r8.zza
            java.lang.String r3 = r8.zzb
            com.google.android.gms.ads.internal.client.zzs r4 = r8.zzc
            com.google.android.gms.ads.internal.client.zzm r5 = r8.zzd
            r0 = r7
            r6 = r9
            com.google.android.gms.ads.nonagon.signalgeneration.zzx r8 = r0.zzR(r1, r2, r3, r4, r5, r6)
            return r8
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzu() throws java.lang.Exception {
            r7 = this;
            android.content.Context r1 = r7.zzg
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.BANNER
            java.lang.String r3 = r0.name()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            com.google.android.gms.ads.nonagon.signalgeneration.zzx r0 = r0.zzR(r1, r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb()
            return r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzv(com.google.android.gms.internal.ads.zzdpt[] r7, java.lang.String r8, com.google.android.gms.internal.ads.zzdpt r9) throws java.lang.Exception {
            r6 = this;
            r0 = 0
            r7[r0] = r9
            android.content.Context r7 = r6.zzg
            com.google.android.gms.internal.ads.zzbuk r0 = r6.zzm
            java.util.Map r1 = r0.zzb
            android.view.View r0 = r0.zza
            r2 = 0
            org.json.JSONObject r7 = com.google.android.gms.ads.internal.util.zzbv.zzd(r7, r1, r1, r0, r2)
            android.content.Context r0 = r6.zzg
            com.google.android.gms.internal.ads.zzbuk r1 = r6.zzm
            android.view.View r1 = r1.zza
            org.json.JSONObject r0 = com.google.android.gms.ads.internal.util.zzbv.zzg(r0, r1)
            com.google.android.gms.internal.ads.zzbuk r1 = r6.zzm
            android.view.View r1 = r1.zza
            org.json.JSONObject r1 = com.google.android.gms.ads.internal.util.zzbv.zzf(r1)
            android.content.Context r3 = r6.zzg
            com.google.android.gms.internal.ads.zzbuk r4 = r6.zzm
            android.view.View r4 = r4.zza
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbv.zze(r3, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "asset_view_signal"
            r4.put(r5, r7)
            java.lang.String r7 = "ad_view_signal"
            r4.put(r7, r0)
            java.lang.String r7 = "scroll_view_signal"
            r4.put(r7, r1)
            java.lang.String r7 = "lock_screen_signal"
            r4.put(r7, r3)
            java.lang.String r7 = "google.afma.nativeAds.getPublisherCustomRenderedClickSignals"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L5c
            android.content.Context r7 = r6.zzg
            android.graphics.Point r0 = r6.zzo
            android.graphics.Point r1 = r6.zzn
            org.json.JSONObject r7 = com.google.android.gms.ads.internal.util.zzbv.zzc(r2, r7, r0, r1)
            java.lang.String r0 = "click_signal"
            r4.put(r0, r7)
        L5c:
            com.google.common.util.concurrent.ListenableFuture r7 = r9.zzg(r8, r4)
            return r7
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzw(java.util.ArrayList r3) throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = "google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzS(r0)
            com.google.android.gms.ads.nonagon.signalgeneration.zzz r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzz
            r1.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzgfz r3 = r2.zzk
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r3)
            return r3
    }
}
