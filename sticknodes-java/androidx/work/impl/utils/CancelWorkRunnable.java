package androidx.work.impl.utils;

/* loaded from: classes.dex */
public abstract class CancelWorkRunnable implements java.lang.Runnable {
    private final androidx.work.impl.OperationImpl mOperation;




    public CancelWorkRunnable() {
            r1 = this;
            r1.<init>()
            androidx.work.impl.OperationImpl r0 = new androidx.work.impl.OperationImpl
            r0.<init>()
            r1.mOperation = r0
            return
    }

    public static androidx.work.impl.utils.CancelWorkRunnable forId(java.util.UUID r1, androidx.work.impl.WorkManagerImpl r2) {
            androidx.work.impl.utils.CancelWorkRunnable$1 r0 = new androidx.work.impl.utils.CancelWorkRunnable$1
            r0.<init>(r2, r1)
            return r0
    }

    public static androidx.work.impl.utils.CancelWorkRunnable forName(java.lang.String r1, androidx.work.impl.WorkManagerImpl r2, boolean r3) {
            androidx.work.impl.utils.CancelWorkRunnable$3 r0 = new androidx.work.impl.utils.CancelWorkRunnable$3
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static androidx.work.impl.utils.CancelWorkRunnable forTag(java.lang.String r1, androidx.work.impl.WorkManagerImpl r2) {
            androidx.work.impl.utils.CancelWorkRunnable$2 r0 = new androidx.work.impl.utils.CancelWorkRunnable$2
            r0.<init>(r2, r1)
            return r0
    }

    private void iterativelyCancelWorkAndDependents(androidx.work.impl.WorkDatabase r6, java.lang.String r7) {
            r5 = this;
            androidx.work.impl.model.WorkSpecDao r0 = r6.workSpecDao()
            androidx.work.impl.model.DependencyDao r6 = r6.dependencyDao()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r1.add(r7)
        L10:
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L3b
            java.lang.Object r7 = r1.remove()
            java.lang.String r7 = (java.lang.String) r7
            androidx.work.WorkInfo$State r2 = r0.getState(r7)
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r2 == r3) goto L33
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.FAILED
            if (r2 == r3) goto L33
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.CANCELLED
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r3[r4] = r7
            r0.setState(r2, r3)
        L33:
            java.util.List r7 = r6.getDependentWorkIds(r7)
            r1.addAll(r7)
            goto L10
        L3b:
            return
    }

    void cancel(androidx.work.impl.WorkManagerImpl r2, java.lang.String r3) {
            r1 = this;
            androidx.work.impl.WorkDatabase r0 = r2.getWorkDatabase()
            r1.iterativelyCancelWorkAndDependents(r0, r3)
            androidx.work.impl.Processor r0 = r2.getProcessor()
            r0.stopAndCancelWork(r3)
            java.util.List r2 = r2.getSchedulers()
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()
            androidx.work.impl.Scheduler r0 = (androidx.work.impl.Scheduler) r0
            r0.cancel(r3)
            goto L16
        L26:
            return
    }

    public androidx.work.Operation getOperation() {
            r1 = this;
            androidx.work.impl.OperationImpl r0 = r1.mOperation
            return r0
    }

    void reschedulePendingWorkers(androidx.work.impl.WorkManagerImpl r3) {
            r2 = this;
            androidx.work.Configuration r0 = r3.getConfiguration()
            androidx.work.impl.WorkDatabase r1 = r3.getWorkDatabase()
            java.util.List r3 = r3.getSchedulers()
            androidx.work.impl.Schedulers.schedule(r0, r1, r3)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            r3.runInternal()     // Catch: java.lang.Throwable -> Lb
            androidx.work.impl.OperationImpl r0 = r3.mOperation     // Catch: java.lang.Throwable -> Lb
            androidx.work.Operation$State$SUCCESS r1 = androidx.work.Operation.SUCCESS     // Catch: java.lang.Throwable -> Lb
            r0.setState(r1)     // Catch: java.lang.Throwable -> Lb
            goto L16
        Lb:
            r0 = move-exception
            androidx.work.impl.OperationImpl r1 = r3.mOperation
            androidx.work.Operation$State$FAILURE r2 = new androidx.work.Operation$State$FAILURE
            r2.<init>(r0)
            r1.setState(r2)
        L16:
            return
    }

    abstract void runInternal();
}
