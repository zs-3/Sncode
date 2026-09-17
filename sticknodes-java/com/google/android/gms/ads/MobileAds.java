package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class MobileAds {
    public static final java.lang.String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void disableMediationAdapterInitialization(android.content.Context r1) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r0.zzn(r1)
            return
    }

    public static com.google.android.gms.ads.initialization.InitializationStatus getInitializationStatus() {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            com.google.android.gms.ads.initialization.InitializationStatus r0 = r0.zze()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    private static java.lang.String getInternalVersion() {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            java.lang.String r0 = r0.zzi()
            return r0
    }

    public static com.google.android.gms.ads.RequestConfiguration getRequestConfiguration() {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            com.google.android.gms.ads.RequestConfiguration r0 = r0.zzc()
            return r0
    }

    public static com.google.android.gms.ads.VersionInfo getVersion() {
            com.google.android.gms.ads.internal.client.zzey.zzf()
            java.lang.String r0 = "23.4.0"
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r1)
            int r1 = r0.length
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L16
            com.google.android.gms.ads.VersionInfo r0 = new com.google.android.gms.ads.VersionInfo
            r0.<init>(r2, r2, r2)
            goto L36
        L16:
            com.google.android.gms.ads.VersionInfo r1 = new com.google.android.gms.ads.VersionInfo     // Catch: java.lang.NumberFormatException -> L31
            r3 = r0[r2]     // Catch: java.lang.NumberFormatException -> L31
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L31
            r4 = 1
            r4 = r0[r4]     // Catch: java.lang.NumberFormatException -> L31
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L31
            r5 = 2
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L31
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L31
            r1.<init>(r3, r4, r0)     // Catch: java.lang.NumberFormatException -> L31
            r0 = r1
            goto L36
        L31:
            com.google.android.gms.ads.VersionInfo r0 = new com.google.android.gms.ads.VersionInfo
            r0.<init>(r2, r2, r2)
        L36:
            return r0
    }

    public static void initialize(android.content.Context r2) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r1 = 0
            r0.zzo(r2, r1, r1)
            return
    }

    public static void initialize(android.content.Context r2, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r3) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r1 = 0
            r0.zzo(r2, r1, r3)
            return
    }

    public static void openAdInspector(android.content.Context r1, com.google.android.gms.ads.OnAdInspectorClosedListener r2) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r0.zzr(r1, r2)
            return
    }

    public static void openDebugMenu(android.content.Context r1, java.lang.String r2) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r0.zzs(r1, r2)
            return
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean r1) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            boolean r1 = r0.zzz(r1)
            return r1
    }

    public static androidx.browser.customtabs.CustomTabsSession registerCustomTabsSession(android.content.Context r2, androidx.browser.customtabs.CustomTabsClient r3, java.lang.String r4, androidx.browser.customtabs.CustomTabsCallback r5) {
            com.google.android.gms.ads.internal.client.zzey.zzf()
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzbzl r0 = com.google.android.gms.internal.ads.zzbud.zza(r2)
            r1 = 0
            if (r0 != 0) goto L15
            java.lang.String r2 = "Internal error, query info generator is null."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            goto L35
        L15:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            com.google.android.gms.dynamic.IObjectWrapper r2 = r0.zze(r2, r3, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            androidx.browser.customtabs.CustomTabsSession r2 = (androidx.browser.customtabs.CustomTabsSession) r2     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            r1 = r2
            goto L35
        L2d:
            r2 = move-exception
            goto L30
        L2f:
            r2 = move-exception
        L30:
            java.lang.String r3 = "Unable to register custom tabs session. Error: "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r2)
        L35:
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void registerRtbAdapter(java.lang.Class<? extends com.google.android.gms.ads.mediation.rtb.RtbAdapter> r1) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r0.zzt(r1)
            return
    }

    public static void registerWebView(android.webkit.WebView r1) {
            com.google.android.gms.ads.internal.client.zzey.zzf()
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            if (r1 != 0) goto L10
            java.lang.String r1 = "The webview to be registered cannot be null."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r1)
            return
        L10:
            android.content.Context r0 = r1.getContext()
            com.google.android.gms.internal.ads.zzbzl r0 = com.google.android.gms.internal.ads.zzbud.zza(r0)
            if (r0 != 0) goto L20
            java.lang.String r1 = "Internal error, query info generator is null."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r1)
            return
        L20:
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L28
            r0.zzj(r1)     // Catch: android.os.RemoteException -> L28
            return
        L28:
            r1 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r1)
            return
    }

    public static void setAppMuted(boolean r1) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r0.zzu(r1)
            return
    }

    public static void setAppVolume(float r1) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r0.zzv(r1)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    private static void setPlugin(java.lang.String r1) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r0.zzw(r1)
            return
    }

    public static void setRequestConfiguration(com.google.android.gms.ads.RequestConfiguration r1) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r0.zzx(r1)
            return
    }

    public static void startPreload(android.content.Context r1, java.util.List<com.google.android.gms.ads.preload.PreloadConfiguration> r2, com.google.android.gms.ads.preload.PreloadCallback r3) {
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            r0.zzg(r1, r2, r3)
            return
    }
}
