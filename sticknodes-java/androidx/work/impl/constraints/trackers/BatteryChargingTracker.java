package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class BatteryChargingTracker extends androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker<java.lang.Boolean> {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "BatteryChrgTracker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.trackers.BatteryChargingTracker.TAG = r0
            return
    }

    public BatteryChargingTracker(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private boolean isBatteryChangedIntentCharging(android.content.Intent r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 < r3) goto L18
            r0 = -1
            java.lang.String r3 = "status"
            int r5 = r5.getIntExtra(r3, r0)
            r0 = 2
            if (r5 == r0) goto L20
            r0 = 5
            if (r5 != r0) goto L16
            goto L20
        L16:
            r1 = 0
            goto L20
        L18:
            java.lang.String r0 = "plugged"
            int r5 = r5.getIntExtra(r0, r2)
            if (r5 == 0) goto L16
        L20:
            return r1
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public java.lang.Boolean getInitialState() {
            r5 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            android.content.Context r1 = r5.mAppContext
            r2 = 0
            android.content.Intent r0 = r1.registerReceiver(r2, r0)
            if (r0 != 0) goto L1f
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.constraints.trackers.BatteryChargingTracker.TAG
            r3 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            java.lang.String r4 = "getInitialState - null intent received"
            r0.error(r1, r4, r3)
            return r2
        L1f:
            boolean r0 = r5.isBatteryChangedIntentCharging(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
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
            r3 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L16
            java.lang.String r1 = "android.os.action.CHARGING"
            r0.addAction(r1)
            java.lang.String r1 = "android.os.action.DISCHARGING"
            r0.addAction(r1)
            goto L20
        L16:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            r0.addAction(r1)
        L20:
            return r0
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(android.content.Context r6, android.content.Intent r7) {
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L7
            return
        L7:
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.constraints.trackers.BatteryChargingTracker.TAG
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.debug(r0, r2, r4)
            r7 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1886648615: goto L47;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r1 = -1
            goto L51
        L28:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L31
            goto L26
        L31:
            r1 = 3
            goto L51
        L33:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3c
            goto L26
        L3c:
            r1 = 2
            goto L51
        L3e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L51
            goto L26
        L47:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L50
            goto L26
        L50:
            r1 = 0
        L51:
            switch(r1) {
                case 0: goto L67;
                case 1: goto L61;
                case 2: goto L5b;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L6c
        L55:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.setState(r6)
            goto L6c
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.setState(r6)
            goto L6c
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.setState(r6)
            goto L6c
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.setState(r6)
        L6c:
            return
    }
}
