package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdkk extends com.google.android.gms.internal.ads.zzcte {
    public static final /* synthetic */ int zzc = 0;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.internal.ads.zzdkp zze;
    private final com.google.android.gms.internal.ads.zzdkx zzf;
    private final com.google.android.gms.internal.ads.zzdlp zzg;
    private final com.google.android.gms.internal.ads.zzdku zzh;
    private final com.google.android.gms.internal.ads.zzdla zzi;
    private final com.google.android.gms.internal.ads.zzhic zzj;
    private final com.google.android.gms.internal.ads.zzhic zzk;
    private final com.google.android.gms.internal.ads.zzhic zzl;
    private final com.google.android.gms.internal.ads.zzhic zzm;
    private final com.google.android.gms.internal.ads.zzhic zzn;
    private com.google.android.gms.internal.ads.zzdml zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final com.google.android.gms.internal.ads.zzbyv zzs;
    private final com.google.android.gms.internal.ads.zzavn zzt;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzu;
    private final android.content.Context zzv;
    private final com.google.android.gms.internal.ads.zzdkm zzw;
    private final com.google.android.gms.internal.ads.zzeoe zzx;
    private final java.util.Map zzy;
    private final java.util.List zzz;

    static {
            java.lang.String r0 = "3010"
            java.lang.String r1 = "3008"
            java.lang.String r2 = "1005"
            java.lang.String r3 = "1009"
            java.lang.String r4 = "2011"
            java.lang.String r5 = "2007"
            com.google.android.gms.internal.ads.zzgax.zzs(r0, r1, r2, r3, r4, r5)
            return
    }

    public zzdkk(com.google.android.gms.internal.ads.zzctd r3, java.util.concurrent.Executor r4, com.google.android.gms.internal.ads.zzdkp r5, com.google.android.gms.internal.ads.zzdkx r6, com.google.android.gms.internal.ads.zzdlp r7, com.google.android.gms.internal.ads.zzdku r8, com.google.android.gms.internal.ads.zzdla r9, com.google.android.gms.internal.ads.zzhic r10, com.google.android.gms.internal.ads.zzhic r11, com.google.android.gms.internal.ads.zzhic r12, com.google.android.gms.internal.ads.zzhic r13, com.google.android.gms.internal.ads.zzhic r14, com.google.android.gms.internal.ads.zzbyv r15, com.google.android.gms.internal.ads.zzavn r16, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r17, android.content.Context r18, com.google.android.gms.internal.ads.zzdkm r19, com.google.android.gms.internal.ads.zzeoe r20, com.google.android.gms.internal.ads.zzayx r21) {
            r2 = this;
            r0 = r2
            r2.<init>(r3)
            r1 = r4
            r0.zzd = r1
            r1 = r5
            r0.zze = r1
            r1 = r6
            r0.zzf = r1
            r1 = r7
            r0.zzg = r1
            r1 = r8
            r0.zzh = r1
            r1 = r9
            r0.zzi = r1
            r1 = r10
            r0.zzj = r1
            r1 = r11
            r0.zzk = r1
            r1 = r12
            r0.zzl = r1
            r1 = r13
            r0.zzm = r1
            r1 = r14
            r0.zzn = r1
            r1 = r15
            r0.zzs = r1
            r1 = r16
            r0.zzt = r1
            r1 = r17
            r0.zzu = r1
            r1 = r18
            r0.zzv = r1
            r1 = r19
            r0.zzw = r1
            r1 = r20
            r0.zzx = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzy = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzz = r1
            return
    }

    public static boolean zzY(android.view.View r8) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkj
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L44
            com.google.android.gms.ads.internal.zzu.zzp()
            long r4 = com.google.android.gms.ads.internal.util.zzt.zzw(r8)
            boolean r0 = r8.isShown()
            if (r0 == 0) goto L43
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r8 = r8.getGlobalVisibleRect(r0, r2)
            if (r8 == 0) goto L43
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzkk
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r0.zza(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            long r6 = (long) r8
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L43
            return r1
        L43:
            return r3
        L44:
            boolean r0 = r8.isShown()
            if (r0 == 0) goto L56
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r8 = r8.getGlobalVisibleRect(r0, r2)
            if (r8 == 0) goto L56
            return r1
        L56:
            return r3
    }

    private final synchronized android.widget.ImageView.ScaleType zzaa() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdml r0 = r1.zzo     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto Ld
            java.lang.String r0 = "Ad should be associated with an ad view before calling getMediaviewScaleType()"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            monitor-exit(r1)
            return r0
        Ld:
            com.google.android.gms.dynamic.IObjectWrapper r0 = r0.zzj()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1b
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: java.lang.Throwable -> L1f
            android.widget.ImageView$ScaleType r0 = (android.widget.ImageView.ScaleType) r0     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            return r0
        L1b:
            android.widget.ImageView$ScaleType r0 = com.google.android.gms.internal.ads.zzdlp.zza     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private final void zzab(java.lang.String r3, boolean r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzfd
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 1
            java.lang.String r0 = "Google"
            if (r3 == 0) goto L29
            com.google.android.gms.internal.ads.zzdkp r3 = r2.zze
            com.google.common.util.concurrent.ListenableFuture r3 = r3.zzw()
            if (r3 != 0) goto L1e
            return
        L1e:
            com.google.android.gms.internal.ads.zzdki r1 = new com.google.android.gms.internal.ads.zzdki
            r1.<init>(r2, r0, r4)
            java.util.concurrent.Executor r4 = r2.zzd
            com.google.android.gms.internal.ads.zzgfo.zzr(r3, r1, r4)
            return
        L29:
            r2.zzf(r0, r4)
            return
    }

    private final synchronized void zzac(android.view.View r3, java.util.Map r4, java.util.Map r5) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdlp r0 = r2.zzg     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.zzdml r1 = r2.zzo     // Catch: java.lang.Throwable -> L16
            r0.zzd(r1)     // Catch: java.lang.Throwable -> L16
            android.widget.ImageView$ScaleType r0 = r2.zzaa()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.zzdkx r1 = r2.zzf     // Catch: java.lang.Throwable -> L16
            r1.zzq(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L16
            r3 = 1
            r2.zzq = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return
        L16:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private final void zzad(android.view.View r3, com.google.android.gms.internal.ads.zzegf r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zze
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzr()
            com.google.android.gms.internal.ads.zzdku r1 = r2.zzh
            boolean r1 = r1.zzd()
            if (r1 == 0) goto L1f
            if (r4 == 0) goto L1f
            if (r0 == 0) goto L1f
            if (r3 == 0) goto L1f
            com.google.android.gms.internal.ads.zzega r0 = com.google.android.gms.ads.internal.zzu.zzA()
            com.google.android.gms.internal.ads.zzfoi r4 = r4.zza()
            r0.zzj(r4, r3)
        L1f:
            return
    }

    private final synchronized void zzae(com.google.android.gms.internal.ads.zzdml r8) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zzp     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L7
            goto Lb2
        L7:
            r7.zzo = r8     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzdlp r0 = r7.zzg     // Catch: java.lang.Throwable -> Lb4
            r0.zze(r8)     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzdkx r1 = r7.zzf     // Catch: java.lang.Throwable -> Lb4
            android.view.View r2 = r8.zzf()     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r3 = r8.zzm()     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r4 = r8.zzn()     // Catch: java.lang.Throwable -> Lb4
            r5 = r8
            r6 = r8
            r1.zzy(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcG     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.zzavn r0 = r7.zzt     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzavi r0 = r0.zzc()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L42
            android.view.View r1 = r8.zzf()     // Catch: java.lang.Throwable -> Lb4
            r0.zzo(r1)     // Catch: java.lang.Throwable -> Lb4
        L42:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbN     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto La1
            com.google.android.gms.internal.ads.zzfgh r0 = r7.zzb     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = r0.zzak     // Catch: java.lang.Throwable -> Lb4
            if (r1 != 0) goto L5b
            goto La1
        L5b:
            org.json.JSONObject r0 = r0.zzaj     // Catch: java.lang.Throwable -> Lb4
            java.util.Iterator r0 = r0.keys()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto La1
        L63:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzdml r2 = r7.zzo     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r2 = r2.zzl()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r3 = r7.zzy     // Catch: java.lang.Throwable -> Lb4
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lb4
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L63
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Lb4
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L63
            android.content.Context r3 = r7.zzv     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzayw r4 = new com.google.android.gms.internal.ads.zzayw     // Catch: java.lang.Throwable -> Lb4
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> Lb4
            java.util.List r2 = r7.zzz     // Catch: java.lang.Throwable -> Lb4
            r2.add(r4)     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzdkh r2 = new com.google.android.gms.internal.ads.zzdkh     // Catch: java.lang.Throwable -> Lb4
            r2.<init>(r7, r1)     // Catch: java.lang.Throwable -> Lb4
            r4.zzc(r2)     // Catch: java.lang.Throwable -> Lb4
            goto L63
        La1:
            com.google.android.gms.internal.ads.zzayw r0 = r8.zzi()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzayw r8 = r8.zzi()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzbyv r0 = r7.zzs     // Catch: java.lang.Throwable -> Lb4
            r8.zzc(r0)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r7)
            return
        Lb2:
            monitor-exit(r7)
            return
        Lb4:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    private final void zzaf(com.google.android.gms.internal.ads.zzdml r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdkx r0 = r3.zzf
            android.view.View r1 = r4.zzf()
            java.util.Map r2 = r4.zzl()
            r0.zzz(r1, r2)
            android.widget.FrameLayout r0 = r4.zzh()
            if (r0 == 0) goto L22
            android.widget.FrameLayout r0 = r4.zzh()
            r1 = 0
            r0.setClickable(r1)
            android.widget.FrameLayout r0 = r4.zzh()
            r0.removeAllViews()
        L22:
            com.google.android.gms.internal.ads.zzayw r0 = r4.zzi()
            if (r0 == 0) goto L31
            com.google.android.gms.internal.ads.zzayw r4 = r4.zzi()
            com.google.android.gms.internal.ads.zzbyv r0 = r3.zzs
            r4.zze(r0)
        L31:
            r4 = 0
            r3.zzo = r4
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdkp zzd(com.google.android.gms.internal.ads.zzdkk r0) {
            com.google.android.gms.internal.ads.zzdkp r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdml zze(com.google.android.gms.internal.ads.zzdkk r0) {
            com.google.android.gms.internal.ads.zzdml r0 = r0.zzo
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzh(com.google.android.gms.internal.ads.zzdkk r0) {
            java.util.Map r0 = r0.zzy
            return r0
    }

    public static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzdkk r5) {
            com.google.android.gms.internal.ads.zzdkp r0 = r5.zze     // Catch: android.os.RemoteException -> Lbb
            int r1 = r0.zzc()     // Catch: android.os.RemoteException -> Lbb
            java.lang.String r2 = "Google"
            r3 = 1
            if (r1 == r3) goto L9e
            r4 = 2
            if (r1 == r4) goto L81
            r4 = 3
            if (r1 == r4) goto L52
            r0 = 6
            if (r1 == r0) goto L35
            r0 = 7
            if (r1 == r0) goto L1d
            java.lang.String r5 = "Wrong native template id!"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r5)     // Catch: android.os.RemoteException -> Lbb
            return
        L1d:
            com.google.android.gms.internal.ads.zzdla r0 = r5.zzi     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbmp r1 = r0.zzg()     // Catch: android.os.RemoteException -> Lbb
            if (r1 == 0) goto Lba
            com.google.android.gms.internal.ads.zzbmp r0 = r0.zzg()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzhic r5 = r5.zzm     // Catch: android.os.RemoteException -> Lbb
            java.lang.Object r5 = r5.zzb()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbmj r5 = (com.google.android.gms.internal.ads.zzbmj) r5     // Catch: android.os.RemoteException -> Lbb
            r0.zzg(r5)     // Catch: android.os.RemoteException -> Lbb
            return
        L35:
            com.google.android.gms.internal.ads.zzdla r0 = r5.zzi     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbhq r0 = r0.zzf()     // Catch: android.os.RemoteException -> Lbb
            if (r0 == 0) goto Lba
            r5.zzab(r2, r3)     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzdla r0 = r5.zzi     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbhq r0 = r0.zzf()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzhic r5 = r5.zzl     // Catch: android.os.RemoteException -> Lbb
            java.lang.Object r5 = r5.zzb()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbhz r5 = (com.google.android.gms.internal.ads.zzbhz) r5     // Catch: android.os.RemoteException -> Lbb
            r0.zze(r5)     // Catch: android.os.RemoteException -> Lbb
            return
        L52:
            com.google.android.gms.internal.ads.zzdla r1 = r5.zzi     // Catch: android.os.RemoteException -> Lbb
            java.lang.String r0 = r0.zzA()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbhj r0 = r1.zzd(r0)     // Catch: android.os.RemoteException -> Lbb
            if (r0 == 0) goto Lba
            com.google.android.gms.internal.ads.zzdkp r0 = r5.zze     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzs()     // Catch: android.os.RemoteException -> Lbb
            if (r0 == 0) goto L69
            r5.zzf(r2, r3)     // Catch: android.os.RemoteException -> Lbb
        L69:
            com.google.android.gms.internal.ads.zzdla r0 = r5.zzi     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzdkp r1 = r5.zze     // Catch: android.os.RemoteException -> Lbb
            java.lang.String r1 = r1.zzA()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbhj r0 = r0.zzd(r1)     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzhic r5 = r5.zzn     // Catch: android.os.RemoteException -> Lbb
            java.lang.Object r5 = r5.zzb()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbgw r5 = (com.google.android.gms.internal.ads.zzbgw) r5     // Catch: android.os.RemoteException -> Lbb
            r0.zze(r5)     // Catch: android.os.RemoteException -> Lbb
            return
        L81:
            com.google.android.gms.internal.ads.zzdla r0 = r5.zzi     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbha r0 = r0.zza()     // Catch: android.os.RemoteException -> Lbb
            if (r0 == 0) goto Lba
            r5.zzab(r2, r3)     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzdla r0 = r5.zzi     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbha r0 = r0.zza()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzhic r5 = r5.zzk     // Catch: android.os.RemoteException -> Lbb
            java.lang.Object r5 = r5.zzb()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbgr r5 = (com.google.android.gms.internal.ads.zzbgr) r5     // Catch: android.os.RemoteException -> Lbb
            r0.zze(r5)     // Catch: android.os.RemoteException -> Lbb
            return
        L9e:
            com.google.android.gms.internal.ads.zzdla r0 = r5.zzi     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbhd r0 = r0.zzb()     // Catch: android.os.RemoteException -> Lbb
            if (r0 == 0) goto Lba
            r5.zzab(r2, r3)     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzdla r0 = r5.zzi     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbhd r0 = r0.zzb()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzhic r5 = r5.zzj     // Catch: android.os.RemoteException -> Lbb
            java.lang.Object r5 = r5.zzb()     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbgt r5 = (com.google.android.gms.internal.ads.zzbgt) r5     // Catch: android.os.RemoteException -> Lbb
            r0.zze(r5)     // Catch: android.os.RemoteException -> Lbb
        Lba:
            return
        Lbb:
            r5 = move-exception
            java.lang.String r0 = "RemoteException when notifyAdLoad is called"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)
            return
    }

    static /* bridge */ /* synthetic */ void zzt(com.google.android.gms.internal.ads.zzdkk r0, android.view.View r1, com.google.android.gms.internal.ads.zzegf r2) {
            r0.zzad(r1, r2)
            return
    }

    final /* synthetic */ void zzA(com.google.android.gms.internal.ads.zzdml r1) {
            r0 = this;
            r0.zzaf(r1)
            return
    }

    public final synchronized void zzB(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L7
            goto L87
        L7:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbN     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L44
            com.google.android.gms.internal.ads.zzfgh r0 = r3.zzb     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.zzak     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L44
            java.util.Map r0 = r3.zzy     // Catch: java.lang.Throwable -> L8e
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8e
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L8e
            java.util.Map r2 = r3.zzy     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L29
            goto L87
        L44:
            if (r7 != 0) goto L89
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzdP     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = r0.zza(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L8e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto L87
            if (r5 == 0) goto L87
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L8e
        L62:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L87
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L8e
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8e
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L8e
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L62
            boolean r0 = zzY(r0)     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L62
            r3.zzac(r4, r5, r6)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r3)
            return
        L87:
            monitor-exit(r3)
            return
        L89:
            r3.zzac(r4, r5, r6)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r3)
            return
        L8e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzC(com.google.android.gms.ads.internal.client.zzdh r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzj(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzD(android.view.View r10, android.view.View r11, java.util.Map r12, java.util.Map r13, boolean r14) {
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzdlp r0 = r9.zzg     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzdml r1 = r9.zzo     // Catch: java.lang.Throwable -> L35
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L35
            android.widget.ImageView$ScaleType r8 = r9.zzaa()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzdkx r2 = r9.zzf     // Catch: java.lang.Throwable -> L35
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.zzk(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L35
            boolean r10 = r9.zzr     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L33
            com.google.android.gms.internal.ads.zzdkp r10 = r9.zze     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzcfo r11 = r10.zzs()     // Catch: java.lang.Throwable -> L35
            if (r11 != 0) goto L23
            goto L33
        L23:
            com.google.android.gms.internal.ads.zzcfo r10 = r10.zzs()     // Catch: java.lang.Throwable -> L35
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L35
            r11.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r12 = "onSdkAdUserInteractionClick"
            r10.zzd(r12, r11)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r9)
            return
        L33:
            monitor-exit(r9)
            return
        L35:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    public final synchronized void zzE(android.view.View r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlg     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L15
            monitor-exit(r3)
            return
        L15:
            com.google.android.gms.internal.ads.zzdml r0 = r3.zzo     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L20
            java.lang.String r4 = "Ad should be associated with an ad view before calling performClickForCustomGesture()"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r4)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return
        L20:
            java.util.concurrent.Executor r1 = r3.zzd     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0 instanceof com.google.android.gms.internal.ads.zzdlj     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzdke r2 = new com.google.android.gms.internal.ads.zzdke     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3, r4, r0, r5)     // Catch: java.lang.Throwable -> L2e
            r1.execute(r2)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return
        L2e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzF(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzl(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzG(android.os.Bundle r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzm(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzH() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzdml r0 = r3.zzo     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto Lc
            java.lang.String r0 = "Ad should be associated with an ad view before calling recordCustomClickGesture()"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r3)
            return
        Lc:
            java.util.concurrent.Executor r1 = r3.zzd     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r0 instanceof com.google.android.gms.internal.ads.zzdlj     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.zzdkg r2 = new com.google.android.gms.internal.ads.zzdkg     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1a
            r1.execute(r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r3)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final void zzI(android.os.Bundle r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r5.zze
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzs()
            if (r0 != 0) goto Le
            java.lang.String r6 = "Video webview is null"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r6)
            return
        Le:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r1.<init>()     // Catch: org.json.JSONException -> L3a
            java.util.Set r2 = r6.keySet()     // Catch: org.json.JSONException -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: org.json.JSONException -> L3a
        L1b:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> L3a
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> L3a
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L3a
            java.lang.Object r4 = r6.get(r3)     // Catch: org.json.JSONException -> L3a
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L3a
            goto L1b
        L2f:
            java.util.concurrent.Executor r6 = r5.zzd     // Catch: org.json.JSONException -> L3a
            com.google.android.gms.internal.ads.zzdkd r2 = new com.google.android.gms.internal.ads.zzdkd     // Catch: org.json.JSONException -> L3a
            r2.<init>(r0, r1)     // Catch: org.json.JSONException -> L3a
            r6.execute(r2)     // Catch: org.json.JSONException -> L3a
            return
        L3a:
            r6 = move-exception
            java.lang.String r0 = "Error reading event signals"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
            return
    }

    public final synchronized void zzJ() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzq     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> Le
            r0.zzr()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void zzK(android.view.View r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfd
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L26
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zze
            com.google.android.gms.internal.ads.zzcas r0 = r0.zzp()
            if (r0 != 0) goto L1b
            return
        L1b:
            com.google.android.gms.internal.ads.zzdkj r1 = new com.google.android.gms.internal.ads.zzdkj
            r1.<init>(r2, r3)
            java.util.concurrent.Executor r3 = r2.zzd
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r3)
            return
        L26:
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zze
            com.google.android.gms.internal.ads.zzegf r0 = r0.zzu()
            r2.zzad(r3, r0)
            return
    }

    public final synchronized void zzL(android.view.View r2, android.view.MotionEvent r3, android.view.View r4) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzs(r2, r3, r4)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzM(android.os.Bundle r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzt(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzN(android.view.View r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzu(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzO() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzv()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzP(com.google.android.gms.ads.internal.client.zzdd r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzw(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdr r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzeoe r0 = r1.zzx     // Catch: java.lang.Throwable -> L8
            r0.zza(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzR(com.google.android.gms.internal.ads.zzbhw r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzx(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzS(com.google.android.gms.internal.ads.zzdml r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbL     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L1f
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzdjz r1 = new com.google.android.gms.internal.ads.zzdjz     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L24
            r0.post(r1)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return
        L1f:
            r2.zzae(r3)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzT(com.google.android.gms.internal.ads.zzdml r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbL     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L1f
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzdka r1 = new com.google.android.gms.internal.ads.zzdka     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L24
            r0.post(r1)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return
        L1f:
            r2.zzaf(r3)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final boolean zzU() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdku r0 = r1.zzh
            boolean r0 = r0.zze()
            return r0
    }

    public final synchronized boolean zzV() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.zzA()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized boolean zzW() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.zzB()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final boolean zzX() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdku r0 = r1.zzh
            boolean r0 = r0.zzd()
            return r0
    }

    public final synchronized boolean zzZ(android.os.Bundle r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzq     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L8
            r2 = 1
            monitor-exit(r1)
            return r2
        L8:
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L12
            boolean r2 = r0.zzC(r2)     // Catch: java.lang.Throwable -> L12
            r1.zzq = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized int zza() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L9
            int r0 = r0.zza()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcte
    public final synchronized void zzb() {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r2.zzp = r0     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzdkf r0 = new com.google.android.gms.internal.ads.zzdkf     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.Executor r1 = r2.zzd     // Catch: java.lang.Throwable -> L13
            r1.execute(r0)     // Catch: java.lang.Throwable -> L13
            super.zzb()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzdkm zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkm r0 = r1.zzw
            return r0
    }

    public final com.google.android.gms.internal.ads.zzegf zzf(java.lang.String r19, boolean r20) {
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.zzdku r1 = r0.zzh
            boolean r1 = r1.zzd()
            r2 = 0
            if (r1 == 0) goto L13f
            boolean r1 = android.text.TextUtils.isEmpty(r19)
            if (r1 == 0) goto L13
            goto L13f
        L13:
            com.google.android.gms.internal.ads.zzdkp r1 = r0.zze
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zzr()
            com.google.android.gms.internal.ads.zzcfo r1 = r1.zzs()
            if (r3 != 0) goto L28
            if (r1 == 0) goto L22
            goto L28
        L22:
            java.lang.String r1 = "Omid display and video webview are null. Skipping initialization."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return r2
        L28:
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L2e
            r6 = 1
            goto L2f
        L2e:
            r6 = 0
        L2f:
            if (r1 == 0) goto L33
            r7 = 1
            goto L34
        L33:
            r7 = 0
        L34:
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzfb
            com.google.android.gms.internal.ads.zzbct r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r9.zza(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L97
            com.google.android.gms.internal.ads.zzdku r6 = r0.zzh
            r6.zza()
            com.google.android.gms.internal.ads.zzdku r6 = r0.zzh
            com.google.android.gms.internal.ads.zzfhf r6 = r6.zza()
            int r6 = r6.zzc()
            int r7 = r6 + (-1)
            if (r7 == 0) goto L8d
            if (r7 == r5) goto L82
            if (r6 == r5) goto L66
            r1 = 2
            if (r6 == r1) goto L63
            java.lang.String r1 = "UNKNOWN"
            goto L68
        L63:
            java.lang.String r1 = "DISPLAY"
            goto L68
        L66:
            java.lang.String r1 = "VIDEO"
        L68:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown omid media type: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ". Not initializing Omid."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return r2
        L82:
            if (r3 == 0) goto L87
            r4 = 1
            r7 = 0
            goto L98
        L87:
            java.lang.String r1 = "Omid media type was display but there was no display webview."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return r2
        L8d:
            if (r1 == 0) goto L91
            r7 = 1
            goto L98
        L91:
            java.lang.String r1 = "Omid media type was video but there was no video webview."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return r2
        L97:
            r4 = r6
        L98:
            if (r4 == 0) goto L9c
            r13 = r2
            goto La0
        L9c:
            java.lang.String r3 = "javascript"
            r13 = r3
            r3 = r1
        La0:
            r3.zzG()
            android.content.Context r4 = r0.zzv
            com.google.android.gms.internal.ads.zzega r6 = com.google.android.gms.ads.internal.zzu.zzA()
            boolean r4 = r6.zzl(r4)
            if (r4 != 0) goto Lb5
            java.lang.String r1 = "Failed to initialize omid in InternalNativeAd"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return r2
        Lb5:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r0.zzu
            int r6 = r4.buddyApkVersion
            int r4 = r4.clientJarVersion
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "."
            r8.append(r6)
            r8.append(r4)
            java.lang.String r9 = r8.toString()
            if (r7 == 0) goto Ld9
            com.google.android.gms.internal.ads.zzegb r4 = com.google.android.gms.internal.ads.zzegb.zzc
            com.google.android.gms.internal.ads.zzegc r6 = com.google.android.gms.internal.ads.zzegc.zzb
            r16 = r4
            r15 = r6
            goto Lec
        Ld9:
            com.google.android.gms.internal.ads.zzdkp r4 = r0.zze
            com.google.android.gms.internal.ads.zzegb r6 = com.google.android.gms.internal.ads.zzegb.zzb
            int r4 = r4.zzc()
            r8 = 3
            if (r4 != r8) goto Le7
            com.google.android.gms.internal.ads.zzegc r4 = com.google.android.gms.internal.ads.zzegc.zzd
            goto Le9
        Le7:
            com.google.android.gms.internal.ads.zzegc r4 = com.google.android.gms.internal.ads.zzegc.zzc
        Le9:
            r15 = r4
            r16 = r6
        Lec:
            com.google.android.gms.internal.ads.zzega r8 = com.google.android.gms.ads.internal.zzu.zzA()
            android.webkit.WebView r10 = r3.zzG()
            com.google.android.gms.internal.ads.zzfgh r4 = r0.zzb
            java.lang.String r4 = r4.zzal
            java.lang.String r11 = ""
            java.lang.String r12 = "javascript"
            r14 = r19
            r17 = r4
            com.google.android.gms.internal.ads.zzegf r4 = r8.zzb(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r4 != 0) goto L10c
            java.lang.String r1 = "Failed to create omid session in InternalNativeAd"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return r2
        L10c:
            com.google.android.gms.internal.ads.zzdkp r2 = r0.zze
            r2.zzW(r4)
            r3.zzat(r4)
            if (r7 == 0) goto L127
            com.google.android.gms.internal.ads.zzfoi r2 = r4.zza()
            android.view.View r1 = r1.zzF()
            com.google.android.gms.internal.ads.zzega r6 = com.google.android.gms.ads.internal.zzu.zzA()
            r6.zzj(r2, r1)
            r0.zzr = r5
        L127:
            if (r20 == 0) goto L13e
            com.google.android.gms.internal.ads.zzega r1 = com.google.android.gms.ads.internal.zzu.zzA()
            com.google.android.gms.internal.ads.zzfoi r2 = r4.zza()
            r1.zzk(r2)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "onSdkLoaded"
            r3.zzd(r2, r1)
        L13e:
            return r4
        L13f:
            return r2
    }

    public final java.lang.String zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdku r0 = r1.zzh
            java.lang.String r0 = r0.zzb()
            return r0
    }

    public final synchronized org.json.JSONObject zzi(android.view.View r3, java.util.Map r4, java.util.Map r5) {
            r2 = this;
            monitor-enter(r2)
            android.widget.ImageView$ScaleType r0 = r2.zzaa()     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.ads.zzdkx r1 = r2.zzf     // Catch: java.lang.Throwable -> Ld
            org.json.JSONObject r3 = r1.zze(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized org.json.JSONObject zzj(android.view.View r3, java.util.Map r4, java.util.Map r5) {
            r2 = this;
            monitor-enter(r2)
            android.widget.ImageView$ScaleType r0 = r2.zzaa()     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.ads.zzdkx r1 = r2.zzf     // Catch: java.lang.Throwable -> Ld
            org.json.JSONObject r3 = r1.zzf(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzcte
    public final void zzk() {
            r3 = this;
            com.google.android.gms.internal.ads.zzdkb r0 = new com.google.android.gms.internal.ads.zzdkb
            r0.<init>(r3)
            java.util.concurrent.Executor r1 = r3.zzd
            r1.execute(r0)
            com.google.android.gms.internal.ads.zzdkp r0 = r3.zze
            int r0 = r0.zzc()
            r1 = 7
            if (r0 == r1) goto L22
            java.util.concurrent.Executor r0 = r3.zzd
            com.google.android.gms.internal.ads.zzdkx r1 = r3.zzf
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzdkc r2 = new com.google.android.gms.internal.ads.zzdkc
            r2.<init>(r1)
            r0.execute(r2)
        L22:
            super.zzk()
            return
    }

    public final void zzu(android.view.View r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zze
            com.google.android.gms.internal.ads.zzegf r0 = r0.zzu()
            com.google.android.gms.internal.ads.zzdku r1 = r2.zzh
            boolean r1 = r1.zzd()
            if (r1 == 0) goto L1d
            if (r0 == 0) goto L1d
            if (r3 == 0) goto L1d
            com.google.android.gms.internal.ads.zzega r1 = com.google.android.gms.ads.internal.zzu.zzA()
            com.google.android.gms.internal.ads.zzfoi r0 = r0.zza()
            r1.zzg(r0, r3)
        L1d:
            return
    }

    public final synchronized void zzv() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.zzh()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    final /* synthetic */ void zzw() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkx r0 = r1.zzf
            r0.zzi()
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zze
            r0.zzI()
            return
    }

    final /* synthetic */ void zzx(android.view.View r10, boolean r11, int r12) {
            r9 = this;
            com.google.android.gms.internal.ads.zzdml r0 = r9.zzo
            android.view.View r3 = r0.zzf()
            com.google.android.gms.internal.ads.zzdml r0 = r9.zzo
            java.util.Map r4 = r0.zzl()
            com.google.android.gms.internal.ads.zzdml r0 = r9.zzo
            java.util.Map r5 = r0.zzm()
            android.widget.ImageView$ScaleType r7 = r9.zzaa()
            com.google.android.gms.internal.ads.zzdkx r1 = r9.zzf
            r2 = r10
            r6 = r11
            r8 = r12
            r1.zzo(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    final /* synthetic */ void zzy(boolean r10) {
            r9 = this;
            com.google.android.gms.internal.ads.zzdml r0 = r9.zzo
            android.view.View r3 = r0.zzf()
            com.google.android.gms.internal.ads.zzdml r0 = r9.zzo
            java.util.Map r4 = r0.zzl()
            com.google.android.gms.internal.ads.zzdml r0 = r9.zzo
            java.util.Map r5 = r0.zzm()
            android.widget.ImageView$ScaleType r7 = r9.zzaa()
            com.google.android.gms.internal.ads.zzdkx r1 = r9.zzf
            r2 = 0
            r8 = 0
            r6 = r10
            r1.zzo(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    final /* synthetic */ void zzz(com.google.android.gms.internal.ads.zzdml r1) {
            r0 = this;
            r0.zzae(r1)
            return
    }
}
