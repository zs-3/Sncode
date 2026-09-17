package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class EnqueueRunnable implements java.lang.Runnable {
    private static final java.lang.String TAG = null;
    private final androidx.work.impl.OperationImpl mOperation;
    private final androidx.work.impl.WorkContinuationImpl mWorkContinuation;

    static {
            java.lang.String r0 = "EnqueueRunnable"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.EnqueueRunnable.TAG = r0
            return
    }

    public EnqueueRunnable(androidx.work.impl.WorkContinuationImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mWorkContinuation = r1
            androidx.work.impl.OperationImpl r1 = new androidx.work.impl.OperationImpl
            r1.<init>()
            r0.mOperation = r1
            return
    }

    private static boolean enqueueContinuation(androidx.work.impl.WorkContinuationImpl r5) {
            java.util.Set r0 = androidx.work.impl.WorkContinuationImpl.prerequisitesFor(r5)
            androidx.work.impl.WorkManagerImpl r1 = r5.getWorkManagerImpl()
            java.util.List r2 = r5.getWork()
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String r3 = r5.getName()
            androidx.work.ExistingWorkPolicy r4 = r5.getExistingWorkPolicy()
            boolean r0 = enqueueWorkWithPrerequisites(r1, r2, r0, r3, r4)
            r5.markEnqueued()
            return r0
    }

    private static boolean enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl r19, java.util.List<? extends androidx.work.WorkRequest> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.ExistingWorkPolicy r23) {
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.getWorkDatabase()
            r7 = 1
            if (r1 == 0) goto L18
            int r9 = r1.length
            if (r9 <= 0) goto L18
            r9 = 1
            goto L19
        L18:
            r9 = 0
        L19:
            if (r9 == 0) goto L5d
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L20:
            if (r11 >= r10) goto L60
            r15 = r1[r11]
            androidx.work.impl.model.WorkSpecDao r8 = r6.workSpecDao()
            androidx.work.impl.model.WorkSpec r8 = r8.getWorkSpec(r15)
            if (r8 != 0) goto L45
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.EnqueueRunnable.TAG
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.error(r1, r2, r4)
            return r3
        L45:
            androidx.work.WorkInfo$State r8 = r8.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r8 != r15) goto L4d
            r15 = 1
            goto L4e
        L4d:
            r15 = 0
        L4e:
            r12 = r12 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r8 != r15) goto L55
            r14 = 1
            goto L5a
        L55:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r8 != r15) goto L5a
            r13 = 1
        L5a:
            int r11 = r11 + 1
            goto L20
        L5d:
            r12 = 1
            r13 = 0
            r14 = 0
        L60:
            boolean r8 = android.text.TextUtils.isEmpty(r22)
            r8 = r8 ^ r7
            if (r8 == 0) goto L6b
            if (r9 != 0) goto L6b
            r10 = 1
            goto L6c
        L6b:
            r10 = 0
        L6c:
            if (r10 == 0) goto L14e
            androidx.work.impl.model.WorkSpecDao r10 = r6.workSpecDao()
            java.util.List r10 = r10.getWorkSpecIdAndStatesForName(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L14e
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.APPEND
            if (r3 == r11) goto Lca
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r3 != r11) goto L85
            goto Lca
        L85:
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.KEEP
            if (r3 != r11) goto La5
            java.util.Iterator r3 = r10.iterator()
        L8d:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto La5
            java.lang.Object r11 = r3.next()
            androidx.work.impl.model.WorkSpec$IdAndState r11 = (androidx.work.impl.model.WorkSpec.IdAndState) r11
            androidx.work.WorkInfo$State r11 = r11.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r11 == r15) goto La3
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.RUNNING
            if (r11 != r15) goto L8d
        La3:
            r11 = 0
            return r11
        La5:
            r11 = 0
            androidx.work.impl.utils.CancelWorkRunnable r3 = androidx.work.impl.utils.CancelWorkRunnable.forName(r2, r0, r11)
            r3.run()
            androidx.work.impl.model.WorkSpecDao r3 = r6.workSpecDao()
            java.util.Iterator r10 = r10.iterator()
        Lb5:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto Lc7
            java.lang.Object r15 = r10.next()
            androidx.work.impl.model.WorkSpec$IdAndState r15 = (androidx.work.impl.model.WorkSpec.IdAndState) r15
            java.lang.String r15 = r15.id
            r3.delete(r15)
            goto Lb5
        Lc7:
            r3 = 1
            goto L14f
        Lca:
            r11 = 0
            androidx.work.impl.model.DependencyDao r9 = r6.dependencyDao()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        Ld8:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L113
            java.lang.Object r16 = r10.next()
            r7 = r16
            androidx.work.impl.model.WorkSpec$IdAndState r7 = (androidx.work.impl.model.WorkSpec.IdAndState) r7
            java.lang.String r11 = r7.id
            boolean r11 = r9.hasDependents(r11)
            if (r11 != 0) goto L10c
            androidx.work.WorkInfo$State r11 = r7.state
            r17 = r9
            androidx.work.WorkInfo$State r9 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r11 != r9) goto Lf8
            r9 = 1
            goto Lf9
        Lf8:
            r9 = 0
        Lf9:
            r9 = r9 & r12
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo.State.FAILED
            if (r11 != r12) goto L100
            r14 = 1
            goto L105
        L100:
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo.State.CANCELLED
            if (r11 != r12) goto L105
            r13 = 1
        L105:
            java.lang.String r7 = r7.id
            r15.add(r7)
            r12 = r9
            goto L10e
        L10c:
            r17 = r9
        L10e:
            r9 = r17
            r7 = 1
            r11 = 0
            goto Ld8
        L113:
            androidx.work.ExistingWorkPolicy r7 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r3 != r7) goto L140
            if (r13 != 0) goto L11b
            if (r14 == 0) goto L140
        L11b:
            androidx.work.impl.model.WorkSpecDao r3 = r6.workSpecDao()
            java.util.List r7 = r3.getWorkSpecIdAndStatesForName(r2)
            java.util.Iterator r7 = r7.iterator()
        L127:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L139
            java.lang.Object r9 = r7.next()
            androidx.work.impl.model.WorkSpec$IdAndState r9 = (androidx.work.impl.model.WorkSpec.IdAndState) r9
            java.lang.String r9 = r9.id
            r3.delete(r9)
            goto L127
        L139:
            java.util.List r15 = java.util.Collections.emptyList()
            r3 = 0
            r13 = 0
            goto L141
        L140:
            r3 = r14
        L141:
            java.lang.Object[] r1 = r15.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r7 = r1.length
            if (r7 <= 0) goto L14c
            r9 = 1
            goto L14d
        L14c:
            r9 = 0
        L14d:
            r14 = r3
        L14e:
            r3 = 0
        L14f:
            java.util.Iterator r7 = r20.iterator()
        L153:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L210
            java.lang.Object r10 = r7.next()
            androidx.work.WorkRequest r10 = (androidx.work.WorkRequest) r10
            androidx.work.impl.model.WorkSpec r11 = r10.getWorkSpec()
            if (r9 == 0) goto L17a
            if (r12 != 0) goto L17a
            if (r14 == 0) goto L16e
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            r11.state = r15
            goto L182
        L16e:
            if (r13 == 0) goto L175
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            r11.state = r15
            goto L182
        L175:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.BLOCKED
            r11.state = r15
            goto L182
        L17a:
            boolean r15 = r11.isPeriodic()
            if (r15 != 0) goto L185
            r11.periodStartTime = r4
        L182:
            r17 = r4
            goto L18b
        L185:
            r17 = r4
            r4 = 0
            r11.periodStartTime = r4
        L18b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L199
            r5 = 25
            if (r4 > r5) goto L199
            tryDelegateConstrainedWorkSpec(r11)
            goto L1a8
        L199:
            r5 = 22
            if (r4 > r5) goto L1a8
            java.lang.String r4 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r4 = usesScheduler(r0, r4)
            if (r4 == 0) goto L1a8
            tryDelegateConstrainedWorkSpec(r11)
        L1a8:
            androidx.work.WorkInfo$State r4 = r11.state
            androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.ENQUEUED
            if (r4 != r5) goto L1af
            r3 = 1
        L1af:
            androidx.work.impl.model.WorkSpecDao r4 = r6.workSpecDao()
            r4.insertWorkSpec(r11)
            if (r9 == 0) goto L1d3
            int r4 = r1.length
            r5 = 0
        L1ba:
            if (r5 >= r4) goto L1d3
            r11 = r1[r5]
            androidx.work.impl.model.Dependency r15 = new androidx.work.impl.model.Dependency
            java.lang.String r0 = r10.getStringId()
            r15.<init>(r0, r11)
            androidx.work.impl.model.DependencyDao r0 = r6.dependencyDao()
            r0.insertDependency(r15)
            int r5 = r5 + 1
            r0 = r19
            goto L1ba
        L1d3:
            java.util.Set r0 = r10.getTags()
            java.util.Iterator r0 = r0.iterator()
        L1db:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1f8
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.work.impl.model.WorkTagDao r5 = r6.workTagDao()
            androidx.work.impl.model.WorkTag r11 = new androidx.work.impl.model.WorkTag
            java.lang.String r15 = r10.getStringId()
            r11.<init>(r4, r15)
            r5.insert(r11)
            goto L1db
        L1f8:
            if (r8 == 0) goto L20a
            androidx.work.impl.model.WorkNameDao r0 = r6.workNameDao()
            androidx.work.impl.model.WorkName r4 = new androidx.work.impl.model.WorkName
            java.lang.String r5 = r10.getStringId()
            r4.<init>(r2, r5)
            r0.insert(r4)
        L20a:
            r0 = r19
            r4 = r17
            goto L153
        L210:
            return r3
    }

    private static boolean processContinuation(androidx.work.impl.WorkContinuationImpl r8) {
            java.util.List r0 = r8.getParents()
            r1 = 0
            if (r0 == 0) goto L46
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r0.next()
            androidx.work.impl.WorkContinuationImpl r3 = (androidx.work.impl.WorkContinuationImpl) r3
            boolean r4 = r3.isEnqueued()
            if (r4 != 0) goto L24
            boolean r3 = processContinuation(r3)
            r2 = r2 | r3
            goto Lc
        L24:
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = androidx.work.impl.utils.EnqueueRunnable.TAG
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.util.List r3 = r3.getIds()
            java.lang.String r7 = ", "
            java.lang.String r3 = android.text.TextUtils.join(r7, r3)
            r6[r1] = r3
            java.lang.String r3 = "Already enqueued work ids (%s)."
            java.lang.String r3 = java.lang.String.format(r3, r6)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r1]
            r4.warning(r5, r3, r6)
            goto Lc
        L45:
            r1 = r2
        L46:
            boolean r8 = enqueueContinuation(r8)
            r8 = r8 | r1
            return r8
    }

    private static void tryDelegateConstrainedWorkSpec(androidx.work.impl.model.WorkSpec r5) {
            java.lang.Class<androidx.work.impl.workers.ConstraintTrackingWorker> r0 = androidx.work.impl.workers.ConstraintTrackingWorker.class
            androidx.work.Constraints r1 = r5.constraints
            java.lang.String r2 = r5.workerClassName
            java.lang.String r3 = r0.getName()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L38
            boolean r3 = r1.requiresBatteryNotLow()
            if (r3 != 0) goto L1c
            boolean r1 = r1.requiresStorageNotLow()
            if (r1 == 0) goto L38
        L1c:
            androidx.work.Data$Builder r1 = new androidx.work.Data$Builder
            r1.<init>()
            androidx.work.Data r3 = r5.input
            androidx.work.Data$Builder r3 = r1.putAll(r3)
            java.lang.String r4 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            r3.putString(r4, r2)
            java.lang.String r0 = r0.getName()
            r5.workerClassName = r0
            androidx.work.Data r0 = r1.build()
            r5.input = r0
        L38:
            return
    }

    private static boolean usesScheduler(androidx.work.impl.WorkManagerImpl r2, java.lang.String r3) {
            r0 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L25
            java.util.List r2 = r2.getSchedulers()     // Catch: java.lang.ClassNotFoundException -> L25
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassNotFoundException -> L25
        Ld:
            boolean r1 = r2.hasNext()     // Catch: java.lang.ClassNotFoundException -> L25
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()     // Catch: java.lang.ClassNotFoundException -> L25
            androidx.work.impl.Scheduler r1 = (androidx.work.impl.Scheduler) r1     // Catch: java.lang.ClassNotFoundException -> L25
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.ClassNotFoundException -> L25
            boolean r1 = r3.isAssignableFrom(r1)     // Catch: java.lang.ClassNotFoundException -> L25
            if (r1 == 0) goto Ld
            r2 = 1
            return r2
        L25:
            return r0
    }

    public boolean addToDatabase() {
            r2 = this;
            androidx.work.impl.WorkContinuationImpl r0 = r2.mWorkContinuation
            androidx.work.impl.WorkManagerImpl r0 = r0.getWorkManagerImpl()
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            r0.beginTransaction()
            androidx.work.impl.WorkContinuationImpl r1 = r2.mWorkContinuation     // Catch: java.lang.Throwable -> L1a
            boolean r1 = processContinuation(r1)     // Catch: java.lang.Throwable -> L1a
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1a
            r0.endTransaction()
            return r1
        L1a:
            r1 = move-exception
            r0.endTransaction()
            throw r1
    }

    public androidx.work.Operation getOperation() {
            r1 = this;
            androidx.work.impl.OperationImpl r0 = r1.mOperation
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            androidx.work.impl.WorkContinuationImpl r0 = r5.mWorkContinuation     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.hasCycles()     // Catch: java.lang.Throwable -> L3c
            r1 = 1
            if (r0 != 0) goto L29
            boolean r0 = r5.addToDatabase()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L21
            androidx.work.impl.WorkContinuationImpl r0 = r5.mWorkContinuation     // Catch: java.lang.Throwable -> L3c
            androidx.work.impl.WorkManagerImpl r0 = r0.getWorkManagerImpl()     // Catch: java.lang.Throwable -> L3c
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(r0, r2, r1)     // Catch: java.lang.Throwable -> L3c
            r5.scheduleWorkInBackground()     // Catch: java.lang.Throwable -> L3c
        L21:
            androidx.work.impl.OperationImpl r0 = r5.mOperation     // Catch: java.lang.Throwable -> L3c
            androidx.work.Operation$State$SUCCESS r1 = androidx.work.Operation.SUCCESS     // Catch: java.lang.Throwable -> L3c
            r0.setState(r1)     // Catch: java.lang.Throwable -> L3c
            goto L47
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "WorkContinuation has cycles (%s)"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            androidx.work.impl.WorkContinuationImpl r4 = r5.mWorkContinuation     // Catch: java.lang.Throwable -> L3c
            r1[r3] = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L3c
        L3c:
            r0 = move-exception
            androidx.work.impl.OperationImpl r1 = r5.mOperation
            androidx.work.Operation$State$FAILURE r2 = new androidx.work.Operation$State$FAILURE
            r2.<init>(r0)
            r1.setState(r2)
        L47:
            return
    }

    public void scheduleWorkInBackground() {
            r3 = this;
            androidx.work.impl.WorkContinuationImpl r0 = r3.mWorkContinuation
            androidx.work.impl.WorkManagerImpl r0 = r0.getWorkManagerImpl()
            androidx.work.Configuration r1 = r0.getConfiguration()
            androidx.work.impl.WorkDatabase r2 = r0.getWorkDatabase()
            java.util.List r0 = r0.getSchedulers()
            androidx.work.impl.Schedulers.schedule(r1, r2, r0)
            return
    }
}
