package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public final class Utils {
    private static final java.util.concurrent.ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = null;

    public static /* synthetic */ java.lang.Object $r8$lambda$0bL0f0NxQXlyUeEtHYKWAvoIwTU(java.util.concurrent.CountDownLatch r0, com.google.android.gms.tasks.Task r1) {
            java.lang.Object r0 = lambda$awaitEvenIfOnMainThread$0(r0, r1)
            return r0
    }

    static {
            java.lang.String r0 = "awaitEvenIfOnMainThread task continuation executor"
            java.util.concurrent.ExecutorService r0 = com.google.firebase.crashlytics.internal.common.ExecutorUtils.buildSingleThreadExecutorService(r0)
            com.google.firebase.crashlytics.internal.common.Utils.TASK_CONTINUATION_EXECUTOR_SERVICE = r0
            return
    }

    @java.lang.Deprecated
    public static <T> T awaitEvenIfOnMainThread(com.google.android.gms.tasks.Task<T> r4) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r1 = com.google.firebase.crashlytics.internal.common.Utils.TASK_CONTINUATION_EXECUTOR_SERVICE
            com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda0 r2 = new com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda0
            r2.<init>(r0)
            r4.continueWith(r1, r2)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 != r2) goto L22
            r1 = 3000(0xbb8, double:1.482E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.await(r1, r3)
            goto L29
        L22:
            r1 = 4000(0xfa0, double:1.9763E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.await(r1, r3)
        L29:
            boolean r0 = r4.isSuccessful()
            if (r0 == 0) goto L34
            java.lang.Object r4 = r4.getResult()
            return r4
        L34:
            boolean r0 = r4.isCanceled()
            if (r0 != 0) goto L50
            boolean r0 = r4.isComplete()
            if (r0 == 0) goto L4a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Exception r4 = r4.getException()
            r0.<init>(r4)
            throw r0
        L4a:
            java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException
            r4.<init>()
            throw r4
        L50:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Task is already canceled"
            r4.<init>(r0)
            throw r4
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch r3, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L22
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r1 = r1 + r4
        La:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            boolean r3 = r3.await(r4, r6)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r4 = r1 - r4
            goto La
        L22:
            r3 = move-exception
            if (r0 == 0) goto L2c
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2c:
            throw r3
    }

    private static /* synthetic */ java.lang.Object lambda$awaitEvenIfOnMainThread$0(java.util.concurrent.CountDownLatch r0, com.google.android.gms.tasks.Task r1) throws java.lang.Exception {
            r0.countDown()
            r0 = 0
            return r0
    }
}
