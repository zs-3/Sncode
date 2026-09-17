package kotlinx.coroutines.intrinsics;

/* compiled from: Cancellable.kt */
/* loaded from: classes2.dex */
public final class CancellableKt {
    private static final void dispatcherFailure(kotlin.coroutines.Continuation<?> r1, java.lang.Throwable r2) {
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)
            r1.resumeWith(r0)
            throw r2
    }

    public static final void startCoroutineCancellable(kotlin.coroutines.Continuation<? super kotlin.Unit> r3, kotlin.coroutines.Continuation<?> r4) {
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)     // Catch: java.lang.Throwable -> L12
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L12
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)     // Catch: java.lang.Throwable -> L12
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith$default(r3, r0, r2, r1, r2)     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r3 = move-exception
            dispatcherFailure(r4, r3)
        L16:
            return
    }

    public static final <R, T> void startCoroutineCancellable(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r0, R r1, kotlin.coroutines.Continuation<? super T> r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(r0, r1, r2)     // Catch: java.lang.Throwable -> L14
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L14
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L14
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)     // Catch: java.lang.Throwable -> L14
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(r0, r1, r3)     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r0 = move-exception
            dispatcherFailure(r2, r0)
        L18:
            return
    }

    public static /* synthetic */ void startCoroutineCancellable$default(kotlin.jvm.functions.Function2 r0, java.lang.Object r1, kotlin.coroutines.Continuation r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            startCoroutineCancellable(r0, r1, r2, r3)
            return
    }
}
