package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class StopWorkRunnable implements java.lang.Runnable {
    private static final java.lang.String TAG = null;
    private final boolean mStopInForeground;
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;
    private final java.lang.String mWorkSpecId;

    static {
            java.lang.String r0 = "StopWorkRunnable"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.StopWorkRunnable.TAG = r0
            return
    }

    public StopWorkRunnable(androidx.work.impl.WorkManagerImpl r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.mWorkManagerImpl = r1
            r0.mWorkSpecId = r2
            r0.mStopInForeground = r3
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r9 = this;
            androidx.work.impl.WorkManagerImpl r0 = r9.mWorkManagerImpl
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            androidx.work.impl.WorkManagerImpl r1 = r9.mWorkManagerImpl
            androidx.work.impl.Processor r1 = r1.getProcessor()
            androidx.work.impl.model.WorkSpecDao r2 = r0.workSpecDao()
            r0.beginTransaction()
            java.lang.String r3 = r9.mWorkSpecId     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.isEnqueuedInForeground(r3)     // Catch: java.lang.Throwable -> L74
            boolean r3 = r9.mStopInForeground     // Catch: java.lang.Throwable -> L74
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L2c
            androidx.work.impl.WorkManagerImpl r1 = r9.mWorkManagerImpl     // Catch: java.lang.Throwable -> L74
            androidx.work.impl.Processor r1 = r1.getProcessor()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = r9.mWorkSpecId     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.stopForegroundWork(r2)     // Catch: java.lang.Throwable -> L74
            goto L4f
        L2c:
            if (r1 != 0) goto L43
            java.lang.String r1 = r9.mWorkSpecId     // Catch: java.lang.Throwable -> L74
            androidx.work.WorkInfo$State r1 = r2.getState(r1)     // Catch: java.lang.Throwable -> L74
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.RUNNING     // Catch: java.lang.Throwable -> L74
            if (r1 != r3) goto L43
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L74
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r9.mWorkSpecId     // Catch: java.lang.Throwable -> L74
            r3[r5] = r6     // Catch: java.lang.Throwable -> L74
            r2.setState(r1, r3)     // Catch: java.lang.Throwable -> L74
        L43:
            androidx.work.impl.WorkManagerImpl r1 = r9.mWorkManagerImpl     // Catch: java.lang.Throwable -> L74
            androidx.work.impl.Processor r1 = r1.getProcessor()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = r9.mWorkSpecId     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.stopWork(r2)     // Catch: java.lang.Throwable -> L74
        L4f:
            androidx.work.Logger r2 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = androidx.work.impl.utils.StopWorkRunnable.TAG     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = "StopWorkRunnable for %s; Processor.stopWork = %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r9.mWorkSpecId     // Catch: java.lang.Throwable -> L74
            r7[r5] = r8     // Catch: java.lang.Throwable -> L74
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L74
            r7[r4] = r1     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> L74
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch: java.lang.Throwable -> L74
            r2.debug(r3, r1, r4)     // Catch: java.lang.Throwable -> L74
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L74
            r0.endTransaction()
            return
        L74:
            r1 = move-exception
            r0.endTransaction()
            throw r1
    }
}
