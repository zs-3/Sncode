package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzavq extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzavr zza;

    zzavq(com.google.android.gms.internal.ads.zzavr r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network r2, android.net.NetworkCapabilities r3) {
            r1 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzavr> r2 = com.google.android.gms.internal.ads.zzavr.class
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzavr r0 = r1.zza     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzavr.zzd(r0, r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network r3) {
            r2 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzavr> r3 = com.google.android.gms.internal.ads.zzavr.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzavr r0 = r2.zza     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            com.google.android.gms.internal.ads.zzavr.zzd(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }
}
