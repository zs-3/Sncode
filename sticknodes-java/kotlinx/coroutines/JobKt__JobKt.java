package kotlinx.coroutines;

/* compiled from: Job.kt */
/* loaded from: classes2.dex */
final /* synthetic */ class JobKt__JobKt {
    public static final kotlinx.coroutines.CompletableJob Job(kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.JobImpl r0 = new kotlinx.coroutines.JobImpl
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob Job$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.JobKt.Job(r0)
            return r0
    }

    public static final void cancel(kotlin.coroutines.CoroutineContext r1, java.util.concurrent.CancellationException r2) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto Ld
            r1.cancel(r2)
        Ld:
            return
    }

    public static final void ensureActive(kotlin.coroutines.CoroutineContext r1) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto Ld
            kotlinx.coroutines.JobKt.ensureActive(r1)
        Ld:
            return
    }

    public static final void ensureActive(kotlinx.coroutines.Job r1) {
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.CancellationException r1 = r1.getCancellationException()
            throw r1
    }
}
