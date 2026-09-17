package androidx.work;

/* loaded from: classes.dex */
public final class WorkerParameters {
    private java.util.concurrent.Executor mBackgroundExecutor;
    private androidx.work.ForegroundUpdater mForegroundUpdater;
    private java.util.UUID mId;
    private androidx.work.Data mInputData;
    private androidx.work.ProgressUpdater mProgressUpdater;
    private int mRunAttemptCount;
    private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
    private java.util.Set<java.lang.String> mTags;
    private androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;
    private androidx.work.WorkerFactory mWorkerFactory;

    public static class RuntimeExtras {
        public android.net.Network network;
        public java.util.List<java.lang.String> triggeredContentAuthorities;
        public java.util.List<android.net.Uri> triggeredContentUris;

        public RuntimeExtras() {
                r1 = this;
                r1.<init>()
                java.util.List r0 = java.util.Collections.emptyList()
                r1.triggeredContentAuthorities = r0
                java.util.List r0 = java.util.Collections.emptyList()
                r1.triggeredContentUris = r0
                return
        }
    }

    public WorkerParameters(java.util.UUID r1, androidx.work.Data r2, java.util.Collection<java.lang.String> r3, androidx.work.WorkerParameters.RuntimeExtras r4, int r5, java.util.concurrent.Executor r6, androidx.work.impl.utils.taskexecutor.TaskExecutor r7, androidx.work.WorkerFactory r8, androidx.work.ProgressUpdater r9, androidx.work.ForegroundUpdater r10) {
            r0 = this;
            r0.<init>()
            r0.mId = r1
            r0.mInputData = r2
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
            r0.mTags = r1
            r0.mRuntimeExtras = r4
            r0.mRunAttemptCount = r5
            r0.mBackgroundExecutor = r6
            r0.mWorkTaskExecutor = r7
            r0.mWorkerFactory = r8
            r0.mProgressUpdater = r9
            r0.mForegroundUpdater = r10
            return
    }

    public java.util.concurrent.Executor getBackgroundExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mBackgroundExecutor
            return r0
    }

    public androidx.work.ForegroundUpdater getForegroundUpdater() {
            r1 = this;
            androidx.work.ForegroundUpdater r0 = r1.mForegroundUpdater
            return r0
    }

    public java.util.UUID getId() {
            r1 = this;
            java.util.UUID r0 = r1.mId
            return r0
    }

    public androidx.work.Data getInputData() {
            r1 = this;
            androidx.work.Data r0 = r1.mInputData
            return r0
    }

    public android.net.Network getNetwork() {
            r1 = this;
            androidx.work.WorkerParameters$RuntimeExtras r0 = r1.mRuntimeExtras
            android.net.Network r0 = r0.network
            return r0
    }

    public androidx.work.ProgressUpdater getProgressUpdater() {
            r1 = this;
            androidx.work.ProgressUpdater r0 = r1.mProgressUpdater
            return r0
    }

    public int getRunAttemptCount() {
            r1 = this;
            int r0 = r1.mRunAttemptCount
            return r0
    }

    public java.util.Set<java.lang.String> getTags() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mTags
            return r0
    }

    public androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
            r1 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            return r0
    }

    public java.util.List<java.lang.String> getTriggeredContentAuthorities() {
            r1 = this;
            androidx.work.WorkerParameters$RuntimeExtras r0 = r1.mRuntimeExtras
            java.util.List<java.lang.String> r0 = r0.triggeredContentAuthorities
            return r0
    }

    public java.util.List<android.net.Uri> getTriggeredContentUris() {
            r1 = this;
            androidx.work.WorkerParameters$RuntimeExtras r0 = r1.mRuntimeExtras
            java.util.List<android.net.Uri> r0 = r0.triggeredContentUris
            return r0
    }

    public androidx.work.WorkerFactory getWorkerFactory() {
            r1 = this;
            androidx.work.WorkerFactory r0 = r1.mWorkerFactory
            return r0
    }
}
