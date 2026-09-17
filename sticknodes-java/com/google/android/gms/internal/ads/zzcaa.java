package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcaa extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcad zza;

    zzcaa(com.google.android.gms.internal.ads.zzcad r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcad r2 = r1.zza
            java.util.concurrent.atomic.AtomicBoolean r2 = com.google.android.gms.internal.ads.zzcad.zzp(r2)
            r0 = 1
            r2.set(r0)
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcad r2 = r1.zza
            java.util.concurrent.atomic.AtomicBoolean r2 = com.google.android.gms.internal.ads.zzcad.zzp(r2)
            r0 = 0
            r2.set(r0)
            return
    }
}
