package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public abstract class ConstraintController<T> implements androidx.work.impl.constraints.ConstraintListener<T> {
    private androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback mCallback;
    private T mCurrentValue;
    private final java.util.List<java.lang.String> mMatchingWorkSpecIds;
    private androidx.work.impl.constraints.trackers.ConstraintTracker<T> mTracker;

    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(java.util.List<java.lang.String> r1);

        void onConstraintNotMet(java.util.List<java.lang.String> r1);
    }

    ConstraintController(androidx.work.impl.constraints.trackers.ConstraintTracker<T> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mMatchingWorkSpecIds = r0
            r1.mTracker = r2
            return
    }

    private void updateCallback(androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback r2, T r3) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mMatchingWorkSpecIds
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            if (r2 != 0) goto Lb
            goto L1f
        Lb:
            if (r3 == 0) goto L1a
            boolean r3 = r1.isConstrained(r3)
            if (r3 == 0) goto L14
            goto L1a
        L14:
            java.util.List<java.lang.String> r3 = r1.mMatchingWorkSpecIds
            r2.onConstraintMet(r3)
            goto L1f
        L1a:
            java.util.List<java.lang.String> r3 = r1.mMatchingWorkSpecIds
            r2.onConstraintNotMet(r3)
        L1f:
            return
    }

    abstract boolean hasConstraint(androidx.work.impl.model.WorkSpec r1);

    abstract boolean isConstrained(T r1);

    public boolean isWorkSpecConstrained(java.lang.String r2) {
            r1 = this;
            T r0 = r1.mCurrentValue
            if (r0 == 0) goto L14
            boolean r0 = r1.isConstrained(r0)
            if (r0 == 0) goto L14
            java.util.List<java.lang.String> r0 = r1.mMatchingWorkSpecIds
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(T r2) {
            r1 = this;
            r1.mCurrentValue = r2
            androidx.work.impl.constraints.controllers.ConstraintController$OnConstraintUpdatedCallback r0 = r1.mCallback
            r1.updateCallback(r0, r2)
            return
    }

    public void replace(java.lang.Iterable<androidx.work.impl.model.WorkSpec> r3) {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.mMatchingWorkSpecIds
            r0.clear()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            androidx.work.impl.model.WorkSpec r0 = (androidx.work.impl.model.WorkSpec) r0
            boolean r1 = r2.hasConstraint(r0)
            if (r1 == 0) goto L9
            java.util.List<java.lang.String> r1 = r2.mMatchingWorkSpecIds
            java.lang.String r0 = r0.id
            r1.add(r0)
            goto L9
        L23:
            java.util.List<java.lang.String> r3 = r2.mMatchingWorkSpecIds
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L31
            androidx.work.impl.constraints.trackers.ConstraintTracker<T> r3 = r2.mTracker
            r3.removeListener(r2)
            goto L36
        L31:
            androidx.work.impl.constraints.trackers.ConstraintTracker<T> r3 = r2.mTracker
            r3.addListener(r2)
        L36:
            androidx.work.impl.constraints.controllers.ConstraintController$OnConstraintUpdatedCallback r3 = r2.mCallback
            T r0 = r2.mCurrentValue
            r2.updateCallback(r3, r0)
            return
    }

    public void reset() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mMatchingWorkSpecIds
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.util.List<java.lang.String> r0 = r1.mMatchingWorkSpecIds
            r0.clear()
            androidx.work.impl.constraints.trackers.ConstraintTracker<T> r0 = r1.mTracker
            r0.removeListener(r1)
        L12:
            return
    }

    public void setCallback(androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback r2) {
            r1 = this;
            androidx.work.impl.constraints.controllers.ConstraintController$OnConstraintUpdatedCallback r0 = r1.mCallback
            if (r0 == r2) goto Lb
            r1.mCallback = r2
            T r0 = r1.mCurrentValue
            r1.updateCallback(r2, r0)
        Lb:
            return
    }
}
