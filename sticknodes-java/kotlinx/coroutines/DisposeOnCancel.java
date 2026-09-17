package kotlinx.coroutines;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes2.dex */
final class DisposeOnCancel extends kotlinx.coroutines.CancelHandler {
    private final kotlinx.coroutines.DisposableHandle handle;

    public DisposeOnCancel(kotlinx.coroutines.DisposableHandle r1) {
            r0 = this;
            r0.<init>()
            r0.handle = r1
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

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable r1) {
            r0 = this;
            kotlinx.coroutines.DisposableHandle r1 = r0.handle
            r1.dispose()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DisposeOnCancel["
            r0.append(r1)
            kotlinx.coroutines.DisposableHandle r1 = r2.handle
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
