package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
abstract class ConstraintProxy extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = null;

    public static class BatteryChargingProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        public BatteryChargingProxy() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                super.onReceive(r1, r2)
                return
        }
    }

    public static class BatteryNotLowProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        public BatteryNotLowProxy() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                super.onReceive(r1, r2)
                return
        }
    }

    public static class NetworkStateProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        public NetworkStateProxy() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                super.onReceive(r1, r2)
                return
        }
    }

    public static class StorageNotLowProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        public StorageNotLowProxy() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                super.onReceive(r1, r2)
                return
        }
    }

    static {
            java.lang.String r0 = "ConstraintProxy"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.ConstraintProxy.TAG = r0
            return
    }

    ConstraintProxy() {
            r0 = this;
            r0.<init>()
            return
    }

    static void updateAll(android.content.Context r7, java.util.List<androidx.work.impl.model.WorkSpec> r8) {
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L9:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L3a
            java.lang.Object r5 = r8.next()
            androidx.work.impl.model.WorkSpec r5 = (androidx.work.impl.model.WorkSpec) r5
            androidx.work.Constraints r5 = r5.constraints
            boolean r6 = r5.requiresBatteryNotLow()
            r1 = r1 | r6
            boolean r6 = r5.requiresCharging()
            r2 = r2 | r6
            boolean r6 = r5.requiresStorageNotLow()
            r3 = r3 | r6
            androidx.work.NetworkType r5 = r5.getRequiredNetworkType()
            androidx.work.NetworkType r6 = androidx.work.NetworkType.NOT_REQUIRED
            if (r5 == r6) goto L30
            r5 = 1
            goto L31
        L30:
            r5 = 0
        L31:
            r4 = r4 | r5
            if (r1 == 0) goto L9
            if (r2 == 0) goto L9
            if (r3 == 0) goto L9
            if (r4 == 0) goto L9
        L3a:
            android.content.Intent r8 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(r7, r1, r2, r3, r4)
            r7.sendBroadcast(r8)
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.ConstraintProxy.TAG
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.String r6 = "onReceive : %s"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r0.debug(r1, r6, r2)
            android.content.Intent r6 = androidx.work.impl.background.systemalarm.CommandHandler.createConstraintsChangedIntent(r5)
            r5.startService(r6)
            return
    }
}
