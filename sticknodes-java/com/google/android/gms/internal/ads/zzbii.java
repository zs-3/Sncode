package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbii implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.admanager.AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbij zzc;

    zzbii(com.google.android.gms.internal.ads.zzbij r1, com.google.android.gms.ads.admanager.AdManagerAdView r2, com.google.android.gms.ads.internal.client.zzby r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.ads.admanager.AdManagerAdView r0 = r2.zza
            com.google.android.gms.ads.internal.client.zzby r1 = r2.zzb
            boolean r0 = r0.zzb(r1)
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzbij r0 = r2.zzc
            com.google.android.gms.ads.admanager.AdManagerAdView r1 = r2.zza
            com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener r0 = com.google.android.gms.internal.ads.zzbij.zzc(r0)
            r0.onAdManagerAdViewLoaded(r1)
            return
        L16:
            java.lang.String r0 = "Could not bind."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
    }
}
