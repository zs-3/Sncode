package androidx.work.impl.background.systemjob;

/* loaded from: classes.dex */
public class SystemJobService extends android.app.job.JobService implements androidx.work.impl.ExecutionListener {
    private static final java.lang.String TAG = null;
    private final java.util.Map<java.lang.String, android.app.job.JobParameters> mJobParameters;
    private androidx.work.impl.WorkManagerImpl mWorkManagerImpl;

    static {
            java.lang.String r0 = "SystemJobService"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemjob.SystemJobService.TAG = r0
            return
    }

    public SystemJobService() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mJobParameters = r0
            return
    }

    private static java.lang.String getWorkSpecIdFromJobParameters(android.app.job.JobParameters r2) {
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r2 = r2.getExtras()     // Catch: java.lang.NullPointerException -> L13
            if (r2 == 0) goto L13
            boolean r1 = r2.containsKey(r0)     // Catch: java.lang.NullPointerException -> L13
            if (r1 == 0) goto L13
            java.lang.String r2 = r2.getString(r0)     // Catch: java.lang.NullPointerException -> L13
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // android.app.Service
    public void onCreate() {
            r4 = this;
            super.onCreate()
            android.content.Context r0 = r4.getApplicationContext()     // Catch: java.lang.IllegalStateException -> L15
            androidx.work.impl.WorkManagerImpl r0 = androidx.work.impl.WorkManagerImpl.getInstance(r0)     // Catch: java.lang.IllegalStateException -> L15
            r4.mWorkManagerImpl = r0     // Catch: java.lang.IllegalStateException -> L15
            androidx.work.impl.Processor r0 = r0.getProcessor()     // Catch: java.lang.IllegalStateException -> L15
            r0.addExecutionListener(r4)     // Catch: java.lang.IllegalStateException -> L15
            goto L34
        L15:
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            android.app.Application r1 = r4.getApplication()
            java.lang.Class r1 = r1.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.TAG
            r2 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            java.lang.String r3 = "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer."
            r0.warning(r1, r3, r2)
        L34:
            return
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate()."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.work.impl.WorkManagerImpl r0 = r1.mWorkManagerImpl
            if (r0 == 0) goto Le
            androidx.work.impl.Processor r0 = r0.getProcessor()
            r0.removeExecutionListener(r1)
        Le:
            return
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String r6, boolean r7) {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.TAG
            java.lang.String r2 = "%s executed on JobScheduler"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.debug(r1, r2, r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r0 = r5.mJobParameters
            monitor-enter(r0)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r1 = r5.mJobParameters     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r1.remove(r6)     // Catch: java.lang.Throwable -> L29
            android.app.job.JobParameters r6 = (android.app.job.JobParameters) r6     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L28
            r5.jobFinished(r6, r7)
        L28:
            return
        L29:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r6
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters r9) {
            r8 = this;
            androidx.work.impl.WorkManagerImpl r0 = r8.mWorkManagerImpl
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.TAG
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.debug(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L17:
            java.lang.String r0 = getWorkSpecIdFromJobParameters(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L2f
            androidx.work.Logger r9 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.TAG
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.error(r0, r1, r3)
            return r2
        L2f:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.mJobParameters
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.mJobParameters     // Catch: java.lang.Throwable -> La8
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L51
            androidx.work.Logger r9 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = androidx.work.impl.background.systemjob.SystemJobService.TAG     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La8
            r1[r2] = r0     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> La8
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> La8
            r9.debug(r4, r0, r1)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La8
            return r2
        L51:
            androidx.work.Logger r4 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = androidx.work.impl.background.systemjob.SystemJobService.TAG     // Catch: java.lang.Throwable -> La8
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La8
            r7[r2] = r0     // Catch: java.lang.Throwable -> La8
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> La8
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> La8
            r4.debug(r5, r6, r2)     // Catch: java.lang.Throwable -> La8
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.mJobParameters     // Catch: java.lang.Throwable -> La8
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La8
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto La2
            androidx.work.WorkerParameters$RuntimeExtras r2 = new androidx.work.WorkerParameters$RuntimeExtras
            r2.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L88
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.triggeredContentUris = r4
        L88:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto L98
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.triggeredContentAuthorities = r4
        L98:
            r4 = 28
            if (r3 < r4) goto La2
            android.net.Network r9 = r9.getNetwork()
            r2.network = r9
        La2:
            androidx.work.impl.WorkManagerImpl r9 = r8.mWorkManagerImpl
            r9.startWork(r0, r2)
            return r1
        La8:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La8
            throw r9
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters r7) {
            r6 = this;
            androidx.work.impl.WorkManagerImpl r0 = r6.mWorkManagerImpl
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.TAG
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r7.debug(r0, r3, r2)
            return r1
        L14:
            java.lang.String r7 = getWorkSpecIdFromJobParameters(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L2c
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.TAG
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r7.error(r0, r1, r3)
            return r2
        L2c:
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.TAG
            java.lang.String r4 = "onStopJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r7
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.debug(r3, r4, r2)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r0 = r6.mJobParameters
            monitor-enter(r0)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r6.mJobParameters     // Catch: java.lang.Throwable -> L5b
            r2.remove(r7)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            androidx.work.impl.WorkManagerImpl r0 = r6.mWorkManagerImpl
            r0.stopWork(r7)
            androidx.work.impl.WorkManagerImpl r0 = r6.mWorkManagerImpl
            androidx.work.impl.Processor r0 = r0.getProcessor()
            boolean r7 = r0.isCancelled(r7)
            r7 = r7 ^ r1
            return r7
        L5b:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r7
    }
}
