package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzg extends com.google.android.gms.ads.internal.client.zzbk {
    private final com.google.android.gms.ads.AdListener zza;

    public zzg(com.google.android.gms.ads.AdListener r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final com.google.android.gms.ads.AdListener zzb() {
            r1 = this;
            com.google.android.gms.ads.AdListener r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() {
            r1 = this;
            com.google.android.gms.ads.AdListener r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() {
            r1 = this;
            com.google.android.gms.ads.AdListener r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdClosed()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            com.google.android.gms.ads.AdListener r0 = r1.zza
            if (r0 == 0) goto Lb
            com.google.android.gms.ads.LoadAdError r2 = r2.zzb()
            r0.onAdFailedToLoad(r2)
        Lb:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
            r1 = this;
            com.google.android.gms.ads.AdListener r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdImpression()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() {
            r1 = this;
            com.google.android.gms.ads.AdListener r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdLoaded()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() {
            r1 = this;
            com.google.android.gms.ads.AdListener r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdOpened()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
            r1 = this;
            com.google.android.gms.ads.AdListener r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdSwipeGestureClicked()
        L7:
            return
    }
}
