package kotlinx.coroutines.internal;

/* compiled from: Scopes.kt */
/* loaded from: classes2.dex */
public final class ContextScope implements kotlinx.coroutines.CoroutineScope {
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    public ContextScope(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            r0.<init>()
            r0.coroutineContext = r1
            return
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.coroutineContext
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CoroutineScope(coroutineContext="
            r0.append(r1)
            kotlin.coroutines.CoroutineContext r1 = r2.getCoroutineContext()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
