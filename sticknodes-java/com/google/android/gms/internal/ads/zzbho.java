package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbho extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbhq {
    zzbho(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zze(com.google.android.gms.internal.ads.zzbhz r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }
}
