package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbtc extends com.google.android.gms.internal.ads.zzbhv {
    private final com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener zza;

    public zzbtc(com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zze() {
            r1 = this;
            com.google.android.gms.ads.nativead.NativeAd$UnconfirmedClickListener r0 = r1.zza
            r0.onUnconfirmedClickCancelled()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zzf(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.nativead.NativeAd$UnconfirmedClickListener r0 = r1.zza
            r0.onUnconfirmedClickReceived(r2)
            return
    }
}
