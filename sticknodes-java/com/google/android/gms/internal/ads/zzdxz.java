package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdxz {
    zzdxz() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void zza(android.content.Context r1, android.view.ViewGroup r2, com.google.android.gms.ads.AdView r3) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r1)
            java.lang.String r1 = "layout"
            r0.setTag(r1)
            r1 = -1
            zzf(r0, r1, r1)
            r1 = 17
            r0.setGravity(r1)
            r0.addView(r3)
            java.lang.String r1 = "ad_view"
            r3.setTag(r1)
            r2.addView(r0)
            return
    }

    public static final void zzb(android.content.Context r4, android.view.ViewGroup r5, com.google.android.gms.ads.nativead.NativeAd r6) {
            com.google.android.gms.ads.nativead.NativeAdView r0 = new com.google.android.gms.ads.nativead.NativeAdView
            r0.<init>(r4)
            java.lang.String r1 = "ad_view_tag"
            r0.setTag(r1)
            r1 = -1
            zzf(r0, r1, r1)
            r5.addView(r0)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r4)
            java.lang.String r2 = "layout_tag"
            r5.setTag(r2)
            r2 = 1
            r5.setOrientation(r2)
            zzf(r5, r1, r1)
            r5.setBackgroundColor(r1)
            r0.addView(r5)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.res.Resources r1 = r1.zze()
            if (r1 != 0) goto L35
            java.lang.String r2 = "Headline"
            goto L3b
        L35:
            int r2 = com.google.android.gms.ads.impl.R.string.native_headline
            java.lang.String r2 = r1.getString(r2)
        L3b:
            java.lang.String r3 = "headline_header_tag"
            android.widget.TextView r2 = zzc(r4, r2, r3)
            r5.addView(r2)
            java.lang.String r2 = r6.getHeadline()
            java.lang.String r2 = com.google.android.gms.internal.ads.zzfyo.zzc(r2)
            java.lang.String r3 = "headline_tag"
            android.widget.TextView r2 = zzd(r4, r2, r3)
            r0.setHeadlineView(r2)
            r5.addView(r2)
            if (r1 != 0) goto L5d
            java.lang.String r2 = "Body"
            goto L63
        L5d:
            int r2 = com.google.android.gms.ads.impl.R.string.native_body
            java.lang.String r2 = r1.getString(r2)
        L63:
            java.lang.String r3 = "body_header_tag"
            android.widget.TextView r2 = zzc(r4, r2, r3)
            r5.addView(r2)
            java.lang.String r2 = r6.getBody()
            java.lang.String r2 = com.google.android.gms.internal.ads.zzfyo.zzc(r2)
            java.lang.String r3 = "body_tag"
            android.widget.TextView r2 = zzd(r4, r2, r3)
            r0.setBodyView(r2)
            r5.addView(r2)
            if (r1 != 0) goto L85
            java.lang.String r1 = "Media View"
            goto L8b
        L85:
            int r2 = com.google.android.gms.ads.impl.R.string.native_media_view
            java.lang.String r1 = r1.getString(r2)
        L8b:
            java.lang.String r2 = "media_view_header_tag"
            android.widget.TextView r1 = zzc(r4, r1, r2)
            r5.addView(r1)
            com.google.android.gms.ads.nativead.MediaView r1 = new com.google.android.gms.ads.nativead.MediaView
            r1.<init>(r4)
            java.lang.String r4 = "media_view_tag"
            r1.setTag(r4)
            r0.setMediaView(r1)
            r5.addView(r1)
            r0.setNativeAd(r6)
            return
    }

    private static android.widget.TextView zzc(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
            r2 = 16973894(0x1030046, float:2.4061096E-38)
            r3 = -9210245(0xffffffffff73767b, float:-3.2361759E38)
            r4 = 0
            r0 = r6
            r1 = r7
            r5 = r8
            android.widget.TextView r6 = zze(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static android.widget.TextView zzd(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
            r2 = 16973892(0x1030044, float:2.406109E-38)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = 1094713344(0x41400000, float:12.0)
            r0 = r6
            r1 = r7
            r5 = r8
            android.widget.TextView r6 = zze(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static android.widget.TextView zze(android.content.Context r3, java.lang.String r4, int r5, int r6, float r7, java.lang.String r8) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r0.setTag(r8)
            r8 = -2
            zzf(r0, r8, r8)
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            if (r8 != 0) goto L17
            android.widget.TableRow$LayoutParams r8 = new android.widget.TableRow$LayoutParams
            r8.<init>()
        L17:
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r1.<init>(r8)
            r8 = 1
            android.content.res.Resources r2 = r0.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            int r7 = (int) r7
            r1.bottomMargin = r7
            r0.setLayoutParams(r1)
            r0.setTextAppearance(r3, r5)
            r0.setTextColor(r6)
            r0.setText(r4)
            return r0
    }

    private static void zzf(android.view.View r2, int r3, int r4) {
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 != 0) goto Lb
            android.widget.TableRow$LayoutParams r0 = new android.widget.TableRow$LayoutParams
            r0.<init>()
        Lb:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0)
            r1.height = r3
            r1.width = r4
            r2.setLayoutParams(r1)
            return
    }
}
