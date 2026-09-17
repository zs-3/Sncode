package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfqi implements java.lang.Runnable {
    zzfqi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzfql.zzb()
            if (r0 == 0) goto L1e
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzfql.zzb()
            java.lang.Runnable r1 = com.google.android.gms.internal.ads.zzfql.zzf()
            r0.post(r1)
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzfql.zzb()
            java.lang.Runnable r1 = com.google.android.gms.internal.ads.zzfql.zze()
            r2 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r1, r2)
        L1e:
            return
    }
}
