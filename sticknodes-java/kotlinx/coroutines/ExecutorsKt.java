package kotlinx.coroutines;

/* compiled from: Executors.kt */
/* loaded from: classes2.dex */
public final class ExecutorsKt {
    public static final kotlinx.coroutines.CoroutineDispatcher from(java.util.concurrent.Executor r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.DispatcherExecutor
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.DispatcherExecutor r0 = (kotlinx.coroutines.DispatcherExecutor) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lf
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.dispatcher
            if (r0 != 0) goto L14
        Lf:
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r0 = new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            r0.<init>(r1)
        L14:
            return r0
    }
}
