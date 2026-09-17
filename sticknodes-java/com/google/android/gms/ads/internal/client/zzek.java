package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzek extends com.google.android.gms.ads.internal.client.zzbd {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzel zza;

    zzek(com.google.android.gms.ads.internal.client.zzel r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError r3) {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            com.google.android.gms.ads.VideoController r1 = com.google.android.gms.ads.internal.client.zzel.zze(r0)
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzi()
            r1.zzb(r0)
            super.onAdFailedToLoad(r3)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            com.google.android.gms.ads.VideoController r1 = com.google.android.gms.ads.internal.client.zzel.zze(r0)
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzi()
            r1.zzb(r0)
            super.onAdLoaded()
            return
    }
}
