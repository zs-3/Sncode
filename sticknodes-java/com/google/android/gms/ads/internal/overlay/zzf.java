package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzf implements android.view.View.OnClickListener {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zza;

    zzf(com.google.android.gms.ads.internal.overlay.zzm r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.zzm r2 = r1.zza
            r0 = 2
            r2.zzn = r0
            android.app.Activity r2 = r2.zzb
            r2.finish()
            return
    }
}
