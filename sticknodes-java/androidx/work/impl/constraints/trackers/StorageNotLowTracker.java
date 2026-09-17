package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class StorageNotLowTracker extends androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker<java.lang.Boolean> {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "StorageNotLowTracker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.trackers.StorageNotLowTracker.TAG = r0
            return
    }

    public StorageNotLowTracker(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public java.lang.Boolean getInitialState() {
            r3 = this;
            android.content.Context r0 = r3.mAppContext
            android.content.IntentFilter r1 = r3.getIntentFilter()
            r2 = 0
            android.content.Intent r0 = r0.registerReceiver(r2, r1)
            if (r0 == 0) goto L32
            java.lang.String r1 = r0.getAction()
            if (r1 != 0) goto L14
            goto L32
        L14:
            java.lang.String r0 = r0.getAction()
            r0.hashCode()
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2f
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            return r2
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public /* bridge */ /* synthetic */ java.lang.Object getInitialState() {
            r1 = this;
            java.lang.Boolean r0 = r1.getInitialState()
            return r0
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public android.content.IntentFilter getIntentFilter() {
            r2 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_OK"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.addAction(r1)
            return r0
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            java.lang.String r5 = r6.getAction()
            if (r5 != 0) goto L7
            return
        L7:
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.constraints.trackers.StorageNotLowTracker.TAG
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r6.getAction()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Received %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r5.debug(r0, r1, r2)
            java.lang.String r5 = r6.getAction()
            r5.hashCode()
            java.lang.String r6 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L40
            java.lang.String r6 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3a
            goto L45
        L3a:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setState(r5)
            goto L45
        L40:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.setState(r5)
        L45:
            return
    }
}
