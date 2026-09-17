package kotlinx.coroutines;

/* compiled from: ThreadContextElement.kt */
/* loaded from: classes2.dex */
public interface ThreadContextElement<S> extends kotlin.coroutines.CoroutineContext.Element {
    void restoreThreadContext(kotlin.coroutines.CoroutineContext r1, S r2);

    S updateThreadContext(kotlin.coroutines.CoroutineContext r1);
}
