package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class Trackers {
    private static androidx.work.impl.constraints.trackers.Trackers sInstance;
    private androidx.work.impl.constraints.trackers.BatteryChargingTracker mBatteryChargingTracker;
    private androidx.work.impl.constraints.trackers.BatteryNotLowTracker mBatteryNotLowTracker;
    private androidx.work.impl.constraints.trackers.NetworkStateTracker mNetworkStateTracker;
    private androidx.work.impl.constraints.trackers.StorageNotLowTracker mStorageNotLowTracker;

    private Trackers(android.content.Context r2, androidx.work.impl.utils.taskexecutor.TaskExecutor r3) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            androidx.work.impl.constraints.trackers.BatteryChargingTracker r0 = new androidx.work.impl.constraints.trackers.BatteryChargingTracker
            r0.<init>(r2, r3)
            r1.mBatteryChargingTracker = r0
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker r0 = new androidx.work.impl.constraints.trackers.BatteryNotLowTracker
            r0.<init>(r2, r3)
            r1.mBatteryNotLowTracker = r0
            androidx.work.impl.constraints.trackers.NetworkStateTracker r0 = new androidx.work.impl.constraints.trackers.NetworkStateTracker
            r0.<init>(r2, r3)
            r1.mNetworkStateTracker = r0
            androidx.work.impl.constraints.trackers.StorageNotLowTracker r0 = new androidx.work.impl.constraints.trackers.StorageNotLowTracker
            r0.<init>(r2, r3)
            r1.mStorageNotLowTracker = r0
            return
    }

    public static synchronized androidx.work.impl.constraints.trackers.Trackers getInstance(android.content.Context r2, androidx.work.impl.utils.taskexecutor.TaskExecutor r3) {
            java.lang.Class<androidx.work.impl.constraints.trackers.Trackers> r0 = androidx.work.impl.constraints.trackers.Trackers.class
            monitor-enter(r0)
            androidx.work.impl.constraints.trackers.Trackers r1 = androidx.work.impl.constraints.trackers.Trackers.sInstance     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            androidx.work.impl.constraints.trackers.Trackers r1 = new androidx.work.impl.constraints.trackers.Trackers     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L12
            androidx.work.impl.constraints.trackers.Trackers.sInstance = r1     // Catch: java.lang.Throwable -> L12
        Le:
            androidx.work.impl.constraints.trackers.Trackers r2 = androidx.work.impl.constraints.trackers.Trackers.sInstance     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public androidx.work.impl.constraints.trackers.BatteryChargingTracker getBatteryChargingTracker() {
            r1 = this;
            androidx.work.impl.constraints.trackers.BatteryChargingTracker r0 = r1.mBatteryChargingTracker
            return r0
    }

    public androidx.work.impl.constraints.trackers.BatteryNotLowTracker getBatteryNotLowTracker() {
            r1 = this;
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker r0 = r1.mBatteryNotLowTracker
            return r0
    }

    public androidx.work.impl.constraints.trackers.NetworkStateTracker getNetworkStateTracker() {
            r1 = this;
            androidx.work.impl.constraints.trackers.NetworkStateTracker r0 = r1.mNetworkStateTracker
            return r0
    }

    public androidx.work.impl.constraints.trackers.StorageNotLowTracker getStorageNotLowTracker() {
            r1 = this;
            androidx.work.impl.constraints.trackers.StorageNotLowTracker r0 = r1.mStorageNotLowTracker
            return r0
    }
}
