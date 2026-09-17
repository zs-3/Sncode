package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public class NetworkUnmeteredController extends androidx.work.impl.constraints.controllers.ConstraintController<androidx.work.impl.constraints.NetworkState> {
    public NetworkUnmeteredController(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            androidx.work.impl.constraints.trackers.Trackers r1 = androidx.work.impl.constraints.trackers.Trackers.getInstance(r1, r2)
            androidx.work.impl.constraints.trackers.NetworkStateTracker r1 = r1.getNetworkStateTracker()
            r0.<init>(r1)
            return
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(androidx.work.impl.model.WorkSpec r3) {
            r2 = this;
            androidx.work.Constraints r0 = r3.constraints
            androidx.work.NetworkType r0 = r0.getRequiredNetworkType()
            androidx.work.NetworkType r1 = androidx.work.NetworkType.UNMETERED
            if (r0 == r1) goto L1d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1b
            androidx.work.Constraints r3 = r3.constraints
            androidx.work.NetworkType r3 = r3.getRequiredNetworkType()
            androidx.work.NetworkType r0 = androidx.work.NetworkType.TEMPORARILY_UNMETERED
            if (r3 != r0) goto L1b
            goto L1d
        L1b:
            r3 = 0
            goto L1e
        L1d:
            r3 = 1
        L1e:
            return r3
    }

    /* renamed from: isConstrained, reason: avoid collision after fix types in other method */
    boolean isConstrained2(androidx.work.impl.constraints.NetworkState r2) {
            r1 = this;
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto Lf
            boolean r2 = r2.isMetered()
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* bridge */ /* synthetic */ boolean isConstrained(androidx.work.impl.constraints.NetworkState r1) {
            r0 = this;
            androidx.work.impl.constraints.NetworkState r1 = (androidx.work.impl.constraints.NetworkState) r1
            boolean r1 = r0.isConstrained2(r1)
            return r1
    }
}
