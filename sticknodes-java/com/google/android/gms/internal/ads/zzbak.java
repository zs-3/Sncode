package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbak extends com.google.android.gms.ads.appopen.AppOpenAd {
    com.google.android.gms.ads.FullScreenContentCallback zza;
    private final com.google.android.gms.internal.ads.zzbao zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzbal zzd;
    private com.google.android.gms.ads.OnPaidEventListener zze;

    public zzbak(com.google.android.gms.internal.ads.zzbao r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzbal r0 = new com.google.android.gms.internal.ads.zzbal
            r0.<init>()
            r1.zzd = r0
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final java.lang.String getAdUnitId() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
            r1 = this;
            com.google.android.gms.ads.OnPaidEventListener r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbao r0 = r2.zzb     // Catch: android.os.RemoteException -> L7
            com.google.android.gms.ads.internal.client.zzdy r0 = r0.zzf()     // Catch: android.os.RemoteException -> L7
            goto Le
        L7:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            r0 = 0
        Le:
            com.google.android.gms.ads.ResponseInfo r0 = com.google.android.gms.ads.ResponseInfo.zzb(r0)
            return r0
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback r2) {
            r1 = this;
            r1.zza = r2
            com.google.android.gms.internal.ads.zzbal r0 = r1.zzd
            r0.zzg(r2)
            return
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbao r0 = r1.zzb     // Catch: android.os.RemoteException -> L6
            r0.zzg(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener r3) {
            r2 = this;
            r2.zze = r3
            com.google.android.gms.internal.ads.zzbao r0 = r2.zzb     // Catch: android.os.RemoteException -> Ld
            com.google.android.gms.ads.internal.client.zzft r1 = new com.google.android.gms.ads.internal.client.zzft     // Catch: android.os.RemoteException -> Ld
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Ld
            r0.zzh(r1)     // Catch: android.os.RemoteException -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(android.app.Activity r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbao r0 = r2.zzb     // Catch: android.os.RemoteException -> Lc
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> Lc
            com.google.android.gms.internal.ads.zzbal r1 = r2.zzd     // Catch: android.os.RemoteException -> Lc
            r0.zzi(r3, r1)     // Catch: android.os.RemoteException -> Lc
            return
        Lc:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }
}
