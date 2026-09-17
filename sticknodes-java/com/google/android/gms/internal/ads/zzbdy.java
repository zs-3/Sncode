package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbdy {
    private android.view.MotionEvent zza;
    private android.view.MotionEvent zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;

    public zzbdy(android.content.Context r9, java.util.concurrent.ScheduledExecutorService r10, com.google.android.gms.internal.ads.zzbea r11, com.google.android.gms.internal.ads.zzfma r12) {
            r8 = this;
            r8.<init>()
            r0 = 0
            r2 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            r8.zza = r9
            r4 = 0
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            r8.zzb = r9
            r8.zzc = r10
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
            r5 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzgff r0 = com.google.android.gms.internal.ads.zzgff.zzu(r0)
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbeq.zzc
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r4 = r5.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r3, r4)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            return r0
    }

    public final void zzb(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getAction()
            r1 = 1
            if (r0 != r1) goto L1d
            long r0 = r6.getEventTime()
            android.view.MotionEvent r2 = r5.zza
            long r2 = r2.getEventTime()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L16
            goto L1d
        L16:
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r6)
            r5.zza = r6
            return
        L1d:
            int r0 = r6.getAction()
            if (r0 != 0) goto L37
            long r0 = r6.getEventTime()
            android.view.MotionEvent r2 = r5.zzb
            long r2 = r2.getEventTime()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L37
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r6)
            r5.zzb = r6
        L37:
            return
    }
}
