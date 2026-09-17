package kotlinx.coroutines;

/* compiled from: ThreadContextElement.kt */
/* loaded from: classes2.dex */
public interface CopyableThreadContextElement<S> extends kotlinx.coroutines.ThreadContextElement<S> {
    kotlinx.coroutines.CopyableThreadContextElement<S> copyForChild();

    kotlin.coroutines.CoroutineContext mergeForChild(kotlin.coroutines.CoroutineContext.Element r1);
}
