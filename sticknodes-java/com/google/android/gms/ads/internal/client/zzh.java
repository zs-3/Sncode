package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzh extends com.google.android.gms.ads.internal.client.zzbn {
    private final com.google.android.gms.ads.AdLoadCallback zza;
    private final java.lang.Object zzb;

    public zzh(com.google.android.gms.ads.AdLoadCallback r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            com.google.android.gms.ads.AdLoadCallback r0 = r1.zza
            if (r0 == 0) goto Lb
            com.google.android.gms.ads.LoadAdError r2 = r2.zzb()
            r0.onAdFailedToLoad(r2)
        Lb:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
            r2 = this;
            com.google.android.gms.ads.AdLoadCallback r0 = r2.zza
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r2.zzb
            if (r1 == 0) goto Lb
            r0.onAdLoaded(r1)
        Lb:
            return
    }
}
