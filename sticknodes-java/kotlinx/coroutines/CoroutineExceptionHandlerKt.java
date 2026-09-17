package kotlinx.coroutines;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes2.dex */
public final class CoroutineExceptionHandlerKt {
    public static final void handleCoroutineException(kotlin.coroutines.CoroutineContext r1, java.lang.Throwable r2) {
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key     // Catch: java.lang.Throwable -> L12
            kotlin.coroutines.CoroutineContext$Element r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L12
            kotlinx.coroutines.CoroutineExceptionHandler r0 = (kotlinx.coroutines.CoroutineExceptionHandler) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Le
            r0.handleException(r1, r2)     // Catch: java.lang.Throwable -> L12
            return
        Le:
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(r1, r2)
            return
        L12:
            r0 = move-exception
            java.lang.Throwable r2 = handlerException(r2, r0)
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(r1, r2)
            return
    }

    public static final java.lang.Throwable handlerException(java.lang.Throwable r2, java.lang.Throwable r3) {
            if (r2 != r3) goto L3
            return r2
        L3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Exception while trying to handle coroutine exception"
            r0.<init>(r1, r3)
            kotlin.ExceptionsKt.addSuppressed(r0, r2)
            return r0
    }
}
