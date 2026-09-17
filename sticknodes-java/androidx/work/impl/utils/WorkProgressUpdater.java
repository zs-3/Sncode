package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class WorkProgressUpdater implements androidx.work.ProgressUpdater {
    static final java.lang.String TAG = null;
    final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final androidx.work.impl.WorkDatabase mWorkDatabase;


    static {
            java.lang.String r0 = "WorkProgressUpdater"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.WorkProgressUpdater.TAG = r0
            return
    }

    public WorkProgressUpdater(androidx.work.impl.WorkDatabase r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            r0.<init>()
            r0.mWorkDatabase = r1
            r0.mTaskExecutor = r2
            return
    }

    @Override // androidx.work.ProgressUpdater
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> updateProgress(android.content.Context r3, java.util.UUID r4, androidx.work.Data r5) {
            r2 = this;
            androidx.work.impl.utils.futures.SettableFuture r3 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r2.mTaskExecutor
            androidx.work.impl.utils.WorkProgressUpdater$1 r1 = new androidx.work.impl.utils.WorkProgressUpdater$1
            r1.<init>(r2, r4, r5, r3)
            r0.executeOnBackgroundThread(r1)
            return r3
    }
}
