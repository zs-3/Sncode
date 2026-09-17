package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzo implements android.view.View.OnTouchListener {
    final /* synthetic */ com.google.android.gms.ads.internal.zzt zza;

    zzo(com.google.android.gms.ads.internal.zzt r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            com.google.android.gms.ads.internal.zzt r2 = r1.zza
            com.google.android.gms.internal.ads.zzavn r0 = com.google.android.gms.ads.internal.zzt.zzf(r2)
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzavn r2 = com.google.android.gms.ads.internal.zzt.zzf(r2)
            r2.zzd(r3)
        Lf:
            r2 = 0
            return r2
    }
}
