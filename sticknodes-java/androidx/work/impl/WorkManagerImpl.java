package androidx.work.impl;

/* loaded from: classes.dex */
public class WorkManagerImpl extends androidx.work.WorkManager {
    private static final java.lang.String TAG = null;
    private static androidx.work.impl.WorkManagerImpl sDefaultInstance;
    private static androidx.work.impl.WorkManagerImpl sDelegatedInstance;
    private static final java.lang.Object sLock = null;
    private androidx.work.Configuration mConfiguration;
    private android.content.Context mContext;
    private boolean mForceStopRunnableCompleted;
    private androidx.work.impl.utils.PreferenceUtils mPreferenceUtils;
    private androidx.work.impl.Processor mProcessor;
    private android.content.BroadcastReceiver.PendingResult mRescheduleReceiverResult;
    private java.util.List<androidx.work.impl.Scheduler> mSchedulers;
    private androidx.work.impl.WorkDatabase mWorkDatabase;
    private androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;

    static {
            java.lang.String r0 = "WorkManagerImpl"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.WorkManagerImpl.TAG = r0
            r0 = 0
            androidx.work.impl.WorkManagerImpl.sDelegatedInstance = r0
            androidx.work.impl.WorkManagerImpl.sDefaultInstance = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.work.impl.WorkManagerImpl.sLock = r0
            return
    }

    public WorkManagerImpl(android.content.Context r3, androidx.work.Configuration r4, androidx.work.impl.utils.taskexecutor.TaskExecutor r5) {
            r2 = this;
            android.content.res.Resources r0 = r3.getResources()
            int r1 = androidx.work.R$bool.workmanager_test_configuration
            boolean r0 = r0.getBoolean(r1)
            r2.<init>(r3, r4, r5, r0)
            return
    }

    public WorkManagerImpl(android.content.Context r11, androidx.work.Configuration r12, androidx.work.impl.utils.taskexecutor.TaskExecutor r13, androidx.work.impl.WorkDatabase r14) {
            r10 = this;
            r10.<init>()
            android.content.Context r0 = r11.getApplicationContext()
            androidx.work.Logger$LogcatLogger r1 = new androidx.work.Logger$LogcatLogger
            int r2 = r12.getMinimumLoggingLevel()
            r1.<init>(r2)
            androidx.work.Logger.setLogger(r1)
            java.util.List r0 = r10.createSchedulers(r0, r12, r13)
            androidx.work.impl.Processor r9 = new androidx.work.impl.Processor
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = r10
            r3.internalInit(r4, r5, r6, r7, r8, r9)
            return
    }

    public WorkManagerImpl(android.content.Context r3, androidx.work.Configuration r4, androidx.work.impl.utils.taskexecutor.TaskExecutor r5, boolean r6) {
            r2 = this;
            android.content.Context r0 = r3.getApplicationContext()
            androidx.work.impl.utils.SerialExecutor r1 = r5.getBackgroundExecutor()
            androidx.work.impl.WorkDatabase r6 = androidx.work.impl.WorkDatabase.create(r0, r1, r6)
            r2.<init>(r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    public static androidx.work.impl.WorkManagerImpl getInstance() {
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.sDelegatedInstance     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        L9:
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.sDefaultInstance     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public static androidx.work.impl.WorkManagerImpl getInstance(android.content.Context r2) {
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            androidx.work.impl.WorkManagerImpl r1 = getInstance()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L28
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r2 instanceof androidx.work.Configuration.Provider     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L20
            r1 = r2
            androidx.work.Configuration$Provider r1 = (androidx.work.Configuration.Provider) r1     // Catch: java.lang.Throwable -> L2a
            androidx.work.Configuration r1 = r1.getWorkManagerConfiguration()     // Catch: java.lang.Throwable -> L2a
            initialize(r2, r1)     // Catch: java.lang.Throwable -> L2a
            androidx.work.impl.WorkManagerImpl r1 = getInstance(r2)     // Catch: java.lang.Throwable -> L2a
            goto L28
        L20:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return r1
        L2a:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2
    }

    public static void initialize(android.content.Context r4, androidx.work.Configuration r5) {
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.sDelegatedInstance     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            androidx.work.impl.WorkManagerImpl r2 = androidx.work.impl.WorkManagerImpl.sDefaultInstance     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.sDefaultInstance     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            androidx.work.impl.WorkManagerImpl r1 = new androidx.work.impl.WorkManagerImpl     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor r2 = new androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.getTaskExecutor()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.WorkManagerImpl.sDefaultInstance = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            androidx.work.impl.WorkManagerImpl r4 = androidx.work.impl.WorkManagerImpl.sDefaultInstance     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.WorkManagerImpl.sDelegatedInstance = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    private void internalInit(android.content.Context r1, androidx.work.Configuration r2, androidx.work.impl.utils.taskexecutor.TaskExecutor r3, androidx.work.impl.WorkDatabase r4, java.util.List<androidx.work.impl.Scheduler> r5, androidx.work.impl.Processor r6) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            r0.mContext = r1
            r0.mConfiguration = r2
            r0.mWorkTaskExecutor = r3
            r0.mWorkDatabase = r4
            r0.mSchedulers = r5
            r0.mProcessor = r6
            androidx.work.impl.utils.PreferenceUtils r2 = new androidx.work.impl.utils.PreferenceUtils
            r2.<init>(r4)
            r0.mPreferenceUtils = r2
            r2 = 0
            r0.mForceStopRunnableCompleted = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L2f
            boolean r2 = r1.isDeviceProtectedStorage()
            if (r2 != 0) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot initialize WorkManager in direct boot mode"
            r1.<init>(r2)
            throw r1
        L2f:
            androidx.work.impl.utils.taskexecutor.TaskExecutor r2 = r0.mWorkTaskExecutor
            androidx.work.impl.utils.ForceStopRunnable r3 = new androidx.work.impl.utils.ForceStopRunnable
            r3.<init>(r1, r0)
            r2.executeOnBackgroundThread(r3)
            return
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation cancelAllWorkByTag(java.lang.String r2) {
            r1 = this;
            androidx.work.impl.utils.CancelWorkRunnable r2 = androidx.work.impl.utils.CancelWorkRunnable.forTag(r2, r1)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            r0.executeOnBackgroundThread(r2)
            androidx.work.Operation r2 = r2.getOperation()
            return r2
    }

    public androidx.work.Operation cancelWorkById(java.util.UUID r2) {
            r1 = this;
            androidx.work.impl.utils.CancelWorkRunnable r2 = androidx.work.impl.utils.CancelWorkRunnable.forId(r2, r1)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            r0.executeOnBackgroundThread(r2)
            androidx.work.Operation r2 = r2.getOperation()
            return r2
    }

    public java.util.List<androidx.work.impl.Scheduler> createSchedulers(android.content.Context r4, androidx.work.Configuration r5, androidx.work.impl.utils.taskexecutor.TaskExecutor r6) {
            r3 = this;
            r0 = 2
            androidx.work.impl.Scheduler[] r0 = new androidx.work.impl.Scheduler[r0]
            androidx.work.impl.Scheduler r1 = androidx.work.impl.Schedulers.createBestAvailableBackgroundScheduler(r4, r3)
            r2 = 0
            r0[r2] = r1
            androidx.work.impl.background.greedy.GreedyScheduler r1 = new androidx.work.impl.background.greedy.GreedyScheduler
            r1.<init>(r4, r5, r6, r3)
            r4 = 1
            r0[r4] = r1
            java.util.List r4 = java.util.Arrays.asList(r0)
            return r4
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation enqueue(java.util.List<? extends androidx.work.WorkRequest> r2) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L10
            androidx.work.impl.WorkContinuationImpl r0 = new androidx.work.impl.WorkContinuationImpl
            r0.<init>(r1, r2)
            androidx.work.Operation r2 = r0.enqueue()
            return r2
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "enqueue needs at least one WorkRequest."
            r2.<init>(r0)
            throw r2
    }

    public android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public androidx.work.Configuration getConfiguration() {
            r1 = this;
            androidx.work.Configuration r0 = r1.mConfiguration
            return r0
    }

    public androidx.work.impl.utils.PreferenceUtils getPreferenceUtils() {
            r1 = this;
            androidx.work.impl.utils.PreferenceUtils r0 = r1.mPreferenceUtils
            return r0
    }

    public androidx.work.impl.Processor getProcessor() {
            r1 = this;
            androidx.work.impl.Processor r0 = r1.mProcessor
            return r0
    }

    public java.util.List<androidx.work.impl.Scheduler> getSchedulers() {
            r1 = this;
            java.util.List<androidx.work.impl.Scheduler> r0 = r1.mSchedulers
            return r0
    }

    public androidx.work.impl.WorkDatabase getWorkDatabase() {
            r1 = this;
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase
            return r0
    }

    public androidx.work.impl.utils.taskexecutor.TaskExecutor getWorkTaskExecutor() {
            r1 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            return r0
    }

    public void onForceStopRunnableCompleted() {
            r2 = this;
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            r1 = 1
            r2.mForceStopRunnableCompleted = r1     // Catch: java.lang.Throwable -> L12
            android.content.BroadcastReceiver$PendingResult r1 = r2.mRescheduleReceiverResult     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L10
            r1.finish()     // Catch: java.lang.Throwable -> L12
            r1 = 0
            r2.mRescheduleReceiverResult = r1     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public void rescheduleEligibleWork() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.content.Context r0 = r3.getApplicationContext()
            androidx.work.impl.background.systemjob.SystemJobScheduler.cancelAll(r0)
        Ld:
            androidx.work.impl.WorkDatabase r0 = r3.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()
            r0.resetScheduledState()
            androidx.work.Configuration r0 = r3.getConfiguration()
            androidx.work.impl.WorkDatabase r1 = r3.getWorkDatabase()
            java.util.List r2 = r3.getSchedulers()
            androidx.work.impl.Schedulers.schedule(r0, r1, r2)
            return
    }

    public void setReschedulePendingResult(android.content.BroadcastReceiver.PendingResult r3) {
            r2 = this;
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            r2.mRescheduleReceiverResult = r3     // Catch: java.lang.Throwable -> L11
            boolean r1 = r2.mForceStopRunnableCompleted     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Lf
            r3.finish()     // Catch: java.lang.Throwable -> L11
            r3 = 0
            r2.mRescheduleReceiverResult = r3     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    public void startWork(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.startWork(r2, r0)
            return
    }

    public void startWork(java.lang.String r3, androidx.work.WorkerParameters.RuntimeExtras r4) {
            r2 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r2.mWorkTaskExecutor
            androidx.work.impl.utils.StartWorkRunnable r1 = new androidx.work.impl.utils.StartWorkRunnable
            r1.<init>(r2, r3, r4)
            r0.executeOnBackgroundThread(r1)
            return
    }

    public void stopForegroundWork(java.lang.String r4) {
            r3 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r3.mWorkTaskExecutor
            androidx.work.impl.utils.StopWorkRunnable r1 = new androidx.work.impl.utils.StopWorkRunnable
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.executeOnBackgroundThread(r1)
            return
    }

    public void stopWork(java.lang.String r4) {
            r3 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r3.mWorkTaskExecutor
            androidx.work.impl.utils.StopWorkRunnable r1 = new androidx.work.impl.utils.StopWorkRunnable
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.executeOnBackgroundThread(r1)
            return
    }
}
