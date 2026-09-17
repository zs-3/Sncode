package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzpv implements com.google.android.gms.measurement.internal.zzjs {
    private static volatile com.google.android.gms.measurement.internal.zzpv zzb;
    private java.util.List zzA;
    private long zzB;
    private final java.util.Map zzC;
    private final java.util.Map zzD;
    private final java.util.Map zzE;
    private final java.util.Map zzF;
    private com.google.android.gms.measurement.internal.zzmh zzG;
    private java.lang.String zzH;
    private com.google.android.gms.measurement.internal.zzaz zzI;
    private long zzJ;
    private final com.google.android.gms.measurement.internal.zzqe zzK;
    long zza;
    private final com.google.android.gms.measurement.internal.zzif zzc;
    private final com.google.android.gms.measurement.internal.zzhk zzd;
    private com.google.android.gms.measurement.internal.zzaw zze;
    private com.google.android.gms.measurement.internal.zzhm zzf;
    private com.google.android.gms.measurement.internal.zzoy zzg;
    private com.google.android.gms.measurement.internal.zzae zzh;
    private final com.google.android.gms.measurement.internal.zzqa zzi;
    private com.google.android.gms.measurement.internal.zzmc zzj;
    private com.google.android.gms.measurement.internal.zzoa zzk;
    private final com.google.android.gms.measurement.internal.zzpi zzl;
    private com.google.android.gms.measurement.internal.zzhw zzm;
    private final com.google.android.gms.measurement.internal.zzio zzn;
    private final java.util.concurrent.atomic.AtomicBoolean zzo;
    private boolean zzp;
    private java.util.List zzq;
    private final java.util.Deque zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private java.nio.channels.FileLock zzx;
    private java.nio.channels.FileChannel zzy;
    private java.util.List zzz;

    zzpv(com.google.android.gms.measurement.internal.zzpw r3, com.google.android.gms.measurement.internal.zzio r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r4.<init>(r0)
            r2.zzo = r4
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r2.zzr = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.zzF = r4
            com.google.android.gms.measurement.internal.zzpq r4 = new com.google.android.gms.measurement.internal.zzpq
            r4.<init>(r2)
            r2.zzK = r4
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.Context r4 = r3.zza
            r0 = 0
            com.google.android.gms.measurement.internal.zzio r4 = com.google.android.gms.measurement.internal.zzio.zzp(r4, r0, r0)
            r2.zzn = r4
            r0 = -1
            r2.zzB = r0
            com.google.android.gms.measurement.internal.zzpi r4 = new com.google.android.gms.measurement.internal.zzpi
            r4.<init>(r2)
            r2.zzl = r4
            com.google.android.gms.measurement.internal.zzqa r4 = new com.google.android.gms.measurement.internal.zzqa
            r4.<init>(r2)
            r4.zzaw()
            r2.zzi = r4
            com.google.android.gms.measurement.internal.zzhk r4 = new com.google.android.gms.measurement.internal.zzhk
            r4.<init>(r2)
            r4.zzaw()
            r2.zzd = r4
            com.google.android.gms.measurement.internal.zzif r4 = new com.google.android.gms.measurement.internal.zzif
            r4.<init>(r2)
            r4.zzaw()
            r2.zzc = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.zzC = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.zzD = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.zzE = r4
            com.google.android.gms.measurement.internal.zzil r4 = r2.zzaX()
            com.google.android.gms.measurement.internal.zzpk r0 = new com.google.android.gms.measurement.internal.zzpk
            r0.<init>(r2, r3)
            r4.zzq(r0)
            return
    }

    static /* bridge */ /* synthetic */ java.util.Deque zzE(com.google.android.gms.measurement.internal.zzpv r0) {
            java.util.Deque r0 = r0.zzr
            return r0
    }

    static /* bridge */ /* synthetic */ void zzG(com.google.android.gms.measurement.internal.zzpv r0, long r1) {
            r0.zzJ = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzH(com.google.android.gms.measurement.internal.zzpv r3, com.google.android.gms.measurement.internal.zzpw r4) {
            com.google.android.gms.measurement.internal.zzil r4 = r3.zzaX()
            r4.zzg()
            com.google.android.gms.measurement.internal.zzhw r4 = new com.google.android.gms.measurement.internal.zzhw
            r4.<init>(r3)
            r3.zzm = r4
            com.google.android.gms.measurement.internal.zzaw r4 = new com.google.android.gms.measurement.internal.zzaw
            r4.<init>(r3)
            r4.zzaw()
            r3.zze = r4
            com.google.android.gms.measurement.internal.zzif r4 = r3.zzc
            com.google.android.gms.measurement.internal.zzam r0 = r3.zzi()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.measurement.internal.zzal r4 = (com.google.android.gms.measurement.internal.zzal) r4
            r0.zzu(r4)
            com.google.android.gms.measurement.internal.zzoa r4 = new com.google.android.gms.measurement.internal.zzoa
            r4.<init>(r3)
            r4.zzaw()
            r3.zzk = r4
            com.google.android.gms.measurement.internal.zzae r4 = new com.google.android.gms.measurement.internal.zzae
            r4.<init>(r3)
            r4.zzaw()
            r3.zzh = r4
            com.google.android.gms.measurement.internal.zzmc r4 = new com.google.android.gms.measurement.internal.zzmc
            r4.<init>(r3)
            r4.zzaw()
            r3.zzj = r4
            com.google.android.gms.measurement.internal.zzoy r4 = new com.google.android.gms.measurement.internal.zzoy
            r4.<init>(r3)
            r4.zzaw()
            r3.zzg = r4
            com.google.android.gms.measurement.internal.zzhm r4 = new com.google.android.gms.measurement.internal.zzhm
            r4.<init>(r3)
            r3.zzf = r4
            int r4 = r3.zzs
            int r0 = r3.zzt
            if (r4 == r0) goto L75
            com.google.android.gms.measurement.internal.zzhe r4 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            int r0 = r3.zzs
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r3.zzt
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Not all upload components initialized"
            r4.zzc(r2, r0, r1)
        L75:
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.zzo
            r0 = 1
            r4.set(r0)
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            java.lang.String r4 = "UploadController is now fully initialized"
            r3.zza(r4)
            return
    }

    static /* bridge */ /* synthetic */ void zzI(com.google.android.gms.measurement.internal.zzpv r0) {
            r0.zzaJ()
            return
    }

    static /* bridge */ /* synthetic */ void zzJ(android.content.Context r0, android.content.Intent r1) {
            zzaK(r0, r1)
            return
    }

    static final void zzaA(com.google.android.gms.internal.measurement.zzhl r4, int r5, java.lang.String r6) {
            java.util.List r0 = r4.zzp()
            r1 = 0
        L5:
            int r2 = r0.size()
            java.lang.String r3 = "_err"
            if (r1 >= r2) goto L21
            java.lang.Object r2 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzhq r2 = (com.google.android.gms.internal.measurement.zzhq) r2
            java.lang.String r2 = r2.zzg()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1e
            return
        L1e:
            int r1 = r1 + 1
            goto L5
        L21:
            com.google.android.gms.internal.measurement.zzhp r0 = com.google.android.gms.internal.measurement.zzhq.zze()
            r0.zzj(r3)
            long r1 = (long) r5
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            long r1 = r5.longValue()
            r0.zzi(r1)
            com.google.android.gms.internal.measurement.zzmd r5 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5
            com.google.android.gms.internal.measurement.zzhp r0 = com.google.android.gms.internal.measurement.zzhq.zze()
            java.lang.String r1 = "_ev"
            r0.zzj(r1)
            r0.zzk(r6)
            com.google.android.gms.internal.measurement.zzmd r6 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhq r6 = (com.google.android.gms.internal.measurement.zzhq) r6
            r4.zzf(r5)
            r4.zzf(r6)
            return
    }

    static final void zzaB(com.google.android.gms.internal.measurement.zzhl r3, java.lang.String r4) {
            java.util.List r0 = r3.zzp()
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzhq r2 = (com.google.android.gms.internal.measurement.zzhq) r2
            java.lang.String r2 = r2.zzg()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1f
            r3.zzh(r1)
            return
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            return
    }

    private final int zzaC(java.lang.String r7, com.google.android.gms.measurement.internal.zzao r8) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzif r0 = r6.zzc
            com.google.android.gms.internal.measurement.zzgi r1 = r0.zzi(r7)
            r2 = 1
            if (r1 != 0) goto L11
            com.google.android.gms.measurement.internal.zzjw r7 = com.google.android.gms.measurement.internal.zzjw.zzd
            com.google.android.gms.measurement.internal.zzan r0 = com.google.android.gms.measurement.internal.zzan.zzj
            r8.zzd(r7, r0)
            return r2
        L11:
            com.google.android.gms.measurement.internal.zzaw r1 = r6.zzj()
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzl(r7)
            r3 = 0
            if (r1 == 0) goto L41
            java.lang.String r1 = r1.zzK()
            com.google.android.gms.measurement.internal.zze r1 = com.google.android.gms.measurement.internal.zze.zza(r1)
            com.google.android.gms.measurement.internal.zzju r1 = r1.zzb()
            com.google.android.gms.measurement.internal.zzju r4 = com.google.android.gms.measurement.internal.zzju.zzb
            if (r1 != r4) goto L41
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzd
            com.google.android.gms.measurement.internal.zzju r4 = r0.zzf(r7, r1)
            com.google.android.gms.measurement.internal.zzju r5 = com.google.android.gms.measurement.internal.zzju.zza
            if (r4 == r5) goto L41
            com.google.android.gms.measurement.internal.zzan r7 = com.google.android.gms.measurement.internal.zzan.zzi
            r8.zzd(r1, r7)
            com.google.android.gms.measurement.internal.zzju r7 = com.google.android.gms.measurement.internal.zzju.zzd
            if (r4 != r7) goto L40
            return r3
        L40:
            return r2
        L41:
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzd
            com.google.android.gms.measurement.internal.zzan r4 = com.google.android.gms.measurement.internal.zzan.zzb
            r8.zzd(r1, r4)
            boolean r7 = r0.zzu(r7, r1)
            if (r7 == 0) goto L4f
            return r3
        L4f:
            return r2
    }

    private final com.google.android.gms.measurement.internal.zzr zzaD(java.lang.String r44) {
            r43 = this;
            r1 = r44
            com.google.android.gms.measurement.internal.zzaw r0 = r43.zzj()
            com.google.android.gms.measurement.internal.zzh r15 = r0.zzl(r1)
            r0 = 0
            if (r15 == 0) goto Lc1
            java.lang.String r2 = r15.zzF()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L19
            goto Lc1
        L19:
            r14 = r43
            java.lang.Boolean r2 = r14.zzaF(r15)
            if (r2 == 0) goto L39
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L39
            com.google.android.gms.measurement.internal.zzhe r2 = r43.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r44)
            java.lang.String r3 = "App version does not match; dropping. appId"
            r2.zzb(r3, r1)
            return r0
        L39:
            com.google.android.gms.measurement.internal.zzr r42 = new com.google.android.gms.measurement.internal.zzr
            r0 = r42
            java.lang.String r2 = r15.zzH()
            java.lang.String r3 = r15.zzF()
            long r4 = r15.zze()
            java.lang.String r6 = r15.zzE()
            long r7 = r15.zzq()
            long r9 = r15.zzn()
            r11 = 0
            boolean r12 = r15.zzaJ()
            r13 = 0
            java.lang.String r16 = r15.zzG()
            r14 = r16
            r16 = 0
            r27 = r15
            r15 = r16
            r17 = 0
            boolean r18 = r27.zzaI()
            r19 = 0
            java.lang.String r20 = r27.zzA()
            java.lang.Boolean r21 = r27.zzx()
            long r22 = r27.zzo()
            java.util.List r24 = r27.zzN()
            r25 = 0
            com.google.android.gms.measurement.internal.zzjx r26 = r43.zzu(r44)
            java.lang.String r26 = r26.zzq()
            boolean r29 = r27.zzaL()
            long r30 = r27.zzw()
            com.google.android.gms.measurement.internal.zzjx r28 = r43.zzu(r44)
            int r32 = r28.zzb()
            com.google.android.gms.measurement.internal.zzba r28 = r43.zzm(r44)
            java.lang.String r33 = r28.zzj()
            int r34 = r27.zza()
            long r35 = r27.zzf()
            java.lang.String r37 = r27.zzM()
            java.lang.String r38 = r27.zzK()
            int r41 = r27.zzb()
            r28 = 0
            r39 = 0
            java.lang.String r27 = ""
            r1 = r44
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39, r41)
            return r42
        Lc1:
            com.google.android.gms.measurement.internal.zzhe r2 = r43.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzd()
            java.lang.String r3 = "No app data available; dropping"
            r2.zzb(r3, r1)
            return r0
    }

    private final com.google.android.gms.measurement.internal.zzaz zzaE() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzaz r0 = r2.zzI
            if (r0 != 0) goto Ld
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzn
            com.google.android.gms.measurement.internal.zzpn r1 = new com.google.android.gms.measurement.internal.zzpn
            r1.<init>(r2, r0)
            r2.zzI = r1
        Ld:
            com.google.android.gms.measurement.internal.zzaz r0 = r2.zzI
            return r0
    }

    private final java.lang.Boolean zzaF(com.google.android.gms.measurement.internal.zzh r7) {
            r6 = this;
            long r0 = r7.zze()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L2c
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzn     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.Context r0 = r0.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r1 = r7.zzC()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            long r1 = r7.zze()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            long r3 = (long) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L4f
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            return r7
        L2c:
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzn     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.Context r0 = r0.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r1 = r7.zzC()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r0 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r7 = r7.zzF()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            if (r7 == 0) goto L4f
            boolean r7 = r7.equals(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            if (r7 == 0) goto L4f
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            return r7
        L4f:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L52:
            r7 = 0
            return r7
    }

    private static java.lang.String zzaG(java.util.Map r2, java.lang.String r3) {
            if (r2 != 0) goto L3
            goto L3d
        L3:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto Lb
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3d
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L3d:
            r2 = 0
            return r2
    }

    private final void zzaH() {
            r5 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r5.zzaX()
            r0.zzg()
            boolean r0 = r5.zzu
            if (r0 != 0) goto L46
            boolean r0 = r5.zzv
            if (r0 != 0) goto L46
            boolean r0 = r5.zzw
            if (r0 == 0) goto L14
            goto L46
        L14:
            com.google.android.gms.measurement.internal.zzhe r0 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "Stopping uploading service(s)"
            r0.zza(r1)
            java.util.List r0 = r5.zzq
            if (r0 != 0) goto L26
            return
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L2a
        L3a:
            java.util.List r0 = r5.zzq
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.util.List r0 = (java.util.List) r0
            r0.clear()
            return
        L46:
            com.google.android.gms.measurement.internal.zzhe r0 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            boolean r1 = r5.zzu
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r5.zzv
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.zzw
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Not stopping services. fetch, network, upload"
            r0.zzd(r4, r1, r2, r3)
            return
    }

    private final void zzaI(com.google.android.gms.internal.measurement.zzhw r11, long r12, boolean r14) {
            r10 = this;
            r0 = 1
            if (r0 == r14) goto L6
            java.lang.String r1 = "_lte"
            goto L8
        L6:
            java.lang.String r1 = "_se"
        L8:
            com.google.android.gms.measurement.internal.zzaw r2 = r10.zzj()
            java.lang.String r3 = r11.zzaF()
            com.google.android.gms.measurement.internal.zzqd r2 = r2.zzy(r3, r1)
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.zze
            if (r2 != 0) goto L1b
            goto L3c
        L1b:
            com.google.android.gms.measurement.internal.zzqd r9 = new com.google.android.gms.measurement.internal.zzqd
            java.lang.String r3 = r11.zzaF()
            com.google.android.gms.common.util.Clock r4 = r10.zzaU()
            long r6 = r4.currentTimeMillis()
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            long r4 = r4 + r12
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "auto"
            r2 = r9
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r8)
            goto L55
        L3c:
            com.google.android.gms.measurement.internal.zzqd r9 = new com.google.android.gms.measurement.internal.zzqd
            java.lang.String r3 = r11.zzaF()
            com.google.android.gms.common.util.Clock r2 = r10.zzaU()
            long r6 = r2.currentTimeMillis()
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            java.lang.String r4 = "auto"
            r2 = r9
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r8)
        L55:
            com.google.android.gms.internal.measurement.zzin r2 = com.google.android.gms.internal.measurement.zzio.zze()
            r2.zzf(r1)
            com.google.android.gms.common.util.Clock r3 = r10.zzaU()
            long r3 = r3.currentTimeMillis()
            r2.zzg(r3)
            java.lang.Object r3 = r9.zze
            r4 = r3
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r2.zze(r4)
            com.google.android.gms.internal.measurement.zzmd r2 = r2.zzba()
            com.google.android.gms.internal.measurement.zzio r2 = (com.google.android.gms.internal.measurement.zzio) r2
            int r1 = com.google.android.gms.measurement.internal.zzqa.zza(r11, r1)
            if (r1 < 0) goto L83
            r11.zzaC(r1, r2)
            goto L86
        L83:
            r11.zzp(r2)
        L86:
            r1 = 0
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 <= 0) goto La7
            com.google.android.gms.measurement.internal.zzaw r11 = r10.zzj()
            r11.zzai(r9)
            if (r0 == r14) goto L98
            java.lang.String r11 = "lifetime"
            goto L9a
        L98:
            java.lang.String r11 = "session-scoped"
        L9a:
            com.google.android.gms.measurement.internal.zzhe r12 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r12 = r12.zzj()
            java.lang.String r13 = "Updated engagement user property. scope, value"
            r12.zzc(r13, r11, r3)
        La7:
            return
    }

    private final void zzaJ() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r6.zzaX()
            r0.zzg()
            java.util.Deque r0 = r6.zzr
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L51
            com.google.android.gms.measurement.internal.zzaz r0 = r6.zzaE()
            boolean r0 = r0.zze()
            if (r0 != 0) goto L51
            com.google.android.gms.common.util.Clock r0 = r6.zzaU()
            long r0 = r0.elapsedRealtime()
            long r2 = r6.zzJ
            long r0 = r0 - r2
            r2 = 0
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzaA
            r5 = 0
            java.lang.Object r4 = r4.zza(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r4 = (long) r4
            long r4 = r4 - r0
            long r0 = java.lang.Math.max(r2, r4)
            com.google.android.gms.measurement.internal.zzhe r2 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = "Scheduling notify next app runnable, delay in ms"
            r2.zzb(r4, r3)
            com.google.android.gms.measurement.internal.zzaz r2 = r6.zzaE()
            r2.zzd(r0)
        L51:
            return
    }

    private static void zzaK(android.content.Context r3, android.content.Intent r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto La
            r3.sendBroadcast(r4)
            return
        La:
            r0 = 0
            android.app.BroadcastOptions r1 = android.app.BroadcastOptions.makeBasic()
            r2 = 1
            android.app.BroadcastOptions r1 = r1.setShareIdentityEnabled(r2)
            android.os.Bundle r1 = r1.toBundle()
            r3.sendBroadcast(r4, r0, r1)
            return
    }

    private final void zzaL() {
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.zzil r1 = r20.zzaX()
            r1.zzg()
            r20.zzM()
            long r1 = r0.zza
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L4d
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.common.util.Clock r5 = r20.zzaU()
            long r5 = r5.elapsedRealtime()
            long r7 = r0.zza
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L4b
            com.google.android.gms.measurement.internal.zzhe r3 = r20.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.zzb(r2, r1)
            com.google.android.gms.measurement.internal.zzhm r1 = r20.zzq()
            r1.zzc()
            com.google.android.gms.measurement.internal.zzoy r1 = r20.zzx()
            r1.zza()
            return
        L4b:
            r0.zza = r3
        L4d:
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzn
            boolean r1 = r1.zzM()
            if (r1 == 0) goto L24b
            boolean r1 = r20.zzaN()
            if (r1 != 0) goto L5d
            goto L24b
        L5d:
            com.google.android.gms.common.util.Clock r1 = r20.zzaU()
            long r1 = r1.currentTimeMillis()
            r20.zzi()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzN
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzaw r5 = r20.zzj()
            boolean r5 = r5.zzac()
            r10 = 1
            if (r5 != 0) goto L90
            com.google.android.gms.measurement.internal.zzaw r5 = r20.zzj()
            boolean r5 = r5.zzab()
            if (r5 == 0) goto L8f
            goto L90
        L8f:
            r10 = 0
        L90:
            if (r10 == 0) goto Ld0
            com.google.android.gms.measurement.internal.zzam r5 = r20.zzi()
            java.lang.String r5 = r5.zzo()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto Lbc
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto Lbc
            r20.zzi()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzI
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto Le3
        Lbc:
            r20.zzi()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzH
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto Le3
        Ld0:
            r20.zzi()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzG
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        Le3:
            com.google.android.gms.measurement.internal.zzoa r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzhp r5 = r5.zzd
            long r13 = r5.zza()
            com.google.android.gms.measurement.internal.zzoa r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzhp r5 = r5.zze
            long r15 = r5.zza()
            com.google.android.gms.measurement.internal.zzaw r5 = r20.zzj()
            r17 = r10
            long r9 = r5.zzf()
            com.google.android.gms.measurement.internal.zzaw r5 = r20.zzj()
            r18 = r7
            long r6 = r5.zzh()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L112
        L10f:
            r9 = r3
            goto L18a
        L112:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r7 = r1 - r7
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r1 = r1 - r9
            long r9 = r5 + r18
            long r7 = java.lang.Math.max(r7, r1)
            if (r17 == 0) goto L137
            int r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r13 <= 0) goto L137
            long r9 = java.lang.Math.min(r5, r7)
            long r9 = r9 + r11
        L137:
            com.google.android.gms.measurement.internal.zzqa r13 = r20.zzA()
            boolean r13 = r13.zzz(r7, r11)
            if (r13 != 0) goto L143
            long r9 = r7 + r11
        L143:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L18a
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L18a
            r5 = 0
        L14c:
            r20.zzi()
            r6 = 20
            com.google.android.gms.measurement.internal.zzgg r7 = com.google.android.gms.measurement.internal.zzgi.zzP
            r8 = 0
            java.lang.Object r7 = r7.zza(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r11 = 0
            int r7 = java.lang.Math.max(r11, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L10f
            r6 = 1
            long r6 = r6 << r5
            r20.zzi()
            com.google.android.gms.measurement.internal.zzgg r12 = com.google.android.gms.measurement.internal.zzgi.zzO
            java.lang.Object r12 = r12.zza(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r9 = r9 + r12
            int r6 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r6 <= 0) goto L187
            goto L18a
        L187:
            int r5 = r5 + 1
            goto L14c
        L18a:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 != 0) goto L1aa
            com.google.android.gms.measurement.internal.zzhe r1 = r20.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Next upload time is 0"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzhm r1 = r20.zzq()
            r1.zzc()
            com.google.android.gms.measurement.internal.zzoy r1 = r20.zzx()
            r1.zza()
            return
        L1aa:
            com.google.android.gms.measurement.internal.zzhk r1 = r20.zzp()
            boolean r1 = r1.zzd()
            if (r1 == 0) goto L22f
            com.google.android.gms.measurement.internal.zzoa r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzhp r1 = r1.zzc
            long r1 = r1.zza()
            r20.zzi()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzE
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzqa r7 = r20.zzA()
            boolean r7 = r7.zzz(r1, r5)
            if (r7 != 0) goto L1df
            long r1 = r1 + r5
            long r9 = java.lang.Math.max(r9, r1)
        L1df:
            com.google.android.gms.measurement.internal.zzhm r1 = r20.zzq()
            r1.zzc()
            com.google.android.gms.common.util.Clock r1 = r20.zzaU()
            long r1 = r1.currentTimeMillis()
            long r9 = r9 - r1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 > 0) goto L216
            r20.zzi()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzJ
            r2 = 0
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r9 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzoa r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzhp r1 = r1.zzd
            com.google.android.gms.common.util.Clock r2 = r20.zzaU()
            long r2 = r2.currentTimeMillis()
            r1.zzb(r2)
        L216:
            com.google.android.gms.measurement.internal.zzhe r1 = r20.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzoy r1 = r20.zzx()
            r1.zzd(r9)
            return
        L22f:
            com.google.android.gms.measurement.internal.zzhe r1 = r20.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "No network"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzhm r1 = r20.zzq()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzoy r1 = r20.zzx()
            r1.zza()
            return
        L24b:
            com.google.android.gms.measurement.internal.zzhe r1 = r20.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzhm r1 = r20.zzq()
            r1.zzc()
            com.google.android.gms.measurement.internal.zzoy r1 = r20.zzx()
            r1.zza()
            return
    }

    private final boolean zzaM(java.lang.String r43, long r44) {
            r42 = this;
            r1 = r42
            java.lang.String r2 = "purchase"
            java.lang.String r3 = "_ai"
            java.lang.String r4 = "items"
            com.google.android.gms.measurement.internal.zzaw r5 = r42.zzj()
            r5.zzH()
            com.google.android.gms.measurement.internal.zzpr r5 = new com.google.android.gms.measurement.internal.zzpr     // Catch: java.lang.Throwable -> Le8a
            r13 = 0
            r5.<init>(r1, r13)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzaw r6 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            long r10 = r1.zzB     // Catch: java.lang.Throwable -> Le8a
            r7 = r43
            r8 = r44
            r12 = r5
            r6.zzat(r7, r8, r10, r12)     // Catch: java.lang.Throwable -> Le8a
            java.util.List r6 = r5.zzc     // Catch: java.lang.Throwable -> Le8a
            if (r6 == 0) goto Le77
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> Le8a
            if (r6 == 0) goto L2f
            goto Le77
        L2f:
            com.google.android.gms.internal.measurement.zzhx r6 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzlz r6 = r6.zzch()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhw r6 = (com.google.android.gms.internal.measurement.zzhw) r6     // Catch: java.lang.Throwable -> Le8a
            r6.zzu()     // Catch: java.lang.Throwable -> Le8a
            r15 = r13
            r16 = r15
            r7 = -1
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
        L43:
            java.util.List r9 = r5.zzc     // Catch: java.lang.Throwable -> Le8a
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r13 = "_fr"
            r17 = r14
            java.lang.String r14 = "_et"
            r18 = r11
            java.lang.String r11 = "_e"
            r20 = r14
            r19 = r15
            if (r10 >= r9) goto L6a0
            java.util.List r9 = r5.zzc     // Catch: java.lang.Throwable -> Le8a
            java.lang.Object r9 = r9.get(r10)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhm r9 = (com.google.android.gms.internal.measurement.zzhm) r9     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzlz r9 = r9.zzch()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhl r9 = (com.google.android.gms.internal.measurement.zzhl) r9     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzif r14 = r42.zzr()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r15 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r15 = r15.zzF()     // Catch: java.lang.Throwable -> Le8a
            r23 = r10
            java.lang.String r10 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            boolean r10 = r14.zzx(r15, r10)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r14 = "_err"
            if (r10 == 0) goto L101
            com.google.android.gms.measurement.internal.zzhe r10 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzk()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r11 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzhx r13 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r13 = r13.zzF()     // Catch: java.lang.Throwable -> Le8a
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzhe.zzn(r13)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzio r15 = r1.zzn     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzgx r15 = r15.zzj()     // Catch: java.lang.Throwable -> Le8a
            r24 = r4
            java.lang.String r4 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r4 = r15.zzd(r4)     // Catch: java.lang.Throwable -> Le8a
            r10.zzc(r11, r13, r4)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzif r4 = r42.zzr()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r10 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r10.zzF()     // Catch: java.lang.Throwable -> Le8a
            boolean r4 = r4.zzt(r10)     // Catch: java.lang.Throwable -> Le8a
            if (r4 != 0) goto Lec
            com.google.android.gms.measurement.internal.zzif r4 = r42.zzr()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r10 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r10.zzF()     // Catch: java.lang.Throwable -> Le8a
            boolean r4 = r4.zzy(r10)     // Catch: java.lang.Throwable -> Le8a
            if (r4 == 0) goto Lc7
            goto Lec
        Lc7:
            java.lang.String r4 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            boolean r4 = r14.equals(r4)     // Catch: java.lang.Throwable -> Le8a
            if (r4 != 0) goto Lec
            com.google.android.gms.measurement.internal.zzqf r25 = r42.zzB()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzqe r4 = r1.zzK     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r10 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r27 = r10.zzF()     // Catch: java.lang.Throwable -> Le8a
            r28 = 11
            java.lang.String r29 = "_ev"
            java.lang.String r30 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            r31 = 0
            r26 = r4
            r25.zzR(r26, r27, r28, r29, r30, r31)     // Catch: java.lang.Throwable -> Le8a
        Lec:
            r26 = r2
            r27 = r3
            r4 = r6
            r20 = r8
            r28 = r12
            r14 = r17
            r11 = r18
            r15 = r19
            r8 = r23
            r12 = r24
            goto L691
        L101:
            r24 = r4
            com.google.android.gms.internal.measurement.zzoy.zzb()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzam r4 = r42.zzi()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzgg r10 = com.google.android.gms.measurement.internal.zzgi.zzbf     // Catch: java.lang.Throwable -> Le8a
            r15 = 0
            boolean r4 = r4.zzx(r15, r10)     // Catch: java.lang.Throwable -> Le8a
            if (r4 == 0) goto L165
            java.lang.String r4 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            boolean r10 = r4.equals(r2)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r15 = "ecommerce_purchase"
            r25 = r8
            java.lang.String r8 = "_iap"
            if (r10 != 0) goto L12f
            boolean r10 = r4.equals(r8)     // Catch: java.lang.Throwable -> Le8a
            if (r10 != 0) goto L12f
            boolean r4 = r4.equals(r15)     // Catch: java.lang.Throwable -> Le8a
            if (r4 == 0) goto L167
        L12f:
            com.google.android.gms.internal.measurement.zzhp r4 = com.google.android.gms.internal.measurement.zzhq.zze()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = "_cbs"
            r4.zzj(r10)     // Catch: java.lang.Throwable -> Le8a
            if (r12 != 0) goto L155
            com.google.android.gms.internal.measurement.zzhx r10 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r10.zzF()     // Catch: java.lang.Throwable -> Le8a
            boolean r12 = r1.zzaO(r10, r2)     // Catch: java.lang.Throwable -> Le8a
            if (r12 == 0) goto L155
            boolean r8 = r1.zzaO(r10, r8)     // Catch: java.lang.Throwable -> Le8a
            if (r8 == 0) goto L155
            boolean r8 = r1.zzaO(r10, r15)     // Catch: java.lang.Throwable -> Le8a
            if (r8 == 0) goto L155
            java.lang.String r8 = "new_buyer"
            goto L157
        L155:
            java.lang.String r8 = "returning_buyer"
        L157:
            r4.zzk(r8)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzmd r4 = r4.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r4 = (com.google.android.gms.internal.measurement.zzhq) r4     // Catch: java.lang.Throwable -> Le8a
            r9.zzf(r4)     // Catch: java.lang.Throwable -> Le8a
            r12 = 1
            goto L167
        L165:
            r25 = r8
        L167:
            java.lang.String r4 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = com.google.android.gms.measurement.internal.zzjy.zza(r3)     // Catch: java.lang.Throwable -> Le8a
            boolean r4 = r4.equals(r8)     // Catch: java.lang.Throwable -> Le8a
            if (r4 == 0) goto L1d9
            r9.zzi(r3)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhe r4 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = "Renaming ad_impression to _ai"
            r4.zza(r8)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhe r4 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r4 = r4.zzr()     // Catch: java.lang.Throwable -> Le8a
            r8 = 5
            boolean r4 = android.util.Log.isLoggable(r4, r8)     // Catch: java.lang.Throwable -> Le8a
            if (r4 == 0) goto L1d9
            r4 = 0
        L195:
            int r8 = r9.zza()     // Catch: java.lang.Throwable -> Le8a
            if (r4 >= r8) goto L1d9
            java.lang.String r8 = "ad_platform"
            com.google.android.gms.internal.measurement.zzhq r10 = r9.zzn(r4)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r10.zzg()     // Catch: java.lang.Throwable -> Le8a
            boolean r8 = r8.equals(r10)     // Catch: java.lang.Throwable -> Le8a
            if (r8 == 0) goto L1d6
            com.google.android.gms.internal.measurement.zzhq r8 = r9.zzn(r4)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = r8.zzh()     // Catch: java.lang.Throwable -> Le8a
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> Le8a
            if (r8 != 0) goto L1d6
            java.lang.String r8 = "admob"
            com.google.android.gms.internal.measurement.zzhq r10 = r9.zzn(r4)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r10.zzh()     // Catch: java.lang.Throwable -> Le8a
            boolean r8 = r8.equalsIgnoreCase(r10)     // Catch: java.lang.Throwable -> Le8a
            if (r8 == 0) goto L1d6
            com.google.android.gms.measurement.internal.zzhe r8 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzl()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.zza(r10)     // Catch: java.lang.Throwable -> Le8a
        L1d6:
            int r4 = r4 + 1
            goto L195
        L1d9:
            com.google.android.gms.measurement.internal.zzif r4 = r42.zzr()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r8 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = r8.zzF()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            boolean r4 = r4.zzw(r8, r10)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = "_c"
            if (r4 != 0) goto L21f
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch: java.lang.Throwable -> Le8a
            int r15 = r10.hashCode()     // Catch: java.lang.Throwable -> Le8a
            r26 = r2
            r2 = 95027(0x17333, float:1.33161E-40)
            if (r15 == r2) goto L205
            goto L20f
        L205:
            java.lang.String r2 = "_ui"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L20f
            r2 = 0
            goto L210
        L20f:
            r2 = -1
        L210:
            if (r2 == 0) goto L221
            r27 = r3
            r29 = r6
            r30 = r7
            r28 = r12
            r14 = r17
            r4 = 0
            goto L3f0
        L21f:
            r26 = r2
        L221:
            r27 = r3
            r2 = 0
            r10 = 0
            r15 = 0
        L226:
            int r3 = r9.zza()     // Catch: java.lang.Throwable -> Le8a
            r28 = r12
            java.lang.String r12 = "_r"
            if (r2 >= r3) goto L290
            com.google.android.gms.internal.measurement.zzhq r3 = r9.zzn(r2)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r3 = r3.zzg()     // Catch: java.lang.Throwable -> Le8a
            boolean r3 = r8.equals(r3)     // Catch: java.lang.Throwable -> Le8a
            if (r3 == 0) goto L25c
            com.google.android.gms.internal.measurement.zzhq r3 = r9.zzn(r2)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzlz r3 = r3.zzch()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhp r3 = (com.google.android.gms.internal.measurement.zzhp) r3     // Catch: java.lang.Throwable -> Le8a
            r29 = r6
            r30 = r7
            r6 = 1
            r3.zzi(r6)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzmd r3 = r3.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3     // Catch: java.lang.Throwable -> Le8a
            r9.zzk(r2, r3)     // Catch: java.lang.Throwable -> Le8a
            r10 = 1
            goto L287
        L25c:
            r29 = r6
            r30 = r7
            com.google.android.gms.internal.measurement.zzhq r3 = r9.zzn(r2)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r3 = r3.zzg()     // Catch: java.lang.Throwable -> Le8a
            boolean r3 = r12.equals(r3)     // Catch: java.lang.Throwable -> Le8a
            if (r3 == 0) goto L287
            com.google.android.gms.internal.measurement.zzhq r3 = r9.zzn(r2)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzlz r3 = r3.zzch()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhp r3 = (com.google.android.gms.internal.measurement.zzhp) r3     // Catch: java.lang.Throwable -> Le8a
            r6 = 1
            r3.zzi(r6)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzmd r3 = r3.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3     // Catch: java.lang.Throwable -> Le8a
            r9.zzk(r2, r3)     // Catch: java.lang.Throwable -> Le8a
            r15 = 1
        L287:
            int r2 = r2 + 1
            r12 = r28
            r6 = r29
            r7 = r30
            goto L226
        L290:
            r29 = r6
            r30 = r7
            if (r10 != 0) goto L2c2
            if (r4 == 0) goto L2c2
            com.google.android.gms.measurement.internal.zzhe r2 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r3 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzio r6 = r1.zzn     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzgx r6 = r6.zzj()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r6 = r6.zzd(r7)     // Catch: java.lang.Throwable -> Le8a
            r2.zzb(r3, r6)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhp r2 = com.google.android.gms.internal.measurement.zzhq.zze()     // Catch: java.lang.Throwable -> Le8a
            r2.zzj(r8)     // Catch: java.lang.Throwable -> Le8a
            r6 = 1
            r2.zzi(r6)     // Catch: java.lang.Throwable -> Le8a
            r9.zze(r2)     // Catch: java.lang.Throwable -> Le8a
        L2c2:
            if (r15 != 0) goto L2ee
            com.google.android.gms.measurement.internal.zzhe r2 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r3 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzio r6 = r1.zzn     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzgx r6 = r6.zzj()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r6 = r6.zzd(r7)     // Catch: java.lang.Throwable -> Le8a
            r2.zzb(r3, r6)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhp r2 = com.google.android.gms.internal.measurement.zzhq.zze()     // Catch: java.lang.Throwable -> Le8a
            r2.zzj(r12)     // Catch: java.lang.Throwable -> Le8a
            r6 = 1
            r2.zzi(r6)     // Catch: java.lang.Throwable -> Le8a
            r9.zze(r2)     // Catch: java.lang.Throwable -> Le8a
        L2ee:
            com.google.android.gms.measurement.internal.zzaw r31 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            long r32 = r42.zza()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r2 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r34 = r2.zzF()     // Catch: java.lang.Throwable -> Le8a
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 1
            r40 = 0
            r41 = 0
            com.google.android.gms.measurement.internal.zzas r2 = r31.zzo(r32, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch: java.lang.Throwable -> Le8a
            long r2 = r2.zze     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzam r6 = r42.zzi()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r7 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = r7.zzF()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzgg r10 = com.google.android.gms.measurement.internal.zzgi.zzo     // Catch: java.lang.Throwable -> Le8a
            int r6 = r6.zzh(r7, r10)     // Catch: java.lang.Throwable -> Le8a
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Le8a
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 <= 0) goto L329
            zzaB(r9, r12)     // Catch: java.lang.Throwable -> Le8a
            goto L32b
        L329:
            r17 = 1
        L32b:
            java.lang.String r2 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            boolean r2 = com.google.android.gms.measurement.internal.zzqf.zzaq(r2)     // Catch: java.lang.Throwable -> Le8a
            if (r2 == 0) goto L3ee
            if (r4 == 0) goto L3ee
            com.google.android.gms.measurement.internal.zzaw r31 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            long r32 = r42.zza()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r2 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r34 = r2.zzF()     // Catch: java.lang.Throwable -> Le8a
            r35 = 0
            r36 = 0
            r37 = 1
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            com.google.android.gms.measurement.internal.zzas r2 = r31.zzo(r32, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch: java.lang.Throwable -> Le8a
            long r2 = r2.zzc     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzam r6 = r42.zzi()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r7 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = r7.zzF()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzgg r10 = com.google.android.gms.measurement.internal.zzgi.zzn     // Catch: java.lang.Throwable -> Le8a
            int r6 = r6.zzh(r7, r10)     // Catch: java.lang.Throwable -> Le8a
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Le8a
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 <= 0) goto L3ee
            com.google.android.gms.measurement.internal.zzhe r2 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzhx r6 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r6 = r6.zzF()     // Catch: java.lang.Throwable -> Le8a
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: java.lang.Throwable -> Le8a
            r2.zzb(r3, r6)     // Catch: java.lang.Throwable -> Le8a
            r2 = 0
            r3 = 0
            r6 = -1
            r7 = 0
        L389:
            int r10 = r9.zza()     // Catch: java.lang.Throwable -> Le8a
            if (r2 >= r10) goto L3b4
            com.google.android.gms.internal.measurement.zzhq r10 = r9.zzn(r2)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r12 = r10.zzg()     // Catch: java.lang.Throwable -> Le8a
            boolean r12 = r8.equals(r12)     // Catch: java.lang.Throwable -> Le8a
            if (r12 == 0) goto L3a6
            com.google.android.gms.internal.measurement.zzlz r6 = r10.zzch()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhp r6 = (com.google.android.gms.internal.measurement.zzhp) r6     // Catch: java.lang.Throwable -> Le8a
            r7 = r6
            r6 = r2
            goto L3b1
        L3a6:
            java.lang.String r10 = r10.zzg()     // Catch: java.lang.Throwable -> Le8a
            boolean r10 = r14.equals(r10)     // Catch: java.lang.Throwable -> Le8a
            if (r10 == 0) goto L3b1
            r3 = 1
        L3b1:
            int r2 = r2 + 1
            goto L389
        L3b4:
            if (r3 == 0) goto L3bd
            if (r7 == 0) goto L3bc
            r9.zzh(r6)     // Catch: java.lang.Throwable -> Le8a
            goto L3ee
        L3bc:
            r7 = 0
        L3bd:
            if (r7 == 0) goto L3d7
            com.google.android.gms.internal.measurement.zzlz r2 = r7.zzaX()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhp r2 = (com.google.android.gms.internal.measurement.zzhp) r2     // Catch: java.lang.Throwable -> Le8a
            r2.zzj(r14)     // Catch: java.lang.Throwable -> Le8a
            r14 = 10
            r2.zzi(r14)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzmd r2 = r2.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r2 = (com.google.android.gms.internal.measurement.zzhq) r2     // Catch: java.lang.Throwable -> Le8a
            r9.zzk(r6, r2)     // Catch: java.lang.Throwable -> Le8a
            goto L3ee
        L3d7:
            com.google.android.gms.measurement.internal.zzhe r2 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r3 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzhx r6 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r6 = r6.zzF()     // Catch: java.lang.Throwable -> Le8a
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: java.lang.Throwable -> Le8a
            r2.zzb(r3, r6)     // Catch: java.lang.Throwable -> Le8a
        L3ee:
            r14 = r17
        L3f0:
            if (r4 == 0) goto L4a9
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le8a
            java.util.List r3 = r9.zzp()     // Catch: java.lang.Throwable -> Le8a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8a
            r3 = 0
            r4 = -1
            r6 = -1
        L3fe:
            int r7 = r2.size()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = "currency"
            java.lang.String r12 = "value"
            if (r3 >= r7) goto L42e
            java.lang.Object r7 = r2.get(r3)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r7 = (com.google.android.gms.internal.measurement.zzhq) r7     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = r7.zzg()     // Catch: java.lang.Throwable -> Le8a
            boolean r7 = r12.equals(r7)     // Catch: java.lang.Throwable -> Le8a
            if (r7 == 0) goto L41a
            r4 = r3
            goto L42b
        L41a:
            java.lang.Object r7 = r2.get(r3)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r7 = (com.google.android.gms.internal.measurement.zzhq) r7     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = r7.zzg()     // Catch: java.lang.Throwable -> Le8a
            boolean r7 = r10.equals(r7)     // Catch: java.lang.Throwable -> Le8a
            if (r7 == 0) goto L42b
            r6 = r3
        L42b:
            int r3 = r3 + 1
            goto L3fe
        L42e:
            r3 = -1
            if (r4 != r3) goto L433
            goto L4aa
        L433:
            java.lang.Object r3 = r2.get(r4)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3     // Catch: java.lang.Throwable -> Le8a
            boolean r3 = r3.zzw()     // Catch: java.lang.Throwable -> Le8a
            if (r3 != 0) goto L464
            java.lang.Object r3 = r2.get(r4)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3     // Catch: java.lang.Throwable -> Le8a
            boolean r3 = r3.zzu()     // Catch: java.lang.Throwable -> Le8a
            if (r3 != 0) goto L464
            com.google.android.gms.measurement.internal.zzhe r2 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzl()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.zza(r3)     // Catch: java.lang.Throwable -> Le8a
            r9.zzh(r4)     // Catch: java.lang.Throwable -> Le8a
            zzaB(r9, r8)     // Catch: java.lang.Throwable -> Le8a
            r2 = 18
            zzaA(r9, r2, r12)     // Catch: java.lang.Throwable -> Le8a
            goto L4a9
        L464:
            r3 = -1
            if (r6 != r3) goto L468
            goto L490
        L468:
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r2 = (com.google.android.gms.internal.measurement.zzhq) r2     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r2 = r2.zzh()     // Catch: java.lang.Throwable -> Le8a
            int r6 = r2.length()     // Catch: java.lang.Throwable -> Le8a
            r7 = 3
            if (r6 != r7) goto L490
            r6 = 0
        L47a:
            int r7 = r2.length()     // Catch: java.lang.Throwable -> Le8a
            if (r6 >= r7) goto L4aa
            int r7 = r2.codePointAt(r6)     // Catch: java.lang.Throwable -> Le8a
            boolean r12 = java.lang.Character.isLetter(r7)     // Catch: java.lang.Throwable -> Le8a
            if (r12 == 0) goto L490
            int r7 = java.lang.Character.charCount(r7)     // Catch: java.lang.Throwable -> Le8a
            int r6 = r6 + r7
            goto L47a
        L490:
            com.google.android.gms.measurement.internal.zzhe r2 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzl()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r6 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.zza(r6)     // Catch: java.lang.Throwable -> Le8a
            r9.zzh(r4)     // Catch: java.lang.Throwable -> Le8a
            zzaB(r9, r8)     // Catch: java.lang.Throwable -> Le8a
            r2 = 19
            zzaA(r9, r2, r10)     // Catch: java.lang.Throwable -> Le8a
            goto L4aa
        L4a9:
            r3 = -1
        L4aa:
            java.lang.String r2 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            boolean r2 = r11.equals(r2)     // Catch: java.lang.Throwable -> Le8a
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L502
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzmd r2 = r9.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhm r2 = (com.google.android.gms.internal.measurement.zzhm) r2     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r2 = com.google.android.gms.measurement.internal.zzqa.zzG(r2, r13)     // Catch: java.lang.Throwable -> Le8a
            if (r2 != 0) goto L4fd
            if (r16 == 0) goto L4f3
            long r10 = r16.zzc()     // Catch: java.lang.Throwable -> Le8a
            long r12 = r9.zzc()     // Catch: java.lang.Throwable -> Le8a
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> Le8a
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L4f3
            com.google.android.gms.internal.measurement.zzlz r2 = r16.zzaX()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhl r2 = (com.google.android.gms.internal.measurement.zzhl) r2     // Catch: java.lang.Throwable -> Le8a
            boolean r4 = r1.zzaP(r9, r2)     // Catch: java.lang.Throwable -> Le8a
            if (r4 == 0) goto L4f3
            r4 = r29
            r8 = r30
            r4.zzad(r8, r2)     // Catch: java.lang.Throwable -> Le8a
            r7 = r8
            r8 = r25
            r15 = 0
            r16 = 0
            goto L55c
        L4f3:
            r4 = r29
            r8 = r30
            r7 = r8
            r15 = r9
            r8 = r18
            goto L55c
        L4fd:
            r4 = r29
            r8 = r30
            goto L556
        L502:
            r4 = r29
            r8 = r30
            java.lang.String r2 = "_vs"
            java.lang.String r10 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            boolean r2 = r2.equals(r10)     // Catch: java.lang.Throwable -> Le8a
            if (r2 == 0) goto L556
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzmd r2 = r9.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhm r2 = (com.google.android.gms.internal.measurement.zzhm) r2     // Catch: java.lang.Throwable -> Le8a
            r10 = r20
            com.google.android.gms.internal.measurement.zzhq r2 = com.google.android.gms.measurement.internal.zzqa.zzG(r2, r10)     // Catch: java.lang.Throwable -> Le8a
            if (r2 != 0) goto L556
            if (r19 == 0) goto L54c
            long r10 = r19.zzc()     // Catch: java.lang.Throwable -> Le8a
            long r12 = r9.zzc()     // Catch: java.lang.Throwable -> Le8a
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> Le8a
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L54c
            com.google.android.gms.internal.measurement.zzlz r2 = r19.zzaX()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhl r2 = (com.google.android.gms.internal.measurement.zzhl) r2     // Catch: java.lang.Throwable -> Le8a
            boolean r6 = r1.zzaP(r2, r9)     // Catch: java.lang.Throwable -> Le8a
            if (r6 == 0) goto L54c
            r6 = r25
            r4.zzad(r6, r2)     // Catch: java.lang.Throwable -> Le8a
            r7 = r8
            r15 = 0
            r16 = 0
            goto L55b
        L54c:
            r6 = r25
            r8 = r6
            r16 = r9
            r7 = r18
            r15 = r19
            goto L55c
        L556:
            r6 = r25
            r7 = r8
            r15 = r19
        L55b:
            r8 = r6
        L55c:
            int r2 = r9.zza()     // Catch: java.lang.Throwable -> Le8a
            if (r2 == 0) goto L677
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            java.util.List r2 = r9.zzp()     // Catch: java.lang.Throwable -> Le8a
            android.os.Bundle r2 = com.google.android.gms.measurement.internal.zzqa.zzF(r2)     // Catch: java.lang.Throwable -> Le8a
            r6 = 0
        L56e:
            int r10 = r9.zza()     // Catch: java.lang.Throwable -> Le8a
            if (r6 >= r10) goto L623
            com.google.android.gms.internal.measurement.zzhq r10 = r9.zzn(r6)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r11 = r10.zzg()     // Catch: java.lang.Throwable -> Le8a
            r12 = r24
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> Le8a
            if (r11 == 0) goto L5f7
            java.util.List r11 = r10.zzi()     // Catch: java.lang.Throwable -> Le8a
            boolean r11 = r11.isEmpty()     // Catch: java.lang.Throwable -> Le8a
            if (r11 != 0) goto L5f7
            com.google.android.gms.internal.measurement.zzhx r11 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r11 = r11.zzF()     // Catch: java.lang.Throwable -> Le8a
            java.util.List r10 = r10.zzi()     // Catch: java.lang.Throwable -> Le8a
            int r13 = r10.size()     // Catch: java.lang.Throwable -> Le8a
            android.os.Bundle[] r13 = new android.os.Bundle[r13]     // Catch: java.lang.Throwable -> Le8a
            r17 = r7
            r3 = 0
        L5a1:
            int r7 = r10.size()     // Catch: java.lang.Throwable -> Le8a
            if (r3 >= r7) goto L5f1
            java.lang.Object r7 = r10.get(r3)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r7 = (com.google.android.gms.internal.measurement.zzhq) r7     // Catch: java.lang.Throwable -> Le8a
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            java.util.List r19 = r7.zzi()     // Catch: java.lang.Throwable -> Le8a
            r20 = r8
            android.os.Bundle r8 = com.google.android.gms.measurement.internal.zzqa.zzF(r19)     // Catch: java.lang.Throwable -> Le8a
            java.util.List r7 = r7.zzi()     // Catch: java.lang.Throwable -> Le8a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Le8a
        L5c2:
            boolean r19 = r7.hasNext()     // Catch: java.lang.Throwable -> Le8a
            if (r19 == 0) goto L5e6
            java.lang.Object r19 = r7.next()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r19 = (com.google.android.gms.internal.measurement.zzhq) r19     // Catch: java.lang.Throwable -> Le8a
            r21 = r7
            java.lang.String r7 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzlz r19 = r19.zzch()     // Catch: java.lang.Throwable -> Le8a
            r22 = r10
            r10 = r19
            com.google.android.gms.internal.measurement.zzhp r10 = (com.google.android.gms.internal.measurement.zzhp) r10     // Catch: java.lang.Throwable -> Le8a
            r1.zzaw(r7, r10, r8, r11)     // Catch: java.lang.Throwable -> Le8a
            r7 = r21
            r10 = r22
            goto L5c2
        L5e6:
            r22 = r10
            r13[r3] = r8     // Catch: java.lang.Throwable -> Le8a
            int r3 = r3 + 1
            r8 = r20
            r10 = r22
            goto L5a1
        L5f1:
            r20 = r8
            r2.putParcelableArray(r12, r13)     // Catch: java.lang.Throwable -> Le8a
            goto L618
        L5f7:
            r17 = r7
            r20 = r8
            java.lang.String r3 = r10.zzg()     // Catch: java.lang.Throwable -> Le8a
            boolean r3 = r3.equals(r12)     // Catch: java.lang.Throwable -> Le8a
            if (r3 != 0) goto L618
            java.lang.String r3 = r9.zzo()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzlz r7 = r10.zzch()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhp r7 = (com.google.android.gms.internal.measurement.zzhp) r7     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r8 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = r8.zzF()     // Catch: java.lang.Throwable -> Le8a
            r1.zzaw(r3, r7, r2, r8)     // Catch: java.lang.Throwable -> Le8a
        L618:
            int r6 = r6 + 1
            r24 = r12
            r7 = r17
            r8 = r20
            r3 = -1
            goto L56e
        L623:
            r17 = r7
            r20 = r8
            r12 = r24
            r9.zzg()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzqa r3 = r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le8a
            r6.<init>()     // Catch: java.lang.Throwable -> Le8a
            java.util.Set r7 = r2.keySet()     // Catch: java.lang.Throwable -> Le8a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Le8a
        L63d:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> Le8a
            if (r8 == 0) goto L663
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhp r10 = com.google.android.gms.internal.measurement.zzhq.zze()     // Catch: java.lang.Throwable -> Le8a
            r10.zzj(r8)     // Catch: java.lang.Throwable -> Le8a
            java.lang.Object r8 = r2.get(r8)     // Catch: java.lang.Throwable -> Le8a
            if (r8 == 0) goto L63d
            r3.zzw(r10, r8)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzmd r8 = r10.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r8 = (com.google.android.gms.internal.measurement.zzhq) r8     // Catch: java.lang.Throwable -> Le8a
            r6.add(r8)     // Catch: java.lang.Throwable -> Le8a
            goto L63d
        L663:
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> Le8a
        L667:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Le8a
            if (r3 == 0) goto L67d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3     // Catch: java.lang.Throwable -> Le8a
            r9.zzf(r3)     // Catch: java.lang.Throwable -> Le8a
            goto L667
        L677:
            r17 = r7
            r20 = r8
            r12 = r24
        L67d:
            java.util.List r2 = r5.zzc     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzmd r3 = r9.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhm r3 = (com.google.android.gms.internal.measurement.zzhm) r3     // Catch: java.lang.Throwable -> Le8a
            r8 = r23
            r2.set(r8, r3)     // Catch: java.lang.Throwable -> Le8a
            r4.zzn(r9)     // Catch: java.lang.Throwable -> Le8a
            int r11 = r18 + 1
            r7 = r17
        L691:
            int r10 = r8 + 1
            r6 = r4
            r4 = r12
            r8 = r20
            r2 = r26
            r3 = r27
            r12 = r28
            r13 = 0
            goto L43
        L6a0:
            r4 = r6
            r10 = r20
            r2 = 0
            r8 = r2
            r7 = r18
            r6 = 0
        L6a9:
            if (r6 >= r7) goto L6f5
            com.google.android.gms.internal.measurement.zzhm r12 = r4.zzh(r6)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r14 = r12.zzh()     // Catch: java.lang.Throwable -> Le8a
            boolean r14 = r11.equals(r14)     // Catch: java.lang.Throwable -> Le8a
            if (r14 == 0) goto L6ca
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r14 = com.google.android.gms.measurement.internal.zzqa.zzG(r12, r13)     // Catch: java.lang.Throwable -> Le8a
            if (r14 == 0) goto L6ca
            r4.zzD(r6)     // Catch: java.lang.Throwable -> Le8a
            int r7 = r7 + (-1)
            int r6 = r6 + (-1)
            goto L6f2
        L6ca:
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhq r12 = com.google.android.gms.measurement.internal.zzqa.zzG(r12, r10)     // Catch: java.lang.Throwable -> Le8a
            if (r12 == 0) goto L6f2
            boolean r14 = r12.zzw()     // Catch: java.lang.Throwable -> Le8a
            if (r14 == 0) goto L6e2
            long r14 = r12.zzd()     // Catch: java.lang.Throwable -> Le8a
            java.lang.Long r12 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> Le8a
            goto L6e3
        L6e2:
            r12 = 0
        L6e3:
            if (r12 == 0) goto L6f2
            long r14 = r12.longValue()     // Catch: java.lang.Throwable -> Le8a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 <= 0) goto L6f2
            long r14 = r12.longValue()     // Catch: java.lang.Throwable -> Le8a
            long r8 = r8 + r14
        L6f2:
            r12 = 1
            int r6 = r6 + r12
            goto L6a9
        L6f5:
            r6 = 0
            r1.zzaI(r4, r8, r6)     // Catch: java.lang.Throwable -> Le8a
            java.util.List r6 = r4.zzaM()     // Catch: java.lang.Throwable -> Le8a
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Le8a
        L701:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = "_se"
            if (r7 == 0) goto L726
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhm r7 = (com.google.android.gms.internal.measurement.zzhm) r7     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r11 = "_s"
            java.lang.String r7 = r7.zzh()     // Catch: java.lang.Throwable -> Le8a
            boolean r7 = r11.equals(r7)     // Catch: java.lang.Throwable -> Le8a
            if (r7 == 0) goto L701
            com.google.android.gms.measurement.internal.zzaw r6 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = r4.zzaF()     // Catch: java.lang.Throwable -> Le8a
            r6.zzP(r7, r10)     // Catch: java.lang.Throwable -> Le8a
        L726:
            java.lang.String r6 = "_sid"
            int r6 = com.google.android.gms.measurement.internal.zzqa.zza(r4, r6)     // Catch: java.lang.Throwable -> Le8a
            if (r6 < 0) goto L733
            r6 = 1
            r1.zzaI(r4, r8, r6)     // Catch: java.lang.Throwable -> Le8a
            goto L753
        L733:
            int r6 = com.google.android.gms.measurement.internal.zzqa.zza(r4, r10)     // Catch: java.lang.Throwable -> Le8a
            if (r6 < 0) goto L753
            r4.zzE(r6)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhe r6 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzhx r8 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = r8.zzF()     // Catch: java.lang.Throwable -> Le8a
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)     // Catch: java.lang.Throwable -> Le8a
            r6.zzb(r7, r8)     // Catch: java.lang.Throwable -> Le8a
        L753:
            com.google.android.gms.internal.measurement.zzhx r6 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r6 = r6.zzF()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzil r7 = r42.zzaX()     // Catch: java.lang.Throwable -> Le8a
            r7.zzg()     // Catch: java.lang.Throwable -> Le8a
            r42.zzM()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzaw r7 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzh r7 = r7.zzl(r6)     // Catch: java.lang.Throwable -> Le8a
            if (r7 != 0) goto L77f
            com.google.android.gms.measurement.internal.zzhe r7 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zze()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = "Cannot fix consent fields without appInfo. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: java.lang.Throwable -> Le8a
            r7.zzb(r8, r6)     // Catch: java.lang.Throwable -> Le8a
            goto L782
        L77f:
            r1.zzQ(r7, r4)     // Catch: java.lang.Throwable -> Le8a
        L782:
            com.google.android.gms.internal.measurement.zzhx r6 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r6 = r6.zzF()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzil r7 = r42.zzaX()     // Catch: java.lang.Throwable -> Le8a
            r7.zzg()     // Catch: java.lang.Throwable -> Le8a
            r42.zzM()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzaw r7 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzh r7 = r7.zzl(r6)     // Catch: java.lang.Throwable -> Le8a
            if (r7 != 0) goto L7ae
            com.google.android.gms.measurement.internal.zzhe r7 = r42.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzk()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = "Cannot populate ad_campaign_info without appInfo. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: java.lang.Throwable -> Le8a
            r7.zzb(r8, r6)     // Catch: java.lang.Throwable -> Le8a
            goto L7b1
        L7ae:
            r1.zzaa(r7, r4)     // Catch: java.lang.Throwable -> Le8a
        L7b1:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.zzax(r6)     // Catch: java.lang.Throwable -> Le8a
            r6 = -9223372036854775808
            r4.zzab(r6)     // Catch: java.lang.Throwable -> Le8a
            r6 = 0
        L7bf:
            int r7 = r4.zzc()     // Catch: java.lang.Throwable -> Le8a
            if (r6 >= r7) goto L7f2
            com.google.android.gms.internal.measurement.zzhm r7 = r4.zzh(r6)     // Catch: java.lang.Throwable -> Le8a
            long r8 = r7.zzd()     // Catch: java.lang.Throwable -> Le8a
            long r10 = r4.zzf()     // Catch: java.lang.Throwable -> Le8a
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L7dc
            long r8 = r7.zzd()     // Catch: java.lang.Throwable -> Le8a
            r4.zzax(r8)     // Catch: java.lang.Throwable -> Le8a
        L7dc:
            long r8 = r7.zzd()     // Catch: java.lang.Throwable -> Le8a
            long r10 = r4.zze()     // Catch: java.lang.Throwable -> Le8a
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L7ef
            long r7 = r7.zzd()     // Catch: java.lang.Throwable -> Le8a
            r4.zzab(r7)     // Catch: java.lang.Throwable -> Le8a
        L7ef:
            int r6 = r6 + 1
            goto L7bf
        L7f2:
            r4.zzB()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzjx r6 = com.google.android.gms.measurement.internal.zzjx.zza     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r6 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r6 = r6.zzF()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzjx r6 = r1.zzu(r6)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r7 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = r7.zzK()     // Catch: java.lang.Throwable -> Le8a
            r8 = 100
            com.google.android.gms.measurement.internal.zzjx r7 = com.google.android.gms.measurement.internal.zzjx.zzk(r7, r8)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzjx r6 = r6.zzl(r7)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzaw r7 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r8 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r8 = r8.zzF()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzjx r7 = r7.zzt(r8)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzaw r8 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r9 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r9 = r9.zzF()     // Catch: java.lang.Throwable -> Le8a
            r8.zzW(r9, r6)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzjw r8 = com.google.android.gms.measurement.internal.zzjw.zzb     // Catch: java.lang.Throwable -> Le8a
            boolean r9 = r6.zzr(r8)     // Catch: java.lang.Throwable -> Le8a
            if (r9 != 0) goto L848
            boolean r9 = r7.zzr(r8)     // Catch: java.lang.Throwable -> Le8a
            if (r9 == 0) goto L848
            com.google.android.gms.measurement.internal.zzaw r7 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r9 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r9 = r9.zzF()     // Catch: java.lang.Throwable -> Le8a
            r7.zzI(r9)     // Catch: java.lang.Throwable -> Le8a
            goto L861
        L848:
            boolean r9 = r6.zzr(r8)     // Catch: java.lang.Throwable -> Le8a
            if (r9 == 0) goto L861
            boolean r7 = r7.zzr(r8)     // Catch: java.lang.Throwable -> Le8a
            if (r7 != 0) goto L861
            com.google.android.gms.measurement.internal.zzaw r7 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r9 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r9 = r9.zzF()     // Catch: java.lang.Throwable -> Le8a
            r7.zzQ(r9)     // Catch: java.lang.Throwable -> Le8a
        L861:
            com.google.android.gms.measurement.internal.zzjw r7 = com.google.android.gms.measurement.internal.zzjw.zza     // Catch: java.lang.Throwable -> Le8a
            boolean r9 = r6.zzr(r7)     // Catch: java.lang.Throwable -> Le8a
            if (r9 != 0) goto L872
            r4.zzz()     // Catch: java.lang.Throwable -> Le8a
            r4.zzw()     // Catch: java.lang.Throwable -> Le8a
            r4.zzt()     // Catch: java.lang.Throwable -> Le8a
        L872:
            boolean r9 = r6.zzr(r8)     // Catch: java.lang.Throwable -> Le8a
            if (r9 != 0) goto L87e
            r4.zzq()     // Catch: java.lang.Throwable -> Le8a
            r4.zzA()     // Catch: java.lang.Throwable -> Le8a
        L87e:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzam r9 = r42.zzi()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r10 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r10.zzF()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzgg r11 = com.google.android.gms.measurement.internal.zzgi.zzaV     // Catch: java.lang.Throwable -> Le8a
            boolean r9 = r9.zzx(r10, r11)     // Catch: java.lang.Throwable -> Le8a
            if (r9 == 0) goto L8be
            com.google.android.gms.measurement.internal.zzqf r9 = r42.zzB()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r10 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r10.zzF()     // Catch: java.lang.Throwable -> Le8a
            boolean r9 = r9.zzab(r10)     // Catch: java.lang.Throwable -> Le8a
            if (r9 == 0) goto L8be
            com.google.android.gms.internal.measurement.zzhx r9 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r9 = r9.zzF()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzjx r9 = r1.zzu(r9)     // Catch: java.lang.Throwable -> Le8a
            boolean r7 = r9.zzr(r7)     // Catch: java.lang.Throwable -> Le8a
            if (r7 == 0) goto L8be
            com.google.android.gms.internal.measurement.zzhx r7 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            boolean r7 = r7.zzbt()     // Catch: java.lang.Throwable -> Le8a
            if (r7 == 0) goto L8be
            r1.zzR(r4, r5)     // Catch: java.lang.Throwable -> Le8a
        L8be:
            r4.zzr()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzae r9 = r42.zzh()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r10 = r4.zzaF()     // Catch: java.lang.Throwable -> Le8a
            java.util.List r11 = r4.zzaM()     // Catch: java.lang.Throwable -> Le8a
            java.util.List r12 = r4.zzaN()     // Catch: java.lang.Throwable -> Le8a
            long r13 = r4.zzf()     // Catch: java.lang.Throwable -> Le8a
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> Le8a
            long r14 = r4.zze()     // Catch: java.lang.Throwable -> Le8a
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> Le8a
            boolean r6 = r6.zzr(r8)     // Catch: java.lang.Throwable -> Le8a
            r7 = 1
            r15 = r6 ^ 1
            java.util.List r6 = r9.zza(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Le8a
            r4.zzi(r6)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzam r6 = r42.zzi()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r7 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r7 = r7.zzF()     // Catch: java.lang.Throwable -> Le8a
            boolean r6 = r6.zzB(r7)     // Catch: java.lang.Throwable -> Le8a
            if (r6 == 0) goto Lc20
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le73
            r6.<init>()     // Catch: java.lang.Throwable -> Le73
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le73
            r7.<init>()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzqf r8 = r42.zzB()     // Catch: java.lang.Throwable -> Le73
            java.security.SecureRandom r8 = r8.zzJ()     // Catch: java.lang.Throwable -> Le73
            r9 = 0
        L912:
            int r10 = r4.zzc()     // Catch: java.lang.Throwable -> Le73
            if (r9 >= r10) goto Lbe7
            com.google.android.gms.internal.measurement.zzhm r10 = r4.zzh(r9)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzlz r10 = r10.zzch()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhl r10 = (com.google.android.gms.internal.measurement.zzhl) r10     // Catch: java.lang.Throwable -> Le73
            java.lang.String r11 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> Le73
            java.lang.String r12 = "_sr"
            if (r11 == 0) goto L9ab
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzmd r11 = r10.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhm r11 = (com.google.android.gms.internal.measurement.zzhm) r11     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r13 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzqa.zzH(r11, r13)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Le8a
            java.lang.Object r13 = r6.get(r11)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzbd r13 = (com.google.android.gms.measurement.internal.zzbd) r13     // Catch: java.lang.Throwable -> Le8a
            if (r13 != 0) goto L962
            com.google.android.gms.measurement.internal.zzaw r13 = r42.zzj()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhx r14 = r5.zza     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r14 = r14.zzF()     // Catch: java.lang.Throwable -> Le8a
            java.lang.Object r15 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzbd r13 = r13.zzs(r14, r15)     // Catch: java.lang.Throwable -> Le8a
            if (r13 == 0) goto L962
            r6.put(r11, r13)     // Catch: java.lang.Throwable -> Le8a
        L962:
            if (r13 == 0) goto L99d
            java.lang.Long r11 = r13.zzi     // Catch: java.lang.Throwable -> Le8a
            if (r11 != 0) goto L99d
            java.lang.Long r11 = r13.zzj     // Catch: java.lang.Throwable -> Le8a
            if (r11 == 0) goto L97c
            long r14 = r11.longValue()     // Catch: java.lang.Throwable -> Le8a
            r18 = 1
            int r16 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r16 <= 0) goto L97c
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzqa.zzD(r10, r12, r11)     // Catch: java.lang.Throwable -> Le8a
        L97c:
            java.lang.Boolean r11 = r13.zzk     // Catch: java.lang.Throwable -> Le8a
            if (r11 == 0) goto L994
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Le8a
            if (r11 == 0) goto L994
            r42.zzA()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r11 = "_efs"
            r12 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzqa.zzD(r10, r11, r14)     // Catch: java.lang.Throwable -> Le8a
        L994:
            com.google.android.gms.internal.measurement.zzmd r11 = r10.zzba()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.internal.measurement.zzhm r11 = (com.google.android.gms.internal.measurement.zzhm) r11     // Catch: java.lang.Throwable -> Le8a
            r7.add(r11)     // Catch: java.lang.Throwable -> Le8a
        L99d:
            r4.zzad(r9, r10)     // Catch: java.lang.Throwable -> Le8a
        L9a0:
            r1 = r4
            r20 = r5
            r3 = r6
            r45 = r8
            r2 = r9
            r5 = 1
            goto Lbd9
        L9ab:
            com.google.android.gms.measurement.internal.zzif r11 = r42.zzr()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhx r13 = r5.zza     // Catch: java.lang.Throwable -> Le73
            java.lang.String r13 = r13.zzF()     // Catch: java.lang.Throwable -> Le73
            java.lang.String r14 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r14 = r11.zza(r13, r14)     // Catch: java.lang.Throwable -> Le73
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> Le73
            if (r15 != 0) goto L9db
            long r13 = java.lang.Long.parseLong(r14)     // Catch: java.lang.NumberFormatException -> L9c6 java.lang.Throwable -> Le8a
            goto L9dc
        L9c6:
            r0 = move-exception
            r14 = r0
            com.google.android.gms.measurement.internal.zzio r11 = r11.zzu     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhe r11 = r11.zzaW()     // Catch: java.lang.Throwable -> Le8a
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zzk()     // Catch: java.lang.Throwable -> Le8a
            java.lang.String r15 = "Unable to parse timezone offset. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzhe.zzn(r13)     // Catch: java.lang.Throwable -> Le8a
            r11.zzc(r15, r13, r14)     // Catch: java.lang.Throwable -> Le8a
        L9db:
            r13 = r2
        L9dc:
            com.google.android.gms.measurement.internal.zzqf r11 = r42.zzB()     // Catch: java.lang.Throwable -> Le73
            long r2 = r10.zzc()     // Catch: java.lang.Throwable -> Le73
            long r2 = r11.zzt(r2, r13)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzmd r11 = r10.zzba()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhm r11 = (com.google.android.gms.internal.measurement.zzhm) r11     // Catch: java.lang.Throwable -> Le73
            r18 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Le73
            java.lang.String r1 = "_dbg"
            boolean r16 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Le73
            if (r16 != 0) goto La30
            java.util.List r11 = r11.zzi()     // Catch: java.lang.Throwable -> Le73
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Le73
        La04:
            boolean r16 = r11.hasNext()     // Catch: java.lang.Throwable -> Le73
            if (r16 == 0) goto La30
            java.lang.Object r16 = r11.next()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhq r16 = (com.google.android.gms.internal.measurement.zzhq) r16     // Catch: java.lang.Throwable -> Le73
            r45 = r11
            java.lang.String r11 = r16.zzg()     // Catch: java.lang.Throwable -> Le73
            boolean r11 = r1.equals(r11)     // Catch: java.lang.Throwable -> Le73
            if (r11 == 0) goto La2d
            long r18 = r16.zzd()     // Catch: java.lang.Throwable -> Le73
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Le73
            boolean r1 = r15.equals(r1)     // Catch: java.lang.Throwable -> Le73
            if (r1 != 0) goto La2b
            goto La30
        La2b:
            r1 = 1
            goto La42
        La2d:
            r11 = r45
            goto La04
        La30:
            com.google.android.gms.measurement.internal.zzif r1 = r42.zzr()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhx r11 = r5.zza     // Catch: java.lang.Throwable -> Le73
            java.lang.String r11 = r11.zzF()     // Catch: java.lang.Throwable -> Le73
            java.lang.String r15 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            int r1 = r1.zzc(r11, r15)     // Catch: java.lang.Throwable -> Le73
        La42:
            if (r1 > 0) goto La67
            com.google.android.gms.measurement.internal.zzhe r2 = r42.zzaW()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()     // Catch: java.lang.Throwable -> Le73
            java.lang.String r3 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le73
            r2.zzc(r3, r11, r1)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzmd r1 = r10.zzba()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhm r1 = (com.google.android.gms.internal.measurement.zzhm) r1     // Catch: java.lang.Throwable -> Le73
            r7.add(r1)     // Catch: java.lang.Throwable -> Le73
            r4.zzad(r9, r10)     // Catch: java.lang.Throwable -> Le73
            goto L9a0
        La67:
            java.lang.String r11 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            java.lang.Object r11 = r6.get(r11)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzbd r11 = (com.google.android.gms.measurement.internal.zzbd) r11     // Catch: java.lang.Throwable -> Le73
            if (r11 != 0) goto Lac6
            com.google.android.gms.measurement.internal.zzaw r11 = r42.zzj()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhx r15 = r5.zza     // Catch: java.lang.Throwable -> Le73
            java.lang.String r15 = r15.zzF()     // Catch: java.lang.Throwable -> Le73
            r18 = r13
            java.lang.String r13 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzbd r11 = r11.zzs(r15, r13)     // Catch: java.lang.Throwable -> Le73
            if (r11 != 0) goto Lac8
            com.google.android.gms.measurement.internal.zzhe r11 = r42.zzaW()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zzk()     // Catch: java.lang.Throwable -> Le73
            java.lang.String r13 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzhx r14 = r5.zza     // Catch: java.lang.Throwable -> Le73
            java.lang.String r14 = r14.zzF()     // Catch: java.lang.Throwable -> Le73
            java.lang.String r15 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            r11.zzc(r13, r14, r15)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzbd r11 = new com.google.android.gms.measurement.internal.zzbd     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhx r13 = r5.zza     // Catch: java.lang.Throwable -> Le73
            java.lang.String r26 = r13.zzF()     // Catch: java.lang.Throwable -> Le73
            java.lang.String r27 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            r28 = 1
            r30 = 1
            r32 = 1
            long r34 = r10.zzc()     // Catch: java.lang.Throwable -> Le73
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r25 = r11
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r38, r39, r40, r41)     // Catch: java.lang.Throwable -> Le73
            goto Lac8
        Lac6:
            r18 = r13
        Lac8:
            r42.zzA()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzmd r13 = r10.zzba()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhm r13 = (com.google.android.gms.internal.measurement.zzhm) r13     // Catch: java.lang.Throwable -> Le73
            java.lang.String r14 = "_eid"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzqa.zzH(r13, r14)     // Catch: java.lang.Throwable -> Le73
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: java.lang.Throwable -> Le73
            if (r13 == 0) goto Ladd
            r14 = 1
            goto Lade
        Ladd:
            r14 = 0
        Lade:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> Le73
            r15 = 1
            if (r1 != r15) goto Lb11
            com.google.android.gms.internal.measurement.zzmd r1 = r10.zzba()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhm r1 = (com.google.android.gms.internal.measurement.zzhm) r1     // Catch: java.lang.Throwable -> Le73
            r7.add(r1)     // Catch: java.lang.Throwable -> Le73
            boolean r1 = r14.booleanValue()     // Catch: java.lang.Throwable -> Le73
            if (r1 == 0) goto Lb0c
            java.lang.Long r1 = r11.zzi     // Catch: java.lang.Throwable -> Le73
            if (r1 != 0) goto Lb00
            java.lang.Long r1 = r11.zzj     // Catch: java.lang.Throwable -> Le73
            if (r1 != 0) goto Lb00
            java.lang.Boolean r1 = r11.zzk     // Catch: java.lang.Throwable -> Le73
            if (r1 == 0) goto Lb0c
        Lb00:
            r1 = 0
            com.google.android.gms.measurement.internal.zzbd r2 = r11.zza(r1, r1, r1)     // Catch: java.lang.Throwable -> Le73
            java.lang.String r1 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> Le73
        Lb0c:
            r4.zzad(r9, r10)     // Catch: java.lang.Throwable -> Le73
            goto L9a0
        Lb11:
            int r15 = r8.nextInt(r1)     // Catch: java.lang.Throwable -> Le73
            if (r15 != 0) goto Lb53
            r42.zzA()     // Catch: java.lang.Throwable -> Le73
            r29 = r4
            r20 = r5
            long r4 = (long) r1     // Catch: java.lang.Throwable -> Le73
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzqa.zzD(r10, r12, r1)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzmd r4 = r10.zzba()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhm r4 = (com.google.android.gms.internal.measurement.zzhm) r4     // Catch: java.lang.Throwable -> Le73
            r7.add(r4)     // Catch: java.lang.Throwable -> Le73
            boolean r4 = r14.booleanValue()     // Catch: java.lang.Throwable -> Le73
            if (r4 == 0) goto Lb3a
            r4 = 0
            com.google.android.gms.measurement.internal.zzbd r11 = r11.zza(r4, r1, r4)     // Catch: java.lang.Throwable -> Le73
        Lb3a:
            java.lang.String r1 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            long r4 = r10.zzc()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzbd r2 = r11.zzb(r4, r2)     // Catch: java.lang.Throwable -> Le73
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> Le73
            r3 = r6
            r45 = r8
            r2 = r9
            r1 = r29
            r5 = 1
            goto Lbd6
        Lb53:
            r29 = r4
            r20 = r5
            java.lang.Long r4 = r11.zzh     // Catch: java.lang.Throwable -> Le73
            if (r4 == 0) goto Lb65
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> Le73
            r15 = r6
            r45 = r8
            r16 = r9
            goto Lb79
        Lb65:
            com.google.android.gms.measurement.internal.zzqf r4 = r42.zzB()     // Catch: java.lang.Throwable -> Le73
            r45 = r8
            r5 = r9
            long r8 = r10.zzb()     // Catch: java.lang.Throwable -> Le73
            r16 = r5
            r15 = r6
            r5 = r18
            long r4 = r4.zzt(r8, r5)     // Catch: java.lang.Throwable -> Le73
        Lb79:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto Lbbd
            r42.zzA()     // Catch: java.lang.Throwable -> Le73
            java.lang.String r4 = "_efs"
            r5 = 1
            java.lang.Long r8 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzqa.zzD(r10, r4, r8)     // Catch: java.lang.Throwable -> Le73
            r42.zzA()     // Catch: java.lang.Throwable -> Le73
            long r8 = (long) r1     // Catch: java.lang.Throwable -> Le73
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzqa.zzD(r10, r12, r1)     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzmd r4 = r10.zzba()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.internal.measurement.zzhm r4 = (com.google.android.gms.internal.measurement.zzhm) r4     // Catch: java.lang.Throwable -> Le73
            r7.add(r4)     // Catch: java.lang.Throwable -> Le73
            boolean r4 = r14.booleanValue()     // Catch: java.lang.Throwable -> Le73
            if (r4 == 0) goto Lbac
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le73
            r8 = 0
            com.google.android.gms.measurement.internal.zzbd r11 = r11.zza(r8, r1, r4)     // Catch: java.lang.Throwable -> Le73
        Lbac:
            java.lang.String r1 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            long r8 = r10.zzc()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzbd r2 = r11.zzb(r8, r2)     // Catch: java.lang.Throwable -> Le73
            r3 = r15
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> Le73
            goto Lbd2
        Lbbd:
            r3 = r15
            r5 = 1
            boolean r1 = r14.booleanValue()     // Catch: java.lang.Throwable -> Le73
            if (r1 == 0) goto Lbd2
            java.lang.String r1 = r10.zzo()     // Catch: java.lang.Throwable -> Le73
            r2 = 0
            com.google.android.gms.measurement.internal.zzbd r4 = r11.zza(r13, r2, r2)     // Catch: java.lang.Throwable -> Le73
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> Le73
        Lbd2:
            r2 = r16
            r1 = r29
        Lbd6:
            r1.zzad(r2, r10)     // Catch: java.lang.Throwable -> Le73
        Lbd9:
            int r9 = r2 + 1
            r8 = r45
            r4 = r1
            r6 = r3
            r5 = r20
            r2 = 0
            r1 = r42
            goto L912
        Lbe7:
            r1 = r4
            r20 = r5
            r3 = r6
            int r2 = r7.size()     // Catch: java.lang.Throwable -> Le73
            int r4 = r1.zzc()     // Catch: java.lang.Throwable -> Le73
            if (r2 >= r4) goto Lbfb
            r1.zzu()     // Catch: java.lang.Throwable -> Le73
            r1.zzj(r7)     // Catch: java.lang.Throwable -> Le73
        Lbfb:
            java.util.Set r2 = r3.entrySet()     // Catch: java.lang.Throwable -> Le73
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Le73
        Lc03:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Le73
            if (r3 == 0) goto Lc1d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Le73
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzaw r4 = r42.zzj()     // Catch: java.lang.Throwable -> Le73
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzbd r3 = (com.google.android.gms.measurement.internal.zzbd) r3     // Catch: java.lang.Throwable -> Le73
            r4.zzV(r3)     // Catch: java.lang.Throwable -> Le73
            goto Lc03
        Lc1d:
            r2 = r20
            goto Lc22
        Lc20:
            r1 = r4
            r2 = r5
        Lc22:
            com.google.android.gms.internal.measurement.zzhx r3 = r2.zza     // Catch: java.lang.Throwable -> Le73
            java.lang.String r3 = r3.zzF()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzaw r4 = r42.zzj()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzh r4 = r4.zzl(r3)     // Catch: java.lang.Throwable -> Le73
            if (r4 != 0) goto Lc4a
            com.google.android.gms.measurement.internal.zzhe r4 = r42.zzaW()     // Catch: java.lang.Throwable -> Le73
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: java.lang.Throwable -> Le73
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzhx r6 = r2.zza     // Catch: java.lang.Throwable -> Le73
            java.lang.String r6 = r6.zzF()     // Catch: java.lang.Throwable -> Le73
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: java.lang.Throwable -> Le73
            r4.zzb(r5, r6)     // Catch: java.lang.Throwable -> Le73
            goto Lcb3
        Lc4a:
            int r5 = r1.zzc()     // Catch: java.lang.Throwable -> Le73
            if (r5 <= 0) goto Lcb3
            long r5 = r4.zzs()     // Catch: java.lang.Throwable -> Le73
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto Lc5e
            r1.zzap(r5)     // Catch: java.lang.Throwable -> Le73
            goto Lc61
        Lc5e:
            r1.zzx()     // Catch: java.lang.Throwable -> Le73
        Lc61:
            long r7 = r4.zzu()     // Catch: java.lang.Throwable -> Le73
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto Lc6c
            goto Lc6d
        Lc6c:
            r5 = r7
        Lc6d:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto Lc75
            r1.zzaq(r5)     // Catch: java.lang.Throwable -> Le73
            goto Lc78
        Lc75:
            r1.zzy()     // Catch: java.lang.Throwable -> Le73
        Lc78:
            int r5 = r1.zzc()     // Catch: java.lang.Throwable -> Le73
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Le73
            r4.zzQ(r5)     // Catch: java.lang.Throwable -> Le73
            long r5 = r4.zzr()     // Catch: java.lang.Throwable -> Le73
            int r6 = (int) r5     // Catch: java.lang.Throwable -> Le73
            r1.zzV(r6)     // Catch: java.lang.Throwable -> Le73
            long r5 = r4.zzt()     // Catch: java.lang.Throwable -> Le73
            int r6 = (int) r5     // Catch: java.lang.Throwable -> Le73
            r1.zzP(r6)     // Catch: java.lang.Throwable -> Le73
            long r5 = r1.zzf()     // Catch: java.lang.Throwable -> Le73
            r4.zzau(r5)     // Catch: java.lang.Throwable -> Le73
            long r5 = r1.zze()     // Catch: java.lang.Throwable -> Le73
            r4.zzas(r5)     // Catch: java.lang.Throwable -> Le73
            java.lang.String r5 = r4.zzB()     // Catch: java.lang.Throwable -> Le73
            if (r5 == 0) goto Lca8
            r1.zzaj(r5)     // Catch: java.lang.Throwable -> Le73
            goto Lcab
        Lca8:
            r1.zzv()     // Catch: java.lang.Throwable -> Le73
        Lcab:
            com.google.android.gms.measurement.internal.zzaw r5 = r42.zzj()     // Catch: java.lang.Throwable -> Le73
            r6 = 0
            r5.zzT(r4, r6, r6)     // Catch: java.lang.Throwable -> Le73
        Lcb3:
            int r4 = r1.zzc()     // Catch: java.lang.Throwable -> Le73
            if (r4 <= 0) goto Le31
            r4 = r42
            com.google.android.gms.measurement.internal.zzio r5 = r4.zzn     // Catch: java.lang.Throwable -> Le88
            r5.zzaV()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzif r5 = r42.zzr()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.internal.measurement.zzhx r6 = r2.zza     // Catch: java.lang.Throwable -> Le88
            java.lang.String r6 = r6.zzF()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.internal.measurement.zzgo r5 = r5.zzj(r6)     // Catch: java.lang.Throwable -> Le88
            if (r5 == 0) goto Lcdf
            boolean r6 = r5.zzw()     // Catch: java.lang.Throwable -> Le88
            if (r6 != 0) goto Lcd7
            goto Lcdf
        Lcd7:
            long r5 = r5.zzc()     // Catch: java.lang.Throwable -> Le88
            r1.zzR(r5)     // Catch: java.lang.Throwable -> Le88
            goto Ld08
        Lcdf:
            com.google.android.gms.internal.measurement.zzhx r5 = r2.zza     // Catch: java.lang.Throwable -> Le88
            java.lang.String r5 = r5.zzP()     // Catch: java.lang.Throwable -> Le88
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> Le88
            if (r5 == 0) goto Lcf1
            r5 = -1
            r1.zzR(r5)     // Catch: java.lang.Throwable -> Le88
            goto Ld08
        Lcf1:
            com.google.android.gms.measurement.internal.zzhe r5 = r42.zzaW()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzk()     // Catch: java.lang.Throwable -> Le88
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzhx r7 = r2.zza     // Catch: java.lang.Throwable -> Le88
            java.lang.String r7 = r7.zzF()     // Catch: java.lang.Throwable -> Le88
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)     // Catch: java.lang.Throwable -> Le88
            r5.zzb(r6, r7)     // Catch: java.lang.Throwable -> Le88
        Ld08:
            com.google.android.gms.measurement.internal.zzaw r5 = r42.zzj()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.internal.measurement.zzmd r1 = r1.zzba()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.internal.measurement.zzhx r1 = (com.google.android.gms.internal.measurement.zzhx) r1     // Catch: java.lang.Throwable -> Le88
            r5.zzg()     // Catch: java.lang.Throwable -> Le88
            r5.zzav()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> Le88
            java.lang.String r6 = r1.zzF()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch: java.lang.Throwable -> Le88
            boolean r6 = r1.zzbK()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.common.internal.Preconditions.checkState(r6)     // Catch: java.lang.Throwable -> Le88
            r5.zzO()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzio r6 = r5.zzu     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.common.util.Clock r7 = r6.zzaU()     // Catch: java.lang.Throwable -> Le88
            long r7 = r7.currentTimeMillis()     // Catch: java.lang.Throwable -> Le88
            long r9 = r1.zzo()     // Catch: java.lang.Throwable -> Le88
            r6.zzf()     // Catch: java.lang.Throwable -> Le88
            long r11 = com.google.android.gms.measurement.internal.zzam.zzI()     // Catch: java.lang.Throwable -> Le88
            long r11 = r7 - r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto Ld57
            long r9 = r1.zzo()     // Catch: java.lang.Throwable -> Le88
            r6.zzf()     // Catch: java.lang.Throwable -> Le88
            long r11 = com.google.android.gms.measurement.internal.zzam.zzI()     // Catch: java.lang.Throwable -> Le88
            long r11 = r11 + r7
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto Ld78
        Ld57:
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()     // Catch: java.lang.Throwable -> Le88
            java.lang.String r9 = r1.zzF()     // Catch: java.lang.Throwable -> Le88
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzhe.zzn(r9)     // Catch: java.lang.Throwable -> Le88
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Le88
            long r10 = r1.zzo()     // Catch: java.lang.Throwable -> Le88
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> Le88
            java.lang.String r10 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r6.zzd(r10, r9, r7, r8)     // Catch: java.lang.Throwable -> Le88
        Ld78:
            byte[] r6 = r1.zzcd()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzpv r7 = r5.zzg     // Catch: java.io.IOException -> Le17 java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzqa r7 = r7.zzA()     // Catch: java.io.IOException -> Le17 java.lang.Throwable -> Le88
            byte[] r6 = r7.zzB(r6)     // Catch: java.io.IOException -> Le17 java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzio r7 = r5.zzu     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhe r8 = r7.zzaW()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzj()     // Catch: java.lang.Throwable -> Le88
            int r9 = r6.length     // Catch: java.lang.Throwable -> Le88
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Le88
            java.lang.String r10 = "Saving bundle, size"
            r8.zzb(r10, r9)     // Catch: java.lang.Throwable -> Le88
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Le88
            r8.<init>()     // Catch: java.lang.Throwable -> Le88
            java.lang.String r9 = r1.zzF()     // Catch: java.lang.Throwable -> Le88
            java.lang.String r10 = "app_id"
            r8.put(r10, r9)     // Catch: java.lang.Throwable -> Le88
            long r9 = r1.zzo()     // Catch: java.lang.Throwable -> Le88
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Le88
            java.lang.String r10 = "bundle_end_timestamp"
            r8.put(r10, r9)     // Catch: java.lang.Throwable -> Le88
            java.lang.String r9 = "data"
            r8.put(r9, r6)     // Catch: java.lang.Throwable -> Le88
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> Le88
            java.lang.String r9 = "has_realtime"
            r8.put(r9, r6)     // Catch: java.lang.Throwable -> Le88
            boolean r6 = r1.zzbR()     // Catch: java.lang.Throwable -> Le88
            if (r6 == 0) goto Ldd6
            int r6 = r1.zzg()     // Catch: java.lang.Throwable -> Le88
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Le88
            java.lang.String r9 = "retry_count"
            r8.put(r9, r6)     // Catch: java.lang.Throwable -> Le88
        Ldd6:
            android.database.sqlite.SQLiteDatabase r6 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> Ldfd java.lang.Throwable -> Le88
            java.lang.String r9 = "queue"
            r10 = 0
            long r8 = r6.insert(r9, r10, r8)     // Catch: android.database.sqlite.SQLiteException -> Ldfd java.lang.Throwable -> Le88
            r10 = -1
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto Le33
            com.google.android.gms.measurement.internal.zzhe r6 = r7.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Ldfd java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()     // Catch: android.database.sqlite.SQLiteException -> Ldfd java.lang.Throwable -> Le88
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r1.zzF()     // Catch: android.database.sqlite.SQLiteException -> Ldfd java.lang.Throwable -> Le88
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)     // Catch: android.database.sqlite.SQLiteException -> Ldfd java.lang.Throwable -> Le88
            r6.zzb(r7, r8)     // Catch: android.database.sqlite.SQLiteException -> Ldfd java.lang.Throwable -> Le88
            goto Le33
        Ldfd:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> Le88
            java.lang.String r1 = r1.zzF()     // Catch: java.lang.Throwable -> Le88
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)     // Catch: java.lang.Throwable -> Le88
            java.lang.String r7 = "Error storing bundle. appId"
            r5.zzc(r7, r1, r6)     // Catch: java.lang.Throwable -> Le88
            goto Le33
        Le17:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> Le88
            java.lang.String r1 = r1.zzF()     // Catch: java.lang.Throwable -> Le88
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)     // Catch: java.lang.Throwable -> Le88
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            r5.zzc(r7, r1, r6)     // Catch: java.lang.Throwable -> Le88
            goto Le33
        Le31:
            r4 = r42
        Le33:
            com.google.android.gms.measurement.internal.zzaw r1 = r42.zzj()     // Catch: java.lang.Throwable -> Le88
            java.util.List r2 = r2.zzb     // Catch: java.lang.Throwable -> Le88
            r1.zzJ(r2)     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzaw r1 = r42.zzj()     // Catch: java.lang.Throwable -> Le88
            android.database.sqlite.SQLiteDatabase r2 = r1.zzj()     // Catch: java.lang.Throwable -> Le88
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: android.database.sqlite.SQLiteException -> Le55 java.lang.Throwable -> Le88
            r7 = 0
            r6[r7] = r3     // Catch: android.database.sqlite.SQLiteException -> Le55 java.lang.Throwable -> Le88
            r7 = 1
            r6[r7] = r3     // Catch: android.database.sqlite.SQLiteException -> Le53 java.lang.Throwable -> Le88
            r2.execSQL(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> Le53 java.lang.Throwable -> Le88
            goto Le6b
        Le53:
            r0 = move-exception
            goto Le57
        Le55:
            r0 = move-exception
            r7 = 1
        Le57:
            r2 = r0
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> Le88
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> Le88
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> Le88
            r1.zzc(r5, r3, r2)     // Catch: java.lang.Throwable -> Le88
        Le6b:
            com.google.android.gms.measurement.internal.zzaw r1 = r42.zzj()     // Catch: java.lang.Throwable -> Le88
            r1.zzS()     // Catch: java.lang.Throwable -> Le88
            goto Le80
        Le73:
            r0 = move-exception
            r4 = r42
            goto Le8c
        Le77:
            r4 = r1
            r7 = 0
            com.google.android.gms.measurement.internal.zzaw r1 = r42.zzj()     // Catch: java.lang.Throwable -> Le88
            r1.zzS()     // Catch: java.lang.Throwable -> Le88
        Le80:
            com.google.android.gms.measurement.internal.zzaw r1 = r42.zzj()
            r1.zzL()
            return r7
        Le88:
            r0 = move-exception
            goto Le8c
        Le8a:
            r0 = move-exception
            r4 = r1
        Le8c:
            r1 = r0
            com.google.android.gms.measurement.internal.zzaw r2 = r42.zzj()
            r2.zzL()
            throw r1
    }

    private final boolean zzaN() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r1.zzaX()
            r0.zzg()
            r1.zzM()
            com.google.android.gms.measurement.internal.zzaw r0 = r1.zzj()
            boolean r0 = r0.zzaa()
            if (r0 != 0) goto L25
            com.google.android.gms.measurement.internal.zzaw r0 = r1.zzj()
            java.lang.String r0 = r0.zzA()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            goto L25
        L23:
            r0 = 0
            return r0
        L25:
            r0 = 1
            return r0
    }

    private final boolean zzaO(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzaw r0 = r3.zzj()
            com.google.android.gms.measurement.internal.zzbd r4 = r0.zzs(r4, r5)
            if (r4 == 0) goto L15
            long r4 = r4.zzc
            r0 = 1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L13
            goto L15
        L13:
            r4 = 0
            return r4
        L15:
            r4 = 1
            return r4
    }

    private final boolean zzaP(com.google.android.gms.internal.measurement.zzhl r10, com.google.android.gms.internal.measurement.zzhl r11) {
            r9 = this;
            java.lang.String r0 = r10.zzo()
            java.lang.String r1 = "_e"
            boolean r0 = r1.equals(r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r9.zzA()
            com.google.android.gms.internal.measurement.zzmd r0 = r10.zzba()
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            java.lang.String r2 = "_sc"
            com.google.android.gms.internal.measurement.zzhq r0 = com.google.android.gms.measurement.internal.zzqa.zzG(r0, r2)
            r2 = 0
            if (r0 != 0) goto L21
            r0 = r2
            goto L25
        L21:
            java.lang.String r0 = r0.zzh()
        L25:
            r9.zzA()
            com.google.android.gms.internal.measurement.zzmd r3 = r11.zzba()
            com.google.android.gms.internal.measurement.zzhm r3 = (com.google.android.gms.internal.measurement.zzhm) r3
            java.lang.String r4 = "_pc"
            com.google.android.gms.internal.measurement.zzhq r3 = com.google.android.gms.measurement.internal.zzqa.zzG(r3, r4)
            if (r3 != 0) goto L37
            goto L3b
        L37:
            java.lang.String r2 = r3.zzh()
        L3b:
            if (r2 == 0) goto Laa
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Laa
            java.lang.String r0 = r10.zzo()
            boolean r0 = r1.equals(r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r9.zzA()
            com.google.android.gms.internal.measurement.zzmd r0 = r10.zzba()
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            java.lang.String r1 = "_et"
            com.google.android.gms.internal.measurement.zzhq r0 = com.google.android.gms.measurement.internal.zzqa.zzG(r0, r1)
            if (r0 == 0) goto La8
            boolean r2 = r0.zzw()
            if (r2 == 0) goto La8
            long r2 = r0.zzd()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L70
            goto La8
        L70:
            long r2 = r0.zzd()
            r9.zzA()
            com.google.android.gms.internal.measurement.zzmd r0 = r11.zzba()
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            com.google.android.gms.internal.measurement.zzhq r0 = com.google.android.gms.measurement.internal.zzqa.zzG(r0, r1)
            if (r0 == 0) goto L90
            long r6 = r0.zzd()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L90
            long r4 = r0.zzd()
            long r2 = r2 + r4
        L90:
            r9.zzA()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            com.google.android.gms.measurement.internal.zzqa.zzD(r11, r1, r0)
            r9.zzA()
            r0 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "_fr"
            com.google.android.gms.measurement.internal.zzqa.zzD(r10, r0, r11)
        La8:
            r10 = 1
            return r10
        Laa:
            r10 = 0
            return r10
    }

    private static final boolean zzaQ(com.google.android.gms.measurement.internal.zzr r1) {
            java.lang.String r0 = r1.zzb
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            java.lang.String r1 = r1.zzp
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    private static final com.google.android.gms.measurement.internal.zzpg zzaR(com.google.android.gms.measurement.internal.zzpg r2) {
            if (r2 == 0) goto L1d
            boolean r0 = r2.zzax()
            if (r0 == 0) goto L9
            return r2
        L9:
            java.lang.Class r2 = r2.getClass()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Component not initialized: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L1d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Upload Component not created"
            r2.<init>(r0)
            throw r2
    }

    private static final java.lang.Boolean zzaS(com.google.android.gms.measurement.internal.zzr r2) {
            java.lang.Boolean r0 = r2.zzq
            java.lang.String r2 = r2.zzE
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L2c
            com.google.android.gms.measurement.internal.zze r2 = com.google.android.gms.measurement.internal.zze.zza(r2)
            com.google.android.gms.measurement.internal.zzju r2 = r2.zzb()
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzju.zza
            int r2 = r2.ordinal()
            if (r2 == 0) goto L2a
            r1 = 1
            if (r2 == r1) goto L2a
            r1 = 2
            if (r2 == r1) goto L27
            r1 = 3
            if (r2 == r1) goto L24
            goto L2c
        L24:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L27:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
        L2a:
            r2 = 0
            return r2
        L2c:
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzio zzs(com.google.android.gms.measurement.internal.zzpv r0) {
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzn
            return r0
    }

    public static com.google.android.gms.measurement.internal.zzpv zzz(android.content.Context r3) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.Context r0 = r3.getApplicationContext()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzpv.zzb
            if (r0 != 0) goto L2d
            java.lang.Class<com.google.android.gms.measurement.internal.zzpv> r0 = com.google.android.gms.measurement.internal.zzpv.class
            monitor-enter(r0)
            com.google.android.gms.measurement.internal.zzpv r1 = com.google.android.gms.measurement.internal.zzpv.zzb     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L28
            com.google.android.gms.measurement.internal.zzpw r1 = new com.google.android.gms.measurement.internal.zzpw     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.measurement.internal.zzpw r3 = (com.google.android.gms.measurement.internal.zzpw) r3     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.measurement.internal.zzpv r1 = new com.google.android.gms.measurement.internal.zzpv     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.measurement.internal.zzpv.zzb = r1     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r3
        L2d:
            com.google.android.gms.measurement.internal.zzpv r3 = com.google.android.gms.measurement.internal.zzpv.zzb
            return r3
    }

    public final com.google.android.gms.measurement.internal.zzqa zzA() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzqa r0 = r1.zzi
            zzaR(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzqf zzB() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzio r0 = (com.google.android.gms.measurement.internal.zzio) r0
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            return r0
    }

    final java.lang.String zzC(com.google.android.gms.measurement.internal.zzjx r6) {
            r5 = this;
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r6 = r6.zzr(r0)
            if (r6 == 0) goto L2b
            r6 = 16
            byte[] r6 = new byte[r6]
            com.google.android.gms.measurement.internal.zzqf r0 = r5.zzB()
            java.security.SecureRandom r0 = r0.zzJ()
            r0.nextBytes(r6)
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.math.BigInteger r4 = new java.math.BigInteger
            r4.<init>(r1, r6)
            r2[r3] = r4
            java.lang.String r6 = "%032x"
            java.lang.String r6 = java.lang.String.format(r0, r6, r2)
            return r6
        L2b:
            r6 = 0
            return r6
    }

    final java.lang.String zzD(com.google.android.gms.measurement.internal.zzr r5) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r4.zzaX()
            com.google.android.gms.measurement.internal.zzpo r1 = new com.google.android.gms.measurement.internal.zzpo
            r1.<init>(r4, r5)
            java.util.concurrent.Future r0 = r0.zzf(r1)
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a java.util.concurrent.TimeoutException -> L1c
            java.lang.Object r0 = r0.get(r1, r3)     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a java.util.concurrent.TimeoutException -> L1c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a java.util.concurrent.TimeoutException -> L1c
            return r0
        L18:
            r0 = move-exception
            goto L1d
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            com.google.android.gms.measurement.internal.zzhe r1 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r5 = r5.zza
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)
            java.lang.String r2 = "Failed to get app instance id. appId"
            r1.zzc(r2, r5, r0)
            r5 = 0
            return r5
    }

    final java.util.List zzF(com.google.android.gms.measurement.internal.zzr r18, android.os.Bundle r19) {
            r17 = this;
            r1 = r18
            r0 = r19
            com.google.android.gms.measurement.internal.zzil r2 = r17.zzaX()
            r2.zzg()
            com.google.android.gms.internal.measurement.zzqr.zzb()
            com.google.android.gms.measurement.internal.zzam r2 = r17.zzi()
            java.lang.String r3 = r1.zza
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzaV
            boolean r2 = r2.zzx(r3, r4)
            if (r2 == 0) goto L13b
            if (r3 != 0) goto L20
            goto L13b
        L20:
            r2 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto Lbc
            java.lang.String r6 = "uriSources"
            int[] r6 = r0.getIntArray(r6)
            java.lang.String r7 = "uriTimestamps"
            long[] r7 = r0.getLongArray(r7)
            if (r6 == 0) goto Lbc
            if (r7 == 0) goto Laf
            int r0 = r7.length
            int r8 = r6.length
            if (r0 == r8) goto L3a
            goto Laf
        L3a:
            r8 = 0
        L3b:
            int r0 = r6.length
            if (r8 >= r0) goto Lbc
            com.google.android.gms.measurement.internal.zzaw r9 = r17.zzj()
            r0 = r6[r8]
            r10 = r7[r8]
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            r9.zzg()
            r9.zzav()
            android.database.sqlite.SQLiteDatabase r12 = r9.zzj()     // Catch: android.database.sqlite.SQLiteException -> L98
            java.lang.String r13 = "trigger_uris"
            java.lang.String r14 = "app_id=? and source=? and timestamp_millis<=?"
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch: android.database.sqlite.SQLiteException -> L98
            r15[r5] = r3     // Catch: android.database.sqlite.SQLiteException -> L98
            java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> L98
            r15[r4] = r16     // Catch: android.database.sqlite.SQLiteException -> L98
            java.lang.String r16 = java.lang.String.valueOf(r10)     // Catch: android.database.sqlite.SQLiteException -> L98
            r15[r2] = r16     // Catch: android.database.sqlite.SQLiteException -> L98
            int r12 = r12.delete(r13, r14, r15)     // Catch: android.database.sqlite.SQLiteException -> L98
            com.google.android.gms.measurement.internal.zzio r13 = r9.zzu     // Catch: android.database.sqlite.SQLiteException -> L98
            com.google.android.gms.measurement.internal.zzhe r13 = r13.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L98
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzj()     // Catch: android.database.sqlite.SQLiteException -> L98
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L98
            r14.<init>()     // Catch: android.database.sqlite.SQLiteException -> L98
            java.lang.String r15 = "Pruned "
            r14.append(r15)     // Catch: android.database.sqlite.SQLiteException -> L98
            r14.append(r12)     // Catch: android.database.sqlite.SQLiteException -> L98
            java.lang.String r12 = " trigger URIs. appId, source, timestamp"
            r14.append(r12)     // Catch: android.database.sqlite.SQLiteException -> L98
            java.lang.String r12 = r14.toString()     // Catch: android.database.sqlite.SQLiteException -> L98
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> L98
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch: android.database.sqlite.SQLiteException -> L98
            r13.zzd(r12, r3, r0, r10)     // Catch: android.database.sqlite.SQLiteException -> L98
            goto Lac
        L98:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r9 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)
            java.lang.String r11 = "Error pruning trigger URIs. appId"
            r9.zzc(r11, r10, r0)
        Lac:
            int r8 = r8 + 1
            goto L3b
        Laf:
            com.google.android.gms.measurement.internal.zzhe r0 = r17.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r3 = "Uri sources and timestamps do not match"
            r0.zza(r3)
        Lbc:
            com.google.android.gms.measurement.internal.zzaw r3 = r17.zzj()
            java.lang.String r1 = r1.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r3.zzg()
            r3.zzav()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6 = 0
            android.database.sqlite.SQLiteDatabase r7 = r3.zzj()     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            java.lang.String r8 = "trigger_uris"
            java.lang.String r9 = "trigger_uri"
            java.lang.String r10 = "timestamp_millis"
            java.lang.String r11 = "source"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10, r11}     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            java.lang.String r10 = "app_id=?"
            java.lang.String[] r11 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            r11[r5] = r1     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            r12 = 0
            r13 = 0
            java.lang.String r14 = "rowid"
            r15 = 0
            android.database.Cursor r6 = r7.query(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            if (r7 == 0) goto L12f
        Lf6:
            java.lang.String r7 = r6.getString(r5)     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            if (r7 != 0) goto Lfe
            java.lang.String r7 = ""
        Lfe:
            long r8 = r6.getLong(r4)     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            int r10 = r6.getInt(r2)     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            com.google.android.gms.measurement.internal.zzov r11 = new com.google.android.gms.measurement.internal.zzov     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            r11.<init>(r7, r8, r10)     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            r0.add(r11)     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            boolean r7 = r6.moveToNext()     // Catch: java.lang.Throwable -> L115 android.database.sqlite.SQLiteException -> L117
            if (r7 != 0) goto Lf6
            goto L12f
        L115:
            r0 = move-exception
            goto L135
        L117:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r3.zzu     // Catch: java.lang.Throwable -> L115
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L115
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L115
            java.lang.String r3 = "Error querying trigger uris. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)     // Catch: java.lang.Throwable -> L115
            r2.zzc(r3, r1, r0)     // Catch: java.lang.Throwable -> L115
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L115
        L12f:
            if (r6 == 0) goto L134
            r6.close()
        L134:
            return r0
        L135:
            if (r6 == 0) goto L13a
            r6.close()
        L13a:
            throw r0
        L13b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    final void zzK(java.lang.Runnable r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r1.zzaX()
            r0.zzg()
            java.util.List r0 = r1.zzq
            if (r0 != 0) goto L12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzq = r0
        L12:
            java.util.List r0 = r1.zzq
            r0.add(r2)
            return
    }

    final void zzL() {
            r9 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r9.zzaX()
            r0.zzg()
            r9.zzM()
            boolean r0 = r9.zzp
            if (r0 != 0) goto L127
            r0 = 1
            r9.zzp = r0
            boolean r1 = r9.zzaz()
            if (r1 == 0) goto L127
            java.nio.channels.FileChannel r1 = r9.zzy
            com.google.android.gms.measurement.internal.zzil r2 = r9.zzaX()
            r2.zzg()
            r2 = 0
            java.lang.String r4 = "Bad channel to read from"
            r5 = 4
            r6 = 0
            if (r1 == 0) goto L68
            boolean r7 = r1.isOpen()
            if (r7 != 0) goto L2f
            goto L68
        L2f:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r5)
            r1.position(r2)     // Catch: java.io.IOException -> L59
            int r1 = r1.read(r7)     // Catch: java.io.IOException -> L59
            if (r1 == r5) goto L51
            r7 = -1
            if (r1 == r7) goto L73
            com.google.android.gms.measurement.internal.zzhe r7 = r9.zzaW()     // Catch: java.io.IOException -> L59
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzk()     // Catch: java.io.IOException -> L59
            java.lang.String r8 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L59
            r7.zzb(r8, r1)     // Catch: java.io.IOException -> L59
            goto L73
        L51:
            r7.flip()     // Catch: java.io.IOException -> L59
            int r6 = r7.getInt()     // Catch: java.io.IOException -> L59
            goto L73
        L59:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzhe r7 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zze()
            java.lang.String r8 = "Failed to read from channel"
            r7.zzb(r8, r1)
            goto L73
        L68:
            com.google.android.gms.measurement.internal.zzhe r1 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            r1.zza(r4)
        L73:
            com.google.android.gms.measurement.internal.zzio r1 = r9.zzn
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzh()
            int r1 = r1.zzi()
            com.google.android.gms.measurement.internal.zzil r7 = r9.zzaX()
            r7.zzg()
            if (r6 <= r1) goto L9c
            com.google.android.gms.measurement.internal.zzhe r0 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
            r0.zzc(r3, r2, r1)
            return
        L9c:
            if (r6 >= r1) goto L127
            java.nio.channels.FileChannel r7 = r9.zzy
            com.google.android.gms.measurement.internal.zzil r8 = r9.zzaX()
            r8.zzg()
            if (r7 == 0) goto L107
            boolean r8 = r7.isOpen()
            if (r8 != 0) goto Lb0
            goto L107
        Lb0:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)
            r4.putInt(r1)
            r4.flip()
            r7.truncate(r2)     // Catch: java.io.IOException -> Lf8
            r7.write(r4)     // Catch: java.io.IOException -> Lf8
            r7.force(r0)     // Catch: java.io.IOException -> Lf8
            long r2 = r7.size()     // Catch: java.io.IOException -> Lf8
            r4 = 4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Le2
            com.google.android.gms.measurement.internal.zzhe r0 = r9.zzaW()     // Catch: java.io.IOException -> Lf8
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.io.IOException -> Lf8
            java.lang.String r2 = "Error writing to channel. Bytes written"
            long r3 = r7.size()     // Catch: java.io.IOException -> Lf8
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.io.IOException -> Lf8
            r0.zzb(r2, r3)     // Catch: java.io.IOException -> Lf8
        Le2:
            com.google.android.gms.measurement.internal.zzhe r0 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            r0.zzc(r3, r2, r1)
            return
        Lf8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhe r2 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = "Failed to write to channel"
            r2.zzb(r3, r0)
            goto L112
        L107:
            com.google.android.gms.measurement.internal.zzhe r0 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            r0.zza(r4)
        L112:
            com.google.android.gms.measurement.internal.zzhe r0 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            r0.zzc(r3, r2, r1)
        L127:
            return
    }

    final void zzM() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzo
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "UploadController is not initialized"
            r0.<init>(r1)
            throw r0
    }

    final void zzN(java.lang.String r8, com.google.android.gms.internal.measurement.zzhw r9) {
            r7 = this;
            com.google.android.gms.measurement.internal.zzif r0 = r7.zzr()
            java.util.Set r0 = r0.zzo(r8)
            if (r0 == 0) goto Ld
            r9.zzl(r0)
        Ld:
            com.google.android.gms.measurement.internal.zzif r0 = r7.zzr()
            boolean r0 = r0.zzB(r8)
            if (r0 == 0) goto L1a
            r9.zzs()
        L1a:
            com.google.android.gms.measurement.internal.zzif r0 = r7.zzr()
            boolean r0 = r0.zzE(r8)
            r1 = -1
            if (r0 == 0) goto L3f
            java.lang.String r0 = r9.zzaK()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L3f
            java.lang.String r2 = "."
            int r2 = r0.indexOf(r2)
            if (r2 == r1) goto L3f
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            r9.zzam(r0)
        L3f:
            com.google.android.gms.measurement.internal.zzif r0 = r7.zzr()
            boolean r0 = r0.zzF(r8)
            if (r0 == 0) goto L54
            java.lang.String r0 = "_id"
            int r0 = com.google.android.gms.measurement.internal.zzqa.zza(r9, r0)
            if (r0 == r1) goto L54
            r9.zzE(r0)
        L54:
            com.google.android.gms.measurement.internal.zzif r0 = r7.zzr()
            boolean r0 = r0.zzD(r8)
            if (r0 == 0) goto L61
            r9.zzt()
        L61:
            com.google.android.gms.measurement.internal.zzif r0 = r7.zzr()
            boolean r0 = r0.zzA(r8)
            if (r0 == 0) goto Lab
            r9.zzq()
            com.google.android.gms.measurement.internal.zzjx r0 = r7.zzu(r8)
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r0 = r0.zzr(r1)
            if (r0 == 0) goto Lab
            java.util.Map r0 = r7.zzE
            java.lang.Object r1 = r0.get(r8)
            com.google.android.gms.measurement.internal.zzps r1 = (com.google.android.gms.measurement.internal.zzps) r1
            if (r1 == 0) goto L9d
            long r2 = r1.zzb
            com.google.android.gms.measurement.internal.zzam r4 = r7.zzi()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzaj
            long r4 = r4.zzk(r8, r5)
            long r2 = r2 + r4
            com.google.android.gms.common.util.Clock r4 = r7.zzaU()
            long r4 = r4.elapsedRealtime()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto La6
        L9d:
            com.google.android.gms.measurement.internal.zzps r1 = new com.google.android.gms.measurement.internal.zzps
            r2 = 0
            r1.<init>(r7, r2)
            r0.put(r8, r1)
        La6:
            java.lang.String r0 = r1.zza
            r9.zzac(r0)
        Lab:
            com.google.android.gms.measurement.internal.zzif r0 = r7.zzr()
            boolean r8 = r0.zzC(r8)
            if (r8 == 0) goto Lb8
            r9.zzA()
        Lb8:
            return
    }

    final void zzO(com.google.android.gms.measurement.internal.zzh r7) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r6.zzaX()
            r0.zzg()
            java.lang.String r0 = r7.zzH()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = r7.zzA()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1c
            goto L31
        L1c:
            java.lang.String r7 = r7.zzC()
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r2 = 204(0xcc, float:2.86E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.zzW(r1, r2, r3, r4, r5)
            return
        L31:
            java.lang.String r0 = r7.zzC()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.measurement.internal.zzhe r1 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Fetching remote configuration"
            r1.zzb(r2, r0)
            com.google.android.gms.measurement.internal.zzif r1 = r6.zzr()
            com.google.android.gms.internal.measurement.zzgo r1 = r1.zzj(r0)
            com.google.android.gms.measurement.internal.zzif r2 = r6.zzr()
            java.lang.String r2 = r2.zzl(r0)
            r3 = 0
            if (r1 == 0) goto L87
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L6c
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r3 = "If-Modified-Since"
            r1.put(r3, r2)
            r3 = r1
        L6c:
            com.google.android.gms.measurement.internal.zzif r1 = r6.zzr()
            java.lang.String r0 = r1.zzk(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L87
            if (r3 != 0) goto L82
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            r3 = r1
        L82:
            java.lang.String r1 = "If-None-Match"
            r3.put(r1, r0)
        L87:
            r0 = 1
            r6.zzu = r0
            com.google.android.gms.measurement.internal.zzhk r0 = r6.zzp()
            com.google.android.gms.measurement.internal.zzpj r1 = new com.google.android.gms.measurement.internal.zzpj
            r1.<init>(r6)
            r0.zza(r7, r3, r1)
            return
    }

    final void zzP(com.google.android.gms.measurement.internal.zzr r13, long r14) {
            r12 = this;
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.zzaw r1 = r12.zzj()
            java.lang.String r2 = r13.zza
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzl(r2)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto Ld9
            com.google.android.gms.measurement.internal.zzqf r5 = r12.zzB()
            java.lang.String r6 = r13.zzb
            java.lang.String r7 = r1.zzH()
            java.lang.String r8 = r13.zzp
            java.lang.String r9 = r1.zzA()
            boolean r5 = r5.zzaw(r6, r7, r8, r9)
            if (r5 == 0) goto Ld9
            com.google.android.gms.measurement.internal.zzhe r5 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzk()
            java.lang.String r6 = r1.zzC()
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)
            java.lang.String r7 = "New GMP App Id passed in. Removing cached database data. appId"
            r5.zzb(r7, r6)
            com.google.android.gms.measurement.internal.zzaw r5 = r12.zzj()
            java.lang.String r1 = r1.zzC()
            r5.zzav()
            r5.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            android.database.sqlite.SQLiteDatabase r6 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lc4
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: android.database.sqlite.SQLiteException -> Lc4
            r7[r4] = r1     // Catch: android.database.sqlite.SQLiteException -> Lc4
            java.lang.String r8 = "events"
            int r8 = r6.delete(r8, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            java.lang.String r9 = "user_attributes"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "conditional_properties"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "apps"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "raw_events"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "raw_events_metadata"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "event_filters"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "property_filters"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "audience_filter_values"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "consent_settings"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "default_event_params"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r9
            java.lang.String r9 = "trigger_uris"
            int r0 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            int r8 = r8 + r0
            if (r8 <= 0) goto Ld8
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu     // Catch: android.database.sqlite.SQLiteException -> Lc4
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Lc4
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lc4
            java.lang.String r6 = "Deleted application data. app, records"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            r0.zzc(r6, r1, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc4
            goto Ld8
        Lc4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)
            java.lang.String r6 = "Error deleting application data. appId, error"
            r5.zzc(r6, r1, r0)
        Ld8:
            r1 = r3
        Ld9:
            if (r1 == 0) goto L13b
            long r5 = r1.zze()
            r7 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto Lf2
            long r5 = r1.zze()
            long r9 = r13.zzj
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto Lf2
            r0 = 1
            goto Lf3
        Lf2:
            r0 = 0
        Lf3:
            java.lang.String r5 = r1.zzF()
            long r9 = r1.zze()
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L10a
            if (r5 == 0) goto L10a
            java.lang.String r1 = r13.zzc
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L10a
            goto L10b
        L10a:
            r2 = 0
        L10b:
            r0 = r0 | r2
            if (r0 == 0) goto L13b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "_pv"
            r0.putString(r1, r5)
            com.google.android.gms.measurement.internal.zzbh r1 = new com.google.android.gms.measurement.internal.zzbh
            com.google.android.gms.measurement.internal.zzbf r8 = new com.google.android.gms.measurement.internal.zzbf
            r8.<init>(r0)
            java.lang.String r7 = "_au"
            java.lang.String r9 = "auto"
            r6 = r1
            r10 = r14
            r6.<init>(r7, r8, r9, r10)
            com.google.android.gms.measurement.internal.zzam r14 = r12.zzi()
            com.google.android.gms.measurement.internal.zzgg r15 = com.google.android.gms.measurement.internal.zzgi.zzbm
            boolean r14 = r14.zzx(r3, r15)
            if (r14 == 0) goto L138
            r12.zzU(r1, r13)
            return
        L138:
            r12.zzS(r1, r13)
        L13b:
            return
    }

    final void zzQ(com.google.android.gms.measurement.internal.zzh r12, com.google.android.gms.internal.measurement.zzhw r13) {
            r11 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r11.zzaX()
            r0.zzg()
            r11.zzM()
            java.lang.String r0 = r13.zzaH()
            com.google.android.gms.measurement.internal.zzao r0 = com.google.android.gms.measurement.internal.zzao.zzb(r0)
            java.lang.String r1 = r12.zzC()
            com.google.android.gms.measurement.internal.zzil r2 = r11.zzaX()
            r2.zzg()
            r11.zzM()
            com.google.android.gms.measurement.internal.zzjx r1 = r11.zzu(r1)
            com.google.android.gms.measurement.internal.zzju r2 = com.google.android.gms.measurement.internal.zzju.zza
            com.google.android.gms.measurement.internal.zzju r2 = r1.zze()
            int r2 = r2.ordinal()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3f
            if (r2 == r3) goto L3f
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zza
            com.google.android.gms.measurement.internal.zzan r6 = com.google.android.gms.measurement.internal.zzan.zzj
            r0.zzd(r2, r6)
            goto L50
        L3f:
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zza
            int r6 = r1.zzb()
            r0.zzc(r2, r6)
            goto L50
        L49:
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zza
            com.google.android.gms.measurement.internal.zzan r6 = com.google.android.gms.measurement.internal.zzan.zzi
            r0.zzd(r2, r6)
        L50:
            com.google.android.gms.measurement.internal.zzju r2 = r1.zzf()
            int r2 = r2.ordinal()
            if (r2 == r5) goto L70
            if (r2 == r4) goto L66
            if (r2 == r3) goto L66
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzb
            com.google.android.gms.measurement.internal.zzan r2 = com.google.android.gms.measurement.internal.zzan.zzj
            r0.zzd(r1, r2)
            goto L77
        L66:
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zzb
            int r1 = r1.zzb()
            r0.zzc(r2, r1)
            goto L77
        L70:
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzb
            com.google.android.gms.measurement.internal.zzan r2 = com.google.android.gms.measurement.internal.zzan.zzi
            r0.zzd(r1, r2)
        L77:
            java.lang.String r1 = r12.zzC()
            com.google.android.gms.measurement.internal.zzil r2 = r11.zzaX()
            r2.zzg()
            r11.zzM()
            com.google.android.gms.measurement.internal.zzba r2 = r11.zzm(r1)
            com.google.android.gms.measurement.internal.zzjx r3 = r11.zzu(r1)
            com.google.android.gms.measurement.internal.zzba r1 = r11.zzl(r1, r2, r3, r0)
            java.lang.Boolean r2 = r1.zzh()
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r13.zzak(r2)
            java.lang.String r2 = r1.zzi()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lb3
            java.lang.String r1 = r1.zzi()
            r13.zzU(r1)
        Lb3:
            com.google.android.gms.measurement.internal.zzil r1 = r11.zzaX()
            r1.zzg()
            r11.zzM()
            java.util.List r1 = r13.zzaN()
            java.util.Iterator r1 = r1.iterator()
        Lc5:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "_npa"
            if (r2 == 0) goto Lde
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.zzio r2 = (com.google.android.gms.internal.measurement.zzio) r2
            java.lang.String r4 = r2.zzg()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto Lc5
            goto Ldf
        Lde:
            r2 = 0
        Ldf:
            if (r2 == 0) goto L154
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzd
            com.google.android.gms.measurement.internal.zzan r4 = r0.zza(r1)
            com.google.android.gms.measurement.internal.zzan r6 = com.google.android.gms.measurement.internal.zzan.zza
            if (r4 == r6) goto Led
            goto L18e
        Led:
            com.google.android.gms.measurement.internal.zzaw r4 = r11.zzj()
            java.lang.String r6 = r12.zzC()
            com.google.android.gms.measurement.internal.zzqd r3 = r4.zzy(r6, r3)
            if (r3 == 0) goto L121
            java.lang.String r2 = r3.zzb
            java.lang.String r3 = "tcf"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L10c
            com.google.android.gms.measurement.internal.zzan r2 = com.google.android.gms.measurement.internal.zzan.zzh
            r0.zzd(r1, r2)
            goto L18e
        L10c:
            java.lang.String r3 = "app"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L11b
            com.google.android.gms.measurement.internal.zzan r2 = com.google.android.gms.measurement.internal.zzan.zzf
            r0.zzd(r1, r2)
            goto L18e
        L11b:
            com.google.android.gms.measurement.internal.zzan r2 = com.google.android.gms.measurement.internal.zzan.zzd
            r0.zzd(r1, r2)
            goto L18e
        L121:
            java.lang.Boolean r3 = r12.zzx()
            if (r3 == 0) goto L14e
            boolean r4 = r3.booleanValue()
            if (r4 == 0) goto L137
            long r6 = r2.zzc()
            r8 = 1
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L14e
        L137:
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L148
            long r2 = r2.zzc()
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L148
            goto L14e
        L148:
            com.google.android.gms.measurement.internal.zzan r2 = com.google.android.gms.measurement.internal.zzan.zzd
            r0.zzd(r1, r2)
            goto L18e
        L14e:
            com.google.android.gms.measurement.internal.zzan r2 = com.google.android.gms.measurement.internal.zzan.zzf
            r0.zzd(r1, r2)
            goto L18e
        L154:
            java.lang.String r1 = r12.zzC()
            int r1 = r11.zzaC(r1, r0)
            com.google.android.gms.internal.measurement.zzin r2 = com.google.android.gms.internal.measurement.zzio.zze()
            r2.zzf(r3)
            com.google.android.gms.common.util.Clock r3 = r11.zzaU()
            long r3 = r3.currentTimeMillis()
            r2.zzg(r3)
            long r3 = (long) r1
            r2.zze(r3)
            com.google.android.gms.internal.measurement.zzmd r2 = r2.zzba()
            com.google.android.gms.internal.measurement.zzio r2 = (com.google.android.gms.internal.measurement.zzio) r2
            r13.zzp(r2)
            com.google.android.gms.measurement.internal.zzhe r2 = r11.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Setting user property"
            java.lang.String r4 = "non_personalized_ads(_npa)"
            r2.zzc(r3, r4, r1)
        L18e:
            java.lang.String r0 = r0.toString()
            r13.zzS(r0)
            com.google.android.gms.measurement.internal.zzif r0 = r11.zzc
            java.lang.String r12 = r12.zzC()
            boolean r12 = r0.zzv(r12)
            java.util.List r0 = r13.zzaM()
            r1 = 0
            r2 = 0
        L1a5:
            int r3 = r0.size()
            if (r2 >= r3) goto L236
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzhm r3 = (com.google.android.gms.internal.measurement.zzhm) r3
            java.lang.String r3 = r3.zzh()
            java.lang.String r4 = "_tcf"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L232
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzch()
            com.google.android.gms.internal.measurement.zzhl r0 = (com.google.android.gms.internal.measurement.zzhl) r0
            java.util.List r3 = r0.zzp()
            r4 = 0
        L1ce:
            int r6 = r3.size()
            if (r4 >= r6) goto L22e
            java.lang.Object r6 = r3.get(r4)
            com.google.android.gms.internal.measurement.zzhq r6 = (com.google.android.gms.internal.measurement.zzhq) r6
            java.lang.String r6 = r6.zzg()
            java.lang.String r7 = "_tcfd"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L22b
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3
            java.lang.String r3 = r3.zzh()
            if (r12 == 0) goto L21d
            int r12 = r3.length()
            r6 = 4
            if (r12 > r6) goto L1fa
            goto L21d
        L1fa:
            char[] r12 = r3.toCharArray()
            r3 = 1
        L1ff:
            r8 = 64
            java.lang.String r9 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_"
            if (r3 >= r8) goto L212
            char r8 = r12[r6]
            char r10 = r9.charAt(r3)
            if (r8 != r10) goto L20f
            r1 = r3
            goto L212
        L20f:
            int r3 = r3 + 1
            goto L1ff
        L212:
            r1 = r1 | r5
            char r1 = r9.charAt(r1)
            r12[r6] = r1
            java.lang.String r3 = java.lang.String.valueOf(r12)
        L21d:
            com.google.android.gms.internal.measurement.zzhp r12 = com.google.android.gms.internal.measurement.zzhq.zze()
            r12.zzj(r7)
            r12.zzk(r3)
            r0.zzj(r4, r12)
            goto L22e
        L22b:
            int r4 = r4 + 1
            goto L1ce
        L22e:
            r13.zzad(r2, r0)
            return
        L232:
            int r2 = r2 + 1
            goto L1a5
        L236:
            return
    }

    final void zzR(com.google.android.gms.internal.measurement.zzhw r24, com.google.android.gms.measurement.internal.zzpr r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 0
        L7:
            int r4 = r24.zzc()
            if (r3 >= r4) goto L1c5
            com.google.android.gms.internal.measurement.zzhm r4 = r1.zzh(r3)
            com.google.android.gms.internal.measurement.zzlz r4 = r4.zzch()
            com.google.android.gms.internal.measurement.zzhl r4 = (com.google.android.gms.internal.measurement.zzhl) r4
            java.util.List r5 = r4.zzp()
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1c1
            java.lang.Object r6 = r5.next()
            com.google.android.gms.internal.measurement.zzhq r6 = (com.google.android.gms.internal.measurement.zzhq) r6
            java.lang.String r6 = r6.zzg()
            java.lang.String r7 = "_c"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L1f
            com.google.android.gms.internal.measurement.zzhx r5 = r2.zza
            int r5 = r5.zza()
            com.google.android.gms.measurement.internal.zzam r6 = r23.zzi()
            com.google.android.gms.internal.measurement.zzhx r7 = r2.zza
            java.lang.String r7 = r7.zzF()
            com.google.android.gms.measurement.internal.zzgg r8 = com.google.android.gms.measurement.internal.zzgi.zzak
            int r6 = r6.zzh(r7, r8)
            if (r5 < r6) goto L1b8
            com.google.android.gms.measurement.internal.zzam r5 = r23.zzi()
            com.google.android.gms.internal.measurement.zzhx r6 = r2.zza
            java.lang.String r6 = r6.zzF()
            com.google.android.gms.measurement.internal.zzgg r7 = com.google.android.gms.measurement.internal.zzgi.zzax
            int r5 = r5.zzh(r6, r7)
            java.lang.String r6 = "Generated trigger URI. appId, uri"
            java.lang.String r7 = "_tr"
            java.lang.String r8 = "_tu"
            r9 = 0
            r10 = 1
            if (r5 <= 0) goto L131
            com.google.android.gms.measurement.internal.zzaw r12 = r23.zzj()
            long r13 = r23.zza()
            com.google.android.gms.internal.measurement.zzhx r15 = r2.zza
            java.lang.String r15 = r15.zzF()
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            com.google.android.gms.measurement.internal.zzas r12 = r12.zzo(r13, r15, r16, r17, r18, r19, r20, r21, r22)
            long r12 = r12.zzg
            long r14 = (long) r5
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 <= 0) goto La8
            com.google.android.gms.internal.measurement.zzhp r5 = com.google.android.gms.internal.measurement.zzhq.zze()
            java.lang.String r6 = "_tnr"
            r5.zzj(r6)
            r5.zzi(r10)
            com.google.android.gms.internal.measurement.zzmd r5 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5
            r4.zzf(r5)
            goto L1b8
        La8:
            com.google.android.gms.measurement.internal.zzam r5 = r23.zzi()
            com.google.android.gms.internal.measurement.zzhx r12 = r2.zza
            java.lang.String r12 = r12.zzF()
            com.google.android.gms.measurement.internal.zzgg r13 = com.google.android.gms.measurement.internal.zzgi.zzaX
            boolean r5 = r5.zzx(r12, r13)
            if (r5 == 0) goto Ld5
            com.google.android.gms.measurement.internal.zzqf r5 = r23.zzB()
            java.lang.String r9 = r5.zzF()
            com.google.android.gms.internal.measurement.zzhp r5 = com.google.android.gms.internal.measurement.zzhq.zze()
            r5.zzj(r8)
            r5.zzk(r9)
            com.google.android.gms.internal.measurement.zzmd r5 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5
            r4.zzf(r5)
        Ld5:
            com.google.android.gms.internal.measurement.zzhp r5 = com.google.android.gms.internal.measurement.zzhq.zze()
            r5.zzj(r7)
            r5.zzi(r10)
            com.google.android.gms.internal.measurement.zzmd r5 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5
            r4.zzf(r5)
            com.google.android.gms.measurement.internal.zzqa r5 = r23.zzA()
            com.google.android.gms.internal.measurement.zzhx r7 = r2.zza
            java.lang.String r7 = r7.zzF()
            com.google.android.gms.measurement.internal.zzov r5 = r5.zzl(r7, r1, r4, r9)
            if (r5 == 0) goto L1b8
            com.google.android.gms.measurement.internal.zzhe r7 = r23.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzj()
            com.google.android.gms.internal.measurement.zzhx r8 = r2.zza
            java.lang.String r8 = r8.zzF()
            java.lang.String r9 = r5.zza
            r7.zzc(r6, r8, r9)
            com.google.android.gms.measurement.internal.zzaw r6 = r23.zzj()
            com.google.android.gms.internal.measurement.zzhx r7 = r2.zza
            java.lang.String r7 = r7.zzF()
            r6.zzad(r7, r5)
            java.util.Deque r5 = r0.zzr
            com.google.android.gms.internal.measurement.zzhx r6 = r2.zza
            java.lang.String r6 = r6.zzF()
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L1b8
            com.google.android.gms.internal.measurement.zzhx r6 = r2.zza
            java.lang.String r6 = r6.zzF()
            r5.add(r6)
            goto L1b8
        L131:
            com.google.android.gms.measurement.internal.zzam r5 = r23.zzi()
            com.google.android.gms.internal.measurement.zzhx r12 = r2.zza
            java.lang.String r12 = r12.zzF()
            com.google.android.gms.measurement.internal.zzgg r13 = com.google.android.gms.measurement.internal.zzgi.zzaX
            boolean r5 = r5.zzx(r12, r13)
            if (r5 == 0) goto L15e
            com.google.android.gms.measurement.internal.zzqf r5 = r23.zzB()
            java.lang.String r9 = r5.zzF()
            com.google.android.gms.internal.measurement.zzhp r5 = com.google.android.gms.internal.measurement.zzhq.zze()
            r5.zzj(r8)
            r5.zzk(r9)
            com.google.android.gms.internal.measurement.zzmd r5 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5
            r4.zzf(r5)
        L15e:
            com.google.android.gms.internal.measurement.zzhp r5 = com.google.android.gms.internal.measurement.zzhq.zze()
            r5.zzj(r7)
            r5.zzi(r10)
            com.google.android.gms.internal.measurement.zzmd r5 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5
            r4.zzf(r5)
            com.google.android.gms.measurement.internal.zzqa r5 = r23.zzA()
            com.google.android.gms.internal.measurement.zzhx r7 = r2.zza
            java.lang.String r7 = r7.zzF()
            com.google.android.gms.measurement.internal.zzov r5 = r5.zzl(r7, r1, r4, r9)
            if (r5 == 0) goto L1b8
            com.google.android.gms.measurement.internal.zzhe r7 = r23.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzj()
            com.google.android.gms.internal.measurement.zzhx r8 = r2.zza
            java.lang.String r8 = r8.zzF()
            java.lang.String r9 = r5.zza
            r7.zzc(r6, r8, r9)
            com.google.android.gms.measurement.internal.zzaw r6 = r23.zzj()
            com.google.android.gms.internal.measurement.zzhx r7 = r2.zza
            java.lang.String r7 = r7.zzF()
            r6.zzad(r7, r5)
            java.util.Deque r5 = r0.zzr
            com.google.android.gms.internal.measurement.zzhx r6 = r2.zza
            java.lang.String r6 = r6.zzF()
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L1b8
            com.google.android.gms.internal.measurement.zzhx r6 = r2.zza
            java.lang.String r6 = r6.zzF()
            r5.add(r6)
        L1b8:
            com.google.android.gms.internal.measurement.zzmd r4 = r4.zzba()
            com.google.android.gms.internal.measurement.zzhm r4 = (com.google.android.gms.internal.measurement.zzhm) r4
            r1.zzae(r3, r4)
        L1c1:
            int r3 = r3 + 1
            goto L7
        L1c5:
            return
    }

    final void zzS(com.google.android.gms.measurement.internal.zzbh r21, com.google.android.gms.measurement.internal.zzr r22) {
            r20 = this;
            r1 = r20
            r0 = r22
            java.lang.String r2 = "_s"
            java.lang.String r3 = "_sid"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r22)
            java.lang.String r4 = r0.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            com.google.android.gms.measurement.internal.zzil r5 = r20.zzaX()
            r5.zzg()
            r20.zzM()
            r5 = r21
            long r12 = r5.zzd
            com.google.android.gms.measurement.internal.zzhf r5 = com.google.android.gms.measurement.internal.zzhf.zzb(r21)
            com.google.android.gms.measurement.internal.zzil r6 = r20.zzaX()
            r6.zzg()
            com.google.android.gms.measurement.internal.zzmh r6 = r1.zzG
            r7 = 0
            if (r6 == 0) goto L3c
            java.lang.String r6 = r1.zzH
            if (r6 == 0) goto L3c
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L39
            goto L3c
        L39:
            com.google.android.gms.measurement.internal.zzmh r6 = r1.zzG
            goto L3d
        L3c:
            r6 = r7
        L3d:
            android.os.Bundle r8 = r5.zzd
            r9 = 0
            com.google.android.gms.measurement.internal.zzqf.zzN(r6, r8, r9)
            com.google.android.gms.measurement.internal.zzbh r5 = r5.zza()
            r20.zzA()
            boolean r6 = com.google.android.gms.measurement.internal.zzqa.zzE(r5, r0)
            if (r6 != 0) goto L51
            return
        L51:
            boolean r6 = r0.zzh
            if (r6 != 0) goto L59
            r1.zzg(r0)
            return
        L59:
            java.util.List r6 = r0.zzs
            if (r6 == 0) goto L9b
            java.lang.String r15 = r5.zza
            boolean r6 = r6.contains(r15)
            if (r6 == 0) goto L89
            com.google.android.gms.measurement.internal.zzbf r6 = r5.zzb
            android.os.Bundle r6 = r6.zzc()
            r10 = 1
            java.lang.String r8 = "ga_safelisted"
            r6.putLong(r8, r10)
            com.google.android.gms.measurement.internal.zzbh r8 = new com.google.android.gms.measurement.internal.zzbh
            com.google.android.gms.measurement.internal.zzbf r10 = new com.google.android.gms.measurement.internal.zzbf
            r10.<init>(r6)
            java.lang.String r6 = r5.zzc
            r11 = r10
            long r9 = r5.zzd
            r14 = r8
            r16 = r11
            r17 = r6
            r18 = r9
            r14.<init>(r15, r16, r17, r18)
            goto L9c
        L89:
            com.google.android.gms.measurement.internal.zzhe r0 = r20.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r2 = r5.zza
            java.lang.String r3 = r5.zzc
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r0.zzd(r5, r4, r2, r3)
            return
        L9b:
            r14 = r5
        L9c:
            com.google.android.gms.measurement.internal.zzaw r5 = r20.zzj()
            r5.zzH()
            com.google.android.gms.internal.measurement.zzra.zzb()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzam r5 = r20.zzi()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzbi     // Catch: java.lang.Throwable -> L369
            boolean r5 = r5.zzx(r7, r6)     // Catch: java.lang.Throwable -> L369
            r8 = 0
            if (r5 == 0) goto L113
            java.lang.String r5 = r14.zza     // Catch: java.lang.Throwable -> L369
            boolean r5 = r2.equals(r5)     // Catch: java.lang.Throwable -> L369
            if (r5 == 0) goto L113
            com.google.android.gms.measurement.internal.zzaw r5 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            boolean r2 = r5.zzZ(r4, r2)     // Catch: java.lang.Throwable -> L369
            if (r2 != 0) goto L113
            com.google.android.gms.measurement.internal.zzbf r2 = r14.zzb     // Catch: java.lang.Throwable -> L369
            java.lang.Long r2 = r2.zze(r3)     // Catch: java.lang.Throwable -> L369
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> L369
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 == 0) goto L113
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            java.lang.String r5 = "_f"
            boolean r2 = r2.zzZ(r4, r5)     // Catch: java.lang.Throwable -> L369
            if (r2 != 0) goto L108
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            java.lang.String r5 = "_v"
            boolean r2 = r2.zzZ(r4, r5)     // Catch: java.lang.Throwable -> L369
            if (r2 == 0) goto Led
            goto L108
        Led:
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.common.util.Clock r5 = r20.zzaU()     // Catch: java.lang.Throwable -> L369
            long r5 = r5.currentTimeMillis()     // Catch: java.lang.Throwable -> L369
            r10 = -15000(0xffffffffffffc568, double:NaN)
            long r5 = r5 + r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L369
            android.os.Bundle r6 = r1.zzf(r4, r14)     // Catch: java.lang.Throwable -> L369
            r2.zzG(r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L369
            goto L113
        L108:
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            android.os.Bundle r5 = r1.zzf(r4, r14)     // Catch: java.lang.Throwable -> L369
            r2.zzG(r4, r7, r3, r5)     // Catch: java.lang.Throwable -> L369
        L113:
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch: java.lang.Throwable -> L369
            r2.zzg()     // Catch: java.lang.Throwable -> L369
            r2.zzav()     // Catch: java.lang.Throwable -> L369
            r3 = 2
            r15 = 1
            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r5 >= 0) goto L142
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()     // Catch: java.lang.Throwable -> L369
            java.lang.String r6 = "Invalid time querying timed out conditional properties"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r4)     // Catch: java.lang.Throwable -> L369
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L369
            r2.zzc(r6, r7, r8)     // Catch: java.lang.Throwable -> L369
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L369
            goto L153
        L142:
            java.lang.String r6 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L369
            r8 = 0
            r7[r8] = r4     // Catch: java.lang.Throwable -> L369
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L369
            r7[r15] = r8     // Catch: java.lang.Throwable -> L369
            java.util.List r2 = r2.zzC(r6, r7)     // Catch: java.lang.Throwable -> L369
        L153:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L369
        L157:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> L369
            if (r6 == 0) goto L1a0
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzai r6 = (com.google.android.gms.measurement.internal.zzai) r6     // Catch: java.lang.Throwable -> L369
            if (r6 == 0) goto L157
            com.google.android.gms.measurement.internal.zzhe r7 = r20.zzaW()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzj()     // Catch: java.lang.Throwable -> L369
            java.lang.String r8 = "User property timed out"
            java.lang.String r9 = r6.zza     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzio r10 = r1.zzn     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzgx r10 = r10.zzj()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzqb r11 = r6.zzc     // Catch: java.lang.Throwable -> L369
            java.lang.String r11 = r11.zzb     // Catch: java.lang.Throwable -> L369
            java.lang.String r10 = r10.zzf(r11)     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzqb r11 = r6.zzc     // Catch: java.lang.Throwable -> L369
            java.lang.Object r11 = r11.zza()     // Catch: java.lang.Throwable -> L369
            r7.zzd(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzbh r7 = r6.zzg     // Catch: java.lang.Throwable -> L369
            if (r7 == 0) goto L194
            com.google.android.gms.measurement.internal.zzbh r8 = new com.google.android.gms.measurement.internal.zzbh     // Catch: java.lang.Throwable -> L369
            r8.<init>(r7, r12)     // Catch: java.lang.Throwable -> L369
            r1.zzax(r8, r0)     // Catch: java.lang.Throwable -> L369
        L194:
            com.google.android.gms.measurement.internal.zzaw r7 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzqb r6 = r6.zzc     // Catch: java.lang.Throwable -> L369
            java.lang.String r6 = r6.zzb     // Catch: java.lang.Throwable -> L369
            r7.zza(r4, r6)     // Catch: java.lang.Throwable -> L369
            goto L157
        L1a0:
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch: java.lang.Throwable -> L369
            r2.zzg()     // Catch: java.lang.Throwable -> L369
            r2.zzav()     // Catch: java.lang.Throwable -> L369
            if (r5 >= 0) goto L1cb
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()     // Catch: java.lang.Throwable -> L369
            java.lang.String r6 = "Invalid time querying expired conditional properties"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r4)     // Catch: java.lang.Throwable -> L369
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L369
            r2.zzc(r6, r7, r8)     // Catch: java.lang.Throwable -> L369
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L369
            goto L1dc
        L1cb:
            java.lang.String r6 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L369
            r8 = 0
            r7[r8] = r4     // Catch: java.lang.Throwable -> L369
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L369
            r7[r15] = r8     // Catch: java.lang.Throwable -> L369
            java.util.List r2 = r2.zzC(r6, r7)     // Catch: java.lang.Throwable -> L369
        L1dc:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L369
            int r7 = r2.size()     // Catch: java.lang.Throwable -> L369
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L369
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L369
        L1e9:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L369
            if (r7 == 0) goto L239
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzai r7 = (com.google.android.gms.measurement.internal.zzai) r7     // Catch: java.lang.Throwable -> L369
            if (r7 == 0) goto L1e9
            com.google.android.gms.measurement.internal.zzhe r8 = r20.zzaW()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzj()     // Catch: java.lang.Throwable -> L369
            java.lang.String r9 = "User property expired"
            java.lang.String r10 = r7.zza     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzio r11 = r1.zzn     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzgx r11 = r11.zzj()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzqb r3 = r7.zzc     // Catch: java.lang.Throwable -> L369
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L369
            java.lang.String r3 = r11.zzf(r3)     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzqb r11 = r7.zzc     // Catch: java.lang.Throwable -> L369
            java.lang.Object r11 = r11.zza()     // Catch: java.lang.Throwable -> L369
            r8.zzd(r9, r10, r3, r11)     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzaw r3 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzqb r8 = r7.zzc     // Catch: java.lang.Throwable -> L369
            java.lang.String r8 = r8.zzb     // Catch: java.lang.Throwable -> L369
            r3.zzP(r4, r8)     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzbh r3 = r7.zzk     // Catch: java.lang.Throwable -> L369
            if (r3 == 0) goto L22c
            r6.add(r3)     // Catch: java.lang.Throwable -> L369
        L22c:
            com.google.android.gms.measurement.internal.zzaw r3 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzqb r7 = r7.zzc     // Catch: java.lang.Throwable -> L369
            java.lang.String r7 = r7.zzb     // Catch: java.lang.Throwable -> L369
            r3.zza(r4, r7)     // Catch: java.lang.Throwable -> L369
            r3 = 2
            goto L1e9
        L239:
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> L369
        L23d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L369
            if (r3 == 0) goto L252
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzbh r3 = (com.google.android.gms.measurement.internal.zzbh) r3     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzbh r6 = new com.google.android.gms.measurement.internal.zzbh     // Catch: java.lang.Throwable -> L369
            r6.<init>(r3, r12)     // Catch: java.lang.Throwable -> L369
            r1.zzax(r6, r0)     // Catch: java.lang.Throwable -> L369
            goto L23d
        L252:
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            java.lang.String r3 = r14.zza     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch: java.lang.Throwable -> L369
            r2.zzg()     // Catch: java.lang.Throwable -> L369
            r2.zzav()     // Catch: java.lang.Throwable -> L369
            if (r5 >= 0) goto L28a
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhe r5 = r2.zzaW()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzk()     // Catch: java.lang.Throwable -> L369
            java.lang.String r6 = "Invalid time querying triggered conditional properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r4)     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()     // Catch: java.lang.Throwable -> L369
            java.lang.String r2 = r2.zzd(r3)     // Catch: java.lang.Throwable -> L369
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L369
            r5.zzd(r6, r4, r2, r3)     // Catch: java.lang.Throwable -> L369
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L369
            goto L29f
        L28a:
            java.lang.String r5 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L369
            r7 = 0
            r6[r7] = r4     // Catch: java.lang.Throwable -> L369
            r6[r15] = r3     // Catch: java.lang.Throwable -> L369
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L369
            r4 = 2
            r6[r4] = r3     // Catch: java.lang.Throwable -> L369
            java.util.List r2 = r2.zzC(r5, r6)     // Catch: java.lang.Throwable -> L369
        L29f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L369
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L369
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L369
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L369
        L2ac:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L369
            if (r4 == 0) goto L33e
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzai r4 = (com.google.android.gms.measurement.internal.zzai) r4     // Catch: java.lang.Throwable -> L369
            if (r4 == 0) goto L2ac
            com.google.android.gms.measurement.internal.zzqb r5 = r4.zzc     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzqd r11 = new com.google.android.gms.measurement.internal.zzqd     // Catch: java.lang.Throwable -> L369
            java.lang.String r6 = r4.zza     // Catch: java.lang.Throwable -> L369
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L369
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L369
            java.lang.String r7 = r4.zzb     // Catch: java.lang.Throwable -> L369
            java.lang.String r8 = r5.zzb     // Catch: java.lang.Throwable -> L369
            java.lang.Object r5 = r5.zza()     // Catch: java.lang.Throwable -> L369
            java.lang.Object r16 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> L369
            r5 = r11
            r9 = r12
            r15 = r11
            r11 = r16
            r5.<init>(r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzaw r5 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            boolean r5 = r5.zzai(r15)     // Catch: java.lang.Throwable -> L369
            if (r5 == 0) goto L302
            com.google.android.gms.measurement.internal.zzhe r5 = r20.zzaW()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzj()     // Catch: java.lang.Throwable -> L369
            java.lang.String r6 = "User property triggered"
            java.lang.String r7 = r4.zza     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzio r8 = r1.zzn     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzgx r8 = r8.zzj()     // Catch: java.lang.Throwable -> L369
            java.lang.String r9 = r15.zzc     // Catch: java.lang.Throwable -> L369
            java.lang.String r8 = r8.zzf(r9)     // Catch: java.lang.Throwable -> L369
            java.lang.Object r9 = r15.zze     // Catch: java.lang.Throwable -> L369
            r5.zzd(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L369
            goto L323
        L302:
            com.google.android.gms.measurement.internal.zzhe r5 = r20.zzaW()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> L369
            java.lang.String r6 = "Too many active user properties, ignoring"
            java.lang.String r7 = r4.zza     // Catch: java.lang.Throwable -> L369
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzio r8 = r1.zzn     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzgx r8 = r8.zzj()     // Catch: java.lang.Throwable -> L369
            java.lang.String r9 = r15.zzc     // Catch: java.lang.Throwable -> L369
            java.lang.String r8 = r8.zzf(r9)     // Catch: java.lang.Throwable -> L369
            java.lang.Object r9 = r15.zze     // Catch: java.lang.Throwable -> L369
            r5.zzd(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L369
        L323:
            com.google.android.gms.measurement.internal.zzbh r5 = r4.zzi     // Catch: java.lang.Throwable -> L369
            if (r5 == 0) goto L32a
            r3.add(r5)     // Catch: java.lang.Throwable -> L369
        L32a:
            com.google.android.gms.measurement.internal.zzqb r5 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.lang.Throwable -> L369
            r5.<init>(r15)     // Catch: java.lang.Throwable -> L369
            r4.zzc = r5     // Catch: java.lang.Throwable -> L369
            r5 = 1
            r4.zze = r5     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzaw r6 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            r6.zzah(r4)     // Catch: java.lang.Throwable -> L369
            r15 = 1
            goto L2ac
        L33e:
            r1.zzax(r14, r0)     // Catch: java.lang.Throwable -> L369
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L369
        L345:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L369
            if (r3 == 0) goto L35a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzbh r3 = (com.google.android.gms.measurement.internal.zzbh) r3     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzbh r4 = new com.google.android.gms.measurement.internal.zzbh     // Catch: java.lang.Throwable -> L369
            r4.<init>(r3, r12)     // Catch: java.lang.Throwable -> L369
            r1.zzax(r4, r0)     // Catch: java.lang.Throwable -> L369
            goto L345
        L35a:
            com.google.android.gms.measurement.internal.zzaw r0 = r20.zzj()     // Catch: java.lang.Throwable -> L369
            r0.zzS()     // Catch: java.lang.Throwable -> L369
            com.google.android.gms.measurement.internal.zzaw r0 = r20.zzj()
            r0.zzL()
            return
        L369:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()
            r2.zzL()
            throw r0
    }

    final void zzT(com.google.android.gms.measurement.internal.zzbh r46, java.lang.String r47) {
            r45 = this;
            r0 = r45
            r1 = r46
            r3 = r47
            com.google.android.gms.measurement.internal.zzaw r2 = r45.zzj()
            com.google.android.gms.measurement.internal.zzh r15 = r2.zzl(r3)
            if (r15 == 0) goto Le5
            java.lang.String r2 = r15.zzF()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L1c
            goto Le5
        L1c:
            java.lang.Boolean r2 = r0.zzaF(r15)
            if (r2 != 0) goto L3e
            java.lang.String r2 = r1.zza
            java.lang.String r4 = "_ui"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L56
            com.google.android.gms.measurement.internal.zzhe r2 = r45.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r47)
            java.lang.String r5 = "Could not find package. appId"
            r2.zzb(r5, r4)
            goto L56
        L3e:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L56
            com.google.android.gms.measurement.internal.zzhe r1 = r45.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r47)
            java.lang.String r3 = "App version does not match; dropping event. appId"
            r1.zzb(r3, r2)
            return
        L56:
            com.google.android.gms.measurement.internal.zzr r14 = new com.google.android.gms.measurement.internal.zzr
            r2 = r14
            java.lang.String r4 = r15.zzH()
            java.lang.String r5 = r15.zzF()
            long r6 = r15.zze()
            java.lang.String r8 = r15.zzE()
            long r9 = r15.zzq()
            long r11 = r15.zzn()
            r13 = 0
            boolean r16 = r15.zzaJ()
            r44 = r14
            r14 = r16
            r16 = 0
            r29 = r15
            r15 = r16
            java.lang.String r16 = r29.zzG()
            r17 = 0
            r19 = 0
            boolean r20 = r29.zzaI()
            r21 = 0
            java.lang.String r22 = r29.zzA()
            java.lang.Boolean r23 = r29.zzx()
            long r24 = r29.zzo()
            java.util.List r26 = r29.zzN()
            r27 = 0
            com.google.android.gms.measurement.internal.zzjx r28 = r0.zzu(r3)
            java.lang.String r28 = r28.zzq()
            boolean r31 = r29.zzaL()
            long r32 = r29.zzw()
            com.google.android.gms.measurement.internal.zzjx r30 = r0.zzu(r3)
            int r34 = r30.zzb()
            com.google.android.gms.measurement.internal.zzba r30 = r0.zzm(r3)
            java.lang.String r35 = r30.zzj()
            int r36 = r29.zza()
            long r37 = r29.zzf()
            java.lang.String r39 = r29.zzM()
            java.lang.String r40 = r29.zzK()
            int r43 = r29.zzb()
            r30 = 0
            r41 = 0
            java.lang.String r29 = ""
            r3 = r47
            r2.<init>(r3, r4, r5, r6, r8, r9, r11, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r39, r40, r41, r43)
            r2 = r44
            r0.zzU(r1, r2)
            return
        Le5:
            com.google.android.gms.measurement.internal.zzhe r1 = r45.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            java.lang.String r2 = "No app data available; dropping event"
            r1.zzb(r2, r3)
            return
    }

    final void zzU(com.google.android.gms.measurement.internal.zzbh r9, com.google.android.gms.measurement.internal.zzr r10) {
            r8 = this;
            java.lang.String r0 = r10.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzhf r9 = com.google.android.gms.measurement.internal.zzhf.zzb(r9)
            android.os.Bundle r1 = r9.zzd
            com.google.android.gms.measurement.internal.zzqf r2 = r8.zzB()
            com.google.android.gms.measurement.internal.zzaw r3 = r8.zzj()
            android.os.Bundle r3 = r3.zzk(r0)
            r2.zzO(r1, r3)
            com.google.android.gms.measurement.internal.zzqf r1 = r8.zzB()
            com.google.android.gms.measurement.internal.zzam r2 = r8.zzi()
            int r0 = r2.zzf(r0)
            r1.zzQ(r9, r0)
            com.google.android.gms.measurement.internal.zzbh r9 = r9.zza()
            java.lang.String r0 = r9.zza
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L38
            goto L63
        L38:
            com.google.android.gms.measurement.internal.zzbf r0 = r9.zzb
            java.lang.String r1 = "_cis"
            java.lang.String r1 = r0.zzg(r1)
            java.lang.String r2 = "referrer API v2"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L63
            java.lang.String r1 = "gclid"
            java.lang.String r6 = r0.zzg(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L63
            long r4 = r9.zzd
            com.google.android.gms.measurement.internal.zzqb r0 = new com.google.android.gms.measurement.internal.zzqb
            java.lang.String r3 = "_lgclid"
            java.lang.String r7 = "auto"
            r2 = r0
            r2.<init>(r3, r4, r6, r7)
            r8.zzas(r0, r10)
        L63:
            r8.zzS(r9, r10)
            return
    }

    final void zzV() {
            r1 = this;
            int r0 = r1.zzt
            int r0 = r0 + 1
            r1.zzt = r0
            return
    }

    final void zzW(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r6.zzaX()
            r0.zzg()
            r6.zzM()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r0 = 0
            if (r10 != 0) goto L12
            byte[] r10 = new byte[r0]     // Catch: java.lang.Throwable -> L175
        L12:
            com.google.android.gms.measurement.internal.zzhe r1 = r6.zzaW()     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()     // Catch: java.lang.Throwable -> L175
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch: java.lang.Throwable -> L175
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L175
            r1.zzb(r2, r3)     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzaw r1 = r6.zzj()     // Catch: java.lang.Throwable -> L175
            r1.zzH()     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzaw r1 = r6.zzj()     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzl(r7)     // Catch: java.lang.Throwable -> L16c
            r2 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L41
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L41
            if (r8 != r4) goto L45
            r8 = 304(0x130, float:4.26E-43)
        L41:
            if (r9 != 0) goto L45
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            if (r1 != 0) goto L5b
            com.google.android.gms.measurement.internal.zzhe r8 = r6.zzaW()     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzk()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)     // Catch: java.lang.Throwable -> L16c
            r8.zzb(r9, r7)     // Catch: java.lang.Throwable -> L16c
            goto L158
        L5b:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto Lb7
            if (r8 != r5) goto L62
            goto Lb7
        L62:
            com.google.android.gms.common.util.Clock r10 = r6.zzaU()     // Catch: java.lang.Throwable -> L16c
            long r10 = r10.currentTimeMillis()     // Catch: java.lang.Throwable -> L16c
            r1.zzam(r10)     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzaw r10 = r6.zzj()     // Catch: java.lang.Throwable -> L16c
            r10.zzT(r1, r0, r0)     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzhe r10 = r6.zzaW()     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzj()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L16c
            r10.zzc(r11, r1, r9)     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzif r9 = r6.zzr()     // Catch: java.lang.Throwable -> L16c
            r9.zzq(r7)     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzoa r7 = r6.zzk     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzhp r7 = r7.zze     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.common.util.Clock r9 = r6.zzaU()     // Catch: java.lang.Throwable -> L16c
            long r9 = r9.currentTimeMillis()     // Catch: java.lang.Throwable -> L16c
            r7.zzb(r9)     // Catch: java.lang.Throwable -> L16c
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto La3
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto Lb2
        La3:
            com.google.android.gms.measurement.internal.zzoa r7 = r6.zzk     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzhp r7 = r7.zzc     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.common.util.Clock r8 = r6.zzaU()     // Catch: java.lang.Throwable -> L16c
            long r8 = r8.currentTimeMillis()     // Catch: java.lang.Throwable -> L16c
            r7.zzb(r8)     // Catch: java.lang.Throwable -> L16c
        Lb2:
            r6.zzaL()     // Catch: java.lang.Throwable -> L16c
            goto L158
        Lb7:
            java.lang.String r9 = "Last-Modified"
            java.lang.String r9 = zzaG(r11, r9)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r2 = "ETag"
            java.lang.String r11 = zzaG(r11, r2)     // Catch: java.lang.Throwable -> L16c
            r2 = 0
            if (r8 == r5) goto Ld1
            if (r8 != r4) goto Lc9
            goto Ld1
        Lc9:
            com.google.android.gms.measurement.internal.zzif r4 = r6.zzr()     // Catch: java.lang.Throwable -> L16c
            r4.zzz(r7, r10, r9, r11)     // Catch: java.lang.Throwable -> L16c
            goto Le2
        Ld1:
            com.google.android.gms.measurement.internal.zzif r9 = r6.zzr()     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.internal.measurement.zzgo r9 = r9.zzj(r7)     // Catch: java.lang.Throwable -> L16c
            if (r9 != 0) goto Le2
            com.google.android.gms.measurement.internal.zzif r9 = r6.zzr()     // Catch: java.lang.Throwable -> L16c
            r9.zzz(r7, r2, r2, r2)     // Catch: java.lang.Throwable -> L16c
        Le2:
            com.google.android.gms.common.util.Clock r9 = r6.zzaU()     // Catch: java.lang.Throwable -> L16c
            long r9 = r9.currentTimeMillis()     // Catch: java.lang.Throwable -> L16c
            r1.zzab(r9)     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzaw r9 = r6.zzj()     // Catch: java.lang.Throwable -> L16c
            r9.zzT(r1, r0, r0)     // Catch: java.lang.Throwable -> L16c
            if (r8 != r5) goto L104
            com.google.android.gms.measurement.internal.zzhe r8 = r6.zzaW()     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzl()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.zzb(r9, r7)     // Catch: java.lang.Throwable -> L16c
            goto L115
        L104:
            com.google.android.gms.measurement.internal.zzhe r7 = r6.zzaW()     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzj()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L16c
            r7.zzc(r9, r8, r3)     // Catch: java.lang.Throwable -> L16c
        L115:
            com.google.android.gms.measurement.internal.zzhk r7 = r6.zzp()     // Catch: java.lang.Throwable -> L16c
            boolean r7 = r7.zzd()     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto L129
            boolean r7 = r6.zzaN()     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto L129
            r6.zzat()     // Catch: java.lang.Throwable -> L16c
            goto L158
        L129:
            com.google.android.gms.measurement.internal.zzam r7 = r6.zzi()     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzgg r8 = com.google.android.gms.measurement.internal.zzgi.zzaM     // Catch: java.lang.Throwable -> L16c
            boolean r7 = r7.zzx(r2, r8)     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto L155
            com.google.android.gms.measurement.internal.zzhk r7 = r6.zzp()     // Catch: java.lang.Throwable -> L16c
            boolean r7 = r7.zzd()     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto L155
            com.google.android.gms.measurement.internal.zzaw r7 = r6.zzj()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r8 = r1.zzC()     // Catch: java.lang.Throwable -> L16c
            boolean r7 = r7.zzY(r8)     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto L155
            java.lang.String r7 = r1.zzC()     // Catch: java.lang.Throwable -> L16c
            r6.zzav(r7)     // Catch: java.lang.Throwable -> L16c
            goto L158
        L155:
            r6.zzaL()     // Catch: java.lang.Throwable -> L16c
        L158:
            com.google.android.gms.measurement.internal.zzaw r7 = r6.zzj()     // Catch: java.lang.Throwable -> L16c
            r7.zzS()     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.measurement.internal.zzaw r7 = r6.zzj()     // Catch: java.lang.Throwable -> L175
            r7.zzL()     // Catch: java.lang.Throwable -> L175
            r6.zzu = r0
            r6.zzaH()
            return
        L16c:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzaw r8 = r6.zzj()     // Catch: java.lang.Throwable -> L175
            r8.zzL()     // Catch: java.lang.Throwable -> L175
            throw r7     // Catch: java.lang.Throwable -> L175
        L175:
            r7 = move-exception
            r6.zzu = r0
            r6.zzaH()
            throw r7
    }

    final void zzX(boolean r1) {
            r0 = this;
            r0.zzaL()
            return
    }

    final void zzY(boolean r21, int r22, java.lang.Throwable r23, byte[] r24, java.lang.String r25, java.util.List r26) {
            r20 = this;
            r1 = r20
            r0 = r22
            r2 = r23
            r9 = r25
            com.google.android.gms.measurement.internal.zzil r3 = r20.zzaX()
            r3.zzg()
            r20.zzM()
            r10 = 0
            if (r24 != 0) goto L18
            byte[] r3 = new byte[r10]     // Catch: java.lang.Throwable -> L2ce
            goto L1a
        L18:
            r3 = r24
        L1a:
            java.util.List r4 = r1.zzz     // Catch: java.lang.Throwable -> L2ce
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L2ce
            r11 = r4
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L2ce
            r12 = 0
            r1.zzz = r12     // Catch: java.lang.Throwable -> L2ce
            if (r21 == 0) goto L8c
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 204(0xcc, float:2.86E-43)
            if (r0 == r4) goto L32
            if (r0 != r5) goto L34
            r0 = 204(0xcc, float:2.86E-43)
        L32:
            if (r2 == 0) goto L8c
        L34:
            r4 = 32
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L2ce
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2ce
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L2ce
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L2ce
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L2ce
            java.lang.String r3 = r5.substring(r10, r3)     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhe r4 = r20.zzaW()     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzl()     // Catch: java.lang.Throwable -> L2ce
            java.lang.String r5 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2ce
            r4.zzd(r5, r6, r2, r3)     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzoa r2 = r1.zzk     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhp r2 = r2.zze     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.common.util.Clock r3 = r20.zzaU()     // Catch: java.lang.Throwable -> L2ce
            long r3 = r3.currentTimeMillis()     // Catch: java.lang.Throwable -> L2ce
            r2.zzb(r3)     // Catch: java.lang.Throwable -> L2ce
            r2 = 503(0x1f7, float:7.05E-43)
            if (r0 == r2) goto L71
            r2 = 429(0x1ad, float:6.01E-43)
            if (r0 != r2) goto L80
        L71:
            com.google.android.gms.measurement.internal.zzoa r0 = r1.zzk     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhp r0 = r0.zzc     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.common.util.Clock r2 = r20.zzaU()     // Catch: java.lang.Throwable -> L2ce
            long r2 = r2.currentTimeMillis()     // Catch: java.lang.Throwable -> L2ce
            r0.zzb(r2)     // Catch: java.lang.Throwable -> L2ce
        L80:
            com.google.android.gms.measurement.internal.zzaw r0 = r20.zzj()     // Catch: java.lang.Throwable -> L2ce
            r0.zzM(r11)     // Catch: java.lang.Throwable -> L2ce
            r20.zzaL()     // Catch: java.lang.Throwable -> L2ce
            goto L2c8
        L8c:
            com.google.android.gms.measurement.internal.zzhe r2 = r20.zzaW()     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()     // Catch: java.lang.Throwable -> L2ce
            java.lang.String r4 = "Network upload successful with code, uploadAttempted"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2ce
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r21)     // Catch: java.lang.Throwable -> L2ce
            r2.zzc(r4, r0, r5)     // Catch: java.lang.Throwable -> L2ce
            if (r21 == 0) goto Lb2
            com.google.android.gms.measurement.internal.zzoa r2 = r1.zzk     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhp r2 = r2.zzd     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            com.google.android.gms.common.util.Clock r4 = r20.zzaU()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            long r4 = r4.currentTimeMillis()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            r2.zzb(r4)     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
        Lb2:
            com.google.android.gms.measurement.internal.zzoa r2 = r1.zzk     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhp r2 = r2.zze     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            r13 = 0
            r2.zzb(r13)     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            r20.zzaL()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            if (r21 == 0) goto Ld3
            com.google.android.gms.measurement.internal.zzhe r2 = r20.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            java.lang.String r4 = "Successful upload. Got network response. code, size"
            int r3 = r3.length     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            r2.zzc(r4, r0, r3)     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            goto Le0
        Ld3:
            com.google.android.gms.measurement.internal.zzhe r0 = r20.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            java.lang.String r2 = "Purged empty bundles"
            r0.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
        Le0:
            com.google.android.gms.measurement.internal.zzaw r0 = r20.zzj()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            r0.zzH()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzam r0 = r20.zzi()     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaM     // Catch: java.lang.Throwable -> L294
            boolean r0 = r0.zzx(r12, r2)     // Catch: java.lang.Throwable -> L294
            r7 = -1
            if (r0 == 0) goto L1e4
            com.google.android.gms.measurement.internal.zzam r0 = r20.zzi()     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaP     // Catch: java.lang.Throwable -> L294
            boolean r0 = r0.zzx(r12, r2)     // Catch: java.lang.Throwable -> L294
            if (r0 == 0) goto L1b2
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L294
            r0.<init>()     // Catch: java.lang.Throwable -> L294
            java.util.Iterator r15 = r26.iterator()     // Catch: java.lang.Throwable -> L294
        L10a:
            boolean r2 = r15.hasNext()     // Catch: java.lang.Throwable -> L294
            if (r2 == 0) goto L16e
            java.lang.Object r2 = r15.next()     // Catch: java.lang.Throwable -> L294
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L294
            java.lang.Object r3 = r2.first     // Catch: java.lang.Throwable -> L294
            r16 = r3
            com.google.android.gms.internal.measurement.zzhv r16 = (com.google.android.gms.internal.measurement.zzhv) r16     // Catch: java.lang.Throwable -> L294
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L294
            r17 = r2
            com.google.android.gms.measurement.internal.zzph r17 = (com.google.android.gms.measurement.internal.zzph) r17     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzmf r2 = r17.zza()     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzmf r3 = com.google.android.gms.measurement.internal.zzmf.zzd     // Catch: java.lang.Throwable -> L294
            if (r2 == r3) goto L16b
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()     // Catch: java.lang.Throwable -> L294
            java.lang.String r5 = r17.zzc()     // Catch: java.lang.Throwable -> L294
            java.util.Map r6 = r17.zzd()     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzmf r18 = r17.zza()     // Catch: java.lang.Throwable -> L294
            r19 = 0
            r3 = r25
            r4 = r16
            r13 = r7
            r7 = r18
            r8 = r19
            long r2 = r2.zzd(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzmf r4 = r17.zza()     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzmf r5 = com.google.android.gms.measurement.internal.zzmf.zze     // Catch: java.lang.Throwable -> L294
            if (r4 != r5) goto L16a
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L16a
            java.lang.String r4 = r16.zzf()     // Catch: java.lang.Throwable -> L294
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L294
            if (r4 != 0) goto L16a
            java.lang.String r4 = r16.zzf()     // Catch: java.lang.Throwable -> L294
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L294
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L294
        L16a:
            r7 = r13
        L16b:
            r13 = 0
            goto L10a
        L16e:
            r13 = r7
            java.util.Iterator r15 = r26.iterator()     // Catch: java.lang.Throwable -> L294
        L173:
            boolean r2 = r15.hasNext()     // Catch: java.lang.Throwable -> L294
            if (r2 == 0) goto L1e5
            java.lang.Object r2 = r15.next()     // Catch: java.lang.Throwable -> L294
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L294
            java.lang.Object r3 = r2.first     // Catch: java.lang.Throwable -> L294
            r4 = r3
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4     // Catch: java.lang.Throwable -> L294
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzph r2 = (com.google.android.gms.measurement.internal.zzph) r2     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzmf r3 = r2.zza()     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzmf r5 = com.google.android.gms.measurement.internal.zzmf.zzd     // Catch: java.lang.Throwable -> L294
            if (r3 != r5) goto L173
            java.lang.String r3 = r4.zzf()     // Catch: java.lang.Throwable -> L294
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L294
            r8 = r3
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzaw r3 = r20.zzj()     // Catch: java.lang.Throwable -> L294
            java.lang.String r5 = r2.zzc()     // Catch: java.lang.Throwable -> L294
            java.util.Map r6 = r2.zzd()     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzmf r7 = r2.zza()     // Catch: java.lang.Throwable -> L294
            r2 = r3
            r3 = r25
            r2.zzd(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L294
            goto L173
        L1b2:
            r13 = r7
            java.util.Iterator r0 = r26.iterator()     // Catch: java.lang.Throwable -> L294
        L1b7:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L294
            if (r2 == 0) goto L1e5
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L294
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L294
            java.lang.Object r3 = r2.first     // Catch: java.lang.Throwable -> L294
            r4 = r3
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4     // Catch: java.lang.Throwable -> L294
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzph r2 = (com.google.android.gms.measurement.internal.zzph) r2     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzaw r3 = r20.zzj()     // Catch: java.lang.Throwable -> L294
            java.lang.String r5 = r2.zzc()     // Catch: java.lang.Throwable -> L294
            java.util.Map r6 = r2.zzd()     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzmf r7 = r2.zza()     // Catch: java.lang.Throwable -> L294
            r8 = 0
            r2 = r3
            r3 = r25
            r2.zzd(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L294
            goto L1b7
        L1e4:
            r13 = r7
        L1e5:
            java.util.Iterator r2 = r11.iterator()     // Catch: java.lang.Throwable -> L294
        L1e9:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L294
            if (r0 == 0) goto L242
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L294
            r3 = r0
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzaw r4 = r20.zzj()     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            long r5 = r3.longValue()     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            r4.zzg()     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            r4.zzav()     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            android.database.sqlite.SQLiteDatabase r0 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            r8[r10] = r5     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            java.lang.String r5 = "queue"
            java.lang.String r6 = "rowid=?"
            int r0 = r0.delete(r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L224 java.lang.Throwable -> L294
            if (r0 != r7) goto L21c
            goto L1e9
        L21c:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch: android.database.sqlite.SQLiteException -> L224 java.lang.Throwable -> L294
            java.lang.String r5 = "Deleted fewer rows from queue than expected"
            r0.<init>(r5)     // Catch: android.database.sqlite.SQLiteException -> L224 java.lang.Throwable -> L294
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L224 java.lang.Throwable -> L294
        L224:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            java.lang.String r5 = "Failed to delete a bundle in a queue table"
            r4.zzb(r5, r0)     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L235 java.lang.Throwable -> L294
        L235:
            r0 = move-exception
            java.util.List r4 = r1.zzA     // Catch: java.lang.Throwable -> L294
            if (r4 == 0) goto L241
            boolean r3 = r4.contains(r3)     // Catch: java.lang.Throwable -> L294
            if (r3 == 0) goto L241
            goto L1e9
        L241:
            throw r0     // Catch: java.lang.Throwable -> L294
        L242:
            com.google.android.gms.measurement.internal.zzaw r0 = r20.zzj()     // Catch: java.lang.Throwable -> L294
            r0.zzS()     // Catch: java.lang.Throwable -> L294
            com.google.android.gms.measurement.internal.zzaw r0 = r20.zzj()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            r0.zzL()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            r1.zzA = r12     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzam r0 = r20.zzi()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaM     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            boolean r0 = r0.zzx(r12, r2)     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            if (r0 == 0) goto L276
            com.google.android.gms.measurement.internal.zzhk r0 = r20.zzp()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            boolean r0 = r0.zzd()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            if (r0 == 0) goto L276
            com.google.android.gms.measurement.internal.zzaw r0 = r20.zzj()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            boolean r0 = r0.zzY(r9)     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            if (r0 == 0) goto L276
            r1.zzav(r9)     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            goto L28f
        L276:
            com.google.android.gms.measurement.internal.zzhk r0 = r20.zzp()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            boolean r0 = r0.zzd()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            if (r0 == 0) goto L28a
            boolean r0 = r20.zzaN()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            if (r0 == 0) goto L28a
            r20.zzat()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            goto L28f
        L28a:
            r1.zzB = r13     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            r20.zzaL()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
        L28f:
            r2 = 0
            r1.zza = r2     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            goto L2c8
        L294:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzaw r2 = r20.zzj()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            r2.zzL()     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L29d java.lang.Throwable -> L2ce
        L29d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhe r2 = r20.zzaW()     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L2ce
            java.lang.String r3 = "Database error while trying to delete uploaded bundles"
            r2.zzb(r3, r0)     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.common.util.Clock r0 = r20.zzaU()     // Catch: java.lang.Throwable -> L2ce
            long r2 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L2ce
            r1.zza = r2     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhe r0 = r20.zzaW()     // Catch: java.lang.Throwable -> L2ce
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.lang.Throwable -> L2ce
            java.lang.String r2 = "Disable upload, time"
            long r3 = r1.zza     // Catch: java.lang.Throwable -> L2ce
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2ce
            r0.zzb(r2, r3)     // Catch: java.lang.Throwable -> L2ce
        L2c8:
            r1.zzv = r10
            r20.zzaH()
            return
        L2ce:
            r0 = move-exception
            r1.zzv = r10
            r20.zzaH()
            throw r0
    }

    final void zzZ(java.lang.String r5, int r6, java.lang.Throwable r7, byte[] r8, com.google.android.gms.measurement.internal.zzpz r9) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r4.zzaX()
            r0.zzg()
            r4.zzM()
            r0 = 0
            if (r8 != 0) goto L13
            byte[] r8 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r5 = move-exception
            goto La9
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 204(0xcc, float:2.86E-43)
            if (r6 == r1) goto L1d
            if (r6 != r2) goto L68
            r6 = 204(0xcc, float:2.86E-43)
        L1d:
            if (r7 != 0) goto L68
            com.google.android.gms.measurement.internal.zzaw r7 = r4.zzj()     // Catch: java.lang.Throwable -> L10
            long r8 = r9.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L10
            r7.zzK(r8)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzhe r7 = r4.zzaW()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzj()     // Catch: java.lang.Throwable -> L10
            java.lang.String r8 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L10
            r7.zzc(r8, r5, r6)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzam r6 = r4.zzi()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgg r7 = com.google.android.gms.measurement.internal.zzgi.zzaM     // Catch: java.lang.Throwable -> L10
            r8 = 0
            boolean r6 = r6.zzx(r8, r7)     // Catch: java.lang.Throwable -> L10
            if (r6 == 0) goto L64
            com.google.android.gms.measurement.internal.zzhk r6 = r4.zzp()     // Catch: java.lang.Throwable -> L10
            boolean r6 = r6.zzd()     // Catch: java.lang.Throwable -> L10
            if (r6 == 0) goto L64
            com.google.android.gms.measurement.internal.zzaw r6 = r4.zzj()     // Catch: java.lang.Throwable -> L10
            boolean r6 = r6.zzY(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 == 0) goto L64
            r4.zzav(r5)     // Catch: java.lang.Throwable -> L10
            goto La3
        L64:
            r4.zzaL()     // Catch: java.lang.Throwable -> L10
            goto La3
        L68:
            r1 = 32
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L10
            int r8 = r2.length()     // Catch: java.lang.Throwable -> L10
            int r8 = java.lang.Math.min(r1, r8)     // Catch: java.lang.Throwable -> L10
            java.lang.String r8 = r2.substring(r0, r8)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzhe r1 = r4.zzaW()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzl()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L10
            if (r7 != 0) goto L8e
            r7 = r8
        L8e:
            r1.zzd(r2, r5, r6, r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzaw r5 = r4.zzj()     // Catch: java.lang.Throwable -> L10
            long r6 = r9.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L10
            r5.zzN(r6)     // Catch: java.lang.Throwable -> L10
            r4.zzaL()     // Catch: java.lang.Throwable -> L10
        La3:
            r4.zzv = r0
            r4.zzaH()
            return
        La9:
            r4.zzv = r0
            r4.zzaH()
            throw r5
    }

    final long zza() {
            r9 = this;
            com.google.android.gms.common.util.Clock r0 = r9.zzaU()
            long r0 = r0.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzoa r2 = r9.zzk
            r2.zzav()
            r2.zzg()
            com.google.android.gms.measurement.internal.zzhp r3 = r2.zzf
            long r4 = r3.zza()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L34
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            java.security.SecureRandom r2 = r2.zzJ()
            r4 = 86400000(0x5265c00, float:7.82218E-36)
            int r2 = r2.nextInt(r4)
            long r4 = (long) r2
            r6 = 1
            long r4 = r4 + r6
            r3.zzb(r4)
        L34:
            long r0 = r0 + r4
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 60
            long r0 = r0 / r2
            long r0 = r0 / r2
            r2 = 24
            long r0 = r0 / r2
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final android.content.Context zzaT() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn
            android.content.Context r0 = r0.zzaT()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final com.google.android.gms.common.util.Clock zzaU() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzio r0 = (com.google.android.gms.measurement.internal.zzio) r0
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final com.google.android.gms.measurement.internal.zzaf zzaV() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzaV()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final com.google.android.gms.measurement.internal.zzhe zzaW() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzio r0 = (com.google.android.gms.measurement.internal.zzio) r0
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final com.google.android.gms.measurement.internal.zzil zzaX() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzio r0 = (com.google.android.gms.measurement.internal.zzio) r0
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            return r0
    }

    final void zzaa(com.google.android.gms.measurement.internal.zzh r12, com.google.android.gms.internal.measurement.zzhw r13) {
            r11 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r11.zzaX()
            r0.zzg()
            r11.zzM()
            com.google.android.gms.internal.measurement.zzhb r0 = com.google.android.gms.internal.measurement.zzhc.zzc()
            byte[] r1 = r12.zzaN()
            if (r1 == 0) goto L31
            com.google.android.gms.internal.measurement.zzng r1 = com.google.android.gms.measurement.internal.zzqa.zzp(r0, r1)     // Catch: com.google.android.gms.internal.measurement.zzmm -> L1c
            com.google.android.gms.internal.measurement.zzhb r1 = (com.google.android.gms.internal.measurement.zzhb) r1     // Catch: com.google.android.gms.internal.measurement.zzmm -> L1c
            r0 = r1
            goto L31
        L1c:
            com.google.android.gms.measurement.internal.zzhe r1 = r11.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r2 = r12.zzC()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r2)
            java.lang.String r3 = "Failed to parse locally stored ad campaign info. appId"
            r1.zzb(r3, r2)
        L31:
            java.util.List r1 = r13.zzaM()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L107
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.zzhm r2 = (com.google.android.gms.internal.measurement.zzhm) r2
            java.lang.String r3 = r2.zzh()
            java.lang.String r4 = "_cmp"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L39
            java.lang.String r3 = "gclid"
            java.lang.String r4 = ""
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzqa.zzI(r2, r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "gbraid"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzqa.zzI(r2, r5, r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "gad_source"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzqa.zzI(r2, r6, r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L77
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L39
        L77:
            r6 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.String r9 = "click_timestamp"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzqa.zzI(r2, r9, r8)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 > 0) goto L91
            long r8 = r2.zzd()
        L91:
            java.lang.String r6 = "_cis"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzqa.zzH(r2, r6)
            java.lang.String r6 = "referrer API v2"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto Ld3
            long r6 = r0.zzb()
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L39
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto Lb1
            r0.zzh()
            goto Lb4
        Lb1:
            r0.zzp(r3)
        Lb4:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto Lbe
            r0.zzg()
            goto Lc1
        Lbe:
            r0.zzo(r5)
        Lc1:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto Lcb
            r0.zzf()
            goto Lce
        Lcb:
            r0.zzn(r4)
        Lce:
            r0.zzm(r8)
            goto L39
        Ld3:
            long r6 = r0.zza()
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L39
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto Le5
            r0.zze()
            goto Le8
        Le5:
            r0.zzk(r3)
        Le8:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto Lf2
            r0.zzd()
            goto Lf5
        Lf2:
            r0.zzj(r5)
        Lf5:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto Lff
            r0.zzc()
            goto L102
        Lff:
            r0.zzi(r4)
        L102:
            r0.zzl(r8)
            goto L39
        L107:
            com.google.android.gms.internal.measurement.zzmd r1 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhc r1 = (com.google.android.gms.internal.measurement.zzhc) r1
            com.google.android.gms.internal.measurement.zzhc r2 = com.google.android.gms.internal.measurement.zzhc.zze()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L120
            com.google.android.gms.internal.measurement.zzmd r1 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhc r1 = (com.google.android.gms.internal.measurement.zzhc) r1
            r13.zzF(r1)
        L120:
            com.google.android.gms.internal.measurement.zzmd r13 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhc r13 = (com.google.android.gms.internal.measurement.zzhc) r13
            byte[] r13 = r13.zzcd()
            r12.zzR(r13)
            boolean r13 = r12.zzaK()
            if (r13 == 0) goto L13b
            com.google.android.gms.measurement.internal.zzaw r13 = r11.zzj()
            r0 = 0
            r13.zzT(r12, r0, r0)
        L13b:
            return
    }

    final void zzab(com.google.android.gms.measurement.internal.zzr r9) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r8.zzaX()
            r0.zzg()
            r8.zzM()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            java.lang.String r0 = r9.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzam r1 = r8.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzay
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            r2 = 0
            if (r1 == 0) goto L45
            com.google.android.gms.common.util.Clock r1 = r8.zzaU()
            long r4 = r1.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzam r1 = r8.zzi()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzah
            int r1 = r1.zzh(r3, r6)
            r8.zzi()
            long r6 = com.google.android.gms.measurement.internal.zzam.zzF()
            long r4 = r4 - r6
        L3a:
            if (r2 >= r1) goto L5c
            boolean r6 = r8.zzaM(r3, r4)
            if (r6 == 0) goto L5c
            int r2 = r2 + 1
            goto L3a
        L45:
            r8.zzi()
            long r4 = com.google.android.gms.measurement.internal.zzam.zzH()
        L4c:
            long r6 = (long) r2
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L5c
            r6 = 0
            boolean r1 = r8.zzaM(r0, r6)
            if (r1 == 0) goto L5c
            int r2 = r2 + 1
            goto L4c
        L5c:
            com.google.android.gms.measurement.internal.zzam r1 = r8.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaz
            boolean r1 = r1.zzx(r3, r2)
            if (r1 == 0) goto L72
            com.google.android.gms.measurement.internal.zzil r1 = r8.zzaX()
            r1.zzg()
            r8.zzaJ()
        L72:
            com.google.android.gms.measurement.internal.zzam r1 = r8.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaQ
            boolean r1 = r1.zzx(r3, r2)
            if (r1 == 0) goto La4
            com.google.android.gms.measurement.internal.zzpi r1 = r8.zzl
            int r9 = r9.zzG
            com.google.android.gms.internal.measurement.zzih r9 = com.google.android.gms.internal.measurement.zzih.zzb(r9)
            boolean r9 = r1.zzd(r0, r9)
            if (r9 == 0) goto La4
            com.google.android.gms.measurement.internal.zzhe r9 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzj()
            java.lang.String r1 = "[sgtm] Going background, trigger client side upload. appId"
            r9.zzb(r1, r0)
            com.google.android.gms.common.util.Clock r9 = r8.zzaU()
            long r1 = r9.currentTimeMillis()
            r8.zzau(r0, r1)
        La4:
            return
    }

    final void zzac(com.google.android.gms.measurement.internal.zzr r26) {
            r25 = this;
            r1 = r25
            r2 = r26
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r0 = "com.android.vending"
            java.lang.String r6 = "_npa"
            java.lang.String r7 = "_uwa"
            com.google.android.gms.measurement.internal.zzil r8 = r25.zzaX()
            r8.zzg()
            r25.zzM()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r26)
            java.lang.String r8 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            boolean r9 = zzaQ(r26)
            if (r9 != 0) goto L29
            return
        L29:
            com.google.android.gms.measurement.internal.zzaw r9 = r25.zzj()
            com.google.android.gms.measurement.internal.zzh r9 = r9.zzl(r8)
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L59
            java.lang.String r13 = r9.zzH()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L59
            java.lang.String r13 = r2.zzb
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L59
            r9.zzab(r11)
            com.google.android.gms.measurement.internal.zzaw r13 = r25.zzj()
            r13.zzT(r9, r10, r10)
            com.google.android.gms.measurement.internal.zzif r9 = r25.zzr()
            r9.zzr(r8)
        L59:
            boolean r9 = r2.zzh
            if (r9 != 0) goto L61
            r25.zzg(r26)
            return
        L61:
            long r13 = r2.zzl
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 != 0) goto L6f
            com.google.android.gms.common.util.Clock r9 = r25.zzaU()
            long r13 = r9.currentTimeMillis()
        L6f:
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzn
            com.google.android.gms.measurement.internal.zzbb r9 = r9.zzg()
            r9.zzg()
            int r9 = r2.zzm
            r15 = 1
            if (r9 == 0) goto L95
            if (r9 == r15) goto L95
            com.google.android.gms.measurement.internal.zzhe r16 = r25.zzaW()
            com.google.android.gms.measurement.internal.zzhc r11 = r16.zzk()
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r11.zzc(r10, r12, r9)
            r9 = 0
        L95:
            com.google.android.gms.measurement.internal.zzaw r10 = r25.zzj()
            r10.zzH()
            com.google.android.gms.measurement.internal.zzaw r10 = r25.zzj()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzqd r10 = r10.zzy(r8, r6)     // Catch: java.lang.Throwable -> L40f
            java.lang.Boolean r11 = zzaS(r26)     // Catch: java.lang.Throwable -> L40f
            r12 = r3
            r21 = r4
            if (r10 == 0) goto Lba
            java.lang.String r3 = "auto"
            java.lang.String r4 = r10.zzb     // Catch: java.lang.Throwable -> L40f
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L40f
            if (r3 == 0) goto Lb8
            goto Lba
        Lb8:
            r4 = 1
            goto Lee
        Lba:
            if (r11 == 0) goto Le8
            com.google.android.gms.measurement.internal.zzqb r3 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.lang.Throwable -> L40f
            java.lang.String r16 = "_npa"
            boolean r4 = r11.booleanValue()     // Catch: java.lang.Throwable -> L40f
            if (r15 == r4) goto Lc9
            r17 = 0
            goto Lcb
        Lc9:
            r17 = 1
        Lcb:
            java.lang.Long r19 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Throwable -> L40f
            java.lang.String r20 = "auto"
            r4 = 1
            r15 = r3
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch: java.lang.Throwable -> L40f
            if (r10 == 0) goto Le4
            java.lang.Object r6 = r10.zze     // Catch: java.lang.Throwable -> L40f
            java.lang.Long r10 = r3.zzd     // Catch: java.lang.Throwable -> L40f
            boolean r6 = r6.equals(r10)     // Catch: java.lang.Throwable -> L40f
            if (r6 != 0) goto Lee
        Le4:
            r1.zzas(r3, r2)     // Catch: java.lang.Throwable -> L40f
            goto Lee
        Le8:
            r4 = 1
            if (r10 == 0) goto Lee
            r1.zzag(r6, r2)     // Catch: java.lang.Throwable -> L40f
        Lee:
            com.google.android.gms.measurement.internal.zzam r3 = r25.zzi()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzbl     // Catch: java.lang.Throwable -> L40f
            r10 = 0
            boolean r3 = r3.zzx(r10, r6)     // Catch: java.lang.Throwable -> L40f
            if (r3 == 0) goto L101
            long r10 = r2.zzF     // Catch: java.lang.Throwable -> L40f
            r1.zzP(r2, r10)     // Catch: java.lang.Throwable -> L40f
            goto L104
        L101:
            r1.zzP(r2, r13)     // Catch: java.lang.Throwable -> L40f
        L104:
            r25.zzg(r26)     // Catch: java.lang.Throwable -> L40f
            if (r9 != 0) goto L115
            com.google.android.gms.measurement.internal.zzaw r6 = r25.zzj()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r9 = "_f"
            com.google.android.gms.measurement.internal.zzbd r6 = r6.zzs(r8, r9)     // Catch: java.lang.Throwable -> L40f
            r15 = 0
            goto L120
        L115:
            com.google.android.gms.measurement.internal.zzaw r6 = r25.zzj()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r9 = "_v"
            com.google.android.gms.measurement.internal.zzbd r6 = r6.zzs(r8, r9)     // Catch: java.lang.Throwable -> L40f
            r15 = 1
        L120:
            if (r6 != 0) goto L3df
            r9 = 3600000(0x36ee80, double:1.7786363E-317)
            long r16 = r13 / r9
            r18 = 1
            long r16 = r16 + r18
            long r16 = r16 * r9
            java.lang.String r6 = "_dac"
            java.lang.String r9 = "_et"
            java.lang.String r10 = "_r"
            java.lang.String r11 = "_c"
            if (r15 != 0) goto L390
            com.google.android.gms.measurement.internal.zzqb r15 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.lang.Throwable -> L40f
            java.lang.String r18 = "_fot"
            java.lang.Long r19 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> L40f
            java.lang.String r20 = "auto"
            r22 = r15
            r15 = r22
            r16 = r18
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch: java.lang.Throwable -> L40f
            r1.zzas(r15, r2)     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzil r15 = r25.zzaX()     // Catch: java.lang.Throwable -> L40f
            r15.zzg()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhw r15 = r1.zzm     // Catch: java.lang.Throwable -> L40f
            java.lang.Object r15 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhw r15 = (com.google.android.gms.measurement.internal.zzhw) r15     // Catch: java.lang.Throwable -> L40f
            if (r8 == 0) goto L241
            boolean r16 = r8.isEmpty()     // Catch: java.lang.Throwable -> L40f
            if (r16 == 0) goto L168
            goto L241
        L168:
            com.google.android.gms.measurement.internal.zzio r3 = r15.zza     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzil r16 = r3.zzaX()     // Catch: java.lang.Throwable -> L40f
            r16.zzg()     // Catch: java.lang.Throwable -> L40f
            boolean r16 = r15.zza()     // Catch: java.lang.Throwable -> L40f
            if (r16 != 0) goto L188
            com.google.android.gms.measurement.internal.zzhe r0 = r3.zzaW()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzi()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r3 = "Install Referrer Reporter is not available"
            r0.zza(r3)     // Catch: java.lang.Throwable -> L40f
            r23 = r13
            goto L252
        L188:
            com.google.android.gms.measurement.internal.zzhv r4 = new com.google.android.gms.measurement.internal.zzhv     // Catch: java.lang.Throwable -> L40f
            r4.<init>(r15, r8)     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzil r8 = r3.zzaX()     // Catch: java.lang.Throwable -> L40f
            r8.zzg()     // Catch: java.lang.Throwable -> L40f
            android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Throwable -> L40f
            r23 = r13
            java.lang.String r13 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r8.<init>(r13)     // Catch: java.lang.Throwable -> L40f
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L40f
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r13.<init>(r0, r14)     // Catch: java.lang.Throwable -> L40f
            r8.setComponent(r13)     // Catch: java.lang.Throwable -> L40f
            android.content.Context r13 = r3.zzaT()     // Catch: java.lang.Throwable -> L40f
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch: java.lang.Throwable -> L40f
            if (r13 != 0) goto L1c0
            com.google.android.gms.measurement.internal.zzhe r0 = r3.zzaW()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzm()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r3 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.zza(r3)     // Catch: java.lang.Throwable -> L40f
            goto L252
        L1c0:
            r14 = 0
            java.util.List r13 = r13.queryIntentServices(r8, r14)     // Catch: java.lang.Throwable -> L40f
            if (r13 == 0) goto L233
            boolean r16 = r13.isEmpty()     // Catch: java.lang.Throwable -> L40f
            if (r16 != 0) goto L233
            java.lang.Object r13 = r13.get(r14)     // Catch: java.lang.Throwable -> L40f
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch: java.lang.Throwable -> L40f
            android.content.pm.ServiceInfo r13 = r13.serviceInfo     // Catch: java.lang.Throwable -> L40f
            if (r13 == 0) goto L252
            java.lang.String r14 = r13.packageName     // Catch: java.lang.Throwable -> L40f
            java.lang.String r13 = r13.name     // Catch: java.lang.Throwable -> L40f
            if (r13 == 0) goto L225
            boolean r0 = r0.equals(r14)     // Catch: java.lang.Throwable -> L40f
            if (r0 == 0) goto L225
            boolean r0 = r15.zza()     // Catch: java.lang.Throwable -> L40f
            if (r0 == 0) goto L225
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L40f
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.common.stats.ConnectionTracker r8 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch: java.lang.RuntimeException -> L210 java.lang.Throwable -> L40f
            android.content.Context r13 = r3.zzaT()     // Catch: java.lang.RuntimeException -> L210 java.lang.Throwable -> L40f
            r14 = 1
            boolean r0 = r8.bindService(r13, r0, r4, r14)     // Catch: java.lang.RuntimeException -> L210 java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.RuntimeException -> L210 java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()     // Catch: java.lang.RuntimeException -> L210 java.lang.Throwable -> L40f
            java.lang.String r4 = "Install Referrer Service is"
            if (r0 == 0) goto L20a
            java.lang.String r0 = "available"
            goto L20c
        L20a:
            java.lang.String r0 = "not available"
        L20c:
            r3.zzb(r4, r0)     // Catch: java.lang.RuntimeException -> L210 java.lang.Throwable -> L40f
            goto L252
        L210:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r15.zza     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r4 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L40f
            r3.zzb(r4, r0)     // Catch: java.lang.Throwable -> L40f
            goto L252
        L225:
            com.google.android.gms.measurement.internal.zzhe r0 = r3.zzaW()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r3 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.zza(r3)     // Catch: java.lang.Throwable -> L40f
            goto L252
        L233:
            com.google.android.gms.measurement.internal.zzhe r0 = r3.zzaW()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzi()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r3 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.zza(r3)     // Catch: java.lang.Throwable -> L40f
            goto L252
        L241:
            r23 = r13
            com.google.android.gms.measurement.internal.zzio r0 = r15.zza     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzm()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r3 = "Install Referrer Reporter was called with invalid app package name"
            r0.zza(r3)     // Catch: java.lang.Throwable -> L40f
        L252:
            com.google.android.gms.measurement.internal.zzil r0 = r25.zzaX()     // Catch: java.lang.Throwable -> L40f
            r0.zzg()     // Catch: java.lang.Throwable -> L40f
            r25.zzM()     // Catch: java.lang.Throwable -> L40f
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L40f
            r3.<init>()     // Catch: java.lang.Throwable -> L40f
            r13 = 1
            r3.putLong(r11, r13)     // Catch: java.lang.Throwable -> L40f
            r3.putLong(r10, r13)     // Catch: java.lang.Throwable -> L40f
            r10 = 0
            r3.putLong(r7, r10)     // Catch: java.lang.Throwable -> L40f
            r3.putLong(r5, r10)     // Catch: java.lang.Throwable -> L40f
            r4 = r21
            r3.putLong(r4, r10)     // Catch: java.lang.Throwable -> L40f
            r3.putLong(r12, r10)     // Catch: java.lang.Throwable -> L40f
            r10 = 1
            r3.putLong(r9, r10)     // Catch: java.lang.Throwable -> L40f
            boolean r0 = r2.zzo     // Catch: java.lang.Throwable -> L40f
            if (r0 == 0) goto L285
            r3.putLong(r6, r10)     // Catch: java.lang.Throwable -> L40f
        L285:
            java.lang.String r0 = r2.zza     // Catch: java.lang.Throwable -> L40f
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L40f
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzaw r0 = r25.zzj()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch: java.lang.Throwable -> L40f
            r0.zzg()     // Catch: java.lang.Throwable -> L40f
            r0.zzav()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r8 = "first_open_count"
            long r10 = r0.zze(r6, r8)     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn     // Catch: java.lang.Throwable -> L40f
            android.content.Context r8 = r0.zzaT()     // Catch: java.lang.Throwable -> L40f
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L40f
            if (r8 != 0) goto L2c2
            com.google.android.gms.measurement.internal.zzhe r0 = r25.zzaW()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: java.lang.Throwable -> L40f
            r0.zzb(r4, r6)     // Catch: java.lang.Throwable -> L40f
        L2be:
            r6 = 0
            goto L371
        L2c2:
            android.content.Context r0 = r0.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d0 java.lang.Throwable -> L40f
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d0 java.lang.Throwable -> L40f
            r8 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d0 java.lang.Throwable -> L40f
            goto L2e3
        L2d0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhe r8 = r25.zzaW()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r9 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: java.lang.Throwable -> L40f
            r8.zzc(r9, r13, r0)     // Catch: java.lang.Throwable -> L40f
            r0 = 0
        L2e3:
            if (r0 == 0) goto L333
            long r8 = r0.firstInstallTime     // Catch: java.lang.Throwable -> L40f
            r13 = 0
            int r15 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r15 == 0) goto L333
            long r13 = r0.lastUpdateTime     // Catch: java.lang.Throwable -> L40f
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 == 0) goto L315
            com.google.android.gms.measurement.internal.zzam r0 = r25.zzi()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzgg r8 = com.google.android.gms.measurement.internal.zzgi.zzaH     // Catch: java.lang.Throwable -> L40f
            r9 = 0
            boolean r0 = r0.zzx(r9, r8)     // Catch: java.lang.Throwable -> L40f
            if (r0 == 0) goto L30f
            r13 = 0
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 != 0) goto L30d
            r13 = 1
            r3.putLong(r7, r13)     // Catch: java.lang.Throwable -> L40f
            r10 = 0
        L30d:
            r15 = 0
            goto L317
        L30f:
            r13 = 1
            r3.putLong(r7, r13)     // Catch: java.lang.Throwable -> L40f
            goto L30d
        L315:
            r9 = 0
            r15 = 1
        L317:
            com.google.android.gms.measurement.internal.zzqb r0 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.lang.Throwable -> L40f
            java.lang.String r16 = "_fi"
            r7 = 1
            if (r7 == r15) goto L321
            r7 = 0
            goto L323
        L321:
            r7 = 1
        L323:
            java.lang.Long r19 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L40f
            java.lang.String r20 = "auto"
            r15 = r0
            r17 = r23
            r15.<init>(r16, r17, r19, r20)     // Catch: java.lang.Throwable -> L40f
            r1.zzas(r0, r2)     // Catch: java.lang.Throwable -> L40f
            goto L334
        L333:
            r9 = 0
        L334:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L344 java.lang.Throwable -> L40f
            android.content.Context r0 = r0.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L344 java.lang.Throwable -> L40f
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L344 java.lang.Throwable -> L40f
            r7 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L344 java.lang.Throwable -> L40f
            goto L357
        L344:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhe r7 = r25.zzaW()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zze()     // Catch: java.lang.Throwable -> L40f
            java.lang.String r8 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: java.lang.Throwable -> L40f
            r7.zzc(r8, r6, r0)     // Catch: java.lang.Throwable -> L40f
            r0 = r9
        L357:
            if (r0 == 0) goto L2be
            int r6 = r0.flags     // Catch: java.lang.Throwable -> L40f
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L364
            r6 = 1
            r3.putLong(r4, r6)     // Catch: java.lang.Throwable -> L40f
        L364:
            int r0 = r0.flags     // Catch: java.lang.Throwable -> L40f
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L2be
            r6 = 1
            r3.putLong(r12, r6)     // Catch: java.lang.Throwable -> L40f
            goto L2be
        L371:
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 < 0) goto L378
            r3.putLong(r5, r10)     // Catch: java.lang.Throwable -> L40f
        L378:
            com.google.android.gms.measurement.internal.zzbh r0 = new com.google.android.gms.measurement.internal.zzbh     // Catch: java.lang.Throwable -> L40f
            java.lang.String r16 = "_f"
            com.google.android.gms.measurement.internal.zzbf r4 = new com.google.android.gms.measurement.internal.zzbf     // Catch: java.lang.Throwable -> L40f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L40f
            java.lang.String r18 = "auto"
            r15 = r0
            r17 = r4
            r19 = r23
            r15.<init>(r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L40f
            r1.zzU(r0, r2)     // Catch: java.lang.Throwable -> L40f
            goto L400
        L390:
            r23 = r13
            com.google.android.gms.measurement.internal.zzqb r0 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.lang.Throwable -> L40f
            java.lang.String r3 = "_fvt"
            java.lang.Long r19 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> L40f
            java.lang.String r20 = "auto"
            r15 = r0
            r16 = r3
            r17 = r23
            r15.<init>(r16, r17, r19, r20)     // Catch: java.lang.Throwable -> L40f
            r1.zzas(r0, r2)     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzil r0 = r25.zzaX()     // Catch: java.lang.Throwable -> L40f
            r0.zzg()     // Catch: java.lang.Throwable -> L40f
            r25.zzM()     // Catch: java.lang.Throwable -> L40f
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L40f
            r0.<init>()     // Catch: java.lang.Throwable -> L40f
            r3 = 1
            r0.putLong(r11, r3)     // Catch: java.lang.Throwable -> L40f
            r0.putLong(r10, r3)     // Catch: java.lang.Throwable -> L40f
            r0.putLong(r9, r3)     // Catch: java.lang.Throwable -> L40f
            boolean r5 = r2.zzo     // Catch: java.lang.Throwable -> L40f
            if (r5 == 0) goto L3c8
            r0.putLong(r6, r3)     // Catch: java.lang.Throwable -> L40f
        L3c8:
            com.google.android.gms.measurement.internal.zzbh r3 = new com.google.android.gms.measurement.internal.zzbh     // Catch: java.lang.Throwable -> L40f
            java.lang.String r16 = "_v"
            com.google.android.gms.measurement.internal.zzbf r4 = new com.google.android.gms.measurement.internal.zzbf     // Catch: java.lang.Throwable -> L40f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L40f
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r23
            r15.<init>(r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L40f
            r1.zzU(r3, r2)     // Catch: java.lang.Throwable -> L40f
            goto L400
        L3df:
            r23 = r13
            boolean r0 = r2.zzi     // Catch: java.lang.Throwable -> L40f
            if (r0 == 0) goto L400
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L40f
            r0.<init>()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzbh r3 = new com.google.android.gms.measurement.internal.zzbh     // Catch: java.lang.Throwable -> L40f
            java.lang.String r16 = "_cd"
            com.google.android.gms.measurement.internal.zzbf r4 = new com.google.android.gms.measurement.internal.zzbf     // Catch: java.lang.Throwable -> L40f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L40f
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r23
            r15.<init>(r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L40f
            r1.zzU(r3, r2)     // Catch: java.lang.Throwable -> L40f
        L400:
            com.google.android.gms.measurement.internal.zzaw r0 = r25.zzj()     // Catch: java.lang.Throwable -> L40f
            r0.zzS()     // Catch: java.lang.Throwable -> L40f
            com.google.android.gms.measurement.internal.zzaw r0 = r25.zzj()
            r0.zzL()
            return
        L40f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzaw r2 = r25.zzj()
            r2.zzL()
            throw r0
    }

    final void zzad() {
            r1 = this;
            int r0 = r1.zzs
            int r0 = r0 + 1
            r1.zzs = r0
            return
    }

    final void zzae(com.google.android.gms.measurement.internal.zzai r2) {
            r1 = this;
            java.lang.String r0 = r2.zza
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.measurement.internal.zzr r0 = r1.zzaD(r0)
            if (r0 == 0) goto L11
            r1.zzaf(r2, r0)
        L11:
            return
    }

    final void zzaf(com.google.android.gms.measurement.internal.zzai r11, com.google.android.gms.measurement.internal.zzr r12) {
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            java.lang.String r0 = r11.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzqb r0 = r11.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzqb r0 = r11.zzc
            java.lang.String r0 = r0.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzil r0 = r10.zzaX()
            r0.zzg()
            r10.zzM()
            boolean r0 = zzaQ(r12)
            if (r0 != 0) goto L25
            return
        L25:
            boolean r0 = r12.zzh
            if (r0 != 0) goto L2d
            r10.zzg(r12)
            return
        L2d:
            com.google.android.gms.measurement.internal.zzaw r0 = r10.zzj()
            r0.zzH()
            r10.zzg(r12)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r0 = r11.zza     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> Le4
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzaw r0 = r10.zzj()     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzqb r1 = r11.zzc     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = r1.zzb     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzai r0 = r0.zzm(r2, r1)     // Catch: java.lang.Throwable -> Le4
            if (r0 == 0) goto Lb4
            com.google.android.gms.measurement.internal.zzhe r1 = r10.zzaW()     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = "Removing conditional user property"
            java.lang.String r4 = r11.zza     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzio r5 = r10.zzn     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzgx r5 = r5.zzj()     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzqb r6 = r11.zzc     // Catch: java.lang.Throwable -> Le4
            java.lang.String r6 = r6.zzb     // Catch: java.lang.Throwable -> Le4
            java.lang.String r5 = r5.zzf(r6)     // Catch: java.lang.Throwable -> Le4
            r1.zzc(r3, r4, r5)     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzaw r1 = r10.zzj()     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzqb r3 = r11.zzc     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> Le4
            r1.zza(r2, r3)     // Catch: java.lang.Throwable -> Le4
            boolean r1 = r0.zze     // Catch: java.lang.Throwable -> Le4
            if (r1 == 0) goto L85
            com.google.android.gms.measurement.internal.zzaw r1 = r10.zzj()     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzqb r3 = r11.zzc     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> Le4
            r1.zzP(r2, r3)     // Catch: java.lang.Throwable -> Le4
        L85:
            com.google.android.gms.measurement.internal.zzbh r11 = r11.zzk     // Catch: java.lang.Throwable -> Le4
            if (r11 == 0) goto Ld5
            com.google.android.gms.measurement.internal.zzbf r1 = r11.zzb     // Catch: java.lang.Throwable -> Le4
            if (r1 == 0) goto L92
            android.os.Bundle r1 = r1.zzc()     // Catch: java.lang.Throwable -> Le4
            goto L93
        L92:
            r1 = 0
        L93:
            r4 = r1
            com.google.android.gms.measurement.internal.zzqf r1 = r10.zzB()     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzbh r3 = (com.google.android.gms.measurement.internal.zzbh) r3     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = r3.zza     // Catch: java.lang.Throwable -> Le4
            java.lang.String r5 = r0.zzb     // Catch: java.lang.Throwable -> Le4
            long r6 = r11.zzd     // Catch: java.lang.Throwable -> Le4
            r8 = 1
            r9 = 1
            com.google.android.gms.measurement.internal.zzbh r11 = r1.zzC(r2, r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r11 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzbh r11 = (com.google.android.gms.measurement.internal.zzbh) r11     // Catch: java.lang.Throwable -> Le4
            r10.zzax(r11, r12)     // Catch: java.lang.Throwable -> Le4
            goto Ld5
        Lb4:
            com.google.android.gms.measurement.internal.zzhe r12 = r10.zzaW()     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzhc r12 = r12.zzk()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r0 = "Conditional user property doesn't exist"
            java.lang.String r1 = r11.zza     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzio r2 = r10.zzn     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzqb r11 = r11.zzc     // Catch: java.lang.Throwable -> Le4
            java.lang.String r11 = r11.zzb     // Catch: java.lang.Throwable -> Le4
            java.lang.String r11 = r2.zzf(r11)     // Catch: java.lang.Throwable -> Le4
            r12.zzc(r0, r1, r11)     // Catch: java.lang.Throwable -> Le4
        Ld5:
            com.google.android.gms.measurement.internal.zzaw r11 = r10.zzj()     // Catch: java.lang.Throwable -> Le4
            r11.zzS()     // Catch: java.lang.Throwable -> Le4
            com.google.android.gms.measurement.internal.zzaw r11 = r10.zzj()
            r11.zzL()
            return
        Le4:
            r11 = move-exception
            com.google.android.gms.measurement.internal.zzaw r12 = r10.zzj()
            r12.zzL()
            throw r11
    }

    final void zzag(java.lang.String r9, com.google.android.gms.measurement.internal.zzr r10) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r8.zzaX()
            r0.zzg()
            r8.zzM()
            boolean r0 = zzaQ(r10)
            if (r0 != 0) goto L11
            return
        L11:
            boolean r0 = r10.zzh
            if (r0 != 0) goto L19
            r8.zzg(r10)
            return
        L19:
            java.lang.Boolean r0 = zzaS(r10)
            java.lang.String r1 = "_npa"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L5a
            if (r0 == 0) goto L5a
            com.google.android.gms.measurement.internal.zzhe r9 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzd()
            java.lang.String r1 = "Falling back to manifest metadata value for ad personalization"
            r9.zza(r1)
            com.google.android.gms.measurement.internal.zzqb r9 = new com.google.android.gms.measurement.internal.zzqb
            com.google.android.gms.common.util.Clock r1 = r8.zzaU()
            long r4 = r1.currentTimeMillis()
            r1 = 1
            boolean r0 = r0.booleanValue()
            if (r1 == r0) goto L48
            r0 = 0
            goto L4a
        L48:
            r0 = 1
        L4a:
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = "_npa"
            java.lang.String r7 = "auto"
            r2 = r9
            r2.<init>(r3, r4, r6, r7)
            r8.zzas(r9, r10)
            return
        L5a:
            com.google.android.gms.measurement.internal.zzhe r0 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            com.google.android.gms.measurement.internal.zzio r1 = r8.zzn
            com.google.android.gms.measurement.internal.zzgx r2 = r1.zzj()
            java.lang.String r2 = r2.zzf(r9)
            java.lang.String r3 = "Removing user property"
            r0.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzaw r0 = r8.zzj()
            r0.zzH()
            r8.zzg(r10)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "_id"
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L94
            com.google.android.gms.measurement.internal.zzaw r0 = r8.zzj()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = r10.zza     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r3 = "_lair"
            r0.zzP(r2, r3)     // Catch: java.lang.Throwable -> Lc7
        L94:
            com.google.android.gms.measurement.internal.zzaw r0 = r8.zzj()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r10 = r10.zza     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lc7
            r0.zzP(r10, r9)     // Catch: java.lang.Throwable -> Lc7
            com.google.android.gms.measurement.internal.zzaw r10 = r8.zzj()     // Catch: java.lang.Throwable -> Lc7
            r10.zzS()     // Catch: java.lang.Throwable -> Lc7
            com.google.android.gms.measurement.internal.zzhe r10 = r8.zzaW()     // Catch: java.lang.Throwable -> Lc7
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzd()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "User property removed"
            com.google.android.gms.measurement.internal.zzgx r1 = r1.zzj()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r9 = r1.zzf(r9)     // Catch: java.lang.Throwable -> Lc7
            r10.zzb(r0, r9)     // Catch: java.lang.Throwable -> Lc7
            com.google.android.gms.measurement.internal.zzaw r9 = r8.zzj()
            r9.zzL()
            return
        Lc7:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzaw r10 = r8.zzj()
            r10.zzL()
            throw r9
    }

    final void zzah(com.google.android.gms.measurement.internal.zzr r8) {
            r7 = this;
            java.lang.String r0 = "app_id=?"
            java.util.List r1 = r7.zzz
            if (r1 == 0) goto L12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.zzA = r1
            java.util.List r2 = r7.zzz
            r1.addAll(r2)
        L12:
            com.google.android.gms.measurement.internal.zzaw r1 = r7.zzj()
            java.lang.String r2 = r8.zza
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r1.zzg()
            r1.zzav()
            android.database.sqlite.SQLiteDatabase r3 = r1.zzj()     // Catch: android.database.sqlite.SQLiteException -> La1
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: android.database.sqlite.SQLiteException -> La1
            r5 = 0
            r4[r5] = r2     // Catch: android.database.sqlite.SQLiteException -> La1
            java.lang.String r5 = "apps"
            int r5 = r3.delete(r5, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            java.lang.String r6 = "events"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "events_snapshot"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "user_attributes"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "conditional_properties"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "raw_events"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "raw_events_metadata"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "queue"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "audience_filter_values"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "main_event_params"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "default_event_params"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "trigger_uris"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r6
            java.lang.String r6 = "upload_queue"
            int r0 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            int r5 = r5 + r0
            if (r5 <= 0) goto Lb5
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: android.database.sqlite.SQLiteException -> La1
            java.lang.String r3 = "Reset analytics data. app, records"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> La1
            r0.zzc(r3, r2, r4)     // Catch: android.database.sqlite.SQLiteException -> La1
            goto Lb5
        La1:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r2)
            java.lang.String r3 = "Error resetting analytics data. appId, error"
            r1.zzc(r3, r2, r0)
        Lb5:
            boolean r0 = r8.zzh
            if (r0 == 0) goto Lbc
            r7.zzac(r8)
        Lbc:
            return
    }

    final void zzai(com.google.android.gms.measurement.internal.zzr r13) {
            r12 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r12.zzaX()
            r0.zzg()
            r12.zzM()
            java.lang.String r0 = r13.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.String r13 = r13.zzA
            com.google.android.gms.measurement.internal.zzba r13 = com.google.android.gms.measurement.internal.zzba.zze(r13)
            com.google.android.gms.measurement.internal.zzhe r1 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Setting DMA consent for package"
            r1.zzc(r2, r0, r13)
            com.google.android.gms.measurement.internal.zzil r1 = r12.zzaX()
            r1.zzg()
            r12.zzM()
            android.os.Bundle r1 = r12.zzd(r0)
            r2 = 100
            com.google.android.gms.measurement.internal.zzba r1 = com.google.android.gms.measurement.internal.zzba.zzc(r1, r2)
            com.google.android.gms.measurement.internal.zzju r1 = r1.zzf()
            java.util.Map r3 = r12.zzD
            r3.put(r0, r13)
            com.google.android.gms.measurement.internal.zzaw r3 = r12.zzj()
            r3.zzU(r0, r13)
            android.os.Bundle r13 = r12.zzd(r0)
            com.google.android.gms.measurement.internal.zzba r13 = com.google.android.gms.measurement.internal.zzba.zzc(r13, r2)
            com.google.android.gms.measurement.internal.zzju r13 = r13.zzf()
            com.google.android.gms.measurement.internal.zzil r2 = r12.zzaX()
            r2.zzg()
            r12.zzM()
            com.google.android.gms.measurement.internal.zzju r2 = com.google.android.gms.measurement.internal.zzju.zzc
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L68
            com.google.android.gms.measurement.internal.zzju r5 = com.google.android.gms.measurement.internal.zzju.zzd
            if (r13 != r5) goto L68
            r5 = 1
            goto L69
        L68:
            r5 = 0
        L69:
            com.google.android.gms.measurement.internal.zzju r6 = com.google.android.gms.measurement.internal.zzju.zzd
            if (r1 != r6) goto L70
            if (r13 != r2) goto L70
            goto L71
        L70:
            r3 = 0
        L71:
            if (r5 != 0) goto L77
            if (r3 == 0) goto L76
            goto L77
        L76:
            return
        L77:
            com.google.android.gms.measurement.internal.zzhe r13 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzj()
            java.lang.String r1 = "Generated _dcu event for"
            r13.zzb(r1, r0)
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            com.google.android.gms.measurement.internal.zzaw r1 = r12.zzj()
            long r2 = r12.zza()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r0
            com.google.android.gms.measurement.internal.zzas r1 = r1.zzo(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            long r1 = r1.zzf
            com.google.android.gms.measurement.internal.zzam r3 = r12.zzi()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzal
            int r3 = r3.zzh(r0, r4)
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto Ldc
            r1 = 1
            java.lang.String r3 = "_r"
            r13.putLong(r3, r1)
            com.google.android.gms.measurement.internal.zzaw r1 = r12.zzj()
            long r2 = r12.zza()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            r4 = r0
            com.google.android.gms.measurement.internal.zzas r1 = r1.zzo(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            com.google.android.gms.measurement.internal.zzhe r2 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            long r3 = r1.zzf
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "_dcu realtime event count"
            r2.zzc(r3, r0, r1)
        Ldc:
            com.google.android.gms.measurement.internal.zzqe r1 = r12.zzK
            java.lang.String r2 = "_dcu"
            r1.zza(r0, r2, r13)
            return
    }

    public final void zzaj(java.lang.String r2, com.google.android.gms.measurement.internal.zzmh r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r1.zzaX()
            r0.zzg()
            java.lang.String r0 = r1.zzH
            if (r0 == 0) goto L15
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L15
            if (r3 == 0) goto L14
            goto L15
        L14:
            return
        L15:
            r1.zzH = r2
            r1.zzG = r3
            return
    }

    final void zzak(com.google.android.gms.measurement.internal.zzr r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r3.zzaX()
            r0.zzg()
            r3.zzM()
            java.lang.String r0 = r4.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            int r1 = r4.zzz
            java.lang.String r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzjx r4 = com.google.android.gms.measurement.internal.zzjx.zzk(r4, r1)
            r3.zzu(r0)
            com.google.android.gms.measurement.internal.zzhe r1 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Setting storage consent for package"
            r1.zzc(r2, r0, r4)
            r3.zzaq(r0, r4)
            return
    }

    final void zzal(java.util.List r2) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            java.util.List r0 = r1.zzz
            if (r0 == 0) goto L1b
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r0 = "Set uploading progress before finishing the previous upload"
            r2.zza(r0)
            return
        L1b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.zzz = r0
            return
    }

    protected final void zzam() {
            r10 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r10.zzaX()
            r0.zzg()
            com.google.android.gms.measurement.internal.zzaw r0 = r10.zzj()
            r0.zzO()
            com.google.android.gms.measurement.internal.zzaw r0 = r10.zzj()
            r0.zzg()
            r0.zzav()
            boolean r1 = r0.zzae()
            r2 = 0
            if (r1 == 0) goto L70
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzau
            r4 = 0
            java.lang.Object r5 = r1.zza(r4)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L32
            goto L70
        L32:
            android.database.sqlite.SQLiteDatabase r5 = r0.zzj()
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = 0
            com.google.android.gms.common.util.Clock r8 = r0.zzaU()
            long r8 = r8.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r6[r7] = r8
            r7 = 1
            java.lang.Object r1 = r1.zza(r4)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r6[r7] = r1
            java.lang.String r1 = "trigger_uris"
            java.lang.String r4 = "abs(timestamp_millis - ?) > cast(? as integer)"
            int r1 = r5.delete(r1, r4, r6)
            if (r1 <= 0) goto L70
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "Deleted stale trigger uris. rowsDeleted"
            r0.zzb(r4, r1)
        L70:
            com.google.android.gms.measurement.internal.zzoa r0 = r10.zzk
            com.google.android.gms.measurement.internal.zzhp r0 = r0.zzd
            long r0 = r0.zza()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L8b
            com.google.android.gms.measurement.internal.zzoa r0 = r10.zzk
            com.google.android.gms.measurement.internal.zzhp r0 = r0.zzd
            com.google.android.gms.common.util.Clock r1 = r10.zzaU()
            long r1 = r1.currentTimeMillis()
            r0.zzb(r1)
        L8b:
            r10.zzaL()
            return
    }

    final void zzan(com.google.android.gms.measurement.internal.zzai r2) {
            r1 = this;
            java.lang.String r0 = r2.zza
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.measurement.internal.zzr r0 = r1.zzaD(r0)
            if (r0 == 0) goto L11
            r1.zzao(r2, r0)
        L11:
            return
    }

    final void zzao(com.google.android.gms.measurement.internal.zzai r11, com.google.android.gms.measurement.internal.zzr r12) {
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            java.lang.String r0 = r11.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.String r0 = r11.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzqb r0 = r11.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzqb r0 = r11.zzc
            java.lang.String r0 = r0.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzil r0 = r10.zzaX()
            r0.zzg()
            r10.zzM()
            boolean r0 = zzaQ(r12)
            if (r0 != 0) goto L2a
            return
        L2a:
            boolean r0 = r12.zzh
            if (r0 != 0) goto L32
            r10.zzg(r12)
            return
        L32:
            com.google.android.gms.measurement.internal.zzai r0 = new com.google.android.gms.measurement.internal.zzai
            r0.<init>(r11)
            r11 = 0
            r0.zze = r11
            com.google.android.gms.measurement.internal.zzaw r1 = r10.zzj()
            r1.zzH()
            com.google.android.gms.measurement.internal.zzaw r1 = r10.zzj()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r2 = r0.zza     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r3 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzai r1 = r1.zzm(r2, r3)     // Catch: java.lang.Throwable -> L1b9
            if (r1 == 0) goto L80
            java.lang.String r2 = r1.zzb     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r3 = r0.zzb     // Catch: java.lang.Throwable -> L1b9
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L1b9
            if (r2 != 0) goto L80
            com.google.android.gms.measurement.internal.zzhe r2 = r10.zzaW()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r3 = "Updating a conditional user property with different origin. name, origin, origin (from DB)"
            com.google.android.gms.measurement.internal.zzio r4 = r10.zzn     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzgx r4 = r4.zzj()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r5 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r4 = r4.zzf(r5)     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r5 = r0.zzb     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r6 = r1.zzb     // Catch: java.lang.Throwable -> L1b9
            r2.zzd(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1b9
        L80:
            r2 = 1
            if (r1 == 0) goto Lb6
            boolean r3 = r1.zze     // Catch: java.lang.Throwable -> L1b9
            if (r3 == 0) goto Lb6
            java.lang.String r3 = r1.zzb     // Catch: java.lang.Throwable -> L1b9
            r0.zzb = r3     // Catch: java.lang.Throwable -> L1b9
            long r3 = r1.zzd     // Catch: java.lang.Throwable -> L1b9
            r0.zzd = r3     // Catch: java.lang.Throwable -> L1b9
            long r3 = r1.zzh     // Catch: java.lang.Throwable -> L1b9
            r0.zzh = r3     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r3 = r1.zzf     // Catch: java.lang.Throwable -> L1b9
            r0.zzf = r3     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzbh r3 = r1.zzi     // Catch: java.lang.Throwable -> L1b9
            r0.zzi = r3     // Catch: java.lang.Throwable -> L1b9
            r0.zze = r2     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r2 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r3 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r5 = r3.zzb     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r4 = r1.zzc     // Catch: java.lang.Throwable -> L1b9
            long r6 = r4.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r8 = r3.zza()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r1 = r1.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r9 = r1.zzf     // Catch: java.lang.Throwable -> L1b9
            r4 = r2
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L1b9
            r0.zzc = r2     // Catch: java.lang.Throwable -> L1b9
            goto Ld7
        Lb6:
            java.lang.String r1 = r0.zzf     // Catch: java.lang.Throwable -> L1b9
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1b9
            if (r1 == 0) goto Ld7
            com.google.android.gms.measurement.internal.zzqb r11 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r1 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r4 = r1.zzb     // Catch: java.lang.Throwable -> L1b9
            long r5 = r0.zzd     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r7 = r1.zza()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r1 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r8 = r1.zzf     // Catch: java.lang.Throwable -> L1b9
            r3 = r11
            r3.<init>(r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L1b9
            r0.zzc = r11     // Catch: java.lang.Throwable -> L1b9
            r0.zze = r2     // Catch: java.lang.Throwable -> L1b9
            r11 = 1
        Ld7:
            boolean r1 = r0.zze     // Catch: java.lang.Throwable -> L1b9
            if (r1 == 0) goto L155
            com.google.android.gms.measurement.internal.zzqb r1 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqd r9 = new com.google.android.gms.measurement.internal.zzqd     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r2 = r0.zza     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L1b9
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r4 = r0.zzb     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r5 = r1.zzb     // Catch: java.lang.Throwable -> L1b9
            long r6 = r1.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r1 = r1.zza()     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L1b9
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzaw r1 = r10.zzj()     // Catch: java.lang.Throwable -> L1b9
            boolean r1 = r1.zzai(r9)     // Catch: java.lang.Throwable -> L1b9
            if (r1 == 0) goto L122
            com.google.android.gms.measurement.internal.zzhe r1 = r10.zzaW()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r2 = "User property updated immediately"
            java.lang.String r3 = r0.zza     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzio r4 = r10.zzn     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzgx r4 = r4.zzj()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r5 = r9.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r4 = r4.zzf(r5)     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r5 = r9.zze     // Catch: java.lang.Throwable -> L1b9
            r1.zzd(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1b9
            goto L143
        L122:
            com.google.android.gms.measurement.internal.zzhe r1 = r10.zzaW()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r2 = "(2)Too many active user properties, ignoring"
            java.lang.String r3 = r0.zza     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzio r4 = r10.zzn     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzgx r4 = r4.zzj()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r5 = r9.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r4 = r4.zzf(r5)     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r5 = r9.zze     // Catch: java.lang.Throwable -> L1b9
            r1.zzd(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1b9
        L143:
            if (r11 == 0) goto L155
            com.google.android.gms.measurement.internal.zzbh r11 = r0.zzi     // Catch: java.lang.Throwable -> L1b9
            if (r11 == 0) goto L155
            com.google.android.gms.measurement.internal.zzbh r11 = new com.google.android.gms.measurement.internal.zzbh     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzbh r1 = r0.zzi     // Catch: java.lang.Throwable -> L1b9
            long r2 = r0.zzd     // Catch: java.lang.Throwable -> L1b9
            r11.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1b9
            r10.zzax(r11, r12)     // Catch: java.lang.Throwable -> L1b9
        L155:
            com.google.android.gms.measurement.internal.zzaw r11 = r10.zzj()     // Catch: java.lang.Throwable -> L1b9
            boolean r11 = r11.zzah(r0)     // Catch: java.lang.Throwable -> L1b9
            if (r11 == 0) goto L183
            com.google.android.gms.measurement.internal.zzhe r11 = r10.zzaW()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zzd()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r12 = "Conditional property added"
            java.lang.String r1 = r0.zza     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzio r2 = r10.zzn     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r3 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r2 = r2.zzf(r3)     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r0 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> L1b9
            r11.zzd(r12, r1, r2, r0)     // Catch: java.lang.Throwable -> L1b9
            goto L1aa
        L183:
            com.google.android.gms.measurement.internal.zzhe r11 = r10.zzaW()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zze()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r12 = "Too many conditional properties, ignoring"
            java.lang.String r1 = r0.zza     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzio r2 = r10.zzn     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r3 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r2 = r2.zzf(r3)     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzqb r0 = r0.zzc     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> L1b9
            r11.zzd(r12, r1, r2, r0)     // Catch: java.lang.Throwable -> L1b9
        L1aa:
            com.google.android.gms.measurement.internal.zzaw r11 = r10.zzj()     // Catch: java.lang.Throwable -> L1b9
            r11.zzS()     // Catch: java.lang.Throwable -> L1b9
            com.google.android.gms.measurement.internal.zzaw r11 = r10.zzj()
            r11.zzL()
            return
        L1b9:
            r11 = move-exception
            com.google.android.gms.measurement.internal.zzaw r12 = r10.zzj()
            r12.zzL()
            throw r11
    }

    final void zzap(java.lang.String r13, com.google.android.gms.measurement.internal.zzag r14) {
            r12 = this;
            com.google.android.gms.measurement.internal.zzam r0 = r12.zzi()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            if (r0 != 0) goto Lf
            goto L119
        Lf:
            com.google.android.gms.measurement.internal.zzil r0 = r12.zzaX()
            r0.zzg()
            r12.zzM()
            com.google.android.gms.measurement.internal.zzaw r0 = r12.zzj()
            long r3 = r14.zza
            com.google.android.gms.measurement.internal.zzpz r0 = r0.zzx(r3)
            if (r0 != 0) goto L37
            com.google.android.gms.measurement.internal.zzhe r14 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r14 = r14.zzk()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "[sgtm] Queued batch doesn't exist. appId, rowId"
            r14.zzc(r1, r13, r0)
            return
        L37:
            java.lang.String r0 = r0.zzh()
            int r5 = r14.zzb
            com.google.android.gms.measurement.internal.zzme r6 = com.google.android.gms.measurement.internal.zzme.zzb
            int r6 = r6.zza()
            if (r5 != r6) goto L11a
            java.util.Map r5 = r12.zzF
            boolean r6 = r5.containsKey(r0)
            if (r6 == 0) goto L50
            r5.remove(r0)
        L50:
            com.google.android.gms.measurement.internal.zzaw r0 = r12.zzj()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.zzK(r3)
            com.google.android.gms.measurement.internal.zzhe r0 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r4 = "[sgtm] queued batch deleted after successful client upload. appId, rowId"
            r0.zzc(r4, r13, r3)
            long r3 = r14.zzc
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L119
            com.google.android.gms.measurement.internal.zzaw r0 = r12.zzj()
            com.google.android.gms.measurement.internal.zzio r5 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r6 = r5.zzf()
            boolean r1 = r6.zzx(r2, r1)
            if (r1 != 0) goto L81
            goto Led
        L81:
            r0.zzg()
            r0.zzav()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            com.google.android.gms.measurement.internal.zzmf r6 = com.google.android.gms.measurement.internal.zzmf.zzb
            int r6 = r6.zza()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "upload_type"
            r2.put(r7, r6)
            com.google.android.gms.common.util.Clock r6 = r5.zzaU()
            long r6 = r6.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "creation_timestamp"
            r2.put(r7, r6)
            android.database.sqlite.SQLiteDatabase r6 = r0.zzj()     // Catch: android.database.sqlite.SQLiteException -> L104
            java.lang.String r7 = "upload_queue"
            java.lang.String r8 = "rowid=? AND app_id=? AND upload_type=?"
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: android.database.sqlite.SQLiteException -> L104
            r10 = 0
            java.lang.String r11 = java.lang.String.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L104
            r9[r10] = r11     // Catch: android.database.sqlite.SQLiteException -> L104
            r10 = 1
            r9[r10] = r13     // Catch: android.database.sqlite.SQLiteException -> L104
            r10 = 2
            com.google.android.gms.measurement.internal.zzmf r11 = com.google.android.gms.measurement.internal.zzmf.zze     // Catch: android.database.sqlite.SQLiteException -> L104
            int r11 = r11.zza()     // Catch: android.database.sqlite.SQLiteException -> L104
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: android.database.sqlite.SQLiteException -> L104
            r9[r10] = r11     // Catch: android.database.sqlite.SQLiteException -> L104
            int r2 = r6.update(r7, r2, r8, r9)     // Catch: android.database.sqlite.SQLiteException -> L104
            long r6 = (long) r2     // Catch: android.database.sqlite.SQLiteException -> L104
            r8 = 1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto Led
            com.google.android.gms.measurement.internal.zzhe r2 = r5.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L104
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()     // Catch: android.database.sqlite.SQLiteException -> L104
            java.lang.String r5 = "Google Signal pending batch not updated. appId, rowId"
            r2.zzc(r5, r13, r1)     // Catch: android.database.sqlite.SQLiteException -> L104
        Led:
            com.google.android.gms.measurement.internal.zzhe r0 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            long r1 = r14.zzc
            java.lang.Long r14 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] queued Google Signal batch updated. appId, signalRowId"
            r0.zzc(r1, r13, r14)
            r12.zzav(r13)
            return
        L104:
            r14 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r2 = "Failed to update google Signal pending batch. appid, rowId"
            r0.zzd(r2, r13, r1, r14)
            throw r14
        L119:
            return
        L11a:
            int r1 = r14.zzb
            com.google.android.gms.measurement.internal.zzme r2 = com.google.android.gms.measurement.internal.zzme.zzd
            int r2 = r2.zza()
            if (r1 != r2) goto L15b
            java.util.Map r1 = r12.zzF
            java.lang.Object r2 = r1.get(r0)
            com.google.android.gms.measurement.internal.zzpt r2 = (com.google.android.gms.measurement.internal.zzpt) r2
            if (r2 != 0) goto L137
            com.google.android.gms.measurement.internal.zzpt r2 = new com.google.android.gms.measurement.internal.zzpt
            r2.<init>(r12)
            r1.put(r0, r2)
            goto L13a
        L137:
            r2.zzb()
        L13a:
            long r1 = com.google.android.gms.measurement.internal.zzpt.zza(r2)
            com.google.android.gms.common.util.Clock r3 = r12.zzaU()
            long r3 = r3.currentTimeMillis()
            long r1 = r1 - r3
            com.google.android.gms.measurement.internal.zzhe r3 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"
            r3.zzd(r2, r13, r0, r1)
        L15b:
            com.google.android.gms.measurement.internal.zzaw r0 = r12.zzj()
            long r1 = r14.zza
            java.lang.Long r14 = java.lang.Long.valueOf(r1)
            r0.zzN(r14)
            com.google.android.gms.measurement.internal.zzhe r0 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "[sgtm] increased batch retry count after failed client upload. appId, rowId"
            r0.zzc(r1, r13, r14)
            return
    }

    final void zzaq(java.lang.String r2, com.google.android.gms.measurement.internal.zzjx r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r1.zzaX()
            r0.zzg()
            r1.zzM()
            java.util.Map r0 = r1.zzC
            r0.put(r2, r3)
            com.google.android.gms.measurement.internal.zzaw r0 = r1.zzj()
            r0.zzX(r2, r3)
            return
    }

    final void zzar(java.lang.String r2, boolean r3, java.lang.Long r4, java.lang.Long r5) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzaw r0 = r1.zzj()
            com.google.android.gms.measurement.internal.zzh r2 = r0.zzl(r2)
            if (r2 == 0) goto L21
            r2.zzaF(r3)
            r2.zzaG(r4)
            r2.zzaH(r5)
            boolean r3 = r2.zzaK()
            if (r3 == 0) goto L21
            com.google.android.gms.measurement.internal.zzaw r3 = r1.zzj()
            r4 = 0
            r3.zzT(r2, r4, r4)
        L21:
            return
    }

    final void zzas(com.google.android.gms.measurement.internal.zzqb r22, com.google.android.gms.measurement.internal.zzr r23) {
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            java.lang.String r3 = "_id"
            com.google.android.gms.measurement.internal.zzil r4 = r21.zzaX()
            r4.zzg()
            r21.zzM()
            boolean r4 = zzaQ(r23)
            if (r4 != 0) goto L1a
            goto L1f9
        L1a:
            boolean r4 = r2.zzh
            if (r4 != 0) goto L22
            r1.zzg(r2)
            return
        L22:
            com.google.android.gms.measurement.internal.zzqf r4 = r21.zzB()
            java.lang.String r12 = r0.zzb
            int r8 = r4.zzj(r12)
            r4 = 1
            r5 = 24
            if (r8 == 0) goto L53
            com.google.android.gms.measurement.internal.zzqf r0 = r21.zzB()
            r21.zzi()
            java.lang.String r10 = r0.zzG(r12, r5, r4)
            if (r12 == 0) goto L44
            int r0 = r12.length()
            r11 = r0
            goto L45
        L44:
            r11 = 0
        L45:
            com.google.android.gms.measurement.internal.zzqf r5 = r21.zzB()
            com.google.android.gms.measurement.internal.zzqe r6 = r1.zzK
            java.lang.String r7 = r2.zza
            java.lang.String r9 = "_ev"
            r5.zzR(r6, r7, r8, r9, r10, r11)
            return
        L53:
            com.google.android.gms.measurement.internal.zzqf r6 = r21.zzB()
            java.lang.Object r7 = r22.zza()
            int r17 = r6.zzd(r12, r7)
            if (r17 == 0) goto L97
            com.google.android.gms.measurement.internal.zzqf r3 = r21.zzB()
            r21.zzi()
            java.lang.String r19 = r3.zzG(r12, r5, r4)
            java.lang.Object r0 = r22.zza()
            if (r0 == 0) goto L85
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L7a
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L85
        L7a:
            java.lang.String r0 = r0.toString()
            int r13 = r0.length()
            r20 = r13
            goto L87
        L85:
            r20 = 0
        L87:
            com.google.android.gms.measurement.internal.zzqf r14 = r21.zzB()
            com.google.android.gms.measurement.internal.zzqe r15 = r1.zzK
            java.lang.String r0 = r2.zza
            java.lang.String r18 = "_ev"
            r16 = r0
            r14.zzR(r15, r16, r17, r18, r19, r20)
            return
        L97:
            com.google.android.gms.measurement.internal.zzqf r4 = r21.zzB()
            java.lang.Object r5 = r22.zza()
            java.lang.Object r4 = r4.zzE(r12, r5)
            if (r4 == 0) goto L1f9
            java.lang.String r14 = "_sid"
            boolean r5 = r14.equals(r12)
            if (r5 == 0) goto L120
            long r8 = r0.zzc
            java.lang.String r11 = r0.zzf
            java.lang.String r5 = r2.zza
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.measurement.internal.zzaw r6 = r21.zzj()
            java.lang.String r7 = "_sno"
            com.google.android.gms.measurement.internal.zzqd r6 = r6.zzy(r5, r7)
            if (r6 == 0) goto Ld4
            java.lang.Object r7 = r6.zze
            boolean r10 = r7 instanceof java.lang.Long
            if (r10 == 0) goto Ld4
            java.lang.Long r7 = (java.lang.Long) r7
            long r5 = r7.longValue()
            r16 = r14
            goto L10c
        Ld4:
            if (r6 == 0) goto Le5
            com.google.android.gms.measurement.internal.zzhe r7 = r21.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzk()
            java.lang.Object r6 = r6.zze
            java.lang.String r10 = "Retrieved last session number from database does not contain a valid (long) value"
            r7.zzb(r10, r6)
        Le5:
            com.google.android.gms.measurement.internal.zzaw r6 = r21.zzj()
            java.lang.String r7 = "_s"
            com.google.android.gms.measurement.internal.zzbd r5 = r6.zzs(r5, r7)
            if (r5 == 0) goto L108
            com.google.android.gms.measurement.internal.zzhe r6 = r21.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()
            r16 = r14
            long r13 = r5.zzc
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            java.lang.String r7 = "Backfill the session number. Last used session number"
            r6.zzb(r7, r5)
            r5 = r13
            goto L10c
        L108:
            r16 = r14
            r5 = 0
        L10c:
            com.google.android.gms.measurement.internal.zzqb r13 = new com.google.android.gms.measurement.internal.zzqb
            r17 = 1
            long r5 = r5 + r17
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            java.lang.String r7 = "_sno"
            r6 = r13
            r6.<init>(r7, r8, r10, r11)
            r1.zzas(r13, r2)
            goto L122
        L120:
            r16 = r14
        L122:
            com.google.android.gms.measurement.internal.zzqd r13 = new com.google.android.gms.measurement.internal.zzqd
            java.lang.String r14 = r2.zza
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = r0.zzf
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            long r9 = r0.zzc
            r5 = r13
            r8 = r12
            r11 = r4
            r5.<init>(r6, r7, r8, r9, r11)
            com.google.android.gms.measurement.internal.zzhe r0 = r21.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzio r5 = r1.zzn
            java.lang.String r6 = r13.zzc
            com.google.android.gms.measurement.internal.zzgx r7 = r5.zzj()
            java.lang.String r7 = r7.zzf(r6)
            java.lang.String r8 = "Setting user property"
            r0.zzc(r8, r7, r4)
            com.google.android.gms.measurement.internal.zzaw r0 = r21.zzj()
            r0.zzH()
            boolean r0 = r3.equals(r6)     // Catch: java.lang.Throwable -> L1f0
            if (r0 == 0) goto L181
            com.google.android.gms.measurement.internal.zzaw r0 = r21.zzj()     // Catch: java.lang.Throwable -> L1f0
            com.google.android.gms.measurement.internal.zzqd r0 = r0.zzy(r14, r3)     // Catch: java.lang.Throwable -> L1f0
            if (r0 == 0) goto L181
            java.lang.Object r3 = r13.zze     // Catch: java.lang.Throwable -> L1f0
            java.lang.Object r0 = r0.zze     // Catch: java.lang.Throwable -> L1f0
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1f0
            if (r0 != 0) goto L181
            com.google.android.gms.measurement.internal.zzaw r0 = r21.zzj()     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r3 = "_lair"
            r0.zzP(r14, r3)     // Catch: java.lang.Throwable -> L1f0
        L181:
            r1.zzg(r2)     // Catch: java.lang.Throwable -> L1f0
            com.google.android.gms.measurement.internal.zzaw r0 = r21.zzj()     // Catch: java.lang.Throwable -> L1f0
            boolean r0 = r0.zzai(r13)     // Catch: java.lang.Throwable -> L1f0
            r3 = r16
            boolean r3 = r3.equals(r12)     // Catch: java.lang.Throwable -> L1f0
            if (r3 == 0) goto L1b9
            com.google.android.gms.measurement.internal.zzqa r3 = r21.zzA()     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r2 = r2.zzw     // Catch: java.lang.Throwable -> L1f0
            long r2 = r3.zzd(r2)     // Catch: java.lang.Throwable -> L1f0
            com.google.android.gms.measurement.internal.zzaw r4 = r21.zzj()     // Catch: java.lang.Throwable -> L1f0
            com.google.android.gms.measurement.internal.zzh r4 = r4.zzl(r14)     // Catch: java.lang.Throwable -> L1f0
            if (r4 == 0) goto L1b9
            r4.zzaB(r2)     // Catch: java.lang.Throwable -> L1f0
            boolean r2 = r4.zzaK()     // Catch: java.lang.Throwable -> L1f0
            if (r2 == 0) goto L1b9
            com.google.android.gms.measurement.internal.zzaw r2 = r21.zzj()     // Catch: java.lang.Throwable -> L1f0
            r3 = 0
            r2.zzT(r4, r3, r3)     // Catch: java.lang.Throwable -> L1f0
        L1b9:
            com.google.android.gms.measurement.internal.zzaw r2 = r21.zzj()     // Catch: java.lang.Throwable -> L1f0
            r2.zzS()     // Catch: java.lang.Throwable -> L1f0
            if (r0 != 0) goto L1e8
            com.google.android.gms.measurement.internal.zzhe r0 = r21.zzaW()     // Catch: java.lang.Throwable -> L1f0
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r2 = "Too many unique user properties are set. Ignoring user property"
            com.google.android.gms.measurement.internal.zzgx r3 = r5.zzj()     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r3 = r3.zzf(r6)     // Catch: java.lang.Throwable -> L1f0
            java.lang.Object r4 = r13.zze     // Catch: java.lang.Throwable -> L1f0
            r0.zzc(r2, r3, r4)     // Catch: java.lang.Throwable -> L1f0
            com.google.android.gms.measurement.internal.zzqf r5 = r21.zzB()     // Catch: java.lang.Throwable -> L1f0
            com.google.android.gms.measurement.internal.zzqe r6 = r1.zzK     // Catch: java.lang.Throwable -> L1f0
            r8 = 9
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r14
            r5.zzR(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1f0
        L1e8:
            com.google.android.gms.measurement.internal.zzaw r0 = r21.zzj()
            r0.zzL()
            return
        L1f0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzaw r2 = r21.zzj()
            r2.zzL()
            throw r0
        L1f9:
            return
    }

    final void zzat() {
            r12 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r12.zzaX()
            r0.zzg()
            r12.zzM()
            r0 = 1
            r12.zzw = r0
            r1 = 0
            com.google.android.gms.measurement.internal.zzio r2 = r12.zzn     // Catch: java.lang.Throwable -> L1b1
            r2.zzaV()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzny r2 = r2.zzu()     // Catch: java.lang.Throwable -> L1b1
            java.lang.Boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L1b1
            if (r2 != 0) goto L2c
            com.google.android.gms.measurement.internal.zzhe r0 = r12.zzaW()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.zza(r2)     // Catch: java.lang.Throwable -> L1b1
            goto L1a3
        L2c:
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L1b1
            if (r2 == 0) goto L41
            com.google.android.gms.measurement.internal.zzhe r0 = r12.zzaW()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.zza(r2)     // Catch: java.lang.Throwable -> L1b1
            goto L1a3
        L41:
            long r2 = r12.zza     // Catch: java.lang.Throwable -> L1b1
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4e
            r12.zzaL()     // Catch: java.lang.Throwable -> L1b1
            goto L1a3
        L4e:
            com.google.android.gms.measurement.internal.zzil r2 = r12.zzaX()     // Catch: java.lang.Throwable -> L1b1
            r2.zzg()     // Catch: java.lang.Throwable -> L1b1
            java.util.List r2 = r12.zzz     // Catch: java.lang.Throwable -> L1b1
            if (r2 == 0) goto L68
            com.google.android.gms.measurement.internal.zzhe r0 = r12.zzaW()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r2 = "Uploading requested multiple times"
            r0.zza(r2)     // Catch: java.lang.Throwable -> L1b1
            goto L1a3
        L68:
            com.google.android.gms.measurement.internal.zzhk r2 = r12.zzp()     // Catch: java.lang.Throwable -> L1b1
            boolean r2 = r2.zzd()     // Catch: java.lang.Throwable -> L1b1
            if (r2 != 0) goto L84
            com.google.android.gms.measurement.internal.zzhe r0 = r12.zzaW()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.zza(r2)     // Catch: java.lang.Throwable -> L1b1
            r12.zzaL()     // Catch: java.lang.Throwable -> L1b1
            goto L1a3
        L84:
            com.google.android.gms.common.util.Clock r2 = r12.zzaU()     // Catch: java.lang.Throwable -> L1b1
            long r2 = r2.currentTimeMillis()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzam r6 = r12.zzi()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzgg r7 = com.google.android.gms.measurement.internal.zzgi.zzah     // Catch: java.lang.Throwable -> L1b1
            r8 = 0
            int r6 = r6.zzh(r8, r7)     // Catch: java.lang.Throwable -> L1b1
            r12.zzi()     // Catch: java.lang.Throwable -> L1b1
            long r9 = com.google.android.gms.measurement.internal.zzam.zzF()     // Catch: java.lang.Throwable -> L1b1
            long r9 = r2 - r9
            r7 = 0
        La1:
            if (r7 >= r6) goto Lac
            boolean r11 = r12.zzaM(r8, r9)     // Catch: java.lang.Throwable -> L1b1
            if (r11 == 0) goto Lac
            int r7 = r7 + 1
            goto La1
        Lac:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzil r6 = r12.zzaX()     // Catch: java.lang.Throwable -> L1b1
            r6.zzg()     // Catch: java.lang.Throwable -> L1b1
            r12.zzaJ()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzoa r6 = r12.zzk     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzhp r6 = r6.zzd     // Catch: java.lang.Throwable -> L1b1
            long r6 = r6.zza()     // Catch: java.lang.Throwable -> L1b1
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 == 0) goto Ldc
            com.google.android.gms.measurement.internal.zzhe r4 = r12.zzaW()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzd()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r5 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r6 = r2 - r6
            long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L1b1
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L1b1
            r4.zzb(r5, r6)     // Catch: java.lang.Throwable -> L1b1
        Ldc:
            com.google.android.gms.measurement.internal.zzaw r4 = r12.zzj()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r4 = r4.zzA()     // Catch: java.lang.Throwable -> L1b1
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1b1
            r6 = -1
            if (r5 != 0) goto L132
            long r9 = r12.zzB     // Catch: java.lang.Throwable -> L1b1
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 != 0) goto L12d
            com.google.android.gms.measurement.internal.zzaw r0 = r12.zzj()     // Catch: java.lang.Throwable -> L1b1
            android.database.sqlite.SQLiteDatabase r5 = r0.zzj()     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            java.lang.String r9 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r8 = r5.rawQuery(r9, r8)     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            boolean r5 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            if (r5 != 0) goto L10a
        L106:
            r8.close()     // Catch: java.lang.Throwable -> L1b1
            goto L124
        L10a:
            long r6 = r8.getLong(r1)     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            goto L106
        L10f:
            r0 = move-exception
            goto L127
        L111:
            r5 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r9 = "Error querying raw events"
            r0.zzb(r9, r5)     // Catch: java.lang.Throwable -> L10f
            if (r8 == 0) goto L124
            goto L106
        L124:
            r12.zzB = r6     // Catch: java.lang.Throwable -> L1b1
            goto L12d
        L127:
            if (r8 == 0) goto L12c
            r8.close()     // Catch: java.lang.Throwable -> L1b1
        L12c:
            throw r0     // Catch: java.lang.Throwable -> L1b1
        L12d:
            r12.zzau(r4, r2)     // Catch: java.lang.Throwable -> L1b1
            goto L1a3
        L132:
            r12.zzB = r6     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzaw r4 = r12.zzj()     // Catch: java.lang.Throwable -> L1b1
            r12.zzi()     // Catch: java.lang.Throwable -> L1b1
            long r5 = com.google.android.gms.measurement.internal.zzam.zzF()     // Catch: java.lang.Throwable -> L1b1
            long r2 = r2 - r5
            r4.zzg()     // Catch: java.lang.Throwable -> L1b1
            r4.zzav()     // Catch: java.lang.Throwable -> L1b1
            android.database.sqlite.SQLiteDatabase r5 = r4.zzj()     // Catch: java.lang.Throwable -> L178 android.database.sqlite.SQLiteException -> L17b
            java.lang.String r6 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L178 android.database.sqlite.SQLiteException -> L17b
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L178 android.database.sqlite.SQLiteException -> L17b
            r0[r1] = r2     // Catch: java.lang.Throwable -> L178 android.database.sqlite.SQLiteException -> L17b
            android.database.Cursor r0 = r5.rawQuery(r6, r0)     // Catch: java.lang.Throwable -> L178 android.database.sqlite.SQLiteException -> L17b
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L176 java.lang.Throwable -> L1a9
            if (r2 != 0) goto L171
            com.google.android.gms.measurement.internal.zzio r2 = r4.zzu     // Catch: android.database.sqlite.SQLiteException -> L176 java.lang.Throwable -> L1a9
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L176 java.lang.Throwable -> L1a9
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L176 java.lang.Throwable -> L1a9
            java.lang.String r3 = "No expired configs for apps with pending events"
            r2.zza(r3)     // Catch: android.database.sqlite.SQLiteException -> L176 java.lang.Throwable -> L1a9
        L16d:
            r0.close()     // Catch: java.lang.Throwable -> L1b1
            goto L190
        L171:
            java.lang.String r8 = r0.getString(r1)     // Catch: android.database.sqlite.SQLiteException -> L176 java.lang.Throwable -> L1a9
            goto L16d
        L176:
            r2 = move-exception
            goto L17e
        L178:
            r0 = move-exception
            r2 = r0
            goto L1ab
        L17b:
            r0 = move-exception
            r2 = r0
            r0 = r8
        L17e:
            com.google.android.gms.measurement.internal.zzio r3 = r4.zzu     // Catch: java.lang.Throwable -> L1a9
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L1a9
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L1a9
            java.lang.String r4 = "Error selecting expired configs"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L1a9
            if (r0 == 0) goto L190
            goto L16d
        L190:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L1b1
            if (r0 != 0) goto L1a3
            com.google.android.gms.measurement.internal.zzaw r0 = r12.zzj()     // Catch: java.lang.Throwable -> L1b1
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzl(r8)     // Catch: java.lang.Throwable -> L1b1
            if (r0 == 0) goto L1a3
            r12.zzO(r0)     // Catch: java.lang.Throwable -> L1b1
        L1a3:
            r12.zzw = r1
            r12.zzaH()
            return
        L1a9:
            r2 = move-exception
            r8 = r0
        L1ab:
            if (r8 == 0) goto L1b0
            r8.close()     // Catch: java.lang.Throwable -> L1b1
        L1b0:
            throw r2     // Catch: java.lang.Throwable -> L1b1
        L1b1:
            r0 = move-exception
            r12.zzw = r1
            r12.zzaH()
            throw r0
    }

    final void zzau(java.lang.String r29, long r30) {
            r28 = this;
            r8 = r28
            r9 = r29
            r1 = r30
            com.google.android.gms.measurement.internal.zzam r0 = r28.zzi()
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzg
            int r0 = r0.zzh(r9, r3)
            com.google.android.gms.measurement.internal.zzam r3 = r28.zzi()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzh
            int r3 = r3.zzh(r9, r4)
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            com.google.android.gms.measurement.internal.zzaw r5 = r28.zzj()
            r5.zzg()
            r5.zzav()
            r6 = 1
            if (r0 <= 0) goto L2e
            r7 = 1
            goto L2f
        L2e:
            r7 = 0
        L2f:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r7)
            if (r3 <= 0) goto L36
            r7 = 1
            goto L37
        L36:
            r7 = 0
        L37:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r7)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r29)
            android.database.sqlite.SQLiteDatabase r11 = r5.zzj()     // Catch: java.lang.Throwable -> L1cf android.database.sqlite.SQLiteException -> L1d3
            java.lang.String r12 = "queue"
            java.lang.String r13 = "rowid"
            java.lang.String r14 = "data"
            java.lang.String r15 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14, r15}     // Catch: java.lang.Throwable -> L1cf android.database.sqlite.SQLiteException -> L1d3
            java.lang.String r14 = "app_id=?"
            java.lang.String[] r15 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L1cf android.database.sqlite.SQLiteException -> L1d3
            r15[r4] = r9     // Catch: java.lang.Throwable -> L1cf android.database.sqlite.SQLiteException -> L1d3
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L1cf android.database.sqlite.SQLiteException -> L1d3
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L1cf android.database.sqlite.SQLiteException -> L1d3
            boolean r0 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r0 != 0) goto L70
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
        L6b:
            r11.close()
            goto L1f0
        L70:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r12.<init>()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r13 = 0
        L76:
            long r14 = r11.getLong(r4)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            byte[] r0 = r11.getBlob(r6)     // Catch: java.io.IOException -> L1a5 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzpv r10 = r5.zzg     // Catch: java.io.IOException -> L1a5 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzqa r10 = r10.zzA()     // Catch: java.io.IOException -> L1a5 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r6.<init>(r0)     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r0.<init>(r6)     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r7.<init>()     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
        L97:
            int r1 = r0.read(r4)     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r1 > 0) goto L18e
            r0.close()     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r6.close()     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            byte[] r0 = r7.toByteArray()     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            boolean r1 = r12.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r1 != 0) goto Lb3
            int r1 = r0.length     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            int r1 = r1 + r13
            if (r1 <= r3) goto Lb3
            goto L1c8
        Lb3:
            com.google.android.gms.internal.measurement.zzhw r1 = com.google.android.gms.internal.measurement.zzhx.zzz()     // Catch: java.io.IOException -> L179 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.internal.measurement.zzng r1 = com.google.android.gms.measurement.internal.zzqa.zzp(r1, r0)     // Catch: java.io.IOException -> L179 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.internal.measurement.zzhw r1 = (com.google.android.gms.internal.measurement.zzhw) r1     // Catch: java.io.IOException -> L179 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            boolean r2 = r12.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r2 != 0) goto L157
            r2 = 0
            java.lang.Object r4 = r12.get(r2)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            android.util.Pair r4 = (android.util.Pair) r4     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.Object r2 = r4.first     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.internal.measurement.zzhx r2 = (com.google.android.gms.internal.measurement.zzhx) r2     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.internal.measurement.zzmd r4 = r1.zzba()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.internal.measurement.zzhx r4 = (com.google.android.gms.internal.measurement.zzhx) r4     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r6 = r2.zzK()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r7 = r4.zzK()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            boolean r6 = r6.equals(r7)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r6 == 0) goto L1c8
            java.lang.String r6 = r2.zzJ()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r7 = r4.zzJ()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            boolean r6 = r6.equals(r7)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r6 == 0) goto L1c8
            boolean r6 = r2.zzbu()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            boolean r7 = r4.zzbu()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r6 != r7) goto L1c8
            java.lang.String r6 = r2.zzL()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r7 = r4.zzL()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            boolean r6 = r6.equals(r7)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r6 == 0) goto L1c8
            java.util.List r2 = r2.zzY()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.util.Iterator r2 = r2.iterator()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
        L110:
            boolean r6 = r2.hasNext()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r7 = "_npa"
            r20 = -1
            if (r6 == 0) goto L12f
            java.lang.Object r6 = r2.next()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.internal.measurement.zzio r6 = (com.google.android.gms.internal.measurement.zzio) r6     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r10 = r6.zzg()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            boolean r10 = r7.equals(r10)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r10 == 0) goto L110
            long r22 = r6.zzc()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            goto L131
        L12f:
            r22 = r20
        L131:
            java.util.List r2 = r4.zzY()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.util.Iterator r2 = r2.iterator()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
        L139:
            boolean r4 = r2.hasNext()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r4 == 0) goto L153
            java.lang.Object r4 = r2.next()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.internal.measurement.zzio r4 = (com.google.android.gms.internal.measurement.zzio) r4     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r6 = r4.zzg()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            boolean r6 = r7.equals(r6)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r6 == 0) goto L139
            long r20 = r4.zzc()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
        L153:
            int r2 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r2 != 0) goto L1c8
        L157:
            r2 = 2
            boolean r4 = r11.isNull(r2)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r4 != 0) goto L165
            int r4 = r11.getInt(r2)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r1.zzat(r4)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
        L165:
            int r0 = r0.length     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zzba()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.internal.measurement.zzhx r0 = (com.google.android.gms.internal.measurement.zzhx) r0     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r12.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            goto L1b9
        L179:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r2 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r29)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r1.zzc(r2, r4, r0)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            goto L1b9
        L18e:
            r2 = 0
            r7.write(r4, r2, r1)     // Catch: java.io.IOException -> L194 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            goto L97
        L194:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r10.zzu     // Catch: java.io.IOException -> L1a5 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.io.IOException -> L1a5 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.io.IOException -> L1a5 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r2 = "Failed to ungzip content"
            r1.zzb(r2, r0)     // Catch: java.io.IOException -> L1a5 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            throw r0     // Catch: java.io.IOException -> L1a5 android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
        L1a5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            java.lang.String r2 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r29)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            r1.zzc(r2, r4, r0)     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
        L1b9:
            boolean r0 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L1cd java.lang.Throwable -> L6d2
            if (r0 == 0) goto L1c8
            if (r13 <= r3) goto L1c2
            goto L1c8
        L1c2:
            r1 = r30
            r4 = 0
            r6 = 1
            goto L76
        L1c8:
            r11.close()
            r0 = r12
            goto L1f0
        L1cd:
            r0 = move-exception
            goto L1d5
        L1cf:
            r0 = move-exception
            r10 = 0
            goto L6d4
        L1d3:
            r0 = move-exception
            r11 = 0
        L1d5:
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu     // Catch: java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> L6d2
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L6d2
            java.lang.String r2 = "Error querying bundles. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r29)     // Catch: java.lang.Throwable -> L6d2
            r1.zzc(r2, r3, r0)     // Catch: java.lang.Throwable -> L6d2
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L6d2
            if (r11 == 0) goto L1f0
            goto L6b
        L1f0:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L6d1
            com.google.android.gms.measurement.internal.zzjx r1 = r28.zzu(r29)
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zza
            boolean r1 = r1.zzr(r2)
            if (r1 == 0) goto L257
            java.util.Iterator r1 = r0.iterator()
        L206:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L225
            java.lang.Object r2 = r1.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r2 = r2.first
            com.google.android.gms.internal.measurement.zzhx r2 = (com.google.android.gms.internal.measurement.zzhx) r2
            java.lang.String r3 = r2.zzT()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L206
            java.lang.String r1 = r2.zzT()
            goto L226
        L225:
            r1 = 0
        L226:
            if (r1 == 0) goto L257
            r2 = 0
        L229:
            int r3 = r0.size()
            if (r2 >= r3) goto L257
            java.lang.Object r3 = r0.get(r2)
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r3 = r3.first
            com.google.android.gms.internal.measurement.zzhx r3 = (com.google.android.gms.internal.measurement.zzhx) r3
            java.lang.String r4 = r3.zzT()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L244
            goto L254
        L244:
            java.lang.String r3 = r3.zzT()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L254
            r3 = 0
            java.util.List r0 = r0.subList(r3, r2)
            goto L257
        L254:
            int r2 = r2 + 1
            goto L229
        L257:
            com.google.android.gms.internal.measurement.zzht r1 = com.google.android.gms.internal.measurement.zzhv.zzb()
            int r2 = r0.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            com.google.android.gms.measurement.internal.zzam r4 = r28.zzi()
            boolean r4 = r4.zzy(r9)
            if (r4 == 0) goto L280
            com.google.android.gms.measurement.internal.zzjx r4 = r28.zzu(r29)
            com.google.android.gms.measurement.internal.zzjw r5 = com.google.android.gms.measurement.internal.zzjw.zza
            boolean r4 = r4.zzr(r5)
            if (r4 == 0) goto L280
            r4 = 1
            goto L281
        L280:
            r4 = 0
        L281:
            com.google.android.gms.measurement.internal.zzjx r5 = r28.zzu(r29)
            com.google.android.gms.measurement.internal.zzjw r6 = com.google.android.gms.measurement.internal.zzjw.zza
            boolean r5 = r5.zzr(r6)
            com.google.android.gms.measurement.internal.zzjx r6 = r28.zzu(r29)
            com.google.android.gms.measurement.internal.zzjw r7 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r6 = r6.zzr(r7)
            com.google.android.gms.internal.measurement.zzrd.zzb()
            com.google.android.gms.measurement.internal.zzam r7 = r28.zzi()
            com.google.android.gms.measurement.internal.zzgg r10 = com.google.android.gms.measurement.internal.zzgi.zzaL
            boolean r7 = r7.zzx(r9, r10)
            com.google.android.gms.measurement.internal.zzpi r10 = r8.zzl
            com.google.android.gms.measurement.internal.zzph r11 = r10.zza(r9)
            r12 = 0
        L2a9:
            if (r12 >= r2) goto L410
            java.lang.Object r13 = r0.get(r12)
            android.util.Pair r13 = (android.util.Pair) r13
            java.lang.Object r13 = r13.first
            com.google.android.gms.internal.measurement.zzhx r13 = (com.google.android.gms.internal.measurement.zzhx) r13
            com.google.android.gms.internal.measurement.zzlz r13 = r13.zzch()
            com.google.android.gms.internal.measurement.zzhw r13 = (com.google.android.gms.internal.measurement.zzhw) r13
            java.lang.Object r14 = r0.get(r12)
            android.util.Pair r14 = (android.util.Pair) r14
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            r3.add(r14)
            com.google.android.gms.measurement.internal.zzam r14 = r28.zzi()
            r14.zzj()
            r14 = 119002(0x1d0da, double:5.8795E-319)
            r13.zzaB(r14)
            r14 = r30
            r13.zzaA(r14)
            r20 = r0
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzn
            r0.zzaV()
            r0 = r2
            r2 = 0
            r13.zzau(r2)
            if (r4 != 0) goto L2eb
            r13.zzt()
        L2eb:
            if (r5 != 0) goto L2f3
            r13.zzz()
            r13.zzw()
        L2f3:
            if (r6 != 0) goto L2f8
            r13.zzq()
        L2f8:
            r8.zzN(r9, r13)
            if (r7 != 0) goto L300
            r13.zzA()
        L300:
            if (r6 != 0) goto L305
            r13.zzr()
        L305:
            java.lang.String r2 = r13.zzaL()
            boolean r21 = android.text.TextUtils.isEmpty(r2)
            if (r21 != 0) goto L324
            r21 = r0
            java.lang.String r0 = "00000000-0000-0000-0000-000000000000"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L31a
            goto L326
        L31a:
            r22 = r4
            r23 = r5
            r27 = r6
            r26 = r7
            goto L3bf
        L324:
            r21 = r0
        L326:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r2 = r13.zzaM()
            r0.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
            r22 = r4
            r23 = r5
            r4 = 0
            r5 = 0
            r24 = 0
            r25 = 0
        L33d:
            boolean r26 = r2.hasNext()
            if (r26 == 0) goto L3a9
            java.lang.Object r26 = r2.next()
            r27 = r6
            r6 = r26
            com.google.android.gms.internal.measurement.zzhm r6 = (com.google.android.gms.internal.measurement.zzhm) r6
            r26 = r7
            java.lang.String r7 = r6.zzh()
            java.lang.String r14 = "_fx"
            boolean r7 = r14.equals(r7)
            if (r7 == 0) goto L369
            r2.remove()
            r14 = r30
            r7 = r26
            r6 = r27
            r24 = 1
        L366:
            r25 = 1
            goto L33d
        L369:
            java.lang.String r7 = r6.zzh()
            java.lang.String r14 = "_f"
            boolean r7 = r14.equals(r7)
            if (r7 == 0) goto L3a2
            r28.zzA()
            java.lang.String r7 = "_pfo"
            com.google.android.gms.internal.measurement.zzhq r7 = com.google.android.gms.measurement.internal.zzqa.zzG(r6, r7)
            if (r7 == 0) goto L388
            long r14 = r7.zzd()
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
        L388:
            r28.zzA()
            java.lang.String r7 = "_uwa"
            com.google.android.gms.internal.measurement.zzhq r6 = com.google.android.gms.measurement.internal.zzqa.zzG(r6, r7)
            if (r6 == 0) goto L39b
            long r5 = r6.zzd()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
        L39b:
            r14 = r30
            r7 = r26
            r6 = r27
            goto L366
        L3a2:
            r14 = r30
            r7 = r26
            r6 = r27
            goto L33d
        L3a9:
            r27 = r6
            r26 = r7
            if (r24 == 0) goto L3b5
            r13.zzu()
            r13.zzj(r0)
        L3b5:
            if (r25 == 0) goto L3bf
            java.lang.String r0 = r13.zzaF()
            r2 = 1
            r8.zzar(r0, r2, r4, r5)
        L3bf:
            int r0 = r13.zzc()
            if (r0 != 0) goto L3c6
            goto L400
        L3c6:
            com.google.android.gms.measurement.internal.zzam r0 = r28.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaB
            boolean r0 = r0.zzx(r9, r2)
            if (r0 == 0) goto L3e7
            com.google.android.gms.internal.measurement.zzmd r0 = r13.zzba()
            com.google.android.gms.internal.measurement.zzhx r0 = (com.google.android.gms.internal.measurement.zzhx) r0
            byte[] r0 = r0.zzcd()
            com.google.android.gms.measurement.internal.zzqa r2 = r28.zzA()
            long r4 = r2.zzf(r0)
            r13.zzQ(r4)
        L3e7:
            com.google.android.gms.measurement.internal.zzam r0 = r28.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r4 = 0
            boolean r0 = r0.zzx(r4, r2)
            if (r0 == 0) goto L3fd
            com.google.android.gms.internal.measurement.zzim r0 = r11.zzb()
            if (r0 == 0) goto L3fd
            r13.zzaw(r0)
        L3fd:
            r1.zzc(r13)
        L400:
            int r12 = r12 + 1
            r0 = r20
            r2 = r21
            r4 = r22
            r5 = r23
            r7 = r26
            r6 = r27
            goto L2a9
        L410:
            int r0 = r1.zza()
            if (r0 != 0) goto L42a
            r8.zzal(r3)
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            java.util.List r7 = java.util.Collections.emptyList()
            r1 = r28
            r6 = r29
            r1.zzY(r2, r3, r4, r5, r6, r7)
            return
        L42a:
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zzba()
            com.google.android.gms.internal.measurement.zzhv r0 = (com.google.android.gms.internal.measurement.zzhv) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.google.android.gms.measurement.internal.zzam r2 = r28.zzi()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r5 = 0
            boolean r2 = r2.zzx(r5, r4)
            if (r2 == 0) goto L44c
            com.google.android.gms.measurement.internal.zzmf r2 = r11.zza()
            com.google.android.gms.measurement.internal.zzmf r4 = com.google.android.gms.measurement.internal.zzmf.zzd
            if (r2 != r4) goto L44c
            r2 = 1
            goto L44d
        L44c:
            r2 = 0
        L44d:
            com.google.android.gms.measurement.internal.zzmf r4 = r11.zza()
            com.google.android.gms.measurement.internal.zzmf r5 = com.google.android.gms.measurement.internal.zzmf.zzc
            if (r4 == r5) goto L45d
            if (r2 == 0) goto L459
            r2 = 1
            goto L45d
        L459:
            r5 = r30
            goto L66f
        L45d:
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zzba()
            com.google.android.gms.internal.measurement.zzhv r0 = (com.google.android.gms.internal.measurement.zzhv) r0
            java.util.List r0 = r0.zzh()
            java.util.Iterator r0 = r0.iterator()
        L46b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L486
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.measurement.zzhx r4 = (com.google.android.gms.internal.measurement.zzhx) r4
            boolean r4 = r4.zzbI()
            if (r4 == 0) goto L46b
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            goto L487
        L486:
            r0 = 0
        L487:
            com.google.android.gms.internal.measurement.zzmd r4 = r1.zzba()
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4
            com.google.android.gms.measurement.internal.zzil r5 = r28.zzaX()
            r5.zzg()
            r28.zzM()
            com.google.android.gms.internal.measurement.zzht r5 = com.google.android.gms.internal.measurement.zzhv.zzc(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L4a4
            r5.zzf(r0)
        L4a4:
            com.google.android.gms.measurement.internal.zzif r6 = r28.zzr()
            java.lang.String r6 = r6.zzm(r9)
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 != 0) goto L4b5
            r5.zzg(r6)
        L4b5:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r4 = r4.zzh()
            java.util.Iterator r4 = r4.iterator()
        L4c2:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L4df
            java.lang.Object r12 = r4.next()
            com.google.android.gms.internal.measurement.zzhx r12 = (com.google.android.gms.internal.measurement.zzhx) r12
            com.google.android.gms.internal.measurement.zzhw r12 = com.google.android.gms.internal.measurement.zzhx.zzA(r12)
            r12.zzt()
            com.google.android.gms.internal.measurement.zzmd r12 = r12.zzba()
            com.google.android.gms.internal.measurement.zzhx r12 = (com.google.android.gms.internal.measurement.zzhx) r12
            r6.add(r12)
            goto L4c2
        L4df:
            r5.zzd()
            r5.zzb(r6)
            com.google.android.gms.measurement.internal.zzam r4 = r28.zzi()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzaN
            r12 = 0
            boolean r4 = r4.zzx(r12, r6)
            if (r4 == 0) goto L50d
            com.google.android.gms.measurement.internal.zzhe r4 = r28.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto L503
            java.lang.String r12 = "null"
            goto L507
        L503:
            java.lang.String r12 = r5.zzi()
        L507:
            java.lang.String r13 = "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: "
            r4.zzb(r13, r12)
            goto L51a
        L50d:
            com.google.android.gms.measurement.internal.zzhe r4 = r28.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()
            java.lang.String r12 = "[sgtm] Processed MeasurementBatch for sGTM."
            r4.zza(r12)
        L51a:
            com.google.android.gms.internal.measurement.zzmd r4 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L5fb
            com.google.android.gms.measurement.internal.zzam r5 = r28.zzi()
            r12 = 0
            boolean r5 = r5.zzx(r12, r6)
            if (r5 == 0) goto L5fb
            com.google.android.gms.internal.measurement.zzmd r1 = r1.zzba()
            com.google.android.gms.internal.measurement.zzhv r1 = (com.google.android.gms.internal.measurement.zzhv) r1
            com.google.android.gms.measurement.internal.zzil r5 = r28.zzaX()
            r5.zzg()
            r28.zzM()
            com.google.android.gms.internal.measurement.zzht r5 = com.google.android.gms.internal.measurement.zzhv.zzb()
            com.google.android.gms.measurement.internal.zzhe r6 = r28.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()
            java.lang.String r12 = "[sgtm] Processing Google Signal, sgtmJoinId:"
            r6.zzb(r12, r0)
            r5.zzf(r0)
            java.util.List r0 = r1.zzh()
            java.util.Iterator r0 = r0.iterator()
        L55d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzhx r1 = (com.google.android.gms.internal.measurement.zzhx) r1
            com.google.android.gms.internal.measurement.zzhw r6 = com.google.android.gms.internal.measurement.zzhx.zzz()
            java.lang.String r12 = r1.zzN()
            r6.zzY(r12)
            int r1 = r1.zzd()
            r6.zzV(r1)
            r5.zzc(r6)
            goto L55d
        L57f:
            com.google.android.gms.internal.measurement.zzmd r0 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhv r0 = (com.google.android.gms.internal.measurement.zzhv) r0
            com.google.android.gms.measurement.internal.zzpv r1 = r10.zzg
            com.google.android.gms.measurement.internal.zzif r1 = r1.zzr()
            java.lang.String r1 = r1.zzm(r9)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L5db
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzr
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri r5 = android.net.Uri.parse(r5)
            android.net.Uri$Builder r6 = r5.buildUpon()
            java.lang.String r5 = r5.getAuthority()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.String r1 = "."
            r10.append(r1)
            r10.append(r5)
            java.lang.String r1 = r10.toString()
            r6.authority(r1)
            com.google.android.gms.measurement.internal.zzph r1 = new com.google.android.gms.measurement.internal.zzph
            android.net.Uri r5 = r6.build()
            java.lang.String r5 = r5.toString()
            if (r2 == 0) goto L5d0
            com.google.android.gms.measurement.internal.zzmf r6 = com.google.android.gms.measurement.internal.zzmf.zze
            goto L5d2
        L5d0:
            com.google.android.gms.measurement.internal.zzmf r6 = com.google.android.gms.measurement.internal.zzmf.zzb
        L5d2:
            java.util.Map r10 = java.util.Collections.emptyMap()
            r12 = 0
            r1.<init>(r5, r10, r6, r12)
            goto L5f4
        L5db:
            r12 = 0
            com.google.android.gms.measurement.internal.zzph r1 = new com.google.android.gms.measurement.internal.zzph
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzr
            java.lang.Object r5 = r5.zza(r12)
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L5eb
            com.google.android.gms.measurement.internal.zzmf r6 = com.google.android.gms.measurement.internal.zzmf.zze
            goto L5ed
        L5eb:
            com.google.android.gms.measurement.internal.zzmf r6 = com.google.android.gms.measurement.internal.zzmf.zzb
        L5ed:
            java.util.Map r10 = java.util.Collections.emptyMap()
            r1.<init>(r5, r10, r6, r12)
        L5f4:
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            r7.add(r0)
        L5fb:
            if (r2 == 0) goto L66c
            com.google.android.gms.internal.measurement.zzlz r0 = r4.zzch()
            com.google.android.gms.internal.measurement.zzht r0 = (com.google.android.gms.internal.measurement.zzht) r0
            r1 = 0
        L604:
            int r2 = r4.zza()
            if (r1 >= r2) goto L622
            com.google.android.gms.internal.measurement.zzhx r2 = r4.zze(r1)
            com.google.android.gms.internal.measurement.zzlz r2 = r2.zzch()
            com.google.android.gms.internal.measurement.zzhw r2 = (com.google.android.gms.internal.measurement.zzhw) r2
            r2.zzC()
            r5 = r30
            r2.zzO(r5)
            r0.zze(r1, r2)
            int r1 = r1 + 1
            goto L604
        L622:
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhv r0 = (com.google.android.gms.internal.measurement.zzhv) r0
            android.util.Pair r0 = android.util.Pair.create(r0, r11)
            r7.add(r0)
            r8.zzal(r3)
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r1 = r28
            r6 = r29
            r1.zzY(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r11.zzc()
            boolean r0 = r8.zzay(r9, r0)
            if (r0 == 0) goto L6d1
            com.google.android.gms.measurement.internal.zzhe r0 = r28.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "[sgtm] Sending sgtm batches available notification to app"
            r0.zzb(r1, r9)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            r0.setAction(r1)
            r0.setPackage(r9)
            com.google.android.gms.measurement.internal.zzio r1 = r8.zzn
            android.content.Context r1 = r1.zzaT()
            zzaK(r1, r0)
            return
        L66c:
            r5 = r30
            r0 = r4
        L66f:
            com.google.android.gms.measurement.internal.zzam r1 = r28.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaO
            r4 = 0
            boolean r1 = r1.zzx(r4, r2)
            if (r1 == 0) goto L686
            com.google.android.gms.measurement.internal.zzhk r1 = r28.zzp()
            boolean r1 = r1.zzd()
            if (r1 == 0) goto L6d1
        L686:
            com.google.android.gms.measurement.internal.zzhe r1 = r28.zzaW()
            java.lang.String r1 = r1.zzr()
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L69e
            com.google.android.gms.measurement.internal.zzqa r1 = r28.zzA()
            java.lang.String r10 = r1.zzq(r0)
            goto L69f
        L69e:
            r10 = r4
        L69f:
            r28.zzA()
            byte[] r1 = r0.zzcd()
            r8.zzal(r3)
            com.google.android.gms.measurement.internal.zzoa r2 = r8.zzk
            com.google.android.gms.measurement.internal.zzhp r2 = r2.zze
            r2.zzb(r5)
            com.google.android.gms.measurement.internal.zzhe r2 = r28.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            r2.zzd(r3, r9, r1, r10)
            r1 = 1
            r8.zzv = r1
            com.google.android.gms.measurement.internal.zzhk r1 = r28.zzp()
            com.google.android.gms.measurement.internal.zzpl r2 = new com.google.android.gms.measurement.internal.zzpl
            r2.<init>(r8, r9, r7)
            r1.zzc(r9, r11, r0, r2)
        L6d1:
            return
        L6d2:
            r0 = move-exception
            r10 = r11
        L6d4:
            if (r10 == 0) goto L6d9
            r10.close()
        L6d9:
            throw r0
    }

    final void zzav(java.lang.String r9) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r8.zzaX()
            r0.zzg()
            r8.zzM()
            r0 = 1
            r8.zzw = r0
            r1 = 0
            com.google.android.gms.measurement.internal.zzio r2 = r8.zzn     // Catch: java.lang.Throwable -> Lec
            r2.zzaV()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzny r2 = r2.zzu()     // Catch: java.lang.Throwable -> Lec
            java.lang.Boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> Lec
            if (r2 != 0) goto L2c
            com.google.android.gms.measurement.internal.zzhe r9 = r8.zzaW()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzk()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r0 = "Upload data called on the client side before use of service was decided"
            r9.zza(r0)     // Catch: java.lang.Throwable -> Lec
            goto Le6
        L2c:
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lec
            if (r2 == 0) goto L41
            com.google.android.gms.measurement.internal.zzhe r9 = r8.zzaW()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r0 = "Upload called in the client side when service should be used"
            r9.zza(r0)     // Catch: java.lang.Throwable -> Lec
            goto Le6
        L41:
            long r2 = r8.zza     // Catch: java.lang.Throwable -> Lec
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4e
            r8.zzaL()     // Catch: java.lang.Throwable -> Lec
            goto Le6
        L4e:
            com.google.android.gms.measurement.internal.zzhk r2 = r8.zzp()     // Catch: java.lang.Throwable -> Lec
            boolean r2 = r2.zzd()     // Catch: java.lang.Throwable -> Lec
            if (r2 != 0) goto L6a
            com.google.android.gms.measurement.internal.zzhe r9 = r8.zzaW()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzj()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r0 = "Network not connected, ignoring upload request"
            r9.zza(r0)     // Catch: java.lang.Throwable -> Lec
            r8.zzaL()     // Catch: java.lang.Throwable -> Lec
            goto Le6
        L6a:
            com.google.android.gms.measurement.internal.zzaw r2 = r8.zzj()     // Catch: java.lang.Throwable -> Lec
            boolean r2 = r2.zzY(r9)     // Catch: java.lang.Throwable -> Lec
            if (r2 != 0) goto L82
            com.google.android.gms.measurement.internal.zzhe r0 = r8.zzaW()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r2 = "[sgtm] Upload queue has no batches for appId"
            r0.zzb(r2, r9)     // Catch: java.lang.Throwable -> Lec
            goto Le6
        L82:
            com.google.android.gms.measurement.internal.zzaw r2 = r8.zzj()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzpz r2 = r2.zzw(r9)     // Catch: java.lang.Throwable -> Lec
            if (r2 == 0) goto Le6
            com.google.android.gms.internal.measurement.zzhv r3 = r2.zzg()     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto Le6
            com.google.android.gms.measurement.internal.zzhe r4 = r8.zzaW()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r5 = "[sgtm] Uploading data from upload queue. appId, type, url"
            com.google.android.gms.measurement.internal.zzmf r6 = r2.zzd()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r7 = r2.zzh()     // Catch: java.lang.Throwable -> Lec
            r4.zzd(r5, r9, r6, r7)     // Catch: java.lang.Throwable -> Lec
            byte[] r4 = r3.zzcd()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzhe r5 = r8.zzaW()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r5 = r5.zzr()     // Catch: java.lang.Throwable -> Lec
            r6 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch: java.lang.Throwable -> Lec
            if (r5 == 0) goto Ld4
            com.google.android.gms.measurement.internal.zzqa r5 = r8.zzA()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r5 = r5.zzq(r3)     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzhe r6 = r8.zzaW()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r7 = "[sgtm] Uploading data from upload queue. appId, uncompressed size, data"
            int r4 = r4.length     // Catch: java.lang.Throwable -> Lec
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lec
            r6.zzd(r7, r9, r4, r5)     // Catch: java.lang.Throwable -> Lec
        Ld4:
            r8.zzv = r0     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzhk r0 = r8.zzp()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzph r4 = r2.zzf()     // Catch: java.lang.Throwable -> Lec
            com.google.android.gms.measurement.internal.zzpm r5 = new com.google.android.gms.measurement.internal.zzpm     // Catch: java.lang.Throwable -> Lec
            r5.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> Lec
            r0.zzc(r9, r4, r3, r5)     // Catch: java.lang.Throwable -> Lec
        Le6:
            r8.zzw = r1
            r8.zzaH()
            return
        Lec:
            r9 = move-exception
            r8.zzw = r1
            r8.zzaH()
            throw r9
    }

    final void zzaw(java.lang.String r10, com.google.android.gms.internal.measurement.zzhp r11, android.os.Bundle r12, java.lang.String r13) {
            r9 = this;
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r2 = "_sc"
            java.lang.String r3 = "_si"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r0 = com.google.android.gms.common.util.CollectionUtils.listOf(r0)
            java.lang.String r1 = r11.zzl()
            boolean r1 = com.google.android.gms.measurement.internal.zzqf.zzap(r1)
            r2 = 1
            if (r1 != 0) goto L2b
            boolean r10 = com.google.android.gms.measurement.internal.zzqf.zzap(r10)
            if (r10 == 0) goto L22
            goto L2b
        L22:
            com.google.android.gms.measurement.internal.zzam r10 = r9.zzi()
            int r10 = r10.zzc(r13, r2)
            goto L33
        L2b:
            com.google.android.gms.measurement.internal.zzam r10 = r9.zzi()
            int r10 = r10.zzd(r13, r2)
        L33:
            long r3 = (long) r10
            java.lang.String r10 = r11.zzm()
            r1 = 0
            java.lang.String r5 = r11.zzm()
            int r5 = r5.length()
            int r10 = r10.codePointCount(r1, r5)
            long r5 = (long) r10
            com.google.android.gms.measurement.internal.zzqf r10 = r9.zzB()
            java.lang.String r1 = r11.zzl()
            r9.zzi()
            r7 = 40
            java.lang.String r10 = r10.zzG(r1, r7, r2)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto Lc0
            java.lang.String r1 = r11.zzl()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lc0
            java.lang.String r0 = r11.zzl()
            java.lang.String r1 = "_ev"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L89
            com.google.android.gms.measurement.internal.zzqf r10 = r9.zzB()
            java.lang.String r11 = r11.zzm()
            com.google.android.gms.measurement.internal.zzam r0 = r9.zzi()
            int r13 = r0.zzd(r13, r2)
            java.lang.String r10 = r10.zzG(r11, r13, r2)
            r12.putString(r1, r10)
            return
        L89:
            com.google.android.gms.measurement.internal.zzhe r13 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzl()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "Param value is too long; discarded. Name, value length"
            r13.zzc(r2, r10, r0)
            java.lang.String r13 = "_err"
            long r2 = r12.getLong(r13)
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto Lb9
            r2 = 4
            r12.putLong(r13, r2)
            java.lang.String r13 = r12.getString(r1)
            if (r13 != 0) goto Lb9
            r12.putString(r1, r10)
            java.lang.String r10 = "_el"
            r12.putLong(r10, r5)
        Lb9:
            java.lang.String r10 = r11.zzl()
            r12.remove(r10)
        Lc0:
            return
    }

    final void zzax(com.google.android.gms.measurement.internal.zzbh r48, com.google.android.gms.measurement.internal.zzr r49) {
            r47 = this;
            r1 = r47
            r2 = r49
            java.lang.String r3 = "metadata_fingerprint"
            java.lang.String r4 = "app_id"
            java.lang.String r5 = "_fx"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r49)
            java.lang.String r15 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            long r25 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.zzil r8 = r47.zzaX()
            r8.zzg()
            r47.zzM()
            r47.zzA()
            boolean r8 = com.google.android.gms.measurement.internal.zzqa.zzE(r48, r49)
            if (r8 != 0) goto L2f
            goto Ld4
        L2f:
            boolean r8 = r2.zzh
            if (r8 != 0) goto L37
            r1.zzg(r2)
            return
        L37:
            com.google.android.gms.measurement.internal.zzif r8 = r47.zzr()
            r9 = r48
            java.lang.String r13 = r9.zza
            boolean r8 = r8.zzx(r15, r13)
            java.lang.String r14 = "_err"
            r12 = 0
            if (r8 == 0) goto Ld5
            com.google.android.gms.measurement.internal.zzhe r2 = r47.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r15)
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzn
            com.google.android.gms.measurement.internal.zzgx r4 = r4.zzj()
            java.lang.String r4 = r4.zzd(r13)
            java.lang.String r5 = "Dropping blocked event. appId"
            r2.zzc(r5, r3, r4)
            com.google.android.gms.measurement.internal.zzif r2 = r47.zzr()
            boolean r2 = r2.zzt(r15)
            if (r2 != 0) goto L8e
            com.google.android.gms.measurement.internal.zzif r2 = r47.zzr()
            boolean r2 = r2.zzy(r15)
            if (r2 == 0) goto L78
            goto L8e
        L78:
            boolean r2 = r14.equals(r13)
            if (r2 != 0) goto Ld4
            com.google.android.gms.measurement.internal.zzqf r8 = r47.zzB()
            com.google.android.gms.measurement.internal.zzqe r9 = r1.zzK
            r11 = 11
            r14 = 0
            java.lang.String r12 = "_ev"
            r10 = r15
            r8.zzR(r9, r10, r11, r12, r13, r14)
            return
        L8e:
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()
            com.google.android.gms.measurement.internal.zzh r2 = r2.zzl(r15)
            if (r2 == 0) goto Ld4
            long r3 = r2.zzp()
            long r5 = r2.zzg()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.common.util.Clock r5 = r47.zzaU()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r47.zzi()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzM
            java.lang.Object r5 = r5.zza(r12)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto Ld4
            com.google.android.gms.measurement.internal.zzhe r3 = r47.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzd()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.zza(r4)
            r1.zzO(r2)
        Ld4:
            return
        Ld5:
            com.google.android.gms.measurement.internal.zzhf r8 = com.google.android.gms.measurement.internal.zzhf.zzb(r48)
            com.google.android.gms.measurement.internal.zzqf r9 = r47.zzB()
            com.google.android.gms.measurement.internal.zzam r10 = r47.zzi()
            int r10 = r10.zzf(r15)
            r9.zzQ(r8, r10)
            com.google.android.gms.measurement.internal.zzam r9 = r47.zzi()
            com.google.android.gms.measurement.internal.zzgg r10 = com.google.android.gms.measurement.internal.zzgi.zzaf
            r11 = 10
            r13 = 35
            int r9 = r9.zzi(r15, r10, r11, r13)
            android.os.Bundle r10 = r8.zzd
            java.util.TreeSet r11 = new java.util.TreeSet
            java.util.Set r13 = r10.keySet()
            r11.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L105:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L126
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r12 = "items"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L124
            com.google.android.gms.measurement.internal.zzqf r12 = r47.zzB()
            android.os.Parcelable[] r13 = r10.getParcelableArray(r13)
            r12.zzP(r13, r9)
        L124:
            r12 = 0
            goto L105
        L126:
            com.google.android.gms.measurement.internal.zzbh r12 = r8.zza()
            com.google.android.gms.measurement.internal.zzhe r8 = r47.zzaW()
            java.lang.String r8 = r8.zzr()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L150
            com.google.android.gms.measurement.internal.zzhe r8 = r47.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzj()
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzn
            com.google.android.gms.measurement.internal.zzgx r9 = r9.zzj()
            java.lang.String r9 = r9.zzc(r12)
            java.lang.String r10 = "Logging event"
            r8.zzb(r10, r9)
        L150:
            com.google.android.gms.measurement.internal.zzaw r8 = r47.zzj()
            r8.zzH()
            r1.zzg(r2)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = "ecommerce_purchase"
            java.lang.String r9 = r12.zza     // Catch: java.lang.Throwable -> Lbc2
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = "refund"
            r27 = r3
            if (r8 != 0) goto L179
            java.lang.String r8 = "purchase"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 != 0) goto L179
            boolean r8 = r10.equals(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 == 0) goto L177
            goto L179
        L177:
            r8 = 0
            goto L17a
        L179:
            r8 = 1
        L17a:
            java.lang.String r11 = "_iap"
            boolean r11 = r11.equals(r9)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r3 = "value"
            if (r11 != 0) goto L197
            if (r8 == 0) goto L188
            r8 = 1
            goto L197
        L188:
            r21 = r3
            r28 = r4
            r29 = r5
        L18e:
            r30 = r6
            r6 = r12
            r31 = r14
            r3 = 2
            r5 = 1
            goto L309
        L197:
            com.google.android.gms.measurement.internal.zzbf r11 = r12.zzb     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r13 = "currency"
            java.lang.String r13 = r11.zzg(r13)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 == 0) goto L200
            java.lang.Double r8 = r11.zzd(r3)     // Catch: java.lang.Throwable -> Lbc2
            double r18 = r8.doubleValue()     // Catch: java.lang.Throwable -> Lbc2
            r20 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r18 = r18 * r20
            r22 = 0
            int r8 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r8 != 0) goto L1c6
            java.lang.Long r8 = r11.zze(r3)     // Catch: java.lang.Throwable -> Lbc2
            r28 = r4
            r29 = r5
            long r4 = r8.longValue()     // Catch: java.lang.Throwable -> Lbc2
            double r4 = (double) r4     // Catch: java.lang.Throwable -> Lbc2
            double r18 = r4 * r20
            goto L1ca
        L1c6:
            r28 = r4
            r29 = r5
        L1ca:
            r4 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r8 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r8 > 0) goto L1e2
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r8 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r8 < 0) goto L1e2
            long r4 = java.lang.Math.round(r18)     // Catch: java.lang.Throwable -> Lbc2
            boolean r8 = r10.equals(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 == 0) goto L20c
            long r4 = -r4
            goto L20c
        L1e2:
            com.google.android.gms.measurement.internal.zzhe r2 = r47.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r15)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Double r5 = java.lang.Double.valueOf(r18)     // Catch: java.lang.Throwable -> Lbc2
            r2.zzc(r3, r4, r5)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            r2.zzS()     // Catch: java.lang.Throwable -> Lbc2
            goto L5b7
        L200:
            r28 = r4
            r29 = r5
            java.lang.Long r4 = r11.zze(r3)     // Catch: java.lang.Throwable -> Lbc2
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> Lbc2
        L20c:
            boolean r8 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 != 0) goto L305
            java.util.Locale r8 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = r13.toUpperCase(r8)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r8.matches(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r9 == 0) goto L305
            java.lang.String r9 = "_ltv_"
            java.lang.String r11 = r9.concat(r8)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzaw r8 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqd r8 = r8.zzy(r15, r11)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 == 0) goto L263
            java.lang.Object r8 = r8.zze     // Catch: java.lang.Throwable -> Lbc2
            boolean r9 = r8 instanceof java.lang.Long     // Catch: java.lang.Throwable -> Lbc2
            if (r9 != 0) goto L237
            goto L263
        L237:
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> Lbc2
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqd r18 = new com.google.android.gms.measurement.internal.zzqd     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = r12.zzc     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.common.util.Clock r13 = r47.zzaU()     // Catch: java.lang.Throwable -> Lbc2
            long r19 = r13.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbc2
            long r8 = r8 + r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lbc2
            r8 = r18
            r9 = r15
            r5 = 1
            r21 = r3
            r30 = r6
            r6 = r12
            r3 = 2
            r12 = r19
            r31 = r14
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> Lbc2
        L260:
            r4 = r18
            goto L2cc
        L263:
            r21 = r3
            r30 = r6
            r6 = r12
            r31 = r14
            r3 = 2
            r14 = 1
            com.google.android.gms.measurement.internal.zzaw r8 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzam r9 = r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgg r10 = com.google.android.gms.measurement.internal.zzgi.zzS     // Catch: java.lang.Throwable -> Lbc2
            int r9 = r9.zzh(r15, r10)     // Catch: java.lang.Throwable -> Lbc2
            int r9 = r9 + (-1)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)     // Catch: java.lang.Throwable -> Lbc2
            r8.zzg()     // Catch: java.lang.Throwable -> Lbc2
            r8.zzav()     // Catch: java.lang.Throwable -> Lbc2
            android.database.sqlite.SQLiteDatabase r10 = r8.zzj()     // Catch: android.database.sqlite.SQLiteException -> L29e java.lang.Throwable -> Lbc2
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);"
            r13 = 3
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch: android.database.sqlite.SQLiteException -> L29e java.lang.Throwable -> Lbc2
            r16 = 0
            r13[r16] = r15     // Catch: android.database.sqlite.SQLiteException -> L29e java.lang.Throwable -> Lbc2
            r13[r14] = r15     // Catch: android.database.sqlite.SQLiteException -> L29e java.lang.Throwable -> Lbc2
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: android.database.sqlite.SQLiteException -> L29e java.lang.Throwable -> Lbc2
            r13[r3] = r9     // Catch: android.database.sqlite.SQLiteException -> L29e java.lang.Throwable -> Lbc2
            r10.execSQL(r12, r13)     // Catch: android.database.sqlite.SQLiteException -> L29e java.lang.Throwable -> Lbc2
            goto L2b3
        L29e:
            r0 = move-exception
            r9 = r0
            com.google.android.gms.measurement.internal.zzio r8 = r8.zzu     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = "Error pruning currencies. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzhe.zzn(r15)     // Catch: java.lang.Throwable -> Lbc2
            r8.zzc(r10, r12, r9)     // Catch: java.lang.Throwable -> Lbc2
        L2b3:
            com.google.android.gms.measurement.internal.zzqd r18 = new com.google.android.gms.measurement.internal.zzqd     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = r6.zzc     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.common.util.Clock r8 = r47.zzaU()     // Catch: java.lang.Throwable -> Lbc2
            long r12 = r8.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Lbc2
            r8 = r18
            r9 = r15
            r5 = 1
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> Lbc2
            goto L260
        L2cc:
            com.google.android.gms.measurement.internal.zzaw r8 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            boolean r8 = r8.zzai(r4)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 != 0) goto L309
            com.google.android.gms.measurement.internal.zzhe r8 = r47.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzhe.zzn(r15)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzio r11 = r1.zzn     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgx r11 = r11.zzj()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r12 = r4.zzc     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r11 = r11.zzf(r12)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r4 = r4.zze     // Catch: java.lang.Throwable -> Lbc2
            r8.zzd(r9, r10, r11, r4)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqf r8 = r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqe r9 = r1.zzK     // Catch: java.lang.Throwable -> Lbc2
            r11 = 9
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r15
            r8.zzR(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lbc2
            goto L309
        L305:
            r21 = r3
            goto L18e
        L309:
            java.lang.String r4 = r6.zza     // Catch: java.lang.Throwable -> Lbc2
            boolean r22 = com.google.android.gms.measurement.internal.zzqf.zzaq(r4)     // Catch: java.lang.Throwable -> Lbc2
            r8 = r31
            boolean r23 = r8.equals(r4)     // Catch: java.lang.Throwable -> Lbc2
            r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbf r14 = r6.zzb     // Catch: java.lang.Throwable -> Lbc2
            if (r14 != 0) goto L31f
            r9 = 0
            goto L33e
        L31f:
            com.google.android.gms.measurement.internal.zzbe r8 = new com.google.android.gms.measurement.internal.zzbe     // Catch: java.lang.Throwable -> Lbc2
            r8.<init>(r14)     // Catch: java.lang.Throwable -> Lbc2
            r9 = 0
        L326:
            boolean r11 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbc2
            if (r11 == 0) goto L33e
            java.lang.String r11 = r8.zza()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r11 = r14.zzf(r11)     // Catch: java.lang.Throwable -> Lbc2
            boolean r12 = r11 instanceof android.os.Parcelable[]     // Catch: java.lang.Throwable -> Lbc2
            if (r12 == 0) goto L326
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11     // Catch: java.lang.Throwable -> Lbc2
            int r11 = r11.length     // Catch: java.lang.Throwable -> Lbc2
            long r11 = (long) r11     // Catch: java.lang.Throwable -> Lbc2
            long r9 = r9 + r11
            goto L326
        L33e:
            r12 = 1
            long r18 = r9 + r12
            com.google.android.gms.measurement.internal.zzaw r8 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            long r9 = r47.zza()     // Catch: java.lang.Throwable -> Lbc2
            r20 = 1
            r24 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r11 = r15
            r34 = r4
            r35 = r6
            r5 = r12
            r3 = 0
            r12 = r18
            r36 = r14
            r14 = r20
            r37 = r15
            r15 = r22
            r16 = r24
            r17 = r23
            r18 = r31
            r19 = r32
            r20 = r33
            com.google.android.gms.measurement.internal.zzas r8 = r8.zzp(r9, r11, r12, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Lbc2
            long r9 = r8.zzb     // Catch: java.lang.Throwable -> Lbc2
            r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            long r11 = com.google.android.gms.measurement.internal.zzam.zzH()     // Catch: java.lang.Throwable -> Lbc2
            long r9 = r9 - r11
            r11 = 1000(0x3e8, double:4.94E-321)
            int r13 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r13 <= 0) goto L3a9
            long r9 = r9 % r11
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 != 0) goto L3a0
            com.google.android.gms.measurement.internal.zzhe r2 = r47.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r37)     // Catch: java.lang.Throwable -> Lbc2
            long r5 = r8.zzb     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lbc2
            r2.zzc(r3, r4, r5)     // Catch: java.lang.Throwable -> Lbc2
        L3a0:
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            r2.zzS()     // Catch: java.lang.Throwable -> Lbc2
            goto L5b7
        L3a9:
            if (r22 == 0) goto L3fc
            long r9 = r8.zza     // Catch: java.lang.Throwable -> Lbc2
            r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgg r13 = com.google.android.gms.measurement.internal.zzgi.zzm     // Catch: java.lang.Throwable -> Lbc2
            r14 = 0
            java.lang.Object r13 = r13.zza(r14)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch: java.lang.Throwable -> Lbc2
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> Lbc2
            long r13 = (long) r13     // Catch: java.lang.Throwable -> Lbc2
            long r9 = r9 - r13
            int r13 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r13 <= 0) goto L3fc
            long r9 = r9 % r11
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 != 0) goto L3df
            com.google.android.gms.measurement.internal.zzhe r2 = r47.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r3 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r37)     // Catch: java.lang.Throwable -> Lbc2
            long r5 = r8.zza     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lbc2
            r2.zzc(r3, r4, r5)     // Catch: java.lang.Throwable -> Lbc2
        L3df:
            com.google.android.gms.measurement.internal.zzqf r8 = r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqe r9 = r1.zzK     // Catch: java.lang.Throwable -> Lbc2
            r11 = 16
            java.lang.String r12 = "_ev"
            r10 = r35
            java.lang.String r13 = r10.zza     // Catch: java.lang.Throwable -> Lbc2
            r14 = 0
            r10 = r37
            r8.zzR(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            r2.zzS()     // Catch: java.lang.Throwable -> Lbc2
            goto L5b7
        L3fc:
            r10 = r35
            r9 = 1000000(0xf4240, float:1.401298E-39)
            if (r23 == 0) goto L444
            long r11 = r8.zzd     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzam r13 = r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r14 = r2.zza     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgg r15 = com.google.android.gms.measurement.internal.zzgi.zzl     // Catch: java.lang.Throwable -> Lbc2
            int r13 = r13.zzh(r14, r15)     // Catch: java.lang.Throwable -> Lbc2
            int r13 = java.lang.Math.min(r9, r13)     // Catch: java.lang.Throwable -> Lbc2
            r14 = 0
            int r13 = java.lang.Math.max(r14, r13)     // Catch: java.lang.Throwable -> Lbc2
            long r13 = (long) r13     // Catch: java.lang.Throwable -> Lbc2
            long r11 = r11 - r13
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 <= 0) goto L444
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 != 0) goto L43b
            com.google.android.gms.measurement.internal.zzhe r2 = r47.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r37)     // Catch: java.lang.Throwable -> Lbc2
            long r5 = r8.zzd     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lbc2
            r2.zzc(r3, r4, r5)     // Catch: java.lang.Throwable -> Lbc2
        L43b:
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            r2.zzS()     // Catch: java.lang.Throwable -> Lbc2
            goto L5b7
        L444:
            android.os.Bundle r15 = r36.zzc()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqf r8 = r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r11 = "_o"
            java.lang.String r12 = r10.zzc     // Catch: java.lang.Throwable -> Lbc2
            r8.zzS(r15, r11, r12)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqf r8 = r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r11 = r2.zzD     // Catch: java.lang.Throwable -> Lbc2
            r13 = r37
            boolean r8 = r8.zzak(r13, r11)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r14 = "_r"
            if (r8 == 0) goto L477
            com.google.android.gms.measurement.internal.zzqf r8 = r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r11 = "_dbg"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lbc2
            r8.zzS(r15, r11, r3)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqf r4 = r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            r4.zzS(r15, r14, r3)     // Catch: java.lang.Throwable -> Lbc2
        L477:
            java.lang.String r3 = "_s"
            r4 = r34
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Lbc2
            if (r3 == 0) goto L49a
            com.google.android.gms.measurement.internal.zzaw r3 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = r2.zza     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqd r3 = r3.zzy(r8, r7)     // Catch: java.lang.Throwable -> Lbc2
            if (r3 == 0) goto L49a
            java.lang.Object r3 = r3.zze     // Catch: java.lang.Throwable -> Lbc2
            boolean r8 = r3 instanceof java.lang.Long     // Catch: java.lang.Throwable -> Lbc2
            if (r8 == 0) goto L49a
            com.google.android.gms.measurement.internal.zzqf r8 = r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            r8.zzS(r15, r7, r3)     // Catch: java.lang.Throwable -> Lbc2
        L49a:
            com.google.android.gms.measurement.internal.zzam r3 = r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgg r7 = com.google.android.gms.measurement.internal.zzgi.zzbg     // Catch: java.lang.Throwable -> Lbc2
            r8 = 0
            boolean r3 = r3.zzx(r8, r7)     // Catch: java.lang.Throwable -> Lbc2
            if (r3 == 0) goto L4cf
            java.lang.String r3 = "am"
            boolean r3 = java.util.Objects.equals(r12, r3)     // Catch: java.lang.Throwable -> Lbc2
            if (r3 == 0) goto L4cf
            java.lang.String r3 = "_ai"
            boolean r3 = java.util.Objects.equals(r4, r3)     // Catch: java.lang.Throwable -> Lbc2
            if (r3 == 0) goto L4cf
            r3 = r21
            java.lang.Object r4 = r15.get(r3)     // Catch: java.lang.Throwable -> Lbc2
            if (r4 == 0) goto L4cf
            boolean r7 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lbc2
            if (r7 == 0) goto L4cf
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L4cf java.lang.Throwable -> Lbc2
            double r7 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.NumberFormatException -> L4cf java.lang.Throwable -> Lbc2
            r15.remove(r3)     // Catch: java.lang.NumberFormatException -> L4cf java.lang.Throwable -> Lbc2
            r15.putDouble(r3, r7)     // Catch: java.lang.NumberFormatException -> L4cf java.lang.Throwable -> Lbc2
        L4cf:
            com.google.android.gms.measurement.internal.zzaw r3 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)     // Catch: java.lang.Throwable -> Lbc2
            r3.zzg()     // Catch: java.lang.Throwable -> Lbc2
            r3.zzav()     // Catch: java.lang.Throwable -> Lbc2
            android.database.sqlite.SQLiteDatabase r4 = r3.zzj()     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzio r7 = r3.zzu     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzam r7 = r7.zzf()     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgg r8 = com.google.android.gms.measurement.internal.zzgi.zzp     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            int r7 = r7.zzh(r13, r8)     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            int r7 = java.lang.Math.min(r9, r7)     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            java.lang.String r9 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            r11[r8] = r13     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            r8 = 1
            r11[r8] = r7     // Catch: android.database.sqlite.SQLiteException -> L50d java.lang.Throwable -> Lbc2
            r7 = r30
            int r3 = r4.delete(r7, r9, r11)     // Catch: android.database.sqlite.SQLiteException -> L50b java.lang.Throwable -> Lbc2
            long r3 = (long) r3
            goto L526
        L50b:
            r0 = move-exception
            goto L510
        L50d:
            r0 = move-exception
            r7 = r30
        L510:
            r4 = r0
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzhe.zzn(r13)     // Catch: java.lang.Throwable -> Lbc2
            r3.zzc(r8, r9, r4)     // Catch: java.lang.Throwable -> Lbc2
            r3 = 0
        L526:
            r8 = 0
            int r11 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r11 <= 0) goto L541
            com.google.android.gms.measurement.internal.zzhe r8 = r47.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzk()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzhe.zzn(r13)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lbc2
            r8.zzc(r9, r11, r3)     // Catch: java.lang.Throwable -> Lbc2
        L541:
            com.google.android.gms.measurement.internal.zzbc r3 = new com.google.android.gms.measurement.internal.zzbc     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzn     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r11 = r10.zzc     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r12 = r10.zza     // Catch: java.lang.Throwable -> Lbc2
            long r9 = r10.zzd     // Catch: java.lang.Throwable -> Lbc2
            r16 = 0
            r8 = r3
            r18 = r9
            r9 = r4
            r10 = r11
            r11 = r13
            r5 = r13
            r6 = r14
            r13 = r18
            r18 = r15
            r15 = r16
            r17 = r18
            r8.<init>(r9, r10, r11, r12, r13, r15, r17)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzaw r8 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = r3.zzb     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbd r8 = r8.zzs(r5, r10)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 != 0) goto L5db
            com.google.android.gms.measurement.internal.zzaw r8 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            long r8 = r8.zzi(r5)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzam r11 = r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            int r11 = r11.zzb(r5)     // Catch: java.lang.Throwable -> Lbc2
            long r11 = (long) r11     // Catch: java.lang.Throwable -> Lbc2
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 < 0) goto L5bf
            if (r22 == 0) goto L5bf
            com.google.android.gms.measurement.internal.zzhe r2 = r47.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgx r4 = r4.zzj()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r4 = r4.zzd(r10)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzam r7 = r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            int r7 = r7.zzb(r5)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lbc2
            r2.zzd(r3, r6, r4, r7)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqf r8 = r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqe r9 = r1.zzK     // Catch: java.lang.Throwable -> Lbc2
            r11 = 8
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r5
            r8.zzR(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lbc2
        L5b7:
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()
            r2.zzL()
            return
        L5bf:
            com.google.android.gms.measurement.internal.zzbd r4 = new com.google.android.gms.measurement.internal.zzbd     // Catch: java.lang.Throwable -> Lbc2
            long r8 = r3.zzd     // Catch: java.lang.Throwable -> Lbc2
            r11 = 0
            r13 = 0
            r15 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r17 = r8
            r8 = r4
            r9 = r5
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> Lbc2
            goto L5e7
        L5db:
            long r9 = r8.zzf     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbc r3 = r3.zza(r4, r9)     // Catch: java.lang.Throwable -> Lbc2
            long r4 = r3.zzd     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbd r4 = r8.zzc(r4)     // Catch: java.lang.Throwable -> Lbc2
        L5e7:
            com.google.android.gms.measurement.internal.zzaw r5 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            r5.zzV(r4)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzil r4 = r47.zzaX()     // Catch: java.lang.Throwable -> Lbc2
            r4.zzg()     // Catch: java.lang.Throwable -> Lbc2
            r47.zzM()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r49)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r4 = r3.zza     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r5 = r2.zza     // Catch: java.lang.Throwable -> Lbc2
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.internal.measurement.zzhw r4 = com.google.android.gms.internal.measurement.zzhx.zzz()     // Catch: java.lang.Throwable -> Lbc2
            r8 = 1
            r4.zzar(r8)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = "android"
            r4.zzan(r9)     // Catch: java.lang.Throwable -> Lbc2
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lbc2
            if (r9 != 0) goto L622
            r4.zzI(r5)     // Catch: java.lang.Throwable -> Lbc2
        L622:
            java.lang.String r9 = r2.zzd     // Catch: java.lang.Throwable -> Lbc2
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r10 != 0) goto L62d
            r4.zzK(r9)     // Catch: java.lang.Throwable -> Lbc2
        L62d:
            java.lang.String r9 = r2.zzc     // Catch: java.lang.Throwable -> Lbc2
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r10 != 0) goto L638
            r4.zzL(r9)     // Catch: java.lang.Throwable -> Lbc2
        L638:
            java.lang.String r9 = r2.zzw     // Catch: java.lang.Throwable -> Lbc2
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r10 != 0) goto L643
            r4.zzav(r9)     // Catch: java.lang.Throwable -> Lbc2
        L643:
            long r9 = r2.zzj     // Catch: java.lang.Throwable -> Lbc2
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L650
            int r10 = (int) r9     // Catch: java.lang.Throwable -> Lbc2
            r4.zzM(r10)     // Catch: java.lang.Throwable -> Lbc2
        L650:
            long r9 = r2.zze     // Catch: java.lang.Throwable -> Lbc2
            r4.zzai(r9)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = r2.zzb     // Catch: java.lang.Throwable -> Lbc2
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r10 != 0) goto L660
            r4.zzah(r9)     // Catch: java.lang.Throwable -> Lbc2
        L660:
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzjx r9 = r1.zzu(r9)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = r2.zzu     // Catch: java.lang.Throwable -> Lbc2
            r11 = 100
            com.google.android.gms.measurement.internal.zzjx r10 = com.google.android.gms.measurement.internal.zzjx.zzk(r10, r11)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzjx r9 = r9.zzl(r10)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = r9.zzp()     // Catch: java.lang.Throwable -> Lbc2
            r4.zzT(r10)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = r4.zzaJ()     // Catch: java.lang.Throwable -> Lbc2
            boolean r10 = r10.isEmpty()     // Catch: java.lang.Throwable -> Lbc2
            if (r10 == 0) goto L692
            java.lang.String r10 = r2.zzp     // Catch: java.lang.Throwable -> Lbc2
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lbc2
            if (r12 != 0) goto L692
            r4.zzH(r10)     // Catch: java.lang.Throwable -> Lbc2
        L692:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzam r10 = r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgg r12 = com.google.android.gms.measurement.internal.zzgi.zzaV     // Catch: java.lang.Throwable -> Lbc2
            boolean r10 = r10.zzx(r5, r12)     // Catch: java.lang.Throwable -> Lbc2
            if (r10 == 0) goto L745
            com.google.android.gms.measurement.internal.zzqf r10 = r47.zzB()     // Catch: java.lang.Throwable -> Lbc2
            boolean r5 = r10.zzab(r5)     // Catch: java.lang.Throwable -> Lbc2
            if (r5 == 0) goto L745
            int r5 = r2.zzB     // Catch: java.lang.Throwable -> Lbc2
            r4.zzG(r5)     // Catch: java.lang.Throwable -> Lbc2
            long r12 = r2.zzC     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzjw r5 = com.google.android.gms.measurement.internal.zzjw.zza     // Catch: java.lang.Throwable -> Lbc2
            boolean r5 = r9.zzr(r5)     // Catch: java.lang.Throwable -> Lbc2
            r9 = 32
            if (r5 != 0) goto L6c6
            r14 = 0
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 == 0) goto L6c6
            r14 = -2
            long r12 = r12 & r14
            long r12 = r12 | r9
        L6c6:
            r14 = 1
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 != 0) goto L6ce
            r5 = 1
            goto L6cf
        L6ce:
            r5 = 0
        L6cf:
            r4.zzaa(r5)     // Catch: java.lang.Throwable -> Lbc2
            r14 = 0
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 != 0) goto L6da
            goto L745
        L6da:
            com.google.android.gms.internal.measurement.zzhf r5 = com.google.android.gms.internal.measurement.zzhg.zza()     // Catch: java.lang.Throwable -> Lbc2
            r16 = 1
            long r18 = r12 & r16
            int r16 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r16 == 0) goto L6e7
            goto L6e8
        L6e7:
            r8 = 0
        L6e8:
            r5.zzc(r8)     // Catch: java.lang.Throwable -> Lbc2
            r16 = 2
            long r16 = r12 & r16
            int r8 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r8 == 0) goto L6f5
            r8 = 1
            goto L6f6
        L6f5:
            r8 = 0
        L6f6:
            r5.zze(r8)     // Catch: java.lang.Throwable -> Lbc2
            r16 = 4
            long r16 = r12 & r16
            int r8 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r8 == 0) goto L703
            r8 = 1
            goto L704
        L703:
            r8 = 0
        L704:
            r5.zzf(r8)     // Catch: java.lang.Throwable -> Lbc2
            r16 = 8
            long r16 = r12 & r16
            int r8 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r8 == 0) goto L711
            r8 = 1
            goto L712
        L711:
            r8 = 0
        L712:
            r5.zzg(r8)     // Catch: java.lang.Throwable -> Lbc2
            r16 = 16
            long r16 = r12 & r16
            int r8 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r8 == 0) goto L71f
            r8 = 1
            goto L720
        L71f:
            r8 = 0
        L720:
            r5.zzb(r8)     // Catch: java.lang.Throwable -> Lbc2
            long r8 = r12 & r9
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L72b
            r8 = 1
            goto L72c
        L72b:
            r8 = 0
        L72c:
            r5.zza(r8)     // Catch: java.lang.Throwable -> Lbc2
            r8 = 64
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L738
            r8 = 1
            goto L739
        L738:
            r8 = 0
        L739:
            r5.zzd(r8)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.internal.measurement.zzmd r5 = r5.zzba()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.internal.measurement.zzhg r5 = (com.google.android.gms.internal.measurement.zzhg) r5     // Catch: java.lang.Throwable -> Lbc2
            r4.zzN(r5)     // Catch: java.lang.Throwable -> Lbc2
        L745:
            long r8 = r2.zzf     // Catch: java.lang.Throwable -> Lbc2
            r12 = 0
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 == 0) goto L750
            r4.zzW(r8)     // Catch: java.lang.Throwable -> Lbc2
        L750:
            long r8 = r2.zzr     // Catch: java.lang.Throwable -> Lbc2
            r4.zzZ(r8)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqa r5 = r47.zzA()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzpv r8 = r5.zzg     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzio r8 = r8.zzn     // Catch: java.lang.Throwable -> Lbc2
            android.content.Context r8 = r8.zzaT()     // Catch: java.lang.Throwable -> Lbc2
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = "com.google.android.gms.measurement"
            android.net.Uri r9 = com.google.android.gms.internal.measurement.zzjx.zza(r9)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbj r10 = new com.google.android.gms.measurement.internal.zzbj     // Catch: java.lang.Throwable -> Lbc2
            r10.<init>()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.internal.measurement.zzjm r8 = com.google.android.gms.internal.measurement.zzjm.zza(r8, r9, r10)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 != 0) goto L77b
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lbc2
            goto L77f
        L77b:
            java.util.Map r8 = r8.zzd()     // Catch: java.lang.Throwable -> Lbc2
        L77f:
            if (r8 == 0) goto L806
            boolean r9 = r8.isEmpty()     // Catch: java.lang.Throwable -> Lbc2
            if (r9 == 0) goto L789
            goto L806
        L789:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbc2
            r12.<init>()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgg r9 = com.google.android.gms.measurement.internal.zzgi.zzae     // Catch: java.lang.Throwable -> Lbc2
            r10 = 0
            java.lang.Object r9 = r9.zza(r10)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> Lbc2
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> Lbc2
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lbc2
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lbc2
        L7a3:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbc2
            if (r10 == 0) goto L800
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> Lbc2
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r13 = r10.getKey()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r14 = "measurement.id."
            boolean r13 = r13.startsWith(r14)     // Catch: java.lang.Throwable -> Lbc2
            if (r13 == 0) goto L7a3
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            if (r10 == 0) goto L7a3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            r12.add(r10)     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            int r10 = r12.size()     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            if (r10 < r9) goto L7a3
            com.google.android.gms.measurement.internal.zzio r10 = r5.zzu     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzk()     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            java.lang.String r13 = "Too many experiment IDs. Number of IDs"
            int r14 = r12.size()     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            r10.zzb(r13, r14)     // Catch: java.lang.NumberFormatException -> L7ee java.lang.Throwable -> Lbc2
            goto L800
        L7ee:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.zzio r13 = r5.zzu     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhe r13 = r13.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzk()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r14 = "Experiment ID NumberFormatException"
            r13.zzb(r14, r10)     // Catch: java.lang.Throwable -> Lbc2
            goto L7a3
        L800:
            boolean r5 = r12.isEmpty()     // Catch: java.lang.Throwable -> Lbc2
            if (r5 == 0) goto L807
        L806:
            r12 = 0
        L807:
            if (r12 == 0) goto L80c
            r4.zzk(r12)     // Catch: java.lang.Throwable -> Lbc2
        L80c:
            com.google.android.gms.measurement.internal.zzam r5 = r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgg r8 = com.google.android.gms.measurement.internal.zzgi.zzbk     // Catch: java.lang.Throwable -> Lbc2
            r9 = 0
            boolean r5 = r5.zzx(r9, r8)     // Catch: java.lang.Throwable -> Lbc2
            if (r5 == 0) goto L81e
            java.lang.String r5 = ""
            r4.zzaf(r5)     // Catch: java.lang.Throwable -> Lbc2
        L81e:
            java.lang.String r5 = r2.zza     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzjx r8 = r1.zzu(r8)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = r2.zzu     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzjx r9 = com.google.android.gms.measurement.internal.zzjx.zzk(r9, r11)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzjx r8 = r8.zzl(r9)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzjw r9 = com.google.android.gms.measurement.internal.zzjw.zza     // Catch: java.lang.Throwable -> Lbc2
            boolean r10 = r8.zzr(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r10 == 0) goto L8cc
            boolean r10 = r2.zzn     // Catch: java.lang.Throwable -> Lbc2
            if (r10 == 0) goto L8cc
            com.google.android.gms.measurement.internal.zzoa r10 = r1.zzk     // Catch: java.lang.Throwable -> Lbc2
            android.util.Pair r10 = r10.zzd(r5, r8)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r11 = r10.first     // Catch: java.lang.Throwable -> Lbc2
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch: java.lang.Throwable -> Lbc2
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Lbc2
            if (r11 != 0) goto L8cc
            java.lang.Object r11 = r10.first     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Lbc2
            r4.zzas(r11)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r11 = r10.second     // Catch: java.lang.Throwable -> Lbc2
            if (r11 == 0) goto L864
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lbc2
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lbc2
            r4.zzal(r11)     // Catch: java.lang.Throwable -> Lbc2
        L864:
            java.lang.String r11 = r3.zzb     // Catch: java.lang.Throwable -> Lbc2
            r12 = r29
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> Lbc2
            if (r11 != 0) goto L8cc
            java.lang.Object r10 = r10.first     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r11 = "00000000-0000-0000-0000-000000000000"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> Lbc2
            if (r10 != 0) goto L8cc
            com.google.android.gms.measurement.internal.zzaw r10 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzh r10 = r10.zzl(r5)     // Catch: java.lang.Throwable -> Lbc2
            if (r10 == 0) goto L8cc
            boolean r11 = r10.zzaM()     // Catch: java.lang.Throwable -> Lbc2
            if (r11 == 0) goto L8cc
            r11 = 0
            r13 = 0
            r1.zzar(r5, r13, r11, r11)     // Catch: java.lang.Throwable -> Lbc2
            android.os.Bundle r11 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lbc2
            r11.<init>()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Long r13 = r10.zzy()     // Catch: java.lang.Throwable -> Lbc2
            if (r13 == 0) goto L8ae
            java.lang.String r14 = "_pfo"
            r30 = r7
            r15 = r8
            long r7 = r13.longValue()     // Catch: java.lang.Throwable -> Lbc2
            r13 = r3
            r2 = 0
            long r7 = java.lang.Math.max(r2, r7)     // Catch: java.lang.Throwable -> Lbc2
            r11.putLong(r14, r7)     // Catch: java.lang.Throwable -> Lbc2
            goto L8b2
        L8ae:
            r13 = r3
            r30 = r7
            r15 = r8
        L8b2:
            java.lang.Long r2 = r10.zzz()     // Catch: java.lang.Throwable -> Lbc2
            if (r2 == 0) goto L8c1
            java.lang.String r3 = "_uwa"
            long r7 = r2.longValue()     // Catch: java.lang.Throwable -> Lbc2
            r11.putLong(r3, r7)     // Catch: java.lang.Throwable -> Lbc2
        L8c1:
            r2 = 1
            r11.putLong(r6, r2)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqe r2 = r1.zzK     // Catch: java.lang.Throwable -> Lbc2
            r2.zza(r5, r12, r11)     // Catch: java.lang.Throwable -> Lbc2
            goto L8d0
        L8cc:
            r13 = r3
            r30 = r7
            r15 = r8
        L8d0:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzn     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbb r3 = r2.zzg()     // Catch: java.lang.Throwable -> Lbc2
            r3.zzv()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r3 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lbc2
            r4.zzX(r3)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbb r3 = r2.zzg()     // Catch: java.lang.Throwable -> Lbc2
            r3.zzv()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lbc2
            r4.zzam(r3)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbb r3 = r2.zzg()     // Catch: java.lang.Throwable -> Lbc2
            long r7 = r3.zza()     // Catch: java.lang.Throwable -> Lbc2
            int r3 = (int) r7     // Catch: java.lang.Throwable -> Lbc2
            r4.zzaz(r3)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbb r3 = r2.zzg()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r3 = r3.zzb()     // Catch: java.lang.Throwable -> Lbc2
            r4.zzaD(r3)     // Catch: java.lang.Throwable -> Lbc2
            r3 = r49
            long r7 = r3.zzy     // Catch: java.lang.Throwable -> Lbc2
            r4.zzay(r7)     // Catch: java.lang.Throwable -> Lbc2
            boolean r7 = r2.zzJ()     // Catch: java.lang.Throwable -> Lbc2
            if (r7 == 0) goto L91b
            r4.zzaF()     // Catch: java.lang.Throwable -> Lbc2
            r7 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 != 0) goto L91b
            r4.zzY(r7)     // Catch: java.lang.Throwable -> Lbc2
        L91b:
            com.google.android.gms.measurement.internal.zzaw r7 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzh r7 = r7.zzl(r5)     // Catch: java.lang.Throwable -> Lbc2
            if (r7 != 0) goto L984
            com.google.android.gms.measurement.internal.zzh r7 = new com.google.android.gms.measurement.internal.zzh     // Catch: java.lang.Throwable -> Lbc2
            r7.<init>(r2, r5)     // Catch: java.lang.Throwable -> Lbc2
            r2 = r15
            java.lang.String r8 = r1.zzC(r2)     // Catch: java.lang.Throwable -> Lbc2
            r7.zzV(r8)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = r3.zzk     // Catch: java.lang.Throwable -> Lbc2
            r7.zzan(r8)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = r3.zzb     // Catch: java.lang.Throwable -> Lbc2
            r7.zzao(r8)     // Catch: java.lang.Throwable -> Lbc2
            boolean r8 = r2.zzr(r9)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 == 0) goto L94d
            com.google.android.gms.measurement.internal.zzoa r8 = r1.zzk     // Catch: java.lang.Throwable -> Lbc2
            boolean r9 = r3.zzn     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = r8.zzf(r5, r9)     // Catch: java.lang.Throwable -> Lbc2
            r7.zzax(r8)     // Catch: java.lang.Throwable -> Lbc2
        L94d:
            r8 = 0
            r7.zzat(r8)     // Catch: java.lang.Throwable -> Lbc2
            r7.zzau(r8)     // Catch: java.lang.Throwable -> Lbc2
            r7.zzas(r8)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = r3.zzc     // Catch: java.lang.Throwable -> Lbc2
            r7.zzX(r8)     // Catch: java.lang.Throwable -> Lbc2
            long r8 = r3.zzj     // Catch: java.lang.Throwable -> Lbc2
            r7.zzY(r8)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = r3.zzd     // Catch: java.lang.Throwable -> Lbc2
            r7.zzW(r8)     // Catch: java.lang.Throwable -> Lbc2
            long r8 = r3.zze     // Catch: java.lang.Throwable -> Lbc2
            r7.zzap(r8)     // Catch: java.lang.Throwable -> Lbc2
            long r8 = r3.zzf     // Catch: java.lang.Throwable -> Lbc2
            r7.zzaj(r8)     // Catch: java.lang.Throwable -> Lbc2
            boolean r8 = r3.zzh     // Catch: java.lang.Throwable -> Lbc2
            r7.zzav(r8)     // Catch: java.lang.Throwable -> Lbc2
            long r8 = r3.zzr     // Catch: java.lang.Throwable -> Lbc2
            r7.zzal(r8)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzaw r8 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            r9 = 0
            r8.zzT(r7, r9, r9)     // Catch: java.lang.Throwable -> Lbc2
            goto L986
        L984:
            r2 = r15
            r9 = 0
        L986:
            com.google.android.gms.measurement.internal.zzjw r8 = com.google.android.gms.measurement.internal.zzjw.zzb     // Catch: java.lang.Throwable -> Lbc2
            boolean r2 = r2.zzr(r8)     // Catch: java.lang.Throwable -> Lbc2
            if (r2 == 0) goto L9a5
            java.lang.String r2 = r7.zzD()     // Catch: java.lang.Throwable -> Lbc2
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lbc2
            if (r2 != 0) goto L9a5
            java.lang.String r2 = r7.zzD()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lbc2
            r4.zzJ(r2)     // Catch: java.lang.Throwable -> Lbc2
        L9a5:
            java.lang.String r2 = r7.zzG()     // Catch: java.lang.Throwable -> Lbc2
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lbc2
            if (r2 != 0) goto L9bc
            java.lang.String r2 = r7.zzG()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lbc2
            r4.zzag(r2)     // Catch: java.lang.Throwable -> Lbc2
        L9bc:
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            java.util.List r2 = r2.zzE(r5)     // Catch: java.lang.Throwable -> Lbc2
            r5 = 0
        L9c5:
            int r8 = r2.size()     // Catch: java.lang.Throwable -> Lbc2
            if (r5 >= r8) goto La29
            com.google.android.gms.internal.measurement.zzin r8 = com.google.android.gms.internal.measurement.zzio.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r10 = r2.get(r5)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqd r10 = (com.google.android.gms.measurement.internal.zzqd) r10     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = r10.zzc     // Catch: java.lang.Throwable -> Lbc2
            r8.zzf(r10)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r10 = r2.get(r5)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqd r10 = (com.google.android.gms.measurement.internal.zzqd) r10     // Catch: java.lang.Throwable -> Lbc2
            long r10 = r10.zzd     // Catch: java.lang.Throwable -> Lbc2
            r8.zzg(r10)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqa r10 = r47.zzA()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r11 = r2.get(r5)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqd r11 = (com.google.android.gms.measurement.internal.zzqd) r11     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r11 = r11.zze     // Catch: java.lang.Throwable -> Lbc2
            r10.zzx(r8, r11)     // Catch: java.lang.Throwable -> Lbc2
            r4.zzo(r8)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r8 = "_sid"
            java.lang.Object r10 = r2.get(r5)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqd r10 = (com.google.android.gms.measurement.internal.zzqd) r10     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = r10.zzc     // Catch: java.lang.Throwable -> Lbc2
            boolean r8 = r8.equals(r10)     // Catch: java.lang.Throwable -> Lbc2
            if (r8 == 0) goto La26
            long r10 = r7.zzv()     // Catch: java.lang.Throwable -> Lbc2
            r14 = 0
            int r8 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r8 == 0) goto La26
            com.google.android.gms.measurement.internal.zzqa r8 = r47.zzA()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r10 = r3.zzw     // Catch: java.lang.Throwable -> Lbc2
            long r10 = r8.zzd(r10)     // Catch: java.lang.Throwable -> Lbc2
            long r14 = r7.zzv()     // Catch: java.lang.Throwable -> Lbc2
            int r8 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r8 == 0) goto La26
            r4.zzA()     // Catch: java.lang.Throwable -> Lbc2
        La26:
            int r5 = r5 + 1
            goto L9c5
        La29:
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            com.google.android.gms.internal.measurement.zzmd r3 = r4.zzba()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            com.google.android.gms.internal.measurement.zzhx r3 = (com.google.android.gms.internal.measurement.zzhx) r3     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            r2.zzg()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            r2.zzav()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            java.lang.String r5 = r3.zzF()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            byte[] r5 = r3.zzcd()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzpv r7 = r2.zzg     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqa r7 = r7.zzA()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            long r7 = r7.zzf(r5)     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            r10.<init>()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            java.lang.String r11 = r3.zzF()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            r12 = r28
            r10.put(r12, r11)     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            r14 = r27
            r10.put(r14, r11)     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            java.lang.String r11 = "metadata"
            r10.put(r11, r5)     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            android.database.sqlite.SQLiteDatabase r5 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lb60 java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            java.lang.String r11 = "raw_events_metadata"
            r15 = 4
            r9 = 0
            r5.insertWithOnConflict(r11, r9, r10, r15)     // Catch: android.database.sqlite.SQLiteException -> Lb60 java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            r3 = r13
            com.google.android.gms.measurement.internal.zzbf r4 = r3.zzf     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzbe r5 = new com.google.android.gms.measurement.internal.zzbe     // Catch: java.lang.Throwable -> Lbc2
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lbc2
        La84:
            boolean r4 = r5.hasNext()     // Catch: java.lang.Throwable -> Lbc2
            if (r4 == 0) goto La96
            java.lang.String r4 = r5.zza()     // Catch: java.lang.Throwable -> Lbc2
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> Lbc2
            if (r4 == 0) goto La84
        La94:
            r11 = 1
            goto Lad3
        La96:
            com.google.android.gms.measurement.internal.zzif r4 = r47.zzr()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r5 = r3.zza     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r6 = r3.zzb     // Catch: java.lang.Throwable -> Lbc2
            boolean r4 = r4.zzw(r5, r6)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzaw r36 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            long r37 = r47.zza()     // Catch: java.lang.Throwable -> Lbc2
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r39 = r5
            com.google.android.gms.measurement.internal.zzas r6 = r36.zzo(r37, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch: java.lang.Throwable -> Lbc2
            if (r4 == 0) goto Lad2
            long r9 = r6.zze     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzam r4 = r47.zzi()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzo     // Catch: java.lang.Throwable -> Lbc2
            int r4 = r4.zzh(r5, r6)     // Catch: java.lang.Throwable -> Lbc2
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Lbc2
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lad2
            goto La94
        Lad2:
            r11 = 0
        Lad3:
            r2.zzg()     // Catch: java.lang.Throwable -> Lbc2
            r2.zzav()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r4 = r3.zza     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzpv r5 = r2.zzg     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzqa r5 = r5.zzA()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.internal.measurement.zzhm r5 = r5.zzm(r3)     // Catch: java.lang.Throwable -> Lbc2
            byte[] r5 = r5.zzcd()     // Catch: java.lang.Throwable -> Lbc2
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lbc2
            r6.<init>()     // Catch: java.lang.Throwable -> Lbc2
            r6.put(r12, r4)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = "name"
            java.lang.String r10 = r3.zzb     // Catch: java.lang.Throwable -> Lbc2
            r6.put(r9, r10)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r9 = "timestamp"
            long r12 = r3.zzd     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> Lbc2
            r6.put(r9, r10)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lbc2
            r6.put(r14, r7)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r7 = "data"
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r5 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lbc2
            r6.put(r5, r7)     // Catch: java.lang.Throwable -> Lbc2
            android.database.sqlite.SQLiteDatabase r5 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lb48 java.lang.Throwable -> Lbc2
            r7 = r30
            r8 = 0
            long r5 = r5.insert(r7, r8, r6)     // Catch: android.database.sqlite.SQLiteException -> Lb48 java.lang.Throwable -> Lbc2
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto Lb43
            com.google.android.gms.measurement.internal.zzio r5 = r2.zzu     // Catch: android.database.sqlite.SQLiteException -> Lb48 java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Lb48 java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: android.database.sqlite.SQLiteException -> Lb48 java.lang.Throwable -> Lbc2
            java.lang.String r6 = "Failed to insert raw event (got -1). appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r4)     // Catch: android.database.sqlite.SQLiteException -> Lb48 java.lang.Throwable -> Lbc2
            r5.zzb(r6, r4)     // Catch: android.database.sqlite.SQLiteException -> Lb48 java.lang.Throwable -> Lbc2
            goto Lb91
        Lb43:
            r4 = 0
            r1.zza = r4     // Catch: java.lang.Throwable -> Lbc2
            goto Lb91
        Lb48:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r5 = "Error storing raw event. appId"
            java.lang.String r3 = r3.zza     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> Lbc2
            r2.zzc(r5, r3, r4)     // Catch: java.lang.Throwable -> Lbc2
            goto Lb91
        Lb60:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            java.lang.String r6 = "Error storing raw event metadata. appId"
            java.lang.String r3 = r3.zzF()     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            r2.zzc(r6, r3, r5)     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
            throw r5     // Catch: java.io.IOException -> Lb7a java.lang.Throwable -> Lbc2
        Lb7a:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzhe r3 = r47.zzaW()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r4 = r4.zzaF()     // Catch: java.lang.Throwable -> Lbc2
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r4)     // Catch: java.lang.Throwable -> Lbc2
            r3.zzc(r5, r4, r2)     // Catch: java.lang.Throwable -> Lbc2
        Lb91:
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()     // Catch: java.lang.Throwable -> Lbc2
            r2.zzS()     // Catch: java.lang.Throwable -> Lbc2
            com.google.android.gms.measurement.internal.zzaw r2 = r47.zzj()
            r2.zzL()
            r47.zzaL()
            com.google.android.gms.measurement.internal.zzhe r2 = r47.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r25
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.zzb(r4, r3)
            return
        Lbc2:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzaw r3 = r47.zzj()
            r3.zzL()
            throw r2
    }

    final boolean zzay(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzaw r0 = r3.zzj()
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzl(r4)
            r1 = 1
            if (r0 == 0) goto L20
            com.google.android.gms.measurement.internal.zzqf r2 = r3.zzB()
            java.lang.String r0 = r0.zzM()
            boolean r4 = r2.zzak(r4, r0)
            if (r4 != 0) goto L1a
            goto L20
        L1a:
            java.util.Map r4 = r3.zzF
            r4.remove(r5)
            return r1
        L20:
            java.util.Map r4 = r3.zzF
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.measurement.internal.zzpt r4 = (com.google.android.gms.measurement.internal.zzpt) r4
            if (r4 != 0) goto L2b
            return r1
        L2b:
            boolean r4 = r4.zzc()
            return r4
    }

    final boolean zzaz() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r6.zzaX()
            r0.zzg()
            java.nio.channels.FileLock r0 = r6.zzx
            r1 = 1
            java.lang.String r2 = "Storage concurrent access okay"
            if (r0 == 0) goto L21
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L15
            goto L21
        L15:
            com.google.android.gms.measurement.internal.zzhe r0 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            r0.zza(r2)
            return r1
        L21:
            com.google.android.gms.measurement.internal.zzaw r0 = r6.zze
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            r0.zzf()
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzn
            android.content.Context r0 = r0.zzaT()
            java.io.File r0 = r0.getFilesDir()
            java.io.File r3 = new java.io.File
            com.google.android.gms.internal.measurement.zzbx.zza()
            int r4 = com.google.android.gms.internal.measurement.zzcc.zzb
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "google_app_measurement.db"
            r4.<init>(r0, r5)
            java.lang.String r0 = r4.getPath()
            r3.<init>(r0)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            java.lang.String r4 = "rw"
            r0.<init>(r3, r4)     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            r6.zzy = r0     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            java.nio.channels.FileLock r0 = r0.tryLock()     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            r6.zzx = r0     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            if (r0 == 0) goto L68
            com.google.android.gms.measurement.internal.zzhe r0 = r6.zzaW()     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            r0.zza(r2)     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            return r1
        L68:
            com.google.android.gms.measurement.internal.zzhe r0 = r6.zzaW()     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            java.lang.String r1 = "Storage concurrent data access panic"
            r0.zza(r1)     // Catch: java.nio.channels.OverlappingFileLockException -> L76 java.io.IOException -> L85 java.io.FileNotFoundException -> L94
            goto La2
        L76:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhe r1 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r2 = "Storage lock already acquired"
            r1.zzb(r2, r0)
            goto La2
        L85:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhe r1 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to access storage lock file"
            r1.zzb(r2, r0)
            goto La2
        L94:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhe r1 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to acquire storage lock"
            r1.zzb(r2, r0)
        La2:
            r0 = 0
            return r0
    }

    final android.os.Bundle zzd(java.lang.String r5) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r4.zzaX()
            r0.zzg()
            r4.zzM()
            com.google.android.gms.measurement.internal.zzif r0 = r4.zzr()
            com.google.android.gms.internal.measurement.zzgi r0 = r0.zzi(r5)
            if (r0 != 0) goto L16
            r5 = 0
            return r5
        L16:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.zzjx r1 = r4.zzu(r5)
            android.os.Bundle r2 = r1.zzc()
            r0.putAll(r2)
            com.google.android.gms.measurement.internal.zzba r2 = r4.zzm(r5)
            com.google.android.gms.measurement.internal.zzao r3 = new com.google.android.gms.measurement.internal.zzao
            r3.<init>()
            com.google.android.gms.measurement.internal.zzba r1 = r4.zzl(r5, r2, r1, r3)
            android.os.Bundle r1 = r1.zzb()
            r0.putAll(r1)
            com.google.android.gms.measurement.internal.zzaw r1 = r4.zzj()
            java.lang.String r2 = "_npa"
            com.google.android.gms.measurement.internal.zzqd r1 = r1.zzy(r5, r2)
            if (r1 == 0) goto L53
            java.lang.Object r5 = r1.zze
            r1 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r5 = r5.equals(r1)
            goto L5c
        L53:
            com.google.android.gms.measurement.internal.zzao r1 = new com.google.android.gms.measurement.internal.zzao
            r1.<init>()
            int r5 = r4.zzaC(r5, r1)
        L5c:
            r1 = 1
            if (r1 == r5) goto L62
            java.lang.String r5 = "granted"
            goto L64
        L62:
            java.lang.String r5 = "denied"
        L64:
            java.lang.String r1 = "ad_personalization"
            r0.putString(r1, r5)
            return r0
    }

    final android.os.Bundle zzf(java.lang.String r5, com.google.android.gms.measurement.internal.zzbh r6) {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.zzbf r6 = r6.zzb
            java.lang.String r1 = "_sid"
            java.lang.Long r6 = r6.zze(r1)
            long r2 = r6.longValue()
            r0.putLong(r1, r2)
            com.google.android.gms.measurement.internal.zzaw r6 = r4.zzj()
            java.lang.String r1 = "_sno"
            com.google.android.gms.measurement.internal.zzqd r5 = r6.zzy(r5, r1)
            if (r5 == 0) goto L2f
            java.lang.Object r5 = r5.zze
            boolean r6 = r5 instanceof java.lang.Long
            if (r6 == 0) goto L2f
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r0.putLong(r1, r5)
        L2f:
            return r0
    }

    final com.google.android.gms.measurement.internal.zzh zzg(com.google.android.gms.measurement.internal.zzr r14) {
            r13 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r13.zzaX()
            r0.zzg()
            r13.zzM()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            java.lang.String r2 = r14.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            java.lang.String r0 = r14.zzv
            boolean r1 = r0.isEmpty()
            r8 = 0
            if (r1 != 0) goto L25
            java.util.Map r1 = r13.zzE
            com.google.android.gms.measurement.internal.zzps r3 = new com.google.android.gms.measurement.internal.zzps
            r3.<init>(r13, r0, r8)
            r1.put(r2, r3)
        L25:
            com.google.android.gms.measurement.internal.zzaw r0 = r13.zzj()
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzl(r2)
            com.google.android.gms.measurement.internal.zzjx r1 = r13.zzu(r2)
            java.lang.String r3 = r14.zzu
            r4 = 100
            com.google.android.gms.measurement.internal.zzjx r3 = com.google.android.gms.measurement.internal.zzjx.zzk(r3, r4)
            com.google.android.gms.measurement.internal.zzjx r1 = r1.zzl(r3)
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zza
            boolean r4 = r1.zzr(r3)
            if (r4 == 0) goto L4e
            com.google.android.gms.measurement.internal.zzoa r4 = r13.zzk
            boolean r5 = r14.zzn
            java.lang.String r4 = r4.zzf(r2, r5)
            goto L50
        L4e:
            java.lang.String r4 = ""
        L50:
            r9 = 1
            r10 = 0
            if (r0 != 0) goto L76
            com.google.android.gms.measurement.internal.zzio r0 = r13.zzn
            com.google.android.gms.measurement.internal.zzh r5 = new com.google.android.gms.measurement.internal.zzh
            r5.<init>(r0, r2)
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r0 = r1.zzr(r0)
            if (r0 == 0) goto L6a
            java.lang.String r0 = r13.zzC(r1)
            r5.zzV(r0)
        L6a:
            boolean r0 = r1.zzr(r3)
            if (r0 == 0) goto L73
            r5.zzax(r4)
        L73:
            r0 = r5
            goto L126
        L76:
            boolean r3 = r1.zzr(r3)
            if (r3 == 0) goto L10d
            if (r4 == 0) goto L10d
            java.lang.String r3 = r0.zzJ()
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L10d
            java.lang.String r3 = r0.zzJ()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r0.zzax(r4)
            boolean r4 = r14.zzn
            if (r4 == 0) goto Lf3
            com.google.android.gms.measurement.internal.zzoa r4 = r13.zzk
            android.util.Pair r4 = r4.zzd(r2, r1)
            java.lang.Object r4 = r4.first
            java.lang.String r5 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto Lf3
            if (r3 != 0) goto Lf3
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r3 = r1.zzr(r3)
            if (r3 == 0) goto Lba
            java.lang.String r1 = r13.zzC(r1)
            r0.zzV(r1)
            r11 = 0
            goto Lbb
        Lba:
            r11 = 1
        Lbb:
            com.google.android.gms.measurement.internal.zzaw r1 = r13.zzj()
            java.lang.String r3 = "_id"
            com.google.android.gms.measurement.internal.zzqd r1 = r1.zzy(r2, r3)
            if (r1 == 0) goto L127
            com.google.android.gms.measurement.internal.zzaw r1 = r13.zzj()
            java.lang.String r3 = "_lair"
            com.google.android.gms.measurement.internal.zzqd r1 = r1.zzy(r2, r3)
            if (r1 != 0) goto L127
            com.google.android.gms.common.util.Clock r1 = r13.zzaU()
            long r5 = r1.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzqd r12 = new com.google.android.gms.measurement.internal.zzqd
            r3 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_lair"
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r7)
            com.google.android.gms.measurement.internal.zzaw r1 = r13.zzj()
            r1.zzai(r12)
            goto L127
        Lf3:
            java.lang.String r2 = r0.zzD()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L126
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r2 = r1.zzr(r2)
            if (r2 == 0) goto L126
            java.lang.String r1 = r13.zzC(r1)
            r0.zzV(r1)
            goto L126
        L10d:
            java.lang.String r2 = r0.zzD()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L126
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r2 = r1.zzr(r2)
            if (r2 == 0) goto L126
            java.lang.String r1 = r13.zzC(r1)
            r0.zzV(r1)
        L126:
            r11 = 0
        L127:
            java.lang.String r1 = r14.zzb
            r0.zzao(r1)
            java.lang.String r1 = r14.zzp
            r0.zzS(r1)
            java.lang.String r1 = r14.zzk
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L13c
            r0.zzan(r1)
        L13c:
            long r1 = r14.zze
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L147
            r0.zzap(r1)
        L147:
            java.lang.String r1 = r14.zzc
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L152
            r0.zzX(r1)
        L152:
            long r1 = r14.zzj
            r0.zzY(r1)
            java.lang.String r1 = r14.zzd
            if (r1 == 0) goto L15e
            r0.zzW(r1)
        L15e:
            long r1 = r14.zzf
            r0.zzaj(r1)
            boolean r1 = r14.zzh
            r0.zzav(r1)
            java.lang.String r1 = r14.zzg
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L173
            r0.zzaq(r1)
        L173:
            boolean r1 = r14.zzn
            r0.zzU(r1)
            java.lang.Boolean r1 = r14.zzq
            r0.zzaw(r1)
            long r1 = r14.zzr
            r0.zzal(r1)
            java.lang.String r1 = r14.zzw
            r0.zzaA(r1)
            com.google.android.gms.internal.measurement.zzpn.zzb()
            com.google.android.gms.measurement.internal.zzam r1 = r13.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaK
            boolean r1 = r1.zzx(r8, r2)
            if (r1 == 0) goto L19c
            java.util.List r1 = r14.zzs
            r0.zzay(r1)
            goto L1ae
        L19c:
            com.google.android.gms.internal.measurement.zzpn.zzb()
            com.google.android.gms.measurement.internal.zzam r1 = r13.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaJ
            boolean r1 = r1.zzx(r8, r2)
            if (r1 == 0) goto L1ae
            r0.zzay(r8)
        L1ae:
            boolean r1 = r14.zzx
            r0.zzaD(r1)
            java.lang.String r1 = r14.zzD
            r0.zzaC(r1)
            com.google.android.gms.internal.measurement.zzqr.zzb()
            com.google.android.gms.measurement.internal.zzam r1 = r13.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaV
            boolean r1 = r1.zzx(r8, r2)
            if (r1 == 0) goto L1cc
            int r1 = r14.zzB
            r0.zzT(r1)
        L1cc:
            long r1 = r14.zzy
            r0.zzaE(r1)
            java.lang.String r1 = r14.zzE
            r0.zzaz(r1)
            com.google.android.gms.measurement.internal.zzam r1 = r13.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaP
            boolean r1 = r1.zzx(r8, r2)
            if (r1 == 0) goto L1e7
            int r14 = r14.zzG
            r0.zzaa(r14)
        L1e7:
            boolean r14 = r0.zzaK()
            if (r14 != 0) goto L1f0
            if (r11 == 0) goto L1f8
            goto L1f1
        L1f0:
            r9 = r11
        L1f1:
            com.google.android.gms.measurement.internal.zzaw r14 = r13.zzj()
            r14.zzT(r0, r9, r10)
        L1f8:
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzae zzh() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzae r0 = r1.zzh
            zzaR(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzam zzi() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzio r0 = (com.google.android.gms.measurement.internal.zzio) r0
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzaw zzj() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzaw r0 = r1.zze
            zzaR(r0)
            return r0
    }

    final com.google.android.gms.measurement.internal.zzba zzl(java.lang.String r10, com.google.android.gms.measurement.internal.zzba r11, com.google.android.gms.measurement.internal.zzjx r12, com.google.android.gms.measurement.internal.zzao r13) {
            r9 = this;
            com.google.android.gms.measurement.internal.zzif r0 = r9.zzr()
            com.google.android.gms.internal.measurement.zzgi r0 = r0.zzi(r10)
            java.lang.String r1 = "-"
            r2 = 90
            if (r0 != 0) goto L31
            com.google.android.gms.measurement.internal.zzju r10 = r11.zzf()
            com.google.android.gms.measurement.internal.zzju r12 = com.google.android.gms.measurement.internal.zzju.zzc
            if (r10 != r12) goto L20
            int r2 = r11.zza()
            com.google.android.gms.measurement.internal.zzjw r10 = com.google.android.gms.measurement.internal.zzjw.zzc
            r13.zzc(r10, r2)
            goto L27
        L20:
            com.google.android.gms.measurement.internal.zzjw r10 = com.google.android.gms.measurement.internal.zzjw.zzc
            com.google.android.gms.measurement.internal.zzan r11 = com.google.android.gms.measurement.internal.zzan.zzj
            r13.zzd(r10, r11)
        L27:
            com.google.android.gms.measurement.internal.zzba r10 = new com.google.android.gms.measurement.internal.zzba
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10.<init>(r11, r2, r12, r1)
            return r10
        L31:
            com.google.android.gms.measurement.internal.zzju r0 = r11.zzf()
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.zzd
            if (r0 == r3) goto L86
            com.google.android.gms.measurement.internal.zzju r4 = com.google.android.gms.measurement.internal.zzju.zzc
            if (r0 != r4) goto L3e
            goto L86
        L3e:
            com.google.android.gms.measurement.internal.zzju r11 = com.google.android.gms.measurement.internal.zzju.zzb
            if (r0 != r11) goto L55
            com.google.android.gms.measurement.internal.zzif r11 = r9.zzc
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.zzc
            com.google.android.gms.measurement.internal.zzju r11 = r11.zzf(r10, r0)
            com.google.android.gms.measurement.internal.zzju r5 = com.google.android.gms.measurement.internal.zzju.zza
            if (r11 == r5) goto L55
            com.google.android.gms.measurement.internal.zzan r12 = com.google.android.gms.measurement.internal.zzan.zzi
            r13.zzd(r0, r12)
            r0 = r11
            goto L8f
        L55:
            com.google.android.gms.measurement.internal.zzif r11 = r9.zzc
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.zzc
            com.google.android.gms.measurement.internal.zzjw r5 = r11.zzh(r10, r0)
            com.google.android.gms.measurement.internal.zzju r12 = r12.zze()
            r6 = 1
            if (r12 == r3) goto L69
            if (r12 != r4) goto L67
            goto L69
        L67:
            r7 = 0
            goto L6a
        L69:
            r7 = 1
        L6a:
            com.google.android.gms.measurement.internal.zzjw r8 = com.google.android.gms.measurement.internal.zzjw.zza
            if (r5 != r8) goto L77
            if (r7 == 0) goto L77
            com.google.android.gms.measurement.internal.zzan r11 = com.google.android.gms.measurement.internal.zzan.zzc
            r13.zzd(r0, r11)
            r0 = r12
            goto L8f
        L77:
            com.google.android.gms.measurement.internal.zzan r12 = com.google.android.gms.measurement.internal.zzan.zzb
            r13.zzd(r0, r12)
            boolean r11 = r11.zzu(r10, r0)
            if (r6 == r11) goto L84
            r0 = r4
            goto L8f
        L84:
            r0 = r3
            goto L8f
        L86:
            int r2 = r11.zza()
            com.google.android.gms.measurement.internal.zzjw r11 = com.google.android.gms.measurement.internal.zzjw.zzc
            r13.zzc(r11, r2)
        L8f:
            com.google.android.gms.measurement.internal.zzif r11 = r9.zzc
            boolean r11 = r11.zzv(r10)
            com.google.android.gms.measurement.internal.zzif r12 = r9.zzr()
            java.util.SortedSet r10 = r12.zzp(r10)
            com.google.android.gms.measurement.internal.zzju r12 = com.google.android.gms.measurement.internal.zzju.zzc
            if (r0 == r12) goto Lbc
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto La8
            goto Lbc
        La8:
            com.google.android.gms.measurement.internal.zzba r12 = new com.google.android.gms.measurement.internal.zzba
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = ""
            if (r11 == 0) goto Lb8
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
        Lb8:
            r12.<init>(r13, r2, r0, r1)
            return r12
        Lbc:
            com.google.android.gms.measurement.internal.zzba r10 = new com.google.android.gms.measurement.internal.zzba
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.<init>(r12, r2, r11, r1)
            return r10
    }

    final com.google.android.gms.measurement.internal.zzba zzm(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r2.zzaX()
            r0.zzg()
            r2.zzM()
            java.util.Map r0 = r2.zzD
            java.lang.Object r1 = r0.get(r3)
            com.google.android.gms.measurement.internal.zzba r1 = (com.google.android.gms.measurement.internal.zzba) r1
            if (r1 != 0) goto L1f
            com.google.android.gms.measurement.internal.zzaw r1 = r2.zzj()
            com.google.android.gms.measurement.internal.zzba r1 = r1.zzq(r3)
            r0.put(r3, r1)
        L1f:
            return r1
    }

    public final com.google.android.gms.measurement.internal.zzgx zzo() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn
            com.google.android.gms.measurement.internal.zzgx r0 = r0.zzj()
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhk zzp() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhk r0 = r1.zzd
            zzaR(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhm zzq() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzhm r0 = r2.zzf
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Network broadcast receiver not created"
            r0.<init>(r1)
            throw r0
    }

    public final com.google.android.gms.measurement.internal.zzif zzr() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzif r0 = r1.zzc
            zzaR(r0)
            return r0
    }

    final com.google.android.gms.measurement.internal.zzio zzt() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzn
            return r0
    }

    final com.google.android.gms.measurement.internal.zzjx zzu(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzjx r0 = com.google.android.gms.measurement.internal.zzjx.zza
            com.google.android.gms.measurement.internal.zzil r1 = r2.zzaX()
            r1.zzg()
            r2.zzM()
            java.util.Map r1 = r2.zzC
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.measurement.internal.zzjx r1 = (com.google.android.gms.measurement.internal.zzjx) r1
            if (r1 != 0) goto L26
            com.google.android.gms.measurement.internal.zzaw r1 = r2.zzj()
            com.google.android.gms.measurement.internal.zzjx r1 = r1.zzu(r3)
            if (r1 != 0) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            r2.zzaq(r3, r0)
            r1 = r0
        L26:
            return r1
    }

    public final com.google.android.gms.measurement.internal.zzmc zzv() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzmc r0 = r1.zzj
            zzaR(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzoa zzw() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzoa r0 = r1.zzk
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzoy zzx() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzoy r0 = r1.zzg
            zzaR(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzpi zzy() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzpi r0 = r1.zzl
            return r0
    }
}
