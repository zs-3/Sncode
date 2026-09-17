package com.google.android.gms.ads.interstitial;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class InterstitialAd {
    public InterstitialAd() {
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
            boolean r2 = r2.zzk(r3)     // Catch: android.os.RemoteException -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            r2 = 0
            return r2
    }

    public static void load(android.content.Context r2, java.lang.String r3, com.google.android.gms.ads.AdRequest r4, com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback r5) {
            java.lang.String r0 = "Context cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "AdUnitId cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "AdRequest cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = "LoadCallback cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzbcv.zza(r2)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzi
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L47
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L47
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.interstitial.zza r1 = new com.google.android.gms.ads.interstitial.zza
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
        L47:
            com.google.android.gms.internal.ads.zzbmq r0 = new com.google.android.gms.internal.ads.zzbmq
            r0.<init>(r2, r3)
            com.google.android.gms.ads.internal.client.zzei r2 = r4.zza()
            r0.zza(r2, r5)
            return
    }

    public static com.google.android.gms.ads.interstitial.InterstitialAd pollAd(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: android.os.RemoteException -> L24
            android.content.Context r2 = r4.getApplicationContext()     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.internal.ads.zzbph r3 = new com.google.android.gms.internal.ads.zzbph     // Catch: android.os.RemoteException -> L24
            r3.<init>()     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.ads.internal.client.zzci r1 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.ads.internal.client.zzby r1 = r1.zzf(r5)     // Catch: android.os.RemoteException -> L24
            if (r1 != 0) goto L1e
            java.lang.String r4 = "Failed to obtain an Interstitial Ad from the preloader."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r4, r0)     // Catch: android.os.RemoteException -> L24
            return r0
        L1e:
            com.google.android.gms.internal.ads.zzbmq r2 = new com.google.android.gms.internal.ads.zzbmq     // Catch: android.os.RemoteException -> L24
            r2.<init>(r4, r5, r1)     // Catch: android.os.RemoteException -> L24
            return r2
        L24:
            r4 = move-exception
            java.lang.String r5 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r5, r4)
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
