package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class WorkForegroundUpdater implements androidx.work.ForegroundUpdater {
    private static final java.lang.String TAG = null;
    final androidx.work.impl.foreground.ForegroundProcessor mForegroundProcessor;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final androidx.work.impl.model.WorkSpecDao mWorkSpecDao;


    static {
            java.lang.String r0 = "WMFgUpdater"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.WorkForegroundUpdater.TAG = r0
            return
    }

    public WorkForegroundUpdater(androidx.work.impl.WorkDatabase r1, androidx.work.impl.foreground.ForegroundProcessor r2, androidx.work.impl.utils.taskexecutor.TaskExecutor r3) {
            r0 = this;
            r0.<init>()
            r0.mForegroundProcessor = r2
            r0.mTaskExecutor = r3
            androidx.work.impl.model.WorkSpecDao r1 = r1.workSpecDao()
            r0.mWorkSpecDao = r1
            return
    }

    @Override // androidx.work.ForegroundUpdater
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(android.content.Context r10, java.util.UUID r11, androidx.work.ForegroundInfo r12) {
            r9 = this;
            androidx.work.impl.utils.futures.SettableFuture r6 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r7 = r9.mTaskExecutor
            androidx.work.impl.utils.WorkForegroundUpdater$1 r8 = new androidx.work.impl.utils.WorkForegroundUpdater$1
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r11
            r4 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r7.executeOnBackgroundThread(r8)
            return r6
    }
}
