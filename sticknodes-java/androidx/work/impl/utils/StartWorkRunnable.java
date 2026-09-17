package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class StartWorkRunnable implements java.lang.Runnable {
    private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
    private androidx.work.impl.WorkManagerImpl mWorkManagerImpl;
    private java.lang.String mWorkSpecId;

    public StartWorkRunnable(androidx.work.impl.WorkManagerImpl r1, java.lang.String r2, androidx.work.WorkerParameters.RuntimeExtras r3) {
            r0 = this;
            r0.<init>()
            r0.mWorkManagerImpl = r1
            r0.mWorkSpecId = r2
            r0.mRuntimeExtras = r3
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            androidx.work.impl.WorkManagerImpl r0 = r3.mWorkManagerImpl
            androidx.work.impl.Processor r0 = r0.getProcessor()
            java.lang.String r1 = r3.mWorkSpecId
            androidx.work.WorkerParameters$RuntimeExtras r2 = r3.mRuntimeExtras
            r0.startWork(r1, r2)
            return
    }
}
