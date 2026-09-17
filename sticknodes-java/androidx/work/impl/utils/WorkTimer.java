package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class WorkTimer {
    private static final java.lang.String TAG = null;
    private final java.util.concurrent.ThreadFactory mBackgroundThreadFactory;
    private final java.util.concurrent.ScheduledExecutorService mExecutorService;
    final java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> mListeners;
    final java.lang.Object mLock;
    final java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> mTimerMap;


    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(java.lang.String r1);
    }

    public static class WorkTimerRunnable implements java.lang.Runnable {
        private final java.lang.String mWorkSpecId;
        private final androidx.work.impl.utils.WorkTimer mWorkTimer;

        WorkTimerRunnable(androidx.work.impl.utils.WorkTimer r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.mWorkTimer = r1
                r0.mWorkSpecId = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                androidx.work.impl.utils.WorkTimer r0 = r7.mWorkTimer
                java.lang.Object r0 = r0.mLock
                monitor-enter(r0)
                androidx.work.impl.utils.WorkTimer r1 = r7.mWorkTimer     // Catch: java.lang.Throwable -> L42
                java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$WorkTimerRunnable> r1 = r1.mTimerMap     // Catch: java.lang.Throwable -> L42
                java.lang.String r2 = r7.mWorkSpecId     // Catch: java.lang.Throwable -> L42
                java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L42
                androidx.work.impl.utils.WorkTimer$WorkTimerRunnable r1 = (androidx.work.impl.utils.WorkTimer.WorkTimerRunnable) r1     // Catch: java.lang.Throwable -> L42
                if (r1 == 0) goto L27
                androidx.work.impl.utils.WorkTimer r1 = r7.mWorkTimer     // Catch: java.lang.Throwable -> L42
                java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener> r1 = r1.mListeners     // Catch: java.lang.Throwable -> L42
                java.lang.String r2 = r7.mWorkSpecId     // Catch: java.lang.Throwable -> L42
                java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L42
                androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener r1 = (androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener) r1     // Catch: java.lang.Throwable -> L42
                if (r1 == 0) goto L40
                java.lang.String r2 = r7.mWorkSpecId     // Catch: java.lang.Throwable -> L42
                r1.onTimeLimitExceeded(r2)     // Catch: java.lang.Throwable -> L42
                goto L40
            L27:
                androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L42
                java.lang.String r2 = "WrkTimerRunnable"
                java.lang.String r3 = "Timer with %s is already marked as complete."
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L42
                java.lang.String r5 = r7.mWorkSpecId     // Catch: java.lang.Throwable -> L42
                r6 = 0
                r4[r6] = r5     // Catch: java.lang.Throwable -> L42
                java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L42
                java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L42
                r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L42
            L40:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                return
            L42:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                throw r1
        }
    }

    static {
            java.lang.String r0 = "WorkTimer"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.WorkTimer.TAG = r0
            return
    }

    public WorkTimer() {
            r2 = this;
            r2.<init>()
            androidx.work.impl.utils.WorkTimer$1 r0 = new androidx.work.impl.utils.WorkTimer$1
            r0.<init>(r2)
            r2.mBackgroundThreadFactory = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mTimerMap = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mListeners = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.mLock = r1
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            r2.mExecutorService = r0
            return
    }

    public void onDestroy() {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r1.mExecutorService
            boolean r0 = r0.isShutdown()
            if (r0 != 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = r1.mExecutorService
            r0.shutdownNow()
        Ld:
            return
    }

    public void startTimer(java.lang.String r7, long r8, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener r10) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = androidx.work.impl.utils.WorkTimer.TAG     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "Starting timer for %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L35
            r5 = 0
            r4[r5] = r7     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch: java.lang.Throwable -> L35
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L35
            r6.stopTimer(r7)     // Catch: java.lang.Throwable -> L35
            androidx.work.impl.utils.WorkTimer$WorkTimerRunnable r1 = new androidx.work.impl.utils.WorkTimer$WorkTimerRunnable     // Catch: java.lang.Throwable -> L35
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L35
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$WorkTimerRunnable> r2 = r6.mTimerMap     // Catch: java.lang.Throwable -> L35
            r2.put(r7, r1)     // Catch: java.lang.Throwable -> L35
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener> r2 = r6.mListeners     // Catch: java.lang.Throwable -> L35
            r2.put(r7, r10)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ScheduledExecutorService r7 = r6.mExecutorService     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L35
            r7.schedule(r1, r8, r10)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r7
    }

    public void stopTimer(java.lang.String r7) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$WorkTimerRunnable> r1 = r6.mTimerMap     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.remove(r7)     // Catch: java.lang.Throwable -> L2b
            androidx.work.impl.utils.WorkTimer$WorkTimerRunnable r1 = (androidx.work.impl.utils.WorkTimer.WorkTimerRunnable) r1     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L29
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = androidx.work.impl.utils.WorkTimer.TAG     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Stopping timer for %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L2b
            r5 = 0
            r4[r5] = r7     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch: java.lang.Throwable -> L2b
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L2b
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener> r1 = r6.mListeners     // Catch: java.lang.Throwable -> L2b
            r1.remove(r7)     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r7
    }
}
