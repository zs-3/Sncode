package androidx.work.impl.foreground;

/* loaded from: classes.dex */
public class SystemForegroundDispatcher implements androidx.work.impl.constraints.WorkConstraintsCallback, androidx.work.impl.ExecutionListener {
    static final java.lang.String TAG = null;
    private androidx.work.impl.foreground.SystemForegroundDispatcher.Callback mCallback;
    final androidx.work.impl.constraints.WorkConstraintsTracker mConstraintsTracker;
    private android.content.Context mContext;
    java.lang.String mCurrentForegroundWorkSpecId;
    final java.util.Map<java.lang.String, androidx.work.ForegroundInfo> mForegroundInfoById;
    final java.lang.Object mLock;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final java.util.Set<androidx.work.impl.model.WorkSpec> mTrackedWorkSpecs;
    private androidx.work.impl.WorkManagerImpl mWorkManagerImpl;
    final java.util.Map<java.lang.String, androidx.work.impl.model.WorkSpec> mWorkSpecById;


    interface Callback {
        void cancelNotification(int r1);

        void notify(int r1, android.app.Notification r2);

        void startForeground(int r1, int r2, android.app.Notification r3);

        void stop();
    }

    static {
            java.lang.String r0 = "SystemFgDispatcher"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.foreground.SystemForegroundDispatcher.TAG = r0
            return
    }

    SystemForegroundDispatcher(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.mContext = r3
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            androidx.work.impl.WorkManagerImpl r3 = androidx.work.impl.WorkManagerImpl.getInstance(r3)
            r2.mWorkManagerImpl = r3
            androidx.work.impl.utils.taskexecutor.TaskExecutor r3 = r3.getWorkTaskExecutor()
            r2.mTaskExecutor = r3
            r0 = 0
            r2.mCurrentForegroundWorkSpecId = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.mForegroundInfoById = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.mTrackedWorkSpecs = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mWorkSpecById = r0
            androidx.work.impl.constraints.WorkConstraintsTracker r0 = new androidx.work.impl.constraints.WorkConstraintsTracker
            android.content.Context r1 = r2.mContext
            r0.<init>(r1, r3, r2)
            r2.mConstraintsTracker = r0
            androidx.work.impl.WorkManagerImpl r3 = r2.mWorkManagerImpl
            androidx.work.impl.Processor r3 = r3.getProcessor()
            r3.addExecutionListener(r2)
            return
    }

    public static android.content.Intent createNotifyIntent(android.content.Context r2, java.lang.String r3, androidx.work.ForegroundInfo r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r1 = androidx.work.impl.foreground.SystemForegroundService.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ACTION_NOTIFY"
            r0.setAction(r2)
            int r2 = r4.getNotificationId()
            java.lang.String r1 = "KEY_NOTIFICATION_ID"
            r0.putExtra(r1, r2)
            int r2 = r4.getForegroundServiceType()
            java.lang.String r1 = "KEY_FOREGROUND_SERVICE_TYPE"
            r0.putExtra(r1, r2)
            android.app.Notification r2 = r4.getNotification()
            java.lang.String r4 = "KEY_NOTIFICATION"
            r0.putExtra(r4, r2)
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            r0.putExtra(r2, r3)
            return r0
    }

    public static android.content.Intent createStartForegroundIntent(android.content.Context r3, java.lang.String r4, androidx.work.ForegroundInfo r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r1 = androidx.work.impl.foreground.SystemForegroundService.class
            r0.<init>(r3, r1)
            java.lang.String r3 = "ACTION_START_FOREGROUND"
            r0.setAction(r3)
            java.lang.String r3 = "KEY_WORKSPEC_ID"
            r0.putExtra(r3, r4)
            int r1 = r5.getNotificationId()
            java.lang.String r2 = "KEY_NOTIFICATION_ID"
            r0.putExtra(r2, r1)
            int r1 = r5.getForegroundServiceType()
            java.lang.String r2 = "KEY_FOREGROUND_SERVICE_TYPE"
            r0.putExtra(r2, r1)
            android.app.Notification r5 = r5.getNotification()
            java.lang.String r1 = "KEY_NOTIFICATION"
            r0.putExtra(r1, r5)
            r0.putExtra(r3, r4)
            return r0
    }

    public static android.content.Intent createStopForegroundIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r1 = androidx.work.impl.foreground.SystemForegroundService.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ACTION_STOP_FOREGROUND"
            r0.setAction(r2)
            return r0
    }

    private void handleCancelWork(android.content.Intent r6) {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.foreground.SystemForegroundDispatcher.TAG
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Stopping foreground work for %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r0.info(r1, r2, r3)
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r6 = r6.getStringExtra(r0)
            if (r6 == 0) goto L2e
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L2e
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManagerImpl
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r0.cancelWorkById(r6)
        L2e:
            return
    }

    private void handleNotify(android.content.Intent r10) {
            r9 = this;
            java.lang.String r0 = "KEY_NOTIFICATION_ID"
            r1 = 0
            int r0 = r10.getIntExtra(r0, r1)
            java.lang.String r2 = "KEY_FOREGROUND_SERVICE_TYPE"
            int r2 = r10.getIntExtra(r2, r1)
            java.lang.String r3 = "KEY_WORKSPEC_ID"
            java.lang.String r3 = r10.getStringExtra(r3)
            java.lang.String r4 = "KEY_NOTIFICATION"
            android.os.Parcelable r10 = r10.getParcelableExtra(r4)
            android.app.Notification r10 = (android.app.Notification) r10
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = androidx.work.impl.foreground.SystemForegroundDispatcher.TAG
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r6[r1] = r7
            r7 = 1
            r6[r7] = r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = 2
            r6[r8] = r7
            java.lang.String r7 = "Notifying with (id: %s, workSpecId: %s, notificationType: %s)"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            java.lang.Throwable[] r7 = new java.lang.Throwable[r1]
            r4.debug(r5, r6, r7)
            if (r10 == 0) goto La7
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r4 = r9.mCallback
            if (r4 == 0) goto La7
            androidx.work.ForegroundInfo r4 = new androidx.work.ForegroundInfo
            r4.<init>(r0, r10, r2)
            java.util.Map<java.lang.String, androidx.work.ForegroundInfo> r5 = r9.mForegroundInfoById
            r5.put(r3, r4)
            java.lang.String r4 = r9.mCurrentForegroundWorkSpecId
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L5f
            r9.mCurrentForegroundWorkSpecId = r3
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r1 = r9.mCallback
            r1.startForeground(r0, r2, r10)
            goto La7
        L5f:
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r3 = r9.mCallback
            r3.notify(r0, r10)
            if (r2 == 0) goto La7
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r10 < r0) goto La7
            java.util.Map<java.lang.String, androidx.work.ForegroundInfo> r10 = r9.mForegroundInfoById
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L76:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            androidx.work.ForegroundInfo r0 = (androidx.work.ForegroundInfo) r0
            int r0 = r0.getForegroundServiceType()
            r1 = r1 | r0
            goto L76
        L8e:
            java.util.Map<java.lang.String, androidx.work.ForegroundInfo> r10 = r9.mForegroundInfoById
            java.lang.String r0 = r9.mCurrentForegroundWorkSpecId
            java.lang.Object r10 = r10.get(r0)
            androidx.work.ForegroundInfo r10 = (androidx.work.ForegroundInfo) r10
            if (r10 == 0) goto La7
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r0 = r9.mCallback
            int r2 = r10.getNotificationId()
            android.app.Notification r10 = r10.getNotification()
            r0.startForeground(r2, r1, r10)
        La7:
            return
    }

    private void handleStartForeground(android.content.Intent r6) {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.foreground.SystemForegroundDispatcher.TAG
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Started foreground service %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r0.info(r1, r2, r3)
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r6 = r6.getStringExtra(r0)
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManagerImpl
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r5.mTaskExecutor
            androidx.work.impl.foreground.SystemForegroundDispatcher$1 r2 = new androidx.work.impl.foreground.SystemForegroundDispatcher$1
            r2.<init>(r5, r0, r6)
            r1.executeOnBackgroundThread(r2)
            return
    }

    void handleStop(android.content.Intent r4) {
            r3 = this;
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.foreground.SystemForegroundDispatcher.TAG
            r1 = 0
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r2 = "Stopping foreground service"
            r4.info(r0, r2, r1)
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r4 = r3.mCallback
            if (r4 == 0) goto L15
            r4.stop()
        L15:
            return
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(java.util.List<java.lang.String> r1) {
            r0 = this;
            return
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(java.util.List<java.lang.String> r7) {
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L33
            java.util.Iterator r7 = r7.iterator()
        La:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.foreground.SystemForegroundDispatcher.TAG
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = "Constraints unmet for WorkSpec %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r1.debug(r2, r3, r4)
            androidx.work.impl.WorkManagerImpl r1 = r6.mWorkManagerImpl
            r1.stopForegroundWork(r0)
            goto La
        L33:
            return
    }

    void onDestroy() {
            r2 = this;
            r0 = 0
            r2.mCallback = r0
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.WorkConstraintsTracker r1 = r2.mConstraintsTracker     // Catch: java.lang.Throwable -> L16
            r1.reset()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManagerImpl
            androidx.work.impl.Processor r0 = r0.getProcessor()
            r0.removeExecutionListener(r2)
            return
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String r8, boolean r9) {
            r7 = this;
            java.lang.Object r9 = r7.mLock
            monitor-enter(r9)
            java.util.Map<java.lang.String, androidx.work.impl.model.WorkSpec> r0 = r7.mWorkSpecById     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r0 = r0.remove(r8)     // Catch: java.lang.Throwable -> Lbb
            androidx.work.impl.model.WorkSpec r0 = (androidx.work.impl.model.WorkSpec) r0     // Catch: java.lang.Throwable -> Lbb
            r1 = 0
            if (r0 == 0) goto L15
            java.util.Set<androidx.work.impl.model.WorkSpec> r2 = r7.mTrackedWorkSpecs     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = r2.remove(r0)     // Catch: java.lang.Throwable -> Lbb
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1f
            androidx.work.impl.constraints.WorkConstraintsTracker r0 = r7.mConstraintsTracker     // Catch: java.lang.Throwable -> Lbb
            java.util.Set<androidx.work.impl.model.WorkSpec> r2 = r7.mTrackedWorkSpecs     // Catch: java.lang.Throwable -> Lbb
            r0.replace(r2)     // Catch: java.lang.Throwable -> Lbb
        L1f:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lbb
            java.util.Map<java.lang.String, androidx.work.ForegroundInfo> r9 = r7.mForegroundInfoById
            java.lang.Object r9 = r9.remove(r8)
            androidx.work.ForegroundInfo r9 = (androidx.work.ForegroundInfo) r9
            java.lang.String r0 = r7.mCurrentForegroundWorkSpecId
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L81
            java.util.Map<java.lang.String, androidx.work.ForegroundInfo> r0 = r7.mForegroundInfoById
            int r0 = r0.size()
            if (r0 <= 0) goto L81
            java.util.Map<java.lang.String, androidx.work.ForegroundInfo> r0 = r7.mForegroundInfoById
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
        L48:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L48
        L55:
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r7.mCurrentForegroundWorkSpecId = r0
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r0 = r7.mCallback
            if (r0 == 0) goto L81
            java.lang.Object r0 = r2.getValue()
            androidx.work.ForegroundInfo r0 = (androidx.work.ForegroundInfo) r0
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r2 = r7.mCallback
            int r3 = r0.getNotificationId()
            int r4 = r0.getForegroundServiceType()
            android.app.Notification r5 = r0.getNotification()
            r2.startForeground(r3, r4, r5)
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r2 = r7.mCallback
            int r0 = r0.getNotificationId()
            r2.cancelNotification(r0)
        L81:
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r0 = r7.mCallback
            if (r9 == 0) goto Lba
            if (r0 == 0) goto Lba
            androidx.work.Logger r2 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.foreground.SystemForegroundDispatcher.TAG
            java.lang.String r4 = "Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r6 = r9.getNotificationId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r1] = r6
            r6 = 1
            r5[r6] = r8
            r8 = 2
            int r6 = r9.getForegroundServiceType()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r8] = r6
            java.lang.String r8 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r2.debug(r3, r8, r1)
            int r8 = r9.getNotificationId()
            r0.cancelNotification(r8)
        Lba:
            return
        Lbb:
            r8 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lbb
            throw r8
    }

    void onStartCommand(android.content.Intent r3) {
            r2 = this;
            java.lang.String r0 = r3.getAction()
            java.lang.String r1 = "ACTION_START_FOREGROUND"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            r2.handleStartForeground(r3)
            r2.handleNotify(r3)
            goto L36
        L13:
            java.lang.String r1 = "ACTION_NOTIFY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1f
            r2.handleNotify(r3)
            goto L36
        L1f:
            java.lang.String r1 = "ACTION_CANCEL_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2b
            r2.handleCancelWork(r3)
            goto L36
        L2b:
            java.lang.String r1 = "ACTION_STOP_FOREGROUND"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            r2.handleStop(r3)
        L36:
            return
    }

    void setCallback(androidx.work.impl.foreground.SystemForegroundDispatcher.Callback r4) {
            r3 = this;
            androidx.work.impl.foreground.SystemForegroundDispatcher$Callback r0 = r3.mCallback
            if (r0 == 0) goto L13
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.foreground.SystemForegroundDispatcher.TAG
            r1 = 0
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r2 = "A callback already exists."
            r4.error(r0, r2, r1)
            return
        L13:
            r3.mCallback = r4
            return
    }
}
