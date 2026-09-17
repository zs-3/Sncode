package androidx.work;

/* loaded from: classes.dex */
public interface RunnableScheduler {
    void cancel(java.lang.Runnable r1);

    void scheduleWithDelay(long r1, java.lang.Runnable r3);
}
