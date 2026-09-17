package kotlinx.coroutines.internal;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes2.dex */
public final class DiagnosticCoroutineContextException extends java.lang.RuntimeException {
    private final transient kotlin.coroutines.CoroutineContext context;

    public DiagnosticCoroutineContextException(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    @Override // java.lang.Throwable
    public java.lang.String getLocalizedMessage() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            java.lang.String r0 = r0.toString()
            return r0
    }
}
