package androidx.room;

/* loaded from: classes.dex */
class TransactionExecutor implements java.util.concurrent.Executor {
    private java.lang.Runnable mActive;
    private final java.util.concurrent.Executor mExecutor;
    private final java.util.ArrayDeque<java.lang.Runnable> mTasks;


    TransactionExecutor(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.mTasks = r0
            r1.mExecutor = r2
            return
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(java.lang.Runnable r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<java.lang.Runnable> r0 = r2.mTasks     // Catch: java.lang.Throwable -> L14
            androidx.room.TransactionExecutor$1 r1 = new androidx.room.TransactionExecutor$1     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L14
            r0.offer(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.Runnable r3 = r2.mActive     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto L12
            r2.scheduleNext()     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    synchronized void scheduleNext() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<java.lang.Runnable> r0 = r2.mTasks     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L14
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L14
            r2.mActive = r0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L12
            java.util.concurrent.Executor r1 = r2.mExecutor     // Catch: java.lang.Throwable -> L14
            r1.execute(r0)     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r2)
            return
        L14:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
