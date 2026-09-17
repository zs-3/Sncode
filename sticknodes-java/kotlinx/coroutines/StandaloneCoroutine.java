package kotlinx.coroutines;

/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
class StandaloneCoroutine extends kotlinx.coroutines.AbstractCoroutine<kotlin.Unit> {
    public StandaloneCoroutine(kotlin.coroutines.CoroutineContext r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean handleJobException(java.lang.Throwable r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r2)
            r2 = 1
            return r2
    }
}
