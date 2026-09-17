package kotlinx.coroutines.scheduling;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
final class TaskContextImpl implements kotlinx.coroutines.scheduling.TaskContext {
    private final int taskMode;

    public TaskContextImpl(int r1) {
            r0 = this;
            r0.<init>()
            r0.taskMode = r1
            return
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public void afterTask() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public int getTaskMode() {
            r1 = this;
            int r0 = r1.taskMode
            return r0
    }
}
