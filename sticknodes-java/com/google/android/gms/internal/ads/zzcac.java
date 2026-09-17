package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcac {
    private final java.lang.Object zza;
    private volatile long zzb;
    private volatile int zzc;

    private zzcac() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zza = r0
            r0 = 1
            r2.zzc = r0
            r0 = 0
            r2.zzb = r0
            return
    }

    /* synthetic */ zzcac(com.google.android.gms.internal.ads.zzcab r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.zza = r3
            r3 = 1
            r2.zzc = r3
            r0 = 0
            r2.zzb = r0
            return
    }

    public final void zza() {
            r9 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            java.lang.Object r2 = r9.zza
            monitor-enter(r2)
            int r3 = r9.zzc     // Catch: java.lang.Throwable -> L4a
            r4 = 3
            if (r3 != r4) goto L2a
            long r5 = r9.zzb     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzfL     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r3 = r7.zza(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L4a
            long r7 = r3.longValue()     // Catch: java.lang.Throwable -> L4a
            long r5 = r5 + r7
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L2a
            r0 = 1
            r9.zzc = r0     // Catch: java.lang.Throwable -> L4a
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            java.lang.Object r3 = r9.zza
            monitor-enter(r3)
            int r2 = r9.zzc     // Catch: java.lang.Throwable -> L47
            r5 = 2
            if (r2 == r5) goto L3d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            return
        L3d:
            r9.zzc = r4     // Catch: java.lang.Throwable -> L47
            int r2 = r9.zzc     // Catch: java.lang.Throwable -> L47
            if (r2 != r4) goto L45
            r9.zzb = r0     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            throw r0
        L4a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            throw r0
    }
}
