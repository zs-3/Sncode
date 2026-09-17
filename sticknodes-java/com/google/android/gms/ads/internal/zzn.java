package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzn extends android.webkit.WebViewClient {
    final /* synthetic */ com.google.android.gms.ads.internal.zzt zza;

    zzn(com.google.android.gms.ads.internal.zzt r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceError r4) {
            r1 = this;
            com.google.android.gms.ads.internal.zzt r2 = r1.zza
            com.google.android.gms.ads.internal.client.zzbl r3 = com.google.android.gms.ads.internal.zzt.zzh(r2)
            java.lang.String r4 = "#007 Could not call remote method."
            if (r3 == 0) goto L1c
            com.google.android.gms.ads.internal.client.zzbl r2 = com.google.android.gms.ads.internal.zzt.zzh(r2)     // Catch: android.os.RemoteException -> L18
            r3 = 1
            r0 = 0
            com.google.android.gms.ads.internal.client.zze r3 = com.google.android.gms.internal.ads.zzfie.zzd(r3, r0, r0)     // Catch: android.os.RemoteException -> L18
            r2.zzf(r3)     // Catch: android.os.RemoteException -> L18
            goto L1c
        L18:
            r2 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r4, r2)
        L1c:
            com.google.android.gms.ads.internal.zzt r2 = r1.zza
            com.google.android.gms.ads.internal.client.zzbl r3 = com.google.android.gms.ads.internal.zzt.zzh(r2)
            if (r3 == 0) goto L31
            com.google.android.gms.ads.internal.client.zzbl r2 = com.google.android.gms.ads.internal.zzt.zzh(r2)     // Catch: android.os.RemoteException -> L2d
            r3 = 0
            r2.zze(r3)     // Catch: android.os.RemoteException -> L2d
            return
        L2d:
            r2 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r4, r2)
        L31:
            return
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            r5 = this;
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            java.lang.String r6 = r6.zzq()
            boolean r6 = r7.startsWith(r6)
            r0 = 0
            if (r6 == 0) goto Le
            return r0
        Le:
            java.lang.String r6 = "gmsg://noAdLoaded"
            boolean r6 = r7.startsWith(r6)
            r1 = 0
            java.lang.String r2 = "#007 Could not call remote method."
            r3 = 1
            if (r6 == 0) goto L4d
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            com.google.android.gms.ads.internal.client.zzbl r7 = com.google.android.gms.ads.internal.zzt.zzh(r6)
            r4 = 3
            if (r7 == 0) goto L33
            com.google.android.gms.ads.internal.client.zzbl r6 = com.google.android.gms.ads.internal.zzt.zzh(r6)     // Catch: android.os.RemoteException -> L2f
            com.google.android.gms.ads.internal.client.zze r7 = com.google.android.gms.internal.ads.zzfie.zzd(r4, r1, r1)     // Catch: android.os.RemoteException -> L2f
            r6.zzf(r7)     // Catch: android.os.RemoteException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r6)
        L33:
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            com.google.android.gms.ads.internal.client.zzbl r7 = com.google.android.gms.ads.internal.zzt.zzh(r6)
            if (r7 == 0) goto L47
            com.google.android.gms.ads.internal.client.zzbl r6 = com.google.android.gms.ads.internal.zzt.zzh(r6)     // Catch: android.os.RemoteException -> L43
            r6.zze(r4)     // Catch: android.os.RemoteException -> L43
            goto L47
        L43:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r6)
        L47:
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            r6.zzV(r0)
            return r3
        L4d:
            java.lang.String r6 = "gmsg://scriptLoadFailed"
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L87
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            com.google.android.gms.ads.internal.client.zzbl r7 = com.google.android.gms.ads.internal.zzt.zzh(r6)
            if (r7 == 0) goto L6d
            com.google.android.gms.ads.internal.client.zzbl r6 = com.google.android.gms.ads.internal.zzt.zzh(r6)     // Catch: android.os.RemoteException -> L69
            com.google.android.gms.ads.internal.client.zze r7 = com.google.android.gms.internal.ads.zzfie.zzd(r3, r1, r1)     // Catch: android.os.RemoteException -> L69
            r6.zzf(r7)     // Catch: android.os.RemoteException -> L69
            goto L6d
        L69:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r6)
        L6d:
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            com.google.android.gms.ads.internal.client.zzbl r7 = com.google.android.gms.ads.internal.zzt.zzh(r6)
            if (r7 == 0) goto L81
            com.google.android.gms.ads.internal.client.zzbl r6 = com.google.android.gms.ads.internal.zzt.zzh(r6)     // Catch: android.os.RemoteException -> L7d
            r6.zze(r0)     // Catch: android.os.RemoteException -> L7d
            goto L81
        L7d:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r6)
        L81:
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            r6.zzV(r0)
            return r3
        L87:
            java.lang.String r6 = "gmsg://adResized"
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto Laf
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            com.google.android.gms.ads.internal.client.zzbl r0 = com.google.android.gms.ads.internal.zzt.zzh(r6)
            if (r0 == 0) goto La3
            com.google.android.gms.ads.internal.client.zzbl r6 = com.google.android.gms.ads.internal.zzt.zzh(r6)     // Catch: android.os.RemoteException -> L9f
            r6.zzi()     // Catch: android.os.RemoteException -> L9f
            goto La3
        L9f:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r6)
        La3:
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            int r6 = r6.zzb(r7)
            com.google.android.gms.ads.internal.zzt r7 = r5.zza
            r7.zzV(r6)
            return r3
        Laf:
            java.lang.String r6 = "gmsg://"
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto Lb8
            return r3
        Lb8:
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            com.google.android.gms.ads.internal.client.zzbl r0 = com.google.android.gms.ads.internal.zzt.zzh(r6)
            if (r0 == 0) goto Ld5
            com.google.android.gms.ads.internal.client.zzbl r6 = com.google.android.gms.ads.internal.zzt.zzh(r6)     // Catch: android.os.RemoteException -> Ld1
            r6.zzc()     // Catch: android.os.RemoteException -> Ld1
            com.google.android.gms.ads.internal.zzt r6 = r5.zza     // Catch: android.os.RemoteException -> Ld1
            com.google.android.gms.ads.internal.client.zzbl r6 = com.google.android.gms.ads.internal.zzt.zzh(r6)     // Catch: android.os.RemoteException -> Ld1
            r6.zzh()     // Catch: android.os.RemoteException -> Ld1
            goto Ld5
        Ld1:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r6)
        Ld5:
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            java.lang.String r6 = com.google.android.gms.ads.internal.zzt.zzo(r6, r7)
            com.google.android.gms.ads.internal.zzt r7 = r5.zza
            com.google.android.gms.ads.internal.zzt.zzw(r7, r6)
            return r3
    }
}
