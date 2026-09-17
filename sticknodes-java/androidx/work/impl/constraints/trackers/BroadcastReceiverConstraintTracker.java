package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends androidx.work.impl.constraints.trackers.ConstraintTracker<T> {
    private static final java.lang.String TAG = null;
    private final android.content.BroadcastReceiver mBroadcastReceiver;


    static {
            java.lang.String r0 = "BrdcstRcvrCnstrntTrckr"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.TAG = r0
            return
    }

    public BroadcastReceiverConstraintTracker(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            r0.<init>(r1, r2)
            androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$1 r1 = new androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$1
            r1.<init>(r0)
            r0.mBroadcastReceiver = r1
            return
    }

    public abstract android.content.IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(android.content.Context r1, android.content.Intent r2);

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.TAG
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "%s: registering receiver"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.debug(r1, r2, r3)
            android.content.Context r0 = r5.mAppContext
            android.content.BroadcastReceiver r1 = r5.mBroadcastReceiver
            android.content.IntentFilter r2 = r5.getIntentFilter()
            r0.registerReceiver(r1, r2)
            return
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.TAG
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "%s: unregistering receiver"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.debug(r1, r2, r3)
            android.content.Context r0 = r5.mAppContext
            android.content.BroadcastReceiver r1 = r5.mBroadcastReceiver
            r0.unregisterReceiver(r1)
            return
    }
}
