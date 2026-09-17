package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcbc extends com.google.android.gms.internal.ads.zzcbd implements android.view.ViewTreeObserver.OnScrollChangedListener {
    private final java.lang.ref.WeakReference zza;

    public zzcbc(android.view.View r1, android.view.ViewTreeObserver.OnScrollChangedListener r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0.zza = r1
            return
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zza
            java.lang.Object r0 = r0.get()
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = (android.view.ViewTreeObserver.OnScrollChangedListener) r0
            if (r0 == 0) goto Le
            r0.onScrollChanged()
            return
        Le:
            r1.zze()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    protected final void zza(android.view.ViewTreeObserver r1) {
            r0 = this;
            r1.addOnScrollChangedListener(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    protected final void zzb(android.view.ViewTreeObserver r1) {
            r0 = this;
            r1.removeOnScrollChangedListener(r0)
            return
    }
}
