package kotlinx.coroutines;

/* compiled from: CompletableDeferred.kt */
/* loaded from: classes2.dex */
public final class CompletableDeferredKt {
    public static final <T> kotlinx.coroutines.CompletableDeferred<T> CompletableDeferred(kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.CompletableDeferredImpl r0 = new kotlinx.coroutines.CompletableDeferredImpl
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableDeferred CompletableDeferred$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.CompletableDeferred r0 = CompletableDeferred(r0)
            return r0
    }

    public static final <T> boolean completeWith(kotlinx.coroutines.CompletableDeferred<T> r1, java.lang.Object r2) {
            java.lang.Throwable r0 = kotlin.Result.m73exceptionOrNullimpl(r2)
            if (r0 != 0) goto Lb
            boolean r1 = r1.complete(r2)
            goto Lf
        Lb:
            boolean r1 = r1.completeExceptionally(r0)
        Lf:
            return r1
    }
}
