package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class BatteryNotLowTracker extends androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker<java.lang.Boolean> {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "BatteryNotLowTracker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker.TAG = r0
            return
    }

    public BatteryNotLowTracker(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public java.lang.Boolean getInitialState() {
            r6 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            android.content.Context r1 = r6.mAppContext
            r2 = 0
            android.content.Intent r0 = r1.registerReceiver(r2, r0)
            r1 = 0
            if (r0 != 0) goto L1f
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.constraints.trackers.BatteryNotLowTracker.TAG
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r4 = "getInitialState - null intent received"
            r0.error(r3, r4, r1)
            return r2
        L1f:
            java.lang.String r2 = "status"
            r3 = -1
            int r2 = r0.getIntExtra(r2, r3)
            java.lang.String r4 = "level"
            int r4 = r0.getIntExtra(r4, r3)
            java.lang.String r5 = "scale"
            int r0 = r0.getIntExtra(r5, r3)
            float r3 = (float) r4
            float r0 = (float) r0
            float r3 = r3 / r0
            r0 = 1
            if (r2 == r0) goto L3f
            r2 = 1041865114(0x3e19999a, float:0.15)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L40
        L3f:
            r1 = 1
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
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
            java.lang.String r1 = "android.intent.action.BATTERY_OKAY"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.BATTERY_LOW"
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
            java.lang.String r0 = androidx.work.impl.constraints.trackers.BatteryNotLowTracker.TAG
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
            java.lang.String r6 = "android.intent.action.BATTERY_OKAY"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L40
            java.lang.String r6 = "android.intent.action.BATTERY_LOW"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3a
            goto L45
        L3a:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.setState(r5)
            goto L45
        L40:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setState(r5)
        L45:
            return
    }
}
