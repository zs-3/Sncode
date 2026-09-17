package kotlinx.coroutines;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes2.dex */
public interface CancellableContinuation<T> extends kotlin.coroutines.Continuation<T> {

    /* compiled from: CancellableContinuation.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(kotlinx.coroutines.CancellableContinuation r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.cancel(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }
    }

    boolean cancel(java.lang.Throwable r1);

    void completeResume(java.lang.Object r1);

    void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r1);

    void resume(T r1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2);

    java.lang.Object tryResume(T r1, java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3);
}
