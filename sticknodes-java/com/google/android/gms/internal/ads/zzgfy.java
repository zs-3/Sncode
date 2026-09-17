package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgfy {
    private final com.google.android.gms.internal.ads.zzfyw zza;
    private final java.lang.String zzb;
    private volatile java.util.logging.Logger zzc;

    zzgfy(java.lang.Class r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzfyw r0 = new com.google.android.gms.internal.ads.zzfyw
            r0.<init>()
            r1.zza = r0
            java.lang.String r2 = r2.getName()
            r1.zzb = r2
            return
    }

    final java.util.logging.Logger zza() {
            r2 = this;
            java.util.logging.Logger r0 = r2.zzc
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.ads.zzfyw r0 = r2.zza
            monitor-enter(r0)
            java.util.logging.Logger r1 = r2.zzc     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        Le:
            java.lang.String r1 = r2.zzb     // Catch: java.lang.Throwable -> L18
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)     // Catch: java.lang.Throwable -> L18
            r2.zzc = r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }
}
