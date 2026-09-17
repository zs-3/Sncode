package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzh extends android.widget.RelativeLayout {
    final com.google.android.gms.ads.internal.util.zzau zza;
    boolean zzb;

    public zzh(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.ads.internal.util.zzau r0 = new com.google.android.gms.ads.internal.util.zzau
            r0.<init>(r2, r3)
            r1.zza = r0
            r0.zzo(r4)
            r0.zzn(r5)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.zzb
            if (r0 != 0) goto L9
            com.google.android.gms.ads.internal.util.zzau r0 = r1.zza
            r0.zzm(r2)
        L9:
            r2 = 0
            return r2
    }
}
