package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzm extends com.google.android.gms.internal.ads.zzbtl implements com.google.android.gms.ads.internal.overlay.zzag {
    static final int zza = 0;
    protected final android.app.Activity zzb;
    com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zzc;
    com.google.android.gms.internal.ads.zzcfo zzd;
    com.google.android.gms.ads.internal.overlay.zzi zze;
    com.google.android.gms.ads.internal.overlay.zzu zzf;
    boolean zzg;
    android.widget.FrameLayout zzh;
    android.webkit.WebChromeClient.CustomViewCallback zzi;
    boolean zzj;
    boolean zzk;
    com.google.android.gms.ads.internal.overlay.zzh zzl;
    boolean zzm;
    int zzn;
    private final java.lang.Object zzo;
    private final android.view.View.OnClickListener zzp;
    private java.lang.Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private android.widget.Toolbar zzw;

    static {
            r0 = 0
            int r0 = android.graphics.Color.argb(r0, r0, r0, r0)
            com.google.android.gms.ads.internal.overlay.zzm.zza = r0
            return
    }

    public zzm(android.app.Activity r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.zzg = r0
            r3.zzj = r0
            r3.zzk = r0
            r3.zzm = r0
            r1 = 1
            r3.zzn = r1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r3.zzo = r2
            com.google.android.gms.ads.internal.overlay.zzf r2 = new com.google.android.gms.ads.internal.overlay.zzf
            r2.<init>(r3)
            r3.zzp = r2
            r3.zzt = r0
            r3.zzu = r0
            r3.zzv = r1
            r3.zzb = r4
            return
    }

    private final void zzJ(android.view.View r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            com.google.android.gms.internal.ads.zzegd r0 = r0.zzP()
            if (r0 != 0) goto L1b
            goto L1f
        L1b:
            r0.zza(r3)
            return
        L1f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeW
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L32
            goto L4b
        L32:
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            com.google.android.gms.internal.ads.zzegf r0 = r0.zzQ()
            if (r0 == 0) goto L4b
            boolean r1 = r0.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzega r1 = com.google.android.gms.ads.internal.zzu.zzA()
            com.google.android.gms.internal.ads.zzfoi r0 = r0.zza()
            r1.zzg(r0, r3)
        L4b:
            return
    }

    private final void zzK(android.content.res.Configuration r6) {
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.zzc
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzk r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            android.app.Activity r3 = r5.zzb
            com.google.android.gms.ads.internal.util.zzab r4 = com.google.android.gms.ads.internal.zzu.zzq()
            boolean r6 = r4.zzd(r3, r6)
            boolean r3 = r5.zzk
            if (r3 == 0) goto L33
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaK
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        L33:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzaJ
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r1 = 0
            goto L57
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.zzc
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzk r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = 1
        L57:
            android.app.Activity r6 = r5.zzb
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbi
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
    }

    private static final void zzL(com.google.android.gms.internal.ads.zzegf r2, android.view.View r3) {
            if (r2 == 0) goto L28
            if (r3 != 0) goto L5
            goto L28
        L5:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeW
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            boolean r0 = r2.zzb()
            if (r0 != 0) goto L28
        L1d:
            com.google.android.gms.internal.ads.zzega r0 = com.google.android.gms.ads.internal.zzu.zzA()
            com.google.android.gms.internal.ads.zzfoi r2 = r2.zza()
            r0.zzj(r2, r3)
        L28:
            return
    }

    public final void zzA(int r4) {
            r3 = this;
            android.app.Activity r0 = r3.zzb
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfM
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto L5c
            android.app.Activity r0 = r3.zzb
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfN
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 > r1) goto L5c
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfO
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto L5c
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfP
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 <= r1) goto L5b
            goto L5c
        L5b:
            return
        L5c:
            android.app.Activity r0 = r3.zzb     // Catch: java.lang.Throwable -> L62
            r0.setRequestedOrientation(r4)     // Catch: java.lang.Throwable -> L62
            return
        L62:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "AdOverlay.setRequestedOrientation"
            r0.zzv(r4, r1)
            return
    }

    public final void zzB(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L9
            com.google.android.gms.ads.internal.overlay.zzh r2 = r1.zzl
            r0 = 0
            r2.setBackgroundColor(r0)
            return
        L9:
            com.google.android.gms.ads.internal.overlay.zzh r2 = r1.zzl
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setBackgroundColor(r0)
            return
    }

    public final void zzC(android.view.View r3, android.webkit.WebChromeClient.CustomViewCallback r4) {
            r2 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.app.Activity r1 = r2.zzb
            r0.<init>(r1)
            r2.zzh = r0
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r1)
            android.widget.FrameLayout r0 = r2.zzh
            r1 = -1
            r0.addView(r3, r1, r1)
            android.app.Activity r3 = r2.zzb
            android.widget.FrameLayout r0 = r2.zzh
            r3.setContentView(r0)
            r3 = 1
            r2.zzs = r3
            r2.zzi = r4
            r2.zzg = r3
            return
    }

    protected final void zzD(boolean r27) throws com.google.android.gms.ads.internal.overlay.zzg {
            r26 = this;
            r1 = r26
            boolean r0 = r1.zzs
            r2 = 1
            if (r0 != 0) goto Lc
            android.app.Activity r0 = r1.zzb
            r0.requestWindowFeature(r2)
        Lc:
            android.app.Activity r0 = r1.zzb
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2b8
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            com.google.android.gms.internal.ads.zzcfo r3 = r3.zzd
            r4 = 0
            if (r3 == 0) goto L20
            com.google.android.gms.internal.ads.zzchg r3 = r3.zzN()
            goto L21
        L20:
            r3 = r4
        L21:
            r5 = 0
            if (r3 == 0) goto L2c
            boolean r3 = r3.zzQ()
            if (r3 == 0) goto L2c
            r3 = 1
            goto L2d
        L2c:
            r3 = 0
        L2d:
            r1.zzm = r5
            if (r3 == 0) goto L64
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.zzc
            int r6 = r6.zzj
            r7 = 6
            if (r6 != r7) goto L4c
            android.app.Activity r6 = r1.zzb
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            if (r6 != r2) goto L48
            r6 = 1
            goto L49
        L48:
            r6 = 0
        L49:
            r1.zzm = r6
            goto L65
        L4c:
            r7 = 7
            if (r6 != r7) goto L64
            android.app.Activity r6 = r1.zzb
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 != r7) goto L60
            r6 = 1
            goto L61
        L60:
            r6 = 0
        L61:
            r1.zzm = r6
            goto L65
        L64:
            r6 = 0
        L65:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Delay onShow to next orientation change: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r6)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.zzc
            int r6 = r6.zzj
            r1.zzA(r6)
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r0.setFlags(r6, r6)
            java.lang.String r0 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            boolean r0 = r1.zzk
            if (r0 != 0) goto L96
            com.google.android.gms.ads.internal.overlay.zzh r0 = r1.zzl
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r6)
            goto L9d
        L96:
            com.google.android.gms.ads.internal.overlay.zzh r0 = r1.zzl
            int r6 = com.google.android.gms.ads.internal.overlay.zzm.zza
            r0.setBackgroundColor(r6)
        L9d:
            android.app.Activity r0 = r1.zzb
            com.google.android.gms.ads.internal.overlay.zzh r6 = r1.zzl
            r0.setContentView(r6)
            r1.zzs = r2
            if (r27 == 0) goto L171
            com.google.android.gms.ads.internal.zzu.zzz()     // Catch: java.lang.Exception -> L163
            android.app.Activity r6 = r1.zzb     // Catch: java.lang.Exception -> L163
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc     // Catch: java.lang.Exception -> L163
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzd     // Catch: java.lang.Exception -> L163
            if (r0 == 0) goto Lb9
            com.google.android.gms.internal.ads.zzchi r0 = r0.zzO()     // Catch: java.lang.Exception -> L163
            r7 = r0
            goto Lba
        Lb9:
            r7 = r4
        Lba:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc     // Catch: java.lang.Exception -> L163
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzd     // Catch: java.lang.Exception -> L163
            if (r0 == 0) goto Lc6
            java.lang.String r0 = r0.zzU()     // Catch: java.lang.Exception -> L163
            r8 = r0
            goto Lc7
        Lc6:
            r8 = r4
        Lc7:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc     // Catch: java.lang.Exception -> L163
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r13 = r0.zzm     // Catch: java.lang.Exception -> L163
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzd     // Catch: java.lang.Exception -> L163
            if (r0 == 0) goto Ld6
            com.google.android.gms.ads.internal.zza r0 = r0.zzj()     // Catch: java.lang.Exception -> L163
            r16 = r0
            goto Ld8
        Ld6:
            r16 = r4
        Ld8:
            r9 = 1
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            com.google.android.gms.internal.ads.zzbbu r17 = com.google.android.gms.internal.ads.zzbbu.zza()     // Catch: java.lang.Exception -> L163
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r10 = r3
            com.google.android.gms.internal.ads.zzcfo r0 = com.google.android.gms.internal.ads.zzcgb.zza(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Exception -> L163
            r1.zzd = r0     // Catch: java.lang.Exception -> L163
            com.google.android.gms.internal.ads.zzchg r6 = r0.zzN()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            com.google.android.gms.internal.ads.zzbim r8 = r0.zzp
            com.google.android.gms.internal.ads.zzbio r10 = r0.zze
            com.google.android.gms.ads.internal.overlay.zzac r11 = r0.zzi
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzd
            if (r0 == 0) goto L10a
            com.google.android.gms.internal.ads.zzchg r0 = r0.zzN()
            com.google.android.gms.ads.internal.zzb r0 = r0.zzd()
            r14 = r0
            goto L10b
        L10a:
            r14 = r4
        L10b:
            r7 = 0
            r9 = 0
            r12 = 1
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r6.zzS(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            com.google.android.gms.internal.ads.zzchg r0 = r0.zzN()
            com.google.android.gms.ads.internal.overlay.zze r6 = new com.google.android.gms.ads.internal.overlay.zze
            r6.<init>(r1)
            r0.zzB(r6)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            java.lang.String r6 = r0.zzl
            if (r6 == 0) goto L141
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            UX.aTqO5.a()
            goto L151
        L141:
            java.lang.String r9 = r0.zzh
            if (r9 == 0) goto L15b
            com.google.android.gms.internal.ads.zzcfo r7 = r1.zzd
            java.lang.String r8 = r0.zzf
            r12 = 0
            java.lang.String r10 = "text/html"
            java.lang.String r11 = "UTF-8"
            UX.aTqO5.a()
        L151:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzd
            if (r0 == 0) goto L17c
            r0.zzaw(r1)
            goto L17c
        L15b:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r0.<init>(r2)
            throw r0
        L163:
            r0 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            com.google.android.gms.ads.internal.overlay.zzg r2 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r3 = "Could not obtain webview for the overlay."
            r2.<init>(r3, r0)
            throw r2
        L171:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzd
            r1.zzd = r0
            android.app.Activity r6 = r1.zzb
            r0.zzan(r6)
        L17c:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            boolean r0 = r0.zzw
            if (r0 == 0) goto L18f
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            com.google.android.gms.internal.ads.zzcfo r6 = r1.zzd
            android.webkit.WebView r6 = r6.zzG()
            r0.setAcceptThirdPartyCookies(r6, r5)
        L18f:
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            r0.zzai(r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzd
            if (r0 == 0) goto L1a3
            com.google.android.gms.internal.ads.zzegf r0 = r0.zzQ()
            com.google.android.gms.ads.internal.overlay.zzh r6 = r1.zzl
            zzL(r0, r6)
        L1a3:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            int r0 = r0.zzk
            r6 = 5
            if (r0 == r6) goto L26b
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L1c1
            boolean r7 = r0 instanceof android.view.ViewGroup
            if (r7 == 0) goto L1c1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.gms.internal.ads.zzcfo r7 = r1.zzd
            android.view.View r7 = r7.zzF()
            r0.removeView(r7)
        L1c1:
            boolean r0 = r1.zzk
            if (r0 == 0) goto L1ca
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            r0.zzam()
        L1ca:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            boolean r0 = r0.zzw
            r7 = -1
            if (r0 == 0) goto L260
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r0 < r8) goto L260
            android.app.Activity r0 = r1.zzb
            android.widget.Toolbar r8 = new android.widget.Toolbar
            r8.<init>(r0)
            r1.zzw = r8
            int r0 = android.view.View.generateViewId()
            r8.setId(r0)
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            android.view.View r0 = r0.zzF()
            int r8 = android.view.View.generateViewId()
            r0.setId(r8)
            android.widget.Toolbar r0 = r1.zzw
            r8 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r0.setBackgroundColor(r8)
            android.widget.Toolbar r0 = r1.zzw
            r0.setVisibility(r5)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: android.content.res.Resources.NotFoundException -> L215 java.lang.NullPointerException -> L217
            android.content.res.Resources r0 = r0.zze()     // Catch: android.content.res.Resources.NotFoundException -> L215 java.lang.NullPointerException -> L217
            int r8 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_cross     // Catch: android.content.res.Resources.NotFoundException -> L215 java.lang.NullPointerException -> L217
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r8, r4)     // Catch: android.content.res.Resources.NotFoundException -> L215 java.lang.NullPointerException -> L217
            android.widget.Toolbar r4 = r1.zzw     // Catch: android.content.res.Resources.NotFoundException -> L215 java.lang.NullPointerException -> L217
            r4.setNavigationIcon(r0)     // Catch: android.content.res.Resources.NotFoundException -> L215 java.lang.NullPointerException -> L217
            goto L21d
        L215:
            r0 = move-exception
            goto L218
        L217:
            r0 = move-exception
        L218:
            java.lang.String r4 = "Error obtaining close icon."
            com.google.android.gms.ads.internal.util.zze.zzb(r4, r0)
        L21d:
            android.widget.Toolbar r0 = r1.zzw
            android.view.View$OnClickListener r4 = r1.zzp
            r0.setNavigationOnClickListener(r4)
            android.widget.Toolbar r0 = r1.zzw
            r0.setTitleMarginStart(r5)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r4 = -2
            r0.<init>(r7, r4)
            r5 = 10
            r0.addRule(r5)
            com.google.android.gms.ads.internal.overlay.zzh r5 = r1.zzl
            android.widget.Toolbar r8 = r1.zzw
            r5.addView(r8, r0)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r7, r4)
            r4 = 3
            android.widget.Toolbar r5 = r1.zzw
            int r5 = r5.getId()
            r0.addRule(r4, r5)
            r4 = 12
            r0.addRule(r4)
            com.google.android.gms.ads.internal.overlay.zzh r4 = r1.zzl
            com.google.android.gms.internal.ads.zzcfo r5 = r1.zzd
            android.view.View r5 = r5.zzF()
            r4.addView(r5, r0)
            android.widget.Toolbar r0 = r1.zzw
            r1.zzJ(r0)
            goto L26b
        L260:
            com.google.android.gms.ads.internal.overlay.zzh r0 = r1.zzl
            com.google.android.gms.internal.ads.zzcfo r4 = r1.zzd
            android.view.View r4 = r4.zzF()
            r0.addView(r4, r7, r7)
        L26b:
            if (r27 != 0) goto L274
            boolean r0 = r1.zzm
            if (r0 != 0) goto L274
            r26.zze()
        L274:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            int r0 = r0.zzk
            if (r0 == r6) goto L289
            r1.zzw(r3)
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            boolean r0 = r0.zzaB()
            if (r0 == 0) goto L288
            r1.zzy(r3, r2)
        L288:
            return
        L289:
            android.app.Activity r0 = r1.zzb
            com.google.android.gms.internal.ads.zzefk r2 = com.google.android.gms.internal.ads.zzefl.zze()
            r2.zza(r0)
            r2.zzb(r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            java.lang.String r0 = r0.zzq
            r2.zzc(r0)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            java.lang.String r0 = r0.zzr
            r2.zzd(r0)
            com.google.android.gms.internal.ads.zzefl r0 = r2.zze()
            r1.zzf(r0)     // Catch: android.os.RemoteException -> L2ab com.google.android.gms.ads.internal.overlay.zzg -> L2ad
            return
        L2ab:
            r0 = move-exception
            goto L2ae
        L2ad:
            r0 = move-exception
        L2ae:
            com.google.android.gms.ads.internal.overlay.zzg r2 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L2b8:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Invalid activity, no window available."
            r0.<init>(r2)
            throw r0
    }

    public final void zzE() {
            r3 = this;
            java.lang.Object r0 = r3.zzo
            monitor-enter(r0)
            r1 = 1
            r3.zzr = r1     // Catch: java.lang.Throwable -> L16
            java.lang.Runnable r1 = r3.zzq     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L14
            com.google.android.gms.internal.ads.zzfun r2 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> L16
            r2.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.Runnable r1 = r3.zzq     // Catch: java.lang.Throwable -> L16
            r2.post(r1)     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    protected final void zzF() {
            r5 = this;
            android.app.Activity r0 = r5.zzb
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L71
            boolean r0 = r5.zzt
            if (r0 == 0) goto Ld
            goto L71
        Ld:
            r0 = 1
            r5.zzt = r0
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zzd
            if (r0 == 0) goto L6e
            int r1 = r5.zzn
            int r1 = r1 + (-1)
            r0.zzZ(r1)
            java.lang.Object r0 = r5.zzo
            monitor-enter(r0)
            boolean r1 = r5.zzr     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L69
            com.google.android.gms.internal.ads.zzcfo r1 = r5.zzd     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.zzaC()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L69
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzeI     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L4b
            boolean r1 = r5.zzu     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L4b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r5.zzc     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L4b
            com.google.android.gms.ads.internal.overlay.zzr r1 = r1.zzc     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L4b
            r1.zzdq()     // Catch: java.lang.Throwable -> L6b
        L4b:
            com.google.android.gms.ads.internal.overlay.zzd r1 = new com.google.android.gms.ads.internal.overlay.zzd     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L6b
            r5.zzq = r1     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzfun r2 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzbb     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L6b
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L6b
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L6b
            r2.postDelayed(r1, r3)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L69:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            goto L6e
        L6b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r1
        L6e:
            r5.zzc()
        L71:
            return
    }

    public final void zzG(java.lang.String r2) {
            r1 = this;
            android.widget.Toolbar r0 = r1.zzw
            if (r0 == 0) goto L7
            r0.setSubtitle(r2)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final boolean zzH() {
            r4 = this;
            r0 = 1
            r4.zzn = r0
            com.google.android.gms.internal.ads.zzcfo r1 = r4.zzd
            if (r1 != 0) goto L8
            return r0
        L8:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzix
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2a
            com.google.android.gms.internal.ads.zzcfo r0 = r4.zzd
            boolean r0 = r0.canGoBack()
            if (r0 != 0) goto L23
            goto L2a
        L23:
            com.google.android.gms.internal.ads.zzcfo r0 = r4.zzd
            r0.goBack()
            r0 = 0
            return r0
        L2a:
            com.google.android.gms.internal.ads.zzcfo r0 = r4.zzd
            boolean r0 = r0.zzaH()
            if (r0 != 0) goto L3d
            com.google.android.gms.internal.ads.zzcfo r1 = r4.zzd
            java.util.Map r2 = java.util.Collections.emptyMap()
            java.lang.String r3 = "onbackblocked"
            r1.zzd(r3, r2)
        L3d:
            return r0
    }

    public final void zzb() {
            r2 = this;
            r0 = 3
            r2.zzn = r0
            android.app.Activity r0 = r2.zzb
            r0.finish()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r2.zzc
            if (r0 == 0) goto L17
            int r0 = r0.zzk
            r1 = 5
            if (r0 != r1) goto L17
            android.app.Activity r0 = r2.zzb
            r1 = 0
            r0.overridePendingTransition(r1, r1)
        L17:
            return
    }

    final void zzc() {
            r5 = this;
            boolean r0 = r5.zzu
            if (r0 == 0) goto L6
            goto La2
        L6:
            r0 = 1
            r5.zzu = r0
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zzd
            if (r0 == 0) goto L7e
            com.google.android.gms.ads.internal.overlay.zzh r1 = r5.zzl
            android.view.View r0 = r0.zzF()
            r1.removeView(r0)
            com.google.android.gms.ads.internal.overlay.zzi r0 = r5.zze
            r1 = 0
            if (r0 == 0) goto L69
            com.google.android.gms.internal.ads.zzcfo r2 = r5.zzd
            android.content.Context r0 = r0.zzd
            r2.zzan(r0)
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zzd
            r2 = 0
            r0.zzaq(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzml
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L53
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zzd
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L53
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zzd
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.gms.internal.ads.zzcfo r2 = r5.zzd
            android.view.View r2 = r2.zzF()
            r0.removeView(r2)
        L53:
            com.google.android.gms.ads.internal.overlay.zzi r0 = r5.zze
            android.view.ViewGroup r0 = r0.zzc
            com.google.android.gms.internal.ads.zzcfo r2 = r5.zzd
            android.view.View r2 = r2.zzF()
            com.google.android.gms.ads.internal.overlay.zzi r3 = r5.zze
            int r4 = r3.zza
            android.view.ViewGroup$LayoutParams r3 = r3.zzb
            r0.addView(r2, r4, r3)
            r5.zze = r1
            goto L7c
        L69:
            android.app.Activity r0 = r5.zzb
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 == 0) goto L7c
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zzd
            android.app.Activity r2 = r5.zzb
            android.content.Context r2 = r2.getApplicationContext()
            r0.zzan(r2)
        L7c:
            r5.zzd = r1
        L7e:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.zzc
            if (r0 == 0) goto L8b
            com.google.android.gms.ads.internal.overlay.zzr r0 = r0.zzc
            if (r0 == 0) goto L8b
            int r1 = r5.zzn
            r0.zzdu(r1)
        L8b:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.zzc
            if (r0 == 0) goto La2
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzd
            if (r0 == 0) goto La2
            com.google.android.gms.internal.ads.zzegf r0 = r0.zzQ()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r5.zzc
            com.google.android.gms.internal.ads.zzcfo r1 = r1.zzd
            android.view.View r1 = r1.zzF()
            zzL(r0, r1)
        La2:
            return
    }

    public final void zzd() {
            r2 = this;
            com.google.android.gms.ads.internal.overlay.zzh r0 = r2.zzl
            r1 = 1
            r0.zzb = r1
            return
    }

    protected final void zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            r0.zzaa()
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzefl r2) throws com.google.android.gms.ads.internal.overlay.zzg, android.os.RemoteException {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.zzbtf r0 = r0.zzv
            if (r0 == 0) goto L10
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)
            r0.zzg(r2)
            return
        L10:
            com.google.android.gms.ads.internal.overlay.zzg r2 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r0 = "noioou"
            r2.<init>(r0)
            throw r2
    }

    public final void zzg() {
            r3 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r3.zzc
            if (r0 == 0) goto Ld
            boolean r1 = r3.zzg
            if (r1 == 0) goto Ld
            int r0 = r0.zzj
            r3.zzA(r0)
        Ld:
            android.widget.FrameLayout r0 = r3.zzh
            r1 = 0
            if (r0 == 0) goto L23
            android.app.Activity r0 = r3.zzb
            com.google.android.gms.ads.internal.overlay.zzh r2 = r3.zzl
            r0.setContentView(r2)
            r0 = 1
            r3.zzs = r0
            android.widget.FrameLayout r0 = r3.zzh
            r0.removeAllViews()
            r3.zzh = r1
        L23:
            android.webkit.WebChromeClient$CustomViewCallback r0 = r3.zzi
            if (r0 == 0) goto L2c
            r0.onCustomViewHidden()
            r3.zzi = r1
        L2c:
            r0 = 0
            r3.zzg = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzh(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzi() {
            r1 = this;
            r0 = 1
            r1.zzn = r0
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzj() {
            r1 = this;
            r0 = 2
            r1.zzn = r0
            android.app.Activity r0 = r1.zzb
            r0.finish()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper r1) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            r0.zzK(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public void zzl(android.os.Bundle r9) {
            r8 = this;
            boolean r0 = r8.zzs
            r1 = 1
            if (r0 != 0) goto La
            android.app.Activity r0 = r8.zzb
            r0.requestWindowFeature(r1)
        La:
            r0 = 0
            if (r9 == 0) goto L17
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            r8.zzj = r2
            r2 = 4
            android.app.Activity r3 = r8.zzb     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            android.content.Intent r3 = r3.getIntent()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzb(r3)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r8.zzc = r3     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r3 == 0) goto L10e
            boolean r3 = r3.zzw     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r3 == 0) goto L44
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r4 = 28
            if (r3 < r4) goto L39
            android.app.Activity r3 = r8.zzb     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r3.setShowWhenLocked(r1)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            goto L44
        L39:
            android.app.Activity r3 = r8.zzb     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            android.view.Window r3 = r3.getWindow()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r4 = 524288(0x80000, float:7.34684E-40)
            r3.addFlags(r4)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        L44:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.zzc     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r3.zzm     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            int r3 = r3.clientJarVersion     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r4 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r3 <= r4) goto L51
            r8.zzn = r2     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        L51:
            android.app.Activity r3 = r8.zzb     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            android.content.Intent r3 = r3.getIntent()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r3 == 0) goto L67
            android.app.Activity r3 = r8.zzb     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            android.content.Intent r3 = r3.getIntent()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            java.lang.String r4 = "shouldCallOnOverlayOpened"
            boolean r3 = r3.getBooleanExtra(r4, r1)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r8.zzv = r3     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        L67:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.zzc     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.ads.internal.zzk r4 = r3.zzo     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r5 = 5
            if (r4 == 0) goto L75
            boolean r6 = r4.zza     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r8.zzk = r6     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r6 == 0) goto L90
            goto L7b
        L75:
            int r6 = r3.zzk     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r6 != r5) goto L8e
            r8.zzk = r1     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        L7b:
            int r3 = r3.zzk     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r3 == r5) goto L90
            int r3 = r4.zzf     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r4 = -1
            if (r3 == r4) goto L90
            com.google.android.gms.ads.internal.overlay.zzl r3 = new com.google.android.gms.ads.internal.overlay.zzl     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r4 = 0
            r3.<init>(r8, r4)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r3.zzb()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            goto L90
        L8e:
            r8.zzk = r0     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        L90:
            if (r9 != 0) goto Lbe
            boolean r9 = r8.zzv     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r9 == 0) goto La8
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.internal.ads.zzcyn r9 = r9.zzt     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r9 == 0) goto L9f
            r9.zze()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        L9f:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.ads.internal.overlay.zzr r9 = r9.zzc     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r9 == 0) goto La8
            r9.zzdr()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        La8:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            int r3 = r9.zzk     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r3 == r1) goto Lbe
            com.google.android.gms.ads.internal.client.zza r9 = r9.zzb     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r9 == 0) goto Lb5
            r9.onAdClicked()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        Lb5:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.internal.ads.zzdga r9 = r9.zzu     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r9 == 0) goto Lbe
            r9.zzdG()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        Lbe:
            com.google.android.gms.ads.internal.overlay.zzh r9 = new com.google.android.gms.ads.internal.overlay.zzh     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            android.app.Activity r3 = r8.zzb     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.zzc     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            java.lang.String r6 = r4.zzn     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r7 = r4.zzm     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            java.lang.String r7 = r7.afmaVersion     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            java.lang.String r4 = r4.zzs     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r9.<init>(r3, r6, r7, r4)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r8.zzl = r9     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r3 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r3)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.ads.internal.util.zzab r9 = com.google.android.gms.ads.internal.zzu.zzq()     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            android.app.Activity r3 = r8.zzb     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r9.zzk(r3)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            int r3 = r9.zzk     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            if (r3 == r1) goto L10a
            r4 = 2
            if (r3 == r4) goto Lfd
            r9 = 3
            if (r3 == r9) goto Lf9
            if (r3 != r5) goto Lf1
            r8.zzD(r0)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            return
        Lf1:
            com.google.android.gms.ads.internal.overlay.zzg r9 = new com.google.android.gms.ads.internal.overlay.zzg     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            throw r9     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        Lf9:
            r8.zzD(r1)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            return
        Lfd:
            com.google.android.gms.ads.internal.overlay.zzi r1 = new com.google.android.gms.ads.internal.overlay.zzi     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            com.google.android.gms.internal.ads.zzcfo r9 = r9.zzd     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r1.<init>(r9)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r8.zze = r1     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            r8.zzD(r0)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            return
        L10a:
            r8.zzD(r0)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            return
        L10e:
            com.google.android.gms.ads.internal.overlay.zzg r9 = new com.google.android.gms.ads.internal.overlay.zzg     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
            throw r9     // Catch: com.google.android.gms.ads.internal.overlay.zzg -> L116
        L116:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r9)
            r8.zzn = r2
            android.app.Activity r9 = r8.zzb
            r9.finish()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzm() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            if (r0 == 0) goto Ld
            com.google.android.gms.ads.internal.overlay.zzh r1 = r2.zzl     // Catch: java.lang.NullPointerException -> Ld
            android.view.View r0 = r0.zzF()     // Catch: java.lang.NullPointerException -> Ld
            r1.removeView(r0)     // Catch: java.lang.NullPointerException -> Ld
        Ld:
            r2.zzF()
            return
    }

    public final void zzn() {
            r1 = this;
            boolean r0 = r1.zzm
            if (r0 == 0) goto La
            r0 = 0
            r1.zzm = r0
            r1.zze()
        La:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzo() {
            r2 = this;
            r2.zzg()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r2.zzc
            if (r0 == 0) goto Le
            com.google.android.gms.ads.internal.overlay.zzr r0 = r0.zzc
            if (r0 == 0) goto Le
            r0.zzdk()
        Le:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeK
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L35
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            if (r0 == 0) goto L35
            android.app.Activity r0 = r2.zzb
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L30
            com.google.android.gms.ads.internal.overlay.zzi r0 = r2.zze
            if (r0 != 0) goto L35
        L30:
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            r0.onPause()
        L35:
            r2.zzF()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzp(int r3, java.lang.String[] r4, int[] r5) {
            r2 = this;
            r0 = 12345(0x3039, float:1.7299E-41)
            if (r3 != r0) goto L29
            android.app.Activity r3 = r2.zzb
            com.google.android.gms.internal.ads.zzefk r0 = com.google.android.gms.internal.ads.zzefl.zze()
            r0.zza(r3)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r2.zzc
            int r3 = r3.zzk
            r1 = 5
            if (r3 != r1) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = 0
        L17:
            r0.zzb(r3)
            com.google.android.gms.internal.ads.zzefl r3 = r0.zze()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r2.zzc     // Catch: android.os.RemoteException -> L29
            com.google.android.gms.internal.ads.zzbtf r0 = r0.zzv     // Catch: android.os.RemoteException -> L29
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L29
            r0.zzf(r4, r5, r3)     // Catch: android.os.RemoteException -> L29
        L29:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzq() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzr() {
            r2 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r2.zzc
            if (r0 == 0) goto Lb
            com.google.android.gms.ads.internal.overlay.zzr r0 = r0.zzc
            if (r0 == 0) goto Lb
            r0.zzdH()
        Lb:
            android.app.Activity r0 = r2.zzb
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            r2.zzK(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeK
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3f
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            if (r0 == 0) goto L3a
            boolean r0 = r0.zzaE()
            if (r0 != 0) goto L3a
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            r0.onResume()
            return
        L3a:
            java.lang.String r0 = "The webview does not exist. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L3f:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzs(android.os.Bundle r3) {
            r2 = this;
            boolean r0 = r2.zzj
            java.lang.String r1 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            r3.putBoolean(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzt() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeK
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            if (r0 == 0) goto L22
            boolean r0 = r0.zzaE()
            if (r0 != 0) goto L22
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            r0.onResume()
            return
        L22:
            java.lang.String r0 = "The webview does not exist. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L27:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzu() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeK
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            if (r0 == 0) goto L27
            android.app.Activity r0 = r2.zzb
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.overlay.zzi r0 = r2.zze
            if (r0 != 0) goto L27
        L22:
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd
            r0.onPause()
        L27:
            r2.zzF()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzv() {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            if (r0 == 0) goto Lb
            com.google.android.gms.ads.internal.overlay.zzr r0 = r0.zzc
            if (r0 == 0) goto Lb
            r0.zzdt()
        Lb:
            return
    }

    public final void zzw(boolean r7) {
            r6 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzc
            boolean r0 = r0.zzw
            if (r0 == 0) goto L7
            return
        L7:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeN
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbe
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L30
            if (r7 == 0) goto L2e
            goto L30
        L2e:
            r1 = 0
            goto L31
        L30:
            r1 = 1
        L31:
            com.google.android.gms.ads.internal.overlay.zzt r4 = new com.google.android.gms.ads.internal.overlay.zzt
            r4.<init>()
            r5 = 50
            r4.zzd = r5
            if (r3 == r1) goto L3e
            r5 = 0
            goto L3f
        L3e:
            r5 = r0
        L3f:
            r4.zza = r5
            if (r3 == r1) goto L44
            r2 = r0
        L44:
            r4.zzb = r2
            r4.zzc = r0
            android.app.Activity r0 = r6.zzb
            com.google.android.gms.ads.internal.overlay.zzu r2 = new com.google.android.gms.ads.internal.overlay.zzu
            r2.<init>(r0, r4, r6)
            r6.zzf = r2
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r0.<init>(r2, r2)
            r2 = 10
            r0.addRule(r2)
            if (r3 == r1) goto L61
            r1 = 9
            goto L63
        L61:
            r1 = 11
        L63:
            r0.addRule(r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r6.zzc
            boolean r1 = r1.zzg
            r6.zzy(r7, r1)
            com.google.android.gms.ads.internal.overlay.zzh r7 = r6.zzl
            com.google.android.gms.ads.internal.overlay.zzu r1 = r6.zzf
            r7.addView(r1, r0)
            com.google.android.gms.ads.internal.overlay.zzu r7 = r6.zzf
            r6.zzJ(r7)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzx() {
            r1 = this;
            r0 = 1
            r1.zzs = r0
            return
    }

    public final void zzy(boolean r7, boolean r8) {
            r6 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbc
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzc
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.zzk r0 = r0.zzo
            if (r0 == 0) goto L22
            boolean r0 = r0.zzh
            if (r0 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzbd
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L43
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzc
            if (r3 == 0) goto L43
            com.google.android.gms.ads.internal.zzk r3 = r3.zzo
            if (r3 == 0) goto L43
            boolean r3 = r3.zzi
            if (r3 == 0) goto L43
            r3 = 1
            goto L44
        L43:
            r3 = 0
        L44:
            if (r7 == 0) goto L5a
            if (r8 == 0) goto L5a
            if (r0 == 0) goto L5a
            if (r3 != 0) goto L5a
            com.google.android.gms.internal.ads.zzbsp r7 = new com.google.android.gms.internal.ads.zzbsp
            com.google.android.gms.internal.ads.zzcfo r4 = r6.zzd
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.zzh(r4)
        L5a:
            com.google.android.gms.ads.internal.overlay.zzu r7 = r6.zzf
            if (r7 == 0) goto L69
            if (r3 != 0) goto L66
            if (r8 == 0) goto L65
            if (r0 != 0) goto L65
            goto L66
        L65:
            r1 = 0
        L66:
            r7.zzb(r1)
        L69:
            return
    }

    public final void zzz() {
            r2 = this;
            com.google.android.gms.ads.internal.overlay.zzh r0 = r2.zzl
            com.google.android.gms.ads.internal.overlay.zzu r1 = r2.zzf
            r0.removeView(r1)
            r0 = 1
            r2.zzw(r0)
            return
    }
}
