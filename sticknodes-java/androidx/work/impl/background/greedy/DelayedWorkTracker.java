package androidx.work.impl.background.greedy;

/* loaded from: classes.dex */
public class DelayedWorkTracker {
    static final java.lang.String TAG = null;
    final androidx.work.impl.background.greedy.GreedyScheduler mGreedyScheduler;
    private final androidx.work.RunnableScheduler mRunnableScheduler;
    private final java.util.Map<java.lang.String, java.lang.Runnable> mRunnables;


    static {
            java.lang.String r0 = "DelayedWorkTracker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.greedy.DelayedWorkTracker.TAG = r0
            return
    }

    public DelayedWorkTracker(androidx.work.impl.background.greedy.GreedyScheduler r1, androidx.work.RunnableScheduler r2) {
            r0 = this;
            r0.<init>()
            r0.mGreedyScheduler = r1
            r0.mRunnableScheduler = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mRunnables = r1
            return
    }

    public void schedule(androidx.work.impl.model.WorkSpec r6) {
            r5 = this;
            java.util.Map<java.lang.String, java.lang.Runnable> r0 = r5.mRunnables
            java.lang.String r1 = r6.id
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L11
            androidx.work.RunnableScheduler r1 = r5.mRunnableScheduler
            r1.cancel(r0)
        L11:
            androidx.work.impl.background.greedy.DelayedWorkTracker$1 r0 = new androidx.work.impl.background.greedy.DelayedWorkTracker$1
            r0.<init>(r5, r6)
            java.util.Map<java.lang.String, java.lang.Runnable> r1 = r5.mRunnables
            java.lang.String r2 = r6.id
            r1.put(r2, r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r6.calculateNextRunTime()
            long r3 = r3 - r1
            androidx.work.RunnableScheduler r6 = r5.mRunnableScheduler
            r6.scheduleWithDelay(r3, r0)
            return
    }

    public void unschedule(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Runnable> r0 = r1.mRunnables
            java.lang.Object r2 = r0.remove(r2)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto Lf
            androidx.work.RunnableScheduler r0 = r1.mRunnableScheduler
            r0.cancel(r2)
        Lf:
            return
    }
}
