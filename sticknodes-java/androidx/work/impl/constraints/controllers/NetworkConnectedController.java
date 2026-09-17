package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public class NetworkConnectedController extends androidx.work.impl.constraints.controllers.ConstraintController<androidx.work.impl.constraints.NetworkState> {
    public NetworkConnectedController(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
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
            androidx.work.NetworkType r0 = androidx.work.NetworkType.CONNECTED
            if (r2 != r0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* renamed from: isConstrained, reason: avoid collision after fix types in other method */
    boolean isConstrained2(androidx.work.impl.constraints.NetworkState r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 26
            if (r0 < r2) goto L16
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L15
            boolean r4 = r4.isValidated()
            if (r4 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
        L16:
            boolean r4 = r4.isConnected()
            r4 = r4 ^ r1
            return r4
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* bridge */ /* synthetic */ boolean isConstrained(androidx.work.impl.constraints.NetworkState r1) {
            r0 = this;
            androidx.work.impl.constraints.NetworkState r1 = (androidx.work.impl.constraints.NetworkState) r1
            boolean r1 = r0.isConstrained2(r1)
            return r1
    }
}
