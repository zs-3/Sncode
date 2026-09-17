package androidx.work.impl.workers;

/* loaded from: classes.dex */
public class CombineContinuationsWorker extends androidx.work.Worker {
    public CombineContinuationsWorker(android.content.Context r1, androidx.work.WorkerParameters r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.work.Worker
    public androidx.work.ListenableWorker.Result doWork() {
            r1 = this;
            androidx.work.Data r0 = r1.getInputData()
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.success(r0)
            return r0
    }
}
