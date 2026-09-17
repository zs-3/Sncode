package kotlinx.coroutines;

/* compiled from: CoroutineScope.kt */
/* loaded from: classes2.dex */
public final class GlobalScope implements kotlinx.coroutines.CoroutineScope {
    public static final kotlinx.coroutines.GlobalScope INSTANCE = null;

    static {
            kotlinx.coroutines.GlobalScope r0 = new kotlinx.coroutines.GlobalScope
            r0.<init>()
            kotlinx.coroutines.GlobalScope.INSTANCE = r0
            return
    }

    private GlobalScope() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            return r0
    }
}
