package kotlinx.coroutines;

/* compiled from: Executors.kt */
/* loaded from: classes2.dex */
final class DispatcherExecutor implements java.util.concurrent.Executor {
    public final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r3) {
            r2 = this;
            kotlinx.coroutines.CoroutineDispatcher r0 = r2.dispatcher
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            boolean r0 = r0.isDispatchNeeded(r1)
            if (r0 == 0) goto L10
            kotlinx.coroutines.CoroutineDispatcher r0 = r2.dispatcher
            r0.mo128dispatch(r1, r3)
            goto L13
        L10:
            r3.run()
        L13:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            java.lang.String r0 = r0.toString()
            return r0
    }
}
