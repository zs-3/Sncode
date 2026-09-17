package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentLifecycleCallbacksDispatcher {
    private final androidx.fragment.app.FragmentManager mFragmentManager;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> mLifecycleCallbacks;

    private static final class FragmentLifecycleCallbacksHolder {
        final boolean mRecursive;
    }

    FragmentLifecycleCallbacksDispatcher(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mLifecycleCallbacks = r0
            r1.mFragmentManager = r2
            return
    }

    void dispatchOnFragmentActivityCreated(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentActivityCreated(r3, r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r4 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r4
            if (r5 == 0) goto L2d
            boolean r0 = r4.mRecursive
            if (r0 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r4)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentAttached(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            r0.getContext()
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1d
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentAttached(r3, r1)
        L1d:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r0 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r0
            if (r4 == 0) goto L36
            boolean r1 = r0.mRecursive
            if (r1 != 0) goto L36
            goto L23
        L36:
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            throw r3
        L3b:
            return
    }

    void dispatchOnFragmentCreated(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentCreated(r3, r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r4 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r4
            if (r5 == 0) goto L2d
            boolean r0 = r4.mRecursive
            if (r0 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r4)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentDestroyed(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentDestroyed(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r0 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.mRecursive
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentDetached(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentDetached(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r0 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.mRecursive
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentPaused(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentPaused(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r0 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.mRecursive
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentPreAttached(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            r0.getContext()
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1d
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentPreAttached(r3, r1)
        L1d:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r0 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r0
            if (r4 == 0) goto L36
            boolean r1 = r0.mRecursive
            if (r1 != 0) goto L36
            goto L23
        L36:
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            throw r3
        L3b:
            return
    }

    void dispatchOnFragmentPreCreated(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentPreCreated(r3, r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r4 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r4
            if (r5 == 0) goto L2d
            boolean r0 = r4.mRecursive
            if (r0 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r4)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentResumed(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentResumed(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r0 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.mRecursive
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentSaveInstanceState(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentSaveInstanceState(r3, r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r4 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r4
            if (r5 == 0) goto L2d
            boolean r0 = r4.mRecursive
            if (r0 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r4)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentStarted(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentStarted(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r0 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.mRecursive
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentStopped(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentStopped(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r0 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.mRecursive
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentViewCreated(androidx.fragment.app.Fragment r3, android.view.View r4, android.os.Bundle r5, boolean r6) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentViewCreated(r3, r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r4 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r4
            if (r6 == 0) goto L2d
            boolean r5 = r4.mRecursive
            if (r5 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r4)
            r3 = 0
            throw r3
        L32:
            return
    }

    void dispatchOnFragmentViewDestroyed(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentViewDestroyed(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r2.mLifecycleCallbacks
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r0 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.mRecursive
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            throw r3
        L32:
            return
    }
}
