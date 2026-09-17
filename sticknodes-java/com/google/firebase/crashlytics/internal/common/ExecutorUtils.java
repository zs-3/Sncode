package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public final class ExecutorUtils {



    private static void addDelayedShutdownHook(java.lang.String r3, java.util.concurrent.ExecutorService r4) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 2
            addDelayedShutdownHook(r3, r4, r1, r0)
            return
    }

    @android.annotation.SuppressLint({"ThreadPoolCreation"})
    private static void addDelayedShutdownHook(java.lang.String r9, java.util.concurrent.ExecutorService r10, long r11, java.util.concurrent.TimeUnit r13) {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            java.lang.Thread r1 = new java.lang.Thread
            com.google.firebase.crashlytics.internal.common.ExecutorUtils$2 r8 = new com.google.firebase.crashlytics.internal.common.ExecutorUtils$2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r7)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Crashlytics Shutdown Hook for "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r1.<init>(r8, r9)
            r0.addShutdownHook(r1)
            return
    }

    public static java.util.concurrent.ExecutorService buildSingleThreadExecutorService(java.lang.String r2) {
            java.util.concurrent.ThreadFactory r0 = getNamedThreadFactory(r2)
            java.util.concurrent.ThreadPoolExecutor$DiscardPolicy r1 = new java.util.concurrent.ThreadPoolExecutor$DiscardPolicy
            r1.<init>()
            java.util.concurrent.ExecutorService r0 = newSingleThreadExecutor(r0, r1)
            addDelayedShutdownHook(r2, r0)
            return r0
    }

    public static java.util.concurrent.ThreadFactory getNamedThreadFactory(java.lang.String r3) {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 1
            r0.<init>(r1)
            com.google.firebase.crashlytics.internal.common.ExecutorUtils$1 r1 = new com.google.firebase.crashlytics.internal.common.ExecutorUtils$1
            r1.<init>(r3, r0)
            return r1
    }

    @android.annotation.SuppressLint({"ThreadPoolCreation"})
    private static java.util.concurrent.ExecutorService newSingleThreadExecutor(java.util.concurrent.ThreadFactory r10, java.util.concurrent.RejectedExecutionHandler r11) {
            java.util.concurrent.ThreadPoolExecutor r9 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 0
            r0 = r9
            r7 = r10
            r8 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.unconfigurableExecutorService(r9)
            return r10
    }
}
