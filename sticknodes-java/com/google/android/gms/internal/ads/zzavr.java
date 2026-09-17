package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzavr {
    private android.net.NetworkCapabilities zza;

    zzavr(android.net.ConnectivityManager r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L20
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto Lc
            goto L20
        Lc:
            com.google.android.gms.internal.ads.zzavq r0 = new com.google.android.gms.internal.ads.zzavq     // Catch: java.lang.RuntimeException -> L15
            r0.<init>(r2)     // Catch: java.lang.RuntimeException -> L15
            r3.registerDefaultNetworkCallback(r0)     // Catch: java.lang.RuntimeException -> L15
            return
        L15:
            java.lang.Class<com.google.android.gms.internal.ads.zzavr> r3 = com.google.android.gms.internal.ads.zzavr.class
            monitor-enter(r3)
            r0 = 0
            r2.zza = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L20:
            return
    }

    public static com.google.android.gms.internal.ads.zzavr zzc(android.content.Context r2) {
            if (r2 == 0) goto L10
            com.google.android.gms.internal.ads.zzavr r0 = new com.google.android.gms.internal.ads.zzavr
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r0.<init>(r2)
            return r0
        L10:
            r2 = 0
            return r2
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzavr r0, android.net.NetworkCapabilities r1) {
            r0.zza = r1
            return
    }

    public final long zza() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzavr> r0 = com.google.android.gms.internal.ads.zzavr.class
            monitor-enter(r0)
            android.net.NetworkCapabilities r1 = r3.zza     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L2c
            r2 = 4
            boolean r1 = r1.hasTransport(r2)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 2
            return r0
        L12:
            android.net.NetworkCapabilities r1 = r3.zza     // Catch: java.lang.Throwable -> L30
            r2 = 1
            boolean r1 = r1.hasTransport(r2)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 1
            return r0
        L1f:
            android.net.NetworkCapabilities r1 = r3.zza     // Catch: java.lang.Throwable -> L30
            r2 = 0
            boolean r1 = r1.hasTransport(r2)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 0
            return r0
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r0 = -1
            return r0
        L30:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
    }

    public final android.net.NetworkCapabilities zzb() {
            r1 = this;
            android.net.NetworkCapabilities r0 = r1.zza
            return r0
    }
}
