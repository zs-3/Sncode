package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcan {
    public static final com.google.android.gms.internal.ads.zzgfz zza = null;
    public static final com.google.android.gms.internal.ads.zzgfz zzb = null;
    public static final com.google.android.gms.internal.ads.zzgfz zzc = null;
    public static final java.util.concurrent.ScheduledExecutorService zzd = null;
    public static final com.google.android.gms.internal.ads.zzgfz zze = null;
    public static final com.google.android.gms.internal.ads.zzgfz zzf = null;

    static {
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            java.lang.String r1 = "Default"
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzfum.zza()
            com.google.android.gms.internal.ads.zzcaj r0 = new com.google.android.gms.internal.ads.zzcaj
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            goto La9
        L1a:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkT
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zzb(r0)
            if (r2 == 0) goto L91
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkU
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zzb(r0)
            if (r2 == 0) goto L91
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzkV
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r3.zzb(r2)
            if (r3 == 0) goto L91
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r4.zzb(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r4.zzb(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r6 = r0.intValue()
            r7 = 10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzcaj r11 = new com.google.android.gms.internal.ads.zzcaj
            r11.<init>(r1)
            r4 = r3
            r4.<init>(r5, r6, r7, r9, r10, r11)
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r0.zzb(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.allowCoreThreadTimeOut(r0)
            r0 = r3
            goto La9
        L91:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r5 = 2
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r10 = new java.util.concurrent.SynchronousQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzcaj r11 = new com.google.android.gms.internal.ads.zzcaj
            r11.<init>(r1)
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
        La9:
            com.google.android.gms.internal.ads.zzcam r1 = new com.google.android.gms.internal.ads.zzcam
            r2 = 0
            r1.<init>(r0, r2)
            com.google.android.gms.internal.ads.zzcan.zza = r1
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            java.lang.String r1 = "Loader"
            r3 = 1
            if (r0 == 0) goto Lc9
            com.google.android.gms.internal.ads.zzfuj r0 = com.google.android.gms.internal.ads.zzfum.zza()
            r4 = 5
            com.google.android.gms.internal.ads.zzcaj r5 = new com.google.android.gms.internal.ads.zzcaj
            r5.<init>(r1)
            java.util.concurrent.ExecutorService r0 = r0.zzc(r4, r5, r3)
            goto Le2
        Lc9:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r5 = 5
            r6 = 5
            r7 = 10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzcaj r11 = new com.google.android.gms.internal.ads.zzcaj
            r11.<init>(r1)
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        Le2:
            com.google.android.gms.internal.ads.zzcam r1 = new com.google.android.gms.internal.ads.zzcam
            r1.<init>(r0, r2)
            com.google.android.gms.internal.ads.zzcan.zzb = r1
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            java.lang.String r1 = "Activeview"
            if (r0 == 0) goto Lff
            com.google.android.gms.internal.ads.zzfuj r0 = com.google.android.gms.internal.ads.zzfum.zza()
            com.google.android.gms.internal.ads.zzcaj r4 = new com.google.android.gms.internal.ads.zzcaj
            r4.<init>(r1)
            java.util.concurrent.ExecutorService r0 = r0.zzb(r4, r3)
            goto L118
        Lff:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r5 = 1
            r6 = 1
            r7 = 10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzcaj r11 = new com.google.android.gms.internal.ads.zzcaj
            r11.<init>(r1)
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        L118:
            com.google.android.gms.internal.ads.zzcam r1 = new com.google.android.gms.internal.ads.zzcam
            r1.<init>(r0, r2)
            com.google.android.gms.internal.ads.zzcan.zzc = r1
            com.google.android.gms.internal.ads.zzcai r0 = new com.google.android.gms.internal.ads.zzcai
            r1 = 3
            com.google.android.gms.internal.ads.zzcaj r3 = new com.google.android.gms.internal.ads.zzcaj
            java.lang.String r4 = "Schedule"
            r3.<init>(r4)
            r0.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzcan.zzd = r0
            com.google.android.gms.internal.ads.zzcak r0 = new com.google.android.gms.internal.ads.zzcak
            r0.<init>()
            com.google.android.gms.internal.ads.zzcam r1 = new com.google.android.gms.internal.ads.zzcam
            r1.<init>(r0, r2)
            com.google.android.gms.internal.ads.zzcan.zze = r1
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzggf.zzb()
            com.google.android.gms.internal.ads.zzcam r1 = new com.google.android.gms.internal.ads.zzcam
            r1.<init>(r0, r2)
            com.google.android.gms.internal.ads.zzcan.zzf = r1
            return
    }
}
