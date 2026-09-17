package kotlinx.coroutines.flow;

/* compiled from: Emitters.kt */
/* loaded from: classes2.dex */
public final class ThrowingCollector implements kotlinx.coroutines.flow.FlowCollector<java.lang.Object> {
    public final java.lang.Throwable e;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Throwable r1 = r0.e
            throw r1
    }
}
