package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzel {
    final com.google.android.gms.ads.internal.client.zzbd zza;
    private final com.google.android.gms.internal.ads.zzbph zzb;
    private final com.google.android.gms.ads.internal.client.zzr zzc;
    private final java.util.concurrent.atomic.AtomicBoolean zzd;
    private final com.google.android.gms.ads.VideoController zze;
    private com.google.android.gms.ads.internal.client.zza zzf;
    private com.google.android.gms.ads.AdListener zzg;
    private com.google.android.gms.ads.AdSize[] zzh;
    private com.google.android.gms.ads.admanager.AppEventListener zzi;
    private com.google.android.gms.ads.internal.client.zzby zzj;
    private com.google.android.gms.ads.VideoOptions zzk;
    private java.lang.String zzl;
    private final android.view.ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private com.google.android.gms.ads.OnPaidEventListener zzp;

    public zzel(android.view.ViewGroup r8) {
            r7 = this;
            com.google.android.gms.ads.internal.client.zzr r4 = com.google.android.gms.ads.internal.client.zzr.zza
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public zzel(android.view.ViewGroup r8, int r9) {
            r7 = this;
            com.google.android.gms.ads.internal.client.zzr r4 = com.google.android.gms.ads.internal.client.zzr.zza
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r7
            r1 = r8
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public zzel(android.view.ViewGroup r8, android.util.AttributeSet r9, boolean r10) {
            r7 = this;
            com.google.android.gms.ads.internal.client.zzr r4 = com.google.android.gms.ads.internal.client.zzr.zza
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public zzel(android.view.ViewGroup r8, android.util.AttributeSet r9, boolean r10, int r11) {
            r7 = this;
            com.google.android.gms.ads.internal.client.zzr r4 = com.google.android.gms.ads.internal.client.zzr.zza
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    zzel(android.view.ViewGroup r24, android.util.AttributeSet r25, boolean r26, com.google.android.gms.ads.internal.client.zzr r27, com.google.android.gms.ads.internal.client.zzby r28, int r29) {
            r23 = this;
            r1 = r23
            r2 = r24
            r0 = r25
            r23.<init>()
            com.google.android.gms.internal.ads.zzbph r3 = new com.google.android.gms.internal.ads.zzbph
            r3.<init>()
            r1.zzb = r3
            com.google.android.gms.ads.VideoController r3 = new com.google.android.gms.ads.VideoController
            r3.<init>()
            r1.zze = r3
            com.google.android.gms.ads.internal.client.zzek r3 = new com.google.android.gms.ads.internal.client.zzek
            r3.<init>(r1)
            r1.zza = r3
            r1.zzm = r2
            r3 = r27
            r1.zzc = r3
            r3 = 0
            r1.zzj = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 0
            r3.<init>(r4)
            r1.zzd = r3
            r3 = r29
            r1.zzn = r3
            if (r0 == 0) goto Lab
            android.content.Context r3 = r24.getContext()
            com.google.android.gms.ads.internal.client.zzaa r5 = new com.google.android.gms.ads.internal.client.zzaa     // Catch: java.lang.IllegalArgumentException -> L94
            r5.<init>(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L94
            r0 = r26
            com.google.android.gms.ads.AdSize[] r0 = r5.zzb(r0)     // Catch: java.lang.IllegalArgumentException -> L94
            r1.zzh = r0     // Catch: java.lang.IllegalArgumentException -> L94
            java.lang.String r0 = r5.zza()     // Catch: java.lang.IllegalArgumentException -> L94
            r1.zzl = r0     // Catch: java.lang.IllegalArgumentException -> L94
            boolean r0 = r24.isInEditMode()
            if (r0 == 0) goto Lab
            com.google.android.gms.ads.internal.util.client.zzf r0 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            com.google.android.gms.ads.AdSize[] r5 = r1.zzh
            r4 = r5[r4]
            int r5 = r1.zzn
            com.google.android.gms.ads.AdSize r6 = com.google.android.gms.ads.AdSize.INVALID
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L82
            com.google.android.gms.ads.internal.client.zzs r3 = new com.google.android.gms.ads.internal.client.zzs
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.String r8 = "invalid"
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L8e
        L82:
            com.google.android.gms.ads.internal.client.zzs r6 = new com.google.android.gms.ads.internal.client.zzs
            r6.<init>(r3, r4)
            boolean r3 = zzE(r5)
            r6.zzj = r3
            r3 = r6
        L8e:
            java.lang.String r4 = "Ads by Google"
            r0.zzn(r2, r3, r4)
            return
        L94:
            r0 = move-exception
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            com.google.android.gms.ads.internal.client.zzs r5 = new com.google.android.gms.ads.internal.client.zzs
            com.google.android.gms.ads.AdSize r6 = com.google.android.gms.ads.AdSize.BANNER
            r5.<init>(r3, r6)
            java.lang.String r3 = r0.getMessage()
            java.lang.String r0 = r0.getMessage()
            r4.zzm(r2, r5, r3, r0)
        Lab:
            return
    }

    private static com.google.android.gms.ads.internal.client.zzs zzD(android.content.Context r20, com.google.android.gms.ads.AdSize[] r21, int r22) {
            r0 = r21
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L2e
            r3 = r0[r2]
            com.google.android.gms.ads.AdSize r4 = com.google.android.gms.ads.AdSize.INVALID
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2b
            com.google.android.gms.ads.internal.client.zzs r0 = new com.google.android.gms.ads.internal.client.zzs
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r5 = "invalid"
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L2b:
            int r2 = r2 + 1
            goto L4
        L2e:
            com.google.android.gms.ads.internal.client.zzs r1 = new com.google.android.gms.ads.internal.client.zzs
            r2 = r20
            r1.<init>(r2, r0)
            boolean r0 = zzE(r22)
            r1.zzj = r0
            return r1
    }

    private static boolean zzE(int r1) {
            r0 = 1
            if (r1 != r0) goto L4
            return r0
        L4:
            r1 = 0
            return r1
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.VideoController zze(com.google.android.gms.ads.internal.client.zzel r0) {
            com.google.android.gms.ads.VideoController r0 = r0.zze
            return r0
    }

    public final boolean zzA() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Lf
            boolean r0 = r0.zzY()     // Catch: android.os.RemoteException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        Lf:
            r0 = 0
            return r0
    }

    public final boolean zzB() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Lf
            boolean r0 = r0.zzZ()     // Catch: android.os.RemoteException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        Lf:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.ads.AdSize[] zzC() {
            r1 = this;
            com.google.android.gms.ads.AdSize[] r0 = r1.zzh
            return r0
    }

    public final com.google.android.gms.ads.AdListener zza() {
            r1 = this;
            com.google.android.gms.ads.AdListener r0 = r1.zzg
            return r0
    }

    public final com.google.android.gms.ads.AdSize zzb() {
            r3 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r3.zzj     // Catch: android.os.RemoteException -> L15
            if (r0 == 0) goto L1b
            com.google.android.gms.ads.internal.client.zzs r0 = r0.zzg()     // Catch: android.os.RemoteException -> L15
            if (r0 == 0) goto L1b
            int r1 = r0.zze     // Catch: android.os.RemoteException -> L15
            int r2 = r0.zzb     // Catch: android.os.RemoteException -> L15
            java.lang.String r0 = r0.zza     // Catch: android.os.RemoteException -> L15
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.zzb.zzc(r1, r2, r0)     // Catch: android.os.RemoteException -> L15
            return r0
        L15:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        L1b:
            com.google.android.gms.ads.AdSize[] r0 = r3.zzh
            if (r0 == 0) goto L23
            r1 = 0
            r0 = r0[r1]
            return r0
        L23:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.ads.OnPaidEventListener zzc() {
            r1 = this;
            com.google.android.gms.ads.OnPaidEventListener r0 = r1.zzp
            return r0
    }

    public final com.google.android.gms.ads.ResponseInfo zzd() {
            r3 = this;
            r0 = 0
            com.google.android.gms.ads.internal.client.zzby r1 = r3.zzj     // Catch: android.os.RemoteException -> La
            if (r1 == 0) goto L10
            com.google.android.gms.ads.internal.client.zzdy r0 = r1.zzk()     // Catch: android.os.RemoteException -> La
            goto L10
        La:
            r1 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r1)
        L10:
            com.google.android.gms.ads.ResponseInfo r0 = com.google.android.gms.ads.ResponseInfo.zza(r0)
            return r0
    }

    public final com.google.android.gms.ads.VideoController zzf() {
            r1 = this;
            com.google.android.gms.ads.VideoController r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.ads.VideoOptions zzg() {
            r1 = this;
            com.google.android.gms.ads.VideoOptions r0 = r1.zzk
            return r0
    }

    public final com.google.android.gms.ads.admanager.AppEventListener zzh() {
            r1 = this;
            com.google.android.gms.ads.admanager.AppEventListener r0 = r1.zzi
            return r0
    }

    public final com.google.android.gms.ads.internal.client.zzeb zzi() {
            r3 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r3.zzj
            r1 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzl()     // Catch: android.os.RemoteException -> La
            return r0
        La:
            r0 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r0)
        L10:
            return r1
    }

    public final java.lang.String zzj() {
            r2 = this;
            java.lang.String r0 = r2.zzl
            if (r0 != 0) goto L15
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.zzr()     // Catch: android.os.RemoteException -> Lf
            r2.zzl = r0     // Catch: android.os.RemoteException -> Lf
            goto L15
        Lf:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        L15:
            java.lang.String r0 = r2.zzl
            return r0
    }

    public final void zzk() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L7
            r0.zzx()     // Catch: android.os.RemoteException -> L8
        L7:
            return
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    final /* synthetic */ void zzl(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup r0 = r1.zzm
            r0.addView(r2)
            return
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzei r13) {
            r12 = this;
            java.lang.String r0 = "#007 Could not call remote method."
            long r1 = java.lang.System.currentTimeMillis()     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzby r3 = r12.zzj     // Catch: android.os.RemoteException -> L106
            if (r3 != 0) goto Lec
            com.google.android.gms.ads.AdSize[] r3 = r12.zzh     // Catch: android.os.RemoteException -> L106
            if (r3 == 0) goto Le4
            java.lang.String r3 = r12.zzl     // Catch: android.os.RemoteException -> L106
            if (r3 == 0) goto Le4
            android.view.ViewGroup r3 = r12.zzm     // Catch: android.os.RemoteException -> L106
            android.content.Context r3 = r3.getContext()     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.AdSize[] r4 = r12.zzh     // Catch: android.os.RemoteException -> L106
            int r5 = r12.zzn     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzs r7 = zzD(r3, r4, r5)     // Catch: android.os.RemoteException -> L106
            java.lang.String r4 = "search_v2"
            java.lang.String r5 = r7.zza     // Catch: android.os.RemoteException -> L106
            boolean r4 = r4.equals(r5)     // Catch: android.os.RemoteException -> L106
            r10 = 0
            if (r4 == 0) goto L3d
            com.google.android.gms.ads.internal.client.zzba r4 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: android.os.RemoteException -> L106
            java.lang.String r5 = r12.zzl     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzao r6 = new com.google.android.gms.ads.internal.client.zzao     // Catch: android.os.RemoteException -> L106
            r6.<init>(r4, r3, r7, r5)     // Catch: android.os.RemoteException -> L106
            java.lang.Object r3 = r6.zzd(r3, r10)     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzby r3 = (com.google.android.gms.ads.internal.client.zzby) r3     // Catch: android.os.RemoteException -> L106
            goto L52
        L3d:
            com.google.android.gms.ads.internal.client.zzba r5 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: android.os.RemoteException -> L106
            java.lang.String r8 = r12.zzl     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.internal.ads.zzbph r9 = r12.zzb     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzam r11 = new com.google.android.gms.ads.internal.client.zzam     // Catch: android.os.RemoteException -> L106
            r4 = r11
            r6 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: android.os.RemoteException -> L106
            java.lang.Object r3 = r11.zzd(r3, r10)     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzby r3 = (com.google.android.gms.ads.internal.client.zzby) r3     // Catch: android.os.RemoteException -> L106
        L52:
            r12.zzj = r3     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzg r4 = new com.google.android.gms.ads.internal.client.zzg     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzbd r5 = r12.zza     // Catch: android.os.RemoteException -> L106
            r4.<init>(r5)     // Catch: android.os.RemoteException -> L106
            r3.zzD(r4)     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zza r3 = r12.zzf     // Catch: android.os.RemoteException -> L106
            if (r3 == 0) goto L6c
            com.google.android.gms.ads.internal.client.zzby r4 = r12.zzj     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzb r5 = new com.google.android.gms.ads.internal.client.zzb     // Catch: android.os.RemoteException -> L106
            r5.<init>(r3)     // Catch: android.os.RemoteException -> L106
            r4.zzC(r5)     // Catch: android.os.RemoteException -> L106
        L6c:
            com.google.android.gms.ads.admanager.AppEventListener r3 = r12.zzi     // Catch: android.os.RemoteException -> L106
            if (r3 == 0) goto L7a
            com.google.android.gms.ads.internal.client.zzby r4 = r12.zzj     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.internal.ads.zzazj r5 = new com.google.android.gms.internal.ads.zzazj     // Catch: android.os.RemoteException -> L106
            r5.<init>(r3)     // Catch: android.os.RemoteException -> L106
            r4.zzG(r5)     // Catch: android.os.RemoteException -> L106
        L7a:
            com.google.android.gms.ads.VideoOptions r3 = r12.zzk     // Catch: android.os.RemoteException -> L106
            if (r3 == 0) goto L8a
            com.google.android.gms.ads.internal.client.zzby r3 = r12.zzj     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzgb r4 = new com.google.android.gms.ads.internal.client.zzgb     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.VideoOptions r5 = r12.zzk     // Catch: android.os.RemoteException -> L106
            r4.<init>(r5)     // Catch: android.os.RemoteException -> L106
            r3.zzU(r4)     // Catch: android.os.RemoteException -> L106
        L8a:
            com.google.android.gms.ads.internal.client.zzby r3 = r12.zzj     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzft r4 = new com.google.android.gms.ads.internal.client.zzft     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.OnPaidEventListener r5 = r12.zzp     // Catch: android.os.RemoteException -> L106
            r4.<init>(r5)     // Catch: android.os.RemoteException -> L106
            r3.zzP(r4)     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzby r3 = r12.zzj     // Catch: android.os.RemoteException -> L106
            boolean r4 = r12.zzo     // Catch: android.os.RemoteException -> L106
            r3.zzN(r4)     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzby r3 = r12.zzj     // Catch: android.os.RemoteException -> L106
            if (r3 != 0) goto La2
            goto Lec
        La2:
            com.google.android.gms.dynamic.IObjectWrapper r3 = r3.zzn()     // Catch: android.os.RemoteException -> Ldf
            if (r3 == 0) goto Lec
            com.google.android.gms.internal.ads.zzbeb r4 = com.google.android.gms.internal.ads.zzbep.zzf     // Catch: android.os.RemoteException -> Ldf
            java.lang.Object r4 = r4.zze()     // Catch: android.os.RemoteException -> Ldf
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: android.os.RemoteException -> Ldf
            boolean r4 = r4.booleanValue()     // Catch: android.os.RemoteException -> Ldf
            if (r4 == 0) goto Ld3
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzkO     // Catch: android.os.RemoteException -> Ldf
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> Ldf
            java.lang.Object r4 = r5.zza(r4)     // Catch: android.os.RemoteException -> Ldf
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: android.os.RemoteException -> Ldf
            boolean r4 = r4.booleanValue()     // Catch: android.os.RemoteException -> Ldf
            if (r4 == 0) goto Ld3
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza     // Catch: android.os.RemoteException -> Ldf
            com.google.android.gms.ads.internal.client.zzej r5 = new com.google.android.gms.ads.internal.client.zzej     // Catch: android.os.RemoteException -> Ldf
            r5.<init>(r12, r3)     // Catch: android.os.RemoteException -> Ldf
            r4.post(r5)     // Catch: android.os.RemoteException -> Ldf
            goto Lec
        Ld3:
            android.view.ViewGroup r4 = r12.zzm     // Catch: android.os.RemoteException -> Ldf
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: android.os.RemoteException -> Ldf
            android.view.View r3 = (android.view.View) r3     // Catch: android.os.RemoteException -> Ldf
            r4.addView(r3)     // Catch: android.os.RemoteException -> Ldf
            goto Lec
        Ldf:
            r3 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)     // Catch: android.os.RemoteException -> L106
            goto Lec
        Le4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: android.os.RemoteException -> L106
            java.lang.String r1 = "The ad size and ad unit ID must be set before loadAd is called."
            r13.<init>(r1)     // Catch: android.os.RemoteException -> L106
            throw r13     // Catch: android.os.RemoteException -> L106
        Lec:
            if (r13 == 0) goto Lf1
            r13.zzq(r1)     // Catch: android.os.RemoteException -> L106
        Lf1:
            com.google.android.gms.ads.internal.client.zzby r1 = r12.zzj     // Catch: android.os.RemoteException -> L106
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.ads.internal.client.zzr r2 = r12.zzc     // Catch: android.os.RemoteException -> L106
            android.view.ViewGroup r3 = r12.zzm     // Catch: android.os.RemoteException -> L106
            android.content.Context r3 = r3.getContext()     // Catch: android.os.RemoteException -> L106
            com.google.android.gms.ads.internal.client.zzm r13 = r2.zza(r3, r13)     // Catch: android.os.RemoteException -> L106
            r1.zzab(r13)     // Catch: android.os.RemoteException -> L106
            return
        L106:
            r13 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r13)
            return
    }

    public final void zzn() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L7
            r0.zzz()     // Catch: android.os.RemoteException -> L8
        L7:
            return
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    public final void zzo() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzd
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            goto L11
        La:
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> L12
            if (r0 == 0) goto L11
            r0.zzA()     // Catch: android.os.RemoteException -> L12
        L11:
            return
        L12:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    public final void zzp() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L7
            r0.zzB()     // Catch: android.os.RemoteException -> L8
        L7:
            return
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    public final void zzq(com.google.android.gms.ads.internal.client.zza r3) {
            r2 = this;
            r2.zzf = r3     // Catch: android.os.RemoteException -> L13
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> L13
            if (r0 == 0) goto L12
            if (r3 == 0) goto Le
            com.google.android.gms.ads.internal.client.zzb r1 = new com.google.android.gms.ads.internal.client.zzb     // Catch: android.os.RemoteException -> L13
            r1.<init>(r3)     // Catch: android.os.RemoteException -> L13
            goto Lf
        Le:
            r1 = 0
        Lf:
            r0.zzC(r1)     // Catch: android.os.RemoteException -> L13
        L12:
            return
        L13:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    public final void zzr(com.google.android.gms.ads.AdListener r2) {
            r1 = this;
            r1.zzg = r2
            com.google.android.gms.ads.internal.client.zzbd r0 = r1.zza
            r0.zza(r2)
            return
    }

    public final void zzs(com.google.android.gms.ads.AdSize... r2) {
            r1 = this;
            com.google.android.gms.ads.AdSize[] r0 = r1.zzh
            if (r0 != 0) goto L8
            r1.zzt(r2)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The ad size can only be set once on AdView."
            r2.<init>(r0)
            throw r2
    }

    public final void zzt(com.google.android.gms.ads.AdSize... r4) {
            r3 = this;
            r3.zzh = r4
            com.google.android.gms.ads.internal.client.zzby r4 = r3.zzj     // Catch: android.os.RemoteException -> L18
            if (r4 == 0) goto L1e
            android.view.ViewGroup r0 = r3.zzm     // Catch: android.os.RemoteException -> L18
            android.content.Context r0 = r0.getContext()     // Catch: android.os.RemoteException -> L18
            com.google.android.gms.ads.AdSize[] r1 = r3.zzh     // Catch: android.os.RemoteException -> L18
            int r2 = r3.zzn     // Catch: android.os.RemoteException -> L18
            com.google.android.gms.ads.internal.client.zzs r0 = zzD(r0, r1, r2)     // Catch: android.os.RemoteException -> L18
            r4.zzF(r0)     // Catch: android.os.RemoteException -> L18
            goto L1e
        L18:
            r4 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r4)
        L1e:
            android.view.ViewGroup r4 = r3.zzm
            r4.requestLayout()
            return
    }

    public final void zzu(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.zzl
            if (r0 != 0) goto L7
            r1.zzl = r2
            return
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The ad unit ID can only be set once on AdView."
            r2.<init>(r0)
            throw r2
    }

    public final void zzv(com.google.android.gms.ads.admanager.AppEventListener r3) {
            r2 = this;
            r2.zzi = r3     // Catch: android.os.RemoteException -> L13
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> L13
            if (r0 == 0) goto L12
            if (r3 == 0) goto Le
            com.google.android.gms.internal.ads.zzazj r1 = new com.google.android.gms.internal.ads.zzazj     // Catch: android.os.RemoteException -> L13
            r1.<init>(r3)     // Catch: android.os.RemoteException -> L13
            goto Lf
        Le:
            r1 = 0
        Lf:
            r0.zzG(r1)     // Catch: android.os.RemoteException -> L13
        L12:
            return
        L13:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    public final void zzw(boolean r2) {
            r1 = this;
            r1.zzo = r2
            com.google.android.gms.ads.internal.client.zzby r0 = r1.zzj     // Catch: android.os.RemoteException -> La
            if (r0 == 0) goto L9
            r0.zzN(r2)     // Catch: android.os.RemoteException -> La
        L9:
            return
        La:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    public final void zzx(com.google.android.gms.ads.OnPaidEventListener r3) {
            r2 = this;
            r2.zzp = r3     // Catch: android.os.RemoteException -> Lf
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto Le
            com.google.android.gms.ads.internal.client.zzft r1 = new com.google.android.gms.ads.internal.client.zzft     // Catch: android.os.RemoteException -> Lf
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lf
            r0.zzP(r1)     // Catch: android.os.RemoteException -> Lf
        Le:
            return
        Lf:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    public final void zzy(com.google.android.gms.ads.VideoOptions r3) {
            r2 = this;
            r2.zzk = r3
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzj     // Catch: android.os.RemoteException -> L14
            if (r0 == 0) goto L13
            if (r3 != 0) goto La
            r3 = 0
            goto L10
        La:
            com.google.android.gms.ads.internal.client.zzgb r1 = new com.google.android.gms.ads.internal.client.zzgb     // Catch: android.os.RemoteException -> L14
            r1.<init>(r3)     // Catch: android.os.RemoteException -> L14
            r3 = r1
        L10:
            r0.zzU(r3)     // Catch: android.os.RemoteException -> L14
        L13:
            return
        L14:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    public final boolean zzz(com.google.android.gms.ads.internal.client.zzby r4) {
            r3 = this;
            r0 = 0
            com.google.android.gms.dynamic.IObjectWrapper r1 = r4.zzn()     // Catch: android.os.RemoteException -> L24
            if (r1 != 0) goto L8
            goto L23
        L8:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L23
            android.view.ViewGroup r0 = r3.zzm
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            r3.zzj = r4
            r4 = 1
            return r4
        L23:
            return r0
        L24:
            r4 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r4)
            return r0
    }
}
