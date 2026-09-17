package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public class NetworkMeteredController extends androidx.work.impl.constraints.controllers.ConstraintController<androidx.work.impl.constraints.NetworkState> {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "NetworkMeteredCtrlr"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.controllers.NetworkMeteredController.TAG = r0
            return
    }

    public NetworkMeteredController(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            androidx.work.impl.constraints.trackers.Trackers r1 = androidx.work.impl.constraints.trackers.Trackers.getInstance(r1, r2)
            androidx.work.impl.constraints.trackers.NetworkStateTracker r1 = r1.getNetworkStateTracker()
            r0.<init>(r1)
            return
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(androidx.work.impl.model.WorkSpec r2) {
            r1 = this;
            androidx.work.Constraints r2 = r2.constraints
            androidx.work.NetworkType r2 = r2.getRequiredNetworkType()
            androidx.work.NetworkType r0 = androidx.work.NetworkType.METERED
            if (r2 != r0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* renamed from: isConstrained, reason: avoid collision after fix types in other method */
    boolean isConstrained2(androidx.work.impl.constraints.NetworkState r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 26
            if (r0 >= r3) goto L1b
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.constraints.controllers.NetworkMeteredController.TAG
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            java.lang.String r4 = "Metered network constraint is not supported before API 26, only checking for connected state."
            r0.debug(r3, r4, r2)
            boolean r6 = r6.isConnected()
            r6 = r6 ^ r1
            return r6
        L1b:
            boolean r0 = r6.isConnected()
            if (r0 == 0) goto L29
            boolean r6 = r6.isMetered()
            if (r6 != 0) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            return r1
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* bridge */ /* synthetic */ boolean isConstrained(androidx.work.impl.constraints.NetworkState r1) {
            r0 = this;
            androidx.work.impl.constraints.NetworkState r1 = (androidx.work.impl.constraints.NetworkState) r1
            boolean r1 = r0.isConstrained2(r1)
            return r1
    }
}
