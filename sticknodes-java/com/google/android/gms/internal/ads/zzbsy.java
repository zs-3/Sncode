package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbsy extends com.google.android.gms.internal.ads.zzbhi {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsz zza;

    /* synthetic */ zzbsy(com.google.android.gms.internal.ads.zzbsz r1, com.google.android.gms.internal.ads.zzbsx r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zze(com.google.android.gms.internal.ads.zzbgw r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbsz r0 = r2.zza
            com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomFormatAdLoadedListener r1 = com.google.android.gms.internal.ads.zzbsz.zzd(r0)
            com.google.android.gms.ads.nativead.NativeCustomFormatAd r3 = com.google.android.gms.internal.ads.zzbsz.zze(r0, r3)
            r1.onCustomFormatAdLoaded(r3)
            return
    }
}
