package androidx.work.impl.background.greedy;

/* loaded from: classes.dex */
public class GreedyScheduler implements androidx.work.impl.Scheduler, androidx.work.impl.constraints.WorkConstraintsCallback, androidx.work.impl.ExecutionListener {
    private static final java.lang.String TAG = null;
    private final java.util.Set<androidx.work.impl.model.WorkSpec> mConstrainedWorkSpecs;
    private final android.content.Context mContext;
    private androidx.work.impl.background.greedy.DelayedWorkTracker mDelayedWorkTracker;
    java.lang.Boolean mInDefaultProcess;
    private final java.lang.Object mLock;
    private boolean mRegisteredExecutionListener;
    private final androidx.work.impl.constraints.WorkConstraintsTracker mWorkConstraintsTracker;
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;

    static {
            java.lang.String r0 = "GreedyScheduler"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.greedy.GreedyScheduler.TAG = r0
            return
    }

    public GreedyScheduler(android.content.Context r2, androidx.work.Configuration r3, androidx.work.impl.utils.taskexecutor.TaskExecutor r4, androidx.work.impl.WorkManagerImpl r5) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mConstrainedWorkSpecs = r0
            r1.mContext = r2
            r1.mWorkManagerImpl = r5
            androidx.work.impl.constraints.WorkConstraintsTracker r5 = new androidx.work.impl.constraints.WorkConstraintsTracker
            r5.<init>(r2, r4, r1)
            r1.mWorkConstraintsTracker = r5
            androidx.work.impl.background.greedy.DelayedWorkTracker r2 = new androidx.work.impl.background.greedy.DelayedWorkTracker
            androidx.work.RunnableScheduler r3 = r3.getRunnableScheduler()
            r2.<init>(r1, r3)
            r1.mDelayedWorkTracker = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.mLock = r2
            return
    }

    private void checkDefaultProcess() {
            r2 = this;
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManagerImpl
            androidx.work.Configuration r0 = r0.getConfiguration()
            android.content.Context r1 = r2.mContext
            boolean r0 = androidx.work.impl.utils.ProcessUtils.isDefaultProcess(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.mInDefaultProcess = r0
            return
    }

    private void registerExecutionListenerIfNeeded() {
            r1 = this;
            boolean r0 = r1.mRegisteredExecutionListener
            if (r0 != 0) goto L10
            androidx.work.impl.WorkManagerImpl r0 = r1.mWorkManagerImpl
            androidx.work.impl.Processor r0 = r0.getProcessor()
            r0.addExecutionListener(r1)
            r0 = 1
            r1.mRegisteredExecutionListener = r0
        L10:
            return
    }

    private void removeConstraintTrackingFor(java.lang.String r8) {
            r7 = this;
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            java.util.Set<androidx.work.impl.model.WorkSpec> r1 = r7.mConstrainedWorkSpecs     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.model.WorkSpec r2 = (androidx.work.impl.model.WorkSpec) r2     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r2.id     // Catch: java.lang.Throwable -> L42
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L9
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = androidx.work.impl.background.greedy.GreedyScheduler.TAG     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "Stopping tracking for %s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L42
            r6 = 0
            r5[r6] = r8     // Catch: java.lang.Throwable -> L42
            java.lang.String r8 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L42
            r1.debug(r3, r8, r4)     // Catch: java.lang.Throwable -> L42
            java.util.Set<androidx.work.impl.model.WorkSpec> r8 = r7.mConstrainedWorkSpecs     // Catch: java.lang.Throwable -> L42
            r8.remove(r2)     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.constraints.WorkConstraintsTracker r8 = r7.mWorkConstraintsTracker     // Catch: java.lang.Throwable -> L42
            java.util.Set<androidx.work.impl.model.WorkSpec> r1 = r7.mConstrainedWorkSpecs     // Catch: java.lang.Throwable -> L42
            r8.replace(r1)     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r8
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(java.lang.String r6) {
            r5 = this;
            java.lang.Boolean r0 = r5.mInDefaultProcess
            if (r0 != 0) goto L7
            r5.checkDefaultProcess()
        L7:
            java.lang.Boolean r0 = r5.mInDefaultProcess
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L1e
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.greedy.GreedyScheduler.TAG
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r2 = "Ignoring schedule request in non-main process"
            r6.info(r0, r2, r1)
            return
        L1e:
            r5.registerExecutionListenerIfNeeded()
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.background.greedy.GreedyScheduler.TAG
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            java.lang.String r4 = "Cancelling work ID %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r0.debug(r2, r3, r1)
            androidx.work.impl.background.greedy.DelayedWorkTracker r0 = r5.mDelayedWorkTracker
            if (r0 == 0) goto L3e
            r0.unschedule(r6)
        L3e:
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManagerImpl
            r0.stopWork(r6)
            return
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(java.util.List<java.lang.String> r7) {
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.background.greedy.GreedyScheduler.TAG
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = "Constraints met: Scheduling work ID %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r1.debug(r2, r3, r4)
            androidx.work.impl.WorkManagerImpl r1 = r6.mWorkManagerImpl
            r1.startWork(r0)
            goto L4
        L2d:
            return
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(java.util.List<java.lang.String> r7) {
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.background.greedy.GreedyScheduler.TAG
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = "Constraints not met: Cancelling work ID %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r1.debug(r2, r3, r4)
            androidx.work.impl.WorkManagerImpl r1 = r6.mWorkManagerImpl
            r1.stopWork(r0)
            goto L4
        L2d:
            return
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.removeConstraintTrackingFor(r1)
            return
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(androidx.work.impl.model.WorkSpec... r14) {
            r13 = this;
            java.lang.Boolean r0 = r13.mInDefaultProcess
            if (r0 != 0) goto L7
            r13.checkDefaultProcess()
        L7:
            java.lang.Boolean r0 = r13.mInDefaultProcess
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L1e
            androidx.work.Logger r14 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.greedy.GreedyScheduler.TAG
            java.lang.String r2 = "Ignoring schedule request in a secondary process"
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r14.info(r0, r2, r1)
            return
        L1e:
            r13.registerExecutionListenerIfNeeded()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int r3 = r14.length
            r4 = 0
        L2d:
            r5 = 1
            if (r4 >= r3) goto Lc4
            r6 = r14[r4]
            long r7 = r6.calculateNextRunTime()
            long r9 = java.lang.System.currentTimeMillis()
            androidx.work.WorkInfo$State r11 = r6.state
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo.State.ENQUEUED
            if (r11 != r12) goto Lc0
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 >= 0) goto L4d
            androidx.work.impl.background.greedy.DelayedWorkTracker r5 = r13.mDelayedWorkTracker
            if (r5 == 0) goto Lc0
            r5.schedule(r6)
            goto Lc0
        L4d:
            boolean r7 = r6.hasConstraints()
            if (r7 == 0) goto La2
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            if (r7 < r8) goto L77
            androidx.work.Constraints r8 = r6.constraints
            boolean r8 = r8.requiresDeviceIdle()
            if (r8 == 0) goto L77
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r8 = androidx.work.impl.background.greedy.GreedyScheduler.TAG
            java.lang.String r9 = "Ignoring WorkSpec %s, Requires device idle."
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r6
            java.lang.String r5 = java.lang.String.format(r9, r5)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r1]
            r7.debug(r8, r5, r6)
            goto Lc0
        L77:
            r8 = 24
            if (r7 < r8) goto L99
            androidx.work.Constraints r7 = r6.constraints
            boolean r7 = r7.hasContentUriTriggers()
            if (r7 == 0) goto L99
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r8 = androidx.work.impl.background.greedy.GreedyScheduler.TAG
            java.lang.String r9 = "Ignoring WorkSpec %s, Requires ContentUri triggers."
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r6
            java.lang.String r5 = java.lang.String.format(r9, r5)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r1]
            r7.debug(r8, r5, r6)
            goto Lc0
        L99:
            r0.add(r6)
            java.lang.String r5 = r6.id
            r2.add(r5)
            goto Lc0
        La2:
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r8 = androidx.work.impl.background.greedy.GreedyScheduler.TAG
            java.lang.String r9 = "Starting work for %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r10 = r6.id
            r5[r1] = r10
            java.lang.String r5 = java.lang.String.format(r9, r5)
            java.lang.Throwable[] r9 = new java.lang.Throwable[r1]
            r7.debug(r8, r5, r9)
            androidx.work.impl.WorkManagerImpl r5 = r13.mWorkManagerImpl
            java.lang.String r6 = r6.id
            r5.startWork(r6)
        Lc0:
            int r4 = r4 + 1
            goto L2d
        Lc4:
            java.lang.Object r14 = r13.mLock
            monitor-enter(r14)
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lf6
            if (r3 != 0) goto Lf4
            androidx.work.Logger r3 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r4 = androidx.work.impl.background.greedy.GreedyScheduler.TAG     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r6 = "Starting tracking for [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r7 = ","
            java.lang.String r2 = android.text.TextUtils.join(r7, r2)     // Catch: java.lang.Throwable -> Lf6
            r5[r1] = r2     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r2 = java.lang.String.format(r6, r5)     // Catch: java.lang.Throwable -> Lf6
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]     // Catch: java.lang.Throwable -> Lf6
            r3.debug(r4, r2, r1)     // Catch: java.lang.Throwable -> Lf6
            java.util.Set<androidx.work.impl.model.WorkSpec> r1 = r13.mConstrainedWorkSpecs     // Catch: java.lang.Throwable -> Lf6
            r1.addAll(r0)     // Catch: java.lang.Throwable -> Lf6
            androidx.work.impl.constraints.WorkConstraintsTracker r0 = r13.mWorkConstraintsTracker     // Catch: java.lang.Throwable -> Lf6
            java.util.Set<androidx.work.impl.model.WorkSpec> r1 = r13.mConstrainedWorkSpecs     // Catch: java.lang.Throwable -> Lf6
            r0.replace(r1)     // Catch: java.lang.Throwable -> Lf6
        Lf4:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lf6
            return
        Lf6:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lf6
            throw r0
    }
}
