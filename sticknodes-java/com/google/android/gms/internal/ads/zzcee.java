package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcee extends com.google.android.gms.internal.ads.zzcdv implements com.google.android.gms.internal.ads.zzcbz {
    public static final /* synthetic */ int zzd = 0;
    private com.google.android.gms.internal.ads.zzcca zze;
    private java.lang.String zzf;
    private boolean zzg;
    private boolean zzh;
    private com.google.android.gms.internal.ads.zzcdn zzi;
    private long zzj;
    private long zzk;

    public zzcee(com.google.android.gms.internal.ads.zzccj r4, com.google.android.gms.internal.ads.zzcci r5) {
            r3 = this;
            r3.<init>(r4)
            android.content.Context r4 = r4.getContext()
            com.google.android.gms.internal.ads.zzcew r0 = new com.google.android.gms.internal.ads.zzcew
            java.lang.ref.WeakReference r1 = r3.zzc
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.zzccj r1 = (com.google.android.gms.internal.ads.zzccj) r1
            r2 = 0
            r0.<init>(r4, r5, r1, r2)
            java.lang.String r4 = "ExoPlayerAdapter initialized."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r4)
            r3.zze = r0
            r0.zzL(r3)
            return
    }

    protected static final java.lang.String zzc(java.lang.String r1) {
            java.lang.String r1 = com.google.android.gms.ads.internal.util.client.zzf.zzf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "cache:"
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    private static java.lang.String zzd(java.lang.String r2, java.lang.Exception r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            return r2
    }

    private final void zzx(long r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzced r1 = new com.google.android.gms.internal.ads.zzced
            r1.<init>(r2)
            r0.postDelayed(r1, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv, com.google.android.gms.common.api.Releasable
    public final void release() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r2.zze
            if (r0 == 0) goto Ld
            r1 = 0
            r0.zzL(r1)
            com.google.android.gms.internal.ads.zzcca r0 = r2.zze
            r0.zzH()
        Ld:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzD(int r1, int r2) {
            r0 = this;
            return
    }

    public final com.google.android.gms.internal.ads.zzcca zza() {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r2.zzh = r0     // Catch: java.lang.Throwable -> L13
            r2.notify()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzcca r0 = r2.zze
            r1 = 0
            r0.zzL(r1)
            com.google.android.gms.internal.ads.zzcca r0 = r2.zze
            r2.zze = r1
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    final /* synthetic */ void zzb() {
            r32 = this;
            r15 = r32
            java.lang.String r0 = r15.zzf
            java.lang.String r13 = zzc(r0)
            java.lang.String r17 = "error"
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzE     // Catch: java.lang.Exception -> L16d
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L16d
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Exception -> L16d
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Exception -> L16d
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L16d
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzq     // Catch: java.lang.Exception -> L16d
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L16d
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L16d
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L16d
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L16d
            long r11 = (long) r2     // Catch: java.lang.Exception -> L16d
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzbT     // Catch: java.lang.Exception -> L16d
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L16d
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L16d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L16d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L16d
            monitor-enter(r32)     // Catch: java.lang.Exception -> L16d
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L166
            long r3 = r3.currentTimeMillis()     // Catch: java.lang.Throwable -> L166
            long r5 = r15.zzj     // Catch: java.lang.Throwable -> L166
            long r3 = r3 - r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L140
            boolean r0 = r15.zzg     // Catch: java.lang.Throwable -> L166
            if (r0 != 0) goto L130
            boolean r0 = r15.zzh     // Catch: java.lang.Throwable -> L166
            if (r0 == 0) goto L5b
            monitor-exit(r32)     // Catch: java.lang.Throwable -> L166
            r2 = r15
            goto L1a9
        L5b:
            com.google.android.gms.internal.ads.zzcca r0 = r15.zze     // Catch: java.lang.Throwable -> L166
            boolean r0 = r0.zzV()     // Catch: java.lang.Throwable -> L166
            if (r0 == 0) goto L124
            com.google.android.gms.internal.ads.zzcca r0 = r15.zze     // Catch: java.lang.Throwable -> L166
            long r9 = r0.zzz()     // Catch: java.lang.Throwable -> L166
            r18 = 0
            int r0 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r0 <= 0) goto L10d
            com.google.android.gms.internal.ads.zzcca r0 = r15.zze     // Catch: java.lang.Throwable -> L166
            long r6 = r0.zzv()     // Catch: java.lang.Throwable -> L166
            long r0 = r15.zzk     // Catch: java.lang.Throwable -> L166
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto Le0
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L82
            r0 = 1
            r8 = 1
            goto L84
        L82:
            r0 = 0
            r8 = 0
        L84:
            java.lang.String r0 = r15.zzf     // Catch: java.lang.Throwable -> Ldb
            r3 = -1
            if (r2 == 0) goto L91
            com.google.android.gms.internal.ads.zzcca r1 = r15.zze     // Catch: java.lang.Throwable -> L166
            long r20 = r1.zzA()     // Catch: java.lang.Throwable -> L166
            goto L93
        L91:
            r20 = r3
        L93:
            if (r2 == 0) goto L9c
            com.google.android.gms.internal.ads.zzcca r1 = r15.zze     // Catch: java.lang.Throwable -> L166
            long r22 = r1.zzx()     // Catch: java.lang.Throwable -> L166
            goto L9e
        L9c:
            r22 = r3
        L9e:
            if (r2 == 0) goto La9
            com.google.android.gms.internal.ads.zzcca r1 = r15.zze     // Catch: java.lang.Throwable -> L166
            long r1 = r1.zzB()     // Catch: java.lang.Throwable -> L166
            r24 = r1
            goto Lab
        La9:
            r24 = r3
        Lab:
            int r16 = com.google.android.gms.internal.ads.zzcca.zzs()     // Catch: java.lang.Throwable -> Ldb
            int r26 = com.google.android.gms.internal.ads.zzcca.zzu()     // Catch: java.lang.Throwable -> Ldb
            r1 = r32
            r2 = r0
            r3 = r13
            r4 = r6
            r27 = r6
            r6 = r9
            r29 = r9
            r9 = r20
            r20 = r11
            r11 = r22
            r31 = r13
            r13 = r24
            r15 = r16
            r16 = r26
            r1.zzo(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch: java.lang.Throwable -> Ld7
            r2 = r32
            r0 = r27
            r2.zzk = r0     // Catch: java.lang.Throwable -> Lf5
            r3 = r29
            goto Le7
        Ld7:
            r0 = move-exception
            r2 = r32
            goto Lf6
        Ldb:
            r0 = move-exception
            r2 = r15
            r5 = r13
            goto L169
        Le0:
            r0 = r6
            r20 = r11
            r31 = r13
            r2 = r15
            r3 = r9
        Le7:
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto Lfa
            java.lang.String r0 = r2.zzf     // Catch: java.lang.Throwable -> Lf5
            r5 = r31
            r2.zzj(r0, r5, r3)     // Catch: java.lang.Throwable -> L164
            monitor-exit(r32)     // Catch: java.lang.Throwable -> L164
            goto L1a9
        Lf5:
            r0 = move-exception
        Lf6:
            r5 = r31
            goto L169
        Lfa:
            r5 = r31
            com.google.android.gms.internal.ads.zzcca r3 = r2.zze     // Catch: java.lang.Throwable -> L164
            long r3 = r3.zzw()     // Catch: java.lang.Throwable -> L164
            int r6 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r6 < 0) goto L10f
            int r3 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r3 <= 0) goto L10f
            monitor-exit(r32)     // Catch: java.lang.Throwable -> L164
            goto L1a9
        L10d:
            r5 = r13
            r2 = r15
        L10f:
            monitor-exit(r32)     // Catch: java.lang.Throwable -> L164
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzF
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.zzx(r0)
            return
        L124:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L13c
            java.lang.String r3 = "ExoPlayer was released during preloading."
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L13c
            throw r0     // Catch: java.lang.Throwable -> L13c
        L130:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L13c
            java.lang.String r3 = "Abort requested before buffering finished. "
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L13c
            throw r0     // Catch: java.lang.Throwable -> L13c
        L13c:
            r0 = move-exception
            r17 = r1
            goto L169
        L140:
            r5 = r13
            r2 = r15
            java.lang.String r3 = "downloadTimeout"
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L160
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L160
            r6.<init>()     // Catch: java.lang.Throwable -> L160
            java.lang.String r7 = "Timeout reached. Limit: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L160
            r6.append(r0)     // Catch: java.lang.Throwable -> L160
            java.lang.String r0 = " ms"
            r6.append(r0)     // Catch: java.lang.Throwable -> L160
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L160
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L160
            throw r4     // Catch: java.lang.Throwable -> L160
        L160:
            r0 = move-exception
            r17 = r3
            goto L169
        L164:
            r0 = move-exception
            goto L169
        L166:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L169:
            monitor-exit(r32)     // Catch: java.lang.Throwable -> L164
            throw r0     // Catch: java.lang.Exception -> L16b
        L16b:
            r0 = move-exception
            goto L170
        L16d:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L170:
            r1 = r17
            java.lang.String r3 = r2.zzf
            java.lang.String r4 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to preload url "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " Exception: "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            java.lang.String r3 = "VideoStreamExoPlayerCache.preload"
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()
            r4.zzv(r0, r3)
            r32.release()
            java.lang.String r0 = zzd(r1, r0)
            java.lang.String r3 = r2.zzf
            r2.zzg(r3, r5, r1, r0)
        L1a9:
            com.google.android.gms.internal.ads.zzcdo r0 = com.google.android.gms.ads.internal.zzu.zzy()
            com.google.android.gms.internal.ads.zzcdn r1 = r2.zzi
            r0.zzc(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzf() {
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            r4.zzg = r0     // Catch: java.lang.Throwable -> L1d
            r4.notify()     // Catch: java.lang.Throwable -> L1d
            r4.release()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r4.zzf
            if (r0 == 0) goto L1c
            java.lang.String r0 = zzc(r0)
            java.lang.String r1 = r4.zzf
            java.lang.String r2 = "externalAbort"
            java.lang.String r3 = "Programmatic precache abort."
            r4.zzg(r1, r0, r2, r3)
        L1c:
            return
        L1d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzi(boolean r4, long r5) {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.zzc
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzccj r0 = (com.google.android.gms.internal.ads.zzccj) r0
            if (r0 == 0) goto L14
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzcec r2 = new com.google.android.gms.internal.ads.zzcec
            r2.<init>(r0, r4, r5)
            r1.execute(r2)
        L14:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzk(java.lang.String r2, java.lang.Exception r3) {
            r1 = this;
            java.lang.String r2 = "Precache error"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r3)
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "VideoStreamExoPlayerCache.onError"
            r2.zzv(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzl(java.lang.String r2, java.lang.Exception r3) {
            r1 = this;
            java.lang.String r2 = "Precache exception"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r3)
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "VideoStreamExoPlayerCache.onException"
            r2.zzv(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzm(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzp(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zze
            r0.zzJ(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzq(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zze
            r0.zzK(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzr(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zze
            r0.zzM(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzs(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zze
            r0.zzN(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzt(java.lang.String r3) {
            r2 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            boolean r3 = r2.zzu(r3, r0)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzu(java.lang.String r46, java.lang.String[] r47) {
            r45 = this;
            r15 = r45
            r13 = r46
            r0 = r47
            r15.zzf = r13
            java.lang.String r17 = "error"
            java.lang.String r14 = zzc(r46)
            r18 = 0
            int r1 = r0.length     // Catch: java.lang.Exception -> L1c8
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch: java.lang.Exception -> L1c8
            r2 = 0
        L14:
            int r3 = r0.length     // Catch: java.lang.Exception -> L1c8
            if (r2 >= r3) goto L22
            r3 = r0[r2]     // Catch: java.lang.Exception -> L1c8
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L1c8
            r1[r2] = r3     // Catch: java.lang.Exception -> L1c8
            int r2 = r2 + 1
            goto L14
        L22:
            com.google.android.gms.internal.ads.zzcca r0 = r15.zze     // Catch: java.lang.Exception -> L1c8
            java.lang.String r2 = r15.zzb     // Catch: java.lang.Exception -> L1c8
            r0.zzF(r1, r2)     // Catch: java.lang.Exception -> L1c8
            java.lang.ref.WeakReference r0 = r15.zzc     // Catch: java.lang.Exception -> L1c8
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1c8
            com.google.android.gms.internal.ads.zzccj r0 = (com.google.android.gms.internal.ads.zzccj) r0     // Catch: java.lang.Exception -> L1c8
            if (r0 == 0) goto L36
            r0.zzt(r14, r15)     // Catch: java.lang.Exception -> L1c8
        L36:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Exception -> L1c8
            long r19 = r0.currentTimeMillis()     // Catch: java.lang.Exception -> L1c8
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzF     // Catch: java.lang.Exception -> L1c8
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L1c8
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> L1c8
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Exception -> L1c8
            long r11 = r1.longValue()     // Catch: java.lang.Exception -> L1c8
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzE     // Catch: java.lang.Exception -> L1c8
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L1c8
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> L1c8
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Exception -> L1c8
            long r1 = r1.longValue()     // Catch: java.lang.Exception -> L1c8
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r1 * r3
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzq     // Catch: java.lang.Exception -> L1c8
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L1c8
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> L1c8
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L1c8
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L1c8
            long r6 = (long) r1     // Catch: java.lang.Exception -> L1c8
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbT     // Catch: java.lang.Exception -> L1c8
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L1c8
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> L1c8
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L1c8
            boolean r21 = r1.booleanValue()     // Catch: java.lang.Exception -> L1c8
            r22 = -1
            r1 = r22
        L87:
            monitor-enter(r45)     // Catch: java.lang.Exception -> L1c8
            long r3 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> L1c0
            long r3 = r3 - r19
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L195
            boolean r3 = r15.zzg     // Catch: java.lang.Throwable -> L1c0
            if (r3 != 0) goto L188
            boolean r3 = r15.zzh     // Catch: java.lang.Throwable -> L1c0
            r24 = 1
            if (r3 == 0) goto La0
            monitor-exit(r45)     // Catch: java.lang.Throwable -> L1c0
            r5 = r15
            goto L157
        La0:
            com.google.android.gms.internal.ads.zzcca r3 = r15.zze     // Catch: java.lang.Throwable -> L1c0
            boolean r3 = r3.zzV()     // Catch: java.lang.Throwable -> L1c0
            if (r3 == 0) goto L17b
            com.google.android.gms.internal.ads.zzcca r3 = r15.zze     // Catch: java.lang.Throwable -> L1c0
            long r4 = r3.zzz()     // Catch: java.lang.Throwable -> L1c0
            r25 = 0
            int r3 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r3 <= 0) goto L15b
            com.google.android.gms.internal.ads.zzcca r3 = r15.zze     // Catch: java.lang.Throwable -> L1c0
            long r27 = r3.zzv()     // Catch: java.lang.Throwable -> L1c0
            int r3 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r3 == 0) goto L12a
            int r1 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r1 <= 0) goto Lc4
            r8 = 1
            goto Lc5
        Lc4:
            r8 = 0
        Lc5:
            if (r21 == 0) goto Ld0
            com.google.android.gms.internal.ads.zzcca r1 = r15.zze     // Catch: java.lang.Throwable -> L1c0
            long r1 = r1.zzA()     // Catch: java.lang.Throwable -> L1c0
            r29 = r1
            goto Ld2
        Ld0:
            r29 = r22
        Ld2:
            if (r21 == 0) goto Ldd
            com.google.android.gms.internal.ads.zzcca r1 = r15.zze     // Catch: java.lang.Throwable -> L1c0
            long r1 = r1.zzx()     // Catch: java.lang.Throwable -> L1c0
            r31 = r1
            goto Ldf
        Ldd:
            r31 = r22
        Ldf:
            if (r21 == 0) goto Lea
            com.google.android.gms.internal.ads.zzcca r1 = r15.zze     // Catch: java.lang.Throwable -> L1c0
            long r1 = r1.zzB()     // Catch: java.lang.Throwable -> L1c0
            r33 = r1
            goto Lec
        Lea:
            r33 = r22
        Lec:
            int r16 = com.google.android.gms.internal.ads.zzcca.zzs()     // Catch: java.lang.Throwable -> L122
            int r35 = com.google.android.gms.internal.ads.zzcca.zzu()     // Catch: java.lang.Throwable -> L122
            r1 = r45
            r2 = r46
            r3 = r14
            r36 = r4
            r4 = r27
            r38 = r6
            r6 = r36
            r40 = r9
            r9 = r29
            r42 = r11
            r11 = r31
            r44 = r14
            r13 = r33
            r15 = r16
            r16 = r35
            r1.zzo(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch: java.lang.Throwable -> L119
            r1 = r27
            r3 = r36
            goto L133
        L119:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r44
            goto L1c4
        L122:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r14
            goto L1c4
        L12a:
            r38 = r6
            r40 = r9
            r42 = r11
            r44 = r14
            r3 = r4
        L133:
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 < 0) goto L142
            r5 = r45
            r6 = r46
            r7 = r44
            r5.zzj(r6, r7, r3)     // Catch: java.lang.Throwable -> L1be
            monitor-exit(r45)     // Catch: java.lang.Throwable -> L1be
            goto L157
        L142:
            r5 = r45
            r6 = r46
            r7 = r44
            com.google.android.gms.internal.ads.zzcca r3 = r5.zze     // Catch: java.lang.Throwable -> L1be
            long r3 = r3.zzw()     // Catch: java.lang.Throwable -> L1be
            int r8 = (r3 > r38 ? 1 : (r3 == r38 ? 0 : -1))
            if (r8 < 0) goto L158
            int r3 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r3 <= 0) goto L158
            monitor-exit(r45)     // Catch: java.lang.Throwable -> L1be
        L157:
            return r24
        L158:
            r3 = r42
            goto L163
        L15b:
            r38 = r6
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            r3 = r11
        L163:
            r5.wait(r3)     // Catch: java.lang.InterruptedException -> L171 java.lang.Throwable -> L1be
            monitor-exit(r45)     // Catch: java.lang.Throwable -> L1be
            r11 = r3
            r15 = r5
            r13 = r6
            r14 = r7
            r6 = r38
            r9 = r40
            goto L87
        L171:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1ba
            throw r0     // Catch: java.lang.Throwable -> L1ba
        L17b:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1ba
            throw r0     // Catch: java.lang.Throwable -> L1ba
        L188:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1ba
            throw r0     // Catch: java.lang.Throwable -> L1ba
        L195:
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1ba
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ba
            r2.<init>()     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r3 = "Timeout reached. Limit: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1ba
            r3 = r40
            r2.append(r3)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r3 = " ms"
            r2.append(r3)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1ba
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1ba
            throw r0     // Catch: java.lang.Throwable -> L1ba
        L1ba:
            r0 = move-exception
            r17 = r1
            goto L1c4
        L1be:
            r0 = move-exception
            goto L1c4
        L1c0:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L1c4:
            monitor-exit(r45)     // Catch: java.lang.Throwable -> L1be
            throw r0     // Catch: java.lang.Exception -> L1c6
        L1c6:
            r0 = move-exception
            goto L1cc
        L1c8:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L1cc:
            r1 = r17
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to preload url "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Exception: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            java.lang.String r2 = "VideoStreamExoPlayerCache.preload"
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            r3.zzv(r0, r2)
            r45.release()
            java.lang.String r0 = zzd(r1, r0)
            r5.zzg(r6, r7, r1, r0)
            return r18
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzv() {
            r1 = this;
            java.lang.String r0 = "Precache onRenderedFirstFrame"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzw(java.lang.String r5, java.lang.String[] r6, com.google.android.gms.internal.ads.zzcdn r7) {
            r4 = this;
            r4.zzf = r5
            r4.zzi = r7
            java.lang.String r7 = zzc(r5)
            r0 = 0
            int r1 = r6.length     // Catch: java.lang.Exception -> L44
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch: java.lang.Exception -> L44
            r2 = 0
        Ld:
            int r3 = r6.length     // Catch: java.lang.Exception -> L44
            if (r2 >= r3) goto L1b
            r3 = r6[r2]     // Catch: java.lang.Exception -> L44
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L44
            r1[r2] = r3     // Catch: java.lang.Exception -> L44
            int r2 = r2 + 1
            goto Ld
        L1b:
            com.google.android.gms.internal.ads.zzcca r6 = r4.zze     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = r4.zzb     // Catch: java.lang.Exception -> L44
            r6.zzF(r1, r2)     // Catch: java.lang.Exception -> L44
            java.lang.ref.WeakReference r6 = r4.zzc     // Catch: java.lang.Exception -> L44
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Exception -> L44
            com.google.android.gms.internal.ads.zzccj r6 = (com.google.android.gms.internal.ads.zzccj) r6     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L2f
            r6.zzt(r7, r4)     // Catch: java.lang.Exception -> L44
        L2f:
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Exception -> L44
            long r1 = r6.currentTimeMillis()     // Catch: java.lang.Exception -> L44
            r4.zzj = r1     // Catch: java.lang.Exception -> L44
            r1 = -1
            r4.zzk = r1     // Catch: java.lang.Exception -> L44
            r1 = 0
            r4.zzx(r1)     // Catch: java.lang.Exception -> L44
            r5 = 1
            return r5
        L44:
            r6 = move-exception
            java.lang.String r1 = r6.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to preload url "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " Exception: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "VideoStreamExoPlayerCache.preload"
            r1.zzv(r6, r2)
            r4.release()
            java.lang.String r1 = "error"
            java.lang.String r6 = zzd(r1, r6)
            r4.zzg(r5, r7, r1, r6)
            return r0
    }
}
