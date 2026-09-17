package kotlinx.coroutines;

/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
class DeferredCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> implements kotlinx.coroutines.Deferred<T> {
    public DeferredCoroutine(kotlin.coroutines.CoroutineContext r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getCompletedInternal$kotlinx_coroutines_core()
            return r0
    }
}
