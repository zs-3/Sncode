package kotlinx.coroutines.tasks;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
final class DirectExecutor implements java.util.concurrent.Executor {
    public static final kotlinx.coroutines.tasks.DirectExecutor INSTANCE = null;

    static {
            kotlinx.coroutines.tasks.DirectExecutor r0 = new kotlinx.coroutines.tasks.DirectExecutor
            r0.<init>()
            kotlinx.coroutines.tasks.DirectExecutor.INSTANCE = r0
            return
    }

    private DirectExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }
}
