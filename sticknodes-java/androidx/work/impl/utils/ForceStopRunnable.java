package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class ForceStopRunnable implements java.lang.Runnable {
    private static final java.lang.String TAG = null;
    private static final long TEN_YEARS = 0;
    private final android.content.Context mContext;
    private int mRetryCount;
    private final androidx.work.impl.WorkManagerImpl mWorkManager;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final java.lang.String TAG = null;

        static {
                java.lang.String r0 = "ForceStopRunnable$Rcvr"
                java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
                androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.TAG = r0
                return
        }

        public BroadcastReceiver() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
                r3 = this;
                if (r5 == 0) goto L1f
                java.lang.String r5 = r5.getAction()
                java.lang.String r0 = "ACTION_FORCE_STOP_RESCHEDULE"
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L1f
                androidx.work.Logger r5 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.TAG
                r1 = 0
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                java.lang.String r2 = "Rescheduling alarm that keeps track of force-stops."
                r5.verbose(r0, r2, r1)
                androidx.work.impl.utils.ForceStopRunnable.setAlarm(r4)
            L1f:
                return
        }
    }

    static {
            java.lang.String r0 = "ForceStopRunnable"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.ForceStopRunnable.TAG = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r1 = 3650(0xe42, double:1.8033E-320)
            long r0 = r0.toMillis(r1)
            androidx.work.impl.utils.ForceStopRunnable.TEN_YEARS = r0
            return
    }

    public ForceStopRunnable(android.content.Context r1, androidx.work.impl.WorkManagerImpl r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.mContext = r1
            r0.mWorkManager = r2
            r1 = 0
            r0.mRetryCount = r1
            return
    }

    static android.content.Intent getIntent(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r2 = androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.class
            r1.<init>(r3, r2)
            r0.setComponent(r1)
            java.lang.String r3 = "ACTION_FORCE_STOP_RESCHEDULE"
            r0.setAction(r3)
            return r0
    }

    private static android.app.PendingIntent getPendingIntent(android.content.Context r2, int r3) {
            android.content.Intent r0 = getIntent(r2)
            r1 = -1
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r2, r1, r0, r3)
            return r2
    }

    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    static void setAlarm(android.content.Context r5) {
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            boolean r1 = androidx.core.os.BuildCompat.isAtLeastS()
            if (r1 == 0) goto L11
            r1 = 167772160(0xa000000, float:6.162976E-33)
            goto L13
        L11:
            r1 = 134217728(0x8000000, float:3.85186E-34)
        L13:
            android.app.PendingIntent r5 = getPendingIntent(r5, r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = androidx.work.impl.utils.ForceStopRunnable.TEN_YEARS
            long r1 = r1 + r3
            if (r0 == 0) goto L24
            r3 = 0
            r0.setExact(r3, r1, r5)
        L24:
            return
    }

    public boolean cleanUp() {
            r12 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 < r2) goto L10
            android.content.Context r0 = r12.mContext
            androidx.work.impl.WorkManagerImpl r2 = r12.mWorkManager
            boolean r0 = androidx.work.impl.background.systemjob.SystemJobScheduler.reconcileJobs(r0, r2)
            goto L11
        L10:
            r0 = 0
        L11:
            androidx.work.impl.WorkManagerImpl r2 = r12.mWorkManager
            androidx.work.impl.WorkDatabase r2 = r2.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r3 = r2.workSpecDao()
            androidx.work.impl.model.WorkProgressDao r4 = r2.workProgressDao()
            r2.beginTransaction()
            java.util.List r5 = r3.getRunningWork()     // Catch: java.lang.Throwable -> L66
            r6 = 1
            if (r5 == 0) goto L31
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r7 != 0) goto L31
            r7 = 1
            goto L32
        L31:
            r7 = 0
        L32:
            if (r7 == 0) goto L57
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L66
        L38:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L57
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> L66
            androidx.work.impl.model.WorkSpec r8 = (androidx.work.impl.model.WorkSpec) r8     // Catch: java.lang.Throwable -> L66
            androidx.work.WorkInfo$State r9 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L66
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L66
            java.lang.String r11 = r8.id     // Catch: java.lang.Throwable -> L66
            r10[r1] = r11     // Catch: java.lang.Throwable -> L66
            r3.setState(r9, r10)     // Catch: java.lang.Throwable -> L66
            java.lang.String r8 = r8.id     // Catch: java.lang.Throwable -> L66
            r9 = -1
            r3.markWorkSpecScheduled(r8, r9)     // Catch: java.lang.Throwable -> L66
            goto L38
        L57:
            r4.deleteAll()     // Catch: java.lang.Throwable -> L66
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L66
            r2.endTransaction()
            if (r7 != 0) goto L64
            if (r0 == 0) goto L65
        L64:
            r1 = 1
        L65:
            return r1
        L66:
            r0 = move-exception
            r2.endTransaction()
            throw r0
    }

    public void forceStopRunnable() {
            r5 = this;
            boolean r0 = r5.cleanUp()
            boolean r1 = r5.shouldRescheduleWorkers()
            r2 = 0
            if (r1 == 0) goto L27
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            java.lang.String r4 = "Rescheduling Workers."
            r0.debug(r1, r4, r3)
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager
            r0.rescheduleEligibleWork()
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager
            androidx.work.impl.utils.PreferenceUtils r0 = r0.getPreferenceUtils()
            r0.setNeedsReschedule(r2)
            goto L64
        L27:
            boolean r1 = r5.isForceStopped()
            if (r1 == 0) goto L40
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            java.lang.String r3 = "Application was force-stopped, rescheduling."
            r0.debug(r1, r3, r2)
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager
            r0.rescheduleEligibleWork()
            goto L64
        L40:
            if (r0 == 0) goto L64
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            java.lang.String r3 = "Found unfinished work, scheduling it."
            r0.debug(r1, r3, r2)
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager
            androidx.work.Configuration r0 = r0.getConfiguration()
            androidx.work.impl.WorkManagerImpl r1 = r5.mWorkManager
            androidx.work.impl.WorkDatabase r1 = r1.getWorkDatabase()
            androidx.work.impl.WorkManagerImpl r2 = r5.mWorkManager
            java.util.List r2 = r2.getSchedulers()
            androidx.work.impl.Schedulers.schedule(r0, r1, r2)
        L64:
            return
    }

    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public boolean isForceStopped() {
            r6 = this;
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = 0
            r2 = 1
            boolean r3 = androidx.core.os.BuildCompat.isAtLeastS()     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            if (r3 == 0) goto Lc
            r0 = 570425344(0x22000000, float:1.7347235E-18)
        Lc:
            android.content.Context r3 = r6.mContext     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            android.app.PendingIntent r0 = getPendingIntent(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            r4 = 30
            if (r3 < r4) goto L4d
            if (r0 == 0) goto L1d
            r0.cancel()     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
        L1d:
            android.content.Context r0 = r6.mContext     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            java.lang.String r3 = "activity"
            java.lang.Object r0 = r0.getSystemService(r3)     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            r3 = 0
            java.util.List r0 = r0.getHistoricalProcessExitReasons(r3, r1, r1)     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            if (r0 == 0) goto L55
            boolean r3 = r0.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            if (r3 != 0) goto L55
            r3 = 0
        L35:
            int r4 = r0.size()     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            if (r3 >= r4) goto L55
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            android.app.ApplicationExitInfo r4 = (android.app.ApplicationExitInfo) r4     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            int r4 = r4.getReason()     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            r5 = 10
            if (r4 != r5) goto L4a
            return r2
        L4a:
            int r3 = r3 + 1
            goto L35
        L4d:
            if (r0 != 0) goto L55
            android.content.Context r0 = r6.mContext     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            setAlarm(r0)     // Catch: java.lang.IllegalArgumentException -> L56 java.lang.SecurityException -> L58
            return r2
        L55:
            return r1
        L56:
            r0 = move-exception
            goto L59
        L58:
            r0 = move-exception
        L59:
            androidx.work.Logger r3 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r5[r1] = r0
            java.lang.String r0 = "Ignoring exception"
            r3.warning(r4, r0, r5)
            return r2
    }

    public boolean multiProcessChecks() {
            r6 = this;
            androidx.work.impl.WorkManagerImpl r0 = r6.mWorkManager
            androidx.work.Configuration r0 = r0.getConfiguration()
            java.lang.String r1 = r0.getDefaultProcessName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L20
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            java.lang.String r4 = "The default process name was not specified."
            r0.debug(r1, r4, r3)
            return r2
        L20:
            android.content.Context r1 = r6.mContext
            boolean r0 = androidx.work.impl.utils.ProcessUtils.isDefaultProcess(r1, r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r2[r3] = r5
            java.lang.String r5 = "Is default app process = %s"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r1.debug(r4, r2, r3)
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r11 = this;
            boolean r0 = r11.multiProcessChecks()     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto Lc
            androidx.work.impl.WorkManagerImpl r0 = r11.mWorkManager
            r0.onForceStopRunnableCompleted()
            return
        Lc:
            android.content.Context r0 = r11.mContext     // Catch: java.lang.Throwable -> L98
            androidx.work.impl.WorkDatabasePathHelper.migrateDatabase(r0)     // Catch: java.lang.Throwable -> L98
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "Performing cleanup operations."
            r3 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L98
            r0.debug(r1, r2, r4)     // Catch: java.lang.Throwable -> L98
            r11.forceStopRunnable()     // Catch: android.database.sqlite.SQLiteAccessPermException -> L23 android.database.sqlite.SQLiteConstraintException -> L25 android.database.sqlite.SQLiteTableLockedException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L29 android.database.sqlite.SQLiteDatabaseCorruptException -> L2b android.database.sqlite.SQLiteCantOpenDatabaseException -> L2d java.lang.Throwable -> L98
            goto L67
        L23:
            r0 = move-exception
            goto L2e
        L25:
            r0 = move-exception
            goto L2e
        L27:
            r0 = move-exception
            goto L2e
        L29:
            r0 = move-exception
            goto L2e
        L2b:
            r0 = move-exception
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            int r1 = r11.mRetryCount     // Catch: java.lang.Throwable -> L98
            r2 = 1
            int r1 = r1 + r2
            r11.mRetryCount = r1     // Catch: java.lang.Throwable -> L98
            r4 = 3
            if (r1 < r4) goto L6e
            java.lang.String r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            androidx.work.Logger r4 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = androidx.work.impl.utils.ForceStopRunnable.TAG     // Catch: java.lang.Throwable -> L98
            java.lang.Throwable[] r6 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L98
            r6[r3] = r0     // Catch: java.lang.Throwable -> L98
            r4.error(r5, r1, r6)     // Catch: java.lang.Throwable -> L98
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L98
            r4.<init>(r1, r0)     // Catch: java.lang.Throwable -> L98
            androidx.work.impl.WorkManagerImpl r0 = r11.mWorkManager     // Catch: java.lang.Throwable -> L98
            androidx.work.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L98
            androidx.work.InitializationExceptionHandler r0 = r0.getExceptionHandler()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L6d
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "Routing exception to the specified exception handler"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L98
            r2[r3] = r4     // Catch: java.lang.Throwable -> L98
            r1.debug(r5, r6, r2)     // Catch: java.lang.Throwable -> L98
            r0.handleException(r4)     // Catch: java.lang.Throwable -> L98
        L67:
            androidx.work.impl.WorkManagerImpl r0 = r11.mWorkManager
            r0.onForceStopRunnableCompleted()
            return
        L6d:
            throw r4     // Catch: java.lang.Throwable -> L98
        L6e:
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L98
            r6 = 300(0x12c, double:1.48E-321)
            long r4 = r4 * r6
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = androidx.work.impl.utils.ForceStopRunnable.TAG     // Catch: java.lang.Throwable -> L98
            java.lang.String r9 = "Retrying after %s"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L98
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L98
            r10[r3] = r4     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = java.lang.String.format(r9, r10)     // Catch: java.lang.Throwable -> L98
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L98
            r2[r3] = r0     // Catch: java.lang.Throwable -> L98
            r1.debug(r8, r4, r2)     // Catch: java.lang.Throwable -> L98
            int r0 = r11.mRetryCount     // Catch: java.lang.Throwable -> L98
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L98
            long r0 = r0 * r6
            r11.sleep(r0)     // Catch: java.lang.Throwable -> L98
            goto Lc
        L98:
            r0 = move-exception
            androidx.work.impl.WorkManagerImpl r1 = r11.mWorkManager
            r1.onForceStopRunnableCompleted()
            throw r0
    }

    boolean shouldRescheduleWorkers() {
            r1 = this;
            androidx.work.impl.WorkManagerImpl r0 = r1.mWorkManager
            androidx.work.impl.utils.PreferenceUtils r0 = r0.getPreferenceUtils()
            boolean r0 = r0.getNeedsReschedule()
            return r0
    }

    public void sleep(long r1) {
            r0 = this;
            java.lang.Thread.sleep(r1)     // Catch: java.lang.InterruptedException -> L3
        L3:
            return
    }
}
