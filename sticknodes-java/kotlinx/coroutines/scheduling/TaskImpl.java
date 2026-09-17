package kotlinx.coroutines.scheduling;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class TaskImpl extends kotlinx.coroutines.scheduling.Task {
    public final java.lang.Runnable block;

    public TaskImpl(java.lang.Runnable r1, long r2, kotlinx.coroutines.scheduling.TaskContext r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.block = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.Runnable r0 = r2.block     // Catch: java.lang.Throwable -> Lb
            r0.run()     // Catch: java.lang.Throwable -> Lb
            kotlinx.coroutines.scheduling.TaskContext r0 = r2.taskContext
            r0.afterTask()
            return
        Lb:
            r0 = move-exception
            kotlinx.coroutines.scheduling.TaskContext r1 = r2.taskContext
            r1.afterTask()
            throw r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Task["
            r0.append(r1)
            java.lang.Runnable r1 = r4.block
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r1)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.Runnable r1 = r4.block
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.submissionTime
            r0.append(r2)
            r0.append(r1)
            kotlinx.coroutines.scheduling.TaskContext r1 = r4.taskContext
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
