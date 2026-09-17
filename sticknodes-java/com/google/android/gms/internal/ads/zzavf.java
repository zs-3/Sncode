package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzavf implements com.google.android.gms.internal.ads.zzavi {
    private static com.google.android.gms.internal.ads.zzavf zzb;
    volatile long zza;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfso zzd;
    private final com.google.android.gms.internal.ads.zzfsv zze;
    private final com.google.android.gms.internal.ads.zzfsx zzf;
    private final com.google.android.gms.internal.ads.zzawi zzg;
    private final com.google.android.gms.internal.ads.zzfqz zzh;
    private final java.util.concurrent.Executor zzi;
    private final com.google.android.gms.internal.ads.zzfsu zzj;
    private final java.util.concurrent.CountDownLatch zzk;
    private final com.google.android.gms.internal.ads.zzawx zzl;
    private final com.google.android.gms.internal.ads.zzawp zzm;
    private final com.google.android.gms.internal.ads.zzawg zzn;
    private final java.lang.Object zzo;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;

    zzavf(android.content.Context r3, com.google.android.gms.internal.ads.zzfqz r4, com.google.android.gms.internal.ads.zzfso r5, com.google.android.gms.internal.ads.zzfsv r6, com.google.android.gms.internal.ads.zzfsx r7, com.google.android.gms.internal.ads.zzawi r8, java.util.concurrent.Executor r9, com.google.android.gms.internal.ads.zzfqu r10, int r11, com.google.android.gms.internal.ads.zzawx r12, com.google.android.gms.internal.ads.zzawp r13, com.google.android.gms.internal.ads.zzawg r14) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzo = r0
            r0 = 0
            r2.zzq = r0
            r2.zzc = r3
            r2.zzh = r4
            r2.zzd = r5
            r2.zze = r6
            r2.zzf = r7
            r2.zzg = r8
            r2.zzi = r9
            r2.zzr = r11
            r2.zzl = r12
            r2.zzm = r13
            r2.zzn = r14
            r2.zzq = r0
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r4 = 1
            r3.<init>(r4)
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzavd r3 = new com.google.android.gms.internal.ads.zzavd
            r3.<init>(r2, r10)
            r2.zzj = r3
            return
    }

    public static synchronized com.google.android.gms.internal.ads.zzavf zza(java.lang.String r2, android.content.Context r3, boolean r4, boolean r5) {
            java.lang.Class<com.google.android.gms.internal.ads.zzavf> r0 = com.google.android.gms.internal.ads.zzavf.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.ads.zzavf r2 = zzb(r2, r3, r1, r4, r5)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @java.lang.Deprecated
    public static synchronized com.google.android.gms.internal.ads.zzavf zzb(java.lang.String r24, android.content.Context r25, java.util.concurrent.Executor r26, boolean r27, boolean r28) {
            r0 = r25
            r8 = r26
            java.lang.Class<com.google.android.gms.internal.ads.zzavf> r14 = com.google.android.gms.internal.ads.zzavf.class
            monitor-enter(r14)
            com.google.android.gms.internal.ads.zzavf r1 = com.google.android.gms.internal.ads.zzavf.zzb     // Catch: java.lang.Throwable -> Lf1
            if (r1 != 0) goto Led
            com.google.android.gms.internal.ads.zzfra r1 = com.google.android.gms.internal.ads.zzfrb.zza()     // Catch: java.lang.Throwable -> Lf1
            r2 = r24
            r1.zza(r2)     // Catch: java.lang.Throwable -> Lf1
            r2 = r27
            r1.zzc(r2)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzfrb r1 = r1.zzd()     // Catch: java.lang.Throwable -> Lf1
            r2 = r28
            com.google.android.gms.internal.ads.zzfqz r3 = com.google.android.gms.internal.ads.zzfqz.zza(r0, r8, r2)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzdp     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r2 = r4.zza(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lf1
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lf1
            r4 = 0
            if (r2 == 0) goto L3d
            com.google.android.gms.internal.ads.zzavr r2 = com.google.android.gms.internal.ads.zzavr.zzc(r25)     // Catch: java.lang.Throwable -> Lf1
            r20 = r2
            goto L3f
        L3d:
            r20 = r4
        L3f:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzdq     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r2 = r5.zza(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lf1
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.zzawx r2 = com.google.android.gms.internal.ads.zzawx.zzd(r25, r26)     // Catch: java.lang.Throwable -> Lf1
            r11 = r2
            goto L58
        L57:
            r11 = r4
        L58:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcI     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r2 = r5.zza(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lf1
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto L71
            com.google.android.gms.internal.ads.zzawp r2 = new com.google.android.gms.internal.ads.zzawp     // Catch: java.lang.Throwable -> Lf1
            r2.<init>()     // Catch: java.lang.Throwable -> Lf1
            r12 = r2
            goto L72
        L71:
            r12 = r4
        L72:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcJ     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r2 = r5.zza(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lf1
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto L8b
            com.google.android.gms.internal.ads.zzawg r2 = new com.google.android.gms.internal.ads.zzawg     // Catch: java.lang.Throwable -> Lf1
            r2.<init>()     // Catch: java.lang.Throwable -> Lf1
            r13 = r2
            goto L8c
        L8b:
            r13 = r4
        L8c:
            com.google.android.gms.internal.ads.zzfrs r17 = com.google.android.gms.internal.ads.zzfrs.zze(r0, r8, r3, r1)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzawh r2 = new com.google.android.gms.internal.ads.zzawh     // Catch: java.lang.Throwable -> Lf1
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzawv r4 = new com.google.android.gms.internal.ads.zzawv     // Catch: java.lang.Throwable -> Lf1
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzawi r7 = new com.google.android.gms.internal.ads.zzawi     // Catch: java.lang.Throwable -> Lf1
            r15 = r7
            r16 = r1
            r18 = r4
            r19 = r2
            r21 = r11
            r22 = r12
            r23 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> Lf1
            int r10 = com.google.android.gms.internal.ads.zzfsb.zzb(r0, r3)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzfqu r9 = new com.google.android.gms.internal.ads.zzfqu     // Catch: java.lang.Throwable -> Lf1
            r9.<init>()     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzavf r15 = new com.google.android.gms.internal.ads.zzavf     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzfso r4 = new com.google.android.gms.internal.ads.zzfso     // Catch: java.lang.Throwable -> Lf1
            r4.<init>(r0, r10)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzfsv r5 = new com.google.android.gms.internal.ads.zzfsv     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzavc r1 = new com.google.android.gms.internal.ads.zzavc     // Catch: java.lang.Throwable -> Lf1
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcs     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r2 = r6.zza(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lf1
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lf1
            r5.<init>(r0, r10, r1, r2)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzfsx r6 = new com.google.android.gms.internal.ads.zzfsx     // Catch: java.lang.Throwable -> Lf1
            r6.<init>(r0, r7, r3, r9)     // Catch: java.lang.Throwable -> Lf1
            r1 = r15
            r2 = r25
            r8 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzavf.zzb = r15     // Catch: java.lang.Throwable -> Lf1
            r15.zzm()     // Catch: java.lang.Throwable -> Lf1
            com.google.android.gms.internal.ads.zzavf r0 = com.google.android.gms.internal.ads.zzavf.zzb     // Catch: java.lang.Throwable -> Lf1
            r0.zzp()     // Catch: java.lang.Throwable -> Lf1
        Led:
            com.google.android.gms.internal.ads.zzavf r0 = com.google.android.gms.internal.ads.zzavf.zzb     // Catch: java.lang.Throwable -> Lf1
            monitor-exit(r14)
            return r0
        Lf1:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfqz zzc(com.google.android.gms.internal.ads.zzavf r0) {
            com.google.android.gms.internal.ads.zzfqz r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzd(com.google.android.gms.internal.ads.zzavf r0) {
            java.lang.Object r0 = r0.zzo
            return r0
    }

    static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzavf r0, boolean r1) {
            r0.zzp = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzavf r12) {
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.zzfsn r3 = r12.zzt(r2)
            r4 = 0
            if (r3 == 0) goto L1f
            com.google.android.gms.internal.ads.zzayk r4 = r3.zza()
            java.lang.String r4 = r4.zzk()
            com.google.android.gms.internal.ads.zzayk r3 = r3.zza()
            java.lang.String r3 = r3.zzj()
            r9 = r3
            r8 = r4
            goto L21
        L1f:
            r8 = r4
            r9 = r8
        L21:
            android.content.Context r5 = r12.zzc     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            r6 = 1
            int r7 = r12.zzr     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.zzfqz r11 = r12.zzh     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            com.google.android.gms.internal.ads.zzfss r3 = com.google.android.gms.internal.ads.zzfrj.zza(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            byte[] r4 = r3.zzb     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r4 == 0) goto L10f
            int r5 = r4.length     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r5 != 0) goto L37
            goto L10f
        L37:
            r6 = 0
            com.google.android.gms.internal.ads.zzgzs r4 = com.google.android.gms.internal.ads.zzgzs.zzv(r4, r6, r5)     // Catch: java.lang.NullPointerException -> L102 java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            com.google.android.gms.internal.ads.zzhao r5 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: java.lang.NullPointerException -> L102 java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            com.google.android.gms.internal.ads.zzayh r4 = com.google.android.gms.internal.ads.zzayh.zzc(r4, r5)     // Catch: java.lang.NullPointerException -> L102 java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            com.google.android.gms.internal.ads.zzayk r5 = r4.zzd()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            java.lang.String r5 = r5.zzk()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r5 != 0) goto Lf5
            com.google.android.gms.internal.ads.zzayk r5 = r4.zzd()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            java.lang.String r5 = r5.zzj()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r5 != 0) goto Lf5
            com.google.android.gms.internal.ads.zzgzs r5 = r4.zze()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            byte[] r5 = r5.zzA()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            int r5 = r5.length     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r5 != 0) goto L6d
            goto Lf5
        L6d:
            com.google.android.gms.internal.ads.zzfsn r5 = r12.zzt(r2)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r5 != 0) goto L74
            goto L9c
        L74:
            com.google.android.gms.internal.ads.zzayk r5 = r5.zza()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            com.google.android.gms.internal.ads.zzayk r6 = r4.zzd()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            java.lang.String r6 = r6.zzk()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            java.lang.String r7 = r5.zzk()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r6 == 0) goto L9c
            com.google.android.gms.internal.ads.zzayk r6 = r4.zzd()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            java.lang.String r6 = r6.zzj()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            java.lang.String r5 = r5.zzj()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r5 != 0) goto Lf5
        L9c:
            com.google.android.gms.internal.ads.zzfsu r5 = r12.zzj     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            int r3 = r3.zzc     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzcq     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            java.lang.Object r6 = r7.zza(r6)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r6 == 0) goto Lc6
            r6 = 3
            if (r3 != r6) goto Lbc
            com.google.android.gms.internal.ads.zzfsv r3 = r12.zze     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            boolean r3 = r3.zza(r4)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            goto Lcc
        Lbc:
            r6 = 4
            if (r3 != r6) goto Lce
            com.google.android.gms.internal.ads.zzfsv r3 = r12.zze     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            boolean r3 = r3.zzb(r4, r5)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            goto Lcc
        Lc6:
            com.google.android.gms.internal.ads.zzfso r3 = r12.zzd     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            boolean r3 = r3.zza(r4, r5)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
        Lcc:
            if (r3 != 0) goto Ldb
        Lce:
            com.google.android.gms.internal.ads.zzfqz r2 = r12.zzh     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            goto L12b
        Ldb:
            com.google.android.gms.internal.ads.zzfsn r3 = r12.zzt(r2)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r3 == 0) goto L12b
            com.google.android.gms.internal.ads.zzfsx r4 = r12.zzf     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            boolean r3 = r4.zzc(r3)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            if (r3 == 0) goto Leb
            r12.zzq = r2     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
        Leb:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.zza = r2     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            goto L12b
        Lf5:
            com.google.android.gms.internal.ads.zzfqz r2 = r12.zzh     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            goto L12b
        L102:
            com.google.android.gms.internal.ads.zzfqz r2 = r12.zzh     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            goto L12b
        L10f:
            com.google.android.gms.internal.ads.zzfqz r2 = r12.zzh     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch: java.lang.Throwable -> L11c com.google.android.gms.internal.ads.zzhbt -> L11e
            goto L12b
        L11c:
            r0 = move-exception
            goto L131
        L11e:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfqz r3 = r12.zzh     // Catch: java.lang.Throwable -> L11c
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11c
            long r5 = r5 - r0
            r3.zzc(r4, r5, r2)     // Catch: java.lang.Throwable -> L11c
        L12b:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            return
        L131:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            throw r0
    }

    static /* bridge */ /* synthetic */ boolean zzq(com.google.android.gms.internal.ads.zzavf r0) {
            boolean r0 = r0.zzp
            return r0
    }

    private final void zzs() {
            r1 = this;
            com.google.android.gms.internal.ads.zzawx r0 = r1.zzl
            if (r0 == 0) goto L7
            r0.zzh()
        L7:
            return
    }

    private final com.google.android.gms.internal.ads.zzfsn zzt(int r2) {
            r1 = this;
            int r2 = r1.zzr
            boolean r2 = com.google.android.gms.internal.ads.zzfsb.zza(r2)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcq
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0 = 1
            if (r2 == 0) goto L24
            com.google.android.gms.internal.ads.zzfsv r2 = r1.zze
            com.google.android.gms.internal.ads.zzfsn r2 = r2.zzc(r0)
            return r2
        L24:
            com.google.android.gms.internal.ads.zzfso r2 = r1.zzd
            com.google.android.gms.internal.ads.zzfsn r2 = r2.zzc(r0)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final java.lang.String zze(android.content.Context r2, java.lang.String r3, android.view.View r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.zzf(r2, r3, r4, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final java.lang.String zzf(android.content.Context r17, java.lang.String r18, android.view.View r19, android.app.Activity r20) {
            r16 = this;
            r0 = r16
            r16.zzs()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzcI
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1c
            com.google.android.gms.internal.ads.zzawp r1 = r0.zzm
            r1.zzi()
        L1c:
            r16.zzp()
            com.google.android.gms.internal.ads.zzfsx r1 = r0.zzf
            com.google.android.gms.internal.ads.zzfrc r2 = r1.zza()
            if (r2 == 0) goto L48
            long r8 = java.lang.System.currentTimeMillis()
            r4 = 0
            r3 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            java.lang.String r1 = r2.zza(r3, r4, r5, r6, r7)
            com.google.android.gms.internal.ads.zzfqz r10 = r0.zzh
            r11 = 5000(0x1388, float:7.006E-42)
            long r2 = java.lang.System.currentTimeMillis()
            long r12 = r2 - r8
            r15 = 0
            r14 = r1
            r10.zzf(r11, r12, r14, r15)
            return r1
        L48:
            java.lang.String r1 = ""
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final java.lang.String zzg(android.content.Context r11) {
            r10 = this;
            r10.zzs()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcI
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzawp r0 = r10.zzm
            r0.zzj()
        L1a:
            r10.zzp()
            com.google.android.gms.internal.ads.zzfsx r0 = r10.zzf
            com.google.android.gms.internal.ads.zzfrc r0 = r0.zza()
            if (r0 == 0) goto L3d
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            java.lang.String r11 = r0.zzc(r11, r3)
            com.google.android.gms.internal.ads.zzfqz r4 = r10.zzh
            r5 = 5001(0x1389, float:7.008E-42)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            r9 = 0
            r8 = r11
            r4.zzf(r5, r6, r8, r9)
            return r11
        L3d:
            java.lang.String r11 = ""
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final java.lang.String zzh(android.content.Context r11, android.view.View r12, android.app.Activity r13) {
            r10 = this;
            r10.zzs()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcI
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzawp r0 = r10.zzm
            r0.zzk(r11, r12)
        L1a:
            r10.zzp()
            com.google.android.gms.internal.ads.zzfsx r0 = r10.zzf
            com.google.android.gms.internal.ads.zzfrc r0 = r0.zza()
            if (r0 == 0) goto L3e
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            java.lang.String r11 = r0.zzb(r11, r3, r12, r13)
            com.google.android.gms.internal.ads.zzfqz r4 = r10.zzh
            r5 = 5002(0x138a, float:7.009E-42)
            long r12 = java.lang.System.currentTimeMillis()
            long r6 = r12 - r1
            r9 = 0
            r8 = r11
            r4.zzf(r5, r6, r8, r9)
            return r11
        L3e:
            java.lang.String r11 = ""
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzk(android.view.MotionEvent r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzfsx r0 = r4.zzf
            com.google.android.gms.internal.ads.zzfrc r0 = r0.zza()
            if (r0 == 0) goto L19
            r1 = 0
            r0.zzd(r1, r5)     // Catch: com.google.android.gms.internal.ads.zzfsw -> Ld
            return
        Ld:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzfqz r0 = r4.zzh
            int r1 = r5.zza()
            r2 = -1
            r0.zzc(r1, r2, r5)
        L19:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzl(int r21, int r22, int r23) {
            r20 = this;
            r0 = r20
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzlA
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L84
            android.content.Context r1 = r0.zzc
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            if (r1 != 0) goto L21
            goto L84
        L21:
            r2 = r21
            float r2 = (float) r2
            r3 = 0
            r5 = 0
            r7 = 0
            float r8 = r1.density
            float r9 = r2 * r8
            r10 = r22
            float r15 = (float) r10
            float r10 = r15 * r8
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r19 = r15
            r15 = r17
            r16 = r18
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.zzk(r3)
            r3.recycle()
            r4 = 0
            r6 = 0
            r8 = 2
            float r3 = r1.density
            float r9 = r2 * r3
            float r10 = r19 * r3
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.zzk(r3)
            r3.recycle()
            r3 = r23
            long r6 = (long) r3
            r8 = 1
            float r1 = r1.density
            float r9 = r2 * r1
            float r10 = r19 * r1
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.zzk(r1)
            r1.recycle()
        L84:
            return
    }

    final synchronized void zzm() {
            r6 = this;
            monitor-enter(r6)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            com.google.android.gms.internal.ads.zzfsn r3 = r6.zzt(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L1f
            com.google.android.gms.internal.ads.zzfsx r0 = r6.zzf     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.zzc(r3)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L1d
            r6.zzq = r2     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.CountDownLatch r0 = r6.zzk     // Catch: java.lang.Throwable -> L2d
            r0.countDown()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r6)
            return
        L1d:
            monitor-exit(r6)
            return
        L1f:
            com.google.android.gms.internal.ads.zzfqz r2 = r6.zzh     // Catch: java.lang.Throwable -> L2d
            r3 = 4013(0xfad, float:5.623E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2d
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r6)
            return
        L2d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzn(java.lang.StackTraceElement[] r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzawg r0 = r1.zzn
            if (r0 == 0) goto Lb
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.zzb(r2)
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzo(android.view.View r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzawi r0 = r1.zzg
            r0.zzd(r2)
            return
    }

    public final void zzp() {
            r6 = this;
            boolean r0 = r6.zzp
            if (r0 != 0) goto L42
            java.lang.Object r0 = r6.zzo
            monitor-enter(r0)
            boolean r1 = r6.zzp     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L3d
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.zza     // Catch: java.lang.Throwable -> L3f
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L1d:
            com.google.android.gms.internal.ads.zzfsx r1 = r6.zzf     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.internal.ads.zzfsn r1 = r1.zzb()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L2b
            boolean r1 = r1.zzd(r3)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3d
        L2b:
            int r1 = r6.zzr     // Catch: java.lang.Throwable -> L3f
            boolean r1 = com.google.android.gms.internal.ads.zzfsb.zza(r1)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3d
            java.util.concurrent.Executor r1 = r6.zzi     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.internal.ads.zzave r2 = new com.google.android.gms.internal.ads.zzave     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3f
            r1.execute(r2)     // Catch: java.lang.Throwable -> L3f
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        L42:
            return
    }

    public final synchronized boolean zzr() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzq     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
