package kotlinx.coroutines.flow;

/* compiled from: Emitters.kt */
/* loaded from: classes2.dex */
final /* synthetic */ class FlowKt__EmittersKt {
    public static final void ensureActive(kotlinx.coroutines.flow.FlowCollector<?> r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.ThrowingCollector
            if (r0 != 0) goto L5
            return
        L5:
            kotlinx.coroutines.flow.ThrowingCollector r1 = (kotlinx.coroutines.flow.ThrowingCollector) r1
            java.lang.Throwable r1 = r1.e
            throw r1
    }
}
