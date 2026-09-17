package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class zzbd extends com.google.android.gms.ads.AdListener {
    private final java.lang.Object zza;
    private com.google.android.gms.ads.AdListener zzb;

    public zzbd() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.AdListener r1 = r2.zzb     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.onAdClicked()     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.AdListener r1 = r2.zzb     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.onAdClosed()     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.AdListener r1 = r2.zzb     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.onAdFailedToLoad(r3)     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.AdListener r1 = r2.zzb     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.onAdImpression()     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.AdListener r1 = r2.zzb     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.onAdLoaded()     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.AdListener r1 = r2.zzb     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.onAdOpened()     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public final void zza(com.google.android.gms.ads.AdListener r2) {
            r1 = this;
            java.lang.Object r0 = r1.zza
            monitor-enter(r0)
            r1.zzb = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }
}
