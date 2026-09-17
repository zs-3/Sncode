package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzayb {
    private final com.google.android.gms.internal.ads.zzawo zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private volatile java.lang.reflect.Method zzd;
    private final java.lang.Class[] zze;
    private final java.util.concurrent.CountDownLatch zzf;

    static {
            return
    }

    public zzayb(com.google.android.gms.internal.ads.zzawo r3, java.lang.String r4, java.lang.String r5, java.lang.Class... r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzd = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zzf = r0
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zze = r6
            java.util.concurrent.ExecutorService r3 = r3.zzk()
            com.google.android.gms.internal.ads.zzaya r4 = new com.google.android.gms.internal.ads.zzaya
            r4.<init>(r2)
            r3.submit(r4)
            return
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzayb r3) {
            com.google.android.gms.internal.ads.zzawo r0 = r3.zza     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            dalvik.system.DexClassLoader r1 = r0.zzi()     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            byte[] r0 = r0.zzu()     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            java.lang.String r2 = r3.zzb     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            java.lang.String r0 = r3.zzc(r0, r2)     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            java.lang.Class r0 = r1.loadClass(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzawo r1 = r3.zza     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            byte[] r1 = r1.zzu()     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            java.lang.String r2 = r3.zzc     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            java.lang.String r1 = r3.zzc(r1, r2)     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            java.lang.Class[] r2 = r3.zze     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            r3.zzd = r0     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L32
            goto L32
        L2b:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r3 = r3.zzf
            r3.countDown()
            throw r0
        L32:
            java.util.concurrent.CountDownLatch r3 = r3.zzf
            r3.countDown()
            return
    }

    private final java.lang.String zzc(byte[] r2, java.lang.String r3) throws com.google.android.gms.internal.ads.zzavs, java.io.UnsupportedEncodingException {
            r1 = this;
            com.google.android.gms.internal.ads.zzawo r0 = r1.zza
            com.google.android.gms.internal.ads.zzavt r0 = r0.zze()
            byte[] r2 = r0.zzb(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.lang.String r0 = "UTF-8"
            r3.<init>(r2, r0)
            return r3
    }

    public final java.lang.reflect.Method zza() {
            r5 = this;
            java.lang.reflect.Method r0 = r5.zzd
            if (r0 == 0) goto L7
            java.lang.reflect.Method r0 = r5.zzd
            return r0
        L7:
            r0 = 0
            java.util.concurrent.CountDownLatch r1 = r5.zzf     // Catch: java.lang.InterruptedException -> L17
            r2 = 2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L17
            boolean r1 = r1.await(r2, r4)     // Catch: java.lang.InterruptedException -> L17
            if (r1 != 0) goto L15
            return r0
        L15:
            java.lang.reflect.Method r0 = r5.zzd     // Catch: java.lang.InterruptedException -> L17
        L17:
            return r0
    }
}
