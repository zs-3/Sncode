package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzca implements com.google.android.gms.internal.consent_sdk.zzd {
    private final android.app.Application zza;
    private final com.google.android.gms.internal.consent_sdk.zzbw zzb;
    private final android.os.Handler zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.internal.consent_sdk.zze zze;
    private final com.google.android.gms.internal.consent_sdk.zzan zzf;
    private final com.google.android.gms.internal.consent_sdk.zzbb zzg;
    private final com.google.android.gms.internal.consent_sdk.zzap zzh;

    zzca(android.app.Application r1, com.google.android.gms.internal.consent_sdk.zzbw r2, android.os.Handler r3, java.util.concurrent.Executor r4, com.google.android.gms.internal.consent_sdk.zze r5, com.google.android.gms.internal.consent_sdk.zzan r6, com.google.android.gms.internal.consent_sdk.zzbb r7, com.google.android.gms.internal.consent_sdk.zzap r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            return
    }

    private final void zzg(org.json.JSONObject r5) {
            r4 = this;
            java.lang.String r0 = "url"
            java.lang.String r5 = r5.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = "UserMessagingPlatform"
            if (r0 == 0) goto L13
            java.lang.String r0 = "Action[browser]: empty url."
            android.util.Log.d(r1, r0)
        L13:
            android.net.Uri r0 = android.net.Uri.parse(r5)
            java.lang.String r2 = r0.getScheme()
            if (r2 != 0) goto L2a
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "Action[browser]: empty scheme: "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.d(r1, r2)
        L2a:
            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L37
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3, r0)     // Catch: android.content.ActivityNotFoundException -> L37
            com.google.android.gms.internal.consent_sdk.zzbw r0 = r4.zzb     // Catch: android.content.ActivityNotFoundException -> L37
            r0.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L37
            return
        L37:
            r0 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Action[browser]: can not open url: "
            java.lang.String r5 = r2.concat(r5)
            android.util.Log.d(r1, r5, r0)
            return
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final java.util.concurrent.Executor zza() {
            r2 = this;
            android.os.Handler r0 = r2.zzc
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.consent_sdk.zzby r1 = new com.google.android.gms.internal.consent_sdk.zzby
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(java.lang.String r7, org.json.JSONObject r8) {
            r6 = this;
            int r0 = r7.hashCode()
            r1 = -1
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case -1370505102: goto L2b;
                case -278739366: goto L21;
                case 150940456: goto L17;
                case 1671672458: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r0 = "dismiss"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L35
            r7 = 1
            goto L36
        L17:
            java.lang.String r0 = "browser"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L35
            r7 = 2
            goto L36
        L21:
            java.lang.String r0 = "configure_app_assets"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L35
            r7 = 3
            goto L36
        L2b:
            java.lang.String r0 = "load_complete"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L35
            r7 = 0
            goto L36
        L35:
            r7 = -1
        L36:
            if (r7 == 0) goto La4
            if (r7 == r5) goto L47
            if (r7 == r3) goto L43
            if (r7 == r4) goto L3f
            return r2
        L3f:
            r6.zzc()
            return r5
        L43:
            r6.zzg(r8)
            return r5
        L47:
            java.lang.String r7 = "status"
            java.lang.String r7 = r8.optString(r7)
            int r8 = r7.hashCode()
            r0 = 4
            switch(r8) {
                case -954325659: goto L7e;
                case -258041904: goto L74;
                case 429411856: goto L6a;
                case 467888915: goto L60;
                case 1666911234: goto L56;
                default: goto L55;
            }
        L55:
            goto L87
        L56:
            java.lang.String r8 = "non_personalized"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = 2
            goto L87
        L60:
            java.lang.String r8 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = 1
            goto L87
        L6a:
            java.lang.String r8 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = 4
            goto L87
        L74:
            java.lang.String r8 = "personalized"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = 0
            goto L87
        L7e:
            java.lang.String r8 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = 3
        L87:
            if (r1 == 0) goto L9e
            if (r1 == r5) goto L9e
            if (r1 == r3) goto L9e
            if (r1 == r4) goto L9e
            if (r1 == r0) goto L9e
            com.google.android.gms.internal.consent_sdk.zzbb r7 = r6.zzg
            com.google.android.gms.internal.consent_sdk.zzg r8 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = "We are getting something wrong with the webview."
            r8.<init>(r5, r0)
            r7.zzh(r8)
            goto La3
        L9e:
            com.google.android.gms.internal.consent_sdk.zzbb r7 = r6.zzg
            r7.zzg(r4)
        La3:
            return r5
        La4:
            com.google.android.gms.internal.consent_sdk.zzbb r7 = r6.zzg
            r7.zzi()
            return r5
    }

    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.consent_sdk.zzbz r0 = new com.google.android.gms.internal.consent_sdk.zzbz
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.zzd
            r1.execute(r0)
            return
    }

    final /* synthetic */ void zzd() {
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            android.app.Application r1 = r8.zza
            java.lang.String r2 = "app_name"
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: org.json.JSONException -> La4
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo()     // Catch: org.json.JSONException -> La4
            java.lang.CharSequence r3 = r3.getApplicationLabel(r4)     // Catch: org.json.JSONException -> La4
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> La4
            r0.put(r2, r3)     // Catch: org.json.JSONException -> La4
            java.lang.String r2 = "app_icon"
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: org.json.JSONException -> La4
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: org.json.JSONException -> La4
            android.graphics.drawable.Drawable r1 = r3.getApplicationIcon(r1)     // Catch: org.json.JSONException -> La4
            if (r1 != 0) goto L2e
            r1 = 0
            goto L6f
        L2e:
            int r3 = r1.getIntrinsicWidth()     // Catch: org.json.JSONException -> La4
            int r4 = r1.getIntrinsicHeight()     // Catch: org.json.JSONException -> La4
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: org.json.JSONException -> La4
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)     // Catch: org.json.JSONException -> La4
            android.graphics.Canvas r4 = new android.graphics.Canvas     // Catch: org.json.JSONException -> La4
            r4.<init>(r3)     // Catch: org.json.JSONException -> La4
            int r5 = r4.getWidth()     // Catch: org.json.JSONException -> La4
            int r6 = r4.getHeight()     // Catch: org.json.JSONException -> La4
            r7 = 0
            r1.setBounds(r7, r7, r5, r6)     // Catch: org.json.JSONException -> La4
            r1.draw(r4)     // Catch: org.json.JSONException -> La4
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: org.json.JSONException -> La4
            r1.<init>()     // Catch: org.json.JSONException -> La4
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: org.json.JSONException -> La4
            r5 = 100
            r3.compress(r4, r5, r1)     // Catch: org.json.JSONException -> La4
            byte[] r1 = r1.toByteArray()     // Catch: org.json.JSONException -> La4
            r3 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)     // Catch: org.json.JSONException -> La4
            java.lang.String r3 = "data:image/png;base64,"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: org.json.JSONException -> La4
            java.lang.String r1 = r3.concat(r1)     // Catch: org.json.JSONException -> La4
        L6f:
            r0.put(r2, r1)     // Catch: org.json.JSONException -> La4
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> La4
            r1.<init>()     // Catch: org.json.JSONException -> La4
            com.google.android.gms.internal.consent_sdk.zzap r2 = r8.zzh     // Catch: org.json.JSONException -> La4
            java.util.Map r2 = r2.zzc()     // Catch: org.json.JSONException -> La4
            java.util.Set r2 = r2.keySet()     // Catch: org.json.JSONException -> La4
            java.util.Iterator r2 = r2.iterator()     // Catch: org.json.JSONException -> La4
        L85:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> La4
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> La4
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> La4
            com.google.android.gms.internal.consent_sdk.zzap r4 = r8.zzh     // Catch: org.json.JSONException -> La4
            java.util.Map r4 = r4.zzc()     // Catch: org.json.JSONException -> La4
            java.lang.Object r4 = r4.get(r3)     // Catch: org.json.JSONException -> La4
            r1.put(r3, r4)     // Catch: org.json.JSONException -> La4
            goto L85
        L9f:
            java.lang.String r2 = "stored_infos_map"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> La4
        La4:
            com.google.android.gms.internal.consent_sdk.zzbb r1 = r8.zzg
            com.google.android.gms.internal.consent_sdk.zzbu r1 = r1.zzc()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "UMP_configureFormWithAppAssets"
            r1.zzd(r2, r0)
            return
    }

    final void zze(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Receive consent action: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "UserMessagingPlatform"
            android.util.Log.d(r1, r0)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r0 = "action"
            java.lang.String r0 = r5.getQueryParameter(r0)
            java.lang.String r1 = "args"
            java.lang.String r5 = r5.getQueryParameter(r1)
            r1 = 2
            com.google.android.gms.internal.consent_sdk.zzd[] r1 = new com.google.android.gms.internal.consent_sdk.zzd[r1]
            r2 = 0
            r1[r2] = r4
            com.google.android.gms.internal.consent_sdk.zzan r2 = r4.zzf
            r3 = 1
            r1[r3] = r2
            com.google.android.gms.internal.consent_sdk.zze r2 = r4.zze
            r2.zzb(r0, r5, r1)
            return
    }

    final void zzf(int r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            java.util.Locale r1 = java.util.Locale.US
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r7
            r5 = 2
            r2[r5] = r6
            java.lang.String r6 = "WebResourceError(%d, %s): %s"
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r5, r6)
            com.google.android.gms.internal.consent_sdk.zzbb r5 = r4.zzg
            r5.zzj(r0)
            return
    }
}
