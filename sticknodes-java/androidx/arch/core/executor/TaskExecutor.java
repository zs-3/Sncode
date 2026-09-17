package androidx.arch.core.executor;

/* loaded from: classes.dex */
public abstract class TaskExecutor {
    public TaskExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void executeOnDiskIO(java.lang.Runnable r1);

    public abstract boolean isMainThread();

    public abstract void postToMainThread(java.lang.Runnable r1);
}
