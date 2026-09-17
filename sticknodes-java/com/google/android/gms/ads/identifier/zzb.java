package com.google.android.gms.ads.identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@com.google.android.gms.common.util.VisibleForTesting
/* loaded from: classes.dex */
final class zzb extends java.lang.Thread {
    final java.util.concurrent.CountDownLatch zza;
    boolean zzb;
    private final java.lang.ref.WeakReference<com.google.android.gms.ads.identifier.AdvertisingIdClient> zzc;
    private final long zzd;

    public zzb(com.google.android.gms.ads.identifier.AdvertisingIdClient r2, long r3) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zzc = r0
            r1.zzd = r3
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r3 = 1
            r2.<init>(r3)
            r1.zza = r2
            r2 = 0
            r1.zzb = r2
            r1.start()
            return
    }

    private final void zza() {
            r1 = this;
            java.lang.ref.WeakReference<com.google.android.gms.ads.identifier.AdvertisingIdClient> r0 = r1.zzc
            java.lang.Object r0 = r0.get()
            com.google.android.gms.ads.identifier.AdvertisingIdClient r0 = (com.google.android.gms.ads.identifier.AdvertisingIdClient) r0
            if (r0 == 0) goto L10
            r0.zza()
            r0 = 1
            r1.zzb = r0
        L10:
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = r4.zza     // Catch: java.lang.InterruptedException -> L10
            long r1 = r4.zzd     // Catch: java.lang.InterruptedException -> L10
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L10
            boolean r0 = r0.await(r1, r3)     // Catch: java.lang.InterruptedException -> L10
            if (r0 != 0) goto Lf
            r4.zza()     // Catch: java.lang.InterruptedException -> L10
        Lf:
            return
        L10:
            r4.zza()
            return
    }
}
