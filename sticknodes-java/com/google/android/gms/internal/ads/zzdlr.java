package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdlr implements android.view.GestureDetector.OnGestureListener {
    private final com.google.android.gms.internal.ads.zzdkk zza;
    private final com.google.android.gms.internal.ads.zzdll zzb;

    zzdlr(com.google.android.gms.internal.ads.zzdkk r1, com.google.android.gms.internal.ads.zzdll r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzdkk r0 = r6.zza     // Catch: java.lang.Throwable -> L7d
            r1 = 0
            if (r0 != 0) goto L8
            goto L7b
        L8:
            float r0 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L7d
            float r2 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> L7d
            r3 = -1
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3e
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L2b
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L7d
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L7d
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L7d
            r3 = 1
            goto L66
        L2b:
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L65
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L7d
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L7d
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L7d
            r3 = 2
            goto L66
        L3e:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L52
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L7d
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L7d
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L7d
            r3 = 8
            goto L66
        L52:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L65
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L7d
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L7d
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L7d
            r3 = 4
            goto L66
        L65:
            r7 = 0
        L66:
            com.google.android.gms.internal.ads.zzdkk r8 = r6.zza     // Catch: java.lang.Throwable -> L7d
            int r8 = r8.zza()     // Catch: java.lang.Throwable -> L7d
            if (r3 != r8) goto L7b
            com.google.android.gms.internal.ads.zzdkk r8 = r6.zza     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.zzdll r9 = r6.zzb     // Catch: java.lang.Throwable -> L7d
            android.widget.FrameLayout r9 = r9.zzr()     // Catch: java.lang.Throwable -> L7d
            r8.zzE(r9, r7)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r6)
            return r1
        L7b:
            monitor-exit(r6)
            return r1
        L7d:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent r1) {
            r0 = this;
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent r1) {
            r0 = this;
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(android.view.MotionEvent r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            r1 = 0
            return r1
    }
}
