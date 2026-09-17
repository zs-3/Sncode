package com.google.firebase.crashlytics.internal.concurrency;

/* loaded from: classes2.dex */
public class CrashlyticsWorker implements java.util.concurrent.Executor {
    private final java.util.concurrent.ExecutorService executor;
    private com.google.android.gms.tasks.Task<?> tail;
    private final java.lang.Object tailLock;

    public static /* synthetic */ com.google.android.gms.tasks.Task $r8$lambda$4Kmu74Qq6WlO30039luZWY8Y5mA(java.lang.Runnable r0, com.google.android.gms.tasks.Task r1) {
            com.google.android.gms.tasks.Task r0 = lambda$submit$1(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.android.gms.tasks.Task $r8$lambda$7BMQhXh6Z9JeYsLAWe8_u2nsbHk(java.util.concurrent.Callable r0, com.google.android.gms.tasks.Task r1) {
            com.google.android.gms.tasks.Task r0 = lambda$submitTask$2(r0, r1)
            return r0
    }

    CrashlyticsWorker(java.util.concurrent.ExecutorService r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.tailLock = r0
            r0 = 0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)
            r1.tail = r0
            r1.executor = r2
            return
    }

    private static /* synthetic */ com.google.android.gms.tasks.Task lambda$submit$1(java.lang.Runnable r0, com.google.android.gms.tasks.Task r1) throws java.lang.Exception {
            r0.run()
            r0 = 0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)
            return r0
    }

    private static /* synthetic */ com.google.android.gms.tasks.Task lambda$submitTask$2(java.util.concurrent.Callable r0, com.google.android.gms.tasks.Task r1) throws java.lang.Exception {
            java.lang.Object r0 = r0.call()
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.executor
            r0.execute(r2)
            return
    }

    public java.util.concurrent.ExecutorService getExecutor() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.executor
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> submit(java.lang.Runnable r5) {
            r4 = this;
            java.lang.Object r0 = r4.tailLock
            monitor-enter(r0)
            com.google.android.gms.tasks.Task<?> r1 = r4.tail     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ExecutorService r2 = r4.executor     // Catch: java.lang.Throwable -> L14
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda0 r3 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L14
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.tasks.Task r5 = r1.continueWithTask(r2, r3)     // Catch: java.lang.Throwable -> L14
            r4.tail = r5     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r5
        L14:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public <T> com.google.android.gms.tasks.Task<T> submitTask(java.util.concurrent.Callable<com.google.android.gms.tasks.Task<T>> r5) {
            r4 = this;
            java.lang.Object r0 = r4.tailLock
            monitor-enter(r0)
            com.google.android.gms.tasks.Task<?> r1 = r4.tail     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ExecutorService r2 = r4.executor     // Catch: java.lang.Throwable -> L14
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda1 r3 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L14
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.tasks.Task r5 = r1.continueWithTask(r2, r3)     // Catch: java.lang.Throwable -> L14
            r4.tail = r5     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r5
        L14:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r5
    }
}
