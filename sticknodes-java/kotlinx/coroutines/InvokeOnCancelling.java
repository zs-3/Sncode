package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
final class InvokeOnCancelling extends kotlinx.coroutines.JobCancellingNode {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _invoked$FU = null;
    private volatile int _invoked;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> handler;

    static {
            java.lang.Class<kotlinx.coroutines.InvokeOnCancelling> r0 = kotlinx.coroutines.InvokeOnCancelling.class
            java.lang.String r1 = "_invoked"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.InvokeOnCancelling._invoked$FU = r0
            return
    }

    public InvokeOnCancelling(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.invoke2(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.InvokeOnCancelling._invoked$FU
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto Lf
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r3.handler
            r0.invoke(r4)
        Lf:
            return
    }
}
