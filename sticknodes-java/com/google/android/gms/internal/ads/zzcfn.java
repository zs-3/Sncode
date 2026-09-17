package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcfn extends android.webkit.WebChromeClient {
    private final com.google.android.gms.internal.ads.zzcfo zza;

    public zzcfn(com.google.android.gms.internal.ads.zzcfo r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private static final android.content.Context zzb(android.webkit.WebView r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzcfo
            if (r0 != 0) goto L9
            android.content.Context r1 = r1.getContext()
            return r1
        L9:
            com.google.android.gms.internal.ads.zzcfo r1 = (com.google.android.gms.internal.ads.zzcfo) r1
            android.app.Activity r0 = r1.zzi()
            if (r0 == 0) goto L12
            return r0
        L12:
            android.content.Context r1 = r1.getContext()
            return r1
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(android.webkit.WebView r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzcfo
            if (r0 != 0) goto La
            java.lang.String r2 = "Tried to close a WebView that wasn't an AdWebView."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return
        La:
            com.google.android.gms.internal.ads.zzcfo r2 = (com.google.android.gms.internal.ads.zzcfo) r2
            com.google.android.gms.ads.internal.overlay.zzm r2 = r2.zzL()
            if (r2 != 0) goto L18
            java.lang.String r2 = "Tried to close an AdWebView not associated with an overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return
        L18:
            r2.zzb()
            return
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage r6) {
            r5 = this;
            java.lang.String r0 = r6.message()
            java.lang.String r1 = r6.sourceId()
            int r2 = r6.lineNumber()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JS: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " ("
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ":"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "Application Cache"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L3f
            boolean r6 = super.onConsoleMessage(r6)
            return r6
        L3f:
            int[] r1 = com.google.android.gms.internal.ads.zzcfm.zza
            android.webkit.ConsoleMessage$MessageLevel r2 = r6.messageLevel()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L6a
            r2 = 2
            if (r1 == r2) goto L66
            r2 = 3
            if (r1 == r2) goto L62
            r2 = 4
            if (r1 == r2) goto L62
            r2 = 5
            if (r1 == r2) goto L5e
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)
            goto L6d
        L5e:
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            goto L6d
        L62:
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)
            goto L6d
        L66:
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            goto L6d
        L6a:
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
        L6d:
            boolean r6 = super.onConsoleMessage(r6)
            return r6
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView r1, boolean r2, boolean r3, android.os.Message r4) {
            r0 = this;
            java.lang.Object r2 = r4.obj
            android.webkit.WebView$WebViewTransport r2 = (android.webkit.WebView.WebViewTransport) r2
            android.webkit.WebView r3 = new android.webkit.WebView
            android.content.Context r1 = r1.getContext()
            r3.<init>(r1)
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zza
            android.webkit.WebViewClient r1 = r1.zzH()
            if (r1 == 0) goto L1e
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zza
            android.webkit.WebViewClient r1 = r1.zzH()
            r3.setWebViewClient(r1)
        L1e:
            r2.setWebView(r3)
            r4.sendToTarget()
            r1 = 1
            return r1
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(java.lang.String r4, java.lang.String r5, long r6, long r8, long r10, android.webkit.WebStorage.QuotaUpdater r12) {
            r3 = this;
            r4 = 5242880(0x500000, double:2.590327E-317)
            long r4 = r4 - r10
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto Le
            r12.updateQuota(r6)
            return
        Le:
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L20
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L1e
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 > 0) goto L1e
            goto L3c
        L1e:
            r8 = r10
            goto L3c
        L20:
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L31
            r8 = 131072(0x20000, double:6.47582E-319)
            long r4 = java.lang.Math.min(r8, r4)
            long r6 = r6 + r4
            long r8 = java.lang.Math.min(r6, r0)
            goto L3c
        L31:
            long r0 = r0 - r6
            long r4 = java.lang.Math.min(r0, r4)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 > 0) goto L3b
            long r6 = r6 + r8
        L3b:
            r8 = r6
        L3c:
            r12.updateQuota(r8)
            return
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
            r3 = this;
            if (r5 == 0) goto L2c
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zza
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzA(r0, r1)
            r1 = 1
            if (r0 != 0) goto L28
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zza
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzA(r0, r2)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            r5.invoke(r4, r0, r1)
        L2c:
            return
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.ads.internal.overlay.zzm r0 = r0.zzL()
            if (r0 != 0) goto Le
            java.lang.String r0 = "Could not get ad overlay when hiding custom view."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        Le:
            r0.zzg()
            return
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView r10, java.lang.String r11, java.lang.String r12, android.webkit.JsResult r13) {
            r9 = this;
            android.content.Context r1 = zzb(r10)
            java.lang.String r2 = "alert"
            r5 = 0
            r7 = 0
            r8 = 0
            r0 = r9
            r3 = r11
            r4 = r12
            r6 = r13
            boolean r10 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(android.webkit.WebView r10, java.lang.String r11, java.lang.String r12, android.webkit.JsResult r13) {
            r9 = this;
            android.content.Context r1 = zzb(r10)
            java.lang.String r2 = "onBeforeUnload"
            r5 = 0
            r7 = 0
            r8 = 0
            r0 = r9
            r3 = r11
            r4 = r12
            r6 = r13
            boolean r10 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView r10, java.lang.String r11, java.lang.String r12, android.webkit.JsResult r13) {
            r9 = this;
            android.content.Context r1 = zzb(r10)
            java.lang.String r2 = "confirm"
            r5 = 0
            r7 = 0
            r8 = 0
            r0 = r9
            r3 = r11
            r4 = r12
            r6 = r13
            boolean r10 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(android.webkit.WebView r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, android.webkit.JsPromptResult r14) {
            r9 = this;
            android.content.Context r1 = zzb(r10)
            java.lang.String r2 = "prompt"
            r6 = 0
            r8 = 1
            r0 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            boolean r10 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.webkit.WebChromeClient
    @java.lang.Deprecated
    public final void onShowCustomView(android.view.View r2, int r3, android.webkit.WebChromeClient.CustomViewCallback r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.ads.internal.overlay.zzm r0 = r0.zzL()
            if (r0 != 0) goto L11
            java.lang.String r2 = "Could not get ad overlay when showing custom view."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            r4.onCustomViewHidden()
            return
        L11:
            r0.zzC(r2, r4)
            r0.zzA(r3)
            return
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(android.view.View r2, android.webkit.WebChromeClient.CustomViewCallback r3) {
            r1 = this;
            r0 = -1
            r1.onShowCustomView(r2, r0, r3)
            return
    }

    protected final boolean zza(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, android.webkit.JsResult r9, android.webkit.JsPromptResult r10, boolean r11) {
            r3 = this;
            r0 = 1
            com.google.android.gms.internal.ads.zzcfo r1 = r3.zza     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            if (r1 == 0) goto L4c
            com.google.android.gms.internal.ads.zzchg r1 = r1.zzN()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            if (r1 == 0) goto L4c
            com.google.android.gms.internal.ads.zzcfo r1 = r3.zza     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.internal.ads.zzchg r1 = r1.zzN()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.ads.internal.zzb r1 = r1.zzd()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            if (r1 == 0) goto L4c
            com.google.android.gms.internal.ads.zzcfo r1 = r3.zza     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.internal.ads.zzchg r1 = r1.zzN()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.ads.internal.zzb r1 = r1.zzd()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            if (r1 == 0) goto L4c
            boolean r2 = r1.zzc()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            if (r2 != 0) goto L4c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r4.<init>()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            java.lang.String r6 = "window."
            r4.append(r6)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r4.append(r5)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            java.lang.String r5 = "('"
            r4.append(r5)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r4.append(r7)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            java.lang.String r5 = "')"
            r4.append(r5)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            java.lang.String r4 = r4.toString()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r1.zzb(r4)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r4 = 0
            return r4
        L4c:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog$Builder r5 = com.google.android.gms.ads.internal.util.zzt.zzK(r4)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r5.setTitle(r6)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r6 = 17039360(0x1040000, float:2.424457E-38)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            if (r11 == 0) goto La2
            android.widget.LinearLayout r9 = new android.widget.LinearLayout     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r9.<init>(r4)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r9.setOrientation(r0)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.widget.TextView r11 = new android.widget.TextView     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r11.<init>(r4)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r11.setText(r7)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.widget.EditText r7 = new android.widget.EditText     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r7.<init>(r4)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r7.setText(r8)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r9.addView(r11)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r9.addView(r7)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog$Builder r4 = r5.setView(r9)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.internal.ads.zzcfl r5 = new com.google.android.gms.internal.ads.zzcfl     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r5.<init>(r10, r7)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r1, r5)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.internal.ads.zzcfk r5 = new com.google.android.gms.internal.ads.zzcfk     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r5.<init>(r10)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r6, r5)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.internal.ads.zzcfj r5 = new com.google.android.gms.internal.ads.zzcfj     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r5.<init>(r10)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog$Builder r4 = r4.setOnCancelListener(r5)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog r4 = r4.create()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r4.show()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            goto Lcf
        La2:
            android.app.AlertDialog$Builder r4 = r5.setMessage(r7)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.internal.ads.zzcfi r5 = new com.google.android.gms.internal.ads.zzcfi     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r5.<init>(r9)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r1, r5)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.internal.ads.zzcfh r5 = new com.google.android.gms.internal.ads.zzcfh     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r5.<init>(r9)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r6, r5)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            com.google.android.gms.internal.ads.zzcfg r5 = new com.google.android.gms.internal.ads.zzcfg     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r5.<init>(r9)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog$Builder r4 = r4.setOnCancelListener(r5)     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            android.app.AlertDialog r4 = r4.create()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            r4.show()     // Catch: android.view.WindowManager.BadTokenException -> Lc9
            goto Lcf
        Lc9:
            r4 = move-exception
            java.lang.String r5 = "Fail to display Dialog."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r5, r4)
        Lcf:
            return r0
    }
}
