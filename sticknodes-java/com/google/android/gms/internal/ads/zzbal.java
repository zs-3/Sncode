package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbal extends com.google.android.gms.internal.ads.zzbau {
    private com.google.android.gms.ads.FullScreenContentCallback zza;

    public zzbal() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbav
    public final void zzb() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbav
    public final void zzc() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdDismissedFullScreenContent()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbav
    public final void zzd(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto Lb
            com.google.android.gms.ads.AdError r2 = r2.zza()
            r0.onAdFailedToShowFullScreenContent(r2)
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbav
    public final void zze() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdImpression()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbav
    public final void zzf() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdShowedFullScreenContent()
        L7:
            return
    }

    public final void zzg(com.google.android.gms.ads.FullScreenContentCallback r1) {
            r0 = this;
            r0.zza = r1
            return
    }
}
