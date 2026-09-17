package androidx.work.impl.constraints;

/* loaded from: classes.dex */
public class WorkConstraintsTracker implements androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback {
    private static final java.lang.String TAG = null;
    private final androidx.work.impl.constraints.WorkConstraintsCallback mCallback;
    private final androidx.work.impl.constraints.controllers.ConstraintController<?>[] mConstraintControllers;
    private final java.lang.Object mLock;

    static {
            java.lang.String r0 = "WorkConstraintsTracker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.WorkConstraintsTracker.TAG = r0
            return
    }

    public WorkConstraintsTracker(android.content.Context r3, androidx.work.impl.utils.taskexecutor.TaskExecutor r4, androidx.work.impl.constraints.WorkConstraintsCallback r5) {
            r2 = this;
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            r2.mCallback = r5
            r5 = 7
            androidx.work.impl.constraints.controllers.ConstraintController[] r5 = new androidx.work.impl.constraints.controllers.ConstraintController[r5]
            androidx.work.impl.constraints.controllers.BatteryChargingController r0 = new androidx.work.impl.constraints.controllers.BatteryChargingController
            r0.<init>(r3, r4)
            r1 = 0
            r5[r1] = r0
            androidx.work.impl.constraints.controllers.BatteryNotLowController r0 = new androidx.work.impl.constraints.controllers.BatteryNotLowController
            r0.<init>(r3, r4)
            r1 = 1
            r5[r1] = r0
            androidx.work.impl.constraints.controllers.StorageNotLowController r0 = new androidx.work.impl.constraints.controllers.StorageNotLowController
            r0.<init>(r3, r4)
            r1 = 2
            r5[r1] = r0
            androidx.work.impl.constraints.controllers.NetworkConnectedController r0 = new androidx.work.impl.constraints.controllers.NetworkConnectedController
            r0.<init>(r3, r4)
            r1 = 3
            r5[r1] = r0
            androidx.work.impl.constraints.controllers.NetworkUnmeteredController r0 = new androidx.work.impl.constraints.controllers.NetworkUnmeteredController
            r0.<init>(r3, r4)
            r1 = 4
            r5[r1] = r0
            androidx.work.impl.constraints.controllers.NetworkNotRoamingController r0 = new androidx.work.impl.constraints.controllers.NetworkNotRoamingController
            r0.<init>(r3, r4)
            r1 = 5
            r5[r1] = r0
            androidx.work.impl.constraints.controllers.NetworkMeteredController r0 = new androidx.work.impl.constraints.controllers.NetworkMeteredController
            r0.<init>(r3, r4)
            r3 = 6
            r5[r3] = r0
            r2.mConstraintControllers = r5
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.mLock = r3
            return
    }

    public boolean areAllConstraintsMet(java.lang.String r9) {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r1 = r8.mConstraintControllers     // Catch: java.lang.Throwable -> L3a
            int r2 = r1.length     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            r4 = 0
        L8:
            r5 = 1
            if (r4 >= r2) goto L38
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L3a
            boolean r7 = r6.isWorkSpecConstrained(r9)     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L35
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = androidx.work.impl.constraints.WorkConstraintsTracker.TAG     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Work %s constrained by %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L3a
            r7[r3] = r9     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r9 = r6.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r9 = r9.getSimpleName()     // Catch: java.lang.Throwable -> L3a
            r7[r5] = r9     // Catch: java.lang.Throwable -> L3a
            java.lang.String r9 = java.lang.String.format(r4, r7)     // Catch: java.lang.Throwable -> L3a
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L3a
            r1.debug(r2, r9, r4)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return r3
        L35:
            int r4 = r4 + 1
            goto L8
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return r5
        L3a:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r9
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintMet(java.util.List<java.lang.String> r9) {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L42
            r1.<init>()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L42
        Lc:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L39
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L42
            boolean r3 = r8.areAllConstraintsMet(r2)     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto Lc
            androidx.work.Logger r3 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = androidx.work.impl.constraints.WorkConstraintsTracker.TAG     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "Constraints met for %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L42
            r7 = 0
            r6[r7] = r2     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable[] r6 = new java.lang.Throwable[r7]     // Catch: java.lang.Throwable -> L42
            r3.debug(r4, r5, r6)     // Catch: java.lang.Throwable -> L42
            r1.add(r2)     // Catch: java.lang.Throwable -> L42
            goto Lc
        L39:
            androidx.work.impl.constraints.WorkConstraintsCallback r9 = r8.mCallback     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L40
            r9.onAllConstraintsMet(r1)     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r9
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintNotMet(java.util.List<java.lang.String> r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.WorkConstraintsCallback r1 = r2.mCallback     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.onAllConstraintsNotMet(r3)     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public void replace(java.lang.Iterable<androidx.work.impl.model.WorkSpec> r8) {
            r7 = this;
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r1 = r7.mConstraintControllers     // Catch: java.lang.Throwable -> L30
            int r2 = r1.length     // Catch: java.lang.Throwable -> L30
            r3 = 0
            r4 = 0
        L8:
            if (r4 >= r2) goto L13
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L30
            r6 = 0
            r5.setCallback(r6)     // Catch: java.lang.Throwable -> L30
            int r4 = r4 + 1
            goto L8
        L13:
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r1 = r7.mConstraintControllers     // Catch: java.lang.Throwable -> L30
            int r2 = r1.length     // Catch: java.lang.Throwable -> L30
            r4 = 0
        L17:
            if (r4 >= r2) goto L21
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L30
            r5.replace(r8)     // Catch: java.lang.Throwable -> L30
            int r4 = r4 + 1
            goto L17
        L21:
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r8 = r7.mConstraintControllers     // Catch: java.lang.Throwable -> L30
            int r1 = r8.length     // Catch: java.lang.Throwable -> L30
        L24:
            if (r3 >= r1) goto L2e
            r2 = r8[r3]     // Catch: java.lang.Throwable -> L30
            r2.setCallback(r7)     // Catch: java.lang.Throwable -> L30
            int r3 = r3 + 1
            goto L24
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r8
    }

    public void reset() {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r1 = r5.mConstraintControllers     // Catch: java.lang.Throwable -> L13
            int r2 = r1.length     // Catch: java.lang.Throwable -> L13
            r3 = 0
        L7:
            if (r3 >= r2) goto L11
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L13
            r4.reset()     // Catch: java.lang.Throwable -> L13
            int r3 = r3 + 1
            goto L7
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }
}
