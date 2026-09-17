package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeid implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeie zza;

    zzeid(com.google.android.gms.internal.ads.zzeie r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeie r0 = r2.zza
            com.google.android.gms.internal.ads.zzcrv r0 = com.google.android.gms.internal.ads.zzeie.zzd(r0)
            com.google.android.gms.internal.ads.zzcum r0 = r0.zzd()
            com.google.android.gms.ads.internal.client.zze r0 = r0.zza(r3)
            com.google.android.gms.internal.ads.zzeie r1 = r2.zza
            com.google.android.gms.internal.ads.zzcyc r1 = com.google.android.gms.internal.ads.zzeie.zze(r1)
            r1.zzdB(r0)
            int r0 = r0.zza
            java.lang.String r1 = "DelayedBannerAd.onFailure"
            com.google.android.gms.internal.ads.zzfhz.zzb(r0, r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* synthetic */ void zzb(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcqr r1 = (com.google.android.gms.internal.ads.zzcqr) r1
            r1.zzk()
            return
    }
}
