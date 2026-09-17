package androidx.work.impl;

/* loaded from: classes.dex */
public class WorkContinuationImpl extends androidx.work.WorkContinuation {
    private static final java.lang.String TAG = null;
    private final java.util.List<java.lang.String> mAllIds;
    private boolean mEnqueued;
    private final androidx.work.ExistingWorkPolicy mExistingWorkPolicy;
    private final java.util.List<java.lang.String> mIds;
    private final java.lang.String mName;
    private androidx.work.Operation mOperation;
    private final java.util.List<androidx.work.impl.WorkContinuationImpl> mParents;
    private final java.util.List<? extends androidx.work.WorkRequest> mWork;
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;

    static {
            java.lang.String r0 = "WorkContinuationImpl"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.WorkContinuationImpl.TAG = r0
            return
    }

    public WorkContinuationImpl(androidx.work.impl.WorkManagerImpl r1, java.lang.String r2, androidx.work.ExistingWorkPolicy r3, java.util.List<? extends androidx.work.WorkRequest> r4, java.util.List<androidx.work.impl.WorkContinuationImpl> r5) {
            r0 = this;
            r0.<init>()
            r0.mWorkManagerImpl = r1
            r0.mName = r2
            r0.mExistingWorkPolicy = r3
            r0.mWork = r4
            r0.mParents = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r4.size()
            r1.<init>(r2)
            r0.mIds = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mAllIds = r1
            if (r5 == 0) goto L39
            java.util.Iterator r1 = r5.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            androidx.work.impl.WorkContinuationImpl r2 = (androidx.work.impl.WorkContinuationImpl) r2
            java.util.List<java.lang.String> r3 = r0.mAllIds
            java.util.List<java.lang.String> r2 = r2.mAllIds
            r3.addAll(r2)
            goto L25
        L39:
            r1 = 0
        L3a:
            int r2 = r4.size()
            if (r1 >= r2) goto L57
            java.lang.Object r2 = r4.get(r1)
            androidx.work.WorkRequest r2 = (androidx.work.WorkRequest) r2
            java.lang.String r2 = r2.getStringId()
            java.util.List<java.lang.String> r3 = r0.mIds
            r3.add(r2)
            java.util.List<java.lang.String> r3 = r0.mAllIds
            r3.add(r2)
            int r1 = r1 + 1
            goto L3a
        L57:
            return
    }

    public WorkContinuationImpl(androidx.work.impl.WorkManagerImpl r7, java.util.List<? extends androidx.work.WorkRequest> r8) {
            r6 = this;
            androidx.work.ExistingWorkPolicy r3 = androidx.work.ExistingWorkPolicy.KEEP
            r2 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private static boolean hasCycles(androidx.work.impl.WorkContinuationImpl r4, java.util.Set<java.lang.String> r5) {
            java.util.List r0 = r4.getIds()
            r5.addAll(r0)
            java.util.Set r0 = prerequisitesFor(r4)
            java.util.Iterator r1 = r5.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lf
            return r3
        L23:
            java.util.List r0 = r4.getParents()
            if (r0 == 0) goto L46
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L46
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            androidx.work.impl.WorkContinuationImpl r1 = (androidx.work.impl.WorkContinuationImpl) r1
            boolean r1 = hasCycles(r1, r5)
            if (r1 == 0) goto L33
            return r3
        L46:
            java.util.List r4 = r4.getIds()
            r5.removeAll(r4)
            r4 = 0
            return r4
    }

    public static java.util.Set<java.lang.String> prerequisitesFor(androidx.work.impl.WorkContinuationImpl r2) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r2 = r2.getParents()
            if (r2 == 0) goto L29
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L29
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r2.next()
            androidx.work.impl.WorkContinuationImpl r1 = (androidx.work.impl.WorkContinuationImpl) r1
            java.util.List r1 = r1.getIds()
            r0.addAll(r1)
            goto L15
        L29:
            return r0
    }

    public androidx.work.Operation enqueue() {
            r5 = this;
            boolean r0 = r5.mEnqueued
            if (r0 != 0) goto L19
            androidx.work.impl.utils.EnqueueRunnable r0 = new androidx.work.impl.utils.EnqueueRunnable
            r0.<init>(r5)
            androidx.work.impl.WorkManagerImpl r1 = r5.mWorkManagerImpl
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r1.getWorkTaskExecutor()
            r1.executeOnBackgroundThread(r0)
            androidx.work.Operation r0 = r0.getOperation()
            r5.mOperation = r0
            goto L38
        L19:
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.WorkContinuationImpl.TAG
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.util.List<java.lang.String> r3 = r5.mIds
            java.lang.String r4 = ", "
            java.lang.String r3 = android.text.TextUtils.join(r4, r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Already enqueued work ids (%s)"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.warning(r1, r2, r3)
        L38:
            androidx.work.Operation r0 = r5.mOperation
            return r0
    }

    public androidx.work.ExistingWorkPolicy getExistingWorkPolicy() {
            r1 = this;
            androidx.work.ExistingWorkPolicy r0 = r1.mExistingWorkPolicy
            return r0
    }

    public java.util.List<java.lang.String> getIds() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mIds
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public java.util.List<androidx.work.impl.WorkContinuationImpl> getParents() {
            r1 = this;
            java.util.List<androidx.work.impl.WorkContinuationImpl> r0 = r1.mParents
            return r0
    }

    public java.util.List<? extends androidx.work.WorkRequest> getWork() {
            r1 = this;
            java.util.List<? extends androidx.work.WorkRequest> r0 = r1.mWork
            return r0
    }

    public androidx.work.impl.WorkManagerImpl getWorkManagerImpl() {
            r1 = this;
            androidx.work.impl.WorkManagerImpl r0 = r1.mWorkManagerImpl
            return r0
    }

    public boolean hasCycles() {
            r1 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r0 = hasCycles(r1, r0)
            return r0
    }

    public boolean isEnqueued() {
            r1 = this;
            boolean r0 = r1.mEnqueued
            return r0
    }

    public void markEnqueued() {
            r1 = this;
            r0 = 1
            r1.mEnqueued = r0
            return
    }
}
