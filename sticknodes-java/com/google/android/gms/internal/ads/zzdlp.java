package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdlp {
    static final android.widget.ImageView.ScaleType zza = null;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final com.google.android.gms.internal.ads.zzfhc zzc;
    private final com.google.android.gms.internal.ads.zzdku zzd;
    private final com.google.android.gms.internal.ads.zzdkp zze;
    private final com.google.android.gms.internal.ads.zzdmb zzf;
    private final com.google.android.gms.internal.ads.zzdmj zzg;
    private final java.util.concurrent.Executor zzh;
    private final java.util.concurrent.Executor zzi;
    private final com.google.android.gms.internal.ads.zzbfr zzj;
    private final com.google.android.gms.internal.ads.zzdkm zzk;

    static {
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            com.google.android.gms.internal.ads.zzdlp.zza = r0
            return
    }

    public zzdlp(com.google.android.gms.ads.internal.util.zzg r1, com.google.android.gms.internal.ads.zzfhc r2, com.google.android.gms.internal.ads.zzdku r3, com.google.android.gms.internal.ads.zzdkp r4, com.google.android.gms.internal.ads.zzdmb r5, com.google.android.gms.internal.ads.zzdmj r6, java.util.concurrent.Executor r7, java.util.concurrent.Executor r8, com.google.android.gms.internal.ads.zzdkm r9) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            com.google.android.gms.internal.ads.zzbfr r1 = r2.zzi
            r0.zzj = r1
            r0.zzd = r3
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            r0.zzh = r7
            r0.zzi = r8
            r0.zzk = r9
            return
    }

    private static void zzh(android.widget.RelativeLayout.LayoutParams r5, int r6) {
            r0 = 9
            r1 = 10
            if (r6 == 0) goto L25
            r2 = 2
            r3 = 11
            r4 = 12
            if (r6 == r2) goto L1e
            r2 = 3
            if (r6 == r2) goto L17
            r5.addRule(r1)
            r5.addRule(r3)
            return
        L17:
            r5.addRule(r4)
            r5.addRule(r0)
            return
        L1e:
            r5.addRule(r4)
            r5.addRule(r3)
            return
        L25:
            r5.addRule(r1)
            r5.addRule(r0)
            return
    }

    private final boolean zzi(android.view.ViewGroup r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L9
            com.google.android.gms.internal.ads.zzdkp r5 = r3.zze
            android.view.View r5 = r5.zzf()
            goto Lf
        L9:
            com.google.android.gms.internal.ads.zzdkp r5 = r3.zze
            android.view.View r5 = r5.zzg()
        Lf:
            if (r5 != 0) goto L13
            r4 = 0
            return r4
        L13:
            r4.removeAllViews()
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L27
            android.view.ViewParent r0 = r5.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r5)
        L27:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdN
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 17
            if (r0 == 0) goto L42
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r0.<init>(r2, r2, r1)
            goto L48
        L42:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r0.<init>(r2, r2, r1)
        L48:
            r4.addView(r5, r0)
            r4 = 1
            return r4
    }

    final /* synthetic */ void zza(android.view.ViewGroup r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r4.zze
            android.view.View r1 = r0.zzf()
            if (r1 == 0) goto L4b
            r1 = 1
            if (r5 == 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            int r2 = r0.zzc()
            r3 = 2
            if (r2 == r3) goto L3a
            int r2 = r0.zzc()
            if (r2 != r1) goto L1c
            goto L3a
        L1c:
            int r0 = r0.zzc()
            r1 = 6
            if (r0 != r1) goto L4b
            com.google.android.gms.ads.internal.util.zzg r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfhc r1 = r4.zzc
            java.lang.String r1 = r1.zzf
            java.lang.String r2 = "2"
            r0.zzK(r1, r2, r5)
            com.google.android.gms.ads.internal.util.zzg r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfhc r1 = r4.zzc
            java.lang.String r1 = r1.zzf
            java.lang.String r2 = "1"
            r0.zzK(r1, r2, r5)
            return
        L3a:
            com.google.android.gms.ads.internal.util.zzg r1 = r4.zzb
            com.google.android.gms.internal.ads.zzfhc r2 = r4.zzc
            int r0 = r0.zzc()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.zzf
            r1.zzK(r2, r0, r5)
        L4b:
            return
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzdml r10) {
            r9 = this;
            com.google.android.gms.internal.ads.zzdku r0 = r9.zzd
            boolean r0 = r0.zzf()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L15
            com.google.android.gms.internal.ads.zzdku r0 = r9.zzd
            boolean r0 = r0.zze()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r4 = r2
            goto L33
        L15:
            java.lang.String r0 = "1098"
            java.lang.String r3 = "3011"
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            r3 = 0
        L1e:
            r4 = 2
            if (r3 >= r4) goto L13
            r4 = r0[r3]
            android.view.View r4 = r10.zzg(r4)
            if (r4 == 0) goto L30
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L30
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L33
        L30:
            int r3 = r3 + 1
            goto L1e
        L33:
            android.view.View r0 = r10.zzf()
            android.content.Context r0 = r0.getContext()
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r5 = -2
            r3.<init>(r5, r5)
            com.google.android.gms.internal.ads.zzdkp r5 = r9.zze
            android.view.View r6 = r5.zze()
            if (r6 == 0) goto L5e
            com.google.android.gms.internal.ads.zzbfr r0 = r9.zzj
            android.view.View r5 = r5.zze()
            if (r0 != 0) goto L52
            goto L8d
        L52:
            if (r4 != 0) goto L8d
            int r0 = r0.zze
            zzh(r3, r0)
            r5.setLayoutParams(r3)
            r4 = r2
            goto L8d
        L5e:
            com.google.android.gms.internal.ads.zzbfv r6 = r5.zzl()
            boolean r6 = r6 instanceof com.google.android.gms.internal.ads.zzbfm
            if (r6 != 0) goto L68
            r5 = r2
            goto L8d
        L68:
            com.google.android.gms.internal.ads.zzbfv r5 = r5.zzl()
            com.google.android.gms.internal.ads.zzbfm r5 = (com.google.android.gms.internal.ads.zzbfm) r5
            if (r4 != 0) goto L78
            int r4 = r5.zzc()
            zzh(r3, r4)
            r4 = r2
        L78:
            com.google.android.gms.internal.ads.zzbfn r6 = new com.google.android.gms.internal.ads.zzbfn
            r6.<init>(r0, r5, r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdL
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.setContentDescription(r0)
            r5 = r6
        L8d:
            r0 = -1
            r3 = 1
            if (r5 != 0) goto L92
            goto Ld4
        L92:
            android.view.ViewParent r6 = r5.getParent()
            boolean r6 = r6 instanceof android.view.ViewGroup
            if (r6 == 0) goto La3
            android.view.ViewParent r6 = r5.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r6.removeView(r5)
        La3:
            if (r4 == 0) goto Lac
            r4.removeAllViews()
            r4.addView(r5)
            goto Lcd
        Lac:
            com.google.android.gms.ads.formats.zza r4 = new com.google.android.gms.ads.formats.zza
            android.view.View r6 = r10.zzf()
            android.content.Context r6 = r6.getContext()
            r4.<init>(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r0, r0)
            r4.setLayoutParams(r6)
            r4.addView(r5)
            android.widget.FrameLayout r6 = r10.zzh()
            if (r6 == 0) goto Lcd
            r6.addView(r4)
        Lcd:
            java.lang.String r4 = r10.zzk()
            r10.zzq(r4, r5, r3)
        Ld4:
            com.google.android.gms.internal.ads.zzgax r4 = com.google.android.gms.internal.ads.zzdll.zza
            int r5 = r4.size()
            r6 = 0
        Ldb:
            if (r6 >= r5) goto Lf0
            java.lang.Object r7 = r4.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            android.view.View r7 = r10.zzg(r7)
            boolean r8 = r7 instanceof android.view.ViewGroup
            int r6 = r6 + 1
            if (r8 == 0) goto Ldb
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto Lf1
        Lf0:
            r7 = r2
        Lf1:
            java.util.concurrent.Executor r4 = r9.zzi
            com.google.android.gms.internal.ads.zzdlm r5 = new com.google.android.gms.internal.ads.zzdlm
            r5.<init>(r9, r7)
            r4.execute(r5)
            if (r7 != 0) goto Lff
            goto L1ad
        Lff:
            boolean r3 = r9.zzi(r7, r3)
            if (r3 == 0) goto L11a
            com.google.android.gms.internal.ads.zzdkp r0 = r9.zze
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzs()
            if (r1 == 0) goto L1ad
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzs()
            com.google.android.gms.internal.ads.zzdlo r1 = new com.google.android.gms.internal.ads.zzdlo
            r1.<init>(r10, r7)
            r0.zzar(r1)
            return
        L11a:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzjF
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L147
            boolean r1 = r9.zzi(r7, r1)
            if (r1 == 0) goto L147
            com.google.android.gms.internal.ads.zzdkp r0 = r9.zze
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzq()
            if (r1 == 0) goto L1ad
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzq()
            com.google.android.gms.internal.ads.zzdlo r1 = new com.google.android.gms.internal.ads.zzdlo
            r1.<init>(r10, r7)
            r0.zzar(r1)
            return
        L147:
            r7.removeAllViews()
            android.view.View r1 = r10.zzf()
            if (r1 == 0) goto L154
            android.content.Context r2 = r1.getContext()
        L154:
            if (r2 == 0) goto L1ad
            com.google.android.gms.internal.ads.zzdkm r1 = r9.zzk
            com.google.android.gms.internal.ads.zzbfz r1 = r1.zza()
            if (r1 == 0) goto L1ad
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.zzi()     // Catch: android.os.RemoteException -> L1a8
            if (r1 == 0) goto L1ad
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            if (r1 == 0) goto L1ad
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r2)
            r3.setImageDrawable(r1)
            com.google.android.gms.dynamic.IObjectWrapper r10 = r10.zzj()
            if (r10 == 0) goto L197
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfW
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L18d
            goto L197
        L18d:
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.widget.ImageView$ScaleType r10 = (android.widget.ImageView.ScaleType) r10
            r3.setScaleType(r10)
            goto L19c
        L197:
            android.widget.ImageView$ScaleType r10 = com.google.android.gms.internal.ads.zzdlp.zza
            r3.setScaleType(r10)
        L19c:
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r0, r0)
            r3.setLayoutParams(r10)
            r7.addView(r3)
            return
        L1a8:
            java.lang.String r10 = "Could not get main image drawable"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r10)
        L1ad:
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzdml r2) {
            r1 = this;
            if (r2 == 0) goto L29
            com.google.android.gms.internal.ads.zzdmb r0 = r1.zzf
            if (r0 == 0) goto L29
            android.widget.FrameLayout r0 = r2.zzh()
            if (r0 != 0) goto Ld
            goto L29
        Ld:
            com.google.android.gms.internal.ads.zzdku r0 = r1.zzd
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L29
            android.widget.FrameLayout r2 = r2.zzh()     // Catch: com.google.android.gms.internal.ads.zzcga -> L23
            com.google.android.gms.internal.ads.zzdmb r0 = r1.zzf     // Catch: com.google.android.gms.internal.ads.zzcga -> L23
            android.view.View r0 = r0.zza()     // Catch: com.google.android.gms.internal.ads.zzcga -> L23
            r2.addView(r0)     // Catch: com.google.android.gms.internal.ads.zzcga -> L23
            return
        L23:
            r2 = move-exception
            java.lang.String r0 = "web view can not be obtained"
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r2)
        L29:
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzdml r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L49
        L3:
            android.view.View r0 = r3.zzf()
            android.content.Context r0 = r0.getContext()
            com.google.android.gms.internal.ads.zzdku r1 = r2.zzd
            com.google.android.gms.internal.ads.zzfgh r1 = r1.zza
            boolean r1 = com.google.android.gms.ads.internal.util.zzbv.zzh(r0, r1)
            if (r1 == 0) goto L49
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L1f
            java.lang.String r3 = "Activity context is needed for policy validator."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)
            return
        L1f:
            com.google.android.gms.internal.ads.zzdmj r1 = r2.zzg
            if (r1 == 0) goto L49
            android.widget.FrameLayout r1 = r3.zzh()
            if (r1 == 0) goto L49
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: com.google.android.gms.internal.ads.zzcga -> L43
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch: com.google.android.gms.internal.ads.zzcga -> L43
            android.widget.FrameLayout r3 = r3.zzh()     // Catch: com.google.android.gms.internal.ads.zzcga -> L43
            com.google.android.gms.internal.ads.zzdmj r1 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzcga -> L43
            android.view.View r3 = r1.zza(r3, r0)     // Catch: com.google.android.gms.internal.ads.zzcga -> L43
            android.view.WindowManager$LayoutParams r1 = com.google.android.gms.ads.internal.util.zzbv.zzb()     // Catch: com.google.android.gms.internal.ads.zzcga -> L43
            r0.addView(r3, r1)     // Catch: com.google.android.gms.internal.ads.zzcga -> L43
            return
        L43:
            r3 = move-exception
            java.lang.String r0 = "web view can not be obtained"
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r3)
        L49:
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzdml r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdln r0 = new com.google.android.gms.internal.ads.zzdln
            r0.<init>(r1, r2)
            java.util.concurrent.Executor r2 = r1.zzh
            r2.execute(r0)
            return
    }

    public final boolean zzf(android.view.ViewGroup r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.zzi(r2, r0)
            return r2
    }

    public final boolean zzg(android.view.ViewGroup r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.zzi(r2, r0)
            return r2
    }
}
