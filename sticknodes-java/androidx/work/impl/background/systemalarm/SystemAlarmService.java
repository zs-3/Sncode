package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
public class SystemAlarmService extends androidx.lifecycle.LifecycleService implements androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener {
    private static final java.lang.String TAG = null;
    private androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;
    private boolean mIsShutdown;

    static {
            java.lang.String r0 = "SystemAlarmService"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.SystemAlarmService.TAG = r0
            return
    }

    public SystemAlarmService() {
            r0 = this;
            r0.<init>()
            return
    }

    private void initializeDispatcher() {
            r1 = this;
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r0 = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher
            r0.<init>(r1)
            r1.mDispatcher = r0
            r0.setCompletedListener(r1)
            return
    }

    @Override // androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener
    public void onAllCommandsCompleted() {
            r4 = this;
            r0 = 1
            r4.mIsShutdown = r0
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.SystemAlarmService.TAG
            r2 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            java.lang.String r3 = "All commands completed in dispatcher"
            r0.debug(r1, r3, r2)
            androidx.work.impl.utils.WakeLocks.checkWakeLocks()
            r4.stopSelf()
            return
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
            r1 = this;
            super.onCreate()
            r1.initializeDispatcher()
            r0 = 0
            r1.mIsShutdown = r0
            return
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 1
            r1.mIsShutdown = r0
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r0 = r1.mDispatcher
            r0.onDestroy()
            return
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
            r4 = this;
            super.onStartCommand(r5, r6, r7)
            boolean r6 = r4.mIsShutdown
            if (r6 == 0) goto L1f
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.systemalarm.SystemAlarmService.TAG
            r1 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]
            java.lang.String r3 = "Re-initializing SystemAlarmDispatcher after a request to shut-down."
            r6.info(r0, r3, r2)
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r6 = r4.mDispatcher
            r6.onDestroy()
            r4.initializeDispatcher()
            r4.mIsShutdown = r1
        L1f:
            if (r5 == 0) goto L26
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r6 = r4.mDispatcher
            r6.add(r5, r7)
        L26:
            r5 = 3
            return r5
    }
}
