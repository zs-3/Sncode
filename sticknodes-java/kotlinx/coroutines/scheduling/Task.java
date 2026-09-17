package kotlinx.coroutines.scheduling;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public abstract class Task implements java.lang.Runnable {
    public long submissionTime;
    public kotlinx.coroutines.scheduling.TaskContext taskContext;

    public Task() {
            r3 = this;
            kotlinx.coroutines.scheduling.TaskContext r0 = kotlinx.coroutines.scheduling.TasksKt.NonBlockingContext
            r1 = 0
            r3.<init>(r1, r0)
            return
    }

    public Task(long r1, kotlinx.coroutines.scheduling.TaskContext r3) {
            r0 = this;
            r0.<init>()
            r0.submissionTime = r1
            r0.taskContext = r3
            return
    }
}
