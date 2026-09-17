package kotlinx.coroutines.flow.internal;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes2.dex */
public abstract class AbstractSharedFlowSlot<F> {
    public AbstractSharedFlowSlot() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean allocateLocked(F r1);

    public abstract kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked(F r1);
}
