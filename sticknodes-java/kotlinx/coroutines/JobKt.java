package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class JobKt {
    public static final kotlinx.coroutines.CompletableJob Job(kotlinx.coroutines.Job r0) {
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.JobKt__JobKt.Job(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob Job$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.JobKt__JobKt.Job$default(r0, r1, r2)
            return r0
    }

    public static final void cancel(kotlin.coroutines.CoroutineContext r0, java.util.concurrent.CancellationException r1) {
            kotlinx.coroutines.JobKt__JobKt.cancel(r0, r1)
            return
    }

    public static final void ensureActive(kotlin.coroutines.CoroutineContext r0) {
            kotlinx.coroutines.JobKt__JobKt.ensureActive(r0)
            return
    }

    public static final void ensureActive(kotlinx.coroutines.Job r0) {
            kotlinx.coroutines.JobKt__JobKt.ensureActive(r0)
            return
    }
}
