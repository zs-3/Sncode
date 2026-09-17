package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
public class DelayMetCommandHandler implements androidx.work.impl.constraints.WorkConstraintsCallback, androidx.work.impl.ExecutionListener, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener {
    private static final java.lang.String TAG = null;
    private final android.content.Context mContext;
    private int mCurrentState;
    private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;
    private boolean mHasConstraints;
    private final java.lang.Object mLock;
    private final int mStartId;
    private android.os.PowerManager.WakeLock mWakeLock;
    private final androidx.work.impl.constraints.WorkConstraintsTracker mWorkConstraintsTracker;
    private final java.lang.String mWorkSpecId;

    static {
            java.lang.String r0 = "DelayMetCommandHandler"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.DelayMetCommandHandler.TAG = r0
            return
    }

    DelayMetCommandHandler(android.content.Context r1, int r2, java.lang.String r3, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r4) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mStartId = r2
            r0.mDispatcher = r4
            r0.mWorkSpecId = r3
            androidx.work.impl.utils.taskexecutor.TaskExecutor r2 = r4.getTaskExecutor()
            androidx.work.impl.constraints.WorkConstraintsTracker r3 = new androidx.work.impl.constraints.WorkConstraintsTracker
            r3.<init>(r1, r2, r0)
            r0.mWorkConstraintsTracker = r3
            r1 = 0
            r0.mHasConstraints = r1
            r0.mCurrentState = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            return
    }

    private void cleanUp() {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.WorkConstraintsTracker r1 = r8.mWorkConstraintsTracker     // Catch: java.lang.Throwable -> L42
            r1.reset()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r1 = r8.mDispatcher     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.utils.WorkTimer r1 = r1.getWorkTimer()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L42
            r1.stopTimer(r2)     // Catch: java.lang.Throwable -> L42
            android.os.PowerManager$WakeLock r1 = r8.mWakeLock     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L40
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L40
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = androidx.work.impl.background.systemalarm.DelayMetCommandHandler.TAG     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "Releasing wakelock %s for WorkSpec %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L42
            android.os.PowerManager$WakeLock r5 = r8.mWakeLock     // Catch: java.lang.Throwable -> L42
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L42
            r5 = 1
            java.lang.String r7 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L42
            r4[r5] = r7     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L42
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L42
            android.os.PowerManager$WakeLock r1 = r8.mWakeLock     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1
    }

    private void stopWork() {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            int r1 = r8.mCurrentState     // Catch: java.lang.Throwable -> L9e
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L85
            r8.mCurrentState = r2     // Catch: java.lang.Throwable -> L9e
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = androidx.work.impl.background.systemalarm.DelayMetCommandHandler.TAG     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "Stopping work for WorkSpec %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r7 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L9e
            r6[r4] = r7     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L9e
            java.lang.Throwable[] r6 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L9e
            r1.debug(r2, r5, r6)     // Catch: java.lang.Throwable -> L9e
            android.content.Context r1 = r8.mContext     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L9e
            android.content.Intent r1 = androidx.work.impl.background.systemalarm.CommandHandler.createStopWorkIntent(r1, r5)     // Catch: java.lang.Throwable -> L9e
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r5 = r8.mDispatcher     // Catch: java.lang.Throwable -> L9e
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable r6 = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable     // Catch: java.lang.Throwable -> L9e
            int r7 = r8.mStartId     // Catch: java.lang.Throwable -> L9e
            r6.<init>(r5, r1, r7)     // Catch: java.lang.Throwable -> L9e
            r5.postOnMainThread(r6)     // Catch: java.lang.Throwable -> L9e
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r1 = r8.mDispatcher     // Catch: java.lang.Throwable -> L9e
            androidx.work.impl.Processor r1 = r1.getProcessor()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r1.isEnqueued(r5)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L6f
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "WorkSpec %s needs to be rescheduled"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L9e
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L9e
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L9e
            android.content.Context r1 = r8.mContext     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L9e
            android.content.Intent r1 = androidx.work.impl.background.systemalarm.CommandHandler.createScheduleWorkIntent(r1, r2)     // Catch: java.lang.Throwable -> L9e
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r2 = r8.mDispatcher     // Catch: java.lang.Throwable -> L9e
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable r3 = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable     // Catch: java.lang.Throwable -> L9e
            int r4 = r8.mStartId     // Catch: java.lang.Throwable -> L9e
            r3.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L9e
            r2.postOnMainThread(r3)     // Catch: java.lang.Throwable -> L9e
            goto L9c
        L6f:
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "Processor does not have WorkSpec %s. No need to reschedule "
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L9e
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L9e
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L9e
            goto L9c
        L85:
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = androidx.work.impl.background.systemalarm.DelayMetCommandHandler.TAG     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "Already stopped work for %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L9e
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L9e
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L9e
        L9c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            return
        L9e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            throw r1
    }

    void handleProcessWork() {
            r6 = this;
            android.content.Context r0 = r6.mContext
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r6.mWorkSpecId
            r4 = 0
            r2[r4] = r3
            int r3 = r6.mStartId
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "%s (%s)"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            android.os.PowerManager$WakeLock r0 = androidx.work.impl.utils.WakeLocks.newWakeLock(r0, r2)
            r6.mWakeLock = r0
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.background.systemalarm.DelayMetCommandHandler.TAG
            java.lang.Object[] r1 = new java.lang.Object[r1]
            android.os.PowerManager$WakeLock r3 = r6.mWakeLock
            r1[r4] = r3
            java.lang.String r3 = r6.mWorkSpecId
            r1[r5] = r3
            java.lang.String r3 = "Acquiring wakelock %s for WorkSpec %s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.debug(r2, r1, r3)
            android.os.PowerManager$WakeLock r0 = r6.mWakeLock
            r0.acquire()
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r0 = r6.mDispatcher
            androidx.work.impl.WorkManagerImpl r0 = r0.getWorkManager()
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()
            java.lang.String r1 = r6.mWorkSpecId
            androidx.work.impl.model.WorkSpec r0 = r0.getWorkSpec(r1)
            if (r0 != 0) goto L59
            r6.stopWork()
            return
        L59:
            boolean r1 = r0.hasConstraints()
            r6.mHasConstraints = r1
            if (r1 != 0) goto L80
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r3 = r6.mWorkSpecId
            r1[r4] = r3
            java.lang.String r3 = "No constraints for %s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.debug(r2, r1, r3)
            java.lang.String r0 = r6.mWorkSpecId
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r6.onAllConstraintsMet(r0)
            goto L89
        L80:
            androidx.work.impl.constraints.WorkConstraintsTracker r1 = r6.mWorkConstraintsTracker
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.replace(r0)
        L89:
            return
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(java.util.List<java.lang.String> r7) {
            r6 = this;
            java.lang.String r0 = r6.mWorkSpecId
            boolean r7 = r7.contains(r0)
            if (r7 != 0) goto L9
            return
        L9:
            java.lang.Object r7 = r6.mLock
            monitor-enter(r7)
            int r0 = r6.mCurrentState     // Catch: java.lang.Throwable -> L65
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L4c
            r6.mCurrentState = r1     // Catch: java.lang.Throwable -> L65
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = androidx.work.impl.background.systemalarm.DelayMetCommandHandler.TAG     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "onAllConstraintsMet for %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L65
            r1[r2] = r5     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L65
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L65
            r0.debug(r3, r1, r2)     // Catch: java.lang.Throwable -> L65
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r0 = r6.mDispatcher     // Catch: java.lang.Throwable -> L65
            androidx.work.impl.Processor r0 = r0.getProcessor()     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L65
            boolean r0 = r0.startWork(r1)     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L48
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r0 = r6.mDispatcher     // Catch: java.lang.Throwable -> L65
            androidx.work.impl.utils.WorkTimer r0 = r0.getWorkTimer()     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L65
            r2 = 600000(0x927c0, double:2.964394E-318)
            r0.startTimer(r1, r2, r6)     // Catch: java.lang.Throwable -> L65
            goto L63
        L48:
            r6.cleanUp()     // Catch: java.lang.Throwable -> L65
            goto L63
        L4c:
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = androidx.work.impl.background.systemalarm.DelayMetCommandHandler.TAG     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "Already started work for %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r6.mWorkSpecId     // Catch: java.lang.Throwable -> L65
            r1[r2] = r5     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L65
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L65
            r0.debug(r3, r1, r2)     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L65
            return
        L65:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L65
            throw r0
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.stopWork()
            return
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String r6, boolean r7) {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.DelayMetCommandHandler.TAG
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r4 = 1
            r2[r4] = r6
            java.lang.String r6 = "onExecuted %s, %s"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r0.debug(r1, r6, r2)
            r5.cleanUp()
            if (r7 == 0) goto L37
            android.content.Context r6 = r5.mContext
            java.lang.String r7 = r5.mWorkSpecId
            android.content.Intent r6 = androidx.work.impl.background.systemalarm.CommandHandler.createScheduleWorkIntent(r6, r7)
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r7 = r5.mDispatcher
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable r0 = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable
            int r1 = r5.mStartId
            r0.<init>(r7, r6, r1)
            r7.postOnMainThread(r0)
        L37:
            boolean r6 = r5.mHasConstraints
            if (r6 == 0) goto L4d
            android.content.Context r6 = r5.mContext
            android.content.Intent r6 = androidx.work.impl.background.systemalarm.CommandHandler.createConstraintsChangedIntent(r6)
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r7 = r5.mDispatcher
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable r0 = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable
            int r1 = r5.mStartId
            r0.<init>(r7, r6, r1)
            r7.postOnMainThread(r0)
        L4d:
            return
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public void onTimeLimitExceeded(java.lang.String r5) {
            r4 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.DelayMetCommandHandler.TAG
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "Exceeded time limits on execution for %s"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r0.debug(r1, r5, r2)
            r4.stopWork()
            return
    }
}
