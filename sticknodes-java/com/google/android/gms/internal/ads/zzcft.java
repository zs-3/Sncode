package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcft implements android.view.View.OnAttachStateChangeListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbyk zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zzb;

    zzcft(com.google.android.gms.internal.ads.zzcfw r1, com.google.android.gms.internal.ads.zzbyk r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbyk r0 = r3.zza
            com.google.android.gms.internal.ads.zzcfw r1 = r3.zzb
            r2 = 10
            com.google.android.gms.internal.ads.zzcfw.zzf(r1, r4, r0, r2)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            return
    }
}
