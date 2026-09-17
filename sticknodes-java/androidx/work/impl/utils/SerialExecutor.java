package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class SerialExecutor implements java.util.concurrent.Executor {
    private volatile java.lang.Runnable mActive;
    private final java.util.concurrent.Executor mExecutor;
    private final java.lang.Object mLock;
    private final java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutor.Task> mTasks;

    static class Task implements java.lang.Runnable {
        final java.lang.Runnable mRunnable;
        final androidx.work.impl.utils.SerialExecutor mSerialExecutor;

        Task(androidx.work.impl.utils.SerialExecutor r1, java.lang.Runnable r2) {
                r0 = this;
                r0.<init>()
                r0.mSerialExecutor = r1
                r0.mRunnable = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Runnable r0 = r2.mRunnable     // Catch: java.lang.Throwable -> Lb
                r0.run()     // Catch: java.lang.Throwable -> Lb
                androidx.work.impl.utils.SerialExecutor r0 = r2.mSerialExecutor
                r0.scheduleNext()
                return
            Lb:
                r0 = move-exception
                androidx.work.impl.utils.SerialExecutor r1 = r2.mSerialExecutor
                r1.scheduleNext()
                throw r0
        }
    }

    public SerialExecutor(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.mExecutor = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.mTasks = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutor$Task> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L16
            androidx.work.impl.utils.SerialExecutor$Task r2 = new androidx.work.impl.utils.SerialExecutor$Task     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
            r1.add(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Runnable r4 = r3.mActive     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L14
            r3.scheduleNext()     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
    }

    public boolean hasPendingTasks() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutor$Task> r1 = r2.mTasks     // Catch: java.lang.Throwable -> L10
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    void scheduleNext() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutor$Task> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L18
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L18
            r3.mActive = r1     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L16
            java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L18
            java.lang.Runnable r2 = r3.mActive     // Catch: java.lang.Throwable -> L18
            r1.execute(r2)     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }
}
