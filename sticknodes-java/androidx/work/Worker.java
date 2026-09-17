package androidx.work;

/* loaded from: classes.dex */
public abstract class Worker extends androidx.work.ListenableWorker {
    androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> mFuture;


    @androidx.annotation.Keep
    @android.annotation.SuppressLint({"BanKeepAnnotation"})
    public Worker(android.content.Context r1, androidx.work.WorkerParameters r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public abstract androidx.work.ListenableWorker.Result doWork();

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
            r2 = this;
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            r2.mFuture = r0
            java.util.concurrent.Executor r0 = r2.getBackgroundExecutor()
            androidx.work.Worker$1 r1 = new androidx.work.Worker$1
            r1.<init>(r2)
            r0.execute(r1)
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r2.mFuture
            return r0
    }
}
