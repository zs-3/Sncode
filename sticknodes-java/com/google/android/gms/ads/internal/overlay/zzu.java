package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzu extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    private final android.widget.ImageButton zza;
    private final com.google.android.gms.ads.internal.overlay.zzag zzb;

    public zzu(android.content.Context r5, com.google.android.gms.ads.internal.overlay.zzt r6, com.google.android.gms.ads.internal.overlay.zzag r7) {
            r4 = this;
            r4.<init>(r5)
            r4.zzb = r7
            r4.setOnClickListener(r4)
            android.widget.ImageButton r7 = new android.widget.ImageButton
            r7.<init>(r5)
            r4.zza = r7
            r4.zzc()
            r0 = 0
            r7.setBackgroundColor(r0)
            r7.setOnClickListener(r4)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r1 = r6.zza
            int r1 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r5, r1)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r0 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r5, r0)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r2 = r6.zzb
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r5, r2)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r3 = r6.zzc
            int r3 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r5, r3)
            r7.setPadding(r1, r0, r2, r3)
            java.lang.String r0 = "Interstitial close button"
            r7.setContentDescription(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r1 = r6.zzd
            int r2 = r6.zza
            int r1 = r1 + r2
            int r2 = r6.zzb
            int r1 = r1 + r2
            int r1 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r5, r1)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r2 = r6.zzd
            int r6 = r6.zzc
            int r2 = r2 + r6
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r5, r2)
            r6 = 17
            r0.<init>(r1, r5, r6)
            r4.addView(r7, r0)
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzbg
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L7f
            return
        L7f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbh
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L97
            com.google.android.gms.ads.internal.overlay.zzs r0 = new com.google.android.gms.ads.internal.overlay.zzs
            r0.<init>(r4)
            goto L98
        L97:
            r0 = 0
        L98:
            r1 = 0
            r7.setAlpha(r1)
            android.view.ViewPropertyAnimator r7 = r7.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r7 = r7.alpha(r1)
            android.view.ViewPropertyAnimator r5 = r7.setDuration(r5)
            r5.setListener(r0)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.ImageButton zza(com.google.android.gms.ads.internal.overlay.zzu r0) {
            android.widget.ImageButton r0 = r0.zza
            return r0
    }

    private final void zzc() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbf
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            r2 = 17301527(0x1080017, float:2.497932E-38)
            if (r1 == 0) goto L6d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L6d
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L24
            goto L6d
        L24:
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.res.Resources r1 = r1.zze()
            if (r1 == 0) goto L67
            r3 = 0
            java.lang.String r4 = "white"
            boolean r4 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L4d
            if (r4 == 0) goto L3e
            int r0 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross     // Catch: android.content.res.Resources.NotFoundException -> L4d
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L4d
            goto L52
        L3e:
            java.lang.String r4 = "black"
            boolean r0 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L4d
            if (r0 == 0) goto L52
            int r0 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross     // Catch: android.content.res.Resources.NotFoundException -> L4d
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L4d
            goto L52
        L4d:
            java.lang.String r0 = "Close button resource not found, falling back to default."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
        L52:
            if (r3 != 0) goto L5a
            android.widget.ImageButton r0 = r5.zza
            r0.setImageResource(r2)
            return
        L5a:
            android.widget.ImageButton r0 = r5.zza
            r0.setImageDrawable(r3)
            android.widget.ImageButton r0 = r5.zza
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
            return
        L67:
            android.widget.ImageButton r0 = r5.zza
            r0.setImageResource(r2)
            return
        L6d:
            android.widget.ImageButton r0 = r5.zza
            r0.setImageResource(r2)
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            com.google.android.gms.ads.internal.overlay.zzag r1 = r0.zzb
            if (r1 == 0) goto L7
            r1.zzj()
        L7:
            return
    }

    public final void zzb(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L2e
            android.widget.ImageButton r5 = r4.zza
            r0 = 8
            r5.setVisibility(r0)
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzbg
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r0.zza(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L2d
            android.widget.ImageButton r5 = r4.zza
            android.view.ViewPropertyAnimator r5 = r5.animate()
            r5.cancel()
            android.widget.ImageButton r5 = r4.zza
            r5.clearAnimation()
        L2d:
            return
        L2e:
            android.widget.ImageButton r5 = r4.zza
            r0 = 0
            r5.setVisibility(r0)
            return
    }
}
