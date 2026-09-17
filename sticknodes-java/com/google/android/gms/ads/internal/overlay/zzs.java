package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzs extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzu zza;

    zzs(com.google.android.gms.ads.internal.overlay.zzu r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    private final void zza(boolean r2) {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.zzu r0 = r1.zza
            r0.setEnabled(r2)
            com.google.android.gms.ads.internal.overlay.zzu r0 = r1.zza
            android.widget.ImageButton r0 = com.google.android.gms.ads.internal.overlay.zzu.zza(r0)
            r0.setEnabled(r2)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.zza(r1)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.zza(r1)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            r1 = 0
            r0.zza(r1)
            return
    }
}
