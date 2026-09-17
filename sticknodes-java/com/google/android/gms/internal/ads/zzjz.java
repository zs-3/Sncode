package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzjz extends com.google.android.gms.internal.ads.zzj implements com.google.android.gms.internal.ads.zziu {
    public static final /* synthetic */ int zzd = 0;
    private boolean zzA;
    private com.google.android.gms.internal.ads.zzlw zzB;
    private com.google.android.gms.internal.ads.zzit zzC;
    private com.google.android.gms.internal.ads.zzbt zzD;
    private com.google.android.gms.internal.ads.zzbh zzE;
    private java.lang.Object zzF;
    private android.view.Surface zzG;
    private int zzH;
    private com.google.android.gms.internal.ads.zzel zzI;
    private int zzJ;
    private com.google.android.gms.internal.ads.zzh zzK;
    private float zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private com.google.android.gms.internal.ads.zzbh zzQ;
    private com.google.android.gms.internal.ads.zzlk zzR;
    private int zzS;
    private long zzT;
    private final com.google.android.gms.internal.ads.zzjg zzU;
    private com.google.android.gms.internal.ads.zzwq zzV;
    final com.google.android.gms.internal.ads.zzys zzb;
    final com.google.android.gms.internal.ads.zzbt zzc;
    private final com.google.android.gms.internal.ads.zzdm zze;
    private final android.content.Context zzf;
    private final com.google.android.gms.internal.ads.zzbw zzg;
    private final com.google.android.gms.internal.ads.zzlr[] zzh;
    private final com.google.android.gms.internal.ads.zzyr zzi;
    private final com.google.android.gms.internal.ads.zzdt zzj;
    private final com.google.android.gms.internal.ads.zzkk zzk;
    private final com.google.android.gms.internal.ads.zzdz zzl;
    private final java.util.concurrent.CopyOnWriteArraySet zzm;
    private final com.google.android.gms.internal.ads.zzca zzn;
    private final java.util.List zzo;
    private final boolean zzp;
    private final com.google.android.gms.internal.ads.zzma zzq;
    private final android.os.Looper zzr;
    private final com.google.android.gms.internal.ads.zzyz zzs;
    private final com.google.android.gms.internal.ads.zzdj zzt;
    private final com.google.android.gms.internal.ads.zzjv zzu;
    private final com.google.android.gms.internal.ads.zzjx zzv;
    private final com.google.android.gms.internal.ads.zzhy zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
            java.lang.String r0 = "media3.exoplayer"
            com.google.android.gms.internal.ads.zzbd.zzb(r0)
            return
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    public zzjz(com.google.android.gms.internal.ads.zzis r44, com.google.android.gms.internal.ads.zzbw r45) {
            r43 = this;
            r1 = r43
            r0 = r44
            r2 = r45
            r43.<init>()
            com.google.android.gms.internal.ads.zzdm r3 = new com.google.android.gms.internal.ads.zzdm
            com.google.android.gms.internal.ads.zzdj r4 = com.google.android.gms.internal.ads.zzdj.zza
            r3.<init>(r4)
            r1.zze = r3
            java.lang.String r4 = "ExoPlayerImpl"
            int r5 = java.lang.System.identityHashCode(r43)     // Catch: java.lang.Throwable -> L30b
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L30b
            java.lang.String r6 = com.google.android.gms.internal.ads.zzeu.zze     // Catch: java.lang.Throwable -> L30b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30b
            r7.<init>()     // Catch: java.lang.Throwable -> L30b
            java.lang.String r8 = "Init "
            r7.append(r8)     // Catch: java.lang.Throwable -> L30b
            r7.append(r5)     // Catch: java.lang.Throwable -> L30b
            java.lang.String r5 = " [AndroidXMedia3/1.4.0] ["
            r7.append(r5)     // Catch: java.lang.Throwable -> L30b
            r7.append(r6)     // Catch: java.lang.Throwable -> L30b
            java.lang.String r5 = "]"
            r7.append(r5)     // Catch: java.lang.Throwable -> L30b
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzea.zze(r4, r5)     // Catch: java.lang.Throwable -> L30b
            android.content.Context r4 = r0.zza     // Catch: java.lang.Throwable -> L30b
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L30b
            r1.zzf = r4     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzfxq r5 = r0.zzh     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzdj r6 = r0.zzb     // Catch: java.lang.Throwable -> L30b
            java.lang.Object r5 = r5.apply(r6)     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzma r5 = (com.google.android.gms.internal.ads.zzma) r5     // Catch: java.lang.Throwable -> L30b
            r1.zzq = r5     // Catch: java.lang.Throwable -> L30b
            int r6 = r0.zzj     // Catch: java.lang.Throwable -> L30b
            r1.zzP = r6     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzh r6 = r0.zzk     // Catch: java.lang.Throwable -> L30b
            r1.zzK = r6     // Catch: java.lang.Throwable -> L30b
            int r6 = r0.zzl     // Catch: java.lang.Throwable -> L30b
            r1.zzH = r6     // Catch: java.lang.Throwable -> L30b
            r15 = 0
            r1.zzM = r15     // Catch: java.lang.Throwable -> L30b
            long r6 = r0.zzp     // Catch: java.lang.Throwable -> L30b
            r1.zzx = r6     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzjv r14 = new com.google.android.gms.internal.ads.zzjv     // Catch: java.lang.Throwable -> L30b
            r6 = 0
            r14.<init>(r1, r6)     // Catch: java.lang.Throwable -> L30b
            r1.zzu = r14     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzjx r7 = new com.google.android.gms.internal.ads.zzjx     // Catch: java.lang.Throwable -> L30b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L30b
            r1.zzv = r7     // Catch: java.lang.Throwable -> L30b
            android.os.Handler r13 = new android.os.Handler     // Catch: java.lang.Throwable -> L30b
            android.os.Looper r8 = r0.zzi     // Catch: java.lang.Throwable -> L30b
            r13.<init>(r8)     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzfyp r8 = r0.zzc     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzil r8 = (com.google.android.gms.internal.ads.zzil) r8     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzcet r8 = r8.zza     // Catch: java.lang.Throwable -> L30b
            r9 = r13
            r10 = r14
            r11 = r14
            r12 = r14
            r27 = r13
            r13 = r14
            com.google.android.gms.internal.ads.zzlr[] r8 = r8.zza(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L30b
            r1.zzh = r8     // Catch: java.lang.Throwable -> L30b
            int r9 = r8.length     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzfyp r9 = r0.zze     // Catch: java.lang.Throwable -> L30b
            java.lang.Object r9 = r9.zza()     // Catch: java.lang.Throwable -> L30b
            r13 = r9
            com.google.android.gms.internal.ads.zzyr r13 = (com.google.android.gms.internal.ads.zzyr) r13     // Catch: java.lang.Throwable -> L30b
            r1.zzi = r13     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzfyp r9 = r0.zzd     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzim r9 = (com.google.android.gms.internal.ads.zzim) r9     // Catch: java.lang.Throwable -> L30b
            android.content.Context r9 = r9.zza     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzis.zza(r9)     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzfyp r9 = r0.zzg     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzip r9 = (com.google.android.gms.internal.ads.zzip) r9     // Catch: java.lang.Throwable -> L30b
            android.content.Context r9 = r9.zza     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzzd r12 = com.google.android.gms.internal.ads.zzzd.zzh(r9)     // Catch: java.lang.Throwable -> L30b
            r1.zzs = r12     // Catch: java.lang.Throwable -> L30b
            boolean r9 = r0.zzm     // Catch: java.lang.Throwable -> L30b
            r1.zzp = r9     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzlw r9 = r0.zzn     // Catch: java.lang.Throwable -> L30b
            r1.zzB = r9     // Catch: java.lang.Throwable -> L30b
            android.os.Looper r11 = r0.zzi     // Catch: java.lang.Throwable -> L30b
            r1.zzr = r11     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzdj r10 = r0.zzb     // Catch: java.lang.Throwable -> L30b
            r1.zzt = r10     // Catch: java.lang.Throwable -> L30b
            r1.zzg = r2     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzdz r9 = new com.google.android.gms.internal.ads.zzdz     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzjf r6 = new com.google.android.gms.internal.ads.zzjf     // Catch: java.lang.Throwable -> L30b
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L30b
            r9.<init>(r11, r10, r6)     // Catch: java.lang.Throwable -> L30b
            r1.zzl = r9     // Catch: java.lang.Throwable -> L30b
            java.util.concurrent.CopyOnWriteArraySet r6 = new java.util.concurrent.CopyOnWriteArraySet     // Catch: java.lang.Throwable -> L30b
            r6.<init>()     // Catch: java.lang.Throwable -> L30b
            r1.zzm = r6     // Catch: java.lang.Throwable -> L30b
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30b
            r15.<init>()     // Catch: java.lang.Throwable -> L30b
            r1.zzo = r15     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzwq r15 = new com.google.android.gms.internal.ads.zzwq     // Catch: java.lang.Throwable -> L30b
            r18 = r6
            r6 = 0
            r15.<init>(r6)     // Catch: java.lang.Throwable -> L30b
            r1.zzV = r15     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzit r6 = com.google.android.gms.internal.ads.zzit.zza     // Catch: java.lang.Throwable -> L30b
            r1.zzC = r6     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzys r15 = new com.google.android.gms.internal.ads.zzys     // Catch: java.lang.Throwable -> L30b
            int r6 = r8.length     // Catch: java.lang.Throwable -> L30b
            r6 = 2
            r19 = r7
            com.google.android.gms.internal.ads.zzlv[] r7 = new com.google.android.gms.internal.ads.zzlv[r6]     // Catch: java.lang.Throwable -> L30b
            r20 = r9
            com.google.android.gms.internal.ads.zzyl[] r9 = new com.google.android.gms.internal.ads.zzyl[r6]     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzck r6 = com.google.android.gms.internal.ads.zzck.zza     // Catch: java.lang.Throwable -> L30b
            r22 = r14
            r14 = 0
            r15.<init>(r7, r9, r6, r14)     // Catch: java.lang.Throwable -> L30b
            r1.zzb = r15     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzca r6 = new com.google.android.gms.internal.ads.zzca     // Catch: java.lang.Throwable -> L30b
            r6.<init>()     // Catch: java.lang.Throwable -> L30b
            r1.zzn = r6     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzbr r6 = new com.google.android.gms.internal.ads.zzbr     // Catch: java.lang.Throwable -> L30b
            r6.<init>()     // Catch: java.lang.Throwable -> L30b
            r7 = 20
            int[] r9 = new int[r7]     // Catch: java.lang.Throwable -> L30b
            r14 = 1
            r17 = 0
            r9[r17] = r14     // Catch: java.lang.Throwable -> L30b
            r21 = 2
            r9[r14] = r21     // Catch: java.lang.Throwable -> L30b
            r14 = 3
            r9[r21] = r14     // Catch: java.lang.Throwable -> L30b
            r24 = 13
            r9[r14] = r24     // Catch: java.lang.Throwable -> L30b
            r25 = 14
            r7 = 4
            r9[r7] = r25     // Catch: java.lang.Throwable -> L30b
            r28 = 15
            r7 = 5
            r9[r7] = r28     // Catch: java.lang.Throwable -> L30b
            r30 = r3
            r3 = 6
            r14 = 16
            r9[r3] = r14     // Catch: java.lang.Throwable -> L30b
            r32 = 17
            r3 = 7
            r9[r3] = r32     // Catch: java.lang.Throwable -> L30b
            r33 = 18
            r3 = 8
            r9[r3] = r33     // Catch: java.lang.Throwable -> L30b
            r34 = 19
            r3 = 9
            r9[r3] = r34     // Catch: java.lang.Throwable -> L30b
            r7 = 31
            r3 = 10
            r9[r3] = r7     // Catch: java.lang.Throwable -> L30b
            r36 = 11
            r26 = 20
            r9[r36] = r26     // Catch: java.lang.Throwable -> L30b
            r26 = 12
            r36 = 30
            r9[r26] = r36     // Catch: java.lang.Throwable -> L30b
            r26 = 21
            r9[r24] = r26     // Catch: java.lang.Throwable -> L30b
            r24 = 35
            r9[r25] = r24     // Catch: java.lang.Throwable -> L30b
            r24 = 22
            r9[r28] = r24     // Catch: java.lang.Throwable -> L30b
            r24 = 24
            r9[r14] = r24     // Catch: java.lang.Throwable -> L30b
            r24 = 27
            r9[r32] = r24     // Catch: java.lang.Throwable -> L30b
            r24 = 28
            r9[r33] = r24     // Catch: java.lang.Throwable -> L30b
            r24 = 32
            r9[r34] = r24     // Catch: java.lang.Throwable -> L30b
            r6.zzc(r9)     // Catch: java.lang.Throwable -> L30b
            r13.zzn()     // Catch: java.lang.Throwable -> L30b
            r9 = 29
            r14 = 1
            r6.zzd(r9, r14)     // Catch: java.lang.Throwable -> L30b
            r9 = 23
            r7 = 0
            r6.zzd(r9, r7)     // Catch: java.lang.Throwable -> L30b
            r9 = 25
            r6.zzd(r9, r7)     // Catch: java.lang.Throwable -> L30b
            r9 = 33
            r6.zzd(r9, r7)     // Catch: java.lang.Throwable -> L30b
            r9 = 26
            r6.zzd(r9, r7)     // Catch: java.lang.Throwable -> L30b
            r9 = 34
            r6.zzd(r9, r7)     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzbt r6 = r6.zze()     // Catch: java.lang.Throwable -> L30b
            r1.zzc = r6     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzbr r9 = new com.google.android.gms.internal.ads.zzbr     // Catch: java.lang.Throwable -> L30b
            r9.<init>()     // Catch: java.lang.Throwable -> L30b
            r9.zzb(r6)     // Catch: java.lang.Throwable -> L30b
            r6 = 4
            r9.zza(r6)     // Catch: java.lang.Throwable -> L30b
            r9.zza(r3)     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzbt r9 = r9.zze()     // Catch: java.lang.Throwable -> L30b
            r1.zzD = r9     // Catch: java.lang.Throwable -> L30b
            r9 = 0
            com.google.android.gms.internal.ads.zzdt r9 = r10.zzd(r11, r9)     // Catch: java.lang.Throwable -> L30b
            r1.zzj = r9     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzjg r9 = new com.google.android.gms.internal.ads.zzjg     // Catch: java.lang.Throwable -> L30b
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L30b
            r1.zzU = r9     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzlk r6 = com.google.android.gms.internal.ads.zzlk.zzg(r15)     // Catch: java.lang.Throwable -> L30b
            r1.zzR = r6     // Catch: java.lang.Throwable -> L30b
            r5.zzR(r2, r11)     // Catch: java.lang.Throwable -> L30b
            int r2 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L30b
            r6 = 31
            if (r2 >= r6) goto L1d6
            com.google.android.gms.internal.ads.zzom r2 = new com.google.android.gms.internal.ads.zzom     // Catch: java.lang.Throwable -> L30b
            java.lang.String r6 = r0.zzs     // Catch: java.lang.Throwable -> L30b
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L30b
            goto L1de
        L1d6:
            boolean r2 = r0.zzq     // Catch: java.lang.Throwable -> L30b
            java.lang.String r6 = r0.zzs     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzom r2 = com.google.android.gms.internal.ads.zzjq.zza(r4, r1, r2, r6)     // Catch: java.lang.Throwable -> L30b
        L1de:
            com.google.android.gms.internal.ads.zzkk r6 = new com.google.android.gms.internal.ads.zzkk     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzfyp r7 = r0.zzf     // Catch: java.lang.Throwable -> L30b
            java.lang.Object r7 = r7.zza()     // Catch: java.lang.Throwable -> L30b
            r16 = r7
            com.google.android.gms.internal.ads.zzko r16 = (com.google.android.gms.internal.ads.zzko) r16     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzlw r7 = r1.zzB     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzid r3 = r0.zzt     // Catch: java.lang.Throwable -> L30b
            r45 = r2
            r23 = r3
            long r2 = r0.zzo     // Catch: java.lang.Throwable -> L30b
            r25 = 0
            r26 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            com.google.android.gms.internal.ads.zzit r0 = r1.zzC     // Catch: java.lang.Throwable -> L30b
            r29 = r6
            r37 = r18
            r18 = 4
            r6 = r29
            r17 = r7
            r38 = r19
            r18 = 0
            r7 = r8
            r8 = r13
            r35 = r9
            r39 = r20
            r9 = r15
            r36 = r10
            r10 = r16
            r15 = r11
            r11 = r12
            r40 = r12
            r12 = r25
            r41 = r13
            r13 = r26
            r42 = r22
            r14 = r5
            r31 = r15
            r15 = r17
            r16 = r23
            r17 = r2
            r19 = r32
            r20 = r33
            r21 = r31
            r22 = r36
            r23 = r35
            r24 = r45
            r25 = r34
            r26 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L30b
            r0 = r29
            r1.zzk = r0     // Catch: java.lang.Throwable -> L30b
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.zzL = r0     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzbh r0 = com.google.android.gms.internal.ads.zzbh.zza     // Catch: java.lang.Throwable -> L30b
            r1.zzE = r0     // Catch: java.lang.Throwable -> L30b
            r1.zzQ = r0     // Catch: java.lang.Throwable -> L30b
            r0 = -1
            r1.zzS = r0     // Catch: java.lang.Throwable -> L30b
            java.lang.String r2 = "audio"
            java.lang.Object r2 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L30b
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch: java.lang.Throwable -> L30b
            if (r2 != 0) goto L25e
            r2 = -1
            goto L262
        L25e:
            int r2 = r2.generateAudioSessionId()     // Catch: java.lang.Throwable -> L30b
        L262:
            r1.zzJ = r2     // Catch: java.lang.Throwable -> L30b
            int r2 = com.google.android.gms.internal.ads.zzdc.zza     // Catch: java.lang.Throwable -> L30b
            r2 = 1
            r1.zzN = r2     // Catch: java.lang.Throwable -> L30b
            java.util.Objects.requireNonNull(r5)
            r3 = r39
            r3.zzb(r5)     // Catch: java.lang.Throwable -> L30b
            android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L30b
            r4 = r31
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L30b
            r4 = r40
            r4.zzf(r3, r5)     // Catch: java.lang.Throwable -> L30b
            r4 = r37
            r3 = r42
            r4.add(r3)     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzhu r4 = new com.google.android.gms.internal.ads.zzhu     // Catch: java.lang.Throwable -> L30b
            r5 = r44
            android.content.Context r6 = r5.zza     // Catch: java.lang.Throwable -> L30b
            r7 = r27
            r4.<init>(r6, r7, r3)     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzhy r4 = new com.google.android.gms.internal.ads.zzhy     // Catch: java.lang.Throwable -> L30b
            android.content.Context r6 = r5.zza     // Catch: java.lang.Throwable -> L30b
            r4.<init>(r6, r7, r3)     // Catch: java.lang.Throwable -> L30b
            r1.zzw = r4     // Catch: java.lang.Throwable -> L30b
            android.content.Context r3 = r5.zza     // Catch: java.lang.Throwable -> L30b
            r3.getApplicationContext()     // Catch: java.lang.Throwable -> L30b
            android.content.Context r3 = r5.zza     // Catch: java.lang.Throwable -> L30b
            r3.getApplicationContext()     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzs r3 = new com.google.android.gms.internal.ads.zzs     // Catch: java.lang.Throwable -> L30b
            r4 = 0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L30b
            r3.zza()     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzcp r3 = com.google.android.gms.internal.ads.zzcp.zza     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzel r3 = com.google.android.gms.internal.ads.zzel.zza     // Catch: java.lang.Throwable -> L30b
            r1.zzI = r3     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzh r3 = r1.zzK     // Catch: java.lang.Throwable -> L30b
            r9 = r41
            r9.zzk(r3)     // Catch: java.lang.Throwable -> L30b
            int r3 = r1.zzJ     // Catch: java.lang.Throwable -> L30b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L30b
            r5 = 10
            r1.zzab(r2, r5, r3)     // Catch: java.lang.Throwable -> L30b
            int r3 = r1.zzJ     // Catch: java.lang.Throwable -> L30b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L30b
            r6 = 2
            r1.zzab(r6, r5, r3)     // Catch: java.lang.Throwable -> L30b
            com.google.android.gms.internal.ads.zzh r3 = r1.zzK     // Catch: java.lang.Throwable -> L30b
            r5 = 3
            r1.zzab(r2, r5, r3)     // Catch: java.lang.Throwable -> L30b
            int r3 = r1.zzH     // Catch: java.lang.Throwable -> L30b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L30b
            r5 = 4
            r1.zzab(r6, r5, r3)     // Catch: java.lang.Throwable -> L30b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L30b
            r4 = 5
            r1.zzab(r6, r4, r3)     // Catch: java.lang.Throwable -> L30b
            boolean r3 = r1.zzM     // Catch: java.lang.Throwable -> L30b
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L30b
            r4 = 9
            r1.zzab(r2, r4, r3)     // Catch: java.lang.Throwable -> L30b
            r2 = r38
            r3 = 7
            r1.zzab(r6, r3, r2)     // Catch: java.lang.Throwable -> L30b
            r3 = 8
            r4 = 6
            r1.zzab(r4, r3, r2)     // Catch: java.lang.Throwable -> L30b
            int r2 = r1.zzP     // Catch: java.lang.Throwable -> L30b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L30b
            r3 = 16
            r1.zzab(r0, r3, r2)     // Catch: java.lang.Throwable -> L30b
            r30.zze()
            return
        L30b:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzdm r2 = r1.zze
            r2.zze()
            throw r0
    }

    static /* bridge */ /* synthetic */ int zzC(int r0) {
            int r0 = zzS(r0)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdz zzD(com.google.android.gms.internal.ads.zzjz r0) {
            com.google.android.gms.internal.ads.zzdz r0 = r0.zzl
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzma zzF(com.google.android.gms.internal.ads.zzjz r0) {
            com.google.android.gms.internal.ads.zzma r0 = r0.zzq
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzG(com.google.android.gms.internal.ads.zzjz r0) {
            java.lang.Object r0 = r0.zzF
            return r0
    }

    static /* bridge */ /* synthetic */ void zzH(com.google.android.gms.internal.ads.zzjz r0, boolean r1) {
            r0.zzM = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzI(com.google.android.gms.internal.ads.zzjz r0, int r1, int r2) {
            r0.zzaa(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void zzJ(com.google.android.gms.internal.ads.zzjz r0) {
            r0.zzac()
            return
    }

    static /* bridge */ /* synthetic */ void zzK(com.google.android.gms.internal.ads.zzjz r1, android.graphics.SurfaceTexture r2) {
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r2)
            r1.zzad(r0)
            r1.zzG = r0
            return
    }

    static /* bridge */ /* synthetic */ void zzL(com.google.android.gms.internal.ads.zzjz r0, java.lang.Object r1) {
            r1 = 0
            r0.zzad(r1)
            return
    }

    static /* bridge */ /* synthetic */ void zzM(com.google.android.gms.internal.ads.zzjz r0, boolean r1, int r2, int r3) {
            r0.zzaf(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ boolean zzQ(com.google.android.gms.internal.ads.zzjz r0) {
            boolean r0 = r0.zzM
            return r0
    }

    private final int zzR(com.google.android.gms.internal.ads.zzlk r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcc r0 = r3.zza
            boolean r0 = r0.zzo()
            if (r0 == 0) goto Lb
            int r3 = r2.zzS
            return r3
        Lb:
            com.google.android.gms.internal.ads.zzcc r0 = r3.zza
            com.google.android.gms.internal.ads.zzuy r3 = r3.zzb
            java.lang.Object r3 = r3.zza
            com.google.android.gms.internal.ads.zzca r1 = r2.zzn
            com.google.android.gms.internal.ads.zzca r3 = r0.zzn(r3, r1)
            int r3 = r3.zzc
            return r3
    }

    private static int zzS(int r1) {
            r0 = -1
            if (r1 != r0) goto L5
            r1 = 2
            return r1
        L5:
            r1 = 1
            return r1
    }

    private final long zzT(com.google.android.gms.internal.ads.zzlk r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzuy r0 = r8.zzb
            boolean r0 = r0.zzb()
            if (r0 == 0) goto L3f
            com.google.android.gms.internal.ads.zzcc r0 = r8.zza
            com.google.android.gms.internal.ads.zzuy r1 = r8.zzb
            java.lang.Object r1 = r1.zza
            com.google.android.gms.internal.ads.zzca r2 = r7.zzn
            r0.zzn(r1, r2)
            long r0 = r8.zzc
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L33
            com.google.android.gms.internal.ads.zzcc r0 = r8.zza
            int r8 = r7.zzR(r8)
            com.google.android.gms.internal.ads.zzcb r1 = r7.zza
            com.google.android.gms.internal.ads.zzcb r8 = r0.zze(r8, r1, r4)
            long r0 = r8.zzl
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r4)
            goto L3e
        L33:
            int r8 = com.google.android.gms.internal.ads.zzeu.zza
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r0)
            long r2 = com.google.android.gms.internal.ads.zzeu.zzu(r4)
            long r0 = r0 + r2
        L3e:
            return r0
        L3f:
            long r0 = r7.zzU(r8)
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r0)
            return r0
    }

    private final long zzU(com.google.android.gms.internal.ads.zzlk r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcc r0 = r4.zza
            boolean r0 = r0.zzo()
            if (r0 == 0) goto Lf
            long r0 = r3.zzT
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            return r0
        Lf:
            long r0 = r4.zzs
            com.google.android.gms.internal.ads.zzuy r2 = r4.zzb
            boolean r2 = r2.zzb()
            if (r2 == 0) goto L1a
            return r0
        L1a:
            com.google.android.gms.internal.ads.zzcc r2 = r4.zza
            com.google.android.gms.internal.ads.zzuy r4 = r4.zzb
            r3.zzW(r2, r4, r0)
            return r0
    }

    private static long zzV(com.google.android.gms.internal.ads.zzlk r7) {
            com.google.android.gms.internal.ads.zzcb r0 = new com.google.android.gms.internal.ads.zzcb
            r0.<init>()
            com.google.android.gms.internal.ads.zzca r1 = new com.google.android.gms.internal.ads.zzca
            r1.<init>()
            com.google.android.gms.internal.ads.zzcc r2 = r7.zza
            com.google.android.gms.internal.ads.zzuy r3 = r7.zzb
            java.lang.Object r3 = r3.zza
            r2.zzn(r3, r1)
            long r2 = r7.zzc
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2a
            com.google.android.gms.internal.ads.zzcc r7 = r7.zza
            int r1 = r1.zzc
            r2 = 0
            com.google.android.gms.internal.ads.zzcb r7 = r7.zze(r1, r0, r2)
            long r0 = r7.zzl
        L2a:
            return r2
    }

    private final long zzW(com.google.android.gms.internal.ads.zzcc r2, com.google.android.gms.internal.ads.zzuy r3, long r4) {
            r1 = this;
            java.lang.Object r3 = r3.zza
            com.google.android.gms.internal.ads.zzca r0 = r1.zzn
            r2.zzn(r3, r0)
            return r4
    }

    private final android.util.Pair zzX(com.google.android.gms.internal.ads.zzcc r7, int r8, long r9) {
            r6 = this;
            boolean r0 = r7.zzo()
            r1 = 0
            if (r0 == 0) goto L18
            r6.zzS = r8
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L14
            r9 = r1
        L14:
            r6.zzT = r9
            r7 = 0
            return r7
        L18:
            r0 = -1
            if (r8 == r0) goto L21
            int r0 = r7.zzc()
            if (r8 < r0) goto L32
        L21:
            r8 = 0
            int r8 = r7.zzg(r8)
            com.google.android.gms.internal.ads.zzcb r9 = r6.zza
            com.google.android.gms.internal.ads.zzcb r9 = r7.zze(r8, r9, r1)
            long r9 = r9.zzl
            long r9 = com.google.android.gms.internal.ads.zzeu.zzu(r1)
        L32:
            r3 = r8
            com.google.android.gms.internal.ads.zzcb r1 = r6.zza
            com.google.android.gms.internal.ads.zzca r2 = r6.zzn
            long r4 = com.google.android.gms.internal.ads.zzeu.zzr(r9)
            r0 = r7
            android.util.Pair r7 = r0.zzl(r1, r2, r3, r4)
            return r7
    }

    private final com.google.android.gms.internal.ads.zzlk zzY(com.google.android.gms.internal.ads.zzlk r23, com.google.android.gms.internal.ads.zzcc r24, android.util.Pair r25) {
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r25
            boolean r3 = r24.zzo()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L13
            if (r2 == 0) goto L11
            goto L13
        L11:
            r3 = 0
            goto L14
        L13:
            r3 = 1
        L14:
            com.google.android.gms.internal.ads.zzdi.zzd(r3)
            r3 = r23
            com.google.android.gms.internal.ads.zzcc r6 = r3.zza
            long r7 = r22.zzT(r23)
            com.google.android.gms.internal.ads.zzlk r9 = r23.zzf(r24)
            boolean r3 = r24.zzo()
            if (r3 == 0) goto L4f
            com.google.android.gms.internal.ads.zzuy r1 = com.google.android.gms.internal.ads.zzlk.zzh()
            long r2 = r0.zzT
            long r15 = com.google.android.gms.internal.ads.zzeu.zzr(r2)
            com.google.android.gms.internal.ads.zzys r2 = r0.zzb
            r17 = 0
            com.google.android.gms.internal.ads.zzwy r19 = com.google.android.gms.internal.ads.zzwy.zza
            com.google.android.gms.internal.ads.zzgax r21 = com.google.android.gms.internal.ads.zzgax.zzn()
            r10 = r1
            r11 = r15
            r13 = r15
            r20 = r2
            com.google.android.gms.internal.ads.zzlk r2 = r9.zzb(r10, r11, r13, r15, r17, r19, r20, r21)
            com.google.android.gms.internal.ads.zzlk r1 = r2.zza(r1)
            long r2 = r1.zzs
            r1.zzq = r2
            return r1
        L4f:
            com.google.android.gms.internal.ads.zzuy r3 = r9.zzb
            java.lang.Object r3 = r3.zza
            int r10 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.Object r10 = r2.first
            boolean r10 = r3.equals(r10)
            r10 = r10 ^ r5
            if (r10 == 0) goto L68
            com.google.android.gms.internal.ads.zzuy r11 = new com.google.android.gms.internal.ads.zzuy
            java.lang.Object r12 = r2.first
            r13 = -1
            r11.<init>(r12, r13)
            goto L6a
        L68:
            com.google.android.gms.internal.ads.zzuy r11 = r9.zzb
        L6a:
            r15 = r11
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r13 = r2.longValue()
            long r7 = com.google.android.gms.internal.ads.zzeu.zzr(r7)
            boolean r2 = r6.zzo()
            if (r2 != 0) goto L82
            com.google.android.gms.internal.ads.zzca r2 = r0.zzn
            r6.zzn(r3, r2)
        L82:
            if (r10 != 0) goto L125
            int r2 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r2 >= 0) goto L8a
            goto L125
        L8a:
            if (r2 != 0) goto Lec
            com.google.android.gms.internal.ads.zzuy r2 = r9.zzk
            java.lang.Object r2 = r2.zza
            int r2 = r1.zza(r2)
            r3 = -1
            if (r2 == r3) goto Lab
            com.google.android.gms.internal.ads.zzca r3 = r0.zzn
            com.google.android.gms.internal.ads.zzca r2 = r1.zzd(r2, r3, r4)
            int r2 = r2.zzc
            java.lang.Object r3 = r15.zza
            com.google.android.gms.internal.ads.zzca r4 = r0.zzn
            com.google.android.gms.internal.ads.zzca r3 = r1.zzn(r3, r4)
            int r3 = r3.zzc
            if (r2 == r3) goto L15c
        Lab:
            java.lang.Object r2 = r15.zza
            com.google.android.gms.internal.ads.zzca r3 = r0.zzn
            r1.zzn(r2, r3)
            boolean r1 = r15.zzb()
            if (r1 == 0) goto Lc3
            com.google.android.gms.internal.ads.zzca r1 = r0.zzn
            int r2 = r15.zzb
            int r3 = r15.zzc
            long r1 = r1.zzf(r2, r3)
            goto Lc7
        Lc3:
            com.google.android.gms.internal.ads.zzca r1 = r0.zzn
            long r1 = r1.zzd
        Lc7:
            long r11 = r9.zzs
            long r13 = r9.zzs
            long r3 = r9.zzd
            long r5 = r9.zzs
            long r17 = r1 - r5
            com.google.android.gms.internal.ads.zzwy r5 = r9.zzh
            com.google.android.gms.internal.ads.zzys r6 = r9.zzi
            java.util.List r7 = r9.zzj
            r10 = r15
            r8 = r15
            r15 = r3
            r19 = r5
            r20 = r6
            r21 = r7
            com.google.android.gms.internal.ads.zzlk r3 = r9.zzb(r10, r11, r13, r15, r17, r19, r20, r21)
            com.google.android.gms.internal.ads.zzlk r9 = r3.zza(r8)
            r9.zzq = r1
            goto L15c
        Lec:
            r1 = r15
            boolean r2 = r1.zzb()
            r2 = r2 ^ r5
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            r2 = 0
            long r4 = r9.zzr
            long r6 = r13 - r7
            long r4 = r4 - r6
            long r17 = java.lang.Math.max(r2, r4)
            long r2 = r9.zzq
            com.google.android.gms.internal.ads.zzuy r4 = r9.zzk
            com.google.android.gms.internal.ads.zzuy r5 = r9.zzb
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L10e
            long r2 = r13 + r17
        L10e:
            com.google.android.gms.internal.ads.zzwy r4 = r9.zzh
            com.google.android.gms.internal.ads.zzys r5 = r9.zzi
            java.util.List r6 = r9.zzj
            r10 = r1
            r11 = r13
            r7 = r13
            r15 = r7
            r19 = r4
            r20 = r5
            r21 = r6
            com.google.android.gms.internal.ads.zzlk r9 = r9.zzb(r10, r11, r13, r15, r17, r19, r20, r21)
            r9.zzq = r2
            goto L15c
        L125:
            r7 = r13
            r1 = r15
            boolean r2 = r1.zzb()
            r2 = r2 ^ r5
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            if (r10 == 0) goto L134
            com.google.android.gms.internal.ads.zzwy r2 = com.google.android.gms.internal.ads.zzwy.zza
            goto L136
        L134:
            com.google.android.gms.internal.ads.zzwy r2 = r9.zzh
        L136:
            r19 = r2
            if (r10 == 0) goto L13d
            com.google.android.gms.internal.ads.zzys r2 = r0.zzb
            goto L13f
        L13d:
            com.google.android.gms.internal.ads.zzys r2 = r9.zzi
        L13f:
            r20 = r2
            if (r10 == 0) goto L148
            com.google.android.gms.internal.ads.zzgax r2 = com.google.android.gms.internal.ads.zzgax.zzn()
            goto L14a
        L148:
            java.util.List r2 = r9.zzj
        L14a:
            r21 = r2
            r17 = 0
            r10 = r1
            r11 = r7
            r13 = r7
            r15 = r7
            com.google.android.gms.internal.ads.zzlk r2 = r9.zzb(r10, r11, r13, r15, r17, r19, r20, r21)
            com.google.android.gms.internal.ads.zzlk r9 = r2.zza(r1)
            r9.zzq = r7
        L15c:
            return r9
    }

    private final com.google.android.gms.internal.ads.zzln zzZ(com.google.android.gms.internal.ads.zzlm r10) {
            r9 = this;
            com.google.android.gms.internal.ads.zzlk r0 = r9.zzR
            int r0 = r9.zzR(r0)
            com.google.android.gms.internal.ads.zzln r8 = new com.google.android.gms.internal.ads.zzln
            com.google.android.gms.internal.ads.zzlk r1 = r9.zzR
            com.google.android.gms.internal.ads.zzcc r4 = r1.zza
            r1 = -1
            if (r0 != r1) goto L12
            r0 = 0
            r5 = 0
            goto L13
        L12:
            r5 = r0
        L13:
            com.google.android.gms.internal.ads.zzdj r6 = r9.zzt
            com.google.android.gms.internal.ads.zzkk r2 = r9.zzk
            android.os.Looper r7 = r2.zzc()
            r1 = r8
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
    }

    private final void zzaa(int r4, int r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzel r0 = r3.zzI
            int r0 = r0.zzb()
            if (r4 != r0) goto L12
            com.google.android.gms.internal.ads.zzel r0 = r3.zzI
            int r0 = r0.zza()
            if (r5 == r0) goto L11
            goto L12
        L11:
            return
        L12:
            com.google.android.gms.internal.ads.zzel r0 = new com.google.android.gms.internal.ads.zzel
            r0.<init>(r4, r5)
            r3.zzI = r0
            com.google.android.gms.internal.ads.zzdz r0 = r3.zzl
            r1 = 24
            com.google.android.gms.internal.ads.zzjb r2 = new com.google.android.gms.internal.ads.zzjb
            r2.<init>(r4, r5)
            r0.zzd(r1, r2)
            r0.zzc()
            r0 = 2
            r1 = 14
            com.google.android.gms.internal.ads.zzel r2 = new com.google.android.gms.internal.ads.zzel
            r2.<init>(r4, r5)
            r3.zzab(r0, r1, r2)
            return
    }

    private final void zzab(int r5, int r6, java.lang.Object r7) {
            r4 = this;
            com.google.android.gms.internal.ads.zzlr[] r0 = r4.zzh
            int r1 = r0.length
            r1 = 0
        L4:
            r2 = 2
            if (r1 >= r2) goto L22
            r2 = r0[r1]
            r3 = -1
            if (r5 == r3) goto L12
            int r3 = r2.zzb()
            if (r3 != r5) goto L1f
        L12:
            com.google.android.gms.internal.ads.zzln r2 = r4.zzZ(r2)
            r2.zzf(r6)
            r2.zze(r7)
            r2.zzd()
        L1f:
            int r1 = r1 + 1
            goto L4
        L22:
            return
    }

    private final void zzac() {
            r3 = this;
            com.google.android.gms.internal.ads.zzhy r0 = r3.zzw
            float r1 = r3.zzL
            float r0 = r0.zza()
            float r1 = r1 * r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r1 = 1
            r2 = 2
            r3.zzab(r1, r2, r0)
            return
    }

    private final void zzad(java.lang.Object r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.zzlr[] r1 = r8.zzh
            int r2 = r1.length
            r2 = 0
            r3 = 0
        La:
            r4 = 2
            r5 = 1
            if (r3 >= r4) goto L29
            r6 = r1[r3]
            int r7 = r6.zzb()
            if (r7 != r4) goto L26
            com.google.android.gms.internal.ads.zzln r4 = r8.zzZ(r6)
            r4.zzf(r5)
            r4.zze(r9)
            r4.zzd()
            r0.add(r4)
        L26:
            int r3 = r3 + 1
            goto La
        L29:
            java.lang.Object r1 = r8.zzF
            if (r1 == 0) goto L5a
            if (r1 == r9) goto L5a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.concurrent.TimeoutException -> L45 java.lang.InterruptedException -> L47
        L33:
            boolean r1 = r0.hasNext()     // Catch: java.util.concurrent.TimeoutException -> L45 java.lang.InterruptedException -> L47
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()     // Catch: java.util.concurrent.TimeoutException -> L45 java.lang.InterruptedException -> L47
            com.google.android.gms.internal.ads.zzln r1 = (com.google.android.gms.internal.ads.zzln) r1     // Catch: java.util.concurrent.TimeoutException -> L45 java.lang.InterruptedException -> L47
            long r3 = r8.zzx     // Catch: java.util.concurrent.TimeoutException -> L45 java.lang.InterruptedException -> L47
            r1.zzi(r3)     // Catch: java.util.concurrent.TimeoutException -> L45 java.lang.InterruptedException -> L47
            goto L33
        L45:
            r2 = 1
            goto L4e
        L47:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4e:
            java.lang.Object r0 = r8.zzF
            android.view.Surface r1 = r8.zzG
            if (r0 != r1) goto L5a
            r1.release()
            r0 = 0
            r8.zzG = r0
        L5a:
            r8.zzF = r9
            if (r2 == 0) goto L6d
            com.google.android.gms.internal.ads.zzkl r9 = new com.google.android.gms.internal.ads.zzkl
            r0 = 3
            r9.<init>(r0)
            r0 = 1003(0x3eb, float:1.406E-42)
            com.google.android.gms.internal.ads.zzij r9 = com.google.android.gms.internal.ads.zzij.zzd(r9, r0)
            r8.zzae(r9)
        L6d:
            return
    }

    private final void zzae(com.google.android.gms.internal.ads.zzij r12) {
            r11 = this;
            com.google.android.gms.internal.ads.zzlk r0 = r11.zzR
            com.google.android.gms.internal.ads.zzuy r1 = r0.zzb
            com.google.android.gms.internal.ads.zzlk r0 = r0.zza(r1)
            long r1 = r0.zzs
            r0.zzq = r1
            r1 = 0
            r0.zzr = r1
            r1 = 1
            com.google.android.gms.internal.ads.zzlk r0 = r0.zze(r1)
            if (r12 == 0) goto L1b
            com.google.android.gms.internal.ads.zzlk r0 = r0.zzd(r12)
        L1b:
            r3 = r0
            int r12 = r11.zzy
            int r12 = r12 + r1
            r11.zzy = r12
            com.google.android.gms.internal.ads.zzkk r12 = r11.zzk
            r12.zzn()
            r4 = 0
            r5 = 0
            r6 = 5
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            r10 = 0
            r2 = r11
            r2.zzag(r3, r4, r5, r6, r7, r9, r10)
            return
    }

    private final void zzaf(boolean r13, int r14, int r15) {
            r12 = this;
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L9
            r13 = -1
            if (r14 == r13) goto L9
            r13 = 1
            goto La
        L9:
            r13 = 0
        La:
            if (r14 != 0) goto Ld
            r1 = 1
        Ld:
            com.google.android.gms.internal.ads.zzlk r14 = r12.zzR
            boolean r2 = r14.zzl
            if (r2 != r13) goto L1c
            int r2 = r14.zzn
            if (r2 != r1) goto L1c
            int r2 = r14.zzm
            if (r2 != r15) goto L1c
            return
        L1c:
            int r2 = r12.zzy
            int r2 = r2 + r0
            r12.zzy = r2
            com.google.android.gms.internal.ads.zzlk r4 = r14.zzc(r13, r15, r1)
            com.google.android.gms.internal.ads.zzkk r14 = r12.zzk
            r14.zzm(r13, r15, r1)
            r5 = 0
            r6 = 0
            r7 = 5
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = -1
            r11 = 0
            r3 = r12
            r3.zzag(r4, r5, r6, r7, r8, r10, r11)
            return
    }

    private final void zzag(com.google.android.gms.internal.ads.zzlk r43, int r44, boolean r45, int r46, long r47, int r49, boolean r50) {
            r42 = this;
            r0 = r42
            r1 = r43
            r2 = r46
            com.google.android.gms.internal.ads.zzlk r3 = r0.zzR
            r0.zzR = r1
            com.google.android.gms.internal.ads.zzcc r4 = r3.zza
            com.google.android.gms.internal.ads.zzcc r5 = r1.zza
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.zzcc r6 = r3.zza
            com.google.android.gms.internal.ads.zzcc r7 = r1.zza
            boolean r8 = r7.zzo()
            r10 = 3
            r11 = -1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r13 = 0
            r15 = 0
            if (r8 == 0) goto L35
            boolean r8 = r6.zzo()
            if (r8 == 0) goto L35
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r12)
            goto L4a
        L35:
            boolean r8 = r7.zzo()
            boolean r9 = r6.zzo()
            if (r8 == r9) goto L4e
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r6.<init>(r7, r8)
        L4a:
            r7 = r45
            goto Ld9
        L4e:
            com.google.android.gms.internal.ads.zzuy r8 = r3.zzb
            java.lang.Object r8 = r8.zza
            com.google.android.gms.internal.ads.zzca r9 = r0.zzn
            com.google.android.gms.internal.ads.zzca r8 = r6.zzn(r8, r9)
            int r8 = r8.zzc
            com.google.android.gms.internal.ads.zzcb r9 = r0.zza
            com.google.android.gms.internal.ads.zzcb r6 = r6.zze(r8, r9, r13)
            java.lang.Object r6 = r6.zzb
            com.google.android.gms.internal.ads.zzuy r8 = r1.zzb
            java.lang.Object r8 = r8.zza
            com.google.android.gms.internal.ads.zzca r9 = r0.zzn
            com.google.android.gms.internal.ads.zzca r8 = r7.zzn(r8, r9)
            int r8 = r8.zzc
            com.google.android.gms.internal.ads.zzcb r9 = r0.zza
            com.google.android.gms.internal.ads.zzcb r7 = r7.zze(r8, r9, r13)
            java.lang.Object r7 = r7.zzb
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto La6
            if (r45 == 0) goto L87
            if (r2 != 0) goto L84
            r2 = 0
            r6 = 1
            r7 = 1
            goto L93
        L84:
            r6 = 1
            r7 = 1
            goto L89
        L87:
            r6 = 0
            r7 = 0
        L89:
            if (r6 == 0) goto L8f
            if (r2 != r5) goto L8f
            r6 = 2
            goto L93
        L8f:
            if (r4 == 0) goto La0
            r7 = r6
            r6 = 3
        L93:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.<init>(r9, r6)
            r6 = r8
            goto Ld9
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        La6:
            if (r45 == 0) goto Lca
            if (r2 != 0) goto Lc7
            com.google.android.gms.internal.ads.zzuy r2 = r3.zzb
            long r6 = r2.zzd
            com.google.android.gms.internal.ads.zzuy r2 = r1.zzb
            long r8 = r2.zzd
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto Lc4
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r6.<init>(r2, r7)
            r2 = 0
            r7 = 1
            goto Ld9
        Lc4:
            r2 = 1
            r6 = 0
            goto Lcc
        Lc7:
            r6 = r2
            r2 = 1
            goto Lcc
        Lca:
            r6 = r2
            r2 = 0
        Lcc:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.<init>(r8, r12)
            r41 = r7
            r7 = r2
            r2 = r6
            r6 = r41
        Ld9:
            java.lang.Object r8 = r6.first
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r8 == 0) goto L112
            com.google.android.gms.internal.ads.zzcc r12 = r1.zza
            boolean r12 = r12.zzo()
            if (r12 != 0) goto L10c
            com.google.android.gms.internal.ads.zzcc r12 = r1.zza
            com.google.android.gms.internal.ads.zzuy r9 = r1.zzb
            java.lang.Object r9 = r9.zza
            com.google.android.gms.internal.ads.zzca r10 = r0.zzn
            com.google.android.gms.internal.ads.zzca r9 = r12.zzn(r9, r10)
            int r9 = r9.zzc
            com.google.android.gms.internal.ads.zzcc r10 = r1.zza
            com.google.android.gms.internal.ads.zzcb r12 = r0.zza
            com.google.android.gms.internal.ads.zzcb r9 = r10.zze(r9, r12, r13)
            com.google.android.gms.internal.ads.zzbc r9 = r9.zzd
            goto L10d
        L10c:
            r9 = 0
        L10d:
            com.google.android.gms.internal.ads.zzbh r10 = com.google.android.gms.internal.ads.zzbh.zza
            r0.zzQ = r10
            goto L113
        L112:
            r9 = 0
        L113:
            if (r8 != 0) goto L11f
            java.util.List r10 = r3.zzj
            java.util.List r12 = r1.zzj
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L151
        L11f:
            com.google.android.gms.internal.ads.zzbh r10 = r0.zzQ
            com.google.android.gms.internal.ads.zzbf r10 = r10.zza()
            java.util.List r12 = r1.zzj
            r11 = 0
        L128:
            int r15 = r12.size()
            if (r11 >= r15) goto L14b
            java.lang.Object r15 = r12.get(r11)
            com.google.android.gms.internal.ads.zzbk r15 = (com.google.android.gms.internal.ads.zzbk) r15
            r5 = 0
        L135:
            int r13 = r15.zza()
            if (r5 >= r13) goto L145
            com.google.android.gms.internal.ads.zzbj r13 = r15.zzb(r5)
            r13.zza(r10)
            int r5 = r5 + 1
            goto L135
        L145:
            int r11 = r11 + 1
            r5 = 1
            r13 = 0
            goto L128
        L14b:
            com.google.android.gms.internal.ads.zzbh r5 = r10.zzu()
            r0.zzQ = r5
        L151:
            com.google.android.gms.internal.ads.zzcc r5 = r42.zzn()
            boolean r10 = r5.zzo()
            if (r10 == 0) goto L15e
            com.google.android.gms.internal.ads.zzbh r5 = r0.zzQ
            goto L17b
        L15e:
            int r10 = r42.zzd()
            com.google.android.gms.internal.ads.zzcb r11 = r0.zza
            r12 = 0
            com.google.android.gms.internal.ads.zzcb r5 = r5.zze(r10, r11, r12)
            com.google.android.gms.internal.ads.zzbc r5 = r5.zzd
            com.google.android.gms.internal.ads.zzbh r10 = r0.zzQ
            com.google.android.gms.internal.ads.zzbf r10 = r10.zza()
            com.google.android.gms.internal.ads.zzbh r5 = r5.zzd
            r10.zzb(r5)
            com.google.android.gms.internal.ads.zzbh r5 = r10.zzu()
        L17b:
            com.google.android.gms.internal.ads.zzbh r10 = r0.zzE
            boolean r10 = r5.equals(r10)
            r11 = 1
            r10 = r10 ^ r11
            r0.zzE = r5
            boolean r5 = r3.zzl
            boolean r11 = r1.zzl
            if (r5 == r11) goto L18d
            r11 = 1
            goto L18e
        L18d:
            r11 = 0
        L18e:
            int r5 = r3.zze
            int r12 = r1.zze
            if (r5 == r12) goto L196
            r5 = 1
            goto L197
        L196:
            r5 = 0
        L197:
            if (r5 != 0) goto L19b
            if (r11 == 0) goto L19e
        L19b:
            r42.zzah()
        L19e:
            boolean r12 = r3.zzg
            boolean r13 = r1.zzg
            if (r12 == r13) goto L1a6
            r12 = 1
            goto L1a7
        L1a6:
            r12 = 0
        L1a7:
            if (r4 == 0) goto L1b6
            com.google.android.gms.internal.ads.zzdz r4 = r0.zzl
            com.google.android.gms.internal.ads.zziv r13 = new com.google.android.gms.internal.ads.zziv
            r14 = r44
            r13.<init>(r1, r14)
            r14 = 0
            r4.zzd(r14, r13)
        L1b6:
            if (r7 == 0) goto L2e4
            com.google.android.gms.internal.ads.zzca r7 = new com.google.android.gms.internal.ads.zzca
            r7.<init>()
            com.google.android.gms.internal.ads.zzcc r13 = r3.zza
            boolean r13 = r13.zzo()
            if (r13 != 0) goto L1f7
            com.google.android.gms.internal.ads.zzuy r13 = r3.zzb
            java.lang.Object r13 = r13.zza
            com.google.android.gms.internal.ads.zzcc r14 = r3.zza
            r14.zzn(r13, r7)
            int r14 = r7.zzc
            com.google.android.gms.internal.ads.zzcc r15 = r3.zza
            int r15 = r15.zza(r13)
            com.google.android.gms.internal.ads.zzcc r4 = r3.zza
            r46 = r13
            com.google.android.gms.internal.ads.zzcb r13 = r0.zza
            r17 = r11
            r18 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzcb r4 = r4.zze(r14, r13, r11)
            java.lang.Object r4 = r4.zzb
            com.google.android.gms.internal.ads.zzcb r11 = r0.zza
            com.google.android.gms.internal.ads.zzbc r11 = r11.zzd
            r23 = r46
            r20 = r4
            r22 = r11
            r21 = r14
            r24 = r15
            goto L205
        L1f7:
            r17 = r11
            r18 = r12
            r21 = r49
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = -1
        L205:
            if (r2 != 0) goto L22f
            com.google.android.gms.internal.ads.zzuy r4 = r3.zzb
            boolean r4 = r4.zzb()
            if (r4 == 0) goto L21e
            com.google.android.gms.internal.ads.zzuy r4 = r3.zzb
            int r11 = r4.zzb
            int r4 = r4.zzc
            long r11 = r7.zzf(r11, r4)
            long r13 = zzV(r3)
            goto L241
        L21e:
            com.google.android.gms.internal.ads.zzuy r4 = r3.zzb
            int r4 = r4.zze
            r11 = -1
            if (r4 == r11) goto L22c
            com.google.android.gms.internal.ads.zzlk r4 = r0.zzR
            long r11 = zzV(r4)
            goto L240
        L22c:
            long r11 = r7.zzd
            goto L240
        L22f:
            com.google.android.gms.internal.ads.zzuy r4 = r3.zzb
            boolean r4 = r4.zzb()
            if (r4 == 0) goto L23e
            long r11 = r3.zzs
            long r13 = zzV(r3)
            goto L241
        L23e:
            long r11 = r3.zzs
        L240:
            r13 = r11
        L241:
            com.google.android.gms.internal.ads.zzbv r4 = new com.google.android.gms.internal.ads.zzbv
            int r7 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzuy r7 = r3.zzb
            int r15 = r7.zzb
            int r7 = r7.zzc
            long r25 = com.google.android.gms.internal.ads.zzeu.zzu(r11)
            long r27 = com.google.android.gms.internal.ads.zzeu.zzu(r13)
            r19 = r4
            r29 = r15
            r30 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29, r30)
            int r7 = r42.zzd()
            com.google.android.gms.internal.ads.zzlk r11 = r0.zzR
            com.google.android.gms.internal.ads.zzcc r11 = r11.zza
            boolean r11 = r11.zzo()
            if (r11 != 0) goto L29d
            com.google.android.gms.internal.ads.zzlk r11 = r0.zzR
            com.google.android.gms.internal.ads.zzuy r12 = r11.zzb
            java.lang.Object r12 = r12.zza
            com.google.android.gms.internal.ads.zzcc r11 = r11.zza
            com.google.android.gms.internal.ads.zzca r13 = r0.zzn
            r11.zzn(r12, r13)
            com.google.android.gms.internal.ads.zzlk r11 = r0.zzR
            com.google.android.gms.internal.ads.zzcc r11 = r11.zza
            int r11 = r11.zza(r12)
            com.google.android.gms.internal.ads.zzlk r13 = r0.zzR
            com.google.android.gms.internal.ads.zzcc r13 = r13.zza
            com.google.android.gms.internal.ads.zzcb r14 = r0.zza
            r45 = r11
            r15 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzcb r13 = r13.zze(r7, r14, r11)
            java.lang.Object r11 = r13.zzb
            com.google.android.gms.internal.ads.zzcb r12 = r0.zza
            com.google.android.gms.internal.ads.zzbc r12 = r12.zzd
            r34 = r45
            r30 = r11
            r32 = r12
            r33 = r15
            goto L2a5
        L29d:
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = -1
        L2a5:
            long r35 = com.google.android.gms.internal.ads.zzeu.zzu(r47)
            com.google.android.gms.internal.ads.zzbv r11 = new com.google.android.gms.internal.ads.zzbv
            com.google.android.gms.internal.ads.zzlk r12 = r0.zzR
            com.google.android.gms.internal.ads.zzuy r12 = r12.zzb
            boolean r12 = r12.zzb()
            if (r12 == 0) goto L2c2
            com.google.android.gms.internal.ads.zzlk r12 = r0.zzR
            long r12 = zzV(r12)
            long r12 = com.google.android.gms.internal.ads.zzeu.zzu(r12)
            r37 = r12
            goto L2c4
        L2c2:
            r37 = r35
        L2c4:
            com.google.android.gms.internal.ads.zzlk r12 = r0.zzR
            com.google.android.gms.internal.ads.zzuy r12 = r12.zzb
            int r13 = r12.zzb
            int r12 = r12.zzc
            r29 = r11
            r31 = r7
            r39 = r13
            r40 = r12
            r29.<init>(r30, r31, r32, r33, r34, r35, r37, r39, r40)
            com.google.android.gms.internal.ads.zzdz r7 = r0.zzl
            com.google.android.gms.internal.ads.zzjl r12 = new com.google.android.gms.internal.ads.zzjl
            r12.<init>(r2, r4, r11)
            r2 = 11
            r7.zzd(r2, r12)
            goto L2e8
        L2e4:
            r17 = r11
            r18 = r12
        L2e8:
            if (r8 == 0) goto L2f6
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjm r4 = new com.google.android.gms.internal.ads.zzjm
            r4.<init>(r9, r6)
            r11 = 1
            r2.zzd(r11, r4)
            goto L2f7
        L2f6:
            r11 = 1
        L2f7:
            com.google.android.gms.internal.ads.zzij r2 = r3.zzf
            com.google.android.gms.internal.ads.zzij r4 = r1.zzf
            r6 = 10
            if (r2 == r4) goto L317
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjn r4 = new com.google.android.gms.internal.ads.zzjn
            r4.<init>(r1)
            r2.zzd(r6, r4)
            com.google.android.gms.internal.ads.zzij r2 = r1.zzf
            if (r2 == 0) goto L317
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjo r4 = new com.google.android.gms.internal.ads.zzjo
            r4.<init>(r1)
            r2.zzd(r6, r4)
        L317:
            com.google.android.gms.internal.ads.zzys r2 = r3.zzi
            com.google.android.gms.internal.ads.zzys r4 = r1.zzi
            if (r2 == r4) goto L32f
            com.google.android.gms.internal.ads.zzyr r2 = r0.zzi
            java.lang.Object r4 = r4.zze
            r2.zzp(r4)
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjp r4 = new com.google.android.gms.internal.ads.zzjp
            r4.<init>(r1)
            r7 = 2
            r2.zzd(r7, r4)
        L32f:
            if (r10 == 0) goto L33f
            com.google.android.gms.internal.ads.zzbh r2 = r0.zzE
            com.google.android.gms.internal.ads.zzdz r4 = r0.zzl
            r7 = 14
            com.google.android.gms.internal.ads.zziw r8 = new com.google.android.gms.internal.ads.zziw
            r8.<init>(r2)
            r4.zzd(r7, r8)
        L33f:
            if (r18 == 0) goto L34c
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzl
            com.google.android.gms.internal.ads.zzix r4 = new com.google.android.gms.internal.ads.zzix
            r4.<init>(r1)
            r7 = 3
            r2.zzd(r7, r4)
        L34c:
            if (r5 != 0) goto L350
            if (r17 == 0) goto L35b
        L350:
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzl
            com.google.android.gms.internal.ads.zziy r4 = new com.google.android.gms.internal.ads.zziy
            r4.<init>(r1)
            r7 = -1
            r2.zzd(r7, r4)
        L35b:
            r2 = 4
            if (r5 == 0) goto L368
            com.google.android.gms.internal.ads.zzdz r4 = r0.zzl
            com.google.android.gms.internal.ads.zziz r5 = new com.google.android.gms.internal.ads.zziz
            r5.<init>(r1)
            r4.zzd(r2, r5)
        L368:
            r4 = 5
            if (r17 != 0) goto L371
            int r5 = r3.zzm
            int r7 = r1.zzm
            if (r5 == r7) goto L37b
        L371:
            com.google.android.gms.internal.ads.zzdz r5 = r0.zzl
            com.google.android.gms.internal.ads.zzje r7 = new com.google.android.gms.internal.ads.zzje
            r7.<init>(r1)
            r5.zzd(r4, r7)
        L37b:
            int r5 = r3.zzn
            int r7 = r1.zzn
            r8 = 6
            if (r5 == r7) goto L38c
            com.google.android.gms.internal.ads.zzdz r5 = r0.zzl
            com.google.android.gms.internal.ads.zzji r7 = new com.google.android.gms.internal.ads.zzji
            r7.<init>(r1)
            r5.zzd(r8, r7)
        L38c:
            boolean r5 = r3.zzi()
            boolean r7 = r43.zzi()
            r9 = 7
            if (r5 == r7) goto L3a1
            com.google.android.gms.internal.ads.zzdz r5 = r0.zzl
            com.google.android.gms.internal.ads.zzjj r7 = new com.google.android.gms.internal.ads.zzjj
            r7.<init>(r1)
            r5.zzd(r9, r7)
        L3a1:
            com.google.android.gms.internal.ads.zzbq r3 = r3.zzo
            com.google.android.gms.internal.ads.zzbq r5 = r1.zzo
            boolean r3 = r3.equals(r5)
            r5 = 12
            if (r3 != 0) goto L3b7
            com.google.android.gms.internal.ads.zzdz r3 = r0.zzl
            com.google.android.gms.internal.ads.zzjk r7 = new com.google.android.gms.internal.ads.zzjk
            r7.<init>(r1)
            r3.zzd(r5, r7)
        L3b7:
            com.google.android.gms.internal.ads.zzbt r1 = r0.zzD
            com.google.android.gms.internal.ads.zzbw r3 = r0.zzg
            com.google.android.gms.internal.ads.zzbt r7 = r0.zzc
            int r10 = com.google.android.gms.internal.ads.zzeu.zza
            boolean r10 = r3.zzw()
            r12 = r3
            com.google.android.gms.internal.ads.zzj r12 = (com.google.android.gms.internal.ads.zzj) r12
            com.google.android.gms.internal.ads.zzcc r13 = r12.zzn()
            boolean r14 = r13.zzo()
            if (r14 != 0) goto L3e2
            int r14 = r12.zzd()
            com.google.android.gms.internal.ads.zzcb r15 = r12.zza
            r5 = 0
            com.google.android.gms.internal.ads.zzcb r13 = r13.zze(r14, r15, r5)
            boolean r5 = r13.zzh
            if (r5 == 0) goto L3e2
            r5 = 1
            goto L3e3
        L3e2:
            r5 = 0
        L3e3:
            com.google.android.gms.internal.ads.zzcc r6 = r12.zzn()
            boolean r13 = r6.zzo()
            if (r13 == 0) goto L3f2
            r13 = -1
            r14 = 0
        L3ef:
            r16 = 0
            goto L406
        L3f2:
            int r13 = r12.zzd()
            r12.zzh()
            r12.zzv()
            r14 = 0
            int r6 = r6.zzk(r13, r14, r14)
            r13 = -1
            if (r6 == r13) goto L3ef
            r16 = 1
        L406:
            com.google.android.gms.internal.ads.zzcc r6 = r12.zzn()
            boolean r15 = r6.zzo()
            if (r15 == 0) goto L412
        L410:
            r6 = 0
            goto L423
        L412:
            int r15 = r12.zzd()
            r12.zzh()
            r12.zzv()
            int r6 = r6.zzj(r15, r14, r14)
            if (r6 == r13) goto L410
            r6 = 1
        L423:
            com.google.android.gms.internal.ads.zzcc r13 = r12.zzn()
            boolean r15 = r13.zzo()
            if (r15 != 0) goto L441
            int r15 = r12.zzd()
            com.google.android.gms.internal.ads.zzcb r11 = r12.zza
            r8 = 0
            com.google.android.gms.internal.ads.zzcb r11 = r13.zze(r15, r11, r8)
            boolean r11 = r11.zzb()
            if (r11 == 0) goto L443
            r11 = 1
            goto L444
        L441:
            r8 = 0
        L443:
            r11 = 0
        L444:
            com.google.android.gms.internal.ads.zzcc r13 = r12.zzn()
            boolean r15 = r13.zzo()
            if (r15 != 0) goto L45e
            int r15 = r12.zzd()
            com.google.android.gms.internal.ads.zzcb r12 = r12.zza
            com.google.android.gms.internal.ads.zzcb r8 = r13.zze(r15, r12, r8)
            boolean r8 = r8.zzi
            if (r8 == 0) goto L45e
            r8 = 1
            goto L45f
        L45e:
            r8 = 0
        L45f:
            com.google.android.gms.internal.ads.zzcc r3 = r3.zzn()
            boolean r3 = r3.zzo()
            com.google.android.gms.internal.ads.zzbr r9 = new com.google.android.gms.internal.ads.zzbr
            r9.<init>()
            r9.zzb(r7)
            r7 = r10 ^ 1
            r9.zzd(r2, r7)
            if (r5 == 0) goto L47a
            if (r10 != 0) goto L47a
            r2 = 1
            goto L47b
        L47a:
            r2 = 0
        L47b:
            r9.zzd(r4, r2)
            if (r16 == 0) goto L484
            if (r10 != 0) goto L484
            r2 = 1
            goto L485
        L484:
            r2 = 0
        L485:
            r4 = 6
            r9.zzd(r4, r2)
            if (r3 != 0) goto L495
            if (r16 != 0) goto L491
            if (r11 == 0) goto L491
            if (r5 == 0) goto L495
        L491:
            if (r10 != 0) goto L495
            r2 = 1
            goto L496
        L495:
            r2 = 0
        L496:
            r4 = 7
            r9.zzd(r4, r2)
            if (r6 == 0) goto L4a0
            if (r10 != 0) goto L4a0
            r2 = 1
            goto L4a1
        L4a0:
            r2 = 0
        L4a1:
            r4 = 8
            r9.zzd(r4, r2)
            if (r3 != 0) goto L4b2
            if (r6 != 0) goto L4ae
            if (r11 == 0) goto L4b2
            if (r8 == 0) goto L4b2
        L4ae:
            if (r10 != 0) goto L4b2
            r11 = 1
            goto L4b3
        L4b2:
            r11 = 0
        L4b3:
            r2 = 9
            r9.zzd(r2, r11)
            r2 = 10
            r9.zzd(r2, r7)
            if (r5 == 0) goto L4c5
            if (r10 != 0) goto L4c5
            r2 = 11
            r11 = 1
            goto L4c8
        L4c5:
            r2 = 11
            r11 = 0
        L4c8:
            r9.zzd(r2, r11)
            if (r5 == 0) goto L4d3
            if (r10 != 0) goto L4d3
            r2 = 12
            r5 = 1
            goto L4d6
        L4d3:
            r2 = 12
            r5 = 0
        L4d6:
            r9.zzd(r2, r5)
            com.google.android.gms.internal.ads.zzbt r2 = r9.zze()
            r0.zzD = r2
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L4f1
            com.google.android.gms.internal.ads.zzdz r1 = r0.zzl
            r2 = 13
            com.google.android.gms.internal.ads.zzjh r3 = new com.google.android.gms.internal.ads.zzjh
            r3.<init>(r0)
            r1.zzd(r2, r3)
        L4f1:
            com.google.android.gms.internal.ads.zzdz r1 = r0.zzl
            r1.zzc()
            return
    }

    private final void zzah() {
            r2 = this;
            int r0 = r2.zzf()
            r1 = 2
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 == r1) goto Lb
            return
        Lb:
            r2.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r2.zzR
            boolean r0 = r0.zzp
            r2.zzu()
            r2.zzu()
            return
    }

    private final void zzai() {
            r4 = this;
            com.google.android.gms.internal.ads.zzdm r0 = r4.zze
            r0.zzb()
            android.os.Looper r0 = r4.zzr
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r0.getThread()
            if (r1 == r0) goto L51
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            android.os.Looper r1 = r4.zzr
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = r1.getName()
            r2 = 1
            r0[r2] = r1
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"
            java.lang.String r0 = java.lang.String.format(r1, r3, r0)
            boolean r1 = r4.zzN
            if (r1 != 0) goto L4b
            boolean r1 = r4.zzO
            if (r1 == 0) goto L3e
            r1 = 0
            goto L43
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
        L43:
            java.lang.String r3 = "ExoPlayerImpl"
            com.google.android.gms.internal.ads.zzea.zzg(r3, r0, r1)
            r4.zzO = r2
            return
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L51:
            return
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzA(com.google.android.gms.internal.ads.zzmd r2) {
            r1 = this;
            r1.zzai()
            com.google.android.gms.internal.ads.zzma r0 = r1.zzq
            r0.zzQ(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzB(com.google.android.gms.internal.ads.zzva r17) {
            r16 = this;
            r9 = r16
            r16.zzai()
            java.util.List r0 = java.util.Collections.singletonList(r17)
            r16.zzai()
            r16.zzai()
            com.google.android.gms.internal.ads.zzlk r1 = r9.zzR
            r9.zzR(r1)
            r16.zzk()
            int r1 = r9.zzy
            r2 = 1
            int r1 = r1 + r2
            r9.zzy = r1
            java.util.List r1 = r9.zzo
            boolean r1 = r1.isEmpty()
            r3 = 0
            if (r1 != 0) goto L40
            java.util.List r1 = r9.zzo
            int r1 = r1.size()
            int r4 = r1 + (-1)
        L2e:
            if (r4 < 0) goto L38
            java.util.List r5 = r9.zzo
            r5.remove(r4)
            int r4 = r4 + (-1)
            goto L2e
        L38:
            com.google.android.gms.internal.ads.zzwq r4 = r9.zzV
            com.google.android.gms.internal.ads.zzwq r1 = r4.zzh(r3, r1)
            r9.zzV = r1
        L40:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 0
        L46:
            int r4 = r0.size()
            if (r1 >= r4) goto L6d
            com.google.android.gms.internal.ads.zzlh r4 = new com.google.android.gms.internal.ads.zzlh
            java.lang.Object r5 = r0.get(r1)
            com.google.android.gms.internal.ads.zzva r5 = (com.google.android.gms.internal.ads.zzva) r5
            boolean r6 = r9.zzp
            r4.<init>(r5, r6)
            r11.add(r4)
            java.util.List r5 = r9.zzo
            java.lang.Object r6 = r4.zzb
            com.google.android.gms.internal.ads.zzut r4 = r4.zza
            com.google.android.gms.internal.ads.zzjy r7 = new com.google.android.gms.internal.ads.zzjy
            r7.<init>(r6, r4)
            r5.add(r1, r7)
            int r1 = r1 + 1
            goto L46
        L6d:
            com.google.android.gms.internal.ads.zzwq r0 = r9.zzV
            int r1 = r11.size()
            com.google.android.gms.internal.ads.zzwq r0 = r0.zzg(r3, r1)
            r9.zzV = r0
            java.util.List r0 = r9.zzo
            com.google.android.gms.internal.ads.zzlp r1 = new com.google.android.gms.internal.ads.zzlp
            com.google.android.gms.internal.ads.zzwq r4 = r9.zzV
            r1.<init>(r0, r4)
            boolean r0 = r1.zzo()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r0 != 0) goto L9b
            int r0 = r1.zzc()
            if (r0 < 0) goto L95
            goto L9b
        L95:
            com.google.android.gms.internal.ads.zzaj r0 = new com.google.android.gms.internal.ads.zzaj
            r0.<init>(r1, r6, r4)
            throw r0
        L9b:
            int r12 = r1.zzg(r3)
            com.google.android.gms.internal.ads.zzlk r0 = r9.zzR
            android.util.Pair r7 = r9.zzX(r1, r12, r4)
            com.google.android.gms.internal.ads.zzlk r0 = r9.zzY(r0, r1, r7)
            int r7 = r0.zze
            r8 = 4
            if (r12 == r6) goto Lc0
            if (r7 == r2) goto Lc0
            boolean r6 = r1.zzo()
            if (r6 != 0) goto Lbf
            int r1 = r1.zzc()
            if (r12 < r1) goto Lbd
            goto Lbf
        Lbd:
            r7 = 2
            goto Lc0
        Lbf:
            r7 = 4
        Lc0:
            com.google.android.gms.internal.ads.zzlk r1 = r0.zze(r7)
            com.google.android.gms.internal.ads.zzkk r10 = r9.zzk
            long r13 = com.google.android.gms.internal.ads.zzeu.zzr(r4)
            com.google.android.gms.internal.ads.zzwq r15 = r9.zzV
            r10.zzp(r11, r12, r13, r15)
            com.google.android.gms.internal.ads.zzlk r0 = r9.zzR
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzb
            java.lang.Object r0 = r0.zza
            com.google.android.gms.internal.ads.zzuy r4 = r1.zzb
            java.lang.Object r4 = r4.zza
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Lea
            com.google.android.gms.internal.ads.zzlk r0 = r9.zzR
            com.google.android.gms.internal.ads.zzcc r0 = r0.zza
            boolean r0 = r0.zzo()
            if (r0 != 0) goto Lea
            r3 = 1
        Lea:
            r2 = 0
            r4 = 4
            long r5 = r9.zzU(r1)
            r7 = -1
            r8 = 0
            r0 = r16
            r0.zzag(r1, r2, r3, r4, r5, r7, r8)
            return
    }

    public final com.google.android.gms.internal.ads.zzij zzE() {
            r1 = this;
            r1.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r1.zzR
            com.google.android.gms.internal.ads.zzij r0 = r0.zzf
            return r0
    }

    final /* synthetic */ void zzN(com.google.android.gms.internal.ads.zzki r12) {
            r11 = this;
            int r1 = r11.zzy
            int r2 = r12.zzb
            int r1 = r1 - r2
            r11.zzy = r1
            boolean r2 = r12.zzc
            r3 = 1
            if (r2 == 0) goto L12
            int r2 = r12.zzd
            r11.zzz = r2
            r11.zzA = r3
        L12:
            if (r1 != 0) goto Lc0
            com.google.android.gms.internal.ads.zzlk r1 = r12.zza
            com.google.android.gms.internal.ads.zzcc r1 = r1.zza
            com.google.android.gms.internal.ads.zzlk r2 = r11.zzR
            com.google.android.gms.internal.ads.zzcc r2 = r2.zza
            boolean r2 = r2.zzo()
            if (r2 != 0) goto L2f
            boolean r2 = r1.zzo()
            if (r2 == 0) goto L2f
            r2 = -1
            r11.zzS = r2
            r4 = 0
            r11.zzT = r4
        L2f:
            boolean r2 = r1.zzo()
            r4 = 0
            if (r2 != 0) goto L6a
            r2 = r1
            com.google.android.gms.internal.ads.zzlp r2 = (com.google.android.gms.internal.ads.zzlp) r2
            java.util.List r2 = r2.zzw()
            int r5 = r2.size()
            java.util.List r6 = r11.zzo
            int r6 = r6.size()
            if (r5 != r6) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            com.google.android.gms.internal.ads.zzdi.zzf(r5)
            r5 = 0
        L50:
            int r6 = r2.size()
            if (r5 >= r6) goto L6a
            java.util.List r6 = r11.zzo
            java.lang.Object r6 = r6.get(r5)
            com.google.android.gms.internal.ads.zzjy r6 = (com.google.android.gms.internal.ads.zzjy) r6
            java.lang.Object r7 = r2.get(r5)
            com.google.android.gms.internal.ads.zzcc r7 = (com.google.android.gms.internal.ads.zzcc) r7
            r6.zzc(r7)
            int r5 = r5 + 1
            goto L50
        L6a:
            boolean r2 = r11.zzA
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzlk r2 = r12.zza
            com.google.android.gms.internal.ads.zzuy r2 = r2.zzb
            com.google.android.gms.internal.ads.zzlk r7 = r11.zzR
            com.google.android.gms.internal.ads.zzuy r7 = r7.zzb
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L8f
            com.google.android.gms.internal.ads.zzlk r2 = r12.zza
            long r7 = r2.zzd
            com.google.android.gms.internal.ads.zzlk r2 = r11.zzR
            long r9 = r2.zzs
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L8e
            goto L8f
        L8e:
            r3 = 0
        L8f:
            if (r3 == 0) goto Lb3
            boolean r2 = r1.zzo()
            if (r2 != 0) goto Lac
            com.google.android.gms.internal.ads.zzlk r2 = r12.zza
            com.google.android.gms.internal.ads.zzuy r2 = r2.zzb
            boolean r2 = r2.zzb()
            if (r2 == 0) goto La2
            goto Lac
        La2:
            com.google.android.gms.internal.ads.zzlk r2 = r12.zza
            com.google.android.gms.internal.ads.zzuy r5 = r2.zzb
            long r6 = r2.zzd
            r11.zzW(r1, r5, r6)
            goto Lb0
        Lac:
            com.google.android.gms.internal.ads.zzlk r1 = r12.zza
            long r6 = r1.zzd
        Lb0:
            r5 = r6
            goto Lb3
        Lb2:
            r3 = 0
        Lb3:
            r11.zzA = r4
            com.google.android.gms.internal.ads.zzlk r1 = r12.zza
            r2 = 1
            int r4 = r11.zzz
            r7 = -1
            r8 = 0
            r0 = r11
            r0.zzag(r1, r2, r3, r4, r5, r7, r8)
        Lc0:
            return
    }

    final /* synthetic */ void zzO(com.google.android.gms.internal.ads.zzki r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjd r0 = new com.google.android.gms.internal.ads.zzjd
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzdt r2 = r1.zzj
            r2.zzh(r0)
            return
    }

    final /* synthetic */ void zzP(com.google.android.gms.internal.ads.zzbu r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbt r0 = r1.zzD
            r2.zza(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final void zza(int r10, long r11, int r13, boolean r14) {
            r9 = this;
            r9.zzai()
            r13 = -1
            if (r10 != r13) goto L7
            goto L21
        L7:
            r13 = 1
            if (r10 < 0) goto Lc
            r14 = 1
            goto Ld
        Lc:
            r14 = 0
        Ld:
            com.google.android.gms.internal.ads.zzdi.zzd(r14)
            com.google.android.gms.internal.ads.zzlk r14 = r9.zzR
            com.google.android.gms.internal.ads.zzcc r14 = r14.zza
            boolean r0 = r14.zzo()
            if (r0 != 0) goto L22
            int r0 = r14.zzc()
            if (r10 >= r0) goto L21
            goto L22
        L21:
            return
        L22:
            com.google.android.gms.internal.ads.zzma r0 = r9.zzq
            r0.zzu()
            int r0 = r9.zzy
            int r0 = r0 + r13
            r9.zzy = r0
            boolean r0 = r9.zzw()
            if (r0 == 0) goto L4b
            java.lang.String r10 = "ExoPlayerImpl"
            java.lang.String r11 = "seekTo ignored because an ad is playing"
            com.google.android.gms.internal.ads.zzea.zzf(r10, r11)
            com.google.android.gms.internal.ads.zzki r10 = new com.google.android.gms.internal.ads.zzki
            com.google.android.gms.internal.ads.zzlk r11 = r9.zzR
            r10.<init>(r11)
            r10.zza(r13)
            com.google.android.gms.internal.ads.zzjg r11 = r9.zzU
            com.google.android.gms.internal.ads.zzjz r11 = r11.zza
            r11.zzO(r10)
            return
        L4b:
            com.google.android.gms.internal.ads.zzlk r13 = r9.zzR
            int r0 = r13.zze
            r1 = 3
            if (r0 == r1) goto L5b
            r1 = 4
            if (r0 != r1) goto L62
            boolean r0 = r14.zzo()
            if (r0 != 0) goto L62
        L5b:
            com.google.android.gms.internal.ads.zzlk r13 = r9.zzR
            r0 = 2
            com.google.android.gms.internal.ads.zzlk r13 = r13.zze(r0)
        L62:
            int r7 = r9.zzd()
            android.util.Pair r0 = r9.zzX(r14, r10, r11)
            com.google.android.gms.internal.ads.zzlk r1 = r9.zzY(r13, r14, r0)
            r2 = 0
            r3 = 1
            r4 = 1
            com.google.android.gms.internal.ads.zzkk r13 = r9.zzk
            long r11 = com.google.android.gms.internal.ads.zzeu.zzr(r11)
            r13.zzk(r14, r10, r11)
            long r5 = r9.zzU(r1)
            r8 = 0
            r0 = r9
            r0.zzag(r1, r2, r3, r4, r5, r7, r8)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzb() {
            r1 = this;
            r1.zzai()
            boolean r0 = r1.zzw()
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.zzlk r0 = r1.zzR
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzb
            int r0 = r0.zzb
            return r0
        L10:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzc() {
            r1 = this;
            r1.zzai()
            boolean r0 = r1.zzw()
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.zzlk r0 = r1.zzR
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzb
            int r0 = r0.zzc
            return r0
        L10:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzd() {
            r2 = this;
            r2.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r2.zzR
            int r0 = r2.zzR(r0)
            r1 = -1
            if (r0 != r1) goto Ld
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zze() {
            r2 = this;
            r2.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r2.zzR
            com.google.android.gms.internal.ads.zzcc r0 = r0.zza
            boolean r0 = r0.zzo()
            if (r0 == 0) goto Lf
            r0 = 0
            return r0
        Lf:
            com.google.android.gms.internal.ads.zzlk r0 = r2.zzR
            com.google.android.gms.internal.ads.zzcc r1 = r0.zza
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzb
            java.lang.Object r0 = r0.zza
            int r0 = r1.zza(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzf() {
            r1 = this;
            r1.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r1.zzR
            int r0 = r0.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzg() {
            r1 = this;
            r1.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r1.zzR
            int r0 = r0.zzn
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzh() {
            r1 = this;
            r1.zzai()
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzi() {
            r8 = this;
            r8.zzai()
            boolean r0 = r8.zzw()
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzlk r0 = r8.zzR
            com.google.android.gms.internal.ads.zzuy r1 = r0.zzk
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzb
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            com.google.android.gms.internal.ads.zzlk r0 = r8.zzR
            long r0 = r0.zzq
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r0)
            goto L88
        L1e:
            long r0 = r8.zzl()
            goto L88
        L23:
            r8.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r8.zzR
            com.google.android.gms.internal.ads.zzcc r0 = r0.zza
            boolean r0 = r0.zzo()
            if (r0 == 0) goto L33
            long r0 = r8.zzT
            goto L88
        L33:
            com.google.android.gms.internal.ads.zzlk r0 = r8.zzR
            com.google.android.gms.internal.ads.zzuy r1 = r0.zzk
            long r1 = r1.zzd
            com.google.android.gms.internal.ads.zzuy r3 = r0.zzb
            long r3 = r3.zzd
            r5 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L56
            com.google.android.gms.internal.ads.zzcc r0 = r0.zza
            int r1 = r8.zzd()
            com.google.android.gms.internal.ads.zzcb r2 = r8.zza
            com.google.android.gms.internal.ads.zzcb r0 = r0.zze(r1, r2, r5)
            long r0 = r0.zzm
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r0)
            goto L88
        L56:
            long r0 = r0.zzq
            com.google.android.gms.internal.ads.zzlk r2 = r8.zzR
            com.google.android.gms.internal.ads.zzuy r2 = r2.zzk
            boolean r2 = r2.zzb()
            if (r2 == 0) goto L7a
            com.google.android.gms.internal.ads.zzlk r0 = r8.zzR
            com.google.android.gms.internal.ads.zzcc r1 = r0.zza
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzk
            java.lang.Object r0 = r0.zza
            com.google.android.gms.internal.ads.zzca r2 = r8.zzn
            com.google.android.gms.internal.ads.zzca r0 = r1.zzn(r0, r2)
            com.google.android.gms.internal.ads.zzlk r1 = r8.zzR
            com.google.android.gms.internal.ads.zzuy r1 = r1.zzk
            int r1 = r1.zzb
            r0.zzg(r1)
            goto L7b
        L7a:
            r5 = r0
        L7b:
            com.google.android.gms.internal.ads.zzlk r0 = r8.zzR
            com.google.android.gms.internal.ads.zzcc r1 = r0.zza
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzk
            r8.zzW(r1, r0, r5)
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r5)
        L88:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzj() {
            r2 = this;
            r2.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r2.zzR
            long r0 = r2.zzT(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzk() {
            r2 = this;
            r2.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r2.zzR
            long r0 = r2.zzU(r0)
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzl() {
            r5 = this;
            r5.zzai()
            boolean r0 = r5.zzw()
            if (r0 != 0) goto L2c
            com.google.android.gms.internal.ads.zzcc r0 = r5.zzn()
            boolean r1 = r0.zzo()
            if (r1 == 0) goto L19
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
        L19:
            int r1 = r5.zzd()
            com.google.android.gms.internal.ads.zzcb r2 = r5.zza
            r3 = 0
            com.google.android.gms.internal.ads.zzcb r0 = r0.zze(r1, r2, r3)
            long r0 = r0.zzm
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r0)
            return r0
        L2c:
            com.google.android.gms.internal.ads.zzlk r0 = r5.zzR
            com.google.android.gms.internal.ads.zzuy r1 = r0.zzb
            com.google.android.gms.internal.ads.zzcc r0 = r0.zza
            java.lang.Object r2 = r1.zza
            com.google.android.gms.internal.ads.zzca r3 = r5.zzn
            r0.zzn(r2, r3)
            com.google.android.gms.internal.ads.zzca r0 = r5.zzn
            int r2 = r1.zzb
            int r1 = r1.zzc
            long r0 = r0.zzf(r2, r1)
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzm() {
            r2 = this;
            r2.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r2.zzR
            long r0 = r0.zzr
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final com.google.android.gms.internal.ads.zzcc zzn() {
            r1 = this;
            r1.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r1.zzR
            com.google.android.gms.internal.ads.zzcc r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final com.google.android.gms.internal.ads.zzck zzo() {
            r1 = this;
            r1.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r1.zzR
            com.google.android.gms.internal.ads.zzys r0 = r0.zzi
            com.google.android.gms.internal.ads.zzck r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzp() {
            r12 = this;
            r12.zzai()
            com.google.android.gms.internal.ads.zzhy r0 = r12.zzw
            boolean r1 = r12.zzu()
            r2 = 2
            r0.zzb(r1, r2)
            r0 = 1
            int r3 = zzS(r0)
            r12.zzaf(r1, r0, r3)
            com.google.android.gms.internal.ads.zzlk r1 = r12.zzR
            int r3 = r1.zze
            if (r3 == r0) goto L1c
            return
        L1c:
            r3 = 0
            com.google.android.gms.internal.ads.zzlk r1 = r1.zzd(r3)
            com.google.android.gms.internal.ads.zzcc r3 = r1.zza
            boolean r3 = r3.zzo()
            if (r0 == r3) goto L2a
            goto L2b
        L2a:
            r2 = 4
        L2b:
            com.google.android.gms.internal.ads.zzlk r4 = r1.zze(r2)
            int r1 = r12.zzy
            int r1 = r1 + r0
            r12.zzy = r1
            com.google.android.gms.internal.ads.zzkk r0 = r12.zzk
            r0.zzj()
            r5 = 1
            r6 = 0
            r7 = 5
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = -1
            r11 = 0
            r3 = r12
            r3.zzag(r4, r5, r6, r7, r8, r10, r11)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzq(boolean r3) {
            r2 = this;
            r2.zzai()
            int r0 = r2.zzf()
            com.google.android.gms.internal.ads.zzhy r1 = r2.zzw
            r1.zzb(r3, r0)
            r0 = 1
            int r1 = zzS(r0)
            r2.zzaf(r3, r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzr(android.view.Surface r1) {
            r0 = this;
            r0.zzai()
            r0.zzad(r1)
            if (r1 != 0) goto La
            r1 = 0
            goto Lb
        La:
            r1 = -1
        Lb:
            r0.zzaa(r1, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzs(float r4) {
            r3 = this;
            r3.zzai()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r4, r0)
            r0 = 0
            float r4 = java.lang.Math.max(r0, r4)
            float r0 = r3.zzL
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L15
            return
        L15:
            r3.zzL = r4
            r3.zzac()
            com.google.android.gms.internal.ads.zzdz r0 = r3.zzl
            r1 = 22
            com.google.android.gms.internal.ads.zzja r2 = new com.google.android.gms.internal.ads.zzja
            r2.<init>(r4)
            r0.zzd(r1, r2)
            r0.zzc()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzt() {
            r3 = this;
            r3.zzai()
            com.google.android.gms.internal.ads.zzhy r0 = r3.zzw
            boolean r1 = r3.zzu()
            r2 = 1
            r0.zzb(r1, r2)
            r0 = 0
            r3.zzae(r0)
            int r0 = com.google.android.gms.internal.ads.zzdc.zza
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            com.google.android.gms.internal.ads.zzlk r1 = r3.zzR
            long r1 = r1.zzs
            com.google.android.gms.internal.ads.zzgax.zzl(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzu() {
            r1 = this;
            r1.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r1.zzR
            boolean r0 = r0.zzl
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzv() {
            r1 = this;
            r1.zzai()
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzw() {
            r1 = this;
            r1.zzai()
            com.google.android.gms.internal.ads.zzlk r0 = r1.zzR
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzb
            boolean r0 = r0.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zzx() {
            r1 = this;
            r1.zzai()
            com.google.android.gms.internal.ads.zzlr[] r0 = r1.zzh
            int r0 = r0.length
            r0 = 2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzy(com.google.android.gms.internal.ads.zzmd r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzma r0 = r1.zzq
            r0.zzt(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzz() {
            r5 = this;
            int r0 = java.lang.System.identityHashCode(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeu.zze
            java.lang.String r2 = com.google.android.gms.internal.ads.zzbd.zza()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Release "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " [AndroidXMedia3/1.4.0] ["
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "] ["
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "ExoPlayerImpl"
            com.google.android.gms.internal.ads.zzea.zze(r1, r0)
            r5.zzai()
            com.google.android.gms.internal.ads.zzhy r0 = r5.zzw
            r0.zzd()
            com.google.android.gms.internal.ads.zzkk r0 = r5.zzk
            boolean r0 = r0.zzo()
            if (r0 != 0) goto L58
            com.google.android.gms.internal.ads.zzdz r0 = r5.zzl
            r1 = 10
            com.google.android.gms.internal.ads.zzjc r2 = new com.google.android.gms.internal.ads.zzjc
            r2.<init>()
            r0.zzd(r1, r2)
            r0.zzc()
        L58:
            com.google.android.gms.internal.ads.zzdz r0 = r5.zzl
            r0.zze()
            com.google.android.gms.internal.ads.zzdt r0 = r5.zzj
            r1 = 0
            r0.zze(r1)
            com.google.android.gms.internal.ads.zzyz r0 = r5.zzs
            com.google.android.gms.internal.ads.zzma r2 = r5.zzq
            r0.zzg(r2)
            com.google.android.gms.internal.ads.zzlk r0 = r5.zzR
            boolean r2 = r0.zzp
            r2 = 1
            com.google.android.gms.internal.ads.zzlk r0 = r0.zze(r2)
            r5.zzR = r0
            com.google.android.gms.internal.ads.zzuy r2 = r0.zzb
            com.google.android.gms.internal.ads.zzlk r0 = r0.zza(r2)
            r5.zzR = r0
            long r2 = r0.zzs
            r0.zzq = r2
            com.google.android.gms.internal.ads.zzlk r0 = r5.zzR
            r2 = 0
            r0.zzr = r2
            com.google.android.gms.internal.ads.zzma r0 = r5.zzq
            r0.zzP()
            com.google.android.gms.internal.ads.zzyr r0 = r5.zzi
            r0.zzj()
            android.view.Surface r0 = r5.zzG
            if (r0 == 0) goto L9a
            r0.release()
            r5.zzG = r1
        L9a:
            int r0 = com.google.android.gms.internal.ads.zzdc.zza
            return
    }
}
