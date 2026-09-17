package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdxv extends com.google.android.gms.ads.AdListener {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdxy zzb;

    zzdxv(com.google.android.gms.internal.ads.zzdxy r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdxy r0 = r2.zzb
            java.lang.String r3 = com.google.android.gms.internal.ads.zzdxy.zzc(r3)
            java.lang.String r1 = r2.zza
            com.google.android.gms.internal.ads.zzdxy.zzd(r0, r3, r1)
            return
    }
}
