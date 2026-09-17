package androidx.work.impl;

/* loaded from: classes.dex */
public class Processor implements androidx.work.impl.ExecutionListener, androidx.work.impl.foreground.ForegroundProcessor {
    private static final java.lang.String TAG = null;
    private android.content.Context mAppContext;
    private java.util.Set<java.lang.String> mCancelledIds;
    private androidx.work.Configuration mConfiguration;
    private java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> mEnqueuedWorkMap;
    private android.os.PowerManager.WakeLock mForegroundLock;
    private java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> mForegroundWorkMap;
    private final java.lang.Object mLock;
    private final java.util.List<androidx.work.impl.ExecutionListener> mOuterListeners;
    private java.util.List<androidx.work.impl.Scheduler> mSchedulers;
    private androidx.work.impl.WorkDatabase mWorkDatabase;
    private androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;

    private static class FutureListener implements java.lang.Runnable {
        private androidx.work.impl.ExecutionListener mExecutionListener;
        private com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> mFuture;
        private java.lang.String mWorkSpecId;

        FutureListener(androidx.work.impl.ExecutionListener r1, java.lang.String r2, com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> r3) {
                r0 = this;
                r0.<init>()
                r0.mExecutionListener = r1
                r0.mWorkSpecId = r2
                r0.mFuture = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> r0 = r3.mFuture     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Ld
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Ld
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Ld
                goto Le
            Ld:
                r0 = 1
            Le:
                androidx.work.impl.ExecutionListener r1 = r3.mExecutionListener
                java.lang.String r2 = r3.mWorkSpecId
                r1.onExecuted(r2, r0)
                return
        }
    }

    static {
            java.lang.String r0 = "Processor"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.Processor.TAG = r0
            return
    }

    public Processor(android.content.Context r1, androidx.work.Configuration r2, androidx.work.impl.utils.taskexecutor.TaskExecutor r3, androidx.work.impl.WorkDatabase r4, java.util.List<androidx.work.impl.Scheduler> r5) {
            r0 = this;
            r0.<init>()
            r0.mAppContext = r1
            r0.mConfiguration = r2
            r0.mWorkTaskExecutor = r3
            r0.mWorkDatabase = r4
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mEnqueuedWorkMap = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mForegroundWorkMap = r1
            r0.mSchedulers = r5
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.mCancelledIds = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mOuterListeners = r1
            r1 = 0
            r0.mForegroundLock = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            return
    }

    private static boolean interrupt(java.lang.String r4, androidx.work.impl.WorkerWrapper r5) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L1d
            r5.interrupt()
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.Processor.TAG
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r1] = r4
            java.lang.String r4 = "WorkerWrapper interrupted for %s"
            java.lang.String r4 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r5.debug(r2, r4, r1)
            return r0
        L1d:
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.Processor.TAG
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            java.lang.String r4 = "WorkerWrapper could not be found for %s"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r1]
            r5.debug(r2, r4, r0)
            return r1
    }

    private void stopForegroundService() {
            r7 = this;
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r7.mForegroundWorkMap     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L36
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L34
            android.content.Context r1 = r7.mAppContext     // Catch: java.lang.Throwable -> L36
            android.content.Intent r1 = androidx.work.impl.foreground.SystemForegroundDispatcher.createStopForegroundIntent(r1)     // Catch: java.lang.Throwable -> L36
            android.content.Context r3 = r7.mAppContext     // Catch: java.lang.Throwable -> L19
            r3.startService(r1)     // Catch: java.lang.Throwable -> L19
            goto L2a
        L19:
            r1 = move-exception
            androidx.work.Logger r3 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = androidx.work.impl.Processor.TAG     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "Unable to stop foreground service"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L36
            r6 = 0
            r2[r6] = r1     // Catch: java.lang.Throwable -> L36
            r3.error(r4, r5, r2)     // Catch: java.lang.Throwable -> L36
        L2a:
            android.os.PowerManager$WakeLock r1 = r7.mForegroundLock     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L34
            r1.release()     // Catch: java.lang.Throwable -> L36
            r1 = 0
            r7.mForegroundLock = r1     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
    }

    public void addExecutionListener(androidx.work.impl.ExecutionListener r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.List<androidx.work.impl.ExecutionListener> r1 = r2.mOuterListeners     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public boolean isCancelled(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Set<java.lang.String> r1 = r2.mCancelledIds     // Catch: java.lang.Throwable -> Lb
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r3
        Lb:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    public boolean isEnqueued(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r2.mEnqueuedWorkMap     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L16
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r2.mForegroundWorkMap     // Catch: java.lang.Throwable -> L19
            boolean r3 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L14
            goto L16
        L14:
            r3 = 0
            goto L17
        L16:
            r3 = 1
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public boolean isEnqueuedInForeground(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r2.mForegroundWorkMap     // Catch: java.lang.Throwable -> Lb
            boolean r3 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r3
        Lb:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String r9, boolean r10) {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r8.mEnqueuedWorkMap     // Catch: java.lang.Throwable -> L49
            r1.remove(r9)     // Catch: java.lang.Throwable -> L49
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = androidx.work.impl.Processor.TAG     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "%s %s executed; reschedule = %s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L49
            java.lang.Class r5 = r8.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L49
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L49
            r5 = 1
            r4[r5] = r9     // Catch: java.lang.Throwable -> L49
            r5 = 2
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L49
            r4[r5] = r7     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L49
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L49
            java.util.List<androidx.work.impl.ExecutionListener> r1 = r8.mOuterListeners     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L49
        L37:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L49
            androidx.work.impl.ExecutionListener r2 = (androidx.work.impl.ExecutionListener) r2     // Catch: java.lang.Throwable -> L49
            r2.onExecuted(r9, r10)     // Catch: java.lang.Throwable -> L49
            goto L37
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            return
        L49:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r9
    }

    public void removeExecutionListener(androidx.work.impl.ExecutionListener r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.List<androidx.work.impl.ExecutionListener> r1 = r2.mOuterListeners     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(java.lang.String r7, androidx.work.ForegroundInfo r8) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = androidx.work.impl.Processor.TAG     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "Moving WorkSpec (%s) to the foreground"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L47
            r5 = 0
            r4[r5] = r7     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L47
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch: java.lang.Throwable -> L47
            r1.info(r2, r3, r4)     // Catch: java.lang.Throwable -> L47
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r6.mEnqueuedWorkMap     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r1.remove(r7)     // Catch: java.lang.Throwable -> L47
            androidx.work.impl.WorkerWrapper r1 = (androidx.work.impl.WorkerWrapper) r1     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L45
            android.os.PowerManager$WakeLock r2 = r6.mForegroundLock     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L35
            android.content.Context r2 = r6.mAppContext     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "ProcessorForegroundLck"
            android.os.PowerManager$WakeLock r2 = androidx.work.impl.utils.WakeLocks.newWakeLock(r2, r3)     // Catch: java.lang.Throwable -> L47
            r6.mForegroundLock = r2     // Catch: java.lang.Throwable -> L47
            r2.acquire()     // Catch: java.lang.Throwable -> L47
        L35:
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r2 = r6.mForegroundWorkMap     // Catch: java.lang.Throwable -> L47
            r2.put(r7, r1)     // Catch: java.lang.Throwable -> L47
            android.content.Context r1 = r6.mAppContext     // Catch: java.lang.Throwable -> L47
            android.content.Intent r7 = androidx.work.impl.foreground.SystemForegroundDispatcher.createStartForegroundIntent(r1, r7, r8)     // Catch: java.lang.Throwable -> L47
            android.content.Context r8 = r6.mAppContext     // Catch: java.lang.Throwable -> L47
            androidx.core.content.ContextCompat.startForegroundService(r8, r7)     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r7
    }

    public boolean startWork(java.lang.String r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.startWork(r2, r0)
            return r2
    }

    public boolean startWork(java.lang.String r12, androidx.work.WorkerParameters.RuntimeExtras r13) {
            r11 = this;
            java.lang.Object r0 = r11.mLock
            monitor-enter(r0)
            boolean r1 = r11.isEnqueued(r12)     // Catch: java.lang.Throwable -> L82
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            androidx.work.Logger r13 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = androidx.work.impl.Processor.TAG     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "Work %s is already enqueued for processing"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L82
            r2[r3] = r12     // Catch: java.lang.Throwable -> L82
            java.lang.String r12 = java.lang.String.format(r4, r2)     // Catch: java.lang.Throwable -> L82
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L82
            r13.debug(r1, r12, r2)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            return r3
        L22:
            androidx.work.impl.WorkerWrapper$Builder r1 = new androidx.work.impl.WorkerWrapper$Builder     // Catch: java.lang.Throwable -> L82
            android.content.Context r5 = r11.mAppContext     // Catch: java.lang.Throwable -> L82
            androidx.work.Configuration r6 = r11.mConfiguration     // Catch: java.lang.Throwable -> L82
            androidx.work.impl.utils.taskexecutor.TaskExecutor r7 = r11.mWorkTaskExecutor     // Catch: java.lang.Throwable -> L82
            androidx.work.impl.WorkDatabase r9 = r11.mWorkDatabase     // Catch: java.lang.Throwable -> L82
            r4 = r1
            r8 = r11
            r10 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L82
            java.util.List<androidx.work.impl.Scheduler> r4 = r11.mSchedulers     // Catch: java.lang.Throwable -> L82
            androidx.work.impl.WorkerWrapper$Builder r1 = r1.withSchedulers(r4)     // Catch: java.lang.Throwable -> L82
            androidx.work.impl.WorkerWrapper$Builder r13 = r1.withRuntimeExtras(r13)     // Catch: java.lang.Throwable -> L82
            androidx.work.impl.WorkerWrapper r13 = r13.build()     // Catch: java.lang.Throwable -> L82
            com.google.common.util.concurrent.ListenableFuture r1 = r13.getFuture()     // Catch: java.lang.Throwable -> L82
            androidx.work.impl.Processor$FutureListener r4 = new androidx.work.impl.Processor$FutureListener     // Catch: java.lang.Throwable -> L82
            r4.<init>(r11, r12, r1)     // Catch: java.lang.Throwable -> L82
            androidx.work.impl.utils.taskexecutor.TaskExecutor r5 = r11.mWorkTaskExecutor     // Catch: java.lang.Throwable -> L82
            java.util.concurrent.Executor r5 = r5.getMainThreadExecutor()     // Catch: java.lang.Throwable -> L82
            r1.addListener(r4, r5)     // Catch: java.lang.Throwable -> L82
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r11.mEnqueuedWorkMap     // Catch: java.lang.Throwable -> L82
            r1.put(r12, r13)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r11.mWorkTaskExecutor
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()
            r0.execute(r13)
            androidx.work.Logger r13 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.Processor.TAG
            java.lang.String r1 = "%s: processing %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Class r5 = r11.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4[r3] = r5
            r4[r2] = r12
            java.lang.String r12 = java.lang.String.format(r1, r4)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r3]
            r13.debug(r0, r12, r1)
            return r2
        L82:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            throw r12
    }

    public boolean stopAndCancelWork(java.lang.String r8) {
            r7 = this;
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = androidx.work.impl.Processor.TAG     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "Processor cancelling %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L40
            r6 = 0
            r5[r6] = r8     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch: java.lang.Throwable -> L40
            java.lang.Throwable[] r5 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L40
            r1.debug(r2, r3, r5)     // Catch: java.lang.Throwable -> L40
            java.util.Set<java.lang.String> r1 = r7.mCancelledIds     // Catch: java.lang.Throwable -> L40
            r1.add(r8)     // Catch: java.lang.Throwable -> L40
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r7.mForegroundWorkMap     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.remove(r8)     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.WorkerWrapper r1 = (androidx.work.impl.WorkerWrapper) r1     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L2a
            goto L2b
        L2a:
            r4 = 0
        L2b:
            if (r1 != 0) goto L35
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r7.mEnqueuedWorkMap     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.remove(r8)     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.WorkerWrapper r1 = (androidx.work.impl.WorkerWrapper) r1     // Catch: java.lang.Throwable -> L40
        L35:
            boolean r8 = interrupt(r8, r1)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L3e
            r7.stopForegroundService()     // Catch: java.lang.Throwable -> L40
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return r8
        L40:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r8
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void stopForeground(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r2.mForegroundWorkMap     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            r2.stopForegroundService()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public boolean stopForegroundWork(java.lang.String r7) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = androidx.work.impl.Processor.TAG     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Processor stopping foreground work %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L28
            r5 = 0
            r4[r5] = r7     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch: java.lang.Throwable -> L28
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L28
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r6.mForegroundWorkMap     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.remove(r7)     // Catch: java.lang.Throwable -> L28
            androidx.work.impl.WorkerWrapper r1 = (androidx.work.impl.WorkerWrapper) r1     // Catch: java.lang.Throwable -> L28
            boolean r7 = interrupt(r7, r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return r7
        L28:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r7
    }

    public boolean stopWork(java.lang.String r7) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = androidx.work.impl.Processor.TAG     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Processor stopping background work %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L28
            r5 = 0
            r4[r5] = r7     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch: java.lang.Throwable -> L28
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L28
            java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> r1 = r6.mEnqueuedWorkMap     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.remove(r7)     // Catch: java.lang.Throwable -> L28
            androidx.work.impl.WorkerWrapper r1 = (androidx.work.impl.WorkerWrapper) r1     // Catch: java.lang.Throwable -> L28
            boolean r7 = interrupt(r7, r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return r7
        L28:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r7
    }
}
