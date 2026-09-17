package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzb {
    public static final java.util.concurrent.ThreadPoolExecutor zza = null;
    public static final java.util.concurrent.ExecutorService zzb = null;

    static {
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r6 = new java.util.concurrent.SynchronousQueue
            r6.<init>()
            com.google.android.gms.ads.internal.util.client.zza r7 = new com.google.android.gms.ads.internal.util.client.zza
            java.lang.String r0 = "ClientDefault"
            r7.<init>(r0)
            r1 = 2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 10
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            com.google.android.gms.ads.internal.util.client.zzb.zza = r8
            com.google.android.gms.ads.internal.util.client.zza r0 = new com.google.android.gms.ads.internal.util.client.zza
            java.lang.String r1 = "ClientSingle"
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            com.google.android.gms.ads.internal.util.client.zzb.zzb = r0
            return
    }
}
