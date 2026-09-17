package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdvi {
    private final com.google.android.gms.internal.ads.zzbkv zza;

    zzdvi(com.google.android.gms.internal.ads.zzbkv r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private final void zzs(com.google.android.gms.internal.ads.zzdvh r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.String r2 = com.google.android.gms.internal.ads.zzdvh.zza(r2)
            java.lang.String r0 = "Dispatching AFMA event on publisher webview: "
            java.lang.String r0 = r0.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)
            com.google.android.gms.internal.ads.zzbkv r0 = r1.zza
            r0.zzb(r2)
            return
    }

    public final void zza() throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "initialize"
            r2 = 0
            r0.<init>(r1, r2)
            r3.zzs(r0)
            return
    }

    public final void zzb(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "interstitial"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onAdClicked"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            java.lang.String r4 = com.google.android.gms.internal.ads.zzdvh.zza(r0)
            com.google.android.gms.internal.ads.zzbkv r5 = r3.zza
            r5.zzb(r4)
            return
    }

    public final void zzc(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "interstitial"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onAdClosed"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzd(long r4, int r6) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "interstitial"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onAdFailedToLoad"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.ads.zzdvh.zzb(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zze(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "interstitial"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onAdLoaded"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzf(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "interstitial"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onNativeAdObjectNotAvailable"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzg(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "interstitial"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onAdOpened"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzh(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "creation"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "nativeObjectCreated"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzi(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "creation"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "nativeObjectNotCreated"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzj(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "rewarded"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onAdClicked"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzk(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "rewarded"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onRewardedAdClosed"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzl(long r4, com.google.android.gms.internal.ads.zzbxc r6) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "rewarded"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onUserEarnedReward"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            java.lang.String r4 = r6.zzf()
            com.google.android.gms.internal.ads.zzdvh.zzf(r0, r4)
            int r4 = r6.zze()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zze(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzm(long r4, int r6) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "rewarded"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onRewardedAdFailedToLoad"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.ads.zzdvh.zzb(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzn(long r4, int r6) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "rewarded"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onRewardedAdFailedToShow"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.ads.zzdvh.zzb(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzo(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "rewarded"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onAdImpression"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzp(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "rewarded"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onRewardedAdLoaded"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzq(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "rewarded"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onNativeAdObjectNotAvailable"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }

    public final void zzr(long r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh
            java.lang.String r1 = "rewarded"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.ads.zzdvh.zzd(r0, r4)
            java.lang.String r4 = "onRewardedAdOpened"
            com.google.android.gms.internal.ads.zzdvh.zzc(r0, r4)
            r3.zzs(r0)
            return
    }
}
