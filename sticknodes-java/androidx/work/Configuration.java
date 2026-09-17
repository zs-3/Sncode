package androidx.work;

/* loaded from: classes.dex */
public final class Configuration {
    final java.lang.String mDefaultProcessName;
    final androidx.work.InitializationExceptionHandler mExceptionHandler;
    final java.util.concurrent.Executor mExecutor;
    final androidx.work.InputMergerFactory mInputMergerFactory;
    private final boolean mIsUsingDefaultTaskExecutor;
    final int mLoggingLevel;
    final int mMaxJobSchedulerId;
    final int mMaxSchedulerLimit;
    final int mMinJobSchedulerId;
    final androidx.work.RunnableScheduler mRunnableScheduler;
    final java.util.concurrent.Executor mTaskExecutor;
    final androidx.work.WorkerFactory mWorkerFactory;


    public static final class Builder {
        java.lang.String mDefaultProcessName;
        androidx.work.InitializationExceptionHandler mExceptionHandler;
        java.util.concurrent.Executor mExecutor;
        androidx.work.InputMergerFactory mInputMergerFactory;
        int mLoggingLevel;
        int mMaxJobSchedulerId;
        int mMaxSchedulerLimit;
        int mMinJobSchedulerId;
        androidx.work.RunnableScheduler mRunnableScheduler;
        java.util.concurrent.Executor mTaskExecutor;
        androidx.work.WorkerFactory mWorkerFactory;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 4
                r1.mLoggingLevel = r0
                r0 = 0
                r1.mMinJobSchedulerId = r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.mMaxJobSchedulerId = r0
                r0 = 20
                r1.mMaxSchedulerLimit = r0
                return
        }

        public androidx.work.Configuration build() {
                r1 = this;
                androidx.work.Configuration r0 = new androidx.work.Configuration
                r0.<init>(r1)
                return r0
        }
    }

    public interface Provider {
        androidx.work.Configuration getWorkManagerConfiguration();
    }

    Configuration(androidx.work.Configuration.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.Executor r0 = r3.mExecutor
            r1 = 0
            if (r0 != 0) goto Lf
            java.util.concurrent.Executor r0 = r2.createDefaultExecutor(r1)
            r2.mExecutor = r0
            goto L11
        Lf:
            r2.mExecutor = r0
        L11:
            java.util.concurrent.Executor r0 = r3.mTaskExecutor
            if (r0 != 0) goto L1f
            r0 = 1
            r2.mIsUsingDefaultTaskExecutor = r0
            java.util.concurrent.Executor r0 = r2.createDefaultExecutor(r0)
            r2.mTaskExecutor = r0
            goto L23
        L1f:
            r2.mIsUsingDefaultTaskExecutor = r1
            r2.mTaskExecutor = r0
        L23:
            androidx.work.WorkerFactory r0 = r3.mWorkerFactory
            if (r0 != 0) goto L2e
            androidx.work.WorkerFactory r0 = androidx.work.WorkerFactory.getDefaultWorkerFactory()
            r2.mWorkerFactory = r0
            goto L30
        L2e:
            r2.mWorkerFactory = r0
        L30:
            androidx.work.InputMergerFactory r0 = r3.mInputMergerFactory
            if (r0 != 0) goto L3b
            androidx.work.InputMergerFactory r0 = androidx.work.InputMergerFactory.getDefaultInputMergerFactory()
            r2.mInputMergerFactory = r0
            goto L3d
        L3b:
            r2.mInputMergerFactory = r0
        L3d:
            androidx.work.RunnableScheduler r0 = r3.mRunnableScheduler
            if (r0 != 0) goto L49
            androidx.work.impl.DefaultRunnableScheduler r0 = new androidx.work.impl.DefaultRunnableScheduler
            r0.<init>()
            r2.mRunnableScheduler = r0
            goto L4b
        L49:
            r2.mRunnableScheduler = r0
        L4b:
            int r0 = r3.mLoggingLevel
            r2.mLoggingLevel = r0
            int r0 = r3.mMinJobSchedulerId
            r2.mMinJobSchedulerId = r0
            int r0 = r3.mMaxJobSchedulerId
            r2.mMaxJobSchedulerId = r0
            int r0 = r3.mMaxSchedulerLimit
            r2.mMaxSchedulerLimit = r0
            androidx.work.InitializationExceptionHandler r0 = r3.mExceptionHandler
            r2.mExceptionHandler = r0
            java.lang.String r3 = r3.mDefaultProcessName
            r2.mDefaultProcessName = r3
            return
    }

    private java.util.concurrent.Executor createDefaultExecutor(boolean r3) {
            r2 = this;
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 + (-1)
            r1 = 4
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            java.util.concurrent.ThreadFactory r3 = r2.createDefaultThreadFactory(r3)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newFixedThreadPool(r0, r3)
            return r3
    }

    private java.util.concurrent.ThreadFactory createDefaultThreadFactory(boolean r2) {
            r1 = this;
            androidx.work.Configuration$1 r0 = new androidx.work.Configuration$1
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.String getDefaultProcessName() {
            r1 = this;
            java.lang.String r0 = r1.mDefaultProcessName
            return r0
    }

    public androidx.work.InitializationExceptionHandler getExceptionHandler() {
            r1 = this;
            androidx.work.InitializationExceptionHandler r0 = r1.mExceptionHandler
            return r0
    }

    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mExecutor
            return r0
    }

    public androidx.work.InputMergerFactory getInputMergerFactory() {
            r1 = this;
            androidx.work.InputMergerFactory r0 = r1.mInputMergerFactory
            return r0
    }

    public int getMaxJobSchedulerId() {
            r1 = this;
            int r0 = r1.mMaxJobSchedulerId
            return r0
    }

    public int getMaxSchedulerLimit() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 != r1) goto Lb
            int r0 = r2.mMaxSchedulerLimit
            int r0 = r0 / 2
            return r0
        Lb:
            int r0 = r2.mMaxSchedulerLimit
            return r0
    }

    public int getMinJobSchedulerId() {
            r1 = this;
            int r0 = r1.mMinJobSchedulerId
            return r0
    }

    public int getMinimumLoggingLevel() {
            r1 = this;
            int r0 = r1.mLoggingLevel
            return r0
    }

    public androidx.work.RunnableScheduler getRunnableScheduler() {
            r1 = this;
            androidx.work.RunnableScheduler r0 = r1.mRunnableScheduler
            return r0
    }

    public java.util.concurrent.Executor getTaskExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mTaskExecutor
            return r0
    }

    public androidx.work.WorkerFactory getWorkerFactory() {
            r1 = this;
            androidx.work.WorkerFactory r0 = r1.mWorkerFactory
            return r0
    }
}
