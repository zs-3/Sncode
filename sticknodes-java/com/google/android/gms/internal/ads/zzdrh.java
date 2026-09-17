package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdrh extends android.widget.FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzau zza;

    public zzdrh(android.content.Context r2, android.view.View r3, com.google.android.gms.ads.internal.util.zzau r4) {
            r1 = this;
            r1.<init>(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r2.<init>(r0, r0)
            r1.setLayoutParams(r2)
            r1.addView(r3)
            r1.zza = r4
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.google.android.gms.ads.internal.util.zzau r0 = r1.zza
            r0.zzm(r2)
            r2 = 0
            return r2
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r5.getChildCount()
            if (r2 >= r3) goto L1f
            android.view.View r3 = r5.getChildAt(r2)
            if (r3 == 0) goto L1c
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzcfo
            if (r4 == 0) goto L1c
            com.google.android.gms.internal.ads.zzcfo r3 = (com.google.android.gms.internal.ads.zzcfo) r3
            r0.add(r3)
        L1c:
            int r2 = r2 + 1
            goto L7
        L1f:
            super.removeAllViews()
            int r2 = r0.size()
        L26:
            if (r1 >= r2) goto L34
            java.lang.Object r3 = r0.get(r1)
            com.google.android.gms.internal.ads.zzcfo r3 = (com.google.android.gms.internal.ads.zzcfo) r3
            r3.destroy()
            int r1 = r1 + 1
            goto L26
        L34:
            return
    }
}
