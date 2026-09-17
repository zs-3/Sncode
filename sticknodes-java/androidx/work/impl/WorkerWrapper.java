package androidx.work.impl;

/* loaded from: classes.dex */
public class WorkerWrapper implements java.lang.Runnable {
    static final java.lang.String TAG = null;
    android.content.Context mAppContext;
    private androidx.work.Configuration mConfiguration;
    private androidx.work.impl.model.DependencyDao mDependencyDao;
    private androidx.work.impl.foreground.ForegroundProcessor mForegroundProcessor;
    androidx.work.impl.utils.futures.SettableFuture<java.lang.Boolean> mFuture;
    com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> mInnerFuture;
    private volatile boolean mInterrupted;
    androidx.work.ListenableWorker.Result mResult;
    private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
    private java.util.List<androidx.work.impl.Scheduler> mSchedulers;
    private java.util.List<java.lang.String> mTags;
    private androidx.work.impl.WorkDatabase mWorkDatabase;
    private java.lang.String mWorkDescription;
    androidx.work.impl.model.WorkSpec mWorkSpec;
    private androidx.work.impl.model.WorkSpecDao mWorkSpecDao;
    private java.lang.String mWorkSpecId;
    private androidx.work.impl.model.WorkTagDao mWorkTagDao;
    androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;
    androidx.work.ListenableWorker mWorker;



    public static class Builder {
        android.content.Context mAppContext;
        androidx.work.Configuration mConfiguration;
        androidx.work.impl.foreground.ForegroundProcessor mForegroundProcessor;
        androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
        java.util.List<androidx.work.impl.Scheduler> mSchedulers;
        androidx.work.impl.WorkDatabase mWorkDatabase;
        java.lang.String mWorkSpecId;
        androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;
        androidx.work.ListenableWorker mWorker;

        public Builder(android.content.Context r2, androidx.work.Configuration r3, androidx.work.impl.utils.taskexecutor.TaskExecutor r4, androidx.work.impl.foreground.ForegroundProcessor r5, androidx.work.impl.WorkDatabase r6, java.lang.String r7) {
                r1 = this;
                r1.<init>()
                androidx.work.WorkerParameters$RuntimeExtras r0 = new androidx.work.WorkerParameters$RuntimeExtras
                r0.<init>()
                r1.mRuntimeExtras = r0
                android.content.Context r2 = r2.getApplicationContext()
                r1.mAppContext = r2
                r1.mWorkTaskExecutor = r4
                r1.mForegroundProcessor = r5
                r1.mConfiguration = r3
                r1.mWorkDatabase = r6
                r1.mWorkSpecId = r7
                return
        }

        public androidx.work.impl.WorkerWrapper build() {
                r1 = this;
                androidx.work.impl.WorkerWrapper r0 = new androidx.work.impl.WorkerWrapper
                r0.<init>(r1)
                return r0
        }

        public androidx.work.impl.WorkerWrapper.Builder withRuntimeExtras(androidx.work.WorkerParameters.RuntimeExtras r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r0.mRuntimeExtras = r1
            L4:
                return r0
        }

        public androidx.work.impl.WorkerWrapper.Builder withSchedulers(java.util.List<androidx.work.impl.Scheduler> r1) {
                r0 = this;
                r0.mSchedulers = r1
                return r0
        }
    }

    static {
            java.lang.String r0 = "WorkerWrapper"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.WorkerWrapper.TAG = r0
            return
    }

    WorkerWrapper(androidx.work.impl.WorkerWrapper.Builder r2) {
            r1 = this;
            r1.<init>()
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.failure()
            r1.mResult = r0
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            r1.mFuture = r0
            r0 = 0
            r1.mInnerFuture = r0
            android.content.Context r0 = r2.mAppContext
            r1.mAppContext = r0
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r2.mWorkTaskExecutor
            r1.mWorkTaskExecutor = r0
            androidx.work.impl.foreground.ForegroundProcessor r0 = r2.mForegroundProcessor
            r1.mForegroundProcessor = r0
            java.lang.String r0 = r2.mWorkSpecId
            r1.mWorkSpecId = r0
            java.util.List<androidx.work.impl.Scheduler> r0 = r2.mSchedulers
            r1.mSchedulers = r0
            androidx.work.WorkerParameters$RuntimeExtras r0 = r2.mRuntimeExtras
            r1.mRuntimeExtras = r0
            androidx.work.ListenableWorker r0 = r2.mWorker
            r1.mWorker = r0
            androidx.work.Configuration r0 = r2.mConfiguration
            r1.mConfiguration = r0
            androidx.work.impl.WorkDatabase r2 = r2.mWorkDatabase
            r1.mWorkDatabase = r2
            androidx.work.impl.model.WorkSpecDao r2 = r2.workSpecDao()
            r1.mWorkSpecDao = r2
            androidx.work.impl.WorkDatabase r2 = r1.mWorkDatabase
            androidx.work.impl.model.DependencyDao r2 = r2.dependencyDao()
            r1.mDependencyDao = r2
            androidx.work.impl.WorkDatabase r2 = r1.mWorkDatabase
            androidx.work.impl.model.WorkTagDao r2 = r2.workTagDao()
            r1.mWorkTagDao = r2
            return
    }

    private java.lang.String createWorkDescription(java.util.List<java.lang.String> r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Work [ id="
            r0.<init>(r1)
            java.lang.String r1 = r4.mWorkSpecId
            r0.append(r1)
            java.lang.String r1 = ", tags={ "
            r0.append(r1)
            java.util.Iterator r5 = r5.iterator()
            r1 = 1
        L16:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r1 == 0) goto L26
            r1 = 0
            goto L2b
        L26:
            java.lang.String r3 = ", "
            r0.append(r3)
        L2b:
            r0.append(r2)
            goto L16
        L2f:
            java.lang.String r5 = " } ]"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    private void handleResult(androidx.work.ListenableWorker.Result r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.work.ListenableWorker.Result.Success
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.WorkerWrapper.TAG
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r4.mWorkDescription
            r1[r2] = r3
            java.lang.String r3 = "Worker result SUCCESS for %s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r5.info(r0, r1, r2)
            androidx.work.impl.model.WorkSpec r5 = r4.mWorkSpec
            boolean r5 = r5.isPeriodic()
            if (r5 == 0) goto L29
            r4.resetPeriodicAndResolve()
            goto L72
        L29:
            r4.setSucceededAndResolve()
            goto L72
        L2d:
            boolean r5 = r5 instanceof androidx.work.ListenableWorker.Result.Retry
            if (r5 == 0) goto L4c
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.WorkerWrapper.TAG
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r4.mWorkDescription
            r1[r2] = r3
            java.lang.String r3 = "Worker result RETRY for %s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r5.info(r0, r1, r2)
            r4.rescheduleAndResolve()
            goto L72
        L4c:
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.WorkerWrapper.TAG
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r4.mWorkDescription
            r1[r2] = r3
            java.lang.String r3 = "Worker result FAILURE for %s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r5.info(r0, r1, r2)
            androidx.work.impl.model.WorkSpec r5 = r4.mWorkSpec
            boolean r5 = r5.isPeriodic()
            if (r5 == 0) goto L6f
            r4.resetPeriodicAndResolve()
            goto L72
        L6f:
            r4.setFailedAndResolve()
        L72:
            return
    }

    private void iterativelyFailWorkAndDependents(java.lang.String r6) {
            r5 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.add(r6)
        L8:
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L35
            java.lang.Object r6 = r0.remove()
            java.lang.String r6 = (java.lang.String) r6
            androidx.work.impl.model.WorkSpecDao r1 = r5.mWorkSpecDao
            androidx.work.WorkInfo$State r1 = r1.getState(r6)
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.CANCELLED
            if (r1 == r2) goto L2b
            androidx.work.impl.model.WorkSpecDao r1 = r5.mWorkSpecDao
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.FAILED
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r3[r4] = r6
            r1.setState(r2, r3)
        L2b:
            androidx.work.impl.model.DependencyDao r1 = r5.mDependencyDao
            java.util.List r6 = r1.getDependentWorkIds(r6)
            r0.addAll(r6)
            goto L8
        L35:
            return
    }

    private void rescheduleAndResolve() {
            r6 = this;
            androidx.work.impl.WorkDatabase r0 = r6.mWorkDatabase
            r0.beginTransaction()
            r0 = 1
            androidx.work.impl.model.WorkSpecDao r1 = r6.mWorkSpecDao     // Catch: java.lang.Throwable -> L36
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L36
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L36
            r4 = 0
            java.lang.String r5 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L36
            r3[r4] = r5     // Catch: java.lang.Throwable -> L36
            r1.setState(r2, r3)     // Catch: java.lang.Throwable -> L36
            androidx.work.impl.model.WorkSpecDao r1 = r6.mWorkSpecDao     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L36
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L36
            r1.setPeriodStartTime(r2, r3)     // Catch: java.lang.Throwable -> L36
            androidx.work.impl.model.WorkSpecDao r1 = r6.mWorkSpecDao     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L36
            r3 = -1
            r1.markWorkSpecScheduled(r2, r3)     // Catch: java.lang.Throwable -> L36
            androidx.work.impl.WorkDatabase r1 = r6.mWorkDatabase     // Catch: java.lang.Throwable -> L36
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L36
            androidx.work.impl.WorkDatabase r1 = r6.mWorkDatabase
            r1.endTransaction()
            r6.resolve(r0)
            return
        L36:
            r1 = move-exception
            androidx.work.impl.WorkDatabase r2 = r6.mWorkDatabase
            r2.endTransaction()
            r6.resolve(r0)
            throw r1
    }

    private void resetPeriodicAndResolve() {
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.mWorkDatabase
            r0.beginTransaction()
            r0 = 0
            androidx.work.impl.model.WorkSpecDao r1 = r5.mWorkSpecDao     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = r5.mWorkSpecId     // Catch: java.lang.Throwable -> L3d
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3d
            r1.setPeriodStartTime(r2, r3)     // Catch: java.lang.Throwable -> L3d
            androidx.work.impl.model.WorkSpecDao r1 = r5.mWorkSpecDao     // Catch: java.lang.Throwable -> L3d
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L3d
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r5.mWorkSpecId     // Catch: java.lang.Throwable -> L3d
            r3[r0] = r4     // Catch: java.lang.Throwable -> L3d
            r1.setState(r2, r3)     // Catch: java.lang.Throwable -> L3d
            androidx.work.impl.model.WorkSpecDao r1 = r5.mWorkSpecDao     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = r5.mWorkSpecId     // Catch: java.lang.Throwable -> L3d
            r1.resetWorkSpecRunAttemptCount(r2)     // Catch: java.lang.Throwable -> L3d
            androidx.work.impl.model.WorkSpecDao r1 = r5.mWorkSpecDao     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = r5.mWorkSpecId     // Catch: java.lang.Throwable -> L3d
            r3 = -1
            r1.markWorkSpecScheduled(r2, r3)     // Catch: java.lang.Throwable -> L3d
            androidx.work.impl.WorkDatabase r1 = r5.mWorkDatabase     // Catch: java.lang.Throwable -> L3d
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3d
            androidx.work.impl.WorkDatabase r1 = r5.mWorkDatabase
            r1.endTransaction()
            r5.resolve(r0)
            return
        L3d:
            r1 = move-exception
            androidx.work.impl.WorkDatabase r2 = r5.mWorkDatabase
            r2.endTransaction()
            r5.resolve(r0)
            throw r1
    }

    private void resolve(boolean r6) {
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.mWorkDatabase
            r0.beginTransaction()
            androidx.work.impl.WorkDatabase r0 = r5.mWorkDatabase     // Catch: java.lang.Throwable -> L5b
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r0.hasUnfinishedWork()     // Catch: java.lang.Throwable -> L5b
            r1 = 0
            if (r0 != 0) goto L19
            android.content.Context r0 = r5.mAppContext     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(r0, r2, r1)     // Catch: java.lang.Throwable -> L5b
        L19:
            if (r6 == 0) goto L32
            androidx.work.impl.model.WorkSpecDao r0 = r5.mWorkSpecDao     // Catch: java.lang.Throwable -> L5b
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L5b
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r5.mWorkSpecId     // Catch: java.lang.Throwable -> L5b
            r3[r1] = r4     // Catch: java.lang.Throwable -> L5b
            r0.setState(r2, r3)     // Catch: java.lang.Throwable -> L5b
            androidx.work.impl.model.WorkSpecDao r0 = r5.mWorkSpecDao     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r5.mWorkSpecId     // Catch: java.lang.Throwable -> L5b
            r2 = -1
            r0.markWorkSpecScheduled(r1, r2)     // Catch: java.lang.Throwable -> L5b
        L32:
            androidx.work.impl.model.WorkSpec r0 = r5.mWorkSpec     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L47
            androidx.work.ListenableWorker r0 = r5.mWorker     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L47
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L47
            androidx.work.impl.foreground.ForegroundProcessor r0 = r5.mForegroundProcessor     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r5.mWorkSpecId     // Catch: java.lang.Throwable -> L5b
            r0.stopForeground(r1)     // Catch: java.lang.Throwable -> L5b
        L47:
            androidx.work.impl.WorkDatabase r0 = r5.mWorkDatabase     // Catch: java.lang.Throwable -> L5b
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L5b
            androidx.work.impl.WorkDatabase r0 = r5.mWorkDatabase
            r0.endTransaction()
            androidx.work.impl.utils.futures.SettableFuture<java.lang.Boolean> r0 = r5.mFuture
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.set(r6)
            return
        L5b:
            r6 = move-exception
            androidx.work.impl.WorkDatabase r0 = r5.mWorkDatabase
            r0.endTransaction()
            throw r6
    }

    private void resolveIncorrectStatus() {
            r7 = this;
            androidx.work.impl.model.WorkSpecDao r0 = r7.mWorkSpecDao
            java.lang.String r1 = r7.mWorkSpecId
            androidx.work.WorkInfo$State r0 = r0.getState(r1)
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.RUNNING
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L29
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.WorkerWrapper.TAG
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r7.mWorkSpecId
            r4[r3] = r5
            java.lang.String r5 = "Status for %s is RUNNING;not doing any work and rescheduling for later execution"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r0.debug(r1, r4, r3)
            r7.resolve(r2)
            goto L46
        L29:
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.WorkerWrapper.TAG
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r7.mWorkSpecId
            r5[r3] = r6
            r5[r2] = r0
            java.lang.String r0 = "Status for %s is %s; not doing any work"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r1.debug(r4, r0, r2)
            r7.resolve(r3)
        L46:
            return
    }

    private void runWorker() {
            r16 = this;
            r1 = r16
            boolean r0 = r16.tryCheckForInterruptionAndResolve()
            if (r0 == 0) goto L9
            return
        L9:
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase
            r0.beginTransaction()
            androidx.work.impl.model.WorkSpecDao r0 = r1.mWorkSpecDao     // Catch: java.lang.Throwable -> L209
            java.lang.String r2 = r1.mWorkSpecId     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.model.WorkSpec r0 = r0.getWorkSpec(r2)     // Catch: java.lang.Throwable -> L209
            r1.mWorkSpec = r0     // Catch: java.lang.Throwable -> L209
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L41
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L209
            java.lang.String r4 = androidx.work.impl.WorkerWrapper.TAG     // Catch: java.lang.Throwable -> L209
            java.lang.String r5 = "Didn't find WorkSpec for id %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L209
            java.lang.String r6 = r1.mWorkSpecId     // Catch: java.lang.Throwable -> L209
            r2[r3] = r6     // Catch: java.lang.Throwable -> L209
            java.lang.String r2 = java.lang.String.format(r5, r2)     // Catch: java.lang.Throwable -> L209
            java.lang.Throwable[] r5 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L209
            r0.error(r4, r2, r5)     // Catch: java.lang.Throwable -> L209
            r1.resolve(r3)     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase     // Catch: java.lang.Throwable -> L209
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase
            r0.endTransaction()
            return
        L41:
            androidx.work.WorkInfo$State r4 = r0.state     // Catch: java.lang.Throwable -> L209
            androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L209
            if (r4 == r5) goto L6e
            r16.resolveIncorrectStatus()     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase     // Catch: java.lang.Throwable -> L209
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L209
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L209
            java.lang.String r4 = androidx.work.impl.WorkerWrapper.TAG     // Catch: java.lang.Throwable -> L209
            java.lang.String r5 = "%s is not in ENQUEUED state. Nothing more to do."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.model.WorkSpec r6 = r1.mWorkSpec     // Catch: java.lang.Throwable -> L209
            java.lang.String r6 = r6.workerClassName     // Catch: java.lang.Throwable -> L209
            r2[r3] = r6     // Catch: java.lang.Throwable -> L209
            java.lang.String r2 = java.lang.String.format(r5, r2)     // Catch: java.lang.Throwable -> L209
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L209
            r0.debug(r4, r2, r3)     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase
            r0.endTransaction()
            return
        L6e:
            boolean r0 = r0.isPeriodic()     // Catch: java.lang.Throwable -> L209
            if (r0 != 0) goto L7c
            androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec     // Catch: java.lang.Throwable -> L209
            boolean r0 = r0.isBackedOff()     // Catch: java.lang.Throwable -> L209
            if (r0 == 0) goto Lbe
        L7c:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec     // Catch: java.lang.Throwable -> L209
            long r6 = r0.periodStartTime     // Catch: java.lang.Throwable -> L209
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L8c
            r6 = 1
            goto L8d
        L8c:
            r6 = 0
        L8d:
            if (r6 != 0) goto Lbe
            long r6 = r0.calculateNextRunTime()     // Catch: java.lang.Throwable -> L209
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lbe
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L209
            java.lang.String r4 = androidx.work.impl.WorkerWrapper.TAG     // Catch: java.lang.Throwable -> L209
            java.lang.String r5 = "Delaying execution for %s because it is being executed before schedule."
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.model.WorkSpec r7 = r1.mWorkSpec     // Catch: java.lang.Throwable -> L209
            java.lang.String r7 = r7.workerClassName     // Catch: java.lang.Throwable -> L209
            r6[r3] = r7     // Catch: java.lang.Throwable -> L209
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L209
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L209
            r0.debug(r4, r5, r3)     // Catch: java.lang.Throwable -> L209
            r1.resolve(r2)     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase     // Catch: java.lang.Throwable -> L209
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase
            r0.endTransaction()
            return
        Lbe:
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase     // Catch: java.lang.Throwable -> L209
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L209
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase
            r0.endTransaction()
            androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
            boolean r0 = r0.isPeriodic()
            if (r0 == 0) goto Ld6
            androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
            androidx.work.Data r0 = r0.input
        Ld4:
            r6 = r0
            goto L11f
        Ld6:
            androidx.work.Configuration r0 = r1.mConfiguration
            androidx.work.InputMergerFactory r0 = r0.getInputMergerFactory()
            androidx.work.impl.model.WorkSpec r4 = r1.mWorkSpec
            java.lang.String r4 = r4.inputMergerClassName
            androidx.work.InputMerger r0 = r0.createInputMergerWithDefaultFallback(r4)
            if (r0 != 0) goto L103
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.WorkerWrapper.TAG
            java.lang.Object[] r2 = new java.lang.Object[r2]
            androidx.work.impl.model.WorkSpec r5 = r1.mWorkSpec
            java.lang.String r5 = r5.inputMergerClassName
            r2[r3] = r5
            java.lang.String r5 = "Could not create Input Merger %s"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r0.error(r4, r2, r3)
            r16.setFailedAndResolve()
            return
        L103:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            androidx.work.impl.model.WorkSpec r5 = r1.mWorkSpec
            androidx.work.Data r5 = r5.input
            r4.add(r5)
            androidx.work.impl.model.WorkSpecDao r5 = r1.mWorkSpecDao
            java.lang.String r6 = r1.mWorkSpecId
            java.util.List r5 = r5.getInputsFromPrerequisites(r6)
            r4.addAll(r5)
            androidx.work.Data r0 = r0.merge(r4)
            goto Ld4
        L11f:
            androidx.work.WorkerParameters r0 = new androidx.work.WorkerParameters
            java.lang.String r4 = r1.mWorkSpecId
            java.util.UUID r5 = java.util.UUID.fromString(r4)
            java.util.List<java.lang.String> r7 = r1.mTags
            androidx.work.WorkerParameters$RuntimeExtras r8 = r1.mRuntimeExtras
            androidx.work.impl.model.WorkSpec r4 = r1.mWorkSpec
            int r9 = r4.runAttemptCount
            androidx.work.Configuration r4 = r1.mConfiguration
            java.util.concurrent.Executor r10 = r4.getExecutor()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r11 = r1.mWorkTaskExecutor
            androidx.work.Configuration r4 = r1.mConfiguration
            androidx.work.WorkerFactory r12 = r4.getWorkerFactory()
            androidx.work.impl.utils.WorkProgressUpdater r13 = new androidx.work.impl.utils.WorkProgressUpdater
            androidx.work.impl.WorkDatabase r4 = r1.mWorkDatabase
            androidx.work.impl.utils.taskexecutor.TaskExecutor r14 = r1.mWorkTaskExecutor
            r13.<init>(r4, r14)
            androidx.work.impl.utils.WorkForegroundUpdater r14 = new androidx.work.impl.utils.WorkForegroundUpdater
            androidx.work.impl.WorkDatabase r4 = r1.mWorkDatabase
            androidx.work.impl.foreground.ForegroundProcessor r15 = r1.mForegroundProcessor
            androidx.work.impl.utils.taskexecutor.TaskExecutor r3 = r1.mWorkTaskExecutor
            r14.<init>(r4, r15, r3)
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            androidx.work.ListenableWorker r3 = r1.mWorker
            if (r3 != 0) goto L16b
            androidx.work.Configuration r3 = r1.mConfiguration
            androidx.work.WorkerFactory r3 = r3.getWorkerFactory()
            android.content.Context r4 = r1.mAppContext
            androidx.work.impl.model.WorkSpec r5 = r1.mWorkSpec
            java.lang.String r5 = r5.workerClassName
            androidx.work.ListenableWorker r3 = r3.createWorkerWithDefaultFallback(r4, r5, r0)
            r1.mWorker = r3
        L16b:
            androidx.work.ListenableWorker r3 = r1.mWorker
            if (r3 != 0) goto L18d
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.WorkerWrapper.TAG
            java.lang.Object[] r2 = new java.lang.Object[r2]
            androidx.work.impl.model.WorkSpec r4 = r1.mWorkSpec
            java.lang.String r4 = r4.workerClassName
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "Could not create Worker %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]
            r0.error(r3, r2, r4)
            r16.setFailedAndResolve()
            return
        L18d:
            r5 = 0
            boolean r3 = r3.isUsed()
            if (r3 == 0) goto L1b1
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.WorkerWrapper.TAG
            java.lang.Object[] r2 = new java.lang.Object[r2]
            androidx.work.impl.model.WorkSpec r4 = r1.mWorkSpec
            java.lang.String r4 = r4.workerClassName
            r2[r5] = r4
            java.lang.String r4 = "Received an already-used Worker %s; WorkerFactory should return new instances"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]
            r0.error(r3, r2, r4)
            r16.setFailedAndResolve()
            return
        L1b1:
            androidx.work.ListenableWorker r2 = r1.mWorker
            r2.setUsed()
            boolean r2 = r16.trySetRunning()
            if (r2 == 0) goto L205
            boolean r2 = r16.tryCheckForInterruptionAndResolve()
            if (r2 == 0) goto L1c3
            return
        L1c3:
            androidx.work.impl.utils.futures.SettableFuture r2 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.impl.utils.WorkForegroundRunnable r9 = new androidx.work.impl.utils.WorkForegroundRunnable
            android.content.Context r4 = r1.mAppContext
            androidx.work.impl.model.WorkSpec r5 = r1.mWorkSpec
            androidx.work.ListenableWorker r6 = r1.mWorker
            androidx.work.ForegroundUpdater r7 = r0.getForegroundUpdater()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r8 = r1.mWorkTaskExecutor
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            java.util.concurrent.Executor r0 = r0.getMainThreadExecutor()
            r0.execute(r9)
            com.google.common.util.concurrent.ListenableFuture r0 = r9.getFuture()
            androidx.work.impl.WorkerWrapper$1 r3 = new androidx.work.impl.WorkerWrapper$1
            r3.<init>(r1, r0, r2)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r4 = r1.mWorkTaskExecutor
            java.util.concurrent.Executor r4 = r4.getMainThreadExecutor()
            r0.addListener(r3, r4)
            java.lang.String r0 = r1.mWorkDescription
            androidx.work.impl.WorkerWrapper$2 r3 = new androidx.work.impl.WorkerWrapper$2
            r3.<init>(r1, r2, r0)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()
            r2.addListener(r3, r0)
            goto L208
        L205:
            r16.resolveIncorrectStatus()
        L208:
            return
        L209:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r2 = r1.mWorkDatabase
            r2.endTransaction()
            throw r0
    }

    private void setSucceededAndResolve() {
            r10 = this;
            androidx.work.impl.WorkDatabase r0 = r10.mWorkDatabase
            r0.beginTransaction()
            r0 = 0
            androidx.work.impl.model.WorkSpecDao r1 = r10.mWorkSpecDao     // Catch: java.lang.Throwable -> L85
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.SUCCEEDED     // Catch: java.lang.Throwable -> L85
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r10.mWorkSpecId     // Catch: java.lang.Throwable -> L85
            r4[r0] = r5     // Catch: java.lang.Throwable -> L85
            r1.setState(r2, r4)     // Catch: java.lang.Throwable -> L85
            androidx.work.ListenableWorker$Result r1 = r10.mResult     // Catch: java.lang.Throwable -> L85
            androidx.work.ListenableWorker$Result$Success r1 = (androidx.work.ListenableWorker.Result.Success) r1     // Catch: java.lang.Throwable -> L85
            androidx.work.Data r1 = r1.getOutputData()     // Catch: java.lang.Throwable -> L85
            androidx.work.impl.model.WorkSpecDao r2 = r10.mWorkSpecDao     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = r10.mWorkSpecId     // Catch: java.lang.Throwable -> L85
            r2.setOutput(r4, r1)     // Catch: java.lang.Throwable -> L85
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L85
            androidx.work.impl.model.DependencyDao r4 = r10.mDependencyDao     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r10.mWorkSpecId     // Catch: java.lang.Throwable -> L85
            java.util.List r4 = r4.getDependentWorkIds(r5)     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L85
        L33:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r5 == 0) goto L77
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L85
            androidx.work.impl.model.WorkSpecDao r6 = r10.mWorkSpecDao     // Catch: java.lang.Throwable -> L85
            androidx.work.WorkInfo$State r6 = r6.getState(r5)     // Catch: java.lang.Throwable -> L85
            androidx.work.WorkInfo$State r7 = androidx.work.WorkInfo.State.BLOCKED     // Catch: java.lang.Throwable -> L85
            if (r6 != r7) goto L33
            androidx.work.impl.model.DependencyDao r6 = r10.mDependencyDao     // Catch: java.lang.Throwable -> L85
            boolean r6 = r6.hasCompletedAllPrerequisites(r5)     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L33
            androidx.work.Logger r6 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = androidx.work.impl.WorkerWrapper.TAG     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "Setting status to enqueued for %s"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L85
            r9[r0] = r5     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = java.lang.String.format(r8, r9)     // Catch: java.lang.Throwable -> L85
            java.lang.Throwable[] r9 = new java.lang.Throwable[r0]     // Catch: java.lang.Throwable -> L85
            r6.info(r7, r8, r9)     // Catch: java.lang.Throwable -> L85
            androidx.work.impl.model.WorkSpecDao r6 = r10.mWorkSpecDao     // Catch: java.lang.Throwable -> L85
            androidx.work.WorkInfo$State r7 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L85
            r8[r0] = r5     // Catch: java.lang.Throwable -> L85
            r6.setState(r7, r8)     // Catch: java.lang.Throwable -> L85
            androidx.work.impl.model.WorkSpecDao r6 = r10.mWorkSpecDao     // Catch: java.lang.Throwable -> L85
            r6.setPeriodStartTime(r5, r1)     // Catch: java.lang.Throwable -> L85
            goto L33
        L77:
            androidx.work.impl.WorkDatabase r1 = r10.mWorkDatabase     // Catch: java.lang.Throwable -> L85
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L85
            androidx.work.impl.WorkDatabase r1 = r10.mWorkDatabase
            r1.endTransaction()
            r10.resolve(r0)
            return
        L85:
            r1 = move-exception
            androidx.work.impl.WorkDatabase r2 = r10.mWorkDatabase
            r2.endTransaction()
            r10.resolve(r0)
            throw r1
    }

    private boolean tryCheckForInterruptionAndResolve() {
            r6 = this;
            boolean r0 = r6.mInterrupted
            r1 = 0
            if (r0 == 0) goto L34
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.WorkerWrapper.TAG
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r6.mWorkDescription
            r4[r1] = r5
            java.lang.String r5 = "Work interrupted for %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r1]
            r0.debug(r2, r4, r5)
            androidx.work.impl.model.WorkSpecDao r0 = r6.mWorkSpecDao
            java.lang.String r2 = r6.mWorkSpecId
            androidx.work.WorkInfo$State r0 = r0.getState(r2)
            if (r0 != 0) goto L2b
            r6.resolve(r1)
            goto L33
        L2b:
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r3
            r6.resolve(r0)
        L33:
            return r3
        L34:
            return r1
    }

    private boolean trySetRunning() {
            r6 = this;
            androidx.work.impl.WorkDatabase r0 = r6.mWorkDatabase
            r0.beginTransaction()
            androidx.work.impl.model.WorkSpecDao r0 = r6.mWorkSpecDao     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L34
            androidx.work.WorkInfo$State r0 = r0.getState(r1)     // Catch: java.lang.Throwable -> L34
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L34
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L28
            androidx.work.impl.model.WorkSpecDao r0 = r6.mWorkSpecDao     // Catch: java.lang.Throwable -> L34
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.RUNNING     // Catch: java.lang.Throwable -> L34
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L34
            r4[r3] = r5     // Catch: java.lang.Throwable -> L34
            r0.setState(r1, r4)     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.model.WorkSpecDao r0 = r6.mWorkSpecDao     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L34
            r0.incrementWorkSpecRunAttemptCount(r1)     // Catch: java.lang.Throwable -> L34
            goto L29
        L28:
            r2 = 0
        L29:
            androidx.work.impl.WorkDatabase r0 = r6.mWorkDatabase     // Catch: java.lang.Throwable -> L34
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.WorkDatabase r0 = r6.mWorkDatabase
            r0.endTransaction()
            return r2
        L34:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r6.mWorkDatabase
            r1.endTransaction()
            throw r0
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> getFuture() {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<java.lang.Boolean> r0 = r1.mFuture
            return r0
    }

    public void interrupt() {
            r4 = this;
            r0 = 1
            r4.mInterrupted = r0
            r4.tryCheckForInterruptionAndResolve()
            com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker$Result> r1 = r4.mInnerFuture
            r2 = 0
            if (r1 == 0) goto L15
            boolean r1 = r1.isDone()
            com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker$Result> r3 = r4.mInnerFuture
            r3.cancel(r0)
            goto L16
        L15:
            r1 = 0
        L16:
            androidx.work.ListenableWorker r3 = r4.mWorker
            if (r3 == 0) goto L20
            if (r1 != 0) goto L20
            r3.stop()
            goto L37
        L20:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            androidx.work.impl.model.WorkSpec r1 = r4.mWorkSpec
            r0[r2] = r1
            java.lang.String r1 = "WorkSpec %s is already done. Not interrupting."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.WorkerWrapper.TAG
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r1.debug(r3, r0, r2)
        L37:
            return
    }

    void onWorkFinished() {
            r3 = this;
            boolean r0 = r3.tryCheckForInterruptionAndResolve()
            if (r0 != 0) goto L4a
            androidx.work.impl.WorkDatabase r0 = r3.mWorkDatabase
            r0.beginTransaction()
            androidx.work.impl.model.WorkSpecDao r0 = r3.mWorkSpecDao     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r3.mWorkSpecId     // Catch: java.lang.Throwable -> L43
            androidx.work.WorkInfo$State r0 = r0.getState(r1)     // Catch: java.lang.Throwable -> L43
            androidx.work.impl.WorkDatabase r1 = r3.mWorkDatabase     // Catch: java.lang.Throwable -> L43
            androidx.work.impl.model.WorkProgressDao r1 = r1.workProgressDao()     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r3.mWorkSpecId     // Catch: java.lang.Throwable -> L43
            r1.delete(r2)     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L25
            r0 = 0
            r3.resolve(r0)     // Catch: java.lang.Throwable -> L43
            goto L38
        L25:
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.RUNNING     // Catch: java.lang.Throwable -> L43
            if (r0 != r1) goto L2f
            androidx.work.ListenableWorker$Result r0 = r3.mResult     // Catch: java.lang.Throwable -> L43
            r3.handleResult(r0)     // Catch: java.lang.Throwable -> L43
            goto L38
        L2f:
            boolean r0 = r0.isFinished()     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L38
            r3.rescheduleAndResolve()     // Catch: java.lang.Throwable -> L43
        L38:
            androidx.work.impl.WorkDatabase r0 = r3.mWorkDatabase     // Catch: java.lang.Throwable -> L43
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L43
            androidx.work.impl.WorkDatabase r0 = r3.mWorkDatabase
            r0.endTransaction()
            goto L4a
        L43:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r3.mWorkDatabase
            r1.endTransaction()
            throw r0
        L4a:
            java.util.List<androidx.work.impl.Scheduler> r0 = r3.mSchedulers
            if (r0 == 0) goto L6d
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            androidx.work.impl.Scheduler r1 = (androidx.work.impl.Scheduler) r1
            java.lang.String r2 = r3.mWorkSpecId
            r1.cancel(r2)
            goto L52
        L64:
            androidx.work.Configuration r0 = r3.mConfiguration
            androidx.work.impl.WorkDatabase r1 = r3.mWorkDatabase
            java.util.List<androidx.work.impl.Scheduler> r2 = r3.mSchedulers
            androidx.work.impl.Schedulers.schedule(r0, r1, r2)
        L6d:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            androidx.work.impl.model.WorkTagDao r0 = r2.mWorkTagDao
            java.lang.String r1 = r2.mWorkSpecId
            java.util.List r0 = r0.getTagsForWorkSpecId(r1)
            r2.mTags = r0
            java.lang.String r0 = r2.createWorkDescription(r0)
            r2.mWorkDescription = r0
            r2.runWorker()
            return
    }

    void setFailedAndResolve() {
            r4 = this;
            androidx.work.impl.WorkDatabase r0 = r4.mWorkDatabase
            r0.beginTransaction()
            r0 = 0
            java.lang.String r1 = r4.mWorkSpecId     // Catch: java.lang.Throwable -> L28
            r4.iterativelyFailWorkAndDependents(r1)     // Catch: java.lang.Throwable -> L28
            androidx.work.ListenableWorker$Result r1 = r4.mResult     // Catch: java.lang.Throwable -> L28
            androidx.work.ListenableWorker$Result$Failure r1 = (androidx.work.ListenableWorker.Result.Failure) r1     // Catch: java.lang.Throwable -> L28
            androidx.work.Data r1 = r1.getOutputData()     // Catch: java.lang.Throwable -> L28
            androidx.work.impl.model.WorkSpecDao r2 = r4.mWorkSpecDao     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r4.mWorkSpecId     // Catch: java.lang.Throwable -> L28
            r2.setOutput(r3, r1)     // Catch: java.lang.Throwable -> L28
            androidx.work.impl.WorkDatabase r1 = r4.mWorkDatabase     // Catch: java.lang.Throwable -> L28
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L28
            androidx.work.impl.WorkDatabase r1 = r4.mWorkDatabase
            r1.endTransaction()
            r4.resolve(r0)
            return
        L28:
            r1 = move-exception
            androidx.work.impl.WorkDatabase r2 = r4.mWorkDatabase
            r2.endTransaction()
            r4.resolve(r0)
            throw r1
    }
}
