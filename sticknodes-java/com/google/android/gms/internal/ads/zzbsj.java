package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbsj extends com.google.android.gms.internal.ads.zzbsp {
    private java.lang.String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final java.lang.Object zzi;
    private final com.google.android.gms.internal.ads.zzcfo zzj;
    private final android.app.Activity zzk;
    private com.google.android.gms.internal.ads.zzchi zzl;
    private android.widget.ImageView zzm;
    private android.widget.LinearLayout zzn;
    private final com.google.android.gms.internal.ads.zzbsq zzo;
    private android.widget.PopupWindow zzp;
    private android.widget.RelativeLayout zzq;
    private android.view.ViewGroup zzr;

    static {
            java.lang.String r0 = "top-left"
            java.lang.String r1 = "top-right"
            java.lang.String r2 = "top-center"
            java.lang.String r3 = "center"
            java.lang.String r4 = "bottom-left"
            java.lang.String r5 = "bottom-right"
            java.lang.String r6 = "bottom-center"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            com.google.android.gms.common.util.CollectionUtils.setOf(r0)
            return
    }

    public zzbsj(com.google.android.gms.internal.ads.zzcfo r3, com.google.android.gms.internal.ads.zzbsq r4) {
            r2 = this;
            java.lang.String r0 = "resize"
            r2.<init>(r3, r0)
            java.lang.String r0 = "top-right"
            r2.zza = r0
            r0 = 1
            r2.zzb = r0
            r0 = 0
            r2.zzc = r0
            r2.zzd = r0
            r1 = -1
            r2.zze = r1
            r2.zzf = r0
            r2.zzg = r0
            r2.zzh = r1
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzi = r0
            r2.zzj = r3
            android.app.Activity r3 = r3.zzi()
            r2.zzk = r3
            r2.zzo = r4
            return
    }

    private final void zzm(boolean r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkv
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
            android.widget.RelativeLayout r0 = r2.zzq
            com.google.android.gms.internal.ads.zzcfo r1 = r2.zzj
            android.view.View r1 = (android.view.View) r1
            r0.removeView(r1)
            android.widget.PopupWindow r0 = r2.zzp
            r0.dismiss()
            goto L2f
        L21:
            android.widget.PopupWindow r0 = r2.zzp
            r0.dismiss()
            android.widget.RelativeLayout r0 = r2.zzq
            com.google.android.gms.internal.ads.zzcfo r1 = r2.zzj
            android.view.View r1 = (android.view.View) r1
            r0.removeView(r1)
        L2f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkw
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzj
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L56
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.gms.internal.ads.zzcfo r1 = r2.zzj
            android.view.View r1 = (android.view.View) r1
            r0.removeView(r1)
        L56:
            android.view.ViewGroup r0 = r2.zzr
            if (r0 == 0) goto L99
            android.widget.ImageView r1 = r2.zzm
            r0.removeView(r1)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkx
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L89
            android.view.ViewGroup r0 = r2.zzr     // Catch: java.lang.IllegalStateException -> L82
            com.google.android.gms.internal.ads.zzcfo r1 = r2.zzj     // Catch: java.lang.IllegalStateException -> L82
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.IllegalStateException -> L82
            r0.addView(r1)     // Catch: java.lang.IllegalStateException -> L82
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzj     // Catch: java.lang.IllegalStateException -> L82
            com.google.android.gms.internal.ads.zzchi r1 = r2.zzl     // Catch: java.lang.IllegalStateException -> L82
            r0.zzaj(r1)     // Catch: java.lang.IllegalStateException -> L82
            goto L99
        L82:
            r0 = move-exception
            java.lang.String r1 = "Unable to add webview back to view hierarchy."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            goto L99
        L89:
            android.view.ViewGroup r0 = r2.zzr
            com.google.android.gms.internal.ads.zzcfo r1 = r2.zzj
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzj
            com.google.android.gms.internal.ads.zzchi r1 = r2.zzl
            r0.zzaj(r1)
        L99:
            if (r3 == 0) goto La7
            java.lang.String r3 = "default"
            r2.zzl(r3)
            com.google.android.gms.internal.ads.zzbsq r3 = r2.zzo
            if (r3 == 0) goto La7
            r3.zzb()
        La7:
            r3 = 0
            r2.zzp = r3
            r2.zzq = r3
            r2.zzr = r3
            r2.zzn = r3
            return
    }

    public final void zza(boolean r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzi
            monitor-enter(r0)
            android.widget.PopupWindow r1 = r3.zzp     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzku     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L32
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L37
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L37
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L37
            if (r1 == r2) goto L32
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbsh r2 = new com.google.android.gms.internal.ads.zzbsh     // Catch: java.lang.Throwable -> L37
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L37
            r1.zza(r2)     // Catch: java.lang.Throwable -> L37
            goto L35
        L32:
            r3.zzm(r4)     // Catch: java.lang.Throwable -> L37
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
    }

    public final void zzb(java.util.Map r18) {
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.Object r2 = r1.zzi
            monitor-enter(r2)
            android.app.Activity r3 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            if (r3 != 0) goto L12
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r1.zzh(r0)     // Catch: java.lang.Throwable -> L47d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L12:
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzchi r3 = r3.zzO()     // Catch: java.lang.Throwable -> L47d
            if (r3 != 0) goto L21
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r1.zzh(r0)     // Catch: java.lang.Throwable -> L47d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L21:
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzchi r3 = r3.zzO()     // Catch: java.lang.Throwable -> L47d
            boolean r3 = r3.zzi()     // Catch: java.lang.Throwable -> L47d
            if (r3 == 0) goto L34
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r1.zzh(r0)     // Catch: java.lang.Throwable -> L47d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L34:
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            boolean r3 = r3.zzaF()     // Catch: java.lang.Throwable -> L47d
            if (r3 == 0) goto L43
            java.lang.String r0 = "Cannot resize an expanded banner."
            r1.zzh(r0)     // Catch: java.lang.Throwable -> L47d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L43:
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L47d
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L47d
            if (r3 != 0) goto L62
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L47d
            int r3 = com.google.android.gms.ads.internal.util.zzt.zzO(r3)     // Catch: java.lang.Throwable -> L47d
            r1.zzh = r3     // Catch: java.lang.Throwable -> L47d
        L62:
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L47d
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L47d
            if (r3 != 0) goto L81
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L47d
            int r3 = com.google.android.gms.ads.internal.util.zzt.zzO(r3)     // Catch: java.lang.Throwable -> L47d
            r1.zze = r3     // Catch: java.lang.Throwable -> L47d
        L81:
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L47d
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L47d
            if (r3 != 0) goto La0
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L47d
            int r3 = com.google.android.gms.ads.internal.util.zzt.zzO(r3)     // Catch: java.lang.Throwable -> L47d
            r1.zzf = r3     // Catch: java.lang.Throwable -> L47d
        La0:
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L47d
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L47d
            if (r3 != 0) goto Lbf
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L47d
            int r3 = com.google.android.gms.ads.internal.util.zzt.zzO(r3)     // Catch: java.lang.Throwable -> L47d
            r1.zzg = r3     // Catch: java.lang.Throwable -> L47d
        Lbf:
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L47d
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L47d
            if (r3 != 0) goto Ldb
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L47d
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch: java.lang.Throwable -> L47d
            r1.zzb = r3     // Catch: java.lang.Throwable -> L47d
        Ldb:
            java.lang.String r3 = "customClosePosition"
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L47d
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L47d
            if (r3 != 0) goto Leb
            r1.zza = r0     // Catch: java.lang.Throwable -> L47d
        Leb:
            int r0 = r1.zzh     // Catch: java.lang.Throwable -> L47d
            if (r0 < 0) goto L476
            int r0 = r1.zze     // Catch: java.lang.Throwable -> L47d
            if (r0 < 0) goto L476
            android.app.Activity r0 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> L47d
            if (r0 == 0) goto L46f
            android.view.View r3 = r0.getDecorView()     // Catch: java.lang.Throwable -> L47d
            if (r3 != 0) goto L103
            goto L46f
        L103:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r3 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            int[] r3 = com.google.android.gms.ads.internal.util.zzt.zzV(r3)     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r4 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            int[] r4 = com.google.android.gms.ads.internal.util.zzt.zzR(r4)     // Catch: java.lang.Throwable -> L47d
            r5 = 0
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L47d
            r7 = 1
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L47d
            int r8 = r1.zzh     // Catch: java.lang.Throwable -> L47d
            r9 = 5
            r10 = 4
            r11 = 3
            r13 = 2
            r14 = 50
            if (r8 < r14) goto L256
            if (r8 <= r6) goto L129
            goto L256
        L129:
            int r15 = r1.zze     // Catch: java.lang.Throwable -> L47d
            if (r15 < r14) goto L250
            if (r15 <= r3) goto L131
            goto L250
        L131:
            if (r15 != r3) goto L13c
            if (r8 != r6) goto L13c
            java.lang.String r3 = "Cannot resize to a full-screen ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)     // Catch: java.lang.Throwable -> L47d
            goto L25b
        L13c:
            boolean r3 = r1.zzb     // Catch: java.lang.Throwable -> L47d
            if (r3 == 0) goto L20f
            java.lang.String r3 = r1.zza     // Catch: java.lang.Throwable -> L47d
            int r16 = r3.hashCode()     // Catch: java.lang.Throwable -> L47d
            switch(r16) {
                case -1364013995: goto L17c;
                case -1012429441: goto L172;
                case -655373719: goto L168;
                case 1163912186: goto L15e;
                case 1288627767: goto L154;
                case 1755462605: goto L14a;
                default: goto L149;
            }
        L149:
            goto L186
        L14a:
            java.lang.String r12 = "top-center"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L186
            r3 = 1
            goto L187
        L154:
            java.lang.String r12 = "bottom-center"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L186
            r3 = 4
            goto L187
        L15e:
            java.lang.String r12 = "bottom-right"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L186
            r3 = 5
            goto L187
        L168:
            java.lang.String r12 = "bottom-left"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L186
            r3 = 3
            goto L187
        L172:
            java.lang.String r12 = "top-left"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L186
            r3 = 0
            goto L187
        L17c:
            java.lang.String r12 = "center"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L186
            r3 = 2
            goto L187
        L186:
            r3 = -1
        L187:
            if (r3 == 0) goto L1e6
            if (r3 == r7) goto L1d8
            if (r3 == r13) goto L1c4
            if (r3 == r11) goto L1b7
            if (r3 == r10) goto L1a9
            if (r3 == r9) goto L19e
            int r3 = r1.zzc     // Catch: java.lang.Throwable -> L47d
            int r12 = r1.zzf     // Catch: java.lang.Throwable -> L47d
            int r3 = r3 + r12
            int r3 = r3 + r8
            int r3 = r3 + (-50)
            int r8 = r1.zzd     // Catch: java.lang.Throwable -> L47d
            goto L1e3
        L19e:
            int r3 = r1.zzc     // Catch: java.lang.Throwable -> L47d
            int r12 = r1.zzf     // Catch: java.lang.Throwable -> L47d
            int r3 = r3 + r12
            int r3 = r3 + r8
            int r3 = r3 + (-50)
            int r8 = r1.zzd     // Catch: java.lang.Throwable -> L47d
            goto L1b4
        L1a9:
            int r3 = r1.zzc     // Catch: java.lang.Throwable -> L47d
            int r12 = r1.zzf     // Catch: java.lang.Throwable -> L47d
            int r8 = r8 >> r7
            int r3 = r3 + r12
            int r3 = r3 + r8
            int r3 = r3 + (-25)
            int r8 = r1.zzd     // Catch: java.lang.Throwable -> L47d
        L1b4:
            int r12 = r1.zzg     // Catch: java.lang.Throwable -> L47d
            goto L1bf
        L1b7:
            int r3 = r1.zzc     // Catch: java.lang.Throwable -> L47d
            int r8 = r1.zzf     // Catch: java.lang.Throwable -> L47d
            int r3 = r3 + r8
            int r8 = r1.zzd     // Catch: java.lang.Throwable -> L47d
            goto L1b4
        L1bf:
            int r8 = r8 + r12
            int r8 = r8 + r15
            int r8 = r8 + (-50)
            goto L1ef
        L1c4:
            int r3 = r1.zzc     // Catch: java.lang.Throwable -> L47d
            int r12 = r1.zzf     // Catch: java.lang.Throwable -> L47d
            int r8 = r8 >> r7
            int r3 = r3 + r12
            int r3 = r3 + r8
            int r3 = r3 + (-25)
            int r8 = r1.zzd     // Catch: java.lang.Throwable -> L47d
            int r12 = r1.zzg     // Catch: java.lang.Throwable -> L47d
            int r8 = r8 + r12
            int r12 = r15 >> 1
            int r8 = r8 + r12
            int r8 = r8 + (-25)
            goto L1ef
        L1d8:
            int r3 = r1.zzc     // Catch: java.lang.Throwable -> L47d
            int r12 = r1.zzf     // Catch: java.lang.Throwable -> L47d
            int r8 = r8 >> r7
            int r3 = r3 + r12
            int r3 = r3 + r8
            int r3 = r3 + (-25)
            int r8 = r1.zzd     // Catch: java.lang.Throwable -> L47d
        L1e3:
            int r12 = r1.zzg     // Catch: java.lang.Throwable -> L47d
            goto L1ee
        L1e6:
            int r3 = r1.zzc     // Catch: java.lang.Throwable -> L47d
            int r8 = r1.zzf     // Catch: java.lang.Throwable -> L47d
            int r3 = r3 + r8
            int r8 = r1.zzd     // Catch: java.lang.Throwable -> L47d
            goto L1e3
        L1ee:
            int r8 = r8 + r12
        L1ef:
            if (r3 < 0) goto L25b
            int r3 = r3 + r14
            if (r3 > r6) goto L25b
            r3 = r4[r5]     // Catch: java.lang.Throwable -> L47d
            if (r8 < r3) goto L25b
            int r8 = r8 + r14
            r3 = r4[r7]     // Catch: java.lang.Throwable -> L47d
            if (r8 <= r3) goto L1fe
            goto L25b
        L1fe:
            int[] r15 = new int[r13]     // Catch: java.lang.Throwable -> L47d
            int r3 = r1.zzc     // Catch: java.lang.Throwable -> L47d
            int r4 = r1.zzf     // Catch: java.lang.Throwable -> L47d
            int r3 = r3 + r4
            r15[r5] = r3     // Catch: java.lang.Throwable -> L47d
            int r3 = r1.zzd     // Catch: java.lang.Throwable -> L47d
            int r4 = r1.zzg     // Catch: java.lang.Throwable -> L47d
            int r3 = r3 + r4
            r15[r7] = r3     // Catch: java.lang.Throwable -> L47d
            goto L25c
        L20f:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r3 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            int[] r3 = com.google.android.gms.ads.internal.util.zzt.zzV(r3)     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r4 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            int[] r4 = com.google.android.gms.ads.internal.util.zzt.zzR(r4)     // Catch: java.lang.Throwable -> L47d
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L47d
            int r6 = r1.zzc     // Catch: java.lang.Throwable -> L47d
            int r8 = r1.zzf     // Catch: java.lang.Throwable -> L47d
            int r6 = r6 + r8
            int r8 = r1.zzd     // Catch: java.lang.Throwable -> L47d
            int r12 = r1.zzg     // Catch: java.lang.Throwable -> L47d
            int r8 = r8 + r12
            if (r6 >= 0) goto L231
            r6 = 0
            goto L239
        L231:
            int r12 = r1.zzh     // Catch: java.lang.Throwable -> L47d
            int r15 = r6 + r12
            if (r15 <= r3) goto L239
            int r6 = r3 - r12
        L239:
            r3 = r4[r5]     // Catch: java.lang.Throwable -> L47d
            if (r8 >= r3) goto L23f
            r8 = r3
            goto L249
        L23f:
            int r3 = r1.zze     // Catch: java.lang.Throwable -> L47d
            int r12 = r8 + r3
            r4 = r4[r7]     // Catch: java.lang.Throwable -> L47d
            if (r12 <= r4) goto L249
            int r8 = r4 - r3
        L249:
            int[] r15 = new int[r13]     // Catch: java.lang.Throwable -> L47d
            r15[r5] = r6     // Catch: java.lang.Throwable -> L47d
            r15[r7] = r8     // Catch: java.lang.Throwable -> L47d
            goto L25c
        L250:
            java.lang.String r3 = "Height is too small or too large."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)     // Catch: java.lang.Throwable -> L47d
            goto L25b
        L256:
            java.lang.String r3 = "Width is too small or too large."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)     // Catch: java.lang.Throwable -> L47d
        L25b:
            r15 = 0
        L25c:
            if (r15 != 0) goto L265
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r1.zzh(r0)     // Catch: java.lang.Throwable -> L47d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L265:
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r3 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            int r4 = r1.zzh     // Catch: java.lang.Throwable -> L47d
            int r3 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r3, r4)     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r4 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            int r6 = r1.zze     // Catch: java.lang.Throwable -> L47d
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r4, r6)     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzcfo r6 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            android.view.View r6 = (android.view.View) r6     // Catch: java.lang.Throwable -> L47d
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Throwable -> L47d
            if (r6 == 0) goto L468
            boolean r8 = r6 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L47d
            if (r8 == 0) goto L468
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzcfo r8 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            android.view.View r8 = (android.view.View) r8     // Catch: java.lang.Throwable -> L47d
            r6.removeView(r8)     // Catch: java.lang.Throwable -> L47d
            android.widget.PopupWindow r8 = r1.zzp     // Catch: java.lang.Throwable -> L47d
            if (r8 != 0) goto L2cf
            r1.zzr = r6     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzcfo r6 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            r8 = r6
            android.view.View r8 = (android.view.View) r8     // Catch: java.lang.Throwable -> L47d
            r8.setDrawingCacheEnabled(r7)     // Catch: java.lang.Throwable -> L47d
            r8 = r6
            android.view.View r8 = (android.view.View) r8     // Catch: java.lang.Throwable -> L47d
            android.graphics.Bitmap r8 = r8.getDrawingCache()     // Catch: java.lang.Throwable -> L47d
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8)     // Catch: java.lang.Throwable -> L47d
            android.view.View r6 = (android.view.View) r6     // Catch: java.lang.Throwable -> L47d
            r6.setDrawingCacheEnabled(r5)     // Catch: java.lang.Throwable -> L47d
            android.widget.ImageView r6 = new android.widget.ImageView     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r12 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            r6.<init>(r12)     // Catch: java.lang.Throwable -> L47d
            r1.zzm = r6     // Catch: java.lang.Throwable -> L47d
            r6.setImageBitmap(r8)     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzcfo r6 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzchi r6 = r6.zzO()     // Catch: java.lang.Throwable -> L47d
            r1.zzl = r6     // Catch: java.lang.Throwable -> L47d
            android.view.ViewGroup r6 = r1.zzr     // Catch: java.lang.Throwable -> L47d
            android.widget.ImageView r8 = r1.zzm     // Catch: java.lang.Throwable -> L47d
            r6.addView(r8)     // Catch: java.lang.Throwable -> L47d
            goto L2d2
        L2cf:
            r8.dismiss()     // Catch: java.lang.Throwable -> L47d
        L2d2:
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r8 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L47d
            r1.zzq = r6     // Catch: java.lang.Throwable -> L47d
            r6.setBackgroundColor(r5)     // Catch: java.lang.Throwable -> L47d
            android.widget.RelativeLayout r6 = r1.zzq     // Catch: java.lang.Throwable -> L47d
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L47d
            r8.<init>(r3, r4)     // Catch: java.lang.Throwable -> L47d
            r6.setLayoutParams(r8)     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            android.widget.RelativeLayout r6 = r1.zzq     // Catch: java.lang.Throwable -> L47d
            android.widget.PopupWindow r8 = new android.widget.PopupWindow     // Catch: java.lang.Throwable -> L47d
            r8.<init>(r6, r3, r4, r5)     // Catch: java.lang.Throwable -> L47d
            r1.zzp = r8     // Catch: java.lang.Throwable -> L47d
            r8.setOutsideTouchable(r5)     // Catch: java.lang.Throwable -> L47d
            android.widget.PopupWindow r6 = r1.zzp     // Catch: java.lang.Throwable -> L47d
            r6.setTouchable(r7)     // Catch: java.lang.Throwable -> L47d
            android.widget.PopupWindow r6 = r1.zzp     // Catch: java.lang.Throwable -> L47d
            boolean r8 = r1.zzb     // Catch: java.lang.Throwable -> L47d
            r8 = r8 ^ r7
            r6.setClippingEnabled(r8)     // Catch: java.lang.Throwable -> L47d
            android.widget.RelativeLayout r6 = r1.zzq     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzcfo r8 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            android.view.View r8 = (android.view.View) r8     // Catch: java.lang.Throwable -> L47d
            r12 = -1
            r6.addView(r8, r12, r12)     // Catch: java.lang.Throwable -> L47d
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r8 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L47d
            r1.zzn = r6     // Catch: java.lang.Throwable -> L47d
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r8 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            int r8 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r8, r14)     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r12 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            int r12 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r12, r14)     // Catch: java.lang.Throwable -> L47d
            r6.<init>(r8, r12)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r8 = r1.zza     // Catch: java.lang.Throwable -> L47d
            int r12 = r8.hashCode()     // Catch: java.lang.Throwable -> L47d
            switch(r12) {
                case -1364013995: goto L36a;
                case -1012429441: goto L360;
                case -655373719: goto L356;
                case 1163912186: goto L34c;
                case 1288627767: goto L342;
                case 1755462605: goto L338;
                default: goto L337;
            }
        L337:
            goto L374
        L338:
            java.lang.String r12 = "top-center"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L374
            r12 = 1
            goto L375
        L342:
            java.lang.String r12 = "bottom-center"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L374
            r12 = 4
            goto L375
        L34c:
            java.lang.String r12 = "bottom-right"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L374
            r12 = 5
            goto L375
        L356:
            java.lang.String r12 = "bottom-left"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L374
            r12 = 3
            goto L375
        L360:
            java.lang.String r12 = "top-left"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L374
            r12 = 0
            goto L375
        L36a:
            java.lang.String r12 = "center"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L374
            r12 = 2
            goto L375
        L374:
            r12 = -1
        L375:
            r8 = 9
            r14 = 10
            if (r12 == 0) goto L3b4
            r5 = 14
            if (r12 == r7) goto L3ad
            if (r12 == r13) goto L3a7
            r13 = 12
            if (r12 == r11) goto L3a0
            if (r12 == r10) goto L399
            r5 = 11
            if (r12 == r9) goto L392
            r6.addRule(r14)     // Catch: java.lang.Throwable -> L47d
            r6.addRule(r5)     // Catch: java.lang.Throwable -> L47d
            goto L3ba
        L392:
            r6.addRule(r13)     // Catch: java.lang.Throwable -> L47d
            r6.addRule(r5)     // Catch: java.lang.Throwable -> L47d
            goto L3ba
        L399:
            r6.addRule(r13)     // Catch: java.lang.Throwable -> L47d
            r6.addRule(r5)     // Catch: java.lang.Throwable -> L47d
            goto L3ba
        L3a0:
            r6.addRule(r13)     // Catch: java.lang.Throwable -> L47d
            r6.addRule(r8)     // Catch: java.lang.Throwable -> L47d
            goto L3ba
        L3a7:
            r5 = 13
            r6.addRule(r5)     // Catch: java.lang.Throwable -> L47d
            goto L3ba
        L3ad:
            r6.addRule(r14)     // Catch: java.lang.Throwable -> L47d
            r6.addRule(r5)     // Catch: java.lang.Throwable -> L47d
            goto L3ba
        L3b4:
            r6.addRule(r14)     // Catch: java.lang.Throwable -> L47d
            r6.addRule(r8)     // Catch: java.lang.Throwable -> L47d
        L3ba:
            android.widget.LinearLayout r5 = r1.zzn     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzbsi r8 = new com.google.android.gms.internal.ads.zzbsi     // Catch: java.lang.Throwable -> L47d
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L47d
            r5.setOnClickListener(r8)     // Catch: java.lang.Throwable -> L47d
            android.widget.LinearLayout r5 = r1.zzn     // Catch: java.lang.Throwable -> L47d
            java.lang.String r8 = "Close button"
            r5.setContentDescription(r8)     // Catch: java.lang.Throwable -> L47d
            android.widget.RelativeLayout r5 = r1.zzq     // Catch: java.lang.Throwable -> L47d
            android.widget.LinearLayout r8 = r1.zzn     // Catch: java.lang.Throwable -> L47d
            r5.addView(r8, r6)     // Catch: java.lang.Throwable -> L47d
            android.widget.PopupWindow r5 = r1.zzp     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            android.app.Activity r6 = r1.zzk     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            r8 = 0
            r9 = r15[r8]     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            int r6 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r6, r9)     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            android.app.Activity r8 = r1.zzk     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            r9 = r15[r7]     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            int r8 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r8, r9)     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            r9 = 0
            r5.showAtLocation(r0, r9, r6, r8)     // Catch: java.lang.RuntimeException -> L42b java.lang.Throwable -> L47d
            r0 = r15[r9]     // Catch: java.lang.Throwable -> L47d
            r5 = r15[r7]     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzbsq r6 = r1.zzo     // Catch: java.lang.Throwable -> L47d
            if (r6 == 0) goto L402
            int r8 = r1.zzh     // Catch: java.lang.Throwable -> L47d
            int r9 = r1.zze     // Catch: java.lang.Throwable -> L47d
            r6.zza(r0, r5, r8, r9)     // Catch: java.lang.Throwable -> L47d
        L402:
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzchi r3 = com.google.android.gms.internal.ads.zzchi.zzb(r3, r4)     // Catch: java.lang.Throwable -> L47d
            r0.zzaj(r3)     // Catch: java.lang.Throwable -> L47d
            r0 = 0
            r3 = r15[r0]     // Catch: java.lang.Throwable -> L47d
            r0 = r15[r7]     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L47d
            android.app.Activity r4 = r1.zzk     // Catch: java.lang.Throwable -> L47d
            int[] r4 = com.google.android.gms.ads.internal.util.zzt.zzR(r4)     // Catch: java.lang.Throwable -> L47d
            r5 = 0
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L47d
            int r0 = r0 - r4
            int r4 = r1.zzh     // Catch: java.lang.Throwable -> L47d
            int r5 = r1.zze     // Catch: java.lang.Throwable -> L47d
            r1.zzk(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r0 = "resized"
            r1.zzl(r0)     // Catch: java.lang.Throwable -> L47d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L42b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L47d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47d
            r3.<init>()     // Catch: java.lang.Throwable -> L47d
            java.lang.String r4 = "Cannot show popup window: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L47d
            r3.append(r0)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L47d
            r1.zzh(r0)     // Catch: java.lang.Throwable -> L47d
            android.widget.RelativeLayout r0 = r1.zzq     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L47d
            r0.removeView(r3)     // Catch: java.lang.Throwable -> L47d
            android.view.ViewGroup r0 = r1.zzr     // Catch: java.lang.Throwable -> L47d
            if (r0 == 0) goto L466
            android.widget.ImageView r3 = r1.zzm     // Catch: java.lang.Throwable -> L47d
            r0.removeView(r3)     // Catch: java.lang.Throwable -> L47d
            android.view.ViewGroup r0 = r1.zzr     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L47d
            r0.addView(r3)     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzj     // Catch: java.lang.Throwable -> L47d
            com.google.android.gms.internal.ads.zzchi r3 = r1.zzl     // Catch: java.lang.Throwable -> L47d
            r0.zzaj(r3)     // Catch: java.lang.Throwable -> L47d
        L466:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L468:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r1.zzh(r0)     // Catch: java.lang.Throwable -> L47d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L46f:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r1.zzh(r0)     // Catch: java.lang.Throwable -> L47d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L476:
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r1.zzh(r0)     // Catch: java.lang.Throwable -> L47d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            return
        L47d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47d
            throw r0
    }

    final /* synthetic */ void zzc(boolean r1) {
            r0 = this;
            r0.zzm(r1)
            return
    }

    public final void zzd(int r1, int r2, boolean r3) {
            r0 = this;
            java.lang.Object r3 = r0.zzi
            monitor-enter(r3)
            r0.zzc = r1     // Catch: java.lang.Throwable -> L9
            r0.zzd = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public final void zze(int r1, int r2) {
            r0 = this;
            r0.zzc = r1
            r0.zzd = r2
            return
    }

    public final boolean zzf() {
            r2 = this;
            java.lang.Object r0 = r2.zzi
            monitor-enter(r0)
            android.widget.PopupWindow r1 = r2.zzp     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
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
}
