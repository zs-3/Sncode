package kotlinx.coroutines.internal;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* loaded from: classes2.dex */
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void handleUncaughtCoroutineException(kotlin.coroutines.CoroutineContext r2, java.lang.Throwable r3) {
            java.util.Collection r0 = kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.getPlatformExceptionHandlers()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            r1.handleException(r2, r3)     // Catch: java.lang.Throwable -> L18
            goto L8
        L18:
            r1 = move-exception
            java.lang.Throwable r1 = kotlinx.coroutines.CoroutineExceptionHandlerKt.handlerException(r3, r1)
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(r1)
            goto L8
        L21:
            kotlinx.coroutines.internal.DiagnosticCoroutineContextException r0 = new kotlinx.coroutines.internal.DiagnosticCoroutineContextException     // Catch: java.lang.Throwable -> L29
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L29
            kotlin.ExceptionsKt.addSuppressed(r3, r0)     // Catch: java.lang.Throwable -> L29
        L29:
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(r3)
            return
    }
}
