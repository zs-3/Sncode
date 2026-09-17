package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaua implements java.lang.Runnable {
    private zzaua() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzaua(com.google.android.gms.internal.ads.zzatz r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> Lf java.security.NoSuchAlgorithmException -> L16
            com.google.android.gms.internal.ads.zzaub.zzc(r0)     // Catch: java.lang.Throwable -> Lf java.security.NoSuchAlgorithmException -> L16
            java.util.concurrent.CountDownLatch r0 = com.google.android.gms.internal.ads.zzaub.zzb
        Lb:
            r0.countDown()
            return
        Lf:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = com.google.android.gms.internal.ads.zzaub.zzb
            r1.countDown()
            throw r0
        L16:
            java.util.concurrent.CountDownLatch r0 = com.google.android.gms.internal.ads.zzaub.zzb
            goto Lb
    }
}
