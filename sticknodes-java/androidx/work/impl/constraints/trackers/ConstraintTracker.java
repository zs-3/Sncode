package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public abstract class ConstraintTracker<T> {
    private static final java.lang.String TAG = null;
    protected final android.content.Context mAppContext;
    T mCurrentState;
    private final java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> mListeners;
    private final java.lang.Object mLock;
    protected final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;


    static {
            java.lang.String r0 = "ConstraintTracker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.trackers.ConstraintTracker.TAG = r0
            return
    }

    ConstraintTracker(android.content.Context r2, androidx.work.impl.utils.taskexecutor.TaskExecutor r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.mListeners = r0
            android.content.Context r2 = r2.getApplicationContext()
            r1.mAppContext = r2
            r1.mTaskExecutor = r3
            return
    }

    public void addListener(androidx.work.impl.constraints.ConstraintListener<T> r9) {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r1 = r8.mListeners     // Catch: java.lang.Throwable -> L47
            boolean r1 = r1.add(r9)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L45
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r1 = r8.mListeners     // Catch: java.lang.Throwable -> L47
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L47
            r2 = 1
            if (r1 != r2) goto L40
            java.lang.Object r1 = r8.getInitialState()     // Catch: java.lang.Throwable -> L47
            r8.mCurrentState = r1     // Catch: java.lang.Throwable -> L47
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = androidx.work.impl.constraints.trackers.ConstraintTracker.TAG     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "%s: initial state = %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L47
            java.lang.Class r6 = r8.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L47
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L47
            T r6 = r8.mCurrentState     // Catch: java.lang.Throwable -> L47
            r5[r2] = r6     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L47
            java.lang.Throwable[] r4 = new java.lang.Throwable[r7]     // Catch: java.lang.Throwable -> L47
            r1.debug(r3, r2, r4)     // Catch: java.lang.Throwable -> L47
            r8.startTracking()     // Catch: java.lang.Throwable -> L47
        L40:
            T r1 = r8.mCurrentState     // Catch: java.lang.Throwable -> L47
            r9.onConstraintChanged(r1)     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r9
    }

    public abstract T getInitialState();

    public void removeListener(androidx.work.impl.constraints.ConstraintListener<T> r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r1 = r2.mListeners     // Catch: java.lang.Throwable -> L18
            boolean r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L16
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r3 = r2.mListeners     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L16
            r2.stopTracking()     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    public void setState(T r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            T r1 = r3.mCurrentState     // Catch: java.lang.Throwable -> L2b
            if (r1 == r4) goto L29
            if (r1 == 0) goto L10
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L10
            goto L29
        L10:
            r3.mCurrentState = r4     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r1 = r3.mListeners     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r3.mTaskExecutor     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.Executor r1 = r1.getMainThreadExecutor()     // Catch: java.lang.Throwable -> L2b
            androidx.work.impl.constraints.trackers.ConstraintTracker$1 r2 = new androidx.work.impl.constraints.trackers.ConstraintTracker$1     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2b
            r1.execute(r2)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
