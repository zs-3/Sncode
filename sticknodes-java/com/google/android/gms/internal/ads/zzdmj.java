package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdmj {
    private final com.google.android.gms.internal.ads.zzdre zza;
    private final com.google.android.gms.internal.ads.zzdpt zzb;
    private android.view.ViewTreeObserver.OnScrollChangedListener zzc;

    public zzdmj(com.google.android.gms.internal.ads.zzdre r1, com.google.android.gms.internal.ads.zzdpt r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r1 = 0
            r0.zzc = r1
            return
    }

    private static final int zzf(android.content.Context r0, java.lang.String r1, int r2) {
            int r2 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L4
        L4:
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r0 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r0, r2)
            return r0
    }

    public final android.view.View zza(android.view.View r10, android.view.WindowManager r11) throws com.google.android.gms.internal.ads.zzcga {
            r9 = this;
            com.google.android.gms.internal.ads.zzdre r0 = r9.zza
            com.google.android.gms.ads.internal.client.zzs r1 = com.google.android.gms.ads.internal.client.zzs.zzc()
            r2 = 0
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zza(r1, r2, r2)
            android.view.View r1 = r0.zzF()
            r2 = 4
            r1.setVisibility(r2)
            android.view.View r1 = r0.zzF()
            java.lang.String r2 = "policy_validator"
            r1.setContentDescription(r2)
            com.google.android.gms.internal.ads.zzdmd r1 = new com.google.android.gms.internal.ads.zzdmd
            r1.<init>(r9)
            java.lang.String r2 = "/sendMessageToSdk"
            r0.zzag(r2, r1)
            com.google.android.gms.internal.ads.zzdme r1 = new com.google.android.gms.internal.ads.zzdme
            r1.<init>(r9, r11, r10)
            java.lang.String r2 = "/hideValidatorOverlay"
            r0.zzag(r2, r1)
            com.google.android.gms.internal.ads.zzbki r1 = new com.google.android.gms.internal.ads.zzbki
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r2 = "/open"
            r0.zzag(r2, r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzdmf r2 = new com.google.android.gms.internal.ads.zzdmf
            r2.<init>(r9, r10, r11)
            com.google.android.gms.internal.ads.zzdpt r10 = r9.zzb
            java.lang.String r11 = "/loadNativeAdPolicyViolations"
            r10.zzm(r1, r11, r2)
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            r10.<init>(r0)
            com.google.android.gms.internal.ads.zzdmg r11 = new com.google.android.gms.internal.ads.zzdmg
            r11.<init>()
            com.google.android.gms.internal.ads.zzdpt r1 = r9.zzb
            java.lang.String r2 = "/showValidatorOverlay"
            r1.zzm(r10, r2, r11)
            android.view.View r10 = r0.zzF()
            return r10
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcfo r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdpt r2 = r1.zzb
            java.lang.String r0 = "sendMessageToNativeJs"
            r2.zzj(r0, r3)
            return
    }

    final /* synthetic */ void zzc(android.view.WindowManager r2, android.view.View r3, com.google.android.gms.internal.ads.zzcfo r4, java.util.Map r5) {
            r1 = this;
            java.lang.String r5 = "Hide native ad policy validator overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r5)
            android.view.View r5 = r4.zzF()
            r0 = 8
            r5.setVisibility(r0)
            android.view.View r5 = r4.zzF()
            android.os.IBinder r5 = r5.getWindowToken()
            if (r5 == 0) goto L1f
            android.view.View r5 = r4.zzF()
            r2.removeView(r5)
        L1f:
            r4.destroy()
            android.view.ViewTreeObserver r2 = r3.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r3 = r1.zzc
            if (r3 == 0) goto L37
            if (r2 == 0) goto L37
            boolean r3 = r2.isAlive()
            if (r3 == 0) goto L37
            android.view.ViewTreeObserver$OnScrollChangedListener r3 = r1.zzc
            r2.removeOnScrollChangedListener(r3)
        L37:
            return
    }

    final /* synthetic */ void zzd(java.util.Map r1, boolean r2, int r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "messageType"
            java.lang.String r4 = "validatorHtmlLoaded"
            r2.put(r3, r4)
            java.lang.String r3 = "id"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r2.put(r3, r1)
            com.google.android.gms.internal.ads.zzdpt r1 = r0.zzb
            java.lang.String r3 = "sendMessageToNativeJs"
            r1.zzj(r3, r2)
            return
    }

    final /* synthetic */ void zze(android.view.View r12, android.view.WindowManager r13, com.google.android.gms.internal.ads.zzcfo r14, java.util.Map r15) {
            r11 = this;
            com.google.android.gms.internal.ads.zzchg r0 = r14.zzN()
            com.google.android.gms.internal.ads.zzdmi r1 = new com.google.android.gms.internal.ads.zzdmi
            r1.<init>(r11, r15)
            r0.zzB(r1)
            if (r15 != 0) goto L10
            goto L10d
        L10:
            android.content.Context r0 = r12.getContext()
            java.lang.String r1 = "validator_width"
            java.lang.Object r1 = r15.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhI
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r1 = zzf(r0, r1, r2)
            java.lang.String r2 = "validator_height"
            java.lang.Object r2 = r15.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhJ
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r2 = zzf(r0, r2, r3)
            java.lang.String r3 = "validator_x"
            java.lang.Object r3 = r15.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            int r3 = zzf(r0, r3, r4)
            java.lang.String r5 = "validator_y"
            java.lang.Object r5 = r15.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r0 = zzf(r0, r5, r4)
            com.google.android.gms.internal.ads.zzchi r1 = com.google.android.gms.internal.ads.zzchi.zzb(r1, r2)
            r14.zzaj(r1)
            android.webkit.WebView r1 = r14.zzG()     // Catch: java.lang.NullPointerException -> La3
            android.webkit.WebSettings r1 = r1.getSettings()     // Catch: java.lang.NullPointerException -> La3
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhK     // Catch: java.lang.NullPointerException -> La3
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.NullPointerException -> La3
            java.lang.Object r2 = r4.zza(r2)     // Catch: java.lang.NullPointerException -> La3
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.NullPointerException -> La3
            boolean r2 = r2.booleanValue()     // Catch: java.lang.NullPointerException -> La3
            r1.setUseWideViewPort(r2)     // Catch: java.lang.NullPointerException -> La3
            android.webkit.WebView r1 = r14.zzG()     // Catch: java.lang.NullPointerException -> La3
            android.webkit.WebSettings r1 = r1.getSettings()     // Catch: java.lang.NullPointerException -> La3
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhL     // Catch: java.lang.NullPointerException -> La3
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.NullPointerException -> La3
            java.lang.Object r2 = r4.zza(r2)     // Catch: java.lang.NullPointerException -> La3
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.NullPointerException -> La3
            boolean r2 = r2.booleanValue()     // Catch: java.lang.NullPointerException -> La3
            r1.setLoadWithOverviewMode(r2)     // Catch: java.lang.NullPointerException -> La3
            goto La4
        La3:
        La4:
            android.view.WindowManager$LayoutParams r8 = com.google.android.gms.ads.internal.util.zzbv.zzb()
            r8.x = r3
            r8.y = r0
            android.view.View r1 = r14.zzF()
            r13.updateViewLayout(r1, r8)
            java.lang.String r1 = "orientation"
            java.lang.Object r1 = r15.get(r1)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r2 = r12.getGlobalVisibleRect(r1)
            if (r2 != 0) goto Lc8
            goto Lfc
        Lc8:
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto Ldc
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto Ld9
            goto Ldc
        Ld9:
            int r1 = r1.top
            goto Lde
        Ldc:
            int r1 = r1.bottom
        Lde:
            int r1 = r1 - r0
            r9 = r1
            com.google.android.gms.internal.ads.zzdmh r0 = new com.google.android.gms.internal.ads.zzdmh
            r4 = r0
            r5 = r12
            r6 = r14
            r10 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.zzc = r0
            android.view.ViewTreeObserver r12 = r12.getViewTreeObserver()
            if (r12 == 0) goto Lfc
            boolean r13 = r12.isAlive()
            if (r13 == 0) goto Lfc
            android.view.ViewTreeObserver$OnScrollChangedListener r13 = r11.zzc
            r12.addOnScrollChangedListener(r13)
        Lfc:
            java.lang.String r12 = "overlay_url"
            java.lang.Object r12 = r15.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L10d
            UX.aTqO5.a()
        L10d:
            return
    }
}
