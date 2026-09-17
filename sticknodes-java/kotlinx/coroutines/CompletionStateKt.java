package kotlinx.coroutines;

/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public final class CompletionStateKt {
    public static final <T> java.lang.Object recoverResult(java.lang.Object r0, kotlin.coroutines.Continuation<? super T> r1) {
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L13
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)
            goto L19
        L13:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)
        L19:
            return r0
    }

    public static final <T> java.lang.Object toState(java.lang.Object r3, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            java.lang.Throwable r0 = kotlin.Result.m73exceptionOrNullimpl(r3)
            if (r0 != 0) goto Lf
            if (r4 == 0) goto L17
            kotlinx.coroutines.CompletedWithCancellation r0 = new kotlinx.coroutines.CompletedWithCancellation
            r0.<init>(r3, r4)
            r3 = r0
            goto L17
        Lf:
            kotlinx.coroutines.CompletedExceptionally r3 = new kotlinx.coroutines.CompletedExceptionally
            r4 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r0, r4, r1, r2)
        L17:
            return r3
    }

    public static final <T> java.lang.Object toState(java.lang.Object r3, kotlinx.coroutines.CancellableContinuation<?> r4) {
            java.lang.Throwable r4 = kotlin.Result.m73exceptionOrNullimpl(r3)
            if (r4 != 0) goto L7
            goto Lf
        L7:
            kotlinx.coroutines.CompletedExceptionally r3 = new kotlinx.coroutines.CompletedExceptionally
            r0 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
        Lf:
            return r3
    }

    public static /* synthetic */ java.lang.Object toState$default(java.lang.Object r0, kotlin.jvm.functions.Function1 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.Object r0 = toState(r0, r1)
            return r0
    }
}
