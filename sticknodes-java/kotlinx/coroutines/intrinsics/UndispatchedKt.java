package kotlinx.coroutines.intrinsics;

/* compiled from: Undispatched.kt */
/* loaded from: classes2.dex */
public final class UndispatchedKt {
    public static final <R, T> void startCoroutineUndispatched(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, R r4, kotlin.coroutines.Continuation<? super T> r5) {
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r5)
            kotlin.coroutines.CoroutineContext r5 = r5.getContext()     // Catch: java.lang.Throwable -> L30
            r1 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r5, r1)     // Catch: java.lang.Throwable -> L30
            r2 = 2
            java.lang.Object r3 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r2)     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r3.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2b
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r1)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 == r4) goto L3e
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m72constructorimpl(r3)
            r0.resumeWith(r3)
            goto L3e
        L2b:
            r3 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r1)     // Catch: java.lang.Throwable -> L30
            throw r3     // Catch: java.lang.Throwable -> L30
        L30:
            r3 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m72constructorimpl(r3)
            r0.resumeWith(r3)
        L3e:
            return
    }

    public static final <T, R> java.lang.Object startUndispatchedOrReturn(kotlinx.coroutines.internal.ScopeCoroutine<? super T> r3, R r4, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5) {
            r0 = 2
            java.lang.Object r5 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r5, r0)     // Catch: java.lang.Throwable -> Lc
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r4 = r5.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lc
            goto L15
        Lc:
            r4 = move-exception
            kotlinx.coroutines.CompletedExceptionally r5 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r2 = 0
            r5.<init>(r4, r1, r0, r2)
            r4 = r5
        L15:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L20
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L35
        L20:
            java.lang.Object r3 = r3.makeCompletingOnce$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r3 != r4) goto L2d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L35
        L2d:
            boolean r4 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r4 != 0) goto L36
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r3)
        L35:
            return r3
        L36:
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            throw r3
    }
}
