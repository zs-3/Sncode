package androidx.work.impl;

/* loaded from: classes.dex */
public class DefaultRunnableScheduler implements androidx.work.RunnableScheduler {
    private final android.os.Handler mHandler;

    public DefaultRunnableScheduler() {
            r1 = this;
            r1.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = androidx.core.os.HandlerCompat.createAsync(r0)
            r1.mHandler = r0
            return
    }

    @Override // androidx.work.RunnableScheduler
    public void cancel(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.mHandler
            r0.removeCallbacks(r2)
            return
    }

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long r2, java.lang.Runnable r4) {
            r1 = this;
            android.os.Handler r0 = r1.mHandler
            r0.postDelayed(r4, r2)
            return
    }
}
