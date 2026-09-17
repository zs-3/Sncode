package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzj {
    static final java.util.concurrent.ExecutorService zza = null;

    static {
            com.google.android.gms.internal.common.zzg.zza()
            com.google.android.gms.common.util.concurrent.NamedThreadFactory r7 = new com.google.android.gms.common.util.concurrent.NamedThreadFactory
            java.lang.String r0 = "CallbackExecutor"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r8.allowCoreThreadTimeOut(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r8)
            com.google.android.gms.common.internal.zzj.zza = r0
            return
    }
}
