package androidx.lifecycle;

/* loaded from: classes.dex */
public class LifecycleService extends android.app.Service implements androidx.lifecycle.LifecycleOwner {
    private final androidx.lifecycle.ServiceLifecycleDispatcher mDispatcher;

    public LifecycleService() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = new androidx.lifecycle.ServiceLifecycleDispatcher
            r0.<init>(r1)
            r1.mDispatcher = r0
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = r1.mDispatcher
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            return r0
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher r1 = r0.mDispatcher
            r1.onServicePreSuperOnBind()
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r1 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = r1.mDispatcher
            r0.onServicePreSuperOnCreate()
            super.onCreate()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = r1.mDispatcher
            r0.onServicePreSuperOnDestroy()
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent r2, int r3) {
            r1 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = r1.mDispatcher
            r0.onServicePreSuperOnStart()
            super.onStart(r2, r3)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            int r1 = super.onStartCommand(r1, r2, r3)
            return r1
    }
}
