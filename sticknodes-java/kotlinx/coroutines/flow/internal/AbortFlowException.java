package kotlinx.coroutines.flow.internal;

/* compiled from: FlowExceptions.kt */
/* loaded from: classes2.dex */
public final class AbortFlowException extends java.util.concurrent.CancellationException {
    public final transient kotlinx.coroutines.flow.FlowCollector<?> owner;

    public AbortFlowException(kotlinx.coroutines.flow.FlowCollector<?> r2) {
            r1 = this;
            java.lang.String r0 = "Flow was aborted, no more elements needed"
            r1.<init>(r0)
            r1.owner = r2
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
}
