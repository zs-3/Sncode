package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
class ConstraintsCommandHandler {
    private static final java.lang.String TAG = null;
    private final android.content.Context mContext;
    private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;
    private final int mStartId;
    private final androidx.work.impl.constraints.WorkConstraintsTracker mWorkConstraintsTracker;

    static {
            java.lang.String r0 = "ConstraintsCmdHandler"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.ConstraintsCommandHandler.TAG = r0
            return
    }

    ConstraintsCommandHandler(android.content.Context r2, int r3, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r4) {
            r1 = this;
            r1.<init>()
            r1.mContext = r2
            r1.mStartId = r3
            r1.mDispatcher = r4
            androidx.work.impl.utils.taskexecutor.TaskExecutor r3 = r4.getTaskExecutor()
            androidx.work.impl.constraints.WorkConstraintsTracker r4 = new androidx.work.impl.constraints.WorkConstraintsTracker
            r0 = 0
            r4.<init>(r2, r3, r0)
            r1.mWorkConstraintsTracker = r4
            return
    }

    void handleConstraintsChanged() {
            r9 = this;
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r0 = r9.mDispatcher
            androidx.work.impl.WorkManagerImpl r0 = r0.getWorkManager()
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()
            java.util.List r0 = r0.getScheduledWork()
            android.content.Context r1 = r9.mContext
            androidx.work.impl.background.systemalarm.ConstraintProxy.updateAll(r1, r0)
            androidx.work.impl.constraints.WorkConstraintsTracker r1 = r9.mWorkConstraintsTracker
            r1.replace(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            long r2 = java.lang.System.currentTimeMillis()
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r0.next()
            androidx.work.impl.model.WorkSpec r4 = (androidx.work.impl.model.WorkSpec) r4
            java.lang.String r5 = r4.id
            long r6 = r4.calculateNextRunTime()
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L2d
            boolean r6 = r4.hasConstraints()
            if (r6 == 0) goto L51
            androidx.work.impl.constraints.WorkConstraintsTracker r6 = r9.mWorkConstraintsTracker
            boolean r5 = r6.areAllConstraintsMet(r5)
            if (r5 == 0) goto L2d
        L51:
            r1.add(r4)
            goto L2d
        L55:
            java.util.Iterator r0 = r1.iterator()
        L59:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r0.next()
            androidx.work.impl.model.WorkSpec r1 = (androidx.work.impl.model.WorkSpec) r1
            java.lang.String r1 = r1.id
            android.content.Context r2 = r9.mContext
            android.content.Intent r2 = androidx.work.impl.background.systemalarm.CommandHandler.createDelayMetIntent(r2, r1)
            androidx.work.Logger r3 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.background.systemalarm.ConstraintsCommandHandler.TAG
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            java.lang.String r1 = "Creating a delay_met command for workSpec with id (%s)"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r6]
            r3.debug(r4, r1, r5)
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r1 = r9.mDispatcher
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable r3 = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable
            int r4 = r9.mStartId
            r3.<init>(r1, r2, r4)
            r1.postOnMainThread(r3)
            goto L59
        L91:
            androidx.work.impl.constraints.WorkConstraintsTracker r0 = r9.mWorkConstraintsTracker
            r0.reset()
            return
    }
}
