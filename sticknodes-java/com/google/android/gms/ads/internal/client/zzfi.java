package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzfi extends com.google.android.gms.ads.internal.client.zzbq {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfj zza;

    /* synthetic */ zzfi(com.google.android.gms.ads.internal.client.zzfj r1, com.google.android.gms.ads.internal.client.zzfh r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final java.lang.String zze() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final java.lang.String zzf() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(com.google.android.gms.ads.internal.client.zzm r2) throws android.os.RemoteException {
            r1 = this;
            r0 = 1
            r1.zzh(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(com.google.android.gms.ads.internal.client.zzm r1, int r2) throws android.os.RemoteException {
            r0 = this;
            java.lang.String r1 = "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r1)
            android.os.Handler r1 = com.google.android.gms.ads.internal.util.client.zzf.zza
            com.google.android.gms.ads.internal.client.zzfg r2 = new com.google.android.gms.ads.internal.client.zzfg
            r2.<init>(r0)
            r1.post(r2)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }
}
