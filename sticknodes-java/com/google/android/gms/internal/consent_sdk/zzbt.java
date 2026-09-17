package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzbt extends android.webkit.WebViewClient {
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzbu zza;

    /* synthetic */ zzbt(com.google.android.gms.internal.consent_sdk.zzbu r1, com.google.android.gms.internal.consent_sdk.zzbs r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView r1, java.lang.String r2) {
            r0 = this;
            com.google.android.gms.internal.consent_sdk.zzbu r1 = r0.zza
            boolean r1 = com.google.android.gms.internal.consent_sdk.zzbu.zzf(r1, r2)
            if (r1 == 0) goto L11
            com.google.android.gms.internal.consent_sdk.zzbu r1 = r0.zza
            com.google.android.gms.internal.consent_sdk.zzca r1 = com.google.android.gms.internal.consent_sdk.zzbu.zza(r1)
            r1.zze(r2)
        L11:
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
            r0 = this;
            com.google.android.gms.internal.consent_sdk.zzbu r1 = r0.zza
            boolean r1 = com.google.android.gms.internal.consent_sdk.zzbu.zze(r1)
            if (r1 != 0) goto L15
            java.lang.String r1 = "UserMessagingPlatform"
            java.lang.String r2 = "Wall html loaded."
            android.util.Log.d(r1, r2)
            com.google.android.gms.internal.consent_sdk.zzbu r1 = r0.zza
            r2 = 1
            com.google.android.gms.internal.consent_sdk.zzbu.zzb(r1, r2)
        L15:
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            com.google.android.gms.internal.consent_sdk.zzbu r1 = r0.zza
            com.google.android.gms.internal.consent_sdk.zzca r1 = com.google.android.gms.internal.consent_sdk.zzbu.zza(r1)
            r1.zzf(r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    @android.annotation.TargetApi(24)
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r1, android.webkit.WebResourceRequest r2) {
            r0 = this;
            android.net.Uri r1 = r2.getUrl()
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.consent_sdk.zzbu r2 = r0.zza
            boolean r2 = com.google.android.gms.internal.consent_sdk.zzbu.zzf(r2, r1)
            if (r2 == 0) goto L1b
            com.google.android.gms.internal.consent_sdk.zzbu r2 = r0.zza
            com.google.android.gms.internal.consent_sdk.zzca r2 = com.google.android.gms.internal.consent_sdk.zzbu.zza(r2)
            r2.zze(r1)
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r1, java.lang.String r2) {
            r0 = this;
            com.google.android.gms.internal.consent_sdk.zzbu r1 = r0.zza
            boolean r1 = com.google.android.gms.internal.consent_sdk.zzbu.zzf(r1, r2)
            if (r1 == 0) goto L13
            com.google.android.gms.internal.consent_sdk.zzbu r1 = r0.zza
            com.google.android.gms.internal.consent_sdk.zzca r1 = com.google.android.gms.internal.consent_sdk.zzbu.zza(r1)
            r1.zze(r2)
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }
}
