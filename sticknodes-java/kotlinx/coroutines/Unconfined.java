package kotlinx.coroutines;

/* compiled from: Unconfined.kt */
/* loaded from: classes2.dex */
public final class Unconfined extends kotlinx.coroutines.CoroutineDispatcher {
    public static final kotlinx.coroutines.Unconfined INSTANCE = null;

    static {
            kotlinx.coroutines.Unconfined r0 = new kotlinx.coroutines.Unconfined
            r0.<init>()
            kotlinx.coroutines.Unconfined.INSTANCE = r0
            return
    }

    private Unconfined() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo128dispatch(kotlin.coroutines.CoroutineContext r1, java.lang.Runnable r2) {
            r0 = this;
            kotlinx.coroutines.YieldContext$Key r2 = kotlinx.coroutines.YieldContext.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.YieldContext r1 = (kotlinx.coroutines.YieldContext) r1
            if (r1 == 0) goto Le
            r2 = 1
            r1.dispatcherWasUnconfined = r2
            return
        Le:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Unconfined"
            return r0
    }
}
