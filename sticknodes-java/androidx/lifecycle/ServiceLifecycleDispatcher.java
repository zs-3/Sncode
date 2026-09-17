package androidx.lifecycle;

/* loaded from: classes.dex */
public class ServiceLifecycleDispatcher {
    private final android.os.Handler mHandler;
    private androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable mLastDispatchRunnable;
    private final androidx.lifecycle.LifecycleRegistry mRegistry;

    static class DispatchRunnable implements java.lang.Runnable {
        final androidx.lifecycle.Lifecycle.Event mEvent;
        private final androidx.lifecycle.LifecycleRegistry mRegistry;
        private boolean mWasExecuted;

        DispatchRunnable(androidx.lifecycle.LifecycleRegistry r2, androidx.lifecycle.Lifecycle.Event r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mWasExecuted = r0
                r1.mRegistry = r2
                r1.mEvent = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.mWasExecuted
                if (r0 != 0) goto Le
                androidx.lifecycle.LifecycleRegistry r0 = r2.mRegistry
                androidx.lifecycle.Lifecycle$Event r1 = r2.mEvent
                r0.handleLifecycleEvent(r1)
                r0 = 1
                r2.mWasExecuted = r0
            Le:
                return
        }
    }

    public ServiceLifecycleDispatcher(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r2)
            r1.mRegistry = r0
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.mHandler = r2
            return
    }

    private void postDispatchRunnable(androidx.lifecycle.Lifecycle.Event r3) {
            r2 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher$DispatchRunnable r0 = r2.mLastDispatchRunnable
            if (r0 == 0) goto L7
            r0.run()
        L7:
            androidx.lifecycle.ServiceLifecycleDispatcher$DispatchRunnable r0 = new androidx.lifecycle.ServiceLifecycleDispatcher$DispatchRunnable
            androidx.lifecycle.LifecycleRegistry r1 = r2.mRegistry
            r0.<init>(r1, r3)
            r2.mLastDispatchRunnable = r0
            android.os.Handler r3 = r2.mHandler
            r3.postAtFrontOfQueue(r0)
            return
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mRegistry
            return r0
    }

    public void onServicePreSuperOnBind() {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
            r1.postDispatchRunnable(r0)
            return
    }

    public void onServicePreSuperOnCreate() {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r1.postDispatchRunnable(r0)
            return
    }

    public void onServicePreSuperOnDestroy() {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r1.postDispatchRunnable(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r1.postDispatchRunnable(r0)
            return
    }

    public void onServicePreSuperOnStart() {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
            r1.postDispatchRunnable(r0)
            return
    }
}
