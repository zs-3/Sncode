package androidx.work.impl.utils.taskexecutor;

/* loaded from: classes.dex */
public interface TaskExecutor {
    void executeOnBackgroundThread(java.lang.Runnable r1);

    androidx.work.impl.utils.SerialExecutor getBackgroundExecutor();

    java.util.concurrent.Executor getMainThreadExecutor();
}
