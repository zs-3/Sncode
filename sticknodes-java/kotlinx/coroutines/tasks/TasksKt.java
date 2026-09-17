package kotlinx.coroutines.tasks;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class TasksKt {
    public static final <T> java.lang.Object await(com.google.android.gms.tasks.Task<T> r1, kotlin.coroutines.Continuation<? super T> r2) {
            r0 = 0
            java.lang.Object r1 = awaitImpl(r1, r0, r2)
            return r1
    }

    private static final <T> java.lang.Object awaitImpl(com.google.android.gms.tasks.Task<T> r3, com.google.android.gms.tasks.CancellationTokenSource r4, kotlin.coroutines.Continuation<? super T> r5) {
            boolean r0 = r3.isComplete()
            if (r0 == 0) goto L34
            java.lang.Exception r4 = r3.getException()
            if (r4 != 0) goto L33
            boolean r4 = r3.isCanceled()
            if (r4 != 0) goto L17
            java.lang.Object r3 = r3.getResult()
            return r3
        L17:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Task "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " was cancelled normally."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L33:
            throw r4
        L34:
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            kotlinx.coroutines.tasks.DirectExecutor r1 = kotlinx.coroutines.tasks.DirectExecutor.INSTANCE
            kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1 r2 = new kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
            r2.<init>(r0)
            r3.addOnCompleteListener(r1, r2)
            if (r4 == 0) goto L55
            kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2 r3 = new kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
            r3.<init>(r4)
            r0.invokeOnCancellation(r3)
        L55:
            java.lang.Object r3 = r0.getResult()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L62
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L62:
            return r3
    }
}
