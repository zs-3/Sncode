package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class RewardedAd {
    public RewardedAd() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isAdAvailable(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "Context cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "AdUnitId cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.ads.zzbxo r0 = new com.google.android.gms.internal.ads.zzbxo
            r0.<init>(r1, r2)
            boolean r1 = r0.zzc()
            return r1
    }

    public static void load(android.content.Context r2, java.lang.String r3, com.google.android.gms.ads.AdRequest r4, com.google.android.gms.ads.rewarded.RewardedAdLoadCallback r5) {
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
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzk
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
            com.google.android.gms.ads.rewarded.zzc r1 = new com.google.android.gms.ads.rewarded.zzc
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
        L47:
            java.lang.String r0 = "Loading on UI thread"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbxo r0 = new com.google.android.gms.internal.ads.zzbxo
            r0.<init>(r2, r3)
            com.google.android.gms.ads.internal.client.zzei r2 = r4.zza()
            r0.zzb(r2, r5)
            return
    }

    public static void load(android.content.Context r2, java.lang.String r3, com.google.android.gms.ads.admanager.AdManagerAdRequest r4, com.google.android.gms.ads.rewarded.RewardedAdLoadCallback r5) {
            java.lang.String r0 = "Context cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "AdUnitId cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "AdManagerAdRequest cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = "LoadCallback cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzbcv.zza(r2)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzk
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4c
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4c
            java.lang.String r0 = "Loading on background thread"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.rewarded.zzb r1 = new com.google.android.gms.ads.rewarded.zzb
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
        L4c:
            java.lang.String r0 = "Loading on UI thread"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbxo r0 = new com.google.android.gms.internal.ads.zzbxo
            r0.<init>(r2, r3)
            com.google.android.gms.ads.internal.client.zzei r2 = r4.zza()
            r0.zzb(r2, r5)
            return
    }

    public static com.google.android.gms.ads.rewarded.RewardedAd pollAd(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "Context cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "AdUnitId cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.ads.zzbxo r0 = new com.google.android.gms.internal.ads.zzbxo
            r0.<init>(r1, r2)
            com.google.android.gms.ads.rewarded.RewardedAd r1 = r0.zza()
            return r1
    }

    public abstract android.os.Bundle getAdMetadata();

    public abstract java.lang.String getAdUnitId();

    public abstract com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback();

    public abstract com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener();

    public abstract com.google.android.gms.ads.ResponseInfo getResponseInfo();

    public abstract com.google.android.gms.ads.rewarded.RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback r1);

    public abstract void setImmersiveMode(boolean r1);

    public abstract void setOnAdMetadataChangedListener(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener r1);

    public abstract void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener r1);

    public abstract void setServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions r1);

    public abstract void show(android.app.Activity r1, com.google.android.gms.ads.OnUserEarnedRewardListener r2);
}
