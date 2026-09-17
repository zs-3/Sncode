package androidx.work.impl.workers;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends androidx.work.ListenableWorker implements androidx.work.impl.constraints.WorkConstraintsCallback {
    private static final java.lang.String TAG = null;
    volatile boolean mAreConstraintsUnmet;
    private androidx.work.ListenableWorker mDelegate;
    androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> mFuture;
    final java.lang.Object mLock;
    private androidx.work.WorkerParameters mWorkerParameters;



    static {
            java.lang.String r0 = "ConstraintTrkngWrkr"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.workers.ConstraintTrackingWorker.TAG = r0
            return
    }

    public ConstraintTrackingWorker(android.content.Context r1, androidx.work.WorkerParameters r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mWorkerParameters = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            r1 = 0
            r0.mAreConstraintsUnmet = r1
            androidx.work.impl.utils.futures.SettableFuture r1 = androidx.work.impl.utils.futures.SettableFuture.create()
            r0.mFuture = r1
            return
    }

    @Override // androidx.work.ListenableWorker
    public androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
            r1 = this;
            android.content.Context r0 = r1.getApplicationContext()
            androidx.work.impl.WorkManagerImpl r0 = androidx.work.impl.WorkManagerImpl.getInstance(r0)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r0.getWorkTaskExecutor()
            return r0
    }

    public androidx.work.impl.WorkDatabase getWorkDatabase() {
            r1 = this;
            android.content.Context r0 = r1.getApplicationContext()
            androidx.work.impl.WorkManagerImpl r0 = androidx.work.impl.WorkManagerImpl.getInstance(r0)
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            return r0
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
            r1 = this;
            androidx.work.ListenableWorker r0 = r1.mDelegate
            if (r0 == 0) goto Lc
            boolean r0 = r0.isRunInForeground()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(java.util.List<java.lang.String> r1) {
            r0 = this;
            return
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(java.util.List<java.lang.String> r7) {
            r6 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.workers.ConstraintTrackingWorker.TAG
            java.lang.String r2 = "Constraints changed for %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r7
            java.lang.String r7 = java.lang.String.format(r2, r4)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r5]
            r0.debug(r1, r7, r2)
            java.lang.Object r7 = r6.mLock
            monitor-enter(r7)
            r6.mAreConstraintsUnmet = r3     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
            r1 = this;
            super.onStopped()
            androidx.work.ListenableWorker r0 = r1.mDelegate
            if (r0 == 0) goto L12
            boolean r0 = r0.isStopped()
            if (r0 != 0) goto L12
            androidx.work.ListenableWorker r0 = r1.mDelegate
            r0.stop()
        L12:
            return
    }

    void setFutureFailed() {
            r2 = this;
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r2.mFuture
            androidx.work.ListenableWorker$Result r1 = androidx.work.ListenableWorker.Result.failure()
            r0.set(r1)
            return
    }

    void setFutureRetry() {
            r2 = this;
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r2.mFuture
            androidx.work.ListenableWorker$Result r1 = androidx.work.ListenableWorker.Result.retry()
            r0.set(r1)
            return
    }

    void setupAndRunConstraintTrackingWork() {
            r8 = this;
            androidx.work.Data r0 = r8.getInputData()
            java.lang.String r1 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.lang.String r0 = r0.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L22
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.workers.ConstraintTrackingWorker.TAG
            java.lang.String r3 = "No worker to delegate to."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.error(r1, r3, r2)
            r8.setFutureFailed()
            return
        L22:
            androidx.work.WorkerFactory r1 = r8.getWorkerFactory()
            android.content.Context r3 = r8.getApplicationContext()
            androidx.work.WorkerParameters r4 = r8.mWorkerParameters
            androidx.work.ListenableWorker r1 = r1.createWorkerWithDefaultFallback(r3, r0, r4)
            r8.mDelegate = r1
            if (r1 != 0) goto L45
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.workers.ConstraintTrackingWorker.TAG
            java.lang.String r3 = "No worker to delegate to."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.debug(r1, r3, r2)
            r8.setFutureFailed()
            return
        L45:
            androidx.work.impl.WorkDatabase r1 = r8.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r1 = r1.workSpecDao()
            java.util.UUID r3 = r8.getId()
            java.lang.String r3 = r3.toString()
            androidx.work.impl.model.WorkSpec r1 = r1.getWorkSpec(r3)
            if (r1 != 0) goto L5f
            r8.setFutureFailed()
            return
        L5f:
            androidx.work.impl.constraints.WorkConstraintsTracker r3 = new androidx.work.impl.constraints.WorkConstraintsTracker
            android.content.Context r4 = r8.getApplicationContext()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r5 = r8.getTaskExecutor()
            r3.<init>(r4, r5, r8)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r3.replace(r1)
            java.util.UUID r1 = r8.getId()
            java.lang.String r1 = r1.toString()
            boolean r1 = r3.areAllConstraintsMet(r1)
            r3 = 1
            if (r1 == 0) goto Le0
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.workers.ConstraintTrackingWorker.TAG
            java.lang.String r5 = "Constraints met for delegate %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r0
            java.lang.String r5 = java.lang.String.format(r5, r6)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r2]
            r1.debug(r4, r5, r6)
            androidx.work.ListenableWorker r1 = r8.mDelegate     // Catch: java.lang.Throwable -> Laa
            com.google.common.util.concurrent.ListenableFuture r1 = r1.startWork()     // Catch: java.lang.Throwable -> Laa
            androidx.work.impl.workers.ConstraintTrackingWorker$2 r4 = new androidx.work.impl.workers.ConstraintTrackingWorker$2     // Catch: java.lang.Throwable -> Laa
            r4.<init>(r8, r1)     // Catch: java.lang.Throwable -> Laa
            java.util.concurrent.Executor r5 = r8.getBackgroundExecutor()     // Catch: java.lang.Throwable -> Laa
            r1.addListener(r4, r5)     // Catch: java.lang.Throwable -> Laa
            goto Lf8
        Laa:
            r1 = move-exception
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = androidx.work.impl.workers.ConstraintTrackingWorker.TAG
            java.lang.String r6 = "Delegated worker %s threw exception in startWork."
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r0
            java.lang.String r0 = java.lang.String.format(r6, r7)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r3[r2] = r1
            r4.debug(r5, r0, r3)
            java.lang.Object r1 = r8.mLock
            monitor-enter(r1)
            boolean r0 = r8.mAreConstraintsUnmet     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto Ld8
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r3 = "Constraints were unmet, Retrying."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Ldd
            r0.debug(r5, r3, r2)     // Catch: java.lang.Throwable -> Ldd
            r8.setFutureRetry()     // Catch: java.lang.Throwable -> Ldd
            goto Ldb
        Ld8:
            r8.setFutureFailed()     // Catch: java.lang.Throwable -> Ldd
        Ldb:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ldd
            goto Lf8
        Ldd:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ldd
            throw r0
        Le0:
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.workers.ConstraintTrackingWorker.TAG
            java.lang.String r5 = "Constraints not met for delegate %s. Requesting retry."
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            java.lang.String r0 = java.lang.String.format(r5, r3)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r1.debug(r4, r0, r2)
            r8.setFutureRetry()
        Lf8:
            return
    }

    @Override // androidx.work.ListenableWorker
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.getBackgroundExecutor()
            androidx.work.impl.workers.ConstraintTrackingWorker$1 r1 = new androidx.work.impl.workers.ConstraintTrackingWorker$1
            r1.<init>(r2)
            r0.execute(r1)
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r2.mFuture
            return r0
    }
}
