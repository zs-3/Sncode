package kotlinx.coroutines.flow.internal;

/* compiled from: FlowExceptions.common.kt */
/* loaded from: classes2.dex */
public final class FlowExceptions_commonKt {
    public static final void checkOwnership(kotlinx.coroutines.flow.internal.AbortFlowException r1, kotlinx.coroutines.flow.FlowCollector<?> r2) {
            kotlinx.coroutines.flow.FlowCollector<?> r0 = r1.owner
            if (r0 != r2) goto L5
            return
        L5:
            throw r1
    }
}
