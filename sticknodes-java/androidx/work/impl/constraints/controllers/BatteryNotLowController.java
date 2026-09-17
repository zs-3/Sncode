package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public class BatteryNotLowController extends androidx.work.impl.constraints.controllers.ConstraintController<java.lang.Boolean> {
    public BatteryNotLowController(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            androidx.work.impl.constraints.trackers.Trackers r1 = androidx.work.impl.constraints.trackers.Trackers.getInstance(r1, r2)
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker r1 = r1.getBatteryNotLowTracker()
            r0.<init>(r1)
            return
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(androidx.work.impl.model.WorkSpec r1) {
            r0 = this;
            androidx.work.Constraints r1 = r1.constraints
            boolean r1 = r1.requiresBatteryNotLow()
            return r1
    }

    /* renamed from: isConstrained, reason: avoid collision after fix types in other method */
    boolean isConstrained2(java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ 1
            return r1
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* bridge */ /* synthetic */ boolean isConstrained(java.lang.Boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r0.isConstrained2(r1)
            return r1
    }
}
