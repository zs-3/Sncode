package kotlin.coroutines;

/* compiled from: Continuation.kt */
/* loaded from: classes2.dex */
public interface Continuation<T> {
    kotlin.coroutines.CoroutineContext getContext();

    void resumeWith(java.lang.Object r1);
}
