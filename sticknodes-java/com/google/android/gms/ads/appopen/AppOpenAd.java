package com.google.android.gms.ads.appopen;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static abstract class AppOpenAdLoadCallback extends com.google.android.gms.ads.AdLoadCallback<com.google.android.gms.ads.appopen.AppOpenAd> {
        public AppOpenAdLoadCallback() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public @interface AppOpenAdOrientation {
    }

    public AppOpenAd() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isAdAvailable(android.content.Context r2, java.lang.String r3) {
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: android.os.RemoteException -> L16
            android.content.Context r2 = r2.getApplicationContext()     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.internal.ads.zzbph r1 = new com.google.android.gms.internal.ads.zzbph     // Catch: android.os.RemoteException -> L16
            r1.<init>()     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.ads.internal.client.zzci r2 = r0.zzg(r2, r1)     // Catch: android.os.RemoteException -> L16
            boolean r2 = r2.zzj(r3)     // Catch: android.os.RemoteException -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static void load(android.content.Context r8, java.lang.String r9, com.google.android.gms.ads.AdRequest r10, @com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation int r11, com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback r12) {
            java.lang.String r0 = "Context cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8, r0)
            java.lang.String r0 = "adUnitId cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9, r0)
            java.lang.String r0 = "AdRequest cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10, r0)
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzbcv.zza(r8)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.appopen.zzb r7 = new com.google.android.gms.ads.appopen.zzb
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r7)
            return
        L48:
            com.google.android.gms.internal.ads.zzbaw r0 = new com.google.android.gms.internal.ads.zzbaw
            com.google.android.gms.ads.internal.client.zzei r4 = r10.zza()
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.zza()
            return
    }

    public static void load(android.content.Context r8, java.lang.String r9, com.google.android.gms.ads.AdRequest r10, com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback r11) {
            java.lang.String r0 = "Context cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8, r0)
            java.lang.String r0 = "adUnitId cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9, r0)
            java.lang.String r0 = "AdRequest cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10, r0)
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzbcv.zza(r8)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.appopen.zza r1 = new com.google.android.gms.ads.appopen.zza
            r1.<init>(r8, r9, r10, r11)
            r0.execute(r1)
            return
        L42:
            com.google.android.gms.internal.ads.zzbaw r0 = new com.google.android.gms.internal.ads.zzbaw
            com.google.android.gms.ads.internal.client.zzei r5 = r10.zza()
            r6 = 3
            r2 = r0
            r3 = r8
            r4 = r9
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r0.zza()
            return
    }

    @java.lang.Deprecated
    public static void load(android.content.Context r8, java.lang.String r9, com.google.android.gms.ads.admanager.AdManagerAdRequest r10, @com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation int r11, com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback r12) {
            java.lang.String r0 = "Context cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8, r0)
            java.lang.String r0 = "adUnitId cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9, r0)
            java.lang.String r0 = "AdManagerAdRequest cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10, r0)
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzbcv.zza(r8)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.appopen.zzc r7 = new com.google.android.gms.ads.appopen.zzc
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r7)
            return
        L48:
            com.google.android.gms.internal.ads.zzbaw r0 = new com.google.android.gms.internal.ads.zzbaw
            com.google.android.gms.ads.internal.client.zzei r4 = r10.zza()
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.zza()
            return
    }

    public static com.google.android.gms.ads.appopen.AppOpenAd pollAd(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: android.os.RemoteException -> L24
            android.content.Context r3 = r3.getApplicationContext()     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.internal.ads.zzbph r2 = new com.google.android.gms.internal.ads.zzbph     // Catch: android.os.RemoteException -> L24
            r2.<init>()     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.ads.internal.client.zzci r3 = r1.zzg(r3, r2)     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.internal.ads.zzbao r3 = r3.zze(r4)     // Catch: android.os.RemoteException -> L24
            if (r3 != 0) goto L1e
            java.lang.String r3 = "Failed to obtain an App Open ad from the preloader."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r0)     // Catch: android.os.RemoteException -> L24
            return r0
        L1e:
            com.google.android.gms.internal.ads.zzbak r1 = new com.google.android.gms.internal.ads.zzbak     // Catch: android.os.RemoteException -> L24
            r1.<init>(r3, r4)     // Catch: android.os.RemoteException -> L24
            return r1
        L24:
            r3 = move-exception
            java.lang.String r4 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r4, r3)
            return r0
    }

    public abstract java.lang.String getAdUnitId();

    public abstract com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback();

    public abstract com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener();

    public abstract com.google.android.gms.ads.ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback r1);

    public abstract void setImmersiveMode(boolean r1);

    public abstract void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener r1);

    public abstract void show(android.app.Activity r1);
}
