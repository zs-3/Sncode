package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbsc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsd zzb;

    zzbsc(com.google.android.gms.internal.ads.zzbsd r1, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.ads.internal.zzu.zzi()
            com.google.android.gms.internal.ads.zzbsd r0 = r3.zzb
            android.app.Activity r0 = com.google.android.gms.internal.ads.zzbsd.zza(r0)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r3.zza
            r2 = 1
            com.google.android.gms.ads.internal.overlay.zzn.zza(r0, r1, r2)
            return
    }
}
